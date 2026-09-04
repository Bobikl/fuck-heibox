package androidx.constraintlayout.utils.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.constraintlayout.motion.widget.c;
import androidx.constraintlayout.motion.widget.e;
import androidx.constraintlayout.widget.R;
import androidx.core.view.n;

/* JADX INFO: loaded from: classes.dex */
public class MotionLabel extends View implements e {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    static String f19190a0 = "MotionLabel";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final int f19191b0 = 1;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final int f19192c0 = 2;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private static final int f19193p1 = 3;
    private int A;
    private boolean B;
    private float C;
    private float D;
    private float E;
    private Drawable F;
    Matrix G;
    private Bitmap H;
    private BitmapShader I;
    private Matrix J;
    private float K;
    private float L;
    private float M;
    private float N;
    Paint O;
    private int P;
    Rect Q;
    Paint R;
    float S;
    float T;
    float U;
    float V;
    float W;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    TextPaint f19194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Path f19195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f19197e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f19198f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f19199g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f19200h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    ViewOutlineProvider f19201i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    RectF f19202j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f19203k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f19204l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f19205m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f19206n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f19207o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f19208p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    boolean f19209q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Rect f19210r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private CharSequence f19211s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f19212t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f19213u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f19214v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f19215w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private String f19216x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Layout f19217y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f19218z;

