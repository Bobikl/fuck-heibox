package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.x;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MemberScope.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class g {
    @dl.e
    public static final Set<kotlin.reflect.jvm.internal.impl.name.f> a(@dl.d Iterable<? extends MemberScope> iterable) {
        f0.p(iterable, "<this>");
        HashSet hashSet = new HashSet();
        Iterator<? extends MemberScope> it = iterable.iterator();
        while (it.hasNext()) {
            Set<kotlin.reflect.jvm.internal.impl.name.f> setF = it.next().f();
            if (setF == null) {
                return null;
            }
            x.n0(hashSet, setF);
        }
        return hashSet;
    }
}
