package kotlin.io;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Console.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final l f124775a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f124776b = 32;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static CharsetDecoder f124777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f124778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final byte[] f124779e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final char[] f124780f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final ByteBuffer f124781g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private static final CharBuffer f124782h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private static final StringBuilder f124783i;

    static {
        byte[] bArr = new byte[32];
        f124779e = bArr;
        char[] cArr = new char[32];
        f124780f = cArr;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        f0.o(byteBufferWrap, "wrap(bytes)");
        f124781g = byteBufferWrap;
        CharBuffer charBufferWrap = CharBuffer.wrap(cArr);
        f0.o(charBufferWrap, "wrap(chars)");
        f124782h = charBufferWrap;
        f124783i = new StringBuilder();
    }

    private l() {
    }

    private final int a() {
        ByteBuffer byteBuffer = f124781g;
        byteBuffer.compact();
        int iPosition = byteBuffer.position();
        byteBuffer.position(0);
        return iPosition;
    }

    private final int b(boolean z10) throws CharacterCodingException {
        while (true) {
            CharsetDecoder charsetDecoder = f124777c;
            if (charsetDecoder == null) {
                f0.S("decoder");
                charsetDecoder = null;
            }
            ByteBuffer byteBuffer = f124781g;
            CharBuffer charBuffer = f124782h;
            CoderResult coderResultDecode = charsetDecoder.decode(byteBuffer, charBuffer, z10);
            f0.o(coderResultDecode, "decoder.decode(byteBuf, charBuf, endOfInput)");
            if (coderResultDecode.isError()) {
                e();
                coderResultDecode.throwException();
            }
            int iPosition = charBuffer.position();
            if (!coderResultDecode.isOverflow()) {
                return iPosition;
            }
            StringBuilder sb2 = f124783i;
            char[] cArr = f124780f;
            int i10 = iPosition - 1;
            sb2.append(cArr, 0, i10);
            charBuffer.position(0);
            charBuffer.limit(32);
            charBuffer.put(cArr[i10]);
        }
    }

    private final int c(int i10, int i11) throws CharacterCodingException {
        ByteBuffer byteBuffer = f124781g;
        byteBuffer.limit(i10);
        f124782h.position(i11);
        int iB = b(true);
        CharsetDecoder charsetDecoder = f124777c;
        if (charsetDecoder == null) {
            f0.S("decoder");
            charsetDecoder = null;
        }
        charsetDecoder.reset();
        byteBuffer.position(0);
        return iB;
    }

    private final void e() {
        CharsetDecoder charsetDecoder = f124777c;
        if (charsetDecoder == null) {
            f0.S("decoder");
            charsetDecoder = null;
        }
        charsetDecoder.reset();
        f124781g.position(0);
        f124783i.setLength(0);
    }

    private final void f() {
        StringBuilder sb2 = f124783i;
        sb2.setLength(32);
        sb2.trimToSize();
    }

    private final void g(Charset charset) {
        CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
        f0.o(charsetDecoderNewDecoder, "charset.newDecoder()");
        f124777c = charsetDecoderNewDecoder;
        ByteBuffer byteBuffer = f124781g;
        byteBuffer.clear();
        CharBuffer charBuffer = f124782h;
        charBuffer.clear();
        byteBuffer.put((byte) 10);
        byteBuffer.flip();
        CharsetDecoder charsetDecoder = f124777c;
        if (charsetDecoder == null) {
            f0.S("decoder");
            charsetDecoder = null;
        }
        boolean z10 = false;
        charsetDecoder.decode(byteBuffer, charBuffer, false);
        if (charBuffer.position() == 1 && charBuffer.get(0) == '\n') {
            z10 = true;
        }
        f124778d = z10;
        e();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0022 A[Catch: all -> 0x00c9, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x0012, B:7:0x0018, B:11:0x0028, B:13:0x0034, B:22:0x0047, B:36:0x007c, B:38:0x0084, B:40:0x0088, B:42:0x0090, B:43:0x0092, B:48:0x009e, B:51:0x00a7, B:53:0x00bb, B:54:0x00be, B:23:0x004c, B:26:0x0057, B:30:0x005e, B:32:0x006e, B:34:0x0076, B:57:0x00c3, B:9:0x0022), top: B:62:0x0001 }] */
    @dl.e
    public final synchronized String d(@dl.d InputStream inputStream, @dl.d Charset charset) {
        boolean z10;
        int iC;
        f0.p(inputStream, "inputStream");
        f0.p(charset, "charset");
        CharsetDecoder charsetDecoder = f124777c;
        if (charsetDecoder == null) {
            g(charset);
        } else {
            if (charsetDecoder == null) {
                f0.S("decoder");
                charsetDecoder = null;
            }
            if (!f0.g(charsetDecoder.charset(), charset)) {
                g(charset);
            }
        }
        int iA = 0;
        int iB = 0;
        while (true) {
            int i10 = inputStream.read();
            z10 = true;
            if (i10 == -1) {
                if (!(f124783i.length() == 0) || iA != 0 || iB != 0) {
                    iC = c(iA, iB);
                    break;
                }
                return null;
            }
            int i11 = iA + 1;
            f124779e[iA] = (byte) i10;
            if (i10 == 10 || i11 == 32 || !f124778d) {
                ByteBuffer byteBuffer = f124781g;
                byteBuffer.limit(i11);
                f124782h.position(iB);
                iB = b(false);
                if (iB > 0 && f124780f[iB - 1] == '\n') {
                    byteBuffer.position(0);
                    iC = iB;
                    break;
                }
                iA = a();
            } else {
                iA = i11;
            }
        }
        if (iC > 0) {
            char[] cArr = f124780f;
            if (cArr[iC - 1] == '\n' && (iC = iC - 1) > 0 && cArr[iC - 1] == '\r') {
                iC--;
            }
        }
        StringBuilder sb2 = f124783i;
        if (sb2.length() != 0) {
            z10 = false;
        }
        if (z10) {
            return new String(f124780f, 0, iC);
        }
        sb2.append(f124780f, 0, iC);
        String string = sb2.toString();
        f0.o(string, "sb.toString()");
        if (sb2.length() > 32) {
            f();
        }
        sb2.setLength(0);
        return string;
    }
}
