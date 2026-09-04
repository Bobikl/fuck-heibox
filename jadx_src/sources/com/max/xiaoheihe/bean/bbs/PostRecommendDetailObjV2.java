package com.max.xiaoheihe.bean.bbs;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PostRecommendDetailObjV2.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class PostRecommendDetailObjV2 implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String botton_name;

    @e
    private String protocol;

    @e
    private String subtitle;

    @e
    private String thumb;

    @e
    private String title;

    public PostRecommendDetailObjV2(@e String str, @e String str2, @e String str3, @e String str4, @e String str5) {
        this.title = str;
        this.subtitle = str2;
        this.botton_name = str3;
        this.protocol = str4;
        this.thumb = str5;
    }

    public static /* synthetic */ PostRecommendDetailObjV2 copy$default(PostRecommendDetailObjV2 postRecommendDetailObjV2, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{postRecommendDetailObjV2, str, str2, str3, str4, str5, new Integer(i10), obj}, null, changeQuickRedirect, true, 14439, new Class[]{PostRecommendDetailObjV2.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, PostRecommendDetailObjV2.class);
        if (patchProxyResultProxy.isSupported) {
            return (PostRecommendDetailObjV2) patchProxyResultProxy.result;
        }
        return postRecommendDetailObjV2.copy((i10 & 1) != 0 ? postRecommendDetailObjV2.title : str, (i10 & 2) != 0 ? postRecommendDetailObjV2.subtitle : str2, (i10 & 4) != 0 ? postRecommendDetailObjV2.botton_name : str3, (i10 & 8) != 0 ? postRecommendDetailObjV2.protocol : str4, (i10 & 16) != 0 ? postRecommendDetailObjV2.thumb : str5);
    }

    @e
    public final String component1() {
        return this.title;
    }

    @e
    public final String component2() {
        return this.subtitle;
    }

    @e
    public final String component3() {
        return this.botton_name;
    }

    @e
    public final String component4() {
        return this.protocol;
    }

    @e
    public final String component5() {
        return this.thumb;
    }

    @d
    public final PostRecommendDetailObjV2 copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5}, this, changeQuickRedirect, false, 14438, new Class[]{String.class, String.class, String.class, String.class, String.class}, PostRecommendDetailObjV2.class);
        return patchProxyResultProxy.isSupported ? (PostRecommendDetailObjV2) patchProxyResultProxy.result : new PostRecommendDetailObjV2(str, str2, str3, str4, str5);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14442, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostRecommendDetailObjV2)) {
            return false;
        }
        PostRecommendDetailObjV2 postRecommendDetailObjV2 = (PostRecommendDetailObjV2) obj;
        return f0.g(this.title, postRecommendDetailObjV2.title) && f0.g(this.subtitle, postRecommendDetailObjV2.subtitle) && f0.g(this.botton_name, postRecommendDetailObjV2.botton_name) && f0.g(this.protocol, postRecommendDetailObjV2.protocol) && f0.g(this.thumb, postRecommendDetailObjV2.thumb);
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
    public final String getSubtitle() {
        return this.subtitle;
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
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14441, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.botton_name;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.protocol;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.thumb;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final void setBotton_name(@e String str) {
        this.botton_name = str;
    }

    public final void setProtocol(@e String str) {
        this.protocol = str;
    }

    public final void setSubtitle(@e String str) {
        this.subtitle = str;
    }

    public final void setThumb(@e String str) {
        this.thumb = str;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14440, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "PostRecommendDetailObjV2(title=" + this.title + ", subtitle=" + this.subtitle + ", botton_name=" + this.botton_name + ", protocol=" + this.protocol + ", thumb=" + this.thumb + ')';
    }
}
