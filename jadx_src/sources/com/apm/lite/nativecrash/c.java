package com.apm.lite.nativecrash;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.apm.lite.CrashType;
import com.apm.lite.ICrashFilter;
import com.apm.lite.k.i;
import com.apm.lite.k.k;
import com.apm.lite.k.o;
import com.apm.lite.k.s;
import com.apm.lite.k.v;
import com.apm.lite.k.w;
import com.apm.lite.runtime.n;
import com.apm.lite.runtime.p;
import com.igexin.sdk.PushConsts;
import com.max.xiaoheihe.loader.dynamic_so.DynamicSoManager;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Boolean f40088d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f40089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private JSONObject f40090b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f40091c;

    public static class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static String b(File file) {
            BufferedReader bufferedReader = null;
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
                try {
                    String line = bufferedReader2.readLine();
                    if (line == null) {
                        k.a(bufferedReader2);
                        return "";
                    }
                    if (line.startsWith("[FATAL:jni_android.cc") && line.contains("Please include Java exception stack in crash report ttwebview:")) {
                        StringBuilder sb2 = new StringBuilder();
                        int iIndexOf = line.indexOf(" ttwebview:");
                        sb2.append("Caused by: ");
                        sb2.append("Please include Java exception stack in crash report");
                        sb2.append("\n");
                        sb2.append(line.substring(iIndexOf + 11));
                        while (true) {
                            sb2.append("\n");
                            String line2 = bufferedReader2.readLine();
                            if (line2 == null) {
                                String string = sb2.toString();
                                k.a(bufferedReader2);
                                return string;
                            }
                            sb2.append(line2);
                        }
                    } else {
                        k.a(bufferedReader2);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = bufferedReader2;
                    try {
                        com.apm.lite.c.a();
                        com.apm.lite.c.b("NPTH_CATCH", th);
                    } finally {
                        k.a(bufferedReader);
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
            return "";
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.apm.lite.nativecrash.e f40092a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.apm.lite.nativecrash.a f40093b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final File f40094c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final File f40095d;

        public b(File file) {
            this.f40094c = file;
            this.f40095d = o.c(com.apm.lite.e.m(), file.getName());
            com.apm.lite.nativecrash.a aVar = new com.apm.lite.nativecrash.a(file);
            this.f40093b = aVar;
            com.apm.lite.nativecrash.e eVar = new com.apm.lite.nativecrash.e(file);
            this.f40092a = eVar;
            if (aVar.a() && eVar.a() == null) {
                eVar.b(file);
            }
        }

        /* JADX WARN: Code duplicated, block: B:11:0x001c A[Catch: all -> 0x0017, TRY_LEAVE, TryCatch #0 {all -> 0x0017, blocks: (B:4:0x0008, B:6:0x000e, B:11:0x001c), top: B:16:0x0008 }] */
        /* JADX WARN: Code duplicated, block: B:9:0x0019  */
        public long a() {
            String str;
            Map<String, String> mapC = this.f40093b.c();
            if (mapC != null) {
                try {
                    if (mapC.isEmpty()) {
                        str = null;
                    } else {
                        str = mapC.get(com.umeng.analytics.pro.d.f104709p);
                    }
                    if (str != null) {
                        return Long.parseLong(str);
                    }
                } catch (Throwable th2) {
                    com.apm.lite.c.a();
                    com.apm.lite.c.b("NPTH_CATCH", th2);
                }
            } else {
                str = null;
                if (str != null) {
                    return Long.parseLong(str);
                }
            }
            return System.currentTimeMillis();
        }

        public File d() {
            return this.f40094c;
        }

        public boolean f() {
            return this.f40093b.a();
        }
    }

    /* JADX INFO: renamed from: com.apm.lite.nativecrash.c$c, reason: collision with other inner class name */
    public class C0312c extends e {
        C0312c() {
            super();
            this.f40100b = "Total FD Count:";
            this.f40099a = o.C(c.this.f40091c.d());
            this.f40101c = ":";
            this.f40102d = -2;
        }
    }

    public class d extends e {
        d() {
            super();
            this.f40100b = "VmSize:";
            this.f40099a = o.G(c.this.f40091c.d());
            this.f40101c = "\\s+";
            this.f40102d = -1;
        }
    }

    public class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected File f40099a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected String f40100b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected String f40101c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected int f40102d;

        public e() {
        }

        public int a() {
            int i10;
            Throwable th2;
            if (!this.f40099a.exists() || !this.f40099a.isFile()) {
                return -1;
            }
            BufferedReader bufferedReader = null;
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(this.f40099a));
                int iB = -1;
                do {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            break;
                        }
                        iB = b(line);
                    } catch (Throwable th3) {
                        th2 = th3;
                        i10 = iB;
                        bufferedReader = bufferedReader2;
                        try {
                            com.apm.lite.c.a();
                            com.apm.lite.c.b("NPTH_CATCH", th2);
                            return i10;
                        } finally {
                            if (bufferedReader != null) {
                                k.a(bufferedReader);
                            }
                        }
                    }
                } while (iB == -1);
                k.a(bufferedReader2);
                return iB;
            } catch (Throwable th4) {
                i10 = -1;
                th2 = th4;
            }
        }

        public int b(String str) {
            int i10 = this.f40102d;
            if (!str.startsWith(this.f40100b)) {
                return i10;
            }
            try {
                i10 = Integer.parseInt(str.split(this.f40101c)[1].trim());
            } catch (NumberFormatException e10) {
                com.apm.lite.c.a();
                com.apm.lite.c.b("NPTH_CATCH", e10);
            }
            if (i10 < 0) {
                return -2;
            }
            return i10;
        }
    }

    public class f extends e {
        f() {
            super();
            this.f40100b = "Total Threads Count:";
            this.f40099a = o.D(c.this.f40091c.d());
            this.f40101c = ":";
            this.f40102d = -2;
        }
    }

    public c(Context context) {
        this.f40089a = context;
    }

    private int A() {
        return new C0312c().a();
    }

    private int B() {
        return new f().a();
    }

    private int C() {
        return new d().a();
    }

    private String b(String str) {
        StringBuilder sb2 = new StringBuilder();
        try {
            if (str.length() < 16) {
                sb2.append(str);
            } else {
                sb2.append(str.charAt(6));
                sb2.append(str.charAt(7));
                sb2.append(str.charAt(4));
                sb2.append(str.charAt(5));
                sb2.append(str.charAt(2));
                sb2.append(str.charAt(3));
                sb2.append(str.charAt(0));
                sb2.append(str.charAt(1));
                sb2.append(str.charAt(10));
                sb2.append(str.charAt(11));
                sb2.append(str.charAt(8));
                sb2.append(str.charAt(9));
                sb2.append(str.charAt(14));
                sb2.append(str.charAt(15));
                sb2.append(str.charAt(12));
                sb2.append(str.charAt(13));
                if (str.length() >= 32) {
                    sb2.append((CharSequence) str, 16, 32);
                    sb2.append('0');
                }
            }
        } catch (Throwable th2) {
            com.apm.lite.c.a();
            com.apm.lite.c.b("NPTH_CATCH", th2);
        }
        return sb2.toString().toUpperCase();
    }

    private void d(com.apm.lite.d.a aVar) {
        aVar.c(z());
        aVar.j("is_native_crash", 1);
        aVar.j("repack_time", Long.valueOf(System.currentTimeMillis()));
        aVar.j("crash_uuid", this.f40091c.d().getName());
        aVar.j("jiffy", Long.valueOf(n.a.a()));
    }

    private void f(Map<String, String> map) {
        map.put("has_fds_file", o.C(this.f40091c.d()).exists() ? "true" : "false");
        File fileA = o.A(this.f40091c.d());
        map.put("has_logcat_file", (!fileA.exists() || fileA.length() <= 128) ? "false" : "true");
        map.put("has_maps_file", o.p(this.f40091c.d()).exists() ? "true" : "false");
        map.put("has_tombstone_file", o.i(this.f40091c.d()).exists() ? "true" : "false");
        map.put("has_meminfo_file", o.G(this.f40091c.d()).exists() ? "true" : "false");
        map.put("has_threads_file", o.D(this.f40091c.d()).exists() ? "true" : "false");
    }

    private void h(com.apm.lite.d.a aVar) {
        HashMap map = new HashMap();
        if (y()) {
            map.put("is_root", "true");
            aVar.j("is_root", "true");
        } else {
            map.put("is_root", "false");
            aVar.j("is_root", "false");
        }
        f(map);
        int iA = A();
        if (iA > 0) {
            if (iA > 960) {
                map.put("fd_leak", "true");
            } else {
                map.put("fd_leak", "false");
            }
            aVar.j("fd_count", Integer.valueOf(iA));
        }
        int iB = B();
        if (iB > 0) {
            if (iB > 350) {
                map.put("threads_leak", "true");
            } else {
                map.put("threads_leak", "false");
            }
            aVar.j("threads_count", Integer.valueOf(iB));
        }
        int iC = C();
        if (iC > 0) {
            if (iC > u()) {
                map.put("memory_leak", "true");
            } else {
                map.put("memory_leak", "false");
            }
            aVar.j("memory_size", Integer.valueOf(iC));
        }
        map.put("sdk_version", "0.0.1-rc.3");
        map.put("has_java_stack", String.valueOf(aVar.G().opt("java_data") != null));
        JSONArray jSONArrayB = com.apm.lite.nativecrash.d.b(o.I(this.f40091c.f40094c), o.J(this.f40091c.f40094c));
        map.put("leak_threads_count", String.valueOf(jSONArrayB.length()));
        if (jSONArrayB.length() > 0) {
            try {
                i.l(o.K(this.f40091c.f40094c), jSONArrayB, false);
            } catch (Throwable unused) {
            }
        }
        aVar.t();
        aVar.x();
        aVar.w(map);
    }

    private void i(com.apm.lite.d.a aVar) {
        Map<String, String> mapC = this.f40091c.f40092a.c();
        if (mapC.isEmpty()) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        for (String str : mapC.keySet()) {
            String strB = b(mapC.get(str));
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("lib_name", str);
                jSONObject.put("lib_uuid", strB);
                jSONArray.put(jSONObject);
            } catch (JSONException e10) {
                com.apm.lite.c.a();
                com.apm.lite.c.b("NPTH_CATCH", e10);
            }
        }
        aVar.j("crash_lib_uuid", jSONArray);
    }

    private void l(com.apm.lite.d.a aVar) {
        File fileS = o.s(this.f40091c.d());
        if (!fileS.exists() && this.f40090b == null) {
            aVar.s(w.b(com.apm.lite.e.m()));
            aVar.e("has_callback", "false");
            return;
        }
        try {
            JSONObject jSONObject = this.f40090b;
            if (jSONObject == null) {
                jSONObject = new JSONObject(i.z(fileS.getAbsolutePath()));
            }
            aVar.y(jSONObject);
            aVar.e("has_callback", "true");
            if (aVar.G().opt("storage") == null) {
                aVar.s(w.b(com.apm.lite.e.m()));
            }
            s.a(aVar, aVar.H(), CrashType.NATIVE);
        } catch (Throwable th2) {
            com.apm.lite.c.a();
            com.apm.lite.c.b("NPTH_CATCH", th2);
        }
        long j10 = -1;
        long jOptLong = aVar.G().optLong("crash_time", -1L);
        long jOptLong2 = aVar.G().optLong("java_end", -1L);
        if (jOptLong2 != -1 && jOptLong != -1) {
            j10 = jOptLong2 - jOptLong;
        }
        try {
            aVar.q("total_cost", String.valueOf(j10));
            aVar.e("total_cost", String.valueOf(j10 / 1000));
        } catch (Throwable unused) {
        }
    }

    private void n(com.apm.lite.d.a aVar) {
        String strA;
        File fileY = o.y(this.f40091c.d());
        if (fileY.exists()) {
            try {
                strA = v.a(fileY.getAbsolutePath());
            } catch (Throwable th2) {
                com.apm.lite.c.a();
                com.apm.lite.c.b("NPTH_CATCH", th2);
                strA = "";
            }
        } else {
            strA = "";
        }
        File fileL = o.L(this.f40091c.d());
        if (fileL.exists()) {
            String strB = a.b(fileL);
            if (strA.isEmpty()) {
                strA = strB;
            } else {
                strA = strA + "\n" + strB;
            }
        }
        try {
            if (strA.isEmpty()) {
                return;
            }
            aVar.j("java_data", strA);
        } catch (Throwable th3) {
            com.apm.lite.c.a();
            com.apm.lite.c.b("NPTH_CATCH", th3);
        }
    }

    private void o(com.apm.lite.d.a aVar) {
        File fileD = o.d(this.f40091c.d());
        if (fileD.exists()) {
            try {
                aVar.j("native_log", i.v(i.g(fileD.getAbsolutePath(), "\n"), "\n"));
            } catch (Throwable th2) {
                com.apm.lite.c.a();
                com.apm.lite.c.b("NPTH_CATCH", th2);
            }
        }
    }

    private void q(com.apm.lite.d.a aVar) {
        File fileA = o.A(this.f40091c.d());
        if (!fileA.exists()) {
            NativeImpl.dumpLogcat(fileA.getAbsolutePath(), String.valueOf(com.apm.lite.e.o().getLogcatDumpCount()), String.valueOf(com.apm.lite.e.o().getLogcatLevel()));
        }
        BufferedReader bufferedReader = null;
        JSONArray jSONArray = new JSONArray();
        String str = " " + this.f40091c.f40093b.c().get(PushConsts.KEY_SERVICE_PIT) + " ";
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(fileA));
            try {
                if (fileA.length() > 512000) {
                    bufferedReader2.skip(fileA.length() - 512000);
                }
                while (true) {
                    String line = bufferedReader2.readLine();
                    if (line == null) {
                        break;
                    }
                    if ((line.length() > 32 ? line.substring(0, 31) : line).contains(str)) {
                        jSONArray.put(line);
                    }
                }
                k.a(bufferedReader2);
            } catch (Throwable unused) {
                bufferedReader = bufferedReader2;
                k.a(bufferedReader);
            }
        } catch (Throwable unused2) {
        }
        aVar.j("logcat", jSONArray);
    }

    private void t(com.apm.lite.d.a aVar) {
        Map<String, String> mapC = c();
        if (mapC == null || aVar == null) {
            return;
        }
        String str = mapC.get("process_name");
        if (str != null) {
            aVar.j("process_name", str);
        }
        String str2 = mapC.get(com.umeng.analytics.pro.d.f104709p);
        if (str2 != null) {
            try {
                aVar.b(Long.decode(str2).longValue());
            } catch (Throwable th2) {
                com.apm.lite.c.a();
                com.apm.lite.c.b("NPTH_CATCH", th2);
            }
        }
        String str3 = mapC.get(PushConsts.KEY_SERVICE_PIT);
        if (str3 != null) {
            try {
                aVar.j(PushConsts.KEY_SERVICE_PIT, Long.decode(str3));
            } catch (Throwable th3) {
                com.apm.lite.c.a();
                com.apm.lite.c.b("NPTH_CATCH", th3);
            }
        }
        String str4 = mapC.get("crash_thread_name");
        if (str4 != null) {
            aVar.j("crash_thread_name", str4);
        }
        String str5 = mapC.get("crash_time");
        if (str5 != null) {
            try {
                aVar.j("crash_time", Long.decode(str5));
            } catch (Throwable th4) {
                com.apm.lite.c.a();
                com.apm.lite.c.b("NPTH_CATCH", th4);
            }
        }
        aVar.j("data", g());
    }

    public static long u() {
        if (NativeImpl.is64BitRuntime()) {
            return Long.MAX_VALUE;
        }
        return com.apm.lite.d.c.f() ? 3891200L : 2867200L;
    }

    public static boolean y() {
        Boolean bool = f40088d;
        if (bool != null) {
            return bool.booleanValue();
        }
        String[] strArr = {"/data/local/su", "/data/local/bin/su", "/data/local/xbin/su", "/system/xbin/su", "/system/bin/su", "/system/bin/.ext/su", "/system/bin/failsafe/su", "/system/sd/xbin/su", "/system/usr/we-need-root/su", "/sbin/su", "/su/bin/su"};
        for (int i10 = 0; i10 < 11; i10++) {
            try {
                if (new File(strArr[i10]).exists()) {
                    f40088d = Boolean.TRUE;
                    return true;
                }
                continue;
            } catch (Throwable th2) {
                com.apm.lite.c.a();
                com.apm.lite.c.b("NPTH_CATCH", th2);
            }
        }
        f40088d = Boolean.FALSE;
        return false;
    }

    private com.apm.lite.d.c z() {
        com.apm.lite.d.c cVar = new com.apm.lite.d.c(this.f40089a);
        JSONObject jSONObjectD = p.b().d(this.f40091c.a());
        if (jSONObjectD != null) {
            cVar.l(jSONObjectD);
            cVar.o();
            cVar.q();
        }
        com.apm.lite.d.c.h(cVar);
        return cVar;
    }

    public Map<String, String> c() {
        b bVar = this.f40091c;
        if (bVar != null) {
            return bVar.f40093b.c();
        }
        return null;
    }

    public void e(File file) {
        this.f40091c = new b(file);
    }

    public String g() {
        b bVar = this.f40091c;
        if (bVar == null) {
            return null;
        }
        String strE = bVar.f40092a.e();
        return (strE == null || strE.isEmpty()) ? this.f40091c.f40093b.b() : strE;
    }

    public boolean j() {
        b bVar = this.f40091c;
        if (bVar != null) {
            return bVar.f();
        }
        return false;
    }

    public JSONObject k() {
        File fileV = o.v(this.f40091c.d());
        if (!fileV.exists()) {
            return null;
        }
        try {
            String strZ = i.z(fileV.getAbsolutePath());
            if (strZ != null && !strZ.isEmpty()) {
                return new JSONObject(strZ);
            }
        } catch (Throwable th2) {
            com.apm.lite.c.a();
            com.apm.lite.c.b("NPTH_CATCH", th2);
        }
        return null;
    }

    public void m() {
        try {
            File fileS = o.s(this.f40091c.d());
            File file = new File(fileS.getAbsolutePath() + ".tmp'");
            if (file.exists()) {
                file.delete();
            }
            int i10 = 0;
            if (fileS.exists()) {
                while (i10 < com.apm.lite.nativecrash.b.a()) {
                    File file2 = new File(fileS.getAbsolutePath() + lg.a.f131414g + i10);
                    if (file2.exists()) {
                        file2.delete();
                    }
                    i10++;
                }
                return;
            }
            com.apm.lite.d.a aVar = new com.apm.lite.d.a();
            for (int i11 = 0; i11 < com.apm.lite.nativecrash.b.a(); i11++) {
                File file3 = new File(fileS.getAbsolutePath() + lg.a.f131414g + i11);
                if (file3.exists()) {
                    try {
                        String strZ = i.z(file3.getAbsolutePath());
                        if (!TextUtils.isEmpty(strZ)) {
                            JSONObject jSONObject = new JSONObject(strZ);
                            if (jSONObject.length() > 0) {
                                aVar.y(jSONObject);
                            }
                        }
                    } catch (JSONException unused) {
                    }
                }
            }
            JSONObject jSONObjectG = aVar.G();
            try {
                if (jSONObjectG.length() != 0 && jSONObjectG.opt("storage") == null) {
                    com.apm.lite.d.a.n(jSONObjectG, w.b(com.apm.lite.e.m()));
                }
            } catch (Throwable unused2) {
            }
            if (jSONObjectG.length() != 0) {
                this.f40090b = jSONObjectG;
                i.w(file, jSONObjectG, false);
                if (file.renameTo(fileS)) {
                    while (i10 < com.apm.lite.nativecrash.b.a()) {
                        File file4 = new File(fileS.getAbsolutePath() + lg.a.f131414g + i10);
                        if (file4.exists()) {
                            file4.delete();
                        }
                        i10++;
                    }
                }
            }
        } catch (IOException e10) {
            com.apm.lite.c.a();
            com.apm.lite.c.b("NPTH_CATCH", e10);
        }
    }

    public boolean p() {
        ICrashFilter iCrashFilterC = com.apm.lite.e.f().c();
        if (iCrashFilterC == null) {
            return true;
        }
        try {
            return iCrashFilterC.onNativeCrashFilter(g(), "");
        } catch (Throwable th2) {
            com.apm.lite.c.a();
            com.apm.lite.c.b("NPTH_CATCH", th2);
            return true;
        }
    }

    public boolean r() {
        return o6.a.a().d(o.v(this.f40091c.d()).getAbsolutePath());
    }

    public void s() {
        o6.a.a().c(p6.a.a(o.v(this.f40091c.d()).getAbsolutePath()));
    }

    public JSONObject v() {
        try {
            com.apm.lite.d.a aVar = new com.apm.lite.d.a();
            d(aVar);
            t(aVar);
            i(aVar);
            l(aVar);
            n(aVar);
            q(aVar);
            o(aVar);
            h(aVar);
            File fileV = o.v(this.f40091c.d());
            JSONObject jSONObjectG = aVar.G();
            i.m(fileV, jSONObjectG, false);
            return jSONObjectG;
        } catch (Throwable th2) {
            com.apm.lite.c.a();
            com.apm.lite.c.b("NPTH_CATCH", th2);
            return null;
        }
    }

    public boolean w() {
        return i.r(this.f40091c.d());
    }

    public void x() {
        try {
            i.A(this.f40091c.d().getAbsolutePath(), Environment.getExternalStorageDirectory().getAbsolutePath() + "/localDebug/" + com.apm.lite.e.m().getPackageName() + "/" + this.f40091c.d().getName() + DynamicSoManager.f77249d);
        } catch (Throwable th2) {
            com.apm.lite.c.a();
            com.apm.lite.c.b("NPTH_CATCH", th2);
        }
    }
}
