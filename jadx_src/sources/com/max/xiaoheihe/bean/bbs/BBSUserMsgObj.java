package com.max.xiaoheihe.bean.bbs;

import androidx.annotation.p0;
import com.alibaba.fastjson.annotation.JSONField;
import com.google.gson.annotations.SerializedName;
import com.max.xiaoheihe.bean.chat.InviteInfoObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class BBSUserMsgObj implements Serializable {
    public static final String FOLLOW_STATUS_ADD_AS_FRIEND = "2";
    public static final String FOLLOW_STATUS_FOLLOWING_EACH_OTHER = "3";
    public static final String FOLLOW_STATUS_HAS_FOLLOWED = "1";
    public static final String FOLLOW_STATUS_TO_FOLLOW = "0";
    public static final String INVITE_STATE_ACCEPTED = "1";
    public static final String INVITE_STATE_DENIED = "2";
    public static final String INVITE_STATE_RECEIVED = "0";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 7748558599537196883L;
    private String answer_linkid;

    @SerializedName(alternate = {"app_id"}, value = "appid")
    @JSONField(alternateNames = {"app_id"}, name = "appid")
    private String appid;
    private String comment_a_id;
    private String comment_a_is_cy;
    private String comment_a_text;
    private String comment_award_num;
    private String comment_b_is_cy;
    private String comment_b_text;
    private String comment_id;
    private String comment_img;
    private String comment_num;
    private String comment_type;
    private String count;
    private String create_at;
    private String description;
    private String enable_delete;
    private String entry;
    private String follow_status;
    private GameObj game_info;
    private String game_type;
    private String h_src;
    private String has_imgs;
    private String has_video;
    private String high_like_comment_protocol;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private String f76958id;
    private List<String> imgs;
    private String invite_id;
    private InviteInfoObj invite_info;
    private String is_cy;
    private String is_entry;
    private String is_favour;
    private String is_link_owner;
    private String is_owner;
    private String is_support;
    private String is_top;
    private String is_web;
    private String latest_msg_id;
    private BBSLinkObj link;
    private String link_award_num;
    private String link_desc;
    private String link_img;
    private String link_tag;
    private String link_title;
    private String link_user;
    private String linkid;
    private String message_id;
    private String message_type;
    private String newUrl;
    private String news_comment_award_num;
    private String news_id;
    private String newsid;
    private String online_desc;
    private String online_state;
    private String page_url;
    private BBSCommentObj parent_comment;
    private String protocol;
    private String qalink_id;
    private String qalink_title;
    private String read;
    private transient boolean reported_exposure;
    private String root_comment_id;
    private String state;
    private String sub_entry;
    private String text;
    private String timestamp;
    private String title;
    private BBSTopicObj topic;
    private String topic_name;
    private String up;
    private String use_concept_type;
    private BBSUserInfoObj user_a;
    private List<BBSUserInfoObj> user_as;
    private BBSUserInfoObj user_b;
    private String userid;
    private String userid_a;
    private String userid_b;

    public boolean equals(@p0 Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14203, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (!(obj instanceof BBSUserMsgObj)) {
            return super.equals(obj);
        }
        String str = this.message_id;
        return str != null && str.equals(((BBSUserMsgObj) obj).getMessage_id());
    }

    public String getAnswer_linkid() {
        return this.answer_linkid;
    }

    public String getAppid() {
        return this.appid;
    }

    public String getComment_a_id() {
        return this.comment_a_id;
    }

    public String getComment_a_is_cy() {
        return this.comment_a_is_cy;
    }

    public String getComment_a_text() {
        return this.comment_a_text;
    }

    public String getComment_award_num() {
        return this.comment_award_num;
    }

    public String getComment_b_is_cy() {
        return this.comment_b_is_cy;
    }

    public String getComment_b_text() {
        return this.comment_b_text;
    }

    public String getComment_id() {
        return this.comment_id;
    }

    public String getComment_img() {
        return this.comment_img;
    }

    public String getComment_num() {
        return this.comment_num;
    }

    public String getComment_type() {
        return this.comment_type;
    }

    public String getCount() {
        return this.count;
    }

    public String getCreate_at() {
        return this.create_at;
    }

    public String getDescription() {
        return this.description;
    }

    public String getEnable_delete() {
        return this.enable_delete;
    }

    public String getEntry() {
        return this.entry;
    }

    public String getFollow_status() {
        return this.follow_status;
    }

    public GameObj getGame_info() {
        return this.game_info;
    }

    public String getGame_type() {
        return this.game_type;
    }

    public String getH_src() {
        return this.h_src;
    }

    public String getHas_imgs() {
        return this.has_imgs;
    }

    public String getHas_video() {
        return this.has_video;
    }

    public String getHighLikeCommentProtocol() {
        return this.high_like_comment_protocol;
    }

    public String getHigh_like_comment_protocol() {
        return this.high_like_comment_protocol;
    }

    public String getId() {
        return this.f76958id;
    }

    public List<String> getImgs() {
        return this.imgs;
    }

    public String getInvite_id() {
        return this.invite_id;
    }

    public InviteInfoObj getInvite_info() {
        return this.invite_info;
    }

    public String getIs_cy() {
        return this.is_cy;
    }

    public String getIs_entry() {
        return this.is_entry;
    }

    public String getIs_favour() {
        return this.is_favour;
    }

    public String getIs_link_owner() {
        return this.is_link_owner;
    }

    public String getIs_owner() {
        return this.is_owner;
    }

    public String getIs_support() {
        return this.is_support;
    }

    public String getIs_top() {
        return this.is_top;
    }

    public String getIs_web() {
        return this.is_web;
    }

    public String getLatest_msg_id() {
        return this.latest_msg_id;
    }

    public BBSLinkObj getLink() {
        return this.link;
    }

    public String getLink_award_num() {
        return this.link_award_num;
    }

    public String getLink_desc() {
        return this.link_desc;
    }

    public String getLink_img() {
        return this.link_img;
    }

    public String getLink_tag() {
        return this.link_tag;
    }

    public String getLink_title() {
        return this.link_title;
    }

    public String getLink_user() {
        return this.link_user;
    }

    public String getLinkid() {
        return this.linkid;
    }

    public String getMessage_id() {
        return this.message_id;
    }

    public String getMessage_type() {
        return this.message_type;
    }

    public String getNewUrl() {
        return this.newUrl;
    }

    public String getNews_comment_award_num() {
        return this.news_comment_award_num;
    }

    public String getNews_id() {
        return this.news_id;
    }

    public String getNewsid() {
        return this.newsid;
    }

    public String getOnline_desc() {
        return this.online_desc;
    }

    public String getOnline_state() {
        return this.online_state;
    }

    public String getPage_url() {
        return this.page_url;
    }

    public BBSCommentObj getParent_comment() {
        return this.parent_comment;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public String getQalink_id() {
        return this.qalink_id;
    }

    public String getQalink_title() {
        return this.qalink_title;
    }

    public String getRead() {
        return this.read;
    }

    public String getRoot_comment_id() {
        return this.root_comment_id;
    }

    public String getState() {
        return this.state;
    }

    public String getSub_entry() {
        return this.sub_entry;
    }

    public String getText() {
        return this.text;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public String getTitle() {
        return this.title;
    }

    public BBSTopicObj getTopic() {
        return this.topic;
    }

    public String getTopic_name() {
        return this.topic_name;
    }

    public String getUp() {
        return this.up;
    }

    public String getUse_concept_type() {
        return this.use_concept_type;
    }

    public BBSUserInfoObj getUser_a() {
        return this.user_a;
    }

    public List<BBSUserInfoObj> getUser_as() {
        return this.user_as;
    }

    public BBSUserInfoObj getUser_b() {
        return this.user_b;
    }

    public String getUserid() {
        return this.userid;
    }

    public String getUserid_a() {
        return this.userid_a;
    }

    public String getUserid_b() {
        return this.userid_b;
    }

    public boolean isReported_exposure() {
        return this.reported_exposure;
    }

    public void setAnswer_linkid(String str) {
        this.answer_linkid = str;
    }

    public void setAppid(String str) {
        this.appid = str;
    }

    public void setComment_a_id(String str) {
        this.comment_a_id = str;
    }

    public void setComment_a_is_cy(String str) {
        this.comment_a_is_cy = str;
    }

    public void setComment_a_text(String str) {
        this.comment_a_text = str;
    }

    public void setComment_award_num(String str) {
        this.comment_award_num = str;
    }

    public void setComment_b_is_cy(String str) {
        this.comment_b_is_cy = str;
    }

    public void setComment_b_text(String str) {
        this.comment_b_text = str;
    }

    public void setComment_id(String str) {
        this.comment_id = str;
    }

    public void setComment_img(String str) {
        this.comment_img = str;
    }

    public void setComment_num(String str) {
        this.comment_num = str;
    }

    public void setComment_type(String str) {
        this.comment_type = str;
    }

    public void setCount(String str) {
        this.count = str;
    }

    public void setCreate_at(String str) {
        this.create_at = str;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setEnable_delete(String str) {
        this.enable_delete = str;
    }

    public void setEntry(String str) {
        this.entry = str;
    }

    public void setFollow_status(String str) {
        this.follow_status = str;
    }

    public void setGame_info(GameObj gameObj) {
        this.game_info = gameObj;
    }

    public void setGame_type(String str) {
        this.game_type = str;
    }

    public void setH_src(String str) {
        this.h_src = str;
    }

    public void setHas_imgs(String str) {
        this.has_imgs = str;
    }

    public void setHas_video(String str) {
        this.has_video = str;
    }

    public void setHighLikeCommentProtocol(String str) {
        this.high_like_comment_protocol = str;
    }

    public void setHigh_like_comment_protocol(String str) {
        this.high_like_comment_protocol = str;
    }

    public void setId(String str) {
        this.f76958id = str;
    }

    public void setImgs(List<String> list) {
        this.imgs = list;
    }

    public void setInvite_id(String str) {
        this.invite_id = str;
    }

    public void setInvite_info(InviteInfoObj inviteInfoObj) {
        this.invite_info = inviteInfoObj;
    }

    public void setIs_cy(String str) {
        this.is_cy = str;
    }

    public void setIs_entry(String str) {
        this.is_entry = str;
    }

    public void setIs_favour(String str) {
        this.is_favour = str;
    }

    public void setIs_link_owner(String str) {
        this.is_link_owner = str;
    }

    public void setIs_owner(String str) {
        this.is_owner = str;
    }

    public void setIs_support(String str) {
        this.is_support = str;
    }

    public void setIs_top(String str) {
        this.is_top = str;
    }

    public void setIs_web(String str) {
        this.is_web = str;
    }

    public void setLatest_msg_id(String str) {
        this.latest_msg_id = str;
    }

    public void setLink(BBSLinkObj bBSLinkObj) {
        this.link = bBSLinkObj;
    }

    public void setLink_award_num(String str) {
        this.link_award_num = str;
    }

    public void setLink_desc(String str) {
        this.link_desc = str;
    }

    public void setLink_img(String str) {
        this.link_img = str;
    }

    public void setLink_tag(String str) {
        this.link_tag = str;
    }

    public void setLink_title(String str) {
        this.link_title = str;
    }

    public void setLink_user(String str) {
        this.link_user = str;
    }

    public void setLinkid(String str) {
        this.linkid = str;
    }

    public void setMessage_id(String str) {
        this.message_id = str;
    }

    public void setMessage_type(String str) {
        this.message_type = str;
    }

    public void setNewUrl(String str) {
        this.newUrl = str;
    }

    public void setNews_comment_award_num(String str) {
        this.news_comment_award_num = str;
    }

    public void setNews_id(String str) {
        this.news_id = str;
    }

    public void setNewsid(String str) {
        this.newsid = str;
    }

    public void setOnline_desc(String str) {
        this.online_desc = str;
    }

    public void setOnline_state(String str) {
        this.online_state = str;
    }

    public void setPage_url(String str) {
        this.page_url = str;
    }

    public void setParent_comment(BBSCommentObj bBSCommentObj) {
        this.parent_comment = bBSCommentObj;
    }

    public void setProtocol(String str) {
        this.protocol = str;
    }

    public void setQalink_id(String str) {
        this.qalink_id = str;
    }

    public void setQalink_title(String str) {
        this.qalink_title = str;
    }

    public void setRead(String str) {
        this.read = str;
    }

    public void setReported_exposure(boolean z10) {
        this.reported_exposure = z10;
    }

    public void setRoot_comment_id(String str) {
        this.root_comment_id = str;
    }

    public void setState(String str) {
        this.state = str;
    }

    public void setSub_entry(String str) {
        this.sub_entry = str;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setTimestamp(String str) {
        this.timestamp = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTopic(BBSTopicObj bBSTopicObj) {
        this.topic = bBSTopicObj;
    }

    public void setTopic_name(String str) {
        this.topic_name = str;
    }

    public void setUp(String str) {
        this.up = str;
    }

    public void setUse_concept_type(String str) {
        this.use_concept_type = str;
    }

    public void setUser_a(BBSUserInfoObj bBSUserInfoObj) {
        this.user_a = bBSUserInfoObj;
    }

    public void setUser_as(List<BBSUserInfoObj> list) {
        this.user_as = list;
    }

    public void setUser_b(BBSUserInfoObj bBSUserInfoObj) {
        this.user_b = bBSUserInfoObj;
    }

    public void setUserid(String str) {
        this.userid = str;
    }

    public void setUserid_a(String str) {
        this.userid_a = str;
    }

    public void setUserid_b(String str) {
        this.userid_b = str;
    }

    public BBSLinkObj toBBSLinkObj() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14204, new Class[0], BBSLinkObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (BBSLinkObj) patchProxyResultProxy.result;
        }
        BBSLinkObj bBSLinkObj = new BBSLinkObj();
        bBSLinkObj.setLinkid(this.linkid);
        bBSLinkObj.setLink_tag(this.link_tag);
        bBSLinkObj.setHas_video(this.has_video);
        bBSLinkObj.setUse_concept_type(this.use_concept_type);
        bBSLinkObj.setRoot_comment_id(this.root_comment_id);
        bBSLinkObj.setComment_id(this.comment_id);
        bBSLinkObj.setPage_url(this.page_url);
        return bBSLinkObj;
    }
}
