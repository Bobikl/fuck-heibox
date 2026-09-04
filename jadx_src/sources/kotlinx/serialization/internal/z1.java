package kotlinx.serialization.internal;

import java.util.Iterator;
import java.util.Map;
import kotlin.text.StringsKt__IndentKt;

/* JADX INFO: compiled from: Primitives.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.jvm.internal.t0({"SMAP\nPrimitives.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Primitives.kt\nkotlinx/serialization/internal/PrimitivesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,162:1\n1#2:163\n*E\n"})
public final class z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final Map<kotlin.reflect.d<? extends Object>, kotlinx.serialization.g<? extends Object>> f130794a = kotlin.collections.s0.W(kotlin.c1.a(kotlin.jvm.internal.n0.d(String.class), dj.a.K(kotlin.jvm.internal.v0.f124986a)), kotlin.c1.a(kotlin.jvm.internal.n0.d(Character.TYPE), dj.a.E(kotlin.jvm.internal.p.f124950a)), kotlin.c1.a(kotlin.jvm.internal.n0.d(char[].class), dj.a.e()), kotlin.c1.a(kotlin.jvm.internal.n0.d(Double.TYPE), dj.a.F(kotlin.jvm.internal.v.f124978a)), kotlin.c1.a(kotlin.jvm.internal.n0.d(double[].class), dj.a.f()), kotlin.c1.a(kotlin.jvm.internal.n0.d(Float.TYPE), dj.a.G(kotlin.jvm.internal.y.f124996a)), kotlin.c1.a(kotlin.jvm.internal.n0.d(float[].class), dj.a.g()), kotlin.c1.a(kotlin.jvm.internal.n0.d(Long.TYPE), dj.a.I(kotlin.jvm.internal.i0.f124923a)), kotlin.c1.a(kotlin.jvm.internal.n0.d(long[].class), dj.a.j()), kotlin.c1.a(kotlin.jvm.internal.n0.d(kotlin.r1.class), dj.a.z(kotlin.r1.f125022c)), kotlin.c1.a(kotlin.jvm.internal.n0.d(kotlin.s1.class), dj.a.t()), kotlin.c1.a(kotlin.jvm.internal.n0.d(Integer.TYPE), dj.a.H(kotlin.jvm.internal.d0.f124911a)), kotlin.c1.a(kotlin.jvm.internal.n0.d(int[].class), dj.a.h()), kotlin.c1.a(kotlin.jvm.internal.n0.d(kotlin.n1.class), dj.a.y(kotlin.n1.f125008c)), kotlin.c1.a(kotlin.jvm.internal.n0.d(kotlin.o1.class), dj.a.s()), kotlin.c1.a(kotlin.jvm.internal.n0.d(Short.TYPE), dj.a.J(kotlin.jvm.internal.r0.f124962a)), kotlin.c1.a(kotlin.jvm.internal.n0.d(short[].class), dj.a.p()), kotlin.c1.a(kotlin.jvm.internal.n0.d(kotlin.x1.class), dj.a.A(kotlin.x1.f128659c)), kotlin.c1.a(kotlin.jvm.internal.n0.d(kotlin.y1.class), dj.a.u()), kotlin.c1.a(kotlin.jvm.internal.n0.d(Byte.TYPE), dj.a.D(kotlin.jvm.internal.n.f124940a)), kotlin.c1.a(kotlin.jvm.internal.n0.d(byte[].class), dj.a.d()), kotlin.c1.a(kotlin.jvm.internal.n0.d(kotlin.j1.class), dj.a.x(kotlin.j1.f124867c)), kotlin.c1.a(kotlin.jvm.internal.n0.d(kotlin.k1.class), dj.a.r()), kotlin.c1.a(kotlin.jvm.internal.n0.d(Boolean.TYPE), dj.a.C(kotlin.jvm.internal.l.f124933a)), kotlin.c1.a(kotlin.jvm.internal.n0.d(boolean[].class), dj.a.c()), kotlin.c1.a(kotlin.jvm.internal.n0.d(kotlin.b2.class), dj.a.B(kotlin.b2.f124493a)), kotlin.c1.a(kotlin.jvm.internal.n0.d(Void.class), dj.a.m()), kotlin.c1.a(kotlin.jvm.internal.n0.d(kotlin.time.e.class), dj.a.L(kotlin.time.e.f128628c)));

    @dl.d
    public static final kotlinx.serialization.descriptors.f a(@dl.d String serialName, @dl.d kotlinx.serialization.descriptors.e kind) {
        kotlin.jvm.internal.f0.p(serialName, "serialName");
        kotlin.jvm.internal.f0.p(kind, "kind");
        d(serialName);
        return new y1(serialName, kind);
    }

    @dl.e
    public static final <T> kotlinx.serialization.g<T> b(@dl.d kotlin.reflect.d<T> dVar) {
        kotlin.jvm.internal.f0.p(dVar, "<this>");
        return (kotlinx.serialization.g) f130794a.get(dVar);
    }

    private static final String c(String str) {
        if (!(str.length() > 0)) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        char cCharAt = str.charAt(0);
        sb2.append((Object) (Character.isLowerCase(cCharAt) ? kotlin.text.c.N(cCharAt) : String.valueOf(cCharAt)));
        String strSubstring = str.substring(1);
        kotlin.jvm.internal.f0.o(strSubstring, "substring(...)");
        sb2.append(strSubstring);
        return sb2.toString();
    }

    private static final void d(String str) {
        Iterator<kotlin.reflect.d<? extends Object>> it = f130794a.keySet().iterator();
        while (it.hasNext()) {
            String strF = it.next().F();
            kotlin.jvm.internal.f0.m(strF);
            String strC = c(strF);
            if (kotlin.text.u.L1(str, "kotlin." + strC, true) || kotlin.text.u.L1(str, strC, true)) {
                throw new IllegalArgumentException(StringsKt__IndentKt.p("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name " + str + " there already exist " + c(strC) + "Serializer.\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
    }

    private static /* synthetic */ void e() {
    }
}
