package com.huawei.hms.common.internal;

import android.os.Parcelable;
import com.huawei.hmf.tasks.CancellationToken;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.internal.AnyClient;
import com.huawei.hms.support.log.HMSLog;

/* JADX INFO: loaded from: classes7.dex */
public abstract class TaskApiCall<ClientT extends AnyClient, ResultT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f60554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f60555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Parcelable f60556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f60557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CancellationToken f60558e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f60559f;

    @Deprecated
    public TaskApiCall(String str, String str2) {
        this.f60559f = 1;
        this.f60554a = str;
        this.f60555b = str2;
        this.f60556c = null;
        this.f60557d = null;
    }

    public TaskApiCall(String str, String str2, String str3) {
        this.f60559f = 1;
        this.f60554a = str;
        this.f60555b = str2;
        this.f60556c = null;
        this.f60557d = str3;
    }

    public TaskApiCall(String str, String str2, String str3, int i10) {
        this.f60554a = str;
        this.f60555b = str2;
        this.f60556c = null;
        this.f60557d = str3;
        this.f60559f = i10;
    }

    protected abstract void doExecute(ClientT clientt, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource<ResultT> taskCompletionSource);

    public int getApiLevel() {
        return this.f60559f;
    }

    @Deprecated
    public int getMinApkVersion() {
        return 30000000;
    }

    public Parcelable getParcelable() {
        return this.f60556c;
    }

    public String getRequestJson() {
        return this.f60555b;
    }

    public CancellationToken getToken() {
        return this.f60558e;
    }

    public String getTransactionId() {
        return this.f60557d;
    }

    public String getUri() {
        return this.f60554a;
    }

    public final void onResponse(ClientT clientt, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource<ResultT> taskCompletionSource) {
        CancellationToken cancellationToken = this.f60558e;
        if (cancellationToken != null && cancellationToken.isCancellationRequested()) {
            HMSLog.i("TaskApiCall", "This Task has been canceled, uri:" + this.f60554a + ", transactionId:" + this.f60557d);
            return;
        }
        HMSLog.i("TaskApiCall", "doExecute, uri:" + this.f60554a + ", errorCode:" + responseErrorCode.getErrorCode() + ", transactionId:" + this.f60557d);
        doExecute(clientt, responseErrorCode, str, taskCompletionSource);
    }

    public void setApiLevel(int i10) {
        this.f60559f = i10;
    }

    public void setParcelable(Parcelable parcelable) {
        this.f60556c = parcelable;
    }

    public void setToken(CancellationToken cancellationToken) {
        this.f60558e = cancellationToken;
    }

    public void setTransactionId(String str) {
        this.f60557d = str;
    }
}
