package com.max.xiaoheihe.bean.game;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class FreeLicenseObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -4246180551960013643L;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private String f76968id;
    private String platform;
    private String product_home_name;
    private String type;

    public String getId() {
        return this.f76968id;
    }

    public String getPlatform() {
        return this.platform;
    }

    public String getProduct_home_name() {
        return this.product_home_name;
    }

    public String getType() {
        return this.type;
    }

    public void setId(String str) {
        this.f76968id = str;
    }

    public void setPlatform(String str) {
        this.platform = str;
    }

    public void setProduct_home_name(String str) {
        this.product_home_name = str;
    }

    public void setType(String str) {
        this.type = str;
    }
}
