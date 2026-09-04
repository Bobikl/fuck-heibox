package com.uber.autodispose.lifecycle;

import com.uber.autodispose.OutsideScopeException;

/* JADX INFO: loaded from: classes4.dex */
public class LifecycleEndedException extends OutsideScopeException {
    public LifecycleEndedException() {
        this("Lifecycle has ended!");
    }

    public LifecycleEndedException(String str) {
        super(str);
    }
}
