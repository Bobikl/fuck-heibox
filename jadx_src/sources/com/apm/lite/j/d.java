package com.apm.lite.j;

import android.annotation.SuppressLint;
import android.content.Context;
import com.apm.lite.CrashType;
import com.apm.lite.Npth;
import com.apm.lite.k.o;
import com.apm.lite.k.q;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile d f40009b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Context f40010a;

    private d(Context context) {
        this.f40010a = context;
    }

    public static d a() {
        if (f40009b == null) {
            f40009b = new d(com.apm.lite.e.m());
        }
        return f40009b;
    }

    public void b(JSONObject jSONObject, long j10, boolean z10) {
        File[] fileArr;
        if (jSONObject == null || jSONObject.length() <= 0) {
            return;
        }
        try {
            String strT = e.t();
            int i10 = 0;
            File file = new File(o.b(this.f40010a), com.apm.lite.e.b(j10, CrashType.ANR, false, false));
            com.apm.lite.k.i.f(file, file.getName(), strT, jSONObject, e.q());
            if (z10 && !Npth.isStopUpload()) {
                jSONObject.put("upload_scene", "direct");
                jSONObject.put("crash_uuid", file.getName());
                if (com.apm.lite.runtime.a.q()) {
                    HashMap<String, com.apm.lite.runtime.o.b> mapB = com.apm.lite.runtime.o.b(j10, "anr_trace");
                    fileArr = new File[mapB.size() + 2];
                    for (Map.Entry<String, com.apm.lite.runtime.o.b> entry : mapB.entrySet()) {
                        if (!entry.getKey().equals(com.apm.lite.k.a.m(this.f40010a))) {
                            fileArr[i10] = o.c(this.f40010a, entry.getValue().f40205b);
                            i10++;
                        }
                    }
                } else {
                    fileArr = new File[2];
                }
                fileArr[fileArr.length - 1] = o.c(this.f40010a, com.apm.lite.e.l());
                fileArr[fileArr.length - 2] = com.apm.lite.runtime.o.a(j10);
                if (e.e(strT, jSONObject.toString(), fileArr).a()) {
                    com.apm.lite.k.i.r(file);
                    if (!Npth.hasCrash()) {
                        com.apm.lite.k.i.r(o.r(com.apm.lite.e.m()));
                    }
                    com.apm.lite.runtime.g.a(o.F(com.apm.lite.e.m()), CrashType.ANR, file.getName());
                }
            }
        } catch (Throwable unused) {
        }
    }

    public boolean c(JSONObject jSONObject, File file, File file2) {
        try {
            return e.e(e.w(), jSONObject.toString(), file, file2, com.apm.lite.runtime.o.a(System.currentTimeMillis())).a();
        } catch (Throwable th2) {
            q.g(th2);
            return false;
        }
    }
}
