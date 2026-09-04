package com.efs.sdk.net.a.a;

import android.text.TextUtils;
import com.efs.sdk.base.core.util.Log;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static AtomicInteger f42708a = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static g f42709c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f42710b = new b();

    private g() {
    }

    public static g c() {
        if (f42709c == null) {
            f42709c = new g();
        }
        return f42709c;
    }

    @Override // com.efs.sdk.net.a.a.f
    @dl.e
    public final InputStream a(String str, @dl.e String str2, @dl.e String str3, @dl.e InputStream inputStream) {
        Log.d("NetTrace-Interceptor", "interpret response stream");
        return b.a(str, str2, str3, inputStream);
    }

    @Override // com.efs.sdk.net.a.a.f
    public final void a() {
        Log.d("NetTrace-Interceptor", "data sent");
    }

    @Override // com.efs.sdk.net.a.a.f
    public final void a(f.a aVar) {
        Log.d("NetTrace-Interceptor", "request will be sent");
        b bVar = this.f42710b;
        try {
            String strA = aVar.a();
            bVar.f42699a.put(aVar.a(), Long.valueOf(System.currentTimeMillis()));
            Log.i("NetTrace-Interceptor", "save request");
            com.efs.sdk.net.a.b bVarA = com.efs.sdk.net.a.a.a().a(strA);
            String strB = aVar.b();
            if (!TextUtils.isEmpty(strB)) {
                bVarA.f42718d = strB;
            }
            bVarA.f42719e = aVar.c();
            bVarA.f42720f = b.a(aVar);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    @Override // com.efs.sdk.net.a.a.f
    public final void a(f.c cVar) {
        Log.d("NetTrace-Interceptor", "response headers received");
        b bVar = this.f42710b;
        Log.i("NetTrace-Interceptor", "save response");
        String strA = cVar.a();
        if (bVar.f42699a != null) {
            com.efs.sdk.net.a.a.a().a(strA).f42721g = cVar.b();
        }
    }

    @Override // com.efs.sdk.net.a.a.f
    public final String b() {
        Log.d("NetTrace-Interceptor", "next request id");
        return String.valueOf(f42708a.getAndIncrement());
    }
}
