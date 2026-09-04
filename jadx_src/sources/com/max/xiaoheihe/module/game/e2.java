package com.max.xiaoheihe.module.game;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* JADX INFO: compiled from: steamOkHostnameVerifier.java */
/* JADX INFO: loaded from: classes11.dex */
public class e2 implements HostnameVerifier {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f87392b = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f87393c = 2;
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f87394d = 7;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f87395a;

    public e2() {
        this.f87395a = "steamcommunity.com";
    }

    public e2(String str) {
        this.f87395a = str;
    }

    public static List<String> a(X509Certificate x509Certificate) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{x509Certificate}, null, changeQuickRedirect, true, 38389, new Class[]{X509Certificate.class}, List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        List<String> listC = c(x509Certificate, 7);
        List<String> listC2 = c(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(listC.size() + listC2.size());
        arrayList.addAll(listC);
        arrayList.addAll(listC2);
        return arrayList;
    }

    private static List<String> c(X509Certificate x509Certificate, int i10) {
        Integer num;
        String str;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{x509Certificate, new Integer(i10)}, null, changeQuickRedirect, true, 38390, new Class[]{X509Certificate.class, Integer.TYPE}, List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i10 && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    private boolean f(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 38386, new Class[]{String.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : f87392b.matcher(str).matches();
    }

    private boolean h(String str, X509Certificate x509Certificate) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, x509Certificate}, this, changeQuickRedirect, false, 38388, new Class[]{String.class, X509Certificate.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        String lowerCase = str.toLowerCase(Locale.US);
        Iterator<String> it = c(x509Certificate, 2).iterator();
        while (it.hasNext()) {
            if (g(lowerCase, it.next())) {
                return true;
            }
        }
        return false;
    }

    private boolean i(String str, X509Certificate x509Certificate) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, x509Certificate}, this, changeQuickRedirect, false, 38387, new Class[]{String.class, X509Certificate.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        List<String> listC = c(x509Certificate, 7);
        int size = listC.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (str.equalsIgnoreCase(listC.get(i10))) {
                return true;
            }
        }
        return false;
    }

    public String b() {
        return this.f87395a;
    }

    public void d(String str) {
        this.f87395a = str;
    }

    public boolean e(String str, X509Certificate x509Certificate) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, x509Certificate}, this, changeQuickRedirect, false, 38385, new Class[]{String.class, X509Certificate.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return f(str) ? i(str, x509Certificate) : h(str, x509Certificate);
    }

    public boolean g(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 38391, new Class[]{String.class, String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (str != null && str.length() != 0 && !str.startsWith(".") && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
            if (!str.endsWith(".")) {
                str = str + lg.a.f131414g;
            }
            if (!str2.endsWith(".")) {
                str2 = str2 + lg.a.f131414g;
            }
            String lowerCase = str2.toLowerCase(Locale.US);
            if (!lowerCase.contains(androidx.webkit.b.f28327e)) {
                return str.equals(lowerCase);
            }
            if (!lowerCase.startsWith("*.") || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                return false;
            }
            String strSubstring = lowerCase.substring(1);
            if (!str.endsWith(strSubstring)) {
                return false;
            }
            int length = str.length() - strSubstring.length();
            return length <= 0 || str.lastIndexOf(46, length - 1) == -1;
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, sSLSession}, this, changeQuickRedirect, false, 38384, new Class[]{String.class, SSLSession.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (!com.max.xiaoheihe.a.f76429f.equals(com.max.xiaoheihe.utils.d.t0())) {
            return true;
        }
        try {
            return e(this.f87395a, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}
