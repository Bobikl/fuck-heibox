package anet.channel.util;

import android.util.Base64;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static g f30012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Proxy f30013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f30014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f30015d;

    public g(String str, int i10, String str2, String str3) {
        this.f30013b = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(str, i10));
        this.f30014c = str2;
        this.f30015d = str3;
    }

    public static g a() {
        return f30012a;
    }

    public Proxy b() {
        return this.f30013b;
    }

    public String c() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.f30014c);
        sb2.append(":");
        sb2.append(this.f30015d);
        String strEncodeToString = Base64.encodeToString(sb2.toString().getBytes(), 0);
        StringBuilder sb3 = new StringBuilder(64);
        sb3.append("Basic ");
        sb3.append(strEncodeToString);
        return sb3.toString();
    }
}
