package com.max.xiaoheihe.module.game.pubg;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.base.adapter.u;
import com.max.hbminiprogram.NativeLittleProgramFragment;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.n;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.pubg.PUBGMatchListObj;
import com.max.xiaoheihe.bean.game.pubg.PUBGMatchObj;
import com.max.xiaoheihe.network.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.util.ArrayList;
import java.util.List;
import ng.j;

/* JADX INFO: loaded from: classes11.dex */
public class MatchesFragment extends NativeLittleProgramFragment {
    private static final String A = "MatchesFragment";
    public static final String B = "ARG_NICK_NAME";
    public static final String C = "ARG_PLAYER_ID";
    public static final String D = "ARG_SEASON";
    public static final String E = "ARG_REGION";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f87995z = 30;

    @BindView(R.id.rv_matches_list)
    RecyclerView mRvList;

    @BindView(R.id.srl_matches_list_wrapper)
    SmartRefreshLayout mSmartRefreshLayout;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f87996p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private List<PUBGMatchObj> f87997q = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private u<PUBGMatchObj> f87998r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private PUBGMatchListObj f87999s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f88000t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f88001u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f88002v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f88003w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f88004x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f88005y;

    public class a extends u<PUBGMatchObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a(Context context, List list) {
            super(context, list);
        }

