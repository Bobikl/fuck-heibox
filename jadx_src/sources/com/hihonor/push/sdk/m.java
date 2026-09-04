package com.hihonor.push.sdk;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.hihonor.push.framework.aidl.entity.PushTokenResult;
import com.hihonor.push.sdk.common.data.DownMsgType;
import com.hihonor.push.sdk.common.data.UpMsgType;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public class m implements Callable<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f60058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f60059b;

    public m(s sVar, boolean z10) {
        this.f60059b = sVar;
        this.f60058a = z10;
    }

    @Override // java.util.concurrent.Callable
    public String call() throws Exception {
        this.f60059b.f60076b.getClass();
        try {
            e1 e1Var = new e1(UpMsgType.REQUEST_PUSH_TOKEN, null);
            e1Var.f60031e = b.a();
            String pushToken = ((PushTokenResult) b.a(z.f60108c.a(e1Var))).getPushToken();
            if (this.f60058a) {
                s sVar = this.f60059b;
                sVar.getClass();
                if (!TextUtils.isEmpty(pushToken)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("event_type", DownMsgType.RECEIVE_TOKEN);
                    bundle.putString("push_token", pushToken);
                    g0 g0Var = new g0();
                    Context context = sVar.f60075a;
                    Log.i("MessengerSrvConnection", "start bind service.");
                    try {
                        Intent intent = new Intent();
                        intent.setPackage(context.getPackageName());
                        intent.setAction("com.hihonor.push.action.MESSAGING_EVENT");
                        Context applicationContext = context.getApplicationContext();
                        g0Var.f60036c = applicationContext;
                        g0Var.f60035b = bundle;
                        if (applicationContext.bindService(intent, g0Var, 1)) {
                            Log.i("MessengerSrvConnection", "bind service succeeded.");
                        }
                    } catch (Exception e10) {
                        e10.getMessage();
                    }
                }
            }
            return pushToken;
        } catch (Exception e11) {
            throw b.a(e11);
        }
    }
}
