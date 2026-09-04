package com.efs.sdk.base.core.a;

import android.os.Message;
import android.text.TextUtils;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.f.f;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.http.AbsHttpListener;
import com.efs.sdk.base.http.HttpResponse;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends AbsHttpListener {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final d f42426a = new d(0);
    }

    private d() {
    }

    /* synthetic */ d(byte b10) {
        this();
    }

    public static d a() {
        return a.f42426a;
    }

    private static void a(@p0 HttpResponse httpResponse) {
        String str;
        if (ControllerCenter.getGlobalEnvStruct().isDebug()) {
            if (httpResponse == null) {
                str = "upload result : false";
            } else {
                str = "upload result : " + httpResponse.succ + ", resp is " + httpResponse.toString();
            }
            Log.i("efs.px.api", str);
        }
    }

    private static void b(HttpResponse httpResponse) {
        f.a.f42551a.a(String.valueOf(httpResponse.getHttpCode()), httpResponse.getBizCode(), httpResponse.getReqUrl());
    }

    private static void c(HttpResponse httpResponse) {
        int i10;
        if (((Map) httpResponse.extra).containsKey("cver")) {
            String str = (String) ((Map) httpResponse.extra).get("cver");
            if (!TextUtils.isEmpty(str) && (i10 = Integer.parseInt(str)) > com.efs.sdk.base.core.config.a.c.a().f42493d.f42483a) {
                com.efs.sdk.base.core.config.a.c.a().a(i10);
            }
        }
    }

    @Override // com.efs.sdk.base.core.util.concurrent.b
    public final /* synthetic */ void a(@n0 com.efs.sdk.base.core.util.concurrent.c<HttpResponse> cVar, @p0 HttpResponse httpResponse) {
        HttpResponse httpResponse2 = httpResponse;
        if (httpResponse2 != null) {
            com.efs.sdk.base.core.util.a.b bVar = (com.efs.sdk.base.core.util.a.b) cVar;
            ((Map) httpResponse2.extra).putAll(bVar.f42568f);
            bVar.f42568f.clear();
            com.efs.sdk.base.core.a.a.a();
            com.efs.sdk.base.core.a.a.a(httpResponse2);
        }
    }

    @Override // com.efs.sdk.base.http.AbsHttpListener
    public final void onError(@p0 HttpResponse httpResponse) {
        a(httpResponse);
        if (httpResponse == null) {
            return;
        }
        b(httpResponse);
        c(httpResponse);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005b  */
    @Override // com.efs.sdk.base.http.AbsHttpListener
    public final void onSuccess(@n0 HttpResponse httpResponse) {
        int i10;
        if (!((Map) httpResponse.extra).containsKey("flow_limit") || !Boolean.FALSE.toString().equals(((Map) httpResponse.extra).get("flow_limit"))) {
            String str = ((Map) httpResponse.extra).containsKey("type") ? (String) ((Map) httpResponse.extra).get("type") : "";
            if (((Map) httpResponse.extra).containsKey(UiKitSpanObj.TYPE_SIZE)) {
                String str2 = (String) ((Map) httpResponse.extra).get(UiKitSpanObj.TYPE_SIZE);
                if (TextUtils.isEmpty(str2)) {
                    i10 = 0;
                } else {
                    i10 = Integer.parseInt(str2);
                }
            } else {
                i10 = 0;
            }
            com.efs.sdk.base.core.c.b bVarA = com.efs.sdk.base.core.c.b.a();
            Message messageObtain = Message.obtain();
            messageObtain.what = 0;
            messageObtain.obj = str;
            messageObtain.arg1 = i10;
            bVarA.sendMessage(messageObtain);
        }
        b(httpResponse);
        f.a.f42551a.f42549c.f42542b.incrementAndGet();
        c(httpResponse);
        a(httpResponse);
    }
}
