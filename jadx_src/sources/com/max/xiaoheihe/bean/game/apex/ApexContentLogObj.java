package com.max.xiaoheihe.bean.game.apex;

import com.max.xiaoheihe.bean.game.r6.R6KVObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ApexContentLogObj extends ApexContentBaseObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<R6KVObj> data;
    private String detail_url;
    private String icon;
    private String legend;
    private String time;

    public List<R6KVObj> getData() {
        return this.data;
    }

    public String getDetail_url() {
        return this.detail_url;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getLegend() {
        return this.legend;
    }

    public String getTime() {
        return this.time;
    }

    public void setData(List<R6KVObj> list) {
        this.data = list;
    }

    public void setDetail_url(String str) {
        this.detail_url = str;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setLegend(String str) {
        this.legend = str;
    }

    public void setTime(String str) {
        this.time = str;
    }
}
