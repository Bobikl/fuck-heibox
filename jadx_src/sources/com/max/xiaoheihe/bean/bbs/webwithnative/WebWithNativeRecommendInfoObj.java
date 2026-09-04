package com.max.xiaoheihe.bean.bbs.webwithnative;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: WebWithNativeRecommendInfoObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class WebWithNativeRecommendInfoObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String comment_hint;

    @e
    private String comment_title;

    @e
    private String commented_hint;

    @e
    private WebWithNativeRecommendItemObj negative_info;

    @e
    private WebWithNativeRecommendItemObj positive_info;

    public WebWithNativeRecommendInfoObj(@e WebWithNativeRecommendItemObj webWithNativeRecommendItemObj, @e WebWithNativeRecommendItemObj webWithNativeRecommendItemObj2, @e String str, @e String str2, @e String str3) {
        this.positive_info = webWithNativeRecommendItemObj;
        this.negative_info = webWithNativeRecommendItemObj2;
        this.comment_hint = str;
        this.commented_hint = str2;
        this.comment_title = str3;
    }

    public static /* synthetic */ WebWithNativeRecommendInfoObj copy$default(WebWithNativeRecommendInfoObj webWithNativeRecommendInfoObj, WebWithNativeRecommendItemObj webWithNativeRecommendItemObj, WebWithNativeRecommendItemObj webWithNativeRecommendItemObj2, String str, String str2, String str3, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{webWithNativeRecommendInfoObj, webWithNativeRecommendItemObj, webWithNativeRecommendItemObj2, str, str2, str3, new Integer(i10), obj}, null, changeQuickRedirect, true, 14581, new Class[]{WebWithNativeRecommendInfoObj.class, WebWithNativeRecommendItemObj.class, WebWithNativeRecommendItemObj.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, WebWithNativeRecommendInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (WebWithNativeRecommendInfoObj) patchProxyResultProxy.result;
        }
        return webWithNativeRecommendInfoObj.copy((i10 & 1) != 0 ? webWithNativeRecommendInfoObj.positive_info : webWithNativeRecommendItemObj, (i10 & 2) != 0 ? webWithNativeRecommendInfoObj.negative_info : webWithNativeRecommendItemObj2, (i10 & 4) != 0 ? webWithNativeRecommendInfoObj.comment_hint : str, (i10 & 8) != 0 ? webWithNativeRecommendInfoObj.commented_hint : str2, (i10 & 16) != 0 ? webWithNativeRecommendInfoObj.comment_title : str3);
    }

    @e
    public final WebWithNativeRecommendItemObj component1() {
        return this.positive_info;
    }

    @e
    public final WebWithNativeRecommendItemObj component2() {
        return this.negative_info;
    }

    @e
    public final String component3() {
        return this.comment_hint;
    }

    @e
    public final String component4() {
        return this.commented_hint;
    }

    @e
    public final String component5() {
        return this.comment_title;
    }

    @d
    public final WebWithNativeRecommendInfoObj copy(@e WebWithNativeRecommendItemObj webWithNativeRecommendItemObj, @e WebWithNativeRecommendItemObj webWithNativeRecommendItemObj2, @e String str, @e String str2, @e String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{webWithNativeRecommendItemObj, webWithNativeRecommendItemObj2, str, str2, str3}, this, changeQuickRedirect, false, 14580, new Class[]{WebWithNativeRecommendItemObj.class, WebWithNativeRecommendItemObj.class, String.class, String.class, String.class}, WebWithNativeRecommendInfoObj.class);
        return patchProxyResultProxy.isSupported ? (WebWithNativeRecommendInfoObj) patchProxyResultProxy.result : new WebWithNativeRecommendInfoObj(webWithNativeRecommendItemObj, webWithNativeRecommendItemObj2, str, str2, str3);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14584, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebWithNativeRecommendInfoObj)) {
            return false;
        }
        WebWithNativeRecommendInfoObj webWithNativeRecommendInfoObj = (WebWithNativeRecommendInfoObj) obj;
        return f0.g(this.positive_info, webWithNativeRecommendInfoObj.positive_info) && f0.g(this.negative_info, webWithNativeRecommendInfoObj.negative_info) && f0.g(this.comment_hint, webWithNativeRecommendInfoObj.comment_hint) && f0.g(this.commented_hint, webWithNativeRecommendInfoObj.commented_hint) && f0.g(this.comment_title, webWithNativeRecommendInfoObj.comment_title);
    }

    @e
    public final String getComment_hint() {
        return this.comment_hint;
    }

    @e
    public final String getComment_title() {
        return this.comment_title;
    }

    @e
    public final String getCommented_hint() {
        return this.commented_hint;
    }

    @e
    public final WebWithNativeRecommendItemObj getNegative_info() {
        return this.negative_info;
    }

    @e
    public final WebWithNativeRecommendItemObj getPositive_info() {
        return this.positive_info;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14583, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        WebWithNativeRecommendItemObj webWithNativeRecommendItemObj = this.positive_info;
        int iHashCode = (webWithNativeRecommendItemObj == null ? 0 : webWithNativeRecommendItemObj.hashCode()) * 31;
        WebWithNativeRecommendItemObj webWithNativeRecommendItemObj2 = this.negative_info;
        int iHashCode2 = (iHashCode + (webWithNativeRecommendItemObj2 == null ? 0 : webWithNativeRecommendItemObj2.hashCode())) * 31;
        String str = this.comment_hint;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.commented_hint;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.comment_title;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setComment_hint(@e String str) {
        this.comment_hint = str;
    }

    public final void setComment_title(@e String str) {
        this.comment_title = str;
    }

    public final void setCommented_hint(@e String str) {
        this.commented_hint = str;
    }

    public final void setNegative_info(@e WebWithNativeRecommendItemObj webWithNativeRecommendItemObj) {
        this.negative_info = webWithNativeRecommendItemObj;
    }

    public final void setPositive_info(@e WebWithNativeRecommendItemObj webWithNativeRecommendItemObj) {
        this.positive_info = webWithNativeRecommendItemObj;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14582, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "WebWithNativeRecommendInfoObj(positive_info=" + this.positive_info + ", negative_info=" + this.negative_info + ", comment_hint=" + this.comment_hint + ", commented_hint=" + this.commented_hint + ", comment_title=" + this.comment_title + ')';
    }
}
