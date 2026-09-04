package com.max.hbcustomview.seekbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.l;
import androidx.annotation.v;
import com.max.hbcustomview.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.text.DecimalFormat;

/* JADX INFO: compiled from: CustomSeekBar.java */
/* JADX INFO: loaded from: classes10.dex */
public class a {
    public static final int U = 0;
    public static final int V = 1;
    public static final int W = 2;
    public static final int X = 3;
    public static final int Y = -1;
    public static final int Z = -2;
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean A;
    boolean B;
    Bitmap C;
    Bitmap D;
    Bitmap E;
    ValueAnimator F;
    String G;
    RangeSeekBar J;
    String K;
    DecimalFormat Q;
    int R;
    int S;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f69341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f69342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f69343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f69344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f69345e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f69346f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f69347g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f69348h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f69349i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f69350j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f69351k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f69352l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f69353m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f69354n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f69355o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f69356p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f69357q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f69358r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    float f69360t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    int f69361u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    int f69362v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    int f69363w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    int f69364x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    float f69365y;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f69359s = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    float f69366z = 0.0f;
    boolean H = false;
    boolean I = true;
    Path L = new Path();
    Rect M = new Rect();
    Rect N = new Rect();
    Paint O = new Paint(1);
    Paint P = new Paint(1);
    boolean T = true;

