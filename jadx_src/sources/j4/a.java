package j4;

import com.alibaba.fastjson.JSONObject;

/* JADX INFO: compiled from: BridgeEvent.java */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f124236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public JSONObject f124237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f124238c;

    public static a a(a aVar) {
        a aVar2 = new a();
        if (aVar != null) {
            aVar2.f124236a = aVar.f124236a;
            aVar2.f124238c = b.f124242d;
            aVar2.f124237b = new JSONObject();
        }
        return aVar2;
    }

    public static JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", (Object) Boolean.TRUE);
        return jSONObject;
    }
}
