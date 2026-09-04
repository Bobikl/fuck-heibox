package kotlin.reflect.jvm.internal.impl.load.java;

import com.google.android.exoplayer2.source.rtsp.k0;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.taobao.aranger.constant.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.c1;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.r0;
import kotlin.collections.s0;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: BuiltinSpecialProperties.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final c f126008a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final Map<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.name.f> f126009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final Map<kotlin.reflect.jvm.internal.impl.name.f, List<kotlin.reflect.jvm.internal.impl.name.f>> f126010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final Set<kotlin.reflect.jvm.internal.impl.name.c> f126011d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final Set<kotlin.reflect.jvm.internal.impl.name.f> f126012e;

    static {
        kotlin.reflect.jvm.internal.impl.name.d dVar = kotlin.reflect.jvm.internal.impl.builtins.h.a.f125454s;
        kotlin.reflect.jvm.internal.impl.name.c cVar = kotlin.reflect.jvm.internal.impl.builtins.h.a.Y;
        Map<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.name.f> mapW = s0.W(c1.a(d.d(dVar, "name"), kotlin.reflect.jvm.internal.impl.name.f.f("name")), c1.a(d.d(dVar, "ordinal"), kotlin.reflect.jvm.internal.impl.name.f.f("ordinal")), c1.a(d.c(kotlin.reflect.jvm.internal.impl.builtins.h.a.U, UiKitSpanObj.TYPE_SIZE), kotlin.reflect.jvm.internal.impl.name.f.f(UiKitSpanObj.TYPE_SIZE)), c1.a(d.c(cVar, UiKitSpanObj.TYPE_SIZE), kotlin.reflect.jvm.internal.impl.name.f.f(UiKitSpanObj.TYPE_SIZE)), c1.a(d.d(kotlin.reflect.jvm.internal.impl.builtins.h.a.f125430g, k0.f48801p), kotlin.reflect.jvm.internal.impl.name.f.f(k0.f48801p)), c1.a(d.c(cVar, Constants.PARAM_KEYS), kotlin.reflect.jvm.internal.impl.name.f.f("keySet")), c1.a(d.c(cVar, "values"), kotlin.reflect.jvm.internal.impl.name.f.f("values")), c1.a(d.c(cVar, "entries"), kotlin.reflect.jvm.internal.impl.name.f.f("entrySet")));
        f126009b = mapW;
        Set<Map.Entry<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.name.f>> setEntrySet = mapW.entrySet();
        ArrayList<Pair> arrayList = new ArrayList(kotlin.collections.t.Y(setEntrySet, 10));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            arrayList.add(new Pair(((kotlin.reflect.jvm.internal.impl.name.c) entry.getKey()).g(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Pair pair : arrayList) {
            kotlin.reflect.jvm.internal.impl.name.f fVar = (kotlin.reflect.jvm.internal.impl.name.f) pair.f();
            Object arrayList2 = linkedHashMap.get(fVar);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(fVar, arrayList2);
            }
            ((List) arrayList2).add((kotlin.reflect.jvm.internal.impl.name.f) pair.e());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(r0.j(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), CollectionsKt___CollectionsKt.V1((Iterable) entry2.getValue()));
        }
        f126010c = linkedHashMap2;
        Set<kotlin.reflect.jvm.internal.impl.name.c> setKeySet = f126009b.keySet();
        f126011d = setKeySet;
        ArrayList arrayList3 = new ArrayList(kotlin.collections.t.Y(setKeySet, 10));
        Iterator<T> it2 = setKeySet.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((kotlin.reflect.jvm.internal.impl.name.c) it2.next()).g());
        }
        f126012e = CollectionsKt___CollectionsKt.V5(arrayList3);
    }

    private c() {
    }

    @dl.d
    public final Map<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.name.f> a() {
        return f126009b;
    }

    @dl.d
    public final List<kotlin.reflect.jvm.internal.impl.name.f> b(@dl.d kotlin.reflect.jvm.internal.impl.name.f name1) {
        f0.p(name1, "name1");
        List<kotlin.reflect.jvm.internal.impl.name.f> list = f126010c.get(name1);
        return list == null ? CollectionsKt__CollectionsKt.E() : list;
    }

    @dl.d
    public final Set<kotlin.reflect.jvm.internal.impl.name.c> c() {
        return f126011d;
    }

    @dl.d
    public final Set<kotlin.reflect.jvm.internal.impl.name.f> d() {
        return f126012e;
    }
}
