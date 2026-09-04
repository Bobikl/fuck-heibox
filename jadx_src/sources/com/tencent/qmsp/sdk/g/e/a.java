package com.tencent.qmsp.sdk.g.e;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class a extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (context == null || intent == null) {
            return;
        }
        boolean z10 = false;
        int intExtra = intent.getIntExtra("openIdNotifyFlag", 0);
        c.b("shouldUpdateId, notifyFlag : " + intExtra);
        if (intExtra != 1) {
            if (intExtra == 2) {
                ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("openIdPackageList");
                if (stringArrayListExtra == null) {
                    return;
                }
                boolean zContains = stringArrayListExtra.contains(context.getPackageName());
                if (zContains) {
                    b bVarA = c.a().a(intent.getStringExtra("openIdType"));
                    if (bVarA != null) {
                        bVarA.b();
                        return;
                    }
                    return;
                }
                z10 = zContains;
            } else {
                z10 = true;
            }
            if (intExtra == 0 && z10) {
                b bVarA2 = c.a().a(intent.getStringExtra("openIdType"));
                if (bVarA2 != null) {
                    bVarA2.b();
                    return;
                }
                return;
            }
        } else if (TextUtils.equals(intent.getStringExtra("openIdPackage"), context.getPackageName())) {
            z10 = true;
        }
        if (z10) {
            b bVarA3 = c.a().a(intent.getStringExtra("openIdType"));
            if (bVarA3 != null) {
                bVarA3.b();
            }
        }
    }
}
