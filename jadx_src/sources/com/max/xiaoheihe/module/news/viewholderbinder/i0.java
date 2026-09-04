package com.max.xiaoheihe.module.news.viewholderbinder;

import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: NewsViewHolderBinderFactory.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class i0 implements cb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final i0 f91463a = new i0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f91464b = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    private i0() {
    }

    @dl.e
    public final h0 a(@dl.d g0 param, @androidx.annotation.d0 int i10) {
        h0 gVar;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{param, new Integer(i10)}, this, changeQuickRedirect, false, 42801, new Class[]{g0.class, Integer.TYPE}, h0.class);
        if (patchProxyResultProxy.isSupported) {
            return (h0) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(param, "param");
        switch (i10) {
            case R.layout.item_bbs_rec_write_article /* 2131558969 */:
                gVar = new g(param);
                break;
            case R.layout.item_channels_link_top /* 2131558998 */:
                gVar = new f0(param);
                break;
            case R.layout.item_concept_channel_entry /* 2131559014 */:
                gVar = new h(param);
                break;
            case R.layout.item_concept_moments_link /* 2131559032 */:
                gVar = new s(param);
                break;
            case R.layout.item_event_list /* 2131559103 */:
                gVar = new b(param);
                break;
            case R.layout.item_link_collection /* 2131559282 */:
                gVar = new d(param);
                break;
            case R.layout.item_link_list_hsv /* 2131559286 */:
                gVar = new f(param);
                break;
            case R.layout.item_moments_game_comment /* 2131559329 */:
                gVar = new e(param);
                break;
            case R.layout.item_recommend_user_hsv /* 2131559466 */:
                gVar = new d0(param);
                break;
            case R.layout.item_topic_entry /* 2131559567 */:
                gVar = new n0(param);
                break;
            case R.layout.item_topic_entry_list /* 2131559569 */:
                gVar = new m0(param);
                break;
            default:
                switch (i10) {
                    case R.layout.item_concept_feeds_hot_comment /* 2131559016 */:
                        gVar = new u(param);
                        break;
                    case R.layout.item_concept_feeds_link /* 2131559017 */:
                        gVar = new n(param);
                        break;
                    case R.layout.item_concept_feeds_login /* 2131559018 */:
                        gVar = new x(param);
                        break;
                    case R.layout.item_concept_feeds_mobile_img /* 2131559019 */:
                        gVar = new y(param);
                        break;
                    case R.layout.item_concept_feeds_mobile_video /* 2131559020 */:
                        gVar = new z(param);
                        break;
                    case R.layout.item_concept_feeds_news_normal /* 2131559021 */:
                        gVar = new a0(param);
                        break;
                    case R.layout.item_concept_feeds_news_wide /* 2131559022 */:
                        gVar = new k0(param);
                        break;
                    default:
                        switch (i10) {
                            case R.layout.item_concept_rec_hashtag /* 2131559035 */:
                                gVar = new b0(param);
                                break;
                            case R.layout.item_concept_rec_news /* 2131559036 */:
                                gVar = new e0(param);
                                break;
                            case R.layout.item_concept_rec_switch /* 2131559037 */:
                                gVar = new c0(param);
                                break;
                            default:
                                switch (i10) {
                                    case R.layout.item_feeds_express_news /* 2131559109 */:
                                        gVar = new i(param);
                                        break;
                                    case R.layout.item_feeds_hor_event /* 2131559110 */:
                                        gVar = new HorEventVHB(param);
                                        break;
                                    case R.layout.item_feeds_hor_link_list /* 2131559111 */:
                                        gVar = new t(param);
                                        break;
                                    default:
                                        switch (i10) {
                                            case R.layout.item_news_config /* 2131559337 */:
                                                gVar = new j(param);
                                                break;
                                            case R.layout.item_news_feeds_ui_kit /* 2131559338 */:
                                                gVar = new o(param);
                                                break;
                                            case R.layout.item_news_large /* 2131559339 */:
                                                gVar = new v(param);
                                                break;
                                            case R.layout.item_news_link_v2 /* 2131559340 */:
                                                gVar = new k(param);
                                                break;
                                            default:
                                                switch (i10) {
                                                    case R.layout.item_news_link_v3 /* 2131559342 */:
                                                        gVar = new l(param);
                                                        break;
                                                    case R.layout.item_news_link_v4 /* 2131559343 */:
                                                        gVar = new m(param);
                                                        break;
                                                    case R.layout.item_news_list_hsv /* 2131559344 */:
                                                        gVar = new w(param);
                                                        break;
                                                    default:
                                                        switch (i10) {
                                                            case R.layout.item_news_v2 /* 2131559347 */:
                                                                gVar = new p(param);
                                                                break;
                                                            case R.layout.item_news_v3 /* 2131559348 */:
                                                                gVar = new q(param);
                                                                break;
                                                            case R.layout.item_news_v4 /* 2131559349 */:
                                                                gVar = new r(param);
                                                                break;
                                                            case R.layout.item_news_with_top_user /* 2131559350 */:
                                                                gVar = new l0(param);
                                                                break;
                                                            default:
                                                                return null;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
                break;
        }
        return gVar;
    }
}
