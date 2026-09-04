package com.starlightc.ucropplus.enums;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import kotlin.enums.EnumEntriesKt;
import kotlin.enums.a;

/* JADX INFO: compiled from: EDIT_MODE.kt */
/* JADX INFO: loaded from: classes4.dex */
public enum EDIT_MODE {
    IDLE,
    CROP,
    STICKER,
    TEXT,
    FILTER,
    MODULE,
    LABEL;

    private static final /* synthetic */ a $ENTRIES = EnumEntriesKt.b(values());
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    public static a<EDIT_MODE> getEntries() {
        return $ENTRIES;
    }

    public static EDIT_MODE valueOf(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 50034, new Class[]{String.class}, EDIT_MODE.class);
        return (EDIT_MODE) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(EDIT_MODE.class, str));
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static EDIT_MODE[] valuesCustom() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 50033, new Class[0], EDIT_MODE[].class);
        return (EDIT_MODE[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
    }
}
