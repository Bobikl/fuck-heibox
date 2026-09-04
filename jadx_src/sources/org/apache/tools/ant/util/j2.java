package org.apache.tools.ant.util;

import com.tencent.qcloud.core.util.IOUtils;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Arrays;
import java.util.Collection;
import java.util.Vector;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: StringUtils.java */
/* JADX INFO: loaded from: classes5.dex */
public final class j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f136848a = 1024;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f136849b = 1048576;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f136850c = 1073741824;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f136851d = 1099511627776L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f136852e = 1125899906842624L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final String f136853f = System.lineSeparator();

    private j2() {
    }

    public static boolean a(StringBuffer stringBuffer, String str) {
        if (str.length() > stringBuffer.length()) {
            return false;
        }
        int length = stringBuffer.length() - 1;
        for (int length2 = str.length() - 1; length2 >= 0; length2--) {
            if (stringBuffer.charAt(length) != str.charAt(length2)) {
                return false;
            }
            length--;
        }
        return true;
    }

    public static String b(Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter((Writer) stringWriter, true);
        th2.printStackTrace(printWriter);
        printWriter.flush();
        printWriter.close();
        return stringWriter.toString();
    }

    public static String c(Collection<?> collection, CharSequence charSequence) {
        return collection == null ? "" : (String) collection.stream().map(new l()).collect(e(charSequence));
    }

    public static String d(Object[] objArr, CharSequence charSequence) {
        return objArr == null ? "" : c(Arrays.asList(objArr), charSequence);
    }

    private static Collector<CharSequence, ?, String> e(CharSequence charSequence) {
        return charSequence == null ? Collectors.joining() : Collectors.joining(charSequence);
    }

    public static Vector<String> f(String str) {
        return l(str, 10);
    }

    public static long g(String str) throws Exception {
        long j10;
        char cCharAt = str.charAt(0);
        int i10 = 1;
        long j11 = 1;
        if (cCharAt == '+') {
            str = str.substring(1);
        } else if (cCharAt == '-') {
            j11 = -1;
            str = str.substring(1);
        }
        char cCharAt2 = str.charAt(str.length() - 1);
        if (!Character.isDigit(cCharAt2)) {
            if (cCharAt2 == 'G') {
                j10 = 1073741824;
            } else if (cCharAt2 == 'K') {
                j10 = 1024;
            } else if (cCharAt2 == 'M') {
                j10 = 1048576;
            } else if (cCharAt2 != 'P') {
                if (cCharAt2 != 'T') {
                    i10 = 0;
                } else {
                    j10 = f136851d;
                }
                str = str.substring(0, str.length() - i10);
            } else {
                j10 = f136852e;
            }
            j11 *= j10;
            str = str.substring(0, str.length() - i10);
        }
        try {
            return j11 * Long.parseLong(str);
        } catch (NumberFormatException e10) {
            throw new BuildException("Failed to parse \"" + str + "\"", e10);
        }
    }

    public static String h(String str, String str2) {
        return str.startsWith(str2) ? str.substring(str2.length()) : str;
    }

    public static String i(String str, String str2) {
        return str.endsWith(str2) ? str.substring(0, str.length() - str2.length()) : str;
    }

    @Deprecated
    public static String j(String str, String str2, String str3) {
        return str.replace(str2, str3);
    }

    public static String k(String str) {
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = false;
        for (char c10 : str.toCharArray()) {
            if (z10) {
                if (c10 == '\\') {
                    sb2.append(IOUtils.DIR_SEPARATOR_WINDOWS);
                } else if (c10 == 'f') {
                    sb2.append('\f');
                } else if (c10 != 'n') {
                    switch (c10) {
                        case 'r':
                            sb2.append('\r');
                            break;
                        case 's':
                            sb2.append(" \t\n\r\f");
                            break;
                        case 't':
                            sb2.append('\t');
                            break;
                        default:
                            sb2.append(c10);
                            break;
                    }
                } else {
                    sb2.append('\n');
                }
                z10 = false;
            } else if (c10 == '\\') {
                z10 = true;
            } else {
                sb2.append(c10);
            }
        }
        return sb2.toString();
    }

    public static Vector<String> l(String str, int i10) {
        Vector<String> vector = new Vector<>();
        int i11 = 0;
        while (true) {
            int iIndexOf = str.indexOf(i10, i11);
            if (iIndexOf == -1) {
                vector.addElement(str.substring(i11));
                return vector;
            }
            vector.addElement(str.substring(i11, iIndexOf));
            i11 = iIndexOf + 1;
        }
    }

    public static String m(String str) {
        if (str == null) {
            return null;
        }
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return null;
        }
        return strTrim;
    }
}
