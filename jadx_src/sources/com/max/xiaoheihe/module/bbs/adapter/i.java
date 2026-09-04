package com.max.xiaoheihe.module.bbs.adapter;

import androidx.recyclerview.widget.DiffUtil;
import com.max.xiaoheihe.bean.bbs.HashtagObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ItemDiffCallbacks.kt */
/* JADX INFO: loaded from: classes10.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class i extends DiffUtil.ItemCallback<HashtagObj> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final i f80520a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f80521b = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    private i() {
    }

    public boolean a(@dl.d HashtagObj oldItem, @dl.d HashtagObj newItem) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{oldItem, newItem}, this, changeQuickRedirect, false, 27356, new Class[]{HashtagObj.class, HashtagObj.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(oldItem, "oldItem");
        f0.p(newItem, "newItem");
        return f0.g(oldItem.getName(), newItem.getName()) && f0.g(oldItem.getSub_title(), newItem.getSub_title());
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public /* bridge */ /* synthetic */ boolean areContentsTheSame(HashtagObj hashtagObj, HashtagObj hashtagObj2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hashtagObj, hashtagObj2}, this, changeQuickRedirect, false, 27358, new Class[]{Object.class, Object.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : a(hashtagObj, hashtagObj2);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public /* bridge */ /* synthetic */ boolean areItemsTheSame(HashtagObj hashtagObj, HashtagObj hashtagObj2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hashtagObj, hashtagObj2}, this, changeQuickRedirect, false, 27357, new Class[]{Object.class, Object.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : b(hashtagObj, hashtagObj2);
    }

    public boolean b(@dl.d HashtagObj oldItem, @dl.d HashtagObj newItem) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{oldItem, newItem}, this, changeQuickRedirect, false, 27355, new Class[]{HashtagObj.class, HashtagObj.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(oldItem, "oldItem");
        f0.p(newItem, "newItem");
        return f0.g(oldItem, newItem);
    }
}
