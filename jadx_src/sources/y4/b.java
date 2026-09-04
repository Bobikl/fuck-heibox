package y4;

import com.alipay.tscenter.biz.rpc.report.general.model.DataReportRequest;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportResult;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class b {
    public static DataReportRequest a(d dVar) {
        DataReportRequest dataReportRequest = new DataReportRequest();
        if (dVar == null) {
            return null;
        }
        dataReportRequest.os = dVar.f141580a;
        dataReportRequest.rpcVersion = dVar.f141589j;
        dataReportRequest.bizType = "1";
        HashMap map = new HashMap();
        dataReportRequest.bizData = map;
        map.put("apdid", dVar.f141581b);
        dataReportRequest.bizData.put("apdidToken", dVar.f141582c);
        dataReportRequest.bizData.put("umidToken", dVar.f141583d);
        dataReportRequest.bizData.put("dynamicKey", dVar.f141584e);
        dataReportRequest.deviceData = dVar.f141585f;
        return dataReportRequest;
    }

    public static c b(DataReportResult dataReportResult) {
        c cVar = new c();
        if (dataReportResult == null) {
            return null;
        }
        cVar.f141564a = dataReportResult.success;
        cVar.f141565b = dataReportResult.resultCode;
        Map<String, String> map = dataReportResult.resultData;
        if (map != null) {
            cVar.f141571c = map.get("apdid");
            cVar.f141572d = map.get("apdidToken");
            cVar.f141575g = map.get("dynamicKey");
            cVar.f141576h = map.get("timeInterval");
            cVar.f141577i = map.get("webrtcUrl");
            cVar.f141578j = "";
            String str = map.get("drmSwitch");
            if (e6.a.f(str)) {
                if (str.length() > 0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str.charAt(0));
                    cVar.f141573e = sb2.toString();
                }
                if (str.length() >= 3) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str.charAt(2));
                    cVar.f141574f = sb3.toString();
                }
            }
            if (map.containsKey("apse_degrade")) {
                cVar.f141579k = map.get("apse_degrade");
            }
        }
        return cVar;
    }
}
