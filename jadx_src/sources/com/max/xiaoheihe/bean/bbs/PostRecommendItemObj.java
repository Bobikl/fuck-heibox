package com.max.xiaoheihe.bean.bbs;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PostRecommendItemObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class PostRecommendItemObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String botton_name;

    @e
    private String protocol;

    @e
    private String thumb;

    @e
    private String title;

    public PostRecommendItemObj(@e String str, @e String str2, @e String str3, @e String str4) {
        this.protocol = str;
        this.thumb = str2;
        this.title = str3;
        this.botton_name = str4;
    }

    public static /* synthetic */ PostRecommendItemObj copy$default(PostRecommendItemObj postRecommendItemObj, String str, String str2, String str3, String str4, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{postRecommendItemObj, str, str2, str3, str4, new Integer(i10), obj}, null, changeQuickRedirect, true, 14444, new Class[]{PostRecommendItemObj.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, PostRecommendItemObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PostRecommendItemObj) patchProxyResultProxy.result;
        }
        return postRecommendItemObj.copy((i10 & 1) != 0 ? postRecommendItemObj.protocol : str, (i10 & 2) != 0 ? postRecommendItemObj.thumb : str2, (i10 & 4) != 0 ? postRecommendItemObj.title : str3, (i10 & 8) != 0 ? postRecommendItemObj.botton_name : str4);
    }

    @e
    public final String component1() {
        return this.protocol;
    }

    @e
    public final String component2() {
        return this.thumb;
    }

    @e
    public final String component3() {
        return this.title;
    }

    @e
    public final String component4() {
        return this.botton_name;
    }

    @d
    public final PostRecommendItemObj copy(@e String str, @e String str2, @e String str3, @e String str4) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4}, this, changeQuickRedirect, false, 14443, new Class[]{String.class, String.class, String.class, String.class}, PostRecommendItemObj.class);
        return patchProxyResultProxy.isSupported ? (PostRecommendItemObj) patchProxyResultProxy.result : new PostRecommendItemObj(str, str2, str3, str4);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14447, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostRecommendItemObj)) {
            return false;
        }
        PostRecommendItemObj postRecommendItemObj = (PostRecommendItemObj) obj;
        return f0.g(this.protocol, postRecommendItemObj.protocol) && f0.g(this.thumb, postRecommendItemObj.thumb) && f0.g(this.title, postRecommendItemObj.title) && f0.g(this.botton_name, postRecommendItemObj.botton_name);
    }

    @e
    public final String getBotton_name() {
        return this.botton_name;
    }

    @e
    public final String getProtocol() {
        return this.protocol;
    }

    @e
    public final String getThumb() {
        return this.thumb;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14446, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.protocol;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.thumb;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.botton_name;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setBotton_name(@e String str) {
        this.botton_name = str;
    }

    public final void setProtocol(@e String str) {
        this.protocol = str;
    }

    public final void setThumb(@e String str) {
        this.thumb = str;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14445, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "PostRecommendItemObj(protocol=" + this.protocol + ", thumb=" + this.thumb + ", title=" + this.title + ", botton_name=" + this.botton_name + ')';
    }
}
