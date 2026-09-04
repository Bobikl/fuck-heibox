package com.igexin.assist.control;

import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public interface AbstractPushManager {
    String getToken(Context context);

    void register(Context context);

    void setSilentTime(Context context, int i10, int i11);

    void turnOffPush(Context context);

    void turnOnPush(Context context);

    void unregister(Context context);
}
