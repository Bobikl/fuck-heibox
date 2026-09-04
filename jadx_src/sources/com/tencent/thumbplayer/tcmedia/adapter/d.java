package com.tencent.thumbplayer.tcmedia.adapter;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.tencent.thumbplayer.tcmedia.api.TPAudioFrameBuffer;
import com.tencent.thumbplayer.tcmedia.api.TPCaptureCallBack;
import com.tencent.thumbplayer.tcmedia.api.TPCaptureParams;
import com.tencent.thumbplayer.tcmedia.api.TPCommonEnum;
import com.tencent.thumbplayer.tcmedia.api.TPDrmInfo;
import com.tencent.thumbplayer.tcmedia.api.TPOptionalParam;
import com.tencent.thumbplayer.tcmedia.api.TPPlayerDetailInfo;
import com.tencent.thumbplayer.tcmedia.api.TPPlayerState;
import com.tencent.thumbplayer.tcmedia.api.TPPostProcessFrameBuffer;
import com.tencent.thumbplayer.tcmedia.api.TPProgramInfo;
import com.tencent.thumbplayer.tcmedia.api.TPRemoteSdpInfo;
import com.tencent.thumbplayer.tcmedia.api.TPSubtitleData;
import com.tencent.thumbplayer.tcmedia.api.TPSubtitleFrameBuffer;
import com.tencent.thumbplayer.tcmedia.api.TPTrackInfo;
import com.tencent.thumbplayer.tcmedia.api.TPVideoFrameBuffer;
import com.tencent.thumbplayer.tcmedia.api.TPVideoInfo;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset;
import com.tencent.thumbplayer.tcmedia.api.richmedia.ITPRichMediaSynchronizer;
import com.tencent.thumbplayer.tcmedia.core.player.TPDynamicStatisticParams;
import com.tencent.thumbplayer.tcmedia.core.player.TPGeneralPlayFlowParams;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class d implements com.tencent.thumbplayer.tcmedia.adapter.a, com.tencent.thumbplayer.tcmedia.adapter.a.c.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.tencent.thumbplayer.tcmedia.e.b f102359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.tencent.thumbplayer.tcmedia.e.a f102360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f102361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.tencent.thumbplayer.tcmedia.adapter.a.b f102362d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TPPlayerState f102363e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f102364f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f102365g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private g f102366h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private a f102367i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private c f102368j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private i f102369k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private com.tencent.thumbplayer.tcmedia.adapter.strategy.a f102370l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private b f102371m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f102372n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private com.tencent.thumbplayer.tcmedia.f.a f102373o;

    public class a implements com.tencent.thumbplayer.tcmedia.adapter.a.c.a, com.tencent.thumbplayer.tcmedia.adapter.a.c.b, com.tencent.thumbplayer.tcmedia.adapter.a.c.InterfaceC1013c, com.tencent.thumbplayer.tcmedia.adapter.a.c.d, com.tencent.thumbplayer.tcmedia.adapter.a.c.e, com.tencent.thumbplayer.tcmedia.adapter.a.c.f, com.tencent.thumbplayer.tcmedia.adapter.a.c.g, com.tencent.thumbplayer.tcmedia.adapter.a.c.h, com.tencent.thumbplayer.tcmedia.adapter.a.c.i, com.tencent.thumbplayer.tcmedia.adapter.a.c.j, com.tencent.thumbplayer.tcmedia.adapter.a.c.l, com.tencent.thumbplayer.tcmedia.adapter.a.c.m, com.tencent.thumbplayer.tcmedia.adapter.a.c.n, com.tencent.thumbplayer.tcmedia.adapter.a.c.o, com.tencent.thumbplayer.tcmedia.adapter.a.c.p {
        private a() {
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.o
        public TPPostProcessFrameBuffer a(TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
            return d.this.a(tPPostProcessFrameBuffer);
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.d
        public TPRemoteSdpInfo a(String str, int i10) {
            return d.this.a(str, i10);
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.i
        public void a() {
            d.this.w();
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

        @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.g
        public void a(TPDrmInfo tPDrmInfo) {
            d.this.a(tPDrmInfo);
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.e
        public void a(TPPlayerDetailInfo tPPlayerDetailInfo) {
            d.this.a(tPPlayerDetailInfo);
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.l
        public void a(TPSubtitleData tPSubtitleData) {
            d.this.a(tPSubtitleData);
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.m
        public void a(TPSubtitleFrameBuffer tPSubtitleFrameBuffer) {
            d.this.a(tPSubtitleFrameBuffer);
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
            d.this.y();
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.j
        public void c() {
            d.this.z();
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.d
        public void d() {
            d.this.A();
        }
    }

    public d(Context context, com.tencent.thumbplayer.tcmedia.e.b bVar) {
        com.tencent.thumbplayer.tcmedia.e.b bVar2 = new com.tencent.thumbplayer.tcmedia.e.b(bVar, "TPPlayerAdapter");
        this.f102359a = bVar2;
        this.f102360b = new com.tencent.thumbplayer.tcmedia.e.a(bVar2);
        this.f102361c = context;
        TPPlayerState tPPlayerState = new TPPlayerState();
        this.f102363e = tPPlayerState;
        tPPlayerState.setOnPlayerStateChangeListener(this);
        this.f102368j = new c();
        this.f102367i = new a();
        this.f102366h = new g(this.f102359a.a());
        this.f102369k = new i(this.f102363e);
        this.f102371m = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A() {
        com.tencent.thumbplayer.tcmedia.adapter.a.b bVar;
        if (this.f102369k.a(11) && (bVar = this.f102362d) != null) {
            long jN = bVar.n();
            b bVar2 = this.f102371m;
            if (bVar2 != null) {
                bVar2.g(jN);
            }
        }
    }

    private int B() {
        if (this.f102370l == null) {
            this.f102370l = a(this.f102368j);
        }
        return this.f102370l.a(this.f102371m);
    }

    private boolean C() {
        int i10 = this.f102372n;
        return i10 == 2 || i10 == 3;
    }

    private com.tencent.thumbplayer.tcmedia.adapter.a.b a(int i10, com.tencent.thumbplayer.tcmedia.e.b bVar) {
        com.tencent.thumbplayer.tcmedia.adapter.a.b bVarA;
        Context context;
        try {
            if (i10 == 1) {
                this.f102360b.c("to create androidPlayer");
                bVarA = com.tencent.thumbplayer.tcmedia.adapter.a.d.a(this.f102361c, this.f102368j.p(), bVar);
            } else {
                if (i10 == 2) {
                    this.f102360b.c("to create thumbPlayer");
                    context = this.f102361c;
                } else if (i10 == 3) {
                    this.f102360b.c("to create thumbPlayer software dec");
                    context = this.f102361c;
                } else {
                    this.f102360b.c("to create no Player");
                    bVarA = null;
                }
                bVarA = com.tencent.thumbplayer.tcmedia.adapter.a.d.a(context, bVar);
            }
        } catch (Exception e10) {
            this.f102360b.c("to create Player," + e10.toString());
        }
        if (bVarA == null) {
            this.f102360b.c("play is null!");
            return null;
        }
        this.f102372n = i10;
        b(bVarA);
        return bVarA;
    }

    private com.tencent.thumbplayer.tcmedia.adapter.strategy.a a(c cVar) {
        com.tencent.thumbplayer.tcmedia.adapter.strategy.a.a aVar;
        try {
            aVar = new com.tencent.thumbplayer.tcmedia.adapter.strategy.a.a(cVar);
        } catch (IllegalArgumentException unused) {
            aVar = new com.tencent.thumbplayer.tcmedia.adapter.strategy.a.a(null);
        }
        return com.tencent.thumbplayer.tcmedia.adapter.strategy.e.a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TPPostProcessFrameBuffer a(TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
        if (this.f102369k.b(7)) {
            return this.f102366h.a(tPPostProcessFrameBuffer);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TPRemoteSdpInfo a(String str, int i10) {
        return this.f102366h.a(str, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, int i11, long j10, long j11) {
        if (this.f102369k.b(4)) {
            com.tencent.thumbplayer.tcmedia.adapter.strategy.a aVar = this.f102370l;
            b bVar = this.f102371m;
            int iA = aVar.a(bVar, new com.tencent.thumbplayer.tcmedia.adapter.strategy.a.b(this.f102372n, i10, i11, bVar.d()));
            if (iA != 0) {
                try {
                    c(iA, 1);
                    return;
                } catch (IOException | IllegalStateException e10) {
                    this.f102360b.a(e10);
                }
            }
            this.f102363e.changeState(10);
            this.f102366h.a(i10, i11, j10, j11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, long j10, long j11, Object obj) {
        b bVar;
        if (this.f102364f) {
            this.f102360b.c("handleOnInfo, mIsReopening");
            return;
        }
        if (i10 == 152 && (bVar = this.f102371m) != null) {
            bVar.f(((int) j10) + 1);
        }
        this.f102366h.a(i10, j10, j11, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j10, long j11) {
        if (!this.f102369k.b(6)) {
            this.f102360b.c("handleOnVideoSizeChange, invalid state");
            return;
        }
        this.f102371m.b(j11);
        this.f102371m.a(j10);
        this.f102366h.a(j10, j11);
    }

    private void a(com.tencent.thumbplayer.tcmedia.adapter.a.b bVar) {
        TPProgramInfo tPProgramInfoL;
        TPProgramInfo tPProgramInfo;
        TPProgramInfo[] tPProgramInfoArrT = t();
        if (tPProgramInfoArrT == null || (tPProgramInfoL = this.f102368j.l()) == null) {
            return;
        }
        for (int i10 = 0; i10 < tPProgramInfoArrT.length; i10++) {
            if (!TextUtils.isEmpty(tPProgramInfoL.url) && (tPProgramInfo = tPProgramInfoArrT[i10]) != null && tPProgramInfoL.url.equals(tPProgramInfo.url)) {
                bVar.c(i10, -1L);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(TPAudioFrameBuffer tPAudioFrameBuffer) {
        if (this.f102369k.b(7)) {
            this.f102366h.a(tPAudioFrameBuffer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(TPDrmInfo tPDrmInfo) {
        this.f102366h.a(tPDrmInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(TPPlayerDetailInfo tPPlayerDetailInfo) {
        this.f102366h.a(tPPlayerDetailInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(TPSubtitleData tPSubtitleData) {
        if (this.f102369k.b(7)) {
            this.f102366h.a(tPSubtitleData);
        } else {
            this.f102360b.c("handleOnSubtitleData, invalid state");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(TPSubtitleFrameBuffer tPSubtitleFrameBuffer) {
        if (this.f102369k.b(7)) {
            this.f102366h.a(tPSubtitleFrameBuffer);
        } else {
            this.f102360b.c("handleOnSubtitleFrameOut, invalid state");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(TPVideoFrameBuffer tPVideoFrameBuffer) {
        if (this.f102369k.b(7)) {
            this.f102366h.a(tPVideoFrameBuffer);
        } else {
            this.f102360b.c("handleOnVideoFrameOut, invalid state");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TPPostProcessFrameBuffer b(TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
        if (this.f102369k.b(7)) {
            return this.f102366h.b(tPPostProcessFrameBuffer);
        }
        return null;
    }

    private void b(com.tencent.thumbplayer.tcmedia.adapter.a.b bVar) {
        String strA;
        bVar.a((com.tencent.thumbplayer.tcmedia.adapter.a.c.h) this.f102367i);
        bVar.a((com.tencent.thumbplayer.tcmedia.adapter.a.c.i) this.f102367i);
        bVar.a((com.tencent.thumbplayer.tcmedia.adapter.a.c.InterfaceC1013c) this.f102367i);
        bVar.a((com.tencent.thumbplayer.tcmedia.adapter.a.c.f) this.f102367i);
        bVar.a((com.tencent.thumbplayer.tcmedia.adapter.a.c.j) this.f102367i);
        bVar.a((com.tencent.thumbplayer.tcmedia.adapter.a.c.p) this.f102367i);
        bVar.a((com.tencent.thumbplayer.tcmedia.adapter.a.c.l) this.f102367i);
        bVar.a((com.tencent.thumbplayer.tcmedia.adapter.a.c.m) this.f102367i);
        bVar.a((com.tencent.thumbplayer.tcmedia.adapter.a.c.e) this.f102367i);
        bVar.a((com.tencent.thumbplayer.tcmedia.adapter.a.c.g) this.f102367i);
        bVar.a((com.tencent.thumbplayer.tcmedia.adapter.a.c.d) this.f102367i);
        if (C()) {
            bVar.a((com.tencent.thumbplayer.tcmedia.adapter.a.c.n) this.f102367i);
            bVar.a((com.tencent.thumbplayer.tcmedia.adapter.a.c.a) this.f102367i);
            bVar.a((com.tencent.thumbplayer.tcmedia.adapter.a.c.o) this.f102367i);
            bVar.a((com.tencent.thumbplayer.tcmedia.adapter.a.c.b) this.f102367i);
        }
        if (1 == this.f102368j.e().g()) {
            bVar.a(this.f102368j.e().c());
        } else if (4 == this.f102368j.e().g()) {
            bVar.a(this.f102368j.e().d());
        } else if (3 == this.f102368j.e().g()) {
            int i10 = this.f102372n;
            if (i10 == 2) {
                strA = this.f102368j.e().f().b();
            } else if (i10 == 1) {
                strA = this.f102368j.e().f().a();
            }
            bVar.a(strA, this.f102368j.e().b());
        } else if (2 == this.f102368j.e().g()) {
            bVar.a(this.f102368j.e().e());
        }
        Iterator<TPOptionalParam> it = this.f102368j.o().iterator();
        while (it.hasNext()) {
            bVar.a(it.next());
        }
        for (int i11 = 0; i11 < this.f102368j.b().size(); i11++) {
            TPTrackInfo tPTrackInfo = this.f102368j.b().get(i11);
            int i12 = tPTrackInfo.trackType;
            if (i12 == 3) {
                for (c.d dVar : this.f102368j.m()) {
                    if (!TextUtils.isEmpty(dVar.f102357c) && dVar.f102357c.equals(tPTrackInfo.name)) {
                        bVar.a(dVar.f102355a, dVar.f102358d, dVar.f102356b, dVar.f102357c);
                        break;
                    }
                }
            } else if (i12 == 2) {
                for (c.a aVar : this.f102368j.n()) {
                    if (!TextUtils.isEmpty(aVar.f102346b) && aVar.f102346b.equals(tPTrackInfo.name)) {
                        bVar.a(aVar.f102345a, aVar.f102348d, aVar.f102346b, aVar.f102347c);
                        break;
                    }
                }
            }
        }
        for (c.C1014c c1014c : this.f102368j.c()) {
            if (c1014c.f102354c.isSelected) {
                TPTrackInfo[] tPTrackInfoArrS = bVar.s();
                if (tPTrackInfoArrS == null) {
                    this.f102360b.e("playerTrackInfoList is null.");
                } else {
                    for (int i13 = 0; i13 < tPTrackInfoArrS.length; i13++) {
                        if (c1014c.f102354c.name.equals(tPTrackInfoArrS[i13].name)) {
                            bVar.a(i13, c1014c.f102353b);
                        }
                    }
                }
            }
        }
        if (this.f102368j.k() != null) {
            bVar.a(this.f102368j.k().f102349a, this.f102368j.k().f102350b, this.f102368j.k().f102351c);
        }
        bVar.a(this.f102368j.g());
        if (this.f102368j.h() != 0.0f) {
            bVar.a(this.f102368j.h());
        }
        if (this.f102368j.j() != 0.0f) {
            bVar.b(this.f102368j.j());
        }
        if (!"".equals(this.f102368j.i())) {
            bVar.a(this.f102368j.i());
        }
        if (this.f102368j.d() instanceof SurfaceHolder) {
            bVar.a((SurfaceHolder) this.f102368j.d());
        } else if (this.f102368j.d() instanceof Surface) {
            bVar.a((Surface) this.f102368j.d());
        }
        bVar.a(new TPOptionalParam().buildQueueInt(204, this.f102370l.a()));
    }

    private void c(int i10, int i11) {
        if (i11 == 1) {
            this.f102366h.a(1013, i10, 0L, (Object) null);
        } else {
            this.f102366h.a(200, 0L, 0L, (Object) null);
        }
        this.f102365g = i11;
        TPPlayerState tPPlayerState = this.f102363e;
        tPPlayerState.setLastState(tPPlayerState.state());
        com.tencent.thumbplayer.tcmedia.adapter.a.b bVar = this.f102362d;
        if (bVar != null) {
            long jO = bVar.o();
            this.f102360b.c("switchPlayer, current position:".concat(String.valueOf(jO)));
            this.f102371m.f(jO);
            this.f102371m.h(this.f102362d.p());
            this.f102362d.l();
            this.f102362d.m();
        }
        com.tencent.thumbplayer.tcmedia.adapter.a.b bVarA = a(i10, this.f102359a);
        this.f102362d = bVarA;
        if (bVarA == null) {
            throw new RuntimeException("error , create player failed");
        }
        this.f102364f = true;
        this.f102360b.c("switch player to type:" + this.f102372n);
        if (this.f102371m != null) {
            this.f102362d.a(new TPOptionalParam().buildLong(100, this.f102371m.i()));
        }
        this.f102363e.setInnerPlayStateState(3);
        this.f102362d.h();
    }

    private void d(int i10) {
        if (i10 != 5) {
            return;
        }
        try {
            this.f102362d.i();
            this.f102363e.changeState(5);
        } catch (IllegalStateException e10) {
            this.f102360b.a(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        this.f102366h.a(1000, this.f102372n, 0L, (Object) null);
        if (this.f102364f) {
            if (this.f102363e.innerPlayState() != 3) {
                this.f102360b.d("handleOnPrepared, invalid state, mIsRetrying.");
                return;
            }
        } else if (!this.f102369k.b(1)) {
            this.f102360b.c("handleOnPrepared, invalid state");
            return;
        }
        x();
        a(this.f102362d);
        if (!this.f102364f) {
            this.f102363e.setInnerPlayStateState(4);
            this.f102363e.changeState(4);
            this.f102366h.a();
            return;
        }
        this.f102364f = false;
        this.f102360b.c("handleOnPrepared, mIsRetrying, recoverState, state:" + this.f102363e.state());
        int iState = this.f102363e.state();
        this.f102363e.changeState(4);
        if (this.f102363e.lastState() == 3) {
            this.f102366h.a();
        }
        if (this.f102365g == 1) {
            this.f102366h.a(1014, 0L, 0L, (Object) null);
        } else {
            this.f102366h.a(201, 0L, 0L, (Object) null);
        }
        this.f102365g = 0;
        d(iState);
    }

    private void x() {
        if (C()) {
            b bVarA = b.a(c(0));
            this.f102371m = bVarA;
            bVarA.e((int) this.f102362d.b(204));
            this.f102371m.a((int) this.f102362d.b(203));
            this.f102371m.c((int) this.f102362d.b(102));
            this.f102371m.g((int) this.f102362d.b(201));
            this.f102371m.b((int) this.f102362d.b(210));
        }
        if (this.f102371m == null) {
            this.f102371m = new b();
        }
        this.f102371m.g(this.f102362d.n());
        TPOptionalParam tPOptionalParamB = this.f102368j.b(100);
        if (tPOptionalParamB != null) {
            this.f102371m.f(tPOptionalParamB.getParamLong().value);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        if (!this.f102369k.b(2)) {
            this.f102360b.c("handleOnComplete, invalid state");
        } else {
            this.f102363e.changeState(7);
            this.f102366h.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        if (this.f102369k.b(5)) {
            this.f102366h.c();
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a
    public int a() {
        b bVar = this.f102371m;
        if (bVar != null) {
            return bVar.m();
        }
        return 0;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(float f10) {
        if (!this.f102369k.a(3)) {
            throw new IllegalStateException("error , setAudioGainRatio , state invalid , current state :" + this.f102363e);
        }
        com.tencent.thumbplayer.tcmedia.adapter.a.b bVar = this.f102362d;
        if (bVar != null) {
            bVar.a(f10);
        } else {
            this.f102360b.c("setAudioGainRatio, mPlayerBase = null!");
        }
        this.f102368j.a(f10);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(int i10) {
        if (!this.f102369k.a(9)) {
            throw new IllegalStateException("error , seek to , state invalid , current state :" + this.f102363e);
        }
        if (this.f102362d == null) {
            this.f102360b.d("seekTo, mPlayerBase = null!");
            return;
        }
        if (this.f102363e.state() == 7) {
            this.f102363e.changeState(5);
        }
        this.f102362d.a(i10);
        com.tencent.thumbplayer.tcmedia.f.a aVar = this.f102373o;
        if (aVar != null) {
            try {
                aVar.a(i10);
            } catch (Exception unused) {
                this.f102360b.d("seekTo, rich media processor seek err.");
            }
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(int i10, @TPCommonEnum.TPSeekMode int i11) {
        if (!this.f102369k.a(9)) {
            throw new IllegalStateException("error , seek to , state invalid , current state :" + this.f102363e);
        }
        if (this.f102362d == null) {
            this.f102360b.d("seekTo, mPlayerBase = null!");
            return;
        }
        if (this.f102363e.state() == 7) {
            this.f102363e.changeState(5);
        }
        this.f102362d.a(i10, i11);
        com.tencent.thumbplayer.tcmedia.f.a aVar = this.f102373o;
        if (aVar != null) {
            try {
                aVar.a(i10);
            } catch (Exception unused) {
                this.f102360b.d("seekTo, rich media processor seek err.");
            }
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(int i10, long j10) {
        if (!this.f102369k.a(3)) {
            throw new IllegalStateException("error : selectTrack , state invalid");
        }
        TPTrackInfo[] tPTrackInfoArrS = s();
        if (tPTrackInfoArrS == null) {
            this.f102360b.e("fatal err, tpTrackInfos is null");
            return;
        }
        if (i10 < 0 || i10 > tPTrackInfoArrS.length - 1) {
            throw new IllegalArgumentException("error : track not found");
        }
        com.tencent.thumbplayer.tcmedia.adapter.a.b bVar = this.f102362d;
        if (bVar != null) {
            bVar.a(i10, j10);
        }
        this.f102368j.a(i10, j10, tPTrackInfoArrS[i10]);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(AssetFileDescriptor assetFileDescriptor) {
        if (!this.f102369k.a(2)) {
            throw new IllegalStateException("error : setDataSource , state invalid");
        }
        if (assetFileDescriptor == null) {
            throw new IllegalArgumentException("error : setDataSource , afd invalid");
        }
        this.f102368j.a(assetFileDescriptor);
        this.f102363e.changeState(2);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(ParcelFileDescriptor parcelFileDescriptor) {
        if (!this.f102369k.a(2)) {
            throw new IllegalStateException("error : setDataSource , state invalid");
        }
        if (parcelFileDescriptor == null) {
            throw new IllegalArgumentException("error : setDataSource , pfd invalid");
        }
        this.f102368j.a(parcelFileDescriptor);
        this.f102363e.changeState(2);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(Surface surface) {
        com.tencent.thumbplayer.tcmedia.adapter.a.b bVar = this.f102362d;
        if (bVar != null) {
            bVar.a(surface);
        }
        this.f102368j.a(surface);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(SurfaceHolder surfaceHolder) {
        com.tencent.thumbplayer.tcmedia.adapter.a.b bVar = this.f102362d;
        if (bVar != null) {
            bVar.a(surfaceHolder);
        }
        this.f102368j.a(surfaceHolder);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.a aVar) {
        this.f102366h.a(aVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.b bVar) {
        this.f102366h.a(bVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.InterfaceC1013c interfaceC1013c) {
        this.f102366h.a(interfaceC1013c);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.d dVar) {
        this.f102366h.a(dVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.e eVar) {
        this.f102366h.a(eVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.f fVar) {
        this.f102366h.a(fVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.g gVar) {
        this.f102366h.a(gVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.h hVar) {
        this.f102366h.a(hVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.i iVar) {
        this.f102366h.a(iVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.j jVar) {
        this.f102366h.a(jVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.k kVar) {
        this.f102366h.a(kVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.l lVar) {
        this.f102366h.a(lVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.m mVar) {
        this.f102366h.a(mVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.n nVar) {
        this.f102366h.a(nVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.o oVar) {
        this.f102366h.a(oVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.p pVar) {
        this.f102366h.a(pVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.e eVar) {
        a(eVar, (Map<String, String>) null);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.e eVar, int i10, long j10) {
        String strA;
        if (!this.f102369k.a(17)) {
            throw new IllegalStateException("error , switch definition , state invalid , current state :" + this.f102363e);
        }
        this.f102368j.a(eVar, (Map<String, String>) null);
        if (this.f102362d == null) {
            this.f102360b.d("switchDefinition, mPlayerBase = null!");
            return;
        }
        int i11 = this.f102372n;
        if (i11 == 2) {
            strA = eVar.b();
        } else {
            strA = i11 == 1 ? eVar.a() : "";
        }
        this.f102362d.a(strA, i10, j10);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.e eVar, Map<String, String> map) {
        if (!this.f102369k.a(2)) {
            throw new IllegalStateException("error : setDataSource , state invalid");
        }
        this.f102368j.a(eVar, map);
        this.f102363e.changeState(2);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.e eVar, Map<String, String> map, int i10, long j10) {
        String strA;
        if (!this.f102369k.a(17)) {
            throw new IllegalStateException("error , switch definition , state invalid , current state :" + this.f102363e);
        }
        this.f102368j.a(eVar, map);
        if (this.f102362d == null) {
            this.f102360b.d("switchDefinition, mPlayerBase = null!");
            return;
        }
        int i11 = this.f102372n;
        if (i11 == 2) {
            strA = eVar.b();
        } else {
            strA = i11 == 1 ? eVar.a() : "";
        }
        this.f102362d.a(strA, map, i10, j10);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(TPCaptureParams tPCaptureParams, TPCaptureCallBack tPCaptureCallBack) {
        com.tencent.thumbplayer.tcmedia.adapter.a.b bVar = this.f102362d;
        if (bVar != null) {
            bVar.a(tPCaptureParams, tPCaptureCallBack);
        } else {
            throw new IllegalStateException("error , no player for capture :" + this.f102363e);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(TPOptionalParam tPOptionalParam) {
        if (!this.f102369k.a(3)) {
            throw new IllegalStateException("setPlayerOptionalParam , state invalid");
        }
        com.tencent.thumbplayer.tcmedia.adapter.a.b bVar = this.f102362d;
        if (bVar != null) {
            bVar.a(tPOptionalParam);
        }
        this.f102368j.a(tPOptionalParam);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a
    public void a(TPVideoInfo tPVideoInfo) {
        if (!this.f102369k.a(2)) {
            this.f102360b.e("setVideoInfo state invalid");
        }
        if (tPVideoInfo != null) {
            this.f102371m.b(tPVideoInfo.getHeight());
            this.f102371m.a(tPVideoInfo.getWidth());
            this.f102371m.c(tPVideoInfo.getDefinition());
            this.f102371m.g(tPVideoInfo.getVideoCodecId());
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(ITPMediaAsset iTPMediaAsset) {
        if (!this.f102369k.a(2)) {
            throw new IllegalStateException("error : setDataSource , state invalid");
        }
        if (iTPMediaAsset == null) {
            throw new IllegalArgumentException("error : setDataSource , mediaAsset invalid");
        }
        this.f102368j.a(iTPMediaAsset);
        this.f102363e.changeState(2);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(ITPMediaAsset iTPMediaAsset, @TPCommonEnum.TPSwitchDefMode int i10, long j10) {
        if (!this.f102369k.a(17)) {
            throw new IllegalStateException("error , switch definition , state invalid , current state :" + this.f102363e);
        }
        this.f102368j.a(iTPMediaAsset);
        com.tencent.thumbplayer.tcmedia.adapter.a.b bVar = this.f102362d;
        if (bVar != null) {
            bVar.a(iTPMediaAsset, i10, j10);
        } else {
            this.f102360b.d("switchDefinition, mPlayerBase = null!");
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a
    public void a(ITPRichMediaSynchronizer iTPRichMediaSynchronizer) {
        if (iTPRichMediaSynchronizer == null) {
            com.tencent.thumbplayer.tcmedia.f.a aVar = this.f102373o;
            if (aVar != null) {
                aVar.a((com.tencent.thumbplayer.tcmedia.f.a.InterfaceC1019a) null);
            }
            this.f102373o = null;
            return;
        }
        if (iTPRichMediaSynchronizer instanceof com.tencent.thumbplayer.tcmedia.f.a) {
            com.tencent.thumbplayer.tcmedia.f.a aVar2 = (com.tencent.thumbplayer.tcmedia.f.a) iTPRichMediaSynchronizer;
            this.f102373o = aVar2;
            aVar2.a(new com.tencent.thumbplayer.tcmedia.f.a.InterfaceC1019a() { // from class: com.tencent.thumbplayer.tcmedia.adapter.d.1
                @Override // com.tencent.thumbplayer.tcmedia.f.a.InterfaceC1019a
                public long a(ITPRichMediaSynchronizer iTPRichMediaSynchronizer2) {
                    return d.this.o();
                }
            });
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(com.tencent.thumbplayer.tcmedia.e.b bVar) {
        this.f102359a.a(bVar, "TPPlayerAdapter");
        this.f102360b.a(this.f102359a);
        this.f102366h.a(this.f102359a.a());
        com.tencent.thumbplayer.tcmedia.adapter.a.b bVar2 = this.f102362d;
        if (bVar2 != null) {
            bVar2.a(this.f102359a);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(String str) {
        if (!this.f102369k.a(3)) {
            throw new IllegalStateException("error , setAudioNormalizeVolumeParams , state invalid , current state :" + this.f102363e);
        }
        com.tencent.thumbplayer.tcmedia.adapter.a.b bVar = this.f102362d;
        if (bVar != null) {
            bVar.a(str);
        } else {
            this.f102360b.c("setAudioGainRatio, mPlayerBase = null!");
        }
        this.f102368j.a(str);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(String str, @TPCommonEnum.TPSwitchDefMode int i10, long j10) {
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(String str, Map<String, String> map) {
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(String str, Map<String, String> map, int i10, long j10) {
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(String str, Map<String, String> map, String str2, String str3) {
        if (!this.f102369k.a(3)) {
            throw new IllegalStateException("error : addSubtitleSource, state invalid");
        }
        com.tencent.thumbplayer.tcmedia.adapter.a.b bVar = this.f102362d;
        if (bVar != null) {
            bVar.a(str, map, str2, str3);
        }
        this.f102368j.a(str, map, str2, str3);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(String str, Map<String, String> map, String str2, List<TPOptionalParam> list) {
        if (!this.f102369k.a(3)) {
            throw new IllegalStateException("error : addAudioTrackSource, state invalid");
        }
        com.tencent.thumbplayer.tcmedia.adapter.a.b bVar = this.f102362d;
        if (bVar != null) {
            bVar.a(str, map, str2, list);
        }
        this.f102368j.a(str, map, str2, list);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(boolean z10) {
        if (!this.f102369k.a(3)) {
            throw new IllegalStateException("error , setOutputMute , state invalid , current state :" + this.f102363e);
        }
        com.tencent.thumbplayer.tcmedia.adapter.a.b bVar = this.f102362d;
        if (bVar != null) {
            bVar.a(z10);
        } else {
            this.f102360b.c("setOutputMute, mPlayerBase = null!");
        }
        this.f102368j.a(z10);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(boolean z10, long j10, long j11) {
        if (!this.f102369k.a(3)) {
            throw new IllegalStateException("error , setLoopback , state invalid , current state :" + this.f102363e);
        }
        com.tencent.thumbplayer.tcmedia.adapter.a.b bVar = this.f102362d;
        if (bVar != null) {
            bVar.a(z10, j10, j11);
        } else {
            this.f102360b.c("setLoopback, mPlayerBase = null!");
        }
        this.f102368j.a(z10, j10, j11);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a
    public int b() {
        return this.f102363e.state();
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public long b(int i10) {
        com.tencent.thumbplayer.tcmedia.adapter.a.b bVar = this.f102362d;
        if (bVar != null) {
            return bVar.b(i10);
        }
        this.f102360b.d("getPropertyLong, mPlayerBase = null, return !");
        return -1L;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void b(float f10) {
        if (!this.f102369k.a(3)) {
            throw new IllegalStateException("error , setPlaySpeedRatio , state invalid , current state :" + this.f102363e);
        }
        com.tencent.thumbplayer.tcmedia.adapter.a.b bVar = this.f102362d;
        if (bVar != null) {
            bVar.b(f10);
        } else {
            this.f102360b.c("setPlaySpeedRatio, mPlayerBase = null!");
        }
        this.f102368j.b(f10);
        com.tencent.thumbplayer.tcmedia.f.a aVar = this.f102373o;
        if (aVar != null) {
            try {
                aVar.a(f10);
            } catch (Exception unused) {
                this.f102360b.d("setPlaySpeedRatio, rich media processor setPlaySpeedRatio err.");
            }
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.k
    public void b(int i10, int i11) {
        this.f102366h.b(i10, i11);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void b(int i10, long j10) {
        if (!this.f102369k.a(3)) {
            throw new IllegalStateException("error : deselectTrack , state invalid");
        }
        TPTrackInfo[] tPTrackInfoArrS = s();
        if (tPTrackInfoArrS == null) {
            this.f102360b.e("fatal err, tpTrackInfos is null");
            return;
        }
        if (i10 < 0 || i10 > tPTrackInfoArrS.length - 1) {
            throw new IllegalArgumentException("error : track not found");
        }
        com.tencent.thumbplayer.tcmedia.adapter.a.b bVar = this.f102362d;
        if (bVar != null) {
            bVar.b(i10, j10);
        }
        this.f102368j.b(i10, j10, tPTrackInfoArrS[i10]);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a
    public void b(TPVideoInfo tPVideoInfo) {
        if (!this.f102369k.a(3)) {
            this.f102360b.e("updateVideoInfo state invalid");
        }
        if (tPVideoInfo != null) {
            this.f102371m.b(tPVideoInfo.getHeight());
            this.f102371m.a(tPVideoInfo.getWidth());
            this.f102371m.c(tPVideoInfo.getDefinition());
            this.f102371m.g(tPVideoInfo.getVideoCodecId());
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void b(boolean z10) {
        if (!this.f102369k.a(3)) {
            throw new IllegalStateException("error , setLoopback , state invalid , current state :" + this.f102363e);
        }
        com.tencent.thumbplayer.tcmedia.adapter.a.b bVar = this.f102362d;
        if (bVar != null) {
            bVar.b(z10);
        } else {
            this.f102360b.c("setLoopback, mPlayerBase = null!");
        }
        this.f102368j.b(z10);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public TPDynamicStatisticParams c(boolean z10) {
        com.tencent.thumbplayer.tcmedia.adapter.a.b bVar = this.f102362d;
        if (bVar == null) {
            return null;
        }
        return bVar.c(z10);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public String c(int i10) {
        com.tencent.thumbplayer.tcmedia.adapter.a.b bVar = this.f102362d;
        if (bVar != null) {
            return bVar.c(i10);
        }
        this.f102360b.d("getPropertyString, mPlayerBase = null, return !");
        return "";
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void c(int i10, long j10) {
        if (!this.f102369k.a(18)) {
            throw new IllegalStateException("error : selectProgram , state invalid");
        }
        TPProgramInfo[] tPProgramInfoArrT = t();
        if (tPProgramInfoArrT == null) {
            tPProgramInfoArrT = new TPProgramInfo[0];
        }
        if (i10 < 0 || i10 > tPProgramInfoArrT.length - 1) {
            throw new IllegalArgumentException("error : program index not found");
        }
        com.tencent.thumbplayer.tcmedia.adapter.a.b bVar = this.f102362d;
        if (bVar != null) {
            bVar.c(i10, j10);
        }
        this.f102368j.a(tPProgramInfoArrT[i10]);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a
    public boolean c() {
        TPPlayerState tPPlayerState = this.f102363e;
        return tPPlayerState != null && tPPlayerState.state() == 5;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a
    public int d() {
        return this.f102372n;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a
    public b e() {
        return this.f102371m;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a
    public void f() {
        c(this.f102372n, 2);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void g() throws IOException {
        if (!this.f102369k.a(1)) {
            throw new IllegalStateException("error , prepare , state invalid , current state :" + this.f102363e);
        }
        if (!this.f102368j.f()) {
            throw new IOException("error , prepare , data source invalid");
        }
        com.tencent.thumbplayer.tcmedia.adapter.a.b bVarA = a(B(), this.f102359a);
        this.f102362d = bVarA;
        if (bVarA == null) {
            throw new RuntimeException("error , create player failed");
        }
        this.f102363e.setInnerPlayStateState(3);
        this.f102363e.changeState(3);
        this.f102362d.g();
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void h() {
        if (!this.f102369k.a(1)) {
            throw new IllegalStateException("error , prepare , state invalid , current state :" + this.f102363e);
        }
        if (!this.f102368j.f()) {
            throw new IllegalStateException("error , prepare , state invalid , data source invalid");
        }
        com.tencent.thumbplayer.tcmedia.adapter.a.b bVarA = a(B(), this.f102359a);
        this.f102362d = bVarA;
        if (bVarA == null) {
            throw new RuntimeException("error , create player failed");
        }
        this.f102363e.setInnerPlayStateState(3);
        this.f102363e.changeState(3);
        this.f102362d.h();
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void i() {
        if (!this.f102369k.a(5)) {
            throw new IllegalStateException("error , start , state invalid , current state :" + this.f102363e);
        }
        com.tencent.thumbplayer.tcmedia.adapter.a.b bVar = this.f102362d;
        if (bVar == null) {
            throw new IllegalStateException("error , start , player is null");
        }
        try {
            bVar.i();
            this.f102363e.changeState(5);
        } catch (IllegalStateException unused) {
            throw new IllegalStateException("error , start ,state invalid");
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void j() {
        if (!this.f102369k.a(6)) {
            throw new IllegalStateException("error , pause , state invalid , current state :" + this.f102363e);
        }
        com.tencent.thumbplayer.tcmedia.adapter.a.b bVar = this.f102362d;
        if (bVar == null) {
            throw new IllegalStateException("error , pause , player is null");
        }
        if (this.f102364f) {
            this.f102363e.changeState(6);
            return;
        }
        try {
            bVar.j();
            this.f102363e.changeState(6);
        } catch (IllegalStateException unused) {
            throw new IllegalStateException("error , pause ,state invalid");
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void k() {
        if (!this.f102369k.a(7)) {
            throw new IllegalStateException("error , stop , state invalid , current state :" + this.f102363e);
        }
        if (this.f102362d == null) {
            throw new IllegalStateException("error , stop , player is null");
        }
        try {
            try {
                this.f102363e.changeState(8);
                this.f102362d.k();
                this.f102363e.changeState(9);
            } catch (IllegalStateException unused) {
                throw new IllegalStateException("error , stop ,state invalid");
            }
        } catch (Throwable th2) {
            this.f102363e.changeState(9);
            throw th2;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void l() {
        this.f102360b.c("reset, current state :" + this.f102363e);
        com.tencent.thumbplayer.tcmedia.adapter.a.b bVar = this.f102362d;
        if (bVar != null) {
            bVar.l();
            this.f102362d.m();
            this.f102362d = null;
        }
        this.f102368j.a();
        this.f102371m.o();
        this.f102370l = null;
        this.f102364f = false;
        this.f102363e.changeState(1);
        this.f102363e.setLastState(1);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void m() {
        this.f102360b.c("release, current state :" + this.f102363e);
        com.tencent.thumbplayer.tcmedia.adapter.a.b bVar = this.f102362d;
        if (bVar != null) {
            bVar.m();
            this.f102362d = null;
        }
        this.f102368j.a();
        this.f102366h.e();
        this.f102370l = null;
        this.f102364f = false;
        this.f102363e.changeState(11);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public long n() {
        b bVar = this.f102371m;
        if (bVar != null && bVar.k() > 0) {
            return this.f102371m.k();
        }
        if (!this.f102369k.a(11)) {
            return 0L;
        }
        com.tencent.thumbplayer.tcmedia.adapter.a.b bVar2 = this.f102362d;
        if (bVar2 == null) {
            this.f102360b.d("getDurationMs, mPlayerBase = null, return 0!");
            return 0L;
        }
        long jN = bVar2.n();
        b bVar3 = this.f102371m;
        if (bVar3 != null) {
            bVar3.g(jN);
        }
        return jN;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public long o() {
        if (!this.f102369k.a(12)) {
            b bVar = this.f102371m;
            if (bVar != null) {
                return bVar.i();
            }
            return 0L;
        }
        com.tencent.thumbplayer.tcmedia.adapter.a.b bVar2 = this.f102362d;
        if (bVar2 == null) {
            this.f102360b.d("getCurrentPositionMs, mPlayerBase = null, return 0!");
            return 0L;
        }
        long jO = bVar2.o();
        b bVar3 = this.f102371m;
        if (bVar3 != null) {
            bVar3.f(jO);
        }
        return jO;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public long p() {
        if (!this.f102369k.a(12)) {
            return 0L;
        }
        com.tencent.thumbplayer.tcmedia.adapter.a.b bVar = this.f102362d;
        if (bVar == null) {
            this.f102360b.d("getBufferedDurationMs, mPlayerBase = null, return 0!");
            return 0L;
        }
        long jP = bVar.p();
        b bVar2 = this.f102371m;
        if (bVar2 != null) {
            bVar2.h(jP);
        }
        return jP;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public int q() {
        com.tencent.thumbplayer.tcmedia.e.a aVar;
        String str;
        b bVar = this.f102371m;
        if (bVar != null && bVar.a() > 0) {
            return (int) this.f102371m.a();
        }
        if (this.f102369k.a(13)) {
            com.tencent.thumbplayer.tcmedia.adapter.a.b bVar2 = this.f102362d;
            if (bVar2 != null) {
                int iQ = bVar2.q();
                b bVar3 = this.f102371m;
                if (bVar3 != null) {
                    bVar3.a(iQ);
                }
                return iQ;
            }
            aVar = this.f102360b;
            str = "getVideoWidth, mPlayerBase = null, return 0!";
        } else {
            aVar = this.f102360b;
            str = "getVideoWidth, state error!";
        }
        aVar.d(str);
        return 0;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public int r() {
        com.tencent.thumbplayer.tcmedia.e.a aVar;
        String str;
        b bVar = this.f102371m;
        if (bVar != null && bVar.b() > 0) {
            return (int) this.f102371m.b();
        }
        if (this.f102369k.a(13)) {
            com.tencent.thumbplayer.tcmedia.adapter.a.b bVar2 = this.f102362d;
            if (bVar2 != null) {
                int iR = bVar2.r();
                b bVar3 = this.f102371m;
                if (bVar3 != null) {
                    bVar3.b(iR);
                }
                return iR;
            }
            aVar = this.f102360b;
            str = "getVideoHeight, mPlayerBase = null, return 0!";
        } else {
            aVar = this.f102360b;
            str = "getVideoHeight, state error!";
        }
        aVar.d(str);
        return 0;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public TPTrackInfo[] s() {
        com.tencent.thumbplayer.tcmedia.adapter.a.b bVar = this.f102362d;
        return bVar != null ? bVar.s() : (TPTrackInfo[]) this.f102368j.b().toArray(new TPTrackInfo[0]);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public TPProgramInfo[] t() {
        com.tencent.thumbplayer.tcmedia.adapter.a.b bVar = this.f102362d;
        return (bVar == null || bVar.t() == null) ? new TPProgramInfo[0] : this.f102362d.t();
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public long[] u() {
        if (this.f102369k.a(19)) {
            com.tencent.thumbplayer.tcmedia.adapter.a.b bVar = this.f102362d;
            if (bVar != null) {
                long[] jArrU = bVar.u();
                b bVar2 = this.f102371m;
                if (bVar2 != null) {
                    bVar2.a(jArrU);
                }
                return jArrU;
            }
            this.f102360b.d("getDemuxerOffsetInFile, mPlayerBase = null, return 0!");
        } else {
            b bVar3 = this.f102371m;
            if (bVar3 != null) {
                return bVar3.j();
            }
        }
        return new long[]{-1, -1};
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public TPGeneralPlayFlowParams v() {
        com.tencent.thumbplayer.tcmedia.adapter.a.b bVar = this.f102362d;
        if (bVar == null) {
            return null;
        }
        return bVar.v();
    }
}
