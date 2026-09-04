package com.huawei.hms.support.api.client;

import com.huawei.hms.common.api.Releasable;
import com.huawei.hms.support.api.client.Result;
import com.huawei.hms.support.log.HMSLog;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated
public abstract class ResultCallbacks<R extends Result> implements ResultCallback<R> {
    private static final String TAG = "ResultCallbacks";

    public abstract void onFailure(Status status);

    @Override // com.huawei.hms.support.api.client.ResultCallback
    public final void onResult(R r10) {
        try {
            Status status = r10.getStatus();
            if (status.isSuccess()) {
                onSuccess(r10);
            } else {
                onFailure(status);
                if (r10 instanceof Releasable) {
                    ((Releasable) r10).release();
                }
            }
        } catch (Exception e10) {
            HMSLog.w(TAG, "Failed to release " + r10 + ", reason: " + e10);
        }
    }

    public abstract void onSuccess(R r10);
}
