package com.max.hbcommon.component.bubble;

import android.R;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.d0;
import androidx.annotation.d1;
import androidx.annotation.i0;
import androidx.annotation.l;
import androidx.annotation.q;
import androidx.annotation.v;
import androidx.lifecycle.y;
import com.max.hbcustomview.RadiusLayout;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.z;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;

/* JADX INFO: compiled from: BubbleTipPopup.kt */
/* JADX INFO: loaded from: classes9.dex */
@t0({"SMAP\nBubbleTipPopup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BubbleTipPopup.kt\ncom/max/hbcommon/component/bubble/BubbleTipPopup\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,987:1\n1#2:988\n*E\n"})
public final class BubbleTipPopup implements PopupWindow.OnDismissListener, androidx.lifecycle.j {
    public static ChangeQuickRedirect changeQuickRedirect;
    private float A;
    private float B;
    private float C;
    private float D;
    private float E;
    private float F;
    private long G;
    private float H;
    private float I;
    private boolean J;
    private float K;
    private boolean L;
    private int M;
    private int N;
    private boolean O;
    private long P;

    @dl.d
    private d2.Companion Q;

    @dl.d
    private final q0 R;

    @dl.d
    private final ViewTreeObserver.OnGlobalLayoutListener S;

    @dl.d
    private final ViewTreeObserver.OnGlobalLayoutListener T;

    @dl.d
    private final ViewTreeObserver.OnGlobalLayoutListener U;

    @dl.d
    private final ViewTreeObserver.OnGlobalLayoutListener V;

    @dl.d
    private final ViewTreeObserver.OnGlobalLayoutListener W;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f67293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private Context f67294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private b f67295d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private View.OnClickListener f67296e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private c f67297f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final z f67298g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f67299h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f67300i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f67301j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f67302k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.e
    private View f67303l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.e
    private View f67304m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @d0
    private int f67305n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.e
    private CharSequence f67306o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f67307p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.e
    private View f67308q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f67309r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.e
    private ViewGroup f67310s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f67311t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.e
    private ImageView f67312u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.e
    private Drawable f67313v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f67314w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @dl.e
    private AnimatorSet f67315x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f67316y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f67317z;

    /* JADX INFO: compiled from: BubbleTipPopup.kt */
    @t0({"SMAP\nBubbleTipPopup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BubbleTipPopup.kt\ncom/max/hbcommon/component/bubble/BubbleTipPopup$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,987:1\n1#2:988\n*E\n"})
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;
        private long A;
        private int B;
        private float C;
        private int D;
        private int E;
        private float F;
        private float G;
        private boolean H;
        private float I;
        private int J;
        private int K;
        private boolean L;
        private long M;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private Context f67318a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f67319b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f67320c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f67321d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @dl.e
        private View f67322e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @d0
        private int f67323f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @dl.d
        private CharSequence f67324g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f67325h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @dl.e
        private View f67326i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f67327j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f67328k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private float f67329l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f67330m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @dl.e
        private Drawable f67331n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f67332o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private float f67333p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private float f67334q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private float f67335r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private float f67336s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private float f67337t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private float f67338u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private float f67339v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private float f67340w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        @dl.e
        private b f67341x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        @dl.e
        private View.OnClickListener f67342y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        @dl.e
        private c f67343z;

        public a(@dl.d Context context) {
            f0.p(context, "context");
            this.f67318a = context;
            this.f67319b = true;
            this.f67320c = true;
            this.f67323f = R.id.text1;
            this.f67324g = "";
            this.f67325h = 3;
            this.f67327j = 4;
            this.f67328k = 80;
            this.f67330m = true;
            this.f67335r = -1.0f;
            this.f67336s = -1.0f;
            this.f67337t = -1.0f;
            this.f67338u = -1.0f;
            this.f67339v = -1.0f;
            this.f67340w = -1.0f;
            this.J = -2;
            this.K = -2;
            this.M = 300L;
            this.H = !context.getPackageManager().hasSystemFeature("android.hardware.touchscreen");
        }

        private final void u1() throws IllegalArgumentException {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31241fl, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            if (this.f67318a == null) {
                throw new IllegalArgumentException("Context not specified.".toString());
            }
            if (this.f67326i == null) {
                throw new IllegalArgumentException("Anchor view not specified.".toString());
            }
        }

        @dl.e
        public final View A() {
            return this.f67326i;
        }

        @dl.d
        public final a A0(@q int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.f31448ol, new Class[]{Integer.TYPE}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            Context context = this.f67318a;
            f0.m(context);
            this.f67336s = context.getResources().getDimension(i10);
            return this;
        }

        public final boolean B() {
            return this.f67332o;
        }

        @dl.d
        public final a B0(float f10) {
            this.f67337t = f10;
            return this;
        }

        public final long C() {
            return this.A;
        }

        @dl.d
        public final a C0(@q int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.f31471pl, new Class[]{Integer.TYPE}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            Context context = this.f67318a;
            f0.m(context);
            this.f67337t = context.getResources().getDimension(i10);
            return this;
        }

        public final float D() {
            return this.f67340w;
        }

        @dl.d
        public final a D0(float f10) {
            this.f67338u = f10;
            return this;
        }

        public final int E() {
            return this.f67327j;
        }

        @dl.d
        public final a E0(@q int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.ql, new Class[]{Integer.TYPE}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            Context context = this.f67318a;
            f0.m(context);
            this.f67338u = context.getResources().getDimension(i10);
            return this;
        }

        @dl.e
        public final Drawable F() {
            return this.f67331n;
        }

        public final void F0(@dl.e View view) {
            this.f67326i = view;
        }

        public final float G() {
            return this.F;
        }

        public final void G0(boolean z10) {
            this.f67332o = z10;
        }

        public final float H() {
            return this.G;
        }

        public final void H0(long j10) {
            this.A = j10;
        }

        public final boolean I() {
            return this.L;
        }

        public final void I0(float f10) {
            this.f67340w = f10;
        }

        public final long J() {
            return this.M;
        }

        public final void J0(int i10) {
            this.f67327j = i10;
        }

        @dl.e
        public final View K() {
            return this.f67322e;
        }

        public final void K0(@dl.e Drawable drawable) {
            this.f67331n = drawable;
        }