    public class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            int width = MotionLabel.this.getWidth();
            int height = MotionLabel.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * MotionLabel.this.f19199g) / 2.0f);
        }
    }

    public class b extends ViewOutlineProvider {
        b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, MotionLabel.this.getWidth(), MotionLabel.this.getHeight(), MotionLabel.this.f19200h);
        }
    }

    public MotionLabel(Context context) {
        super(context);
        this.f19194b = new TextPaint();
        this.f19195c = new Path();
        this.f19196d = 65535;
        this.f19197e = 65535;
        this.f19198f = false;
        this.f19199g = 0.0f;
        this.f19200h = Float.NaN;
        this.f19203k = 48.0f;
        this.f19204l = Float.NaN;
        this.f19207o = 0.0f;
        this.f19208p = "Hello World";
        this.f19209q = true;
        this.f19210r = new Rect();
        this.f19212t = 1;
        this.f19213u = 1;
        this.f19214v = 1;
        this.f19215w = 1;
        this.f19218z = 8388659;
        this.A = 0;
        this.B = false;
        this.K = Float.NaN;
        this.L = Float.NaN;
        this.M = 0.0f;
        this.N = 0.0f;
        this.O = new Paint();
        this.P = 0;
        this.T = Float.NaN;
        this.U = Float.NaN;
        this.V = Float.NaN;
        this.W = Float.NaN;
        g(context, null);
    }

    public MotionLabel(Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19194b = new TextPaint();
        this.f19195c = new Path();
        this.f19196d = 65535;
        this.f19197e = 65535;
        this.f19198f = false;
        this.f19199g = 0.0f;
        this.f19200h = Float.NaN;
        this.f19203k = 48.0f;
        this.f19204l = Float.NaN;
        this.f19207o = 0.0f;
        this.f19208p = "Hello World";
        this.f19209q = true;
        this.f19210r = new Rect();
        this.f19212t = 1;
        this.f19213u = 1;
        this.f19214v = 1;
        this.f19215w = 1;
        this.f19218z = 8388659;
        this.A = 0;
        this.B = false;
        this.K = Float.NaN;
        this.L = Float.NaN;
        this.M = 0.0f;
        this.N = 0.0f;
        this.O = new Paint();
        this.P = 0;
        this.T = Float.NaN;
        this.U = Float.NaN;
        this.V = Float.NaN;
        this.W = Float.NaN;
        g(context, attributeSet);
    }

    public MotionLabel(Context context, @p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f19194b = new TextPaint();
        this.f19195c = new Path();
        this.f19196d = 65535;
        this.f19197e = 65535;
        this.f19198f = false;
        this.f19199g = 0.0f;
        this.f19200h = Float.NaN;
        this.f19203k = 48.0f;
        this.f19204l = Float.NaN;
        this.f19207o = 0.0f;
        this.f19208p = "Hello World";
        this.f19209q = true;
        this.f19210r = new Rect();
        this.f19212t = 1;
        this.f19213u = 1;
        this.f19214v = 1;
        this.f19215w = 1;
        this.f19218z = 8388659;
        this.A = 0;
        this.B = false;
        this.K = Float.NaN;
        this.L = Float.NaN;
        this.M = 0.0f;
        this.N = 0.0f;
        this.O = new Paint();
        this.P = 0;
        this.T = Float.NaN;
        this.U = Float.NaN;
        this.V = Float.NaN;
        this.W = Float.NaN;
        g(context, attributeSet);
    }

    private void d(float f10, float f11, float f12, float f13) {
        if (this.J == null) {
            return;
        }
        this.D = f12 - f10;
        this.E = f13 - f11;
        l();
    }

    private void g(Context context, AttributeSet attributeSet) {
        i(context, attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.Z);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == R.styleable.MotionLabel_android_text) {
                    setText(typedArrayObtainStyledAttributes.getText(index));
                } else if (index == R.styleable.MotionLabel_android_fontFamily) {
                    this.f19216x = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == R.styleable.MotionLabel_scaleFromTextSize) {
                    this.f19204l = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, (int) this.f19204l);
                } else if (index == R.styleable.MotionLabel_android_textSize) {
                    this.f19203k = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, (int) this.f19203k);
                } else if (index == R.styleable.MotionLabel_android_textStyle) {
                    this.f19205m = typedArrayObtainStyledAttributes.getInt(index, this.f19205m);
                } else if (index == R.styleable.MotionLabel_android_typeface) {
                    this.f19206n = typedArrayObtainStyledAttributes.getInt(index, this.f19206n);
                } else if (index == R.styleable.MotionLabel_android_textColor) {
                    this.f19196d = typedArrayObtainStyledAttributes.getColor(index, this.f19196d);
                } else if (index == R.styleable.MotionLabel_borderRound) {
                    float dimension = typedArrayObtainStyledAttributes.getDimension(index, this.f19200h);
                    this.f19200h = dimension;
                    setRound(dimension);
                } else if (index == R.styleable.MotionLabel_borderRoundPercent) {
                    float f10 = typedArrayObtainStyledAttributes.getFloat(index, this.f19199g);
                    this.f19199g = f10;
                    setRoundPercent(f10);
                } else if (index == R.styleable.MotionLabel_android_gravity) {
                    setGravity(typedArrayObtainStyledAttributes.getInt(index, -1));
                } else if (index == R.styleable.MotionLabel_android_autoSizeTextType) {
                    this.A = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == R.styleable.MotionLabel_textOutlineColor) {
                    this.f19197e = typedArrayObtainStyledAttributes.getInt(index, this.f19197e);
                    this.f19198f = true;
                } else if (index == R.styleable.MotionLabel_textOutlineThickness) {
                    this.f19207o = typedArrayObtainStyledAttributes.getDimension(index, this.f19207o);
                    this.f19198f = true;
                } else if (index == R.styleable.MotionLabel_textBackground) {
                    this.F = typedArrayObtainStyledAttributes.getDrawable(index);
                    this.f19198f = true;
                } else if (index == R.styleable.MotionLabel_textBackgroundPanX) {
                    this.T = typedArrayObtainStyledAttributes.getFloat(index, this.T);
                } else if (index == R.styleable.MotionLabel_textBackgroundPanY) {
                    this.U = typedArrayObtainStyledAttributes.getFloat(index, this.U);
                } else if (index == R.styleable.MotionLabel_textPanX) {
                    this.M = typedArrayObtainStyledAttributes.getFloat(index, this.M);
                } else if (index == R.styleable.MotionLabel_textPanY) {
                    this.N = typedArrayObtainStyledAttributes.getFloat(index, this.N);
                } else if (index == R.styleable.MotionLabel_textBackgroundRotate) {
                    this.W = typedArrayObtainStyledAttributes.getFloat(index, this.W);
                } else if (index == R.styleable.MotionLabel_textBackgroundZoom) {
                    this.V = typedArrayObtainStyledAttributes.getFloat(index, this.V);
                } else if (index == R.styleable.MotionLabel_textureHeight) {
                    this.K = typedArrayObtainStyledAttributes.getDimension(index, this.K);
                } else if (index == R.styleable.MotionLabel_textureWidth) {
                    this.L = typedArrayObtainStyledAttributes.getDimension(index, this.L);
                } else if (index == R.styleable.MotionLabel_textureEffect) {
                    this.P = typedArrayObtainStyledAttributes.getInt(index, this.P);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        k();
        j();
    }

    private float getHorizontalOffset() {
        float f10 = Float.isNaN(this.f19204l) ? 1.0f : this.f19203k / this.f19204l;
        TextPaint textPaint = this.f19194b;
        String str = this.f19208p;
        return (((((Float.isNaN(this.D) ? getMeasuredWidth() : this.D) - getPaddingLeft()) - getPaddingRight()) - (f10 * textPaint.measureText(str, 0, str.length()))) * (this.M + 1.0f)) / 2.0f;
    }

    private float getVerticalOffset() {
        float f10 = Float.isNaN(this.f19204l) ? 1.0f : this.f19203k / this.f19204l;
        Paint.FontMetrics fontMetrics = this.f19194b.getFontMetrics();
        float measuredHeight = ((Float.isNaN(this.E) ? getMeasuredHeight() : this.E) - getPaddingTop()) - getPaddingBottom();
        float f11 = fontMetrics.descent;
        float f12 = fontMetrics.ascent;
        return (((measuredHeight - ((f11 - f12) * f10)) * (1.0f - this.N)) / 2.0f) - (f10 * f12);
    }

    private void h(String str, int i10, int i11) {
        Typeface typefaceCreate;
        if (str != null) {
            typefaceCreate = Typeface.create(str, i11);
            if (typefaceCreate != null) {
                setTypeface(typefaceCreate);
                return;
            }
        } else {
            typefaceCreate = null;
        }
        if (i10 == 1) {
            typefaceCreate = Typeface.SANS_SERIF;
        } else if (i10 == 2) {
            typefaceCreate = Typeface.SERIF;
        } else if (i10 == 3) {
            typefaceCreate = Typeface.MONOSPACE;
        }
        if (i11 <= 0) {
            this.f19194b.setFakeBoldText(false);
            this.f19194b.setTextSkewX(0.0f);
            setTypeface(typefaceCreate);
        } else {
            Typeface typefaceDefaultFromStyle = typefaceCreate == null ? Typeface.defaultFromStyle(i11) : Typeface.create(typefaceCreate, i11);
            setTypeface(typefaceDefaultFromStyle);
            int i12 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i11;
            this.f19194b.setFakeBoldText((i12 & 1) != 0);
            this.f19194b.setTextSkewX((i12 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    private void i(Context context, @p0 AttributeSet attributeSet) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(androidx.appcompat.R.attr.colorPrimary, typedValue, true);
        TextPaint textPaint = this.f19194b;
        int i10 = typedValue.data;
        this.f19196d = i10;
        textPaint.setColor(i10);
    }

    private void k() {
        if (this.F != null) {
            this.J = new Matrix();
            int intrinsicWidth = this.F.getIntrinsicWidth();
            int intrinsicHeight = this.F.getIntrinsicHeight();
            if (intrinsicWidth <= 0 && (intrinsicWidth = getWidth()) == 0) {
                intrinsicWidth = Float.isNaN(this.L) ? 128 : (int) this.L;
            }
            if (intrinsicHeight <= 0 && (intrinsicHeight = getHeight()) == 0) {
                intrinsicHeight = Float.isNaN(this.K) ? 128 : (int) this.K;
            }
            if (this.P != 0) {
                intrinsicWidth /= 2;
                intrinsicHeight /= 2;
            }
            this.H = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.H);
            this.F.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            this.F.setFilterBitmap(true);
            this.F.draw(canvas);
            if (this.P != 0) {
                this.H = e(this.H, 4);
            }
            Bitmap bitmap = this.H;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.I = new BitmapShader(bitmap, tileMode, tileMode);
        }
    }

    private void l() {
        float f10 = Float.isNaN(this.T) ? 0.0f : this.T;
        float f11 = Float.isNaN(this.U) ? 0.0f : this.U;
        float f12 = Float.isNaN(this.V) ? 1.0f : this.V;
        float f13 = Float.isNaN(this.W) ? 0.0f : this.W;
        this.J.reset();
        float width = this.H.getWidth();
        float height = this.H.getHeight();
        float f14 = Float.isNaN(this.L) ? this.D : this.L;
        float f15 = Float.isNaN(this.K) ? this.E : this.K;
        float f16 = f12 * (width * f15 < height * f14 ? f14 / width : f15 / height);
        this.J.postScale(f16, f16);
        float f17 = width * f16;
        float f18 = f14 - f17;
        float f19 = f16 * height;
        float f20 = f15 - f19;
        if (!Float.isNaN(this.K)) {
            f20 = this.K / 2.0f;
        }
        if (!Float.isNaN(this.L)) {
            f18 = this.L / 2.0f;
        }
        this.J.postTranslate((((f10 * f18) + f14) - f17) * 0.5f, (((f11 * f20) + f15) - f19) * 0.5f);
        this.J.postRotate(f13, f14 / 2.0f, f15 / 2.0f);
        this.I.setLocalMatrix(this.J);
    }

    @Override // androidx.constraintlayout.motion.widget.e
    public void a(float f10, float f11, float f12, float f13) {
        int i10 = (int) (f10 + 0.5f);
        this.C = f10 - i10;
        int i11 = (int) (f12 + 0.5f);
        int i12 = i11 - i10;
        int i13 = (int) (f13 + 0.5f);
        int i14 = (int) (0.5f + f11);
        int i15 = i13 - i14;
        float f14 = f12 - f10;
        this.D = f14;
        float f15 = f13 - f11;
        this.E = f15;
        d(f10, f11, f12, f13);
        if (getMeasuredHeight() == i15 && getMeasuredWidth() == i12) {
            super.layout(i10, i14, i11, i13);
        } else {
            measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(i15, 1073741824));
            super.layout(i10, i14, i11, i13);
        }
        if (this.B) {
            if (this.Q == null) {
                this.R = new Paint();
                this.Q = new Rect();
                this.R.set(this.f19194b);
                this.S = this.R.getTextSize();
            }
            this.D = f14;
            this.E = f15;
            Paint paint = this.R;
            String str = this.f19208p;
            paint.getTextBounds(str, 0, str.length(), this.Q);
            int iWidth = this.Q.width();
            float fHeight = this.Q.height() * 1.3f;
            float f16 = (f14 - this.f19213u) - this.f19212t;
            float f17 = (f15 - this.f19215w) - this.f19214v;
            float f18 = iWidth;
            if (f18 * f17 > fHeight * f16) {
                this.f19194b.setTextSize((this.S * f16) / f18);
            } else {
                this.f19194b.setTextSize((this.S * f17) / fHeight);
            }
            if (this.f19198f || !Float.isNaN(this.f19204l)) {
                f(Float.isNaN(this.f19204l) ? 1.0f : this.f19203k / this.f19204l);
            }
        }
    }

    Bitmap e(Bitmap bitmap, int i10) {
        System.nanoTime();
        int width = bitmap.getWidth() / 2;
        int height = bitmap.getHeight() / 2;
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, width, height, true);
        for (int i11 = 0; i11 < i10 && width >= 32 && height >= 32; i11++) {
            width /= 2;
            height /= 2;
            bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, width, height, true);
        }
        return bitmapCreateScaledBitmap;
    }

    void f(float f10) {
        if (this.f19198f || f10 != 1.0f) {
            this.f19195c.reset();
            String str = this.f19208p;
            int length = str.length();
            this.f19194b.getTextBounds(str, 0, length, this.f19210r);
            this.f19194b.getTextPath(str, 0, length, 0.0f, 0.0f, this.f19195c);
            if (f10 != 1.0f) {
                Log.v(f19190a0, c.f() + " scale " + f10);
                Matrix matrix = new Matrix();
                matrix.postScale(f10, f10);
                this.f19195c.transform(matrix);
            }
            Rect rect = this.f19210r;
            rect.right--;
            rect.left++;
            rect.bottom++;
            rect.top--;
            RectF rectF = new RectF();
            rectF.bottom = getHeight();
            rectF.right = getWidth();
            this.f19209q = false;
        }
    }

    public float getRound() {
        return this.f19200h;
    }

    public float getRoundPercent() {
        return this.f19199g;
    }

    public float getScaleFromTextSize() {
        return this.f19204l;
    }

    public float getTextBackgroundPanX() {
        return this.T;
    }

    public float getTextBackgroundPanY() {
        return this.U;
    }

    public float getTextBackgroundRotate() {
        return this.W;
    }

    public float getTextBackgroundZoom() {
        return this.V;
    }

    public int getTextOutlineColor() {
        return this.f19197e;
    }

    public float getTextPanX() {
        return this.M;
    }

    public float getTextPanY() {
        return this.N;
    }

    public float getTextureHeight() {
        return this.K;
    }

    public float getTextureWidth() {
        return this.L;
    }

    public Typeface getTypeface() {
        return this.f19194b.getTypeface();
    }

    void j() {
        this.f19212t = getPaddingLeft();
        this.f19213u = getPaddingRight();
        this.f19214v = getPaddingTop();
        this.f19215w = getPaddingBottom();
        h(this.f19216x, this.f19206n, this.f19205m);
        this.f19194b.setColor(this.f19196d);
        this.f19194b.setStrokeWidth(this.f19207o);
        this.f19194b.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f19194b.setFlags(128);
        setTextSize(this.f19203k);
        this.f19194b.setAntiAlias(true);
    }

    @Override // android.view.View
    public void layout(int i10, int i11, int i12, int i13) {
        super.layout(i10, i11, i12, i13);
        boolean zIsNaN = Float.isNaN(this.f19204l);
        float f10 = zIsNaN ? 1.0f : this.f19203k / this.f19204l;
        this.D = i12 - i10;
        this.E = i13 - i11;
        if (this.B) {
            if (this.Q == null) {
                this.R = new Paint();
                this.Q = new Rect();
                this.R.set(this.f19194b);
                this.S = this.R.getTextSize();
            }
            Paint paint = this.R;
            String str = this.f19208p;
            paint.getTextBounds(str, 0, str.length(), this.Q);
            int iWidth = this.Q.width();
            int iHeight = (int) (this.Q.height() * 1.3f);
            float f11 = (this.D - this.f19213u) - this.f19212t;
            float f12 = (this.E - this.f19215w) - this.f19214v;
            if (zIsNaN) {
                float f13 = iWidth;
                float f14 = iHeight;
                if (f13 * f12 > f14 * f11) {
                    this.f19194b.setTextSize((this.S * f11) / f13);
                } else {
                    this.f19194b.setTextSize((this.S * f12) / f14);
                }
            } else {
                float f15 = iWidth;
                float f16 = iHeight;
                f10 = f15 * f12 > f16 * f11 ? f11 / f15 : f12 / f16;
            }
        }
        if (this.f19198f || !zIsNaN) {
            d(i10, i11, i12, i13);
            f(f10);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float f10 = Float.isNaN(this.f19204l) ? 1.0f : this.f19203k / this.f19204l;
        super.onDraw(canvas);
        if (!this.f19198f && f10 == 1.0f) {
            canvas.drawText(this.f19208p, this.C + this.f19212t + getHorizontalOffset(), this.f19214v + getVerticalOffset(), this.f19194b);
            return;
        }
        if (this.f19209q) {
            f(f10);
        }
        if (this.G == null) {
            this.G = new Matrix();
        }
        if (!this.f19198f) {
            float horizontalOffset = this.f19212t + getHorizontalOffset();
            float verticalOffset = this.f19214v + getVerticalOffset();
            this.G.reset();
            this.G.preTranslate(horizontalOffset, verticalOffset);
            this.f19195c.transform(this.G);
            this.f19194b.setColor(this.f19196d);
            this.f19194b.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f19194b.setStrokeWidth(this.f19207o);
            canvas.drawPath(this.f19195c, this.f19194b);
            this.G.reset();
            this.G.preTranslate(-horizontalOffset, -verticalOffset);
            this.f19195c.transform(this.G);
            return;
        }
        this.O.set(this.f19194b);
        this.G.reset();
        float horizontalOffset2 = this.f19212t + getHorizontalOffset();
        float verticalOffset2 = this.f19214v + getVerticalOffset();
        this.G.postTranslate(horizontalOffset2, verticalOffset2);
        this.G.preScale(f10, f10);
        this.f19195c.transform(this.G);
        if (this.I != null) {
            this.f19194b.setFilterBitmap(true);
            this.f19194b.setShader(this.I);
        } else {
            this.f19194b.setColor(this.f19196d);
        }
        this.f19194b.setStyle(Paint.Style.FILL);
        this.f19194b.setStrokeWidth(this.f19207o);
        canvas.drawPath(this.f19195c, this.f19194b);
        if (this.I != null) {
            this.f19194b.setShader(null);
        }
        this.f19194b.setColor(this.f19197e);
        this.f19194b.setStyle(Paint.Style.STROKE);
        this.f19194b.setStrokeWidth(this.f19207o);
        canvas.drawPath(this.f19195c, this.f19194b);
        this.G.reset();
        this.G.postTranslate(-horizontalOffset2, -verticalOffset2);
        this.f19195c.transform(this.G);
        this.f19194b.set(this.O);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        this.B = false;
        this.f19212t = getPaddingLeft();
        this.f19213u = getPaddingRight();
        this.f19214v = getPaddingTop();
        this.f19215w = getPaddingBottom();
        if (mode != 1073741824 || mode2 != 1073741824) {
            TextPaint textPaint = this.f19194b;
            String str = this.f19208p;
            textPaint.getTextBounds(str, 0, str.length(), this.f19210r);
            if (mode != 1073741824) {
                size = (int) (this.f19210r.width() + 0.99999f);
            }
            size += this.f19212t + this.f19213u;
            if (mode2 != 1073741824) {
                int fontMetricsInt = (int) (this.f19194b.getFontMetricsInt(null) + 0.99999f);
                if (mode2 == Integer.MIN_VALUE) {
                    fontMetricsInt = Math.min(size2, fontMetricsInt);
                }
                size2 = this.f19214v + this.f19215w + fontMetricsInt;
            }
        } else if (this.A != 0) {
            this.B = true;
        }
        setMeasuredDimension(size, size2);
    }

    @SuppressLint({"RtlHardcoded"})
    public void setGravity(int i10) {
        if ((i10 & n.f21703d) == 0) {
            i10 |= n.f21701b;
        }
        if ((i10 & 112) == 0) {
            i10 |= 48;
        }
        if (i10 != this.f19218z) {
            invalidate();
        }
        this.f19218z = i10;
        int i11 = i10 & 112;
        if (i11 == 48) {
            this.N = -1.0f;
        } else if (i11 != 80) {
            this.N = 0.0f;
        } else {
            this.N = 1.0f;
        }
        int i12 = i10 & n.f21703d;
        if (i12 != 3) {
            if (i12 != 5) {
                if (i12 != 8388611) {
                    if (i12 != 8388613) {
                        this.M = 0.0f;
                        return;
                    }
                }
            }
            this.M = 1.0f;
            return;
        }
        this.M = -1.0f;
    }

    @w0(21)
    public void setRound(float f10) {
        if (Float.isNaN(f10)) {
            this.f19200h = f10;
            float f11 = this.f19199g;
            this.f19199g = -1.0f;
            setRoundPercent(f11);
            return;
        }
        boolean z10 = this.f19200h != f10;
        this.f19200h = f10;
        if (f10 != 0.0f) {
            if (this.f19195c == null) {
                this.f19195c = new Path();
            }
            if (this.f19202j == null) {
                this.f19202j = new RectF();
            }
            if (this.f19201i == null) {
                b bVar = new b();
                this.f19201i = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f19202j.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f19195c.reset();
            Path path = this.f19195c;
            RectF rectF = this.f19202j;
            float f12 = this.f19200h;
            path.addRoundRect(rectF, f12, f12, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    @w0(21)
    public void setRoundPercent(float f10) {
        boolean z10 = this.f19199g != f10;
        this.f19199g = f10;
        if (f10 != 0.0f) {
            if (this.f19195c == null) {
                this.f19195c = new Path();
            }
            if (this.f19202j == null) {
                this.f19202j = new RectF();
            }
            if (this.f19201i == null) {
                a aVar = new a();
                this.f19201i = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f19199g) / 2.0f;
            this.f19202j.set(0.0f, 0.0f, width, height);
            this.f19195c.reset();
            this.f19195c.addRoundRect(this.f19202j, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    public void setScaleFromTextSize(float f10) {
        this.f19204l = f10;
    }

    public void setText(CharSequence charSequence) {
        this.f19208p = charSequence.toString();
        invalidate();
    }

    public void setTextBackgroundPanX(float f10) {
        this.T = f10;
        l();
        invalidate();
    }

    public void setTextBackgroundPanY(float f10) {
        this.U = f10;
        l();
        invalidate();
    }

    public void setTextBackgroundRotate(float f10) {
        this.W = f10;
        l();
        invalidate();
    }

    public void setTextBackgroundZoom(float f10) {
        this.V = f10;
        l();
        invalidate();
    }

    public void setTextFillColor(int i10) {
        this.f19196d = i10;
        invalidate();
    }

    public void setTextOutlineColor(int i10) {
        this.f19197e = i10;
        this.f19198f = true;
        invalidate();
    }

    public void setTextOutlineThickness(float f10) {
        this.f19207o = f10;
        this.f19198f = true;
        if (Float.isNaN(f10)) {
            this.f19207o = 1.0f;
            this.f19198f = false;
        }
        invalidate();
    }

    public void setTextPanX(float f10) {
        this.M = f10;
        invalidate();
    }

    public void setTextPanY(float f10) {
        this.N = f10;
        invalidate();
    }

    public void setTextSize(float f10) {
        this.f19203k = f10;
        Log.v(f19190a0, c.f() + "  " + f10 + " / " + this.f19204l);
        TextPaint textPaint = this.f19194b;
        if (!Float.isNaN(this.f19204l)) {
            f10 = this.f19204l;
        }
        textPaint.setTextSize(f10);
        f(Float.isNaN(this.f19204l) ? 1.0f : this.f19203k / this.f19204l);
        requestLayout();
        invalidate();
    }

    public void setTextureHeight(float f10) {
        this.K = f10;
        l();
        invalidate();
    }

    public void setTextureWidth(float f10) {
        this.L = f10;
        l();
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        if (this.f19194b.getTypeface() != typeface) {
            this.f19194b.setTypeface(typeface);
            if (this.f19217y != null) {
                this.f19217y = null;
                requestLayout();
                invalidate();
            }
        }
    }
}
