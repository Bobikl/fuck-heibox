package com.max.xiaoheihe.bean.mall.purchase;

import androidx.compose.runtime.internal.o;
import com.max.hbcommon.utils.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: BuyTypeObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class BuyTypeObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String key;

    @e
    private String title;

    @e
    private List<BuyTypeValueObj> values;

    public BuyTypeObj(@e String str, @e String str2, @e List<BuyTypeValueObj> list) {
        this.key = str;
        this.title = str2;
        this.values = list;
    }

    public static /* synthetic */ BuyTypeObj copy$default(BuyTypeObj buyTypeObj, String str, String str2, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{buyTypeObj, str, str2, list, new Integer(i10), obj}, null, changeQuickRedirect, true, 15644, new Class[]{BuyTypeObj.class, String.class, String.class, List.class, Integer.TYPE, Object.class}, BuyTypeObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (BuyTypeObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = buyTypeObj.key;
        }
        if ((i10 & 2) != 0) {
            str2 = buyTypeObj.title;
        }
        if ((i10 & 4) != 0) {
            list = buyTypeObj.values;
        }
        return buyTypeObj.copy(str, str2, list);
    }

    @e
    public final String component1() {
        return this.key;
    }

    @e
    public final String component2() {
        return this.title;
    }

    @e
    public final List<BuyTypeValueObj> component3() {
        return this.values;
    }

    @d
    public final BuyTypeObj copy(@e String str, @e String str2, @e List<BuyTypeValueObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, list}, this, changeQuickRedirect, false, 15643, new Class[]{String.class, String.class, List.class}, BuyTypeObj.class);
        return patchProxyResultProxy.isSupported ? (BuyTypeObj) patchProxyResultProxy.result : new BuyTypeObj(str, str2, list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15647, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BuyTypeObj)) {
            return false;
        }
        BuyTypeObj buyTypeObj = (BuyTypeObj) obj;
        return f0.g(this.key, buyTypeObj.key) && f0.g(this.title, buyTypeObj.title) && f0.g(this.values, buyTypeObj.values);
    }

    @e
    public final String getKey() {
        return this.key;
    }

    @e
    public final BuyTypeValueObj getSelected() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15642, new Class[0], BuyTypeValueObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (BuyTypeValueObj) patchProxyResultProxy.result;
        }
        if (c.w(this.values)) {
            return null;
        }
        List<BuyTypeValueObj> list = this.values;
        f0.m(list);
        BuyTypeValueObj buyTypeValueObj = list.get(0);
        List<BuyTypeValueObj> list2 = this.values;
        f0.m(list2);
        for (BuyTypeValueObj buyTypeValueObj2 : list2) {
            if (f0.g(buyTypeValueObj2.getSelected(), Boolean.TRUE)) {
                buyTypeValueObj = buyTypeValueObj2;
                break;
            }
        }
        buyTypeValueObj.setSelected(Boolean.TRUE);
        return buyTypeValueObj;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    @e
    public final List<BuyTypeValueObj> getValues() {
        return this.values;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15646, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.key;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<BuyTypeValueObj> list = this.values;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final void setChecked(@d BuyTypeValueObj checked) {
        if (PatchProxy.proxy(new Object[]{checked}, this, changeQuickRedirect, false, 15641, new Class[]{BuyTypeValueObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(checked, "checked");
        List<BuyTypeValueObj> list = this.values;
        if (list != null) {
            for (BuyTypeValueObj buyTypeValueObj : list) {
                buyTypeValueObj.setSelected(Boolean.valueOf(f0.g(buyTypeValueObj, checked)));
            }
        }
    }

    public final void setKey(@e String str) {
        this.key = str;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }

    public final void setValues(@e List<BuyTypeValueObj> list) {
        this.values = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15645, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "BuyTypeObj(key=" + this.key + ", title=" + this.title + ", values=" + this.values + ')';
    }
}
