package com.max.hbshare.bean;

import android.app.Dialog;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public class PostOptionObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 1;
    private String checked;
    private OnClickListener click_listener;
    private String icon_tint_color;
    private String icon_url;
    private int image_resource_id;
    private String image_url;
    private String name;
    private String protocol;

    public interface OnClickListener {
        void onClick(Dialog dialog, View view, ImageView imageView, TextView textView);
    }

    public String getChecked() {
        return this.checked;
    }

    public OnClickListener getClick_listener() {
        return this.click_listener;
    }

    public String getIcon_tint_color() {
        return this.icon_tint_color;
    }

    public String getIcon_url() {
        return this.icon_url;
    }

    public int getImage_resource_id() {
        return this.image_resource_id;
    }

    public String getImage_url() {
        return this.image_url;
    }

    public String getName() {
        return this.name;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public void setChecked(String str) {
        this.checked = str;
    }

    public void setClick_listener(OnClickListener onClickListener) {
        this.click_listener = onClickListener;
    }

    public void setIcon_tint_color(String str) {
        this.icon_tint_color = str;
    }

    public void setIcon_url(String str) {
        this.icon_url = str;
    }

    public void setImage_resource_id(int i10) {
        this.image_resource_id = i10;
    }

    public void setImage_url(String str) {
        this.image_url = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setProtocol(String str) {
        this.protocol = str;
    }
}
