package com.huawei.hms.scankit.p;

import android.text.TextUtils;
import com.huawei.hms.ml.scan.HmsScan;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: WifiResultParser.java */
/* JADX INFO: loaded from: classes7.dex */
public final class k8 extends t6 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f62044b = Pattern.compile("WIFI:[^:]", 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String[] f62045c = new String[0];

    private static int a(CharSequence charSequence, int i10) {
        int i11 = 0;
        for (int i12 = i10 - 1; i12 >= 0 && charSequence.charAt(i12) == '\\'; i12--) {
            i11++;
        }
        return i11;
    }

    static String[] a(String str, String str2, char c10, boolean z10) {
        int length = str2.length();
        ArrayList arrayList = null;
        int i10 = 0;
        while (i10 < length) {
            int iIndexOf = str2.indexOf(str, i10);
            if (iIndexOf < 0) {
                break;
            }
            int length2 = iIndexOf + str.length();
            boolean z11 = true;
            ArrayList arrayList2 = arrayList;
            int length3 = length2;
            while (z11) {
                int iIndexOf2 = str2.indexOf(c10, length3);
                if (iIndexOf2 < 0) {
                    length3 = str2.length();
                } else if (a(str2, iIndexOf2) % 2 != 0) {
                    length3 = iIndexOf2 + 1;
                } else {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(3);
                    }
                    String strB = t6.b(str2.substring(length2, iIndexOf2));
                    if (z10) {
                        strB = strB.trim();
                    }
                    arrayList2.add(strB);
                    length3 = iIndexOf2 + 1;
                }
                z11 = false;
            }
            i10 = length3;
            arrayList = arrayList2;
        }
        if (arrayList == null) {
            return null;
        }
        return (String[]) arrayList.toArray(f62045c);
    }

    private String b(String str, String str2, char c10, boolean z10) {
        String str3;
        String[] strArrA = a(str, str2, c10, z10);
        return (strArrA == null || strArrA.length == 0 || (str3 = strArrA[0]) == null) ? "" : str3;
    }

    private static int c(String str) {
        if (str == null) {
            return 0;
        }
        if (str.equalsIgnoreCase("WEP")) {
            return 2;
        }
        if ((str.equalsIgnoreCase("WPA") | str.equalsIgnoreCase("WPA2") | str.equalsIgnoreCase("WPA/WPA2")) || str.equalsIgnoreCase("WPA2/WPA")) {
            return 1;
        }
        return str.equalsIgnoreCase("SAE") ? 3 : 0;
    }

    @Override // com.huawei.hms.scankit.p.t6
    public HmsScan b(s6 s6Var) {
        String str;
        String strA = t6.a(s6Var);
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        Matcher matcher = f62044b.matcher(strA);
        if (matcher.find() && matcher.start() == 0) {
            String strSubstring = strA.substring(5);
            if (!strSubstring.endsWith(";")) {
                strSubstring = strSubstring + ";";
            }
            String strB = b("S:", strSubstring, ';', false);
            if (strB != null && !strB.isEmpty()) {
                String strB2 = b("P:", strSubstring, ';', false);
                String strB3 = b("T:", strSubstring, ';', false);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(strB);
                if (strB2 == null || strB2.isEmpty()) {
                    str = "";
                } else {
                    str = " " + strB2;
                }
                sb2.append(str);
                return new HmsScan(s6Var.k(), t6.a(s6Var.c()), sb2.toString(), HmsScan.WIFI_CONNECT_INFO_FORM, s6Var.i(), t6.a(s6Var.j()), null, new z6(new HmsScan.WiFiConnectionInfo(strB, strB2, c(strB3))));
            }
        }
        return null;
    }
}
