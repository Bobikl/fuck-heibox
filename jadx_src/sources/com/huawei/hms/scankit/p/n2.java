package com.huawei.hms.scankit.p;

import android.text.TextUtils;
import com.huawei.hms.ml.scan.HmsScan;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: DriverInfoResultParser.java */
/* JADX INFO: loaded from: classes7.dex */
public class n2 extends t6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List<String> f62136c = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f62137b = "";

    /* JADX INFO: compiled from: DriverInfoResultParser.java */
    public class a extends ArrayList<String> {
        a() {
            add("");
            add("DCT");
            add("DAD");
            add("DCS");
            add("DBC");
            add("DBB");
            add("DAG");
            add("DAI");
            add("DAJ");
            add("DAK");
            add("DAQ");
            add("DCG");
            add("DBD");
            add("DBA");
        }
    }

    public HmsScan.DriverInfo a(String[] strArr, String str) {
        String[] strArr2 = {"", "", "", "", "", "", "", "", "", "", "", "", "", ""};
        strArr2[0] = str;
        boolean z10 = false;
        for (String str2 : strArr) {
            if (str2.length() <= 3) {
                return null;
            }
            int iIndexOf = f62136c.indexOf(str2.substring(0, 3));
            if (iIndexOf != -1) {
                strArr2[iIndexOf] = str2.substring(3).trim();
                z10 = true;
            }
        }
        if (!z10) {
            return null;
        }
        this.f62137b = strArr2[0] + " " + strArr2[3] + " " + strArr2[1];
        return new HmsScan.DriverInfo(strArr2[0], strArr2[1], strArr2[2], strArr2[3], strArr2[4], strArr2[5], strArr2[6], strArr2[7], strArr2[8], strArr2[9], strArr2[10], strArr2[11], strArr2[12], strArr2[13], null, null, null, null);
    }

    @Override // com.huawei.hms.scankit.p.t6
    public HmsScan b(s6 s6Var) {
        String strA = t6.a(s6Var);
        if (!TextUtils.isEmpty(strA) && strA.startsWith("@") && strA.length() > 34 && strA.substring(4, 8).equals("ANSI")) {
            String strValueOf = String.valueOf(strA.charAt(1));
            String strValueOf2 = String.valueOf(strA.charAt(3));
            String strSubstring = strA.substring(21, 23);
            HmsScan.DriverInfo driverInfoA = a(strA.substring(strA.indexOf(strSubstring, 23) + 2).split(strValueOf2)[0].split(strValueOf), strSubstring);
            if (driverInfoA != null) {
                return new HmsScan(s6Var.k(), t6.a(s6Var.c()), this.f62137b, HmsScan.DRIVER_INFO_FORM, s6Var.i(), t6.a(s6Var.j()), null, new z6(driverInfoA));
            }
        }
        return null;
    }
}
