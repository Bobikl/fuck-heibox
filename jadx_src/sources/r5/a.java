package r5;

import android.text.TextUtils;
import com.huawei.hms.framework.common.ContainerUtils;

/* JADX INFO: loaded from: classes6.dex */
public class a {
    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String[] strArrSplit = str.split("&");
        if (strArrSplit.length == 0) {
            return "";
        }
        String strE = null;
        String strD = null;
        String strF = null;
        String strC = null;
        for (String str2 : strArrSplit) {
            if (TextUtils.isEmpty(strE)) {
                strE = e(str2);
            }
            if (TextUtils.isEmpty(strD)) {
                strD = d(str2);
            }
            if (TextUtils.isEmpty(strF)) {
                strF = f(str2);
            }
            if (TextUtils.isEmpty(strC)) {
                strC = c(str2);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(strE)) {
            sb2.append("biz_type=" + strE + ";");
        }
        if (!TextUtils.isEmpty(strD)) {
            sb2.append("biz_no=" + strD + ";");
        }
        if (!TextUtils.isEmpty(strF)) {
            sb2.append("trade_no=" + strF + ";");
        }
        if (!TextUtils.isEmpty(strC)) {
            sb2.append("app_userid=" + strC + ";");
        }
        String string = sb2.toString();
        return string.endsWith(";") ? string.substring(0, string.length() - 1) : string;
    }

    public static String b(String str) {
        String[] strArrSplit = str.split(ContainerUtils.KEY_VALUE_DELIMITER);
        if (strArrSplit.length <= 1) {
            return null;
        }
        String str2 = strArrSplit[1];
        return str2.contains("\"") ? str2.replaceAll("\"", "") : str2;
    }

    public static String c(String str) {
        if (str.contains("app_userid")) {
            return b(str);
        }
        return null;
    }

    public static String d(String str) {
        if (str.contains("biz_no")) {
            return b(str);
        }
        return null;
    }

    public static String e(String str) {
        if (str.contains("biz_type")) {
            return b(str);
        }
        return null;
    }

    public static String f(String str) {
        if (!str.contains(h5.b.B0) || str.startsWith(h5.b.A0)) {
            return null;
        }
        return b(str);
    }
}
