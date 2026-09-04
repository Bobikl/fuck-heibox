package com.max.xiaoheihe.bean.game.gamedata;

import com.max.hbcommon.bean.KeyDescObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class GameDataTrendObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String desc;
    private String time;
    private List<KeyDescObj> values;

    public String getDesc() {
        return this.desc;
    }

    public String getTime() {
        return this.time;
    }

    public List<KeyDescObj> getValues() {
        return this.values;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setTime(String str) {
        this.time = str;
    }

    public void setValues(List<KeyDescObj> list) {
        this.values = list;
    }
}
