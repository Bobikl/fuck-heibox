package com.hihonor.push.sdk;

import android.util.Log;
import org.json.JSONException;

/* JADX INFO: loaded from: classes7.dex */
public class a implements k0<HonorPushDataMsg> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HonorMessageService f59999a;

    public a(HonorMessageService honorMessageService) {
        this.f59999a = honorMessageService;
    }

    @Override // com.hihonor.push.sdk.k0
    public void a(a1<HonorPushDataMsg> a1Var) {
        if (!a1Var.e()) {
            boolean z10 = a1Var.b() instanceof JSONException;
            return;
        }
        HonorPushDataMsg honorPushDataMsgC = a1Var.c();
        if (honorPushDataMsgC == null) {
            Log.i("HonorMessageService", "parse remote data failed.");
            return;
        }
        Log.i("HonorMessageService", "onMessageReceived. msgId is " + honorPushDataMsgC.getMsgId());
        this.f59999a.onMessageReceived(honorPushDataMsgC);
    }
}
