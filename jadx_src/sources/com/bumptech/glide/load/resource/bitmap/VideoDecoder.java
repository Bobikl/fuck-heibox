package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaDataSource;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class VideoDecoder<T> implements com.bumptech.glide.load.g<T, Bitmap> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f41509d = "VideoDecoder";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f41510e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @j1
    static final int f41511f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final com.bumptech.glide.load.e<Long> f41512g = com.bumptech.glide.load.e.b("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final com.bumptech.glide.load.e<Integer> f41513h = com.bumptech.glide.load.e.b("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final f f41514i = new f();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final List<String> f41515j = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f41516k = "video/webm";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e<T> f41517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.e f41518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f41519c;

    public static final class VideoDecoderException extends RuntimeException {
        private static final long serialVersionUID = -2556382523004027815L;

        VideoDecoderException() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    public class a implements com.bumptech.glide.load.e.b<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ByteBuffer f41520a = ByteBuffer.allocate(8);

        a() {
        }

        @Override // com.bumptech.glide.load.e.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@n0 byte[] bArr, @n0 Long l10, @n0 MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f41520a) {
                this.f41520a.position(0);
                messageDigest.update(this.f41520a.putLong(l10.longValue()).array());
            }
        }
    }

    public class b implements com.bumptech.glide.load.e.b<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ByteBuffer f41521a = ByteBuffer.allocate(4);

        b() {
        }

        @Override // com.bumptech.glide.load.e.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@n0 byte[] bArr, @n0 Integer num, @n0 MessageDigest messageDigest) {
            if (num == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.f41521a) {
                this.f41521a.position(0);
                messageDigest.update(this.f41521a.putInt(num.intValue()).array());
            }
        }
    }

    @w0(16)
    public static final class c implements e<AssetFileDescriptor> {
        private c() {
        }

        /* synthetic */ c(a aVar) {
            this();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(MediaExtractor mediaExtractor, AssetFileDescriptor assetFileDescriptor) throws IOException {
            mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }

    @w0(23)
    public static final class d implements e<ByteBuffer> {

        public class a extends MediaDataSource {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ByteBuffer f41522b;

            a(ByteBuffer byteBuffer) {
                this.f41522b = byteBuffer;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // android.media.MediaDataSource
            public long getSize() {
                return this.f41522b.limit();
            }

            @Override // android.media.MediaDataSource
            public int readAt(long j10, byte[] bArr, int i10, int i11) {
                if (j10 >= this.f41522b.limit()) {
                    return -1;
                }
                this.f41522b.position((int) j10);
                int iMin = Math.min(i11, this.f41522b.remaining());
                this.f41522b.get(bArr, i10, iMin);
                return iMin;
            }
        }

        d() {
        }

        private MediaDataSource c(ByteBuffer byteBuffer) {
            return new a(byteBuffer);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(MediaExtractor mediaExtractor, ByteBuffer byteBuffer) throws IOException {
            mediaExtractor.setDataSource(c(byteBuffer));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(c(byteBuffer));
        }
    }

    @j1
    public interface e<T> {
        @w0(16)
        void a(MediaExtractor mediaExtractor, T t10) throws IOException;

        void b(MediaMetadataRetriever mediaMetadataRetriever, T t10);
    }

    @j1
    public static class f {
        f() {
        }

        public MediaMetadataRetriever a() {
            return new MediaMetadataRetriever();
        }
    }

    public static final class g implements e<ParcelFileDescriptor> {
        g() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.e
        @w0(16)
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(MediaExtractor mediaExtractor, ParcelFileDescriptor parcelFileDescriptor) throws IOException {
            mediaExtractor.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    VideoDecoder(com.bumptech.glide.load.engine.bitmap_recycle.e eVar, e<T> eVar2) {
        this(eVar, eVar2, f41514i);
    }

    @j1
    VideoDecoder(com.bumptech.glide.load.engine.bitmap_recycle.e eVar, e<T> eVar2, f fVar) {
        this.f41518b = eVar;
        this.f41517a = eVar2;
        this.f41519c = fVar;
    }

    @w0(16)
    public static com.bumptech.glide.load.g<AssetFileDescriptor, Bitmap> c(com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        return new VideoDecoder(eVar, new c(null));
    }

    @w0(api = 23)
    public static com.bumptech.glide.load.g<ByteBuffer, Bitmap> d(com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        return new VideoDecoder(eVar, new d());
    }

    @TargetApi(30)
    private static Bitmap e(MediaMetadataRetriever mediaMetadataRetriever, Bitmap bitmap) {
        if (!j()) {
            return bitmap;
        }
        boolean z10 = false;
        try {
            if (i(mediaMetadataRetriever) && Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) == 180) {
                z10 = true;
            }
        } catch (NumberFormatException unused) {
            if (Log.isLoggable(f41509d, 3)) {
                Log.d(f41509d, "Exception trying to extract HDR transfer function or rotation");
            }
        }
        if (!z10) {
            return bitmap;
        }
        if (Log.isLoggable(f41509d, 3)) {
            Log.d(f41509d, "Applying HDR 180 deg thumbnail correction");
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(180.0f, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    @p0
    private Bitmap f(@n0 T t10, MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10, int i11, int i12, DownsampleStrategy downsampleStrategy) {
        if (l(t10, mediaMetadataRetriever)) {
            throw new IllegalStateException("Cannot decode VP8 video on CrOS.");
        }
        Bitmap bitmapG = null;
        if (Build.VERSION.SDK_INT >= 27 && i11 != Integer.MIN_VALUE && i12 != Integer.MIN_VALUE && downsampleStrategy != DownsampleStrategy.f41499f) {
            bitmapG = h(mediaMetadataRetriever, j10, i10, i11, i12, downsampleStrategy);
        }
        if (bitmapG == null) {
            bitmapG = g(mediaMetadataRetriever, j10, i10);
        }
        Bitmap bitmapE = e(mediaMetadataRetriever, bitmapG);
        if (bitmapE != null) {
            return bitmapE;
        }
        throw new VideoDecoderException();
    }

    private static Bitmap g(MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10) {
        return mediaMetadataRetriever.getFrameAtTime(j10, i10);
    }

    @TargetApi(27)
    @p0
    private static Bitmap h(MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10, int i11, int i12, DownsampleStrategy downsampleStrategy) {
        try {
            int i13 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int i14 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int i15 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (i15 == 90 || i15 == 270) {
                i14 = i13;
                i13 = i14;
            }
            float fB = downsampleStrategy.b(i13, i14, i11, i12);
            return mediaMetadataRetriever.getScaledFrameAtTime(j10, i10, Math.round(i13 * fB), Math.round(fB * i14));
        } catch (Throwable th2) {
            if (!Log.isLoggable(f41509d, 3)) {
                return null;
            }
            Log.d(f41509d, "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame", th2);
            return null;
        }
    }

    @w0(30)
    private static boolean i(MediaMetadataRetriever mediaMetadataRetriever) throws NumberFormatException {
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(36);
        String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
        int i10 = Integer.parseInt(strExtractMetadata);
        return (i10 == 7 || i10 == 6) && Integer.parseInt(strExtractMetadata2) == 6;
    }

    @j1
    static boolean j() {
        if (Build.MODEL.startsWith("Pixel") && Build.VERSION.SDK_INT == 33) {
            return k();
        }
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 30 && i10 < 33;
    }

    private static boolean k() {
        Iterator<String> it = f41515j.iterator();
        while (it.hasNext()) {
            if (Build.ID.startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005f A[Catch: all -> 0x006a, TRY_LEAVE, TryCatch #2 {all -> 0x006a, blocks: (B:27:0x0059, B:29:0x005f), top: B:41:0x0059 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0066 A[DONT_GENERATE] */
    private boolean l(@n0 T t10, MediaMetadataRetriever mediaMetadataRetriever) {
        String str = Build.DEVICE;
        if (!(str != null && str.matches(".+_cheets|cheets_.+"))) {
            return false;
        }
        MediaExtractor mediaExtractor = null;
        try {
            try {
                if (!"video/webm".equals(mediaMetadataRetriever.extractMetadata(12))) {
                    return false;
                }
                MediaExtractor mediaExtractor2 = new MediaExtractor();
                try {
                    this.f41517a.a(mediaExtractor2, t10);
                    int trackCount = mediaExtractor2.getTrackCount();
                    for (int i10 = 0; i10 < trackCount; i10++) {
                        if ("video/x-vnd.on2.vp8".equals(mediaExtractor2.getTrackFormat(i10).getString(org.apache.tools.ant.taskdefs.email.b.I))) {
                            mediaExtractor2.release();
                            return true;
                        }
                    }
                    mediaExtractor2.release();
                } catch (Throwable th2) {
                    th = th2;
                    mediaExtractor = mediaExtractor2;
                    if (Log.isLoggable(f41509d, 3)) {
                        Log.d(f41509d, "Exception trying to extract track info for a webm video on CrOS.", th);
                    }
                }
                return false;
                if (Log.isLoggable(f41509d, 3)) {
                    Log.d(f41509d, "Exception trying to extract track info for a webm video on CrOS.", th);
                }
                return false;
            } finally {
                if (mediaExtractor != null) {
                    mediaExtractor.release();
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static com.bumptech.glide.load.g<ParcelFileDescriptor, Bitmap> m(com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        return new VideoDecoder(eVar, new g());
    }

    @Override // com.bumptech.glide.load.g
    public boolean a(@n0 T t10, @n0 com.bumptech.glide.load.f fVar) {
        return true;
    }

    @Override // com.bumptech.glide.load.g
    public com.bumptech.glide.load.engine.s<Bitmap> b(@n0 T t10, int i10, int i11, @n0 com.bumptech.glide.load.f fVar) throws IOException {
        long jLongValue = ((Long) fVar.c(f41512g)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + jLongValue);
        }
        Integer num = (Integer) fVar.c(f41513h);
        if (num == null) {
            num = 2;
        }
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) fVar.c(DownsampleStrategy.f41501h);
        if (downsampleStrategy == null) {
            downsampleStrategy = DownsampleStrategy.f41500g;
        }
        DownsampleStrategy downsampleStrategy2 = downsampleStrategy;
        MediaMetadataRetriever mediaMetadataRetrieverA = this.f41519c.a();
        try {
            this.f41517a.b(mediaMetadataRetrieverA, t10);
            return com.bumptech.glide.load.resource.bitmap.g.d(f(t10, mediaMetadataRetrieverA, jLongValue, num.intValue(), i10, i11, downsampleStrategy2), this.f41518b);
        } finally {
            if (Build.VERSION.SDK_INT >= 29) {
                mediaMetadataRetrieverA.close();
            } else {
                mediaMetadataRetrieverA.release();
            }
        }
    }
}
