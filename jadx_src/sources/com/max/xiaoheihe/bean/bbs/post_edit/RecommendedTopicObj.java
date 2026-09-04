package com.max.xiaoheihe.bean.bbs.post_edit;

import androidx.compose.runtime.internal.o;
import com.google.gson.annotations.SerializedName;
import com.max.hbcommon.utils.c;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.max.xiaoheihe.bean.bbs.HashtagObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: RecommendTopicObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class RecommendedTopicObj {
    public static final int $stable = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    @SerializedName("item_type")
    @e
    private final String itemType;

    @SerializedName("name")
    @e
    private final String name;

    @SerializedName("pic_url")
    @e
    private final String picUrl;

    @SerializedName("rec_src")
    @e
    private final String recSrc;

    @SerializedName("topic_id")
    @e
    private final String topicId;

    public RecommendedTopicObj(@e String str, @e String str2, @e String str3, @e String str4, @e String str5) {
        this.itemType = str;
        this.name = str2;
        this.topicId = str3;
        this.picUrl = str4;
        this.recSrc = str5;
    }

    public static /* synthetic */ RecommendedTopicObj copy$default(RecommendedTopicObj recommendedTopicObj, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{recommendedTopicObj, str, str2, str3, str4, str5, new Integer(i10), obj}, null, changeQuickRedirect, true, 14566, new Class[]{RecommendedTopicObj.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, RecommendedTopicObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (RecommendedTopicObj) patchProxyResultProxy.result;
        }
        return recommendedTopicObj.copy((i10 & 1) != 0 ? recommendedTopicObj.itemType : str, (i10 & 2) != 0 ? recommendedTopicObj.name : str2, (i10 & 4) != 0 ? recommendedTopicObj.topicId : str3, (i10 & 8) != 0 ? recommendedTopicObj.picUrl : str4, (i10 & 16) != 0 ? recommendedTopicObj.recSrc : str5);
    }

    @e
    public final String component1() {
        return this.itemType;
    }

    @e
    public final String component2() {
        return this.name;
    }

    @e
    public final String component3() {
        return this.topicId;
    }

    @e
    public final String component4() {
        return this.picUrl;
    }

    @e
    public final String component5() {
        return this.recSrc;
    }

    @d
    public final RecommendedTopicObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5}, this, changeQuickRedirect, false, 14565, new Class[]{String.class, String.class, String.class, String.class, String.class}, RecommendedTopicObj.class);
        return patchProxyResultProxy.isSupported ? (RecommendedTopicObj) patchProxyResultProxy.result : new RecommendedTopicObj(str, str2, str3, str4, str5);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14569, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendedTopicObj)) {
            return false;
        }
        RecommendedTopicObj recommendedTopicObj = (RecommendedTopicObj) obj;
        return f0.g(this.itemType, recommendedTopicObj.itemType) && f0.g(this.name, recommendedTopicObj.name) && f0.g(this.topicId, recommendedTopicObj.topicId) && f0.g(this.picUrl, recommendedTopicObj.picUrl) && f0.g(this.recSrc, recommendedTopicObj.recSrc);
    }

    @e
    public final String getItemType() {
        return this.itemType;
    }

    @e
    public final String getName() {
        return this.name;
    }

    @e
    public final String getPicUrl() {
        return this.picUrl;
    }

    @e
    public final String getRecSrc() {
        return this.recSrc;
    }

    @e
    public final String getTopicId() {
        return this.topicId;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14568, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.itemType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.topicId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.picUrl;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.recSrc;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final boolean isHashtag() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14562, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return f0.g(this.itemType, "hashtag") && !c.u(this.name);
    }

    public final boolean isTopic() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14561, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return f0.g(this.itemType, "topic") && !c.u(this.topicId);
    }

    @e
    public final HashtagObj toBBSHashtagObj() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14564, new Class[0], HashtagObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (HashtagObj) patchProxyResultProxy.result;
        }
        if (!isHashtag() || c.u(this.name)) {
            return null;
        }
        HashtagObj hashtagObj = new HashtagObj();
        hashtagObj.setName(this.name);
        return hashtagObj;
    }

    @e
    public final BBSTopicObj toBBSTopicObj() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14563, new Class[0], BBSTopicObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (BBSTopicObj) patchProxyResultProxy.result;
        }
        if (!isTopic() || c.u(this.topicId)) {
            return null;
        }
        BBSTopicObj bBSTopicObj = new BBSTopicObj();
        bBSTopicObj.setTopic_id(this.topicId);
        bBSTopicObj.setPic_url(this.picUrl);
        bBSTopicObj.setName(this.name);
        return bBSTopicObj;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14567, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "RecommendedTopicObj(itemType=" + this.itemType + ", name=" + this.name + ", topicId=" + this.topicId + ", picUrl=" + this.picUrl + ", recSrc=" + this.recSrc + ')';
    }
}
