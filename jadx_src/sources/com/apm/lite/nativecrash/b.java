package com.apm.lite.nativecrash;

import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.apm.lite.CrashType;
import com.apm.lite.ICrashCallback;
import com.apm.lite.Npth;
import com.apm.lite.b.f;
import com.apm.lite.k.i;
import com.apm.lite.k.o;
import com.apm.lite.k.q;
import com.apm.lite.k.v;
import com.apm.lite.runtime.g;
import com.apm.lite.runtime.l;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    public static final class a implements com.apm.lite.runtime.a.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ File f40084a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f40085b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ File f40086c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f40087d;

        a(File file, String str, File file2, long j10) {
            this.f40084a = file;
            this.f40085b = str;
            this.f40086c = file2;
            this.f40087d = j10;
        }

        @Override // com.apm.lite.runtime.a.c.a
        public com.apm.lite.d.a a(int i10, com.apm.lite.d.a aVar, boolean z10) {
            try {
                JSONObject jSONObjectG = aVar.G();
                if (jSONObjectG.length() > 0) {
                    i.m(new File(this.f40086c.getAbsolutePath() + lg.a.f131414g + i10), jSONObjectG, false);
                }
            } catch (IOException e10) {
                com.apm.lite.c.a();
                com.apm.lite.c.b("NPTH_CATCH", e10);
            }
            if (i10 == 0) {
                n6.a.a().d();
                n6.a.a().b(CrashType.NATIVE, this.f40087d, com.apm.lite.e.l());
            }
            return aVar;
        }

        @Override // com.apm.lite.runtime.a.c.a
        public void a(Throwable th2) {
        }

        @Override // com.apm.lite.runtime.a.c.a
        public com.apm.lite.d.a b(int i10, com.apm.lite.d.a aVar) {
            String str;
            String str2 = "true";
            if (i10 != 1) {
                if (i10 == 2) {
                    JSONArray jSONArrayB = com.apm.lite.b.d.b();
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    JSONObject jSONObjectC = com.apm.lite.b.d.c(jUptimeMillis);
                    JSONArray jSONArrayA = f.a(100, jUptimeMillis);
                    aVar.j("history_message", jSONArrayB);
                    aVar.j("current_message", jSONObjectC);
                    aVar.j("pending_messages", jSONArrayA);
                    aVar.e("disable_looper_monitor", String.valueOf(com.apm.lite.runtime.a.l()));
                } else if (i10 != 3) {
                    if (i10 == 4) {
                        com.apm.lite.k.a.d(com.apm.lite.e.m(), aVar.G());
                        g.a(o.F(com.apm.lite.e.m()), CrashType.NATIVE, "");
                    }
                } else if (com.apm.lite.runtime.a.m()) {
                    aVar.j("all_thread_stacks", v.r(this.f40085b));
                    str = "has_all_thread_stack";
                }
                return aVar;
            }
            com.apm.lite.d.b.h(this.f40084a, CrashType.NATIVE);
            String str3 = this.f40085b;
            if (str3 != null && str3.length() != 0) {
                aVar.j("java_data", b.e(this.f40085b));
            }
            str2 = Npth.hasCrashWhenNativeCrash() ? "true" : "false";
            str = "crash_after_crash";
            aVar.e(str, str2);
            return aVar;
        }
    }

    public static int a() {
        return 6;
    }

    public static void b(String str) {
        String strE;
        long jCurrentTimeMillis = System.currentTimeMillis();
        q.a("[onNativeCrash] enter");
        try {
            try {
                com.apm.lite.j.b.b().m();
                File file = new File(o.a(), com.apm.lite.e.l());
                File fileS = o.s(file);
                com.apm.lite.d.a aVarB = com.apm.lite.runtime.a.e.d().b(CrashType.NATIVE, null, new a(file, str, fileS, jCurrentTimeMillis), true);
                JSONObject jSONObjectG = aVarB.G();
                if (jSONObjectG != null && jSONObjectG.length() != 0) {
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    long j10 = jCurrentTimeMillis2 - jCurrentTimeMillis;
                    try {
                        jSONObjectG.put("java_end", jCurrentTimeMillis2);
                        aVarB.q("crash_cost", String.valueOf(j10));
                        aVarB.e("crash_cost", String.valueOf(j10 / 1000));
                    } catch (Throwable unused) {
                    }
                    File file2 = new File(fileS.getAbsolutePath() + ".tmp");
                    i.m(file2, jSONObjectG, false);
                    file2.renameTo(fileS);
                }
                if (l.a().h().isEmpty()) {
                    return;
                }
                File file3 = new File(o.a(), com.apm.lite.e.l());
                e eVar = new e(file3);
                eVar.d(file3);
                strE = eVar.e();
                c(strE, null);
            } catch (Throwable th2) {
                try {
                    com.apm.lite.c.a();
                    com.apm.lite.c.b("NPTH_CATCH", th2);
                    if (l.a().h().isEmpty()) {
                        return;
                    }
                    File file4 = new File(o.a(), com.apm.lite.e.l());
                    e eVar2 = new e(file4);
                    eVar2.d(file4);
                    strE = eVar2.e();
                } catch (Throwable th3) {
                    try {
                        if (!l.a().h().isEmpty()) {
                            File file5 = new File(o.a(), com.apm.lite.e.l());
                            e eVar3 = new e(file5);
                            eVar3.d(file5);
                            c(eVar3.e(), null);
                        }
                    } catch (Throwable unused2) {
                        c("", null);
                    }
                    throw th3;
                }
            }
        } catch (Throwable unused3) {
            c("", null);
        }
    }

    private static void c(String str, Thread thread) {
        Iterator<ICrashCallback> it = l.a().h().iterator();
        while (it.hasNext()) {
            try {
                it.next().onCrash(CrashType.NATIVE, str, thread);
            } catch (Throwable th2) {
                com.apm.lite.c.a();
                com.apm.lite.c.b("NPTH_CATCH", th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String e(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if ("main".equalsIgnoreCase(str)) {
            return v.e(Looper.getMainLooper().getThread().getStackTrace());
        }
        ThreadGroup threadGroup = Looper.getMainLooper().getThread().getThreadGroup();
        int iActiveCount = threadGroup.activeCount();
        Thread[] threadArr = new Thread[iActiveCount + (iActiveCount / 2)];
        int iEnumerate = threadGroup.enumerate(threadArr);
        for (int i10 = 0; i10 < iEnumerate; i10++) {
            String name = threadArr[i10].getName();
            if (!TextUtils.isEmpty(name) && (name.equals(str) || name.startsWith(str) || name.endsWith(str))) {
                return v.e(threadArr[i10].getStackTrace());
            }
        }
        try {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                String name2 = entry.getKey().getName();
                if (name2.equals(str) || name2.startsWith(str) || name2.endsWith(str)) {
                    return v.e(entry.getValue());
                }
            }
        } catch (Throwable th2) {
            com.apm.lite.c.a();
            com.apm.lite.c.b("NPTH_CATCH", th2);
        }
        return "";
    }
}
