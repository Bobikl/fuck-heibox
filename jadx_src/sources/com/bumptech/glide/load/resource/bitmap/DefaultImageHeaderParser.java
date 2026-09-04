package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import androidx.annotation.n0;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes6.dex */
public final class DefaultImageHeaderParser implements ImageHeaderParser {
    private static final int A = 1635150182;
    private static final int B = 1635150195;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f41466b = "DfltImageHeaderParser";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f41467c = 4671814;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f41468d = -1991225785;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int f41469e = 65496;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f41470f = 19789;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f41471g = 18761;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f41474j = 218;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f41475k = 217;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final int f41476l = 255;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final int f41477m = 225;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f41478n = 274;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f41480p = 1380533830;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f41481q = 1464156752;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f41482r = 1448097792;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f41483s = -256;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f41484t = 255;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f41485u = 88;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f41486v = 76;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f41487w = 2;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f41488x = 16;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f41489y = 8;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f41490z = 1718909296;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f41472h = "Exif\u0000\u0000";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final byte[] f41473i = f41472h.getBytes(Charset.forName("UTF-8"));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int[] f41479o = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public interface Reader {

        public static final class EndOfFileException extends IOException {
            private static final long serialVersionUID = 1;

            EndOfFileException() {
                super("Unexpectedly reached end of a file");
            }
        }

        int getUInt16() throws IOException;

        short getUInt8() throws IOException;

        int read(byte[] bArr, int i10) throws IOException;

        long skip(long j10) throws IOException;
    }

    public static final class a implements Reader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ByteBuffer f41491a;

