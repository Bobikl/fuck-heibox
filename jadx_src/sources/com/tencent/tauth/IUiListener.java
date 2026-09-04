package com.tencent.tauth;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public interface IUiListener {
    void onCancel();

    void onComplete(Object obj);

    void onError(UiError uiError);

    void onWarning(int i10);
}
