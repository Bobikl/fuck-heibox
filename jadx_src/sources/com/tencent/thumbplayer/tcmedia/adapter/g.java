package com.tencent.thumbplayer.tcmedia.adapter;

import android.text.TextUtils;
import com.tencent.thumbplayer.tcmedia.api.TPAudioFrameBuffer;
import com.tencent.thumbplayer.tcmedia.api.TPCommonEnum;
import com.tencent.thumbplayer.tcmedia.api.TPDrmInfo;
import com.tencent.thumbplayer.tcmedia.api.TPPlayerDetailInfo;
import com.tencent.thumbplayer.tcmedia.api.TPPostProcessFrameBuffer;
import com.tencent.thumbplayer.tcmedia.api.TPRemoteSdpInfo;
import com.tencent.thumbplayer.tcmedia.api.TPSubtitleData;
import com.tencent.thumbplayer.tcmedia.api.TPSubtitleFrameBuffer;
import com.tencent.thumbplayer.tcmedia.api.TPVideoFrameBuffer;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;

/* JADX INFO: loaded from: classes4.dex */
public class g implements com.tencent.thumbplayer.tcmedia.adapter.a.c.a, com.tencent.thumbplayer.tcmedia.adapter.a.c.b, com.tencent.thumbplayer.tcmedia.adapter.a.c.InterfaceC1013c, com.tencent.thumbplayer.tcmedia.adapter.a.c.d, com.tencent.thumbplayer.tcmedia.adapter.a.c.e, com.tencent.thumbplayer.tcmedia.adapter.a.c.f, com.tencent.thumbplayer.tcmedia.adapter.a.c.g, com.tencent.thumbplayer.tcmedia.adapter.a.c.h, com.tencent.thumbplayer.tcmedia.adapter.a.c.i, com.tencent.thumbplayer.tcmedia.adapter.a.c.j, com.tencent.thumbplayer.tcmedia.adapter.a.c.k, com.tencent.thumbplayer.tcmedia.adapter.a.c.l, com.tencent.thumbplayer.tcmedia.adapter.a.c.m, com.tencent.thumbplayer.tcmedia.adapter.a.c.n, com.tencent.thumbplayer.tcmedia.adapter.a.c.o, com.tencent.thumbplayer.tcmedia.adapter.a.c.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.tencent.thumbplayer.tcmedia.adapter.a.c.i f102383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.tencent.thumbplayer.tcmedia.adapter.a.c.InterfaceC1013c f102384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.tencent.thumbplayer.tcmedia.adapter.a.c.h f102385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.tencent.thumbplayer.tcmedia.adapter.a.c.f f102386d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.tencent.thumbplayer.tcmedia.adapter.a.c.j f102387e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.tencent.thumbplayer.tcmedia.adapter.a.c.p f102388f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.tencent.thumbplayer.tcmedia.adapter.a.c.l f102389g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.tencent.thumbplayer.tcmedia.adapter.a.c.n f102390h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.tencent.thumbplayer.tcmedia.adapter.a.c.a f102391i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.tencent.thumbplayer.tcmedia.adapter.a.c.m f102392j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.tencent.thumbplayer.tcmedia.adapter.a.c.o f102393k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private com.tencent.thumbplayer.tcmedia.adapter.a.c.b f102394l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private com.tencent.thumbplayer.tcmedia.adapter.a.c.k f102395m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.tencent.thumbplayer.tcmedia.adapter.a.c.e f102396n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private com.tencent.thumbplayer.tcmedia.adapter.a.c.g f102397o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private com.tencent.thumbplayer.tcmedia.adapter.a.c.d f102398p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private a f102399q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f102400r = "TPPlayerListenerS";

    public static class a implements com.tencent.thumbplayer.tcmedia.adapter.a.c.a, com.tencent.thumbplayer.tcmedia.adapter.a.c.b, com.tencent.thumbplayer.tcmedia.adapter.a.c.InterfaceC1013c, com.tencent.thumbplayer.tcmedia.adapter.a.c.d, com.tencent.thumbplayer.tcmedia.adapter.a.c.e, com.tencent.thumbplayer.tcmedia.adapter.a.c.f, com.tencent.thumbplayer.tcmedia.adapter.a.c.g, com.tencent.thumbplayer.tcmedia.adapter.a.c.h, com.tencent.thumbplayer.tcmedia.adapter.a.c.i, com.tencent.thumbplayer.tcmedia.adapter.a.c.j, com.tencent.thumbplayer.tcmedia.adapter.a.c.k, com.tencent.thumbplayer.tcmedia.adapter.a.c.l, com.tencent.thumbplayer.tcmedia.adapter.a.c.m, com.tencent.thumbplayer.tcmedia.adapter.a.c.n, com.tencent.thumbplayer.tcmedia.adapter.a.c.o, com.tencent.thumbplayer.tcmedia.adapter.a.c.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f102401a;

        public a(String str) {
            this.f102401a = str;
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.o
        public TPPostProcessFrameBuffer a(TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
            TPLogUtil.i(this.f102401a, " empty base listener , notify , onVideoProcessFrameOut");
            return null;
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.d
        public TPRemoteSdpInfo a(String str, int i10) {
            TPLogUtil.i(this.f102401a, " empty base listener , notify , onSdpExchange");
            return null;
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.i
        public void a() {
            TPLogUtil.i(this.f102401a, " empty base listener , notify , onPrepared");
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.f
        public void a(int i10, int i11, long j10, long j11) {
            TPLogUtil.i(this.f102401a, " empty base listener , notify , onError");
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.h
        public void a(int i10, long j10, long j11, Object obj) {
            TPLogUtil.i(this.f102401a, " empty base listener , notify , onInfo");
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.p
        public void a(long j10, long j11) {
            TPLogUtil.i(this.f102401a, " empty base listener , notify , onVideoSizeChanged");
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.a
        public void a(TPAudioFrameBuffer tPAudioFrameBuffer) {
            TPLogUtil.i(this.f102401a, " empty base listener , notify , onAudioFrameOut");
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.g
        public void a(TPDrmInfo tPDrmInfo) {
            TPLogUtil.i(this.f102401a, " empty base listener , notify , onEventRecord");
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.e
        public void a(TPPlayerDetailInfo tPPlayerDetailInfo) {
            TPLogUtil.i(this.f102401a, " empty base listener , notify , onDetailInfo");
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.l
        public void a(TPSubtitleData tPSubtitleData) {
            TPLogUtil.i(this.f102401a, " empty base listener , notify , onSubtitleData");
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.m
        public void a(TPSubtitleFrameBuffer tPSubtitleFrameBuffer) {
            TPLogUtil.i(this.f102401a, " empty base listener , notify , TPSubtitleFrameBuffer");
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.n
        public void a(TPVideoFrameBuffer tPVideoFrameBuffer) {
            TPLogUtil.i(this.f102401a, " empty base listener , notify , onVideoFrameOut");
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.b
        public TPPostProcessFrameBuffer b(TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
            TPLogUtil.i(this.f102401a, " empty base listener , notify , onAudioProcessFrameOut");
            return null;
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.InterfaceC1013c
        public void b() {
            TPLogUtil.i(this.f102401a, " empty base listener , notify , onCompletion");
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.k
        public void b(int i10, int i11) {
            TPLogUtil.i(this.f102401a, " empty base listener , notify , onStateChange");
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.j
        public void c() {
            TPLogUtil.i(this.f102401a, " empty base listener , notify , onSeekComplete");
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.d
        public void d() {
            TPLogUtil.i(this.f102401a, " empty base listener , notify , onDurationUpdate");
        }
    }

    public g(String str) {
        a(str);
        a aVar = new a(this.f102400r);
        this.f102399q = aVar;
        this.f102383a = aVar;
        this.f102384b = aVar;
        this.f102385c = aVar;
        this.f102386d = aVar;
        this.f102387e = aVar;
        this.f102388f = aVar;
        this.f102389g = aVar;
        this.f102390h = aVar;
        this.f102391i = aVar;
        this.f102392j = aVar;
        this.f102393k = aVar;
        this.f102394l = aVar;
        this.f102395m = aVar;
        this.f102396n = aVar;
        this.f102397o = aVar;
        this.f102398p = aVar;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.o
    public TPPostProcessFrameBuffer a(TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
        return this.f102393k.a(tPPostProcessFrameBuffer);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.d
    public TPRemoteSdpInfo a(String str, int i10) {
        return this.f102398p.a(str, i10);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.i
    public void a() {
        this.f102383a.a();
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.f
    public void a(@TPCommonEnum.TPErrorType int i10, int i11, long j10, long j11) {
        this.f102386d.a(i10, i11, j10, j11);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.h
    public void a(int i10, long j10, long j11, Object obj) {
        this.f102385c.a(i10, j10, j11, obj);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.p
    public void a(long j10, long j11) {
        this.f102388f.a(j10, j11);
    }

    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.a aVar) {
        if (aVar == null) {
            aVar = this.f102399q;
        }
        this.f102391i = aVar;
    }

    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.b bVar) {
        if (bVar == null) {
            bVar = this.f102399q;
        }
        this.f102394l = bVar;
    }

    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.InterfaceC1013c interfaceC1013c) {
        if (interfaceC1013c == null) {
            interfaceC1013c = this.f102399q;
        }
        this.f102384b = interfaceC1013c;
    }

    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.d dVar) {
        if (dVar == null) {
            dVar = this.f102399q;
        }
        this.f102398p = dVar;
    }

    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.e eVar) {
        if (eVar == null) {
            eVar = this.f102399q;
        }
        this.f102396n = eVar;
    }

    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.f fVar) {
        if (fVar == null) {
            fVar = this.f102399q;
        }
        this.f102386d = fVar;
    }

    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.g gVar) {
        if (gVar == null) {
            gVar = this.f102399q;
        }
        this.f102397o = gVar;
    }

    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.h hVar) {
        if (hVar == null) {
            hVar = this.f102399q;
        }
        this.f102385c = hVar;
    }

    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.i iVar) {
        if (iVar == null) {
            iVar = this.f102399q;
        }
        this.f102383a = iVar;
    }

    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.j jVar) {
        if (jVar == null) {
            jVar = this.f102399q;
        }
        this.f102387e = jVar;
    }

    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.k kVar) {
        if (kVar == null) {
            kVar = this.f102399q;
        }
        this.f102395m = kVar;
    }

    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.l lVar) {
        if (lVar == null) {
            lVar = this.f102399q;
        }
        this.f102389g = lVar;
    }

    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.m mVar) {
        if (mVar == null) {
            mVar = this.f102399q;
        }
        this.f102392j = mVar;
    }

    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.n nVar) {
        if (nVar == null) {
            nVar = this.f102399q;
        }
        this.f102390h = nVar;
    }

    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.o oVar) {
        if (oVar == null) {
            oVar = this.f102399q;
        }
        this.f102393k = oVar;
    }

    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.p pVar) {
        if (pVar == null) {
            pVar = this.f102399q;
        }
        this.f102388f = pVar;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.a
    public void a(TPAudioFrameBuffer tPAudioFrameBuffer) {
        this.f102391i.a(tPAudioFrameBuffer);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.g
    public void a(TPDrmInfo tPDrmInfo) {
        this.f102397o.a(tPDrmInfo);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.e
    public void a(TPPlayerDetailInfo tPPlayerDetailInfo) {
        this.f102396n.a(tPPlayerDetailInfo);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.l
    public void a(TPSubtitleData tPSubtitleData) {
        this.f102389g.a(tPSubtitleData);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.m
    public void a(TPSubtitleFrameBuffer tPSubtitleFrameBuffer) {
        this.f102392j.a(tPSubtitleFrameBuffer);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.n
    public void a(TPVideoFrameBuffer tPVideoFrameBuffer) {
        this.f102390h.a(tPVideoFrameBuffer);
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "TPPlayerListenerS";
        }
        this.f102400r = str;
        a aVar = this.f102399q;
        if (aVar != null) {
            aVar.f102401a = this.f102400r;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.b
    public TPPostProcessFrameBuffer b(TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
        return this.f102394l.b(tPPostProcessFrameBuffer);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.InterfaceC1013c
    public void b() {
        this.f102384b.b();
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.k
    public void b(int i10, int i11) {
        this.f102395m.b(i10, i11);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.j
    public void c() {
        this.f102387e.c();
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.d
    public void d() {
        this.f102398p.d();
    }

    public void e() {
        a aVar = this.f102399q;
        this.f102383a = aVar;
        this.f102384b = aVar;
        this.f102385c = aVar;
        this.f102386d = aVar;
        this.f102387e = aVar;
        this.f102388f = aVar;
        this.f102389g = aVar;
        this.f102390h = aVar;
        this.f102391i = aVar;
        this.f102392j = aVar;
        this.f102395m = aVar;
        this.f102393k = aVar;
        this.f102394l = aVar;
        this.f102396n = aVar;
        this.f102397o = aVar;
        this.f102398p = aVar;
    }
}
