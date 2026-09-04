package e7;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f118563a = "HumeSDK";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f118564b = 1903654776;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f118565c = -1721342362;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f118566d = 1903654775;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String[] f118567e = new String[3];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static volatile boolean f118568f = false;

    private static String a(Context context) throws Throwable {
        if (!f118568f) {
            d(context);
            f118568f = true;
        }
        if (TextUtils.isEmpty(f118567e[0])) {
            return !TextUtils.isEmpty(f118567e[1]) ? f118567e[1] : "";
        }
        return f118567e[0];
    }

    private static Map<String, String> b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            HashMap map = new HashMap();
            while (itKeys.hasNext()) {
                String string = itKeys.next().toString();
                map.put(string, jSONObject.getString(string));
            }
            return map;
        } catch (JSONException | Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private static Map<String, String> c(Context context) throws Throwable {
        if (!f118568f) {
            d(context);
            f118568f = true;
        }
        Map<String, String> mapB = b(f118567e[2]);
        return mapB == null ? new HashMap() : mapB;
    }

    private static void d(Context context) throws Throwable {
        int[] iArr = {f118565c, f118566d, f118564b};
        String strE = e(context);
        if (TextUtils.isEmpty(strE)) {
            f118567e = new String[]{"", "", ""};
        }
        File file = new File(strE);
        String[] strArrC = f.c(file, iArr);
        if (strArrC == null) {
            strArrC = f118567e;
        }
        f118567e = strArrC;
        if (strArrC.length >= 2 && TextUtils.isEmpty(strArrC[0]) && TextUtils.isEmpty(f118567e[1])) {
            String strA = com.bytedance.hume.readapk.a.a.a(file);
            String[] strArr = f118567e;
            if (strA == null) {
                strA = "";
            }
            strArr[0] = strA;
        }
        String[] strArr2 = f118567e;
        if (strArr2.length < 3 || TextUtils.isEmpty(strArr2[2])) {
            return;
        }
        int length = f118567e[2].length();
        if (length <= 4) {
            f118567e[2] = "";
        } else {
            String[] strArr3 = f118567e;
            strArr3[2] = strArr3[2].substring(2, length - 2);
        }
    }

    private static String e(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            if (applicationInfo == null) {
                return null;
            }
            return applicationInfo.sourceDir;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String f(Context context) throws Throwable {
        if (!f118568f) {
            d(context);
            f118568f = true;
        }
        Map<String, String> mapB = b(a(context));
        return (mapB == null || mapB.size() <= 0) ? "" : mapB.get("hume_channel_id");
    }

    public static String g() {
        return "1.0.0";
    }
}
