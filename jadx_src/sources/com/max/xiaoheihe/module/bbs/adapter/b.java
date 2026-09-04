package com.max.xiaoheihe.module.bbs.adapter;

import androidx.recyclerview.widget.DiffUtil;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ItemDiffCallbacks.kt */
/* JADX INFO: loaded from: classes10.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class b extends DiffUtil.ItemCallback<BBSTopicObj> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final b f80312a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f80313b = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    private b() {
    }

    public boolean a(@dl.d BBSTopicObj oldItem, @dl.d BBSTopicObj newItem) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{oldItem, newItem}, this, changeQuickRedirect, false, 27173, new Class[]{BBSTopicObj.class, BBSTopicObj.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(oldItem, "oldItem");
        f0.p(newItem, "newItem");
        return f0.g(oldItem.getTopic_id(), newItem.getTopic_id());
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public /* bridge */ /* synthetic */ boolean areContentsTheSame(BBSTopicObj bBSTopicObj, BBSTopicObj bBSTopicObj2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bBSTopicObj, bBSTopicObj2}, this, changeQuickRedirect, false, 27175, new Class[]{Object.class, Object.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : a(bBSTopicObj, bBSTopicObj2);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public /* bridge */ /* synthetic */ boolean areItemsTheSame(BBSTopicObj bBSTopicObj, BBSTopicObj bBSTopicObj2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bBSTopicObj, bBSTopicObj2}, this, changeQuickRedirect, false, 27174, new Class[]{Object.class, Object.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : b(bBSTopicObj, bBSTopicObj2);
    }

    public boolean b(@dl.d BBSTopicObj oldItem, @dl.d BBSTopicObj newItem) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{oldItem, newItem}, this, changeQuickRedirect, false, 27172, new Class[]{BBSTopicObj.class, BBSTopicObj.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(oldItem, "oldItem");
        f0.p(newItem, "newItem");
        return f0.g(oldItem, newItem);
    }
}
