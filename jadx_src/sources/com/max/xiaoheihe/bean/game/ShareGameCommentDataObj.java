package com.max.xiaoheihe.bean.game;

import androidx.compose.runtime.internal.o;
import com.max.hbcommon.bean.question.OptionObj;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.bean.bbs.GameCommentsObj;
import com.max.xiaoheihe.bean.bbs.LinkInfoObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ShareGameCommentDataObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class ShareGameCommentDataObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String can_sync_steam;

    @e
    private LinkInfoObj comment_detail;

    @e
    private List<OptionObj> game_impression_list;

    @e
    private GameObj game_info;

    @e
    private GameCommentsObj share_info;

    @e
    private String sync_steam_protocol;

    @e
    private BBSTopicObj topic_info;

    @e
    private BBSUserInfoObj user;

    @e
    private String user_comment_score;

    public ShareGameCommentDataObj(@e GameCommentsObj gameCommentsObj, @e BBSTopicObj bBSTopicObj, @e GameObj gameObj, @e LinkInfoObj linkInfoObj, @e List<OptionObj> list, @e BBSUserInfoObj bBSUserInfoObj, @e String str, @e String str2, @e String str3) {
        this.share_info = gameCommentsObj;
        this.topic_info = bBSTopicObj;
        this.game_info = gameObj;
        this.comment_detail = linkInfoObj;
        this.game_impression_list = list;
        this.user = bBSUserInfoObj;
        this.user_comment_score = str;
        this.can_sync_steam = str2;
        this.sync_steam_protocol = str3;
    }

    public static /* synthetic */ ShareGameCommentDataObj copy$default(ShareGameCommentDataObj shareGameCommentDataObj, GameCommentsObj gameCommentsObj, BBSTopicObj bBSTopicObj, GameObj gameObj, LinkInfoObj linkInfoObj, List list, BBSUserInfoObj bBSUserInfoObj, String str, String str2, String str3, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{shareGameCommentDataObj, gameCommentsObj, bBSTopicObj, gameObj, linkInfoObj, list, bBSUserInfoObj, str, str2, str3, new Integer(i10), obj}, null, changeQuickRedirect, true, 14999, new Class[]{ShareGameCommentDataObj.class, GameCommentsObj.class, BBSTopicObj.class, GameObj.class, LinkInfoObj.class, List.class, BBSUserInfoObj.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, ShareGameCommentDataObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (ShareGameCommentDataObj) patchProxyResultProxy.result;
        }
        return shareGameCommentDataObj.copy((i10 & 1) != 0 ? shareGameCommentDataObj.share_info : gameCommentsObj, (i10 & 2) != 0 ? shareGameCommentDataObj.topic_info : bBSTopicObj, (i10 & 4) != 0 ? shareGameCommentDataObj.game_info : gameObj, (i10 & 8) != 0 ? shareGameCommentDataObj.comment_detail : linkInfoObj, (i10 & 16) != 0 ? shareGameCommentDataObj.game_impression_list : list, (i10 & 32) != 0 ? shareGameCommentDataObj.user : bBSUserInfoObj, (i10 & 64) != 0 ? shareGameCommentDataObj.user_comment_score : str, (i10 & 128) != 0 ? shareGameCommentDataObj.can_sync_steam : str2, (i10 & 256) != 0 ? shareGameCommentDataObj.sync_steam_protocol : str3);
    }

    @e
    public final GameCommentsObj component1() {
        return this.share_info;
    }

    @e
    public final BBSTopicObj component2() {
        return this.topic_info;
    }

    @e
    public final GameObj component3() {
        return this.game_info;
    }

    @e
    public final LinkInfoObj component4() {
        return this.comment_detail;
    }

    @e
    public final List<OptionObj> component5() {
        return this.game_impression_list;
    }

    @e
    public final BBSUserInfoObj component6() {
        return this.user;
    }

    @e
    public final String component7() {
        return this.user_comment_score;
    }

    @e
    public final String component8() {
        return this.can_sync_steam;
    }

    @e
    public final String component9() {
        return this.sync_steam_protocol;
    }

    @d
    public final ShareGameCommentDataObj copy(@e GameCommentsObj gameCommentsObj, @e BBSTopicObj bBSTopicObj, @e GameObj gameObj, @e LinkInfoObj linkInfoObj, @e List<OptionObj> list, @e BBSUserInfoObj bBSUserInfoObj, @e String str, @e String str2, @e String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameCommentsObj, bBSTopicObj, gameObj, linkInfoObj, list, bBSUserInfoObj, str, str2, str3}, this, changeQuickRedirect, false, 14998, new Class[]{GameCommentsObj.class, BBSTopicObj.class, GameObj.class, LinkInfoObj.class, List.class, BBSUserInfoObj.class, String.class, String.class, String.class}, ShareGameCommentDataObj.class);
        return patchProxyResultProxy.isSupported ? (ShareGameCommentDataObj) patchProxyResultProxy.result : new ShareGameCommentDataObj(gameCommentsObj, bBSTopicObj, gameObj, linkInfoObj, list, bBSUserInfoObj, str, str2, str3);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15002, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareGameCommentDataObj)) {
            return false;
        }
        ShareGameCommentDataObj shareGameCommentDataObj = (ShareGameCommentDataObj) obj;
        return f0.g(this.share_info, shareGameCommentDataObj.share_info) && f0.g(this.topic_info, shareGameCommentDataObj.topic_info) && f0.g(this.game_info, shareGameCommentDataObj.game_info) && f0.g(this.comment_detail, shareGameCommentDataObj.comment_detail) && f0.g(this.game_impression_list, shareGameCommentDataObj.game_impression_list) && f0.g(this.user, shareGameCommentDataObj.user) && f0.g(this.user_comment_score, shareGameCommentDataObj.user_comment_score) && f0.g(this.can_sync_steam, shareGameCommentDataObj.can_sync_steam) && f0.g(this.sync_steam_protocol, shareGameCommentDataObj.sync_steam_protocol);
    }

    @e
    public final String getCan_sync_steam() {
        return this.can_sync_steam;
    }

    @e
    public final LinkInfoObj getComment_detail() {
        return this.comment_detail;
    }

    @e
    public final List<OptionObj> getGame_impression_list() {
        return this.game_impression_list;
    }

    @e
    public final GameObj getGame_info() {
        return this.game_info;
    }

    @e
    public final GameCommentsObj getShare_info() {
        return this.share_info;
    }

    @e
    public final String getSync_steam_protocol() {
        return this.sync_steam_protocol;
    }

    @e
    public final BBSTopicObj getTopic_info() {
        return this.topic_info;
    }

    @e
    public final BBSUserInfoObj getUser() {
        return this.user;
    }

    @e
    public final String getUser_comment_score() {
        return this.user_comment_score;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15001, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        GameCommentsObj gameCommentsObj = this.share_info;
        int iHashCode = (gameCommentsObj == null ? 0 : gameCommentsObj.hashCode()) * 31;
        BBSTopicObj bBSTopicObj = this.topic_info;
        int iHashCode2 = (iHashCode + (bBSTopicObj == null ? 0 : bBSTopicObj.hashCode())) * 31;
        GameObj gameObj = this.game_info;
        int iHashCode3 = (iHashCode2 + (gameObj == null ? 0 : gameObj.hashCode())) * 31;
        LinkInfoObj linkInfoObj = this.comment_detail;
        int iHashCode4 = (iHashCode3 + (linkInfoObj == null ? 0 : linkInfoObj.hashCode())) * 31;
        List<OptionObj> list = this.game_impression_list;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        BBSUserInfoObj bBSUserInfoObj = this.user;
        int iHashCode6 = (iHashCode5 + (bBSUserInfoObj == null ? 0 : bBSUserInfoObj.hashCode())) * 31;
        String str = this.user_comment_score;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.can_sync_steam;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sync_steam_protocol;
        return iHashCode8 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setCan_sync_steam(@e String str) {
        this.can_sync_steam = str;
    }

    public final void setComment_detail(@e LinkInfoObj linkInfoObj) {
        this.comment_detail = linkInfoObj;
    }

    public final void setGame_impression_list(@e List<OptionObj> list) {
        this.game_impression_list = list;
    }

    public final void setGame_info(@e GameObj gameObj) {
        this.game_info = gameObj;
    }

    public final void setShare_info(@e GameCommentsObj gameCommentsObj) {
        this.share_info = gameCommentsObj;
    }

    public final void setSync_steam_protocol(@e String str) {
        this.sync_steam_protocol = str;
    }

    public final void setTopic_info(@e BBSTopicObj bBSTopicObj) {
        this.topic_info = bBSTopicObj;
    }

    public final void setUser(@e BBSUserInfoObj bBSUserInfoObj) {
        this.user = bBSUserInfoObj;
    }

    public final void setUser_comment_score(@e String str) {
        this.user_comment_score = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15000, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ShareGameCommentDataObj(share_info=" + this.share_info + ", topic_info=" + this.topic_info + ", game_info=" + this.game_info + ", comment_detail=" + this.comment_detail + ", game_impression_list=" + this.game_impression_list + ", user=" + this.user + ", user_comment_score=" + this.user_comment_score + ", can_sync_steam=" + this.can_sync_steam + ", sync_steam_protocol=" + this.sync_steam_protocol + ')';
    }
}
