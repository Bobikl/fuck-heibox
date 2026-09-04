package com.max.xiaoheihe.module.news;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.flyco.tablayout.SlidingTabLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.max.hbcommon.base.adapter.s;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSTopicCategoryObj;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.max.xiaoheihe.bean.bbs.ConceptTopicIndex;
import com.max.xiaoheihe.bean.news.TopicsSearchResult;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.xiaomi.mipush.sdk.Constants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
@com.max.hbcommon.analytics.m(path = "/bbs/list")
public class ChannelListFragment extends com.max.hbcommon.base.d {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static int f91087t = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    EditText f91088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    ImageView f91089c;

    @BindView(R.id.cl_root)
    CoordinatorLayout cl_root;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private androidx.viewpager.widget.a f91090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private androidx.viewpager.widget.a f91091e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private com.max.xiaoheihe.module.news.adapter.c f91098l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private s<BBSTopicCategoryObj> f91099m;

    @BindView(R.id.abl)
    AppBarLayout mAppBarLayout;

    @BindView(R.id.srl)
    SmartRefreshLayout mRefreshLayout;

    @BindView(R.id.rv_subscribed)
    RecyclerView mSubscribedRecyclerView;

    @BindView(R.id.tab)
    SlidingTabLayout mTabLayout;

    @BindView(R.id.vp)
    ViewPager mViewPager;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f91100n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private n f91102p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f91104r;

    @BindView(R.id.tv_edit)
    TextView tv_edit;

    @BindView(R.id.tv_subscribed_empty_tips)
    TextView tv_subscribed_empty_tips;

    @BindView(R.id.v_scroll_container_divier)
    View v_scroll_container_divier;

    @BindView(R.id.vg_header)
    ViewGroup vg_header;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<BBSTopicCategoryObj> f91092f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<BBSTopicCategoryObj> f91093g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<BBSTopicObj> f91094h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<BBSTopicCategoryObj> f91095i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private List<BBSTopicObj> f91096j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List<com.max.xiaoheihe.module.news.adapter.b> f91097k = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f91101o = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private m f91103q = new m(this);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f91105s = f91087t;

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.news.ChannelListFragment$9, reason: invalid class name */
    public class AnonymousClass9 extends s<BBSTopicCategoryObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.news.ChannelListFragment$9$a */
        public class a extends RecyclerView.ItemDecoration {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                if (PatchProxy.proxy(new Object[]{rect, view, recyclerView, state}, this, changeQuickRedirect, false, 42300, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                    return;
                }
                rect.set(0, ViewUtils.f(((com.max.hbcommon.base.d) ChannelListFragment.this).mContext, 4.0f), 0, 0);
            }
        }

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.news.ChannelListFragment$9$b */
        public class b extends s<BBSTopicObj> {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.news.ChannelListFragment$9$b$a */
            public class a implements View.OnClickListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ BBSTopicObj f91110b;

                a(BBSTopicObj bBSTopicObj) {
                    this.f91110b = bBSTopicObj;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42305, new Class[]{View.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    b.m(b.this, this.f91110b);
                }
            }

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.news.ChannelListFragment$9$b$b, reason: collision with other inner class name */
            public class ViewOnClickListenerC0841b implements View.OnClickListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ BBSTopicObj f91112b;

                ViewOnClickListenerC0841b(BBSTopicObj bBSTopicObj) {
                    this.f91112b = bBSTopicObj;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42306, new Class[]{View.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    if (ChannelListFragment.this.f91102p == null || !ChannelListFragment.this.f91102p.a()) {
                        com.max.xiaoheihe.module.bbs.utils.b.I(((com.max.hbcommon.base.d) ChannelListFragment.this).mContext, this.f91112b, "link");
                    } else {
                        b.m(b.this, this.f91112b);
                    }
                }
            }

            b(Context context, List list, int i10) {
                super(context, list, i10);
            }

            static /* synthetic */ void m(b bVar, BBSTopicObj bBSTopicObj) {
                if (PatchProxy.proxy(new Object[]{bVar, bBSTopicObj}, null, changeQuickRedirect, true, 42304, new Class[]{b.class, BBSTopicObj.class}, Void.TYPE).isSupported) {
                    return;
                }
                bVar.o(bBSTopicObj);
            }

            private void o(BBSTopicObj bBSTopicObj) {
                if (PatchProxy.proxy(new Object[]{bBSTopicObj}, this, changeQuickRedirect, false, 42302, new Class[]{BBSTopicObj.class}, Void.TYPE).isSupported) {
                    return;
                }
                if (ChannelListFragment.this.f91102p.e(bBSTopicObj)) {
                    ChannelListFragment.this.f91102p.b(bBSTopicObj);
                    notifyItemChanged(getDataList().indexOf(bBSTopicObj));
                } else {
                    if (ChannelListFragment.this.f91102p.getCount() < ChannelListFragment.this.f91105s) {
                        ChannelListFragment.this.f91102p.d(bBSTopicObj);
                        notifyItemChanged(getDataList().indexOf(bBSTopicObj));
                        return;
                    }
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f("最多添加" + ChannelListFragment.this.f91105s + "个置顶社区");
                }
            }

