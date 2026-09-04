package com.huawei.hms.common.api;

import android.app.Activity;
import com.huawei.hms.api.HuaweiApiClient;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes7.dex */
public interface ConnectionPostProcessor {
    void run(HuaweiApiClient huaweiApiClient, WeakReference<Activity> weakReference);
}
