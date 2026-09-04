package com.vivo.push.util;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.database.Cursor;
import android.text.TextUtils;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: PushPackageUtils.java */
/* JADX INFO: loaded from: classes4.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Boolean f106691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f106692b;

    public static com.vivo.push.model.b a(Context context) {
        com.vivo.push.model.b bVarF;
        com.vivo.push.model.b bVarF2;
        Context applicationContext = ContextDelegate.getContext(context).getApplicationContext();
        com.vivo.push.model.b bVarD = d(applicationContext);
        if (bVarD != null) {
            p.d("PushPackageUtils", "get system push info :".concat(String.valueOf(bVarD)));
            return bVarD;
        }
        List<String> listE = e(applicationContext);
        com.vivo.push.model.b bVarF3 = f(applicationContext, applicationContext.getPackageName());
        if (listE.size() <= 0) {
            if (bVarF3 != null && bVarF3.d()) {
                bVarD = bVarF3;
            }
            p.a("PushPackageUtils", "findAllPushPackages error: find no package!");
        } else {
            com.vivo.push.model.b bVar = null;
            String strA = y.b(applicationContext).a("com.vivo.push.cur_pkg", null);
            if (TextUtils.isEmpty(strA) || !a(applicationContext, strA, "com.vivo.pushservice.action.METHOD") || (bVarF = f(applicationContext, strA)) == null || !bVarF.d()) {
                bVarF = null;
            }
            if (bVarF3 == null || !bVarF3.d()) {
                bVarF3 = null;
            }
            if (bVarF == null) {
                bVarF = null;
            }
            if (bVarF3 == null || (bVarF != null && (!bVarF3.c() ? !(bVarF.c() || bVarF3.b() > bVarF.b()) : !(bVarF.c() && bVarF3.b() > bVarF.b())))) {
                bVarF3 = bVarF;
            }
            HashMap map = new HashMap();
            if (bVarF3 == null) {
                bVarF3 = null;
            } else if (bVarF3.c()) {
                bVar = bVarF3;
                bVarF3 = null;
            }
            int size = listE.size();
            for (int i10 = 0; i10 < size; i10++) {
                String str = listE.get(i10);
                if (!TextUtils.isEmpty(str) && (bVarF2 = f(applicationContext, str)) != null) {
                    map.put(str, bVarF2);
                    if (bVarF2.d()) {
                        if (bVarF2.c()) {
                            if (bVar == null || bVarF2.b() > bVar.b()) {
                                bVar = bVarF2;
                            }
                        } else if (bVarF3 == null || bVarF2.b() > bVarF3.b()) {
                            bVarF3 = bVarF2;
                        }
                    }
                }
            }
            if (bVarF3 != null) {
                bVarD = bVarF3;
            } else {
                p.d("PushPackageUtils", "findSuitablePushPackage, all push app in balck list.");
                bVarD = bVar;
            }
        }
        if (bVarD == null) {
            p.b(applicationContext, "查找最优包为空!");
            p.d("PushPackageUtils", "finSuitablePushPackage is null");
        } else if (bVarD.c()) {
            p.a(applicationContext, "查找最优包为:" + bVarD.a() + "(" + bVarD.b() + ", Black)");
            p.d("PushPackageUtils", "finSuitablePushPackage" + bVarD.a() + "(" + bVarD.b() + ", Black)");
        } else {
            p.a(applicationContext, "查找最优包为:" + bVarD.a() + "(" + bVarD.b() + ")");
            p.d("PushPackageUtils", "finSuitablePushPackage" + bVarD.a() + "(" + bVarD.b() + ")");
        }
        return bVarD;
    }

    private static boolean a(Context context, long j10) {
        com.vivo.push.cache.d dVarA = com.vivo.push.cache.b.a().a(context);
        if (dVarA != null) {
            return dVarA.isInBlackList(j10);
        }
        return false;
    }

    public static boolean a(Context context, String str) {
        ServiceInfo serviceInfo;
        if (!TextUtils.isEmpty(str) && context != null) {
            Intent intent = new Intent("com.vivo.pushservice.action.PUSH_SERVICE");
            intent.setPackage(str);
            PackageManager packageManager = context.getPackageManager();
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, bb.c.b.f30606e8);
            if (listQueryIntentServices != null && listQueryIntentServices.size() > 0) {
                int size = listQueryIntentServices.size();
                boolean z10 = false;
                for (int i10 = 0; i10 < size; i10++) {
                    ResolveInfo resolveInfo = listQueryIntentServices.get(i10);
                    if (resolveInfo != null && (serviceInfo = resolveInfo.serviceInfo) != null) {
                        String str2 = serviceInfo.name;
                        boolean z11 = serviceInfo.exported;
                        if ("com.vivo.push.sdk.service.PushService".equals(str2) && z11) {
                            boolean z12 = resolveInfo.serviceInfo.enabled;
                            int componentEnabledSetting = packageManager.getComponentEnabledSetting(new ComponentName(str, "com.vivo.push.sdk.service.PushService"));
                            z10 = componentEnabledSetting == 1 || (componentEnabledSetting == 0 && z12);
                        }
                    }
                }
                return z10;
            }
            p.a("PushPackageUtils", "isEnablePush error: can not find push service.");
        }
        return false;
    }

    private static boolean a(Context context, String str, String str2) {
        List<ResolveInfo> listQueryBroadcastReceivers;
        Intent intent = new Intent(str2);
        intent.setPackage(str);
        try {
            listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, bb.c.b.f30606e8);
        } catch (Exception unused) {
            listQueryBroadcastReceivers = null;
        }
        return listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0;
    }

    public static int b(Context context, String str) {
        int i10 = a(context, str, "com.vivo.pushservice.action.RECEIVE") ? 0 : -1;
        if (a(context, str, "com.vivo.pushclient.action.RECEIVE")) {
            return 1;
        }
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00b0 A[Catch: Exception -> 0x009a, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x009a, blocks: (B:41:0x0096, B:55:0x00b0), top: B:71:0x0013 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x009b -> B:65:0x00b3). Please report as a decompilation issue!!! */
    public static String b(Context context) {
        String string;
        if (!TextUtils.isEmpty(f106692b)) {
            return f106692b;
        }
        Cursor cursor = null;
        try {
            try {
                try {
                    Cursor cursorQuery = context.getContentResolver().query(com.vivo.push.p.f106626a, null, null, null, null);
                    try {
                        if (cursorQuery != null) {
                            boolean z10 = false;
                            string = null;
                            while (cursorQuery.moveToNext()) {
                                try {
                                    if ("pushPkgName".equals(cursorQuery.getString(cursorQuery.getColumnIndex("name")))) {
                                        string = cursorQuery.getString(cursorQuery.getColumnIndex("value"));
                                    } else if ("pushEnable".equals(cursorQuery.getString(cursorQuery.getColumnIndex("name")))) {
                                        z10 = Boolean.parseBoolean(cursorQuery.getString(cursorQuery.getColumnIndex("value")));
                                    }
                                } catch (Exception e10) {
                                    e = e10;
                                    cursor = cursorQuery;
                                    p.a("PushPackageUtils", "getSystemPush", e);
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                }
                            }
                            f106692b = string;
                            if (TextUtils.isEmpty(string)) {
                                try {
                                    cursorQuery.close();
                                } catch (Exception e11) {
                                    p.a("PushPackageUtils", "close", e11);
                                }
                                return null;
                            }
                            if (z10) {
                                cursorQuery.close();
                                return string;
                            }
                            try {
                                cursorQuery.close();
                            } catch (Exception e12) {
                                p.a("PushPackageUtils", "close", e12);
                            }
                            return null;
                        }
                        try {
                            p.a("PushPackageUtils", "cursor is null");
                            if (cursorQuery != null) {
                                try {
                                    cursorQuery.close();
                                } catch (Exception e13) {
                                    p.a("PushPackageUtils", "close", e13);
                                }
                            }
                            return null;
                        } catch (Exception e14) {
                            e = e14;
                            string = null;
                        }
                        cursor = cursorQuery;
                        return string;
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = cursorQuery;
                        if (cursor != null) {
                            try {
                                cursor.close();
                            } catch (Exception e15) {
                                p.a("PushPackageUtils", "close", e15);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Exception e16) {
                e = e16;
                string = null;
            }
            p.a("PushPackageUtils", "getSystemPush", e);
            if (cursor != null) {
                cursor.close();
            }
        } catch (Exception e17) {
            p.a("PushPackageUtils", "close", e17);
        }
    }

    public static boolean c(Context context) {
        ProviderInfo providerInfoResolveContentProvider;
        Boolean bool = f106691a;
        if (bool != null) {
            return bool.booleanValue();
        }
        String str = null;
        if (context != null && !TextUtils.isEmpty("com.vivo.push.sdk.service.SystemPushConfig") && (providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.vivo.push.sdk.service.SystemPushConfig", 128)) != null) {
            str = providerInfoResolveContentProvider.packageName;
        }
        Boolean boolValueOf = Boolean.valueOf("BCC35D4D3606F154F0402AB7634E8490C0B244C2675C3C6238986987024F0C02".equals(g(context, str)));
        f106691a = boolValueOf;
        return boolValueOf.booleanValue();
    }

    public static boolean c(Context context, String str) {
        return a(context, str, "com.vivo.pushclient.action.RECEIVE");
    }

    private static com.vivo.push.model.b d(Context context) {
        String strB = b(context);
        ApplicationInfo applicationInfo = null;
        if (TextUtils.isEmpty(strB)) {
            return null;
        }
        com.vivo.push.model.b bVar = new com.vivo.push.model.b(strB);
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(strB, 128);
            if (packageInfo != null) {
                bVar.a(packageInfo.versionCode);
                bVar.a(packageInfo.versionName);
                applicationInfo = packageInfo.applicationInfo;
            }
            if (applicationInfo != null) {
                bVar.a(z.a(context, strB));
            }
            bVar.a(a(context, bVar.b()));
            bVar.b(a(context, strB));
            return bVar;
        } catch (Exception e10) {
            e10.printStackTrace();
            p.b("PushPackageUtils", "PackageManager NameNotFoundException is null", e10);
            return null;
        }
    }

    public static boolean d(Context context, String str) {
        return a(context, str, "com.vivo.pushservice.action.RECEIVE");
    }

    private static List<String> e(Context context) {
        List<ResolveInfo> listQueryIntentServices;
        g.a("findAllCoreClientPush");
        ArrayList arrayList = new ArrayList();
        try {
            listQueryIntentServices = context.getPackageManager().queryIntentServices(new Intent("com.vivo.pushservice.action.PUSH_SERVICE"), bb.c.b.f30606e8);
        } catch (Exception unused) {
            listQueryIntentServices = null;
        }
        if (listQueryIntentServices != null && listQueryIntentServices.size() > 0) {
            int size = listQueryIntentServices.size();
            for (int i10 = 0; i10 < size; i10++) {
                ResolveInfo resolveInfo = listQueryIntentServices.get(i10);
                if (resolveInfo != null) {
                    String str = resolveInfo.serviceInfo.packageName;
                    if (!TextUtils.isEmpty(str)) {
                        arrayList.add(str);
                    }
                }
            }
        }
        if (arrayList.size() <= 0) {
            p.d("PushPackageUtils", "get all push packages is null");
        }
        return arrayList;
    }

    public static boolean e(Context context, String str) {
        return a(context, str, "com.vivo.pushservice.action.METHOD");
    }

    private static com.vivo.push.model.b f(Context context, String str) {
        ApplicationInfo applicationInfo;
        if (!TextUtils.isEmpty(str)) {
            if (a(context, str, "com.vivo.pushservice.action.METHOD") || a(context, str, "com.vivo.pushservice.action.RECEIVE")) {
                com.vivo.push.model.b bVar = new com.vivo.push.model.b(str);
                try {
                    PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 128);
                    if (packageInfo != null) {
                        bVar.a(packageInfo.versionCode);
                        bVar.a(packageInfo.versionName);
                        applicationInfo = packageInfo.applicationInfo;
                    } else {
                        applicationInfo = null;
                    }
                    if (applicationInfo != null) {
                        bVar.a(z.a(context, str));
                    }
                    bVar.b(a(context, str));
                    bVar.a(a(context, bVar.b()));
                    return bVar;
                } catch (Exception e10) {
                    p.a("PushPackageUtils", "getPushPackageInfo exception: ", e10);
                }
            }
        }
        return null;
    }

    private static String g(Context context, String str) {
        if (!TextUtils.isEmpty(str) && context != null) {
            try {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo(str, 64).signatures;
                byte[] bArrDigest = MessageDigest.getInstance("SHA256").digest(signatureArr[0].toByteArray());
                StringBuffer stringBuffer = new StringBuffer();
                for (byte b10 : bArrDigest) {
                    String upperCase = Integer.toHexString(b10 & 255).toUpperCase(Locale.US);
                    if (upperCase.length() == 1) {
                        stringBuffer.append("0");
                    }
                    stringBuffer.append(upperCase);
                }
                return stringBuffer.toString();
            } catch (Exception e10) {
                p.a("PushPackageUtils", " getSignatureSHA exception ".concat(String.valueOf(e10)));
            }
        }
        return null;
    }
}
