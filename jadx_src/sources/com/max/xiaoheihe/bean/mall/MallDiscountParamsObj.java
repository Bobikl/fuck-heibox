package com.max.xiaoheihe.bean.mall;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class MallDiscountParamsObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 1685649831065783517L;
    private boolean bold;
    private String title;
    private String value;

    public boolean equals(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15486, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MallDiscountParamsObj)) {
            return false;
        }
        MallDiscountParamsObj mallDiscountParamsObj = (MallDiscountParamsObj) obj;
        return isBold() == mallDiscountParamsObj.isBold() && Objects.equals(getTitle(), mallDiscountParamsObj.getTitle()) && Objects.equals(getValue(), mallDiscountParamsObj.getValue());
    }

    public String getTitle() {
        return this.title;
    }

    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15487, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : Objects.hash(Boolean.valueOf(isBold()), getTitle(), getValue());
    }

    public boolean isBold() {
        return this.bold;
    }

    public void setBold(boolean z10) {
        this.bold = z10;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setValue(String str) {
        this.value = str;
    }
}
