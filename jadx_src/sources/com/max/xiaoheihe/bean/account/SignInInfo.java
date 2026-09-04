package com.max.xiaoheihe.bean.account;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SignInInfo.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class SignInInfo implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private BBSUserInfoObj current_user;

    @e
    private String sign_desc;

    @e
    private ArrayList<SignAwardInfo> sign_list;

    @e
    private PushStateObj sign_push_state;

    @e
    private String today_signed;

    public SignInInfo(@e String str, @e PushStateObj pushStateObj, @e ArrayList<SignAwardInfo> arrayList, @e String str2, @e BBSUserInfoObj bBSUserInfoObj) {
        this.sign_desc = str;
        this.sign_push_state = pushStateObj;
        this.sign_list = arrayList;
        this.today_signed = str2;
        this.current_user = bBSUserInfoObj;
    }

    public static /* synthetic */ SignInInfo copy$default(SignInInfo signInInfo, String str, PushStateObj pushStateObj, ArrayList arrayList, String str2, BBSUserInfoObj bBSUserInfoObj, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{signInInfo, str, pushStateObj, arrayList, str2, bBSUserInfoObj, new Integer(i10), obj}, null, changeQuickRedirect, true, 13961, new Class[]{SignInInfo.class, String.class, PushStateObj.class, ArrayList.class, String.class, BBSUserInfoObj.class, Integer.TYPE, Object.class}, SignInInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (SignInInfo) patchProxyResultProxy.result;
        }
        return signInInfo.copy((i10 & 1) != 0 ? signInInfo.sign_desc : str, (i10 & 2) != 0 ? signInInfo.sign_push_state : pushStateObj, (i10 & 4) != 0 ? signInInfo.sign_list : arrayList, (i10 & 8) != 0 ? signInInfo.today_signed : str2, (i10 & 16) != 0 ? signInInfo.current_user : bBSUserInfoObj);
    }

    @e
    public final String component1() {
        return this.sign_desc;
    }

    @e
    public final PushStateObj component2() {
        return this.sign_push_state;
    }

    @e
    public final ArrayList<SignAwardInfo> component3() {
        return this.sign_list;
    }

    @e
    public final String component4() {
        return this.today_signed;
    }

    @e
    public final BBSUserInfoObj component5() {
        return this.current_user;
    }

    @d
    public final SignInInfo copy(@e String str, @e PushStateObj pushStateObj, @e ArrayList<SignAwardInfo> arrayList, @e String str2, @e BBSUserInfoObj bBSUserInfoObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, pushStateObj, arrayList, str2, bBSUserInfoObj}, this, changeQuickRedirect, false, 13960, new Class[]{String.class, PushStateObj.class, ArrayList.class, String.class, BBSUserInfoObj.class}, SignInInfo.class);
        return patchProxyResultProxy.isSupported ? (SignInInfo) patchProxyResultProxy.result : new SignInInfo(str, pushStateObj, arrayList, str2, bBSUserInfoObj);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 13964, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignInInfo)) {
            return false;
        }
        SignInInfo signInInfo = (SignInInfo) obj;
        return f0.g(this.sign_desc, signInInfo.sign_desc) && f0.g(this.sign_push_state, signInInfo.sign_push_state) && f0.g(this.sign_list, signInInfo.sign_list) && f0.g(this.today_signed, signInInfo.today_signed) && f0.g(this.current_user, signInInfo.current_user);
    }

    @e
    public final BBSUserInfoObj getCurrent_user() {
        return this.current_user;
    }

    @e
    public final String getSign_desc() {
        return this.sign_desc;
    }

    @e
    public final ArrayList<SignAwardInfo> getSign_list() {
        return this.sign_list;
    }

    @e
    public final PushStateObj getSign_push_state() {
        return this.sign_push_state;
    }

    @e
    public final String getToday_signed() {
        return this.today_signed;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13963, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.sign_desc;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        PushStateObj pushStateObj = this.sign_push_state;
        int iHashCode2 = (iHashCode + (pushStateObj == null ? 0 : pushStateObj.hashCode())) * 31;
        ArrayList<SignAwardInfo> arrayList = this.sign_list;
        int iHashCode3 = (iHashCode2 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        String str2 = this.today_signed;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BBSUserInfoObj bBSUserInfoObj = this.current_user;
        return iHashCode4 + (bBSUserInfoObj != null ? bBSUserInfoObj.hashCode() : 0);
    }

    public final void setCurrent_user(@e BBSUserInfoObj bBSUserInfoObj) {
        this.current_user = bBSUserInfoObj;
    }

    public final void setSign_desc(@e String str) {
        this.sign_desc = str;
    }

    public final void setSign_list(@e ArrayList<SignAwardInfo> arrayList) {
        this.sign_list = arrayList;
    }

    public final void setSign_push_state(@e PushStateObj pushStateObj) {
        this.sign_push_state = pushStateObj;
    }

    public final void setToday_signed(@e String str) {
        this.today_signed = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13962, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "SignInInfo(sign_desc=" + this.sign_desc + ", sign_push_state=" + this.sign_push_state + ", sign_list=" + this.sign_list + ", today_signed=" + this.today_signed + ", current_user=" + this.current_user + ')';
    }
}
