package com.max.hbuikit.gson;

import bb.c;
import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.max.hbuikit.bean.UiKitViewObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.lang.reflect.Type;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: BaseUIKITDeserializer.kt */
/* JADX INFO: loaded from: classes13.dex */
public class BaseUIKITDeserializer implements JsonDeserializer<UiKitViewObj> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0084, code lost:
    
        if (r10.equals("text") == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f9, code lost:
    
        if (r10.equals(sd.b.f139387e) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00fc, code lost:
    
        r9 = com.max.hbutils.utils.k.a(r9, com.max.hbuikit.bean.UiKitTextObj.class);
        r10 = (com.max.hbuikit.bean.UiKitTextObj) r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0109, code lost:
    
        if (r10.getRender_info() != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x010c, code lost:
    
        r0 = sd.b.f139387e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x010d, code lost:
    
        r10.setType(r0);
        kotlin.jvm.internal.f0.m(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:?, code lost:
    
        return (com.max.hbuikit.bean.UiKitViewObj) r9;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @dl.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.max.hbuikit.bean.UiKitViewObj a(@dl.d com.google.gson.JsonElement r9, @dl.e java.lang.reflect.Type r10, @dl.e com.google.gson.JsonDeserializationContext r11) throws com.google.gson.JsonParseException {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.max.hbuikit.gson.BaseUIKITDeserializer.a(com.google.gson.JsonElement, java.lang.reflect.Type, com.google.gson.JsonDeserializationContext):com.max.hbuikit.bean.UiKitViewObj");
    }

    @d
    public UiKitViewObj b(@e String str, @d String jsonStr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, jsonStr}, this, changeQuickRedirect, false, c.k.vl, new Class[]{String.class, String.class}, UiKitViewObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (UiKitViewObj) patchProxyResultProxy.result;
        }
        f0.p(jsonStr, "jsonStr");
        Object objFromJson = new Gson().fromJson(jsonStr, (Class<Object>) UiKitViewObj.class);
        f0.o(objFromJson, "fromJson(...)");
        return (UiKitViewObj) objFromJson;
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [com.max.hbuikit.bean.UiKitViewObj, java.lang.Object] */
    @Override // com.google.gson.JsonDeserializer
    public /* bridge */ /* synthetic */ UiKitViewObj deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jsonElement, type, jsonDeserializationContext}, this, changeQuickRedirect, false, c.k.wl, new Class[]{JsonElement.class, Type.class, JsonDeserializationContext.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(jsonElement, type, jsonDeserializationContext);
    }
}
