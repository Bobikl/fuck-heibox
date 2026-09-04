package com.max.hbresource.color;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import kotlin.enums.EnumEntriesKt;
import kotlin.enums.a;

/* JADX INFO: compiled from: ColorUsage.kt */
/* JADX INFO: loaded from: classes12.dex */
public enum ColorUsage {
    Foreground,
    Background,
    Image,
    Other;

    private static final /* synthetic */ a $ENTRIES = EnumEntriesKt.b(values());
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    public static a<ColorUsage> getEntries() {
        return $ENTRIES;
    }

    public static ColorUsage valueOf(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, c.k.f33630j1, new Class[]{String.class}, ColorUsage.class);
        return (ColorUsage) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(ColorUsage.class, str));
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static ColorUsage[] valuesCustom() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.k.f33607i1, new Class[0], ColorUsage[].class);
        return (ColorUsage[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
    }
}
