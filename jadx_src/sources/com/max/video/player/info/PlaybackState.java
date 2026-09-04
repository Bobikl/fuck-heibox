package com.max.video.player.info;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import kotlin.enums.EnumEntriesKt;
import kotlin.enums.a;

/* JADX INFO: compiled from: PlaybackState.kt */
/* JADX INFO: loaded from: classes8.dex */
public enum PlaybackState {
    IDLE,
    PREPARING,
    PREPARED,
    STARTED,
    PAUSED,
    COMPLETE,
    END;

    private static final /* synthetic */ a $ENTRIES = EnumEntriesKt.b(values());
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    public static a<PlaybackState> getEntries() {
        return $ENTRIES;
    }

    public static PlaybackState valueOf(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, c.m.ip, new Class[]{String.class}, PlaybackState.class);
        return (PlaybackState) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(PlaybackState.class, str));
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static PlaybackState[] valuesCustom() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.m.hp, new Class[0], PlaybackState[].class);
        return (PlaybackState[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
    }
}
