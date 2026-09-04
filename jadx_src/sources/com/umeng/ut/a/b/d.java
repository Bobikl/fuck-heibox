package com.umeng.ut.a.b;

import android.text.TextUtils;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes4.dex */
public class d implements HostnameVerifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f106420a;

    public d(String str) {
        this.f106420a = str;
    }

    public boolean equals(Object obj) {
        if (TextUtils.isEmpty(this.f106420a) || !(obj instanceof d)) {
            return false;
        }
        String str = ((d) obj).f106420a;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.f106420a.equals(str);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        return HttpsURLConnection.getDefaultHostnameVerifier().verify(this.f106420a, sSLSession);
    }
}
