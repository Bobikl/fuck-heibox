package com.max.video.player.info;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import kotlin.enums.EnumEntriesKt;
import kotlin.enums.a;

/* JADX INFO: compiled from: WindowMode.kt */
/* JADX INFO: loaded from: classes8.dex */
public enum WindowMode {
    NORMAL,
    FULLSCREEN,
    TINY;

    private static final /* synthetic */ a $ENTRIES = EnumEntriesKt.b(values());
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    public static a<WindowMode> getEntries() {
        return $ENTRIES;
    }

    public static WindowMode valueOf(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, c.m.kp, new Class[]{String.class}, WindowMode.class);
        return (WindowMode) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(WindowMode.class, str));
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static WindowMode[] valuesCustom() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.m.jp, new Class[0], WindowMode[].class);
        return (WindowMode[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
    }
}
