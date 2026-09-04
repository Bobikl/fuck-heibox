package com.max.xiaoheihe.bean.game;

import com.alibaba.fastjson.annotation.JSONField;
import com.google.gson.annotations.SerializedName;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.xiaoheihe.bean.ButtonObj;
import com.max.xiaoheihe.bean.RelatedGoodsInfo;
import com.max.xiaoheihe.bean.TypedButtonObj;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.max.xiaoheihe.bean.bbs.LastEventObj;
import com.max.xiaoheihe.bean.bbs.LinkInfoObj;
import com.max.xiaoheihe.bean.rich.RichStackModelObj;
import com.max.xiaoheihe.module.game.d0;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class GameDetailsObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 4995880202045722585L;
    private String about_the_game;
    private String appicon;

    @SerializedName(alternate = {d0.f87248t}, value = "appid")
    @JSONField(alternateNames = {d0.f87248t}, name = "appid")
    private String appid;
    private String bind_follow;
    private ButtonObj bottom_btn;
    private List<GameBundleObj> bundles;
    private List<String> button_style_list;
    private List<TypedButtonObj> button_style_list_v2;
    private String carts_count;
    private String comment_change;
    private String comment_state;
    private GameCommentStatsObj comment_stats;
    private List<CommentTrendInfo> comment_trend;
    private List<GameDetailCommonTags> common_tags;
    private String deadline_desc;
    private String deadline_timestamp;
    private GameObj demo_concat_game;
    private String demo_concat_game_title;
    private String desc;
    private String developer_test_state;
    private GamePeakValueObj developer_words;
    private String display_add_wishlist;
    private List<GameBundleObj> dlcs;
    private String follow_num;
    private String follow_state;
    private String follow_state_v2;
    private FreeLicenseObj freelicense;
    private List<GameAwardObj> game_award;
    private String game_data_url;
    private GameImpressTagListObj game_impressions;
    private String game_review_summary;
    private String game_type;
    private List<KeyDescObj> genres_list;
    private GroupingPriceObj grouping_price;
    private HardwarePerformance hardware_performance;
    private String has_game_data;
    private String has_game_detail;
    private String has_steam_comment;
    private String has_unfinished_order;
    private String has_wiki;
    private GamePriceObj heybox_price;
    private List<KeyDescObj> hot_tags;
    private List<KeyDescObj> icon_style_list;
    private String image;
    private String impression_score;
    private boolean is_free;
    private String is_official;
    private boolean is_release;
    private String is_show_all_price;
    private LastEventObj latest_event;
    private String like_lottie_key;
    private String live_url;
    private String main_color;
    private String media_view_new_style;
    private List<GameDetailMenuObj> menu;
    private List<KeyDescObj> menu_v2;
    private GamePriceObj minimum_price;
    private List<GameObj> morelike;
    private MultiDimensionRadarObj multidimensional_score_radar;
    private String name;
    private String name_en;
    private List<GameNavMenuObj> nav_menu;
    private String order_id;
    private String order_src;
    private String order_type;
    private GameObj origin_game;
    private String own_state;
    private String platf;
    private List<GamePlatformInfoObj> platform_infos;
    private GamePlatformPriceObj platform_price;
    private List<GamePlatformTagObj> platform_tags;
    private List<String> platforms;
    private List<GamePlatformInfoObj> platforms_list;
    private List<String> platforms_url;
    private String positive_desc;
    private GamePreviewInfoObj preview_info;
    private GamePriceObj price;
    private CommentSpecialTagObj price_bg_color;
    private String price_placeholder;
    private RichStackModelObj price_rich_text;
    private String product_type;
    private List<GameObj> publisher_games;
    private String purchase_url;
    private List<GlobalRegionPriceObj> region_prices;
    private RelatedGoodsInfo related_good;
    private String release_date;
    private String score;
    private String score_desc;
    private CommentSpecialTagObj screen_shot_bg_color;
    private List<GameScreenshotObj> screenshots;
    private String share_bg_img;
    private String share_desc;
    private String share_img;
    private String share_title;
    private String share_url;
    private String show_authentic_guarantee;
    private String show_luck_coupon;
    private List<GameObj> similar_games;
    private List<KeyDescObj> special_tags_v2;
    private GameSubscribeInfoObj subscribe_info;
    private String subscribe_state;
    private int support_chinese;
    private BBSTopicObj topic_detail;
    private String topic_vote_url;
    private String type;
    private LinkInfoObj user_comment;
    private GameUserNumObj user_num;
    private String wish_rank;

    public String getAbout_the_game() {
        return this.about_the_game;
    }

    public String getAppicon() {
        return this.appicon;
    }

    public String getAppid() {
        return this.appid;
    }

    public String getBind_follow() {
        return this.bind_follow;
    }

    public ButtonObj getBottom_btn() {
        return this.bottom_btn;
    }

    public List<GameBundleObj> getBundles() {
        return this.bundles;
    }

    public List<String> getButton_style_list() {
        return this.button_style_list;
    }

    public List<TypedButtonObj> getButton_style_list_v2() {
        return this.button_style_list_v2;
    }

    public String getCarts_count() {
        return this.carts_count;
    }

    public String getComment_change() {
        return this.comment_change;
    }

    public String getComment_state() {
        return this.comment_state;
    }

    public GameCommentStatsObj getComment_stats() {
        return this.comment_stats;
    }

    public List<CommentTrendInfo> getComment_trend() {
        return this.comment_trend;
    }

    public List<GameDetailCommonTags> getCommon_tags() {
        return this.common_tags;
    }

    public String getDeadline_desc() {
        return this.deadline_desc;
    }

    public String getDeadline_timestamp() {
        return this.deadline_timestamp;
    }

    public GameObj getDemo_concat_game() {
        return this.demo_concat_game;
    }

    public String getDemo_concat_game_title() {
        return this.demo_concat_game_title;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getDeveloper_test_state() {
        return this.developer_test_state;
    }

    public GamePeakValueObj getDeveloper_words() {
        return this.developer_words;
    }

    public String getDisplay_add_wishlist() {
        return this.display_add_wishlist;
    }

    public List<GameBundleObj> getDlcs() {
        return this.dlcs;
    }

    public String getFollow_num() {
        return this.follow_num;
    }

    @Deprecated
    public String getFollow_state() {
        return this.follow_state;
    }

    public String getFollow_state_v2() {
        return this.follow_state_v2;
    }

    public FreeLicenseObj getFreelicense() {
        return this.freelicense;
    }

    public List<GameAwardObj> getGame_award() {
        return this.game_award;
    }

    public String getGame_data_url() {
        return this.game_data_url;
    }

    public GameImpressTagListObj getGame_impressions() {
        return this.game_impressions;
    }

    public String getGame_review_summary() {
        return this.game_review_summary;
    }

    public String getGame_type() {
        return this.game_type;
    }

    public List<KeyDescObj> getGenres_list() {
        return this.genres_list;
    }

    public GroupingPriceObj getGrouping_price() {
        return this.grouping_price;
    }

    public HardwarePerformance getHardware_performance() {
        return this.hardware_performance;
    }

    public String getHas_game_data() {
        return this.has_game_data;
    }

    public String getHas_game_detail() {
        return this.has_game_detail;
    }

    public String getHas_steam_comment() {
        return this.has_steam_comment;
    }

    public String getHas_unfinished_order() {
        return this.has_unfinished_order;
    }

    public String getHas_wiki() {
        return this.has_wiki;
    }

    public GamePriceObj getHeybox_price() {
        return this.heybox_price;
    }

    public List<KeyDescObj> getHot_tags() {
        return this.hot_tags;
    }

    public List<KeyDescObj> getIcon_style_list() {
        return this.icon_style_list;
    }

    public String getImage() {
        return this.image;
    }

    public String getImpression_score() {
        return this.impression_score;
    }

    public String getIs_official() {
        return this.is_official;
    }

    public String getIs_show_all_price() {
        return this.is_show_all_price;
    }

    public LastEventObj getLatest_event() {
        return this.latest_event;
    }

    public String getLike_lottie_key() {
        return this.like_lottie_key;
    }

    public String getLive_url() {
        return this.live_url;
    }

    public String getMain_color() {
        return this.main_color;
    }

    public String getMedia_view_new_style() {
        return this.media_view_new_style;
    }

    public List<GameDetailMenuObj> getMenu() {
        return this.menu;
    }

    public List<KeyDescObj> getMenu_v2() {
        return this.menu_v2;
    }

    public GamePriceObj getMinimum_price() {
        return this.minimum_price;
    }

    public List<GameObj> getMorelike() {
        return this.morelike;
    }

    public MultiDimensionRadarObj getMultidimensional_score_radar() {
        return this.multidimensional_score_radar;
    }

    public String getName() {
        return this.name;
    }

    public String getName_en() {
        return this.name_en;
    }

    public List<GameNavMenuObj> getNav_menu() {
        return this.nav_menu;
    }

    public String getOrder_id() {
        return this.order_id;
    }

    public String getOrder_src() {
        return this.order_src;
    }

    public String getOrder_type() {
        return this.order_type;
    }

    public GameObj getOrigin_game() {
        return this.origin_game;
    }

    public String getOwn_state() {
        return this.own_state;
    }

    public String getPlatf() {
        return this.platf;
    }

    public List<GamePlatformInfoObj> getPlatform_infos() {
        return this.platform_infos;
    }

    public GamePlatformPriceObj getPlatform_price() {
        return this.platform_price;
    }

    public List<GamePlatformTagObj> getPlatform_tags() {
        return this.platform_tags;
    }

    public List<String> getPlatforms() {
        return this.platforms;
    }

    public List<GamePlatformInfoObj> getPlatforms_list() {
        return this.platforms_list;
    }

    public List<String> getPlatforms_url() {
        return this.platforms_url;
    }

    public String getPositive_desc() {
        return this.positive_desc;
    }

    public GamePreviewInfoObj getPreview_info() {
        return this.preview_info;
    }

    public GamePriceObj getPrice() {
        return this.price;
    }

    public CommentSpecialTagObj getPrice_bg_color() {
        return this.price_bg_color;
    }

    public String getPrice_placeholder() {
        return this.price_placeholder;
    }

    public RichStackModelObj getPrice_rich_text() {
        return this.price_rich_text;
    }

    public String getProduct_type() {
        return this.product_type;
    }

    public List<GameObj> getPublisher_games() {
        return this.publisher_games;
    }

    public String getPurchase_url() {
        return this.purchase_url;
    }

    public List<GlobalRegionPriceObj> getRegion_prices() {
        return this.region_prices;
    }

    public RelatedGoodsInfo getRelated_good() {
        return this.related_good;
    }

    public String getRelease_date() {
        return this.release_date;
    }

    public String getScore() {
        return this.score;
    }

    public String getScore_desc() {
        return this.score_desc;
    }

    public CommentSpecialTagObj getScreen_shot_bg_color() {
        return this.screen_shot_bg_color;
    }

    public List<GameScreenshotObj> getScreenshots() {
        return this.screenshots;
    }

    public String getShare_bg_img() {
        return this.share_bg_img;
    }

    public String getShare_desc() {
        return this.share_desc;
    }

    public String getShare_img() {
        return this.share_img;
    }

    public String getShare_title() {
        return this.share_title;
    }

    public String getShare_url() {
        return this.share_url;
    }

    public String getShow_authentic_guarantee() {
        return this.show_authentic_guarantee;
    }

    public String getShow_luck_coupon() {
        return this.show_luck_coupon;
    }

    public List<GameObj> getSimilar_games() {
        return this.similar_games;
    }

    public List<KeyDescObj> getSpecial_tags_v2() {
        return this.special_tags_v2;
    }

    public GameSubscribeInfoObj getSubscribe_info() {
        return this.subscribe_info;
    }

    public String getSubscribe_state() {
        return this.subscribe_state;
    }

    public int getSupport_chinese() {
        return this.support_chinese;
    }

    public BBSTopicObj getTopic_detail() {
        return this.topic_detail;
    }

    public String getTopic_vote_url() {
        return this.topic_vote_url;
    }

    public String getType() {
        return this.type;
    }

    public LinkInfoObj getUser_comment() {
        return this.user_comment;
    }

    public GameUserNumObj getUser_num() {
        return this.user_num;
    }

    public String getWish_rank() {
        return this.wish_rank;
    }

    public boolean isIs_free() {
        return this.is_free;
    }

    public boolean isIs_release() {
        return this.is_release;
    }

    public void setAbout_the_game(String str) {
        this.about_the_game = str;
    }

    public void setAppicon(String str) {
        this.appicon = str;
    }

    public void setAppid(String str) {
        this.appid = str;
    }

    public void setBind_follow(String str) {
        this.bind_follow = str;
    }

    public void setBottom_btn(ButtonObj buttonObj) {
        this.bottom_btn = buttonObj;
    }

    public void setBundles(List<GameBundleObj> list) {
        this.bundles = list;
    }

    public void setButton_style_list(List<String> list) {
        this.button_style_list = list;
    }

    public void setButton_style_list_v2(List<TypedButtonObj> list) {
        this.button_style_list_v2 = list;
    }

    public void setCarts_count(String str) {
        this.carts_count = str;
    }

    public void setComment_change(String str) {
        this.comment_change = str;
    }

    public void setComment_state(String str) {
        this.comment_state = str;
    }

    public void setComment_stats(GameCommentStatsObj gameCommentStatsObj) {
        this.comment_stats = gameCommentStatsObj;
    }

    public void setComment_trend(List<CommentTrendInfo> list) {
        this.comment_trend = list;
    }

    public void setCommon_tags(List<GameDetailCommonTags> list) {
        this.common_tags = list;
    }

    public void setDeadline_desc(String str) {
        this.deadline_desc = str;
    }

    public void setDeadline_timestamp(String str) {
        this.deadline_timestamp = str;
    }

    public void setDemo_concat_game(GameObj gameObj) {
        this.demo_concat_game = gameObj;
    }

    public void setDemo_concat_game_title(String str) {
        this.demo_concat_game_title = str;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setDeveloper_test_state(String str) {
        this.developer_test_state = str;
    }

    public void setDeveloper_words(GamePeakValueObj gamePeakValueObj) {
        this.developer_words = gamePeakValueObj;
    }

    public void setDisplay_add_wishlist(String str) {
        this.display_add_wishlist = str;
    }

    public void setDlcs(List<GameBundleObj> list) {
        this.dlcs = list;
    }

    public void setFollow_num(String str) {
        this.follow_num = str;
    }

    @Deprecated
    public void setFollow_state(String str) {
        this.follow_state = str;
    }

    public void setFollow_state_v2(String str) {
        this.follow_state_v2 = str;
    }

    public void setFreelicense(FreeLicenseObj freeLicenseObj) {
        this.freelicense = freeLicenseObj;
    }

    public void setGame_award(List<GameAwardObj> list) {
        this.game_award = list;
    }

    public void setGame_data_url(String str) {
        this.game_data_url = str;
    }

    public void setGame_impressions(GameImpressTagListObj gameImpressTagListObj) {
        this.game_impressions = gameImpressTagListObj;
    }

    public void setGame_review_summary(String str) {
        this.game_review_summary = str;
    }

    public void setGame_type(String str) {
        this.game_type = str;
    }

    public void setGenres_list(List<KeyDescObj> list) {
        this.genres_list = list;
    }

    public void setGrouping_price(GroupingPriceObj groupingPriceObj) {
        this.grouping_price = groupingPriceObj;
    }

    public void setHardware_performance(HardwarePerformance hardwarePerformance) {
        this.hardware_performance = hardwarePerformance;
    }

    public void setHas_game_data(String str) {
        this.has_game_data = str;
    }

    public void setHas_game_detail(String str) {
        this.has_game_detail = str;
    }

    public void setHas_steam_comment(String str) {
        this.has_steam_comment = str;
    }

    public void setHas_unfinished_order(String str) {
        this.has_unfinished_order = str;
    }

    public void setHas_wiki(String str) {
        this.has_wiki = str;
    }

    public void setHeybox_price(GamePriceObj gamePriceObj) {
        this.heybox_price = gamePriceObj;
    }

    public void setHot_tags(List<KeyDescObj> list) {
        this.hot_tags = list;
    }

    public void setIcon_style_list(List<KeyDescObj> list) {
        this.icon_style_list = list;
    }

    public void setImage(String str) {
        this.image = str;
    }

    public void setImpression_score(String str) {
        this.impression_score = str;
    }

    public void setIs_free(boolean z10) {
        this.is_free = z10;
    }

    public void setIs_official(String str) {
        this.is_official = str;
    }

    public void setIs_release(boolean z10) {
        this.is_release = z10;
    }

    public void setIs_show_all_price(String str) {
        this.is_show_all_price = str;
    }

    public void setLatest_event(LastEventObj lastEventObj) {
        this.latest_event = lastEventObj;
    }

    public void setLike_lottie_key(String str) {
        this.like_lottie_key = str;
    }

    public void setLive_url(String str) {
        this.live_url = str;
    }

    public void setMain_color(String str) {
        this.main_color = str;
    }

    public void setMedia_view_new_style(String str) {
        this.media_view_new_style = str;
    }

    public void setMenu(List<GameDetailMenuObj> list) {
        this.menu = list;
    }

    public void setMenu_v2(List<KeyDescObj> list) {
        this.menu_v2 = list;
    }

    public void setMinimum_price(GamePriceObj gamePriceObj) {
        this.minimum_price = gamePriceObj;
    }

    public void setMorelike(List<GameObj> list) {
        this.morelike = list;
    }

    public void setMultidimensional_score_radar(MultiDimensionRadarObj multiDimensionRadarObj) {
        this.multidimensional_score_radar = multiDimensionRadarObj;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setName_en(String str) {
        this.name_en = str;
    }

    public void setNav_menu(List<GameNavMenuObj> list) {
        this.nav_menu = list;
    }

    public void setOrder_id(String str) {
        this.order_id = str;
    }

    public void setOrder_src(String str) {
        this.order_src = str;
    }

    public void setOrder_type(String str) {
        this.order_type = str;
    }

    public void setOrigin_game(GameObj gameObj) {
        this.origin_game = gameObj;
    }

    public void setOwn_state(String str) {
        this.own_state = str;
    }

    public void setPlatf(String str) {
        this.platf = str;
    }

    public void setPlatform_infos(List<GamePlatformInfoObj> list) {
        this.platform_infos = list;
    }

    public void setPlatform_price(GamePlatformPriceObj gamePlatformPriceObj) {
        this.platform_price = gamePlatformPriceObj;
    }

    public void setPlatform_tags(List<GamePlatformTagObj> list) {
        this.platform_tags = list;
    }

    public void setPlatforms(List<String> list) {
        this.platforms = list;
    }

    public void setPlatforms_list(List<GamePlatformInfoObj> list) {
        this.platforms_list = list;
    }

    public void setPlatforms_url(List<String> list) {
        this.platforms_url = list;
    }

    public void setPositive_desc(String str) {
        this.positive_desc = str;
    }

    public void setPreview_info(GamePreviewInfoObj gamePreviewInfoObj) {
        this.preview_info = gamePreviewInfoObj;
    }

    public void setPrice(GamePriceObj gamePriceObj) {
        this.price = gamePriceObj;
    }

    public void setPrice_bg_color(CommentSpecialTagObj commentSpecialTagObj) {
        this.price_bg_color = commentSpecialTagObj;
    }

    public void setPrice_placeholder(String str) {
        this.price_placeholder = str;
    }

    public void setPrice_rich_text(RichStackModelObj richStackModelObj) {
        this.price_rich_text = richStackModelObj;
    }

    public void setProduct_type(String str) {
        this.product_type = str;
    }

    public void setPublisher_games(List<GameObj> list) {
        this.publisher_games = list;
    }

    public void setPurchase_url(String str) {
        this.purchase_url = str;
    }

    public void setRegion_prices(List<GlobalRegionPriceObj> list) {
        this.region_prices = list;
    }

    public void setRelated_good(RelatedGoodsInfo relatedGoodsInfo) {
        this.related_good = relatedGoodsInfo;
    }

    public void setRelease_date(String str) {
        this.release_date = str;
    }

    public void setScore(String str) {
        this.score = str;
    }

    public void setScore_desc(String str) {
        this.score_desc = str;
    }

    public void setScreen_shot_bg_color(CommentSpecialTagObj commentSpecialTagObj) {
        this.screen_shot_bg_color = commentSpecialTagObj;
    }

    public void setScreenshots(List<GameScreenshotObj> list) {
        this.screenshots = list;
    }

    public void setShare_bg_img(String str) {
        this.share_bg_img = str;
    }

    public void setShare_desc(String str) {
        this.share_desc = str;
    }

    public void setShare_img(String str) {
        this.share_img = str;
    }

    public void setShare_title(String str) {
        this.share_title = str;
    }

    public void setShare_url(String str) {
        this.share_url = str;
    }

    public void setShow_authentic_guarantee(String str) {
        this.show_authentic_guarantee = str;
    }

    public void setShow_luck_coupon(String str) {
        this.show_luck_coupon = str;
    }

    public void setSimilar_games(List<GameObj> list) {
        this.similar_games = list;
    }

    public void setSpecial_tags_v2(List<KeyDescObj> list) {
        this.special_tags_v2 = list;
    }

    public void setSubscribe_info(GameSubscribeInfoObj gameSubscribeInfoObj) {
        this.subscribe_info = gameSubscribeInfoObj;
    }

    public void setSubscribe_state(String str) {
        this.subscribe_state = str;
    }

    public void setSupport_chinese(int i10) {
        this.support_chinese = i10;
    }

    public void setTopic_detail(BBSTopicObj bBSTopicObj) {
        this.topic_detail = bBSTopicObj;
    }

    public void setTopic_vote_url(String str) {
        this.topic_vote_url = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUser_comment(LinkInfoObj linkInfoObj) {
        this.user_comment = linkInfoObj;
    }

    public void setUser_num(GameUserNumObj gameUserNumObj) {
        this.user_num = gameUserNumObj;
    }

    public void setWish_rank(String str) {
        this.wish_rank = str;
    }
}
