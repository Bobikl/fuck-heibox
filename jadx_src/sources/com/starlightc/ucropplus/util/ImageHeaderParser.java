package com.starlightc.ucropplus.util;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.w0;
import androidx.core.view.q0;
import androidx.exifinterface.media.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
public class ImageHeaderParser {
    private static final int EXIF_MAGIC_NUMBER = 65496;
    private static final int EXIF_SEGMENT_TYPE = 225;
    private static final int INTEL_TIFF_MAGIC_NUMBER = 18761;
    private static final int MARKER_EOI = 217;
    private static final int MOTOROLA_TIFF_MAGIC_NUMBER = 19789;
    private static final int ORIENTATION_TAG_TYPE = 274;
    private static final int SEGMENT_SOS = 218;
    private static final int SEGMENT_START_ID = 255;
    private static final String TAG = "ImageHeaderParser";
    public static final int UNKNOWN_ORIENTATION = -1;
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Reader reader;
    private static final String JPEG_EXIF_SEGMENT_PREAMBLE = "Exif\u0000\u0000";
    private static final byte[] JPEG_EXIF_SEGMENT_PREAMBLE_BYTES = JPEG_EXIF_SEGMENT_PREAMBLE.getBytes(Charset.forName("UTF-8"));
    private static final int[] BYTES_PER_FORMAT = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public static class RandomAccessReader {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final ByteBuffer data;

        public RandomAccessReader(byte[] bArr, int i10) {
            this.data = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i10);
        }