        @dl.d
        public final Context L() {
            return this.f67318a;
        }

        public final void L0(float f10) {
            this.F = f10;
        }

        public final float M() {
            return this.I;
        }

        public final void M0(float f10) {
            this.G = f10;
        }

        public final boolean N() {
            return this.f67319b;
        }

        public final void N0(boolean z10) {
            this.L = z10;
        }

        public final boolean O() {
            return this.f67320c;
        }

        public final void O0(long j10) {
            this.M = j10;
        }

        public final boolean P() {
            return this.H;
        }

        public final void P0(@dl.e View view) {
            this.f67322e = view;
        }

        public final int Q() {
            return this.f67328k;
        }

        public final void Q0(@dl.d Context context) {
            if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.d.f31171cl, new Class[]{Context.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(context, "<set-?>");
            this.f67318a = context;
        }

        public final int R() {
            return this.K;
        }

        public final void R0(float f10) {
            this.I = f10;
        }

        public final float S() {
            return this.f67335r;
        }

        public final void S0(boolean z10) {
            this.f67319b = z10;
        }

        public final float T() {
            return this.f67329l;
        }

        public final void T0(boolean z10) {
            this.f67320c = z10;
        }

        public final float U() {
            return this.f67333p;
        }

        public final void U0(boolean z10) {
            this.H = z10;
        }

        public final float V() {
            return this.f67334q;
        }

        public final void V0(int i10) {
            this.f67328k = i10;
        }

        @dl.e
        public final View.OnClickListener W() {
            return this.f67342y;
        }

        public final void W0(int i10) {
            this.K = i10;
        }

        @dl.e
        public final b X() {
            return this.f67341x;
        }

        public final void X0(float f10) {
            this.f67335r = f10;
        }

        @dl.e
        public final c Y() {
            return this.f67343z;
        }

        public final void Y0(float f10) {
            this.f67329l = f10;
        }

        public final float Z() {
            return this.f67339v;
        }

        public final void Z0(float f10) {
            this.f67333p = f10;
        }

        @dl.d
        public final a a(int i10) {
            this.K = i10;
            return this;
        }

        public final float a0() {
            return this.f67336s;
        }

        public final void a1(float f10) {
            this.f67334q = f10;
        }

        @dl.d
        public final a b(int i10) {
            this.J = i10;
            return this;
        }

        public final float b0() {
            return this.f67337t;
        }

        public final void b1(@dl.e View.OnClickListener onClickListener) {
            this.f67342y = onClickListener;
        }

        @dl.d
        public final a c(@dl.e View view) {
            this.f67326i = view;
            return this;
        }

        public final float c0() {
            return this.f67338u;
        }

        public final void c1(@dl.e b bVar) {
            this.f67341x = bVar;
        }

        @dl.d
        @TargetApi(11)
        public final a d(boolean z10) {
            this.f67332o = z10;
            return this;
        }

        public final boolean d0() {
            return this.f67330m;
        }

        public final void d1(@dl.e c cVar) {
            this.f67343z = cVar;
        }

        @dl.d
        @TargetApi(11)
        public final a e(long j10) {
            this.A = j10;
            return this;
        }

        @dl.d
        public final CharSequence e0() {
            return this.f67324g;
        }

        public final void e1(float f10) {
            this.f67339v = f10;
        }

        @dl.d
        @TargetApi(11)
        public final a f(float f10) {
            this.f67340w = f10;
            return this;
        }

        public final int f0() {
            return this.f67325h;
        }

        public final void f1(float f10) {
            this.f67336s = f10;
        }

        @dl.d
        @TargetApi(11)
        public final a g(@q int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.f31379ll, new Class[]{Integer.TYPE}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            Context context = this.f67318a;
            f0.m(context);
            this.f67340w = context.getResources().getDimension(i10);
            return this;
        }

        public final int g0() {
            return this.f67323f;
        }

        public final void g1(float f10) {
            this.f67337t = f10;
        }

        @dl.d
        public final a h(@l int i10) {
            this.E = i10;
            return this;
        }

        public final int h0() {
            return this.J;
        }

        public final void h1(float f10) {
            this.f67338u = f10;
        }

        @dl.d
        public final a i(int i10) {
            this.f67327j = i10;
            return this;
        }

        @dl.d
        public final a i0(int i10) {
            this.f67328k = i10;
            return this;
        }

        public final void i1(boolean z10) {
            this.f67330m = z10;
        }

        @dl.d
        public final a j(@v int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.ul, new Class[]{Integer.TYPE}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            this.f67331n = androidx.core.content.d.i(this.f67318a, i10);
            return this;
        }

        @dl.d
        public final a j0(float f10) {
            this.f67335r = f10;
            return this;
        }

        public final void j1(@dl.d CharSequence charSequence) {
            if (PatchProxy.proxy(new Object[]{charSequence}, this, changeQuickRedirect, false, bb.c.d.f31195dl, new Class[]{CharSequence.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(charSequence, "<set-?>");
            this.f67324g = charSequence;
        }

        @dl.d
        public final a k(@dl.e Drawable drawable) {
            this.f67331n = drawable;
            return this;
        }

        @dl.d
        public final a k0(@q int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.sl, new Class[]{Integer.TYPE}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            Context context = this.f67318a;
            f0.m(context);
            this.f67335r = context.getResources().getDimension(i10);
            return this;
        }

        public final void k1(int i10) {
            this.f67325h = i10;
        }

        @dl.d
        public final a l(float f10) {
            this.F = f10;
            return this;
        }

        @dl.d
        public final a l0(float f10) {
            this.f67329l = f10;
            return this;
        }

        public final void l1(int i10) {
            this.f67323f = i10;
        }

        @dl.d
        public final a m(float f10) {
            this.G = f10;
            return this;
        }

        @dl.d
        public final a m0(@q int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.f31356kl, new Class[]{Integer.TYPE}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            Context context = this.f67318a;
            f0.m(context);
            this.f67329l = context.getResources().getDimension(i10);
            return this;
        }

        public final void m1(int i10) {
            this.J = i10;
        }

        @dl.d
        public final a n(boolean z10) {
            this.L = z10;
            return this;
        }

        @dl.d
        public final a n0(boolean z10) {
            this.f67321d = z10;
            return this;
        }

        @dl.d
        public final a n1(boolean z10) {
            this.f67330m = z10;
            return this;
        }

        @dl.d
        public final a o(long j10) {
            this.M = j10;
            return this;
        }

        @dl.d
        public final a o0(float f10) {
            this.f67333p = f10;
            return this;
        }

        @dl.d
        public final a o1(@d1 int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.f31333jl, new Class[]{Integer.TYPE}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            Context context = this.f67318a;
            f0.m(context);
            String string = context.getString(i10);
            f0.o(string, "getString(...)");
            this.f67324g = string;
            return this;
        }

        @dl.d
        public final a p(int i10) {
            this.B = i10;
            return this;
        }

        @dl.d
        public final a p0(float f10) {
            this.f67334q = f10;
            return this;
        }

        @dl.d
        public final a p1(@dl.d CharSequence text) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{text}, this, changeQuickRedirect, false, bb.c.d.f31309il, new Class[]{CharSequence.class}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            f0.p(text, "text");
            this.f67324g = text;
            return this;
        }

        @dl.d
        public final a q(@l int i10) {
            this.B = i10;
            return this;
        }

        @dl.d
        public final a q0(@dl.e View.OnClickListener onClickListener) {
            this.f67342y = onClickListener;
            return this;
        }

        @dl.d
        public final a q1(int i10) {
            this.D = i10;
            return this;
        }

        @dl.d
        public final BubbleTipPopup r() throws IllegalArgumentException {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31218el, new Class[0], BubbleTipPopup.class);
            if (patchProxyResultProxy.isSupported) {
                return (BubbleTipPopup) patchProxyResultProxy.result;
            }
            u1();
            if (this.B == 0) {
                this.B = androidx.core.content.d.f(this.f67318a, i.j());
            }
            if (this.C == 0.0f) {
                this.C = this.f67318a.getResources().getDimension(i.o());
            }
            if (this.D == 0) {
                this.D = androidx.core.content.d.f(this.f67318a, i.n());
            }
            if (this.f67322e == null) {
                TextView textView = new TextView(this.f67318a);
                textView.setTextSize(this.C);
                textView.setBackgroundColor(this.B);
                textView.setTextColor(this.D);
                this.f67322e = textView;
            }
            if (this.E == 0) {
                this.E = androidx.core.content.d.f(this.f67318a, i.g());
            }
            if (this.f67335r < 0.0f) {
                Context context = this.f67318a;
                f0.m(context);
                this.f67335r = context.getResources().getDimension(i.k());
            }
            if (this.f67336s < 0.0f) {
                Context context2 = this.f67318a;
                f0.m(context2);
                this.f67336s = context2.getResources().getDimension(i.l());
            }
            if (this.f67337t < 0.0f) {
                Context context3 = this.f67318a;
                f0.m(context3);
                this.f67337t = context3.getResources().getDimension(i.l());
            }
            if (this.f67338u < 0.0f) {
                Context context4 = this.f67318a;
                f0.m(context4);
                this.f67338u = context4.getResources().getDimension(i.l());
            }
            if (this.f67339v < 0.0f) {
                Context context5 = this.f67318a;
                f0.m(context5);
                this.f67339v = context5.getResources().getDimension(i.l());
            }
            if (this.f67340w < 0.0f) {
                Context context6 = this.f67318a;
                f0.m(context6);
                this.f67340w = context6.getResources().getDimension(i.f());
            }
            if (this.A == 0) {
                this.A = i.e();
            }
            if (this.f67330m) {
                if (this.f67327j == 4) {
                    this.f67327j = i.t(this.f67328k);
                }
                if (this.f67331n == null) {
                    this.f67331n = new com.max.hbcommon.component.bubble.a(this.E, this.f67327j);
                }
                if (this.G == 0.0f) {
                    Context context7 = this.f67318a;
                    f0.m(context7);
                    this.G = context7.getResources().getDimension(i.i());
                }
                if (this.F == 0.0f) {
                    Context context8 = this.f67318a;
                    f0.m(context8);
                    this.F = context8.getResources().getDimension(i.h());
                }
            }
            return new BubbleTipPopup(this);
        }

        @dl.d
        public final a r0(@dl.e b bVar) {
            this.f67341x = bVar;
            return this;
        }

        @dl.d
        public final a r1(int i10) {
            this.f67325h = i10;
            return this;
        }

        @dl.d
        public final a s(@i0 int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.f31287hl, new Class[]{Integer.TYPE}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            Context context = this.f67318a;
            f0.m(context);
            Object systemService = context.getSystemService("layout_inflater");
            f0.n(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
            this.f67322e = ((LayoutInflater) systemService).inflate(i10, (ViewGroup) null, false);
            this.f67323f = 0;
            return this;
        }

        @dl.d
        public final a s0(@dl.e c cVar) {
            this.f67343z = cVar;
            return this;
        }

        @dl.d
        public final a s1(float f10) {
            this.C = f10;
            return this;
        }

        @dl.d
        public final a t(@i0 int i10, @d0 int i11) {
            Object[] objArr = {new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.f31264gl, new Class[]{cls, cls}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            Context context = this.f67318a;
            f0.m(context);
            Object systemService = context.getSystemService("layout_inflater");
            f0.n(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
            this.f67322e = ((LayoutInflater) systemService).inflate(i10, (ViewGroup) null, false);
            this.f67323f = i11;
            return this;
        }

        @dl.d
        public final a t0(float f10) {
            this.f67338u = f10;
            this.f67339v = f10;
            this.f67336s = f10;
            this.f67337t = f10;
            return this;
        }

        @dl.d
        public final a t1(@q int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.tl, new Class[]{Integer.TYPE}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            Context context = this.f67318a;
            f0.m(context);
            this.C = context.getResources().getDimension(i10);
            return this;
        }

        @dl.d
        public final a u(@dl.e View view, @d0 int i10) {
            this.f67322e = view;
            this.f67323f = i10;
            return this;
        }

        @dl.d
        public final a u0(float f10, float f11, float f12, float f13) {
            this.f67338u = f11;
            this.f67339v = f13;
            this.f67336s = f10;
            this.f67337t = f12;
            return this;
        }

        @dl.d
        public final a v(@dl.e TextView textView) {
            this.f67322e = textView;
            this.f67323f = 0;
            return this;
        }

        @dl.d
        public final a v0(@q int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.f31402ml, new Class[]{Integer.TYPE}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            Context context = this.f67318a;
            f0.m(context);
            this.f67338u = context.getResources().getDimension(i10);
            this.f67339v = this.f67318a.getResources().getDimension(i10);
            this.f67336s = this.f67318a.getResources().getDimension(i10);
            this.f67337t = this.f67318a.getResources().getDimension(i10);
            return this;
        }

        @dl.d
        public final a w(float f10) {
            this.I = f10;
            return this;
        }

        @dl.d
        public final a w0(@q int i10, @q int i11, @q int i12, @q int i13) {
            Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.f31425nl, new Class[]{cls, cls, cls, cls}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            Context context = this.f67318a;
            f0.m(context);
            this.f67338u = context.getResources().getDimension(i11);
            this.f67339v = this.f67318a.getResources().getDimension(i13);
            this.f67336s = this.f67318a.getResources().getDimension(i10);
            this.f67337t = this.f67318a.getResources().getDimension(i12);
            return this;
        }

        @dl.d
        public final a x(boolean z10) {
            this.f67319b = z10;
            return this;
        }

        @dl.d
        public final a x0(float f10) {
            this.f67339v = f10;
            return this;
        }

        @dl.d
        public final a y(boolean z10) {
            this.f67320c = z10;
            return this;
        }

        @dl.d
        public final a y0(@q int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.rl, new Class[]{Integer.TYPE}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            Context context = this.f67318a;
            f0.m(context);
            this.f67339v = context.getResources().getDimension(i10);
            return this;
        }

        @dl.d
        public final a z(boolean z10) {
            this.H = z10;
            return this;
        }

        @dl.d
        public final a z0(float f10) {
            this.f67336s = f10;
            return this;
        }
    }

    /* JADX INFO: compiled from: BubbleTipPopup.kt */
    public interface b {
        void a(@dl.e BubbleTipPopup bubbleTipPopup);
    }

    /* JADX INFO: compiled from: BubbleTipPopup.kt */
    public interface c {
        void a(@dl.e BubbleTipPopup bubbleTipPopup);
    }

    /* JADX INFO: compiled from: BubbleTipPopup.kt */
    public static final class d implements ViewTreeObserver.OnGlobalLayoutListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            PopupWindow popupWindowW;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Dl, new Class[0], Void.TYPE).isSupported || (popupWindowW = BubbleTipPopup.w(BubbleTipPopup.this)) == null || BubbleTipPopup.this.L) {
                return;
            }
            View contentView = popupWindowW.getContentView();
            f0.o(contentView, "getContentView(...)");
            i.p(contentView, this);
            if (BubbleTipPopup.this.f67314w) {
                BubbleTipPopup.A(BubbleTipPopup.this);
            }
            popupWindowW.getContentView().requestLayout();
        }
    }

