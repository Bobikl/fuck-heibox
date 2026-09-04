package com.max.xiaoheihe.bean.bbs;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PostLimitObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class PostLimitObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private MaxMinLimitObj pic_limit;

    @e
    private MaxMinLimitObj text_limit;

    @e
    private MaxMinLimitObj title_limit;

    public PostLimitObj(@e MaxMinLimitObj maxMinLimitObj, @e MaxMinLimitObj maxMinLimitObj2, @e MaxMinLimitObj maxMinLimitObj3) {
        this.title_limit = maxMinLimitObj;
        this.text_limit = maxMinLimitObj2;
        this.pic_limit = maxMinLimitObj3;
    }

    public static /* synthetic */ PostLimitObj copy$default(PostLimitObj postLimitObj, MaxMinLimitObj maxMinLimitObj, MaxMinLimitObj maxMinLimitObj2, MaxMinLimitObj maxMinLimitObj3, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{postLimitObj, maxMinLimitObj, maxMinLimitObj2, maxMinLimitObj3, new Integer(i10), obj}, null, changeQuickRedirect, true, 14414, new Class[]{PostLimitObj.class, MaxMinLimitObj.class, MaxMinLimitObj.class, MaxMinLimitObj.class, Integer.TYPE, Object.class}, PostLimitObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PostLimitObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            maxMinLimitObj = postLimitObj.title_limit;
        }
        if ((i10 & 2) != 0) {
            maxMinLimitObj2 = postLimitObj.text_limit;
        }
        if ((i10 & 4) != 0) {
            maxMinLimitObj3 = postLimitObj.pic_limit;
        }
        return postLimitObj.copy(maxMinLimitObj, maxMinLimitObj2, maxMinLimitObj3);
    }

    @e
    public final MaxMinLimitObj component1() {
        return this.title_limit;
    }

    @e
    public final MaxMinLimitObj component2() {
        return this.text_limit;
    }

    @e
    public final MaxMinLimitObj component3() {
        return this.pic_limit;
    }

    @d
    public final PostLimitObj copy(@e MaxMinLimitObj maxMinLimitObj, @e MaxMinLimitObj maxMinLimitObj2, @e MaxMinLimitObj maxMinLimitObj3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{maxMinLimitObj, maxMinLimitObj2, maxMinLimitObj3}, this, changeQuickRedirect, false, 14413, new Class[]{MaxMinLimitObj.class, MaxMinLimitObj.class, MaxMinLimitObj.class}, PostLimitObj.class);
        return patchProxyResultProxy.isSupported ? (PostLimitObj) patchProxyResultProxy.result : new PostLimitObj(maxMinLimitObj, maxMinLimitObj2, maxMinLimitObj3);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14417, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostLimitObj)) {
            return false;
        }
        PostLimitObj postLimitObj = (PostLimitObj) obj;
        return f0.g(this.title_limit, postLimitObj.title_limit) && f0.g(this.text_limit, postLimitObj.text_limit) && f0.g(this.pic_limit, postLimitObj.pic_limit);
    }

    @e
    public final MaxMinLimitObj getPic_limit() {
        return this.pic_limit;
    }

    @e
    public final MaxMinLimitObj getText_limit() {
        return this.text_limit;
    }

    @e
    public final MaxMinLimitObj getTitle_limit() {
        return this.title_limit;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14416, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        MaxMinLimitObj maxMinLimitObj = this.title_limit;
        int iHashCode = (maxMinLimitObj == null ? 0 : maxMinLimitObj.hashCode()) * 31;
        MaxMinLimitObj maxMinLimitObj2 = this.text_limit;
        int iHashCode2 = (iHashCode + (maxMinLimitObj2 == null ? 0 : maxMinLimitObj2.hashCode())) * 31;
        MaxMinLimitObj maxMinLimitObj3 = this.pic_limit;
        return iHashCode2 + (maxMinLimitObj3 != null ? maxMinLimitObj3.hashCode() : 0);
    }

    public final void setPic_limit(@e MaxMinLimitObj maxMinLimitObj) {
        this.pic_limit = maxMinLimitObj;
    }

    public final void setText_limit(@e MaxMinLimitObj maxMinLimitObj) {
        this.text_limit = maxMinLimitObj;
    }

    public final void setTitle_limit(@e MaxMinLimitObj maxMinLimitObj) {
        this.title_limit = maxMinLimitObj;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14415, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "PostLimitObj(title_limit=" + this.title_limit + ", text_limit=" + this.text_limit + ", pic_limit=" + this.pic_limit + ')';
    }
}
