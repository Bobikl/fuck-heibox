package com.max.xiaoheihe.bean.bbs;

import android.text.TextUtils;
import androidx.annotation.p0;
import com.max.basebbs.bean.video.VideoInfoObj;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.bean.analytics.BBSLinkViewShowsObj;
import com.max.hbcommon.utils.c;
import com.max.hbshare.bean.PostOptionObj;
import com.max.hbutils.utils.n;
import com.max.xiaoheihe.bean.game.CommentSpecialTagObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.bean.game.HeyboxGameDeveloperObj;
import com.max.xiaoheihe.bean.game.HeyboxGameOfficialCommentTipObj;
import com.max.xiaoheihe.bean.game.MultiDimensionObj;
import com.max.xiaoheihe.bean.game.UserSupportStateObj;
import com.max.xiaoheihe.bean.rich.RichAttributeModelObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class LinkInfoObj implements Serializable {
    public static final String GAME_COMMENTS_OPT_CANCEL = "0";
    public static final String GAME_COMMENTS_OPT_DOWN = "2";
    public static final String GAME_COMMENTS_OPT_UP = "1";
    public static final String LINK_OPT_DOWN = "2";
    public static final String LINK_OPT_UNSPECIFIED = "0";
    public static final String LINK_OPT_UP = "1";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -3674230760622499678L;
    private String answer_linkid;
    private String appid;
    private ArticleCollectionObj article_collection;
    private LinkBatteryObj battery;
    private BBSBoutiqueObj boutique;
    private String can_edit;
    private String can_modify_post_plan;
    private String can_not_share_chat_tips;
    private String can_not_share_tips;
    private String click;
    private String comment_num;
    private List<RichAttributeModelObj> comment_num_rich_text;
    private List<BBSCommentObj> comments;
    private ArrayList<PostContentTagObj> content_tags;
    private String create_at;
    private BBSCommentsObj current_comment;
    private List<LinkInfoObj> custom_collapse_game_comments;
    private String custom_origin_gson_str;
    private String declaration;
    private String description;
    private String disable_comment;
    private String display_type;
    private DonateInfo donate;
    private String double_click_lottie_key;
    private String down;
    private KeyDescObj event_entry;
    private String favour_count;
    private ArrayList<FeedbackCateObj> feedback;
    private String follow_status;
    private ForbidInfoObj forbid_info;
    private LinkInfoObj forward;
    private String forward_num;
    private List<GameObj> game_details;
    private GameObj game_info;
    private String game_tag;
    private List<String> game_tag_appids;
    private String game_type;
    private String h_src;
    private String happy;
    private String has_video;
    private ArrayList<ConceptPostTagObj> hashtags;
    private HeyboxGameDeveloperObj heybox_developer;
    private HeyboxGameOfficialCommentTipObj heybox_official;
    private CommentPostLinkCardObj highLikeCommentObj;
    private List<PostImageObj> imgs;
    private String index;
    private String ip_location;
    private String is_article;
    private String is_award_link;
    private String is_deleted;
    private String is_favour;
    private String is_friend_comment;
    private String is_hot_post;
    private String is_only_me_view;
    private String is_recommend;
    private String is_support;
    private String is_top;
    private String is_top_link;
    private String is_web;
    private List<BBSUserInfoObj> latest_award_users;
    private List<PostOptionObj> link_action_list;
    private String link_award_num;
    private String link_tag;
    private String linkid;
    private String modify_at;
    private List<MultiDimensionObj> multidimensional_score;
    private String news_show;
    private String next_id;
    private String official_reply;
    private String original;
    private PostOriginalInfo original_info;
    private String page_url;
    private ArrayList<ConceptPostTagObj> plan_tags;
    private String play_state;
    private String post_at;
    private String pre_id;
    private String qalink_id;
    private String qalink_title;
    private String recommendable;
    private BBSFollowedMomentObj related_status;

    @p0
    private String schedule_ts;
    private String score;
    private String score_desc;
    private String share_url;
    private String show_special;
    private String source;
    private BBSSourceInfoObj source_info;
    private String sp_like_key;
    private LinkSpecialTagObj special_tag;
    private CommentSpecialTagObj special_tag_v2;
    private String special_type;
    private String support_state;
    private ArrayList<String> tags;
    private String text;
    private String thumb;
    private List<String> thumbs;
    private String time;
    private String title;
    private String top_link_status;
    private ArrayList<BBSTopicObj> topics;
    private String use_concept_type;
    private BBSUserInfoObj user;
    private UserSupportStateObj user_support_state;
    private String userid;
    private String version;
    private int vertical;
    private String video_duration;
    private VideoInfoObj video_info;
    private String video_local_path;
    private String video_thumb;
    private String video_type;
    private String video_url;
    private String view_limit;
    private LinkVoteInfoObj vote_info;
    private String web_view_url;

    public static BBSLinkViewShowsObj generateLinkViewShowInfo(LinkInfoObj linkInfoObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{linkInfoObj}, null, changeQuickRedirect, true, 14332, new Class[]{LinkInfoObj.class}, BBSLinkViewShowsObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (BBSLinkViewShowsObj) patchProxyResultProxy.result;
        }
        BBSLinkViewShowsObj bBSLinkViewShowsObj = new BBSLinkViewShowsObj();
        bBSLinkViewShowsObj.setId(n.q(linkInfoObj.getLinkid()));
        bBSLinkViewShowsObj.setIdx(n.q(linkInfoObj.getIndex()));
        bBSLinkViewShowsObj.setTime(n.r(linkInfoObj.getTime()));
        bBSLinkViewShowsObj.setIndex(linkInfoObj.getIndex());
        bBSLinkViewShowsObj.setH_src(linkInfoObj.getH_src());
        return bBSLinkViewShowsObj;
    }

    public boolean equals(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14330, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (obj == null || !(obj instanceof LinkInfoObj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return !TextUtils.isEmpty(this.linkid) && this.linkid.equals(((LinkInfoObj) obj).linkid);
    }

    public String getAnswer_linkid() {
        return this.answer_linkid;
    }

    public String getAppid() {
        return this.appid;
    }

    public ArticleCollectionObj getArticle_collection() {
        return this.article_collection;
    }

    public LinkBatteryObj getBattery() {
        return this.battery;
    }

    public BBSBoutiqueObj getBoutique() {
        return this.boutique;
    }

    public String getCan_edit() {
        return this.can_edit;
    }

    public String getCan_modify_post_plan() {
        return this.can_modify_post_plan;
    }

    public String getCan_not_share_chat_tips() {
        return this.can_not_share_chat_tips;
    }

    public String getCan_not_share_tips() {
        return this.can_not_share_tips;
    }

    public String getClick() {
        return this.click;
    }

    public String getComment_num() {
        return this.comment_num;
    }

    public List<RichAttributeModelObj> getComment_num_rich_text() {
        return this.comment_num_rich_text;
    }

    public List<BBSCommentObj> getComments() {
        return this.comments;
    }

    public ArrayList<PostContentTagObj> getContent_tags() {
        return this.content_tags;
    }

    public String getCreate_at() {
        return this.create_at;
    }

    public BBSCommentsObj getCurrent_comment() {
        return this.current_comment;
    }

    public List<LinkInfoObj> getCustom_collapse_game_comments() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14329, new Class[0], List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        if (this.custom_collapse_game_comments == null) {
            this.custom_collapse_game_comments = new ArrayList();
        }
        return this.custom_collapse_game_comments;
    }

    public String getCustom_origin_gson_str() {
        return this.custom_origin_gson_str;
    }

    public String getDeclaration() {
        return this.declaration;
    }

    public String getDescription() {
        return this.description;
    }

    public String getDisable_comment() {
        return this.disable_comment;
    }

    public String getDisplay_type() {
        return this.display_type;
    }

    public DonateInfo getDonate() {
        return this.donate;
    }

    public String getDouble_click_lottie_key() {
        return this.double_click_lottie_key;
    }

    public String getDown() {
        return this.down;
    }

    public KeyDescObj getEvent_entry() {
        return this.event_entry;
    }

    public String getFavour_count() {
        return this.favour_count;
    }

    public ArrayList<FeedbackCateObj> getFeedback() {
        return this.feedback;
    }

    public String getFollow_status() {
        return this.follow_status;
    }

    public ForbidInfoObj getForbid_info() {
        return this.forbid_info;
    }

    public LinkInfoObj getForward() {
        return this.forward;
    }

    public String getForward_num() {
        return this.forward_num;
    }

    public List<GameObj> getGame_details() {
        return this.game_details;
    }

    public GameObj getGame_info() {
        return this.game_info;
    }

    public String getGame_tag() {
        return this.game_tag;
    }

    public List<String> getGame_tag_appids() {
        return this.game_tag_appids;
    }

    public String getGame_type() {
        return this.game_type;
    }

    public String getH_src() {
        return this.h_src;
    }

    public String getHappy() {
        return this.happy;
    }

    public String getHas_video() {
        return this.has_video;
    }

    public ArrayList<ConceptPostTagObj> getHashtags() {
        return this.hashtags;
    }

    public HeyboxGameDeveloperObj getHeybox_developer() {
        return this.heybox_developer;
    }

    public HeyboxGameOfficialCommentTipObj getHeybox_official() {
        return this.heybox_official;
    }

    public CommentPostLinkCardObj getHighLikeCommentObj() {
        return this.highLikeCommentObj;
    }

    public List<PostImageObj> getImgs() {
        return this.imgs;
    }

    public String getIndex() {
        return this.index;
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

    public String getIs_deleted() {
        return this.is_deleted;
    }

    public String getIs_favour() {
        return this.is_favour;
    }

    public String getIs_friend_comment() {
        return this.is_friend_comment;
    }

    public String getIs_hot_post() {
        return this.is_hot_post;
    }

    public String getIs_only_me_view() {
        return this.is_only_me_view;
    }

    public String getIs_recommend() {
        return this.is_recommend;
    }

    public String getIs_support() {
        return this.is_support;
    }

    public String getIs_top() {
        return this.is_top;
    }

    public String getIs_top_link() {
        return this.is_top_link;
    }

    public String getIs_web() {
        return this.is_web;
    }

    public List<BBSUserInfoObj> getLatest_award_users() {
        return this.latest_award_users;
    }

    public List<PostOptionObj> getLink_action_list() {
        return this.link_action_list;
    }

    public String getLink_award_num() {
        return this.link_award_num;
    }

    public String getLink_tag() {
        return this.link_tag;
    }

    public String getLinkid() {
        return this.linkid;
    }

    public String getModify_at() {
        return this.modify_at;
    }

    public List<MultiDimensionObj> getMultidimensional_score() {
        return this.multidimensional_score;
    }

    public String getNews_show() {
        return this.news_show;
    }

    public String getNext_id() {
        return this.next_id;
    }

    public String getOfficial_reply() {
        return this.official_reply;
    }

    public String getOriginal() {
        return this.original;
    }

    public PostOriginalInfo getOriginal_info() {
        return this.original_info;
    }

    public String getPage_url() {
        return this.page_url;
    }

    public ArrayList<ConceptPostTagObj> getPlan_tags() {
        return this.plan_tags;
    }

    public String getPlay_state() {
        return this.play_state;
    }

    public String getPost_at() {
        return this.post_at;
    }

    public String getPre_id() {
        return this.pre_id;
    }

    public String getQalink_id() {
        return this.qalink_id;
    }

    public String getQalink_title() {
        return this.qalink_title;
    }

    public String getRecommendable() {
        return this.recommendable;
    }

    public BBSFollowedMomentObj getRelated_status() {
        return this.related_status;
    }

    @p0
    public String getSchedule_ts() {
        return this.schedule_ts;
    }

    public String getScore() {
        return this.score;
    }

    public String getScore_desc() {
        return this.score_desc;
    }

    public String getShare_url() {
        return this.share_url;
    }

    public String getShow_special() {
        return this.show_special;
    }

    public String getSource() {
        return this.source;
    }

    public BBSSourceInfoObj getSource_info() {
        return this.source_info;
    }

    public String getSp_like_key() {
        return this.sp_like_key;
    }

    public LinkSpecialTagObj getSpecial_tag() {
        return this.special_tag;
    }

    public CommentSpecialTagObj getSpecial_tag_v2() {
        return this.special_tag_v2;
    }

    public String getSpecial_type() {
        return this.special_type;
    }

    public String getSupport_state() {
        return this.support_state;
    }

    public ArrayList<String> getTags() {
        return this.tags;
    }

    public String getText() {
        return this.text;
    }

    public String getThumb() {
        return this.thumb;
    }

    public List<String> getThumbs() {
        return this.thumbs;
    }

    public String getTime() {
        return this.time;
    }

    public String getTitle() {
        return this.title;
    }

    public String getTop_link_status() {
        return this.top_link_status;
    }

    public BBSTopicObj getTopic() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14327, new Class[0], BBSTopicObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (BBSTopicObj) patchProxyResultProxy.result;
        }
        if (c.w(this.topics)) {
            return null;
        }
        return this.topics.get(0);
    }

    public ArrayList<BBSTopicObj> getTopics() {
        return this.topics;
    }

    public String getUse_concept_type() {
        return this.use_concept_type;
    }

    public BBSUserInfoObj getUser() {
        return this.user;
    }

    public UserSupportStateObj getUser_support_state() {
        return this.user_support_state;
    }

    public String getUserid() {
        return this.userid;
    }

    public String getVersion() {
        return this.version;
    }

    public int getVertical() {
        return this.vertical;
    }

    public String getVideo_duration() {
        return this.video_duration;
    }

    public VideoInfoObj getVideo_info() {
        return this.video_info;
    }

    public String getVideo_local_path() {
        return this.video_local_path;
    }

    public String getVideo_thumb() {
        return this.video_thumb;
    }

    public String getVideo_type() {
        return this.video_type;
    }

    public String getVideo_url() {
        return this.video_url;
    }

    public String getView_limit() {
        return this.view_limit;
    }

    public LinkVoteInfoObj getVote_info() {
        return this.vote_info;
    }

    public String getWeb_view_url() {
        return this.web_view_url;
    }

    public void setAnswer_linkid(String str) {
        this.answer_linkid = str;
    }

    public void setAppid(String str) {
        this.appid = str;
    }

    public void setArticle_collection(ArticleCollectionObj articleCollectionObj) {
        this.article_collection = articleCollectionObj;
    }

    public void setBattery(LinkBatteryObj linkBatteryObj) {
        this.battery = linkBatteryObj;
    }

    public void setBoutique(BBSBoutiqueObj bBSBoutiqueObj) {
        this.boutique = bBSBoutiqueObj;
    }

    public void setCan_edit(String str) {
        this.can_edit = str;
    }

    public void setCan_modify_post_plan(String str) {
        this.can_modify_post_plan = str;
    }

    public void setCan_not_share_chat_tips(String str) {
        this.can_not_share_chat_tips = str;
    }

    public void setCan_not_share_tips(String str) {
        this.can_not_share_tips = str;
    }

    public void setClick(String str) {
        this.click = str;
    }

    public void setComment_num(String str) {
        this.comment_num = str;
    }

    public void setComment_num_rich_text(List<RichAttributeModelObj> list) {
        this.comment_num_rich_text = list;
    }

    public void setComments(List<BBSCommentObj> list) {
        this.comments = list;
    }

    public void setContent_tags(ArrayList<PostContentTagObj> arrayList) {
        this.content_tags = arrayList;
    }

    public void setCreate_at(String str) {
        this.create_at = str;
    }

    public void setCurrent_comment(BBSCommentsObj bBSCommentsObj) {
        this.current_comment = bBSCommentsObj;
    }

    public void setCustom_collapse_game_comments(List<LinkInfoObj> list) {
        this.custom_collapse_game_comments = list;
    }

    public void setCustom_origin_gson_str(String str) {
        this.custom_origin_gson_str = str;
    }

    public void setDeclaration(String str) {
        this.declaration = str;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setDisable_comment(String str) {
        this.disable_comment = str;
    }

    public void setDisplay_type(String str) {
        this.display_type = str;
    }

    public void setDonate(DonateInfo donateInfo) {
        this.donate = donateInfo;
    }

    public void setDouble_click_lottie_key(String str) {
        this.double_click_lottie_key = str;
    }

    public void setDown(String str) {
        this.down = str;
    }

    public void setEvent_entry(KeyDescObj keyDescObj) {
        this.event_entry = keyDescObj;
    }

    public void setFavour_count(String str) {
        this.favour_count = str;
    }

    public void setFeedback(ArrayList<FeedbackCateObj> arrayList) {
        this.feedback = arrayList;
    }

    public void setFollow_status(String str) {
        this.follow_status = str;
    }

    public void setForbid_info(ForbidInfoObj forbidInfoObj) {
        this.forbid_info = forbidInfoObj;
    }

    public void setForward(LinkInfoObj linkInfoObj) {
        this.forward = linkInfoObj;
    }

    public void setForward_num(String str) {
        this.forward_num = str;
    }

    public void setGame_details(List<GameObj> list) {
        this.game_details = list;
    }

    public void setGame_info(GameObj gameObj) {
        this.game_info = gameObj;
    }

    public void setGame_tag(String str) {
        this.game_tag = str;
    }

    public void setGame_tag_appids(List<String> list) {
        this.game_tag_appids = list;
    }

    public void setGame_type(String str) {
        this.game_type = str;
    }

    public void setH_src(String str) {
        this.h_src = str;
    }

    public void setHappy(String str) {
        this.happy = str;
    }

    public void setHas_video(String str) {
        this.has_video = str;
    }

    public void setHashtags(ArrayList<ConceptPostTagObj> arrayList) {
        this.hashtags = arrayList;
    }

    public void setHeybox_developer(HeyboxGameDeveloperObj heyboxGameDeveloperObj) {
        this.heybox_developer = heyboxGameDeveloperObj;
    }

    public void setHeybox_official(HeyboxGameOfficialCommentTipObj heyboxGameOfficialCommentTipObj) {
        this.heybox_official = heyboxGameOfficialCommentTipObj;
    }

    public void setHighLikeCommentObj(CommentPostLinkCardObj commentPostLinkCardObj) {
        this.highLikeCommentObj = commentPostLinkCardObj;
    }

    public void setImgs(List<PostImageObj> list) {
        this.imgs = list;
    }

    public void setIndex(String str) {
        this.index = str;
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

    public void setIs_deleted(String str) {
        this.is_deleted = str;
    }

    public void setIs_favour(String str) {
        this.is_favour = str;
    }

    public void setIs_friend_comment(String str) {
        this.is_friend_comment = str;
    }

    public void setIs_hot_post(String str) {
        this.is_hot_post = str;
    }

    public void setIs_only_me_view(String str) {
        this.is_only_me_view = str;
    }

    public void setIs_recommend(String str) {
        this.is_recommend = str;
    }

    public void setIs_support(String str) {
        this.is_support = str;
    }

    public void setIs_top(String str) {
        this.is_top = str;
    }

    public void setIs_top_link(String str) {
        this.is_top_link = str;
    }

    public void setIs_web(String str) {
        this.is_web = str;
    }

    public void setLatest_award_users(List<BBSUserInfoObj> list) {
        this.latest_award_users = list;
    }

    public void setLink_action_list(List<PostOptionObj> list) {
        this.link_action_list = list;
    }

    public void setLink_award_num(String str) {
        this.link_award_num = str;
    }

    public void setLink_tag(String str) {
        this.link_tag = str;
    }

    public void setLinkid(String str) {
        this.linkid = str;
    }

    public void setModify_at(String str) {
        this.modify_at = str;
    }

    public void setMultidimensional_score(List<MultiDimensionObj> list) {
        this.multidimensional_score = list;
    }

    public void setNews_show(String str) {
        this.news_show = str;
    }

    public void setNext_id(String str) {
        this.next_id = str;
    }

    public void setOfficial_reply(String str) {
        this.official_reply = str;
    }

    public void setOriginal(String str) {
        this.original = str;
    }

    public void setOriginal_info(PostOriginalInfo postOriginalInfo) {
        this.original_info = postOriginalInfo;
    }

    public void setPage_url(String str) {
        this.page_url = str;
    }

    public void setPlan_tags(ArrayList<ConceptPostTagObj> arrayList) {
        this.plan_tags = arrayList;
    }

    public void setPlay_state(String str) {
        this.play_state = str;
    }

    public void setPost_at(String str) {
        this.post_at = str;
    }

    public void setPre_id(String str) {
        this.pre_id = str;
    }

    public void setQalink_id(String str) {
        this.qalink_id = str;
    }

    public void setQalink_title(String str) {
        this.qalink_title = str;
    }

    public void setRecommendable(String str) {
        this.recommendable = str;
    }

    public void setRelated_status(BBSFollowedMomentObj bBSFollowedMomentObj) {
        this.related_status = bBSFollowedMomentObj;
    }

    public void setSchedule_ts(@p0 String str) {
        this.schedule_ts = str;
    }

    public void setScore(String str) {
        this.score = str;
    }

    public void setScore_desc(String str) {
        this.score_desc = str;
    }

    public void setShare_url(String str) {
        this.share_url = str;
    }

    public void setShow_special(String str) {
        this.show_special = str;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public void setSource_info(BBSSourceInfoObj bBSSourceInfoObj) {
        this.source_info = bBSSourceInfoObj;
    }

    public void setSp_like_key(String str) {
        this.sp_like_key = str;
    }

    public void setSpecial_tag(LinkSpecialTagObj linkSpecialTagObj) {
        this.special_tag = linkSpecialTagObj;
    }

    public void setSpecial_tag_v2(CommentSpecialTagObj commentSpecialTagObj) {
        this.special_tag_v2 = commentSpecialTagObj;
    }

    public void setSpecial_type(String str) {
        this.special_type = str;
    }

    public void setSupport_state(String str) {
        this.support_state = str;
    }

    public void setTags(ArrayList<String> arrayList) {
        this.tags = arrayList;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setThumb(String str) {
        this.thumb = str;
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

    public void setTop_link_status(String str) {
        this.top_link_status = str;
    }

    public void setTopic(BBSTopicObj bBSTopicObj) {
        if (PatchProxy.proxy(new Object[]{bBSTopicObj}, this, changeQuickRedirect, false, 14328, new Class[]{BBSTopicObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (this.topics == null) {
            this.topics = new ArrayList<>();
        }
        this.topics.add(0, bBSTopicObj);
    }

    public void setTopics(ArrayList<BBSTopicObj> arrayList) {
        this.topics = arrayList;
    }

    public void setUse_concept_type(String str) {
        this.use_concept_type = str;
    }

    public void setUser(BBSUserInfoObj bBSUserInfoObj) {
        this.user = bBSUserInfoObj;
    }

    public void setUser_support_state(UserSupportStateObj userSupportStateObj) {
        this.user_support_state = userSupportStateObj;
    }

    public void setUserid(String str) {
        this.userid = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public void setVertical(int i10) {
        this.vertical = i10;
    }

    public void setVideo_duration(String str) {
        this.video_duration = str;
    }

    public void setVideo_info(VideoInfoObj videoInfoObj) {
        this.video_info = videoInfoObj;
    }

    public void setVideo_local_path(String str) {
        this.video_local_path = str;
    }

    public void setVideo_thumb(String str) {
        this.video_thumb = str;
    }

    public void setVideo_type(String str) {
        this.video_type = str;
    }

    public void setVideo_url(String str) {
        this.video_url = str;
    }

    public void setView_limit(String str) {
        this.view_limit = str;
    }

    public void setVote_info(LinkVoteInfoObj linkVoteInfoObj) {
        this.vote_info = linkVoteInfoObj;
    }

    public void setWeb_view_url(String str) {
        this.web_view_url = str;
    }

    public BBSLinkObj toBBSLink() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14331, new Class[0], BBSLinkObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (BBSLinkObj) patchProxyResultProxy.result;
        }
        BBSLinkObj bBSLinkObj = new BBSLinkObj();
        bBSLinkObj.setLinkid(this.linkid);
        bBSLinkObj.setLink_tag(this.link_tag);
        bBSLinkObj.setHas_video(this.has_video);
        bBSLinkObj.setUse_concept_type(this.use_concept_type);
        bBSLinkObj.setPage_url(this.page_url);
        return bBSLinkObj;
    }
}
