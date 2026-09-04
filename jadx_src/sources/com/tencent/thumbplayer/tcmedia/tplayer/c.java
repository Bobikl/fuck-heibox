package com.tencent.thumbplayer.tcmedia.tplayer;

import android.text.TextUtils;
import com.tencent.thumbplayer.tcmedia.api.ITPPlayer;
import com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener;
import com.tencent.thumbplayer.tcmedia.api.TPAudioFrameBuffer;
import com.tencent.thumbplayer.tcmedia.api.TPPlayerDetailInfo;
import com.tencent.thumbplayer.tcmedia.api.TPPostProcessFrameBuffer;
import com.tencent.thumbplayer.tcmedia.api.TPRemoteSdpInfo;
import com.tencent.thumbplayer.tcmedia.api.TPSubtitleData;
import com.tencent.thumbplayer.tcmedia.api.TPSubtitleFrameBuffer;
import com.tencent.thumbplayer.tcmedia.api.TPVideoFrameBuffer;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;

/* JADX INFO: loaded from: classes4.dex */
public class c implements ITPPlayerListener.IOnAudioFrameOutputListener, ITPPlayerListener.IOnAudioProcessFrameOutputListener, ITPPlayerListener.IOnCompletionListener, ITPPlayerListener.IOnDemuxerListener, ITPPlayerListener.IOnDetailInfoListener, ITPPlayerListener.IOnErrorListener, ITPPlayerListener.IOnInfoListener, ITPPlayerListener.IOnPreparedListener, ITPPlayerListener.IOnSeekCompleteListener, ITPPlayerListener.IOnStateChangeListener, ITPPlayerListener.IOnStopAsyncCompleteListener, ITPPlayerListener.IOnSubtitleDataListener, ITPPlayerListener.IOnSubtitleFrameOutListener, ITPPlayerListener.IOnVideoFrameOutListener, ITPPlayerListener.IOnVideoProcessFrameOutputListener, ITPPlayerListener.IOnVideoSizeChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ITPPlayerListener.IOnPreparedListener f103045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ITPPlayerListener.IOnCompletionListener f103046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ITPPlayerListener.IOnInfoListener f103047c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ITPPlayerListener.IOnErrorListener f103048d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ITPPlayerListener.IOnSeekCompleteListener f103049e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ITPPlayerListener.IOnVideoSizeChangedListener f103050f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ITPPlayerListener.IOnSubtitleDataListener f103051g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ITPPlayerListener.IOnSubtitleFrameOutListener f103052h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ITPPlayerListener.IOnVideoFrameOutListener f103053i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ITPPlayerListener.IOnAudioFrameOutputListener f103054j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ITPPlayerListener.IOnVideoProcessFrameOutputListener f103055k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ITPPlayerListener.IOnAudioProcessFrameOutputListener f103056l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ITPPlayerListener.IOnStateChangeListener f103057m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ITPPlayerListener.IOnStopAsyncCompleteListener f103058n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ITPPlayerListener.IOnDetailInfoListener f103059o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ITPPlayerListener.IOnDemuxerListener f103060p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private a f103061q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f103062r = "TPPlayerListenerS";

    public static class a implements ITPPlayerListener.IOnAudioFrameOutputListener, ITPPlayerListener.IOnAudioProcessFrameOutputListener, ITPPlayerListener.IOnCompletionListener, ITPPlayerListener.IOnDemuxerListener, ITPPlayerListener.IOnDetailInfoListener, ITPPlayerListener.IOnErrorListener, ITPPlayerListener.IOnInfoListener, ITPPlayerListener.IOnPreparedListener, ITPPlayerListener.IOnSeekCompleteListener, ITPPlayerListener.IOnStateChangeListener, ITPPlayerListener.IOnStopAsyncCompleteListener, ITPPlayerListener.IOnSubtitleDataListener, ITPPlayerListener.IOnSubtitleFrameOutListener, ITPPlayerListener.IOnVideoFrameOutListener, ITPPlayerListener.IOnVideoProcessFrameOutputListener, ITPPlayerListener.IOnVideoSizeChangedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f103063a;

        public a(String str) {
            this.f103063a = str;
        }

        @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnAudioFrameOutputListener
        public void onAudioFrameOut(ITPPlayer iTPPlayer, TPAudioFrameBuffer tPAudioFrameBuffer) {
        }

        @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnAudioProcessFrameOutputListener
        public TPPostProcessFrameBuffer onAudioProcessFrameOut(ITPPlayer iTPPlayer, TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
            return null;
        }

        @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnCompletionListener
        public void onCompletion(ITPPlayer iTPPlayer) {
        }

        @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnDetailInfoListener
        public void onDetailInfo(ITPPlayer iTPPlayer, TPPlayerDetailInfo tPPlayerDetailInfo) {
        }

        @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnErrorListener
        public void onError(ITPPlayer iTPPlayer, int i10, int i11, long j10, long j11) {
        }

        @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnInfoListener
        public void onInfo(ITPPlayer iTPPlayer, int i10, long j10, long j11, Object obj) {
        }

        @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnPreparedListener
        public void onPrepared(ITPPlayer iTPPlayer) {
        }

        @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnDemuxerListener
        public TPRemoteSdpInfo onSdpExchange(ITPPlayer iTPPlayer, String str, int i10) {
            return null;
        }

        @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnSeekCompleteListener
        public void onSeekComplete(ITPPlayer iTPPlayer) {
            TPLogUtil.i(this.f103063a, " empty player listener , notify , onSeekComplete");
        }

        @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnStateChangeListener
        public void onStateChange(int i10, int i11) {
        }

        @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnStopAsyncCompleteListener
        public void onStopAsyncComplete(ITPPlayer iTPPlayer) {
        }

        @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnSubtitleDataListener
        public void onSubtitleData(ITPPlayer iTPPlayer, TPSubtitleData tPSubtitleData) {
            TPLogUtil.i(this.f103063a, " empty player listener , notify , onSubtitleData");
        }

        @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnSubtitleFrameOutListener
        public void onSubtitleFrameOut(ITPPlayer iTPPlayer, TPSubtitleFrameBuffer tPSubtitleFrameBuffer) {
        }

        @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnVideoFrameOutListener
        public void onVideoFrameOut(ITPPlayer iTPPlayer, TPVideoFrameBuffer tPVideoFrameBuffer) {
        }

        @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnVideoProcessFrameOutputListener
        public TPPostProcessFrameBuffer onVideoProcessFrameOut(ITPPlayer iTPPlayer, TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
            return null;
        }

        @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnVideoSizeChangedListener
        public void onVideoSizeChanged(ITPPlayer iTPPlayer, long j10, long j11) {
        }
    }

    c(String str) {
        a(str);
        a aVar = new a(this.f103062r);
        this.f103061q = aVar;
        this.f103045a = aVar;
        this.f103046b = aVar;
        this.f103047c = aVar;
        this.f103048d = aVar;
        this.f103049e = aVar;
        this.f103050f = aVar;
        this.f103051g = aVar;
        this.f103052h = aVar;
        this.f103053i = aVar;
        this.f103054j = aVar;
        this.f103055k = aVar;
        this.f103056l = aVar;
        this.f103057m = aVar;
        this.f103058n = aVar;
        this.f103059o = aVar;
        this.f103060p = aVar;
    }

    public void a() {
        a aVar = this.f103061q;
        this.f103045a = aVar;
        this.f103046b = aVar;
        this.f103047c = aVar;
        this.f103048d = aVar;
        this.f103049e = aVar;
        this.f103050f = aVar;
        this.f103051g = aVar;
        this.f103053i = aVar;
        this.f103054j = aVar;
        this.f103057m = aVar;
        this.f103058n = aVar;
        this.f103059o = aVar;
        this.f103060p = aVar;
    }

    public void a(ITPPlayerListener.IOnAudioFrameOutputListener iOnAudioFrameOutputListener) {
        if (iOnAudioFrameOutputListener == null) {
            iOnAudioFrameOutputListener = this.f103061q;
        }
        this.f103054j = iOnAudioFrameOutputListener;
    }

    public void a(ITPPlayerListener.IOnAudioProcessFrameOutputListener iOnAudioProcessFrameOutputListener) {
        if (iOnAudioProcessFrameOutputListener == null) {
            iOnAudioProcessFrameOutputListener = this.f103061q;
        }
        this.f103056l = iOnAudioProcessFrameOutputListener;
    }

    public void a(ITPPlayerListener.IOnCompletionListener iOnCompletionListener) {
        if (iOnCompletionListener == null) {
            iOnCompletionListener = this.f103061q;
        }
        this.f103046b = iOnCompletionListener;
    }

    public void a(ITPPlayerListener.IOnDemuxerListener iOnDemuxerListener) {
        if (iOnDemuxerListener == null) {
            iOnDemuxerListener = this.f103061q;
        }
        this.f103060p = iOnDemuxerListener;
    }

    public void a(ITPPlayerListener.IOnDetailInfoListener iOnDetailInfoListener) {
        if (iOnDetailInfoListener == null) {
            iOnDetailInfoListener = this.f103061q;
        }
        this.f103059o = iOnDetailInfoListener;
    }

    public void a(ITPPlayerListener.IOnErrorListener iOnErrorListener) {
        if (iOnErrorListener == null) {
            iOnErrorListener = this.f103061q;
        }
        this.f103048d = iOnErrorListener;
    }

    public void a(ITPPlayerListener.IOnInfoListener iOnInfoListener) {
        if (iOnInfoListener == null) {
            iOnInfoListener = this.f103061q;
        }
        this.f103047c = iOnInfoListener;
    }

    public void a(ITPPlayerListener.IOnPreparedListener iOnPreparedListener) {
        if (iOnPreparedListener == null) {
            iOnPreparedListener = this.f103061q;
        }
        this.f103045a = iOnPreparedListener;
    }

    public void a(ITPPlayerListener.IOnSeekCompleteListener iOnSeekCompleteListener) {
        if (iOnSeekCompleteListener == null) {
            iOnSeekCompleteListener = this.f103061q;
        }
        this.f103049e = iOnSeekCompleteListener;
    }

    public void a(ITPPlayerListener.IOnStateChangeListener iOnStateChangeListener) {
        if (iOnStateChangeListener == null) {
            iOnStateChangeListener = this.f103061q;
        }
        this.f103057m = iOnStateChangeListener;
    }

    public void a(ITPPlayerListener.IOnStopAsyncCompleteListener iOnStopAsyncCompleteListener) {
        if (iOnStopAsyncCompleteListener == null) {
            iOnStopAsyncCompleteListener = this.f103061q;
        }
        this.f103058n = iOnStopAsyncCompleteListener;
    }

    public void a(ITPPlayerListener.IOnSubtitleDataListener iOnSubtitleDataListener) {
        if (iOnSubtitleDataListener == null) {
            iOnSubtitleDataListener = this.f103061q;
        }
        this.f103051g = iOnSubtitleDataListener;
    }

    public void a(ITPPlayerListener.IOnSubtitleFrameOutListener iOnSubtitleFrameOutListener) {
        if (iOnSubtitleFrameOutListener == null) {
            iOnSubtitleFrameOutListener = this.f103061q;
        }
        this.f103052h = iOnSubtitleFrameOutListener;
    }

    public void a(ITPPlayerListener.IOnVideoFrameOutListener iOnVideoFrameOutListener) {
        if (iOnVideoFrameOutListener == null) {
            iOnVideoFrameOutListener = this.f103061q;
        }
        this.f103053i = iOnVideoFrameOutListener;
    }

    public void a(ITPPlayerListener.IOnVideoProcessFrameOutputListener iOnVideoProcessFrameOutputListener) {
        if (iOnVideoProcessFrameOutputListener == null) {
            iOnVideoProcessFrameOutputListener = this.f103061q;
        }
        this.f103055k = iOnVideoProcessFrameOutputListener;
    }

    public void a(ITPPlayerListener.IOnVideoSizeChangedListener iOnVideoSizeChangedListener) {
        if (iOnVideoSizeChangedListener == null) {
            iOnVideoSizeChangedListener = this.f103061q;
        }
        this.f103050f = iOnVideoSizeChangedListener;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f103062r = "TPPlayerListenerS";
        } else {
            this.f103062r = str;
        }
        a aVar = this.f103061q;
        if (aVar != null) {
            aVar.f103063a = str;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnAudioFrameOutputListener
    public void onAudioFrameOut(ITPPlayer iTPPlayer, TPAudioFrameBuffer tPAudioFrameBuffer) {
        this.f103054j.onAudioFrameOut(iTPPlayer, tPAudioFrameBuffer);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnAudioProcessFrameOutputListener
    public TPPostProcessFrameBuffer onAudioProcessFrameOut(ITPPlayer iTPPlayer, TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
        return this.f103056l.onAudioProcessFrameOut(iTPPlayer, tPPostProcessFrameBuffer);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnCompletionListener
    public void onCompletion(ITPPlayer iTPPlayer) {
        this.f103046b.onCompletion(iTPPlayer);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnDetailInfoListener
    public void onDetailInfo(ITPPlayer iTPPlayer, TPPlayerDetailInfo tPPlayerDetailInfo) {
        this.f103059o.onDetailInfo(iTPPlayer, tPPlayerDetailInfo);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnErrorListener
    public void onError(ITPPlayer iTPPlayer, int i10, int i11, long j10, long j11) {
        this.f103048d.onError(iTPPlayer, i10, i11, j10, j11);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnInfoListener
    public void onInfo(ITPPlayer iTPPlayer, int i10, long j10, long j11, Object obj) {
        this.f103047c.onInfo(iTPPlayer, i10, j10, j11, obj);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnPreparedListener
    public void onPrepared(ITPPlayer iTPPlayer) {
        this.f103045a.onPrepared(iTPPlayer);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnDemuxerListener
    public TPRemoteSdpInfo onSdpExchange(ITPPlayer iTPPlayer, String str, int i10) {
        return this.f103060p.onSdpExchange(iTPPlayer, str, i10);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnSeekCompleteListener
    public void onSeekComplete(ITPPlayer iTPPlayer) {
        this.f103049e.onSeekComplete(iTPPlayer);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnStateChangeListener
    public void onStateChange(int i10, int i11) {
        this.f103057m.onStateChange(i10, i11);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnStopAsyncCompleteListener
    public void onStopAsyncComplete(ITPPlayer iTPPlayer) {
        this.f103058n.onStopAsyncComplete(iTPPlayer);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnSubtitleDataListener
    public void onSubtitleData(ITPPlayer iTPPlayer, TPSubtitleData tPSubtitleData) {
        this.f103051g.onSubtitleData(iTPPlayer, tPSubtitleData);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnSubtitleFrameOutListener
    public void onSubtitleFrameOut(ITPPlayer iTPPlayer, TPSubtitleFrameBuffer tPSubtitleFrameBuffer) {
        this.f103052h.onSubtitleFrameOut(iTPPlayer, tPSubtitleFrameBuffer);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnVideoFrameOutListener
    public void onVideoFrameOut(ITPPlayer iTPPlayer, TPVideoFrameBuffer tPVideoFrameBuffer) {
        this.f103053i.onVideoFrameOut(iTPPlayer, tPVideoFrameBuffer);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnVideoProcessFrameOutputListener
    public TPPostProcessFrameBuffer onVideoProcessFrameOut(ITPPlayer iTPPlayer, TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
        return this.f103055k.onVideoProcessFrameOut(iTPPlayer, tPPostProcessFrameBuffer);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnVideoSizeChangedListener
    public void onVideoSizeChanged(ITPPlayer iTPPlayer, long j10, long j11) {
        this.f103050f.onVideoSizeChanged(iTPPlayer, j10, j11);
    }
}
