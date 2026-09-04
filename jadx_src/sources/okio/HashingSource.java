package okio;

import com.tencent.qcloud.core.auth.AuthConstants;
import dl.d;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.k;
import kotlin.s0;
import xh.h;
import xh.m;

/* JADX INFO: compiled from: HashingSource.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0017\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u001f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\r\u0010\n\u001a\u00020\bH\u0007¢\u0006\u0002\b\u0010J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0012H\u0016R\u0011\u0010\n\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lokio/HashingSource;", "Lokio/ForwardingSource;", "source", "Lokio/Source;", "algorithm", "", "(Lokio/Source;Ljava/lang/String;)V", "key", "Lokio/ByteString;", "(Lokio/Source;Lokio/ByteString;Ljava/lang/String;)V", "hash", "()Lokio/ByteString;", "mac", "Ljavax/crypto/Mac;", "messageDigest", "Ljava/security/MessageDigest;", "-deprecated_hash", "read", "", "sink", "Lokio/Buffer;", "byteCount", "Companion", "okio"}, k = 1, mv = {1, 4, 0})
public final class HashingSource extends ForwardingSource {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Mac mac;
    private final MessageDigest messageDigest;

    /* JADX INFO: compiled from: HashingSource.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u000f"}, d2 = {"Lokio/HashingSource$Companion;", "", "()V", "hmacSha1", "Lokio/HashingSource;", "source", "Lokio/Source;", "key", "Lokio/ByteString;", "hmacSha256", "hmacSha512", "md5", AuthConstants.SHA1, "sha256", "sha512", "okio"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        @d
        @m
        public final HashingSource hmacSha1(@d Source source, @d ByteString key) {
            f0.p(source, "source");
            f0.p(key, "key");
            return new HashingSource(source, key, "HmacSHA1");
        }

        @d
        @m
        public final HashingSource hmacSha256(@d Source source, @d ByteString key) {
            f0.p(source, "source");
            f0.p(key, "key");
            return new HashingSource(source, key, "HmacSHA256");
        }

        @d
        @m
        public final HashingSource hmacSha512(@d Source source, @d ByteString key) {
            f0.p(source, "source");
            f0.p(key, "key");
            return new HashingSource(source, key, "HmacSHA512");
        }

        @d
        @m
        public final HashingSource md5(@d Source source) {
            f0.p(source, "source");
            return new HashingSource(source, "MD5");
        }

        @d
        @m
        public final HashingSource sha1(@d Source source) {
            f0.p(source, "source");
            return new HashingSource(source, "SHA-1");
        }

        @d
        @m
        public final HashingSource sha256(@d Source source) {
            f0.p(source, "source");
            return new HashingSource(source, "SHA-256");
        }

        @d
        @m
        public final HashingSource sha512(@d Source source) {
            f0.p(source, "source");
            return new HashingSource(source, "SHA-512");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashingSource(@d Source source, @d String algorithm) {
        super(source);
        f0.p(source, "source");
        f0.p(algorithm, "algorithm");
        this.messageDigest = MessageDigest.getInstance(algorithm);
        this.mac = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashingSource(@d Source source, @d ByteString key, @d String algorithm) throws NoSuchAlgorithmException {
        super(source);
        f0.p(source, "source");
        f0.p(key, "key");
        f0.p(algorithm, "algorithm");
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.toByteArray(), algorithm));
            b2 b2Var = b2.f124493a;
            this.mac = mac;
            this.messageDigest = null;
        } catch (InvalidKeyException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    @d
    @m
    public static final HashingSource hmacSha1(@d Source source, @d ByteString byteString) {
        return INSTANCE.hmacSha1(source, byteString);
    }

    @d
    @m
    public static final HashingSource hmacSha256(@d Source source, @d ByteString byteString) {
        return INSTANCE.hmacSha256(source, byteString);
    }

    @d
    @m
    public static final HashingSource hmacSha512(@d Source source, @d ByteString byteString) {
        return INSTANCE.hmacSha512(source, byteString);
    }

    @d
    @m
    public static final HashingSource md5(@d Source source) {
        return INSTANCE.md5(source);
    }

    @d
    @m
    public static final HashingSource sha1(@d Source source) {
        return INSTANCE.sha1(source);
    }

    @d
    @m
    public static final HashingSource sha256(@d Source source) {
        return INSTANCE.sha256(source);
    }

    @d
    @m
    public static final HashingSource sha512(@d Source source) {
        return INSTANCE.sha512(source);
    }

    @d
    @k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "hash", imports = {}))
    @h(name = "-deprecated_hash")
    /* JADX INFO: renamed from: -deprecated_hash, reason: not valid java name */
    public final ByteString m812deprecated_hash() {
        return hash();
    }

    @d
    @h(name = "hash")
    public final ByteString hash() {
        byte[] result;
        MessageDigest messageDigest = this.messageDigest;
        if (messageDigest != null) {
            result = messageDigest.digest();
        } else {
            Mac mac = this.mac;
            f0.m(mac);
            result = mac.doFinal();
        }
        f0.o(result, "result");
        return new ByteString(result);
    }

    @Override // okio.ForwardingSource, okio.Source
    public long read(@d Buffer sink, long byteCount) throws IOException {
        f0.p(sink, "sink");
        long j10 = super.read(sink, byteCount);
        if (j10 != -1) {
            long size = sink.size() - j10;
            long size2 = sink.size();
            Segment segment = sink.head;
            f0.m(segment);
            while (size2 > size) {
                segment = segment.prev;
                f0.m(segment);
                size2 -= (long) (segment.limit - segment.pos);
            }
            while (size2 < sink.size()) {
                int i10 = (int) ((((long) segment.pos) + size) - size2);
                MessageDigest messageDigest = this.messageDigest;
                if (messageDigest != null) {
                    messageDigest.update(segment.data, i10, segment.limit - i10);
                } else {
                    Mac mac = this.mac;
                    f0.m(mac);
                    mac.update(segment.data, i10, segment.limit - i10);
                }
                size2 += (long) (segment.limit - segment.pos);
                segment = segment.next;
                f0.m(segment);
                size = size2;
            }
        }
        return j10;
    }
}
