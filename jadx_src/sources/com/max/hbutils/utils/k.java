package com.max.hbutils.utils;

import android.os.Build;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonReader;
import com.max.hbutils.bean.GsonTypeAdapterInfo;
import com.max.hbutils.bean.Result;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.Constants;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.function.Function;
import okhttp3.d0;

/* JADX INFO: compiled from: JsonUtils.java */
/* JADX INFO: loaded from: classes13.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Gson f73548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final JsonParser f73549b = new JsonParser();
    public static ChangeQuickRedirect changeQuickRedirect;

    public static <T> T a(String str, Class<T> cls) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, cls}, null, changeQuickRedirect, true, bb.c.k.dp, new Class[]{String.class, Class.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return (T) patchProxyResultProxy.result;
        }
        try {
            return (T) c().fromJson(str, (Class) cls);
        } catch (Throwable th2) {
            com.max.heybox.hblog.g.G("JsonUtils deserialize error " + th2.getMessage());
            return null;
        }
    }

    public static <T> List<T> b(String str, Class<T> cls) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, cls}, null, changeQuickRedirect, true, bb.c.k.kp, new Class[]{String.class, Class.class}, List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        Gson gsonC = c();
        ArrayList arrayList = null;
        if (str != null && str.startsWith(Constants.ARRAY_TYPE) && str.endsWith("]")) {
            arrayList = new ArrayList();
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            jsonReader.setLenient(true);
            Iterator<JsonElement> it = new JsonParser().parse(jsonReader).getAsJsonArray().iterator();
            while (it.hasNext()) {
                arrayList.add(gsonC.fromJson(it.next(), (Class) cls));
            }
        }
        return arrayList;
    }

    public static Gson c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.k.cp, new Class[0], Gson.class);
        if (patchProxyResultProxy.isSupported) {
            return (Gson) patchProxyResultProxy.result;
        }
        if (f73548a == null) {
            GsonBuilder gsonBuilder = new GsonBuilder();
            try {
                for (ud.a aVar : ServiceLoader.load(ud.a.class)) {
                    if (aVar.a() != null && aVar.a().size() > 0) {
                        for (GsonTypeAdapterInfo gsonTypeAdapterInfo : aVar.a()) {
                            gsonBuilder.registerTypeAdapter(gsonTypeAdapterInfo.getType(), gsonTypeAdapterInfo.getTypeAdapter());
                        }
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            gsonBuilder.registerTypeAdapterFactory(new IgnoreFailureTypeAdapterFactory());
            f73548a = gsonBuilder.create();
        }
        return f73548a;
    }

    public static String d(JsonObject jsonObject, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jsonObject, str}, null, changeQuickRedirect, true, bb.c.k.gp, new Class[]{JsonObject.class, String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        JsonElement jsonElement = jsonObject.get(str);
        if (jsonElement != null) {
            return jsonElement.getAsString();
        }
        return null;
    }

    public static String e(String str, String str2) {
        JsonElement jsonElement;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, bb.c.k.jp, new Class[]{String.class, String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        try {
            if (TextUtils.isEmpty(str) || (jsonElement = ((JsonObject) new Gson().fromJson(str, JsonObject.class)).get(str2)) == null) {
                return "";
            }
            return jsonElement.isJsonObject() ? jsonElement.getAsJsonObject().toString() : jsonElement.getAsString();
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static boolean f(Object obj, Object obj2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, bb.c.k.mp, new Class[]{Object.class, Object.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : g(p(obj), p(obj2));
    }

    public static boolean g(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, bb.c.k.np, new Class[]{String.class, String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (str == null) {
            return str2 == null;
        }
        if (str.equals(str2)) {
            return true;
        }
        JsonParser jsonParser = f73549b;
        JsonElement jsonElement = jsonParser.parse(str);
        JsonElement jsonElement2 = jsonParser.parse(str2);
        if (f73548a.toJson(jsonElement).equals(f73548a.toJson(jsonElement2))) {
            return true;
        }
        return l(jsonElement, jsonElement2);
    }

    public static JsonObject h(JsonObject... jsonObjectArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jsonObjectArr}, null, changeQuickRedirect, true, bb.c.k.tp, new Class[]{JsonObject[].class}, JsonObject.class);
        if (patchProxyResultProxy.isSupported) {
            return (JsonObject) patchProxyResultProxy.result;
        }
        JsonObject jsonObject = new JsonObject();
        for (JsonObject jsonObject2 : jsonObjectArr) {
            if (jsonObject2 != null) {
                for (Map.Entry<String, JsonElement> entry : jsonObject2.entrySet()) {
                    jsonObject.add(entry.getKey(), entry.getValue());
                }
            }
        }
        return jsonObject;
    }

    public static <T> Result<List<T>> i(d0 d0Var, Class<T> cls) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{d0Var, cls}, null, changeQuickRedirect, true, bb.c.k.ip, new Class[]{d0.class, Class.class}, Result.class);
        if (patchProxyResultProxy.isSupported) {
            return (Result) patchProxyResultProxy.result;
        }
        Gson gsonC = c();
        return (Result) gsonC.fromJson(gsonC.newJsonReader(d0Var.charStream()), new d(new Type[]{new d(new Class[]{cls}, null, List.class)}, null, Result.class));
    }

    public static <T> Result<T> j(d0 d0Var, Class<T> cls) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{d0Var, cls}, null, changeQuickRedirect, true, bb.c.k.hp, new Class[]{d0.class, Class.class}, Result.class);
        if (patchProxyResultProxy.isSupported) {
            return (Result) patchProxyResultProxy.result;
        }
        Gson gsonC = c();
        return (Result) gsonC.fromJson(gsonC.newJsonReader(d0Var.charStream()), new d(new Class[]{cls}, null, Result.class));
    }

    private static boolean k(JsonArray jsonArray, JsonArray jsonArray2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jsonArray, jsonArray2}, null, changeQuickRedirect, true, bb.c.k.qp, new Class[]{JsonArray.class, JsonArray.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (jsonArray.size() != jsonArray2.size()) {
            return false;
        }
        List<JsonElement> listS = s(jsonArray);
        List<JsonElement> listS2 = s(jsonArray2);
        for (int i10 = 0; i10 < listS.size(); i10++) {
            if (!l(listS.get(i10), listS2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    private static boolean l(JsonElement jsonElement, JsonElement jsonElement2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jsonElement, jsonElement2}, null, changeQuickRedirect, true, bb.c.k.op, new Class[]{JsonElement.class, JsonElement.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (jsonElement.isJsonObject() && jsonElement2.isJsonObject()) {
            return n((JsonObject) jsonElement, (JsonObject) jsonElement2);
        }
        if (jsonElement.isJsonArray() && jsonElement2.isJsonArray()) {
            return k((JsonArray) jsonElement, (JsonArray) jsonElement2);
        }
        if (jsonElement.isJsonPrimitive() && jsonElement2.isJsonPrimitive()) {
            return o((JsonPrimitive) jsonElement, (JsonPrimitive) jsonElement2);
        }
        if (jsonElement.isJsonNull() && jsonElement2.isJsonNull()) {
            return m((JsonNull) jsonElement, (JsonNull) jsonElement2);
        }
        return false;
    }

    private static boolean m(JsonNull jsonNull, JsonNull jsonNull2) {
        return true;
    }

    private static boolean n(JsonObject jsonObject, JsonObject jsonObject2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jsonObject, jsonObject2}, null, changeQuickRedirect, true, bb.c.k.pp, new Class[]{JsonObject.class, JsonObject.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        Set<String> setKeySet = jsonObject.keySet();
        if (!setKeySet.equals(jsonObject2.keySet())) {
            return false;
        }
        for (String str : setKeySet) {
            if (!l(jsonObject.get(str), jsonObject2.get(str))) {
                return false;
            }
        }
        return true;
    }

    private static boolean o(JsonPrimitive jsonPrimitive, JsonPrimitive jsonPrimitive2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jsonPrimitive, jsonPrimitive2}, null, changeQuickRedirect, true, bb.c.k.rp, new Class[]{JsonPrimitive.class, JsonPrimitive.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : jsonPrimitive.equals(jsonPrimitive2);
    }

    public static <T> String p(T t10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{t10}, null, changeQuickRedirect, true, bb.c.k.ep, new Class[]{Object.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        try {
            return c().toJson(t10);
        } catch (Throwable th2) {
            com.max.heybox.hblog.g.G("JsonUtils serialize error " + th2.getMessage());
            return null;
        }
    }

    public static <T> String q(T t10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{t10}, null, changeQuickRedirect, true, bb.c.k.fp, new Class[]{Object.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : new GsonBuilder().disableHtmlEscaping().create().toJson(t10);
    }

    public static <T> String r(List<T> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, null, changeQuickRedirect, true, bb.c.k.lp, new Class[]{List.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (list == null) {
            return null;
        }
        int size = list.size();
        String str = Constants.ARRAY_TYPE;
        for (int i10 = 0; i10 < size; i10++) {
            String strP = p(list.get(i10));
            str = i10 == size - 1 ? str + strP : str + strP + com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP;
        }
        return str + "]";
    }

    private static List<JsonElement> s(JsonArray jsonArray) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jsonArray}, null, changeQuickRedirect, true, bb.c.k.sp, new Class[]{JsonArray.class}, List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<JsonElement> it = jsonArray.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        if (Build.VERSION.SDK_INT >= 24) {
            final Gson gson = f73548a;
            Objects.requireNonNull(gson);
            arrayList.sort(Comparator.comparing(new Function() { // from class: com.max.hbutils.utils.j
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return gson.toJson((JsonElement) obj);
                }
            }));
        }
        return arrayList;
    }
}
