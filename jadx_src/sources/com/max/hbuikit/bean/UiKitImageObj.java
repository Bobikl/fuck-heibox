package com.max.hbuikit.bean;

import com.meituan.robust.ChangeQuickRedirect;
import dl.e;
import java.io.Serializable;

/* JADX INFO: compiled from: UiKitImageObj.kt */
/* JADX INFO: loaded from: classes13.dex */
public class UiKitImageObj extends UiKitViewObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String image_color;

    @e
    private String image_radius;

    @e
    private String image_url;

    @e
    private String new_image_url;

    @e
    public final String getImage_color() {
        return this.image_color;
    }

    @e
    public final String getImage_radius() {
        return this.image_radius;
    }

    @e
    public final String getImage_url() {
        return this.image_url;
    }

    @e
    public final String getNew_image_url() {
        return this.new_image_url;
    }

    public final void setImage_color(@e String str) {
        this.image_color = str;
    }

    public final void setImage_radius(@e String str) {
        this.image_radius = str;
    }

    public final void setImage_url(@e String str) {
        this.image_url = str;
    }

    public final void setNew_image_url(@e String str) {
        this.new_image_url = str;
    }
}
