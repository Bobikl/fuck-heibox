package com.max.xiaoheihe.network.gson;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.max.hbutils.utils.k;
import com.max.xiaoheihe.bean.rich.BaseRichModelObj;
import com.max.xiaoheihe.bean.rich.RichAttributeModelObj;
import com.max.xiaoheihe.bean.rich.RichStackModelObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes12.dex */
public class BaseRichModelDeserializer implements JsonDeserializer<BaseRichModelObj> {
    public static ChangeQuickRedirect changeQuickRedirect;

    public BaseRichModelObj a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jsonElement, type, jsonDeserializationContext}, this, changeQuickRedirect, false, 47677, new Class[]{JsonElement.class, Type.class, JsonDeserializationContext.class}, BaseRichModelObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (BaseRichModelObj) patchProxyResultProxy.result;
        }
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        String asString = asJsonObject.get("type") != null ? asJsonObject.get("type").getAsString() : "";
        String string = asJsonObject.toString();
        return "stack".equals(asString) ? (BaseRichModelObj) k.a(string, RichStackModelObj.class) : (BaseRichModelObj) new Gson().fromJson(string, RichAttributeModelObj.class);
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [com.max.xiaoheihe.bean.rich.BaseRichModelObj, java.lang.Object] */
    @Override // com.google.gson.JsonDeserializer
    public /* bridge */ /* synthetic */ BaseRichModelObj deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jsonElement, type, jsonDeserializationContext}, this, changeQuickRedirect, false, 47678, new Class[]{JsonElement.class, Type.class, JsonDeserializationContext.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(jsonElement, type, jsonDeserializationContext);
    }
}
