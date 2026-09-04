package com.max.xiaoheihe.bean.game.r6;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class R6ContentTrendObj extends R6ContentBaseObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<R6KVObj> content;
    private String desc;
    private String type;

    public List<R6KVObj> getContent() {
        return this.content;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getType() {
        return this.type;
    }

    public void setContent(List<R6KVObj> list) {
        this.content = list;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setType(String str) {
        this.type = str;
    }
}
