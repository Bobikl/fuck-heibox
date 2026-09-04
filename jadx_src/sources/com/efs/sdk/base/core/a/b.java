package com.efs.sdk.base.core.a;

import android.text.TextUtils;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.f.f;
import com.efs.sdk.base.http.AbsHttpListener;
import com.efs.sdk.base.http.HttpResponse;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends AbsHttpListener {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final b f42412a = new b(0);
    }

    private b() {
    }

    /* synthetic */ b(byte b10) {
        this();
    }

    public static b a() {
        return a.f42412a;
    }

    private static void a(@n0 HttpResponse httpResponse) {
        f.a.f42551a.a(String.valueOf(httpResponse.getHttpCode()), httpResponse.getBizCode(), httpResponse.getReqUrl());
    }

    @Override // com.efs.sdk.base.core.util.concurrent.b
    public final /* bridge */ /* synthetic */ void a(@n0 com.efs.sdk.base.core.util.concurrent.c<HttpResponse> cVar, @p0 HttpResponse httpResponse) {
        HttpResponse httpResponse2 = httpResponse;
        if (httpResponse2 != null) {
            com.efs.sdk.base.core.a.a.a();
            com.efs.sdk.base.core.a.a.a(httpResponse2);
        }
    }

    @Override // com.efs.sdk.base.http.AbsHttpListener
    public final void onError(@p0 HttpResponse httpResponse) {
        if (httpResponse == null) {
            return;
        }
        a(httpResponse);
    }

    @Override // com.efs.sdk.base.http.AbsHttpListener
    public final void onSuccess(@n0 HttpResponse httpResponse) {
        a(httpResponse);
        if (((Map) httpResponse.extra).containsKey("cver")) {
            String str = (String) ((Map) httpResponse.extra).get("cver");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int i10 = Integer.parseInt(str);
            f fVar = f.a.f42551a;
            if (fVar.f42548b == null || !ControllerCenter.getGlobalEnvStruct().isEnableWaStat()) {
                return;
            }
            com.efs.sdk.base.core.f.b bVar = new com.efs.sdk.base.core.f.b("efs_core", "config_coverage", fVar.f42547a.f42541c);
            bVar.put("cver", Integer.valueOf(i10));
            fVar.f42548b.send(bVar);
        }
    }
}
