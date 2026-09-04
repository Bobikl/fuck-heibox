package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.c0;
import kotlin.reflect.jvm.internal.impl.types.d0;

/* JADX INFO: compiled from: KotlinTypeRefiner.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final c0<n<u>> f128073a = new c0<>("KotlinTypeRefiner");

    @dl.d
    public static final c0<n<u>> a() {
        return f128073a;
    }

    @dl.d
    public static final List<d0> b(@dl.d f fVar, @dl.d Iterable<? extends d0> types) {
        f0.p(fVar, "<this>");
        f0.p(types, "types");
        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(types, 10));
        Iterator<? extends d0> it = types.iterator();
        while (it.hasNext()) {
            arrayList.add(fVar.a(it.next()));
        }
        return arrayList;
    }
}
