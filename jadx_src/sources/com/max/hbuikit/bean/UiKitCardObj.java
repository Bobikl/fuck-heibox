package com.max.hbuikit.bean;

import com.meituan.robust.ChangeQuickRedirect;
import dl.e;
import java.io.Serializable;

/* JADX INFO: compiled from: UiKitCardObj.kt */
/* JADX INFO: loaded from: classes13.dex */
public class UiKitCardObj extends UiKitLayoutObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String corner_radius;

    @e
    public final String getCorner_radius() {
        return this.corner_radius;
    }

    public final void setCorner_radius(@e String str) {
        this.corner_radius = str;
    }
}
