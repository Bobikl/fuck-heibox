package com.uc.crashsdk;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.util.Log;
import androidx.core.app.o0;
import com.ss.android.ttvecamera.TECameraSettings;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.uc.crashsdk.a.h;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.io.File;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class b {
    private static boolean A = false;
    private static boolean B = false;
    private static boolean C = false;
    private static boolean D = false;
    private static boolean E = false;
    private static boolean F = false;
    private static String H = null;
    private static int I = 0;
    private static boolean J = false;
    private static boolean K = false;
    private static boolean L = true;
    private static RandomAccessFile M = null;
    private static boolean N = false;
    private static String P = null;
    private static boolean Q = false;
    private static volatile Object[] R = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f104210a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f104222b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f104223c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f104224d = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f104226f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f104227g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f104228h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final /* synthetic */ boolean f104229i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static String f104230j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static String f104231k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static String f104232l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static String f104233m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static String f104234n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static String f104235o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static String f104236p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static String f104237q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static String f104238r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static String f104239s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static String f104240t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static String f104241u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static String f104242v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static String f104243w = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static boolean f104244x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static boolean f104245y = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static volatile boolean f104246z = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f104225e = new Object();
    private static final Object G = new Object();
    private static final Object O = new Object();
    private static Runnable S = new com.uc.crashsdk.a.e(101);
    private static boolean T = false;
    private static long U = 0;
    private static final Object V = new Object();
    private static long W = 0;
    private static boolean X = false;
    private static boolean Y = false;
    private static boolean Z = false;

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    private static long f104211aa = 0;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private static final WeakHashMap<Activity, Integer> f104212ab = new WeakHashMap<>();

    /* JADX INFO: renamed from: ac, reason: collision with root package name */
    private static boolean f104213ac = false;

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    private static String f104214ad = null;

    /* JADX INFO: renamed from: ae, reason: collision with root package name */
    private static boolean f104215ae = false;

    /* JADX INFO: renamed from: af, reason: collision with root package name */
    private static boolean f104216af = false;

    /* JADX INFO: renamed from: ag, reason: collision with root package name */
    private static boolean f104217ag = false;

    /* JADX INFO: renamed from: ah, reason: collision with root package name */
    private static boolean f104218ah = false;

    /* JADX INFO: renamed from: ai, reason: collision with root package name */
    private static boolean f104219ai = false;

    /* JADX INFO: renamed from: aj, reason: collision with root package name */
    private static final Object f104220aj = new Object();

    /* JADX INFO: renamed from: ak, reason: collision with root package name */
    private static PendingIntent f104221ak = null;

    public static boolean A() {
        return Y || !ad();
    }

    static boolean B() {
        return Y && !f104244x;
    }

    static void C() {
        com.uc.crashsdk.a.f.a(2, new com.uc.crashsdk.a.e(100));
    }

    static void D() {
        String str;
        if (!f104224d || (str = f104214ad) == null) {
            return;
        }
        JNIBridge.set(129, str);
    }

    static String E() {
        String str = f104214ad;
        return str == null ? "" : str;
    }

    public static boolean F() {
        if (!f104215ae) {
            if (!com.uc.crashsdk.a.g.a(a.f104130a) && a.f104130a.equals(e.h())) {
                f104216af = true;
                if (f104224d) {
                    JNIBridge.set(2, true);
                }
            }
            f104215ae = true;
        }
        return f104216af;
    }

    static void G() {
        f104217ag = true;
        if (f104224d) {
            JNIBridge.set(34, true);
        }
    }

    public static boolean H() {
        return f104217ag;
    }

    public static int I() {
        boolean zU = U();
        if (t()) {
            return zU ? 3 : 6;
        }
        if (s()) {
            return zU ? 2 : 5;
        }
        return zU ? 4 : 1;
    }

    public static int J() {
        boolean zV = V();
        boolean zW = W();
        boolean zX = X();
        if (t()) {
            if (zV) {
                return 12;
            }
            if (zW) {
                return 14;
            }
            return zX ? 16 : 98;
        }
        if (!s()) {
            return 1;
        }
        if (zV) {
            return 11;
        }
        if (zW) {
            return 13;
        }
        return zX ? 15 : 97;
    }

    static void K() {
        if (f104224d) {
            JNIBridge.nativeSet(27, I, "12", null);
            JNIBridge.set(30, L);
        }
    }

    public static boolean L() {
        if (!f104219ai) {
            synchronized (f104220aj) {
                if (!f104219ai) {
                    f104218ah = ae();
                    f104219ai = true;
                }
            }
        }
        return f104218ah;
    }

    public static void M() {
        if (e.F() || L() || f104221ak != null || g.h() < 0) {
            return;
        }
        try {
            Context contextA = com.uc.crashsdk.a.g.a();
            Intent launchIntentForPackage = contextA.getPackageManager().getLaunchIntentForPackage(contextA.getPackageName());
            launchIntentForPackage.addFlags(335544320);
            f104221ak = PendingIntent.getActivity(contextA, 0, launchIntentForPackage, 0);
        } catch (Throwable th2) {
            com.uc.crashsdk.a.g.a(th2);
        }
    }

    static boolean N() {
        if (f104221ak == null) {
            com.uc.crashsdk.a.a.b("Restart intent is null!");
            return false;
        }
        try {
            com.uc.crashsdk.a.a.a("crashsdk", "restarting ...");
            ((AlarmManager) com.uc.crashsdk.a.g.a().getSystemService(o0.K0)).set(1, System.currentTimeMillis() + 200, f104221ak);
            return true;
        } catch (Throwable th2) {
            com.uc.crashsdk.a.g.a(th2);
            return false;
        }
    }

    static /* synthetic */ boolean O() {
        f104213ac = true;
        return true;
    }

    private static String Q() {
        if (f104230j == null) {
            f104230j = d(org.apache.tools.ant.taskdefs.optional.vss.g.f135467q2);
        }
        return f104230j;
    }

    private static String R() {
        if (f104232l == null) {
            f104232l = d("ctn");
        }
        return f104232l;
    }

    private static String S() {
        if (f104233m == null) {
            f104233m = d("cta");
        }
        return f104233m;
    }

    private static void T() {
        if (f104246z || f104245y) {
            return;
        }
        synchronized (G) {
            if (f104246z) {
                return;
            }
            f(g.W());
            String strP = p();
            File file = new File(b());
            File file2 = new File(R());
            A = "f".equals(strP);
            B = "b".equals(strP);
            D = file.exists();
            boolean zExists = file2.exists();
            E = zExists;
            boolean z10 = D || zExists;
            C = z10;
            if (!z10 && (A || B)) {
                boolean zR = r();
                F = zR;
                C = zR;
            }
            try {
                if (z()) {
                    Z();
                }
            } catch (Throwable th2) {
                com.uc.crashsdk.a.g.a(th2);
            }
            f104246z = true;
        }
    }

    private static boolean U() {
        T();
        return C;
    }

    private static boolean V() {
        T();
        return D;
    }

    private static boolean W() {
        T();
        return E;
    }

    private static boolean X() {
        T();
        return F;
    }

    private static void Y() {
        if (f104224d) {
            JNIBridge.set(26, f104244x);
        }
    }

    private static void Z() {
        if (!T) {
            T = true;
            try {
                new File(b()).delete();
            } catch (Throwable th2) {
                com.uc.crashsdk.a.g.a(th2);
            }
            try {
                new File(R()).delete();
            } catch (Throwable th3) {
                com.uc.crashsdk.a.g.a(th3);
            }
            try {
                if (f104224d) {
                    JNIBridge.cmd(16);
                } else {
                    new File(S()).delete();
                }
            } catch (Throwable th4) {
                com.uc.crashsdk.a.g.a(th4);
            }
        }
        Object[] objArrAb = ab();
        if (!objArrAb[0].equals(P) && R == null) {
            a(objArrAb);
        } else {
            Q = true;
            aa();
        }
    }

    private static Object a(Object obj, Class<?> cls, String str) {
        if (obj == null) {
            return null;
        }
        if (cls == null) {
            cls = obj.getClass();
        }
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(obj);
        } catch (Throwable th2) {
            com.uc.crashsdk.a.g.a(th2);
            return null;
        }
    }

    static String a() {
        String str = H;
        if (str != null) {
            return str;
        }
        String strH = e.h();
        if (com.uc.crashsdk.a.g.a(strH)) {
            H = "LLUN";
        } else {
            int i10 = 0;
            if (strH.length() > 48) {
                int length = strH.length() - 48;
                strH = strH.substring(0, 48);
                i10 = length;
            }
            StringBuilder sb2 = new StringBuilder();
            byte[] bytes = strH.getBytes();
            for (int length2 = bytes.length - 1; length2 >= 0; length2--) {
                byte b10 = bytes[length2];
                if (b10 == 46) {
                    sb2.append('0');
                } else if (b10 == 58) {
                    sb2.append('1');
                } else if (b10 >= 97 && b10 <= 122) {
                    sb2.append((char) ((b10 + 65) - 97));
                } else if (b10 >= 65 && b10 <= 90) {
                    sb2.append((char) b10);
                } else if (b10 < 48 || b10 > 57) {
                    sb2.append('2');
                } else {
                    sb2.append((char) b10);
                }
            }
            if (i10 > 0) {
                sb2.append(String.valueOf(i10));
            }
            H = sb2.toString();
        }
        return H;
    }

    static String a(String str) {
        if (str == null || str.length() <= 0 || !str.endsWith(".st")) {
            return null;
        }
        int iLastIndexOf = str.lastIndexOf(".st");
        if (!f104229i && iLastIndexOf < 0) {
            throw new AssertionError();
        }
        String strSubstring = str.substring(0, iLastIndexOf);
        if (strSubstring.length() <= 0) {
            return null;
        }
        return strSubstring + ".stcb";
    }

    public static void a(int i10) {
        Object objA;
        Activity activity;
        int i11;
        boolean z10 = false;
        boolean z11 = true;
        switch (i10) {
            case 100:
                Object objAc = ac();
                if (objAc == null || (objA = a(objAc, (Class<?>) null, "mActivities")) == null) {
                    return;
                }
                try {
                    Iterator it = ((Map) objA).entrySet().iterator();
                    boolean z12 = false;
                    while (it.hasNext()) {
                        Object value = ((Map.Entry) it.next()).getValue();
                        if (value != null && (activity = (Activity) a(value, (Class<?>) null, RXScreenCaptureService.KEY_LAUNCH_ACTIVITY)) != null) {
                            boolean zBooleanValue = ((Boolean) a(value, (Class<?>) null, "paused")).booleanValue();
                            boolean zBooleanValue2 = ((Boolean) a(value, (Class<?>) null, "stopped")).booleanValue();
                            WeakHashMap<Activity, Integer> weakHashMap = f104212ab;
                            synchronized (weakHashMap) {
                                if (zBooleanValue || zBooleanValue2) {
                                    i11 = 2;
                                } else {
                                    i11 = 1;
                                    z12 = true;
                                }
                                weakHashMap.put(activity, Integer.valueOf(i11));
                                break;
                            }
                        }
                        z10 = true;
                    }
                    if (z10) {
                        b(z12);
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    com.uc.crashsdk.a.g.a(th2);
                    return;
                }
            case 101:
                try {
                    if (new File(Q()).exists()) {
                        z11 = false;
                    }
                    N = z11;
                    if (z11 || Q) {
                        a(ab());
                        Q = false;
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    com.uc.crashsdk.a.g.a(th3);
                    return;
                }
            case 102:
                com.uc.crashsdk.a.f.a(1, new com.uc.crashsdk.a.e(103));
                return;
            case 103:
                try {
                    com.uc.crashsdk.a.g.a(new File(S()));
                    return;
                } catch (Throwable th4) {
                    com.uc.crashsdk.a.g.a(th4);
                    return;
                }
            case 104:
                h.d();
                f.a(102);
                if (F()) {
                    e.C();
                    return;
                }
                return;
            default:
                if (!f104229i) {
                    throw new AssertionError();
                }
                return;
        }
    }

    public static void a(boolean z10) {
        L = z10;
        if (f104224d) {
            JNIBridge.set(30, z10);
        }
    }

    private static void a(Object[] objArr) {
        R = objArr;
        synchronized (O) {
            String str = (String) objArr[0];
            long jLongValue = ((Long) objArr[1]).longValue();
            if (jLongValue < U) {
                com.uc.crashsdk.a.a.c("crashsdk", String.format(Locale.US, "Update state generation %d, last is: %d", Long.valueOf(jLongValue), Long.valueOf(U)));
                return;
            }
            U = jLongValue;
            String strQ = Q();
            if (f104224d) {
                RandomAccessFile randomAccessFile = M;
                if (randomAccessFile != null) {
                    com.uc.crashsdk.a.g.a(randomAccessFile);
                    M = null;
                }
                boolean zNativeChangeState = JNIBridge.nativeChangeState(strQ, str, N);
                N = false;
                if (!zNativeChangeState) {
                    com.uc.crashsdk.a.a.b("write state failed: " + str);
                }
            } else {
                RandomAccessFile randomAccessFile2 = M;
                if (randomAccessFile2 == null || N) {
                    if (randomAccessFile2 != null) {
                        com.uc.crashsdk.a.g.a(randomAccessFile2);
                        M = null;
                    }
                    try {
                        RandomAccessFile randomAccessFile3 = new RandomAccessFile(strQ, "rw");
                        M = randomAccessFile3;
                        randomAccessFile3.seek(0L);
                        N = false;
                    } catch (Exception e10) {
                        com.uc.crashsdk.a.g.a(e10);
                    }
                }
                try {
                    M.write(str.getBytes());
                    M.seek(0L);
                } catch (Exception e11) {
                    com.uc.crashsdk.a.g.a(e11);
                }
            }
            P = str;
            R = null;
        }
    }

    public static boolean a(Context context) {
        try {
            ((Application) context).registerActivityLifecycleCallbacks(new c());
            if (!g.L()) {
                return true;
            }
            C();
            return true;
        } catch (Throwable th2) {
            com.uc.crashsdk.a.g.a(th2);
            return false;
        }
    }

    public static boolean a(Object obj, String str, com.uc.crashsdk.a.e eVar) {
        FileChannel channel;
        boolean zA;
        synchronized (obj) {
            FileChannel fileChannel = null;
            fileLockLock = null;
            FileLock fileLockLock = null;
            FileChannel fileChannel2 = null;
            boolean zA2 = false;
            if (f104224d) {
                int iNativeOpenFile = JNIBridge.nativeOpenFile(str);
                if (iNativeOpenFile < 0) {
                    com.uc.crashsdk.a.a.a("crashsdk", "Can not open file: " + str, null);
                    return false;
                }
                try {
                    boolean zNativeLockFile = JNIBridge.nativeLockFile(iNativeOpenFile, true);
                    try {
                        zA = eVar.a();
                        if (zNativeLockFile) {
                            JNIBridge.nativeLockFile(iNativeOpenFile, false);
                        }
                        JNIBridge.nativeCloseFile(iNativeOpenFile);
                        return zA;
                    } catch (Throwable th2) {
                        if (zNativeLockFile) {
                            JNIBridge.nativeLockFile(iNativeOpenFile, false);
                        }
                        throw th2;
                    }
                } catch (Throwable th3) {
                    JNIBridge.nativeCloseFile(iNativeOpenFile);
                    throw th3;
                }
            }
            File file = new File(str);
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (Exception e10) {
                    com.uc.crashsdk.a.g.a(e10);
                }
            }
            try {
                try {
                    channel = new RandomAccessFile(file, "rw").getChannel();
                } catch (Throwable th4) {
                    th = th4;
                    com.uc.crashsdk.a.g.a(fileChannel2);
                    throw th;
                }
            } catch (Exception e11) {
                try {
                    com.uc.crashsdk.a.g.a(e11);
                    channel = null;
                } catch (Exception e12) {
                    e = e12;
                    com.uc.crashsdk.a.g.a(e);
                    com.uc.crashsdk.a.g.a(fileChannel);
                    zA = zA2;
                    return zA;
                }
            }
            if (channel != null) {
                try {
                    try {
                        fileLockLock = channel.lock();
                    } catch (Exception e13) {
                        try {
                            com.uc.crashsdk.a.g.a(e13);
                        } catch (Exception e14) {
                            e = e14;
                            fileChannel = channel;
                            com.uc.crashsdk.a.g.a(e);
                            com.uc.crashsdk.a.g.a(fileChannel);
                        }
                    }
                } catch (Throwable th5) {
                    fileChannel2 = channel;
                    th = th5;
                    com.uc.crashsdk.a.g.a(fileChannel2);
                    throw th;
                }
            }
            try {
                zA2 = eVar.a();
                if (fileLockLock != null) {
                    try {
                        fileLockLock.release();
                    } catch (Exception e15) {
                        com.uc.crashsdk.a.g.a(e15);
                    }
                }
                com.uc.crashsdk.a.g.a(channel);
                zA = zA2;
                return zA;
            } catch (Throwable th6) {
                if (fileLockLock != null) {
                    try {
                        fileLockLock.release();
                    } catch (Exception e16) {
                        com.uc.crashsdk.a.g.a(e16);
                    }
                }
                throw th6;
            }
        }
    }

    private static void aa() {
        if (!com.uc.crashsdk.a.f.b(S)) {
            com.uc.crashsdk.a.f.a(1, S);
            return;
        }
        Object[] objArr = R;
        if (objArr == null || !ab()[0].equals(objArr[0])) {
            com.uc.crashsdk.a.f.a(S);
            com.uc.crashsdk.a.f.a(1, S);
        }
    }

    private static Object[] ab() {
        synchronized (V) {
            long j10 = W + 1;
            W = j10;
            if (f104244x) {
                return new Object[]{"e", Long.valueOf(j10)};
            }
            if (B()) {
                return new Object[]{"f", Long.valueOf(W)};
            }
            return new Object[]{"b", Long.valueOf(W)};
        }
    }

    private static Object ac() {
        Object objA;
        Object objA2 = a((Application) com.uc.crashsdk.a.g.a(), (Class<?>) Application.class, "mLoadedApk");
        if (objA2 != null && (objA = a(objA2, (Class<?>) null, "mActivityThread")) != null) {
            return objA;
        }
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentActivityThread", new Class[0]);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                return declaredMethod.invoke(null, new Object[0]);
            }
        } catch (Throwable th2) {
            com.uc.crashsdk.a.g.a(th2);
        }
        return null;
    }

    private static boolean ad() {
        String strA = com.uc.crashsdk.a.g.a(new File("/proc/self/cgroup"), 512, false);
        if (com.uc.crashsdk.a.g.a(strA)) {
            return false;
        }
        return strA.contains("/bg_non_interactive") || strA.contains("/background");
    }

    private static boolean ae() {
        try {
            Method declaredMethod = Process.class.getDeclaredMethod("isIsolated", new Class[0]);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(null, new Object[0]);
                if (objInvoke != null && (objInvoke instanceof Boolean)) {
                    return ((Boolean) objInvoke).booleanValue();
                }
            }
        } catch (Throwable th2) {
            com.uc.crashsdk.a.g.a(th2);
        }
        int iMyUid = Process.myUid() % 100000;
        return iMyUid >= 99000 && iMyUid <= 99999;
    }

    static String b() {
        if (f104231k == null) {
            f104231k = d("ctj");
        }
        return f104231k;
    }

    public static String b(String str) {
        return "debug.crs." + str;
    }

    public static void b(int i10) {
        I = i10;
        K();
    }

    static void b(Context context) {
        com.uc.crashsdk.a.a.a("Restart APP");
        if (context == null) {
            return;
        }
        if (f104236p == null) {
            f104236p = d("rt");
        }
        File file = new File(f104236p);
        long j10 = -1;
        try {
            j10 = Long.parseLong(com.uc.crashsdk.a.g.d(file));
        } catch (Throwable th2) {
            com.uc.crashsdk.a.g.a(th2);
        }
        boolean z10 = false;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        if (g.h() >= 0 && (j10 <= 0 || jCurrentTimeMillis - j10 > g.h())) {
            f(g.W());
            com.uc.crashsdk.a.g.a(file, String.valueOf(jCurrentTimeMillis));
            z10 = true;
        }
        com.uc.crashsdk.a.a.a("lastTime: " + j10 + ", currentTime: " + jCurrentTimeMillis + ", needRestart: " + z10);
        if (z10) {
            try {
                d.a(true);
            } catch (Throwable th3) {
                com.uc.crashsdk.a.g.a(th3);
            }
            N();
        }
    }

    public static void b(boolean z10) {
        if (e.u()) {
            return;
        }
        if (z10 && f104244x) {
            if (g.O()) {
                Log.v("crashsdk", "setForeground, reset sExited to false!!!");
            }
            f104244x = false;
            Y();
        }
        boolean z11 = e.F() || L();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (X && !Y && z10) {
            long j10 = f104211aa;
            if (j10 != 0 && !z11 && jCurrentTimeMillis - j10 > 1800000) {
                com.uc.crashsdk.a.f.a(1, new com.uc.crashsdk.a.e(104), 1000L);
            }
        }
        f104211aa = jCurrentTimeMillis;
        Y = z10;
        if (z10) {
            X = true;
        }
        if (f104224d) {
            JNIBridge.nativeSetForeground(z10);
        }
        if (f104244x || z11) {
            return;
        }
        T();
        Z();
        if (z10) {
            a.a(false);
            if (!Z) {
                e.B();
                Z = true;
            }
        }
        if (!N) {
            aa();
        }
        e.c(z10);
    }

    static String c() {
        if (f104234n == null) {
            f104234n = d("st");
        }
        return f104234n;
    }

    public static boolean c(int i10) {
        return (i10 & I) != 0;
    }

    private static String d(String str) {
        return g.W() + a() + "." + str;
    }

    static File[] d() {
        return e(".st");
    }

    static String e() {
        if (f104235o == null) {
            f104235o = d("stcb");
        }
        return f104235o;
    }

    private static File[] e(String str) {
        if (!f104229i && str.length() <= 0) {
            throw new AssertionError();
        }
        File[] fileArrListFiles = new File(g.W()).listFiles();
        if (fileArrListFiles == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (File file : fileArrListFiles) {
            if (file.getPath().endsWith(str)) {
                arrayList.add(file);
            }
        }
        return (File[]) arrayList.toArray(new File[arrayList.size()]);
    }

    private static boolean f(String str) {
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        if (file.isDirectory()) {
            return true;
        }
        com.uc.crashsdk.a.a.a("crashsdk", "Crash log directory was placed by a file!", null);
        if (!file.delete()) {
            return false;
        }
        file.mkdirs();
        return true;
    }

    static File[] f() {
        return e(".stcb");
    }

    static String g() {
        if (f104242v == null) {
            f104242v = d("bati");
        }
        return f104242v;
    }

    static String h() {
        if (f104243w == null) {
            f104243w = d(TECameraSettings.F0);
        }
        return f104243w;
    }

    static String i() {
        if (f104237q == null) {
            f104237q = g.W() + CommonNetImpl.UP;
        }
        return f104237q;
    }

    public static String j() {
        if (f104238r == null) {
            f104238r = g.W() + "authu";
        }
        return f104238r;
    }

    public static String k() {
        if (f104239s == null) {
            f104239s = g.W() + "statu";
        }
        return f104239s;
    }

    static String l() {
        if (f104240t == null) {
            f104240t = g.W() + "poli";
        }
        return f104240t;
    }

    static String m() {
        if (f104241u == null) {
            f104241u = g.W() + "ver";
        }
        return f104241u;
    }

    public static String n() {
        return g.W() + "bvu";
    }

    static String o() {
        return g.W() + "fds";
    }

    static String p() {
        return com.uc.crashsdk.a.g.a(new File(Q()), 8, false);
    }

    static boolean q() {
        return f104245y;
    }

    static boolean r() {
        if (!J) {
            if (f104224d) {
                K = JNIBridge.cmd(15) == 1;
            } else {
                K = new File(S()).exists();
            }
            J = true;
        }
        return K;
    }

    static boolean s() {
        T();
        return A;
    }

    static boolean t() {
        T();
        return B;
    }

    static boolean u() {
        return f104244x;
    }

    public static void v() {
        boolean z10;
        f(g.W());
        f104245y = true;
        A = false;
        B = false;
        C = false;
        D = false;
        E = false;
        F = false;
        String[] strArr = {".st", ".wa", ".callback", ".ctn", ".ctj", ".cta", ".signal"};
        String[] strArr2 = {CommonNetImpl.UP, "authu", "statu", "poli"};
        File[] fileArrListFiles = new File(g.W()).listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                String name = file.getName();
                int i10 = 0;
                while (true) {
                    if (i10 >= 7) {
                        z10 = false;
                        break;
                    } else {
                        if (name.endsWith(strArr[i10])) {
                            z10 = true;
                            break;
                        }
                        i10++;
                    }
                }
                if (!z10) {
                    for (int i11 = 0; i11 < 4; i11++) {
                        if (name.equals(strArr2[i11])) {
                            z10 = true;
                            break;
                        }
                    }
                }
                if (z10) {
                    com.uc.crashsdk.a.a.a("crashsdk", "delete file: " + file.getPath());
                    com.uc.crashsdk.a.g.a(file);
                }
            }
        }
        Z();
    }

    public static void w() {
        if (f104244x) {
            return;
        }
        f104244x = true;
        if (L() || e.u()) {
            return;
        }
        f(g.W());
        Y();
        Z();
    }

    static boolean x() {
        return f(g.W());
    }

    static boolean y() {
        return f(g.X());
    }

    static boolean z() {
        return X || !ad();
    }
}
