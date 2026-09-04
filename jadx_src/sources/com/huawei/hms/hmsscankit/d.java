package com.huawei.hms.hmsscankit;

import android.os.RemoteException;
import com.huawei.hms.hmsscankit.api.IOnLightCallback;

/* JADX INFO: compiled from: OnLightVisibleCallBackDelegata.java */
/* JADX INFO: loaded from: classes7.dex */
public class d extends IOnLightCallback.Stub {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final OnLightVisibleCallBack f61127a;

    d(OnLightVisibleCallBack onLightVisibleCallBack) {
        this.f61127a = onLightVisibleCallBack;
    }

    @Override // com.huawei.hms.hmsscankit.api.IOnLightCallback
    public void onVisibleChanged(boolean z10) throws RemoteException {
        this.f61127a.onVisibleChanged(z10);
    }
}
