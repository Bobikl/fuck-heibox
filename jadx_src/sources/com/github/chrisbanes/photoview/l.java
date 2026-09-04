package com.github.chrisbanes.photoview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.OverScroller;

/* JADX INFO: compiled from: PhotoViewAttacher.java */
/* JADX INFO: loaded from: classes6.dex */
public class l implements View.OnTouchListener, View.OnLayoutChangeListener {
    private static float G = 3.0f;
    private static float H = 1.75f;
    private static float I = 1.0f;
    private static int J = 200;
    private static final int K = -1;
    private static final int L = 0;
    private static final int M = 1;
    private static final int N = 2;
    private static final int O = -1;
    private static final int P = 0;
    private static final int Q = 1;
    private static final int R = 2;
    private static int S = 1;
    private float C;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ImageView f43103i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private GestureDetector f43104j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.github.chrisbanes.photoview.c f43105k;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private com.github.chrisbanes.photoview.e f43111q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private g f43112r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private com.github.chrisbanes.photoview.f f43113s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private k f43114t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private View.OnClickListener f43115u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private View.OnLongClickListener f43116v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private h f43117w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private i f43118x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private j f43119y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private f f43120z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Interpolator f43096b = new AccelerateDecelerateInterpolator();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f43097c = J;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f43098d = I;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f43099e = H;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f43100f = G;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f43101g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f43102h = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Matrix f43106l = new Matrix();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Matrix f43107m = new Matrix();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Matrix f43108n = new Matrix();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final RectF f43109o = new RectF();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final float[] f43110p = new float[9];
    private int A = 2;
    private int B = 2;
    private boolean D = true;
    private ImageView.ScaleType E = ImageView.ScaleType.FIT_CENTER;
    private com.github.chrisbanes.photoview.d F = new a();

    /* JADX INFO: compiled from: PhotoViewAttacher.java */
    public class a implements com.github.chrisbanes.photoview.d {
        a() {
        }

        @Override // com.github.chrisbanes.photoview.d
        public void a(float f10, float f11) {
            if (l.this.f43105k.e()) {
                return;
            }
            if (l.this.f43119y != null) {
                l.this.f43119y.a(f10, f11);
            }
            l.this.f43108n.postTranslate(f10, f11);
            l.this.B();
            ViewParent parent = l.this.f43103i.getParent();
            if (!l.this.f43101g || l.this.f43105k.e() || l.this.f43102h) {
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
            } else if ((l.this.A == 2 || ((l.this.A == 0 && f10 >= 1.0f) || ((l.this.A == 1 && f10 <= -1.0f) || ((l.this.B == 0 && f11 >= 1.0f) || (l.this.B == 1 && f11 <= -1.0f))))) && parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
        }

        @Override // com.github.chrisbanes.photoview.d
        public void b(float f10, float f11, float f12, float f13) {
            l lVar = l.this;
            lVar.f43120z = lVar.new f(lVar.f43103i.getContext());
            f fVar = l.this.f43120z;
            l lVar2 = l.this;
            int iJ = lVar2.J(lVar2.f43103i);
            l lVar3 = l.this;
            fVar.b(iJ, lVar3.I(lVar3.f43103i), (int) f12, (int) f13);
            l.this.f43103i.post(l.this.f43120z);
        }

        @Override // com.github.chrisbanes.photoview.d
        public void c(float f10, float f11, float f12) {
            if (l.this.N() < l.this.f43100f || f10 < 1.0f) {
                if (l.this.f43117w != null) {
                    l.this.f43117w.a(f10, f11, f12);
                }
                l.this.f43108n.postScale(f10, f10, f11, f12);
                l.this.B();
            }
        }
    }

    /* JADX INFO: compiled from: PhotoViewAttacher.java */
    public class b extends GestureDetector.SimpleOnGestureListener {
        b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            if (l.this.f43118x == null || l.this.N() > l.I || motionEvent.getPointerCount() > l.S || motionEvent2.getPointerCount() > l.S) {
                return false;
            }
            return l.this.f43118x.onFling(motionEvent, motionEvent2, f10, f11);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            if (l.this.f43116v != null) {
                l.this.f43116v.onLongClick(l.this.f43103i);
            }
        }
    }

