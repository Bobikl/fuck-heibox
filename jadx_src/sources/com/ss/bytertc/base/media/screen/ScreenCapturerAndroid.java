package com.ss.bytertc.base.media.screen;

import android.annotation.TargetApi;
import android.app.ForegroundServiceStartNotAllowedException;
import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjection;
import android.os.Build;
import android.util.Log;
import com.bytedance.realx.base.ContextUtils;
import com.bytedance.realx.video.EglBase;
import com.bytedance.realx.video.VideoFrame;
import com.ss.bytertc.base.media.CapturerObserver;
import com.ss.bytertc.base.media.SurfaceTextureHelper;
import com.ss.bytertc.base.media.VideoCapturer;
import com.ss.bytertc.base.media.VideoSink;
import com.ss.bytertc.base.media.camera.m;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
@TargetApi(21)
public class ScreenCapturerAndroid implements VideoCapturer, VideoSink {
    private CapturerObserver capturerObserver;
    private Context mContext;
    private CountDownLatch mCountDownLatch;
    private boolean needStartService;

    public ScreenCapturerAndroid(Intent intent, MediaProjection.Callback callback) {
        this(intent, callback, true);
    }

    public ScreenCapturerAndroid(Intent intent, MediaProjection.Callback callback, boolean z10) {
        this.mCountDownLatch = new CountDownLatch(1);
        this.needStartService = true;
        this.capturerObserver = null;
        ScreenCaptureAndroidManager.INSTANCE().addLock(this.mCountDownLatch.hashCode(), this.mCountDownLatch);
        ScreenCaptureAndroidManager.INSTANCE().setData(intent, callback);
        this.needStartService = z10;
    }

