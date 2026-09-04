package com.apm.lite.e;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import com.apm.lite.CrashType;
import com.apm.lite.Npth;
import com.apm.lite.b.f;
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
public class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f39934a;

    public class a implements com.apm.lite.runtime.a.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f39935a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Throwable f39936b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f39937c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f39938d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f39939e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f39940f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Thread f39941g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f39942h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ File f39943i;

        a(Throwable th2, boolean z10, long j10, String str, boolean z11, Thread thread, String str2, File file) {
            this.f39936b = th2;
            this.f39937c = z10;
            this.f39938d = j10;
            this.f39939e = str;
            this.f39940f = z11;
            this.f39941g = thread;
            this.f39942h = str2;
            this.f39943i = file;
        }

        @Override // com.apm.lite.runtime.a.c.a
        public com.apm.lite.d.a a(int i10, com.apm.lite.d.a aVar, boolean z10) {
            if (r.c(r.d(i10))) {
                return aVar;
            }
            try {
                i.m(new File(this.f39943i, this.f39943i.getName() + "." + i10), aVar.G(), false);
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
            this.f39935a = SystemClock.uptimeMillis();
            if (i10 != 0) {
                if (i10 == 1) {
                    Thread thread = this.f39941g;
                    aVar.j("crash_thread_name", thread != null ? thread.getName() : "");
                    aVar.j("tid", Integer.valueOf(Process.myTid()));
                    aVar.e("crash_after_crash", Npth.hasCrashWhenJavaCrash() ? "true" : "false");
                    aVar.e("crash_after_native", NativeImpl.duringNativeCrash() ? "true" : "false");
                    com.apm.lite.e.a.c().j(this.f39941g, this.f39936b, false, aVar);
                } else if (i10 == 2) {
                    if (this.f39937c) {
                        com.apm.lite.k.a.d(d.this.f39934a, aVar.G());
                    }
                    JSONArray jSONArrayB = com.apm.lite.b.d.b();
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    JSONObject jSONObjectC = com.apm.lite.b.d.c(jUptimeMillis);
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
                    aVar.j("logcat", j.b(com.apm.lite.e.l()));
                } else if (i10 != 4) {
                    if (i10 == 5) {
                        aVar.j("crash_uuid", this.f39942h);
                        g.a(o.F(com.apm.lite.e.m()), CrashType.JAVA, "");
                    }
                } else if (!this.f39937c) {
                    com.apm.lite.k.a.d(d.this.f39934a, aVar.G());
                }
            } else {
                aVar.j("data", v.b(this.f39936b));
                aVar.j("isOOM", Boolean.valueOf(this.f39937c));
                aVar.j("isJava", 1);
                aVar.j("crash_time", Long.valueOf(this.f39938d));
                aVar.j("launch_mode", Integer.valueOf(com.apm.lite.runtime.a.b.n()));
                aVar.j("launch_time", Long.valueOf(com.apm.lite.runtime.a.b.s()));
                String str2 = this.f39939e;
                if (str2 != null) {
                    aVar.j("crash_md5", str2);
                    aVar.e("crash_md5", this.f39939e);
                    boolean z10 = this.f39940f;
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

    public d(Context context) {
        this.f39934a = context;
    }

    public static int b() {
        return 6;
    }

    @Override // com.apm.lite.e.c
    public void a(long j10, Thread thread, Throwable th2, String str, File file, String str2, boolean z10) {
        File file2 = new File(o.b(this.f39934a), str);
        com.apm.lite.e.a.c().h(file2.getName());
        file2.mkdirs();
        i.F(file2);
        com.apm.lite.d.a aVarB = com.apm.lite.runtime.a.e.d().b(CrashType.JAVA, null, new a(th2, v.w(th2), j10, str2, z10, thread, str, file2), true);
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
        r.c(2048);
    }

    @Override // com.apm.lite.e.c
    public boolean a(Throwable th2) {
        return true;
    }
}
