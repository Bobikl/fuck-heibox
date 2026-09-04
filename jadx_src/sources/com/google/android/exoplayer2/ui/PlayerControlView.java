package com.google.android.exoplayer2.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.b3;
import com.google.android.exoplayer2.c3;
import com.google.android.exoplayer2.e3;
import com.google.android.exoplayer2.e4;
import com.google.android.exoplayer2.f3;
import com.google.android.exoplayer2.i2;
import com.google.android.exoplayer2.m2;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.p1;
import com.google.android.exoplayer2.y1;
import com.google.android.exoplayer2.z3;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class PlayerControlView extends FrameLayout {
    public static final int G2 = 100;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public static final int f50436p2 = 5000;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private static final int f50437p3 = 1000;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final int f50438x2 = 0;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    public static final int f50439y2 = 200;
    private final String A;
    private final Drawable B;
    private final Drawable C;
    private final float D;
    private final float E;
    private final String F;
    private final String G;

    @androidx.annotation.p0
    private c3 H;

    @androidx.annotation.p0
    private d I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private int N;
    private int O;
    private int P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private boolean U;
    private long V;
    private long[] W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean[] f50440a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f50441b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private long[] f50442b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CopyOnWriteArrayList<e> f50443c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private boolean[] f50444c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.p0
    private final View f50445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.p0
    private final View f50446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    private final View f50447f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.p0
    private final View f50448g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.p0
    private final View f50449h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.p0
    private final View f50450i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.p0
    private final ImageView f50451j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.p0
    private final ImageView f50452k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.p0
    private final View f50453l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.p0
    private final TextView f50454m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.p0
    private final TextView f50455n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.p0
    private final u0 f50456o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final StringBuilder f50457p;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private long f50458p1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Formatter f50459q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final z3.b f50460r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final z3.d f50461s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Runnable f50462t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Runnable f50463u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Drawable f50464v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Drawable f50465w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Drawable f50466x;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private long f50467x1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final String f50468y;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private long f50469y1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final String f50470z;

    @androidx.annotation.w0(21)
    public static final class b {
        private b() {
        }

        @androidx.annotation.u
        public static boolean a(View view) {
            return view.isAccessibilityFocused();
        }
    }

    public final class c implements c3.h, u0.a, View.OnClickListener {
        private c() {
        }

        @Override // com.google.android.exoplayer2.ui.u0.a
        public void A(u0 u0Var, long j10) {
            PlayerControlView.this.M = true;
            if (PlayerControlView.this.f50455n != null) {
                PlayerControlView.this.f50455n.setText(com.google.android.exoplayer2.util.u0.r0(PlayerControlView.this.f50457p, PlayerControlView.this.f50459q, j10));
            }
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
            c3 c3Var = PlayerControlView.this.H;
            if (c3Var == null) {
                return;
            }
            if (PlayerControlView.this.f50446e == view) {
                c3Var.y1();
                return;
            }
            if (PlayerControlView.this.f50445d == view) {
                c3Var.m1();
                return;
            }
            if (PlayerControlView.this.f50449h == view) {
                if (c3Var.getPlaybackState() != 4) {
                    c3Var.P0();
                    return;
                }
                return;
            }
            if (PlayerControlView.this.f50450i == view) {
                c3Var.i2();
                return;
            }
            if (PlayerControlView.this.f50447f == view) {
                PlayerControlView.this.C(c3Var);
                return;
            }
            if (PlayerControlView.this.f50448g == view) {
                PlayerControlView.this.B(c3Var);
            } else if (PlayerControlView.this.f50451j == view) {
                c3Var.setRepeatMode(com.google.android.exoplayer2.util.g0.a(c3Var.getRepeatMode(), PlayerControlView.this.P));
            } else if (PlayerControlView.this.f50452k == view) {
                c3Var.q0(!c3Var.h2());
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
            PlayerControlView.this.M = false;
            if (z10 || PlayerControlView.this.H == null) {
                return;
            }
            PlayerControlView playerControlView = PlayerControlView.this;
            playerControlView.N(playerControlView.H, j10);
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
                PlayerControlView.this.T();
            }
            if (gVar.b(4, 5, 7)) {
                PlayerControlView.this.U();
            }
            if (gVar.a(8)) {
                PlayerControlView.this.V();
            }
            if (gVar.a(9)) {
                PlayerControlView.this.W();
            }
            if (gVar.b(8, 9, 11, 0, 13)) {
                PlayerControlView.this.S();
            }
            if (gVar.b(11, 0)) {
                PlayerControlView.this.X();
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
            if (PlayerControlView.this.f50455n != null) {
                PlayerControlView.this.f50455n.setText(com.google.android.exoplayer2.util.u0.r0(PlayerControlView.this.f50457p, PlayerControlView.this.f50459q, j10));
            }
        }
    }

    public interface d {
        void a(long j10, long j11);
    }

    public interface e {
        void s(int i10);
    }

    static {
        y1.a("goog.exo.ui");
    }

    public PlayerControlView(Context context) {
        this(context, null);
    }

    public PlayerControlView(Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayerControlView(Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, attributeSet);
    }

    public PlayerControlView(Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10, @androidx.annotation.p0 AttributeSet attributeSet2) {
        super(context, attributeSet, i10);
        int resourceId = R.layout.exo_player_control_view;
        this.N = 5000;
        this.P = 0;
        this.O = 200;
        this.V = com.google.android.exoplayer2.j.f46377b;
        this.Q = true;
        this.R = true;
        this.S = true;
        this.T = true;
        this.U = false;
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, R.styleable.f50556i, i10, 0);
            try {
                this.N = typedArrayObtainStyledAttributes.getInt(R.styleable.PlayerControlView_show_timeout, this.N);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.PlayerControlView_controller_layout_id, resourceId);
                this.P = E(typedArrayObtainStyledAttributes, this.P);
                this.Q = typedArrayObtainStyledAttributes.getBoolean(R.styleable.PlayerControlView_show_rewind_button, this.Q);
                this.R = typedArrayObtainStyledAttributes.getBoolean(R.styleable.PlayerControlView_show_fastforward_button, this.R);
                this.S = typedArrayObtainStyledAttributes.getBoolean(R.styleable.PlayerControlView_show_previous_button, this.S);
                this.T = typedArrayObtainStyledAttributes.getBoolean(R.styleable.PlayerControlView_show_next_button, this.T);
                this.U = typedArrayObtainStyledAttributes.getBoolean(R.styleable.PlayerControlView_show_shuffle_button, this.U);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(R.styleable.PlayerControlView_time_bar_min_update_interval, this.O));
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        }
        this.f50443c = new CopyOnWriteArrayList<>();
        this.f50460r = new z3.b();
        this.f50461s = new z3.d();
        StringBuilder sb2 = new StringBuilder();
        this.f50457p = sb2;
        this.f50459q = new Formatter(sb2, Locale.getDefault());
        this.W = new long[0];
        this.f50440a0 = new boolean[0];
        this.f50442b0 = new long[0];
        this.f50444c0 = new boolean[0];
        c cVar = new c();
        this.f50441b = cVar;
        this.f50462t = new Runnable() { // from class: com.google.android.exoplayer2.ui.l
            @Override // java.lang.Runnable
            public final void run() {
                this.f50737b.U();
            }
        };
        this.f50463u = new Runnable() { // from class: com.google.android.exoplayer2.ui.m
            @Override // java.lang.Runnable
            public final void run() {
                this.f50739b.F();
            }
        };
        LayoutInflater.from(context).inflate(resourceId, this);
        setDescendantFocusability(262144);
        int i11 = R.id.exo_progress;
        u0 u0Var = (u0) findViewById(i11);
        View viewFindViewById = findViewById(R.id.exo_progress_placeholder);
        if (u0Var != null) {
            this.f50456o = u0Var;
        } else if (viewFindViewById != null) {
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, null, 0, attributeSet2);
            defaultTimeBar.setId(i11);
            defaultTimeBar.setLayoutParams(viewFindViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById);
            viewGroup.removeView(viewFindViewById);
            viewGroup.addView(defaultTimeBar, iIndexOfChild);
            this.f50456o = defaultTimeBar;
        } else {
            this.f50456o = null;
        }
        this.f50454m = (TextView) findViewById(R.id.exo_duration);
        this.f50455n = (TextView) findViewById(R.id.exo_position);
        u0 u0Var2 = this.f50456o;
        if (u0Var2 != null) {
            u0Var2.b(cVar);
        }
        View viewFindViewById2 = findViewById(R.id.exo_play);
        this.f50447f = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(cVar);
        }
        View viewFindViewById3 = findViewById(R.id.exo_pause);
        this.f50448g = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(cVar);
        }
        View viewFindViewById4 = findViewById(R.id.exo_prev);
        this.f50445d = viewFindViewById4;
        if (viewFindViewById4 != null) {
            viewFindViewById4.setOnClickListener(cVar);
        }
        View viewFindViewById5 = findViewById(R.id.exo_next);
        this.f50446e = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(cVar);
        }
        View viewFindViewById6 = findViewById(R.id.exo_rew);
        this.f50450i = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(cVar);
        }
        View viewFindViewById7 = findViewById(R.id.exo_ffwd);
        this.f50449h = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(cVar);
        }
        ImageView imageView = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.f50451j = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(cVar);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_shuffle);
        this.f50452k = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(cVar);
        }
        View viewFindViewById8 = findViewById(R.id.exo_vr);
        this.f50453l = viewFindViewById8;
        setShowVrButton(false);
        R(false, false, viewFindViewById8);
        Resources resources = context.getResources();
        this.D = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.E = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        this.f50464v = resources.getDrawable(R.drawable.exo_controls_repeat_off);
        this.f50465w = resources.getDrawable(R.drawable.exo_controls_repeat_one);
        this.f50466x = resources.getDrawable(R.drawable.exo_controls_repeat_all);
        this.B = resources.getDrawable(R.drawable.exo_controls_shuffle_on);
        this.C = resources.getDrawable(R.drawable.exo_controls_shuffle_off);
        this.f50468y = resources.getString(R.string.exo_controls_repeat_off_description);
        this.f50470z = resources.getString(R.string.exo_controls_repeat_one_description);
        this.A = resources.getString(R.string.exo_controls_repeat_all_description);
        this.F = resources.getString(R.string.exo_controls_shuffle_on_description);
        this.G = resources.getString(R.string.exo_controls_shuffle_off_description);
        this.f50467x1 = com.google.android.exoplayer2.j.f46377b;
        this.f50469y1 = com.google.android.exoplayer2.j.f46377b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(c3 c3Var) {
        c3Var.pause();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(c3 c3Var) {
        int playbackState = c3Var.getPlaybackState();
        if (playbackState == 1) {
            c3Var.prepare();
        } else if (playbackState == 4) {
            M(c3Var, c3Var.Z1(), com.google.android.exoplayer2.j.f46377b);
        }
        c3Var.play();
    }

    private void D(c3 c3Var) {
        int playbackState = c3Var.getPlaybackState();
        if (playbackState == 1 || playbackState == 4 || !c3Var.p0()) {
            C(c3Var);
        } else {
            B(c3Var);
        }
    }

    private static int E(TypedArray typedArray, int i10) {
        return typedArray.getInt(R.styleable.PlayerControlView_repeat_toggle_modes, i10);
    }

    private void G() {
        removeCallbacks(this.f50463u);
        if (this.N <= 0) {
            this.V = com.google.android.exoplayer2.j.f46377b;
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        int i10 = this.N;
        this.V = jUptimeMillis + ((long) i10);
        if (this.J) {
            postDelayed(this.f50463u, i10);
        }
    }

    @SuppressLint({"InlinedApi"})
    private static boolean H(int i10) {
        return i10 == 90 || i10 == 89 || i10 == 85 || i10 == 79 || i10 == 126 || i10 == 127 || i10 == 87 || i10 == 88;
    }

    private void K() {
        View view;
        View view2;
        boolean zO = O();
        if (!zO && (view2 = this.f50447f) != null) {
            view2.sendAccessibilityEvent(8);
        } else {
            if (!zO || (view = this.f50448g) == null) {
                return;
            }
            view.sendAccessibilityEvent(8);
        }
    }

    private void L() {
        View view;
        View view2;
        boolean zO = O();
        if (!zO && (view2 = this.f50447f) != null) {
            view2.requestFocus();
        } else {
            if (!zO || (view = this.f50448g) == null) {
                return;
            }
            view.requestFocus();
        }
    }

    private void M(c3 c3Var, int i10, long j10) {
        c3Var.D1(i10, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(c3 c3Var, long j10) {
        int iZ1;
        z3 z3VarW1 = c3Var.w1();
        if (this.L && !z3VarW1.x()) {
            int iW = z3VarW1.w();
            iZ1 = 0;
            while (true) {
                long jH = z3VarW1.u(iZ1, this.f50461s).h();
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
        M(c3Var, iZ1, j10);
        U();
    }

    private boolean O() {
        c3 c3Var = this.H;
        return (c3Var == null || c3Var.getPlaybackState() == 4 || this.H.getPlaybackState() == 1 || !this.H.p0()) ? false : true;
    }

    private void Q() {
        T();
        S();
        V();
        W();
        X();
    }

    private void R(boolean z10, boolean z11, @androidx.annotation.p0 View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z11);
        view.setAlpha(z11 ? this.D : this.E);
        view.setVisibility(z10 ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S() {
        boolean zG0;
        boolean z10;
        boolean zG1;
        boolean zG2;
        if (I() && this.J) {
            c3 c3Var = this.H;
            boolean z11 = false;
            if (c3Var != null) {
                boolean zG3 = c3Var.g0(5);
                boolean zG4 = c3Var.g0(7);
                zG1 = c3Var.g0(11);
                zG2 = c3Var.g0(12);
                zG0 = c3Var.g0(9);
                z10 = zG3;
                z11 = zG4;
            } else {
                zG0 = false;
                z10 = false;
                zG1 = false;
                zG2 = false;
            }
            R(this.S, z11, this.f50445d);
            R(this.Q, zG1, this.f50450i);
            R(this.R, zG2, this.f50449h);
            R(this.T, zG0, this.f50446e);
            u0 u0Var = this.f50456o;
            if (u0Var != null) {
                u0Var.setEnabled(z10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        boolean z10;
        boolean z11;
        boolean z12;
        if (I() && this.J) {
            boolean zO = O();
            View view = this.f50447f;
            boolean z13 = true;
            if (view != null) {
                z10 = (zO && view.isFocused()) | false;
                if (com.google.android.exoplayer2.util.u0.f51536a < 21) {
                    z12 = z10;
                } else {
                    z12 = zO && b.a(this.f50447f);
                }
                z11 = z12 | false;
                this.f50447f.setVisibility(zO ? 8 : 0);
            } else {
                z10 = false;
                z11 = false;
            }
            View view2 = this.f50448g;
            if (view2 != null) {
                z10 |= !zO && view2.isFocused();
                if (com.google.android.exoplayer2.util.u0.f51536a < 21) {
                    z13 = z10;
                } else if (zO || !b.a(this.f50448g)) {
                    z13 = false;
                }
                z11 |= z13;
                this.f50448g.setVisibility(zO ? 0 : 8);
            }
            if (z10) {
                L();
            }
            if (z11) {
                K();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U() {
        long jO0;
        if (I() && this.J) {
            c3 c3Var = this.H;
            long jQ1 = 0;
            if (c3Var != null) {
                jQ1 = this.f50458p1 + c3Var.Q1();
                jO0 = this.f50458p1 + c3Var.O0();
            } else {
                jO0 = 0;
            }
            boolean z10 = jQ1 != this.f50467x1;
            boolean z11 = jO0 != this.f50469y1;
            this.f50467x1 = jQ1;
            this.f50469y1 = jO0;
            TextView textView = this.f50455n;
            if (textView != null && !this.M && z10) {
                textView.setText(com.google.android.exoplayer2.util.u0.r0(this.f50457p, this.f50459q, jQ1));
            }
            u0 u0Var = this.f50456o;
            if (u0Var != null) {
                u0Var.setPosition(jQ1);
                this.f50456o.setBufferedPosition(jO0);
            }
            d dVar = this.I;
            if (dVar != null && (z10 || z11)) {
                dVar.a(jQ1, jO0);
            }
            removeCallbacks(this.f50462t);
            int playbackState = c3Var == null ? 1 : c3Var.getPlaybackState();
            if (c3Var == null || !c3Var.isPlaying()) {
                if (playbackState == 4 || playbackState == 1) {
                    return;
                }
                postDelayed(this.f50462t, 1000L);
                return;
            }
            u0 u0Var2 = this.f50456o;
            long jMin = Math.min(u0Var2 != null ? u0Var2.getPreferredUpdateDelay() : 1000L, 1000 - (jQ1 % 1000));
            float f10 = c3Var.g().f44371b;
            postDelayed(this.f50462t, com.google.android.exoplayer2.util.u0.t(f10 > 0.0f ? (long) (jMin / f10) : 1000L, this.O, 1000L));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V() {
        ImageView imageView;
        if (I() && this.J && (imageView = this.f50451j) != null) {
            if (this.P == 0) {
                R(false, false, imageView);
                return;
            }
            c3 c3Var = this.H;
            if (c3Var == null) {
                R(true, false, imageView);
                this.f50451j.setImageDrawable(this.f50464v);
                this.f50451j.setContentDescription(this.f50468y);
                return;
            }
            R(true, true, imageView);
            int repeatMode = c3Var.getRepeatMode();
            if (repeatMode == 0) {
                this.f50451j.setImageDrawable(this.f50464v);
                this.f50451j.setContentDescription(this.f50468y);
            } else if (repeatMode == 1) {
                this.f50451j.setImageDrawable(this.f50465w);
                this.f50451j.setContentDescription(this.f50470z);
            } else if (repeatMode == 2) {
                this.f50451j.setImageDrawable(this.f50466x);
                this.f50451j.setContentDescription(this.A);
            }
            this.f50451j.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W() {
        ImageView imageView;
        if (I() && this.J && (imageView = this.f50452k) != null) {
            c3 c3Var = this.H;
            if (!this.U) {
                R(false, false, imageView);
                return;
            }
            if (c3Var == null) {
                R(true, false, imageView);
                this.f50452k.setImageDrawable(this.C);
                this.f50452k.setContentDescription(this.G);
            } else {
                R(true, true, imageView);
                this.f50452k.setImageDrawable(c3Var.h2() ? this.B : this.C);
                this.f50452k.setContentDescription(c3Var.h2() ? this.F : this.G);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:40:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d4 A[SYNTHETIC] */
    public void X() {
        int i10;
        z3.d dVar;
        long jS;
        long[] jArr;
        int length;
        c3 c3Var = this.H;
        if (c3Var == null) {
            return;
        }
        boolean z10 = true;
        this.L = this.K && z(c3Var.w1(), this.f50461s);
        long j10 = 0;
        this.f50458p1 = 0L;
        z3 z3VarW1 = c3Var.w1();
        if (z3VarW1.x()) {
            i10 = 0;
        } else {
            int iZ1 = c3Var.Z1();
            boolean z11 = this.L;
            int i11 = z11 ? 0 : iZ1;
            int iW = z11 ? z3VarW1.w() - 1 : iZ1;
            long j11 = 0;
            i10 = 0;
            while (i11 <= iW) {
                if (i11 == iZ1) {
                    this.f50458p1 = com.google.android.exoplayer2.util.u0.B1(j11);
                }
                z3VarW1.u(i11, this.f50461s);
                z3.d dVar2 = this.f50461s;
                if (dVar2.f52125o == com.google.android.exoplayer2.j.f46377b) {
                    com.google.android.exoplayer2.util.a.i(this.L ^ z10);
                    break;
                }
                int i12 = dVar2.f52126p;
                while (true) {
                    dVar = this.f50461s;
                    if (i12 <= dVar.f52127q) {
                        z3VarW1.k(i12, this.f50460r);
                        int iG = this.f50460r.g();
                        for (int iT = this.f50460r.t(); iT < iG; iT++) {
                            long j12 = this.f50460r.j(iT);
                            if (j12 == Long.MIN_VALUE) {
                                long j13 = this.f50460r.f52096e;
                                if (j13 != com.google.android.exoplayer2.j.f46377b) {
                                    j12 = j13;
                                    jS = j12 + this.f50460r.s();
                                    if (jS >= 0) {
                                        jArr = this.W;
                                        if (i10 == jArr.length) {
                                            if (jArr.length == 0) {
                                                length = 1;
                                            } else {
                                                length = jArr.length * 2;
                                            }
                                            this.W = Arrays.copyOf(jArr, length);
                                            this.f50440a0 = Arrays.copyOf(this.f50440a0, length);
                                        }
                                        this.W[i10] = com.google.android.exoplayer2.util.u0.B1(j11 + jS);
                                        this.f50440a0[i10] = this.f50460r.u(iT);
                                        i10++;
                                    }
                                }
                            } else {
                                jS = j12 + this.f50460r.s();
                                if (jS >= 0) {
                                    jArr = this.W;
                                    if (i10 == jArr.length) {
                                        if (jArr.length == 0) {
                                            length = 1;
                                        } else {
                                            length = jArr.length * 2;
                                        }
                                        this.W = Arrays.copyOf(jArr, length);
                                        this.f50440a0 = Arrays.copyOf(this.f50440a0, length);
                                    }
                                    this.W[i10] = com.google.android.exoplayer2.util.u0.B1(j11 + jS);
                                    this.f50440a0[i10] = this.f50460r.u(iT);
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
        TextView textView = this.f50454m;
        if (textView != null) {
            textView.setText(com.google.android.exoplayer2.util.u0.r0(this.f50457p, this.f50459q, jB1));
        }
        u0 u0Var = this.f50456o;
        if (u0Var != null) {
            u0Var.setDuration(jB1);
            int length2 = this.f50442b0.length;
            int i13 = i10 + length2;
            long[] jArr2 = this.W;
            if (i13 > jArr2.length) {
                this.W = Arrays.copyOf(jArr2, i13);
                this.f50440a0 = Arrays.copyOf(this.f50440a0, i13);
            }
            System.arraycopy(this.f50442b0, 0, this.W, i10, length2);
            System.arraycopy(this.f50444c0, 0, this.f50440a0, i10, length2);
            this.f50456o.setAdGroupTimesMs(this.W, this.f50440a0, i13);
        }
        U();
    }

    private static boolean z(z3 z3Var, z3.d dVar) {
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

    public boolean A(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        c3 c3Var = this.H;
        if (c3Var == null || !H(keyCode)) {
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
            D(c3Var);
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
            C(c3Var);
            return true;
        }
        if (keyCode != 127) {
            return true;
        }
        B(c3Var);
        return true;
    }

    public void F() {
        if (I()) {
            setVisibility(8);
            Iterator<e> it = this.f50443c.iterator();
            while (it.hasNext()) {
                it.next().s(getVisibility());
            }
            removeCallbacks(this.f50462t);
            removeCallbacks(this.f50463u);
            this.V = com.google.android.exoplayer2.j.f46377b;
        }
    }

    public boolean I() {
        return getVisibility() == 0;
    }

    public void J(e eVar) {
        this.f50443c.remove(eVar);
    }

    public void P() {
        if (!I()) {
            setVisibility(0);
            Iterator<e> it = this.f50443c.iterator();
            while (it.hasNext()) {
                it.next().s(getVisibility());
            }
            Q();
            L();
            K();
        }
        G();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return A(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.f50463u);
        } else if (motionEvent.getAction() == 1) {
            G();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @androidx.annotation.p0
    public c3 getPlayer() {
        return this.H;
    }

    public int getRepeatToggleModes() {
        return this.P;
    }

    public boolean getShowShuffleButton() {
        return this.U;
    }

    public int getShowTimeoutMs() {
        return this.N;
    }

    public boolean getShowVrButton() {
        View view = this.f50453l;
        return view != null && view.getVisibility() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J = true;
        long j10 = this.V;
        if (j10 != com.google.android.exoplayer2.j.f46377b) {
            long jUptimeMillis = j10 - SystemClock.uptimeMillis();
            if (jUptimeMillis <= 0) {
                F();
            } else {
                postDelayed(this.f50463u, jUptimeMillis);
            }
        } else if (I()) {
            G();
        }
        Q();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.J = false;
        removeCallbacks(this.f50462t);
        removeCallbacks(this.f50463u);
    }

    public void setExtraAdGroupMarkers(@androidx.annotation.p0 long[] jArr, @androidx.annotation.p0 boolean[] zArr) {
        if (jArr == null) {
            this.f50442b0 = new long[0];
            this.f50444c0 = new boolean[0];
        } else {
            boolean[] zArr2 = (boolean[]) com.google.android.exoplayer2.util.a.g(zArr);
            com.google.android.exoplayer2.util.a.a(jArr.length == zArr2.length);
            this.f50442b0 = jArr;
            this.f50444c0 = zArr2;
        }
        X();
    }

    public void setPlayer(@androidx.annotation.p0 c3 c3Var) {
        boolean z10 = true;
        com.google.android.exoplayer2.util.a.i(Looper.myLooper() == Looper.getMainLooper());
        if (c3Var != null && c3Var.x1() != Looper.getMainLooper()) {
            z10 = false;
        }
        com.google.android.exoplayer2.util.a.a(z10);
        c3 c3Var2 = this.H;
        if (c3Var2 == c3Var) {
            return;
        }
        if (c3Var2 != null) {
            c3Var2.U(this.f50441b);
        }
        this.H = c3Var;
        if (c3Var != null) {
            c3Var.S1(this.f50441b);
        }
        Q();
    }

    public void setProgressUpdateListener(@androidx.annotation.p0 d dVar) {
        this.I = dVar;
    }

    public void setRepeatToggleModes(int i10) {
        this.P = i10;
        c3 c3Var = this.H;
        if (c3Var != null) {
            int repeatMode = c3Var.getRepeatMode();
            if (i10 == 0 && repeatMode != 0) {
                this.H.setRepeatMode(0);
            } else if (i10 == 1 && repeatMode == 2) {
                this.H.setRepeatMode(1);
            } else if (i10 == 2 && repeatMode == 1) {
                this.H.setRepeatMode(2);
            }
        }
        V();
    }

    public void setShowFastForwardButton(boolean z10) {
        this.R = z10;
        S();
    }

    public void setShowMultiWindowTimeBar(boolean z10) {
        this.K = z10;
        X();
    }

    public void setShowNextButton(boolean z10) {
        this.T = z10;
        S();
    }

    public void setShowPreviousButton(boolean z10) {
        this.S = z10;
        S();
    }

    public void setShowRewindButton(boolean z10) {
        this.Q = z10;
        S();
    }

    public void setShowShuffleButton(boolean z10) {
        this.U = z10;
        W();
    }

    public void setShowTimeoutMs(int i10) {
        this.N = i10;
        if (I()) {
            G();
        }
    }

    public void setShowVrButton(boolean z10) {
        View view = this.f50453l;
        if (view != null) {
            view.setVisibility(z10 ? 0 : 8);
        }
    }

    public void setTimeBarMinUpdateInterval(int i10) {
        this.O = com.google.android.exoplayer2.util.u0.s(i10, 16, 1000);
    }

    public void setVrButtonListener(@androidx.annotation.p0 View.OnClickListener onClickListener) {
        View view = this.f50453l;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            R(getShowVrButton(), onClickListener != null, this.f50453l);
        }
    }

    public void y(e eVar) {
        com.google.android.exoplayer2.util.a.g(eVar);
        this.f50443c.add(eVar);
    }
}
