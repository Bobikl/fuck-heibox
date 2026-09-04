package com.max.xiaoheihe.bean.account;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: VerifyInfoObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class VerifyInfoObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private Boolean goto_certify_manager;

    @e
    private String id_card;

    @e
    private String name;

    @e
    private HashMap<String, Object> query_param;

    @e
    private String tips;

    @e
    private String title;

    public VerifyInfoObj(@e String str, @e String str2, @e String str3, @e String str4, @e Boolean bool, @e HashMap<String, Object> map) {
        this.name = str;
        this.id_card = str2;
        this.tips = str3;
        this.title = str4;
        this.goto_certify_manager = bool;
        this.query_param = map;
    }

    public static /* synthetic */ VerifyInfoObj copy$default(VerifyInfoObj verifyInfoObj, String str, String str2, String str3, String str4, Boolean bool, HashMap map, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{verifyInfoObj, str, str2, str3, str4, bool, map, new Integer(i10), obj}, null, changeQuickRedirect, true, 14036, new Class[]{VerifyInfoObj.class, String.class, String.class, String.class, String.class, Boolean.class, HashMap.class, Integer.TYPE, Object.class}, VerifyInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (VerifyInfoObj) patchProxyResultProxy.result;
        }
        return verifyInfoObj.copy((i10 & 1) != 0 ? verifyInfoObj.name : str, (i10 & 2) != 0 ? verifyInfoObj.id_card : str2, (i10 & 4) != 0 ? verifyInfoObj.tips : str3, (i10 & 8) != 0 ? verifyInfoObj.title : str4, (i10 & 16) != 0 ? verifyInfoObj.goto_certify_manager : bool, (i10 & 32) != 0 ? verifyInfoObj.query_param : map);
    }

    @e
    public final String component1() {
        return this.name;
    }

    @e
    public final String component2() {
        return this.id_card;
    }

    @e
    public final String component3() {
        return this.tips;
    }

    @e
    public final String component4() {
        return this.title;
    }

    @e
    public final Boolean component5() {
        return this.goto_certify_manager;
    }

    @e
    public final HashMap<String, Object> component6() {
        return this.query_param;
    }

    @d
    public final VerifyInfoObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e Boolean bool, @e HashMap<String, Object> map) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, bool, map}, this, changeQuickRedirect, false, 14035, new Class[]{String.class, String.class, String.class, String.class, Boolean.class, HashMap.class}, VerifyInfoObj.class);
        return patchProxyResultProxy.isSupported ? (VerifyInfoObj) patchProxyResultProxy.result : new VerifyInfoObj(str, str2, str3, str4, bool, map);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14039, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerifyInfoObj)) {
            return false;
        }
        VerifyInfoObj verifyInfoObj = (VerifyInfoObj) obj;
        return f0.g(this.name, verifyInfoObj.name) && f0.g(this.id_card, verifyInfoObj.id_card) && f0.g(this.tips, verifyInfoObj.tips) && f0.g(this.title, verifyInfoObj.title) && f0.g(this.goto_certify_manager, verifyInfoObj.goto_certify_manager) && f0.g(this.query_param, verifyInfoObj.query_param);
    }

    @e
    public final Boolean getGoto_certify_manager() {
        return this.goto_certify_manager;
    }

    @e
    public final String getId_card() {
        return this.id_card;
    }

    @e
    public final String getName() {
        return this.name;
    }

    @e
    public final HashMap<String, Object> getQuery_param() {
        return this.query_param;
    }

    @e
    public final String getTips() {
        return this.tips;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14038, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.id_card;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tips;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.title;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.goto_certify_manager;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        HashMap<String, Object> map = this.query_param;
        return iHashCode5 + (map != null ? map.hashCode() : 0);
    }

    public final void setGoto_certify_manager(@e Boolean bool) {
        this.goto_certify_manager = bool;
    }

    public final void setId_card(@e String str) {
        this.id_card = str;
    }

    public final void setName(@e String str) {
        this.name = str;
    }

    public final void setQuery_param(@e HashMap<String, Object> map) {
        this.query_param = map;
    }

    public final void setTips(@e String str) {
        this.tips = str;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14037, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "VerifyInfoObj(name=" + this.name + ", id_card=" + this.id_card + ", tips=" + this.tips + ", title=" + this.title + ", goto_certify_manager=" + this.goto_certify_manager + ", query_param=" + this.query_param + ')';
    }
}
