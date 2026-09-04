package com.tencent.liteav.txcplayer;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.tencent.liteav.txcplayer.model.TXSubtitleRenderModel;
import com.tencent.thumbplayer.tcmedia.api.TPSubtitleData;
import com.tencent.thumbplayer.tcmedia.api.TPSubtitleFrameBuffer;
import com.tencent.thumbplayer.tcmedia.api.TPTrackInfo;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public interface ITXVCubePlayer {
    public static final int INDEX_AUTO = -1;
    public static final int INITIAL_BITRATE_INDEX_VALUE = -1000;

    public interface a {
        int a();
    }

    public interface b {
        void a(ITXVCubePlayer iTXVCubePlayer, TPSubtitleFrameBuffer tPSubtitleFrameBuffer);
    }

    public interface c {
    }

    public interface d {
        void a();
    }

    public interface e {
        boolean a(int i10, int i11);
    }

    public interface f {
        boolean a(int i10, int i11, int i12, Object obj);
    }

    public interface g {
        void a(ITXVCubePlayer iTXVCubePlayer);
    }

    public interface h {
        void a();
    }

    public interface i {
        void a(ITXVCubePlayer iTXVCubePlayer, TPSubtitleData tPSubtitleData);
    }

    public interface j {
        void a(ITXVCubePlayer iTXVCubePlayer, int i10, int i11, String str);
    }

    void addSubtitleSource(String str, String str2, String str3);

    void attachTRTC(Object obj);

    void checkSubtitle();

    void deselectTrack(int i10);

    void detachTRTC();

    void enableAdaptiveBitrate();

    int getBitrateIndex();

    long getCurrentPosition();

    long getDuration();

    com.tencent.liteav.txcplayer.model.b getMediaInfo();

    long getPdtTimeMs(long j10);

    long getPlayableDurationMs();

    long getPositionMs(long j10);

    long getPropertyLong(int i10) throws IllegalStateException;

    float getRate();

    ArrayList<com.tencent.liteav.txcplayer.model.a> getSupportedBitrates();

    Surface getSurface();

    TPTrackInfo[] getTrackInfo();

    int getVideoHeight();

    int getVideoSarDen();

    int getVideoSarNum();

    int getVideoWidth();

    boolean isLooping();

    @Deprecated
    boolean isPlayable();

    boolean isPlaying();

    void pause() throws IllegalStateException;

    void prepareAsync() throws IllegalStateException;

    void publishAudioToNetwork();

    void release();

    void reset();

    void seekTo(long j10, boolean z10) throws IllegalStateException;

    void selectTrack(int i10);

    void setAudioNormalization(float f10);

    void setAudioStreamType(int i10);

    void setAudioVolume(int i10);

    void setAutoMaxBitrate(int i10);

    void setBitrateIndex(int i10);

    void setConfig(com.tencent.liteav.txcplayer.e eVar);

    void setDataSource(Context context, Uri uri) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException;

    void setDataSource(Context context, Uri uri, Map<String, String> map) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException;

    void setDataSource(FileDescriptor fileDescriptor) throws IllegalStateException, IOException, IllegalArgumentException;

    void setDataSource(String str) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException;

    void setDisplay(SurfaceHolder surfaceHolder);

    @Deprecated
    void setKeepInBackground(boolean z10);

    @Deprecated
    void setLogEnabled(boolean z10);

    void setLooping(boolean z10);

    void setOnBufferingUpdateListener(c cVar);

    void setOnCompletionListener(d dVar);

    void setOnErrorListener(e eVar);

    void setOnGetTXCVodVideoViewTargetState(a aVar);

    void setOnInfoListener(f fVar);

    void setOnPreparedListener(g gVar);

    void setOnSeekCompleteListener(h hVar);

    void setOnSubtitleDataListener(i iVar);

    void setOnSubtitleFrameDataListener(b bVar);

    void setOnVideoSizeChangedListener(j jVar);

    void setPrivateConfig(Map<String, Object> map);

    void setRate(float f10);

    void setScreenOnWhilePlaying(boolean z10);

    void setSubtitleStyle(TXSubtitleRenderModel tXSubtitleRenderModel);

    void setSurface(Surface surface);

    @Deprecated
    void setWakeMode(Context context, int i10);

    void start() throws IllegalStateException;

    void stop() throws IllegalStateException;

    void unpublishAudioToNetwork();
}
