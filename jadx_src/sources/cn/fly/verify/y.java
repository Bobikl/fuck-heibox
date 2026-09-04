package cn.fly.verify;

import android.util.Base64;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes6.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static y f37033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PublicKey f37034b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PublicKey f37035c = null;

    private y() {
        try {
            b();
            if (this.f37035c == null) {
                c();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static y a() {
        if (f37033a == null) {
            f37033a = new y();
        }
        return f37033a;
    }

    private void b() throws Exception {
        try {
            this.f37034b = KeyFactory.getInstance(n5.d.f132016a).generatePublic(new X509EncodedKeySpec(Base64.decode("MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDNFGdEpQ1d8cPqekvvEDQyBGnI\nKwvjX9o3OmnnqWMGbIiFYIpc21QeG7aqizuWdXlgS5M9rstDfHQfG/AaPElJ7Yix\nBCau4hdVwFpRmb9NIuqavDeHKP9BKPZ01Ra5/666NGKBqmkRRer3lBCe6EKNUc2U\n/DZg6U/Q3CTPiORt/wIDAQAB", 0)));
        } catch (NullPointerException e10) {
            e10.printStackTrace();
        }
    }

    private void c() throws Exception {
        try {
            this.f37035c = KeyFactory.getInstance(n5.d.f132016a).generatePublic(new X509EncodedKeySpec(Base64.decode("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAuyqBGJVxu+5Z2ZwItIhl\noxI53CVpYUR3OWAQyAQNcMhDDf3nGsxLLHP8kGWqrpLn1uAIgI+EIAl0sM+i1leD\nFD+sYU2rkUVZgpwO7ly+THBFw/YcZNwS094NBdhzxmCCFbCKHVNzDLirlV9T2q4k\nJhjaEmyCOtSU6+mdjcHhbcbF6lKYx8tfQlpPmyM5suFY138qtEoB4b+q/j8q22MI\naUotg1Av257RuMh97hAwoi5D7HS5LH0piLIN/au/X08rxbXnWNdgQtFtUeCNy3vw\nkO0ykg5qH942X8poQ+a9GgBUeDBpY4GSIv6/qq+zJxiJxpoL0SGKAP3FlcuLr07f\nxwIDAQAB", 0)));
        } catch (NullPointerException unused) {
            throw new Exception("公钥输入流为空");
        }
    }

    public String a(byte[] bArr) {
        if (this.f37034b == null) {
            return "";
        }
        try {
            Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA256AndMGF1Padding");
            cipher.init(1, this.f37034b);
            return ab.a(cipher.doFinal(bArr));
        } catch (Exception unused) {
            return "";
        }
    }
}
