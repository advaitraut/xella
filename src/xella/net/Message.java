
package xella.net;

import java.io.*;

public abstract class Message {

    private GnutellaConnection receivedFrom;
    private MessageHeader header;

    /**
     * Use null for receivedFrom for messages that has no originator
     *( i.e. not received from a connection, created new)
     */
    Message(GnutellaConnection receivedFrom,
	    MessageHeader      header) {
	this.receivedFrom = receivedFrom;
	this.header = header;
    }

    public byte[] getDescriptorId() {
	return header.getDescriptorId();
    }

    public int getHops() {
	return header.getHops();
    }

    public int getTTL() {
	return header.getTTL();
    }

    public boolean receivedFrom(GnutellaConnection connection) {
	if (receivedFrom == null) {
	    return connection == null;
	} else {
	    return receivedFrom.equals(connection);
	}
    }

    public abstract void send(GnutellaOutputStream out) throws IOException;


    /**
     * Increase hops and decrease TTL of message
     */
    public void age() {
	getHeader().age();
    }
    
    /**
     * Mark message as dropped
     */
    public void drop() {
    }

    protected MessageHeader getHeader() {
	return this.header;
    }

    public String toString() {
	return "Message: " + header.toString();
    }
}
