package androidx.navigation;

import android.os.Bundle;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: NavBackStackEntry.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.jvm.internal.t0({"SMAP\nNavBackStackEntry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavBackStackEntry.kt\nandroidx/navigation/NavBackStackEntryKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,309:1\n453#2:310\n403#2:311\n1238#3,4:312\n*S KotlinDebug\n*F\n+ 1 NavBackStackEntry.kt\nandroidx/navigation/NavBackStackEntryKt\n*L\n306#1:310\n306#1:311\n306#1:312,4\n*E\n"})
public final class t {
    public static final /* synthetic */ <T> T a(NavBackStackEntry navBackStackEntry) {
        kotlin.jvm.internal.f0.p(navBackStackEntry, "<this>");
        Bundle bundleC = navBackStackEntry.c();
        if (bundleC == null) {
            bundleC = new Bundle();
        }
        Map<String, p> mapV = navBackStackEntry.e().v();
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.collections.r0.j(mapV.size()));
        Iterator<T> it = mapV.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((p) entry.getValue()).b());
        }
        kotlin.jvm.internal.f0.y(6, androidx.exifinterface.media.a.f23244d5);
        kotlin.jvm.internal.k0.n("kotlinx.serialization.serializer.simple");
        return (T) androidx.navigation.serialization.f.a(kotlinx.serialization.t.i(null), bundleC, linkedHashMap);
    }
}