        a(ByteBuffer byteBuffer) {
            this.f41491a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int getUInt16() throws Reader.EndOfFileException {
            return (getUInt8() << 8) | getUInt8();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public short getUInt8() throws Reader.EndOfFileException {
            if (this.f41491a.remaining() >= 1) {
                return (short) (this.f41491a.get() & 255);
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int read(byte[] bArr, int i10) {
            int iMin = Math.min(i10, this.f41491a.remaining());
            if (iMin == 0) {
                return -1;
            }
            this.f41491a.get(bArr, 0, iMin);
            return iMin;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long skip(long j10) {
            int iMin = (int) Math.min(this.f41491a.remaining(), j10);
            ByteBuffer byteBuffer = this.f41491a;
            byteBuffer.position(byteBuffer.position() + iMin);
            return iMin;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ByteBuffer f41492a;

        b(byte[] bArr, int i10) {
            this.f41492a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i10);
        }

        private boolean c(int i10, int i11) {
            return this.f41492a.remaining() - i10 >= i11;
        }

        short a(int i10) {
            if (c(i10, 2)) {
                return this.f41492a.getShort(i10);
            }
            return (short) -1;
        }

        int b(int i10) {
            if (c(i10, 4)) {
                return this.f41492a.getInt(i10);
            }
            return -1;
        }

        int d() {
            return this.f41492a.remaining();
        }

        void e(ByteOrder byteOrder) {
            this.f41492a.order(byteOrder);
        }
    }

    public static final class c implements Reader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InputStream f41493a;

        c(InputStream inputStream) {
            this.f41493a = inputStream;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int getUInt16() throws IOException {
            return (getUInt8() << 8) | getUInt8();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public short getUInt8() throws IOException {
            int i10 = this.f41493a.read();
            if (i10 != -1) {
                return (short) i10;
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int read(byte[] bArr, int i10) throws IOException {
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10 && (i12 = this.f41493a.read(bArr, i11, i10 - i11)) != -1) {
                i11 += i12;
            }
            if (i11 == 0 && i12 == -1) {
                throw new Reader.EndOfFileException();
            }
            return i11;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long skip(long j10) throws IOException {
            if (j10 < 0) {
                return 0L;
            }
            long j11 = j10;
            while (j11 > 0) {
                long jSkip = this.f41493a.skip(j11);
                if (jSkip <= 0) {
                    if (this.f41493a.read() == -1) {
                        break;
                    }
                    jSkip = 1;
                }
                j11 -= jSkip;
            }
            return j10 - j11;
        }
    }

    private static int e(int i10, int i11) {
        return i10 + 2 + (i11 * 12);
    }

    private int f(Reader reader, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) throws IOException {
        try {
            int uInt16 = reader.getUInt16();
            if (!h(uInt16)) {
                if (Log.isLoggable(f41466b, 3)) {
                    Log.d(f41466b, "Parser doesn't handle magic number: " + uInt16);
                }
                return -1;
            }
            int iJ = j(reader);
            if (iJ == -1) {
                if (Log.isLoggable(f41466b, 3)) {
                    Log.d(f41466b, "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            byte[] bArr = (byte[]) bVar.c(iJ, byte[].class);
            try {
                return l(reader, bArr, iJ);
            } finally {
                bVar.put(bArr);
            }
        } catch (Reader.EndOfFileException unused) {
            return -1;
        }
    }

    @n0
    private ImageHeaderParser.ImageType g(Reader reader) throws IOException {
        try {
            int uInt16 = reader.getUInt16();
            if (uInt16 == f41469e) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int uInt8 = (uInt16 << 8) | reader.getUInt8();
            if (uInt8 == f41467c) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int uInt9 = (uInt8 << 8) | reader.getUInt8();
            if (uInt9 == f41468d) {
                reader.skip(21L);
                try {
                    return reader.getUInt8() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (Reader.EndOfFileException unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (uInt9 != 1380533830) {
                return m(reader, uInt9);
            }
            reader.skip(4L);
            if (((reader.getUInt16() << 16) | reader.getUInt16()) != f41481q) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int uInt17 = (reader.getUInt16() << 16) | reader.getUInt16();
            if ((uInt17 & (-256)) != f41482r) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int i10 = uInt17 & 255;
            if (i10 != 88) {
                if (i10 != 76) {
                    return ImageHeaderParser.ImageType.WEBP;
                }
                reader.skip(4L);
                return (reader.getUInt8() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            }
            reader.skip(4L);
            short uInt10 = reader.getUInt8();
            if ((uInt10 & 2) != 0) {
                return ImageHeaderParser.ImageType.ANIMATED_WEBP;
            }
            return (uInt10 & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
        } catch (Reader.EndOfFileException unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    private static boolean h(int i10) {
        return (i10 & f41469e) == f41469e || i10 == f41470f || i10 == f41471g;
    }

    private boolean i(byte[] bArr, int i10) {
        boolean z10 = bArr != null && i10 > f41473i.length;
        if (z10) {
            int i11 = 0;
            while (true) {
                byte[] bArr2 = f41473i;
                if (i11 >= bArr2.length) {
                    break;
                }
                if (bArr[i11] != bArr2[i11]) {
                    return false;
                }
                i11++;
            }
        }
        return z10;
    }

    private int j(Reader reader) throws IOException {
        short uInt8;
        int uInt16;
        long j10;
        long jSkip;
        do {
            short uInt9 = reader.getUInt8();
            if (uInt9 != 255) {
                if (Log.isLoggable(f41466b, 3)) {
                    Log.d(f41466b, "Unknown segmentId=" + ((int) uInt9));
                }
                return -1;
            }
            uInt8 = reader.getUInt8();
            if (uInt8 == 218) {
                return -1;
            }
            if (uInt8 == 217) {
                if (Log.isLoggable(f41466b, 3)) {
                    Log.d(f41466b, "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            uInt16 = reader.getUInt16() - 2;
            if (uInt8 == 225) {
                return uInt16;
            }
            j10 = uInt16;
            jSkip = reader.skip(j10);
        } while (jSkip == j10);
        if (Log.isLoggable(f41466b, 3)) {
            Log.d(f41466b, "Unable to skip enough data, type: " + ((int) uInt8) + ", wanted to skip: " + uInt16 + ", but actually skipped: " + jSkip);
        }
        return -1;
    }

    private static int k(b bVar) {
        ByteOrder byteOrder;
        short sA = bVar.a(6);
        if (sA != f41471g) {
            if (sA != f41470f && Log.isLoggable(f41466b, 3)) {
                Log.d(f41466b, "Unknown endianness = " + ((int) sA));
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        bVar.e(byteOrder);
        int iB = bVar.b(10) + 6;
        short sA2 = bVar.a(iB);
        for (int i10 = 0; i10 < sA2; i10++) {
            int iE = e(iB, i10);
            short sA3 = bVar.a(iE);
            if (sA3 == 274) {
                short sA4 = bVar.a(iE + 2);
                if (sA4 >= 1 && sA4 <= 12) {
                    int iB2 = bVar.b(iE + 4);
                    if (iB2 >= 0) {
                        if (Log.isLoggable(f41466b, 3)) {
                            Log.d(f41466b, "Got tagIndex=" + i10 + " tagType=" + ((int) sA3) + " formatCode=" + ((int) sA4) + " componentCount=" + iB2);
                        }
                        int i11 = iB2 + f41479o[sA4];
                        if (i11 <= 4) {
                            int i12 = iE + 8;
                            if (i12 >= 0 && i12 <= bVar.d()) {
                                if (i11 >= 0 && i11 + i12 <= bVar.d()) {
                                    return bVar.a(i12);
                                }
                                if (Log.isLoggable(f41466b, 3)) {
                                    Log.d(f41466b, "Illegal number of bytes for TI tag data tagType=" + ((int) sA3));
                                }
                            } else if (Log.isLoggable(f41466b, 3)) {
                                Log.d(f41466b, "Illegal tagValueOffset=" + i12 + " tagType=" + ((int) sA3));
                            }
                        } else if (Log.isLoggable(f41466b, 3)) {
                            Log.d(f41466b, "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) sA4));
                        }
                    } else if (Log.isLoggable(f41466b, 3)) {
                        Log.d(f41466b, "Negative tiff component count");
                    }
                } else if (Log.isLoggable(f41466b, 3)) {
                    Log.d(f41466b, "Got invalid format code = " + ((int) sA4));
                }
            }
        }
        return -1;
    }

    private int l(Reader reader, byte[] bArr, int i10) throws IOException {
        int i11 = reader.read(bArr, i10);
        if (i11 == i10) {
            if (i(bArr, i10)) {
                return k(new b(bArr, i10));
            }
            if (Log.isLoggable(f41466b, 3)) {
                Log.d(f41466b, "Missing jpeg exif preamble");
            }
            return -1;
        }
        if (Log.isLoggable(f41466b, 3)) {
            Log.d(f41466b, "Unable to read exif segment data, length: " + i10 + ", actually read: " + i11);
        }
        return -1;
    }

    private ImageHeaderParser.ImageType m(Reader reader, int i10) throws IOException {
        if (((reader.getUInt16() << 16) | reader.getUInt16()) != 1718909296) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int uInt16 = (reader.getUInt16() << 16) | reader.getUInt16();
        if (uInt16 == B) {
            return ImageHeaderParser.ImageType.ANIMATED_AVIF;
        }
        int i11 = 0;
        boolean z10 = uInt16 == A;
        reader.skip(4L);
        int i12 = i10 - 16;
        if (i12 % 4 == 0) {
            while (i11 < 5 && i12 > 0) {
                int uInt17 = (reader.getUInt16() << 16) | reader.getUInt16();
                if (uInt17 == B) {
                    return ImageHeaderParser.ImageType.ANIMATED_AVIF;
                }
                if (uInt17 == A) {
                    z10 = true;
                }
                i11++;
                i12 -= 4;
            }
        }
        return z10 ? ImageHeaderParser.ImageType.AVIF : ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int a(@n0 ByteBuffer byteBuffer, @n0 com.bumptech.glide.load.engine.bitmap_recycle.b bVar) throws IOException {
        return f(new a((ByteBuffer) com.bumptech.glide.util.m.e(byteBuffer)), (com.bumptech.glide.load.engine.bitmap_recycle.b) com.bumptech.glide.util.m.e(bVar));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @n0
    public ImageHeaderParser.ImageType b(@n0 InputStream inputStream) throws IOException {
        return g(new c((InputStream) com.bumptech.glide.util.m.e(inputStream)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int c(@n0 InputStream inputStream, @n0 com.bumptech.glide.load.engine.bitmap_recycle.b bVar) throws IOException {
        return f(new c((InputStream) com.bumptech.glide.util.m.e(inputStream)), (com.bumptech.glide.load.engine.bitmap_recycle.b) com.bumptech.glide.util.m.e(bVar));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @n0
    public ImageHeaderParser.ImageType d(@n0 ByteBuffer byteBuffer) throws IOException {
        return g(new a((ByteBuffer) com.bumptech.glide.util.m.e(byteBuffer)));
    }
}
