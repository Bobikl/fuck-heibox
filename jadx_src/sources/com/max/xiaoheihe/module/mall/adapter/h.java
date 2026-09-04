package com.max.xiaoheihe.module.mall.adapter;

import android.content.Context;
import com.max.hbcustomview.bannerview.BannerViewPager;
import com.max.hbsearch.SearchNewActivity;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.mall.MallProductObj;
import com.max.xiaoheihe.module.mall.component.MallProductViewV2;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MallProductAdapterV2.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class h {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final void a(@dl.d Context context, @dl.e MallProductObj mallProductObj) {
        if (PatchProxy.proxy(new Object[]{context, mallProductObj}, null, changeQuickRedirect, true, 41148, new Class[]{Context.class, MallProductObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        if (context instanceof SearchNewActivity) {
            String report_id = mallProductObj != null ? mallProductObj.getReport_id() : null;
            if (report_id == null) {
                return;
            }
            com.max.hbcommon.utils.k.f(report_id, UiKitSpanObj.TYPE_CLICK, mallProductObj.getCustom_index(), mallProductObj.getCustom_suggested_from());
        }
    }

    public static final boolean b(@dl.e MallProductObj mallProductObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mallProductObj}, null, changeQuickRedirect, true, 41149, new Class[]{MallProductObj.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return com.max.hbcommon.utils.c.x(mallProductObj != null ? mallProductObj.getIs_large_image() : null);
    }

    @dl.d
    public static final a c(@dl.d com.max.hbcommon.base.adapter.s.e eVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{eVar}, null, changeQuickRedirect, true, 41147, new Class[]{com.max.hbcommon.base.adapter.s.e.class}, a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        f0.p(eVar, "<this>");
        return new a((BannerViewPager) eVar.i(R.id.banner));
    }

    @dl.d
    public static final i d(@dl.d com.max.hbcommon.base.adapter.s.e eVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{eVar}, null, changeQuickRedirect, true, 41146, new Class[]{com.max.hbcommon.base.adapter.s.e.class}, i.class);
        if (patchProxyResultProxy.isSupported) {
            return (i) patchProxyResultProxy.result;
        }
        f0.p(eVar, "<this>");
        return new i((MallProductViewV2) eVar.i(R.id.mp));
    }
}
