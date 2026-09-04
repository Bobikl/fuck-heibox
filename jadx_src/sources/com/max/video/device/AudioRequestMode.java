package com.max.video.device;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: AudioRequestMode.kt */
/* JADX INFO: loaded from: classes8.dex */
public enum AudioRequestMode {
    NONE,
    GAIN,
    TRANSIENT,
    DUCK,
    EXCLUSIVE;

    private static final /* synthetic */ kotlin.enums.a $ENTRIES = EnumEntriesKt.b(values());
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    public static kotlin.enums.a<AudioRequestMode> getEntries() {
        return $ENTRIES;
    }

    public static AudioRequestMode valueOf(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.m.f34733fk, new Class[]{String.class}, AudioRequestMode.class);
        return (AudioRequestMode) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(AudioRequestMode.class, str));
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static AudioRequestMode[] valuesCustom() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.m.f34710ek, new Class[0], AudioRequestMode[].class);
        return (AudioRequestMode[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
    }
}
