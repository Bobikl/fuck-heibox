package com.bytedance.sdk.open.aweme.base;

/* JADX INFO: loaded from: classes6.dex */
public interface IAPPCheckHelper {
    String getPackageName();

    String getRemoteAuthEntryActivity();

    boolean isAppInstalled();

    boolean isAppSupportAuthorization();

    boolean isAppSupportShare();
}
