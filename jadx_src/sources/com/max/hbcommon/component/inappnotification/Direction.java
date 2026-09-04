package com.max.hbcommon.component.inappnotification;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: Direction.kt */
/* JADX INFO: loaded from: classes9.dex */
public enum Direction {
    NONE,
    LEFT,
    RIGHT,
    UP,
    DOWN;

    private static final /* synthetic */ kotlin.enums.a $ENTRIES = EnumEntriesKt.b(values());
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.d
    public static kotlin.enums.a<Direction> getEntries() {
        return $ENTRIES;
    }

    public static Direction valueOf(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.e.f32082x, new Class[]{String.class}, Direction.class);
        return (Direction) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(Direction.class, str));
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static Direction[] valuesCustom() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.e.f32065w, new Class[0], Direction[].class);
        return (Direction[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
    }
}
