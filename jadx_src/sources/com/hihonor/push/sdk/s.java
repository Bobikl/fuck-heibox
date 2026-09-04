package com.hihonor.push.sdk;

import android.content.Context;
import com.hihonor.push.sdk.common.data.ApiException;
import com.hihonor.push.sdk.internal.HonorPushErrorEnum;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f60075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a0 f60076b = new a0();

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callable f60077a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ HonorPushCallback f60078b;

        public a(Callable callable, HonorPushCallback honorPushCallback) {
            this.f60077a = callable;
            this.f60078b = honorPushCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Object objCall = this.f60077a.call();
                s sVar = s.this;
                HonorPushCallback honorPushCallback = this.f60078b;
                sVar.getClass();
                b1.a(new t(sVar, honorPushCallback, objCall));
            } catch (ApiException e10) {
                s.a(s.this, this.f60078b, e10.getErrorCode(), e10.getMessage());
            } catch (Exception unused) {
                s sVar2 = s.this;
                HonorPushCallback honorPushCallback2 = this.f60078b;
                HonorPushErrorEnum honorPushErrorEnum = HonorPushErrorEnum.ERROR_INTERNAL_ERROR;
                s.a(sVar2, honorPushCallback2, honorPushErrorEnum.getErrorCode(), honorPushErrorEnum.getMessage());
            }
        }
    }

    public s(Context context) {
        this.f60075a = context;
    }

    public static void a(s sVar, HonorPushCallback honorPushCallback, int i10, String str) {
        sVar.getClass();
        b1.a(new u(sVar, honorPushCallback, i10, str));
    }

    public final <T> void a(Callable<T> callable, HonorPushCallback<T> honorPushCallback) {
        a aVar = new a(callable, honorPushCallback);
        b1 b1Var = b1.f60005d;
        if (b1Var.f60007b == null) {
            synchronized (b1Var.f60008c) {
                if (b1Var.f60007b == null) {
                    b1Var.f60007b = b1Var.b();
                }
            }
        }
        b1Var.f60007b.execute(aVar);
    }
}
