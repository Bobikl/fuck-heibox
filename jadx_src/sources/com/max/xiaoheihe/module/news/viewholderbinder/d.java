package com.max.xiaoheihe.module.news.viewholderbinder;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.bbs.ListExposureObj;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.max.xiaoheihe.bean.news.FeedsContentLinkCollectionObj;
import com.max.xiaoheihe.module.bbs.component.BBSLinkListBottomBar;
import com.max.xiaoheihe.module.bbs.component.BBSUserSectionSmallView;
import com.max.xiaoheihe.module.expression.widget.ExpressionTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: LinkCollectionVHB.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nLinkCollectionVHB.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkCollectionVHB.kt\ncom/max/xiaoheihe/module/news/viewholderbinder/LinkCollectionVHB\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,192:1\n262#2,2:193\n262#2,2:195\n262#2,2:197\n262#2,2:199\n*S KotlinDebug\n*F\n+ 1 LinkCollectionVHB.kt\ncom/max/xiaoheihe/module/news/viewholderbinder/LinkCollectionVHB\n*L\n63#1:193,2\n113#1:195,2\n121#1:197,2\n138#1:199,2\n*E\n"})
@androidx.compose.runtime.internal.o(parameters = 0)
public final class d extends k implements com.max.xiaoheihe.module.news.adapter.a.InterfaceC0842a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f91375o = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.e
    private RecyclerView.OnScrollListener f91376n;

    /* JADX INFO: compiled from: LinkCollectionVHB.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ FeedsContentBaseObj f91377b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f91378c;

        a(FeedsContentBaseObj feedsContentBaseObj, d dVar) {
            this.f91377b = feedsContentBaseObj;
            this.f91378c = dVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42628, new Class[]{View.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(((FeedsContentLinkCollectionObj) this.f91377b).getTitle_protocol())) {
                return;
            }
            com.max.xiaoheihe.base.router.b.j0(this.f91378c.p().c(), ((FeedsContentLinkCollectionObj) this.f91377b).getTitle_protocol());
        }
    }

    /* JADX INFO: compiled from: LinkCollectionVHB.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BBSLinkObj f91380c;

        b(BBSLinkObj bBSLinkObj) {
            this.f91380c = bBSLinkObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42629, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.module.bbs.utils.b.E(d.this.p().c(), this.f91380c);
        }
    }

    /* JADX INFO: compiled from: LinkCollectionVHB.kt */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ FeedsContentBaseObj f91382c;

        c(FeedsContentBaseObj feedsContentBaseObj) {
            this.f91382c = feedsContentBaseObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@dl.e View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42630, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.j0(d.this.p().c(), ((FeedsContentLinkCollectionObj) this.f91382c).getLink_see_more_protocol());
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.news.viewholderbinder.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: LinkCollectionVHB.kt */
    public static final class C0847d extends RecyclerView.OnScrollListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ RecyclerView f91383b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<List<BBSLinkObj>> f91384c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<List<BBSLinkObj>> f91385d;

        C0847d(RecyclerView recyclerView, Ref.ObjectRef<List<BBSLinkObj>> objectRef, Ref.ObjectRef<List<BBSLinkObj>> objectRef2) {
            this.f91383b = recyclerView;
            this.f91384c = objectRef;
            this.f91385d = objectRef2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@dl.d RecyclerView recyclerView, int i10, int i11) {
            Object[] objArr = {recyclerView, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 42631, new Class[]{RecyclerView.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(recyclerView, "recyclerView");
            com.max.xiaoheihe.utils.d.p1(this.f91383b, this.f91384c.f124891b, this.f91385d.f124891b);
        }
    }

    /* JADX INFO: compiled from: LinkCollectionVHB.kt */
    public static final class e extends RecyclerView.OnScrollListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ RecyclerView f91386b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<List<BBSLinkObj>> f91387c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<List<BBSLinkObj>> f91388d;

        e(RecyclerView recyclerView, Ref.ObjectRef<List<BBSLinkObj>> objectRef, Ref.ObjectRef<List<BBSLinkObj>> objectRef2) {
            this.f91386b = recyclerView;
            this.f91387c = objectRef;
            this.f91388d = objectRef2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@dl.d RecyclerView recyclerView, int i10, int i11) {
            Object[] objArr = {recyclerView, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 42632, new Class[]{RecyclerView.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(recyclerView, "recyclerView");
            if (ViewUtils.f0(this.f91386b) || com.max.hbcommon.utils.c.w(this.f91387c.f124891b)) {
                com.max.xiaoheihe.utils.d.p1(this.f91386b, this.f91387c.f124891b, this.f91388d.f124891b);
            } else {
                com.max.xiaoheihe.utils.d.o1(this.f91387c.f124891b, this.f91388d.f124891b);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@dl.d g0 param) {
        super(param);
        kotlin.jvm.internal.f0.p(param, "param");
    }

    private final void R(QMUIRadiusImageView qMUIRadiusImageView, BBSLinkObj bBSLinkObj) {
        if (PatchProxy.proxy(new Object[]{qMUIRadiusImageView, bBSLinkObj}, this, changeQuickRedirect, false, 42625, new Class[]{QMUIRadiusImageView.class, BBSLinkObj.class}, Void.TYPE).isSupported) {
            return;
        }
        qMUIRadiusImageView.setCornerRadius(ViewUtils.p(m(), qMUIRadiusImageView, ViewUtils.ViewType.IMAGE));
        String str = null;
        if (bBSLinkObj.getThumbs() != null && bBSLinkObj.getThumbs().size() > 0) {
            str = bBSLinkObj.getThumbs().get(0);
        } else if (bBSLinkObj.getImgs() != null && bBSLinkObj.getImgs().size() > 0) {
            str = bBSLinkObj.getImgs().get(0);
        }
        com.max.hbimage.b.L(str, qMUIRadiusImageView, R.drawable.common_default_placeholder_375x210);
    }

    @Override // com.max.xiaoheihe.module.news.adapter.a.InterfaceC0842a
    public void a(@dl.d RecyclerView recyclerView, int i10, int i11) {
        Object[] objArr = {recyclerView, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 42627, new Class[]{RecyclerView.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(recyclerView, "recyclerView");
        RecyclerView.OnScrollListener onScrollListener = this.f91376n;
        if (onScrollListener != null) {
            onScrollListener.onScrolled(recyclerView, i10, i11);
        }
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v5, types: [T, java.util.List] */
    @Override // com.max.xiaoheihe.module.news.viewholderbinder.k, com.max.xiaoheihe.module.news.viewholderbinder.h0
    public void i(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d FeedsContentBaseObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42624, new Class[]{com.max.hbcommon.base.adapter.s.e.class, FeedsContentBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
        if ((data instanceof FeedsContentLinkCollectionObj ? (FeedsContentLinkCollectionObj) data : null) != null) {
            ViewGroup viewGroup = (ViewGroup) viewHolder.i(R.id.vg_title);
            TextView textView = (TextView) viewHolder.i(R.id.tv_title);
            View vg_top_link = viewHolder.i(R.id.vg_top_link);
            View ll_container = viewHolder.i(R.id.v_link_top);
            View viewI = viewHolder.i(R.id.v_link_content);
            View viewI2 = viewHolder.i(R.id.v_link_bottom);
            RecyclerView rv_link = (RecyclerView) viewHolder.i(R.id.rv_link);
            FeedsContentLinkCollectionObj feedsContentLinkCollectionObj = (FeedsContentLinkCollectionObj) data;
            textView.setText(feedsContentLinkCollectionObj.getTitle());
            viewGroup.setOnClickListener(new a(data, this));
            if (feedsContentLinkCollectionObj.getTop_link() != null) {
                BBSLinkObj top_link = feedsContentLinkCollectionObj.getTop_link();
                if (top_link != null) {
                    kotlin.jvm.internal.f0.o(vg_top_link, "contentBinding$lambda$13$lambda$10$lambda$0");
                    vg_top_link.setVisibility(0);
                    vg_top_link.setOnClickListener(new b(top_link));
                    ViewGroup.LayoutParams layoutParams = ll_container.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                    if (marginLayoutParams != null) {
                        Context context = ll_container.getContext();
                        kotlin.jvm.internal.f0.o(context, "context");
                        marginLayoutParams.topMargin = com.max.xiaoheihe.accelworld.l.c(8.0f, context);
                    } else {
                        marginLayoutParams = null;
                    }
                    ll_container.setLayoutParams(marginLayoutParams);
                    com.max.xiaoheihe.module.bbs.component.a vg_user = (BBSUserSectionSmallView) ll_container.findViewById(R.id.vg_user);
                    View iv_link_more = (ImageView) ll_container.findViewById(R.id.iv_link_more);
                    kotlin.jvm.internal.f0.o(vg_user, "vg_user");
                    Q(vg_user, top_link);
                    kotlin.jvm.internal.f0.o(ll_container, "ll_container");
                    kotlin.jvm.internal.f0.o(iv_link_more, "iv_link_more");
                    I(ll_container, iv_link_more, top_link, q());
                    ExpressionTextView tv_content = (ExpressionTextView) viewI.findViewById(R.id.tv_content);
                    TextView tv_title = (ExpressionTextView) viewI.findViewById(R.id.tv_title);
                    QMUIRadiusImageView iv_img = (QMUIRadiusImageView) viewI.findViewById(R.id.iv_img);
                    kotlin.jvm.internal.f0.o(tv_title, "tv_title");
                    G(tv_title, top_link, top_link.getTitle());
                    kotlin.jvm.internal.f0.o(tv_content, "tv_content");
                    P(top_link, tv_content);
                    tv_title.setTextSize(1, 16.0f);
                    tv_content.setMaxLines(2);
                    ViewGroup.LayoutParams layoutParams2 = tv_content.getLayoutParams();
                    Context context2 = tv_content.getContext();
                    kotlin.jvm.internal.f0.o(context2, "context");
                    layoutParams2.height = com.max.xiaoheihe.accelworld.l.c(44.0f, context2);
                    tv_content.setLayoutParams(layoutParams2);
                    ViewGroup.LayoutParams layoutParams3 = iv_img.getLayoutParams();
                    layoutParams3.width = com.max.xiaoheihe.accelworld.l.c(113.0f, p().c());
                    layoutParams3.height = com.max.xiaoheihe.accelworld.l.c(100.0f, p().c());
                    iv_img.setLayoutParams(layoutParams3);
                    kotlin.jvm.internal.f0.o(iv_img, "iv_img");
                    R(iv_img, top_link);
                    BBSLinkListBottomBar vg_bottom_bar = viewI2 instanceof BBSLinkListBottomBar ? (BBSLinkListBottomBar) viewI2 : null;
                    if (vg_bottom_bar == null) {
                        vg_bottom_bar = (BBSLinkListBottomBar) viewI2.findViewById(R.id.vg_bottom_bar);
                    }
                    kotlin.jvm.internal.f0.o(vg_bottom_bar, "vg_bottom_bar");
                    O(top_link, vg_bottom_bar);
                }
            } else {
                kotlin.jvm.internal.f0.o(vg_top_link, "vg_top_link");
                vg_top_link.setVisibility(8);
            }
            if (com.max.hbcommon.utils.c.w(feedsContentLinkCollectionObj.getLink_list())) {
                kotlin.jvm.internal.f0.o(rv_link, "rv_link");
                rv_link.setVisibility(8);
            } else {
                if (rv_link.getItemDecorationCount() == 0) {
                    Context context3 = rv_link.getContext();
                    kotlin.jvm.internal.f0.o(context3, "context");
                    int iC = com.max.xiaoheihe.accelworld.l.c(10.0f, context3);
                    Context context4 = rv_link.getContext();
                    kotlin.jvm.internal.f0.o(context4, "context");
                    int iC2 = com.max.xiaoheihe.accelworld.l.c(12.0f, context4);
                    Context context5 = rv_link.getContext();
                    kotlin.jvm.internal.f0.o(context5, "context");
                    rv_link.addItemDecoration(new com.max.hbcustomview.d(iC, iC2, com.max.xiaoheihe.accelworld.l.c(12.0f, context5)));
                }
                kotlin.jvm.internal.f0.o(rv_link, "contentBinding$lambda$13$lambda$12");
                rv_link.setVisibility(0);
                rv_link.setLayoutManager(new LinearLayoutManager(p().c(), 0, false));
                Context contextC = p().c();
                List<BBSLinkObj> link_list = feedsContentLinkCollectionObj.getLink_list();
                kotlin.jvm.internal.f0.m(link_list);
                com.max.xiaoheihe.module.news.adapter.d dVar = new com.max.xiaoheihe.module.news.adapter.d(contextC, link_list);
                if (com.max.hbcommon.utils.c.u(feedsContentLinkCollectionObj.getLink_see_more_protocol())) {
                    rv_link.setAdapter(dVar);
                } else {
                    com.max.hbcommon.base.adapter.w wVar = new com.max.hbcommon.base.adapter.w(p().c(), dVar, new c(data));
                    wVar.H(R.color.transparent);
                    rv_link.setAdapter(wVar);
                }
                RecyclerView.Adapter adapter = rv_link.getAdapter();
                if (adapter != null) {
                    adapter.notifyDataSetChanged();
                }
            }
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            Object tag = viewHolder.itemView.getTag(R.id.tag_viewholder);
            if (!(tag instanceof ListExposureObj)) {
                tag = new ListExposureObj(new ArrayList(), new ArrayList());
                viewHolder.itemView.setTag(R.id.tag_viewholder, tag);
            }
            ListExposureObj listExposureObj = (ListExposureObj) tag;
            objectRef.f124891b = listExposureObj.getShow();
            objectRef2.f124891b = listExposureObj.getDisappear();
            rv_link.clearOnScrollListeners();
            rv_link.addOnScrollListener(new C0847d(rv_link, objectRef, objectRef2));
            this.f91376n = new e(rv_link, objectRef, objectRef2);
        }
    }

    @Override // com.max.xiaoheihe.module.news.viewholderbinder.k, com.max.xiaoheihe.module.news.viewholderbinder.h0
    public void w(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d BBSLinkObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42626, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSLinkObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
    }
}
