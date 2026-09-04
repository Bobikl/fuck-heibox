package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewParent;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.R;

/* JADX INFO: loaded from: classes.dex */
public class MotionTelltales extends MockView {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f19221t = "MotionTelltales";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Paint f19222m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    MotionLayout f19223n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    float[] f19224o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    Matrix f19225p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    int f19226q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f19227r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    float f19228s;

    public MotionTelltales(Context context) {
        super(context);
        this.f19222m = new Paint();
        this.f19224o = new float[2];
        this.f19225p = new Matrix();
        this.f19226q = 0;
        this.f19227r = -65281;
        this.f19228s = 0.25f;
        a(context, null);
    }

    public MotionTelltales(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19222m = new Paint();
        this.f19224o = new float[2];
        this.f19225p = new Matrix();
        this.f19226q = 0;
        this.f19227r = -65281;
        this.f19228s = 0.25f;
        a(context, attributeSet);
    }

    public MotionTelltales(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f19222m = new Paint();
        this.f19224o = new float[2];
        this.f19225p = new Matrix();
        this.f19226q = 0;
        this.f19227r = -65281;
        this.f19228s = 0.25f;
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f19394c0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == R.styleable.MotionTelltales_telltales_tailColor) {
                    this.f19227r = typedArrayObtainStyledAttributes.getColor(index, this.f19227r);
                } else if (index == R.styleable.MotionTelltales_telltales_velocityMode) {
                    this.f19226q = typedArrayObtainStyledAttributes.getInt(index, this.f19226q);
                } else if (index == R.styleable.MotionTelltales_telltales_tailScale) {
                    this.f19228s = typedArrayObtainStyledAttributes.getFloat(index, this.f19228s);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f19222m.setColor(this.f19227r);
        this.f19222m.setStrokeWidth(5.0f);
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // androidx.constraintlayout.utils.widget.MockView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getMatrix().invert(this.f19225p);
        if (this.f19223n == null) {
            ViewParent parent = getParent();
            if (parent instanceof MotionLayout) {
                this.f19223n = (MotionLayout) parent;
                return;
            }
            return;
        }
        int width = getWidth();
        int height = getHeight();
        float[] fArr = {0.1f, 0.25f, 0.5f, 0.75f, 0.9f};
        for (int i10 = 0; i10 < 5; i10++) {
            float f10 = fArr[i10];
            for (int i11 = 0; i11 < 5; i11++) {
                float f11 = fArr[i11];
                this.f19223n.E0(this, f11, f10, this.f19224o, this.f19226q);
                this.f19225p.mapVectors(this.f19224o);
                float f12 = width * f11;
                float f13 = height * f10;
                float[] fArr2 = this.f19224o;
                float f14 = fArr2[0];
                float f15 = this.f19228s;
                float f16 = f13 - (fArr2[1] * f15);
                this.f19225p.mapVectors(fArr2);
                canvas.drawLine(f12, f13, f12 - (f14 * f15), f16, this.f19222m);
            }
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        postInvalidate();
    }

    public void setText(CharSequence charSequence) {
        this.f19177g = charSequence.toString();
        requestLayout();
    }
}
