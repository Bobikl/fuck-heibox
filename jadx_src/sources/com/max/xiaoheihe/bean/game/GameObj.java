package com.max.xiaoheihe.bean.game;

import androidx.annotation.p0;
import com.alibaba.fastjson.annotation.JSONField;
import com.google.gson.annotations.SerializedName;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.utils.c;
import com.max.xiaoheihe.bean.account.AchieveObj;
import com.max.xiaoheihe.bean.rich.RichAttributeModelObj;
import com.max.xiaoheihe.module.game.d0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class GameObj extends GamePublishBaseObj implements Serializable {
    public static final String COMMENT_CHANGE_HAS_PERMISSION = "1";
    public static final String COMMENT_CHANGE_NO_PERMISSION = "0";
    public static final String COMMENT_STATE_HAS_PLAYED = "1";
    public static final String COMMENT_STATE_SPOILERS = "3";
    public static final String COMMENT_STATE_WANT_TO_PLAY = "2";
    public static final String DEVELOPER_TEST_STATE_APPLIED = "2";
    public static final String DEVELOPER_TEST_STATE_FAILED = "-1";
    public static final String DEVELOPER_TEST_STATE_NOT_APPLIED = "0";
    public static final String DEVELOPER_TEST_STATE_SUCCESS = "1";
    public static final String ENTRY_EPIC_FREE = "Epic限免";
    public static final String ENTRY_HEYBOX_FREE = "特惠资讯";
    public static final String FILTER_HEAD_MOBILE = "mobile";
    public static final String FILTER_HEAD_PC = "pc";
    public static final String FILTER_HEAD_PS4 = "ps4";
    public static final String FILTER_HEAD_SCRIPT = "script";
    public static final String FILTER_HEAD_SWITCH = "switch";
    public static final String FOLLOW_STATE_FOLLOWING = "following";
    public static final String FOLLOW_STATE_OWNED = "owned";
    public static final String FOLLOW_STATE_UNFOLLOWING = "unfollowing";
    public static final String GAME_CSGO_KEY = "csgo_common";
    public static final String GAME_TYPE_CONSOLE = "console";
    public static final String GAME_TYPE_MOBILE = "mobile";
    public static final String GAME_TYPE_PC = "pc";
    public static final String KEY_POINT_CALENDAR = "calendar";
    public static final String KEY_POINT_DEVELOPER = "developer";
    public static final String KEY_POINT_DISCOUNT = "discount";
    public static final String KEY_POINT_DISCOUNT_LIST = "discount_list";
    public static final String KEY_POINT_FOLLOWED = "followed";
    public static final String KEY_POINT_FOLLOW_LIST = "follow_list";
    public static final String KEY_POINT_FOLLOW_NUM = "follow_num";
    public static final String KEY_POINT_FOLLOW_STATE = "follow_state";
    public static final String KEY_POINT_GAME_PLATFORM = "game_platform";
    public static final String KEY_POINT_PEAK_CHANGE = "peak_change";
    public static final String KEY_POINT_PEAK_MAX = "peak_max";
    public static final String KEY_POINT_PEAK_USER_NUM = "peak_user_num";
    public static final String KEY_POINT_PRICE = "price";
    public static final String KEY_POINT_RECOMMEND = "recommend";
    public static final String KEY_POINT_RELEASE_DATE = "release_date";
    public static final String KEY_POINT_SCORE = "score";
    public static final String LABEL_ADVERTISE = "advertise";
    public static final String PLATFORM_CSGO = "csgo";
    public static final String PLATFORM_CSGO_KEY = "csgo";
    public static final String PLATFORM_CSGO_NAME = "CSGO";
    public static final String PLATFORM_DOTA2 = "dota2";
    public static final String PLATFORM_DOTA2_KEY = "dota2";
    public static final String PLATFORM_DOTA2_NAME = "Dota2";
    public static final String PLATFORM_EPIC = "epic";
    public static final String PLATFORM_EPIC_KEY = "epic";
    public static final String PLATFORM_HARDWARE_KEY = "pc";
    public static final String PLATFORM_PC = "pc";
    public static final String PLATFORM_PS4 = "ps4";
    public static final String PLATFORM_PS_KEY = "psn";
    public static final String PLATFORM_STEAM_KEY = "steam";
    public static final String PLATFORM_SWITCH = "switch";
    public static final String PLATFORM_SWITCH_KEY = "switch";
    public static final String PLATFORM_XBOX_KEY = "xbox";
    public static final String REC_TYPE_COLLECTION_1X10 = "collection_1x10";
    public static final String REC_TYPE_COLLECTION_3X3 = "collection_3x3";
    public static final String REC_TYPE_GAME = "game";
    public static final String REC_TYPE_HEADER_GAME = "header_game";
    public static final String SUBSCRIBE_STATE_SUBSCRIBING = "subscribing";
    public static final String SUBSCRIBE_STATE_UNSUBSCRIBING = "unsubscribing";
    public static final String TAG_TYPE_COUPON = "coupon";
    public static final String TAG_TYPE_REC = "rec";
    public static final String TAG_TYPE_TAG = "tag";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -105623414412748892L;
    private int achieved;
    private int achieved_count;
    private String achieved_end_color;
    private String achieved_exp;
    private String achieved_point;
    private String achieved_rank;
    private String achieved_start_color;
    private String achievement_cleared_icon;
    private int achievement_count;
    private String achievement_exp;
    private int achivement_count;
    private String added_type;
    private String appicon;

    @SerializedName(alternate = {"app_id", d0.f87248t}, value = "appid")
    @JSONField(alternateNames = {"app_id", d0.f87248t}, name = "appid")
    private String appid;
    private String background;
    private String bronze;
    private String bundle_id;
    private String bundle_size;
    private String clear_time;
    private String collection_id;
    private String comment_create_at;
    private String comment_playtime;
    private String comment_score;
    private String coupon_id;
    private String current_gamerscore;
    private GameObj custom_comment_related_game;
    private String custom_index;
    private String custom_suggested_from;
    private String detail_url;
    private String download_url_android;
    private String end_color;
    private String expect_num;
    private String follow_num;
    private String follow_state;
    private String follows;
    private List<GameObj> game_list;
    private String game_type;
    private List<KeyDescObj> genres_v2;
    private String gold;
    private String h_src;
    private int has_achievement;
    private String has_game_data;
    private int has_game_detail;
    private List<RichAttributeModelObj> hb_rich_texts;
    private GamePriceObj heybox_price;
    private List<KeyDescObj> hot_tags;
    private String hs_inventory;
    private String image;
    private String in_wish_list;
    private String index;
    private String is_cleared;
    private boolean is_dlc;
    private String is_expired;
    private boolean is_free;
    private boolean is_free_get;
    private String is_owned;
    private boolean is_release;
    private String is_switch_add;
    private String is_use_new_style;
    private List<AchieveObj> items;
    private String label;
    private String last_play_time;
    private String last_release_time;
    private String main_color;
    private String name;
    private String name_en;
    private String need_to_comment;
    private String newcomer_tag;
    private boolean not_owned;
    private String online_player;
    private String overlay_color;
    private String package_id;
    private String peak_change;
    private String peak_max;
    private String peak_time;
    private String peak_user_num;
    private List<GamePeakValueObj> peak_values;
    private List<GamePlatformInfoObj> platform_infos;
    private List<String> platforms;
    private List<String> platforms_icon;
    private List<String> platforms_url;
    private String players;
    private String playtime_2weeks;
    private String playtime_forever;

    @SerializedName(alternate = {"percent"}, value = "playtime_percent")
    @JSONField(alternateNames = {"percent"}, name = "playtime_percent")
    private String playtime_percent;
    private String playtime_rank;
    private GamePriceObj price;
    private GamePriceObj price_info;
    private String protocol;
    private String purchased_state;
    private int rank;
    private String recommend_desc;
    private String release_date;
    private String release_time;
    private String release_timestamp;
    private String report_id;
    private transient boolean reported_exposure;
    private List<RichAttributeModelObj> rich_tags;
    private String score;
    private String score_comment;
    private String score_desc;
    private List<GameScreenshotObj> screenshots;
    private String share_bg_img;
    private String short_desc;
    private String show_cleared_icon;
    private String show_create_at;
    private String silver;
    private List<KeyDescObj> special_tags_v2;
    private String start_color;
    private List<String> tags;
    private String time_desc;
    private String title;
    private String total_gamerscore;
    private String type;
    private String version_code;
    private String version_num;
    public static final String PLATFORM_STEAM = "platform_steam";
    public static final String PLATFORM_PS = "platform_ps";
    public static final String PLATFORM_XBOX = "platform_xbox";
    public static final String PLATFORM_HARDWARE = "platform_hardware";
    public static ArrayList<String> ALL_PLATFORMS = new ArrayList<>(Arrays.asList(PLATFORM_STEAM, "switch", PLATFORM_PS, PLATFORM_XBOX, "epic", PLATFORM_HARDWARE));
    public static ArrayList<String> MAX_ALL_PLATFORMS = new ArrayList<>(Arrays.asList("dota2", "csgo", PLATFORM_STEAM, PLATFORM_HARDWARE));
    public static final String PLATFORM_STEAM_NAME = "Steam";
    public static ArrayList<String> PLATFORM_STEAM_NAMES = new ArrayList<>(Arrays.asList(PLATFORM_STEAM, "steam", PLATFORM_STEAM_NAME));
    public static final String PLATFORM_SWITCH_NAME = "Switch";
    public static ArrayList<String> PLATFORM_SWITCH_NAMES = new ArrayList<>(Arrays.asList("switch", PLATFORM_SWITCH_NAME, "ns", "switchjp", "switchall"));
    public static final String PLATFORM_PS_NAME = "PSN";
    public static ArrayList<String> PLATFORM_PSN_NAMES = new ArrayList<>(Arrays.asList(PLATFORM_PS, "psn", PLATFORM_PS_NAME, "ps4", "ps"));
    public static final String PLATFORM_XBOX_NAME = "Xbox";
    public static ArrayList<String> PLATFORM_XBOX_NAMES = new ArrayList<>(Arrays.asList(PLATFORM_XBOX, "xbox", PLATFORM_XBOX_NAME));
    public static final String PLATFORM_EPIC_NAME = "Epic";
    public static ArrayList<String> PLATFORM_EPIC_NAMES = new ArrayList<>(Arrays.asList("epic", PLATFORM_EPIC_NAME));
    public static ArrayList<String> PLATFORM_PC_NAMES = new ArrayList<>(Arrays.asList(PLATFORM_HARDWARE, "pc"));
    public static String showConsoleGameFirst = "0";
    public static int ITEM_TYPE_NORMAL = 0;
    public static int ITEM_TYPE_DATA_CARD = 1;
    public static int ITEM_TYPE_GAMECOMMENT_TIPS = 2;
    private int itemType = ITEM_TYPE_NORMAL;
    private Boolean showDivider = Boolean.TRUE;
    private boolean auto_download = false;

    public boolean equals(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14834, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (obj == null || !(obj instanceof GameObj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return !c.u(this.appid) && this.appid.equals(((GameObj) obj).appid);
    }

    public int getAchieved() {
        return this.achieved;
    }

    public int getAchieved_count() {
        return this.achieved_count;
    }

    public String getAchieved_end_color() {
        return this.achieved_end_color;
    }

    public String getAchieved_exp() {
        return this.achieved_exp;
    }

    public String getAchieved_point() {
        return this.achieved_point;
    }

    public String getAchieved_rank() {
        return this.achieved_rank;
    }

    public String getAchieved_start_color() {
        return this.achieved_start_color;
    }

    public String getAchievement_cleared_icon() {
        return this.achievement_cleared_icon;
    }

    public int getAchievement_count() {
        return this.achievement_count;
    }

    public String getAchievement_exp() {
        return this.achievement_exp;
    }

    public int getAchivement_count() {
        return this.achivement_count;
    }

    public String getAdded_type() {
        return this.added_type;
    }

    public String getAppicon() {
        return this.appicon;
    }

    public String getAppid() {
        return this.appid;
    }

    public String getBackground() {
        return this.background;
    }

    public String getBronze() {
        return this.bronze;
    }

    public String getBundle_id() {
        return this.bundle_id;
    }

    public String getBundle_size() {
        return this.bundle_size;
    }

    public String getClear_time() {
        return this.clear_time;
    }

    public String getCollection_id() {
        return this.collection_id;
    }

    public String getComment_create_at() {
        return this.comment_create_at;
    }

    public String getComment_playtime() {
        return this.comment_playtime;
    }

    public String getComment_score() {
        return this.comment_score;
    }

    public String getCoupon_id() {
        return this.coupon_id;
    }

    public String getCurrent_gamerscore() {
        return this.current_gamerscore;
    }

    public GameObj getCustom_comment_related_game() {
        return this.custom_comment_related_game;
    }

    public String getCustom_index() {
        return this.custom_index;
    }

    public String getCustom_suggested_from() {
        return this.custom_suggested_from;
    }

    public String getDetail_url() {
        return this.detail_url;
    }

    public String getDownload_url_android() {
        return this.download_url_android;
    }

    public String getEnd_color() {
        return this.end_color;
    }

    public String getExpect_num() {
        return this.expect_num;
    }

    public String getFollow_num() {
        return this.follow_num;
    }

    public String getFollow_state() {
        return this.follow_state;
    }

    public String getFollows() {
        return this.follows;
    }

    public List<GameObj> getGame_list() {
        return this.game_list;
    }

    public String getGame_type() {
        return this.game_type;
    }

    public List<KeyDescObj> getGenres_v2() {
        return this.genres_v2;
    }

    public String getGold() {
        return this.gold;
    }

    @p0
    public String getH_src() {
        return this.h_src;
    }

    public int getHas_achievement() {
        return this.has_achievement;
    }

    public String getHas_game_data() {
        return this.has_game_data;
    }

    public int getHas_game_detail() {
        return this.has_game_detail;
    }

    public List<RichAttributeModelObj> getHb_rich_texts() {
        return this.hb_rich_texts;
    }

    public GamePriceObj getHeybox_price() {
        return this.heybox_price;
    }

    public List<KeyDescObj> getHot_tags() {
        return this.hot_tags;
    }

    public String getHs_inventory() {
        return this.hs_inventory;
    }

    public String getImage() {
        return this.image;
    }

    public String getIn_wish_list() {
        return this.in_wish_list;
    }

    public String getIndex() {
        return this.index;
    }

    public String getIs_cleared() {
        return this.is_cleared;
    }

    public String getIs_expired() {
        return this.is_expired;
    }

    public String getIs_owned() {
        return this.is_owned;
    }

    public String getIs_switch_add() {
        return this.is_switch_add;
    }

    public String getIs_use_new_style() {
        return this.is_use_new_style;
    }

    public int getItemType() {
        return this.itemType;
    }

    public List<AchieveObj> getItems() {
        return this.items;
    }

    public String getLabel() {
        return this.label;
    }

    public String getLast_play_time() {
        return this.last_play_time;
    }

    public String getLast_release_time() {
        return this.last_release_time;
    }

    public String getMain_color() {
        return this.main_color;
    }

    public String getName() {
        return this.name;
    }

    public String getName_en() {
        return this.name_en;
    }

    public String getNeed_to_comment() {
        return this.need_to_comment;
    }

    public String getNewcomer_tag() {
        return this.newcomer_tag;
    }

    public String getOnline_player() {
        return this.online_player;
    }

    public String getOverlay_color() {
        return this.overlay_color;
    }

    public String getPackage_id() {
        return this.package_id;
    }

    public String getPeak_change() {
        return this.peak_change;
    }

    public String getPeak_max() {
        return this.peak_max;
    }

    public String getPeak_time() {
        return this.peak_time;
    }

    public String getPeak_user_num() {
        return this.peak_user_num;
    }

    public List<GamePeakValueObj> getPeak_values() {
        return this.peak_values;
    }

    public List<GamePlatformInfoObj> getPlatform_infos() {
        return this.platform_infos;
    }

    public List<String> getPlatforms() {
        return this.platforms;
    }

    public List<String> getPlatforms_icon() {
        return this.platforms_icon;
    }

    public List<String> getPlatforms_url() {
        return this.platforms_url;
    }

    public String getPlayers() {
        return this.players;
    }

    public String getPlaytime_2weeks() {
        return this.playtime_2weeks;
    }

    public String getPlaytime_forever() {
        return this.playtime_forever;
    }

    public String getPlaytime_percent() {
        return this.playtime_percent;
    }

    public String getPlaytime_rank() {
        return this.playtime_rank;
    }

    public GamePriceObj getPrice() {
        return this.price;
    }

    public GamePriceObj getPrice_info() {
        return this.price_info;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public String getPurchased_state() {
        return this.purchased_state;
    }

    public int getRank() {
        return this.rank;
    }

    public String getRecommend_desc() {
        return this.recommend_desc;
    }

    public String getRelease_date() {
        return this.release_date;
    }

    public String getRelease_time() {
        return this.release_time;
    }

    public String getRelease_timestamp() {
        return this.release_timestamp;
    }

    @p0
    public String getReport_id() {
        return this.report_id;
    }

    public List<RichAttributeModelObj> getRich_tags() {
        return this.rich_tags;
    }

    public String getScore() {
        return this.score;
    }

    public String getScore_comment() {
        return this.score_comment;
    }

    public String getScore_desc() {
        return this.score_desc;
    }

    public List<GameScreenshotObj> getScreenshots() {
        return this.screenshots;
    }

    public String getShare_bg_img() {
        return this.share_bg_img;
    }

    public String getShort_desc() {
        return this.short_desc;
    }

    public Boolean getShowDivider() {
        return this.showDivider;
    }

    public String getShow_cleared_icon() {
        return this.show_cleared_icon;
    }

    public String getShow_create_at() {
        return this.show_create_at;
    }

    public String getSilver() {
        return this.silver;
    }

    public List<KeyDescObj> getSpecial_tags_v2() {
        return this.special_tags_v2;
    }

    public String getStart_color() {
        return this.start_color;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public String getTime_desc() {
        return this.time_desc;
    }

    public String getTitle() {
        return this.title;
    }

    public String getTotal_gamerscore() {
        return this.total_gamerscore;
    }

    public String getType() {
        return this.type;
    }

    public String getVersion_code() {
        return this.version_code;
    }

    public String getVersion_num() {
        return this.version_num;
    }

    public boolean isAuto_download() {
        return this.auto_download;
    }

    public boolean isIs_dlc() {
        return this.is_dlc;
    }

    public boolean isIs_free() {
        return this.is_free;
    }

    public boolean isIs_free_get() {
        return this.is_free_get;
    }

    public boolean isIs_release() {
        return this.is_release;
    }

    public boolean isNot_owned() {
        return this.not_owned;
    }

    public boolean isReported_exposure() {
        return this.reported_exposure;
    }

    public void setAchieved(int i10) {
        this.achieved = i10;
    }

    public void setAchieved_count(int i10) {
        this.achieved_count = i10;
    }

    public void setAchieved_end_color(String str) {
        this.achieved_end_color = str;
    }

    public void setAchieved_exp(String str) {
        this.achieved_exp = str;
    }

    public void setAchieved_point(String str) {
        this.achieved_point = str;
    }

    public void setAchieved_rank(String str) {
        this.achieved_rank = str;
    }

    public void setAchieved_start_color(String str) {
        this.achieved_start_color = str;
    }

    public void setAchievement_cleared_icon(String str) {
        this.achievement_cleared_icon = str;
    }

    public void setAchievement_count(int i10) {
        this.achievement_count = i10;
    }

    public void setAchievement_exp(String str) {
        this.achievement_exp = str;
    }

    public void setAchivement_count(int i10) {
        this.achivement_count = i10;
    }

    public void setAdded_type(String str) {
        this.added_type = str;
    }

    public void setAppicon(String str) {
        this.appicon = str;
    }

    public void setAppid(String str) {
        this.appid = str;
    }

    public void setAuto_download(boolean z10) {
        this.auto_download = z10;
    }

    public void setBackground(String str) {
        this.background = str;
    }

    public void setBronze(String str) {
        this.bronze = str;
    }

    public void setBundle_id(String str) {
        this.bundle_id = str;
    }

    public void setBundle_size(String str) {
        this.bundle_size = str;
    }

    public void setClear_time(String str) {
        this.clear_time = str;
    }

    public void setCollection_id(String str) {
        this.collection_id = str;
    }

    public void setComment_create_at(String str) {
        this.comment_create_at = str;
    }

    public void setComment_playtime(String str) {
        this.comment_playtime = str;
    }

    public void setComment_score(String str) {
        this.comment_score = str;
    }

    public void setCoupon_id(String str) {
        this.coupon_id = str;
    }

    public void setCurrent_gamerscore(String str) {
        this.current_gamerscore = str;
    }

    public void setCustom_comment_related_game(GameObj gameObj) {
        this.custom_comment_related_game = gameObj;
    }

    public void setCustom_index(String str) {
        this.custom_index = str;
    }

    public void setCustom_suggested_from(String str) {
        this.custom_suggested_from = str;
    }

    public void setDetail_url(String str) {
        this.detail_url = str;
    }

    public void setDownload_url_android(String str) {
        this.download_url_android = str;
    }

    public void setEnd_color(String str) {
        this.end_color = str;
    }

    public void setExpect_num(String str) {
        this.expect_num = str;
    }

    public void setFollow_num(String str) {
        this.follow_num = str;
    }

    public void setFollow_state(String str) {
        this.follow_state = str;
    }

    public void setFollows(String str) {
        this.follows = str;
    }

    public void setGame_list(List<GameObj> list) {
        this.game_list = list;
    }

    public void setGame_type(String str) {
        this.game_type = str;
    }

    public void setGenres_v2(List<KeyDescObj> list) {
        this.genres_v2 = list;
    }

    public void setGold(String str) {
        this.gold = str;
    }

    public void setH_src(String str) {
        this.h_src = str;
    }

    public void setHas_achievement(int i10) {
        this.has_achievement = i10;
    }

    public void setHas_game_data(String str) {
        this.has_game_data = str;
    }

    public void setHas_game_detail(int i10) {
        this.has_game_detail = i10;
    }

    public void setHb_rich_texts(List<RichAttributeModelObj> list) {
        this.hb_rich_texts = list;
    }

    public void setHeybox_price(GamePriceObj gamePriceObj) {
        this.heybox_price = gamePriceObj;
    }

    public void setHot_tags(List<KeyDescObj> list) {
        this.hot_tags = list;
    }

    public void setHs_inventory(String str) {
        this.hs_inventory = str;
    }

    public void setImage(String str) {
        this.image = str;
    }

    public void setIn_wish_list(String str) {
        this.in_wish_list = str;
    }

    public void setIndex(String str) {
        this.index = str;
    }

    public void setIs_cleared(String str) {
        this.is_cleared = str;
    }

    public void setIs_dlc(boolean z10) {
        this.is_dlc = z10;
    }

    public void setIs_expired(String str) {
        this.is_expired = str;
    }

    public void setIs_free(boolean z10) {
        this.is_free = z10;
    }

    public void setIs_free_get(boolean z10) {
        this.is_free_get = z10;
    }

    public void setIs_owned(String str) {
        this.is_owned = str;
    }

    public void setIs_release(boolean z10) {
        this.is_release = z10;
    }

    public void setIs_switch_add(String str) {
        this.is_switch_add = str;
    }

    public void setIs_use_new_style(String str) {
        this.is_use_new_style = str;
    }

    public void setItemType(int i10) {
        this.itemType = i10;
    }

    public void setItems(List<AchieveObj> list) {
        this.items = list;
    }

    public void setLabel(String str) {
        this.label = str;
    }

    public void setLast_play_time(String str) {
        this.last_play_time = str;
    }

    public void setLast_release_time(String str) {
        this.last_release_time = str;
    }

    public void setMain_color(String str) {
        this.main_color = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setName_en(String str) {
        this.name_en = str;
    }

    public void setNeed_to_comment(String str) {
        this.need_to_comment = str;
    }

    public void setNewcomer_tag(String str) {
        this.newcomer_tag = str;
    }

    public void setNot_owned(boolean z10) {
        this.not_owned = z10;
    }

    public void setOnline_player(String str) {
        this.online_player = str;
    }

    public void setOverlay_color(String str) {
        this.overlay_color = str;
    }

    public void setPackage_id(String str) {
        this.package_id = str;
    }

    public void setPeak_change(String str) {
        this.peak_change = str;
    }

    public void setPeak_max(String str) {
        this.peak_max = str;
    }

    public void setPeak_time(String str) {
        this.peak_time = str;
    }

    public void setPeak_user_num(String str) {
        this.peak_user_num = str;
    }

    public void setPeak_values(List<GamePeakValueObj> list) {
        this.peak_values = list;
    }

    public void setPlatform_infos(List<GamePlatformInfoObj> list) {
        this.platform_infos = list;
    }

    public void setPlatforms(List<String> list) {
        this.platforms = list;
    }

    public void setPlatforms_icon(List<String> list) {
        this.platforms_icon = list;
    }

    public void setPlatforms_url(List<String> list) {
        this.platforms_url = list;
    }

    public void setPlayers(String str) {
        this.players = str;
    }

    public void setPlaytime_2weeks(String str) {
        this.playtime_2weeks = str;
    }

    public void setPlaytime_forever(String str) {
        this.playtime_forever = str;
    }

    public void setPlaytime_percent(String str) {
        this.playtime_percent = str;
    }

    public void setPlaytime_rank(String str) {
        this.playtime_rank = str;
    }

    public void setPrice(GamePriceObj gamePriceObj) {
        this.price = gamePriceObj;
    }

    public void setPrice_info(GamePriceObj gamePriceObj) {
        this.price_info = gamePriceObj;
    }

    public void setProtocol(String str) {
        this.protocol = str;
    }

    public void setPurchased_state(String str) {
        this.purchased_state = str;
    }

    public void setRank(int i10) {
        this.rank = i10;
    }

    public void setRecommend_desc(String str) {
        this.recommend_desc = str;
    }

    public void setRelease_date(String str) {
        this.release_date = str;
    }

    public void setRelease_time(String str) {
        this.release_time = str;
    }

    public void setRelease_timestamp(String str) {
        this.release_timestamp = str;
    }

    public void setReport_id(@p0 String str) {
        this.report_id = str;
    }

    public void setReported_exposure(boolean z10) {
        this.reported_exposure = z10;
    }

    public void setRich_tags(List<RichAttributeModelObj> list) {
        this.rich_tags = list;
    }

    public void setScore(String str) {
        this.score = str;
    }

    public void setScore_comment(String str) {
        this.score_comment = str;
    }

    public void setScore_desc(String str) {
        this.score_desc = str;
    }

    public void setScreenshots(List<GameScreenshotObj> list) {
        this.screenshots = list;
    }

    public void setShare_bg_img(String str) {
        this.share_bg_img = str;
    }

    public void setShort_desc(String str) {
        this.short_desc = str;
    }

    public void setShowDivider(Boolean bool) {
        this.showDivider = bool;
    }

    public void setShow_cleared_icon(String str) {
        this.show_cleared_icon = str;
    }

    public void setShow_create_at(String str) {
        this.show_create_at = str;
    }

    public void setSilver(String str) {
        this.silver = str;
    }

    public void setSpecial_tags_v2(List<KeyDescObj> list) {
        this.special_tags_v2 = list;
    }

    public void setStart_color(String str) {
        this.start_color = str;
    }

    public void setTags(List<String> list) {
        this.tags = list;
    }

    public void setTime_desc(String str) {
        this.time_desc = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTotal_gamerscore(String str) {
        this.total_gamerscore = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setVersion_code(String str) {
        this.version_code = str;
    }

    public void setVersion_num(String str) {
        this.version_num = str;
    }

    public GamePlayStatObj toGamePlayStatObj() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14833, new Class[0], GamePlayStatObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GamePlayStatObj) patchProxyResultProxy.result;
        }
        GamePlayStatObj gamePlayStatObj = new GamePlayStatObj();
        gamePlayStatObj.setGame_info(this);
        gamePlayStatObj.setPlaytime_2weeks(this.playtime_2weeks);
        gamePlayStatObj.setPlaytime_forever(this.playtime_forever);
        gamePlayStatObj.setAchieved_count(this.achieved);
        gamePlayStatObj.setAchieved_point(this.achieved_point);
        gamePlayStatObj.setAchieved_rank(this.achieved_rank);
        gamePlayStatObj.setAchivement_count(this.achievement_count);
        gamePlayStatObj.setStart_color(this.start_color);
        gamePlayStatObj.setEnd_color(this.end_color);
        gamePlayStatObj.setPlaytime_rank(this.playtime_rank);
        gamePlayStatObj.setAchieved_start_color(this.achieved_start_color);
        gamePlayStatObj.setAchieved_end_color(this.achieved_end_color);
        gamePlayStatObj.setPlaytime_percent(this.playtime_percent);
        return gamePlayStatObj;
    }
}
