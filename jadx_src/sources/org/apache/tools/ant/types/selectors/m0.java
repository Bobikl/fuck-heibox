package org.apache.tools.ant.types.selectors;

import java.io.File;
import java.util.StringTokenizer;
import java.util.Vector;
import org.apache.tools.ant.types.s1;

/* JADX INFO: compiled from: SelectorUtils.java */
/* JADX INFO: loaded from: classes5.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f136554a = "**";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final m0 f136555b = new m0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final org.apache.tools.ant.util.j0 f136556c = org.apache.tools.ant.util.j0.O();

    private m0() {
    }

    private static boolean a(char[] cArr, int i10, int i11) {
        while (i10 <= i11) {
            if (cArr[i10] != '*') {
                return false;
            }
            i10++;
        }
        return true;
    }

    private static boolean b(boolean z10, char c10, char c11) {
        if (z10) {
            if (c10 != c11) {
                return true;
            }
        } else if (Character.toUpperCase(c10) != Character.toUpperCase(c11)) {
            return true;
        }
        return false;
    }

    public static m0 c() {
        return f136555b;
    }

    public static boolean d(String str) {
        return str.contains(androidx.webkit.b.f28327e) || str.contains("?");
    }

    public static boolean e(File file, File file2, int i10) {
        return file.exists() && (!file2.exists() || file.lastModified() - ((long) i10) > file2.lastModified());
    }

    public static boolean f(s1 s1Var, s1 s1Var2, int i10) {
        return g(s1Var, s1Var2, i10);
    }

    public static boolean g(s1 s1Var, s1 s1Var2, long j10) {
        long jI2 = s1Var.i2();
        long jI3 = s1Var2.i2();
        return s1Var.p2() && (jI2 == 0 || jI3 == 0 || jI2 - j10 > jI3);
    }

    public static boolean h(String str, String str2) {
        return i(str, str2, true);
    }

    public static boolean i(String str, String str2, boolean z10) {
        char c10;
        boolean z11;
        int i10;
        char[] charArray = str.toCharArray();
        char[] charArray2 = str2.toCharArray();
        int i11 = 1;
        int length = charArray.length - 1;
        int length2 = charArray2.length - 1;
        int length3 = charArray.length;
        int i12 = 0;
        while (true) {
            c10 = '*';
            if (i12 >= length3) {
                z11 = false;
                break;
            }
            if (charArray[i12] == '*') {
                z11 = true;
                break;
            }
            i12++;
        }
        char c11 = '?';
        if (!z11) {
            if (length != length2) {
                return false;
            }
            for (int i13 = 0; i13 <= length; i13++) {
                char c12 = charArray[i13];
                if (c12 != '?' && b(z10, c12, charArray2[i13])) {
                    return false;
                }
            }
            return true;
        }
        if (length == 0) {
            return true;
        }
        int i14 = 0;
        int i15 = 0;
        while (true) {
            char c13 = charArray[i14];
            if (c13 == '*' || i15 > length2) {
                if (i15 > length2) {
                    return a(charArray, i14, length);
                }
                while (true) {
                    char c14 = charArray[length];
                    if (c14 == '*' || i15 > length2) {
                        break;
                    }
                    if (c14 != '?' && b(z10, c14, charArray2[length2])) {
                        return false;
                    }
                    length--;
                    length2--;
                }
                if (i15 > length2) {
                    return a(charArray, i14, length);
                }
                while (i14 != length && i15 <= length2) {
                    int i16 = i14 + 1;
                    int i17 = i16;
                    while (true) {
                        if (i17 > length) {
                            i17 = -1;
                            break;
                        }
                        if (charArray[i17] == c10) {
                            break;
                        }
                        i17++;
                    }
                    if (i17 == i16) {
                        i14 = i16;
                    } else {
                        int i18 = (i17 - i14) - i11;
                        int i19 = (length2 - i15) + i11;
                        int i20 = 0;
                        while (true) {
                            if (i20 > i19 - i18) {
                                i10 = -1;
                                break;
                            }
                            int i21 = 0;
                            while (true) {
                                if (i21 >= i18) {
                                    i10 = i15 + i20;
                                    break;
                                }
                                char c15 = charArray[i14 + i21 + 1];
                                if (c15 == c11 || !b(z10, c15, charArray2[i15 + i20 + i21])) {
                                    i21++;
                                    c11 = '?';
                                }
                            }
                            i20++;
                            c11 = '?';
                        }
                        if (i10 == -1) {
                            return false;
                        }
                        i15 = i10 + i18;
                        i14 = i17;
                        i11 = 1;
                        c11 = '?';
                        c10 = '*';
                    }
                }
                return a(charArray, i14, length);
            }
            if (c13 != '?' && b(z10, c13, charArray2[i15])) {
                return false;
            }
            i14++;
            i15++;
        }
    }

    public static boolean j(String str, String str2) {
        return l(t(str), t(str2), true);
    }

    public static boolean k(String str, String str2, boolean z10) {
        return l(t(str), t(str2), z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean l(String[] strArr, String[] strArr2, boolean z10) {
        int i10;
        int i11 = 1;
        int length = strArr.length - 1;
        int length2 = strArr2.length - 1;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i13 <= length && i14 <= length2) {
            String str = strArr[i13];
            if (str.equals(f136554a)) {
                break;
            }
            if (!i(str, strArr2[i14], z10)) {
                return false;
            }
            i13++;
            i14++;
        }
        if (i14 > length2) {
            while (i13 <= length) {
                if (!strArr[i13].equals(f136554a)) {
                    return false;
                }
                i13++;
            }
            return true;
        }
        if (i13 > length) {
            return false;
        }
        while (i13 <= length && i14 <= length2) {
            String str2 = strArr[length];
            if (str2.equals(f136554a)) {
                break;
            }
            if (!i(str2, strArr2[length2], z10)) {
                return false;
            }
            length--;
            length2--;
        }
        if (i14 > length2) {
            while (i13 <= length) {
                if (!strArr[i13].equals(f136554a)) {
                    return false;
                }
                i13++;
            }
            return true;
        }
        while (i13 != length && i14 <= length2) {
            int i15 = i13 + 1;
            int i16 = i15;
            while (true) {
                if (i16 > length) {
                    i16 = -1;
                    break;
                }
                if (strArr[i16].equals(f136554a)) {
                    break;
                }
                i16++;
            }
            if (i16 == i15) {
                i13 = i15;
            } else {
                int i17 = (i16 - i13) - i11;
                int i18 = (length2 - i14) + i11;
                int i19 = i12;
                while (true) {
                    if (i19 > i18 - i17) {
                        i10 = -1;
                        break;
                    }
                    int i20 = i12;
                    while (true) {
                        if (i20 >= i17) {
                            i10 = i14 + i19;
                            break;
                        }
                        if (!i(strArr[i13 + i20 + 1], strArr2[i14 + i19 + i20], z10)) {
                            break;
                        }
                        i20++;
                    }
                    i19++;
                    i12 = 0;
                }
                if (i10 == -1) {
                    return false;
                }
                i14 = i10 + i17;
                i12 = 0;
                i13 = i16;
                i11 = 1;
            }
        }
        boolean z11 = i12;
        while (i13 <= length) {
            if (!f136554a.equals(strArr[i13])) {
                return z11;
            }
            i13++;
        }
        return true;
    }

    public static boolean m(String str, String str2) {
        return n(str, str2, true);
    }

    public static boolean n(String str, String str2, boolean z10) {
        String str3 = File.separator;
        if (str2.startsWith(str3) != str.startsWith(str3)) {
            return false;
        }
        return o(t(str), t(str2), z10);
    }

    static boolean o(String[] strArr, String[] strArr2, boolean z10) {
        int length = strArr.length - 1;
        int length2 = strArr2.length - 1;
        int i10 = 0;
        int i11 = 0;
        while (i10 <= length && i11 <= length2) {
            String str = strArr[i10];
            if (str.equals(f136554a)) {
                break;
            }
            if (!i(str, strArr2[i11], z10)) {
                return false;
            }
            i10++;
            i11++;
        }
        return i11 > length2 || i10 <= length;
    }

    public static String p(String str) {
        StringBuilder sb2 = new StringBuilder();
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str);
            while (stringTokenizer.hasMoreTokens()) {
                sb2.append(stringTokenizer.nextToken());
            }
        }
        return sb2.toString();
    }

    public static String q(String str) {
        return new r0(str).g().toString();
    }

    public static Vector<String> r(String str) {
        return s(str, File.separator);
    }

    public static Vector<String> s(String str, String str2) {
        Vector<String> vector = new Vector<>();
        if (org.apache.tools.ant.util.j0.V(str)) {
            String[] strArrI = f136556c.I(str);
            vector.add(strArrI[0]);
            str = strArrI[1];
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, str2);
        while (stringTokenizer.hasMoreTokens()) {
            vector.addElement(stringTokenizer.nextToken());
        }
        return vector;
    }

    static String[] t(String str) {
        String str2;
        int i10 = 1;
        if (org.apache.tools.ant.util.j0.V(str)) {
            String[] strArrI = f136556c.I(str);
            str2 = strArrI[0];
            str = strArrI[1];
        } else {
            str2 = null;
        }
        char c10 = File.separatorChar;
        int length = str.length();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            if (str.charAt(i13) == c10) {
                if (i13 != i11) {
                    i12++;
                }
                i11 = i13 + 1;
            }
        }
        if (length != i11) {
            i12++;
        }
        String[] strArr = new String[i12 + (str2 == null ? 0 : 1)];
        if (str2 != null) {
            strArr[0] = str2;
        } else {
            i10 = 0;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < length; i15++) {
            if (str.charAt(i15) == c10) {
                if (i15 != i14) {
                    strArr[i10] = str.substring(i14, i15);
                    i10++;
                }
                i14 = i15 + 1;
            }
        }
        if (length != i14) {
            strArr[i10] = str.substring(i14);
        }
        return strArr;
    }
}
