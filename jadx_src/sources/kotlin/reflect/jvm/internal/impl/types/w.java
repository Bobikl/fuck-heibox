package kotlin.reflect.jvm.internal.impl.types;

import java.util.Set;

/* JADX INFO: compiled from: ErasureTypeAttributes.kt */
/* JADX INFO: loaded from: classes5.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final TypeUsage f128190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private final Set<kotlin.reflect.jvm.internal.impl.descriptors.y0> f128191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private final j0 f128192c;

    /* JADX WARN: Multi-variable type inference failed */
    public w(@dl.d TypeUsage howThisTypeIsUsed, @dl.e Set<? extends kotlin.reflect.jvm.internal.impl.descriptors.y0> set, @dl.e j0 j0Var) {
        kotlin.jvm.internal.f0.p(howThisTypeIsUsed, "howThisTypeIsUsed");
        this.f128190a = howThisTypeIsUsed;
        this.f128191b = set;
        this.f128192c = j0Var;
    }

    @dl.e
    public j0 a() {
        return this.f128192c;
    }

    @dl.d
    public TypeUsage b() {
        return this.f128190a;
    }

    @dl.e
    public Set<kotlin.reflect.jvm.internal.impl.descriptors.y0> c() {
        return this.f128191b;
    }

    @dl.d
    public w d(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.y0 typeParameter) {
        Set setF;
        kotlin.jvm.internal.f0.p(typeParameter, "typeParameter");
        TypeUsage typeUsageB = b();
        Set<kotlin.reflect.jvm.internal.impl.descriptors.y0> setC = c();
        if (setC == null || (setF = kotlin.collections.e1.D(setC, typeParameter)) == null) {
            setF = kotlin.collections.c1.f(typeParameter);
        }
        return new w(typeUsageB, setF, a());
    }

    public boolean equals(@dl.e Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return kotlin.jvm.internal.f0.g(wVar.a(), a()) && wVar.b() == b();
    }

    public int hashCode() {
        j0 j0VarA = a();
        int iHashCode = j0VarA != null ? j0VarA.hashCode() : 0;
        return iHashCode + (iHashCode * 31) + b().hashCode();
    }
}
