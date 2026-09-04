package com.ss.bytertc.base.media.screen;

import android.content.Context;
import android.os.Build;
import com.bytedance.realx.base.CalledByNative;
import com.bytedance.realx.base.ContextUtils;

/* JADX INFO: loaded from: classes10.dex */
public class ScreenAudioCaptureAndroid implements ScreenAudioCaptureObserver {
    private static final String TAG = "ScreenAudioCaptureAndroid";
    private Context mContext;
    private boolean mIsAudioCaptureWorking = false;
    private long mNativeCaptureObserver;

    @CalledByNative
    ScreenAudioCaptureAndroid(long j10) {
        this.mNativeCaptureObserver = j10;
    }

    @Override // com.ss.bytertc.base.media.screen.ScreenAudioCaptureObserver
    public void onAudioFrameCapture(byte[] bArr, int i10, int i11, int i12) {
        RTCScreenAudioNativeFunctions.nativeOnAuidoFrameCaptured(this.mNativeCaptureObserver, bArr, i10, i11, i12);
    }

    @Override // com.ss.bytertc.base.media.screen.ScreenAudioCaptureObserver
    public void onCapturerStarted() {
        RTCScreenAudioNativeFunctions.nativeOnCapturerStarted(this.mNativeCaptureObserver);
    }

    @Override // com.ss.bytertc.base.media.screen.ScreenAudioCaptureObserver
    public void onCapturerStopped() {
        RTCScreenAudioNativeFunctions.nativeOnCapturerStopped(this.mNativeCaptureObserver);
    }

    @CalledByNative
    public void release() {
        stopCapture();
        if (this.mContext == null || Build.VERSION.SDK_INT <= 28 || !RXScreenCaptureService.serviceStarted.get()) {
            return;
        }
        Context context = this.mContext;
        context.startForegroundService(RXScreenCaptureService.getServiceIntent(context, 8, null));
    }

    @CalledByNative
    public void startCapture() {
        Context applicationContext = ContextUtils.getApplicationContext();
        this.mContext = applicationContext;
        if (Build.VERSION.SDK_INT <= 28 || androidx.core.content.d.a(applicationContext, "android.permission.RECORD_AUDIO") != 0) {
            RTCScreenAudioNativeFunctions.nativeOnCapturerError(this.mNativeCaptureObserver, 1);
            return;
        }
        ScreenAudioCaptureAndroidManager.INSTANCE().initialize(this.mContext, this);
        if (RXScreenCaptureService.serviceStarted.get()) {
            Context context = this.mContext;
            context.startForegroundService(RXScreenCaptureService.getServiceIntent(context, 6, null));
        }
        this.mIsAudioCaptureWorking = true;
    }

    @CalledByNative
    public void stopCapture() {
        if (this.mIsAudioCaptureWorking) {
            if (Build.VERSION.SDK_INT > 28 && RXScreenCaptureService.serviceStarted.get()) {
                Context context = this.mContext;
                context.startForegroundService(RXScreenCaptureService.getServiceIntent(context, 7, null));
            }
            this.mIsAudioCaptureWorking = false;
        }
    }
}
