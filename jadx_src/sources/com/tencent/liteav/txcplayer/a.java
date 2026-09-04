package com.tencent.liteav.txcplayer;

import com.tencent.thumbplayer.tcmedia.api.TPSubtitleData;
import com.tencent.thumbplayer.tcmedia.api.TPSubtitleFrameBuffer;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements ITXVCubePlayer {
    private ITXVCubePlayer.c mOnBufferingUpdateListener;
    private ITXVCubePlayer.d mOnCompletionListener;
    private ITXVCubePlayer.e mOnErrorListener;
    private ITXVCubePlayer.a mOnGetTargetState;
    private ITXVCubePlayer.f mOnInfoListener;
    private ITXVCubePlayer.g mOnPreparedListener;
    private ITXVCubePlayer.h mOnSeekCompleteListener;
    private ITXVCubePlayer.i mOnSubtitleDataListener;
    private ITXVCubePlayer.b mOnSubtitleFrameDataListener;
    private ITXVCubePlayer.j mOnVideoSizeChangedListener;

    public int getTXCVodVideoViewTargetState() {
        ITXVCubePlayer.a aVar = this.mOnGetTargetState;
        if (aVar != null) {
            return aVar.a();
        }
        return 0;
    }

    public final void notifyOnBufferingUpdate(int i10) {
    }

    public final void notifyOnCompletion() {
        ITXVCubePlayer.d dVar = this.mOnCompletionListener;
        if (dVar != null) {
            dVar.a();
        }
    }

    public final boolean notifyOnError(int i10, int i11) {
        ITXVCubePlayer.e eVar = this.mOnErrorListener;
        if (eVar == null) {
            return false;
        }
        eVar.a(i10, i11);
        return true;
    }

    public final boolean notifyOnInfo(int i10, int i11, int i12, Object obj) {
        ITXVCubePlayer.f fVar = this.mOnInfoListener;
        return fVar != null && fVar.a(i10, i11, i12, obj);
    }

    public final void notifyOnPrepared() {
        ITXVCubePlayer.g gVar = this.mOnPreparedListener;
        if (gVar != null) {
            gVar.a(this);
        }
    }

    public final void notifyOnSeekComplete() {
        ITXVCubePlayer.h hVar = this.mOnSeekCompleteListener;
        if (hVar != null) {
            hVar.a();
        }
    }

    public final void notifyOnSubtitleData(TPSubtitleData tPSubtitleData) {
        ITXVCubePlayer.i iVar = this.mOnSubtitleDataListener;
        if (iVar != null) {
            iVar.a(this, tPSubtitleData);
        }
    }

    public final void notifyOnVideoSizeChanged(int i10, int i11, int i12, int i13, String str) {
        ITXVCubePlayer.j jVar = this.mOnVideoSizeChangedListener;
        if (jVar != null) {
            jVar.a(this, i10, i11, str);
        }
    }

    public final void notifySubtitleFrameData(TPSubtitleFrameBuffer tPSubtitleFrameBuffer) {
        ITXVCubePlayer.b bVar = this.mOnSubtitleFrameDataListener;
        if (bVar != null) {
            bVar.a(this, tPSubtitleFrameBuffer);
        }
    }

    public void resetListeners() {
        this.mOnPreparedListener = null;
        this.mOnBufferingUpdateListener = null;
        this.mOnCompletionListener = null;
        this.mOnSeekCompleteListener = null;
        this.mOnVideoSizeChangedListener = null;
        this.mOnErrorListener = null;
        this.mOnInfoListener = null;
        this.mOnSubtitleDataListener = null;
        this.mOnSubtitleFrameDataListener = null;
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public final void setOnBufferingUpdateListener(ITXVCubePlayer.c cVar) {
        this.mOnBufferingUpdateListener = cVar;
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public final void setOnCompletionListener(ITXVCubePlayer.d dVar) {
        this.mOnCompletionListener = dVar;
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public final void setOnErrorListener(ITXVCubePlayer.e eVar) {
        this.mOnErrorListener = eVar;
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void setOnGetTXCVodVideoViewTargetState(ITXVCubePlayer.a aVar) {
        this.mOnGetTargetState = aVar;
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public final void setOnInfoListener(ITXVCubePlayer.f fVar) {
        this.mOnInfoListener = fVar;
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public final void setOnPreparedListener(ITXVCubePlayer.g gVar) {
        this.mOnPreparedListener = gVar;
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public final void setOnSeekCompleteListener(ITXVCubePlayer.h hVar) {
        this.mOnSeekCompleteListener = hVar;
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public final void setOnSubtitleDataListener(ITXVCubePlayer.i iVar) {
        this.mOnSubtitleDataListener = iVar;
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public final void setOnSubtitleFrameDataListener(ITXVCubePlayer.b bVar) {
        this.mOnSubtitleFrameDataListener = bVar;
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public final void setOnVideoSizeChangedListener(ITXVCubePlayer.j jVar) {
        this.mOnVideoSizeChangedListener = jVar;
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void setPrivateConfig(Map<String, Object> map) {
    }
}
