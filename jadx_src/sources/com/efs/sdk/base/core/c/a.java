package com.efs.sdk.base.core.c;

import androidx.annotation.n0;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.http.HttpResponse;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements c {
    @Override // com.efs.sdk.base.core.c.c
    @n0
    public final HttpResponse a(com.efs.sdk.base.core.d.b bVar, boolean z10) {
        HttpResponse httpResponseA;
        com.efs.sdk.base.core.a.c cVarA = com.efs.sdk.base.core.a.c.a();
        com.efs.sdk.base.core.d.a aVar = bVar.f42520a;
        cVarA.f42416d = aVar.f42516d;
        cVarA.f42417e = aVar.f42517e;
        cVarA.f42419g = aVar.f42514b;
        cVarA.f42420h = aVar.f42513a;
        cVarA.f42425m = bVar.a();
        String strA = com.efs.sdk.base.core.config.a.c.a().a(false);
        int i10 = bVar.f42520a.f42515c;
        if (i10 == 0) {
            com.efs.sdk.base.core.a.a aVarA = com.efs.sdk.base.core.a.a.a();
            byte[] bArr = bVar.f42522c;
            boolean z11 = bVar.f42521b.f42525b;
            String strB = cVarA.b();
            String strA2 = com.efs.sdk.base.core.a.a.a(strA, cVarA);
            if (aVarA.f42410a) {
                Log.i("efs.px.api", "upload buffer file, url is ".concat(String.valueOf(strA2)));
            }
            HashMap map = new HashMap(1);
            map.put("wpk-header", strB);
            com.efs.sdk.base.core.util.a.d dVarA = new com.efs.sdk.base.core.util.a.d(strA2).a(map);
            com.efs.sdk.base.core.util.a.b bVar2 = dVarA.f42571a;
            bVar2.f42565c = bArr;
            bVar2.f42569g = true;
            com.efs.sdk.base.core.util.a.d dVarA2 = dVarA.a("type", cVarA.f42420h);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cVarA.f42425m);
            httpResponseA = dVarA2.a(UiKitSpanObj.TYPE_SIZE, sb2.toString()).a("flow_limit", Boolean.toString(z11)).a(com.efs.sdk.base.core.a.d.a()).a().b();
        } else {
            httpResponseA = 1 == i10 ? com.efs.sdk.base.core.a.a.a().a(strA, cVarA, bVar.f42523d, bVar.f42521b.f42525b) : new HttpResponse();
        }
        if (httpResponseA.succ && z10) {
            com.efs.sdk.base.core.util.b.b(bVar.f42523d);
        }
        return httpResponseA;
    }
}
