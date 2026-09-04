package com.huawei.hms.scankit;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.huawei.hms.scankit.p.u6;

/* JADX INFO: loaded from: classes7.dex */
public final class ViewfinderView extends View {
    private int[] A;
    private float[] B;
    private Rect C;
    private boolean D;
    Point E;
    private boolean F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Paint f61304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TextPaint f61305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f61306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f61307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f61308e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f61309f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f61310g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f61311h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private c f61312i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f61313j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f61314k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f61315l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f61316m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f61317n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f61318o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f61319p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f61320q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f61321r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f61322s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private b f61323t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f61324u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f61325v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Rect f61326w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f61327x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private ValueAnimator f61328y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    Paint f61329z;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewfinderView.this.f61316m = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            ViewfinderView.this.invalidate();
        }
    }

    public enum b {
        NONE(0),
        LINE(1),
        GRID(2);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f61335a;

        b(int i10) {
            this.f61335a = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b b(int i10) {
            for (b bVar : values()) {
                if (bVar.f61335a == i10) {
                    return bVar;
                }
            }
            return LINE;
        }
    }

    public enum c {
        TOP(0),
        BOTTOM(1);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f61339a;

        c(int i10) {
            this.f61339a = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c b(int i10) {
            for (c cVar : values()) {
                if (cVar.f61339a == i10) {
                    return cVar;
                }
            }
            return TOP;
        }
    }

    public ViewfinderView(Context context) {
        this(context, null);
    }

    public ViewfinderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewfinderView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f61316m = 0;
        this.f61317n = 0;
        this.f61326w = new Rect();
        this.f61329z = new Paint();
        this.A = new int[]{Color.parseColor("#FFFFFFFF"), Color.parseColor("#72FFFFFF"), Color.parseColor("#58FFFFFF"), Color.parseColor("#40FFFFFF"), Color.parseColor("#28FFFFFF"), Color.parseColor("#13FFFFFF"), Color.parseColor("#00FFFFFF")};
        this.B = new float[]{0.0f, 0.5f, 0.6f, 0.7f, 0.8f, 0.9f, 1.0f};
        this.D = true;
        this.F = true;
        a(context, attributeSet);
    }

    public static int a(Context context, int i10) {
        return (int) ((i10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ViewfinderView);
        this.f61306c = typedArrayObtainStyledAttributes.getColor(R.styleable.ViewfinderView_scankit_maskColor, b(context, R.color.scankit_viewfinder_mask));
        this.f61307d = typedArrayObtainStyledAttributes.getColor(R.styleable.ViewfinderView_scankit_frameColor, b(context, R.color.scankit_viewfinder_frame));
        this.f61309f = typedArrayObtainStyledAttributes.getColor(R.styleable.ViewfinderView_scankit_cornerColor, b(context, R.color.scankit_viewfinder_corner));
        this.f61308e = typedArrayObtainStyledAttributes.getColor(R.styleable.ViewfinderView_scankit_laserColor, b(context, R.color.scankit_viewfinder_lasers));
        this.f61310g = typedArrayObtainStyledAttributes.getColor(R.styleable.ViewfinderView_scankit_resultPointColor, b(context, R.color.scankit_viewfinder_result_point_color));
        this.f61313j = typedArrayObtainStyledAttributes.getString(R.styleable.ViewfinderView_scankit_labelText);
        this.f61314k = typedArrayObtainStyledAttributes.getColor(R.styleable.ViewfinderView_scankit_labelTextColor, b(context, R.color.scankit_viewfinder_text_color));
        this.f61315l = typedArrayObtainStyledAttributes.getDimension(R.styleable.ViewfinderView_scankit_labelTextSize, TypedValue.applyDimension(2, 14.0f, getResources().getDisplayMetrics()));
        this.f61311h = typedArrayObtainStyledAttributes.getDimension(R.styleable.ViewfinderView_scankit_labelTextPadding, TypedValue.applyDimension(1, 24.0f, getResources().getDisplayMetrics()));
        this.f61312i = c.b(typedArrayObtainStyledAttributes.getInt(R.styleable.ViewfinderView_scankit_labelTextLocation, 0));
        this.f61318o = typedArrayObtainStyledAttributes.getBoolean(R.styleable.ViewfinderView_scankit_showResultPoint, false);
        this.f61321r = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ViewfinderView_scankit_frameWidth, 0);
        this.f61322s = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ViewfinderView_scankit_frameHeight, 0);
        this.f61323t = b.b(typedArrayObtainStyledAttributes.getInt(R.styleable.ViewfinderView_scankit_laserStyle, b.LINE.f61335a));
        this.f61324u = typedArrayObtainStyledAttributes.getInt(R.styleable.ViewfinderView_scankit_gridColumn, 20);
        this.f61325v = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.ViewfinderView_scankit_gridHeight, TypedValue.applyDimension(1, 40.0f, getResources().getDisplayMetrics()));
        this.F = typedArrayObtainStyledAttributes.getBoolean(R.styleable.ViewfinderView_scankit_line_anim, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f61304a = new Paint(1);
        this.f61305b = new TextPaint(1);
        this.f61327x = a(context, 136);
        this.f61320q = getDisplayMetrics().heightPixels;
        this.f61319p = getDisplayMetrics().widthPixels;
    }

    private void a(Canvas canvas) {
        Point point;
        int i10;
        int i11;
        int i12;
        if (this.C == null) {
            return;
        }
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        if (this.D) {
            Point point2 = this.E;
            point = new Point(point2.y, point2.x);
        } else {
            Point point3 = this.E;
            point = new Point(point3.x, point3.y);
        }
        int i13 = point.x;
        float f10 = width / i13;
        int i14 = point.y;
        float f11 = height / i14;
        int i15 = (int) (((double) i14) * 0.1d);
        int i16 = (int) ((((double) i13) * 0.15d) / 2.0d);
        RectF rectF = new RectF();
        if (this.D) {
            if (f10 > f11) {
                i11 = (int) (point.y * f10);
                canvas.translate(0.0f, (height / 2) - (i11 / 2));
                i12 = width;
            } else {
                i10 = (int) (point.x * f11);
                canvas.translate((width / 2) - (i10 / 2), 0.0f);
                i12 = i10;
                i11 = height;
            }
        } else if (f10 > f11) {
            i11 = (int) (point.y * f10);
            canvas.translate(0.0f, (height / 2) - (i11 / 2));
            i12 = width;
        } else {
            i10 = (int) (point.x * f11);
            canvas.translate((width / 2) - (i10 / 2), 0.0f);
            i12 = i10;
            i11 = height;
        }
        Rect rect = this.C;
        float f12 = rect.left + i16;
        float f13 = point.x;
        float f14 = (rect.right + i16) / f13;
        float f15 = rect.top + i15;
        float f16 = point.y;
        float f17 = f15 / f16;
        float f18 = (rect.bottom + i15) / f16;
        float f19 = i12;
        float f20 = (f12 / f13) * f19;
        rectF.left = f20;
        float f21 = f14 * f19;
        rectF.right = f21;
        float f22 = i11;
        float f23 = f17 * f22;
        rectF.top = f23;
        float f24 = f18 * f22;
        rectF.bottom = f24;
        float f25 = (f20 + f21) / 2.0f;
        float f26 = (f23 + f24) / 2.0f;
        this.f61329z.setStyle(Paint.Style.FILL);
        this.f61329z.setColor(-1);
        canvas.drawCircle(f25, f26, ((int) (((double) (getDisplayMetrics().density * 24.0f)) + 0.5d)) / 2, this.f61329z);
        this.f61329z.setColor(Color.parseColor("#007DFF"));
        canvas.drawCircle(f25, f26, ((int) (((double) (getDisplayMetrics().density * 22.0f)) + 0.5d)) / 2, this.f61329z);
        if (this.D) {
            if (f10 > f11) {
                canvas.translate(0.0f, (i11 / 2) - (height / 2));
                return;
            } else {
                canvas.translate((i12 / 2) - (width / 2), 0.0f);
                return;
            }
        }
        if (f10 > f11) {
            canvas.translate(0.0f, (i11 / 2) - (height / 2));
        } else {
            canvas.translate((i12 / 2) - (width / 2), 0.0f);
        }
    }

    private void a(Canvas canvas, boolean z10) {
        this.f61304a.setStyle(Paint.Style.FILL);
        this.f61304a.setColor(this.f61308e);
        if (e.f61461z || z10) {
            Rect rect = this.f61326w;
            int i10 = this.f61319p / 2;
            rect.left = i10 - 540;
            int i11 = this.f61316m;
            rect.top = i11;
            rect.bottom = i11 + this.f61327x;
            rect.right = i10 + 540;
        } else {
            Rect rect2 = this.f61326w;
            rect2.left = 0;
            int i12 = this.f61316m;
            rect2.top = i12;
            rect2.bottom = i12 + this.f61327x;
            rect2.right = this.f61319p;
        }
        int i13 = this.f61319p / 2;
        float f10 = i13;
        float f11 = this.f61326w.bottom + 500;
        this.f61304a.setShader(new RadialGradient(f10, f11, bb.c.b.f30838oa, this.A, this.B, Shader.TileMode.CLAMP));
        this.f61304a.setStrokeWidth(10.0f);
        Rect rect3 = this.f61326w;
        float f12 = rect3.left;
        float f13 = rect3.bottom;
        canvas.drawLine(f12, f13, rect3.right, f13, this.f61304a);
        canvas.clipRect(this.f61326w);
        canvas.drawCircle(f10, f11, i13 + 200, this.f61304a);
    }

    public static int b(Context context, int i10) {
        try {
            return context.getColor(i10);
        } catch (Resources.NotFoundException unused) {
            Log.e("ViewfinderView", "getColor: Resources.NotFoundException");
            return 16777215;
        } catch (Exception unused2) {
            Log.e("ViewfinderView", "getColor: Exception");
            return 16777215;
        }
    }

    private DisplayMetrics getDisplayMetrics() {
        return getResources().getDisplayMetrics();
    }

    public void a() {
        if (e.f61461z) {
            this.f61317n = this.f61320q;
        } else {
            this.f61317n = this.f61320q - a(getContext(), 139);
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, this.f61317n - this.f61327x);
        this.f61328y = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(3000L);
        this.f61328y.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f61328y.setRepeatMode(1);
        this.f61328y.setRepeatCount(-1);
        this.f61328y.addUpdateListener(new a());
        this.f61328y.start();
    }

    public void a(Rect rect, boolean z10, Point point) {
        this.D = z10;
        this.E = point;
        if (this.C == null) {
            this.C = rect;
            invalidate();
        }
    }

    public void a(u6 u6Var) {
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f61328y;
        if (valueAnimator != null) {
            valueAnimator.pause();
            this.f61328y.removeAllListeners();
            this.f61328y.cancel();
        }
    }

    @Override // android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onDraw(Canvas canvas) {
        if (this.F) {
            canvas.save();
            String str = Build.DEVICE;
            a(canvas, "HWTAH".equals(str) || str.equals("HWTAH-C"));
            canvas.restore();
        }
        a(canvas);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f61319p = i10;
        this.f61320q = i11;
        a();
    }
}
