package com.apm.lite.j;

import android.content.Context;
import android.text.TextUtils;
import com.apm.lite.CrashType;
import com.apm.lite.Npth;
import com.apm.lite.k.o;
import com.apm.lite.k.p;
import com.apm.lite.k.w;
import com.apm.lite.nativecrash.NativeImpl;
import com.apm.lite.runtime.m;
import com.apm.lite.runtime.n;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.apache.tools.ant.taskdefs.z0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile b f39975h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f39976a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f f39978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private HashMap<String, f> f39979d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f39977b = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f39980e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Runnable f39981f = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Runnable f39982g = new RunnableC0310b();

    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            b.this.w();
        }
    }

    /* JADX INFO: renamed from: com.apm.lite.j.b$b, reason: collision with other inner class name */
    public class RunnableC0310b implements Runnable {
        RunnableC0310b() {
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            b.this.u();
        }
    }

    public class c implements com.apm.lite.d.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.apm.lite.d.d f39985a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ File f39986b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f39987c;

        c(com.apm.lite.d.d dVar, File file, f fVar) {
            this.f39985a = dVar;
            this.f39986b = file;
            this.f39987c = fVar;
        }

        @Override // com.apm.lite.d.b.a
        public void a(JSONObject jSONObject) {
            com.apm.lite.j.e.e(this.f39985a.a(), jSONObject.toString(), new File(this.f39986b, "logZip"), o.c(b.this.f39976a, this.f39987c.f39997a));
        }
    }

    public class d implements com.apm.lite.d.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ File f39989a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f39990b;

        d(File file, f fVar) {
            this.f39989a = file;
            this.f39990b = fVar;
        }

        @Override // com.apm.lite.d.b.a
        public void a(JSONObject jSONObject) {
            com.apm.lite.j.d.a().c(jSONObject, this.f39989a, o.c(b.this.f39976a, this.f39990b.f39997a));
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        File f39992a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f39993b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f39994c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        CrashType f39995d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        String f39996e;

        e(File file, long j10, CrashType crashType) {
            this.f39994c = -1L;
            this.f39992a = file;
            this.f39993b = j10;
            this.f39995d = crashType;
            this.f39996e = file.getName();
        }

        e(File file, CrashType crashType) {
            this.f39993b = -1L;
            this.f39994c = -1L;
            this.f39992a = file;
            this.f39995d = crashType;
            this.f39996e = file.getName();
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f39997a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        e f40000d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        e f40001e;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        List<e> f39998b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        List<e> f39999c = new ArrayList();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f40002f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f40003g = 0;

        f(String str) {
            this.f39997a = str;
        }
    }

    private b(Context context) {
        this.f39976a = context;
    }

    private com.apm.lite.d.d a(File file, CrashType crashType, String str, long j10, long j11) {
        com.apm.lite.d.d dVar;
        try {
            try {
                if (file.isFile()) {
                    com.apm.lite.k.i.r(file);
                    return null;
                }
                boolean z10 = crashType == CrashType.LAUNCH;
                if (crashType == null) {
                    try {
                        return com.apm.lite.k.i.C(new File(file, file.getName()).getAbsolutePath());
                    } catch (Throwable th2) {
                        th = th2;
                        dVar = null;
                        com.apm.lite.k.i.r(file);
                        com.apm.lite.c.a();
                        com.apm.lite.c.b("NPTH_CATCH", th);
                        return dVar;
                    }
                }
                com.apm.lite.d.d dVarB = com.apm.lite.k.i.b(file, crashType);
                try {
                    JSONObject jSONObjectF = dVarB.f();
                    if (dVarB.f() == null) {
                        com.apm.lite.k.i.r(file);
                    } else {
                        if (crashType == CrashType.ANR) {
                            return dVarB;
                        }
                        jSONObjectF.put("crash_time", j10);
                        jSONObjectF.put("app_start_time", j11);
                        JSONObject jSONObjectOptJSONObject = jSONObjectF.optJSONObject("header");
                        if (jSONObjectOptJSONObject == null) {
                            jSONObjectOptJSONObject = com.apm.lite.d.c.b(this.f39976a, j10).s();
                        } else if (z10) {
                            jSONObjectF.remove("header");
                        }
                        String strOptString = jSONObjectOptJSONObject.optString("sdk_version_name", null);
                        if (strOptString == null) {
                            strOptString = "0.0.1-rc.3";
                        }
                        com.apm.lite.d.a.k(jSONObjectF, "filters", "sdk_version", strOptString);
                        if (com.apm.lite.k.i.t(jSONObjectF.optJSONArray("logcat"))) {
                            jSONObjectF.put("logcat", com.apm.lite.runtime.j.b(str));
                        }
                        com.apm.lite.d.a.k(jSONObjectF, "filters", "has_dump", "true");
                        com.apm.lite.d.a.k(jSONObjectF, "filters", "has_logcat", String.valueOf(!com.apm.lite.k.l.h(jSONObjectF, "logcat")));
                        com.apm.lite.d.a.k(jSONObjectF, "filters", "memory_leak", String.valueOf(com.apm.lite.d.a.v(str)));
                        com.apm.lite.d.a.k(jSONObjectF, "filters", "fd_leak", String.valueOf(com.apm.lite.d.a.z(str)));
                        com.apm.lite.d.a.k(jSONObjectF, "filters", "threads_leak", String.valueOf(com.apm.lite.d.a.B(str)));
                        com.apm.lite.d.a.k(jSONObjectF, "filters", "is_64_devices", String.valueOf(com.apm.lite.d.c.f()));
                        com.apm.lite.d.a.k(jSONObjectF, "filters", "is_64_runtime", String.valueOf(NativeImpl.is64BitRuntime()));
                        com.apm.lite.d.a.k(jSONObjectF, "filters", "is_x86_devices", String.valueOf(com.apm.lite.d.c.j()));
                        com.apm.lite.d.a.k(jSONObjectF, "filters", "has_meminfo_file", String.valueOf(com.apm.lite.d.a.p(str)));
                        com.apm.lite.d.a.k(jSONObjectF, "filters", "is_root", String.valueOf(com.apm.lite.nativecrash.c.y()));
                        jSONObjectF.put("launch_did", com.apm.lite.g.a.a(this.f39976a));
                        jSONObjectF.put("crash_uuid", file.getName());
                        jSONObjectF.put("jiffy", n.a.a());
                        try {
                            long j12 = Long.parseLong(com.apm.lite.runtime.b.a(j10, str));
                            com.apm.lite.d.a.k(jSONObjectF, "filters", "lastAliveTime", Math.abs(j12 - j10) < 60000 ? "< 60s" : "> 60s");
                            jSONObjectF.put("lastAliveTime", String.valueOf(j12));
                        } catch (Throwable unused) {
                            jSONObjectF.put("lastAliveTime", "unknown");
                            com.apm.lite.d.a.k(jSONObjectF, "filters", "lastAliveTime", "unknown");
                        }
                        jSONObjectF.put("has_dump", "true");
                        if (jSONObjectF.opt("storage") == null) {
                            com.apm.lite.d.a.n(jSONObjectF, w.b(com.apm.lite.e.m()));
                        }
                        if (com.apm.lite.d.c.n(jSONObjectOptJSONObject)) {
                            com.apm.lite.d.a.k(jSONObjectF, "filters", "unauthentic_version", "unauthentic_version");
                        }
                        dVarB.f().put("upload_scene", "launch_scan");
                        if (z10) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObjectF.put("event_type", "start_crash");
                            jSONObjectF.put("stack", jSONObjectF.remove("data"));
                            jSONObject.put("data", new JSONArray().put(jSONObjectF));
                            jSONObject.put("header", jSONObjectOptJSONObject);
                            dVarB.d(jSONObject);
                        } else {
                            jSONObjectF.put("isJava", 1);
                        }
                    }
                    return dVarB;
                } catch (Throwable th3) {
                    th = th3;
                    dVar = dVarB;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            dVar = null;
        }
        com.apm.lite.k.i.r(file);
        com.apm.lite.c.a();
        com.apm.lite.c.b("NPTH_CATCH", th);
        return dVar;
    }

    public static b b() {
        if (f39975h == null) {
            synchronized (b.class) {
                if (f39975h == null) {
                    f39975h = new b(com.apm.lite.e.m());
                }
            }
        }
        return f39975h;
    }

    private JSONObject c(com.apm.lite.nativecrash.c cVar) {
        JSONObject jSONObjectK = cVar.k();
        if (jSONObjectK != null && jSONObjectK.length() != 0) {
            return jSONObjectK;
        }
        if (com.apm.lite.e.j()) {
            cVar.x();
        }
        if (!cVar.j()) {
            cVar.w();
            return null;
        }
        if (!cVar.p()) {
            cVar.w();
            return null;
        }
        if (cVar.r()) {
            cVar.w();
            return null;
        }
        cVar.m();
        return cVar.v();
    }

    private void d(f fVar) {
        com.apm.lite.k.i.r(o.c(this.f39976a, fVar.f39997a));
        com.apm.lite.k.i.r(o.h(this.f39976a, fVar.f39997a));
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0094 A[Catch: all -> 0x0160, PHI: r13
  0x0094: PHI (r13v1 java.io.File) = (r13v2 java.io.File), (r13v3 java.io.File) binds: [B:34:0x00a3, B:30:0x0092] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0160, blocks: (B:14:0x0045, B:16:0x004b, B:17:0x0050, B:20:0x0057, B:25:0x0063, B:27:0x0074, B:33:0x009b, B:37:0x00af, B:39:0x00b3, B:44:0x00c7, B:56:0x010c, B:51:0x00ef, B:46:0x00cb, B:53:0x00f8, B:55:0x0106, B:31:0x0094, B:29:0x0082, B:48:0x00d3), top: B:74:0x0045, inners: #4 }] */
    private void e(f fVar, boolean z10, com.apm.lite.runtime.h hVar) {
        Iterator<e> it;
        JSONObject jSONObjectF;
        JSONObject jSONObjectOptJSONObject;
        File file;
        if (fVar.f39998b.isEmpty()) {
            return;
        }
        if (fVar.f40001e == null) {
            fVar.f40001e = fVar.f40000d;
        }
        Iterator<e> it2 = fVar.f39998b.iterator();
        while (it2.hasNext()) {
            e next = it2.next();
            try {
                File file2 = next.f39992a;
                CrashType crashType = next.f39995d;
                it = it2;
                try {
                    com.apm.lite.d.d dVarA = a(file2, crashType, fVar.f39997a, next.f39993b, next.f39994c);
                    if (dVarA == null || (jSONObjectF = dVarA.f()) == null || (jSONObjectOptJSONObject = jSONObjectF.optJSONObject("header")) == null) {
                        com.apm.lite.k.i.r(file2);
                    } else {
                        if (crashType == null) {
                            file = file2;
                            if (new File(file, file2.getName()).exists() || file.getName().split(lg.a.f131412e).length < 5) {
                                if (com.apm.lite.j.e.c(dVarA.a(), jSONObjectF.toString(), false).a()) {
                                    com.apm.lite.k.i.r(file);
                                }
                            }
                        } else {
                            file = file2;
                        }
                        File fileA = com.apm.lite.d.b.a(file);
                        if (fileA.exists()) {
                            try {
                                JSONArray jSONArray = new JSONArray(com.apm.lite.k.i.y(fileA));
                                JSONObject jSONObjectOptJSONObject2 = crashType == CrashType.LAUNCH ? ((JSONArray) jSONObjectF.opt("data")).optJSONObject(0) : jSONObjectF;
                                if ((!z10 && fVar.f40001e != next) || next.f39996e.contains(z0.b.f136024i)) {
                                    try {
                                        com.apm.lite.d.a.k(jSONObjectOptJSONObject2, "filters", CommonNetImpl.AID, String.valueOf(jSONObjectOptJSONObject.opt(CommonNetImpl.AID)));
                                        com.apm.lite.d.a.k(jSONObjectOptJSONObject2, "filters", "has_ignore", String.valueOf(next.f39996e.contains(z0.b.f136024i)));
                                    } catch (Throwable th2) {
                                        com.apm.lite.c.a();
                                        com.apm.lite.c.b("NPTH_CATCH", th2);
                                    }
                                } else if (hVar != null && !hVar.c(jSONObjectOptJSONObject2.optString("crash_md5", "default"))) {
                                    com.apm.lite.k.i.r(next.f39992a);
                                }
                                com.apm.lite.d.a.k(jSONObjectOptJSONObject2, "filters", "start_uuid", fVar.f39997a);
                                com.apm.lite.d.a.k(jSONObjectOptJSONObject2, "filters", "leak_threads_count", String.valueOf(fVar.f40003g));
                                com.apm.lite.d.a.k(jSONObjectOptJSONObject2, "filters", "crash_thread_name", jSONObjectOptJSONObject2.optString("crash_thread_name", "unknown"));
                                try {
                                    com.apm.lite.d.b.i(jSONObjectF, jSONArray, new c(dVarA, file, fVar));
                                    if (!com.apm.lite.k.i.r(file)) {
                                        o6.a.a().c(p6.a.a(file.getAbsolutePath()));
                                    }
                                    com.apm.lite.runtime.g.b(o.h(com.apm.lite.e.m(), fVar.f39997a), file.getName());
                                    com.apm.lite.j.c.b(crashType, jSONObjectF);
                                } catch (Throwable th3) {
                                    th = th3;
                                    com.apm.lite.c.a();
                                    com.apm.lite.c.b("NPTH_CATCH", th);
                                    com.apm.lite.k.i.r(next.f39992a);
                                }
                            } catch (Throwable unused) {
                            }
                        } else {
                            com.apm.lite.k.i.r(file);
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th5) {
                th = th5;
                it = it2;
            }
            it2 = it;
        }
    }

    private void g(File file, f fVar) {
    }

    private void h(HashMap<String, f> map) {
        File[] fileArrListFiles = o.u(this.f39976a).listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return;
        }
        for (int i10 = 0; i10 < fileArrListFiles.length && i10 < 5; i10++) {
            File file = fileArrListFiles[i10];
            try {
                if (file.isDirectory() && file.getName().endsWith("G")) {
                    String name = file.getName();
                    f fVar = map.get(name);
                    if (fVar == null) {
                        fVar = new f(name);
                        map.put(name, fVar);
                    }
                    JSONArray jSONArrayB = com.apm.lite.nativecrash.d.b(o.I(file), o.J(file));
                    int length = jSONArrayB.length();
                    fVar.f40003g = length;
                    if (length > 0) {
                        try {
                            com.apm.lite.k.i.l(o.K(file), jSONArrayB, false);
                        } catch (Throwable unused) {
                        }
                    }
                } else {
                    com.apm.lite.k.i.r(file);
                }
            } catch (Throwable th2) {
                com.apm.lite.c.a();
                com.apm.lite.c.b("NPTH_CATCH", th2);
                com.apm.lite.k.i.r(file);
            }
        }
    }

    private void i(HashMap<String, f> map, f fVar) {
        File[] fileArrListFiles = o.o(this.f39976a).listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return;
        }
        for (int i10 = 0; i10 < fileArrListFiles.length && i10 < 5; i10++) {
            File file = fileArrListFiles[i10];
            try {
                if (file.isDirectory() && file.getName().endsWith("G")) {
                    String name = file.getName();
                    f fVar2 = map.get(name);
                    if (fVar2 == null) {
                        fVar2 = new f(name);
                        map.put(name, fVar2);
                    }
                    fVar2.f39999c.add(new e(file, CrashType.NATIVE));
                } else {
                    com.apm.lite.k.i.r(file);
                }
            } catch (Throwable th2) {
                com.apm.lite.c.a();
                com.apm.lite.c.b("NPTH_CATCH", th2);
                com.apm.lite.k.i.r(file);
            }
        }
    }

    private void j(HashMap<String, f> map, f fVar, File file, String str) {
        if (!str.endsWith("G")) {
            com.apm.lite.k.i.r(file);
            return;
        }
        String[] strArrSplit = str.split(lg.a.f131412e);
        CrashType crashType = null;
        if (strArrSplit.length < 5) {
            fVar.f39998b.add(new e(file, null));
            return;
        }
        try {
            long j10 = Long.parseLong(strArrSplit[0]);
            long j11 = Long.parseLong(strArrSplit[4]);
            String str2 = strArrSplit[2];
            String str3 = strArrSplit[1];
            str3.hashCode();
            switch (str3) {
                case "launch":
                    crashType = CrashType.LAUNCH;
                    break;
                case "anr":
                    crashType = CrashType.ANR;
                    break;
                case "java":
                    crashType = CrashType.JAVA;
                    break;
            }
            f fVar2 = map.get(str2);
            if (fVar2 == null) {
                fVar2 = new f(str2);
                map.put(str2, fVar2);
            }
            e eVar = new e(file, j10, crashType);
            eVar.f39994c = j11;
            e eVar2 = fVar2.f40000d;
            if ((eVar2 == null || eVar2.f39993b > eVar.f39993b) && crashType != null && crashType != CrashType.ANR && !str.contains(z0.b.f136024i)) {
                fVar2.f40000d = eVar;
            }
            fVar2.f39998b.add(eVar);
        } catch (Throwable unused) {
            fVar.f39998b.add(new e(file, null));
            com.apm.lite.c.a();
            com.apm.lite.c.b("NPTH_CATCH", new RuntimeException("err format crashTime:" + str));
        }
    }

    private boolean l(File file) {
        String[] list = file.list();
        if (list == null) {
            return false;
        }
        for (String str : list) {
            if (!TextUtils.isEmpty(str) && str.endsWith("")) {
                return true;
            }
        }
        return false;
    }

    private void n(f fVar, boolean z10, com.apm.lite.runtime.h hVar) {
        boolean z11;
        if (fVar.f39999c.size() <= 1 && fVar.f39999c.isEmpty()) {
            fVar.f40001e = fVar.f40000d;
            return;
        }
        boolean zC = p.c(this.f39976a);
        fVar.f40001e = fVar.f40000d;
        com.apm.lite.nativecrash.c cVar = new com.apm.lite.nativecrash.c(this.f39976a);
        Iterator<e> it = fVar.f39999c.iterator();
        while (it.hasNext()) {
            e next = it.next();
            File file = next.f39992a;
            try {
                cVar.e(file);
                JSONObject jSONObjectC = c(cVar);
                if (jSONObjectC == null || jSONObjectC.length() == 0) {
                    it = it;
                    z11 = zC;
                } else {
                    if (jSONObjectC.length() != 0) {
                        try {
                            if (z10) {
                                it = it;
                                z11 = zC;
                                if (hVar == null || hVar.c("default")) {
                                }
                            } else {
                                long jOptLong = jSONObjectC.optLong("crash_time");
                                try {
                                    e eVar = fVar.f40001e;
                                    if (eVar == null) {
                                        fVar.f40001e = next;
                                        fVar.f40002f = true;
                                        if (hVar == null || hVar.c("default")) {
                                            it = it;
                                            z11 = zC;
                                        } else {
                                            cVar.w();
                                        }
                                        com.apm.lite.c.a();
                                        com.apm.lite.c.b("NPTH_CATCH", th);
                                        com.apm.lite.k.i.r(file);
                                    } else {
                                        it = it;
                                        try {
                                            if (fVar.f40002f) {
                                                z11 = zC;
                                            } else {
                                                z11 = zC;
                                                try {
                                                    if (jOptLong < eVar.f39993b) {
                                                        fVar.f40001e = next;
                                                        if (hVar == null || hVar.c("default")) {
                                                            if (!l(file)) {
                                                                g(file, fVar);
                                                            }
                                                            fVar.f40002f = true;
                                                        } else {
                                                            cVar.w();
                                                            zC = z11;
                                                            it = it;
                                                        }
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                }
                                            }
                                            com.apm.lite.d.a.k(jSONObjectC, "filters", CommonNetImpl.AID, String.valueOf(jSONObjectC.optJSONObject("header").opt(CommonNetImpl.AID)));
                                        } catch (Throwable th3) {
                                            th = th3;
                                            z11 = zC;
                                        }
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    z11 = zC;
                                }
                            }
                            com.apm.lite.d.a.k(jSONObjectC, "filters", "start_uuid", fVar.f39997a);
                            com.apm.lite.d.a.k(jSONObjectC, "filters", "crash_thread_name", jSONObjectC.optString("crash_thread_name", "unknown"));
                            if (z11) {
                                com.apm.lite.j.c.b bVar = new com.apm.lite.j.c.b(jSONObjectC, CrashType.NATIVE);
                                JSONArray jSONArrayH = null;
                                File fileA = com.apm.lite.d.b.a(file);
                                try {
                                    if (fileA.exists()) {
                                        jSONArrayH = new JSONArray(com.apm.lite.k.i.y(fileA));
                                    }
                                } catch (Throwable unused) {
                                }
                                if (jSONArrayH == null) {
                                    jSONArrayH = com.apm.lite.runtime.p.b().h(bVar.b() == -1 ? System.currentTimeMillis() : bVar.b());
                                }
                                com.apm.lite.d.b.i(jSONObjectC, com.apm.lite.d.b.e(bVar.c(), bVar.a(), jSONArrayH), new d(file, fVar));
                                if (!cVar.w()) {
                                    cVar.s();
                                }
                                com.apm.lite.runtime.g.b(o.h(com.apm.lite.e.m(), fVar.f39997a), file.getName());
                            }
                            com.apm.lite.j.c.b(CrashType.NATIVE, jSONObjectC);
                        } catch (Throwable th5) {
                            th = th5;
                            com.apm.lite.c.a();
                            com.apm.lite.c.b("NPTH_CATCH", th);
                            com.apm.lite.k.i.r(file);
                        }
                    } else {
                        it = it;
                        z11 = zC;
                    }
                    zC = z11;
                    it = it;
                }
                cVar.w();
            } catch (Throwable th6) {
                th = th6;
            }
            zC = z11;
            it = it;
        }
    }

    private void p(HashMap<String, f> map, f fVar) {
        File[] fileArrListFiles = o.b(this.f39976a).listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        Arrays.sort(fileArrListFiles, Collections.reverseOrder());
        for (File file : fileArrListFiles) {
            try {
                if (o6.a.a().d(file.getAbsolutePath())) {
                    com.apm.lite.k.i.r(file);
                } else if (!com.apm.lite.k.i.G(file) && !com.apm.lite.e.a.c().p(file.getName())) {
                    if (file.isFile()) {
                        com.apm.lite.k.i.r(file);
                    } else {
                        j(map, fVar, file, file.getName());
                    }
                }
            } catch (Throwable th2) {
                com.apm.lite.c.a();
                com.apm.lite.c.b("NPTH_CATCH", th2);
            }
        }
    }

    private void r(HashMap<String, f> map, f fVar) {
        com.apm.lite.k.i.r(o.g(this.f39976a));
    }

    private void t() throws Throwable {
        if (this.f39978c != null) {
            return;
        }
        this.f39978c = new f("old_uuid");
        HashMap<String, f> map = new HashMap<>();
        this.f39979d = map;
        h(map);
        p(this.f39979d, this.f39978c);
        r(this.f39979d, this.f39978c);
        i(this.f39979d, this.f39978c);
        n(this.f39978c, true, null);
        e(this.f39978c, true, null);
        this.f39978c = null;
        if (this.f39979d.isEmpty()) {
            v();
        } else {
            w();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() throws Throwable {
        if (this.f39980e || this.f39979d == null) {
            return;
        }
        if (!p.c(this.f39976a)) {
            v();
        }
        boolean zX = x();
        com.apm.lite.runtime.h hVar = new com.apm.lite.runtime.h(this.f39976a);
        Iterator<f> it = this.f39979d.values().iterator();
        while (it.hasNext()) {
            n(it.next(), zX, hVar);
        }
        Iterator<f> it2 = this.f39979d.values().iterator();
        while (it2.hasNext()) {
            e(it2.next(), zX, hVar);
        }
        Iterator<f> it3 = this.f39979d.values().iterator();
        while (it3.hasNext()) {
            d(it3.next());
        }
        com.apm.lite.k.i.r(o.H(this.f39976a));
        hVar.a();
        com.apm.lite.runtime.b.b();
        v();
    }

    private void v() {
        this.f39980e = true;
        this.f39979d = null;
        NativeImpl.setUploadEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() throws Throwable {
        if (this.f39980e) {
            return;
        }
        if (!p.c(this.f39976a) || (System.currentTimeMillis() - com.apm.lite.e.p() <= 5000 && !Npth.hasCrash())) {
            m.b().f(this.f39981f, 5000L);
        } else {
            u();
        }
    }

    private boolean x() {
        if (this.f39977b == -1) {
            if (com.apm.lite.runtime.a.h() && com.apm.lite.runtime.a.o()) {
                this.f39977b = 1;
            } else {
                this.f39977b = 0;
            }
        }
        return this.f39977b == 1;
    }

    private void y() {
        File[] fileArrListFiles = o.B(this.f39976a).listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (int i10 = 0; i10 < fileArrListFiles.length && i10 < 5; i10++) {
            File file = fileArrListFiles[i10];
            if (file.getName().endsWith(".atmp")) {
                n6.a.a().c(file.getAbsolutePath());
            } else {
                try {
                    com.apm.lite.d.d dVarD = com.apm.lite.k.i.D(file.getAbsolutePath());
                    if (dVarD != null) {
                        if (dVarD.f() != null) {
                            dVarD.f().put("upload_scene", "launch_scan");
                        }
                        if (com.apm.lite.j.e.j(com.apm.lite.j.e.u(), dVarD.l(), dVarD.j(), dVarD.n(), dVarD.o())) {
                            com.apm.lite.k.i.r(file);
                            com.apm.lite.k.i.s(dVarD.h());
                        }
                    } else {
                        com.apm.lite.k.i.r(file);
                    }
                } catch (Throwable th2) {
                    com.apm.lite.c.a();
                    com.apm.lite.c.b("NPTH_CATCH", th2);
                }
            }
        }
    }

    public void k(boolean z10) throws Throwable {
        if (!Npth.isStopUpload() && z10) {
            t();
            y();
        }
    }

    public void m() {
        try {
            if (!this.f39980e && com.apm.lite.k.a.k(com.apm.lite.e.m())) {
                m.b().e(this.f39982g);
            }
        } catch (Throwable unused) {
        }
    }

    public boolean s() {
        return this.f39980e;
    }
}
