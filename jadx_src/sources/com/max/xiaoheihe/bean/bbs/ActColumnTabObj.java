package com.max.xiaoheihe.bean.bbs;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ActColumnObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class ActColumnTabObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @e
    private String f76955id;

    @e
    private String list_type;

    @e
    private String name;

    @e
    private CreatePostInfo post;

    public ActColumnTabObj(@e String str, @e String str2, @e String str3, @e CreatePostInfo createPostInfo) {
        this.list_type = str;
        this.name = str2;
        this.f76955id = str3;
        this.post = createPostInfo;
    }

    public static /* synthetic */ ActColumnTabObj copy$default(ActColumnTabObj actColumnTabObj, String str, String str2, String str3, CreatePostInfo createPostInfo, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{actColumnTabObj, str, str2, str3, createPostInfo, new Integer(i10), obj}, null, changeQuickRedirect, true, 14142, new Class[]{ActColumnTabObj.class, String.class, String.class, String.class, CreatePostInfo.class, Integer.TYPE, Object.class}, ActColumnTabObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (ActColumnTabObj) patchProxyResultProxy.result;
        }
        return actColumnTabObj.copy((i10 & 1) != 0 ? actColumnTabObj.list_type : str, (i10 & 2) != 0 ? actColumnTabObj.name : str2, (i10 & 4) != 0 ? actColumnTabObj.f76955id : str3, (i10 & 8) != 0 ? actColumnTabObj.post : createPostInfo);
    }

    @e
    public final String component1() {
        return this.list_type;
    }

    @e
    public final String component2() {
        return this.name;
    }

    @e
    public final String component3() {
        return this.f76955id;
    }

    @e
    public final CreatePostInfo component4() {
        return this.post;
    }

    @d
    public final ActColumnTabObj copy(@e String str, @e String str2, @e String str3, @e CreatePostInfo createPostInfo) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, createPostInfo}, this, changeQuickRedirect, false, 14141, new Class[]{String.class, String.class, String.class, CreatePostInfo.class}, ActColumnTabObj.class);
        return patchProxyResultProxy.isSupported ? (ActColumnTabObj) patchProxyResultProxy.result : new ActColumnTabObj(str, str2, str3, createPostInfo);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14145, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActColumnTabObj)) {
            return false;
        }
        ActColumnTabObj actColumnTabObj = (ActColumnTabObj) obj;
        return f0.g(this.list_type, actColumnTabObj.list_type) && f0.g(this.name, actColumnTabObj.name) && f0.g(this.f76955id, actColumnTabObj.f76955id) && f0.g(this.post, actColumnTabObj.post);
    }

    @e
    public final String getId() {
        return this.f76955id;
    }

    @e
    public final String getList_type() {
        return this.list_type;
    }

    @e
    public final String getName() {
        return this.name;
    }

    @e
    public final CreatePostInfo getPost() {
        return this.post;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14144, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.list_type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f76955id;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        CreatePostInfo createPostInfo = this.post;
        return iHashCode3 + (createPostInfo != null ? createPostInfo.hashCode() : 0);
    }

    public final void setId(@e String str) {
        this.f76955id = str;
    }

    public final void setList_type(@e String str) {
        this.list_type = str;
    }

    public final void setName(@e String str) {
        this.name = str;
    }

    public final void setPost(@e CreatePostInfo createPostInfo) {
        this.post = createPostInfo;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14143, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ActColumnTabObj(list_type=" + this.list_type + ", name=" + this.name + ", id=" + this.f76955id + ", post=" + this.post + ')';
    }
}
