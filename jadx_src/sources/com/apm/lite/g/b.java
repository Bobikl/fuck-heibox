package com.apm.lite.g;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import com.apm.lite.CrashType;
import com.apm.lite.Npth;
import com.apm.lite.b.d;
import com.apm.lite.b.f;
import com.apm.lite.e;
import com.apm.lite.e.c;
import com.apm.lite.k.i;
import com.apm.lite.k.o;
import com.apm.lite.k.r;
import com.apm.lite.k.v;
import com.apm.lite.nativecrash.NativeImpl;
import com.apm.lite.runtime.g;
import com.apm.lite.runtime.j;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.io.File;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f39954a;

    public class a implements com.apm.lite.runtime.a.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f39955a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Throwable f39956b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f39957c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f39958d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f39959e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f39960f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Thread f39961g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f39962h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ File f39963i;

        a(Throwable th2, boolean z10, long j10, String str, boolean z11, Thread thread, String str2, File file) {
            this.f39956b = th2;
            this.f39957c = z10;
            this.f39958d = j10;
            this.f39959e = str;
            this.f39960f = z11;
            this.f39961g = thread;
            this.f39962h = str2;
            this.f39963i = file;
        }

        @Override // com.apm.lite.runtime.a.c.a
        public com.apm.lite.d.a a(int i10, com.apm.lite.d.a aVar, boolean z10) {
            if (r.c(r.d(i10))) {
                return aVar;
            }
            try {
                i.m(new File(this.f39963i, this.f39963i.getName() + "." + i10), aVar.G(), false);
            } catch (IOException e10) {
                e10.printStackTrace();
            }
            return aVar;
        }

        @Override // com.apm.lite.runtime.a.c.a
        public void a(Throwable th2) {
        }

        @Override // com.apm.lite.runtime.a.c.a
        public com.apm.lite.d.a b(int i10, com.apm.lite.d.a aVar) {
            String strValueOf;
            String str;
            this.f39955a = SystemClock.uptimeMillis();
            if (i10 != 0) {
                if (i10 == 1) {
                    aVar.j("timestamp", Long.valueOf(this.f39958d));
                    aVar.j("main_process", Boolean.valueOf(com.apm.lite.k.a.k(b.this.f39954a)));
                    aVar.j(CrashHianalyticsData.CRASH_TYPE, CrashType.JAVA);
                    Thread thread = this.f39961g;
                    aVar.j("crash_thread_name", thread != null ? thread.getName() : "");
                    aVar.j("tid", Integer.valueOf(Process.myTid()));
                    aVar.e("crash_after_crash", Npth.hasCrashWhenJavaCrash() ? "true" : "false");
                    aVar.e("crash_after_native", NativeImpl.duringNativeCrash() ? "true" : "false");
                    com.apm.lite.e.a.c().j(this.f39961g, this.f39956b, true, aVar);
                } else if (i10 == 2) {
                    if (this.f39957c) {
                        com.apm.lite.k.a.d(b.this.f39954a, aVar.G());
                    }
                    aVar.j("launch_did", com.apm.lite.g.a.a(b.this.f39954a));
                    JSONArray jSONArrayB = d.b();
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    JSONObject jSONObjectC = d.c(jUptimeMillis);
                    JSONArray jSONArrayA = f.a(100, jUptimeMillis);
                    aVar.j("history_message", jSONArrayB);
                    aVar.j("current_message", jSONObjectC);
                    aVar.j("pending_messages", jSONArrayA);
                    strValueOf = String.valueOf(com.apm.lite.runtime.a.l());
                    str = "disable_looper_monitor";
                    aVar.e(str, strValueOf);
                } else if (i10 == 3) {
                    JSONObject jSONObjectR = v.r(Thread.currentThread().getName());
                    if (jSONObjectR != null) {
                        aVar.j("all_thread_stacks", jSONObjectR);
                    }
                    aVar.j("logcat", j.b(e.l()));
                } else if (i10 != 4) {
                    if (i10 == 5) {
                        aVar.j("crash_uuid", this.f39962h);
                        g.a(o.F(e.m()), CrashType.LAUNCH, "");
                    }
                } else if (!this.f39957c) {
                    com.apm.lite.k.a.d(b.this.f39954a, aVar.G());
                }
            } else {
                aVar.j("stack", v.b(this.f39956b));
                aVar.j("event_type", "start_crash");
                aVar.j("isOOM", Boolean.valueOf(this.f39957c));
                aVar.j("crash_time", Long.valueOf(this.f39958d));
                aVar.j("launch_mode", Integer.valueOf(com.apm.lite.runtime.a.b.n()));
                aVar.j("launch_time", Long.valueOf(com.apm.lite.runtime.a.b.s()));
                String str2 = this.f39959e;
                if (str2 != null) {
                    aVar.j("crash_md5", str2);
                    aVar.e("crash_md5", this.f39959e);
                    boolean z10 = this.f39960f;
                    if (z10) {
                        strValueOf = String.valueOf(z10);
                        str = "has_ignore";
                        aVar.e(str, strValueOf);
                    }
                }
            }
            return aVar;
        }
    }

    public b(Context context) {
        this.f39954a = context;
    }

    private synchronized void c(long j10, Thread thread, Throwable th2, String str, File file, String str2, boolean z10) {
        File file2 = new File(o.b(this.f39954a), str);
        com.apm.lite.e.a.c().h(file2.getName());
        file2.mkdirs();
        i.F(file2);
        com.apm.lite.d.a aVarB = com.apm.lite.runtime.a.e.d().b(CrashType.LAUNCH, null, new a(th2, v.w(th2), j10, str2, z10, thread, str, file2), true);
        long jCurrentTimeMillis = System.currentTimeMillis() - j10;
        try {
            aVarB.e(CrashHianalyticsData.CRASH_TYPE, "normal");
            aVarB.q("crash_cost", String.valueOf(jCurrentTimeMillis));
            aVarB.e("crash_cost", String.valueOf(jCurrentTimeMillis / 1000));
        } catch (Throwable th3) {
            com.apm.lite.c.a();
            com.apm.lite.c.b("NPTH_CATCH", th3);
        }
        if (r.c(4)) {
            return;
        }
        if (Npth.isStopUpload() || r.c(2048)) {
        }
    }

    @Override // com.apm.lite.e.c
    public void a(long j10, Thread thread, Throwable th2, String str, File file, String str2, boolean z10) {
        c(j10, thread, th2, str, file, str2, z10);
    }

    @Override // com.apm.lite.e.c
    public boolean a(Throwable th2) {
        return true;
    }
}
