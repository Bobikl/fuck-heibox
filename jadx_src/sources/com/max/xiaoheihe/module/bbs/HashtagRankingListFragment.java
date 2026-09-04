package com.max.xiaoheihe.module.bbs;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
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
import com.max.xiaoheihe.bean.bbs.HashtagObj;
import com.max.xiaoheihe.bean.bbs.HashtagRankingResultObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public class HashtagRankingListFragment extends com.max.hbcommon.base.d implements com.max.xiaoheihe.view.callback.a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.max.hbcommon.base.adapter.s<HashtagObj> f79915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.max.hbcommon.base.adapter.t f79916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<HashtagObj> f79917d = new ArrayList();

    @BindView(R.id.rv)
    RecyclerView mRecyclerView;

    @BindView(R.id.srl)
    SmartRefreshLayout mRefreshLayout;

    @BindView(R.id.v_scroll_container_divier)
    View v_scroll_container_divier;

    public class a extends com.max.hbcommon.base.adapter.s<HashtagObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.HashtagRankingListFragment$a$a, reason: collision with other inner class name */
        public class ViewOnClickListenerC0669a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ HashtagObj f79919b;

            ViewOnClickListenerC0669a(HashtagObj hashtagObj) {
                this.f79919b = hashtagObj;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26557, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                ((com.max.hbcommon.base.d) HashtagRankingListFragment.this).mContext.startActivity(HashtagDetailActivity.x2(((com.max.hbcommon.base.d) HashtagRankingListFragment.this).mContext, this.f79919b.getName()));
            }
        }

        a(Context context, List list, int i10) {
            super(context, list, i10);
        }

        public void m(com.max.hbcommon.base.adapter.s.e eVar, HashtagObj hashtagObj) {
            if (PatchProxy.proxy(new Object[]{eVar, hashtagObj}, this, changeQuickRedirect, false, 26555, new Class[]{com.max.hbcommon.base.adapter.s.e.class, HashtagObj.class}, Void.TYPE).isSupported) {
                return;
            }
            TextView textView = (TextView) eVar.i(R.id.tv_name);
            GradientTextView gradientTextView = (GradientTextView) eVar.i(R.id.tv_rank);
            ImageView imageView = (ImageView) eVar.i(R.id.iv_trend);
            TextView textView2 = (TextView) eVar.i(R.id.tv_trend);
            ViewGroup viewGroup = (ViewGroup) eVar.i(R.id.vg_trend);
            TextView textView3 = (TextView) eVar.i(R.id.tv_v_1);
            TextView textView4 = (TextView) eVar.i(R.id.tv_v_2);
            textView.setText("#" + hashtagObj.getName() + "#");
            int adapterPosition = (eVar.getAdapterPosition() - HashtagRankingListFragment.this.f79916c.u()) + 1;
            Pair<Integer, Integer> pairO = com.max.xiaoheihe.module.account.utils.l.o(adapterPosition);
            gradientTextView.setColors(((Integer) pairO.first).intValue(), ((Integer) pairO.second).intValue(), GradientDrawable.Orientation.BL_TR);
            bb.d.d(gradientTextView, 2);
            gradientTextView.setText(String.format(Locale.US, TimeModel.f55754j, Integer.valueOf(adapterPosition)));
            Integer numValueOf = hashtagObj.getRank_trend() != null ? Integer.valueOf(com.max.hbutils.utils.n.q(hashtagObj.getRank_trend())) : null;
            if (numValueOf == null || numValueOf.intValue() == 0) {
                viewGroup.setVisibility(8);
            } else {
                viewGroup.setVisibility(0);
                if (numValueOf.intValue() > 0) {
                    textView2.setText(String.valueOf(numValueOf));
                    imageView.setImageResource(R.drawable.ic_trend_up);
                    textView2.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.lowest_discount_color));
                } else {
                    textView2.setText(String.valueOf(Math.abs(numValueOf.intValue())));
                    imageView.setImageResource(R.drawable.ic_trend_down);
                    textView2.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.red));
                }
            }
            textView3.setText(hashtagObj.getHot_value());
            textView4.setText(hashtagObj.getNum().getContent_num());
            eVar.itemView.setOnClickListener(new ViewOnClickListenerC0669a(hashtagObj));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, HashtagObj hashtagObj) {
            if (PatchProxy.proxy(new Object[]{eVar, hashtagObj}, this, changeQuickRedirect, false, 26556, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, hashtagObj);
        }
    }

    public class b implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // pg.d
        public void k(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 26558, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            HashtagRankingListFragment.O3(HashtagRankingListFragment.this);
        }
    }

    public class c extends com.max.hbcommon.network.d<Result<HashtagRankingResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26559, new Class[0], Void.TYPE).isSupported && HashtagRankingListFragment.this.isActive()) {
                super.onComplete();
                HashtagRankingListFragment.this.mRefreshLayout.A(0);
                HashtagRankingListFragment.this.mRefreshLayout.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 26560, new Class[]{Throwable.class}, Void.TYPE).isSupported && HashtagRankingListFragment.this.isActive()) {
                super.onError(th2);
                HashtagRankingListFragment.P3(HashtagRankingListFragment.this);
                HashtagRankingListFragment.this.mRefreshLayout.A(0);
                HashtagRankingListFragment.this.mRefreshLayout.p(0);
            }
        }

        public void onNext(Result<HashtagRankingResultObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 26561, new Class[]{Result.class}, Void.TYPE).isSupported && HashtagRankingListFragment.this.isActive()) {
                super.onNext(result);
                HashtagRankingListFragment.Q3(HashtagRankingListFragment.this, result.getResult().getHashtags());
                com.max.hbcache.c.C("hashtag_rank_list_refresh_time", System.currentTimeMillis() + "");
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 26562, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<HashtagRankingResultObj>) obj);
        }
    }

    static /* synthetic */ void O3(HashtagRankingListFragment hashtagRankingListFragment) {
        if (PatchProxy.proxy(new Object[]{hashtagRankingListFragment}, null, changeQuickRedirect, true, 26552, new Class[]{HashtagRankingListFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        hashtagRankingListFragment.R3();
    }

    static /* synthetic */ void P3(HashtagRankingListFragment hashtagRankingListFragment) {
        if (PatchProxy.proxy(new Object[]{hashtagRankingListFragment}, null, changeQuickRedirect, true, 26553, new Class[]{HashtagRankingListFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        hashtagRankingListFragment.showError();
    }

    static /* synthetic */ void Q3(HashtagRankingListFragment hashtagRankingListFragment, List list) {
        if (PatchProxy.proxy(new Object[]{hashtagRankingListFragment, list}, null, changeQuickRedirect, true, 26554, new Class[]{HashtagRankingListFragment.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        hashtagRankingListFragment.S3(list);
    }

    private void R3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26547, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().J1().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
    }

    private void S3(List<HashtagObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 26548, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        if (list != null) {
            this.f79917d.clear();
            this.f79917d.addAll(list);
            this.f79916c.notifyDataSetChanged();
        }
        if (com.max.hbcommon.utils.c.w(this.f79917d)) {
            showEmpty();
        }
    }

    @Override // com.max.xiaoheihe.view.callback.a
    public void D3() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26550, new Class[0], Void.TYPE).isSupported && isActive()) {
            this.mRecyclerView.scrollToPosition(0);
            this.mRefreshLayout.F();
        }
    }

    @Override // com.max.hbcommon.base.d
    public void initData() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26546, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        R3();
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26544, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.fragment_news_list);
        this.mUnBinder = ButterKnife.f(this, view);
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this.mContext));
        this.mRecyclerView.setBackgroundResource(R.color.background_layer_2_color);
        a aVar = new a(this.mContext, this.f79917d, R.layout.item_hashtag_ranking);
        this.f79915b = aVar;
        this.f79916c = new com.max.hbcommon.base.adapter.t(aVar);
        View viewInflate = this.mInflater.inflate(R.layout.layout_channel_ranking_header, (ViewGroup) this.mRecyclerView, false);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_header_1);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_header_2);
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.tv_header_3);
        textView.setText("每小时更新");
        textView2.setText("热度");
        textView3.setText("讨论");
        this.f79916c.p(R.layout.layout_channel_ranking_header, viewInflate);
        this.mRecyclerView.setAdapter(this.f79916c);
        ViewUtils.b(this.mRecyclerView, this.v_scroll_container_divier);
        this.mRefreshLayout.b0(false);
        this.mRefreshLayout.S(new b());
        if (this.mIsFirst) {
            showLoading();
        }
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onActivityCreated(@androidx.annotation.p0 Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 26551, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityCreated(bundle);
        D3();
    }

    @Override // com.max.hbcommon.base.d
    public void onFragmentShow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26545, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onFragmentShow();
        String strO = com.max.hbcache.c.o("hashtag_rank_list_refresh_time", "");
        long j10 = !TextUtils.isEmpty(strO) ? Long.parseLong(strO) : 0L;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.mIsFirst || jCurrentTimeMillis - j10 < 3600000) {
            return;
        }
        D3();
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26549, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        R3();
    }
}
