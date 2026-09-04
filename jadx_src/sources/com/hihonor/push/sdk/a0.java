package com.hihonor.push.sdk;

import com.hihonor.push.sdk.common.data.ApiException;
import com.hihonor.push.sdk.common.data.UpMsgType;

/* JADX INFO: loaded from: classes7.dex */
public class a0 {
    public Void a(boolean z10) throws ApiException {
        try {
            g1 g1Var = new g1(z10 ? UpMsgType.TURN_ON_PUSH : UpMsgType.TURN_OFF_PUSH, null);
            g1Var.f60031e = b.a();
            b.a(z.f60108c.a(g1Var));
            return null;
        } catch (Exception e10) {
            throw b.a(e10);
        }
    }
}
