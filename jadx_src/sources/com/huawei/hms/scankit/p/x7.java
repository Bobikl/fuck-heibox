package com.huawei.hms.scankit.p;

import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.ml.scan.HmsScan;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: VCardResultParser.java */
/* JADX INFO: loaded from: classes7.dex */
public final class x7 extends t6 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f62561b = Pattern.compile("\r?\n[ \t]");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f62562c = Pattern.compile(ContainerUtils.KEY_VALUE_DELIMITER);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f62563d = Pattern.compile(";");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Pattern f62564e = Pattern.compile("(?<!\\\\);+");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final String[] f62565f = new String[0];

    protected static int a(char c10) {
        if (c10 >= '0' && c10 <= '9') {
            return c10 - '0';
        }
        char c11 = 'a';
        if (c10 < 'a' || c10 > 'f') {
            c11 = 'A';
            if (c10 < 'A' || c10 > 'F') {
                return -1;
            }
        }
        return (c10 - c11) + 10;
    }

    static int a(int i10, String str, boolean z10) {
        int iIndexOf;
        while (true) {
            iIndexOf = str.indexOf(10, i10);
            if (iIndexOf < 0) {
                break;
            }
            if (iIndexOf < str.length() - 1) {
                int i11 = iIndexOf + 1;
                if (str.charAt(i11) == ' ' || str.charAt(i11) == '\t') {
                    i10 = iIndexOf + 2;
                }
            }
            if (!z10 || (!a(iIndexOf, 1, str) && !a(iIndexOf, 2, str))) {
                break;
            }
            i10 = iIndexOf + 1;
        }
        return iIndexOf;
    }

    private static HmsScan.PeopleName a(String str, String str2) {
        HmsScan.PeopleName peopleName = new HmsScan.PeopleName("", "", "", "", "", "", "");
        if (str != null) {
            String[] strArrSplit = str.split(";");
            if (strArrSplit.length > 0) {
                peopleName.familyName = strArrSplit[0];
            }
            if (strArrSplit.length > 1) {
                peopleName.givenName = strArrSplit[1];
            }
            if (strArrSplit.length > 2) {
                peopleName.middleName = strArrSplit[2];
            }
            if (strArrSplit.length > 3) {
                peopleName.namePrefix = strArrSplit[3];
            }
            if (strArrSplit.length > 4) {
                peopleName.nameSuffix = strArrSplit[4];
            }
        }
        if (str2 != null) {
            peopleName.fullName = str2;
        }
        return peopleName;
    }

    private static String a(CharSequence charSequence, String str) {
        char cCharAt;
        int length = charSequence.length();
        StringBuilder sb2 = new StringBuilder(length);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = 0;
        while (i10 < length) {
            char cCharAt2 = charSequence.charAt(i10);
            if (cCharAt2 != '\n' && cCharAt2 != '\r') {
                if (cCharAt2 != '=') {
                    a(byteArrayOutputStream, str, sb2);
                    sb2.append(cCharAt2);
                } else if (i10 < length - 2 && (cCharAt = charSequence.charAt(i10 + 1)) != '\r' && cCharAt != '\n') {
                    i10 += 2;
                    char cCharAt3 = charSequence.charAt(i10);
                    int iA = a(cCharAt);
                    int iA2 = a(cCharAt3);
                    if (iA >= 0 && iA2 >= 0) {
                        byteArrayOutputStream.write((iA << 4) + iA2);
                    }
                }
            }
            i10++;
        }
        a(byteArrayOutputStream, str, sb2);
        return sb2.toString();
    }

    private static String a(CharSequence charSequence, String str, boolean z10, boolean z11) {
        List<List<String>> listB = b(charSequence, str, z10, z11);
        String str2 = "";
        if (listB != null && !listB.isEmpty()) {
            for (List<String> list : listB) {
                if (list.get(0) != null && !list.get(0).isEmpty()) {
                    str2 = list.get(0);
                }
            }
        }
        return str2;
    }

    private static void a(ByteArrayOutputStream byteArrayOutputStream, String str, StringBuilder sb2) {
        String str2;
        if (byteArrayOutputStream.size() > 0) {
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (str == null) {
                str2 = new String(byteArray, StandardCharsets.UTF_8);
            } else {
                try {
                    str2 = new String(byteArray, str);
                } catch (UnsupportedEncodingException unused) {
                    str2 = new String(byteArray, StandardCharsets.UTF_8);
                }
            }
            byteArrayOutputStream.reset();
            sb2.append(str2);
        }
    }

    static void a(String str, boolean z10, boolean z11, String str2, boolean z12, List<String> list, List<List<String>> list2) {
        String strReplaceAll;
        if (z10) {
            str = str.trim();
        }
        if (z11) {
            strReplaceAll = a((CharSequence) str, str2);
            if (z12) {
                strReplaceAll = f62564e.matcher(strReplaceAll).replaceAll(" ").trim();
            }
        } else {
            if (z12) {
                str = f62564e.matcher(str).replaceAll(" ").trim();
            }
            strReplaceAll = f62561b.matcher(str).replaceAll("");
        }
        if (list != null) {
            list.add(0, strReplaceAll);
            list2.add(list);
        } else {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(strReplaceAll);
            list2.add(arrayList);
        }
    }

    private static void a(String[] strArr, int i10, StringBuilder sb2) {
        String str = strArr[i10];
        if (str == null || str.isEmpty()) {
            return;
        }
        if (sb2.length() > 0) {
            sb2.append(' ');
        }
        sb2.append(strArr[i10]);
    }

    private static boolean a(int i10, int i11, String str) {
        return i10 >= i11 && str.charAt(i10 - i11) == '=';
    }

    private static HmsScan.AddressInfo[] a(String[] strArr, String[] strArr2) {
        if (strArr.length != strArr2.length) {
            return new HmsScan.AddressInfo[0];
        }
        HmsScan.AddressInfo[] addressInfoArr = new HmsScan.AddressInfo[strArr.length];
        for (int i10 = 0; i10 < strArr.length; i10++) {
            HmsScan.AddressInfo addressInfo = new HmsScan.AddressInfo(new String[]{strArr2[i10]}, HmsScan.AddressInfo.OTHER_USE_TYPE);
            String str = strArr[i10];
            if (str != null) {
                if (str.equals("WORK")) {
                    addressInfo.addressType = HmsScan.AddressInfo.OFFICE_TYPE;
                } else if (strArr[i10].equals("HOME")) {
                    addressInfo.addressType = HmsScan.AddressInfo.RESIDENTIAL_USE_TYPE;
                }
            }
            addressInfoArr[i10] = addressInfo;
        }
        return addressInfoArr;
    }

    private static String[] a(Collection<List<String>> collection) {
        if (collection == null || collection.isEmpty()) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<List<String>> it = collection.iterator();
        while (it.hasNext()) {
            String str = it.next().get(0);
            if (str != null && !str.isEmpty()) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(f62565f);
    }

    static List<List<String>> b(CharSequence charSequence, String str, boolean z10, boolean z11) {
        boolean z12;
        String str2;
        ArrayList arrayList;
        int length = str.length();
        Pattern patternCompile = Pattern.compile("(?:^|\n)" + ((Object) charSequence) + "(?:;([^:\n(?![ |\t])]*))?:");
        int i10 = 0;
        ArrayList arrayList2 = null;
        while (i10 < length) {
            Matcher matcher = patternCompile.matcher(str);
            if (i10 > 0) {
                i10--;
            }
            if (!matcher.find(i10)) {
                break;
            }
            int iEnd = matcher.end(0);
            String strGroup = matcher.group(1);
            if (strGroup != null) {
                z12 = false;
                ArrayList arrayList3 = null;
                String str3 = null;
                for (String str4 : f62563d.split(strGroup)) {
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList(1);
                    }
                    arrayList3.add(str4);
                    String[] strArrSplit = f62562c.split(str4, 2);
                    if (strArrSplit.length > 1) {
                        if ("ENCODING".equalsIgnoreCase(strArrSplit[0]) && "QUOTED-PRINTABLE".equalsIgnoreCase(strArrSplit[1])) {
                            z12 = true;
                        } else if ("CHARSET".equalsIgnoreCase(strArrSplit[0])) {
                            str3 = strArrSplit[1];
                        }
                    }
                }
                arrayList = arrayList3;
                str2 = str3;
            } else {
                z12 = false;
                str2 = null;
                arrayList = null;
            }
            int iA = a(iEnd, str, z12);
            if (iA < 0) {
                iA = length;
            } else if (iA > iEnd) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                }
                if (iA >= 1 && str.charAt(iA - 1) == '\r') {
                    iA--;
                }
                a(str.substring(iEnd, iA), z10, z12, str2, z11, arrayList, arrayList2);
            }
            i10 = iA + 1;
        }
        return arrayList2;
    }

    private static HmsScan.EmailContent[] b(String[] strArr, String[] strArr2) {
        if (strArr.length != strArr2.length) {
            return new HmsScan.EmailContent[0];
        }
        HmsScan.EmailContent[] emailContentArr = new HmsScan.EmailContent[strArr.length];
        for (int i10 = 0; i10 < strArr.length; i10++) {
            HmsScan.EmailContent emailContent = new HmsScan.EmailContent(strArr2[i10], "", "", HmsScan.EmailContent.OTHER_USE_TYPE);
            String str = strArr[i10];
            if (str != null) {
                if (str.equals("WORK")) {
                    emailContent.addressType = HmsScan.EmailContent.OFFICE_USE_TYPE;
                } else if (strArr[i10].equals("HOME")) {
                    emailContent.addressType = HmsScan.TelPhoneNumber.RESIDENTIAL_USE_TYPE;
                }
            }
            emailContentArr[i10] = emailContent;
        }
        return emailContentArr;
    }

    private static String[] b(Collection<List<String>> collection) {
        if (collection == null || collection.isEmpty()) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (List<String> list : collection) {
            String str = list.get(0);
            if (str != null && !str.isEmpty()) {
                String strSubstring = null;
                for (int i10 = 1; i10 < list.size(); i10++) {
                    String str2 = list.get(i10);
                    int iIndexOf = str2.indexOf(61);
                    if (iIndexOf < 0) {
                        strSubstring = str2;
                        break;
                    }
                    if ("TYPE".equals(str2.substring(0, iIndexOf))) {
                        strSubstring = str2.substring(iIndexOf + 1);
                        break;
                    }
                }
                arrayList.add(strSubstring);
            }
        }
        return (String[]) arrayList.toArray(f62565f);
    }

    private static String c(String str) {
        int iIndexOf;
        if (str == null || str.isEmpty()) {
            return null;
        }
        String[] strArr = new String[5];
        int i10 = 0;
        int i11 = 0;
        while (i10 < 4 && (iIndexOf = str.indexOf(59, i11)) >= 0) {
            strArr[i10] = str.substring(i11, iIndexOf);
            i10++;
            i11 = iIndexOf + 1;
        }
        strArr[i10] = str.substring(i11);
        StringBuilder sb2 = new StringBuilder(100);
        a(strArr, 3, sb2);
        a(strArr, 1, sb2);
        a(strArr, 2, sb2);
        a(strArr, 0, sb2);
        a(strArr, 4, sb2);
        return sb2.toString().trim();
    }

    private static HmsScan.TelPhoneNumber[] c(String[] strArr, String[] strArr2) {
        if (strArr.length != strArr2.length) {
            return new HmsScan.TelPhoneNumber[0];
        }
        HmsScan.TelPhoneNumber[] telPhoneNumberArr = new HmsScan.TelPhoneNumber[strArr.length];
        for (int i10 = 0; i10 < strArr.length; i10++) {
            int i11 = HmsScan.TelPhoneNumber.OTHER_USE_TYPE;
            HmsScan.TelPhoneNumber telPhoneNumber = new HmsScan.TelPhoneNumber(i11, strArr2[i10]);
            String str = strArr[i10];
            if (str != null) {
                if (str.equals("WORK")) {
                    telPhoneNumber.useType = HmsScan.TelPhoneNumber.OFFICE_USE_TYPE;
                } else if (strArr[i10].equals("HOME")) {
                    telPhoneNumber.useType = HmsScan.TelPhoneNumber.RESIDENTIAL_USE_TYPE;
                } else if (strArr[i10].equals("CELL")) {
                    telPhoneNumber.useType = HmsScan.TelPhoneNumber.CELLPHONE_NUMBER_USE_TYPE;
                } else if (strArr[i10].equals("FAX")) {
                    telPhoneNumber.useType = HmsScan.TelPhoneNumber.FAX_USE_TYPE;
                } else {
                    telPhoneNumber.useType = i11;
                }
            }
            telPhoneNumberArr[i10] = telPhoneNumber;
        }
        return telPhoneNumberArr;
    }

    @Override // com.huawei.hms.scankit.p.t6
    public HmsScan b(s6 s6Var) {
        String strA = t6.a(s6Var);
        if (!strA.startsWith("BEGIN:VCARD")) {
            return null;
        }
        String str = strA + "\n";
        String strA2 = a("N", str, true, false);
        if (strA2 == null || strA2.isEmpty() || strA2.split(";").length == 0) {
            return null;
        }
        String strA3 = a("FN", str, true, false);
        if (strA3 == null || strA3.isEmpty()) {
            strA3 = c(strA2);
        }
        String str2 = strA3;
        List<List<String>> listB = b("TEL", str, true, false);
        List<List<String>> listB2 = b("EMAIL", str, true, false);
        List<List<String>> listB3 = b("ADR", str, true, true);
        return new HmsScan(s6Var.k(), t6.a(s6Var.c()), str2, HmsScan.CONTACT_DETAIL_FORM, s6Var.i(), t6.a(s6Var.j()), null, new z6(new HmsScan.ContactDetail(a(strA2, str2), a("TITLE", str, true, false), a("ORG", str, true, true), c(b(listB), a(listB)), b(b(listB2), a(listB2)), a(b(listB3), a(listB3)), a(b("URL", str, true, false)), null)));
    }
}
