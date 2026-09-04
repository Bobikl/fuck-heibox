package com.max.xiaoheihe.module.bbs.post_edit;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: PostTabActivityViewModel.kt */
/* JADX INFO: loaded from: classes10.dex */
public enum PostToolsV2TabType {
    GALLERY,
    GAME_SHOT,
    TEMPLATE;

    public static ChangeQuickRedirect changeQuickRedirect;

    public static PostToolsV2TabType valueOf(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 30776, new Class[]{String.class}, PostToolsV2TabType.class);
        return (PostToolsV2TabType) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(PostToolsV2TabType.class, str));
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static PostToolsV2TabType[] valuesCustom() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 30775, new Class[0], PostToolsV2TabType[].class);
        return (PostToolsV2TabType[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
    }
}
