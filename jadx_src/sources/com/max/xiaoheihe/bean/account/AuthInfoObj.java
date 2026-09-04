package com.max.xiaoheihe.bean.account;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class AuthInfoObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -7196918687227495363L;
    private Boolean certified;
    private String has_password;
    private boolean is_maxjia;
    private String name;
    private String src_desc;
    private String src_id;
    private String src_id_type;

    public Boolean getCertified() {
        return this.certified;
    }

    public String getHas_password() {
        return this.has_password;
    }

    public String getName() {
        return this.name;
    }

    public String getSrc_desc() {
        return this.src_desc;
    }

    public String getSrc_id() {
        return this.src_id;
    }

    public String getSrc_id_type() {
        return this.src_id_type;
    }

    public boolean isIs_maxjia() {
        return this.is_maxjia;
    }

    public void setCertified(Boolean bool) {
        this.certified = bool;
    }

    public void setHas_password(String str) {
        this.has_password = str;
    }

    public void setIs_maxjia(boolean z10) {
        this.is_maxjia = z10;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setSrc_desc(String str) {
        this.src_desc = str;
    }

    public void setSrc_id(String str) {
        this.src_id = str;
    }

    public void setSrc_id_type(String str) {
        this.src_id_type = str;
    }
}
