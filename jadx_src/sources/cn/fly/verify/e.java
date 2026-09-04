package cn.fly.verify;

import android.os.SystemClock;
import cn.fly.verify.common.exception.VerifyErr;
import cn.fly.verify.common.exception.VerifyException;
import com.max.xiaoheihe.module.account.AliVerifyDialogActivity;
import com.xiaomi.mipush.sdk.Constants;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g f36225b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f36227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Integer f36228e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f36229f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Integer f36230g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f36224a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f36226c = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: cn.fly.verify.e$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f36231a;

        static {
            int[] iArr = new int[g.values().length];
            f36231a = iArr;
            try {
                iArr[g.PREVERIFY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36231a[g.VERIFY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36231a[g.INIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36231a[g.AUTHPAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public e(g gVar) {
        this.f36225b = gVar;
        if (gVar == g.INIT) {
            ai.a().b(this.f36226c);
        } else if (gVar == g.PREVERIFY) {
            ai.a().a(this.f36226c);
        }
    }

    private void c(c cVar) {
        d.b(cVar);
    }

    private VerifyErr d(String str) {
        VerifyErr verifyErr = VerifyErr.C_PREVERIFY_CATCH;
        if ("CMCC".equals(str)) {
            return "preVerify".equals(g()) ? VerifyErr.C_ONE_KEY_OBTAIN_CM_OPERATOR_ACCESS_CODE_ERR : VerifyErr.C_ONE_KEY_OBTAIN_CM_OPERATOR_ACCESS_TOKEN_ERR;
        }
        if ("CTCC".equals(str)) {
            return "preVerify".equals(g()) ? VerifyErr.C_ONE_KEY_OBTAIN_CT_OPERATOR_ACCESS_CODE_ERR : VerifyErr.C_ONE_KEY_OBTAIN_CT_OPERATOR_ACCESS_TOKEN_ERR;
        }
        if ("CUCC".equals(str)) {
            return "preVerify".equals(g()) ? VerifyErr.C_ONE_KEY_OBTAIN_CU_OPERATOR_ACCESS_CODE_ERR : VerifyErr.C_ONE_KEY_OBTAIN_CU_OPERATOR_ACCESS_TOKEN_ERR;
        }
        if ("CUXW".equals(str)) {
            return "preVerify".equals(g()) ? VerifyErr.C_ONE_KEY_OBTAIN_XW_OPERATOR_ACCESS_CODE_ERR : VerifyErr.C_ONE_KEY_OBTAIN_XW_OPERATOR_ACCESS_TOKEN_ERR;
        }
        return verifyErr;
    }

    private String g() {
        int i10 = AnonymousClass1.f36231a[this.f36225b.ordinal()];
        if (i10 == 1) {
            return "preVerify";
        }
        if (i10 == 2) {
            return AliVerifyDialogActivity.f77461k;
        }
        if (i10 == 3) {
            return lg.a.f131415h;
        }
        if (i10 != 4) {
            return null;
        }
        return "authPageOpend";
    }

    public c a(String str, int i10, String str2, int i11, String str3) {
        c cVarB = b(str);
        cVarB.b(true);
        cVarB.a(i10);
        cVarB.c(str2);
        cVarB.b(i11);
        cVarB.d(str3);
        return cVarB;
    }

    public c a(String str, String str2, int i10, String str3) {
        c cVarB = b(g());
        cVarB.e(str2);
        cVarB.f(str);
        cVarB.b(true);
        VerifyErr verifyErrD = d(str);
        if (verifyErrD != null) {
            cVarB.a(verifyErrD.getCode());
            cVarB.c(verifyErrD.getMessage());
        }
        cVarB.b(i10);
        cVarB.d(str3);
        return cVarB;
    }

    public VerifyErr a(String str, String str2, VerifyException verifyException) {
        a(a(str, str2, verifyException.getCode(), verifyException.getMessage()));
        c();
        return d(str);
    }

    public String a() {
        return this.f36226c;
    }

    public void a(c cVar) {
        if (cVar != null) {
            c(cVar);
        }
    }

    public void a(VerifyException verifyException, VerifyException verifyException2) {
        a(a(g(), verifyException.getCode(), verifyException.getMessage(), verifyException2.getCode(), verifyException2.getMessage()));
        c();
    }

    @Deprecated
    public void a(VerifyException verifyException, VerifyException verifyException2, String str) {
        c cVarA = a(g(), verifyException.getCode(), verifyException.getMessage(), verifyException2.getCode(), verifyException2.getMessage());
        cVarA.f(str);
        a(cVarA);
        c();
    }

    public void a(Integer num) {
        this.f36228e = num;
    }

    public void a(String str) {
        c cVarB = b(g());
        cVarB.a(200);
        cVarB.c(str);
        a(cVarB);
        c();
    }

    public void a(String str, String str2) {
        a(b(str, str2));
        c();
    }

    public void a(String str, String str2, String str3) {
        c cVarB = b(str3);
        cVarB.a(200);
        cVarB.c("success");
        cVarB.f(str);
        cVarB.e(str2);
        cVarB.b(this.f36227d ? 300 : 200);
        a(cVarB);
    }

    public void a(String str, String str2, String str3, String str4) {
        c cVarB = b(str3);
        cVarB.a(200);
        cVarB.c("success");
        cVarB.f(str);
        cVarB.e(str2);
        cVarB.c(str4);
        cVarB.b(this.f36227d ? 300 : 200);
        a(cVarB);
    }

    public void a(boolean z10) {
        this.f36227d = z10;
    }

    public c b(String str) {
        long jUptimeMillis = 0;
        if (this.f36224a == 0) {
            this.f36224a = SystemClock.uptimeMillis();
        } else {
            jUptimeMillis = SystemClock.uptimeMillis() - this.f36224a;
        }
        c cVar = new c(this.f36225b, str);
        cVar.a(this.f36226c);
        cVar.c(jUptimeMillis);
        cVar.b(jUptimeMillis);
        cVar.a(System.currentTimeMillis());
        Integer num = this.f36228e;
        if (num != null) {
            cVar.a(num);
        }
        String str2 = this.f36229f;
        if (str2 != null) {
            cVar.g(str2);
        }
        Integer num2 = this.f36230g;
        if (num2 != null) {
            cVar.b(num2);
        }
        return cVar;
    }

    public c b(String str, String str2) {
        c cVarB = b(g());
        cVarB.e(str2);
        cVarB.f(str);
        cVarB.a(200);
        cVarB.c("success");
        return cVarB;
    }

    public String b() {
        Object obj;
        int i10 = AnonymousClass1.f36231a[this.f36225b.ordinal()];
        String strB = null;
        if (i10 != 1) {
            obj = i10 != 2 ? null : AliVerifyDialogActivity.f77461k;
        } else {
            obj = "preVerify";
        }
        if ("preVerify".equals(obj)) {
            strB = ai.a().c();
        } else if (AliVerifyDialogActivity.f77461k.equals(obj)) {
            strB = ai.a().b();
        }
        if (strB == null || strB.equals(this.f36226c)) {
            return this.f36226c;
        }
        return this.f36226c + Constants.ACCEPT_TIME_SEPARATOR_SP + strB;
    }

    public void b(c cVar) {
        d.b(cVar);
        d.b();
    }

    public void b(Integer num) {
        this.f36230g = num;
    }

    public void c() {
        d.b();
    }

    public void c(String str) {
        this.f36229f = str;
    }

    public boolean d() {
        return this.f36227d;
    }

    public String e() {
        return this.f36229f;
    }

    public Integer f() {
        return this.f36230g;
    }
}
