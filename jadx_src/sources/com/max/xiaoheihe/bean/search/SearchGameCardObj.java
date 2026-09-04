package com.max.xiaoheihe.bean.search;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.bean.game.recommend.GameCardVideoMovieObj;
import com.max.xiaoheihe.bean.game.recommend.GameCardVideoObj;
import com.max.xiaoheihe.module.game.r1;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SearchGameCardObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class SearchGameCardObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

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
    private GameObj game;

    @e
    private String img;

    @e
    private GameCardVideoMovieObj movie;

    @e
    private String tag;

    @e
    private String tag_end_color;

    @e
    private String tag_icon;

    @e
    private String tag_start_color;

    public SearchGameCardObj(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e String str8, @e String str9, @e String str10, @e GameCardVideoMovieObj gameCardVideoMovieObj, @e GameObj gameObj) {
        this.img = str;
        this.tag = str2;
        this.tag_icon = str3;
        this.tag_start_color = str4;
        this.tag_end_color = str5;
        this.border_start_color = str6;
        this.border_end_color = str7;
        this.bottom_start_color = str8;
        this.bottom_end_color = str9;
        this.color = str10;
        this.movie = gameCardVideoMovieObj;
        this.game = gameObj;
    }

    public static /* synthetic */ SearchGameCardObj copy$default(SearchGameCardObj searchGameCardObj, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, GameCardVideoMovieObj gameCardVideoMovieObj, GameObj gameObj, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{searchGameCardObj, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, gameCardVideoMovieObj, gameObj, new Integer(i10), obj}, null, changeQuickRedirect, true, 15858, new Class[]{SearchGameCardObj.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, GameCardVideoMovieObj.class, GameObj.class, Integer.TYPE, Object.class}, SearchGameCardObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (SearchGameCardObj) patchProxyResultProxy.result;
        }
        return searchGameCardObj.copy((i10 & 1) != 0 ? searchGameCardObj.img : str, (i10 & 2) != 0 ? searchGameCardObj.tag : str2, (i10 & 4) != 0 ? searchGameCardObj.tag_icon : str3, (i10 & 8) != 0 ? searchGameCardObj.tag_start_color : str4, (i10 & 16) != 0 ? searchGameCardObj.tag_end_color : str5, (i10 & 32) != 0 ? searchGameCardObj.border_start_color : str6, (i10 & 64) != 0 ? searchGameCardObj.border_end_color : str7, (i10 & 128) != 0 ? searchGameCardObj.bottom_start_color : str8, (i10 & 256) != 0 ? searchGameCardObj.bottom_end_color : str9, (i10 & 512) != 0 ? searchGameCardObj.color : str10, (i10 & 1024) != 0 ? searchGameCardObj.movie : gameCardVideoMovieObj, (i10 & 2048) != 0 ? searchGameCardObj.game : gameObj);
    }

    @e
    public final String component1() {
        return this.img;
    }

    @e
    public final String component10() {
        return this.color;
    }

    @e
    public final GameCardVideoMovieObj component11() {
        return this.movie;
    }

    @e
    public final GameObj component12() {
        return this.game;
    }

    @e
    public final String component2() {
        return this.tag;
    }

    @e
    public final String component3() {
        return this.tag_icon;
    }

    @e
    public final String component4() {
        return this.tag_start_color;
    }

    @e
    public final String component5() {
        return this.tag_end_color;
    }

    @e
    public final String component6() {
        return this.border_start_color;
    }

    @e
    public final String component7() {
        return this.border_end_color;
    }

    @e
    public final String component8() {
        return this.bottom_start_color;
    }

    @e
    public final String component9() {
        return this.bottom_end_color;
    }

    @d
    public final SearchGameCardObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e String str8, @e String str9, @e String str10, @e GameCardVideoMovieObj gameCardVideoMovieObj, @e GameObj gameObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6, str7, str8, str9, str10, gameCardVideoMovieObj, gameObj}, this, changeQuickRedirect, false, 15857, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, GameCardVideoMovieObj.class, GameObj.class}, SearchGameCardObj.class);
        return patchProxyResultProxy.isSupported ? (SearchGameCardObj) patchProxyResultProxy.result : new SearchGameCardObj(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, gameCardVideoMovieObj, gameObj);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15861, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchGameCardObj)) {
            return false;
        }
        SearchGameCardObj searchGameCardObj = (SearchGameCardObj) obj;
        return f0.g(this.img, searchGameCardObj.img) && f0.g(this.tag, searchGameCardObj.tag) && f0.g(this.tag_icon, searchGameCardObj.tag_icon) && f0.g(this.tag_start_color, searchGameCardObj.tag_start_color) && f0.g(this.tag_end_color, searchGameCardObj.tag_end_color) && f0.g(this.border_start_color, searchGameCardObj.border_start_color) && f0.g(this.border_end_color, searchGameCardObj.border_end_color) && f0.g(this.bottom_start_color, searchGameCardObj.bottom_start_color) && f0.g(this.bottom_end_color, searchGameCardObj.bottom_end_color) && f0.g(this.color, searchGameCardObj.color) && f0.g(this.movie, searchGameCardObj.movie) && f0.g(this.game, searchGameCardObj.game);
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
    public final GameObj getGame() {
        return this.game;
    }

    @e
    public final String getImg() {
        return this.img;
    }

    @e
    public final GameCardVideoMovieObj getMovie() {
        return this.movie;
    }

    @e
    public final String getTag() {
        return this.tag;
    }

    @e
    public final String getTag_end_color() {
        return this.tag_end_color;
    }

    @e
    public final String getTag_icon() {
        return this.tag_icon;
    }

    @e
    public final String getTag_start_color() {
        return this.tag_start_color;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15860, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.img;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tag;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tag_icon;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.tag_start_color;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.tag_end_color;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.border_start_color;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.border_end_color;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.bottom_start_color;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.bottom_end_color;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.color;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        GameCardVideoMovieObj gameCardVideoMovieObj = this.movie;
        int iHashCode11 = (iHashCode10 + (gameCardVideoMovieObj == null ? 0 : gameCardVideoMovieObj.hashCode())) * 31;
        GameObj gameObj = this.game;
        return iHashCode11 + (gameObj != null ? gameObj.hashCode() : 0);
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

    public final void setGame(@e GameObj gameObj) {
        this.game = gameObj;
    }

    public final void setImg(@e String str) {
        this.img = str;
    }

    public final void setMovie(@e GameCardVideoMovieObj gameCardVideoMovieObj) {
        this.movie = gameCardVideoMovieObj;
    }

    public final void setTag(@e String str) {
        this.tag = str;
    }

    public final void setTag_end_color(@e String str) {
        this.tag_end_color = str;
    }

    public final void setTag_icon(@e String str) {
        this.tag_icon = str;
    }

    public final void setTag_start_color(@e String str) {
        this.tag_start_color = str;
    }

    @d
    public final GameCardVideoObj toGameCardVideoObj() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15856, new Class[0], GameCardVideoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameCardVideoObj) patchProxyResultProxy.result;
        }
        GameCardVideoObj gameCardVideoObj = new GameCardVideoObj();
        gameCardVideoObj.setImg(this.img);
        gameCardVideoObj.setTag(this.tag);
        gameCardVideoObj.setBorder_start_color(this.border_start_color);
        gameCardVideoObj.setBorder_end_color(this.border_end_color);
        gameCardVideoObj.setBottom_start_color(this.bottom_start_color);
        gameCardVideoObj.setBottom_end_color(this.bottom_end_color);
        gameCardVideoObj.setColor(this.color);
        gameCardVideoObj.setMovie(this.movie);
        gameCardVideoObj.setGame(r1.s(this.game));
        return gameCardVideoObj;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15859, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "SearchGameCardObj(img=" + this.img + ", tag=" + this.tag + ", tag_icon=" + this.tag_icon + ", tag_start_color=" + this.tag_start_color + ", tag_end_color=" + this.tag_end_color + ", border_start_color=" + this.border_start_color + ", border_end_color=" + this.border_end_color + ", bottom_start_color=" + this.bottom_start_color + ", bottom_end_color=" + this.bottom_end_color + ", color=" + this.color + ", movie=" + this.movie + ", game=" + this.game + ')';
    }
}
