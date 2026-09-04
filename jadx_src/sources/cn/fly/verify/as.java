package cn.fly.verify;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import com.efs.sdk.base.core.util.NetworkUtil;
import com.xiaomi.mipush.sdk.Constants;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public class as {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f35765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Integer f35766b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Integer f35768d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static List<Integer> f35770f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static String f35772h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Object f35767c = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Object f35769e = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Object f35771g = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final char[] f35773i = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static int a(String str) {
        int i10;
        try {
            if ("46000".equals(str) || "46002".equals(str) || "46004".equals(str) || "46007".equals(str) || "46008".equals(str)) {
                i10 = 1;
            } else if ("46001".equals(str) || "46006".equals(str) || "46009".equals(str)) {
                i10 = 2;
            } else {
                if (!"46003".equals(str) && !"46005".equals(str) && !"46011".equals(str)) {
                    return 0;
                }
                i10 = 3;
            }
            return i10;
        } catch (Throwable th2) {
            f.a().a(th2, "[FlyVerify][%s][%s] ==>%s", "Util", "isMobileDataEnabled", "Check mobile data encountered exception");
            return 0;
        }
    }

    public static s a(s sVar, int i10, String str, String str2, int i11, Integer num, String str3, e eVar) {
        String str4;
        if (i11 == 1) {
            f.a().a("use multi operator");
            sVar = new t();
            sVar.a(str, str2, b(i10), eVar);
            sVar.b(i11);
        } else {
            if (i10 == 1) {
                if (sVar == null) {
                    sVar = new t();
                }
                str4 = "CMCC";
            } else if (i10 == 2) {
                if (sVar == null) {
                    sVar = new ae();
                }
                str4 = "CUCC";
            } else if (i10 == 4) {
                if (sVar == null) {
                    sVar = new ac();
                }
                str4 = "CTCC";
            }
            sVar.a(str, str2, str4, eVar);
        }
        sVar.a(num);
        sVar.a(str3);
        return sVar;
    }

    public static String a() {
        return a(false);
    }

    public static String a(int i10) {
        if (i10 == 1) {
            return "CMCC";
        }
        if (i10 == 2) {
            return "CUCC";
        }
        if (i10 == 3) {
            return "CUXW";
        }
        return i10 == 4 ? "CTCC" : "UNKNOWN";
    }

    public static String a(int i10, String str) {
        return str;
    }

    public static String a(Throwable th2) {
        if (th2 == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter((Writer) stringWriter, true));
        stringWriter.getBuffer().toString();
        return stringWriter.getBuffer().toString();
    }

    public static String a(boolean z10) {
        String strD;
        try {
            strD = al.d();
        } catch (Throwable th2) {
            f.a().a(th2, "[FlyVerify][%s][%s] ==>%s", "Util", "getMNC", "Check mobile data encountered exception");
            strD = null;
        }
        if (!TextUtils.isEmpty(strD) && !"-1".equalsIgnoreCase(strD)) {
            return strD;
        }
        if (TextUtils.isEmpty(f35765a) || z10) {
            f35765a = al.l();
        }
        return f35765a;
    }

    public static String a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < bArr.length; i10++) {
            char[] cArr = f35773i;
            sb2.append(cArr[(bArr[i10] >> 4) & 15]);
            sb2.append(cArr[bArr[i10] & 15]);
        }
        return sb2.toString();
    }

    public static List<Integer> a(Context context, List<Integer> list) {
        ArrayList arrayList;
        Cursor cursorQuery = null;
        if (list == null || list.isEmpty()) {
            arrayList = null;
        } else {
            Iterator<Integer> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    Integer next = it.next();
                    if (next != null && (next.intValue() == 0 || next.intValue() == 1)) {
                        arrayList = new ArrayList();
                    }
                } else {
                    arrayList = null;
                }
            }
        }
        if (arrayList == null) {
            return list;
        }
        if (("HUAWEI".equalsIgnoreCase(fz.d.l()) || "HONOR".equalsIgnoreCase(fz.d.l())) && Build.VERSION.SDK_INT <= 28) {
            try {
                cursorQuery = context.getContentResolver().query(Uri.parse("content://telephony/siminfo"), new String[]{com.umeng.analytics.pro.ao.f104522d, "sim_id"}, "sim_id>=?", new String[]{"0"}, null);
                if (cursorQuery != null) {
                    while (cursorQuery.moveToNext()) {
                        try {
                            int i10 = cursorQuery.getInt(cursorQuery.getColumnIndex("sim_id"));
                            int i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(com.umeng.analytics.pro.ao.f104522d));
                            for (int i12 = 0; i12 < list.size(); i12++) {
                                int iIntValue = list.get(i12).intValue();
                                if (iIntValue != -1 && iIntValue == i10) {
                                    list.set(i12, Integer.valueOf(i11));
                                    f.a().a("fixed = " + i11);
                                    break;
                                }
                            }
                        } catch (Throwable th2) {
                            f.a().a(th2);
                        }
                    }
                }
                if (cursorQuery != null) {
                }
            } catch (Throwable th3) {
                try {
                    f.a().a(th3);
                } finally {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                }
            }
        }
        return list;
    }

    public static void a(ar arVar) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            arVar.b();
        } else {
            arVar.run();
        }
    }

    public static boolean a(Context context) {
        try {
            if (((TelephonyManager) context.getSystemService(g0.a.f118921e)).getSimState() == 1) {
                f.a().b("[FlyVerify] ==>%s", "NO SIM");
                return false;
            }
        } catch (Throwable unused) {
        }
        return true;
    }

    public static int b(boolean z10) {
        int iIntValue;
        synchronized (f35767c) {
            if (f35766b == null || z10) {
                try {
                    boolean z11 = fz.d.b("android.permission.READ_PHONE_STATE");
                    boolean z12 = ai.a().r() == 1;
                    if (!z12) {
                        f.a().a("not allowed slots");
                    }
                    if (z11 && z12) {
                        f35766b = Integer.valueOf(SubscriptionManager.from(ax.g()).getActiveSubscriptionInfoCount());
                        f.a().a("==== getSimCount");
                    } else {
                        f35766b = -1;
                    }
                } catch (Throwable th2) {
                    f.a().a(th2);
                    f35766b = -1;
                }
                if (f35766b.intValue() == 0 && a(ax.g())) {
                    f35766b = -1;
                }
                iIntValue = f35766b.intValue();
            } else {
                iIntValue = f35766b.intValue();
            }
            throw th;
        }
        return iIntValue;
    }

    public static String b() {
        String strA = a();
        try {
            if (!"46000".equals(strA) && !"46002".equals(strA) && !"46004".equals(strA) && !"46007".equals(strA) && !"46008".equals(strA)) {
                if (!"46001".equals(strA) && !"46006".equals(strA) && !"46009".equals(strA)) {
                    return ("46003".equals(strA) || "46005".equals(strA) || "46011".equals(strA)) ? "CTCC" : "UNKNOWN";
                }
                return "CUCC";
            }
            return "CMCC";
        } catch (Throwable unused) {
            return "UNKNOWN";
        }
    }

    private static String b(int i10) {
        if (i10 == 1) {
            return "CMCC";
        }
        if (i10 == 2 || i10 == 3) {
            return "CUCC";
        }
        return i10 == 4 ? "CTCC" : "UNKNOWN";
    }

    public static String b(String str) {
        char[] charArray = str.toCharArray();
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            bArr[i10] = (byte) ((("0123456789ABCDEF".indexOf(charArray[i11]) * 16) + "0123456789ABCDEF".indexOf(charArray[i11 + 1])) & 255);
        }
        return new String(bArr);
    }

    public static boolean b(Context context) {
        return c(context) == 1;
    }

    public static int c(Context context) {
        try {
            if (((TelephonyManager) fz.d.a(g0.a.f118921e)).getSimState() != 1) {
                return ((Boolean) fz.d.a(context.getSystemService("connectivity"), "getMobileDataEnabled", new Object[0])).booleanValue() ? 1 : 0;
            }
            f.a().a("NO SIM");
            return 0;
        } catch (Throwable th2) {
            f.a().a(th2);
            return -1;
        }
    }

    public static int c(boolean z10) {
        int iIntValue;
        synchronized (f35769e) {
            if (f35768d == null || z10) {
                try {
                    boolean z11 = ai.a().r() == 1;
                    if (!z11) {
                        f.a().a("not allowed slots");
                    }
                    if (z11) {
                        f35768d = 0;
                        try {
                            Class<?> clsLoadClass = ax.g().getClassLoader().loadClass("android.os.SystemProperties");
                            String str = ((String) clsLoadClass.getMethod("get", String.class).invoke(clsLoadClass, "gsm.sim.state")) + ((String) clsLoadClass.getMethod("get", String.class).invoke(clsLoadClass, "gsm.sim.state.2"));
                            if (!TextUtils.isEmpty(str)) {
                                String[] strArrSplit = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                                if (strArrSplit.length > 0) {
                                    for (String str2 : strArrSplit) {
                                        if (!TextUtils.isEmpty(str2) && !"ABSENT".equals(str2) && !"NOT_READY".equals(str2)) {
                                            f35768d = Integer.valueOf(f35768d.intValue() + 1);
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            f.a().a(th2);
                        }
                    } else {
                        f35768d = -1;
                    }
                } catch (Throwable th3) {
                    f.a().a(th3);
                    f35768d = -1;
                }
                iIntValue = f35768d.intValue();
            } else {
                iIntValue = f35768d.intValue();
            }
            throw th;
        }
        return iIntValue;
    }

    public static boolean c() {
        String strJ = al.j();
        return "2g".equalsIgnoreCase(strJ) || "3g".equalsIgnoreCase(strJ) || "4g".equalsIgnoreCase(strJ) || NetworkUtil.NETWORK_CLASS_5G.equalsIgnoreCase(strJ) || "wifi".equalsIgnoreCase(strJ);
    }

    public static byte[] c(String str) {
        if (str == null) {
            return null;
        }
        char[] charArray = str.toCharArray();
        int length = charArray.length / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            int iDigit = Character.digit(charArray[i11 + 1], 16) | (Character.digit(charArray[i11], 16) << 4);
            if (iDigit > 127) {
                iDigit += androidx.core.view.o.f21773u;
            }
            bArr[i10] = (byte) iDigit;
        }
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x002a, code lost:
    
        r0 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int d() {
        /*
            cn.fly.verify.ai r0 = cn.fly.verify.ai.a()
            int r0 = r0.p()
            r1 = -1
            if (r0 != 0) goto L15
            cn.fly.verify.f r0 = cn.fly.verify.f.a()
            java.lang.String r2 = "not allowed sid"
            r0.a(r2)
            return r1
        L15:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L29
            r2 = 30
            if (r0 < r2) goto L20
            int r0 = cn.fly.verify.a0.a()     // Catch: java.lang.Exception -> L29
            goto L2a
        L20:
            r2 = 24
            if (r0 < r2) goto L29
            int r0 = cn.fly.verify.b0.a()     // Catch: java.lang.Exception -> L29
            goto L2a
        L29:
            r0 = r1
        L2a:
            if (r0 == r1) goto L53
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1.add(r2)
            android.content.Context r2 = cn.fly.verify.ax.g()
            java.util.List r1 = a(r2, r1)
            if (r1 == 0) goto L53
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L53
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
        L53:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.fly.verify.as.d():int");
    }

    public static String d(String str) {
        if (str == null) {
            return null;
        }
        byte[] bArrDecode = Base64.decode(str, 2);
        int length = bArrDecode.length;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = (byte) (bArrDecode[i10] - length);
        }
        try {
            return new String(bArr, "utf-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0097 A[Catch: all -> 0x00b0, TryCatch #1 {, blocks: (B:4:0x0003, B:37:0x00ac, B:38:0x00ae, B:32:0x008f, B:34:0x0097, B:36:0x00a5, B:31:0x0081, B:7:0x0009, B:11:0x0016, B:15:0x0023, B:18:0x0030, B:20:0x0047, B:22:0x004d, B:23:0x0058, B:25:0x005e, B:26:0x0072, B:27:0x0077, B:28:0x007a), top: B:44:0x0003, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00a5 A[Catch: all -> 0x00b0, TryCatch #1 {, blocks: (B:4:0x0003, B:37:0x00ac, B:38:0x00ae, B:32:0x008f, B:34:0x0097, B:36:0x00a5, B:31:0x0081, B:7:0x0009, B:11:0x0016, B:15:0x0023, B:18:0x0030, B:20:0x0047, B:22:0x004d, B:23:0x0058, B:25:0x005e, B:26:0x0072, B:27:0x0077, B:28:0x007a), top: B:44:0x0003, inners: #0 }] */
    public static List<Integer> d(boolean z10) {
        List<Integer> listA;
        ArrayList arrayList;
        List<Integer> list;
        synchronized (f35771g) {
            if (f35770f == null || z10) {
                try {
                    boolean z11 = fz.d.b("android.permission.READ_PHONE_STATE");
                    boolean z12 = ai.a().q() == 1;
                    if (!z12) {
                        f.a().a("not allowed sids");
                    }
                    if (z11 && z12) {
                        List<SubscriptionInfo> activeSubscriptionInfoList = SubscriptionManager.from(ax.g()).getActiveSubscriptionInfoList();
                        f.a().a("==== getSubIds");
                        if (activeSubscriptionInfoList == null || activeSubscriptionInfoList.isEmpty()) {
                            arrayList = new ArrayList();
                        } else {
                            f35770f = new ArrayList();
                            Iterator<SubscriptionInfo> it = activeSubscriptionInfoList.iterator();
                            while (it.hasNext()) {
                                f35770f.add(Integer.valueOf(it.next().getSubscriptionId()));
                            }
                        }
                        if (!f35770f.isEmpty()) {
                            listA = a(ax.g(), f35770f);
                            f35770f = listA;
                            if (listA == null) {
                                f35770f = new ArrayList();
                            }
                        }
                        list = f35770f;
                    } else {
                        arrayList = new ArrayList();
                    }
                    f35770f = arrayList;
                } catch (Throwable th2) {
                    f.a().a(th2);
                    f35770f = new ArrayList();
                }
                if (!f35770f.isEmpty()) {
                    listA = a(ax.g(), f35770f);
                    f35770f = listA;
                    if (listA == null) {
                        f35770f = new ArrayList();
                    }
                }
                list = f35770f;
            } else {
                list = f35770f;
            }
            throw th;
        }
        return list;
    }

    public static boolean d(Context context) {
        if (context == null) {
            return true;
        }
        return "wifi".equalsIgnoreCase(al.j());
    }

    public static long e(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                return Files.readAttributes(Paths.get(str, new String[0]), BasicFileAttributes.class, new LinkOption[0]).lastAccessTime().toMillis();
            }
            return -1L;
        } catch (Throwable th2) {
            f.a().a(th2);
            return -1L;
        }
    }

    public static String e() {
        try {
            return ga.d(ax.g().getPackageManager().getPackageInfo(ax.g().getPackageName(), 64).signatures[0].toByteArray());
        } catch (Throwable th2) {
            f.a().a(th2);
            return null;
        }
    }

    public static String f() {
        try {
            if (!TextUtils.isEmpty(f35772h)) {
                return f35772h;
            }
            String strA = aq.a();
            f35772h = strA;
            if (TextUtils.isEmpty(strA)) {
                String strB = ga.b(UUID.randomUUID().toString() + SystemClock.elapsedRealtimeNanos());
                f35772h = strB;
                aq.a(strB);
            }
            return f35772h;
        } catch (Throwable th2) {
            f.a().a(th2);
        }
    }

    public static String g() throws Throwable {
        return al.b();
    }

    public static int h() {
        int iC = c(ax.g());
        String strJ = al.j();
        if (iC == 1 && "wifi".equalsIgnoreCase(strJ)) {
            return 1;
        }
        if (iC == 1 && !"none".equalsIgnoreCase(strJ)) {
            return 2;
        }
        if (iC == 1) {
            return 3;
        }
        if (iC == -1 && "wifi".equalsIgnoreCase(strJ)) {
            return 4;
        }
        if (iC == -1 && !"none".equalsIgnoreCase(strJ)) {
            return 5;
        }
        if (iC == -1) {
            return 6;
        }
        if (iC == 0 && "wifi".equalsIgnoreCase(strJ)) {
            return 7;
        }
        return (iC != 0 || "none".equalsIgnoreCase(strJ)) ? 9 : 8;
    }
}
