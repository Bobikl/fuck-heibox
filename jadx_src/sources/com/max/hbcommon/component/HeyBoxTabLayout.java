package com.max.hbcommon.component;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.annotation.f1;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.b1;
import androidx.core.view.d1;
import androidx.core.view.j1;
import androidx.viewpager.widget.ViewPager;
import com.max.hbcommon.R;
import com.max.hbcustomview.ProgressTextView;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class HeyBoxTabLayout extends HorizontalScrollView {
    public static final int G2 = 0;
    public static final int G3 = 2;
    public static final int J3 = 3;

    @androidx.annotation.r(unit = 0)
    private static final int Q = 72;

    @androidx.annotation.r(unit = 0)
    static final int R = 8;

    @androidx.annotation.r(unit = 0)
    private static final int S = 48;

    @androidx.annotation.r(unit = 0)
    private static final int T = 56;

    @androidx.annotation.r(unit = 0)
    private static final int U = 24;

    @androidx.annotation.r(unit = 0)
    static final int V = 16;
    private static final int W = -1;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final int f67043a0 = 300;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final androidx.core.util.n.a<i> f67044b0 = new androidx.core.util.n.c(16);

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final int f67045c0 = 0;
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final int f67046p1 = 1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public static final int f67047p2 = 1;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    public static final int f67048p3 = 1;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public static final int f67049x1 = 2;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final int f67050x2 = 0;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public static final int f67051y1 = 0;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    public static final int f67052y2 = 1;
    int A;
    int B;
    boolean C;
    boolean D;
    boolean E;

    @androidx.annotation.p0
    private c F;
    private final ArrayList<c> G;

    @androidx.annotation.p0
    private c H;
    private ValueAnimator I;

    @androidx.annotation.p0
    ViewPager J;

    @androidx.annotation.p0
    private androidx.viewpager.widget.a K;
    private DataSetObserver L;
    private d M;
    private b N;
    private boolean O;
    private final androidx.core.util.n.a<TabView> P;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<i> f67053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    private i f67054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final RectF f67055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    private final SlidingTabIndicator f67056e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f67057f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f67058g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f67059h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f67060i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f67061j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    Typeface f67062k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    ColorStateList f67063l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    ColorStateList f67064m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.p0
    Drawable f67065n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f67066o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    PorterDuff.Mode f67067p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    float f67068q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    float f67069r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final int f67070s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f67071t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final int f67072u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final int f67073v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int f67074w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f67075x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    int f67076y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    int f67077z;

    public static class HeyBoxTabItem extends View {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CharSequence f67078b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Drawable f67079c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f67080d;

        public HeyBoxTabItem(Context context) {
            this(context, null);
        }

        public HeyBoxTabItem(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f66381e1);
            this.f67078b = typedArrayObtainStyledAttributes.getText(R.styleable.HeyBoxTabItem_android_text);
            this.f67079c = typedArrayObtainStyledAttributes.getDrawable(R.styleable.HeyBoxTabItem_android_icon);
            this.f67080d = typedArrayObtainStyledAttributes.getResourceId(R.styleable.HeyBoxTabItem_android_layout, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public class SlidingTabIndicator extends LinearLayout {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f67081b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.n0
        private final Paint f67082c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.n0
        private final GradientDrawable f67083d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f67084e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        float f67085f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f67086g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f67087h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f67088i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private ValueAnimator f67089j;

        public class a implements ValueAnimator.AnimatorUpdateListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f67091b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f67092c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f67093d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f67094e;

            a(int i10, int i11, int i12, int i13) {
                this.f67091b = i10;
                this.f67092c = i11;
                this.f67093d = i12;
                this.f67094e = i13;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(@androidx.annotation.n0 ValueAnimator valueAnimator) {
                if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, bb.c.d.Xa, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                    return;
                }
                float animatedFraction = valueAnimator.getAnimatedFraction();
                SlidingTabIndicator.this.d(com.google.android.material.animation.b.c(this.f67091b, this.f67092c, animatedFraction), com.google.android.material.animation.b.c(this.f67093d, this.f67094e, animatedFraction));
            }
        }

        public class b extends AnimatorListenerAdapter {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f67096b;

            b(int i10) {
                this.f67096b = i10;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                SlidingTabIndicator slidingTabIndicator = SlidingTabIndicator.this;
                slidingTabIndicator.f67084e = this.f67096b;
                slidingTabIndicator.f67085f = 0.0f;
            }
        }

        SlidingTabIndicator(Context context) {
            super(context);
            this.f67084e = -1;
            this.f67086g = -1;
            this.f67087h = -1;
            this.f67088i = -1;
            setWillNotDraw(false);
            this.f67082c = new Paint();
            this.f67083d = new GradientDrawable();
        }

        private void b(@androidx.annotation.n0 TabView tabView, @androidx.annotation.n0 RectF rectF) {
            if (PatchProxy.proxy(new Object[]{tabView, rectF}, this, changeQuickRedirect, false, bb.c.d.Va, new Class[]{TabView.class, RectF.class}, Void.TYPE).isSupported) {
                return;
            }
            int iE = TabView.e(tabView);
            int iF = ViewUtils.f(getContext(), 24.0f);
            if (iE < iF) {
                iE = iF;
            }
            int left = (tabView.getLeft() + tabView.getRight()) / 2;
            int i10 = iE / 2;
            rectF.set(left - i10, 0.0f, left + i10, 0.0f);
        }

        private void f() {
            int left;
            int right;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Ra, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            View childAt = getChildAt(this.f67084e);
            if (childAt == null || childAt.getWidth() <= 0) {
                left = -1;
                right = -1;
            } else {
                left = childAt.getLeft();
                right = childAt.getRight();
                HeyBoxTabLayout heyBoxTabLayout = HeyBoxTabLayout.this;
                if (!heyBoxTabLayout.D && (childAt instanceof TabView)) {
                    b((TabView) childAt, heyBoxTabLayout.f67055d);
                    left = (int) HeyBoxTabLayout.this.f67055d.left;
                    right = (int) HeyBoxTabLayout.this.f67055d.right;
                }
                if (this.f67085f > 0.0f && this.f67084e < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.f67084e + 1);
                    int left2 = childAt2.getLeft();
                    int right2 = childAt2.getRight();
                    HeyBoxTabLayout heyBoxTabLayout2 = HeyBoxTabLayout.this;
                    if (!heyBoxTabLayout2.D && (childAt2 instanceof TabView)) {
                        b((TabView) childAt2, heyBoxTabLayout2.f67055d);
                        left2 = (int) HeyBoxTabLayout.this.f67055d.left;
                        right2 = (int) HeyBoxTabLayout.this.f67055d.right;
                    }
                    float f10 = this.f67085f;
                    left = (int) ((left2 * f10) + ((1.0f - f10) * left));
                    right = (int) ((right2 * f10) + ((1.0f - f10) * right));
                }
            }
            d(left, right);
        }

        void a(int i10, int i11) {
            Object[] objArr = {new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.Ua, new Class[]{cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            ValueAnimator valueAnimator = this.f67089j;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f67089j.cancel();
            }
            View childAt = getChildAt(i10);
            if (childAt == null) {
                f();
                return;
            }
            int left = childAt.getLeft();
            int right = childAt.getRight();
            HeyBoxTabLayout heyBoxTabLayout = HeyBoxTabLayout.this;
            if (!heyBoxTabLayout.D && (childAt instanceof TabView)) {
                b((TabView) childAt, heyBoxTabLayout.f67055d);
                left = (int) HeyBoxTabLayout.this.f67055d.left;
                right = (int) HeyBoxTabLayout.this.f67055d.right;
            }
            int i12 = left;
            int i13 = right;
            int i14 = this.f67087h;
            int i15 = this.f67088i;
            if (i14 == i12 && i15 == i13) {
                return;
            }
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.f67089j = valueAnimator2;
            valueAnimator2.setInterpolator(com.google.android.material.animation.b.f52897b);
            valueAnimator2.setDuration(i11);
            valueAnimator2.setFloatValues(0.0f, 1.0f);
            valueAnimator2.addUpdateListener(new a(i14, i12, i15, i13));
            valueAnimator2.addListener(new b(i10));
            valueAnimator2.start();
        }

        boolean c() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Ma, new Class[0], Boolean.TYPE);
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

        void d(int i10, int i11) {
            Object[] objArr = {new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.Sa, new Class[]{cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            if (i10 == this.f67087h && i11 == this.f67088i) {
                return;
            }
            this.f67087h = i10;
            this.f67088i = i11;
            j1.n1(this);
        }

        @Override // android.view.View
        public void draw(@androidx.annotation.n0 Canvas canvas) {
            int height;
            int i10;
            Drawable drawableR;
            int height2 = 0;
            if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.d.Wa, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
                return;
            }
            Drawable drawable = HeyBoxTabLayout.this.f67065n;
            int intrinsicHeight = drawable != null ? drawable.getIntrinsicHeight() : 0;
            int i11 = this.f67081b;
            if (i11 >= 0) {
                intrinsicHeight = i11;
            }
            int i12 = HeyBoxTabLayout.this.A;
            if (i12 == 0) {
                height2 = getHeight() - intrinsicHeight;
                height = getHeight();
            } else if (i12 == 1) {
                height2 = (getHeight() - intrinsicHeight) / 2;
                height = (getHeight() + intrinsicHeight) / 2;
            } else if (i12 != 2) {
                height = i12 != 3 ? 0 : getHeight();
            } else {
                height = intrinsicHeight;
            }
            int i13 = this.f67087h;
            if (i13 >= 0 && (i10 = this.f67088i) > i13) {
                HeyBoxTabLayout heyBoxTabLayout = HeyBoxTabLayout.this;
                if (!heyBoxTabLayout.f67066o || (drawableR = heyBoxTabLayout.f67065n) == null) {
                    Drawable drawable2 = heyBoxTabLayout.f67065n;
                    if (drawable2 == null) {
                        drawable2 = this.f67083d;
                    }
                    drawableR = androidx.core.graphics.drawable.d.r(drawable2);
                    drawableR.setBounds(this.f67087h, height2, this.f67088i, height);
                    Paint paint = this.f67082c;
                    if (paint != null) {
                        androidx.core.graphics.drawable.d.n(drawableR, paint.getColor());
                    }
                } else {
                    drawableR.setBounds(i13, height2, i10, height);
                }
                drawableR.draw(canvas);
            }
            g();
            super.draw(canvas);
        }

        void e(int i10, float f10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10), new Float(f10)}, this, changeQuickRedirect, false, bb.c.d.Na, new Class[]{Integer.TYPE, Float.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            ValueAnimator valueAnimator = this.f67089j;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f67089j.cancel();
            }
            this.f67084e = i10;
            this.f67085f = f10;
            f();
        }

        void g() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Ta, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            for (int i10 = 0; i10 < HeyBoxTabLayout.this.f67056e.getChildCount(); i10++) {
                View childAt = HeyBoxTabLayout.this.f67056e.getChildAt(i10);
                if (childAt instanceof TabView) {
                    TextView textView = ((TabView) childAt).f67103g;
                    if (textView instanceof ProgressTextView) {
                        ProgressTextView progressTextView = (ProgressTextView) textView;
                        float width = progressTextView.getWidth();
                        float left = childAt.getLeft() + progressTextView.getLeft();
                        float f10 = left + width;
                        int i11 = this.f67087h;
                        if (left >= i11 && f10 <= this.f67088i) {
                            progressTextView.setProgress(1.0f);
                        } else if (left > this.f67088i || f10 <= i11) {
                            progressTextView.setProgress(0.0f);
                        } else if (left > i11) {
                            progressTextView.setDirection(0);
                            progressTextView.setProgress((this.f67088i - left) / width);
                        } else {
                            progressTextView.setDirection(1);
                            progressTextView.setProgress((f10 - this.f67087h) / width);
                        }
                    }
                }
            }
        }

        float getIndicatorPosition() {
            return this.f67084e + this.f67085f;
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.Qa, new Class[]{Boolean.TYPE, cls, cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            super.onLayout(z10, i10, i11, i12, i13);
            ValueAnimator valueAnimator = this.f67089j;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                f();
            } else {
                this.f67089j.cancel();
                a(this.f67084e, Math.round((1.0f - this.f67089j.getAnimatedFraction()) * this.f67089j.getDuration()));
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            boolean z10 = true;
            Object[] objArr = {new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.Pa, new Class[]{cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            super.onMeasure(i10, i11);
            if (View.MeasureSpec.getMode(i10) != 1073741824) {
                return;
            }
            HeyBoxTabLayout heyBoxTabLayout = HeyBoxTabLayout.this;
            if (heyBoxTabLayout.f67076y == 1 || heyBoxTabLayout.B == 2) {
                int childCount = getChildCount();
                int iMax = 0;
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = getChildAt(i12);
                    if (childAt.getVisibility() == 0) {
                        iMax = Math.max(iMax, childAt.getMeasuredWidth());
                    }
                }
                if (iMax <= 0) {
                    return;
                }
                if (iMax * childCount <= getMeasuredWidth() - (ViewUtils.f(getContext(), 16.0f) * 2)) {
                    boolean z11 = false;
                    for (int i13 = 0; i13 < childCount; i13++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i13).getLayoutParams();
                        if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
                            layoutParams.width = iMax;
                            layoutParams.weight = 0.0f;
                            z11 = true;
                        }
                    }
                    z10 = z11;
                } else {
                    HeyBoxTabLayout heyBoxTabLayout2 = HeyBoxTabLayout.this;
                    heyBoxTabLayout2.f67076y = 0;
                    heyBoxTabLayout2.T(false);
                }
                if (z10) {
                    super.onMeasure(i10, i11);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.Oa, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            super.onRtlPropertiesChanged(i10);
        }

        void setSelectedIndicatorColor(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.Ka, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || this.f67082c.getColor() == i10) {
                return;
            }
            this.f67082c.setColor(i10);
            j1.n1(this);
        }

        void setSelectedIndicatorHeight(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.La, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || this.f67081b == i10) {
                return;
            }
            this.f67081b = i10;
            j1.n1(this);
        }
    }

    public final class TabView extends LinearLayout {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private i f67098b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private TextView f67099c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ImageView f67100d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @androidx.annotation.p0
        private View f67101e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @androidx.annotation.p0
        private View f67102f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @androidx.annotation.p0
        private TextView f67103g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @androidx.annotation.p0
        private ImageView f67104h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @androidx.annotation.p0
        private Drawable f67105i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f67106j;

        public TabView(Context context) {
            super(context);
            this.f67106j = 2;
            l(context);
            j1.d2(this, HeyBoxTabLayout.this.f67057f, HeyBoxTabLayout.this.f67058g, HeyBoxTabLayout.this.f67059h, HeyBoxTabLayout.this.f67060i);
            setGravity(17);
            setOrientation(!HeyBoxTabLayout.this.C ? 1 : 0);
            setClickable(true);
            j1.g2(this, d1.c(getContext(), 1002));
            j1.B1(this, null);
        }

        static /* synthetic */ void a(TabView tabView, Context context) {
            if (PatchProxy.proxy(new Object[]{tabView, context}, null, changeQuickRedirect, true, bb.c.d.Cb, new Class[]{TabView.class, Context.class}, Void.TYPE).isSupported) {
                return;
            }
            tabView.l(context);
        }

        static /* synthetic */ void b(TabView tabView, Canvas canvas) {
            if (PatchProxy.proxy(new Object[]{tabView, canvas}, null, changeQuickRedirect, true, bb.c.d.Db, new Class[]{TabView.class, Canvas.class}, Void.TYPE).isSupported) {
                return;
            }
            tabView.g(canvas);
        }

        static /* synthetic */ int e(TabView tabView) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tabView}, null, changeQuickRedirect, true, bb.c.d.Eb, new Class[]{TabView.class}, Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : tabView.getContentWidth();
        }

        private float f(@androidx.annotation.n0 Layout layout, int i10, float f10) {
            Object[] objArr = {layout, new Integer(i10), new Float(f10)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Float.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.Bb, new Class[]{Layout.class, Integer.TYPE, cls}, cls);
            return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : layout.getLineWidth(i10) * (f10 / layout.getPaint().getTextSize());
        }

        private void g(@androidx.annotation.n0 Canvas canvas) {
            Drawable drawable;
            if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.d.f31392mb, new Class[]{Canvas.class}, Void.TYPE).isSupported || (drawable = this.f67105i) == null) {
                return;
            }
            drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
            this.f67105i.draw(canvas);
        }

        private int getContentWidth() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Ab, new Class[0], Integer.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            View[] viewArr = {this.f67099c, this.f67100d, this.f67102f};
            int iMax = 0;
            int iMin = 0;
            boolean z10 = false;
            for (int i10 = 0; i10 < 3; i10++) {
                View view = viewArr[i10];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z10 ? Math.min(iMin, view.getLeft()) : view.getLeft();
                    iMax = z10 ? Math.max(iMax, view.getRight()) : view.getRight();
                    z10 = true;
                }
            }
            return iMax - iMin;
        }

        private void h() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31616wb, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_icon, (ViewGroup) this, false);
            this.f67100d = imageView;
            addView(imageView, 0);
        }

        private void i() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31638xb, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_text, (ViewGroup) this, false);
            this.f67099c = textView;
            addView(textView);
        }

        private void l(Context context) {
            if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.d.f31369lb, new Class[]{Context.class}, Void.TYPE).isSupported) {
                return;
            }
            int i10 = HeyBoxTabLayout.this.f67070s;
            if (i10 != 0) {
                Drawable drawableB = b0.a.b(context, i10);
                this.f67105i = drawableB;
                if (drawableB != null && drawableB.isStateful()) {
                    this.f67105i.setState(getDrawableState());
                }
            } else {
                this.f67105i = null;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(0);
            j1.I1(this, gradientDrawable);
            invalidate();
        }

        private void n(@androidx.annotation.p0 TextView textView, @androidx.annotation.p0 ImageView imageView) {
            if (PatchProxy.proxy(new Object[]{textView, imageView}, this, changeQuickRedirect, false, bb.c.d.f31682zb, new Class[]{TextView.class, ImageView.class}, Void.TYPE).isSupported) {
                return;
            }
            i iVar = this.f67098b;
            Drawable drawableMutate = (iVar == null || iVar.f() == null) ? null : androidx.core.graphics.drawable.d.r(this.f67098b.f()).mutate();
            i iVar2 = this.f67098b;
            CharSequence charSequenceJ = iVar2 != null ? iVar2.j() : null;
            if (imageView != null) {
                if (drawableMutate != null) {
                    imageView.setImageDrawable(drawableMutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean z10 = !TextUtils.isEmpty(charSequenceJ);
            if (textView != null) {
                if (z10) {
                    textView.setText(charSequenceJ);
                    if (this.f67098b.f67122g == 1) {
                        textView.setVisibility(0);
                    } else {
                        textView.setVisibility(8);
                    }
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int iF = (z10 && imageView.getVisibility() == 0) ? ViewUtils.f(getContext(), 8.0f) : 0;
                if (HeyBoxTabLayout.this.C) {
                    if (iF != androidx.core.view.s.b(marginLayoutParams)) {
                        androidx.core.view.s.g(marginLayoutParams, iF);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (iF != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = iF;
                    androidx.core.view.s.g(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            i iVar3 = this.f67098b;
            b1.a(this, z10 ? null : iVar3 != null ? iVar3.f67119d : null);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void drawableStateChanged() {
            boolean state = false;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31415nb, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f67105i;
            if (drawable != null && drawable.isStateful()) {
                state = false | this.f67105i.setState(drawableState);
            }
            if (state) {
                invalidate();
                invalidate();
            }
        }

        @androidx.annotation.p0
        public i getTab() {
            return this.f67098b;
        }

        void j() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31572ub, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            setTab(null);
            setSelected(false);
        }

        final void k() {
            boolean z10 = false;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31594vb, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            i iVar = this.f67098b;
            Drawable drawableMutate = null;
            View viewE = iVar != null ? iVar.e() : null;
            if (viewE != null) {
                ViewParent parent = viewE.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(viewE);
                    }
                    addView(viewE);
                }
                this.f67102f = viewE;
                TextView textView = this.f67099c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f67100d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f67100d.setImageDrawable(null);
                }
                TextView textView2 = (TextView) viewE.findViewById(android.R.id.text1);
                this.f67103g = textView2;
                if (textView2 != null) {
                    this.f67106j = androidx.core.widget.q.k(textView2);
                }
                this.f67104h = (ImageView) viewE.findViewById(android.R.id.icon);
            } else {
                View view = this.f67102f;
                if (view != null) {
                    removeView(view);
                    this.f67102f = null;
                }
                this.f67103g = null;
                this.f67104h = null;
            }
            if (this.f67102f == null) {
                if (this.f67100d == null) {
                    h();
                }
                if (iVar != null && iVar.f() != null) {
                    drawableMutate = androidx.core.graphics.drawable.d.r(iVar.f()).mutate();
                }
                if (drawableMutate != null) {
                    androidx.core.graphics.drawable.d.o(drawableMutate, HeyBoxTabLayout.this.f67064m);
                    PorterDuff.Mode mode = HeyBoxTabLayout.this.f67067p;
                    if (mode != null) {
                        androidx.core.graphics.drawable.d.p(drawableMutate, mode);
                    }
                }
                if (this.f67099c == null) {
                    i();
                    this.f67106j = androidx.core.widget.q.k(this.f67099c);
                }
                androidx.core.widget.q.E(this.f67099c, HeyBoxTabLayout.this.f67061j);
                ColorStateList colorStateList = HeyBoxTabLayout.this.f67063l;
                if (colorStateList != null) {
                    this.f67099c.setTextColor(colorStateList);
                }
                n(this.f67099c, this.f67100d);
            } else {
                TextView textView3 = this.f67103g;
                if (textView3 != null || this.f67104h != null) {
                    n(textView3, this.f67104h);
                }
            }
            if (iVar != null && !TextUtils.isEmpty(iVar.f67119d)) {
                setContentDescription(iVar.f67119d);
            }
            if (iVar != null && iVar.k()) {
                z10 = true;
            }
            setSelected(z10);
        }

        final void m() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31660yb, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            setOrientation(!HeyBoxTabLayout.this.C ? 1 : 0);
            TextView textView = this.f67103g;
            if (textView == null && this.f67104h == null) {
                n(this.f67099c, this.f67100d);
            } else {
                n(textView, this.f67104h);
            }
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(@androidx.annotation.n0 AccessibilityEvent accessibilityEvent) {
            if (PatchProxy.proxy(new Object[]{accessibilityEvent}, this, changeQuickRedirect, false, bb.c.d.f31484qb, new Class[]{AccessibilityEvent.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(ActionBar.e.class.getName());
        }

        @Override // android.view.View
        @TargetApi(14)
        public void onInitializeAccessibilityNodeInfo(@androidx.annotation.n0 AccessibilityNodeInfo accessibilityNodeInfo) {
            if (PatchProxy.proxy(new Object[]{accessibilityNodeInfo}, this, changeQuickRedirect, false, bb.c.d.f31506rb, new Class[]{AccessibilityNodeInfo.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(ActionBar.e.class.getName());
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            Layout layout;
            boolean z10 = true;
            Object[] objArr = {new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.f31528sb, new Class[]{cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            int size = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            int tabMaxWidth = HeyBoxTabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i10 = View.MeasureSpec.makeMeasureSpec(HeyBoxTabLayout.this.f67071t, Integer.MIN_VALUE);
            }
            super.onMeasure(i10, i11);
            if (this.f67099c != null) {
                float f10 = HeyBoxTabLayout.this.f67068q;
                int i12 = this.f67106j;
                ImageView imageView = this.f67100d;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f67099c;
                    if (textView != null && textView.getLineCount() > 1) {
                        f10 = HeyBoxTabLayout.this.f67069r;
                    }
                } else {
                    i12 = 1;
                }
                float textSize = this.f67099c.getTextSize();
                int lineCount = this.f67099c.getLineCount();
                int iK = androidx.core.widget.q.k(this.f67099c);
                if (f10 != textSize || (iK >= 0 && i12 != iK)) {
                    if (HeyBoxTabLayout.this.B == 1 && f10 > textSize && lineCount == 1 && ((layout = this.f67099c.getLayout()) == null || f(layout, 0, f10) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                        z10 = false;
                    }
                    if (z10) {
                        this.f67099c.setTextSize(0, f10);
                        this.f67099c.setMaxLines(i12);
                        super.onMeasure(i10, i11);
                    }
                }
            }
        }

        @Override // android.view.View
        public boolean performClick() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31438ob, new Class[0], Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            boolean zPerformClick = super.performClick();
            if (this.f67098b == null) {
                return zPerformClick;
            }
            if (!zPerformClick) {
                playSoundEffect(0);
            }
            this.f67098b.m();
            return true;
        }

        @Override // android.view.View
        public void setSelected(boolean z10) {
            if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.d.f31461pb, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if (isSelected() == z10) {
            }
            super.setSelected(z10);
            TextView textView = this.f67099c;
            if (textView != null) {
                textView.setSelected(z10);
            }
            ImageView imageView = this.f67100d;
            if (imageView != null) {
                imageView.setSelected(z10);
            }
            View view = this.f67102f;
            if (view != null) {
                view.setSelected(z10);
            }
        }

        void setTab(@androidx.annotation.p0 i iVar) {
            if (PatchProxy.proxy(new Object[]{iVar}, this, changeQuickRedirect, false, bb.c.d.f31550tb, new Class[]{i.class}, Void.TYPE).isSupported || iVar == this.f67098b) {
                return;
            }
            this.f67098b = iVar;
            k();
        }
    }

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@androidx.annotation.n0 ValueAnimator valueAnimator) {
            if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, bb.c.d.Ea, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            HeyBoxTabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    public class b implements ViewPager.h {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f67109b;

        b() {
        }

        void a(boolean z10) {
            this.f67109b = z10;
        }

        @Override // androidx.viewpager.widget.ViewPager.h
        public void b(@androidx.annotation.n0 ViewPager viewPager, @androidx.annotation.p0 androidx.viewpager.widget.a aVar, @androidx.annotation.p0 androidx.viewpager.widget.a aVar2) {
            if (PatchProxy.proxy(new Object[]{viewPager, aVar, aVar2}, this, changeQuickRedirect, false, bb.c.d.Fa, new Class[]{ViewPager.class, androidx.viewpager.widget.a.class, androidx.viewpager.widget.a.class}, Void.TYPE).isSupported) {
                return;
            }
            HeyBoxTabLayout heyBoxTabLayout = HeyBoxTabLayout.this;
            if (heyBoxTabLayout.J == viewPager) {
                heyBoxTabLayout.P(aVar2, this.f67109b);
            }
        }
    }

    @Deprecated
    public interface c<T extends i> {
        void a(T t10);

        void b(T t10);

        void c(T t10);
    }

    public static class d implements ViewPager.i {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.n0
        private final WeakReference<HeyBoxTabLayout> f67111b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f67112c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f67113d;

        public d(HeyBoxTabLayout heyBoxTabLayout) {
            this.f67111b = new WeakReference<>(heyBoxTabLayout);
        }

        void b() {
            this.f67113d = 0;
            this.f67112c = 0;
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageScrollStateChanged(int i10) {
            this.f67112c = this.f67113d;
            this.f67113d = i10;
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageScrolled(int i10, float f10, int i11) {
            HeyBoxTabLayout heyBoxTabLayout;
            Object[] objArr = {new Integer(i10), new Float(f10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.Ga, new Class[]{cls, Float.TYPE, cls}, Void.TYPE).isSupported || (heyBoxTabLayout = this.f67111b.get()) == null) {
                return;
            }
            int i12 = this.f67113d;
            heyBoxTabLayout.setScrollPosition(i10, f10, i12 != 2 || this.f67112c == 1, (i12 == 2 && this.f67112c == 0) ? false : true);
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageSelected(int i10) {
            HeyBoxTabLayout heyBoxTabLayout;
            boolean z10 = true;
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.Ha, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || (heyBoxTabLayout = this.f67111b.get()) == null || heyBoxTabLayout.getSelectedTabPosition() == i10 || i10 >= heyBoxTabLayout.getTabCount()) {
                return;
            }
            int i11 = this.f67113d;
            if (i11 != 0 && (i11 != 2 || this.f67112c != 0)) {
                z10 = false;
            }
            heyBoxTabLayout.O(heyBoxTabLayout.A(i10), z10);
        }
    }

    public @interface e {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface f {
    }

    public interface g extends c<i> {
    }

    public class h extends DataSetObserver {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Ia, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            HeyBoxTabLayout.this.F();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Ja, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            HeyBoxTabLayout.this.F();
        }
    }

    public static class i {
        public static ChangeQuickRedirect changeQuickRedirect = null;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f67115j = -1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.p0
        private Object f67116a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        private Drawable f67117b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.p0
        private CharSequence f67118c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.p0
        private CharSequence f67119d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @androidx.annotation.p0
        private View f67121f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @androidx.annotation.p0
        public HeyBoxTabLayout f67123h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @androidx.annotation.n0
        public TabView f67124i;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f67120e = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @e
        private int f67122g = 1;

        @androidx.annotation.p0
        public CharSequence d() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31323jb, new Class[0], CharSequence.class);
            if (patchProxyResultProxy.isSupported) {
                return (CharSequence) patchProxyResultProxy.result;
            }
            TabView tabView = this.f67124i;
            if (tabView == null) {
                return null;
            }
            return tabView.getContentDescription();
        }

        @androidx.annotation.p0
        public View e() {
            return this.f67121f;
        }

        @androidx.annotation.p0
        public Drawable f() {
            return this.f67117b;
        }

        public int g() {
            return this.f67120e;
        }

        @e
        public int h() {
            return this.f67122g;
        }

        @androidx.annotation.p0
        public Object i() {
            return this.f67116a;
        }

        @androidx.annotation.p0
        public CharSequence j() {
            return this.f67118c;
        }

        public boolean k() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31254gb, new Class[0], Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            HeyBoxTabLayout heyBoxTabLayout = this.f67123h;
            if (heyBoxTabLayout != null) {
                return heyBoxTabLayout.getSelectedTabPosition() == this.f67120e;
            }
            throw new IllegalArgumentException("Tab not attached to a HeyBoxTabLayout");
        }

        void l() {
            this.f67123h = null;
            this.f67124i = null;
            this.f67116a = null;
            this.f67117b = null;
            this.f67118c = null;
            this.f67119d = null;
            this.f67120e = -1;
            this.f67121f = null;
        }

        public void m() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31231fb, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            HeyBoxTabLayout heyBoxTabLayout = this.f67123h;
            if (heyBoxTabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a HeyBoxTabLayout");
            }
            heyBoxTabLayout.N(this);
        }

        @androidx.annotation.n0
        public i n(@androidx.annotation.d1 int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.f31277hb, new Class[]{Integer.TYPE}, i.class);
            if (patchProxyResultProxy.isSupported) {
                return (i) patchProxyResultProxy.result;
            }
            HeyBoxTabLayout heyBoxTabLayout = this.f67123h;
            if (heyBoxTabLayout != null) {
                return o(heyBoxTabLayout.getResources().getText(i10));
            }
            throw new IllegalArgumentException("Tab not attached to a HeyBoxTabLayout");
        }

        @androidx.annotation.n0
        public i o(@androidx.annotation.p0 CharSequence charSequence) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{charSequence}, this, changeQuickRedirect, false, bb.c.d.f31300ib, new Class[]{CharSequence.class}, i.class);
            if (patchProxyResultProxy.isSupported) {
                return (i) patchProxyResultProxy.result;
            }
            this.f67119d = charSequence;
            y();
            return this;
        }

        @androidx.annotation.n0
        public i p(@androidx.annotation.i0 int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.Za, new Class[]{Integer.TYPE}, i.class);
            return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : q(LayoutInflater.from(this.f67124i.getContext()).inflate(i10, (ViewGroup) this.f67124i, false));
        }

        @androidx.annotation.n0
        public i q(@androidx.annotation.p0 View view) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.d.Ya, new Class[]{View.class}, i.class);
            if (patchProxyResultProxy.isSupported) {
                return (i) patchProxyResultProxy.result;
            }
            this.f67121f = view;
            y();
            return this;
        }

        @androidx.annotation.n0
        public i r(@androidx.annotation.v int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.f31138bb, new Class[]{Integer.TYPE}, i.class);
            if (patchProxyResultProxy.isSupported) {
                return (i) patchProxyResultProxy.result;
            }
            HeyBoxTabLayout heyBoxTabLayout = this.f67123h;
            if (heyBoxTabLayout != null) {
                return s(b0.a.b(heyBoxTabLayout.getContext(), i10));
            }
            throw new IllegalArgumentException("Tab not attached to a HeyBoxTabLayout");
        }

        @androidx.annotation.n0
        public i s(@androidx.annotation.p0 Drawable drawable) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, bb.c.d.f31115ab, new Class[]{Drawable.class}, i.class);
            if (patchProxyResultProxy.isSupported) {
                return (i) patchProxyResultProxy.result;
            }
            this.f67117b = drawable;
            HeyBoxTabLayout heyBoxTabLayout = this.f67123h;
            if (heyBoxTabLayout.f67076y == 1 || heyBoxTabLayout.B == 2) {
                heyBoxTabLayout.T(true);
            }
            y();
            return this;
        }

        void t(int i10) {
            this.f67120e = i10;
        }

        @androidx.annotation.n0
        public i u(@e int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.f31208eb, new Class[]{Integer.TYPE}, i.class);
            if (patchProxyResultProxy.isSupported) {
                return (i) patchProxyResultProxy.result;
            }
            this.f67122g = i10;
            HeyBoxTabLayout heyBoxTabLayout = this.f67123h;
            if (heyBoxTabLayout.f67076y == 1 || heyBoxTabLayout.B == 2) {
                heyBoxTabLayout.T(true);
            }
            y();
            return this;
        }

        @androidx.annotation.n0
        public i v(@androidx.annotation.p0 Object obj) {
            this.f67116a = obj;
            return this;
        }

        @androidx.annotation.n0
        public i w(@androidx.annotation.d1 int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.f31185db, new Class[]{Integer.TYPE}, i.class);
            if (patchProxyResultProxy.isSupported) {
                return (i) patchProxyResultProxy.result;
            }
            HeyBoxTabLayout heyBoxTabLayout = this.f67123h;
            if (heyBoxTabLayout != null) {
                return x(heyBoxTabLayout.getResources().getText(i10));
            }
            throw new IllegalArgumentException("Tab not attached to a HeyBoxTabLayout");
        }

        @androidx.annotation.n0
        public i x(@androidx.annotation.p0 CharSequence charSequence) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{charSequence}, this, changeQuickRedirect, false, bb.c.d.f31161cb, new Class[]{CharSequence.class}, i.class);
            if (patchProxyResultProxy.isSupported) {
                return (i) patchProxyResultProxy.result;
            }
            if (TextUtils.isEmpty(this.f67119d) && !TextUtils.isEmpty(charSequence)) {
                this.f67124i.setContentDescription(charSequence);
            }
            this.f67118c = charSequence;
            y();
            return this;
        }

        void y() {
            TabView tabView;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31346kb, new Class[0], Void.TYPE).isSupported || (tabView = this.f67124i) == null) {
                return;
            }
            tabView.k();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface j {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface k {
    }

    public static class l implements g {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ViewPager f67125a;

        public l(ViewPager viewPager) {
            this.f67125a = viewPager;
        }

        @Override // com.max.hbcommon.component.HeyBoxTabLayout.c
        public void a(i iVar) {
        }

        @Override // com.max.hbcommon.component.HeyBoxTabLayout.c
        public void b(i iVar) {
        }

        @Override // com.max.hbcommon.component.HeyBoxTabLayout.c
        public void c(@androidx.annotation.n0 i iVar) {
            if (PatchProxy.proxy(new Object[]{iVar}, this, changeQuickRedirect, false, bb.c.d.Fb, new Class[]{i.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f67125a.setCurrentItem(iVar.g());
        }
    }

    public HeyBoxTabLayout(@androidx.annotation.n0 Context context) {
        this(context, null);
    }

    public HeyBoxTabLayout(@androidx.annotation.n0 Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.tabStyle);
    }

    public HeyBoxTabLayout(@androidx.annotation.n0 Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f67053b = new ArrayList<>();
        this.f67055d = new RectF();
        this.f67066o = false;
        this.f67071t = Integer.MAX_VALUE;
        this.G = new ArrayList<>();
        this.P = new androidx.core.util.n.b(12);
        setHorizontalScrollBarEnabled(false);
        SlidingTabIndicator slidingTabIndicator = new SlidingTabIndicator(context);
        this.f67056e = slidingTabIndicator;
        super.addView(slidingTabIndicator, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f66386f1);
        if (getBackground() instanceof ColorDrawable) {
            j1.I1(this, (ColorDrawable) getBackground());
        }
        slidingTabIndicator.setSelectedIndicatorHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HeyBoxTabLayout_tabIndicatorHeight, -1));
        slidingTabIndicator.setSelectedIndicatorColor(typedArrayObtainStyledAttributes.getColor(R.styleable.HeyBoxTabLayout_tabIndicatorColor, 0));
        setSelectedTabIndicator(z(context, typedArrayObtainStyledAttributes, R.styleable.HeyBoxTabLayout_tabIndicator));
        setSelectedTabIndicatorGravity(typedArrayObtainStyledAttributes.getInt(R.styleable.HeyBoxTabLayout_tabIndicatorGravity, 0));
        setTabIndicatorFullWidth(typedArrayObtainStyledAttributes.getBoolean(R.styleable.HeyBoxTabLayout_tabIndicatorFullWidth, true));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HeyBoxTabLayout_tabPadding, 0);
        this.f67060i = dimensionPixelSize;
        this.f67059h = dimensionPixelSize;
        this.f67058g = dimensionPixelSize;
        this.f67057f = dimensionPixelSize;
        this.f67057f = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HeyBoxTabLayout_tabPaddingStart, dimensionPixelSize);
        this.f67058g = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HeyBoxTabLayout_tabPaddingTop, this.f67058g);
        this.f67059h = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HeyBoxTabLayout_tabPaddingEnd, this.f67059h);
        this.f67060i = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HeyBoxTabLayout_tabPaddingBottom, this.f67060i);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.HeyBoxTabLayout_tabTextAppearance, R.style.TableTextStyle);
        this.f67061j = resourceId;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, androidx.appcompat.R.styleable.D);
        try {
            this.f67068q = typedArrayObtainStyledAttributes2.getDimensionPixelSize(androidx.appcompat.R.styleable.TextAppearance_android_textSize, 0);
            this.f67063l = y(context, typedArrayObtainStyledAttributes2, androidx.appcompat.R.styleable.TextAppearance_android_textColor);
            int i11 = R.styleable.TextAppearance_android_fontFamily;
            if (typedArrayObtainStyledAttributes2.hasValue(i11)) {
                this.f67062k = androidx.core.content.res.i.j(context, typedArrayObtainStyledAttributes2.getResourceId(i11, -1));
            }
            typedArrayObtainStyledAttributes2.recycle();
            int i12 = R.styleable.HeyBoxTabLayout_tabTextColor;
            if (typedArrayObtainStyledAttributes.hasValue(i12)) {
                this.f67063l = y(context, typedArrayObtainStyledAttributes, i12);
            }
            int i13 = R.styleable.HeyBoxTabLayout_tabSelectedTextColor;
            if (typedArrayObtainStyledAttributes.hasValue(i13)) {
                this.f67063l = q(this.f67063l.getDefaultColor(), typedArrayObtainStyledAttributes.getColor(i13, 0));
            }
            this.f67064m = y(context, typedArrayObtainStyledAttributes, R.styleable.HeyBoxTabLayout_tabIconTint);
            this.f67067p = ViewUtils.g0(typedArrayObtainStyledAttributes.getInt(R.styleable.HeyBoxTabLayout_tabIconTintMode, -1), null);
            this.f67077z = typedArrayObtainStyledAttributes.getInt(R.styleable.HeyBoxTabLayout_tabIndicatorAnimationDuration, 300);
            this.f67072u = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HeyBoxTabLayout_tabMinWidth, -1);
            this.f67073v = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HeyBoxTabLayout_tabMaxWidth, -1);
            this.f67070s = typedArrayObtainStyledAttributes.getResourceId(R.styleable.HeyBoxTabLayout_tabBackground, 0);
            this.f67075x = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HeyBoxTabLayout_tabContentStart, 0);
            this.B = typedArrayObtainStyledAttributes.getInt(R.styleable.HeyBoxTabLayout_tabMode, 1);
            this.f67076y = typedArrayObtainStyledAttributes.getInt(R.styleable.HeyBoxTabLayout_tabGravity, 0);
            this.C = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HeyBoxTabLayout_tabInlineLabel, false);
            this.E = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HeyBoxTabLayout_tabUnboundedRipple, false);
            typedArrayObtainStyledAttributes.recycle();
            Resources resources = getResources();
            this.f67069r = resources.getDimensionPixelSize(R.dimen.heybox_tab_text_size_2line);
            this.f67074w = resources.getDimensionPixelSize(R.dimen.heybox_tab_scrollable_min_width);
            m();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th2;
        }
    }

    private void M(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.f31368la, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        TabView tabView = (TabView) this.f67056e.getChildAt(i10);
        this.f67056e.removeViewAt(i10);
        if (tabView != null) {
            tabView.j();
            this.P.b(tabView);
        }
        requestLayout();
    }

    private void Q(@androidx.annotation.p0 ViewPager viewPager, boolean z10, boolean z11) {
        Object[] objArr = {viewPager, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.R9, new Class[]{ViewPager.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        ViewPager viewPager2 = this.J;
        if (viewPager2 != null) {
            d dVar = this.M;
            if (dVar != null) {
                viewPager2.O(dVar);
            }
            b bVar = this.N;
            if (bVar != null) {
                this.J.N(bVar);
            }
        }
        c cVar = this.H;
        if (cVar != null) {
            I(cVar);
            this.H = null;
        }
        if (viewPager != null) {
            this.J = viewPager;
            if (this.M == null) {
                this.M = new d(this);
            }
            this.M.b();
            viewPager.c(this.M);
            l lVar = new l(viewPager);
            this.H = lVar;
            c(lVar);
            androidx.viewpager.widget.a adapter = viewPager.getAdapter();
            if (adapter != null) {
                P(adapter, z10);
            }
            if (this.N == null) {
                this.N = new b();
            }
            this.N.a(z10);
            viewPager.b(this.N);
            setScrollPosition(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.J = null;
            P(null, false);
        }
        this.O = z11;
    }

    private void R() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Y9, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        int size = this.f67053b.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f67053b.get(i10).y();
        }
    }

    private void S(@androidx.annotation.n0 LinearLayout.LayoutParams layoutParams) {
        if (this.B == 1 && this.f67076y == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
    }

    @androidx.annotation.r(unit = 0)
    private int getDefaultHeight() {
        boolean z10 = false;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31681za, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int size = this.f67053b.size();
        for (int i10 = 0; i10 < size; i10++) {
            i iVar = this.f67053b.get(i10);
            if (iVar != null && iVar.f() != null && !TextUtils.isEmpty(iVar.j())) {
                z10 = true;
                break;
            }
        }
        return (!z10 || this.C) ? 48 : 72;
    }

    private int getTabMinWidth() {
        int i10 = this.f67072u;
        if (i10 != -1) {
            return i10;
        }
        int i11 = this.B;
        if (i11 == 0 || i11 == 2) {
            return this.f67074w;
        }
        return 0;
    }

    private int getTabScrollRange() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.V9, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : Math.max(0, ((this.f67056e.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void i(@androidx.annotation.n0 HeyBoxTabItem heyBoxTabItem) {
        if (PatchProxy.proxy(new Object[]{heyBoxTabItem}, this, changeQuickRedirect, false, bb.c.d.f31436o9, new Class[]{HeyBoxTabItem.class}, Void.TYPE).isSupported) {
            return;
        }
        i iVarE = E();
        CharSequence charSequence = heyBoxTabItem.f67078b;
        if (charSequence != null) {
            iVarE.x(charSequence);
        }
        Drawable drawable = heyBoxTabItem.f67079c;
        if (drawable != null) {
            iVarE.s(drawable);
        }
        int i10 = heyBoxTabItem.f67080d;
        if (i10 != 0) {
            iVarE.p(i10);
        }
        if (!TextUtils.isEmpty(heyBoxTabItem.getContentDescription())) {
            iVarE.o(heyBoxTabItem.getContentDescription());
        }
        e(iVarE);
    }

    private void j(@androidx.annotation.n0 i iVar) {
        if (PatchProxy.proxy(new Object[]{iVar}, this, changeQuickRedirect, false, bb.c.d.f31137ba, new Class[]{i.class}, Void.TYPE).isSupported) {
            return;
        }
        TabView tabView = iVar.f67124i;
        tabView.setSelected(false);
        tabView.setActivated(false);
        this.f67056e.addView(tabView, iVar.g(), r());
    }

    private void k(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.d.f31253ga, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        if (!(view instanceof HeyBoxTabItem)) {
            throw new IllegalArgumentException("Only HeyBoxTabItem instances can be added to HeyBoxTabLayout");
        }
        i((HeyBoxTabItem) view);
    }

    private void l(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.f31391ma, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || i10 == -1) {
            return;
        }
        if (getWindowToken() == null || !j1.U0(this) || this.f67056e.c()) {
            setScrollPosition(i10, 0.0f, true);
            return;
        }
        int scrollX = getScrollX();
        int iN = n(i10, 0.0f);
        if (scrollX != iN) {
            x();
            this.I.setIntValues(scrollX, iN);
            this.I.start();
        }
        this.f67056e.a(i10, this.f67077z);
    }

    private void m() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31615wa, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        int i10 = this.B;
        j1.d2(this.f67056e, (i10 == 0 || i10 == 2) ? Math.max(0, this.f67075x - this.f67057f) : 0, 0, 0, 0);
        int i11 = this.B;
        if (i11 == 0) {
            this.f67056e.setGravity(androidx.core.view.n.f21701b);
        } else if (i11 == 1 || i11 == 2) {
            this.f67056e.setGravity(1);
        }
        T(true);
    }

    private int n(int i10, float f10) {
        Object[] objArr = {new Integer(i10), new Float(f10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.f31593va, new Class[]{cls, Float.TYPE}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int i11 = this.B;
        if (i11 != 0 && i11 != 2) {
            return 0;
        }
        View childAt = this.f67056e.getChildAt(i10);
        int i12 = i10 + 1;
        View childAt2 = i12 < this.f67056e.getChildCount() ? this.f67056e.getChildAt(i12) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        int left = childAt != null ? childAt.getLeft() : 0;
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int width3 = (left + (width / 2)) - (getWidth() / 2);
        int i13 = (int) ((width + width2) * 0.5f * f10);
        return j1.Z(this) == 0 ? width3 + i13 : width3 - i13;
    }

    private void p(@androidx.annotation.n0 i iVar, int i10) {
        if (PatchProxy.proxy(new Object[]{iVar, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.f31114aa, new Class[]{i.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        iVar.t(i10);
        this.f67053b.add(i10, iVar);
        int size = this.f67053b.size();
        for (int i11 = i10 + 1; i11 < size; i11++) {
            this.f67053b.get(i11).t(i11);
        }
    }

    @androidx.annotation.n0
    private static ColorStateList q(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.d.f31659ya, new Class[]{cls, cls}, ColorStateList.class);
        return patchProxyResultProxy.isSupported ? (ColorStateList) patchProxyResultProxy.result : new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i11, i10});
    }

    @androidx.annotation.n0
    private LinearLayout.LayoutParams r() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31276ha, new Class[0], LinearLayout.LayoutParams.class);
        if (patchProxyResultProxy.isSupported) {
            return (LinearLayout.LayoutParams) patchProxyResultProxy.result;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        S(layoutParams);
        return layoutParams;
    }

    private void setSelectedTabView(int i10) {
        int childCount;
        if (!PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.f31460pa, new Class[]{Integer.TYPE}, Void.TYPE).isSupported && i10 < (childCount = this.f67056e.getChildCount())) {
            int i11 = 0;
            while (i11 < childCount) {
                View childAt = this.f67056e.getChildAt(i11);
                childAt.setSelected(i11 == i10);
                childAt.setActivated(i11 == i10);
                if (childAt instanceof TabView) {
                    TabView tabView = (TabView) childAt;
                    TextView textView = tabView.f67103g;
                    if (textView == null) {
                        textView = tabView.f67099c;
                    }
                    if (textView != null) {
                        int i12 = com.max.hbresource.a.f71894b;
                        if (i11 == i10) {
                            i12 = com.max.hbresource.a.f71895c;
                        }
                        textView.setTypeface(com.max.hbresource.a.f71893a.a(i12));
                    }
                }
                i11++;
            }
        }
    }

    @androidx.annotation.n0
    private TabView t(@androidx.annotation.n0 i iVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{iVar}, this, changeQuickRedirect, false, bb.c.d.Z9, new Class[]{i.class}, TabView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TabView) patchProxyResultProxy.result;
        }
        androidx.core.util.n.a<TabView> aVar = this.P;
        TabView tabViewA = aVar != null ? aVar.a() : null;
        if (tabViewA == null) {
            tabViewA = new TabView(getContext());
        }
        tabViewA.setTab(iVar);
        tabViewA.setFocusable(true);
        tabViewA.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(iVar.f67119d)) {
            tabViewA.setContentDescription(iVar.f67118c);
        } else {
            tabViewA.setContentDescription(iVar.f67119d);
        }
        return tabViewA;
    }

    private void u(@androidx.annotation.n0 i iVar) {
        if (PatchProxy.proxy(new Object[]{iVar}, this, changeQuickRedirect, false, bb.c.d.f31571ua, new Class[]{i.class}, Void.TYPE).isSupported) {
            return;
        }
        for (int size = this.G.size() - 1; size >= 0; size--) {
            this.G.get(size).b(iVar);
        }
    }

    private void v(@androidx.annotation.n0 i iVar) {
        if (PatchProxy.proxy(new Object[]{iVar}, this, changeQuickRedirect, false, bb.c.d.f31527sa, new Class[]{i.class}, Void.TYPE).isSupported) {
            return;
        }
        for (int size = this.G.size() - 1; size >= 0; size--) {
            this.G.get(size).c(iVar);
        }
    }

    private void w(@androidx.annotation.n0 i iVar) {
        if (PatchProxy.proxy(new Object[]{iVar}, this, changeQuickRedirect, false, bb.c.d.f31549ta, new Class[]{i.class}, Void.TYPE).isSupported) {
            return;
        }
        for (int size = this.G.size() - 1; size >= 0; size--) {
            this.G.get(size).a(iVar);
        }
    }

    private void x() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31414na, new Class[0], Void.TYPE).isSupported && this.I == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.I = valueAnimator;
            valueAnimator.setInterpolator(com.google.android.material.animation.b.f52897b);
            this.I.setDuration(this.f67077z);
            this.I.addUpdateListener(new a());
        }
    }

    @androidx.annotation.p0
    public static ColorStateList y(@androidx.annotation.n0 Context context, @androidx.annotation.n0 TypedArray typedArray, @f1 int i10) {
        int resourceId;
        ColorStateList colorStateListA;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, typedArray, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.d.Ca, new Class[]{Context.class, TypedArray.class, Integer.TYPE}, ColorStateList.class);
        if (patchProxyResultProxy.isSupported) {
            return (ColorStateList) patchProxyResultProxy.result;
        }
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (colorStateListA = b0.a.a(context, resourceId)) == null) ? typedArray.getColorStateList(i10) : colorStateListA;
    }

    public static Drawable z(@androidx.annotation.n0 Context context, @androidx.annotation.n0 TypedArray typedArray, @f1 int i10) {
        int resourceId;
        Drawable drawableB;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, typedArray, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.d.Ba, new Class[]{Context.class, TypedArray.class, Integer.TYPE}, Drawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (Drawable) patchProxyResultProxy.result;
        }
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (drawableB = b0.a.b(context, resourceId)) == null) ? typedArray.getDrawable(i10) : drawableB;
    }

    @androidx.annotation.p0
    public i A(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.f31614w9, new Class[]{Integer.TYPE}, i.class);
        if (patchProxyResultProxy.isSupported) {
            return (i) patchProxyResultProxy.result;
        }
        if (i10 < 0 || i10 >= getTabCount()) {
            return null;
        }
        return this.f67053b.get(i10);
    }

    public boolean B() {
        return this.E;
    }

    public boolean C() {
        return this.C;
    }

    public boolean D() {
        return this.D;
    }

    @androidx.annotation.n0
    public i E() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31526s9, new Class[0], i.class);
        if (patchProxyResultProxy.isSupported) {
            return (i) patchProxyResultProxy.result;
        }
        i iVarS = s();
        iVarS.f67123h = this;
        iVarS.f67124i = t(iVarS);
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.tab_heybox, (ViewGroup) this, false);
        ProgressTextView progressTextView = (ProgressTextView) viewInflate.findViewById(android.R.id.text1);
        ColorStateList tabTextColors = getTabTextColors();
        Typeface tabTextTypeface = getTabTextTypeface();
        if (tabTextColors != null) {
            progressTextView.setDefaultColor(tabTextColors.getColorForState(HorizontalScrollView.EMPTY_STATE_SET, -7829368));
            progressTextView.setProgressColor(tabTextColors.getColorForState(HorizontalScrollView.SELECTED_STATE_SET, j1.f21601t));
        }
        if (tabTextTypeface != null) {
            progressTextView.setTypeface(tabTextTypeface);
        }
        iVarS.q(viewInflate);
        return iVarS;
    }

    void F() {
        int currentItem;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.X9, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        H();
        androidx.viewpager.widget.a aVar = this.K;
        if (aVar != null) {
            int count = aVar.getCount();
            for (int i10 = 0; i10 < count; i10++) {
                h(E().x(this.K.getPageTitle(i10)), false);
            }
            ViewPager viewPager = this.J;
            if (viewPager == null || count <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            N(A(currentItem));
        }
    }

    public boolean G(i iVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{iVar}, this, changeQuickRedirect, false, bb.c.d.f31570u9, new Class[]{i.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : f67044b0.b(iVar);
    }

    public void H() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.A9, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        for (int childCount = this.f67056e.getChildCount() - 1; childCount >= 0; childCount--) {
            M(childCount);
        }
        Iterator<i> it = this.f67053b.iterator();
        while (it.hasNext()) {
            i next = it.next();
            it.remove();
            next.l();
            G(next);
        }
        this.f67054c = null;
    }

    @Deprecated
    public void I(@androidx.annotation.p0 c cVar) {
        this.G.remove(cVar);
    }

    public void J(@androidx.annotation.n0 g gVar) {
        if (PatchProxy.proxy(new Object[]{gVar}, this, changeQuickRedirect, false, bb.c.d.f31482q9, new Class[]{g.class}, Void.TYPE).isSupported) {
            return;
        }
        I(gVar);
    }

    public void K(@androidx.annotation.n0 i iVar) {
        if (PatchProxy.proxy(new Object[]{iVar}, this, changeQuickRedirect, false, bb.c.d.f31658y9, new Class[]{i.class}, Void.TYPE).isSupported) {
            return;
        }
        if (iVar.f67123h != this) {
            throw new IllegalArgumentException("Tab does not belong to this ");
        }
        L(iVar.g());
    }

    public void L(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.f31680z9, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        i iVar = this.f67054c;
        int iG = iVar != null ? iVar.g() : 0;
        M(i10);
        i iVarRemove = this.f67053b.remove(i10);
        if (iVarRemove != null) {
            iVarRemove.l();
            G(iVarRemove);
        }
        int size = this.f67053b.size();
        for (int i11 = i10; i11 < size; i11++) {
            this.f67053b.get(i11).t(i11);
        }
        if (iG == i10) {
            N(this.f67053b.isEmpty() ? null : this.f67053b.get(Math.max(0, i10 - 1)));
        }
    }

    public void N(@androidx.annotation.p0 i iVar) {
        if (PatchProxy.proxy(new Object[]{iVar}, this, changeQuickRedirect, false, bb.c.d.f31483qa, new Class[]{i.class}, Void.TYPE).isSupported) {
            return;
        }
        O(iVar, true);
    }

    public void O(@androidx.annotation.p0 i iVar, boolean z10) {
        if (PatchProxy.proxy(new Object[]{iVar, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.d.f31505ra, new Class[]{i.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        i iVar2 = this.f67054c;
        if (iVar2 == iVar) {
            if (iVar2 != null) {
                u(iVar);
                l(iVar.g());
                return;
            }
            return;
        }
        int iG = iVar != null ? iVar.g() : -1;
        if (z10) {
            if ((iVar2 == null || iVar2.g() == -1) && iG != -1) {
                setScrollPosition(iG, 0.0f, true);
            } else {
                l(iG);
            }
            if (iG != -1) {
                setSelectedTabView(iG);
            }
        }
        this.f67054c = iVar;
        if (iVar2 != null) {
            w(iVar2);
        }
        if (iVar != null) {
            v(iVar);
        }
    }

    void P(@androidx.annotation.p0 androidx.viewpager.widget.a aVar, boolean z10) {
        DataSetObserver dataSetObserver;
        if (PatchProxy.proxy(new Object[]{aVar, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.d.W9, new Class[]{androidx.viewpager.widget.a.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        androidx.viewpager.widget.a aVar2 = this.K;
        if (aVar2 != null && (dataSetObserver = this.L) != null) {
            aVar2.unregisterDataSetObserver(dataSetObserver);
        }
        this.K = aVar;
        if (z10 && aVar != null) {
            if (this.L == null) {
                this.L = new h();
            }
            aVar.registerDataSetObserver(this.L);
        }
        F();
    }

    void T(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.d.f31637xa, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        for (int i10 = 0; i10 < this.f67056e.getChildCount(); i10++) {
            View childAt = this.f67056e.getChildAt(i10);
            childAt.setMinimumWidth(getTabMinWidth());
            S((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z10) {
                childAt.requestLayout();
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.d.f31160ca, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        k(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i10) {
        if (PatchProxy.proxy(new Object[]{view, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.f31184da, new Class[]{View.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        k(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (PatchProxy.proxy(new Object[]{view, new Integer(i10), layoutParams}, this, changeQuickRedirect, false, bb.c.d.f31230fa, new Class[]{View.class, Integer.TYPE, ViewGroup.LayoutParams.class}, Void.TYPE).isSupported) {
            return;
        }
        k(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (PatchProxy.proxy(new Object[]{view, layoutParams}, this, changeQuickRedirect, false, bb.c.d.f31207ea, new Class[]{View.class, ViewGroup.LayoutParams.class}, Void.TYPE).isSupported) {
            return;
        }
        k(view);
    }

    @Deprecated
    public void c(@androidx.annotation.p0 c cVar) {
        if (this.G.contains(cVar)) {
            return;
        }
        this.G.add(cVar);
    }

    public void d(@androidx.annotation.n0 g gVar) {
        if (PatchProxy.proxy(new Object[]{gVar}, this, changeQuickRedirect, false, bb.c.d.f31459p9, new Class[]{g.class}, Void.TYPE).isSupported) {
            return;
        }
        c(gVar);
    }

    public void e(@androidx.annotation.n0 i iVar) {
        if (PatchProxy.proxy(new Object[]{iVar}, this, changeQuickRedirect, false, bb.c.d.f31344k9, new Class[]{i.class}, Void.TYPE).isSupported) {
            return;
        }
        h(iVar, this.f67053b.isEmpty());
    }

    public void f(@androidx.annotation.n0 i iVar, int i10) {
        if (PatchProxy.proxy(new Object[]{iVar, new Integer(i10)}, this, changeQuickRedirect, false, 2560, new Class[]{i.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        g(iVar, i10, this.f67053b.isEmpty());
    }

    public void g(@androidx.annotation.n0 i iVar, int i10, boolean z10) {
        if (PatchProxy.proxy(new Object[]{iVar, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.d.f31413n9, new Class[]{i.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (iVar.f67123h != this) {
            throw new IllegalArgumentException("Tab belongs to a different ");
        }
        p(iVar, i10);
        j(iVar);
        if (z10) {
            iVar.m();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{attributeSet}, this, changeQuickRedirect, false, bb.c.d.Da, new Class[]{AttributeSet.class}, ViewGroup.LayoutParams.class);
        return patchProxyResultProxy.isSupported ? (ViewGroup.LayoutParams) patchProxyResultProxy.result : generateLayoutParams(attributeSet);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{attributeSet}, this, changeQuickRedirect, false, bb.c.d.Aa, new Class[]{AttributeSet.class}, FrameLayout.LayoutParams.class);
        return patchProxyResultProxy.isSupported ? (FrameLayout.LayoutParams) patchProxyResultProxy.result : generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31636x9, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        i iVar = this.f67054c;
        if (iVar != null) {
            return iVar.g();
        }
        return -1;
    }

    public int getTabCount() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31592v9, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f67053b.size();
    }

    public int getTabGravity() {
        return this.f67076y;
    }

    @androidx.annotation.p0
    public ColorStateList getTabIconTint() {
        return this.f67064m;
    }

    public int getTabIndicatorGravity() {
        return this.A;
    }

    int getTabMaxWidth() {
        return this.f67071t;
    }

    public int getTabMode() {
        return this.B;
    }

    @androidx.annotation.p0
    public Drawable getTabSelectedIndicator() {
        return this.f67065n;
    }

    @androidx.annotation.p0
    public ColorStateList getTabTextColors() {
        return this.f67063l;
    }

    public Typeface getTabTextTypeface() {
        return this.f67062k;
    }

    public void h(@androidx.annotation.n0 i iVar, boolean z10) {
        if (PatchProxy.proxy(new Object[]{iVar, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.d.f31390m9, new Class[]{i.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        g(iVar, this.f67053b.size(), z10);
    }

    public void o() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31504r9, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.G.clear();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.T9, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onAttachedToWindow();
        com.google.android.material.shape.l.e(this);
        if (this.J == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                Q((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.U9, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
        if (this.O) {
            setupWithViewPager(null);
            this.O = false;
        }
    }

    @Override // android.view.View
    public void onDraw(@androidx.annotation.n0 Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.d.f31322ja, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        for (int i10 = 0; i10 < this.f67056e.getChildCount(); i10++) {
            View childAt = this.f67056e.getChildAt(i10);
            if (childAt instanceof TabView) {
                TabView.b((TabView) childAt, canvas);
            }
        }
        super.onDraw(canvas);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a7  */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        boolean z10 = false;
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.f31345ka, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        int iF = ViewUtils.f(getContext(), getDefaultHeight());
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i11 = View.MeasureSpec.makeMeasureSpec(iF + getPaddingTop() + getPaddingBottom(), 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i11) >= iF) {
            getChildAt(0).setMinimumHeight(iF);
        }
        int size = View.MeasureSpec.getSize(i10);
        if (View.MeasureSpec.getMode(i10) != 0) {
            int iF2 = this.f67073v;
            if (iF2 <= 0) {
                iF2 = size - ViewUtils.f(getContext(), 56.0f);
            }
            this.f67071t = iF2;
        }
        super.onMeasure(i10, i11);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i12 = this.B;
            if (i12 == 0) {
                if (childAt.getMeasuredWidth() < getMeasuredWidth()) {
                    z10 = true;
                }
            } else if (i12 != 1) {
                if (i12 == 2) {
                    if (childAt.getMeasuredWidth() < getMeasuredWidth()) {
                        z10 = true;
                    }
                }
            } else if (childAt.getMeasuredWidth() != getMeasuredWidth()) {
                z10 = true;
            }
            if (z10) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i11, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
            }
        }
    }

    public i s() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31548t9, new Class[0], i.class);
        if (patchProxyResultProxy.isSupported) {
            return (i) patchProxyResultProxy.result;
        }
        i iVarA = f67044b0.a();
        return iVarA == null ? new i() : iVarA;
    }

    @Override // android.view.View
    @androidx.annotation.w0(21)
    public void setElevation(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.d.f31299ia, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.setElevation(f10);
        com.google.android.material.shape.l.d(this, f10);
    }

    public void setInlineLabel(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.d.F9, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported || this.C == z10) {
            return;
        }
        this.C = z10;
        for (int i10 = 0; i10 < this.f67056e.getChildCount(); i10++) {
            View childAt = this.f67056e.getChildAt(i10);
            if (childAt instanceof TabView) {
                ((TabView) childAt).m();
            }
        }
        m();
    }

    public void setInlineLabelResource(@androidx.annotation.h int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.G9, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        setInlineLabel(getResources().getBoolean(i10));
    }

    @Deprecated
    public void setOnTabSelectedListener(@androidx.annotation.p0 c cVar) {
        c cVar2 = this.F;
        if (cVar2 != null) {
            I(cVar2);
        }
        this.F = cVar;
        if (cVar != null) {
            c(cVar);
        }
    }

    @Deprecated
    public void setOnTabSelectedListener(@androidx.annotation.p0 g gVar) {
        setOnTabSelectedListener((c) gVar);
    }

    void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        if (PatchProxy.proxy(new Object[]{animatorListener}, this, changeQuickRedirect, false, bb.c.d.f31437oa, new Class[]{Animator.AnimatorListener.class}, Void.TYPE).isSupported) {
            return;
        }
        x();
        this.I.addListener(animatorListener);
    }

    public void setScrollPosition(int i10, float f10, boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), new Float(f10), new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.d.f31298i9, new Class[]{Integer.TYPE, Float.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        setScrollPosition(i10, f10, z10, true);
    }

    public void setScrollPosition(int i10, float f10, boolean z10, boolean z11) {
        int iRound;
        Object[] objArr = {new Integer(i10), new Float(f10), new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (!PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.f31321j9, new Class[]{Integer.TYPE, Float.TYPE, cls, cls}, Void.TYPE).isSupported && (iRound = Math.round(i10 + f10)) >= 0 && iRound < this.f67056e.getChildCount()) {
            if (z11) {
                this.f67056e.e(i10, f10);
            }
            ValueAnimator valueAnimator = this.I;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.I.cancel();
            }
            scrollTo(n(i10, f10), 0);
            if (z10) {
                setSelectedTabView(iRound);
            }
        }
    }

    public void setSelectedTabIndicator(@androidx.annotation.v int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.O9, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (i10 != 0) {
            setSelectedTabIndicator(b0.a.b(getContext(), i10));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    public void setSelectedTabIndicator(@androidx.annotation.p0 Drawable drawable) {
        if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, bb.c.d.N9, new Class[]{Drawable.class}, Void.TYPE).isSupported || this.f67065n == drawable) {
            return;
        }
        this.f67065n = drawable;
        j1.n1(this.f67056e);
    }

    public void setSelectedTabIndicatorColor(@androidx.annotation.l int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.f31275h9, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f67056e.setSelectedIndicatorColor(i10);
    }

    public void setSelectedTabIndicatorGravity(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.D9, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || this.A == i10) {
            return;
        }
        this.A = i10;
        j1.n1(this.f67056e);
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i10) {
        this.f67056e.setSelectedIndicatorHeight(i10);
    }

    public void setTabGravity(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.C9, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || this.f67076y == i10) {
            return;
        }
        this.f67076y = i10;
        m();
    }

    public void setTabIconTint(@androidx.annotation.p0 ColorStateList colorStateList) {
        if (PatchProxy.proxy(new Object[]{colorStateList}, this, changeQuickRedirect, false, bb.c.d.L9, new Class[]{ColorStateList.class}, Void.TYPE).isSupported || this.f67064m == colorStateList) {
            return;
        }
        this.f67064m = colorStateList;
        R();
    }

    public void setTabIconTintResource(@androidx.annotation.n int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.M9, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        setTabIconTint(b0.a.a(getContext(), i10));
    }

    public void setTabIndicatorFullWidth(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.d.E9, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.D = z10;
        j1.n1(this.f67056e);
    }

    public void setTabMode(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.B9, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || i10 == this.B) {
            return;
        }
        this.B = i10;
        m();
    }

    public void setTabTextColors(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.K9, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        setTabTextColors(q(i10, i11));
    }

    public void setTabTextColors(@androidx.annotation.p0 ColorStateList colorStateList) {
        if (PatchProxy.proxy(new Object[]{colorStateList}, this, changeQuickRedirect, false, bb.c.d.J9, new Class[]{ColorStateList.class}, Void.TYPE).isSupported || this.f67063l == colorStateList) {
            return;
        }
        this.f67063l = colorStateList;
        R();
    }

    public void setTabTextTypeface(Typeface typeface) {
        this.f67062k = typeface;
    }

    @Deprecated
    public void setTabsFromPagerAdapter(@androidx.annotation.p0 androidx.viewpager.widget.a aVar) {
        P(aVar, false);
    }

    public void setUnboundedRipple(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.d.H9, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported || this.E == z10) {
            return;
        }
        this.E = z10;
        for (int i10 = 0; i10 < this.f67056e.getChildCount(); i10++) {
            View childAt = this.f67056e.getChildAt(i10);
            if (childAt instanceof TabView) {
                TabView.a((TabView) childAt, getContext());
            }
        }
    }

    public void setUnboundedRippleResource(@androidx.annotation.h int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.I9, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        setUnboundedRipple(getResources().getBoolean(i10));
    }

    public void setupWithViewPager(@androidx.annotation.p0 ViewPager viewPager) {
        if (PatchProxy.proxy(new Object[]{viewPager}, this, changeQuickRedirect, false, bb.c.d.P9, new Class[]{ViewPager.class}, Void.TYPE).isSupported) {
            return;
        }
        setupWithViewPager(viewPager, true);
    }

    public void setupWithViewPager(@androidx.annotation.p0 ViewPager viewPager, boolean z10) {
        if (PatchProxy.proxy(new Object[]{viewPager, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.d.Q9, new Class[]{ViewPager.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        Q(viewPager, z10, false);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.S9, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return getTabScrollRange() > 0;
    }
}
