package com.max.xiaoheihe.module.bbs;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbcustomview.GradientTextView;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkListResultObj;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class LinkRankingFragment extends com.max.hbcommon.base.d implements com.max.xiaoheihe.view.callback.a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.max.hbcommon.base.adapter.s<BBSLinkObj> f80017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<BBSLinkObj> f80018c = new ArrayList();

    @BindView(R.id.rv)
    RecyclerView mRecyclerView;

    @BindView(R.id.srl)
    SmartRefreshLayout mRefreshLayout;

    public class a extends com.max.hbcommon.base.adapter.s<BBSLinkObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.LinkRankingFragment$a$a, reason: collision with other inner class name */
        public class ViewOnClickListenerC0671a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ BBSLinkObj f80020b;

            ViewOnClickListenerC0671a(BBSLinkObj bBSLinkObj) {
                this.f80020b = bBSLinkObj;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26735, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.xiaoheihe.module.bbs.utils.b.E(((com.max.hbcommon.base.d) LinkRankingFragment.this).mContext, this.f80020b);
            }
        }

        a(Context context, List list, int i10) {
            super(context, list, i10);
        }

        public void m(com.max.hbcommon.base.adapter.s.e eVar, BBSLinkObj bBSLinkObj) {
            if (PatchProxy.proxy(new Object[]{eVar, bBSLinkObj}, this, changeQuickRedirect, false, 26733, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSLinkObj.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!com.max.hbcommon.utils.c.w(bBSLinkObj.getThumbs())) {
                com.max.hbimage.b.d0(bBSLinkObj.getThumbs().get(0), (ImageView) eVar.i(R.id.iv_img), ViewUtils.f(((com.max.hbcommon.base.d) LinkRankingFragment.this).mContext, 2.0f));
            }
            eVar.p(R.id.tv_comment, bBSLinkObj.getComment_num());
            TextView textView = (TextView) eVar.i(R.id.tv_title);
            TextView textView2 = (TextView) eVar.i(R.id.tv_desc);
            textView.setText(bBSLinkObj.getTitle());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) ((ViewGroup) eVar.i(R.id.vg_tags)).getLayoutParams();
            if (textView.getLineCount() > 1) {
                layoutParams.setMargins(0, ViewUtils.f(((com.max.hbcommon.base.d) LinkRankingFragment.this).mContext, 2.0f), 0, 0);
            } else {
                layoutParams.setMargins(0, ViewUtils.f(((com.max.hbcommon.base.d) LinkRankingFragment.this).mContext, 6.0f), 0, 0);
            }
            GradientTextView gradientTextView = (GradientTextView) eVar.i(R.id.tv_rank);
            com.max.xiaoheihe.module.account.utils.l.o(eVar.getAdapterPosition() + 1);
            Pair<Integer, Integer> pairO = com.max.xiaoheihe.module.account.utils.l.o(eVar.getAdapterPosition() + 1);
            gradientTextView.setColors(((Integer) pairO.first).intValue(), ((Integer) pairO.second).intValue(), GradientDrawable.Orientation.BL_TR);
            gradientTextView.setText((eVar.getAdapterPosition() + 1) + "");
            if (com.max.hbcommon.utils.c.w(bBSLinkObj.getTopics())) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(bBSLinkObj.getTopic().getName());
                textView2.setVisibility(0);
            }
            eVar.itemView.setOnClickListener(new ViewOnClickListenerC0671a(bBSLinkObj));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, BBSLinkObj bBSLinkObj) {
            if (PatchProxy.proxy(new Object[]{eVar, bBSLinkObj}, this, changeQuickRedirect, false, 26734, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, bBSLinkObj);
        }
    }

    public class b implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // pg.d
        public void k(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 26736, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            LinkRankingFragment.P3(LinkRankingFragment.this);
        }
    }

    public class c extends com.max.hbcommon.network.d<Result<BBSLinkListResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26737, new Class[0], Void.TYPE).isSupported && LinkRankingFragment.this.isActive()) {
                super.onComplete();
                LinkRankingFragment.this.mRefreshLayout.A(0);
                LinkRankingFragment.this.mRefreshLayout.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 26738, new Class[]{Throwable.class}, Void.TYPE).isSupported && LinkRankingFragment.this.isActive()) {
                super.onError(th2);
                LinkRankingFragment.Q3(LinkRankingFragment.this);
                LinkRankingFragment.this.mRefreshLayout.A(0);
                LinkRankingFragment.this.mRefreshLayout.p(0);
            }
        }

        public void onNext(Result<BBSLinkListResultObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 26739, new Class[]{Result.class}, Void.TYPE).isSupported && LinkRankingFragment.this.isActive()) {
                super.onNext(result);
                LinkRankingFragment.R3(LinkRankingFragment.this, result.getResult().getLinks());
                com.max.hbcache.c.C("link_rank_list_refresh_time", System.currentTimeMillis() + "");
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 26740, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<BBSLinkListResultObj>) obj);
        }
    }

    static /* synthetic */ void P3(LinkRankingFragment linkRankingFragment) {
        if (PatchProxy.proxy(new Object[]{linkRankingFragment}, null, changeQuickRedirect, true, 26730, new Class[]{LinkRankingFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        linkRankingFragment.S3();
    }

    static /* synthetic */ void Q3(LinkRankingFragment linkRankingFragment) {
        if (PatchProxy.proxy(new Object[]{linkRankingFragment}, null, changeQuickRedirect, true, 26731, new Class[]{LinkRankingFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        linkRankingFragment.showError();
    }

    static /* synthetic */ void R3(LinkRankingFragment linkRankingFragment, List list) {
        if (PatchProxy.proxy(new Object[]{linkRankingFragment, list}, null, changeQuickRedirect, true, 26732, new Class[]{LinkRankingFragment.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        linkRankingFragment.T3(list);
    }

    private void S3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26726, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().b8().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
    }

    private void T3(List<BBSLinkObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 26727, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        if (list != null) {
            this.f80018c.clear();
            this.f80018c.addAll(list);
            this.f80017b.notifyDataSetChanged();
        }
        if (com.max.hbcommon.utils.c.w(this.f80018c)) {
            showEmpty();
        }
    }

    @Override // com.max.xiaoheihe.view.callback.a
    public void D3() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26729, new Class[0], Void.TYPE).isSupported && isActive()) {
            this.mRecyclerView.scrollToPosition(0);
            this.mRefreshLayout.F();
        }
    }

    @Override // com.max.hbcommon.base.d
    public void initData() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26725, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        S3();
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26723, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_refresh_rv);
        this.mUnBinder = ButterKnife.f(this, view);
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this.mContext));
        a aVar = new a(this.mContext, this.f80018c, R.layout.item_hot_links);
        this.f80017b = aVar;
        this.mRecyclerView.setAdapter(aVar);
        this.mRefreshLayout.b0(false);
        this.mRefreshLayout.S(new b());
        if (this.mIsFirst) {
            showLoading();
        }
    }

    @Override // com.max.hbcommon.base.d
    public void onFragmentShow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26724, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onFragmentShow();
        String strO = com.max.hbcache.c.o("link_rank_list_refresh_time", "");
        long j10 = !TextUtils.isEmpty(strO) ? Long.parseLong(strO) : 0L;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.mIsFirst || jCurrentTimeMillis - j10 < 7200000) {
            return;
        }
        D3();
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26728, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        S3();
    }
}
