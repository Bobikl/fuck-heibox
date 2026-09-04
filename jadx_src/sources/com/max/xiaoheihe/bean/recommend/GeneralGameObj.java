package com.max.xiaoheihe.bean.recommend;

import com.alibaba.fastjson.annotation.JSONField;
import com.google.gson.annotations.SerializedName;
import com.max.xiaoheihe.bean.game.GameBundleObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.bean.game.GamePriceObj;
import com.max.xiaoheihe.bean.game.GameScreenshotObj;
import com.max.xiaoheihe.module.game.d0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class GeneralGameObj {
    public static ChangeQuickRedirect changeQuickRedirect;

    @SerializedName(alternate = {d0.f87248t}, value = "appid")
    @JSONField(alternateNames = {d0.f87248t}, name = "appid")
    private String appid;
    private String bundle_id;
    private String desc;
    private String expect_num;
    private String game_count;
    private String game_type;
    private List<String> genres;
    private String h_src;
    private String hidden_type;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private String f77012id;
    private String image;
    private boolean is_free;
    private String name;
    private String peak_user_num;
    private List<String> platforms;
    private List<String> platforms_icon;
    private GamePriceObj price;
    private String release_date;
    private String score;
    private String score_comment;
    private String score_desc;
    private List<GameScreenshotObj> screenshots;
    private String sub_title;
    private String vertical_img_bg;
    private String vertical_img_fg;

    public boolean equals(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15809, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GeneralGameObj)) {
            return false;
        }
        GeneralGameObj generalGameObj = (GeneralGameObj) obj;
        return isIs_free() == generalGameObj.isIs_free() && Objects.equals(getImage(), generalGameObj.getImage()) && Objects.equals(getName(), generalGameObj.getName()) && Objects.equals(getPeak_user_num(), generalGameObj.getPeak_user_num()) && Objects.equals(getPrice(), generalGameObj.getPrice()) && Objects.equals(getRelease_date(), generalGameObj.getRelease_date()) && Objects.equals(getAppid(), generalGameObj.getAppid()) && Objects.equals(getScore(), generalGameObj.getScore()) && Objects.equals(getGenres(), generalGameObj.getGenres()) && Objects.equals(getPlatforms(), generalGameObj.getPlatforms()) && Objects.equals(getPlatforms_icon(), generalGameObj.getPlatforms_icon()) && Objects.equals(getDesc(), generalGameObj.getDesc()) && Objects.equals(getId(), generalGameObj.getId()) && Objects.equals(getSub_title(), generalGameObj.getSub_title()) && Objects.equals(getBundle_id(), generalGameObj.getBundle_id()) && Objects.equals(getGame_count(), generalGameObj.getGame_count()) && Objects.equals(getScreenshots(), generalGameObj.getScreenshots()) && Objects.equals(getVertical_img_fg(), generalGameObj.getVertical_img_fg()) && Objects.equals(getVertical_img_bg(), generalGameObj.getVertical_img_bg()) && Objects.equals(getHidden_type(), generalGameObj.getHidden_type()) && Objects.equals(getScore_desc(), generalGameObj.getScore_desc()) && Objects.equals(getGame_type(), generalGameObj.getGame_type()) && Objects.equals(getExpect_num(), generalGameObj.getExpect_num()) && Objects.equals(getScore_comment(), generalGameObj.getScore_comment()) && Objects.equals(getH_src(), generalGameObj.getH_src());
    }

    public String getAppid() {
        return this.appid;
    }

    public String getBundle_id() {
        return this.bundle_id;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getExpect_num() {
        return this.expect_num;
    }

    public String getGame_count() {
        return this.game_count;
    }

    public String getGame_type() {
        return this.game_type;
    }

    public List<String> getGenres() {
        return this.genres;
    }

    public String getH_src() {
        return this.h_src;
    }

    public String getHidden_type() {
        return this.hidden_type;
    }

    public String getId() {
        return this.f77012id;
    }

    public String getImage() {
        return this.image;
    }

    public String getName() {
        return this.name;
    }

    public String getPeak_user_num() {
        return this.peak_user_num;
    }

    public List<String> getPlatforms() {
        return this.platforms;
    }

    public List<String> getPlatforms_icon() {
        return this.platforms_icon;
    }

    public GamePriceObj getPrice() {
        return this.price;
    }

    public String getRelease_date() {
        return this.release_date;
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

    public String getSub_title() {
        return this.sub_title;
    }

    public String getVertical_img_bg() {
        return this.vertical_img_bg;
    }

    public String getVertical_img_fg() {
        return this.vertical_img_fg;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15810, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : Objects.hash(getImage(), Boolean.valueOf(isIs_free()), getName(), getPeak_user_num(), getPrice(), getRelease_date(), getAppid(), getScore(), getGenres(), getPlatforms(), getPlatforms_icon(), getDesc(), getId(), getSub_title(), getBundle_id(), getGame_count(), getScreenshots(), getVertical_img_fg(), getVertical_img_bg(), getHidden_type(), getScore_desc(), getGame_type(), getExpect_num(), getScore_comment(), getH_src());
    }

    public boolean isIs_free() {
        return this.is_free;
    }

    public boolean is_free() {
        return this.is_free;
    }

    public GeneralGameObj setAppid(String str) {
        this.appid = str;
        return this;
    }

    public GeneralGameObj setBundle_id(String str) {
        this.bundle_id = str;
        return this;
    }

    public GeneralGameObj setDesc(String str) {
        this.desc = str;
        return this;
    }

    public void setExpect_num(String str) {
        this.expect_num = str;
    }

    public GeneralGameObj setGame_count(String str) {
        this.game_count = str;
        return this;
    }

    public void setGame_type(String str) {
        this.game_type = str;
    }

    public GeneralGameObj setGenres(List<String> list) {
        this.genres = list;
        return this;
    }

    public void setH_src(String str) {
        this.h_src = str;
    }

    public void setHidden_type(String str) {
        this.hidden_type = str;
    }

    public GeneralGameObj setId(String str) {
        this.f77012id = str;
        return this;
    }

    public GeneralGameObj setImage(String str) {
        this.image = str;
        return this;
    }

    public GeneralGameObj setIs_free(boolean z10) {
        this.is_free = z10;
        return this;
    }

    public GeneralGameObj setName(String str) {
        this.name = str;
        return this;
    }

    public GeneralGameObj setPeak_user_num(String str) {
        this.peak_user_num = str;
        return this;
    }

    public GeneralGameObj setPlatforms(List<String> list) {
        this.platforms = list;
        return this;
    }

    public void setPlatforms_icon(List<String> list) {
        this.platforms_icon = list;
    }

    public GeneralGameObj setPrice(GamePriceObj gamePriceObj) {
        this.price = gamePriceObj;
        return this;
    }

    public GeneralGameObj setRelease_date(String str) {
        this.release_date = str;
        return this;
    }

    public GeneralGameObj setScore(String str) {
        this.score = str;
        return this;
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

    public GeneralGameObj setSub_title(String str) {
        this.sub_title = str;
        return this;
    }

    public void setVertical_img_bg(String str) {
        this.vertical_img_bg = str;
    }

    public void setVertical_img_fg(String str) {
        this.vertical_img_fg = str;
    }

    public GameBundleObj toGameBundleObj() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15807, new Class[0], GameBundleObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameBundleObj) patchProxyResultProxy.result;
        }
        GameBundleObj gameBundleObj = new GameBundleObj();
        gameBundleObj.setPrice(this.price);
        gameBundleObj.setName(this.name);
        gameBundleObj.setBundle_id(this.bundle_id);
        gameBundleObj.setGame_count(this.game_count);
        gameBundleObj.setImage(this.image);
        return gameBundleObj;
    }

    public GameObj toGameObj() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15806, new Class[0], GameObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameObj) patchProxyResultProxy.result;
        }
        GameObj gameObj = new GameObj();
        gameObj.setImage(this.image);
        gameObj.setIs_free(this.is_free);
        gameObj.setName(this.name);
        gameObj.setPeak_user_num(this.peak_user_num);
        gameObj.setPlatforms(this.platforms);
        gameObj.setPrice(this.price);
        gameObj.setRelease_date(this.release_date);
        gameObj.setScore(this.score);
        gameObj.setAppid(this.appid);
        return gameObj;
    }

    public GameSetObj toGameSetObj() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15808, new Class[0], GameSetObj.class);
        return patchProxyResultProxy.isSupported ? (GameSetObj) patchProxyResultProxy.result : new GameSetObj().setImage(this.image).setDesc(this.desc).setId(this.f77012id).setSub_title(this.sub_title);
    }
}