            public void n(s.e eVar, BBSTopicObj bBSTopicObj) {
                if (PatchProxy.proxy(new Object[]{eVar, bBSTopicObj}, this, changeQuickRedirect, false, 42301, new Class[]{s.e.class, BBSTopicObj.class}, Void.TYPE).isSupported) {
                    return;
                }
                View viewB = eVar.b();
                CardView cardView = (CardView) eVar.i(R.id.cv_root);
                int[] iArrP = com.max.xiaoheihe.module.news.adapter.b.p(((com.max.hbcommon.base.d) ChannelListFragment.this).mContext);
                ViewGroup.LayoutParams layoutParams = cardView.getLayoutParams();
                int i10 = layoutParams.width;
                int i11 = iArrP[0];
                if (i10 != i11) {
                    layoutParams.width = i11;
                }
                int i12 = layoutParams.height;
                int i13 = iArrP[1];
                if (i12 != i13) {
                    layoutParams.height = i13;
                }
                com.max.xiaoheihe.module.news.adapter.b.u(eVar, bBSTopicObj);
                ImageView imageView = (ImageView) eVar.i(R.id.iv_checked);
                if (!ChannelListFragment.this.f91102p.a() || BBSTopicObj.TOPIC_ID_FORBID.equals(bBSTopicObj.getTopic_id())) {
                    imageView.setVisibility(8);
                } else {
                    imageView.setVisibility(0);
                    if (ChannelListFragment.this.f91096j == null || !ChannelListFragment.this.f91096j.contains(bBSTopicObj)) {
                        imageView.setImageResource(R.drawable.common_cb_unchecked);
                    } else {
                        imageView.setImageResource(R.drawable.common_cb_checked);
                    }
                    imageView.setOnClickListener(new a(bBSTopicObj));
                }
                viewB.setOnClickListener(new ViewOnClickListenerC0841b(bBSTopicObj));
            }

