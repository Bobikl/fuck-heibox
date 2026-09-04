package com.tencent.rtmp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Surface;
import android.view.TextureView;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.CustomHandler;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.TimeUtil;
import com.tencent.liteav.txcplayer.ITXVCubePlayer;
import com.tencent.liteav.txcplayer.e;
import com.tencent.liteav.txcplayer.ext.service.RenderProcessService;
import com.tencent.liteav.txcplayer.model.TXSubtitleRenderModel;
import com.tencent.liteav.txcvodplayer.TXCVodVideoView;
import com.tencent.liteav.txcvodplayer.b.c;
import com.tencent.liteav.txcvodplayer.b.f;
import com.tencent.liteav.txcvodplayer.renderer.TextureRenderView;
import com.tencent.liteav.txcvodplayer.renderer.d;
import com.tencent.liteav.txcvodplayer.renderer.g;
import com.tencent.liteav.txcvodplayer.renderer.k;
import com.tencent.liteav.videobase.videobase.DisplayTarget;
import com.tencent.liteav.videobase.videobase.TXCCloudVideoViewMethodInvoker;
import com.tencent.rtmp.ITXVodPlayListener;
import com.tencent.rtmp.TXLivePlayer;
import com.tencent.rtmp.TXPlayInfoParams;
import com.tencent.rtmp.TXPlayerDrmBuilder;
import com.tencent.rtmp.TXVodConstants;
import com.tencent.rtmp.ui.TXCloudVideoView;
import com.tencent.rtmp.ui.TXSubtitleView;
import com.tencent.thumbplayer.tcmedia.api.TPSubtitleData;
import com.tencent.thumbplayer.tcmedia.api.TPTrackInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class TXVodPlayer {
    public static final String TAG = "TXVodPlayer";
    private final com.tencent.liteav.a mPlayer;

    public TXVodPlayer(Context context) {
        this.mPlayer = new com.tencent.liteav.a(context);
    }

    public static String getEncryptedPlayKey(String str) {
        return com.tencent.liteav.a.b(str);
    }

    public void addSubtitleSource(String str, String str2, String str3) {
        LiteavLog.i(TAG, "addSubtitleSource url =" + str + " ,name=" + str2 + " ,mimeType=" + str3 + " ,player=" + hashCode());
        com.tencent.liteav.a aVar = this.mPlayer;
        TXCVodVideoView tXCVodVideoView = aVar.f99481e;
        if (!TextUtils.isEmpty(str)) {
            ITXVCubePlayer iTXVCubePlayer = tXCVodVideoView.f99966c;
            if (iTXVCubePlayer != null) {
                iTXVCubePlayer.addSubtitleSource(str, str2, str3);
            }
            if (tXCVodVideoView.f99971h == null) {
                tXCVodVideoView.f99971h = new ArrayList();
            }
            tXCVodVideoView.f99971h.add(new TXCVodVideoView.b(str, str2, str3));
        }
        com.tencent.liteav.txcvodplayer.a.a aVar2 = aVar.f99483g;
        if (aVar2 != null) {
            aVar2.a("use_ex_subtitle", "1");
        }
    }

    public void attachTRTC(Object obj) {
        LiteavLog.i(TAG, "attachTRTC=" + obj + " player=" + hashCode());
        com.tencent.liteav.a aVar = this.mPlayer;
        if (obj != null) {
            aVar.B = obj;
            if (aVar.A == null) {
                d dVar = new d(aVar);
                aVar.A = dVar;
                synchronized (dVar) {
                    if (dVar.f100183a != null) {
                        LiteavLog.w("VodRenderer", "VodRenderer is initialized!");
                    } else {
                        LiteavLog.i("VodRenderer", "initialize VodRenderer");
                        HandlerThread handlerThread = new HandlerThread("VodRenderer_" + dVar.hashCode());
                        handlerThread.start();
                        dVar.f100183a = new CustomHandler(handlerThread.getLooper());
                        dVar.a(k.a(dVar), "initialize");
                    }
                }
            }
            TXCVodVideoView tXCVodVideoView = aVar.f99481e;
            tXCVodVideoView.f99970g = obj;
            ITXVCubePlayer iTXVCubePlayer = tXCVodVideoView.f99966c;
            if (iTXVCubePlayer != null) {
                iTXVCubePlayer.attachTRTC(obj);
            }
        }
    }

    public void deselectTrack(int i10) {
        LiteavLog.i(TAG, "deselectTrack trackIndex =" + i10 + " ,player=" + hashCode());
        ITXVCubePlayer iTXVCubePlayer = this.mPlayer.f99481e.f99966c;
        if (iTXVCubePlayer != null) {
            iTXVCubePlayer.deselectTrack(i10);
        }
    }

    public void detachTRTC() {
        LiteavLog.i(TAG, "detachTRTC player=" + hashCode());
        com.tencent.liteav.a aVar = this.mPlayer;
        aVar.B = null;
        d dVar = aVar.A;
        if (dVar != null) {
            dVar.a(false);
            dVar.a(new Runnable() { // from class: com.tencent.liteav.txcvodplayer.renderer.d.1
                public AnonymousClass1() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    LiteavLog.i("VodRenderer", "uninitialize VodRenderer");
                    if (d.this.f100185c != null) {
                        d.this.f100185c.a((DisplayTarget) null, false);
                        d.d(d.this);
                    }
                    d.e(d.this);
                    d.this.a();
                    synchronized (d.this) {
                        if (d.this.f100183a != null) {
                            d.this.f100183a.quitLooper();
                            d.g(d.this);
                        }
                    }
                }
            }, "uninitialize");
            aVar.A = null;
        }
        aVar.e();
        aVar.c();
        TXCVodVideoView tXCVodVideoView = aVar.f99481e;
        tXCVodVideoView.f99970g = null;
        ITXVCubePlayer iTXVCubePlayer = tXCVodVideoView.f99966c;
        if (iTXVCubePlayer != null) {
            iTXVCubePlayer.detachTRTC();
        }
    }

    public boolean enableHardwareDecode(boolean z10) {
        LiteavLog.i(TAG, "enableHardwareDecode=" + z10 + " player=" + hashCode());
        com.tencent.liteav.a aVar = this.mPlayer;
        if (z10) {
            if (LiteavSystemInfo.getSystemOSVersionInt() < 18) {
                LiteavLog.e("HardwareDecode", "enableHardwareDecode failed, android system build.version = " + LiteavSystemInfo.getSystemOSVersionInt() + ", the minimum build.version should be 18(android 4.3 or later)");
                return false;
            }
            if (LiteavSystemInfo.getManufacturer().equalsIgnoreCase("HUAWEI") && LiteavSystemInfo.getModel().equalsIgnoreCase("Che2-TL00")) {
                LiteavLog.e("HardwareDecode", "enableHardwareDecode failed, MANUFACTURER = " + LiteavSystemInfo.getManufacturer() + ", MODEL" + LiteavSystemInfo.getModel());
                return false;
            }
        }
        aVar.f99487k = z10;
        aVar.a(aVar.f99482f);
        return true;
    }

    public List<TXTrackInfo> getAudioTrackInfo() {
        com.tencent.liteav.a aVar = this.mPlayer;
        List<TXTrackInfo> listA = aVar.a();
        if (listA.isEmpty()) {
            return new ArrayList(0);
        }
        aVar.a("use_audiotrack", "1");
        return com.tencent.liteav.a.a(listA, 2);
    }

    public int getBitrateIndex() {
        return this.mPlayer.f99481e.getBitrateIndex();
    }

    public float getBufferDuration() {
        return this.mPlayer.f99481e.getBufferDuration() / 1000.0f;
    }

    public float getCurrentPlaybackTime() {
        return this.mPlayer.f99481e.getCurrentPosition() / 1000.0f;
    }

    public float getDuration() {
        return this.mPlayer.f99481e.getDuration() / 1000.0f;
    }

    public int getHeight() {
        return this.mPlayer.f99481e.getVideoHeight();
    }

    public float getPlayableDuration() {
        return this.mPlayer.f99481e.getBufferDuration() / 1000.0f;
    }

    public List<TXTrackInfo> getSubtitleTrackInfo() {
        com.tencent.liteav.a aVar = this.mPlayer;
        List<TXTrackInfo> listA = aVar.a();
        if (listA.isEmpty()) {
            return new ArrayList(0);
        }
        aVar.a("use_ex_subtitle", "1");
        return com.tencent.liteav.a.a(listA, 3);
    }

    public ArrayList<TXBitrateItem> getSupportedBitrates() {
        com.tencent.liteav.a aVar = this.mPlayer;
        ArrayList<TXBitrateItem> arrayList = new ArrayList<>();
        ArrayList<com.tencent.liteav.txcplayer.model.a> supportedBitrates = aVar.f99481e.getSupportedBitrates();
        if (supportedBitrates != null) {
            for (com.tencent.liteav.txcplayer.model.a aVar2 : supportedBitrates) {
                TXBitrateItem tXBitrateItem = new TXBitrateItem();
                tXBitrateItem.index = aVar2.f99928a;
                tXBitrateItem.width = aVar2.f99929b;
                tXBitrateItem.height = aVar2.f99930c;
                tXBitrateItem.bitrate = aVar2.f99931d;
                arrayList.add(tXBitrateItem);
            }
        }
        return arrayList;
    }

    public int getWidth() {
        return this.mPlayer.f99481e.getVideoWidth();
    }

    public boolean isLoop() {
        return this.mPlayer.f99501y;
    }

    public boolean isPlaying() {
        TXCVodVideoView tXCVodVideoView = this.mPlayer.f99481e;
        return tXCVodVideoView.b() && tXCVodVideoView.f99966c.isPlaying() && tXCVodVideoView.f99954a != 4;
    }

    public void pause() {
        LiteavLog.i(TAG, "pause player=" + hashCode());
        com.tencent.liteav.a aVar = this.mPlayer;
        TXCVodVideoView tXCVodVideoView = aVar.f99481e;
        tXCVodVideoView.f99965b = 4;
        LiteavLog.i("TXCVodVideoView", "pause vod=" + tXCVodVideoView.hashCode());
        if (tXCVodVideoView.b()) {
            try {
                tXCVodVideoView.f99966c.pause();
                tXCVodVideoView.f99978q.removeMessages(103);
            } catch (Exception e10) {
                LiteavLog.e("TXCVodVideoView", "pause exception: " + e10.getMessage());
            }
            tXCVodVideoView.f99954a = 4;
        }
        com.tencent.liteav.txcvodplayer.a.a aVar2 = aVar.f99483g;
        if (aVar2 != null) {
            LiteavLog.i("TXCVodPlayCollection", "pause " + aVar2.f100017k);
            if (!aVar2.f100012f) {
                aVar2.f100017k += System.currentTimeMillis() - aVar2.f100010d;
            }
            aVar2.f100012f = true;
            aVar2.f100010d = System.currentTimeMillis();
            if (aVar2.f100018l == -1) {
                aVar2.f100013g = true;
            }
        }
        aVar.c(true);
    }

    public void publishAudio() {
        LiteavLog.i(TAG, "publishAudio player=" + hashCode());
        this.mPlayer.d();
    }

    public void publishVideo() {
        LiteavLog.i(TAG, "publishVideo player=" + hashCode());
        this.mPlayer.b();
    }

    public void resume() {
        LiteavLog.i(TAG, "resume player=" + hashCode());
        com.tencent.liteav.a aVar = this.mPlayer;
        aVar.f99481e.setAutoPlay(true);
        aVar.f99481e.b(false);
        com.tencent.liteav.txcvodplayer.a.a aVar2 = aVar.f99483g;
        if (aVar2 != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            aVar2.f100010d = jCurrentTimeMillis;
            if (aVar2.f100013g) {
                aVar2.f100008b = jCurrentTimeMillis;
                aVar2.f100013g = false;
            }
            LiteavLog.i("TXCVodPlayCollection", "[resume], mBeginPlayTS = " + aVar2.f100010d + " ,mIsPreLoading = " + aVar2.f100013g);
            aVar2.f100012f = false;
        }
        aVar.c(false);
    }

    public void seek(float f10) {
        LiteavLog.i(TAG, "seek time=" + f10 + " player=" + hashCode());
        com.tencent.liteav.a aVar = this.mPlayer;
        TXVodPlayConfig tXVodPlayConfig = aVar.f99482f;
        aVar.a(f10, tXVodPlayConfig != null ? tXVodPlayConfig.isEnableAccurateSeek() : false);
    }

    public void seek(float f10, boolean z10) {
        LiteavLog.i(TAG, "seek time=" + f10 + ", isAccurateSeek=" + z10 + ", player=" + hashCode());
        this.mPlayer.a(f10, z10);
    }

    public void seek(int i10) {
        LiteavLog.i(TAG, "seek time=" + i10 + " player=" + hashCode());
        com.tencent.liteav.a aVar = this.mPlayer;
        float f10 = (float) i10;
        TXVodPlayConfig tXVodPlayConfig = aVar.f99482f;
        aVar.a(f10, tXVodPlayConfig != null ? tXVodPlayConfig.isEnableAccurateSeek() : false);
    }

    public void seekToPdtTime(long j10) {
        com.tencent.liteav.txcvodplayer.a.a aVar;
        LiteavLog.i(TAG, "seek pdtTimeMs=" + j10 + " player=" + hashCode());
        com.tencent.liteav.a aVar2 = this.mPlayer;
        TXCVodVideoView tXCVodVideoView = aVar2.f99481e;
        if (TXCVodVideoView.f99952i) {
            LiteavLog.i("TXCVodVideoView", "seek to " + j10 + "vod=" + tXCVodVideoView.hashCode());
            int positionMs = (int) tXCVodVideoView.f99966c.getPositionMs(j10);
            if (positionMs >= 0) {
                int iMin = Math.min(positionMs, tXCVodVideoView.getDuration());
                e eVar = tXCVodVideoView.f99967d;
                tXCVodVideoView.a(iMin, eVar != null ? eVar.f99909i : false);
            }
        } else {
            LiteavLog.i("TXCVodVideoView", "has no advanced license! not support PDT seek. vod=" + tXCVodVideoView.hashCode());
        }
        if (aVar2.f99484h && (aVar = aVar2.f99483g) != null) {
            aVar.f();
        }
        aVar2.a("use_pdt", "1");
    }

    public void selectTrack(int i10) {
        LiteavLog.i(TAG, "selectTrack trackIndex =" + i10 + " ,player=" + hashCode());
        TXCVodVideoView tXCVodVideoView = this.mPlayer.f99481e;
        TPTrackInfo[] trackInfo = tXCVodVideoView.getTrackInfo();
        if (trackInfo != null && i10 >= 0 && i10 < trackInfo.length) {
            TPTrackInfo tPTrackInfo = trackInfo[i10];
            if (tPTrackInfo.trackType == 3 && tPTrackInfo.isInternal && !TXCVodVideoView.f99952i) {
                return;
            }
        }
        ITXVCubePlayer iTXVCubePlayer = tXCVodVideoView.f99966c;
        if (iTXVCubePlayer != null) {
            iTXVCubePlayer.selectTrack(i10);
        }
    }

    public void setAudioNormalization(float f10) {
        LiteavLog.i(TAG, "setAudioNormalization, value=" + f10 + " player=" + hashCode());
        this.mPlayer.f99481e.setAudioNormalization(f10);
    }

    public void setAudioPlayoutVolume(int i10) {
        LiteavLog.i(TAG, "setAudioPlayoutVolume=" + i10 + " player=" + hashCode());
        com.tencent.liteav.a aVar = this.mPlayer;
        aVar.f99498v = i10;
        aVar.f99481e.setAudioPlayoutVolume(i10);
    }

    public void setAutoMaxBitrate(int i10) {
        LiteavLog.i(TAG, "setAutoMaxBitrate player=" + hashCode() + " autoMaxBitrate:" + i10);
        com.tencent.liteav.a aVar = this.mPlayer;
        aVar.D = i10;
        aVar.f99481e.setAutoMaxBitrate(i10);
    }

    public void setAutoPlay(boolean z10) {
        LiteavLog.i(TAG, "setAutoPlay=" + z10 + " player=" + hashCode());
        com.tencent.liteav.a aVar = this.mPlayer;
        aVar.f99486j = z10;
        aVar.f99481e.setAutoPlay(z10);
    }

    public void setBitrateIndex(int i10) {
        LiteavLog.i(TAG, "setBitrateIndex=" + i10 + " player=" + hashCode());
        this.mPlayer.c(i10);
    }

    public void setConfig(TXVodPlayConfig tXVodPlayConfig) {
        this.mPlayer.a(tXVodPlayConfig);
    }

    public void setLoop(boolean z10) {
        LiteavLog.i(TAG, "setLoop=" + z10 + " player=" + hashCode());
        this.mPlayer.f99501y = z10;
    }

    public void setMirror(boolean z10) {
        LiteavLog.i(TAG, "setMirror=" + z10 + " player=" + hashCode());
        this.mPlayer.b(z10);
    }

    public void setMute(boolean z10) {
        LiteavLog.i(TAG, "setMute=" + z10 + " player=" + hashCode());
        com.tencent.liteav.a aVar = this.mPlayer;
        aVar.f99497u = z10;
        aVar.f99481e.setMute(z10);
    }

    @Deprecated
    public void setPlayListener(ITXLivePlayListener iTXLivePlayListener) {
        LiteavLog.i(TAG, "setPlayListener=" + iTXLivePlayListener + " player=" + hashCode());
        this.mPlayer.f99478b = iTXLivePlayListener;
    }

    public void setPlayerView(TextureRenderView textureRenderView) {
        LiteavLog.i(TAG, "setPlayerView TextureRenderView=" + textureRenderView + " player=" + hashCode());
        this.mPlayer.f99481e.setRenderView(textureRenderView);
    }

    public void setPlayerView(TXCloudVideoView tXCloudVideoView) {
        LiteavLog.i(TAG, "setPlayerView TXCloudVideoView=" + tXCloudVideoView + " player=" + hashCode());
        com.tencent.liteav.a aVar = this.mPlayer;
        TXCloudVideoView tXCloudVideoView2 = aVar.f99477a;
        if (tXCloudVideoView != tXCloudVideoView2) {
            if (tXCloudVideoView2 != null) {
                tXCloudVideoView2.removeVideoView();
            }
            if (tXCloudVideoView != null) {
                tXCloudVideoView.removeVideoView();
            }
        }
        if (tXCloudVideoView != null) {
            tXCloudVideoView.setVisibility(0);
            if (aVar.A == null || aVar.B == null) {
                if (TXCCloudVideoViewMethodInvoker.getTextureViewSetByUser(tXCloudVideoView) == null) {
                    TextureRenderView textureRenderView = new TextureRenderView(tXCloudVideoView.getContext());
                    tXCloudVideoView.addVideoView(textureRenderView);
                    aVar.f99481e.setTextureRenderView(textureRenderView);
                }
            } else if (TXCCloudVideoViewMethodInvoker.getTextureViewSetByUser(tXCloudVideoView) == null) {
                tXCloudVideoView.addVideoView(new TextureView(tXCloudVideoView.getContext()));
                d dVar = aVar.A;
                dVar.a(g.a(dVar, new DisplayTarget(tXCloudVideoView)), "setDisplayTarget");
            }
            com.tencent.liteav.a.a(tXCloudVideoView, 0);
        }
        aVar.f99477a = tXCloudVideoView;
    }

    public void setRate(float f10) {
        LiteavLog.i(TAG, "setRate=" + f10 + " player=" + hashCode());
        this.mPlayer.a(f10);
    }

    public void setRenderMode(int i10) {
        LiteavLog.i(TAG, "setRenderMode=" + i10 + " player=" + hashCode());
        this.mPlayer.a(i10);
    }

    public void setRenderRotation(int i10) {
        LiteavLog.i(TAG, "setRenderRotation=" + i10 + " player=" + hashCode());
        this.mPlayer.b(i10);
    }

    public boolean setRequestAudioFocus(boolean z10) {
        LiteavLog.i(TAG, "setRequestAudioFocus=" + z10 + " player=" + hashCode());
        com.tencent.liteav.a aVar = this.mPlayer;
        aVar.f99485i = z10;
        return aVar.f99481e.c(z10);
    }

    public void setStartTime(float f10) {
        LiteavLog.i(TAG, "setStartTime=" + f10 + " player=" + hashCode());
        this.mPlayer.b(f10);
    }

    public void setStringOption(String str, Object obj) {
        LiteavLog.i(TAG, "setStringOption key=" + str + " value=" + obj + "player=" + hashCode());
        com.tencent.liteav.a aVar = this.mPlayer;
        final TXCVodVideoView tXCVodVideoView = aVar.f99481e;
        if (!TextUtils.isEmpty(str)) {
            if ((TextUtils.equals(str, "PARAM_MODULE_TYPE") || TextUtils.equals(str, "PARAM_SUPER_RESOLUTION_TYPE")) && obj != null && (obj instanceof Integer)) {
                int iIntValue = ((Integer) obj).intValue();
                RenderProcessService.getInstance().updateRenderProcessMode(tXCVodVideoView.f99966c, iIntValue);
                LiteavLog.i("TXCVodVideoView", "updateRenderProcessMode:".concat(String.valueOf(iIntValue)));
            }
            if (TextUtils.equals(str, TXVodConstants.VOD_KEY_BACKUP_URL)) {
                if (obj == null || !(obj instanceof String)) {
                    tXCVodVideoView.f99973l = "";
                } else {
                    tXCVodVideoView.f99973l = (String) obj;
                }
                LiteavLog.i("TXCVodVideoView", "mBackupPlayUrl:" + tXCVodVideoView.f99973l);
            }
            if (TextUtils.equals(str, TXVodConstants.VOD_KEY_MIMETYPE)) {
                if (obj == null || !(obj instanceof String)) {
                    tXCVodVideoView.f99972k = false;
                } else if (((String) obj).equals("video/hevc")) {
                    tXCVodVideoView.f99972k = true;
                    if (!TXCVodVideoView.f99953j) {
                        TXCVodVideoView.f99953j = true;
                        com.tencent.liteav.txcplayer.common.a.a().execute(new Runnable() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.4
                            @Override // java.lang.Runnable
                            public final void run() {
                                if (com.tencent.liteav.txcplayer.a.b.a("video/hevc")) {
                                    return;
                                }
                                TXCVodVideoView.f();
                                LiteavLog.i("TXCVodVideoView", "not support hevc!");
                            }
                        });
                    }
                }
            }
            if (TextUtils.equals(str, TXVodConstants.VOD_KEY_BACKUP_URL_MEDIA_TYPE)) {
                if (obj instanceof Integer) {
                    tXCVodVideoView.f99974m = ((Integer) obj).intValue();
                }
                LiteavLog.i("TXCVodVideoView", "mBackupUrlMediaType:" + tXCVodVideoView.f99974m);
            }
        }
        if ((TextUtils.equals(str, "PARAM_MODULE_TYPE") || TextUtils.equals(str, "PARAM_SUPER_RESOLUTION_TYPE")) && obj != null && (obj instanceof Integer)) {
            int iIntValue2 = ((Integer) obj).intValue();
            if (iIntValue2 == 1) {
                aVar.a("use_sr", "1");
            } else if (iIntValue2 == 11 || iIntValue2 == 12) {
                aVar.a("use_vr", "1");
            }
        }
    }

    public void setSubtitleStyle(TXSubtitleRenderModel tXSubtitleRenderModel) {
        this.mPlayer.f99481e.setSubtitleStyle(tXSubtitleRenderModel);
    }

    public void setSubtitleView(TXSubtitleView tXSubtitleView) {
        LiteavLog.i(TAG, "setSubtitleView view =" + tXSubtitleView + " player=" + hashCode());
        this.mPlayer.C = tXSubtitleView;
    }

    public void setSurface(Surface surface) {
        LiteavLog.i(TAG, "setSurface Surface=" + surface + " player=" + hashCode());
        com.tencent.liteav.a aVar = this.mPlayer;
        aVar.f99488l = surface;
        aVar.f99481e.setRenderSurface(surface);
    }

    public void setToken(String str) {
        LiteavLog.i(TAG, "setToken=" + str + " player=" + hashCode());
        this.mPlayer.f99490n = str;
    }

    public void setVodListener(ITXVodPlayListener iTXVodPlayListener) {
        LiteavLog.i(TAG, "setVodListener=" + iTXVodPlayListener + " player=" + hashCode());
        com.tencent.liteav.a aVar = this.mPlayer;
        aVar.f99480d = this;
        aVar.f99479c = iTXVodPlayListener;
    }

    public void setVodSubtitleDataListener(final ITXVodPlayListener.ITXVodSubtitleDataListener iTXVodSubtitleDataListener) {
        final com.tencent.liteav.a aVar = this.mPlayer;
        aVar.f99481e.setTXCOnSubtitleDataListener(new ITXVCubePlayer.i() { // from class: com.tencent.liteav.a.6
            @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer.i
            public final void a(ITXVCubePlayer iTXVCubePlayer, TPSubtitleData tPSubtitleData) {
                ITXVodPlayListener.ITXVodSubtitleDataListener iTXVodSubtitleDataListener2 = iTXVodSubtitleDataListener;
                if (iTXVodSubtitleDataListener2 != null) {
                    iTXVodSubtitleDataListener2.onSubtitleData(a.a(tPSubtitleData));
                }
            }
        });
    }

    public void snapshot(final TXLivePlayer.ITXSnapshotListener iTXSnapshotListener) {
        LiteavLog.i(TAG, "snapshot=" + iTXSnapshotListener + " player=" + hashCode());
        final com.tencent.liteav.a aVar = this.mPlayer;
        if (aVar.f99493q || iTXSnapshotListener == null) {
            return;
        }
        aVar.f99493q = true;
        TextureView textureViewSetByUser = TXCCloudVideoViewMethodInvoker.getTextureViewSetByUser(aVar.f99477a);
        if (textureViewSetByUser == null) {
            aVar.f99493q = false;
            return;
        }
        final Bitmap bitmap = textureViewSetByUser.getBitmap();
        if (bitmap != null) {
            Matrix transform = textureViewSetByUser.getTransform(null);
            if (aVar.f99500x) {
                transform.postScale(-1.0f, 1.0f);
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), transform, true);
            bitmap.recycle();
            bitmap = bitmapCreateBitmap;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tencent.liteav.a.5
            @Override // java.lang.Runnable
            public final void run() {
                TXLivePlayer.ITXSnapshotListener iTXSnapshotListener2 = iTXSnapshotListener;
                if (iTXSnapshotListener2 != null) {
                    iTXSnapshotListener2.onSnapshot(bitmap);
                }
                a.v(a.this);
            }
        });
    }

    public int startPlayDrm(TXPlayerDrmBuilder tXPlayerDrmBuilder) {
        LiteavLog.i(TAG, "startPlayDrm [PlayUrl=" + tXPlayerDrmBuilder.mPlayUrl + "][KeyLicenseUrl=" + tXPlayerDrmBuilder.mKeyLicenseUrl + "][ProvisionUrl=" + tXPlayerDrmBuilder.getDeviceCertificateUrl() + "][player=" + hashCode() + "]");
        com.tencent.liteav.a aVar = this.mPlayer;
        aVar.f99494r = null;
        return aVar.a(tXPlayerDrmBuilder.getPlayUrl(), tXPlayerDrmBuilder.getKeyLicenseUrl(), tXPlayerDrmBuilder.getDeviceCertificateUrl(), null, null);
    }

    @Deprecated
    public int startVodPlay(TXPlayerAuthBuilder tXPlayerAuthBuilder) {
        LiteavLog.i(TAG, "startPlay [FileId=" + tXPlayerAuthBuilder.fileId + "][Timeout=" + tXPlayerAuthBuilder.timeout + "][Unique identification request=" + tXPlayerAuthBuilder.us + "][Trial duration=" + tXPlayerAuthBuilder.exper + "][Sign=" + tXPlayerAuthBuilder.sign + "][player=" + hashCode() + "]");
        final com.tencent.liteav.a aVar = this.mPlayer;
        aVar.f99494r = null;
        aVar.g();
        aVar.f99495s = null;
        com.tencent.liteav.txcvodplayer.b.d dVar = new com.tencent.liteav.txcvodplayer.b.d();
        aVar.f99499w = dVar;
        dVar.f100095c = tXPlayerAuthBuilder.isHttps();
        aVar.f99499w.a(new com.tencent.liteav.txcvodplayer.b.e() { // from class: com.tencent.liteav.a.1
            @Override // com.tencent.liteav.txcvodplayer.b.e
            public final void a(com.tencent.liteav.txcvodplayer.b.d dVar2) {
                if (dVar2 != a.this.f99499w) {
                    return;
                }
                f fVarA = dVar2.a();
                a.this.a(fVarA.a());
                Bundle bundle = new Bundle();
                bundle.putInt(TXVodConstants.EVT_ID, 2010);
                bundle.putLong("EVT_TIME", TimeUtil.a());
                bundle.putLong("EVT_UTC_TIME", TimeUtil.b());
                bundle.putString("EVT_MSG", "Requested file information successfully");
                bundle.putString("EVT_PLAY_URL", fVarA.a());
                bundle.putString("EVT_PLAY_COVER_URL", fVarA.d());
                bundle.putString("EVT_PLAY_NAME", fVarA.g());
                bundle.putString("EVT_PLAY_DESCRIPTION", fVarA.h());
                if (fVarA.f() != null) {
                    bundle.putInt("EVT_PLAY_DURATION", fVarA.f().f100120e);
                }
                a.this.a(2010, bundle);
                LiteavLog.i("TXCVodPlayer", "onNetSuccess: Requested file information successfully");
            }

            @Override // com.tencent.liteav.txcvodplayer.b.e
            public final void a(com.tencent.liteav.txcvodplayer.b.d dVar2, String str, int i10) {
                if (dVar2 != a.this.f99499w) {
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putInt(TXVodConstants.EVT_ID, -2306);
                bundle.putLong("EVT_TIME", TimeUtil.a());
                bundle.putLong("EVT_UTC_TIME", TimeUtil.b());
                bundle.putString("EVT_MSG", str);
                bundle.putInt("EVT_PARAM1", i10);
                a.this.a(-2306, bundle);
                LiteavLog.i("TXCVodPlayer", "onNetFailed: eventId: -2306 description:".concat(String.valueOf(str)));
            }
        });
        LiteavLog.i("TXCVodPlayer", "startPlay [FileId:" + tXPlayerAuthBuilder.getFileId() + "][Timeout:" + tXPlayerAuthBuilder.getTimeout() + "][Unique identification request:" + tXPlayerAuthBuilder.getUs() + "][Trial duration:" + tXPlayerAuthBuilder.getExper() + "][Sign:" + tXPlayerAuthBuilder.getSign() + "]");
        return aVar.f99499w.a(tXPlayerAuthBuilder.getAppId(), tXPlayerAuthBuilder.getFileId(), tXPlayerAuthBuilder.getTimeout(), tXPlayerAuthBuilder.getUs(), tXPlayerAuthBuilder.getExper(), tXPlayerAuthBuilder.getSign());
    }

    public int startVodPlay(String str) {
        LiteavLog.i(TAG, "StartPlay url=" + str + " player=" + hashCode());
        com.tencent.liteav.a aVar = this.mPlayer;
        aVar.f99494r = null;
        if (TextUtils.equals(str, aVar.f99496t)) {
            Object obj = aVar.f99491o.get("TXC_DRM_ENABLE");
            if (obj instanceof Boolean ? ((Boolean) obj).booleanValue() : false) {
                return aVar.a(str, (String) aVar.f99491o.get("TXC_DRM_KEY_URL"), new TXPlayerDrmBuilder().getDeviceCertificateUrl(), (String) aVar.f99491o.get("TXC_DRM_SIMPLE_AES_URL"), aVar.f99495s);
            }
        } else {
            aVar.f99495s = null;
        }
        aVar.g();
        return aVar.a(str);
    }

    public void startVodPlay(final TXPlayInfoParams tXPlayInfoParams) {
        LiteavLog.i(TAG, "startPlay [FileId=" + tXPlayInfoParams.mFileId + "][AppId=" + tXPlayInfoParams.mAppId + "][PSign=" + tXPlayInfoParams.mPSign + "][player=" + hashCode() + "]");
        final com.tencent.liteav.a aVar = this.mPlayer;
        aVar.f99494r = tXPlayInfoParams;
        aVar.g();
        int i10 = aVar.f99492p;
        aVar.a(false);
        aVar.f99492p = i10;
        aVar.f99489m = false;
        new c(tXPlayInfoParams).a(new c.a() { // from class: com.tencent.liteav.a.2
            @Override // com.tencent.liteav.txcvodplayer.b.c.a
            public final void a(int i11, String str) {
                LiteavLog.w("TXCVodPlayer", "onFail: errorCode = " + i11 + " message = " + str);
                Bundle bundle = new Bundle();
                bundle.putInt(TXVodConstants.EVT_ID, -2306);
                bundle.putLong("EVT_TIME", TimeUtil.a());
                bundle.putLong("EVT_UTC_TIME", TimeUtil.b());
                bundle.putString("EVT_MSG", str);
                bundle.putInt("EVT_PARAM1", i11);
                com.tencent.liteav.txcvodplayer.a.a aVar2 = new com.tencent.liteav.txcvodplayer.a.a(a.this.E);
                aVar2.a(String.valueOf(tXPlayInfoParams.getAppId()));
                aVar2.f100027u = tXPlayInfoParams.getFileId();
                aVar2.f100025s = a.this.f99481e.getPlayerType();
                aVar2.a(a.this.f99486j);
                if (i11 == -1) {
                    i11 = -2306;
                }
                aVar2.a(i11, str + "|" + tXPlayInfoParams.getPSign());
                aVar2.a();
                a.this.a(-2306, bundle);
                LiteavLog.i("TXCVodPlayer", "onError: eventId: -2306 description:".concat(String.valueOf(str)));
            }

            @Override // com.tencent.liteav.txcvodplayer.b.c.a
            public final void a(c cVar, TXPlayInfoParams tXPlayInfoParams2) {
                LiteavLog.i("TXCVodPlayer", "onSuccess: protocol params = " + tXPlayInfoParams2.toString());
                if (a.this.f99489m) {
                    return;
                }
                if (a.this.f99494r == null || TextUtils.equals(tXPlayInfoParams2.getFileId(), a.this.f99494r.getFileId())) {
                    if ("SimpleAES".equalsIgnoreCase(cVar.l())) {
                        a.this.f99495s = cVar.f100060d;
                        com.tencent.liteav.txcvodplayer.c.a.a().b();
                    } else {
                        a.this.f99495s = null;
                    }
                    String strB = cVar.b();
                    String strA = cVar.a("Widevine");
                    if (TextUtils.isEmpty(strA)) {
                        a.this.g();
                        if (!TextUtils.isEmpty(strB)) {
                            String strA2 = com.tencent.liteav.txcplayer.a.a.a(strB, cVar.d());
                            a.this.f99490n = null;
                            String strL = cVar.l();
                            if (TextUtils.isEmpty(strL)) {
                                strL = org.apache.tools.ant.taskdefs.email.b.K;
                            }
                            a.this.a(com.tencent.liteav.txcplayer.a.a.a(strA2, tXPlayInfoParams2.getFileId(), strL, tXPlayInfoParams2.getAppId()));
                        }
                    } else {
                        a.this.f99490n = null;
                        a.this.a(strA, cVar.m(), new TXPlayerDrmBuilder().getDeviceCertificateUrl(), com.tencent.liteav.txcplayer.a.a.a(strB, cVar.d()), !TextUtils.isEmpty(strB) ? cVar.f100060d : null);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putInt(TXVodConstants.EVT_ID, 2010);
                    bundle.putLong("EVT_TIME", TimeUtil.a());
                    bundle.putLong("EVT_UTC_TIME", TimeUtil.b());
                    bundle.putString("EVT_MSG", "Requested file information successfully");
                    bundle.putString("EVT_PLAY_URL", a.this.f99496t);
                    bundle.putString("EVT_PLAY_COVER_URL", cVar.c());
                    bundle.putString("EVT_PLAY_NAME", cVar.e());
                    bundle.putString("EVT_PLAY_DESCRIPTION", cVar.f());
                    bundle.putInt("EVT_PLAY_DURATION", cVar.g());
                    com.tencent.liteav.txcvodplayer.b.b bVar = cVar.f100059c;
                    bundle.putString(TXVodConstants.EVT_KEY_WATER_MARK_TEXT, bVar != null ? bVar.f100044f : null);
                    c.C0963c c0963cI = cVar.i();
                    if (c0963cI != null) {
                        bundle.putString(TXVodConstants.EVT_IMAGESPRIT_WEBVTTURL, c0963cI.f100084b);
                        bundle.putStringArrayList(TXVodConstants.EVT_IMAGESPRIT_IMAGEURL_LIST, c0963cI.f100083a);
                    }
                    List<c.d> listJ = cVar.j();
                    if (listJ != null && !listJ.isEmpty()) {
                        ArrayList<String> arrayList = new ArrayList<>();
                        float[] fArr = new float[listJ.size()];
                        for (int i11 = 0; i11 < listJ.size(); i11++) {
                            arrayList.add(listJ.get(i11).f100085a);
                            fArr[i11] = listJ.get(i11).f100086b;
                        }
                        bundle.putStringArrayList(TXVodConstants.EVT_KEY_FRAME_CONTENT_LIST, arrayList);
                        bundle.putFloatArray(TXVodConstants.EVT_KEY_FRAME_TIME_LIST, fArr);
                    }
                    bundle.putString(TXVodConstants.EVT_DRM_TYPE, cVar.l());
                    a.this.a(2010, bundle);
                    LiteavLog.i("TXCVodPlayer", "onSuccess: Requested file information successfully, playInfo=" + tXPlayInfoParams2.toString());
                }
            }
        });
    }

    public int stopPlay(boolean z10) {
        LiteavLog.i(TAG, "stopPlay needClearLastImg=" + z10 + " player=" + hashCode());
        return this.mPlayer.a(z10);
    }

    public void unpublishAudio() {
        LiteavLog.i(TAG, "unpublishAudio player=" + hashCode());
        this.mPlayer.e();
    }

    public void unpublishVideo() {
        LiteavLog.i(TAG, "unpublishVideo player=" + hashCode());
        this.mPlayer.c();
    }
}