    /* JADX INFO: compiled from: BubbleTipPopup.kt */
    public static final class e implements ViewTreeObserver.OnGlobalLayoutListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            PopupWindow popupWindowW;
            float left;
            float top;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.El, new Class[0], Void.TYPE).isSupported || (popupWindowW = BubbleTipPopup.w(BubbleTipPopup.this)) == null || BubbleTipPopup.this.L) {
                return;
            }
            View contentView = popupWindowW.getContentView();
            f0.o(contentView, "getContentView(...)");
            i.p(contentView, this);
            popupWindowW.getContentView().getViewTreeObserver().addOnGlobalLayoutListener(BubbleTipPopup.this.V);
            popupWindowW.getContentView().getViewTreeObserver().addOnGlobalLayoutListener(BubbleTipPopup.this.U);
            if (BubbleTipPopup.this.f67311t) {
                View view = BubbleTipPopup.this.f67308q;
                f0.m(view);
                RectF rectFB = i.b(view);
                View view2 = BubbleTipPopup.this.f67304m;
                f0.m(view2);
                RectF rectFB2 = i.b(view2);
                if (BubbleTipPopup.this.f67300i == 1 || BubbleTipPopup.this.f67300i == 3) {
                    View view3 = BubbleTipPopup.this.f67304m;
                    f0.m(view3);
                    float paddingLeft = view3.getPaddingLeft() + ViewUtils.f(BubbleTipPopup.this.f67294c, 2.0f);
                    float fWidth = rectFB2.width() / 2.0f;
                    ImageView imageView = BubbleTipPopup.this.f67312u;
                    f0.m(imageView);
                    float width = (fWidth - (imageView.getWidth() / 2.0f)) - (rectFB2.centerX() - rectFB.centerX());
                    if (width > paddingLeft) {
                        ImageView imageView2 = BubbleTipPopup.this.f67312u;
                        f0.m(imageView2);
                        if (imageView2.getWidth() + width + paddingLeft > rectFB2.width()) {
                            float fWidth2 = rectFB2.width();
                            ImageView imageView3 = BubbleTipPopup.this.f67312u;
                            f0.m(imageView3);
                            width = (fWidth2 - imageView3.getWidth()) - paddingLeft;
                        }
                        left = width;
                    } else {
                        left = paddingLeft;
                    }
                    ImageView imageView4 = BubbleTipPopup.this.f67312u;
                    f0.m(imageView4);
                    top = (BubbleTipPopup.this.f67300i != 3 ? 1 : -1) + imageView4.getTop();
                } else {
                    View view4 = BubbleTipPopup.this.f67304m;
                    f0.m(view4);
                    top = view4.getPaddingTop() + ViewUtils.f(BubbleTipPopup.this.f67294c, 2.0f);
                    float fHeight = rectFB2.height() / 2.0f;
                    ImageView imageView5 = BubbleTipPopup.this.f67312u;
                    f0.m(imageView5);
                    float height = (fHeight - (imageView5.getHeight() / 2.0f)) - (rectFB2.centerY() - rectFB.centerY());
                    if (height > top) {
                        ImageView imageView6 = BubbleTipPopup.this.f67312u;
                        f0.m(imageView6);
                        if (imageView6.getHeight() + height + top > rectFB2.height()) {
                            float fHeight2 = rectFB2.height();
                            ImageView imageView7 = BubbleTipPopup.this.f67312u;
                            f0.m(imageView7);
                            top = (fHeight2 - imageView7.getHeight()) - top;
                        } else {
                            top = height;
                        }
                    }
                    ImageView imageView8 = BubbleTipPopup.this.f67312u;
                    f0.m(imageView8);
                    left = imageView8.getLeft() + (BubbleTipPopup.this.f67300i != 2 ? 1 : -1);
                }
                ImageView imageView9 = BubbleTipPopup.this.f67312u;
                f0.m(imageView9);
                i.r(imageView9, (int) left);
                ImageView imageView10 = BubbleTipPopup.this.f67312u;
                f0.m(imageView10);
                i.s(imageView10, (int) top);
            }
            popupWindowW.getContentView().requestLayout();
        }
    }

    /* JADX INFO: compiled from: BubbleTipPopup.kt */
    public static final class f implements ViewTreeObserver.OnGlobalLayoutListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Fl, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            PopupWindow popupWindowW = BubbleTipPopup.w(BubbleTipPopup.this);
            if (BubbleTipPopup.this.L) {
                return;
            }
            if (BubbleTipPopup.this.f67309r > 0.0f) {
                View view = BubbleTipPopup.this.f67303l;
                f0.m(view);
                if (view.getWidth() > BubbleTipPopup.this.f67309r) {
                    View view2 = BubbleTipPopup.this.f67303l;
                    f0.m(view2);
                    i.q(view2, BubbleTipPopup.this.f67309r);
                    popupWindowW.update(-2, -2);
                    return;
                }
            }
            View contentView = popupWindowW.getContentView();
            f0.o(contentView, "getContentView(...)");
            i.p(contentView, this);
            popupWindowW.getContentView().getViewTreeObserver().addOnGlobalLayoutListener(BubbleTipPopup.this.T);
            PointF pointFG = BubbleTipPopup.g(BubbleTipPopup.this);
            popupWindowW.setClippingEnabled(true);
            popupWindowW.update((int) pointFG.x, (int) pointFG.y, popupWindowW.getWidth(), popupWindowW.getHeight());
            popupWindowW.getContentView().requestLayout();
        }
    }

    /* JADX INFO: compiled from: BubbleTipPopup.kt */
    public static final class g implements ViewTreeObserver.OnGlobalLayoutListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            PopupWindow popupWindowW;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Il, new Class[0], Void.TYPE).isSupported || (popupWindowW = BubbleTipPopup.w(BubbleTipPopup.this)) == null || BubbleTipPopup.this.L) {
                return;
            }
            View contentView = popupWindowW.getContentView();
            f0.o(contentView, "getContentView(...)");
            i.p(contentView, this);
            if (BubbleTipPopup.this.f67297f != null) {
                c cVar = BubbleTipPopup.this.f67297f;
                f0.m(cVar);
                cVar.a(BubbleTipPopup.this);
            }
            BubbleTipPopup.this.f67297f = null;
            View view = BubbleTipPopup.this.f67304m;
            f0.m(view);
            view.setVisibility(0);
        }
    }

    public BubbleTipPopup(@dl.d a builder) {
        f0.p(builder, "builder");
        this.f67293b = BubbleTipPopup.class.getSimpleName();
        this.f67294c = builder.L();
        this.f67295d = builder.X();
        this.f67296e = builder.W();
        this.f67297f = builder.Y();
        this.f67298g = b0.c(new yh.a<PopupWindow>() { // from class: com.max.hbcommon.component.bubble.BubbleTipPopup$mPopupWindow$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @dl.d
            public final PopupWindow a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Gl, new Class[0], PopupWindow.class);
                return patchProxyResultProxy.isSupported ? (PopupWindow) patchProxyResultProxy.result : new PopupWindow(this.f67353b.f67294c, (AttributeSet) null, i.m());
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.PopupWindow, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ PopupWindow invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Hl, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        this.f67299h = builder.Q();
        this.f67300i = builder.E();
        this.f67301j = builder.N();
        this.f67302k = builder.O();
        this.f67303l = builder.K();
        this.f67305n = builder.g0();
        this.f67306o = builder.e0();
        this.f67307p = builder.f0();
        this.f67308q = builder.A();
        this.f67309r = builder.T();
        this.f67310s = i.d(this.f67308q);
        this.f67311t = builder.d0();
        this.f67313v = builder.F();
        this.f67314w = builder.B();
        this.f67316y = builder.U();
        this.f67317z = builder.V();
        this.A = builder.S();
        this.B = builder.a0();
        this.C = builder.b0();
        this.D = builder.c0();
        this.E = builder.Z();
        this.F = builder.D();
        this.G = builder.C();
        this.H = builder.H();
        this.I = builder.G();
        this.J = builder.P();
        this.K = builder.M();
        this.M = builder.h0();
        this.N = builder.R();
        this.O = builder.I();
        this.P = builder.J();
        this.Q = d2.INSTANCE;
        this.R = r0.b();
        E();
        C();
        this.S = new f();
        this.T = new e();
        this.U = new g();
        this.V = new d();
        this.W = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.max.hbcommon.component.bubble.e
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                BubbleTipPopup.M(this.f67384b);
            }
        };
    }

    public static final /* synthetic */ void A(BubbleTipPopup bubbleTipPopup) {
        if (PatchProxy.proxy(new Object[]{bubbleTipPopup}, null, changeQuickRedirect, true, bb.c.d.f31148bl, new Class[]{BubbleTipPopup.class}, Void.TYPE).isSupported) {
            return;
        }
        bubbleTipPopup.Q();
    }

    private final PointF B() {
        Display defaultDisplay;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Mk, new Class[0], PointF.class);
        if (patchProxyResultProxy.isSupported) {
            return (PointF) patchProxyResultProxy.result;
        }
        PointF pointF = new PointF();
        View view = this.f67308q;
        f0.m(view);
        RectF rectFA = i.a(view);
        PointF pointF2 = new PointF(rectFA.centerX(), rectFA.centerY());
        int i10 = this.f67299h;
        if (i10 == 17) {
            float f10 = pointF2.x;
            PopupWindow popupWindowJ = J();
            f0.m(popupWindowJ);
            pointF.x = f10 - (popupWindowJ.getContentView().getWidth() / 2.0f);
            float f11 = pointF2.y;
            PopupWindow popupWindowJ2 = J();
            f0.m(popupWindowJ2);
            pointF.y = f11 - (popupWindowJ2.getContentView().getHeight() / 2.0f);
        } else if (i10 == 48) {
            float f12 = pointF2.x;
            PopupWindow popupWindowJ3 = J();
            f0.m(popupWindowJ3);
            pointF.x = f12 - (popupWindowJ3.getContentView().getWidth() / 2.0f);
            float f13 = rectFA.top;
            PopupWindow popupWindowJ4 = J();
            f0.m(popupWindowJ4);
            pointF.y = (f13 - popupWindowJ4.getContentView().getHeight()) - this.A;
        } else if (i10 == 80) {
            float f14 = pointF2.x;
            PopupWindow popupWindowJ5 = J();
            f0.m(popupWindowJ5);
            pointF.x = f14 - (popupWindowJ5.getContentView().getWidth() / 2.0f);
            pointF.y = rectFA.bottom + this.A;
        } else if (i10 == 8388611) {
            float f15 = rectFA.left;
            PopupWindow popupWindowJ6 = J();
            f0.m(popupWindowJ6);
            pointF.x = (f15 - popupWindowJ6.getContentView().getWidth()) - this.A;
            float f16 = pointF2.y;
            PopupWindow popupWindowJ7 = J();
            f0.m(popupWindowJ7);
            pointF.y = f16 - (popupWindowJ7.getContentView().getHeight() / 2.0f);
        } else {
            if (i10 != 8388613) {
                throw new IllegalArgumentException("Gravity must have be CENTER, START, END, TOP or BOTTOM.");
            }
            pointF.x = rectFA.right + this.A;
            float f17 = pointF2.y;
            PopupWindow popupWindowJ8 = J();
            f0.m(popupWindowJ8);
            pointF.y = f17 - (popupWindowJ8.getContentView().getHeight() / 2.0f);
        }
        pointF.x += this.f67316y;
        pointF.y += this.f67317z;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (Build.VERSION.SDK_INT >= 30) {
            Context context = this.f67294c;
            f0.m(context);
            defaultDisplay = context.getDisplay();
        } else {
            Context context2 = this.f67294c;
            f0.m(context2);
            Object systemService = context2.getSystemService("window");
            f0.n(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        }
        f0.m(defaultDisplay);
        defaultDisplay.getMetrics(displayMetrics);
        float f18 = pointF.x;
        int width = defaultDisplay.getWidth();
        PopupWindow popupWindowJ9 = J();
        f0.m(popupWindowJ9);
        float fMin = Math.min(f18, (width - popupWindowJ9.getContentView().getWidth()) - ViewUtils.f(this.f67294c, 4.0f));
        pointF.x = fMin;
        pointF.x = Math.max(fMin, ViewUtils.f(this.f67294c, 4.0f));
        float f19 = pointF.y;
        int height = defaultDisplay.getHeight();
        PopupWindow popupWindowJ10 = J();
        f0.m(popupWindowJ10);
        float fMin2 = Math.min(f19, (height - popupWindowJ10.getContentView().getHeight()) - ViewUtils.f(this.f67294c, 2.0f));
        pointF.y = fMin2;
        pointF.y = Math.max(fMin2, ViewUtils.f(this.f67294c, 2.0f));
        return pointF;
    }

    private final void C() {
        TextView textView;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Nk, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View view = this.f67303l;
        if (view instanceof TextView) {
            textView = (TextView) view;
        } else {
            textView = (TextView) (view != null ? view.findViewById(this.f67305n) : null);
        }
        if (textView != null) {
            textView.setText(this.f67306o);
            textView.setGravity(this.f67307p);
        }
        View view2 = this.f67303l;
        f0.m(view2);
        view2.setPadding((int) this.B, (int) this.D, (int) this.C, (int) this.E);
        if (this.K > 0.0f) {
            View view3 = this.f67303l;
            Context context = this.f67294c;
            f0.m(context);
            RadiusLayout radiusLayout = new RadiusLayout(context, null, 0, 6, null);
            radiusLayout.setRadius(this.K);
            radiusLayout.addView(view3);
            this.f67303l = radiusLayout;
        }
        LinearLayout linearLayout = new LinearLayout(this.f67294c);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        int i10 = this.f67300i;
        linearLayout.setOrientation((i10 == 0 || i10 == 2) ? 0 : 1);
        int iIntValue = (this.f67314w ? Float.valueOf(this.F) : 0).intValue();
        linearLayout.setPadding(iIntValue, iIntValue, iIntValue, iIntValue);
        if (this.f67311t) {
            ImageView imageView = new ImageView(this.f67294c);
            this.f67312u = imageView;
            f0.m(imageView);
            imageView.setImageDrawable(this.f67313v);
            int i11 = this.f67300i;
            LinearLayout.LayoutParams layoutParams = (i11 == 1 || i11 == 3) ? new LinearLayout.LayoutParams((int) this.H, (int) this.I, 0.0f) : new LinearLayout.LayoutParams((int) this.I, (int) this.H, 0.0f);
            layoutParams.gravity = 17;
            ImageView imageView2 = this.f67312u;
            f0.m(imageView2);
            imageView2.setLayoutParams(layoutParams);
            int i12 = this.f67300i;
            if (i12 == 3 || i12 == 2) {
                linearLayout.addView(this.f67303l);
                linearLayout.addView(this.f67312u);
            } else {
                linearLayout.addView(this.f67312u);
                linearLayout.addView(this.f67303l);
            }
        } else {
            linearLayout.addView(this.f67303l);
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(this.M, this.N, 0.0f);
        layoutParams2.gravity = 17;
        View view4 = this.f67303l;
        f0.m(view4);
        view4.setLayoutParams(layoutParams2);
        this.f67304m = linearLayout;
        linearLayout.setVisibility(4);
        if (this.J) {
            View view5 = this.f67304m;
            if (view5 != null) {
                view5.setFocusableInTouchMode(true);
            }
            View view6 = this.f67304m;
            if (view6 != null) {
                view6.setOnKeyListener(new View.OnKeyListener() { // from class: com.max.hbcommon.component.bubble.g
                    @Override // android.view.View.OnKeyListener
                    public final boolean onKey(View view7, int i13, KeyEvent keyEvent) {
                        return BubbleTipPopup.D(this.f67386b, view7, i13, keyEvent);
                    }
                });
            }
        }
        J().setContentView(this.f67304m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean D(BubbleTipPopup this$0, View view, int i10, KeyEvent keyEvent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{this$0, view, new Integer(i10), keyEvent}, null, changeQuickRedirect, true, bb.c.d.Xk, new Class[]{BubbleTipPopup.class, View.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(this$0, "this$0");
        if (keyEvent.getAction() != 1 || (i10 != 23 && i10 != 62 && i10 != 66 && i10 != 160)) {
            return false;
        }
        this$0.G();
        return true;
    }

    private final void E() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Hk, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        J().setOnDismissListener(this);
        J().setWidth(this.M);
        J().setHeight(this.N);
        J().setBackgroundDrawable(new ColorDrawable(0));
        J().setOutsideTouchable(true);
        J().setTouchable(true);
        J().setTouchInterceptor(new View.OnTouchListener() { // from class: com.max.hbcommon.component.bubble.f
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return BubbleTipPopup.F(this.f67385b, view, motionEvent);
            }
        });
        J().setClippingEnabled(false);
        J().setFocusable(this.J);
        Object obj = this.f67294c;
        if (obj instanceof y) {
            f0.n(obj, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
            ((y) obj).getLifecycle().a(this);
        }
        J().setAnimationStyle(com.max.hbcommon.R.style.dialogWindowAnim);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0064, code lost:
    
        if (r0 >= r11.getMeasuredHeight()) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean F(com.max.hbcommon.component.bubble.BubbleTipPopup r10, android.view.View r11, android.view.MotionEvent r12) {
        /*
            r0 = 3
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r8 = 0
            r1[r8] = r10
            r9 = 1
            r1[r9] = r11
            r11 = 2
            r1[r11] = r12
            com.meituan.robust.ChangeQuickRedirect r3 = com.max.hbcommon.component.bubble.BubbleTipPopup.changeQuickRedirect
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<com.max.hbcommon.component.bubble.BubbleTipPopup> r0 = com.max.hbcommon.component.bubble.BubbleTipPopup.class
            r6[r8] = r0
            java.lang.Class<android.view.View> r0 = android.view.View.class
            r6[r9] = r0
            java.lang.Class<android.view.MotionEvent> r0 = android.view.MotionEvent.class
            r6[r11] = r0
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r2 = 0
            r4 = 1
            r5 = 3168(0xc60, float:4.44E-42)
            com.meituan.robust.PatchProxyResult r11 = com.meituan.robust.PatchProxy.proxy(r1, r2, r3, r4, r5, r6, r7)
            boolean r0 = r11.isSupported
            if (r0 == 0) goto L33
            java.lang.Object r10 = r11.result
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            return r10
        L33:
            java.lang.String r11 = "this$0"
            kotlin.jvm.internal.f0.p(r10, r11)
            float r11 = r12.getX()
            int r11 = (int) r11
            float r0 = r12.getY()
            int r0 = (int) r0
            boolean r1 = r10.f67302k
            if (r1 != 0) goto L67
            int r1 = r12.getAction()
            if (r1 != 0) goto L67
            if (r11 < 0) goto L66
            android.view.View r1 = r10.f67304m
            kotlin.jvm.internal.f0.m(r1)
            int r1 = r1.getMeasuredWidth()
            if (r11 >= r1) goto L66
            if (r0 < 0) goto L66
            android.view.View r11 = r10.f67304m
            kotlin.jvm.internal.f0.m(r11)
            int r11 = r11.getMeasuredHeight()
            if (r0 < r11) goto L67
        L66:
            return r9
        L67:
            boolean r11 = r10.f67302k
            if (r11 != 0) goto L73
            int r11 = r12.getAction()
            r0 = 4
            if (r11 != r0) goto L73
            return r9
        L73:
            int r11 = r12.getAction()
            if (r11 != 0) goto L8a
            boolean r11 = r10.f67301j
            if (r11 == 0) goto L8a
            android.view.View$OnClickListener r11 = r10.f67296e
            if (r11 == 0) goto L86
            android.view.View r12 = r10.f67304m
            r11.onClick(r12)
        L86:
            r10.G()
            return r9
        L8a:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.max.hbcommon.component.bubble.BubbleTipPopup.F(com.max.hbcommon.component.bubble.BubbleTipPopup, android.view.View, android.view.MotionEvent):boolean");
    }

    private final void H(long j10) {
        if (PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, bb.c.d.Uk, new Class[]{Long.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        kotlinx.coroutines.k.f(this.R, null, null, new BubbleTipPopup$dismissAnimation$1(j10, this, null), 3, null);
    }

    private final PopupWindow J() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Gk, new Class[0], PopupWindow.class);
        return patchProxyResultProxy.isSupported ? (PopupWindow) patchProxyResultProxy.result : (PopupWindow) this.f67298g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(BubbleTipPopup this$0) {
        if (PatchProxy.proxy(new Object[]{this$0}, null, changeQuickRedirect, true, bb.c.d.Yk, new Class[]{BubbleTipPopup.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        if (this$0.J() == null || this$0.L) {
            return;
        }
        ViewGroup viewGroup = this$0.f67310s;
        f0.m(viewGroup);
        if (viewGroup.isShown()) {
            return;
        }
        this$0.G();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(ViewGroup it, BubbleTipPopup this$0) {
        if (PatchProxy.proxy(new Object[]{it, this$0}, null, changeQuickRedirect, true, bb.c.d.Wk, new Class[]{ViewGroup.class, BubbleTipPopup.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(it, "$it");
        f0.p(this$0, "this$0");
        if (!it.isShown()) {
            com.max.hbcommon.utils.d.d(this$0.f67293b, "Tooltip cannot be shown, root view is invalid or has been closed.");
            return;
        }
        PopupWindow popupWindowJ = this$0.J();
        ViewGroup viewGroup = this$0.f67310s;
        f0.m(viewGroup);
        int width = viewGroup.getWidth();
        ViewGroup viewGroup2 = this$0.f67310s;
        f0.m(viewGroup2);
        popupWindowJ.showAtLocation(viewGroup, 0, width, viewGroup2.getHeight());
        if (this$0.J) {
            View view = this$0.f67304m;
            f0.m(view);
            view.requestFocus();
        }
    }

    private final void Q() {
        View view;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Sk, new Class[0], Void.TYPE).isSupported || (view = this.f67304m) == null) {
            return;
        }
        int i10 = this.f67299h;
        String str = (i10 == 48 || i10 == 80) ? "translationY" : "translationX";
        this.f67315x = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, str, 0.0f, -this.F, 0.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f, 1.0f);
        objectAnimatorOfFloat.setRepeatCount(-1);
        AnimatorSet animatorSet = this.f67315x;
        f0.m(animatorSet);
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        AnimatorSet animatorSet2 = this.f67315x;
        f0.m(animatorSet2);
        animatorSet2.setDuration(this.G);
        AnimatorSet animatorSet3 = this.f67315x;
        f0.m(animatorSet3);
        animatorSet3.setInterpolator(new AccelerateDecelerateInterpolator());
        AnimatorSet animatorSet4 = this.f67315x;
        f0.m(animatorSet4);
        animatorSet4.start();
    }

    private final void R() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Lk, new Class[0], Void.TYPE).isSupported && !(!this.L)) {
            throw new IllegalArgumentException("Tooltip has been dismissed.".toString());
        }
    }

    public static final /* synthetic */ PointF g(BubbleTipPopup bubbleTipPopup) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bubbleTipPopup}, null, changeQuickRedirect, true, bb.c.d.f31125al, new Class[]{BubbleTipPopup.class}, PointF.class);
        return patchProxyResultProxy.isSupported ? (PointF) patchProxyResultProxy.result : bubbleTipPopup.B();
    }

    public static final /* synthetic */ PopupWindow w(BubbleTipPopup bubbleTipPopup) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bubbleTipPopup}, null, changeQuickRedirect, true, bb.c.d.Zk, new Class[]{BubbleTipPopup.class}, PopupWindow.class);
        return patchProxyResultProxy.isSupported ? (PopupWindow) patchProxyResultProxy.result : bubbleTipPopup.J();
    }

    public final void G() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Ok, new Class[0], Void.TYPE).isSupported || this.L) {
            return;
        }
        this.L = true;
        J().dismiss();
    }

    public final <T extends View> T I(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.Qk, new Class[]{Integer.TYPE}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (T) patchProxyResultProxy.result;
        }
        View view = this.f67304m;
        f0.m(view);
        return (T) view.findViewById(i10);
    }

    @dl.d
    public final PopupWindow K() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Ik, new Class[0], PopupWindow.class);
        return patchProxyResultProxy.isSupported ? (PopupWindow) patchProxyResultProxy.result : J();
    }

    public final boolean L() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Pk, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : J().isShowing();
    }

    public final void N(float f10) {
        View view;
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.d.Tk, new Class[]{Float.TYPE}, Void.TYPE).isSupported || (view = this.f67304m) == null) {
            return;
        }
        view.setAlpha(f10);
    }

    public final void O() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Jk, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        R();
        View view = this.f67304m;
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this.S);
            view.getViewTreeObserver().addOnGlobalLayoutListener(this.W);
        }
        final ViewGroup viewGroup = this.f67310s;
        if (viewGroup != null) {
            viewGroup.post(new Runnable() { // from class: com.max.hbcommon.component.bubble.h
                @Override // java.lang.Runnable
                public final void run() {
                    BubbleTipPopup.P(viewGroup, this);
                }
            });
        }
        if (this.O) {
            H(this.P);
        }
    }

    @Override // androidx.lifecycle.j
    public /* synthetic */ void j(y yVar) {
        androidx.lifecycle.i.d(this, yVar);
    }

    @Override // androidx.lifecycle.j
    public /* synthetic */ void l(y yVar) {
        androidx.lifecycle.i.c(this, yVar);
    }

    @Override // androidx.lifecycle.j
    public void onDestroy(@dl.d y owner) {
        if (PatchProxy.proxy(new Object[]{owner}, this, changeQuickRedirect, false, bb.c.d.Kk, new Class[]{y.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(owner, "owner");
        androidx.lifecycle.i.b(this, owner);
        G();
        r0.f(this.R, null, 1, null);
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Rk, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.L = true;
        AnimatorSet animatorSet = this.f67315x;
        if (animatorSet != null) {
            f0.m(animatorSet);
            animatorSet.removeAllListeners();
            AnimatorSet animatorSet2 = this.f67315x;
            f0.m(animatorSet2);
            animatorSet2.end();
            AnimatorSet animatorSet3 = this.f67315x;
            f0.m(animatorSet3);
            animatorSet3.cancel();
            this.f67315x = null;
        }
        this.f67310s = null;
        b bVar = this.f67295d;
        if (bVar != null) {
            f0.m(bVar);
            bVar.a(this);
        }
        this.f67295d = null;
        View contentView = J().getContentView();
        f0.o(contentView, "getContentView(...)");
        i.p(contentView, this.S);
        View contentView2 = J().getContentView();
        f0.o(contentView2, "getContentView(...)");
        i.p(contentView2, this.T);
        View contentView3 = J().getContentView();
        f0.o(contentView3, "getContentView(...)");
        i.p(contentView3, this.U);
        View contentView4 = J().getContentView();
        f0.o(contentView4, "getContentView(...)");
        i.p(contentView4, this.V);
        View contentView5 = J().getContentView();
        f0.o(contentView5, "getContentView(...)");
        i.p(contentView5, this.W);
    }

    @Override // androidx.lifecycle.j
    public /* synthetic */ void onStart(y yVar) {
        androidx.lifecycle.i.e(this, yVar);
    }

    @Override // androidx.lifecycle.j
    public /* synthetic */ void onStop(y yVar) {
        androidx.lifecycle.i.f(this, yVar);
    }

    @Override // androidx.lifecycle.j
    public /* synthetic */ void q(y yVar) {
        androidx.lifecycle.i.a(this, yVar);
    }
}
