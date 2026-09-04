package com.max.xiaoheihe.network.gson;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.max.xiaoheihe.bean.WebProtocolObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes12.dex */
public class WebProtocolDeserializer implements JsonDeserializer<WebProtocolObj> {
    public static ChangeQuickRedirect changeQuickRedirect;

    public WebProtocolObj a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jsonElement, type, jsonDeserializationContext}, this, changeQuickRedirect, false, 47700, new Class[]{JsonElement.class, Type.class, JsonDeserializationContext.class}, WebProtocolObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (WebProtocolObj) patchProxyResultProxy.result;
        }
        WebProtocolObj webProtocolObj = (WebProtocolObj) new Gson().fromJson(jsonElement.toString(), WebProtocolObj.class);
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : asJsonObject.keySet()) {
            if (asJsonObject.get(str) instanceof JsonObject) {
                linkedHashMap.put(str, asJsonObject.get(str).getAsJsonObject().toString());
            } else if (asJsonObject.get(str) instanceof JsonArray) {
                linkedHashMap.put(str, asJsonObject.get(str).getAsJsonArray().toString());
            } else if (asJsonObject.get(str) instanceof JsonNull) {
                linkedHashMap.put(str, "");
            } else {
                linkedHashMap.put(str, asJsonObject.get(str).getAsString());
            }
        }
        webProtocolObj.setKvPair(linkedHashMap);
        return webProtocolObj;
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [com.max.xiaoheihe.bean.WebProtocolObj, java.lang.Object] */
    @Override // com.google.gson.JsonDeserializer
    public /* bridge */ /* synthetic */ WebProtocolObj deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jsonElement, type, jsonDeserializationContext}, this, changeQuickRedirect, false, 47701, new Class[]{JsonElement.class, Type.class, JsonDeserializationContext.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(jsonElement, type, jsonDeserializationContext);
    }
}
