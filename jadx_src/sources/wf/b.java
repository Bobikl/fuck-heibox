package wf;

import com.max.hbcoco.HBCoCoUtilKt;
import com.max.hbcommon.utils.c;
import com.max.hbmmkv.MMKVManager;
import com.max.mediaselector.utils.HBCompressEngine;
import com.max.xiaoheihe.bean.account.ScreenShotShareEnable;
import com.max.xiaoheihe.bean.account.TipsStateObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.d;
import kotlin.jvm.internal.f0;
import od.f;

/* JADX INFO: compiled from: OnlineConfig.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class b {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final void a(@d TipsStateObj tipsStateObj) {
        boolean z10 = true;
        if (PatchProxy.proxy(new Object[]{tipsStateObj}, null, changeQuickRedirect, true, 42831, new Class[]{TipsStateObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(tipsStateObj, "tipsStateObj");
        ad.a.e(ad.a.f1198e, c.x(tipsStateObj.getUse_old_feed_back()));
        ad.a.e(ad.a.f1199f, c.x(tipsStateObj.getLink_detail_lt_desc()));
        ad.a.e(ad.a.f1200g, c.x(tipsStateObj.getBbs_text_view_small_icon()));
        ScreenShotShareEnable screenshot_share_enabled = tipsStateObj.getScreenshot_share_enabled();
        ad.a.e(ad.a.f1202i, c.A(screenshot_share_enabled != null ? screenshot_share_enabled.getGame_detail() : null));
        ad.a.e(ad.a.f1201h, c.x(tipsStateObj.getDisable_open_link_when_post()));
        ad.a.e(f.f132279c, c.x(tipsStateObj.getDisable_show_story_overlay_tips()));
        ad.a.e("improve_ab_testshow_fullscreen_award_guide", c.x(tipsStateObj.getShow_fullscreen_award_guide()));
        ad.a.e(ad.a.f1204k, c.x(tipsStateObj.getDisable_web_link_fullscreen_award()));
        ad.a.e(ad.a.f1205l, c.x(tipsStateObj.getSearch_welcome_page_v2()));
        ad.a.e(ad.a.f1206m, c.x(tipsStateObj.getOpen_post_scroll_reply_owner()));
        ad.a.e(ad.a.f1207n, c.x(tipsStateObj.getLink_detail_not_wait_web_ready()));
        ad.a.e(ad.a.f1210q, c.x(tipsStateObj.getGetui_count_sdk()));
        ad.a.e(ad.a.f1213t, c.x(tipsStateObj.getDisable_image_viewer_single_load()));
        ad.a.e("improve_ab_testdisable_picture_cache_manager_use_external_cache", c.x(tipsStateObj.getDisable_picture_cache_manager_use_external_app_cache()));
        ad.a.e(ad.a.f1209p, c.x(tipsStateObj.getDisable_post_gesture_to_userhome()));
        ad.a.e(ad.a.f1211r, c.x(tipsStateObj.getSearch_welcome_page_v3()));
        ad.a.e(ad.a.f1212s, c.x(tipsStateObj.getEnable_new_topic_hashtag_entry()));
        ad.a.e(ad.a.f1214u, c.x(tipsStateObj.getDisable_post_add_topic_restriction()));
        if (!f0.g(tipsStateObj.getEnable_new_bbs_comment_style(), "1") && !f0.g(tipsStateObj.getEnable_new_bbs_comment_style(), "2")) {
            z10 = false;
        }
        ad.a.e(ad.a.f1215v, z10);
        ad.a.e(ad.a.f1216w, c.x(tipsStateObj.getDisable_proxy_line_select()));
        ad.a.e(ad.a.f1217x, c.x(tipsStateObj.getAndroid_disable_only_cookie_manger()));
        ad.a.e(ad.a.f1218y, c.x(tipsStateObj.getDisable_restore_auto_saved_draft()));
        ad.a.e(ad.a.f1219z, c.x(tipsStateObj.getDisable_share_private_chat_btn()));
        ad.a.e(ad.a.A, c.x(tipsStateObj.getDisable_new_style_emoji_keyboard()));
        ad.a.e(ad.a.B, c.x(tipsStateObj.getEnable_search_refresh_feeds()));
        ad.a.e(ad.a.C, c.x(tipsStateObj.getDisable_moment_privacy_setting()));
        ad.a.e(ad.a.D, c.x(tipsStateObj.getDisable_user_centered_search()));
        ad.a.e(ad.a.E, c.x(tipsStateObj.getEnable_new_style_collect()));
        ad.a.e(ad.a.F, c.x(tipsStateObj.getDisable_darkmode_error_correct()));
        ad.a.e(ad.a.G, c.x(tipsStateObj.getDisable_new_time_desc_rule()));
        ad.a.e(HBCompressEngine.f75633f, c.x(tipsStateObj.getDisable_new_origin_image_compress()));
        ad.a.e(ad.a.H, c.x(tipsStateObj.getDisable_top_tab_trigger_refresh()));
        ad.a.e(ad.a.I, c.x(tipsStateObj.getDisable_post_compilation()));
        MMKVManager.f71329a.k(ad.c.f1243w, ad.c.f1244x, c.x(tipsStateObj.getEnable_doh()), false);
        boolean zX = c.x(tipsStateObj.getAndroid_coco());
        HBCoCoUtilKt.f66169a = zX;
        if (zX) {
            HBCoCoUtilKt.l();
        }
        com.max.xiaoheihe.module.account.accelworld.a.h(tipsStateObj.getCan_manager_account_quantity());
    }

    public static final void b(@d TipsStateObj tipsStateObj) {
        if (PatchProxy.proxy(new Object[]{tipsStateObj}, null, changeQuickRedirect, true, 42832, new Class[]{TipsStateObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(tipsStateObj, "tipsStateObj");
        ad.a.e(ad.a.f1208o, c.x(tipsStateObj.getDisable_web_global_page_report()));
    }
}
