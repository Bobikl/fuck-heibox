package com.max.xiaoheihe.module.news;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.d0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbcommon.base.adapter.t;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.max.xiaoheihe.bean.news.NewsSubjectObj;
import com.max.xiaoheihe.bean.news.SubjectDetailResultOjb;
import com.max.xiaoheihe.network.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.util.ArrayList;
import java.util.List;
import ng.j;

/* JADX INFO: loaded from: classes12.dex */
public class NewsSubjectFragment extends com.max.hbcommon.base.d {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f91211o = "news_subject";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f91212p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f91213q = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f91214r = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f91215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f91216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    t f91217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    com.max.xiaoheihe.module.news.adapter.a f91218e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    List<FeedsContentBaseObj> f91219f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    List<FeedsContentBaseObj> f91220g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    List<FeedsContentBaseObj> f91221h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f91222i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f91223j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f91224k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private NewsSubjectObj f91225l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private View f91226m;

    @BindView(R.id.rv)
    RecyclerView mRecyclerView;

    @BindView(R.id.srl)
    SmartRefreshLayout mRefreshLayout;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f91227n;

    public class a implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // pg.d
        public void k(j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 42481, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            NewsSubjectFragment.L3(NewsSubjectFragment.this, false);
        }
    }

    public class b implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // pg.b
        public void f(j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 42482, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            NewsSubjectFragment.L3(NewsSubjectFragment.this, true);
        }
    }

    public class c extends com.max.xiaoheihe.module.news.adapter.a {
        c(Context context, List list) {
            super(context, list);
        }
    }

    public class d extends RecyclerView.ItemDecoration {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{rect, view, recyclerView, state}, this, changeQuickRedirect, false, 42483, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            if (recyclerView.getChildAdapterPosition(view) == recyclerView.getAdapter().getItemCount()) {
                rect.set(0, 0, 0, NewsSubjectFragment.this.f91215b);
            } else if (recyclerView.getChildAdapterPosition(view) == 0) {
                rect.set(0, 0, 0, NewsSubjectFragment.this.f91215b);
            } else {
                rect.set(0, 0, 0, NewsSubjectFragment.this.f91216c);
            }
        }
    }

    public class e implements RadioGroup.OnCheckedChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, @d0 int i10) {
            if (PatchProxy.proxy(new Object[]{radioGroup, new Integer(i10)}, this, changeQuickRedirect, false, 42484, new Class[]{RadioGroup.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            int childCount = radioGroup.getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 >= childCount) {
                    i11 = 0;
                    break;
                }
                View childAt = radioGroup.getChildAt(i11);
                if ((childAt instanceof RadioButton) && childAt.getId() == i10) {
                    break;
                } else {
                    i11++;
                }
            }
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt2 = radioGroup.getChildAt(i12);
                if (!(childAt2 instanceof RadioButton)) {
                    if (i12 == i11 - 1 || i12 == i11 + 1) {
                        childAt2.setVisibility(4);
                    } else {
                        childAt2.setVisibility(0);
                    }
                }
            }
            if (i10 == R.id.rb_all) {
                NewsSubjectFragment.this.f91227n = 0;
            } else if (i10 == R.id.rb_news) {
                NewsSubjectFragment.this.f91227n = 1;
            } else if (i10 == R.id.rb_videos) {
                NewsSubjectFragment.this.f91227n = 2;
            }
            NewsSubjectFragment.O3(NewsSubjectFragment.this);
        }
    }

    public class f extends com.max.hbcommon.network.d<Result<SubjectDetailResultOjb>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f91233b;

        f(String str) {
            this.f91233b = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42485, new Class[0], Void.TYPE).isSupported && NewsSubjectFragment.this.isActive()) {
                NewsSubjectFragment.this.mRefreshLayout.A(0);
                NewsSubjectFragment.this.mRefreshLayout.p(0);
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 42486, new Class[]{Throwable.class}, Void.TYPE).isSupported && NewsSubjectFragment.this.isActive()) {
                NewsSubjectFragment.this.mRefreshLayout.A(0);
                NewsSubjectFragment.this.mRefreshLayout.p(0);
                super.onError(th2);
                th2.printStackTrace();
                NewsSubjectFragment.P3(NewsSubjectFragment.this);
            }
        }

        public void onNext(Result<SubjectDetailResultOjb> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 42487, new Class[]{Result.class}, Void.TYPE).isSupported && NewsSubjectFragment.this.isActive()) {
                NewsSubjectFragment.Q3(NewsSubjectFragment.this, this.f91233b, result.getResult().getNews_list());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 42488, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<SubjectDetailResultOjb>) obj);
        }
    }

    static /* synthetic */ void L3(NewsSubjectFragment newsSubjectFragment, boolean z10) {
        if (PatchProxy.proxy(new Object[]{newsSubjectFragment, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 42477, new Class[]{NewsSubjectFragment.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        newsSubjectFragment.S3(z10);
    }

    static /* synthetic */ void O3(NewsSubjectFragment newsSubjectFragment) {
        if (PatchProxy.proxy(new Object[]{newsSubjectFragment}, null, changeQuickRedirect, true, 42478, new Class[]{NewsSubjectFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        newsSubjectFragment.V3();
    }

    static /* synthetic */ void P3(NewsSubjectFragment newsSubjectFragment) {
        if (PatchProxy.proxy(new Object[]{newsSubjectFragment}, null, changeQuickRedirect, true, 42479, new Class[]{NewsSubjectFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        newsSubjectFragment.showError();
    }

    static /* synthetic */ void Q3(NewsSubjectFragment newsSubjectFragment, String str, List list) {
        if (PatchProxy.proxy(new Object[]{newsSubjectFragment, str, list}, null, changeQuickRedirect, true, 42480, new Class[]{NewsSubjectFragment.class, String.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        newsSubjectFragment.X3(str, list);
    }

    private void R3(String str, int i10) {
        if (PatchProxy.proxy(new Object[]{str, new Integer(i10)}, this, changeQuickRedirect, false, 42474, new Class[]{String.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) i.a().aa(this.f91225l.getId(), str, i10, 30).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new f(str)));
    }

    private void S3(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 42476, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        int i10 = this.f91227n;
        if (i10 == 0) {
            if (z10) {
                this.f91222i += 30;
            } else {
                this.f91222i = 0;
            }
            R3(null, this.f91222i);
            return;
        }
        if (i10 == 1) {
            if (z10) {
                this.f91223j += 30;
            } else {
                this.f91223j = 0;
            }
            R3("news", this.f91223j);
            return;
        }
        if (i10 != 2) {
            return;
        }
        if (z10) {
            this.f91224k += 30;
        } else {
            this.f91224k = 0;
        }
        R3("video", this.f91224k);
    }

    private void T3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42470, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this.mContext, 1, false));
        this.f91218e = new c(this.mContext, this.f91219f);
        View viewInflate = this.mContext.getLayoutInflater().inflate(R.layout.layout_subject_list_header, (ViewGroup) this.mRecyclerView, false);
        this.f91226m = viewInflate;
        W3(viewInflate);
        t tVar = new t(this.f91218e);
        this.f91217d = tVar;
        tVar.p(R.layout.layout_subject_list_header, this.f91226m);
        this.mRecyclerView.setAdapter(this.f91217d);
        this.mRefreshLayout.a(true);
        this.mRecyclerView.addItemDecoration(new d());
    }

    public static NewsSubjectFragment U3(NewsSubjectObj newsSubjectObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{newsSubjectObj}, null, changeQuickRedirect, true, 42468, new Class[]{NewsSubjectObj.class}, NewsSubjectFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (NewsSubjectFragment) patchProxyResultProxy.result;
        }
        NewsSubjectFragment newsSubjectFragment = new NewsSubjectFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable(f91211o, newsSubjectObj);
        newsSubjectFragment.setArguments(bundle);
        return newsSubjectFragment;
    }

    private void V3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42473, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        int i10 = this.f91227n;
        if (i10 == 0) {
            this.f91218e.setDataList(this.f91219f);
            this.f91217d.notifyDataSetChanged();
            if (this.f91219f.isEmpty()) {
                S3(false);
                return;
            }
            return;
        }
        if (i10 == 1) {
            this.f91218e.setDataList(this.f91220g);
            this.f91217d.notifyDataSetChanged();
            if (this.f91220g.isEmpty()) {
                S3(false);
                return;
            }
            return;
        }
        if (i10 != 2) {
            return;
        }
        this.f91218e.setDataList(this.f91221h);
        this.f91217d.notifyDataSetChanged();
        if (this.f91221h.isEmpty()) {
            S3(false);
        }
    }

    private void W3(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42471, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_img);
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.rl_bg);
        TextView textView = (TextView) view.findViewById(R.id.tv_title);
        TextView textView2 = (TextView) view.findViewById(R.id.tv_time);
        TextView textView3 = (TextView) view.findViewById(R.id.tv_visits);
        ((LinearLayout.LayoutParams) relativeLayout.getLayoutParams()).height = (int) (((double) ViewUtils.L(this.mContext)) / 1.8d);
        com.max.hbimage.b.K(this.f91225l.getInner_img(), imageView);
        textView3.setText("共 " + this.f91225l.getNews_num() + "篇");
        textView.setText(this.f91225l.getDescription());
        textView2.setText(this.f91225l.getClick());
        RadioGroup radioGroup = (RadioGroup) view.findViewById(R.id.rg_subject_page);
        ((RadioButton) radioGroup.getChildAt(0)).setChecked(true);
        this.f91227n = 0;
        if (radioGroup.getChildCount() > 1) {
            View childAt = radioGroup.getChildAt(1);
            if (!(childAt instanceof RadioButton)) {
                childAt.setVisibility(4);
            }
        }
        radioGroup.setOnCheckedChangeListener(new e());
    }

    private void X3(String str, List<FeedsContentBaseObj> list) {
        if (PatchProxy.proxy(new Object[]{str, list}, this, changeQuickRedirect, false, 42475, new Class[]{String.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        if (list != null) {
            if ("news".equals(str)) {
                if (this.f91223j == 0) {
                    this.f91220g.clear();
                }
                this.f91220g.addAll(list);
            } else if ("video".equals(str)) {
                if (this.f91224k == 0) {
                    this.f91221h.clear();
                }
                this.f91221h.addAll(list);
            } else {
                if (this.f91222i == 0) {
                    this.f91219f.clear();
                }
                this.f91219f.addAll(list);
            }
            this.f91217d.notifyDataSetChanged();
        }
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42469, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_refresh_rv);
        this.mUnBinder = ButterKnife.f(this, view);
        this.f91225l = (NewsSubjectObj) getArguments().getSerializable(f91211o);
        this.f91215b = ViewUtils.f(this.mContext, 4.0f);
        this.f91216c = this.mContext.getResources().getDimensionPixelSize(R.dimen.divider_height);
        T3();
        this.mRefreshLayout.S(new a());
        this.mRefreshLayout.f0(new b());
        showLoading();
        V3();
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42472, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        S3(false);
    }
}
