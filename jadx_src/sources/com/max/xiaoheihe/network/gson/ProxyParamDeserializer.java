package com.max.xiaoheihe.network.gson;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.max.xiaoheihe.bean.game.GameBindJsObj;
import com.max.xiaoheihe.bean.game.steamproxy.BaseProxyParamObj;
import com.max.xiaoheihe.bean.game.steamproxy.CSGOBindProxyParamObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes12.dex */
public class ProxyParamDeserializer implements JsonDeserializer<BaseProxyParamObj> {
    public static ChangeQuickRedirect changeQuickRedirect;

    public BaseProxyParamObj a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jsonElement, type, jsonDeserializationContext}, this, changeQuickRedirect, false, 47694, new Class[]{JsonElement.class, Type.class, JsonDeserializationContext.class}, BaseProxyParamObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (BaseProxyParamObj) patchProxyResultProxy.result;
        }
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        return asJsonObject.get(GameBindJsObj.KEY_BIND_CSGO) != null ? (BaseProxyParamObj) new Gson().fromJson(asJsonObject.toString(), CSGOBindProxyParamObj.class) : (BaseProxyParamObj) new Gson().fromJson(asJsonObject.toString(), BaseProxyParamObj.class);
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [com.max.xiaoheihe.bean.game.steamproxy.BaseProxyParamObj, java.lang.Object] */
    @Override // com.google.gson.JsonDeserializer
    public /* bridge */ /* synthetic */ BaseProxyParamObj deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jsonElement, type, jsonDeserializationContext}, this, changeQuickRedirect, false, 47695, new Class[]{JsonElement.class, Type.class, JsonDeserializationContext.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(jsonElement, type, jsonDeserializationContext);
    }
}