        @Override // com.max.hbcommon.base.adapter.s, androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38148, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : super.getItemCount() + 1;
        }

        @Override // com.max.hbcommon.base.adapter.u, androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i10) {
            Object[] objArr = {new Integer(i10)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 38147, new Class[]{cls}, cls);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : n(i10, null);
        }

        @Override // com.max.hbcommon.base.adapter.u
        public /* bridge */ /* synthetic */ int m(int i10, PUBGMatchObj pUBGMatchObj) {
            Object[] objArr = {new Integer(i10), pUBGMatchObj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 38150, new Class[]{cls, Object.class}, cls);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : n(i10, pUBGMatchObj);
        }

        public int n(int i10, PUBGMatchObj pUBGMatchObj) {
            return i10 == 0 ? R.layout.item_matches_title : R.layout.item_pubg_matches_v2;
        }

        public void o(s.e eVar, int i10, List<Object> list) {
            if (PatchProxy.proxy(new Object[]{eVar, new Integer(i10), list}, this, changeQuickRedirect, false, 38146, new Class[]{s.e.class, Integer.TYPE, List.class}, Void.TYPE).isSupported) {
                return;
            }
            p(eVar, i10 == 0 ? null : (PUBGMatchObj) this.mDataList.get(i10 - 1));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10, List list) {
            if (PatchProxy.proxy(new Object[]{viewHolder, new Integer(i10), list}, this, changeQuickRedirect, false, 38152, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE, List.class}, Void.TYPE).isSupported) {
                return;
            }
            o((s.e) viewHolder, i10, list);
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, Object obj) {
            if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 38151, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            p(eVar, (PUBGMatchObj) obj);
        }

        public void p(s.e eVar, PUBGMatchObj pUBGMatchObj) {
            if (PatchProxy.proxy(new Object[]{eVar, pUBGMatchObj}, this, changeQuickRedirect, false, 38149, new Class[]{s.e.class, PUBGMatchObj.class}, Void.TYPE).isSupported) {
                return;
            }
            int iD = eVar.d();
            if (iD == R.layout.item_matches) {
                com.max.xiaoheihe.module.game.pubg.utils.b.l((ViewGroup) eVar.b(), pUBGMatchObj, eVar.getAdapterPosition() == getItemCount() - 1);
            } else {
                if (iD != R.layout.item_pubg_matches_v2) {
                    return;
                }
                com.max.xiaoheihe.module.littleprogram.fragment.pubg.c.d(((com.max.hbcommon.base.d) MatchesFragment.this).mContext, eVar.b(), pUBGMatchObj, eVar.getAdapterPosition() == getItemCount() - 1);
            }
        }
    }

    public class b implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // pg.d
        public void k(j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 38153, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            MatchesFragment.this.f87996p = 0;
            MatchesFragment.L4(MatchesFragment.this);
        }
    }

    public class c implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // pg.b
        public void f(j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 38154, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            MatchesFragment.K4(MatchesFragment.this, 30);
            MatchesFragment.L4(MatchesFragment.this);
        }
    }

    public class d extends com.max.hbcommon.network.d<Result<PUBGMatchListObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            SmartRefreshLayout smartRefreshLayout;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38156, new Class[0], Void.TYPE).isSupported || !MatchesFragment.this.isActive() || (smartRefreshLayout = MatchesFragment.this.mSmartRefreshLayout) == null) {
                return;
            }
            smartRefreshLayout.A(0);
            MatchesFragment.this.mSmartRefreshLayout.p(0);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 38155, new Class[]{Throwable.class}, Void.TYPE).isSupported && MatchesFragment.this.isActive()) {
                SmartRefreshLayout smartRefreshLayout = MatchesFragment.this.mSmartRefreshLayout;
                if (smartRefreshLayout != null) {
                    smartRefreshLayout.A(0);
                    MatchesFragment.this.mSmartRefreshLayout.p(0);
                }
                super.onError(th2);
                MatchesFragment.M4(MatchesFragment.this);
                th2.printStackTrace();
            }
        }

        public void onNext(Result<PUBGMatchListObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 38157, new Class[]{Result.class}, Void.TYPE).isSupported && MatchesFragment.this.isActive()) {
                super.onNext(result);
                MatchesFragment.this.f87999s = result.getResult();
                if (MatchesFragment.this.f87999s != null) {
                    MatchesFragment.P4(MatchesFragment.this);
                } else {
                    MatchesFragment.Q4(MatchesFragment.this);
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 38158, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<PUBGMatchListObj>) obj);
        }
    }

    public class e implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 38159, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if (MatchesFragment.this.f87999s != null && MatchesFragment.this.f87999s.getPush_state() != null) {
                MatchesFragment matchesFragment = MatchesFragment.this;
                MatchesFragment.R4(matchesFragment, matchesFragment.f87999s.getPush_state().getPush_type(), "1");
            }
            dialogInterface.dismiss();
        }
    }

    public class f implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 38160, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    public class g extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 38161, new Class[]{Throwable.class}, Void.TYPE).isSupported && MatchesFragment.this.isActive()) {
                super.onError(th2);
            }
        }

        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 38162, new Class[]{Result.class}, Void.TYPE).isSupported && MatchesFragment.this.isActive()) {
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(MatchesFragment.this.getString(R.string.success));
                } else {
                    com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 38163, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    static /* synthetic */ int K4(MatchesFragment matchesFragment, int i10) {
        int i11 = matchesFragment.f87996p + i10;
        matchesFragment.f87996p = i11;
        return i11;
    }

    static /* synthetic */ void L4(MatchesFragment matchesFragment) {
        if (PatchProxy.proxy(new Object[]{matchesFragment}, null, changeQuickRedirect, true, 38141, new Class[]{MatchesFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        matchesFragment.S4();
    }

    static /* synthetic */ void M4(MatchesFragment matchesFragment) {
        if (PatchProxy.proxy(new Object[]{matchesFragment}, null, changeQuickRedirect, true, 38142, new Class[]{MatchesFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        matchesFragment.showError();
    }

    static /* synthetic */ void P4(MatchesFragment matchesFragment) {
        if (PatchProxy.proxy(new Object[]{matchesFragment}, null, changeQuickRedirect, true, 38143, new Class[]{MatchesFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        matchesFragment.V4();
    }

    static /* synthetic */ void Q4(MatchesFragment matchesFragment) {
        if (PatchProxy.proxy(new Object[]{matchesFragment}, null, changeQuickRedirect, true, 38144, new Class[]{MatchesFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        matchesFragment.showError();
    }

    static /* synthetic */ void R4(MatchesFragment matchesFragment, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{matchesFragment, str, str2}, null, changeQuickRedirect, true, 38145, new Class[]{MatchesFragment.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        matchesFragment.U4(str, str2);
    }

    private void S4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38136, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) i.a().J4(this.f88002v, this.f87996p, 30, this.f88000t, this.f88001u, 1, this.f88003w).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d()));
    }

    public static MatchesFragment T4(String str, String str2, String str3, String str4) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4}, null, changeQuickRedirect, true, 38134, new Class[]{String.class, String.class, String.class, String.class}, MatchesFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (MatchesFragment) patchProxyResultProxy.result;
        }
        MatchesFragment matchesFragment = new MatchesFragment();
        Bundle bundle = new Bundle();
        bundle.putString(B, str);
        bundle.putString(C, str4);
        bundle.putString(D, str2);
        bundle.putString(E, str3);
        matchesFragment.setArguments(bundle);
        return matchesFragment;
    }

    private void U4(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 38140, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) i.a().l2(str, str2).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new g()));
    }

    private void V4() {
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38138, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        List<PUBGMatchObj> list = this.f87997q;
        if (list != null) {
            if (this.f87996p == 0) {
                list.clear();
            }
            if (this.f87999s.getMatches() != null) {
                this.f87997q.addAll(this.f87999s.getMatches());
            }
            this.f87998r.notifyDataSetChanged();
            if (this.f87999s.getPush_state() != null && "1".equals(this.f87999s.getPush_state().getPush_state())) {
                z10 = true;
            }
            if (!this.f88004x || z10) {
                return;
            }
            int i10 = this.f88005y;
            if (i10 == 0 || i10 == 30) {
                W4();
            }
        }
    }

    private void W4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38139, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(this.mContext);
        fVar.y(com.max.xiaoheihe.utils.d.n0(R.string.pubg_push_dialog_title));
        fVar.l(com.max.xiaoheihe.utils.d.n0(R.string.pubg_push_dialog_msg));
        com.max.hbcommon.view.a aVarD = fVar.d();
        aVarD.u(com.max.xiaoheihe.utils.d.n0(R.string.open_push), new e());
        aVarD.r(com.max.xiaoheihe.utils.d.n0(R.string.later_on), new f());
        aVarD.show();
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.fragment.BaseLittleProgramFragment
    public void a4(View view, boolean z10) {
        if (PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 38135, new Class[]{View.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.a4(view, z10);
        setContentView(R.layout.fragment_matches);
        this.mUnBinder = ButterKnife.f(this, view);
        this.mTitleBarDivider.setVisibility(8);
        if (getArguments() != null) {
            this.f88002v = getArguments().getString(B);
            this.f88000t = getArguments().getString(D);
            this.f88001u = getArguments().getString(E);
            this.f88003w = getArguments().getString(C);
        }
        if (this.f88002v == null) {
            this.f88002v = "";
        }
        if (this.f88003w == null) {
            this.f88003w = this.f88002v;
        }
        this.f88004x = com.max.xiaoheihe.module.account.utils.c.f(this.f88003w) == 1 || com.max.xiaoheihe.module.account.utils.c.e(this.f88002v) == 1;
        int iQ = n.q(com.max.hbcache.c.j("pubg_match_list_enter_count"));
        this.f88005y = iQ;
        com.max.hbcache.c.z("pubg_match_list_enter_count", (iQ < 30 ? 1 + iQ : 1) + "");
        a aVar = new a(getContext(), this.f87997q);
        this.f87998r = aVar;
        this.mRvList.setAdapter(aVar);
        this.mRvList.setLayoutManager(new LinearLayoutManager(getContext()));
        this.mSmartRefreshLayout.S(new b());
        this.mSmartRefreshLayout.f0(new c());
        S4();
    }

    @Override // com.max.hbminiprogram.fragment.BaseLittleProgramFragment, com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38137, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f87996p = 0;
        S4();
    }
}
