package com.max.xiaoheihe.bean.game.gameoverview;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameOverviewHeroObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class GameOverviewHeroObj extends BaseGameOverviewObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String color;

    @e
    private String hero_id;

    @e
    private String hero_image;

    @e
    private HeroMmrObj hero_mmr;

    @e
    private KDAObj kda;

    @e
    private String match_num;

    @e
    private String win_rate;

    public GameOverviewHeroObj(@e String str, @e String str2, @e String str3, @e String str4, @e KDAObj kDAObj, @e HeroMmrObj heroMmrObj, @e String str5) {
        this.hero_image = str;
        this.win_rate = str2;
        this.match_num = str3;
        this.color = str4;
        this.kda = kDAObj;
        this.hero_mmr = heroMmrObj;
        this.hero_id = str5;
    }

    public static /* synthetic */ GameOverviewHeroObj copy$default(GameOverviewHeroObj gameOverviewHeroObj, String str, String str2, String str3, String str4, KDAObj kDAObj, HeroMmrObj heroMmrObj, String str5, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameOverviewHeroObj, str, str2, str3, str4, kDAObj, heroMmrObj, str5, new Integer(i10), obj}, null, changeQuickRedirect, true, 15230, new Class[]{GameOverviewHeroObj.class, String.class, String.class, String.class, String.class, KDAObj.class, HeroMmrObj.class, String.class, Integer.TYPE, Object.class}, GameOverviewHeroObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameOverviewHeroObj) patchProxyResultProxy.result;
        }
        return gameOverviewHeroObj.copy((i10 & 1) != 0 ? gameOverviewHeroObj.hero_image : str, (i10 & 2) != 0 ? gameOverviewHeroObj.win_rate : str2, (i10 & 4) != 0 ? gameOverviewHeroObj.match_num : str3, (i10 & 8) != 0 ? gameOverviewHeroObj.color : str4, (i10 & 16) != 0 ? gameOverviewHeroObj.kda : kDAObj, (i10 & 32) != 0 ? gameOverviewHeroObj.hero_mmr : heroMmrObj, (i10 & 64) != 0 ? gameOverviewHeroObj.hero_id : str5);
    }

    @e
    public final String component1() {
        return this.hero_image;
    }

    @e
    public final String component2() {
        return this.win_rate;
    }

    @e
    public final String component3() {
        return this.match_num;
    }

    @e
    public final String component4() {
        return this.color;
    }

    @e
    public final KDAObj component5() {
        return this.kda;
    }

    @e
    public final HeroMmrObj component6() {
        return this.hero_mmr;
    }

    @e
    public final String component7() {
        return this.hero_id;
    }

    @d
    public final GameOverviewHeroObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e KDAObj kDAObj, @e HeroMmrObj heroMmrObj, @e String str5) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, kDAObj, heroMmrObj, str5}, this, changeQuickRedirect, false, 15229, new Class[]{String.class, String.class, String.class, String.class, KDAObj.class, HeroMmrObj.class, String.class}, GameOverviewHeroObj.class);
        return patchProxyResultProxy.isSupported ? (GameOverviewHeroObj) patchProxyResultProxy.result : new GameOverviewHeroObj(str, str2, str3, str4, kDAObj, heroMmrObj, str5);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15233, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameOverviewHeroObj)) {
            return false;
        }
        GameOverviewHeroObj gameOverviewHeroObj = (GameOverviewHeroObj) obj;
        return f0.g(this.hero_image, gameOverviewHeroObj.hero_image) && f0.g(this.win_rate, gameOverviewHeroObj.win_rate) && f0.g(this.match_num, gameOverviewHeroObj.match_num) && f0.g(this.color, gameOverviewHeroObj.color) && f0.g(this.kda, gameOverviewHeroObj.kda) && f0.g(this.hero_mmr, gameOverviewHeroObj.hero_mmr) && f0.g(this.hero_id, gameOverviewHeroObj.hero_id);
    }

    @e
    public final String getColor() {
        return this.color;
    }

    @e
    public final String getHero_id() {
        return this.hero_id;
    }

    @e
    public final String getHero_image() {
        return this.hero_image;
    }

    @e
    public final HeroMmrObj getHero_mmr() {
        return this.hero_mmr;
    }

    @e
    public final KDAObj getKda() {
        return this.kda;
    }

    @e
    public final String getMatch_num() {
        return this.match_num;
    }

    @e
    public final String getWin_rate() {
        return this.win_rate;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15232, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.hero_image;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.win_rate;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.match_num;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.color;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        KDAObj kDAObj = this.kda;
        int iHashCode5 = (iHashCode4 + (kDAObj == null ? 0 : kDAObj.hashCode())) * 31;
        HeroMmrObj heroMmrObj = this.hero_mmr;
        int iHashCode6 = (iHashCode5 + (heroMmrObj == null ? 0 : heroMmrObj.hashCode())) * 31;
        String str5 = this.hero_id;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public final void setColor(@e String str) {
        this.color = str;
    }

    public final void setHero_id(@e String str) {
        this.hero_id = str;
    }

    public final void setHero_image(@e String str) {
        this.hero_image = str;
    }

    public final void setHero_mmr(@e HeroMmrObj heroMmrObj) {
        this.hero_mmr = heroMmrObj;
    }

    public final void setKda(@e KDAObj kDAObj) {
        this.kda = kDAObj;
    }

    public final void setMatch_num(@e String str) {
        this.match_num = str;
    }

    public final void setWin_rate(@e String str) {
        this.win_rate = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15231, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "GameOverviewHeroObj(hero_image=" + this.hero_image + ", win_rate=" + this.win_rate + ", match_num=" + this.match_num + ", color=" + this.color + ", kda=" + this.kda + ", hero_mmr=" + this.hero_mmr + ", hero_id=" + this.hero_id + ')';
    }
}
