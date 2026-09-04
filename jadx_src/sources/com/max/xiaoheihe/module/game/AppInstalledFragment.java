package com.max.xiaoheihe.module.game;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GameObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class AppInstalledFragment extends com.max.hbcommon.base.d {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d f84037c;

    @BindView(R.id.rv)
    RecyclerView mRecyclerView;

    @BindView(R.id.srl)
    SmartRefreshLayout mRefreshLayout;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<GameObj> f84036b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.max.xiaoheihe.module.game.b f84038d = new com.max.xiaoheihe.module.game.b();

    public class a extends RecyclerView.ItemDecoration {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@androidx.annotation.n0 Rect rect, @androidx.annotation.n0 View view, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{rect, view, recyclerView, state}, this, changeQuickRedirect, false, 32246, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            int iF = ViewUtils.f(((com.max.hbcommon.base.d) AppInstalledFragment.this).mContext, 12.0f);
            int iF2 = ViewUtils.f(((com.max.hbcommon.base.d) AppInstalledFragment.this).mContext, 10.0f);
            rect.set(iF, iF2, iF, iF2);
        }
    }

    public class b implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // pg.d
        public void k(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 32247, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            AppInstalledFragment.S3(AppInstalledFragment.this);
            AppInstalledFragment.this.mRefreshLayout.P();
        }
    }

    public class c extends com.max.hbcommon.network.d<List<GameObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        public void a(List<GameObj> list) {
            if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 32250, new Class[]{List.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!com.max.hbcommon.utils.c.w(list)) {
                AppInstalledFragment.this.f84036b.addAll(list);
            }
            if (com.max.hbcommon.utils.c.w(AppInstalledFragment.this.f84036b)) {
                return;
            }
            Iterator it = AppInstalledFragment.this.f84036b.iterator();
            while (it.hasNext()) {
                if (!com.max.xiaoheihe.module.game.c.i(((GameObj) it.next()).getBundle_id())) {
                    it.remove();
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32249, new Class[0], Void.TYPE).isSupported && AppInstalledFragment.this.isActive()) {
                AppInstalledFragment.T3(AppInstalledFragment.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 32248, new Class[]{Throwable.class}, Void.TYPE).isSupported && AppInstalledFragment.this.isActive()) {
                AppInstalledFragment.T3(AppInstalledFragment.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 32251, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a((List) obj);
        }
    }

    public class d extends com.max.hbcommon.base.adapter.u<GameObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f84043b;

            a(String str) {
                this.f84043b = str;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32255, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.xiaoheihe.utils.d.S1(((com.max.hbcommon.base.d) AppInstalledFragment.this).mContext, this.f84043b);
            }
        }

        public class b implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f84045b;

            b(String str) {
                this.f84045b = str;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32256, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.xiaoheihe.utils.d.d1(((com.max.hbcommon.base.d) AppInstalledFragment.this).mContext, this.f84045b);
            }
        }

        public class c implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ GameObj f84047b;

            c(GameObj gameObj) {
                this.f84047b = gameObj;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32257, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                ((com.max.hbcommon.base.d) AppInstalledFragment.this).mContext.startActivity(z.b(((com.max.hbcommon.base.d) AppInstalledFragment.this).mContext, this.f84047b.getH_src(), r1.Z(this.f84047b), this.f84047b.getGame_type(), null, com.max.xiaoheihe.utils.i0.m(), com.max.xiaoheihe.utils.i0.j(), null));
            }
        }

        public d() {
            super(((com.max.hbcommon.base.d) AppInstalledFragment.this).mContext, AppInstalledFragment.this.f84036b);
        }

        @Override // com.max.hbcommon.base.adapter.u
        public /* bridge */ /* synthetic */ int m(int i10, GameObj gameObj) {
            Object[] objArr = {new Integer(i10), gameObj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 32253, new Class[]{cls, Object.class}, cls);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : n(i10, gameObj);
        }

        public int n(int i10, GameObj gameObj) {
            return R.layout.item_apk_mgr;
        }

        public void o(com.max.hbcommon.base.adapter.s.e eVar, GameObj gameObj) {
            if (PatchProxy.proxy(new Object[]{eVar, gameObj}, this, changeQuickRedirect, false, 32252, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameObj.class}, Void.TYPE).isSupported) {
                return;
            }
            View viewB = eVar.b();
            ImageView imageView = (ImageView) eVar.i(R.id.iv_avatar);
            TextView textView = (TextView) eVar.i(R.id.tv_name);
            TextView textView2 = (TextView) eVar.i(R.id.tv_download);
            TextView textView3 = (TextView) eVar.i(R.id.tv_progress_btn_left);
            TextView textView4 = (TextView) eVar.i(R.id.tv_progress_btn_right);
            TextView textView5 = (TextView) eVar.i(R.id.tv_progress);
            ProgressBar progressBar = (ProgressBar) eVar.i(R.id.pb_download);
            String bundle_id = gameObj.getBundle_id();
            com.max.hbimage.b.K(gameObj.getAppicon(), imageView);
            textView.setText(gameObj.getName());
            if (com.max.xiaoheihe.module.game.c.i(bundle_id)) {
                textView2.setVisibility(8);
                textView3.setVisibility(0);
                textView4.setVisibility(0);
                progressBar.setVisibility(8);
                if (textView5 != null) {
                    textView5.setVisibility(8);
                }
                textView3.setBackgroundResource(R.drawable.btn_divider_bg_2dp);
                textView3.setTextColor(((com.max.hbcommon.base.d) AppInstalledFragment.this).mContext.getResources().getColor(R.color.text_secondary_1_color));
                textView3.setText(((com.max.hbcommon.base.d) AppInstalledFragment.this).mContext.getResources().getString(R.string.uninstall));
                textView3.setOnClickListener(new a(bundle_id));
                textView4.setText(((com.max.hbcommon.base.d) AppInstalledFragment.this).mContext.getResources().getString(R.string.open_app));
                textView4.setOnClickListener(new b(bundle_id));
            } else {
                textView3.setBackgroundResource(R.drawable.btn_interactive_2dp);
                textView3.setTextColor(((com.max.hbcommon.base.d) AppInstalledFragment.this).mContext.getResources().getColor(R.color.white));
                AppInstalledFragment.this.f84038d.e(eVar, gameObj, true);
            }
            viewB.setOnClickListener(new c(gameObj));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, Object obj) {
            if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 32254, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            o(eVar, (GameObj) obj);
        }
    }

    static /* synthetic */ void S3(AppInstalledFragment appInstalledFragment) {
        if (PatchProxy.proxy(new Object[]{appInstalledFragment}, null, changeQuickRedirect, true, 32244, new Class[]{AppInstalledFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        appInstalledFragment.b4();
    }

    static /* synthetic */ void T3(AppInstalledFragment appInstalledFragment) {
        if (PatchProxy.proxy(new Object[]{appInstalledFragment}, null, changeQuickRedirect, true, 32245, new Class[]{AppInstalledFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        appInstalledFragment.c4();
    }

    public static AppInstalledFragment a4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 32237, new Class[0], AppInstalledFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (AppInstalledFragment) patchProxyResultProxy.result;
        }
        AppInstalledFragment appInstalledFragment = new AppInstalledFragment();
        appInstalledFragment.setArguments(new Bundle());
        return appInstalledFragment;
    }

    private void b4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32242, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f84036b.clear();
        addDisposable((io.reactivex.disposables.b) com.max.hbcache.b.f("download_installed", GameObj.class).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
    }

    private void c4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32241, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Iterator<Map.Entry<String, com.lzy.okserver.download.b>> it = com.max.xiaoheihe.module.game.c.b().entrySet().iterator();
        while (it.hasNext()) {
            com.lzy.okserver.download.b value = it.next().getValue();
            GameObj gameObj = (GameObj) value.f64853b.f64789o;
            String bundle_id = gameObj.getBundle_id();
            if (value.f64853b.f64785k == 5 && com.max.xiaoheihe.module.game.c.i(bundle_id) && !this.f84036b.contains(gameObj)) {
                this.f84036b.add(gameObj);
            }
        }
        d4();
    }

    private void d4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32243, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        d dVar = this.f84037c;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
        if (this.f84036b.isEmpty()) {
            showEmpty();
        } else {
            showContentView();
        }
        com.max.hbcache.b.k("download_installed", this.f84036b);
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32238, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_refresh_rv);
        this.mUnBinder = ButterKnife.f(this, view);
        this.mRefreshLayout.setBackgroundColor(getResources().getColor(R.color.white));
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this.mContext));
        this.mRecyclerView.addItemDecoration(new a());
        d dVar = new d();
        this.f84037c = dVar;
        this.mRecyclerView.setAdapter(dVar);
        this.mRefreshLayout.S(new b());
        this.mRefreshLayout.b0(false);
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32240, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f84038d.g();
        super.onDestroyView();
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32239, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        b4();
    }
}
