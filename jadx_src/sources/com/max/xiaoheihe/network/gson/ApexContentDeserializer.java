package com.max.xiaoheihe.network.gson;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.max.hbutils.utils.k;
import com.max.xiaoheihe.bean.game.apex.ApexContentActivityObj;
import com.max.xiaoheihe.bean.game.apex.ApexContentDescObj;
import com.max.xiaoheihe.bean.game.apex.ApexContentLegendObj;
import com.max.xiaoheihe.bean.game.apex.ApexContentLogObj;
import com.max.xiaoheihe.bean.game.apex.ApexContentMenuObj;
import com.max.xiaoheihe.bean.game.apex.ApexContentObj;
import com.max.xiaoheihe.module.game.adapter.recommend.GameRecommendAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.ss.bytertc.engine.utils.LogUtil;
import com.tencent.open.SocialConstants;
import java.lang.reflect.Type;
import java.util.Iterator;

/* JADX INFO: loaded from: classes12.dex */
public class ApexContentDeserializer implements JsonDeserializer<ApexContentObj> {
    public static ChangeQuickRedirect changeQuickRedirect;

    public ApexContentObj a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonArray asJsonArray;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jsonElement, type, jsonDeserializationContext}, this, changeQuickRedirect, false, 47673, new Class[]{JsonElement.class, Type.class, JsonDeserializationContext.class}, ApexContentObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (ApexContentObj) patchProxyResultProxy.result;
        }
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        String asString = asJsonObject.get("type").getAsString();
        ApexContentObj apexContentObj = new ApexContentObj();
        apexContentObj.setType(asString);
        JsonElement jsonElement2 = asJsonObject.get("title");
        if (jsonElement2 != null) {
            apexContentObj.setTitle(jsonElement2.getAsString());
        }
        if (asJsonObject.get("content") != null && (asJsonArray = asJsonObject.get("content").getAsJsonArray()) != null && asJsonArray.size() > 0) {
            Iterator<JsonElement> it = asJsonArray.iterator();
            while (it.hasNext()) {
                JsonObject asJsonObject2 = it.next().getAsJsonObject();
                if (GameRecommendAdapter.f85958h.equals(asString)) {
                    apexContentObj.getContent().add((ApexContentMenuObj) k.a(asJsonObject2.toString(), ApexContentMenuObj.class));
                } else if (LogUtil.DIR_TAIL.equals(asString)) {
                    apexContentObj.getContent().add((ApexContentLogObj) k.a(asJsonObject2.toString(), ApexContentLogObj.class));
                } else if ("legend".equals(asString)) {
                    apexContentObj.getContent().add((ApexContentLegendObj) k.a(asJsonObject2.toString(), ApexContentLegendObj.class));
                } else if (SocialConstants.PARAM_APP_DESC.equals(asString)) {
                    apexContentObj.getContent().add((ApexContentDescObj) k.a(asJsonObject2.toString(), ApexContentDescObj.class));
                } else if ("activities".equals(asString)) {
                    apexContentObj.getContent().add((ApexContentActivityObj) k.a(asJsonObject2.toString(), ApexContentActivityObj.class));
                }
            }
        }
        return apexContentObj;
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [com.max.xiaoheihe.bean.game.apex.ApexContentObj, java.lang.Object] */
    @Override // com.google.gson.JsonDeserializer
    public /* bridge */ /* synthetic */ ApexContentObj deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jsonElement, type, jsonDeserializationContext}, this, changeQuickRedirect, false, 47674, new Class[]{JsonElement.class, Type.class, JsonDeserializationContext.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(jsonElement, type, jsonDeserializationContext);
    }
}
