package com.max.hbutils.utils;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public class IgnoreFailureTypeAdapterFactory implements TypeAdapterFactory {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class a<T> extends TypeAdapter<T> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ TypeAdapter f73464a;

        a(TypeAdapter typeAdapter) {
            this.f73464a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public T read2(JsonReader jsonReader) throws IOException {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jsonReader}, this, changeQuickRedirect, false, bb.c.k.To, new Class[]{JsonReader.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return (T) patchProxyResultProxy.result;
            }
            try {
                return (T) this.f73464a.read2(jsonReader);
            } catch (Exception e10) {
                com.max.heybox.hblog.g.G("IgnoreFailureTypeAdapterFactory createCustomTypeAdapterError: " + e10.getMessage() + "    " + jsonReader.toString());
                jsonReader.skipValue();
                return null;
            }
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, T t10) throws IOException {
            if (PatchProxy.proxy(new Object[]{jsonWriter, t10}, this, changeQuickRedirect, false, bb.c.k.So, new Class[]{JsonWriter.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f73464a.write(jsonWriter, t10);
        }
    }

    private <T> TypeAdapter<T> a(TypeAdapter<T> typeAdapter) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{typeAdapter}, this, changeQuickRedirect, false, bb.c.k.Ro, new Class[]{TypeAdapter.class}, TypeAdapter.class);
        return patchProxyResultProxy.isSupported ? (TypeAdapter) patchProxyResultProxy.result : new a(typeAdapter);
    }

    @Override // com.google.gson.TypeAdapterFactory
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gson, typeToken}, this, changeQuickRedirect, false, bb.c.k.Qo, new Class[]{Gson.class, TypeToken.class}, TypeAdapter.class);
        return patchProxyResultProxy.isSupported ? (TypeAdapter) patchProxyResultProxy.result : a(gson.getDelegateAdapter(this, typeToken));
    }
}
