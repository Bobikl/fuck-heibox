package com.max.xiaoheihe.module.game.adapter.overview;

import android.content.Context;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.base.adapter.u;
import com.max.hbcommon.bean.segmentfilter.FilterGroup;
import com.max.hbcommon.component.segmentfilters.SecondaryWindowSegmentFilterView;
import com.max.xiaoheihe.bean.game.gameoverview.BaseGameOverviewObj;
import com.max.xiaoheihe.bean.game.gameoverview.Dota2UserObj;
import com.max.xiaoheihe.bean.game.gameoverview.GameOverviewHeaderInfoObj;
import com.max.xiaoheihe.bean.game.gameoverview.GameOverviewHeaderObj;
import com.max.xiaoheihe.bean.game.gameoverview.GameOverviewHeroListObj;
import com.max.xiaoheihe.bean.game.gameoverview.GameOverviewHeroObj;
import com.max.xiaoheihe.bean.game.gameoverview.GameOverviewUserListObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.f0;
import xh.m;

/* JADX INFO: compiled from: GameOverviewAdapter.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class b extends u<BaseGameOverviewObj> {

    @dl.d
    public static final String A = "match_mmr_item";

    @dl.d
    public static final String B = "performance_chart";

    @dl.d
    public static final String C = "bind";

    @dl.d
    public static final String D = "auths";

    @dl.d
    public static final String E = "notify";

    @dl.d
    public static final String F = "common_title";

    @dl.d
    public static final String G = "item_empty";

    @dl.d
    public static final String H = "ad_list";

    @dl.d
    public static final String I = "overlay_record";

    @dl.d
    public static final String J = "all_match_button";

    @dl.d
    public static final String K = "hero_item";

    @dl.d
    public static final String L = "all_hero_button";

    @dl.d
    public static final String M = "user_item";

    @dl.d
    public static final String N = "all_user_button";

    @dl.d
    public static final String O = "auth_item";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    public static final a f85762g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f85763h = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    public static final String f85764i = "header";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    public static final String f85765j = "mmr_stats";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    public static final String f85766k = "r20_data_stats";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    public static final String f85767l = "all_data_stats";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    public static final String f85768m = "recent_match";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    public static final String f85769n = "match_list";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    public static final String f85770o = "space";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    public static final String f85771p = "logo";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    public static final String f85772q = "common_hero";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    public static final String f85773r = "career_record";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.d
    public static final String f85774s = "teammate";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.d
    public static final String f85775t = "calendar";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.d
    public static final String f85776u = "radar";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.d
    public static final String f85777v = "header_hero";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.d
    public static final String f85778w = "mmr_stats_hero";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @dl.d
    public static final String f85779x = "match_list_title";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @dl.d
    public static final String f85780y = "match_list_mmr_title";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @dl.d
    public static final String f85781z = "match_item";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Context f85782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final RecyclerView f85783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private c f85784d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @e
    private final FragmentManager f85785e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @e
    private InterfaceC0764b f85786f;

    /* JADX INFO: compiled from: GameOverviewAdapter.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0067  */
        /* JADX WARN: Code duplicated, block: B:25:0x0071  */
        /* JADX WARN: Code duplicated, block: B:28:0x007b  */
        /* JADX WARN: Code duplicated, block: B:29:0x007f  */
        /* JADX WARN: Code duplicated, block: B:36:0x0098 A[LOOP:3: B:34:0x0092->B:36:0x0098, LOOP_END] */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @e
        @m
        public final List<BaseGameOverviewObj> a(@e List<BaseGameOverviewObj> list, @e List<FilterGroup> list2) {
            GameOverviewHeaderInfoObj header_info;
            List<FilterGroup> filters;
            Iterator<FilterGroup> it;
            GameOverviewHeaderInfoObj header_info2;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, list2}, this, changeQuickRedirect, false, 35726, new Class[]{List.class, List.class}, List.class);
            if (patchProxyResultProxy.isSupported) {
                return (List) patchProxyResultProxy.result;
            }
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (BaseGameOverviewObj baseGameOverviewObj : list) {
                String item_type = baseGameOverviewObj.getItem_type();
                if (item_type != null) {
                    switch (item_type.hashCode()) {
                        case -1925129778:
                            if (item_type.equals(b.f85772q)) {
                                if (baseGameOverviewObj instanceof GameOverviewHeroListObj) {
                                    arrayList.add(baseGameOverviewObj);
                                    List<GameOverviewHeroObj> status_list = ((GameOverviewHeroListObj) baseGameOverviewObj).getStatus_list();
                                    if (status_list != null) {
                                        for (GameOverviewHeroObj gameOverviewHeroObj : status_list) {
                                            gameOverviewHeroObj.setItem_type(b.K);
                                            arrayList.add(gameOverviewHeroObj);
                                        }
                                        if (status_list.size() >= 5) {
                                            BaseGameOverviewObj baseGameOverviewObj2 = new BaseGameOverviewObj();
                                            baseGameOverviewObj2.setItem_type(b.L);
                                            arrayList.add(baseGameOverviewObj2);
                                        }
                                    }
                                }
                            }
                            break;
                        case -1667837214:
                            if (item_type.equals("teammate")) {
                                if (baseGameOverviewObj instanceof GameOverviewUserListObj) {
                                    arrayList.add(baseGameOverviewObj);
                                    List<Dota2UserObj> teammates = ((GameOverviewUserListObj) baseGameOverviewObj).getTeammates();
                                    if (teammates != null) {
                                        for (Dota2UserObj dota2UserObj : teammates) {
                                            dota2UserObj.setItem_type(b.M);
                                            arrayList.add(dota2UserObj);
                                        }
                                    }
                                    BaseGameOverviewObj baseGameOverviewObj3 = new BaseGameOverviewObj();
                                    baseGameOverviewObj3.setItem_type(b.N);
                                    arrayList.add(baseGameOverviewObj3);
                                }
                            }
                            break;
                        case -1221270899:
                            if (item_type.equals("header")) {
                                if (baseGameOverviewObj instanceof GameOverviewHeaderObj) {
                                    if (com.max.hbcommon.utils.c.w(list2)) {
                                        header_info = ((GameOverviewHeaderObj) baseGameOverviewObj).getHeader_info();
                                        if (header_info != null && (filters = header_info.getFilters()) != null) {
                                            it = filters.iterator();
                                            while (it.hasNext()) {
                                                SecondaryWindowSegmentFilterView.f67839l.r(it.next());
                                            }
                                        }
                                    } else {
                                        header_info2 = ((GameOverviewHeaderObj) baseGameOverviewObj).getHeader_info();
                                        if (header_info2 != null) {
                                            header_info2.setFilters(list2);
                                        }
                                    }
                                }
                                arrayList.add(baseGameOverviewObj);
                            }
                            break;
                        case 1183790700:
                            if (item_type.equals(b.f85777v)) {
                                if (baseGameOverviewObj instanceof GameOverviewHeaderObj) {
                                    if (com.max.hbcommon.utils.c.w(list2)) {
                                        header_info2 = ((GameOverviewHeaderObj) baseGameOverviewObj).getHeader_info();
                                        if (header_info2 != null) {
                                            header_info2.setFilters(list2);
                                        }
                                    } else {
                                        header_info = ((GameOverviewHeaderObj) baseGameOverviewObj).getHeader_info();
                                        if (header_info != null) {
                                            it = filters.iterator();
                                            while (it.hasNext()) {
                                                SecondaryWindowSegmentFilterView.f67839l.r(it.next());
                                            }
                                        }
                                    }
                                }
                                arrayList.add(baseGameOverviewObj);
                            }
                            break;
                        default:
                            break;
                    }
                }
                arrayList.add(baseGameOverviewObj);
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.adapter.overview.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: GameOverviewAdapter.kt */
    public interface InterfaceC0764b {
        void a(@dl.d List<FilterGroup> list);

        @e
        List<FilterGroup> b();
    }

    /* JADX INFO: compiled from: GameOverviewAdapter.kt */
    public interface c {
        boolean a();

        @e
        String b();

        @e
        String getUserId();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@dl.d Context context, @dl.d List<BaseGameOverviewObj> dataList, @dl.d RecyclerView rv, @dl.d c onGetParams, @e FragmentManager fragmentManager) {
        super(context, dataList);
        f0.p(context, "context");
        f0.p(dataList, "dataList");
        f0.p(rv, "rv");
        f0.p(onGetParams, "onGetParams");
        this.f85782b = context;
        this.f85783c = rv;
        this.f85784d = onGetParams;
        this.f85785e = fragmentManager;
    }

    @e
    @m
    public static final List<BaseGameOverviewObj> t(@e List<BaseGameOverviewObj> list, @e List<FilterGroup> list2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, list2}, null, changeQuickRedirect, true, 35723, new Class[]{List.class, List.class}, List.class);
        return patchProxyResultProxy.isSupported ? (List) patchProxyResultProxy.result : f85762g.a(list, list2);
    }

    @Override // com.max.hbcommon.base.adapter.u
    public /* bridge */ /* synthetic */ int m(int i10, BaseGameOverviewObj baseGameOverviewObj) {
        Object[] objArr = {new Integer(i10), baseGameOverviewObj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 35725, new Class[]{cls, Object.class}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : p(i10, baseGameOverviewObj);
    }

    @dl.d
    public final Context n() {
        return this.f85782b;
    }

    @e
    public final FragmentManager o() {
        return this.f85785e;
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, Object obj) {
        if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 35724, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        u(eVar, (BaseGameOverviewObj) obj);
    }

    public int p(int i10, @e BaseGameOverviewObj baseGameOverviewObj) {
        Object[] objArr = {new Integer(i10), baseGameOverviewObj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 35722, new Class[]{cls, BaseGameOverviewObj.class}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : com.max.xiaoheihe.module.game.adapter.overview.c.f85939a.a(baseGameOverviewObj);
    }

    @e
    public final InterfaceC0764b q() {
        return this.f85786f;
    }

    @dl.d
    public final c r() {
        return this.f85784d;
    }

    @dl.d
    public final RecyclerView s() {
        return this.f85783c;
    }

    public void u(@e s.e eVar, @e BaseGameOverviewObj baseGameOverviewObj) {
        if (PatchProxy.proxy(new Object[]{eVar, baseGameOverviewObj}, this, changeQuickRedirect, false, 35721, new Class[]{s.e.class, BaseGameOverviewObj.class}, Void.TYPE).isSupported || eVar == null) {
            return;
        }
        eVar.itemView.setTag(baseGameOverviewObj);
        cb.c<BaseGameOverviewObj> cVarB = com.max.xiaoheihe.module.game.adapter.overview.c.f85939a.b(new d(this.f85782b, this, this.f85783c, baseGameOverviewObj, this.f85786f, this.f85785e));
        if (baseGameOverviewObj == null || cVarB == null) {
            return;
        }
        cVarB.b(eVar, baseGameOverviewObj);
    }

    public final void v(@e InterfaceC0764b interfaceC0764b) {
        this.f85786f = interfaceC0764b;
    }

    public final void w(@dl.d c cVar) {
        if (PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 35720, new Class[]{c.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(cVar, "<set-?>");
        this.f85784d = cVar;
    }
}
