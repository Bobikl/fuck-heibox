package com.max.xiaoheihe.bean.bbs;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: CreatePostInfo.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class CreatePostInfo implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String enabled;

    @e
    private String hashtag_name;

    public CreatePostInfo(@e String str, @e String str2) {
        this.enabled = str;
        this.hashtag_name = str2;
    }

    public static /* synthetic */ CreatePostInfo copy$default(CreatePostInfo createPostInfo, String str, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{createPostInfo, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, 14265, new Class[]{CreatePostInfo.class, String.class, String.class, Integer.TYPE, Object.class}, CreatePostInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (CreatePostInfo) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = createPostInfo.enabled;
        }
        if ((i10 & 2) != 0) {
            str2 = createPostInfo.hashtag_name;
        }
        return createPostInfo.copy(str, str2);
    }

    @e
    public final String component1() {
        return this.enabled;
    }

    @e
    public final String component2() {
        return this.hashtag_name;
    }

    @d
    public final CreatePostInfo copy(@e String str, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 14264, new Class[]{String.class, String.class}, CreatePostInfo.class);
        return patchProxyResultProxy.isSupported ? (CreatePostInfo) patchProxyResultProxy.result : new CreatePostInfo(str, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14268, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreatePostInfo)) {
            return false;
        }
        CreatePostInfo createPostInfo = (CreatePostInfo) obj;
        return f0.g(this.enabled, createPostInfo.enabled) && f0.g(this.hashtag_name, createPostInfo.hashtag_name);
    }

    @e
    public final String getEnabled() {
        return this.enabled;
    }

    @e
    public final String getHashtag_name() {
        return this.hashtag_name;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14267, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.enabled;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.hashtag_name;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setEnabled(@e String str) {
        this.enabled = str;
    }

    public final void setHashtag_name(@e String str) {
        this.hashtag_name = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14266, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "CreatePostInfo(enabled=" + this.enabled + ", hashtag_name=" + this.hashtag_name + ')';
    }
}
