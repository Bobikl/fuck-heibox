package androidx.constraintlayout.core.widgets;

/* JADX INFO: compiled from: Optimizer.java */
/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f18484a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f18485b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f18486c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f18487d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f18488e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f18489f = 16;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f18490g = 32;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f18491h = 64;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f18492i = 128;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f18493j = 256;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f18494k = 512;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f18495l = 1024;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f18496m = 257;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static boolean[] f18497n = new boolean[3];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final int f18498o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final int f18499p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final int f18500q = 2;

    static void a(d dVar, androidx.constraintlayout.core.e eVar, ConstraintWidget constraintWidget) {
        constraintWidget.f18290t = -1;
        constraintWidget.f18292u = -1;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = dVar.f18255b0[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (dimensionBehaviour != dimensionBehaviour2 && constraintWidget.f18255b0[0] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            int i10 = constraintWidget.Q.f18223g;
            int iJ0 = dVar.j0() - constraintWidget.S.f18223g;
            ConstraintAnchor constraintAnchor = constraintWidget.Q;
            constraintAnchor.f18225i = eVar.u(constraintAnchor);
            ConstraintAnchor constraintAnchor2 = constraintWidget.S;
            constraintAnchor2.f18225i = eVar.u(constraintAnchor2);
            eVar.f(constraintWidget.Q.f18225i, i10);
            eVar.f(constraintWidget.S.f18225i, iJ0);
            constraintWidget.f18290t = 2;
            constraintWidget.w1(i10, iJ0);
        }
        if (dVar.f18255b0[1] == dimensionBehaviour2 || constraintWidget.f18255b0[1] != ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            return;
        }
        int i11 = constraintWidget.R.f18223g;
        int iD = dVar.D() - constraintWidget.T.f18223g;
        ConstraintAnchor constraintAnchor3 = constraintWidget.R;
        constraintAnchor3.f18225i = eVar.u(constraintAnchor3);
        ConstraintAnchor constraintAnchor4 = constraintWidget.T;
        constraintAnchor4.f18225i = eVar.u(constraintAnchor4);
        eVar.f(constraintWidget.R.f18225i, i11);
        eVar.f(constraintWidget.T.f18225i, iD);
        if (constraintWidget.f18279n0 > 0 || constraintWidget.i0() == 8) {
            ConstraintAnchor constraintAnchor5 = constraintWidget.U;
            constraintAnchor5.f18225i = eVar.u(constraintAnchor5);
            eVar.f(constraintWidget.U.f18225i, constraintWidget.f18279n0 + i11);
        }
        constraintWidget.f18292u = 2;
        constraintWidget.R1(i11, iD);
    }

    public static final boolean b(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}
