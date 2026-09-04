package com.max.xiaoheihe.bean.game;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: UserSupportStateObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class UserSupportStateObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String is_down;

    @e
    private String is_happy;

    @e
    private String is_up;

    public UserSupportStateObj(@e String str, @e String str2, @e String str3) {
        this.is_down = str;
        this.is_happy = str2;
        this.is_up = str3;
    }

    public static /* synthetic */ UserSupportStateObj copy$default(UserSupportStateObj userSupportStateObj, String str, String str2, String str3, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{userSupportStateObj, str, str2, str3, new Integer(i10), obj}, null, changeQuickRedirect, true, 15019, new Class[]{UserSupportStateObj.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, UserSupportStateObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (UserSupportStateObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = userSupportStateObj.is_down;
        }
        if ((i10 & 2) != 0) {
            str2 = userSupportStateObj.is_happy;
        }
        if ((i10 & 4) != 0) {
            str3 = userSupportStateObj.is_up;
        }
        return userSupportStateObj.copy(str, str2, str3);
    }

    @e
    public final String component1() {
        return this.is_down;
    }

    @e
    public final String component2() {
        return this.is_happy;
    }

    @e
    public final String component3() {
        return this.is_up;
    }

    @d
    public final UserSupportStateObj copy(@e String str, @e String str2, @e String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, 15018, new Class[]{String.class, String.class, String.class}, UserSupportStateObj.class);
        return patchProxyResultProxy.isSupported ? (UserSupportStateObj) patchProxyResultProxy.result : new UserSupportStateObj(str, str2, str3);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15022, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserSupportStateObj)) {
            return false;
        }
        UserSupportStateObj userSupportStateObj = (UserSupportStateObj) obj;
        return f0.g(this.is_down, userSupportStateObj.is_down) && f0.g(this.is_happy, userSupportStateObj.is_happy) && f0.g(this.is_up, userSupportStateObj.is_up);
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15021, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.is_down;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.is_happy;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.is_up;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @e
    public final String is_down() {
        return this.is_down;
    }

    @e
    public final String is_happy() {
        return this.is_happy;
    }

    @e
    public final String is_up() {
        return this.is_up;
    }

    public final void set_down(@e String str) {
        this.is_down = str;
    }

    public final void set_happy(@e String str) {
        this.is_happy = str;
    }

    public final void set_up(@e String str) {
        this.is_up = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15020, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "UserSupportStateObj(is_down=" + this.is_down + ", is_happy=" + this.is_happy + ", is_up=" + this.is_up + ')';
    }
}
