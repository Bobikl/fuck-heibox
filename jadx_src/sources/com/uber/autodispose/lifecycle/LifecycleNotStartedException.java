package com.uber.autodispose.lifecycle;

import com.uber.autodispose.OutsideScopeException;

/* JADX INFO: loaded from: classes4.dex */
public class LifecycleNotStartedException extends OutsideScopeException {
    public LifecycleNotStartedException() {
        this("Lifecycle hasn't started!");
    }

    public LifecycleNotStartedException(String str) {
        super(str);
    }
}
