package com.max.xiaoheihe.bean.mall;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class MallAvatarDecorOptionObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -4830672202088797471L;
    private boolean checked;
    private String desc;
    private String price;
    private String purchase_days;

    public boolean equals(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15478, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MallAvatarDecorOptionObj mallAvatarDecorOptionObj = (MallAvatarDecorOptionObj) obj;
        String str = this.desc;
        if (str == null ? mallAvatarDecorOptionObj.desc != null : !str.equals(mallAvatarDecorOptionObj.desc)) {
            return false;
        }
        String str2 = this.price;
        if (str2 == null ? mallAvatarDecorOptionObj.price != null : !str2.equals(mallAvatarDecorOptionObj.price)) {
            return false;
        }
        String str3 = this.purchase_days;
        String str4 = mallAvatarDecorOptionObj.purchase_days;
        if (str3 != null) {
            return str3.equals(str4);
        }
        return str4 == null;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getPrice() {
        return this.price;
    }

    public String getPurchase_days() {
        return this.purchase_days;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15479, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.desc;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.price;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.purchase_days;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public boolean isChecked() {
        return this.checked;
    }

    public void setChecked(boolean z10) {
        this.checked = z10;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setPrice(String str) {
        this.price = str;
    }

    public void setPurchase_days(String str) {
        this.purchase_days = str;
    }
}
