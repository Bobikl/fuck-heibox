package com.max.xiaoheihe.bean.account;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: UserProfileResultObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class UserProfileResultObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private AccountDetailObj account_detail;

    @e
    private String events_alert_at;

    @e
    private ProfileBannerObj profile_banner;

    @e
    private UserShareInfoObj share_info;

    public UserProfileResultObj(@e AccountDetailObj accountDetailObj, @e ProfileBannerObj profileBannerObj, @e UserShareInfoObj userShareInfoObj, @e String str) {
        this.account_detail = accountDetailObj;
        this.profile_banner = profileBannerObj;
        this.share_info = userShareInfoObj;
        this.events_alert_at = str;
    }

    public static /* synthetic */ UserProfileResultObj copy$default(UserProfileResultObj userProfileResultObj, AccountDetailObj accountDetailObj, ProfileBannerObj profileBannerObj, UserShareInfoObj userShareInfoObj, String str, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{userProfileResultObj, accountDetailObj, profileBannerObj, userShareInfoObj, str, new Integer(i10), obj}, null, changeQuickRedirect, true, 14026, new Class[]{UserProfileResultObj.class, AccountDetailObj.class, ProfileBannerObj.class, UserShareInfoObj.class, String.class, Integer.TYPE, Object.class}, UserProfileResultObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (UserProfileResultObj) patchProxyResultProxy.result;
        }
        return userProfileResultObj.copy((i10 & 1) != 0 ? userProfileResultObj.account_detail : accountDetailObj, (i10 & 2) != 0 ? userProfileResultObj.profile_banner : profileBannerObj, (i10 & 4) != 0 ? userProfileResultObj.share_info : userShareInfoObj, (i10 & 8) != 0 ? userProfileResultObj.events_alert_at : str);
    }

    @e
    public final AccountDetailObj component1() {
        return this.account_detail;
    }

    @e
    public final ProfileBannerObj component2() {
        return this.profile_banner;
    }

    @e
    public final UserShareInfoObj component3() {
        return this.share_info;
    }

    @e
    public final String component4() {
        return this.events_alert_at;
    }

    @d
    public final UserProfileResultObj copy(@e AccountDetailObj accountDetailObj, @e ProfileBannerObj profileBannerObj, @e UserShareInfoObj userShareInfoObj, @e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{accountDetailObj, profileBannerObj, userShareInfoObj, str}, this, changeQuickRedirect, false, 14025, new Class[]{AccountDetailObj.class, ProfileBannerObj.class, UserShareInfoObj.class, String.class}, UserProfileResultObj.class);
        return patchProxyResultProxy.isSupported ? (UserProfileResultObj) patchProxyResultProxy.result : new UserProfileResultObj(accountDetailObj, profileBannerObj, userShareInfoObj, str);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14029, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserProfileResultObj)) {
            return false;
        }
        UserProfileResultObj userProfileResultObj = (UserProfileResultObj) obj;
        return f0.g(this.account_detail, userProfileResultObj.account_detail) && f0.g(this.profile_banner, userProfileResultObj.profile_banner) && f0.g(this.share_info, userProfileResultObj.share_info) && f0.g(this.events_alert_at, userProfileResultObj.events_alert_at);
    }

    @e
    public final AccountDetailObj getAccount_detail() {
        return this.account_detail;
    }

    @e
    public final String getEvents_alert_at() {
        return this.events_alert_at;
    }

    @e
    public final ProfileBannerObj getProfile_banner() {
        return this.profile_banner;
    }

    @e
    public final UserShareInfoObj getShare_info() {
        return this.share_info;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14028, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        AccountDetailObj accountDetailObj = this.account_detail;
        int iHashCode = (accountDetailObj == null ? 0 : accountDetailObj.hashCode()) * 31;
        ProfileBannerObj profileBannerObj = this.profile_banner;
        int iHashCode2 = (iHashCode + (profileBannerObj == null ? 0 : profileBannerObj.hashCode())) * 31;
        UserShareInfoObj userShareInfoObj = this.share_info;
        int iHashCode3 = (iHashCode2 + (userShareInfoObj == null ? 0 : userShareInfoObj.hashCode())) * 31;
        String str = this.events_alert_at;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final void setAccount_detail(@e AccountDetailObj accountDetailObj) {
        this.account_detail = accountDetailObj;
    }

    public final void setEvents_alert_at(@e String str) {
        this.events_alert_at = str;
    }

    public final void setProfile_banner(@e ProfileBannerObj profileBannerObj) {
        this.profile_banner = profileBannerObj;
    }

    public final void setShare_info(@e UserShareInfoObj userShareInfoObj) {
        this.share_info = userShareInfoObj;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14027, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "UserProfileResultObj(account_detail=" + this.account_detail + ", profile_banner=" + this.profile_banner + ", share_info=" + this.share_info + ", events_alert_at=" + this.events_alert_at + ')';
    }
}
