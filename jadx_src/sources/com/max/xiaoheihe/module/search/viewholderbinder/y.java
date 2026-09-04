package com.max.xiaoheihe.module.search.viewholderbinder;

import com.max.xiaoheihe.module.search.SearchHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SearchVHBFactory.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class y implements cb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final y f91901a = new y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f91902b = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    private y() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @dl.e
    public final a0 a(@dl.d z param, @dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{param, str}, this, changeQuickRedirect, false, 43414, new Class[]{z.class, String.class}, a0.class);
        if (patchProxyResultProxy.isSupported) {
            return (a0) patchProxyResultProxy.result;
        }
        f0.p(param, "param");
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -1940975639:
                if (str.equals(SearchHelper.f91585m)) {
                    return new o(param);
                }
                return null;
            case -1648100288:
                if (str.equals(SearchHelper.f91577e)) {
                    return new f(param);
                }
                return null;
            case -1633951508:
                if (!str.equals(SearchHelper.f91584l)) {
                    return null;
                }
                return new k(param);
            case -1552728493:
                if (str.equals(SearchHelper.f91579g)) {
                    return new i(param);
                }
                return null;
            case -1396342996:
                if (str.equals("banner")) {
                    return new c(param);
                }
                return null;
            case -1302585994:
                if (str.equals(SearchHelper.G)) {
                    return new SearchFeedbackV2VHB(param);
                }
                return null;
            case -1299896998:
                if (str.equals(SearchHelper.f91576d)) {
                    return new t(param);
                }
                return null;
            case -1236308856:
                if (str.equals(SearchHelper.f91575c)) {
                    return new b(param);
                }
                return null;
            case -1221270899:
                if (str.equals("header")) {
                    return new u(param);
                }
                return null;
            case -539234449:
                if (str.equals("search_tips")) {
                    return new d(param);
                }
                return null;
            case -460460398:
                if (str.equals(SearchHelper.f91586n)) {
                    return new n(param);
                }
                return null;
            case -191501435:
                if (str.equals("feedback")) {
                    return new g(param);
                }
                return null;
            case 3165170:
                if (str.equals("game")) {
                    return new l(param);
                }
                return null;
            case 3321850:
                if (!str.equals("link")) {
                    return null;
                }
                com.max.heybox.hblog.g.f74531b.v("[getSearchVHB] Assertion failure: This type should be processed before");
                return null;
            case 3343892:
                if (str.equals("mall")) {
                    return new p(param);
                }
                return null;
            case 3560248:
                if (str.equals(SearchHelper.f91592t)) {
                    return new e(param);
                }
                return null;
            case 3565976:
                if (str.equals("tool")) {
                    return new v(param);
                }
                return null;
            case 3599307:
                if (str.equals("user")) {
                    return new x(param);
                }
                return null;
            case 44302003:
                if (str.equals(SearchHelper.f91587o)) {
                    return new w(param);
                }
                return null;
            case 109637894:
                if (str.equals("space")) {
                    return new s(param);
                }
                return null;
            case 110546223:
                if (str.equals("topic")) {
                    return new h(param);
                }
                return null;
            case 697547724:
                if (str.equals("hashtag")) {
                    return new m(param);
                }
                return null;
            case 738012435:
                if (!str.equals("middle_game_card")) {
                    return null;
                }
                return new j(param);
            case 749438346:
                if (str.equals("relevant_search")) {
                    return new r(param);
                }
                return null;
            case 899109442:
                if (str.equals("mini_app_v2")) {
                    return new q(param);
                }
                return null;
            case 1000916171:
                if (!str.equals("game_list")) {
                    return null;
                }
                return new k(param);
            case 1089390270:
                if (!str.equals("big_game_card")) {
                    return null;
                }
                return new j(param);
            default:
                return null;
        }
    }
}
