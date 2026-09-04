package com.taobao.accs.data;

import android.content.Intent;
import android.text.TextUtils;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Intent f98272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ MsgDistributeService f98273b;

    l(MsgDistributeService msgDistributeService, Intent intent) {
        this.f98273b = msgDistributeService;
        this.f98272a = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        ALog.i("MsgDistributeService", "onStartCommand send message", new Object[0]);
        ACCSManager.AccsRequest accsRequest = (ACCSManager.AccsRequest) this.f98272a.getSerializableExtra(Constants.KEY_SEND_REQDATA);
        String stringExtra = this.f98272a.getStringExtra("packageName");
        String stringExtra2 = this.f98272a.getStringExtra("appKey");
        String stringExtra3 = this.f98272a.getStringExtra(Constants.KEY_CONFIG_TAG);
        if (TextUtils.isEmpty(stringExtra3)) {
            stringExtra3 = stringExtra2;
        }
        ACCSManager.getAccsInstance(this.f98273b.getApplicationContext(), stringExtra2, stringExtra3).a(this.f98273b.getApplicationContext(), accsRequest, stringExtra, false);
    }
}
