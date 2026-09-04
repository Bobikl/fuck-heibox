package com.max.xiaoheihe.bean.bbs;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PostRecommendDetailObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class PostRecommendDetailObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<PostRecommendItemObj> list;

    @e
    private String text;

    @e
    private String title;

    public PostRecommendDetailObj(@e String str, @e String str2, @e List<PostRecommendItemObj> list) {
        this.title = str;
        this.text = str2;
        this.list = list;
    }

    public static /* synthetic */ PostRecommendDetailObj copy$default(PostRecommendDetailObj postRecommendDetailObj, String str, String str2, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{postRecommendDetailObj, str, str2, list, new Integer(i10), obj}, null, changeQuickRedirect, true, 14434, new Class[]{PostRecommendDetailObj.class, String.class, String.class, List.class, Integer.TYPE, Object.class}, PostRecommendDetailObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PostRecommendDetailObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = postRecommendDetailObj.title;
        }
        if ((i10 & 2) != 0) {
            str2 = postRecommendDetailObj.text;
        }
        if ((i10 & 4) != 0) {
            list = postRecommendDetailObj.list;
        }
        return postRecommendDetailObj.copy(str, str2, list);
    }

    @e
    public final String component1() {
        return this.title;
    }

    @e
    public final String component2() {
        return this.text;
    }

    @e
    public final List<PostRecommendItemObj> component3() {
        return this.list;
    }

    @d
    public final PostRecommendDetailObj copy(@e String str, @e String str2, @e List<PostRecommendItemObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, list}, this, changeQuickRedirect, false, 14433, new Class[]{String.class, String.class, List.class}, PostRecommendDetailObj.class);
        return patchProxyResultProxy.isSupported ? (PostRecommendDetailObj) patchProxyResultProxy.result : new PostRecommendDetailObj(str, str2, list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14437, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostRecommendDetailObj)) {
            return false;
        }
        PostRecommendDetailObj postRecommendDetailObj = (PostRecommendDetailObj) obj;
        return f0.g(this.title, postRecommendDetailObj.title) && f0.g(this.text, postRecommendDetailObj.text) && f0.g(this.list, postRecommendDetailObj.list);
    }

    @e
    public final List<PostRecommendItemObj> getList() {
        return this.list;
    }

    @e
    public final String getText() {
        return this.text;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14436, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.text;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<PostRecommendItemObj> list = this.list;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final void setList(@e List<PostRecommendItemObj> list) {
        this.list = list;
    }

    public final void setText(@e String str) {
        this.text = str;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14435, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "PostRecommendDetailObj(title=" + this.title + ", text=" + this.text + ", list=" + this.list + ')';
    }
}
