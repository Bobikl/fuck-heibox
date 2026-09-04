package com.max.xiaoheihe.bean.game.recommend;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.game.GameObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameCardV2Obj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class GameCardV2Obj extends GameRecommendBaseObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private GameAwardObj award;

    @e
    private String border_end_color;

    @e
    private String border_start_color;

    @e
    private String color;

    @e
    private GameObj game;

    @e
    private final String h_src;

    @e
    private String img;

    @e
    private String tag;

    @e
    private String tag_color;

    @Override // com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj
    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15354, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!f0.g(GameCardV2Obj.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        f0.n(obj, "null cannot be cast to non-null type com.max.xiaoheihe.bean.game.recommend.GameCardV2Obj");
        GameCardV2Obj gameCardV2Obj = (GameCardV2Obj) obj;
        return f0.g(this.tag, gameCardV2Obj.tag) && f0.g(this.tag_color, gameCardV2Obj.tag_color) && f0.g(this.color, gameCardV2Obj.color) && f0.g(this.border_start_color, gameCardV2Obj.border_start_color) && f0.g(this.border_end_color, gameCardV2Obj.border_end_color) && f0.g(this.game, gameCardV2Obj.game) && f0.g(this.img, gameCardV2Obj.img) && f0.g(this.award, gameCardV2Obj.award);
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
    public final String getColor() {
        return this.color;
    }

    @e
    public final GameObj getGame() {
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
    public final String getTag() {
        return this.tag;
    }

    @e
    public final String getTag_color() {
        return this.tag_color;
    }

    @Override // com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj
    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15355, new Class[0], Integer.TYPE);
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
        GameObj gameObj = this.game;
        int iHashCode6 = (iHashCode5 + (gameObj != null ? gameObj.hashCode() : 0)) * 31;
        String str6 = this.img;
        int iHashCode7 = (iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        GameAwardObj gameAwardObj = this.award;
        return iHashCode7 + (gameAwardObj != null ? gameAwardObj.hashCode() : 0);
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

    public final void setColor(@e String str) {
        this.color = str;
    }

    public final void setGame(@e GameObj gameObj) {
        this.game = gameObj;
    }

    public final void setImg(@e String str) {
        this.img = str;
    }

    public final void setTag(@e String str) {
        this.tag = str;
    }

    public final void setTag_color(@e String str) {
        this.tag_color = str;
    }
}
