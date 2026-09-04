package com.max.hbcustomview.SwitchButton;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.CompoundButton;
import bb.c;
import com.max.hbcustomview.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes10.dex */
public class SwitchButton extends CompoundButton {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static boolean f68916t = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f68917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f68918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Rect f68919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Rect f68920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Rect f68921f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private RectF f68922g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.max.hbcustomview.SwitchButton.a f68923h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private a f68924i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f68925j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f68926k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f68927l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f68928m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f68929n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f68930o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f68931p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Paint f68932q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Rect f68933r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private CompoundButton.OnCheckedChangeListener f68934s;

    public class a implements com.max.hbcustomview.SwitchButton.a.c {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.max.hbcustomview.SwitchButton.a.c
        public void a(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.f.Md, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            SwitchButton.d(SwitchButton.this, i10);
            SwitchButton.this.postInvalidate();
        }

        @Override // com.max.hbcustomview.SwitchButton.a.c
        public void b() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.Kd, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            SwitchButton.this.f68925j = true;
        }

        @Override // com.max.hbcustomview.SwitchButton.a.c
        public void c() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.Nd, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            SwitchButton switchButton = SwitchButton.this;
            SwitchButton.f(switchButton, SwitchButton.e(switchButton));
            SwitchButton.this.f68925j = false;
        }

        @Override // com.max.hbcustomview.SwitchButton.a.c
        public boolean d() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.Ld, new Class[0], Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            return SwitchButton.this.f68921f.right < SwitchButton.this.f68919d.right && SwitchButton.this.f68921f.left > SwitchButton.this.f68919d.left;
        }
    }

    public SwitchButton(Context context) {
        this(context, null);
    }

    public SwitchButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @SuppressLint({"NewApi"})
    public SwitchButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f68917b = false;
        this.f68924i = new a();
        this.f68925j = false;
        this.f68933r = null;
        l();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f68658h3);
        b bVar = this.f68918c;
        bVar.Z(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.SwitchButton_thumb_margin, bVar.b()));
        b bVar2 = this.f68918c;
        bVar2.b0(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.SwitchButton_thumb_marginTop, bVar2.y()), typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.SwitchButton_thumb_marginBottom, this.f68918c.v()), typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.SwitchButton_thumb_marginLeft, this.f68918c.w()), typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.SwitchButton_thumb_marginRight, this.f68918c.x()));
        this.f68918c.R(typedArrayObtainStyledAttributes.getInt(R.styleable.SwitchButton_radius_, b.a.f68970f));
        this.f68918c.d0(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.SwitchButton_thumb_width, -1), typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.SwitchButton_thumb_height, -1));
        this.f68918c.K(typedArrayObtainStyledAttributes.getFloat(R.styleable.SwitchButton_measureFactor, -1.0f));
        this.f68918c.F(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.SwitchButton_insetLeft, 0), typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.SwitchButton_insetTop, 0), typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.SwitchButton_insetRight, 0), typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.SwitchButton_insetBottom, 0));
        this.f68923h.i(typedArrayObtainStyledAttributes.getInteger(R.styleable.SwitchButton_animationVelocity, -1));
        j(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        setLayerType(1, null);
    }

    static /* synthetic */ void d(SwitchButton switchButton, int i10) {
        if (PatchProxy.proxy(new Object[]{switchButton, new Integer(i10)}, null, changeQuickRedirect, true, c.f.Hd, new Class[]{SwitchButton.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        switchButton.o(i10);
    }

    static /* synthetic */ boolean e(SwitchButton switchButton) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{switchButton}, null, changeQuickRedirect, true, c.f.Id, new Class[]{SwitchButton.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : switchButton.getStatusBasedOnPos();
    }

    static /* synthetic */ void f(SwitchButton switchButton, boolean z10) {
        if (PatchProxy.proxy(new Object[]{switchButton, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, c.f.Jd, new Class[]{SwitchButton.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        switchButton.setCheckedInClass(z10);
    }

    private int g() {
        int i10;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.f32516qd, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        Rect rect = this.f68919d;
        if (rect == null || (i10 = rect.right) == rect.left) {
            return 255;
        }
        int iZ = i10 - this.f68918c.z();
        int i11 = this.f68919d.left;
        int i12 = iZ - i11;
        if (i12 > 0) {
            return ((this.f68921f.left - i11) * 255) / i12;
        }
        return 255;
    }

    private boolean getStatusBasedOnPos() {
        return ((float) this.f68921f.left) > this.f68929n;
    }

    private void h() {
        ViewParent parent;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.f32604ud, new Class[0], Void.TYPE).isSupported || (parent = getParent()) == null) {
            return;
        }
        parent.requestDisallowInterceptTouchEvent(true);
    }

    private Drawable i(TypedArray typedArray, int i10, int i11, int i12) {
        Object[] objArr = {typedArray, new Integer(i10), new Integer(i11), new Integer(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.f.f32193cd, new Class[]{TypedArray.class, cls, cls, cls}, Drawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (Drawable) patchProxyResultProxy.result;
        }
        Drawable drawable = typedArray.getDrawable(i10);
        if (drawable != null) {
            return drawable;
        }
        int color = typedArray.getColor(i11, i12);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(this.f68918c.o());
        gradientDrawable.setColor(color);
        return gradientDrawable;
    }

    private void j(TypedArray typedArray) {
        b bVar;
        if (PatchProxy.proxy(new Object[]{typedArray}, this, changeQuickRedirect, false, c.f.f32170bd, new Class[]{TypedArray.class}, Void.TYPE).isSupported || (bVar = this.f68918c) == null) {
            return;
        }
        bVar.O(i(typedArray, R.styleable.SwitchButton_offDrawable, R.styleable.SwitchButton_offColor, b.a.f68965a));
        this.f68918c.Q(i(typedArray, R.styleable.SwitchButton_onDrawable, R.styleable.SwitchButton_onColor, b.a.f68966b));
        this.f68918c.T(k(typedArray));
    }

    private Drawable k(TypedArray typedArray) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{typedArray}, this, changeQuickRedirect, false, c.f.f32217dd, new Class[]{TypedArray.class}, Drawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (Drawable) patchProxyResultProxy.result;
        }
        Drawable drawable = typedArray.getDrawable(R.styleable.SwitchButton_thumbDrawable);
        if (drawable != null) {
            return drawable;
        }
        int color = typedArray.getColor(R.styleable.SwitchButton_thumbColor, b.a.f68967c);
        int color2 = typedArray.getColor(R.styleable.SwitchButton_thumbPressedColor, b.a.f68968d);
        StateListDrawable stateListDrawable = new StateListDrawable();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(this.f68918c.o());
        gradientDrawable.setColor(color);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(this.f68918c.o());
        gradientDrawable2.setColor(color2);
        stateListDrawable.addState(View.PRESSED_ENABLED_STATE_SET, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        return stateListDrawable;
    }

    private void l() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.f32147ad, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f68918c = b.a(getContext().getResources().getDisplayMetrics().density);
        this.f68930o = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f68931p = ViewConfiguration.getPressedStateDuration() + ViewConfiguration.getTapTimeout();
        this.f68923h = com.max.hbcustomview.SwitchButton.a.g().h(this.f68924i);
        this.f68933r = new Rect();
        if (f68916t) {
            Paint paint = new Paint();
            this.f68932q = paint;
            paint.setStyle(Paint.Style.STROKE);
        }
    }

    private int m(int i10) {
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.f.f32447nd, new Class[]{cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int iU = this.f68918c.u() + getPaddingTop() + getPaddingBottom();
        int iY = this.f68918c.y() + this.f68918c.v();
        if (iY > 0) {
            iU += iY;
        }
        if (mode == 1073741824) {
            iU = Math.max(size, iU);
        } else if (mode == Integer.MIN_VALUE) {
            iU = Math.min(size, iU);
        }
        return iU + this.f68918c.e().top + this.f68918c.e().bottom;
    }

    private int n(int i10) {
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.f.f32424md, new Class[]{cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int iZ = (int) ((this.f68918c.z() * this.f68918c.h()) + getPaddingLeft() + getPaddingRight());
        int iW = this.f68918c.w() + this.f68918c.x();
        if (iW > 0) {
            iZ += iW;
        }
        if (mode == 1073741824) {
            iZ = Math.max(size, iZ);
        } else if (mode == Integer.MIN_VALUE) {
            iZ = Math.min(size, iZ);
        }
        return iZ + this.f68918c.e().left + this.f68918c.e().right;
    }

    private void o(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.f.Fd, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        Rect rect = this.f68921f;
        int iZ = rect.left + i10;
        int iZ2 = rect.right + i10;
        int i11 = this.f68919d.left;
        if (iZ < i11) {
            iZ2 = this.f68918c.z() + i11;
            iZ = i11;
        }
        int i12 = this.f68919d.right;
        if (iZ2 > i12) {
            iZ = i12 - this.f68918c.z();
            iZ2 = i12;
        }
        p(iZ, iZ2);
    }

    private void p(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.f.Gd, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        Rect rect = this.f68921f;
        rect.set(i10, rect.top, i11, rect.bottom);
        this.f68918c.s().setBounds(this.f68921f);
    }

    private boolean q() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.f32493pd, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return ((this.f68918c.s() instanceof StateListDrawable) && (this.f68918c.m() instanceof StateListDrawable) && (this.f68918c.j() instanceof StateListDrawable)) ? false : true;
    }

    private void r(boolean z10, boolean z11) {
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.f.Dd, new Class[]{cls, cls}, Void.TYPE).isSupported || this.f68917b == z10) {
            return;
        }
        this.f68917b = z10;
        refreshDrawableState();
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f68934s;
        if (onCheckedChangeListener == null || !z11) {
            return;
        }
        onCheckedChangeListener.onCheckedChanged(this, this.f68917b);
    }

    private void s() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.f32309hd, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        t();
        v();
        w();
        u();
        if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0) {
            this.f68922g = new RectF(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
        }
    }

    private void setCheckedInClass(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, c.f.Cd, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        r(z10, true);
    }

    private void setDrawableState(Drawable drawable) {
        if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, c.f.Ad, new Class[]{Drawable.class}, Void.TYPE).isSupported || drawable == null) {
            return;
        }
        drawable.setState(getDrawableState());
        invalidate();
    }

    private void t() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.f32355jd, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            this.f68920e = null;
            return;
        }
        if (this.f68920e == null) {
            this.f68920e = new Rect();
        }
        int paddingLeft = getPaddingLeft() + (this.f68918c.w() > 0 ? 0 : -this.f68918c.w());
        int paddingRight = ((measuredWidth - getPaddingRight()) - (this.f68918c.x() > 0 ? 0 : -this.f68918c.x())) + (-this.f68918c.p());
        this.f68920e.set(paddingLeft, getPaddingTop() + (this.f68918c.y() > 0 ? 0 : -this.f68918c.y()), paddingRight, ((measuredHeight - getPaddingBottom()) - (this.f68918c.v() <= 0 ? -this.f68918c.v() : 0)) + (-this.f68918c.q()));
    }

    private void u() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.f32401ld, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f68920e != null) {
            this.f68918c.m().setBounds(this.f68920e);
            this.f68918c.j().setBounds(this.f68920e);
        }
        if (this.f68921f != null) {
            this.f68918c.s().setBounds(this.f68921f);
        }
    }

    private void v() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.f32332id, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            this.f68919d = null;
            return;
        }
        if (this.f68919d == null) {
            this.f68919d = new Rect();
        }
        this.f68919d.set(getPaddingLeft() + (this.f68918c.w() > 0 ? this.f68918c.w() : 0), getPaddingTop() + (this.f68918c.y() > 0 ? this.f68918c.y() : 0), ((measuredWidth - getPaddingRight()) - (this.f68918c.x() > 0 ? this.f68918c.x() : 0)) + (-this.f68918c.p()), ((measuredHeight - getPaddingBottom()) - (this.f68918c.v() > 0 ? this.f68918c.v() : 0)) + (-this.f68918c.q()));
        Rect rect = this.f68919d;
        int i10 = rect.left;
        this.f68929n = i10 + (((rect.right - i10) - this.f68918c.z()) / 2);
    }

    private void w() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.f32378kd, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            this.f68921f = null;
            return;
        }
        if (this.f68921f == null) {
            this.f68921f = new Rect();
        }
        int iZ = this.f68917b ? this.f68919d.right - this.f68918c.z() : this.f68919d.left;
        int iZ2 = this.f68918c.z() + iZ;
        int i10 = this.f68919d.top;
        this.f68921f.set(iZ, i10, iZ2, this.f68918c.u() + i10);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.f32714zd, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.drawableStateChanged();
        b bVar = this.f68918c;
        if (bVar == null) {
            return;
        }
        setDrawableState(bVar.s());
        setDrawableState(this.f68918c.m());
        setDrawableState(this.f68918c.j());
    }

    public b getConfiguration() {
        return this.f68918c;
    }

    @Override // android.view.View
    public void invalidate() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.f32560sd, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f68933r == null || !this.f68918c.C()) {
            super.invalidate();
        } else {
            invalidate(this.f68933r);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public boolean isChecked() {
        return this.f68917b;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, c.f.f32470od, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onDraw(canvas);
        canvas.getClipBounds(this.f68933r);
        if (this.f68933r != null && this.f68918c.C()) {
            this.f68933r.inset(this.f68918c.f(), this.f68918c.g());
            canvas.clipRect(this.f68933r, Region.Op.REPLACE);
            canvas.translate(this.f68918c.e().left, this.f68918c.e().top);
        }
        boolean z10 = !isEnabled() && q();
        if (z10) {
            canvas.saveLayerAlpha(this.f68922g, 127, 31);
        }
        this.f68918c.j().draw(canvas);
        this.f68918c.m().setAlpha(g());
        this.f68918c.m().draw(canvas);
        this.f68918c.s().draw(canvas);
        if (z10) {
            canvas.restore();
        }
        if (f68916t) {
            this.f68932q.setColor(Color.parseColor("#AA0000"));
            canvas.drawRect(this.f68920e, this.f68932q);
            this.f68932q.setColor(Color.parseColor("#00FF00"));
            canvas.drawRect(this.f68919d, this.f68932q);
            this.f68932q.setColor(Color.parseColor("#0000FF"));
            canvas.drawRect(this.f68921f, this.f68932q);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.f.f32263fd, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        setMeasuredDimension(n(i10), m(i11));
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.f.f32286gd, new Class[]{cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        super.onSizeChanged(i10, i11, i12, i13);
        s();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0085  */
    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean statusBasedOnPos;
        int i10;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, c.f.f32538rd, new Class[]{MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this.f68925j || !isEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        float x10 = motionEvent.getX() - this.f68926k;
        float y10 = motionEvent.getY() - this.f68927l;
        if (action == 0) {
            h();
            this.f68926k = motionEvent.getX();
            this.f68927l = motionEvent.getY();
            this.f68928m = this.f68926k;
            setPressed(true);
        } else if (action == 1) {
            setPressed(false);
            statusBasedOnPos = getStatusBasedOnPos();
            float eventTime = motionEvent.getEventTime() - motionEvent.getDownTime();
            i10 = this.f68930o;
            if (x10 < i10 || y10 >= i10 || eventTime >= this.f68931p) {
                x(statusBasedOnPos);
            } else {
                performClick();
            }
        } else if (action == 2) {
            float x11 = motionEvent.getX();
            o((int) (x11 - this.f68928m));
            this.f68928m = x11;
        } else if (action == 3) {
            setPressed(false);
            statusBasedOnPos = getStatusBasedOnPos();
            float eventTime2 = motionEvent.getEventTime() - motionEvent.getDownTime();
            i10 = this.f68930o;
            if (x10 < i10) {
                x(statusBasedOnPos);
            } else {
                x(statusBasedOnPos);
            }
        }
        invalidate();
        return true;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public boolean performClick() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.f32582td, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : super.performClick();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, c.f.f32626vd, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        setChecked(z10, true);
    }

    public void setChecked(boolean z10, boolean z11) {
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.f.f32648wd, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        if (this.f68921f != null) {
            int measuredWidth = getMeasuredWidth();
            if (!z10) {
                measuredWidth = -measuredWidth;
            }
            o(measuredWidth);
        }
        r(z10, z11);
    }

    public void setConfiguration(b bVar) {
        if (PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, c.f.f32240ed, new Class[]{b.class}, Void.TYPE).isSupported) {
            return;
        }
        if (this.f68918c == null) {
            this.f68918c = b.a(bVar.c());
        }
        this.f68918c.O(bVar.k());
        this.f68918c.Q(bVar.n());
        this.f68918c.T(bVar.t());
        this.f68918c.b0(bVar.y(), bVar.v(), bVar.w(), bVar.x());
        this.f68918c.d0(bVar.z(), bVar.u());
        this.f68918c.e0(bVar.B());
        this.f68918c.K(bVar.h());
        this.f68923h.i(this.f68918c.B());
        requestLayout();
        s();
        setChecked(this.f68917b);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        if (PatchProxy.proxy(new Object[]{onCheckedChangeListener}, this, changeQuickRedirect, false, c.f.Bd, new Class[]{CompoundButton.OnCheckedChangeListener.class}, Void.TYPE).isSupported) {
            return;
        }
        if (onCheckedChangeListener == null) {
            throw new IllegalArgumentException("onCheckedChangeListener can not be null");
        }
        this.f68934s = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.f32670xd, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        y(true);
    }

    public void x(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, c.f.Ed, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported || this.f68925j) {
            return;
        }
        this.f68923h.j(this.f68921f.left, z10 ? this.f68919d.right - this.f68918c.z() : this.f68919d.left);
    }

    public void y(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, c.f.f32692yd, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            x(!this.f68917b);
        } else {
            setChecked(!this.f68917b);
        }
    }
}
