package com.max.mediaselector.lib.adapter.holder;

import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.n0;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.b3;
import com.google.android.exoplayer2.c3;
import com.google.android.exoplayer2.e3;
import com.google.android.exoplayer2.e4;
import com.google.android.exoplayer2.f3;
import com.google.android.exoplayer2.i2;
import com.google.android.exoplayer2.m2;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.p;
import com.google.android.exoplayer2.source.p1;
import com.google.android.exoplayer2.t;
import com.google.android.exoplayer2.trackselection.u;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.exoplayer2.video.a0;
import com.google.android.exoplayer2.z3;
import com.max.mediaselector.R;
import com.max.mediaselector.lib.config.PictureSelectionConfig;
import com.max.mediaselector.lib.entity.LocalMedia;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.File;
import java.util.List;

/* JADX INFO: compiled from: PreviewVideoHolder.java */
/* JADX INFO: loaded from: classes2.dex */
public class i extends com.max.mediaselector.lib.adapter.holder.b {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ImageView f74910k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public PlayerView f74911l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ProgressBar f74912m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final c3.h f74913n;

    /* JADX INFO: compiled from: PreviewVideoHolder.java */
    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalMedia f74914b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f74915c;

        a(LocalMedia localMedia, String str) {
            this.f74914b = localMedia;
            this.f74915c = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c3 player;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.l.Dh, new Class[]{View.class}, Void.TYPE).isSupported || (player = i.this.f74911l.getPlayer()) == null) {
                return;
            }
            i.this.f74912m.setVisibility(0);
            i.this.f74910k.setVisibility(8);
            i.this.f74838g.b(this.f74914b.y());
            player.F1(i2.e(com.max.mediaselector.lib.config.f.c(this.f74915c) ? Uri.parse(this.f74915c) : Uri.fromFile(new File(this.f74915c))));
            player.prepare();
            player.play();
        }
    }

    /* JADX INFO: compiled from: PreviewVideoHolder.java */
    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.max.mediaselector.lib.adapter.holder.b.d dVar;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.l.Eh, new Class[]{View.class}, Void.TYPE).isSupported || (dVar = i.this.f74838g) == null) {
                return;
            }
            dVar.onBackPressed();
        }
    }

    /* JADX INFO: compiled from: PreviewVideoHolder.java */
    public class c implements c3.h {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.google.android.exoplayer2.c3.h
        public /* synthetic */ void B(int i10) {
            f3.b(this, i10);
        }

        @Override // com.google.android.exoplayer2.c3.h
        public /* synthetic */ void F(int i10, boolean z10) {
            f3.f(this, i10, z10);
        }

        @Override // com.google.android.exoplayer2.c3.f
        public /* synthetic */ void H() {
            e3.v(this);
        }

        @Override // com.google.android.exoplayer2.c3.h
        public /* synthetic */ void K(com.google.android.exoplayer2.audio.f fVar) {
            f3.a(this, fVar);
        }

        @Override // com.google.android.exoplayer2.c3.h
        public /* synthetic */ void V(p pVar) {
            f3.e(this, pVar);
        }

        @Override // com.google.android.exoplayer2.c3.h
        public /* synthetic */ void X() {
            f3.u(this);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.audio.t
        public /* synthetic */ void a(boolean z10) {
            f3.z(this, z10);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public /* synthetic */ void b(b3 b3Var) {
            f3.n(this, b3Var);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public /* synthetic */ void c(c3.l lVar, c3.l lVar2, int i10) {
            f3.t(this, lVar, lVar2, i10);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public /* synthetic */ void d(z3 z3Var, int i10) {
            f3.B(this, z3Var, i10);
        }

        @Override // com.google.android.exoplayer2.c3.f
        public /* synthetic */ void d0(p1 p1Var, com.google.android.exoplayer2.trackselection.p pVar) {
            e3.z(this, p1Var, pVar);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public /* synthetic */ void e(m2 m2Var) {
            f3.k(this, m2Var);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public /* synthetic */ void f(boolean z10) {
            f3.y(this, z10);
        }

        @Override // com.google.android.exoplayer2.c3.f
        public /* synthetic */ void f0(u uVar) {
            e3.y(this, uVar);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.video.y
        public /* synthetic */ void g(a0 a0Var) {
            f3.D(this, a0Var);
        }

        @Override // com.google.android.exoplayer2.c3.h
        public /* synthetic */ void g0(int i10, int i11) {
            f3.A(this, i10, i11);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public /* synthetic */ void h(PlaybackException playbackException) {
            f3.r(this, playbackException);
        }

        @Override // com.google.android.exoplayer2.c3.f
        public /* synthetic */ void h0(int i10) {
            e3.q(this, i10);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public void i(@n0 PlaybackException playbackException) {
            if (PatchProxy.proxy(new Object[]{playbackException}, this, changeQuickRedirect, false, bb.c.l.Fh, new Class[]{PlaybackException.class}, Void.TYPE).isSupported) {
                return;
            }
            i.k(i.this);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public /* synthetic */ void j(long j10) {
            f3.x(this, j10);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public /* synthetic */ void k(boolean z10, int i10) {
            f3.m(this, z10, i10);
        }

        @Override // com.google.android.exoplayer2.c3.h
        public /* synthetic */ void k0(float f10) {
            f3.E(this, f10);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public /* synthetic */ void l(boolean z10) {
            f3.i(this, z10);
        }

        @Override // com.google.android.exoplayer2.c3.f
        public /* synthetic */ void l0(boolean z10, int i10) {
            e3.o(this, z10, i10);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public /* synthetic */ void m(int i10) {
            f3.p(this, i10);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public /* synthetic */ void n(e4 e4Var) {
            f3.C(this, e4Var);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public /* synthetic */ void o(c3.c cVar) {
            f3.c(this, cVar);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public /* synthetic */ void onRepeatModeChanged(int i10) {
            f3.v(this, i10);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public void p(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.l.Gh, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if (i10 == 3) {
                i.l(i.this);
            } else if (i10 == 4) {
                i.k(i.this);
            }
        }

        @Override // com.google.android.exoplayer2.c3.f
        public /* synthetic */ void p0(long j10) {
            e3.f(this, j10);
        }

        @Override // com.google.android.exoplayer2.c3.h
        public /* synthetic */ void q(Metadata metadata) {
            f3.l(this, metadata);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public /* synthetic */ void r(long j10) {
            f3.w(this, j10);
        }

        @Override // com.google.android.exoplayer2.c3.h
        public /* synthetic */ void t(List list) {
            f3.d(this, list);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public /* synthetic */ void u(boolean z10) {
            f3.h(this, z10);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public /* synthetic */ void v(c3 c3Var, c3.g gVar) {
            f3.g(this, c3Var, gVar);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public /* synthetic */ void w(i2 i2Var, int i10) {
            f3.j(this, i2Var, i10);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public /* synthetic */ void x(m2 m2Var) {
            f3.s(this, m2Var);
        }

        @Override // com.google.android.exoplayer2.c3.f
        public /* synthetic */ void y(boolean z10) {
            e3.e(this, z10);
        }
    }

    public i(@n0 View view) {
        super(view);
        this.f74913n = new c();
        this.f74910k = (ImageView) view.findViewById(R.id.iv_play_video);
        this.f74911l = (PlayerView) view.findViewById(R.id.playerView);
        this.f74912m = (ProgressBar) view.findViewById(R.id.progress);
        this.f74911l.setUseController(false);
        this.f74910k.setVisibility(PictureSelectionConfig.c().L ? 8 : 0);
    }

    static /* synthetic */ void k(i iVar) {
        if (PatchProxy.proxy(new Object[]{iVar}, null, changeQuickRedirect, true, bb.c.l.Bh, new Class[]{i.class}, Void.TYPE).isSupported) {
            return;
        }
        iVar.m();
    }

    static /* synthetic */ void l(i iVar) {
        if (PatchProxy.proxy(new Object[]{iVar}, null, changeQuickRedirect, true, bb.c.l.Ch, new Class[]{i.class}, Void.TYPE).isSupported) {
            return;
        }
        iVar.n();
    }

    private void m() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34526wh, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f74910k.setVisibility(0);
        this.f74912m.setVisibility(8);
        this.f74837f.setVisibility(0);
        this.f74911l.setVisibility(8);
        com.max.mediaselector.lib.adapter.holder.b.d dVar = this.f74838g;
        if (dVar != null) {
            dVar.b(null);
        }
    }

    private void n() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34548xh, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f74912m.getVisibility() == 0) {
            this.f74912m.setVisibility(8);
        }
        if (this.f74910k.getVisibility() == 0) {
            this.f74910k.setVisibility(8);
        }
        if (this.f74837f.getVisibility() == 0) {
            this.f74837f.setVisibility(8);
        }
        if (this.f74911l.getVisibility() == 8) {
            this.f74911l.setVisibility(0);
        }
    }

    @Override // com.max.mediaselector.lib.adapter.holder.b
    public void a(LocalMedia localMedia, int i10) {
        if (PatchProxy.proxy(new Object[]{localMedia, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.l.f34482uh, new Class[]{LocalMedia.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.a(localMedia, i10);
        String strB = localMedia.b();
        j(localMedia);
        this.f74910k.setOnClickListener(new a(localMedia, strB));
        this.itemView.setOnClickListener(new b());
    }

    @Override // com.max.mediaselector.lib.adapter.holder.b
    public void g() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34570yh, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        t tVarX = new t.c(this.itemView.getContext()).x();
        this.f74911l.setPlayer(tVarX);
        tVarX.S1(this.f74913n);
    }

    @Override // com.max.mediaselector.lib.adapter.holder.b
    public void h() {
        c3 player;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34592zh, new Class[0], Void.TYPE).isSupported || (player = this.f74911l.getPlayer()) == null) {
            return;
        }
        player.U(this.f74913n);
        player.release();
        this.f74911l.setPlayer(null);
        m();
    }

    @Override // com.max.mediaselector.lib.adapter.holder.b
    public void j(LocalMedia localMedia) {
        float width;
        int height;
        if (PatchProxy.proxy(new Object[]{localMedia}, this, changeQuickRedirect, false, bb.c.l.f34504vh, new Class[]{LocalMedia.class}, Void.TYPE).isSupported || this.f74836e.L || this.f74833b >= this.f74834c) {
            return;
        }
        if (localMedia.getWidth() > localMedia.getHeight()) {
            width = localMedia.getHeight();
            height = localMedia.getWidth();
        } else {
            width = localMedia.getWidth();
            height = localMedia.getHeight();
        }
        int i10 = (int) (this.f74833b / (width / height));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f74911l.getLayoutParams();
        layoutParams.width = this.f74833b;
        int i11 = this.f74834c;
        if (i10 > i11) {
            i11 = this.f74835d;
        }
        layoutParams.height = i11;
        layoutParams.gravity = 17;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f74837f.getLayoutParams();
        layoutParams2.width = this.f74833b;
        int i12 = this.f74834c;
        if (i10 > i12) {
            i12 = this.f74835d;
        }
        layoutParams2.height = i12;
        layoutParams2.gravity = 17;
    }

    public void o() {
        c3 player;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Ah, new Class[0], Void.TYPE).isSupported || (player = this.f74911l.getPlayer()) == null) {
            return;
        }
        player.U(this.f74913n);
        player.release();
    }
}
