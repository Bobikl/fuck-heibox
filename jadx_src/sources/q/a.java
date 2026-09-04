package q;

import com.tencent.msdk.dns.MSDKDnsResolver;
import java.net.SocketAddress;
import r.e;

/* JADX INFO: compiled from: HttpsDns.java */
/* JADX INFO: loaded from: classes.dex */
public final class a extends r.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r.b f138526d;

    public a(int i10) {
        super(i10);
        this.f138526d = null;
        this.f138526d = new b();
    }

    @Override // r.a
    public String c(String str, String str2) {
        return str;
    }

    @Override // r.a
    public String d(String str, String str2, e eVar) {
        String strE;
        int i10 = this.f138686b;
        if (i10 == 1) {
            strE = b.a.e(str2, eVar.f138703b, eVar.f138705d, "dn=%s&ip=%s&clientip=1&ttl=1&id=%s&token=%s");
        } else if (i10 == 2) {
            strE = b.a.e(str2, eVar.f138703b, eVar.f138705d, "dn=%s&ip=%s&clientip=1&ttl=1&id=%s&token=%s&type=aaaa");
        } else {
            if (i10 != 3) {
                throw new IllegalStateException("Unexpected value: " + this.f138686b);
            }
            strE = b.a.e(str2, eVar.f138703b, eVar.f138705d, "dn=%s&ip=%s&clientip=1&ttl=1&id=%s&token=%s&type=addrs");
        }
        return this.f138526d.b(str, strE);
    }

    @Override // r.a
    public SocketAddress e(String str, int i10) {
        return this.f138526d.c(str);
    }

    @Override // r.a
    public String f() {
        return MSDKDnsResolver.HTTPS_CHANNEL;
    }

    @Override // r.a
    public String g() {
        return "HttpsDns(" + this.f138686b + ")";
    }
}
