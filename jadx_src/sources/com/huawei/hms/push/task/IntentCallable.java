package com.huawei.hms.push.task;

import android.content.Context;
import android.content.Intent;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.push.utils.PushBiUtil;
import com.huawei.hms.support.api.entity.push.PushNaming;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public class IntentCallable implements Callable<Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f61292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Intent f61293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f61294c;

    public IntentCallable(Context context, Intent intent, String str) {
        this.f61292a = context;
        this.f61293b = intent;
        this.f61294c = str;
    }

    @Override // java.util.concurrent.Callable
    public Void call() throws Exception {
        this.f61292a.sendBroadcast(this.f61293b);
        PushBiUtil.reportExit(this.f61292a, PushNaming.SET_NOTIFY_FLAG, this.f61294c, ErrorEnum.SUCCESS);
        return null;
    }
}
