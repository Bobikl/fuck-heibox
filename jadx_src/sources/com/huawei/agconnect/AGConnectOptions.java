package com.huawei.agconnect;

import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public interface AGConnectOptions {
    boolean getBoolean(String str);

    boolean getBoolean(String str, boolean z10);

    Context getContext();

    String getIdentifier();

    int getInt(String str);

    int getInt(String str, int i10);

    String getPackageName();

    AGCRoutePolicy getRoutePolicy();

    String getString(String str);

    String getString(String str, String str2);
}
