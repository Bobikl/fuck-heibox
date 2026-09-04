package com.max.xiaoheihe.network.gson;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.max.hbutils.utils.k;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.max.xiaoheihe.bean.bbs.HashtagObj;
import com.max.xiaoheihe.bean.bbs.TopicHashtagWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes12.dex */
public class TopicHashtagDeserializer implements JsonDeserializer<TopicHashtagWrapper> {
    public static ChangeQuickRedirect changeQuickRedirect;

    public TopicHashtagWrapper a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jsonElement, type, jsonDeserializationContext}, this, changeQuickRedirect, false, 47698, new Class[]{JsonElement.class, Type.class, JsonDeserializationContext.class}, TopicHashtagWrapper.class);
        if (patchProxyResultProxy.isSupported) {
            return (TopicHashtagWrapper) patchProxyResultProxy.result;
        }
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        return "hashtag".equals(asJsonObject.get("search_type") != null ? asJsonObject.get("search_type").getAsString() : null) ? new TopicHashtagWrapper("hashtag", null, (HashtagObj) k.a(asJsonObject.toString(), HashtagObj.class)) : new TopicHashtagWrapper("topic", (BBSTopicObj) k.a(asJsonObject.toString(), BBSTopicObj.class), null);
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [com.max.xiaoheihe.bean.bbs.TopicHashtagWrapper, java.lang.Object] */
    @Override // com.google.gson.JsonDeserializer
    public /* bridge */ /* synthetic */ TopicHashtagWrapper deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jsonElement, type, jsonDeserializationContext}, this, changeQuickRedirect, false, 47699, new Class[]{JsonElement.class, Type.class, JsonDeserializationContext.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(jsonElement, type, jsonDeserializationContext);
    }
}
