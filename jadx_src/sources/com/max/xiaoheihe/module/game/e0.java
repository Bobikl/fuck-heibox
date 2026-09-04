package com.max.xiaoheihe.module.game;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.JsonObject;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.component.HeyBoxPopupMenu;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GameGlobalPricesObj;
import com.max.xiaoheihe.bean.game.GlobalRegionPriceObj;
import com.max.xiaoheihe.module.game.adapter.GameGlobalPriceV3Adapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.d9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: GameGlobalPricesV3Fragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class e0 extends com.max.hbcommon.base.swipeback.a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f87375p = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public d9 f87376j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.e
    private String f87377k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.e
    private String f87378l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.e
    private String f87379m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private final List<GlobalRegionPriceObj> f87380n = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.e
    private GameGlobalPriceV3Adapter f87381o;

    /* JADX INFO: compiled from: GameGlobalPricesV3Fragment.kt */
    public static final class a extends com.max.hbcommon.network.d<Result<GameGlobalPricesObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.e0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: GameGlobalPricesV3Fragment.kt */
        public static final class ViewOnClickListenerC0790a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ e0 f87383b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Result<GameGlobalPricesObj> f87384c;

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.e0$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: GameGlobalPricesV3Fragment.kt */
            public static final class C0791a implements HeyBoxPopupMenu.h {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ e0 f87385a;

                C0791a(e0 e0Var) {
                    this.f87385a = e0Var;
                }

                @Override // com.max.hbcommon.component.HeyBoxPopupMenu.h
                public final void a(View view, KeyDescObj keyDescObj) {
                    if (PatchProxy.proxy(new Object[]{view, keyDescObj}, this, changeQuickRedirect, false, 33177, new Class[]{View.class, KeyDescObj.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    this.f87385a.f87379m = keyDescObj.getKey();
                    this.f87385a.b4().f109695f.setText(keyDescObj.getDesc());
                    e0.W3(this.f87385a);
                }
            }

            ViewOnClickListenerC0790a(e0 e0Var, Result<GameGlobalPricesObj> result) {
                this.f87383b = e0Var;
                this.f87384c = result;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33176, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("app_id", this.f87383b.f87377k);
                com.max.hbcommon.analytics.d.e("4", lb.d.f131264u3, null, null, jsonObject, null, true);
                Context context = this.f87383b.getContext();
                kotlin.jvm.internal.f0.m(context);
                GameGlobalPricesObj result = this.f87384c.getResult();
                ArrayList<KeyDescObj> versions = result != null ? result.getVersions() : null;
                kotlin.jvm.internal.f0.m(versions);
                HeyBoxPopupMenu heyBoxPopupMenu = new HeyBoxPopupMenu(context, versions, true);
                heyBoxPopupMenu.R(new C0791a(this.f87383b));
                heyBoxPopupMenu.show();
            }
        }

        a() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 33173, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (e0.this.isActive()) {
                super.onError(e10);
            }
        }

        public void onNext(@dl.d Result<GameGlobalPricesObj> listResult) {
            boolean z10;
            ArrayList<KeyDescObj> versions;
            boolean z11;
            if (PatchProxy.proxy(new Object[]{listResult}, this, changeQuickRedirect, false, 33174, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(listResult, "listResult");
            if (e0.this.isActive()) {
                super.onNext(listResult);
                if (listResult.getResult() != null) {
                    GameGlobalPricesObj result = listResult.getResult();
                    kotlin.jvm.internal.f0.m(result);
                    List<GlobalRegionPriceObj> prices = result.getPrices();
                    if ((prices != null ? prices.size() : 0) > 0) {
                        GameGlobalPriceV3Adapter gameGlobalPriceV3Adapter = e0.this.f87381o;
                        if (gameGlobalPriceV3Adapter != null) {
                            gameGlobalPriceV3Adapter.J();
                        }
                        GameGlobalPricesObj result2 = listResult.getResult();
                        kotlin.jvm.internal.f0.m(result2);
                        for (GlobalRegionPriceObj globalRegionPriceObj : result2.getPrices()) {
                            globalRegionPriceObj.setExpand(false);
                            globalRegionPriceObj.setPrice_history_result(null);
                        }
                        e0.this.f87380n.clear();
                        List list = e0.this.f87380n;
                        GameGlobalPricesObj result3 = listResult.getResult();
                        kotlin.jvm.internal.f0.m(result3);
                        List<GlobalRegionPriceObj> prices2 = result3.getPrices();
                        kotlin.jvm.internal.f0.o(prices2, "listResult.result!!.prices");
                        list.addAll(prices2);
                        Iterator it = e0.this.f87380n.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (com.max.hbutils.utils.n.p(((GlobalRegionPriceObj) it.next()).getDiscount()) > 0.0f) {
                                    z11 = true;
                                    break;
                                }
                            } else {
                                z11 = false;
                                break;
                            }
                        }
                        e0.this.b4().f109693d.setVisibility(z11 ? 0 : 8);
                        GameGlobalPriceV3Adapter gameGlobalPriceV3Adapter2 = e0.this.f87381o;
                        if (gameGlobalPriceV3Adapter2 != null) {
                            gameGlobalPriceV3Adapter2.notifyDataSetChanged();
                        }
                    }
                    GameGlobalPricesObj result4 = listResult.getResult();
                    if (((result4 == null || (versions = result4.getVersions()) == null) ? 0 : versions.size()) <= 1) {
                        e0.this.b4().f109696g.setVisibility(8);
                        return;
                    }
                    e0.this.b4().f109696g.setVisibility(0);
                    GameGlobalPricesObj result5 = listResult.getResult();
                    ArrayList<KeyDescObj> versions2 = result5 != null ? result5.getVersions() : null;
                    kotlin.jvm.internal.f0.m(versions2);
                    Iterator<KeyDescObj> it2 = versions2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            z10 = false;
                            break;
                        }
                        KeyDescObj next = it2.next();
                        if (next.isChecked()) {
                            e0.this.b4().f109695f.setText(next.getDesc());
                            z10 = true;
                            break;
                        }
                    }
                    if (!z10) {
                        GameGlobalPricesObj result6 = listResult.getResult();
                        ArrayList<KeyDescObj> versions3 = result6 != null ? result6.getVersions() : null;
                        kotlin.jvm.internal.f0.m(versions3);
                        versions3.get(0).setChecked(true);
                    }
                    e0.this.b4().f109696g.setOnClickListener(new ViewOnClickListenerC0790a(e0.this, listResult));
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 33175, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<GameGlobalPricesObj>) obj);
        }
    }

    /* JADX INFO: compiled from: GameGlobalPricesV3Fragment.kt */
    public static final class b implements GameGlobalPriceV3Adapter.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.xiaoheihe.module.game.adapter.GameGlobalPriceV3Adapter.a
        @dl.e
        public String a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33178, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : e0.this.f87379m;
        }
    }

    public static final /* synthetic */ void W3(e0 e0Var) {
        if (PatchProxy.proxy(new Object[]{e0Var}, null, changeQuickRedirect, true, 33172, new Class[]{e0.class}, Void.TYPE).isSupported) {
            return;
        }
        e0Var.c4();
    }

    private final void c4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33171, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Y0(this.f87377k, this.f87378l, this.f87379m).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new a()));
    }

    @dl.d
    public final d9 b4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33167, new Class[0], d9.class);
        if (patchProxyResultProxy.isSupported) {
            return (d9) patchProxyResultProxy.result;
        }
        d9 d9Var = this.f87376j;
        if (d9Var != null) {
            return d9Var;
        }
        kotlin.jvm.internal.f0.S("binding");
        return null;
    }

    public final void d4(@dl.d d9 d9Var) {
        if (PatchProxy.proxy(new Object[]{d9Var}, this, changeQuickRedirect, false, 33168, new Class[]{d9.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(d9Var, "<set-?>");
        this.f87376j = d9Var;
    }

    @Override // androidx.fragment.app.Fragment
    @dl.e
    public View onCreateView(@dl.d LayoutInflater inflater, @dl.e ViewGroup viewGroup, @dl.e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inflater, viewGroup, bundle}, this, changeQuickRedirect, false, 33169, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(inflater, "inflater");
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            kotlin.jvm.internal.f0.m(arguments);
            this.f87377k = arguments.getString(d0.f87248t);
            Bundle arguments2 = getArguments();
            kotlin.jvm.internal.f0.m(arguments2);
            this.f87378l = arguments2.getString("platform");
        }
        d9 d9VarD = d9.d(inflater, viewGroup, false);
        this.f66868d = d9VarD;
        kotlin.jvm.internal.f0.n(d9VarD, "null cannot be cast to non-null type com.max.xiaoheihe.databinding.FragmentGameGlobalPriceV3Binding");
        d4(d9VarD);
        return this.f66868d.getRoot();
    }

    @Override // com.max.hbcommon.base.swipeback.a, com.max.hbcommon.base.c, androidx.fragment.app.Fragment
    public void onViewCreated(@dl.d View view, @dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 33170, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(view, "view");
        super.onViewCreated(view, bundle);
        b4().f109692c.setLayoutManager(new LinearLayoutManager(getContext()));
        Context context = getContext();
        kotlin.jvm.internal.f0.m(context);
        List<GlobalRegionPriceObj> list = this.f87380n;
        String str = this.f87377k;
        String str2 = this.f87378l;
        RecyclerView recyclerView = b4().f109692c;
        kotlin.jvm.internal.f0.o(recyclerView, "binding.rv");
        this.f87381o = new GameGlobalPriceV3Adapter(context, list, str, str2, recyclerView, new b());
        b4().f109692c.setAdapter(this.f87381o);
        b4().f109696g.setBackground(com.max.hbutils.utils.q.o(getContext(), R.color.divider_secondary_1_color, 3.0f));
        this.f66927e.f69555k = b4().f109692c;
        TextView textView = b4().f109695f;
        int iL = ViewUtils.L(getContext());
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.f0.o(contextRequireContext, "requireContext()");
        textView.setMaxWidth(iL - com.max.accelworld.c.c(210, contextRequireContext));
        c4();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("app_id", this.f87377k);
        com.max.hbcommon.analytics.d.e("1", lb.d.f131257t3, null, null, jsonObject, null, true);
    }
}
