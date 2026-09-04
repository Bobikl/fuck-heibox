package com.google.android.material.shape;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.annotation.e1;
import androidx.annotation.f0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.google.android.material.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.BitSet;

/* JADX INFO: compiled from: MaterialShapeDrawable.java */
/* JADX INFO: loaded from: classes7.dex */
public class k extends Drawable implements androidx.core.graphics.drawable.p, t {
    private static final float A = 0.25f;
    public static final int B = 0;
    public static final int C = 1;
    public static final int D = 2;
    private static final Paint E;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f55071y = k.class.getSimpleName();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final float f55072z = 0.75f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f55073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final r.j[] f55074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r.j[] f55075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final BitSet f55076e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f55077f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Matrix f55078g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Path f55079h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Path f55080i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final RectF f55081j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final RectF f55082k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Region f55083l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Region f55084m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private p f55085n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Paint f55086o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Paint f55087p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final com.google.android.material.shadow.b f55088q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @n0
    private final q.b f55089r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final q f55090s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @p0
    private PorterDuffColorFilter f55091t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @p0
    private PorterDuffColorFilter f55092u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f55093v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @n0
    private final RectF f55094w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f55095x;

    /* JADX INFO: compiled from: MaterialShapeDrawable.java */
    public class a implements q.b {
        a() {
        }

        @Override // com.google.android.material.shape.q.b
        public void a(@n0 r rVar, Matrix matrix, int i10) {
            k.this.f55076e.set(i10, rVar.e());
            k.this.f55074c[i10] = rVar.f(matrix);
        }

        @Override // com.google.android.material.shape.q.b
        public void b(@n0 r rVar, Matrix matrix, int i10) {
            k.this.f55076e.set(i10 + 4, rVar.e());
            k.this.f55075d[i10] = rVar.f(matrix);
        }
    }

    /* JADX INFO: compiled from: MaterialShapeDrawable.java */
    public class b implements p.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f55097a;

        b(float f10) {
            this.f55097a = f10;
        }

