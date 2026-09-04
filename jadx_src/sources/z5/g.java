package z5;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes6.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f141881a = "pref_trade_token";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f141882b = ";";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f141883c = "result={";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f141884d = "}";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f141885e = "trade_token=\"";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f141886f = "\"";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f141887g = "trade_token=";

    public static String a(String str) {
        String strSubstring = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split(";");
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            if (strArrSplit[i10].startsWith(f141883c) && strArrSplit[i10].endsWith(f141884d)) {
                String str2 = strArrSplit[i10];
                String[] strArrSplit2 = str2.substring(8, str2.length() - 1).split("&");
                for (int i11 = 0; i11 < strArrSplit2.length; i11++) {
                    if (strArrSplit2[i11].startsWith(f141885e) && strArrSplit2[i11].endsWith("\"")) {
                        String str3 = strArrSplit2[i11];
                        strSubstring = str3.substring(13, str3.length() - 1);
                        break;
                    }
                    if (strArrSplit2[i11].startsWith(f141887g)) {
                        strSubstring = strArrSplit2[i11].substring(12);
                        break;
                    }
                }
            }
        }
        return strSubstring;
    }

    public static String b(x5.a aVar, Context context) {
        String strB = h.b(aVar, context, f141881a, "");
        e.g(j5.a.f124275z, "get trade token: " + strB);
        return strB;
    }

    public static void c(x5.a aVar, Context context, String str) {
        try {
            String strA = a(str);
            e.g(j5.a.f124275z, "trade token: " + strA);
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            h.e(aVar, context, f141881a, strA);
        } catch (Throwable th2) {
            h5.a.e(aVar, h5.b.f119113l, h5.b.I, th2);
            e.d(th2);
        }
    }
}
