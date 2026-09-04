package com.max.xiaoheihe.module.search.viewholderbinder.recommend;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.HeyBoxContentObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.LazyThreadSafetyMode;
import kotlin.b0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.z;
import xh.m;

/* JADX INFO: compiled from: SearchRecHelper.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class SearchRecHelper {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f91842b = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final a f91841a = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final z<SearchRecHelper> f91843c = b0.b(LazyThreadSafetyMode.SYNCHRONIZED, new yh.a<SearchRecHelper>() { // from class: com.max.xiaoheihe.module.search.viewholderbinder.recommend.SearchRecHelper$Companion$instance$2
        public static ChangeQuickRedirect changeQuickRedirect;

        @dl.d
        public final SearchRecHelper a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43435, new Class[0], SearchRecHelper.class);
            return patchProxyResultProxy.isSupported ? (SearchRecHelper) patchProxyResultProxy.result : new SearchRecHelper();
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.max.xiaoheihe.module.search.viewholderbinder.recommend.SearchRecHelper, java.lang.Object] */
        @Override // yh.a
        public /* bridge */ /* synthetic */ SearchRecHelper invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43436, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
        }
    });

    /* JADX INFO: compiled from: SearchRecHelper.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @m
        public static /* synthetic */ void b() {
        }

        @dl.d
        public final SearchRecHelper a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43434, new Class[0], SearchRecHelper.class);
            return patchProxyResultProxy.isSupported ? (SearchRecHelper) patchProxyResultProxy.result : (SearchRecHelper) SearchRecHelper.f91843c.getValue();
        }
    }

    @dl.d
    public static final SearchRecHelper b() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 43433, new Class[0], SearchRecHelper.class);
        return patchProxyResultProxy.isSupported ? (SearchRecHelper) patchProxyResultProxy.result : f91841a.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final int c(@dl.d HeyBoxContentObj data) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{data}, this, changeQuickRedirect, false, 43432, new Class[]{HeyBoxContentObj.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        f0.p(data, "data");
        String type = data.getType();
        if (type != null) {
            switch (type.hashCode()) {
                case -1396342996:
                    if (type.equals("banner")) {
                        return R.layout.item_banner;
                    }
                    break;
                case 3165170:
                    if (type.equals("game")) {
                        return R.layout.component_game_small_pic128x64;
                    }
                    break;
                case 3343892:
                    if (type.equals("mall")) {
                        return R.layout.item_mall_product_horizon;
                    }
                    break;
                case 177089960:
                    if (type.equals(HeyBoxContentObj.TYPE_LINKING)) {
                        return R.layout.item_concept_feeds_news_normal;
                    }
                    break;
            }
        }
        return R.layout.item_concept_feeds_not_support;
    }
}
