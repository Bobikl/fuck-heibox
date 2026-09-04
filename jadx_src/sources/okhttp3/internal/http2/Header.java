package okhttp3.internal.http2;

import dl.d;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import okio.ByteString;
import xh.e;

/* JADX INFO: compiled from: Header.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0006\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0006\u0012\u0006\u0010\u0004\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000b\u001a\u00020\u0006HÆ\u0003J\t\u0010\f\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00062\b\b\u0002\u0010\u0004\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\nHÖ\u0001J\b\u0010\u0012\u001a\u00020\u0003H\u0016R\u0010\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lokhttp3/internal/http2/Header;", "", "name", "", "value", "(Ljava/lang/String;Ljava/lang/String;)V", "Lokio/ByteString;", "(Lokio/ByteString;Ljava/lang/String;)V", "(Lokio/ByteString;Lokio/ByteString;)V", "hpackSize", "", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "okhttp"}, k = 1, mv = {1, 4, 0})
public final /* data */ class Header {

    @d
    @e
    public static final ByteString PSEUDO_PREFIX;

    @d
    @e
    public static final ByteString RESPONSE_STATUS;

    @d
    public static final String RESPONSE_STATUS_UTF8 = ":status";

    @d
    @e
    public static final ByteString TARGET_AUTHORITY;

    @d
    public static final String TARGET_AUTHORITY_UTF8 = ":authority";

    @d
    @e
    public static final ByteString TARGET_METHOD;

    @d
    public static final String TARGET_METHOD_UTF8 = ":method";

    @d
    @e
    public static final ByteString TARGET_PATH;

    @d
    public static final String TARGET_PATH_UTF8 = ":path";

    @d
    @e
    public static final ByteString TARGET_SCHEME;

    @d
    public static final String TARGET_SCHEME_UTF8 = ":scheme";

    @e
    public final int hpackSize;

    @d
    @e
    public final ByteString name;

    @d
    @e
    public final ByteString value;

    static {
        ByteString.Companion companion = ByteString.INSTANCE;
        PSEUDO_PREFIX = companion.encodeUtf8(":");
        RESPONSE_STATUS = companion.encodeUtf8(":status");
        TARGET_METHOD = companion.encodeUtf8(TARGET_METHOD_UTF8);
        TARGET_PATH = companion.encodeUtf8(TARGET_PATH_UTF8);
        TARGET_SCHEME = companion.encodeUtf8(TARGET_SCHEME_UTF8);
        TARGET_AUTHORITY = companion.encodeUtf8(TARGET_AUTHORITY_UTF8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Header(@d String name, @d String value) {
        f0.p(name, "name");
        f0.p(value, "value");
        ByteString.Companion companion = ByteString.INSTANCE;
        this(companion.encodeUtf8(name), companion.encodeUtf8(value));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(@d ByteString name, @d String value) {
        this(name, ByteString.INSTANCE.encodeUtf8(value));
        f0.p(name, "name");
        f0.p(value, "value");
    }

    public Header(@d ByteString name, @d ByteString value) {
        f0.p(name, "name");
        f0.p(value, "value");
        this.name = name;
        this.value = value;
        this.hpackSize = name.size() + 32 + value.size();
    }

    public static /* synthetic */ Header copy$default(Header header, ByteString byteString, ByteString byteString2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            byteString = header.name;
        }
        if ((i10 & 2) != 0) {
            byteString2 = header.value;
        }
        return header.copy(byteString, byteString2);
    }

    @d
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ByteString getName() {
        return this.name;
    }

    @d
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ByteString getValue() {
        return this.value;
    }

    @d
    public final Header copy(@d ByteString name, @d ByteString value) {
        f0.p(name, "name");
        f0.p(value, "value");
        return new Header(name, value);
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Header)) {
            return false;
        }
        Header header = (Header) other;
        return f0.g(this.name, header.name) && f0.g(this.value, header.value);
    }

    public int hashCode() {
        ByteString byteString = this.name;
        int iHashCode = (byteString != null ? byteString.hashCode() : 0) * 31;
        ByteString byteString2 = this.value;
        return iHashCode + (byteString2 != null ? byteString2.hashCode() : 0);
    }

    @d
    public String toString() {
        return this.name.utf8() + ": " + this.value.utf8();
    }
}
