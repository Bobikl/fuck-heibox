package com.max.xiaoheihe.utils.viewprioritymanager;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: PriorityCounter.kt */
/* JADX INFO: loaded from: classes13.dex */
public enum ViewPriority {
    BOTTOM(0),
    LOW(250),
    DEFAULT(500),
    HIGH(bb.c.b.f31017wb),
    TOP(1000);

    public static ChangeQuickRedirect changeQuickRedirect;
    private final int value;

    ViewPriority(int i10) {
        this.value = i10;
    }

    public static ViewPriority valueOf(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 49369, new Class[]{String.class}, ViewPriority.class);
        return (ViewPriority) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(ViewPriority.class, str));
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static ViewPriority[] valuesCustom() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 49368, new Class[0], ViewPriority[].class);
        return (ViewPriority[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
    }

    public final int getValue() {
        return this.value;
    }
}
