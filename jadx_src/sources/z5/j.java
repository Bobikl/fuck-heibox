package z5;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f141892a = "resultStatus";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f141893b = "memo";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f141894c = "result";

    public static String a(String str, String str2) {
        try {
            Matcher matcher = Pattern.compile("(^|;)" + str2 + "=\\{([^}]*?)\\}").matcher(str);
            if (matcher.find()) {
                return matcher.group(2);
            }
        } catch (Throwable th2) {
            e.d(th2);
        }
        return "?";
    }

    public static Map<String, String> b() {
        com.alipay.sdk.m.j.c cVarB = com.alipay.sdk.m.j.c.b(com.alipay.sdk.m.j.c.CANCELED.b());
        HashMap map = new HashMap();
        map.put(f141892a, Integer.toString(cVarB.b()));
        map.put(f141893b, cVarB.a());
        map.put("result", "");
        return map;
    }

    public static Map<String, String> c(String str) {
        String[] strArrSplit = str.split(";");
        HashMap map = new HashMap();
        for (String str2 : strArrSplit) {
            String strSubstring = str2.substring(0, str2.indexOf("={"));
            map.put(strSubstring, e(str2, strSubstring));
        }
        return map;
    }

    public static Map<String, String> d(x5.a aVar, String str) {
        Map<String, String> mapB = b();
        try {
            return c(str);
        } catch (Throwable th2) {
            h5.a.e(aVar, h5.b.f119113l, h5.b.f119123q, th2);
            return mapB;
        }
    }

    public static String e(String str, String str2) {
        String str3 = str2 + "={";
        return str.substring(str.indexOf(str3) + str3.length(), str.lastIndexOf(g.f141884d));
    }
}
