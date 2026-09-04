package com.max.xiaoheihe.bean.bbs;

import com.max.hbcommon.bean.AdsBannerObj;
import com.max.hbutils.utils.k;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class FeedsContentAdObj extends FeedsContentBaseObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<AdsBannerObj> banners;

    public boolean equals(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14281, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return k.f(this, obj);
    }

    public List<AdsBannerObj> getBanners() {
        return this.banners;
    }

    public void setBanners(List<AdsBannerObj> list) {
        this.banners = list;
    }
}
