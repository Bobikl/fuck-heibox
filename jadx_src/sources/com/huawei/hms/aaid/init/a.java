package com.huawei.hms.aaid.init;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.opendevice.l;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Util;

/* JADX INFO: compiled from: AutoInitRunnable.java */
/* JADX INFO: loaded from: classes7.dex */
public class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f60251a;

    a(Context context) {
        this.f60251a = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            int internalCode = ErrorEnum.SUCCESS.getInternalCode();
            String token = null;
            try {
                token = HmsInstanceId.getInstance(this.f60251a).getToken(Util.getAppId(this.f60251a), null);
                HMSLog.i("AutoInit", "Push init succeed");
                if (TextUtils.isEmpty(token)) {
                    return;
                }
            } catch (ApiException e10) {
                internalCode = e10.getStatusCode();
                HMSLog.e("AutoInit", "new Push init failed");
            }
            try {
                Bundle bundle = this.f60251a.getPackageManager().getApplicationInfo(this.f60251a.getPackageName(), 128).metaData;
                if (bundle == null || bundle.getString("com.huawei.hms.client.service.name:push") == null) {
                    HMSLog.i("AutoInit", "push kit sdk not exists");
                } else {
                    Intent intent = new Intent("com.huawei.push.action.MESSAGING_EVENT");
                    intent.setPackage(this.f60251a.getPackageName());
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("message_type", "new_token");
                    bundle2.putString(RemoteMessageConst.DEVICE_TOKEN, token);
                    bundle2.putInt("error", internalCode);
                    if (!new l().a(this.f60251a, bundle2, intent)) {
                        HMSLog.e("AutoInit", "start service failed");
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
                HMSLog.i("AutoInit", "push kit sdk not exists");
            }
        } catch (Exception e11) {
            HMSLog.e("AutoInit", "Push init failed", e11);
        }
    }
}
