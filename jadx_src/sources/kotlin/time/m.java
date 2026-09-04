package kotlin.time;

import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.u0;
import org.apache.tools.ant.util.s0;

/* JADX INFO: compiled from: measureTime.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class m {
    @u0(version = s0.f136932w)
    @k
    public static final long a(@dl.d r.b bVar, @dl.d yh.a<b2> block) {
        f0.p(bVar, "<this>");
        f0.p(block, "block");
        long jB = bVar.b();
        block.invoke();
        return r.b.a.h(jB);
    }

    @u0(version = "1.3")
    @k
    public static final long b(@dl.d r rVar, @dl.d yh.a<b2> block) {
        f0.p(rVar, "<this>");
        f0.p(block, "block");
        q qVarA = rVar.a();
        block.invoke();
        return qVarA.a();
    }

    @u0(version = "1.3")
    @k
    public static final long c(@dl.d yh.a<b2> block) {
        f0.p(block, "block");
        long jB = r.b.f128646b.b();
        block.invoke();
        return r.b.a.h(jB);
    }

    @u0(version = s0.f136932w)
    @dl.d
    @k
    public static final <T> s<T> d(@dl.d r.b bVar, @dl.d yh.a<? extends T> block) {
        f0.p(bVar, "<this>");
        f0.p(block, "block");
        return new s<>(block.invoke(), r.b.a.h(bVar.b()), null);
    }

    @u0(version = "1.3")
    @dl.d
    @k
    public static final <T> s<T> e(@dl.d r rVar, @dl.d yh.a<? extends T> block) {
        f0.p(rVar, "<this>");
        f0.p(block, "block");
        return new s<>(block.invoke(), rVar.a().a(), null);
    }

    @u0(version = "1.3")
    @dl.d
    @k
    public static final <T> s<T> f(@dl.d yh.a<? extends T> block) {
        f0.p(block, "block");
        return new s<>(block.invoke(), r.b.a.h(r.b.f128646b.b()), null);
    }
}
