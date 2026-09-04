package okhttp3.internal.tls;

import androidx.webkit.b;
import com.max.xiaoheihe.module.account.AliVerifyDialogActivity;
import com.umeng.analytics.pro.d;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.u;
import lg.a;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import org.apache.tools.ant.types.selectors.m;

/* JADX INFO: compiled from: OkHostnameVerifier.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u001c\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\bH\u0002J\u0018\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lokhttp3/internal/tls/OkHostnameVerifier;", "Ljavax/net/ssl/HostnameVerifier;", "()V", "ALT_DNS_NAME", "", "ALT_IPA_NAME", "allSubjectAltNames", "", "", "certificate", "Ljava/security/cert/X509Certificate;", "getSubjectAltNames", "type", AliVerifyDialogActivity.f77461k, "", "host", d.aw, "Ljavax/net/ssl/SSLSession;", "verifyHostname", "hostname", m.f136546u, "verifyIpAddress", "ipAddress", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class OkHostnameVerifier implements HostnameVerifier {
    private static final int ALT_DNS_NAME = 2;
    private static final int ALT_IPA_NAME = 7;
    public static final OkHostnameVerifier INSTANCE = new OkHostnameVerifier();

    private OkHostnameVerifier() {
    }

    private final List<String> getSubjectAltNames(X509Certificate certificate, int type) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return CollectionsKt__CollectionsKt.E();
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && !(!f0.g(list.get(0), Integer.valueOf(type))) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return CollectionsKt__CollectionsKt.E();
        }
    }

    private final boolean verifyHostname(String hostname, String pattern) {
        if (!(hostname == null || hostname.length() == 0) && !u.v2(hostname, ".", false, 2, null) && !u.K1(hostname, "..", false, 2, null)) {
            if (!(pattern == null || pattern.length() == 0) && !u.v2(pattern, ".", false, 2, null) && !u.K1(pattern, "..", false, 2, null)) {
                if (!u.K1(hostname, ".", false, 2, null)) {
                    hostname = hostname + ".";
                }
                String str = hostname;
                if (!u.K1(pattern, ".", false, 2, null)) {
                    pattern = pattern + ".";
                }
                Locale locale = Locale.US;
                f0.o(locale, "Locale.US");
                if (pattern == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                String lowerCase = pattern.toLowerCase(locale);
                f0.o(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                if (!StringsKt__StringsKt.W2(lowerCase, b.f28327e, false, 2, null)) {
                    return f0.g(str, lowerCase);
                }
                if (!u.v2(lowerCase, "*.", false, 2, null) || StringsKt__StringsKt.r3(lowerCase, '*', 1, false, 4, null) != -1 || str.length() < lowerCase.length() || f0.g("*.", lowerCase)) {
                    return false;
                }
                String strSubstring = lowerCase.substring(1);
                f0.o(strSubstring, "(this as java.lang.String).substring(startIndex)");
                if (!u.K1(str, strSubstring, false, 2, null)) {
                    return false;
                }
                int length = str.length() - strSubstring.length();
                return length <= 0 || StringsKt__StringsKt.F3(str, a.f131414g, length + (-1), false, 4, null) == -1;
            }
        }
        return false;
    }

    private final boolean verifyHostname(String hostname, X509Certificate certificate) {
        Locale locale = Locale.US;
        f0.o(locale, "Locale.US");
        if (hostname == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String lowerCase = hostname.toLowerCase(locale);
        f0.o(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        List<String> subjectAltNames = getSubjectAltNames(certificate, 2);
        if ((subjectAltNames instanceof Collection) && subjectAltNames.isEmpty()) {
            return false;
        }
        Iterator<T> it = subjectAltNames.iterator();
        while (it.hasNext()) {
            if (INSTANCE.verifyHostname(lowerCase, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private final boolean verifyIpAddress(String ipAddress, X509Certificate certificate) {
        String canonicalHost = HostnamesKt.toCanonicalHost(ipAddress);
        List<String> subjectAltNames = getSubjectAltNames(certificate, 7);
        if ((subjectAltNames instanceof Collection) && subjectAltNames.isEmpty()) {
            return false;
        }
        Iterator<T> it = subjectAltNames.iterator();
        while (it.hasNext()) {
            if (f0.g(canonicalHost, HostnamesKt.toCanonicalHost((String) it.next()))) {
                return true;
            }
        }
        return false;
    }

    @dl.d
    public final List<String> allSubjectAltNames(@dl.d X509Certificate certificate) {
        f0.p(certificate, "certificate");
        return CollectionsKt___CollectionsKt.y4(getSubjectAltNames(certificate, 7), getSubjectAltNames(certificate, 2));
    }

    public final boolean verify(@dl.d String host, @dl.d X509Certificate certificate) {
        f0.p(host, "host");
        f0.p(certificate, "certificate");
        return Util.canParseAsIpAddress(host) ? verifyIpAddress(host, certificate) : verifyHostname(host, certificate);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(@dl.d String host, @dl.d SSLSession session) {
        f0.p(host, "host");
        f0.p(session, "session");
        try {
            Certificate certificate = session.getPeerCertificates()[0];
            if (certificate != null) {
                return verify(host, (X509Certificate) certificate);
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
        } catch (SSLException unused) {
            return false;
        }
    }
}
