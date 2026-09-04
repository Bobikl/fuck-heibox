package z5;

import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class d {
    public static JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        try {
            JSONObject[] jSONObjectArr = {jSONObject, jSONObject2};
            for (int i10 = 0; i10 < 2; i10++) {
                JSONObject jSONObject4 = jSONObjectArr[i10];
                if (jSONObject4 != null) {
                    Iterator<String> itKeys = jSONObject4.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject3.put(next, jSONObject4.get(next));
                    }
                }
            }
        } catch (JSONException e10) {
            e.d(e10);
        }
        return jSONObject3;
    }
}
