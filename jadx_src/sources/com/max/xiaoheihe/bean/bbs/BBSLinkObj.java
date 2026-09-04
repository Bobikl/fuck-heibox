package com.max.xiaoheihe.bean.bbs;

import androidx.annotation.p0;
import com.google.gson.annotations.SerializedName;
import com.max.basebbs.bean.video.VideoInfoObj;
import com.max.basebbs.utils.AccelWorldBBSKt;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.bean.analytics.BBSLinkViewShowsObj;
import com.max.hbcommon.utils.c;
import com.max.hbstory.bean.StoryBBSUserInfoObj;
import com.max.hbstory.bean.StoryCardIdInfoObj;
import com.max.hbstory.bean.StoryImgInfoObj;
import com.max.hbstory.bean.StoryImgObj;
import com.max.hbstory.bean.StoryItemsObj;
import com.max.hbstory.bean.StoryLinkCardInfoObj;
import com.max.hbstory.bean.StoryStatInfoObj;
import com.max.hbstory.bean.StoryVideoInfoObj;
import com.max.hbuikit.bean.UiKitViewObj;
import com.max.hbutils.utils.k;
import com.max.hbutils.utils.n;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.max.xiaoheihe.bean.rich.RichAttributeModelObj;
import com.max.xiaoheihe.bean.rich.RichStackModelObj;
import com.max.xiaoheihe.module.littleprogram.fragment.RollRoomDetailFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.open.SocialConstants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class BBSLinkObj extends FeedsContentBaseObj implements Serializable {
    public static final String ARTICLE_TYPE_ORIGINAL = "1";
    public static final String ARTICLE_TYPE_REPRINTED = "0";
    public static final String AUTH_TIPS_1 = "1";
    public static final String AUTH_TIPS_2 = "2";
    public static final String AUTH_TYPE_DENIED = "2";
    public static final String AUTH_TYPE_GRANTED = "1";
    public static final String COMMENT_STATE_DISABLE = "1";
    public static final String COMMENT_STATE_ENABLE = "0";
    public static final String CONTENT_TYPE_AD = "23";
    public static final String CONTENT_TYPE_AD_LARGE = "27";
    public static final String CONTENT_TYPE_AD_TINNY = "26";
    public static final String CONTENT_TYPE_COMMUNITY_AD_LARGE = "29";
    public static final String CONTENT_TYPE_COMMUNITY_AD_TINNY = "28";
    public static final String CONTENT_TYPE_EVENT_LIST = "52";
    public static final String CONTENT_TYPE_EXPRESS_NEWS = "30";
    public static final String CONTENT_TYPE_FORWARD = "40";
    public static final String CONTENT_TYPE_GAME_COMMENT = "42";
    public static final String CONTENT_TYPE_GAME_COMPILATION = "8";
    public static final String CONTENT_TYPE_HEAD_IMG = "20";
    public static final String CONTENT_TYPE_HOR_EVENT = "53";
    public static final String CONTENT_TYPE_HOR_LINK_LIST = "51";
    public static final String CONTENT_TYPE_HOT_COMMENT = "19";
    public static final String CONTENT_TYPE_LINK = "4";
    public static final String CONTENT_TYPE_LINK_COLLECTION = "47";
    public static final String CONTENT_TYPE_LINK_NEWS = "1";
    public static final String CONTENT_TYPE_LINK_NEWS_WITH_TOP_USER = "50";
    public static final String CONTENT_TYPE_LOGIN_TIPS = "18";
    public static final String CONTENT_TYPE_MENU = "10";
    public static final String CONTENT_TYPE_MOBILE_IMG = "13";
    public static final String CONTENT_TYPE_MOBILE_VIDEO = "12";
    public static final String CONTENT_TYPE_NEWS_CONFIG = "44";
    public static final String CONTENT_TYPE_NEWS_LINK_V2 = "33";
    public static final String CONTENT_TYPE_NEWS_LINK_V3 = "36";
    public static final String CONTENT_TYPE_NEWS_LINK_V4 = "38";
    public static final String CONTENT_TYPE_NEWS_LONG_IMG = "16";
    public static final String CONTENT_TYPE_NEWS_MULTI_IMG = "14";
    public static final String CONTENT_TYPE_NEWS_NO_IMG = "15";
    public static final String CONTENT_TYPE_NEWS_SUBJECT = "7";
    public static final String CONTENT_TYPE_NEWS_TOP = "43";
    public static final String CONTENT_TYPE_NEWS_V2 = "35";
    public static final String CONTENT_TYPE_NEWS_V3 = "37";
    public static final String CONTENT_TYPE_NEWS_V4 = "39";
    public static final String CONTENT_TYPE_PRIMITIVE_NEWS = "0";
    public static final String CONTENT_TYPE_QUESTION = "5";
    public static final String CONTENT_TYPE_RECOMMENDED_GAME = "3";
    public static final String CONTENT_TYPE_RECOMMENDED_GAME_LIST = "6";
    public static final String CONTENT_TYPE_RECOMMENDED_HASHTAG = "24";
    public static final String CONTENT_TYPE_RECOMMENDED_NEWS = "21";
    public static final String CONTENT_TYPE_RECOMMENDED_SWITCH = "22";
    public static final String CONTENT_TYPE_REC_LINK = "32";
    public static final String CONTENT_TYPE_REC_USERS = "41";
    public static final String CONTENT_TYPE_REC_WRITE_ARTICLE = "31";
    public static final String CONTENT_TYPE_SHORT_NEWS = "11";
    public static final String CONTENT_TYPE_TOPIC_ENTRY = "46";
    public static final String CONTENT_TYPE_UI_KIT = "45";
    public static final String CONTENT_TYPE_WEB_LINK_NEWS = "2";
    public static final String CONTENT_TYPE_WIKI = "9";
    public static final String FIRE_STATUS_LARGE = "2";
    public static final String FIRE_STATUS_NONE = "0";
    public static final String FIRE_STATUS_SMALL = "1";
    public static final String FORBID_OBJ_TYPE_COMMENT = "comment";
    public static final String FORBID_OBJ_TYPE_LINK = "link";
    public static final String FROM_ALTERNATIVE_RECOMMEND_LINK_LIST = "7";
    public static final String FROM_DEFAULT_LINK_LIST = "2";
    public static final String FROM_FOLLOWED_TOPIC_LINK_LIST = "4";
    public static final String FROM_FOLLOWED_USER_LINK_LIST = "6";
    public static final String FROM_HOT_TOPIC_LINK_LIST = "5";
    public static final String FROM_NEWS_LIST = "3";
    public static final String FROM_OTHER_LIST = "8";
    public static final String FROM_RECOMMEND_LINK_LIST = "1";
    public static final String FROM_RECOMMEND_NEWS_LIST = "9";
    public static final String FROM_RECOMMEND_VIDEO_LIST = "10";
    public static final String FROM_RELATED_VIDEO_LIST = "11";
    public static final String LINK_TAG_ANSWER_LINK = "8";
    public static final String LINK_TAG_AS_RELATED_MOMENTS = "19";
    public static final String LINK_TAG_COMMON_LINK = "1";
    public static final String LINK_TAG_CONCEPT_LINK = "26";
    public static final String LINK_TAG_DELETED = "-1";
    public static final String LINK_TAG_DYNAMIC_PAGE_URL = "29";
    public static final String LINK_TAG_FEEDBACK_LINK = "10";
    public static final String LINK_TAG_FORBID_LINK = "20";
    public static final String LINK_TAG_HAS_PLAYED_GAME_COMMENT_LINK = "3";
    public static final String LINK_TAG_PC_MEDIA_LINK = "12";
    public static final String LINK_TAG_PICTURE_TEXT = "27";
    public static final String LINK_TAG_QUESTION_LINK = "7";
    public static final String LINK_TAG_RELATED_MOMENTS = "18";
    public static final String LINK_TAG_SHORT_NEWS = "22";
    public static final String LINK_TAG_SINA_LINK = "13";
    public static final String LINK_TAG_SPOILERS = "24";
    public static final String LINK_TAG_TIMELINE_LINK = "21";
    public static final String LINK_TAG_TIMELINE_PICTURE_TEXT = "28";
    public static final String LINK_TAG_WANT_TO_PLAY_GAME_COMMENT_LINK = "14";
    public static final String LINK_TAG_WEB_LINK = "11";
    public static final String LINK_TAG_WIKI_ARTICLE = "23";
    public static final String LIST_TYPE_ARTICLE = "article";
    public static final String LIST_TYPE_MOMENT = "moment";
    public static final String PAGE_TAB_BOUTIQUE = "3";
    public static final String PAGE_TAB_HOTTEST = "1";
    public static final String PAGE_TAB_LATEST = "2";
    public static final String POST_TYPE_CONTRIBUTE = "3";
    public static final String POST_TYPE_VIDEO = "4";
    public static final String REC_MARK_FOLLOW = "follow";
    public static final String REC_MARK_REC = "rec";
    public static final String REC_MARK_TAGS = "tags";
    public static final String REC_MARK_TIMELINE = "timeline";
    public static final String REVIEW_STATE_FAILED = "FAILED";
    public static final String REVIEW_STATE_PASSED = "PASSED";
    public static final String REVIEW_STATE_PENDING = "PENDING";
    public static final String SORT_TYPE_LATEST_COMMENT = "1";
    public static final String SORT_TYPE_LATEST_POST = "0";
    public static final String SPECIAL_TYPE_ACTIVITY = "1";
    public static final String SPECIAL_TYPE_COMPLETED = "6";
    public static final String SPECIAL_TYPE_ENDED = "2";
    public static final String SPECIAL_TYPE_GOOD = "3";
    public static final String SPECIAL_TYPE_HOT = "4";
    public static final String SPECIAL_TYPE_RECOMMENDED_GAME_COMMENT = "8";
    public static final String SPECIAL_TYPE_TOP = "5";
    public static final String STYLE_CODE_LONG = "1";
    public static final String STYLE_CODE_SINGLE_THUMB = "2";
    public static final String TOPIC_TYPE_FEEDBACK = "feedback";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 5311720888813227581L;
    private List<HashtagObj> act_hashtags;
    private String ad_ratio;

    /* JADX INFO: renamed from: al, reason: collision with root package name */
    private String f76956al;
    private AuthorObj author;
    private RichStackModelObj bottom_rich_text;
    private UiKitViewObj bottom_uikit;
    private String bottom_view_type;
    private String click;
    private String click_protocol;
    private String comment_id;
    private String comment_num;
    private ArrayList<PostContentTagObj> content_tags;
    private String content_view_type;
    private String create_at;
    private String custom_origin_gson_str;
    private String description;
    private String disable_image_click;
    private String draft;
    private String duration;
    private String extra_tag;
    private ArrayList<FeedbackCateObj> feedback;
    private String finished_tag;
    private String fire_status;
    private String follow_status;
    private ForbidInfoObj forbid_info;
    private String formated_time;
    private BBSLinkObj forward;
    private String forward_num;
    private String from;
    private String from_specified_topic;
    private String h_src;
    private String has_video;
    private List<HashtagObj> hashtags;
    private List<RichAttributeModelObj> hb_rich_texts;
    private String hide_comment;
    private BBSCommentObj hot_comment;
    private RichStackModelObj image_rb_rich_text;

    @SerializedName(alternate = {"image"}, value = SocialConstants.PARAM_IMG_URL)
    private String img;
    private String img_text_margin;
    private List<String> imgs;
    private String impressionID;
    private String intranet_only;
    private String ip_location;
    private boolean isNews;
    private String is_article;
    private String is_award_link;
    private String is_cy;
    private String is_deleted;
    private String is_hashtag;
    private String is_top;
    private String is_web;
    private String label;
    private String link_award_num;
    private String link_extra_tag;
    private UiKitViewObj link_extra_tag_v2;
    private String link_tag;

    @SerializedName(alternate = {"id"}, value = RollRoomDetailFragment.A)
    private String linkid;
    private String news_thumb;
    private String newsid;
    private PostOriginalInfo original_info;
    private String page_tab;
    private String page_url;
    private String pos;
    private BBSLinkImagePositionObj positions;
    private String post_tag;
    private String post_type;
    private String post_type_desc;
    private String protocol;
    private String recTags;
    private String rec_mark;
    private String review_state;
    private KeyDescObj review_state_v2;
    private String root_comment_id;
    private String score;
    private String sessionID;
    private String share_url;
    private String show_reason;
    private String source;
    private String sp_like_key;
    private KeyDescObj special_tag;
    private String special_type;
    private String style_code;
    private BBSLinkSubObj sub;
    private String text;
    private ImageInfoObj thumb;
    private List<String> thumbs;
    private String time;
    private String title;
    private RichStackModelObj top_left_rich_text;
    private UiKitViewObj top_uikit;
    private String top_view_type;
    private String topic_name;
    private ArrayList<BBSTopicObj> topics;
    private String unread;
    private String use_concept_type;
    private BBSUserInfoObj user;
    private int vertical;
    private VideoInfoObj video_info;
    private String video_thumb;
    private String video_url;
    private boolean isChecked = false;
    private boolean need_story_mode_report = false;

    public static BBSLinkViewShowsObj generateLinkViewShowInfo(BBSLinkObj bBSLinkObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bBSLinkObj}, null, changeQuickRedirect, true, 14180, new Class[]{BBSLinkObj.class}, BBSLinkViewShowsObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (BBSLinkViewShowsObj) patchProxyResultProxy.result;
        }
        BBSLinkViewShowsObj bBSLinkViewShowsObj = new BBSLinkViewShowsObj();
        bBSLinkViewShowsObj.setId(n.q(bBSLinkObj.getLinkid()));
        bBSLinkViewShowsObj.setAl(bBSLinkObj.getAl());
        bBSLinkViewShowsObj.setRec(n.q(bBSLinkObj.getFrom()));
        bBSLinkViewShowsObj.setPage_tab(n.q(bBSLinkObj.getPage_tab()));
        bBSLinkViewShowsObj.setIdx(n.q(bBSLinkObj.getIndex()));
        bBSLinkViewShowsObj.setTime(n.r(bBSLinkObj.getTime()));
        bBSLinkViewShowsObj.setFrom_recommend_list(bBSLinkObj.getFrom());
        bBSLinkViewShowsObj.setIndex(bBSLinkObj.getIndex());
        bBSLinkViewShowsObj.setRec_mark(bBSLinkObj.getRec_mark());
        bBSLinkViewShowsObj.setRecTags(bBSLinkObj.getRecTags());
        bBSLinkViewShowsObj.setImpressionID(bBSLinkObj.getImpressionID());
        bBSLinkViewShowsObj.setSessionID(bBSLinkObj.getSessionID());
        bBSLinkViewShowsObj.setPos(bBSLinkObj.getPos());
        bBSLinkViewShowsObj.setNewsid(bBSLinkObj.getNewsid());
        bBSLinkViewShowsObj.setH_src(bBSLinkObj.getH_src());
        return bBSLinkViewShowsObj;
    }

    public static String getLinkTagCommonLink() {
        return "1";
    }

    public boolean equals(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14177, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (obj == null || !(obj instanceof BBSLinkObj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return !c.u(this.linkid) && this.linkid.equals(((BBSLinkObj) obj).linkid);
    }

    public List<HashtagObj> getAct_hashtags() {
        return this.act_hashtags;
    }

    public String getAd_ratio() {
        return this.ad_ratio;
    }

    public String getAl() {
        return this.f76956al;
    }

    public AuthorObj getAuthor() {
        return this.author;
    }

    public RichStackModelObj getBottom_rich_text() {
        return this.bottom_rich_text;
    }

    public UiKitViewObj getBottom_uikit() {
        return this.bottom_uikit;
    }

    public String getBottom_view_type() {
        return this.bottom_view_type;
    }

    public String getClick() {
        return this.click;
    }

    public String getClick_protocol() {
        return this.click_protocol;
    }

    public String getComment_id() {
        return this.comment_id;
    }

    public String getComment_num() {
        return this.comment_num;
    }

    public ArrayList<PostContentTagObj> getContent_tags() {
        return this.content_tags;
    }

    public String getContent_view_type() {
        return this.content_view_type;
    }

    public String getCreate_at() {
        return this.create_at;
    }

    public String getCustom_origin_gson_str() {
        return this.custom_origin_gson_str;
    }

    public String getDescription() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14174, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (c.w(this.act_hashtags)) {
            return this.description;
        }
        String strReplaceAll = this.description;
        Iterator<HashtagObj> it = this.act_hashtags.iterator();
        while (it.hasNext()) {
            strReplaceAll = strReplaceAll.replaceAll("#" + it.next().getName() + "#", "");
        }
        return strReplaceAll;
    }

    public String getDisable_image_click() {
        return this.disable_image_click;
    }

    public String getDraft() {
        return this.draft;
    }

    public String getDuration() {
        return this.duration;
    }

    public String getExtra_tag() {
        return this.extra_tag;
    }

    public ArrayList<FeedbackCateObj> getFeedback() {
        return this.feedback;
    }

    public String getFinished_tag() {
        return this.finished_tag;
    }

    public String getFire_status() {
        return this.fire_status;
    }

    public String getFollow_status() {
        return this.follow_status;
    }

    public ForbidInfoObj getForbid_info() {
        return this.forbid_info;
    }

    public String getFormated_time() {
        return this.formated_time;
    }

    public BBSLinkObj getForward() {
        return this.forward;
    }

    public String getForward_num() {
        return this.forward_num;
    }

    public String getFrom() {
        return this.from;
    }

    public String getFrom_specified_topic() {
        return this.from_specified_topic;
    }

    public String getH_src() {
        return this.h_src;
    }

    public String getHas_video() {
        return this.has_video;
    }

    public List<HashtagObj> getHashtags() {
        return this.hashtags;
    }

    public List<RichAttributeModelObj> getHb_rich_texts() {
        return this.hb_rich_texts;
    }

    public String getHide_comment() {
        return this.hide_comment;
    }

    public BBSCommentObj getHot_comment() {
        return this.hot_comment;
    }

    public RichStackModelObj getImage_rb_rich_text() {
        return this.image_rb_rich_text;
    }

    public String getImg() {
        return this.img;
    }

    public String getImg_text_margin() {
        return this.img_text_margin;
    }

    public List<String> getImgs() {
        return this.imgs;
    }

    public String getImpressionID() {
        return this.impressionID;
    }

    public String getIntranet_only() {
        return this.intranet_only;
    }

    public String getIp_location() {
        return this.ip_location;
    }

    public String getIs_article() {
        return this.is_article;
    }

    public String getIs_award_link() {
        return this.is_award_link;
    }

    public String getIs_cy() {
        return this.is_cy;
    }

    public String getIs_deleted() {
        return this.is_deleted;
    }

    public String getIs_hashtag() {
        return this.is_hashtag;
    }

    public String getIs_top() {
        return this.is_top;
    }

    public String getIs_web() {
        return this.is_web;
    }

    public String getLabel() {
        return this.label;
    }

    public String getLink_award_num() {
        return this.link_award_num;
    }

    public String getLink_extra_tag() {
        return this.link_extra_tag;
    }

    public UiKitViewObj getLink_extra_tag_v2() {
        return this.link_extra_tag_v2;
    }

    public String getLink_tag() {
        return this.link_tag;
    }

    public String getLinkid() {
        return this.linkid;
    }

    public String getNews_thumb() {
        return this.news_thumb;
    }

    public String getNewsid() {
        return this.newsid;
    }

    public PostOriginalInfo getOriginal_info() {
        return this.original_info;
    }

    public String getPage_tab() {
        return this.page_tab;
    }

    public String getPage_url() {
        return this.page_url;
    }

    public String getPos() {
        return this.pos;
    }

    public BBSLinkImagePositionObj getPositions() {
        return this.positions;
    }

    public String getPost_tag() {
        return this.post_tag;
    }

    public String getPost_type() {
        return this.post_type;
    }

    public String getPost_type_desc() {
        return this.post_type_desc;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public String getRecTags() {
        return this.recTags;
    }

    public String getRec_mark() {
        return this.rec_mark;
    }

    public String getReview_state() {
        return this.review_state;
    }

    public KeyDescObj getReview_state_v2() {
        return this.review_state_v2;
    }

    public String getRoot_comment_id() {
        return this.root_comment_id;
    }

    public String getScore() {
        return this.score;
    }

    public String getSessionID() {
        return this.sessionID;
    }

    public String getShare_url() {
        return this.share_url;
    }

    public String getShow_reason() {
        return this.show_reason;
    }

    public String getSource() {
        return this.source;
    }

    public String getSp_like_key() {
        return this.sp_like_key;
    }

    @p0
    public KeyDescObj getSpecial_tag() {
        return this.special_tag;
    }

    public String getSpecial_type() {
        return this.special_type;
    }

    public String getStyle_code() {
        return this.style_code;
    }

    public BBSLinkSubObj getSub() {
        return this.sub;
    }

    public String getText() {
        return this.text;
    }

    public ImageInfoObj getThumb() {
        return this.thumb;
    }

    public String getThumbImageUrl() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14182, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (!c.w(this.thumbs)) {
            return this.thumbs.get(0);
        }
        if (c.w(this.imgs)) {
            return null;
        }
        return this.imgs.get(0);
    }

    public List<String> getThumbs() {
        return this.thumbs;
    }

    public String getTime() {
        return this.time;
    }

    @p0
    public String getTitle() {
        return this.title;
    }

    public RichStackModelObj getTop_left_rich_text() {
        return this.top_left_rich_text;
    }

    public UiKitViewObj getTop_uikit() {
        return this.top_uikit;
    }

    public String getTop_view_type() {
        return this.top_view_type;
    }

    public BBSTopicObj getTopic() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14175, new Class[0], BBSTopicObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (BBSTopicObj) patchProxyResultProxy.result;
        }
        if (c.w(this.topics)) {
            return null;
        }
        return this.topics.get(0);
    }

    public String getTopic_name() {
        return this.topic_name;
    }

    public ArrayList<BBSTopicObj> getTopics() {
        return this.topics;
    }

    public String getUnread() {
        return this.unread;
    }

    public String getUse_concept_type() {
        return this.use_concept_type;
    }

    public BBSUserInfoObj getUser() {
        return this.user;
    }

    public int getVertical() {
        return this.vertical;
    }

    public VideoInfoObj getVideo_info() {
        return this.video_info;
    }

    public String getVideo_thumb() {
        return this.video_thumb;
    }

    public String getVideo_url() {
        return this.video_url;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14176, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : super.hashCode();
    }

    public boolean isChecked() {
        return this.isChecked;
    }

    public boolean isNeed_story_mode_report() {
        return this.need_story_mode_report;
    }

    public boolean isNews() {
        return this.isNews;
    }

    public boolean isSameViewType(BBSLinkObj bBSLinkObj) {
        String str;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bBSLinkObj}, this, changeQuickRedirect, false, 14181, new Class[]{BBSLinkObj.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (bBSLinkObj == null || (str = this.top_view_type) == null || this.content_view_type == null || this.bottom_view_type == null) {
            return false;
        }
        return str.equals(bBSLinkObj.top_view_type) && this.content_view_type.equals(bBSLinkObj.content_view_type) && this.bottom_view_type.equals(bBSLinkObj.bottom_view_type);
    }

    public void setAct_hashtags(List<HashtagObj> list) {
        this.act_hashtags = list;
    }

    public void setAd_ratio(String str) {
        this.ad_ratio = str;
    }

    public void setAl(String str) {
        this.f76956al = str;
    }

    public void setAuthor(AuthorObj authorObj) {
        this.author = authorObj;
    }

    public void setBottom_rich_text(RichStackModelObj richStackModelObj) {
        this.bottom_rich_text = richStackModelObj;
    }

    public void setBottom_uikit(UiKitViewObj uiKitViewObj) {
        this.bottom_uikit = uiKitViewObj;
    }

    public void setBottom_view_type(String str) {
        this.bottom_view_type = str;
    }

    public void setChecked(boolean z10) {
        this.isChecked = z10;
    }

    public void setClick(String str) {
        this.click = str;
    }

    public void setClick_protocol(String str) {
        this.click_protocol = str;
    }

    public void setComment_id(String str) {
        this.comment_id = str;
    }

    public void setComment_num(String str) {
        this.comment_num = str;
    }

    public void setContent_tags(ArrayList<PostContentTagObj> arrayList) {
        this.content_tags = arrayList;
    }

    public void setContent_view_type(String str) {
        this.content_view_type = str;
    }

    public void setCreate_at(String str) {
        this.create_at = str;
    }

    public void setCustom_origin_gson_str(String str) {
        this.custom_origin_gson_str = str;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setDisable_image_click(String str) {
        this.disable_image_click = str;
    }

    public void setDraft(String str) {
        this.draft = str;
    }

    public void setDuration(String str) {
        this.duration = str;
    }

    public void setExtra_tag(String str) {
        this.extra_tag = str;
    }

    public void setFeedback(ArrayList<FeedbackCateObj> arrayList) {
        this.feedback = arrayList;
    }

    public void setFinished_tag(String str) {
        this.finished_tag = str;
    }

    public void setFire_status(String str) {
        this.fire_status = str;
    }

    public void setFollow_status(String str) {
        this.follow_status = str;
    }

    public void setForbid_info(ForbidInfoObj forbidInfoObj) {
        this.forbid_info = forbidInfoObj;
    }

    public void setFormated_time(String str) {
        this.formated_time = str;
    }

    public void setForward(BBSLinkObj bBSLinkObj) {
        this.forward = bBSLinkObj;
    }

    public void setForward_num(String str) {
        this.forward_num = str;
    }

    public void setFrom(String str) {
        this.from = str;
    }

    public void setFrom_specified_topic(String str) {
        this.from_specified_topic = str;
    }

    public void setH_src(String str) {
        this.h_src = str;
    }

    public void setHas_video(String str) {
        this.has_video = str;
    }

    public void setHashtags(List<HashtagObj> list) {
        this.hashtags = list;
    }

    public void setHb_rich_texts(List<RichAttributeModelObj> list) {
        this.hb_rich_texts = list;
    }

    public void setHide_comment(String str) {
        this.hide_comment = str;
    }

    public void setHot_comment(BBSCommentObj bBSCommentObj) {
        this.hot_comment = bBSCommentObj;
    }

    public void setImage_rb_rich_text(RichStackModelObj richStackModelObj) {
        this.image_rb_rich_text = richStackModelObj;
    }

    public void setImg(String str) {
        this.img = str;
    }

    public void setImg_text_margin(String str) {
        this.img_text_margin = str;
    }

    public void setImgs(List<String> list) {
        this.imgs = list;
    }

    public void setImpressionID(String str) {
        this.impressionID = str;
    }

    public void setIntranet_only(String str) {
        this.intranet_only = str;
    }

    public void setIp_location(String str) {
        this.ip_location = str;
    }

    public void setIs_article(String str) {
        this.is_article = str;
    }

    public void setIs_award_link(String str) {
        this.is_award_link = str;
    }

    public void setIs_cy(String str) {
        this.is_cy = str;
    }

    public void setIs_deleted(String str) {
        this.is_deleted = str;
    }

    public void setIs_hashtag(String str) {
        this.is_hashtag = str;
    }

    public void setIs_top(String str) {
        this.is_top = str;
    }

    public void setIs_web(String str) {
        this.is_web = str;
    }

    public void setLabel(String str) {
        this.label = str;
    }

    public void setLink_award_num(String str) {
        this.link_award_num = str;
    }

    public void setLink_extra_tag(String str) {
        this.link_extra_tag = str;
    }

    public void setLink_extra_tag_v2(UiKitViewObj uiKitViewObj) {
        this.link_extra_tag_v2 = uiKitViewObj;
    }

    public void setLink_tag(String str) {
        this.link_tag = str;
    }

    public void setLinkid(String str) {
        this.linkid = str;
    }

    public void setNeed_story_mode_report(boolean z10) {
        this.need_story_mode_report = z10;
    }

    public void setNews(boolean z10) {
        this.isNews = z10;
    }

    public void setNews_thumb(String str) {
        this.news_thumb = str;
    }

    public void setNewsid(String str) {
        this.newsid = str;
    }

    public void setOriginal_info(PostOriginalInfo postOriginalInfo) {
        this.original_info = postOriginalInfo;
    }

    public void setPage_tab(String str) {
        this.page_tab = str;
    }

    public void setPage_url(String str) {
        this.page_url = str;
    }

    public void setPos(String str) {
        this.pos = str;
    }

    public void setPositions(BBSLinkImagePositionObj bBSLinkImagePositionObj) {
        this.positions = bBSLinkImagePositionObj;
    }

    public void setPost_tag(String str) {
        this.post_tag = str;
    }

    public void setPost_type(String str) {
        this.post_type = str;
    }

    public void setPost_type_desc(String str) {
        this.post_type_desc = str;
    }

    public void setProtocol(String str) {
        this.protocol = str;
    }

    public void setRecTags(String str) {
        this.recTags = str;
    }

    public void setRec_mark(String str) {
        this.rec_mark = str;
    }

    public void setReview_state(String str) {
        this.review_state = str;
    }

    public void setReview_state_v2(KeyDescObj keyDescObj) {
        this.review_state_v2 = keyDescObj;
    }

    public void setRoot_comment_id(String str) {
        this.root_comment_id = str;
    }

    public void setScore(String str) {
        this.score = str;
    }

    public void setSessionID(String str) {
        this.sessionID = str;
    }

    public void setShare_url(String str) {
        this.share_url = str;
    }

    public void setShow_reason(String str) {
        this.show_reason = str;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public void setSp_like_key(String str) {
        this.sp_like_key = str;
    }

    public void setSpecial_tag(KeyDescObj keyDescObj) {
        this.special_tag = keyDescObj;
    }

    public void setSpecial_type(String str) {
        this.special_type = str;
    }

    public void setStyle_code(String str) {
        this.style_code = str;
    }

    public void setSub(BBSLinkSubObj bBSLinkSubObj) {
        this.sub = bBSLinkSubObj;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setThumb(ImageInfoObj imageInfoObj) {
        this.thumb = imageInfoObj;
    }

    public void setThumbs(List<String> list) {
        this.thumbs = list;
    }

    public void setTime(String str) {
        this.time = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTop_left_rich_text(RichStackModelObj richStackModelObj) {
        this.top_left_rich_text = richStackModelObj;
    }

    public void setTop_uikit(UiKitViewObj uiKitViewObj) {
        this.top_uikit = uiKitViewObj;
    }

    public void setTop_view_type(String str) {
        this.top_view_type = str;
    }

    public void setTopic_name(String str) {
        this.topic_name = str;
    }

    public void setTopics(ArrayList<BBSTopicObj> arrayList) {
        this.topics = arrayList;
    }

    public void setUnread(String str) {
        this.unread = str;
    }

    public void setUse_concept_type(String str) {
        this.use_concept_type = str;
    }

    public void setUser(BBSUserInfoObj bBSUserInfoObj) {
        this.user = bBSUserInfoObj;
    }

    public void setVertical(int i10) {
        this.vertical = i10;
    }

    public void setVideo_info(VideoInfoObj videoInfoObj) {
        this.video_info = videoInfoObj;
    }

    public void setVideo_thumb(String str) {
        this.video_thumb = str;
    }

    public void setVideo_url(String str) {
        this.video_url = str;
    }

    public LinkInfoObj toLinkInfoObj() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14178, new Class[0], LinkInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (LinkInfoObj) patchProxyResultProxy.result;
        }
        LinkInfoObj linkInfoObj = new LinkInfoObj();
        linkInfoObj.setUser(this.user);
        linkInfoObj.setLinkid(this.linkid);
        linkInfoObj.setCreate_at(this.create_at);
        linkInfoObj.setText(this.text);
        BBSLinkObj bBSLinkObj = this.forward;
        if (bBSLinkObj != null) {
            linkInfoObj.setForward(bBSLinkObj.toLinkInfoObj());
        }
        String str = this.custom_origin_gson_str;
        if (str != null) {
            linkInfoObj.setCustom_origin_gson_str(str);
        }
        linkInfoObj.setLink_tag(this.link_tag);
        linkInfoObj.setHas_video(this.has_video);
        linkInfoObj.setUse_concept_type(this.use_concept_type);
        linkInfoObj.setIs_web(this.is_web);
        linkInfoObj.setTitle(this.title);
        linkInfoObj.setLink_award_num(this.link_award_num);
        linkInfoObj.setIs_award_link(this.is_award_link);
        linkInfoObj.setComment_num(this.comment_num);
        linkInfoObj.setForward_num(this.forward_num);
        linkInfoObj.setForbid_info(this.forbid_info);
        linkInfoObj.setFeedback(this.feedback);
        linkInfoObj.setVideo_info(this.video_info);
        linkInfoObj.setVideo_url(this.video_url);
        linkInfoObj.setVideo_thumb(this.video_thumb);
        linkInfoObj.setFollow_status(this.follow_status);
        linkInfoObj.setH_src(this.h_src);
        linkInfoObj.setDescription(this.description);
        linkInfoObj.setTopics(this.topics);
        linkInfoObj.setIp_location(this.ip_location);
        linkInfoObj.setIs_article(this.is_article);
        linkInfoObj.setThumbs(this.thumbs);
        if (this.hashtags != null) {
            ArrayList<ConceptPostTagObj> arrayList = new ArrayList<>();
            for (HashtagObj hashtagObj : this.hashtags) {
                if (hashtagObj != null) {
                    arrayList.add(hashtagObj.toConceptPostTagObj());
                }
            }
            linkInfoObj.setHashtags(arrayList);
        }
        linkInfoObj.setContent_tags(this.content_tags);
        return linkInfoObj;
    }

    public StoryItemsObj toStoryItemsObj() {
        StoryImgInfoObj storyImgInfoObj;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14179, new Class[0], StoryItemsObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (StoryItemsObj) patchProxyResultProxy.result;
        }
        StoryItemsObj storyItemsObj = new StoryItemsObj();
        storyItemsObj.setH_src(this.h_src);
        storyItemsObj.setNeed_story_mode_report(isNeed_story_mode_report());
        boolean zX = c.x(this.has_video);
        storyItemsObj.setCard_id_info(new StoryCardIdInfoObj(this.linkid, zX ? 1 : 2));
        BBSUserInfoObj bBSUserInfoObj = this.user;
        StoryBBSUserInfoObj storyBBSUserInfoObj = bBSUserInfoObj == null ? null : bBSUserInfoObj.toStoryBBSUserInfoObj();
        StoryStatInfoObj storyStatInfoObj = new StoryStatInfoObj(n.q(this.follow_status), n.q(this.comment_num), 0, n.q(this.link_award_num), c.x(this.is_award_link), false);
        if (zX || c.w(this.imgs)) {
            storyImgInfoObj = null;
        } else {
            StoryImgInfoObj storyImgInfoObj2 = new StoryImgInfoObj();
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = this.imgs.iterator();
            while (it.hasNext()) {
                arrayList.add(new StoryImgObj(0, 0, it.next()));
            }
            storyImgInfoObj2.setImages(arrayList);
            storyImgInfoObj = storyImgInfoObj2;
        }
        storyItemsObj.setLink_card_info(zX ? new StoryLinkCardInfoObj(AccelWorldBBSKt.i(this.description), AccelWorldBBSKt.i(this.title), storyBBSUserInfoObj, storyStatInfoObj, storyImgInfoObj, (StoryVideoInfoObj) k.a(k.p(this.video_info), StoryVideoInfoObj.class)) : null);
        return storyItemsObj;
    }
}
