package com.alipay.android.phone.mrpc.core;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes6.dex */
public final class m extends FutureTask<u> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f38118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f38119b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(l lVar, Callable callable, q qVar) {
        super(callable);
        this.f38119b = lVar;
        this.f38118a = qVar;
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        o oVarA = this.f38118a.a();
        if (oVarA.f() == null) {
            super.done();
            return;
        }
        try {
            get();
            if (isCancelled() || oVarA.h()) {
                oVarA.g();
                if (isCancelled() && isDone()) {
                    return;
                }
                cancel(false);
            }
        } catch (InterruptedException e10) {
            e10.toString();
        } catch (CancellationException unused) {
            oVarA.g();
        } catch (ExecutionException e11) {
            if (e11.getCause() == null || !(e11.getCause() instanceof HttpException)) {
                e11.toString();
                return;
            }
            HttpException httpException = (HttpException) e11.getCause();
            httpException.getCode();
            httpException.getMsg();
        } catch (Throwable th2) {
            throw new RuntimeException("An error occured while executing http request", th2);
        }
    }
}
