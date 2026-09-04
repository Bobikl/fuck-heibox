package com.xiaomi.push.service;

import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import com.xiaomi.push.hm;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final Map<String, byte[]> f1120a = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ArrayList<Pair<String, byte[]>> f108050a = new ArrayList<>();

    public static void a(Context context, int i10, String str) {
        Map<String, byte[]> map = f1120a;
        synchronized (map) {
            for (String str2 : map.keySet()) {
                com.xiaomi.channel.commonutils.logger.b.m62a("notify registration error. " + str2);
                a(context, str2, f1120a.get(str2), i10, str);
            }
            f1120a.clear();
        }
    }

    public static void a(Context context, String str, byte[] bArr, int i10, String str2) {
        Intent intent = new Intent("com.xiaomi.mipush.ERROR");
        intent.setPackage(str);
        intent.putExtra("mipush_payload", bArr);
        intent.putExtra("mipush_error_code", i10);
        intent.putExtra("mipush_error_msg", str2);
        context.sendBroadcast(intent, ai.a(str));
    }

    public static void a(XMPushService xMPushService) {
        ArrayList<Pair<String, byte[]>> arrayList;
        try {
            synchronized (f108050a) {
                arrayList = f108050a;
                f108050a = new ArrayList<>();
            }
            boolean zA = com.xiaomi.push.s.a();
            for (Pair<String, byte[]> pair : arrayList) {
                ai.a(xMPushService, (String) pair.first, (byte[]) pair.second);
                if (!zA) {
                    try {
                        Thread.sleep(100L);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        } catch (hm e10) {
            com.xiaomi.channel.commonutils.logger.b.d("meet error when process pending message. " + e10);
            xMPushService.a(10, e10);
        }
    }

    public static void a(XMPushService xMPushService, boolean z10) {
        try {
            Map<String, byte[]> map = f1120a;
            synchronized (map) {
                try {
                    for (String str : map.keySet()) {
                        com.xiaomi.channel.commonutils.logger.b.m62a("processing pending registration request. " + str);
                        ai.a(xMPushService, str, f1120a.get(str));
                        if (z10 && !com.xiaomi.push.s.a()) {
                            try {
                                Thread.sleep(200L);
                            } catch (Exception unused) {
                            }
                        }
                    }
                    f1120a.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (hm e10) {
            com.xiaomi.channel.commonutils.logger.b.d("fail to deal with pending register request. " + e10);
            xMPushService.a(10, e10);
        }
    }

    public static void a(String str, byte[] bArr) {
        Map<String, byte[]> map = f1120a;
        synchronized (map) {
            com.xiaomi.channel.commonutils.logger.b.m62a("pending registration request. " + str);
            map.put(str, bArr);
        }
    }

    public static void b(String str, byte[] bArr) {
        synchronized (f108050a) {
            f108050a.add(new Pair<>(str, bArr));
            if (f108050a.size() > 50) {
                f108050a.remove(0);
            }
        }
    }
}