        public short getInt16(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 50942, new Class[]{Integer.TYPE}, Short.TYPE);
            return patchProxyResultProxy.isSupported ? ((Short) patchProxyResultProxy.result).shortValue() : this.data.getShort(i10);
        }

        public int getInt32(int i10) {
            Object[] objArr = {new Integer(i10)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 50941, new Class[]{cls}, cls);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.data.getInt(i10);
        }

        public int length() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50940, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.data.remaining();
        }

        public void order(ByteOrder byteOrder) {
            if (PatchProxy.proxy(new Object[]{byteOrder}, this, changeQuickRedirect, false, 50939, new Class[]{ByteOrder.class}, Void.TYPE).isSupported) {
                return;
            }
            this.data.order(byteOrder);
        }
    }

    public interface Reader {
        int getUInt16() throws IOException;

        short getUInt8() throws IOException;

        int read(byte[] bArr, int i10) throws IOException;

        long skip(long j10) throws IOException;
    }

    public static class StreamReader implements Reader {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final InputStream is;

        public StreamReader(InputStream inputStream) {
            this.is = inputStream;
        }

        @Override // com.starlightc.ucropplus.util.ImageHeaderParser.Reader
        public int getUInt16() throws IOException {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50943, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : ((this.is.read() << 8) & q0.f21790f) | (this.is.read() & 255);
        }

        @Override // com.starlightc.ucropplus.util.ImageHeaderParser.Reader
        public short getUInt8() throws IOException {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50944, new Class[0], Short.TYPE);
            return patchProxyResultProxy.isSupported ? ((Short) patchProxyResultProxy.result).shortValue() : (short) (this.is.read() & 255);
        }

        @Override // com.starlightc.ucropplus.util.ImageHeaderParser.Reader
        public int read(byte[] bArr, int i10) throws IOException {
            Object[] objArr = {bArr, new Integer(i10)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 50946, new Class[]{byte[].class, cls}, cls);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            int i11 = i10;
            while (i11 > 0) {
                int i12 = this.is.read(bArr, i10 - i11, i11);
                if (i12 == -1) {
                    break;
                }
                i11 -= i12;
            }
            return i10 - i11;
        }

        @Override // com.starlightc.ucropplus.util.ImageHeaderParser.Reader
        public long skip(long j10) throws IOException {
            Object[] objArr = {new Long(j10)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Long.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 50945, new Class[]{cls}, cls);
            if (patchProxyResultProxy.isSupported) {
                return ((Long) patchProxyResultProxy.result).longValue();
            }
            if (j10 < 0) {
                return 0L;
            }
            long j11 = j10;
            while (j11 > 0) {
                long jSkip = this.is.skip(j11);
                if (jSkip <= 0) {
                    if (this.is.read() == -1) {
                        break;
                    }
                    jSkip = 1;
                }
                j11 -= jSkip;
            }
            return j10 - j11;
        }
    }

    public ImageHeaderParser(InputStream inputStream) {
        this.reader = new StreamReader(inputStream);
    }

    private static int calcTagOffset(int i10, int i11) {
        return i10 + 2 + (i11 * 12);
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:? A[SYNTHETIC] */
    @w0(21)
    public static void copyExif(Context context, int i10, int i11, Uri uri, Uri uri2) throws Throwable {
        ParcelFileDescriptor parcelFileDescriptor;
        Object[] objArr = {context, new Integer(i10), new Integer(i11), uri, uri2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 50936, new Class[]{Context.class, cls, cls, Uri.class, Uri.class}, Void.TYPE).isSupported) {
            return;
        }
        if (context == null) {
            Log.d(TAG, "context is null");
            return;
        }
        InputStream inputStream = null;
        parcelFileDescriptorOpenFileDescriptor = null;
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = null;
        inputStream = null;
        try {
            try {
                InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                try {
                    a aVar = new a(inputStreamOpenInputStream);
                    parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri2, "rw");
                    copyExifAttributes(aVar, new a(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()), i10, i11);
                    if (inputStreamOpenInputStream != null) {
                        try {
                            inputStreamOpenInputStream.close();
                        } catch (IOException e10) {
                            Log.d(TAG, e10.getMessage(), e10);
                        }
                    }
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (IOException e11) {
                    e = e11;
                    parcelFileDescriptor = parcelFileDescriptorOpenFileDescriptor;
                    inputStream = inputStreamOpenInputStream;
                    try {
                        Log.d(TAG, e.getMessage(), e);
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e12) {
                                Log.d(TAG, e12.getMessage(), e12);
                            }
                        }
                        if (parcelFileDescriptor == null) {
                        } else {
                            parcelFileDescriptor.close();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e13) {
                                Log.d(TAG, e13.getMessage(), e13);
                            }
                        }
                        if (parcelFileDescriptor != null) {
                            throw th;
                        }
                        try {
                            parcelFileDescriptor.close();
                            throw th;
                        } catch (IOException e14) {
                            Log.d(TAG, e14.getMessage(), e14);
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    parcelFileDescriptor = parcelFileDescriptorOpenFileDescriptor;
                    inputStream = inputStreamOpenInputStream;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    if (parcelFileDescriptor != null) {
                        throw th;
                    }
                    parcelFileDescriptor.close();
                    throw th;
                }
            } catch (IOException e15) {
                Log.d(TAG, e15.getMessage(), e15);
            }
        } catch (IOException e16) {
            e = e16;
            parcelFileDescriptor = null;
        } catch (Throwable th4) {
            th = th4;
            parcelFileDescriptor = null;
        }
    }

    public static void copyExif(Context context, int i10, int i11, Uri uri, String str) {
        Object[] objArr = {context, new Integer(i10), new Integer(i11), uri, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 50935, new Class[]{Context.class, cls, cls, Uri.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (context == null) {
            Log.d(TAG, "context is null");
            return;
        }
        InputStream inputStreamOpenInputStream = null;
        try {
            try {
                try {
                    inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                    copyExifAttributes(new a(inputStreamOpenInputStream), new a(str), i10, i11);
                    if (inputStreamOpenInputStream != null) {
                        inputStreamOpenInputStream.close();
                    }
                } catch (IOException e10) {
                    Log.d(TAG, e10.getMessage(), e10);
                }
            } catch (IOException e11) {
                Log.d(TAG, e11.getMessage(), e11);
                if (inputStreamOpenInputStream != null) {
                    inputStreamOpenInputStream.close();
                }
            }
        } catch (Throwable th2) {
            if (inputStreamOpenInputStream != null) {
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException e12) {
                    Log.d(TAG, e12.getMessage(), e12);
                }
            }
            throw th2;
        }
    }

    @w0(21)
    public static void copyExif(Context context, a aVar, int i10, int i11, Uri uri) {
        Object[] objArr = {context, aVar, new Integer(i10), new Integer(i11), uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 50937, new Class[]{Context.class, a.class, cls, cls, Uri.class}, Void.TYPE).isSupported) {
            return;
        }
        if (context == null) {
            Log.d(TAG, "context is null");
            return;
        }
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = null;
        try {
            try {
                try {
                    parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "rw");
                    copyExifAttributes(aVar, new a(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()), i10, i11);
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (IOException e10) {
                    Log.d(TAG, e10.getMessage());
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                }
            } catch (Throwable th2) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (IOException e11) {
                        Log.d(TAG, e11.getMessage(), e11);
                    }
                }
                throw th2;
            }
        } catch (IOException e12) {
            Log.d(TAG, e12.getMessage(), e12);
        }
    }

    public static void copyExif(a aVar, int i10, int i11, String str) throws Throwable {
        Object[] objArr = {aVar, new Integer(i10), new Integer(i11), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 50934, new Class[]{a.class, cls, cls, String.class}, Void.TYPE).isSupported) {
            return;
        }
        try {
            copyExifAttributes(aVar, new a(str), i10, i11);
        } catch (IOException e10) {
            Log.d(TAG, e10.getMessage());
        }
    }

    private static void copyExifAttributes(a aVar, a aVar2, int i10, int i11) throws Throwable {
        Object[] objArr = {aVar, aVar2, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 50938, new Class[]{a.class, a.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        String[] strArr = {a.f23384v0, a.U, a.f23319n0, a.f23375u0, a.P0, a.R0, a.D1, a.C1, a.f23217a2, a.f23421z1, a.f23412y1, a.B1, a.A1, a.Y1, a.E1, a.f23420z0, a.W, a.X, a.f23351r0, a.f23367t0, a.f23359s0, a.f23256f1};
        for (int i12 = 0; i12 < 22; i12++) {
            String str = strArr[i12];
            String strI = aVar.i(str);
            if (!TextUtils.isEmpty(strI)) {
                aVar2.v0(str, strI);
            }
        }
        aVar2.v0(a.f23401x, String.valueOf(i10));
        aVar2.v0(a.f23410y, String.valueOf(i11));
        aVar2.v0(a.C, "0");
        aVar2.q0();
    }

    private static boolean handles(int i10) {
        return (i10 & EXIF_MAGIC_NUMBER) == EXIF_MAGIC_NUMBER || i10 == MOTOROLA_TIFF_MAGIC_NUMBER || i10 == INTEL_TIFF_MAGIC_NUMBER;
    }

    private boolean hasJpegExifPreamble(byte[] bArr, int i10) {
        boolean z10 = bArr != null && i10 > JPEG_EXIF_SEGMENT_PREAMBLE_BYTES.length;
        if (z10) {
            int i11 = 0;
            while (true) {
                byte[] bArr2 = JPEG_EXIF_SEGMENT_PREAMBLE_BYTES;
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

    private int moveToExifSegmentAndGetLength() throws IOException {
        short uInt8;
        int uInt16;
        long j10;
        long jSkip;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50932, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        do {
            short uInt9 = this.reader.getUInt8();
            if (uInt9 != 255) {
                if (Log.isLoggable(TAG, 3)) {
                    Log.d(TAG, "Unknown segmentId=" + ((int) uInt9));
                }
                return -1;
            }
            uInt8 = this.reader.getUInt8();
            if (uInt8 == 218) {
                return -1;
            }
            if (uInt8 == 217) {
                if (Log.isLoggable(TAG, 3)) {
                    Log.d(TAG, "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            uInt16 = this.reader.getUInt16() - 2;
            if (uInt8 == 225) {
                return uInt16;
            }
            j10 = uInt16;
            jSkip = this.reader.skip(j10);
        } while (jSkip == j10);
        if (Log.isLoggable(TAG, 3)) {
            Log.d(TAG, "Unable to skip enough data, type: " + ((int) uInt8) + ", wanted to skip: " + uInt16 + ", but actually skipped: " + jSkip);
        }
        return -1;
    }

    private static int parseExifSegment(RandomAccessReader randomAccessReader) {
        ByteOrder byteOrder;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{randomAccessReader}, null, changeQuickRedirect, true, 50933, new Class[]{RandomAccessReader.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        short int16 = randomAccessReader.getInt16(6);
        if (int16 == MOTOROLA_TIFF_MAGIC_NUMBER) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else if (int16 == INTEL_TIFF_MAGIC_NUMBER) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else {
            if (Log.isLoggable(TAG, 3)) {
                Log.d(TAG, "Unknown endianness = " + ((int) int16));
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        randomAccessReader.order(byteOrder);
        int int32 = randomAccessReader.getInt32(10) + 6;
        short int17 = randomAccessReader.getInt16(int32);
        for (int i10 = 0; i10 < int17; i10++) {
            int iCalcTagOffset = calcTagOffset(int32, i10);
            short int18 = randomAccessReader.getInt16(iCalcTagOffset);
            if (int18 == 274) {
                short int19 = randomAccessReader.getInt16(iCalcTagOffset + 2);
                if (int19 >= 1 && int19 <= 12) {
                    int int33 = randomAccessReader.getInt32(iCalcTagOffset + 4);
                    if (int33 >= 0) {
                        if (Log.isLoggable(TAG, 3)) {
                            Log.d(TAG, "Got tagIndex=" + i10 + " tagType=" + ((int) int18) + " formatCode=" + ((int) int19) + " componentCount=" + int33);
                        }
                        int i11 = int33 + BYTES_PER_FORMAT[int19];
                        if (i11 <= 4) {
                            int i12 = iCalcTagOffset + 8;
                            if (i12 >= 0 && i12 <= randomAccessReader.length()) {
                                if (i11 >= 0 && i11 + i12 <= randomAccessReader.length()) {
                                    return randomAccessReader.getInt16(i12);
                                }
                                if (Log.isLoggable(TAG, 3)) {
                                    Log.d(TAG, "Illegal number of bytes for TI tag data tagType=" + ((int) int18));
                                }
                            } else if (Log.isLoggable(TAG, 3)) {
                                Log.d(TAG, "Illegal tagValueOffset=" + i12 + " tagType=" + ((int) int18));
                            }
                        } else if (Log.isLoggable(TAG, 3)) {
                            Log.d(TAG, "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) int19));
                        }
                    } else if (Log.isLoggable(TAG, 3)) {
                        Log.d(TAG, "Negative tiff component count");
                    }
                } else if (Log.isLoggable(TAG, 3)) {
                    Log.d(TAG, "Got invalid format code = " + ((int) int19));
                }
            }
        }
        return -1;
    }

    private int parseExifSegment(byte[] bArr, int i10) throws IOException {
        Object[] objArr = {bArr, new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 50931, new Class[]{byte[].class, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int i11 = this.reader.read(bArr, i10);
        if (i11 == i10) {
            if (hasJpegExifPreamble(bArr, i10)) {
                return parseExifSegment(new RandomAccessReader(bArr, i10));
            }
            if (Log.isLoggable(TAG, 3)) {
                Log.d(TAG, "Missing jpeg exif preamble");
            }
            return -1;
        }
        if (Log.isLoggable(TAG, 3)) {
            Log.d(TAG, "Unable to read exif segment data, length: " + i10 + ", actually read: " + i11);
        }
        return -1;
    }

    public int getOrientation() throws IOException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50930, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int uInt16 = this.reader.getUInt16();
        if (handles(uInt16)) {
            int iMoveToExifSegmentAndGetLength = moveToExifSegmentAndGetLength();
            if (iMoveToExifSegmentAndGetLength != -1) {
                return parseExifSegment(new byte[iMoveToExifSegmentAndGetLength], iMoveToExifSegmentAndGetLength);
            }
            if (Log.isLoggable(TAG, 3)) {
                Log.d(TAG, "Failed to parse exif segment length, or exif segment not found");
            }
            return -1;
        }
        if (Log.isLoggable(TAG, 3)) {
            Log.d(TAG, "Parser doesn't handle magic number: " + uInt16);
        }
        return -1;
    }
}