    /* JADX INFO: renamed from: com.max.hbcustomview.seekbar.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CustomSeekBar.java */
    public class C0560a implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        C0560a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, bb.c.f.Mn, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            a.this.f69366z = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            RangeSeekBar rangeSeekBar = a.this.J;
            if (rangeSeekBar != null) {
                rangeSeekBar.invalidate();
            }
        }
    }

    /* JADX INFO: compiled from: CustomSeekBar.java */
    public class b extends AnimatorListenerAdapter {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, bb.c.f.Nn, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            a aVar = a.this;
            aVar.f69366z = 0.0f;
            RangeSeekBar rangeSeekBar = aVar.J;
            if (rangeSeekBar != null) {
                rangeSeekBar.invalidate();
            }
        }
    }

    /* JADX INFO: compiled from: CustomSeekBar.java */
    public @interface c {
    }

    public a(RangeSeekBar rangeSeekBar, AttributeSet attributeSet, boolean z10) {
        this.J = rangeSeekBar;
        this.B = z10;
        J(attributeSet);
        K();
        L();
    }

    private void J(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes;
        if (PatchProxy.proxy(new Object[]{attributeSet}, this, changeQuickRedirect, false, 5656, new Class[]{AttributeSet.class}, Void.TYPE).isSupported || (typedArrayObtainStyledAttributes = e().obtainStyledAttributes(attributeSet, R.styleable.B2)) == null) {
            return;
        }
        this.f69344d = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.RangeSeekBar_rsb_indicator_margin, 0.0f);
        this.f69345e = typedArrayObtainStyledAttributes.getResourceId(R.styleable.RangeSeekBar_rsb_indicator_drawable, 0);
        this.f69341a = typedArrayObtainStyledAttributes.getInt(R.styleable.RangeSeekBar_rsb_indicator_show_mode, 1);
        this.f69342b = typedArrayObtainStyledAttributes.getLayoutDimension(R.styleable.RangeSeekBar_rsb_indicator_height, -1);
        this.f69343c = typedArrayObtainStyledAttributes.getLayoutDimension(R.styleable.RangeSeekBar_rsb_indicator_width, -1);
        int i10 = R.styleable.RangeSeekBar_rsb_indicator_text_size;
        ic.a aVar = ic.a.f119343a;
        this.f69347g = (int) typedArrayObtainStyledAttributes.getDimension(i10, aVar.b(e(), 14));
        this.f69348h = typedArrayObtainStyledAttributes.getColor(R.styleable.RangeSeekBar_rsb_indicator_text_color, -1);
        this.f69350j = typedArrayObtainStyledAttributes.getColor(R.styleable.RangeSeekBar_rsb_indicator_background_color, androidx.core.content.d.f(e(), R.color.black));
        this.f69351k = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.RangeSeekBar_rsb_indicator_padding_left, 0.0f);
        this.f69352l = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.RangeSeekBar_rsb_indicator_padding_right, 0.0f);
        this.f69353m = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.RangeSeekBar_rsb_indicator_padding_top, 0.0f);
        this.f69354n = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.RangeSeekBar_rsb_indicator_padding_bottom, 0.0f);
        this.f69346f = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.RangeSeekBar_rsb_indicator_arrow_size, 0.0f);
        this.f69355o = typedArrayObtainStyledAttributes.getResourceId(R.styleable.RangeSeekBar_rsb_thumb_drawable, R.drawable.range_seek_bar_thumb);
        this.f69356p = typedArrayObtainStyledAttributes.getResourceId(R.styleable.RangeSeekBar_rsb_thumb_inactivated_drawable, 0);
        this.f69357q = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.RangeSeekBar_rsb_thumb_width, aVar.b(e(), 26));
        this.f69358r = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.RangeSeekBar_rsb_thumb_height, aVar.b(e(), 26));
        this.f69360t = typedArrayObtainStyledAttributes.getFloat(R.styleable.RangeSeekBar_rsb_thumb_scale_ratio, 1.0f);
        this.f69349i = typedArrayObtainStyledAttributes.getDimension(R.styleable.RangeSeekBar_rsb_indicator_radius, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void K() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5660, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        X(this.f69345e);
        q0(this.f69355o, this.f69357q, this.f69358r);
        s0(this.f69356p, this.f69357q, this.f69358r);
    }

    public float A() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.wn, new Class[0], Float.TYPE);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : i() + f() + k() + F();
    }

    public Resources B() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5659, new Class[0], Resources.class);
        if (patchProxyResultProxy.isSupported) {
            return (Resources) patchProxyResultProxy.result;
        }
        if (e() != null) {
            return e().getResources();
        }
        return null;
    }

    public int C() {
        return this.f69355o;
    }

    public int D() {
        return this.f69358r;
    }

    public int E() {
        return this.f69356p;
    }

    public float F() {
        return this.f69358r * this.f69360t;
    }

    public float G() {
        return this.f69360t;
    }

    public float H() {
        return this.f69357q * this.f69360t;
    }

    public int I() {
        return this.f69357q;
    }

    public void L() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.pn, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.R = this.f69357q;
        this.S = this.f69358r;
        if (this.f69342b == -1) {
            this.f69342b = h.h("8", this.f69347g).height() + this.f69353m + this.f69354n;
        }
        if (this.f69346f <= 0) {
            this.f69346f = this.f69357q / 4;
        }
    }

    public boolean M() {
        return this.A;
    }

    public boolean N() {
        return this.I;
    }

    public void O() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5670, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f69366z, 0.0f);
        this.F = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new C0560a());
        this.F.addListener(new b());
        this.F.start();
    }

    public void P(Canvas canvas, Paint paint, String str) {
        int iWidth;
        int iHeight;
        if (PatchProxy.proxy(new Object[]{canvas, paint, str}, this, changeQuickRedirect, false, bb.c.f.An, new Class[]{Canvas.class, Paint.class, String.class}, Void.TYPE).isSupported || str == null) {
            return;
        }
        paint.setTextSize(this.f69347g);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.f69350j);
        paint.getTextBounds(str, 0, str.length(), this.M);
        int iWidth2 = this.M.width() + this.f69351k + this.f69352l;
        int i10 = this.f69343c;
        if (i10 > iWidth2) {
            iWidth2 = i10;
        }
        int iHeight2 = this.M.height() + this.f69353m + this.f69354n;
        int i11 = this.f69342b;
        if (i11 > iHeight2) {
            iHeight2 = i11;
        }
        Rect rect = this.N;
        int i12 = this.R;
        int i13 = (int) ((i12 / 2.0f) - (iWidth2 / 2.0f));
        rect.left = i13;
        int i14 = ((this.f69364x - iHeight2) - this.S) - this.f69344d;
        rect.top = i14;
        rect.right = i13 + iWidth2;
        int i15 = i14 + iHeight2;
        rect.bottom = i15;
        if (this.E == null) {
            int i16 = i12 / 2;
            int i17 = this.f69346f;
            this.L.reset();
            this.L.moveTo(i16, i15);
            float f10 = i15 - i17;
            this.L.lineTo(i16 - i17, f10);
            this.L.lineTo(i17 + i16, f10);
            this.L.close();
            canvas.drawPath(this.L, paint);
            Rect rect2 = this.N;
            int i18 = rect2.bottom;
            int i19 = this.f69346f;
            rect2.bottom = i18 - i19;
            rect2.top -= i19;
        }
        int iB = ic.a.f119343a.b(e(), 1);
        int iWidth3 = (((this.N.width() / 2) - ((int) (this.J.getProgressWidth() * this.f69365y))) - this.J.getProgressLeft()) + iB;
        int iWidth4 = (((this.N.width() / 2) - ((int) (this.J.getProgressWidth() * (1.0f - this.f69365y)))) - this.J.getProgressPaddingRight()) + iB;
        if (iWidth3 > 0) {
            Rect rect3 = this.N;
            rect3.left += iWidth3;
            rect3.right += iWidth3;
        } else if (iWidth4 > 0) {
            Rect rect4 = this.N;
            rect4.left -= iWidth4;
            rect4.right -= iWidth4;
        }
        Bitmap bitmap = this.E;
        if (bitmap != null) {
            h.c(canvas, paint, bitmap, this.N);
        } else if (this.f69349i > 0.0f) {
            RectF rectF = new RectF(this.N);
            float f11 = this.f69349i;
            canvas.drawRoundRect(rectF, f11, f11, paint);
        } else {
            canvas.drawRect(this.N, paint);
        }
        int i20 = this.f69351k;
        if (i20 > 0) {
            iWidth = this.N.left + i20;
        } else {
            int i21 = this.f69352l;
            iWidth = i21 > 0 ? (this.N.right - i21) - this.M.width() : ((iWidth2 - this.M.width()) / 2) + this.N.left;
        }
        if (this.f69353m > 0) {
            iHeight = this.N.top + this.M.height() + this.f69353m;
        } else {
            iHeight = this.f69354n > 0 ? (this.N.bottom - this.M.height()) - this.f69354n : (this.N.bottom - ((iHeight2 - this.M.height()) / 2)) + 1;
        }
        int i22 = iWidth + this.f69359s;
        paint.setColor(this.f69348h);
        canvas.drawText(str, i22, iHeight, paint);
    }

    public void Q(Canvas canvas) {
        if (!PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.f.yn, new Class[]{Canvas.class}, Void.TYPE).isSupported && this.T) {
            Bitmap bitmap = this.D;
            if (bitmap != null && !this.H) {
                canvas.drawBitmap(bitmap, 0.0f, this.J.getProgressTop() + ((this.J.getProgressHeight() - this.S) / 2.0f), (Paint) null);
                return;
            }
            Bitmap bitmap2 = this.C;
            if (bitmap2 != null) {
                canvas.drawBitmap(bitmap2, 0.0f, this.J.getProgressTop() + ((this.J.getProgressHeight() - this.S) / 2.0f), this.P);
            }
        }
    }

    public void R(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 5661, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        L();
        K();
        float f10 = i10;
        this.f69361u = (int) (f10 - (H() / 2.0f));
        this.f69362v = (int) (f10 + (H() / 2.0f));
        this.f69363w = i11 - (D() / 2);
        this.f69364x = i11 + (D() / 2);
    }

    public void S() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.vn, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.R = I();
        this.S = D();
        int progressBottom = this.J.getProgressBottom();
        int i10 = this.S;
        this.f69363w = progressBottom - (i10 / 2);
        this.f69364x = progressBottom + (i10 / 2);
        q0(this.f69355o, this.R, i10);
    }

    public void T() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5662, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.R = (int) H();
        this.S = (int) F();
        int progressBottom = this.J.getProgressBottom();
        int i10 = this.S;
        this.f69363w = progressBottom - (i10 / 2);
        this.f69364x = progressBottom + (i10 / 2);
        q0(this.f69355o, this.R, i10);
    }

    public void U(boolean z10) {
        this.H = z10;
    }

    public void V(int i10) {
        this.f69346f = i10;
    }

    public void W(@l int i10) {
        this.f69350j = i10;
    }

    public void X(@v int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.En, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || i10 == 0) {
            return;
        }
        this.f69345e = i10;
        this.E = BitmapFactory.decodeResource(B(), i10);
    }

    public void Y(int i10) {
        this.f69342b = i10;
    }

    public void Z(int i10) {
        this.f69344d = i10;
    }

    public boolean a(float f10, float f11) {
        Object[] objArr = {new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Bn, new Class[]{cls, cls}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        int progressWidth = (int) (this.J.getProgressWidth() * this.f69365y);
        return f10 > ((float) (this.f69361u + progressWidth)) && f10 < ((float) (this.f69362v + progressWidth)) && f11 > ((float) this.f69363w) && f11 < ((float) this.f69364x);
    }

    public void a0(int i10) {
        this.f69354n = i10;
    }

    public void b(Canvas canvas) {
        if (!PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.f.xn, new Class[]{Canvas.class}, Void.TYPE).isSupported && this.I) {
            int progressWidth = (int) (this.J.getProgressWidth() * this.f69365y);
            canvas.save();
            canvas.translate(progressWidth, 0.0f);
            canvas.translate(this.f69361u, 0.0f);
            if (this.A) {
                P(canvas, this.O, c(this.G));
            }
            Q(canvas);
            canvas.restore();
        }
    }

    public void b0(int i10) {
        this.f69351k = i10;
    }

    public String c(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.f.zn, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        g[] rangeSeekBarState = this.J.getRangeSeekBarState();
        if (TextUtils.isEmpty(str)) {
            if (this.B) {
                DecimalFormat decimalFormat = this.Q;
                str = decimalFormat != null ? decimalFormat.format(rangeSeekBarState[0].f69375b) : rangeSeekBarState[0].f69374a;
            } else {
                DecimalFormat decimalFormat2 = this.Q;
                str = decimalFormat2 != null ? decimalFormat2.format(rangeSeekBarState[1].f69375b) : rangeSeekBarState[1].f69374a;
            }
        }
        String str2 = this.K;
        return str2 != null ? String.format(str2, str) : str;
    }

    public void c0(int i10) {
        this.f69352l = i10;
    }

    public boolean d() {
        return this.H;
    }

    public void d0(int i10) {
        this.f69353m = i10;
    }

    public Context e() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.qn, new Class[0], Context.class);
        return patchProxyResultProxy.isSupported ? (Context) patchProxyResultProxy.result : this.J.getContext();
    }

    public void e0(float f10) {
        this.f69349i = f10;
    }

    public int f() {
        return this.f69346f;
    }

    public void f0(@c int i10) {
        this.f69341a = i10;
    }

    public int g() {
        return this.f69350j;
    }

    public void g0(String str) {
        this.G = str;
    }

    public int h() {
        return this.f69345e;
    }

    public void h0(@l int i10) {
        this.f69348h = i10;
    }

    public int i() {
        return this.f69342b;
    }

    public void i0(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.f.Dn, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.Q = new DecimalFormat(str);
    }

    public int j() {
        return this.N.left;
    }

    public void j0(int i10) {
        this.f69359s = i10;
    }

    public int k() {
        return this.f69344d;
    }

    public void k0(int i10) {
        this.f69347g = i10;
    }

    public int l() {
        return this.f69354n;
    }

    public void l0(String str) {
        this.K = str;
    }

    public int m() {
        return this.f69351k;
    }

    public void m0(int i10) {
        this.f69343c = i10;
    }

    public int n() {
        return this.f69352l;
    }

    public void n0(boolean z10) {
        int i10 = this.f69341a;
        if (i10 == 0) {
            this.A = z10;
            return;
        }
        if (i10 == 1) {
            this.A = false;
        } else if (i10 == 2 || i10 == 3) {
            this.A = true;
        }
    }

    public int o() {
        return this.f69353m;
    }

    public void o0(boolean z10) {
        this.T = z10;
    }

    public float p() {
        return this.f69349i;
    }

    public void p0(@v int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.Jn, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (this.f69357q <= 0 || this.f69358r <= 0) {
            throw new IllegalArgumentException("please set thumbWidth and thumbHeight first!");
        }
        if (i10 == 0 || B() == null) {
            return;
        }
        this.f69355o = i10;
        this.C = h.e(this.f69357q, this.f69358r, B().getDrawable(i10, null));
    }

    public int q() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Fn, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int i10 = this.f69342b;
        if (i10 > 0) {
            return this.E != null ? i10 + this.f69344d : i10 + this.f69346f + this.f69344d;
        }
        return this.E != null ? h.h("8", this.f69347g).height() + this.f69353m + this.f69354n + this.f69344d : h.h("8", this.f69347g).height() + this.f69353m + this.f69354n + this.f69344d + this.f69346f;
    }

    public void q0(@v int i10, int i11, int i12) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.In, new Class[]{cls, cls, cls}, Void.TYPE).isSupported || i10 == 0 || B() == null || i11 <= 0 || i12 <= 0) {
            return;
        }
        this.f69355o = i10;
        this.C = h.e(i11, i12, B().getDrawable(i10, null));
    }

    public int r() {
        return this.N.right;
    }

    public void r0(int i10) {
        this.f69358r = i10;
    }

    public int s() {
        return this.f69341a;
    }

    public void s0(@v int i10, int i11, int i12) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Hn, new Class[]{cls, cls, cls}, Void.TYPE).isSupported || i10 == 0 || B() == null) {
            return;
        }
        this.f69356p = i10;
        this.D = h.e(i11, i12, B().getDrawable(i10, null));
    }

    public int t() {
        return this.f69348h;
    }

    public void t0(int i10) {
        this.f69357q = i10;
    }

    public DecimalFormat u() {
        return this.Q;
    }

    public void u0(Typeface typeface) {
        if (PatchProxy.proxy(new Object[]{typeface}, this, changeQuickRedirect, false, bb.c.f.Kn, new Class[]{Typeface.class}, Void.TYPE).isSupported) {
            return;
        }
        this.O.setTypeface(typeface);
    }

    public int v() {
        return this.f69359s;
    }

    public void v0(boolean z10) {
        this.I = z10;
    }

    public int w() {
        return this.f69347g;
    }

    public void w0(boolean z10) {
        this.A = z10;
    }

    public int x() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Gn, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.M.width();
    }

    public void x0(float f10) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        } else if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        this.f69365y = f10;
    }

    public int y() {
        return this.f69343c;
    }

    public float z() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Ln, new Class[0], Float.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Float) patchProxyResultProxy.result).floatValue();
        }
        return this.J.getMinProgress() + ((this.J.getMaxProgress() - this.J.getMinProgress()) * this.f69365y);
    }
}
