package cn.fly.verify;

import cn.fly.verify.common.exception.VerifyException;

/* JADX INFO: loaded from: classes6.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static k f36869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36870b = -1;

    private k() {
    }

    public static k a() {
        if (f36869a == null) {
            synchronized (k.class) {
                if (f36869a == null) {
                    f36869a = new k();
                }
            }
        }
        return f36869a;
    }

    public void a(final String str, String str2, e eVar, final cn.fly.verify.common.callback.b<a> bVar) {
        C1293r.a().a(str, str2, eVar, new cn.fly.verify.common.callback.b<a>() { // from class: cn.fly.verify.k.1
            @Override // cn.fly.verify.common.callback.b
            public void a(a aVar) {
                if (aVar != null) {
                    f.a().b("[FlyVerify] ==>%s", "response cache =" + aVar.f35662b);
                    if (aVar.f35663c) {
                        aVar.f35665e = str;
                        p.a().f36898a.set(aVar);
                        cn.fly.verify.common.callback.b bVar2 = bVar;
                        if (bVar2 != null) {
                            bVar2.a(aVar);
                            return;
                        }
                    }
                }
                cn.fly.verify.common.callback.b bVar3 = bVar;
                if (bVar3 != null) {
                    bVar3.a((VerifyException) null);
                }
            }

            @Override // cn.fly.verify.common.callback.b
            public void a(VerifyException verifyException) {
                cn.fly.verify.common.callback.b bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.a(verifyException);
                }
            }
        });
    }
}
