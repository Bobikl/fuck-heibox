package com.tencent.qmsp.oaid2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class v extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (context == null || intent == null) {
            return;
        }
        boolean z10 = false;
        int intExtra = intent.getIntExtra("openIdNotifyFlag", 0);
        x.b("shouldUpdateId, notifyFlag : " + intExtra);
        if (intExtra != 1) {
            if (intExtra == 2) {
                ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("openIdPackageList");
                if (stringArrayListExtra == null) {
                    return;
                }
                boolean zContains = stringArrayListExtra.contains(context.getPackageName());
                if (zContains) {
                    w wVarA = x.a().a(intent.getStringExtra("openIdType"));
                    if (wVarA != null) {
                        wVarA.b();
                        return;
                    }
                    return;
                }
                z10 = zContains;
            } else {
                z10 = true;
            }
            if (intExtra == 0 && z10) {
                w wVarA2 = x.a().a(intent.getStringExtra("openIdType"));
                if (wVarA2 != null) {
                    wVarA2.b();
                    return;
                }
                return;
            }
        } else if (TextUtils.equals(intent.getStringExtra("openIdPackage"), context.getPackageName())) {
            z10 = true;
        }
        if (z10) {
            w wVarA3 = x.a().a(intent.getStringExtra("openIdType"));
            if (wVarA3 != null) {
                wVarA3.b();
            }
        }
    }
}
