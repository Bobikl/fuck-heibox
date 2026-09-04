package androidx.navigation;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: NavArgument.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.jvm.internal.t0({"SMAP\nNavArgument.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavArgument.kt\nandroidx/navigation/NavArgumentKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,238:1\n494#2,7:239\n766#3:246\n857#3,2:247\n*S KotlinDebug\n*F\n+ 1 NavArgument.kt\nandroidx/navigation/NavArgumentKt\n*L\n234#1:239,7\n236#1:246\n236#1:247,2\n*E\n"})
public final class s {
    @dl.d
    public static final List<String> a(@dl.d Map<String, p> map, @dl.d yh.l<? super String, Boolean> isArgumentMissing) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(isArgumentMissing, "isArgumentMissing");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, p> entry : map.entrySet()) {
            p value = entry.getValue();
            Boolean boolValueOf = value != null ? Boolean.valueOf(value.e()) : null;
            kotlin.jvm.internal.f0.m(boolValueOf);
            if ((boolValueOf.booleanValue() || value.c()) ? false : true) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (isArgumentMissing.invoke((String) obj).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
