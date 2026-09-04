package com.max.mediaselector.lib.widget;

import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.OverScroller;
import androidx.annotation.n0;
import androidx.core.view.j1;
import androidx.recyclerview.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: SlideSelectTouchListener.java */
/* JADX INFO: loaded from: classes2.dex */
public class a implements RecyclerView.OnItemTouchListener {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f75603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f75604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f75605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f75606e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f75607f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f75608g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f75609h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f75610i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f75611j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f75612k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private c f75613l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private RecyclerView f75614m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private OverScroller f75615n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f75617p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f75618q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f75619r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f75620s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f75627z;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Runnable f75616o = new RunnableC0609a();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f75621t = 16;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f75622u = (int) (Resources.getSystem().getDisplayMetrics().density * 56.0f);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f75623v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f75624w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f75625x = true;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f75626y = true;

    /* JADX INFO: renamed from: com.max.mediaselector.lib.widget.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SlideSelectTouchListener.java */
    public class RunnableC0609a implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        RunnableC0609a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.Oa, new Class[0], Void.TYPE).isSupported || a.this.f75615n == null || !a.this.f75615n.computeScrollOffset()) {
                return;
            }
            a aVar = a.this;
            a.c(aVar, aVar.f75608g);
            j1.p1(a.this.f75614m, a.this.f75616o);
        }
    }

    /* JADX INFO: compiled from: SlideSelectTouchListener.java */
    public interface b extends c {
        void a(int i10);

        void b(int i10);
    }

    /* JADX INFO: compiled from: SlideSelectTouchListener.java */
    public interface c {
        void c(int i10, int i11, boolean z10);
    }

    public a() {
        k();
    }

    static /* synthetic */ void c(a aVar, int i10) {
        if (PatchProxy.proxy(new Object[]{aVar, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.m.Na, new Class[]{a.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        aVar.l(i10);
    }

    private void f(RecyclerView recyclerView, float f10, float f11) {
        View viewFindChildViewUnder;
        int childAdapterPosition;
        Object[] objArr = {recyclerView, new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.m.Ia, new Class[]{RecyclerView.class, cls, cls}, Void.TYPE).isSupported || (viewFindChildViewUnder = recyclerView.findChildViewUnder(f10, f11)) == null || (childAdapterPosition = recyclerView.getChildAdapterPosition(viewFindChildViewUnder) - this.f75627z) == -1 || this.f75605d == childAdapterPosition) {
            return;
        }
        this.f75605d = childAdapterPosition;
        i();
    }

    private void g(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (PatchProxy.proxy(new Object[]{recyclerView, motionEvent}, this, changeQuickRedirect, false, bb.c.m.Ha, new Class[]{RecyclerView.class, MotionEvent.class}, Void.TYPE).isSupported) {
            return;
        }
        f(recyclerView, motionEvent.getX(), motionEvent.getY());
    }

    private void h(Context context) {
        if (!PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.m.Ea, new Class[]{Context.class}, Void.TYPE).isSupported && this.f75615n == null) {
            this.f75615n = new OverScroller(context, new LinearInterpolator());
        }
    }

    private void i() {
        int i10;
        int i11;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.Ka, new Class[0], Void.TYPE).isSupported || this.f75613l == null || (i10 = this.f75604c) == -1 || (i11 = this.f75605d) == -1) {
            return;
        }
        int iMin = Math.min(i10, i11);
        int iMax = Math.max(this.f75604c, this.f75605d);
        if (iMin < 0) {
            return;
        }
        int i12 = this.f75611j;
        if (i12 != -1 && this.f75612k != -1) {
            if (iMin > i12) {
                this.f75613l.c(i12, iMin - 1, false);
            } else if (iMin < i12) {
                this.f75613l.c(iMin, i12 - 1, true);
            }
            int i13 = this.f75612k;
            if (iMax > i13) {
                this.f75613l.c(i13 + 1, iMax, true);
            } else if (iMax < i13) {
                this.f75613l.c(iMax + 1, i13, false);
            }
        } else if (iMax - iMin == 1) {
            this.f75613l.c(iMin, iMin, true);
        } else {
            this.f75613l.c(iMin, iMax, true);
        }
        this.f75611j = iMin;
        this.f75612k = iMax;
    }

    private void j(MotionEvent motionEvent) {
        if (PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, bb.c.m.Ja, new Class[]{MotionEvent.class}, Void.TYPE).isSupported) {
            return;
        }
        int y10 = (int) motionEvent.getY();
        int i10 = this.f75617p;
        if (y10 >= i10 && y10 <= this.f75618q) {
            this.f75609h = motionEvent.getX();
            this.f75610i = motionEvent.getY();
            int i11 = this.f75618q;
            int i12 = this.f75617p;
            this.f75608g = (int) (this.f75621t * (((i11 - i12) - (y10 - i12)) / (i11 - i12)) * (-1.0f));
            if (this.f75606e) {
                return;
            }
            this.f75606e = true;
            o();
            return;
        }
        if (this.f75625x && y10 < i10) {
            this.f75609h = motionEvent.getX();
            this.f75610i = motionEvent.getY();
            this.f75608g = this.f75621t * (-1);
            if (this.f75606e) {
                return;
            }
            this.f75606e = true;
            o();
            return;
        }
        if (y10 >= this.f75619r && y10 <= this.f75620s) {
            this.f75609h = motionEvent.getX();
            this.f75610i = motionEvent.getY();
            float f10 = y10;
            int i13 = this.f75619r;
            this.f75608g = (int) (this.f75621t * ((f10 - i13) / (this.f75620s - i13)));
            if (this.f75607f) {
                return;
            }
            this.f75607f = true;
            o();
            return;
        }
        if (!this.f75626y || y10 <= this.f75620s) {
            this.f75607f = false;
            this.f75606e = false;
            this.f75609h = Float.MIN_VALUE;
            this.f75610i = Float.MIN_VALUE;
            q();
            return;
        }
        this.f75609h = motionEvent.getX();
        this.f75610i = motionEvent.getY();
        this.f75608g = this.f75621t;
        if (this.f75606e) {
            return;
        }
        this.f75606e = true;
        o();
    }

    private void k() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.La, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        m(false);
        c cVar = this.f75613l;
        if (cVar != null && (cVar instanceof b)) {
            ((b) cVar).a(this.f75605d);
        }
        this.f75604c = -1;
        this.f75605d = -1;
        this.f75611j = -1;
        this.f75612k = -1;
        this.f75606e = false;
        this.f75607f = false;
        this.f75609h = Float.MIN_VALUE;
        this.f75610i = Float.MIN_VALUE;
        q();
    }

    private void l(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.Ma, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f75614m.scrollBy(0, i10 > 0 ? Math.min(i10, this.f75621t) : Math.max(i10, -this.f75621t));
        float f10 = this.f75609h;
        if (f10 != Float.MIN_VALUE) {
            float f11 = this.f75610i;
            if (f11 != Float.MIN_VALUE) {
                f(this.f75614m, f10, f11);
            }
        }
    }

    public void m(boolean z10) {
        this.f75603b = z10;
    }

    public a n(int i10) {
        this.f75627z = i10;
        return this;
    }

    public void o() {
        RecyclerView recyclerView;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.Da, new Class[0], Void.TYPE).isSupported || (recyclerView = this.f75614m) == null) {
            return;
        }
        h(recyclerView.getContext());
        if (this.f75615n.isFinished()) {
            this.f75614m.removeCallbacks(this.f75616o);
            OverScroller overScroller = this.f75615n;
            overScroller.startScroll(0, overScroller.getCurrY(), 0, 5000, 100000);
            j1.p1(this.f75614m, this.f75616o);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public boolean onInterceptTouchEvent(@n0 RecyclerView recyclerView, @n0 MotionEvent motionEvent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{recyclerView, motionEvent}, this, changeQuickRedirect, false, bb.c.m.Ca, new Class[]{RecyclerView.class, MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (!this.f75603b || recyclerView.getAdapter() == null || recyclerView.getAdapter().getItemCount() == 0) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0 || action == 5) {
            k();
        }
        this.f75614m = recyclerView;
        int height = recyclerView.getHeight();
        int i10 = this.f75623v;
        this.f75617p = i10;
        int i11 = this.f75622u;
        this.f75618q = i10 + i11;
        int i12 = this.f75624w;
        this.f75619r = (height + i12) - i11;
        this.f75620s = height + i12;
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public void onRequestDisallowInterceptTouchEvent(boolean z10) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public void onTouchEvent(@n0 RecyclerView recyclerView, @n0 MotionEvent motionEvent) {
        if (PatchProxy.proxy(new Object[]{recyclerView, motionEvent}, this, changeQuickRedirect, false, bb.c.m.Ga, new Class[]{RecyclerView.class, MotionEvent.class}, Void.TYPE).isSupported) {
            return;
        }
        if (!this.f75603b) {
            k();
            return;
        }
        int action = motionEvent.getAction();
        if (action != 1) {
            if (action == 2) {
                if (!this.f75606e && !this.f75607f) {
                    g(recyclerView, motionEvent);
                }
                j(motionEvent);
                return;
            }
            if (action != 3 && action != 6) {
                return;
            }
        }
        k();
    }

    public void p(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.Ba, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        m(true);
        this.f75604c = i10;
        this.f75605d = i10;
        this.f75611j = i10;
        this.f75612k = i10;
        c cVar = this.f75613l;
        if (cVar == null || !(cVar instanceof b)) {
            return;
        }
        ((b) cVar).b(i10);
    }

    public void q() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.Fa, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        try {
            OverScroller overScroller = this.f75615n;
            if (overScroller == null || overScroller.isFinished()) {
                return;
            }
            this.f75614m.removeCallbacks(this.f75616o);
            this.f75615n.abortAnimation();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public a r(int i10) {
        this.f75624w = i10;
        return this;
    }

    public a s(int i10) {
        this.f75621t = i10;
        return this;
    }

    public a t(boolean z10) {
        this.f75625x = z10;
        return this;
    }

    public a u(boolean z10) {
        this.f75626y = z10;
        return this;
    }

    public a v(c cVar) {
        this.f75613l = cVar;
        return this;
    }

    public a w(int i10) {
        this.f75623v = i10;
        return this;
    }

    public a x(int i10) {
        this.f75622u = i10;
        return this;
    }
}