            @Override // com.max.hbcommon.base.adapter.s
            public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, BBSTopicObj bBSTopicObj) {
                if (PatchProxy.proxy(new Object[]{eVar, bBSTopicObj}, this, changeQuickRedirect, false, 42303, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                n(eVar, bBSTopicObj);
            }
        }

        AnonymousClass9(Context context, List list, int i10) {
            super(context, list, i10);
        }

        public void m(s.e eVar, BBSTopicCategoryObj bBSTopicCategoryObj) {
            if (PatchProxy.proxy(new Object[]{eVar, bBSTopicCategoryObj}, this, changeQuickRedirect, false, 42297, new Class[]{s.e.class, BBSTopicCategoryObj.class}, Void.TYPE).isSupported) {
                return;
            }
            RecyclerView recyclerView = (RecyclerView) eVar.i(R.id.rv_search_item);
            ((TextView) eVar.i(R.id.tv_group_name)).setText(bBSTopicCategoryObj.getName());
            recyclerView.setAdapter(new b(((com.max.hbcommon.base.d) ChannelListFragment.this).mContext, bBSTopicCategoryObj.getChildren(), R.layout.item_concept_topic));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, BBSTopicCategoryObj bBSTopicCategoryObj) {
            if (PatchProxy.proxy(new Object[]{eVar, bBSTopicCategoryObj}, this, changeQuickRedirect, false, 42298, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, bBSTopicCategoryObj);
        }

        @Override // com.max.hbcommon.base.adapter.s, androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, 42299, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
            return patchProxyResultProxy.isSupported ? (RecyclerView.ViewHolder) patchProxyResultProxy.result : onCreateViewHolder(viewGroup, i10);
        }

        @Override // com.max.hbcommon.base.adapter.s, androidx.recyclerview.widget.RecyclerView.Adapter
        public s.e onCreateViewHolder(ViewGroup viewGroup, int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, 42296, new Class[]{ViewGroup.class, Integer.TYPE}, s.e.class);
            if (patchProxyResultProxy.isSupported) {
                return (s.e) patchProxyResultProxy.result;
            }
            s.e eVarOnCreateViewHolder = super.onCreateViewHolder(viewGroup, i10);
            RecyclerView recyclerView = (RecyclerView) eVarOnCreateViewHolder.i(R.id.rv_search_item);
            recyclerView.setLayoutManager(new GridLayoutManager(((com.max.hbcommon.base.d) ChannelListFragment.this).mContext, com.max.xiaoheihe.module.news.adapter.b.r(((com.max.hbcommon.base.d) ChannelListFragment.this).mContext)) { // from class: com.max.xiaoheihe.module.news.ChannelListFragment.9.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                public boolean canScrollVertically() {
                    return false;
                }
            });
            recyclerView.setPadding(ViewUtils.f(((com.max.hbcommon.base.d) ChannelListFragment.this).mContext, 4.0f), 0, 0, 0);
            recyclerView.addItemDecoration(new a());
            return eVarOnCreateViewHolder;
        }
    }

    public class a implements n {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.max.xiaoheihe.module.news.ChannelListFragment.n
        public boolean a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42267, new Class[0], Boolean.TYPE);
            return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : ChannelListFragment.this.f91101o;
        }

        @Override // com.max.xiaoheihe.module.news.ChannelListFragment.n
        public void b(BBSTopicObj bBSTopicObj) {
            if (PatchProxy.proxy(new Object[]{bBSTopicObj}, this, changeQuickRedirect, false, 42266, new Class[]{BBSTopicObj.class}, Void.TYPE).isSupported) {
                return;
            }
            int iIndexOf = ChannelListFragment.this.f91096j.indexOf(bBSTopicObj);
            ChannelListFragment.this.f91096j.remove(bBSTopicObj);
            ChannelListFragment.this.f91098l.notifyItemRemoved(iIndexOf);
            if (ChannelListFragment.this.f91096j.size() == 0) {
                ChannelListFragment.a4(ChannelListFragment.this);
                ChannelListFragment.m4(ChannelListFragment.this);
            }
            if (ChannelListFragment.this.f91092f != null) {
                for (int i10 = 0; i10 < ChannelListFragment.this.f91092f.size(); i10++) {
                    if (((BBSTopicCategoryObj) ChannelListFragment.this.f91092f.get(i10)).getChildren().contains(bBSTopicObj)) {
                        ((com.max.xiaoheihe.module.news.adapter.b) ChannelListFragment.this.f91097k.get(i10)).notifyItemChanged(((BBSTopicCategoryObj) ChannelListFragment.this.f91092f.get(i10)).getChildren().indexOf(bBSTopicObj));
                    }
                }
            }
            ChannelListFragment.this.f91099m.notifyDataSetChanged();
        }

        @Override // com.max.xiaoheihe.module.news.ChannelListFragment.n
        public void c() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42269, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            ChannelListFragment channelListFragment = ChannelListFragment.this;
            ChannelListFragment.Z3(channelListFragment, !channelListFragment.f91101o);
            if (ChannelListFragment.this.f91101o) {
                return;
            }
            ChannelListFragment.a4(ChannelListFragment.this);
        }

        @Override // com.max.xiaoheihe.module.news.ChannelListFragment.n
        public void d(BBSTopicObj bBSTopicObj) {
            if (PatchProxy.proxy(new Object[]{bBSTopicObj}, this, changeQuickRedirect, false, 42265, new Class[]{BBSTopicObj.class}, Void.TYPE).isSupported) {
                return;
            }
            ChannelListFragment.this.f91096j.add(bBSTopicObj);
            ChannelListFragment.m4(ChannelListFragment.this);
            ChannelListFragment.this.f91098l.notifyItemInserted(ChannelListFragment.this.f91096j.size() - 1);
            ChannelListFragment channelListFragment = ChannelListFragment.this;
            channelListFragment.mSubscribedRecyclerView.smoothScrollToPosition(channelListFragment.f91096j.size() - 1);
            if (ChannelListFragment.this.f91092f != null) {
                for (int i10 = 0; i10 < ChannelListFragment.this.f91092f.size(); i10++) {
                    if (((BBSTopicCategoryObj) ChannelListFragment.this.f91092f.get(i10)).getChildren().contains(bBSTopicObj)) {
                        ((com.max.xiaoheihe.module.news.adapter.b) ChannelListFragment.this.f91097k.get(i10)).notifyItemChanged(((BBSTopicCategoryObj) ChannelListFragment.this.f91092f.get(i10)).getChildren().indexOf(bBSTopicObj));
                    }
                }
            }
            ChannelListFragment.o4(ChannelListFragment.this);
            if (ChannelListFragment.this.mViewPager.getAdapter() == ChannelListFragment.this.f91091e) {
                ChannelListFragment.this.f91099m.notifyDataSetChanged();
            }
        }

        @Override // com.max.xiaoheihe.module.news.ChannelListFragment.n
        public boolean e(BBSTopicObj bBSTopicObj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bBSTopicObj}, this, changeQuickRedirect, false, 42270, new Class[]{BBSTopicObj.class}, Boolean.TYPE);
            return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : ChannelListFragment.this.f91096j.contains(bBSTopicObj);
        }

        @Override // com.max.xiaoheihe.module.news.ChannelListFragment.n
        public int getCount() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42268, new Class[0], Integer.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            if (com.max.hbcommon.utils.c.w(ChannelListFragment.this.f91096j)) {
                return 0;
            }
            return ChannelListFragment.this.f91096j.size();
        }
    }

    public class b extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        public void onNext(Result result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 42271, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            Intent intent = new Intent();
            intent.setAction(lb.a.E);
            ((com.max.hbcommon.base.d) ChannelListFragment.this).mContext.sendBroadcast(intent);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 42272, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public class c extends com.max.hbcommon.network.d<Result<ConceptTopicIndex>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42274, new Class[0], Void.TYPE).isSupported && ChannelListFragment.this.isActive()) {
                super.onComplete();
                ChannelListFragment.this.mRefreshLayout.A(0);
                ChannelListFragment.this.mRefreshLayout.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 42273, new Class[]{Throwable.class}, Void.TYPE).isSupported && ChannelListFragment.this.isActive()) {
                super.onError(th2);
                ChannelListFragment.r4(ChannelListFragment.this);
                ChannelListFragment.this.mRefreshLayout.A(0);
                ChannelListFragment.this.mRefreshLayout.p(0);
            }
        }

        public void onNext(Result<ConceptTopicIndex> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 42275, new Class[]{Result.class}, Void.TYPE).isSupported && ChannelListFragment.this.isActive()) {
                super.onNext(result);
                ChannelListFragment.t4(ChannelListFragment.this, result.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 42276, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<ConceptTopicIndex>) obj);
        }
    }

    public class d extends com.max.hbcommon.network.d<Result<TopicsSearchResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f91117b;

        d(String str) {
            this.f91117b = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42278, new Class[0], Void.TYPE).isSupported && this.f91117b.equals(ChannelListFragment.this.f91104r) && ChannelListFragment.this.isActive()) {
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 42277, new Class[]{Throwable.class}, Void.TYPE).isSupported && this.f91117b.equals(ChannelListFragment.this.f91104r) && ChannelListFragment.this.isActive()) {
                super.onError(th2);
            }
        }

        public void onNext(Result<TopicsSearchResult> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 42279, new Class[]{Result.class}, Void.TYPE).isSupported && this.f91117b.equals(ChannelListFragment.this.f91104r) && ChannelListFragment.this.isActive()) {
                super.onNext(result);
                if (result.getResult() != null && result.getResult().getTopics() != null) {
                    ChannelListFragment.this.f91094h.clear();
                    ChannelListFragment.this.f91095i.clear();
                    ChannelListFragment.this.f91095i.addAll(result.getResult().getTopics());
                    Iterator<BBSTopicCategoryObj> it = result.getResult().getTopics().iterator();
                    while (it.hasNext()) {
                        ChannelListFragment.this.f91094h.addAll(it.next().getChildren());
                    }
                }
                ChannelListFragment.w4(ChannelListFragment.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 42280, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<TopicsSearchResult>) obj);
        }
    }

    public class e implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // pg.d
        public void k(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 42264, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            ChannelListFragment.L3(ChannelListFragment.this);
        }
    }

    public class f extends androidx.viewpager.widget.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f91120a;

        public class a extends RecyclerView.ItemDecoration {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                if (PatchProxy.proxy(new Object[]{rect, view, recyclerView, state}, this, changeQuickRedirect, false, 42287, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                    return;
                }
                rect.set(0, ViewUtils.f(((com.max.hbcommon.base.d) ChannelListFragment.this).mContext, 4.0f), 0, 0);
            }
        }

        f() {
        }

        @Override // androidx.viewpager.widget.a
        public void destroyItem(@n0 ViewGroup viewGroup, int i10, @n0 Object obj) {
            if (PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10), obj}, this, changeQuickRedirect, false, 42285, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            viewGroup.removeView((View) obj);
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42283, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : ChannelListFragment.this.f91092f.size();
        }

        @Override // androidx.viewpager.widget.a
        public int getItemPosition(Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 42282, new Class[]{Object.class}, Integer.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            int i10 = this.f91120a;
            if (i10 <= 0) {
                return super.getItemPosition(obj);
            }
            this.f91120a = i10 - 1;
            return -2;
        }

        @Override // androidx.viewpager.widget.a
        @p0
        public CharSequence getPageTitle(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 42286, new Class[]{Integer.TYPE}, CharSequence.class);
            if (patchProxyResultProxy.isSupported) {
                return (CharSequence) patchProxyResultProxy.result;
            }
            return !com.max.hbcommon.utils.c.u(((BBSTopicCategoryObj) ChannelListFragment.this.f91092f.get(i10)).getName()) ? ((BBSTopicCategoryObj) ChannelListFragment.this.f91092f.get(i10)).getName() : "社区";
        }

        @Override // androidx.viewpager.widget.a
        @n0
        public Object instantiateItem(@n0 ViewGroup viewGroup, int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, 42284, new Class[]{ViewGroup.class, Integer.TYPE}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            ViewUtils.f(((com.max.hbcommon.base.d) ChannelListFragment.this).mContext, 12.0f);
            RecyclerView recyclerView = new RecyclerView(((com.max.hbcommon.base.d) ChannelListFragment.this).mContext);
            recyclerView.setLayoutManager(new GridLayoutManager(((com.max.hbcommon.base.d) ChannelListFragment.this).mContext, com.max.xiaoheihe.module.news.adapter.b.r(((com.max.hbcommon.base.d) ChannelListFragment.this).mContext)));
            recyclerView.setPadding(ViewUtils.f(((com.max.hbcommon.base.d) ChannelListFragment.this).mContext, 4.0f), 0, 0, ViewUtils.f(((com.max.hbcommon.base.d) ChannelListFragment.this).mContext, 20.0f));
            recyclerView.setClipToPadding(false);
            recyclerView.setAdapter((RecyclerView.Adapter) ChannelListFragment.this.f91097k.get(i10));
            recyclerView.addItemDecoration(new a());
            viewGroup.addView(recyclerView);
            return recyclerView;
        }

        @Override // androidx.viewpager.widget.a
        public boolean isViewFromObject(@n0 View view, @n0 Object obj) {
            return view == obj;
        }

        @Override // androidx.viewpager.widget.a
        public void notifyDataSetChanged() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42281, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            this.f91120a = getCount();
            super.notifyDataSetChanged();
        }
    }

    public class g extends androidx.viewpager.widget.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a extends RecyclerView.ItemDecoration {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                if (PatchProxy.proxy(new Object[]{rect, view, recyclerView, state}, this, changeQuickRedirect, false, 42290, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                    return;
                }
                super.getItemOffsets(rect, view, recyclerView, state);
                rect.set(0, 0, 0, ViewUtils.f(((com.max.hbcommon.base.d) ChannelListFragment.this).mContext, 20.0f));
            }
        }

        g() {
        }

        @Override // androidx.viewpager.widget.a
        public void destroyItem(@n0 ViewGroup viewGroup, int i10, @n0 Object obj) {
            if (PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10), obj}, this, changeQuickRedirect, false, 42289, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            viewGroup.removeView((View) obj);
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            return 1;
        }

        @Override // androidx.viewpager.widget.a
        public int getItemPosition(Object obj) {
            return -2;
        }

        @Override // androidx.viewpager.widget.a
        @p0
        public CharSequence getPageTitle(int i10) {
            return "推荐话题";
        }

        @Override // androidx.viewpager.widget.a
        @n0
        public Object instantiateItem(@n0 ViewGroup viewGroup, int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, 42288, new Class[]{ViewGroup.class, Integer.TYPE}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            View viewInflate = LayoutInflater.from(((com.max.hbcommon.base.d) ChannelListFragment.this).mContext).inflate(R.layout.view_rv_with_empty, viewGroup, false);
            ViewUtils.f(((com.max.hbcommon.base.d) ChannelListFragment.this).mContext, 12.0f);
            RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.rv_search);
            ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(R.id.vg_search_empty);
            ((TextView) viewInflate.findViewById(R.id.tv_empty)).setText("暂无相关社区");
            recyclerView.setLayoutManager(new LinearLayoutManager(((com.max.hbcommon.base.d) ChannelListFragment.this).mContext));
            recyclerView.setAdapter(ChannelListFragment.this.f91099m);
            recyclerView.addItemDecoration(new a());
            viewGroup.addView(viewInflate);
            if (com.max.hbcommon.utils.c.w(ChannelListFragment.this.f91095i)) {
                viewGroup2.setVisibility(0);
                recyclerView.setVisibility(8);
            } else {
                recyclerView.setVisibility(0);
                viewGroup2.setVisibility(8);
            }
            return viewInflate;
        }

        @Override // androidx.viewpager.widget.a
        public boolean isViewFromObject(@n0 View view, @n0 Object obj) {
            return view == obj;
        }
    }

    public class h implements TextView.OnEditorActionListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{textView, new Integer(i10), keyEvent}, this, changeQuickRedirect, false, 42291, new Class[]{TextView.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (i10 == 3) {
                String strR = ChannelListFragment.this.r();
                ChannelListFragment channelListFragment = ChannelListFragment.this;
                ChannelListFragment.T3(channelListFragment, channelListFragment.f91088b);
                if (!com.max.hbcommon.utils.c.u(strR)) {
                    ChannelListFragment channelListFragment2 = ChannelListFragment.this;
                    ChannelListFragment.U3(channelListFragment2, channelListFragment2.r());
                    return true;
                }
            }
            return false;
        }
    }

    public class i implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42292, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ChannelListFragment.this.f91088b.setText("");
        }
    }

    public class j implements TextWatcher {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (PatchProxy.proxy(new Object[]{editable}, this, changeQuickRedirect, false, 42293, new Class[]{Editable.class}, Void.TYPE).isSupported) {
                return;
            }
            ChannelListFragment.this.f91103q.removeCallbacksAndMessages(null);
            Message messageObtainMessage = ChannelListFragment.this.f91103q.obtainMessage();
            messageObtainMessage.obj = editable.toString();
            ChannelListFragment.this.f91103q.sendMessageDelayed(messageObtainMessage, 100L);
            if (editable.length() > 0) {
                ChannelListFragment.this.f91089c.setVisibility(0);
                ChannelListFragment.W3(ChannelListFragment.this, true);
            } else {
                ChannelListFragment.this.f91089c.setVisibility(8);
                ChannelListFragment.W3(ChannelListFragment.this, false);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    public class k implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42294, new Class[]{View.class}, Void.TYPE).isSupported || ChannelListFragment.this.f91101o) {
                return;
            }
            ChannelListFragment.Z3(ChannelListFragment.this, true);
        }
    }

    public class l implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42295, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ChannelListFragment channelListFragment = ChannelListFragment.this;
            ChannelListFragment.Z3(channelListFragment, true ^ channelListFragment.f91101o);
            if (ChannelListFragment.this.f91101o) {
                return;
            }
            ChannelListFragment.a4(ChannelListFragment.this);
        }
    }

    public static class m extends Handler {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<ChannelListFragment> f91130a;

        public m(ChannelListFragment channelListFragment) {
            this.f91130a = new WeakReference<>(channelListFragment);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (PatchProxy.proxy(new Object[]{message}, this, changeQuickRedirect, false, 42307, new Class[]{Message.class}, Void.TYPE).isSupported) {
                return;
            }
            super.handleMessage(message);
            ChannelListFragment channelListFragment = this.f91130a.get();
            if (channelListFragment != null) {
                int i10 = message.what;
                channelListFragment.J4((String) message.obj);
            }
        }
    }

    public interface n {
        boolean a();

        void b(BBSTopicObj bBSTopicObj);

        void c();

        void d(BBSTopicObj bBSTopicObj);

        boolean e(BBSTopicObj bBSTopicObj);

        int getCount();
    }

    private void C4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 42249, new Class[]{String.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(str)) {
            return;
        }
        this.f91104r = str;
        N4(str);
    }

    private void D4(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 42242, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        View childAt = this.mAppBarLayout.getChildAt(0);
        AppBarLayout.LayoutParams layoutParams = (AppBarLayout.LayoutParams) childAt.getLayoutParams();
        if (!z10) {
            layoutParams.h(0);
        } else {
            layoutParams.h(5);
            childAt.setLayoutParams(layoutParams);
        }
    }

    private void E4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42238, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().D4().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
    }

    private void F4(View view) {
        InputMethodManager inputMethodManager;
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42246, new Class[]{View.class}, Void.TYPE).isSupported || (inputMethodManager = (InputMethodManager) this.mContext.getSystemService("input_method")) == null || view == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    private void G4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42235, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f91102p = new a();
    }

    private void H4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42234, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f91099m = new AnonymousClass9(this.mContext, this.f91095i, R.layout.item_concept_topic_group);
    }

    public static ChannelListFragment I4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 42230, new Class[0], ChannelListFragment.class);
        return patchProxyResultProxy.isSupported ? (ChannelListFragment) patchProxyResultProxy.result : new ChannelListFragment();
    }

    private void K4(ConceptTopicIndex conceptTopicIndex) {
        if (PatchProxy.proxy(new Object[]{conceptTopicIndex}, this, changeQuickRedirect, false, 42239, new Class[]{ConceptTopicIndex.class}, Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        this.f91093g = com.max.hbutils.utils.k.b(com.max.hbutils.utils.k.r(conceptTopicIndex.getCategories()), BBSTopicCategoryObj.class);
        this.f91096j.clear();
        if (conceptTopicIndex.getSubscribed_topics() != null && !com.max.hbcommon.utils.c.w(conceptTopicIndex.getSubscribed_topics().getChildren())) {
            this.f91096j.addAll(conceptTopicIndex.getSubscribed_topics().getChildren());
        }
        if (conceptTopicIndex.getFollow_topic_limit() >= 0) {
            this.f91105s = conceptTopicIndex.getFollow_topic_limit();
        }
        M4();
        this.f91092f.clear();
        this.f91092f.addAll(conceptTopicIndex.getCategories());
        this.f91097k.clear();
        for (int i10 = 0; i10 < this.f91092f.size(); i10++) {
            this.f91097k.add(new com.max.xiaoheihe.module.news.adapter.b(this.mContext, this.f91092f.get(i10).getChildren(), this.f91102p));
        }
        this.f91090d.notifyDataSetChanged();
        this.mTabLayout.setTabPadding(10.0f);
        this.mTabLayout.setTabSpaceEqual(false);
        this.mTabLayout.setViewPager(this.mViewPager);
    }

    static /* synthetic */ void L3(ChannelListFragment channelListFragment) {
        if (PatchProxy.proxy(new Object[]{channelListFragment}, null, changeQuickRedirect, true, 42253, new Class[]{ChannelListFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        channelListFragment.E4();
    }

    private void L4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42251, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f91091e.notifyDataSetChanged();
        this.f91099m.notifyDataSetChanged();
    }

    private void M4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42240, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        R4();
        this.f91098l.notifyDataSetChanged();
    }

    private void N4(@n0 String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 42250, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().h8(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d(str)));
    }

    private void O4(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 42236, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            this.mRefreshLayout.i0(false);
            this.mViewPager.setAdapter(this.f91091e);
            this.mTabLayout.setVisibility(8);
        } else {
            this.mRefreshLayout.i0(true);
            this.mViewPager.setAdapter(this.f91090d);
            this.mTabLayout.setVisibility(0);
        }
    }

    private void P4(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 42243, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f91101o = z10;
        this.f91098l.notifyDataSetChanged();
        this.f91090d.notifyDataSetChanged();
        this.f91099m.notifyDataSetChanged();
        if (this.f91101o) {
            D4(false);
            this.tv_subscribed_empty_tips.setText(com.max.xiaoheihe.utils.d.n0(R.string.channel_list_empty_tips_add));
            this.tv_edit.setText(com.max.xiaoheihe.utils.d.n0(R.string.complete));
        } else {
            D4(true);
            this.tv_subscribed_empty_tips.setText(com.max.xiaoheihe.utils.d.n0(R.string.channel_list_empty_tips_edit));
            this.tv_edit.setText(com.max.xiaoheihe.utils.d.n0(R.string.edit));
        }
    }

    private void Q4() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42245, new Class[0], Void.TYPE).isSupported && this.mViewPager.getAdapter() == this.f91090d) {
            int currentItem = this.mViewPager.getCurrentItem();
            for (int i10 = 0; i10 < this.f91097k.size(); i10++) {
                if (i10 != currentItem) {
                    this.f91097k.get(i10).notifyDataSetChanged();
                }
            }
        }
    }

    private void R4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42241, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (com.max.hbcommon.utils.c.w(this.f91096j)) {
            this.mSubscribedRecyclerView.setVisibility(8);
            this.tv_subscribed_empty_tips.setVisibility(0);
        } else {
            this.mSubscribedRecyclerView.setVisibility(0);
            this.tv_subscribed_empty_tips.setVisibility(8);
        }
    }

    private void S4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42237, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < this.f91096j.size(); i10++) {
            if (sb2.length() > 0) {
                sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            sb2.append(this.f91096j.get(i10).getTopic_id());
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Q2(sb2.toString()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    static /* synthetic */ void T3(ChannelListFragment channelListFragment, View view) {
        if (PatchProxy.proxy(new Object[]{channelListFragment, view}, null, changeQuickRedirect, true, 42254, new Class[]{ChannelListFragment.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        channelListFragment.F4(view);
    }

    static /* synthetic */ void U3(ChannelListFragment channelListFragment, String str) {
        if (PatchProxy.proxy(new Object[]{channelListFragment, str}, null, changeQuickRedirect, true, 42255, new Class[]{ChannelListFragment.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        channelListFragment.C4(str);
    }

    static /* synthetic */ void W3(ChannelListFragment channelListFragment, boolean z10) {
        if (PatchProxy.proxy(new Object[]{channelListFragment, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 42256, new Class[]{ChannelListFragment.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        channelListFragment.O4(z10);
    }

    static /* synthetic */ void Z3(ChannelListFragment channelListFragment, boolean z10) {
        if (PatchProxy.proxy(new Object[]{channelListFragment, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 42257, new Class[]{ChannelListFragment.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        channelListFragment.P4(z10);
    }

    static /* synthetic */ void a4(ChannelListFragment channelListFragment) {
        if (PatchProxy.proxy(new Object[]{channelListFragment}, null, changeQuickRedirect, true, 42258, new Class[]{ChannelListFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        channelListFragment.S4();
    }

    static /* synthetic */ void m4(ChannelListFragment channelListFragment) {
        if (PatchProxy.proxy(new Object[]{channelListFragment}, null, changeQuickRedirect, true, 42259, new Class[]{ChannelListFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        channelListFragment.R4();
    }

    static /* synthetic */ void o4(ChannelListFragment channelListFragment) {
        if (PatchProxy.proxy(new Object[]{channelListFragment}, null, changeQuickRedirect, true, 42260, new Class[]{ChannelListFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        channelListFragment.Q4();
    }

    static /* synthetic */ void r4(ChannelListFragment channelListFragment) {
        if (PatchProxy.proxy(new Object[]{channelListFragment}, null, changeQuickRedirect, true, 42261, new Class[]{ChannelListFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        channelListFragment.showError();
    }

    static /* synthetic */ void t4(ChannelListFragment channelListFragment, ConceptTopicIndex conceptTopicIndex) {
        if (PatchProxy.proxy(new Object[]{channelListFragment, conceptTopicIndex}, null, changeQuickRedirect, true, 42262, new Class[]{ChannelListFragment.class, ConceptTopicIndex.class}, Void.TYPE).isSupported) {
            return;
        }
        channelListFragment.K4(conceptTopicIndex);
    }

    static /* synthetic */ void w4(ChannelListFragment channelListFragment) {
        if (PatchProxy.proxy(new Object[]{channelListFragment}, null, changeQuickRedirect, true, 42263, new Class[]{ChannelListFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        channelListFragment.L4();
    }

    public void J4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 42252, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        C4(str);
    }

    @Override // com.max.hbcommon.base.d
    public void initData() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42232, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        E4();
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42231, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.fragment_concept_topics);
        this.mUnBinder = ButterKnife.f(this, view);
        this.f91100n = ViewUtils.f(this.mContext, 10.0f);
        G4();
        this.mSubscribedRecyclerView.setLayoutManager(new LinearLayoutManager(this.mContext, 0, false));
        this.f91098l = new com.max.xiaoheihe.module.news.adapter.c(this.mContext, this.f91096j, this.f91102p);
        this.mSubscribedRecyclerView.setPadding(ViewUtils.f(this.mContext, 1.0f), 0, ViewUtils.f(this.mContext, 1.0f), 0);
        this.mSubscribedRecyclerView.setClipToPadding(false);
        this.mRefreshLayout.setBackgroundResource(R.color.background_layer_2_color);
        this.mRefreshLayout.S(new e());
        this.mRefreshLayout.b0(false);
        ViewUtils.b(this.mAppBarLayout, this.v_scroll_container_divier);
        this.mSubscribedRecyclerView.setAdapter(this.f91098l);
        this.f91090d = new f();
        this.f91091e = new g();
        this.mViewPager.setOffscreenPageLimit(5);
        this.mViewPager.setAdapter(this.f91090d);
        if (this.mIsFirst) {
            showLoading();
        }
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42247, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f91103q.removeCallbacksAndMessages(null);
        super.onDestroyView();
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42244, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        E4();
    }

    public String r() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42248, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        EditText editText = this.f91088b;
        return editText != null ? editText.getText().toString() : "";
    }

    @Override // com.max.hbcommon.base.d
    public void registerEvents() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42233, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) this.vg_header.findViewById(R.id.vg_search);
        viewGroup.findViewById(R.id.v_divider).setVisibility(8);
        this.f91088b = (EditText) viewGroup.findViewById(R.id.et_search);
        this.f91089c = (ImageView) viewGroup.findViewById(R.id.iv_del);
        H4();
        this.f91088b.setHint(R.string.hint_search_channel_name);
        this.f91088b.setFocusable(true);
        this.f91088b.setFocusableInTouchMode(true);
        this.f91088b.setImeOptions(3);
        this.f91088b.setOnEditorActionListener(new h());
        this.f91089c.setOnClickListener(new i());
        this.f91088b.addTextChangedListener(new j());
        int iL = (int) (((((int) (((ViewUtils.L(this.mContext) - ViewUtils.f(this.mContext, 64.0f)) / 5.0f) + 0.5f)) * 74) / 62.0f) + 0.5f);
        ViewGroup.LayoutParams layoutParams = this.tv_subscribed_empty_tips.getLayoutParams();
        if (layoutParams.height != iL) {
            layoutParams.height = iL;
        }
        this.tv_subscribed_empty_tips.setOnClickListener(new k());
        this.tv_edit.setOnClickListener(new l());
    }
}
