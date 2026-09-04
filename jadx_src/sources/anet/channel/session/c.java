package anet.channel.session;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public final class c implements HostnameVerifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f29834a;

    c(String str) {
        this.f29834a = str;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        return HttpsURLConnection.getDefaultHostnameVerifier().verify(this.f29834a, sSLSession);
    }
}
