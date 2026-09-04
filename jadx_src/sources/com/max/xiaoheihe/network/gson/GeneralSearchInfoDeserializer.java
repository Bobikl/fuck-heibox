package com.max.xiaoheihe.network.gson;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.max.xiaoheihe.bean.GeneralSearchInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes12.dex */
public class GeneralSearchInfoDeserializer implements JsonDeserializer<GeneralSearchInfo> {
    public static ChangeQuickRedirect changeQuickRedirect;

    public GeneralSearchInfo a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jsonElement, type, jsonDeserializationContext}, this, changeQuickRedirect, false, 47687, new Class[]{JsonElement.class, Type.class, JsonDeserializationContext.class}, GeneralSearchInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (GeneralSearchInfo) patchProxyResultProxy.result;
        }
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        return new GeneralSearchInfo(asJsonObject.get("info") != null ? asJsonObject.get("info").getAsJsonObject().toString() : null, asJsonObject.get("type") != null ? asJsonObject.get("type").getAsString() : null, asJsonObject.get("report_id") != null ? asJsonObject.get("report_id").getAsString() : null);
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [com.max.xiaoheihe.bean.GeneralSearchInfo, java.lang.Object] */
    @Override // com.google.gson.JsonDeserializer
    public /* bridge */ /* synthetic */ GeneralSearchInfo deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jsonElement, type, jsonDeserializationContext}, this, changeQuickRedirect, false, 47688, new Class[]{JsonElement.class, Type.class, JsonDeserializationContext.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(jsonElement, type, jsonDeserializationContext);
    }
}
