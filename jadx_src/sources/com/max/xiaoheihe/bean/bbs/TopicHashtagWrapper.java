package com.max.xiaoheihe.bean.bbs;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: TopicHashtagWrapper.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class TopicHashtagWrapper implements Serializable {

    @d
    public static final String TYPE_CREATE = "create";

    @d
    public static final String TYPE_HASHTAG = "hashtag";

    @d
    public static final String TYPE_TOPIC = "topic";
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private HashtagObj hashtag;

    @d
    private String search_type;

    @e
    private BBSTopicObj topic;

    @d
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: TopicHashtagWrapper.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }
    }

    public TopicHashtagWrapper(@d String search_type, @e BBSTopicObj bBSTopicObj, @e HashtagObj hashtagObj) {
        f0.p(search_type, "search_type");
        this.search_type = search_type;
        this.topic = bBSTopicObj;
        this.hashtag = hashtagObj;
    }

    public /* synthetic */ TopicHashtagWrapper(String str, BBSTopicObj bBSTopicObj, HashtagObj hashtagObj, int i10, u uVar) {
        this((i10 & 1) != 0 ? "topic" : str, bBSTopicObj, hashtagObj);
    }

    public static /* synthetic */ TopicHashtagWrapper copy$default(TopicHashtagWrapper topicHashtagWrapper, String str, BBSTopicObj bBSTopicObj, HashtagObj hashtagObj, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{topicHashtagWrapper, str, bBSTopicObj, hashtagObj, new Integer(i10), obj}, null, changeQuickRedirect, true, 14496, new Class[]{TopicHashtagWrapper.class, String.class, BBSTopicObj.class, HashtagObj.class, Integer.TYPE, Object.class}, TopicHashtagWrapper.class);
        if (patchProxyResultProxy.isSupported) {
            return (TopicHashtagWrapper) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = topicHashtagWrapper.search_type;
        }
        if ((i10 & 2) != 0) {
            bBSTopicObj = topicHashtagWrapper.topic;
        }
        if ((i10 & 4) != 0) {
            hashtagObj = topicHashtagWrapper.hashtag;
        }
        return topicHashtagWrapper.copy(str, bBSTopicObj, hashtagObj);
    }

    @d
    public final String component1() {
        return this.search_type;
    }

    @e
    public final BBSTopicObj component2() {
        return this.topic;
    }

    @e
    public final HashtagObj component3() {
        return this.hashtag;
    }

    @d
    public final TopicHashtagWrapper copy(@d String search_type, @e BBSTopicObj bBSTopicObj, @e HashtagObj hashtagObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{search_type, bBSTopicObj, hashtagObj}, this, changeQuickRedirect, false, 14495, new Class[]{String.class, BBSTopicObj.class, HashtagObj.class}, TopicHashtagWrapper.class);
        if (patchProxyResultProxy.isSupported) {
            return (TopicHashtagWrapper) patchProxyResultProxy.result;
        }
        f0.p(search_type, "search_type");
        return new TopicHashtagWrapper(search_type, bBSTopicObj, hashtagObj);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14499, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TopicHashtagWrapper)) {
            return false;
        }
        TopicHashtagWrapper topicHashtagWrapper = (TopicHashtagWrapper) obj;
        return f0.g(this.search_type, topicHashtagWrapper.search_type) && f0.g(this.topic, topicHashtagWrapper.topic) && f0.g(this.hashtag, topicHashtagWrapper.hashtag);
    }

    @e
    public final HashtagObj getHashtag() {
        return this.hashtag;
    }

    @d
    public final String getSearch_type() {
        return this.search_type;
    }

    @e
    public final BBSTopicObj getTopic() {
        return this.topic;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14498, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int iHashCode = this.search_type.hashCode() * 31;
        BBSTopicObj bBSTopicObj = this.topic;
        int iHashCode2 = (iHashCode + (bBSTopicObj == null ? 0 : bBSTopicObj.hashCode())) * 31;
        HashtagObj hashtagObj = this.hashtag;
        return iHashCode2 + (hashtagObj != null ? hashtagObj.hashCode() : 0);
    }

    public final boolean isHashtag() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14494, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : f0.g(this.search_type, "hashtag");
    }

    public final boolean isTopic() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14493, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : f0.g(this.search_type, "topic");
    }

    public final void setHashtag(@e HashtagObj hashtagObj) {
        this.hashtag = hashtagObj;
    }

    public final void setSearch_type(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 14492, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.search_type = str;
    }

    public final void setTopic(@e BBSTopicObj bBSTopicObj) {
        this.topic = bBSTopicObj;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14497, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "TopicHashtagWrapper(search_type=" + this.search_type + ", topic=" + this.topic + ", hashtag=" + this.hashtag + ')';
    }
}
