package com.huawei.hms.mlsdk.common;

import com.huawei.hms.mlsdk.common.internal.client.event.MonitorEvent;
import com.huawei.hms.mlsdk.common.internal.client.event.MonitorResult;

/* JADX INFO: loaded from: classes7.dex */
public interface AnalyzerMonitor {
    MonitorResult receive(MonitorEvent monitorEvent);
}
