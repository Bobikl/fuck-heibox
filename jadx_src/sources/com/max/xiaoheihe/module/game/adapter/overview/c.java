package com.max.xiaoheihe.module.game.adapter.overview;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.gameoverview.BaseGameOverviewObj;
import com.max.xiaoheihe.module.game.adapter.overview.binder.GameOverviewAuthsVHB;
import com.max.xiaoheihe.module.game.adapter.overview.binder.GameOverviewMatchListAllVHB;
import com.max.xiaoheihe.module.game.adapter.overview.binder.a0;
import com.max.xiaoheihe.module.game.adapter.overview.binder.b0;
import com.max.xiaoheihe.module.game.adapter.overview.binder.c0;
import com.max.xiaoheihe.module.game.adapter.overview.binder.d0;
import com.max.xiaoheihe.module.game.adapter.overview.binder.f;
import com.max.xiaoheihe.module.game.adapter.overview.binder.g;
import com.max.xiaoheihe.module.game.adapter.overview.binder.h;
import com.max.xiaoheihe.module.game.adapter.overview.binder.i;
import com.max.xiaoheihe.module.game.adapter.overview.binder.j;
import com.max.xiaoheihe.module.game.adapter.overview.binder.k;
import com.max.xiaoheihe.module.game.adapter.overview.binder.l;
import com.max.xiaoheihe.module.game.adapter.overview.binder.m;
import com.max.xiaoheihe.module.game.adapter.overview.binder.n;
import com.max.xiaoheihe.module.game.adapter.overview.binder.p;
import com.max.xiaoheihe.module.game.adapter.overview.binder.q;
import com.max.xiaoheihe.module.game.adapter.overview.binder.r;
import com.max.xiaoheihe.module.game.adapter.overview.binder.s;
import com.max.xiaoheihe.module.game.adapter.overview.binder.t;
import com.max.xiaoheihe.module.game.adapter.overview.binder.u;
import com.max.xiaoheihe.module.game.adapter.overview.binder.v;
import com.max.xiaoheihe.module.game.adapter.overview.binder.w;
import com.max.xiaoheihe.module.game.adapter.overview.binder.x;
import com.max.xiaoheihe.module.game.adapter.overview.binder.y;
import com.max.xiaoheihe.module.game.adapter.overview.binder.z;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameOverviewVHBFactory.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class c implements cb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final c f85939a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f85940b = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    private c() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:116:0x01b4 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0075 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00f7 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final int a(@e BaseGameOverviewObj baseGameOverviewObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{baseGameOverviewObj}, this, changeQuickRedirect, false, 35728, new Class[]{BaseGameOverviewObj.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String item_type = baseGameOverviewObj != null ? baseGameOverviewObj.getItem_type() : null;
        if (item_type != null) {
            switch (item_type.hashCode()) {
                case -2145229041:
                    if (item_type.equals(b.B)) {
                        return R.layout.item_game_overview_chart;
                    }
                    break;
                case -1996468168:
                    if (item_type.equals(b.K)) {
                        return R.layout.item_dota2_hero;
                    }
                    break;
                case -1965127391:
                    if (item_type.equals(b.G)) {
                        return R.layout.item_game_overview_item_empty;
                    }
                    break;
                case -1925129778:
                    if (item_type.equals(b.f85772q)) {
                        return R.layout.item_game_overview_hero_title;
                    }
                    break;
                case -1825511182:
                    if (item_type.equals(b.f85765j)) {
                        return R.layout.item_game_overview_mmr;
                    }
                    break;
                case -1667837214:
                    if (item_type.equals("teammate")) {
                        return R.layout.item_game_overview_user_title;
                    }
                    break;
                case -1442653048:
                    if (item_type.equals(b.N)) {
                        return R.layout.item_game_overview_all_match_button;
                    }
                    break;
                case -1221270899:
                    if (item_type.equals("header")) {
                        return R.layout.item_game_overview_header;
                    }
                    break;
                case -1152484550:
                    if (item_type.equals(b.H)) {
                        return R.layout.item_game_overview_banner;
                    }
                    break;
                case -1039689911:
                    if (item_type.equals("notify")) {
                        return R.layout.item_game_overview_notify;
                    }
                    break;
                case -178324674:
                    if (item_type.equals("calendar")) {
                        return R.layout.item_game_overview_all_calendar;
                    }
                    break;
                case -158618848:
                    if (item_type.equals(b.I)) {
                        return R.layout.item_game_overview_overlay_chart;
                    }
                    break;
                case 3023933:
                    if (item_type.equals("bind")) {
                        return R.layout.item_game_overview_bind;
                    }
                    break;
                case 3327403:
                    if (item_type.equals(b.f85771p)) {
                        return R.layout.item_game_overview_logo;
                    }
                    break;
                case 13146162:
                    if (item_type.equals(b.f85773r)) {
                        return R.layout.item_game_overview_career_record;
                    }
                    break;
                case 93181899:
                    if (item_type.equals(b.D)) {
                        return R.layout.item_game_overview_auth_all;
                    }
                    break;
                case 108270342:
                    if (item_type.equals(b.f85776u)) {
                        return R.layout.item_game_overview_all_radar;
                    }
                    break;
                case 109637894:
                    if (item_type.equals("space")) {
                        return R.layout.layout_space;
                    }
                    break;
                case 238531961:
                    if (item_type.equals(b.L)) {
                        return R.layout.item_game_overview_all_match_button;
                    }
                    break;
                case 287929860:
                    if (item_type.equals(b.f85780y)) {
                        return R.layout.item_game_overview_match_list;
                    }
                    break;
                case 339209991:
                    if (item_type.equals(b.M)) {
                        return R.layout.item_dota2_user;
                    }
                    break;
                case 346713384:
                    if (item_type.equals(b.f85767l)) {
                        return R.layout.item_game_overview_all_data_stats;
                    }
                    break;
                case 461722372:
                    if (item_type.equals(b.F)) {
                        return R.layout.item_game_overview_common_title;
                    }
                    break;
                case 933946929:
                    if (item_type.equals(b.f85779x)) {
                        return R.layout.item_game_overview_match_list;
                    }
                    break;
                case 1024628025:
                    if (item_type.equals(b.f85766k)) {
                        return R.layout.item_game_overview_recent20_data_stats;
                    }
                    break;
                case 1183790700:
                    if (item_type.equals(b.f85777v)) {
                        return R.layout.item_game_overview_hero_header;
                    }
                    break;
                case 1460576074:
                    if (item_type.equals(b.O)) {
                        return R.layout.item_game_overview_auth;
                    }
                    break;
                case 1713050337:
                    if (item_type.equals(b.f85768m)) {
                        return R.layout.item_game_overview_recent_matchs;
                    }
                    break;
                case 1746634138:
                    if (item_type.equals(b.A)) {
                        return R.layout.item_dota2_match;
                    }
                    break;
                case 1759252682:
                    if (item_type.equals(b.J)) {
                        return R.layout.item_game_overview_all_match_button;
                    }
                    break;
                case 1864936781:
                    if (item_type.equals(b.f85781z)) {
                        return R.layout.item_dota2_match;
                    }
                    break;
                case 1865016024:
                    if (item_type.equals(b.f85769n)) {
                        return R.layout.item_game_overview_match_list_all;
                    }
                    break;
                case 1904240423:
                    if (item_type.equals(b.f85778w)) {
                        return R.layout.item_game_overview_hero_mmr;
                    }
                    break;
            }
        }
        return R.layout.empty_layout;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @e
    public final cb.c<BaseGameOverviewObj> b(@dl.d d param) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{param}, this, changeQuickRedirect, false, 35727, new Class[]{d.class}, cb.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (cb.c) patchProxyResultProxy.result;
        }
        f0.p(param, "param");
        BaseGameOverviewObj baseGameOverviewObjC = param.c();
        String item_type = baseGameOverviewObjC != null ? baseGameOverviewObjC.getItem_type() : null;
        if (item_type == null) {
            return null;
        }
        switch (item_type.hashCode()) {
            case -2145229041:
                if (item_type.equals(b.B)) {
                    return new i(param);
                }
                return null;
            case -1996468168:
                if (item_type.equals(b.K)) {
                    return new n(param);
                }
                return null;
            case -1965127391:
                if (item_type.equals(b.G)) {
                    return new p(param);
                }
                return null;
            case -1925129778:
                if (item_type.equals(b.f85772q)) {
                    return new com.max.xiaoheihe.module.game.adapter.overview.binder.o(param);
                }
                return null;
            case -1825511182:
                if (item_type.equals(b.f85765j)) {
                    return new s(param);
                }
                return null;
            case -1667837214:
                if (item_type.equals("teammate")) {
                    return new d0(param);
                }
                return null;
            case -1442653048:
                if (item_type.equals(b.N)) {
                    return new com.max.xiaoheihe.module.game.adapter.overview.binder.d(param);
                }
                return null;
            case -1221270899:
                if (item_type.equals("header")) {
                    return new l(param);
                }
                return null;
            case -1152484550:
                if (item_type.equals(b.H)) {
                    return new com.max.xiaoheihe.module.game.adapter.overview.binder.e(param);
                }
                return null;
            case -1039689911:
                if (item_type.equals("notify")) {
                    return new w(param);
                }
                return null;
            case -178324674:
                if (item_type.equals("calendar")) {
                    return new g(param);
                }
                return null;
            case -158618848:
                if (item_type.equals(b.I)) {
                    return new x(param);
                }
                return null;
            case 3023933:
                if (item_type.equals("bind")) {
                    return new f(param);
                }
                return null;
            case 3327403:
                if (item_type.equals(b.f85771p)) {
                    return new q(param);
                }
                return null;
            case 13146162:
                if (item_type.equals(b.f85773r)) {
                    return new h(param);
                }
                return null;
            case 93181899:
                if (item_type.equals(b.D)) {
                    return new GameOverviewAuthsVHB(param);
                }
                return null;
            case 108270342:
                if (item_type.equals(b.f85776u)) {
                    return new y(param);
                }
                return null;
            case 109637894:
                if (item_type.equals("space")) {
                    return new b0(param);
                }
                return null;
            case 238531961:
                if (item_type.equals(b.L)) {
                    return new com.max.xiaoheihe.module.game.adapter.overview.binder.a(param);
                }
                return null;
            case 287929860:
                if (!item_type.equals(b.f85780y)) {
                    return null;
                }
                break;
            case 339209991:
                if (item_type.equals(b.M)) {
                    return new c0(param);
                }
                return null;
            case 346713384:
                if (item_type.equals(b.f85767l)) {
                    return new com.max.xiaoheihe.module.game.adapter.overview.binder.c(param);
                }
                return null;
            case 461722372:
                if (item_type.equals(b.F)) {
                    return new j(param);
                }
                return null;
            case 933946929:
                if (!item_type.equals(b.f85779x)) {
                    return null;
                }
                break;
            case 1024628025:
                if (item_type.equals(b.f85766k)) {
                    return new a0(param);
                }
                return null;
            case 1183790700:
                if (item_type.equals(b.f85777v)) {
                    return new m(param);
                }
                return null;
            case 1460576074:
                if (item_type.equals(b.O)) {
                    return new k(param);
                }
                return null;
            case 1713050337:
                if (item_type.equals(b.f85768m)) {
                    return new z(param);
                }
                return null;
            case 1746634138:
                if (item_type.equals(b.A)) {
                    return new u(param);
                }
                return null;
            case 1759252682:
                if (item_type.equals(b.J)) {
                    return new com.max.xiaoheihe.module.game.adapter.overview.binder.b(param);
                }
                return null;
            case 1864936781:
                if (item_type.equals(b.f85781z)) {
                    return new v(param);
                }
                return null;
            case 1865016024:
                if (item_type.equals(b.f85769n)) {
                    return new GameOverviewMatchListAllVHB(param);
                }
                return null;
            case 1904240423:
                if (item_type.equals(b.f85778w)) {
                    return new r(param);
                }
                return null;
            default:
                return null;
        }
        return new t(param);
    }
}
