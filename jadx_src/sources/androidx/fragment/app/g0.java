package androidx.fragment.app;

import java.util.Collection;
import java.util.Map;

/* JADX INFO: compiled from: FragmentManagerNonConfig.java */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.p0
    private final Collection<Fragment> f23705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.p0
    private final Map<String, g0> f23706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    private final Map<String, androidx.lifecycle.b1> f23707c;

    g0(@androidx.annotation.p0 Collection<Fragment> collection, @androidx.annotation.p0 Map<String, g0> map, @androidx.annotation.p0 Map<String, androidx.lifecycle.b1> map2) {
        this.f23705a = collection;
        this.f23706b = map;
        this.f23707c = map2;
    }

    @androidx.annotation.p0
    Map<String, g0> a() {
        return this.f23706b;
    }

    @androidx.annotation.p0
    Collection<Fragment> b() {
        return this.f23705a;
    }

    @androidx.annotation.p0
    Map<String, androidx.lifecycle.b1> c() {
        return this.f23707c;
    }

    boolean d(Fragment fragment) {
        Collection<Fragment> collection = this.f23705a;
        if (collection == null) {
            return false;
        }
        return collection.contains(fragment);
    }
}
