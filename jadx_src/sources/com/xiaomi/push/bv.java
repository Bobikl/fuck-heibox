package com.xiaomi.push;

import android.app.NotificationChannel;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.lzy.okgo.model.Progress;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class bv implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static SharedPreferences f106896a;

    public static String a() {
        return "dc_job_result_time_25";
    }

    public static void a(Context context) {
        if (context == null || !context.getPackageName().equals("com.xiaomi.xmsf")) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = jCurrentTimeMillis % 86400000;
        if (f106896a == null) {
            f106896a = context.getSharedPreferences("mipush_extra", 0);
        }
        String strA = a();
        long j11 = f106896a.getLong(strA, 0L);
        if (j11 <= 0) {
            Random random = new Random(jCurrentTimeMillis);
            f106896a.edit().putLong(strA, jCurrentTimeMillis + ((long) random.nextInt(46800000)) + (86400000 - j10) + ((long) (random.nextInt(15) * 86400000))).apply();
            return;
        }
        long j12 = jCurrentTimeMillis - j11;
        if (j12 >= 0) {
            f106896a.edit().putLong(strA, j11 + (((j12 / 1296000000) + 1) * 1296000000)).apply();
            new Thread(new bv()).start();
        } else if (Math.abs(j12) > 1296000000) {
            f106896a.edit().putLong(strA, jCurrentTimeMillis + ((long) new Random(jCurrentTimeMillis).nextInt(46800000)) + (86400000 - j10)).apply();
        }
    }

    private void a(Context context, bu buVar, br brVar) {
        ir irVar = new ir();
        irVar.d("category_app_channel_info");
        irVar.c("app_channel_info");
        irVar.b(buVar.toString());
        irVar.a(false);
        irVar.a(1L);
        irVar.a("xmsf_channel");
        irVar.b(System.currentTimeMillis());
        irVar.g("com.xiaomi.xmsf");
        irVar.e("com.xiaomi.xmsf");
        irVar.f(com.xiaomi.push.service.ca.a());
        com.xiaomi.push.service.cb.a(context, irVar);
    }

    private void a(br brVar, bq bqVar, Exception exc) {
        HashMap map = new HashMap();
        String strM774a = com.xiaomi.push.service.v.m774a(C1339r.m655a());
        if (!TextUtils.isEmpty(strM774a)) {
            map.put("uuid", strM774a);
        }
        map.put("appCount", Long.valueOf(brVar.m193a()));
        map.put(com.max.xiaoheihe.module.bbs.utils.b.f83401f, Long.valueOf(brVar.b()));
        map.put("packCount", Long.valueOf(brVar.c()));
        map.put(Progress.H, Long.valueOf(brVar.d()));
        map.put("isBatch", Integer.valueOf(brVar.a()));
        map.put("maxCallTime", Long.valueOf(bqVar.a()));
        map.put("minCallTime", Long.valueOf(bqVar.b()));
        map.put("callAvg", Long.valueOf(bqVar.c()));
        map.put("duration", Long.valueOf(bqVar.d()));
        if (exc != null) {
            map.put("exception", exc.toString());
        }
        gc.a().a("app_switch_upload", (Map<String, Object>) map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10, types: [com.xiaomi.push.bu] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13, types: [com.xiaomi.push.bu] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v9, types: [com.xiaomi.push.bu] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v3, types: [org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [com.xiaomi.push.bt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r24v0, types: [com.xiaomi.push.bv] */
    /* JADX WARN: Type inference failed for: r9v7, types: [com.xiaomi.push.bu, java.lang.Object] */
    @Override // java.lang.Runnable
    public void run() {
        br brVar;
        Exception exc;
        int size;
        String str;
        br brVar2;
        ?? btVar;
        ?? r11;
        ?? r12;
        List<NotificationChannel> listM718a;
        String str2;
        ?? r20;
        String str3 = "mipush_";
        String str4 = "com.xiaomi.xmsf";
        Context contextM655a = C1339r.m655a();
        if (contextM655a != null) {
            br brVar3 = new br();
            bq bqVar = new bq(50L, 1000L);
            try {
                Map<String, ?> all = C1339r.m655a().getSharedPreferences("pref_registered_pkg_names", 0).getAll();
                if (all == null || all.isEmpty()) {
                    brVar = brVar3;
                } else {
                    Set<String> setKeySet = all.keySet();
                    if (setKeySet.contains("com.xiaomi.xmsf")) {
                        try {
                            size = setKeySet.size() - 1;
                        } catch (Exception e10) {
                            exc = e10;
                            brVar = brVar3;
                        }
                    } else {
                        size = setKeySet.size();
                    }
                    brVar3.a(size);
                    bu buVar = new bu();
                    buVar.put(com.umeng.analytics.pro.ak.aF, brVar3.m193a());
                    Set<Map.Entry<String, ?>> setEntrySet = all.entrySet();
                    bt btVar2 = new bt();
                    jx.a();
                    Iterator<Map.Entry<String, ?>> it = setEntrySet.iterator();
                    ?? r13 = buVar;
                    ?? r14 = btVar2;
                    while (it.hasNext()) {
                        Map.Entry<String, ?> next = it.next();
                        String key = next.getKey();
                        String str5 = (String) next.getValue();
                        if (TextUtils.isEmpty(key) || str4.equals(key) || TextUtils.isEmpty(str5)) {
                            str = str3;
                            str4 = str4;
                            brVar2 = brVar3;
                            it = it;
                            r11 = r13;
                            btVar = r14;
                        } else {
                            ?? buVar2 = new bu();
                            buVar2.put(com.umeng.analytics.pro.ak.av, str5);
                            buVar2.put(com.umeng.analytics.pro.ak.aB, (String) bqVar.a(new bw(this, contextM655a, key)));
                            if (Build.VERSION.SDK_INT < 26 || (listM718a = com.xiaomi.push.service.aw.a(contextM655a, key).m718a()) == null || listM718a.isEmpty()) {
                                str = str3;
                                brVar2 = brVar3;
                                r12 = r14;
                            } else {
                                bt btVar3 = new bt();
                                brVar3.b(listM718a.size());
                                Iterator<NotificationChannel> it2 = listM718a.iterator();
                                ?? r15 = r14;
                                while (it2.hasNext()) {
                                    NotificationChannel next2 = it2.next();
                                    String id2 = next2.getId();
                                    bu buVar3 = new bu();
                                    Iterator<NotificationChannel> it3 = it2;
                                    br brVar4 = brVar3;
                                    if (id2.startsWith(str3)) {
                                        r20 = r15;
                                        try {
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append(str3);
                                            sb2.append(key);
                                            str2 = str3;
                                            sb2.append(lg.a.f131412e);
                                            String strReplace = id2.replace(sb2.toString(), "");
                                            buVar3.put("t", 1);
                                            buVar3.put(com.umeng.analytics.pro.ak.aF, strReplace);
                                        } catch (Exception e11) {
                                            exc = e11;
                                            brVar = brVar4;
                                        }
                                    } else {
                                        str2 = str3;
                                        r20 = r15;
                                        if (id2.startsWith("mipush|")) {
                                            String strReplace2 = id2.replace("mipush|" + key + "|", "");
                                            buVar3.put("t", 2);
                                            buVar3.put(com.umeng.analytics.pro.ak.aF, strReplace2);
                                        }
                                    }
                                    buVar3.put(com.umeng.analytics.pro.ak.aB, (String) bqVar.a(new bx(this, contextM655a, key, next2)));
                                    btVar3.put(buVar3);
                                    r15 = r20;
                                    it2 = it3;
                                    brVar3 = brVar4;
                                    str3 = str2;
                                }
                                str = str3;
                                brVar2 = brVar3;
                                buVar2.put(com.umeng.analytics.pro.ak.aF, btVar3);
                                r12 = r15;
                            }
                            r12.put(buVar2);
                            ?? r16 = r13;
                            r16.put("d", r12);
                            r11 = r16;
                            btVar = r12;
                        }
                        try {
                            if (r11.a() > 30720) {
                                brVar2.m194a();
                                brVar = brVar2;
                                try {
                                    brVar.c(r11.a());
                                    a(contextM655a, r11, brVar);
                                    bu buVar4 = new bu();
                                    buVar4.put(com.umeng.analytics.pro.ak.aF, brVar.m193a());
                                    r11 = buVar4;
                                    btVar = new bt();
                                } catch (Exception e12) {
                                    e = e12;
                                    exc = e;
                                    a(brVar, bqVar, exc);
                                }
                            } else {
                                brVar = brVar2;
                            }
                            brVar3 = brVar;
                            str4 = str4;
                            it = it;
                            str3 = str;
                            r13 = r11;
                            r14 = btVar;
                        } catch (Exception e13) {
                            e = e13;
                            brVar = brVar2;
                            exc = e;
                            a(brVar, bqVar, exc);
                        }
                    }
                    brVar = brVar3;
                    if (r14.length() > 0) {
                        brVar.m194a();
                        brVar.c(r13.a());
                        a(contextM655a, r13, brVar);
                    }
                }
                exc = null;
            } catch (Exception e14) {
                e = e14;
                brVar = brVar3;
            }
            a(brVar, bqVar, exc);
        }
    }
}
