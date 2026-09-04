package com.max.xiaoheihe.bean.account;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SignAwardInfo.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class SignAwardInfo implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String award_img;

    @e
    private String award_name;

    @e
    private String award_tips;

    @e
    private String day;

    @e
    private String is_today;

    @e
    private String signed;

    public SignAwardInfo(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6) {
        this.award_tips = str;
        this.award_name = str2;
        this.award_img = str3;
        this.day = str4;
        this.signed = str5;
        this.is_today = str6;
    }

    public static /* synthetic */ SignAwardInfo copy$default(SignAwardInfo signAwardInfo, String str, String str2, String str3, String str4, String str5, String str6, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{signAwardInfo, str, str2, str3, str4, str5, str6, new Integer(i10), obj}, null, changeQuickRedirect, true, 13951, new Class[]{SignAwardInfo.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, SignAwardInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (SignAwardInfo) patchProxyResultProxy.result;
        }
        return signAwardInfo.copy((i10 & 1) != 0 ? signAwardInfo.award_tips : str, (i10 & 2) != 0 ? signAwardInfo.award_name : str2, (i10 & 4) != 0 ? signAwardInfo.award_img : str3, (i10 & 8) != 0 ? signAwardInfo.day : str4, (i10 & 16) != 0 ? signAwardInfo.signed : str5, (i10 & 32) != 0 ? signAwardInfo.is_today : str6);
    }

    @e
    public final String component1() {
        return this.award_tips;
    }

    @e
    public final String component2() {
        return this.award_name;
    }

    @e
    public final String component3() {
        return this.award_img;
    }

    @e
    public final String component4() {
        return this.day;
    }

    @e
    public final String component5() {
        return this.signed;
    }

    @e
    public final String component6() {
        return this.is_today;
    }

    @d
    public final SignAwardInfo copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6}, this, changeQuickRedirect, false, 13950, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class}, SignAwardInfo.class);
        return patchProxyResultProxy.isSupported ? (SignAwardInfo) patchProxyResultProxy.result : new SignAwardInfo(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 13954, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignAwardInfo)) {
            return false;
        }
        SignAwardInfo signAwardInfo = (SignAwardInfo) obj;
        return f0.g(this.award_tips, signAwardInfo.award_tips) && f0.g(this.award_name, signAwardInfo.award_name) && f0.g(this.award_img, signAwardInfo.award_img) && f0.g(this.day, signAwardInfo.day) && f0.g(this.signed, signAwardInfo.signed) && f0.g(this.is_today, signAwardInfo.is_today);
    }

    @e
    public final String getAward_img() {
        return this.award_img;
    }

    @e
    public final String getAward_name() {
        return this.award_name;
    }

    @e
    public final String getAward_tips() {
        return this.award_tips;
    }

    @e
    public final String getDay() {
        return this.day;
    }

    @e
    public final String getSigned() {
        return this.signed;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13953, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.award_tips;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.award_name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.award_img;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.day;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.signed;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.is_today;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    @e
    public final String is_today() {
        return this.is_today;
    }

    public final void setAward_img(@e String str) {
        this.award_img = str;
    }

    public final void setAward_name(@e String str) {
        this.award_name = str;
    }

    public final void setAward_tips(@e String str) {
        this.award_tips = str;
    }

    public final void setDay(@e String str) {
        this.day = str;
    }

    public final void setSigned(@e String str) {
        this.signed = str;
    }

    public final void set_today(@e String str) {
        this.is_today = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13952, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "SignAwardInfo(award_tips=" + this.award_tips + ", award_name=" + this.award_name + ", award_img=" + this.award_img + ", day=" + this.day + ", signed=" + this.signed + ", is_today=" + this.is_today + ')';
    }
}
