package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.t;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.d0;

/* JADX INFO: compiled from: util.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class g {
    @dl.d
    public static final List<b1> a(@dl.d Collection<? extends d0> newValueParameterTypes, @dl.d Collection<? extends b1> oldValueParameters, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.a newOwner) {
        f0.p(newValueParameterTypes, "newValueParameterTypes");
        f0.p(oldValueParameters, "oldValueParameters");
        f0.p(newOwner, "newOwner");
        newValueParameterTypes.size();
        oldValueParameters.size();
        List<Pair> listD6 = CollectionsKt___CollectionsKt.d6(newValueParameterTypes, oldValueParameters);
        ArrayList arrayList = new ArrayList(t.Y(listD6, 10));
        for (Pair pair : listD6) {
            d0 d0Var = (d0) pair.a();
            b1 b1Var = (b1) pair.b();
            int index = b1Var.getIndex();
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.e annotations = b1Var.getAnnotations();
            kotlin.reflect.jvm.internal.impl.name.f name = b1Var.getName();
            f0.o(name, "oldParameter.name");
            boolean zW = b1Var.W();
            boolean zC0 = b1Var.C0();
            boolean zA0 = b1Var.A0();
            d0 d0VarK = b1Var.F0() != null ? DescriptorUtilsKt.p(newOwner).t().k(d0Var) : null;
            t0 t0VarJ = b1Var.j();
            f0.o(t0VarJ, "oldParameter.source");
            arrayList.add(new ValueParameterDescriptorImpl(newOwner, null, index, annotations, name, d0Var, zW, zC0, zA0, d0VarK, t0VarJ));
        }
        return arrayList;
    }

    @dl.e
    public static final LazyJavaStaticClassScope b(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d dVar) {
        f0.p(dVar, "<this>");
        kotlin.reflect.jvm.internal.impl.descriptors.d dVarT = DescriptorUtilsKt.t(dVar);
        if (dVarT == null) {
            return null;
        }
        MemberScope memberScopeX0 = dVarT.x0();
        LazyJavaStaticClassScope lazyJavaStaticClassScope = memberScopeX0 instanceof LazyJavaStaticClassScope ? (LazyJavaStaticClassScope) memberScopeX0 : null;
        return lazyJavaStaticClassScope == null ? b(dVarT) : lazyJavaStaticClassScope;
    }
}
