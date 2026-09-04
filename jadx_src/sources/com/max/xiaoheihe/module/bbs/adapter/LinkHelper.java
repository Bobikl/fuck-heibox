package com.max.xiaoheihe.module.bbs.adapter;

import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.module.bbs.LinkListV2Fragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.LazyThreadSafetyMode;
import kotlin.b0;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LinkHelper.kt */
/* JADX INFO: loaded from: classes10.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class LinkHelper implements com.max.hbcommon.base.adapter.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f80298b = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final a f80297a = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final kotlin.z<LinkHelper> f80299c = b0.b(LazyThreadSafetyMode.SYNCHRONIZED, new yh.a<LinkHelper>() { // from class: com.max.xiaoheihe.module.bbs.adapter.LinkHelper$Companion$instance$2
        public static ChangeQuickRedirect changeQuickRedirect;

        @dl.d
        public final LinkHelper a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27378, new Class[0], LinkHelper.class);
            return patchProxyResultProxy.isSupported ? (LinkHelper) patchProxyResultProxy.result : new LinkHelper();
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.max.xiaoheihe.module.bbs.adapter.LinkHelper, java.lang.Object] */
        @Override // yh.a
        public /* bridge */ /* synthetic */ LinkHelper invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27379, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
        }
    });

    /* JADX INFO: compiled from: LinkHelper.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @xh.m
        public static /* synthetic */ void b() {
        }

        @dl.d
        public final LinkHelper a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27377, new Class[0], LinkHelper.class);
            return patchProxyResultProxy.isSupported ? (LinkHelper) patchProxyResultProxy.result : (LinkHelper) LinkHelper.f80299c.getValue();
        }
    }

    @dl.d
    public static final LinkHelper b() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 27376, new Class[0], LinkHelper.class);
        return patchProxyResultProxy.isSupported ? (LinkHelper) patchProxyResultProxy.result : f80297a.a();
    }

    public final int c(@dl.d String pageType, boolean z10, @dl.d BBSLinkObj data) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{pageType, new Byte(z10 ? (byte) 1 : (byte) 0), data}, this, changeQuickRedirect, false, 27375, new Class[]{String.class, Boolean.TYPE, BBSLinkObj.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        f0.p(pageType, "pageType");
        f0.p(data, "data");
        if (f0.g("1", data.getIs_top())) {
            return R.layout.item_top_link;
        }
        if (f0.g("1", data.getIs_update())) {
            return R.layout.item_update;
        }
        if (f0.g(LinkListV2Fragment.f79978z, pageType) || f0.g(LinkListV2Fragment.f79976x, pageType)) {
            return (!f0.g("20", data.getLink_tag()) && z10) ? R.layout.item_channels_link : R.layout.item_link_list;
        }
        if (!f0.g(LinkListV2Fragment.B, pageType)) {
            return R.layout.item_link_list;
        }
        if (f0.g("20", data.getLink_tag())) {
            return R.layout.item_link_list_swipe;
        }
        return f0.g("-1", data.getLink_tag()) ? R.layout.item_link_list_swipe_deleted : R.layout.item_channels_link_swipe;
    }
}
