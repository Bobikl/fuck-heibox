package com.max.xiaoheihe.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: DeviceServiceUtil.kt */
/* JADX INFO: loaded from: classes13.dex */
public enum PredefinedVibratorEffect {
    LIGHT(0, 10, 110),
    MEDIUM(1, 15, 120),
    HEAVY(2, 25, 200),
    SOFT(3, 40, 100),
    RIGID(4, 10, 200),
    NOTI(5, 100, 100);

    public static ChangeQuickRedirect changeQuickRedirect;
    private final int amplitude;
    private final long duration;
    private final int typeCode;

    PredefinedVibratorEffect(int i10, long j10, int i11) {
        this.typeCode = i10;
        this.duration = j10;
        this.amplitude = i11;
    }

    public static PredefinedVibratorEffect valueOf(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 48796, new Class[]{String.class}, PredefinedVibratorEffect.class);
        return (PredefinedVibratorEffect) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(PredefinedVibratorEffect.class, str));
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static PredefinedVibratorEffect[] valuesCustom() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 48795, new Class[0], PredefinedVibratorEffect[].class);
        return (PredefinedVibratorEffect[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
    }

    public final int getAmplitude() {
        return this.amplitude;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final int getTypeCode() {
        return this.typeCode;
    }
}
