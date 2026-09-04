package com.huawei.secure.android.common.util;

import android.text.TextUtils;
import android.util.Log;
import com.tencent.qcloud.core.util.IOUtils;
import java.util.Locale;
import kotlin.text.y;

/* JADX INFO: loaded from: classes7.dex */
public class EncodeUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f63066a = "EncodeUtil";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final char[] f63067b = {',', lg.a.f131414g, '-', '_'};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f63068c = new String[256];

    static {
        for (char c10 = 0; c10 < 255; c10 = (char) (c10 + 1)) {
            if ((c10 < '0' || c10 > '9') && ((c10 < 'A' || c10 > 'Z') && (c10 < 'a' || c10 > 'z'))) {
                f63068c[c10] = b(c10).intern();
            } else {
                f63068c[c10] = null;
            }
        }
    }

    private static Character a(b bVar) {
        bVar.c();
        Character chD = bVar.d();
        if (chD == null) {
            bVar.i();
            return null;
        }
        if (chD.charValue() != '\\') {
            bVar.i();
            return null;
        }
        Character chD2 = bVar.d();
        if (chD2 == null) {
            bVar.i();
            return null;
        }
        if (chD2.charValue() == 'b') {
            return '\b';
        }
        if (chD2.charValue() == 't') {
            return '\t';
        }
        if (chD2.charValue() == 'n') {
            return '\n';
        }
        if (chD2.charValue() == 'v') {
            return (char) 11;
        }
        if (chD2.charValue() == 'f') {
            return '\f';
        }
        if (chD2.charValue() == 'r') {
            return '\r';
        }
        if (chD2.charValue() == '\"') {
            return Character.valueOf(y.f128593b);
        }
        if (chD2.charValue() == '\'') {
            return '\'';
        }
        if (chD2.charValue() == '\\') {
            return Character.valueOf(IOUtils.DIR_SEPARATOR_WINDOWS);
        }
        int i10 = 0;
        if (Character.toLowerCase(chD2.charValue()) == 'x') {
            StringBuilder sb2 = new StringBuilder();
            while (i10 < 2) {
                Character chE = bVar.e();
                if (chE == null) {
                    bVar.i();
                    return null;
                }
                sb2.append(chE);
                i10++;
            }
            try {
                int i11 = Integer.parseInt(sb2.toString(), 16);
                if (Character.isValidCodePoint(i11)) {
                    return Character.valueOf((char) i11);
                }
            } catch (NumberFormatException unused) {
                bVar.i();
                return null;
            }
        } else if (Character.toLowerCase(chD2.charValue()) == 'u') {
            StringBuilder sb3 = new StringBuilder();
            while (i10 < 4) {
                Character chE2 = bVar.e();
                if (chE2 == null) {
                    bVar.i();
                    return null;
                }
                sb3.append(chE2);
                i10++;
            }
            try {
                int i12 = Integer.parseInt(sb3.toString(), 16);
                if (Character.isValidCodePoint(i12)) {
                    return Character.valueOf((char) i12);
                }
            } catch (NumberFormatException unused2) {
                bVar.i();
                return null;
            }
        } else if (b.c(chD2)) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(chD2);
            Character chD3 = bVar.d();
            if (b.c(chD3)) {
                sb4.append(chD3);
                Character chD4 = bVar.d();
                if (b.c(chD4)) {
                    sb4.append(chD4);
                } else {
                    bVar.a(chD4);
                }
            } else {
                bVar.a(chD3);
            }
            try {
                int i13 = Integer.parseInt(sb4.toString(), 8);
                if (Character.isValidCodePoint(i13)) {
                    return Character.valueOf((char) i13);
                }
            } catch (NumberFormatException unused3) {
                bVar.i();
                return null;
            }
        }
        return chD2;
    }

    private static String a(char c10) {
        return c10 < 255 ? f63068c[c10] : b(c10);
    }

    private static String a(char[] cArr, Character ch2) {
        if (a(ch2.charValue(), cArr)) {
            return "" + ch2;
        }
        if (a(ch2.charValue()) == null) {
            return "" + ch2;
        }
        String hexString = Integer.toHexString(ch2.charValue());
        if (ch2.charValue() < 256) {
            return "\\x" + org.apache.tools.tar.c.V.substring(hexString.length()) + hexString.toUpperCase(Locale.ENGLISH);
        }
        return "\\u" + "0000".substring(hexString.length()) + hexString.toUpperCase(Locale.ENGLISH);
    }

    private static String a(char[] cArr, String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            sb2.append(a(cArr, Character.valueOf(str.charAt(i10))));
        }
        return sb2.toString();
    }

    private static boolean a(char c10, char[] cArr) {
        for (char c11 : cArr) {
            if (c10 == c11) {
                return true;
            }
        }
        return false;
    }

    private static String b(char c10) {
        return Integer.toHexString(c10);
    }

    public static String decodeForJavaScript(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            b bVar = new b(str);
            while (bVar.a()) {
                Character chA = a(bVar);
                if (chA != null) {
                    sb2.append(chA);
                } else {
                    sb2.append(bVar.d());
                }
            }
            return sb2.toString();
        } catch (Exception e10) {
            Log.e(f63066a, "decode js: " + e10.getMessage());
            return "";
        }
    }

    public static String encodeForJavaScript(String str) {
        return encodeForJavaScript(str, f63067b);
    }

    public static String encodeForJavaScript(String str, char[] cArr) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return a(cArr, str);
        } catch (Exception e10) {
            Log.e(f63066a, "encode js: " + e10.getMessage());
            return "";
        }
    }
}
