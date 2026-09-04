package com.max.xiaoheihe.module.game;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.google.gson.JsonObject;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.component.chart.CustomBarChart;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GameDurationObj;
import com.max.xiaoheihe.bean.game.GamePlayTimeObj;
import com.max.xiaoheihe.bean.game.GameTimeObj;
import com.max.xiaoheihe.module.game.component.GameDurationDataView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.a5;
import java.util.List;

/* JADX INFO: compiled from: GameDurationStatisticsDialogFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class a0 extends com.max.hbcommon.base.swipeback.a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    public static final a f85511n = new a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f85512o = 8;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    public static final String f85513p = "appid";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    public static final String f85514q = "game_data";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.e
    private String f85515j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.e
    private GameDurationObj f85516k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a5 f85517l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f85518m;

    /* JADX INFO: compiled from: GameDurationStatisticsDialogFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.a0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: GameDurationStatisticsDialogFragment.kt */
        public static final class C0761a extends com.max.hbcommon.network.d<Result<GameDurationObj>> {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ com.max.hbcommon.base.f f85519b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f85520c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ FragmentManager f85521d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ LoadingDialog f85522e;

            C0761a(com.max.hbcommon.base.f fVar, String str, FragmentManager fragmentManager, LoadingDialog loadingDialog) {
                this.f85519b = fVar;
                this.f85520c = str;
                this.f85521d = fragmentManager;
                this.f85522e = loadingDialog;
            }

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public void onError(@dl.d Throwable e10) {
                if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 33074, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(e10, "e");
                super.onError(e10);
                this.f85522e.c();
            }

            public void onNext(@dl.d Result<GameDurationObj> result) {
                if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 33073, new Class[]{Result.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(result, "result");
                if (result.getResult() != null && this.f85519b.isActive()) {
                    a aVar = a0.f85511n;
                    String str = this.f85520c;
                    GameDurationObj result2 = result.getResult();
                    kotlin.jvm.internal.f0.m(result2);
                    aVar.a(str, result2).show(this.f85521d, "GameDurationStatisticsDialogFragment");
                }
                this.f85522e.c();
            }

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public /* bridge */ /* synthetic */ void onNext(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 33075, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                onNext((Result<GameDurationObj>) obj);
            }
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        @xh.m
        public final a0 a(@dl.d String appId, @dl.d GameDurationObj data) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{appId, data}, this, changeQuickRedirect, false, 33072, new Class[]{String.class, GameDurationObj.class}, a0.class);
            if (patchProxyResultProxy.isSupported) {
                return (a0) patchProxyResultProxy.result;
            }
            kotlin.jvm.internal.f0.p(appId, "appId");
            kotlin.jvm.internal.f0.p(data, "data");
            a0 a0Var = new a0();
            Bundle bundle = new Bundle();
            bundle.putString("appid", appId);
            bundle.putSerializable("game_data", data);
            a0Var.setArguments(bundle);
            return a0Var;
        }

        @xh.m
        public final void b(@dl.d Context context, @dl.d String appId, @dl.d FragmentManager fragmentManager, @dl.d com.max.hbcommon.base.f baseView) {
            if (PatchProxy.proxy(new Object[]{context, appId, fragmentManager, baseView}, this, changeQuickRedirect, false, 33071, new Class[]{Context.class, String.class, FragmentManager.class, com.max.hbcommon.base.f.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(context, "context");
            kotlin.jvm.internal.f0.p(appId, "appId");
            kotlin.jvm.internal.f0.p(fragmentManager, "fragmentManager");
            kotlin.jvm.internal.f0.p(baseView, "baseView");
            if (baseView.isActive()) {
                com.max.xiaoheihe.network.i.a().p4(appId).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new C0761a(baseView, appId, fragmentManager, new LoadingDialog(context, "").r()));
            }
        }
    }

    /* JADX INFO: compiled from: GameDurationStatisticsDialogFragment.kt */
    @androidx.compose.runtime.internal.o(parameters = 0)
    public static final class b extends com.max.hbcommon.base.adapter.s<KeyDescObj> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f85523b = 0;
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@dl.d Context context, @dl.d List<KeyDescObj> list) {
            super(context, list, R.layout.item_game_duration_data);
            kotlin.jvm.internal.f0.p(context, "context");
            kotlin.jvm.internal.f0.p(list, "list");
        }

        public void m(@dl.e com.max.hbcommon.base.adapter.s.e eVar, @dl.e KeyDescObj keyDescObj) {
            if (PatchProxy.proxy(new Object[]{eVar, keyDescObj}, this, changeQuickRedirect, false, 33076, new Class[]{com.max.hbcommon.base.adapter.s.e.class, KeyDescObj.class}, Void.TYPE).isSupported || eVar == null || keyDescObj == null) {
                return;
            }
            GameDurationDataView gameDurationDataView = (GameDurationDataView) eVar.i(R.id.v_data);
            gameDurationDataView.setData(keyDescObj.getValue());
            gameDurationDataView.setDesc(keyDescObj.getKey());
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, KeyDescObj keyDescObj) {
            if (PatchProxy.proxy(new Object[]{eVar, keyDescObj}, this, changeQuickRedirect, false, 33077, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, keyDescObj);
        }
    }

    /* JADX INFO: compiled from: GameDurationStatisticsDialogFragment.kt */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ GamePlayTimeObj f85524b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a0 f85525c;

        c(GamePlayTimeObj gamePlayTimeObj, a0 a0Var) {
            this.f85524b = gamePlayTimeObj;
            this.f85525c = a0Var;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33078, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            KeyDescObj tips = this.f85524b.getTips();
            if (!com.max.hbcommon.utils.c.u(tips != null ? tips.getProtocol() : null)) {
                Context contextRequireContext = this.f85525c.requireContext();
                kotlin.jvm.internal.f0.o(contextRequireContext, "requireContext()");
                KeyDescObj tips2 = this.f85524b.getTips();
                com.max.xiaoheihe.base.router.b.k0(contextRequireContext, tips2 != null ? tips2.getProtocol() : null);
                return;
            }
            KeyDescObj tips3 = this.f85524b.getTips();
            if (com.max.hbcommon.utils.c.u(tips3 != null ? tips3.getDesc() : null)) {
                return;
            }
            Context contextRequireContext2 = this.f85525c.requireContext();
            ImageView imageView = this.f85525c.W3().f108360c;
            KeyDescObj tips4 = this.f85524b.getTips();
            com.max.xiaoheihe.module.account.utils.l.d0(contextRequireContext2, imageView, tips4 != null ? tips4.getDesc() : null, true, 20, 4, true);
        }
    }

    /* JADX INFO: compiled from: GameDurationStatisticsDialogFragment.kt */
    public static final class d implements IAxisValueFormatter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f85526a = new d();
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.github.mikephil.charting.formatter.IAxisValueFormatter
        public final String getFormattedValue(float f10, AxisBase axisBase) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10), axisBase}, this, changeQuickRedirect, false, 33079, new Class[]{Float.TYPE, AxisBase.class}, String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append((int) f10);
            sb2.append('%');
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: GameDurationStatisticsDialogFragment.kt */
    public static final class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GameTimeObj f85528c;

        e(GameTimeObj gameTimeObj) {
            this.f85528c = gameTimeObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33080, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.utils.d.o(a0.this.requireContext(), this.f85528c.getUrl());
            com.max.hbutils.utils.c.f("已复制本游戏数据来源链接，可在浏览器查看");
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("app_id", a0.this.f85515j);
            com.max.hbcommon.analytics.d.e("4", lb.d.f131299z3, null, null, jsonObject, null, true);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void X3() {
        GameDurationObj gameDurationObj;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33067, new Class[0], Void.TYPE).isSupported || (gameDurationObj = this.f85516k) == null) {
            return;
        }
        GamePlayTimeObj play_time = gameDurationObj.getPlay_time();
        if (play_time != null) {
            W3().f108364g.setText(play_time.getTitle());
            List<KeyDescObj> data = play_time.getData();
            if (data != null) {
                int iMin = Math.min(data.size(), 3);
                if (W3().f108362e.getItemDecorationCount() == 0) {
                    W3().f108362e.addItemDecoration(new fc.b(iMin, ViewUtils.f(getContext(), 6.0f), false));
                }
                W3().f108362e.setLayoutManager(new GridLayoutManager(getContext(), iMin));
                RecyclerView recyclerView = W3().f108362e;
                Context contextRequireContext = requireContext();
                kotlin.jvm.internal.f0.o(contextRequireContext, "requireContext()");
                recyclerView.setAdapter(new b(contextRequireContext, data));
            }
            if (play_time.getTips() == null) {
                W3().f108360c.setVisibility(8);
            } else {
                W3().f108360c.setVisibility(0);
                W3().f108360c.setOnClickListener(new c(play_time, this));
            }
            if (!com.max.hbcommon.utils.c.w(play_time.getTable())) {
                W3().f108359b.setNoDataText("暂无数据");
                List<KeyDescObj> table = play_time.getTable();
                kotlin.jvm.internal.f0.m(table);
                int size = table.size();
                int iQ = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    List<KeyDescObj> table2 = play_time.getTable();
                    kotlin.jvm.internal.f0.m(table2);
                    iQ += com.max.hbutils.utils.n.q(table2.get(i10).getValue());
                }
                List<KeyDescObj> table3 = play_time.getTable();
                kotlin.jvm.internal.f0.m(table3);
                int size2 = table3.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    List<KeyDescObj> table4 = play_time.getTable();
                    kotlin.jvm.internal.f0.m(table4);
                    table4.get(i11);
                    List<KeyDescObj> table5 = play_time.getTable();
                    kotlin.jvm.internal.f0.m(table5);
                    float fP = com.max.hbutils.utils.n.p(table5.get(i11).getValue());
                    List<KeyDescObj> table6 = play_time.getTable();
                    kotlin.jvm.internal.f0.m(table6);
                    table6.get(i11).setValue(String.valueOf(com.max.accelworld.e.a((fP / iQ) * 100.0f)));
                }
                com.max.xiaoheihe.module.account.utils.l.G(requireContext(), play_time.getTable(), W3().f108359b, 0, 10, false);
                CustomBarChart customBarChart = W3().f108359b;
                YAxis axisLeft = customBarChart.getAxisLeft();
                kotlin.jvm.internal.f0.o(axisLeft, "getAxisLeft()");
                List<KeyDescObj> table7 = play_time.getTable();
                kotlin.jvm.internal.f0.m(table7);
                int size3 = table7.size();
                int i12 = 0;
                for (int i13 = 0; i13 < size3; i13++) {
                    List<KeyDescObj> table8 = play_time.getTable();
                    kotlin.jvm.internal.f0.m(table8);
                    int iQ2 = com.max.hbutils.utils.n.q(table8.get(i13).getValue());
                    if (i12 < iQ2) {
                        i12 = iQ2;
                    }
                }
                axisLeft.setAxisMaximum(Math.min(((i12 / 20) + 1) * 20, 100));
                axisLeft.setValueFormatter(d.f85526a);
                Context context = customBarChart.getContext();
                kotlin.jvm.internal.f0.o(context, "context");
                GameDurationStatisticsMarkerView gameDurationStatisticsMarkerView = new GameDurationStatisticsMarkerView(context);
                gameDurationStatisticsMarkerView.setChartView(customBarChart);
                customBarChart.setMarker(gameDurationStatisticsMarkerView);
                customBarChart.notifyDataSetChanged();
                customBarChart.invalidate();
            }
        }
        GameTimeObj game_time = gameDurationObj.getGame_time();
        if (game_time != null) {
            W3().f108365h.setText(game_time.getTitle());
            if (com.max.hbcommon.utils.c.u(game_time.getUrl())) {
                W3().f108367j.setVisibility(8);
            } else {
                W3().f108367j.setVisibility(0);
                W3().f108367j.setOnClickListener(new e(game_time));
            }
            List<KeyDescObj> data2 = game_time.getData();
            if (data2 != null) {
                int iMin2 = Math.min(data2.size(), 3);
                if (W3().f108363f.getItemDecorationCount() == 0) {
                    W3().f108363f.addItemDecoration(new fc.b(iMin2, ViewUtils.f(getContext(), 6.0f), false));
                }
                W3().f108363f.setLayoutManager(new GridLayoutManager(getContext(), iMin2));
                RecyclerView recyclerView2 = W3().f108363f;
                Context contextRequireContext2 = requireContext();
                kotlin.jvm.internal.f0.o(contextRequireContext2, "requireContext()");
                recyclerView2.setAdapter(new b(contextRequireContext2, data2));
            }
        }
    }

    @dl.d
    @xh.m
    public static final a0 Y3(@dl.d String str, @dl.d GameDurationObj gameDurationObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, gameDurationObj}, null, changeQuickRedirect, true, 33070, new Class[]{String.class, GameDurationObj.class}, a0.class);
        return patchProxyResultProxy.isSupported ? (a0) patchProxyResultProxy.result : f85511n.a(str, gameDurationObj);
    }

    @xh.m
    public static final void a4(@dl.d Context context, @dl.d String str, @dl.d FragmentManager fragmentManager, @dl.d com.max.hbcommon.base.f fVar) {
        if (PatchProxy.proxy(new Object[]{context, str, fragmentManager, fVar}, null, changeQuickRedirect, true, 33069, new Class[]{Context.class, String.class, FragmentManager.class, com.max.hbcommon.base.f.class}, Void.TYPE).isSupported) {
            return;
        }
        f85511n.b(context, str, fragmentManager, fVar);
    }

    @dl.d
    public final a5 W3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33063, new Class[0], a5.class);
        if (patchProxyResultProxy.isSupported) {
            return (a5) patchProxyResultProxy.result;
        }
        a5 a5Var = this.f85517l;
        if (a5Var != null) {
            return a5Var;
        }
        kotlin.jvm.internal.f0.S("binding");
        return null;
    }

    public final void Z3(@dl.d a5 a5Var) {
        if (PatchProxy.proxy(new Object[]{a5Var}, this, changeQuickRedirect, false, 33064, new Class[]{a5.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(a5Var, "<set-?>");
        this.f85517l = a5Var;
    }

    @Override // androidx.fragment.app.Fragment
    @dl.e
    public View onCreateView(@dl.d LayoutInflater inflater, @dl.e ViewGroup viewGroup, @dl.e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inflater, viewGroup, bundle}, this, changeQuickRedirect, false, 33065, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(inflater, "inflater");
        this.f85518m = System.currentTimeMillis();
        a5 a5VarC = a5.c(inflater);
        kotlin.jvm.internal.f0.o(a5VarC, "inflate(inflater)");
        Z3(a5VarC);
        return W3().b();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33068, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("app_id", this.f85515j);
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f85518m;
        com.max.hbcommon.analytics.d.e("2", lb.d.f131292y3, String.valueOf(com.max.hbutils.utils.w.a(jCurrentTimeMillis)), String.valueOf(jCurrentTimeMillis), jsonObject, null, true);
    }

    @Override // com.max.hbcommon.base.swipeback.a, com.max.hbcommon.base.c, androidx.fragment.app.Fragment
    public void onViewCreated(@dl.d View view, @dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 33066, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        this.f85515j = arguments != null ? arguments.getString("appid") : null;
        Bundle arguments2 = getArguments();
        this.f85516k = (GameDurationObj) (arguments2 != null ? arguments2.getSerializable("game_data") : null);
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("app_id", this.f85515j);
        com.max.hbcommon.analytics.d.e("1", lb.d.f131292y3, null, null, jsonObject, null, true);
        X3();
    }
}
