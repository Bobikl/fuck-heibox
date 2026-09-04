package com.efs.sdk.base.core.config.a;

import android.text.TextUtils;
import androidx.annotation.n0;
import com.efs.sdk.base.IConfigRefreshAction;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.core.util.NetworkUtil;
import com.efs.sdk.base.http.HttpResponse;
import com.tencent.connect.common.Constants;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements IConfigRefreshAction {

    /* JADX INFO: renamed from: com.efs.sdk.base.core.config.a.a$a, reason: collision with other inner class name */
    public static final class C0354a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final a f42482a = new a();
    }

    public static a a() {
        return C0354a.f42482a;
    }

    @Override // com.efs.sdk.base.IConfigRefreshAction
    @n0
    public final String refresh() {
        String str = "";
        if (!NetworkUtil.isConnected(ControllerCenter.getGlobalEnvStruct().mAppContext)) {
            Log.i("efs.config", "Config refresh fail, network is disconnected.");
            return "";
        }
        String strA = c.a().a(true);
        com.efs.sdk.base.core.a.c cVarA = com.efs.sdk.base.core.a.c.a();
        for (int i10 = 0; i10 < 3; i10++) {
            com.efs.sdk.base.core.a.a aVarA = com.efs.sdk.base.core.a.a.a();
            String strB = cVarA.b();
            String str2 = strA + "/apm_cc";
            if (aVarA.f42410a) {
                Log.i("efs.px.api", "get config from server, url is ".concat(String.valueOf(str2)));
            }
            HashMap map = new HashMap(1);
            map.put("wpk-header", strB);
            com.efs.sdk.base.core.util.a.c cVarA2 = new com.efs.sdk.base.core.util.a.d(str2).a(map).a(com.efs.sdk.base.core.a.b.a()).a();
            cVarA2.f42570a.f42567e = "get";
            HttpResponse httpResponseA = cVarA2.a();
            if (httpResponseA.succ) {
                str = httpResponseA.data;
                break;
            }
            if (TextUtils.isEmpty(httpResponseA.getBizCode()) || !Constants.DEFAULT_UIN.equals(httpResponseA.getBizCode())) {
                return "";
            }
        }
        Log.i("efs.config", "config request succ, config is:\n ".concat(String.valueOf(str)));
        return str;
    }
}
