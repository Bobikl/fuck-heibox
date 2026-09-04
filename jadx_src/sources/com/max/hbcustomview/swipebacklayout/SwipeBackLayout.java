package com.max.hbcustomview.swipebacklayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.f0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.x;
import androidx.core.view.j1;
import androidx.core.view.q0;
import com.max.hbcustomview.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes10.dex */
public class SwipeBackLayout extends FrameLayout {
    private static final String A = "SwipeBackLayout";
    private static final int B = 255;
    public static final int C = 1;
    public static final int D = 2;
    public static final int E = 4;
    public static final int F = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Drawable f69546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f69547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Rect f69548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f69549e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f69550f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f69551g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f69552h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final androidx.customview.widget.d f69553i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f69554j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f69555k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f69556l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f69557m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f69558n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f69559o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public cc.a f69560p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f69561q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f69562r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f69563s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f69564t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f69565u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f69566v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f69567w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f69568x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private e f69569y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private d f69570z;

    public class a implements d {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.max.hbcustomview.swipebacklayout.SwipeBackLayout.d
        public void a(View view, float f10, float f11) {
            Object[] objArr = {view, new Float(f10), new Float(f11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Float.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.rt, new Class[]{View.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            SwipeBackLayout.this.invalidate();
        }

        @Override // com.max.hbcustomview.swipebacklayout.SwipeBackLayout.d
        public void b(View view, boolean z10) {
            if (PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.f.st, new Class[]{View.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if (z10) {
                SwipeBackLayout.this.s();
                return;
            }
            SwipeBackLayout swipeBackLayout = SwipeBackLayout.this;
            swipeBackLayout.f69551g = false;
            if (swipeBackLayout.f69550f) {
                swipeBackLayout.f69550f = false;
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public class c extends androidx.customview.widget.d.c {
        public static ChangeQuickRedirect changeQuickRedirect;

        private c() {
        }

        /* synthetic */ c(SwipeBackLayout swipeBackLayout, a aVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:13:0x007e  */
        /* JADX WARN: Code duplicated, block: B:15:0x0086  */
        /* JADX WARN: Code duplicated, block: B:17:0x009a  */
        @Override // androidx.customview.widget.d.c
        public int a(View view, int i10, int i11) {
            SwipeBackLayout swipeBackLayout;
            Object[] objArr = {view, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.ut, new Class[]{View.class, cls, cls}, cls);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            SwipeBackLayout swipeBackLayout2 = SwipeBackLayout.this;
            swipeBackLayout2.f69565u = swipeBackLayout2.getPaddingLeft();
            if (SwipeBackLayout.f(SwipeBackLayout.this)) {
                if (SwipeBackLayout.this.f69552h == 1) {
                    SwipeBackLayout swipeBackLayout3 = SwipeBackLayout.this;
                    if (!com.max.hbcustomview.swipebacklayout.e.c(swipeBackLayout3.f69555k, swipeBackLayout3.f69563s, SwipeBackLayout.this.f69564t, false)) {
                        SwipeBackLayout swipeBackLayout4 = SwipeBackLayout.this;
                        swipeBackLayout4.f69565u = Math.min(Math.max(i10, swipeBackLayout4.getPaddingLeft()), SwipeBackLayout.this.f69556l);
                    } else if (SwipeBackLayout.this.f69552h == 2) {
                        swipeBackLayout = SwipeBackLayout.this;
                        if (!com.max.hbcustomview.swipebacklayout.e.b(swipeBackLayout.f69555k, swipeBackLayout.f69563s, SwipeBackLayout.this.f69564t, false)) {
                            SwipeBackLayout swipeBackLayout5 = SwipeBackLayout.this;
                            swipeBackLayout5.f69565u = Math.min(Math.max(i10, -swipeBackLayout5.f69556l), SwipeBackLayout.this.getPaddingRight());
                        }
                    }
                } else if (SwipeBackLayout.this.f69552h == 2) {
                    swipeBackLayout = SwipeBackLayout.this;
                    if (!com.max.hbcustomview.swipebacklayout.e.b(swipeBackLayout.f69555k, swipeBackLayout.f69563s, SwipeBackLayout.this.f69564t, false)) {
                        SwipeBackLayout swipeBackLayout6 = SwipeBackLayout.this;
                        swipeBackLayout6.f69565u = Math.min(Math.max(i10, -swipeBackLayout6.f69556l), SwipeBackLayout.this.getPaddingRight());
                    }
                }
            }
            return SwipeBackLayout.this.f69565u;
        }

        /* JADX WARN: Code duplicated, block: B:13:0x007f  */
        /* JADX WARN: Code duplicated, block: B:15:0x0089  */
        /* JADX WARN: Code duplicated, block: B:17:0x009d  */
        @Override // androidx.customview.widget.d.c
        public int b(View view, int i10, int i11) {
            SwipeBackLayout swipeBackLayout;
            Object[] objArr = {view, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.vt, new Class[]{View.class, cls, cls}, cls);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            SwipeBackLayout swipeBackLayout2 = SwipeBackLayout.this;
            swipeBackLayout2.f69566v = swipeBackLayout2.getPaddingTop();
            if (SwipeBackLayout.f(SwipeBackLayout.this)) {
                if (SwipeBackLayout.this.f69552h == 4) {
                    SwipeBackLayout swipeBackLayout3 = SwipeBackLayout.this;
                    if (!com.max.hbcustomview.swipebacklayout.e.d(swipeBackLayout3.f69555k, swipeBackLayout3.f69563s, SwipeBackLayout.this.f69564t, false)) {
                        SwipeBackLayout swipeBackLayout4 = SwipeBackLayout.this;
                        swipeBackLayout4.f69566v = Math.min(Math.max(i10, swipeBackLayout4.getPaddingTop()), SwipeBackLayout.this.f69557m);
                    } else if (SwipeBackLayout.this.f69552h == 8) {
                        swipeBackLayout = SwipeBackLayout.this;
                        if (!com.max.hbcustomview.swipebacklayout.e.a(swipeBackLayout.f69555k, swipeBackLayout.f69563s, SwipeBackLayout.this.f69564t, false)) {
                            SwipeBackLayout swipeBackLayout5 = SwipeBackLayout.this;
                            swipeBackLayout5.f69566v = Math.min(Math.max(i10, -swipeBackLayout5.f69557m), SwipeBackLayout.this.getPaddingBottom());
                        }
                    }
                } else if (SwipeBackLayout.this.f69552h == 8) {
                    swipeBackLayout = SwipeBackLayout.this;
                    if (!com.max.hbcustomview.swipebacklayout.e.a(swipeBackLayout.f69555k, swipeBackLayout.f69563s, SwipeBackLayout.this.f69564t, false)) {
                        SwipeBackLayout swipeBackLayout6 = SwipeBackLayout.this;
                        swipeBackLayout6.f69566v = Math.min(Math.max(i10, -swipeBackLayout6.f69557m), SwipeBackLayout.this.getPaddingBottom());
                    }
                }
            }
            return SwipeBackLayout.this.f69566v;
        }

        @Override // androidx.customview.widget.d.c
        public int d(View view) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.f.zt, new Class[]{View.class}, Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : SwipeBackLayout.this.f69556l;
        }

        @Override // androidx.customview.widget.d.c
        public int e(View view) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.f.At, new Class[]{View.class}, Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : SwipeBackLayout.this.f69557m;
        }

        @Override // androidx.customview.widget.d.c
        public void h(int i10, int i11) {
            Object[] objArr = {new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Bt, new Class[]{cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            super.h(i10, i11);
            SwipeBackLayout.this.f69568x = i10;
        }

        @Override // androidx.customview.widget.d.c
        public void j(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.yt, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            super.j(i10);
            if (i10 != 0 || SwipeBackLayout.this.f69570z == null) {
                return;
            }
            if (SwipeBackLayout.this.f69560p.c() == 0.0f) {
                SwipeBackLayout.this.f69570z.b(SwipeBackLayout.this.f69554j, false);
            } else if (SwipeBackLayout.this.f69560p.c() == 1.0f) {
                SwipeBackLayout.this.f69570z.b(SwipeBackLayout.this.f69554j, true);
            }
        }

        @Override // androidx.customview.widget.d.c
        public void k(View view, int i10, int i11, int i12, int i13) {
            Object[] objArr = {view, new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.wt, new Class[]{View.class, cls, cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            super.k(view, i10, i11, i12, i13);
            int iAbs = Math.abs(i10);
            int iAbs2 = Math.abs(i11);
            int i14 = SwipeBackLayout.this.f69552h;
            if (i14 == 1 || i14 == 2) {
                SwipeBackLayout swipeBackLayout = SwipeBackLayout.this;
                swipeBackLayout.f69560p.f((iAbs * 1.0f) / swipeBackLayout.f69556l);
            } else if (i14 == 4 || i14 == 8) {
                SwipeBackLayout swipeBackLayout2 = SwipeBackLayout.this;
                swipeBackLayout2.f69560p.f((iAbs2 * 1.0f) / swipeBackLayout2.f69557m);
            }
            if (SwipeBackLayout.this.f69570z != null) {
                d dVar = SwipeBackLayout.this.f69570z;
                SwipeBackLayout swipeBackLayout3 = SwipeBackLayout.this;
                dVar.a(swipeBackLayout3.f69554j, swipeBackLayout3.f69560p.c(), SwipeBackLayout.this.f69559o);
            }
        }

        @Override // androidx.customview.widget.d.c
        public void l(View view, float f10, float f11) {
            Object[] objArr = {view, new Float(f10), new Float(f11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Float.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.xt, new Class[]{View.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            super.l(view, f10, f11);
            SwipeBackLayout swipeBackLayout = SwipeBackLayout.this;
            swipeBackLayout.f69565u = swipeBackLayout.f69566v = 0;
            if (!SwipeBackLayout.f(SwipeBackLayout.this)) {
                SwipeBackLayout.this.f69568x = -1;
                return;
            }
            SwipeBackLayout.this.f69568x = -1;
            if (!(SwipeBackLayout.e(SwipeBackLayout.this, f10, f11) || SwipeBackLayout.this.f69560p.c() >= SwipeBackLayout.this.f69559o)) {
                int i10 = SwipeBackLayout.this.f69552h;
                if (i10 == 1 || i10 == 2) {
                    SwipeBackLayout swipeBackLayout2 = SwipeBackLayout.this;
                    swipeBackLayout2.x(swipeBackLayout2.getPaddingLeft());
                    return;
                } else {
                    if (i10 == 4 || i10 == 8) {
                        SwipeBackLayout swipeBackLayout3 = SwipeBackLayout.this;
                        swipeBackLayout3.y(swipeBackLayout3.getPaddingTop());
                        return;
                    }
                    return;
                }
            }
            int i11 = SwipeBackLayout.this.f69552h;
            if (i11 == 1) {
                SwipeBackLayout swipeBackLayout4 = SwipeBackLayout.this;
                swipeBackLayout4.x(swipeBackLayout4.f69556l);
                return;
            }
            if (i11 == 2) {
                SwipeBackLayout swipeBackLayout5 = SwipeBackLayout.this;
                swipeBackLayout5.x(-swipeBackLayout5.f69556l);
            } else if (i11 == 4) {
                SwipeBackLayout swipeBackLayout6 = SwipeBackLayout.this;
                swipeBackLayout6.y(swipeBackLayout6.f69557m);
            } else {
                if (i11 != 8) {
                    return;
                }
                SwipeBackLayout swipeBackLayout7 = SwipeBackLayout.this;
                swipeBackLayout7.y(-swipeBackLayout7.f69557m);
            }
        }

        @Override // androidx.customview.widget.d.c
        public boolean m(View view, int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.tt, new Class[]{View.class, Integer.TYPE}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (!SwipeBackLayout.this.getSwipeBackEnable()) {
                return false;
            }
            SwipeBackLayout swipeBackLayout = SwipeBackLayout.this;
            swipeBackLayout.f69551g = true;
            if (!swipeBackLayout.f69550f) {
                swipeBackLayout.f69550f = true;
            }
            return view == swipeBackLayout.f69554j;
        }
    }

    public interface d {
        void a(View view, float f10, float f11);

        void b(View view, boolean z10);
    }

    public interface e {
        void onFinish();
    }

    public SwipeBackLayout(@n0 Context context) {
        this(context, null);
    }

    public SwipeBackLayout(@n0 Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SwipeBackLayout(@n0 Context context, @p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f69547c = 1.0f;
        this.f69548d = new Rect();
        this.f69549e = true;
        this.f69550f = true;
        this.f69551g = false;
        this.f69552h = 4;
        this.f69559o = 0.3f;
        this.f69560p = new cc.a();
        this.f69561q = 180;
        this.f69562r = false;
        this.f69565u = 0;
        this.f69566v = 0;
        this.f69567w = 2000.0f;
        this.f69568x = -1;
        this.f69570z = new a();
        setWillNotDraw(false);
        androidx.customview.widget.d dVarP = androidx.customview.widget.d.p(this, 1.0f, new c(this, null));
        this.f69553i = dVarP;
        dVarP.T(this.f69552h);
        this.f69558n = dVarP.E();
        t(context, attributeSet);
    }

    static /* synthetic */ boolean e(SwipeBackLayout swipeBackLayout, float f10, float f11) {
        Object[] objArr = {swipeBackLayout, new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.f.qt, new Class[]{SwipeBackLayout.class, cls, cls}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : swipeBackLayout.p(f10, f11);
    }

    static /* synthetic */ boolean f(SwipeBackLayout swipeBackLayout) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{swipeBackLayout}, null, changeQuickRedirect, true, bb.c.f.pt, new Class[]{SwipeBackLayout.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : swipeBackLayout.u();
    }

    private boolean p(float f10, float f11) {
        int i10 = this.f69552h;
        if (i10 == 1) {
            return f10 > this.f69567w;
        }
        if (i10 == 2) {
            return f10 < (-this.f69567w);
        }
        if (i10 != 4) {
            return i10 == 8 && f11 < (-this.f69567w);
        }
        return f11 > this.f69567w;
    }

    private void q(Canvas canvas, View view) {
        if (PatchProxy.proxy(new Object[]{canvas, view}, this, changeQuickRedirect, false, bb.c.f.nt, new Class[]{Canvas.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        Rect rect = this.f69548d;
        view.getHitRect(rect);
        if (this.f69552h == 1) {
            Drawable drawable = this.f69546b;
            drawable.setBounds(rect.left - drawable.getIntrinsicWidth(), rect.top, rect.left, rect.bottom);
            this.f69546b.setAlpha((int) ((1.0f - this.f69560p.c()) * 255.0f));
            this.f69546b.draw(canvas);
        }
    }

    private void t(@n0 Context context, @p0 AttributeSet attributeSet) {
        if (PatchProxy.proxy(new Object[]{context, attributeSet}, this, changeQuickRedirect, false, bb.c.f.Ys, new Class[]{Context.class, AttributeSet.class}, Void.TYPE).isSupported) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f68653g3);
        setDirectionMode(typedArrayObtainStyledAttributes.getInt(R.styleable.SwipeBackLayout_directionMode, this.f69552h));
        setSwipeBackFactor(typedArrayObtainStyledAttributes.getFloat(R.styleable.SwipeBackLayout_swipeBackFactor, this.f69559o));
        setMaskAlpha(typedArrayObtainStyledAttributes.getInteger(R.styleable.SwipeBackLayout_maskAlpha, this.f69561q));
        this.f69562r = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SwipeBackLayout_isSwipeFromEdge, this.f69562r);
        setShadow(R.drawable.shadow_left_33x64);
        typedArrayObtainStyledAttributes.recycle();
    }

    private boolean u() {
        if (!this.f69562r) {
            return true;
        }
        int i10 = this.f69552h;
        if (i10 == 1) {
            return this.f69568x == 1;
        }
        if (i10 == 2) {
            return this.f69568x == 2;
        }
        if (i10 != 4) {
            return i10 != 8 || this.f69568x == 8;
        }
        return this.f69568x == 4;
    }

    @Override // android.view.View
    public void computeScroll() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.et, new Class[0], Void.TYPE).isSupported && this.f69553i.o(true)) {
            j1.n1(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{canvas, view, new Long(j10)}, this, changeQuickRedirect, false, bb.c.f.lt, new Class[]{Canvas.class, View.class, Long.TYPE}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (!getSwipeBackEnable()) {
            return super.drawChild(canvas, view, j10);
        }
        boolean z10 = view == this.f69554j;
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        if (this.f69547c > 0.0f && z10 && this.f69553i.F() != 0) {
            q(canvas, view);
        }
        return zDrawChild;
    }

    public float getAutoFinishedVelocityLimit() {
        return this.f69567w;
    }

    public int getDirectionMode() {
        return this.f69552h;
    }

    public int getMaskAlpha() {
        return this.f69561q;
    }

    public boolean getSwipeBackEnable() {
        return this.f69549e;
    }

    public float getSwipeBackFactor() {
        return this.f69559o;
    }

    public void o(Window window) {
        if (PatchProxy.proxy(new Object[]{window}, this, changeQuickRedirect, false, bb.c.f.Zs, new Class[]{Window.class}, Void.TYPE).isSupported) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) window.getDecorView();
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.getChildAt(0);
        viewGroup2.setBackgroundColor(0);
        viewGroup.removeView(viewGroup2);
        addView(viewGroup2);
        this.f69554j = viewGroup2;
        viewGroup.addView(this);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.f.bt, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onDraw(canvas);
        int i10 = this.f69561q;
        canvas.drawARGB(i10 - ((int) (i10 * this.f69560p.c())), 0, 0, 0);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View view;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, bb.c.f.ct, new Class[]{MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (!getSwipeBackEnable()) {
            return false;
        }
        int iC = q0.c(motionEvent);
        if (iC == 0) {
            this.f69563s = motionEvent.getRawX();
            this.f69564t = motionEvent.getRawY();
        } else if (iC == 2 && (view = this.f69555k) != null && com.max.hbcustomview.swipebacklayout.e.e(view, this.f69563s, this.f69564t)) {
            float fAbs = Math.abs(motionEvent.getRawX() - this.f69563s);
            float fAbs2 = Math.abs(motionEvent.getRawY() - this.f69564t);
            int i10 = this.f69552h;
            if (i10 == 1 || i10 == 2) {
                if (fAbs2 > 0.0f && fAbs2 * 1.5f > fAbs) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
            } else if ((i10 == 4 || i10 == 8) && fAbs > 0.0f && fAbs * 1.5f > fAbs2) {
                return super.onInterceptTouchEvent(motionEvent);
            }
        }
        boolean zW = this.f69553i.W(motionEvent);
        return zW ? zW : super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.at, new Class[]{Boolean.TYPE, cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            try {
                this.f69556l = getWidth();
                this.f69557m = getHeight();
            } catch (Exception unused) {
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            }
        }
        if (!getSwipeBackEnable()) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int paddingLeft = getPaddingLeft() + this.f69565u;
        int paddingTop = getPaddingTop() + this.f69566v;
        this.f69554j.layout(paddingLeft, paddingTop, this.f69554j.getMeasuredWidth() + paddingLeft, this.f69554j.getMeasuredHeight() + paddingTop);
        r();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, bb.c.f.dt, new Class[]{MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (!getSwipeBackEnable()) {
            return false;
        }
        this.f69553i.M(motionEvent);
        return true;
    }

    public void r() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.ft, new Class[0], Void.TYPE).isSupported && this.f69555k == null) {
            int i10 = this.f69552h;
            this.f69555k = com.max.hbcustomview.swipebacklayout.e.k(this, i10 == 4 || i10 == 8);
        }
    }

    public void s() {
        e eVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.kt, new Class[0], Void.TYPE).isSupported || (eVar = this.f69569y) == null) {
            return;
        }
        eVar.onFinish();
    }

    public void setAutoFinishedVelocityLimit(float f10) {
        this.f69567w = f10;
    }

    public void setDirectionMode(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.jt, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f69552h = i10;
        this.f69553i.T(i10);
    }

    public void setEnableGesture(boolean z10) {
        this.f69549e = z10;
    }

    public void setMaskAlpha(@f0(from = 0, to = 255) int i10) {
        if (i10 > 255) {
            i10 = 255;
        } else if (i10 < 0) {
            i10 = 0;
        }
        this.f69561q = i10;
    }

    public void setOnSwipeFinishListener(e eVar) {
        this.f69569y = eVar;
    }

    public void setShadow(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.mt, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        Drawable drawable = getResources().getDrawable(i10);
        if (this.f69552h == 1) {
            this.f69546b = drawable;
        }
        invalidate();
    }

    public void setSwipeBackFactor(@x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10) {
        if (f10 > 1.0f) {
            f10 = 1.0f;
        } else if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        this.f69559o = f10;
    }

    public void setSwipeFromEdge(boolean z10) {
        this.f69562r = z10;
    }

    public boolean v() {
        return this.f69562r;
    }

    public void w() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.ot, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f69560p.f(0.0f);
    }

    public void x(int i10) {
        if (!PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.gt, new Class[]{Integer.TYPE}, Void.TYPE).isSupported && this.f69553i.V(i10, getPaddingTop())) {
            j1.n1(this);
        }
    }

    public void y(int i10) {
        if (!PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.ht, new Class[]{Integer.TYPE}, Void.TYPE).isSupported && this.f69553i.V(getPaddingLeft(), i10)) {
            j1.n1(this);
        }
    }
}
