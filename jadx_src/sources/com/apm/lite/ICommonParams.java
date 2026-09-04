package com.apm.lite;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public interface ICommonParams {
    Map<String, Object> getCommonParams();

    String getDeviceId();

    List<String> getPatchInfo();

    Map<String, Integer> getPluginInfo();

    String getSessionId();

    long getUserId();
}
