package com.uc.crashsdk;

import android.content.pm.PackageInfo;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.exoplayer2.upstream.cache.CacheDataSink;
import com.uc.crashsdk.export.LogType;
import java.io.File;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f104130a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f104131b = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final /* synthetic */ boolean f104133d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map<String, String> f104134e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final List<String> f104135f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static String f104136g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static String f104137h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f104138i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static long f104139j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final HashMap<String, Object[]> f104140k = new HashMap<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final List<String> f104141l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f104142m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f104143n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f104144o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static int f104145p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final HashMap<String, Object[]> f104146q = new HashMap<>();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final List<String> f104147r = new ArrayList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static int f104148s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static int f104149t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static int f104150u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static int f104151v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static int f104152w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static int f104153x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final SparseArray<Object[]> f104154y = new SparseArray<>();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final List<Integer> f104155z = new ArrayList();
    private static final HashMap<String, Object[]> A = new HashMap<>();
    private static final List<String> B = new ArrayList();
    private static int C = 0;
    private static int D = 0;
    private static int E = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static boolean f104132c = false;
    private static Runnable F = new com.uc.crashsdk.a.e(201);
    private static boolean G = false;
    private static boolean H = false;
    private static boolean I = false;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public static int a(int i10, String str) {
        if (com.uc.crashsdk.a.g.a(str)) {
            str = Thread.currentThread().getName();
        }
        ?? r10 = 0;
        r10 = 0;
        if (LogType.isForNative(i10) || LogType.isForANR(i10)) {
            if (b.f104224d) {
                synchronized (f104154y) {
                    JNIBridge.nativeCmd(4, i10, str, null);
                }
                boolean zIsForNative = LogType.isForNative(i10);
                r10 = zIsForNative;
                if (LogType.isForANR(i10)) {
                    r10 = (zIsForNative ? 1 : 0) | 1048576;
                }
            } else {
                com.uc.crashsdk.a.a.a("crashsdk", "crashsdk so has not loaded!", null);
            }
        }
        if (!LogType.isForJava(i10)) {
            return r10;
        }
        a(str, Thread.currentThread());
        return r10 | 16;
    }

    public static int a(String str, int i10, int i11) {
        int iRemoveType;
        int iIntValue;
        boolean z10;
        if (str == null || i10 <= 0) {
            return 0;
        }
        if (i10 > 1500) {
            com.uc.crashsdk.a.a.a("crashsdk", "createCachedInfo: capacity is too large!", null);
            return 0;
        }
        HashMap<String, Object[]> map = A;
        synchronized (map) {
            if (map.containsKey(str)) {
                iIntValue = ((Integer) map.get(str)[1]).intValue();
                iRemoveType = LogType.addType(iIntValue, i11);
            } else {
                iRemoveType = i11;
                iIntValue = 0;
            }
            if (LogType.isForJava(iRemoveType) && !LogType.isForJava(iIntValue)) {
                int i12 = C;
                if (i12 >= 8) {
                    iRemoveType = LogType.removeType(iRemoveType, 16);
                } else {
                    C = i12 + 1;
                }
            }
            if (LogType.isForNative(iRemoveType) && !LogType.isForNative(iIntValue)) {
                int i13 = D;
                if (i13 >= 8) {
                    iRemoveType = LogType.removeType(iRemoveType, 1);
                } else {
                    D = i13 + 1;
                }
            }
            if (LogType.isForANR(iRemoveType) && !LogType.isForANR(iIntValue)) {
                int i14 = E;
                if (i14 >= 8) {
                    iRemoveType = LogType.removeType(iRemoveType, 1048576);
                } else {
                    E = i14 + 1;
                }
            }
            if ((1048849 & iRemoveType) == 0) {
                z10 = false;
            } else {
                if (iIntValue == 0) {
                    B.add(str);
                }
                z10 = true;
            }
            if (!z10) {
                return iRemoveType;
            }
            if (b.f104224d && (i11 & 1048577) != 0) {
                int iNativeCreateCachedInfo = JNIBridge.nativeCreateCachedInfo(str, i10, iRemoveType);
                if (!LogType.isForNative(iNativeCreateCachedInfo)) {
                    iRemoveType = LogType.removeType(iRemoveType, 1);
                }
                if (!LogType.isForANR(iNativeCreateCachedInfo)) {
                    iRemoveType = LogType.removeType(iRemoveType, 1048576);
                }
            }
            map.put(str, new Object[]{Integer.valueOf(i10), Integer.valueOf(iRemoveType), new ArrayList()});
            return iRemoveType;
        }
    }

    public static int a(String str, int i10, Callable<String> callable, long j10, int i11) {
        int iRemoveType;
        int iIntValue;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        if (str == null) {
            return 0;
        }
        HashMap<String, Object[]> map = f104146q;
        synchronized (map) {
            if (map.containsKey(str)) {
                iIntValue = ((Integer) map.get(str)[0]).intValue();
                iRemoveType = LogType.addType(iIntValue, i10);
                if (iIntValue == iRemoveType) {
                    return iIntValue;
                }
            } else {
                iRemoveType = i10;
                iIntValue = 0;
            }
            if (LogType.isForJava(iRemoveType) && !LogType.isForJava(iIntValue)) {
                int i12 = f104148s;
                if (i12 >= 8) {
                    z16 = true;
                } else if (j10 != 0) {
                    int i13 = f104152w;
                    if (i13 >= 6) {
                        z16 = true;
                    } else {
                        f104152w = i13 + 1;
                        f104148s = i12 + 1;
                        z16 = false;
                    }
                } else if (i12 - f104152w >= 6) {
                    z16 = true;
                } else {
                    f104148s = i12 + 1;
                    z16 = false;
                }
                if (z16) {
                    iRemoveType = LogType.removeType(iRemoveType, 16);
                }
            }
            if (!LogType.isForNative(iRemoveType) || LogType.isForNative(iIntValue)) {
                z10 = false;
                z11 = false;
            } else {
                int i14 = f104149t;
                if (i14 >= 6) {
                    z10 = false;
                    z11 = false;
                    z15 = true;
                } else if (j10 != 0) {
                    int i15 = f104153x;
                    if (i15 >= 4) {
                        z10 = false;
                        z11 = false;
                        z15 = true;
                    } else {
                        f104153x = i15 + 1;
                        f104149t = i14 + 1;
                        z15 = false;
                        z10 = true;
                        z11 = true;
                    }
                } else if (i14 - f104153x >= 4) {
                    z10 = false;
                    z11 = false;
                    z15 = true;
                } else {
                    f104149t = i14 + 1;
                    z15 = false;
                    z11 = false;
                    z10 = true;
                }
                if (z15) {
                    iRemoveType = LogType.removeType(iRemoveType, 1);
                }
            }
            if (!LogType.isForANR(iRemoveType) || LogType.isForANR(iIntValue)) {
                z12 = false;
            } else {
                int i16 = f104151v;
                if (i16 >= 6) {
                    iRemoveType = LogType.removeType(iRemoveType, 1048576);
                    z12 = false;
                } else {
                    f104151v = i16 + 1;
                    z12 = true;
                }
            }
            if (!LogType.isForUnexp(iRemoveType) || LogType.isForUnexp(iIntValue)) {
                z13 = false;
            } else {
                int i17 = f104150u;
                if (i17 >= 6) {
                    iRemoveType = LogType.removeType(iRemoveType, 256);
                    z13 = false;
                } else {
                    f104150u = i17 + 1;
                    z13 = true;
                }
            }
            if ((1048849 & iRemoveType) == 0) {
                z14 = false;
            } else {
                if (iIntValue == 0) {
                    f104147r.add(str);
                }
                z14 = true;
            }
            if (!z14) {
                return iRemoveType;
            }
            if (b.f104224d && (1048833 & i10) != 0) {
                int iNativeAddCallbackInfo = JNIBridge.nativeAddCallbackInfo(str, i10, j10, i11);
                if (!LogType.isForNative(iNativeAddCallbackInfo)) {
                    iRemoveType = LogType.removeType(iRemoveType, 1);
                    if (z10) {
                        f104149t--;
                    }
                    if (z11) {
                        f104153x--;
                    }
                }
                if (!LogType.isForANR(iNativeAddCallbackInfo)) {
                    iRemoveType = LogType.removeType(iRemoveType, 1048576);
                    if (z12) {
                        f104151v--;
                    }
                }
                if (!LogType.isForUnexp(iNativeAddCallbackInfo)) {
                    iRemoveType = LogType.removeType(iRemoveType, 256);
                    if (z13) {
                        f104150u--;
                    }
                }
            }
            map.put(str, new Object[]{Integer.valueOf(iRemoveType), callable, Long.valueOf(j10), Integer.valueOf(i11)});
            return iRemoveType;
        }
    }

    public static int a(String str, String str2, boolean z10, boolean z11, int i10, boolean z12) {
        int iRemoveType;
        int iIntValue;
        boolean z13;
        if (str == null || str2 == null) {
            return 0;
        }
        if (str.length() > 256) {
            com.uc.crashsdk.a.a.a("crashsdk", "addDumpFile: description is too long!", null);
            return 0;
        }
        HashMap<String, Object[]> map = f104140k;
        synchronized (map) {
            if (map.containsKey(str)) {
                iIntValue = ((Integer) map.get(str)[0]).intValue();
                iRemoveType = LogType.addType(iIntValue, i10);
            } else {
                iRemoveType = i10;
                iIntValue = 0;
            }
            if (LogType.isForJava(iRemoveType) && !LogType.isForJava(iIntValue)) {
                int i11 = f104142m;
                if (i11 >= 10) {
                    iRemoveType = LogType.removeType(iRemoveType, 16);
                } else {
                    f104142m = i11 + 1;
                }
            }
            if (LogType.isForNative(iRemoveType) && !LogType.isForNative(iIntValue)) {
                int i12 = f104143n;
                if (i12 >= 10) {
                    iRemoveType = LogType.removeType(iRemoveType, 1);
                } else {
                    f104143n = i12 + 1;
                }
            }
            if (LogType.isForUnexp(iRemoveType) && !LogType.isForUnexp(iIntValue)) {
                int i13 = f104144o;
                if (i13 >= 10) {
                    iRemoveType = LogType.removeType(iRemoveType, 256);
                } else {
                    f104144o = i13 + 1;
                }
            }
            if (LogType.isForANR(iRemoveType) && !LogType.isForANR(iIntValue)) {
                int i14 = f104145p;
                if (i14 >= 10) {
                    iRemoveType = LogType.removeType(iRemoveType, 1048576);
                } else {
                    f104145p = i14 + 1;
                }
            }
            if ((1048849 & iRemoveType) == 0) {
                z13 = false;
            } else {
                if (iIntValue == 0) {
                    f104141l.add(str);
                }
                z13 = true;
            }
            if (!z13) {
                return iRemoveType;
            }
            if (b.f104224d && (1048833 & i10) != 0) {
                int iNativeAddDumpFile = JNIBridge.nativeAddDumpFile(str, str2, z10, z11, i10, z12);
                if (!LogType.isForNative(iNativeAddDumpFile)) {
                    iRemoveType = LogType.removeType(iRemoveType, 1);
                }
                if (!LogType.isForUnexp(iNativeAddDumpFile)) {
                    iRemoveType = LogType.removeType(iRemoveType, 256);
                }
                if (!LogType.isForANR(iNativeAddDumpFile)) {
                    iRemoveType = LogType.removeType(iRemoveType, 1048576);
                }
            }
            map.put(str, new Object[]{Integer.valueOf(iRemoveType), str2, Boolean.valueOf(z10), Boolean.valueOf(z11), Boolean.valueOf(z12)});
            return iRemoveType;
        }
    }

    public static String a() {
        String str = f104137h;
        if (str != null) {
            return str;
        }
        return o() ? f104137h : "";
    }

    static String a(String str) {
        HashMap<String, Object[]> map = f104140k;
        synchronized (map) {
            Object[] objArr = map.get(str);
            if (objArr == null) {
                return null;
            }
            int i10 = 1;
            String str2 = (String) objArr[1];
            boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
            boolean zBooleanValue2 = ((Boolean) objArr[3]).booleanValue();
            Locale locale = Locale.US;
            Object[] objArr2 = new Object[4];
            objArr2[0] = str2;
            objArr2[1] = "`";
            objArr2[2] = Integer.valueOf(zBooleanValue ? 1 : 0);
            if (!zBooleanValue2) {
                i10 = 0;
            }
            objArr2[3] = Integer.valueOf(i10);
            return String.format(locale, "%s%s%d%d", objArr2);
        }
    }

    static String a(String str, boolean z10) {
        String strNativeGetCallbackInfo;
        HashMap<String, Object[]> map = f104146q;
        synchronized (map) {
            Object[] objArr = map.get(str);
            long jLongValue = ((Long) objArr[2]).longValue();
            strNativeGetCallbackInfo = jLongValue != 0 ? JNIBridge.nativeGetCallbackInfo(str, jLongValue, ((Integer) objArr[3]).intValue(), z10) : b(str, z10).toString();
        }
        return strNativeGetCallbackInfo;
    }

    public static void a(int i10) {
        if (i10 == 201) {
            com.uc.crashsdk.a.a.a("crashsdk", "Begin update info ...");
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (b.f104224d && f104132c) {
                JNIBridge.nativeCmd(11, g.G(), String.valueOf(g.H()), null);
            }
            com.uc.crashsdk.a.a.a("crashsdk", "Update info took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
            a(false);
            return;
        }
        if (i10 != 202) {
            if (!f104133d) {
                throw new AssertionError();
            }
            return;
        }
        p();
        Locale locale = Locale.US;
        String str = String.format(locale, "%s/%s/%s", g.T(), g.U(), g.V());
        f104136g = m();
        if (b.f104224d) {
            JNIBridge.set(128, f104136g);
        }
        boolean z10 = !str.equals(f104136g);
        if (z10) {
            com.uc.crashsdk.a.b.a(b.m(), str);
        }
        if (z10 && g.u()) {
            com.uc.crashsdk.a.a.a("crashsdk", String.format(locale, "Is new version ('%s' -> '%s'), deleting old stats data!", f104136g, str));
            b.v();
        }
    }

    static void a(OutputStream outputStream, String str) {
        synchronized (f104134e) {
            for (String str2 : f104135f) {
                try {
                    StringBuilder sb2 = new StringBuilder(11);
                    sb2.append(str2);
                    sb2.append(": ");
                    String str3 = f104134e.get(str2);
                    if (str3 != null) {
                        sb2.append(str3);
                    }
                    sb2.append("\n");
                    outputStream.write(sb2.toString().getBytes(str));
                } catch (Throwable th2) {
                    e.a(th2, outputStream);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0084  */
    /* JADX WARN: Code duplicated, block: B:29:0x0087  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ca A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:34:0x00c3, B:36:0x00ca, B:37:0x00d3, B:39:0x00d8, B:41:0x00dc, B:42:0x00e5), top: B:55:0x00c3, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00d8 A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:34:0x00c3, B:36:0x00ca, B:37:0x00d3, B:39:0x00d8, B:41:0x00dc, B:42:0x00e5), top: B:55:0x00c3, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00dc A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:34:0x00c3, B:36:0x00ca, B:37:0x00d3, B:39:0x00d8, B:41:0x00dc, B:42:0x00e5), top: B:55:0x00c3, outer: #4 }] */
    static void a(OutputStream outputStream, String str, String str2) {
        Thread thread;
        Throwable th2;
        String str3;
        StackTraceElement[] stackTrace;
        int length;
        boolean z10;
        int i10;
        String str4;
        synchronized (f104154y) {
            Thread threadCurrentThread = Thread.currentThread();
            Iterator<Integer> it = f104155z.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                try {
                    Object[] objArr = f104154y.get(iIntValue);
                    if (objArr != null) {
                        thread = (Thread) ((WeakReference) objArr[0]).get();
                        try {
                            str3 = (String) objArr[1];
                            if (thread == null) {
                                try {
                                    com.uc.crashsdk.a.a.b("Thread (" + str3 + ", " + iIntValue + ") has exited!");
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    e.a(th2, outputStream);
                                    try {
                                        Locale locale = Locale.US;
                                        outputStream.write(String.format(locale, "Thread Name: '%s'\n", str3).getBytes(str));
                                        if (thread.isDaemon()) {
                                            str4 = " daemon";
                                        } else {
                                            str4 = "";
                                        }
                                        outputStream.write(String.format(locale, "\"%s\"%s prio=%d tid=%d %s\n", thread.getName(), str4, Integer.valueOf(thread.getPriority()), Integer.valueOf(iIntValue), thread.getState().toString()).getBytes(str));
                                    } catch (Throwable th4) {
                                        e.a(th4, outputStream);
                                    }
                                    try {
                                        stackTrace = thread.getStackTrace();
                                        if (stackTrace.length == 0) {
                                            outputStream.write("  (no stack frames)".getBytes(str));
                                        }
                                        length = stackTrace.length;
                                        z10 = true;
                                        i10 = 0;
                                        while (i10 < length) {
                                            StackTraceElement stackTraceElement = stackTrace[i10];
                                            if (!z10) {
                                                outputStream.write("\n".getBytes(str));
                                            }
                                            outputStream.write(String.format(Locale.US, "  at %s", stackTraceElement.toString()).getBytes(str));
                                            i10++;
                                            z10 = false;
                                        }
                                    } catch (Throwable th5) {
                                        e.a(th5, outputStream);
                                    }
                                    try {
                                        outputStream.write("\n".getBytes(str));
                                        outputStream.write(str2.getBytes(str));
                                    } catch (Throwable th6) {
                                        e.a(th6, outputStream);
                                    }
                                }
                            } else if (threadCurrentThread != thread) {
                                Locale locale2 = Locale.US;
                                outputStream.write(String.format(locale2, "Thread Name: '%s'\n", str3).getBytes(str));
                                if (thread.isDaemon()) {
                                    str4 = " daemon";
                                } else {
                                    str4 = "";
                                }
                                outputStream.write(String.format(locale2, "\"%s\"%s prio=%d tid=%d %s\n", thread.getName(), str4, Integer.valueOf(thread.getPriority()), Integer.valueOf(iIntValue), thread.getState().toString()).getBytes(str));
                                stackTrace = thread.getStackTrace();
                                if (stackTrace.length == 0) {
                                    outputStream.write("  (no stack frames)".getBytes(str));
                                }
                                length = stackTrace.length;
                                z10 = true;
                                i10 = 0;
                                while (i10 < length) {
                                    StackTraceElement stackTraceElement2 = stackTrace[i10];
                                    if (!z10) {
                                        outputStream.write("\n".getBytes(str));
                                    }
                                    outputStream.write(String.format(Locale.US, "  at %s", stackTraceElement2.toString()).getBytes(str));
                                    i10++;
                                    z10 = false;
                                }
                                outputStream.write("\n".getBytes(str));
                                outputStream.write(str2.getBytes(str));
                            }
                        } catch (Throwable th7) {
                            str3 = null;
                            th2 = th7;
                        }
                    }
                } catch (Throwable th8) {
                    thread = null;
                    th2 = th8;
                    str3 = null;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005d A[Catch: all -> 0x008d, TryCatch #2 {all -> 0x008d, blocks: (B:8:0x0015, B:10:0x0028, B:16:0x0036, B:18:0x005d, B:21:0x0075, B:23:0x007b, B:24:0x0083, B:19:0x006b, B:13:0x002f), top: B:50:0x0015, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x006b A[Catch: all -> 0x008d, TryCatch #2 {all -> 0x008d, blocks: (B:8:0x0015, B:10:0x0028, B:16:0x0036, B:18:0x005d, B:21:0x0075, B:23:0x007b, B:24:0x0083, B:19:0x006b, B:13:0x002f), top: B:50:0x0015, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0083 A[Catch: all -> 0x008d, TRY_LEAVE, TryCatch #2 {all -> 0x008d, blocks: (B:8:0x0015, B:10:0x0028, B:16:0x0036, B:18:0x005d, B:21:0x0075, B:23:0x007b, B:24:0x0083, B:19:0x006b, B:13:0x002f), top: B:50:0x0015, outer: #0 }] */
    static void a(OutputStream outputStream, String str, String str2, ArrayList<String> arrayList) {
        long jLongValue;
        String string;
        synchronized (f104146q) {
            for (String str3 : f104147r) {
                try {
                    Object[] objArr = f104146q.get(str3);
                    int iIntValue = ((Integer) objArr[0]).intValue();
                    if (arrayList == null) {
                        if (LogType.isForJava(iIntValue)) {
                            outputStream.write((str3 + "\n").getBytes(str));
                            jLongValue = ((Long) objArr[2]).longValue();
                            if (jLongValue != 0) {
                                string = JNIBridge.nativeGetCallbackInfo(str3, jLongValue, ((Integer) objArr[3]).intValue(), false);
                            } else {
                                string = b(str3, false).toString();
                            }
                            if (string != null || string.length() <= 0) {
                                outputStream.write("(data is null)\n".getBytes(str));
                            } else {
                                outputStream.write(string.getBytes(str));
                            }
                            try {
                                outputStream.write("\n".getBytes(str));
                                outputStream.write(str2.getBytes(str));
                            } catch (Throwable th2) {
                                e.a(th2, outputStream);
                            }
                        }
                    } else if (a(arrayList, str3)) {
                        outputStream.write((str3 + "\n").getBytes(str));
                        jLongValue = ((Long) objArr[2]).longValue();
                        if (jLongValue != 0) {
                            string = JNIBridge.nativeGetCallbackInfo(str3, jLongValue, ((Integer) objArr[3]).intValue(), false);
                        } else {
                            string = b(str3, false).toString();
                        }
                        if (string != null) {
                            outputStream.write("(data is null)\n".getBytes(str));
                        } else {
                            outputStream.write("(data is null)\n".getBytes(str));
                        }
                        outputStream.write("\n".getBytes(str));
                        outputStream.write(str2.getBytes(str));
                    }
                } catch (Throwable th3) {
                    e.a(th3, outputStream);
                }
            }
            if (arrayList != null && e.F()) {
                for (String str4 : arrayList) {
                    if (!a(f104147r, str4)) {
                        e.a(outputStream, "CUSTOMCALLBACKINFO", str4);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0050 A[Catch: all -> 0x00d6, TRY_LEAVE, TryCatch #2 {all -> 0x00d6, blocks: (B:12:0x0025, B:14:0x002f, B:20:0x0045, B:22:0x0050, B:17:0x003e), top: B:73:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x006e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0075  */
    /* JADX WARN: Code duplicated, block: B:32:0x0078  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00af A[Catch: all -> 0x00d2, TryCatch #0 {all -> 0x00d2, blocks: (B:34:0x007e, B:36:0x009a, B:38:0x00a2, B:40:0x00af, B:41:0x00b4), top: B:69:0x007e }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00b4 A[Catch: all -> 0x00d2, TRY_LEAVE, TryCatch #0 {all -> 0x00d2, blocks: (B:34:0x007e, B:36:0x009a, B:38:0x00a2, B:40:0x00af, B:41:0x00b4), top: B:69:0x007e }] */
    /* JADX WARN: Instruction removed from duplicated block: B:22:0x0050, please report this as an issue */
    static void a(OutputStream outputStream, String str, ArrayList<String> arrayList) {
        int i10;
        int iMin;
        boolean zBooleanValue;
        String str2;
        boolean zBooleanValue2;
        int iB;
        boolean z10 = arrayList == null;
        boolean zF = e.F();
        synchronized (f104140k) {
            int i11 = 0;
            for (String str3 : f104141l) {
                try {
                    Object[] objArr = f104140k.get(str3);
                    if (arrayList == null) {
                        if (LogType.isForJava(((Integer) objArr[0]).intValue())) {
                            if (((Boolean) objArr[3]).booleanValue()) {
                                try {
                                    outputStream.write((str3 + "\n").getBytes(str));
                                } catch (Throwable th2) {
                                    th = th2;
                                    e.a(th, outputStream);
                                }
                            }
                            if (i11 > 153600) {
                                i10 = 153600;
                            } else {
                                i10 = i11;
                            }
                            try {
                                iMin = Math.min(CacheDataSink.f50934l, 153600 - i10);
                                zBooleanValue = ((Boolean) objArr[2]).booleanValue();
                                str2 = (String) objArr[1];
                                zBooleanValue2 = ((Boolean) objArr[4]).booleanValue();
                                if (zF || str2.startsWith("/proc/")) {
                                    if (zBooleanValue) {
                                        iB = e.a(outputStream, str2, iMin);
                                    } else {
                                        iB = e.b(outputStream, str2, iMin);
                                    }
                                    i10 += iB;
                                } else {
                                    e.a(outputStream, "FILE", str2, iMin, zBooleanValue, zBooleanValue2);
                                }
                                i11 = i10;
                                if (!zBooleanValue2 && z10 && !zF) {
                                    File file = new File(str2);
                                    if (file.exists()) {
                                        file.delete();
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                i11 = i10;
                                e.a(th, outputStream);
                            }
                        }
                    } else if (a(arrayList, str3)) {
                        if (((Boolean) objArr[3]).booleanValue()) {
                            outputStream.write((str3 + "\n").getBytes(str));
                        }
                        if (i11 > 153600) {
                            i10 = 153600;
                        } else {
                            i10 = i11;
                        }
                        iMin = Math.min(CacheDataSink.f50934l, 153600 - i10);
                        zBooleanValue = ((Boolean) objArr[2]).booleanValue();
                        str2 = (String) objArr[1];
                        zBooleanValue2 = ((Boolean) objArr[4]).booleanValue();
                        if (zF) {
                            if (zBooleanValue) {
                                iB = e.a(outputStream, str2, iMin);
                            } else {
                                iB = e.b(outputStream, str2, iMin);
                            }
                            i10 += iB;
                        } else {
                            if (zBooleanValue) {
                                iB = e.a(outputStream, str2, iMin);
                            } else {
                                iB = e.b(outputStream, str2, iMin);
                            }
                            i10 += iB;
                        }
                        i11 = i10;
                        if (!zBooleanValue2) {
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
            if (arrayList != null && zF) {
                for (String str4 : arrayList) {
                    if (!a(f104141l, str4)) {
                        e.a(outputStream, "CUSTOMDUMPFILE", str4);
                    }
                }
            }
        }
    }

    public static void a(String str, String str2) {
        Map<String, String> map = f104134e;
        synchronized (map) {
            if (!map.containsKey(str)) {
                f104135f.add(str);
            }
            map.put(str, str2);
            if (b.f104224d) {
                JNIBridge.nativeAddHeaderInfo(str, str2);
            }
            e.y();
        }
    }

    private static boolean a(String str, Thread thread) {
        if (thread == null) {
            return false;
        }
        SparseArray<Object[]> sparseArray = f104154y;
        synchronized (sparseArray) {
            int id2 = (int) thread.getId();
            if (sparseArray.get(id2) == null) {
                f104155z.add(Integer.valueOf(id2));
            }
            sparseArray.put(id2, new Object[]{new WeakReference(thread), str});
        }
        return true;
    }

    private static boolean a(List<String> list, String str) {
        if (com.uc.crashsdk.a.g.a(str)) {
            return false;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (str.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(boolean z10) {
        int iG;
        if (!b.f104223c) {
            com.uc.crashsdk.a.a.a("crashsdk", "Unexp log not enabled, skip update unexp info!");
            return false;
        }
        if (e.F() || b.L()) {
            return false;
        }
        if (z10) {
            com.uc.crashsdk.a.f.a(F);
            iG = 0;
        } else {
            if (!b.B()) {
                com.uc.crashsdk.a.a.a("crashsdk", "Stop update unexp info in background!");
                return false;
            }
            if (g.G() <= 0) {
                return false;
            }
            if (com.uc.crashsdk.a.f.b(F)) {
                return true;
            }
            iG = g.G() * 1000;
        }
        com.uc.crashsdk.a.f.a(0, F, iG);
        return true;
    }

    public static int b(String str, String str2) {
        int iAddType;
        int iAddType2 = 0;
        if (str == null || str2 == null) {
            return 0;
        }
        if (str2.length() > 2048) {
            str2 = str2.substring(0, 2048);
        }
        HashMap<String, Object[]> map = A;
        synchronized (map) {
            Object[] objArr = map.get(str);
            if (objArr != null) {
                int iIntValue = ((Integer) objArr[0]).intValue();
                int iIntValue2 = ((Integer) objArr[1]).intValue();
                List list = (List) objArr[2];
                if (list.size() >= iIntValue) {
                    list.remove(0);
                }
                list.add(str2);
                iAddType2 = LogType.isForJava(iIntValue2) ? LogType.addType(0, 16) : 0;
                if (!b.f104224d) {
                    if (LogType.isForNative(iIntValue2)) {
                        iAddType2 = LogType.addType(iAddType2, 1);
                    }
                    if (LogType.isForANR(iIntValue2)) {
                        iAddType2 = LogType.addType(iAddType2, 1048576);
                    }
                }
                iAddType = iAddType2;
                iAddType2 = iIntValue2;
            } else {
                iAddType = 0;
            }
            if (b.f104224d && JNIBridge.nativeAddCachedInfo(str, str2)) {
                if (LogType.isForNative(iAddType2)) {
                    iAddType = LogType.addType(iAddType, 1);
                }
                if (LogType.isForANR(iAddType2)) {
                    iAddType = LogType.addType(iAddType, 1048576);
                }
            }
        }
        return iAddType;
    }

    static long b() {
        return f104139j;
    }

    static String b(String str) {
        StringBuilder sb2 = new StringBuilder();
        HashMap<String, Object[]> map = A;
        synchronized (map) {
            Object[] objArr = map.get(str);
            int iIntValue = ((Integer) objArr[0]).intValue();
            List list = (List) objArr[2];
            sb2.append(String.format(Locale.US, "%s (%d/%d)\n", str, Integer.valueOf(list.size()), Integer.valueOf(iIntValue)));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                sb2.append((String) it.next());
                sb2.append("\n");
            }
        }
        return sb2.toString();
    }

    private static StringBuilder b(String str, boolean z10) {
        String strA;
        StringBuilder sb2 = new StringBuilder();
        try {
            Object[] objArr = f104146q.get(str);
            try {
                if (objArr == null) {
                    strA = "Unknown callback: " + str;
                } else {
                    Callable callable = (Callable) objArr[1];
                    strA = callable != null ? (String) callable.call() : d.a(str, z10);
                }
                if (strA != null) {
                    sb2.append(strA);
                }
            } catch (Throwable th2) {
                sb2.append("[DEBUG] Callback occurred new exception:\n");
                sb2.append(Log.getStackTraceString(th2));
            }
        } catch (Throwable th3) {
            com.uc.crashsdk.a.g.a(th3);
        }
        try {
            if (sb2.length() == 0) {
                sb2.append("(data is null)\n");
            }
        } catch (Throwable th4) {
            com.uc.crashsdk.a.g.a(th4);
        }
        return sb2;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0076 A[Catch: all -> 0x008d, TRY_LEAVE, TryCatch #3 {all -> 0x008d, blocks: (B:18:0x006c, B:19:0x0070, B:21:0x0076), top: B:49:0x006c, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static void b(OutputStream outputStream, String str, String str2, ArrayList<String> arrayList) {
        Iterator it;
        synchronized (A) {
            for (String str3 : B) {
                Object[] objArr = A.get(str3);
                int iIntValue = ((Integer) objArr[0]).intValue();
                int iIntValue2 = ((Integer) objArr[1]).intValue();
                List list = (List) objArr[2];
                if (arrayList == null) {
                    if (LogType.isForJava(iIntValue2)) {
                        try {
                            outputStream.write(String.format(Locale.US, "%s (%d/%d)\n", str3, Integer.valueOf(list.size()), Integer.valueOf(iIntValue)).getBytes(str));
                        } catch (Throwable th2) {
                            e.a(th2, outputStream);
                        }
                        try {
                            it = list.iterator();
                            while (it.hasNext()) {
                                outputStream.write(((String) it.next()).getBytes(str));
                                outputStream.write("\n".getBytes(str));
                            }
                        } catch (Throwable th3) {
                            e.a(th3, outputStream);
                        }
                        try {
                            outputStream.write("\n".getBytes(str));
                            outputStream.write(str2.getBytes(str));
                        } catch (Throwable th4) {
                            e.a(th4, outputStream);
                        }
                    }
                } else if (a(arrayList, str3)) {
                    outputStream.write(String.format(Locale.US, "%s (%d/%d)\n", str3, Integer.valueOf(list.size()), Integer.valueOf(iIntValue)).getBytes(str));
                    it = list.iterator();
                    while (it.hasNext()) {
                        outputStream.write(((String) it.next()).getBytes(str));
                        outputStream.write("\n".getBytes(str));
                    }
                    outputStream.write("\n".getBytes(str));
                    outputStream.write(str2.getBytes(str));
                }
            }
            if (arrayList != null && e.F()) {
                for (String str4 : arrayList) {
                    if (!a(B, str4)) {
                        e.a(outputStream, "CUSTOMCACHEDINFO", str4);
                    }
                }
            }
        }
    }

    static int c() {
        if (f104138i == -1) {
            o();
        }
        return f104138i;
    }

    static ArrayList<String> c(String str) {
        if (com.uc.crashsdk.a.g.a(str)) {
            return null;
        }
        String[] strArrSplit = str.split(";", 20);
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str2 : strArrSplit) {
            if (!com.uc.crashsdk.a.g.a(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    static void d() {
        StringBuilder sb2 = new StringBuilder();
        synchronized (f104134e) {
            for (String str : f104135f) {
                String str2 = f104134e.get(str);
                sb2.append(str);
                sb2.append(": ");
                if (str2 != null) {
                    sb2.append(str2);
                }
                sb2.append("\n");
            }
        }
        sb2.append(String.format(Locale.US, "(saved at %s)\n", e.n()));
        com.uc.crashsdk.a.b.a(b.h(), sb2.toString());
    }

    static void e() {
        if (!f104133d && !b.f104224d) {
            throw new AssertionError();
        }
        synchronized (f104134e) {
            for (String str : f104135f) {
                JNIBridge.nativeAddHeaderInfo(str, f104134e.get(str));
            }
        }
    }

    public static byte[] f() {
        return new byte[]{com.google.common.base.a.B, 99, 121, 60};
    }

    static void g() {
        if (!f104133d && !b.f104224d) {
            throw new AssertionError();
        }
        synchronized (f104140k) {
            for (String str : f104141l) {
                Object[] objArr = f104140k.get(str);
                int iIntValue = ((Integer) objArr[0]).intValue();
                if ((1048833 & iIntValue) != 0) {
                    JNIBridge.nativeAddDumpFile(str, (String) objArr[1], ((Boolean) objArr[2]).booleanValue(), ((Boolean) objArr[3]).booleanValue(), iIntValue, ((Boolean) objArr[4]).booleanValue());
                }
            }
        }
    }

    static String h() {
        StringBuilder sb2 = new StringBuilder();
        synchronized (f104140k) {
            boolean z10 = true;
            for (String str : f104141l) {
                if (LogType.isForJava(((Integer) f104140k.get(str)[0]).intValue())) {
                    if (!z10) {
                        sb2.append("`");
                    }
                    sb2.append(str);
                    z10 = false;
                }
            }
        }
        return sb2.toString();
    }

    static void i() {
        if (!f104133d && !b.f104224d) {
            throw new AssertionError();
        }
        synchronized (f104146q) {
            for (String str : f104147r) {
                Object[] objArr = f104146q.get(str);
                int iIntValue = ((Integer) objArr[0]).intValue();
                if ((1048833 & iIntValue) != 0) {
                    JNIBridge.nativeAddCallbackInfo(str, iIntValue, ((Long) objArr[2]).longValue(), ((Integer) objArr[3]).intValue());
                }
            }
        }
    }

    static String j() {
        String string;
        synchronized (f104146q) {
            StringBuilder sb2 = new StringBuilder();
            List<String> list = f104147r;
            synchronized (list) {
                boolean z10 = true;
                for (String str : list) {
                    if (LogType.isForJava(((Integer) f104146q.get(str)[0]).intValue())) {
                        if (!z10) {
                            sb2.append("`");
                        }
                        sb2.append(str);
                        z10 = false;
                    }
                }
            }
            string = sb2.toString();
        }
        return string;
    }

    static void k() {
        if (!f104133d && !b.f104224d) {
            throw new AssertionError();
        }
        synchronized (A) {
            for (String str : B) {
                Object[] objArr = A.get(str);
                int iIntValue = ((Integer) objArr[0]).intValue();
                int iIntValue2 = ((Integer) objArr[1]).intValue();
                List list = (List) objArr[2];
                if ((1048577 & iIntValue2) != 0 && JNIBridge.nativeCreateCachedInfo(str, iIntValue, iIntValue2) != 0) {
                    Iterator it = list.iterator();
                    while (it.hasNext() && JNIBridge.nativeAddCachedInfo(str, (String) it.next())) {
                    }
                }
            }
        }
    }

    static String l() {
        StringBuilder sb2 = new StringBuilder();
        synchronized (A) {
            boolean z10 = true;
            for (String str : B) {
                if (LogType.isForJava(((Integer) A.get(str)[1]).intValue())) {
                    if (!z10) {
                        sb2.append("`");
                    }
                    sb2.append(str);
                    z10 = false;
                }
            }
        }
        return sb2.toString();
    }

    static String m() throws Throwable {
        if (!G) {
            String strA = com.uc.crashsdk.a.b.a(b.m());
            f104136g = strA;
            G = true;
            if (strA == null) {
                f104136g = "";
            }
        }
        return f104136g;
    }

    public static void n() {
        p();
        if (!H) {
            H = true;
            com.uc.crashsdk.a.f.a(0, new com.uc.crashsdk.a.e(202));
        } else if (b.f104224d) {
            JNIBridge.set(128, f104136g);
        }
    }

    private static boolean o() {
        try {
            PackageInfo packageInfo = com.uc.crashsdk.a.g.a().getPackageManager().getPackageInfo(f104130a, 0);
            f104137h = packageInfo.versionName;
            f104139j = packageInfo.lastUpdateTime;
            f104138i = packageInfo.versionCode;
            return true;
        } catch (Throwable th2) {
            com.uc.crashsdk.a.g.b(th2);
            return false;
        }
    }

    private static void p() {
        if (!I && e.a()) {
            if (b.f104224d || !b.f104227g) {
                String str = String.format(Locale.US, "%s/%s/%s", g.T(), g.U(), g.V());
                com.uc.crashsdk.a.a.b("crashsdk", "UUID: " + e.q());
                com.uc.crashsdk.a.a.b("crashsdk", "Version: " + str);
                com.uc.crashsdk.a.a.b("crashsdk", "Process Name: " + e.h());
                I = true;
            }
        }
    }
}
