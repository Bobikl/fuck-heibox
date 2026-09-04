package com.max.xiaoheihe.bean.account;

import androidx.compose.runtime.internal.o;
import bb.c;
import com.alibaba.fastjson.annotation.JSONField;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: HeyboxFriendListObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class HeyboxFriendListObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @SerializedName(alternate = {"friends", "heybox_friends", "users"}, value = "list")
    @e
    private List<UserFriendObj> list;

    /* JADX WARN: Multi-variable type inference failed */
    public HeyboxFriendListObj() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public HeyboxFriendListObj(@e @JSONField(alternateNames = {"friends", "heybox_friends", "users"}, name = "list") List<UserFriendObj> list) {
        this.list = list;
    }

    public /* synthetic */ HeyboxFriendListObj(List list, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : list);
    }

    public static /* synthetic */ HeyboxFriendListObj copy$default(HeyboxFriendListObj heyboxFriendListObj, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{heyboxFriendListObj, list, new Integer(i10), obj}, null, changeQuickRedirect, true, c.m.nP, new Class[]{HeyboxFriendListObj.class, List.class, Integer.TYPE, Object.class}, HeyboxFriendListObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (HeyboxFriendListObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = heyboxFriendListObj.list;
        }
        return heyboxFriendListObj.copy(list);
    }

    @e
    public final List<UserFriendObj> component1() {
        return this.list;
    }

    @d
    public final HeyboxFriendListObj copy(@e @JSONField(alternateNames = {"friends", "heybox_friends", "users"}, name = "list") List<UserFriendObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, c.m.mP, new Class[]{List.class}, HeyboxFriendListObj.class);
        return patchProxyResultProxy.isSupported ? (HeyboxFriendListObj) patchProxyResultProxy.result : new HeyboxFriendListObj(list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.m.qP, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof HeyboxFriendListObj) && f0.g(this.list, ((HeyboxFriendListObj) obj).list);
    }

    @e
    public final List<UserFriendObj> getList() {
        return this.list;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.pP, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<UserFriendObj> list = this.list;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setList(@e List<UserFriendObj> list) {
        this.list = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.oP, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "HeyboxFriendListObj(list=" + this.list + ')';
    }
}
