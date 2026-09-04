package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.Collection;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.c1;
import kotlin.collections.d1;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* JADX INFO: compiled from: JavaToKotlinClassMapper.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final d f125544a = new d();

    private d() {
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.d f(d dVar, kotlin.reflect.jvm.internal.impl.name.c cVar, kotlin.reflect.jvm.internal.impl.builtins.g gVar, Integer num, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            num = null;
        }
        return dVar.e(cVar, gVar, num);
    }

    @dl.d
    public final kotlin.reflect.jvm.internal.impl.descriptors.d a(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d mutable) {
        f0.p(mutable, "mutable");
        kotlin.reflect.jvm.internal.impl.name.c cVarO = c.f125524a.o(kotlin.reflect.jvm.internal.impl.resolve.d.m(mutable));
        if (cVarO != null) {
            kotlin.reflect.jvm.internal.impl.descriptors.d dVarO = DescriptorUtilsKt.j(mutable).o(cVarO);
            f0.o(dVarO, "descriptor.builtIns.getB…Name(oppositeClassFqName)");
            return dVarO;
        }
        throw new IllegalArgumentException("Given class " + mutable + " is not a mutable collection");
    }

    @dl.d
    public final kotlin.reflect.jvm.internal.impl.descriptors.d b(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d readOnly) {
        f0.p(readOnly, "readOnly");
        kotlin.reflect.jvm.internal.impl.name.c cVarP = c.f125524a.p(kotlin.reflect.jvm.internal.impl.resolve.d.m(readOnly));
        if (cVarP != null) {
            kotlin.reflect.jvm.internal.impl.descriptors.d dVarO = DescriptorUtilsKt.j(readOnly).o(cVarP);
            f0.o(dVarO, "descriptor.builtIns.getB…Name(oppositeClassFqName)");
            return dVarO;
        }
        throw new IllegalArgumentException("Given class " + readOnly + " is not a read-only collection");
    }

    public final boolean c(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d mutable) {
        f0.p(mutable, "mutable");
        return c.f125524a.k(kotlin.reflect.jvm.internal.impl.resolve.d.m(mutable));
    }

    public final boolean d(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d readOnly) {
        f0.p(readOnly, "readOnly");
        return c.f125524a.l(kotlin.reflect.jvm.internal.impl.resolve.d.m(readOnly));
    }

    @dl.e
    public final kotlin.reflect.jvm.internal.impl.descriptors.d e(@dl.d kotlin.reflect.jvm.internal.impl.name.c fqName, @dl.d kotlin.reflect.jvm.internal.impl.builtins.g builtIns, @dl.e Integer num) {
        f0.p(fqName, "fqName");
        f0.p(builtIns, "builtIns");
        kotlin.reflect.jvm.internal.impl.name.b bVarM = (num == null || !f0.g(fqName, c.f125524a.h())) ? c.f125524a.m(fqName) : kotlin.reflect.jvm.internal.impl.builtins.h.a(num.intValue());
        if (bVarM != null) {
            return builtIns.o(bVarM.b());
        }
        return null;
    }

    @dl.d
    public final Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> g(@dl.d kotlin.reflect.jvm.internal.impl.name.c fqName, @dl.d kotlin.reflect.jvm.internal.impl.builtins.g builtIns) {
        f0.p(fqName, "fqName");
        f0.p(builtIns, "builtIns");
        kotlin.reflect.jvm.internal.impl.descriptors.d dVarF = f(this, fqName, builtIns, null, 4, null);
        if (dVarF == null) {
            return d1.k();
        }
        kotlin.reflect.jvm.internal.impl.name.c cVarP = c.f125524a.p(DescriptorUtilsKt.m(dVarF));
        if (cVarP == null) {
            return c1.f(dVarF);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.d dVarO = builtIns.o(cVarP);
        f0.o(dVarO, "builtIns.getBuiltInClass…otlinMutableAnalogFqName)");
        return CollectionsKt__CollectionsKt.L(dVarF, dVarO);
    }
}
