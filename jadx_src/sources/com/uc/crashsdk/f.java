package com.uc.crashsdk;

import android.util.SparseArray;
import com.huawei.hms.framework.common.ContainerUtils;
import com.meituan.robust.Constants;
import com.uc.crashsdk.a.h;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ boolean f104305a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f104306b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final SparseArray<String> f104307c = new SparseArray<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f104308d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f104309e = false;

    static int a() {
        File[] fileArrD = b.d();
        if (fileArrD == null) {
            return 0;
        }
        int i10 = 0;
        for (File file : fileArrD) {
            if (a(file.getAbsolutePath(), false)) {
                i10++;
            }
        }
        return i10;
    }

    private static int a(StringBuffer stringBuffer, String str) {
        int iIndexOf = stringBuffer.indexOf(str);
        if (iIndexOf < 0) {
            return 0;
        }
        int iIndexOf2 = stringBuffer.indexOf(ContainerUtils.KEY_VALUE_DELIMITER, iIndexOf + str.length());
        if (iIndexOf2 < 0) {
            com.uc.crashsdk.a.a.b(str + " line not contain '='!");
            return 0;
        }
        int i10 = iIndexOf2 + 1;
        int iIndexOf3 = stringBuffer.indexOf("\n", i10);
        if (iIndexOf3 < 0) {
            iIndexOf3 = stringBuffer.length();
        }
        try {
            int i11 = Integer.parseInt(stringBuffer.substring(i10, iIndexOf3));
            if (i11 < 0) {
                return 0;
            }
            return i11;
        } catch (NumberFormatException e10) {
            com.uc.crashsdk.a.g.a(e10);
            return 0;
        }
    }

    static int a(boolean z10) {
        if (z10) {
            return c(b.e()) ? 1 : 0;
        }
        File[] fileArrF = b.f();
        if (fileArrF == null) {
            return 0;
        }
        int i10 = 0;
        for (File file : fileArrF) {
            if (c(file.getAbsolutePath())) {
                i10++;
            }
        }
        return i10;
    }

    private static String a(StringBuffer stringBuffer) {
        if (stringBuffer == null) {
            return null;
        }
        int iIndexOf = stringBuffer.indexOf(Constants.ARRAY_TYPE);
        if (iIndexOf < 0) {
            com.uc.crashsdk.a.a.a("crashsdk", "getProcessName: Can not found process name start!", null);
            return null;
        }
        int i10 = iIndexOf + 1;
        int iIndexOf2 = stringBuffer.indexOf("]", i10);
        if (iIndexOf2 < 0) {
            com.uc.crashsdk.a.a.a("crashsdk", "getProcessName: Can not found process name end!", null);
            return null;
        }
        String strSubstring = stringBuffer.substring(i10, iIndexOf2);
        if (strSubstring.length() > 0) {
            return strSubstring;
        }
        com.uc.crashsdk.a.a.a("crashsdk", "getProcessName: process name is empty", null);
        return null;
    }

    private static StringBuffer a(File file) throws Throwable {
        FileReader fileReader = null;
        if (!file.exists()) {
            return null;
        }
        char[] cArrD = d();
        if (cArrD == null) {
            com.uc.crashsdk.a.a.a("crashsdk", "readCrashStatData alloc buffer failed!", null);
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            try {
                FileReader fileReader2 = new FileReader(file);
                try {
                    int i10 = fileReader2.read(cArrD);
                    if (i10 > 0) {
                        fileReader = null;
                        stringBuffer.append(cArrD, 0, i10);
                    }
                    com.uc.crashsdk.a.g.a(fileReader2);
                } catch (Exception e10) {
                    e = e10;
                    fileReader = fileReader2;
                    com.uc.crashsdk.a.g.a(e);
                    com.uc.crashsdk.a.g.a(fileReader);
                } catch (Throwable th2) {
                    th = th2;
                    fileReader = fileReader2;
                    com.uc.crashsdk.a.g.a(fileReader);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e11) {
            e = e11;
        }
        return stringBuffer;
    }

    static void a(int i10) {
        a(i10, 1);
    }

    static void a(int i10, int i11) {
        if (i11 != 0) {
            a(b.c(), new com.uc.crashsdk.a.e(bb.c.b.f31039xb, new Object[]{Integer.valueOf(i10), Integer.valueOf(i11)}));
            return;
        }
        com.uc.crashsdk.a.a.b("Add stat for type " + i10 + " with count 0!");
    }

    private static void a(String str, HashMap<String, Integer> map, String str2) {
        if (map.size() <= 0) {
            return;
        }
        if (com.uc.crashsdk.a.g.a(str)) {
            com.uc.crashsdk.a.a.a("crashsdk", "cacheReportedStatsForCallback: processName is null", null);
        } else if (com.uc.crashsdk.a.g.a(str2)) {
            com.uc.crashsdk.a.a.a("crashsdk", "cacheReportedStatsForCallback: callbackCacheFilePathName is null", null);
        } else {
            a(str2, new com.uc.crashsdk.a.e(bb.c.b.Ab, new Object[]{str, map, str2}));
        }
    }

    private static void a(StringBuffer stringBuffer, String str, int i10) {
        int iIndexOf = stringBuffer.indexOf(str);
        if (iIndexOf < 0) {
            if (i10 > 0) {
                stringBuffer.append(str);
                stringBuffer.append(ContainerUtils.KEY_VALUE_DELIMITER);
                stringBuffer.append(i10);
                stringBuffer.append("\n");
                return;
            }
            return;
        }
        int iIndexOf2 = stringBuffer.indexOf("\n", iIndexOf);
        if (iIndexOf2 < 0) {
            iIndexOf2 = stringBuffer.length();
        }
        stringBuffer.replace(iIndexOf, iIndexOf2, str + ContainerUtils.KEY_VALUE_DELIMITER + String.valueOf(i10));
    }

    public static boolean a(int i10, Object[] objArr) {
        switch (i10) {
            case bb.c.b.f31039xb /* 751 */:
                if (f104305a || objArr != null) {
                    return b(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue());
                }
                throw new AssertionError();
            case bb.c.b.f31061yb /* 752 */:
                if (f104305a || objArr != null) {
                    return b((String) objArr[0]);
                }
                throw new AssertionError();
            case bb.c.b.f31083zb /* 753 */:
                if (!f104305a && objArr == null) {
                    throw new AssertionError();
                }
                File file = new File((String) objArr[0]);
                if (!file.exists()) {
                    return false;
                }
                file.delete();
                return true;
            case bb.c.b.Ab /* 754 */:
                if (!f104305a && objArr == null) {
                    throw new AssertionError();
                }
                b((String) objArr[0], (HashMap) objArr[1], (String) objArr[2]);
                return true;
            case bb.c.b.Bb /* 755 */:
                if (f104305a || objArr != null) {
                    return d((String) objArr[0]);
                }
                throw new AssertionError();
            case bb.c.b.Cb /* 756 */:
                if (!f104305a && objArr == null) {
                    throw new AssertionError();
                }
                File file2 = new File((String) objArr[0]);
                if (!file2.exists()) {
                    return false;
                }
                file2.delete();
                return true;
            default:
                return false;
        }
    }

    private static boolean a(File file, StringBuffer stringBuffer) throws Throwable {
        FileWriter fileWriter = null;
        try {
            try {
                FileWriter fileWriter2 = new FileWriter(file);
                try {
                    String string = stringBuffer.toString();
                    fileWriter2.write(string, 0, string.length());
                    com.uc.crashsdk.a.g.a(fileWriter2);
                    return true;
                } catch (Exception e10) {
                    e = e10;
                    fileWriter = fileWriter2;
                    com.uc.crashsdk.a.g.a(e);
                    com.uc.crashsdk.a.g.a(fileWriter);
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter = fileWriter2;
                    com.uc.crashsdk.a.g.a(fileWriter);
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    static boolean a(String str) {
        return a(str, new com.uc.crashsdk.a.e(bb.c.b.f31083zb, new Object[]{str}));
    }

    private static boolean a(String str, com.uc.crashsdk.a.e eVar) {
        return b.a(f104306b, str, eVar);
    }

    static boolean a(String str, boolean z10) {
        if (h.a(z10, "crash detail report")) {
            return false;
        }
        return a(str, new com.uc.crashsdk.a.e(bb.c.b.f31061yb, new Object[]{str}));
    }

    static int b() {
        File[] fileArrD = b.d();
        if (fileArrD == null) {
            return 0;
        }
        int i10 = 0;
        for (File file : fileArrD) {
            if (a(file.getAbsolutePath())) {
                i10++;
            }
        }
        return i10;
    }

    static int b(boolean z10) {
        if (z10) {
            return e(b.e()) ? 1 : 0;
        }
        File[] fileArrF = b.f();
        if (fileArrF == null) {
            return 0;
        }
        int i10 = 0;
        for (File file : fileArrF) {
            if (e(file.getAbsolutePath())) {
                i10++;
            }
        }
        return i10;
    }

    public static void b(int i10) {
        if (i10 != 700) {
            return;
        }
        d(false);
    }

    private static void b(String str, HashMap<String, Integer> map, String str2) {
        try {
            b.x();
        } catch (Throwable th2) {
            com.uc.crashsdk.a.g.a(th2);
        }
        try {
            File file = new File(str2);
            try {
                if (!file.exists()) {
                    file.createNewFile();
                }
            } catch (Throwable th3) {
                com.uc.crashsdk.a.g.a(th3);
            }
            StringBuffer stringBufferA = a(file);
            if (com.uc.crashsdk.a.g.a(stringBufferA)) {
                if (stringBufferA == null) {
                    stringBufferA = new StringBuffer();
                }
                stringBufferA.append(Constants.ARRAY_TYPE);
                stringBufferA.append(str);
                stringBufferA.append("]\n");
            }
            boolean z10 = false;
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                int iIntValue = entry.getValue().intValue();
                if (iIntValue > 0) {
                    String key = entry.getKey();
                    a(stringBufferA, key, iIntValue + a(stringBufferA, key));
                    z10 = true;
                }
            }
            if (z10) {
                a(file, stringBufferA);
            }
        } catch (Throwable th4) {
            com.uc.crashsdk.a.g.a(th4);
        }
    }

    private static boolean b(int i10, int i11) {
        try {
            b.x();
        } catch (Throwable th2) {
            com.uc.crashsdk.a.g.a(th2);
        }
        try {
            String strC = c(i10);
            if (strC == null) {
                com.uc.crashsdk.a.a.a("crashsdk", "Stat type not exists: " + i10, null);
                return false;
            }
            File file = new File(b.c());
            try {
                if (!file.exists()) {
                    file.createNewFile();
                }
            } catch (Throwable th3) {
                com.uc.crashsdk.a.g.a(th3);
            }
            StringBuffer stringBufferA = a(file);
            if (com.uc.crashsdk.a.g.a(stringBufferA)) {
                if (stringBufferA == null) {
                    stringBufferA = new StringBuffer();
                }
                stringBufferA.append(Constants.ARRAY_TYPE);
                stringBufferA.append(e.h());
                stringBufferA.append("]\n");
            }
            a(stringBufferA, strC, a(stringBufferA, strC) + i11);
            return a(file, stringBufferA);
        } catch (Throwable th4) {
            com.uc.crashsdk.a.g.a(th4);
            return false;
        }
    }

    private static boolean b(String str) throws Throwable {
        File file = new File(str);
        StringBuffer stringBufferA = a(file);
        if (com.uc.crashsdk.a.g.a(stringBufferA)) {
            return false;
        }
        String strA = a(stringBufferA);
        StringBuffer stringBuffer = null;
        if (strA == null || strA.length() <= 0) {
            com.uc.crashsdk.a.a.a("crashsdk", "reportCrashStatImpl: process name is invalid", null);
            return false;
        }
        SparseArray<String> sparseArrayE = e();
        HashMap map = new HashMap();
        boolean zO = g.O();
        if (zO) {
            stringBuffer = new StringBuffer();
            stringBuffer.append("reportCrashStatImpl: processName: ");
            stringBuffer.append(strA + "\n");
        }
        boolean z10 = false;
        for (int i10 = 0; i10 < sparseArrayE.size(); i10++) {
            try {
                int iKeyAt = sparseArrayE.keyAt(i10);
                String str2 = sparseArrayE.get(iKeyAt);
                int iA = a(stringBufferA, str2);
                if (iA > 0) {
                    if (zO) {
                        stringBuffer.append("name: ");
                        stringBuffer.append(str2);
                        stringBuffer.append(", key: ");
                        stringBuffer.append(iKeyAt);
                        stringBuffer.append(", count: ");
                        stringBuffer.append(iA);
                        stringBuffer.append("\n");
                    }
                    h.a(strA, iKeyAt, iA);
                    map.put(str2, Integer.valueOf(iA));
                    a(stringBufferA, str2, 0);
                    z10 = true;
                }
            } catch (Throwable th2) {
                if (z10) {
                    a(file, stringBufferA);
                    if (map.size() > 0) {
                        a(strA, (HashMap<String, Integer>) map, b.a(str));
                    }
                }
                throw th2;
            }
        }
        if (zO) {
            com.uc.crashsdk.a.a.a(stringBuffer.toString());
        }
        if (!z10) {
            return true;
        }
        a(file, stringBufferA);
        if (map.size() <= 0) {
            return true;
        }
        a(strA, (HashMap<String, Integer>) map, b.a(str));
        return true;
    }

    private static String c(int i10) {
        String str;
        f();
        SparseArray<String> sparseArray = f104307c;
        synchronized (sparseArray) {
            str = sparseArray.get(i10);
        }
        return str;
    }

    static void c() {
        com.uc.crashsdk.a.f.a(1, new com.uc.crashsdk.a.e(700), 3000L);
    }

    static void c(boolean z10) {
        if (g.Q() && !b.L()) {
            e.j();
            if (!h.e()) {
                h.a(z10);
            }
            if (b.F()) {
                d(z10);
                a(b.c(), z10);
                h.b(z10);
            }
        }
    }

    private static boolean c(String str) {
        if (!com.uc.crashsdk.a.g.a(str) && new File(str).exists()) {
            return a(str, new com.uc.crashsdk.a.e(bb.c.b.Bb, new Object[]{str}));
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x004a A[Catch: all -> 0x0056, TryCatch #0 {, blocks: (B:7:0x0008, B:9:0x000c, B:11:0x000e, B:13:0x0016, B:15:0x0018, B:17:0x0020, B:19:0x002a, B:27:0x004a, B:28:0x004d, B:29:0x0054, B:21:0x0031, B:23:0x0037, B:25:0x0042), top: B:34:0x0008 }] */
    static void d(boolean z10) {
        if (f104309e) {
            return;
        }
        synchronized (f104308d) {
            if (f104309e) {
                return;
            }
            if (h.a(z10, "crash detail")) {
                return;
            }
            boolean z11 = false;
            if (!b.s()) {
                if (b.t()) {
                    a(101, 1);
                    if (b.r()) {
                        a(43, 1);
                    }
                }
                if (z11) {
                    a(1, 1);
                }
                a(100, 1);
                f104309e = true;
            }
            a(2, 1);
            if (b.r()) {
                a(42, 1);
            }
            z11 = true;
            if (z11) {
                a(1, 1);
            }
            a(100, 1);
            f104309e = true;
        }
    }

    private static boolean d(String str) throws Throwable {
        if (!f104305a && str == null) {
            throw new AssertionError();
        }
        File file = new File(str);
        StringBuffer stringBufferA = a(file);
        if (com.uc.crashsdk.a.g.a(stringBufferA)) {
            return false;
        }
        String strA = a(stringBufferA);
        StringBuffer stringBuffer = null;
        if (strA == null || strA.length() <= 0) {
            com.uc.crashsdk.a.a.a("crashsdk", "notifyStatsDetailImpl: process name is invalid", null);
            return false;
        }
        SparseArray<String> sparseArrayE = e();
        boolean zO = g.O();
        if (zO) {
            stringBuffer = new StringBuffer();
            stringBuffer.append("notifyStatsDetailImpl: processName: ");
            stringBuffer.append(strA + "\n");
        }
        boolean z10 = false;
        for (int i10 = 0; i10 < sparseArrayE.size(); i10++) {
            try {
                int iKeyAt = sparseArrayE.keyAt(i10);
                String str2 = sparseArrayE.get(iKeyAt);
                int iA = a(stringBufferA, str2);
                if (iA > 0) {
                    if (zO) {
                        stringBuffer.append("name: ");
                        stringBuffer.append(str2);
                        stringBuffer.append(", key: ");
                        stringBuffer.append(iKeyAt);
                        stringBuffer.append(", count: ");
                        stringBuffer.append(iA);
                        stringBuffer.append("\n");
                    }
                    d.a(strA, iKeyAt, iA);
                    a(stringBufferA, str2, 0);
                    z10 = true;
                }
            } catch (Throwable th2) {
                if (z10) {
                    a(file, stringBufferA);
                }
                throw th2;
            }
        }
        if (zO) {
            com.uc.crashsdk.a.a.a(stringBuffer.toString());
        }
        if (z10) {
            d.a(strA, 1000000, 0);
        }
        if (z10) {
            a(file, stringBufferA);
        }
        return z10;
    }

    private static char[] d() {
        char[] cArr = null;
        int i10 = 1024;
        while (cArr == null && i10 > 0) {
            try {
                cArr = new char[i10];
            } catch (Throwable unused) {
                i10 /= 2;
                if (i10 < 512) {
                    return cArr;
                }
            }
        }
        return cArr;
    }

    private static SparseArray<String> e() {
        SparseArray<String> sparseArrayClone;
        f();
        SparseArray<String> sparseArray = f104307c;
        synchronized (sparseArray) {
            sparseArrayClone = sparseArray.clone();
        }
        return sparseArrayClone;
    }

    private static boolean e(String str) {
        if (!com.uc.crashsdk.a.g.a(str) && new File(str).exists()) {
            return a(str, new com.uc.crashsdk.a.e(bb.c.b.Cb, new Object[]{str}));
        }
        return false;
    }

    private static void f() {
        SparseArray<String> sparseArray = f104307c;
        synchronized (sparseArray) {
            if (sparseArray.size() != 0) {
                return;
            }
            sparseArray.put(100, "start_pv");
            sparseArray.put(102, "start_hpv");
            sparseArray.put(1, "all_all");
            sparseArray.put(2, "all_fg");
            sparseArray.put(101, "all_bg");
            sparseArray.put(3, "java_fg");
            sparseArray.put(4, "java_bg");
            sparseArray.put(7, "native_fg");
            sparseArray.put(8, "native_bg");
            sparseArray.put(27, "native_anr_fg");
            sparseArray.put(28, "native_anr_bg");
            sparseArray.put(9, "native_ok");
            sparseArray.put(10, "unexp_anr");
            sparseArray.put(29, "unexp_lowmem");
            sparseArray.put(30, "unexp_killed");
            sparseArray.put(31, "unexp_exit");
            sparseArray.put(32, "unexp_restart");
            sparseArray.put(11, "unexp_fg");
            sparseArray.put(12, "unexp_bg");
            sparseArray.put(40, "anr_fg");
            sparseArray.put(41, "anr_bg");
            sparseArray.put(42, "anr_cr_fg");
            sparseArray.put(43, "anr_cr_bg");
            sparseArray.put(13, "log_up_succ");
            sparseArray.put(14, "log_up_fail");
            sparseArray.put(15, "log_empty");
            sparseArray.put(200, "log_tmp");
            sparseArray.put(16, "log_abd_all");
            sparseArray.put(22, "log_abd_builtin");
            sparseArray.put(23, "log_abd_custom");
            sparseArray.put(17, "log_large");
            sparseArray.put(18, "log_up_all");
            sparseArray.put(19, "log_up_bytes");
            sparseArray.put(20, "log_up_crash");
            sparseArray.put(21, "log_up_custom");
            sparseArray.put(24, "log_zipped");
            sparseArray.put(201, "log_enced");
            sparseArray.put(25, "log_renamed");
            sparseArray.put(26, "log_safe_skip");
        }
    }
}
