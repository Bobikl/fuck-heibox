package com.tencent.liteav.live;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Environment;
import android.text.TextUtils;
import android.view.Surface;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.videobase.DisplayTarget;
import com.tencent.rtmp.ITXLivePlayListener;
import com.tencent.rtmp.TXLivePlayConfig;
import com.tencent.rtmp.TXLivePlayer;
import com.tencent.rtmp.ui.TXCloudVideoView;
import com.tencent.ugc.TXRecordCommon;
import java.io.File;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav")
public class TXLivePlayerJni implements com.tencent.rtmp.a, TXCloudVideoView.b {
    private static final String TAG = "TXLivePlayerJni";
    private TXLivePlayer.ITXAudioRawDataListener mAudioRawDataListener;
    private TXLivePlayer.ITXAudioVolumeEvaluationListener mAudioVolumeEvaluationListener;
    private Object mGLContext = null;
    private ITXLivePlayListener mListener;
    protected long mNativeTXLivePlayerJni;
    private TXLivePlayer.ITXSnapshotListener mSnapshotListener;
    private TXLivePlayer.ITXVideoRawDataListener mVideoRawDataListener;
    private TXRecordCommon.ITXVideoRecordListener mVideoRecordListener;
    private TXLivePlayer.ITXLivePlayVideoRenderListener mVideoRenderListener;

    public TXLivePlayerJni(Context context) {
        this.mNativeTXLivePlayerJni = 0L;
        ContextUtils.initApplicationContext(context.getApplicationContext());
        ContextUtils.setDataDirectorySuffix("liteav");
        this.mNativeTXLivePlayerJni = nativeCreate(new WeakReference(this));
    }

