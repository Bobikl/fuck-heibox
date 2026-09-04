package k4;

import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.android.verify.logger.f;
import com.max.hbuikit.bean.param.UiKitSpanObj;

/* JADX INFO: compiled from: BehaviorLogger.java */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f124429a;

    public static void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            f.k("BehaviorLogger").d("null log event data", new Object[0]);
        } else {
            f.k("BehaviorLogger").a("onLogEvent", jSONObject.toString());
        }
    }

    public static void b(String str) {
        f124429a = str;
    }

    public static void c(String str) {
        f.k("BehaviorLogger").a(UiKitSpanObj.TYPE_CLICK, str);
    }
}
