package com.max.video.player.info;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import kotlin.enums.EnumEntriesKt;
import kotlin.enums.a;

/* JADX INFO: compiled from: NetworkType.kt */
/* JADX INFO: loaded from: classes8.dex */
public enum NetworkType {
    WIFI,
    MOBILE,
    GEN2,
    GEN3,
    GEN4,
    GEN5,
    NONE;

    private static final /* synthetic */ a $ENTRIES = EnumEntriesKt.b(values());
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    public static a<NetworkType> getEntries() {
        return $ENTRIES;
    }

    public static NetworkType valueOf(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, c.m.gp, new Class[]{String.class}, NetworkType.class);
        return (NetworkType) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(NetworkType.class, str));
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static NetworkType[] valuesCustom() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.m.fp, new Class[0], NetworkType[].class);
        return (NetworkType[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
    }
}
