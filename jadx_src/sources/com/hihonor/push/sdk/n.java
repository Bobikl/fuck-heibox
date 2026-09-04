package com.hihonor.push.sdk;

import android.content.Context;
import com.hihonor.push.sdk.common.data.UpMsgType;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public class n implements Callable<Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f60060a;

    public n(s sVar) {
        this.f60060a = sVar;
    }

    @Override // java.util.concurrent.Callable
    public Void call() throws Exception {
        s sVar = this.f60060a;
        a0 a0Var = sVar.f60076b;
        Context context = sVar.f60075a;
        a0Var.getClass();
        try {
            d1 d1Var = new d1(UpMsgType.UNREGISTER_PUSH_TOKEN, null);
            d1Var.f60031e = b.a();
            b.a(z.f60108c.a(d1Var));
            d.f60011b.a(context, null);
            return null;
        } catch (Exception e10) {
            throw b.a(e10);
        }
    }
}
