package com.max.xiaoheihe.bean.game;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class GameCenterBubbleObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -4714468554283173131L;
    private String color;
    private String desc;
    private String tips_time;

    public String getColor() {
        return this.color;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getTips_time() {
        return this.tips_time;
    }

    public void setColor(String str) {
        this.color = str;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setTips_time(String str) {
        this.tips_time = str;
    }
}
