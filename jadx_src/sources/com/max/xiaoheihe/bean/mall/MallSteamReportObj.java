package com.max.xiaoheihe.bean.mall;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class MallSteamReportObj implements Serializable {
    public static final int DATA_TYPE_KEY_STATE = 1;
    public static final int DATA_TYPE_PURCHASE_SUCCEED = 2;
    public static ChangeQuickRedirect changeQuickRedirect;
    private int data_type;
    private List<MallSteamKeyStateObj> keys;

    public int getData_type() {
        return this.data_type;
    }

    public List<MallSteamKeyStateObj> getKeys() {
        return this.keys;
    }

    public void setData_type(int i10) {
        this.data_type = i10;
    }

    public void setKeys(List<MallSteamKeyStateObj> list) {
        this.keys = list;
    }
}
