
package xella.protocol;


public class Message {

    private MessageHeader header;

    Message(MessageHeader header) {
	this.header = header;
    }

    public int getHops() {
	return header.getHops();
    }

    protected MessageHeader getHeader() {
	return this.header;
    }

    public String toString() {
	return "Message: " + header.toString();
    }
}
