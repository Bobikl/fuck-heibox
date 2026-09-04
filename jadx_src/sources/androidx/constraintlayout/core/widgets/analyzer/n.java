package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: WidgetGroup.java */
/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final boolean f18390g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static int f18391h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f18393b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f18395d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ArrayList<ConstraintWidget> f18392a = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f18394c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ArrayList<a> f18396e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f18397f = -1;

    /* JADX INFO: compiled from: WidgetGroup.java */
    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        WeakReference<ConstraintWidget> f18398a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f18399b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f18400c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f18401d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f18402e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f18403f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f18404g;

        public a(ConstraintWidget constraintWidget, androidx.constraintlayout.core.e eVar, int i10) {
            this.f18398a = new WeakReference<>(constraintWidget);
            this.f18399b = eVar.O(constraintWidget.Q);
            this.f18400c = eVar.O(constraintWidget.R);
            this.f18401d = eVar.O(constraintWidget.S);
            this.f18402e = eVar.O(constraintWidget.T);
            this.f18403f = eVar.O(constraintWidget.U);
            this.f18404g = i10;
        }

        public void a() {
            ConstraintWidget constraintWidget = this.f18398a.get();
            if (constraintWidget != null) {
                constraintWidget.j1(this.f18399b, this.f18400c, this.f18401d, this.f18402e, this.f18403f, this.f18404g);
            }
        }
    }

    public n(int i10) {
        int i11 = f18391h;
        f18391h = i11 + 1;
        this.f18393b = i11;
        this.f18395d = i10;
    }

    private boolean e(ConstraintWidget constraintWidget) {
        return this.f18392a.contains(constraintWidget);
    }

    private String h() {
        int i10 = this.f18395d;
        if (i10 == 0) {
            return "Horizontal";
        }
        if (i10 == 1) {
            return "Vertical";
        }
        return i10 == 2 ? "Both" : "Unknown";
    }

    private int k(int i10, ConstraintWidget constraintWidget) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviourZ = constraintWidget.z(i10);
        if (dimensionBehaviourZ == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviourZ == ConstraintWidget.DimensionBehaviour.MATCH_PARENT || dimensionBehaviourZ == ConstraintWidget.DimensionBehaviour.FIXED) {
            return i10 == 0 ? constraintWidget.j0() : constraintWidget.D();
        }
        return -1;
    }

    private int q(androidx.constraintlayout.core.e eVar, ArrayList<ConstraintWidget> arrayList, int i10) {
        int iO;
        int iO2;
        androidx.constraintlayout.core.widgets.d dVar = (androidx.constraintlayout.core.widgets.d) arrayList.get(0).U();
        eVar.Y();
        dVar.g(eVar, false);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList.get(i11).g(eVar, false);
        }
        if (i10 == 0 && dVar.L1 > 0) {
            androidx.constraintlayout.core.widgets.b.b(dVar, eVar, arrayList, 0);
        }
        if (i10 == 1 && dVar.M1 > 0) {
            androidx.constraintlayout.core.widgets.b.b(dVar, eVar, arrayList, 1);
        }
        try {
            eVar.T();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        this.f18396e = new ArrayList<>();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            this.f18396e.add(new a(arrayList.get(i12), eVar, i10));
        }
        if (i10 == 0) {
            iO = eVar.O(dVar.Q);
            iO2 = eVar.O(dVar.S);
            eVar.Y();
        } else {
            iO = eVar.O(dVar.R);
            iO2 = eVar.O(dVar.T);
            eVar.Y();
        }
        return iO2 - iO;
    }

    public boolean a(ConstraintWidget constraintWidget) {
        if (this.f18392a.contains(constraintWidget)) {
            return false;
        }
        this.f18392a.add(constraintWidget);
        return true;
    }

    public void b() {
        if (this.f18396e != null && this.f18394c) {
            for (int i10 = 0; i10 < this.f18396e.size(); i10++) {
                this.f18396e.get(i10).a();
            }
        }
    }

    public void c(ArrayList<n> arrayList) {
        int size = this.f18392a.size();
        if (this.f18397f != -1 && size > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                n nVar = arrayList.get(i10);
                if (this.f18397f == nVar.f18393b) {
                    m(this.f18395d, nVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public void d() {
        this.f18392a.clear();
    }

    public int f() {
        return this.f18393b;
    }

    public int g() {
        return this.f18395d;
    }

    public boolean i(n nVar) {
        for (int i10 = 0; i10 < this.f18392a.size(); i10++) {
            if (nVar.e(this.f18392a.get(i10))) {
                return true;
            }
        }
        return false;
    }

    public boolean j() {
        return this.f18394c;
    }

    public int l(androidx.constraintlayout.core.e eVar, int i10) {
        if (this.f18392a.size() == 0) {
            return 0;
        }
        return q(eVar, this.f18392a, i10);
    }

    public void m(int i10, n nVar) {
        for (ConstraintWidget constraintWidget : this.f18392a) {
            nVar.a(constraintWidget);
            if (i10 == 0) {
                constraintWidget.R0 = nVar.f();
            } else {
                constraintWidget.S0 = nVar.f();
            }
        }
        this.f18397f = nVar.f18393b;
    }

    public void n(boolean z10) {
        this.f18394c = z10;
    }

    public void o(int i10) {
        this.f18395d = i10;
    }

    public int p() {
        return this.f18392a.size();
    }

    public String toString() {
        String str = h() + " [" + this.f18393b + "] <";
        Iterator<ConstraintWidget> it = this.f18392a.iterator();
        while (it.hasNext()) {
            str = str + " " + it.next().y();
        }
        return str + " >";
    }
}
