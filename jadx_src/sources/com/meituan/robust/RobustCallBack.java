package com.meituan.robust;

import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public interface RobustCallBack {
    void exceptionNotify(Throwable th2, String str);

    void logNotify(String str, String str2);

    void onPatchApplied(boolean z10, Patch patch);

    void onPatchFetched(boolean z10, boolean z11, Patch patch);

    void onPatchListFetched(boolean z10, boolean z11, List<Patch> list);
}
