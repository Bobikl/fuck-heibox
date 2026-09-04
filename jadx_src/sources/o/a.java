package o;

import android.text.TextUtils;
import com.tencent.msdk.dns.MSDKDnsResolver;
import java.net.SocketAddress;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import r.d;
import r.e;

/* JADX INFO: compiled from: AesHttpDns.java */
/* JADX INFO: loaded from: classes.dex */
public final class a extends r.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r.b f132121d;

    public a(int i10) {
        super(i10);
        this.f132121d = null;
        this.f132121d = new b();
    }

    @Override // r.a
    public String c(String str, String str2) {
        return b.a.d(str, str2);
    }

    @Override // r.a
    public String d(String str, String str2, e eVar) {
        String strA;
        String strF;
        String str3 = eVar.f138704c;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            strA = "";
        } else {
            try {
                byte[] bArr = new byte[16];
                new SecureRandom().nextBytes(bArr);
                IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
                cipher.init(1, b.a.w(str3), ivParameterSpec);
                byte[] bArrDoFinal = cipher.doFinal(str2.getBytes("utf-8"));
                byte[] bArr2 = new byte[bArrDoFinal.length + 16];
                System.arraycopy(bArr, 0, bArr2, 0, 16);
                System.arraycopy(bArrDoFinal, 0, bArr2, 16, bArrDoFinal.length);
                strA = d.a(bArr2);
            } catch (Exception unused) {
                strA = "";
            }
        }
        int i10 = this.f138686b;
        if (i10 == 1) {
            strF = b.a.f(strA, eVar.f138703b, "dn=%s&ip=%s&clientip=1&ttl=1&id=%s", false);
        } else if (i10 == 2) {
            strF = b.a.f(strA, eVar.f138703b, "dn=%s&ip=%s&clientip=1&ttl=1&id=%s&type=aaaa", false);
        } else {
            if (i10 != 3) {
                throw new IllegalStateException("Unexpected value: " + this.f138686b);
            }
            strF = b.a.f(strA, eVar.f138703b, "dn=%s&ip=%s&clientip=1&ttl=1&id=%s&type=addrs", false);
        }
        return this.f132121d.b(str, strF);
    }

    @Override // r.a
    public SocketAddress e(String str, int i10) {
        return this.f132121d.c(str);
    }

    @Override // r.a
    public String f() {
        return MSDKDnsResolver.AES_HTTP_CHANNEL;
    }

    @Override // r.a
    public String g() {
        return "AesHttpDns(" + this.f138686b + ")";
    }
}
