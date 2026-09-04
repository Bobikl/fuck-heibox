package com.max.hbcommon.network;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: ConnectivityLiveData.kt */
/* JADX INFO: loaded from: classes9.dex */
public enum NetworkState {
    CONNECTED(true),
    DISCONNECTED(false),
    UNINITIALIZED(false);

    private static final /* synthetic */ kotlin.enums.a $ENTRIES = EnumEntriesKt.b(values());
    public static ChangeQuickRedirect changeQuickRedirect;
    private final boolean isConnected;

    NetworkState(boolean z10) {
        this.isConnected = z10;
    }

    @dl.d
    public static kotlin.enums.a<NetworkState> getEntries() {
        return $ENTRIES;
    }

    public static NetworkState valueOf(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 4226, new Class[]{String.class}, NetworkState.class);
        return (NetworkState) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(NetworkState.class, str));
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static NetworkState[] valuesCustom() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.e.Bc, new Class[0], NetworkState[].class);
        return (NetworkState[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
    }

    public final boolean isConnected() {
        return this.isConnected;
    }
}
