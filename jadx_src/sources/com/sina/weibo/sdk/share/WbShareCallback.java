package com.sina.weibo.sdk.share;

import com.sina.weibo.sdk.common.UiError;

/* JADX INFO: loaded from: classes8.dex */
public interface WbShareCallback {
    void onCancel();

    void onComplete();

    void onError(UiError uiError);
}
