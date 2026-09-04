package com.max.mediaselector.lib.photoview;

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
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: PhotoViewAttacher.java */
/* JADX INFO: loaded from: classes2.dex */
public class k implements View.OnTouchListener, View.OnLayoutChangeListener {
    private static final float G = 3.0f;
    private static final float H = 1.75f;
    private static final float I = 1.0f;
    private static final int J = 200;
    private static final int K = -1;
    private static final int L = 0;
    private static final int M = 1;
    private static final int N = 2;
    private static final int O = -1;
    private static final int P = 0;
    private static final int Q = 1;
    private static final int R = 2;
    private static final int S = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    private float C;
    private final com.max.mediaselector.lib.photoview.c F;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ImageView f75358i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private GestureDetector f75359j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.max.mediaselector.lib.photoview.b f75360k;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private com.max.mediaselector.lib.photoview.d f75366q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private com.max.mediaselector.lib.photoview.f f75367r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private com.max.mediaselector.lib.photoview.e f75368s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private j f75369t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private View.OnClickListener f75370u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private View.OnLongClickListener f75371v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private g f75372w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private h f75373x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private i f75374y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private f f75375z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Interpolator f75351b = new AccelerateDecelerateInterpolator();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f75352c = 200;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f75353d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f75354e = H;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f75355f = G;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f75356g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f75357h = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Matrix f75361l = new Matrix();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Matrix f75362m = new Matrix();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Matrix f75363n = new Matrix();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final RectF f75364o = new RectF();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final float[] f75365p = new float[9];
    private int A = 2;
    private int B = 2;
    private boolean D = true;
    private ImageView.ScaleType E = ImageView.ScaleType.FIT_CENTER;

