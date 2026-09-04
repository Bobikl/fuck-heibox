package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.annotation.j1;
import androidx.annotation.p0;
import androidx.annotation.w0;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.meituan.robust.Constants;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/* JADX INFO: compiled from: Downsampler.java */
/* JADX INFO: loaded from: classes6.dex */
public final class o {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final String f41571f = "Downsampler";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final com.bumptech.glide.load.e<DecodeFormat> f41572g = com.bumptech.glide.load.e.g("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", DecodeFormat.DEFAULT);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final com.bumptech.glide.load.e<PreferredColorSpace> f41573h = com.bumptech.glide.load.e.f("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final com.bumptech.glide.load.e<DownsampleStrategy> f41574i = DownsampleStrategy.f41501h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final com.bumptech.glide.load.e<Boolean> f41575j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final com.bumptech.glide.load.e<Boolean> f41576k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f41577l = "image/vnd.wap.wbmp";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f41578m = "image/x-ico";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Set<String> f41579n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final b f41580o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Set<ImageHeaderParser.ImageType> f41581p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Queue<BitmapFactory.Options> f41582q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.e f41583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DisplayMetrics f41584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.b f41585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<ImageHeaderParser> f41586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final u f41587e = u.c();

    /* JADX INFO: compiled from: Downsampler.java */
    public class a implements b {
        a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.o.b
        public void a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.o.b
        public void b(com.bumptech.glide.load.engine.bitmap_recycle.e eVar, Bitmap bitmap) {
        }
    }

    /* JADX INFO: compiled from: Downsampler.java */
    public interface b {
        void a();

        void b(com.bumptech.glide.load.engine.bitmap_recycle.e eVar, Bitmap bitmap) throws IOException;
    }

    static {
        Boolean bool = Boolean.FALSE;
        f41575j = com.bumptech.glide.load.e.g("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f41576k = com.bumptech.glide.load.e.g("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        f41579n = Collections.unmodifiableSet(new HashSet(Arrays.asList(f41577l, f41578m)));
        f41580o = new a();
        f41581p = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        f41582q = com.bumptech.glide.util.o.g(0);
    }

    public o(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, com.bumptech.glide.load.engine.bitmap_recycle.e eVar, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this.f41586d = list;
        this.f41584b = (DisplayMetrics) com.bumptech.glide.util.m.e(displayMetrics);
        this.f41583a = (com.bumptech.glide.load.engine.bitmap_recycle.e) com.bumptech.glide.util.m.e(eVar);
        this.f41585c = (com.bumptech.glide.load.engine.bitmap_recycle.b) com.bumptech.glide.util.m.e(bVar);
    }

    private static int A(double d10) {
        return (int) (d10 + 0.5d);
    }

    @TargetApi(26)
    private static void B(BitmapFactory.Options options, com.bumptech.glide.load.engine.bitmap_recycle.e eVar, int i10, int i11) {
        Bitmap.Config config;
        if (Build.VERSION.SDK_INT < 26) {
            config = null;
        } else if (options.inPreferredConfig == Bitmap.Config.HARDWARE) {
            return;
        } else {
            config = options.outConfig;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = eVar.f(i10, i11, config);
    }

    private boolean C(ImageHeaderParser.ImageType imageType) {
        return true;
    }

    private static int a(double d10) {
        int iO = o(d10);
        int iA = A(((double) iO) * d10);
        return A((d10 / ((double) (iA / iO))) * ((double) iA));
    }

    private void b(v vVar, DecodeFormat decodeFormat, boolean z10, boolean z11, BitmapFactory.Options options, int i10, int i11) {
        if (this.f41587e.h(i10, i11, options, z10, z11)) {
            return;
        }
        if (decodeFormat == DecodeFormat.PREFER_ARGB_8888) {
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            return;
        }
        boolean zHasAlpha = false;
        try {
            zHasAlpha = vVar.d().hasAlpha();
        } catch (IOException e10) {
            if (Log.isLoggable(f41571f, 3)) {
                Log.d(f41571f, "Cannot determine whether the image has alpha or not from header, format " + decodeFormat, e10);
            }
        }
        Bitmap.Config config = zHasAlpha ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
        options.inPreferredConfig = config;
        if (config == Bitmap.Config.RGB_565) {
            options.inDither = true;
        }
    }

    private static void c(ImageHeaderParser.ImageType imageType, v vVar, b bVar, com.bumptech.glide.load.engine.bitmap_recycle.e eVar, DownsampleStrategy downsampleStrategy, int i10, int i11, int i12, int i13, int i14, BitmapFactory.Options options) throws IOException {
        int i15;
        int i16;
        int i17;
        int iFloor;
        double dFloor;
        int iRound;
        if (i11 <= 0 || i12 <= 0) {
            if (Log.isLoggable(f41571f, 3)) {
                Log.d(f41571f, "Unable to determine dimensions for: " + imageType + " with target [" + i13 + "x" + i14 + "]");
                return;
            }
            return;
        }
        if (u(i10)) {
            i16 = i11;
            i15 = i12;
        } else {
            i15 = i11;
            i16 = i12;
        }
        float fB = downsampleStrategy.b(i15, i16, i13, i14);
        if (fB <= 0.0f) {
            throw new IllegalArgumentException("Cannot scale with factor: " + fB + " from: " + downsampleStrategy + ", source: [" + i11 + "x" + i12 + "], target: [" + i13 + "x" + i14 + "]");
        }
        DownsampleStrategy.SampleSizeRounding sampleSizeRoundingA = downsampleStrategy.a(i15, i16, i13, i14);
        if (sampleSizeRoundingA == null) {
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        float f10 = i15;
        float f11 = i16;
        int iA = i15 / A(fB * f10);
        int iA2 = i16 / A(fB * f11);
        DownsampleStrategy.SampleSizeRounding sampleSizeRounding = DownsampleStrategy.SampleSizeRounding.MEMORY;
        int iMax = sampleSizeRoundingA == sampleSizeRounding ? Math.max(iA, iA2) : Math.min(iA, iA2);
        int i18 = Build.VERSION.SDK_INT;
        if (i18 > 23 || !f41579n.contains(options.outMimeType)) {
            int iMax2 = Math.max(1, Integer.highestOneBit(iMax));
            if (sampleSizeRoundingA == sampleSizeRounding && iMax2 < 1.0f / fB) {
                iMax2 <<= 1;
            }
            i17 = iMax2;
        } else {
            i17 = 1;
        }
        options.inSampleSize = i17;
        if (imageType == ImageHeaderParser.ImageType.JPEG) {
            float fMin = Math.min(i17, 8);
            iFloor = (int) Math.ceil(f10 / fMin);
            iRound = (int) Math.ceil(f11 / fMin);
            int i19 = i17 / 8;
            if (i19 > 0) {
                iFloor /= i19;
                iRound /= i19;
            }
        } else {
            if (imageType == ImageHeaderParser.ImageType.PNG || imageType == ImageHeaderParser.ImageType.PNG_A) {
                float f12 = i17;
                iFloor = (int) Math.floor(f10 / f12);
                dFloor = Math.floor(f11 / f12);
            } else if (imageType.isWebp()) {
                if (i18 >= 24) {
                    float f13 = i17;
                    iFloor = Math.round(f10 / f13);
                    iRound = Math.round(f11 / f13);
                } else {
                    float f14 = i17;
                    iFloor = (int) Math.floor(f10 / f14);
                    dFloor = Math.floor(f11 / f14);
                }
            } else if (i15 % i17 == 0 && i16 % i17 == 0) {
                iFloor = i15 / i17;
                iRound = i16 / i17;
            } else {
                int[] iArrP = p(vVar, options, bVar, eVar);
                iFloor = iArrP[0];
                iRound = iArrP[1];
            }
            iRound = (int) dFloor;
        }
        double dB = downsampleStrategy.b(iFloor, iRound, i13, i14);
        options.inTargetDensity = a(dB);
        options.inDensity = o(dB);
        if (v(options)) {
            options.inScaled = true;
        } else {
            options.inTargetDensity = 0;
            options.inDensity = 0;
        }
        if (Log.isLoggable(f41571f, 2)) {
            Log.v(f41571f, "Calculate scaling, source: [" + i11 + "x" + i12 + "], degreesToRotate: " + i10 + ", target: [" + i13 + "x" + i14 + "], power of two scaled: [" + iFloor + "x" + iRound + "], exact scale factor: " + fB + ", power of 2 sample size: " + i17 + ", adjusted scale factor: " + dB + ", target density: " + options.inTargetDensity + ", density: " + options.inDensity);
        }
    }

    private com.bumptech.glide.load.engine.s<Bitmap> e(v vVar, int i10, int i11, com.bumptech.glide.load.f fVar, b bVar) throws IOException {
        byte[] bArr = (byte[]) this.f41585c.c(65536, byte[].class);
        BitmapFactory.Options optionsN = n();
        optionsN.inTempStorage = bArr;
        DecodeFormat decodeFormat = (DecodeFormat) fVar.c(f41572g);
        PreferredColorSpace preferredColorSpace = (PreferredColorSpace) fVar.c(f41573h);
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) fVar.c(DownsampleStrategy.f41501h);
        boolean zBooleanValue = ((Boolean) fVar.c(f41575j)).booleanValue();
        com.bumptech.glide.load.e<Boolean> eVar = f41576k;
        try {
            return g.d(k(vVar, optionsN, downsampleStrategy, decodeFormat, preferredColorSpace, fVar.c(eVar) != null && ((Boolean) fVar.c(eVar)).booleanValue(), i10, i11, zBooleanValue, bVar), this.f41583a);
        } finally {
            y(optionsN);
            this.f41585c.put(bArr);
        }
    }

    private Bitmap k(v vVar, BitmapFactory.Options options, DownsampleStrategy downsampleStrategy, DecodeFormat decodeFormat, PreferredColorSpace preferredColorSpace, boolean z10, int i10, int i11, boolean z11, b bVar) throws IOException {
        int i12;
        int i13;
        int i14;
        String str;
        ColorSpace colorSpace;
        int iRound;
        int iRound2;
        long jB = com.bumptech.glide.util.i.b();
        int[] iArrP = p(vVar, options, bVar, this.f41583a);
        boolean z12 = false;
        int i15 = iArrP[0];
        int i16 = iArrP[1];
        String str2 = options.outMimeType;
        boolean z13 = (i15 == -1 || i16 == -1) ? false : z10;
        int iB = vVar.b();
        int iJ = d0.j(iB);
        boolean zM = d0.m(iB);
        if (i10 == Integer.MIN_VALUE) {
            i12 = i11;
            i13 = u(iJ) ? i16 : i15;
        } else {
            i12 = i11;
            i13 = i10;
        }
        if (i12 == Integer.MIN_VALUE) {
            i14 = u(iJ) ? i15 : i16;
        } else {
            i14 = i12;
        }
        ImageHeaderParser.ImageType imageTypeD = vVar.d();
        c(imageTypeD, vVar, bVar, this.f41583a, downsampleStrategy, iJ, i15, i16, i13, i14, options);
        b(vVar, decodeFormat, z13, zM, options, i13, i14);
        int i17 = Build.VERSION.SDK_INT;
        int i18 = options.inSampleSize;
        if (C(imageTypeD)) {
            if (i15 < 0 || i16 < 0 || !z11) {
                float f10 = v(options) ? options.inTargetDensity / options.inDensity : 1.0f;
                int i19 = options.inSampleSize;
                float f11 = i19;
                int iCeil = (int) Math.ceil(i15 / f11);
                int iCeil2 = (int) Math.ceil(i16 / f11);
                iRound = Math.round(iCeil * f10);
                iRound2 = Math.round(iCeil2 * f10);
                str = f41571f;
                if (Log.isLoggable(str, 2)) {
                    Log.v(str, "Calculated target [" + iRound + "x" + iRound2 + "] for source [" + i15 + "x" + i16 + "], sampleSize: " + i19 + ", targetDensity: " + options.inTargetDensity + ", density: " + options.inDensity + ", density multiplier: " + f10);
                }
            } else {
                str = f41571f;
                iRound = i13;
                iRound2 = i14;
            }
            if (iRound > 0 && iRound2 > 0) {
                B(options, this.f41583a, iRound, iRound2);
            }
        } else {
            str = f41571f;
        }
        if (preferredColorSpace != null) {
            if (i17 >= 28) {
                if (preferredColorSpace == PreferredColorSpace.DISPLAY_P3 && (colorSpace = options.outColorSpace) != null && colorSpace.isWideGamut()) {
                    z12 = true;
                }
                options.inPreferredColorSpace = ColorSpace.get(z12 ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
            } else if (i17 >= 26) {
                options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
        }
        Bitmap bitmapL = l(vVar, options, bVar, this.f41583a);
        bVar.b(this.f41583a, bitmapL);
        if (Log.isLoggable(str, 2)) {
            w(i15, i16, str2, options, bitmapL, i10, i11, jB);
        }
        Bitmap bitmapO = null;
        if (bitmapL != null) {
            bitmapL.setDensity(this.f41584b.densityDpi);
            bitmapO = d0.o(this.f41583a, bitmapL, iB);
            if (!bitmapL.equals(bitmapO)) {
                this.f41583a.d(bitmapL);
            }
        }
        return bitmapO;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        throw r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Bitmap l(com.bumptech.glide.load.resource.bitmap.v r5, android.graphics.BitmapFactory.Options r6, com.bumptech.glide.load.resource.bitmap.o.b r7, com.bumptech.glide.load.engine.bitmap_recycle.e r8) throws java.io.IOException {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r6.inJustDecodeBounds
            if (r1 != 0) goto Lc
            r7.a()
            r5.a()
        Lc:
            int r1 = r6.outWidth
            int r2 = r6.outHeight
            java.lang.String r3 = r6.outMimeType
            java.util.concurrent.locks.Lock r4 = com.bumptech.glide.load.resource.bitmap.d0.i()
            r4.lock()
            android.graphics.Bitmap r5 = r5.c(r6)     // Catch: java.lang.Throwable -> L25 java.lang.IllegalArgumentException -> L27
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.resource.bitmap.d0.i()
            r6.unlock()
            return r5
        L25:
            r5 = move-exception
            goto L50
        L27:
            r4 = move-exception
            java.io.IOException r1 = x(r4, r1, r2, r3, r6)     // Catch: java.lang.Throwable -> L25
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L38
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch: java.lang.Throwable -> L25
        L38:
            android.graphics.Bitmap r0 = r6.inBitmap     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L4f
            r8.d(r0)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L4e
            r0 = 0
            r6.inBitmap = r0     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L4e
            android.graphics.Bitmap r5 = l(r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L4e
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.resource.bitmap.d0.i()
            r6.unlock()
            return r5
        L4e:
            throw r1     // Catch: java.lang.Throwable -> L25
        L4f:
            throw r1     // Catch: java.lang.Throwable -> L25
        L50:
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.resource.bitmap.d0.i()
            r6.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.o.l(com.bumptech.glide.load.resource.bitmap.v, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.resource.bitmap.o$b, com.bumptech.glide.load.engine.bitmap_recycle.e):android.graphics.Bitmap");
    }

    @TargetApi(19)
    @p0
    private static String m(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return Constants.ARRAY_TYPE + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    private static synchronized BitmapFactory.Options n() {
        BitmapFactory.Options optionsPoll;
        Queue<BitmapFactory.Options> queue = f41582q;
        synchronized (queue) {
            optionsPoll = queue.poll();
        }
        if (optionsPoll == null) {
            optionsPoll = new BitmapFactory.Options();
            z(optionsPoll);
        }
        return optionsPoll;
    }

    private static int o(double d10) {
        if (d10 > 1.0d) {
            d10 = 1.0d / d10;
        }
        return (int) Math.round(d10 * 2.147483647E9d);
    }

    private static int[] p(v vVar, BitmapFactory.Options options, b bVar, com.bumptech.glide.load.engine.bitmap_recycle.e eVar) throws IOException {
        options.inJustDecodeBounds = true;
        l(vVar, options, bVar, eVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    private static String q(BitmapFactory.Options options) {
        return m(options.inBitmap);
    }

    private static boolean u(int i10) {
        return i10 == 90 || i10 == 270;
    }

    private static boolean v(BitmapFactory.Options options) {
        int i10;
        int i11 = options.inTargetDensity;
        return i11 > 0 && (i10 = options.inDensity) > 0 && i11 != i10;
    }

    private static void w(int i10, int i11, String str, BitmapFactory.Options options, Bitmap bitmap, int i12, int i13, long j10) {
        Log.v(f41571f, "Decoded " + m(bitmap) + " from [" + i10 + "x" + i11 + "] " + str + " with inBitmap " + q(options) + " for [" + i12 + "x" + i13 + "], sample size: " + options.inSampleSize + ", density: " + options.inDensity + ", target density: " + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + com.bumptech.glide.util.i.a(j10));
    }

    private static IOException x(IllegalArgumentException illegalArgumentException, int i10, int i11, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i10 + ", outHeight: " + i11 + ", outMimeType: " + str + ", inBitmap: " + q(options), illegalArgumentException);
    }

    private static void y(BitmapFactory.Options options) {
        z(options);
        Queue<BitmapFactory.Options> queue = f41582q;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    private static void z(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    @w0(21)
    public com.bumptech.glide.load.engine.s<Bitmap> d(ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, com.bumptech.glide.load.f fVar) throws IOException {
        return e(new v.e(parcelFileDescriptor, this.f41586d, this.f41585c), i10, i11, fVar, f41580o);
    }

    public com.bumptech.glide.load.engine.s<Bitmap> f(InputStream inputStream, int i10, int i11, com.bumptech.glide.load.f fVar) throws IOException {
        return g(inputStream, i10, i11, fVar, f41580o);
    }

    public com.bumptech.glide.load.engine.s<Bitmap> g(InputStream inputStream, int i10, int i11, com.bumptech.glide.load.f fVar, b bVar) throws IOException {
        return e(new v.d(inputStream, this.f41586d, this.f41585c), i10, i11, fVar, bVar);
    }

    public com.bumptech.glide.load.engine.s<Bitmap> h(ByteBuffer byteBuffer, int i10, int i11, com.bumptech.glide.load.f fVar) throws IOException {
        return e(new v.b(byteBuffer, this.f41586d, this.f41585c), i10, i11, fVar, f41580o);
    }

    @j1
    void i(File file, int i10, int i11, com.bumptech.glide.load.f fVar) throws IOException {
        e(new v.c(file, this.f41586d, this.f41585c), i10, i11, fVar, f41580o);
    }

    @j1
    void j(byte[] bArr, int i10, int i11, com.bumptech.glide.load.f fVar) throws IOException {
        e(new v.a(bArr, this.f41586d, this.f41585c), i10, i11, fVar, f41580o);
    }

    public boolean r(ParcelFileDescriptor parcelFileDescriptor) {
        return ParcelFileDescriptorRewinder.c();
    }

    public boolean s(InputStream inputStream) {
        return true;
    }

    public boolean t(ByteBuffer byteBuffer) {
        return true;
    }
}
