package com.max.hbminiprogram.bean;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TopicInfoObj.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class TopicInfoObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String name;

    @e
    private String pic_url;

    @e
    private String protocol;

    @e
    private String topic_id;

    public TopicInfoObj(@e String str, @e String str2, @e String str3, @e String str4) {
        this.topic_id = str;
        this.pic_url = str2;
        this.protocol = str3;
        this.name = str4;
    }

    public static /* synthetic */ TopicInfoObj copy$default(TopicInfoObj topicInfoObj, String str, String str2, String str3, String str4, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{topicInfoObj, str, str2, str3, str4, new Integer(i10), obj}, null, changeQuickRedirect, true, c.h.W, new Class[]{TopicInfoObj.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, TopicInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (TopicInfoObj) patchProxyResultProxy.result;
        }
        return topicInfoObj.copy((i10 & 1) != 0 ? topicInfoObj.topic_id : str, (i10 & 2) != 0 ? topicInfoObj.pic_url : str2, (i10 & 4) != 0 ? topicInfoObj.protocol : str3, (i10 & 8) != 0 ? topicInfoObj.name : str4);
    }

    @e
    public final String component1() {
        return this.topic_id;
    }

    @e
    public final String component2() {
        return this.pic_url;
    }

    @e
    public final String component3() {
        return this.protocol;
    }

    @e
    public final String component4() {
        return this.name;
    }

    @d
    public final TopicInfoObj copy(@e String str, @e String str2, @e String str3, @e String str4) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4}, this, changeQuickRedirect, false, c.h.V, new Class[]{String.class, String.class, String.class, String.class}, TopicInfoObj.class);
        return patchProxyResultProxy.isSupported ? (TopicInfoObj) patchProxyResultProxy.result : new TopicInfoObj(str, str2, str3, str4);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.h.Z, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TopicInfoObj)) {
            return false;
        }
        TopicInfoObj topicInfoObj = (TopicInfoObj) obj;
        return f0.g(this.topic_id, topicInfoObj.topic_id) && f0.g(this.pic_url, topicInfoObj.pic_url) && f0.g(this.protocol, topicInfoObj.protocol) && f0.g(this.name, topicInfoObj.name);
    }

    @e
    public final String getName() {
        return this.name;
    }

    @e
    public final String getPic_url() {
        return this.pic_url;
    }

    @e
    public final String getProtocol() {
        return this.protocol;
    }

    @e
    public final String getTopic_id() {
        return this.topic_id;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.h.Y, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.topic_id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.pic_url;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.protocol;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.name;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setName(@e String str) {
        this.name = str;
    }

    public final void setPic_url(@e String str) {
        this.pic_url = str;
    }

    public final void setProtocol(@e String str) {
        this.protocol = str;
    }

    public final void setTopic_id(@e String str) {
        this.topic_id = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.h.X, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "TopicInfoObj(topic_id=" + this.topic_id + ", pic_url=" + this.pic_url + ", protocol=" + this.protocol + ", name=" + this.name + ')';
    }
}
