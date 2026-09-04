package com.max.xiaoheihe.bean.bbs;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TopicWrapper.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class TopicWrapper implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String parent_key;

    @e
    private String title;

    @e
    private BBSTopicObj topic;

    public TopicWrapper(@e String str, @e BBSTopicObj bBSTopicObj) {
        this.title = str;
        this.topic = bBSTopicObj;
    }

    public static /* synthetic */ TopicWrapper copy$default(TopicWrapper topicWrapper, String str, BBSTopicObj bBSTopicObj, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{topicWrapper, str, bBSTopicObj, new Integer(i10), obj}, null, changeQuickRedirect, true, 14526, new Class[]{TopicWrapper.class, String.class, BBSTopicObj.class, Integer.TYPE, Object.class}, TopicWrapper.class);
        if (patchProxyResultProxy.isSupported) {
            return (TopicWrapper) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = topicWrapper.title;
        }
        if ((i10 & 2) != 0) {
            bBSTopicObj = topicWrapper.topic;
        }
        return topicWrapper.copy(str, bBSTopicObj);
    }

    @e
    public final String component1() {
        return this.title;
    }

    @e
    public final BBSTopicObj component2() {
        return this.topic;
    }

    @d
    public final TopicWrapper copy(@e String str, @e BBSTopicObj bBSTopicObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, bBSTopicObj}, this, changeQuickRedirect, false, 14525, new Class[]{String.class, BBSTopicObj.class}, TopicWrapper.class);
        return patchProxyResultProxy.isSupported ? (TopicWrapper) patchProxyResultProxy.result : new TopicWrapper(str, bBSTopicObj);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14529, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TopicWrapper)) {
            return false;
        }
        TopicWrapper topicWrapper = (TopicWrapper) obj;
        return f0.g(this.title, topicWrapper.title) && f0.g(this.topic, topicWrapper.topic);
    }

    @e
    public final String getParent_key() {
        return this.parent_key;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    @e
    public final BBSTopicObj getTopic() {
        return this.topic;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14528, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        BBSTopicObj bBSTopicObj = this.topic;
        return iHashCode + (bBSTopicObj != null ? bBSTopicObj.hashCode() : 0);
    }

    public final void setParent_key(@e String str) {
        this.parent_key = str;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }

    public final void setTopic(@e BBSTopicObj bBSTopicObj) {
        this.topic = bBSTopicObj;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14527, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "TopicWrapper(title=" + this.title + ", topic=" + this.topic + ')';
    }
}
