package com.max.xiaoheihe.module.bbs;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.appbar.AppBarLayout;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.MainActivity;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkListHeaderObj;
import com.max.xiaoheihe.bean.bbs.BBSTopicBannerResult;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.max.xiaoheihe.module.bbs.concept.ConceptLinksFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import df.yb;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: WaterfallLinksFragment.java */
/* JADX INFO: loaded from: classes10.dex */
@com.max.hbcommon.analytics.m(path = "/bbs/waterfall")
public class r0 extends com.max.hbcommon.base.d implements com.max.xiaoheihe.view.callback.a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private yb f83207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.max.xiaoheihe.module.news.adapter.c f83208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<BBSTopicObj> f83209d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ConceptLinksFragment f83210e;

    /* JADX INFO: compiled from: WaterfallLinksFragment.java */
    public class a implements AppBarLayout.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.f, com.google.android.material.appbar.AppBarLayout.b
        public void a(AppBarLayout appBarLayout, int i10) {
            if (PatchProxy.proxy(new Object[]{appBarLayout, new Integer(i10)}, this, changeQuickRedirect, false, 27124, new Class[]{AppBarLayout.class, Integer.TYPE}, Void.TYPE).isSupported || r0.this.f83210e == null || !r0.this.f83210e.isActive()) {
                return;
            }
            r0.this.f83210e.b4(-(r0.this.f83207b.f117887b.getMeasuredHeight() + i10));
        }
    }

    /* JADX INFO: compiled from: WaterfallLinksFragment.java */
    public class b extends com.max.hbcommon.network.d<Result<BBSTopicBannerResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        public void onNext(Result<BBSTopicBannerResult> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 27125, new Class[]{Result.class}, Void.TYPE).isSupported && r0.this.isActive()) {
                super.onNext(result);
                r0.N3(r0.this, result);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 27126, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<BBSTopicBannerResult>) obj);
        }
    }

    static /* synthetic */ void N3(r0 r0Var, Result result) {
        if (PatchProxy.proxy(new Object[]{r0Var, result}, null, changeQuickRedirect, true, 27123, new Class[]{r0.class, Result.class}, Void.TYPE).isSupported) {
            return;
        }
        r0Var.P3(result);
    }

    private void O3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27119, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().u4().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    private void P3(Result<BBSTopicBannerResult> result) {
        if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 27120, new Class[]{Result.class}, Void.TYPE).isSupported) {
            return;
        }
        if (result != null) {
            this.f83209d.clear();
            BBSLinkListHeaderObj topic_banner = result.getResult().getTopic_banner();
            if (topic_banner == null || (com.max.hbcommon.utils.c.w(topic_banner.getTopics()) && com.max.hbcommon.utils.c.w(topic_banner.getSubscribed_topics()))) {
                this.f83207b.f117889d.setVisibility(8);
            } else {
                if (!com.max.hbcommon.utils.c.w(topic_banner.getTop_topics())) {
                    this.f83209d.addAll(topic_banner.getTop_topics());
                }
                if (!com.max.hbcommon.utils.c.w(topic_banner.getSubscribed_topics())) {
                    this.f83209d.addAll(topic_banner.getSubscribed_topics());
                }
                if (!com.max.hbcommon.utils.c.w(topic_banner.getTopics())) {
                    this.f83209d.addAll(topic_banner.getTopics());
                }
                this.f83208c.notifyDataSetChanged();
                this.f83207b.f117889d.setVisibility(0);
            }
        } else {
            this.f83207b.f117889d.setVisibility(8);
        }
        showContentView();
    }

    @Override // com.max.xiaoheihe.view.callback.a
    public void D3() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27122, new Class[0], Void.TYPE).isSupported && isActive()) {
            Q3();
            ConceptLinksFragment conceptLinksFragment = this.f83210e;
            if (conceptLinksFragment != null) {
                conceptLinksFragment.D3();
            }
        }
    }

    public void Q3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27121, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        CoordinatorLayout.Behavior behaviorF = ((CoordinatorLayout.f) this.f83207b.f117887b.getLayoutParams()).f();
        if (behaviorF instanceof AppBarLayout.Behavior) {
            AppBarLayout.Behavior behavior = (AppBarLayout.Behavior) behaviorF;
            if (behavior.K() != 0) {
                behavior.Q(0);
                this.f83207b.f117887b.setExpanded(true, true);
            }
        }
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27118, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        yb ybVarC = yb.c(this.mInflater);
        this.f83207b = ybVarC;
        setContentView(ybVarC);
        this.f83207b.f117889d.setLayoutManager(new LinearLayoutManager(this.mContext, 0, false));
        this.f83207b.f117889d.setClipToPadding(false);
        this.f83207b.f117889d.setClipChildren(false);
        com.max.xiaoheihe.module.news.adapter.c cVar = new com.max.xiaoheihe.module.news.adapter.c(this.mContext, this.f83209d, null);
        this.f83208c = cVar;
        this.f83207b.f117889d.setAdapter(cVar);
        if (this.mIsFirst) {
            showLoading();
        }
        ConceptLinksFragment conceptLinksFragment = (ConceptLinksFragment) getParentFragmentManager().r0(R.id.fragment_container);
        this.f83210e = conceptLinksFragment;
        if (conceptLinksFragment == null) {
            this.f83210e = ConceptLinksFragment.d4(null, null);
            getParentFragmentManager().u().b(R.id.fragment_container, this.f83210e).m();
        }
        this.f83207b.f117887b.e(new a());
        this.f83210e.j4(true ^ MainActivity.E4);
        O3();
    }
}
