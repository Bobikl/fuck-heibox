package com.max.xiaoheihe.bean;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class AdsInfosObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -7272014658577661902L;
    private List<InnerAdsInfoObj> inner_ads;
    private List<AdsInfoObj> open_screen;

    public boolean equals(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.m.iL, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdsInfosObj adsInfosObj = (AdsInfosObj) obj;
        List<InnerAdsInfoObj> list = this.inner_ads;
        if (list == null ? adsInfosObj.inner_ads != null : !list.equals(adsInfosObj.inner_ads)) {
            return false;
        }
        List<AdsInfoObj> list2 = this.open_screen;
        List<AdsInfoObj> list3 = adsInfosObj.open_screen;
        if (list2 != null) {
            return list2.equals(list3);
        }
        return list3 == null;
    }

    public List<InnerAdsInfoObj> getInner_ads() {
        return this.inner_ads;
    }

    public List<AdsInfoObj> getOpen_screen() {
        return this.open_screen;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.jL, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<InnerAdsInfoObj> list = this.inner_ads;
        int iHashCode = (list != null ? list.hashCode() : 0) * 31;
        List<AdsInfoObj> list2 = this.open_screen;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public void setInner_ads(List<InnerAdsInfoObj> list) {
        this.inner_ads = list;
    }

    public void setOpen_screen(List<AdsInfoObj> list) {
        this.open_screen = list;
    }
}
