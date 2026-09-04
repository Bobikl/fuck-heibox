package androidx.p001datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public class InvalidProtocolBufferException extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private z1 f22314b;

    public static class InvalidWireTypeException extends InvalidProtocolBufferException {
        private static final long serialVersionUID = 3283890091615336259L;

        public InvalidWireTypeException(String str) {
            super(str);
        }
    }

    public InvalidProtocolBufferException(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f22314b = null;
    }

    public InvalidProtocolBufferException(String str) {
        super(str);
        this.f22314b = null;
    }

    public InvalidProtocolBufferException(String str, IOException iOException) {
        super(str, iOException);
        this.f22314b = null;
    }

    static InvalidProtocolBufferException b() {
        return new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
    }

    static InvalidProtocolBufferException c() {
        return new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    static InvalidProtocolBufferException d() {
        return new InvalidProtocolBufferException("Protocol message had invalid UTF-8.");
    }

    static InvalidWireTypeException e() {
        return new InvalidWireTypeException("Protocol message tag had invalid wire type.");
    }

    static InvalidProtocolBufferException f() {
        return new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }

    static InvalidProtocolBufferException g() {
        return new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static InvalidProtocolBufferException h() {
        return new InvalidProtocolBufferException("Failed to parse the message.");
    }

    static InvalidProtocolBufferException i() {
        return new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    static InvalidProtocolBufferException k() {
        return new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static InvalidProtocolBufferException l() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public z1 a() {
        return this.f22314b;
    }

    public InvalidProtocolBufferException j(z1 z1Var) {
        this.f22314b = z1Var;
        return this;
    }

    public IOException m() {
        return getCause() instanceof IOException ? (IOException) getCause() : this;
    }
}
