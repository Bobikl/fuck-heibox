package o5;

import android.content.Context;
import android.text.TextUtils;
import com.google.common.primitives.SignedBytes;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Random;
import java.util.regex.Pattern;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static d f132201j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f132203a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f132205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f132206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f132207e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public m5.a f132208f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public m5.a f132209g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object f132200i = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f132202k = ".UTSystemConfig" + File.separator + "Global";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f132204b = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Pattern f132210h = Pattern.compile("[^0-9a-zA-Z=/+]+");

    public d(Context context) {
        this.f132203a = null;
        this.f132205c = null;
        this.f132206d = "xx_utdid_key";
        this.f132207e = "xx_utdid_domain";
        this.f132208f = null;
        this.f132209g = null;
        this.f132203a = context;
        this.f132209g = new m5.a(context, f132202k, "Alvin2", false, true);
        this.f132208f = new m5.a(context, ".DataStorage", "ContextData", false, true);
        this.f132205c = new e();
        this.f132206d = String.format("K_%d", Integer.valueOf(k5.f.a(this.f132206d)));
        this.f132207e = String.format("D_%d", Integer.valueOf(k5.f.a(this.f132207e)));
    }

    public static String b(byte[] bArr) throws Exception {
        byte[] bArr2 = {69, 114, 116, -33, 125, -54, -31, 86, -11, 11, -78, -96, -17, -99, SignedBytes.f59068a, com.google.common.base.a.A, -95, -126, -82, -64, 113, 116, -16, -103, org.apache.tools.tar.c.G, -30, 9, -39, 33, -80, -68, -78, -117, org.apache.tools.tar.c.K, com.google.common.base.a.H, -122, SignedBytes.f59068a, -104, 74, -49, 106, 85, -38, -93};
        Mac mac = Mac.getInstance("HmacSHA1");
        mac.init(new SecretKeySpec(k5.e.b(bArr2), mac.getAlgorithm()));
        return k5.b.e(mac.doFinal(bArr), 2);
    }

    public static d c(Context context) {
        if (context != null && f132201j == null) {
            synchronized (f132200i) {
                if (f132201j == null) {
                    d dVar = new d(context);
                    f132201j = dVar;
                    dVar.i();
                }
            }
        }
        return f132201j;
    }

    private boolean d(String str) {
        if (str != null) {
            if (str.endsWith("\n")) {
                str = str.substring(0, str.length() - 1);
            }
            if (24 == str.length() && !this.f132210h.matcher(str).find()) {
                return true;
            }
        }
        return false;
    }

    private void f(String str) {
        m5.a aVar;
        if (d(str)) {
            if (str.endsWith("\n")) {
                str = str.substring(0, str.length() - 1);
            }
            if (str.length() != 24 || (aVar = this.f132209g) == null) {
                return;
            }
            aVar.b("UTDID2", str);
            this.f132209g.c();
        }
    }

    private void h(String str) {
        m5.a aVar;
        if (str == null || (aVar = this.f132208f) == null || str.equals(aVar.a(this.f132206d))) {
            return;
        }
        this.f132208f.b(this.f132206d, str);
        this.f132208f.c();
    }

    private void i() {
        m5.a aVar = this.f132209g;
        if (aVar != null) {
            if (k5.f.b(aVar.a("UTDID2"))) {
                String strA = this.f132209g.a("UTDID");
                if (!k5.f.b(strA)) {
                    f(strA);
                }
            }
            boolean z10 = false;
            boolean z11 = true;
            if (!k5.f.b(this.f132209g.a("DID"))) {
                this.f132209g.e("DID");
                z10 = true;
            }
            if (!k5.f.b(this.f132209g.a("EI"))) {
                this.f132209g.e("EI");
                z10 = true;
            }
            if (k5.f.b(this.f132209g.a("SI"))) {
                z11 = z10;
            } else {
                this.f132209g.e("SI");
            }
            if (z11) {
                this.f132209g.c();
            }
        }
    }

    private byte[] j() throws Exception {
        String strB;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        int iNextInt = new Random().nextInt();
        byte[] bArrA = k5.c.a(iCurrentTimeMillis);
        byte[] bArrA2 = k5.c.a(iNextInt);
        byteArrayOutputStream.write(bArrA, 0, 4);
        byteArrayOutputStream.write(bArrA2, 0, 4);
        byteArrayOutputStream.write(3);
        byteArrayOutputStream.write(0);
        try {
            strB = k5.d.b(this.f132203a);
        } catch (Exception unused) {
            strB = "" + new Random().nextInt();
        }
        byteArrayOutputStream.write(k5.c.a(k5.f.a(strB)), 0, 4);
        byteArrayOutputStream.write(k5.c.a(k5.f.a(b(byteArrayOutputStream.toByteArray()))));
        return byteArrayOutputStream.toByteArray();
    }

    private String k() {
        m5.a aVar = this.f132209g;
        if (aVar == null) {
            return null;
        }
        String strA = aVar.a("UTDID2");
        if (k5.f.b(strA) || this.f132205c.a(strA) == null) {
            return null;
        }
        return strA;
    }

    public synchronized String a() {
        try {
            String strG = g();
            this.f132204b = strG;
            if (!TextUtils.isEmpty(strG)) {
                return this.f132204b;
            }
            try {
                byte[] bArrJ = j();
                if (bArrJ != null) {
                    String strE = k5.b.e(bArrJ, 2);
                    this.f132204b = strE;
                    f(strE);
                    String strB = this.f132205c.b(bArrJ);
                    if (strB != null) {
                        h(strB);
                    }
                    return this.f132204b;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized String e() {
        String str = this.f132204b;
        if (str != null) {
            return str;
        }
        return a();
    }

    public synchronized String g() {
        String strK = k();
        if (d(strK)) {
            h(this.f132205c.a(strK));
            this.f132204b = strK;
            return strK;
        }
        String strA = this.f132208f.a(this.f132206d);
        if (!k5.f.b(strA)) {
            String strA2 = new f().a(strA);
            if (!d(strA2)) {
                strA2 = this.f132205c.c(strA);
            }
            if (d(strA2) && !k5.f.b(strA2)) {
                this.f132204b = strA2;
                f(strA2);
                return this.f132204b;
            }
        }
        return null;
    }
}
