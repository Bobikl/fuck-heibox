package com.huawei.hms.hmsscankit;

import android.os.RemoteException;
import android.util.Log;
import com.huawei.hms.hmsscankit.api.IOnErrorCallback;

/* JADX INFO: compiled from: OnErrorCallbackDelegate.java */
/* JADX INFO: loaded from: classes7.dex */
public class c extends IOnErrorCallback.Stub {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final OnErrorCallback f61126a;

    c(OnErrorCallback onErrorCallback) {
        this.f61126a = onErrorCallback;
    }

    @Override // com.huawei.hms.hmsscankit.api.IOnErrorCallback
    public void onError(int i10) throws RemoteException {
        if (this.f61126a != null) {
            Log.i("OnErrorCallbackDelegate", "onError: ErrorCode：" + i10);
            this.f61126a.onError(i10);
        }
    }
}
