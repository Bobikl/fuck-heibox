package com.max.hbcustomview.floatingview;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes10.dex */
public class FloatingMagnetView extends FrameLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f69095l = 13;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f69096m = 150;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f69097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f69098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f69099d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f69100e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c f69101f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f69102g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected a f69103h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected int f69104i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f69105j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f69106k;

    public class a implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Handler f69107b = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f69108c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f69109d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f69110e;

        public a() {
        }

        static /* synthetic */ void a(a aVar) {
            if (PatchProxy.proxy(new Object[]{aVar}, null, changeQuickRedirect, true, bb.c.f.Dj, new Class[]{a.class}, Void.TYPE).isSupported) {
                return;
            }
            aVar.c();
        }

        private void c() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Cj, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            this.f69107b.removeCallbacks(this);
        }

        void b(float f10, float f11) {
            Object[] objArr = {new Float(f10), new Float(f11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Float.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Aj, new Class[]{cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            this.f69108c = f10;
            this.f69109d = f11;
            this.f69110e = System.currentTimeMillis();
            this.f69107b.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Bj, new Class[0], Void.TYPE).isSupported || FloatingMagnetView.this.getRootView() == null || FloatingMagnetView.this.getRootView().getParent() == null) {
                return;
            }
            float fMin = Math.min(1.0f, (System.currentTimeMillis() - this.f69110e) / 400.0f);
            FloatingMagnetView.a(FloatingMagnetView.this, (this.f69108c - FloatingMagnetView.this.getX()) * fMin, (this.f69109d - FloatingMagnetView.this.getY()) * fMin);
            if (fMin < 1.0f) {
                this.f69107b.post(this);
            }
        }
    }

    public FloatingMagnetView(Context context) {
        this(context, null);
    }

    public FloatingMagnetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FloatingMagnetView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        g();
    }

    static /* synthetic */ void a(FloatingMagnetView floatingMagnetView, float f10, float f11) {
        Object[] objArr = {floatingMagnetView, new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.f.f32720zj, new Class[]{FloatingMagnetView.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        floatingMagnetView.j(f10, f11);
    }

    private void b(MotionEvent motionEvent) {
        if (PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, bb.c.f.f32566sj, new Class[]{MotionEvent.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f69099d = getX();
        this.f69100e = getY();
        this.f69097b = motionEvent.getRawX();
        this.f69098c = motionEvent.getRawY();
        this.f69102g = System.currentTimeMillis();
    }

    private int d(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.f.f32632vj, new Class[]{Context.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    private int e(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.f.f32610uj, new Class[]{Context.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    private int f(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.f.f32453nj, new Class[]{Context.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("status_bar_height", "dimen", "android"));
    }

    private void g() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32430mj, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f69103h = new a();
        this.f69106k = f(getContext());
        setClickable(true);
        m();
    }

    private void j(float f10, float f11) {
        Object[] objArr = {new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32698yj, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        setX(getX() + f10);
        setY(getY() + f11);
    }

    private void n(MotionEvent motionEvent) {
        if (PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, bb.c.f.f32544rj, new Class[]{MotionEvent.class}, Void.TYPE).isSupported) {
            return;
        }
        setX((this.f69099d + motionEvent.getRawX()) - this.f69097b);
        float rawY = (this.f69100e + motionEvent.getRawY()) - this.f69098c;
        int i10 = this.f69106k;
        if (rawY < i10) {
            rawY = i10;
        }
        if (rawY > this.f69105j - getHeight()) {
            rawY = this.f69105j - getHeight();
        }
        setY(rawY);
    }

    public void c() {
        c cVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32499pj, new Class[0], Void.TYPE).isSupported || (cVar = this.f69101f) == null) {
            return;
        }
        cVar.b(this);
    }

    public boolean h() {
        return false;
    }

    public boolean i() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32522qj, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return System.currentTimeMillis() - this.f69102g < 150;
    }

    public void k() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32654wj, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f69103h.b(h() ? 13.0f : this.f69104i - 13, getY());
    }

    public void l() {
        c cVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32676xj, new Class[0], Void.TYPE).isSupported || (cVar = this.f69101f) == null) {
            return;
        }
        cVar.a(this);
    }

    public void m() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32588tj, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f69104i = e(getContext()) - getWidth();
        this.f69105j = d(getContext());
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, bb.c.f.f32476oj, new Class[]{MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (motionEvent == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            b(motionEvent);
            m();
            a.a(this.f69103h);
        } else if (action == 1) {
            k();
            if (i()) {
                c();
            }
        } else if (action == 2) {
            n(motionEvent);
        }
        return true;
    }

    public void setMagnetViewListener(c cVar) {
        this.f69101f = cVar;
    }
}