    /* JADX INFO: compiled from: PhotoViewAttacher.java */
    public class a implements com.max.mediaselector.lib.photoview.c {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.max.mediaselector.lib.photoview.c
        public void a(float f10, float f11) {
            Object[] objArr = {new Float(f10), new Float(f11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Float.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.m.f35168z4, new Class[]{cls, cls}, Void.TYPE).isSupported || k.this.f75360k.e()) {
                return;
            }
            if (k.this.f75374y != null) {
                k.this.f75374y.a(f10, f11);
            }
            k.this.f75363n.postTranslate(f10, f11);
            k.q(k.this);
            ViewParent parent = k.this.f75358i.getParent();
            if (!k.this.f75356g || k.this.f75360k.e() || k.this.f75357h) {
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
            } else if ((k.this.A == 2 || ((k.this.A == 0 && f10 >= 1.0f) || ((k.this.A == 1 && f10 <= -1.0f) || ((k.this.B == 0 && f11 >= 1.0f) || (k.this.B == 1 && f11 <= -1.0f))))) && parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
        }

        @Override // com.max.mediaselector.lib.photoview.c
        public void b(float f10, float f11, float f12, float f13) {
            Object[] objArr = {new Float(f10), new Float(f11), new Float(f12), new Float(f13)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Float.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.m.A4, new Class[]{cls, cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            k kVar = k.this;
            kVar.f75375z = kVar.new f(kVar.f75358i.getContext());
            f fVar = k.this.f75375z;
            k kVar2 = k.this;
            int iC = k.c(kVar2, kVar2.f75358i);
            k kVar3 = k.this;
            fVar.b(iC, k.d(kVar3, kVar3.f75358i), (int) f12, (int) f13);
            k.this.f75358i.post(k.this.f75375z);
        }

        @Override // com.max.mediaselector.lib.photoview.c
        public void c(float f10, float f11, float f12) {
            Object[] objArr = {new Float(f10), new Float(f11), new Float(f12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Float.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.m.B4, new Class[]{cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            d(f10, f11, f12, 0.0f, 0.0f);
        }

        @Override // com.max.mediaselector.lib.photoview.c
        public void d(float f10, float f11, float f12, float f13, float f14) {
            Object[] objArr = {new Float(f10), new Float(f11), new Float(f12), new Float(f13), new Float(f14)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Float.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.m.C4, new Class[]{cls, cls, cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            if (k.this.L() < k.this.f75355f || f10 < 1.0f) {
                if (k.this.f75372w != null) {
                    k.this.f75372w.a(f10, f11, f12);
                }
                k.this.f75363n.postScale(f10, f10, f11, f12);
                k.this.f75363n.postTranslate(f13, f14);
                k.q(k.this);
            }
        }
    }

    /* JADX INFO: compiled from: PhotoViewAttacher.java */
    public class b extends GestureDetector.SimpleOnGestureListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            Object[] objArr = {motionEvent, motionEvent2, new Float(f10), new Float(f11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Float.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.m.E4, new Class[]{MotionEvent.class, MotionEvent.class, cls, cls}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (k.this.f75373x == null || k.this.L() > 1.0f || motionEvent.getPointerCount() > 1 || motionEvent2.getPointerCount() > 1) {
                return false;
            }
            return k.this.f75373x.onFling(motionEvent, motionEvent2, f10, f11);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            if (PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, bb.c.m.D4, new Class[]{MotionEvent.class}, Void.TYPE).isSupported || k.this.f75371v == null) {
                return;
            }
            k.this.f75371v.onLongClick(k.this.f75358i);
        }
    }

    /* JADX INFO: compiled from: PhotoViewAttacher.java */
    public class c implements GestureDetector.OnDoubleTapListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, bb.c.m.G4, new Class[]{MotionEvent.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            try {
                float fL = k.this.L();
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                if (fL < k.this.J()) {
                    k kVar = k.this;
                    kVar.m0(kVar.J(), x10, y10, true);
                } else if (fL < k.this.J() || fL >= k.this.I()) {
                    k kVar2 = k.this;
                    kVar2.m0(kVar2.K(), x10, y10, true);
                } else {
                    k kVar3 = k.this;
                    kVar3.m0(kVar3.I(), x10, y10, true);
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
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, bb.c.m.F4, new Class[]{MotionEvent.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (k.this.f75370u != null) {
                k.this.f75370u.onClick(k.this.f75358i);
            }
            RectF rectFC = k.this.C();
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            if (k.this.f75369t != null) {
                k.this.f75369t.a(k.this.f75358i, x10, y10);
            }
            if (rectFC != null) {
                if (rectFC.contains(x10, y10)) {
                    float fWidth = (x10 - rectFC.left) / rectFC.width();
                    float fHeight = (y10 - rectFC.top) / rectFC.height();
                    if (k.this.f75367r != null) {
                        k.this.f75367r.a(k.this.f75358i, fWidth, fHeight);
                    }
                    return true;
                }
                if (k.this.f75368s != null) {
                    k.this.f75368s.a(k.this.f75358i);
                }
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: PhotoViewAttacher.java */
    public static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f75379a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f75379a = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f75379a[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f75379a[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f75379a[ImageView.ScaleType.FIT_XY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: compiled from: PhotoViewAttacher.java */
    public class e implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f75380b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f75381c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f75382d = System.currentTimeMillis();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f75383e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f75384f;

        public e(float f10, float f11, float f12, float f13) {
            this.f75380b = f12;
            this.f75381c = f13;
            this.f75383e = f10;
            this.f75384f = f11;
        }

        private float a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.I4, new Class[0], Float.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Float) patchProxyResultProxy.result).floatValue();
            }
            return k.this.f75351b.getInterpolation(Math.min(1.0f, ((System.currentTimeMillis() - this.f75382d) * 1.0f) / k.this.f75352c));
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.H4, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            float fA = a();
            float f10 = this.f75383e;
            k.this.F.c((f10 + ((this.f75384f - f10) * fA)) / k.this.L(), this.f75380b, this.f75381c);
            if (fA < 1.0f) {
                com.max.mediaselector.lib.photoview.a.a(k.this.f75358i, this);
            }
        }
    }

    /* JADX INFO: compiled from: PhotoViewAttacher.java */
    public class f implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final OverScroller f75386b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f75387c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f75388d;

        public f(Context context) {
            this.f75386b = new OverScroller(context);
        }

        public void a() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.J4, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            this.f75386b.forceFinished(true);
        }

        public void b(int i10, int i11, int i12, int i13) {
            RectF rectFC;
            int iRound;
            int i14;
            int iRound2;
            int i15;
            Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.m.K4, new Class[]{cls, cls, cls, cls}, Void.TYPE).isSupported || (rectFC = k.this.C()) == null) {
                return;
            }
            int iRound3 = Math.round(-rectFC.left);
            float f10 = i10;
            if (f10 < rectFC.width()) {
                iRound = Math.round(rectFC.width() - f10);
                i14 = 0;
            } else {
                iRound = iRound3;
                i14 = iRound;
            }
            int iRound4 = Math.round(-rectFC.top);
            float f11 = i11;
            if (f11 < rectFC.height()) {
                iRound2 = Math.round(rectFC.height() - f11);
                i15 = 0;
            } else {
                iRound2 = iRound4;
                i15 = iRound2;
            }
            this.f75387c = iRound3;
            this.f75388d = iRound4;
            if (iRound3 == iRound && iRound4 == iRound2) {
                return;
            }
            this.f75386b.fling(iRound3, iRound4, i12, i13, i14, iRound, i15, iRound2, 0, 0);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.L4, new Class[0], Void.TYPE).isSupported || this.f75386b.isFinished() || !this.f75386b.computeScrollOffset()) {
                return;
            }
            int currX = this.f75386b.getCurrX();
            int currY = this.f75386b.getCurrY();
            k.this.f75363n.postTranslate(this.f75387c - currX, this.f75388d - currY);
            k.q(k.this);
            this.f75387c = currX;
            this.f75388d = currY;
            com.max.mediaselector.lib.photoview.a.a(k.this.f75358i, this);
        }
    }

    public k(ImageView imageView) {
        a aVar = new a();
        this.F = aVar;
        this.f75358i = imageView;
        imageView.setOnTouchListener(this);
        imageView.addOnLayoutChangeListener(this);
        if (imageView.isInEditMode()) {
            return;
        }
        this.C = 0.0f;
        this.f75360k = new com.max.mediaselector.lib.photoview.b(imageView.getContext(), aVar);
        GestureDetector gestureDetector = new GestureDetector(imageView.getContext(), new b());
        this.f75359j = gestureDetector;
        gestureDetector.setOnDoubleTapListener(new c());
    }

    private boolean A() {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f35014s4, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        RectF rectFD = D(E());
        if (rectFD == null) {
            return false;
        }
        float fHeight = rectFD.height();
        float fWidth = rectFD.width();
        float fG = G(this.f75358i);
        float f15 = 0.0f;
        if (fHeight <= fG) {
            int i10 = d.f75379a[this.E.ordinal()];
            if (i10 != 2) {
                if (i10 != 3) {
                    f13 = (fG - fHeight) / 2.0f;
                    f14 = rectFD.top;
                } else {
                    f13 = fG - fHeight;
                    f14 = rectFD.top;
                }
                f10 = f13 - f14;
            } else {
                f10 = -rectFD.top;
            }
            this.B = 2;
        } else {
            float f16 = rectFD.top;
            if (f16 > 0.0f) {
                this.B = 0;
                f10 = -f16;
            } else {
                float f17 = rectFD.bottom;
                if (f17 < fG) {
                    this.B = 1;
                    f10 = fG - f17;
                } else {
                    this.B = -1;
                    f10 = 0.0f;
                }
            }
        }
        float fH = H(this.f75358i);
        if (fWidth <= fH) {
            int i11 = d.f75379a[this.E.ordinal()];
            if (i11 != 2) {
                if (i11 != 3) {
                    f11 = (fH - fWidth) / 2.0f;
                    f12 = rectFD.left;
                } else {
                    f11 = fH - fWidth;
                    f12 = rectFD.left;
                }
                f15 = f11 - f12;
            } else {
                f15 = -rectFD.left;
            }
            this.A = 2;
        } else {
            float f18 = rectFD.left;
            if (f18 > 0.0f) {
                this.A = 0;
                f15 = -f18;
            } else {
                float f19 = rectFD.right;
                if (f19 < fH) {
                    f15 = fH - f19;
                    this.A = 1;
                } else {
                    this.A = -1;
                }
            }
        }
        this.f75363n.postTranslate(f15, f10);
        return true;
    }

    private RectF D(Matrix matrix) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{matrix}, this, changeQuickRedirect, false, bb.c.m.f34970q4, new Class[]{Matrix.class}, RectF.class);
        if (patchProxyResultProxy.isSupported) {
            return (RectF) patchProxyResultProxy.result;
        }
        Drawable drawable = this.f75358i.getDrawable();
        if (drawable == null) {
            return null;
        }
        this.f75364o.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        matrix.mapRect(this.f75364o);
        return this.f75364o;
    }

    private Matrix E() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f34855l4, new Class[0], Matrix.class);
        if (patchProxyResultProxy.isSupported) {
            return (Matrix) patchProxyResultProxy.result;
        }
        this.f75362m.set(this.f75361l);
        this.f75362m.postConcat(this.f75363n);
        return this.f75362m;
    }

