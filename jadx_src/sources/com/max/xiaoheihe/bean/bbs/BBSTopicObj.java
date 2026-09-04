package com.max.xiaoheihe.bean.bbs;

import com.google.gson.annotations.SerializedName;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.bean.WikiObj;
import com.max.hbcustomview.indexbar.bean.BaseIndexPinyinBean;
import com.max.xiaoheihe.bean.game.GameObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.open.SocialConstants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class BBSTopicObj extends BaseIndexPinyinBean implements Serializable {
    public static final String SEARCH_TYPE_HASHRAG = "hashtag";
    public static final String SEARCH_TYPE_TOPIC = "topic";
    public static final String TOPIC_ID_FORBID = "57990";
    public static final String TOPIC_ID_TIMELINE = "58144";
    public static final String TYPE_FEEDBACK = "feedback";
    public static final String TYPE_LIST = "list";
    public static final String VIRTUAL_TAG_ACTION = "action";
    public static final String VIRTUAL_TAG_ADD = "add";
    public static final String VIRTUAL_TAG_MORE = "more";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -3833826060347095066L;
    private String bg_pic_url;
    private boolean checked;
    private TopicRankingObj datas;

    @SerializedName(alternate = {"descriptions"}, value = SocialConstants.PARAM_APP_DESC)
    private String desc;
    private String end_color;
    private String extra_desc;
    private GameObj game;
    private String h_src;
    private String hashtag_id;
    private BBSHb2StyleObj hb2style;
    private BBSHb3StyleObj hb3style;
    private List<TopicNavObj> header_nav;
    private BBSTopicHotObj hot;
    private ArrayList<String> irrelevant_topic_ids;
    private boolean isGameComment;
    private int is_follow;
    private String name;
    private String pic_color;
    private String pic_url;
    private String protocol;
    private KeyDescObj provisions;
    private int rank;
    private int rank_trend;

    @SerializedName("rec_src")
    private String recSrc;
    private List<BBSTopicObj> related_topics;
    private String room_count;
    private String search_type;
    private String show_desc;
    private String small_pic_main_color;
    private String small_pic_url;
    private ConceptTopicEntryObj special_type;
    private String start_color;
    private String sub_title;
    private KeyDescObj tag;
    private String topic_id;
    private String virtual_topic_tag;
    private WikiObj wiki;

    public boolean equals(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14198, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.topic_id.equals(((BBSTopicObj) obj).topic_id);
    }

    public String getBg_pic_url() {
        return this.bg_pic_url;
    }

    public TopicRankingObj getDatas() {
        return this.datas;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getEnd_color() {
        return this.end_color;
    }

    public String getExtra_desc() {
        return this.extra_desc;
    }

    public GameObj getGame() {
        return this.game;
    }

    public String getH_src() {
        return this.h_src;
    }

    public String getHashtag_id() {
        return this.hashtag_id;
    }

    public BBSHb2StyleObj getHb2style() {
        return this.hb2style;
    }

    public BBSHb3StyleObj getHb3style() {
        return this.hb3style;
    }

    public List<TopicNavObj> getHeader_nav() {
        return this.header_nav;
    }

    public BBSTopicHotObj getHot() {
        return this.hot;
    }

    public ArrayList<String> getIrrelevant_topic_ids() {
        return this.irrelevant_topic_ids;
    }

    public int getIs_follow() {
        return this.is_follow;
    }

    public String getName() {
        return this.name;
    }

    public String getPic_color() {
        return this.pic_color;
    }

    public String getPic_url() {
        return this.pic_url;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public KeyDescObj getProvisions() {
        return this.provisions;
    }

    public int getRank() {
        return this.rank;
    }

    public int getRank_trend() {
        return this.rank_trend;
    }

    public String getRecSrc() {
        return this.recSrc;
    }

    public List<BBSTopicObj> getRelated_topics() {
        return this.related_topics;
    }

    public String getRoom_count() {
        return this.room_count;
    }

    public String getSearch_type() {
        return this.search_type;
    }

    public String getShow_desc() {
        return this.show_desc;
    }

    public String getSmall_pic_main_color() {
        return this.small_pic_main_color;
    }

    public String getSmall_pic_url() {
        return this.small_pic_url;
    }

    public ConceptTopicEntryObj getSpecial_type() {
        return this.special_type;
    }

    public String getStart_color() {
        return this.start_color;
    }

    public String getSub_title() {
        return this.sub_title;
    }

    public KeyDescObj getTag() {
        return this.tag;
    }

    @Override // com.max.hbcustomview.indexbar.a
    public String getTarget() {
        return this.name;
    }

    public String getTopic_id() {
        return this.topic_id;
    }

    public String getVirtual_topic_tag() {
        return this.virtual_topic_tag;
    }

    public WikiObj getWiki() {
        return this.wiki;
    }

    public boolean isChecked() {
        return this.checked;
    }

    public boolean isGameComment() {
        return this.isGameComment;
    }

    public void setBg_pic_url(String str) {
        this.bg_pic_url = str;
    }

    public void setChecked(boolean z10) {
        this.checked = z10;
    }

    public void setDatas(TopicRankingObj topicRankingObj) {
        this.datas = topicRankingObj;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setEnd_color(String str) {
        this.end_color = str;
    }

    public void setExtra_desc(String str) {
        this.extra_desc = str;
    }

    public void setGame(GameObj gameObj) {
        this.game = gameObj;
    }

    public void setGameComment(boolean z10) {
        this.isGameComment = z10;
    }

    public void setH_src(String str) {
        this.h_src = str;
    }

    public void setHashtag_id(String str) {
        this.hashtag_id = str;
    }

    public void setHb2style(BBSHb2StyleObj bBSHb2StyleObj) {
        this.hb2style = bBSHb2StyleObj;
    }

    public void setHb3style(BBSHb3StyleObj bBSHb3StyleObj) {
        this.hb3style = bBSHb3StyleObj;
    }

    public void setHeader_nav(List<TopicNavObj> list) {
        this.header_nav = list;
    }

    public void setHot(BBSTopicHotObj bBSTopicHotObj) {
        this.hot = bBSTopicHotObj;
    }

    public void setIrrelevant_topic_ids(ArrayList<String> arrayList) {
        this.irrelevant_topic_ids = arrayList;
    }

    public void setIs_follow(int i10) {
        this.is_follow = i10;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPic_color(String str) {
        this.pic_color = str;
    }

    public void setPic_url(String str) {
        this.pic_url = str;
    }

    public void setProtocol(String str) {
        this.protocol = str;
    }

    public void setProvisions(KeyDescObj keyDescObj) {
        this.provisions = keyDescObj;
    }

    public void setRank(int i10) {
        this.rank = i10;
    }

    public void setRank_trend(int i10) {
        this.rank_trend = i10;
    }

    public void setRecSrc(String str) {
        this.recSrc = str;
    }

    public void setRelated_topics(List<BBSTopicObj> list) {
        this.related_topics = list;
    }

    public void setRoom_count(String str) {
        this.room_count = str;
    }

    public void setSearch_type(String str) {
        this.search_type = str;
    }

    public void setShow_desc(String str) {
        this.show_desc = str;
    }

    public void setSmall_pic_main_color(String str) {
        this.small_pic_main_color = str;
    }

    public void setSmall_pic_url(String str) {
        this.small_pic_url = str;
    }

    public void setSpecial_type(ConceptTopicEntryObj conceptTopicEntryObj) {
        this.special_type = conceptTopicEntryObj;
    }

    public void setStart_color(String str) {
        this.start_color = str;
    }

    public void setSub_title(String str) {
        this.sub_title = str;
    }

    public void setTag(KeyDescObj keyDescObj) {
        this.tag = keyDescObj;
    }

    public void setTopic_id(String str) {
        this.topic_id = str;
    }

    public void setVirtual_topic_tag(String str) {
        this.virtual_topic_tag = str;
    }

    public void setWiki(WikiObj wikiObj) {
        this.wiki = wikiObj;
    }
}
