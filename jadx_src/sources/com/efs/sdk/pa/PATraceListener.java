package com.efs.sdk.pa;

/* JADX INFO: loaded from: classes6.dex */
public interface PATraceListener {
    void onAnrTrace();

    void onCheck(boolean z10);

    void onUnexcept(Object obj);
}
