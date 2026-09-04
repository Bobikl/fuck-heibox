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

/* JADX INFO: compiled from: PostDefaultInfoObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class PostDefaultInfoObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String desc;

    @e
    private List<String> image_list;

    @e
    private String title;

    public PostDefaultInfoObj(@e String str, @e String str2, @e List<String> list) {
        this.title = str;
        this.desc = str2;
        this.image_list = list;
    }

    public static /* synthetic */ PostDefaultInfoObj copy$default(PostDefaultInfoObj postDefaultInfoObj, String str, String str2, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{postDefaultInfoObj, str, str2, list, new Integer(i10), obj}, null, changeQuickRedirect, true, 14376, new Class[]{PostDefaultInfoObj.class, String.class, String.class, List.class, Integer.TYPE, Object.class}, PostDefaultInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PostDefaultInfoObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = postDefaultInfoObj.title;
        }
        if ((i10 & 2) != 0) {
            str2 = postDefaultInfoObj.desc;
        }
        if ((i10 & 4) != 0) {
            list = postDefaultInfoObj.image_list;
        }
        return postDefaultInfoObj.copy(str, str2, list);
    }

    @e
    public final String component1() {
        return this.title;
    }

    @e
    public final String component2() {
        return this.desc;
    }

    @e
    public final List<String> component3() {
        return this.image_list;
    }

    @d
    public final PostDefaultInfoObj copy(@e String str, @e String str2, @e List<String> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, list}, this, changeQuickRedirect, false, 14375, new Class[]{String.class, String.class, List.class}, PostDefaultInfoObj.class);
        return patchProxyResultProxy.isSupported ? (PostDefaultInfoObj) patchProxyResultProxy.result : new PostDefaultInfoObj(str, str2, list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14379, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostDefaultInfoObj)) {
            return false;
        }
        PostDefaultInfoObj postDefaultInfoObj = (PostDefaultInfoObj) obj;
        return f0.g(this.title, postDefaultInfoObj.title) && f0.g(this.desc, postDefaultInfoObj.desc) && f0.g(this.image_list, postDefaultInfoObj.image_list);
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    @e
    public final List<String> getImage_list() {
        return this.image_list;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14378, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.desc;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.image_list;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    public final void setImage_list(@e List<String> list) {
        this.image_list = list;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14377, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "PostDefaultInfoObj(title=" + this.title + ", desc=" + this.desc + ", image_list=" + this.image_list + ')';
    }
}