    @Override // com.ss.bytertc.base.media.VideoCapturer
    public synchronized void changeCaptureFormat(int i10, int i11, int i12) {
        try {
            if (!this.needStartService || Build.VERSION.SDK_INT <= 28) {
                ScreenCaptureAndroidManager.INSTANCE().changeCaptureFormat(i10, i11, i12);
            } else {
                Intent intent = new Intent();
                intent.putExtra(RXScreenCaptureService.KEY_WIDTH, i10);
                intent.putExtra(RXScreenCaptureService.KEY_HEIGHT, i11);
                intent.putExtra(RXScreenCaptureService.KEY_IFRAMERATE, i12);
                try {
                    if (RXScreenCaptureService.serviceStarted.get()) {
                        Context context = this.mContext;
                        context.startForegroundService(RXScreenCaptureService.getServiceIntent(context, 3, intent));
                    }
                } catch (ForegroundServiceStartNotAllowedException unused) {
                    CapturerObserver capturerObserver = this.capturerObserver;
                    if (capturerObserver != null) {
                        capturerObserver.onCapturerError("Start foreground service failed.");
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.ss.bytertc.base.media.VideoCapturer
    public synchronized void dispose() {
        if (!this.needStartService || Build.VERSION.SDK_INT <= 28) {
            ScreenCaptureAndroidManager.INSTANCE().dispose();
        } else {
            Intent intent = new Intent();
            intent.putExtra(RXScreenCaptureService.KEY_HASHCODE, this.mCountDownLatch.hashCode());
            try {
                if (RXScreenCaptureService.serviceStarted.get()) {
                    Context context = this.mContext;
                    context.startForegroundService(RXScreenCaptureService.getServiceIntent(context, 5, intent));
                }
            } catch (ForegroundServiceStartNotAllowedException unused) {
                CapturerObserver capturerObserver = this.capturerObserver;
                if (capturerObserver != null) {
                    capturerObserver.onCapturerError("Start foreground service failed.");
                }
            }
            try {
                this.mCountDownLatch.await(1500L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e10) {
                e10.printStackTrace();
            }
            Log.i("ScreenCaptureAndroid", "dispose finish");
        }
    }

    @Override // com.ss.bytertc.base.media.VideoCapturer
    public int enableFollowGravity(boolean z10) {
        return -1;
    }

    @Override // com.ss.bytertc.base.media.VideoCapturer
    public float getCameraZoomMaxRatio() {
        return 1.0f;
    }

    @Override // com.ss.bytertc.base.media.VideoCapturer
    public int getDeviceOrientation() {
        return m.b(ContextUtils.getApplicationContext());
    }

    public MediaProjection getMediaProjection() {
        return ScreenCaptureAndroidManager.INSTANCE().getMediaProjection();
    }

    public synchronized void initialize(EglBase.Context context, Context context2, CapturerObserver capturerObserver) {
        this.mContext = context2;
        this.capturerObserver = capturerObserver;
        ScreenCaptureAndroidManager.INSTANCE().initialize(context, context2, capturerObserver);
    }

    @Override // com.ss.bytertc.base.media.VideoCapturer
    public synchronized void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver) {
        this.mContext = context;
        this.capturerObserver = capturerObserver;
        ScreenCaptureAndroidManager.INSTANCE().initialize(surfaceTextureHelper, context, capturerObserver);
    }

    @Override // com.ss.bytertc.base.media.VideoCapturer
    public boolean isCameraTorchSupported() {
        return false;
    }

    @Override // com.ss.bytertc.base.media.VideoCapturer
    public boolean isCameraZoomSupported() {
        return false;
    }

    @Override // com.ss.bytertc.base.media.VideoCapturer
    public boolean isScreencast() {
        return true;
    }

    @Override // com.ss.bytertc.base.media.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        if (!this.needStartService || Build.VERSION.SDK_INT <= 28) {
            ScreenCaptureAndroidManager.INSTANCE().onFrame(videoFrame);
            return;
        }
        int iAddFrame = ScreenCaptureAndroidManager.INSTANCE().addFrame(videoFrame);
        Intent intent = new Intent();
        intent.putExtra("i", iAddFrame);
        if (RXScreenCaptureService.serviceStarted.get()) {
            Context context = this.mContext;
            context.startForegroundService(RXScreenCaptureService.getServiceIntent(context, 4, intent));
        }
    }

    @Override // com.ss.bytertc.base.media.VideoCapturer
    public int setCameraZoomRatio(float f10) {
        return 0;
    }

    @Override // com.ss.bytertc.base.media.VideoCapturer
    public synchronized void startCapture(int i10, int i11, int i12) {
        startCapture(i10, i11, i12, 4);
    }

    @Override // com.ss.bytertc.base.media.VideoCapturer
    public synchronized void startCapture(int i10, int i11, int i12, int i13) {
        if (!this.needStartService || Build.VERSION.SDK_INT <= 28) {
            ScreenCaptureAndroidManager.INSTANCE().startCapture(i10, i11, i12, i13);
        } else {
            Intent intent = new Intent();
            intent.putExtra(RXScreenCaptureService.KEY_WIDTH, i10);
            intent.putExtra(RXScreenCaptureService.KEY_HEIGHT, i11);
            intent.putExtra(RXScreenCaptureService.KEY_IFRAMERATE, i12);
            if (i13 <= 0) {
                i13 = 4;
            }
            intent.putExtra(RXScreenCaptureService.KEY_MIN_FRAMERATE, i13);
            try {
                if (RXScreenCaptureService.serviceStarted.get()) {
                    Context context = this.mContext;
                    context.startForegroundService(RXScreenCaptureService.getServiceIntent(context, 1, intent));
                }
            } catch (ForegroundServiceStartNotAllowedException unused) {
                CapturerObserver capturerObserver = this.capturerObserver;
                if (capturerObserver != null) {
                    capturerObserver.onCapturerError("Start foreground service failed.");
                }
            }
        }
    }

    @Override // com.ss.bytertc.base.media.VideoCapturer
    public synchronized void stopCapture() {
        if (!this.needStartService || Build.VERSION.SDK_INT <= 28) {
            ScreenCaptureAndroidManager.INSTANCE().stopCapture();
        } else {
            try {
                if (RXScreenCaptureService.serviceStarted.get()) {
                    Context context = this.mContext;
                    context.startForegroundService(RXScreenCaptureService.getServiceIntent(context, 2, null));
                }
            } catch (ForegroundServiceStartNotAllowedException unused) {
                CapturerObserver capturerObserver = this.capturerObserver;
                if (capturerObserver != null) {
                    capturerObserver.onCapturerError("Start foreground service failed.");
                }
            }
        }
    }

    @Override // com.ss.bytertc.base.media.VideoCapturer
    public void turnOffFlashLight() {
    }

    @Override // com.ss.bytertc.base.media.VideoCapturer
    public void turnOnFlashLight() {
    }
}
