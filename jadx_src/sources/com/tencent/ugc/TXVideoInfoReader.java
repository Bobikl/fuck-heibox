package com.tencent.ugc;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.ugc.common.MediaExtractorBuilder;
import com.tencent.ugc.common.MediaRetrieverBuilder;
import com.tencent.ugc.retriver.FFmpegMediaRetriever;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public class TXVideoInfoReader {
    private static final int RETRY_MAX_COUNT = 3;
    private static TXVideoInfoReader sInstance;
    private final String TAG;
    private Context mContext;
    private int mCount;
    private a mGenerateImageThread;
    private volatile WeakReference<OnSampleProgrocess> mListener;
    private final Handler mMainHandler;
    private final AtomicInteger mRetryTimes;

    public interface OnSampleProgrocess {
        void sampleProcess(int i10, Bitmap bitmap);
    }

    public final class a extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f103223b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile Bitmap f103224c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f103225d;

        public a(String str) {
            this.f103225d = TXVideoInfoReader.this.mListener.hashCode();
            this.f103223b = str;
        }

        static /* synthetic */ void a(a aVar, String str) {
            TXVideoInfoReader tXVideoInfoReader = TXVideoInfoReader.this;
            tXVideoInfoReader.getSampleImages(tXVideoInfoReader.mCount, str, (OnSampleProgrocess) TXVideoInfoReader.this.mListener.get());
            TXVideoInfoReader.this.mRetryTimes.getAndIncrement();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() throws IOException {
            final OnSampleProgrocess onSampleProgrocess;
            MediaMetadataRetriever mediaMetadataRetrieverBuild = new MediaRetrieverBuilder().setPath(this.f103223b).build();
            long videoDurationMs = new FFmpegMediaRetriever().getVideoDurationMs() * 1000;
            long j10 = videoDurationMs / ((long) TXVideoInfoReader.this.mCount);
            LiteavLog.i("TXVideoInfoReader", "run duration = " + videoDurationMs + " count = " + TXVideoInfoReader.this.mCount);
            final int i10 = 0;
            while (true) {
                Bitmap bitmapCopy = null;
                if (i10 >= TXVideoInfoReader.this.mCount || Thread.currentThread().isInterrupted()) {
                    break;
                }
                long j11 = ((long) i10) * j10;
                if (j11 > videoDurationMs) {
                    j11 = videoDurationMs;
                }
                final Bitmap frameAtTime = mediaMetadataRetrieverBuild.getFrameAtTime(j11);
                if (frameAtTime == null) {
                    LiteavLog.w("TXVideoInfoReader", "getSampleImages failed!");
                    if (i10 == 0) {
                        final String str = this.f103223b;
                        if (TXVideoInfoReader.this.mRetryTimes.get() >= 3) {
                            break;
                        }
                        LiteavLog.i("TXVideoInfoReader", "retry to get sample images");
                        TXVideoInfoReader.this.mMainHandler.post(new Runnable(this, str) { // from class: com.tencent.ugc.ci

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            private final TXVideoInfoReader.a f103427a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            private final String f103428b;

                            {
                                this.f103427a = this;
                                this.f103428b = str;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                TXVideoInfoReader.a.a(this.f103427a, this.f103428b);
                            }
                        });
                        break;
                    }
                    if (this.f103224c != null && !this.f103224c.isRecycled()) {
                        LiteavLog.i("TXVideoInfoReader", "copy last image");
                        bitmapCopy = this.f103224c.copy(this.f103224c.getConfig(), true);
                    }
                    frameAtTime = bitmapCopy;
                }
                this.f103224c = frameAtTime;
                TXVideoInfoReader.this.mRetryTimes.set(0);
                if (TXVideoInfoReader.this.mListener != null && TXVideoInfoReader.this.mCount > 0 && TXVideoInfoReader.this.mListener.hashCode() == this.f103225d && (onSampleProgrocess = (OnSampleProgrocess) TXVideoInfoReader.this.mListener.get()) != null) {
                    TXVideoInfoReader.this.mMainHandler.post(new Runnable(onSampleProgrocess, i10, frameAtTime) { // from class: com.tencent.ugc.ch

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        private final TXVideoInfoReader.OnSampleProgrocess f103424a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        private final int f103425b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        private final Bitmap f103426c;

                        {
                            this.f103424a = onSampleProgrocess;
                            this.f103425b = i10;
                            this.f103426c = frameAtTime;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f103424a.sampleProcess(this.f103425b, this.f103426c);
                        }
                    });
                }
                i10++;
            }
            this.f103224c = null;
            mediaMetadataRetrieverBuild.release();
        }
    }

    private TXVideoInfoReader() {
        this.TAG = "TXVideoInfoReader";
        this.mRetryTimes = new AtomicInteger(0);
        this.mMainHandler = new Handler(Looper.getMainLooper());
    }

    private TXVideoInfoReader(Context context) {
        this.TAG = "TXVideoInfoReader";
        Context applicationContext = context.getApplicationContext();
        this.mContext = applicationContext;
        ContextUtils.initApplicationContext(applicationContext);
        ContextUtils.setDataDirectorySuffix("liteav");
        this.mRetryTimes = new AtomicInteger(0);
        this.mMainHandler = new Handler(Looper.getMainLooper());
    }

    private void cancelThread() {
        a aVar = this.mGenerateImageThread;
        if (aVar == null || !aVar.isAlive() || this.mGenerateImageThread.isInterrupted()) {
            return;
        }
        LiteavLog.i("TXVideoInfoReader", "cancelThread: thread cancel");
        this.mGenerateImageThread.interrupt();
        this.mGenerateImageThread = null;
    }

    private long getContentUrlFileSize(String str) throws Throwable {
        FileInputStream fileInputStream;
        Uri uri = Uri.parse(str);
        ParcelFileDescriptor parcelFileDescriptor = null;
        try {
            Context context = this.mContext;
            if (context == null) {
                com.tencent.liteav.base.util.f.a((Closeable) null);
                com.tencent.liteav.base.util.f.a((Closeable) null);
                return 0L;
            }
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r");
            try {
                fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    long jAvailable = fileInputStream.available();
                    com.tencent.liteav.base.util.f.a(parcelFileDescriptorOpenFileDescriptor);
                    com.tencent.liteav.base.util.f.a(fileInputStream);
                    return jAvailable;
                } catch (Exception unused) {
                    parcelFileDescriptor = parcelFileDescriptorOpenFileDescriptor;
                    LiteavLog.e("TXVideoInfoReader", "getVideoFileInfo  not found , uri = ".concat(String.valueOf(uri)));
                    com.tencent.liteav.base.util.f.a(parcelFileDescriptor);
                    com.tencent.liteav.base.util.f.a(fileInputStream);
                    return 0L;
                } catch (Throwable th2) {
                    th = th2;
                    parcelFileDescriptor = parcelFileDescriptorOpenFileDescriptor;
                    com.tencent.liteav.base.util.f.a(parcelFileDescriptor);
                    com.tencent.liteav.base.util.f.a(fileInputStream);
                    throw th;
                }
            } catch (Exception unused2) {
                fileInputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = null;
            }
        } catch (Exception unused3) {
            fileInputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
        }
        try {
            LiteavLog.e("TXVideoInfoReader", "getVideoFileInfo  not found , uri = ".concat(String.valueOf(uri)));
            com.tencent.liteav.base.util.f.a(parcelFileDescriptor);
            com.tencent.liteav.base.util.f.a(fileInputStream);
            return 0L;
        } catch (Throwable th5) {
            th = th5;
            com.tencent.liteav.base.util.f.a(parcelFileDescriptor);
            com.tencent.liteav.base.util.f.a(fileInputStream);
            throw th;
        }
    }

    @Deprecated
    public static TXVideoInfoReader getInstance() {
        if (sInstance == null) {
            sInstance = new TXVideoInfoReader();
        }
        return sInstance;
    }

    public static TXVideoInfoReader getInstance(Context context) {
        if (sInstance == null) {
            sInstance = new TXVideoInfoReader(context);
        }
        return sInstance;
    }

    public void cancel() {
        LiteavLog.i("TXVideoInfoReader", "cancel");
        cancelThread();
        this.mMainHandler.removeCallbacksAndMessages(null);
        if (this.mListener != null) {
            this.mListener.clear();
            this.mListener = null;
        }
    }

    public Bitmap getSampleImage(long j10, String str) {
        if (TextUtils.isEmpty(str)) {
            LiteavLog.w("TXVideoInfoReader", "videoPath is null");
            return null;
        }
        if (!new File(str).exists()) {
            LiteavLog.w("TXVideoInfoReader", "videoPath is not exist");
            return null;
        }
        FFmpegMediaRetriever fFmpegMediaRetriever = new FFmpegMediaRetriever();
        fFmpegMediaRetriever.setDataSource(str);
        long videoDurationMs = fFmpegMediaRetriever.getVideoDurationMs() * 1000;
        long j11 = j10 * 1000;
        if (j11 > videoDurationMs) {
            j11 = videoDurationMs;
        }
        if (videoDurationMs <= 0) {
            LiteavLog.w("TXVideoInfoReader", "video duration is 0");
            return null;
        }
        Bitmap frameAtTime = new MediaRetrieverBuilder().setPath(str).build().getFrameAtTime(j11);
        if (frameAtTime == null) {
            LiteavLog.e("TXVideoInfoReader", "getSampleImages failed!");
            return frameAtTime;
        }
        LiteavLog.i("TXVideoInfoReader", "getSampleImages bmp= " + frameAtTime + ",time= " + j11 + ",duration= " + videoDurationMs);
        return frameAtTime;
    }

    public void getSampleImages(int i10, String str, OnSampleProgrocess onSampleProgrocess) {
        this.mCount = i10;
        this.mListener = new WeakReference<>(onSampleProgrocess);
        if (TextUtils.isEmpty(str)) {
            LiteavLog.w("TXVideoInfoReader", "getSampleImages: videoPath is empty.");
            return;
        }
        if (!com.tencent.liteav.base.util.f.a(str)) {
            LiteavLog.w("TXVideoInfoReader", "getSampleImages: file is not exist.");
            return;
        }
        cancelThread();
        a aVar = new a(str);
        this.mGenerateImageThread = aVar;
        aVar.start();
        LiteavLog.i("TXVideoInfoReader", "getSampleImages: thread start");
    }

    public TXVideoEditConstants.TXVideoInfo getVideoFileInfo(String str) {
        LiteavLog.i("TXVideoInfoReader", "videoSource:".concat(String.valueOf(str)));
        if (LiteavSystemInfo.getSystemOSVersionInt() < 18) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            LiteavLog.e("TXVideoInfoReader", "videoSource is empty!!");
            return null;
        }
        if (!MediaExtractorBuilder.isContentUri(str)) {
            File file = new File(str);
            if (!file.exists() || !file.canRead()) {
                LiteavLog.e("TXVideoInfoReader", "getVideoFileInfo  file exist = " + file.exists() + " can read = " + file.canRead());
                return null;
            }
        }
        TXVideoEditConstants.TXVideoInfo tXVideoInfo = new TXVideoEditConstants.TXVideoInfo();
        FFmpegMediaRetriever fFmpegMediaRetriever = new FFmpegMediaRetriever();
        fFmpegMediaRetriever.setDataSource(str);
        tXVideoInfo.duration = fFmpegMediaRetriever.getVideoDurationMs();
        LiteavLog.i("TXVideoInfoReader", "getVideoFileInfo: duration = " + tXVideoInfo.duration);
        tXVideoInfo.coverImage = new MediaRetrieverBuilder().setPath(str).build().getFrameAtTime();
        tXVideoInfo.fps = fFmpegMediaRetriever.getFPS();
        tXVideoInfo.bitrate = (int) (fFmpegMediaRetriever.getVideoBitrate() / 1024);
        tXVideoInfo.audioSampleRate = fFmpegMediaRetriever.getSampleRate();
        int rotation = fFmpegMediaRetriever.getRotation();
        LiteavLog.i("TXVideoInfoReader", "rotation: ".concat(String.valueOf(rotation)));
        if (rotation == 90 || rotation == 270) {
            tXVideoInfo.width = fFmpegMediaRetriever.getVideoHeight();
            tXVideoInfo.height = fFmpegMediaRetriever.getVideoWidth();
        } else {
            tXVideoInfo.width = fFmpegMediaRetriever.getVideoWidth();
            tXVideoInfo.height = fFmpegMediaRetriever.getVideoHeight();
        }
        if (MediaExtractorBuilder.isContentUri(str)) {
            tXVideoInfo.fileSize = getContentUrlFileSize(str);
        } else {
            tXVideoInfo.fileSize = new File(str).length();
        }
        return tXVideoInfo;
    }
}
