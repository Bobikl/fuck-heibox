package com.max.xiaoheihe.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.p0;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes13.dex */
public class ClockView extends View {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f95811o = 6;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f95812p = 95;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f95813q = 28;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f95814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f95815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f95816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f95817e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f95818f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f95819g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f95820h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Paint f95821i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Paint f95822j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private RectF f95823k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Paint f95824l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Paint.FontMetrics f95825m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Paint f95826n;

    public ClockView(Context context) {
        this(context, null);
    }

    public ClockView(Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ClockView(Context context, @p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        e(context, attributeSet);
        f();
    }

    private void b(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, 49404, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        canvas.translate(getPaddingLeft() + this.f95818f, getPaddingTop() + this.f95818f);
        canvas.drawArc(this.f95823k, 170.0f, 200.0f, false, this.f95821i);
    }

    private void c(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, 49406, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        canvas.rotate(170.0f);
        for (int i10 = -10; i10 <= 190; i10 += 5) {
            if (i10 == 180 || i10 == 90 || i10 == 0) {
                canvas.drawLine(this.f95819g - a(20), 0.0f, this.f95819g - a(13), 0.0f, this.f95824l);
            } else {
                canvas.drawLine(this.f95819g - a(16), 0.0f, this.f95819g - a(13), 0.0f, this.f95824l);
            }
            canvas.rotate(5.0f);
        }
        canvas.save();
        canvas.rotate(200.0f);
        for (int i11 = 0; i11 < 4; i11++) {
            int i12 = this.f95818f;
            canvas.drawLine((i12 - this.f95817e) - 1, 0.0f, i12 + 1, 0.0f, this.f95826n);
            canvas.rotate(30.0f);
        }
        canvas.restore();
    }

    private void d(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, 49405, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        canvas.drawArc(this.f95823k, 170.0f, this.f95820h * 2.0f, false, this.f95822j);
    }

    private void e(Context context, AttributeSet attributeSet) {
        if (PatchProxy.proxy(new Object[]{context, attributeSet}, this, changeQuickRedirect, false, 49400, new Class[]{Context.class, AttributeSet.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f95814b = com.max.xiaoheihe.utils.d.E(R.color.divider_secondary_1_color);
        this.f95815c = com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color);
        this.f95816d = com.max.xiaoheihe.utils.d.E(R.color.border_color_2);
        this.f95817e = ViewUtils.f(context, 6.0f);
        this.f95818f = ViewUtils.f(context, 95.0f);
    }

    private void f() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49401, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Paint paint = new Paint();
        this.f95821i = paint;
        paint.setAntiAlias(true);
        this.f95821i.setStyle(Paint.Style.STROKE);
        this.f95821i.setStrokeCap(Paint.Cap.ROUND);
        this.f95821i.setStrokeWidth(this.f95817e);
        this.f95821i.setColor(this.f95814b);
        Paint paint2 = new Paint();
        this.f95824l = paint2;
        paint2.setAntiAlias(true);
        this.f95824l.setStyle(Paint.Style.STROKE);
        this.f95824l.setStrokeCap(Paint.Cap.ROUND);
        this.f95824l.setStrokeWidth(a(1));
        this.f95824l.setColor(this.f95816d);
        Paint paint3 = new Paint();
        this.f95826n = paint3;
        paint3.setAntiAlias(true);
        this.f95826n.setStyle(Paint.Style.STROKE);
        this.f95826n.setStrokeWidth(a(2));
        this.f95826n.setColor(com.max.xiaoheihe.utils.d.E(R.color.white));
        Paint paint4 = new Paint();
        this.f95822j = paint4;
        paint4.setAntiAlias(true);
        this.f95822j.setStyle(Paint.Style.STROKE);
        this.f95822j.setStrokeWidth(this.f95817e);
        this.f95822j.setColor(this.f95815c);
        this.f95822j.setStrokeCap(Paint.Cap.ROUND);
    }

    public int a(int i10) {
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49408, new Class[]{cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (int) TypedValue.applyDimension(1, i10, getResources().getDisplayMetrics());
    }

    public int g(int i10) {
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49409, new Class[]{cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (int) TypedValue.applyDimension(2, i10, getResources().getDisplayMetrics());
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, 49403, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onDraw(canvas);
        b(canvas);
        d(canvas);
        c(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49402, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode != 1073741824) {
            int paddingLeft = getPaddingLeft() + (this.f95818f * 2) + getPaddingRight();
            size = mode == Integer.MIN_VALUE ? Math.min(paddingLeft, size) : paddingLeft;
        }
        if (mode2 != 1073741824) {
            int paddingTop = getPaddingTop() + (this.f95818f * 2) + getPaddingBottom();
            size2 = mode2 == Integer.MIN_VALUE ? Math.min(paddingTop, size2) : paddingTop;
        }
        setMeasuredDimension(size, size2);
        int iMin = Math.min((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) / 2;
        this.f95818f = iMin;
        this.f95819g = iMin - (this.f95817e / 2);
        int i12 = this.f95819g;
        this.f95823k = new RectF(-i12, -i12, i12, i12);
    }

    public void setCompleteDegree(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 49407, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f95820h = i10;
        invalidate();
    }
}
