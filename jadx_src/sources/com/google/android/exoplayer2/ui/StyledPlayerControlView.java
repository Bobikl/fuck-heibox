package com.google.android.exoplayer2.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.b3;
import com.google.android.exoplayer2.c2;
import com.google.android.exoplayer2.c3;
import com.google.android.exoplayer2.e3;
import com.google.android.exoplayer2.e4;
import com.google.android.exoplayer2.f3;
import com.google.android.exoplayer2.i2;
import com.google.android.exoplayer2.m2;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.n1;
import com.google.android.exoplayer2.source.p1;
import com.google.android.exoplayer2.trackselection.r;
import com.google.android.exoplayer2.y1;
import com.google.android.exoplayer2.z3;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes7.dex */
public class StyledPlayerControlView extends FrameLayout {
    public static final int W3 = 5000;
    public static final int X3 = 0;
    public static final int Y3 = 200;
    public static final int Z3 = 100;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    private static final int f50561a4 = 1000;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    private static final int f50562b4 = 0;

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    private static final int f50563c4 = 1;
    private final String A;
    private final Drawable B;
    private final Drawable C;
    private final float D;
    private final float E;
    private final String F;
    private final String G;
    private Resources G2;
    private h G3;
    private final Drawable H;
    private final Drawable I;
    private final String J;
    private e J3;
    private final String K;
    private PopupWindow K3;
    private final Drawable L;
    private boolean L3;
    private final Drawable M;
    private int M3;
    private final String N;
    private j N3;
    private final String O;
    private b O3;

    @androidx.annotation.p0
    private c3 P;
    private v0 P3;

    @androidx.annotation.p0
    private f Q;

    @androidx.annotation.p0
    private ImageView Q3;

    @androidx.annotation.p0
    private d R;

    @androidx.annotation.p0
    private ImageView R3;
    private boolean S;

    @androidx.annotation.p0
    private ImageView S3;
    private boolean T;

    @androidx.annotation.p0
    private View T3;
    private boolean U;

    @androidx.annotation.p0
    private View U3;
    private boolean V;

    @androidx.annotation.p0
    private View V3;
    private boolean W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private int f50564a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f50565b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private int f50566b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CopyOnWriteArrayList<m> f50567c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private int f50568c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.p0
    private final View f50569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.p0
    private final View f50570e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    private final View f50571f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.p0
    private final View f50572g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.p0
    private final View f50573h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.p0
    private final TextView f50574i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.p0
    private final TextView f50575j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.p0
    private final ImageView f50576k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.p0
    private final ImageView f50577l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.p0
    private final View f50578m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.p0
    private final TextView f50579n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.p0
    private final TextView f50580o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.p0
    private final u0 f50581p;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private long[] f50582p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private boolean[] f50583p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private RecyclerView f50584p3;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final StringBuilder f50585q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Formatter f50586r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final z3.b f50587s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final z3.d f50588t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Runnable f50589u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Drawable f50590v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Drawable f50591w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Drawable f50592x;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private boolean[] f50593x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private long f50594x2;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final String f50595y;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private long[] f50596y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private p0 f50597y2;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final String f50598z;

    public final class b extends l {
        private b() {
            super();
        }

