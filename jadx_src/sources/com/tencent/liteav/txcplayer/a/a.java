package com.tencent.liteav.txcplayer.a;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.tencent.liteav.base.util.LiteavLog;
import java.net.URLDecoder;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes4.dex */
public final class a {
    /* JADX WARN: Code duplicated, block: B:12:0x002c  */
    public static String a(String str) {
        String strSubstring;
        if (TextUtils.isEmpty(str)) {
            strSubstring = "";
        } else {
            int iIndexOf = str.indexOf(63);
            if (iIndexOf > 0) {
                str = str.substring(0, iIndexOf);
            }
            int iLastIndexOf = str.lastIndexOf(46);
            if (iLastIndexOf < 0 || iLastIndexOf >= str.length() - 1) {
                strSubstring = "";
            } else {
                strSubstring = str.substring(iLastIndexOf + 1);
            }
        }
        return strSubstring.contains("/") ? "" : strSubstring;
    }

    public static String a(String str, String str2) {
        String path;
        int iLastIndexOf;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (TextUtils.isEmpty(str2) || (path = Uri.parse(str).getPath()) == null) {
            return str;
        }
        String[] strArrSplit = path.split("/");
        if (strArrSplit.length <= 0 || (iLastIndexOf = str.lastIndexOf(strArrSplit[strArrSplit.length - 1])) <= 0) {
            return str;
        }
        return str.substring(0, iLastIndexOf) + "voddrm.token." + str2 + "." + str.substring(iLastIndexOf);
    }

    public static String a(String str, String str2, String str3, int i10) {
        String str4;
        Uri uri = Uri.parse(str);
        String query = uri.getQuery();
        if (TextUtils.isEmpty(query)) {
            str4 = "";
        } else {
            str4 = query + "&";
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = org.apache.tools.ant.taskdefs.email.b.K;
        }
        return Uri.decode(uri.buildUpon().query(str4 + "spfileid=" + str2 + "&spdrmtype=" + str3 + "&spappid=" + i10).build().toString());
    }

    public static String b(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] bArrDigest = messageDigest.digest();
            StringBuffer stringBuffer = new StringBuffer("");
            for (int i10 = 0; i10 < bArrDigest.length; i10++) {
                int i11 = bArrDigest[i10];
                if (i11 < 0) {
                    i11 += 256;
                }
                if (i11 < 16) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(Integer.toHexString(i11));
            }
            return stringBuffer.toString();
        } catch (Exception unused) {
            return str;
        }
    }

    public static String c(String str) {
        try {
            if (f(str)) {
                LiteavLog.w("CommonUtil", "URL has been encoded");
                return str;
            }
            byte[] bytes = str.getBytes("UTF-8");
            StringBuilder sb2 = new StringBuilder(bytes.length);
            for (int i10 = 0; i10 < bytes.length; i10++) {
                int i11 = bytes[i10];
                if (i11 < 0) {
                    i11 += 256;
                }
                if (i11 <= 32 || i11 >= 127 || i11 == 34 || i11 == 37 || i11 == 60 || i11 == 62 || i11 == 91 || i11 == 125 || i11 == 92 || i11 == 93 || i11 == 94 || i11 == 96 || i11 == 123 || i11 == 124) {
                    sb2.append(String.format("%%%02X", Integer.valueOf(i11)));
                } else {
                    sb2.append((char) i11);
                }
            }
            return sb2.toString();
        } catch (Exception e10) {
            LiteavLog.e("CommonUtil", "tryEncodeUrl failed.", e10);
            return str;
        }
    }

    public static String d(String str) {
        String strB = b(str);
        String strA = a(str);
        if (TextUtils.isEmpty(strA)) {
            return strB + ".auto";
        }
        if (strA.toLowerCase().endsWith("m3u8")) {
            return strB + ".hls";
        }
        if (strA.toLowerCase().endsWith("mp4") && !g(str)) {
            strB = b(h(str));
        }
        return strB + "." + strA;
    }

    public static String e(String str) {
        return new String(Base64.decode(str, 0));
    }

    private static boolean f(String str) {
        if (str == null) {
            return true;
        }
        try {
            return !str.replace("+", " ").equals(URLDecoder.decode(str, "UTF-8").replace("+", " "));
        } catch (Exception e10) {
            LiteavLog.e("CommonUtil", "isUrlEncoded error : ", e10);
            return false;
        }
    }

    private static boolean g(String str) {
        int iIndexOf = str.indexOf("?");
        if (iIndexOf < 0) {
            return false;
        }
        String strSubstring = str.substring(iIndexOf);
        return !TextUtils.isEmpty(strSubstring) && strSubstring.toLowerCase().contains("exper");
    }

    private static String h(String str) {
        int iIndexOf;
        int iIndexOf2 = str.indexOf("voddrm.token.");
        if (iIndexOf2 >= 0 && (iIndexOf = str.indexOf(".", iIndexOf2 + 13)) >= 0 && iIndexOf < str.length() - 1) {
            str = str.substring(0, iIndexOf2) + str.substring(iIndexOf + 1);
        }
        int iIndexOf3 = str.indexOf("?");
        return iIndexOf3 >= 0 ? str.substring(0, iIndexOf3) : str;
    }
}
