package kotlin.reflect.jvm.internal.impl.name;

import kotlin.jvm.internal.f0;
import xh.m;

/* JADX INFO: compiled from: SpecialNames.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final h f127209a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final f f127210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final f f127211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final f f127212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final f f127213e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final f f127214f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final f f127215g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final f f127216h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final f f127217i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final f f127218j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final f f127219k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final f f127220l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final f f127221m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final f f127222n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final f f127223o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final f f127224p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final f f127225q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final f f127226r;

    static {
        f fVarI = f.i("<no name provided>");
        f0.o(fVarI, "special(\"<no name provided>\")");
        f127210b = fVarI;
        f fVarI2 = f.i("<root package>");
        f0.o(fVarI2, "special(\"<root package>\")");
        f127211c = fVarI2;
        f fVarF = f.f("Companion");
        f0.o(fVarF, "identifier(\"Companion\")");
        f127212d = fVarF;
        f fVarF2 = f.f("no_name_in_PSI_3d19d79d_1ba9_4cd0_b7f5_b46aa3cd5d40");
        f0.o(fVarF2, "identifier(\"no_name_in_P…_4cd0_b7f5_b46aa3cd5d40\")");
        f127213e = fVarF2;
        f fVarI3 = f.i("<anonymous>");
        f0.o(fVarI3, "special(ANONYMOUS_STRING)");
        f127214f = fVarI3;
        f fVarI4 = f.i("<unary>");
        f0.o(fVarI4, "special(\"<unary>\")");
        f127215g = fVarI4;
        f fVarI5 = f.i("<unary-result>");
        f0.o(fVarI5, "special(\"<unary-result>\")");
        f127216h = fVarI5;
        f fVarI6 = f.i("<this>");
        f0.o(fVarI6, "special(\"<this>\")");
        f127217i = fVarI6;
        f fVarI7 = f.i("<init>");
        f0.o(fVarI7, "special(\"<init>\")");
        f127218j = fVarI7;
        f fVarI8 = f.i("<iterator>");
        f0.o(fVarI8, "special(\"<iterator>\")");
        f127219k = fVarI8;
        f fVarI9 = f.i("<destruct>");
        f0.o(fVarI9, "special(\"<destruct>\")");
        f127220l = fVarI9;
        f fVarI10 = f.i("<local>");
        f0.o(fVarI10, "special(\"<local>\")");
        f127221m = fVarI10;
        f fVarI11 = f.i("<unused var>");
        f0.o(fVarI11, "special(\"<unused var>\")");
        f127222n = fVarI11;
        f fVarI12 = f.i("<set-?>");
        f0.o(fVarI12, "special(\"<set-?>\")");
        f127223o = fVarI12;
        f fVarI13 = f.i("<array>");
        f0.o(fVarI13, "special(\"<array>\")");
        f127224p = fVarI13;
        f fVarI14 = f.i("<receiver>");
        f0.o(fVarI14, "special(\"<receiver>\")");
        f127225q = fVarI14;
        f fVarI15 = f.i("<get-entries>");
        f0.o(fVarI15, "special(\"<get-entries>\")");
        f127226r = fVarI15;
    }

    private h() {
    }

    @dl.d
    @m
    public static final f b(@dl.e f fVar) {
        return (fVar == null || fVar.g()) ? f127213e : fVar;
    }

    public final boolean a(@dl.d f name) {
        f0.p(name, "name");
        String strB = name.b();
        f0.o(strB, "name.asString()");
        return (strB.length() > 0) && !name.g();
    }
}
