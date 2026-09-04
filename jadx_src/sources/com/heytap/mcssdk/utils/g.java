package com.heytap.mcssdk.utils;

import android.content.Context;
import android.content.Intent;
import com.heytap.msp.push.mode.MessageStat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: StatUtil.java */
/* JADX INFO: loaded from: classes7.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f59976a = "type";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f59977b = "count";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f59978c = "list";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f59979d = 1017;

    private static boolean a(Context context) {
        String strR = com.heytap.mcssdk.d.P().R(context);
        return i.f(context, strR) && i.c(context, strR) >= 1017;
    }

    public static void b(Context context, MessageStat messageStat) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(messageStat);
        c(context, linkedList);
    }

    public static boolean c(Context context, List<MessageStat> list) {
        LinkedList linkedList = new LinkedList();
        linkedList.addAll(list);
        e.a("isSupportStatisticByMcs:" + a(context) + ",list size:" + linkedList.size());
        if (linkedList.size() <= 0 || !a(context)) {
            return false;
        }
        return d(context, linkedList);
    }

    private static boolean d(Context context, List<MessageStat> list) {
        try {
            Intent intent = new Intent();
            intent.setAction(com.heytap.mcssdk.d.P().b0(context));
            intent.setPackage(com.heytap.mcssdk.d.P().R(context));
            intent.putExtra(x9.b.f141140e, context.getPackageName());
            intent.putExtra("type", 12291);
            intent.putExtra("count", list.size());
            ArrayList<String> arrayList = new ArrayList<>();
            Iterator<MessageStat> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().toJsonObject());
            }
            intent.putStringArrayListExtra("list", arrayList);
            context.startService(intent);
            return true;
        } catch (Exception e10) {
            e.d("statisticMessage--Exception" + e10.getMessage());
            return false;
        }
    }
}
