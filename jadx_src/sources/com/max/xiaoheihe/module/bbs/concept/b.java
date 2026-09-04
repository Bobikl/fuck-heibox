package com.max.xiaoheihe.module.bbs.concept;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.base.adapter.i;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.base.adapter.u;
import com.max.hbcommon.component.MoreButton;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.q;
import com.max.xiaoheihe.MainActivity;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSTopicCategoryObj;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.max.xiaoheihe.bean.bbs.ConceptHashtagIndex;
import com.max.xiaoheihe.bean.bbs.ConceptTopicEntryObj;
import com.max.xiaoheihe.bean.bbs.ConceptTopicWrapperObj;
import com.max.xiaoheihe.bean.bbs.HeaderNavObj;
import com.max.xiaoheihe.module.bbs.HashtagDetailActivity;
import com.max.xiaoheihe.view.callback.OnRecyclerViewOnScrollListener;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.fa;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ng.j;

/* JADX INFO: compiled from: ConceptTopicListFragment.java */
/* JADX INFO: loaded from: classes10.dex */
public class b extends com.max.hbcommon.base.d {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private GridLayoutManager f81128b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private s<BBSTopicCategoryObj> f81131e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private u<ConceptTopicWrapperObj> f81132f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f81133g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private fa f81134h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<BBSTopicCategoryObj> f81129c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<ConceptTopicWrapperObj> f81130d = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f81135i = "我的收藏";

    /* JADX INFO: compiled from: ConceptTopicListFragment.java */
    public class a implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // pg.d
        public void k(j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 28183, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            b.L3(b.this);
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.concept.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ConceptTopicListFragment.java */
    public class C0695b extends s<BBSTopicCategoryObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.concept.b$b$a */
        /* JADX INFO: compiled from: ConceptTopicListFragment.java */
        public class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f81138b;

            a(int i10) {
                this.f81138b = i10;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28186, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                b.this.f81133g = this.f81138b;
                String name = ((BBSTopicCategoryObj) b.this.f81129c.get(b.this.f81133g)).getName();
                for (int i10 = 0; i10 < b.this.f81130d.size(); i10++) {
                    if (!com.max.hbcommon.utils.c.u(name) && name.equals(((ConceptTopicWrapperObj) b.this.f81130d.get(i10)).getTitle())) {
                        b.this.f81128b.scrollToPositionWithOffset(i10, 0);
                        break;
                    }
                }
                com.max.hbcommon.utils.d.b("TopicListFragment", "onClick   p==" + b.this.f81133g);
                b.this.f81131e.notifyDataSetChanged();
            }
        }

        C0695b(Context context, List list, int i10) {
            super(context, list, i10);
        }

        public void m(s.e eVar, BBSTopicCategoryObj bBSTopicCategoryObj) {
            if (PatchProxy.proxy(new Object[]{eVar, bBSTopicCategoryObj}, this, changeQuickRedirect, false, 28184, new Class[]{s.e.class, BBSTopicCategoryObj.class}, Void.TYPE).isSupported) {
                return;
            }
            TextView textView = (TextView) eVar.i(R.id.tv_name);
            int adapterPosition = eVar.getAdapterPosition();
            eVar.i(R.id.v_select).setBackgroundResource(R.color.text_primary_1_color);
            eVar.i(R.id.v_select).getLayoutParams().width = ViewUtils.f(((com.max.hbcommon.base.d) b.this).mContext, 2.0f);
            if (adapterPosition == b.this.f81133g) {
                eVar.i(R.id.v_select).setVisibility(0);
                eVar.itemView.setBackgroundResource(R.color.background_card_1_color);
                textView.setTextSize(1, 13.0f);
            } else {
                eVar.i(R.id.v_select).setVisibility(8);
                eVar.itemView.setBackgroundResource(R.color.background_layer_2_color);
                textView.setTextSize(1, 12.0f);
            }
            eVar.p(R.id.tv_name, bBSTopicCategoryObj.getName());
            eVar.itemView.setOnClickListener(new a(adapterPosition));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, BBSTopicCategoryObj bBSTopicCategoryObj) {
            if (PatchProxy.proxy(new Object[]{eVar, bBSTopicCategoryObj}, this, changeQuickRedirect, false, 28185, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, bBSTopicCategoryObj);
        }
    }

