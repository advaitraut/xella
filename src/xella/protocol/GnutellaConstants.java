

package xella.protocol;

/**
 * This class contains Gnutella protocol constants
 *
 */

class GnutellaConstants {

    public static final int TTL = 7;

    public static final String CONNECT_MSG = "GNUTELLA CONNECT/0.4";
    public static final String CONNECT_OK_REPLY = "GNUTELLA OK";
    
    public static final int PAYLOAD_PING = 0x00;
    public static final int PAYLOAD_PONG = 0x01;
    public static final int PAYLOAD_PUSH = 0x40;
    public static final int PAYLOAD_QUERY = 0x80;
    public static final int PAYLOAD_QUERY_HIT = 0x81;

    public static final int DESCRIPTOR_HEADER_LENGTH = 23;
    public static final int PONG_BODY_LENGTH = 14;
}
