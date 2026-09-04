package com.max.xiaoheihe.bean.account.steaminfo;

import com.max.xiaoheihe.bean.account.SignDateObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class SignListResultObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String replenish_desc;
    private List<SignDateObj> sign_list;

    public String getReplenish_desc() {
        return this.replenish_desc;
    }

    public List<SignDateObj> getSign_list() {
        return this.sign_list;
    }

    public void setReplenish_desc(String str) {
        this.replenish_desc = str;
    }

    public void setSign_list(List<SignDateObj> list) {
        this.sign_list = list;
    }
}
