package com.igexin.push.util;

import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.Log;
import com.igexin.assist.sdk.AssistPushConsts;
import com.igexin.push.core.CoreConsts;
import com.igexin.sdk.GTIntentService;
import com.igexin.sdk.GetuiPushException;
import com.igexin.sdk.PushService;
import com.xiaomi.mipush.sdk.Constants;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.android.agoo.common.AgooConstants;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f64038a = "com.igexin.push.util.a";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Integer f64039b;

    private static void a(Map<String, com.igexin.push.core.bean.c> map, String str) {
        com.igexin.push.core.bean.c cVar = map.get(str);
        map.remove(str);
        for (String str2 : cVar.b()) {
            com.igexin.push.core.bean.c cVar2 = map.get(str2);
            if (cVar2 != null) {
                cVar2.e();
                if (cVar2.c() == 0) {
                    a(map, str2);
                }
            }
        }
    }

    public static boolean a() {
        try {
            if ("none".equals(com.igexin.push.config.l.f63431i)) {
                return false;
            }
            for (String str : com.igexin.push.config.l.f63431i.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
                if (d(str)) {
                    return false;
                }
            }
            if ("none".equals(com.igexin.push.config.l.f63432j)) {
                return false;
            }
            String[] strArrSplit = com.igexin.push.config.l.f63432j.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
            Class<?> cls = Class.forName("android.os.ServiceManager");
            Method method = cls.getMethod("getService", String.class);
            method.setAccessible(true);
            for (String str2 : strArrSplit) {
                if (a(cls, method, str2)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean a(long j10) {
        if (com.igexin.push.config.l.f63424b == 0) {
            return false;
        }
        Date date = new Date(j10);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int i10 = calendar.get(11);
        int i11 = com.igexin.push.config.l.f63423a + com.igexin.push.config.l.f63424b;
        if (i11 >= 24) {
            i11 -= 24;
        }
        int i12 = com.igexin.push.config.l.f63423a;
        if (i12 < i11) {
            if (i10 >= i12 && i10 < i11) {
                return true;
            }
        } else if (i12 > i11) {
            if (i10 >= 0 && i10 < i11) {
                return true;
            }
            if (i10 >= i12 && i10 < 24) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(Context context) {
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                return ((Boolean) NotificationManager.class.getDeclaredMethod("areNotificationsEnabled", new Class[0]).invoke((NotificationManager) context.getSystemService("notification"), new Object[0])).booleanValue();
            }
            AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            String packageName = context.getApplicationContext().getPackageName();
            int i10 = applicationInfo.uid;
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            return ((Integer) cls.getMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i10), packageName)).intValue() == 0;
        } catch (Throwable unused) {
            return true;
        }
    }

    public static boolean a(Context context, Class cls) {
        try {
            if (context == null) {
                Log.e(f64038a, "context can not set null ");
                return false;
            }
            PackageManager packageManager = context.getPackageManager();
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(new Intent(context, (Class<?>) cls), 0);
            if (listQueryIntentActivities != null && listQueryIntentActivities.size() > 0) {
                if (packageManager.getActivityInfo(new ComponentName(context.getPackageName(), cls.getName()), 128).theme == 16973840) {
                    return true;
                }
                Log.e(f64038a, cls.getName() + " need set theme Theme.Translucent.NoTitleBar");
                return false;
            }
            Log.e(f64038a, "not regist " + cls.getName() + "in manifest");
            return false;
        } catch (Throwable th2) {
            com.igexin.a.a.c.b.a(f64038a + "|" + th2.toString(), new Object[0]);
            return false;
        }
    }

    public static boolean a(Intent intent, Context context) {
        if (intent != null && context != null) {
            try {
                List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
                return listQueryIntentServices != null && listQueryIntentServices.size() > 0;
            } catch (Throwable th2) {
                com.igexin.a.a.c.b.a(f64038a + "|" + th2.toString(), new Object[0]);
            }
        }
        return false;
    }

    private static boolean a(Class<?> cls, Method method, String str) {
        try {
            return method.invoke(cls, str) != null;
        } catch (Exception unused) {
            return true;
        }
    }

    public static boolean a(String str) {
        try {
            return com.igexin.push.core.d.f63671e.getPackageManager().getLaunchIntentForPackage(str) != null;
        } catch (Exception unused) {
            return false;
        }
    }

    public static <T extends Service> boolean a(String str, Context context, Class<T> cls) {
        if (cls == null) {
            try {
                if (!a(new Intent(context, Class.forName(CoreConsts.f63466p)), context)) {
                    com.igexin.a.a.c.a.c.a().a("call - > initialize, parameter [userServiceName] is null use default PushService, but didn't find class \"com.igexin.sdk.PushService\", please check your AndroidManifest");
                    return false;
                }
            } catch (Throwable th2) {
                com.igexin.a.a.c.b.a(f64038a + "|" + th2.toString(), new Object[0]);
                return false;
            }
        }
        if (cls != null && CoreConsts.f63466p.equals(cls.getName()) && !a(new Intent(context, (Class<?>) cls), context)) {
            com.igexin.a.a.c.a.c.a().a("call - > initialize, parameter [userServiceName] is default PushService, but didn't find class \"com.igexin.sdk.PushService\", please check your AndroidManifest");
            return false;
        }
        if (cls == null || a(new Intent(context, (Class<?>) cls), context)) {
            if (cls == null) {
                return true;
            }
            Class.forName(cls.getName());
            return true;
        }
        com.igexin.a.a.c.a.c.a().a("call - > initialize, parameter [userServiceName] is set, but didn't find class \"" + cls.getName() + "\", please check your AndroidManifest");
        return false;
    }

    public static boolean a(JSONObject jSONObject) {
        String string;
        String str = "buttons";
        String str2 = "type";
        String str3 = "actionid";
        try {
            HashMap map = new HashMap();
            JSONArray jSONArray = jSONObject.getJSONArray("action_chains");
            int i10 = 0;
            while (i10 < jSONArray.length()) {
                JSONObject jSONObject2 = (JSONObject) jSONArray.get(i10);
                com.igexin.push.core.bean.c cVar = new com.igexin.push.core.bean.c();
                if (jSONObject2.has(str3)) {
                    cVar.a(jSONObject2.getString(str3));
                    if (map.containsKey(cVar.a())) {
                        return true;
                    }
                    ArrayList arrayList = new ArrayList();
                    if (jSONObject2.has(str2)) {
                        String string2 = jSONObject2.getString(str2);
                        if (AgooConstants.MESSAGE_POPUP.equals(string2)) {
                            if (jSONObject2.has(str)) {
                                JSONArray jSONArray2 = jSONObject2.getJSONArray(str);
                                for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                                    if (((JSONObject) jSONArray2.get(i11)).has("do")) {
                                        arrayList.add(((JSONObject) jSONArray2.get(i11)).getString("do"));
                                    }
                                }
                            }
                            if (jSONObject2.has("do")) {
                                string = jSONObject2.getString("do");
                                arrayList.add(string);
                            }
                        } else {
                            str = str;
                            if ("startapp".equals(string2)) {
                                if (jSONObject2.has("noinstall_action")) {
                                    arrayList.add(jSONObject2.getString("noinstall_action"));
                                }
                                if (jSONObject2.has("do")) {
                                    string = jSONObject2.getString("do");
                                    arrayList.add(string);
                                }
                            } else if ("checkapp".equals(string2)) {
                                if (jSONObject2.has("do_installed")) {
                                    arrayList.add(jSONObject2.getString("do_installed"));
                                }
                                if (jSONObject2.has("do_uninstalled")) {
                                    string = jSONObject2.getString("do_uninstalled");
                                    arrayList.add(string);
                                }
                            } else if ("checkversions".equals(string2)) {
                                if (jSONObject2.has("do_match")) {
                                    arrayList.add(jSONObject2.getString("do_match"));
                                }
                                if (jSONObject2.has("do_dismatch")) {
                                    arrayList.add(jSONObject2.getString("do_dismatch"));
                                }
                                if (jSONObject2.has("do")) {
                                    string = jSONObject2.getString("do");
                                    arrayList.add(string);
                                }
                            } else if ("startintent".equals(string2)) {
                                if (jSONObject2.has("do_failed")) {
                                    arrayList.add(jSONObject2.getString("do_failed"));
                                }
                                if (jSONObject2.has("do")) {
                                    string = jSONObject2.getString("do");
                                    arrayList.add(string);
                                }
                            } else if (!"null".equals(string2) && jSONObject2.has("do")) {
                                string = jSONObject2.getString("do");
                                arrayList.add(string);
                            }
                        }
                        cVar.a(arrayList);
                        map.put(cVar.a(), cVar);
                    } else {
                        str = str;
                    }
                } else {
                    str = str;
                }
                i10++;
                str2 = str2;
                str3 = str3;
                str = str;
            }
            ArrayList arrayList2 = new ArrayList(map.values());
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                List<String> listB = ((com.igexin.push.core.bean.c) ((Map.Entry) it.next()).getValue()).b();
                if (listB != null) {
                    Iterator<String> it2 = listB.iterator();
                    while (it2.hasNext()) {
                        com.igexin.push.core.bean.c cVar2 = (com.igexin.push.core.bean.c) map.get(it2.next());
                        if (cVar2 != null) {
                            cVar2.d();
                            if (arrayList2.contains(cVar2)) {
                                arrayList2.remove(cVar2);
                            }
                        }
                    }
                }
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                a(map, ((com.igexin.push.core.bean.c) it3.next()).a());
            }
            if (map.size() <= 0) {
                return false;
            }
            com.igexin.a.a.c.b.a(f64038a + "|action_chains have loop nodeMap not empty", new Object[0]);
            return true;
        } catch (Throwable th2) {
            com.igexin.a.a.c.b.a(f64038a + "|isHaveLoop exception :" + th2.toString(), new Object[0]);
            return false;
        }
    }

    public static void b(Context context) throws GetuiPushException {
        if (context == null) {
            throw new GetuiPushException("传入的context为空");
        }
        Context applicationContext = context.getApplicationContext();
        if ((applicationContext.getApplicationInfo().flags & 2) == 0) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = n.b(applicationContext).applicationInfo;
            String strA = b.a(applicationInfo);
            if (applicationInfo != null && applicationInfo.metaData != null) {
                if (TextUtils.isEmpty(strA)) {
                    strA = applicationInfo.metaData.getString(AssistPushConsts.GETUI_APPID);
                }
                if (TextUtils.isEmpty(strA)) {
                    throw new GetuiPushException("未配置个推APPID");
                }
            } else if (TextUtils.isEmpty(strA)) {
                throw new GetuiPushException("未配置META-DATA");
            }
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
        }
        ServiceInfo serviceInfo = (ServiceInfo) b.a(applicationContext, PushService.class).first;
        if (serviceInfo == null) {
            throw new GetuiPushException("未集成com.igexin.sdk.PushService");
        }
        if (!serviceInfo.processName.endsWith(":pushservice")) {
            throw new GetuiPushException("PushService需配置在pushservice进程");
        }
        if (!"android.permission.BIND_JOB_SERVICE".equalsIgnoreCase(serviceInfo.permission)) {
            throw new GetuiPushException("PushService需配置BIND_JOB_SERVICE权限");
        }
        try {
            PackageInfo packageInfo = applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 4096);
            if (packageInfo != null) {
                String[] strArr = packageInfo.requestedPermissions;
                if (strArr == null || strArr.length == 0) {
                    throw new GetuiPushException("Manifest中无权限配置");
                }
                List listAsList = Arrays.asList(strArr);
                if (!listAsList.contains("android.permission.INTERNET")) {
                    throw new GetuiPushException("未在Manifest中配置所需权限：android.permission.INTERNET");
                }
                if (!listAsList.contains("android.permission.READ_PHONE_STATE")) {
                    throw new GetuiPushException("未在Manifest中配置所需权限：android.permission.READ_PHONE_STATE");
                }
                if (!listAsList.contains("android.permission.ACCESS_NETWORK_STATE")) {
                    throw new GetuiPushException("未在Manifest中配置所需权限：android.permission.ACCESS_NETWORK_STATE");
                }
                if (!listAsList.contains("android.permission.ACCESS_WIFI_STATE")) {
                    throw new GetuiPushException("未在Manifest中配置所需权限：android.permission.ACCESS_WIFI_STATE");
                }
                if (!listAsList.contains("android.permission.VIBRATE")) {
                    throw new GetuiPushException("未在Manifest中配置所需权限：android.permission.VIBRATE");
                }
            }
        } catch (PackageManager.NameNotFoundException e11) {
            e11.printStackTrace();
        }
        ServiceInfo serviceInfo2 = (ServiceInfo) b.a(applicationContext, GTIntentService.class).first;
        if (serviceInfo2 == null) {
            throw new GetuiPushException("未找到自定义GTIntentService");
        }
        if (!"android.permission.BIND_JOB_SERVICE".equalsIgnoreCase(serviceInfo2.permission)) {
            throw new GetuiPushException("自定义GTIntentService需配置BIND_JOB_SERVICE权限");
        }
    }

    public static boolean b() {
        return System.currentTimeMillis() > com.igexin.push.config.l.f63425c;
    }

    public static boolean b(Intent intent, Context context) {
        if (intent == null || context == null) {
            return false;
        }
        try {
            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
            return listQueryIntentActivities != null && listQueryIntentActivities.size() > 0;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean b(String str) {
        try {
            if (!TextUtils.isEmpty(com.igexin.push.config.l.f63447y) && !"none".equals(com.igexin.push.config.l.f63447y)) {
                List listAsList = Arrays.asList(com.igexin.push.config.l.f63447y.split(Constants.ACCEPT_TIME_SEPARATOR_SP));
                if (listAsList.isEmpty()) {
                    return false;
                }
                Iterator it = listAsList.iterator();
                while (it.hasNext()) {
                    if (str.startsWith((String) it.next())) {
                        return true;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static boolean c() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) com.igexin.push.core.d.f63671e.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.getType() == 1;
    }

    public static boolean c(Context context) {
        if (f64039b == null) {
            f64039b = (context.getApplicationInfo().flags & 2) == 0 ? -1 : 1;
        }
        return f64039b.intValue() > 0;
    }

    public static boolean c(String str) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(com.igexin.push.config.l.A) && !"none".equals(com.igexin.push.config.l.A)) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(Arrays.asList(com.igexin.push.config.l.A.split(Constants.ACCEPT_TIME_SEPARATOR_SP)));
                if (arrayList.isEmpty()) {
                    return false;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (str.contains((String) it.next())) {
                        return true;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static void d() {
        NetworkInfo.State state = ((ConnectivityManager) com.igexin.push.core.d.f63671e.getSystemService("connectivity")).getNetworkInfo(1).getState();
        if (state == NetworkInfo.State.CONNECTED || state == NetworkInfo.State.CONNECTING) {
            com.igexin.push.core.d.f63682p = 1;
        } else {
            com.igexin.push.core.d.f63682p = 0;
        }
    }

    private static boolean d(String str) {
        try {
            com.igexin.push.core.d.f63671e.getPackageManager().getLaunchIntentForPackage(str);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void e() {
        com.igexin.push.core.d.f63683q = ((PowerManager) com.igexin.push.core.d.f63671e.getSystemService("power")).isScreenOn() ? 1 : 0;
    }

    public static boolean f() {
        String str = com.igexin.push.config.l.L;
        if (!TextUtils.isEmpty(str) && !"null".equalsIgnoreCase(str)) {
            if (androidx.webkit.b.f28327e.equals(str)) {
                return false;
            }
            String lowerCase = n.a().toLowerCase();
            if (TextUtils.isEmpty(lowerCase)) {
                return true;
            }
            for (String str2 : str.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
                if (lowerCase.contains(str2.toLowerCase())) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean g() {
        try {
            for (String str : com.igexin.push.config.l.f63446x.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
                if (Build.MODEL.toLowerCase().contains(str.toLowerCase())) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }

    public static boolean h() {
        String str;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) com.igexin.push.core.d.f63671e.getSystemService("connectivity");
            if (connectivityManager == null) {
                com.igexin.a.a.c.b.a(f64038a + "|ConnectivityManager is null", new Object[0]);
                return false;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            StringBuilder sb2 = new StringBuilder();
            String str2 = f64038a;
            sb2.append(str2);
            sb2.append("|activeNetworkInfo = ");
            sb2.append(activeNetworkInfo);
            com.igexin.a.a.c.b.a(sb2.toString(), new Object[0]);
            if (activeNetworkInfo == null || activeNetworkInfo.getState() != NetworkInfo.State.CONNECTED) {
                com.igexin.a.a.c.b.a(str2 + "|network available = false", new Object[0]);
                return false;
            }
            if (activeNetworkInfo.getType() == 0) {
                str = "mobile";
            } else {
                str = activeNetworkInfo.getType() == 1 ? "wifi" : "none";
            }
            com.igexin.a.a.c.b.a(str2 + str + "|connected", new Object[0]);
            return true;
        } catch (Throwable th2) {
            com.igexin.a.a.c.b.a(f64038a + "|network available ex =" + th2.toString(), new Object[0]);
        }
    }

    public static boolean i() {
        return System.currentTimeMillis() >= 1182566108138L;
    }

    public static boolean j() {
        int i10;
        String str = com.igexin.push.config.l.K;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            for (String str2 : str.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
                if (str2.contains("|") && str2.contains(Constants.WAVE_SEPARATOR)) {
                    String strSubstring = str2.substring(0, str2.indexOf("|"));
                    String[] strArrSplit = str2.substring(str2.indexOf("|") + 1).split(Constants.WAVE_SEPARATOR);
                    if (strArrSplit.length == 2) {
                        int i11 = Integer.parseInt(strArrSplit[0]);
                        int i12 = Integer.parseInt(strArrSplit[1]);
                        if (n.a().equalsIgnoreCase(strSubstring) && (i10 = Build.VERSION.SDK_INT) >= i11 && i10 <= i12) {
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }
}
