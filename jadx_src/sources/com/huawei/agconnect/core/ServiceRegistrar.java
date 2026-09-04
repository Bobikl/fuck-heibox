package com.huawei.agconnect.core;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public interface ServiceRegistrar {
    List<Service> getServices(Context context);

    void initialize(Context context);
}
