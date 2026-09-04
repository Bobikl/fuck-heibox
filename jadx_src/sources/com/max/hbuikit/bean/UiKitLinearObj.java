package com.max.hbuikit.bean;

import com.meituan.robust.ChangeQuickRedirect;
import dl.e;
import java.io.Serializable;

/* JADX INFO: compiled from: UiKitLinearObj.kt */
/* JADX INFO: loaded from: classes13.dex */
public class UiKitLinearObj extends UiKitLayoutObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String gravity;

    @e
    private String orientation;

    @e
    public final String getGravity() {
        return this.gravity;
    }

    @e
    public final String getOrientation() {
        return this.orientation;
    }

    public final void setGravity(@e String str) {
        this.gravity = str;
    }

    public final void setOrientation(@e String str) {
        this.orientation = str;
    }
}
