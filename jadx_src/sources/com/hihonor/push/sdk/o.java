package com.hihonor.push.sdk;

import com.hihonor.push.framework.aidl.entity.BooleanResult;
import com.hihonor.push.sdk.common.data.UpMsgType;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public class o implements Callable<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f60062a;

    public o(s sVar) {
        this.f60062a = sVar;
    }

    @Override // java.util.concurrent.Callable
    public Boolean call() throws Exception {
        this.f60062a.f60076b.getClass();
        try {
            c1 c1Var = new c1(UpMsgType.QUERY_PUSH_STATUS, null);
            c1Var.f60031e = b.a();
            return Boolean.valueOf(((BooleanResult) b.a(z.f60108c.a(c1Var))).getStatus());
        } catch (Exception e10) {
            throw b.a(e10);
        }
    }
}
