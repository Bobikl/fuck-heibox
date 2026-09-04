package com.tencent.thumbplayer.tcmedia.adapter.a.a;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.os.ParcelFileDescriptor;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.tencent.thumbplayer.tcmedia.adapter.i;
import com.tencent.thumbplayer.tcmedia.api.TPAudioFrameBuffer;
import com.tencent.thumbplayer.tcmedia.api.TPCaptureCallBack;
import com.tencent.thumbplayer.tcmedia.api.TPCaptureParams;
import com.tencent.thumbplayer.tcmedia.api.TPCommonEnum;
import com.tencent.thumbplayer.tcmedia.api.TPOptionalParam;
import com.tencent.thumbplayer.tcmedia.api.TPPlayerState;
import com.tencent.thumbplayer.tcmedia.api.TPPostProcessFrameBuffer;
import com.tencent.thumbplayer.tcmedia.api.TPProgramInfo;
import com.tencent.thumbplayer.tcmedia.api.TPSubtitleData;
import com.tencent.thumbplayer.tcmedia.api.TPTrackInfo;
import com.tencent.thumbplayer.tcmedia.api.TPVideoFrameBuffer;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrack;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrackClip;
import com.tencent.thumbplayer.tcmedia.b.h;
import com.tencent.thumbplayer.tcmedia.core.player.TPDynamicStatisticParams;
import com.tencent.thumbplayer.tcmedia.core.player.TPGeneralPlayFlowParams;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class d implements com.tencent.thumbplayer.tcmedia.adapter.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.tencent.thumbplayer.tcmedia.e.a f102178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.tencent.thumbplayer.tcmedia.e.b f102179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f102180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.tencent.thumbplayer.tcmedia.adapter.a.b f102181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TPPlayerState f102182e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.tencent.thumbplayer.tcmedia.adapter.g f102183f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a f102184g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.tencent.thumbplayer.tcmedia.adapter.c f102185h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private i f102186i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.tencent.thumbplayer.tcmedia.adapter.b f102187j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List<ITPMediaTrackClip> f102188k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f102189l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f102190m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f102191n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private LinkedList<Long> f102192o;

    public class a implements com.tencent.thumbplayer.tcmedia.adapter.a.c.a, com.tencent.thumbplayer.tcmedia.adapter.a.c.b, com.tencent.thumbplayer.tcmedia.adapter.a.c.InterfaceC1013c, com.tencent.thumbplayer.tcmedia.adapter.a.c.f, com.tencent.thumbplayer.tcmedia.adapter.a.c.h, com.tencent.thumbplayer.tcmedia.adapter.a.c.i, com.tencent.thumbplayer.tcmedia.adapter.a.c.j, com.tencent.thumbplayer.tcmedia.adapter.a.c.l, com.tencent.thumbplayer.tcmedia.adapter.a.c.n, com.tencent.thumbplayer.tcmedia.adapter.a.c.o, com.tencent.thumbplayer.tcmedia.adapter.a.c.p {
        private a() {
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.o
        public TPPostProcessFrameBuffer a(TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
            return d.this.a(tPPostProcessFrameBuffer);
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.i
        public void a() {
            d.this.a();
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.f
        public void a(int i10, int i11, long j10, long j11) {
            d.this.a(i10, i11, j10, j11);
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.h
        public void a(int i10, long j10, long j11, Object obj) {
            d.this.a(i10, j10, j11, obj);
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.p
        public void a(long j10, long j11) {
            d.this.a(j10, j11);
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.a
        public void a(TPAudioFrameBuffer tPAudioFrameBuffer) {
            d.this.a(tPAudioFrameBuffer);
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.l
        public void a(TPSubtitleData tPSubtitleData) {
            d.this.a(tPSubtitleData);
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.n
        public void a(TPVideoFrameBuffer tPVideoFrameBuffer) {
            d.this.a(tPVideoFrameBuffer);
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.b
        public TPPostProcessFrameBuffer b(TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
            return d.this.b(tPPostProcessFrameBuffer);
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.InterfaceC1013c
        public void b() {
            d.this.b();
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.j
        public void c() {
            d.this.d();
        }
    }

    public d(Context context, com.tencent.thumbplayer.tcmedia.e.b bVar) {
        com.tencent.thumbplayer.tcmedia.e.b bVar2 = new com.tencent.thumbplayer.tcmedia.e.b(bVar, "TPSystemClipPlayer");
        this.f102179b = bVar2;
        this.f102178a = new com.tencent.thumbplayer.tcmedia.e.a(bVar2);
        this.f102180c = context;
        this.f102182e = new TPPlayerState();
        this.f102185h = new com.tencent.thumbplayer.tcmedia.adapter.c();
        this.f102184g = new a();
        this.f102183f = new com.tencent.thumbplayer.tcmedia.adapter.g(this.f102178a.b());
        this.f102186i = new i(this.f102182e);
        this.f102188k = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TPPostProcessFrameBuffer a(TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
        if (this.f102186i.b(7)) {
            return this.f102183f.a(tPPostProcessFrameBuffer);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        com.tencent.thumbplayer.tcmedia.adapter.g gVar = this.f102183f;
        if (gVar != null) {
            gVar.a(152, this.f102189l, 0L, (Object) null);
        }
        if (!this.f102190m) {
            if (this.f102186i.b(1)) {
                this.f102182e.changeState(4);
                com.tencent.thumbplayer.tcmedia.adapter.g gVar2 = this.f102183f;
                if (gVar2 != null) {
                    gVar2.a();
                }
                b(this.f102181d);
                return;
            }
            return;
        }
        i();
        if (!this.f102191n || this.f102183f == null || com.tencent.thumbplayer.tcmedia.utils.b.a(this.f102192o)) {
            return;
        }
        Long lPoll = this.f102192o.poll();
        if (lPoll != null) {
            this.f102183f.a(3, lPoll.longValue(), 0L, (Object) null);
        }
        this.f102191n = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, int i11, long j10, long j11) {
        if (this.f102186i.b(4)) {
            this.f102183f.a(i10, i11, j10, j11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, long j10, long j11, Object obj) {
        if (this.f102186i.b(3)) {
            this.f102183f.a(i10, j10, j11, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j10, long j11) {
        if (this.f102186i.b(6)) {
            this.f102187j.b(j11);
            this.f102187j.a(j10);
            this.f102183f.a(j10, j11);
        }
    }

    private void a(com.tencent.thumbplayer.tcmedia.adapter.a.b bVar) {
        if (1 == this.f102185h.e().g()) {
            bVar.a(this.f102185h.e().c());
        } else if (4 == this.f102185h.e().g()) {
            bVar.a(this.f102185h.e().d());
        }
        if (this.f102185h.e().g() == 0) {
            bVar.a(this.f102185h.e().a(), this.f102185h.e().b());
        }
        Iterator<TPOptionalParam> it = this.f102185h.o().iterator();
        while (it.hasNext()) {
            bVar.a(it.next());
        }
        for (com.tencent.thumbplayer.tcmedia.adapter.c.d dVar : this.f102185h.m()) {
            bVar.a(dVar.f102355a, dVar.f102358d, dVar.f102356b, dVar.f102357c);
        }
        for (com.tencent.thumbplayer.tcmedia.adapter.c.a aVar : this.f102185h.n()) {
            bVar.a(aVar.f102345a, aVar.f102348d, aVar.f102346b, aVar.f102347c);
        }
        if (this.f102185h.k() != null) {
            bVar.a(this.f102185h.k().f102349a, this.f102185h.k().f102350b, this.f102185h.k().f102351c);
        }
        bVar.a(this.f102185h.g());
        if (this.f102185h.h() != 0.0f) {
            bVar.a(this.f102185h.h());
        }
        if (this.f102185h.j() != 0.0f) {
            bVar.b(this.f102185h.j());
        }
        if (this.f102185h.d() instanceof SurfaceHolder) {
            bVar.a((SurfaceHolder) this.f102185h.d());
        } else if (this.f102185h.d() instanceof Surface) {
            bVar.a((Surface) this.f102185h.d());
        }
        bVar.a((com.tencent.thumbplayer.tcmedia.adapter.a.c.h) this.f102184g);
        bVar.a((com.tencent.thumbplayer.tcmedia.adapter.a.c.i) this.f102184g);
        bVar.a((com.tencent.thumbplayer.tcmedia.adapter.a.c.InterfaceC1013c) this.f102184g);
        bVar.a((com.tencent.thumbplayer.tcmedia.adapter.a.c.f) this.f102184g);
        bVar.a((com.tencent.thumbplayer.tcmedia.adapter.a.c.j) this.f102184g);
        bVar.a((com.tencent.thumbplayer.tcmedia.adapter.a.c.p) this.f102184g);
        bVar.a((com.tencent.thumbplayer.tcmedia.adapter.a.c.l) this.f102184g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(TPAudioFrameBuffer tPAudioFrameBuffer) {
        if (this.f102186i.b(7)) {
            this.f102183f.a(tPAudioFrameBuffer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(TPSubtitleData tPSubtitleData) {
        if (this.f102186i.b(7)) {
            this.f102183f.a(tPSubtitleData);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(TPVideoFrameBuffer tPVideoFrameBuffer) {
        if (this.f102186i.b(7)) {
            this.f102183f.a(tPVideoFrameBuffer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TPPostProcessFrameBuffer b(TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
        if (this.f102186i.b(7)) {
            return this.f102183f.b(tPPostProcessFrameBuffer);
        }
        return null;
    }

    private List<ITPMediaTrackClip> b(ITPMediaAsset iTPMediaAsset) {
        boolean z10 = iTPMediaAsset instanceof com.tencent.thumbplayer.tcmedia.b.e;
        if (!z10 && !(iTPMediaAsset instanceof com.tencent.thumbplayer.tcmedia.b.g) && !(iTPMediaAsset instanceof h)) {
            throw new IllegalStateException("system mediaPlayer : media asset is illegal source!");
        }
        List<ITPMediaTrackClip> arrayList = new ArrayList<>();
        if (z10) {
            List<ITPMediaTrack> allAVTracks = ((com.tencent.thumbplayer.tcmedia.b.e) iTPMediaAsset).getAllAVTracks();
            if (com.tencent.thumbplayer.tcmedia.utils.b.a(allAVTracks) || allAVTracks.get(0) == null) {
                throw new IllegalStateException("empty av tracks when set data source!");
            }
            arrayList = allAVTracks.get(0).getAllTrackClips();
        } else if (iTPMediaAsset instanceof com.tencent.thumbplayer.tcmedia.b.g) {
            arrayList = ((com.tencent.thumbplayer.tcmedia.b.g) iTPMediaAsset).getAllTrackClips();
        } else {
            arrayList.add((ITPMediaTrackClip) iTPMediaAsset);
        }
        long originalDurationMs = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            arrayList.get(i10).setStartPositionMs(originalDurationMs);
            originalDurationMs += arrayList.get(i10).getOriginalDurationMs();
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.f102186i.b(2)) {
            if (this.f102189l >= this.f102188k.size() - 1) {
                this.f102182e.changeState(7);
                this.f102183f.b();
                return;
            }
            try {
                d(this.f102189l + 1, 0L);
            } catch (IOException e10) {
                this.f102178a.c("handleOnComplete:" + e10.toString());
            }
        }
    }

    private void b(com.tencent.thumbplayer.tcmedia.adapter.a.b bVar) {
        TPTrackInfo[] tPTrackInfoArrS = s();
        if (tPTrackInfoArrS == null) {
            return;
        }
        for (int i10 = 0; i10 < tPTrackInfoArrS.length; i10++) {
            if (tPTrackInfoArrS[i10].equals(this.f102185h.a(tPTrackInfoArrS[i10].getTrackType()))) {
                bVar.a(i10, -1L);
            }
        }
    }

    private ITPMediaTrackClip c() {
        return this.f102188k.get(this.f102189l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (this.f102186i.b(5)) {
            if (this.f102182e.is(7)) {
                i();
            }
            this.f102183f.c();
        }
    }

    private void d(int i10) {
        for (int i11 = 0; i11 < this.f102188k.size(); i11++) {
            long j10 = i10;
            if (this.f102188k.get(i11).getStartPositionMs() <= j10 && j10 <= this.f102188k.get(i11).getStartPositionMs() + this.f102188k.get(i11).getOriginalDurationMs()) {
                try {
                    d(i11, j10 - this.f102188k.get(i11).getStartPositionMs());
                } catch (IOException e10) {
                    this.f102178a.c("selectClipPlayer:" + e10.toString());
                }
            }
        }
    }

    private void d(int i10, long j10) {
        this.f102178a.b("switchPlayer: clipNo:" + i10 + "   startPostion:" + j10);
        com.tencent.thumbplayer.tcmedia.adapter.a.b bVar = this.f102181d;
        if (bVar != null) {
            bVar.m();
        }
        this.f102190m = true;
        this.f102189l = i10;
        this.f102185h.a(this.f102188k.get(i10).getFilePath(), this.f102188k.get(this.f102189l).getHttpHeader());
        com.tencent.thumbplayer.tcmedia.adapter.a.b bVarE = e();
        this.f102181d = bVarE;
        if (bVarE == null) {
            throw new RuntimeException("error , create player failed");
        }
        this.f102181d.a(new TPOptionalParam().buildLong(100, j10));
        this.f102181d.g();
    }

    private com.tencent.thumbplayer.tcmedia.adapter.a.b e() {
        e eVar = new e(this.f102180c, this.f102179b);
        if (this.f102187j == null) {
            this.f102187j = new com.tencent.thumbplayer.tcmedia.adapter.b();
        }
        a(eVar);
        return eVar;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(float f10) {
        if (this.f102186i.a(3)) {
            com.tencent.thumbplayer.tcmedia.adapter.a.b bVar = this.f102181d;
            if (bVar != null) {
                bVar.a(f10);
            }
            this.f102185h.a(f10);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(int i10) {
        if (this.f102186i.a(9)) {
            long j10 = i10;
            if (j10 < c().getStartPositionMs() || j10 > c().getStartPositionMs() + c().getOriginalDurationMs()) {
                d(i10);
            } else if (this.f102181d != null) {
                this.f102178a.b("seek to:".concat(String.valueOf(i10)));
                this.f102181d.a((int) (j10 - c().getStartPositionMs()));
            }
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(int i10, @TPCommonEnum.TPSeekMode int i11) {
        if (this.f102186i.a(9)) {
            long j10 = i10;
            if (j10 < c().getStartPositionMs() || j10 > c().getStartPositionMs() + c().getOriginalDurationMs()) {
                d(i10);
                return;
            }
            if (this.f102181d != null) {
                this.f102178a.b("seek to:" + i10 + "/mode=" + i11);
                this.f102181d.a((int) (j10 - c().getStartPositionMs()), i11);
            }
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(int i10, long j10) {
        this.f102178a.e("selectTrack not supported.");
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(AssetFileDescriptor assetFileDescriptor) {
        this.f102185h.a(assetFileDescriptor);
        this.f102182e.changeState(2);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(ParcelFileDescriptor parcelFileDescriptor) {
        this.f102185h.a(parcelFileDescriptor);
        this.f102182e.changeState(2);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(Surface surface) {
        if (!this.f102186i.a(4)) {
            throw new IllegalStateException("setSurface , state invalid");
        }
        com.tencent.thumbplayer.tcmedia.adapter.a.b bVar = this.f102181d;
        if (bVar != null) {
            bVar.a(surface);
        }
        this.f102185h.a(surface);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(SurfaceHolder surfaceHolder) {
        if (!this.f102186i.a(4)) {
            throw new IllegalStateException("setSurfaceHolder , state invalid");
        }
        com.tencent.thumbplayer.tcmedia.adapter.a.b bVar = this.f102181d;
        if (bVar != null) {
            bVar.a(surfaceHolder);
        }
        this.f102185h.a(surfaceHolder);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.a aVar) {
        throw new IllegalStateException("system Mediaplayer cannot support audio frame out");
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.b bVar) {
        throw new IllegalStateException("system Mediaplayer cannot support audio postprocess frame out");
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.InterfaceC1013c interfaceC1013c) {
        this.f102183f.a(interfaceC1013c);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.d dVar) {
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.e eVar) {
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.f fVar) {
        this.f102183f.a(fVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.g gVar) {
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.h hVar) {
        this.f102183f.a(hVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.i iVar) {
        this.f102183f.a(iVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.j jVar) {
        this.f102183f.a(jVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.l lVar) {
        this.f102183f.a(lVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.m mVar) {
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.n nVar) {
        throw new IllegalStateException("system Mediaplayer cannot support video frame out");
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.o oVar) {
        throw new IllegalStateException("system Mediaplayer cannot support video postprocess frame out");
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.p pVar) {
        this.f102183f.a(pVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(TPCaptureParams tPCaptureParams, TPCaptureCallBack tPCaptureCallBack) {
        com.tencent.thumbplayer.tcmedia.adapter.a.b bVar = this.f102181d;
        if (bVar != null) {
            bVar.a(tPCaptureParams, tPCaptureCallBack);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(TPOptionalParam tPOptionalParam) {
        if (tPOptionalParam.getKey() == 100) {
            int i10 = (int) tPOptionalParam.getParamLong().value;
            this.f102178a.b("start position:".concat(String.valueOf(i10)));
            for (int i11 = 0; i11 < this.f102188k.size(); i11++) {
                long j10 = i10;
                if (this.f102188k.get(i11).getStartPositionMs() <= j10 && j10 <= this.f102188k.get(i11).getStartPositionMs() + this.f102188k.get(i11).getOriginalDurationMs()) {
                    this.f102189l = i11;
                    this.f102185h.b(this.f102188k.get(i11).getFilePath());
                    tPOptionalParam.getParamLong().value = j10 - this.f102188k.get(i11).getStartPositionMs();
                }
            }
        }
        com.tencent.thumbplayer.tcmedia.adapter.a.b bVar = this.f102181d;
        if (bVar != null) {
            bVar.a(tPOptionalParam);
        }
        this.f102185h.a(tPOptionalParam);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(ITPMediaAsset iTPMediaAsset) {
        List<ITPMediaTrackClip> listB = b(iTPMediaAsset);
        try {
            this.f102188k = listB;
            this.f102185h.a(listB.get(this.f102189l).getFilePath(), this.f102188k.get(this.f102189l).getHttpHeader());
            this.f102182e.changeState(2);
        } catch (Exception e10) {
            this.f102178a.a(e10);
            throw new IllegalStateException("exception when system clip player set data source!");
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(ITPMediaAsset iTPMediaAsset, @TPCommonEnum.TPSwitchDefMode int i10, long j10) {
        List<ITPMediaTrackClip> listB = b(iTPMediaAsset);
        if (com.tencent.thumbplayer.tcmedia.utils.b.a(listB)) {
            throw new IllegalStateException("exception when switch Definition with clip mediaAsset empty source!");
        }
        long jO = o();
        try {
            this.f102188k = listB;
            this.f102191n = true;
            if (com.tencent.thumbplayer.tcmedia.utils.b.a(this.f102192o)) {
                this.f102192o = new LinkedList<>();
            }
            this.f102192o.offer(Long.valueOf(j10));
            this.f102178a.c("try to switch definition with system clip player, current clipNo:" + this.f102189l);
            d((int) jO);
        } catch (Exception e10) {
            this.f102178a.a(e10);
            throw new IllegalStateException("exception when system clip player switch definition!");
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(com.tencent.thumbplayer.tcmedia.e.b bVar) {
        this.f102178a.a(new com.tencent.thumbplayer.tcmedia.e.b(bVar, "TPSystemClipPlayer"));
        com.tencent.thumbplayer.tcmedia.adapter.g gVar = this.f102183f;
        if (gVar == null || bVar == null) {
            return;
        }
        gVar.a(this.f102178a.a().a());
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(String str) {
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(String str, @TPCommonEnum.TPSwitchDefMode int i10, long j10) {
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(String str, Map<String, String> map) {
        this.f102185h.a(str, map);
        this.f102182e.changeState(2);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(String str, Map<String, String> map, @TPCommonEnum.TPSwitchDefMode int i10, long j10) {
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(String str, Map<String, String> map, String str2, String str3) {
        this.f102178a.e("addSubtitleSource not supported.");
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(String str, Map<String, String> map, String str2, List<TPOptionalParam> list) {
        this.f102178a.e("addAudioTrackSource not supported.");
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(boolean z10) {
        if (this.f102186i.a(3)) {
            com.tencent.thumbplayer.tcmedia.adapter.a.b bVar = this.f102181d;
            if (bVar != null) {
                bVar.a(z10);
            }
            this.f102185h.a(z10);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(boolean z10, long j10, long j11) {
        if (this.f102186i.a(3)) {
            com.tencent.thumbplayer.tcmedia.adapter.a.b bVar = this.f102181d;
            if (bVar != null) {
                bVar.a(z10, j10, j11);
            }
            this.f102185h.a(z10, j10, j11);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public long b(int i10) {
        com.tencent.thumbplayer.tcmedia.adapter.a.b bVar = this.f102181d;
        if (bVar != null) {
            return bVar.b(i10);
        }
        return -1L;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void b(float f10) {
        if (this.f102186i.a(3)) {
            com.tencent.thumbplayer.tcmedia.adapter.a.b bVar = this.f102181d;
            if (bVar != null) {
                bVar.b(f10);
            }
            this.f102185h.b(f10);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void b(int i10, long j10) {
        this.f102178a.e("deselectTrack not supported.");
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void b(boolean z10) {
        if (this.f102186i.a(3)) {
            com.tencent.thumbplayer.tcmedia.adapter.a.b bVar = this.f102181d;
            if (bVar != null) {
                bVar.b(z10);
            }
            this.f102185h.b(z10);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public TPDynamicStatisticParams c(boolean z10) {
        return null;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public String c(int i10) {
        com.tencent.thumbplayer.tcmedia.adapter.a.b bVar = this.f102181d;
        return bVar != null ? bVar.c(i10) : "";
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void c(int i10, long j10) {
        this.f102178a.e("selectProgram not supported.");
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void g() throws IOException {
        if (this.f102186i.a(1)) {
            if (!this.f102185h.f()) {
                throw new IOException("error , prepare , data source invalid");
            }
            com.tencent.thumbplayer.tcmedia.adapter.a.b bVarE = e();
            this.f102181d = bVarE;
            if (bVarE == null) {
                throw new RuntimeException("error , create player failed");
            }
            this.f102182e.changeState(3);
            this.f102181d.g();
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void h() {
        if (this.f102186i.a(1)) {
            if (!this.f102185h.f()) {
                throw new IllegalStateException("error , prepare , state invalid , data source invalid");
            }
            com.tencent.thumbplayer.tcmedia.adapter.a.b bVarE = e();
            this.f102181d = bVarE;
            if (bVarE == null) {
                throw new RuntimeException("error , create player failed");
            }
            this.f102182e.changeState(3);
            this.f102181d.h();
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void i() {
        if (this.f102186i.a(5)) {
            com.tencent.thumbplayer.tcmedia.adapter.a.b bVar = this.f102181d;
            if (bVar == null) {
                throw new IllegalStateException("error , start , player is null");
            }
            try {
                bVar.i();
                this.f102182e.changeState(5);
            } catch (IllegalStateException unused) {
                throw new IllegalStateException("error , start ,state invalid");
            }
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void j() {
        if (this.f102186i.a(6)) {
            com.tencent.thumbplayer.tcmedia.adapter.a.b bVar = this.f102181d;
            if (bVar == null) {
                throw new IllegalStateException("error , pause , player is null");
            }
            try {
                bVar.j();
                this.f102182e.changeState(6);
            } catch (IllegalStateException unused) {
                throw new IllegalStateException("error , pause ,state invalid");
            }
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void k() {
        if (this.f102186i.a(7)) {
            if (this.f102181d == null) {
                throw new IllegalStateException("error , stop , player is null");
            }
            try {
                try {
                    this.f102182e.changeState(8);
                    this.f102181d.k();
                    this.f102182e.changeState(9);
                } catch (IllegalStateException unused) {
                    throw new IllegalStateException("error , pause ,state invalid");
                }
            } catch (Throwable th2) {
                this.f102182e.changeState(9);
                throw th2;
            }
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void l() {
        this.f102178a.c("reset, current state:" + this.f102182e);
        com.tencent.thumbplayer.tcmedia.adapter.a.b bVar = this.f102181d;
        if (bVar != null) {
            bVar.l();
        }
        this.f102185h.a();
        this.f102183f.e();
        this.f102182e.changeState(1);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void m() {
        this.f102178a.c("release, current state:" + this.f102182e);
        com.tencent.thumbplayer.tcmedia.adapter.a.b bVar = this.f102181d;
        if (bVar != null) {
            bVar.m();
            this.f102181d = null;
        }
        this.f102185h.a();
        this.f102183f.e();
        this.f102182e.changeState(11);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public long n() {
        Iterator<ITPMediaTrackClip> it = this.f102188k.iterator();
        long originalDurationMs = 0;
        while (it.hasNext()) {
            originalDurationMs += it.next().getOriginalDurationMs();
        }
        return originalDurationMs;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public long o() {
        long originalDurationMs = 0;
        for (int i10 = 0; i10 < this.f102188k.size() && i10 < this.f102189l; i10++) {
            originalDurationMs += this.f102188k.get(i10).getOriginalDurationMs();
        }
        return !this.f102186i.a(12) ? originalDurationMs : originalDurationMs + this.f102181d.o();
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public long p() {
        if (this.f102186i.a(15)) {
            return this.f102181d.p();
        }
        com.tencent.thumbplayer.tcmedia.adapter.b bVar = this.f102187j;
        if (bVar != null) {
            return bVar.l();
        }
        return 0L;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public int q() {
        com.tencent.thumbplayer.tcmedia.adapter.b bVar = this.f102187j;
        if (bVar == null) {
            return 0;
        }
        if (bVar.a() <= 0) {
            if (!this.f102186i.a(13)) {
                return 0;
            }
            this.f102187j.a(this.f102181d.q());
        }
        return (int) this.f102187j.a();
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public int r() {
        com.tencent.thumbplayer.tcmedia.adapter.b bVar = this.f102187j;
        if (bVar == null) {
            return 0;
        }
        if (bVar.b() <= 0) {
            if (!this.f102186i.a(13)) {
                return 0;
            }
            this.f102187j.b(this.f102181d.r());
        }
        return (int) this.f102187j.b();
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public TPTrackInfo[] s() {
        this.f102178a.e("getTrackInfo not supported.");
        return new TPTrackInfo[0];
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public TPProgramInfo[] t() {
        this.f102178a.e("getProgramInfo not supported.");
        return new TPProgramInfo[0];
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public long[] u() {
        return new long[]{-1, -1};
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public TPGeneralPlayFlowParams v() {
        return null;
    }
}
