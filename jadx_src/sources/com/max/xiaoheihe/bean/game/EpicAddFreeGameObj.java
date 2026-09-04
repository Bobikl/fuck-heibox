package com.max.xiaoheihe.bean.game;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class EpicAddFreeGameObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 1884172377363043333L;
    private String appid;
    private String home_name;
    private String name;
    private String type;

    public String getAppid() {
        return this.appid;
    }

    public String getHome_name() {
        return this.home_name;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public void setAppid(String str) {
        this.appid = str;
    }

    public void setHome_name(String str) {
        this.home_name = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setType(String str) {
        this.type = str;
    }
}
