package com.max.xiaoheihe.module.game.pubg;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.p0;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.base.adapter.t;
import com.max.hbminiprogram.NativeLittleProgramFragment;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.pubg.PUBGWeaponMasteryObj;
import com.max.xiaoheihe.bean.game.pubg.PUBGWeaponObj;
import com.max.xiaoheihe.network.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import ng.j;

/* JADX INFO: loaded from: classes11.dex */
@n9.a({com.max.hbminiprogram.d.class})
public class PUBGWeaponsFragment extends NativeLittleProgramFragment {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f88140v = "player_id";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f88141w = "season";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f88142x = "mode";

    @BindView(R.id.rv)
    RecyclerView mRecyclerView;

    @BindView(R.id.srl)
    SmartRefreshLayout mRefreshLayout;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f88143p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f88144q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f88145r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private t f88146s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private List<PUBGWeaponObj> f88147t = new ArrayList();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f88148u;

    public class a extends s<PUBGWeaponObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a(Context context, List list, int i10) {
            super(context, list, i10);
        }

        public void m(s.e eVar, PUBGWeaponObj pUBGWeaponObj) {
            if (PatchProxy.proxy(new Object[]{eVar, pUBGWeaponObj}, this, changeQuickRedirect, false, 38330, new Class[]{s.e.class, PUBGWeaponObj.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.module.game.pubg.utils.c.j(eVar, pUBGWeaponObj, eVar.getAdapterPosition() == getItemCount());
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, PUBGWeaponObj pUBGWeaponObj) {
            if (PatchProxy.proxy(new Object[]{eVar, pUBGWeaponObj}, this, changeQuickRedirect, false, 38331, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, pUBGWeaponObj);
        }
    }

    public class b implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // pg.d
        public void k(j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 38332, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            PUBGWeaponsFragment.this.f88148u = 0;
            PUBGWeaponsFragment.J4(PUBGWeaponsFragment.this);
        }
    }

    public class c extends com.max.hbcommon.network.d<Result<PUBGWeaponMasteryObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38333, new Class[0], Void.TYPE).isSupported && PUBGWeaponsFragment.this.isActive()) {
                super.onComplete();
                PUBGWeaponsFragment.this.mRefreshLayout.A(0);
                PUBGWeaponsFragment.this.mRefreshLayout.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 38334, new Class[]{Throwable.class}, Void.TYPE).isSupported && PUBGWeaponsFragment.this.isActive()) {
                super.onError(th2);
                PUBGWeaponsFragment.K4(PUBGWeaponsFragment.this);
                PUBGWeaponsFragment.this.mRefreshLayout.A(0);
                PUBGWeaponsFragment.this.mRefreshLayout.p(0);
            }
        }

        public void onNext(Result<PUBGWeaponMasteryObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 38335, new Class[]{Result.class}, Void.TYPE).isSupported && PUBGWeaponsFragment.this.isActive()) {
                super.onNext(result);
                PUBGWeaponsFragment.L4(PUBGWeaponsFragment.this, result.getResult() != null ? result.getResult().getWeapons() : null);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 38336, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<PUBGWeaponMasteryObj>) obj);
        }
    }

    static /* synthetic */ void J4(PUBGWeaponsFragment pUBGWeaponsFragment) {
        if (PatchProxy.proxy(new Object[]{pUBGWeaponsFragment}, null, changeQuickRedirect, true, 38327, new Class[]{PUBGWeaponsFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        pUBGWeaponsFragment.M4();
    }

    static /* synthetic */ void K4(PUBGWeaponsFragment pUBGWeaponsFragment) {
        if (PatchProxy.proxy(new Object[]{pUBGWeaponsFragment}, null, changeQuickRedirect, true, 38328, new Class[]{PUBGWeaponsFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        pUBGWeaponsFragment.showError();
    }

    static /* synthetic */ void L4(PUBGWeaponsFragment pUBGWeaponsFragment, List list) {
        if (PatchProxy.proxy(new Object[]{pUBGWeaponsFragment, list}, null, changeQuickRedirect, true, 38329, new Class[]{PUBGWeaponsFragment.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        pUBGWeaponsFragment.O4(list);
    }

    private void M4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38323, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.e eVarA = i.a();
        String str = this.f88143p;
        addDisposable((io.reactivex.disposables.b) eVarA.B9(str, str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
    }

    public static PUBGWeaponsFragment N4(String str, String str2, String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3}, null, changeQuickRedirect, true, 38321, new Class[]{String.class, String.class, String.class}, PUBGWeaponsFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (PUBGWeaponsFragment) patchProxyResultProxy.result;
        }
        PUBGWeaponsFragment pUBGWeaponsFragment = new PUBGWeaponsFragment();
        Bundle bundle = new Bundle();
        bundle.putString("player_id", str);
        bundle.putString("season", str2);
        bundle.putString("mode", str3);
        pUBGWeaponsFragment.setArguments(bundle);
        return pUBGWeaponsFragment;
    }

    private void O4(List<PUBGWeaponObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 38324, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        if (list != null) {
            if (this.f88148u == 0) {
                this.f88147t.clear();
            }
            this.f88147t.addAll(list);
            this.f88146s.notifyDataSetChanged();
        }
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.d
    @p0
    public Fragment a2(@p0 Map<String, ?> map) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 38326, new Class[]{Map.class}, Fragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (Fragment) patchProxyResultProxy.result;
        }
        if (map == null) {
            return null;
        }
        return N4((String) map.get("player_id"), (String) map.get("season"), (String) map.get("mode"));
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.fragment.BaseLittleProgramFragment
    public void a4(View view, boolean z10) {
        if (PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 38322, new Class[]{View.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.a4(view, z10);
        setContentView(R.layout.fragment_pubg_weapon);
        this.mUnBinder = ButterKnife.f(this, view);
        this.mTitleBarDivider.setVisibility(8);
        if (getArguments() != null) {
            this.f88143p = getArguments().getString("player_id");
            this.f88144q = getArguments().getString("season");
            this.f88145r = getArguments().getString("mode");
        }
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this.mContext));
        this.f88146s = new t(new a(this.mContext, this.f88147t, R.layout.item_weapons_pubg_v2));
        this.f88146s.p(R.layout.item_weapons_title_pubg, this.mInflater.inflate(R.layout.item_weapons_title_pubg, (ViewGroup) this.mRecyclerView, false));
        this.mRecyclerView.setAdapter(this.f88146s);
        this.mRefreshLayout.S(new b());
        this.mRefreshLayout.b0(false);
        M4();
    }

    @Override // com.max.hbminiprogram.fragment.BaseLittleProgramFragment, com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38325, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        M4();
    }
}
