package cn.fly.verify;

import cn.fly.verify.common.callback.OperationCallback;
import cn.fly.verify.common.exception.VerifyErr;
import cn.fly.verify.common.exception.VerifyException;
import cn.fly.verify.pure.entity.PreVerifyResult;

/* JADX INFO: loaded from: classes6.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static o f36891a;

    public static o a() {
        if (f36891a == null) {
            f36891a = new o();
        }
        return f36891a;
    }

    public void a(OperationCallback<PreVerifyResult> operationCallback, final boolean z10, s... sVarArr) {
        final cn.fly.verify.common.callback.a aVar = new cn.fly.verify.common.callback.a(operationCallback, sVarArr);
        for (int length = sVarArr.length; length >= 1; length--) {
            final s sVar = sVarArr[length - 1];
            if (sVar != null) {
                if (ai.a().l() == 1) {
                    q.a().a(sVar.f36981a);
                }
                final e eVarC = sVar.c();
                sVar.a(new cn.fly.verify.common.callback.b<PreVerifyResult>() { // from class: cn.fly.verify.o.1
                    @Override // cn.fly.verify.common.callback.b
                    public void a(VerifyException verifyException) {
                        if (verifyException != null && sVar.a(verifyException.getCode()) && ai.a().t() == 0) {
                            verifyException.setCode(VerifyErr.INNER_OTHER_EXCEPTION_ERR.getCode());
                        }
                        aVar.a(sVar.b(), verifyException, z10, eVarC);
                    }

                    @Override // cn.fly.verify.common.callback.b
                    public void a(PreVerifyResult preVerifyResult) {
                        if (aVar.a(preVerifyResult.getOperator(), preVerifyResult, z10, eVarC) && ai.a().l() == 1) {
                            q.a().a(sVar.f36981a);
                            q qVarA = q.a();
                            s sVar2 = sVar;
                            qVarA.a(sVar2.f36981a, sVar2.f36982b, sVar2.f36983c, sVar2.d(), sVar.e(), sVar.f(), preVerifyResult.getExpireAt());
                        }
                    }
                });
            }
        }
    }
}
