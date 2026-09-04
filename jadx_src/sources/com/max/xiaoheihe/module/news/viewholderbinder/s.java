package com.max.xiaoheihe.module.news.viewholderbinder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.max.xiaoheihe.module.bbs.component.BBSUserSectionView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: compiled from: NewsForwardVHB.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class s extends com.max.xiaoheihe.module.news.viewholderbinder.a implements com.max.xiaoheihe.module.news.adapter.a.InterfaceC0842a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f91497l = 0;

    /* JADX INFO: compiled from: NewsForwardVHB.kt */
    public static final class a implements com.max.xiaoheihe.module.bbs.utils.b.y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f91498a = new a();
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.max.xiaoheihe.module.bbs.utils.b.y
        public final void a(com.max.hbcommon.base.adapter.s.e eVar, BBSLinkObj bBSLinkObj) {
        }
    }

    /* JADX INFO: compiled from: NewsForwardVHB.kt */
    public static final class b implements com.max.xiaoheihe.module.bbs.utils.b.y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f91499a = new b();
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.xiaoheihe.module.bbs.utils.b.y
        public final void a(com.max.hbcommon.base.adapter.s.e eVar, BBSLinkObj bBSLinkObj) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(@dl.d g0 param) {
        super(param);
        kotlin.jvm.internal.f0.p(param, "param");
    }

    public final void N(@dl.e Context context, @dl.d ViewGroup vg2, @dl.d BBSLinkObj data) {
        if (PatchProxy.proxy(new Object[]{context, vg2, data}, this, changeQuickRedirect, false, 42713, new Class[]{Context.class, ViewGroup.class, BBSLinkObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(vg2, "vg");
        kotlin.jvm.internal.f0.p(data, "data");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.item_forward_post, vg2, false);
        StringBuilder sb2 = new StringBuilder();
        List<?> dataList = p().a().getDataList();
        kotlin.jvm.internal.f0.o(dataList, "param.adapter.dataList");
        sb2.append(CollectionsKt___CollectionsKt.Y2(dataList, data));
        sb2.append("");
        data.setIndex(sb2.toString());
        com.max.xiaoheihe.module.bbs.utils.b.P(context, viewInflate, data, com.max.xiaoheihe.module.bbs.utils.b.f83401f, 0, null, b.f91499a);
        vg2.addView(viewInflate);
    }

    public final void O(@dl.e BBSLinkObj bBSLinkObj, @dl.d BBSUserSectionView vg_title) {
        if (PatchProxy.proxy(new Object[]{bBSLinkObj, vg_title}, this, changeQuickRedirect, false, 42714, new Class[]{BBSLinkObj.class, BBSUserSectionView.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(vg_title, "vg_title");
        if (bBSLinkObj != null) {
            String comment_num = bBSLinkObj.getComment_num();
            String link_award_num = bBSLinkObj.getLink_award_num();
            vg_title.getLikeComment().getBll_comment().setNum(comment_num);
            vg_title.getLikeComment().getBll_like().setNum(link_award_num);
        }
    }

    @Override // com.max.xiaoheihe.module.news.viewholderbinder.a, com.max.xiaoheihe.module.news.adapter.a.InterfaceC0842a
    public void a(@dl.d RecyclerView recyclerView, int i10, int i11) {
        Object[] objArr = {recyclerView, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 42716, new Class[]{RecyclerView.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(recyclerView, "recyclerView");
    }

    @Override // com.max.xiaoheihe.module.news.viewholderbinder.a, com.max.xiaoheihe.module.news.viewholderbinder.h0
    public void i(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d FeedsContentBaseObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42712, new Class[]{com.max.hbcommon.base.adapter.s.e.class, FeedsContentBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
        BBSLinkObj bBSLinkObj = (BBSLinkObj) data;
        if (viewHolder.i(R.id.vg_interactive_bar) != null) {
            viewHolder.i(R.id.vg_interactive_bar).setVisibility(0);
            viewHolder.i(R.id.vg_interactive_bar).getLayoutParams().height = -2;
        }
        if (viewHolder.i(R.id.ll_origin_post) != null) {
            View viewI = viewHolder.i(R.id.ll_origin_post);
            kotlin.jvm.internal.f0.n(viewI, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) viewI).removeAllViews();
        }
        if (bBSLinkObj.getForward() != null) {
            viewHolder.i(R.id.ll_origin_post).setVisibility(0);
            Context contextM = m();
            View viewI2 = viewHolder.i(R.id.ll_origin_post);
            kotlin.jvm.internal.f0.o(viewI2, "viewHolder.getView<ViewGroup>(R.id.ll_origin_post)");
            BBSLinkObj forward = bBSLinkObj.getForward();
            kotlin.jvm.internal.f0.o(forward, "linkData!!.forward");
            N(contextM, (ViewGroup) viewI2, forward);
        }
        BBSUserSectionView bBSUserSectionView = (BBSUserSectionView) viewHolder.i(R.id.vg_title);
        LinearLayout linearLayout = (LinearLayout) viewHolder.i(R.id.vg_bottom_sub);
        if (bBSUserSectionView != null) {
            O(bBSLinkObj, bBSUserSectionView);
            bBSUserSectionView.setDesc(com.max.xiaoheihe.module.bbs.utils.b.t(m(), bBSLinkObj));
        }
        StringBuilder sb2 = new StringBuilder();
        List<?> dataList = p().a().getDataList();
        kotlin.jvm.internal.f0.o(dataList, "param.adapter.dataList");
        sb2.append(CollectionsKt___CollectionsKt.Y2(dataList, data));
        sb2.append("");
        bBSLinkObj.setIndex(sb2.toString());
        com.max.xiaoheihe.module.bbs.utils.b.M(viewHolder, bBSLinkObj, com.max.xiaoheihe.module.bbs.utils.b.f83401f, 0, null, a.f91498a);
        TextView textView = (TextView) viewHolder.i(R.id.tv_desc);
        if (textView != null) {
            textView.setText(((Object) textView.getText()) + bBSLinkObj.getText());
        }
        M(linearLayout, viewHolder, bBSLinkObj);
        E(viewHolder, data);
    }

    @Override // com.max.xiaoheihe.module.news.viewholderbinder.a, com.max.xiaoheihe.module.news.viewholderbinder.h0
    public void w(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d BBSLinkObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42715, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSLinkObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
    }
}
