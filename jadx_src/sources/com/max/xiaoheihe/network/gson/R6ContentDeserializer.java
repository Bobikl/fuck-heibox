package com.max.xiaoheihe.network.gson;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.max.hbutils.utils.k;
import com.max.xiaoheihe.bean.account.ActivityObj;
import com.max.xiaoheihe.bean.game.r6.R6ContentFriendObj;
import com.max.xiaoheihe.bean.game.r6.R6ContentMapObj;
import com.max.xiaoheihe.bean.game.r6.R6ContentMatchObj;
import com.max.xiaoheihe.bean.game.r6.R6ContentMenuObj;
import com.max.xiaoheihe.bean.game.r6.R6ContentModeObj;
import com.max.xiaoheihe.bean.game.r6.R6ContentObj;
import com.max.xiaoheihe.bean.game.r6.R6ContentOperatorObj;
import com.max.xiaoheihe.bean.game.r6.R6ContentTrendObj;
import com.max.xiaoheihe.bean.game.r6.R6ContentWeaponObj;
import com.max.xiaoheihe.module.game.adapter.recommend.GameRecommendAdapter;
import com.max.xiaoheihe.module.littleprogram.fragment.pubg.PUBGCommonContainerFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.reflect.Type;
import java.util.Iterator;

/* JADX INFO: loaded from: classes12.dex */
public class R6ContentDeserializer implements JsonDeserializer<R6ContentObj> {
    public static ChangeQuickRedirect changeQuickRedirect;

    public R6ContentObj a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jsonElement, type, jsonDeserializationContext}, this, changeQuickRedirect, false, 47696, new Class[]{JsonElement.class, Type.class, JsonDeserializationContext.class}, R6ContentObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (R6ContentObj) patchProxyResultProxy.result;
        }
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        JsonArray asJsonArray = asJsonObject.get("content").getAsJsonArray();
        String asString = asJsonObject.get("type").getAsString();
        R6ContentObj r6ContentObj = new R6ContentObj();
        r6ContentObj.setType(asString);
        JsonElement jsonElement2 = asJsonObject.get("title");
        if (jsonElement2 != null) {
            r6ContentObj.setTitle(jsonElement2.getAsString());
        }
        if (asJsonArray != null && asJsonArray.size() > 0) {
            Iterator<JsonElement> it = asJsonArray.iterator();
            while (it.hasNext()) {
                JsonObject asJsonObject2 = it.next().getAsJsonObject();
                if (GameRecommendAdapter.f85958h.equals(asString)) {
                    r6ContentObj.getContent().add((R6ContentMenuObj) k.a(asJsonObject2.toString(), R6ContentMenuObj.class));
                } else if (PUBGCommonContainerFragment.f89169x.equals(asString)) {
                    r6ContentObj.getContent().add((R6ContentMatchObj) k.a(asJsonObject2.toString(), R6ContentMatchObj.class));
                } else if ("operators".equals(asString)) {
                    r6ContentObj.getContent().add((R6ContentOperatorObj) k.a(asJsonObject2.toString(), R6ContentOperatorObj.class));
                } else if ("activities".equals(asString)) {
                    r6ContentObj.getContent().add((ActivityObj) k.a(asJsonObject2.toString(), ActivityObj.class));
                } else if ("weapons".equals(asString)) {
                    r6ContentObj.getContent().add((R6ContentWeaponObj) k.a(asJsonObject2.toString(), R6ContentWeaponObj.class));
                } else if ("modes".equals(asString)) {
                    r6ContentObj.getContent().add((R6ContentModeObj) k.a(asJsonObject2.toString(), R6ContentModeObj.class));
                } else if ("friends".equals(asString)) {
                    r6ContentObj.getContent().add((R6ContentFriendObj) k.a(asJsonObject2.toString(), R6ContentFriendObj.class));
                } else if ("trend".equals(asString)) {
                    r6ContentObj.getContent().add((R6ContentTrendObj) k.a(asJsonObject2.toString(), R6ContentTrendObj.class));
                } else if ("maps".equals(asString)) {
                    r6ContentObj.getContent().add((R6ContentMapObj) k.a(asJsonObject2.toString(), R6ContentMapObj.class));
                }
            }
        }
        return r6ContentObj;
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [com.max.xiaoheihe.bean.game.r6.R6ContentObj, java.lang.Object] */
    @Override // com.google.gson.JsonDeserializer
    public /* bridge */ /* synthetic */ R6ContentObj deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jsonElement, type, jsonDeserializationContext}, this, changeQuickRedirect, false, 47697, new Class[]{JsonElement.class, Type.class, JsonDeserializationContext.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(jsonElement, type, jsonDeserializationContext);
    }
}
