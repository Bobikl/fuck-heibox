package com.max.xiaoheihe.bean.game;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class GameSubscribeInfoObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -48646632816285194L;
    private GameMobileSubscribeAwardObj awards;
    private String count;
    private String need_phonenum;
    private String sub_default;

    public GameMobileSubscribeAwardObj getAwards() {
        return this.awards;
    }

    public String getCount() {
        return this.count;
    }

    public String getNeed_phonenum() {
        return this.need_phonenum;
    }

    public String getSub_default() {
        return this.sub_default;
    }

    public void setAwards(GameMobileSubscribeAwardObj gameMobileSubscribeAwardObj) {
        this.awards = gameMobileSubscribeAwardObj;
    }

    public void setCount(String str) {
        this.count = str;
    }

    public void setNeed_phonenum(String str) {
        this.need_phonenum = str;
    }

    public void setSub_default(String str) {
        this.sub_default = str;
    }
}
