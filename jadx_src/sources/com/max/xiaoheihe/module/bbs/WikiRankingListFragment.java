package com.max.xiaoheihe.module.bbs;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.material.timepicker.TimeModel;
import com.max.hbcustomview.GradientTextView;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.WikiListObj;
import com.max.xiaoheihe.bean.bbs.WikiRankingObj;
import com.max.xiaoheihe.bean.bbs.WikiRankingResultObj;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public class WikiRankingListFragment extends com.max.hbcommon.base.d implements com.max.xiaoheihe.view.callback.a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.max.hbcommon.base.adapter.s<WikiRankingObj> f80224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.max.hbcommon.base.adapter.t f80225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<WikiRankingObj> f80226d = new ArrayList();

    @BindView(R.id.rv)
    RecyclerView mRecyclerView;

    @BindView(R.id.srl)
    SmartRefreshLayout mRefreshLayout;

    @BindView(R.id.v_scroll_container_divier)
    View v_scroll_container_divier;

    public class a extends com.max.hbcommon.base.adapter.s<WikiRankingObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.WikiRankingListFragment$a$a, reason: collision with other inner class name */
        public class ViewOnClickListenerC0673a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ WikiListObj f80228b;

            ViewOnClickListenerC0673a(WikiListObj wikiListObj) {
                this.f80228b = wikiListObj;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27139, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                if (!com.max.hbcommon.utils.c.u(this.f80228b.getAppid()) && !this.f80228b.getAppid().contains(Constants.ACCEPT_TIME_SEPARATOR_SERVER)) {
                    ((com.max.hbcommon.base.d) WikiRankingListFragment.this).mContext.startActivity(ChannelsDetailActivity.l3(((com.max.hbcommon.base.d) WikiRankingListFragment.this).mContext, null, null, this.f80228b.getAppid(), this.f80228b.getGame_type(), null, null, null, null, "wiki"));
                } else {
                    if (com.max.hbcommon.utils.c.u(this.f80228b.getUrl())) {
                        return;
                    }
                    com.max.xiaoheihe.base.router.b.k0(((com.max.hbcommon.base.d) WikiRankingListFragment.this).mContext, this.f80228b.getUrl());
                }
            }
        }

        a(Context context, List list, int i10) {
            super(context, list, i10);
        }

        public void m(com.max.hbcommon.base.adapter.s.e eVar, WikiRankingObj wikiRankingObj) {
            Integer article_inc;
            Integer hot_inc;
            if (PatchProxy.proxy(new Object[]{eVar, wikiRankingObj}, this, changeQuickRedirect, false, 27137, new Class[]{com.max.hbcommon.base.adapter.s.e.class, WikiRankingObj.class}, Void.TYPE).isSupported) {
                return;
            }
            ImageView imageView = (ImageView) eVar.i(R.id.iv_icon);
            TextView textView = (TextView) eVar.i(R.id.tv_name);
            GradientTextView gradientTextView = (GradientTextView) eVar.i(R.id.tv_rank);
            ImageView imageView2 = (ImageView) eVar.i(R.id.iv_trend);
            TextView textView2 = (TextView) eVar.i(R.id.tv_trend);
            ViewGroup viewGroup = (ViewGroup) eVar.i(R.id.vg_trend);
            TextView textView3 = (TextView) eVar.i(R.id.tv_v_1);
            TextView textView4 = (TextView) eVar.i(R.id.tv_k_1);
            TextView textView5 = (TextView) eVar.i(R.id.tv_v_2);
            TextView textView6 = (TextView) eVar.i(R.id.tv_k_2);
            com.max.hbimage.b.d0(wikiRankingObj.getWiki().getAppicon(), imageView, ViewUtils.f(((com.max.hbcommon.base.d) WikiRankingListFragment.this).mContext, 4.0f));
            textView.setText(wikiRankingObj.getWiki().getName());
            int adapterPosition = (eVar.getAdapterPosition() - WikiRankingListFragment.this.f80225c.u()) + 1;
            Pair<Integer, Integer> pairO = com.max.xiaoheihe.module.account.utils.l.o(adapterPosition);
            gradientTextView.setColors(((Integer) pairO.first).intValue(), ((Integer) pairO.second).intValue(), GradientDrawable.Orientation.BL_TR);
            bb.d.d(gradientTextView, 2);
            gradientTextView.setText(String.format(Locale.US, TimeModel.f55754j, Integer.valueOf(adapterPosition)));
            Integer rank_inc = null;
            if (wikiRankingObj.getTrends() != null) {
                rank_inc = wikiRankingObj.getTrends().getRank_inc();
                article_inc = wikiRankingObj.getTrends().getArticle_inc();
                hot_inc = wikiRankingObj.getTrends().getHot_inc();
            } else {
                article_inc = null;
                hot_inc = null;
            }
            if (rank_inc == null || rank_inc.intValue() == 0) {
                viewGroup.setVisibility(8);
            } else {
                viewGroup.setVisibility(0);
                if (rank_inc.intValue() > 0) {
                    textView2.setText(String.valueOf(rank_inc));
                    imageView2.setImageResource(R.drawable.ic_trend_up);
                    textView2.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.lowest_discount_color));
                } else {
                    textView2.setText(String.valueOf(Math.abs(rank_inc.intValue())));
                    imageView2.setImageResource(R.drawable.ic_trend_down);
                    textView2.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.red));
                }
            }
            eVar.i(R.id.tv_wiki).setVisibility(8);
            eVar.i(R.id.tv_data).setVisibility(8);
            if (wikiRankingObj.getTrends() != null) {
                textView5.setText(wikiRankingObj.getTrends().getArticle_num());
                if (article_inc == null || article_inc.intValue() == 0) {
                    textView6.setVisibility(8);
                } else {
                    textView6.setVisibility(0);
                    if (article_inc.intValue() < 0) {
                        textView6.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.red));
                        textView6.setText("" + article_inc);
                    } else {
                        textView6.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.lowest_discount_color));
                        textView6.setText("+" + article_inc);
                    }
                }
            } else {
                textView5.setText("");
                textView6.setText("");
            }
            if (wikiRankingObj.getTrends() != null) {
                textView3.setText(wikiRankingObj.getTrends().getHot_value());
                if (hot_inc == null || hot_inc.intValue() == 0) {
                    textView4.setVisibility(8);
                } else {
                    textView4.setVisibility(0);
                    if (hot_inc.intValue() < 0) {
                        textView4.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.red));
                        textView4.setText("" + hot_inc);
                    } else {
                        textView4.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.lowest_discount_color));
                        textView4.setText("+" + hot_inc);
                    }
                }
            } else {
                textView3.setText("");
                textView4.setText("");
            }
            eVar.itemView.setOnClickListener(new ViewOnClickListenerC0673a(wikiRankingObj.getWiki()));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, WikiRankingObj wikiRankingObj) {
            if (PatchProxy.proxy(new Object[]{eVar, wikiRankingObj}, this, changeQuickRedirect, false, 27138, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, wikiRankingObj);
        }
    }

    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27140, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Intent intent = new Intent(((com.max.hbcommon.base.d) WikiRankingListFragment.this).mContext, (Class<?>) WebActionActivity.class);
            intent.putExtra("pageurl", lb.a.f130933a3);
            intent.putExtra("title", "榜单规则");
            ((com.max.hbcommon.base.d) WikiRankingListFragment.this).mContext.startActivity(intent);
        }
    }

    public class c implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // pg.d
        public void k(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 27141, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            WikiRankingListFragment.S3(WikiRankingListFragment.this);
        }
    }

    public class d extends com.max.hbcommon.network.d<Result<WikiRankingResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27142, new Class[0], Void.TYPE).isSupported && WikiRankingListFragment.this.isActive()) {
                super.onComplete();
                WikiRankingListFragment.this.mRefreshLayout.A(0);
                WikiRankingListFragment.this.mRefreshLayout.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 27143, new Class[]{Throwable.class}, Void.TYPE).isSupported && WikiRankingListFragment.this.isActive()) {
                super.onError(th2);
                WikiRankingListFragment.T3(WikiRankingListFragment.this);
                WikiRankingListFragment.this.mRefreshLayout.A(0);
                WikiRankingListFragment.this.mRefreshLayout.p(0);
            }
        }

        public void onNext(Result<WikiRankingResultObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 27144, new Class[]{Result.class}, Void.TYPE).isSupported && WikiRankingListFragment.this.isActive()) {
                super.onNext(result);
                WikiRankingListFragment.U3(WikiRankingListFragment.this, result.getResult().getWikis());
                com.max.hbcache.c.C("wiki_rank_list_refresh_time", System.currentTimeMillis() + "");
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 27145, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<WikiRankingResultObj>) obj);
        }
    }

    static /* synthetic */ void S3(WikiRankingListFragment wikiRankingListFragment) {
        if (PatchProxy.proxy(new Object[]{wikiRankingListFragment}, null, changeQuickRedirect, true, 27134, new Class[]{WikiRankingListFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        wikiRankingListFragment.V3();
    }

    static /* synthetic */ void T3(WikiRankingListFragment wikiRankingListFragment) {
        if (PatchProxy.proxy(new Object[]{wikiRankingListFragment}, null, changeQuickRedirect, true, 27135, new Class[]{WikiRankingListFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        wikiRankingListFragment.showError();
    }

    static /* synthetic */ void U3(WikiRankingListFragment wikiRankingListFragment, List list) {
        if (PatchProxy.proxy(new Object[]{wikiRankingListFragment, list}, null, changeQuickRedirect, true, 27136, new Class[]{WikiRankingListFragment.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        wikiRankingListFragment.W3(list);
    }

    private void V3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27130, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Lb().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d()));
    }

    private void W3(List<WikiRankingObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 27131, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        if (list != null) {
            this.f80226d.clear();
            this.f80226d.addAll(list);
            this.f80225c.notifyDataSetChanged();
        }
        if (com.max.hbcommon.utils.c.w(this.f80226d)) {
            showEmpty();
        }
    }

    @Override // com.max.xiaoheihe.view.callback.a
    public void D3() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27133, new Class[0], Void.TYPE).isSupported && isActive()) {
            this.mRecyclerView.scrollToPosition(0);
            this.mRefreshLayout.F();
        }
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27127, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.fragment_news_list);
        this.mUnBinder = ButterKnife.f(this, view);
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this.mContext));
        this.mRecyclerView.setBackgroundResource(R.color.background_layer_2_color);
        a aVar = new a(this.mContext, this.f80226d, R.layout.item_channel_ranking);
        this.f80224b = aVar;
        this.f80225c = new com.max.hbcommon.base.adapter.t(aVar);
        View viewInflate = this.mInflater.inflate(R.layout.layout_channel_ranking_header, (ViewGroup) this.mRecyclerView, false);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_header_1);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_header_2);
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.tv_header_3);
        textView.setText("每24小时更新");
        textView2.setText("热度");
        textView3.setText("词条数");
        this.f80225c.p(R.layout.layout_channel_ranking_header, viewInflate);
        View viewInflate2 = this.mInflater.inflate(R.layout.layout_channel_ranking_footer, (ViewGroup) this.mRecyclerView, false);
        viewInflate2.setOnClickListener(new b());
        this.f80225c.m(R.layout.layout_channel_ranking_footer, viewInflate2);
        this.mRecyclerView.setAdapter(this.f80225c);
        ViewUtils.b(this.mRecyclerView, this.v_scroll_container_divier);
        this.mRefreshLayout.b0(false);
        this.mRefreshLayout.S(new c());
        if (this.mIsFirst) {
            showLoading();
        }
    }

    @Override // com.max.hbcommon.base.d
    public void onFragmentShow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27128, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onFragmentShow();
        String strO = com.max.hbcache.c.o("wiki_rank_list_refresh_time", "");
        long j10 = !TextUtils.isEmpty(strO) ? Long.parseLong(strO) : 0L;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.mIsFirst || jCurrentTimeMillis - j10 < 7200000) {
            return;
        }
        D3();
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27132, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        V3();
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onStart() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27129, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStart();
        showLoading();
        V3();
    }
}
