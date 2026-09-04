package com.max.heybox.hblog;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: HBLogFmt.kt */
/* JADX INFO: loaded from: classes2.dex */
public enum HBLogFmt {
    ;

    private static final /* synthetic */ kotlin.enums.a $ENTRIES = EnumEntriesKt.b(values());
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.d
    public static kotlin.enums.a<HBLogFmt> getEntries() {
        return $ENTRIES;
    }

    public static HBLogFmt valueOf(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.l.f34269l7, new Class[]{String.class}, HBLogFmt.class);
        return (HBLogFmt) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(HBLogFmt.class, str));
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static HBLogFmt[] valuesCustom() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.l.f34246k7, new Class[0], HBLogFmt[].class);
        return (HBLogFmt[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
    }
}
