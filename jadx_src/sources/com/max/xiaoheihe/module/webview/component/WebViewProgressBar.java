package com.max.xiaoheihe.module.webview.component;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import bb.c;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes12.dex */
public class WebViewProgressBar extends View {
    private static final String E = "saved_instance";
    private static final String F = "text_color";
    private static final String G = "text_size";
    private static final String H = "reached_bar_height";
    private static final String I = "reached_bar_color";
    private static final String J = "unreached_bar_height";
    private static final String K = "unreached_bar_color";
    private static final String L = "max";
    private static final String M = "progress_bg_wide";
    private static final String N = "text_visibility";
    private static final int O = 0;
    public static ChangeQuickRedirect changeQuickRedirect;
    private final float A;
    private final float B;
    private RectF C;
    private RectF D;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f94603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f94604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f94605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f94606e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f94607f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f94608g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f94609h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f94610i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f94611j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f94612k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f94613l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Paint f94614m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Paint f94615n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Paint f94616o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private RectF f94617p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private RectF f94618q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f94619r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f94620s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f94621t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f94622u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final int f94623v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int f94624w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final int f94625x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final float f94626y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final float f94627z;

    public enum ProgressTextVisibility {
        Visible,
        Invisible;

        public static ChangeQuickRedirect changeQuickRedirect;

