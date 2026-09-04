package com.max.xiaoheihe.module.game;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GameLangListObj;
import com.max.xiaoheihe.bean.game.GameLangObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: ConsoleGameLangFragment.java */
/* JADX INFO: loaded from: classes11.dex */
public class h extends com.max.hbcommon.base.c {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f87444j = "app_id";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f87445k = "platform";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f87446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f87447f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ProgressBar f87448g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<GameLangObj> f87449h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.max.hbcommon.base.adapter.s<GameLangObj> f87450i;

    /* JADX INFO: compiled from: ConsoleGameLangFragment.java */
    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32292, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            h.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: ConsoleGameLangFragment.java */
    public class b extends com.max.hbcommon.base.adapter.s<GameLangObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b(Context context, List list, int i10) {
            super(context, list, i10);
        }

        public void m(com.max.hbcommon.base.adapter.s.e eVar, GameLangObj gameLangObj) {
            if (PatchProxy.proxy(new Object[]{eVar, gameLangObj}, this, changeQuickRedirect, false, 32293, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameLangObj.class}, Void.TYPE).isSupported) {
                return;
            }
            ImageView imageView = (ImageView) eVar.i(R.id.cell0);
            ImageView imageView2 = (ImageView) eVar.i(R.id.cell2);
            ImageView imageView3 = (ImageView) eVar.i(R.id.cell3);
            ImageView imageView4 = (ImageView) eVar.i(R.id.cell4);
            com.max.hbimage.b.K(gameLangObj.getImage(), imageView);
            eVar.p(R.id.cell1, gameLangObj.getDesc());
            imageView2.setImageDrawable("1".equals(gameLangObj.getChinese()) ? h.this.getResources().getDrawable(R.drawable.ic_checked_large) : null);
            imageView3.setImageDrawable("1".equals(gameLangObj.getJapanese()) ? h.this.getResources().getDrawable(R.drawable.ic_checked_large) : null);
            imageView4.setImageDrawable("1".equals(gameLangObj.getEnglish()) ? h.this.getResources().getDrawable(R.drawable.ic_checked_large) : null);
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, GameLangObj gameLangObj) {
            if (PatchProxy.proxy(new Object[]{eVar, gameLangObj}, this, changeQuickRedirect, false, 32294, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, gameLangObj);
        }
    }

    /* JADX INFO: compiled from: ConsoleGameLangFragment.java */
    public class c extends com.max.hbcommon.network.d<Result<GameLangListObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 32295, new Class[]{Throwable.class}, Void.TYPE).isSupported && h.this.isActive()) {
                super.onError(th2);
                h.this.f87448g.setVisibility(8);
            }
        }

        public void onNext(Result<GameLangListObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 32296, new Class[]{Result.class}, Void.TYPE).isSupported && h.this.isActive()) {
                super.onNext(result);
                h.this.f87448g.setVisibility(8);
                if (result.getResult() == null || result.getResult().getList() == null) {
                    return;
                }
                h.this.f87449h.clear();
                h.this.f87449h.addAll(result.getResult().getList());
                h.this.f87450i.notifyDataSetChanged();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 32297, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<GameLangListObj>) obj);
        }
    }

    private void Q3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32291, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().L4(this.f87446e, this.f87447f).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
    }

    public static h R3(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, 32287, new Class[]{String.class, String.class}, h.class);
        if (patchProxyResultProxy.isSupported) {
            return (h) patchProxyResultProxy.result;
        }
        h hVar = new h();
        Bundle bundle = new Bundle();
        bundle.putString("app_id", str);
        bundle.putString("platform", str2);
        hVar.setArguments(bundle);
        return hVar;
    }

    @Override // com.max.hbcommon.base.c
    public boolean L3() {
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, bundle}, this, changeQuickRedirect, false, 32288, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        if (getArguments() != null) {
            this.f87446e = getArguments().getString("app_id");
            this.f87447f = getArguments().getString("platform");
        }
        return layoutInflater.inflate(R.layout.fragment_console_game_lang, viewGroup, false);
    }

    @Override // com.max.hbcommon.base.c, androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onStart() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32290, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStart();
        Q3();
    }

    @Override // com.max.hbcommon.base.c, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 32289, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onViewCreated(view, bundle);
        view.setOnClickListener(new a());
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_list);
        this.f87448g = (ProgressBar) view.findViewById(R.id.progress);
        this.f87450i = new b(getContext(), this.f87449h, R.layout.item_console_game_lang);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(this.f87450i);
    }
}
