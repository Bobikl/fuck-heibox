package com.max.hbcustomview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.d0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.r;
import androidx.annotation.v;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.b1;
import androidx.core.util.n;
import androidx.core.view.d1;
import androidx.core.view.j1;
import androidx.core.widget.q;
import androidx.viewpager.widget.ViewPager;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
@ViewPager.e
public class EZTabLayout extends HorizontalScrollView {

    @r(unit = 0)
    private static final int K = 44;

    @r(unit = 0)
    private static final int L = 56;

    @r(unit = 0)
    private static final int M = 24;

    @r(unit = 0)
    private static final int N = 20;

    @r(unit = 0)
    private static final int O = 6;

    @r(unit = 0)
    private static final int P = 16;

    @r(unit = 0)
    private static final int Q = 20;

    @r(unit = 0)
    private static final int R = 12;

    @r(unit = 0)
    private static final int S = 11;

    @r(unit = 0)
    private static final int T = 4;
    private static int U = -10196626;
    private static int V = -15460066;
    private static final int W = -1;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final int f68400a0 = 250;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final n.a<c> f68401b0 = new n.c(16);
    public static ChangeQuickRedirect changeQuickRedirect;
    private b A;
    private ValueAnimator B;
    ViewPager C;
    private androidx.viewpager.widget.a D;
    private DataSetObserver E;
    private f F;
    private e G;
    private boolean H;
    private final n.a<EZTabView> I;
    private float J;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<c> f68402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f68403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final RectF f68404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final EZTabLayoutIndicator f68405e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f68406f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f68407g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f68408h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f68409i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f68410j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f68411k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @p0
    Drawable f68412l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    float f68413m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    float f68414n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f68415o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f68416p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    int f68417q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f68418r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f68419s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f68420t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f68421u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f68422v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    int f68423w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    boolean f68424x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private b f68425y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final ArrayList<b> f68426z;

    public class EZTabLayoutIndicator extends LinearLayout {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final GradientDrawable f68427b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f68428c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f68429d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f68430e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f68431f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f68432g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private ValueAnimator f68433h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f68434i;

        public class a implements ValueAnimator.AnimatorUpdateListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f68436b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f68437c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f68438d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f68439e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f68440f;

