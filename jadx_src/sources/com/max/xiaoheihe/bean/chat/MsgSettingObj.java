package com.max.xiaoheihe.bean.chat;

import com.max.hbcommon.bean.KeyDescObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class MsgSettingObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String level;
    private List<KeyDescObj> list;

    public String getLevel() {
        return this.level;
    }

    public List<KeyDescObj> getList() {
        return this.list;
    }

    public void setLevel(String str) {
        this.level = str;
    }

    public void setList(List<KeyDescObj> list) {
        this.list = list;
    }
}
