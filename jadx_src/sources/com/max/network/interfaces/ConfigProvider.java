package com.max.network.interfaces;

import com.max.network.config.NetworkConfig;
import com.max.network.interfaces.ApiService;
import dl.d;

/* JADX INFO: compiled from: ConfigProvider.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface ConfigProvider<T extends ApiService> {
    @d
    String getGroup();

    @d
    NetworkConfig provideConfig();
}
