package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PermissionInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import com.xiaomi.push.C1339r;
import com.xiaomi.push.service.bj;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class v {

    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f106801a;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        public boolean f158a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f106802b;

        /* JADX INFO: renamed from: b, reason: collision with other field name */
        public boolean f159b;

        public b(String str, boolean z10, boolean z11, String str2) {
            this.f106801a = str;
            this.f158a = z10;
            this.f159b = z11;
            this.f106802b = str2;
        }
    }

    private static ActivityInfo a(PackageManager packageManager, Intent intent, Class<?> cls) {
        Iterator<ResolveInfo> it = packageManager.queryBroadcastReceivers(intent, 16384).iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (activityInfo != null && cls.getCanonicalName().equals(activityInfo.name)) {
                return activityInfo;
            }
        }
        return null;
    }

    public static void a(Context context) {
        new Thread(new w(context)).start();
    }

    private static void a(Context context, String str, String str2) {
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        Intent intent = new Intent(str);
        intent.setPackage(packageName);
        Iterator<ResolveInfo> it = packageManager.queryBroadcastReceivers(intent, 16384).iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            z10 = (activityInfo == null || TextUtils.isEmpty(activityInfo.name) || !activityInfo.name.equals(str2)) ? false : true;
            if (z10) {
                break;
            }
        }
        if (!z10) {
            throw new a(String.format("<receiver android:name=\"%1$s\" .../> is missing or disabled in AndroidManifest.", str2));
        }
    }

    private static void a(ActivityInfo activityInfo, Boolean[] boolArr) {
        if (boolArr[0].booleanValue() != activityInfo.enabled) {
            throw new a(String.format("<receiver android:name=\"%1$s\" .../> in AndroidManifest had the wrong enabled attribute, which should be android:enabled=%2$b.", activityInfo.name, boolArr[0]));
        }
        if (boolArr[1].booleanValue() != activityInfo.exported) {
            throw new a(String.format("<receiver android:name=\"%1$s\" .../> in AndroidManifest had the wrong exported attribute, which should be android:exported=%2$b.", activityInfo.name, boolArr[1]));
        }
    }

    private static boolean a(PackageInfo packageInfo, String[] strArr) {
        for (ServiceInfo serviceInfo : packageInfo.services) {
            if (a(strArr, serviceInfo.name)) {
                return true;
            }
        }
        return false;
    }

    private static boolean a(String[] strArr, String str) {
        if (strArr != null && str != null) {
            for (String str2 : strArr) {
                if (TextUtils.equals(str2, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:44:0x00a2 A[EDGE_INSN: B:44:0x00a2->B:30:0x00a2 BREAK  A[LOOP:0: B:15:0x006e->B:49:0x006e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x006e A[SYNTHETIC] */
    public static void c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        Intent intent = new Intent(bj.f107947q);
        intent.setPackage(packageName);
        try {
            ActivityInfo activityInfoA = a(packageManager, intent, C1339r.a(context, "com.xiaomi.push.service.receivers.PingReceiver"));
            if (MiPushClient.shouldUseMIUIPush(context)) {
                if (activityInfoA != null) {
                    a(activityInfoA, new Boolean[]{Boolean.TRUE, Boolean.FALSE});
                }
            } else {
                if (activityInfoA == null) {
                    throw new a(String.format("<receiver android:name=\"%1$s\" .../> is missing or disabled in AndroidManifest.", "com.xiaomi.push.service.receivers.PingReceiver"));
                }
                a(activityInfoA, new Boolean[]{Boolean.TRUE, Boolean.FALSE});
            }
        } catch (ClassNotFoundException e10) {
            com.xiaomi.channel.commonutils.logger.b.a(e10);
        }
        Intent intent2 = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
        intent2.setPackage(packageName);
        Iterator<ResolveInfo> it = packageManager.queryBroadcastReceivers(intent2, 16384).iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (activityInfo != null) {
                try {
                    if (!TextUtils.isEmpty(activityInfo.name) && PushMessageReceiver.class.isAssignableFrom(C1339r.a(context, activityInfo.name)) && activityInfo.enabled) {
                        z10 = true;
                    }
                    if (z10) {
                        break;
                    }
                } catch (ClassNotFoundException e11) {
                    com.xiaomi.channel.commonutils.logger.b.a(e11);
                }
            }
            z10 = false;
            if (z10) {
                break;
                break;
            }
        }
        if (!z10) {
            throw new a("Receiver: none of the subclasses of PushMessageReceiver is enabled or defined.");
        }
        if (MiPushClient.getOpenHmsPush(context)) {
            a(context, "com.huawei.android.push.intent.RECEIVE", "com.xiaomi.assemble.control.HmsPushReceiver");
            a(context, "com.huawei.intent.action.PUSH", "com.huawei.hms.support.api.push.PushEventReceiver");
        }
        if (MiPushClient.getOpenVIVOPush(context)) {
            a(context, "com.vivo.pushclient.action.RECEIVE", "com.xiaomi.assemble.control.FTOSPushMessageReceiver");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context, PackageInfo packageInfo) {
        boolean z10;
        HashSet hashSet = new HashSet();
        String str = context.getPackageName() + ".permission.MIPUSH_RECEIVE";
        hashSet.addAll(Arrays.asList("android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", str, "android.permission.ACCESS_WIFI_STATE", "android.permission.VIBRATE"));
        PermissionInfo[] permissionInfoArr = packageInfo.permissions;
        if (permissionInfoArr == null) {
            z10 = false;
            break;
        }
        int length = permissionInfoArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                z10 = false;
                break;
            } else {
                if (str.equals(permissionInfoArr[i10].name)) {
                    z10 = true;
                    break;
                }
                i10++;
            }
        }
        if (!z10) {
            throw new a(String.format("<permission android:name=\"%1$s\" .../> is undefined in AndroidManifest.", str));
        }
        String[] strArr = packageInfo.requestedPermissions;
        if (strArr != null) {
            for (String str2 : strArr) {
                if (!TextUtils.isEmpty(str2) && hashSet.contains(str2)) {
                    hashSet.remove(str2);
                    if (hashSet.isEmpty()) {
                        break;
                    }
                }
            }
        }
        if (!hashSet.isEmpty()) {
            throw new a(String.format("<uses-permission android:name=\"%1$s\"/> is missing in AndroidManifest.", hashSet.iterator().next()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Context context, PackageInfo packageInfo) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map2.put(PushMessageHandler.class.getCanonicalName(), new b(PushMessageHandler.class.getCanonicalName(), true, true, ""));
        map2.put(MessageHandleService.class.getCanonicalName(), new b(MessageHandleService.class.getCanonicalName(), true, false, ""));
        if (!MiPushClient.shouldUseMIUIPush(context) || a(packageInfo, new String[]{"com.xiaomi.push.service.XMJobService", "com.xiaomi.push.service.XMPushService"})) {
            map2.put("com.xiaomi.push.service.XMJobService", new b("com.xiaomi.push.service.XMJobService", true, false, "android.permission.BIND_JOB_SERVICE"));
            map2.put("com.xiaomi.push.service.XMPushService", new b("com.xiaomi.push.service.XMPushService", true, false, ""));
        }
        if (MiPushClient.getOpenFCMPush(context)) {
            map2.put("com.xiaomi.assemble.control.MiFireBaseInstanceIdService", new b("com.xiaomi.assemble.control.MiFireBaseInstanceIdService", true, false, ""));
            map2.put("com.xiaomi.assemble.control.MiFirebaseMessagingService", new b("com.xiaomi.assemble.control.MiFirebaseMessagingService", true, false, ""));
        }
        if (MiPushClient.getOpenOPPOPush(context)) {
            map2.put("com.xiaomi.assemble.control.COSPushMessageService", new b("com.xiaomi.assemble.control.COSPushMessageService", true, true, "com.coloros.mcs.permission.SEND_MCS_MESSAGE"));
        }
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                if (!TextUtils.isEmpty(serviceInfo.name) && map2.containsKey(serviceInfo.name)) {
                    b bVar = (b) map2.remove(serviceInfo.name);
                    boolean z10 = bVar.f158a;
                    boolean z11 = bVar.f159b;
                    String str = bVar.f106802b;
                    if (z10 != serviceInfo.enabled) {
                        throw new a(String.format("<service android:name=\"%1$s\" .../> in AndroidManifest had the wrong enabled attribute, which should be android:enabled=%2$b.", serviceInfo.name, Boolean.valueOf(z10)));
                    }
                    if (z11 != serviceInfo.exported) {
                        throw new a(String.format("<service android:name=\"%1$s\" .../> in AndroidManifest had the wrong exported attribute, which should be android:exported=%2$b.", serviceInfo.name, Boolean.valueOf(z11)));
                    }
                    if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, serviceInfo.permission)) {
                        throw new a(String.format("<service android:name=\"%1$s\" .../> in AndroidManifest had the wrong permission attribute, which should be android:permission=\"%2$s\".", serviceInfo.name, str));
                    }
                    map.put(serviceInfo.name, serviceInfo.processName);
                    if (map2.isEmpty()) {
                        break;
                    }
                }
            }
        }
        if (!map2.isEmpty()) {
            throw new a(String.format("<service android:name=\"%1$s\" .../> is missing or disabled in AndroidManifest.", map2.keySet().iterator().next()));
        }
        if (!TextUtils.equals((CharSequence) map.get(PushMessageHandler.class.getCanonicalName()), (CharSequence) map.get(MessageHandleService.class.getCanonicalName()))) {
            throw new a(String.format("\"%1$s\" and \"%2$s\" must be running in the same process.", PushMessageHandler.class.getCanonicalName(), MessageHandleService.class.getCanonicalName()));
        }
        if (map.containsKey("com.xiaomi.push.service.XMJobService") && map.containsKey("com.xiaomi.push.service.XMPushService") && !TextUtils.equals((CharSequence) map.get("com.xiaomi.push.service.XMJobService"), (CharSequence) map.get("com.xiaomi.push.service.XMPushService"))) {
            throw new a(String.format("\"%1$s\" and \"%2$s\" must be running in the same process.", "com.xiaomi.push.service.XMJobService", "com.xiaomi.push.service.XMPushService"));
        }
    }
}