    /* JADX INFO: compiled from: ConceptTopicListFragment.java */
    public class c extends u<ConceptTopicWrapperObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: ConceptTopicListFragment.java */
        public class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28192, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                b bVar = b.this;
                bVar.startActivity(MainActivity.k3(((com.max.hbcommon.base.d) bVar).mContext, MainActivity.A4));
            }
        }

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.concept.b$c$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ConceptTopicListFragment.java */
        public class ViewOnClickListenerC0696b implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ConceptTopicWrapperObj f81142b;

            ViewOnClickListenerC0696b(ConceptTopicWrapperObj conceptTopicWrapperObj) {
                this.f81142b = conceptTopicWrapperObj;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28193, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                b.P3(b.this, this.f81142b.getTopic());
            }
        }

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.concept.b$c$c, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ConceptTopicListFragment.java */
        public class ViewOnClickListenerC0697c implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ConceptTopicWrapperObj f81144b;

            ViewOnClickListenerC0697c(ConceptTopicWrapperObj conceptTopicWrapperObj) {
                this.f81144b = conceptTopicWrapperObj;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28194, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                b.P3(b.this, this.f81144b.getTopic());
            }
        }

        /* JADX INFO: compiled from: ConceptTopicListFragment.java */
        public class d extends GridLayoutManager.SpanSizeLookup {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ GridLayoutManager f81146a;

            d(GridLayoutManager gridLayoutManager) {
                this.f81146a = gridLayoutManager;
            }

            @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
            public int getSpanSize(int i10) {
                Object[] objArr = {new Integer(i10)};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                Class cls = Integer.TYPE;
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 28195, new Class[]{cls}, cls);
                if (patchProxyResultProxy.isSupported) {
                    return ((Integer) patchProxyResultProxy.result).intValue();
                }
                if (c.this.getDataList().get(i10).getItem_type() == 0) {
                    return this.f81146a.getSpanCount();
                }
                c cVar = c.this;
                if (b.c4(b.this, cVar.getDataList().get(i10).getTopic())) {
                    return this.f81146a.getSpanCount();
                }
                return 1;
            }
        }

        c(Context context, List list) {
            super(context, list);
        }

        @Override // com.max.hbcommon.base.adapter.u
        public /* bridge */ /* synthetic */ int m(int i10, ConceptTopicWrapperObj conceptTopicWrapperObj) {
            Object[] objArr = {new Integer(i10), conceptTopicWrapperObj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 28190, new Class[]{cls, Object.class}, cls);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : n(i10, conceptTopicWrapperObj);
        }

        public int n(int i10, ConceptTopicWrapperObj conceptTopicWrapperObj) {
            Object[] objArr = {new Integer(i10), conceptTopicWrapperObj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 28187, new Class[]{cls, ConceptTopicWrapperObj.class}, cls);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            if (conceptTopicWrapperObj.getItem_type() == 0) {
                return R.layout.item_concept_topic_list_title;
            }
            return b.c4(b.this, conceptTopicWrapperObj.getTopic()) ? R.layout.item_concept_topic_list_recommend_item : R.layout.item_concept_topic_list_item;
        }

        public void o(s.e eVar, ConceptTopicWrapperObj conceptTopicWrapperObj) {
            if (PatchProxy.proxy(new Object[]{eVar, conceptTopicWrapperObj}, this, changeQuickRedirect, false, 28188, new Class[]{s.e.class, ConceptTopicWrapperObj.class}, Void.TYPE).isSupported) {
                return;
            }
            GradientDrawable gradientDrawableM = q.M(q.o(((com.max.hbcommon.base.d) b.this).mContext, R.color.background_layer_2_color, 3.0f), ((com.max.hbcommon.base.d) b.this).mContext, R.color.divider_secondary_1_color, 0.5f);
            if (eVar.d() == R.layout.item_concept_topic_list_title) {
                ((TextView) eVar.i(R.id.tv_title)).setText(conceptTopicWrapperObj.getTitle());
                MoreButton moreButton = (MoreButton) eVar.i(R.id.mb_action);
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) eVar.itemView.getLayoutParams();
                if ("我的收藏".equals(conceptTopicWrapperObj.getTitle())) {
                    moreButton.setVisibility(0);
                    moreButton.setOnClickListener(new a());
                } else {
                    moreButton.setVisibility(8);
                }
                if (eVar.getBindingAdapterPosition() == 0) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = 0;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = ViewUtils.f(((com.max.hbcommon.base.d) b.this).mContext, 18.0f);
                    return;
                }
            }
            if (eVar.d() == R.layout.item_concept_topic_list_item) {
                ((TextView) eVar.i(R.id.tv_title)).setText(conceptTopicWrapperObj.getTopic().getName());
                ((TextView) eVar.i(R.id.tv_desc)).setText(conceptTopicWrapperObj.getTopic().getDesc());
                eVar.itemView.setBackground(gradientDrawableM);
                eVar.itemView.setOnClickListener(new ViewOnClickListenerC0696b(conceptTopicWrapperObj));
                return;
            }
            if (eVar.d() == R.layout.item_concept_topic_list_recommend_item) {
                eVar.itemView.setBackground(gradientDrawableM);
                ImageView imageView = (ImageView) eVar.i(R.id.iv_img);
                ViewGroup viewGroup = (ViewGroup) eVar.i(R.id.vg_menu);
                ConceptTopicEntryObj special_type = conceptTopicWrapperObj.getTopic().getSpecial_type();
                com.max.hbimage.b.K(special_type.getImg(), imageView);
                ((TextView) eVar.i(R.id.tv_title)).setText(conceptTopicWrapperObj.getTopic().getName());
                ((TextView) eVar.i(R.id.tv_desc)).setText(conceptTopicWrapperObj.getTopic().getDesc());
                viewGroup.removeAllViews();
                Iterator<HeaderNavObj> it = special_type.getItems().iterator();
                while (it.hasNext()) {
                    b.Q3(b.this, viewGroup, it.next());
                }
                eVar.itemView.setOnClickListener(new ViewOnClickListenerC0697c(conceptTopicWrapperObj));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onAttachedToRecyclerView(@n0 RecyclerView recyclerView) {
            if (PatchProxy.proxy(new Object[]{recyclerView}, this, changeQuickRedirect, false, 28189, new Class[]{RecyclerView.class}, Void.TYPE).isSupported) {
                return;
            }
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof GridLayoutManager) {
                GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
                gridLayoutManager.setSpanSizeLookup(new d(gridLayoutManager));
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, Object obj) {
            if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 28191, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            o(eVar, (ConceptTopicWrapperObj) obj);
        }
    }

    /* JADX INFO: compiled from: ConceptTopicListFragment.java */
    public class d extends OnRecyclerViewOnScrollListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.xiaoheihe.view.callback.OnRecyclerViewOnScrollListener, com.max.xiaoheihe.view.callback.c
        public void b(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 28196, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.utils.d.b("TopicListFragment", "onPosition==" + i10);
            if (i10 < 0) {
                i10 = 0;
            }
            String title = ((ConceptTopicWrapperObj) b.this.f81130d.get(i10)).getTitle();
            for (int i11 = 0; i11 < b.this.f81129c.size(); i11++) {
                if (!com.max.hbcommon.utils.c.u(title) && title.equals(((BBSTopicCategoryObj) b.this.f81129c.get(i11)).getName())) {
                    b.this.f81133g = i11;
                    b.this.f81131e.notifyDataSetChanged();
                    return;
                }
            }
        }
    }

    /* JADX INFO: compiled from: ConceptTopicListFragment.java */
    public class e extends com.max.hbcommon.network.d<Result<ConceptHashtagIndex>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28198, new Class[0], Void.TYPE).isSupported && b.this.isActive()) {
                b.this.f81134h.f110505d.A(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 28197, new Class[]{Throwable.class}, Void.TYPE).isSupported && b.this.isActive()) {
                b.this.f81134h.f110505d.A(0);
                super.onError(th2);
                if (b.this.getViewStatus() != 0) {
                    b.S3(b.this);
                }
            }
        }

        public void onNext(Result<ConceptHashtagIndex> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 28199, new Class[]{Result.class}, Void.TYPE).isSupported && b.this.isActive()) {
                if (result != null && result.getResult() != null) {
                    b.U3(b.this, result.getResult());
                } else if (b.this.getViewStatus() != 0) {
                    b.T3(b.this);
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 28200, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<ConceptHashtagIndex>) obj);
        }
    }

    /* JADX INFO: compiled from: ConceptTopicListFragment.java */
    public class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f81150b;

        f(String str) {
            this.f81150b = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28201, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(((com.max.hbcommon.base.d) b.this).mContext, this.f81150b);
        }
    }

    static /* synthetic */ void L3(b bVar) {
        if (PatchProxy.proxy(new Object[]{bVar}, null, changeQuickRedirect, true, 28176, new Class[]{b.class}, Void.TYPE).isSupported) {
            return;
        }
        bVar.k4();
    }

    static /* synthetic */ void P3(b bVar, BBSTopicObj bBSTopicObj) {
        if (PatchProxy.proxy(new Object[]{bVar, bBSTopicObj}, null, changeQuickRedirect, true, 28178, new Class[]{b.class, BBSTopicObj.class}, Void.TYPE).isSupported) {
            return;
        }
        bVar.n4(bBSTopicObj);
    }

    static /* synthetic */ void Q3(b bVar, ViewGroup viewGroup, HeaderNavObj headerNavObj) {
        if (PatchProxy.proxy(new Object[]{bVar, viewGroup, headerNavObj}, null, changeQuickRedirect, true, 28179, new Class[]{b.class, ViewGroup.class, HeaderNavObj.class}, Void.TYPE).isSupported) {
            return;
        }
        bVar.f4(viewGroup, headerNavObj);
    }

    static /* synthetic */ void S3(b bVar) {
        if (PatchProxy.proxy(new Object[]{bVar}, null, changeQuickRedirect, true, 28180, new Class[]{b.class}, Void.TYPE).isSupported) {
            return;
        }
        bVar.showError();
    }

    static /* synthetic */ void T3(b bVar) {
        if (PatchProxy.proxy(new Object[]{bVar}, null, changeQuickRedirect, true, 28181, new Class[]{b.class}, Void.TYPE).isSupported) {
            return;
        }
        bVar.showError();
    }

    static /* synthetic */ void U3(b bVar, ConceptHashtagIndex conceptHashtagIndex) {
        if (PatchProxy.proxy(new Object[]{bVar, conceptHashtagIndex}, null, changeQuickRedirect, true, 28182, new Class[]{b.class, ConceptHashtagIndex.class}, Void.TYPE).isSupported) {
            return;
        }
        bVar.m4(conceptHashtagIndex);
    }

    static /* synthetic */ boolean c4(b bVar, BBSTopicObj bBSTopicObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bVar, bBSTopicObj}, null, changeQuickRedirect, true, 28177, new Class[]{b.class, BBSTopicObj.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : bVar.j4(bBSTopicObj);
    }

    private void f4(ViewGroup viewGroup, HeaderNavObj headerNavObj) {
        if (PatchProxy.proxy(new Object[]{viewGroup, headerNavObj}, this, changeQuickRedirect, false, 28172, new Class[]{ViewGroup.class, HeaderNavObj.class}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = new TextView(this.mContext);
        String protocol = headerNavObj.getProtocol();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, ViewUtils.f(this.mContext, 20.0f));
        layoutParams.rightMargin = ViewUtils.f(this.mContext, 4.0f);
        textView.setLayoutParams(layoutParams);
        textView.setPadding(ViewUtils.f(this.mContext, 5.0f), 0, ViewUtils.f(this.mContext, 5.0f), 0);
        textView.setGravity(17);
        textView.setTextSize(1, 10.0f);
        textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_2_color));
        textView.setBackground(q.M(q.o(this.mContext, R.color.divider_color, 2.0f), this.mContext, R.color.divider_secondary_1_color, 0.5f));
        textView.setText(headerNavObj.getText());
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        textView.setOnClickListener(new f(protocol));
        viewGroup.addView(textView, layoutParams);
    }

    private void g4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28168, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f81134h.f110504c.setBackgroundResource(R.color.background_layer_2_color);
        this.f81134h.f110504c.setLayoutManager(new LinearLayoutManager(this.mContext));
        i iVar = new i(this.mContext, 0, 0);
        iVar.h(getResources().getColor(R.color.divider_color));
        this.f81134h.f110504c.addItemDecoration(iVar);
        this.f81128b = new GridLayoutManager(this.mContext, 2);
        C0695b c0695b = new C0695b(this.mContext, this.f81129c, R.layout.item_activity_group);
        this.f81131e = c0695b;
        this.f81134h.f110504c.setAdapter(c0695b);
        this.f81132f = new c(this.mContext, this.f81130d);
        this.f81134h.f110503b.setLayoutManager(this.f81128b);
        this.f81134h.f110503b.setAdapter(this.f81132f);
        int iF = ViewUtils.f(this.mContext, 9.5f);
        this.f81134h.f110503b.setPadding(iF, 0, iF, 0);
        this.f81134h.f110503b.setBackgroundResource(R.color.background_card_1_color);
        this.f81134h.f110503b.setOnScrollListener(new d());
    }

    private void h4(ConceptHashtagIndex conceptHashtagIndex) {
        if (PatchProxy.proxy(new Object[]{conceptHashtagIndex}, this, changeQuickRedirect, false, 28174, new Class[]{ConceptHashtagIndex.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.w(conceptHashtagIndex.getHashtag_categories())) {
            return;
        }
        for (BBSTopicCategoryObj bBSTopicCategoryObj : conceptHashtagIndex.getHashtag_categories()) {
            ConceptTopicWrapperObj conceptTopicWrapperObj = new ConceptTopicWrapperObj();
            conceptTopicWrapperObj.setItem_type(0);
            conceptTopicWrapperObj.setTitle(bBSTopicCategoryObj.getName());
            this.f81130d.add(conceptTopicWrapperObj);
            if (!com.max.hbcommon.utils.c.w(bBSTopicCategoryObj.getChildren())) {
                for (BBSTopicObj bBSTopicObj : bBSTopicCategoryObj.getChildren()) {
                    ConceptTopicWrapperObj conceptTopicWrapperObj2 = new ConceptTopicWrapperObj();
                    conceptTopicWrapperObj2.setItem_type(1);
                    conceptTopicWrapperObj2.setTitle(bBSTopicCategoryObj.getName());
                    conceptTopicWrapperObj2.setTopic(bBSTopicObj);
                    this.f81130d.add(conceptTopicWrapperObj2);
                }
            }
        }
        this.f81129c.addAll(conceptHashtagIndex.getHashtag_categories());
    }

    private void i4(ConceptHashtagIndex conceptHashtagIndex) {
        if (PatchProxy.proxy(new Object[]{conceptHashtagIndex}, this, changeQuickRedirect, false, 28173, new Class[]{ConceptHashtagIndex.class}, Void.TYPE).isSupported || conceptHashtagIndex.getFavour_hashtags() == null) {
            return;
        }
        ConceptTopicWrapperObj conceptTopicWrapperObj = new ConceptTopicWrapperObj();
        conceptTopicWrapperObj.setItem_type(0);
        conceptTopicWrapperObj.setTitle("我的收藏");
        this.f81130d.add(conceptTopicWrapperObj);
        for (BBSTopicObj bBSTopicObj : conceptHashtagIndex.getFavour_hashtags()) {
            ConceptTopicWrapperObj conceptTopicWrapperObj2 = new ConceptTopicWrapperObj();
            conceptTopicWrapperObj2.setItem_type(1);
            conceptTopicWrapperObj2.setTitle("我的收藏");
            conceptTopicWrapperObj2.setTopic(bBSTopicObj);
            this.f81130d.add(conceptTopicWrapperObj2);
        }
        BBSTopicCategoryObj bBSTopicCategoryObj = new BBSTopicCategoryObj();
        bBSTopicCategoryObj.setName("我的收藏");
        this.f81129c.add(bBSTopicCategoryObj);
    }

    private boolean j4(BBSTopicObj bBSTopicObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bBSTopicObj}, this, changeQuickRedirect, false, 28170, new Class[]{BBSTopicObj.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return bBSTopicObj.getSpecial_type() != null;
    }

    private void k4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28171, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Qb().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e()));
    }

    public static b l4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 28165, new Class[0], b.class);
        return patchProxyResultProxy.isSupported ? (b) patchProxyResultProxy.result : new b();
    }

    private void m4(ConceptHashtagIndex conceptHashtagIndex) {
        if (PatchProxy.proxy(new Object[]{conceptHashtagIndex}, this, changeQuickRedirect, false, 28175, new Class[]{ConceptHashtagIndex.class}, Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        if (conceptHashtagIndex == null) {
            return;
        }
        this.f81130d.clear();
        this.f81129c.clear();
        i4(conceptHashtagIndex);
        h4(conceptHashtagIndex);
        this.f81131e.notifyDataSetChanged();
        this.f81132f.notifyDataSetChanged();
    }

    private void n4(BBSTopicObj bBSTopicObj) {
        if (PatchProxy.proxy(new Object[]{bBSTopicObj}, this, changeQuickRedirect, false, 28169, new Class[]{BBSTopicObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (com.max.hbcommon.utils.c.u(bBSTopicObj.getHashtag_id())) {
            com.max.xiaoheihe.module.bbs.utils.b.H(this.mContext, bBSTopicObj);
        } else {
            Activity activity = this.mContext;
            activity.startActivity(HashtagDetailActivity.x2(activity, bBSTopicObj.getName()));
        }
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28166, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        fa faVarC = fa.c(this.mInflater);
        this.f81134h = faVarC;
        setContentView(faVarC);
        g4();
        this.f81134h.f110505d.S(new a());
        this.f81134h.f110505d.b0(false);
        showLoading();
        k4();
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28167, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        k4();
    }
}
