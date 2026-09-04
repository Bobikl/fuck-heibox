package com.huawei.hms.scankit.p;

import com.huawei.hms.ml.scan.HmsScan;
import java.util.List;

/* JADX INFO: compiled from: VEventResultParser.java */
/* JADX INFO: loaded from: classes7.dex */
public final class y7 extends t6 {
    private static String a(CharSequence charSequence, String str, boolean z10) {
        List<List<String>> listB = x7.b(charSequence, str, z10, false);
        return (listB == null || listB.isEmpty()) ? "" : listB.get(listB.size() - 1).get(0);
    }

    private static void a(String[] strArr, HmsScan.EventTime eventTime) {
        if (strArr == null || strArr.length == 0) {
            return;
        }
        for (String str : strArr) {
            d3.a(str, eventTime);
        }
    }

    private static String[] b(CharSequence charSequence, String str, boolean z10) {
        List<List<String>> listB = x7.b(charSequence, str, z10, false);
        if (listB == null || listB.isEmpty()) {
            return new String[0];
        }
        int size = listB.size();
        String[] strArr = new String[size];
        for (int i10 = 0; i10 < size; i10++) {
            strArr[i10] = listB.get(i10).get(0);
        }
        return strArr;
    }

    @Override // com.huawei.hms.scankit.p.t6
    public HmsScan b(s6 s6Var) {
        String strA = t6.a(s6Var);
        if (!strA.startsWith("BEGIN:VEVENT")) {
            return null;
        }
        String str = strA + "\n";
        String strA2 = a("SUMMARY", str, true);
        String strA3 = a("LOCATION", str, true);
        String strA4 = a("ORGANIZER", str, true);
        String strA5 = a("DESCRIPTION", str, true);
        String strA6 = a("STATUS", str, true);
        String[] strArrB = b("DTSTART", str, true);
        String[] strArrB2 = b("DTEND", str, true);
        HmsScan.EventTime eventTime = new HmsScan.EventTime(-1, -1, -1, -1, -1, -1, false, "");
        HmsScan.EventTime eventTime2 = new HmsScan.EventTime(-1, -1, -1, -1, -1, -1, false, "");
        a(strArrB, eventTime);
        a(strArrB2, eventTime2);
        return new HmsScan(s6Var.k(), t6.a(s6Var.c()), strA2, HmsScan.EVENT_INFO_FORM, s6Var.i(), t6.a(s6Var.j()), null, new z6(new HmsScan.EventInfo(strA2, eventTime, eventTime2, strA3, strA5, strA4, strA6)));
    }
}
