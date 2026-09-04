package com.max.hbcommon.component.dialog;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import kotlin.enums.EnumEntriesKt;
import kotlin.enums.a;

/* JADX INFO: compiled from: HBDialogTopInfo.kt */
/* JADX INFO: loaded from: classes9.dex */
public enum TopViewStyle {
    Style_56,
    Style_81;

    private static final /* synthetic */ a $ENTRIES = EnumEntriesKt.b(values());
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    public static a<TopViewStyle> getEntries() {
        return $ENTRIES;
    }

    public static TopViewStyle valueOf(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, c.d.Lp, new Class[]{String.class}, TopViewStyle.class);
        return (TopViewStyle) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(TopViewStyle.class, str));
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static TopViewStyle[] valuesCustom() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.d.Kp, new Class[0], TopViewStyle[].class);
        return (TopViewStyle[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
    }
}
