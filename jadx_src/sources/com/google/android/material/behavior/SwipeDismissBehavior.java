package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.accessibility.a0;
import androidx.core.view.accessibility.e0;
import androidx.core.view.j1;

/* JADX INFO: loaded from: classes7.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f53154q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f53155r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f53156s = 2;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f53157t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f53158u = 1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f53159v = 2;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final float f53160w = 0.5f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final float f53161x = 0.0f;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final float f53162y = 0.5f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    androidx.customview.widget.d f53163f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    c f53164g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f53165h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f53166i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f53168k;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f53167j = 0.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f53169l = 2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    float f53170m = 0.5f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    float f53171n = 0.0f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    float f53172o = 0.5f;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final androidx.customview.widget.d.c f53173p = new a();

    public class a extends androidx.customview.widget.d.c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f53174d = -1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f53175a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f53176b = -1;

        a() {
        }

        private boolean n(@n0 View view, float f10) {
            if (f10 == 0.0f) {
                return Math.abs(view.getLeft() - this.f53175a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f53170m);
            }
            boolean z10 = j1.Z(view) == 1;
            int i10 = SwipeDismissBehavior.this.f53169l;
            if (i10 == 2) {
                return true;
            }
            if (i10 == 0) {
                if (z10) {
                    if (f10 >= 0.0f) {
                        return false;
                    }
                } else if (f10 <= 0.0f) {
                    return false;
                }
                return true;
            }
            if (i10 != 1) {
                return false;
            }
            if (z10) {
                if (f10 <= 0.0f) {
                    return false;
                }
            } else if (f10 >= 0.0f) {
                return false;
            }
            return true;
        }

        @Override // androidx.customview.widget.d.c
        public int a(@n0 View view, int i10, int i11) {
            int width;
            int width2;
            int width3;
            boolean z10 = j1.Z(view) == 1;
            int i12 = SwipeDismissBehavior.this.f53169l;
            if (i12 == 0) {
                if (z10) {
                    width = this.f53175a - view.getWidth();
                    width2 = this.f53175a;
                } else {
                    width = this.f53175a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i12 != 1) {
                width = this.f53175a - view.getWidth();
                width2 = view.getWidth() + this.f53175a;
            } else if (z10) {
                width = this.f53175a;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.f53175a - view.getWidth();
                width2 = this.f53175a;
            }
            return SwipeDismissBehavior.M(width, i10, width2);
        }

        @Override // androidx.customview.widget.d.c
        public int b(@n0 View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.d.c
        public int d(@n0 View view) {
            return view.getWidth();
        }

        @Override // androidx.customview.widget.d.c
        public void i(@n0 View view, int i10) {
            this.f53176b = i10;
            this.f53175a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior.this.f53166i = true;
                parent.requestDisallowInterceptTouchEvent(true);
                SwipeDismissBehavior.this.f53166i = false;
            }
        }

        @Override // androidx.customview.widget.d.c
        public void j(int i10) {
            c cVar = SwipeDismissBehavior.this.f53164g;
            if (cVar != null) {
                cVar.b(i10);
            }
        }

        @Override // androidx.customview.widget.d.c
        public void k(@n0 View view, int i10, int i11, int i12, int i13) {
            float width = view.getWidth() * SwipeDismissBehavior.this.f53171n;
            float width2 = view.getWidth() * SwipeDismissBehavior.this.f53172o;
            float fAbs = Math.abs(i10 - this.f53175a);
            if (fAbs <= width) {
                view.setAlpha(1.0f);
            } else if (fAbs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.L(0.0f, 1.0f - SwipeDismissBehavior.O(width, width2, fAbs), 1.0f));
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001d  */
        @Override // androidx.customview.widget.d.c
        public void l(@n0 View view, float f10, float f11) {
            int i10;
            boolean z10;
            c cVar;
            this.f53176b = -1;
            int width = view.getWidth();
            if (n(view, f10)) {
                if (f10 >= 0.0f) {
                    int left = view.getLeft();
                    int i11 = this.f53175a;
                    if (left < i11) {
                        i10 = this.f53175a - width;
                    } else {
                        i10 = i11 + width;
                    }
                } else {
                    i10 = this.f53175a - width;
                }
                z10 = true;
            } else {
                i10 = this.f53175a;
                z10 = false;
            }
            if (SwipeDismissBehavior.this.f53163f.V(i10, view.getTop())) {
                j1.p1(view, new d(view, z10));
            } else {
                if (!z10 || (cVar = SwipeDismissBehavior.this.f53164g) == null) {
                    return;
                }
                cVar.a(view);
            }
        }

        @Override // androidx.customview.widget.d.c
        public boolean m(View view, int i10) {
            int i11 = this.f53176b;
            return (i11 == -1 || i11 == i10) && SwipeDismissBehavior.this.K(view);
        }
    }

    public class b implements e0 {
        b() {
        }

        @Override // androidx.core.view.accessibility.e0
        public boolean perform(@n0 View view, @p0 e0.a aVar) {
            boolean z10 = false;
            if (!SwipeDismissBehavior.this.K(view)) {
                return false;
            }
            boolean z11 = j1.Z(view) == 1;
            int i10 = SwipeDismissBehavior.this.f53169l;
            if ((i10 == 0 && z11) || (i10 == 1 && !z11)) {
                z10 = true;
            }
            int width = view.getWidth();
            if (z10) {
                width = -width;
            }
            j1.e1(view, width);
            view.setAlpha(0.0f);
            c cVar = SwipeDismissBehavior.this.f53164g;
            if (cVar != null) {
                cVar.a(view);
            }
            return true;
        }
    }

    public interface c {
        void a(View view);

        void b(int i10);
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final View f53179b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f53180c;

        d(View view, boolean z10) {
            this.f53179b = view;
            this.f53180c = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar;
            androidx.customview.widget.d dVar = SwipeDismissBehavior.this.f53163f;
            if (dVar != null && dVar.o(true)) {
                j1.p1(this.f53179b, this);
            } else {
                if (!this.f53180c || (cVar = SwipeDismissBehavior.this.f53164g) == null) {
                    return;
                }
                cVar.a(this.f53179b);
            }
        }
    }

    static float L(float f10, float f11, float f12) {
        return Math.min(Math.max(f10, f11), f12);
    }

    static int M(int i10, int i11, int i12) {
        return Math.min(Math.max(i10, i11), i12);
    }

    private void N(ViewGroup viewGroup) {
        if (this.f53163f == null) {
            this.f53163f = this.f53168k ? androidx.customview.widget.d.p(viewGroup, this.f53167j, this.f53173p) : androidx.customview.widget.d.q(viewGroup, this.f53173p);
        }
    }

    static float O(float f10, float f11, float f12) {
        return (f12 - f10) / (f11 - f10);
    }

    private void X(View view) {
        j1.r1(view, 1048576);
        if (K(view)) {
            j1.u1(view, a0.a.f21396z, null, new b());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean H(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        if (this.f53163f == null) {
            return false;
        }
        if (this.f53166i && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f53163f.M(motionEvent);
        return true;
    }

    public boolean K(@n0 View view) {
        return true;
    }

    public int P() {
        androidx.customview.widget.d dVar = this.f53163f;
        if (dVar != null) {
            return dVar.F();
        }
        return 0;
    }

    @androidx.annotation.j1
    @p0
    public c Q() {
        return this.f53164g;
    }

    public void R(float f10) {
        this.f53170m = L(0.0f, f10, 1.0f);
    }

    public void S(float f10) {
        this.f53172o = L(0.0f, f10, 1.0f);
    }

    public void T(@p0 c cVar) {
        this.f53164g = cVar;
    }

    public void U(float f10) {
        this.f53167j = f10;
        this.f53168k = true;
    }

    public void V(float f10) {
        this.f53171n = L(0.0f, f10, 1.0f);
    }

    public void W(int i10) {
        this.f53169l = i10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean o(@n0 CoordinatorLayout coordinatorLayout, @n0 V v10, @n0 MotionEvent motionEvent) {
        boolean zC = this.f53165h;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zC = coordinatorLayout.C(v10, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f53165h = zC;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f53165h = false;
        }
        if (!zC) {
            return false;
        }
        N(coordinatorLayout);
        return !this.f53166i && this.f53163f.W(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean p(@n0 CoordinatorLayout coordinatorLayout, @n0 V v10, int i10) {
        boolean zP = super.p(coordinatorLayout, v10, i10);
        if (j1.V(v10) == 0) {
            j1.R1(v10, 1);
            X(v10);
        }
        return zP;
    }
}
