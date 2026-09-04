package com.max.xiaoheihe.bean;

import com.google.gson.annotations.SerializedName;
import com.max.xiaoheihe.bean.trade.TradeStateCheckItemObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class StateObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 533895515665688033L;
    private String btn_desc;
    private List<TradeStateCheckItemObj> check_results;
    private String left_percent;

    @SerializedName(alternate = {"btn_state"}, value = "state")
    private String state;

    public String getBtn_desc() {
        return this.btn_desc;
    }

    public List<TradeStateCheckItemObj> getCheck_results() {
        return this.check_results;
    }

    public String getLeft_percent() {
        return this.left_percent;
    }

    public String getState() {
        return this.state;
    }

    public void setBtn_desc(String str) {
        this.btn_desc = str;
    }

    public void setCheck_results(List<TradeStateCheckItemObj> list) {
        this.check_results = list;
    }

    public void setLeft_percent(String str) {
        this.left_percent = str;
    }

    public void setState(String str) {
        this.state = str;
    }
}
