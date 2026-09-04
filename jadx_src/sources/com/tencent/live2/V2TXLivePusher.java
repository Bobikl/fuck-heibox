package com.tencent.live2;

import android.graphics.Bitmap;
import android.view.SurfaceView;
import android.view.TextureView;
import com.tencent.liteav.audio.TXAudioEffectManager;
import com.tencent.liteav.beauty.TXBeautyManager;
import com.tencent.liteav.device.TXDeviceManager;
import com.tencent.rtmp.ui.TXCloudVideoView;

/* JADX INFO: loaded from: classes4.dex */
public abstract class V2TXLivePusher {
    public abstract int enableAudioProcessObserver(boolean z10, V2TXLiveDef.V2TXLiveAudioFrameObserverFormat v2TXLiveAudioFrameObserverFormat);

    public abstract int enableCustomAudioCapture(boolean z10);

    public abstract int enableCustomVideoCapture(boolean z10);

    public abstract int enableCustomVideoProcess(boolean z10, V2TXLiveDef.V2TXLivePixelFormat v2TXLivePixelFormat, V2TXLiveDef.V2TXLiveBufferType v2TXLiveBufferType);

    public abstract void enableVoiceActivityDetection(boolean z10);

    public abstract int enableVolumeEvaluation(int i10);

    public abstract TXAudioEffectManager getAudioEffectManager();

    public abstract TXBeautyManager getBeautyManager();

    public abstract TXDeviceManager getDeviceManager();

    public abstract int isPushing();

    public abstract int pauseAudio();

    public abstract int pauseVideo();

    public abstract void release();

    public abstract int resumeAudio();

    public abstract int resumeVideo();

    public abstract int sendCustomAudioFrame(V2TXLiveDef.V2TXLiveAudioFrame v2TXLiveAudioFrame);

    public abstract int sendCustomVideoFrame(V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame);

    public abstract int sendSeiMessage(int i10, byte[] bArr);

    public abstract int setAudioQuality(V2TXLiveDef.V2TXLiveAudioQuality v2TXLiveAudioQuality);

    public abstract int setEncoderMirror(boolean z10);

    public abstract int setMixTranscodingConfig(V2TXLiveDef.V2TXLiveTranscodingConfig v2TXLiveTranscodingConfig);

    public abstract void setObserver(V2TXLivePusherObserver v2TXLivePusherObserver);

    public abstract int setProperty(String str, Object obj);

    public abstract int setRenderFillMode(V2TXLiveDef.V2TXLiveFillMode v2TXLiveFillMode);

    public abstract int setRenderMirror(V2TXLiveDef.V2TXLiveMirrorType v2TXLiveMirrorType);

    public abstract int setRenderRotation(V2TXLiveDef.V2TXLiveRotation v2TXLiveRotation);

    public abstract int setRenderView(SurfaceView surfaceView);

    public abstract int setRenderView(TextureView textureView);

    public abstract int setRenderView(TXCloudVideoView tXCloudVideoView);

    public abstract int setVideoQuality(V2TXLiveDef.V2TXLiveVideoEncoderParam v2TXLiveVideoEncoderParam);

    public abstract int setWatermark(Bitmap bitmap, float f10, float f11, float f12);

    public abstract void showDebugView(boolean z10);

    public abstract int snapshot();

    public abstract int startCamera(boolean z10);

    public abstract int startLocalRecording(V2TXLiveDef.V2TXLiveLocalRecordingParams v2TXLiveLocalRecordingParams);

    public abstract int startMicrophone();

    public abstract int startPush(String str);

    public abstract int startScreenCapture();

    public abstract int startSystemAudioLoopback();

    public abstract int startVirtualCamera(Bitmap bitmap);

    public abstract int stopCamera();

    public abstract void stopLocalRecording();

    public abstract int stopMicrophone();

    public abstract int stopPush();

    public abstract int stopScreenCapture();

    public abstract int stopSystemAudioLoopback();

    public abstract int stopVirtualCamera();
}
