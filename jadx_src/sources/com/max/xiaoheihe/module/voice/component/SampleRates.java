package com.max.xiaoheihe.module.voice.component;

import com.google.android.exoplayer2.audio.j0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: Command.kt */
/* JADX INFO: loaded from: classes12.dex */
public enum SampleRates {
    S8000(8000),
    S11025(bb.c.l.Hk),
    S16000(16000),
    S22050(22050),
    S44100(44100),
    S48000(48000),
    S88200(88200),
    S96600(96600),
    S176400(176400),
    S192000(j0.f44139a),
    S352800(352800),
    S384000(384000);

    public static ChangeQuickRedirect changeQuickRedirect;
    private final int value;

    SampleRates(int i10) {
        this.value = i10;
    }

    public static SampleRates valueOf(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 46792, new Class[]{String.class}, SampleRates.class);
        return (SampleRates) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(SampleRates.class, str));
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static SampleRates[] valuesCustom() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 46791, new Class[0], SampleRates[].class);
        return (SampleRates[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
    }

    public final int getValue() {
        return this.value;
    }
}
