package com.max.xiaoheihe.bean.account;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class UserPermissionObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -4277387077011829718L;
    private String bbs_advance_permission;
    private String bbs_basic_permission;
    private String bbs_root_permission;
    private String bbs_super_permission;
    private String news_permission;
    private String visitor_enabled;

    public String getBbs_advance_permission() {
        return this.bbs_advance_permission;
    }

    public String getBbs_basic_permission() {
        return this.bbs_basic_permission;
    }

    public String getBbs_root_permission() {
        return this.bbs_root_permission;
    }

    public String getBbs_super_permission() {
        return this.bbs_super_permission;
    }

    public String getNews_permission() {
        return this.news_permission;
    }

    public String getVisitor_enabled() {
        return this.visitor_enabled;
    }

    public void setBbs_advance_permission(String str) {
        this.bbs_advance_permission = str;
    }

    public void setBbs_basic_permission(String str) {
        this.bbs_basic_permission = str;
    }

    public void setBbs_root_permission(String str) {
        this.bbs_root_permission = str;
    }

    public void setBbs_super_permission(String str) {
        this.bbs_super_permission = str;
    }

    public void setNews_permission(String str) {
        this.news_permission = str;
    }

    public void setVisitor_enabled(String str) {
        this.visitor_enabled = str;
    }
}
