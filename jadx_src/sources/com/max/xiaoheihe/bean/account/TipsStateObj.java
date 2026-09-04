package com.max.xiaoheihe.bean.account;

import androidx.compose.runtime.internal.o;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.xiaoheihe.bean.AppTabsObj;
import com.max.xiaoheihe.bean.account.tab.TabConfigObj;
import com.max.xiaoheihe.bean.analytics.EventLogConfigObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.d;
import dl.e;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TipsStateObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class TipsStateObj {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String account_tap_time;

    @e
    private String activity_button_time;

    @e
    private String android_coco;

    @e
    private String android_disable_only_cookie_manger;

    @e
    private String android_okhttp_custom_error_retry;

    @e
    private AppTabsObj app_tabs;

    @e
    private String bbs_tap_time;

    @e
    private String can_manager_account_quantity;

    @e
    private String chat_copyed_token_regex;

    @e
    private String community_wiki_tab;

    @e
    private String compress_image;

    @e
    private String copyed_token_regex;

    @e
    private String disable_darkmode_error_correct;

    @e
    private String disable_download_scan_so;

    @e
    private String disable_image_viewer_single_load;

    @e
    private String disable_moment_privacy_setting;

    @e
    private String disable_new_origin_image_compress;

    @e
    private String disable_new_style_emoji_keyboard;

    @e
    private String disable_new_time_desc_rule;

    @e
    private String disable_picture_cache_manager_use_external_app_cache;

    @e
    private String disable_post_add_topic_restriction;

    @e
    private String disable_post_compilation;

    @e
    private String disable_post_gesture_to_userhome;

    @e
    private String disable_proxy_line_select;

    @e
    private String disable_restore_auto_saved_draft;

    @e
    private String disable_share_private_chat_btn;

    @e
    private String disable_top_tab_trigger_refresh;

    @e
    private String disable_user_centered_search;

    @e
    private String dlc_v2;

    @e
    private String enable_doh;

    @e
    private String enable_new_bbs_comment_style;

    @e
    private String enable_new_style_collect;

    @e
    private String enable_new_topic_hashtag_entry;

    @e
    private String enable_search_refresh_feeds;

    @e
    private EventLogConfigObj eventlog104;

    @e
    private String favour_button_time;

    @e
    private String game_global_price_dialog_v3;

    @e
    private String game_tap_time;

    @e
    private String getui_count_sdk;

    @e
    private String hide_platforms;

    @e
    private String inject_js_by_progress;

    @e
    private String is_internal_request;

    @e
    private String item_button_time;

    @e
    private String link_detail_lt_desc;

    @e
    private String link_detail_not_wait_web_ready;

    @e
    private String local_html_enabled;

    @e
    private String login_provider;

    @e
    private String mall_region;

    @e
    private String mall_region_alert_freq;

    @e
    private KeyDescObj max_me_bubble;

    @e
    private String mobile_game_time;

    @e
    private String new_topic_selector_outside;

    @e
    private String newcomer_notify_cooldown;

    @e
    private String news_list_group;

    @e
    private String news_list_type;

    @e
    private String news_tap_time;

    @e
    private String open_post_scroll_reply_owner;

    @e
    private String rank_button_time;

    @e
    private String roll_game_time;

    @e
    private List<String> schemes;

    @e
    private ScreenShotShareEnable screenshot_share_enabled;

    @e
    private String search_button_time;

    @e
    private String search_welcome_page_v2;

    @e
    private String search_welcome_page_v3;

    @e
    private String show_member_bulletin;

    @e
    private String show_mobile_game;

    @e
    private String show_mobile_game_center_icon;

    @e
    private String show_post_topic_guide_once;

    @e
    private String show_steamcards_purchase;

    @e
    private String store_button_time;

    @e
    private String style_switch;

    @e
    private TabConfigObj tab_config;

    @e
    private String task_button_time;

    @e
    private String triggle_protocol;

    @e
    private String upload_log;

    @e
    private String valid_ws;

    @e
    private String weapon_button_time;

    @d
    private String web_link_full_url = "1";

    @d
    private String web_env_src = "1";

    @d
    private String auto_refresh_interval = "0";

    @e
    private String release_resources = "0";

    @e
    private String clear_crash_level = "0";

    @d
    private String oaid_update_enable = "0";

    @d
    private String use_old_feed_back = "0";

    @d
    private String ssiv_end_scale_animate = "0";

    @d
    private String bbs_text_view_small_icon = "0";

    @e
    private String disable_open_link_when_post = "0";

    @e
    private String disable_show_story_overlay_tips = "0";

    @e
    private String show_fullscreen_award_guide = "1";

    @e
    private String disable_web_link_fullscreen_award = "0";

    @e
    private String disable_web_global_page_report = "0";

    @e
    public final String getAccount_tap_time() {
        return this.account_tap_time;
    }

    @e
    public final String getActivity_button_time() {
        return this.activity_button_time;
    }

    @e
    public final String getAndroid_coco() {
        return this.android_coco;
    }

    @e
    public final String getAndroid_disable_only_cookie_manger() {
        return this.android_disable_only_cookie_manger;
    }

    @e
    public final String getAndroid_okhttp_custom_error_retry() {
        return this.android_okhttp_custom_error_retry;
    }

    @e
    public final AppTabsObj getApp_tabs() {
        return this.app_tabs;
    }

    @d
    public final String getAuto_refresh_interval() {
        return this.auto_refresh_interval;
    }

    @e
    public final String getBbs_tap_time() {
        return this.bbs_tap_time;
    }

    @d
    public final String getBbs_text_view_small_icon() {
        return this.bbs_text_view_small_icon;
    }

    @e
    public final String getCan_manager_account_quantity() {
        return this.can_manager_account_quantity;
    }

    @e
    public final String getChat_copyed_token_regex() {
        return this.chat_copyed_token_regex;
    }

    @e
    public final String getClear_crash_level() {
        return this.clear_crash_level;
    }

    @e
    public final String getCommunity_wiki_tab() {
        return this.community_wiki_tab;
    }

    @e
    public final String getCompress_image() {
        return this.compress_image;
    }

    @e
    public final String getCopyed_token_regex() {
        return this.copyed_token_regex;
    }

    @e
    public final String getDisable_darkmode_error_correct() {
        return this.disable_darkmode_error_correct;
    }

    @e
    public final String getDisable_download_scan_so() {
        return this.disable_download_scan_so;
    }

    @e
    public final String getDisable_image_viewer_single_load() {
        return this.disable_image_viewer_single_load;
    }

    @e
    public final String getDisable_moment_privacy_setting() {
        return this.disable_moment_privacy_setting;
    }

    @e
    public final String getDisable_new_origin_image_compress() {
        return this.disable_new_origin_image_compress;
    }

    @e
    public final String getDisable_new_style_emoji_keyboard() {
        return this.disable_new_style_emoji_keyboard;
    }

    @e
    public final String getDisable_new_time_desc_rule() {
        return this.disable_new_time_desc_rule;
    }

    @e
    public final String getDisable_open_link_when_post() {
        return this.disable_open_link_when_post;
    }

    @e
    public final String getDisable_picture_cache_manager_use_external_app_cache() {
        return this.disable_picture_cache_manager_use_external_app_cache;
    }

    @e
    public final String getDisable_post_add_topic_restriction() {
        return this.disable_post_add_topic_restriction;
    }

    @e
    public final String getDisable_post_compilation() {
        return this.disable_post_compilation;
    }

    @e
    public final String getDisable_post_gesture_to_userhome() {
        return this.disable_post_gesture_to_userhome;
    }

    @e
    public final String getDisable_proxy_line_select() {
        return this.disable_proxy_line_select;
    }

    @e
    public final String getDisable_restore_auto_saved_draft() {
        return this.disable_restore_auto_saved_draft;
    }

    @e
    public final String getDisable_share_private_chat_btn() {
        return this.disable_share_private_chat_btn;
    }

    @e
    public final String getDisable_show_story_overlay_tips() {
        return this.disable_show_story_overlay_tips;
    }

    @e
    public final String getDisable_top_tab_trigger_refresh() {
        return this.disable_top_tab_trigger_refresh;
    }

    @e
    public final String getDisable_user_centered_search() {
        return this.disable_user_centered_search;
    }

    @e
    public final String getDisable_web_global_page_report() {
        return this.disable_web_global_page_report;
    }

    @e
    public final String getDisable_web_link_fullscreen_award() {
        return this.disable_web_link_fullscreen_award;
    }

    @e
    public final String getDlc_v2() {
        return this.dlc_v2;
    }

    @e
    public final String getEnable_doh() {
        return this.enable_doh;
    }

    @e
    public final String getEnable_new_bbs_comment_style() {
        return this.enable_new_bbs_comment_style;
    }

    @e
    public final String getEnable_new_style_collect() {
        return this.enable_new_style_collect;
    }

    @e
    public final String getEnable_new_topic_hashtag_entry() {
        return this.enable_new_topic_hashtag_entry;
    }

    @e
    public final String getEnable_search_refresh_feeds() {
        return this.enable_search_refresh_feeds;
    }

    @e
    public final EventLogConfigObj getEventlog104() {
        return this.eventlog104;
    }

    @e
    public final String getFavour_button_time() {
        return this.favour_button_time;
    }

    @e
    public final String getGame_global_price_dialog_v3() {
        return this.game_global_price_dialog_v3;
    }

    @e
    public final String getGame_tap_time() {
        return this.game_tap_time;
    }

    @e
    public final String getGetui_count_sdk() {
        return this.getui_count_sdk;
    }

    @e
    public final String getHide_platforms() {
        return this.hide_platforms;
    }

    @e
    public final String getInject_js_by_progress() {
        return this.inject_js_by_progress;
    }

    @e
    public final String getItem_button_time() {
        return this.item_button_time;
    }

    @e
    public final String getLink_detail_lt_desc() {
        return this.link_detail_lt_desc;
    }

    @e
    public final String getLink_detail_not_wait_web_ready() {
        return this.link_detail_not_wait_web_ready;
    }

    @e
    public final String getLocal_html_enabled() {
        return this.local_html_enabled;
    }

    @e
    public final String getLogin_provider() {
        return this.login_provider;
    }

    @e
    public final String getMall_region() {
        return this.mall_region;
    }

    @e
    public final String getMall_region_alert_freq() {
        return this.mall_region_alert_freq;
    }

    @e
    public final KeyDescObj getMax_me_bubble() {
        return this.max_me_bubble;
    }

    @e
    public final String getMobile_game_time() {
        return this.mobile_game_time;
    }

    @e
    public final String getNew_topic_selector_outside() {
        return this.new_topic_selector_outside;
    }

    @e
    public final String getNewcomer_notify_cooldown() {
        return this.newcomer_notify_cooldown;
    }

    @e
    public final String getNews_list_group() {
        return this.news_list_group;
    }

    @e
    public final String getNews_list_type() {
        return this.news_list_type;
    }

    @e
    public final String getNews_tap_time() {
        return this.news_tap_time;
    }

    @d
    public final String getOaid_update_enable() {
        return this.oaid_update_enable;
    }

    @e
    public final String getOpen_post_scroll_reply_owner() {
        return this.open_post_scroll_reply_owner;
    }

    @e
    public final String getRank_button_time() {
        return this.rank_button_time;
    }

    @e
    public final String getRelease_resources() {
        return this.release_resources;
    }

    @e
    public final String getRoll_game_time() {
        return this.roll_game_time;
    }

    @e
    public final List<String> getSchemes() {
        return this.schemes;
    }

    @e
    public final ScreenShotShareEnable getScreenshot_share_enabled() {
        return this.screenshot_share_enabled;
    }

    @e
    public final String getSearch_button_time() {
        return this.search_button_time;
    }

    @e
    public final String getSearch_welcome_page_v2() {
        return this.search_welcome_page_v2;
    }

    @e
    public final String getSearch_welcome_page_v3() {
        return this.search_welcome_page_v3;
    }

    @e
    public final String getShow_fullscreen_award_guide() {
        return this.show_fullscreen_award_guide;
    }

    @e
    public final String getShow_member_bulletin() {
        return this.show_member_bulletin;
    }

    @e
    public final String getShow_mobile_game() {
        return this.show_mobile_game;
    }

    @e
    public final String getShow_mobile_game_center_icon() {
        return this.show_mobile_game_center_icon;
    }

    @e
    public final String getShow_post_topic_guide_once() {
        return this.show_post_topic_guide_once;
    }

    @e
    public final String getShow_steamcards_purchase() {
        return this.show_steamcards_purchase;
    }

    @d
    public final String getSsiv_end_scale_animate() {
        return this.ssiv_end_scale_animate;
    }

    @e
    public final String getStore_button_time() {
        return this.store_button_time;
    }

    @e
    public final String getStyle_switch() {
        return this.style_switch;
    }

    @e
    public final TabConfigObj getTab_config() {
        return this.tab_config;
    }

    @e
    public final String getTask_button_time() {
        return this.task_button_time;
    }

    @e
    public final String getTriggle_protocol() {
        return this.triggle_protocol;
    }

    @e
    public final String getUpload_log() {
        return this.upload_log;
    }

    @d
    public final String getUse_old_feed_back() {
        return this.use_old_feed_back;
    }

    @e
    public final String getValid_ws() {
        return this.valid_ws;
    }

    @e
    public final String getWeapon_button_time() {
        return this.weapon_button_time;
    }

    @d
    public final String getWeb_env_src() {
        return this.web_env_src;
    }

    @d
    public final String getWeb_link_full_url() {
        return this.web_link_full_url;
    }

    @e
    public final String is_internal_request() {
        return this.is_internal_request;
    }

    public final void setAccount_tap_time(@e String str) {
        this.account_tap_time = str;
    }

    public final void setActivity_button_time(@e String str) {
        this.activity_button_time = str;
    }

    public final void setAndroid_coco(@e String str) {
        this.android_coco = str;
    }

    public final void setAndroid_disable_only_cookie_manger(@e String str) {
        this.android_disable_only_cookie_manger = str;
    }

    public final void setAndroid_okhttp_custom_error_retry(@e String str) {
        this.android_okhttp_custom_error_retry = str;
    }

    public final void setApp_tabs(@e AppTabsObj appTabsObj) {
        this.app_tabs = appTabsObj;
    }

    public final void setAuto_refresh_interval(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 13992, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.auto_refresh_interval = str;
    }

    public final void setBbs_tap_time(@e String str) {
        this.bbs_tap_time = str;
    }

    public final void setBbs_text_view_small_icon(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 13996, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.bbs_text_view_small_icon = str;
    }

    public final void setCan_manager_account_quantity(@e String str) {
        this.can_manager_account_quantity = str;
    }

    public final void setChat_copyed_token_regex(@e String str) {
        this.chat_copyed_token_regex = str;
    }

    public final void setClear_crash_level(@e String str) {
        this.clear_crash_level = str;
    }

    public final void setCommunity_wiki_tab(@e String str) {
        this.community_wiki_tab = str;
    }

    public final void setCompress_image(@e String str) {
        this.compress_image = str;
    }

    public final void setCopyed_token_regex(@e String str) {
        this.copyed_token_regex = str;
    }

    public final void setDisable_darkmode_error_correct(@e String str) {
        this.disable_darkmode_error_correct = str;
    }

    public final void setDisable_download_scan_so(@e String str) {
        this.disable_download_scan_so = str;
    }

    public final void setDisable_image_viewer_single_load(@e String str) {
        this.disable_image_viewer_single_load = str;
    }

    public final void setDisable_moment_privacy_setting(@e String str) {
        this.disable_moment_privacy_setting = str;
    }

    public final void setDisable_new_origin_image_compress(@e String str) {
        this.disable_new_origin_image_compress = str;
    }

    public final void setDisable_new_style_emoji_keyboard(@e String str) {
        this.disable_new_style_emoji_keyboard = str;
    }

    public final void setDisable_new_time_desc_rule(@e String str) {
        this.disable_new_time_desc_rule = str;
    }

    public final void setDisable_open_link_when_post(@e String str) {
        this.disable_open_link_when_post = str;
    }

    public final void setDisable_picture_cache_manager_use_external_app_cache(@e String str) {
        this.disable_picture_cache_manager_use_external_app_cache = str;
    }

    public final void setDisable_post_add_topic_restriction(@e String str) {
        this.disable_post_add_topic_restriction = str;
    }

    public final void setDisable_post_compilation(@e String str) {
        this.disable_post_compilation = str;
    }

    public final void setDisable_post_gesture_to_userhome(@e String str) {
        this.disable_post_gesture_to_userhome = str;
    }

    public final void setDisable_proxy_line_select(@e String str) {
        this.disable_proxy_line_select = str;
    }

    public final void setDisable_restore_auto_saved_draft(@e String str) {
        this.disable_restore_auto_saved_draft = str;
    }

    public final void setDisable_share_private_chat_btn(@e String str) {
        this.disable_share_private_chat_btn = str;
    }

    public final void setDisable_show_story_overlay_tips(@e String str) {
        this.disable_show_story_overlay_tips = str;
    }

    public final void setDisable_top_tab_trigger_refresh(@e String str) {
        this.disable_top_tab_trigger_refresh = str;
    }

    public final void setDisable_user_centered_search(@e String str) {
        this.disable_user_centered_search = str;
    }

    public final void setDisable_web_global_page_report(@e String str) {
        this.disable_web_global_page_report = str;
    }

    public final void setDisable_web_link_fullscreen_award(@e String str) {
        this.disable_web_link_fullscreen_award = str;
    }

    public final void setDlc_v2(@e String str) {
        this.dlc_v2 = str;
    }

    public final void setEnable_doh(@e String str) {
        this.enable_doh = str;
    }

    public final void setEnable_new_bbs_comment_style(@e String str) {
        this.enable_new_bbs_comment_style = str;
    }

    public final void setEnable_new_style_collect(@e String str) {
        this.enable_new_style_collect = str;
    }

    public final void setEnable_new_topic_hashtag_entry(@e String str) {
        this.enable_new_topic_hashtag_entry = str;
    }

    public final void setEnable_search_refresh_feeds(@e String str) {
        this.enable_search_refresh_feeds = str;
    }

    public final void setEventlog104(@e EventLogConfigObj eventLogConfigObj) {
        this.eventlog104 = eventLogConfigObj;
    }

    public final void setFavour_button_time(@e String str) {
        this.favour_button_time = str;
    }

    public final void setGame_global_price_dialog_v3(@e String str) {
        this.game_global_price_dialog_v3 = str;
    }

    public final void setGame_tap_time(@e String str) {
        this.game_tap_time = str;
    }

    public final void setGetui_count_sdk(@e String str) {
        this.getui_count_sdk = str;
    }

    public final void setHide_platforms(@e String str) {
        this.hide_platforms = str;
    }

    public final void setInject_js_by_progress(@e String str) {
        this.inject_js_by_progress = str;
    }

    public final void setItem_button_time(@e String str) {
        this.item_button_time = str;
    }

    public final void setLink_detail_lt_desc(@e String str) {
        this.link_detail_lt_desc = str;
    }

    public final void setLink_detail_not_wait_web_ready(@e String str) {
        this.link_detail_not_wait_web_ready = str;
    }

    public final void setLocal_html_enabled(@e String str) {
        this.local_html_enabled = str;
    }

    public final void setLogin_provider(@e String str) {
        this.login_provider = str;
    }

    public final void setMall_region(@e String str) {
        this.mall_region = str;
    }

    public final void setMall_region_alert_freq(@e String str) {
        this.mall_region_alert_freq = str;
    }

    public final void setMax_me_bubble(@e KeyDescObj keyDescObj) {
        this.max_me_bubble = keyDescObj;
    }

    public final void setMobile_game_time(@e String str) {
        this.mobile_game_time = str;
    }

    public final void setNew_topic_selector_outside(@e String str) {
        this.new_topic_selector_outside = str;
    }

    public final void setNewcomer_notify_cooldown(@e String str) {
        this.newcomer_notify_cooldown = str;
    }

    public final void setNews_list_group(@e String str) {
        this.news_list_group = str;
    }

    public final void setNews_list_type(@e String str) {
        this.news_list_type = str;
    }

    public final void setNews_tap_time(@e String str) {
        this.news_tap_time = str;
    }

    public final void setOaid_update_enable(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 13993, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.oaid_update_enable = str;
    }

    public final void setOpen_post_scroll_reply_owner(@e String str) {
        this.open_post_scroll_reply_owner = str;
    }

    public final void setRank_button_time(@e String str) {
        this.rank_button_time = str;
    }

    public final void setRelease_resources(@e String str) {
        this.release_resources = str;
    }

    public final void setRoll_game_time(@e String str) {
        this.roll_game_time = str;
    }

    public final void setSchemes(@e List<String> list) {
        this.schemes = list;
    }

    public final void setScreenshot_share_enabled(@e ScreenShotShareEnable screenShotShareEnable) {
        this.screenshot_share_enabled = screenShotShareEnable;
    }

    public final void setSearch_button_time(@e String str) {
        this.search_button_time = str;
    }

    public final void setSearch_welcome_page_v2(@e String str) {
        this.search_welcome_page_v2 = str;
    }

    public final void setSearch_welcome_page_v3(@e String str) {
        this.search_welcome_page_v3 = str;
    }

    public final void setShow_fullscreen_award_guide(@e String str) {
        this.show_fullscreen_award_guide = str;
    }

    public final void setShow_member_bulletin(@e String str) {
        this.show_member_bulletin = str;
    }

    public final void setShow_mobile_game(@e String str) {
        this.show_mobile_game = str;
    }

    public final void setShow_mobile_game_center_icon(@e String str) {
        this.show_mobile_game_center_icon = str;
    }

    public final void setShow_post_topic_guide_once(@e String str) {
        this.show_post_topic_guide_once = str;
    }

    public final void setShow_steamcards_purchase(@e String str) {
        this.show_steamcards_purchase = str;
    }

    public final void setSsiv_end_scale_animate(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 13995, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.ssiv_end_scale_animate = str;
    }

    public final void setStore_button_time(@e String str) {
        this.store_button_time = str;
    }

    public final void setStyle_switch(@e String str) {
        this.style_switch = str;
    }

    public final void setTab_config(@e TabConfigObj tabConfigObj) {
        this.tab_config = tabConfigObj;
    }

    public final void setTask_button_time(@e String str) {
        this.task_button_time = str;
    }

    public final void setTriggle_protocol(@e String str) {
        this.triggle_protocol = str;
    }

    public final void setUpload_log(@e String str) {
        this.upload_log = str;
    }

    public final void setUse_old_feed_back(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 13994, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.use_old_feed_back = str;
    }

    public final void setValid_ws(@e String str) {
        this.valid_ws = str;
    }

    public final void setWeapon_button_time(@e String str) {
        this.weapon_button_time = str;
    }

    public final void setWeb_env_src(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 13991, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.web_env_src = str;
    }

    public final void setWeb_link_full_url(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 13990, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.web_link_full_url = str;
    }

    public final void set_internal_request(@e String str) {
        this.is_internal_request = str;
    }
}
