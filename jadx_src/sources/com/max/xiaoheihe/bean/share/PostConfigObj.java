package com.max.xiaoheihe.bean.share;

import androidx.compose.runtime.internal.o;
import com.google.gson.JsonObject;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: ScreenShareInfoObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class PostConfigObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String default_content;

    @e
    private List<String> hashtags;

    @e
    private JsonObject image_extra;

    @e
    private JsonObject post_extra_params;

    @e
    private Boolean post_now;

    @e
    private String post_success_js_callback;

    @e
    private String tips;

    @e
    private List<BBSTopicObj> topic_infos;

    public PostConfigObj(@e List<BBSTopicObj> list, @e Boolean bool, @e JsonObject jsonObject, @e String str, @e List<String> list2, @e JsonObject jsonObject2, @e String str2, @e String str3) {
        this.topic_infos = list;
        this.post_now = bool;
        this.image_extra = jsonObject;
        this.default_content = str;
        this.hashtags = list2;
        this.post_extra_params = jsonObject2;
        this.tips = str2;
        this.post_success_js_callback = str3;
    }

    public /* synthetic */ PostConfigObj(List list, Boolean bool, JsonObject jsonObject, String str, List list2, JsonObject jsonObject2, String str2, String str3, int i10, u uVar) {
        this(list, bool, jsonObject, str, list2, (i10 & 32) != 0 ? null : jsonObject2, str2, str3);
    }

    public static /* synthetic */ PostConfigObj copy$default(PostConfigObj postConfigObj, List list, Boolean bool, JsonObject jsonObject, String str, List list2, JsonObject jsonObject2, String str2, String str3, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{postConfigObj, list, bool, jsonObject, str, list2, jsonObject2, str2, str3, new Integer(i10), obj}, null, changeQuickRedirect, true, 15903, new Class[]{PostConfigObj.class, List.class, Boolean.class, JsonObject.class, String.class, List.class, JsonObject.class, String.class, String.class, Integer.TYPE, Object.class}, PostConfigObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PostConfigObj) patchProxyResultProxy.result;
        }
        return postConfigObj.copy((i10 & 1) != 0 ? postConfigObj.topic_infos : list, (i10 & 2) != 0 ? postConfigObj.post_now : bool, (i10 & 4) != 0 ? postConfigObj.image_extra : jsonObject, (i10 & 8) != 0 ? postConfigObj.default_content : str, (i10 & 16) != 0 ? postConfigObj.hashtags : list2, (i10 & 32) != 0 ? postConfigObj.post_extra_params : jsonObject2, (i10 & 64) != 0 ? postConfigObj.tips : str2, (i10 & 128) != 0 ? postConfigObj.post_success_js_callback : str3);
    }

    @e
    public final List<BBSTopicObj> component1() {
        return this.topic_infos;
    }

    @e
    public final Boolean component2() {
        return this.post_now;
    }

    @e
    public final JsonObject component3() {
        return this.image_extra;
    }

    @e
    public final String component4() {
        return this.default_content;
    }

    @e
    public final List<String> component5() {
        return this.hashtags;
    }

    @e
    public final JsonObject component6() {
        return this.post_extra_params;
    }

    @e
    public final String component7() {
        return this.tips;
    }

    @e
    public final String component8() {
        return this.post_success_js_callback;
    }

    @d
    public final PostConfigObj copy(@e List<BBSTopicObj> list, @e Boolean bool, @e JsonObject jsonObject, @e String str, @e List<String> list2, @e JsonObject jsonObject2, @e String str2, @e String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, bool, jsonObject, str, list2, jsonObject2, str2, str3}, this, changeQuickRedirect, false, 15902, new Class[]{List.class, Boolean.class, JsonObject.class, String.class, List.class, JsonObject.class, String.class, String.class}, PostConfigObj.class);
        return patchProxyResultProxy.isSupported ? (PostConfigObj) patchProxyResultProxy.result : new PostConfigObj(list, bool, jsonObject, str, list2, jsonObject2, str2, str3);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15906, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostConfigObj)) {
            return false;
        }
        PostConfigObj postConfigObj = (PostConfigObj) obj;
        return f0.g(this.topic_infos, postConfigObj.topic_infos) && f0.g(this.post_now, postConfigObj.post_now) && f0.g(this.image_extra, postConfigObj.image_extra) && f0.g(this.default_content, postConfigObj.default_content) && f0.g(this.hashtags, postConfigObj.hashtags) && f0.g(this.post_extra_params, postConfigObj.post_extra_params) && f0.g(this.tips, postConfigObj.tips) && f0.g(this.post_success_js_callback, postConfigObj.post_success_js_callback);
    }

    @e
    public final String getDefault_content() {
        return this.default_content;
    }

    @e
    public final List<String> getHashtags() {
        return this.hashtags;
    }

    @e
    public final JsonObject getImage_extra() {
        return this.image_extra;
    }

    @e
    public final JsonObject getPost_extra_params() {
        return this.post_extra_params;
    }

    @e
    public final Boolean getPost_now() {
        return this.post_now;
    }

    @e
    public final String getPost_success_js_callback() {
        return this.post_success_js_callback;
    }

    @e
    public final String getTips() {
        return this.tips;
    }

    @e
    public final List<BBSTopicObj> getTopic_infos() {
        return this.topic_infos;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15905, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<BBSTopicObj> list = this.topic_infos;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.post_now;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        JsonObject jsonObject = this.image_extra;
        int iHashCode3 = (iHashCode2 + (jsonObject == null ? 0 : jsonObject.hashCode())) * 31;
        String str = this.default_content;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list2 = this.hashtags;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        JsonObject jsonObject2 = this.post_extra_params;
        int iHashCode6 = (iHashCode5 + (jsonObject2 == null ? 0 : jsonObject2.hashCode())) * 31;
        String str2 = this.tips;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.post_success_js_callback;
        return iHashCode7 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setDefault_content(@e String str) {
        this.default_content = str;
    }

    public final void setHashtags(@e List<String> list) {
        this.hashtags = list;
    }

    public final void setImage_extra(@e JsonObject jsonObject) {
        this.image_extra = jsonObject;
    }

    public final void setPost_extra_params(@e JsonObject jsonObject) {
        this.post_extra_params = jsonObject;
    }

    public final void setPost_now(@e Boolean bool) {
        this.post_now = bool;
    }

    public final void setPost_success_js_callback(@e String str) {
        this.post_success_js_callback = str;
    }

    public final void setTips(@e String str) {
        this.tips = str;
    }

    public final void setTopic_infos(@e List<BBSTopicObj> list) {
        this.topic_infos = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15904, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "PostConfigObj(topic_infos=" + this.topic_infos + ", post_now=" + this.post_now + ", image_extra=" + this.image_extra + ", default_content=" + this.default_content + ", hashtags=" + this.hashtags + ", post_extra_params=" + this.post_extra_params + ", tips=" + this.tips + ", post_success_js_callback=" + this.post_success_js_callback + ')';
    }
}
