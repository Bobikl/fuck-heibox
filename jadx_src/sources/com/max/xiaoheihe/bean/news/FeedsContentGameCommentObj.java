package com.max.xiaoheihe.bean.news;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FeedsContentGameCommentObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class FeedsContentGameCommentObj extends FeedsContentBaseObj {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<GameObj> games;

    @e
    private BBSLinkObj link;

    @e
    private String timestamp;

    @e
    private BBSUserInfoObj user;

    public FeedsContentGameCommentObj(@e BBSLinkObj bBSLinkObj, @e List<GameObj> list, @e BBSUserInfoObj bBSUserInfoObj, @e String str) {
        this.link = bBSLinkObj;
        this.games = list;
        this.user = bBSUserInfoObj;
        this.timestamp = str;
    }

    public static /* synthetic */ FeedsContentGameCommentObj copy$default(FeedsContentGameCommentObj feedsContentGameCommentObj, BBSLinkObj bBSLinkObj, List list, BBSUserInfoObj bBSUserInfoObj, String str, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{feedsContentGameCommentObj, bBSLinkObj, list, bBSUserInfoObj, str, new Integer(i10), obj}, null, changeQuickRedirect, true, 15742, new Class[]{FeedsContentGameCommentObj.class, BBSLinkObj.class, List.class, BBSUserInfoObj.class, String.class, Integer.TYPE, Object.class}, FeedsContentGameCommentObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (FeedsContentGameCommentObj) patchProxyResultProxy.result;
        }
        return feedsContentGameCommentObj.copy((i10 & 1) != 0 ? feedsContentGameCommentObj.link : bBSLinkObj, (i10 & 2) != 0 ? feedsContentGameCommentObj.games : list, (i10 & 4) != 0 ? feedsContentGameCommentObj.user : bBSUserInfoObj, (i10 & 8) != 0 ? feedsContentGameCommentObj.timestamp : str);
    }

    @e
    public final BBSLinkObj component1() {
        return this.link;
    }

    @e
    public final List<GameObj> component2() {
        return this.games;
    }

    @e
    public final BBSUserInfoObj component3() {
        return this.user;
    }

    @e
    public final String component4() {
        return this.timestamp;
    }

    @d
    public final FeedsContentGameCommentObj copy(@e BBSLinkObj bBSLinkObj, @e List<GameObj> list, @e BBSUserInfoObj bBSUserInfoObj, @e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bBSLinkObj, list, bBSUserInfoObj, str}, this, changeQuickRedirect, false, 15741, new Class[]{BBSLinkObj.class, List.class, BBSUserInfoObj.class, String.class}, FeedsContentGameCommentObj.class);
        return patchProxyResultProxy.isSupported ? (FeedsContentGameCommentObj) patchProxyResultProxy.result : new FeedsContentGameCommentObj(bBSLinkObj, list, bBSUserInfoObj, str);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15740, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (!(obj instanceof FeedsContentGameCommentObj)) {
            return false;
        }
        BBSLinkObj bBSLinkObj = this.link;
        String linkid = bBSLinkObj != null ? bBSLinkObj.getLinkid() : null;
        BBSLinkObj bBSLinkObj2 = ((FeedsContentGameCommentObj) obj).link;
        return f0.g(linkid, bBSLinkObj2 != null ? bBSLinkObj2.getLinkid() : null);
    }

    @e
    public final List<GameObj> getGames() {
        return this.games;
    }

    @e
    public final BBSLinkObj getLink() {
        return this.link;
    }

    @e
    public final String getTimestamp() {
        return this.timestamp;
    }

    @e
    public final BBSUserInfoObj getUser() {
        return this.user;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15744, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        BBSLinkObj bBSLinkObj = this.link;
        int iHashCode = (bBSLinkObj == null ? 0 : bBSLinkObj.hashCode()) * 31;
        List<GameObj> list = this.games;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        BBSUserInfoObj bBSUserInfoObj = this.user;
        int iHashCode3 = (iHashCode2 + (bBSUserInfoObj == null ? 0 : bBSUserInfoObj.hashCode())) * 31;
        String str = this.timestamp;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final void setGames(@e List<GameObj> list) {
        this.games = list;
    }

    public final void setLink(@e BBSLinkObj bBSLinkObj) {
        this.link = bBSLinkObj;
    }

    public final void setTimestamp(@e String str) {
        this.timestamp = str;
    }

    public final void setUser(@e BBSUserInfoObj bBSUserInfoObj) {
        this.user = bBSUserInfoObj;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15743, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "FeedsContentGameCommentObj(link=" + this.link + ", games=" + this.games + ", user=" + this.user + ", timestamp=" + this.timestamp + ')';
    }
}
