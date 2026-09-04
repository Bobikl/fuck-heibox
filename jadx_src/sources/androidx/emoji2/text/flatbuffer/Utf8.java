package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public abstract class Utf8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Utf8 f23033a;

    public static class UnpairedSurrogateException extends IllegalArgumentException {
        UnpairedSurrogateException(int i10, int i11) {
            super("Unpaired surrogate at index " + i10 + " of " + i11);
        }
    }

    public static class a {
        a() {
        }

        static void a(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) throws IllegalArgumentException {
            if (f(b11) || (((b10 << com.google.common.base.a.F) + (b11 + 112)) >> 30) != 0 || f(b12) || f(b13)) {
                throw new IllegalArgumentException("Invalid UTF-8");
            }
            int iK = ((b10 & 7) << 18) | (k(b11) << 12) | (k(b12) << 6) | k(b13);
            cArr[i10] = e(iK);
            cArr[i10 + 1] = j(iK);
        }

        static void b(byte b10, char[] cArr, int i10) {
            cArr[i10] = (char) b10;
        }

        static void c(byte b10, byte b11, byte b12, char[] cArr, int i10) throws IllegalArgumentException {
            if (f(b11) || ((b10 == -32 && b11 < -96) || ((b10 == -19 && b11 >= -96) || f(b12)))) {
                throw new IllegalArgumentException("Invalid UTF-8");
            }
            cArr[i10] = (char) (((b10 & 15) << 12) | (k(b11) << 6) | k(b12));
        }

        static void d(byte b10, byte b11, char[] cArr, int i10) throws IllegalArgumentException {
            if (b10 < -62) {
                throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
            }
            if (f(b11)) {
                throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
            }
            cArr[i10] = (char) (((b10 & 31) << 6) | k(b11));
        }

        private static char e(int i10) {
            return (char) ((i10 >>> 10) + okio.Utf8.HIGH_SURROGATE_HEADER);
        }

        private static boolean f(byte b10) {
            return b10 > -65;
        }

        static boolean g(byte b10) {
            return b10 >= 0;
        }

        static boolean h(byte b10) {
            return b10 < -16;
        }

        static boolean i(byte b10) {
            return b10 < -32;
        }

        private static char j(int i10) {
            return (char) ((i10 & 1023) + okio.Utf8.LOG_SURROGATE_HEADER);
        }

        private static int k(byte b10) {
            return b10 & okio.Utf8.REPLACEMENT_BYTE;
        }
    }

    public static Utf8 d() {
        if (f23033a == null) {
            f23033a = new Utf8Safe();
        }
        return f23033a;
    }

    public static void e(Utf8 utf8) {
        f23033a = utf8;
    }

    public abstract String a(ByteBuffer byteBuffer, int i10, int i11);

    public abstract void b(CharSequence charSequence, ByteBuffer byteBuffer);

    public abstract int c(CharSequence charSequence);
}
