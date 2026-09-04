package com.max.video.ui;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import kotlin.enums.EnumEntriesKt;
import kotlin.enums.a;

/* JADX INFO: compiled from: UIState.kt */
/* JADX INFO: loaded from: classes8.dex */
public enum UIState {
    Default,
    Recommend,
    Error;

    private static final /* synthetic */ a $ENTRIES = EnumEntriesKt.b(values());
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    public static a<UIState> getEntries() {
        return $ENTRIES;
    }

    public static UIState valueOf(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, c.m.Zp, new Class[]{String.class}, UIState.class);
        return (UIState) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(UIState.class, str));
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static UIState[] valuesCustom() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.m.Yp, new Class[0], UIState[].class);
        return (UIState[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
    }
}
