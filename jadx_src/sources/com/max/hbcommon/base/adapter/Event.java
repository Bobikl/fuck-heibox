package com.max.hbcommon.base.adapter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: RecyclerViewItemWatcher.kt */
/* JADX INFO: loaded from: classes9.dex */
public enum Event {
    SCROLL_IN,
    SCROLL_OUT;

    private static final /* synthetic */ kotlin.enums.a $ENTRIES = EnumEntriesKt.b(values());
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.d
    public static kotlin.enums.a<Event> getEntries() {
        return $ENTRIES;
    }

    public static Event valueOf(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.b.Zy, new Class[]{String.class}, Event.class);
        return (Event) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(Event.class, str));
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static Event[] valuesCustom() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.b.Yy, new Class[0], Event[].class);
        return (Event[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
    }
}
