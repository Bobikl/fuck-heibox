package com.ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public class InternalRemoteStreamSwitch {
    public boolean afterEnable;
    public int afterVideoIndex;
    public boolean beforeEnable;
    public int beforeVideoIndex;
    public boolean isScreen;
    public int reason;
    public String uid;

    public InternalRemoteStreamSwitch() {
    }

    public InternalRemoteStreamSwitch(String str, boolean z10, int i10, int i11, boolean z11, boolean z12, int i12) {
        this.uid = str;
        this.isScreen = z10;
        this.beforeVideoIndex = i10;
        this.afterVideoIndex = i11;
        this.beforeEnable = z11;
        this.afterEnable = z12;
        this.reason = i12;
    }

    @CalledByNative
    public static InternalRemoteStreamSwitch create(String str, boolean z10, int i10, int i11, boolean z11, boolean z12, int i12) {
        return new InternalRemoteStreamSwitch(str, z10, i10, i11, z11, z12, i12);
    }
}
