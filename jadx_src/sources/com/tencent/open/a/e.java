package com.tencent.open.a;

import android.text.TextUtils;
import com.tencent.open.log.SLog;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.a0;
import okhttp3.b0;
import okhttp3.c0;
import okhttp3.internal.Version;
import okhttp3.k;
import okhttp3.q;
import okhttp3.u;
import okhttp3.v;
import okhttp3.w;
import okhttp3.z;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class e implements com.tencent.open.a.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private z f101020a;

    /* JADX INFO: compiled from: ProGuard */
    public static class a implements u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f101021a;

        public a(String str) {
            this.f101021a = str;
        }

        @Override // okhttp3.u
        public c0 intercept(u.a aVar) throws IOException {
            return aVar.proceed(aVar.request().n().n("User-Agent", this.f101021a).b());
        }
    }

    public e(String str) throws NoClassDefFoundError {
        a(str);
    }

    private void a(String str) {
        String strUserAgent = Version.userAgent();
        if (strUserAgent == null || !strUserAgent.startsWith("okhttp/3")) {
            throw new NoClassDefFoundError();
        }
        a aVar = new a(str);
        z.a aVarN = new z.a().n(Arrays.asList(k.f132594h, k.f132595i));
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        z.a aVarC = aVarN.k(15000L, timeUnit).j0(30000L, timeUnit).R0(30000L, timeUnit).g(null).c(aVar);
        a(aVarC);
        this.f101020a = aVarC.f();
    }

    private void a(z.a aVar) {
    }

    @Override // com.tencent.open.a.a
    public g a(String str, String str2) throws IOException {
        SLog.i("OkHttpServiceImpl", "get.");
        if (!TextUtils.isEmpty(str2)) {
            int iIndexOf = str2.indexOf("?");
            if (iIndexOf == -1) {
                str = str + "?";
            } else if (iIndexOf != str.length() - 1) {
                str = str + "&";
            }
            str = str + str2;
        }
        return new d(this.f101020a.a(new a0.a().B(str).g().b()).execute(), str2.length());
    }

    @Override // com.tencent.open.a.a
    public g a(String str, Map<String, String> map) throws IOException {
        SLog.i("OkHttpServiceImpl", "post data");
        q.a aVar = new q.a();
        if (map != null && map.size() > 0) {
            for (String str2 : map.keySet()) {
                String str3 = map.get(str2);
                if (str3 != null) {
                    aVar.a(str2, str3);
                }
            }
        }
        q qVarC = aVar.c();
        return new d(this.f101020a.a(new a0.a().B(str).r(qVarC).b()).execute(), (int) qVarC.contentLength());
    }

    @Override // com.tencent.open.a.a
    public g a(String str, Map<String, String> map, Map<String, byte[]> map2) throws IOException {
        if (map2 == null || map2.size() == 0) {
            return a(str, map);
        }
        SLog.i("OkHttpServiceImpl", "post data, has byte data");
        w.a aVar = new w.a();
        if (map != null && map.size() > 0) {
            for (String str2 : map.keySet()) {
                String str3 = map.get(str2);
                if (str3 != null) {
                    aVar.a(str2, str3);
                }
            }
        }
        for (String str4 : map2.keySet()) {
            byte[] bArr = map2.get(str4);
            if (bArr != null && bArr.length > 0) {
                aVar.b(str4, str4, b0.create(v.h("content/unknown"), bArr));
                SLog.w("OkHttpServiceImpl", "post byte data.");
            }
        }
        w wVarF = aVar.f();
        return new d(this.f101020a.a(new a0.a().B(str).r(wVarF).b()).execute(), (int) wVarF.contentLength());
    }

    @Override // com.tencent.open.a.a
    public void a(long j10, long j11) {
        if (j10 <= 0 || j11 <= 0) {
            return;
        }
        if (this.f101020a.getConnectTimeoutMillis() == j10 && this.f101020a.getReadTimeoutMillis() == j11) {
            return;
        }
        SLog.i("OkHttpServiceImpl", "setTimeout changed.");
        z.a aVarE0 = this.f101020a.e0();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f101020a = aVarE0.k(j10, timeUnit).j0(j11, timeUnit).R0(j11, timeUnit).f();
    }
}
