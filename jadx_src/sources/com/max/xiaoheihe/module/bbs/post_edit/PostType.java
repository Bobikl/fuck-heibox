package com.max.xiaoheihe.module.bbs.post_edit;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: PostTabActivity.kt */
/* JADX INFO: loaded from: classes10.dex */
public enum PostType {
    Picture,
    Article,
    Video;

    public static ChangeQuickRedirect changeQuickRedirect;

    public static PostType valueOf(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 30778, new Class[]{String.class}, PostType.class);
        return (PostType) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(PostType.class, str));
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static PostType[] valuesCustom() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 30777, new Class[0], PostType[].class);
        return (PostType[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
    }
}