    private static String genFilePath(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            String strValueOf = String.valueOf(System.currentTimeMillis() / 1000);
            String str2 = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date(Long.valueOf(strValueOf + "000").longValue()));
            String diskFileDir = getDiskFileDir(context);
            if (TextUtils.isEmpty(diskFileDir)) {
                return null;
            }
            return new File(diskFileDir, String.format("TXUGC_%s".concat(String.valueOf(str)), str2)).getAbsolutePath();
        } catch (Exception e10) {
            LiteavLog.e(TAG, "create file path failed.", e10);
            return null;
        }
    }

    private static String getDiskFileDir(Context context) {
        if (context == null) {
            return null;
        }
        if (!"mounted".equals(Environment.getExternalStorageState()) && Environment.isExternalStorageRemovable()) {
            return context.getFilesDir().getPath();
        }
        File externalFilesDir = context.getExternalFilesDir(Environment.DIRECTORY_MOVIES);
        return externalFilesDir != null ? externalFilesDir.getPath() : null;
    }

    public static String[] getMapKeys(Map<String, String> map) {
        String[] strArr = new String[map.size()];
        Iterator<String> it = map.keySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            strArr[i10] = it.next();
            i10++;
        }
        return strArr;
    }

    public static String[] getMapValues(Map<String, String> map, String[] strArr) {
        String[] strArr2 = new String[map.size()];
        int length = strArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            strArr2[i11] = map.get(strArr[i10]);
            i10++;
            i11++;
        }
        return strArr2;
    }

    private static native void nativeCallExperimentalAPI(long j10, String str);

    private static native long nativeCreate(WeakReference<TXLivePlayerJni> weakReference);

    private static native void nativeDestroy(long j10);

    private static native void nativeEnableAudioVolumeEvaluation(long j10, int i10);

    private static native void nativeEnableCustomAudioProcess(long j10, boolean z10);

    private static native void nativeEnableCustomRenderI420(long j10, boolean z10);

    private static native void nativeEnableCustomRenderTexture(long j10, boolean z10, Object obj);

    private static native void nativeEnableHardwareDecode(long j10, boolean z10);

    private static native long nativeGetCurrentRenderPts(long j10);

    private static native boolean nativeIsPlaying(long j10);

    private static native void nativePause(long j10);

    private static native void nativeResume(long j10);

    private static native void nativeSetAudioRoute(long j10, int i10);

    private static native void nativeSetConfig(long j10, float f10, float f11, float f12, int i10, int i11, int i12, boolean z10, boolean z11, boolean z12, String str, Map map);

    private static native void nativeSetMute(long j10, boolean z10);

    private static native void nativeSetPlayerView(long j10, DisplayTarget displayTarget);

    private static native void nativeSetRenderMode(long j10, int i10);

    private static native void nativeSetRenderRotation(long j10, int i10);

    private static native void nativeSetVolume(long j10, int i10);

    private static native void nativeShowDebugView(long j10, boolean z10);

    private static native void nativeSnapshot(long j10);

    private static native int nativeStartPlay(long j10, String str, int i10);

    private static native void nativeStartRecord(long j10, int i10, String str);

    private static native void nativeStopPlay(long j10, boolean z10);

    private static native void nativeStopRecord(long j10);

    private static native int nativeSwitchStream(long j10, String str);

    public static TXLivePlayerJni weakToStrongReference(WeakReference<TXLivePlayerJni> weakReference) {
        return weakReference.get();
    }

    public boolean addVideoRawData(byte[] bArr) {
        return false;
    }

    @Override // com.tencent.rtmp.a
    public void callExperimentalAPI(String str) {
        nativeCallExperimentalAPI(this.mNativeTXLivePlayerJni, str);
    }

    @Override // com.tencent.rtmp.a
    public void enableAudioVolumeEvaluation(int i10) {
        nativeEnableAudioVolumeEvaluation(this.mNativeTXLivePlayerJni, i10);
    }

    @Override // com.tencent.rtmp.a
    public boolean enableHardwareDecode(boolean z10) {
        nativeEnableHardwareDecode(this.mNativeTXLivePlayerJni, z10);
        return true;
    }

    protected void finalize() {
        nativeDestroy(this.mNativeTXLivePlayerJni);
    }

    @Override // com.tencent.rtmp.a
    public long getCurrentRenderPts() {
        return nativeGetCurrentRenderPts(this.mNativeTXLivePlayerJni);
    }

    @Override // com.tencent.rtmp.a
    public boolean isPlaying() {
        return nativeIsPlaying(this.mNativeTXLivePlayerJni);
    }

    public void onAudioInfoChanged(int i10, int i11, int i12) {
        TXLivePlayer.ITXAudioRawDataListener iTXAudioRawDataListener = this.mAudioRawDataListener;
        if (iTXAudioRawDataListener != null) {
            iTXAudioRawDataListener.onAudioInfoChanged(i10, i11, i12);
        }
    }

    public void onAudioVolumeEvaluationNotify(int i10) {
        TXLivePlayer.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener = this.mAudioVolumeEvaluationListener;
        if (iTXAudioVolumeEvaluationListener != null) {
            iTXAudioVolumeEvaluationListener.onAudioVolumeEvaluationNotify(i10);
        }
    }

    public void onNetStatus(Bundle bundle) {
        ITXLivePlayListener iTXLivePlayListener = this.mListener;
        if (iTXLivePlayListener != null) {
            iTXLivePlayListener.onNetStatus(bundle);
        }
    }

    public void onPcmDataAvailable(byte[] bArr, long j10) {
        TXLivePlayer.ITXAudioRawDataListener iTXAudioRawDataListener = this.mAudioRawDataListener;
        if (iTXAudioRawDataListener != null) {
            iTXAudioRawDataListener.onPcmDataAvailable(bArr, j10);
        }
    }

    public void onPlayEvent(int i10, Bundle bundle) {
        ITXLivePlayListener iTXLivePlayListener = this.mListener;
        if (iTXLivePlayListener != null) {
            iTXLivePlayListener.onPlayEvent(i10, bundle);
        }
    }

    public void onRecordComplete(int i10, String str, String str2, String str3) {
        TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener = this.mVideoRecordListener;
        if (iTXVideoRecordListener != null) {
            TXRecordCommon.TXRecordResult tXRecordResult = new TXRecordCommon.TXRecordResult();
            if (i10 == 0) {
                tXRecordResult.retCode = 0;
            } else {
                tXRecordResult.retCode = -1;
            }
            tXRecordResult.descMsg = str;
            tXRecordResult.videoPath = str2;
            tXRecordResult.coverPath = str3;
            iTXVideoRecordListener.onRecordComplete(tXRecordResult);
        }
    }

    public void onRecordEvent(int i10, Bundle bundle) {
        TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener = this.mVideoRecordListener;
        if (iTXVideoRecordListener != null) {
            iTXVideoRecordListener.onRecordEvent(i10, bundle);
        }
    }

    public void onRecordProgress(long j10) {
        TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener = this.mVideoRecordListener;
        if (iTXVideoRecordListener != null) {
            iTXVideoRecordListener.onRecordProgress(j10);
        }
    }

    public void onRenderVideoFrame(int i10, int i11, Object obj, int i12, int i13, int i14, int i15, long j10, byte[] bArr, ByteBuffer byteBuffer) {
        TXLivePlayer.ITXLivePlayVideoRenderListener iTXLivePlayVideoRenderListener = this.mVideoRenderListener;
        if (iTXLivePlayVideoRenderListener != null) {
            TXLivePlayer.TXLiteAVTexture tXLiteAVTexture = new TXLivePlayer.TXLiteAVTexture();
            tXLiteAVTexture.textureId = i12;
            tXLiteAVTexture.width = i13;
            tXLiteAVTexture.height = i14;
            tXLiteAVTexture.eglContext = obj;
            iTXLivePlayVideoRenderListener.onRenderVideoFrame(tXLiteAVTexture);
        }
        TXLivePlayer.ITXVideoRawDataListener iTXVideoRawDataListener = this.mVideoRawDataListener;
        if (iTXVideoRawDataListener != null) {
            iTXVideoRawDataListener.onVideoRawDataAvailable(bArr, i13, i14, (int) j10);
        }
    }

    @Override // com.tencent.rtmp.ui.TXCloudVideoView.b
    public void onShowLog(boolean z10) {
        showDebugView(z10);
    }

    public void onSnapshot(Bitmap bitmap) {
        TXLivePlayer.ITXSnapshotListener iTXSnapshotListener = this.mSnapshotListener;
        if (iTXSnapshotListener != null) {
            iTXSnapshotListener.onSnapshot(bitmap);
        }
    }

    @Override // com.tencent.rtmp.a
    public void pause() {
        nativePause(this.mNativeTXLivePlayerJni);
    }

    @Override // com.tencent.rtmp.a
    public void resume() {
        nativeResume(this.mNativeTXLivePlayerJni);
    }

    @Override // com.tencent.rtmp.a
    public void setAudioRawDataListener(TXLivePlayer.ITXAudioRawDataListener iTXAudioRawDataListener) {
        this.mAudioRawDataListener = iTXAudioRawDataListener;
        nativeEnableCustomAudioProcess(this.mNativeTXLivePlayerJni, iTXAudioRawDataListener != null);
    }

    @Override // com.tencent.rtmp.a
    public void setAudioRoute(int i10) {
        nativeSetAudioRoute(this.mNativeTXLivePlayerJni, i10);
    }

    @Override // com.tencent.rtmp.a
    public void setAudioVolumeEvaluationListener(TXLivePlayer.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener) {
        this.mAudioVolumeEvaluationListener = iTXAudioVolumeEvaluationListener;
    }

    @Override // com.tencent.rtmp.a
    public void setConfig(TXLivePlayConfig tXLivePlayConfig) {
        if (tXLivePlayConfig == null) {
            return;
        }
        nativeSetConfig(this.mNativeTXLivePlayerJni, tXLivePlayConfig.getCacheTime(), tXLivePlayConfig.getMaxAutoAdjustCacheTime(), tXLivePlayConfig.getMinAutoAdjustCacheTime(), tXLivePlayConfig.getVideoBlockThreshold(), tXLivePlayConfig.getConnectRetryCount(), tXLivePlayConfig.getConnectRetryInterval(), tXLivePlayConfig.isAutoAdjustCacheTime(), tXLivePlayConfig.isEnableMessage(), tXLivePlayConfig.isEnableMetaData(), tXLivePlayConfig.getFlvSessionKey(), tXLivePlayConfig.getHeaders());
    }

    @Override // com.tencent.rtmp.a
    public void setMute(boolean z10) {
        nativeSetMute(this.mNativeTXLivePlayerJni, z10);
    }

    @Override // com.tencent.rtmp.a
    public void setPlayListener(ITXLivePlayListener iTXLivePlayListener) {
        this.mListener = iTXLivePlayListener;
    }

    @Override // com.tencent.rtmp.a
    public void setPlayerView(TXCloudVideoView tXCloudVideoView) {
        if (tXCloudVideoView != null) {
            a.a(tXCloudVideoView, new WeakReference(this));
            showDebugView(a.a(tXCloudVideoView));
        }
        nativeSetPlayerView(this.mNativeTXLivePlayerJni, tXCloudVideoView != null ? new DisplayTarget(tXCloudVideoView) : null);
    }

    @Override // com.tencent.rtmp.a
    public void setRenderMode(int i10) {
        nativeSetRenderMode(this.mNativeTXLivePlayerJni, i10);
    }

    @Override // com.tencent.rtmp.a
    public void setRenderRotation(int i10) {
        nativeSetRenderRotation(this.mNativeTXLivePlayerJni, i10);
    }

    @Override // com.tencent.rtmp.a
    public void setSurface(Surface surface) {
        nativeSetPlayerView(this.mNativeTXLivePlayerJni, surface != null ? new DisplayTarget(surface) : null);
    }

    @Override // com.tencent.rtmp.a
    public void setSurfaceSize(int i10, int i11) {
    }

    @Override // com.tencent.rtmp.a
    public void setVideoRawDataListener(TXLivePlayer.ITXVideoRawDataListener iTXVideoRawDataListener) {
        synchronized (this) {
            if (this.mVideoRenderListener != null) {
                this.mVideoRenderListener = null;
                this.mGLContext = null;
                nativeEnableCustomRenderTexture(this.mNativeTXLivePlayerJni, false, null);
            }
            this.mVideoRawDataListener = iTXVideoRawDataListener;
            nativeEnableCustomRenderI420(this.mNativeTXLivePlayerJni, iTXVideoRawDataListener != null);
        }
    }

    @Override // com.tencent.rtmp.a
    public void setVideoRecordListener(TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener) {
        this.mVideoRecordListener = iTXVideoRecordListener;
    }

    @Override // com.tencent.rtmp.a
    public int setVideoRenderListener(TXLivePlayer.ITXLivePlayVideoRenderListener iTXLivePlayVideoRenderListener, Object obj) {
        synchronized (this) {
            if (this.mVideoRawDataListener != null) {
                this.mVideoRawDataListener = null;
                nativeEnableCustomRenderI420(this.mNativeTXLivePlayerJni, false);
            }
            this.mVideoRenderListener = iTXLivePlayVideoRenderListener;
            if (iTXLivePlayVideoRenderListener == null) {
                obj = null;
            }
            this.mGLContext = obj;
            nativeEnableCustomRenderTexture(this.mNativeTXLivePlayerJni, iTXLivePlayVideoRenderListener != null, obj);
        }
        return 0;
    }

    @Override // com.tencent.rtmp.a
    public void setVolume(int i10) {
        nativeSetVolume(this.mNativeTXLivePlayerJni, i10);
    }

    @Override // com.tencent.rtmp.a
    public void showDebugView(boolean z10) {
        nativeShowDebugView(this.mNativeTXLivePlayerJni, z10);
    }

    @Override // com.tencent.rtmp.a
    public void snapshot(TXLivePlayer.ITXSnapshotListener iTXSnapshotListener) {
        this.mSnapshotListener = iTXSnapshotListener;
        nativeSnapshot(this.mNativeTXLivePlayerJni);
    }

    @Override // com.tencent.rtmp.a
    public int startLivePlay(String str, int i10) {
        return nativeStartPlay(this.mNativeTXLivePlayerJni, str, i10);
    }

    @Override // com.tencent.rtmp.a
    public int startRecord(int i10) {
        String strGenFilePath = genFilePath(ContextUtils.getApplicationContext(), ".mp4");
        if (TextUtils.isEmpty(strGenFilePath)) {
            return -1;
        }
        nativeStartRecord(this.mNativeTXLivePlayerJni, i10, strGenFilePath);
        return 0;
    }

    @Override // com.tencent.rtmp.a
    public int stopPlay(boolean z10) {
        nativeStopPlay(this.mNativeTXLivePlayerJni, z10);
        return 0;
    }

    @Override // com.tencent.rtmp.a
    public int stopRecord() {
        nativeStopRecord(this.mNativeTXLivePlayerJni);
        return 0;
    }

    @Override // com.tencent.rtmp.a
    public int switchStream(String str) {
        if (!TextUtils.isEmpty(str)) {
            return nativeSwitchStream(this.mNativeTXLivePlayerJni, str);
        }
        LiteavLog.e(TAG, "Invalid params.");
        return -1;
    }
}
