package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.s0;
import kotlin.collections.t;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.types.a1;
import kotlin.reflect.jvm.internal.impl.types.j0;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: compiled from: mappingUtil.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class i {
    @dl.d
    public static final a1 a(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d from, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.d to) {
        f0.p(from, "from");
        f0.p(to, "to");
        from.w().size();
        to.w().size();
        a1.a aVar = a1.f128047c;
        List<y0> listW = from.w();
        f0.o(listW, "from.declaredTypeParameters");
        ArrayList arrayList = new ArrayList(t.Y(listW, 10));
        Iterator<T> it = listW.iterator();
        while (it.hasNext()) {
            arrayList.add(((y0) it.next()).r());
        }
        List<y0> listW2 = to.w();
        f0.o(listW2, "to.declaredTypeParameters");
        ArrayList arrayList2 = new ArrayList(t.Y(listW2, 10));
        Iterator<T> it2 = listW2.iterator();
        while (it2.hasNext()) {
            j0 j0VarV = ((y0) it2.next()).v();
            f0.o(j0VarV, "it.defaultType");
            arrayList2.add(TypeUtilsKt.a(j0VarV));
        }
        return a1.a.e(aVar, s0.B0(CollectionsKt___CollectionsKt.d6(arrayList, arrayList2)), false, 2, null);
    }
}