        public static ProgressTextVisibility valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 47522, new Class[]{String.class}, ProgressTextVisibility.class);
            return patchProxyResultProxy.isSupported ? (ProgressTextVisibility) patchProxyResultProxy.result : (ProgressTextVisibility) Enum.valueOf(ProgressTextVisibility.class, str);
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static ProgressTextVisibility[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 47521, new Class[0], ProgressTextVisibility[].class);
            return patchProxyResultProxy.isSupported ? (ProgressTextVisibility[]) patchProxyResultProxy.result : (ProgressTextVisibility[]) values().clone();
        }
    }

    public WebViewProgressBar(Context context) {
        this(context, null);
    }

    public WebViewProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f94603b = 100.0f;
        this.f94604c = 0.0f;
        this.f94613l = "";
        this.f94617p = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f94618q = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f94620s = true;
        this.f94621t = true;
        this.f94622u = true;
        int iRgb = Color.rgb(66, 145, c.b.H1);
        this.f94623v = iRgb;
        int iRgb2 = Color.rgb(66, 145, c.b.H1);
        this.f94624w = iRgb2;
        int iRgb3 = Color.rgb(99, 99, 99);
        this.f94625x = iRgb3;
        float fB = b(1.5f);
        this.A = fB;
        float fB2 = b(1.5f);
        this.B = fB2;
        float fE = e(10.0f);
        this.f94627z = fE;
        float fB3 = b(3.0f);
        this.f94626y = fB3;
        this.C = new RectF();
        this.D = new RectF();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Q2);
        this.f94605d = typedArrayObtainStyledAttributes.getColor(5, iRgb2);
        this.f94606e = typedArrayObtainStyledAttributes.getColor(12, iRgb3);
        this.f94607f = typedArrayObtainStyledAttributes.getColor(7, iRgb);
        this.f94608g = typedArrayObtainStyledAttributes.getDimension(9, fE);
        this.f94609h = typedArrayObtainStyledAttributes.getDimension(4, fB);
        this.f94610i = typedArrayObtainStyledAttributes.getDimension(11, fB2);
        this.f94619r = typedArrayObtainStyledAttributes.getDimension(8, fB3);
        typedArrayObtainStyledAttributes.getInt(10, 0);
        setProgress(typedArrayObtainStyledAttributes.getFloat(1, 0.0f));
        setMax(typedArrayObtainStyledAttributes.getFloat(0, 100.0f));
        typedArrayObtainStyledAttributes.recycle();
        c();
    }

    private void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47509, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f94620s = true;
        this.f94621t = true;
        this.f94617p.left = getPaddingLeft();
        this.f94617p.top = (getHeight() / 2.0f) - (this.f94609h / 2.0f);
        this.f94617p.right = ((((getWidth() - getPaddingLeft()) - getPaddingRight()) / (getMax() * 1.0f)) * getProgress()) + getPaddingLeft();
        this.f94617p.bottom = (getHeight() / 2.0f) + (this.f94609h / 2.0f);
        this.f94618q.left = getPaddingLeft();
        this.f94618q.top = (getHeight() / 2.0f) - (this.f94610i / 2.0f);
        this.f94618q.right = getWidth() - getPaddingRight();
        this.f94618q.bottom = (getHeight() / 2.0f) + (this.f94610i / 2.0f);
    }

    private void c() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47508, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Paint paint = new Paint(1);
        this.f94614m = paint;
        paint.setColor(this.f94605d);
        Paint paint2 = new Paint(1);
        this.f94615n = paint2;
        paint2.setColor(this.f94606e);
        Paint paint3 = new Paint(1);
        this.f94616o = paint3;
        paint3.setColor(this.f94607f);
        this.f94616o.setTextSize(this.f94608g);
        this.f94616o.setTypeface(Typeface.SANS_SERIF);
    }

    private int d(int i10, boolean z10) {
        int paddingTop;
        int paddingBottom;
        Object[] objArr = {new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 47506, new Class[]{cls, Boolean.TYPE}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (z10) {
            paddingTop = getPaddingLeft();
            paddingBottom = getPaddingRight();
        } else {
            paddingTop = getPaddingTop();
            paddingBottom = getPaddingBottom();
        }
        int i11 = paddingTop + paddingBottom;
        if (mode == 1073741824) {
            return size;
        }
        int suggestedMinimumWidth = (z10 ? getSuggestedMinimumWidth() : getSuggestedMinimumHeight()) + i11;
        if (mode == Integer.MIN_VALUE) {
            return z10 ? Math.max(suggestedMinimumWidth, size) : Math.min(suggestedMinimumWidth, size);
        }
        return suggestedMinimumWidth;
    }

    public float b(float f10) {
        Object[] objArr = {new Float(f10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 47518, new Class[]{cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : (f10 * getResources().getDisplayMetrics().density) + 0.5f;
    }

    public float e(float f10) {
        Object[] objArr = {new Float(f10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 47519, new Class[]{cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : f10 * getResources().getDisplayMetrics().scaledDensity;
    }

    public float getMax() {
        return this.f94603b;
    }

    public float getProgress() {
        return this.f94604c;
    }

    public float getProgressTextSize() {
        return this.f94608g;
    }

    public boolean getProgressTextVisibility() {
        return this.f94622u;
    }

    public int getReachedBarColor() {
        return this.f94605d;
    }

    public float getReachedBarHeight() {
        return this.f94609h;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47504, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : Math.max((int) this.f94608g, Math.max((int) this.f94609h, (int) this.f94610i));
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return (int) this.f94608g;
    }

    public int getTextColor() {
        return this.f94607f;
    }

    public float getUnreachedBarHeight() {
        return this.f94610i;
    }

    public int getUnreached_color() {
        return this.f94606e;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, 47507, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        a();
        this.C.set(this.f94617p);
        this.D.set(this.f94618q);
        this.f94614m.setAntiAlias(true);
        this.f94615n.setAntiAlias(true);
        if (this.f94621t) {
            canvas.drawRect(this.D, this.f94615n);
        }
        if (this.f94620s) {
            canvas.drawRect(this.C, this.f94614m);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 47505, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        setMeasuredDimension(d(i10, true), d(i11, false));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (PatchProxy.proxy(new Object[]{parcelable}, this, changeQuickRedirect, false, 47517, new Class[]{Parcelable.class}, Void.TYPE).isSupported) {
            return;
        }
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        this.f94607f = bundle.getInt(F);
        this.f94608g = bundle.getFloat(G);
        this.f94609h = bundle.getFloat(H);
        this.f94610i = bundle.getFloat(J);
        this.f94605d = bundle.getInt(I);
        c();
        setMax(bundle.getFloat("max"));
        setProgress(bundle.getFloat(M));
        setProgressTextVisibility(bundle.getBoolean(N) ? ProgressTextVisibility.Visible : ProgressTextVisibility.Invisible);
        super.onRestoreInstanceState(bundle.getParcelable(E));
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47516, new Class[0], Parcelable.class);
        if (patchProxyResultProxy.isSupported) {
            return (Parcelable) patchProxyResultProxy.result;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable(E, super.onSaveInstanceState());
        bundle.putInt(F, getTextColor());
        bundle.putFloat(G, getProgressTextSize());
        bundle.putFloat(H, getReachedBarHeight());
        bundle.putFloat(J, getUnreachedBarHeight());
        bundle.putInt(I, getReachedBarColor());
        bundle.putFloat("max", getMax());
        bundle.putFloat(M, getProgress());
        bundle.putBoolean(N, getProgressTextVisibility());
        return bundle;
    }

    public void setMax(float f10) {
        if (!PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, 47514, new Class[]{Float.TYPE}, Void.TYPE).isSupported && f10 > 0.0f) {
            this.f94603b = f10;
            invalidate();
        }
    }

    public void setProgress(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, 47515, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (f10 > getMax()) {
            f10 = getMax();
        } else if (f10 <= 0.0f) {
            f10 = 0.0f;
        }
        this.f94604c = f10;
        invalidate();
    }

    public void setProgressTextColor(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 47511, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f94607f = i10;
        this.f94616o.setColor(i10);
        invalidate();
    }

    public void setProgressTextSize(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, 47510, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f94608g = f10;
        this.f94616o.setTextSize(f10);
        invalidate();
    }

    public void setProgressTextVisibility(ProgressTextVisibility progressTextVisibility) {
        if (PatchProxy.proxy(new Object[]{progressTextVisibility}, this, changeQuickRedirect, false, 47520, new Class[]{ProgressTextVisibility.class}, Void.TYPE).isSupported) {
            return;
        }
        invalidate();
    }

    public void setReachedBarColor(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 47512, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f94605d = i10;
        this.f94614m.setColor(i10);
        invalidate();
    }

    public void setReachedBarHeight(float f10) {
        this.f94609h = f10;
    }

    public void setUnReachedBarColor(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 47513, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f94606e = i10;
        this.f94615n.setColor(i10);
        invalidate();
    }

    public void setUnreachedBarHeight(float f10) {
        this.f94610i = f10;
    }

    public void setUnreached_color(int i10) {
        this.f94606e = i10;
    }
}
