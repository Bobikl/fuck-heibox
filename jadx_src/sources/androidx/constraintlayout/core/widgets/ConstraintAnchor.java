package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.analyzer.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintAnchor {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final boolean f18215j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f18216k = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f18218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f18219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ConstraintWidget f18220d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Type f18221e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ConstraintAnchor f18222f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    SolverVariable f18225i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashSet<ConstraintAnchor> f18217a = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f18223g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f18224h = Integer.MIN_VALUE;

    public enum Type {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f18226a;

        static {
            int[] iArr = new int[Type.values().length];
            f18226a = iArr;
            try {
                iArr[Type.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18226a[Type.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18226a[Type.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18226a[Type.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18226a[Type.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18226a[Type.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18226a[Type.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f18226a[Type.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f18226a[Type.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public ConstraintAnchor(ConstraintWidget constraintWidget, Type type) {
        this.f18220d = constraintWidget;
        this.f18221e = type;
    }

    private boolean s(ConstraintWidget constraintWidget, HashSet<ConstraintWidget> hashSet) {
        if (hashSet.contains(constraintWidget)) {
            return false;
        }
        hashSet.add(constraintWidget);
        if (constraintWidget == i()) {
            return true;
        }
        ArrayList<ConstraintAnchor> arrayListS = constraintWidget.s();
        int size = arrayListS.size();
        for (int i10 = 0; i10 < size; i10++) {
            ConstraintAnchor constraintAnchor = arrayListS.get(i10);
            if (constraintAnchor.u(this) && constraintAnchor.p() && s(constraintAnchor.k().i(), hashSet)) {
                return true;
            }
        }
        return false;
    }

    public void A(int i10) {
        this.f18218b = i10;
        this.f18219c = true;
    }

    public void B(int i10) {
        if (p()) {
            this.f18224h = i10;
        }
    }

    public void C(int i10) {
        if (p()) {
            this.f18223g = i10;
        }
    }

    public boolean a(ConstraintAnchor constraintAnchor, int i10) {
        return b(constraintAnchor, i10, Integer.MIN_VALUE, false);
    }

    public boolean b(ConstraintAnchor constraintAnchor, int i10, int i11, boolean z10) {
        if (constraintAnchor == null) {
            x();
            return true;
        }
        if (!z10 && !v(constraintAnchor)) {
            return false;
        }
        this.f18222f = constraintAnchor;
        if (constraintAnchor.f18217a == null) {
            constraintAnchor.f18217a = new HashSet<>();
        }
        HashSet<ConstraintAnchor> hashSet = this.f18222f.f18217a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f18223g = i10;
        this.f18224h = i11;
        return true;
    }

    public void c(ConstraintAnchor constraintAnchor, HashMap<ConstraintWidget, ConstraintWidget> map) {
        HashSet<ConstraintAnchor> hashSet;
        ConstraintAnchor constraintAnchor2 = this.f18222f;
        if (constraintAnchor2 != null && (hashSet = constraintAnchor2.f18217a) != null) {
            hashSet.remove(this);
        }
        ConstraintAnchor constraintAnchor3 = constraintAnchor.f18222f;
        if (constraintAnchor3 != null) {
            this.f18222f = map.get(constraintAnchor.f18222f.f18220d).r(constraintAnchor3.l());
        } else {
            this.f18222f = null;
        }
        ConstraintAnchor constraintAnchor4 = this.f18222f;
        if (constraintAnchor4 != null) {
            if (constraintAnchor4.f18217a == null) {
                constraintAnchor4.f18217a = new HashSet<>();
            }
            this.f18222f.f18217a.add(this);
        }
        this.f18223g = constraintAnchor.f18223g;
        this.f18224h = constraintAnchor.f18224h;
    }

    public void d(int i10, ArrayList<n> arrayList, n nVar) {
        HashSet<ConstraintAnchor> hashSet = this.f18217a;
        if (hashSet != null) {
            Iterator<ConstraintAnchor> it = hashSet.iterator();
            while (it.hasNext()) {
                androidx.constraintlayout.core.widgets.analyzer.h.a(it.next().f18220d, i10, arrayList, nVar);
            }
        }
    }

    public HashSet<ConstraintAnchor> e() {
        return this.f18217a;
    }

    public int f() {
        if (this.f18219c) {
            return this.f18218b;
        }
        return 0;
    }

    public int g() {
        ConstraintAnchor constraintAnchor;
        if (this.f18220d.i0() == 8) {
            return 0;
        }
        return (this.f18224h == Integer.MIN_VALUE || (constraintAnchor = this.f18222f) == null || constraintAnchor.f18220d.i0() != 8) ? this.f18223g : this.f18224h;
    }

    public final ConstraintAnchor h() {
        switch (a.f18226a[this.f18221e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f18220d.S;
            case 3:
                return this.f18220d.Q;
            case 4:
                return this.f18220d.T;
            case 5:
                return this.f18220d.R;
            default:
                throw new AssertionError(this.f18221e.name());
        }
    }

    public ConstraintWidget i() {
        return this.f18220d;
    }

    public SolverVariable j() {
        return this.f18225i;
    }

    public ConstraintAnchor k() {
        return this.f18222f;
    }

    public Type l() {
        return this.f18221e;
    }

    public boolean m() {
        HashSet<ConstraintAnchor> hashSet = this.f18217a;
        if (hashSet == null) {
            return false;
        }
        Iterator<ConstraintAnchor> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().h().p()) {
                return true;
            }
        }
        return false;
    }

    public boolean n() {
        HashSet<ConstraintAnchor> hashSet = this.f18217a;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean o() {
        return this.f18219c;
    }

    public boolean p() {
        return this.f18222f != null;
    }

    public boolean q(ConstraintWidget constraintWidget) {
        if (s(constraintWidget, new HashSet<>())) {
            return false;
        }
        ConstraintWidget constraintWidgetU = i().U();
        return constraintWidgetU == constraintWidget || constraintWidget.U() == constraintWidgetU;
    }

    public boolean r(ConstraintWidget constraintWidget, ConstraintAnchor constraintAnchor) {
        return q(constraintWidget);
    }

    public boolean t() {
        switch (a.f18226a[this.f18221e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            case 2:
            case 3:
            case 4:
            case 5:
                return true;
            default:
                throw new AssertionError(this.f18221e.name());
        }
    }

    public String toString() {
        return this.f18220d.y() + ":" + this.f18221e.toString();
    }

    public boolean u(ConstraintAnchor constraintAnchor) {
        Type typeL = constraintAnchor.l();
        Type type = this.f18221e;
        if (typeL == type) {
            return true;
        }
        switch (a.f18226a[type.ordinal()]) {
            case 1:
                return typeL != Type.BASELINE;
            case 2:
            case 3:
            case 7:
                return typeL == Type.LEFT || typeL == Type.RIGHT || typeL == Type.CENTER_X;
            case 4:
            case 5:
            case 6:
            case 8:
                return typeL == Type.TOP || typeL == Type.BOTTOM || typeL == Type.CENTER_Y || typeL == Type.BASELINE;
            case 9:
                return false;
            default:
                throw new AssertionError(this.f18221e.name());
        }
    }

    public boolean v(ConstraintAnchor constraintAnchor) {
        if (constraintAnchor == null) {
            return false;
        }
        Type typeL = constraintAnchor.l();
        Type type = this.f18221e;
        if (typeL == type) {
            return type != Type.BASELINE || (constraintAnchor.i().n0() && i().n0());
        }
        switch (a.f18226a[type.ordinal()]) {
            case 1:
                return (typeL == Type.BASELINE || typeL == Type.CENTER_X || typeL == Type.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z10 = typeL == Type.LEFT || typeL == Type.RIGHT;
                if (constraintAnchor.i() instanceof f) {
                    return z10 || typeL == Type.CENTER_X;
                }
                return z10;
            case 4:
            case 5:
                boolean z11 = typeL == Type.TOP || typeL == Type.BOTTOM;
                if (constraintAnchor.i() instanceof f) {
                    return z11 || typeL == Type.CENTER_Y;
                }
                return z11;
            case 6:
                return (typeL == Type.LEFT || typeL == Type.RIGHT) ? false : true;
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f18221e.name());
        }
    }

    public boolean w() {
        switch (a.f18226a[this.f18221e.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 7:
                return false;
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
                return true;
            default:
                throw new AssertionError(this.f18221e.name());
        }
    }

    public void x() {
        HashSet<ConstraintAnchor> hashSet;
        ConstraintAnchor constraintAnchor = this.f18222f;
        if (constraintAnchor != null && (hashSet = constraintAnchor.f18217a) != null) {
            hashSet.remove(this);
            if (this.f18222f.f18217a.size() == 0) {
                this.f18222f.f18217a = null;
            }
        }
        this.f18217a = null;
        this.f18222f = null;
        this.f18223g = 0;
        this.f18224h = Integer.MIN_VALUE;
        this.f18219c = false;
        this.f18218b = 0;
    }

    public void y() {
        this.f18219c = false;
        this.f18218b = 0;
    }

    public void z(androidx.constraintlayout.core.c cVar) {
        SolverVariable solverVariable = this.f18225i;
        if (solverVariable == null) {
            this.f18225i = new SolverVariable(SolverVariable.Type.UNRESTRICTED, (String) null);
        } else {
            solverVariable.h();
        }
    }
}
