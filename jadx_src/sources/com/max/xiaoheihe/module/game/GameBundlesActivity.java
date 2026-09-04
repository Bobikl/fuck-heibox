package com.max.xiaoheihe.module.game;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.gson.JsonObject;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.bean.segmentfilter.FilterGroup;
import com.max.hbcommon.bean.segmentfilter.FilterItem;
import com.max.hbcommon.component.FilterButtonView;
import com.max.hbcommon.component.HeyBoxPopupMenu;
import com.max.hbcommon.component.segmentfilters.SecondaryWindowSegmentFilterView;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GameBundleObj;
import com.max.xiaoheihe.bean.game.GameBundlesListObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
@com.max.hbcommon.analytics.m(path = lb.d.f131145d3)
@ig.d(path = {lb.d.f131145d3})
public class GameBundlesActivity extends BaseActivity {
    public static final String V = "filter_query";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String L;
    private com.max.xiaoheihe.module.game.adapter.b N;
    private com.max.xiaoheihe.module.game.adapter.a O;
    private int P;
    private List<FilterGroup> R;

    @BindView(R.id.fbv_filter)
    FilterButtonView fbv_filter;

    @BindView(R.id.rv)
    RecyclerView mRecyclerView;

    @BindView(R.id.srl)
    SmartRefreshLayout mRefreshLayout;

    @BindView(R.id.secondary_filter)
    SecondaryWindowSegmentFilterView secondary_filter;

    @BindView(R.id.vg_header)
    ViewGroup vg_header;
    private List<GameBundleObj> M = new ArrayList();
    private Map<String, String> Q = null;
    private String S = null;
    private Map<String, String> T = null;
    private boolean U = false;

