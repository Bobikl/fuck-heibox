package com.max.xiaoheihe.bean;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import ob.b;

/* JADX INFO: compiled from: SourceInfoObj.kt */
/* JADX INFO: loaded from: classes3.dex */
public enum SourceType {
    game("game"),
    link("link"),
    mini_program(b.f132259k),
    web("web");

    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    private final String key;

    SourceType(String str) {
        this.key = str;
    }

    public static SourceType valueOf(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, c.m.lN, new Class[]{String.class}, SourceType.class);
        return (SourceType) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(SourceType.class, str));
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static SourceType[] valuesCustom() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.m.kN, new Class[0], SourceType[].class);
        return (SourceType[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
    }

    @d
    public final String getKey() {
        return this.key;
    }
}
