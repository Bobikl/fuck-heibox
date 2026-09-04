package com.max.xiaoheihe.bean.game;

import com.alibaba.fastjson.annotation.JSONField;
import com.google.gson.annotations.SerializedName;
import com.max.basebbs.bean.video.VideoInfoObj;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.bean.TripleBannerPicObj;
import com.max.heybox.hblog.g;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.bean.mall.MallBundleObj;
import com.max.xiaoheihe.bean.mall.MallSkuObj;
import com.max.xiaoheihe.bean.rich.RichAttributeModelObj;
import com.max.xiaoheihe.module.game.d0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class RecommendGameListItemObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -8745018783911509073L;
    private KeyDescObj activity_dtl;

    @SerializedName(alternate = {d0.f87248t}, value = "appid")
    @JSONField(alternateNames = {d0.f87248t}, name = "appid")
    private String appid;
    private String author;
    private String background;
    private String bg_img;
    private List<MallBundleObj> bundles;
    private String compilation_id;
    private String content_type;
    private String count;
    private String create_at;
    private String desc;
    private String description;
    private List<KeyDescObj> entry;
    private List<BBSUserInfoObj> friends;
    private GameObj game;
    private String game_icon;
    private String game_img;
    private String game_name;
    private List<GameStoreItemObj> games;
    private String h_src;
    private String has_video;
    private List<RichAttributeModelObj> hb_rich_texts;
    private GamePriceObj heybox_price;
    private List<KeyDescObj> hot_tags;
    private String img;
    private String img_gif;
    private List<String> imgs;
    private boolean is_free;
    private String is_owned;
    private String key;
    private String label;
    private String link_id;
    private String link_tag;
    private String linkid;
    private String maxjia;
    private String newUrl;
    private String news_desc;
    private String next_sale_time;
    private List<GameRecommendedPlatformObj> platforms;
    private List<String> platforms_icon;
    private GamePriceObj price;
    private String product_intro;
    private String product_name;
    private int product_type;
    private String product_type_desc;
    private String protocol;

    /* JADX INFO: renamed from: qa, reason: collision with root package name */
    private String f76972qa;
    private String rec_cnt;
    private String recommend_desc;
    private String release_timestamp;
    private transient boolean reported_exposure;
    private List<RichAttributeModelObj> rich_tags;
    private String score;
    private String share_url;
    private List<MallSkuObj> skus;
    private String source;
    private TripleBannerPicObj split_imgs;
    private String title;
    private String type;
    private String update_time;
    private String url;
    private BBSUserInfoObj user;
    private VideoInfoObj video_info;
    private String video_thumb;
    private String video_url;

    private boolean selfEquals(Object obj, Object obj2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, obj2}, this, changeQuickRedirect, false, 14982, new Class[]{Object.class, Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        boolean zEquals = Objects.equals(obj, obj2);
        if (!zEquals) {
            g.x("RecommendGameListItemObj, selfEquals " + obj);
        }
        return zEquals;
    }

    public boolean equals(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14981, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendGameListItemObj)) {
            return false;
        }
        RecommendGameListItemObj recommendGameListItemObj = (RecommendGameListItemObj) obj;
        g.x("RecommendGameListItemObj, equals " + this.game_name + " , that = " + recommendGameListItemObj.game_name);
        return getProduct_type() == recommendGameListItemObj.getProduct_type() && isIs_free() == recommendGameListItemObj.isIs_free() && selfEquals(getGame_img(), recommendGameListItemObj.getGame_img()) && selfEquals(getPlatforms_icon(), recommendGameListItemObj.getPlatforms_icon()) && selfEquals(getRich_tags(), recommendGameListItemObj.getRich_tags()) && selfEquals(getHb_rich_texts(), recommendGameListItemObj.getHb_rich_texts()) && selfEquals(getH_src(), recommendGameListItemObj.getH_src()) && selfEquals(getLabel(), recommendGameListItemObj.getLabel()) && selfEquals(getHot_tags(), recommendGameListItemObj.getHot_tags()) && selfEquals(getRecommend_desc(), recommendGameListItemObj.getRecommend_desc()) && selfEquals(getIs_owned(), recommendGameListItemObj.getIs_owned()) && selfEquals(getAppid(), recommendGameListItemObj.getAppid()) && selfEquals(getPrice(), recommendGameListItemObj.getPrice()) && selfEquals(getHeybox_price(), recommendGameListItemObj.getHeybox_price()) && selfEquals(getGame_name(), recommendGameListItemObj.getGame_name()) && Objects.equals(getFriends(), recommendGameListItemObj.getFriends());
    }

    public KeyDescObj getActivity_dtl() {
        return this.activity_dtl;
    }

    public String getAppid() {
        return this.appid;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getBackground() {
        return this.background;
    }

    public String getBg_img() {
        return this.bg_img;
    }

    public List<MallBundleObj> getBundles() {
        return this.bundles;
    }

    public String getCompilation_id() {
        return this.compilation_id;
    }

    public String getContent_type() {
        return this.content_type;
    }

    public String getCount() {
        return this.count;
    }

    public String getCreate_at() {
        return this.create_at;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getDescription() {
        return this.description;
    }

    public List<KeyDescObj> getEntry() {
        return this.entry;
    }

    public List<BBSUserInfoObj> getFriends() {
        return this.friends;
    }

    public GameObj getGame() {
        return this.game;
    }

    public String getGame_icon() {
        return this.game_icon;
    }

    public String getGame_img() {
        return this.game_img;
    }

    public String getGame_name() {
        return this.game_name;
    }

    public List<GameStoreItemObj> getGames() {
        return this.games;
    }

    public String getH_src() {
        return this.h_src;
    }

    public String getHas_video() {
        return this.has_video;
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

    public String getImg() {
        return this.img;
    }

    public String getImg_gif() {
        return this.img_gif;
    }

    public List<String> getImgs() {
        return this.imgs;
    }

    public String getIs_owned() {
        return this.is_owned;
    }

    public String getKey() {
        return this.key;
    }

    public String getLabel() {
        return this.label;
    }

    public String getLink_id() {
        return this.link_id;
    }

    public String getLink_tag() {
        return this.link_tag;
    }

    public String getLinkid() {
        return this.linkid;
    }

    public String getMaxjia() {
        return this.maxjia;
    }

    public String getNewUrl() {
        return this.newUrl;
    }

    public String getNews_desc() {
        return this.news_desc;
    }

    public String getNext_sale_time() {
        return this.next_sale_time;
    }

    public List<GameRecommendedPlatformObj> getPlatforms() {
        return this.platforms;
    }

    public List<String> getPlatforms_icon() {
        return this.platforms_icon;
    }

    public GamePriceObj getPrice() {
        return this.price;
    }

    public String getProduct_intro() {
        return this.product_intro;
    }

    public String getProduct_name() {
        return this.product_name;
    }

    public int getProduct_type() {
        return this.product_type;
    }

    public String getProduct_type_desc() {
        return this.product_type_desc;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public String getQa() {
        return this.f76972qa;
    }

    public String getRec_cnt() {
        return this.rec_cnt;
    }

    public String getRecommend_desc() {
        return this.recommend_desc;
    }

    public String getRelease_timestamp() {
        return this.release_timestamp;
    }

    public List<RichAttributeModelObj> getRich_tags() {
        return this.rich_tags;
    }

    public String getScore() {
        return this.score;
    }

    public String getShare_url() {
        return this.share_url;
    }

    public List<MallSkuObj> getSkus() {
        return this.skus;
    }

    public String getSource() {
        return this.source;
    }

    public TripleBannerPicObj getSplit_imgs() {
        return this.split_imgs;
    }

    public String getTitle() {
        return this.title;
    }

    public String getType() {
        return this.type;
    }

    public String getUpdate_time() {
        return this.update_time;
    }

    public String getUrl() {
        return this.url;
    }

    public BBSUserInfoObj getUser() {
        return this.user;
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

    public boolean isIs_free() {
        return this.is_free;
    }

    public boolean isReported_exposure() {
        return this.reported_exposure;
    }

    public void setActivity_dtl(KeyDescObj keyDescObj) {
        this.activity_dtl = keyDescObj;
    }

    public void setAppid(String str) {
        this.appid = str;
    }

    public void setAuthor(String str) {
        this.author = str;
    }

    public void setBackground(String str) {
        this.background = str;
    }

    public void setBg_img(String str) {
        this.bg_img = str;
    }

    public void setBundles(List<MallBundleObj> list) {
        this.bundles = list;
    }

    public void setCompilation_id(String str) {
        this.compilation_id = str;
    }

    public void setContent_type(String str) {
        this.content_type = str;
    }

    public void setCount(String str) {
        this.count = str;
    }

    public void setCreate_at(String str) {
        this.create_at = str;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setEntry(List<KeyDescObj> list) {
        this.entry = list;
    }

    public void setFriends(List<BBSUserInfoObj> list) {
        this.friends = list;
    }

    public void setGame(GameObj gameObj) {
        this.game = gameObj;
    }

    public void setGame_icon(String str) {
        this.game_icon = str;
    }

    public void setGame_img(String str) {
        this.game_img = str;
    }

    public void setGame_name(String str) {
        this.game_name = str;
    }

    public void setGames(List<GameStoreItemObj> list) {
        this.games = list;
    }

    public void setH_src(String str) {
        this.h_src = str;
    }

    public void setHas_video(String str) {
        this.has_video = str;
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

    public void setImg(String str) {
        this.img = str;
    }

    public void setImg_gif(String str) {
        this.img_gif = str;
    }

    public void setImgs(List<String> list) {
        this.imgs = list;
    }

    public void setIs_free(boolean z10) {
        this.is_free = z10;
    }

    public void setIs_owned(String str) {
        this.is_owned = str;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setLabel(String str) {
        this.label = str;
    }

    public void setLink_id(String str) {
        this.link_id = str;
    }

    public void setLink_tag(String str) {
        this.link_tag = str;
    }

    public void setLinkid(String str) {
        this.linkid = str;
    }

    public void setMaxjia(String str) {
        this.maxjia = str;
    }

    public void setNewUrl(String str) {
        this.newUrl = str;
    }

    public void setNews_desc(String str) {
        this.news_desc = str;
    }

    public void setNext_sale_time(String str) {
        this.next_sale_time = str;
    }

    public void setPlatforms(List<GameRecommendedPlatformObj> list) {
        this.platforms = list;
    }

    public void setPlatforms_icon(List<String> list) {
        this.platforms_icon = list;
    }

    public void setPrice(GamePriceObj gamePriceObj) {
        this.price = gamePriceObj;
    }

    public void setProduct_intro(String str) {
        this.product_intro = str;
    }

    public void setProduct_name(String str) {
        this.product_name = str;
    }

    public void setProduct_type(int i10) {
        this.product_type = i10;
    }

    public void setProduct_type_desc(String str) {
        this.product_type_desc = str;
    }

    public void setProtocol(String str) {
        this.protocol = str;
    }

    public void setQa(String str) {
        this.f76972qa = str;
    }

    public void setRec_cnt(String str) {
        this.rec_cnt = str;
    }

    public void setRecommend_desc(String str) {
        this.recommend_desc = str;
    }

    public void setRelease_timestamp(String str) {
        this.release_timestamp = str;
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

    public void setShare_url(String str) {
        this.share_url = str;
    }

    public void setSkus(List<MallSkuObj> list) {
        this.skus = list;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public void setSplit_imgs(TripleBannerPicObj tripleBannerPicObj) {
        this.split_imgs = tripleBannerPicObj;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUpdate_time(String str) {
        this.update_time = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setUser(BBSUserInfoObj bBSUserInfoObj) {
        this.user = bBSUserInfoObj;
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
}
