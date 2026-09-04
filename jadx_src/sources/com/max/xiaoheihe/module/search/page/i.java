package com.max.xiaoheihe.module.search.page;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.base.adapter.t;
import com.max.hbsearch.l;
import com.max.hbsearch.y0;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.pubg.PUBGFamousPlayerObj;
import com.max.xiaoheihe.bean.game.pubg.PUBGFamousResultObj;
import com.max.xiaoheihe.bean.game.pubg.PUBGPlayerObj;
import com.max.xiaoheihe.bean.game.pubg.PUBGSearchObj;
import com.max.xiaoheihe.module.game.pubg.PUBGPlayerOverViewActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SearchPubgPlayerFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class i extends y0 {
    public static final int O = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.d
    private final ArrayList<PUBGFamousPlayerObj> I = new ArrayList<>();

    @dl.d
    private final ArrayList<PUBGPlayerObj> J = new ArrayList<>();

    @dl.e
    private t K;

    @dl.e
    private t L;
    private View M;
    private View N;

    /* JADX INFO: compiled from: SearchPubgPlayerFragment.kt */
    public static final class a extends com.max.hbcommon.network.d<Result<PUBGFamousResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43115, new Class[0], Void.TYPE).isSupported && i.this.isActive()) {
                super.onComplete();
                i.K5(i.this, null);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 43114, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (i.this.isActive()) {
                super.onError(e10);
                i.K5(i.this, null);
            }
        }

        public void onNext(@dl.d Result<PUBGFamousResultObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 43116, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (i.this.isActive()) {
                super.onNext(result);
                if (result.getResult() != null) {
                    PUBGFamousResultObj result2 = result.getResult();
                    f0.m(result2);
                    if (result2.getPlayer_list() != null) {
                        if (i.M5(i.this) == 0) {
                            i.this.I.clear();
                        }
                        ArrayList arrayList = i.this.I;
                        PUBGFamousResultObj result3 = result.getResult();
                        f0.m(result3);
                        arrayList.addAll(result3.getPlayer_list());
                    }
                }
                i.Q5(i.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 43117, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<PUBGFamousResultObj>) obj);
        }
    }

    /* JADX INFO: compiled from: SearchPubgPlayerFragment.kt */
    public static final class b extends s<PUBGFamousPlayerObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: SearchPubgPlayerFragment.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ PUBGFamousPlayerObj f91677b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ i f91678c;

            a(PUBGFamousPlayerObj pUBGFamousPlayerObj, i iVar) {
                this.f91677b = pUBGFamousPlayerObj;
                this.f91678c = iVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 43120, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                String nickName = this.f91677b.getNickName();
                if (TextUtils.isEmpty(nickName)) {
                    nickName = this.f91677b.getReal_name();
                }
                PUBGPlayerOverViewActivity.N1(((com.max.hbcommon.base.d) this.f91678c).mContext, this.f91677b.getNickName(), this.f91677b.getReal_name(), null, nickName);
            }
        }

        b(Activity activity, ArrayList<PUBGFamousPlayerObj> arrayList) {
            super(activity, arrayList, R.layout.item_pubg_famous_player);
        }

        public void m(@dl.d s.e viewHolder, @dl.d PUBGFamousPlayerObj data) {
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 43118, new Class[]{s.e.class, PUBGFamousPlayerObj.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            f0.p(data, "data");
            ImageView imageView = (ImageView) viewHolder.i(R.id.iv_avatar);
            ImageView imageView2 = (ImageView) viewHolder.i(R.id.iv_rating_img);
            if (com.max.hbcommon.utils.c.u(data.getRating_img())) {
                imageView2.setVisibility(4);
            } else {
                imageView2.setVisibility(0);
                com.max.hbimage.b.K(data.getRating_img(), imageView2);
            }
            com.max.hbimage.b.e0(data.getAvatar(), imageView, ViewUtils.f(((com.max.hbcommon.base.d) i.this).mContext, 2.0f), -1);
            viewHolder.p(R.id.tv_name, data.getName());
            viewHolder.p(R.id.tv_rate, data.getRating());
            viewHolder.itemView.setOnClickListener(new a(data, i.this));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, PUBGFamousPlayerObj pUBGFamousPlayerObj) {
            if (PatchProxy.proxy(new Object[]{eVar, pUBGFamousPlayerObj}, this, changeQuickRedirect, false, 43119, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, pUBGFamousPlayerObj);
        }
    }

    /* JADX INFO: compiled from: SearchPubgPlayerFragment.kt */
    public static final class c extends s<PUBGPlayerObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: SearchPubgPlayerFragment.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ i f91680b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ PUBGPlayerObj f91681c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Ref.ObjectRef<String> f91682d;

            a(i iVar, PUBGPlayerObj pUBGPlayerObj, Ref.ObjectRef<String> objectRef) {
                this.f91680b = iVar;
                this.f91681c = pUBGPlayerObj;
                this.f91682d = objectRef;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 43123, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                PUBGPlayerOverViewActivity.N1(((com.max.hbcommon.base.d) this.f91680b).mContext, this.f91681c.getNickname(), this.f91681c.getReal_name(), null, this.f91682d.f124891b);
            }
        }

        c(Activity activity, ArrayList<PUBGPlayerObj> arrayList) {
            super(activity, arrayList, R.layout.item_pubg_player_search);
        }

        /* JADX WARN: Type inference failed for: r0v12, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v16, types: [T, java.lang.String] */
        public void m(@dl.d s.e viewHolder, @dl.d PUBGPlayerObj data) {
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 43121, new Class[]{s.e.class, PUBGPlayerObj.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            f0.p(data, "data");
            ImageView imageView = (ImageView) viewHolder.i(R.id.iv_avatar);
            ImageView imageView2 = (ImageView) viewHolder.i(R.id.iv_rating_img);
            if (com.max.hbcommon.utils.c.u(data.getRating_img())) {
                imageView2.setVisibility(4);
            } else {
                imageView2.setVisibility(0);
                com.max.hbimage.b.K(data.getRating_img(), imageView2);
            }
            com.max.hbimage.b.e0(data.getAvatar(), imageView, ViewUtils.f(((com.max.hbcommon.base.d) i.this).mContext, 2.0f), -1);
            viewHolder.p(R.id.tv_name, data.getNickname());
            viewHolder.p(R.id.tv_rate, data.getRating());
            ?? nickname = data.getNickname();
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.f124891b = nickname;
            if (TextUtils.isEmpty((CharSequence) nickname)) {
                objectRef.f124891b = data.getReal_name();
            }
            viewHolder.itemView.setOnClickListener(new a(i.this, data, objectRef));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, PUBGPlayerObj pUBGPlayerObj) {
            if (PatchProxy.proxy(new Object[]{eVar, pUBGPlayerObj}, this, changeQuickRedirect, false, 43122, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, pUBGPlayerObj);
        }
    }

    /* JADX INFO: compiled from: SearchPubgPlayerFragment.kt */
    public static final class d extends com.max.hbcommon.network.d<Result<PUBGSearchObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f91683b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ i f91684c;

        d(String str, i iVar) {
            this.f91683b = str;
            this.f91684c = iVar;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43125, new Class[0], Void.TYPE).isSupported && f0.g(this.f91683b, i.P5(this.f91684c)) && this.f91684c.isActive()) {
                super.onComplete();
                i.K5(this.f91684c, this.f91683b);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 43124, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (f0.g(this.f91683b, i.P5(this.f91684c)) && this.f91684c.isActive()) {
                super.onError(e10);
                i.K5(this.f91684c, this.f91683b);
            }
        }

        public void onNext(@dl.d Result<PUBGSearchObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 43126, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (f0.g(this.f91683b, i.P5(this.f91684c)) && this.f91684c.isActive()) {
                super.onNext(result);
                if (result.getResult() != null) {
                    PUBGSearchObj result2 = result.getResult();
                    f0.m(result2);
                    if (result2.getPlayers() != null) {
                        this.f91684c.J.clear();
                        ArrayList arrayList = this.f91684c.J;
                        PUBGSearchObj result3 = result.getResult();
                        f0.m(result3);
                        arrayList.addAll(result3.getPlayers());
                    }
                }
                i.R5(this.f91684c);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 43127, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<PUBGSearchObj>) obj);
        }
    }

    public static final /* synthetic */ void K5(i iVar, String str) {
        if (PatchProxy.proxy(new Object[]{iVar, str}, null, changeQuickRedirect, true, 43110, new Class[]{i.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        iVar.Q3(str);
    }

    public static final /* synthetic */ int M5(i iVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{iVar}, null, changeQuickRedirect, true, 43112, new Class[]{i.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : iVar.c4();
    }

    public static final /* synthetic */ String P5(i iVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{iVar}, null, changeQuickRedirect, true, 43109, new Class[]{i.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : iVar.d4();
    }

    public static final /* synthetic */ void Q5(i iVar) {
        if (PatchProxy.proxy(new Object[]{iVar}, null, changeQuickRedirect, true, 43113, new Class[]{i.class}, Void.TYPE).isSupported) {
            return;
        }
        iVar.T5();
    }

    public static final /* synthetic */ void R5(i iVar) {
        if (PatchProxy.proxy(new Object[]{iVar}, null, changeQuickRedirect, true, 43111, new Class[]{i.class}, Void.TYPE).isSupported) {
            return;
        }
        iVar.U5();
    }

    private final void S5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43106, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().P0(c4(), a4()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new a()));
    }

    private final void T5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43107, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        t tVar = this.K;
        f0.m(tVar);
        tVar.notifyDataSetChanged();
    }

    private final void U5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43105, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        t tVar = this.L;
        f0.m(tVar);
        tVar.notifyDataSetChanged();
        if (this.J.isEmpty()) {
            y4();
            return;
        }
        P4().setAdapter(this.L);
        E5(true);
        N4().setVisibility(8);
    }

    private final void V5(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 43104, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().q8(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d(str, this)));
    }

    @Override // com.max.hbsearch.y0
    public void H5() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43101, new Class[0], Void.TYPE).isSupported && com.max.hbcommon.utils.c.u(d4())) {
            k4();
            S5();
        }
    }

    @Override // com.max.hbsearch.y0
    public void Z4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43100, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.K = new t(new b(this.mContext, this.I));
        this.L = new t(new c(this.mContext, this.J));
    }

    @Override // com.max.hbsearch.y0
    public void a5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43098, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View viewInflate = this.mInflater.inflate(R.layout.layout_pubg_search_famous_header, (ViewGroup) P4(), false);
        f0.o(viewInflate, "mInflater.inflate(R.layo…er, mRecyclerView, false)");
        this.M = viewInflate;
        View viewInflate2 = this.mInflater.inflate(R.layout.layout_pubg_search_player_header, (ViewGroup) P4(), false);
        f0.o(viewInflate2, "mInflater.inflate(R.layo…er, mRecyclerView, false)");
        this.N = viewInflate2;
    }

    @Override // com.max.hbsearch.y0
    public void e5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43102, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        t tVar = this.K;
        f0.m(tVar);
        tVar.notifyDataSetChanged();
        P4().setAdapter(this.K);
        E5(true);
    }

    @Override // com.max.hbsearch.y0
    public void h5(@dl.d String q10, @dl.e String str) {
        if (PatchProxy.proxy(new Object[]{q10, str}, this, changeQuickRedirect, false, 43103, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(q10, "q");
        V5(q10);
    }

    @Override // com.max.hbsearch.k
    public int i4() {
        return 7;
    }

    @Override // com.max.hbsearch.y0, com.max.hbsearch.k
    @dl.d
    public String j4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43108, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String strN0 = com.max.xiaoheihe.utils.d.n0(R.string.search_game_role_nickname);
        f0.o(strN0, "getString(R.string.search_game_role_nickname)");
        return strN0;
    }

    @Override // com.max.hbsearch.y0
    public void j5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43099, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        u4(l.F);
        View viewInflate = this.mInflater.inflate(R.layout.item_all_search_history, (ViewGroup) P4(), false);
        f0.n(viewInflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        v4((LinearLayout) viewInflate);
        t tVar = this.K;
        f0.m(tVar);
        tVar.p(R.layout.item_all_search_history, g4());
        t tVar2 = this.K;
        f0.m(tVar2);
        View view = this.M;
        View view2 = null;
        if (view == null) {
            f0.S("pubgFamousPlayerListHeader");
            view = null;
        }
        tVar2.p(R.layout.layout_pubg_search_famous_header, view);
        t tVar3 = this.L;
        f0.m(tVar3);
        View view3 = this.N;
        if (view3 == null) {
            f0.S("pubgSearchPlayerListHeader");
        } else {
            view2 = view3;
        }
        tVar3.p(R.layout.layout_pubg_search_player_header, view2);
        P4().setAdapter(this.K);
    }
}
