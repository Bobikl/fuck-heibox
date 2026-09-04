package com.max.xiaoheihe.network.gson;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.max.hbcommon.bean.AdsBannerObj;
import com.max.xiaoheihe.bean.HeyBoxContentObj;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.bean.mall.MallProductObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes12.dex */
public class HeyBoxContentDeserializer implements JsonDeserializer<HeyBoxContentObj> {
    public static ChangeQuickRedirect changeQuickRedirect;

    public HeyBoxContentObj a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jsonElement, type, jsonDeserializationContext}, this, changeQuickRedirect, false, 47690, new Class[]{JsonElement.class, Type.class, JsonDeserializationContext.class}, HeyBoxContentObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (HeyBoxContentObj) patchProxyResultProxy.result;
        }
        HeyBoxContentObj heyBoxContentObj = new HeyBoxContentObj();
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        String asString = asJsonObject.get("type").getAsString();
        heyBoxContentObj.setType(asString);
        if (HeyBoxContentObj.TYPE_LINKING.equals(asString)) {
            heyBoxContentObj.setData((BBSLinkObj) new Gson().fromJson(asJsonObject.get("data"), BBSLinkObj.class));
        } else if ("game".equals(asString)) {
            heyBoxContentObj.setData((GameObj) new Gson().fromJson(asJsonObject.get("data"), GameObj.class));
        } else if ("banner".equals(asString)) {
            heyBoxContentObj.setData((AdsBannerObj) new Gson().fromJson(asJsonObject.get("data"), AdsBannerObj.class));
        } else if ("mall".equals(asString)) {
            heyBoxContentObj.setData((MallProductObj) new Gson().fromJson(asJsonObject.get("data"), MallProductObj.class));
        }
        return heyBoxContentObj;
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [com.max.xiaoheihe.bean.HeyBoxContentObj, java.lang.Object] */
    @Override // com.google.gson.JsonDeserializer
    public /* bridge */ /* synthetic */ HeyBoxContentObj deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jsonElement, type, jsonDeserializationContext}, this, changeQuickRedirect, false, 47691, new Class[]{JsonElement.class, Type.class, JsonDeserializationContext.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(jsonElement, type, jsonDeserializationContext);
    }
}
