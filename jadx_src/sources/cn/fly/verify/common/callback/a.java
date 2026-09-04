package cn.fly.verify.common.callback;

import cn.fly.verify.aq;
import cn.fly.verify.ar;
import cn.fly.verify.au;
import cn.fly.verify.ax;
import cn.fly.verify.common.exception.VerifyException;
import cn.fly.verify.e;
import cn.fly.verify.k;
import cn.fly.verify.pure.entity.PreVerifyResult;
import cn.fly.verify.s;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f36041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final OperationCallback<PreVerifyResult> f36043c;

    public a(OperationCallback<PreVerifyResult> operationCallback, s... sVarArr) {
        int i10 = 0;
        for (s sVar : sVarArr) {
            if (sVar != null) {
                i10++;
            }
        }
        this.f36042b = i10;
        this.f36043c = operationCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final String str, final OperationCallback<PreVerifyResult> operationCallback, String str2, final PreVerifyResult preVerifyResult, final VerifyException verifyException, e eVar) {
        k.a().a(str, str2, eVar, new b<cn.fly.verify.a>() { // from class: cn.fly.verify.common.callback.a.3
            @Override // cn.fly.verify.common.callback.b
            public void a(cn.fly.verify.a aVar) {
                long jCurrentTimeMillis = System.currentTimeMillis() + 3600000;
                String str3 = aVar.f35662b;
                String str4 = str;
                PreVerifyResult preVerifyResult2 = new PreVerifyResult(str3, str4, jCurrentTimeMillis, str4);
                OperationCallback operationCallback2 = operationCallback;
                if (operationCallback2 != null) {
                    operationCallback2.onComplete(preVerifyResult2);
                }
            }

            @Override // cn.fly.verify.common.callback.b
            public void a(VerifyException verifyException2) {
                PreVerifyResult preVerifyResult2 = preVerifyResult;
                if (preVerifyResult2 != null) {
                    OperationCallback operationCallback2 = operationCallback;
                    if (operationCallback2 != null) {
                        operationCallback2.onComplete(preVerifyResult2);
                        return;
                    }
                    return;
                }
                VerifyException verifyException3 = verifyException;
                if (verifyException3 != null) {
                    verifyException2 = verifyException3;
                }
                OperationCallback operationCallback3 = operationCallback;
                if (operationCallback3 != null) {
                    operationCallback3.onFailure(verifyException2);
                }
            }
        });
    }

    public void a(final String str, final VerifyException verifyException, boolean z10, final e eVar) {
        if (this.f36041a) {
            au.a(ax.g()).a();
            return;
        }
        if (this.f36042b == 1) {
            this.f36043c.onFailure(verifyException);
            au.a(ax.g()).a();
            int iK = aq.k();
            if (z10 && (iK == 3 || iK == 6 || iK == 4 || iK == 7)) {
                Executors.newSingleThreadExecutor().execute(new ar() { // from class: cn.fly.verify.common.callback.a.2
                    @Override // cn.fly.verify.ar
                    public void a() {
                        a.this.a(str, null, null, null, verifyException, eVar);
                    }
                });
            }
        }
        this.f36042b--;
    }

    public boolean a(final String str, final PreVerifyResult preVerifyResult, boolean z10, final e eVar) {
        if (this.f36041a) {
            au.a(ax.g()).a();
            return false;
        }
        this.f36041a = true;
        this.f36043c.onComplete(preVerifyResult);
        au.a(ax.g()).a();
        int iK = aq.k();
        if (z10 && (iK == 2 || iK == 4 || iK == 7)) {
            Executors.newSingleThreadExecutor().execute(new ar() { // from class: cn.fly.verify.common.callback.a.1
                @Override // cn.fly.verify.ar
                public void a() {
                    a.this.a(str, null, preVerifyResult.getSecurityPhone(), preVerifyResult, null, eVar);
                }
            });
        }
        return true;
    }
}
