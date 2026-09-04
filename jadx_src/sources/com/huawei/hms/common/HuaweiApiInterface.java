package com.huawei.hms.common;

import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public interface HuaweiApiInterface {
    void setHostContext(Context context);

    void setInnerHms();

    void setSubAppId(String str) throws ApiException;
}