            a(View view, int i10, int i11, int i12, int i13) {
                this.f68436b = view;
                this.f68437c = i10;
                this.f68438d = i11;
                this.f68439e = i12;
                this.f68440f = i13;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, bb.c.f.f32485p5, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                    return;
                }
                EZTabLayoutIndicator.this.f68434i = false;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                int left = this.f68436b.getLeft();
                int right = this.f68436b.getRight();
                EZTabLayoutIndicator eZTabLayoutIndicator = EZTabLayoutIndicator.this;
                EZTabLayout eZTabLayout = EZTabLayout.this;
                if (!eZTabLayout.f68424x) {
                    View view = this.f68436b;
                    if (view instanceof EZTabView) {
                        EZTabLayoutIndicator.b(eZTabLayoutIndicator, (EZTabView) view, eZTabLayout.f68404d);
                        left = (int) EZTabLayout.this.f68404d.left;
                        right = (int) EZTabLayout.this.f68404d.right;
                    }
                }
                EZTabLayoutIndicator.this.i(this.f68437c, this.f68438d, animatedFraction);
                EZTabLayoutIndicator eZTabLayoutIndicator2 = EZTabLayoutIndicator.this;
                eZTabLayoutIndicator2.f(EZTabLayout.this.y(this.f68439e, left, animatedFraction), EZTabLayout.this.y(this.f68440f, right, animatedFraction));
            }
        }

        public class b extends AnimatorListenerAdapter {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f68442b;

            b(int i10) {
                this.f68442b = i10;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, bb.c.f.f32508q5, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                    return;
                }
                EZTabLayoutIndicator eZTabLayoutIndicator = EZTabLayoutIndicator.this;
                eZTabLayoutIndicator.f68428c = this.f68442b;
                eZTabLayoutIndicator.f68429d = 0.0f;
                eZTabLayoutIndicator.f68434i = true;
            }
        }

        EZTabLayoutIndicator(Context context) {
            super(context);
            this.f68428c = -1;
            this.f68430e = -1;
            this.f68431f = -1;
            this.f68432g = -1;
            this.f68434i = true;
            setWillNotDraw(false);
            this.f68427b = new GradientDrawable();
        }

        static /* synthetic */ void b(EZTabLayoutIndicator eZTabLayoutIndicator, EZTabView eZTabView, RectF rectF) {
            if (PatchProxy.proxy(new Object[]{eZTabLayoutIndicator, eZTabView, rectF}, null, changeQuickRedirect, true, bb.c.f.f32462o5, new Class[]{EZTabLayoutIndicator.class, EZTabView.class, RectF.class}, Void.TYPE).isSupported) {
                return;
            }
            eZTabLayoutIndicator.d(eZTabView, rectF);
        }

        private void d(EZTabView eZTabView, RectF rectF) {
            if (PatchProxy.proxy(new Object[]{eZTabView, rectF}, this, changeQuickRedirect, false, bb.c.f.f32416m5, new Class[]{EZTabView.class, RectF.class}, Void.TYPE).isSupported) {
                return;
            }
            int iD = EZTabView.d(eZTabView);
            if (iD < EZTabLayout.this.u(24)) {
                iD = EZTabLayout.this.u(24);
            }
            int left = (eZTabView.getLeft() + eZTabView.getRight()) / 2;
            int i10 = iD / 2;
            rectF.set(left - i10, 0.0f, left + i10, 0.0f);
        }

        private void h() {
            int left;
            int right;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32347j5, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            View childAt = getChildAt(this.f68428c);
            if (childAt == null || childAt.getWidth() <= 0) {
                left = -1;
                right = -1;
            } else {
                left = childAt.getLeft();
                right = childAt.getRight();
                EZTabLayout eZTabLayout = EZTabLayout.this;
                if (!eZTabLayout.f68424x && (childAt instanceof EZTabView)) {
                    d((EZTabView) childAt, eZTabLayout.f68404d);
                    left = (int) EZTabLayout.this.f68404d.left;
                    right = (int) EZTabLayout.this.f68404d.right;
                }
                if (this.f68429d > 0.0f && this.f68428c < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.f68428c + 1);
                    int left2 = childAt2.getLeft();
                    int right2 = childAt2.getRight();
                    EZTabLayout eZTabLayout2 = EZTabLayout.this;
                    if (!eZTabLayout2.f68424x && (childAt2 instanceof EZTabView)) {
                        d((EZTabView) childAt2, eZTabLayout2.f68404d);
                        left2 = (int) EZTabLayout.this.f68404d.left;
                        right2 = (int) EZTabLayout.this.f68404d.right;
                    }
                    float f10 = this.f68429d;
                    left = (int) ((left2 * f10) + ((1.0f - f10) * left));
                    right = (int) ((right2 * f10) + ((1.0f - f10) * right));
                }
            }
            f(left, right);
        }

        void c(int i10, int i11, int i12) {
            Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32393l5, new Class[]{cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            ValueAnimator valueAnimator = this.f68433h;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f68433h.cancel();
            }
            View childAt = getChildAt(i11);
            if (childAt == null) {
                h();
                return;
            }
            int left = childAt.getLeft();
            int right = childAt.getRight();
            EZTabLayout eZTabLayout = EZTabLayout.this;
            if (!eZTabLayout.f68424x && (childAt instanceof EZTabView)) {
                d((EZTabView) childAt, eZTabLayout.f68404d);
                left = (int) EZTabLayout.this.f68404d.left;
                right = (int) EZTabLayout.this.f68404d.right;
            }
            int i13 = this.f68431f;
            int i14 = this.f68432g;
            if (i13 == left && i14 == right) {
                return;
            }
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.f68433h = valueAnimator2;
            valueAnimator2.setInterpolator(new androidx.interpolator.view.animation.b());
            valueAnimator2.setDuration(i12);
            valueAnimator2.setFloatValues(0.0f, 1.0f);
            valueAnimator2.addUpdateListener(new a(childAt, i10, i11, i13, i14));
            valueAnimator2.addListener(new b(i11));
            valueAnimator2.start();
        }

        @Override // android.view.View
        public void draw(Canvas canvas) {
            if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.f.f32439n5, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
                return;
            }
            super.draw(canvas);
            Drawable drawable = EZTabLayout.this.f68412l;
            int height = getHeight() - (drawable != null ? drawable.getIntrinsicHeight() : 0);
            int height2 = getHeight();
            int i10 = this.f68431f;
            if (i10 >= 0 && this.f68432g > i10) {
                Drawable drawable2 = EZTabLayout.this.f68412l;
                if (drawable2 == null) {
                    drawable2 = this.f68427b;
                }
                Drawable drawableR = androidx.core.graphics.drawable.d.r(drawable2);
                drawableR.setBounds(this.f68431f, height, this.f68432g, height2);
                drawableR.draw(canvas);
            }
            int childCount = getChildCount();
            int iU = EZTabLayout.this.u(11);
            int iU2 = EZTabLayout.this.u(4);
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt instanceof EZTabView) {
                    EZTabView eZTabView = (EZTabView) childAt;
                    if (eZTabView.f68444b.f68459e) {
                        Drawable drawable3 = getResources().getDrawable(R.drawable.ic_msg_red_point);
                        int right = eZTabView.getRight() - iU2;
                        int top = eZTabView.f68445c.getTop();
                        drawable3.setBounds(right, top, right + iU, top + iU);
                        drawable3.draw(canvas);
                    }
                }
            }
        }

        boolean e() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32232e5, new Class[0], Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (getChildAt(i10).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        void f(int i10, int i11) {
            Object[] objArr = {new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32370k5, new Class[]{cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            if (i10 == this.f68431f && i11 == this.f68432g) {
                return;
            }
            this.f68431f = i10;
            this.f68432g = i11;
            j1.n1(this);
        }

        void g(int i10, float f10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10), new Float(f10)}, this, changeQuickRedirect, false, bb.c.f.f32255f5, new Class[]{Integer.TYPE, Float.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            ValueAnimator valueAnimator = this.f68433h;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f68433h.cancel();
            }
            this.f68428c = i10;
            this.f68429d = f10;
            h();
        }

        float getIndicatorPosition() {
            return this.f68428c + this.f68429d;
        }

        void i(int i10, int i11, float f10) {
            Object[] objArr = {new Integer(i10), new Integer(i11), new Float(f10)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32278g5, new Class[]{cls, cls, Float.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if (i10 == -1 && i11 == -1) {
                return;
            }
            c cVarW = EZTabLayout.this.w(i10);
            EZTabView eZTabView = cVarW != null ? cVarW.f68461g : null;
            c cVarW2 = EZTabLayout.this.w(i11);
            EZTabView eZTabView2 = cVarW2 != null ? cVarW2.f68461g : null;
            ArgbEvaluator argbEvaluator = new ArgbEvaluator();
            int i12 = eZTabView != null ? (int) (((double) (eZTabView.f68448f + ((eZTabView.f68449g - eZTabView.f68448f) * (1.0f - f10)))) + 0.5d) : 0;
            int i13 = eZTabView2 != null ? (int) (((double) (eZTabView2.f68448f + ((eZTabView2.f68449g - eZTabView2.f68448f) * f10))) + 0.5d) : 0;
            int i14 = eZTabView != null ? (int) (((double) (eZTabView.f68450h + ((eZTabView.f68451i - eZTabView.f68450h) * (1.0f - f10)))) + 0.5d) : 0;
            int i15 = eZTabView2 != null ? (int) (((double) (eZTabView2.f68450h + ((eZTabView2.f68451i - eZTabView2.f68450h) * f10))) + 0.5d) : 0;
            int iIntValue = ((Integer) argbEvaluator.evaluate(f10, Integer.valueOf(EZTabLayout.this.f68416p), Integer.valueOf(EZTabLayout.this.f68415o))).intValue();
            int iIntValue2 = ((Integer) argbEvaluator.evaluate(1.0f - f10, Integer.valueOf(EZTabLayout.this.f68416p), Integer.valueOf(EZTabLayout.this.f68415o))).intValue();
            if (eZTabView != null && eZTabView.f68445c != null && eZTabView.f68445c.getWidth() != i12) {
                eZTabView.f68445c.setWidth(i12);
                eZTabView.f68445c.setHeight(i14);
                eZTabView.f68445c.setTextColor(iIntValue);
            }
            if (eZTabView2 == null || eZTabView2.f68445c == null || eZTabView2.f68445c.getWidth() == i13) {
                return;
            }
            eZTabView2.f68445c.setWidth(i13);
            eZTabView2.f68445c.setHeight(i15);
            eZTabView2.f68445c.setTextColor(iIntValue2);
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32324i5, new Class[]{Boolean.TYPE, cls, cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            super.onLayout(z10, i10, i11, i12, i13);
            ValueAnimator valueAnimator = this.f68433h;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                h();
            } else if (this.f68434i) {
                this.f68433h.cancel();
                c(-1, this.f68428c, Math.round((1.0f - this.f68433h.getAnimatedFraction()) * this.f68433h.getDuration()));
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32301h5, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            super.onRtlPropertiesChanged(i10);
        }
    }

    public class EZTabView extends RelativeLayout {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c f68444b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private AppCompatTextView f68445c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ImageView f68446d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @p0
        private Drawable f68447e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f68448f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f68449g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f68450h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f68451i;

        public EZTabView(Context context) {
            super(context);
            n(context);
            j1.d2(this, EZTabLayout.this.f68406f, EZTabLayout.this.f68407g, EZTabLayout.this.f68408h, EZTabLayout.this.f68409i);
            setClickable(true);
            j1.g2(this, d1.c(getContext(), 1002));
        }

        static /* synthetic */ void a(EZTabView eZTabView, Canvas canvas) {
            if (PatchProxy.proxy(new Object[]{eZTabView, canvas}, null, changeQuickRedirect, true, bb.c.f.M5, new Class[]{EZTabView.class, Canvas.class}, Void.TYPE).isSupported) {
                return;
            }
            eZTabView.i(canvas);
        }

        static /* synthetic */ int d(EZTabView eZTabView) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{eZTabView}, null, changeQuickRedirect, true, bb.c.f.N5, new Class[]{EZTabView.class}, Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : eZTabView.getContentWidth();
        }

        private int getContentWidth() {
            int left;
            int right = 0;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.L5, new Class[0], Integer.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            AppCompatTextView appCompatTextView = this.f68445c;
            if (appCompatTextView == null || appCompatTextView.getVisibility() != 0) {
                left = 0;
            } else {
                left = this.f68445c.getLeft();
                right = this.f68445c.getRight();
            }
            return right - left;
        }

        private void i(Canvas canvas) {
            Drawable drawable;
            if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.f.f32640w5, new Class[]{Canvas.class}, Void.TYPE).isSupported || (drawable = this.f68447e) == null) {
                return;
            }
            drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
            this.f68447e.draw(canvas);
        }

        private void n(Context context) {
            if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.f.f32618v5, new Class[]{Context.class}, Void.TYPE).isSupported) {
                return;
            }
            int i10 = EZTabLayout.this.f68417q;
            if (i10 != 0) {
                Drawable drawableB = b0.a.b(context, i10);
                this.f68447e = drawableB;
                if (drawableB != null && drawableB.isStateful()) {
                    this.f68447e.setState(getDrawableState());
                }
            } else {
                this.f68447e = null;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(0);
            j1.I1(this, gradientDrawable);
            EZTabLayout.this.invalidate();
        }

        private void o(ImageView imageView) {
            if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, bb.c.f.K5, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
                return;
            }
            c cVar = this.f68444b;
            imageView.setVisibility((cVar == null || !cVar.f68462h) ? 8 : 0);
        }

        private void p(@p0 TextView textView) {
            if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, bb.c.f.J5, new Class[]{TextView.class}, Void.TYPE).isSupported) {
                return;
            }
            c cVar = this.f68444b;
            CharSequence charSequenceH = cVar != null ? cVar.h() : null;
            boolean zIsEmpty = true ^ TextUtils.isEmpty(charSequenceH);
            if (textView != null) {
                if (zIsEmpty) {
                    textView.setText(charSequenceH);
                    this.f68448f = k(EZTabLayout.this.f68413m, charSequenceH);
                    this.f68449g = k(EZTabLayout.this.f68414n, charSequenceH);
                    this.f68450h = j(EZTabLayout.this.f68413m, charSequenceH);
                    this.f68451i = j(EZTabLayout.this.f68414n, charSequenceH);
                    textView.setVisibility(0);
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
            }
            c cVar2 = this.f68444b;
            b1.a(this, zIsEmpty ? null : cVar2 != null ? cVar2.f68457c : null);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void drawableStateChanged() {
            boolean state = false;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32662x5, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f68447e;
            if (drawable != null && drawable.isStateful()) {
                state = false | this.f68447e.setState(drawableState);
            }
            if (state) {
                invalidate();
                EZTabLayout.this.invalidate();
            }
        }

        public c getTab() {
            return this.f68444b;
        }

        int j(float f10, CharSequence charSequence) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10), charSequence}, this, changeQuickRedirect, false, bb.c.f.E5, new Class[]{Float.TYPE, CharSequence.class}, Integer.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            TextView textView = new TextView(getContext());
            textView.setTextSize(0, f10);
            textView.setText(charSequence);
            Paint.FontMetrics fontMetrics = textView.getPaint().getFontMetrics();
            return (int) (((double) (fontMetrics.bottom - fontMetrics.top)) + 0.5d);
        }

        int k(float f10, CharSequence charSequence) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10), charSequence}, this, changeQuickRedirect, false, bb.c.f.D5, new Class[]{Float.TYPE, CharSequence.class}, Integer.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            TextView textView = new TextView(getContext());
            textView.setTextSize(0, f10);
            return (int) (((double) textView.getPaint().measureText(((Object) charSequence) + "")) + 0.5d);
        }

        void l() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.G5, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            setTab(null);
            setSelected(false);
        }

        final void m() {
            boolean z10 = false;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.I5, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            c cVar = this.f68444b;
            if (this.f68445c == null) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f68445c = appCompatTextView;
                appCompatTextView.setId(R.id.tv_desc);
                this.f68445c.setGravity(80);
                q.r(this.f68445c, 1, 200, 1, 0);
                this.f68445c.setMaxLines(1);
                this.f68445c.setIncludeFontPadding(false);
                this.f68445c.setTextSize(EZTabLayout.this.f68413m);
                this.f68445c.setTextColor(EZTabLayout.this.f68415o);
                AppCompatTextView appCompatTextView2 = this.f68445c;
                EZTabLayout eZTabLayout = EZTabLayout.this;
                appCompatTextView2.setPadding(eZTabLayout.f68406f, eZTabLayout.f68407g, eZTabLayout.f68408h, eZTabLayout.f68409i);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                EZTabLayout eZTabLayout2 = EZTabLayout.this;
                layoutParams.bottomMargin = eZTabLayout2.f68411k;
                layoutParams.addRule(eZTabLayout2.f68422v ? 15 : 12);
                this.f68445c.setLayoutParams(layoutParams);
                addView(this.f68445c);
            }
            p(this.f68445c);
            if (this.f68446d == null) {
                ImageView imageView = new ImageView(getContext());
                this.f68446d = imageView;
                imageView.setImageResource(R.drawable.msg_point);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(ViewUtils.f(getContext(), 8.0f), ViewUtils.f(getContext(), 8.0f));
                layoutParams2.topMargin = -ViewUtils.f(getContext(), 3.0f);
                int i10 = R.id.tv_desc;
                layoutParams2.addRule(17, i10);
                layoutParams2.addRule(6, i10);
                this.f68446d.setLayoutParams(layoutParams2);
                addView(this.f68446d);
            }
            o(this.f68446d);
            if (cVar != null && !TextUtils.isEmpty(cVar.f68457c)) {
                setContentDescription(cVar.f68457c);
            }
            if (cVar != null && cVar.j()) {
                z10 = true;
            }
            setSelected(z10);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            if (PatchProxy.proxy(new Object[]{accessibilityEvent}, this, changeQuickRedirect, false, bb.c.f.A5, new Class[]{AccessibilityEvent.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(ActionBar.e.class.getName());
        }

        @Override // android.view.View
        @TargetApi(14)
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            if (PatchProxy.proxy(new Object[]{accessibilityNodeInfo}, this, changeQuickRedirect, false, bb.c.f.B5, new Class[]{AccessibilityNodeInfo.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(ActionBar.e.class.getName());
        }

        @Override // android.widget.RelativeLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            Object[] objArr = {new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.C5, new Class[]{cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            int size = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            int tabMaxWidth = EZTabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i10 = View.MeasureSpec.makeMeasureSpec(EZTabLayout.this.f68418r, Integer.MIN_VALUE);
            }
            super.onMeasure(i10, i11);
        }

        @Override // android.view.View
        public boolean performClick() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32684y5, new Class[0], Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            boolean zPerformClick = super.performClick();
            if (this.f68444b == null) {
                return zPerformClick;
            }
            if (!zPerformClick) {
                playSoundEffect(0);
            }
            this.f68444b.m();
            return true;
        }

        @Override // android.view.View
        public void setSelected(boolean z10) {
            if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.f.f32706z5, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if (isSelected() == z10) {
            }
            super.setSelected(z10);
            AppCompatTextView appCompatTextView = this.f68445c;
            if (appCompatTextView != null) {
                appCompatTextView.setSelected(z10);
            }
        }

        void setTab(@p0 c cVar) {
            if (PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, bb.c.f.F5, new Class[]{c.class}, Void.TYPE).isSupported || cVar == this.f68444b) {
                return;
            }
            this.f68444b = cVar;
            m();
        }

        void setTypeface(Typeface typeface) {
            AppCompatTextView appCompatTextView;
            if (PatchProxy.proxy(new Object[]{typeface}, this, changeQuickRedirect, false, bb.c.f.H5, new Class[]{Typeface.class}, Void.TYPE).isSupported || (appCompatTextView = this.f68445c) == null) {
                return;
            }
            appCompatTextView.setTypeface(typeface);
        }
    }

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, bb.c.f.Q4, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            EZTabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    public interface b<T extends c> {
        void a(T t10);

        void b(T t10);

        void c(T t10);
    }

    public static class c {
        public static ChangeQuickRedirect changeQuickRedirect = null;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f68454i = -1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Object f68455a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private CharSequence f68456b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CharSequence f68457c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f68459e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public EZTabLayout f68460f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public EZTabView f68461g;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f68458d = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f68462h = false;

        @p0
        public CharSequence e() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Z4, new Class[0], CharSequence.class);
            if (patchProxyResultProxy.isSupported) {
                return (CharSequence) patchProxyResultProxy.result;
            }
            EZTabView eZTabView = this.f68461g;
            if (eZTabView == null) {
                return null;
            }
            return eZTabView.getContentDescription();
        }

        public int f() {
            return this.f68458d;
        }

        @p0
        public Object g() {
            return this.f68455a;
        }

        @p0
        public CharSequence h() {
            return this.f68456b;
        }

        public boolean i() {
            return this.f68459e;
        }

        public boolean j() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.W4, new Class[0], Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            EZTabLayout eZTabLayout = this.f68460f;
            if (eZTabLayout != null) {
                return eZTabLayout.getSelectedTabPosition() == this.f68458d;
            }
            throw new IllegalArgumentException("Tab not attached to a EZTabLayout");
        }

        public boolean k() {
            return this.f68462h;
        }

        void l() {
            this.f68460f = null;
            this.f68461g = null;
            this.f68455a = null;
            this.f68456b = null;
            this.f68457c = null;
            this.f68458d = -1;
            this.f68462h = false;
        }

        public void m() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.V4, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            EZTabLayout eZTabLayout = this.f68460f;
            if (eZTabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a EZTabLayout");
            }
            eZTabLayout.G(this);
        }

        @n0
        public c n(@androidx.annotation.d1 int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.X4, new Class[]{Integer.TYPE}, c.class);
            if (patchProxyResultProxy.isSupported) {
                return (c) patchProxyResultProxy.result;
            }
            EZTabLayout eZTabLayout = this.f68460f;
            if (eZTabLayout != null) {
                return o(eZTabLayout.getResources().getText(i10));
            }
            throw new IllegalArgumentException("Tab not attached to a EZTabLayout");
        }

        @n0
        public c o(@p0 CharSequence charSequence) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{charSequence}, this, changeQuickRedirect, false, bb.c.f.Y4, new Class[]{CharSequence.class}, c.class);
            if (patchProxyResultProxy.isSupported) {
                return (c) patchProxyResultProxy.result;
            }
            this.f68457c = charSequence;
            w();
            return this;
        }

        void p(int i10) {
            this.f68458d = i10;
        }

        public void q(boolean z10) {
            if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.f.R4, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            EZTabLayout eZTabLayout = this.f68460f;
            if (eZTabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a EZTabLayout");
            }
            this.f68459e = z10;
            eZTabLayout.L();
        }

        public void r(boolean z10) {
            if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.f.f32162b5, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            this.f68462h = z10;
            w();
        }

        @n0
        public c s(@p0 Object obj) {
            this.f68455a = obj;
            return this;
        }

        @n0
        public c t(@androidx.annotation.d1 int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.U4, new Class[]{Integer.TYPE}, c.class);
            if (patchProxyResultProxy.isSupported) {
                return (c) patchProxyResultProxy.result;
            }
            EZTabLayout eZTabLayout = this.f68460f;
            if (eZTabLayout != null) {
                return u(eZTabLayout.getResources().getText(i10));
            }
            throw new IllegalArgumentException("Tab not attached to a EZTabLayout");
        }

        @n0
        public c u(@p0 CharSequence charSequence) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{charSequence}, this, changeQuickRedirect, false, bb.c.f.S4, new Class[]{CharSequence.class}, c.class);
            if (patchProxyResultProxy.isSupported) {
                return (c) patchProxyResultProxy.result;
            }
            if (TextUtils.isEmpty(this.f68457c) && !TextUtils.isEmpty(charSequence)) {
                this.f68461g.setContentDescription(charSequence);
            }
            this.f68456b = charSequence;
            w();
            return this;
        }

        public void v(Typeface typeface) {
            EZTabView eZTabView;
            if (PatchProxy.proxy(new Object[]{typeface}, this, changeQuickRedirect, false, bb.c.f.T4, new Class[]{Typeface.class}, Void.TYPE).isSupported || (eZTabView = this.f68461g) == null) {
                return;
            }
            eZTabView.setTypeface(typeface);
        }

        void w() {
            EZTabView eZTabView;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32139a5, new Class[0], Void.TYPE).isSupported || (eZTabView = this.f68461g) == null) {
                return;
            }
            eZTabView.m();
        }
    }

    public class d extends DataSetObserver {
        public static ChangeQuickRedirect changeQuickRedirect;

        private d() {
        }

        /* synthetic */ d(EZTabLayout eZTabLayout, a aVar) {
            this();
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32185c5, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            EZTabLayout.this.A();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32209d5, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            EZTabLayout.this.A();
        }
    }

    public class e implements ViewPager.h {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f68464b;

        private e() {
        }

        /* synthetic */ e(EZTabLayout eZTabLayout, a aVar) {
            this();
        }

        void a(boolean z10) {
            this.f68464b = z10;
        }

        @Override // androidx.viewpager.widget.ViewPager.h
        public void b(@n0 ViewPager viewPager, @p0 androidx.viewpager.widget.a aVar, @p0 androidx.viewpager.widget.a aVar2) {
            if (PatchProxy.proxy(new Object[]{viewPager, aVar, aVar2}, this, changeQuickRedirect, false, bb.c.f.f32530r5, new Class[]{ViewPager.class, androidx.viewpager.widget.a.class, androidx.viewpager.widget.a.class}, Void.TYPE).isSupported) {
                return;
            }
            EZTabLayout eZTabLayout = EZTabLayout.this;
            if (eZTabLayout.C == viewPager) {
                eZTabLayout.I(aVar2, this.f68464b);
            }
        }
    }

    public static class f implements ViewPager.i {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<EZTabLayout> f68466b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f68467c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f68468d;

        public f(EZTabLayout eZTabLayout) {
            this.f68466b = new WeakReference<>(eZTabLayout);
        }

        void b() {
            this.f68468d = 0;
            this.f68467c = 0;
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageScrollStateChanged(int i10) {
            this.f68467c = this.f68468d;
            this.f68468d = i10;
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageScrolled(int i10, float f10, int i11) {
            EZTabLayout eZTabLayout;
            Object[] objArr = {new Integer(i10), new Float(f10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32552s5, new Class[]{cls, Float.TYPE, cls}, Void.TYPE).isSupported || (eZTabLayout = this.f68466b.get()) == null) {
                return;
            }
            int i12 = this.f68468d;
            eZTabLayout.J(i10, f10, i12 != 2 || this.f68467c == 1, (i12 == 2 && this.f68467c == 0) ? false : true);
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageSelected(int i10) {
            EZTabLayout eZTabLayout;
            boolean z10 = true;
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32574t5, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || (eZTabLayout = this.f68466b.get()) == null || eZTabLayout.getSelectedTabPosition() == i10 || i10 >= eZTabLayout.getTabCount()) {
                return;
            }
            int i11 = this.f68468d;
            if (i11 != 0 && (i11 != 2 || this.f68467c != 0)) {
                z10 = false;
            }
            eZTabLayout.H(eZTabLayout.w(i10), z10);
        }
    }

    public static class g implements h {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ViewPager f68469a;

        public g(ViewPager viewPager) {
            this.f68469a = viewPager;
        }

        @Override // com.max.hbcustomview.EZTabLayout.b
        public void a(c cVar) {
        }

        @Override // com.max.hbcustomview.EZTabLayout.b
        public void b(c cVar) {
        }

        @Override // com.max.hbcustomview.EZTabLayout.b
        public void c(c cVar) {
            if (PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, bb.c.f.f32596u5, new Class[]{c.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f68469a.setCurrentItem(cVar.f());
        }
    }

    public interface h extends b<c> {
    }

    public EZTabLayout(Context context) {
        this(context, null);
    }

    public EZTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EZTabLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f68402b = new ArrayList<>();
        this.f68404d = new RectF();
        this.f68418r = Integer.MAX_VALUE;
        this.f68426z = new ArrayList<>();
        this.I = new n.b(12);
        U = context.getResources().getColor(R.color.text_primary_2_color);
        V = context.getResources().getColor(R.color.text_primary_1_color);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.f68715t0);
        this.f68413m = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.EZTabLayout_tabTextSize, u(16));
        this.f68415o = typedArrayObtainStyledAttributes.getColor(R.styleable.EZTabLayout_tabTextColor, U);
        this.f68414n = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.EZTabLayout_tabSelectedTextSize, u(20));
        this.f68416p = typedArrayObtainStyledAttributes.getColor(R.styleable.EZTabLayout_tabSelectedTextColor, V);
        this.f68421u = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.EZTabLayout_contentInsetStart, u(12));
        this.f68422v = typedArrayObtainStyledAttributes.getBoolean(R.styleable.EZTabLayout_tabCenterVertical, false);
        typedArrayObtainStyledAttributes.recycle();
        setHorizontalScrollBarEnabled(false);
        EZTabLayoutIndicator eZTabLayoutIndicator = new EZTabLayoutIndicator(context);
        this.f68405e = eZTabLayoutIndicator;
        super.addView(eZTabLayoutIndicator, 0, new FrameLayout.LayoutParams(-2, -1));
        this.f68410j = u(20);
        this.f68411k = u(6);
        this.f68423w = 250;
        this.f68419s = -1;
        this.f68420t = -1;
        k();
    }

    private void F(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32184c4, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        EZTabView eZTabView = (EZTabView) this.f68405e.getChildAt(i10);
        this.f68405e.removeViewAt(i10);
        if (eZTabView != null) {
            eZTabView.l();
            this.I.b(eZTabView);
        }
        requestLayout();
    }

    private void K(@p0 ViewPager viewPager, boolean z10, boolean z11) {
        Object[] objArr = {viewPager, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.U3, new Class[]{ViewPager.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        ViewPager viewPager2 = this.C;
        if (viewPager2 != null) {
            f fVar = this.F;
            if (fVar != null) {
                viewPager2.O(fVar);
            }
            e eVar = this.G;
            if (eVar != null) {
                this.C.N(eVar);
            }
        }
        b bVar = this.A;
        a aVar = null;
        if (bVar != null) {
            D(bVar);
            this.A = null;
        }
        if (viewPager != null) {
            this.C = viewPager;
            if (this.F == null) {
                this.F = new f(this);
            }
            this.F.b();
            viewPager.c(this.F);
            g gVar = new g(viewPager);
            this.A = gVar;
            c(gVar);
            androidx.viewpager.widget.a adapter = viewPager.getAdapter();
            if (adapter != null) {
                I(adapter, z10);
            }
            if (this.G == null) {
                this.G = new e(this, aVar);
            }
            this.G.a(z10);
            viewPager.b(this.G);
            int currentItem = viewPager.getCurrentItem();
            setScrollPosition(currentItem, 0.0f, true);
            for (int i10 = 0; i10 < this.f68405e.getChildCount(); i10++) {
                if (i10 == currentItem) {
                    this.f68405e.i(i10, -1, 0.0f);
                } else {
                    this.f68405e.i(i10, -1, 1.0f);
                }
            }
        } else {
            this.C = null;
            I(null, false);
        }
        this.H = z11;
    }

    private void M(LinearLayout.LayoutParams layoutParams, int i10) {
        layoutParams.width = -2;
        layoutParams.weight = 0.0f;
        if (i10 > 0) {
            layoutParams.leftMargin = this.f68410j;
        }
    }

    private int getTabMinWidth() {
        int i10 = this.f68419s;
        if (i10 != -1) {
            return i10;
        }
        return 0;
    }

    private void h(c cVar) {
        if (PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, bb.c.f.f32415m4, new Class[]{c.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f68405e.addView(cVar.f68461g, cVar.f(), o(cVar.f()));
    }

    private void i(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.f.f32529r4, new Class[]{View.class}, Void.TYPE).isSupported) {
            throw new IllegalArgumentException("View can not be added to EZTabLayout");
        }
    }

    private void j(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.E4, new Class[]{cls, cls}, Void.TYPE).isSupported || i11 == -1 || i11 == i10) {
            return;
        }
        if (getWindowToken() == null || !j1.U0(this) || this.f68405e.e()) {
            this.f68405e.i(i10, i11, 1.0f);
            setScrollPosition(i11, 0.0f, true);
            return;
        }
        int scrollX = getScrollX();
        int iL = l(i11, 0.0f);
        if (scrollX != iL) {
            v();
            this.B.setIntValues(scrollX, iL);
            this.B.start();
        }
        this.f68405e.c(i10, i11, this.f68423w);
    }

    private void k() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.L4, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        j1.d2(this.f68405e, Math.max(0, this.f68421u - this.f68406f), 0, 0, 0);
        this.f68405e.setGravity(androidx.core.view.n.f21701b);
        N(true);
    }

    private int l(int i10, float f10) {
        Object[] objArr = {new Integer(i10), new Float(f10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.K4, new Class[]{cls, Float.TYPE}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        View childAt = this.f68405e.getChildAt(i10);
        int i11 = i10 + 1;
        View childAt2 = i11 < this.f68405e.getChildCount() ? this.f68405e.getChildAt(i11) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i12 = (int) ((width + width2) * 0.5f * f10);
        return j1.Z(this) == 0 ? left + i12 : left - i12;
    }

    private void n(c cVar, int i10) {
        if (PatchProxy.proxy(new Object[]{cVar, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32392l4, new Class[]{c.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        cVar.p(i10);
        this.f68402b.add(i10, cVar);
        int size = this.f68402b.size();
        for (int i11 = i10 + 1; i11 < size; i11++) {
            this.f68402b.get(i11).p(i11);
        }
    }

    private LinearLayout.LayoutParams o(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32551s4, new Class[]{Integer.TYPE}, LinearLayout.LayoutParams.class);
        if (patchProxyResultProxy.isSupported) {
            return (LinearLayout.LayoutParams) patchProxyResultProxy.result;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        M(layoutParams, i10);
        return layoutParams;
    }

    private EZTabView q(@n0 c cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, bb.c.f.f32369k4, new Class[]{c.class}, EZTabView.class);
        if (patchProxyResultProxy.isSupported) {
            return (EZTabView) patchProxyResultProxy.result;
        }
        EZTabView eZTabViewA = this.I.a();
        if (eZTabViewA == null) {
            eZTabViewA = new EZTabView(getContext());
        }
        eZTabViewA.setTab(cVar);
        eZTabViewA.setFocusable(true);
        eZTabViewA.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(cVar.f68457c)) {
            eZTabViewA.setContentDescription(cVar.f68456b);
        } else {
            eZTabViewA.setContentDescription(cVar.f68457c);
        }
        return eZTabViewA;
    }

    private void r(@n0 c cVar) {
        if (PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, bb.c.f.J4, new Class[]{c.class}, Void.TYPE).isSupported) {
            return;
        }
        for (int size = this.f68426z.size() - 1; size >= 0; size--) {
            this.f68426z.get(size).a(cVar);
        }
    }

    private void s(@n0 c cVar) {
        if (PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, bb.c.f.H4, new Class[]{c.class}, Void.TYPE).isSupported) {
            return;
        }
        for (int size = this.f68426z.size() - 1; size >= 0; size--) {
            this.f68426z.get(size).c(cVar);
        }
    }

    private void setSelectedTabView(int i10) {
        int childCount;
        if (!PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.B4, new Class[]{Integer.TYPE}, Void.TYPE).isSupported && i10 < (childCount = this.f68405e.getChildCount())) {
            int i11 = 0;
            while (i11 < childCount) {
                View childAt = this.f68405e.getChildAt(i11);
                childAt.setSelected(i11 == i10);
                childAt.setActivated(i11 == i10);
                i11++;
            }
        }
    }

    private void t(@n0 c cVar) {
        if (PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, bb.c.f.I4, new Class[]{c.class}, Void.TYPE).isSupported) {
            return;
        }
        for (int size = this.f68426z.size() - 1; size >= 0; size--) {
            this.f68426z.get(size).b(cVar);
        }
    }

    private void v() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.F4, new Class[0], Void.TYPE).isSupported && this.B == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.B = valueAnimator;
            valueAnimator.setInterpolator(new androidx.interpolator.view.animation.b());
            this.B.setDuration(this.f68423w);
            this.B.addUpdateListener(new a());
        }
    }

    void A() {
        int currentItem;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Z3, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        C();
        androidx.viewpager.widget.a aVar = this.D;
        if (aVar != null) {
            int count = aVar.getCount();
            for (int i10 = 0; i10 < count; i10++) {
                g(z().u(this.D.getPageTitle(i10)), false);
            }
            ViewPager viewPager = this.C;
            if (viewPager == null || count <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            G(w(currentItem));
        }
    }

    public boolean B(c cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, bb.c.f.f32346j4, new Class[]{c.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : f68401b0.b(cVar);
    }

    public void C() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32138a4, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        for (int childCount = this.f68405e.getChildCount() - 1; childCount >= 0; childCount--) {
            F(childCount);
        }
        Iterator<c> it = this.f68402b.iterator();
        while (it.hasNext()) {
            c next = it.next();
            it.remove();
            next.l();
            B(next);
        }
        this.f68403c = null;
    }

    public void D(@n0 b bVar) {
        if (PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, bb.c.f.W3, new Class[]{b.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f68426z.remove(bVar);
    }

    public void E(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32161b4, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        c cVar = this.f68403c;
        int iF = cVar != null ? cVar.f() : 0;
        F(i10);
        c cVarRemove = this.f68402b.remove(i10);
        if (cVarRemove != null) {
            cVarRemove.l();
            B(cVarRemove);
        }
        int size = this.f68402b.size();
        for (int i11 = i10; i11 < size; i11++) {
            this.f68402b.get(i11).p(i11);
        }
        if (iF == i10) {
            G(this.f68402b.isEmpty() ? null : this.f68402b.get(Math.max(0, i10 - 1)));
        }
    }

    void G(c cVar) {
        if (PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, bb.c.f.C4, new Class[]{c.class}, Void.TYPE).isSupported) {
            return;
        }
        H(cVar, true);
    }

    void H(c cVar, boolean z10) {
        boolean z11 = false;
        if (PatchProxy.proxy(new Object[]{cVar, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.f.D4, new Class[]{c.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        c cVar2 = this.f68403c;
        if (cVar2 == cVar) {
            if (cVar2 != null) {
                r(cVar);
                j(cVar2.f(), cVar.f());
                return;
            }
            return;
        }
        int iF = cVar != null ? cVar.f() : -1;
        if (z10) {
            if ((cVar2 == null || cVar2.f() == -1) && iF != -1) {
                z11 = true;
            }
            if (z11) {
                setScrollPosition(iF, 0.0f, true);
            } else {
                j(cVar2 != null ? cVar2.f() : -1, iF);
            }
            if (iF != -1) {
                setSelectedTabView(iF);
            }
        }
        if (cVar2 != null) {
            t(cVar2);
        }
        c cVar3 = this.f68403c;
        if (cVar3 != null) {
            cVar3.v(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b));
        }
        this.f68403c = cVar;
        if (cVar != null) {
            cVar.v(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
            s(cVar);
        }
    }

    void I(@p0 androidx.viewpager.widget.a aVar, boolean z10) {
        DataSetObserver dataSetObserver;
        if (PatchProxy.proxy(new Object[]{aVar, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.f.Y3, new Class[]{androidx.viewpager.widget.a.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        androidx.viewpager.widget.a aVar2 = this.D;
        if (aVar2 != null && (dataSetObserver = this.E) != null) {
            aVar2.unregisterDataSetObserver(dataSetObserver);
        }
        this.D = aVar;
        if (z10 && aVar != null) {
            if (this.E == null) {
                this.E = new d(this, null);
            }
            aVar.registerDataSetObserver(this.E);
        }
        A();
    }

    void J(int i10, float f10, boolean z10, boolean z11) {
        int i11;
        Object[] objArr = {new Integer(i10), new Float(f10), new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.A4, new Class[]{Integer.TYPE, Float.TYPE, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        float f11 = i10 + f10;
        int iRound = Math.round(f11);
        boolean z12 = this.J <= f11;
        if (iRound >= 0 && iRound < this.f68405e.getChildCount()) {
            if (z11) {
                this.f68405e.g(i10, f10);
            }
            ValueAnimator valueAnimator = this.B;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.B.cancel();
            }
            scrollTo(l(i10, f10), 0);
            if (z10) {
                if (this.J != f11) {
                    if (z12) {
                        if (f10 != 0.0f) {
                            i10++;
                        }
                        i11 = i10 - 1;
                        if (f10 == 0.0f) {
                            f10 = 1.0f;
                        }
                    } else {
                        i11 = i10 + 1;
                        f10 = 1.0f - f10;
                    }
                    this.f68405e.i(i11, i10, f10);
                }
                setSelectedTabView(iRound);
            }
        }
        this.J = f11;
    }

    public void L() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.R3, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        j1.n1(this.f68405e);
    }

    void N(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.f.M4, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        for (int i10 = 0; i10 < this.f68405e.getChildCount(); i10++) {
            View childAt = this.f68405e.getChildAt(i10);
            childAt.setMinimumWidth(getTabMinWidth());
            M((LinearLayout.LayoutParams) childAt.getLayoutParams(), i10);
            if (z10) {
                childAt.requestLayout();
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.f.f32438n4, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        i(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i10) {
        if (PatchProxy.proxy(new Object[]{view, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32461o4, new Class[]{View.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        i(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (PatchProxy.proxy(new Object[]{view, new Integer(i10), layoutParams}, this, changeQuickRedirect, false, bb.c.f.f32507q4, new Class[]{View.class, Integer.TYPE, ViewGroup.LayoutParams.class}, Void.TYPE).isSupported) {
            return;
        }
        i(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (PatchProxy.proxy(new Object[]{view, layoutParams}, this, changeQuickRedirect, false, bb.c.f.f32484p4, new Class[]{View.class, ViewGroup.LayoutParams.class}, Void.TYPE).isSupported) {
            return;
        }
        i(view);
    }

    public void c(@n0 b bVar) {
        if (PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, bb.c.f.V3, new Class[]{b.class}, Void.TYPE).isSupported || this.f68426z.contains(bVar)) {
            return;
        }
        this.f68426z.add(bVar);
    }

    public void d(@n0 c cVar) {
        if (PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, bb.c.f.f32208d4, new Class[]{c.class}, Void.TYPE).isSupported) {
            return;
        }
        g(cVar, this.f68402b.isEmpty());
    }

    public void e(@n0 c cVar, int i10) {
        if (PatchProxy.proxy(new Object[]{cVar, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32231e4, new Class[]{c.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f(cVar, i10, this.f68402b.isEmpty());
    }

    public void f(@n0 c cVar, int i10, boolean z10) {
        if (PatchProxy.proxy(new Object[]{cVar, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.f.f32277g4, new Class[]{c.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (cVar.f68460f != this) {
            throw new IllegalArgumentException("Tab belongs to a different EZTabLayout.");
        }
        n(cVar, i10);
        h(cVar);
        if (z10) {
            cVar.m();
        }
    }

    public void g(@n0 c cVar, boolean z10) {
        if (PatchProxy.proxy(new Object[]{cVar, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.f.f32254f4, new Class[]{c.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f(cVar, this.f68402b.size(), z10);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{attributeSet}, this, changeQuickRedirect, false, bb.c.f.P4, new Class[]{AttributeSet.class}, ViewGroup.LayoutParams.class);
        return patchProxyResultProxy.isSupported ? (ViewGroup.LayoutParams) patchProxyResultProxy.result : generateLayoutParams(attributeSet);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{attributeSet}, this, changeQuickRedirect, false, bb.c.f.N4, new Class[]{AttributeSet.class}, FrameLayout.LayoutParams.class);
        return patchProxyResultProxy.isSupported ? (FrameLayout.LayoutParams) patchProxyResultProxy.result : generateDefaultLayoutParams();
    }

    public c getSelectedTab() {
        return this.f68403c;
    }

    public int getSelectedTabPosition() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32661x4, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        c cVar = this.f68403c;
        if (cVar != null) {
            return cVar.f();
        }
        return -1;
    }

    public int getTabCount() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32683y4, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f68402b.size();
    }

    int getTabMaxWidth() {
        return this.f68418r;
    }

    @p0
    public Drawable getTabSelectedIndicator() {
        return this.f68412l;
    }

    public void m() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.X3, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f68426z.clear();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32595u4, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onAttachedToWindow();
        if (this.C == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                K((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32617v4, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
        if (this.H) {
            setupWithViewPager(null);
            this.H = false;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.f.M3, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        for (int i10 = 0; i10 < this.f68405e.getChildCount(); i10++) {
            View childAt = this.f68405e.getChildAt(i10);
            if (childAt instanceof EZTabView) {
                EZTabView.a((EZTabView) childAt, canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.N3, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        int iU = u(44) + getPaddingTop() + getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i11);
        if (mode == Integer.MIN_VALUE) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(iU, View.MeasureSpec.getSize(i11)), 1073741824);
        } else if (mode == 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(iU, 1073741824);
        }
        int size = View.MeasureSpec.getSize(i10);
        if (View.MeasureSpec.getMode(i10) != 0) {
            int iU2 = this.f68420t;
            if (iU2 <= 0) {
                iU2 = size - u(56);
            }
            this.f68418r = iU2;
        }
        super.onMeasure(i10, i11);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            if (childAt.getMeasuredWidth() < getMeasuredWidth()) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i11, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
            }
        }
    }

    public c p() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32323i4, new Class[0], c.class);
        if (patchProxyResultProxy.isSupported) {
            return (c) patchProxyResultProxy.result;
        }
        c cVarA = f68401b0.a();
        return cVarA == null ? new c() : cVarA;
    }

    void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        if (PatchProxy.proxy(new Object[]{animatorListener}, this, changeQuickRedirect, false, bb.c.f.G4, new Class[]{Animator.AnimatorListener.class}, Void.TYPE).isSupported) {
            return;
        }
        v();
        this.B.addListener(animatorListener);
    }

    public void setScrollPosition(int i10, float f10, boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), new Float(f10), new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.f.f32705z4, new Class[]{Integer.TYPE, Float.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        J(i10, f10, z10, true);
    }

    public void setSelectedTabIndicator(@v int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.P3, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (i10 != 0) {
            setSelectedTabIndicator(b0.a.b(getContext(), i10));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    public void setSelectedTabIndicator(@p0 Drawable drawable) {
        if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, bb.c.f.O3, new Class[]{Drawable.class}, Void.TYPE).isSupported || this.f68412l == drawable) {
            return;
        }
        this.f68412l = drawable;
        j1.n1(this.f68405e);
    }

    public void setTabBackground(@d0 int i10) {
        this.f68417q = i10;
    }

    public void setTabIndicatorFullWidth(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.f.Q3, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f68424x = z10;
        j1.n1(this.f68405e);
    }

    public void setTabMarginBottom(int i10) {
        this.f68411k = i10;
    }

    public void setupWithViewPager(@p0 ViewPager viewPager) {
        if (PatchProxy.proxy(new Object[]{viewPager}, this, changeQuickRedirect, false, bb.c.f.S3, new Class[]{ViewPager.class}, Void.TYPE).isSupported) {
            return;
        }
        setupWithViewPager(viewPager, true);
    }

    public void setupWithViewPager(@p0 ViewPager viewPager, boolean z10) {
        if (PatchProxy.proxy(new Object[]{viewPager, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.f.T3, new Class[]{ViewPager.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        K(viewPager, z10, false);
    }

    int u(@r(unit = 0) int i10) {
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32573t4, new Class[]{cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : Math.round(getResources().getDisplayMetrics().density * i10);
    }

    @p0
    public c w(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32639w4, new Class[]{Integer.TYPE}, c.class);
        if (patchProxyResultProxy.isSupported) {
            return (c) patchProxyResultProxy.result;
        }
        if (i10 < 0 || i10 >= getTabCount()) {
            return null;
        }
        return this.f68402b.get(i10);
    }

    public boolean x() {
        return this.f68424x;
    }

    int y(int i10, int i11, float f10) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Float(f10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.O4, new Class[]{cls, cls, Float.TYPE}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : i10 + Math.round(f10 * (i11 - i10));
    }

    @n0
    public c z() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32300h4, new Class[0], c.class);
        if (patchProxyResultProxy.isSupported) {
            return (c) patchProxyResultProxy.result;
        }
        c cVarP = p();
        cVarP.f68460f = this;
        cVarP.f68461g = q(cVarP);
        return cVarP;
    }
}
