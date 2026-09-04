package com.tencent.rtmp;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.Surface;
import com.tencent.liteav.audio.TXAudioEffectManager;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.s;
import com.tencent.liteav.beauty.TXBeautyManager;
import com.tencent.liteav.live.TXLivePusherJni;
import com.tencent.rtmp.ui.TXCloudVideoView;
import com.tencent.ugc.TXRecordCommon;

/* JADX INFO: loaded from: classes4.dex */
public class TXLivePusher implements b {
    public static final int RGB_BGRA = 4;
    public static final int RGB_RGBA = 5;
    private static final String TAG = "TXLivePusher";
    public static final int YUV_420P = 3;
    public static final int YUV_420SP = 1;
    public static final int YUV_420YpCbCr = 2;
    private b mImpl;

    public interface AudioCustomProcessListener {
        void onRecordPcmData(byte[] bArr, long j10, int i10, int i11, int i12);

        void onRecordRawPcmData(byte[] bArr, long j10, int i10, int i11, int i12, boolean z10);
    }

    public interface ITXAudioVolumeEvaluationListener {
        void onAudioVolumeEvaluationNotify(int i10);
    }

    public interface ITXSnapshotListener {
        void onSnapshot(Bitmap bitmap);
    }

    @Deprecated
    public interface OnBGMNotify {
        void onBGMComplete(int i10);

        void onBGMProgress(long j10, long j11);

        void onBGMStart();
    }

    public interface VideoCustomProcessListener {
        void onDetectFacePoints(float[] fArr);

        int onTextureCustomProcess(int i10, int i11, int i12);

        void onTextureDestoryed();
    }

    static {
        s.a();
    }

    public TXLivePusher(Context context) {
        this.mImpl = new TXLivePusherJni(context);
        LiteavLog.i(TAG, "Create instance:" + this.mImpl.toString());
    }

