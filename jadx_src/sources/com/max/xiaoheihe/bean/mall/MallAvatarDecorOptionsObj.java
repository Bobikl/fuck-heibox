package com.max.xiaoheihe.bean.mall;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class MallAvatarDecorOptionsObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -5469642597329911986L;
    private List<MallAvatarDecorOptionObj> purchase_option;

    public List<MallAvatarDecorOptionObj> getPurchase_option() {
        return this.purchase_option;
    }

    public void setPurchase_option(List<MallAvatarDecorOptionObj> list) {
        this.purchase_option = list;
    }
}
