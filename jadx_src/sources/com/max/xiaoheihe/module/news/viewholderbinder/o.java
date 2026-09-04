package com.max.xiaoheihe.module.news.viewholderbinder;

import com.max.hbuikit.bean.UiKitViewObj;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.max.xiaoheihe.bean.news.FeedsUiKitObj;
import com.max.xiaoheihe.view.uikit.HBUiKitView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: compiled from: NewsFeedsUiKitVHB.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public class o extends h0 {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f91490l = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    public static final a f91489k = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private static final HashMap<String, Integer> f91491m = new HashMap<>();

    /* JADX INFO: compiled from: NewsFeedsUiKitVHB.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final HashMap<String, Integer> a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42704, new Class[0], HashMap.class);
            return patchProxyResultProxy.isSupported ? (HashMap) patchProxyResultProxy.result : o.f91491m;
        }
    }

    /* JADX INFO: compiled from: NewsFeedsUiKitVHB.kt */
    public static final class b implements com.max.xiaoheihe.view.uikit.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ FeedsContentBaseObj f91493b;

        b(FeedsContentBaseObj feedsContentBaseObj) {
            this.f91493b = feedsContentBaseObj;
        }

        @Override // com.max.xiaoheihe.view.uikit.b
        public void a(@dl.e String str, @dl.e String str2) {
            if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 42705, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            o.this.N(this.f91493b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(@dl.d g0 param) {
        super(param);
        kotlin.jvm.internal.f0.p(param, "param");
    }

    public final void N(@dl.d FeedsContentBaseObj data) {
        if (PatchProxy.proxy(new Object[]{data}, this, changeQuickRedirect, false, 42703, new Class[]{FeedsContentBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(data, "data");
        List<?> dataList = k().getDataList();
        kotlin.jvm.internal.f0.o(dataList, "adapter.dataList");
        int iY2 = CollectionsKt___CollectionsKt.Y2(dataList, data);
        if (iY2 < 0 || iY2 >= k().getDataList().size()) {
            return;
        }
        k().getDataList().remove(iY2);
        k().notifyItemRemoved(iY2);
        com.max.xiaoheihe.module.news.adapter.a.b bVarO = o();
        if (bVarO != null) {
            bVarO.B3(iY2);
        }
    }

    @Override // com.max.xiaoheihe.module.news.viewholderbinder.h0
    public void i(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d FeedsContentBaseObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42701, new Class[]{com.max.hbcommon.base.adapter.s.e.class, FeedsContentBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
        UiKitViewObj ui_kit = ((FeedsUiKitObj) data).getUi_kit();
        if (ui_kit != null) {
            HBUiKitView hBUiKitView = (HBUiKitView) viewHolder.i(R.id.v_ui_kit);
            hBUiKitView.setIUiKit(new b(data));
            if (kotlin.jvm.internal.f0.g((String) hBUiKitView.getTag(R.id.v_ui_kit), ui_kit.getTemplate_id())) {
                hBUiKitView.setDataToRefresh(ui_kit);
            } else {
                hBUiKitView.setDataToCreate(ui_kit);
            }
            hBUiKitView.setTag(R.id.v_ui_kit, ui_kit.getTemplate_id());
        }
        E(viewHolder, data);
    }

    @Override // com.max.xiaoheihe.module.news.viewholderbinder.h0
    public void w(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d BBSLinkObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42702, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSLinkObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
    }
}
