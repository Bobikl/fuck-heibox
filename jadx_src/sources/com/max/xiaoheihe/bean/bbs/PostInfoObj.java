package com.max.xiaoheihe.bean.bbs;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PostInfoObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class PostInfoObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String protocol;

    @e
    private BBSTopicObj topic_info;

    public PostInfoObj(@e BBSTopicObj bBSTopicObj, @e String str) {
        this.topic_info = bBSTopicObj;
        this.protocol = str;
    }

    public static /* synthetic */ PostInfoObj copy$default(PostInfoObj postInfoObj, BBSTopicObj bBSTopicObj, String str, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{postInfoObj, bBSTopicObj, str, new Integer(i10), obj}, null, changeQuickRedirect, true, 14409, new Class[]{PostInfoObj.class, BBSTopicObj.class, String.class, Integer.TYPE, Object.class}, PostInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PostInfoObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            bBSTopicObj = postInfoObj.topic_info;
        }
        if ((i10 & 2) != 0) {
            str = postInfoObj.protocol;
        }
        return postInfoObj.copy(bBSTopicObj, str);
    }

    @e
    public final BBSTopicObj component1() {
        return this.topic_info;
    }

    @e
    public final String component2() {
        return this.protocol;
    }

    @d
    public final PostInfoObj copy(@e BBSTopicObj bBSTopicObj, @e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bBSTopicObj, str}, this, changeQuickRedirect, false, 14408, new Class[]{BBSTopicObj.class, String.class}, PostInfoObj.class);
        return patchProxyResultProxy.isSupported ? (PostInfoObj) patchProxyResultProxy.result : new PostInfoObj(bBSTopicObj, str);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14412, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostInfoObj)) {
            return false;
        }
        PostInfoObj postInfoObj = (PostInfoObj) obj;
        return f0.g(this.topic_info, postInfoObj.topic_info) && f0.g(this.protocol, postInfoObj.protocol);
    }

    @e
    public final String getProtocol() {
        return this.protocol;
    }

    @e
    public final BBSTopicObj getTopic_info() {
        return this.topic_info;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14411, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        BBSTopicObj bBSTopicObj = this.topic_info;
        int iHashCode = (bBSTopicObj == null ? 0 : bBSTopicObj.hashCode()) * 31;
        String str = this.protocol;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final void setProtocol(@e String str) {
        this.protocol = str;
    }

    public final void setTopic_info(@e BBSTopicObj bBSTopicObj) {
        this.topic_info = bBSTopicObj;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14410, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "PostInfoObj(topic_info=" + this.topic_info + ", protocol=" + this.protocol + ')';
    }
}
