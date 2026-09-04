package t7;

import com.meituan.robust.Constants;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: DefaultJsonFormatter.java */
/* JADX INFO: loaded from: classes6.dex */
public class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f140670a = 4;

    @Override // r7.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String a(String str) {
        if (str == null || str.trim().length() == 0) {
            com.elvishew.xlog.internal.b.e().g("JSON empty.");
            return "";
        }
        try {
            if (str.startsWith("{")) {
                return new JSONObject(str).toString(4);
            }
            if (str.startsWith(Constants.ARRAY_TYPE)) {
                return new JSONArray(str).toString(4);
            }
            com.elvishew.xlog.internal.b.e().g("JSON should start with { or [");
            return str;
        } catch (Exception e10) {
            com.elvishew.xlog.internal.b.e().g(e10.getMessage());
            return str;
        }
    }
}
