package com.huawei.hms.scankit.drawable;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.huawei.hms.scankit.R;
import com.huawei.hms.scankit.p.b1;
import com.huawei.hms.scankit.p.b6;
import com.huawei.hms.scankit.p.n6;
import com.huawei.hms.scankit.p.y5;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes7.dex */
public class ScanDrawable extends Drawable implements Animatable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ValueAnimator f61434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ValueAnimator f61435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Matrix f61436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Paint f61437d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Paint f61438e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ColorMatrix f61439f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Matrix f61440g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Rect f61441h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Rect f61442i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Rect f61443j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Rect f61444k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f61445l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f61446m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f61447n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f61448o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f61449p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f61450q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private y5 f61451r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f61452s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f61453t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Bitmap f61454u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Bitmap f61455v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private AnimatorSet f61456w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int[] f61431x = {13625597, 357325};

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final Interpolator f61432y = new b1(0.4f, 0.0f, 0.4f, 1.0f);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final Interpolator f61433z = new b1(0.4f, 0.0f, 0.7f, 1.0f);
    private static final Interpolator A = new b1(0.25f, 0.0f, 0.4f, 1.0f);

    public class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) ScanDrawable.this.f61435b.getAnimatedValue()).floatValue();
            ScanDrawable scanDrawable = ScanDrawable.this;
            scanDrawable.f61450q = scanDrawable.f61444k.top + ((int) (ScanDrawable.this.f61444k.height() * ScanDrawable.f61432y.getInterpolation(fFloatValue)));
            if (fFloatValue < 0.389f) {
                ScanDrawable.this.f61449p = ScanDrawable.f61433z.getInterpolation(fFloatValue / 0.389f);
            } else {
                ScanDrawable.this.f61449p = 1.0f - ScanDrawable.A.getInterpolation((fFloatValue - 0.389f) / 0.611f);
            }
            ScanDrawable.this.invalidateSelf();
        }
    }

    public class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            ScanDrawable scanDrawable = ScanDrawable.this;
            scanDrawable.f61448o = !scanDrawable.f61448o;
        }
    }

    public class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            float fAbs = Math.abs(((Float) ScanDrawable.this.f61435b.getAnimatedValue()).floatValue() - 0.5f);
            ScanDrawable scanDrawable = ScanDrawable.this;
            scanDrawable.f61453t = !scanDrawable.f61453t;
            if (ScanDrawable.this.f61453t) {
                if (fAbs > 0.35f) {
                    ScanDrawable.this.f61447n = 0.0f;
                } else {
                    ScanDrawable.this.f61447n = n6.a(0.5f);
                }
            }
        }
    }

    public ScanDrawable() {
        this.f61434a = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f61435b = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f61436c = new Matrix();
        this.f61437d = new Paint();
        this.f61438e = new Paint();
        this.f61439f = new ColorMatrix();
        this.f61440g = new Matrix();
        this.f61441h = new Rect();
        this.f61442i = new Rect();
        this.f61443j = new Rect();
        this.f61444k = new Rect();
        this.f61447n = 0.5f;
        this.f61448o = false;
        this.f61449p = 0.0f;
        this.f61453t = true;
        this.f61456w = new AnimatorSet();
        d();
    }

    public ScanDrawable(Resources resources) {
        this();
        a(resources);
    }

    private void a(Resources resources) {
        if (resources == null) {
            Log.e("ScanDrawable", "resources is null when init drawable");
            return;
        }
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(resources, R.drawable.scankit_scan_light);
        this.f61455v = Bitmap.createBitmap(bitmapDecodeResource.getWidth() * 2, bitmapDecodeResource.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas();
        canvas.setBitmap(this.f61455v);
        Paint paint = new Paint();
        Shader.TileMode tileMode = Shader.TileMode.MIRROR;
        paint.setShader(new BitmapShader(bitmapDecodeResource, tileMode, tileMode));
        canvas.drawRect(0.0f, 0.0f, bitmapDecodeResource.getWidth() * 2, bitmapDecodeResource.getHeight() * 2, paint);
        this.f61454u = BitmapFactory.decodeResource(resources, R.drawable.scankit_scan_tail);
        this.f61452s = resources.getDisplayMetrics().density;
    }

    private void a(Canvas canvas) {
        Bitmap bitmap = this.f61455v;
        if (bitmap == null || bitmap.getWidth() == 0 || this.f61455v.getHeight() == 0) {
            Log.e("ScanDrawable", "drawLight failed, light bitmap is null");
            return;
        }
        float fFloatValue = (this.f61449p * 0.5f) + (((Float) this.f61434a.getAnimatedValue()).floatValue() * this.f61447n);
        float f10 = (1.5f - fFloatValue) * 0.05f;
        float f11 = f10 + 1.0f;
        this.f61439f.set(new float[]{1.0f, f10, f10, f10, 0.0f, f10, f11, f10, f10, 0.0f, f10, f10, f11, f10, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        this.f61438e.setColorFilter(new ColorMatrixColorFilter(this.f61439f));
        int i10 = (int) (this.f61445l * ((fFloatValue * 0.2f) + 0.4f));
        if (this.f61448o) {
            int i11 = this.f61450q;
            this.f61441h.set(0, i11 + i10, getBounds().right, i11 - i10);
        } else {
            int i12 = this.f61450q;
            this.f61441h.set(0, i12 - i10, getBounds().right, i12 + i10);
        }
        this.f61440g.setScale(this.f61441h.width() / this.f61455v.getWidth(), this.f61441h.height() / this.f61455v.getHeight());
        Matrix matrix = this.f61440g;
        Rect rect = this.f61441h;
        matrix.postTranslate(rect.left, rect.top);
        canvas.drawBitmap(this.f61455v, this.f61440g, this.f61438e);
        this.f61440g.reset();
    }

    private void a(Canvas canvas, Rect rect) {
        Bitmap bitmap = this.f61454u;
        if (bitmap == null || bitmap.getWidth() == 0 || this.f61454u.getHeight() == 0) {
            Log.e("ScanDrawable", "dawTail failed, input bitmap is null");
            return;
        }
        this.f61436c.setScale(rect.width() / this.f61454u.getWidth(), rect.height() / this.f61454u.getHeight());
        this.f61436c.postTranslate(rect.left, rect.top);
        canvas.drawBitmap(this.f61454u, this.f61436c, this.f61437d);
        this.f61436c.reset();
    }

    private void a(Rect rect) {
        if (rect.height() == 0) {
            Log.d("ScanDrawable", "initBounds bounds is null");
            return;
        }
        this.f61444k.set(rect);
        this.f61444k.inset(0, (int) (rect.height() * 0.1f));
        this.f61445l = (int) (rect.height() * 0.18f);
        this.f61446m = (int) (rect.height() * 0.36f);
        Rect rect2 = new Rect(rect);
        rect2.inset((int) (rect.width() * 0.2f), 0);
        float f10 = this.f61452s;
        int iWidth = (int) ((f10 != 0.0f ? 0.001f / (f10 * f10) : 0.001f) * rect2.width() * rect2.height());
        this.f61451r = new y5(new b6(iWidth, 500L).b(0.33f, 1.0f).a(0, -1, 0L, 100L, new LinearInterpolator()).a(-1, 0, 400L, 500L, new LinearInterpolator()), rect2, iWidth, this.f61452s * 2.0f, f61431x);
    }

    private void b(Canvas canvas) {
        y5 y5Var = this.f61451r;
        if (y5Var == null) {
            Log.e("ScanDrawable", "drawParticle failed, mParticle is null");
        } else {
            y5Var.a(canvas, this.f61442i);
        }
    }

    private void d() {
        f();
        e();
        AnimatorSet animatorSet = new AnimatorSet();
        this.f61456w = animatorSet;
        animatorSet.playTogether(this.f61435b, this.f61434a);
    }

    private void e() {
        this.f61434a.setInterpolator(new LinearInterpolator());
        this.f61434a.setRepeatMode(2);
        this.f61434a.setRepeatCount(-1);
        this.f61434a.setDuration(500L);
        this.f61434a.setStartDelay(200L);
        this.f61434a.addListener(new c());
    }

    private void f() {
        this.f61435b.setDuration(2000L);
        this.f61435b.setInterpolator(new LinearInterpolator());
        this.f61435b.setRepeatCount(-1);
        this.f61435b.setRepeatMode(2);
        this.f61435b.addUpdateListener(new a());
        this.f61435b.addListener(new b());
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (!isRunning() || canvas == null) {
            Log.w("ScanDrawable", "animator is not running or canvas is null.");
            return;
        }
        if (this.f61448o) {
            int i10 = this.f61450q;
            this.f61442i.set(0, i10, getBounds().right, ((int) (this.f61446m * this.f61449p * 0.5f)) + i10);
            int i11 = this.f61450q;
            this.f61443j.set(0, i11, getBounds().right, ((int) (this.f61446m * this.f61449p)) + i11);
        } else {
            int i12 = this.f61450q;
            this.f61442i.set(0, i12, getBounds().right, i12 - ((int) ((this.f61446m * this.f61449p) * 0.5f)));
            int i13 = this.f61450q;
            this.f61443j.set(0, i13, getBounds().right, i13 - ((int) (this.f61446m * this.f61449p)));
        }
        a(canvas, this.f61443j);
        b(canvas);
        a(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        if (resources == null || xmlPullParser == null || attributeSet == null) {
            Log.e("ScanDrawable", "resources, xmlPullParser or attributeSet is null when inflating drawable");
        } else {
            a(resources);
            super.inflate(resources, xmlPullParser, attributeSet, theme);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f61456w.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        if (rect == null) {
            Log.e("ScanDrawable", "on bounds change: bounds is null!");
        } else {
            super.onBoundsChange(rect);
            a(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (isRunning()) {
            Log.i("ScanDrawable", "start failed, animator is running");
            return;
        }
        this.f61448o = false;
        this.f61453t = true;
        a(getBounds());
        this.f61456w.start();
        Log.i("ScanDrawable", "start scan animator success");
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (!isRunning()) {
            Log.i("ScanDrawable", "stop failed, animator is not running");
            return;
        }
        this.f61456w.end();
        this.f61451r = null;
        Log.i("ScanDrawable", "stop scan animator success");
    }
}
