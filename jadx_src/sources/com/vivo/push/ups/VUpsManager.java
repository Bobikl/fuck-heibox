package com.vivo.push.ups;

import android.content.Context;
import android.os.Bundle;
import com.vivo.push.PushClient;

/* JADX INFO: loaded from: classes4.dex */
public class VUpsManager {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static VUpsManager f106643a = new VUpsManager();
    }

    public static VUpsManager getInstance() {
        return a.f106643a;
    }

    public void onCommandResult(Context context, Bundle bundle) {
    }

    public void registerToken(Context context, String str, String str2, String str3, UPSRegisterCallback uPSRegisterCallback) {
        PushClient.getInstance(context).turnOnPush(new com.vivo.push.ups.a(this, uPSRegisterCallback, context));
    }

    public void turnOffPush(Context context, UPSTurnCallback uPSTurnCallback) {
        PushClient.getInstance(context).turnOffPush(new d(this, uPSTurnCallback));
    }

    public void turnOnPush(Context context, UPSTurnCallback uPSTurnCallback) {
        PushClient.getInstance(context).turnOnPush(new c(this, uPSTurnCallback));
    }

    public void unRegisterToken(Context context, UPSRegisterCallback uPSRegisterCallback) {
        PushClient.getInstance(context).turnOffPush(new b(this, uPSRegisterCallback));
    }
}
