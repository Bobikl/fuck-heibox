package com.max.xiaoheihe.bean;

import androidx.compose.runtime.internal.o;
import bb.c;
import com.google.gson.JsonObject;
import com.max.hbcommon.bean.account.AvatarDecorationObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: NotifyMsgObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class NotifyMsgObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private JsonObject addition;

    @e
    private String avartar;

    @e
    private AvatarDecorationObj avatar_decoration;

    @e
    private String avatar_subscript;

    @e
    private String protocol;

    @e
    private String text;

    @e
    private String title;

    @e
    private String userid;

    public NotifyMsgObj(@e String str, @e String str2, @e String str3, @e AvatarDecorationObj avatarDecorationObj, @e String str4, @e String str5, @e String str6, @e JsonObject jsonObject) {
        this.title = str;
        this.text = str2;
        this.avartar = str3;
        this.avatar_decoration = avatarDecorationObj;
        this.avatar_subscript = str4;
        this.protocol = str5;
        this.userid = str6;
        this.addition = jsonObject;
    }

    public static /* synthetic */ NotifyMsgObj copy$default(NotifyMsgObj notifyMsgObj, String str, String str2, String str3, AvatarDecorationObj avatarDecorationObj, String str4, String str5, String str6, JsonObject jsonObject, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{notifyMsgObj, str, str2, str3, avatarDecorationObj, str4, str5, str6, jsonObject, new Integer(i10), obj}, null, changeQuickRedirect, true, c.m.CM, new Class[]{NotifyMsgObj.class, String.class, String.class, String.class, AvatarDecorationObj.class, String.class, String.class, String.class, JsonObject.class, Integer.TYPE, Object.class}, NotifyMsgObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (NotifyMsgObj) patchProxyResultProxy.result;
        }
        return notifyMsgObj.copy((i10 & 1) != 0 ? notifyMsgObj.title : str, (i10 & 2) != 0 ? notifyMsgObj.text : str2, (i10 & 4) != 0 ? notifyMsgObj.avartar : str3, (i10 & 8) != 0 ? notifyMsgObj.avatar_decoration : avatarDecorationObj, (i10 & 16) != 0 ? notifyMsgObj.avatar_subscript : str4, (i10 & 32) != 0 ? notifyMsgObj.protocol : str5, (i10 & 64) != 0 ? notifyMsgObj.userid : str6, (i10 & 128) != 0 ? notifyMsgObj.addition : jsonObject);
    }

    @e
    public final String component1() {
        return this.title;
    }

    @e
    public final String component2() {
        return this.text;
    }

    @e
    public final String component3() {
        return this.avartar;
    }

    @e
    public final AvatarDecorationObj component4() {
        return this.avatar_decoration;
    }

    @e
    public final String component5() {
        return this.avatar_subscript;
    }

    @e
    public final String component6() {
        return this.protocol;
    }

    @e
    public final String component7() {
        return this.userid;
    }

    @e
    public final JsonObject component8() {
        return this.addition;
    }

    @d
    public final NotifyMsgObj copy(@e String str, @e String str2, @e String str3, @e AvatarDecorationObj avatarDecorationObj, @e String str4, @e String str5, @e String str6, @e JsonObject jsonObject) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, avatarDecorationObj, str4, str5, str6, jsonObject}, this, changeQuickRedirect, false, c.m.BM, new Class[]{String.class, String.class, String.class, AvatarDecorationObj.class, String.class, String.class, String.class, JsonObject.class}, NotifyMsgObj.class);
        return patchProxyResultProxy.isSupported ? (NotifyMsgObj) patchProxyResultProxy.result : new NotifyMsgObj(str, str2, str3, avatarDecorationObj, str4, str5, str6, jsonObject);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.m.FM, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotifyMsgObj)) {
            return false;
        }
        NotifyMsgObj notifyMsgObj = (NotifyMsgObj) obj;
        return f0.g(this.title, notifyMsgObj.title) && f0.g(this.text, notifyMsgObj.text) && f0.g(this.avartar, notifyMsgObj.avartar) && f0.g(this.avatar_decoration, notifyMsgObj.avatar_decoration) && f0.g(this.avatar_subscript, notifyMsgObj.avatar_subscript) && f0.g(this.protocol, notifyMsgObj.protocol) && f0.g(this.userid, notifyMsgObj.userid) && f0.g(this.addition, notifyMsgObj.addition);
    }

    @e
    public final JsonObject getAddition() {
        return this.addition;
    }

    @e
    public final String getAvartar() {
        return this.avartar;
    }

    @e
    public final AvatarDecorationObj getAvatar_decoration() {
        return this.avatar_decoration;
    }

    @e
    public final String getAvatar_subscript() {
        return this.avatar_subscript;
    }

    @e
    public final String getProtocol() {
        return this.protocol;
    }

    @e
    public final String getText() {
        return this.text;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    @e
    public final String getUserid() {
        return this.userid;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.EM, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.text;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.avartar;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        AvatarDecorationObj avatarDecorationObj = this.avatar_decoration;
        int iHashCode4 = (iHashCode3 + (avatarDecorationObj == null ? 0 : avatarDecorationObj.hashCode())) * 31;
        String str4 = this.avatar_subscript;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.protocol;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.userid;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        JsonObject jsonObject = this.addition;
        return iHashCode7 + (jsonObject != null ? jsonObject.hashCode() : 0);
    }

    public final void setAddition(@e JsonObject jsonObject) {
        this.addition = jsonObject;
    }

    public final void setAvartar(@e String str) {
        this.avartar = str;
    }

    public final void setAvatar_decoration(@e AvatarDecorationObj avatarDecorationObj) {
        this.avatar_decoration = avatarDecorationObj;
    }

    public final void setAvatar_subscript(@e String str) {
        this.avatar_subscript = str;
    }

    public final void setProtocol(@e String str) {
        this.protocol = str;
    }

    public final void setText(@e String str) {
        this.text = str;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }

    public final void setUserid(@e String str) {
        this.userid = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.DM, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "NotifyMsgObj(title=" + this.title + ", text=" + this.text + ", avartar=" + this.avartar + ", avatar_decoration=" + this.avatar_decoration + ", avatar_subscript=" + this.avatar_subscript + ", protocol=" + this.protocol + ", userid=" + this.userid + ", addition=" + this.addition + ')';
    }
}
