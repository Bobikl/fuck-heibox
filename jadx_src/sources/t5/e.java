package t5;

import android.content.Context;
import com.max.xiaoheihe.bean.WebProtocolObj;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class e extends r5.e {
    @Override // r5.e
    public String c(x5.a aVar, String str, JSONObject jSONObject) {
        return str;
    }

    @Override // r5.e
    public Map<String, String> e(boolean z10, String str) {
        return new HashMap();
    }

    @Override // r5.e
    public JSONObject f() {
        return null;
    }

    @Override // r5.e
    public r5.b i(x5.a aVar, Context context, String str) throws Throwable {
        z5.e.i(j5.a.f124275z, "mdap post");
        byte[] bArrA = n5.b.a(str.getBytes(Charset.forName("UTF-8")));
        HashMap map = new HashMap();
        map.put("utdId", x5.b.e().d());
        map.put("logHeader", WebProtocolObj.HTTP_METHOD_RAW);
        map.put("bizCode", z5.e.f141858b);
        map.put("productId", "alipaysdk_android");
        map.put("Content-Encoding", "Gzip");
        map.put("productVersion", "15.8.11");
        p5.a.b bVarB = p5.a.b(context, new p5.a.C1252a(j5.a.f124253d, map, bArrA));
        z5.e.i(j5.a.f124275z, "mdap got " + bVarB);
        if (bVarB == null) {
            throw new RuntimeException("Response is null");
        }
        boolean zM = r5.e.m(bVarB);
        try {
            byte[] bArrB = bVarB.f138166c;
            if (zM) {
                bArrB = n5.b.b(bArrB);
            }
            return new r5.b("", new String(bArrB, Charset.forName("UTF-8")));
        } catch (Exception e10) {
            z5.e.d(e10);
            return null;
        }
    }

    @Override // r5.e
    public boolean o() {
        return false;
    }
}
