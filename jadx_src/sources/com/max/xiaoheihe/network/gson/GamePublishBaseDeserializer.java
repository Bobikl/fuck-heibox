package com.max.xiaoheihe.network.gson;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.max.hbcommon.utils.c;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.bean.game.GamePublishBaseObj;
import com.max.xiaoheihe.bean.game.calendar.GameEventObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes12.dex */
public class GamePublishBaseDeserializer implements JsonDeserializer<GamePublishBaseObj> {
    public static ChangeQuickRedirect changeQuickRedirect;

    public GamePublishBaseObj a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jsonElement, type, jsonDeserializationContext}, this, changeQuickRedirect, false, 47683, new Class[]{JsonElement.class, Type.class, JsonDeserializationContext.class}, GamePublishBaseObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GamePublishBaseObj) patchProxyResultProxy.result;
        }
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        JsonElement jsonElement2 = asJsonObject.get("item_type");
        String asString = jsonElement2 != null ? jsonElement2.getAsString() : null;
        return (c.u(asString) || "0".equals(asString)) ? (GamePublishBaseObj) new Gson().fromJson(asJsonObject.toString(), GameObj.class) : (GamePublishBaseObj) new Gson().fromJson(asJsonObject.toString(), GameEventObj.class);
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [com.max.xiaoheihe.bean.game.GamePublishBaseObj, java.lang.Object] */
    @Override // com.google.gson.JsonDeserializer
    public /* bridge */ /* synthetic */ GamePublishBaseObj deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jsonElement, type, jsonDeserializationContext}, this, changeQuickRedirect, false, 47684, new Class[]{JsonElement.class, Type.class, JsonDeserializationContext.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(jsonElement, type, jsonDeserializationContext);
    }
}
