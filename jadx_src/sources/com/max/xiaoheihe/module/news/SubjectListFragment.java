package com.max.xiaoheihe.module.news;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbcommon.base.adapter.s;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.w;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.news.NewsSubjectObj;
import com.max.xiaoheihe.bean.news.SubjectListResult;
import com.max.xiaoheihe.network.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.util.ArrayList;
import java.util.List;
import ng.j;

/* JADX INFO: loaded from: classes12.dex */
public class SubjectListFragment extends com.max.hbcommon.base.d {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f91259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    s<NewsSubjectObj> f91260d;

    @BindView(R.id.rv)
    RecyclerView mRecyclerView;

    @BindView(R.id.srl)
    SmartRefreshLayout mRefreshLayout;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f91258b = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    List<NewsSubjectObj> f91261e = new ArrayList();

    public class a extends RecyclerView.ItemDecoration {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{rect, view, recyclerView, state}, this, changeQuickRedirect, false, 42546, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (childAdapterPosition % 2 == 0) {
                int i10 = SubjectListFragment.this.f91259c;
                rect.set(i10, childAdapterPosition == 0 ? i10 : 0, i10, i10);
            } else {
                int i11 = childAdapterPosition == 1 ? SubjectListFragment.this.f91259c : 0;
                int i12 = SubjectListFragment.this.f91259c;
                rect.set(0, i11, i12, i12);
            }
        }
    }

    public class b extends s<NewsSubjectObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ NewsSubjectObj f91264b;

            a(NewsSubjectObj newsSubjectObj) {
                this.f91264b = newsSubjectObj;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42549, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                ((com.max.hbcommon.base.d) SubjectListFragment.this).mContext.startActivity(SubjectDetailActivity.a2(((com.max.hbcommon.base.d) SubjectListFragment.this).mContext, this.f91264b));
            }
        }

        b(Context context, List list, int i10) {
            super(context, list, i10);
        }

        public void m(s.e eVar, NewsSubjectObj newsSubjectObj) {
            if (PatchProxy.proxy(new Object[]{eVar, newsSubjectObj}, this, changeQuickRedirect, false, 42547, new Class[]{s.e.class, NewsSubjectObj.class}, Void.TYPE).isSupported) {
                return;
            }
            ImageView imageView = (ImageView) eVar.i(R.id.iv_img);
            ((RelativeLayout.LayoutParams) imageView.getLayoutParams()).height = (((ViewUtils.L(((com.max.hbcommon.base.d) SubjectListFragment.this).mContext) - (SubjectListFragment.this.f91259c * 3)) / 2) * 78) / 165;
            com.max.hbimage.b.K(newsSubjectObj.getOuter_img(), imageView);
            eVar.p(R.id.tv_name, newsSubjectObj.getOuter_title());
            eVar.p(R.id.tv_num, newsSubjectObj.getNews_num() + "篇新闻");
            eVar.p(R.id.tv_time, w.v(((com.max.hbcommon.base.d) SubjectListFragment.this).mContext, newsSubjectObj.getTimestamp()));
            eVar.itemView.setOnClickListener(new a(newsSubjectObj));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, NewsSubjectObj newsSubjectObj) {
            if (PatchProxy.proxy(new Object[]{eVar, newsSubjectObj}, this, changeQuickRedirect, false, 42548, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, newsSubjectObj);
        }
    }

    public class c implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // pg.d
        public void k(j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 42550, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            SubjectListFragment.this.f91258b = 0;
            SubjectListFragment.R3(SubjectListFragment.this);
        }
    }

    public class d implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // pg.b
        public void f(j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 42551, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            SubjectListFragment.Q3(SubjectListFragment.this, 30);
            SubjectListFragment.R3(SubjectListFragment.this);
        }
    }

    public class e extends com.max.hbcommon.network.d<Result<SubjectListResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42552, new Class[0], Void.TYPE).isSupported && SubjectListFragment.this.isActive()) {
                SubjectListFragment.this.mRefreshLayout.A(0);
                SubjectListFragment.this.mRefreshLayout.p(0);
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 42553, new Class[]{Throwable.class}, Void.TYPE).isSupported && SubjectListFragment.this.isActive()) {
                SubjectListFragment.this.mRefreshLayout.A(0);
                SubjectListFragment.this.mRefreshLayout.p(0);
                super.onError(th2);
                th2.printStackTrace();
                SubjectListFragment.S3(SubjectListFragment.this);
            }
        }

        public void onNext(Result<SubjectListResult> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 42554, new Class[]{Result.class}, Void.TYPE).isSupported && SubjectListFragment.this.isActive()) {
                SubjectListFragment.T3(SubjectListFragment.this, result.getResult().getTopics());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 42555, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<SubjectListResult>) obj);
        }
    }

    static /* synthetic */ int Q3(SubjectListFragment subjectListFragment, int i10) {
        int i11 = subjectListFragment.f91258b + i10;
        subjectListFragment.f91258b = i11;
        return i11;
    }

    static /* synthetic */ void R3(SubjectListFragment subjectListFragment) {
        if (PatchProxy.proxy(new Object[]{subjectListFragment}, null, changeQuickRedirect, true, 42543, new Class[]{SubjectListFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        subjectListFragment.U3();
    }

    static /* synthetic */ void S3(SubjectListFragment subjectListFragment) {
        if (PatchProxy.proxy(new Object[]{subjectListFragment}, null, changeQuickRedirect, true, 42544, new Class[]{SubjectListFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        subjectListFragment.showError();
    }

    static /* synthetic */ void T3(SubjectListFragment subjectListFragment, List list) {
        if (PatchProxy.proxy(new Object[]{subjectListFragment, list}, null, changeQuickRedirect, true, 42545, new Class[]{SubjectListFragment.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        subjectListFragment.W3(list);
    }

    private void U3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42541, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) i.a().Ib(this.f91258b, 30).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e()));
    }

    public static SubjectListFragment V3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 42538, new Class[0], SubjectListFragment.class);
        return patchProxyResultProxy.isSupported ? (SubjectListFragment) patchProxyResultProxy.result : new SubjectListFragment();
    }

    private void W3(List<NewsSubjectObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 42542, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        if (list != null) {
            if (this.f91258b == 0) {
                this.f91261e.clear();
            }
            this.f91261e.addAll(list);
            this.f91260d.notifyDataSetChanged();
        }
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42539, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_refresh_rv);
        this.mUnBinder = ButterKnife.f(this, view);
        this.f91259c = ViewUtils.f(this.mContext, 4.0f);
        this.mRecyclerView.setLayoutManager(new GridLayoutManager(this.mContext, 2));
        this.mRecyclerView.addItemDecoration(new a());
        b bVar = new b(this.mContext, this.f91261e, R.layout.item_news_subject);
        this.f91260d = bVar;
        this.mRecyclerView.setAdapter(bVar);
        this.mRefreshLayout.S(new c());
        this.mRefreshLayout.f0(new d());
        showLoading();
        U3();
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42540, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        U3();
    }
}
