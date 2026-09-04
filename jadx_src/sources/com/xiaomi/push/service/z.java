package com.xiaomi.push.service;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.xiaomi.push.dt;
import com.xiaomi.push.fo;
import com.xiaomi.push.gq;
import com.xiaomi.push.hm;
import com.xiaomi.push.hp;
import com.xiaomi.push.hr;
import com.xiaomi.push.hs;
import com.xiaomi.push.ig;
import com.xiaomi.push.in;
import com.xiaomi.push.ix;
import com.xiaomi.push.ja;
import com.xiaomi.push.jd;
import com.xiaomi.push.jj;
import com.xiaomi.push.jm;
import com.xiaomi.push.jo;
import com.xiaomi.push.jx;
import com.xiaomi.push.jy;
import com.xiaomi.push.kd;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class z {
    public static Intent a(byte[] bArr, long j10) {
        jj jjVarA = a(bArr);
        if (jjVarA == null) {
            return null;
        }
        Intent intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
        intent.putExtra("mipush_payload", bArr);
        intent.putExtra("mrt", Long.toString(j10));
        intent.setPackage(jjVarA.f751b);
        return intent;
    }

    public static jj a(Context context, jj jjVar) {
        return a(context, jjVar, (Map<String, String>) null);
    }

    public static jj a(Context context, jj jjVar, Map<String, String> map) {
        jd jdVar = new jd();
        jdVar.b(jjVar.m565a());
        ja jaVarM564a = jjVar.m564a();
        if (jaVarM564a != null) {
            jdVar.a(jaVarM564a.m530a());
            jdVar.a(jaVarM564a.m528a());
            if (!TextUtils.isEmpty(jaVarM564a.m535b())) {
                jdVar.c(jaVarM564a.m535b());
            }
        }
        jdVar.a(jx.m630a(context, jjVar));
        jj jjVarA = ai.a(jjVar.b(), jjVar.m565a(), jdVar, in.AckMessage);
        ja jaVarM564a2 = jjVar.m564a();
        if (jaVarM564a2 != null) {
            jaVarM564a2 = bs.a(jaVarM564a2.m529a());
        }
        jaVarM564a2.a("mat", Long.toString(System.currentTimeMillis()));
        jaVarM564a2.a("cs", String.valueOf(jx.a(context, jjVar)));
        if (map != null) {
            try {
                if (map.size() > 0) {
                    for (String str : map.keySet()) {
                        jaVarM564a2.a(str, map.get(str));
                    }
                }
            } catch (Throwable unused) {
            }
        }
        jjVarA.a(jaVarM564a2);
        return jjVarA;
    }

    public static jj a(byte[] bArr) {
        jj jjVar = new jj();
        try {
            jx.a(jjVar, bArr);
            return jjVar;
        } catch (Throwable th2) {
            com.xiaomi.channel.commonutils.logger.b.a(th2);
            return null;
        }
    }

    public static void a(Context context, jj jjVar, byte[] bArr) {
        try {
            al.c cVarM694a = al.m694a(context, jjVar, bArr);
            if (cVarM694a.f107876a > 0 && !TextUtils.isEmpty(cVarM694a.f1009a)) {
                ig.a(context, cVarM694a.f1009a, cVarM694a.f107876a, true, false, System.currentTimeMillis());
            }
            if (!com.xiaomi.push.j.m521a(context) || !ah.a(context, jjVar, cVarM694a.f1010a)) {
                b(context, jjVar, bArr);
            } else {
                ah.m689a(context, jjVar);
                com.xiaomi.channel.commonutils.logger.b.m62a("consume this broadcast by tts");
            }
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.m62a("notify push msg error " + e10);
            e10.printStackTrace();
        }
    }

    private static void a(XMPushService xMPushService, jj jjVar) {
        xMPushService.a(new aa(4, xMPushService, jjVar));
    }

    private static void a(XMPushService xMPushService, jj jjVar, jm jmVar) {
        xMPushService.a(new ag(4, jmVar, jjVar, xMPushService));
    }

    private static void a(XMPushService xMPushService, jj jjVar, String str) {
        xMPushService.a(new ae(4, xMPushService, jjVar, str));
    }

    private static void a(XMPushService xMPushService, jj jjVar, String str, String str2) {
        xMPushService.a(new af(4, xMPushService, jjVar, str, str2));
    }

    /* JADX WARN: Code duplicated, block: B:145:0x0436  */
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(XMPushService xMPushService, String str, byte[] bArr, Intent intent) {
        Object[] objArr;
        jj jjVarA = a(bArr);
        ja jaVarM564a = jjVarA.m564a();
        jy jyVarA = null;
        if (bArr != null) {
            dt.a(jjVarA.b(), xMPushService.getApplicationContext(), null, jjVarA.a(), bArr.length);
        }
        if (c(jjVarA) && a(xMPushService, str)) {
            if (al.e(jjVarA)) {
                fo.a(xMPushService.getApplicationContext()).a(jjVarA.b(), al.b(jjVarA), jaVarM564a.m530a(), "5");
            }
            c(xMPushService, jjVarA);
            return;
        }
        if (a(jjVarA) && !a(xMPushService, str) && !b(jjVarA)) {
            if (al.e(jjVarA)) {
                fo.a(xMPushService.getApplicationContext()).a(jjVarA.b(), al.b(jjVarA), jaVarM564a.m530a(), "6");
            }
            d(xMPushService, jjVarA);
            return;
        }
        if ((!al.m698a(jjVarA) || !com.xiaomi.push.g.c(xMPushService, jjVarA.f751b)) && !a(xMPushService, intent)) {
            if (!com.xiaomi.push.g.c(xMPushService, jjVarA.f751b)) {
                if (al.e(jjVarA)) {
                    fo.a(xMPushService.getApplicationContext()).b(jjVarA.b(), al.b(jjVarA), jaVarM564a.m530a(), "2");
                }
                a(xMPushService, jjVarA);
                return;
            } else {
                com.xiaomi.channel.commonutils.logger.b.m62a("receive a mipush message, we can see the app, but we can't see the receiver.");
                if (al.e(jjVarA)) {
                    fo.a(xMPushService.getApplicationContext()).b(jjVarA.b(), al.b(jjVarA), jaVarM564a.m530a(), "3");
                    return;
                }
                return;
            }
        }
        boolean z10 = false;
        if (in.Registration == jjVarA.a()) {
            String strB = jjVarA.b();
            SharedPreferences.Editor editorEdit = xMPushService.getSharedPreferences("pref_registered_pkg_names", 0).edit();
            editorEdit.putString(strB, jjVarA.f747a);
            editorEdit.commit();
            jo joVarA = o.a(jjVarA);
            if (joVarA.a() != 0 || TextUtils.isEmpty(joVarA.b())) {
                com.xiaomi.channel.commonutils.logger.b.d("read regSecret failed");
            } else {
                o.a(xMPushService, strB, joVarA.b());
            }
            w.a(xMPushService).e(strB);
            w.a(xMPushService).f(strB);
            fo.a(xMPushService.getApplicationContext()).a(strB, "E100003", jaVarM564a.m530a(), 6003, null);
            if (!TextUtils.isEmpty(jaVarM564a.m530a())) {
                intent.putExtra("messageId", jaVarM564a.m530a());
                intent.putExtra("eventMessageType", 6000);
            }
        }
        if (al.c(jjVarA)) {
            fo.a(xMPushService.getApplicationContext()).a(jjVarA.b(), al.b(jjVarA), jaVarM564a.m530a(), 1001, System.currentTimeMillis(), null);
            if (!TextUtils.isEmpty(jaVarM564a.m530a())) {
                intent.putExtra("messageId", jaVarM564a.m530a());
                intent.putExtra("eventMessageType", 1000);
            }
        }
        if (al.m702b(jjVarA)) {
            fo.a(xMPushService.getApplicationContext()).a(jjVarA.b(), al.b(jjVarA), jaVarM564a.m530a(), 2001, System.currentTimeMillis(), null);
            if (!TextUtils.isEmpty(jaVarM564a.m530a())) {
                intent.putExtra("messageId", jaVarM564a.m530a());
                intent.putExtra("eventMessageType", 2000);
            }
        }
        if (al.m698a(jjVarA)) {
            fo.a(xMPushService.getApplicationContext()).a(jjVarA.b(), al.b(jjVarA), jaVarM564a.m530a(), 3001, System.currentTimeMillis(), null);
            if (!TextUtils.isEmpty(jaVarM564a.m530a())) {
                intent.putExtra("messageId", jaVarM564a.m530a());
                intent.putExtra("eventMessageType", 3000);
            }
        }
        if (jaVarM564a != null && !TextUtils.isEmpty(jaVarM564a.m538c()) && !TextUtils.isEmpty(jaVarM564a.d()) && jaVarM564a.f661b != 1 && !al.m697a((Context) xMPushService, jjVarA.f751b, al.m699a(jaVarM564a.m531a()))) {
            Map<String, String> map = jaVarM564a.f659a;
            String strM530a = map != null ? map.get("jobkey") : null;
            if (TextUtils.isEmpty(strM530a)) {
                strM530a = jaVarM564a.m530a();
            }
            if (an.a(xMPushService, jjVarA.f751b, strM530a)) {
                fo.a(xMPushService.getApplicationContext()).c(jjVarA.b(), al.b(jjVarA), jaVarM564a.m530a(), "1:" + strM530a);
                com.xiaomi.channel.commonutils.logger.b.m62a("drop a duplicate message, key=" + strM530a);
            } else if (com.xiaomi.push.j.m521a((Context) xMPushService) && ah.m690a(jjVarA)) {
                com.xiaomi.channel.commonutils.logger.b.m62a("receive pull down message");
            } else {
                a(xMPushService, jjVarA, bArr);
            }
            b(xMPushService, jjVarA);
        } else if ("com.xiaomi.xmsf".contains(jjVarA.f751b) && !jjVarA.m572b() && jaVarM564a != null && jaVarM564a.m531a() != null && jaVarM564a.m531a().containsKey("ab")) {
            b(xMPushService, jjVarA);
            com.xiaomi.channel.commonutils.logger.b.c("receive abtest message. ack it." + jaVarM564a.m530a());
        } else if (a(xMPushService, str, jjVarA, jaVarM564a)) {
            if (jaVarM564a != null && !TextUtils.isEmpty(jaVarM564a.m530a())) {
                if (al.m702b(jjVarA)) {
                    fo.a(xMPushService.getApplicationContext()).a(jjVarA.b(), al.b(jjVarA), jaVarM564a.m530a(), 2002, null);
                } else if (al.m698a(jjVarA)) {
                    fo.a(xMPushService.getApplicationContext()).a(jjVarA.b(), al.b(jjVarA), jaVarM564a.m530a(), "7");
                } else if (al.c(jjVarA)) {
                    fo.a(xMPushService.getApplicationContext()).a(jjVarA.b(), al.b(jjVarA), jaVarM564a.m530a(), "8");
                } else if (al.d(jjVarA)) {
                    fo.a(xMPushService.getApplicationContext()).a(jjVarA.b(), "E100003", jaVarM564a.m530a(), 6004, null);
                }
            }
            if (in.Notification == jjVarA.f744a) {
                try {
                    jyVarA = cf.a(xMPushService, jjVarA);
                    if (jyVarA == null) {
                        com.xiaomi.channel.commonutils.logger.b.d("receiving an un-recognized notification message. " + jjVarA.f744a);
                        objArr = false;
                    } else {
                        objArr = true;
                    }
                } catch (kd e10) {
                    com.xiaomi.channel.commonutils.logger.b.d("receive a message which action string is not valid. " + e10);
                }
                if (objArr == true && (jyVarA instanceof jm)) {
                    jm jmVar = (jm) jyVarA;
                    if (!ix.CancelPushMessage.f623a.equals(jmVar.f768d) || jmVar.m580a() == null) {
                        z10 = true;
                    } else {
                        String str2 = jmVar.m580a().get(bj.Q);
                        int i10 = -2;
                        if (!TextUtils.isEmpty(str2)) {
                            try {
                                i10 = Integer.parseInt(str2);
                            } catch (NumberFormatException e11) {
                                com.xiaomi.channel.commonutils.logger.b.m62a("parse notifyId from STRING to INT failed: " + e11);
                            }
                        }
                        if (i10 >= -1) {
                            com.xiaomi.channel.commonutils.logger.b.m62a("try to retract a message by notifyId=" + i10);
                            al.a(xMPushService, jjVarA.f751b, i10);
                        } else {
                            String str3 = jmVar.m580a().get(bj.O);
                            String str4 = jmVar.m580a().get(bj.P);
                            com.xiaomi.channel.commonutils.logger.b.m62a("try to retract a message by title&description.");
                            al.a(xMPushService, jjVarA.f751b, str3, str4);
                        }
                        if (jaVarM564a != null && jaVarM564a.m531a() != null && com.xiaomi.push.j.m521a((Context) xMPushService) && "pulldown".equals(ax.a((Object) jaVarM564a.m531a()))) {
                            ah.a(jjVarA);
                        }
                        a(xMPushService, jjVarA, jmVar);
                    }
                } else {
                    z10 = true;
                }
            } else {
                z10 = true;
            }
            if (z10) {
                com.xiaomi.channel.commonutils.logger.b.m62a("broadcast passthrough message.");
                xMPushService.sendBroadcast(intent, ai.a(jjVarA.f751b));
            }
        } else {
            fo.a(xMPushService.getApplicationContext()).a(jjVarA.b(), al.b(jjVarA), jaVarM564a.m530a(), "9");
        }
        if (jjVarA.a() != in.UnRegistration || "com.xiaomi.xmsf".equals(xMPushService.getPackageName())) {
            return;
        }
        xMPushService.stopSelf();
    }

    private static void a(XMPushService xMPushService, byte[] bArr, long j10) {
        a(xMPushService, bArr, j10, (Map<String, String>) null);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006d  */
    private static void a(XMPushService xMPushService, byte[] bArr, long j10, Map<String, String> map) {
        byte[] bArr2;
        String str;
        Map<String, String> mapM531a;
        Map<String, String> mapM531a2;
        byte[] bArrA;
        jj jjVarA = a(bArr);
        if (jjVarA == null) {
            return;
        }
        if (TextUtils.isEmpty(jjVarA.f751b)) {
            com.xiaomi.channel.commonutils.logger.b.m62a("receive a mipush message without package name");
            return;
        }
        ja jaVarM564a = jjVarA.m564a();
        if (jaVarM564a == null || map == null || map.isEmpty() || (mapM531a2 = jaVarM564a.m531a()) == null || mapM531a2.isEmpty()) {
            bArr2 = bArr;
        } else {
            boolean z10 = false;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (mapM531a2.containsKey(entry.getKey())) {
                    mapM531a2.put(entry.getKey(), entry.getValue());
                    z10 = true;
                }
            }
            if (!z10 || (bArrA = jx.a(jjVarA)) == null || bArrA.length <= 0) {
                bArr2 = bArr;
            } else {
                bArr2 = bArrA;
            }
        }
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        Intent intentA = a(bArr2, lValueOf.longValue());
        String strA = al.a(jjVarA);
        ig.a(xMPushService, strA, j10, true, true, System.currentTimeMillis());
        if (jaVarM564a != null && jaVarM564a.m530a() != null) {
            com.xiaomi.channel.commonutils.logger.b.e(String.format("receive a message. appid=%1$s, msgid= %2$s, action=%3$s", jjVarA.m565a(), bc.a(jaVarM564a.m530a()), jjVarA.a()));
        }
        if (jaVarM564a != null) {
            jaVarM564a.a("mrt", Long.toString(lValueOf.longValue()));
        }
        in inVar = in.SendMessage;
        String strM530a = "";
        if (inVar == jjVarA.a() && w.a(xMPushService).m777a(jjVarA.f751b) && !al.m698a(jjVarA)) {
            if (jaVarM564a != null) {
                strM530a = jaVarM564a.m530a();
                if (al.e(jjVarA)) {
                    fo.a(xMPushService.getApplicationContext()).a(jjVarA.b(), al.b(jjVarA), strM530a, "1");
                }
            }
            com.xiaomi.channel.commonutils.logger.b.m62a("Drop a message for unregistered, msgid=" + strM530a);
            a(xMPushService, jjVarA, jjVarA.f751b);
            return;
        }
        if (inVar == jjVarA.a() && w.a(xMPushService).m779c(jjVarA.f751b) && !al.m698a(jjVarA)) {
            if (jaVarM564a != null) {
                strM530a = jaVarM564a.m530a();
                if (al.e(jjVarA)) {
                    fo.a(xMPushService.getApplicationContext()).a(jjVarA.b(), al.b(jjVarA), strM530a, "2");
                }
            }
            com.xiaomi.channel.commonutils.logger.b.m62a("Drop a message for push closed, msgid=" + strM530a);
            a(xMPushService, jjVarA, jjVarA.f751b);
            return;
        }
        if (inVar == jjVarA.a() && !TextUtils.equals(xMPushService.getPackageName(), "com.xiaomi.xmsf") && !TextUtils.equals(xMPushService.getPackageName(), jjVarA.f751b)) {
            com.xiaomi.channel.commonutils.logger.b.m62a("Receive a message with wrong package name, expect " + xMPushService.getPackageName() + ", received " + jjVarA.f751b);
            a(xMPushService, jjVarA, "unmatched_package", "package should be " + xMPushService.getPackageName() + ", but got " + jjVarA.f751b);
            if (jaVarM564a == null || !al.e(jjVarA)) {
                return;
            }
            fo.a(xMPushService.getApplicationContext()).a(jjVarA.b(), al.b(jjVarA), jaVarM564a.m530a(), "3");
            return;
        }
        if (inVar == jjVarA.a() && com.xiaomi.push.i.a() == 999) {
            str = strA;
            if (com.xiaomi.push.i.m469a((Context) xMPushService, str)) {
                com.xiaomi.channel.commonutils.logger.b.m62a("Receive the uninstalled dual app message");
                try {
                    ai.a(xMPushService, ai.a(str, jjVarA.m565a()));
                    com.xiaomi.channel.commonutils.logger.b.m62a("uninstall " + str + " msg sent");
                } catch (hm e10) {
                    com.xiaomi.channel.commonutils.logger.b.d("Fail to send Message: " + e10.getMessage());
                    xMPushService.a(10, e10);
                }
                al.m695a((Context) xMPushService, str);
                return;
            }
        } else {
            str = strA;
        }
        if (jaVarM564a == null || (mapM531a = jaVarM564a.m531a()) == null || !mapM531a.containsKey("hide") || !"true".equalsIgnoreCase(mapM531a.get("hide"))) {
            a(xMPushService, str, bArr2, intentA);
        } else {
            b(xMPushService, jjVarA);
        }
    }

    private static boolean a(Context context, Intent intent) {
        try {
            List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 32);
            return (listQueryBroadcastReceivers == null || listQueryBroadcastReceivers.isEmpty()) ? false : true;
        } catch (Exception unused) {
            return true;
        }
    }

    private static boolean a(Context context, String str) {
        Intent intent = new Intent("com.xiaomi.mipush.miui.CLICK_MESSAGE");
        intent.setPackage(str);
        Intent intent2 = new Intent("com.xiaomi.mipush.miui.RECEIVE_MESSAGE");
        intent2.setPackage(str);
        PackageManager packageManager = context.getPackageManager();
        try {
            return (packageManager.queryBroadcastReceivers(intent2, 32).isEmpty() && packageManager.queryIntentServices(intent, 32).isEmpty()) ? false : true;
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.a(e10);
            return false;
        }
    }

    public static boolean a(Context context, String str, byte[] bArr) {
        if (!com.xiaomi.push.g.m396a(context, str)) {
            return false;
        }
        Intent intent = new Intent("com.xiaomi.mipush.MESSAGE_ARRIVED");
        intent.putExtra("mipush_payload", bArr);
        intent.setPackage(str);
        try {
            if (context.getPackageManager().queryBroadcastReceivers(intent, 0).isEmpty()) {
                return false;
            }
            com.xiaomi.channel.commonutils.logger.b.m62a("broadcast message arrived.");
            context.sendBroadcast(intent, ai.a(str));
            return true;
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.m62a("meet error when broadcast message arrived. " + e10);
            return false;
        }
    }

    private static boolean a(jj jjVar) {
        return "com.xiaomi.xmsf".equals(jjVar.f751b) && jjVar.m564a() != null && jjVar.m564a().m531a() != null && jjVar.m564a().m531a().containsKey("miui_package_name");
    }

    private static boolean a(XMPushService xMPushService, String str, jj jjVar, ja jaVar) {
        boolean z10 = true;
        if (jaVar != null && jaVar.m531a() != null && jaVar.m531a().containsKey("__check_alive") && jaVar.m531a().containsKey("__awake")) {
            jm jmVar = new jm();
            jmVar.b(jjVar.m565a());
            jmVar.d(str);
            jmVar.c(ix.AwakeSystemApp.f623a);
            jmVar.a(jaVar.m530a());
            jmVar.f763a = new HashMap();
            boolean zM396a = com.xiaomi.push.g.m396a(xMPushService.getApplicationContext(), str);
            jmVar.f763a.put("app_running", Boolean.toString(zM396a));
            if (!zM396a) {
                boolean z11 = Boolean.parseBoolean(jaVar.m531a().get("__awake"));
                jmVar.f763a.put("awaked", Boolean.toString(z11));
                if (!z11) {
                    z10 = false;
                }
            }
            try {
                ai.a(xMPushService, ai.a(jjVar.b(), jjVar.m565a(), jmVar, in.Notification));
            } catch (hm e10) {
                com.xiaomi.channel.commonutils.logger.b.a(e10);
            }
        }
        return z10;
    }

    private static void b(Context context, jj jjVar, byte[] bArr) {
        if (al.m698a(jjVar)) {
            return;
        }
        String strA = al.a(jjVar);
        if (TextUtils.isEmpty(strA) || a(context, strA, bArr)) {
            return;
        }
        fo.a(context).b(strA, al.b(jjVar), jjVar.m564a().m530a(), "1");
    }

    private static void b(XMPushService xMPushService, jj jjVar) {
        xMPushService.a(new ab(4, xMPushService, jjVar));
    }

    private static boolean b(jj jjVar) {
        Map<String, String> mapM531a = jjVar.m564a().m531a();
        return mapM531a != null && mapM531a.containsKey("notify_effect");
    }

    private static void c(XMPushService xMPushService, jj jjVar) {
        xMPushService.a(new ac(4, xMPushService, jjVar));
    }

    private static boolean c(jj jjVar) {
        if (jjVar.m564a() == null || jjVar.m564a().m531a() == null) {
            return false;
        }
        return "1".equals(jjVar.m564a().m531a().get("obslete_ads_message"));
    }

    private static void d(XMPushService xMPushService, jj jjVar) {
        xMPushService.a(new ad(4, xMPushService, jjVar));
    }

    public void a(Context context, bf.b bVar, boolean z10, int i10, String str) {
        u uVarM773a;
        if (z10 || (uVarM773a = v.m773a(context)) == null || !"token-expired".equals(str)) {
            return;
        }
        v.a(context, uVarM773a.f108042f, uVarM773a.f108040d, uVarM773a.f108041e);
    }

    public void a(XMPushService xMPushService, gq gqVar, bf.b bVar) {
        try {
            byte[] bArrM420a = gqVar.m420a(bVar.f107918h);
            HashMap map = null;
            if (e.b(gqVar)) {
                map = new HashMap();
                map.put("t_im", String.valueOf(gqVar.m421b()));
                map.put("t_rt", String.valueOf(gqVar.m414a()));
            }
            a(xMPushService, bArrM420a, gqVar.c(), map);
        } catch (IllegalArgumentException e10) {
            com.xiaomi.channel.commonutils.logger.b.a(e10);
        }
    }

    public void a(XMPushService xMPushService, hs hsVar, bf.b bVar) {
        if (!(hsVar instanceof hr)) {
            com.xiaomi.channel.commonutils.logger.b.m62a("not a mipush message");
            return;
        }
        hr hrVar = (hr) hsVar;
        hp hpVarA = hrVar.a(com.umeng.analytics.pro.ak.aB);
        if (hpVarA != null) {
            try {
                a(xMPushService, bo.a(bo.a(bVar.f107918h, hrVar.j()), hpVarA.c()), ig.a(hsVar.mo456a()));
            } catch (IllegalArgumentException e10) {
                com.xiaomi.channel.commonutils.logger.b.a(e10);
            }
        }
    }
}