    @Override // com.tencent.rtmp.b
    public synchronized void callExperimentalAPI(String str) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.callExperimentalAPI(str);
    }

    @Override // com.tencent.rtmp.b
    public synchronized void enableAudioVolumeEvaluation(int i10) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.enableAudioVolumeEvaluation(i10);
    }

    @Override // com.tencent.rtmp.b
    public synchronized TXAudioEffectManager getAudioEffectManager() {
        b bVar = this.mImpl;
        if (bVar == null) {
            return null;
        }
        return bVar.getAudioEffectManager();
    }

    @Override // com.tencent.rtmp.b
    public synchronized TXBeautyManager getBeautyManager() {
        b bVar = this.mImpl;
        if (bVar == null) {
            return null;
        }
        return bVar.getBeautyManager();
    }

    @Override // com.tencent.rtmp.b
    public synchronized TXLivePushConfig getConfig() {
        b bVar = this.mImpl;
        if (bVar == null) {
            return new TXLivePushConfig();
        }
        return bVar.getConfig();
    }

    @Override // com.tencent.rtmp.b
    public synchronized int getMaxZoom() {
        b bVar = this.mImpl;
        if (bVar == null) {
            return 0;
        }
        return bVar.getMaxZoom();
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized int getMusicDuration(String str) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return 0;
        }
        return bVar.getMusicDuration(str);
    }

    @Override // com.tencent.rtmp.b
    public synchronized boolean isPushing() {
        b bVar = this.mImpl;
        if (bVar == null) {
            return false;
        }
        return bVar.isPushing();
    }

    @Override // com.tencent.rtmp.b
    public synchronized void onLogRecord(String str) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.onLogRecord(str);
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized boolean pauseBGM() {
        b bVar = this.mImpl;
        if (bVar == null) {
            return false;
        }
        return bVar.pauseBGM();
    }

    @Override // com.tencent.rtmp.b
    public synchronized void pausePusher() {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.pausePusher();
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized boolean playBGM(String str) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return false;
        }
        return bVar.playBGM(str);
    }

    @Override // com.tencent.rtmp.b
    public synchronized void release() {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.release();
        LiteavLog.i(TAG, "Release instance:" + this.mImpl.toString());
        this.mImpl = null;
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized boolean resumeBGM() {
        b bVar = this.mImpl;
        if (bVar == null) {
            return false;
        }
        return bVar.resumeBGM();
    }

    @Override // com.tencent.rtmp.b
    public synchronized void resumePusher() {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.resumePusher();
    }

    @Override // com.tencent.rtmp.b
    public synchronized void sendCustomPCMData(byte[] bArr) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.sendCustomPCMData(bArr);
    }

    @Override // com.tencent.rtmp.b
    public synchronized int sendCustomVideoData(byte[] bArr, int i10, int i11, int i12) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return -1;
        }
        return bVar.sendCustomVideoData(bArr, i10, i11, i12);
    }

    @Override // com.tencent.rtmp.b
    public synchronized int sendCustomVideoTexture(int i10, int i11, int i12) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return -1;
        }
        return bVar.sendCustomVideoTexture(i10, i11, i12);
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized void sendMessage(byte[] bArr) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.sendMessage(bArr);
    }

    @Override // com.tencent.rtmp.b
    public synchronized boolean sendMessageEx(byte[] bArr) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return false;
        }
        return bVar.sendMessageEx(bArr);
    }

    @Override // com.tencent.rtmp.b
    public synchronized void setAudioProcessListener(AudioCustomProcessListener audioCustomProcessListener) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setAudioProcessListener(audioCustomProcessListener);
    }

    @Override // com.tencent.rtmp.b
    public synchronized void setAudioVolumeEvaluationListener(ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setAudioVolumeEvaluationListener(iTXAudioVolumeEvaluationListener);
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized void setBGMNofify(OnBGMNotify onBGMNotify) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setBGMNofify(onBGMNotify);
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized void setBGMPitch(float f10) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setBGMPitch(f10);
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized boolean setBGMPosition(int i10) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return false;
        }
        return bVar.setBGMPosition(i10);
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized boolean setBGMVolume(float f10) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return false;
        }
        return bVar.setBGMVolume(f10);
    }

    @Override // com.tencent.rtmp.b
    public synchronized boolean setBeautyFilter(int i10, int i11, int i12, int i13) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return false;
        }
        return bVar.setBeautyFilter(i10, i11, i12, i13);
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized void setChinLevel(int i10) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setChinLevel(i10);
    }

    @Override // com.tencent.rtmp.b
    public synchronized void setConfig(TXLivePushConfig tXLivePushConfig) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setConfig(tXLivePushConfig);
    }

    @Override // com.tencent.rtmp.b
    public synchronized void setExposureCompensation(float f10) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setExposureCompensation(f10);
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized void setEyeScaleLevel(int i10) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setEyeScaleLevel(i10);
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized void setFaceShortLevel(int i10) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setFaceShortLevel(i10);
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized void setFaceSlimLevel(int i10) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setFaceSlimLevel(i10);
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized void setFaceVLevel(int i10) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setFaceVLevel(i10);
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized void setFilter(Bitmap bitmap) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setFilter(bitmap);
    }

    @Override // com.tencent.rtmp.b
    public synchronized void setFocusPosition(float f10, float f11) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setFocusPosition(f10, f11);
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized boolean setGreenScreenFile(String str) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return false;
        }
        return bVar.setGreenScreenFile(str);
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized boolean setMicVolume(float f10) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return false;
        }
        return bVar.setMicVolume(f10);
    }

    @Override // com.tencent.rtmp.b
    public synchronized boolean setMirror(boolean z10) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return false;
        }
        return bVar.setMirror(z10);
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized void setMotionMute(boolean z10) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setMotionMute(z10);
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized void setMotionTmpl(String str) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setMotionTmpl(str);
    }

    @Override // com.tencent.rtmp.b
    public synchronized void setMute(boolean z10) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setMute(z10);
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized void setNoseSlimLevel(int i10) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setNoseSlimLevel(i10);
    }

    @Override // com.tencent.rtmp.b
    public synchronized void setPushListener(ITXLivePushListener iTXLivePushListener) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setPushListener(iTXLivePushListener);
    }

    @Override // com.tencent.rtmp.b
    public synchronized void setRenderRotation(int i10) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setRenderRotation(i10);
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized void setReverb(int i10) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setReverb(i10);
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized void setSpecialRatio(float f10) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setSpecialRatio(f10);
    }

    @Override // com.tencent.rtmp.b
    public synchronized void setSurface(Surface surface) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setSurface(surface);
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized void setSurfaceSize(int i10, int i11) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setSurfaceSize(i10, i11);
    }

    @Override // com.tencent.rtmp.b
    public synchronized void setVideoProcessListener(VideoCustomProcessListener videoCustomProcessListener) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setVideoProcessListener(videoCustomProcessListener);
    }

    @Override // com.tencent.rtmp.b
    public synchronized void setVideoQuality(int i10, boolean z10, boolean z11) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setVideoQuality(i10, z10, z11);
    }

    @Override // com.tencent.rtmp.b
    public synchronized void setVideoRecordListener(TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setVideoRecordListener(iTXVideoRecordListener);
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized void setVoiceChangerType(int i10) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setVoiceChangerType(i10);
    }

    @Override // com.tencent.rtmp.b
    public synchronized boolean setZoom(int i10) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return false;
        }
        return bVar.setZoom(i10);
    }

    @Override // com.tencent.rtmp.b
    public synchronized void snapshot(ITXSnapshotListener iTXSnapshotListener) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.snapshot(iTXSnapshotListener);
    }

    @Override // com.tencent.rtmp.b
    public synchronized void startCameraPreview(TXCloudVideoView tXCloudVideoView) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.startCameraPreview(tXCloudVideoView);
    }

    @Override // com.tencent.rtmp.b
    public synchronized int startPusher(String str) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return -1;
        }
        return bVar.startPusher(str);
    }

    @Override // com.tencent.rtmp.b
    public synchronized int startRecord(String str) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return -3;
        }
        return bVar.startRecord(str);
    }

    @Override // com.tencent.rtmp.b
    public synchronized void startScreenCapture() {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.startScreenCapture();
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized boolean stopBGM() {
        b bVar = this.mImpl;
        if (bVar == null) {
            return false;
        }
        return bVar.stopBGM();
    }

    @Override // com.tencent.rtmp.b
    public synchronized void stopCameraPreview(boolean z10) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.stopCameraPreview(z10);
    }

    @Override // com.tencent.rtmp.b
    public synchronized void stopPusher() {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.stopPusher();
    }

    @Override // com.tencent.rtmp.b
    public synchronized void stopRecord() {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.stopRecord();
    }

    @Override // com.tencent.rtmp.b
    public synchronized void stopScreenCapture() {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.stopScreenCapture();
    }

    @Override // com.tencent.rtmp.b
    public synchronized void switchCamera() {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.switchCamera();
    }

    @Override // com.tencent.rtmp.b
    public synchronized boolean turnOnFlashLight(boolean z10) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return false;
        }
        return bVar.turnOnFlashLight(z10);
    }
}
