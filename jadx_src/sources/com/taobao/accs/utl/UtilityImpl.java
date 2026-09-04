package com.taobao.accs.utl;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Process;
import android.text.TextUtils;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.util.HMacUtil;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.tools.ant.util.h1;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class UtilityImpl {
    public static final String NET_TYPE_2G = "2g";
    public static final String NET_TYPE_3G = "3g";
    public static final String NET_TYPE_4G = "4g";
    public static final String NET_TYPE_UNKNOWN = "unknown";
    public static final String NET_TYPE_WIFI = "wifi";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f98456a = new byte[0];

    public static int a(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return str.getBytes("utf-8").length;
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public static String a(int i10) {
        try {
            return String.valueOf(i10);
        } catch (Exception e10) {
            ALog.e("UtilityImpl", "int2String", e10, new Object[0]);
            return null;
        }
    }

    public static String a(long j10) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(Long.valueOf(j10));
        } catch (Throwable th2) {
            ALog.e("UtilityImpl", "formatDay", th2, new Object[0]);
            return "";
        }
    }

    public static String a(Context context) {
        String string = context.getSharedPreferences(Constants.SP_FILE_NAME, 4).getString(Constants.KEY_PROXY_HOST, null);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        String strF = f();
        if (TextUtils.isEmpty(strF)) {
            return null;
        }
        return strF;
    }

    public static String a(String str, String str2, String str3) {
        String strHmacSha1Hex = null;
        if (TextUtils.isEmpty(str)) {
            ALog.e("UtilityImpl", "getAppsign appkey null", new Object[0]);
            return null;
        }
        try {
            if (TextUtils.isEmpty(str2)) {
                ALog.e("UtilityImpl", "getAppsign secret null", new Object[0]);
            } else {
                strHmacSha1Hex = HMacUtil.hmacSha1Hex(str2.getBytes(), (str + str3).getBytes());
            }
        } catch (Throwable th2) {
            ALog.e("UtilityImpl", "getAppsign", th2, new Object[0]);
        }
        return strHmacSha1Hex;
    }

    public static String a(Throwable th2) {
        return j.a(th2);
    }

    public static final String a(List<String> list) {
        StringBuffer stringBuffer = new StringBuffer();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            stringBuffer.append(list.get(i10));
            if (i10 < size - 1) {
                stringBuffer.append(com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
        }
        return stringBuffer.toString();
    }

    public static final Map<String, String> a(Map<String, List<String>> map) {
        HashMap map2 = new HashMap();
        try {
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                String key = entry.getKey();
                if (!TextUtils.isEmpty(key)) {
                    String strA = a(entry.getValue());
                    if (!TextUtils.isEmpty(strA)) {
                        if (!key.startsWith(":")) {
                            key = key.toLowerCase(Locale.US);
                        }
                        map2.put(key, strA);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return map2;
    }

    public static void a(Context context, String str, long j10) {
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(Constants.SP_CHANNEL_FILE_NAME, 0).edit();
            editorEdit.putLong(str, j10);
            editorEdit.apply();
            ALog.d("UtilityImpl", "setServiceTime:" + j10, new Object[0]);
        } catch (Throwable th2) {
            ALog.e("UtilityImpl", "setServiceTime:", th2, new Object[0]);
        }
    }

    public static void a(Context context, String str, String str2) {
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(str, 4).edit();
            editorEdit.putString(Constants.SP_KEY_NOTIFICATION_STATE, str2);
            editorEdit.apply();
        } catch (Exception e10) {
            ALog.e("UtilityImpl", "saveNotificationState fail", e10, new Object[0]);
        }
    }

    public static boolean a() {
        try {
            return !GlobalAppRuntimeInfo.isAppBackground();
        } catch (Throwable th2) {
            ALog.e("UtilityImpl", "isForeground error ", th2, new Object[0]);
            return false;
        }
    }

    public static boolean a(long j10, long j11) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(j10));
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(new Date(j11));
        return calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2) && calendar.get(5) == calendar2.get(5);
    }

    public static boolean a(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (Throwable unused) {
            ALog.e("UtilityImpl", "package not exist", "pkg", str);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:17:0x0026
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static boolean a(java.lang.String r4, android.content.Context r5) {
        /*
            r0 = 0
            byte[] r1 = com.taobao.accs.utl.UtilityImpl.f98456a     // Catch: java.lang.Throwable -> L28
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = com.taobao.accs.utl.j.b(r5)     // Catch: java.lang.Throwable -> L20
            android.content.SharedPreferences r4 = r5.getSharedPreferences(r4, r0)     // Catch: java.lang.Throwable -> L20
            java.lang.String r5 = "utdid"
            java.lang.String r3 = ""
            java.lang.String r4 = r4.getString(r5, r3)     // Catch: java.lang.Throwable -> L20
            boolean r4 = r4.equals(r2)     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L1d
            r4 = 1
            goto L1e
        L1d:
            r4 = r0
        L1e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L26
            goto L34
        L20:
            r5 = move-exception
            r4 = r0
        L22:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L26
            throw r5     // Catch: java.lang.Throwable -> L24
        L24:
            r5 = move-exception
            goto L2a
        L26:
            r5 = move-exception
            goto L22
        L28:
            r5 = move-exception
            r4 = r0
        L2a:
            java.lang.String r1 = "UtilityImpl"
            java.lang.String r2 = "utdidChanged"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.taobao.accs.utl.ALog.e(r1, r2, r5, r0)
        L34:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.utl.UtilityImpl.a(java.lang.String, android.content.Context):boolean");
    }

    public static int b() {
        return -1;
    }

    public static int b(Context context) {
        int i10 = context.getSharedPreferences(Constants.SP_FILE_NAME, 4).getInt(Constants.KEY_PROXY_PORT, -1);
        if (i10 > 0) {
            return i10;
        }
        if (a(context) == null) {
            return -1;
        }
        try {
            return g();
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static String b(String str) {
        try {
            return URLEncoder.encode(str, "utf-8");
        } catch (UnsupportedEncodingException unused) {
            return str;
        }
    }

    public static void b(Context context, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            GlobalClientInfo.f98173c = str;
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(Constants.SP_COOKIE_FILE_NAME, 0).edit();
            editorEdit.putString(Constants.SP_KEY_COOKIE_SEC, str);
            editorEdit.apply();
        } catch (Exception e10) {
            ALog.e("UtilityImpl", "storeCookie fail", e10, new Object[0]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:17:0x0026
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static boolean b(java.lang.String r4, android.content.Context r5) {
        /*
            r0 = 0
            byte[] r1 = com.taobao.accs.utl.UtilityImpl.f98456a     // Catch: java.lang.Throwable -> L28
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = com.taobao.accs.utl.j.c(r5)     // Catch: java.lang.Throwable -> L20
            android.content.SharedPreferences r4 = r5.getSharedPreferences(r4, r0)     // Catch: java.lang.Throwable -> L20
            java.lang.String r5 = "notification_state"
            java.lang.String r3 = ""
            java.lang.String r4 = r4.getString(r5, r3)     // Catch: java.lang.Throwable -> L20
            boolean r4 = r4.equals(r2)     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L1d
            r4 = 1
            goto L1e
        L1d:
            r4 = r0
        L1e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L26
            goto L34
        L20:
            r5 = move-exception
            r4 = r0
        L22:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L26
            throw r5     // Catch: java.lang.Throwable -> L24
        L24:
            r5 = move-exception
            goto L2a
        L26:
            r5 = move-exception
            goto L22
        L28:
            r5 = move-exception
            r4 = r0
        L2a:
            java.lang.String r1 = "UtilityImpl"
            java.lang.String r2 = "notificationStateChanged"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.taobao.accs.utl.ALog.e(r1, r2, r5, r0)
        L34:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.utl.UtilityImpl.b(java.lang.String, android.content.Context):boolean");
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x001e */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(java.lang.String r3, android.content.Context r4) {
        /*
            r0 = 0
            byte[] r1 = com.taobao.accs.utl.UtilityImpl.f98456a     // Catch: java.lang.Throwable -> L1e
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L1e
            android.content.SharedPreferences r3 = r4.getSharedPreferences(r3, r0)     // Catch: java.lang.Throwable -> L1b
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r2 = "utdid"
            java.lang.String r4 = com.taobao.accs.utl.j.b(r4)     // Catch: java.lang.Throwable -> L1b
            r3.putString(r2, r4)     // Catch: java.lang.Throwable -> L1b
            r3.apply()     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1b
            goto L29
        L1b:
            r3 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1b
            throw r3     // Catch: java.lang.Throwable -> L1e
        L1e:
            r3 = move-exception
            java.lang.String r4 = "UtilityImpl"
            java.lang.String r1 = "saveUtdid"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.taobao.accs.utl.ALog.e(r4, r1, r3, r0)
        L29:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.utl.UtilityImpl.c(java.lang.String, android.content.Context):void");
    }

    public static boolean c(Context context) {
        String str;
        int i10;
        synchronized (f98456a) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(Constants.SP_FILE_NAME, 0);
            PackageInfo packageInfo = GlobalClientInfo.getInstance(context).getPackageInfo();
            int i11 = sharedPreferences.getInt(Constants.KEY_APP_VERSION_CODE, -1);
            String string = sharedPreferences.getString(Constants.KEY_APP_VERSION_NAME, "");
            if (packageInfo != null) {
                i10 = packageInfo.versionCode;
                str = packageInfo.versionName;
            } else {
                str = null;
                i10 = 0;
            }
            if (i11 == i10 && string.equals(str)) {
                return false;
            }
            p(context);
            ALog.i("UtilityImpl", "appVersionChanged", "oldV", Integer.valueOf(i11), "nowV", Integer.valueOf(i10), "oldN", string, "nowN", str);
            return true;
        }
    }

    public static byte[] c() {
        return null;
    }

    public static String d() {
        return "null";
    }

    public static String d(String str, Context context) {
        String string;
        try {
            synchronized (f98456a) {
                string = context.getSharedPreferences(str, 0).getString("utdid", j.b(context));
            }
            return string;
        } catch (Throwable th2) {
            ALog.e("UtilityImpl", "getUtdid", th2, new Object[0]);
            return "";
        }
    }

    public static boolean d(Context context) throws Throwable {
        boolean z10;
        if (context == null) {
            return false;
        }
        try {
            try {
                synchronized (f98456a) {
                    try {
                        z10 = context.getSharedPreferences(Constants.SP_FILE_NAME, 0).getBoolean(Constants.KEY_FOUCE_DISABLE, false);
                        return z10;
                    } catch (Throwable th2) {
                        th = th2;
                        context = null;
                        try {
                            throw th;
                        } catch (Exception e10) {
                            e = e10;
                            ALog.e("UtilityImpl", "getFocusDisableStatus", e, new Object[0]);
                            z10 = context;
                            return z10;
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e11) {
            e = e11;
            context = null;
        }
    }

    public static void disableService(Context context) {
        ComponentName componentName = new ComponentName(context, j.channelService);
        PackageManager packageManager = context.getPackageManager();
        try {
            ALog.d("UtilityImpl", "disableService, cn=" + componentName.toString(), new Object[0]);
            if (packageManager.getServiceInfo(componentName, 128).enabled) {
                packageManager.setComponentEnabledSetting(componentName, 2, 1);
                killService(context);
            }
        } catch (Throwable unused) {
        }
    }

    public static long e() {
        return j.a();
    }

    public static boolean e(Context context) {
        try {
            return context.getPackageManager().getServiceInfo(new ComponentName(context, j.channelService), 128).enabled;
        } catch (Exception e10) {
            e10.printStackTrace();
            ALog.e("UtilityImpl", j.a(e10), new Object[0]);
        }
    }

    public static void enableService(Context context) {
        ComponentName componentName = new ComponentName(context, j.channelService);
        ALog.d("UtilityImpl", "enableService", "comptName", componentName);
        try {
            context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
        } catch (Exception e10) {
            ALog.w("UtilityImpl", "enableService", e10, new Object[0]);
        }
    }

    public static String f() {
        return System.getProperty(h1.f136786c);
    }

    public static boolean f(Context context) {
        context.getPackageName();
        ComponentName componentName = new ComponentName(context, com.taobao.accs.client.a.b());
        PackageManager packageManager = context.getPackageManager();
        try {
            if (!componentName.getPackageName().equals("!")) {
                return packageManager.getServiceInfo(componentName, 128).enabled;
            }
            ALog.e("UtilityImpl", "getAgooServiceEnabled,exception,comptName.getPackageName()=" + componentName.getPackageName(), new Object[0]);
            return false;
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x001f */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void focusDisableService(android.content.Context r5) {
        /*
            r0 = 0
            byte[] r1 = com.taobao.accs.utl.UtilityImpl.f98456a     // Catch: java.lang.Throwable -> L1f
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r2 = "ACCS_SDK"
            android.content.SharedPreferences r2 = r5.getSharedPreferences(r2, r0)     // Catch: java.lang.Throwable -> L1c
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r3 = "fouce_disable"
            r4 = 1
            r2.putBoolean(r3, r4)     // Catch: java.lang.Throwable -> L1c
            r2.apply()     // Catch: java.lang.Throwable -> L1c
            disableService(r5)     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1c
            goto L29
        L1c:
            r5 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1c
            throw r5     // Catch: java.lang.Throwable -> L1f
        L1f:
            r5 = move-exception
            java.lang.String r1 = "UtilityImpl"
            java.lang.String r2 = "focusDisableService"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.taobao.accs.utl.ALog.e(r1, r2, r5, r0)
        L29:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.utl.UtilityImpl.focusDisableService(android.content.Context):void");
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x001e */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void focusEnableService(android.content.Context r4) {
        /*
            r0 = 0
            byte[] r1 = com.taobao.accs.utl.UtilityImpl.f98456a     // Catch: java.lang.Throwable -> L1e
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r2 = "ACCS_SDK"
            android.content.SharedPreferences r2 = r4.getSharedPreferences(r2, r0)     // Catch: java.lang.Throwable -> L1b
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r3 = "fouce_disable"
            r2.putBoolean(r3, r0)     // Catch: java.lang.Throwable -> L1b
            r2.apply()     // Catch: java.lang.Throwable -> L1b
            enableService(r4)     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1b
            goto L28
        L1b:
            r4 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1b
            throw r4     // Catch: java.lang.Throwable -> L1e
        L1e:
            r4 = move-exception
            java.lang.String r1 = "UtilityImpl"
            java.lang.String r2 = "focusEnableService"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.taobao.accs.utl.ALog.e(r1, r2, r4, r0)
        L28:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.utl.UtilityImpl.focusEnableService(android.content.Context):void");
    }

    public static int g() {
        try {
            return Integer.parseInt(System.getProperty(h1.f136787d));
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static String g(Context context) {
        NetworkInfo activeNetworkInfo;
        try {
            activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Throwable unused) {
            activeNetworkInfo = null;
        }
        if (activeNetworkInfo == null) {
            return "unknown";
        }
        if (activeNetworkInfo.getType() == 1) {
            return "wifi";
        }
        String subtypeName = activeNetworkInfo.getSubtypeName();
        return !TextUtils.isEmpty(subtypeName) ? subtypeName.replaceAll(" ", "") : "";
    }

    public static String h() {
        String str = f() + ":" + g();
        if (ALog.isPrintLog(ALog.Level.D)) {
            ALog.d("UtilityImpl", "getProxy:" + str, new Object[0]);
        }
        return str;
    }

    public static String h(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return "unknown";
            }
            if (activeNetworkInfo.getType() == 1) {
                return "wifi";
            }
            switch (activeNetworkInfo.getSubtype()) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    return "2g";
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                    return "3g";
                case 13:
                    return "4g";
                default:
                    String subtypeName = activeNetworkInfo.getSubtypeName();
                    if (TextUtils.isEmpty(subtypeName)) {
                        return "unknown";
                    }
                    return (subtypeName.equalsIgnoreCase("td-scdma") || subtypeName.equalsIgnoreCase("td_scdma") || subtypeName.equalsIgnoreCase("tds_hsdpa")) ? "3g" : "unknown";
            }
            ALog.e("UtilityImpl", "getNetworkTypeExt", th, new Object[0]);
            return null;
        } catch (Throwable th2) {
            ALog.e("UtilityImpl", "getNetworkTypeExt", th2, new Object[0]);
            return null;
        }
    }

    public static String i() {
        Class<?>[] clsArr = {String.class};
        Object[] objArr = {r4.a.f138781a};
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            String str = (String) cls.getDeclaredMethod("get", clsArr).invoke(cls, objArr);
            ALog.d("UtilityImpl", "getEmuiVersion", "result", str);
            return !TextUtils.isEmpty(str) ? str : "";
        } catch (Exception e10) {
            ALog.e("UtilityImpl", "getEmuiVersion", e10, new Object[0]);
            return "";
        }
    }

    public static boolean i(Context context) {
        if (context != null) {
            try {
                NetworkInfo activeNetworkInfo = GlobalClientInfo.getInstance(context).getConnectivityManager().getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    return activeNetworkInfo.isConnected();
                }
            } catch (Throwable th2) {
                ALog.e("UtilityImpl", "isNetworkConnected", th2, new Object[0]);
            }
        }
        return false;
    }

    public static boolean isMainProcess(Context context) {
        return j.a(context);
    }

    public static String j(Context context) {
        return j.b(context);
    }

    public static long k(Context context) {
        long j10 = 0;
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(Constants.SP_CHANNEL_FILE_NAME, 0);
            long j11 = sharedPreferences.getLong(Constants.SP_KEY_SERVICE_START, 0L);
            long j12 = j11 > 0 ? sharedPreferences.getLong(Constants.SP_KEY_SERVICE_END, 0L) - j11 : 0L;
            try {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putLong(Constants.SP_KEY_SERVICE_START, 0L);
                editorEdit.putLong(Constants.SP_KEY_SERVICE_END, 0L);
                editorEdit.apply();
                return j12;
            } catch (Throwable th2) {
                th = th2;
                j10 = j12;
                ALog.e("UtilityImpl", "getServiceAliveTime:", th, new Object[0]);
                return j10;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static void killService(Context context) {
        try {
            int iMyUid = Process.myUid();
            ActivityManager activityManager = (ActivityManager) context.getSystemService(RXScreenCaptureService.KEY_LAUNCH_ACTIVITY);
            if (activityManager == null) {
                return;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                if (runningAppProcessInfo.uid == iMyUid) {
                    if (!TextUtils.isEmpty(com.taobao.accs.client.a.f98188d) && com.taobao.accs.client.a.f98188d.equals(runningAppProcessInfo.processName)) {
                        ALog.e("UtilityImpl", "killService", com.taobao.aranger.constant.Constants.PARAM_PROCESS_NAME, runningAppProcessInfo.processName);
                        Process.killProcess(runningAppProcessInfo.pid);
                        return;
                    } else if (runningAppProcessInfo.processName.endsWith(":channel")) {
                        ALog.e("UtilityImpl", "killService", com.taobao.aranger.constant.Constants.PARAM_PROCESS_NAME, runningAppProcessInfo.processName);
                        Process.killProcess(runningAppProcessInfo.pid);
                        return;
                    }
                }
            }
            ALog.e("UtilityImpl", "kill nothing", new Object[0]);
        } catch (Throwable th2) {
            ALog.e("UtilityImpl", "killService", th2, new Object[0]);
        }
    }

    public static String l(Context context) {
        try {
            return GlobalClientInfo.getInstance(context).getPackageInfo().versionName;
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static String m(Context context) {
        try {
            return context.getSharedPreferences(Constants.SP_COOKIE_FILE_NAME, 4).getString(Constants.SP_KEY_COOKIE_SEC, null);
        } catch (Exception e10) {
            ALog.e("UtilityImpl", "reStoreCookie fail", e10, new Object[0]);
            return null;
        }
    }

    public static void n(Context context) {
        try {
            GlobalClientInfo.f98173c = null;
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(Constants.SP_COOKIE_FILE_NAME, 0).edit();
            editorEdit.clear();
            editorEdit.apply();
        } catch (Throwable th2) {
            ALog.e("UtilityImpl", "clearCookie fail", th2, new Object[0]);
        }
    }

    public static String o(Context context) {
        return j.c(context);
    }

    private static void p(Context context) {
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(Constants.SP_FILE_NAME, 0).edit();
            editorEdit.putInt(Constants.KEY_APP_VERSION_CODE, GlobalClientInfo.getInstance(context).getPackageInfo().versionCode);
            editorEdit.putString(Constants.KEY_APP_VERSION_NAME, GlobalClientInfo.getInstance(context).getPackageInfo().versionName);
            editorEdit.apply();
        } catch (Throwable th2) {
            ALog.e("UtilityImpl", "saveAppVersion", th2, new Object[0]);
        }
    }
}
