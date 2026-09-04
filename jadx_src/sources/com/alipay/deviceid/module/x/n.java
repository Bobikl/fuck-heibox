package com.alipay.deviceid.module.x;

import android.content.Context;
import com.alipay.deviceid.module.rpc.report.open.model.ReportRequest;
import com.alipay.deviceid.module.rpc.report.open.model.ReportResult;
import com.alipay.deviceid.module.senative.DeviceIdUtil;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: ConvertUtil.java */
/* JADX INFO: loaded from: classes6.dex */
public final class n {
    public static ReportRequest a(Context context, p pVar) {
        ReportRequest reportRequest = new ReportRequest();
        if (pVar == null) {
            return null;
        }
        Map map = pVar.f38359d;
        if (map == null) {
            map = new HashMap();
        }
        if (map == null) {
            return null;
        }
        reportRequest.bizType = "1";
        reportRequest.rpcVersion = e.c(pVar.f38358c);
        reportRequest.os = e.c(pVar.f38356a);
        reportRequest.appName = (String) map.get("AA1");
        reportRequest.appVersion = (String) map.get("AA2");
        reportRequest.sdkName = (String) map.get("AA3");
        reportRequest.sdkVersion = (String) map.get("AA4");
        HashMap map2 = new HashMap();
        map2.put("apdidToken", e.c(pVar.f38357b));
        reportRequest.bizData = map2;
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                if (str != null && str.length() > 0) {
                    jSONObject.put(str, map.get(str));
                }
            }
            reportRequest.deviceData = new String(DeviceIdUtil.getInstance(context).packageDevideData(("{\"AE20\":\"%s\"," + jSONObject.toString().substring(1)).getBytes("UTF-8")));
        } catch (Exception unused) {
            reportRequest.deviceData = "";
        }
        return reportRequest;
    }

    public static o a(ReportResult reportResult) {
        o oVar = new o();
        if (reportResult == null) {
            return null;
        }
        oVar.f38349a = reportResult.success;
        oVar.f38350b = reportResult.resultCode;
        Map<String, String> map = reportResult.resultData;
        if (map == null) {
            return null;
        }
        oVar.f38351c = e.a(map, "apdidToken", "");
        oVar.f38352d = e.a(map, "appListCmdVer", "");
        oVar.f38355g = e.a(map, "webrtcUrl", "");
        String strA = e.a(map, "drmSwitch", "");
        oVar.f38353e = "0";
        oVar.f38354f = "0";
        if (e.b(strA) && strA.length() > 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strA.charAt(0));
            oVar.f38353e = sb2.toString();
        }
        return oVar;
    }
}