        private boolean v(r rVar) {
            int i10 = -1;
            for (int i11 = 0; i11 < this.f50622b.size(); i11++) {
                k kVar = this.f50622b.get(i11);
                if (kVar.f50617b != i10) {
                    if (rVar.e(kVar.f50619d) != null) {
                        return true;
                    }
                    i10 = kVar.f50617b;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void w(View view) {
            if (StyledPlayerControlView.this.P == null) {
                return;
            }
            com.google.android.exoplayer2.trackselection.u uVarL0 = StyledPlayerControlView.this.P.l0();
            ((c3) com.google.android.exoplayer2.util.u0.k(StyledPlayerControlView.this.P)).I0(uVarL0.d().d0(uVarL0.f50162x.d().d(1).b()).y());
            StyledPlayerControlView.this.G3.o(1, StyledPlayerControlView.this.getResources().getString(R.string.exo_track_selection_auto));
            StyledPlayerControlView.this.K3.dismiss();
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.l
        public void o(List<k> list) {
            boolean z10;
            int i10 = 0;
            while (true) {
                if (i10 >= list.size()) {
                    z10 = false;
                    break;
                } else {
                    if (((c3) com.google.android.exoplayer2.util.a.g(StyledPlayerControlView.this.P)).l0().f50162x.e(list.get(i10).f50619d) != null) {
                        z10 = true;
                        break;
                    }
                    i10++;
                }
            }
            if (list.isEmpty()) {
                StyledPlayerControlView.this.G3.o(1, StyledPlayerControlView.this.getResources().getString(R.string.exo_track_selection_none));
            } else if (z10) {
                for (int i11 = 0; i11 < list.size(); i11++) {
                    k kVar = list.get(i11);
                    if (kVar.c()) {
                        StyledPlayerControlView.this.G3.o(1, kVar.f50621f);
                        break;
                    }
                }
            } else {
                StyledPlayerControlView.this.G3.o(1, StyledPlayerControlView.this.getResources().getString(R.string.exo_track_selection_auto));
            }
            this.f50622b = list;
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.l
        public void r(i iVar) {
            iVar.f50613b.setText(R.string.exo_track_selection_auto);
            iVar.f50614c.setVisibility(v(((c3) com.google.android.exoplayer2.util.a.g(StyledPlayerControlView.this.P)).l0().f50162x) ? 4 : 0);
            iVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f50824b.w(view);
                }
            });
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.l
        public void t(String str) {
            StyledPlayerControlView.this.G3.o(1, str);
        }
    }

    public final class c implements c3.h, u0.a, View.OnClickListener, PopupWindow.OnDismissListener {
        private c() {
        }

        @Override // com.google.android.exoplayer2.ui.u0.a
        public void A(u0 u0Var, long j10) {
            StyledPlayerControlView.this.W = true;
            if (StyledPlayerControlView.this.f50580o != null) {
                StyledPlayerControlView.this.f50580o.setText(com.google.android.exoplayer2.util.u0.r0(StyledPlayerControlView.this.f50585q, StyledPlayerControlView.this.f50586r, j10));
            }
            StyledPlayerControlView.this.f50597y2.W();
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
        public /* synthetic */ void V(com.google.android.exoplayer2.p pVar) {
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
        public /* synthetic */ void f0(com.google.android.exoplayer2.trackselection.u uVar) {
            e3.y(this, uVar);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.video.y
        public /* synthetic */ void g(com.google.android.exoplayer2.video.a0 a0Var) {
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
        public /* synthetic */ void i(PlaybackException playbackException) {
            f3.q(this, playbackException);
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

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c3 c3Var = StyledPlayerControlView.this.P;
            if (c3Var == null) {
                return;
            }
            StyledPlayerControlView.this.f50597y2.X();
            if (StyledPlayerControlView.this.f50570e == view) {
                c3Var.y1();
                return;
            }
            if (StyledPlayerControlView.this.f50569d == view) {
                c3Var.m1();
                return;
            }
            if (StyledPlayerControlView.this.f50572g == view) {
                if (c3Var.getPlaybackState() != 4) {
                    c3Var.P0();
                    return;
                }
                return;
            }
            if (StyledPlayerControlView.this.f50573h == view) {
                c3Var.i2();
                return;
            }
            if (StyledPlayerControlView.this.f50571f == view) {
                StyledPlayerControlView.this.Y(c3Var);
                return;
            }
            if (StyledPlayerControlView.this.f50576k == view) {
                c3Var.setRepeatMode(com.google.android.exoplayer2.util.g0.a(c3Var.getRepeatMode(), StyledPlayerControlView.this.f50568c0));
                return;
            }
            if (StyledPlayerControlView.this.f50577l == view) {
                c3Var.q0(!c3Var.h2());
                return;
            }
            if (StyledPlayerControlView.this.T3 == view) {
                StyledPlayerControlView.this.f50597y2.W();
                StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
                styledPlayerControlView.Z(styledPlayerControlView.G3);
                return;
            }
            if (StyledPlayerControlView.this.U3 == view) {
                StyledPlayerControlView.this.f50597y2.W();
                StyledPlayerControlView styledPlayerControlView2 = StyledPlayerControlView.this;
                styledPlayerControlView2.Z(styledPlayerControlView2.J3);
            } else if (StyledPlayerControlView.this.V3 == view) {
                StyledPlayerControlView.this.f50597y2.W();
                StyledPlayerControlView styledPlayerControlView3 = StyledPlayerControlView.this;
                styledPlayerControlView3.Z(styledPlayerControlView3.O3);
            } else if (StyledPlayerControlView.this.Q3 == view) {
                StyledPlayerControlView.this.f50597y2.W();
                StyledPlayerControlView styledPlayerControlView4 = StyledPlayerControlView.this;
                styledPlayerControlView4.Z(styledPlayerControlView4.N3);
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            if (StyledPlayerControlView.this.L3) {
                StyledPlayerControlView.this.f50597y2.X();
            }
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public /* synthetic */ void onRepeatModeChanged(int i10) {
            f3.v(this, i10);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public /* synthetic */ void p(int i10) {
            f3.o(this, i10);
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

        @Override // com.google.android.exoplayer2.ui.u0.a
        public void s(u0 u0Var, long j10, boolean z10) {
            StyledPlayerControlView.this.W = false;
            if (!z10 && StyledPlayerControlView.this.P != null) {
                StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
                styledPlayerControlView.s0(styledPlayerControlView.P, j10);
            }
            StyledPlayerControlView.this.f50597y2.X();
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
        public void v(c3 c3Var, c3.g gVar) {
            if (gVar.b(4, 5)) {
                StyledPlayerControlView.this.B0();
            }
            if (gVar.b(4, 5, 7)) {
                StyledPlayerControlView.this.D0();
            }
            if (gVar.a(8)) {
                StyledPlayerControlView.this.E0();
            }
            if (gVar.a(9)) {
                StyledPlayerControlView.this.H0();
            }
            if (gVar.b(8, 9, 11, 0, 16, 17, 13)) {
                StyledPlayerControlView.this.A0();
            }
            if (gVar.b(11, 0)) {
                StyledPlayerControlView.this.I0();
            }
            if (gVar.a(12)) {
                StyledPlayerControlView.this.C0();
            }
            if (gVar.a(2)) {
                StyledPlayerControlView.this.J0();
            }
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

        @Override // com.google.android.exoplayer2.ui.u0.a
        public void z(u0 u0Var, long j10) {
            if (StyledPlayerControlView.this.f50580o != null) {
                StyledPlayerControlView.this.f50580o.setText(com.google.android.exoplayer2.util.u0.r0(StyledPlayerControlView.this.f50585q, StyledPlayerControlView.this.f50586r, j10));
            }
        }
    }

    public interface d {
        void a(boolean z10);
    }

    public final class e extends RecyclerView.Adapter<i> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String[] f50601b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f50602c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f50603d;

        public e(String[] strArr, int[] iArr) {
            this.f50601b = strArr;
            this.f50602c = iArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void o(int i10, View view) {
            if (i10 != this.f50603d) {
                StyledPlayerControlView.this.setPlaybackSpeed(this.f50602c[i10] / 100.0f);
            }
            StyledPlayerControlView.this.K3.dismiss();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f50601b.length;
        }

        public String n() {
            return this.f50601b[this.f50603d];
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(i iVar, final int i10) {
            String[] strArr = this.f50601b;
            if (i10 < strArr.length) {
                iVar.f50613b.setText(strArr[i10]);
            }
            iVar.f50614c.setVisibility(i10 == this.f50603d ? 0 : 4);
            iVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f50829b.o(i10, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public i onCreateViewHolder(ViewGroup viewGroup, int i10) {
            return new i(LayoutInflater.from(StyledPlayerControlView.this.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
        }

        public void r(float f10) {
            int iRound = Math.round(f10 * 100.0f);
            int i10 = 0;
            int i11 = Integer.MAX_VALUE;
            int i12 = 0;
            while (true) {
                int[] iArr = this.f50602c;
                if (i10 >= iArr.length) {
                    this.f50603d = i12;
                    return;
                }
                int iAbs = Math.abs(iRound - iArr[i10]);
                if (iAbs < i11) {
                    i12 = i10;
                    i11 = iAbs;
                }
                i10++;
            }
        }
    }

    public interface f {
        void a(long j10, long j11);
    }

    public final class g extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final TextView f50605b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final TextView f50606c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ImageView f50607d;

        public g(View view) {
            super(view);
            if (com.google.android.exoplayer2.util.u0.f51536a < 26) {
                view.setFocusable(true);
            }
            this.f50605b = (TextView) view.findViewById(R.id.exo_main_text);
            this.f50606c = (TextView) view.findViewById(R.id.exo_sub_text);
            this.f50607d = (ImageView) view.findViewById(R.id.exo_icon);
            view.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.z
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f50844b.h(view2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void h(View view) {
            StyledPlayerControlView.this.o0(getAdapterPosition());
        }
    }

    public class h extends RecyclerView.Adapter<g> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String[] f50609b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String[] f50610c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Drawable[] f50611d;

        public h(String[] strArr, Drawable[] drawableArr) {
            this.f50609b = strArr;
            this.f50610c = new String[strArr.length];
            this.f50611d = drawableArr;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f50609b.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(g gVar, int i10) {
            gVar.f50605b.setText(this.f50609b[i10]);
            if (this.f50610c[i10] == null) {
                gVar.f50606c.setVisibility(8);
            } else {
                gVar.f50606c.setText(this.f50610c[i10]);
            }
            if (this.f50611d[i10] == null) {
                gVar.f50607d.setVisibility(8);
            } else {
                gVar.f50607d.setImageDrawable(this.f50611d[i10]);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public g onCreateViewHolder(ViewGroup viewGroup, int i10) {
            return StyledPlayerControlView.this.new g(LayoutInflater.from(StyledPlayerControlView.this.getContext()).inflate(R.layout.exo_styled_settings_list_item, viewGroup, false));
        }

        public void o(int i10, String str) {
            this.f50610c[i10] = str;
        }
    }

    public static class i extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f50613b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final View f50614c;

        public i(View view) {
            super(view);
            if (com.google.android.exoplayer2.util.u0.f51536a < 26) {
                view.setFocusable(true);
            }
            this.f50613b = (TextView) view.findViewById(R.id.exo_text);
            this.f50614c = view.findViewById(R.id.exo_check);
        }
    }

    public final class j extends l {
        private j() {
            super();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void v(View view) {
            if (StyledPlayerControlView.this.P != null) {
                com.google.android.exoplayer2.trackselection.u uVarL0 = StyledPlayerControlView.this.P.l0();
                StyledPlayerControlView.this.P.I0(uVarL0.d().E(new ImmutableSet.a().c(uVarL0.f50163y).g(3).e()).y());
                StyledPlayerControlView.this.K3.dismiss();
            }
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.l
        public void o(List<k> list) {
            boolean z10 = false;
            for (int i10 = 0; i10 < list.size(); i10++) {
                if (list.get(i10).c()) {
                    z10 = true;
                    break;
                }
            }
            if (StyledPlayerControlView.this.Q3 != null) {
                ImageView imageView = StyledPlayerControlView.this.Q3;
                StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
                imageView.setImageDrawable(z10 ? styledPlayerControlView.H : styledPlayerControlView.I);
                StyledPlayerControlView.this.Q3.setContentDescription(z10 ? StyledPlayerControlView.this.J : StyledPlayerControlView.this.K);
            }
            this.f50622b = list;
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.l, androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(i iVar, int i10) {
            super.onBindViewHolder(iVar, i10);
            if (i10 > 0) {
                iVar.f50614c.setVisibility(this.f50622b.get(i10 + (-1)).c() ? 0 : 4);
            }
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.l
        public void r(i iVar) {
            boolean z10;
            iVar.f50613b.setText(R.string.exo_track_selection_none);
            int i10 = 0;
            while (true) {
                if (i10 >= this.f50622b.size()) {
                    z10 = true;
                    break;
                } else {
                    if (this.f50622b.get(i10).c()) {
                        z10 = false;
                        break;
                    }
                    i10++;
                }
            }
            iVar.f50614c.setVisibility(z10 ? 0 : 4);
            iVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.a0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f50703b.v(view);
                }
            });
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.l
        public void t(String str) {
        }
    }

    public static final class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private e4 f50616a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f50617b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e4.a f50618c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final n1 f50619d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f50620e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f50621f;

        public k(e4 e4Var, int i10, int i11, String str) {
            this.f50616a = e4Var;
            this.f50617b = i10;
            e4.a aVar = e4Var.c().get(i10);
            this.f50618c = aVar;
            this.f50619d = aVar.d();
            this.f50620e = i11;
            this.f50621f = str;
        }

        public boolean c() {
            return this.f50618c.i(this.f50620e);
        }
    }

    public abstract class l extends RecyclerView.Adapter<i> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected List<k> f50622b = new ArrayList();

        protected l() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void p(k kVar, View view) {
            if (StyledPlayerControlView.this.P == null) {
                return;
            }
            com.google.android.exoplayer2.trackselection.u uVarL0 = StyledPlayerControlView.this.P.l0();
            ((c3) com.google.android.exoplayer2.util.a.g(StyledPlayerControlView.this.P)).I0(uVarL0.d().d0(StyledPlayerControlView.a0(uVarL0.f50162x, kVar.f50616a, kVar.f50617b, new r.c(kVar.f50619d, ImmutableList.D(Integer.valueOf(kVar.f50620e))))).y());
            t(kVar.f50621f);
            StyledPlayerControlView.this.K3.dismiss();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            if (this.f50622b.isEmpty()) {
                return 0;
            }
            return this.f50622b.size() + 1;
        }

        protected void n() {
            this.f50622b = Collections.emptyList();
        }

        public abstract void o(List<k> list);

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: q */
        public void onBindViewHolder(i iVar, int i10) {
            if (StyledPlayerControlView.this.P == null) {
                return;
            }
            if (i10 == 0) {
                r(iVar);
                return;
            }
            final k kVar = this.f50622b.get(i10 - 1);
            boolean z10 = ((c3) com.google.android.exoplayer2.util.a.g(StyledPlayerControlView.this.P)).l0().f50162x.e(kVar.f50619d) != null && kVar.c();
            iVar.f50613b.setText(kVar.f50621f);
            iVar.f50614c.setVisibility(z10 ? 0 : 4);
            iVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.b0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f50704b.p(kVar, view);
                }
            });
        }

        protected abstract void r(i iVar);

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public i onCreateViewHolder(ViewGroup viewGroup, int i10) {
            return new i(LayoutInflater.from(StyledPlayerControlView.this.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
        }

        protected abstract void t(String str);
    }

    public interface m {
        void s(int i10);
    }

    static {
        y1.a("goog.exo.ui");
    }

    public StyledPlayerControlView(Context context) {
        this(context, null);
    }

    public StyledPlayerControlView(Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StyledPlayerControlView(Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v66, types: [android.view.LayoutInflater] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v4, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v7, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [android.view.ViewGroup, com.google.android.exoplayer2.ui.StyledPlayerControlView$a] */
    /* JADX WARN: Type inference failed for: r9v4 */
    public StyledPlayerControlView(Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10, @androidx.annotation.p0 AttributeSet attributeSet2) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        ?? r10;
        boolean z18;
        super(context, attributeSet, i10);
        int resourceId = R.layout.exo_styled_player_control_view;
        this.f50564a0 = 5000;
        this.f50568c0 = 0;
        this.f50566b0 = 200;
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, R.styleable.f50559l, i10, 0);
            try {
                resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.StyledPlayerControlView_controller_layout_id, resourceId);
                this.f50564a0 = typedArrayObtainStyledAttributes.getInt(R.styleable.StyledPlayerControlView_show_timeout, this.f50564a0);
                this.f50568c0 = c0(typedArrayObtainStyledAttributes, this.f50568c0);
                boolean z19 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.StyledPlayerControlView_show_rewind_button, true);
                boolean z20 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.StyledPlayerControlView_show_fastforward_button, true);
                boolean z21 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.StyledPlayerControlView_show_previous_button, true);
                boolean z22 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.StyledPlayerControlView_show_next_button, true);
                boolean z23 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.StyledPlayerControlView_show_shuffle_button, false);
                boolean z24 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.StyledPlayerControlView_show_subtitle_button, false);
                boolean z25 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.StyledPlayerControlView_show_vr_button, false);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(R.styleable.StyledPlayerControlView_time_bar_min_update_interval, this.f50566b0));
                boolean z26 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.StyledPlayerControlView_animation_enabled, true);
                typedArrayObtainStyledAttributes.recycle();
                z11 = z23;
                z12 = z24;
                z14 = z19;
                z15 = z20;
                z16 = z21;
                z13 = z26;
                z17 = z22;
                z10 = z25;
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            z10 = false;
            z11 = false;
            z12 = false;
            z13 = true;
            z14 = true;
            z15 = true;
            z16 = true;
            z17 = true;
        }
        LayoutInflater.from(context).inflate(resourceId, this);
        setDescendantFocusability(262144);
        c cVar = new c();
        this.f50565b = cVar;
        this.f50567c = new CopyOnWriteArrayList<>();
        this.f50587s = new z3.b();
        this.f50588t = new z3.d();
        StringBuilder sb2 = new StringBuilder();
        this.f50585q = sb2;
        this.f50586r = new Formatter(sb2, Locale.getDefault());
        this.f50582p1 = new long[0];
        this.f50593x1 = new boolean[0];
        this.f50596y1 = new long[0];
        this.f50583p2 = new boolean[0];
        this.f50589u = new Runnable() { // from class: com.google.android.exoplayer2.ui.u
            @Override // java.lang.Runnable
            public final void run() {
                this.f50819b.D0();
            }
        };
        this.f50579n = (TextView) findViewById(R.id.exo_duration);
        this.f50580o = (TextView) findViewById(R.id.exo_position);
        ImageView imageView = (ImageView) findViewById(R.id.exo_subtitle);
        this.Q3 = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(cVar);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_fullscreen);
        this.R3 = imageView2;
        g0(imageView2, new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f50820b.m0(view);
            }
        });
        ImageView imageView3 = (ImageView) findViewById(R.id.exo_minimal_fullscreen);
        this.S3 = imageView3;
        g0(imageView3, new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f50820b.m0(view);
            }
        });
        View viewFindViewById = findViewById(R.id.exo_settings);
        this.T3 = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(cVar);
        }
        View viewFindViewById2 = findViewById(R.id.exo_playback_speed);
        this.U3 = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(cVar);
        }
        View viewFindViewById3 = findViewById(R.id.exo_audio_track);
        this.V3 = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(cVar);
        }
        int i11 = R.id.exo_progress;
        u0 u0Var = (u0) findViewById(i11);
        View viewFindViewById4 = findViewById(R.id.exo_progress_placeholder);
        if (u0Var != null) {
            this.f50581p = u0Var;
            r10 = 0;
        } else if (viewFindViewById4 != null) {
            r10 = 0;
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, null, 0, attributeSet2, R.style.ExoStyledControls_TimeBar);
            defaultTimeBar.setId(i11);
            defaultTimeBar.setLayoutParams(viewFindViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById4.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById4);
            viewGroup.removeView(viewFindViewById4);
            viewGroup.addView(defaultTimeBar, iIndexOfChild);
            this.f50581p = defaultTimeBar;
        } else {
            r10 = 0;
            this.f50581p = null;
        }
        u0 u0Var2 = this.f50581p;
        if (u0Var2 != null) {
            u0Var2.b(cVar);
        }
        View viewFindViewById5 = findViewById(R.id.exo_play_pause);
        this.f50571f = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(cVar);
        }
        View viewFindViewById6 = findViewById(R.id.exo_prev);
        this.f50569d = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(cVar);
        }
        View viewFindViewById7 = findViewById(R.id.exo_next);
        this.f50570e = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(cVar);
        }
        Typeface typefaceJ = androidx.core.content.res.i.j(context, R.font.roboto_medium_numbers);
        ?? FindViewById = findViewById(R.id.exo_rew);
        ?? r11 = FindViewById == 0 ? (TextView) findViewById(R.id.exo_rew_with_amount) : r10;
        this.f50575j = r11;
        if (r11 != 0) {
            r11.setTypeface(typefaceJ);
        }
        FindViewById = FindViewById == 0 ? r11 : FindViewById;
        this.f50573h = FindViewById;
        if (FindViewById != 0) {
            FindViewById.setOnClickListener(cVar);
        }
        ?? FindViewById2 = findViewById(R.id.exo_ffwd);
        ?? r12 = FindViewById2 == 0 ? (TextView) findViewById(R.id.exo_ffwd_with_amount) : r10;
        this.f50574i = r12;
        if (r12 != 0) {
            r12.setTypeface(typefaceJ);
        }
        FindViewById2 = FindViewById2 == 0 ? r12 : FindViewById2;
        this.f50572g = FindViewById2;
        if (FindViewById2 != 0) {
            FindViewById2.setOnClickListener(cVar);
        }
        ImageView imageView4 = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.f50576k = imageView4;
        if (imageView4 != null) {
            imageView4.setOnClickListener(cVar);
        }
        ImageView imageView5 = (ImageView) findViewById(R.id.exo_shuffle);
        this.f50577l = imageView5;
        if (imageView5 != null) {
            imageView5.setOnClickListener(cVar);
        }
        Resources resources = context.getResources();
        this.G2 = resources;
        this.D = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.E = this.G2.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        View viewFindViewById8 = findViewById(R.id.exo_vr);
        this.f50578m = viewFindViewById8;
        if (viewFindViewById8 != null) {
            w0(false, viewFindViewById8);
        }
        p0 p0Var = new p0(this);
        this.f50597y2 = p0Var;
        p0Var.Y(z13);
        this.G3 = new h(new String[]{this.G2.getString(R.string.exo_controls_playback_speed), this.G2.getString(R.string.exo_track_selection_title_audio)}, new Drawable[]{this.G2.getDrawable(R.drawable.exo_styled_controls_speed), this.G2.getDrawable(R.drawable.exo_styled_controls_audiotrack)});
        this.M3 = this.G2.getDimensionPixelSize(R.dimen.exo_settings_offset);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.exo_styled_settings_list, r10);
        this.f50584p3 = recyclerView;
        recyclerView.setAdapter(this.G3);
        this.f50584p3.setLayoutManager(new LinearLayoutManager(getContext()));
        PopupWindow popupWindow = new PopupWindow((View) this.f50584p3, -2, -2, true);
        this.K3 = popupWindow;
        if (com.google.android.exoplayer2.util.u0.f51536a < 23) {
            z18 = false;
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        } else {
            z18 = false;
        }
        this.K3.setOnDismissListener(cVar);
        this.L3 = true;
        this.P3 = new com.google.android.exoplayer2.ui.i(getResources());
        this.H = this.G2.getDrawable(R.drawable.exo_styled_controls_subtitle_on);
        this.I = this.G2.getDrawable(R.drawable.exo_styled_controls_subtitle_off);
        this.J = this.G2.getString(R.string.exo_controls_cc_enabled_description);
        this.K = this.G2.getString(R.string.exo_controls_cc_disabled_description);
        this.N3 = new j();
        this.O3 = new b();
        this.J3 = new e(this.G2.getStringArray(R.array.exo_playback_speeds), this.G2.getIntArray(R.array.exo_speed_multiplied_by_100));
        this.L = this.G2.getDrawable(R.drawable.exo_styled_controls_fullscreen_exit);
        this.M = this.G2.getDrawable(R.drawable.exo_styled_controls_fullscreen_enter);
        this.f50590v = this.G2.getDrawable(R.drawable.exo_styled_controls_repeat_off);
        this.f50591w = this.G2.getDrawable(R.drawable.exo_styled_controls_repeat_one);
        this.f50592x = this.G2.getDrawable(R.drawable.exo_styled_controls_repeat_all);
        this.B = this.G2.getDrawable(R.drawable.exo_styled_controls_shuffle_on);
        this.C = this.G2.getDrawable(R.drawable.exo_styled_controls_shuffle_off);
        this.N = this.G2.getString(R.string.exo_controls_fullscreen_exit_description);
        this.O = this.G2.getString(R.string.exo_controls_fullscreen_enter_description);
        this.f50595y = this.G2.getString(R.string.exo_controls_repeat_off_description);
        this.f50598z = this.G2.getString(R.string.exo_controls_repeat_one_description);
        this.A = this.G2.getString(R.string.exo_controls_repeat_all_description);
        this.F = this.G2.getString(R.string.exo_controls_shuffle_on_description);
        this.G = this.G2.getString(R.string.exo_controls_shuffle_off_description);
        this.f50597y2.Z((ViewGroup) findViewById(R.id.exo_bottom_bar), true);
        this.f50597y2.Z(this.f50572g, z15);
        this.f50597y2.Z(this.f50573h, z14);
        this.f50597y2.Z(this.f50569d, z16);
        this.f50597y2.Z(this.f50570e, z17);
        this.f50597y2.Z(this.f50577l, z11);
        this.f50597y2.Z(this.Q3, z12);
        this.f50597y2.Z(this.f50578m, z10);
        this.f50597y2.Z(this.f50576k, this.f50568c0 != 0 ? true : z18);
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.google.android.exoplayer2.ui.w
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                this.f50821b.n0(view, i12, i13, i14, i15, i16, i17, i18, i19);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0() {
        boolean zG0;
        boolean zG1;
        boolean z10;
        boolean zG2;
        if (k0() && this.T) {
            c3 c3Var = this.P;
            boolean z11 = false;
            if (c3Var != null) {
                boolean zG3 = c3Var.g0(5);
                zG1 = c3Var.g0(7);
                boolean zG4 = c3Var.g0(11);
                zG2 = c3Var.g0(12);
                zG0 = c3Var.g0(9);
                z10 = zG3;
                z11 = zG4;
            } else {
                zG0 = false;
                zG1 = false;
                z10 = false;
                zG2 = false;
            }
            if (z11) {
                F0();
            }
            if (zG2) {
                x0();
            }
            w0(zG1, this.f50569d);
            w0(z11, this.f50573h);
            w0(zG2, this.f50572g);
            w0(zG0, this.f50570e);
            u0 u0Var = this.f50581p;
            if (u0Var != null) {
                u0Var.setEnabled(z10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B0() {
        if (k0() && this.T && this.f50571f != null) {
            if (t0()) {
                ((ImageView) this.f50571f).setImageDrawable(this.G2.getDrawable(R.drawable.exo_styled_controls_pause));
                this.f50571f.setContentDescription(this.G2.getString(R.string.exo_controls_pause_description));
            } else {
                ((ImageView) this.f50571f).setImageDrawable(this.G2.getDrawable(R.drawable.exo_styled_controls_play));
                this.f50571f.setContentDescription(this.G2.getString(R.string.exo_controls_play_description));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C0() {
        c3 c3Var = this.P;
        if (c3Var == null) {
            return;
        }
        this.J3.r(c3Var.g().f44371b);
        this.G3.o(0, this.J3.n());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D0() {
        long jO0;
        if (k0() && this.T) {
            c3 c3Var = this.P;
            long jQ1 = 0;
            if (c3Var != null) {
                jQ1 = this.f50594x2 + c3Var.Q1();
                jO0 = this.f50594x2 + c3Var.O0();
            } else {
                jO0 = 0;
            }
            TextView textView = this.f50580o;
            if (textView != null && !this.W) {
                textView.setText(com.google.android.exoplayer2.util.u0.r0(this.f50585q, this.f50586r, jQ1));
            }
            u0 u0Var = this.f50581p;
            if (u0Var != null) {
                u0Var.setPosition(jQ1);
                this.f50581p.setBufferedPosition(jO0);
            }
            f fVar = this.Q;
            if (fVar != null) {
                fVar.a(jQ1, jO0);
            }
            removeCallbacks(this.f50589u);
            int playbackState = c3Var == null ? 1 : c3Var.getPlaybackState();
            if (c3Var == null || !c3Var.isPlaying()) {
                if (playbackState == 4 || playbackState == 1) {
                    return;
                }
                postDelayed(this.f50589u, 1000L);
                return;
            }
            u0 u0Var2 = this.f50581p;
            long jMin = Math.min(u0Var2 != null ? u0Var2.getPreferredUpdateDelay() : 1000L, 1000 - (jQ1 % 1000));
            float f10 = c3Var.g().f44371b;
            postDelayed(this.f50589u, com.google.android.exoplayer2.util.u0.t(f10 > 0.0f ? (long) (jMin / f10) : 1000L, this.f50566b0, 1000L));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E0() {
        ImageView imageView;
        if (k0() && this.T && (imageView = this.f50576k) != null) {
            if (this.f50568c0 == 0) {
                w0(false, imageView);
                return;
            }
            c3 c3Var = this.P;
            if (c3Var == null) {
                w0(false, imageView);
                this.f50576k.setImageDrawable(this.f50590v);
                this.f50576k.setContentDescription(this.f50595y);
                return;
            }
            w0(true, imageView);
            int repeatMode = c3Var.getRepeatMode();
            if (repeatMode == 0) {
                this.f50576k.setImageDrawable(this.f50590v);
                this.f50576k.setContentDescription(this.f50595y);
            } else if (repeatMode == 1) {
                this.f50576k.setImageDrawable(this.f50591w);
                this.f50576k.setContentDescription(this.f50598z);
            } else {
                if (repeatMode != 2) {
                    return;
                }
                this.f50576k.setImageDrawable(this.f50592x);
                this.f50576k.setContentDescription(this.A);
            }
        }
    }

    private void F0() {
        c3 c3Var = this.P;
        int iK2 = (int) ((c3Var != null ? c3Var.k2() : 5000L) / 1000);
        TextView textView = this.f50575j;
        if (textView != null) {
            textView.setText(String.valueOf(iK2));
        }
        View view = this.f50573h;
        if (view != null) {
            view.setContentDescription(this.G2.getQuantityString(R.plurals.exo_controls_rewind_by_amount_description, iK2, Integer.valueOf(iK2)));
        }
    }

    private void G0() {
        this.f50584p3.measure(0, 0);
        this.K3.setWidth(Math.min(this.f50584p3.getMeasuredWidth(), getWidth() - (this.M3 * 2)));
        this.K3.setHeight(Math.min(getHeight() - (this.M3 * 2), this.f50584p3.getMeasuredHeight()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H0() {
        ImageView imageView;
        if (k0() && this.T && (imageView = this.f50577l) != null) {
            c3 c3Var = this.P;
            if (!this.f50597y2.A(imageView)) {
                w0(false, this.f50577l);
                return;
            }
            if (c3Var == null) {
                w0(false, this.f50577l);
                this.f50577l.setImageDrawable(this.C);
                this.f50577l.setContentDescription(this.G);
            } else {
                w0(true, this.f50577l);
                this.f50577l.setImageDrawable(c3Var.h2() ? this.B : this.C);
                this.f50577l.setContentDescription(c3Var.h2() ? this.F : this.G);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:40:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d4 A[SYNTHETIC] */
    public void I0() {
        int i10;
        z3.d dVar;
        long jS;
        long[] jArr;
        int length;
        c3 c3Var = this.P;
        if (c3Var == null) {
            return;
        }
        boolean z10 = true;
        this.V = this.U && U(c3Var.w1(), this.f50588t);
        long j10 = 0;
        this.f50594x2 = 0L;
        z3 z3VarW1 = c3Var.w1();
        if (z3VarW1.x()) {
            i10 = 0;
        } else {
            int iZ1 = c3Var.Z1();
            boolean z11 = this.V;
            int i11 = z11 ? 0 : iZ1;
            int iW = z11 ? z3VarW1.w() - 1 : iZ1;
            long j11 = 0;
            i10 = 0;
            while (i11 <= iW) {
                if (i11 == iZ1) {
                    this.f50594x2 = com.google.android.exoplayer2.util.u0.B1(j11);
                }
                z3VarW1.u(i11, this.f50588t);
                z3.d dVar2 = this.f50588t;
                if (dVar2.f52125o == com.google.android.exoplayer2.j.f46377b) {
                    com.google.android.exoplayer2.util.a.i(this.V ^ z10);
                    break;
                }
                int i12 = dVar2.f52126p;
                while (true) {
                    dVar = this.f50588t;
                    if (i12 <= dVar.f52127q) {
                        z3VarW1.k(i12, this.f50587s);
                        int iG = this.f50587s.g();
                        for (int iT = this.f50587s.t(); iT < iG; iT++) {
                            long j12 = this.f50587s.j(iT);
                            if (j12 == Long.MIN_VALUE) {
                                long j13 = this.f50587s.f52096e;
                                if (j13 != com.google.android.exoplayer2.j.f46377b) {
                                    j12 = j13;
                                    jS = j12 + this.f50587s.s();
                                    if (jS >= 0) {
                                        jArr = this.f50582p1;
                                        if (i10 == jArr.length) {
                                            if (jArr.length == 0) {
                                                length = 1;
                                            } else {
                                                length = jArr.length * 2;
                                            }
                                            this.f50582p1 = Arrays.copyOf(jArr, length);
                                            this.f50593x1 = Arrays.copyOf(this.f50593x1, length);
                                        }
                                        this.f50582p1[i10] = com.google.android.exoplayer2.util.u0.B1(j11 + jS);
                                        this.f50593x1[i10] = this.f50587s.u(iT);
                                        i10++;
                                    }
                                }
                            } else {
                                jS = j12 + this.f50587s.s();
                                if (jS >= 0) {
                                    jArr = this.f50582p1;
                                    if (i10 == jArr.length) {
                                        if (jArr.length == 0) {
                                            length = 1;
                                        } else {
                                            length = jArr.length * 2;
                                        }
                                        this.f50582p1 = Arrays.copyOf(jArr, length);
                                        this.f50593x1 = Arrays.copyOf(this.f50593x1, length);
                                    }
                                    this.f50582p1[i10] = com.google.android.exoplayer2.util.u0.B1(j11 + jS);
                                    this.f50593x1[i10] = this.f50587s.u(iT);
                                    i10++;
                                }
                            }
                        }
                        i12++;
                    }
                }
                j11 += dVar.f52125o;
                i11++;
                z10 = true;
            }
            j10 = j11;
        }
        long jB1 = com.google.android.exoplayer2.util.u0.B1(j10);
        TextView textView = this.f50579n;
        if (textView != null) {
            textView.setText(com.google.android.exoplayer2.util.u0.r0(this.f50585q, this.f50586r, jB1));
        }
        u0 u0Var = this.f50581p;
        if (u0Var != null) {
            u0Var.setDuration(jB1);
            int length2 = this.f50596y1.length;
            int i13 = i10 + length2;
            long[] jArr2 = this.f50582p1;
            if (i13 > jArr2.length) {
                this.f50582p1 = Arrays.copyOf(jArr2, i13);
                this.f50593x1 = Arrays.copyOf(this.f50593x1, i13);
            }
            System.arraycopy(this.f50596y1, 0, this.f50582p1, i10, length2);
            System.arraycopy(this.f50583p2, 0, this.f50593x1, i10, length2);
            this.f50581p.setAdGroupTimesMs(this.f50582p1, this.f50593x1, i13);
        }
        D0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J0() {
        f0();
        w0(this.N3.getItemCount() > 0, this.Q3);
    }

    private static boolean U(z3 z3Var, z3.d dVar) {
        if (z3Var.w() > 100) {
            return false;
        }
        int iW = z3Var.w();
        for (int i10 = 0; i10 < iW; i10++) {
            if (z3Var.u(i10, dVar).f52125o == com.google.android.exoplayer2.j.f46377b) {
                return false;
            }
        }
        return true;
    }

    private void W(c3 c3Var) {
        c3Var.pause();
    }

    private void X(c3 c3Var) {
        int playbackState = c3Var.getPlaybackState();
        if (playbackState == 1) {
            c3Var.prepare();
        } else if (playbackState == 4) {
            r0(c3Var, c3Var.Z1(), com.google.android.exoplayer2.j.f46377b);
        }
        c3Var.play();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y(c3 c3Var) {
        int playbackState = c3Var.getPlaybackState();
        if (playbackState == 1 || playbackState == 4 || !c3Var.p0()) {
            X(c3Var);
        } else {
            W(c3Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z(RecyclerView.Adapter<?> adapter) {
        this.f50584p3.setAdapter(adapter);
        G0();
        this.L3 = false;
        this.K3.dismiss();
        this.L3 = true;
        this.K3.showAsDropDown(this, (getWidth() - this.K3.getWidth()) - this.M3, (-this.K3.getHeight()) - this.M3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Pure
    public static r a0(r rVar, e4 e4Var, int i10, r.c cVar) {
        r.b bVarD = rVar.d();
        int iF = e4Var.c().get(i10).f();
        bVarD.e(cVar);
        ImmutableList<e4.a> immutableListC = e4Var.c();
        for (int i11 = 0; i11 < immutableListC.size(); i11++) {
            e4.a aVar = immutableListC.get(i11);
            if (i11 != i10 && aVar.f() == iF) {
                bVarD.a(new r.c(aVar.d(), ImmutableList.B()));
            }
        }
        return bVarD.b();
    }

    private ImmutableList<k> b0(e4 e4Var, int i10) {
        ImmutableList.a aVar = new ImmutableList.a();
        ImmutableList<e4.a> immutableListC = e4Var.c();
        for (int i11 = 0; i11 < immutableListC.size(); i11++) {
            e4.a aVar2 = immutableListC.get(i11);
            if (aVar2.f() == i10) {
                n1 n1VarD = aVar2.d();
                for (int i12 = 0; i12 < n1VarD.f48599b; i12++) {
                    if (aVar2.j(i12)) {
                        aVar.a(new k(e4Var, i11, i12, this.P3.a(n1VarD.c(i12))));
                    }
                }
            }
        }
        return aVar.e();
    }

    private static int c0(TypedArray typedArray, int i10) {
        return typedArray.getInt(R.styleable.StyledPlayerControlView_repeat_toggle_modes, i10);
    }

    private void f0() {
        this.N3.n();
        this.O3.n();
        c3 c3Var = this.P;
        if (c3Var != null && c3Var.g0(30) && this.P.g0(29)) {
            e4 e4VarV1 = this.P.v1();
            this.O3.o(b0(e4VarV1, 1));
            if (this.f50597y2.A(this.Q3)) {
                this.N3.o(b0(e4VarV1, 3));
            } else {
                this.N3.o(ImmutableList.B());
            }
        }
    }

    private static void g0(View view, View.OnClickListener onClickListener) {
        if (view == null) {
            return;
        }
        view.setVisibility(8);
        view.setOnClickListener(onClickListener);
    }

    @SuppressLint({"InlinedApi"})
    private static boolean j0(int i10) {
        return i10 == 90 || i10 == 89 || i10 == 85 || i10 == 79 || i10 == 126 || i10 == 127 || i10 == 87 || i10 == 88;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0(View view) {
        if (this.R == null) {
            return;
        }
        boolean z10 = !this.S;
        this.S = z10;
        y0(this.R3, z10);
        y0(this.S3, this.S);
        d dVar = this.R;
        if (dVar != null) {
            dVar.a(this.S);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18 = i13 - i11;
        int i19 = i17 - i15;
        if (!(i12 - i10 == i16 - i14 && i18 == i19) && this.K3.isShowing()) {
            G0();
            this.K3.update(view, (getWidth() - this.K3.getWidth()) - this.M3, (-this.K3.getHeight()) - this.M3, -1, -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o0(int i10) {
        if (i10 == 0) {
            Z(this.J3);
        } else if (i10 == 1) {
            Z(this.O3);
        } else {
            this.K3.dismiss();
        }
    }

    private void r0(c3 c3Var, int i10, long j10) {
        c3Var.D1(i10, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s0(c3 c3Var, long j10) {
        int iZ1;
        z3 z3VarW1 = c3Var.w1();
        if (this.V && !z3VarW1.x()) {
            int iW = z3VarW1.w();
            iZ1 = 0;
            while (true) {
                long jH = z3VarW1.u(iZ1, this.f50588t).h();
                if (j10 < jH) {
                    break;
                }
                if (iZ1 == iW - 1) {
                    j10 = jH;
                    break;
                } else {
                    j10 -= jH;
                    iZ1++;
                }
            }
        } else {
            iZ1 = c3Var.Z1();
        }
        r0(c3Var, iZ1, j10);
        D0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f10) {
        c3 c3Var = this.P;
        if (c3Var == null) {
            return;
        }
        c3Var.e(c3Var.g().f(f10));
    }

    private boolean t0() {
        c3 c3Var = this.P;
        return (c3Var == null || c3Var.getPlaybackState() == 4 || this.P.getPlaybackState() == 1 || !this.P.p0()) ? false : true;
    }

    private void w0(boolean z10, @androidx.annotation.p0 View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z10);
        view.setAlpha(z10 ? this.D : this.E);
    }

    private void x0() {
        c3 c3Var = this.P;
        int iF0 = (int) ((c3Var != null ? c3Var.F0() : 15000L) / 1000);
        TextView textView = this.f50574i;
        if (textView != null) {
            textView.setText(String.valueOf(iF0));
        }
        View view = this.f50572g;
        if (view != null) {
            view.setContentDescription(this.G2.getQuantityString(R.plurals.exo_controls_fastforward_by_amount_description, iF0, Integer.valueOf(iF0)));
        }
    }

    private void y0(@androidx.annotation.p0 ImageView imageView, boolean z10) {
        if (imageView == null) {
            return;
        }
        if (z10) {
            imageView.setImageDrawable(this.L);
            imageView.setContentDescription(this.N);
        } else {
            imageView.setImageDrawable(this.M);
            imageView.setContentDescription(this.O);
        }
    }

    private static void z0(@androidx.annotation.p0 View view, boolean z10) {
        if (view == null) {
            return;
        }
        if (z10) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    public void T(m mVar) {
        com.google.android.exoplayer2.util.a.g(mVar);
        this.f50567c.add(mVar);
    }

    public boolean V(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        c3 c3Var = this.P;
        if (c3Var == null || !j0(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (c3Var.getPlaybackState() == 4) {
                return true;
            }
            c3Var.P0();
            return true;
        }
        if (keyCode == 89) {
            c3Var.i2();
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            Y(c3Var);
            return true;
        }
        if (keyCode == 87) {
            c3Var.y1();
            return true;
        }
        if (keyCode == 88) {
            c3Var.m1();
            return true;
        }
        if (keyCode == 126) {
            X(c3Var);
            return true;
        }
        if (keyCode != 127) {
            return true;
        }
        W(c3Var);
        return true;
    }

    public void d0() {
        this.f50597y2.C();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return V(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public void e0() {
        this.f50597y2.F();
    }

    @androidx.annotation.p0
    public c3 getPlayer() {
        return this.P;
    }

    public int getRepeatToggleModes() {
        return this.f50568c0;
    }

    public boolean getShowShuffleButton() {
        return this.f50597y2.A(this.f50577l);
    }

    public boolean getShowSubtitleButton() {
        return this.f50597y2.A(this.Q3);
    }

    public int getShowTimeoutMs() {
        return this.f50564a0;
    }

    public boolean getShowVrButton() {
        return this.f50597y2.A(this.f50578m);
    }

    public boolean h0() {
        return this.f50597y2.I();
    }

    public boolean i0() {
        return this.f50597y2.J();
    }

    public boolean k0() {
        return getVisibility() == 0;
    }

    void l0() {
        Iterator<m> it = this.f50567c.iterator();
        while (it.hasNext()) {
            it.next().s(getVisibility());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f50597y2.P();
        this.T = true;
        if (i0()) {
            this.f50597y2.X();
        }
        v0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f50597y2.Q();
        this.T = false;
        removeCallbacks(this.f50589u);
        this.f50597y2.W();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f50597y2.R(z10, i10, i11, i12, i13);
    }

    public void p0(m mVar) {
        this.f50567c.remove(mVar);
    }

    void q0() {
        View view = this.f50571f;
        if (view != null) {
            view.requestFocus();
        }
    }

    public void setAnimationEnabled(boolean z10) {
        this.f50597y2.Y(z10);
    }

    public void setExtraAdGroupMarkers(@androidx.annotation.p0 long[] jArr, @androidx.annotation.p0 boolean[] zArr) {
        if (jArr == null) {
            this.f50596y1 = new long[0];
            this.f50583p2 = new boolean[0];
        } else {
            boolean[] zArr2 = (boolean[]) com.google.android.exoplayer2.util.a.g(zArr);
            com.google.android.exoplayer2.util.a.a(jArr.length == zArr2.length);
            this.f50596y1 = jArr;
            this.f50583p2 = zArr2;
        }
        I0();
    }

    public void setOnFullScreenModeChangedListener(@androidx.annotation.p0 d dVar) {
        this.R = dVar;
        z0(this.R3, dVar != null);
        z0(this.S3, dVar != null);
    }

    public void setPlayer(@androidx.annotation.p0 c3 c3Var) {
        boolean z10 = true;
        com.google.android.exoplayer2.util.a.i(Looper.myLooper() == Looper.getMainLooper());
        if (c3Var != null && c3Var.x1() != Looper.getMainLooper()) {
            z10 = false;
        }
        com.google.android.exoplayer2.util.a.a(z10);
        c3 c3Var2 = this.P;
        if (c3Var2 == c3Var) {
            return;
        }
        if (c3Var2 != null) {
            c3Var2.U(this.f50565b);
        }
        this.P = c3Var;
        if (c3Var != null) {
            c3Var.S1(this.f50565b);
        }
        if (c3Var instanceof c2) {
            ((c2) c3Var).l2();
        }
        v0();
    }

    public void setProgressUpdateListener(@androidx.annotation.p0 f fVar) {
        this.Q = fVar;
    }

    public void setRepeatToggleModes(int i10) {
        this.f50568c0 = i10;
        c3 c3Var = this.P;
        if (c3Var != null) {
            int repeatMode = c3Var.getRepeatMode();
            if (i10 == 0 && repeatMode != 0) {
                this.P.setRepeatMode(0);
            } else if (i10 == 1 && repeatMode == 2) {
                this.P.setRepeatMode(1);
            } else if (i10 == 2 && repeatMode == 1) {
                this.P.setRepeatMode(2);
            }
        }
        this.f50597y2.Z(this.f50576k, i10 != 0);
        E0();
    }

    public void setShowFastForwardButton(boolean z10) {
        this.f50597y2.Z(this.f50572g, z10);
        A0();
    }

    public void setShowMultiWindowTimeBar(boolean z10) {
        this.U = z10;
        I0();
    }

    public void setShowNextButton(boolean z10) {
        this.f50597y2.Z(this.f50570e, z10);
        A0();
    }

    public void setShowPreviousButton(boolean z10) {
        this.f50597y2.Z(this.f50569d, z10);
        A0();
    }

    public void setShowRewindButton(boolean z10) {
        this.f50597y2.Z(this.f50573h, z10);
        A0();
    }

    public void setShowShuffleButton(boolean z10) {
        this.f50597y2.Z(this.f50577l, z10);
        H0();
    }

    public void setShowSubtitleButton(boolean z10) {
        this.f50597y2.Z(this.Q3, z10);
    }

    public void setShowTimeoutMs(int i10) {
        this.f50564a0 = i10;
        if (i0()) {
            this.f50597y2.X();
        }
    }

    public void setShowVrButton(boolean z10) {
        this.f50597y2.Z(this.f50578m, z10);
    }

    public void setTimeBarMinUpdateInterval(int i10) {
        this.f50566b0 = com.google.android.exoplayer2.util.u0.s(i10, 16, 1000);
    }

    public void setVrButtonListener(@androidx.annotation.p0 View.OnClickListener onClickListener) {
        View view = this.f50578m;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            w0(onClickListener != null, this.f50578m);
        }
    }

    public void u0() {
        this.f50597y2.c0();
    }

    void v0() {
        B0();
        A0();
        E0();
        H0();
        J0();
        C0();
        I0();
    }
}
