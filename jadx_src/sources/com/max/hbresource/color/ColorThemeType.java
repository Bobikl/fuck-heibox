package com.max.hbresource.color;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import kotlin.enums.EnumEntriesKt;
import kotlin.enums.a;

/* JADX INFO: compiled from: ColorThemeType.kt */
/* JADX INFO: loaded from: classes12.dex */
public enum ColorThemeType {
    Light,
    Dark;

    private static final /* synthetic */ a $ENTRIES = EnumEntriesKt.b(values());
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    public static a<ColorThemeType> getEntries() {
        return $ENTRIES;
    }

    public static ColorThemeType valueOf(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, c.k.f33584h1, new Class[]{String.class}, ColorThemeType.class);
        return (ColorThemeType) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(ColorThemeType.class, str));
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static ColorThemeType[] valuesCustom() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.k.f33561g1, new Class[0], ColorThemeType[].class);
        return (ColorThemeType[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
    }
}
