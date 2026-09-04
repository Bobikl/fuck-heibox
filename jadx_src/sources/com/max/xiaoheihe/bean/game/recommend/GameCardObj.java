package com.max.xiaoheihe.bean.game.recommend;

import androidx.compose.runtime.internal.o;
import com.google.gson.JsonObject;
import com.max.hbcommon.bean.analytics.PathSrcNode;
import com.max.xiaoheihe.bean.game.RecommendGameListItemObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameCardObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public class GameCardObj extends GameRecommendBaseObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private GameAwardObj award;

    @e
    private String border_end_color;

    @e
    private String border_start_color;

    @e
    private String bottom_end_color;

    @e
    private String bottom_start_color;

    @e
    private String color;

    @e
    private RecommendGameListItemObj game;

    @e
    private String h_src;

    @e
    private String img;

    @e
    private String img_vertical;
    private transient int index = -1;

    @e
    private String tag;

    @e
    private String tag_color;

    @Override // com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj
    @d
    public PathSrcNode copyToPathNode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15351, new Class[0], PathSrcNode.class);
        if (patchProxyResultProxy.isSupported) {
            return (PathSrcNode) patchProxyResultProxy.result;
        }
        PathSrcNode node = super.copyToPathNode();
        JsonObject addition = node.getAddition();
        RecommendGameListItemObj recommendGameListItemObj = this.game;
        String h_src = null;
        addition.addProperty("app_id", recommendGameListItemObj != null ? recommendGameListItemObj.getAppid() : null);
        JsonObject addition2 = node.getAddition();
        String str = this.h_src;
        if (str == null) {
            RecommendGameListItemObj recommendGameListItemObj2 = this.game;
            if (recommendGameListItemObj2 != null) {
                h_src = recommendGameListItemObj2.getH_src();
            }
        } else {
            h_src = str;
        }
        addition2.addProperty("h_src", h_src);
        f0.o(node, "node");
        return node;
    }

    @Override // com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj
    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15352, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameCardObj) || !super.equals(obj)) {
            return false;
        }
        GameCardObj gameCardObj = (GameCardObj) obj;
        return f0.g(this.tag, gameCardObj.tag) && f0.g(this.tag_color, gameCardObj.tag_color) && f0.g(this.color, gameCardObj.color) && f0.g(this.border_start_color, gameCardObj.border_start_color) && f0.g(this.border_end_color, gameCardObj.border_end_color) && f0.g(this.bottom_start_color, gameCardObj.bottom_start_color) && f0.g(this.bottom_end_color, gameCardObj.bottom_end_color) && f0.g(this.game, gameCardObj.game) && f0.g(this.img, gameCardObj.img) && f0.g(this.award, gameCardObj.award) && f0.g(this.img_vertical, gameCardObj.img_vertical);
    }

    @e
    public final GameAwardObj getAward() {
        return this.award;
    }

    @e
    public final String getBorder_end_color() {
        return this.border_end_color;
    }

    @e
    public final String getBorder_start_color() {
        return this.border_start_color;
    }

    @e
    public final String getBottom_end_color() {
        return this.bottom_end_color;
    }

    @e
    public final String getBottom_start_color() {
        return this.bottom_start_color;
    }

    @e
    public final String getColor() {
        return this.color;
    }

    @e
    public final RecommendGameListItemObj getGame() {
        return this.game;
    }

    @e
    public final String getH_src() {
        return this.h_src;
    }

    @e
    public final String getImg() {
        return this.img;
    }

    @e
    public final String getImg_vertical() {
        return this.img_vertical;
    }

    public final int getIndex() {
        return this.index;
    }

    @e
    public final String getTag() {
        return this.tag;
    }

    @e
    public final String getTag_color() {
        return this.tag_color;
    }

    @Override // com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj
    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15353, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.tag;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.tag_color;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.color;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.border_start_color;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.border_end_color;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.bottom_start_color;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.bottom_end_color;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        RecommendGameListItemObj recommendGameListItemObj = this.game;
        int iHashCode8 = (iHashCode7 + (recommendGameListItemObj != null ? recommendGameListItemObj.hashCode() : 0)) * 31;
        String str8 = this.img;
        int iHashCode9 = (iHashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31;
        GameAwardObj gameAwardObj = this.award;
        int iHashCode10 = (iHashCode9 + (gameAwardObj != null ? gameAwardObj.hashCode() : 0)) * 31;
        String str9 = this.img_vertical;
        return iHashCode10 + (str9 != null ? str9.hashCode() : 0);
    }

    public final void setAward(@e GameAwardObj gameAwardObj) {
        this.award = gameAwardObj;
    }

    public final void setBorder_end_color(@e String str) {
        this.border_end_color = str;
    }

    public final void setBorder_start_color(@e String str) {
        this.border_start_color = str;
    }

    public final void setBottom_end_color(@e String str) {
        this.bottom_end_color = str;
    }

    public final void setBottom_start_color(@e String str) {
        this.bottom_start_color = str;
    }

    public final void setColor(@e String str) {
        this.color = str;
    }

    public final void setGame(@e RecommendGameListItemObj recommendGameListItemObj) {
        this.game = recommendGameListItemObj;
    }

    public final void setH_src(@e String str) {
        this.h_src = str;
    }

    public final void setImg(@e String str) {
        this.img = str;
    }

    public final void setImg_vertical(@e String str) {
        this.img_vertical = str;
    }

    public final void setIndex(int i10) {
        this.index = i10;
    }

    public final void setTag(@e String str) {
        this.tag = str;
    }

    public final void setTag_color(@e String str) {
        this.tag_color = str;
    }
}
