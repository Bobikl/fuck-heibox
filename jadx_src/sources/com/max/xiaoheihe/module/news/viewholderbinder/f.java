package com.max.xiaoheihe.module.news.viewholderbinder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.bean.bbs.FeedsContentRecLinksObj;
import com.max.xiaoheihe.bean.bbs.ListExposureObj;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: NewRecLinksVHB.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class f extends h0 implements com.max.xiaoheihe.module.news.adapter.a.InterfaceC0842a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f91406l = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.e
    private RecyclerView.OnScrollListener f91407k;

    /* JADX INFO: compiled from: NewRecLinksVHB.kt */
    public static final class a extends RecyclerView.OnScrollListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ RecyclerView f91408b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<List<BBSLinkObj>> f91409c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<List<BBSLinkObj>> f91410d;

        a(RecyclerView recyclerView, Ref.ObjectRef<List<BBSLinkObj>> objectRef, Ref.ObjectRef<List<BBSLinkObj>> objectRef2) {
            this.f91408b = recyclerView;
            this.f91409c = objectRef;
            this.f91410d = objectRef2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@dl.d RecyclerView recyclerView, int i10, int i11) {
            Object[] objArr = {recyclerView, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 42653, new Class[]{RecyclerView.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(recyclerView, "recyclerView");
            com.max.xiaoheihe.utils.d.p1(this.f91408b, this.f91409c.f124891b, this.f91410d.f124891b);
        }
    }

    /* JADX INFO: compiled from: NewRecLinksVHB.kt */
    public static final class b extends RecyclerView.OnScrollListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ RecyclerView f91411b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<List<BBSLinkObj>> f91412c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<List<BBSLinkObj>> f91413d;

        b(RecyclerView recyclerView, Ref.ObjectRef<List<BBSLinkObj>> objectRef, Ref.ObjectRef<List<BBSLinkObj>> objectRef2) {
            this.f91411b = recyclerView;
            this.f91412c = objectRef;
            this.f91413d = objectRef2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@dl.d RecyclerView recyclerView, int i10, int i11) {
            Object[] objArr = {recyclerView, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 42654, new Class[]{RecyclerView.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(recyclerView, "recyclerView");
            if (ViewUtils.f0(this.f91411b) || com.max.hbcommon.utils.c.w(this.f91412c.f124891b)) {
                com.max.xiaoheihe.utils.d.p1(this.f91411b, this.f91412c.f124891b, this.f91413d.f124891b);
            } else {
                com.max.xiaoheihe.utils.d.o1(this.f91412c.f124891b, this.f91413d.f124891b);
            }
        }
    }

    /* JADX INFO: compiled from: NewRecLinksVHB.kt */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42655, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.i0(f.this.m(), lb.d.M);
        }
    }

    /* JADX INFO: compiled from: NewRecLinksVHB.kt */
    public static final class d extends com.max.hbcommon.base.adapter.s<BBSLinkObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ FeedsContentBaseObj f91415b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f91416c;

        /* JADX INFO: compiled from: NewRecLinksVHB.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ f f91417b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ BBSLinkObj f91418c;

            a(f fVar, BBSLinkObj bBSLinkObj) {
                this.f91417b = fVar;
                this.f91418c = bBSLinkObj;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42660, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.xiaoheihe.module.bbs.utils.b.E(this.f91417b.m(), this.f91418c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(FeedsContentBaseObj feedsContentBaseObj, f fVar, Context context, List<BBSLinkObj> list) {
            super(context, list, R.layout.item_rec_link_in_feed);
            this.f91415b = feedsContentBaseObj;
            this.f91416c = fVar;
        }

        public void m(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d BBSLinkObj data) {
            String str;
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42657, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSLinkObj.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
            kotlin.jvm.internal.f0.p(data, "data");
            View view = viewHolder.itemView;
            kotlin.jvm.internal.f0.o(view, "viewHolder.itemView");
            ImageView imageView = (ImageView) viewHolder.i(R.id.iv_image);
            TextView textView = (TextView) viewHolder.i(R.id.tv_title);
            ImageView imageView2 = (ImageView) viewHolder.i(R.id.iv_video_play);
            TextView textView2 = (TextView) viewHolder.i(R.id.tv_comment);
            View viewI = viewHolder.i(R.id.tv_name);
            if (kotlin.jvm.internal.f0.g("1", data.getHas_video())) {
                imageView2.setVisibility(0);
            } else {
                imageView2.setVisibility(8);
            }
            List<String> thumbs = data.getThumbs();
            if (thumbs == null || thumbs.isEmpty()) {
                List<String> imgs = data.getImgs();
                str = !(imgs == null || imgs.isEmpty()) ? data.getImgs().get(0) : null;
            } else {
                str = data.getThumbs().get(0);
            }
            String title = data.getTitle();
            String title2 = !(title == null || title.length() == 0) ? data.getTitle() : data.getDescription();
            com.max.hbimage.b.K(str, imageView);
            textView2.setText(data.getComment_num());
            BBSUserInfoObj user = data.getUser();
            if (user != null) {
                ((TextView) viewI).setText(user.getUsername());
            }
            textView.setText(title2);
            data.setIndex(getDataList().indexOf(data) + "");
            view.setTag(data);
            view.setOnClickListener(new a(this.f91416c, data));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, BBSLinkObj bBSLinkObj) {
            if (PatchProxy.proxy(new Object[]{eVar, bBSLinkObj}, this, changeQuickRedirect, false, 42659, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, bBSLinkObj);
        }

        @Override // com.max.hbcommon.base.adapter.s, androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, 42658, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
            return patchProxyResultProxy.isSupported ? (RecyclerView.ViewHolder) patchProxyResultProxy.result : onCreateViewHolder(viewGroup, i10);
        }

        @Override // com.max.hbcommon.base.adapter.s, androidx.recyclerview.widget.RecyclerView.Adapter
        @dl.d
        public com.max.hbcommon.base.adapter.s.e onCreateViewHolder(@dl.d ViewGroup parent, int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parent, new Integer(i10)}, this, changeQuickRedirect, false, 42656, new Class[]{ViewGroup.class, Integer.TYPE}, com.max.hbcommon.base.adapter.s.e.class);
            if (patchProxyResultProxy.isSupported) {
                return (com.max.hbcommon.base.adapter.s.e) patchProxyResultProxy.result;
            }
            kotlin.jvm.internal.f0.p(parent, "parent");
            com.max.hbcommon.base.adapter.s.e eVarOnCreateViewHolder = super.onCreateViewHolder(parent, i10);
            kotlin.jvm.internal.f0.o(eVarOnCreateViewHolder, "super.onCreateViewHolder(parent, viewType)");
            ImageView imageView = (ImageView) eVarOnCreateViewHolder.i(R.id.iv_image);
            ViewGroup viewGroup = (ViewGroup) eVarOnCreateViewHolder.i(R.id.vg_content);
            View view = eVarOnCreateViewHolder.itemView;
            kotlin.jvm.internal.f0.o(view, "viewHolder.itemView");
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            kotlin.jvm.internal.f0.n(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            ViewGroup.LayoutParams layoutParams3 = viewGroup.getLayoutParams();
            kotlin.jvm.internal.f0.n(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            float fP = com.max.hbutils.utils.n.p(((FeedsContentRecLinksObj) this.f91415b).getImg_width());
            float fP2 = com.max.hbutils.utils.n.p(((FeedsContentRecLinksObj) this.f91415b).getImg_height());
            if (fP > 0.0f) {
                layoutParams3.width = ViewUtils.f(this.f91416c.m(), fP);
            }
            if (fP2 > 0.0f) {
                ((ViewGroup.MarginLayoutParams) layoutParams2).height = ViewUtils.f(this.f91416c.m(), fP2);
            }
            view.setBackground(com.max.hbutils.utils.q.M(com.max.hbutils.utils.q.o(this.f91416c.m(), R.color.white, 2.0f), this.f91416c.m(), R.color.divider_secondary_1_color, 0.5f));
            return eVarOnCreateViewHolder;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@dl.d g0 param) {
        super(param);
        kotlin.jvm.internal.f0.p(param, "param");
    }

    @Override // com.max.xiaoheihe.module.news.adapter.a.InterfaceC0842a
    public void a(@dl.d RecyclerView recyclerView, int i10, int i11) {
        Object[] objArr = {recyclerView, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 42652, new Class[]{RecyclerView.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(recyclerView, "recyclerView");
        RecyclerView.OnScrollListener onScrollListener = this.f91407k;
        if (onScrollListener != null) {
            onScrollListener.onScrolled(recyclerView, i10, i11);
        }
    }

    /* JADX WARN: Type inference failed for: r10v15, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v16, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v2, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v3, types: [T, java.util.List] */
    @Override // com.max.xiaoheihe.module.news.viewholderbinder.h0
    public void i(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d FeedsContentBaseObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42650, new Class[]{com.max.hbcommon.base.adapter.s.e.class, FeedsContentBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
        FeedsContentRecLinksObj feedsContentRecLinksObj = (FeedsContentRecLinksObj) data;
        RecyclerView recyclerView = (RecyclerView) viewHolder.i(R.id.rv);
        Object objG = viewHolder.g();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        if ((objG instanceof FeedsContentBaseObj) && kotlin.jvm.internal.f0.g(objG, data)) {
            Object tag = viewHolder.itemView.getTag(R.id.tag_viewholder);
            if (!(tag instanceof ListExposureObj)) {
                tag = new ListExposureObj(new ArrayList(), new ArrayList());
                viewHolder.itemView.setTag(R.id.tag_viewholder, tag);
            }
            ListExposureObj listExposureObj = (ListExposureObj) tag;
            objectRef.f124891b = listExposureObj.getShow();
            objectRef2.f124891b = listExposureObj.getDisappear();
        } else {
            viewHolder.o(data);
            ListExposureObj listExposureObj2 = new ListExposureObj(new ArrayList(), new ArrayList());
            viewHolder.itemView.setTag(R.id.tag_viewholder, listExposureObj2);
            objectRef.f124891b = listExposureObj2.getShow();
            objectRef2.f124891b = listExposureObj2.getDisappear();
        }
        if (feedsContentRecLinksObj.getItems() == null || feedsContentRecLinksObj.getItems().size() <= 0) {
            return;
        }
        if (recyclerView.getLayoutManager() == null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(m(), 0, false));
        }
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new com.max.hbcustomview.d(ViewUtils.f(p().c(), 8.0f), ViewUtils.f(p().c(), 12.0f)));
        }
        recyclerView.clearOnScrollListeners();
        recyclerView.addOnScrollListener(new a(recyclerView, objectRef, objectRef2));
        this.f91407k = new b(recyclerView, objectRef, objectRef2);
        com.max.hbcommon.base.adapter.t tVar = new com.max.hbcommon.base.adapter.t(new d(data, this, m(), feedsContentRecLinksObj.getItems()));
        View viewInflate = LayoutInflater.from(m()).inflate(R.layout.item_rec_link_in_feed_footer, (ViewGroup) recyclerView, false);
        kotlin.jvm.internal.f0.o(viewInflate, "from(mContext)\n         … listRecyclerView, false)");
        viewInflate.findViewById(R.id.vg_icon).setBackground(ViewUtils.j(ViewUtils.f(m(), 25.0f), com.max.hbcommon.utils.l.a(R.color.divider_secondary_1_color)));
        viewInflate.setOnClickListener(new c());
        tVar.m(R.layout.item_rec_link_in_feed_footer, viewInflate);
        recyclerView.setAdapter(tVar);
    }

    @Override // com.max.xiaoheihe.module.news.viewholderbinder.h0
    public void w(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d BBSLinkObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42651, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSLinkObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
    }
}
