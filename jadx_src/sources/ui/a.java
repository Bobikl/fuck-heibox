package ui;

import dl.d;
import dl.e;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* JADX INFO: compiled from: scopeUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a {
    /* JADX WARN: Multi-variable type inference failed */
    @e
    public static final <T> Collection<T> a(@e Collection<? extends T> collection, @d Collection<? extends T> collection2) {
        f0.p(collection2, "collection");
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == 0) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    @d
    public static final kotlin.reflect.jvm.internal.impl.utils.d<MemberScope> b(@d Iterable<? extends MemberScope> scopes) {
        f0.p(scopes, "scopes");
        kotlin.reflect.jvm.internal.impl.utils.d<MemberScope> dVar = new kotlin.reflect.jvm.internal.impl.utils.d<>();
        for (MemberScope memberScope : scopes) {
            MemberScope memberScope2 = memberScope;
            if ((memberScope2 == null || memberScope2 == MemberScope.b.f127587b) ? false : true) {
                dVar.add(memberScope);
            }
        }
        return dVar;
    }
}
