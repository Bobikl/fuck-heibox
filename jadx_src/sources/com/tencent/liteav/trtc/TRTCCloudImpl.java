package com.tencent.liteav.trtc;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.opengl.GLES20;
import android.os.Handler;
import android.text.TextUtils;
import com.tencent.liteav.audio.TXAudioEffectManager;
import com.tencent.liteav.audio.TXAudioEffectManagerImpl;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.f;
import com.tencent.liteav.base.util.j;
import com.tencent.liteav.beauty.TXBeautyManager;
import com.tencent.liteav.beauty.TXBeautyManagerImpl;
import com.tencent.liteav.device.TXDeviceManager;
import com.tencent.liteav.device.TXDeviceManagerImpl;
import com.tencent.rtmp.ui.TXCloudVideoView;
import com.tencent.trtc.TRTCCloud;
import com.tencent.trtc.TRTCCloudDef;
import com.tencent.trtc.TRTCCloudListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class TRTCCloudImpl extends TRTCCloud implements TXAudioEffectManager.TXMusicPlayObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f99841a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static TRTCCloudImpl f99842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f99843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TRTCCloudListener f99844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TrtcCloudJni f99845e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TRTCCloud.BGMNotify f99846f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private TXAudioEffectManagerImpl f99847g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private TXDeviceManagerImpl f99848h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private TXBeautyManagerImpl f99849i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f99850j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ArrayList<TRTCCloudImpl> f99851k = new ArrayList<>();

    private TRTCCloudImpl(Context context, long j10) {
        b(context);
        this.f99843c = context;
        a(context, j10, false);
    }

    private TRTCCloudImpl(Context context, boolean z10) {
        b(context);
        this.f99843c = context;
        a(context, 0L, z10);
    }

    public static TRTCCloud a(Context context) {
        TRTCCloudImpl tRTCCloudImpl;
        synchronized (TRTCCloudImpl.class) {
            if (f99842b == null) {
                f99842b = new TRTCCloudImpl(context, true);
            }
            tRTCCloudImpl = f99842b;
        }
        return tRTCCloudImpl;
    }

    public static void a() {
        synchronized (TRTCCloudImpl.class) {
            if (f99842b != null) {
                LiteavLog.i("TRTCCloudImpl", "destructor destroySharedInstance");
                Iterator<TRTCCloudImpl> it = f99842b.f99851k.iterator();
                while (it.hasNext()) {
                    it.next().b();
                }
                f99842b.b();
                f99842b = null;
            }
        }
    }

    public static void a(int i10) {
        TrtcCloudJni.setLogLevel(i10);
    }

    private void a(Context context, long j10, boolean z10) {
        this.f99843c = context.getApplicationContext();
        if (j10 == 0) {
            this.f99845e = new TrtcCloudJni(z10);
        } else {
            this.f99845e = new TrtcCloudJni(j10, z10);
        }
        this.f99848h = new TXDeviceManagerImpl(this.f99845e.createDeviceManager());
        this.f99847g = new TXAudioEffectManagerImpl(this.f99845e.createAudioEffectManager());
        this.f99849i = new TXBeautyManagerImpl(this.f99845e.createBeautyManager());
    }

    public static void a(String str) {
        TrtcCloudJni.setLogDirPath(str);
    }

    public static void a(boolean z10) {
        TrtcCloudJni.setConsoleEnabled(z10);
    }

    private static int b(int i10) {
        if (i10 < 0) {
            return 0;
        }
        return i10 > 3 ? (i10 / 90) % 4 : i10;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private String b(String str) throws Throwable {
        long length;
        FileOutputStream fileOutputStream;
        Throwable th2;
        InputStream inputStreamOpen;
        IOException e10;
        if (TextUtils.isEmpty(str) || !str.startsWith("/assets/")) {
            return str;
        }
        String strSubstring = str.substring(8);
        try {
            try {
                length = this.f99843c.getAssets().openFd(strSubstring).getLength();
            } catch (Exception e11) {
                LiteavLog.e("TRTCCloudImpl", "playAudioEffect error " + e11.toString());
            }
        } catch (Exception e12) {
            LiteavLog.e("TRTCCloudImpl", "playAudioEffect openFd error " + e12.toString());
            length = 0;
        }
        String strC = c();
        File file = new File(strC);
        if (!file.exists()) {
            file.mkdirs();
        } else if (file.isFile()) {
            file.delete();
            file.mkdirs();
        }
        int iLastIndexOf = strSubstring.lastIndexOf(File.separatorChar);
        if (iLastIndexOf != -1) {
            str = strC + File.separator + length + lg.a.f131412e + strSubstring.substring(iLastIndexOf + 1);
        } else {
            str = strC + File.separator + length + lg.a.f131412e + strSubstring;
        }
        if (!f.a(str)) {
            try {
                try {
                    inputStreamOpen = this.f99843c.getAssets().open(strSubstring);
                    try {
                        fileOutputStream = new FileOutputStream(str);
                        try {
                            try {
                                f.a(inputStreamOpen, fileOutputStream);
                                f.a(inputStreamOpen);
                                fileOutputStream.flush();
                            } catch (IOException e13) {
                                e10 = e13;
                                LiteavLog.e("FileUtil", "copy asset file failed.", e10);
                                f.a(inputStreamOpen);
                                if (fileOutputStream != null) {
                                    fileOutputStream.flush();
                                }
                                return str;
                            }
                        } catch (Throwable th3) {
                            th2 = th3;
                            f.a(inputStreamOpen);
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.flush();
                                    fileOutputStream.close();
                                } catch (IOException unused) {
                                }
                            }
                            throw th2;
                        }
                    } catch (IOException e14) {
                        e10 = e14;
                        fileOutputStream = null;
                    } catch (Throwable th4) {
                        th2 = th4;
                        fileOutputStream = null;
                        f.a(inputStreamOpen);
                        if (fileOutputStream != null) {
                            fileOutputStream.flush();
                            fileOutputStream.close();
                        }
                        throw th2;
                    }
                } catch (IOException unused2) {
                }
            } catch (IOException e15) {
                fileOutputStream = null;
                e10 = e15;
                inputStreamOpen = null;
            } catch (Throwable th5) {
                fileOutputStream = null;
                th2 = th5;
                inputStreamOpen = null;
            }
            fileOutputStream.close();
        }
        return str;
    }

    private void b() {
        TXBeautyManagerImpl tXBeautyManagerImpl = this.f99849i;
        if (tXBeautyManagerImpl != null) {
            tXBeautyManagerImpl.clear();
        }
        this.f99845e.destroy();
    }

    private static void b(Context context) {
        synchronized (TRTCCloudImpl.class) {
            if (!f99841a) {
                ContextUtils.initApplicationContext(context.getApplicationContext());
                ContextUtils.setDataDirectorySuffix("liteav");
                TrtcCloudJni.init(0);
                f99841a = true;
            }
            if (context instanceof Activity) {
                j.a().a((Activity) context);
            }
        }
    }

    public static void b(boolean z10) {
        TrtcCloudJni.setLogCompressEnabled(z10);
    }

    private String c() {
        return this.f99843c.getCacheDir() + File.separator + "liteav_effect";
    }

    public static TRTCCloud createInstance(Context context) {
        return new TRTCCloudImpl(context, false);
    }

    public static void destroyInstance(TRTCCloud tRTCCloud) {
        if (tRTCCloud instanceof TRTCCloudImpl) {
            ((TRTCCloudImpl) tRTCCloud).b();
        } else {
            LiteavLog.w("TRTCCloudImpl", "destroyInstance trtcCloud=".concat(String.valueOf(tRTCCloud)));
        }
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void ConnectOtherRoom(String str) {
        this.f99845e.connectOtherRoom(str);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void DisconnectOtherRoom() {
        this.f99845e.disconnectOtherRoom();
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void addListener(TRTCCloudListener tRTCCloudListener) {
        this.f99845e.addListener(tRTCCloudListener);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public String callExperimentalAPI(String str) {
        return this.f99845e.callExperimentalAPI(str);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public int checkAudioCapabilitySupport(int i10) {
        return (i10 == 2 && this.f99848h.isLowLatencyEarMonitorSupported()) ? 1 : 0;
    }

    @Override // com.tencent.trtc.TRTCCloud
    public TRTCCloud createSubCloud() {
        TRTCCloudImpl tRTCCloudImpl;
        synchronized (TRTCCloudImpl.class) {
            tRTCCloudImpl = new TRTCCloudImpl(ContextUtils.getApplicationContext(), this.f99845e.getTrtcCloudJni());
            this.f99851k.add(tRTCCloudImpl);
        }
        return tRTCCloudImpl;
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void destroySubCloud(TRTCCloud tRTCCloud) {
        synchronized (TRTCCloudImpl.class) {
            if (tRTCCloud instanceof TRTCCloudImpl) {
                LiteavLog.i("TRTCCloudImpl", "destructor destroySubCloud");
                ((TRTCCloudImpl) tRTCCloud).b();
                this.f99851k.remove(tRTCCloud);
            }
        }
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void enable3DSpatialAudioEffect(boolean z10) {
        this.f99845e.enable3DSpatialAudioEffect(z10);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void enableAudioEarMonitoring(boolean z10) {
        this.f99847g.enableVoiceEarMonitor(z10);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void enableAudioVolumeEvaluation(int i10) {
        enableAudioVolumeEvaluation(i10, false);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void enableAudioVolumeEvaluation(int i10, boolean z10) {
        TRTCCloudDef.TRTCAudioVolumeEvaluateParams tRTCAudioVolumeEvaluateParams = new TRTCCloudDef.TRTCAudioVolumeEvaluateParams();
        tRTCAudioVolumeEvaluateParams.interval = i10;
        tRTCAudioVolumeEvaluateParams.enableVadDetection = z10;
        tRTCAudioVolumeEvaluateParams.enablePitchCalculation = false;
        tRTCAudioVolumeEvaluateParams.enableSpectrumCalculation = false;
        enableAudioVolumeEvaluation(true, tRTCAudioVolumeEvaluateParams);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void enableAudioVolumeEvaluation(boolean z10, TRTCCloudDef.TRTCAudioVolumeEvaluateParams tRTCAudioVolumeEvaluateParams) {
        this.f99845e.enableAudioVolumeEvaluation(z10, tRTCAudioVolumeEvaluateParams);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void enableCustomAudioCapture(boolean z10) {
        this.f99845e.enableCustomAudioCapture(z10);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void enableCustomAudioRendering(boolean z10) {
        this.f99845e.enableCustomAudioRendering(z10);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void enableCustomVideoCapture(int i10, boolean z10) {
        this.f99845e.enableCustomVideoCapture(i10, z10);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void enableCustomVideoCapture(boolean z10) {
        enableCustomVideoCapture(0, z10);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int enableEncSmallVideoStream(boolean z10, TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam) {
        return this.f99845e.enableEncSmallVideoStream(z10, tRTCVideoEncParam);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void enableMixExternalAudioFrame(boolean z10, boolean z11) {
        this.f99845e.enableMixExternalAudioFrame(z10, z11);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int enablePayloadPrivateEncryption(boolean z10, TRTCCloudDef.TRTCPayloadPrivateEncryptionConfig tRTCPayloadPrivateEncryptionConfig) {
        return this.f99845e.enablePayloadPrivateEncryption(z10, tRTCPayloadPrivateEncryptionConfig);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public boolean enableTorch(boolean z10) {
        return this.f99848h.enableCameraTorch(z10);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void enterRoom(TRTCCloudDef.TRTCParams tRTCParams, int i10) {
        this.f99845e.enterRoom(tRTCParams, i10);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void exitRoom() {
        this.f99845e.exitRoom();
        try {
            File file = new File(c());
            if (file.exists() && file.isDirectory() && f.a(file, 5) > 52428800) {
                for (File file2 : file.listFiles()) {
                    file2.delete();
                }
            }
        } catch (Exception e10) {
            LiteavLog.w("TRTCCloudImpl", "clearCache error " + e10.toString());
        }
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int getAudioCaptureVolume() {
        return this.f99845e.getAudioCaptureVolume();
    }

    @Override // com.tencent.trtc.TRTCCloud
    public TXAudioEffectManager getAudioEffectManager() {
        return this.f99847g;
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int getAudioPlayoutVolume() {
        return this.f99845e.getAudioPlayoutVolume();
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public int getBGMDuration(String str) {
        return (int) this.f99847g.getMusicDurationInMS(str);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public TXBeautyManager getBeautyManager() {
        return this.f99849i;
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void getCustomAudioRenderingFrame(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
        if (tRTCAudioFrame == null) {
            return;
        }
        this.f99845e.getCustomAudioRenderingFrame(tRTCAudioFrame);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public TXDeviceManager getDeviceManager() {
        return this.f99848h;
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public boolean isCameraAutoFocusFaceModeSupported() {
        return this.f99848h.isCameraAutoFocusFaceModeSupported();
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public boolean isCameraFocusPositionInPreviewSupported() {
        return this.f99848h.isCameraFocusPositionInPreviewSupported();
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public boolean isCameraTorchSupported() {
        return this.f99848h.isCameraTorchSupported();
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public boolean isCameraZoomSupported() {
        return this.f99848h.isCameraZoomSupported();
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int mixExternalAudioFrame(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
        if (tRTCAudioFrame == null) {
            return -1;
        }
        return this.f99845e.mixExternalAudioFrame(tRTCAudioFrame);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void muteAllRemoteAudio(boolean z10) {
        this.f99845e.muteAllRemoteAudio(z10);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void muteAllRemoteVideoStreams(boolean z10) {
        this.f99845e.muteAllRemoteVideoStreams(z10);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void muteLocalAudio(boolean z10) {
        this.f99845e.muteLocalAudio(z10);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void muteLocalVideo(int i10, boolean z10) {
        this.f99845e.muteLocalVideo(i10, z10);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void muteLocalVideo(boolean z10) {
        this.f99845e.muteLocalVideo(0, z10);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void muteRemoteAudio(String str, boolean z10) {
        this.f99845e.muteRemoteAudio(str, z10);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void muteRemoteVideoStream(String str, int i10, boolean z10) {
        this.f99845e.muteRemoteVideoStream(str, i10, z10);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void muteRemoteVideoStream(String str, boolean z10) {
        muteRemoteVideoStream(str, 0, z10);
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onComplete(int i10, int i11) {
        TRTCCloud.BGMNotify bGMNotify = this.f99846f;
        if (bGMNotify != null) {
            bGMNotify.onBGMComplete(i11);
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onPlayProgress(int i10, long j10, long j11) {
        TRTCCloud.BGMNotify bGMNotify = this.f99846f;
        if (bGMNotify != null) {
            bGMNotify.onBGMProgress(j10, j11);
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onStart(int i10, int i11) {
        TRTCCloud.BGMNotify bGMNotify = this.f99846f;
        if (bGMNotify != null) {
            bGMNotify.onBGMStart(i11);
        }
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void pauseAudioEffect(int i10) {
        this.f99847g.pauseAudioEffect(i10);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void pauseBGM() {
        this.f99847g.pausePlayMusic(Integer.MAX_VALUE);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void pauseScreenCapture() {
        this.f99845e.pauseScreenCapture(this.f99850j);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void playAudioEffect(TRTCCloudDef.TRTCAudioEffectParam tRTCAudioEffectParam) {
        if (tRTCAudioEffectParam == null) {
            return;
        }
        final int i10 = tRTCAudioEffectParam.effectId;
        TXAudioEffectManager.AudioMusicParam audioMusicParam = new TXAudioEffectManager.AudioMusicParam(i10, b(tRTCAudioEffectParam.path));
        audioMusicParam.publish = tRTCAudioEffectParam.publish;
        audioMusicParam.loopCount = tRTCAudioEffectParam.loopCount;
        audioMusicParam.isShortFile = true;
        this.f99847g.playAudioEffect(audioMusicParam);
        this.f99847g.setEffectObserver(i10, new TXAudioEffectManager.TXMusicPlayObserver() { // from class: com.tencent.liteav.trtc.TRTCCloudImpl.1
            @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
            public final void onComplete(int i11, int i12) {
                TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.f99844d;
                if (tRTCCloudListener != null) {
                    tRTCCloudListener.onAudioEffectFinished(i10, i12);
                }
            }

            @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
            public final void onPlayProgress(int i11, long j10, long j11) {
            }

            @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
            public final void onStart(int i11, int i12) {
                TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.f99844d;
                if (tRTCCloudListener == null || i12 >= 0) {
                    return;
                }
                tRTCCloudListener.onAudioEffectFinished(i10, i12);
            }
        });
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void playBGM(String str, TRTCCloud.BGMNotify bGMNotify) {
        this.f99846f = bGMNotify;
        TXAudioEffectManager.AudioMusicParam audioMusicParam = new TXAudioEffectManager.AudioMusicParam(Integer.MAX_VALUE, str);
        audioMusicParam.publish = true;
        audioMusicParam.loopCount = 0;
        this.f99847g.setMusicObserver(Integer.MAX_VALUE, this);
        this.f99847g.startPlayMusic(audioMusicParam);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void removeListener(TRTCCloudListener tRTCCloudListener) {
        this.f99845e.removeListener(tRTCCloudListener);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void resumeAudioEffect(int i10) {
        this.f99847g.resumeAudioEffect(i10);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void resumeBGM() {
        this.f99847g.resumePlayMusic(Integer.MAX_VALUE);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void resumeScreenCapture() {
        this.f99845e.resumeScreenCapture(this.f99850j);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void selectMotionTmpl(String str) {
        this.f99849i.setMotionTmpl(str);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void sendCustomAudioData(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
        if (tRTCAudioFrame == null) {
            return;
        }
        this.f99845e.sendCustomAudioData(tRTCAudioFrame);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public boolean sendCustomCmdMsg(int i10, byte[] bArr, boolean z10, boolean z11) {
        if (bArr != null) {
            return this.f99845e.sendCustomCmdMsg(i10, bArr, z10, z11);
        }
        LiteavLog.w("TRTCCloudImpl", "custom msg data is null.");
        return false;
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void sendCustomVideoData(int i10, TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        if (tRTCVideoFrame == null) {
            LiteavLog.w("TRTCCloudImpl", "sendCustomVideoData frame is null");
            return;
        }
        if (tRTCVideoFrame.bufferType == 3) {
            GLES20.glFinish();
        }
        this.f99845e.sendCustomVideoData(i10, tRTCVideoFrame);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void sendCustomVideoData(TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        sendCustomVideoData(0, tRTCVideoFrame);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public boolean sendSEIMsg(byte[] bArr, int i10) {
        if (bArr != null && i10 != 0) {
            return this.f99845e.sendSEIMsg(bArr, i10);
        }
        LiteavLog.w("TRTCCloudImpl", "sei msg data is null or repeatCount is zero.");
        return false;
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void set3DSpatialReceivingRange(String str, int i10) {
        this.f99845e.set3DSpatialReceivingRange(str, i10);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setAllAudioEffectsVolume(int i10) {
        this.f99847g.setAllAudioEffectsVolume(i10);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setAudioCaptureVolume(int i10) {
        this.f99845e.setAudioCaptureVolume(i10);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setAudioEffectVolume(int i10, int i11) {
        this.f99847g.setAudioEffectVolume(i10, i11);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setAudioFrameListener(TRTCCloudListener.TRTCAudioFrameListener tRTCAudioFrameListener) {
        this.f99845e.setAudioFrameListener(tRTCAudioFrameListener);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setAudioPlayoutVolume(int i10) {
        this.f99845e.setAudioPlayoutVolume(i10);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setAudioQuality(int i10) {
        this.f99845e.setAudioQuality(i10);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setAudioRoute(int i10) {
        this.f99848h.setAudioRoute(TXDeviceManagerImpl.audioRouteFromInt(i10));
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setBGMPlayoutVolume(int i10) {
        this.f99847g.setMusicPlayoutVolume(Integer.MAX_VALUE, i10);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public int setBGMPosition(int i10) {
        this.f99847g.seekMusicToPosInMS(Integer.MAX_VALUE, i10);
        return 0;
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setBGMPublishVolume(int i10) {
        this.f99847g.setMusicPublishVolume(Integer.MAX_VALUE, i10);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setBGMVolume(int i10) {
        this.f99847g.setMusicPlayoutVolume(Integer.MAX_VALUE, i10);
        this.f99847g.setMusicPublishVolume(Integer.MAX_VALUE, i10);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setBeautyStyle(int i10, int i11, int i12, int i13) {
        this.f99849i.setBeautyStyle(i10);
        this.f99849i.setBeautyLevel(i11);
        this.f99849i.setWhitenessLevel(i12);
        this.f99849i.setRuddyLevel(i13);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int setCapturedAudioFrameCallbackFormat(TRTCCloudDef.TRTCAudioFrameCallbackFormat tRTCAudioFrameCallbackFormat) {
        if (tRTCAudioFrameCallbackFormat == null) {
            return -1;
        }
        return this.f99845e.setCapturedAudioFrameCallbackFormat(tRTCAudioFrameCallbackFormat.sampleRate, tRTCAudioFrameCallbackFormat.channel, tRTCAudioFrameCallbackFormat.samplesPerCall, tRTCAudioFrameCallbackFormat.mode);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setChinLevel(int i10) {
        this.f99849i.setChinLevel(i10);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setDebugViewMargin(String str, TRTCCloud.TRTCViewMargin tRTCViewMargin) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setDefaultStreamRecvMode(boolean z10, boolean z11) {
        this.f99845e.setDefaultStreamRecvMode(z10, z11);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setEyeScaleLevel(int i10) {
        this.f99849i.setEyeScaleLevel(i10);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setFaceShortLevel(int i10) {
        this.f99849i.setFaceShortLevel(i10);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setFaceSlimLevel(int i10) {
        this.f99849i.setFaceSlimLevel(i10);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setFaceVLevel(int i10) {
        this.f99849i.setFaceVLevel(i10);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setFilter(Bitmap bitmap) {
        this.f99849i.setFilter(bitmap);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setFilterConcentration(float f10) {
        this.f99849i.setFilterStrength(f10);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setFocusPosition(int i10, int i11) {
        this.f99848h.setCameraFocusPosition(i10, i11);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setGSensorMode(int i10) {
        this.f99845e.setGSensorMode(0, i10);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setGravitySensorAdaptiveMode(int i10) {
        this.f99845e.setGravitySensorAdaptiveMode(i10);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public boolean setGreenScreenFile(String str) {
        return false;
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setListener(TRTCCloudListener tRTCCloudListener) {
        Log.d("TRTCCloudImpl", "setListener ".concat(String.valueOf(tRTCCloudListener)), new Object[0]);
        this.f99844d = tRTCCloudListener;
        this.f99845e.setListener(tRTCCloudListener);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setListenerHandler(Handler handler) {
        this.f99845e.setListenerHandler(handler);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int setLocalProcessedAudioFrameCallbackFormat(TRTCCloudDef.TRTCAudioFrameCallbackFormat tRTCAudioFrameCallbackFormat) {
        if (tRTCAudioFrameCallbackFormat == null) {
            return -1;
        }
        return this.f99845e.setLocalProcessedAudioFrameCallbackFormat(tRTCAudioFrameCallbackFormat.sampleRate, tRTCAudioFrameCallbackFormat.channel, tRTCAudioFrameCallbackFormat.samplesPerCall, tRTCAudioFrameCallbackFormat.mode);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setLocalRenderParams(TRTCCloudDef.TRTCRenderParams tRTCRenderParams) {
        setLocalViewFillMode(tRTCRenderParams.fillMode);
        setLocalViewRotation(tRTCRenderParams.rotation);
        setLocalViewMirror(tRTCRenderParams.mirrorType);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int setLocalVideoProcessListener(int i10, int i11, TRTCCloudListener.TRTCVideoFrameListener tRTCVideoFrameListener) {
        return this.f99845e.setLocalVideoProcessListener(0, i10, i11, tRTCVideoFrameListener);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int setLocalVideoRenderListener(int i10, int i11, TRTCCloudListener.TRTCVideoRenderListener tRTCVideoRenderListener) {
        return this.f99845e.setLocalVideoRenderListener(i10, i11, tRTCVideoRenderListener);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setLocalViewFillMode(int i10) {
        this.f99845e.setLocalViewFillMode(i10);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setLocalViewMirror(int i10) {
        this.f99845e.setLocalViewMirror(i10);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setLocalViewRotation(int i10) {
        this.f99845e.setLocalViewRotation(b(i10));
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setMicVolumeOnMixing(int i10) {
        this.f99847g.setVoiceCaptureVolume(i10);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setMixExternalAudioVolume(int i10, int i11) {
        this.f99845e.setMixExternalAudioVolume(i10, i11);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setMixTranscodingConfig(TRTCCloudDef.TRTCTranscodingConfig tRTCTranscodingConfig) {
        this.f99845e.setMixTranscodingConfig(tRTCTranscodingConfig);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int setMixedPlayAudioFrameCallbackFormat(TRTCCloudDef.TRTCAudioFrameCallbackFormat tRTCAudioFrameCallbackFormat) {
        if (tRTCAudioFrameCallbackFormat == null) {
            return -1;
        }
        return this.f99845e.setMixedPlayAudioFrameCallbackFormat(tRTCAudioFrameCallbackFormat.sampleRate, tRTCAudioFrameCallbackFormat.channel, tRTCAudioFrameCallbackFormat.samplesPerCall, tRTCAudioFrameCallbackFormat.mode);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setMotionMute(boolean z10) {
        this.f99849i.setMotionMute(z10);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setNetworkQosParam(TRTCCloudDef.TRTCNetworkQosParam tRTCNetworkQosParam) {
        this.f99845e.setNetworkQosParam(tRTCNetworkQosParam);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setNoseSlimLevel(int i10) {
        this.f99849i.setNoseSlimLevel(i10);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setPerspectiveCorrectionPoints(String str, PointF[] pointFArr, PointF[] pointFArr2) {
        this.f99845e.setPerspectiveCorrectionPoints(str, pointFArr, pointFArr2);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public int setPriorRemoteVideoStreamType(int i10) {
        return this.f99845e.setPriorRemoteVideoStreamType(i10);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setRemoteAudioParallelParams(TRTCCloudDef.TRTCAudioParallelParams tRTCAudioParallelParams) {
        this.f99845e.setRemoteAudioParallelParams(tRTCAudioParallelParams);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setRemoteAudioVolume(String str, int i10) {
        this.f99845e.setRemoteAudioVolume(str, i10);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setRemoteRenderParams(String str, int i10, TRTCCloudDef.TRTCRenderParams tRTCRenderParams) {
        this.f99845e.setRemoteViewFillMode(str, i10, tRTCRenderParams.fillMode);
        this.f99845e.setRemoteViewRotation(str, i10, b(tRTCRenderParams.rotation));
        this.f99845e.setRemoteViewMirror(str, i10, tRTCRenderParams.mirrorType);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setRemoteSubStreamViewFillMode(String str, int i10) {
        this.f99845e.setRemoteViewFillMode(str, 2, i10);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setRemoteSubStreamViewRotation(String str, int i10) {
        this.f99845e.setRemoteViewRotation(str, 2, b(i10));
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int setRemoteVideoRenderListener(String str, int i10, int i11, TRTCCloudListener.TRTCVideoRenderListener tRTCVideoRenderListener) {
        return this.f99845e.setRemoteVideoRenderListener(str, i10, i11, tRTCVideoRenderListener);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int setRemoteVideoStreamType(String str, int i10) {
        return this.f99845e.setRemoteVideoStreamType(str, i10);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setRemoteViewFillMode(String str, int i10) {
        this.f99845e.setRemoteViewFillMode(str, 0, i10);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setRemoteViewRotation(String str, int i10) {
        this.f99845e.setRemoteViewRotation(str, 0, b(i10));
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setReverbType(int i10) {
        this.f99847g.setVoiceReverbType(TXAudioEffectManagerImpl.voiceReverbTypeFromInt(i10));
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setSubStreamEncoderParam(TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam) {
        this.f99845e.setVideoEncoderParams(2, tRTCVideoEncParam);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setSystemVolumeType(int i10) {
        this.f99848h.setSystemVolumeType(TXDeviceManagerImpl.systemVolumeTypefromInt(i10));
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setVideoEncoderMirror(boolean z10) {
        this.f99845e.setVideoEncoderMirror(z10);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setVideoEncoderParam(TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam) {
        if (tRTCVideoEncParam == null) {
            return;
        }
        this.f99845e.setVideoEncoderParams(0, tRTCVideoEncParam);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setVideoEncoderRotation(int i10) {
        this.f99845e.setVideoEncoderRotation(b(i10));
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setVideoMuteImage(Bitmap bitmap, int i10) {
        this.f99845e.setVideoMuteImage(bitmap, i10);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public boolean setVoiceChangerType(int i10) {
        this.f99847g.setVoiceChangerType(TXAudioEffectManagerImpl.voiceChangerTypeFromInt(i10));
        return true;
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setWatermark(Bitmap bitmap, int i10, float f10, float f11, float f12) {
        this.f99845e.setWatermark(bitmap, i10, f10, f11, f12);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setZoom(int i10) {
        this.f99848h.setCameraZoomRatio(i10);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void showDebugView(int i10) {
        this.f99845e.showDashboardManager(i10);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void snapshotVideo(String str, int i10, int i11, TRTCCloudListener.TRTCSnapshotListener tRTCSnapshotListener) {
        this.f99845e.snapshotVideo(str, i10, i11, tRTCSnapshotListener);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void snapshotVideo(String str, int i10, TRTCCloudListener.TRTCSnapshotListener tRTCSnapshotListener) {
        this.f99845e.snapshotVideo(str, i10, 1, tRTCSnapshotListener);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int startAudioRecording(TRTCCloudDef.TRTCAudioRecordingParams tRTCAudioRecordingParams) {
        return this.f99845e.startAudioRecording(tRTCAudioRecordingParams);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void startLocalAudio() {
        this.f99845e.startLocalAudio();
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void startLocalAudio(int i10) {
        this.f99845e.startLocalAudio(i10);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void startLocalPreview(boolean z10, TXCloudVideoView tXCloudVideoView) {
        this.f99845e.startLocalPreview(z10, tXCloudVideoView);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void startLocalRecording(TRTCCloudDef.TRTCLocalRecordingParams tRTCLocalRecordingParams) {
        this.f99845e.startLocalRecording(tRTCLocalRecordingParams);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void startPublishCDNStream(TRTCCloudDef.TRTCPublishCDNParam tRTCPublishCDNParam) {
        this.f99845e.startPublishCDNStream(tRTCPublishCDNParam);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void startPublishMediaStream(TRTCCloudDef.TRTCPublishTarget tRTCPublishTarget, TRTCCloudDef.TRTCStreamEncoderParam tRTCStreamEncoderParam, TRTCCloudDef.TRTCStreamMixingConfig tRTCStreamMixingConfig) {
        this.f99845e.startPublishMediaStream(tRTCPublishTarget, tRTCStreamEncoderParam, tRTCStreamMixingConfig);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void startPublishing(String str, int i10) {
        this.f99845e.startPublishing(str, i10);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void startRemoteSubStreamView(String str, TXCloudVideoView tXCloudVideoView) {
        startRemoteView(str, 2, tXCloudVideoView);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void startRemoteView(String str, int i10, TXCloudVideoView tXCloudVideoView) {
        this.f99845e.startRemoteView(str, i10, tXCloudVideoView);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void startRemoteView(String str, TXCloudVideoView tXCloudVideoView) {
        this.f99845e.startRemoteView(str, tXCloudVideoView);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void startScreenCapture(int i10, TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam, TRTCCloudDef.TRTCScreenShareParams tRTCScreenShareParams) {
        this.f99850j = i10;
        this.f99845e.startScreenCapture(i10, tRTCVideoEncParam, tRTCScreenShareParams);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void startScreenCapture(TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam, TRTCCloudDef.TRTCScreenShareParams tRTCScreenShareParams) {
        this.f99850j = 0;
        startScreenCapture(0, tRTCVideoEncParam, tRTCScreenShareParams);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int startSpeedTest(TRTCCloudDef.TRTCSpeedTestParams tRTCSpeedTestParams) {
        this.f99845e.startSpeedTest(tRTCSpeedTestParams);
        return 0;
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void startSpeedTest(int i10, String str, String str2) {
        this.f99845e.startSpeedTest(i10, str, str2);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void startSystemAudioLoopback() {
        if (LiteavSystemInfo.getSystemOSVersionInt() < 29) {
            LiteavLog.e("TRTCCloudImpl", "current system don't support system audio loopback");
        } else {
            this.f99845e.startSystemAudioLoopback();
        }
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void stopAllAudioEffects() {
        this.f99847g.stopAllAudioEffects();
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopAllRemoteView() {
        this.f99845e.stopAllRemoteView();
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void stopAudioEffect(int i10) {
        this.f99847g.stopAudioEffect(i10);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopAudioRecording() {
        this.f99845e.stopAudioRecording();
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void stopBGM() {
        this.f99847g.stopPlayMusic(Integer.MAX_VALUE);
        this.f99847g.setMusicObserver(Integer.MAX_VALUE, null);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopLocalAudio() {
        this.f99845e.stopLocalAudio();
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopLocalPreview() {
        this.f99845e.stopLocalPreview();
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopLocalRecording() {
        this.f99845e.stopLocalRecording();
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void stopPublishCDNStream() {
        this.f99845e.stopPublishCDNStream();
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopPublishMediaStream(String str) {
        this.f99845e.stopPublishMediaStream(str);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void stopPublishing() {
        this.f99845e.stopPublishing();
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void stopRemoteSubStreamView(String str) {
        stopRemoteView(str, 2);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void stopRemoteView(String str) {
        this.f99845e.stopRemoteView(str);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopRemoteView(String str, int i10) {
        this.f99845e.stopRemoteView(str, i10);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopScreenCapture() {
        this.f99845e.stopScreenCapture(this.f99850j);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopSpeedTest() {
        this.f99845e.stopSpeedTest();
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopSystemAudioLoopback() {
        this.f99845e.stopSystemAudioLoopback();
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void switchCamera() {
        this.f99848h.switchCamera(!this.f99848h.isFrontCamera());
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void switchRole(int i10) {
        this.f99845e.switchRole(i10);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void switchRole(int i10, String str) {
        this.f99845e.switchRole(i10, str);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void switchRoom(TRTCCloudDef.TRTCSwitchRoomConfig tRTCSwitchRoomConfig) {
        this.f99845e.switchRoom(tRTCSwitchRoomConfig);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void updateLocalView(TXCloudVideoView tXCloudVideoView) {
        this.f99845e.updateLocalView(tXCloudVideoView);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void updateOtherRoomForwardMode(String str) {
        this.f99845e.updateOtherRoomForwardMode(str);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void updatePublishMediaStream(String str, TRTCCloudDef.TRTCPublishTarget tRTCPublishTarget, TRTCCloudDef.TRTCStreamEncoderParam tRTCStreamEncoderParam, TRTCCloudDef.TRTCStreamMixingConfig tRTCStreamMixingConfig) {
        this.f99845e.updatePublishMediaStream(str, tRTCPublishTarget, tRTCStreamEncoderParam, tRTCStreamMixingConfig);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void updateRemote3DSpatialPosition(String str, int[] iArr) {
        this.f99845e.updateRemote3DSpatialPosition(str, iArr);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void updateRemoteView(String str, int i10, TXCloudVideoView tXCloudVideoView) {
        this.f99845e.updateRemoteView(str, i10, tXCloudVideoView);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void updateSelf3DSpatialPosition(int[] iArr, float[] fArr, float[] fArr2, float[] fArr3) {
        this.f99845e.updateSelf3DSpatialPosition(iArr, fArr, fArr2, fArr3);
    }
}
