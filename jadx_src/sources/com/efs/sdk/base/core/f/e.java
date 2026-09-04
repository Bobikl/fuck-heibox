package com.efs.sdk.base.core.f;

import android.text.TextUtils;
import androidx.annotation.n0;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.http.HttpResponse;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements com.efs.sdk.base.core.c.c {
    private static void a(HttpResponse httpResponse) {
        if (httpResponse == null || TextUtils.isEmpty(httpResponse.data)) {
            return;
        }
        for (String str : httpResponse.data.split("`")) {
            String[] strArrSplit = str.split(ContainerUtils.KEY_VALUE_DELIMITER);
            if (strArrSplit.length >= 2) {
                if (strArrSplit[0].equalsIgnoreCase("retcode")) {
                    httpResponse.setBizCode(strArrSplit[1]);
                } else {
                    ((Map) httpResponse.extra).put(strArrSplit[0], strArrSplit[1]);
                }
            }
        }
    }

    @Override // com.efs.sdk.base.core.c.c
    @n0
    public final HttpResponse a(com.efs.sdk.base.core.d.b bVar, boolean z10) {
        HttpResponse httpResponse;
        try {
            c cVar = f.a.f42551a.f42547a;
            String strValueOf = String.valueOf(System.currentTimeMillis());
            String strA = com.efs.sdk.base.core.util.b.b.a(cVar.f42540b + cVar.f42541c + strValueOf + "AppChk#2014");
            StringBuilder sb2 = new StringBuilder();
            String str = cVar.f42539a;
            if (str.startsWith("http")) {
                sb2.append(str);
                sb2.append("?chk=");
            } else {
                sb2.append(str);
                sb2.append("?chk=");
            }
            sb2.append(strA.substring(strA.length() - 8));
            sb2.append("&vno=");
            sb2.append(strValueOf);
            sb2.append("&uuid=");
            sb2.append(cVar.f42541c);
            sb2.append("&app=");
            sb2.append(cVar.f42540b);
            sb2.append("&zip=gzip");
            String string = sb2.toString();
            int length = 0;
            byte[] bArrA = new byte[0];
            int i10 = bVar.f42520a.f42515c;
            if (i10 == 0) {
                bArrA = bVar.f42522c;
                length = bArrA.length;
            } else if (1 == i10) {
                bArrA = com.efs.sdk.base.core.util.b.a(bVar.f42523d.getPath());
                length = bArrA.length;
            }
            HashMap map = new HashMap();
            map.put("Content-Type", "application/x-www-form-urlencoded");
            map.put("Content-Length", String.valueOf(length));
            com.efs.sdk.base.core.util.a.d dVarA = new com.efs.sdk.base.core.util.a.d(string).a(map);
            dVarA.f42571a.f42565c = bArrA;
            httpResponse = dVarA.a().b();
            a(httpResponse);
            if (!httpResponse.succ) {
                Log.i("efs.base", "wa upload fail, resp is " + httpResponse.toString());
                return httpResponse;
            }
            Log.i("efs.base", "wa upload succ, " + httpResponse.toString());
            com.efs.sdk.base.core.util.b.b(bVar.f42523d);
            return httpResponse;
        } catch (Throwable th2) {
            httpResponse = 0 == 0 ? new HttpResponse() : null;
            Log.e("efs.wa.send", "get file size error", th2);
        }
    }
}
