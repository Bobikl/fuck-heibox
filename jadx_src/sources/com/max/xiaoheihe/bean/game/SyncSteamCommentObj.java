package com.max.xiaoheihe.bean.game;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SyncSteamCommentObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class SyncSteamCommentObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String app_id;

    @e
    private String comment;

    @e
    private String comment_link_id;

    @e
    private String from;

    @e
    private String score;

    @e
    private String sync_steam_protocol;

    public SyncSteamCommentObj(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6) {
        this.app_id = str;
        this.comment = str2;
        this.score = str3;
        this.sync_steam_protocol = str4;
        this.comment_link_id = str5;
        this.from = str6;
    }

    public static /* synthetic */ SyncSteamCommentObj copy$default(SyncSteamCommentObj syncSteamCommentObj, String str, String str2, String str3, String str4, String str5, String str6, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{syncSteamCommentObj, str, str2, str3, str4, str5, str6, new Integer(i10), obj}, null, changeQuickRedirect, true, 15009, new Class[]{SyncSteamCommentObj.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, SyncSteamCommentObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (SyncSteamCommentObj) patchProxyResultProxy.result;
        }
        return syncSteamCommentObj.copy((i10 & 1) != 0 ? syncSteamCommentObj.app_id : str, (i10 & 2) != 0 ? syncSteamCommentObj.comment : str2, (i10 & 4) != 0 ? syncSteamCommentObj.score : str3, (i10 & 8) != 0 ? syncSteamCommentObj.sync_steam_protocol : str4, (i10 & 16) != 0 ? syncSteamCommentObj.comment_link_id : str5, (i10 & 32) != 0 ? syncSteamCommentObj.from : str6);
    }

    @e
    public final String component1() {
        return this.app_id;
    }

    @e
    public final String component2() {
        return this.comment;
    }

    @e
    public final String component3() {
        return this.score;
    }

    @e
    public final String component4() {
        return this.sync_steam_protocol;
    }

    @e
    public final String component5() {
        return this.comment_link_id;
    }

    @e
    public final String component6() {
        return this.from;
    }

    @d
    public final SyncSteamCommentObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6}, this, changeQuickRedirect, false, 15008, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class}, SyncSteamCommentObj.class);
        return patchProxyResultProxy.isSupported ? (SyncSteamCommentObj) patchProxyResultProxy.result : new SyncSteamCommentObj(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15012, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SyncSteamCommentObj)) {
            return false;
        }
        SyncSteamCommentObj syncSteamCommentObj = (SyncSteamCommentObj) obj;
        return f0.g(this.app_id, syncSteamCommentObj.app_id) && f0.g(this.comment, syncSteamCommentObj.comment) && f0.g(this.score, syncSteamCommentObj.score) && f0.g(this.sync_steam_protocol, syncSteamCommentObj.sync_steam_protocol) && f0.g(this.comment_link_id, syncSteamCommentObj.comment_link_id) && f0.g(this.from, syncSteamCommentObj.from);
    }

    @e
    public final String getApp_id() {
        return this.app_id;
    }

    @e
    public final String getComment() {
        return this.comment;
    }

    @e
    public final String getComment_link_id() {
        return this.comment_link_id;
    }

    @e
    public final String getFrom() {
        return this.from;
    }

    @e
    public final String getScore() {
        return this.score;
    }

    @e
    public final String getSync_steam_protocol() {
        return this.sync_steam_protocol;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15011, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.app_id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.comment;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.score;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.sync_steam_protocol;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.comment_link_id;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.from;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final void setApp_id(@e String str) {
        this.app_id = str;
    }

    public final void setComment(@e String str) {
        this.comment = str;
    }

    public final void setComment_link_id(@e String str) {
        this.comment_link_id = str;
    }

    public final void setFrom(@e String str) {
        this.from = str;
    }

    public final void setScore(@e String str) {
        this.score = str;
    }

    public final void setSync_steam_protocol(@e String str) {
        this.sync_steam_protocol = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15010, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "SyncSteamCommentObj(app_id=" + this.app_id + ", comment=" + this.comment + ", score=" + this.score + ", sync_steam_protocol=" + this.sync_steam_protocol + ", comment_link_id=" + this.comment_link_id + ", from=" + this.from + ')';
    }
}
