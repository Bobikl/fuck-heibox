package com.efs.sdk.base.core.f;

import android.os.Handler;
import android.os.Message;
import androidx.annotation.n0;
import com.efs.sdk.base.core.controller.ControllerCenter;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ControllerCenter f42534a;

    a() {
        super(com.efs.sdk.base.core.util.concurrent.a.f42576a.getLooper());
        sendEmptyMessageDelayed(0, 60000L);
    }

    abstract void a();

    @Override // android.os.Handler
    public void handleMessage(@n0 Message message) {
        super.handleMessage(message);
        a();
        sendEmptyMessageDelayed(0, 60000L);
    }
}
