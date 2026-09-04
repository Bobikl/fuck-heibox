package com.tencent.live2.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.SurfaceView;
import android.view.TextureView;
import com.tencent.liteav.audio.TXAudioEffectManager;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.s;
import com.tencent.liteav.beauty.TXBeautyManager;
import com.tencent.liteav.device.TXDeviceManager;
import com.tencent.liteav.live.V2TXLivePusherJni;
import com.tencent.live2.V2TXLiveDef;
import com.tencent.live2.V2TXLivePusher;
import com.tencent.live2.V2TXLivePusherObserver;
import com.tencent.rtmp.ui.TXCloudVideoView;

/* JADX INFO: loaded from: classes4.dex */
public class V2TXLivePusherImpl extends V2TXLivePusher {
    private static final String TAG = "V2TXLivePusherImpl";
    private V2TXLivePusherJni mImpl;

    static {
        s.a();
    }

    private V2TXLivePusherImpl(Context context, int i10) {
        this.mImpl = new V2TXLivePusherJni(context, i10);
        LiteavLog.i(TAG, "Create instance:" + this.mImpl.toString());
    }

    public V2TXLivePusherImpl(Context context, V2TXLiveDef.V2TXLiveMode v2TXLiveMode) {
        this(context, v2TXLiveMode.ordinal());
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int enableAudioProcessObserver(boolean z10, V2TXLiveDef.V2TXLiveAudioFrameObserverFormat v2TXLiveAudioFrameObserverFormat) {
        V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.enableAudioProcessObserver(z10, v2TXLiveAudioFrameObserverFormat);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int enableCustomAudioCapture(boolean z10) {
        V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.enableCustomAudioCapture(z10);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int enableCustomVideoCapture(boolean z10) {
        V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.enableCustomVideoCapture(z10);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int enableCustomVideoProcess(boolean z10, V2TXLiveDef.V2TXLivePixelFormat v2TXLivePixelFormat, V2TXLiveDef.V2TXLiveBufferType v2TXLiveBufferType) {
        return this.mImpl.enableCustomVideoProcess(z10, v2TXLivePixelFormat, v2TXLiveBufferType);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized void enableVoiceActivityDetection(boolean z10) {
        V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return;
        }
        v2TXLivePusherJni.enableVoiceActivityDetection(z10);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int enableVolumeEvaluation(int i10) {
        V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.enableVolumeEvaluation(i10);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized TXAudioEffectManager getAudioEffectManager() {
        V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return null;
        }
        return v2TXLivePusherJni.getAudioEffectManager();
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized TXBeautyManager getBeautyManager() {
        V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return null;
        }
        return v2TXLivePusherJni.getBeautyManager();
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized TXDeviceManager getDeviceManager() {
        V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return null;
        }
        return v2TXLivePusherJni.getDeviceManager();
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int isPushing() {
        V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.isPushing();
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int pauseAudio() {
        V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.pauseAudio();
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int pauseVideo() {
        V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.pauseVideo();
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized void release() {
        V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return;
        }
        v2TXLivePusherJni.release();
        LiteavLog.i(TAG, "Release instance:" + this.mImpl.toString());
        this.mImpl = null;
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int resumeAudio() {
        V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.resumeAudio();
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int resumeVideo() {
        V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.resumeVideo();
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int sendCustomAudioFrame(V2TXLiveDef.V2TXLiveAudioFrame v2TXLiveAudioFrame) {
        V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.sendCustomAudioFrame(v2TXLiveAudioFrame);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int sendCustomVideoFrame(V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.sendCustomVideoFrame(v2TXLiveVideoFrame);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int sendSeiMessage(int i10, byte[] bArr) {
        V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.sendSeiMessage(i10, bArr);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int setAudioQuality(V2TXLiveDef.V2TXLiveAudioQuality v2TXLiveAudioQuality) {
        V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.setAudioQuality(v2TXLiveAudioQuality);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int setEncoderMirror(boolean z10) {
        V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.setEncoderMirror(z10);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int setMixTranscodingConfig(V2TXLiveDef.V2TXLiveTranscodingConfig v2TXLiveTranscodingConfig) {
        V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.setMixTranscodingConfig(v2TXLiveTranscodingConfig);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized void setObserver(V2TXLivePusherObserver v2TXLivePusherObserver) {
        V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return;
        }
        v2TXLivePusherJni.setObserver(v2TXLivePusherObserver);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int setProperty(String str, Object obj) {
        V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.setProperty(str, obj);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int setRenderFillMode(V2TXLiveDef.V2TXLiveFillMode v2TXLiveFillMode) {
        V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.setRenderFillMode(v2TXLiveFillMode);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int setRenderMirror(V2TXLiveDef.V2TXLiveMirrorType v2TXLiveMirrorType) {
        V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.setRenderMirror(v2TXLiveMirrorType);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int setRenderRotation(V2TXLiveDef.V2TXLiveRotation v2TXLiveRotation) {
        V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.setRenderRotation(v2TXLiveRotation);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int setRenderView(SurfaceView surfaceView) {
        V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.setRenderView(surfaceView);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int setRenderView(TextureView textureView) {
        V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.setRenderView(textureView);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int setRenderView(TXCloudVideoView tXCloudVideoView) {
        V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.setRenderView(tXCloudVideoView);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int setVideoQuality(V2TXLiveDef.V2TXLiveVideoEncoderParam v2TXLiveVideoEncoderParam) {
        V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.setVideoQuality(v2TXLiveVideoEncoderParam);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int setWatermark(Bitmap bitmap, float f10, float f11, float f12) {
        V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.setWatermark(bitmap, f10, f11, f12);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized void showDebugView(boolean z10) {
        V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return;
        }
        v2TXLivePusherJni.showDebugView(z10);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int snapshot() {
        V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.snapshot();
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int startCamera(boolean z10) {
        V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.startCamera(z10);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int startLocalRecording(V2TXLiveDef.V2TXLiveLocalRecordingParams v2TXLiveLocalRecordingParams) {
        V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.startLocalRecording(v2TXLiveLocalRecordingParams);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int startMicrophone() {
        V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.startMicrophone();
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int startPush(String str) {
        V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.startPush(str);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int startScreenCapture() {
        V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.startScreenCapture();
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int startSystemAudioLoopback() {
        if (this.mImpl == null) {
            return -3;
        }
        if (LiteavSystemInfo.getSystemOSVersionInt() < 29) {
            LiteavLog.e(TAG, "current system don't support system audio loopback");
            return -4;
        }
        return this.mImpl.startSystemAudioLoopback();
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int startVirtualCamera(Bitmap bitmap) {
        V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.startVirtualCamera(bitmap);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int stopCamera() {
        V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.stopCamera();
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized void stopLocalRecording() {
        V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return;
        }
        v2TXLivePusherJni.stopLocalRecording();
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int stopMicrophone() {
        V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.stopMicrophone();
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int stopPush() {
        V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.stopPush();
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int stopScreenCapture() {
        V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.stopScreenCapture();
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int stopSystemAudioLoopback() {
        V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.stopSystemAudioLoopback();
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int stopVirtualCamera() {
        V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.stopVirtualCamera();
    }
}
