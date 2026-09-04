package okio;

import androidx.constraintlayout.core.motion.utils.w;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.tencent.qcloud.core.auth.AuthConstants;
import dl.d;
import io.flutter.plugin.editing.SpellCheckPlugin;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.k;
import kotlin.s0;
import okio.internal.ByteStringKt;
import xh.e;
import xh.h;
import xh.i;
import xh.m;

/* JADX INFO: compiled from: ByteString.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\t\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0016\u0018\u0000 b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001bB\u0011\b\u0000\u0012\u0006\u0010]\u001a\u000202¢\u0006\u0004\b`\u0010aJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016J\b\u0010\u0010\u001a\u00020\u0000H\u0016J\b\u0010\u0011\u001a\u00020\u0000H\u0016J\b\u0010\u0012\u001a\u00020\u0000H\u0016J\b\u0010\u0013\u001a\u00020\u0000H\u0016J\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\nH\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0000H\u0016J\u0010\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0000H\u0016J\u0010\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0000H\u0016J\u001f\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u001f\u001a\u00020\nH\u0016J\b\u0010 \u001a\u00020\nH\u0016J\b\u0010!\u001a\u00020\u0000H\u0016J\b\u0010\"\u001a\u00020\u0000H\u0016J\u001c\u0010&\u001a\u00020\u00002\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010%\u001a\u00020#H\u0017J\u0017\u0010+\u001a\u00020(2\u0006\u0010'\u001a\u00020#H\u0010¢\u0006\u0004\b)\u0010*J\u0018\u0010.\u001a\u00020(2\u0006\u0010,\u001a\u00020#H\u0087\u0002¢\u0006\u0004\b-\u0010*J\u000f\u00101\u001a\u00020#H\u0010¢\u0006\u0004\b/\u00100J\b\u00103\u001a\u000202H\u0016J\u000f\u00106\u001a\u000202H\u0010¢\u0006\u0004\b4\u00105J\b\u00108\u001a\u000207H\u0016J\u0010\u0010:\u001a\u00020\u00052\u0006\u0010\b\u001a\u000209H\u0016J'\u0010:\u001a\u00020\u00052\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020#2\u0006\u0010>\u001a\u00020#H\u0010¢\u0006\u0004\b?\u0010@J(\u0010D\u001a\u00020C2\u0006\u0010=\u001a\u00020#2\u0006\u0010A\u001a\u00020\u00002\u0006\u0010B\u001a\u00020#2\u0006\u0010>\u001a\u00020#H\u0016J(\u0010D\u001a\u00020C2\u0006\u0010=\u001a\u00020#2\u0006\u0010A\u001a\u0002022\u0006\u0010B\u001a\u00020#2\u0006\u0010>\u001a\u00020#H\u0016J\u000e\u0010F\u001a\u00020C2\u0006\u0010E\u001a\u00020\u0000J\u000e\u0010F\u001a\u00020C2\u0006\u0010E\u001a\u000202J\u000e\u0010H\u001a\u00020C2\u0006\u0010G\u001a\u00020\u0000J\u000e\u0010H\u001a\u00020C2\u0006\u0010G\u001a\u000202J\u001a\u0010J\u001a\u00020#2\u0006\u0010A\u001a\u00020\u00002\b\b\u0002\u0010I\u001a\u00020#H\u0007J\u001a\u0010J\u001a\u00020#2\u0006\u0010A\u001a\u0002022\b\b\u0002\u0010I\u001a\u00020#H\u0017J\u001a\u0010K\u001a\u00020#2\u0006\u0010A\u001a\u00020\u00002\b\b\u0002\u0010I\u001a\u00020#H\u0007J\u001a\u0010K\u001a\u00020#2\u0006\u0010A\u001a\u0002022\b\b\u0002\u0010I\u001a\u00020#H\u0017J\u0013\u0010M\u001a\u00020C2\b\u0010A\u001a\u0004\u0018\u00010LH\u0096\u0002J\b\u0010N\u001a\u00020#H\u0016J\u0011\u0010O\u001a\u00020#2\u0006\u0010A\u001a\u00020\u0000H\u0096\u0002J\b\u0010P\u001a\u00020\nH\u0016J\u0017\u0010-\u001a\u00020(2\u0006\u0010,\u001a\u00020#H\u0007¢\u0006\u0004\bQ\u0010*J\u000f\u0010S\u001a\u00020#H\u0007¢\u0006\u0004\bR\u00100R\"\u0010N\u001a\u00020#8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bN\u0010T\u001a\u0004\bU\u00100\"\u0004\bV\u0010WR$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u001a\u0010]\u001a\u0002028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u00105R\u0011\u0010S\u001a\u00020#8G¢\u0006\u0006\u001a\u0004\bS\u00100¨\u0006c"}, d2 = {"Lokio/ByteString;", "Ljava/io/Serializable;", "", "Ljava/io/ObjectInputStream;", "in", "Lkotlin/b2;", "readObject", "Ljava/io/ObjectOutputStream;", "out", "writeObject", "", "utf8", "Ljava/nio/charset/Charset;", "charset", w.b.f17895e, "base64", "md5", AuthConstants.SHA1, "sha256", "sha512", "algorithm", "digest$okio", "(Ljava/lang/String;)Lokio/ByteString;", "digest", "key", "hmacSha1", "hmacSha256", "hmacSha512", "hmac$okio", "(Ljava/lang/String;Lokio/ByteString;)Lokio/ByteString;", "hmac", "base64Url", "hex", "toAsciiLowercase", "toAsciiUppercase", "", "beginIndex", SpellCheckPlugin.END_INDEX_KEY, "substring", "pos", "", "internalGet$okio", "(I)B", "internalGet", UCropPlusActivity.ARG_INDEX, "getByte", "get", "getSize$okio", "()I", "getSize", "", "toByteArray", "internalArray$okio", "()[B", "internalArray", "Ljava/nio/ByteBuffer;", "asByteBuffer", "Ljava/io/OutputStream;", "write", "Lokio/Buffer;", "buffer", w.c.R, "byteCount", "write$okio", "(Lokio/Buffer;II)V", "other", "otherOffset", "", "rangeEquals", "prefix", "startsWith", "suffix", "endsWith", "fromIndex", "indexOf", "lastIndexOf", "", "equals", "hashCode", "compareTo", "toString", "-deprecated_getByte", "-deprecated_size", UiKitSpanObj.TYPE_SIZE, "I", "getHashCode$okio", "setHashCode$okio", "(I)V", "Ljava/lang/String;", "getUtf8$okio", "()Ljava/lang/String;", "setUtf8$okio", "(Ljava/lang/String;)V", "data", "[B", "getData$okio", "<init>", "([B)V", "Companion", "okio"}, k = 1, mv = {1, 4, 0})
public class ByteString implements Serializable, Comparable<ByteString> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @d
    @e
    public static final ByteString EMPTY = new ByteString(new byte[0]);
    private static final long serialVersionUID = 1;

    @d
    private final byte[] data;
    private transient int hashCode;

    @dl.e
    private transient String utf8;

    /* JADX INFO: compiled from: ByteString.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\nJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\fJ\u001d\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\b\u0010J\u0015\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\u0012J\u0015\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0015H\u0007¢\u0006\u0002\b\u0016J\u0014\u0010\u0013\u001a\u00020\u00042\n\u0010\u0017\u001a\u00020\u0018\"\u00020\u0019H\u0007J%\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0002\b\u0016J\u001d\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0002\b!J\u000e\u0010\u0007\u001a\u0004\u0018\u00010\u0004*\u00020\tH\u0007J\f\u0010\u000b\u001a\u00020\u0004*\u00020\tH\u0007J\u001b\u0010\"\u001a\u00020\u0004*\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\b\rJ\f\u0010\u0011\u001a\u00020\u0004*\u00020\tH\u0007J\u0019\u0010#\u001a\u00020\u0004*\u00020 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0002\b\u001eJ\u0011\u0010$\u001a\u00020\u0004*\u00020\u0015H\u0007¢\u0006\u0002\b\u0013J%\u0010$\u001a\u00020\u0004*\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0002\b\u0013R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lokio/ByteString$Companion;", "", "()V", "EMPTY", "Lokio/ByteString;", "serialVersionUID", "", "decodeBase64", w.b.f17895e, "", "-deprecated_decodeBase64", "decodeHex", "-deprecated_decodeHex", "encodeString", "charset", "Ljava/nio/charset/Charset;", "-deprecated_encodeString", "encodeUtf8", "-deprecated_encodeUtf8", "of", "buffer", "Ljava/nio/ByteBuffer;", "-deprecated_of", "data", "", "", "array", w.c.R, "", "byteCount", "read", "inputstream", "Ljava/io/InputStream;", "-deprecated_read", "encode", "readByteString", "toByteString", "okio"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public static /* synthetic */ ByteString encodeString$default(Companion companion, String str, Charset charset, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                charset = kotlin.text.d.f128566b;
            }
            return companion.encodeString(str, charset);
        }

        public static /* synthetic */ ByteString of$default(Companion companion, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = bArr.length;
            }
            return companion.of(bArr, i10, i11);
        }

        @k(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @s0(expression = "string.decodeBase64()", imports = {"okio.ByteString.Companion.decodeBase64"}))
        @h(name = "-deprecated_decodeBase64")
        @dl.e
        /* JADX INFO: renamed from: -deprecated_decodeBase64, reason: not valid java name */
        public final ByteString m800deprecated_decodeBase64(@d String string) {
            f0.p(string, "string");
            return decodeBase64(string);
        }

        @d
        @k(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @s0(expression = "string.decodeHex()", imports = {"okio.ByteString.Companion.decodeHex"}))
        @h(name = "-deprecated_decodeHex")
        /* JADX INFO: renamed from: -deprecated_decodeHex, reason: not valid java name */
        public final ByteString m801deprecated_decodeHex(@d String string) {
            f0.p(string, "string");
            return decodeHex(string);
        }

        @d
        @k(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @s0(expression = "string.encode(charset)", imports = {"okio.ByteString.Companion.encode"}))
        @h(name = "-deprecated_encodeString")
        /* JADX INFO: renamed from: -deprecated_encodeString, reason: not valid java name */
        public final ByteString m802deprecated_encodeString(@d String string, @d Charset charset) {
            f0.p(string, "string");
            f0.p(charset, "charset");
            return encodeString(string, charset);
        }

        @d
        @k(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @s0(expression = "string.encodeUtf8()", imports = {"okio.ByteString.Companion.encodeUtf8"}))
        @h(name = "-deprecated_encodeUtf8")
        /* JADX INFO: renamed from: -deprecated_encodeUtf8, reason: not valid java name */
        public final ByteString m803deprecated_encodeUtf8(@d String string) {
            f0.p(string, "string");
            return encodeUtf8(string);
        }

        @d
        @k(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @s0(expression = "buffer.toByteString()", imports = {"okio.ByteString.Companion.toByteString"}))
        @h(name = "-deprecated_of")
        /* JADX INFO: renamed from: -deprecated_of, reason: not valid java name */
        public final ByteString m804deprecated_of(@d ByteBuffer buffer) {
            f0.p(buffer, "buffer");
            return of(buffer);
        }

        @d
        @k(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @s0(expression = "array.toByteString(offset, byteCount)", imports = {"okio.ByteString.Companion.toByteString"}))
        @h(name = "-deprecated_of")
        /* JADX INFO: renamed from: -deprecated_of, reason: not valid java name */
        public final ByteString m805deprecated_of(@d byte[] array, int offset, int byteCount) {
            f0.p(array, "array");
            return of(array, offset, byteCount);
        }

        @d
        @k(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @s0(expression = "inputstream.readByteString(byteCount)", imports = {"okio.ByteString.Companion.readByteString"}))
        @h(name = "-deprecated_read")
        /* JADX INFO: renamed from: -deprecated_read, reason: not valid java name */
        public final ByteString m806deprecated_read(@d InputStream inputstream, int byteCount) {
            f0.p(inputstream, "inputstream");
            return read(inputstream, byteCount);
        }

        @dl.e
        @m
        public final ByteString decodeBase64(@d String decodeBase64) {
            f0.p(decodeBase64, "$this$decodeBase64");
            byte[] bArrDecodeBase64ToArray = Base64.decodeBase64ToArray(decodeBase64);
            if (bArrDecodeBase64ToArray != null) {
                return new ByteString(bArrDecodeBase64ToArray);
            }
            return null;
        }

        @d
        @m
        public final ByteString decodeHex(@d String decodeHex) {
            f0.p(decodeHex, "$this$decodeHex");
            if (!(decodeHex.length() % 2 == 0)) {
                throw new IllegalArgumentException(("Unexpected hex string: " + decodeHex).toString());
            }
            int length = decodeHex.length() / 2;
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                bArr[i10] = (byte) ((ByteStringKt.decodeHexDigit(decodeHex.charAt(i11)) << 4) + ByteStringKt.decodeHexDigit(decodeHex.charAt(i11 + 1)));
            }
            return new ByteString(bArr);
        }

        @d
        @h(name = "encodeString")
        @m
        public final ByteString encodeString(@d String encode, @d Charset charset) {
            f0.p(encode, "$this$encode");
            f0.p(charset, "charset");
            byte[] bytes = encode.getBytes(charset);
            f0.o(bytes, "(this as java.lang.String).getBytes(charset)");
            return new ByteString(bytes);
        }

        @d
        @m
        public final ByteString encodeUtf8(@d String encodeUtf8) {
            f0.p(encodeUtf8, "$this$encodeUtf8");
            ByteString byteString = new ByteString(Platform.asUtf8ToByteArray(encodeUtf8));
            byteString.setUtf8$okio(encodeUtf8);
            return byteString;
        }

        @d
        @h(name = "of")
        @m
        public final ByteString of(@d ByteBuffer toByteString) {
            f0.p(toByteString, "$this$toByteString");
            byte[] bArr = new byte[toByteString.remaining()];
            toByteString.get(bArr);
            return new ByteString(bArr);
        }

        @d
        @m
        public final ByteString of(@d byte... data) {
            f0.p(data, "data");
            byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
            f0.o(bArrCopyOf, "java.util.Arrays.copyOf(this, size)");
            return new ByteString(bArrCopyOf);
        }

        @d
        @h(name = "of")
        @m
        public final ByteString of(@d byte[] toByteString, int i10, int i11) {
            f0.p(toByteString, "$this$toByteString");
            Util.checkOffsetAndCount(toByteString.length, i10, i11);
            return new ByteString(kotlin.collections.m.G1(toByteString, i10, i11 + i10));
        }

        @d
        @h(name = "read")
        @m
        public final ByteString read(@d InputStream readByteString, int i10) throws IOException {
            f0.p(readByteString, "$this$readByteString");
            int i11 = 0;
            if (!(i10 >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + i10).toString());
            }
            byte[] bArr = new byte[i10];
            while (i11 < i10) {
                int i12 = readByteString.read(bArr, i11, i10 - i11);
                if (i12 == -1) {
                    throw new EOFException();
                }
                i11 += i12;
            }
            return new ByteString(bArr);
        }
    }

    public ByteString(@d byte[] data) {
        f0.p(data, "data");
        this.data = data;
    }

    @dl.e
    @m
    public static final ByteString decodeBase64(@d String str) {
        return INSTANCE.decodeBase64(str);
    }

    @d
    @m
    public static final ByteString decodeHex(@d String str) {
        return INSTANCE.decodeHex(str);
    }

    @d
    @h(name = "encodeString")
    @m
    public static final ByteString encodeString(@d String str, @d Charset charset) {
        return INSTANCE.encodeString(str, charset);
    }

    @d
    @m
    public static final ByteString encodeUtf8(@d String str) {
        return INSTANCE.encodeUtf8(str);
    }

    public static /* synthetic */ int indexOf$default(ByteString byteString, ByteString byteString2, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return byteString.indexOf(byteString2, i10);
    }

    public static /* synthetic */ int indexOf$default(ByteString byteString, byte[] bArr, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return byteString.indexOf(bArr, i10);
    }

    public static /* synthetic */ int lastIndexOf$default(ByteString byteString, ByteString byteString2, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        }
        if ((i11 & 2) != 0) {
            i10 = byteString.size();
        }
        return byteString.lastIndexOf(byteString2, i10);
    }

    public static /* synthetic */ int lastIndexOf$default(ByteString byteString, byte[] bArr, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        }
        if ((i11 & 2) != 0) {
            i10 = byteString.size();
        }
        return byteString.lastIndexOf(bArr, i10);
    }

    @d
    @h(name = "of")
    @m
    public static final ByteString of(@d ByteBuffer byteBuffer) {
        return INSTANCE.of(byteBuffer);
    }

    @d
    @m
    public static final ByteString of(@d byte... bArr) {
        return INSTANCE.of(bArr);
    }

    @d
    @h(name = "of")
    @m
    public static final ByteString of(@d byte[] bArr, int i10, int i11) {
        return INSTANCE.of(bArr, i10, i11);
    }

    @d
    @h(name = "read")
    @m
    public static final ByteString read(@d InputStream inputStream, int i10) throws IOException {
        return INSTANCE.read(inputStream, i10);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, NoSuchFieldException, IOException {
        ByteString byteString = INSTANCE.read(objectInputStream, objectInputStream.readInt());
        Field field = ByteString.class.getDeclaredField("data");
        f0.o(field, "field");
        field.setAccessible(true);
        field.set(this, byteString.data);
    }

    public static /* synthetic */ ByteString substring$default(ByteString byteString, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
        }
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = byteString.size();
        }
        return byteString.substring(i10, i11);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.data.length);
        objectOutputStream.write(this.data);
    }

    @k(level = DeprecationLevel.ERROR, message = "moved to operator function", replaceWith = @s0(expression = "this[index]", imports = {}))
    @h(name = "-deprecated_getByte")
    /* JADX INFO: renamed from: -deprecated_getByte, reason: not valid java name */
    public final byte m798deprecated_getByte(int index) {
        return getByte(index);
    }

    @k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = UiKitSpanObj.TYPE_SIZE, imports = {}))
    @h(name = "-deprecated_size")
    /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name */
    public final int m799deprecated_size() {
        return size();
    }

    @d
    public ByteBuffer asByteBuffer() {
        ByteBuffer byteBufferAsReadOnlyBuffer = ByteBuffer.wrap(this.data).asReadOnlyBuffer();
        f0.o(byteBufferAsReadOnlyBuffer, "ByteBuffer.wrap(data).asReadOnlyBuffer()");
        return byteBufferAsReadOnlyBuffer;
    }

    @d
    public String base64() {
        return Base64.encodeBase64$default(getData(), null, 1, null);
    }

    @d
    public String base64Url() {
        return Base64.encodeBase64(getData(), Base64.getBASE64_URL_SAFE());
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        if (r0 < r1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r7 < r8) goto L13;
     */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int compareTo(@dl.d okio.ByteString r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.f0.p(r10, r0)
            int r0 = r9.size()
            int r1 = r10.size()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L13:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L2b
            byte r7 = r9.getByte(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.getByte(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L28
            int r4 = r4 + 1
            goto L13
        L28:
            if (r7 >= r8) goto L32
            goto L30
        L2b:
            if (r0 != r1) goto L2e
            goto L33
        L2e:
            if (r0 >= r1) goto L32
        L30:
            r3 = r5
            goto L33
        L32:
            r3 = r6
        L33:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.ByteString.compareTo(okio.ByteString):int");
    }

    @d
    public ByteString digest$okio(@d String algorithm) {
        f0.p(algorithm, "algorithm");
        byte[] bArrDigest = MessageDigest.getInstance(algorithm).digest(this.data);
        f0.o(bArrDigest, "MessageDigest.getInstance(algorithm).digest(data)");
        return new ByteString(bArrDigest);
    }

    public final boolean endsWith(@d ByteString suffix) {
        f0.p(suffix, "suffix");
        return rangeEquals(size() - suffix.size(), suffix, 0, suffix.size());
    }

    public final boolean endsWith(@d byte[] suffix) {
        f0.p(suffix, "suffix");
        return rangeEquals(size() - suffix.length, suffix, 0, suffix.length);
    }

    public boolean equals(@dl.e Object other) {
        if (other == this) {
            return true;
        }
        if (other instanceof ByteString) {
            ByteString byteString = (ByteString) other;
            if (byteString.size() == getData().length && byteString.rangeEquals(0, getData(), 0, getData().length)) {
                return true;
            }
        }
        return false;
    }

    @h(name = "getByte")
    public final byte getByte(int index) {
        return internalGet$okio(index);
    }

    @d
    /* JADX INFO: renamed from: getData$okio, reason: from getter */
    public final byte[] getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: getHashCode$okio, reason: from getter */
    public final int getHashCode() {
        return this.hashCode;
    }

    public int getSize$okio() {
        return getData().length;
    }

    @dl.e
    /* JADX INFO: renamed from: getUtf8$okio, reason: from getter */
    public final String getUtf8() {
        return this.utf8;
    }

    public int hashCode() {
        int hashCode = getHashCode();
        if (hashCode != 0) {
            return hashCode;
        }
        int iHashCode = Arrays.hashCode(getData());
        setHashCode$okio(iHashCode);
        return iHashCode;
    }

    @d
    public String hex() {
        char[] cArr = new char[getData().length * 2];
        int i10 = 0;
        for (byte b10 : getData()) {
            int i11 = i10 + 1;
            cArr[i10] = ByteStringKt.getHEX_DIGIT_CHARS()[(b10 >> 4) & 15];
            i10 = i11 + 1;
            cArr[i11] = ByteStringKt.getHEX_DIGIT_CHARS()[b10 & 15];
        }
        return new String(cArr);
    }

    @d
    public ByteString hmac$okio(@d String algorithm, @d ByteString key) throws NoSuchAlgorithmException {
        f0.p(algorithm, "algorithm");
        f0.p(key, "key");
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.toByteArray(), algorithm));
            byte[] bArrDoFinal = mac.doFinal(this.data);
            f0.o(bArrDoFinal, "mac.doFinal(data)");
            return new ByteString(bArrDoFinal);
        } catch (InvalidKeyException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    @d
    public ByteString hmacSha1(@d ByteString key) {
        f0.p(key, "key");
        return hmac$okio("HmacSHA1", key);
    }

    @d
    public ByteString hmacSha256(@d ByteString key) {
        f0.p(key, "key");
        return hmac$okio("HmacSHA256", key);
    }

    @d
    public ByteString hmacSha512(@d ByteString key) {
        f0.p(key, "key");
        return hmac$okio("HmacSHA512", key);
    }

    @i
    public final int indexOf(@d ByteString byteString) {
        return indexOf$default(this, byteString, 0, 2, (Object) null);
    }

    @i
    public final int indexOf(@d ByteString other, int fromIndex) {
        f0.p(other, "other");
        return indexOf(other.internalArray$okio(), fromIndex);
    }

    @i
    public final int indexOf(@d byte[] bArr) {
        return indexOf$default(this, bArr, 0, 2, (Object) null);
    }

    @i
    public int indexOf(@d byte[] other, int fromIndex) {
        f0.p(other, "other");
        int length = getData().length - other.length;
        int iMax = Math.max(fromIndex, 0);
        if (iMax <= length) {
            while (!Util.arrayRangeEquals(getData(), iMax, other, 0, other.length)) {
                if (iMax != length) {
                    iMax++;
                }
            }
            return iMax;
        }
        return -1;
    }

    @d
    public byte[] internalArray$okio() {
        return getData();
    }

    public byte internalGet$okio(int pos) {
        return getData()[pos];
    }

    @i
    public final int lastIndexOf(@d ByteString byteString) {
        return lastIndexOf$default(this, byteString, 0, 2, (Object) null);
    }

    @i
    public final int lastIndexOf(@d ByteString other, int fromIndex) {
        f0.p(other, "other");
        return lastIndexOf(other.internalArray$okio(), fromIndex);
    }

    @i
    public final int lastIndexOf(@d byte[] bArr) {
        return lastIndexOf$default(this, bArr, 0, 2, (Object) null);
    }

    @i
    public int lastIndexOf(@d byte[] other, int fromIndex) {
        f0.p(other, "other");
        for (int iMin = Math.min(fromIndex, getData().length - other.length); iMin >= 0; iMin--) {
            if (Util.arrayRangeEquals(getData(), iMin, other, 0, other.length)) {
                return iMin;
            }
        }
        return -1;
    }

    @d
    public ByteString md5() {
        return digest$okio("MD5");
    }

    public boolean rangeEquals(int offset, @d ByteString other, int otherOffset, int byteCount) {
        f0.p(other, "other");
        return other.rangeEquals(otherOffset, getData(), offset, byteCount);
    }

    public boolean rangeEquals(int offset, @d byte[] other, int otherOffset, int byteCount) {
        f0.p(other, "other");
        return offset >= 0 && offset <= getData().length - byteCount && otherOffset >= 0 && otherOffset <= other.length - byteCount && Util.arrayRangeEquals(getData(), offset, other, otherOffset, byteCount);
    }

    public final void setHashCode$okio(int i10) {
        this.hashCode = i10;
    }

    public final void setUtf8$okio(@dl.e String str) {
        this.utf8 = str;
    }

    @d
    public ByteString sha1() {
        return digest$okio("SHA-1");
    }

    @d
    public ByteString sha256() {
        return digest$okio("SHA-256");
    }

    @d
    public ByteString sha512() {
        return digest$okio("SHA-512");
    }

    @h(name = UiKitSpanObj.TYPE_SIZE)
    public final int size() {
        return getSize$okio();
    }

    public final boolean startsWith(@d ByteString prefix) {
        f0.p(prefix, "prefix");
        return rangeEquals(0, prefix, 0, prefix.size());
    }

    public final boolean startsWith(@d byte[] prefix) {
        f0.p(prefix, "prefix");
        return rangeEquals(0, prefix, 0, prefix.length);
    }

    @d
    public String string(@d Charset charset) {
        f0.p(charset, "charset");
        return new String(this.data, charset);
    }

    @d
    @i
    public final ByteString substring() {
        return substring$default(this, 0, 0, 3, null);
    }

    @d
    @i
    public final ByteString substring(int i10) {
        return substring$default(this, i10, 0, 2, null);
    }

    @d
    @i
    public ByteString substring(int beginIndex, int endIndex) {
        if (!(beginIndex >= 0)) {
            throw new IllegalArgumentException("beginIndex < 0".toString());
        }
        if (endIndex <= getData().length) {
            if (endIndex - beginIndex >= 0) {
                return (beginIndex == 0 && endIndex == getData().length) ? this : new ByteString(kotlin.collections.m.G1(getData(), beginIndex, endIndex));
            }
            throw new IllegalArgumentException("endIndex < beginIndex".toString());
        }
        throw new IllegalArgumentException(("endIndex > length(" + getData().length + ')').toString());
    }

    @d
    public ByteString toAsciiLowercase() {
        byte b10;
        for (int i10 = 0; i10 < getData().length; i10++) {
            byte b11 = getData()[i10];
            byte b12 = (byte) 65;
            if (b11 >= b12 && b11 <= (b10 = (byte) 90)) {
                byte[] data = getData();
                byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
                f0.o(bArrCopyOf, "java.util.Arrays.copyOf(this, size)");
                bArrCopyOf[i10] = (byte) (b11 + 32);
                for (int i11 = i10 + 1; i11 < bArrCopyOf.length; i11++) {
                    byte b13 = bArrCopyOf[i11];
                    if (b13 >= b12 && b13 <= b10) {
                        bArrCopyOf[i11] = (byte) (b13 + 32);
                    }
                }
                return new ByteString(bArrCopyOf);
            }
        }
        return this;
    }

    @d
    public ByteString toAsciiUppercase() {
        byte b10;
        for (int i10 = 0; i10 < getData().length; i10++) {
            byte b11 = getData()[i10];
            byte b12 = (byte) 97;
            if (b11 >= b12 && b11 <= (b10 = (byte) 122)) {
                byte[] data = getData();
                byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
                f0.o(bArrCopyOf, "java.util.Arrays.copyOf(this, size)");
                bArrCopyOf[i10] = (byte) (b11 - 32);
                for (int i11 = i10 + 1; i11 < bArrCopyOf.length; i11++) {
                    byte b13 = bArrCopyOf[i11];
                    if (b13 >= b12 && b13 <= b10) {
                        bArrCopyOf[i11] = (byte) (b13 - 32);
                    }
                }
                return new ByteString(bArrCopyOf);
            }
        }
        return this;
    }

    @d
    public byte[] toByteArray() {
        byte[] data = getData();
        byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
        f0.o(bArrCopyOf, "java.util.Arrays.copyOf(this, size)");
        return bArrCopyOf;
    }

    @d
    public String toString() {
        if (getData().length == 0) {
            return "[size=0]";
        }
        int iCodePointIndexToCharIndex = ByteStringKt.codePointIndexToCharIndex(getData(), 64);
        if (iCodePointIndexToCharIndex == -1) {
            if (getData().length <= 64) {
                return "[hex=" + hex() + ']';
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[size=");
            sb2.append(getData().length);
            sb2.append(" hex=");
            if (64 <= getData().length) {
                sb2.append((64 == getData().length ? this : new ByteString(kotlin.collections.m.G1(getData(), 0, 64))).hex());
                sb2.append("…]");
                return sb2.toString();
            }
            throw new IllegalArgumentException(("endIndex > length(" + getData().length + ')').toString());
        }
        String strUtf8 = utf8();
        if (strUtf8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String strSubstring = strUtf8.substring(0, iCodePointIndexToCharIndex);
        f0.o(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        String strL2 = kotlin.text.u.l2(kotlin.text.u.l2(kotlin.text.u.l2(strSubstring, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
        if (iCodePointIndexToCharIndex >= strUtf8.length()) {
            return "[text=" + strL2 + ']';
        }
        return "[size=" + getData().length + " text=" + strL2 + "…]";
    }

    @d
    public String utf8() {
        String utf8 = getUtf8();
        if (utf8 != null) {
            return utf8;
        }
        String utf8String = Platform.toUtf8String(internalArray$okio());
        setUtf8$okio(utf8String);
        return utf8String;
    }

    public void write(@d OutputStream out) throws IOException {
        f0.p(out, "out");
        out.write(this.data);
    }

    public void write$okio(@d Buffer buffer, int offset, int byteCount) {
        f0.p(buffer, "buffer");
        ByteStringKt.commonWrite(this, buffer, offset, byteCount);
    }
}
