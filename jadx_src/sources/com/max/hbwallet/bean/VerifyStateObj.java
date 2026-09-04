package com.max.hbwallet.bean;

import com.meituan.robust.ChangeQuickRedirect;
import dl.e;
import java.io.Serializable;

/* JADX INFO: compiled from: VerifyStateObj.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class VerifyStateObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String state;

    @e
    private String state_desc;

    public VerifyStateObj(@e String str, @e String str2) {
        this.state_desc = str;
        this.state = str2;
    }

    @e
    public final String getState() {
        return this.state;
    }

    @e
    public final String getState_desc() {
        return this.state_desc;
    }

    public final void setState(@e String str) {
        this.state = str;
    }

    public final void setState_desc(@e String str) {
        this.state_desc = str;
    }
}
