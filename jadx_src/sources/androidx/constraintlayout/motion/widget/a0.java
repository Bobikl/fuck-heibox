package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: ViewTransitionController.java */
/* JADX INFO: loaded from: classes.dex */
public class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MotionLayout f18697a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HashSet<View> f18699c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ArrayList<z.b> f18701e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<z> f18698b = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f18700d = "ViewTransitionController";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    ArrayList<z.b> f18702f = new ArrayList<>();

    /* JADX INFO: compiled from: ViewTransitionController.java */
    public class a implements androidx.constraintlayout.widget.e.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ z f18703b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f18704c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f18705d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f18706e;

        a(z zVar, int i10, boolean z10, int i11) {
            this.f18703b = zVar;
            this.f18704c = i10;
            this.f18705d = z10;
            this.f18706e = i11;
        }

        @Override // androidx.constraintlayout.widget.e.a
        public void a(int i10, int i11, int i12) {
            int iH = this.f18703b.h();
            this.f18703b.r(i11);
            if (this.f18704c != i10 || iH == i11) {
                return;
            }
            if (this.f18705d) {
                if (this.f18706e == i11) {
                    int childCount = a0.this.f18697a.getChildCount();
                    for (int i13 = 0; i13 < childCount; i13++) {
                        View childAt = a0.this.f18697a.getChildAt(i13);
                        if (this.f18703b.m(childAt)) {
                            int currentState = a0.this.f18697a.getCurrentState();
                            androidx.constraintlayout.widget.c cVarZ0 = a0.this.f18697a.z0(currentState);
                            z zVar = this.f18703b;
                            a0 a0Var = a0.this;
                            zVar.c(a0Var, a0Var.f18697a, currentState, cVarZ0, childAt);
                        }
                    }
                    return;
                }
                return;
            }
            if (this.f18706e != i11) {
                int childCount2 = a0.this.f18697a.getChildCount();
                for (int i14 = 0; i14 < childCount2; i14++) {
                    View childAt2 = a0.this.f18697a.getChildAt(i14);
                    if (this.f18703b.m(childAt2)) {
                        int currentState2 = a0.this.f18697a.getCurrentState();
                        androidx.constraintlayout.widget.c cVarZ1 = a0.this.f18697a.z0(currentState2);
                        z zVar2 = this.f18703b;
                        a0 a0Var2 = a0.this;
                        zVar2.c(a0Var2, a0Var2.f18697a, currentState2, cVarZ1, childAt2);
                    }
                }
            }
        }
    }

    public a0(MotionLayout motionLayout) {
        this.f18697a = motionLayout;
    }

    private void i(z zVar, boolean z10) {
        ConstraintLayout.getSharedValues().a(zVar.i(), new a(zVar, zVar.i(), z10, zVar.g()));
    }

    private void n(z zVar, View... viewArr) {
        int currentState = this.f18697a.getCurrentState();
        if (zVar.f19094f == 2) {
            zVar.c(this, this.f18697a, currentState, null, viewArr);
            return;
        }
        if (currentState != -1) {
            androidx.constraintlayout.widget.c cVarZ0 = this.f18697a.z0(currentState);
            if (cVarZ0 == null) {
                return;
            }
            zVar.c(this, this.f18697a, currentState, cVarZ0, viewArr);
            return;
        }
        Log.w(this.f18700d, "No support for ViewTransition within transition yet. Currently: " + this.f18697a.toString());
    }

    public void b(z zVar) {
        this.f18698b.add(zVar);
        this.f18699c = null;
        if (zVar.j() == 4) {
            i(zVar, true);
        } else if (zVar.j() == 5) {
            i(zVar, false);
        }
    }

    void c(z.b bVar) {
        if (this.f18701e == null) {
            this.f18701e = new ArrayList<>();
        }
        this.f18701e.add(bVar);
    }

    void d() {
        ArrayList<z.b> arrayList = this.f18701e;
        if (arrayList == null) {
            return;
        }
        Iterator<z.b> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.f18701e.removeAll(this.f18702f);
        this.f18702f.clear();
        if (this.f18701e.isEmpty()) {
            this.f18701e = null;
        }
    }

    boolean e(int i10, o oVar) {
        for (z zVar : this.f18698b) {
            if (zVar.e() == i10) {
                zVar.f19095g.a(oVar);
                return true;
            }
        }
        return false;
    }

    void f(int i10, boolean z10) {
        for (z zVar : this.f18698b) {
            if (zVar.e() == i10) {
                zVar.o(z10);
                return;
            }
        }
    }

    void g() {
        this.f18697a.invalidate();
    }

    boolean h(int i10) {
        for (z zVar : this.f18698b) {
            if (zVar.e() == i10) {
                return zVar.k();
            }
        }
        return false;
    }

    void j(int i10) {
        z next;
        Iterator<z> it = this.f18698b.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (next.e() != i10);
        if (next != null) {
            this.f18699c = null;
            this.f18698b.remove(next);
        }
    }

    void k(z.b bVar) {
        this.f18702f.add(bVar);
    }

    void l(MotionEvent motionEvent) {
        int currentState = this.f18697a.getCurrentState();
        if (currentState == -1) {
            return;
        }
        if (this.f18699c == null) {
            this.f18699c = new HashSet<>();
            for (z zVar : this.f18698b) {
                int childCount = this.f18697a.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = this.f18697a.getChildAt(i10);
                    if (zVar.m(childAt)) {
                        childAt.getId();
                        this.f18699c.add(childAt);
                    }
                }
            }
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        Rect rect = new Rect();
        int action = motionEvent.getAction();
        ArrayList<z.b> arrayList = this.f18701e;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<z.b> it = this.f18701e.iterator();
            while (it.hasNext()) {
                it.next().d(action, x10, y10);
            }
        }
        if (action == 0 || action == 1) {
            androidx.constraintlayout.widget.c cVarZ0 = this.f18697a.z0(currentState);
            Iterator<z> it2 = this.f18698b.iterator();
            while (it2.hasNext()) {
                z next = it2.next();
                if (next.u(action)) {
                    for (View view : this.f18699c) {
                        if (next.m(view)) {
                            view.getHitRect(rect);
                            if (rect.contains((int) x10, (int) y10)) {
                                next.c(this, this.f18697a, currentState, cVarZ0, view);
                            }
                            next = next;
                        }
                    }
                }
            }
        }
    }

    void m(int i10, View... viewArr) {
        ArrayList arrayList = new ArrayList();
        z zVar = null;
        for (z zVar2 : this.f18698b) {
            if (zVar2.e() == i10) {
                for (View view : viewArr) {
                    if (zVar2.d(view)) {
                        arrayList.add(view);
                    }
                }
                if (!arrayList.isEmpty()) {
                    n(zVar2, (View[]) arrayList.toArray(new View[0]));
                    arrayList.clear();
                }
                zVar = zVar2;
            }
        }
        if (zVar == null) {
            Log.e(this.f18700d, " Could not find ViewTransition");
        }
    }
}
