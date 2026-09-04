package com.huawei.hms.hmsscankit;

import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.hms.hmsscankit.api.IOnResultCallback;
import com.huawei.hms.ml.scan.HmsScan;
import com.huawei.hms.scankit.p.o4;

/* JADX INFO: compiled from: OnResultCallbackDelegate.java */
/* JADX INFO: loaded from: classes7.dex */
public class e extends IOnResultCallback.Stub {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final OnResultCallback f61128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f61129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f61130c;

    e(OnResultCallback onResultCallback, boolean z10) {
        this.f61128a = onResultCallback;
        this.f61130c = z10;
    }

    @Override // com.huawei.hms.hmsscankit.api.IOnResultCallback
    public void onResult(HmsScan[] hmsScanArr) throws RemoteException {
        HmsScan hmsScan;
        o4.d("OnResultCallbackDelegat", "result callback sdk continueScan" + this.f61130c);
        if (this.f61130c) {
            this.f61128a.onResult(hmsScanArr);
            return;
        }
        if (hmsScanArr == null || hmsScanArr.length <= 0 || (hmsScan = hmsScanArr[0]) == null || TextUtils.equals(this.f61129b, hmsScan.getOriginalValue())) {
            return;
        }
        this.f61129b = hmsScanArr[0].getOriginalValue();
        o4.d("OnResultCallbackDelegat", "result callback sdk continueScan" + this.f61130c);
        this.f61128a.onResult(hmsScanArr);
    }
}
