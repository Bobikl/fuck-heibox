package com.huawei.secure.android.common.anonymization;

/* JADX INFO: loaded from: classes7.dex */
public class a {
    public static int a(String str, char c10, int i10) {
        int length = str.length() - 1;
        while (length >= 0 && (str.charAt(length) != c10 || (i10 = i10 - 1) > 0)) {
            length--;
        }
        return length;
    }

    public static String a(String str, char c10) {
        if (str == null || str.length() <= 0) {
            return "";
        }
        int length = str.length();
        char[] cArr = new char[length];
        for (int i10 = 0; i10 < length; i10++) {
            cArr[i10] = c10;
        }
        return new String(cArr);
    }

    public static String a(String str, String str2, String str3) {
        if (str == null || str.length() <= 0 || str2.length() <= 0 || str3.length() <= 0) {
            return str;
        }
        char[] charArray = str.toCharArray();
        char[] cArr = new char[str.length()];
        char cCharAt = str3.charAt(str3.length() - 1);
        for (int i10 = 0; i10 < charArray.length; i10++) {
            char c10 = charArray[i10];
            int iLastIndexOf = str2.lastIndexOf(c10);
            if (iLastIndexOf < 0) {
                cArr[i10] = c10;
            } else {
                cArr[i10] = iLastIndexOf >= str3.length() ? cCharAt : str3.charAt(iLastIndexOf);
            }
        }
        return new String(cArr);
    }

    public static String a(String str, String... strArr) {
        if (strArr == null || strArr.length <= 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(strArr[0]);
        for (int i10 = 1; i10 < strArr.length; i10++) {
            if (strArr[i10] != null) {
                sb2.append(str);
                sb2.append(strArr[i10]);
            }
        }
        return sb2.toString();
    }

    public static String a(String[] strArr, int i10) {
        return (strArr == null || strArr.length <= 0 || i10 < 0 || i10 >= strArr.length) ? "" : strArr[i10];
    }

    public static String[] a(String str, int i10) {
        if (str == null) {
            return new String[]{"", ""};
        }
        return (i10 < 0 || i10 > str.length()) ? new String[]{str, ""} : new String[]{str.substring(0, i10), str.substring(i10)};
    }

    public static String[] a(String str, int i10, int i11) {
        String[] strArrA = a(str, i10);
        return b(a(strArrA, 0), a(a(strArrA, 1), i11 - i10));
    }

    public static String[] a(String str, int i10, int i11, int i12) {
        String[] strArrA = a(str, i10);
        return b(a(strArrA, 0), a(a(strArrA, 1), i11 - i10, i12 - i10));
    }

    public static String[] a(String str, int... iArr) {
        if (str == null) {
            return new String[]{""};
        }
        if (str.length() <= 1 || iArr.length <= 0) {
            return new String[]{str};
        }
        if (iArr.length <= 1) {
            return a(str, iArr[0]);
        }
        int i10 = iArr[0];
        int length = iArr.length - 1;
        int[] iArr2 = new int[length];
        int i11 = 0;
        while (i11 < length) {
            int i12 = i11 + 1;
            iArr2[i11] = iArr[i12] - i10;
            i11 = i12;
        }
        String[] strArrA = a(str, i10);
        return b(a(strArrA, 0), a(a(strArrA, 1), iArr2));
    }

    public static String[] a(String[] strArr, String str) {
        return a(strArr, new String[]{str});
    }

    public static String[] a(String[] strArr, String[] strArr2) {
        if (strArr.length <= 0) {
            return strArr2.length <= 0 ? new String[0] : strArr2;
        }
        if (strArr2.length <= 0) {
            return strArr;
        }
        String[] strArr3 = new String[strArr.length + strArr2.length];
        System.arraycopy(strArr, 0, strArr3, 0, strArr.length);
        System.arraycopy(strArr2, 0, strArr3, strArr.length, strArr2.length);
        return strArr3;
    }

    public static String[] b(String str, char c10) {
        if (str == null) {
            return new String[0];
        }
        if (str.length() <= 0) {
            return new String[]{str};
        }
        int i10 = 1;
        for (int i11 = 0; i11 < str.length(); i11++) {
            if (str.charAt(i11) == c10) {
                i10++;
            }
        }
        if (i10 <= 1) {
            return new String[]{str};
        }
        String[] strArr = new String[i10];
        StringBuilder sb2 = new StringBuilder(str.length());
        int i12 = 0;
        for (int i13 = 0; i13 < str.length() && i12 < i10; i13++) {
            char cCharAt = str.charAt(i13);
            if (cCharAt == c10) {
                strArr[i12] = sb2.toString();
                sb2.setLength(0);
                i12++;
            } else {
                sb2.append(cCharAt);
            }
        }
        strArr[i12] = sb2.toString();
        return strArr;
    }

    public static String[] b(String str, String[] strArr) {
        return a(new String[]{str}, strArr);
    }
}
