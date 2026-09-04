package t5;

import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class b extends r5.e {
    @Override // r5.e
    public String d(x5.a aVar, HashMap<String, String> map, HashMap<String, String> map2) throws JSONException {
        if (map2 == null) {
            map2 = new HashMap<>();
        }
        map2.putAll(z5.a.a(aVar));
        z5.e.i(j5.a.f124275z, "cf " + map2);
        return super.d(aVar, map, map2);
    }

    @Override // r5.e
    public JSONObject f() throws JSONException {
        return r5.e.g("sdkConfig", "obtain");
    }

    @Override // r5.e
    public String n() {
        return "5.0.0";
    }

    @Override // r5.e
    public boolean o() {
        return true;
    }
}
