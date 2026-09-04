package com.max.xiaoheihe.accelworld;

import com.igexin.assist.sdk.AssistPushConsts;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: AccelWorldPush.kt */
/* JADX INFO: loaded from: classes3.dex */
public enum PUSH_CHANNEL_TYPE {
    HUAWEI(AssistPushConsts.HW_PREFIX),
    XIAOMI(AssistPushConsts.XM_PREFIX),
    OPPO(AssistPushConsts.OPPO_PREFIX),
    VIVO(AssistPushConsts.VIVO_PREFIX),
    HONOR(AssistPushConsts.HONOR_PREFIX);

    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.d
    private final String value;

    PUSH_CHANNEL_TYPE(String str) {
        this.value = str;
    }

    public static PUSH_CHANNEL_TYPE valueOf(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.m.hE, new Class[]{String.class}, PUSH_CHANNEL_TYPE.class);
        return (PUSH_CHANNEL_TYPE) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(PUSH_CHANNEL_TYPE.class, str));
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static PUSH_CHANNEL_TYPE[] valuesCustom() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.m.gE, new Class[0], PUSH_CHANNEL_TYPE[].class);
        return (PUSH_CHANNEL_TYPE[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
    }

    @dl.d
    public final String getValue() {
        return this.value;
    }
}
