package com.efs.sdk.base.core.a;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.http.HttpResponse;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile long f42409b = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f42410a;

    /* JADX INFO: renamed from: com.efs.sdk.base.core.a.a$a, reason: collision with other inner class name */
    public static final class C0352a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final a f42411a = new a(0);
    }

    private a() {
        this.f42410a = true;
    }

    /* synthetic */ a(byte b10) {
        this();
    }

    public static a a() {
        return C0352a.f42411a;
    }

    public static String a(@n0 String str, @n0 c cVar) {
        String str2;
        byte b10 = cVar.f42419g;
        if (b10 == 1) {
            str2 = "/apm_logs";
        } else if (b10 != 2) {
            str2 = b10 != 3 ? "/api/v1/raw/upload" : "/api/v1/mix/upload";
        } else {
            str2 = "/perf_upload";
        }
        return str + str2;
    }

    static void a(@p0 HttpResponse httpResponse) {
        if (httpResponse == null || !httpResponse.succ || TextUtils.isEmpty(httpResponse.data)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(httpResponse.data);
            String strOptString = jSONObject.optString("code", "-1");
            httpResponse.setBizCode(strOptString);
            if (!"0".equals(strOptString)) {
                httpResponse.succ = false;
            }
            if (jSONObject.has("cver")) {
                ((Map) httpResponse.extra).put("cver", jSONObject.getString("cver"));
            }
            long j10 = jSONObject.getLong("stm") * 1000;
            if (Math.abs(j10 - b()) > 1500000) {
                f42409b = j10 - SystemClock.elapsedRealtime();
            }
        } catch (Throwable th2) {
            Log.e("efs.px.api", "checkPxReturn error", th2);
        }
    }

    public static long b() {
        return f42409b == -1 ? System.currentTimeMillis() : SystemClock.elapsedRealtime() + f42409b;
    }

    @n0
    public final HttpResponse a(String str, c cVar, File file, boolean z10) {
        String strB = cVar.b();
        String strA = a(str, cVar);
        if (this.f42410a) {
            Log.i("efs.px.api", "Upload file, url is ".concat(String.valueOf(strA)));
        }
        HashMap map = new HashMap(1);
        map.put("wpk-header", strB);
        com.efs.sdk.base.core.util.a.d dVarA = new com.efs.sdk.base.core.util.a.d(strA).a(map);
        dVarA.f42571a.f42566d = file;
        com.efs.sdk.base.core.util.a.d dVarA2 = dVarA.a("type", cVar.f42420h);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cVar.f42425m);
        return dVarA2.a(UiKitSpanObj.TYPE_SIZE, sb2.toString()).a("flow_limit", Boolean.toString(z10)).a(d.a()).a().b();
    }
}
