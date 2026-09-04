package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class State {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final int f18123f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final int f18124g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final int f18125h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final int f18126i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Integer f18127j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected HashMap<Object, c> f18128a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected HashMap<Object, androidx.constraintlayout.core.state.a> f18129b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    HashMap<String, ArrayList<String>> f18130c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ConstraintReference f18131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f18132e;

    public enum Chain {
        SPREAD,
        SPREAD_INSIDE,
        PACKED
    }

    public enum Constraint {
        LEFT_TO_LEFT,
        LEFT_TO_RIGHT,
        RIGHT_TO_LEFT,
        RIGHT_TO_RIGHT,
        START_TO_START,
        START_TO_END,
        END_TO_START,
        END_TO_END,
        TOP_TO_TOP,
        TOP_TO_BOTTOM,
        BOTTOM_TO_TOP,
        BOTTOM_TO_BOTTOM,
        BASELINE_TO_BASELINE,
        CENTER_HORIZONTALLY,
        CENTER_VERTICALLY,
        CIRCULAR_CONSTRAINT
    }

    public enum Direction {
        LEFT,
        RIGHT,
        START,
        END,
        TOP,
        BOTTOM
    }

    public enum Helper {
        HORIZONTAL_CHAIN,
        VERTICAL_CHAIN,
        ALIGN_HORIZONTALLY,
        ALIGN_VERTICALLY,
        BARRIER,
        LAYER,
        FLOW
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f18133a;

        static {
            int[] iArr = new int[Helper.values().length];
            f18133a = iArr;
            try {
                iArr[Helper.HORIZONTAL_CHAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18133a[Helper.VERTICAL_CHAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18133a[Helper.ALIGN_HORIZONTALLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18133a[Helper.ALIGN_VERTICALLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18133a[Helper.BARRIER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public State() {
        ConstraintReference constraintReference = new ConstraintReference(this);
        this.f18131d = constraintReference;
        this.f18132e = 0;
        this.f18128a.put(f18127j, constraintReference);
    }

    private String h() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("__HELPER_KEY_");
        int i10 = this.f18132e;
        this.f18132e = i10 + 1;
        sb2.append(i10);
        sb2.append("__");
        return sb2.toString();
    }

    public androidx.constraintlayout.core.state.helpers.f A(Object obj) {
        return k(obj, 1);
    }

    public State B(Dimension dimension) {
        return x(dimension);
    }

    public void a(androidx.constraintlayout.core.widgets.d dVar) {
        androidx.constraintlayout.core.state.a aVar;
        androidx.constraintlayout.core.widgets.h hVarF0;
        androidx.constraintlayout.core.widgets.h hVarF1;
        dVar.j2();
        this.f18131d.R().j(this, dVar, 0);
        this.f18131d.B().j(this, dVar, 1);
        for (Object obj : this.f18129b.keySet()) {
            androidx.constraintlayout.core.widgets.h hVarF2 = this.f18129b.get(obj).F0();
            if (hVarF2 != null) {
                c cVarE = this.f18128a.get(obj);
                if (cVarE == null) {
                    cVarE = e(obj);
                }
                cVarE.b(hVarF2);
            }
        }
        for (Object obj2 : this.f18128a.keySet()) {
            c cVar = this.f18128a.get(obj2);
            if (cVar != this.f18131d && (cVar.d() instanceof androidx.constraintlayout.core.state.a) && (hVarF1 = ((androidx.constraintlayout.core.state.a) cVar.d()).F0()) != null) {
                c cVarE2 = this.f18128a.get(obj2);
                if (cVarE2 == null) {
                    cVarE2 = e(obj2);
                }
                cVarE2.b(hVarF1);
            }
        }
        Iterator<Object> it = this.f18128a.keySet().iterator();
        while (it.hasNext()) {
            c cVar2 = this.f18128a.get(it.next());
            if (cVar2 != this.f18131d) {
                ConstraintWidget constraintWidgetA = cVar2.a();
                constraintWidgetA.d1(cVar2.getKey().toString());
                constraintWidgetA.M1(null);
                if (cVar2.d() instanceof androidx.constraintlayout.core.state.helpers.f) {
                    cVar2.apply();
                }
                dVar.a(constraintWidgetA);
            } else {
                cVar2.b(dVar);
            }
        }
        Iterator<Object> it2 = this.f18129b.keySet().iterator();
        while (it2.hasNext()) {
            androidx.constraintlayout.core.state.a aVar2 = this.f18129b.get(it2.next());
            if (aVar2.F0() != null) {
                Iterator<Object> it3 = aVar2.f18136f0.iterator();
                while (it3.hasNext()) {
                    aVar2.F0().a(this.f18128a.get(it3.next()).a());
                }
                aVar2.apply();
            } else {
                aVar2.apply();
            }
        }
        Iterator<Object> it4 = this.f18128a.keySet().iterator();
        while (it4.hasNext()) {
            c cVar3 = this.f18128a.get(it4.next());
            if (cVar3 != this.f18131d && (cVar3.d() instanceof androidx.constraintlayout.core.state.a) && (hVarF0 = (aVar = (androidx.constraintlayout.core.state.a) cVar3.d()).F0()) != null) {
                for (Object obj3 : aVar.f18136f0) {
                    c cVar4 = this.f18128a.get(obj3);
                    if (cVar4 != null) {
                        hVarF0.a(cVar4.a());
                    } else if (obj3 instanceof c) {
                        hVarF0.a(((c) obj3).a());
                    } else {
                        System.out.println("couldn't find reference for " + obj3);
                    }
                }
                cVar3.apply();
            }
        }
        for (Object obj4 : this.f18128a.keySet()) {
            c cVar5 = this.f18128a.get(obj4);
            cVar5.apply();
            ConstraintWidget constraintWidgetA2 = cVar5.a();
            if (constraintWidgetA2 != null && (obj4 instanceof String)) {
                constraintWidgetA2.f18280o = (String) obj4;
            }
        }
    }

    public androidx.constraintlayout.core.state.helpers.c b(Object obj, Direction direction) {
        ConstraintReference constraintReferenceE = e(obj);
        if (constraintReferenceE.d() == null || !(constraintReferenceE.d() instanceof androidx.constraintlayout.core.state.helpers.c)) {
            androidx.constraintlayout.core.state.helpers.c cVar = new androidx.constraintlayout.core.state.helpers.c(this);
            cVar.I0(direction);
            constraintReferenceE.k0(cVar);
        }
        return (androidx.constraintlayout.core.state.helpers.c) constraintReferenceE.d();
    }

    public androidx.constraintlayout.core.state.helpers.a c(Object... objArr) {
        androidx.constraintlayout.core.state.helpers.a aVar = (androidx.constraintlayout.core.state.helpers.a) m(null, Helper.ALIGN_HORIZONTALLY);
        aVar.E0(objArr);
        return aVar;
    }

    public androidx.constraintlayout.core.state.helpers.b d(Object... objArr) {
        androidx.constraintlayout.core.state.helpers.b bVar = (androidx.constraintlayout.core.state.helpers.b) m(null, Helper.ALIGN_VERTICALLY);
        bVar.E0(objArr);
        return bVar;
    }

    public ConstraintReference e(Object obj) {
        c cVarG = this.f18128a.get(obj);
        if (cVarG == null) {
            cVarG = g(obj);
            this.f18128a.put(obj, cVarG);
            cVarG.c(obj);
        }
        if (cVarG instanceof ConstraintReference) {
            return (ConstraintReference) cVarG;
        }
        return null;
    }

    public int f(Object obj) {
        if (obj instanceof Float) {
            return ((Float) obj).intValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public ConstraintReference g(Object obj) {
        return new ConstraintReference(this);
    }

    public void i() {
        for (Object obj : this.f18128a.keySet()) {
            ConstraintReference constraintReferenceE = e(obj);
            if (constraintReferenceE instanceof ConstraintReference) {
                constraintReferenceE.p0(obj);
            }
        }
    }

    public ArrayList<String> j(String str) {
        if (this.f18130c.containsKey(str)) {
            return this.f18130c.get(str);
        }
        return null;
    }

    public androidx.constraintlayout.core.state.helpers.f k(Object obj, int i10) {
        ConstraintReference constraintReferenceE = e(obj);
        if (constraintReferenceE.d() == null || !(constraintReferenceE.d() instanceof androidx.constraintlayout.core.state.helpers.f)) {
            androidx.constraintlayout.core.state.helpers.f fVar = new androidx.constraintlayout.core.state.helpers.f(this);
            fVar.h(i10);
            fVar.c(obj);
            constraintReferenceE.k0(fVar);
        }
        return (androidx.constraintlayout.core.state.helpers.f) constraintReferenceE.d();
    }

    public State l(Dimension dimension) {
        return v(dimension);
    }

    public androidx.constraintlayout.core.state.a m(Object obj, Helper helper) {
        androidx.constraintlayout.core.state.a gVar;
        if (obj == null) {
            obj = h();
        }
        androidx.constraintlayout.core.state.a aVar = this.f18129b.get(obj);
        if (aVar == null) {
            int i10 = a.f18133a[helper.ordinal()];
            if (i10 == 1) {
                gVar = new androidx.constraintlayout.core.state.helpers.g(this);
            } else if (i10 == 2) {
                gVar = new androidx.constraintlayout.core.state.helpers.h(this);
            } else if (i10 == 3) {
                gVar = new androidx.constraintlayout.core.state.helpers.a(this);
            } else if (i10 != 4) {
                if (i10 != 5) {
                    aVar = new androidx.constraintlayout.core.state.a(this, helper);
                } else {
                    gVar = new androidx.constraintlayout.core.state.helpers.c(this);
                }
                this.f18129b.put(obj, aVar);
            } else {
                gVar = new androidx.constraintlayout.core.state.helpers.b(this);
            }
            aVar = gVar;
            this.f18129b.put(obj, aVar);
        }
        return aVar;
    }

    public androidx.constraintlayout.core.state.helpers.g n() {
        return (androidx.constraintlayout.core.state.helpers.g) m(null, Helper.HORIZONTAL_CHAIN);
    }

    public androidx.constraintlayout.core.state.helpers.g o(Object... objArr) {
        androidx.constraintlayout.core.state.helpers.g gVar = (androidx.constraintlayout.core.state.helpers.g) m(null, Helper.HORIZONTAL_CHAIN);
        gVar.E0(objArr);
        return gVar;
    }

    public androidx.constraintlayout.core.state.helpers.f p(Object obj) {
        return k(obj, 0);
    }

    public void q(Object obj, Object obj2) {
        ConstraintReference constraintReferenceE = e(obj);
        if (constraintReferenceE instanceof ConstraintReference) {
            constraintReferenceE.p0(obj2);
        }
    }

    c r(Object obj) {
        return this.f18128a.get(obj);
    }

    public void s() {
        this.f18129b.clear();
        this.f18130c.clear();
    }

    public boolean t(int i10) {
        return this.f18131d.B().k(i10);
    }

    public boolean u(int i10) {
        return this.f18131d.R().k(i10);
    }

    public State v(Dimension dimension) {
        this.f18131d.l0(dimension);
        return this;
    }

    public void w(String str, String str2) {
        ArrayList<String> arrayList;
        ConstraintReference constraintReferenceE = e(str);
        if (constraintReferenceE instanceof ConstraintReference) {
            constraintReferenceE.n0(str2);
            if (this.f18130c.containsKey(str2)) {
                arrayList = this.f18130c.get(str2);
            } else {
                arrayList = new ArrayList<>();
                this.f18130c.put(str2, arrayList);
            }
            arrayList.add(str);
        }
    }

    public State x(Dimension dimension) {
        this.f18131d.q0(dimension);
        return this;
    }

    public androidx.constraintlayout.core.state.helpers.h y() {
        return (androidx.constraintlayout.core.state.helpers.h) m(null, Helper.VERTICAL_CHAIN);
    }

    public androidx.constraintlayout.core.state.helpers.h z(Object... objArr) {
        androidx.constraintlayout.core.state.helpers.h hVar = (androidx.constraintlayout.core.state.helpers.h) m(null, Helper.VERTICAL_CHAIN);
        hVar.E0(objArr);
        return hVar;
    }
}
