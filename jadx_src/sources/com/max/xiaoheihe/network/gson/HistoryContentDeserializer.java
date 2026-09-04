package com.max.xiaoheihe.network.gson;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.max.hbcommon.utils.c;
import com.max.hbutils.utils.k;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.bbs.WikiArticelObj;
import com.max.xiaoheihe.bean.favour.HistoryContentObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes12.dex */
public class HistoryContentDeserializer implements JsonDeserializer<HistoryContentObj> {
    public static ChangeQuickRedirect changeQuickRedirect;

    public HistoryContentObj a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jsonElement, type, jsonDeserializationContext}, this, changeQuickRedirect, false, 47692, new Class[]{JsonElement.class, Type.class, JsonDeserializationContext.class}, HistoryContentObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (HistoryContentObj) patchProxyResultProxy.result;
        }
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        if (asJsonObject.has("wrapper_type")) {
            String asString = asJsonObject.get("wrapper_type").getAsString();
            HistoryContentObj historyContentObj = new HistoryContentObj();
            historyContentObj.setWrapper_type(asString);
            return historyContentObj;
        }
        String asString2 = asJsonObject.get("type").getAsString();
        HistoryContentObj historyContentObj2 = new HistoryContentObj();
        historyContentObj2.setType(asString2);
        JsonElement jsonElement2 = asJsonObject.get("timestamp");
        if (jsonElement2 != null) {
            historyContentObj2.setTimestamp(jsonElement2.getAsString());
        }
        JsonElement jsonElement3 = asJsonObject.get("id");
        if (jsonElement3 != null) {
            historyContentObj2.setId(jsonElement3.getAsString());
        }
        JsonElement jsonElement4 = asJsonObject.get("tag_text");
        if (jsonElement4 != null) {
            historyContentObj2.setTag_text(jsonElement4.getAsString());
        }
        JsonElement jsonElement5 = asJsonObject.get("tag_start_color");
        if (jsonElement5 != null) {
            historyContentObj2.setTag_start_color(jsonElement5.getAsString());
        }
        JsonElement jsonElement6 = asJsonObject.get("tag_end_color");
        if (jsonElement6 != null) {
            historyContentObj2.setTag_end_color(jsonElement6.getAsString());
        }
        if (asJsonObject.get("content") == null) {
            return historyContentObj2;
        }
        JsonObject asJsonObject2 = asJsonObject.get("content").getAsJsonObject();
        String strE = k.e(asJsonObject2.toString(), "is_invalid");
        if (!c.u(strE)) {
            historyContentObj2.setIs_invalid(strE);
        }
        if ("link".equals(asString2)) {
            historyContentObj2.setContent((BBSLinkObj) k.a(asJsonObject2.toString(), BBSLinkObj.class));
        } else if ("game".equals(asString2)) {
            historyContentObj2.setContent((GameObj) k.a(asJsonObject2.toString(), GameObj.class));
        } else if ("wiki_article".equals(asString2)) {
            historyContentObj2.setContent((WikiArticelObj) k.a(asJsonObject2.toString(), WikiArticelObj.class));
        }
        return historyContentObj2;
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [com.max.xiaoheihe.bean.favour.HistoryContentObj, java.lang.Object] */
    @Override // com.google.gson.JsonDeserializer
    public /* bridge */ /* synthetic */ HistoryContentObj deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jsonElement, type, jsonDeserializationContext}, this, changeQuickRedirect, false, 47693, new Class[]{JsonElement.class, Type.class, JsonDeserializationContext.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(jsonElement, type, jsonDeserializationContext);
    }
}
