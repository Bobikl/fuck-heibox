package com.max.xiaoheihe.module.game.pubg;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.base.adapter.s;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.pubg.PUBGMatchListObj;
import com.max.xiaoheihe.bean.game.pubg.PUBGMatchObj;
import com.max.xiaoheihe.network.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.util.ArrayList;
import java.util.List;
import ng.j;

/* JADX INFO: loaded from: classes11.dex */
public class PUBGGetShareMatchesActivity extends BaseActivity {
    public static ChangeQuickRedirect changeQuickRedirect;
    s<PUBGMatchObj> L;
    List<PUBGMatchObj> M = new ArrayList();
    int N = 0;

    @BindView(R.id.rv)
    RecyclerView mRecyclerView;

    @BindView(R.id.srl)
    SmartRefreshLayout mRefreshLayout;

    public class a extends RecyclerView.ItemDecoration {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{rect, view, recyclerView, state}, this, changeQuickRedirect, false, 38291, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            if (recyclerView.getChildAdapterPosition(view) == 0) {
                rect.set(ViewUtils.f(((BaseActivity) PUBGGetShareMatchesActivity.this).f66601b, 10.0f), ViewUtils.f(((BaseActivity) PUBGGetShareMatchesActivity.this).f66601b, 10.0f), ViewUtils.f(((BaseActivity) PUBGGetShareMatchesActivity.this).f66601b, 10.0f), ViewUtils.f(((BaseActivity) PUBGGetShareMatchesActivity.this).f66601b, 4.0f));
            } else {
                rect.set(ViewUtils.f(((BaseActivity) PUBGGetShareMatchesActivity.this).f66601b, 10.0f), 0, ViewUtils.f(((BaseActivity) PUBGGetShareMatchesActivity.this).f66601b, 10.0f), ViewUtils.f(((BaseActivity) PUBGGetShareMatchesActivity.this).f66601b, 4.0f));
            }
        }
    }

    public class b extends s<PUBGMatchObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ PUBGMatchObj f88118b;

            a(PUBGMatchObj pUBGMatchObj) {
                this.f88118b = pUBGMatchObj;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38294, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                Intent intent = new Intent();
                intent.putExtra("match_info", this.f88118b);
                PUBGGetShareMatchesActivity.this.setResult(-1, intent);
                PUBGGetShareMatchesActivity.this.finish();
            }
        }

        b(Context context, List list, int i10) {
            super(context, list, i10);
        }

        public void m(s.e eVar, PUBGMatchObj pUBGMatchObj) {
            if (PatchProxy.proxy(new Object[]{eVar, pUBGMatchObj}, this, changeQuickRedirect, false, 38292, new Class[]{s.e.class, PUBGMatchObj.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.module.game.pubg.utils.b.i(eVar, pUBGMatchObj, 0);
            eVar.itemView.setOnClickListener(new a(pUBGMatchObj));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, PUBGMatchObj pUBGMatchObj) {
            if (PatchProxy.proxy(new Object[]{eVar, pUBGMatchObj}, this, changeQuickRedirect, false, 38293, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, pUBGMatchObj);
        }
    }

    public class c implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // pg.d
        public void k(j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 38295, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            PUBGGetShareMatchesActivity pUBGGetShareMatchesActivity = PUBGGetShareMatchesActivity.this;
            pUBGGetShareMatchesActivity.N = 0;
            PUBGGetShareMatchesActivity.W1(pUBGGetShareMatchesActivity);
        }
    }

    public class d implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // pg.b
        public void f(j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 38296, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            PUBGGetShareMatchesActivity pUBGGetShareMatchesActivity = PUBGGetShareMatchesActivity.this;
            pUBGGetShareMatchesActivity.N += 30;
            PUBGGetShareMatchesActivity.W1(pUBGGetShareMatchesActivity);
        }
    }

    public class e extends com.max.hbcommon.network.d<Result<PUBGMatchListObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38298, new Class[0], Void.TYPE).isSupported && PUBGGetShareMatchesActivity.this.isActive()) {
                PUBGGetShareMatchesActivity.Y1(PUBGGetShareMatchesActivity.this);
                PUBGGetShareMatchesActivity.this.mRefreshLayout.A(0);
                PUBGGetShareMatchesActivity.this.mRefreshLayout.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 38297, new Class[]{Throwable.class}, Void.TYPE).isSupported && PUBGGetShareMatchesActivity.this.isActive()) {
                super.onError(th2);
                PUBGGetShareMatchesActivity.X1(PUBGGetShareMatchesActivity.this);
                PUBGGetShareMatchesActivity.this.mRefreshLayout.A(0);
                PUBGGetShareMatchesActivity.this.mRefreshLayout.p(0);
            }
        }

        public void onNext(Result<PUBGMatchListObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 38299, new Class[]{Result.class}, Void.TYPE).isSupported || !PUBGGetShareMatchesActivity.this.isActive() || result == null) {
                return;
            }
            PUBGGetShareMatchesActivity pUBGGetShareMatchesActivity = PUBGGetShareMatchesActivity.this;
            if (pUBGGetShareMatchesActivity.N == 0) {
                pUBGGetShareMatchesActivity.M.clear();
            }
            if (result.getResult() != null && result.getResult().getMatches() != null) {
                for (PUBGMatchObj pUBGMatchObj : result.getResult().getMatches()) {
                    pUBGMatchObj.setPlayer_info(result.getResult().getPlayer_info());
                    pUBGMatchObj.setDownload_url(result.getResult().getDownload_url());
                    PUBGGetShareMatchesActivity.this.M.add(pUBGMatchObj);
                }
            }
            PUBGGetShareMatchesActivity.this.L.notifyDataSetChanged();
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 38300, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<PUBGMatchListObj>) obj);
        }
    }

    static /* synthetic */ void W1(PUBGGetShareMatchesActivity pUBGGetShareMatchesActivity) {
        if (PatchProxy.proxy(new Object[]{pUBGGetShareMatchesActivity}, null, changeQuickRedirect, true, 38288, new Class[]{PUBGGetShareMatchesActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        pUBGGetShareMatchesActivity.Z1();
    }

    static /* synthetic */ void X1(PUBGGetShareMatchesActivity pUBGGetShareMatchesActivity) {
        if (PatchProxy.proxy(new Object[]{pUBGGetShareMatchesActivity}, null, changeQuickRedirect, true, 38289, new Class[]{PUBGGetShareMatchesActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        pUBGGetShareMatchesActivity.C1();
    }

    static /* synthetic */ void Y1(PUBGGetShareMatchesActivity pUBGGetShareMatchesActivity) {
        if (PatchProxy.proxy(new Object[]{pUBGGetShareMatchesActivity}, null, changeQuickRedirect, true, 38290, new Class[]{PUBGGetShareMatchesActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        pUBGGetShareMatchesActivity.x1();
    }

    private void Z1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38287, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) i.a().p0(this.N, 30).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e()));
    }

    private void a2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38286, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this.f66601b));
        this.mRecyclerView.addItemDecoration(new a());
        b bVar = new b(this.f66601b, this.M, R.layout.item_pubg_share_card);
        this.L = bVar;
        this.mRecyclerView.setAdapter(bVar);
        this.mRefreshLayout.S(new c());
        this.mRefreshLayout.f0(new d());
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38285, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_refresh_rv);
        this.f66620u = ButterKnife.a(this);
        this.f66616q.setTitle("选择战绩卡片");
        a2();
        E1();
        Z1();
    }
}
