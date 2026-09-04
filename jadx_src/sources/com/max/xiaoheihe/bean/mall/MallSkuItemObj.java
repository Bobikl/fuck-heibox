package com.max.xiaoheihe.bean.mall;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class MallSkuItemObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -8843182230161071278L;
    private MallButtonObj button;
    private MallCdkeysObj cdkey;
    private MallSkuObj sku;

    public MallButtonObj getButton() {
        return this.button;
    }

    public MallCdkeysObj getCdkey() {
        return this.cdkey;
    }

    public MallSkuObj getSku() {
        return this.sku;
    }

    public void setButton(MallButtonObj mallButtonObj) {
        this.button = mallButtonObj;
    }

    public void setCdkey(MallCdkeysObj mallCdkeysObj) {
        this.cdkey = mallCdkeysObj;
    }

    public void setSku(MallSkuObj mallSkuObj) {
        this.sku = mallSkuObj;
    }
}
