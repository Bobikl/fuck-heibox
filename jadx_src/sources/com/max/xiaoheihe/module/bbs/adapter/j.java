package com.max.xiaoheihe.module.bbs.adapter;

import androidx.recyclerview.widget.DiffUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ItemDiffCallbacks.kt */
/* JADX INFO: loaded from: classes10.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class j extends DiffUtil.ItemCallback<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final j f80522a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f80523b = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    private j() {
    }

    public boolean a(@dl.d String oldItem, @dl.d String newItem) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{oldItem, newItem}, this, changeQuickRedirect, false, 27360, new Class[]{String.class, String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(oldItem, "oldItem");
        f0.p(newItem, "newItem");
        return f0.g(oldItem, newItem);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public /* bridge */ /* synthetic */ boolean areContentsTheSame(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 27362, new Class[]{Object.class, Object.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : a(str, str2);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public /* bridge */ /* synthetic */ boolean areItemsTheSame(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 27361, new Class[]{Object.class, Object.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : b(str, str2);
    }

    public boolean b(@dl.d String oldItem, @dl.d String newItem) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{oldItem, newItem}, this, changeQuickRedirect, false, 27359, new Class[]{String.class, String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(oldItem, "oldItem");
        f0.p(newItem, "newItem");
        return f0.g(oldItem, newItem);
    }
}
