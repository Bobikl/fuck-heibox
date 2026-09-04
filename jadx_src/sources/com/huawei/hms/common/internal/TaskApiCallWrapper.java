package com.huawei.hms.common.internal;

import com.huawei.hmf.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes7.dex */
public class TaskApiCallWrapper<TResult> extends BaseContentWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TaskApiCall<? extends AnyClient, TResult> f60560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TaskCompletionSource<TResult> f60561b;

    public TaskApiCallWrapper(TaskApiCall<? extends AnyClient, TResult> taskApiCall, TaskCompletionSource<TResult> taskCompletionSource) {
        super(1);
        this.f60560a = taskApiCall;
        this.f60561b = taskCompletionSource;
    }

    public TaskApiCall<? extends AnyClient, TResult> getTaskApiCall() {
        return this.f60560a;
    }

    public TaskCompletionSource<TResult> getTaskCompletionSource() {
        return this.f60561b;
    }
}
