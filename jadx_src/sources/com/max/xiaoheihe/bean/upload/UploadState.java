package com.max.xiaoheihe.bean.upload;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: UploadInfoObj.kt */
/* JADX INFO: loaded from: classes3.dex */
public enum UploadState {
    NONE,
    SUCCESS,
    FAILED,
    ON_PROGRESS;

    public static ChangeQuickRedirect changeQuickRedirect;

    public static UploadState valueOf(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 16227, new Class[]{String.class}, UploadState.class);
        return (UploadState) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(UploadState.class, str));
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static UploadState[] valuesCustom() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 16226, new Class[0], UploadState[].class);
        return (UploadState[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
    }
}
