package fi;

import kotlin.jvm.internal.f0;
import kotlin.u0;
import org.apache.tools.ant.util.s0;

/* JADX INFO: compiled from: Ranges.kt */
/* JADX INFO: loaded from: classes5.dex */
public class t {
    public static final void a(boolean z10, @dl.d Number step) {
        f0.p(step, "step");
        if (z10) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + step + lg.a.f131414g);
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;R::Lfi/g<TT;>;:Ljava/lang/Iterable<+TT;>;>(TR;TT;)Z */
    @u0(version = "1.3")
    @sh.f
    private static final boolean b(g gVar, Object obj) {
        f0.p(gVar, "<this>");
        return obj != null && gVar.a((Comparable) obj);
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;R::Lfi/r<TT;>;:Ljava/lang/Iterable<+TT;>;>(TR;TT;)Z */
    @u0(version = s0.f136932w)
    @kotlin.q
    @sh.f
    private static final boolean c(r rVar, Object obj) {
        f0.p(rVar, "<this>");
        return obj != null && rVar.a((Comparable) obj);
    }

    @u0(version = "1.1")
    @dl.d
    public static final f<Double> d(double d10, double d11) {
        return new d(d10, d11);
    }

    @u0(version = "1.1")
    @dl.d
    public static final f<Float> e(float f10, float f11) {
        return new e(f10, f11);
    }

    @dl.d
    public static final <T extends Comparable<? super T>> g<T> f(@dl.d T t10, @dl.d T that) {
        f0.p(t10, "<this>");
        f0.p(that, "that");
        return new i(t10, that);
    }

    @u0(version = s0.f136932w)
    @dl.d
    @kotlin.q
    public static final r<Double> g(double d10, double d11) {
        return new p(d10, d11);
    }

    @u0(version = s0.f136932w)
    @dl.d
    @kotlin.q
    public static final r<Float> h(float f10, float f11) {
        return new q(f10, f11);
    }

    @u0(version = s0.f136932w)
    @dl.d
    @kotlin.q
    public static final <T extends Comparable<? super T>> r<T> i(@dl.d T t10, @dl.d T that) {
        f0.p(t10, "<this>");
        f0.p(that, "that");
        return new h(t10, that);
    }
}
