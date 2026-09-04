package com.max.xiaoheihe.module.search.page;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.o;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.base.adapter.t;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbsearch.y0;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GameListObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.module.game.a2;
import com.max.xiaoheihe.module.search.SearchHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: SearchGameTypeFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class f extends y0 {

    @dl.d
    public static final a O = new a(null);
    public static final int P = 8;

    @dl.d
    private static final String Q = "1";

    @dl.d
    private static final String R = "2";

    @dl.d
    private static final String S = "3";
    public static ChangeQuickRedirect changeQuickRedirect;
    private t L;

    @dl.e
    private KeyDescObj M;

    @dl.d
    private final ArrayList<GameObj> I = new ArrayList<>();

    @dl.d
    private final ArrayList<GameObj> J = new ArrayList<>();

    @dl.d
    private final a2 K = new a2();

    @dl.d
    private String N = "1";

    /* JADX INFO: compiled from: SearchGameTypeFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final Bundle a(@dl.d String type) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{type}, this, changeQuickRedirect, false, 43037, new Class[]{String.class}, Bundle.class);
            if (patchProxyResultProxy.isSupported) {
                return (Bundle) patchProxyResultProxy.result;
            }
            f0.p(type, "type");
            Bundle bundle = new Bundle();
            com.max.xiaoheihe.module.search.b bVar = com.max.xiaoheihe.module.search.b.f91614a;
            bundle.putSerializable(bVar.b(), type);
            bundle.putInt(bVar.e(), 15);
            return bundle;
        }

        @dl.d
        public final String b() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43035, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : f.R;
        }

        @dl.d
        public final String c() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43036, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : f.S;
        }

        @dl.d
        public final String d() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43034, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : f.Q;
        }
    }

    /* JADX INFO: compiled from: SearchGameTypeFragment.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<GameListObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f91658b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f91659c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f91660d;

        b(String str, f fVar, String str2) {
            this.f91658b = str;
            this.f91659c = fVar;
            this.f91660d = str2;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43039, new Class[0], Void.TYPE).isSupported && f0.g(this.f91658b, f.Q5(this.f91659c)) && this.f91659c.isActive()) {
                super.onComplete();
                f.K5(this.f91659c, this.f91658b);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 43038, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (f0.g(this.f91658b, f.Q5(this.f91659c)) && this.f91659c.isActive()) {
                super.onError(e10);
                f.K5(this.f91659c, this.f91658b);
            }
        }

        /* JADX WARN: Code duplicated, block: B:23:0x009e  */
        public void onNext(@dl.d Result<GameListObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 43040, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (f0.g(this.f91658b, f.Q5(this.f91659c)) && this.f91659c.isActive()) {
                if (result.getResult() != null) {
                    GameListObj result2 = result.getResult();
                    f0.m(result2);
                    if (result2.getGames() != null) {
                        if (f.P5(this.f91659c) == 0) {
                            this.f91659c.I.clear();
                        }
                        ArrayList arrayList = this.f91659c.I;
                        GameListObj result3 = result.getResult();
                        f0.m(result3);
                        arrayList.addAll(result3.getGames());
                    }
                }
                if (result.getResult() != null) {
                    GameListObj result4 = result.getResult();
                    f0.m(result4);
                    if (result4.getGame_tag_info() != null) {
                        f fVar = this.f91659c;
                        GameListObj result5 = result.getResult();
                        f0.m(result5);
                        fVar.M = result5.getGame_tag_info();
                    } else {
                        this.f91659c.M = null;
                    }
                } else {
                    this.f91659c.M = null;
                }
                f.R5(this.f91659c, this.f91660d);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 43041, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<GameListObj>) obj);
        }
    }

    public static final /* synthetic */ void K5(f fVar, String str) {
        if (PatchProxy.proxy(new Object[]{fVar, str}, null, changeQuickRedirect, true, 43031, new Class[]{f.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        fVar.Q3(str);
    }

    public static final /* synthetic */ int P5(f fVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{fVar}, null, changeQuickRedirect, true, 43032, new Class[]{f.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : fVar.c4();
    }

    public static final /* synthetic */ String Q5(f fVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{fVar}, null, changeQuickRedirect, true, 43030, new Class[]{f.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : fVar.d4();
    }

    public static final /* synthetic */ void R5(f fVar, String str) {
        if (PatchProxy.proxy(new Object[]{fVar, str}, null, changeQuickRedirect, true, 43033, new Class[]{f.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        fVar.T5(str);
    }

    private final void T5(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 43028, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        t tVar = null;
        if (this.M != null) {
            t tVar2 = this.L;
            if (tVar2 == null) {
                f0.S("mGameListAdapter");
                tVar2 = null;
            }
            if (!tVar2.H(R.layout.item_game_search_taginfo, this.M)) {
                View viewInflate = this.mInflater.inflate(R.layout.item_game_search_taginfo, (ViewGroup) P4(), false);
                f0.o(viewInflate, "mInflater.inflate(R.layo…fo, mRecyclerView, false)");
                t tVar3 = this.L;
                if (tVar3 == null) {
                    f0.S("mGameListAdapter");
                    tVar3 = null;
                }
                tVar3.r(R.layout.item_game_search_taginfo, viewInflate, this.M, 0);
            }
        } else {
            t tVar4 = this.L;
            if (tVar4 == null) {
                f0.S("mGameListAdapter");
                tVar4 = null;
            }
            tVar4.F(R.layout.item_game_search_taginfo);
        }
        t tVar5 = this.L;
        if (tVar5 == null) {
            f0.S("mGameListAdapter");
        } else {
            tVar = tVar5;
        }
        tVar.notifyDataSetChanged();
        if (this.I.isEmpty()) {
            y4();
        } else {
            E5(true);
            N4().setVisibility(8);
        }
    }

    private final void U5(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 43027, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().e6(str, str2, c4(), a4()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b(str, this, str2)));
    }

    @Override // com.max.hbsearch.y0
    public void Z4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43022, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Bundle arguments = getArguments();
        f0.m(arguments);
        String string = arguments.getString(com.max.xiaoheihe.module.search.b.f91614a.b());
        if (string == null) {
            string = "1";
        }
        this.N = string;
        com.max.xiaoheihe.module.game.adapter.u uVar = new com.max.xiaoheihe.module.game.adapter.u(this.mContext, this.I, this.K, null);
        SearchHelper searchHelperA = SearchHelper.f91573a.a();
        Activity mContext = this.mContext;
        f0.o(mContext, "mContext");
        this.L = searchHelperA.b(mContext, uVar);
    }

    @Override // com.max.hbsearch.y0
    public void a5() {
    }

    @Override // com.max.hbsearch.y0
    public void h5(@dl.d String q10, @dl.e String str) {
        if (PatchProxy.proxy(new Object[]{q10, str}, this, changeQuickRedirect, false, 43024, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(q10, "q");
        U5(q10, this.N);
    }

    @Override // com.max.hbsearch.k
    public int i4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43025, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        Bundle arguments = getArguments();
        f0.m(arguments);
        String string = arguments.getString(com.max.xiaoheihe.module.search.b.f91614a.b());
        if (f0.g(string, Q)) {
            return 31;
        }
        if (f0.g(string, R)) {
            return 33;
        }
        return f0.g(string, S) ? 32 : 31;
    }

    @Override // com.max.hbsearch.y0
    public void j5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43023, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        RecyclerView recyclerViewP4 = P4();
        t tVar = this.L;
        if (tVar == null) {
            f0.S("mGameListAdapter");
            tVar = null;
        }
        recyclerViewP4.setAdapter(tVar);
    }

    @Override // com.max.hbsearch.y0, com.max.hbsearch.k
    public void m4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43026, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E5(true);
        N4().setVisibility(8);
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43029, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.K.f();
        super.onDestroyView();
    }
}
