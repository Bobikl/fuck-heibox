package androidx.p001datastore.preferences.protobuf;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: MessageSchema.java */
/* JADX INFO: loaded from: classes6.dex */
public final class c2<T> implements x2<T> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f22404r = 3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f22405s = 20;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f22406t = 1048575;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f22407u = 267386880;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f22408v = 268435456;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f22409w = 536870912;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    static final int f22411y = 51;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f22413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f22414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f22415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f22416d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final z1 f22417e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f22418f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f22419g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f22420h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f22421i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int[] f22422j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f22423k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f22424l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final j2 f22425m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final o1 f22426n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final v3<?, ?> f22427o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final q0<?> f22428p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final u1 f22429q;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int[] f22410x = new int[0];

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final Unsafe f22412z = z3.R();

    /* JADX INFO: compiled from: MessageSchema.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22430a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f22430a = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22430a[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22430a[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22430a[WireFormat.FieldType.FIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22430a[WireFormat.FieldType.SFIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22430a[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22430a[WireFormat.FieldType.SFIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f22430a[WireFormat.FieldType.FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f22430a[WireFormat.FieldType.ENUM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f22430a[WireFormat.FieldType.INT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f22430a[WireFormat.FieldType.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f22430a[WireFormat.FieldType.INT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f22430a[WireFormat.FieldType.UINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f22430a[WireFormat.FieldType.MESSAGE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f22430a[WireFormat.FieldType.SINT32.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f22430a[WireFormat.FieldType.SINT64.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f22430a[WireFormat.FieldType.STRING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private c2(int[] iArr, Object[] objArr, int i10, int i11, z1 z1Var, boolean z10, boolean z11, int[] iArr2, int i12, int i13, j2 j2Var, o1 o1Var, v3<?, ?> v3Var, q0<?> q0Var, u1 u1Var) {
        this.f22413a = iArr;
        this.f22414b = objArr;
        this.f22415c = i10;
        this.f22416d = i11;
        this.f22419g = z1Var instanceof GeneratedMessageLite;
        this.f22420h = z10;
        this.f22418f = q0Var != null && q0Var.e(z1Var);
        this.f22421i = z11;
        this.f22422j = iArr2;
        this.f22423k = i12;
        this.f22424l = i13;
        this.f22425m = j2Var;
        this.f22426n = o1Var;
        this.f22427o = v3Var;
        this.f22428p = q0Var;
        this.f22417e = z1Var;
        this.f22429q = u1Var;
    }

    private <UT, UB> int A(v3<UT, UB> v3Var, T t10) {
        return v3Var.h(v3Var.g(t10));
    }

    private <UT, UB> void A0(v3<UT, UB> v3Var, T t10, Writer writer) throws IOException {
        v3Var.t(v3Var.g(t10), writer);
    }

    private static <T> int B(T t10, long j10) {
        return z3.I(t10, j10);
    }

    private static boolean C(int i10) {
        return (i10 & 536870912) != 0;
    }

    private boolean D(T t10, int i10) {
        if (!this.f22420h) {
            int iJ0 = j0(i10);
            return (z3.I(t10, (long) (iJ0 & f22406t)) & (1 << (iJ0 >>> 20))) != 0;
        }
        int iU0 = u0(i10);
        long jW = W(iU0);
        switch (t0(iU0)) {
            case 0:
                return z3.D(t10, jW) != 0.0d;
            case 1:
                return z3.F(t10, jW) != 0.0f;
            case 2:
                return z3.L(t10, jW) != 0;
            case 3:
                return z3.L(t10, jW) != 0;
            case 4:
                return z3.I(t10, jW) != 0;
            case 5:
                return z3.L(t10, jW) != 0;
            case 6:
                return z3.I(t10, jW) != 0;
            case 7:
                return z3.u(t10, jW);
            case 8:
                Object objO = z3.O(t10, jW);
                if (objO instanceof String) {
                    return !((String) objO).isEmpty();
                }
                if (objO instanceof ByteString) {
                    return !ByteString.f22239f.equals(objO);
                }
                throw new IllegalArgumentException();
            case 9:
                return z3.O(t10, jW) != null;
            case 10:
                return !ByteString.f22239f.equals(z3.O(t10, jW));
            case 11:
                return z3.I(t10, jW) != 0;
            case 12:
                return z3.I(t10, jW) != 0;
            case 13:
                return z3.I(t10, jW) != 0;
            case 14:
                return z3.L(t10, jW) != 0;
            case 15:
                return z3.I(t10, jW) != 0;
            case 16:
                return z3.L(t10, jW) != 0;
            case 17:
                return z3.O(t10, jW) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private boolean E(T t10, int i10, int i11, int i12) {
        if (this.f22420h) {
            return D(t10, i10);
        }
        return (i11 & i12) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean F(Object obj, int i10, x2 x2Var) {
        return x2Var.b(z3.O(obj, W(i10)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean G(Object obj, int i10, int i11) {
        List list = (List) z3.O(obj, W(i10));
        if (list.isEmpty()) {
            return true;
        }
        x2 x2VarV = v(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (!x2VarV.b(list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [androidx.datastore.preferences.protobuf.x2] */
    private boolean H(T t10, int i10, int i11) {
        Map<?, ?> mapG = this.f22429q.g(z3.O(t10, W(i10)));
        if (mapG.isEmpty()) {
            return true;
        }
        if (this.f22429q.b(u(i11)).f22639c.getJavaType() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        ?? I = 0;
        for (Object obj : mapG.values()) {
            if (I == 0) {
                I = I;
                I = r2.a().i(obj.getClass());
            }
            I = I;
            if (!I.b(obj)) {
                return false;
            }
        }
        return true;
    }

    private boolean I(T t10, T t11, int i10) {
        long jJ0 = j0(i10) & f22406t;
        return z3.I(t10, jJ0) == z3.I(t11, jJ0);
    }

    private boolean J(T t10, int i10, int i11) {
        return z3.I(t10, (long) (j0(i11) & f22406t)) == i10;
    }

    private static boolean K(int i10) {
        return (i10 & 268435456) != 0;
    }

    private static List<?> L(Object obj, long j10) {
        return (List) z3.O(obj, j10);
    }

    private static <T> long M(T t10, long j10) {
        return z3.L(t10, j10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <UT, UB, ET extends y0.c<ET>> void N(v3<UT, UB> v3Var, q0<ET> q0Var, T t10, w2 w2Var, p0 p0Var) throws IOException {
        Object objQ = null;
        Object objD = null;
        while (true) {
            try {
                int iP = w2Var.p();
                int iH0 = h0(iP);
                if (iH0 >= 0) {
                    int iU0 = u0(iH0);
                    try {
                        switch (t0(iU0)) {
                            case 0:
                                z3.g0(t10, W(iU0), w2Var.readDouble());
                                p0(t10, iH0);
                                break;
                            case 1:
                                z3.i0(t10, W(iU0), w2Var.readFloat());
                                p0(t10, iH0);
                                break;
                            case 2:
                                z3.o0(t10, W(iU0), w2Var.w());
                                p0(t10, iH0);
                                break;
                            case 3:
                                z3.o0(t10, W(iU0), w2Var.j());
                                p0(t10, iH0);
                                break;
                            case 4:
                                z3.l0(t10, W(iU0), w2Var.F());
                                p0(t10, iH0);
                                break;
                            case 5:
                                z3.o0(t10, W(iU0), w2Var.y());
                                p0(t10, iH0);
                                break;
                            case 6:
                                z3.l0(t10, W(iU0), w2Var.J());
                                p0(t10, iH0);
                                break;
                            case 7:
                                z3.X(t10, W(iU0), w2Var.A());
                                p0(t10, iH0);
                                break;
                            case 8:
                                m0(t10, iU0, w2Var);
                                p0(t10, iH0);
                                break;
                            case 9:
                                if (D(t10, iH0)) {
                                    z3.q0(t10, W(iU0), i1.v(z3.O(t10, W(iU0)), w2Var.x(v(iH0), p0Var)));
                                } else {
                                    z3.q0(t10, W(iU0), w2Var.x(v(iH0), p0Var));
                                    p0(t10, iH0);
                                }
                                break;
                            case 10:
                                z3.q0(t10, W(iU0), w2Var.g());
                                p0(t10, iH0);
                                break;
                            case 11:
                                z3.l0(t10, W(iU0), w2Var.c());
                                p0(t10, iH0);
                                break;
                            case 12:
                                int iD = w2Var.d();
                                i1.e eVarT = t(iH0);
                                if (eVarT == null || eVarT.a(iD)) {
                                    z3.l0(t10, W(iU0), iD);
                                    p0(t10, iH0);
                                } else {
                                    objQ = z2.Q(iP, iD, objQ, v3Var);
                                }
                                break;
                            case 13:
                                z3.l0(t10, W(iU0), w2Var.Q());
                                p0(t10, iH0);
                                break;
                            case 14:
                                z3.o0(t10, W(iU0), w2Var.b());
                                p0(t10, iH0);
                                break;
                            case 15:
                                z3.l0(t10, W(iU0), w2Var.e());
                                p0(t10, iH0);
                                break;
                            case 16:
                                z3.o0(t10, W(iU0), w2Var.N());
                                p0(t10, iH0);
                                break;
                            case 17:
                                if (D(t10, iH0)) {
                                    z3.q0(t10, W(iU0), i1.v(z3.O(t10, W(iU0)), w2Var.h(v(iH0), p0Var)));
                                } else {
                                    z3.q0(t10, W(iU0), w2Var.h(v(iH0), p0Var));
                                    p0(t10, iH0);
                                }
                                break;
                            case 18:
                                w2Var.v(this.f22426n.e(t10, W(iU0)));
                                break;
                            case 19:
                                w2Var.r(this.f22426n.e(t10, W(iU0)));
                                break;
                            case 20:
                                w2Var.C(this.f22426n.e(t10, W(iU0)));
                                break;
                            case 21:
                                w2Var.B(this.f22426n.e(t10, W(iU0)));
                                break;
                            case 22:
                                w2Var.n(this.f22426n.e(t10, W(iU0)));
                                break;
                            case 23:
                                w2Var.H(this.f22426n.e(t10, W(iU0)));
                                break;
                            case 24:
                                w2Var.o(this.f22426n.e(t10, W(iU0)));
                                break;
                            case 25:
                                w2Var.f(this.f22426n.e(t10, W(iU0)));
                                break;
                            case 26:
                                n0(t10, iU0, w2Var);
                                break;
                            case 27:
                                l0(t10, iU0, w2Var, v(iH0), p0Var);
                                break;
                            case 28:
                                w2Var.u(this.f22426n.e(t10, W(iU0)));
                                break;
                            case 29:
                                w2Var.I(this.f22426n.e(t10, W(iU0)));
                                break;
                            case 30:
                                List<Integer> listE = this.f22426n.e(t10, W(iU0));
                                w2Var.D(listE);
                                objQ = z2.C(iP, listE, t(iH0), objQ, v3Var);
                                break;
                            case 31:
                                w2Var.z(this.f22426n.e(t10, W(iU0)));
                                break;
                            case 32:
                                w2Var.m(this.f22426n.e(t10, W(iU0)));
                                break;
                            case 33:
                                w2Var.i(this.f22426n.e(t10, W(iU0)));
                                break;
                            case 34:
                                w2Var.a(this.f22426n.e(t10, W(iU0)));
                                break;
                            case 35:
                                w2Var.v(this.f22426n.e(t10, W(iU0)));
                                break;
                            case 36:
                                w2Var.r(this.f22426n.e(t10, W(iU0)));
                                break;
                            case 37:
                                w2Var.C(this.f22426n.e(t10, W(iU0)));
                                break;
                            case 38:
                                w2Var.B(this.f22426n.e(t10, W(iU0)));
                                break;
                            case 39:
                                w2Var.n(this.f22426n.e(t10, W(iU0)));
                                break;
                            case 40:
                                w2Var.H(this.f22426n.e(t10, W(iU0)));
                                break;
                            case 41:
                                w2Var.o(this.f22426n.e(t10, W(iU0)));
                                break;
                            case 42:
                                w2Var.f(this.f22426n.e(t10, W(iU0)));
                                break;
                            case 43:
                                w2Var.I(this.f22426n.e(t10, W(iU0)));
                                break;
                            case 44:
                                List<Integer> listE2 = this.f22426n.e(t10, W(iU0));
                                w2Var.D(listE2);
                                objQ = z2.C(iP, listE2, t(iH0), objQ, v3Var);
                                break;
                            case 45:
                                w2Var.z(this.f22426n.e(t10, W(iU0)));
                                break;
                            case 46:
                                w2Var.m(this.f22426n.e(t10, W(iU0)));
                                break;
                            case 47:
                                w2Var.i(this.f22426n.e(t10, W(iU0)));
                                break;
                            case 48:
                                w2Var.a(this.f22426n.e(t10, W(iU0)));
                                break;
                            case 49:
                                k0(t10, W(iU0), w2Var, v(iH0), p0Var);
                                break;
                            case 50:
                                O(t10, iH0, u(iH0), p0Var, w2Var);
                                break;
                            case 51:
                                z3.q0(t10, W(iU0), Double.valueOf(w2Var.readDouble()));
                                q0(t10, iP, iH0);
                                break;
                            case 52:
                                z3.q0(t10, W(iU0), Float.valueOf(w2Var.readFloat()));
                                q0(t10, iP, iH0);
                                break;
                            case 53:
                                z3.q0(t10, W(iU0), Long.valueOf(w2Var.w()));
                                q0(t10, iP, iH0);
                                break;
                            case 54:
                                z3.q0(t10, W(iU0), Long.valueOf(w2Var.j()));
                                q0(t10, iP, iH0);
                                break;
                            case 55:
                                z3.q0(t10, W(iU0), Integer.valueOf(w2Var.F()));
                                q0(t10, iP, iH0);
                                break;
                            case 56:
                                z3.q0(t10, W(iU0), Long.valueOf(w2Var.y()));
                                q0(t10, iP, iH0);
                                break;
                            case 57:
                                z3.q0(t10, W(iU0), Integer.valueOf(w2Var.J()));
                                q0(t10, iP, iH0);
                                break;
                            case 58:
                                z3.q0(t10, W(iU0), Boolean.valueOf(w2Var.A()));
                                q0(t10, iP, iH0);
                                break;
                            case 59:
                                m0(t10, iU0, w2Var);
                                q0(t10, iP, iH0);
                                break;
                            case 60:
                                if (J(t10, iP, iH0)) {
                                    z3.q0(t10, W(iU0), i1.v(z3.O(t10, W(iU0)), w2Var.x(v(iH0), p0Var)));
                                } else {
                                    z3.q0(t10, W(iU0), w2Var.x(v(iH0), p0Var));
                                    p0(t10, iH0);
                                }
                                q0(t10, iP, iH0);
                                break;
                            case 61:
                                z3.q0(t10, W(iU0), w2Var.g());
                                q0(t10, iP, iH0);
                                break;
                            case 62:
                                z3.q0(t10, W(iU0), Integer.valueOf(w2Var.c()));
                                q0(t10, iP, iH0);
                                break;
                            case 63:
                                int iD2 = w2Var.d();
                                i1.e eVarT2 = t(iH0);
                                if (eVarT2 == null || eVarT2.a(iD2)) {
                                    z3.q0(t10, W(iU0), Integer.valueOf(iD2));
                                    q0(t10, iP, iH0);
                                } else {
                                    objQ = z2.Q(iP, iD2, objQ, v3Var);
                                }
                                break;
                            case 64:
                                z3.q0(t10, W(iU0), Integer.valueOf(w2Var.Q()));
                                q0(t10, iP, iH0);
                                break;
                            case 65:
                                z3.q0(t10, W(iU0), Long.valueOf(w2Var.b()));
                                q0(t10, iP, iH0);
                                break;
                            case 66:
                                z3.q0(t10, W(iU0), Integer.valueOf(w2Var.e()));
                                q0(t10, iP, iH0);
                                break;
                            case 67:
                                z3.q0(t10, W(iU0), Long.valueOf(w2Var.N()));
                                q0(t10, iP, iH0);
                                break;
                            case 68:
                                z3.q0(t10, W(iU0), w2Var.h(v(iH0), p0Var));
                                q0(t10, iP, iH0);
                                break;
                            default:
                                if (objQ == null) {
                                    objQ = v3Var.n();
                                }
                                if (!v3Var.m(objQ, w2Var)) {
                                    for (int i10 = this.f22423k; i10 < this.f22424l; i10++) {
                                        objQ = q(t10, this.f22422j[i10], objQ, v3Var);
                                    }
                                    if (objQ != null) {
                                        v3Var.o(t10, objQ);
                                        return;
                                    }
                                    return;
                                }
                                break;
                                break;
                        }
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                        if (!v3Var.q(w2Var)) {
                            if (objQ == null) {
                                objQ = v3Var.f(t10);
                            }
                            if (!v3Var.m(objQ, w2Var)) {
                                for (int i11 = this.f22423k; i11 < this.f22424l; i11++) {
                                    objQ = q(t10, this.f22422j[i11], objQ, v3Var);
                                }
                                if (objQ != null) {
                                    v3Var.o(t10, objQ);
                                    return;
                                }
                                return;
                            }
                        } else if (!w2Var.t()) {
                            for (int i12 = this.f22423k; i12 < this.f22424l; i12++) {
                                objQ = q(t10, this.f22422j[i12], objQ, v3Var);
                            }
                            if (objQ != null) {
                                v3Var.o(t10, objQ);
                                return;
                            }
                            return;
                        }
                    }
                } else {
                    if (iP == Integer.MAX_VALUE) {
                        for (int i13 = this.f22423k; i13 < this.f22424l; i13++) {
                            objQ = q(t10, this.f22422j[i13], objQ, v3Var);
                        }
                        if (objQ != null) {
                            v3Var.o(t10, objQ);
                            return;
                        }
                        return;
                    }
                    Object objB = !this.f22418f ? null : q0Var.b(p0Var, this.f22417e, iP);
                    if (objB != null) {
                        if (objD == null) {
                            objD = q0Var.d(t10);
                        }
                        objQ = q0Var.g(w2Var, objB, p0Var, objD, objQ, v3Var);
                    } else if (!v3Var.q(w2Var)) {
                        if (objQ == null) {
                            objQ = v3Var.f(t10);
                        }
                        if (v3Var.m(objQ, w2Var)) {
                        }
                    } else if (w2Var.t()) {
                    }
                }
            } catch (Throwable th2) {
                for (int i14 = this.f22423k; i14 < this.f22424l; i14++) {
                    objQ = q(t10, this.f22422j[i14], objQ, v3Var);
                }
                if (objQ != null) {
                    v3Var.o(t10, objQ);
                }
                throw th2;
            }
        }
        for (int i15 = this.f22423k; i15 < this.f22424l; i15++) {
            objQ = q(t10, this.f22422j[i15], objQ, v3Var);
        }
        if (objQ != null) {
            v3Var.o(t10, objQ);
        }
    }

    private final <K, V> void O(Object obj, int i10, Object obj2, p0 p0Var, w2 w2Var) throws IOException {
        long jW = W(u0(i10));
        Object objO = z3.O(obj, jW);
        if (objO == null) {
            objO = this.f22429q.f(obj2);
            z3.q0(obj, jW, objO);
        } else if (this.f22429q.h(objO)) {
            Object objF = this.f22429q.f(obj2);
            this.f22429q.a(objF, objO);
            z3.q0(obj, jW, objF);
            objO = objF;
        }
        w2Var.M(this.f22429q.e(objO), this.f22429q.b(obj2), p0Var);
    }

    private void P(T t10, T t11, int i10) {
        long jW = W(u0(i10));
        if (D(t11, i10)) {
            Object objO = z3.O(t10, jW);
            Object objO2 = z3.O(t11, jW);
            if (objO != null && objO2 != null) {
                z3.q0(t10, jW, i1.v(objO, objO2));
                p0(t10, i10);
            } else if (objO2 != null) {
                z3.q0(t10, jW, objO2);
                p0(t10, i10);
            }
        }
    }

    private void Q(T t10, T t11, int i10) {
        int iU0 = u0(i10);
        int iV = V(i10);
        long jW = W(iU0);
        if (J(t11, iV, i10)) {
            Object objO = z3.O(t10, jW);
            Object objO2 = z3.O(t11, jW);
            if (objO != null && objO2 != null) {
                z3.q0(t10, jW, i1.v(objO, objO2));
                q0(t10, iV, i10);
            } else if (objO2 != null) {
                z3.q0(t10, jW, objO2);
                q0(t10, iV, i10);
            }
        }
    }

    private void R(T t10, T t11, int i10) {
        int iU0 = u0(i10);
        long jW = W(iU0);
        int iV = V(i10);
        switch (t0(iU0)) {
            case 0:
                if (D(t11, i10)) {
                    z3.g0(t10, jW, z3.D(t11, jW));
                    p0(t10, i10);
                }
                break;
            case 1:
                if (D(t11, i10)) {
                    z3.i0(t10, jW, z3.F(t11, jW));
                    p0(t10, i10);
                }
                break;
            case 2:
                if (D(t11, i10)) {
                    z3.o0(t10, jW, z3.L(t11, jW));
                    p0(t10, i10);
                }
                break;
            case 3:
                if (D(t11, i10)) {
                    z3.o0(t10, jW, z3.L(t11, jW));
                    p0(t10, i10);
                }
                break;
            case 4:
                if (D(t11, i10)) {
                    z3.l0(t10, jW, z3.I(t11, jW));
                    p0(t10, i10);
                }
                break;
            case 5:
                if (D(t11, i10)) {
                    z3.o0(t10, jW, z3.L(t11, jW));
                    p0(t10, i10);
                }
                break;
            case 6:
                if (D(t11, i10)) {
                    z3.l0(t10, jW, z3.I(t11, jW));
                    p0(t10, i10);
                }
                break;
            case 7:
                if (D(t11, i10)) {
                    z3.X(t10, jW, z3.u(t11, jW));
                    p0(t10, i10);
                }
                break;
            case 8:
                if (D(t11, i10)) {
                    z3.q0(t10, jW, z3.O(t11, jW));
                    p0(t10, i10);
                }
                break;
            case 9:
                P(t10, t11, i10);
                break;
            case 10:
                if (D(t11, i10)) {
                    z3.q0(t10, jW, z3.O(t11, jW));
                    p0(t10, i10);
                }
                break;
            case 11:
                if (D(t11, i10)) {
                    z3.l0(t10, jW, z3.I(t11, jW));
                    p0(t10, i10);
                }
                break;
            case 12:
                if (D(t11, i10)) {
                    z3.l0(t10, jW, z3.I(t11, jW));
                    p0(t10, i10);
                }
                break;
            case 13:
                if (D(t11, i10)) {
                    z3.l0(t10, jW, z3.I(t11, jW));
                    p0(t10, i10);
                }
                break;
            case 14:
                if (D(t11, i10)) {
                    z3.o0(t10, jW, z3.L(t11, jW));
                    p0(t10, i10);
                }
                break;
            case 15:
                if (D(t11, i10)) {
                    z3.l0(t10, jW, z3.I(t11, jW));
                    p0(t10, i10);
                }
                break;
            case 16:
                if (D(t11, i10)) {
                    z3.o0(t10, jW, z3.L(t11, jW));
                    p0(t10, i10);
                }
                break;
            case 17:
                P(t10, t11, i10);
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.f22426n.d(t10, t11, jW);
                break;
            case 50:
                z2.I(this.f22429q, t10, t11, jW);
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (J(t11, iV, i10)) {
                    z3.q0(t10, jW, z3.O(t11, jW));
                    q0(t10, iV, i10);
                }
                break;
            case 60:
                Q(t10, t11, i10);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (J(t11, iV, i10)) {
                    z3.q0(t10, jW, z3.O(t11, jW));
                    q0(t10, iV, i10);
                }
                break;
            case 68:
                Q(t10, t11, i10);
                break;
        }
    }

    static <T> c2<T> S(Class<T> cls, x1 x1Var, j2 j2Var, o1 o1Var, v3<?, ?> v3Var, q0<?> q0Var, u1 u1Var) {
        return x1Var instanceof v2 ? U((v2) x1Var, j2Var, o1Var, v3Var, q0Var, u1Var) : T((j3) x1Var, j2Var, o1Var, v3Var, q0Var, u1Var);
    }

    static <T> c2<T> T(j3 j3Var, j2 j2Var, o1 o1Var, v3<?, ?> v3Var, q0<?> q0Var, u1 u1Var) {
        int iO;
        int iO2;
        boolean z10 = j3Var.f() == ProtoSyntax.PROTO3;
        t0[] t0VarArrD = j3Var.d();
        if (t0VarArrD.length == 0) {
            iO = 0;
            iO2 = 0;
        } else {
            iO = t0VarArrD[0].o();
            iO2 = t0VarArrD[t0VarArrD.length - 1].o();
        }
        int length = t0VarArrD.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        int i10 = 0;
        int i11 = 0;
        for (t0 t0Var : t0VarArrD) {
            if (t0Var.y() == FieldType.MAP) {
                i10++;
            } else if (t0Var.y().id() >= 18 && t0Var.y().id() <= 49) {
                i11++;
            }
        }
        int[] iArr2 = i10 > 0 ? new int[i10] : null;
        int[] iArr3 = i11 > 0 ? new int[i11] : null;
        int[] iArrC = j3Var.c();
        if (iArrC == null) {
            iArrC = f22410x;
        }
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i12 < t0VarArrD.length) {
            t0 t0Var2 = t0VarArrD[i12];
            int iO3 = t0Var2.o();
            s0(t0Var2, iArr, i13, z10, objArr);
            if (i14 < iArrC.length && iArrC[i14] == iO3) {
                iArrC[i14] = i13;
                i14++;
            }
            if (t0Var2.y() == FieldType.MAP) {
                iArr2[i15] = i13;
                i15++;
            } else {
                if (t0Var2.y().id() >= 18 && t0Var2.y().id() <= 49) {
                    iArr3[i16] = (int) z3.W(t0Var2.n());
                    i16++;
                }
                i12++;
                i13 += 3;
            }
            i12++;
            i13 += 3;
        }
        if (iArr2 == null) {
            iArr2 = f22410x;
        }
        if (iArr3 == null) {
            iArr3 = f22410x;
        }
        int[] iArr4 = new int[iArrC.length + iArr2.length + iArr3.length];
        System.arraycopy(iArrC, 0, iArr4, 0, iArrC.length);
        System.arraycopy(iArr2, 0, iArr4, iArrC.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, iArrC.length + iArr2.length, iArr3.length);
        return new c2<>(iArr, objArr, iO, iO2, j3Var.b(), z10, true, iArr4, iArrC.length, iArrC.length + iArr2.length, j2Var, o1Var, v3Var, q0Var, u1Var);
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0277  */
    /* JADX WARN: Code duplicated, block: B:125:0x027a  */
    /* JADX WARN: Code duplicated, block: B:128:0x0292  */
    /* JADX WARN: Code duplicated, block: B:129:0x0295  */
    /* JADX WARN: Code duplicated, block: B:163:0x033c  */
    /* JADX WARN: Code duplicated, block: B:165:0x0341  */
    /* JADX WARN: Code duplicated, block: B:167:0x034c  */
    /* JADX WARN: Code duplicated, block: B:170:0x0358 A[LOOP:6: B:168:0x0350->B:170:0x0358, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:174:0x0375  */
    /* JADX WARN: Code duplicated, block: B:175:0x0378  */
    /* JADX WARN: Code duplicated, block: B:177:0x038b  */
    /* JADX WARN: Code duplicated, block: B:178:0x0391  */
    /* JADX WARN: Code duplicated, block: B:182:0x039e  */
    /* JADX WARN: Code duplicated, block: B:205:0x0362 A[EDGE_INSN: B:205:0x0362->B:171:0x0362 BREAK  A[LOOP:6: B:168:0x0350->B:170:0x0358], SYNTHETIC] */
    static <T> c2<T> U(v2 v2Var, j2 j2Var, o1 o1Var, v3<?, ?> v3Var, q0<?> q0Var, u1 u1Var) {
        int i10;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int i11;
        int i12;
        int[] iArr;
        int i13;
        int i14;
        char cCharAt;
        int i15;
        char cCharAt2;
        int i16;
        char cCharAt3;
        int i17;
        char cCharAt4;
        int i18;
        char cCharAt5;
        int i19;
        char cCharAt6;
        int i20;
        char cCharAt7;
        int i21;
        char cCharAt8;
        int i22;
        int i23;
        boolean z10;
        int i24;
        int iObjectFieldOffset;
        int i25;
        int i26;
        int iObjectFieldOffset2;
        int i27;
        int i28;
        int iCharAt4;
        int i29;
        Object obj;
        Field fieldO0;
        int i30;
        int i31;
        int i32;
        char cCharAt9;
        int i33;
        int i34;
        int i35;
        Object obj2;
        Field fieldO1;
        int i36;
        Object obj3;
        Field fieldO2;
        int i37;
        char cCharAt10;
        int i38;
        char cCharAt11;
        int i39;
        char cCharAt12;
        int i40;
        char cCharAt13;
        char cCharAt14;
        int i41 = 0;
        boolean z11 = v2Var.f() == ProtoSyntax.PROTO3;
        String strD = v2Var.d();
        int length = strD.length();
        int iCharAt5 = strD.charAt(0);
        if (iCharAt5 >= 55296) {
            int i42 = iCharAt5 & 8191;
            int i43 = 1;
            int i44 = 13;
            while (true) {
                i10 = i43 + 1;
                cCharAt14 = strD.charAt(i43);
                if (cCharAt14 < 55296) {
                    break;
                }
                i42 |= (cCharAt14 & 8191) << i44;
                i44 += 13;
                i43 = i10;
            }
            iCharAt5 = i42 | (cCharAt14 << i44);
        } else {
            i10 = 1;
        }
        int i45 = i10 + 1;
        int iCharAt6 = strD.charAt(i10);
        if (iCharAt6 >= 55296) {
            int i46 = iCharAt6 & 8191;
            int i47 = 13;
            while (true) {
                i40 = i45 + 1;
                cCharAt13 = strD.charAt(i45);
                if (cCharAt13 < 55296) {
                    break;
                }
                i46 |= (cCharAt13 & 8191) << i47;
                i47 += 13;
                i45 = i40;
            }
            iCharAt6 = i46 | (cCharAt13 << i47);
            i45 = i40;
        }
        if (iCharAt6 == 0) {
            i13 = 0;
            iCharAt = 0;
            iCharAt2 = 0;
            i11 = 0;
            iCharAt3 = 0;
            iArr = f22410x;
            i12 = 0;
        } else {
            int i48 = i45 + 1;
            int iCharAt7 = strD.charAt(i45);
            if (iCharAt7 >= 55296) {
                int i49 = iCharAt7 & 8191;
                int i50 = 13;
                while (true) {
                    i21 = i48 + 1;
                    cCharAt8 = strD.charAt(i48);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt8 & 8191) << i50;
                    i50 += 13;
                    i48 = i21;
                }
                iCharAt7 = i49 | (cCharAt8 << i50);
                i48 = i21;
            }
            int i51 = i48 + 1;
            int iCharAt8 = strD.charAt(i48);
            if (iCharAt8 >= 55296) {
                int i52 = iCharAt8 & 8191;
                int i53 = 13;
                while (true) {
                    i20 = i51 + 1;
                    cCharAt7 = strD.charAt(i51);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt7 & 8191) << i53;
                    i53 += 13;
                    i51 = i20;
                }
                iCharAt8 = i52 | (cCharAt7 << i53);
                i51 = i20;
            }
            int i54 = i51 + 1;
            int iCharAt9 = strD.charAt(i51);
            if (iCharAt9 >= 55296) {
                int i55 = iCharAt9 & 8191;
                int i56 = 13;
                while (true) {
                    i19 = i54 + 1;
                    cCharAt6 = strD.charAt(i54);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i55 |= (cCharAt6 & 8191) << i56;
                    i56 += 13;
                    i54 = i19;
                }
                iCharAt9 = i55 | (cCharAt6 << i56);
                i54 = i19;
            }
            int i57 = i54 + 1;
            iCharAt = strD.charAt(i54);
            if (iCharAt >= 55296) {
                int i58 = iCharAt & 8191;
                int i59 = 13;
                while (true) {
                    i18 = i57 + 1;
                    cCharAt5 = strD.charAt(i57);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i58 |= (cCharAt5 & 8191) << i59;
                    i59 += 13;
                    i57 = i18;
                }
                iCharAt = i58 | (cCharAt5 << i59);
                i57 = i18;
            }
            int i60 = i57 + 1;
            iCharAt2 = strD.charAt(i57);
            if (iCharAt2 >= 55296) {
                int i61 = iCharAt2 & 8191;
                int i62 = 13;
                while (true) {
                    i17 = i60 + 1;
                    cCharAt4 = strD.charAt(i60);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i61 |= (cCharAt4 & 8191) << i62;
                    i62 += 13;
                    i60 = i17;
                }
                iCharAt2 = i61 | (cCharAt4 << i62);
                i60 = i17;
            }
            int i63 = i60 + 1;
            int iCharAt10 = strD.charAt(i60);
            if (iCharAt10 >= 55296) {
                int i64 = iCharAt10 & 8191;
                int i65 = 13;
                while (true) {
                    i16 = i63 + 1;
                    cCharAt3 = strD.charAt(i63);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i64 |= (cCharAt3 & 8191) << i65;
                    i65 += 13;
                    i63 = i16;
                }
                iCharAt10 = i64 | (cCharAt3 << i65);
                i63 = i16;
            }
            int i66 = i63 + 1;
            int iCharAt11 = strD.charAt(i63);
            if (iCharAt11 >= 55296) {
                int i67 = iCharAt11 & 8191;
                int i68 = 13;
                while (true) {
                    i15 = i66 + 1;
                    cCharAt2 = strD.charAt(i66);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i67 |= (cCharAt2 & 8191) << i68;
                    i68 += 13;
                    i66 = i15;
                }
                iCharAt11 = i67 | (cCharAt2 << i68);
                i66 = i15;
            }
            int i69 = i66 + 1;
            iCharAt3 = strD.charAt(i66);
            if (iCharAt3 >= 55296) {
                int i70 = iCharAt3 & 8191;
                int i71 = i69;
                int i72 = 13;
                while (true) {
                    i14 = i71 + 1;
                    cCharAt = strD.charAt(i71);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i70 |= (cCharAt & 8191) << i72;
                    i72 += 13;
                    i71 = i14;
                }
                iCharAt3 = i70 | (cCharAt << i72);
                i69 = i14;
            }
            int[] iArr2 = new int[iCharAt3 + iCharAt10 + iCharAt11];
            i11 = (iCharAt7 * 2) + iCharAt8;
            i12 = iCharAt7;
            i45 = i69;
            int i73 = iCharAt10;
            iArr = iArr2;
            i41 = iCharAt9;
            i13 = i73;
        }
        Unsafe unsafe = f22412z;
        Object[] objArrC = v2Var.c();
        Class<?> cls = v2Var.b().getClass();
        int[] iArr3 = new int[iCharAt2 * 3];
        Object[] objArr = new Object[iCharAt2 * 2];
        int i74 = iCharAt3 + i13;
        int i75 = iCharAt3;
        int i76 = i74;
        int i77 = 0;
        int i78 = 0;
        while (i45 < length) {
            int i79 = i45 + 1;
            int iCharAt12 = strD.charAt(i45);
            int i80 = length;
            if (iCharAt12 >= 55296) {
                int i81 = iCharAt12 & 8191;
                int i82 = i79;
                int i83 = 13;
                while (true) {
                    i39 = i82 + 1;
                    cCharAt12 = strD.charAt(i82);
                    i22 = iCharAt3;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i81 |= (cCharAt12 & 8191) << i83;
                    i83 += 13;
                    i82 = i39;
                    iCharAt3 = i22;
                }
                iCharAt12 = i81 | (cCharAt12 << i83);
                i23 = i39;
            } else {
                i22 = iCharAt3;
                i23 = i79;
            }
            int i84 = i23 + 1;
            int iCharAt13 = strD.charAt(i23);
            if (iCharAt13 >= 55296) {
                int i85 = iCharAt13 & 8191;
                int i86 = i84;
                int i87 = 13;
                while (true) {
                    i38 = i86 + 1;
                    cCharAt11 = strD.charAt(i86);
                    z10 = z11;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i85 |= (cCharAt11 & 8191) << i87;
                    i87 += 13;
                    i86 = i38;
                    z11 = z10;
                }
                iCharAt13 = i85 | (cCharAt11 << i87);
                i24 = i38;
            } else {
                z10 = z11;
                i24 = i84;
            }
            int i88 = iCharAt13 & 255;
            int i89 = iCharAt;
            if ((iCharAt13 & 1024) != 0) {
                iArr[i77] = i78;
                i77++;
            }
            int i90 = i77;
            if (i88 >= 51) {
                int i91 = i24 + 1;
                int iCharAt14 = strD.charAt(i24);
                char c10 = 55296;
                if (iCharAt14 >= 55296) {
                    int i92 = iCharAt14 & 8191;
                    int i93 = 13;
                    while (true) {
                        i37 = i91 + 1;
                        cCharAt10 = strD.charAt(i91);
                        if (cCharAt10 < c10) {
                            break;
                        }
                        i92 |= (cCharAt10 & 8191) << i93;
                        i93 += 13;
                        i91 = i37;
                        c10 = 55296;
                    }
                    iCharAt14 = i92 | (cCharAt10 << i93);
                    i91 = i37;
                }
                int i94 = i88 - 51;
                int i95 = i91;
                if (i94 == 9 || i94 == 17) {
                    i34 = i11 + 1;
                    objArr[((i78 / 3) * 2) + 1] = objArrC[i11];
                } else {
                    if (i94 == 12 && (iCharAt5 & 1) == 1) {
                        i34 = i11 + 1;
                        objArr[((i78 / 3) * 2) + 1] = objArrC[i11];
                    }
                    i35 = iCharAt14 * 2;
                    obj2 = objArrC[i35];
                    if (obj2 instanceof Field) {
                        fieldO1 = (Field) obj2;
                    } else {
                        fieldO1 = o0(cls, (String) obj2);
                        objArrC[i35] = fieldO1;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldO1);
                    i36 = i35 + 1;
                    obj3 = objArrC[i36];
                    if (obj3 instanceof Field) {
                        fieldO2 = (Field) obj3;
                    } else {
                        fieldO2 = o0(cls, (String) obj3);
                        objArrC[i36] = fieldO2;
                    }
                    strD = strD;
                    cls = cls;
                    iCharAt5 = iCharAt5;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldO2);
                    i28 = iObjectFieldOffset3;
                    i25 = i88;
                    i45 = i95;
                    i27 = 0;
                }
                i11 = i34;
                i35 = iCharAt14 * 2;
                obj2 = objArrC[i35];
                if (obj2 instanceof Field) {
                    fieldO1 = (Field) obj2;
                } else {
                    fieldO1 = o0(cls, (String) obj2);
                    objArrC[i35] = fieldO1;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldO1);
                i36 = i35 + 1;
                obj3 = objArrC[i36];
                if (obj3 instanceof Field) {
                    fieldO2 = (Field) obj3;
                } else {
                    fieldO2 = o0(cls, (String) obj3);
                    objArrC[i36] = fieldO2;
                }
                strD = strD;
                cls = cls;
                iCharAt5 = iCharAt5;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldO2);
                i28 = iObjectFieldOffset4;
                i25 = i88;
                i45 = i95;
                i27 = 0;
            } else {
                int i96 = i11 + 1;
                Field fieldO3 = o0(cls, (String) objArrC[i11]);
                if (i88 == 9 || i88 == 17) {
                    objArr[((i78 / 3) * 2) + 1] = fieldO3.getType();
                } else {
                    if (i88 == 27 || i88 == 49) {
                        i33 = i96 + 1;
                        objArr[((i78 / 3) * 2) + 1] = objArrC[i96];
                    } else if (i88 == 12 || i88 == 30 || i88 == 44) {
                        if ((iCharAt5 & 1) == 1) {
                            i33 = i96 + 1;
                            objArr[((i78 / 3) * 2) + 1] = objArrC[i96];
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldO3);
                        if ((iCharAt5 & 1) == 1) {
                            i25 = i88;
                            if (i25 <= 17) {
                                i26 = i24 + 1;
                                iCharAt4 = strD.charAt(i24);
                                if (iCharAt4 >= 55296) {
                                    i30 = iCharAt4 & 8191;
                                    i31 = 13;
                                    while (true) {
                                        i32 = i26 + 1;
                                        cCharAt9 = strD.charAt(i26);
                                        if (cCharAt9 < 55296) {
                                            break;
                                        }
                                        i30 |= (cCharAt9 & 8191) << i31;
                                        i31 += 13;
                                        i26 = i32;
                                    }
                                    iCharAt4 = i30 | (cCharAt9 << i31);
                                    i26 = i32;
                                }
                                i29 = (i12 * 2) + (iCharAt4 / 32);
                                obj = objArrC[i29];
                                strD = strD;
                                if (obj instanceof Field) {
                                    fieldO0 = (Field) obj;
                                } else {
                                    fieldO0 = o0(cls, (String) obj);
                                    objArrC[i29] = fieldO0;
                                }
                                cls = cls;
                                iCharAt5 = iCharAt5;
                                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldO0);
                                i27 = iCharAt4 % 32;
                            }
                            if (i25 >= 18 && i25 <= 49) {
                                iArr[i76] = iObjectFieldOffset;
                                i76++;
                            }
                            int i97 = i26;
                            i11 = i96;
                            i28 = iObjectFieldOffset;
                            i45 = i97;
                        } else {
                            i25 = i88;
                        }
                        i26 = i24;
                        iObjectFieldOffset2 = 0;
                        i27 = 0;
                        if (i25 >= 18) {
                            iArr[i76] = iObjectFieldOffset;
                            i76++;
                        }
                        int i98 = i26;
                        i11 = i96;
                        i28 = iObjectFieldOffset;
                        i45 = i98;
                    } else if (i88 == 50) {
                        int i99 = i75 + 1;
                        iArr[i75] = i78;
                        int i100 = (i78 / 3) * 2;
                        int i101 = i96 + 1;
                        objArr[i100] = objArrC[i96];
                        if ((iCharAt13 & 2048) != 0) {
                            i96 = i101 + 1;
                            objArr[i100 + 1] = objArrC[i101];
                            i75 = i99;
                        } else {
                            i75 = i99;
                            i96 = i101;
                        }
                    }
                    i96 = i33;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldO3);
                    if ((iCharAt5 & 1) == 1) {
                        i25 = i88;
                        if (i25 <= 17) {
                            i26 = i24 + 1;
                            iCharAt4 = strD.charAt(i24);
                            if (iCharAt4 >= 55296) {
                                i30 = iCharAt4 & 8191;
                                i31 = 13;
                                while (true) {
                                    i32 = i26 + 1;
                                    cCharAt9 = strD.charAt(i26);
                                    if (cCharAt9 < 55296) {
                                        break;
                                        break;
                                    }
                                    i30 |= (cCharAt9 & 8191) << i31;
                                    i31 += 13;
                                    i26 = i32;
                                }
                                iCharAt4 = i30 | (cCharAt9 << i31);
                                i26 = i32;
                            }
                            i29 = (i12 * 2) + (iCharAt4 / 32);
                            obj = objArrC[i29];
                            strD = strD;
                            if (obj instanceof Field) {
                                fieldO0 = (Field) obj;
                            } else {
                                fieldO0 = o0(cls, (String) obj);
                                objArrC[i29] = fieldO0;
                            }
                            cls = cls;
                            iCharAt5 = iCharAt5;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldO0);
                            i27 = iCharAt4 % 32;
                        }
                        if (i25 >= 18) {
                            iArr[i76] = iObjectFieldOffset;
                            i76++;
                        }
                        int i910 = i26;
                        i11 = i96;
                        i28 = iObjectFieldOffset;
                        i45 = i910;
                    } else {
                        i25 = i88;
                    }
                    i26 = i24;
                    iObjectFieldOffset2 = 0;
                    i27 = 0;
                    if (i25 >= 18) {
                        iArr[i76] = iObjectFieldOffset;
                        i76++;
                    }
                    int i911 = i26;
                    i11 = i96;
                    i28 = iObjectFieldOffset;
                    i45 = i911;
                }
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldO3);
                if ((iCharAt5 & 1) == 1) {
                    i25 = i88;
                    if (i25 <= 17) {
                        i26 = i24 + 1;
                        iCharAt4 = strD.charAt(i24);
                        if (iCharAt4 >= 55296) {
                            i30 = iCharAt4 & 8191;
                            i31 = 13;
                            while (true) {
                                i32 = i26 + 1;
                                cCharAt9 = strD.charAt(i26);
                                if (cCharAt9 < 55296) {
                                    break;
                                    break;
                                }
                                i30 |= (cCharAt9 & 8191) << i31;
                                i31 += 13;
                                i26 = i32;
                            }
                            iCharAt4 = i30 | (cCharAt9 << i31);
                            i26 = i32;
                        }
                        i29 = (i12 * 2) + (iCharAt4 / 32);
                        obj = objArrC[i29];
                        strD = strD;
                        if (obj instanceof Field) {
                            fieldO0 = (Field) obj;
                        } else {
                            fieldO0 = o0(cls, (String) obj);
                            objArrC[i29] = fieldO0;
                        }
                        cls = cls;
                        iCharAt5 = iCharAt5;
                        iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldO0);
                        i27 = iCharAt4 % 32;
                    }
                    if (i25 >= 18) {
                        iArr[i76] = iObjectFieldOffset;
                        i76++;
                    }
                    int i912 = i26;
                    i11 = i96;
                    i28 = iObjectFieldOffset;
                    i45 = i912;
                } else {
                    i25 = i88;
                }
                i26 = i24;
                iObjectFieldOffset2 = 0;
                i27 = 0;
                if (i25 >= 18) {
                    iArr[i76] = iObjectFieldOffset;
                    i76++;
                }
                int i913 = i26;
                i11 = i96;
                i28 = iObjectFieldOffset;
                i45 = i913;
            }
            int i102 = i78 + 1;
            iArr3[i78] = iCharAt12;
            int i103 = i102 + 1;
            int i104 = iCharAt5;
            iArr3[i102] = ((iCharAt13 & 512) != 0 ? 536870912 : 0) | ((iCharAt13 & 256) != 0 ? 268435456 : 0) | (i25 << 20) | i28;
            int i105 = i103 + 1;
            iArr3[i103] = (i27 << 20) | iObjectFieldOffset2;
            iArr3 = iArr3;
            cls = cls;
            iCharAt5 = i104;
            iCharAt = i89;
            length = i80;
            iCharAt3 = i22;
            z11 = z10;
            i77 = i90;
            i78 = i105;
            strD = strD;
        }
        return new c2<>(iArr3, objArr, i41, iCharAt, v2Var.b(), z11, false, iArr, iCharAt3, i74, j2Var, o1Var, v3Var, q0Var, u1Var);
    }

    private int V(int i10) {
        return this.f22413a[i10];
    }

    private static long W(int i10) {
        return i10 & f22406t;
    }

    private static <T> boolean X(T t10, long j10) {
        return ((Boolean) z3.O(t10, j10)).booleanValue();
    }

    private static <T> double Y(T t10, long j10) {
        return ((Double) z3.O(t10, j10)).doubleValue();
    }

    private static <T> float Z(T t10, long j10) {
        return ((Float) z3.O(t10, j10)).floatValue();
    }

    private static <T> int a0(T t10, long j10) {
        return ((Integer) z3.O(t10, j10)).intValue();
    }

    private static <T> long b0(T t10, long j10) {
        return ((Long) z3.O(t10, j10)).longValue();
    }

    private <K, V> int c0(T t10, byte[] bArr, int i10, int i11, int i12, long j10, l.b bVar) throws IOException {
        Unsafe unsafe = f22412z;
        Object objU = u(i12);
        Object object = unsafe.getObject(t10, j10);
        if (this.f22429q.h(object)) {
            Object objF = this.f22429q.f(objU);
            this.f22429q.a(objF, object);
            unsafe.putObject(t10, j10, objF);
            object = objF;
        }
        return m(bArr, i10, i11, this.f22429q.b(objU), this.f22429q.e(object), bVar);
    }

    private int d0(T t10, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, l.b bVar) throws IOException {
        Unsafe unsafe = f22412z;
        long j11 = this.f22413a[i17 + 2] & f22406t;
        switch (i16) {
            case 51:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(t10, j10, Double.valueOf(l.d(bArr, i10)));
                int i18 = i10 + 8;
                unsafe.putInt(t10, j11, i13);
                return i18;
            case 52:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(t10, j10, Float.valueOf(l.l(bArr, i10)));
                int i19 = i10 + 4;
                unsafe.putInt(t10, j11, i13);
                return i19;
            case 53:
            case 54:
                if (i14 != 0) {
                    return i10;
                }
                int iL = l.L(bArr, i10, bVar);
                unsafe.putObject(t10, j10, Long.valueOf(bVar.f22503b));
                unsafe.putInt(t10, j11, i13);
                return iL;
            case 55:
            case 62:
                if (i14 != 0) {
                    return i10;
                }
                int I = l.I(bArr, i10, bVar);
                unsafe.putObject(t10, j10, Integer.valueOf(bVar.f22502a));
                unsafe.putInt(t10, j11, i13);
                return I;
            case 56:
            case 65:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(t10, j10, Long.valueOf(l.j(bArr, i10)));
                int i20 = i10 + 8;
                unsafe.putInt(t10, j11, i13);
                return i20;
            case 57:
            case 64:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(t10, j10, Integer.valueOf(l.h(bArr, i10)));
                int i21 = i10 + 4;
                unsafe.putInt(t10, j11, i13);
                return i21;
            case 58:
                if (i14 != 0) {
                    return i10;
                }
                int iL2 = l.L(bArr, i10, bVar);
                unsafe.putObject(t10, j10, Boolean.valueOf(bVar.f22503b != 0));
                unsafe.putInt(t10, j11, i13);
                return iL2;
            case 59:
                if (i14 != 2) {
                    return i10;
                }
                int I2 = l.I(bArr, i10, bVar);
                int i22 = bVar.f22502a;
                if (i22 == 0) {
                    unsafe.putObject(t10, j10, "");
                } else {
                    if ((i15 & 536870912) != 0 && !Utf8.u(bArr, I2, I2 + i22)) {
                        throw InvalidProtocolBufferException.d();
                    }
                    unsafe.putObject(t10, j10, new String(bArr, I2, i22, i1.f22456a));
                    I2 += i22;
                }
                unsafe.putInt(t10, j11, i13);
                return I2;
            case 60:
                if (i14 != 2) {
                    return i10;
                }
                int iP = l.p(v(i17), bArr, i10, i11, bVar);
                Object object = unsafe.getInt(t10, j11) == i13 ? unsafe.getObject(t10, j10) : null;
                if (object == null) {
                    unsafe.putObject(t10, j10, bVar.f22504c);
                } else {
                    unsafe.putObject(t10, j10, i1.v(object, bVar.f22504c));
                }
                unsafe.putInt(t10, j11, i13);
                return iP;
            case 61:
                if (i14 != 2) {
                    return i10;
                }
                int iB = l.b(bArr, i10, bVar);
                unsafe.putObject(t10, j10, bVar.f22504c);
                unsafe.putInt(t10, j11, i13);
                return iB;
            case 63:
                if (i14 != 0) {
                    return i10;
                }
                int I3 = l.I(bArr, i10, bVar);
                int i23 = bVar.f22502a;
                i1.e eVarT = t(i17);
                if (eVarT == null || eVarT.a(i23)) {
                    unsafe.putObject(t10, j10, Integer.valueOf(i23));
                    unsafe.putInt(t10, j11, i13);
                } else {
                    w(t10).r(i12, Long.valueOf(i23));
                }
                return I3;
            case 66:
                if (i14 != 0) {
                    return i10;
                }
                int I4 = l.I(bArr, i10, bVar);
                unsafe.putObject(t10, j10, Integer.valueOf(w.b(bVar.f22502a)));
                unsafe.putInt(t10, j11, i13);
                return I4;
            case 67:
                if (i14 != 0) {
                    return i10;
                }
                int iL3 = l.L(bArr, i10, bVar);
                unsafe.putObject(t10, j10, Long.valueOf(w.c(bVar.f22503b)));
                unsafe.putInt(t10, j11, i13);
                return iL3;
            case 68:
                if (i14 != 3) {
                    return i10;
                }
                int iN = l.n(v(i17), bArr, i10, i11, (i12 & (-8)) | 4, bVar);
                Object object2 = unsafe.getInt(t10, j11) == i13 ? unsafe.getObject(t10, j10) : null;
                if (object2 == null) {
                    unsafe.putObject(t10, j10, bVar.f22504c);
                } else {
                    unsafe.putObject(t10, j10, i1.v(object2, bVar.f22504c));
                }
                unsafe.putInt(t10, j11, i13);
                return iN;
            default:
                return i10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x022b, code lost:
    
        if (r0 != r15) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x022e, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01de, code lost:
    
        if (r0 != r15) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x020c, code lost:
    
        if (r0 != r15) goto L106;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x005c. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int f0(T r28, byte[] r29, int r30, int r31, androidx.datastore.preferences.protobuf.l.b r32) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.p001datastore.preferences.protobuf.c2.f0(java.lang.Object, byte[], int, int, androidx.datastore.preferences.protobuf.l$b):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int g0(T t10, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, long j11, l.b bVar) throws IOException {
        int iJ;
        Unsafe unsafe = f22412z;
        i1.k kVarD2 = (i1.k) unsafe.getObject(t10, j11);
        if (!kVarD2.l1()) {
            int size = kVarD2.size();
            kVarD2 = kVarD2.d2(size == 0 ? 10 : size * 2);
            unsafe.putObject(t10, j11, kVarD2);
        }
        switch (i16) {
            case 18:
            case 35:
                if (i14 == 2) {
                    return l.s(bArr, i10, kVarD2, bVar);
                }
                return i14 == 1 ? l.e(i12, bArr, i10, i11, kVarD2, bVar) : i10;
            case 19:
            case 36:
                if (i14 == 2) {
                    return l.v(bArr, i10, kVarD2, bVar);
                }
                return i14 == 5 ? l.m(i12, bArr, i10, i11, kVarD2, bVar) : i10;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i14 == 2) {
                    return l.z(bArr, i10, kVarD2, bVar);
                }
                return i14 == 0 ? l.M(i12, bArr, i10, i11, kVarD2, bVar) : i10;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i14 == 2) {
                    return l.y(bArr, i10, kVarD2, bVar);
                }
                return i14 == 0 ? l.J(i12, bArr, i10, i11, kVarD2, bVar) : i10;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i14 == 2) {
                    return l.u(bArr, i10, kVarD2, bVar);
                }
                return i14 == 1 ? l.k(i12, bArr, i10, i11, kVarD2, bVar) : i10;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i14 == 2) {
                    return l.t(bArr, i10, kVarD2, bVar);
                }
                return i14 == 5 ? l.i(i12, bArr, i10, i11, kVarD2, bVar) : i10;
            case 25:
            case 42:
                if (i14 == 2) {
                    return l.r(bArr, i10, kVarD2, bVar);
                }
                return i14 == 0 ? l.a(i12, bArr, i10, i11, kVarD2, bVar) : i10;
            case 26:
                if (i14 == 2) {
                    return (j10 & 536870912) == 0 ? l.D(i12, bArr, i10, i11, kVarD2, bVar) : l.E(i12, bArr, i10, i11, kVarD2, bVar);
                }
                return i10;
            case 27:
                return i14 == 2 ? l.q(v(i15), i12, bArr, i10, i11, kVarD2, bVar) : i10;
            case 28:
                return i14 == 2 ? l.c(i12, bArr, i10, i11, kVarD2, bVar) : i10;
            case 30:
            case 44:
                if (i14 == 2) {
                    iJ = l.y(bArr, i10, kVarD2, bVar);
                } else {
                    if (i14 != 0) {
                        return i10;
                    }
                    iJ = l.J(i12, bArr, i10, i11, kVarD2, bVar);
                }
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t10;
                w3 w3Var = generatedMessageLite.unknownFields;
                if (w3Var == w3.e()) {
                    w3Var = null;
                }
                w3 w3Var2 = (w3) z2.C(i13, kVarD2, t(i15), w3Var, this.f22427o);
                if (w3Var2 != null) {
                    generatedMessageLite.unknownFields = w3Var2;
                }
                return iJ;
            case 33:
            case 47:
                if (i14 == 2) {
                    return l.w(bArr, i10, kVarD2, bVar);
                }
                return i14 == 0 ? l.A(i12, bArr, i10, i11, kVarD2, bVar) : i10;
            case 34:
            case 48:
                if (i14 == 2) {
                    return l.x(bArr, i10, kVarD2, bVar);
                }
                return i14 == 0 ? l.B(i12, bArr, i10, i11, kVarD2, bVar) : i10;
            case 49:
                return i14 == 3 ? l.o(v(i15), i12, bArr, i10, i11, kVarD2, bVar) : i10;
            default:
                return i10;
        }
    }

    private int h0(int i10) {
        if (i10 < this.f22415c || i10 > this.f22416d) {
            return -1;
        }
        return r0(i10, 0);
    }

    private int i0(int i10, int i11) {
        if (i10 < this.f22415c || i10 > this.f22416d) {
            return -1;
        }
        return r0(i10, i11);
    }

    private int j0(int i10) {
        return this.f22413a[i10 + 2];
    }

    private boolean k(T t10, T t11, int i10) {
        return D(t10, i10) == D(t11, i10);
    }

    private <E> void k0(Object obj, long j10, w2 w2Var, x2<E> x2Var, p0 p0Var) throws IOException {
        w2Var.P(this.f22426n.e(obj, j10), x2Var, p0Var);
    }

    private static <T> boolean l(T t10, long j10) {
        return z3.u(t10, j10);
    }

    private <E> void l0(Object obj, int i10, w2 w2Var, x2<E> x2Var, p0 p0Var) throws IOException {
        w2Var.G(this.f22426n.e(obj, W(i10)), x2Var, p0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <K, V> int m(byte[] bArr, int i10, int i11, t1.b<K, V> bVar, Map<K, V> map, l.b bVar2) throws IOException {
        int iH;
        int I = l.I(bArr, i10, bVar2);
        int i12 = bVar2.f22502a;
        if (i12 < 0 || i12 > i11 - I) {
            throw InvalidProtocolBufferException.l();
        }
        int i13 = I + i12;
        Object obj = bVar.f22638b;
        Object obj2 = bVar.f22640d;
        while (I < i13) {
            int i14 = I + 1;
            int i15 = bArr[I];
            if (i15 < 0) {
                iH = l.H(i15, bArr, i14, bVar2);
                i15 = bVar2.f22502a;
            } else {
                iH = i14;
            }
            int i16 = i15 >>> 3;
            int i17 = i15 & 7;
            if (i16 != 1) {
                if (i16 == 2 && i17 == bVar.f22639c.getWireType()) {
                    I = n(bArr, iH, i11, bVar.f22639c, bVar.f22640d.getClass(), bVar2);
                    obj2 = bVar2.f22504c;
                } else {
                    I = l.N(i15, bArr, iH, i11, bVar2);
                }
            } else if (i17 == bVar.f22637a.getWireType()) {
                I = n(bArr, iH, i11, bVar.f22637a, null, bVar2);
                obj = bVar2.f22504c;
            } else {
                I = l.N(i15, bArr, iH, i11, bVar2);
            }
        }
        if (I != i13) {
            throw InvalidProtocolBufferException.h();
        }
        map.put(obj, obj2);
        return i13;
    }

    private void m0(Object obj, int i10, w2 w2Var) throws IOException {
        if (C(i10)) {
            z3.q0(obj, W(i10), w2Var.R());
        } else if (this.f22419g) {
            z3.q0(obj, W(i10), w2Var.O());
        } else {
            z3.q0(obj, W(i10), w2Var.g());
        }
    }

    private int n(byte[] bArr, int i10, int i11, WireFormat.FieldType fieldType, Class<?> cls, l.b bVar) throws IOException {
        switch (a.f22430a[fieldType.ordinal()]) {
            case 1:
                int iL = l.L(bArr, i10, bVar);
                bVar.f22504c = Boolean.valueOf(bVar.f22503b != 0);
                return iL;
            case 2:
                return l.b(bArr, i10, bVar);
            case 3:
                bVar.f22504c = Double.valueOf(l.d(bArr, i10));
                return i10 + 8;
            case 4:
            case 5:
                bVar.f22504c = Integer.valueOf(l.h(bArr, i10));
                return i10 + 4;
            case 6:
            case 7:
                bVar.f22504c = Long.valueOf(l.j(bArr, i10));
                return i10 + 8;
            case 8:
                bVar.f22504c = Float.valueOf(l.l(bArr, i10));
                return i10 + 4;
            case 9:
            case 10:
            case 11:
                int I = l.I(bArr, i10, bVar);
                bVar.f22504c = Integer.valueOf(bVar.f22502a);
                return I;
            case 12:
            case 13:
                int iL2 = l.L(bArr, i10, bVar);
                bVar.f22504c = Long.valueOf(bVar.f22503b);
                return iL2;
            case 14:
                return l.p(r2.a().i(cls), bArr, i10, i11, bVar);
            case 15:
                int I2 = l.I(bArr, i10, bVar);
                bVar.f22504c = Integer.valueOf(w.b(bVar.f22502a));
                return I2;
            case 16:
                int iL3 = l.L(bArr, i10, bVar);
                bVar.f22504c = Long.valueOf(w.c(bVar.f22503b));
                return iL3;
            case 17:
                return l.F(bArr, i10, bVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private void n0(Object obj, int i10, w2 w2Var) throws IOException {
        if (C(i10)) {
            w2Var.E(this.f22426n.e(obj, W(i10)));
        } else {
            w2Var.q(this.f22426n.e(obj, W(i10)));
        }
    }

    private static <T> double o(T t10, long j10) {
        return z3.D(t10, j10);
    }

    private static Field o0(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private boolean p(T t10, T t11, int i10) {
        int iU0 = u0(i10);
        long jW = W(iU0);
        switch (t0(iU0)) {
            case 0:
                return k(t10, t11, i10) && Double.doubleToLongBits(z3.D(t10, jW)) == Double.doubleToLongBits(z3.D(t11, jW));
            case 1:
                return k(t10, t11, i10) && Float.floatToIntBits(z3.F(t10, jW)) == Float.floatToIntBits(z3.F(t11, jW));
            case 2:
                return k(t10, t11, i10) && z3.L(t10, jW) == z3.L(t11, jW);
            case 3:
                return k(t10, t11, i10) && z3.L(t10, jW) == z3.L(t11, jW);
            case 4:
                return k(t10, t11, i10) && z3.I(t10, jW) == z3.I(t11, jW);
            case 5:
                return k(t10, t11, i10) && z3.L(t10, jW) == z3.L(t11, jW);
            case 6:
                return k(t10, t11, i10) && z3.I(t10, jW) == z3.I(t11, jW);
            case 7:
                return k(t10, t11, i10) && z3.u(t10, jW) == z3.u(t11, jW);
            case 8:
                return k(t10, t11, i10) && z2.N(z3.O(t10, jW), z3.O(t11, jW));
            case 9:
                return k(t10, t11, i10) && z2.N(z3.O(t10, jW), z3.O(t11, jW));
            case 10:
                return k(t10, t11, i10) && z2.N(z3.O(t10, jW), z3.O(t11, jW));
            case 11:
                return k(t10, t11, i10) && z3.I(t10, jW) == z3.I(t11, jW);
            case 12:
                return k(t10, t11, i10) && z3.I(t10, jW) == z3.I(t11, jW);
            case 13:
                return k(t10, t11, i10) && z3.I(t10, jW) == z3.I(t11, jW);
            case 14:
                return k(t10, t11, i10) && z3.L(t10, jW) == z3.L(t11, jW);
            case 15:
                return k(t10, t11, i10) && z3.I(t10, jW) == z3.I(t11, jW);
            case 16:
                return k(t10, t11, i10) && z3.L(t10, jW) == z3.L(t11, jW);
            case 17:
                return k(t10, t11, i10) && z2.N(z3.O(t10, jW), z3.O(t11, jW));
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                return z2.N(z3.O(t10, jW), z3.O(t11, jW));
            case 50:
                return z2.N(z3.O(t10, jW), z3.O(t11, jW));
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                return I(t10, t11, i10) && z2.N(z3.O(t10, jW), z3.O(t11, jW));
            default:
                return true;
        }
    }

    private void p0(T t10, int i10) {
        if (this.f22420h) {
            return;
        }
        int iJ0 = j0(i10);
        long j10 = iJ0 & f22406t;
        z3.l0(t10, j10, z3.I(t10, j10) | (1 << (iJ0 >>> 20)));
    }

    private final <UT, UB> UB q(Object obj, int i10, UB ub2, v3<UT, UB> v3Var) {
        i1.e eVarT;
        int iV = V(i10);
        Object objO = z3.O(obj, W(u0(i10)));
        return (objO == null || (eVarT = t(i10)) == null) ? ub2 : (UB) r(i10, iV, this.f22429q.e(objO), eVarT, ub2, v3Var);
    }

    private void q0(T t10, int i10, int i11) {
        z3.l0(t10, j0(i11) & f22406t, i10);
    }

    private final <K, V, UT, UB> UB r(int i10, int i11, Map<K, V> map, i1.e eVar, UB ub2, v3<UT, UB> v3Var) {
        t1.b<?, ?> bVarB = this.f22429q.b(u(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!eVar.a(((Integer) next.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = v3Var.n();
                }
                ByteString.g gVarJ = ByteString.J(t1.b(bVarB, next.getKey(), next.getValue()));
                try {
                    t1.l(gVarJ.b(), bVarB, next.getKey(), next.getValue());
                    v3Var.d(ub2, i11, gVarJ.a());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return ub2;
    }

    private int r0(int i10, int i11) {
        int length = (this.f22413a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int iV = V(i13);
            if (i10 == iV) {
                return i13;
            }
            if (i10 < iV) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private static <T> float s(T t10, long j10) {
        return z3.F(t10, j10);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0081  */
    /* JADX WARN: Code duplicated, block: B:20:0x0084  */
    /* JADX WARN: Code duplicated, block: B:23:0x008b  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:? A[RETURN, SYNTHETIC] */
    private static void s0(t0 t0Var, int[] iArr, int i10, boolean z10, Object[] objArr) {
        int iW;
        int iW2;
        int iId;
        int iNumberOfTrailingZeros;
        int i11;
        int i12;
        int i13;
        Class<?> clsR;
        int i14;
        m2 m2VarS = t0Var.s();
        if (m2VarS == null) {
            FieldType fieldTypeY = t0Var.y();
            iW = (int) z3.W(t0Var.n());
            int iId2 = fieldTypeY.id();
            if (!z10 && !fieldTypeY.isList() && !fieldTypeY.isMap()) {
                int iW3 = (int) z3.W(t0Var.w());
                iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(t0Var.x());
                iId = iId2;
                i11 = iW;
                i12 = iW3;
            } else if (t0Var.l() == null) {
                iNumberOfTrailingZeros = 0;
                iId = iId2;
                i11 = iW;
                i12 = 0;
            } else {
                iW2 = (int) z3.W(t0Var.l());
                iId = iId2;
            }
            iArr[i10] = t0Var.o();
            int i15 = i10 + 1;
            if (t0Var.z()) {
                i13 = 536870912;
            } else {
                i13 = 0;
            }
            iArr[i15] = (iId << 20) | (t0Var.C() ? 268435456 : 0) | i13 | i11;
            iArr[i10 + 2] = (iNumberOfTrailingZeros << 20) | i12;
            clsR = t0Var.r();
            if (t0Var.q() != null) {
                if (clsR != null) {
                    objArr[((i10 / 3) * 2) + 1] = clsR;
                    return;
                } else {
                    if (t0Var.m() != null) {
                        objArr[((i10 / 3) * 2) + 1] = t0Var.m();
                        return;
                    }
                    return;
                }
            }
            i14 = (i10 / 3) * 2;
            objArr[i14] = t0Var.q();
            if (clsR != null) {
                objArr[i14 + 1] = clsR;
            } else if (t0Var.m() != null) {
                objArr[i14 + 1] = t0Var.m();
            }
        }
        iId = t0Var.y().id() + 51;
        iW = (int) z3.W(m2VarS.c());
        iW2 = (int) z3.W(m2VarS.a());
        i11 = iW;
        i12 = iW2;
        iNumberOfTrailingZeros = 0;
        iArr[i10] = t0Var.o();
        int i16 = i10 + 1;
        if (t0Var.z()) {
            i13 = 536870912;
        } else {
            i13 = 0;
        }
        iArr[i16] = (iId << 20) | (t0Var.C() ? 268435456 : 0) | i13 | i11;
        iArr[i10 + 2] = (iNumberOfTrailingZeros << 20) | i12;
        clsR = t0Var.r();
        if (t0Var.q() != null) {
            if (clsR != null) {
                objArr[((i10 / 3) * 2) + 1] = clsR;
                return;
            } else {
                if (t0Var.m() != null) {
                    objArr[((i10 / 3) * 2) + 1] = t0Var.m();
                    return;
                }
                return;
            }
        }
        i14 = (i10 / 3) * 2;
        objArr[i14] = t0Var.q();
        if (clsR != null) {
            objArr[i14 + 1] = clsR;
        } else if (t0Var.m() != null) {
            objArr[i14 + 1] = t0Var.m();
        }
    }

    private i1.e t(int i10) {
        return (i1.e) this.f22414b[((i10 / 3) * 2) + 1];
    }

    private static int t0(int i10) {
        return (i10 & f22407u) >>> 20;
    }

    private Object u(int i10) {
        return this.f22414b[(i10 / 3) * 2];
    }

    private int u0(int i10) {
        return this.f22413a[i10 + 1];
    }

    private x2 v(int i10) {
        int i11 = (i10 / 3) * 2;
        x2 x2Var = (x2) this.f22414b[i11];
        if (x2Var != null) {
            return x2Var;
        }
        x2<T> x2VarI = r2.a().i((Class) this.f22414b[i11 + 1]);
        this.f22414b[i11] = x2VarI;
        return x2VarI;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    private void v0(T t10, Writer writer) throws IOException {
        Iterator itH;
        Map.Entry<?, ?> entry;
        Map.Entry<?, ?> entry2;
        int i10;
        if (this.f22418f) {
            y0<T> y0VarC = this.f22428p.c(t10);
            if (y0VarC.C()) {
                itH = null;
                entry = null;
            } else {
                itH = y0VarC.H();
                entry = (Map.Entry) itH.next();
            }
        } else {
            itH = null;
            entry = null;
        }
        int i11 = -1;
        int length = this.f22413a.length;
        Unsafe unsafe = f22412z;
        int i12 = 0;
        int i13 = 0;
        while (i12 < length) {
            int iU0 = u0(i12);
            int iV = V(i12);
            int iT0 = t0(iU0);
            if (this.f22420h || iT0 > 17) {
                entry2 = entry;
                i10 = 0;
            } else {
                int i14 = this.f22413a[i12 + 2];
                int i15 = i14 & f22406t;
                Map.Entry<?, ?> entry3 = entry;
                if (i15 != i11) {
                    i13 = unsafe.getInt(t10, i15);
                    i11 = i15;
                }
                i10 = 1 << (i14 >>> 20);
                entry2 = entry3;
            }
            while (entry2 != null && this.f22428p.a(entry2) <= iV) {
                this.f22428p.j(writer, entry2);
                entry2 = itH.hasNext() ? (Map.Entry) itH.next() : null;
            }
            Map.Entry<?, ?> entry4 = entry2;
            int i16 = i11;
            long jW = W(iU0);
            switch (iT0) {
                case 0:
                    if ((i10 & i13) != 0) {
                        writer.G(iV, o(t10, jW));
                        continue;
                    }
                    i12 += 3;
                    i11 = i16;
                    entry = entry4;
                    break;
                case 1:
                    if ((i10 & i13) != 0) {
                        writer.P(iV, s(t10, jW));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = i16;
                    entry = entry4;
                    break;
                case 2:
                    if ((i10 & i13) != 0) {
                        writer.L(iV, unsafe.getLong(t10, jW));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = i16;
                    entry = entry4;
                    break;
                case 3:
                    if ((i10 & i13) != 0) {
                        writer.f(iV, unsafe.getLong(t10, jW));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = i16;
                    entry = entry4;
                    break;
                case 4:
                    if ((i10 & i13) != 0) {
                        writer.h(iV, unsafe.getInt(t10, jW));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = i16;
                    entry = entry4;
                    break;
                case 5:
                    if ((i10 & i13) != 0) {
                        writer.q(iV, unsafe.getLong(t10, jW));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = i16;
                    entry = entry4;
                    break;
                case 6:
                    if ((i10 & i13) != 0) {
                        writer.c(iV, unsafe.getInt(t10, jW));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = i16;
                    entry = entry4;
                    break;
                case 7:
                    if ((i10 & i13) != 0) {
                        writer.s(iV, l(t10, jW));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = i16;
                    entry = entry4;
                    break;
                case 8:
                    if ((i10 & i13) != 0) {
                        z0(iV, unsafe.getObject(t10, jW), writer);
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = i16;
                    entry = entry4;
                    break;
                case 9:
                    if ((i10 & i13) != 0) {
                        writer.k(iV, unsafe.getObject(t10, jW), v(i12));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = i16;
                    entry = entry4;
                    break;
                case 10:
                    if ((i10 & i13) != 0) {
                        writer.i(iV, (ByteString) unsafe.getObject(t10, jW));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = i16;
                    entry = entry4;
                    break;
                case 11:
                    if ((i10 & i13) != 0) {
                        writer.o(iV, unsafe.getInt(t10, jW));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = i16;
                    entry = entry4;
                    break;
                case 12:
                    if ((i10 & i13) != 0) {
                        writer.Q(iV, unsafe.getInt(t10, jW));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = i16;
                    entry = entry4;
                    break;
                case 13:
                    if ((i10 & i13) != 0) {
                        writer.t(iV, unsafe.getInt(t10, jW));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = i16;
                    entry = entry4;
                    break;
                case 14:
                    if ((i10 & i13) != 0) {
                        writer.C(iV, unsafe.getLong(t10, jW));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = i16;
                    entry = entry4;
                    break;
                case 15:
                    if ((i10 & i13) != 0) {
                        writer.S(iV, unsafe.getInt(t10, jW));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = i16;
                    entry = entry4;
                    break;
                case 16:
                    if ((i10 & i13) != 0) {
                        writer.m(iV, unsafe.getLong(t10, jW));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = i16;
                    entry = entry4;
                    break;
                case 17:
                    if ((i10 & i13) != 0) {
                        writer.F(iV, unsafe.getObject(t10, jW), v(i12));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = i16;
                    entry = entry4;
                    break;
                case 18:
                    z2.Y(V(i12), (List) unsafe.getObject(t10, jW), writer, false);
                    continue;
                    i12 += 3;
                    i11 = i16;
                    entry = entry4;
                    break;
                case 19:
                    z2.g0(V(i12), (List) unsafe.getObject(t10, jW), writer, false);
                    continue;
                    i12 += 3;
                    i11 = i16;
                    entry = entry4;
                    break;
                case 20:
                    z2.m0(V(i12), (List) unsafe.getObject(t10, jW), writer, false);
                    continue;
                    i12 += 3;
                    i11 = i16;
                    entry = entry4;
                    break;
                case 21:
                    z2.F0(V(i12), (List) unsafe.getObject(t10, jW), writer, false);
                    continue;
                    i12 += 3;
                    i11 = i16;
                    entry = entry4;
                    break;
                case 22:
                    z2.k0(V(i12), (List) unsafe.getObject(t10, jW), writer, false);
                    continue;
                    i12 += 3;
                    i11 = i16;
                    entry = entry4;
                    break;
                case 23:
                    z2.e0(V(i12), (List) unsafe.getObject(t10, jW), writer, false);
                    continue;
                    i12 += 3;
                    i11 = i16;
                    entry = entry4;
                    break;
                case 24:
                    z2.c0(V(i12), (List) unsafe.getObject(t10, jW), writer, false);
                    continue;
                    i12 += 3;
                    i11 = i16;
                    entry = entry4;
                    break;
                case 25:
                    z2.U(V(i12), (List) unsafe.getObject(t10, jW), writer, false);
                    continue;
                    i12 += 3;
                    i11 = i16;
                    entry = entry4;
                    break;
                case 26:
                    z2.B0(V(i12), (List) unsafe.getObject(t10, jW), writer);
                    break;
                case 27:
                    z2.q0(V(i12), (List) unsafe.getObject(t10, jW), writer, v(i12));
                    break;
                case 28:
                    z2.W(V(i12), (List) unsafe.getObject(t10, jW), writer);
                    break;
                case 29:
                    z2.D0(V(i12), (List) unsafe.getObject(t10, jW), writer, false);
                    continue;
                    i12 += 3;
                    i11 = i16;
                    entry = entry4;
                    break;
                case 30:
                    z2.a0(V(i12), (List) unsafe.getObject(t10, jW), writer, false);
                    continue;
                    i12 += 3;
                    i11 = i16;
                    entry = entry4;
                    break;
                case 31:
                    z2.s0(V(i12), (List) unsafe.getObject(t10, jW), writer, false);
                    continue;
                    i12 += 3;
                    i11 = i16;
                    entry = entry4;
                    break;
                case 32:
                    z2.u0(V(i12), (List) unsafe.getObject(t10, jW), writer, false);
                    continue;
                    i12 += 3;
                    i11 = i16;
                    entry = entry4;
                    break;
                case 33:
                    z2.w0(V(i12), (List) unsafe.getObject(t10, jW), writer, false);
                    continue;
                    i12 += 3;
                    i11 = i16;
                    entry = entry4;
                    break;
                case 34:
                    z2.y0(V(i12), (List) unsafe.getObject(t10, jW), writer, false);
                    continue;
                    i12 += 3;
                    i11 = i16;
                    entry = entry4;
                    break;
                case 35:
                    z2.Y(V(i12), (List) unsafe.getObject(t10, jW), writer, true);
                    break;
                case 36:
                    z2.g0(V(i12), (List) unsafe.getObject(t10, jW), writer, true);
                    break;
                case 37:
                    z2.m0(V(i12), (List) unsafe.getObject(t10, jW), writer, true);
                    break;
                case 38:
                    z2.F0(V(i12), (List) unsafe.getObject(t10, jW), writer, true);
                    break;
                case 39:
                    z2.k0(V(i12), (List) unsafe.getObject(t10, jW), writer, true);
                    break;
                case 40:
                    z2.e0(V(i12), (List) unsafe.getObject(t10, jW), writer, true);
                    break;
                case 41:
                    z2.c0(V(i12), (List) unsafe.getObject(t10, jW), writer, true);
                    break;
                case 42:
                    z2.U(V(i12), (List) unsafe.getObject(t10, jW), writer, true);
                    break;
                case 43:
                    z2.D0(V(i12), (List) unsafe.getObject(t10, jW), writer, true);
                    break;
                case 44:
                    z2.a0(V(i12), (List) unsafe.getObject(t10, jW), writer, true);
                    break;
                case 45:
                    z2.s0(V(i12), (List) unsafe.getObject(t10, jW), writer, true);
                    break;
                case 46:
                    z2.u0(V(i12), (List) unsafe.getObject(t10, jW), writer, true);
                    break;
                case 47:
                    z2.w0(V(i12), (List) unsafe.getObject(t10, jW), writer, true);
                    break;
                case 48:
                    z2.y0(V(i12), (List) unsafe.getObject(t10, jW), writer, true);
                    break;
                case 49:
                    z2.i0(V(i12), (List) unsafe.getObject(t10, jW), writer, v(i12));
                    break;
                case 50:
                    y0(writer, iV, unsafe.getObject(t10, jW), i12);
                    break;
                case 51:
                    if (J(t10, iV, i12)) {
                        writer.G(iV, Y(t10, jW));
                    }
                    break;
                case 52:
                    if (J(t10, iV, i12)) {
                        writer.P(iV, Z(t10, jW));
                    }
                    break;
                case 53:
                    if (J(t10, iV, i12)) {
                        writer.L(iV, b0(t10, jW));
                    }
                    break;
                case 54:
                    if (J(t10, iV, i12)) {
                        writer.f(iV, b0(t10, jW));
                    }
                    break;
                case 55:
                    if (J(t10, iV, i12)) {
                        writer.h(iV, a0(t10, jW));
                    }
                    break;
                case 56:
                    if (J(t10, iV, i12)) {
                        writer.q(iV, b0(t10, jW));
                    }
                    break;
                case 57:
                    if (J(t10, iV, i12)) {
                        writer.c(iV, a0(t10, jW));
                    }
                    break;
                case 58:
                    if (J(t10, iV, i12)) {
                        writer.s(iV, X(t10, jW));
                    }
                    break;
                case 59:
                    if (J(t10, iV, i12)) {
                        z0(iV, unsafe.getObject(t10, jW), writer);
                    }
                    break;
                case 60:
                    if (J(t10, iV, i12)) {
                        writer.k(iV, unsafe.getObject(t10, jW), v(i12));
                    }
                    break;
                case 61:
                    if (J(t10, iV, i12)) {
                        writer.i(iV, (ByteString) unsafe.getObject(t10, jW));
                    }
                    break;
                case 62:
                    if (J(t10, iV, i12)) {
                        writer.o(iV, a0(t10, jW));
                    }
                    break;
                case 63:
                    if (J(t10, iV, i12)) {
                        writer.Q(iV, a0(t10, jW));
                    }
                    break;
                case 64:
                    if (J(t10, iV, i12)) {
                        writer.t(iV, a0(t10, jW));
                    }
                    break;
                case 65:
                    if (J(t10, iV, i12)) {
                        writer.C(iV, b0(t10, jW));
                    }
                    break;
                case 66:
                    if (J(t10, iV, i12)) {
                        writer.S(iV, a0(t10, jW));
                    }
                    break;
                case 67:
                    if (J(t10, iV, i12)) {
                        writer.m(iV, b0(t10, jW));
                    }
                    break;
                case 68:
                    if (J(t10, iV, i12)) {
                        writer.F(iV, unsafe.getObject(t10, jW), v(i12));
                    }
                    break;
            }
            i12 += 3;
            i11 = i16;
            entry = entry4;
        }
        while (entry != null) {
            this.f22428p.j(writer, entry);
            entry = itH.hasNext() ? (Map.Entry) itH.next() : null;
        }
        A0(this.f22427o, t10, writer);
    }

    static w3 w(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        w3 w3Var = generatedMessageLite.unknownFields;
        if (w3Var != w3.e()) {
            return w3Var;
        }
        w3 w3VarP = w3.p();
        generatedMessageLite.unknownFields = w3VarP;
        return w3VarP;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    private void w0(T t10, Writer writer) throws IOException {
        Iterator itH;
        Map.Entry<?, ?> entry;
        if (this.f22418f) {
            y0<T> y0VarC = this.f22428p.c(t10);
            if (y0VarC.C()) {
                itH = null;
                entry = null;
            } else {
                itH = y0VarC.H();
                entry = (Map.Entry) itH.next();
            }
        } else {
            itH = null;
            entry = null;
        }
        int length = this.f22413a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int iU0 = u0(i10);
            int iV = V(i10);
            while (entry != null && this.f22428p.a(entry) <= iV) {
                this.f22428p.j(writer, entry);
                entry = itH.hasNext() ? (Map.Entry) itH.next() : null;
            }
            switch (t0(iU0)) {
                case 0:
                    if (D(t10, i10)) {
                        writer.G(iV, o(t10, W(iU0)));
                    }
                    break;
                case 1:
                    if (D(t10, i10)) {
                        writer.P(iV, s(t10, W(iU0)));
                    }
                    break;
                case 2:
                    if (D(t10, i10)) {
                        writer.L(iV, M(t10, W(iU0)));
                    }
                    break;
                case 3:
                    if (D(t10, i10)) {
                        writer.f(iV, M(t10, W(iU0)));
                    }
                    break;
                case 4:
                    if (D(t10, i10)) {
                        writer.h(iV, B(t10, W(iU0)));
                    }
                    break;
                case 5:
                    if (D(t10, i10)) {
                        writer.q(iV, M(t10, W(iU0)));
                    }
                    break;
                case 6:
                    if (D(t10, i10)) {
                        writer.c(iV, B(t10, W(iU0)));
                    }
                    break;
                case 7:
                    if (D(t10, i10)) {
                        writer.s(iV, l(t10, W(iU0)));
                    }
                    break;
                case 8:
                    if (D(t10, i10)) {
                        z0(iV, z3.O(t10, W(iU0)), writer);
                    }
                    break;
                case 9:
                    if (D(t10, i10)) {
                        writer.k(iV, z3.O(t10, W(iU0)), v(i10));
                    }
                    break;
                case 10:
                    if (D(t10, i10)) {
                        writer.i(iV, (ByteString) z3.O(t10, W(iU0)));
                    }
                    break;
                case 11:
                    if (D(t10, i10)) {
                        writer.o(iV, B(t10, W(iU0)));
                    }
                    break;
                case 12:
                    if (D(t10, i10)) {
                        writer.Q(iV, B(t10, W(iU0)));
                    }
                    break;
                case 13:
                    if (D(t10, i10)) {
                        writer.t(iV, B(t10, W(iU0)));
                    }
                    break;
                case 14:
                    if (D(t10, i10)) {
                        writer.C(iV, M(t10, W(iU0)));
                    }
                    break;
                case 15:
                    if (D(t10, i10)) {
                        writer.S(iV, B(t10, W(iU0)));
                    }
                    break;
                case 16:
                    if (D(t10, i10)) {
                        writer.m(iV, M(t10, W(iU0)));
                    }
                    break;
                case 17:
                    if (D(t10, i10)) {
                        writer.F(iV, z3.O(t10, W(iU0)), v(i10));
                    }
                    break;
                case 18:
                    z2.Y(V(i10), (List) z3.O(t10, W(iU0)), writer, false);
                    break;
                case 19:
                    z2.g0(V(i10), (List) z3.O(t10, W(iU0)), writer, false);
                    break;
                case 20:
                    z2.m0(V(i10), (List) z3.O(t10, W(iU0)), writer, false);
                    break;
                case 21:
                    z2.F0(V(i10), (List) z3.O(t10, W(iU0)), writer, false);
                    break;
                case 22:
                    z2.k0(V(i10), (List) z3.O(t10, W(iU0)), writer, false);
                    break;
                case 23:
                    z2.e0(V(i10), (List) z3.O(t10, W(iU0)), writer, false);
                    break;
                case 24:
                    z2.c0(V(i10), (List) z3.O(t10, W(iU0)), writer, false);
                    break;
                case 25:
                    z2.U(V(i10), (List) z3.O(t10, W(iU0)), writer, false);
                    break;
                case 26:
                    z2.B0(V(i10), (List) z3.O(t10, W(iU0)), writer);
                    break;
                case 27:
                    z2.q0(V(i10), (List) z3.O(t10, W(iU0)), writer, v(i10));
                    break;
                case 28:
                    z2.W(V(i10), (List) z3.O(t10, W(iU0)), writer);
                    break;
                case 29:
                    z2.D0(V(i10), (List) z3.O(t10, W(iU0)), writer, false);
                    break;
                case 30:
                    z2.a0(V(i10), (List) z3.O(t10, W(iU0)), writer, false);
                    break;
                case 31:
                    z2.s0(V(i10), (List) z3.O(t10, W(iU0)), writer, false);
                    break;
                case 32:
                    z2.u0(V(i10), (List) z3.O(t10, W(iU0)), writer, false);
                    break;
                case 33:
                    z2.w0(V(i10), (List) z3.O(t10, W(iU0)), writer, false);
                    break;
                case 34:
                    z2.y0(V(i10), (List) z3.O(t10, W(iU0)), writer, false);
                    break;
                case 35:
                    z2.Y(V(i10), (List) z3.O(t10, W(iU0)), writer, true);
                    break;
                case 36:
                    z2.g0(V(i10), (List) z3.O(t10, W(iU0)), writer, true);
                    break;
                case 37:
                    z2.m0(V(i10), (List) z3.O(t10, W(iU0)), writer, true);
                    break;
                case 38:
                    z2.F0(V(i10), (List) z3.O(t10, W(iU0)), writer, true);
                    break;
                case 39:
                    z2.k0(V(i10), (List) z3.O(t10, W(iU0)), writer, true);
                    break;
                case 40:
                    z2.e0(V(i10), (List) z3.O(t10, W(iU0)), writer, true);
                    break;
                case 41:
                    z2.c0(V(i10), (List) z3.O(t10, W(iU0)), writer, true);
                    break;
                case 42:
                    z2.U(V(i10), (List) z3.O(t10, W(iU0)), writer, true);
                    break;
                case 43:
                    z2.D0(V(i10), (List) z3.O(t10, W(iU0)), writer, true);
                    break;
                case 44:
                    z2.a0(V(i10), (List) z3.O(t10, W(iU0)), writer, true);
                    break;
                case 45:
                    z2.s0(V(i10), (List) z3.O(t10, W(iU0)), writer, true);
                    break;
                case 46:
                    z2.u0(V(i10), (List) z3.O(t10, W(iU0)), writer, true);
                    break;
                case 47:
                    z2.w0(V(i10), (List) z3.O(t10, W(iU0)), writer, true);
                    break;
                case 48:
                    z2.y0(V(i10), (List) z3.O(t10, W(iU0)), writer, true);
                    break;
                case 49:
                    z2.i0(V(i10), (List) z3.O(t10, W(iU0)), writer, v(i10));
                    break;
                case 50:
                    y0(writer, iV, z3.O(t10, W(iU0)), i10);
                    break;
                case 51:
                    if (J(t10, iV, i10)) {
                        writer.G(iV, Y(t10, W(iU0)));
                    }
                    break;
                case 52:
                    if (J(t10, iV, i10)) {
                        writer.P(iV, Z(t10, W(iU0)));
                    }
                    break;
                case 53:
                    if (J(t10, iV, i10)) {
                        writer.L(iV, b0(t10, W(iU0)));
                    }
                    break;
                case 54:
                    if (J(t10, iV, i10)) {
                        writer.f(iV, b0(t10, W(iU0)));
                    }
                    break;
                case 55:
                    if (J(t10, iV, i10)) {
                        writer.h(iV, a0(t10, W(iU0)));
                    }
                    break;
                case 56:
                    if (J(t10, iV, i10)) {
                        writer.q(iV, b0(t10, W(iU0)));
                    }
                    break;
                case 57:
                    if (J(t10, iV, i10)) {
                        writer.c(iV, a0(t10, W(iU0)));
                    }
                    break;
                case 58:
                    if (J(t10, iV, i10)) {
                        writer.s(iV, X(t10, W(iU0)));
                    }
                    break;
                case 59:
                    if (J(t10, iV, i10)) {
                        z0(iV, z3.O(t10, W(iU0)), writer);
                    }
                    break;
                case 60:
                    if (J(t10, iV, i10)) {
                        writer.k(iV, z3.O(t10, W(iU0)), v(i10));
                    }
                    break;
                case 61:
                    if (J(t10, iV, i10)) {
                        writer.i(iV, (ByteString) z3.O(t10, W(iU0)));
                    }
                    break;
                case 62:
                    if (J(t10, iV, i10)) {
                        writer.o(iV, a0(t10, W(iU0)));
                    }
                    break;
                case 63:
                    if (J(t10, iV, i10)) {
                        writer.Q(iV, a0(t10, W(iU0)));
                    }
                    break;
                case 64:
                    if (J(t10, iV, i10)) {
                        writer.t(iV, a0(t10, W(iU0)));
                    }
                    break;
                case 65:
                    if (J(t10, iV, i10)) {
                        writer.C(iV, b0(t10, W(iU0)));
                    }
                    break;
                case 66:
                    if (J(t10, iV, i10)) {
                        writer.S(iV, a0(t10, W(iU0)));
                    }
                    break;
                case 67:
                    if (J(t10, iV, i10)) {
                        writer.m(iV, b0(t10, W(iU0)));
                    }
                    break;
                case 68:
                    if (J(t10, iV, i10)) {
                        writer.F(iV, z3.O(t10, W(iU0)), v(i10));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.f22428p.j(writer, entry);
            entry = itH.hasNext() ? (Map.Entry) itH.next() : null;
        }
        A0(this.f22427o, t10, writer);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    private void x0(T t10, Writer writer) throws IOException {
        Iterator itR;
        Map.Entry<?, ?> entry;
        A0(this.f22427o, t10, writer);
        if (this.f22418f) {
            y0<T> y0VarC = this.f22428p.c(t10);
            if (y0VarC.C()) {
                itR = null;
                entry = null;
            } else {
                itR = y0VarC.r();
                entry = (Map.Entry) itR.next();
            }
        } else {
            itR = null;
            entry = null;
        }
        for (int length = this.f22413a.length - 3; length >= 0; length -= 3) {
            int iU0 = u0(length);
            int iV = V(length);
            while (entry != null && this.f22428p.a(entry) > iV) {
                this.f22428p.j(writer, entry);
                entry = itR.hasNext() ? (Map.Entry) itR.next() : null;
            }
            switch (t0(iU0)) {
                case 0:
                    if (D(t10, length)) {
                        writer.G(iV, o(t10, W(iU0)));
                    }
                    break;
                case 1:
                    if (D(t10, length)) {
                        writer.P(iV, s(t10, W(iU0)));
                    }
                    break;
                case 2:
                    if (D(t10, length)) {
                        writer.L(iV, M(t10, W(iU0)));
                    }
                    break;
                case 3:
                    if (D(t10, length)) {
                        writer.f(iV, M(t10, W(iU0)));
                    }
                    break;
                case 4:
                    if (D(t10, length)) {
                        writer.h(iV, B(t10, W(iU0)));
                    }
                    break;
                case 5:
                    if (D(t10, length)) {
                        writer.q(iV, M(t10, W(iU0)));
                    }
                    break;
                case 6:
                    if (D(t10, length)) {
                        writer.c(iV, B(t10, W(iU0)));
                    }
                    break;
                case 7:
                    if (D(t10, length)) {
                        writer.s(iV, l(t10, W(iU0)));
                    }
                    break;
                case 8:
                    if (D(t10, length)) {
                        z0(iV, z3.O(t10, W(iU0)), writer);
                    }
                    break;
                case 9:
                    if (D(t10, length)) {
                        writer.k(iV, z3.O(t10, W(iU0)), v(length));
                    }
                    break;
                case 10:
                    if (D(t10, length)) {
                        writer.i(iV, (ByteString) z3.O(t10, W(iU0)));
                    }
                    break;
                case 11:
                    if (D(t10, length)) {
                        writer.o(iV, B(t10, W(iU0)));
                    }
                    break;
                case 12:
                    if (D(t10, length)) {
                        writer.Q(iV, B(t10, W(iU0)));
                    }
                    break;
                case 13:
                    if (D(t10, length)) {
                        writer.t(iV, B(t10, W(iU0)));
                    }
                    break;
                case 14:
                    if (D(t10, length)) {
                        writer.C(iV, M(t10, W(iU0)));
                    }
                    break;
                case 15:
                    if (D(t10, length)) {
                        writer.S(iV, B(t10, W(iU0)));
                    }
                    break;
                case 16:
                    if (D(t10, length)) {
                        writer.m(iV, M(t10, W(iU0)));
                    }
                    break;
                case 17:
                    if (D(t10, length)) {
                        writer.F(iV, z3.O(t10, W(iU0)), v(length));
                    }
                    break;
                case 18:
                    z2.Y(V(length), (List) z3.O(t10, W(iU0)), writer, false);
                    break;
                case 19:
                    z2.g0(V(length), (List) z3.O(t10, W(iU0)), writer, false);
                    break;
                case 20:
                    z2.m0(V(length), (List) z3.O(t10, W(iU0)), writer, false);
                    break;
                case 21:
                    z2.F0(V(length), (List) z3.O(t10, W(iU0)), writer, false);
                    break;
                case 22:
                    z2.k0(V(length), (List) z3.O(t10, W(iU0)), writer, false);
                    break;
                case 23:
                    z2.e0(V(length), (List) z3.O(t10, W(iU0)), writer, false);
                    break;
                case 24:
                    z2.c0(V(length), (List) z3.O(t10, W(iU0)), writer, false);
                    break;
                case 25:
                    z2.U(V(length), (List) z3.O(t10, W(iU0)), writer, false);
                    break;
                case 26:
                    z2.B0(V(length), (List) z3.O(t10, W(iU0)), writer);
                    break;
                case 27:
                    z2.q0(V(length), (List) z3.O(t10, W(iU0)), writer, v(length));
                    break;
                case 28:
                    z2.W(V(length), (List) z3.O(t10, W(iU0)), writer);
                    break;
                case 29:
                    z2.D0(V(length), (List) z3.O(t10, W(iU0)), writer, false);
                    break;
                case 30:
                    z2.a0(V(length), (List) z3.O(t10, W(iU0)), writer, false);
                    break;
                case 31:
                    z2.s0(V(length), (List) z3.O(t10, W(iU0)), writer, false);
                    break;
                case 32:
                    z2.u0(V(length), (List) z3.O(t10, W(iU0)), writer, false);
                    break;
                case 33:
                    z2.w0(V(length), (List) z3.O(t10, W(iU0)), writer, false);
                    break;
                case 34:
                    z2.y0(V(length), (List) z3.O(t10, W(iU0)), writer, false);
                    break;
                case 35:
                    z2.Y(V(length), (List) z3.O(t10, W(iU0)), writer, true);
                    break;
                case 36:
                    z2.g0(V(length), (List) z3.O(t10, W(iU0)), writer, true);
                    break;
                case 37:
                    z2.m0(V(length), (List) z3.O(t10, W(iU0)), writer, true);
                    break;
                case 38:
                    z2.F0(V(length), (List) z3.O(t10, W(iU0)), writer, true);
                    break;
                case 39:
                    z2.k0(V(length), (List) z3.O(t10, W(iU0)), writer, true);
                    break;
                case 40:
                    z2.e0(V(length), (List) z3.O(t10, W(iU0)), writer, true);
                    break;
                case 41:
                    z2.c0(V(length), (List) z3.O(t10, W(iU0)), writer, true);
                    break;
                case 42:
                    z2.U(V(length), (List) z3.O(t10, W(iU0)), writer, true);
                    break;
                case 43:
                    z2.D0(V(length), (List) z3.O(t10, W(iU0)), writer, true);
                    break;
                case 44:
                    z2.a0(V(length), (List) z3.O(t10, W(iU0)), writer, true);
                    break;
                case 45:
                    z2.s0(V(length), (List) z3.O(t10, W(iU0)), writer, true);
                    break;
                case 46:
                    z2.u0(V(length), (List) z3.O(t10, W(iU0)), writer, true);
                    break;
                case 47:
                    z2.w0(V(length), (List) z3.O(t10, W(iU0)), writer, true);
                    break;
                case 48:
                    z2.y0(V(length), (List) z3.O(t10, W(iU0)), writer, true);
                    break;
                case 49:
                    z2.i0(V(length), (List) z3.O(t10, W(iU0)), writer, v(length));
                    break;
                case 50:
                    y0(writer, iV, z3.O(t10, W(iU0)), length);
                    break;
                case 51:
                    if (J(t10, iV, length)) {
                        writer.G(iV, Y(t10, W(iU0)));
                    }
                    break;
                case 52:
                    if (J(t10, iV, length)) {
                        writer.P(iV, Z(t10, W(iU0)));
                    }
                    break;
                case 53:
                    if (J(t10, iV, length)) {
                        writer.L(iV, b0(t10, W(iU0)));
                    }
                    break;
                case 54:
                    if (J(t10, iV, length)) {
                        writer.f(iV, b0(t10, W(iU0)));
                    }
                    break;
                case 55:
                    if (J(t10, iV, length)) {
                        writer.h(iV, a0(t10, W(iU0)));
                    }
                    break;
                case 56:
                    if (J(t10, iV, length)) {
                        writer.q(iV, b0(t10, W(iU0)));
                    }
                    break;
                case 57:
                    if (J(t10, iV, length)) {
                        writer.c(iV, a0(t10, W(iU0)));
                    }
                    break;
                case 58:
                    if (J(t10, iV, length)) {
                        writer.s(iV, X(t10, W(iU0)));
                    }
                    break;
                case 59:
                    if (J(t10, iV, length)) {
                        z0(iV, z3.O(t10, W(iU0)), writer);
                    }
                    break;
                case 60:
                    if (J(t10, iV, length)) {
                        writer.k(iV, z3.O(t10, W(iU0)), v(length));
                    }
                    break;
                case 61:
                    if (J(t10, iV, length)) {
                        writer.i(iV, (ByteString) z3.O(t10, W(iU0)));
                    }
                    break;
                case 62:
                    if (J(t10, iV, length)) {
                        writer.o(iV, a0(t10, W(iU0)));
                    }
                    break;
                case 63:
                    if (J(t10, iV, length)) {
                        writer.Q(iV, a0(t10, W(iU0)));
                    }
                    break;
                case 64:
                    if (J(t10, iV, length)) {
                        writer.t(iV, a0(t10, W(iU0)));
                    }
                    break;
                case 65:
                    if (J(t10, iV, length)) {
                        writer.C(iV, b0(t10, W(iU0)));
                    }
                    break;
                case 66:
                    if (J(t10, iV, length)) {
                        writer.S(iV, a0(t10, W(iU0)));
                    }
                    break;
                case 67:
                    if (J(t10, iV, length)) {
                        writer.m(iV, b0(t10, W(iU0)));
                    }
                    break;
                case 68:
                    if (J(t10, iV, length)) {
                        writer.F(iV, z3.O(t10, W(iU0)), v(length));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.f22428p.j(writer, entry);
            entry = itR.hasNext() ? (Map.Entry) itR.next() : null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:186:0x0423 A[PHI: r6
  0x0423: PHI (r6v4 int) = 
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v8 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v9 int)
  (r6v1 int)
 binds: [B:21:0x0060, B:225:0x04ca, B:222:0x04bf, B:216:0x04a3, B:213:0x0492, B:210:0x0483, B:207:0x0476, B:204:0x0469, B:200:0x045e, B:197:0x0455, B:194:0x0448, B:191:0x043b, B:188:0x0428, B:161:0x0335, B:155:0x0318, B:149:0x02fb, B:143:0x02de, B:137:0x02c0, B:131:0x02a2, B:125:0x0284, B:119:0x0266, B:113:0x0248, B:107:0x022a, B:101:0x020c, B:95:0x01ee, B:89:0x01d0, B:83:0x01b2, B:78:0x017e, B:75:0x0172, B:72:0x0162, B:69:0x0152, B:66:0x0142, B:63:0x0136, B:60:0x0129, B:57:0x011c, B:51:0x00fe, B:48:0x00ea, B:45:0x00d8, B:42:0x00c8, B:39:0x00b8, B:202:0x0465, B:36:0x00ab, B:33:0x009f, B:30:0x008f, B:27:0x007f, B:185:0x0422, B:24:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    private int y(T t10) {
        int i10;
        int i11;
        int iI0;
        int iA0;
        int iN0;
        boolean z10;
        int iF;
        int i12;
        int iX0;
        int iZ0;
        Unsafe unsafe = f22412z;
        int i13 = -1;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i14 < this.f22413a.length) {
            int iU0 = u0(i14);
            int iV = V(i14);
            int iT0 = t0(iU0);
            if (iT0 <= 17) {
                i10 = this.f22413a[i14 + 2];
                int i17 = f22406t & i10;
                int i18 = 1 << (i10 >>> 20);
                if (i17 != i13) {
                    i16 = unsafe.getInt(t10, i17);
                    i13 = i17;
                }
                i11 = i18;
            } else {
                i10 = (!this.f22421i || iT0 < FieldType.DOUBLE_LIST_PACKED.id() || iT0 > FieldType.SINT64_LIST_PACKED.id()) ? 0 : this.f22413a[i14 + 2] & f22406t;
                i11 = 0;
            }
            long jW = W(iU0);
            int i19 = i13;
            switch (iT0) {
                case 0:
                    if ((i16 & i11) != 0) {
                        iI0 = CodedOutputStream.i0(iV, 0.0d);
                        i15 += iI0;
                    }
                    break;
                case 1:
                    if ((i16 & i11) != 0) {
                        iI0 = CodedOutputStream.q0(iV, 0.0f);
                        i15 += iI0;
                    }
                    break;
                case 2:
                    if ((i16 & i11) != 0) {
                        iI0 = CodedOutputStream.y0(iV, unsafe.getLong(t10, jW));
                        i15 += iI0;
                    }
                    break;
                case 3:
                    if ((i16 & i11) != 0) {
                        iI0 = CodedOutputStream.a1(iV, unsafe.getLong(t10, jW));
                        i15 += iI0;
                    }
                    break;
                case 4:
                    if ((i16 & i11) != 0) {
                        iI0 = CodedOutputStream.w0(iV, unsafe.getInt(t10, jW));
                        i15 += iI0;
                    }
                    break;
                case 5:
                    if ((i16 & i11) != 0) {
                        iI0 = CodedOutputStream.o0(iV, 0L);
                        i15 += iI0;
                    }
                    break;
                case 6:
                    if ((i16 & i11) != 0) {
                        iI0 = CodedOutputStream.m0(iV, 0);
                        i15 += iI0;
                    }
                    break;
                case 7:
                    if ((i16 & i11) != 0) {
                        iA0 = CodedOutputStream.a0(iV, true);
                        i15 += iA0;
                    }
                    break;
                case 8:
                    if ((i16 & i11) != 0) {
                        Object object = unsafe.getObject(t10, jW);
                        iA0 = object instanceof ByteString ? CodedOutputStream.g0(iV, (ByteString) object) : CodedOutputStream.V0(iV, (String) object);
                        i15 += iA0;
                    }
                    break;
                case 9:
                    if ((i16 & i11) != 0) {
                        iA0 = z2.p(iV, unsafe.getObject(t10, jW), v(i14));
                        i15 += iA0;
                    }
                    break;
                case 10:
                    if ((i16 & i11) != 0) {
                        iA0 = CodedOutputStream.g0(iV, (ByteString) unsafe.getObject(t10, jW));
                        i15 += iA0;
                    }
                    break;
                case 11:
                    if ((i16 & i11) != 0) {
                        iA0 = CodedOutputStream.Y0(iV, unsafe.getInt(t10, jW));
                        i15 += iA0;
                    }
                    break;
                case 12:
                    if ((i16 & i11) != 0) {
                        iA0 = CodedOutputStream.k0(iV, unsafe.getInt(t10, jW));
                        i15 += iA0;
                    }
                    break;
                case 13:
                    if ((i16 & i11) != 0) {
                        iN0 = CodedOutputStream.N0(iV, 0);
                        i15 += iN0;
                    }
                    break;
                case 14:
                    if ((i16 & i11) != 0) {
                        iA0 = CodedOutputStream.P0(iV, 0L);
                        i15 += iA0;
                    }
                    break;
                case 15:
                    if ((i16 & i11) != 0) {
                        iA0 = CodedOutputStream.R0(iV, unsafe.getInt(t10, jW));
                        i15 += iA0;
                    }
                    break;
                case 16:
                    if ((i16 & i11) != 0) {
                        iA0 = CodedOutputStream.T0(iV, unsafe.getLong(t10, jW));
                        i15 += iA0;
                    }
                    break;
                case 17:
                    if ((i16 & i11) != 0) {
                        iA0 = CodedOutputStream.t0(iV, (z1) unsafe.getObject(t10, jW), v(i14));
                        i15 += iA0;
                    }
                    break;
                case 18:
                    iA0 = z2.h(iV, (List) unsafe.getObject(t10, jW), false);
                    i15 += iA0;
                    break;
                case 19:
                    z10 = false;
                    iF = z2.f(iV, (List) unsafe.getObject(t10, jW), false);
                    i15 += iF;
                    break;
                case 20:
                    z10 = false;
                    iF = z2.n(iV, (List) unsafe.getObject(t10, jW), false);
                    i15 += iF;
                    break;
                case 21:
                    z10 = false;
                    iF = z2.z(iV, (List) unsafe.getObject(t10, jW), false);
                    i15 += iF;
                    break;
                case 22:
                    z10 = false;
                    iF = z2.l(iV, (List) unsafe.getObject(t10, jW), false);
                    i15 += iF;
                    break;
                case 23:
                    z10 = false;
                    iF = z2.h(iV, (List) unsafe.getObject(t10, jW), false);
                    i15 += iF;
                    break;
                case 24:
                    z10 = false;
                    iF = z2.f(iV, (List) unsafe.getObject(t10, jW), false);
                    i15 += iF;
                    break;
                case 25:
                    z10 = false;
                    iF = z2.a(iV, (List) unsafe.getObject(t10, jW), false);
                    i15 += iF;
                    break;
                case 26:
                    iA0 = z2.w(iV, (List) unsafe.getObject(t10, jW));
                    i15 += iA0;
                    break;
                case 27:
                    iA0 = z2.r(iV, (List) unsafe.getObject(t10, jW), v(i14));
                    i15 += iA0;
                    break;
                case 28:
                    iA0 = z2.c(iV, (List) unsafe.getObject(t10, jW));
                    i15 += iA0;
                    break;
                case 29:
                    iA0 = z2.x(iV, (List) unsafe.getObject(t10, jW), false);
                    i15 += iA0;
                    break;
                case 30:
                    z10 = false;
                    iF = z2.d(iV, (List) unsafe.getObject(t10, jW), false);
                    i15 += iF;
                    break;
                case 31:
                    z10 = false;
                    iF = z2.f(iV, (List) unsafe.getObject(t10, jW), false);
                    i15 += iF;
                    break;
                case 32:
                    z10 = false;
                    iF = z2.h(iV, (List) unsafe.getObject(t10, jW), false);
                    i15 += iF;
                    break;
                case 33:
                    z10 = false;
                    iF = z2.s(iV, (List) unsafe.getObject(t10, jW), false);
                    i15 += iF;
                    break;
                case 34:
                    z10 = false;
                    iF = z2.u(iV, (List) unsafe.getObject(t10, jW), false);
                    i15 += iF;
                    break;
                case 35:
                    i12 = z2.i((List) unsafe.getObject(t10, jW));
                    if (i12 > 0) {
                        if (this.f22421i) {
                            unsafe.putInt(t10, i10, i12);
                        }
                        iX0 = CodedOutputStream.X0(iV);
                        iZ0 = CodedOutputStream.Z0(i12);
                        iN0 = iX0 + iZ0 + i12;
                        i15 += iN0;
                    }
                    break;
                case 36:
                    i12 = z2.g((List) unsafe.getObject(t10, jW));
                    if (i12 > 0) {
                        if (this.f22421i) {
                            unsafe.putInt(t10, i10, i12);
                        }
                        iX0 = CodedOutputStream.X0(iV);
                        iZ0 = CodedOutputStream.Z0(i12);
                        iN0 = iX0 + iZ0 + i12;
                        i15 += iN0;
                    }
                    break;
                case 37:
                    i12 = z2.o((List) unsafe.getObject(t10, jW));
                    if (i12 > 0) {
                        if (this.f22421i) {
                            unsafe.putInt(t10, i10, i12);
                        }
                        iX0 = CodedOutputStream.X0(iV);
                        iZ0 = CodedOutputStream.Z0(i12);
                        iN0 = iX0 + iZ0 + i12;
                        i15 += iN0;
                    }
                    break;
                case 38:
                    i12 = z2.A((List) unsafe.getObject(t10, jW));
                    if (i12 > 0) {
                        if (this.f22421i) {
                            unsafe.putInt(t10, i10, i12);
                        }
                        iX0 = CodedOutputStream.X0(iV);
                        iZ0 = CodedOutputStream.Z0(i12);
                        iN0 = iX0 + iZ0 + i12;
                        i15 += iN0;
                    }
                    break;
                case 39:
                    i12 = z2.m((List) unsafe.getObject(t10, jW));
                    if (i12 > 0) {
                        if (this.f22421i) {
                            unsafe.putInt(t10, i10, i12);
                        }
                        iX0 = CodedOutputStream.X0(iV);
                        iZ0 = CodedOutputStream.Z0(i12);
                        iN0 = iX0 + iZ0 + i12;
                        i15 += iN0;
                    }
                    break;
                case 40:
                    i12 = z2.i((List) unsafe.getObject(t10, jW));
                    if (i12 > 0) {
                        if (this.f22421i) {
                            unsafe.putInt(t10, i10, i12);
                        }
                        iX0 = CodedOutputStream.X0(iV);
                        iZ0 = CodedOutputStream.Z0(i12);
                        iN0 = iX0 + iZ0 + i12;
                        i15 += iN0;
                    }
                    break;
                case 41:
                    i12 = z2.g((List) unsafe.getObject(t10, jW));
                    if (i12 > 0) {
                        if (this.f22421i) {
                            unsafe.putInt(t10, i10, i12);
                        }
                        iX0 = CodedOutputStream.X0(iV);
                        iZ0 = CodedOutputStream.Z0(i12);
                        iN0 = iX0 + iZ0 + i12;
                        i15 += iN0;
                    }
                    break;
                case 42:
                    i12 = z2.b((List) unsafe.getObject(t10, jW));
                    if (i12 > 0) {
                        if (this.f22421i) {
                            unsafe.putInt(t10, i10, i12);
                        }
                        iX0 = CodedOutputStream.X0(iV);
                        iZ0 = CodedOutputStream.Z0(i12);
                        iN0 = iX0 + iZ0 + i12;
                        i15 += iN0;
                    }
                    break;
                case 43:
                    i12 = z2.y((List) unsafe.getObject(t10, jW));
                    if (i12 > 0) {
                        if (this.f22421i) {
                            unsafe.putInt(t10, i10, i12);
                        }
                        iX0 = CodedOutputStream.X0(iV);
                        iZ0 = CodedOutputStream.Z0(i12);
                        iN0 = iX0 + iZ0 + i12;
                        i15 += iN0;
                    }
                    break;
                case 44:
                    i12 = z2.e((List) unsafe.getObject(t10, jW));
                    if (i12 > 0) {
                        if (this.f22421i) {
                            unsafe.putInt(t10, i10, i12);
                        }
                        iX0 = CodedOutputStream.X0(iV);
                        iZ0 = CodedOutputStream.Z0(i12);
                        iN0 = iX0 + iZ0 + i12;
                        i15 += iN0;
                    }
                    break;
                case 45:
                    i12 = z2.g((List) unsafe.getObject(t10, jW));
                    if (i12 > 0) {
                        if (this.f22421i) {
                            unsafe.putInt(t10, i10, i12);
                        }
                        iX0 = CodedOutputStream.X0(iV);
                        iZ0 = CodedOutputStream.Z0(i12);
                        iN0 = iX0 + iZ0 + i12;
                        i15 += iN0;
                    }
                    break;
                case 46:
                    i12 = z2.i((List) unsafe.getObject(t10, jW));
                    if (i12 > 0) {
                        if (this.f22421i) {
                            unsafe.putInt(t10, i10, i12);
                        }
                        iX0 = CodedOutputStream.X0(iV);
                        iZ0 = CodedOutputStream.Z0(i12);
                        iN0 = iX0 + iZ0 + i12;
                        i15 += iN0;
                    }
                    break;
                case 47:
                    i12 = z2.t((List) unsafe.getObject(t10, jW));
                    if (i12 > 0) {
                        if (this.f22421i) {
                            unsafe.putInt(t10, i10, i12);
                        }
                        iX0 = CodedOutputStream.X0(iV);
                        iZ0 = CodedOutputStream.Z0(i12);
                        iN0 = iX0 + iZ0 + i12;
                        i15 += iN0;
                    }
                    break;
                case 48:
                    i12 = z2.v((List) unsafe.getObject(t10, jW));
                    if (i12 > 0) {
                        if (this.f22421i) {
                            unsafe.putInt(t10, i10, i12);
                        }
                        iX0 = CodedOutputStream.X0(iV);
                        iZ0 = CodedOutputStream.Z0(i12);
                        iN0 = iX0 + iZ0 + i12;
                        i15 += iN0;
                    }
                    break;
                case 49:
                    iA0 = z2.k(iV, (List) unsafe.getObject(t10, jW), v(i14));
                    i15 += iA0;
                    break;
                case 50:
                    iA0 = this.f22429q.d(iV, unsafe.getObject(t10, jW), u(i14));
                    i15 += iA0;
                    break;
                case 51:
                    if (J(t10, iV, i14)) {
                        iA0 = CodedOutputStream.i0(iV, 0.0d);
                        i15 += iA0;
                    }
                    break;
                case 52:
                    if (J(t10, iV, i14)) {
                        iA0 = CodedOutputStream.q0(iV, 0.0f);
                        i15 += iA0;
                    }
                    break;
                case 53:
                    if (J(t10, iV, i14)) {
                        iA0 = CodedOutputStream.y0(iV, b0(t10, jW));
                        i15 += iA0;
                    }
                    break;
                case 54:
                    if (J(t10, iV, i14)) {
                        iA0 = CodedOutputStream.a1(iV, b0(t10, jW));
                        i15 += iA0;
                    }
                    break;
                case 55:
                    if (J(t10, iV, i14)) {
                        iA0 = CodedOutputStream.w0(iV, a0(t10, jW));
                        i15 += iA0;
                    }
                    break;
                case 56:
                    if (J(t10, iV, i14)) {
                        iA0 = CodedOutputStream.o0(iV, 0L);
                        i15 += iA0;
                    }
                    break;
                case 57:
                    if (J(t10, iV, i14)) {
                        iN0 = CodedOutputStream.m0(iV, 0);
                        i15 += iN0;
                    }
                    break;
                case 58:
                    if (J(t10, iV, i14)) {
                        iA0 = CodedOutputStream.a0(iV, true);
                        i15 += iA0;
                    }
                    break;
                case 59:
                    if (J(t10, iV, i14)) {
                        Object object2 = unsafe.getObject(t10, jW);
                        iA0 = object2 instanceof ByteString ? CodedOutputStream.g0(iV, (ByteString) object2) : CodedOutputStream.V0(iV, (String) object2);
                        i15 += iA0;
                    }
                    break;
                case 60:
                    if (J(t10, iV, i14)) {
                        iA0 = z2.p(iV, unsafe.getObject(t10, jW), v(i14));
                        i15 += iA0;
                    }
                    break;
                case 61:
                    if (J(t10, iV, i14)) {
                        iA0 = CodedOutputStream.g0(iV, (ByteString) unsafe.getObject(t10, jW));
                        i15 += iA0;
                    }
                    break;
                case 62:
                    if (J(t10, iV, i14)) {
                        iA0 = CodedOutputStream.Y0(iV, a0(t10, jW));
                        i15 += iA0;
                    }
                    break;
                case 63:
                    if (J(t10, iV, i14)) {
                        iA0 = CodedOutputStream.k0(iV, a0(t10, jW));
                        i15 += iA0;
                    }
                    break;
                case 64:
                    if (J(t10, iV, i14)) {
                        iN0 = CodedOutputStream.N0(iV, 0);
                        i15 += iN0;
                    }
                    break;
                case 65:
                    if (J(t10, iV, i14)) {
                        iA0 = CodedOutputStream.P0(iV, 0L);
                        i15 += iA0;
                    }
                    break;
                case 66:
                    if (J(t10, iV, i14)) {
                        iA0 = CodedOutputStream.R0(iV, a0(t10, jW));
                        i15 += iA0;
                    }
                    break;
                case 67:
                    if (J(t10, iV, i14)) {
                        iA0 = CodedOutputStream.T0(iV, b0(t10, jW));
                        i15 += iA0;
                    }
                    break;
                case 68:
                    if (J(t10, iV, i14)) {
                        iA0 = CodedOutputStream.t0(iV, (z1) unsafe.getObject(t10, jW), v(i14));
                        i15 += iA0;
                    }
                    break;
                default:
                    break;
            }
            i14 += 3;
            i13 = i19;
        }
        int iA = i15 + A(this.f22427o, t10);
        return this.f22418f ? iA + this.f22428p.c(t10).z() : iA;
    }

    private <K, V> void y0(Writer writer, int i10, Object obj, int i11) throws IOException {
        if (obj != null) {
            writer.n(i10, this.f22429q.b(u(i11)), this.f22429q.g(obj));
        }
    }

    private int z(T t10) {
        int iI0;
        int i10;
        int iX0;
        int iZ0;
        Unsafe unsafe = f22412z;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f22413a.length; i12 += 3) {
            int iU0 = u0(i12);
            int iT0 = t0(iU0);
            int iV = V(i12);
            long jW = W(iU0);
            int i13 = (iT0 < FieldType.DOUBLE_LIST_PACKED.id() || iT0 > FieldType.SINT64_LIST_PACKED.id()) ? 0 : this.f22413a[i12 + 2] & f22406t;
            switch (iT0) {
                case 0:
                    if (D(t10, i12)) {
                        iI0 = CodedOutputStream.i0(iV, 0.0d);
                        i11 += iI0;
                    }
                    break;
                case 1:
                    if (D(t10, i12)) {
                        iI0 = CodedOutputStream.q0(iV, 0.0f);
                        i11 += iI0;
                    }
                    break;
                case 2:
                    if (D(t10, i12)) {
                        iI0 = CodedOutputStream.y0(iV, z3.L(t10, jW));
                        i11 += iI0;
                    }
                    break;
                case 3:
                    if (D(t10, i12)) {
                        iI0 = CodedOutputStream.a1(iV, z3.L(t10, jW));
                        i11 += iI0;
                    }
                    break;
                case 4:
                    if (D(t10, i12)) {
                        iI0 = CodedOutputStream.w0(iV, z3.I(t10, jW));
                        i11 += iI0;
                    }
                    break;
                case 5:
                    if (D(t10, i12)) {
                        iI0 = CodedOutputStream.o0(iV, 0L);
                        i11 += iI0;
                    }
                    break;
                case 6:
                    if (D(t10, i12)) {
                        iI0 = CodedOutputStream.m0(iV, 0);
                        i11 += iI0;
                    }
                    break;
                case 7:
                    if (D(t10, i12)) {
                        iI0 = CodedOutputStream.a0(iV, true);
                        i11 += iI0;
                    }
                    break;
                case 8:
                    if (D(t10, i12)) {
                        Object objO = z3.O(t10, jW);
                        iI0 = objO instanceof ByteString ? CodedOutputStream.g0(iV, (ByteString) objO) : CodedOutputStream.V0(iV, (String) objO);
                        i11 += iI0;
                    }
                    break;
                case 9:
                    if (D(t10, i12)) {
                        iI0 = z2.p(iV, z3.O(t10, jW), v(i12));
                        i11 += iI0;
                    }
                    break;
                case 10:
                    if (D(t10, i12)) {
                        iI0 = CodedOutputStream.g0(iV, (ByteString) z3.O(t10, jW));
                        i11 += iI0;
                    }
                    break;
                case 11:
                    if (D(t10, i12)) {
                        iI0 = CodedOutputStream.Y0(iV, z3.I(t10, jW));
                        i11 += iI0;
                    }
                    break;
                case 12:
                    if (D(t10, i12)) {
                        iI0 = CodedOutputStream.k0(iV, z3.I(t10, jW));
                        i11 += iI0;
                    }
                    break;
                case 13:
                    if (D(t10, i12)) {
                        iI0 = CodedOutputStream.N0(iV, 0);
                        i11 += iI0;
                    }
                    break;
                case 14:
                    if (D(t10, i12)) {
                        iI0 = CodedOutputStream.P0(iV, 0L);
                        i11 += iI0;
                    }
                    break;
                case 15:
                    if (D(t10, i12)) {
                        iI0 = CodedOutputStream.R0(iV, z3.I(t10, jW));
                        i11 += iI0;
                    }
                    break;
                case 16:
                    if (D(t10, i12)) {
                        iI0 = CodedOutputStream.T0(iV, z3.L(t10, jW));
                        i11 += iI0;
                    }
                    break;
                case 17:
                    if (D(t10, i12)) {
                        iI0 = CodedOutputStream.t0(iV, (z1) z3.O(t10, jW), v(i12));
                        i11 += iI0;
                    }
                    break;
                case 18:
                    iI0 = z2.h(iV, L(t10, jW), false);
                    i11 += iI0;
                    break;
                case 19:
                    iI0 = z2.f(iV, L(t10, jW), false);
                    i11 += iI0;
                    break;
                case 20:
                    iI0 = z2.n(iV, L(t10, jW), false);
                    i11 += iI0;
                    break;
                case 21:
                    iI0 = z2.z(iV, L(t10, jW), false);
                    i11 += iI0;
                    break;
                case 22:
                    iI0 = z2.l(iV, L(t10, jW), false);
                    i11 += iI0;
                    break;
                case 23:
                    iI0 = z2.h(iV, L(t10, jW), false);
                    i11 += iI0;
                    break;
                case 24:
                    iI0 = z2.f(iV, L(t10, jW), false);
                    i11 += iI0;
                    break;
                case 25:
                    iI0 = z2.a(iV, L(t10, jW), false);
                    i11 += iI0;
                    break;
                case 26:
                    iI0 = z2.w(iV, L(t10, jW));
                    i11 += iI0;
                    break;
                case 27:
                    iI0 = z2.r(iV, L(t10, jW), v(i12));
                    i11 += iI0;
                    break;
                case 28:
                    iI0 = z2.c(iV, L(t10, jW));
                    i11 += iI0;
                    break;
                case 29:
                    iI0 = z2.x(iV, L(t10, jW), false);
                    i11 += iI0;
                    break;
                case 30:
                    iI0 = z2.d(iV, L(t10, jW), false);
                    i11 += iI0;
                    break;
                case 31:
                    iI0 = z2.f(iV, L(t10, jW), false);
                    i11 += iI0;
                    break;
                case 32:
                    iI0 = z2.h(iV, L(t10, jW), false);
                    i11 += iI0;
                    break;
                case 33:
                    iI0 = z2.s(iV, L(t10, jW), false);
                    i11 += iI0;
                    break;
                case 34:
                    iI0 = z2.u(iV, L(t10, jW), false);
                    i11 += iI0;
                    break;
                case 35:
                    i10 = z2.i((List) unsafe.getObject(t10, jW));
                    if (i10 > 0) {
                        if (this.f22421i) {
                            unsafe.putInt(t10, i13, i10);
                        }
                        iX0 = CodedOutputStream.X0(iV);
                        iZ0 = CodedOutputStream.Z0(i10);
                        iI0 = iX0 + iZ0 + i10;
                        i11 += iI0;
                    }
                    break;
                case 36:
                    i10 = z2.g((List) unsafe.getObject(t10, jW));
                    if (i10 > 0) {
                        if (this.f22421i) {
                            unsafe.putInt(t10, i13, i10);
                        }
                        iX0 = CodedOutputStream.X0(iV);
                        iZ0 = CodedOutputStream.Z0(i10);
                        iI0 = iX0 + iZ0 + i10;
                        i11 += iI0;
                    }
                    break;
                case 37:
                    i10 = z2.o((List) unsafe.getObject(t10, jW));
                    if (i10 > 0) {
                        if (this.f22421i) {
                            unsafe.putInt(t10, i13, i10);
                        }
                        iX0 = CodedOutputStream.X0(iV);
                        iZ0 = CodedOutputStream.Z0(i10);
                        iI0 = iX0 + iZ0 + i10;
                        i11 += iI0;
                    }
                    break;
                case 38:
                    i10 = z2.A((List) unsafe.getObject(t10, jW));
                    if (i10 > 0) {
                        if (this.f22421i) {
                            unsafe.putInt(t10, i13, i10);
                        }
                        iX0 = CodedOutputStream.X0(iV);
                        iZ0 = CodedOutputStream.Z0(i10);
                        iI0 = iX0 + iZ0 + i10;
                        i11 += iI0;
                    }
                    break;
                case 39:
                    i10 = z2.m((List) unsafe.getObject(t10, jW));
                    if (i10 > 0) {
                        if (this.f22421i) {
                            unsafe.putInt(t10, i13, i10);
                        }
                        iX0 = CodedOutputStream.X0(iV);
                        iZ0 = CodedOutputStream.Z0(i10);
                        iI0 = iX0 + iZ0 + i10;
                        i11 += iI0;
                    }
                    break;
                case 40:
                    i10 = z2.i((List) unsafe.getObject(t10, jW));
                    if (i10 > 0) {
                        if (this.f22421i) {
                            unsafe.putInt(t10, i13, i10);
                        }
                        iX0 = CodedOutputStream.X0(iV);
                        iZ0 = CodedOutputStream.Z0(i10);
                        iI0 = iX0 + iZ0 + i10;
                        i11 += iI0;
                    }
                    break;
                case 41:
                    i10 = z2.g((List) unsafe.getObject(t10, jW));
                    if (i10 > 0) {
                        if (this.f22421i) {
                            unsafe.putInt(t10, i13, i10);
                        }
                        iX0 = CodedOutputStream.X0(iV);
                        iZ0 = CodedOutputStream.Z0(i10);
                        iI0 = iX0 + iZ0 + i10;
                        i11 += iI0;
                    }
                    break;
                case 42:
                    i10 = z2.b((List) unsafe.getObject(t10, jW));
                    if (i10 > 0) {
                        if (this.f22421i) {
                            unsafe.putInt(t10, i13, i10);
                        }
                        iX0 = CodedOutputStream.X0(iV);
                        iZ0 = CodedOutputStream.Z0(i10);
                        iI0 = iX0 + iZ0 + i10;
                        i11 += iI0;
                    }
                    break;
                case 43:
                    i10 = z2.y((List) unsafe.getObject(t10, jW));
                    if (i10 > 0) {
                        if (this.f22421i) {
                            unsafe.putInt(t10, i13, i10);
                        }
                        iX0 = CodedOutputStream.X0(iV);
                        iZ0 = CodedOutputStream.Z0(i10);
                        iI0 = iX0 + iZ0 + i10;
                        i11 += iI0;
                    }
                    break;
                case 44:
                    i10 = z2.e((List) unsafe.getObject(t10, jW));
                    if (i10 > 0) {
                        if (this.f22421i) {
                            unsafe.putInt(t10, i13, i10);
                        }
                        iX0 = CodedOutputStream.X0(iV);
                        iZ0 = CodedOutputStream.Z0(i10);
                        iI0 = iX0 + iZ0 + i10;
                        i11 += iI0;
                    }
                    break;
                case 45:
                    i10 = z2.g((List) unsafe.getObject(t10, jW));
                    if (i10 > 0) {
                        if (this.f22421i) {
                            unsafe.putInt(t10, i13, i10);
                        }
                        iX0 = CodedOutputStream.X0(iV);
                        iZ0 = CodedOutputStream.Z0(i10);
                        iI0 = iX0 + iZ0 + i10;
                        i11 += iI0;
                    }
                    break;
                case 46:
                    i10 = z2.i((List) unsafe.getObject(t10, jW));
                    if (i10 > 0) {
                        if (this.f22421i) {
                            unsafe.putInt(t10, i13, i10);
                        }
                        iX0 = CodedOutputStream.X0(iV);
                        iZ0 = CodedOutputStream.Z0(i10);
                        iI0 = iX0 + iZ0 + i10;
                        i11 += iI0;
                    }
                    break;
                case 47:
                    i10 = z2.t((List) unsafe.getObject(t10, jW));
                    if (i10 > 0) {
                        if (this.f22421i) {
                            unsafe.putInt(t10, i13, i10);
                        }
                        iX0 = CodedOutputStream.X0(iV);
                        iZ0 = CodedOutputStream.Z0(i10);
                        iI0 = iX0 + iZ0 + i10;
                        i11 += iI0;
                    }
                    break;
                case 48:
                    i10 = z2.v((List) unsafe.getObject(t10, jW));
                    if (i10 > 0) {
                        if (this.f22421i) {
                            unsafe.putInt(t10, i13, i10);
                        }
                        iX0 = CodedOutputStream.X0(iV);
                        iZ0 = CodedOutputStream.Z0(i10);
                        iI0 = iX0 + iZ0 + i10;
                        i11 += iI0;
                    }
                    break;
                case 49:
                    iI0 = z2.k(iV, L(t10, jW), v(i12));
                    i11 += iI0;
                    break;
                case 50:
                    iI0 = this.f22429q.d(iV, z3.O(t10, jW), u(i12));
                    i11 += iI0;
                    break;
                case 51:
                    if (J(t10, iV, i12)) {
                        iI0 = CodedOutputStream.i0(iV, 0.0d);
                        i11 += iI0;
                    }
                    break;
                case 52:
                    if (J(t10, iV, i12)) {
                        iI0 = CodedOutputStream.q0(iV, 0.0f);
                        i11 += iI0;
                    }
                    break;
                case 53:
                    if (J(t10, iV, i12)) {
                        iI0 = CodedOutputStream.y0(iV, b0(t10, jW));
                        i11 += iI0;
                    }
                    break;
                case 54:
                    if (J(t10, iV, i12)) {
                        iI0 = CodedOutputStream.a1(iV, b0(t10, jW));
                        i11 += iI0;
                    }
                    break;
                case 55:
                    if (J(t10, iV, i12)) {
                        iI0 = CodedOutputStream.w0(iV, a0(t10, jW));
                        i11 += iI0;
                    }
                    break;
                case 56:
                    if (J(t10, iV, i12)) {
                        iI0 = CodedOutputStream.o0(iV, 0L);
                        i11 += iI0;
                    }
                    break;
                case 57:
                    if (J(t10, iV, i12)) {
                        iI0 = CodedOutputStream.m0(iV, 0);
                        i11 += iI0;
                    }
                    break;
                case 58:
                    if (J(t10, iV, i12)) {
                        iI0 = CodedOutputStream.a0(iV, true);
                        i11 += iI0;
                    }
                    break;
                case 59:
                    if (J(t10, iV, i12)) {
                        Object objO2 = z3.O(t10, jW);
                        iI0 = objO2 instanceof ByteString ? CodedOutputStream.g0(iV, (ByteString) objO2) : CodedOutputStream.V0(iV, (String) objO2);
                        i11 += iI0;
                    }
                    break;
                case 60:
                    if (J(t10, iV, i12)) {
                        iI0 = z2.p(iV, z3.O(t10, jW), v(i12));
                        i11 += iI0;
                    }
                    break;
                case 61:
                    if (J(t10, iV, i12)) {
                        iI0 = CodedOutputStream.g0(iV, (ByteString) z3.O(t10, jW));
                        i11 += iI0;
                    }
                    break;
                case 62:
                    if (J(t10, iV, i12)) {
                        iI0 = CodedOutputStream.Y0(iV, a0(t10, jW));
                        i11 += iI0;
                    }
                    break;
                case 63:
                    if (J(t10, iV, i12)) {
                        iI0 = CodedOutputStream.k0(iV, a0(t10, jW));
                        i11 += iI0;
                    }
                    break;
                case 64:
                    if (J(t10, iV, i12)) {
                        iI0 = CodedOutputStream.N0(iV, 0);
                        i11 += iI0;
                    }
                    break;
                case 65:
                    if (J(t10, iV, i12)) {
                        iI0 = CodedOutputStream.P0(iV, 0L);
                        i11 += iI0;
                    }
                    break;
                case 66:
                    if (J(t10, iV, i12)) {
                        iI0 = CodedOutputStream.R0(iV, a0(t10, jW));
                        i11 += iI0;
                    }
                    break;
                case 67:
                    if (J(t10, iV, i12)) {
                        iI0 = CodedOutputStream.T0(iV, b0(t10, jW));
                        i11 += iI0;
                    }
                    break;
                case 68:
                    if (J(t10, iV, i12)) {
                        iI0 = CodedOutputStream.t0(iV, (z1) z3.O(t10, jW), v(i12));
                        i11 += iI0;
                    }
                    break;
            }
        }
        return i11 + A(this.f22427o, t10);
    }

    private void z0(int i10, Object obj, Writer writer) throws IOException {
        if (obj instanceof String) {
            writer.e(i10, (String) obj);
        } else {
            writer.i(i10, (ByteString) obj);
        }
    }

    @Override // androidx.p001datastore.preferences.protobuf.x2
    public void a(T t10, T t11) {
        t11.getClass();
        for (int i10 = 0; i10 < this.f22413a.length; i10 += 3) {
            R(t10, t11, i10);
        }
        if (this.f22420h) {
            return;
        }
        z2.J(this.f22427o, t10, t11);
        if (this.f22418f) {
            z2.H(this.f22428p, t10, t11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:58:0x007e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0090 A[SYNTHETIC] */
    @Override // androidx.p001datastore.preferences.protobuf.x2
    public final boolean b(T t10) {
        int i10;
        int i11 = -1;
        int i12 = 0;
        for (int i13 = 0; i13 < this.f22423k; i13++) {
            int i14 = this.f22422j[i13];
            int iV = V(i14);
            int iU0 = u0(i14);
            if (this.f22420h) {
                i10 = 0;
            } else {
                int i15 = this.f22413a[i14 + 2];
                int i16 = f22406t & i15;
                i10 = 1 << (i15 >>> 20);
                if (i16 != i11) {
                    i12 = f22412z.getInt(t10, i16);
                    i11 = i16;
                }
            }
            if (K(iU0) && !E(t10, i14, i12, i10)) {
                return false;
            }
            int iT0 = t0(iU0);
            if (iT0 == 9 || iT0 == 17) {
                if (E(t10, i14, i12, i10) && !F(t10, iU0, v(i14))) {
                    return false;
                }
            } else if (iT0 == 27) {
                if (!G(t10, iU0, i14)) {
                    return false;
                }
            } else if (iT0 == 60 || iT0 == 68) {
                if (J(t10, iV, i14) && !F(t10, iU0, v(i14))) {
                    return false;
                }
            } else if (iT0 != 49) {
                if (iT0 == 50 && !H(t10, iU0, i14)) {
                    return false;
                }
            } else if (!G(t10, iU0, i14)) {
                return false;
            }
        }
        return !this.f22418f || this.f22428p.c(t10).E();
    }

    @Override // androidx.p001datastore.preferences.protobuf.x2
    public void c(T t10, Writer writer) throws IOException {
        if (writer.I() == Writer.FieldOrder.DESCENDING) {
            x0(t10, writer);
        } else if (this.f22420h) {
            w0(t10, writer);
        } else {
            v0(t10, writer);
        }
    }

    @Override // androidx.p001datastore.preferences.protobuf.x2
    public boolean d(T t10, T t11) {
        int length = this.f22413a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            if (!p(t10, t11, i10)) {
                return false;
            }
        }
        if (!this.f22427o.g(t10).equals(this.f22427o.g(t11))) {
            return false;
        }
        if (this.f22418f) {
            return this.f22428p.c(t10).equals(this.f22428p.c(t11));
        }
        return true;
    }

    @Override // androidx.p001datastore.preferences.protobuf.x2
    public void e(T t10, w2 w2Var, p0 p0Var) throws IOException {
        p0Var.getClass();
        N(this.f22427o, this.f22428p, t10, w2Var, p0Var);
    }

    /* JADX WARN: Code duplicated, block: B:120:0x035b A[PHI: r0 r18 r19 r28
  0x035b: PHI (r0v27 int) = (r0v21 int), (r0v24 int), (r0v29 int) binds: [B:131:0x03c5, B:127:0x03a2, B:119:0x0359] A[DONT_GENERATE, DONT_INLINE]
  0x035b: PHI (r18v5 int) = (r18v3 int), (r18v3 int), (r18v6 int) binds: [B:131:0x03c5, B:127:0x03a2, B:119:0x0359] A[DONT_GENERATE, DONT_INLINE]
  0x035b: PHI (r19v6 int) = (r19v4 int), (r19v4 int), (r19v7 int) binds: [B:131:0x03c5, B:127:0x03a2, B:119:0x0359] A[DONT_GENERATE, DONT_INLINE]
  0x035b: PHI (r28v7 sun.misc.Unsafe) = (r28v5 sun.misc.Unsafe), (r28v5 sun.misc.Unsafe), (r28v8 sun.misc.Unsafe) binds: [B:131:0x03c5, B:127:0x03a2, B:119:0x0359] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:133:0x03c8 A[PHI: r0 r18 r19 r28
  0x03c8: PHI (r0v25 int) = (r0v21 int), (r0v24 int), (r0v29 int) binds: [B:131:0x03c5, B:127:0x03a2, B:119:0x0359] A[DONT_GENERATE, DONT_INLINE]
  0x03c8: PHI (r18v4 int) = (r18v3 int), (r18v3 int), (r18v6 int) binds: [B:131:0x03c5, B:127:0x03a2, B:119:0x0359] A[DONT_GENERATE, DONT_INLINE]
  0x03c8: PHI (r19v5 int) = (r19v4 int), (r19v4 int), (r19v7 int) binds: [B:131:0x03c5, B:127:0x03a2, B:119:0x0359] A[DONT_GENERATE, DONT_INLINE]
  0x03c8: PHI (r28v6 sun.misc.Unsafe) = (r28v5 sun.misc.Unsafe), (r28v5 sun.misc.Unsafe), (r28v8 sun.misc.Unsafe) binds: [B:131:0x03c5, B:127:0x03a2, B:119:0x0359] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x008b. Please report as an issue. */
    int e0(T t10, byte[] bArr, int i10, int i11, int i12, l.b bVar) throws IOException {
        Unsafe unsafe;
        int i13;
        c2<T> c2Var;
        T t11;
        int i14;
        int iH;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        byte b10;
        int i24;
        int i25;
        int i26;
        int iL;
        int i27;
        c2<T> c2Var2 = this;
        t10 = t10;
        bArr = bArr;
        i11 = i11;
        i12 = i12;
        l.b bVar2 = bVar;
        Unsafe unsafe2 = f22412z;
        int iG = i10;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        int i31 = -1;
        int i32 = -1;
        while (true) {
            if (iG < i11) {
                int i33 = iG + 1;
                byte b11 = bArr[iG];
                if (b11 < 0) {
                    iH = l.H(b11, bArr, i33, bVar2);
                    i14 = bVar2.f22502a;
                } else {
                    i14 = b11;
                    iH = i33;
                }
                int i34 = i14 >>> 3;
                int i35 = i14 & 7;
                int iI0 = i34 > i31 ? c2Var2.i0(i34, i28 / 3) : c2Var2.h0(i34);
                if (iI0 == -1) {
                    i15 = i34;
                    i16 = iH;
                    i17 = i14;
                    i18 = i30;
                    i19 = i32;
                    unsafe = unsafe2;
                    i20 = i12;
                    i21 = 0;
                } else {
                    int i36 = c2Var2.f22413a[iI0 + 1];
                    int iT0 = t0(i36);
                    long jW = W(i36);
                    int i37 = i14;
                    if (iT0 <= 17) {
                        int i38 = c2Var2.f22413a[iI0 + 2];
                        int i39 = 1 << (i38 >>> 20);
                        int i40 = i38 & f22406t;
                        if (i40 != i32) {
                            b10 = -1;
                            if (i32 != -1) {
                                unsafe2.putInt(t10, i32, i30);
                            }
                            i30 = unsafe2.getInt(t10, i40);
                            i32 = i40;
                        } else {
                            b10 = -1;
                        }
                        switch (iT0) {
                            case 0:
                                i24 = iI0;
                                i15 = i34;
                                bArr = bArr;
                                i25 = iH;
                                i26 = i37;
                                if (i35 == 1) {
                                    z3.g0(t10, jW, l.d(bArr, i25));
                                    iG = i25 + 8;
                                    i30 |= i39;
                                    i28 = i24;
                                    i29 = i26;
                                    i31 = i15;
                                    i11 = i11;
                                } else {
                                    i20 = i12;
                                    i18 = i30;
                                    i19 = i32;
                                    i21 = i24;
                                    unsafe = unsafe2;
                                    i16 = i25;
                                    i17 = i26;
                                }
                                break;
                            case 1:
                                i24 = iI0;
                                i15 = i34;
                                bArr = bArr;
                                i25 = iH;
                                i26 = i37;
                                if (i35 == 5) {
                                    z3.i0(t10, jW, l.l(bArr, i25));
                                    iG = i25 + 4;
                                    i30 |= i39;
                                    i28 = i24;
                                    i29 = i26;
                                    i31 = i15;
                                    i11 = i11;
                                } else {
                                    i20 = i12;
                                    i18 = i30;
                                    i19 = i32;
                                    i21 = i24;
                                    unsafe = unsafe2;
                                    i16 = i25;
                                    i17 = i26;
                                }
                                break;
                            case 2:
                            case 3:
                                i24 = iI0;
                                i15 = i34;
                                bArr = bArr;
                                i25 = iH;
                                i26 = i37;
                                if (i35 == 0) {
                                    iL = l.L(bArr, i25, bVar2);
                                    unsafe2.putLong(t10, jW, bVar2.f22503b);
                                    i30 |= i39;
                                    i28 = i24;
                                    iG = iL;
                                    i29 = i26;
                                    i31 = i15;
                                    i11 = i11;
                                    i12 = i12;
                                } else {
                                    i20 = i12;
                                    i18 = i30;
                                    i19 = i32;
                                    i21 = i24;
                                    unsafe = unsafe2;
                                    i16 = i25;
                                    i17 = i26;
                                }
                                break;
                            case 4:
                            case 11:
                                i24 = iI0;
                                i15 = i34;
                                bArr = bArr;
                                i25 = iH;
                                i26 = i37;
                                if (i35 == 0) {
                                    iG = l.I(bArr, i25, bVar2);
                                    unsafe2.putInt(t10, jW, bVar2.f22502a);
                                    i30 |= i39;
                                    i28 = i24;
                                    i29 = i26;
                                    i31 = i15;
                                    i11 = i11;
                                } else {
                                    i20 = i12;
                                    i18 = i30;
                                    i19 = i32;
                                    i21 = i24;
                                    unsafe = unsafe2;
                                    i16 = i25;
                                    i17 = i26;
                                }
                                break;
                            case 5:
                            case 14:
                                i24 = iI0;
                                i15 = i34;
                                bArr = bArr;
                                i26 = i37;
                                if (i35 == 1) {
                                    i25 = iH;
                                    unsafe2.putLong(t10, jW, l.j(bArr, iH));
                                    iG = i25 + 8;
                                    i30 |= i39;
                                    i28 = i24;
                                    i29 = i26;
                                    i31 = i15;
                                    i11 = i11;
                                } else {
                                    i25 = iH;
                                    i20 = i12;
                                    i18 = i30;
                                    i19 = i32;
                                    i21 = i24;
                                    unsafe = unsafe2;
                                    i16 = i25;
                                    i17 = i26;
                                }
                                break;
                            case 6:
                            case 13:
                                i24 = iI0;
                                i15 = i34;
                                bArr = bArr;
                                i27 = i11;
                                i26 = i37;
                                if (i35 == 5) {
                                    unsafe2.putInt(t10, jW, l.h(bArr, iH));
                                    iG = iH + 4;
                                    i30 |= i39;
                                    i28 = i24;
                                    i29 = i26;
                                    i31 = i15;
                                    i11 = i27;
                                    i12 = i12;
                                } else {
                                    i25 = iH;
                                    i20 = i12;
                                    i18 = i30;
                                    i19 = i32;
                                    i21 = i24;
                                    unsafe = unsafe2;
                                    i16 = i25;
                                    i17 = i26;
                                }
                                break;
                            case 7:
                                i24 = iI0;
                                i15 = i34;
                                bArr = bArr;
                                i27 = i11;
                                i26 = i37;
                                if (i35 == 0) {
                                    iG = l.L(bArr, iH, bVar2);
                                    z3.X(t10, jW, bVar2.f22503b != 0);
                                    i30 |= i39;
                                    i28 = i24;
                                    i29 = i26;
                                    i31 = i15;
                                    i11 = i27;
                                    i12 = i12;
                                } else {
                                    i25 = iH;
                                    i20 = i12;
                                    i18 = i30;
                                    i19 = i32;
                                    i21 = i24;
                                    unsafe = unsafe2;
                                    i16 = i25;
                                    i17 = i26;
                                }
                                break;
                            case 8:
                                i24 = iI0;
                                i15 = i34;
                                bArr = bArr;
                                i27 = i11;
                                i26 = i37;
                                if (i35 == 2) {
                                    iG = (i36 & 536870912) == 0 ? l.C(bArr, iH, bVar2) : l.F(bArr, iH, bVar2);
                                    unsafe2.putObject(t10, jW, bVar2.f22504c);
                                    i30 |= i39;
                                    i28 = i24;
                                    i29 = i26;
                                    i31 = i15;
                                    i11 = i27;
                                    i12 = i12;
                                } else {
                                    i25 = iH;
                                    i20 = i12;
                                    i18 = i30;
                                    i19 = i32;
                                    i21 = i24;
                                    unsafe = unsafe2;
                                    i16 = i25;
                                    i17 = i26;
                                }
                                break;
                            case 9:
                                i24 = iI0;
                                i26 = i37;
                                i15 = i34;
                                bArr = bArr;
                                if (i35 == 2) {
                                    i27 = i11;
                                    iG = l.p(c2Var2.v(i24), bArr, iH, i27, bVar2);
                                    if ((i30 & i39) == 0) {
                                        unsafe2.putObject(t10, jW, bVar2.f22504c);
                                    } else {
                                        unsafe2.putObject(t10, jW, i1.v(unsafe2.getObject(t10, jW), bVar2.f22504c));
                                    }
                                    i30 |= i39;
                                    i28 = i24;
                                    i29 = i26;
                                    i31 = i15;
                                    i11 = i27;
                                    i12 = i12;
                                } else {
                                    i25 = iH;
                                    i20 = i12;
                                    i18 = i30;
                                    i19 = i32;
                                    i21 = i24;
                                    unsafe = unsafe2;
                                    i16 = i25;
                                    i17 = i26;
                                }
                                break;
                            case 10:
                                i24 = iI0;
                                i26 = i37;
                                i15 = i34;
                                bArr = bArr;
                                if (i35 == 2) {
                                    iG = l.b(bArr, iH, bVar2);
                                    unsafe2.putObject(t10, jW, bVar2.f22504c);
                                    i30 |= i39;
                                    i28 = i24;
                                    i29 = i26;
                                    i31 = i15;
                                    i11 = i11;
                                } else {
                                    i25 = iH;
                                    i20 = i12;
                                    i18 = i30;
                                    i19 = i32;
                                    i21 = i24;
                                    unsafe = unsafe2;
                                    i16 = i25;
                                    i17 = i26;
                                }
                                break;
                            case 12:
                                i24 = iI0;
                                i26 = i37;
                                i15 = i34;
                                bArr = bArr;
                                if (i35 == 0) {
                                    iG = l.I(bArr, iH, bVar2);
                                    int i41 = bVar2.f22502a;
                                    i1.e eVarT = c2Var2.t(i24);
                                    if (eVarT == null || eVarT.a(i41)) {
                                        unsafe2.putInt(t10, jW, i41);
                                        i30 |= i39;
                                    } else {
                                        w(t10).r(i26, Long.valueOf(i41));
                                    }
                                    i28 = i24;
                                    i29 = i26;
                                    i31 = i15;
                                    i11 = i11;
                                } else {
                                    i25 = iH;
                                    i20 = i12;
                                    i18 = i30;
                                    i19 = i32;
                                    i21 = i24;
                                    unsafe = unsafe2;
                                    i16 = i25;
                                    i17 = i26;
                                }
                                break;
                            case 15:
                                i24 = iI0;
                                i26 = i37;
                                i15 = i34;
                                bArr = bArr;
                                if (i35 == 0) {
                                    iG = l.I(bArr, iH, bVar2);
                                    unsafe2.putInt(t10, jW, w.b(bVar2.f22502a));
                                    i30 |= i39;
                                    i28 = i24;
                                    i29 = i26;
                                    i31 = i15;
                                    i11 = i11;
                                } else {
                                    i25 = iH;
                                    i20 = i12;
                                    i18 = i30;
                                    i19 = i32;
                                    i21 = i24;
                                    unsafe = unsafe2;
                                    i16 = i25;
                                    i17 = i26;
                                }
                                break;
                            case 16:
                                i24 = iI0;
                                i26 = i37;
                                i15 = i34;
                                if (i35 == 0) {
                                    bArr = bArr;
                                    iL = l.L(bArr, iH, bVar2);
                                    unsafe2.putLong(t10, jW, w.c(bVar2.f22503b));
                                    i30 |= i39;
                                    i28 = i24;
                                    iG = iL;
                                    i29 = i26;
                                    i31 = i15;
                                    i11 = i11;
                                    i12 = i12;
                                } else {
                                    i25 = iH;
                                    i20 = i12;
                                    i18 = i30;
                                    i19 = i32;
                                    i21 = i24;
                                    unsafe = unsafe2;
                                    i16 = i25;
                                    i17 = i26;
                                }
                                break;
                            case 17:
                                if (i35 == 3) {
                                    i24 = iI0;
                                    i15 = i34;
                                    i26 = i37;
                                    iG = l.n(c2Var2.v(iI0), bArr, iH, i11, (i34 << 3) | 4, bVar);
                                    if ((i30 & i39) == 0) {
                                        unsafe2.putObject(t10, jW, bVar2.f22504c);
                                    } else {
                                        unsafe2.putObject(t10, jW, i1.v(unsafe2.getObject(t10, jW), bVar2.f22504c));
                                    }
                                    i30 |= i39;
                                    bArr = bArr;
                                    i28 = i24;
                                    i29 = i26;
                                    i31 = i15;
                                    i11 = i11;
                                } else {
                                    i24 = iI0;
                                    i26 = i37;
                                    i15 = i34;
                                    i25 = iH;
                                    i20 = i12;
                                    i18 = i30;
                                    i19 = i32;
                                    i21 = i24;
                                    unsafe = unsafe2;
                                    i16 = i25;
                                    i17 = i26;
                                }
                                break;
                            default:
                                i25 = iH;
                                i24 = iI0;
                                i15 = i34;
                                i26 = i37;
                                i20 = i12;
                                i18 = i30;
                                i19 = i32;
                                i21 = i24;
                                unsafe = unsafe2;
                                i16 = i25;
                                i17 = i26;
                                break;
                        }
                    } else {
                        i15 = i34;
                        bArr = bArr;
                        int i42 = iH;
                        if (iT0 != 27) {
                            i21 = iI0;
                            i18 = i30;
                            if (iT0 <= 49) {
                                i19 = i32;
                                unsafe = unsafe2;
                                iG = g0(t10, bArr, i42, i11, i37, i15, i35, i21, i36, iT0, jW, bVar);
                                if (iG != i42) {
                                    i23 = i37;
                                    i23 = i37;
                                    i23 = i37;
                                    c2Var2 = this;
                                    i12 = i12;
                                    bVar2 = bVar;
                                    i31 = i15;
                                    i29 = i23;
                                    i32 = i19;
                                    i28 = i21;
                                    i30 = i18;
                                } else {
                                    i23 = i37;
                                    i23 = i37;
                                    i23 = i37;
                                    i16 = iG;
                                    i17 = i23;
                                    i20 = i12;
                                }
                                unsafe2 = unsafe;
                            } else {
                                unsafe = unsafe2;
                                i22 = i42;
                                i19 = i32;
                                if (iT0 != 50) {
                                    iG = d0(t10, bArr, i22, i11, i23, i15, i35, i36, iT0, jW, i21, bVar);
                                    if (iG != i22) {
                                        i23 = i37;
                                        i23 = i37;
                                        i23 = i37;
                                        c2Var2 = this;
                                        i12 = i12;
                                        bVar2 = bVar;
                                        i31 = i15;
                                        i29 = i23;
                                        i32 = i19;
                                        i28 = i21;
                                        i30 = i18;
                                    } else {
                                        i23 = i37;
                                        i23 = i37;
                                        i23 = i37;
                                        i16 = iG;
                                        i17 = i23;
                                        i20 = i12;
                                    }
                                    unsafe2 = unsafe;
                                } else if (i35 == 2) {
                                    iG = c0(t10, bArr, i22, i11, i21, jW, bVar);
                                    if (iG != i22) {
                                        i23 = i37;
                                        i23 = i37;
                                        i23 = i37;
                                        c2Var2 = this;
                                        i12 = i12;
                                        bVar2 = bVar;
                                        i31 = i15;
                                        i29 = i23;
                                        i32 = i19;
                                        i28 = i21;
                                        i30 = i18;
                                    } else {
                                        i23 = i37;
                                        i23 = i37;
                                        i23 = i37;
                                        i16 = iG;
                                        i17 = i23;
                                        i20 = i12;
                                    }
                                    unsafe2 = unsafe;
                                }
                            }
                        } else if (i35 == 2) {
                            i1.k kVarD2 = (i1.k) unsafe2.getObject(t10, jW);
                            if (!kVarD2.l1()) {
                                int size = kVarD2.size();
                                kVarD2 = kVarD2.d2(size == 0 ? 10 : size * 2);
                                unsafe2.putObject(t10, jW, kVarD2);
                            }
                            iG = l.q(c2Var2.v(iI0), i37, bArr, i42, i11, kVarD2, bVar);
                            i29 = i37;
                            i31 = i15;
                            i28 = iI0;
                            i30 = i30;
                            i11 = i11;
                        } else {
                            i21 = iI0;
                            i18 = i30;
                            i19 = i32;
                            unsafe = unsafe2;
                            i22 = i42;
                            i23 = i37;
                        }
                        i23 = i37;
                        i20 = i12;
                        i16 = i22;
                        i17 = i23;
                    }
                }
                if (i17 != i20 || i20 == 0) {
                    int i43 = i20;
                    iG = (!this.f22418f || bVar.f22505d == p0.d()) ? l.G(i17, bArr, i16, i11, w(t10), bVar) : l.g(i17, bArr, i16, i11, t10, this.f22417e, this.f22427o, bVar);
                    i29 = i17;
                    c2Var2 = this;
                    bVar2 = bVar;
                    i31 = i15;
                    i32 = i19;
                    i28 = i21;
                    i30 = i18;
                    i12 = i43;
                    unsafe2 = unsafe;
                } else {
                    c2Var = this;
                    i13 = i20;
                    iG = i16;
                    i29 = i17;
                    i32 = i19;
                    i30 = i18;
                }
            } else {
                unsafe = unsafe2;
                i13 = i12;
                c2Var = c2Var2;
            }
        }
        if (i32 != -1) {
            t11 = t10;
            unsafe.putInt(t11, i32, i30);
        } else {
            t11 = t10;
        }
        w3 w3Var = null;
        for (int i44 = c2Var.f22423k; i44 < c2Var.f22424l; i44++) {
            w3Var = (w3) c2Var.q(t11, c2Var.f22422j[i44], w3Var, c2Var.f22427o);
        }
        if (w3Var != null) {
            c2Var.f22427o.o(t11, w3Var);
        }
        if (i13 == 0) {
            if (iG != i11) {
                throw InvalidProtocolBufferException.h();
            }
        } else if (iG > i11 || i29 != i13) {
            throw InvalidProtocolBufferException.h();
        }
        return iG;
    }

    @Override // androidx.p001datastore.preferences.protobuf.x2
    public void f(T t10) {
        int i10;
        int i11 = this.f22423k;
        while (true) {
            i10 = this.f22424l;
            if (i11 >= i10) {
                break;
            }
            long jW = W(u0(this.f22422j[i11]));
            Object objO = z3.O(t10, jW);
            if (objO != null) {
                z3.q0(t10, jW, this.f22429q.c(objO));
            }
            i11++;
        }
        int length = this.f22422j.length;
        while (i10 < length) {
            this.f22426n.c(t10, this.f22422j[i10]);
            i10++;
        }
        this.f22427o.j(t10);
        if (this.f22418f) {
            this.f22428p.f(t10);
        }
    }

    @Override // androidx.p001datastore.preferences.protobuf.x2
    public int g(T t10) {
        return this.f22420h ? z(t10) : y(t10);
    }

    @Override // androidx.p001datastore.preferences.protobuf.x2
    public T h() {
        return (T) this.f22425m.a(this.f22417e);
    }

    @Override // androidx.p001datastore.preferences.protobuf.x2
    public int i(T t10) {
        int i10;
        int iS;
        int length = this.f22413a.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int iU0 = u0(i12);
            int iV = V(i12);
            long jW = W(iU0);
            int iHashCode = 37;
            switch (t0(iU0)) {
                case 0:
                    i10 = i11 * 53;
                    iS = i1.s(Double.doubleToLongBits(z3.D(t10, jW)));
                    i11 = i10 + iS;
                    break;
                case 1:
                    i10 = i11 * 53;
                    iS = Float.floatToIntBits(z3.F(t10, jW));
                    i11 = i10 + iS;
                    break;
                case 2:
                    i10 = i11 * 53;
                    iS = i1.s(z3.L(t10, jW));
                    i11 = i10 + iS;
                    break;
                case 3:
                    i10 = i11 * 53;
                    iS = i1.s(z3.L(t10, jW));
                    i11 = i10 + iS;
                    break;
                case 4:
                    i10 = i11 * 53;
                    iS = z3.I(t10, jW);
                    i11 = i10 + iS;
                    break;
                case 5:
                    i10 = i11 * 53;
                    iS = i1.s(z3.L(t10, jW));
                    i11 = i10 + iS;
                    break;
                case 6:
                    i10 = i11 * 53;
                    iS = z3.I(t10, jW);
                    i11 = i10 + iS;
                    break;
                case 7:
                    i10 = i11 * 53;
                    iS = i1.k(z3.u(t10, jW));
                    i11 = i10 + iS;
                    break;
                case 8:
                    i10 = i11 * 53;
                    iS = ((String) z3.O(t10, jW)).hashCode();
                    i11 = i10 + iS;
                    break;
                case 9:
                    Object objO = z3.O(t10, jW);
                    if (objO != null) {
                        iHashCode = objO.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i11 * 53;
                    iS = z3.O(t10, jW).hashCode();
                    i11 = i10 + iS;
                    break;
                case 11:
                    i10 = i11 * 53;
                    iS = z3.I(t10, jW);
                    i11 = i10 + iS;
                    break;
                case 12:
                    i10 = i11 * 53;
                    iS = z3.I(t10, jW);
                    i11 = i10 + iS;
                    break;
                case 13:
                    i10 = i11 * 53;
                    iS = z3.I(t10, jW);
                    i11 = i10 + iS;
                    break;
                case 14:
                    i10 = i11 * 53;
                    iS = i1.s(z3.L(t10, jW));
                    i11 = i10 + iS;
                    break;
                case 15:
                    i10 = i11 * 53;
                    iS = z3.I(t10, jW);
                    i11 = i10 + iS;
                    break;
                case 16:
                    i10 = i11 * 53;
                    iS = i1.s(z3.L(t10, jW));
                    i11 = i10 + iS;
                    break;
                case 17:
                    Object objO2 = z3.O(t10, jW);
                    if (objO2 != null) {
                        iHashCode = objO2.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i10 = i11 * 53;
                    iS = z3.O(t10, jW).hashCode();
                    i11 = i10 + iS;
                    break;
                case 50:
                    i10 = i11 * 53;
                    iS = z3.O(t10, jW).hashCode();
                    i11 = i10 + iS;
                    break;
                case 51:
                    if (J(t10, iV, i12)) {
                        i10 = i11 * 53;
                        iS = i1.s(Double.doubleToLongBits(Y(t10, jW)));
                        i11 = i10 + iS;
                    }
                    break;
                case 52:
                    if (J(t10, iV, i12)) {
                        i10 = i11 * 53;
                        iS = Float.floatToIntBits(Z(t10, jW));
                        i11 = i10 + iS;
                    }
                    break;
                case 53:
                    if (J(t10, iV, i12)) {
                        i10 = i11 * 53;
                        iS = i1.s(b0(t10, jW));
                        i11 = i10 + iS;
                    }
                    break;
                case 54:
                    if (J(t10, iV, i12)) {
                        i10 = i11 * 53;
                        iS = i1.s(b0(t10, jW));
                        i11 = i10 + iS;
                    }
                    break;
                case 55:
                    if (J(t10, iV, i12)) {
                        i10 = i11 * 53;
                        iS = a0(t10, jW);
                        i11 = i10 + iS;
                    }
                    break;
                case 56:
                    if (J(t10, iV, i12)) {
                        i10 = i11 * 53;
                        iS = i1.s(b0(t10, jW));
                        i11 = i10 + iS;
                    }
                    break;
                case 57:
                    if (J(t10, iV, i12)) {
                        i10 = i11 * 53;
                        iS = a0(t10, jW);
                        i11 = i10 + iS;
                    }
                    break;
                case 58:
                    if (J(t10, iV, i12)) {
                        i10 = i11 * 53;
                        iS = i1.k(X(t10, jW));
                        i11 = i10 + iS;
                    }
                    break;
                case 59:
                    if (J(t10, iV, i12)) {
                        i10 = i11 * 53;
                        iS = ((String) z3.O(t10, jW)).hashCode();
                        i11 = i10 + iS;
                    }
                    break;
                case 60:
                    if (J(t10, iV, i12)) {
                        i10 = i11 * 53;
                        iS = z3.O(t10, jW).hashCode();
                        i11 = i10 + iS;
                    }
                    break;
                case 61:
                    if (J(t10, iV, i12)) {
                        i10 = i11 * 53;
                        iS = z3.O(t10, jW).hashCode();
                        i11 = i10 + iS;
                    }
                    break;
                case 62:
                    if (J(t10, iV, i12)) {
                        i10 = i11 * 53;
                        iS = a0(t10, jW);
                        i11 = i10 + iS;
                    }
                    break;
                case 63:
                    if (J(t10, iV, i12)) {
                        i10 = i11 * 53;
                        iS = a0(t10, jW);
                        i11 = i10 + iS;
                    }
                    break;
                case 64:
                    if (J(t10, iV, i12)) {
                        i10 = i11 * 53;
                        iS = a0(t10, jW);
                        i11 = i10 + iS;
                    }
                    break;
                case 65:
                    if (J(t10, iV, i12)) {
                        i10 = i11 * 53;
                        iS = i1.s(b0(t10, jW));
                        i11 = i10 + iS;
                    }
                    break;
                case 66:
                    if (J(t10, iV, i12)) {
                        i10 = i11 * 53;
                        iS = a0(t10, jW);
                        i11 = i10 + iS;
                    }
                    break;
                case 67:
                    if (J(t10, iV, i12)) {
                        i10 = i11 * 53;
                        iS = i1.s(b0(t10, jW));
                        i11 = i10 + iS;
                    }
                    break;
                case 68:
                    if (J(t10, iV, i12)) {
                        i10 = i11 * 53;
                        iS = z3.O(t10, jW).hashCode();
                        i11 = i10 + iS;
                    }
                    break;
            }
        }
        int iHashCode2 = (i11 * 53) + this.f22427o.g(t10).hashCode();
        return this.f22418f ? (iHashCode2 * 53) + this.f22428p.c(t10).hashCode() : iHashCode2;
    }

    @Override // androidx.p001datastore.preferences.protobuf.x2
    public void j(T t10, byte[] bArr, int i10, int i11, l.b bVar) throws IOException {
        if (this.f22420h) {
            f0(t10, bArr, i10, i11, bVar);
        } else {
            e0(t10, bArr, i10, i11, 0, bVar);
        }
    }

    int x() {
        return this.f22413a.length * 3;
    }
}
