package com.max.xiaoheihe.bean.game;

import com.max.hbcommon.bean.KeyDescObj;
import com.max.xiaoheihe.bean.ButtonObj;
import com.max.xiaoheihe.bean.TypedButtonObj;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.max.xiaoheihe.bean.bbs.LastEventObj;
import com.max.xiaoheihe.bean.bbs.LinkInfoObj;
import com.max.xiaoheihe.bean.rich.RichStackModelObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class MobileGameDetailsObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -7936619250529629878L;
    private String about_the_game;
    private String appicon;
    private String appid;
    private ButtonObj bottom_btn;
    private String bundle_id;
    private List<String> bundle_ids;
    private String bundle_size;
    private List<String> button_style_list;
    private List<TypedButtonObj> button_style_list_v2;
    private String call_back;
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
    private List<GameBundleObj> dlcs;
    private String download_url_android;
    private String download_url_ios;
    private String follow_num;
    private String follow_state;
    private String follow_state_v2;
    private List<GameAwardObj> game_award;
    private List<GameDetailDataObj> game_data;
    private GameImpressTagListObj game_impressions;
    private String game_review_summary;
    private List<KeyDescObj> genres;
    private String has_unfinished_order;
    private GamePriceObj heybox_price;
    private List<KeyDescObj> hot_tags;
    private List<KeyDescObj> icon_style_list;
    private String image;
    private String impression_score;
    private boolean is_free;
    private String is_official;
    private boolean is_release;
    private String is_show_all_price;
    private String last_release_time;
    private LastEventObj latest_event;
    private String like_lottie_key;
    private String main_color;
    private String media_view_new_style;
    private List<KeyDescObj> menu_v2;
    private GamePriceObj minimum_price;
    private MultiDimensionRadarObj multidimensional_score_radar;
    private String name;
    private String name_en;
    private List<GameNavMenuObj> nav_menu;
    private String order_id;
    private String own_state;
    private List<String> platforms;
    private List<String> platforms_url;
    private String positive_desc;
    private GamePreviewInfoObj preview_info;
    private GamePriceObj price;
    private CommentSpecialTagObj price_bg_color;
    private String price_placeholder;
    private RichStackModelObj price_rich_text;
    private String purchase_url;
    private String purchased_state;
    private String report_url;
    private String score;
    private String score_desc;
    private CommentSpecialTagObj screen_shot_bg_color;
    private List<GameScreenshotObj> screenshots;
    private String share_bg_img;
    private String share_desc;
    private String share_img;
    private String share_title;
    private String share_url;
    private String short_desc;
    private GameSubscribeInfoObj subscribe_info;
    private String subscribe_state;
    private BBSTopicObj topic_detail;
    private String topic_vote_url;
    private String type;
    private String update_time;
    private LinkInfoObj user_comment;
    private String version_code;
    private String version_num;

    public String getAbout_the_game() {
        return this.about_the_game;
    }

    public String getAppicon() {
        return this.appicon;
    }

    public String getAppid() {
        return this.appid;
    }

    public ButtonObj getBottom_btn() {
        return this.bottom_btn;
    }

    public String getBundle_id() {
        return this.bundle_id;
    }

    public List<String> getBundle_ids() {
        return this.bundle_ids;
    }

    public String getBundle_size() {
        return this.bundle_size;
    }

    public List<String> getButton_style_list() {
        return this.button_style_list;
    }

    public List<TypedButtonObj> getButton_style_list_v2() {
        return this.button_style_list_v2;
    }

    public String getCall_back() {
        return this.call_back;
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

    public List<GameBundleObj> getDlcs() {
        return this.dlcs;
    }

    public String getDownload_url_android() {
        return this.download_url_android;
    }

    public String getDownload_url_ios() {
        return this.download_url_ios;
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

    public List<GameAwardObj> getGame_award() {
        return this.game_award;
    }

    public List<GameDetailDataObj> getGame_data() {
        return this.game_data;
    }

    public GameImpressTagListObj getGame_impressions() {
        return this.game_impressions;
    }

    public String getGame_review_summary() {
        return this.game_review_summary;
    }

    public List<KeyDescObj> getGenres() {
        return this.genres;
    }

    public String getHas_unfinished_order() {
        return this.has_unfinished_order;
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

    public String getLast_release_time() {
        return this.last_release_time;
    }

    public LastEventObj getLatest_event() {
        return this.latest_event;
    }

    public String getLike_lottie_key() {
        return this.like_lottie_key;
    }

    public String getMain_color() {
        return this.main_color;
    }

    public String getMedia_view_new_style() {
        return this.media_view_new_style;
    }

    public List<KeyDescObj> getMenu_v2() {
        return this.menu_v2;
    }

    public GamePriceObj getMinimum_price() {
        return this.minimum_price;
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

    public String getOwn_state() {
        return this.own_state;
    }

    public List<String> getPlatforms() {
        return this.platforms;
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

    public String getPurchase_url() {
        return this.purchase_url;
    }

    public String getPurchased_state() {
        return this.purchased_state;
    }

    public String getReport_url() {
        return this.report_url;
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

    public String getShort_desc() {
        return this.short_desc;
    }

    public GameSubscribeInfoObj getSubscribe_info() {
        return this.subscribe_info;
    }

    public String getSubscribe_state() {
        return this.subscribe_state;
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

    public String getUpdate_time() {
        return this.update_time;
    }

    public LinkInfoObj getUser_comment() {
        return this.user_comment;
    }

    public String getVersion_code() {
        return this.version_code;
    }

    public String getVersion_num() {
        return this.version_num;
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

    public void setBottom_btn(ButtonObj buttonObj) {
        this.bottom_btn = buttonObj;
    }

    public void setBundle_id(String str) {
        this.bundle_id = str;
    }

    public void setBundle_ids(List<String> list) {
        this.bundle_ids = list;
    }

    public void setBundle_size(String str) {
        this.bundle_size = str;
    }

    public void setButton_style_list(List<String> list) {
        this.button_style_list = list;
    }

    public void setButton_style_list_v2(List<TypedButtonObj> list) {
        this.button_style_list_v2 = list;
    }

    public void setCall_back(String str) {
        this.call_back = str;
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

    public void setDlcs(List<GameBundleObj> list) {
        this.dlcs = list;
    }

    public void setDownload_url_android(String str) {
        this.download_url_android = str;
    }

    public void setDownload_url_ios(String str) {
        this.download_url_ios = str;
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

    public void setGame_award(List<GameAwardObj> list) {
        this.game_award = list;
    }

    public void setGame_data(List<GameDetailDataObj> list) {
        this.game_data = list;
    }

    public void setGame_impressions(GameImpressTagListObj gameImpressTagListObj) {
        this.game_impressions = gameImpressTagListObj;
    }

    public void setGame_review_summary(String str) {
        this.game_review_summary = str;
    }

    public void setGenres(List<KeyDescObj> list) {
        this.genres = list;
    }

    public void setHas_unfinished_order(String str) {
        this.has_unfinished_order = str;
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

    public void setLast_release_time(String str) {
        this.last_release_time = str;
    }

    public void setLatest_event(LastEventObj lastEventObj) {
        this.latest_event = lastEventObj;
    }

    public void setLike_lottie_key(String str) {
        this.like_lottie_key = str;
    }

    public void setMain_color(String str) {
        this.main_color = str;
    }

    public void setMedia_view_new_style(String str) {
        this.media_view_new_style = str;
    }

    public void setMenu_v2(List<KeyDescObj> list) {
        this.menu_v2 = list;
    }

    public void setMinimum_price(GamePriceObj gamePriceObj) {
        this.minimum_price = gamePriceObj;
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

    public void setOwn_state(String str) {
        this.own_state = str;
    }

    public void setPlatforms(List<String> list) {
        this.platforms = list;
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

    public void setPurchase_url(String str) {
        this.purchase_url = str;
    }

    public void setPurchased_state(String str) {
        this.purchased_state = str;
    }

    public void setReport_url(String str) {
        this.report_url = str;
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

    public void setShort_desc(String str) {
        this.short_desc = str;
    }

    public void setSubscribe_info(GameSubscribeInfoObj gameSubscribeInfoObj) {
        this.subscribe_info = gameSubscribeInfoObj;
    }

    public void setSubscribe_state(String str) {
        this.subscribe_state = str;
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

    public void setUpdate_time(String str) {
        this.update_time = str;
    }

    public void setUser_comment(LinkInfoObj linkInfoObj) {
        this.user_comment = linkInfoObj;
    }

    public void setVersion_code(String str) {
        this.version_code = str;
    }

    public void setVersion_num(String str) {
        this.version_num = str;
    }
}
