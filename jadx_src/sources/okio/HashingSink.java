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

/* JADX INFO: compiled from: HashingSink.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0019\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017B!\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0018\u001a\u00020\b\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0019J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u000f\u0010\u000b\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\n¨\u0006\u001b"}, d2 = {"Lokio/HashingSink;", "Lokio/ForwardingSink;", "Lokio/Buffer;", "source", "", "byteCount", "Lkotlin/b2;", "write", "Lokio/ByteString;", "-deprecated_hash", "()Lokio/ByteString;", "hash", "Ljava/security/MessageDigest;", "messageDigest", "Ljava/security/MessageDigest;", "Ljavax/crypto/Mac;", "mac", "Ljavax/crypto/Mac;", "Lokio/Sink;", "sink", "", "algorithm", "<init>", "(Lokio/Sink;Ljava/lang/String;)V", "key", "(Lokio/Sink;Lokio/ByteString;Ljava/lang/String;)V", "Companion", "okio"}, k = 1, mv = {1, 4, 0})
public final class HashingSink extends ForwardingSink {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Mac mac;
    private final MessageDigest messageDigest;

    /* JADX INFO: compiled from: HashingSink.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u000f"}, d2 = {"Lokio/HashingSink$Companion;", "", "()V", "hmacSha1", "Lokio/HashingSink;", "sink", "Lokio/Sink;", "key", "Lokio/ByteString;", "hmacSha256", "hmacSha512", "md5", AuthConstants.SHA1, "sha256", "sha512", "okio"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        @d
        @m
        public final HashingSink hmacSha1(@d Sink sink, @d ByteString key) {
            f0.p(sink, "sink");
            f0.p(key, "key");
            return new HashingSink(sink, key, "HmacSHA1");
        }

        @d
        @m
        public final HashingSink hmacSha256(@d Sink sink, @d ByteString key) {
            f0.p(sink, "sink");
            f0.p(key, "key");
            return new HashingSink(sink, key, "HmacSHA256");
        }

        @d
        @m
        public final HashingSink hmacSha512(@d Sink sink, @d ByteString key) {
            f0.p(sink, "sink");
            f0.p(key, "key");
            return new HashingSink(sink, key, "HmacSHA512");
        }

        @d
        @m
        public final HashingSink md5(@d Sink sink) {
            f0.p(sink, "sink");
            return new HashingSink(sink, "MD5");
        }

        @d
        @m
        public final HashingSink sha1(@d Sink sink) {
            f0.p(sink, "sink");
            return new HashingSink(sink, "SHA-1");
        }

        @d
        @m
        public final HashingSink sha256(@d Sink sink) {
            f0.p(sink, "sink");
            return new HashingSink(sink, "SHA-256");
        }

        @d
        @m
        public final HashingSink sha512(@d Sink sink) {
            f0.p(sink, "sink");
            return new HashingSink(sink, "SHA-512");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashingSink(@d Sink sink, @d String algorithm) {
        super(sink);
        f0.p(sink, "sink");
        f0.p(algorithm, "algorithm");
        this.messageDigest = MessageDigest.getInstance(algorithm);
        this.mac = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashingSink(@d Sink sink, @d ByteString key, @d String algorithm) throws NoSuchAlgorithmException {
        super(sink);
        f0.p(sink, "sink");
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
    public static final HashingSink hmacSha1(@d Sink sink, @d ByteString byteString) {
        return INSTANCE.hmacSha1(sink, byteString);
    }

    @d
    @m
    public static final HashingSink hmacSha256(@d Sink sink, @d ByteString byteString) {
        return INSTANCE.hmacSha256(sink, byteString);
    }

    @d
    @m
    public static final HashingSink hmacSha512(@d Sink sink, @d ByteString byteString) {
        return INSTANCE.hmacSha512(sink, byteString);
    }

    @d
    @m
    public static final HashingSink md5(@d Sink sink) {
        return INSTANCE.md5(sink);
    }

    @d
    @m
    public static final HashingSink sha1(@d Sink sink) {
        return INSTANCE.sha1(sink);
    }

    @d
    @m
    public static final HashingSink sha256(@d Sink sink) {
        return INSTANCE.sha256(sink);
    }

    @d
    @m
    public static final HashingSink sha512(@d Sink sink) {
        return INSTANCE.sha512(sink);
    }

    @d
    @k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "hash", imports = {}))
    @h(name = "-deprecated_hash")
    /* JADX INFO: renamed from: -deprecated_hash, reason: not valid java name */
    public final ByteString m811deprecated_hash() {
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

    @Override // okio.ForwardingSink, okio.Sink
    public void write(@d Buffer source, long j10) throws IOException {
        f0.p(source, "source");
        Util.checkOffsetAndCount(source.size(), 0L, j10);
        Segment segment = source.head;
        f0.m(segment);
        long j11 = 0;
        while (j11 < j10) {
            int iMin = (int) Math.min(j10 - j11, segment.limit - segment.pos);
            MessageDigest messageDigest = this.messageDigest;
            if (messageDigest != null) {
                messageDigest.update(segment.data, segment.pos, iMin);
            } else {
                Mac mac = this.mac;
                f0.m(mac);
                mac.update(segment.data, segment.pos, iMin);
            }
            j11 += (long) iMin;
            segment = segment.next;
            f0.m(segment);
        }
        super.write(source, j10);
    }
}
