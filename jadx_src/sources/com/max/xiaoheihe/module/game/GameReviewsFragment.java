package com.max.xiaoheihe.module.game;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.module.bbs.LinkListV2Fragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class GameReviewsFragment extends com.max.hbcommon.base.d {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f84679f = "game_id";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f84680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f84681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.max.xiaoheihe.module.bbs.adapter.m f84682d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<BBSLinkObj> f84683e = new ArrayList();

    @BindView(R.id.rv)
    RecyclerView mRecyclerView;

    @BindView(R.id.srl)
    SmartRefreshLayout mRefreshLayout;

    public class a implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // pg.d
        public void k(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 33568, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            GameReviewsFragment.this.f84681c = 0;
            GameReviewsFragment.N3(GameReviewsFragment.this);
        }
    }

    public class b implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // pg.b
        public void f(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 33569, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            GameReviewsFragment.M3(GameReviewsFragment.this, 30);
            GameReviewsFragment.N3(GameReviewsFragment.this);
        }
    }

    static /* synthetic */ int M3(GameReviewsFragment gameReviewsFragment, int i10) {
        int i11 = gameReviewsFragment.f84681c + i10;
        gameReviewsFragment.f84681c = i11;
        return i11;
    }

    static /* synthetic */ void N3(GameReviewsFragment gameReviewsFragment) {
        if (PatchProxy.proxy(new Object[]{gameReviewsFragment}, null, changeQuickRedirect, true, 33567, new Class[]{GameReviewsFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameReviewsFragment.O3();
    }

    private void O3() {
    }

    public static GameReviewsFragment P3(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 33563, new Class[]{String.class}, GameReviewsFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameReviewsFragment) patchProxyResultProxy.result;
        }
        GameReviewsFragment gameReviewsFragment = new GameReviewsFragment();
        Bundle bundle = new Bundle();
        bundle.putString(f84679f, str);
        gameReviewsFragment.setArguments(bundle);
        return gameReviewsFragment;
    }

    private void Q3(List<BBSLinkObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 33565, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        if (list != null) {
            if (this.f84681c == 0) {
                this.f84683e.clear();
            }
            this.f84683e.addAll(list);
            this.f84682d.notifyDataSetChanged();
        }
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33564, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_refresh_rv);
        this.mUnBinder = ButterKnife.f(this, view);
        if (getArguments() != null) {
            this.f84680b = getArguments().getString(f84679f);
        }
        this.f84682d = new com.max.xiaoheihe.module.bbs.adapter.m(this.mContext, this.f84683e, LinkListV2Fragment.A);
        this.mRecyclerView.setClipToPadding(false);
        this.mRecyclerView.setClipChildren(false);
        this.mRecyclerView.setPadding(0, ViewUtils.f(this.mContext, 4.0f), 0, ViewUtils.f(this.mContext, 4.0f));
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this.mContext));
        this.mRecyclerView.setAdapter(this.f84682d);
        this.mRefreshLayout.S(new a());
        this.mRefreshLayout.f0(new b());
        showLoading();
        O3();
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33566, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        O3();
    }
}
