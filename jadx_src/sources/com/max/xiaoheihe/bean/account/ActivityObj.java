package com.max.xiaoheihe.bean.account;

import com.max.xiaoheihe.bean.game.r6.R6ContentBaseObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class ActivityObj extends R6ContentBaseObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -4963791800918984200L;
    private String activity_id;
    private String content;
    private String icon_url;
    private String intranet_only;
    private String maxjia;
    private int need_bind_steam_id;
    private int need_login;
    private String title;
    private int type;

    public String getActivity_id() {
        return this.activity_id;
    }

    public String getContent() {
        return this.content;
    }

    public String getIcon_url() {
        return this.icon_url;
    }

    public String getIntranet_only() {
        return this.intranet_only;
    }

    public String getMaxjia() {
        return this.maxjia;
    }

    public int getNeed_bind_steam_id() {
        return this.need_bind_steam_id;
    }

    public int getNeed_login() {
        return this.need_login;
    }

    public String getTitle() {
        return this.title;
    }

    public int getType() {
        return this.type;
    }

    public void setActivity_id(String str) {
        this.activity_id = str;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setIcon_url(String str) {
        this.icon_url = str;
    }

    public void setIntranet_only(String str) {
        this.intranet_only = str;
    }

    public void setMaxjia(String str) {
        this.maxjia = str;
    }

    public void setNeed_bind_steam_id(int i10) {
        this.need_bind_steam_id = i10;
    }

    public void setNeed_login(int i10) {
        this.need_login = i10;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setType(int i10) {
        this.type = i10;
    }
}