    public class a implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // pg.d
        public void k(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 32492, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            GameBundlesActivity.this.P = 0;
            GameBundlesActivity.O1(GameBundlesActivity.this);
        }
    }

    public class b implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // pg.b
        public void f(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 32493, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            GameBundlesActivity.N1(GameBundlesActivity.this, 30);
            GameBundlesActivity.O1(GameBundlesActivity.this);
        }
    }

    public class c extends com.max.hbcommon.network.d<Result<GameBundlesListObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32495, new Class[0], Void.TYPE).isSupported && GameBundlesActivity.this.isActive()) {
                super.onComplete();
                GameBundlesActivity.this.mRefreshLayout.A(0);
                GameBundlesActivity.this.mRefreshLayout.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 32494, new Class[]{Throwable.class}, Void.TYPE).isSupported && GameBundlesActivity.this.isActive()) {
                super.onError(th2);
                GameBundlesActivity.Q1(GameBundlesActivity.this);
                GameBundlesActivity.this.mRefreshLayout.A(0);
                GameBundlesActivity.this.mRefreshLayout.p(0);
            }
        }

        public void onNext(Result<GameBundlesListObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 32496, new Class[]{Result.class}, Void.TYPE).isSupported && GameBundlesActivity.this.isActive()) {
                super.onNext(result);
                GameBundlesActivity.R1(GameBundlesActivity.this, result.getResult());
                GameBundlesActivity.T1(GameBundlesActivity.this, result.getResult());
                GameBundlesActivity.V1(GameBundlesActivity.this, result.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 32497, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<GameBundlesListObj>) obj);
        }
    }

    public class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ GameBundlesListObj f84124b;

        public class a implements HeyBoxPopupMenu.h {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // com.max.hbcommon.component.HeyBoxPopupMenu.h
            public void a(View view, KeyDescObj keyDescObj) {
                if (PatchProxy.proxy(new Object[]{view, keyDescObj}, this, changeQuickRedirect, false, 32499, new Class[]{View.class, KeyDescObj.class}, Void.TYPE).isSupported) {
                    return;
                }
                if (GameBundlesActivity.this.S == null || !GameBundlesActivity.this.S.equals(keyDescObj.getKey())) {
                    GameBundlesActivity.Y1(GameBundlesActivity.this, keyDescObj);
                    GameBundlesActivity.this.P = 0;
                    GameBundlesActivity.O1(GameBundlesActivity.this);
                }
            }
        }

        d(GameBundlesListObj gameBundlesListObj) {
            this.f84124b = gameBundlesListObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32498, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            HeyBoxPopupMenu heyBoxPopupMenu = new HeyBoxPopupMenu(((BaseActivity) GameBundlesActivity.this).f66601b, this.f84124b.getSort_type(), true);
            heyBoxPopupMenu.R(new a());
            heyBoxPopupMenu.show();
        }
    }

    public class e implements com.max.hbcommon.component.segmentfilters.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.max.hbcommon.component.segmentfilters.d
        public void a(@androidx.annotation.n0 FilterGroup filterGroup, int i10) {
            if (PatchProxy.proxy(new Object[]{filterGroup, new Integer(i10)}, this, changeQuickRedirect, false, 32500, new Class[]{FilterGroup.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            HashMap<String, String> mapB2 = GameBundlesActivity.this.b2();
            if (GameBundlesActivity.this.Q == null || GameBundlesActivity.this.Q.equals(mapB2)) {
                return;
            }
            GameBundlesActivity.this.Q = mapB2;
            GameBundlesActivity.this.mRefreshLayout.F();
        }
    }

    static /* synthetic */ int N1(GameBundlesActivity gameBundlesActivity, int i10) {
        int i11 = gameBundlesActivity.P + i10;
        gameBundlesActivity.P = i11;
        return i11;
    }

    static /* synthetic */ void O1(GameBundlesActivity gameBundlesActivity) {
        if (PatchProxy.proxy(new Object[]{gameBundlesActivity}, null, changeQuickRedirect, true, 32486, new Class[]{GameBundlesActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameBundlesActivity.c2();
    }

    static /* synthetic */ void Q1(GameBundlesActivity gameBundlesActivity) {
        if (PatchProxy.proxy(new Object[]{gameBundlesActivity}, null, changeQuickRedirect, true, 32487, new Class[]{GameBundlesActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameBundlesActivity.C1();
    }

    static /* synthetic */ void R1(GameBundlesActivity gameBundlesActivity, GameBundlesListObj gameBundlesListObj) {
        if (PatchProxy.proxy(new Object[]{gameBundlesActivity, gameBundlesListObj}, null, changeQuickRedirect, true, 32488, new Class[]{GameBundlesActivity.class, GameBundlesListObj.class}, Void.TYPE).isSupported) {
            return;
        }
        gameBundlesActivity.i2(gameBundlesListObj);
    }

    static /* synthetic */ void T1(GameBundlesActivity gameBundlesActivity, GameBundlesListObj gameBundlesListObj) {
        if (PatchProxy.proxy(new Object[]{gameBundlesActivity, gameBundlesListObj}, null, changeQuickRedirect, true, 32489, new Class[]{GameBundlesActivity.class, GameBundlesListObj.class}, Void.TYPE).isSupported) {
            return;
        }
        gameBundlesActivity.f2(gameBundlesListObj);
    }

    static /* synthetic */ void V1(GameBundlesActivity gameBundlesActivity, GameBundlesListObj gameBundlesListObj) {
        if (PatchProxy.proxy(new Object[]{gameBundlesActivity, gameBundlesListObj}, null, changeQuickRedirect, true, 32490, new Class[]{GameBundlesActivity.class, GameBundlesListObj.class}, Void.TYPE).isSupported) {
            return;
        }
        gameBundlesActivity.e2(gameBundlesListObj);
    }

    static /* synthetic */ void Y1(GameBundlesActivity gameBundlesActivity, KeyDescObj keyDescObj) {
        if (PatchProxy.proxy(new Object[]{gameBundlesActivity, keyDescObj}, null, changeQuickRedirect, true, 32491, new Class[]{GameBundlesActivity.class, KeyDescObj.class}, Void.TYPE).isSupported) {
            return;
        }
        gameBundlesActivity.h2(keyDescObj);
    }

    private void c2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32477, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        HashMap map = new HashMap();
        Map<String, String> map2 = this.T;
        if (map2 != null && map2.size() > 0) {
            map.putAll(this.T);
        }
        map.putAll(b2());
        this.Q = map;
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().K5(this.L, map, this.S, this.P, 30).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
    }

    private void e2(GameBundlesListObj gameBundlesListObj) {
        if (PatchProxy.proxy(new Object[]{gameBundlesListObj}, this, changeQuickRedirect, false, 32483, new Class[]{GameBundlesListObj.class}, Void.TYPE).isSupported) {
            return;
        }
        x1();
        if (gameBundlesListObj == null || gameBundlesListObj.getBundles() == null) {
            return;
        }
        if (this.P == 0) {
            this.M.clear();
        }
        this.M.addAll(gameBundlesListObj.getBundles());
        this.mRecyclerView.getAdapter().notifyDataSetChanged();
    }

    private void f2(GameBundlesListObj gameBundlesListObj) {
        if (PatchProxy.proxy(new Object[]{gameBundlesListObj}, this, changeQuickRedirect, false, 32480, new Class[]{GameBundlesListObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (gameBundlesListObj == null || com.max.hbcommon.utils.c.w(gameBundlesListObj.getFilters())) {
            this.secondary_filter.setVisibility(8);
            return;
        }
        j2(gameBundlesListObj.getFilters());
        this.secondary_filter.setList(this.R);
        this.secondary_filter.setVisibility(0);
        this.secondary_filter.setDismissListener(new e());
    }

    private void h2(KeyDescObj keyDescObj) {
        if (PatchProxy.proxy(new Object[]{keyDescObj}, this, changeQuickRedirect, false, 32479, new Class[]{KeyDescObj.class}, Void.TYPE).isSupported) {
            return;
        }
        keyDescObj.setChecked(true);
        this.S = keyDescObj.getKey();
        this.fbv_filter.setText(keyDescObj.getDesc());
    }

    private void i2(GameBundlesListObj gameBundlesListObj) {
        if (PatchProxy.proxy(new Object[]{gameBundlesListObj}, this, changeQuickRedirect, false, 32478, new Class[]{GameBundlesListObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (gameBundlesListObj == null || gameBundlesListObj.getSort_type() == null || gameBundlesListObj.getSort_type().size() <= 1) {
            this.fbv_filter.setVisibility(8);
            return;
        }
        this.fbv_filter.setVisibility(0);
        KeyDescObj keyDescObj = gameBundlesListObj.getSort_type().get(0);
        for (KeyDescObj keyDescObj2 : gameBundlesListObj.getSort_type()) {
            if (keyDescObj2.isChecked()) {
                keyDescObj = keyDescObj2;
                break;
            }
        }
        this.N.o(keyDescObj.getKey());
        h2(keyDescObj);
        this.fbv_filter.setOnClickListener(new d(gameBundlesListObj));
    }

    private void j2(List<FilterGroup> list) {
        if (!PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 32481, new Class[]{List.class}, Void.TYPE).isSupported && this.R == null && list != null && list.size() > 0) {
            this.R = new ArrayList();
            for (FilterGroup filterGroup : list) {
                SecondaryWindowSegmentFilterView.setDefaultChecked(filterGroup);
                this.R.add(filterGroup);
            }
        }
    }

    public HashMap<String, String> b2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32482, new Class[0], HashMap.class);
        if (patchProxyResultProxy.isSupported) {
            return (HashMap) patchProxyResultProxy.result;
        }
        HashMap<String, String> map = new HashMap<>(16);
        List<FilterGroup> list = this.R;
        if (list != null) {
            for (FilterGroup filterGroup : list) {
                String key = filterGroup.getKey();
                if (filterGroup.isNormalSlider()) {
                    if (filterGroup.getCustom_range() != null) {
                        map.put(key, filterGroup.getCustom_range().getStart().getKey() + Constants.ACCEPT_TIME_SEPARATOR_SP + filterGroup.getCustom_range().getEnd().getKey());
                    }
                } else if (FilterGroup.TYPE_SLIDER_TREND_WITH_SWITCH.equals(filterGroup.getType())) {
                    if (filterGroup.getCustom_switch_key() != null) {
                        map.put(filterGroup.getSwitchoptions().getKey(), filterGroup.getCustom_switch_key());
                    }
                    if (filterGroup.getCustom_range() != null) {
                        map.put(key, filterGroup.getCustom_range().getStart().getKey() + Constants.ACCEPT_TIME_SEPARATOR_SP + filterGroup.getCustom_range().getEnd().getKey());
                    }
                } else if (!FilterGroup.TYPE_MULTI.equals(filterGroup.getType())) {
                    FilterItem filterItemH = SecondaryWindowSegmentFilterView.h(filterGroup);
                    if (filterItemH != null) {
                        map.put(key, filterItemH.getKey());
                    }
                } else if (!com.max.hbcommon.utils.c.w(filterGroup.getFilters())) {
                    StringBuilder sb2 = new StringBuilder();
                    for (FilterItem filterItem : filterGroup.getFilters()) {
                        if (filterItem.isCustom_checked()) {
                            if (sb2.length() > 0) {
                                sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                            }
                            sb2.append(filterItem.getKey());
                        }
                    }
                    if (sb2.length() > 0) {
                        map.put(key, sb2.toString());
                    }
                }
            }
        }
        return map;
    }

    @Override // com.max.hbcommon.base.BaseActivity, com.max.hbcommon.analytics.d.f
    @androidx.annotation.p0
    public String getPageAdditional() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32485, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("app_id", this.L);
        return jsonObject.toString();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32476, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.U = com.max.hbcommon.utils.c.x(com.max.hbcache.c.o(com.max.hbcache.c.D0, "0"));
        setContentView(R.layout.activity_game_bundles);
        ButterKnife.a(this);
        this.L = getIntent().getStringExtra("app_id");
        String stringExtra = getIntent().getStringExtra("title");
        this.T = (Map) getIntent().getSerializableExtra(V);
        if (com.max.hbcommon.utils.c.u(stringExtra)) {
            this.f66616q.setTitle(getString(R.string.dlc_bundles));
        } else {
            this.f66616q.setTitle(stringExtra);
        }
        this.f66617r.setVisibility(0);
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this.f66601b, 1, false));
        this.N = new com.max.xiaoheihe.module.game.adapter.b(this.f66601b, this.M);
        com.max.xiaoheihe.module.game.adapter.a aVar = new com.max.xiaoheihe.module.game.adapter.a(this.f66601b, this.M);
        this.O = aVar;
        if (this.U) {
            this.mRecyclerView.setAdapter(this.N);
        } else {
            this.mRecyclerView.setAdapter(aVar);
        }
        this.mRefreshLayout.S(new a());
        this.mRefreshLayout.f0(new b());
        this.fbv_filter.setImage(R.drawable.common_filter2_filled_24x24);
        this.vg_header.setVisibility(this.U ? 0 : 8);
        E1();
        c2();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void n1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32484, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E1();
        this.P = 0;
        c2();
    }
}
