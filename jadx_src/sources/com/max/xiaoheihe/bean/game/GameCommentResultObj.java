package com.max.xiaoheihe.bean.game;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.bbs.LinkInfoObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameCommentResultObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class GameCommentResultObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String appicon;

    @e
    private String comment_change;

    @e
    private String comment_state;
    private boolean exists;

    @e
    private String follow_state;

    @e
    private String image;

    @e
    private String impression_score;

    @e
    private LinkInfoObj link;

    @e
    private HashMap<String, PostMultiDimensionObj> multidimensional_score;

    @e
    private String name;

    public GameCommentResultObj(@e LinkInfoObj linkInfoObj, boolean z10, @e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e HashMap<String, PostMultiDimensionObj> map) {
        this.link = linkInfoObj;
        this.exists = z10;
        this.comment_change = str;
        this.comment_state = str2;
        this.impression_score = str3;
        this.name = str4;
        this.image = str5;
        this.appicon = str6;
        this.follow_state = str7;
        this.multidimensional_score = map;
    }

    public static /* synthetic */ GameCommentResultObj copy$default(GameCommentResultObj gameCommentResultObj, LinkInfoObj linkInfoObj, boolean z10, String str, String str2, String str3, String str4, String str5, String str6, String str7, HashMap map, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameCommentResultObj, linkInfoObj, new Byte(z10 ? (byte) 1 : (byte) 0), str, str2, str3, str4, str5, str6, str7, map, new Integer(i10), obj}, null, changeQuickRedirect, true, 14702, new Class[]{GameCommentResultObj.class, LinkInfoObj.class, Boolean.TYPE, String.class, String.class, String.class, String.class, String.class, String.class, String.class, HashMap.class, Integer.TYPE, Object.class}, GameCommentResultObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameCommentResultObj) patchProxyResultProxy.result;
        }
        return gameCommentResultObj.copy((i10 & 1) != 0 ? gameCommentResultObj.link : linkInfoObj, (i10 & 2) != 0 ? gameCommentResultObj.exists : z10 ? 1 : 0, (i10 & 4) != 0 ? gameCommentResultObj.comment_change : str, (i10 & 8) != 0 ? gameCommentResultObj.comment_state : str2, (i10 & 16) != 0 ? gameCommentResultObj.impression_score : str3, (i10 & 32) != 0 ? gameCommentResultObj.name : str4, (i10 & 64) != 0 ? gameCommentResultObj.image : str5, (i10 & 128) != 0 ? gameCommentResultObj.appicon : str6, (i10 & 256) != 0 ? gameCommentResultObj.follow_state : str7, (i10 & 512) != 0 ? gameCommentResultObj.multidimensional_score : map);
    }

    @e
    public final LinkInfoObj component1() {
        return this.link;
    }

    @e
    public final HashMap<String, PostMultiDimensionObj> component10() {
        return this.multidimensional_score;
    }

    public final boolean component2() {
        return this.exists;
    }

    @e
    public final String component3() {
        return this.comment_change;
    }

    @e
    public final String component4() {
        return this.comment_state;
    }

    @e
    public final String component5() {
        return this.impression_score;
    }

    @e
    public final String component6() {
        return this.name;
    }

    @e
    public final String component7() {
        return this.image;
    }

    @e
    public final String component8() {
        return this.appicon;
    }

    @e
    public final String component9() {
        return this.follow_state;
    }

    @d
    public final GameCommentResultObj copy(@e LinkInfoObj linkInfoObj, boolean z10, @e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e HashMap<String, PostMultiDimensionObj> map) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{linkInfoObj, new Byte(z10 ? (byte) 1 : (byte) 0), str, str2, str3, str4, str5, str6, str7, map}, this, changeQuickRedirect, false, 14701, new Class[]{LinkInfoObj.class, Boolean.TYPE, String.class, String.class, String.class, String.class, String.class, String.class, String.class, HashMap.class}, GameCommentResultObj.class);
        return patchProxyResultProxy.isSupported ? (GameCommentResultObj) patchProxyResultProxy.result : new GameCommentResultObj(linkInfoObj, z10, str, str2, str3, str4, str5, str6, str7, map);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14705, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameCommentResultObj)) {
            return false;
        }
        GameCommentResultObj gameCommentResultObj = (GameCommentResultObj) obj;
        return f0.g(this.link, gameCommentResultObj.link) && this.exists == gameCommentResultObj.exists && f0.g(this.comment_change, gameCommentResultObj.comment_change) && f0.g(this.comment_state, gameCommentResultObj.comment_state) && f0.g(this.impression_score, gameCommentResultObj.impression_score) && f0.g(this.name, gameCommentResultObj.name) && f0.g(this.image, gameCommentResultObj.image) && f0.g(this.appicon, gameCommentResultObj.appicon) && f0.g(this.follow_state, gameCommentResultObj.follow_state) && f0.g(this.multidimensional_score, gameCommentResultObj.multidimensional_score);
    }

    @e
    public final String getAppicon() {
        return this.appicon;
    }

    @e
    public final String getComment_change() {
        return this.comment_change;
    }

    @e
    public final String getComment_state() {
        return this.comment_state;
    }

    public final boolean getExists() {
        return this.exists;
    }

    @e
    public final String getFollow_state() {
        return this.follow_state;
    }

    @e
    public final String getImage() {
        return this.image;
    }

    @e
    public final String getImpression_score() {
        return this.impression_score;
    }

    @e
    public final LinkInfoObj getLink() {
        return this.link;
    }

    @e
    public final HashMap<String, PostMultiDimensionObj> getMultidimensional_score() {
        return this.multidimensional_score;
    }

    @e
    public final String getName() {
        return this.name;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14704, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        LinkInfoObj linkInfoObj = this.link;
        int iHashCode = (linkInfoObj == null ? 0 : linkInfoObj.hashCode()) * 31;
        boolean z10 = this.exists;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = (iHashCode + r10) * 31;
        String str = this.comment_change;
        int iHashCode2 = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.comment_state;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.impression_score;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.name;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.image;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.appicon;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.follow_state;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        HashMap<String, PostMultiDimensionObj> map = this.multidimensional_score;
        return iHashCode8 + (map != null ? map.hashCode() : 0);
    }

    public final void setAppicon(@e String str) {
        this.appicon = str;
    }

    public final void setComment_change(@e String str) {
        this.comment_change = str;
    }

    public final void setComment_state(@e String str) {
        this.comment_state = str;
    }

    public final void setExists(boolean z10) {
        this.exists = z10;
    }

    public final void setFollow_state(@e String str) {
        this.follow_state = str;
    }

    public final void setImage(@e String str) {
        this.image = str;
    }

    public final void setImpression_score(@e String str) {
        this.impression_score = str;
    }

    public final void setLink(@e LinkInfoObj linkInfoObj) {
        this.link = linkInfoObj;
    }

    public final void setMultidimensional_score(@e HashMap<String, PostMultiDimensionObj> map) {
        this.multidimensional_score = map;
    }

    public final void setName(@e String str) {
        this.name = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14703, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "GameCommentResultObj(link=" + this.link + ", exists=" + this.exists + ", comment_change=" + this.comment_change + ", comment_state=" + this.comment_state + ", impression_score=" + this.impression_score + ", name=" + this.name + ", image=" + this.image + ", appicon=" + this.appicon + ", follow_state=" + this.follow_state + ", multidimensional_score=" + this.multidimensional_score + ')';
    }
}
