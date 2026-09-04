package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class ik {
    private static HashMap<String, ArrayList<ir>> a(Context context, List<ir> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        HashMap<String, ArrayList<ir>> map = new HashMap<>();
        for (ir irVar : list) {
            a(context, irVar);
            ArrayList<ir> arrayList = map.get(irVar.c());
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                map.put(irVar.c(), arrayList);
            }
            arrayList.add(irVar);
        }
        return map;
    }

    private static void a(Context context, im imVar, HashMap<String, ArrayList<ir>> map) {
        for (Map.Entry<String, ArrayList<ir>> entry : map.entrySet()) {
            try {
                ArrayList<ir> value = entry.getValue();
                if (value != null && value.size() != 0) {
                    imVar.a(value, value.get(0).e(), entry.getKey());
                }
            } catch (Exception unused) {
            }
        }
    }

    public static void a(Context context, im imVar, List<ir> list) {
        HashMap<String, ArrayList<ir>> mapA = a(context, list);
        if (mapA != null && mapA.size() != 0) {
            a(context, imVar, mapA);
            return;
        }
        com.xiaomi.channel.commonutils.logger.b.m62a("TinyData TinyDataCacheUploader.uploadTinyData itemsUploading == null || itemsUploading.size() == 0  ts:" + System.currentTimeMillis());
    }

    private static void a(Context context, ir irVar) {
        if (irVar.f598a) {
            irVar.a("push_sdk_channel");
        }
        if (TextUtils.isEmpty(irVar.d())) {
            irVar.f(com.xiaomi.push.service.ca.a());
        }
        irVar.b(System.currentTimeMillis());
        if (TextUtils.isEmpty(irVar.e())) {
            irVar.e(context.getPackageName());
        }
        if (TextUtils.isEmpty(irVar.c())) {
            irVar.e(irVar.e());
        }
    }
}
