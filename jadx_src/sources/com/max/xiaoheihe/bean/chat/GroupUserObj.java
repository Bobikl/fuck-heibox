package com.max.xiaoheihe.bean.chat;

import android.text.TextUtils;
import com.max.hbcommon.bean.account.AvatarDecorationObj;
import com.max.hbcommon.utils.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class GroupUserObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -1943461410853185263L;
    private String avartar;
    private AvatarDecorationObj avatar_decoration;
    private String can_remove;
    private String gameextrainfo;
    private String heybox_id;
    private int personastate;
    private String steam_id;
    private String userid;
    private String username;

    public boolean equals(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14603, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (obj == null || !(obj instanceof GroupUserObj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return !TextUtils.isEmpty(this.userid) && this.userid.equals(((GroupUserObj) obj).userid);
    }

    public String getAvartar() {
        return this.avartar;
    }

    public AvatarDecorationObj getAvatar_decoration() {
        return this.avatar_decoration;
    }

    public String getCan_remove() {
        return this.can_remove;
    }

    public String getGameextrainfo() {
        return this.gameextrainfo;
    }

    public String getHeybox_id() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14601, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return (!c.u(this.heybox_id) || c.u(this.userid)) ? this.heybox_id : this.userid;
    }

    public int getPersonastate() {
        return this.personastate;
    }

    public String getSteam_id() {
        return this.steam_id;
    }

    public String getUserid() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14602, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return (!c.u(this.userid) || c.u(this.heybox_id)) ? this.userid : this.heybox_id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setAvartar(String str) {
        this.avartar = str;
    }

    public void setAvatar_decoration(AvatarDecorationObj avatarDecorationObj) {
        this.avatar_decoration = avatarDecorationObj;
    }

    public void setCan_remove(String str) {
        this.can_remove = str;
    }

    public void setGameextrainfo(String str) {
        this.gameextrainfo = str;
    }

    public void setHeybox_id(String str) {
        this.heybox_id = str;
    }

    public void setPersonastate(int i10) {
        this.personastate = i10;
    }

    public void setSteam_id(String str) {
        this.steam_id = str;
    }

    public void setUserid(String str) {
        this.userid = str;
    }

    public void setUsername(String str) {
        this.username = str;
    }
}
