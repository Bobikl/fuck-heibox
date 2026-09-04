package cn.fly.verify;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import cn.fly.verify.common.callback.OperationCallback;
import cn.fly.verify.common.exception.VerifyErr;
import cn.fly.verify.common.exception.VerifyException;
import cn.fly.verify.pure.entity.PreVerifyResult;
import cn.fly.verify.pure.entity.VerifyResult;
import com.max.xiaoheihe.module.account.AliVerifyDialogActivity;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile p f36897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f36899c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private PreVerifyResult f36901e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f36902f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f36903g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private at f36904h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private at f36905i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<a> f36898a = new AtomicReference<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f36900d = 5000;

    private p() {
        new be().c();
    }

    public static int a(String str) {
        int iA = as.a(str);
        if (iA == 1) {
            return 1;
        }
        if (iA == 2) {
            return m.b() ? 3 : 2;
        }
        return iA == 3 ? 4 : 5;
    }

    public static p a() {
        if (f36897b == null) {
            synchronized (p.class) {
                if (f36897b == null) {
                    f36897b = new p();
                }
            }
        }
        return f36897b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, PreVerifyResult preVerifyResult, final e eVar) {
        l lVar;
        au.a(ax.g()).a();
        if (eVar.d()) {
            return;
        }
        final SparseArray<l> sparseArrayA = l.a();
        SparseArray<l> sparseArrayC = l.c();
        this.f36902f = i10;
        if (preVerifyResult != null) {
            try {
                if ("CUXW".equals(preVerifyResult.getChannel())) {
                    this.f36902f = 3;
                }
            } catch (Throwable th2) {
                as.a(th2);
                c cVarB = eVar.b("pre_2_f");
                cVarB.e(sparseArrayC.get(this.f36902f).f36880b);
                cVarB.f(as.a(this.f36902f));
                eVar.a(cVarB);
                eVar.c();
                return;
            }
        }
        if (sparseArrayA != null && (lVar = sparseArrayA.get(this.f36902f)) != null) {
            String str = lVar.f36880b;
            String str2 = lVar.f36881c;
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !sparseArrayC.get(this.f36902f).f36880b.equals(str)) {
                final s sVarA = as.a(null, this.f36902f, str, str2, lVar.d(), lVar.e(), lVar.f(), eVar);
                l.a(sparseArrayA);
                a(new OperationCallback<PreVerifyResult>() { // from class: cn.fly.verify.p.8
                    @Override // cn.fly.verify.common.callback.OperationCallback
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public void onComplete(PreVerifyResult preVerifyResult2) {
                        p.this.f36901e = preVerifyResult2;
                        c cVarB2 = eVar.b("pre_2_s");
                        cVarB2.e(((l) sparseArrayA.get(p.this.f36902f)).f36880b);
                        cVarB2.f(preVerifyResult2.getChannel());
                        eVar.a(cVarB2);
                        eVar.c();
                        au.a(ax.g()).a();
                    }

                    @Override // cn.fly.verify.common.callback.OperationCallback
                    public void onFailure(VerifyException verifyException) {
                        c cVarB2 = eVar.b("pre_2_f");
                        cVarB2.e(((l) sparseArrayA.get(p.this.f36902f)).f36880b);
                        cVarB2.f(sVarA.f36981a);
                        eVar.a(cVarB2);
                        eVar.c();
                        au.a(ax.g()).a();
                    }
                }, false, sVarA);
                return;
            }
        }
        c cVarB2 = eVar.b("pre_2_no");
        cVarB2.e(sparseArrayC.get(this.f36902f).f36880b);
        cVarB2.f(as.a(this.f36902f));
        eVar.a(cVarB2);
        eVar.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final OperationCallback<PreVerifyResult> operationCallback, final PreVerifyResult preVerifyResult, final VerifyException verifyException) {
        Object obj;
        f fVarA;
        String str;
        Object obj2;
        au.a(ax.g()).a();
        if (operationCallback == null) {
            at atVarA = a(true);
            if (preVerifyResult == null) {
                obj2 = preVerifyResult;
                obj2 = verifyException;
            }
            obj2 = preVerifyResult;
            atVarA.a(obj2);
            return;
        }
        if (operationCallback.isCanceled()) {
            fVarA = f.a();
            str = "get result , but already timeout";
        } else {
            operationCallback.setCanceled(true);
            gm.a(0, new Handler.Callback() { // from class: cn.fly.verify.p.7
                @Override // android.os.Handler.Callback
                public boolean handleMessage(Message message) {
                    PreVerifyResult preVerifyResult2 = preVerifyResult;
                    if (preVerifyResult2 != null) {
                        operationCallback.onComplete(preVerifyResult2);
                        return false;
                    }
                    operationCallback.onFailure(verifyException);
                    return false;
                }
            });
            at atVarA2 = a(true);
            if (preVerifyResult == null) {
                obj = preVerifyResult;
                obj = verifyException;
            }
            obj = preVerifyResult;
            atVarA2.a(obj);
            fVarA = f.a();
            str = "get result , cancel timeout";
        }
        fVarA.b("[FlyVerify] ==>%s", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final OperationCallback<VerifyResult> operationCallback, final VerifyResult verifyResult, final VerifyException verifyException) {
        Object obj;
        f fVarA;
        String str;
        Object obj2;
        au.a(ax.g()).a();
        if (operationCallback == null) {
            at atVarA = a(false);
            if (verifyResult == null) {
                obj2 = verifyResult;
                obj2 = verifyException;
            }
            obj2 = verifyResult;
            atVarA.a(obj2);
            return;
        }
        if (operationCallback.isCanceled()) {
            fVarA = f.a();
            str = "get result , but already timeout";
        } else {
            operationCallback.setCanceled(true);
            this.f36898a.set(null);
            gm.a(0, new Handler.Callback() { // from class: cn.fly.verify.p.6
                @Override // android.os.Handler.Callback
                public boolean handleMessage(Message message) {
                    VerifyResult verifyResult2 = verifyResult;
                    if (verifyResult2 != null) {
                        operationCallback.onComplete(verifyResult2);
                        return false;
                    }
                    operationCallback.onFailure(verifyException);
                    return false;
                }
            });
            at atVarA2 = a(false);
            if (verifyResult == null) {
                obj = verifyResult;
                obj = verifyException;
            }
            obj = verifyResult;
            atVarA2.a(obj);
            fVarA = f.a();
            str = "get result , cancel timeout";
        }
        fVarA.b("[FlyVerify] ==>%s", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(OperationCallback<PreVerifyResult> operationCallback, boolean z10, s... sVarArr) {
        o.a().a(operationCallback, z10, sVarArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(e eVar) {
        String securityPhone;
        String operator;
        try {
            if (8 == aq.k()) {
                PreVerifyResult preVerifyResult = this.f36901e;
                if (preVerifyResult != null) {
                    securityPhone = preVerifyResult.getSecurityPhone();
                    operator = this.f36901e.getOperator();
                } else {
                    securityPhone = null;
                    operator = null;
                }
                f.a().b("[FlyVerify] ==>%s", "request cache before verify");
                k.a().a(operator, securityPhone, eVar, null);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final e eVar, final OperationCallback operationCallback, final int i10, final boolean z10) {
        long jLongValue = this.f36900d;
        Long l10 = ak.f35737a;
        if (l10 != null && z10) {
            jLongValue = l10.longValue();
            if (jLongValue < 2000) {
                jLongValue = this.f36900d;
            }
            if (eVar != null) {
                eVar.a(as.a(i10), (String) null, l5.a.f130839h0, String.valueOf(l10));
            }
        } else if (i10 == 4) {
            jLongValue *= 2;
        }
        final long j10 = jLongValue;
        final int iT = ai.a().t();
        f.a().a("isOperatorCode:" + iT);
        new ar() { // from class: cn.fly.verify.p.2
            @Override // cn.fly.verify.ar
            public void a() {
                final VerifyException verifyException;
                try {
                    Thread.sleep(j10);
                } catch (InterruptedException unused) {
                }
                OperationCallback operationCallback2 = operationCallback;
                if (operationCallback2 == null || operationCallback2.isCanceled()) {
                    return;
                }
                try {
                    operationCallback.setCanceled(true);
                    f.a().b("[FlyVerify] ==>%s", "handleTimeout");
                    VerifyErr verifyErr = VerifyErr.INNER_TIMEOUT_ERR;
                    int code = verifyErr.getCode();
                    if (z10 && iT == 1) {
                        int i11 = i10;
                        if (i11 == 1) {
                            code = 200023;
                        } else if (i11 == 2 || i11 == 3) {
                            code = 101005;
                        } else if (i11 == 4) {
                            code = com.google.android.exoplayer2.audio.b.f44079a;
                        }
                    }
                    VerifyException verifyException2 = new VerifyException(code, verifyErr.getMessage());
                    e eVar2 = eVar;
                    if (eVar2 != null) {
                        VerifyErr verifyErrA = eVar2.a(as.a(i10), (String) null, verifyException2);
                        eVar.a(true);
                        verifyException = new VerifyException(verifyErrA);
                        verifyException.setSerialId(eVar.b());
                    } else {
                        verifyException = new VerifyException(VerifyErr.C_PREVERIFY_TIMEOUT);
                    }
                    if (z10 && iT == 1 && code != verifyErr.getCode()) {
                        verifyException.setOperatorCode(code + "");
                    }
                    au.a(ax.g()).a();
                    gm.a(0, new Handler.Callback() { // from class: cn.fly.verify.p.2.1
                        @Override // android.os.Handler.Callback
                        public boolean handleMessage(Message message) {
                            operationCallback.onFailure(verifyException);
                            return false;
                        }
                    });
                } catch (Throwable unused2) {
                    verifyException = new VerifyException(VerifyErr.C_PREVERIFY_CATCH);
                    gm.a(0, new Handler.Callback() { // from class: cn.fly.verify.p.2.2
                        @Override // android.os.Handler.Callback
                        public boolean handleMessage(Message message) {
                            operationCallback.onFailure(verifyException);
                            return false;
                        }
                    });
                }
                p.this.a(z10).a(eVar);
                p.this.a(z10).a(verifyException);
            }
        }.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(s sVar, OperationCallback<VerifyResult> operationCallback, e eVar, String str) {
        a(sVar, eVar, operationCallback, str);
    }

    private void a(final s sVar, final e eVar, final OperationCallback<VerifyResult> operationCallback, final String str) {
        sVar.b(new cn.fly.verify.common.callback.b<VerifyResult>() { // from class: cn.fly.verify.p.9
            @Override // cn.fly.verify.common.callback.b
            public void a(final VerifyException verifyException) {
                as.a(new ar() { // from class: cn.fly.verify.p.9.2
                    @Override // cn.fly.verify.ar
                    public void a() {
                        try {
                            String str2 = "";
                            s sVar2 = sVar;
                            if (sVar2 != null && sVar2.a() != null && sVar.a().containsKey("optoken")) {
                                str2 = (String) sVar.a().get("optoken");
                            }
                            AnonymousClass9 anonymousClass9 = AnonymousClass9.this;
                            if (p.this.b(sVar, eVar, operationCallback, str2)) {
                                return;
                            }
                            AnonymousClass9 anonymousClass10 = AnonymousClass9.this;
                            VerifyException verifyException2 = new VerifyException(eVar.a(sVar.f36981a, str, verifyException));
                            p.this.a(false).a(eVar);
                            verifyException2.setSerialId(eVar.b());
                            AnonymousClass9 anonymousClass11 = AnonymousClass9.this;
                            p.this.a((OperationCallback<VerifyResult>) operationCallback, (VerifyResult) null, verifyException2);
                        } catch (VerifyException unused) {
                            AnonymousClass9 anonymousClass12 = AnonymousClass9.this;
                            VerifyException verifyException3 = new VerifyException(eVar.a(sVar.f36981a, str, verifyException));
                            p.this.a(false).a(eVar);
                            verifyException3.setSerialId(eVar.b());
                            AnonymousClass9 anonymousClass13 = AnonymousClass9.this;
                            p.this.a((OperationCallback<VerifyResult>) operationCallback, (VerifyResult) null, verifyException3);
                        }
                    }
                });
            }

            @Override // cn.fly.verify.common.callback.b
            public void a(final VerifyResult verifyResult) {
                as.a(new ar() { // from class: cn.fly.verify.p.9.1
                    @Override // cn.fly.verify.ar
                    public void a() {
                        VerifyErr verifyErrA;
                        try {
                            AnonymousClass9 anonymousClass9 = AnonymousClass9.this;
                            if (p.this.b(sVar, eVar, operationCallback, verifyResult.getOpToken())) {
                                return;
                            }
                            String[] strArrA = C1293r.a().a(verifyResult.getOpToken(), verifyResult.getOperator(), sVar, verifyResult.getOpToken());
                            AnonymousClass9 anonymousClass10 = AnonymousClass9.this;
                            c cVarB = eVar.b(sVar.f36981a, str);
                            cVarB.d(strArrA[1]);
                            eVar.b(cVarB);
                            verifyResult.setToken(strArrA[0]);
                            p.this.a(false).a(eVar);
                            AnonymousClass9 anonymousClass11 = AnonymousClass9.this;
                            p.this.a((OperationCallback<VerifyResult>) operationCallback, verifyResult, (VerifyException) null);
                        } catch (Throwable th2) {
                            if (th2 instanceof VerifyException) {
                                AnonymousClass9 anonymousClass12 = AnonymousClass9.this;
                                verifyErrA = eVar.a(sVar.f36981a, str, th2);
                            } else {
                                AnonymousClass9 anonymousClass13 = AnonymousClass9.this;
                                verifyErrA = eVar.a(sVar.f36981a, str, new VerifyException(VerifyErr.INNER_OTHER_EXCEPTION_ERR.getCode(), as.a(th2)));
                            }
                            VerifyException verifyException = new VerifyException(verifyErrA);
                            p.this.a(false).a(eVar);
                            verifyException.setSerialId(eVar.b());
                            AnonymousClass9 anonymousClass14 = AnonymousClass9.this;
                            p.this.a((OperationCallback<VerifyResult>) operationCallback, (VerifyResult) null, verifyException);
                        }
                    }
                });
            }
        });
    }

    private boolean a(a aVar, s sVar) {
        String str;
        boolean z10 = false;
        if (aVar != null && (str = aVar.f35665e) != null && sVar != null && str.equals(sVar.b()) && aVar.f35666f == as.d()) {
            z10 = true;
        }
        f.a().b("[FlyVerify] ==>%s", "cache and current ope is same " + z10);
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int b() {
        boolean zA = as.a(ax.g());
        return (zA ? 10 : 0) + (as.d() > -1 ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(e eVar, OperationCallback operationCallback, boolean z10) {
        PreVerifyResult preVerifyResult;
        VerifyException verifyException;
        Object objA = a(z10).a();
        if (objA == null) {
            return false;
        }
        e eVarC = a(z10).c();
        if (eVarC != null) {
            eVar.c(eVarC.e());
            eVar.a(eVarC.d());
            eVar.b(eVarC.f());
        }
        VerifyResult verifyResult = null;
        if (objA instanceof VerifyException) {
            verifyException = new VerifyException(eVar.a(as.b(), this.f36903g, (VerifyException) objA));
            preVerifyResult = null;
        } else if (objA instanceof PreVerifyResult) {
            preVerifyResult = (PreVerifyResult) objA;
            eVar.a(preVerifyResult.getOperator(), this.f36903g);
            verifyException = null;
        } else if (objA instanceof VerifyResult) {
            VerifyResult verifyResult2 = (VerifyResult) objA;
            eVar.a(verifyResult2.getOperator(), this.f36903g);
            verifyException = null;
            verifyResult = verifyResult2;
            preVerifyResult = null;
        } else {
            preVerifyResult = null;
            verifyException = null;
        }
        if (z10) {
            a((OperationCallback<PreVerifyResult>) operationCallback, preVerifyResult, verifyException);
            return true;
        }
        a((OperationCallback<VerifyResult>) operationCallback, verifyResult, verifyException);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(s sVar, e eVar, OperationCallback<VerifyResult> operationCallback, String str) throws VerifyException {
        a aVar = a().f36898a.get();
        if (aVar == null || !a(aVar, sVar)) {
            return false;
        }
        if (eVar != null) {
            eVar.a(sVar.f36981a, sVar.f36982b, "usc", String.valueOf(aVar.f35664d));
        }
        f.a().b("[FlyVerify] ==>%s", "use server cache");
        ai.a().b(1);
        ai.a().a(aVar.f35664d);
        VerifyResult verifyResult = new VerifyResult(aVar.f35662b, aVar.f35661a, sVar.b());
        String[] strArrA = C1293r.a().a(verifyResult.getOpToken(), verifyResult.getOperator(), sVar, str);
        c cVarB = eVar.b(sVar.f36981a, this.f36903g);
        cVarB.d(strArrA[1]);
        eVar.b(cVarB);
        verifyResult.setToken(strArrA[0]);
        a(operationCallback, verifyResult, (VerifyException) null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int c(String str) {
        if ("CMCC".equals(str)) {
            return 1;
        }
        if ("CUXW".equals(str)) {
            return 3;
        }
        if ("CUCC".equals(str)) {
            return 2;
        }
        return "CTCC".equals(str) ? 4 : 5;
    }

    public at a(boolean z10) {
        if (z10) {
            if (this.f36904h == null) {
                this.f36904h = new at("preVerify");
            }
            return this.f36904h;
        }
        if (this.f36905i == null) {
            this.f36905i = new at(AliVerifyDialogActivity.f77461k);
        }
        return this.f36905i;
    }

    public void a(OperationCallback<PreVerifyResult> operationCallback) {
        a(operationCallback, true);
    }

    public void a(OperationCallback<PreVerifyResult> operationCallback, boolean z10) {
        a(operationCallback, z10, false);
    }

    public void a(final OperationCallback<PreVerifyResult> operationCallback, final boolean z10, final boolean z11) {
        f.a().b("[FlyVerify] ==>%s", "start preVerify");
        this.f36899c = System.currentTimeMillis();
        new ar() { // from class: cn.fly.verify.p.1
            @Override // cn.fly.verify.ar
            public void a() {
                e eVar = new e(g.PREVERIFY);
                try {
                    if (ax.h()) {
                        p.this.a((OperationCallback<PreVerifyResult>) operationCallback, (PreVerifyResult) null, new VerifyException(VerifyErr.C_PRIVACY_NOT_ACCEPTED_ERROR));
                        return;
                    }
                    eVar.a(Integer.valueOf(z11 ? 1 : 0));
                    eVar.a((String) null, (String) null, com.google.android.exoplayer2.text.ttml.d.f49798o0);
                    if (fz.d.b()) {
                        if (p.this.b(eVar, operationCallback, true)) {
                            return;
                        }
                        p.this.a(eVar, operationCallback, z10);
                    } else {
                        f.a().a("not main process");
                        VerifyException verifyException = new VerifyException(VerifyErr.INNER_OTHER_EXCEPTION_ERR.getCode(), "not main process");
                        VerifyException verifyException2 = new VerifyException(VerifyErr.C_PREVERIFY_CATCH);
                        eVar.a(verifyException2, verifyException);
                        verifyException2.setSerialId(eVar.b());
                        p.this.a((OperationCallback<PreVerifyResult>) operationCallback, (PreVerifyResult) null, verifyException2);
                    }
                } catch (Throwable th2) {
                    f.a().a(th2);
                    VerifyErr verifyErr = VerifyErr.C_PREVERIFY_CATCH;
                    VerifyException verifyException3 = new VerifyException(verifyErr.getCode(), as.a(th2));
                    VerifyException verifyException4 = new VerifyException(verifyErr);
                    eVar.a(verifyException4, verifyException3);
                    verifyException4.setSerialId(eVar.b());
                    p.this.a((OperationCallback<PreVerifyResult>) operationCallback, (PreVerifyResult) null, verifyException4);
                }
            }

            @Override // cn.fly.verify.ar
            public void a(Throwable th2) {
                p.this.a(true).a(new VerifyException(VerifyErr.C_PREVERIFY_CATCH.getCode(), as.a(th2)));
            }
        }.b();
    }

    public void a(final e eVar, final OperationCallback<VerifyResult> operationCallback) {
        al.a(new ar() { // from class: cn.fly.verify.p.5
            /* JADX WARN: Code duplicated, block: B:45:0x00fa  */
            /* JADX WARN: Code duplicated, block: B:47:0x0100  */
            /* JADX WARN: Code duplicated, block: B:54:0x0143  */
            /* JADX WARN: Code duplicated, block: B:55:0x015a  */
            /* JADX WARN: Code duplicated, block: B:57:0x018e  */
            @Override // cn.fly.verify.ar
            public void a() {
                l lVar;
                l lVar2;
                final l lVar3;
                SparseArray<l> sparseArrayA;
                SparseArray<l> sparseArrayA2;
                l lVar4;
                final s sVarA;
                VerifyException verifyException;
                e eVar2;
                VerifyException verifyException2;
                p.this.a(eVar);
                int iA = p.a(as.a(true));
                if (iA == 5 && ai.a().k().booleanValue() && p.this.f36901e != null) {
                    iA = p.c(p.this.f36901e.getChannel());
                }
                if (iA == 5) {
                    verifyException = new VerifyException(VerifyErr.C_UNSUPPORTED_OPERATOR);
                    verifyException.setExtraDesc("unknown operator");
                    eVar2 = eVar;
                    verifyException2 = new VerifyException(VerifyErr.INNER_UNKNOWN_OPERATOR);
                } else {
                    if (iA == 2 && p.this.f36901e != null && "CUXW".equals(p.this.f36901e.getChannel())) {
                        iA = 3;
                    }
                    p.this.a(eVar, operationCallback, iA, false);
                    eVar.a(as.a(iA), (String) null, "get_cc");
                    SparseArray<l> sparseArrayA3 = l.a();
                    SparseArray<l> sparseArrayC = l.c();
                    boolean z10 = (sparseArrayA3 == null || sparseArrayC == null || sparseArrayA3.get(iA) == null || sparseArrayC.get(iA) == null || sparseArrayA3.get(iA).f36880b == null || sparseArrayA3.get(iA).f36880b.equals(sparseArrayC.get(iA).f36880b)) ? false : true;
                    if (z10) {
                        lVar4 = sparseArrayA3.get(iA);
                    } else {
                        if (sparseArrayC != null) {
                            lVar2 = sparseArrayC.get(iA);
                        } else {
                            if (sparseArrayA3 != null) {
                                lVar2 = sparseArrayA3.get(iA);
                            } else {
                                lVar = null;
                            }
                            if (lVar == null) {
                                sparseArrayA = m.a();
                                if (sparseArrayA != null) {
                                    ai.a().a(0);
                                    eVar.a((String) null, (String) null, "use_ca");
                                    f.a().b("[FlyVerify] ==>%s", "use cache config");
                                    lVar = sparseArrayA.get(iA);
                                }
                                if (lVar != null && (sparseArrayA2 = n.a(2000L, 4000L, eVar)) != null) {
                                    ai.a().a(2);
                                    f.a().b("[FlyVerify] ==>%s", "use server config");
                                    lVar4 = sparseArrayA2.get(iA);
                                }
                                if (lVar3 == null) {
                                    eVar.b(Integer.valueOf(lVar3.d()));
                                    sVarA = as.a(null, iA, lVar3.f36880b, lVar3.f36881c, lVar3.d(), lVar3.e(), lVar3.f(), eVar);
                                    eVar.a(as.a(iA), lVar3.f36880b, "get_ci");
                                    if (z10 || p.this.f36898a.get() != null) {
                                        p.this.a(sVarA, (OperationCallback<VerifyResult>) operationCallback, eVar, lVar3.f36880b);
                                        return;
                                    }
                                    f.a().a("[FlyVerify] ==>%s", "pre3：" + lVar3.f36880b);
                                    p.this.a(new OperationCallback<PreVerifyResult>() { // from class: cn.fly.verify.p.5.1
                                        @Override // cn.fly.verify.common.callback.OperationCallback
                                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                        public void onComplete(PreVerifyResult preVerifyResult) {
                                            p.this.f36901e = preVerifyResult;
                                            AnonymousClass5 anonymousClass5 = AnonymousClass5.this;
                                            p.this.a(sVarA, (OperationCallback<VerifyResult>) operationCallback, eVar, lVar3.f36880b);
                                        }

                                        @Override // cn.fly.verify.common.callback.OperationCallback
                                        public void onFailure(VerifyException verifyException3) {
                                            eVar.a(sVarA.f36981a, lVar3.f36880b, verifyException3);
                                            verifyException3.setSerialId(eVar.b());
                                            AnonymousClass5 anonymousClass5 = AnonymousClass5.this;
                                            p.this.a((OperationCallback<VerifyResult>) operationCallback, (VerifyResult) null, verifyException3);
                                        }
                                    }, true, sVarA);
                                    return;
                                }
                                verifyException = new VerifyException(VerifyErr.C_UNSUPPORTED_OPERATOR);
                                verifyException.setExtraDesc("no operator config");
                                eVar2 = eVar;
                                verifyException2 = new VerifyException(VerifyErr.INNER_NO_OPERATOR_CONFIG);
                            }
                            lVar3 = lVar;
                            if (lVar3 == null) {
                                eVar.b(Integer.valueOf(lVar3.d()));
                                sVarA = as.a(null, iA, lVar3.f36880b, lVar3.f36881c, lVar3.d(), lVar3.e(), lVar3.f(), eVar);
                                eVar.a(as.a(iA), lVar3.f36880b, "get_ci");
                                if (z10) {
                                }
                                p.this.a(sVarA, (OperationCallback<VerifyResult>) operationCallback, eVar, lVar3.f36880b);
                                return;
                            }
                            verifyException = new VerifyException(VerifyErr.C_UNSUPPORTED_OPERATOR);
                            verifyException.setExtraDesc("no operator config");
                            eVar2 = eVar;
                            verifyException2 = new VerifyException(VerifyErr.INNER_NO_OPERATOR_CONFIG);
                        }
                        lVar = lVar2;
                        if (lVar == null) {
                            sparseArrayA = m.a();
                            if (sparseArrayA != null) {
                                ai.a().a(0);
                                eVar.a((String) null, (String) null, "use_ca");
                                f.a().b("[FlyVerify] ==>%s", "use cache config");
                                lVar = sparseArrayA.get(iA);
                            }
                            if (lVar != null) {
                            }
                        }
                        lVar3 = lVar;
                        if (lVar3 == null) {
                            eVar.b(Integer.valueOf(lVar3.d()));
                            sVarA = as.a(null, iA, lVar3.f36880b, lVar3.f36881c, lVar3.d(), lVar3.e(), lVar3.f(), eVar);
                            eVar.a(as.a(iA), lVar3.f36880b, "get_ci");
                            if (z10) {
                            }
                            p.this.a(sVarA, (OperationCallback<VerifyResult>) operationCallback, eVar, lVar3.f36880b);
                            return;
                        }
                        verifyException = new VerifyException(VerifyErr.C_UNSUPPORTED_OPERATOR);
                        verifyException.setExtraDesc("no operator config");
                        eVar2 = eVar;
                        verifyException2 = new VerifyException(VerifyErr.INNER_NO_OPERATOR_CONFIG);
                    }
                    lVar3 = lVar4;
                    if (lVar3 == null) {
                        eVar.b(Integer.valueOf(lVar3.d()));
                        sVarA = as.a(null, iA, lVar3.f36880b, lVar3.f36881c, lVar3.d(), lVar3.e(), lVar3.f(), eVar);
                        eVar.a(as.a(iA), lVar3.f36880b, "get_ci");
                        if (z10) {
                        }
                        p.this.a(sVarA, (OperationCallback<VerifyResult>) operationCallback, eVar, lVar3.f36880b);
                        return;
                    }
                    verifyException = new VerifyException(VerifyErr.C_UNSUPPORTED_OPERATOR);
                    verifyException.setExtraDesc("no operator config");
                    eVar2 = eVar;
                    verifyException2 = new VerifyException(VerifyErr.INNER_NO_OPERATOR_CONFIG);
                }
                eVar2.a(verifyException, verifyException2);
                verifyException.setSerialId(eVar.b());
                p.this.a(false).a(eVar);
                p.this.a((OperationCallback<VerifyResult>) operationCallback, (VerifyResult) null, verifyException);
            }

            @Override // cn.fly.verify.ar
            public void a(Throwable th2) {
                String strA = as.a(th2);
                VerifyErr verifyErr = VerifyErr.C_VERIFY_CATCH;
                VerifyException verifyException = new VerifyException(verifyErr.getCode(), strA);
                VerifyException verifyException2 = new VerifyException(verifyErr);
                eVar.a(verifyException2, verifyException);
                p.this.a(false).a(eVar);
                verifyException2.setExtraDesc(eVar.b());
                verifyException2.setSerialId(eVar.b());
                p.this.a((OperationCallback<VerifyResult>) operationCallback, (VerifyResult) null, verifyException2);
            }
        }, true, eVar);
    }

    public void a(final e eVar, final OperationCallback<PreVerifyResult> operationCallback, final boolean z10) {
        al.a(new ar() { // from class: cn.fly.verify.p.3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // cn.fly.verify.ar
            public void a() {
                final SparseArray<l> sparseArray;
                boolean z11;
                s[] sVarArr;
                p.this.f36901e = null;
                final String strA = as.a(true);
                if ((as.a(strA) == 1 && ai.a().n() == 1) || (as.a(strA) == 2 && ai.a().o() == 1)) {
                    new aj().a();
                }
                SparseArray<l> sparseArrayA = l.a();
                int i10 = 0;
                if (sparseArrayA == null) {
                    sparseArrayA = m.a();
                    if (sparseArrayA != null) {
                        ai.a().a(0);
                        eVar.a((String) null, (String) null, "use_ca");
                        f.a().b("[FlyVerify] ==>%s", "use cache config");
                    }
                } else {
                    ai.a().a(2);
                    eVar.a((String) null, (String) null, "use_cdn");
                    f.a().b("[FlyVerify] ==>%s", "use server config");
                }
                if (sparseArrayA == null && z10) {
                    SparseArray<l> sparseArrayA2 = n.a(2000L, 4000L, eVar);
                    if (sparseArrayA2 != null) {
                        ai.a().a(2);
                        f.a().b("[FlyVerify] ==>%s", "use server config");
                    }
                    sparseArray = sparseArrayA2;
                    z11 = true;
                } else {
                    sparseArray = sparseArrayA;
                    z11 = false;
                }
                if (sparseArray == null) {
                    VerifyException verifyException = new VerifyException(VerifyErr.C_CONFIG_ERROR);
                    verifyException.setExtraDesc(z11 ? "has retry" : "no retry");
                    eVar.a(verifyException, new VerifyException(z11 ? VerifyErr.INNER_NO_INIT_RETRY : VerifyErr.INNER_NO_INIT_NO_RETRY));
                    verifyException.setSerialId(eVar.b());
                    p.this.a(true).a(eVar);
                    p.this.a((OperationCallback<PreVerifyResult>) operationCallback, (PreVerifyResult) null, verifyException);
                    return;
                }
                final int iA = p.a(strA);
                String strD = al.d();
                if (iA != 5 && (TextUtils.isEmpty(strD) || "-1".equalsIgnoreCase(strD))) {
                    eVar.a(as.a(iA), (String) null, "dh_carrier_error");
                }
                l.a(sparseArray);
                p.this.a(eVar, operationCallback, iA, true);
                eVar.a(as.a(iA), (String) null, "get_cc", String.valueOf(p.this.b()));
                if (!ai.a().k().booleanValue() && iA == 5) {
                    f.a().c("[FlyVerify] ==>%s", "carrier unknown");
                    VerifyException verifyException2 = new VerifyException(VerifyErr.C_UNSUPPORTED_OPERATOR);
                    VerifyErr verifyErr = VerifyErr.INNER_UNKNOWN_OPERATOR;
                    verifyException2.setExtraDesc(verifyErr.getMessage());
                    VerifyException verifyException3 = new VerifyException(verifyErr);
                    verifyException3.setExtraDesc(strA);
                    eVar.a(verifyException2, verifyException3);
                    p.this.a(true).a(eVar);
                    verifyException2.setSerialId(eVar.b());
                    p.this.a((OperationCallback<PreVerifyResult>) operationCallback, (PreVerifyResult) null, verifyException2);
                    return;
                }
                if (iA == 5) {
                    int[] iArr = {1, 4, 2, 3};
                    sVarArr = new s[4];
                    while (i10 < 4) {
                        l lVar = sparseArray.get(iArr[i10]);
                        if (lVar != null) {
                            sVarArr[i10] = as.a(null, iArr[i10], lVar.f36880b, lVar.f36881c, lVar.d(), lVar.e(), lVar.f(), eVar).b(true);
                        }
                        i10++;
                    }
                    eVar.a((String) null, (String) null, "unknown_try");
                    i10 = 1;
                } else {
                    l lVar2 = sparseArray.get(iA);
                    if (lVar2 == null) {
                        f.a().c("[FlyVerify] ==>%s", "no operator config");
                        VerifyException verifyException4 = new VerifyException(VerifyErr.C_UNSUPPORTED_OPERATOR);
                        VerifyErr verifyErr2 = VerifyErr.INNER_NO_OPERATOR_CONFIG;
                        verifyException4.setExtraDesc(verifyErr2.getMessage());
                        eVar.a(verifyException4, new VerifyException(verifyErr2), as.a(iA));
                        p.this.a(true).a(eVar);
                        verifyException4.setSerialId(eVar.b());
                        p.this.a((OperationCallback<PreVerifyResult>) operationCallback, (PreVerifyResult) null, verifyException4);
                        return;
                    }
                    if (TextUtils.isEmpty(lVar2.f36880b) || TextUtils.isEmpty(lVar2.f36881c)) {
                        f.a().c("[FlyVerify] ==>%s", "no appid");
                        VerifyException verifyException5 = new VerifyException(VerifyErr.C_APPID_NULL);
                        eVar.a(verifyException5, verifyException5, as.a(iA));
                        p.this.a(true).a(eVar);
                        verifyException5.setSerialId(eVar.b());
                        p.this.a((OperationCallback<PreVerifyResult>) operationCallback, (PreVerifyResult) null, verifyException5);
                        return;
                    }
                    eVar.b(Integer.valueOf(lVar2.d()));
                    sVarArr = new s[]{as.a(null, iA, lVar2.f36880b, lVar2.f36881c, lVar2.d(), lVar2.e(), lVar2.f(), eVar)};
                    p.this.f36903g = lVar2.f36880b;
                    f.a().b("[FlyVerify] ==>%s", "aid:" + lVar2.f36880b + ", us: " + (System.currentTimeMillis() - p.this.f36899c));
                    eVar.a(as.a(iA), lVar2.f36880b, "get_ci");
                }
                final boolean z12 = i10;
                o.a().a(new OperationCallback<PreVerifyResult>() { // from class: cn.fly.verify.p.3.1
                    @Override // cn.fly.verify.common.callback.OperationCallback
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public void onComplete(PreVerifyResult preVerifyResult) {
                        p.this.f36901e = preVerifyResult;
                        p.this.a(true).a(eVar);
                        AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                        p.this.a((OperationCallback<PreVerifyResult>) operationCallback, preVerifyResult, (VerifyException) null);
                        if (!eVar.d()) {
                            if (z12) {
                                l lVar3 = (l) sparseArray.get(p.c(preVerifyResult.getChannel()));
                                c cVarB = eVar.b(preVerifyResult.getChannel(), lVar3 != null ? lVar3.f36880b : null);
                                cVarB.b(201);
                                eVar.a(cVarB);
                            } else {
                                eVar.a(preVerifyResult.getChannel(), p.this.f36903g);
                            }
                            AnonymousClass3 anonymousClass4 = AnonymousClass3.this;
                            p.this.a(iA, preVerifyResult, eVar);
                        }
                        eVar.a(preVerifyResult.getChannel(), p.this.f36903g, "timeout_success");
                        eVar.c();
                        AnonymousClass3 anonymousClass5 = AnonymousClass3.this;
                        p.this.a(iA, preVerifyResult, eVar);
                    }

                    @Override // cn.fly.verify.common.callback.OperationCallback
                    public void onFailure(VerifyException verifyException6) {
                        VerifyException verifyException7;
                        p.this.f36901e = null;
                        if (eVar.d()) {
                            c cVarA = eVar.a(as.a(iA), p.this.f36903g, verifyException6.getCode(), verifyException6.getMessage());
                            cVarA.b(false);
                            cVarA.b("timeout_error");
                            eVar.a(cVarA);
                            eVar.c();
                            return;
                        }
                        if (z12) {
                            verifyException7 = new VerifyException(VerifyErr.C_UNSUPPORTED_OPERATOR);
                            VerifyErr verifyErr3 = VerifyErr.INNER_UNKNOWN_OPERATOR_TRIED;
                            verifyException7.setExtraDesc(verifyErr3.getMessage());
                            VerifyException verifyException8 = new VerifyException(verifyErr3);
                            verifyException8.setExtraDesc(strA);
                            eVar.a(verifyException7, verifyException8);
                        } else {
                            VerifyException verifyException9 = new VerifyException(eVar.a(as.a(iA), p.this.f36903g, verifyException6));
                            AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                            p.this.a(iA, (PreVerifyResult) null, eVar);
                            verifyException7 = verifyException9;
                        }
                        if (ai.a().t() == 1) {
                            verifyException7.setOperatorCode(verifyException6.getCode() + "");
                        }
                        p.this.a(true).a(eVar);
                        verifyException7.setSerialId(eVar.b());
                        AnonymousClass3 anonymousClass4 = AnonymousClass3.this;
                        p.this.a((OperationCallback<PreVerifyResult>) operationCallback, (PreVerifyResult) null, verifyException7);
                    }
                }, true, sVarArr);
            }

            @Override // cn.fly.verify.ar
            public void a(Throwable th2) {
                f.a().a(th2);
                VerifyErr verifyErr = VerifyErr.C_PREVERIFY_CATCH;
                VerifyException verifyException = new VerifyException(verifyErr.getCode(), as.a(th2));
                VerifyException verifyException2 = new VerifyException(verifyErr);
                eVar.a(verifyException2, verifyException);
                p.this.a(true).a(eVar);
                verifyException2.setSerialId(eVar.b());
                p.this.a((OperationCallback<PreVerifyResult>) operationCallback, (PreVerifyResult) null, verifyException2);
            }
        }, true, eVar);
    }

    public void b(final OperationCallback<VerifyResult> operationCallback) {
        f.a().b("[FlyVerify] ==>%s", "start verify");
        new ar() { // from class: cn.fly.verify.p.4
            @Override // cn.fly.verify.ar
            public void a() {
                e eVar = new e(g.VERIFY);
                try {
                    if (ax.h()) {
                        p.this.a((OperationCallback<VerifyResult>) operationCallback, (VerifyResult) null, new VerifyException(VerifyErr.C_PRIVACY_NOT_ACCEPTED_ERROR));
                        return;
                    }
                    eVar.a((String) null, (String) null, com.google.android.exoplayer2.text.ttml.d.f49798o0);
                    if (fz.d.b()) {
                        p.this.a(true).b();
                        p.this.a(false).a();
                        p.this.a(eVar, operationCallback);
                    } else {
                        f.a().a("not main process");
                        VerifyException verifyException = new VerifyException(VerifyErr.INNER_OTHER_EXCEPTION_ERR.getCode(), "not main process");
                        VerifyException verifyException2 = new VerifyException(VerifyErr.C_VERIFY_CATCH);
                        eVar.a(verifyException2, verifyException);
                        verifyException2.setSerialId(eVar.b());
                        p.this.a((OperationCallback<VerifyResult>) operationCallback, (VerifyResult) null, verifyException2);
                    }
                } catch (Throwable th2) {
                    String strA = as.a(th2);
                    VerifyErr verifyErr = VerifyErr.C_VERIFY_CATCH;
                    VerifyException verifyException3 = new VerifyException(verifyErr.getCode(), strA);
                    VerifyException verifyException4 = new VerifyException(verifyErr);
                    eVar.a(verifyException4, verifyException3);
                    verifyException4.setSerialId(eVar.b());
                    p.this.a((OperationCallback<VerifyResult>) operationCallback, (VerifyResult) null, verifyException4);
                }
            }

            @Override // cn.fly.verify.ar
            public void a(Throwable th2) {
                p.this.a(false).a(new VerifyException(VerifyErr.C_VERIFY_CATCH.getCode(), as.a(th2)));
            }
        }.b();
    }
}
