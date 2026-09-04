package com.max.xiaoheihe.network.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.max.hbutils.bean.GsonTypeAdapterInfo;
import com.max.hbutils.utils.IgnoreFailureTypeAdapterFactory;
import com.max.heybox.hblog.g;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.reflect.Type;
import java.util.ServiceLoader;
import ud.a;

/* JADX INFO: loaded from: classes12.dex */
public class BBSLinkDeserializer implements JsonDeserializer<BBSLinkObj> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Gson f94848a;
    public static ChangeQuickRedirect changeQuickRedirect;

    public BBSLinkObj a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jsonElement, type, jsonDeserializationContext}, this, changeQuickRedirect, false, 47675, new Class[]{JsonElement.class, Type.class, JsonDeserializationContext.class}, BBSLinkObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (BBSLinkObj) patchProxyResultProxy.result;
        }
        if (f94848a == null) {
            GsonBuilder gsonBuilder = new GsonBuilder();
            try {
                for (a aVar : ServiceLoader.load(a.class)) {
                    if (aVar.a() != null && aVar.a().size() > 0) {
                        for (GsonTypeAdapterInfo gsonTypeAdapterInfo : aVar.a()) {
                            if (!(gsonTypeAdapterInfo.getTypeAdapter() instanceof BBSLinkDeserializer)) {
                                gsonBuilder.registerTypeAdapter(gsonTypeAdapterInfo.getType(), gsonTypeAdapterInfo.getTypeAdapter());
                            }
                        }
                    }
                }
            } catch (Exception e10) {
                g.G("BBSLinkDeserializer deserializeError: " + e10.getMessage());
            }
            gsonBuilder.registerTypeAdapterFactory(new IgnoreFailureTypeAdapterFactory());
            f94848a = gsonBuilder.create();
        }
        BBSLinkObj bBSLinkObj = (BBSLinkObj) f94848a.fromJson(jsonElement, BBSLinkObj.class);
        bBSLinkObj.setCustom_origin_gson_str(jsonElement.toString());
        return bBSLinkObj;
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [com.max.xiaoheihe.bean.bbs.BBSLinkObj, java.lang.Object] */
    @Override // com.google.gson.JsonDeserializer
    public /* bridge */ /* synthetic */ BBSLinkObj deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jsonElement, type, jsonDeserializationContext}, this, changeQuickRedirect, false, 47676, new Class[]{JsonElement.class, Type.class, JsonDeserializationContext.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(jsonElement, type, jsonDeserializationContext);
    }
}
