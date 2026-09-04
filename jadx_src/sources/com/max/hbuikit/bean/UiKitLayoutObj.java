package com.max.hbuikit.bean;

import com.meituan.robust.ChangeQuickRedirect;
import dl.e;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: compiled from: UiKitLayoutObj.kt */
/* JADX INFO: loaded from: classes13.dex */
public class UiKitLayoutObj extends UiKitViewObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<UiKitViewObj> children;
    private boolean clip_child = true;

    @e
    public final List<UiKitViewObj> getChildren() {
        return this.children;
    }

    public final boolean getClip_child() {
        return this.clip_child;
    }

    public final void setChildren(@e List<UiKitViewObj> list) {
        this.children = list;
    }

    public final void setClip_child(boolean z10) {
        this.clip_child = z10;
    }
}
