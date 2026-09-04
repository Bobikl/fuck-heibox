package androidx.p001datastore.preferences.protobuf;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: SchemaUtil.java */
/* JADX INFO: loaded from: classes6.dex */
public final class z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Class<?> f22746a = D();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final v3<?, ?> f22747b = F(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final v3<?, ?> f22748c = F(true);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final v3<?, ?> f22749d = new x3();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f22750e = 40;

    private z2() {
    }

    static int A(List<Long> list) {
        int iB1;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof r1) {
            r1 r1Var = (r1) list;
            iB1 = 0;
            while (i10 < size) {
                iB1 += CodedOutputStream.b1(r1Var.getLong(i10));
                i10++;
            }
        } else {
            iB1 = 0;
            while (i10 < size) {
                iB1 += CodedOutputStream.b1(list.get(i10).longValue());
                i10++;
            }
        }
        return iB1;
    }

    private static void A0(int i10, String str, Writer writer) throws IOException {
        if (str == null || str.isEmpty()) {
            return;
        }
        writer.e(i10, str);
    }

    static <UT, UB> UB B(int i10, List<Integer> list, i1.d<?> dVar, UB ub2, v3<UT, UB> v3Var) {
        if (dVar == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int iIntValue = list.get(i12).intValue();
                if (dVar.a(iIntValue) != null) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(iIntValue));
                    }
                    i11++;
                } else {
                    ub2 = (UB) Q(i10, iIntValue, ub2, v3Var);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = it.next().intValue();
                if (dVar.a(iIntValue2) == null) {
                    ub2 = (UB) Q(i10, iIntValue2, ub2, v3Var);
                    it.remove();
                }
            }
        }
        return ub2;
    }

    public static void B0(int i10, List<String> list, Writer writer) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.A(i10, list);
    }

    static <UT, UB> UB C(int i10, List<Integer> list, i1.e eVar, UB ub2, v3<UT, UB> v3Var) {
        if (eVar == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int iIntValue = list.get(i12).intValue();
                if (eVar.a(iIntValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(iIntValue));
                    }
                    i11++;
                } else {
                    ub2 = (UB) Q(i10, iIntValue, ub2, v3Var);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = it.next().intValue();
                if (!eVar.a(iIntValue2)) {
                    ub2 = (UB) Q(i10, iIntValue2, ub2, v3Var);
                    it.remove();
                }
            }
        }
        return ub2;
    }

    public static void C0(int i10, int i11, Writer writer) throws IOException {
        if (i11 != 0) {
            writer.o(i10, i11);
        }
    }

    private static Class<?> D() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void D0(int i10, List<Integer> list, Writer writer, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.l(i10, list, z10);
    }

    static Object E(Class<?> cls, String str) {
        try {
            Field[] declaredFields = Class.forName(cls.getName() + "$" + R(str, true) + "DefaultEntryHolder").getDeclaredFields();
            if (declaredFields.length == 1) {
                return z3.Q(declaredFields[0]);
            }
            throw new IllegalStateException("Unable to look up map field default entry holder class for " + str + " in " + cls.getName());
        } catch (Throwable th2) {
            throw new RuntimeException(th2);
        }
    }

    public static void E0(int i10, long j10, Writer writer) throws IOException {
        if (j10 != 0) {
            writer.f(i10, j10);
        }
    }

    private static v3<?, ?> F(boolean z10) {
        try {
            Class<?> clsG = G();
            if (clsG == null) {
                return null;
            }
            return (v3) clsG.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void F0(int i10, List<Long> list, Writer writer, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.p(i10, list, z10);
    }

    private static Class<?> G() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static <T, FT extends y0.c<FT>> void H(q0<FT> q0Var, T t10, T t11) {
        y0<T> y0VarC = q0Var.c(t11);
        if (y0VarC.C()) {
            return;
        }
        q0Var.d(t10).J(y0VarC);
    }

    static <T> void I(u1 u1Var, T t10, T t11, long j10) {
        z3.q0(t10, j10, u1Var.a(z3.O(t10, j10), z3.O(t11, j10)));
    }

    static <T, UT, UB> void J(v3<UT, UB> v3Var, T t10, T t11) {
        v3Var.p(t10, v3Var.k(v3Var.g(t10), v3Var.g(t11)));
    }

    public static v3<?, ?> K() {
        return f22747b;
    }

    public static v3<?, ?> L() {
        return f22748c;
    }

    public static void M(Class<?> cls) {
        Class<?> cls2;
        if (!GeneratedMessageLite.class.isAssignableFrom(cls) && (cls2 = f22746a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean N(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static boolean O(int i10, int i11, int i12) {
        if (i11 < 40) {
            return true;
        }
        long j10 = i12;
        return ((((long) i11) - ((long) i10)) + 1) + 9 <= ((2 * j10) + 3) + ((j10 + 3) * 3);
    }

    public static boolean P(t0[] t0VarArr) {
        if (t0VarArr.length == 0) {
            return false;
        }
        return O(t0VarArr[0].o(), t0VarArr[t0VarArr.length - 1].o(), t0VarArr.length);
    }

    static <UT, UB> UB Q(int i10, int i11, UB ub2, v3<UT, UB> v3Var) {
        if (ub2 == null) {
            ub2 = v3Var.n();
        }
        v3Var.e(ub2, i10, i11);
        return ub2;
    }

    static String R(String str, boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if ('a' > cCharAt || cCharAt > 'z') {
                if ('A' > cCharAt || cCharAt > 'Z') {
                    if ('0' <= cCharAt && cCharAt <= '9') {
                        sb2.append(cCharAt);
                    }
                    z10 = true;
                } else if (i10 != 0 || z10) {
                    sb2.append(cCharAt);
                } else {
                    sb2.append((char) (cCharAt + ' '));
                }
            } else if (z10) {
                sb2.append((char) (cCharAt - ' '));
            } else {
                sb2.append(cCharAt);
            }
            z10 = false;
        }
        return sb2.toString();
    }

    public static v3<?, ?> S() {
        return f22749d;
    }

    public static void T(int i10, boolean z10, Writer writer) throws IOException {
        if (z10) {
            writer.s(i10, true);
        }
    }

    public static void U(int i10, List<Boolean> list, Writer writer, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.N(i10, list, z10);
    }

    public static void V(int i10, ByteString byteString, Writer writer) throws IOException {
        if (byteString == null || byteString.isEmpty()) {
            return;
        }
        writer.i(i10, byteString);
    }

    public static void W(int i10, List<ByteString> list, Writer writer) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.z(i10, list);
    }

    public static void X(int i10, double d10, Writer writer) throws IOException {
        if (Double.compare(d10, 0.0d) != 0) {
            writer.G(i10, d10);
        }
    }

    public static void Y(int i10, List<Double> list, Writer writer, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.y(i10, list, z10);
    }

    public static void Z(int i10, int i11, Writer writer) throws IOException {
        if (i11 != 0) {
            writer.Q(i10, i11);
        }
    }

    static int a(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? CodedOutputStream.X0(i10) + CodedOutputStream.D0(size) : size * CodedOutputStream.a0(i10, true);
    }

    public static void a0(int i10, List<Integer> list, Writer writer, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.E(i10, list, z10);
    }

    static int b(List<?> list) {
        return list.size();
    }

    public static void b0(int i10, int i11, Writer writer) throws IOException {
        if (i11 != 0) {
            writer.c(i10, i11);
        }
    }

    static int c(int i10, List<ByteString> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iX0 = size * CodedOutputStream.X0(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            iX0 += CodedOutputStream.h0(list.get(i11));
        }
        return iX0;
    }

    public static void c0(int i10, List<Integer> list, Writer writer, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.j(i10, list, z10);
    }

    static int d(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iE = e(list);
        return z10 ? CodedOutputStream.X0(i10) + CodedOutputStream.D0(iE) : iE + (size * CodedOutputStream.X0(i10));
    }

    public static void d0(int i10, long j10, Writer writer) throws IOException {
        if (j10 != 0) {
            writer.q(i10, j10);
        }
    }

    static int e(List<Integer> list) {
        int iL0;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof h1) {
            h1 h1Var = (h1) list;
            iL0 = 0;
            while (i10 < size) {
                iL0 += CodedOutputStream.l0(h1Var.getInt(i10));
                i10++;
            }
        } else {
            iL0 = 0;
            while (i10 < size) {
                iL0 += CodedOutputStream.l0(list.get(i10).intValue());
                i10++;
            }
        }
        return iL0;
    }

    public static void e0(int i10, List<Long> list, Writer writer, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.v(i10, list, z10);
    }

    static int f(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? CodedOutputStream.X0(i10) + CodedOutputStream.D0(size * 4) : size * CodedOutputStream.m0(i10, 0);
    }

    public static void f0(int i10, float f10, Writer writer) throws IOException {
        if (Float.compare(f10, 0.0f) != 0) {
            writer.P(i10, f10);
        }
    }

    static int g(List<?> list) {
        return list.size() * 4;
    }

    public static void g0(int i10, List<Float> list, Writer writer, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.a(i10, list, z10);
    }

    static int h(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? CodedOutputStream.X0(i10) + CodedOutputStream.D0(size * 8) : size * CodedOutputStream.o0(i10, 0L);
    }

    public static void h0(int i10, List<?> list, Writer writer) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.d(i10, list);
    }

    static int i(List<?> list) {
        return list.size() * 8;
    }

    public static void i0(int i10, List<?> list, Writer writer, x2 x2Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.B(i10, list, x2Var);
    }

    static int j(int i10, List<z1> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iS0 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iS0 += CodedOutputStream.s0(i10, list.get(i11));
        }
        return iS0;
    }

    public static void j0(int i10, int i11, Writer writer) throws IOException {
        if (i11 != 0) {
            writer.h(i10, i11);
        }
    }

    static int k(int i10, List<z1> list, x2 x2Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iT0 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iT0 += CodedOutputStream.t0(i10, list.get(i11), x2Var);
        }
        return iT0;
    }

    public static void k0(int i10, List<Integer> list, Writer writer, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.g(i10, list, z10);
    }

    static int l(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM = m(list);
        return z10 ? CodedOutputStream.X0(i10) + CodedOutputStream.D0(iM) : iM + (size * CodedOutputStream.X0(i10));
    }

    public static void l0(int i10, long j10, Writer writer) throws IOException {
        if (j10 != 0) {
            writer.L(i10, j10);
        }
    }

    static int m(List<Integer> list) {
        int iX0;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof h1) {
            h1 h1Var = (h1) list;
            iX0 = 0;
            while (i10 < size) {
                iX0 += CodedOutputStream.x0(h1Var.getInt(i10));
                i10++;
            }
        } else {
            iX0 = 0;
            while (i10 < size) {
                iX0 += CodedOutputStream.x0(list.get(i10).intValue());
                i10++;
            }
        }
        return iX0;
    }

    public static void m0(int i10, List<Long> list, Writer writer, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.R(i10, list, z10);
    }

    static int n(int i10, List<Long> list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        int iO = o(list);
        return z10 ? CodedOutputStream.X0(i10) + CodedOutputStream.D0(iO) : iO + (list.size() * CodedOutputStream.X0(i10));
    }

    public static void n0(int i10, List<?> list, Writer writer) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            ((l1) it.next()).o(writer, i10);
        }
    }

    static int o(List<Long> list) {
        int iZ0;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof r1) {
            r1 r1Var = (r1) list;
            iZ0 = 0;
            while (i10 < size) {
                iZ0 += CodedOutputStream.z0(r1Var.getLong(i10));
                i10++;
            }
        } else {
            iZ0 = 0;
            while (i10 < size) {
                iZ0 += CodedOutputStream.z0(list.get(i10).longValue());
                i10++;
            }
        }
        return iZ0;
    }

    public static void o0(int i10, Object obj, Writer writer) throws IOException {
        if (obj != null) {
            writer.K(i10, obj);
        }
    }

    static int p(int i10, Object obj, x2 x2Var) {
        return obj instanceof l1 ? CodedOutputStream.B0(i10, (l1) obj) : CodedOutputStream.G0(i10, (z1) obj, x2Var);
    }

    public static void p0(int i10, List<?> list, Writer writer) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.r(i10, list);
    }

    static int q(int i10, List<?> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iX0 = CodedOutputStream.X0(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            iX0 += obj instanceof l1 ? CodedOutputStream.C0((l1) obj) : CodedOutputStream.H0((z1) obj);
        }
        return iX0;
    }

    public static void q0(int i10, List<?> list, Writer writer, x2 x2Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.J(i10, list, x2Var);
    }

    static int r(int i10, List<?> list, x2 x2Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iX0 = CodedOutputStream.X0(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            iX0 += obj instanceof l1 ? CodedOutputStream.C0((l1) obj) : CodedOutputStream.I0((z1) obj, x2Var);
        }
        return iX0;
    }

    public static void r0(int i10, int i11, Writer writer) throws IOException {
        if (i11 != 0) {
            writer.t(i10, i11);
        }
    }

    static int s(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iT = t(list);
        return z10 ? CodedOutputStream.X0(i10) + CodedOutputStream.D0(iT) : iT + (size * CodedOutputStream.X0(i10));
    }

    public static void s0(int i10, List<Integer> list, Writer writer, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.M(i10, list, z10);
    }

    static int t(List<Integer> list) {
        int iS0;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof h1) {
            h1 h1Var = (h1) list;
            iS0 = 0;
            while (i10 < size) {
                iS0 += CodedOutputStream.S0(h1Var.getInt(i10));
                i10++;
            }
        } else {
            iS0 = 0;
            while (i10 < size) {
                iS0 += CodedOutputStream.S0(list.get(i10).intValue());
                i10++;
            }
        }
        return iS0;
    }

    public static void t0(int i10, long j10, Writer writer) throws IOException {
        if (j10 != 0) {
            writer.C(i10, j10);
        }
    }

    static int u(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iV = v(list);
        return z10 ? CodedOutputStream.X0(i10) + CodedOutputStream.D0(iV) : iV + (size * CodedOutputStream.X0(i10));
    }

    public static void u0(int i10, List<Long> list, Writer writer, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.H(i10, list, z10);
    }

    static int v(List<Long> list) {
        int iU0;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof r1) {
            r1 r1Var = (r1) list;
            iU0 = 0;
            while (i10 < size) {
                iU0 += CodedOutputStream.U0(r1Var.getLong(i10));
                i10++;
            }
        } else {
            iU0 = 0;
            while (i10 < size) {
                iU0 += CodedOutputStream.U0(list.get(i10).longValue());
                i10++;
            }
        }
        return iU0;
    }

    public static void v0(int i10, int i11, Writer writer) throws IOException {
        if (i11 != 0) {
            writer.S(i10, i11);
        }
    }

    static int w(int i10, List<?> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int iX0 = CodedOutputStream.X0(i10) * size;
        if (list instanceof n1) {
            n1 n1Var = (n1) list;
            while (i11 < size) {
                Object objT1 = n1Var.T1(i11);
                iX0 += objT1 instanceof ByteString ? CodedOutputStream.h0((ByteString) objT1) : CodedOutputStream.W0((String) objT1);
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                iX0 += obj instanceof ByteString ? CodedOutputStream.h0((ByteString) obj) : CodedOutputStream.W0((String) obj);
                i11++;
            }
        }
        return iX0;
    }

    public static void w0(int i10, List<Integer> list, Writer writer, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.x(i10, list, z10);
    }

    static int x(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY = y(list);
        return z10 ? CodedOutputStream.X0(i10) + CodedOutputStream.D0(iY) : iY + (size * CodedOutputStream.X0(i10));
    }

    public static void x0(int i10, long j10, Writer writer) throws IOException {
        if (j10 != 0) {
            writer.m(i10, j10);
        }
    }

    static int y(List<Integer> list) {
        int iZ0;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof h1) {
            h1 h1Var = (h1) list;
            iZ0 = 0;
            while (i10 < size) {
                iZ0 += CodedOutputStream.Z0(h1Var.getInt(i10));
                i10++;
            }
        } else {
            iZ0 = 0;
            while (i10 < size) {
                iZ0 += CodedOutputStream.Z0(list.get(i10).intValue());
                i10++;
            }
        }
        return iZ0;
    }

    public static void y0(int i10, List<Long> list, Writer writer, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.D(i10, list, z10);
    }

    static int z(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iA = A(list);
        return z10 ? CodedOutputStream.X0(i10) + CodedOutputStream.D0(iA) : iA + (size * CodedOutputStream.X0(i10));
    }

    public static void z0(int i10, Object obj, Writer writer) throws IOException {
        if (obj instanceof String) {
            A0(i10, (String) obj, writer);
        } else {
            V(i10, (ByteString) obj, writer);
        }
    }
}
