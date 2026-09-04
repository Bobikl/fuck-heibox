package com.max.xiaoheihe.bean.bbs;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class PayItemObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -5318355210552578995L;
    private Integer mi_coin;

    public Integer getMi_coin() {
        return this.mi_coin;
    }

    public void setMi_coin(Integer num) {
        this.mi_coin = num;
    }
}
