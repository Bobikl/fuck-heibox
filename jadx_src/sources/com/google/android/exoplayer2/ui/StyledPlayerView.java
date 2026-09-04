package com.google.android.exoplayer2.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.opengl.GLSurfaceView;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
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
import com.google.android.exoplayer2.z3;
import com.google.common.collect.ImmutableList;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class StyledPlayerView extends FrameLayout implements c {
    public static final int C = 0;
    public static final int D = 1;
    public static final int E = 2;
    private static final int F = 0;
    private static final int G = 1;
    private static final int H = 2;
    private static final int I = 3;
    private static final int J = 4;
    private static final int K = 3;
    private static final int L = -1;
    private int A;
    private boolean B;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f50624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    private final AspectRatioFrameLayout f50625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.p0
    private final View f50626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.p0
    private final View f50627e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f50628f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.p0
    private final ImageView f50629g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.p0
    private final SubtitleView f50630h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.p0
    private final View f50631i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.p0
    private final TextView f50632j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.p0
    private final StyledPlayerControlView f50633k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.p0
    private final FrameLayout f50634l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.p0
    private final FrameLayout f50635m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.p0
    private c3 f50636n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f50637o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.p0
    private StyledPlayerControlView.m f50638p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f50639q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.p0
    private Drawable f50640r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f50641s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f50642t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.p0
    private com.google.android.exoplayer2.util.l<? super PlaybackException> f50643u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.p0
    private CharSequence f50644v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f50645w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f50646x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f50647y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f50648z;

    public final class a implements c3.h, View.OnLayoutChangeListener, View.OnClickListener, StyledPlayerControlView.m {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final z3.b f50649b = new z3.b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.p0
        private Object f50650c;

        public a() {
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
        public void X() {
            if (StyledPlayerView.this.f50626d != null) {
                StyledPlayerView.this.f50626d.setVisibility(4);
            }
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
        public void c(c3.l lVar, c3.l lVar2, int i10) {
            if (StyledPlayerView.this.x() && StyledPlayerView.this.f50647y) {
                StyledPlayerView.this.u();
            }
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
        public void g(com.google.android.exoplayer2.video.a0 a0Var) {
            StyledPlayerView.this.K();
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
        public void k(boolean z10, int i10) {
            StyledPlayerView.this.L();
            StyledPlayerView.this.N();
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
        public void n(e4 e4Var) {
            c3 c3Var = (c3) com.google.android.exoplayer2.util.a.g(StyledPlayerView.this.f50636n);
            z3 z3VarW1 = c3Var.w1();
            if (z3VarW1.x()) {
                this.f50650c = null;
            } else if (c3Var.v1().c().isEmpty()) {
                Object obj = this.f50650c;
                if (obj != null) {
                    int iG = z3VarW1.g(obj);
                    if (iG != -1) {
                        if (c3Var.Z1() == z3VarW1.k(iG, this.f50649b).f52095d) {
                            return;
                        }
                    }
                    this.f50650c = null;
                }
            } else {
                this.f50650c = z3VarW1.l(c3Var.x0(), this.f50649b, true).f52094c;
            }
            StyledPlayerView.this.P(false);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public /* synthetic */ void o(c3.c cVar) {
            f3.c(this, cVar);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            StyledPlayerView.this.J();
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            StyledPlayerView.o((TextureView) view, StyledPlayerView.this.A);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public /* synthetic */ void onRepeatModeChanged(int i10) {
            f3.v(this, i10);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public void p(int i10) {
            StyledPlayerView.this.L();
            StyledPlayerView.this.O();
            StyledPlayerView.this.N();
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

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.m
        public void s(int i10) {
            StyledPlayerView.this.M();
        }

        @Override // com.google.android.exoplayer2.c3.h
        public void t(List<com.google.android.exoplayer2.text.b> list) {
            if (StyledPlayerView.this.f50630h != null) {
                StyledPlayerView.this.f50630h.setCues(list);
            }
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

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public StyledPlayerView(Context context) {
        this(context, null);
    }

    public StyledPlayerView(Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StyledPlayerView(Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        int i11;
        boolean z10;
        int i12;
        boolean z11;
        int integer;
        boolean z12;
        int i13;
        int i14;
        boolean z13;
        boolean z14;
        int i15;
        boolean z15;
        boolean z16;
        boolean z17;
        int i16;
        boolean z18;
        super(context, attributeSet, i10);
        a aVar = new a();
        this.f50624b = aVar;
        if (isInEditMode()) {
            this.f50625c = null;
            this.f50626d = null;
            this.f50627e = null;
            this.f50628f = false;
            this.f50629g = null;
            this.f50630h = null;
            this.f50631i = null;
            this.f50632j = null;
            this.f50633k = null;
            this.f50634l = null;
            this.f50635m = null;
            ImageView imageView = new ImageView(context);
            if (com.google.android.exoplayer2.util.u0.f51536a >= 23) {
                r(getResources(), imageView);
            } else {
                q(getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        int i17 = R.layout.exo_styled_player_view;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.f50560m, i10, 0);
            try {
                int i18 = R.styleable.StyledPlayerView_shutter_background_color;
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i18);
                int color = typedArrayObtainStyledAttributes.getColor(i18, 0);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.StyledPlayerView_player_layout_id, i17);
                boolean z19 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.StyledPlayerView_use_artwork, true);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.StyledPlayerView_default_artwork, 0);
                boolean z20 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.StyledPlayerView_use_controller, true);
                int i19 = typedArrayObtainStyledAttributes.getInt(R.styleable.StyledPlayerView_surface_type, 1);
                int i20 = typedArrayObtainStyledAttributes.getInt(R.styleable.StyledPlayerView_resize_mode, 0);
                int i21 = typedArrayObtainStyledAttributes.getInt(R.styleable.StyledPlayerView_show_timeout, 5000);
                boolean z21 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.StyledPlayerView_hide_on_touch, true);
                boolean z22 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.StyledPlayerView_auto_show, true);
                integer = typedArrayObtainStyledAttributes.getInteger(R.styleable.StyledPlayerView_show_buffering, 0);
                this.f50642t = typedArrayObtainStyledAttributes.getBoolean(R.styleable.StyledPlayerView_keep_content_on_player_reset, this.f50642t);
                boolean z23 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.StyledPlayerView_hide_during_ads, true);
                typedArrayObtainStyledAttributes.recycle();
                z12 = z21;
                z10 = z22;
                i12 = i20;
                z15 = z20;
                i15 = resourceId2;
                z14 = z19;
                z13 = zHasValue;
                i14 = color;
                i13 = i19;
                i17 = resourceId;
                i11 = i21;
                z11 = z23;
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            i11 = 5000;
            z10 = true;
            i12 = 0;
            z11 = true;
            integer = 0;
            z12 = true;
            i13 = 1;
            i14 = 0;
            z13 = false;
            z14 = true;
            i15 = 0;
            z15 = true;
        }
        LayoutInflater.from(context).inflate(i17, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.exo_content_frame);
        this.f50625c = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            E(aspectRatioFrameLayout, i12);
        }
        View viewFindViewById = findViewById(R.id.exo_shutter);
        this.f50626d = viewFindViewById;
        if (viewFindViewById != null && z13) {
            viewFindViewById.setBackgroundColor(i14);
        }
        if (aspectRatioFrameLayout == null || i13 == 0) {
            z16 = true;
            this.f50627e = null;
            z17 = false;
        } else {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i13 != 2) {
                if (i13 != 3) {
                    if (i13 != 4) {
                        this.f50627e = new SurfaceView(context);
                    } else {
                        try {
                            this.f50627e = (View) Class.forName("com.google.android.exoplayer2.video.VideoDecoderGLSurfaceView").getConstructor(Context.class).newInstance(context);
                        } catch (Exception e10) {
                            throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e10);
                        }
                    }
                    z16 = true;
                } else {
                    try {
                        z16 = true;
                        this.f50627e = (View) Class.forName("com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView").getConstructor(Context.class).newInstance(context);
                        z18 = true;
                    } catch (Exception e11) {
                        throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e11);
                    }
                }
                this.f50627e.setLayoutParams(layoutParams);
                this.f50627e.setOnClickListener(aVar);
                this.f50627e.setClickable(false);
                aspectRatioFrameLayout.addView(this.f50627e, 0);
                z17 = z18;
            } else {
                z16 = true;
                this.f50627e = new TextureView(context);
            }
            z18 = false;
            this.f50627e.setLayoutParams(layoutParams);
            this.f50627e.setOnClickListener(aVar);
            this.f50627e.setClickable(false);
            aspectRatioFrameLayout.addView(this.f50627e, 0);
            z17 = z18;
        }
        this.f50628f = z17;
        this.f50634l = (FrameLayout) findViewById(R.id.exo_ad_overlay);
        this.f50635m = (FrameLayout) findViewById(R.id.exo_overlay);
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_artwork);
        this.f50629g = imageView2;
        this.f50639q = (!z14 || imageView2 == null) ? false : z16;
        if (i15 != 0) {
            this.f50640r = androidx.core.content.d.i(getContext(), i15);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.exo_subtitles);
        this.f50630h = subtitleView;
        if (subtitleView != null) {
            subtitleView.setUserDefaultStyle();
            subtitleView.setUserDefaultTextSize();
        }
        View viewFindViewById2 = findViewById(R.id.exo_buffering);
        this.f50631i = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.f50641s = integer;
        TextView textView = (TextView) findViewById(R.id.exo_error_message);
        this.f50632j = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        int i22 = R.id.exo_controller;
        StyledPlayerControlView styledPlayerControlView = (StyledPlayerControlView) findViewById(i22);
        View viewFindViewById3 = findViewById(R.id.exo_controller_placeholder);
        if (styledPlayerControlView != null) {
            this.f50633k = styledPlayerControlView;
            i16 = 0;
        } else if (viewFindViewById3 != null) {
            i16 = 0;
            StyledPlayerControlView styledPlayerControlView2 = new StyledPlayerControlView(context, null, 0, attributeSet);
            this.f50633k = styledPlayerControlView2;
            styledPlayerControlView2.setId(i22);
            styledPlayerControlView2.setLayoutParams(viewFindViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(styledPlayerControlView2, iIndexOfChild);
        } else {
            i16 = 0;
            this.f50633k = null;
        }
        StyledPlayerControlView styledPlayerControlView3 = this.f50633k;
        this.f50645w = styledPlayerControlView3 != null ? i11 : i16;
        this.f50648z = z12;
        this.f50646x = z10;
        this.f50647y = z11;
        this.f50637o = (!z15 || styledPlayerControlView3 == null) ? i16 : z16;
        if (styledPlayerControlView3 != null) {
            styledPlayerControlView3.e0();
            this.f50633k.T(aVar);
        }
        M();
    }

    @mk.m({"artworkView"})
    private boolean C(m2 m2Var) {
        byte[] bArr = m2Var.f46603l;
        if (bArr == null) {
            return false;
        }
        return D(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
    }

    @mk.m({"artworkView"})
    private boolean D(@androidx.annotation.p0 Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                z(this.f50625c, intrinsicWidth / intrinsicHeight);
                this.f50629g.setImageDrawable(drawable);
                this.f50629g.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    private static void E(AspectRatioFrameLayout aspectRatioFrameLayout, int i10) {
        aspectRatioFrameLayout.setResizeMode(i10);
    }

    private boolean F() {
        c3 c3Var = this.f50636n;
        if (c3Var == null) {
            return true;
        }
        int playbackState = c3Var.getPlaybackState();
        return this.f50646x && !this.f50636n.w1().x() && (playbackState == 1 || playbackState == 4 || !((c3) com.google.android.exoplayer2.util.a.g(this.f50636n)).p0());
    }

    private void H(boolean z10) {
        if (R()) {
            this.f50633k.setShowTimeoutMs(z10 ? 0 : this.f50645w);
            this.f50633k.u0();
        }
    }

    public static void I(c3 c3Var, @androidx.annotation.p0 StyledPlayerView styledPlayerView, @androidx.annotation.p0 StyledPlayerView styledPlayerView2) {
        if (styledPlayerView == styledPlayerView2) {
            return;
        }
        if (styledPlayerView2 != null) {
            styledPlayerView2.setPlayer(c3Var);
        }
        if (styledPlayerView != null) {
            styledPlayerView.setPlayer(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean J() {
        if (R() && this.f50636n != null) {
            if (!this.f50633k.i0()) {
                y(true);
                return true;
            }
            if (this.f50648z) {
                this.f50633k.d0();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        c3 c3Var = this.f50636n;
        com.google.android.exoplayer2.video.a0 a0VarJ = c3Var != null ? c3Var.J() : com.google.android.exoplayer2.video.a0.f51706j;
        int i10 = a0VarJ.f51712b;
        int i11 = a0VarJ.f51713c;
        int i12 = a0VarJ.f51714d;
        float f10 = (i11 == 0 || i10 == 0) ? 0.0f : (i10 * a0VarJ.f51715e) / i11;
        View view = this.f50627e;
        if (view instanceof TextureView) {
            if (f10 > 0.0f && (i12 == 90 || i12 == 270)) {
                f10 = 1.0f / f10;
            }
            if (this.A != 0) {
                view.removeOnLayoutChangeListener(this.f50624b);
            }
            this.A = i12;
            if (i12 != 0) {
                this.f50627e.addOnLayoutChangeListener(this.f50624b);
            }
            o((TextureView) this.f50627e, this.A);
        }
        z(this.f50625c, this.f50628f ? 0.0f : f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L() {
        int i10;
        if (this.f50631i != null) {
            c3 c3Var = this.f50636n;
            boolean z10 = true;
            if (c3Var == null || c3Var.getPlaybackState() != 2 || ((i10 = this.f50641s) != 2 && (i10 != 1 || !this.f50636n.p0()))) {
                z10 = false;
            }
            this.f50631i.setVisibility(z10 ? 0 : 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M() {
        StyledPlayerControlView styledPlayerControlView = this.f50633k;
        if (styledPlayerControlView == null || !this.f50637o) {
            setContentDescription(null);
        } else if (styledPlayerControlView.i0()) {
            setContentDescription(this.f50648z ? getResources().getString(R.string.exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(R.string.exo_controls_show));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N() {
        if (x() && this.f50647y) {
            u();
        } else {
            y(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O() {
        com.google.android.exoplayer2.util.l<? super PlaybackException> lVar;
        TextView textView = this.f50632j;
        if (textView != null) {
            CharSequence charSequence = this.f50644v;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.f50632j.setVisibility(0);
                return;
            }
            c3 c3Var = this.f50636n;
            PlaybackException playbackExceptionB = c3Var != null ? c3Var.b() : null;
            if (playbackExceptionB == null || (lVar = this.f50643u) == null) {
                this.f50632j.setVisibility(8);
            } else {
                this.f50632j.setText((CharSequence) lVar.a(playbackExceptionB).second);
                this.f50632j.setVisibility(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P(boolean z10) {
        c3 c3Var = this.f50636n;
        if (c3Var == null || c3Var.v1().c().isEmpty()) {
            if (this.f50642t) {
                return;
            }
            t();
            p();
            return;
        }
        if (z10 && !this.f50642t) {
            p();
        }
        if (c3Var.v1().d(2)) {
            t();
            return;
        }
        p();
        if (Q() && (C(c3Var.j2()) || D(this.f50640r))) {
            return;
        }
        t();
    }

    @mk.e(expression = {"artworkView"}, result = true)
    private boolean Q() {
        if (!this.f50639q) {
            return false;
        }
        com.google.android.exoplayer2.util.a.k(this.f50629g);
        return true;
    }

    @mk.e(expression = {"controller"}, result = true)
    private boolean R() {
        if (!this.f50637o) {
            return false;
        }
        com.google.android.exoplayer2.util.a.k(this.f50633k);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void o(TextureView textureView, int i10) {
        Matrix matrix = new Matrix();
        float width = textureView.getWidth();
        float height = textureView.getHeight();
        if (width != 0.0f && height != 0.0f && i10 != 0) {
            float f10 = width / 2.0f;
            float f11 = height / 2.0f;
            matrix.postRotate(i10, f10, f11);
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f10, f11);
        }
        textureView.setTransform(matrix);
    }

    private void p() {
        View view = this.f50626d;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private static void q(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(R.drawable.exo_edit_mode_logo));
        imageView.setBackgroundColor(resources.getColor(R.color.exo_edit_mode_background_color));
    }

    @androidx.annotation.w0(23)
    private static void r(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(R.drawable.exo_edit_mode_logo, null));
        imageView.setBackgroundColor(resources.getColor(R.color.exo_edit_mode_background_color, null));
    }

    private void t() {
        ImageView imageView = this.f50629g;
        if (imageView != null) {
            imageView.setImageResource(android.R.color.transparent);
            this.f50629g.setVisibility(4);
        }
    }

    @SuppressLint({"InlinedApi"})
    private boolean w(int i10) {
        return i10 == 19 || i10 == 270 || i10 == 22 || i10 == 271 || i10 == 20 || i10 == 269 || i10 == 21 || i10 == 268 || i10 == 23;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean x() {
        c3 c3Var = this.f50636n;
        return c3Var != null && c3Var.O() && this.f50636n.p0();
    }

    private void y(boolean z10) {
        if (!(x() && this.f50647y) && R()) {
            boolean z11 = this.f50633k.i0() && this.f50633k.getShowTimeoutMs() <= 0;
            boolean zF = F();
            if (z10 || z11 || zF) {
                H(zF);
            }
        }
    }

    public void A() {
        View view = this.f50627e;
        if (view instanceof GLSurfaceView) {
            ((GLSurfaceView) view).onPause();
        }
    }

    public void B() {
        View view = this.f50627e;
        if (view instanceof GLSurfaceView) {
            ((GLSurfaceView) view).onResume();
        }
    }

    public void G() {
        H(F());
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        c3 c3Var = this.f50636n;
        if (c3Var != null && c3Var.O()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean zW = w(keyEvent.getKeyCode());
        if ((zW && R() && !this.f50633k.i0()) || s(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            y(true);
            return true;
        }
        if (!zW || !R()) {
            return false;
        }
        y(true);
        return false;
    }

    @Override // com.google.android.exoplayer2.ui.c
    public List<com.google.android.exoplayer2.ui.a> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f50635m;
        if (frameLayout != null) {
            arrayList.add(new com.google.android.exoplayer2.ui.a(frameLayout, 3, "Transparent overlay does not impact viewability"));
        }
        StyledPlayerControlView styledPlayerControlView = this.f50633k;
        if (styledPlayerControlView != null) {
            arrayList.add(new com.google.android.exoplayer2.ui.a(styledPlayerControlView, 0));
        }
        return ImmutableList.v(arrayList);
    }

    @Override // com.google.android.exoplayer2.ui.c
    public ViewGroup getAdViewGroup() {
        return (ViewGroup) com.google.android.exoplayer2.util.a.l(this.f50634l, "exo_ad_overlay must be present for ad playback");
    }

    public boolean getControllerAutoShow() {
        return this.f50646x;
    }

    public boolean getControllerHideOnTouch() {
        return this.f50648z;
    }

    public int getControllerShowTimeoutMs() {
        return this.f50645w;
    }

    @androidx.annotation.p0
    public Drawable getDefaultArtwork() {
        return this.f50640r;
    }

    @androidx.annotation.p0
    public FrameLayout getOverlayFrameLayout() {
        return this.f50635m;
    }

    @androidx.annotation.p0
    public c3 getPlayer() {
        return this.f50636n;
    }

    public int getResizeMode() {
        com.google.android.exoplayer2.util.a.k(this.f50625c);
        return this.f50625c.getResizeMode();
    }

    @androidx.annotation.p0
    public SubtitleView getSubtitleView() {
        return this.f50630h;
    }

    public boolean getUseArtwork() {
        return this.f50639q;
    }

    public boolean getUseController() {
        return this.f50637o;
    }

    @androidx.annotation.p0
    public View getVideoSurfaceView() {
        return this.f50627e;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!R() || this.f50636n == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.B = true;
            return true;
        }
        if (action != 1 || !this.B) {
            return false;
        }
        this.B = false;
        return performClick();
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!R() || this.f50636n == null) {
            return false;
        }
        y(true);
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        super.performClick();
        return J();
    }

    public boolean s(KeyEvent keyEvent) {
        return R() && this.f50633k.V(keyEvent);
    }

    public void setAspectRatioListener(@androidx.annotation.p0 AspectRatioFrameLayout.b bVar) {
        com.google.android.exoplayer2.util.a.k(this.f50625c);
        this.f50625c.setAspectRatioListener(bVar);
    }

    public void setControllerAutoShow(boolean z10) {
        this.f50646x = z10;
    }

    public void setControllerHideDuringAds(boolean z10) {
        this.f50647y = z10;
    }

    public void setControllerHideOnTouch(boolean z10) {
        com.google.android.exoplayer2.util.a.k(this.f50633k);
        this.f50648z = z10;
        M();
    }

    public void setControllerOnFullScreenModeChangedListener(@androidx.annotation.p0 StyledPlayerControlView.d dVar) {
        com.google.android.exoplayer2.util.a.k(this.f50633k);
        this.f50633k.setOnFullScreenModeChangedListener(dVar);
    }

    public void setControllerShowTimeoutMs(int i10) {
        com.google.android.exoplayer2.util.a.k(this.f50633k);
        this.f50645w = i10;
        if (this.f50633k.i0()) {
            G();
        }
    }

    public void setControllerVisibilityListener(@androidx.annotation.p0 StyledPlayerControlView.m mVar) {
        com.google.android.exoplayer2.util.a.k(this.f50633k);
        StyledPlayerControlView.m mVar2 = this.f50638p;
        if (mVar2 == mVar) {
            return;
        }
        if (mVar2 != null) {
            this.f50633k.p0(mVar2);
        }
        this.f50638p = mVar;
        if (mVar != null) {
            this.f50633k.T(mVar);
        }
    }

    public void setCustomErrorMessage(@androidx.annotation.p0 CharSequence charSequence) {
        com.google.android.exoplayer2.util.a.i(this.f50632j != null);
        this.f50644v = charSequence;
        O();
    }

    public void setDefaultArtwork(@androidx.annotation.p0 Drawable drawable) {
        if (this.f50640r != drawable) {
            this.f50640r = drawable;
            P(false);
        }
    }

    public void setErrorMessageProvider(@androidx.annotation.p0 com.google.android.exoplayer2.util.l<? super PlaybackException> lVar) {
        if (this.f50643u != lVar) {
            this.f50643u = lVar;
            O();
        }
    }

    public void setExtraAdGroupMarkers(@androidx.annotation.p0 long[] jArr, @androidx.annotation.p0 boolean[] zArr) {
        com.google.android.exoplayer2.util.a.k(this.f50633k);
        this.f50633k.setExtraAdGroupMarkers(jArr, zArr);
    }

    public void setKeepContentOnPlayerReset(boolean z10) {
        if (this.f50642t != z10) {
            this.f50642t = z10;
            P(false);
        }
    }

    public void setPlayer(@androidx.annotation.p0 c3 c3Var) {
        com.google.android.exoplayer2.util.a.i(Looper.myLooper() == Looper.getMainLooper());
        com.google.android.exoplayer2.util.a.a(c3Var == null || c3Var.x1() == Looper.getMainLooper());
        c3 c3Var2 = this.f50636n;
        if (c3Var2 == c3Var) {
            return;
        }
        if (c3Var2 != null) {
            c3Var2.U(this.f50624b);
            View view = this.f50627e;
            if (view instanceof TextureView) {
                c3Var2.v((TextureView) view);
            } else if (view instanceof SurfaceView) {
                c3Var2.M((SurfaceView) view);
            }
        }
        SubtitleView subtitleView = this.f50630h;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.f50636n = c3Var;
        if (R()) {
            this.f50633k.setPlayer(c3Var);
        }
        L();
        O();
        P(true);
        if (c3Var == null) {
            u();
            return;
        }
        if (c3Var.g0(27)) {
            View view2 = this.f50627e;
            if (view2 instanceof TextureView) {
                c3Var.F((TextureView) view2);
            } else if (view2 instanceof SurfaceView) {
                c3Var.m((SurfaceView) view2);
            }
            K();
        }
        if (this.f50630h != null && c3Var.g0(28)) {
            this.f50630h.setCues(c3Var.C());
        }
        c3Var.S1(this.f50624b);
        y(false);
    }

    public void setRepeatToggleModes(int i10) {
        com.google.android.exoplayer2.util.a.k(this.f50633k);
        this.f50633k.setRepeatToggleModes(i10);
    }

    public void setResizeMode(int i10) {
        com.google.android.exoplayer2.util.a.k(this.f50625c);
        this.f50625c.setResizeMode(i10);
    }

    public void setShowBuffering(int i10) {
        if (this.f50641s != i10) {
            this.f50641s = i10;
            L();
        }
    }

    public void setShowFastForwardButton(boolean z10) {
        com.google.android.exoplayer2.util.a.k(this.f50633k);
        this.f50633k.setShowFastForwardButton(z10);
    }

    public void setShowMultiWindowTimeBar(boolean z10) {
        com.google.android.exoplayer2.util.a.k(this.f50633k);
        this.f50633k.setShowMultiWindowTimeBar(z10);
    }

    public void setShowNextButton(boolean z10) {
        com.google.android.exoplayer2.util.a.k(this.f50633k);
        this.f50633k.setShowNextButton(z10);
    }

    public void setShowPreviousButton(boolean z10) {
        com.google.android.exoplayer2.util.a.k(this.f50633k);
        this.f50633k.setShowPreviousButton(z10);
    }

    public void setShowRewindButton(boolean z10) {
        com.google.android.exoplayer2.util.a.k(this.f50633k);
        this.f50633k.setShowRewindButton(z10);
    }

    public void setShowShuffleButton(boolean z10) {
        com.google.android.exoplayer2.util.a.k(this.f50633k);
        this.f50633k.setShowShuffleButton(z10);
    }

    public void setShowSubtitleButton(boolean z10) {
        com.google.android.exoplayer2.util.a.k(this.f50633k);
        this.f50633k.setShowSubtitleButton(z10);
    }

    public void setShowVrButton(boolean z10) {
        com.google.android.exoplayer2.util.a.k(this.f50633k);
        this.f50633k.setShowVrButton(z10);
    }

    public void setShutterBackgroundColor(int i10) {
        View view = this.f50626d;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    public void setUseArtwork(boolean z10) {
        com.google.android.exoplayer2.util.a.i((z10 && this.f50629g == null) ? false : true);
        if (this.f50639q != z10) {
            this.f50639q = z10;
            P(false);
        }
    }

    public void setUseController(boolean z10) {
        com.google.android.exoplayer2.util.a.i((z10 && this.f50633k == null) ? false : true);
        if (this.f50637o == z10) {
            return;
        }
        this.f50637o = z10;
        if (R()) {
            this.f50633k.setPlayer(this.f50636n);
        } else {
            StyledPlayerControlView styledPlayerControlView = this.f50633k;
            if (styledPlayerControlView != null) {
                styledPlayerControlView.d0();
                this.f50633k.setPlayer(null);
            }
        }
        M();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        View view = this.f50627e;
        if (view instanceof SurfaceView) {
            view.setVisibility(i10);
        }
    }

    public void u() {
        StyledPlayerControlView styledPlayerControlView = this.f50633k;
        if (styledPlayerControlView != null) {
            styledPlayerControlView.d0();
        }
    }

    public boolean v() {
        StyledPlayerControlView styledPlayerControlView = this.f50633k;
        return styledPlayerControlView != null && styledPlayerControlView.i0();
    }

    protected void z(@androidx.annotation.p0 AspectRatioFrameLayout aspectRatioFrameLayout, float f10) {
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f10);
        }
    }
}