    /* JADX INFO: compiled from: PhotoViewAttacher.java */
    public class c implements GestureDetector.OnDoubleTapListener {
        c() {
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            try {
                float fN = l.this.N();
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                if (fN < l.this.L()) {
                    l lVar = l.this;
                    lVar.o0(lVar.L(), x10, y10, true);
                } else if (fN < l.this.L() || fN >= l.this.K()) {
                    l lVar2 = l.this;
                    lVar2.o0(lVar2.M(), x10, y10, true);
                } else {
                    l lVar3 = l.this;
                    lVar3.o0(lVar3.K(), x10, y10, true);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            return true;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (l.this.f43115u != null) {
                l.this.f43115u.onClick(l.this.f43103i);
            }
            RectF rectFE = l.this.E();
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            if (l.this.f43114t != null) {
                l.this.f43114t.a(l.this.f43103i, x10, y10);
            }
            if (rectFE == null) {
                return false;
            }
            if (!rectFE.contains(x10, y10)) {
                if (l.this.f43113s == null) {
                    return false;
                }
                l.this.f43113s.a(l.this.f43103i);
                return false;
            }
            float fWidth = (x10 - rectFE.left) / rectFE.width();
            float fHeight = (y10 - rectFE.top) / rectFE.height();
            if (l.this.f43112r == null) {
                return true;
            }
            l.this.f43112r.a(l.this.f43103i, fWidth, fHeight);
            return true;
        }
    }

    /* JADX INFO: compiled from: PhotoViewAttacher.java */
    public static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f43124a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f43124a = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43124a[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f43124a[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f43124a[ImageView.ScaleType.FIT_XY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: compiled from: PhotoViewAttacher.java */
    public class e implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f43125b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f43126c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f43127d = System.currentTimeMillis();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f43128e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f43129f;

        public e(float f10, float f11, float f12, float f13) {
            this.f43125b = f12;
            this.f43126c = f13;
            this.f43128e = f10;
            this.f43129f = f11;
        }

        private float a() {
            return l.this.f43096b.getInterpolation(Math.min(1.0f, ((System.currentTimeMillis() - this.f43127d) * 1.0f) / l.this.f43097c));
        }

        @Override // java.lang.Runnable
        public void run() {
            float fA = a();
            float f10 = this.f43128e;
            l.this.F.c((f10 + ((this.f43129f - f10) * fA)) / l.this.N(), this.f43125b, this.f43126c);
            if (fA < 1.0f) {
                com.github.chrisbanes.photoview.b.a(l.this.f43103i, this);
            }
        }
    }

    /* JADX INFO: compiled from: PhotoViewAttacher.java */
    public class f implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final OverScroller f43131b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f43132c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f43133d;

        public f(Context context) {
            this.f43131b = new OverScroller(context);
        }

        public void a() {
            this.f43131b.forceFinished(true);
        }

        public void b(int i10, int i11, int i12, int i13) {
            int i14;
            int iRound;
            int i15;
            int iRound2;
            RectF rectFE = l.this.E();
            if (rectFE == null) {
                return;
            }
            int iRound3 = Math.round(-rectFE.left);
            float f10 = i10;
            if (f10 < rectFE.width()) {
                iRound = Math.round(rectFE.width() - f10);
                i14 = 0;
            } else {
                i14 = iRound3;
                iRound = i14;
            }
            int iRound4 = Math.round(-rectFE.top);
            float f11 = i11;
            if (f11 < rectFE.height()) {
                iRound2 = Math.round(rectFE.height() - f11);
                i15 = 0;
            } else {
                i15 = iRound4;
                iRound2 = i15;
            }
            this.f43132c = iRound3;
            this.f43133d = iRound4;
            if (iRound3 == iRound && iRound4 == iRound2) {
                return;
            }
            this.f43131b.fling(iRound3, iRound4, i12, i13, i14, iRound, i15, iRound2, 0, 0);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f43131b.isFinished() && this.f43131b.computeScrollOffset()) {
                int currX = this.f43131b.getCurrX();
                int currY = this.f43131b.getCurrY();
                l.this.f43108n.postTranslate(this.f43132c - currX, this.f43133d - currY);
                l.this.B();
                this.f43132c = currX;
                this.f43133d = currY;
                com.github.chrisbanes.photoview.b.a(l.this.f43103i, this);
            }
        }
    }

    public l(ImageView imageView) {
        this.f43103i = imageView;
        imageView.setOnTouchListener(this);
        imageView.addOnLayoutChangeListener(this);
        if (imageView.isInEditMode()) {
            return;
        }
        this.C = 0.0f;
        this.f43105k = new com.github.chrisbanes.photoview.c(imageView.getContext(), this.F);
        GestureDetector gestureDetector = new GestureDetector(imageView.getContext(), new b());
        this.f43104j = gestureDetector;
        gestureDetector.setOnDoubleTapListener(new c());
    }

    private void A() {
        f fVar = this.f43120z;
        if (fVar != null) {
            fVar.a();
            this.f43120z = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        if (C()) {
            X(G());
        }
    }

    private boolean C() {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        RectF rectFF = F(G());
        if (rectFF == null) {
            return false;
        }
        float fHeight = rectFF.height();
        float fWidth = rectFF.width();
        float fI = I(this.f43103i);
        float f15 = 0.0f;
        if (fHeight <= fI) {
            int i10 = d.f43124a[this.E.ordinal()];
            if (i10 != 2) {
                if (i10 != 3) {
                    f13 = (fI - fHeight) / 2.0f;
                    f14 = rectFF.top;
                } else {
                    f13 = fI - fHeight;
                    f14 = rectFF.top;
                }
                f10 = f13 - f14;
            } else {
                f10 = -rectFF.top;
            }
            this.B = 2;
        } else {
            float f16 = rectFF.top;
            if (f16 > 0.0f) {
                this.B = 0;
                f10 = -f16;
            } else {
                float f17 = rectFF.bottom;
                if (f17 < fI) {
                    this.B = 1;
                    f10 = fI - f17;
                } else {
                    this.B = -1;
                    f10 = 0.0f;
                }
            }
        }
        float fJ = J(this.f43103i);
        if (fWidth <= fJ) {
            int i11 = d.f43124a[this.E.ordinal()];
            if (i11 != 2) {
                if (i11 != 3) {
                    f11 = (fJ - fWidth) / 2.0f;
                    f12 = rectFF.left;
                } else {
                    f11 = fJ - fWidth;
                    f12 = rectFF.left;
                }
                f15 = f11 - f12;
            } else {
                f15 = -rectFF.left;
            }
            this.A = 2;
        } else {
            float f18 = rectFF.left;
            if (f18 > 0.0f) {
                this.A = 0;
                f15 = -f18;
            } else {
                float f19 = rectFF.right;
                if (f19 < fJ) {
                    f15 = fJ - f19;
                    this.A = 1;
                } else {
                    this.A = -1;
                }
            }
        }
        this.f43108n.postTranslate(f15, f10);
        return true;
    }

    private RectF F(Matrix matrix) {
        Drawable drawable = this.f43103i.getDrawable();
        if (drawable == null) {
            return null;
        }
        this.f43109o.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        matrix.mapRect(this.f43109o);
        return this.f43109o;
    }

    private Matrix G() {
        this.f43107m.set(this.f43106l);
        this.f43107m.postConcat(this.f43108n);
        return this.f43107m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int I(ImageView imageView) {
        return (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int J(ImageView imageView) {
        return (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
    }

    private float Q(Matrix matrix, int i10) {
        matrix.getValues(this.f43110p);
        return this.f43110p[i10];
    }

    private void T() {
        this.f43108n.reset();
        l0(this.C);
        X(G());
        C();
    }

    private void X(Matrix matrix) {
        RectF rectFF;
        this.f43103i.setImageMatrix(matrix);
        if (this.f43111q == null || (rectFF = F(matrix)) == null) {
            return;
        }
        this.f43111q.a(rectFF);
    }

    private void w0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        float fJ = J(this.f43103i);
        float fI = I(this.f43103i);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.f43106l.reset();
        float f10 = intrinsicWidth;
        float f11 = fJ / f10;
        float f12 = intrinsicHeight;
        float f13 = fI / f12;
        ImageView.ScaleType scaleType = this.E;
        if (scaleType == ImageView.ScaleType.CENTER) {
            this.f43106l.postTranslate((fJ - f10) / 2.0f, (fI - f12) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            float fMax = Math.max(f11, f13);
            this.f43106l.postScale(fMax, fMax);
            this.f43106l.postTranslate((fJ - (f10 * fMax)) / 2.0f, (fI - (f12 * fMax)) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
            float fMin = Math.min(1.0f, Math.min(f11, f13));
            this.f43106l.postScale(fMin, fMin);
            this.f43106l.postTranslate((fJ - (f10 * fMin)) / 2.0f, (fI - (f12 * fMin)) / 2.0f);
        } else {
            RectF rectF = new RectF(0.0f, 0.0f, f10, f12);
            RectF rectF2 = new RectF(0.0f, 0.0f, fJ, fI);
            if (((int) this.C) % 180 != 0) {
                rectF = new RectF(0.0f, 0.0f, f12, f10);
            }
            int i10 = d.f43124a[this.E.ordinal()];
            if (i10 == 1) {
                this.f43106l.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            } else if (i10 == 2) {
                this.f43106l.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
            } else if (i10 == 3) {
                this.f43106l.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
            } else if (i10 == 4) {
                this.f43106l.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            }
        }
        T();
    }

    public void D(Matrix matrix) {
        matrix.set(G());
    }

    public RectF E() {
        C();
        return F(G());
    }

    public Matrix H() {
        return this.f43107m;
    }

    public float K() {
        return this.f43100f;
    }

    public float L() {
        return this.f43099e;
    }

    public float M() {
        return this.f43098d;
    }

    public float N() {
        return (float) Math.sqrt(((float) Math.pow(Q(this.f43108n, 0), 2.0d)) + ((float) Math.pow(Q(this.f43108n, 3), 2.0d)));
    }

    public ImageView.ScaleType O() {
        return this.E;
    }

    public void P(Matrix matrix) {
        matrix.set(this.f43108n);
    }

    @Deprecated
    public boolean R() {
        return this.D;
    }

    public boolean S() {
        return this.D;
    }

    public void U(boolean z10) {
        this.f43101g = z10;
    }

    public void V(float f10) {
        this.C = f10 % 360.0f;
        v0();
        l0(this.C);
        B();
    }

    public boolean W(Matrix matrix) {
        if (matrix == null) {
            throw new IllegalArgumentException("Matrix cannot be null");
        }
        if (this.f43103i.getDrawable() == null) {
            return false;
        }
        this.f43108n.set(matrix);
        B();
        return true;
    }

    public void Y(float f10) {
        m.a(this.f43098d, this.f43099e, f10);
        this.f43100f = f10;
    }

    public void Z(float f10) {
        m.a(this.f43098d, f10, this.f43100f);
        this.f43099e = f10;
    }

    public void a0(float f10) {
        m.a(f10, this.f43099e, this.f43100f);
        this.f43098d = f10;
    }

    public void b0(View.OnClickListener onClickListener) {
        this.f43115u = onClickListener;
    }

    public void c0(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f43104j.setOnDoubleTapListener(onDoubleTapListener);
    }

    public void d0(View.OnLongClickListener onLongClickListener) {
        this.f43116v = onLongClickListener;
    }

    public void e0(com.github.chrisbanes.photoview.e eVar) {
        this.f43111q = eVar;
    }

    public void f0(com.github.chrisbanes.photoview.f fVar) {
        this.f43113s = fVar;
    }

    public void g0(g gVar) {
        this.f43112r = gVar;
    }

    public void h0(h hVar) {
        this.f43117w = hVar;
    }

    public void i0(i iVar) {
        this.f43118x = iVar;
    }

    public void j0(j jVar) {
        this.f43119y = jVar;
    }

    public void k0(k kVar) {
        this.f43114t = kVar;
    }

    public void l0(float f10) {
        this.f43108n.postRotate(f10 % 360.0f);
        B();
    }

    public void m0(float f10) {
        this.f43108n.setRotate(f10 % 360.0f);
        B();
    }

    public void n0(float f10) {
        p0(f10, false);
    }

    public void o0(float f10, float f11, float f12, boolean z10) {
        if (f10 < this.f43098d || f10 > this.f43100f) {
            throw new IllegalArgumentException("Scale must be within the range of minScale and maxScale");
        }
        if (z10) {
            this.f43103i.post(new e(N(), f10, f11, f12));
        } else {
            this.f43108n.setScale(f10, f10, f11, f12);
            B();
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        if (i10 == i14 && i11 == i15 && i12 == i16 && i13 == i17) {
            return;
        }
        w0(this.f43103i.getDrawable());
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007f  */
    /* JADX WARN: Code duplicated, block: B:35:0x009b  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b2  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        com.github.chrisbanes.photoview.c cVar;
        boolean z11;
        GestureDetector gestureDetector;
        boolean zE;
        boolean zD;
        boolean z12;
        boolean z13;
        RectF rectFE;
        boolean z14 = false;
        if (!this.D || !m.c((ImageView) view)) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                if (N() < this.f43098d) {
                    RectF rectFE2 = E();
                    if (rectFE2 != null) {
                        view.post(new e(N(), this.f43098d, rectFE2.centerX(), rectFE2.centerY()));
                        z10 = true;
                    }
                } else if (N() > this.f43100f && (rectFE = E()) != null) {
                    view.post(new e(N(), this.f43100f, rectFE.centerX(), rectFE.centerY()));
                    z10 = true;
                }
            }
            cVar = this.f43105k;
            if (cVar != null) {
                zE = cVar.e();
                zD = this.f43105k.d();
                boolean zF = this.f43105k.f(motionEvent);
                if (!zE || this.f43105k.e()) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (!zD || this.f43105k.d()) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                if (z12 && z13) {
                    z14 = true;
                }
                this.f43102h = z14;
                z11 = zF;
            } else {
                z11 = z10;
            }
            gestureDetector = this.f43104j;
            if (gestureDetector == null && gestureDetector.onTouchEvent(motionEvent)) {
                return true;
            }
        }
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        A();
        z10 = false;
        cVar = this.f43105k;
        if (cVar != null) {
            zE = cVar.e();
            zD = this.f43105k.d();
            boolean zF2 = this.f43105k.f(motionEvent);
            if (zE) {
                z12 = false;
            } else {
                z12 = false;
            }
            if (zD) {
                z13 = false;
            } else {
                z13 = false;
            }
            if (z12) {
                z14 = true;
            }
            this.f43102h = z14;
            z11 = zF2;
        } else {
            z11 = z10;
        }
        gestureDetector = this.f43104j;
        return gestureDetector == null ? z11 : z11;
    }

    public void p0(float f10, boolean z10) {
        o0(f10, this.f43103i.getRight() / 2, this.f43103i.getBottom() / 2, z10);
    }

    public void q0(float f10, float f11, float f12) {
        m.a(f10, f11, f12);
        this.f43098d = f10;
        this.f43099e = f11;
        this.f43100f = f12;
    }

    public void r0(ImageView.ScaleType scaleType) {
        if (!m.d(scaleType) || scaleType == this.E) {
            return;
        }
        this.E = scaleType;
        v0();
    }

    public void s0(Interpolator interpolator) {
        this.f43096b = interpolator;
    }

    public void t0(int i10) {
        this.f43097c = i10;
    }

    public void u0(boolean z10) {
        this.D = z10;
        v0();
    }

    public void v0() {
        if (this.D) {
            w0(this.f43103i.getDrawable());
        } else {
            T();
        }
    }
}
