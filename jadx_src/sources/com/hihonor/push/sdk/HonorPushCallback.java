package com.hihonor.push.sdk;

/* JADX INFO: loaded from: classes7.dex */
public interface HonorPushCallback<T> {
    void onFailure(int i10, String str);

    void onSuccess(T t10);
}