        @Override // com.google.android.material.shape.p.c
        @n0
        public e a(@n0 e eVar) {
            return eVar instanceof n ? eVar : new com.google.android.material.shape.b(this.f55097a, eVar);
        }
    }

    /* JADX INFO: compiled from: MaterialShapeDrawable.java */
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    /* JADX INFO: compiled from: MaterialShapeDrawable.java */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class d extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @n0
        p f55099a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        f9.a f55100b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        ColorFilter f55101c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        ColorStateList f55102d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @p0
        ColorStateList f55103e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @p0
        ColorStateList f55104f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @p0
        ColorStateList f55105g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @p0
        PorterDuff.Mode f55106h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @p0
        Rect f55107i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        float f55108j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float f55109k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        float f55110l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f55111m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        float f55112n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        float f55113o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        float f55114p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f55115q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f55116r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f55117s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f55118t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        boolean f55119u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Paint.Style f55120v;

        public d(@n0 d dVar) {
            this.f55102d = null;
            this.f55103e = null;
            this.f55104f = null;
            this.f55105g = null;
            this.f55106h = PorterDuff.Mode.SRC_IN;
            this.f55107i = null;
            this.f55108j = 1.0f;
            this.f55109k = 1.0f;
            this.f55111m = 255;
            this.f55112n = 0.0f;
            this.f55113o = 0.0f;
            this.f55114p = 0.0f;
            this.f55115q = 0;
            this.f55116r = 0;
            this.f55117s = 0;
            this.f55118t = 0;
            this.f55119u = false;
            this.f55120v = Paint.Style.FILL_AND_STROKE;
            this.f55099a = dVar.f55099a;
            this.f55100b = dVar.f55100b;
            this.f55110l = dVar.f55110l;
            this.f55101c = dVar.f55101c;
            this.f55102d = dVar.f55102d;
            this.f55103e = dVar.f55103e;
            this.f55106h = dVar.f55106h;
            this.f55105g = dVar.f55105g;
            this.f55111m = dVar.f55111m;
            this.f55108j = dVar.f55108j;
            this.f55117s = dVar.f55117s;
            this.f55115q = dVar.f55115q;
            this.f55119u = dVar.f55119u;
            this.f55109k = dVar.f55109k;
            this.f55112n = dVar.f55112n;
            this.f55113o = dVar.f55113o;
            this.f55114p = dVar.f55114p;
            this.f55116r = dVar.f55116r;
            this.f55118t = dVar.f55118t;
            this.f55104f = dVar.f55104f;
            this.f55120v = dVar.f55120v;
            if (dVar.f55107i != null) {
                this.f55107i = new Rect(dVar.f55107i);
            }
        }

        public d(@n0 p pVar, @p0 f9.a aVar) {
            this.f55102d = null;
            this.f55103e = null;
            this.f55104f = null;
            this.f55105g = null;
            this.f55106h = PorterDuff.Mode.SRC_IN;
            this.f55107i = null;
            this.f55108j = 1.0f;
            this.f55109k = 1.0f;
            this.f55111m = 255;
            this.f55112n = 0.0f;
            this.f55113o = 0.0f;
            this.f55114p = 0.0f;
            this.f55115q = 0;
            this.f55116r = 0;
            this.f55117s = 0;
            this.f55118t = 0;
            this.f55119u = false;
            this.f55120v = Paint.Style.FILL_AND_STROKE;
            this.f55099a = pVar;
            this.f55100b = aVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @n0
        public Drawable newDrawable() {
            k kVar = new k(this);
            kVar.f55077f = true;
            return kVar;
        }
    }

    static {
        Paint paint = new Paint(1);
        E = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public k() {
        this(new p());
    }

    public k(@n0 Context context, @p0 AttributeSet attributeSet, @androidx.annotation.f int i10, @e1 int i11) {
        this(p.e(context, attributeSet, i10, i11).m());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected k(@n0 d dVar) {
        this.f55074c = new r.j[4];
        this.f55075d = new r.j[4];
        this.f55076e = new BitSet(8);
        this.f55078g = new Matrix();
        this.f55079h = new Path();
        this.f55080i = new Path();
        this.f55081j = new RectF();
        this.f55082k = new RectF();
        this.f55083l = new Region();
        this.f55084m = new Region();
        Paint paint = new Paint(1);
        this.f55086o = paint;
        Paint paint2 = new Paint(1);
        this.f55087p = paint2;
        this.f55088q = new com.google.android.material.shadow.b();
        this.f55090s = Looper.getMainLooper().getThread() == Thread.currentThread() ? q.k() : new q();
        this.f55094w = new RectF();
        this.f55095x = true;
        this.f55073b = dVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        N0();
        M0(getState());
        this.f55089r = new a();
    }

    public k(@n0 p pVar) {
        this(new d(pVar, null));
    }

    @Deprecated
    public k(@n0 s sVar) {
        this((p) sVar);
    }

    private boolean M0(int[] iArr) {
        boolean z10;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f55073b.f55102d == null || color2 == (colorForState2 = this.f55073b.f55102d.getColorForState(iArr, (color2 = this.f55086o.getColor())))) {
            z10 = false;
        } else {
            this.f55086o.setColor(colorForState2);
            z10 = true;
        }
        if (this.f55073b.f55103e == null || color == (colorForState = this.f55073b.f55103e.getColorForState(iArr, (color = this.f55087p.getColor())))) {
            return z10;
        }
        this.f55087p.setColor(colorForState);
        return true;
    }

    private boolean N0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f55091t;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f55092u;
        d dVar = this.f55073b;
        this.f55091t = k(dVar.f55105g, dVar.f55106h, this.f55086o, true);
        d dVar2 = this.f55073b;
        this.f55092u = k(dVar2.f55104f, dVar2.f55106h, this.f55087p, false);
        d dVar3 = this.f55073b;
        if (dVar3.f55119u) {
            this.f55088q.e(dVar3.f55105g.getColorForState(getState(), 0));
        }
        return (androidx.core.util.j.a(porterDuffColorFilter, this.f55091t) && androidx.core.util.j.a(porterDuffColorFilter2, this.f55092u)) ? false : true;
    }

    private float O() {
        if (Y()) {
            return this.f55087p.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private void O0() {
        float fV = V();
        this.f55073b.f55116r = (int) Math.ceil(0.75f * fV);
        this.f55073b.f55117s = (int) Math.ceil(fV * A);
        N0();
        a0();
    }

    private boolean W() {
        d dVar = this.f55073b;
        int i10 = dVar.f55115q;
        return i10 != 1 && dVar.f55116r > 0 && (i10 == 2 || j0());
    }

    private boolean X() {
        Paint.Style style = this.f55073b.f55120v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    private boolean Y() {
        Paint.Style style = this.f55073b.f55120v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f55087p.getStrokeWidth() > 0.0f;
    }

    private void a0() {
        super.invalidateSelf();
    }

    @p0
    private PorterDuffColorFilter f(@n0 Paint paint, boolean z10) {
        if (!z10) {
            return null;
        }
        int color = paint.getColor();
        int iL = l(color);
        this.f55093v = iL;
        if (iL != color) {
            return new PorterDuffColorFilter(iL, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    private void g(@n0 RectF rectF, @n0 Path path) {
        h(rectF, path);
        if (this.f55073b.f55108j != 1.0f) {
            this.f55078g.reset();
            Matrix matrix = this.f55078g;
            float f10 = this.f55073b.f55108j;
            matrix.setScale(f10, f10, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f55078g);
        }
        path.computeBounds(this.f55094w, true);
    }

    private void g0(@n0 Canvas canvas) {
        if (W()) {
            canvas.save();
            i0(canvas);
            if (!this.f55095x) {
                o(canvas);
                canvas.restore();
                return;
            }
            int iWidth = (int) (this.f55094w.width() - getBounds().width());
            int iHeight = (int) (this.f55094w.height() - getBounds().height());
            if (iWidth < 0 || iHeight < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((int) this.f55094w.width()) + (this.f55073b.f55116r * 2) + iWidth, ((int) this.f55094w.height()) + (this.f55073b.f55116r * 2) + iHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            float f10 = (getBounds().left - this.f55073b.f55116r) - iWidth;
            float f11 = (getBounds().top - this.f55073b.f55116r) - iHeight;
            canvas2.translate(-f10, -f11);
            o(canvas2);
            canvas.drawBitmap(bitmapCreateBitmap, f10, f11, (Paint) null);
            bitmapCreateBitmap.recycle();
            canvas.restore();
        }
    }

    private static int h0(int i10, int i11) {
        return (i10 * (i11 + (i11 >>> 7))) >>> 8;
    }

    private void i() {
        p pVarY = getShapeAppearanceModel().y(new b(-O()));
        this.f55085n = pVarY;
        this.f55090s.d(pVarY, this.f55073b.f55109k, w(), this.f55080i);
    }

    private void i0(@n0 Canvas canvas) {
        canvas.translate(I(), J());
    }

    @n0
    private PorterDuffColorFilter j(@n0 ColorStateList colorStateList, @n0 PorterDuff.Mode mode, boolean z10) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z10) {
            colorForState = l(colorForState);
        }
        this.f55093v = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    @n0
    private PorterDuffColorFilter k(@p0 ColorStateList colorStateList, @p0 PorterDuff.Mode mode, @n0 Paint paint, boolean z10) {
        return (colorStateList == null || mode == null) ? f(paint, z10) : j(colorStateList, mode, z10);
    }

    @n0
    public static k m(Context context) {
        return n(context, 0.0f);
    }

    @n0
    public static k n(Context context, float f10) {
        int iC = com.google.android.material.color.m.c(context, R.attr.colorSurface, k.class.getSimpleName());
        k kVar = new k();
        kVar.Z(context);
        kVar.o0(ColorStateList.valueOf(iC));
        kVar.n0(f10);
        return kVar;
    }

    private void o(@n0 Canvas canvas) {
        if (this.f55076e.cardinality() > 0) {
            Log.w(f55071y, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f55073b.f55117s != 0) {
            canvas.drawPath(this.f55079h, this.f55088q.d());
        }
        for (int i10 = 0; i10 < 4; i10++) {
            this.f55074c[i10].b(this.f55088q, this.f55073b.f55116r, canvas);
            this.f55075d[i10].b(this.f55088q, this.f55073b.f55116r, canvas);
        }
        if (this.f55095x) {
            int I = I();
            int iJ = J();
            canvas.translate(-I, -iJ);
            canvas.drawPath(this.f55079h, E);
            canvas.translate(I, iJ);
        }
    }

    private void p(@n0 Canvas canvas) {
        r(canvas, this.f55086o, this.f55079h, this.f55073b.f55099a, v());
    }

    private void r(@n0 Canvas canvas, @n0 Paint paint, @n0 Path path, @n0 p pVar, @n0 RectF rectF) {
        if (!pVar.u(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fA = pVar.t().a(rectF) * this.f55073b.f55109k;
            canvas.drawRoundRect(rectF, fA, fA, paint);
        }
    }

    @n0
    private RectF w() {
        this.f55082k.set(v());
        float fO = O();
        this.f55082k.inset(fO, fO);
        return this.f55082k;
    }

    public Paint.Style A() {
        return this.f55073b.f55120v;
    }

    @Deprecated
    public void A0(int i10) {
        this.f55073b.f55116r = i10;
    }

    public float B() {
        return this.f55073b.f55112n;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void B0(int i10) {
        d dVar = this.f55073b;
        if (dVar.f55117s != i10) {
            dVar.f55117s = i10;
            a0();
        }
    }

    @Deprecated
    public void C(int i10, int i11, @n0 Path path) {
        h(new RectF(0.0f, 0.0f, i10, i11), path);
    }

    @Deprecated
    public void C0(@n0 s sVar) {
        setShapeAppearanceModel(sVar);
    }

    @androidx.annotation.l
    public int D() {
        return this.f55093v;
    }

    public void D0(float f10, @androidx.annotation.l int i10) {
        I0(f10);
        F0(ColorStateList.valueOf(i10));
    }

    public float E() {
        return this.f55073b.f55108j;
    }

    public void E0(float f10, @p0 ColorStateList colorStateList) {
        I0(f10);
        F0(colorStateList);
    }

    public int F() {
        return this.f55073b.f55118t;
    }

    public void F0(@p0 ColorStateList colorStateList) {
        d dVar = this.f55073b;
        if (dVar.f55103e != colorStateList) {
            dVar.f55103e = colorStateList;
            onStateChange(getState());
        }
    }

    public int G() {
        return this.f55073b.f55115q;
    }

    public void G0(@androidx.annotation.l int i10) {
        H0(ColorStateList.valueOf(i10));
    }

    @Deprecated
    public int H() {
        return (int) x();
    }

    public void H0(ColorStateList colorStateList) {
        this.f55073b.f55104f = colorStateList;
        N0();
        a0();
    }

    public int I() {
        d dVar = this.f55073b;
        return (int) (((double) dVar.f55117s) * Math.sin(Math.toRadians(dVar.f55118t)));
    }

    public void I0(float f10) {
        this.f55073b.f55110l = f10;
        invalidateSelf();
    }

    public int J() {
        d dVar = this.f55073b;
        return (int) (((double) dVar.f55117s) * Math.cos(Math.toRadians(dVar.f55118t)));
    }

    public void J0(float f10) {
        d dVar = this.f55073b;
        if (dVar.f55114p != f10) {
            dVar.f55114p = f10;
            O0();
        }
    }

    public int K() {
        return this.f55073b.f55116r;
    }

    public void K0(boolean z10) {
        d dVar = this.f55073b;
        if (dVar.f55119u != z10) {
            dVar.f55119u = z10;
            invalidateSelf();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int L() {
        return this.f55073b.f55117s;
    }

    public void L0(float f10) {
        J0(f10 - x());
    }

    @p0
    @Deprecated
    public s M() {
        p shapeAppearanceModel = getShapeAppearanceModel();
        if (shapeAppearanceModel instanceof s) {
            return (s) shapeAppearanceModel;
        }
        return null;
    }

    @p0
    public ColorStateList N() {
        return this.f55073b.f55103e;
    }

    @p0
    public ColorStateList P() {
        return this.f55073b.f55104f;
    }

    public float Q() {
        return this.f55073b.f55110l;
    }

    @p0
    public ColorStateList R() {
        return this.f55073b.f55105g;
    }

    public float S() {
        return this.f55073b.f55099a.r().a(v());
    }

    public float T() {
        return this.f55073b.f55099a.t().a(v());
    }

    public float U() {
        return this.f55073b.f55114p;
    }

    public float V() {
        return x() + U();
    }

    public void Z(Context context) {
        this.f55073b.f55100b = new f9.a(context);
        O0();
    }

    public boolean b0() {
        f9.a aVar = this.f55073b.f55100b;
        return aVar != null && aVar.l();
    }

    public boolean c0() {
        return this.f55073b.f55100b != null;
    }

    public boolean d0(int i10, int i11) {
        return getTransparentRegion().contains(i10, i11);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@n0 Canvas canvas) {
        this.f55086o.setColorFilter(this.f55091t);
        int alpha = this.f55086o.getAlpha();
        this.f55086o.setAlpha(h0(alpha, this.f55073b.f55111m));
        this.f55087p.setColorFilter(this.f55092u);
        this.f55087p.setStrokeWidth(this.f55073b.f55110l);
        int alpha2 = this.f55087p.getAlpha();
        this.f55087p.setAlpha(h0(alpha2, this.f55073b.f55111m));
        if (this.f55077f) {
            i();
            g(v(), this.f55079h);
            this.f55077f = false;
        }
        g0(canvas);
        if (X()) {
            p(canvas);
        }
        if (Y()) {
            s(canvas);
        }
        this.f55086o.setAlpha(alpha);
        this.f55087p.setAlpha(alpha2);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean e0() {
        return this.f55073b.f55099a.u(v());
    }

    @Deprecated
    public boolean f0() {
        int i10 = this.f55073b.f55115q;
        return i10 == 0 || i10 == 2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f55073b.f55111m;
    }

    @Override // android.graphics.drawable.Drawable
    @p0
    public Drawable.ConstantState getConstantState() {
        return this.f55073b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@n0 Outline outline) {
        if (this.f55073b.f55115q == 2) {
            return;
        }
        if (e0()) {
            outline.setRoundRect(getBounds(), S() * this.f55073b.f55109k);
        } else {
            g(v(), this.f55079h);
            e9.a.h(outline, this.f55079h);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@n0 Rect rect) {
        Rect rect2 = this.f55073b.f55107i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // com.google.android.material.shape.t
    @n0
    public p getShapeAppearanceModel() {
        return this.f55073b.f55099a;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f55083l.set(getBounds());
        g(v(), this.f55079h);
        this.f55084m.setPath(this.f55079h, this.f55083l);
        this.f55083l.op(this.f55084m, Region.Op.DIFFERENCE);
        return this.f55083l;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected final void h(@n0 RectF rectF, @n0 Path path) {
        q qVar = this.f55090s;
        d dVar = this.f55073b;
        qVar.e(dVar.f55099a, dVar.f55109k, rectF, this.f55089r, path);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f55077f = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f55073b.f55105g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f55073b.f55104f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f55073b.f55103e) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f55073b.f55102d) != null && colorStateList4.isStateful())));
    }

    public boolean j0() {
        return (e0() || this.f55079h.isConvex() || Build.VERSION.SDK_INT >= 29) ? false : true;
    }

    public void k0(float f10) {
        setShapeAppearanceModel(this.f55073b.f55099a.w(f10));
    }

    @androidx.annotation.l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected int l(@androidx.annotation.l int i10) {
        float fV = V() + B();
        f9.a aVar = this.f55073b.f55100b;
        return aVar != null ? aVar.e(i10, fV) : i10;
    }

    public void l0(@n0 e eVar) {
        setShapeAppearanceModel(this.f55073b.f55099a.x(eVar));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void m0(boolean z10) {
        this.f55090s.n(z10);
    }

    @Override // android.graphics.drawable.Drawable
    @n0
    public Drawable mutate() {
        this.f55073b = new d(this.f55073b);
        return this;
    }

    public void n0(float f10) {
        d dVar = this.f55073b;
        if (dVar.f55113o != f10) {
            dVar.f55113o = f10;
            O0();
        }
    }

    public void o0(@p0 ColorStateList colorStateList) {
        d dVar = this.f55073b;
        if (dVar.f55102d != colorStateList) {
            dVar.f55102d = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f55077f = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.z.b
    protected boolean onStateChange(int[] iArr) {
        boolean z10 = M0(iArr) || N0();
        if (z10) {
            invalidateSelf();
        }
        return z10;
    }

    public void p0(float f10) {
        d dVar = this.f55073b;
        if (dVar.f55109k != f10) {
            dVar.f55109k = f10;
            this.f55077f = true;
            invalidateSelf();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected void q(@n0 Canvas canvas, @n0 Paint paint, @n0 Path path, @n0 RectF rectF) {
        r(canvas, paint, path, this.f55073b.f55099a, rectF);
    }

    public void q0(int i10, int i11, int i12, int i13) {
        d dVar = this.f55073b;
        if (dVar.f55107i == null) {
            dVar.f55107i = new Rect();
        }
        this.f55073b.f55107i.set(i10, i11, i12, i13);
        invalidateSelf();
    }

    public void r0(Paint.Style style) {
        this.f55073b.f55120v = style;
        a0();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected void s(@n0 Canvas canvas) {
        r(canvas, this.f55087p, this.f55080i, this.f55085n, w());
    }

    public void s0(float f10) {
        d dVar = this.f55073b;
        if (dVar.f55112n != f10) {
            dVar.f55112n = f10;
            O0();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@f0(from = 0, to = 255) int i10) {
        d dVar = this.f55073b;
        if (dVar.f55111m != i10) {
            dVar.f55111m = i10;
            a0();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@p0 ColorFilter colorFilter) {
        this.f55073b.f55101c = colorFilter;
        a0();
    }

    @Override // com.google.android.material.shape.t
    public void setShapeAppearanceModel(@n0 p pVar) {
        this.f55073b.f55099a = pVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.p
    public void setTint(@androidx.annotation.l int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.p
    public void setTintList(@p0 ColorStateList colorStateList) {
        this.f55073b.f55105g = colorStateList;
        N0();
        a0();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.p
    public void setTintMode(@p0 PorterDuff.Mode mode) {
        d dVar = this.f55073b;
        if (dVar.f55106h != mode) {
            dVar.f55106h = mode;
            N0();
            a0();
        }
    }

    public float t() {
        return this.f55073b.f55099a.j().a(v());
    }

    public void t0(float f10) {
        d dVar = this.f55073b;
        if (dVar.f55108j != f10) {
            dVar.f55108j = f10;
            invalidateSelf();
        }
    }

    public float u() {
        return this.f55073b.f55099a.l().a(v());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void u0(boolean z10) {
        this.f55095x = z10;
    }

    @n0
    protected RectF v() {
        this.f55081j.set(getBounds());
        return this.f55081j;
    }

    public void v0(int i10) {
        this.f55088q.e(i10);
        this.f55073b.f55119u = false;
        a0();
    }

    public void w0(int i10) {
        d dVar = this.f55073b;
        if (dVar.f55118t != i10) {
            dVar.f55118t = i10;
            a0();
        }
    }

    public float x() {
        return this.f55073b.f55113o;
    }

    public void x0(int i10) {
        d dVar = this.f55073b;
        if (dVar.f55115q != i10) {
            dVar.f55115q = i10;
            a0();
        }
    }

    @p0
    public ColorStateList y() {
        return this.f55073b.f55102d;
    }

    @Deprecated
    public void y0(int i10) {
        n0(i10);
    }

    public float z() {
        return this.f55073b.f55109k;
    }

    @Deprecated
    public void z0(boolean z10) {
        x0(!z10 ? 1 : 0);
    }
}
