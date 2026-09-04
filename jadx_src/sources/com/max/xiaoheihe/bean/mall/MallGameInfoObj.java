package com.max.xiaoheihe.bean.mall;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class MallGameInfoObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -6755458062194601354L;
    private String appid;
    private String game_type;
    private String package_id;
    private MallPriceObj price;

    public boolean equals(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15488, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MallGameInfoObj)) {
            return false;
        }
        MallGameInfoObj mallGameInfoObj = (MallGameInfoObj) obj;
        return Objects.equals(getAppid(), mallGameInfoObj.getAppid()) && Objects.equals(getGame_type(), mallGameInfoObj.getGame_type()) && Objects.equals(getPackage_id(), mallGameInfoObj.getPackage_id()) && Objects.equals(getPrice(), mallGameInfoObj.getPrice());
    }

    public String getAppid() {
        return this.appid;
    }

    public String getGame_type() {
        return this.game_type;
    }

    public String getPackage_id() {
        return this.package_id;
    }

    public MallPriceObj getPrice() {
        return this.price;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15489, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : Objects.hash(getAppid(), getGame_type(), getPackage_id(), getPrice());
    }

    public void setAppid(String str) {
        this.appid = str;
    }

    public void setGame_type(String str) {
        this.game_type = str;
    }

    public void setPackage_id(String str) {
        this.package_id = str;
    }

    public void setPrice(MallPriceObj mallPriceObj) {
        this.price = mallPriceObj;
    }
}
