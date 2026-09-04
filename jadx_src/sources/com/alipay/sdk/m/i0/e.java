package com.alipay.sdk.m.i0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import e5.a;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends BroadcastReceiver {
    /* JADX WARN: Code duplicated, block: B:16:0x0044  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        a aVar;
        if (context == null || intent == null) {
            return;
        }
        boolean zContains = false;
        int intExtra = intent.getIntExtra("openIdNotifyFlag", 0);
        e5.e.e("shouldUpdateId, notifyFlag : ".concat(String.valueOf(intExtra)));
        if (intExtra == 1) {
            if (TextUtils.equals(intent.getStringExtra("openIdPackage"), context.getPackageName())) {
                zContains = true;
            }
        } else if (intExtra == 2) {
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("openIdPackageList");
            if (stringArrayListExtra != null) {
                zContains = stringArrayListExtra.contains(context.getPackageName());
            }
        } else if (intExtra == 0) {
            zContains = true;
        }
        if (zContains) {
            String stringExtra = intent.getStringExtra("openIdType");
            e5.e eVarB = e5.e.b();
            if ("oaid".equals(stringExtra)) {
                aVar = eVarB.f118558b;
            } else if ("vaid".equals(stringExtra)) {
                aVar = eVarB.f118560d;
            } else if ("aaid".equals(stringExtra)) {
                aVar = eVarB.f118559c;
            } else {
                aVar = "udid".equals(stringExtra) ? eVarB.f118557a : null;
            }
            if (aVar == null) {
                return;
            }
            aVar.e();
        }
    }
}
