package com.heytap.msp.push.callback;

/* JADX INFO: loaded from: classes7.dex */
public interface ICallBackResultService {
    void onError(int i10, String str);

    void onGetNotificationStatus(int i10, int i11);

    void onGetPushStatus(int i10, int i11);

    void onRegister(int i10, String str);

    void onSetPushTime(int i10, String str);

    void onUnRegister(int i10);
}
