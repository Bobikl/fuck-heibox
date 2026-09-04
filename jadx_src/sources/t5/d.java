package t5;

import android.content.Context;
import com.tencent.cos.xml.common.COSRequestHeaderKey;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class d extends r5.e {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f140669t = "log_v";

    @Override // r5.e
    public String b(x5.a aVar) throws JSONException {
        HashMap<String, String> map = new HashMap<>();
        map.put("api_name", "/sdk/log");
        map.put(r5.e.f138812l, "1.0.0");
        HashMap<String, String> map2 = new HashMap<>();
        map2.put(f140669t, "1.0");
        return d(aVar, map, map2);
    }

    @Override // r5.e
    public String c(x5.a aVar, String str, JSONObject jSONObject) {
        return str;
    }

    @Override // r5.e
    public Map<String, String> e(boolean z10, String str) {
        HashMap map = new HashMap();
        map.put(r5.e.f138803c, String.valueOf(z10));
        map.put("content-type", COSRequestHeaderKey.APPLICATION_OCTET_STREAM);
        map.put(r5.e.f138809i, "CBC");
        return map;
    }

    @Override // r5.e
    public JSONObject f() throws JSONException {
        return null;
    }

    @Override // r5.e
    public r5.b i(x5.a aVar, Context context, String str) throws Throwable {
        return k(aVar, context, str, j5.a.f124252c, true);
    }

    @Override // r5.e
    public boolean o() {
        return false;
    }
}
