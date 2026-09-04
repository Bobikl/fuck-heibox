package com.huawei.secure.android.common.ssl.hostname;

import com.huawei.secure.android.common.ssl.util.c;
import com.huawei.secure.android.common.ssl.util.e;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes7.dex */
public class BrowserCompatHostnameVerifier implements HostnameVerifier {
    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        try {
            X509Certificate x509Certificate = (X509Certificate) sSLSession.getPeerCertificates()[0];
            e.c("", "verify: certificate is : " + x509Certificate.getSubjectDN().getName());
            b.a(str, x509Certificate, false);
            c.a();
            return true;
        } catch (SSLException e10) {
            e.b("", "SSLException : " + e10.getMessage());
            return false;
        }
    }
}
