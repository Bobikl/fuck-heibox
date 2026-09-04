package cn.fly.verify;

import android.text.TextUtils;
import cn.fly.verify.common.exception.VerifyErr;
import cn.fly.verify.common.exception.VerifyException;
import java.util.HashMap;

/* JADX INFO: renamed from: cn.fly.verify.r, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C1293r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile C1293r f36973a;

    private C1293r() {
    }

    public static C1293r a() {
        if (f36973a == null) {
            synchronized (C1293r.class) {
                if (f36973a == null) {
                    f36973a = new C1293r();
                }
            }
        }
        return f36973a;
    }

    public HashMap a(e eVar) throws VerifyException {
        if (TextUtils.isEmpty(ax.d())) {
            throw new VerifyException(VerifyErr.C_Init_APPKEY_NULL);
        }
        String str = i.a(3) + "api/initSecCdn/1/";
        StringBuilder sb2 = new StringBuilder();
        String strC = fz.d.c();
        String strA = al.a();
        sb2.append(ax.d());
        sb2.append("/");
        sb2.append(strC);
        sb2.append("/");
        sb2.append(strA);
        return j.a(false).a(str + sb2.toString(), eVar);
    }

    public void a(final String str, final String str2, final e eVar, final cn.fly.verify.common.callback.b<a> bVar) {
        if (ax.h()) {
            if (bVar != null) {
                bVar.a(new VerifyException(VerifyErr.C_PRIVACY_NOT_ACCEPTED_ERROR));
            }
        } else {
            try {
                d.a().execute(new ar() { // from class: cn.fly.verify.r.1
                    @Override // cn.fly.verify.ar
                    public void a() {
                        h hVarA = h.a();
                        String str3 = str;
                        String str4 = str2;
                        e eVar2 = eVar;
                        final HashMap<String, Object> mapA = hVarA.a(str3, str4, eVar2 != null ? eVar2.b() : null);
                        f.a().a("start requestCache with params" + new gd().a((HashMap) mapA));
                        String str5 = i.a(2) + "api/usedMobile";
                        e eVar3 = eVar;
                        if (eVar3 != null) {
                            eVar3.a(eVar3.b("query_cache"));
                        }
                        j.a(false).a(mapA, str5, new j.a<HashMap>() { // from class: cn.fly.verify.r.1.1
                            @Override // cn.fly.verify.j.a
                            public void a(VerifyException verifyException) {
                                cn.fly.verify.common.callback.b bVar2 = bVar;
                                if (bVar2 != null) {
                                    bVar2.a(verifyException);
                                }
                            }

                            @Override // cn.fly.verify.j.a
                            public void a(HashMap map) {
                                a aVarB = new a().b(ge.a(map));
                                if (mapA.containsKey("subid")) {
                                    aVarB.f35666f = ((Integer) mapA.get("subid")).intValue();
                                }
                                cn.fly.verify.common.callback.b bVar2 = bVar;
                                if (bVar2 != null) {
                                    bVar2.a(aVarB);
                                }
                            }
                        });
                    }
                });
            } catch (Throwable th2) {
                f.a().a(th2);
            }
        }
    }

    public String[] a(String str, String str2, s sVar, String str3) throws VerifyException {
        try {
            String[] strArrA = h.a().a(sVar, str3, str, str2);
            if (strArrA == null || strArrA.length < 1) {
                throw new VerifyException(VerifyErr.INNER_TOKEN_NULL_ERR);
            }
            return new String[]{"0:" + an.a(strArrA[0]), strArrA[1]};
        } catch (Throwable th2) {
            f.a().a(th2);
            if (th2 instanceof VerifyException) {
                throw th2;
            }
            throw new VerifyException(VerifyErr.INNER_TOKEN_NULL_ERR.getCode(), as.a(th2));
        }
    }

    public HashMap b() throws VerifyException {
        HashMap<String, Object> mapB = h.a().b();
        if (TextUtils.isEmpty((String) mapB.get("appkey"))) {
            throw new VerifyException(VerifyErr.C_Init_APPKEY_NULL);
        }
        String str = i.a(1) + "api/initSec";
        f.a().b("[FlyVerify] ==>%s", "init start");
        return j.a(false).b(mapB, str);
    }
}
