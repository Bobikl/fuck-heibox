package com.max.hbcustomview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.l;
import androidx.annotation.p0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes10.dex */
public class CircleProgressView extends View {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f68381j = "CircleProgressView";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f68382k = 30;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f68383l = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f68384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f68385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f68386d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f68387e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f68388f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f68389g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f68390h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f68391i;

    public CircleProgressView(Context context) {
        this(context, null);
    }

    public CircleProgressView(Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircleProgressView(Context context, @p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f68384b = 1.0f;
        this.f68385c = 0.0f;
        d(context, attributeSet, i10);
    }

    public static int a(Context context, float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Float(f10)}, null, changeQuickRedirect, true, bb.c.f.E3, new Class[]{Context.class, Float.TYPE}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (int) ((f10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private void b(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.f.f32704z3, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.f68391i);
        paint.setColor(this.f68387e);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, this.f68390h, paint);
    }

    private void c(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.f.A3, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        if (this.f68389g) {
            paint.setStrokeCap(Paint.Cap.ROUND);
        }
        paint.setStrokeWidth(this.f68391i);
        paint.setColor(this.f68388f);
        RectF rectF = new RectF();
        float f10 = this.f68391i;
        rectF.set(f10 / 2.0f, f10 / 2.0f, getMeasuredWidth() - (this.f68391i / 2.0f), getMeasuredHeight() - (this.f68391i / 2.0f));
        canvas.drawArc(rectF, -90.0f, this.f68385c * 360.0f, false, paint);
    }

    private void d(Context context, AttributeSet attributeSet, int i10) {
        if (PatchProxy.proxy(new Object[]{context, attributeSet, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32638w3, new Class[]{Context.class, AttributeSet.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f68386d = a(context, 30.0f);
        this.f68391i = a(context, 3.0f);
        this.f68387e = getResources().getColor(R.color.black_37);
        this.f68388f = getResources().getColor(R.color.pubg_solo_color);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.U, i10, 0);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            if (index == R.styleable.CircleProgressView_progress_radius) {
                this.f68386d = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f68386d);
            } else if (index == R.styleable.CircleProgressView_progress_ring_width) {
                this.f68391i = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, (int) this.f68391i);
            } else if (index == R.styleable.CircleProgressView_progress_bg_color) {
                this.f68387e = typedArrayObtainStyledAttributes.getColor(index, this.f68387e);
            } else if (index == R.styleable.CircleProgressView_progress_pb_color) {
                this.f68388f = typedArrayObtainStyledAttributes.getColor(index, this.f68388f);
            } else if (index == R.styleable.CircleProgressView_progress_pb_round) {
                this.f68389g = typedArrayObtainStyledAttributes.getBoolean(index, false);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public CircleProgressView e(@l int i10) {
        this.f68387e = i10;
        return this;
    }

    public CircleProgressView f(float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.f.D3, new Class[]{Float.TYPE}, CircleProgressView.class);
        if (patchProxyResultProxy.isSupported) {
            return (CircleProgressView) patchProxyResultProxy.result;
        }
        this.f68385c = f10;
        if (f10 > 1.0f || f10 < 0.0f) {
            this.f68385c = 0.0f;
        }
        invalidate();
        return this;
    }

    public CircleProgressView g(@l int i10) {
        this.f68388f = i10;
        return this;
    }

    public CircleProgressView h(float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.f.B3, new Class[]{Float.TYPE}, CircleProgressView.class);
        if (patchProxyResultProxy.isSupported) {
            return (CircleProgressView) patchProxyResultProxy.result;
        }
        this.f68390h = f10;
        if (f10 < 0.0f) {
            a(getContext(), 30.0f);
        }
        return this;
    }

    public CircleProgressView i(float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.f.C3, new Class[]{Float.TYPE}, CircleProgressView.class);
        if (patchProxyResultProxy.isSupported) {
            return (CircleProgressView) patchProxyResultProxy.result;
        }
        this.f68391i = f10;
        if (f10 < 0.0f) {
            this.f68391i = a(getContext(), 3.0f);
        }
        return this;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.f.f32682y3, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f68390h = (Math.min(getMeasuredHeight(), getMeasuredWidth()) / 2) - (this.f68391i / 2.0f);
        b(canvas);
        c(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32660x3, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        setMeasuredDimension(View.getDefaultSize(this.f68386d, i10), View.getDefaultSize(this.f68386d, i11));
    }
}
