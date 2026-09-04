package p;

import android.text.TextUtils;
import com.tencent.msdk.dns.MSDKDnsResolver;
import java.net.SocketAddress;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import r.d;
import r.e;

/* JADX INFO: compiled from: DesHttpDns.java */
/* JADX INFO: loaded from: classes.dex */
public final class a extends r.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r.b f138084d;

    public a(int i10) {
        super(i10);
        this.f138084d = null;
        this.f138084d = new b();
    }

    @Override // r.a
    public String c(String str, String str2) {
        return b.a.v(str, str2);
    }

    @Override // r.a
    public String d(String str, String str2, e eVar) {
        String strA;
        String strF;
        Boolean boolValueOf = Boolean.valueOf(Arrays.asList(a.b.f1149a).contains(str2));
        String str3 = eVar.f138704c;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            strA = "";
        } else {
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(str3.getBytes("utf-8"), "DES");
                Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
                cipher.init(1, secretKeySpec);
                strA = d.a(cipher.doFinal(str2.getBytes()));
            } catch (Exception unused) {
                strA = "";
            }
        }
        int i10 = this.f138686b;
        if (i10 == 1) {
            strF = b.a.f(strA, eVar.f138703b, "dn=%s&ip=%s&clientip=1&ttl=1&id=%s", boolValueOf.booleanValue());
        } else if (i10 == 2) {
            strF = b.a.f(strA, eVar.f138703b, "dn=%s&ip=%s&clientip=1&ttl=1&id=%s&type=aaaa", boolValueOf.booleanValue());
        } else {
            if (i10 != 3) {
                throw new IllegalStateException("Unexpected value: " + this.f138686b);
            }
            strF = b.a.f(strA, eVar.f138703b, "dn=%s&ip=%s&clientip=1&ttl=1&id=%s&type=addrs", boolValueOf.booleanValue());
        }
        return this.f138084d.b(str, strF);
    }

    @Override // r.a
    public SocketAddress e(String str, int i10) {
        return this.f138084d.c(str);
    }

    @Override // r.a
    public String f() {
        return MSDKDnsResolver.DES_HTTP_CHANNEL;
    }

    @Override // r.a
    public String g() {
        return "DesHttp(" + this.f138686b + ")";
    }
}