    private int G(ImageView imageView) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, bb.c.m.f35058u4, new Class[]{ImageView.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
    }

    private int H(ImageView imageView) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, bb.c.m.f35036t4, new Class[]{ImageView.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
    }

    private float O(Matrix matrix, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{matrix, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.f34878m4, new Class[]{Matrix.class, Integer.TYPE}, Float.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Float) patchProxyResultProxy.result).floatValue();
        }
        matrix.getValues(this.f75365p);
        return this.f75365p[i10];
    }

    private void R() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f34901n4, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f75363n.reset();
        j0(this.C);
        V(E());
        A();
    }

    private void V(Matrix matrix) {
        RectF rectFD;
        if (PatchProxy.proxy(new Object[]{matrix}, this, changeQuickRedirect, false, bb.c.m.f34924o4, new Class[]{Matrix.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f75358i.setImageMatrix(matrix);
        if (this.f75366q == null || (rectFD = D(matrix)) == null) {
            return;
        }
        this.f75366q.a(rectFD);
    }

    static /* synthetic */ int c(k kVar, ImageView imageView) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{kVar, imageView}, null, changeQuickRedirect, true, bb.c.m.f35124x4, new Class[]{k.class, ImageView.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : kVar.H(imageView);
    }

    static /* synthetic */ int d(k kVar, ImageView imageView) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{kVar, imageView}, null, changeQuickRedirect, true, bb.c.m.f35146y4, new Class[]{k.class, ImageView.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : kVar.G(imageView);
    }

    static /* synthetic */ void q(k kVar) {
        if (PatchProxy.proxy(new Object[]{kVar}, null, changeQuickRedirect, true, bb.c.m.f35102w4, new Class[]{k.class}, Void.TYPE).isSupported) {
            return;
        }
        kVar.z();
    }

    private void u0(Drawable drawable) {
        if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, bb.c.m.f34992r4, new Class[]{Drawable.class}, Void.TYPE).isSupported || drawable == null) {
            return;
        }
        float fH = H(this.f75358i);
        float fG = G(this.f75358i);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.f75361l.reset();
        float f10 = intrinsicWidth;
        float f11 = fH / f10;
        float f12 = intrinsicHeight;
        float f13 = fG / f12;
        ImageView.ScaleType scaleType = this.E;
        if (scaleType == ImageView.ScaleType.CENTER) {
            this.f75361l.postTranslate((fH - f10) / 2.0f, (fG - f12) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            float fMax = Math.max(f11, f13);
            this.f75361l.postScale(fMax, fMax);
            this.f75361l.postTranslate((fH - (f10 * fMax)) / 2.0f, (fG - (f12 * fMax)) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
            float fMin = Math.min(1.0f, Math.min(f11, f13));
            this.f75361l.postScale(fMin, fMin);
            this.f75361l.postTranslate((fH - (f10 * fMin)) / 2.0f, (fG - (f12 * fMin)) / 2.0f);
        } else {
            RectF rectF = new RectF(0.0f, 0.0f, f10, f12);
            RectF rectF2 = new RectF(0.0f, 0.0f, fH, fG);
            if (((int) this.C) % 180 != 0) {
                rectF = new RectF(0.0f, 0.0f, f12, f10);
            }
            int i10 = d.f75379a[this.E.ordinal()];
            if (i10 == 1) {
                this.f75361l.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            } else if (i10 == 2) {
                this.f75361l.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
            } else if (i10 == 3) {
                this.f75361l.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
            } else if (i10 == 4) {
                this.f75361l.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            }
        }
        R();
    }

    private void y() {
        f fVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f35080v4, new Class[0], Void.TYPE).isSupported || (fVar = this.f75375z) == null) {
            return;
        }
        fVar.a();
        this.f75375z = null;
    }

    private void z() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f34947p4, new Class[0], Void.TYPE).isSupported && A()) {
            V(E());
        }
    }

    public void B(Matrix matrix) {
        if (PatchProxy.proxy(new Object[]{matrix}, this, changeQuickRedirect, false, bb.c.m.f34809j4, new Class[]{Matrix.class}, Void.TYPE).isSupported) {
            return;
        }
        matrix.set(E());
    }

    public RectF C() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.R3, new Class[0], RectF.class);
        if (patchProxyResultProxy.isSupported) {
            return (RectF) patchProxyResultProxy.result;
        }
        A();
        return D(E());
    }

    public Matrix F() {
        return this.f75362m;
    }

    public float I() {
        return this.f75355f;
    }

    public float J() {
        return this.f75354e;
    }

    public float K() {
        return this.f75353d;
    }

    public float L() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.W3, new Class[0], Float.TYPE);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : (float) Math.sqrt(((float) Math.pow(O(this.f75363n, 0), 2.0d)) + ((float) Math.pow(O(this.f75363n, 3), 2.0d)));
    }

    public ImageView.ScaleType M() {
        return this.E;
    }

    public void N(Matrix matrix) {
        if (PatchProxy.proxy(new Object[]{matrix}, this, changeQuickRedirect, false, bb.c.m.f34832k4, new Class[]{Matrix.class}, Void.TYPE).isSupported) {
            return;
        }
        matrix.set(this.f75363n);
    }

    @Deprecated
    public boolean P() {
        return this.D;
    }

    public boolean Q() {
        return this.D;
    }

    public void S(boolean z10) {
        this.f75356g = z10;
    }

    public void T(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.m.T3, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.C = f10 % 360.0f;
        t0();
        j0(this.C);
        z();
    }

    public boolean U(Matrix matrix) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{matrix}, this, changeQuickRedirect, false, bb.c.m.S3, new Class[]{Matrix.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (matrix == null) {
            throw new IllegalArgumentException("Matrix cannot be null");
        }
        if (this.f75358i.getDrawable() == null) {
            return false;
        }
        this.f75363n.set(matrix);
        z();
        return true;
    }

    public void W(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.m.f34624b4, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        l.a(this.f75353d, this.f75354e, f10);
        this.f75355f = f10;
    }

    public void X(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.m.f34601a4, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        l.a(this.f75353d, f10, this.f75355f);
        this.f75354e = f10;
    }

    public void Y(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.m.Z3, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        l.a(f10, this.f75354e, this.f75355f);
        this.f75353d = f10;
    }

    public void Z(View.OnClickListener onClickListener) {
        this.f75370u = onClickListener;
    }

    public void a0(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        if (PatchProxy.proxy(new Object[]{onDoubleTapListener}, this, changeQuickRedirect, false, bb.c.m.Q3, new Class[]{GestureDetector.OnDoubleTapListener.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f75359j.setOnDoubleTapListener(onDoubleTapListener);
    }

    public void b0(View.OnLongClickListener onLongClickListener) {
        this.f75371v = onLongClickListener;
    }

    public void c0(com.max.mediaselector.lib.photoview.d dVar) {
        this.f75366q = dVar;
    }

    public void d0(com.max.mediaselector.lib.photoview.e eVar) {
        this.f75368s = eVar;
    }

    public void e0(com.max.mediaselector.lib.photoview.f fVar) {
        this.f75367r = fVar;
    }

    public void f0(g gVar) {
        this.f75372w = gVar;
    }

    public void g0(h hVar) {
        this.f75373x = hVar;
    }

    public void h0(i iVar) {
        this.f75374y = iVar;
    }

    public void i0(j jVar) {
        this.f75369t = jVar;
    }

    public void j0(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.m.V3, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f75363n.postRotate(f10 % 360.0f);
        z();
    }

    public void k0(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.m.U3, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f75363n.setRotate(f10 % 360.0f);
        z();
    }

    public void l0(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.m.f34671d4, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        n0(f10, false);
    }

    public void m0(float f10, float f11, float f12, boolean z10) {
        Object[] objArr = {new Float(f10), new Float(f11), new Float(f12), new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.m.f34717f4, new Class[]{cls, cls, cls, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (f10 < this.f75353d || f10 > this.f75355f) {
            throw new IllegalArgumentException("Scale must be within the range of minScale and maxScale");
        }
        if (z10) {
            this.f75358i.post(new e(L(), f10, f11, f12));
        } else {
            this.f75363n.setScale(f10, f10, f11, f12);
            z();
        }
    }

    public void n0(float f10, boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10), new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.m.f34694e4, new Class[]{Float.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        m0(f10, this.f75358i.getRight() / 2, this.f75358i.getBottom() / 2, z10);
    }

    public void o0(float f10, float f11, float f12) {
        Object[] objArr = {new Float(f10), new Float(f11), new Float(f12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.m.f34647c4, new Class[]{cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        l.a(f10, f11, f12);
        this.f75353d = f10;
        this.f75354e = f11;
        this.f75355f = f12;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        Object[] objArr = {view, new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13), new Integer(i14), new Integer(i15), new Integer(i16), new Integer(i17)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.m.X3, new Class[]{View.class, cls, cls, cls, cls, cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        if (i10 == i14 && i11 == i15 && i12 == i16 && i13 == i17) {
            return;
        }
        u0(this.f75358i.getDrawable());
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00dc  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        com.max.mediaselector.lib.photoview.b bVar;
        boolean z11;
        GestureDetector gestureDetector;
        boolean zE;
        boolean zD;
        boolean z12;
        boolean z13;
        RectF rectFC;
        boolean z14 = false;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view, motionEvent}, this, changeQuickRedirect, false, bb.c.m.Y3, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (!this.D || !l.c((ImageView) view)) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                if (L() < this.f75353d) {
                    RectF rectFC2 = C();
                    if (rectFC2 != null) {
                        view.post(new e(L(), this.f75353d, rectFC2.centerX(), rectFC2.centerY()));
                        z10 = true;
                    }
                } else if (L() > this.f75355f && (rectFC = C()) != null) {
                    view.post(new e(L(), this.f75355f, rectFC.centerX(), rectFC.centerY()));
                    z10 = true;
                }
            }
            bVar = this.f75360k;
            if (bVar != null) {
                zE = bVar.e();
                zD = this.f75360k.d();
                boolean zF = this.f75360k.f(motionEvent);
                if (!zE || this.f75360k.e()) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (!zD || this.f75360k.d()) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                if (z12 && z13) {
                    z14 = true;
                }
                this.f75357h = z14;
                z11 = zF;
            } else {
                z11 = z10;
            }
            gestureDetector = this.f75359j;
            if (gestureDetector == null && gestureDetector.onTouchEvent(motionEvent)) {
                return true;
            }
        }
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        y();
        z10 = false;
        bVar = this.f75360k;
        if (bVar != null) {
            zE = bVar.e();
            zD = this.f75360k.d();
            boolean zF2 = this.f75360k.f(motionEvent);
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
            this.f75357h = z14;
            z11 = zF2;
        } else {
            z11 = z10;
        }
        gestureDetector = this.f75359j;
        return gestureDetector == null ? z11 : z11;
    }

    public void p0(ImageView.ScaleType scaleType) {
        if (PatchProxy.proxy(new Object[]{scaleType}, this, changeQuickRedirect, false, bb.c.m.f34740g4, new Class[]{ImageView.ScaleType.class}, Void.TYPE).isSupported || !l.d(scaleType) || scaleType == this.E) {
            return;
        }
        this.E = scaleType;
        t0();
    }

    public void q0(Interpolator interpolator) {
        this.f75351b = interpolator;
    }

    public void r0(int i10) {
        this.f75352c = i10;
    }

    public void s0(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.m.f34763h4, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.D = z10;
        t0();
    }

    public void t0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f34786i4, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.D) {
            u0(this.f75358i.getDrawable());
        } else {
            R();
        }
    }
}
