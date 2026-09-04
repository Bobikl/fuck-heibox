package com.max.xiaoheihe.module.bbs.adapter;

import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.WikiOrArticleWrapperObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.LazyThreadSafetyMode;
import kotlin.b0;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: WikiHelper.kt */
/* JADX INFO: loaded from: classes10.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class WikiHelper {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f80302b = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final a f80301a = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final kotlin.z<WikiHelper> f80303c = b0.b(LazyThreadSafetyMode.SYNCHRONIZED, new yh.a<WikiHelper>() { // from class: com.max.xiaoheihe.module.bbs.adapter.WikiHelper$Companion$instance$2
        public static ChangeQuickRedirect changeQuickRedirect;

        @dl.d
        public final WikiHelper a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27518, new Class[0], WikiHelper.class);
            return patchProxyResultProxy.isSupported ? (WikiHelper) patchProxyResultProxy.result : new WikiHelper();
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.max.xiaoheihe.module.bbs.adapter.WikiHelper, java.lang.Object] */
        @Override // yh.a
        public /* bridge */ /* synthetic */ WikiHelper invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27519, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
        }
    });

    /* JADX INFO: compiled from: WikiHelper.kt */
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
        public final WikiHelper a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27517, new Class[0], WikiHelper.class);
            return patchProxyResultProxy.isSupported ? (WikiHelper) patchProxyResultProxy.result : (WikiHelper) WikiHelper.f80303c.getValue();
        }
    }

    @dl.d
    public static final WikiHelper b() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 27516, new Class[0], WikiHelper.class);
        return patchProxyResultProxy.isSupported ? (WikiHelper) patchProxyResultProxy.result : f80301a.a();
    }

    public final int c(@dl.d WikiOrArticleWrapperObj data) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{data}, this, changeQuickRedirect, false, 27515, new Class[]{WikiOrArticleWrapperObj.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        f0.p(data, "data");
        int itemType = data.getItemType();
        if (itemType == 0) {
            return R.layout.item_wiki_item;
        }
        if (itemType != 2) {
            return itemType != 3 ? R.layout.item_wiki_search_grid : R.layout.item_wiki_apply_addition;
        }
        return R.layout.component_list_title;
    }
}
