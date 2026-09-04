package com.max.xiaoheihe.accelworld;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: AccelWorldJson.kt */
/* JADX INFO: loaded from: classes3.dex */
@t0({"SMAP\nAccelWorldJson.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccelWorldJson.kt\ncom/max/xiaoheihe/accelworld/AccelWorldJsonKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,16:1\n1855#2,2:17\n*S KotlinDebug\n*F\n+ 1 AccelWorldJson.kt\ncom/max/xiaoheihe/accelworld/AccelWorldJsonKt\n*L\n11#1:17,2\n*E\n"})
public final class k {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final void a(@dl.d JsonObject jsonObject, @dl.d String key, @dl.d List<String> list) {
        if (PatchProxy.proxy(new Object[]{jsonObject, key, list}, null, changeQuickRedirect, true, bb.c.m.iw, new Class[]{JsonObject.class, String.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(jsonObject, "<this>");
        f0.p(key, "key");
        f0.p(list, "list");
        JsonArray jsonArray = new JsonArray();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            jsonArray.add(new JsonPrimitive((String) it.next()));
        }
        jsonObject.add(key, jsonArray);
    }
}
