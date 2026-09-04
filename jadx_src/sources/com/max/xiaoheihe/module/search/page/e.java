package com.max.xiaoheihe.module.search.page;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.o;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.base.adapter.t;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.component.FilterButtonView;
import com.max.hbsearch.bean.SearchHotwordObj;
import com.max.hbsearch.bean.SearchHotwordsObj;
import com.max.hbsearch.l;
import com.max.hbsearch.y0;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GameListObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.module.game.a2;
import com.max.xiaoheihe.module.search.SearchHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: SearchGameFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class e extends y0 {

    @dl.d
    public static final a M = new a(null);
    public static final int N = 8;
    public static ChangeQuickRedirect changeQuickRedirect;
    private t J;

    @dl.e
    private KeyDescObj L;

    @dl.d
    private final ArrayList<GameObj> I = new ArrayList<>();

    @dl.d
    private final a2 K = new a2();

    /* JADX INFO: compiled from: SearchGameFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final Bundle a(boolean z10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 43009, new Class[]{Boolean.TYPE}, Bundle.class);
            if (patchProxyResultProxy.isSupported) {
                return (Bundle) patchProxyResultProxy.result;
            }
            Bundle bundle = new Bundle();
            com.max.xiaoheihe.module.search.b bVar = com.max.xiaoheihe.module.search.b.f91614a;
            bundle.putBoolean(bVar.f(), z10);
            bundle.putInt(bVar.e(), 1);
            return bundle;
        }
    }

    /* JADX INFO: compiled from: SearchGameFragment.kt */
    public static final class b extends com.max.xiaoheihe.module.game.adapter.u {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: SearchGameFragment.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f91649b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ e f91650c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ GameObj f91651d;

            a(View view, e eVar, GameObj gameObj) {
                this.f91649b = view;
                this.f91650c = eVar;
                this.f91651d = gameObj;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x00c1  */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z10 = true;
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 43012, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                this.f91649b.setBackgroundDrawable(((com.max.hbcommon.base.d) this.f91650c).mContext.getResources().getDrawable(R.drawable.white_bg_divider_stroke_2dp));
                Bitmap bitmapM = com.max.hbimage.b.m(this.f91649b, this.f91649b.getWidth(), this.f91649b.getHeight(), ViewUtils.f(((com.max.hbcommon.base.d) this.f91650c).mContext, 2.0f), false);
                if (bitmapM != null) {
                    try {
                        String str = this.f91651d.getAppid() + com.max.mediaselector.lib.config.f.f75141t;
                        File cacheDir = ((com.max.hbcommon.base.d) this.f91650c).mContext.getCacheDir();
                        if (cacheDir != null) {
                            File file = new File(cacheDir, str);
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            bitmapM.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                            fileOutputStream.close();
                            String path = file.getPath();
                            if (!bitmapM.isRecycled()) {
                                bitmapM.recycle();
                            }
                            Intent intent = new Intent();
                            intent.putExtra(l.B, this.f91651d);
                            intent.putExtra(l.C, path);
                            ((com.max.hbcommon.base.d) this.f91650c).mContext.setResult(-1, intent);
                            ((com.max.hbcommon.base.d) this.f91650c).mContext.finish();
                        } else {
                            z10 = false;
                        }
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                } else {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
                com.max.hbutils.utils.c.f(this.f91650c.getString(R.string.fail));
            }
        }

        b(Activity activity, ArrayList<GameObj> arrayList, a2 a2Var) {
            super(activity, arrayList, a2Var, null);
        }

        @Override // com.max.xiaoheihe.module.game.adapter.u, com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, Object obj) {
            if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 43011, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            t(eVar, (GameObj) obj);
        }

        @Override // com.max.xiaoheihe.module.game.adapter.u
        public void t(@dl.d s.e viewHolder, @dl.d GameObj data) {
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 43010, new Class[]{s.e.class, GameObj.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            f0.p(data, "data");
            super.t(viewHolder, data);
            if (e.P5(e.this)) {
                View viewB = viewHolder.b();
                a aVar = new a(viewB, e.this, data);
                viewB.setOnClickListener(aVar);
                View viewI = viewHolder.i(R.id.giv);
                if (viewI != null) {
                    viewI.setOnClickListener(aVar);
                }
            }
        }
    }

    /* JADX INFO: compiled from: SearchGameFragment.kt */
    public static final class c implements TabLayout.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(@dl.d TabLayout.h tab) {
            if (PatchProxy.proxy(new Object[]{tab}, this, changeQuickRedirect, false, 43013, new Class[]{TabLayout.h.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(tab, "tab");
            if (tab.k() == 0) {
                e eVar = e.this;
                e.S5(eVar, eVar.U3());
            } else if (tab.k() == 1) {
                e eVar2 = e.this;
                e.S5(eVar2, eVar2.X3());
            } else if (tab.k() == 2) {
                e eVar3 = e.this;
                e.S5(eVar3, eVar3.V3());
            } else if (tab.k() == 3) {
                e eVar4 = e.this;
                e.S5(eVar4, eVar4.W3());
            }
            e eVar5 = e.this;
            eVar5.P3(e.Q5(eVar5), 0, e.N5(e.this));
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(@dl.d TabLayout.h tab) {
            if (PatchProxy.proxy(new Object[]{tab}, this, changeQuickRedirect, false, 43014, new Class[]{TabLayout.h.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(tab, "tab");
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(@dl.d TabLayout.h tab) {
            if (PatchProxy.proxy(new Object[]{tab}, this, changeQuickRedirect, false, 43015, new Class[]{TabLayout.h.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(tab, "tab");
        }
    }

    /* JADX INFO: compiled from: SearchGameFragment.kt */
    public static final class d extends com.max.hbcommon.network.d<Result<GameListObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f91653b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ e f91654c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f91655d;

        d(String str, e eVar, String str2) {
            this.f91653b = str;
            this.f91654c = eVar;
            this.f91655d = str2;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43017, new Class[0], Void.TYPE).isSupported && f0.g(this.f91653b, e.Q5(this.f91654c)) && this.f91654c.isActive()) {
                super.onComplete();
                e.K5(this.f91654c, this.f91653b);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 43016, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (f0.g(this.f91653b, e.Q5(this.f91654c)) && this.f91654c.isActive()) {
                super.onError(e10);
                e.K5(this.f91654c, this.f91653b);
            }
        }

        /* JADX WARN: Code duplicated, block: B:23:0x009e  */
        public void onNext(@dl.d Result<GameListObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 43018, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (f0.g(this.f91653b, e.Q5(this.f91654c)) && this.f91654c.isActive()) {
                if (result.getResult() != null) {
                    GameListObj result2 = result.getResult();
                    f0.m(result2);
                    if (result2.getGames() != null) {
                        if (e.O5(this.f91654c) == 0) {
                            this.f91654c.I.clear();
                        }
                        ArrayList arrayList = this.f91654c.I;
                        GameListObj result3 = result.getResult();
                        f0.m(result3);
                        arrayList.addAll(result3.getGames());
                    }
                }
                if (result.getResult() != null) {
                    GameListObj result4 = result.getResult();
                    f0.m(result4);
                    if (result4.getGame_tag_info() != null) {
                        e eVar = this.f91654c;
                        GameListObj result5 = result.getResult();
                        f0.m(result5);
                        eVar.L = result5.getGame_tag_info();
                    } else {
                        this.f91654c.L = null;
                    }
                } else {
                    this.f91654c.L = null;
                }
                e.R5(this.f91654c, this.f91655d);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 43019, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<GameListObj>) obj);
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.search.page.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SearchGameFragment.kt */
    public static final class C0855e extends RecyclerView.ItemDecoration {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private Paint f91656b = new Paint(5);

        C0855e() {
        }

        @dl.d
        public final Paint a() {
            return this.f91656b;
        }

        public final void b(@dl.d Paint paint) {
            if (PatchProxy.proxy(new Object[]{paint}, this, changeQuickRedirect, false, 43020, new Class[]{Paint.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(paint, "<set-?>");
            this.f91656b = paint;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void onDraw(@dl.d Canvas c10, @dl.d RecyclerView parent, @dl.d RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{c10, parent, state}, this, changeQuickRedirect, false, 43021, new Class[]{Canvas.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(c10, "c");
            f0.p(parent, "parent");
            f0.p(state, "state");
            int childCount = parent.getChildCount();
            this.f91656b.setColor(e.this.getResources().getColor(R.color.white));
            if (childCount > 0) {
                c10.drawRect(parent.getLeft(), parent.getChildAt(0).getTop(), parent.getRight(), parent.getChildAt(childCount - 1).getBottom(), this.f91656b);
            }
        }
    }

    public static final /* synthetic */ void K5(e eVar, String str) {
        if (PatchProxy.proxy(new Object[]{eVar, str}, null, changeQuickRedirect, true, 43006, new Class[]{e.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        eVar.Q3(str);
    }

    public static final /* synthetic */ int N5(e eVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{eVar}, null, changeQuickRedirect, true, 43004, new Class[]{e.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : eVar.a4();
    }

    public static final /* synthetic */ int O5(e eVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{eVar}, null, changeQuickRedirect, true, 43007, new Class[]{e.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : eVar.c4();
    }

    public static final /* synthetic */ boolean P5(e eVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{eVar}, null, changeQuickRedirect, true, 43005, new Class[]{e.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : eVar.O4();
    }

    public static final /* synthetic */ String Q5(e eVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{eVar}, null, changeQuickRedirect, true, 43003, new Class[]{e.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : eVar.d4();
    }

    public static final /* synthetic */ void R5(e eVar, String str) {
        if (PatchProxy.proxy(new Object[]{eVar, str}, null, changeQuickRedirect, true, 43008, new Class[]{e.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        eVar.U5(str);
    }

    public static final /* synthetic */ void S5(e eVar, String str) {
        if (PatchProxy.proxy(new Object[]{eVar, str}, null, changeQuickRedirect, true, 43002, new Class[]{e.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        eVar.l5(str);
    }

    private final void U5(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 42997, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        t tVar = null;
        if (this.L != null) {
            t tVar2 = this.J;
            if (tVar2 == null) {
                f0.S("mGameListAdapter");
                tVar2 = null;
            }
            if (!tVar2.H(R.layout.item_game_search_taginfo, this.L)) {
                View viewInflate = this.mInflater.inflate(R.layout.item_game_search_taginfo, (ViewGroup) P4(), false);
                f0.o(viewInflate, "mInflater.inflate(R.layo…fo, mRecyclerView, false)");
                t tVar3 = this.J;
                if (tVar3 == null) {
                    f0.S("mGameListAdapter");
                    tVar3 = null;
                }
                tVar3.r(R.layout.item_game_search_taginfo, viewInflate, this.L, 0);
            }
        } else {
            t tVar4 = this.J;
            if (tVar4 == null) {
                f0.S("mGameListAdapter");
                tVar4 = null;
            }
            tVar4.F(R.layout.item_game_search_taginfo);
        }
        t tVar5 = this.J;
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

    private final void V5(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 42996, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().e6(str, str2, c4(), a4()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d(str, this, str2)));
    }

    @Override // com.max.hbsearch.y0
    public void H5() {
    }

    @Override // com.max.hbsearch.y0, com.max.hbsearch.k
    @dl.e
    public List<SearchHotwordObj> Z3() {
        SearchHotwordsObj searchHotwordsObj;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42999, new Class[0], List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        if (O4() || (searchHotwordsObj = com.max.hbsearch.o.f72358b) == null) {
            return null;
        }
        return searchHotwordsObj.getList();
    }

    @Override // com.max.hbsearch.y0
    public void Z4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42993, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        b bVar = new b(this.mContext, this.I, this.K);
        SearchHelper searchHelperA = SearchHelper.f91573a.a();
        Activity mContext = this.mContext;
        f0.o(mContext, "mContext");
        this.J = searchHelperA.b(mContext, bVar);
    }

    @Override // com.max.hbsearch.y0
    public void a5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42992, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View viewFindViewById = X4().findViewById(R.id.fbv_sort);
        f0.n(viewFindViewById, "null cannot be cast to non-null type com.max.hbcommon.component.FilterButtonView");
        t5((FilterButtonView) viewFindViewById);
        View viewFindViewById2 = X4().findViewById(R.id.tl_sort_type);
        f0.n(viewFindViewById2, "null cannot be cast to non-null type com.google.android.material.tabs.TabLayout");
        TabLayout tabLayout = (TabLayout) viewFindViewById2;
        tabLayout.i(tabLayout.I().D(getString(R.string.all)));
        tabLayout.i(tabLayout.I().D(getString(R.string.f76256pc)));
        tabLayout.i(tabLayout.I().D(getString(R.string.console)));
        tabLayout.i(tabLayout.I().D(getString(R.string.mobile_games)));
        l5(U3());
        tabLayout.h(new c());
    }

    @Override // com.max.hbsearch.y0
    public void h5(@dl.d String q10, @dl.e String str) {
        if (PatchProxy.proxy(new Object[]{q10, str}, this, changeQuickRedirect, false, 42995, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(q10, "q");
        String strK4 = K4();
        f0.m(strK4);
        V5(q10, strK4);
    }

    @Override // com.max.hbsearch.k
    public int i4() {
        return 1;
    }

    @Override // com.max.hbsearch.y0, com.max.hbsearch.k
    @dl.d
    public String j4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43000, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        Bundle arguments = getArguments();
        f0.m(arguments);
        if (arguments.getBoolean(com.max.xiaoheihe.module.search.b.f91614a.f(), false)) {
            return "搜索游戏名添加游戏卡片";
        }
        String strN0 = com.max.xiaoheihe.utils.d.n0(R.string.hint_search_game_name);
        f0.o(strN0, "getString(R.string.hint_search_game_name)");
        return strN0;
    }

    @Override // com.max.hbsearch.y0
    public void j5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42994, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        t tVar = this.J;
        t tVar2 = null;
        if (tVar == null) {
            f0.S("mGameListAdapter");
            tVar = null;
        }
        tVar.p(R.layout.item_search_filter_header, X4());
        RecyclerView recyclerViewP4 = P4();
        t tVar3 = this.J;
        if (tVar3 == null) {
            f0.S("mGameListAdapter");
        } else {
            tVar2 = tVar3;
        }
        recyclerViewP4.setAdapter(tVar2);
        P4().addItemDecoration(new C0855e());
    }

    @Override // com.max.hbsearch.y0, com.max.hbsearch.k
    public void m4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42998, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E5(true);
        N4().setVisibility(8);
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43001, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.K.f();
        super.onDestroyView();
    }
}
