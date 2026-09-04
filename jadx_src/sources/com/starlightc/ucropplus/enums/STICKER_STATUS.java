package com.starlightc.ucropplus.enums;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import kotlin.enums.EnumEntriesKt;
import kotlin.enums.a;

/* JADX INFO: compiled from: STICKER_STATUS.kt */
/* JADX INFO: loaded from: classes4.dex */
public enum STICKER_STATUS {
    IDLE,
    MOVE,
    DELETE,
    EDIT,
    ROTATE;

    private static final /* synthetic */ a $ENTRIES = EnumEntriesKt.b(values());
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    public static a<STICKER_STATUS> getEntries() {
        return $ENTRIES;
    }

    public static STICKER_STATUS valueOf(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 50036, new Class[]{String.class}, STICKER_STATUS.class);
        return (STICKER_STATUS) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(STICKER_STATUS.class, str));
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static STICKER_STATUS[] valuesCustom() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 50035, new Class[0], STICKER_STATUS[].class);
        return (STICKER_STATUS[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
    }
}
