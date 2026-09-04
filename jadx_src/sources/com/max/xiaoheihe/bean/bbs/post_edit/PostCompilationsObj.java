package com.max.xiaoheihe.bean.bbs.post_edit;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PostCompilationsObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class PostCompilationsObj {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<PostCompilationItemObj> collections;
    private int count;

    @e
    private String is_owner;

    @e
    private String protocol;

    public PostCompilationsObj(int i10, @e String str, @e List<PostCompilationItemObj> list, @e String str2) {
        this.count = i10;
        this.is_owner = str;
        this.collections = list;
        this.protocol = str2;
    }

    public static /* synthetic */ PostCompilationsObj copy$default(PostCompilationsObj postCompilationsObj, int i10, String str, List list, String str2, int i11, Object obj) {
        int i12 = i10;
        Object[] objArr = {postCompilationsObj, new Integer(i12), str, list, str2, new Integer(i11), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 14552, new Class[]{PostCompilationsObj.class, cls, String.class, List.class, String.class, cls, Object.class}, PostCompilationsObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PostCompilationsObj) patchProxyResultProxy.result;
        }
        if ((i11 & 1) != 0) {
            i12 = postCompilationsObj.count;
        }
        return postCompilationsObj.copy(i12, (i11 & 2) != 0 ? postCompilationsObj.is_owner : str, (i11 & 4) != 0 ? postCompilationsObj.collections : list, (i11 & 8) != 0 ? postCompilationsObj.protocol : str2);
    }

    public final int component1() {
        return this.count;
    }

    @e
    public final String component2() {
        return this.is_owner;
    }

    @e
    public final List<PostCompilationItemObj> component3() {
        return this.collections;
    }

    @e
    public final String component4() {
        return this.protocol;
    }

    @d
    public final PostCompilationsObj copy(int i10, @e String str, @e List<PostCompilationItemObj> list, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), str, list, str2}, this, changeQuickRedirect, false, 14551, new Class[]{Integer.TYPE, String.class, List.class, String.class}, PostCompilationsObj.class);
        return patchProxyResultProxy.isSupported ? (PostCompilationsObj) patchProxyResultProxy.result : new PostCompilationsObj(i10, str, list, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14555, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostCompilationsObj)) {
            return false;
        }
        PostCompilationsObj postCompilationsObj = (PostCompilationsObj) obj;
        return this.count == postCompilationsObj.count && f0.g(this.is_owner, postCompilationsObj.is_owner) && f0.g(this.collections, postCompilationsObj.collections) && f0.g(this.protocol, postCompilationsObj.protocol);
    }

    @e
    public final List<PostCompilationItemObj> getCollections() {
        return this.collections;
    }

    public final int getCount() {
        return this.count;
    }

    @e
    public final String getProtocol() {
        return this.protocol;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14554, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int i10 = this.count * 31;
        String str = this.is_owner;
        int iHashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        List<PostCompilationItemObj> list = this.collections;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.protocol;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @e
    public final String is_owner() {
        return this.is_owner;
    }

    public final void setCollections(@e List<PostCompilationItemObj> list) {
        this.collections = list;
    }

    public final void setCount(int i10) {
        this.count = i10;
    }

    public final void setProtocol(@e String str) {
        this.protocol = str;
    }

    public final void set_owner(@e String str) {
        this.is_owner = str;
    }

    @d
    public final List<PostCompilationItemObj> takeCompilationItems(int i10) {
        List<PostCompilationItemObj> listE5;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 14550, new Class[]{Integer.TYPE}, List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        List<PostCompilationItemObj> list = this.collections;
        return (list == null || (listE5 = CollectionsKt___CollectionsKt.E5(list, i10)) == null) ? CollectionsKt__CollectionsKt.E() : listE5;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14553, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "PostCompilationsObj(count=" + this.count + ", is_owner=" + this.is_owner + ", collections=" + this.collections + ", protocol=" + this.protocol + ')';
    }
}
