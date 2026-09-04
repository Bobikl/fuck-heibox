package com.max.hbuikit.bean;

import com.meituan.robust.ChangeQuickRedirect;
import dl.e;
import java.io.Serializable;

/* JADX INFO: compiled from: UiKitScrollObj.kt */
/* JADX INFO: loaded from: classes13.dex */
public class UiKitScrollObj extends UiKitLayoutObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String scroll_orientation;

    @e
    public final String getScroll_orientation() {
        return this.scroll_orientation;
    }

    public final void setScroll_orientation(@e String str) {
        this.scroll_orientation = str;
    }
}
