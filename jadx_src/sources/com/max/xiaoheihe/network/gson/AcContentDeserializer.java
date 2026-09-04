package com.max.xiaoheihe.network.gson;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.max.hbutils.utils.k;
import com.max.xiaoheihe.bean.game.ac.AcContentMenuObj;
import com.max.xiaoheihe.bean.game.ac.AcContentObj;
import com.max.xiaoheihe.module.game.adapter.recommend.GameRecommendAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.reflect.Type;
import java.util.Iterator;

/* JADX INFO: loaded from: classes12.dex */
public class AcContentDeserializer implements JsonDeserializer<AcContentObj> {
    public static ChangeQuickRedirect changeQuickRedirect;

    public AcContentObj a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jsonElement, type, jsonDeserializationContext}, this, changeQuickRedirect, false, 47671, new Class[]{JsonElement.class, Type.class, JsonDeserializationContext.class}, AcContentObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (AcContentObj) patchProxyResultProxy.result;
        }
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        JsonArray asJsonArray = asJsonObject.get("content").getAsJsonArray();
        String asString = asJsonObject.get("type").getAsString();
        AcContentObj acContentObj = new AcContentObj();
        acContentObj.setType(asString);
        JsonElement jsonElement2 = asJsonObject.get("title");
        if (jsonElement2 != null) {
            acContentObj.setTitle(jsonElement2.getAsString());
        }
        if (asJsonArray != null && asJsonArray.size() > 0) {
            Iterator<JsonElement> it = asJsonArray.iterator();
            while (it.hasNext()) {
                JsonObject asJsonObject2 = it.next().getAsJsonObject();
                if (GameRecommendAdapter.f85958h.equals(asString)) {
                    acContentObj.getContent().add((AcContentMenuObj) k.a(asJsonObject2.toString(), AcContentMenuObj.class));
                }
            }
        }
        return acContentObj;
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [com.max.xiaoheihe.bean.game.ac.AcContentObj, java.lang.Object] */
    @Override // com.google.gson.JsonDeserializer
    public /* bridge */ /* synthetic */ AcContentObj deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jsonElement, type, jsonDeserializationContext}, this, changeQuickRedirect, false, 47672, new Class[]{JsonElement.class, Type.class, JsonDeserializationContext.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(jsonElement, type, jsonDeserializationContext);
    }
}
