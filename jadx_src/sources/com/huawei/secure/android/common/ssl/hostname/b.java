package com.huawei.secure.android.common.ssl.hostname;

import com.huawei.secure.android.common.ssl.util.e;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.SSLException;
import kotlin.text.y;
import org.apache.tools.ant.taskdefs.optional.ccm.g;

/* JADX INFO: loaded from: classes7.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f63024a = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f63025b;

    static {
        String[] strArr = {"ac", g.f134709o, "com", "ed", "edu", "go", "gouv", "gov", "info", "lg", "ne", h5.b.f119111k, "or", "org"};
        f63025b = strArr;
        Arrays.sort(strArr);
    }

    public static final void a(String str, X509Certificate x509Certificate, boolean z10) throws SSLException {
        String[] strArrA = a(x509Certificate);
        String[] strArrB = b(x509Certificate);
        e.a("", "cn is : " + Arrays.toString(strArrA));
        e.a("", "san is : " + Arrays.toString(strArrB));
        a(str, strArrA, strArrB, z10);
    }

    public static final void a(String str, String[] strArr, String[] strArr2, boolean z10) throws SSLException {
        String str2;
        LinkedList linkedList = new LinkedList();
        if (strArr != null && strArr.length > 0 && (str2 = strArr[0]) != null) {
            linkedList.add(str2);
        }
        if (strArr2 != null) {
            for (String str3 : strArr2) {
                if (str3 != null) {
                    linkedList.add(str3);
                }
            }
        }
        if (linkedList.isEmpty()) {
            throw new SSLException("Certificate for <" + str + "> doesn't contain CN or DNS subjectAlt");
        }
        StringBuffer stringBuffer = new StringBuffer();
        String lowerCase = str.trim().toLowerCase(Locale.ENGLISH);
        Iterator it = linkedList.iterator();
        boolean zEquals = false;
        while (it.hasNext()) {
            String lowerCase2 = ((String) it.next()).toLowerCase(Locale.ENGLISH);
            stringBuffer.append(" <");
            stringBuffer.append(lowerCase2);
            stringBuffer.append(y.f128597f);
            if (it.hasNext()) {
                stringBuffer.append(" OR");
            }
            if (lowerCase2.startsWith("*.") && lowerCase2.indexOf(46, 2) != -1 && a(lowerCase2) && !c(str)) {
                boolean zEndsWith = lowerCase.endsWith(lowerCase2.substring(1));
                zEquals = (zEndsWith && z10) ? b(lowerCase) == b(lowerCase2) : zEndsWith;
            } else {
                zEquals = lowerCase.equals(lowerCase2);
            }
            if (zEquals) {
                break;
            }
        }
        if (zEquals) {
            return;
        }
        throw new SSLException("hostname in certificate didn't match: <" + str + "> !=" + ((Object) stringBuffer));
    }

    public static boolean a(String str) {
        int length = str.length();
        if (length < 7 || length > 9) {
            return true;
        }
        int i10 = length - 3;
        if (str.charAt(i10) == '.') {
            return Arrays.binarySearch(f63025b, str.substring(2, i10)) < 0;
        }
        return true;
    }

    public static String[] a(X509Certificate x509Certificate) {
        List<String> listB = new a(x509Certificate.getSubjectX500Principal()).b("cn");
        if (listB.isEmpty()) {
            return null;
        }
        String[] strArr = new String[listB.size()];
        listB.toArray(strArr);
        return strArr;
    }

    public static int b(String str) {
        int i10 = 0;
        for (int i11 = 0; i11 < str.length(); i11++) {
            if (str.charAt(i11) == '.') {
                i10++;
            }
        }
        return i10;
    }

    public static String[] b(X509Certificate x509Certificate) {
        Collection<List<?>> subjectAlternativeNames;
        LinkedList linkedList = new LinkedList();
        try {
            subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
        } catch (CertificateParsingException e10) {
            e.a("", "Error parsing certificate.", e10);
            subjectAlternativeNames = null;
        }
        if (subjectAlternativeNames != null) {
            for (List<?> list : subjectAlternativeNames) {
                if (((Integer) list.get(0)).intValue() == 2) {
                    linkedList.add((String) list.get(1));
                }
            }
        }
        if (linkedList.isEmpty()) {
            return null;
        }
        String[] strArr = new String[linkedList.size()];
        linkedList.toArray(strArr);
        return strArr;
    }

    private static boolean c(String str) {
        return f63024a.matcher(str).matches();
    }
}
