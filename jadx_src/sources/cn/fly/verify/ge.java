package cn.fly.verify;

import com.meituan.robust.Constants;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class ge {

    public interface a {
        Object a();
    }

    /* JADX WARN: Type inference failed for: r9v11, types: [T, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v9, types: [T, java.util.Map] */
    private static <T> T a(Object obj, Class<T> cls, Type[] typeArr) throws Throwable {
        Field declaredField;
        Type type;
        Type type2;
        Object objA;
        Object objA2;
        Object objA3;
        int i10 = 0;
        if (cls.isPrimitive() || Number.class.isAssignableFrom(cls) || cls.equals(Character.class)) {
            if (cls.equals(Boolean.TYPE) || cls.equals(Boolean.class)) {
                return (T) Boolean.valueOf(ba.a("004kJflfiBh").equals(String.valueOf(obj)));
            }
            if (cls.equals(Character.TYPE) || cls.equals(Character.class)) {
                return (T) Character.valueOf(String.valueOf(obj).charAt(0));
            }
            if (cls.equals(Byte.TYPE) || cls.equals(Byte.class)) {
                return (T) Byte.valueOf(String.valueOf(obj));
            }
            if (cls.equals(Short.TYPE) || cls.equals(Short.class)) {
                return (T) Short.valueOf(String.valueOf(obj));
            }
            if (cls.equals(Integer.TYPE) || cls.equals(Integer.class)) {
                return (T) Integer.valueOf(String.valueOf(obj));
            }
            if (cls.equals(Long.TYPE) || cls.equals(Long.class)) {
                return (T) Long.valueOf(String.valueOf(obj));
            }
            return (cls.equals(Float.TYPE) || cls.equals(Float.class)) ? (T) Float.valueOf(String.valueOf(obj)) : (T) Double.valueOf(String.valueOf(obj));
        }
        if (a.class.isAssignableFrom(cls)) {
            try {
                return (T) gi.a(gi.a(cls.getName()), ba.a("0076ff4fi2fi hLijgh"), obj);
            } catch (Throwable unused) {
                return null;
            }
        }
        if (cls.equals(String.class) || cls.equals(Boolean.class)) {
            return obj;
        }
        if (cls.isEnum()) {
            return (T) Enum.valueOf(cls, String.valueOf(((HashMap) obj).get(ba.a("004hg$fifh"))));
        }
        if (cls.isArray()) {
            ArrayList arrayList = (ArrayList) obj;
            Class<?> componentType = cls.getComponentType();
            T t10 = (T) Array.newInstance(componentType, arrayList.size());
            int size = arrayList.size();
            while (i10 < size) {
                Array.set(t10, i10, a(arrayList.get(i10), componentType, null));
                i10++;
            }
            return t10;
        }
        if (Collection.class.isAssignableFrom(cls)) {
            ?? r10 = (T) ((Collection) cls.newInstance());
            Type type3 = (typeArr == null || typeArr.length <= 0) ? null : typeArr[0];
            ArrayList arrayList2 = (ArrayList) obj;
            int size2 = arrayList2.size();
            while (i10 < size2) {
                if (type3 != null && (type3 instanceof Class) && !type3.equals(Object.class)) {
                    objA3 = a(arrayList2.get(i10), (Class) type3, null);
                } else if (type3 == null || !(type3 instanceof ParameterizedType)) {
                    objA3 = arrayList2.get(i10);
                } else {
                    ParameterizedType parameterizedType = (ParameterizedType) type3;
                    objA3 = a(arrayList2.get(i10), (Class) parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
                }
                r10.add(objA3);
                i10++;
            }
            return r10;
        }
        if (!Map.class.isAssignableFrom(cls)) {
            ArrayList arrayList3 = new ArrayList();
            for (Class<T> superclass = cls; !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                arrayList3.add(superclass);
            }
            HashMap map = (HashMap) obj;
            HashMap map2 = new HashMap();
            for (String str : map.keySet()) {
                if (map.get(str) != null) {
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        try {
                            declaredField = ((Class) it.next()).getDeclaredField(str);
                        } catch (Throwable unused2) {
                            declaredField = null;
                        }
                        if (declaredField != null) {
                            map2.put(str, declaredField);
                            break;
                        }
                    }
                }
            }
            T t11 = (T) gi.a(gi.a((Class<?>) cls), new Object[0]);
            for (String str2 : map2.keySet()) {
                Object obj2 = map.get(str2);
                Field field = (Field) map2.get(str2);
                Class<?> type4 = field.getType();
                Type genericType = field.getGenericType();
                Type[] actualTypeArguments = genericType instanceof ParameterizedType ? ((ParameterizedType) genericType).getActualTypeArguments() : null;
                field.setAccessible(true);
                field.set(t11, a(obj2, type4, actualTypeArguments));
            }
            return t11;
        }
        ?? r11 = (T) ((Map) cls.newInstance());
        if (typeArr == null || typeArr.length <= 1) {
            type = null;
            type2 = null;
        } else {
            type2 = typeArr[0];
            type = typeArr[1];
        }
        HashMap map3 = (HashMap) obj;
        for (Object obj3 : map3.keySet()) {
            if (type2 != null && (type2 instanceof Class) && !type.equals(Object.class)) {
                objA = a(obj3, (Class) type2, null);
            } else if (type2 == null || !(type2 instanceof ParameterizedType)) {
                objA = obj3;
            } else {
                ParameterizedType parameterizedType2 = (ParameterizedType) type2;
                objA = a(obj3, (Class) parameterizedType2.getRawType(), parameterizedType2.getActualTypeArguments());
            }
            if (type != null && (type instanceof Class) && !type.equals(Object.class)) {
                objA2 = a(map3.get(obj3), (Class) type, null);
            } else if (type == null || !(type instanceof ParameterizedType)) {
                objA2 = map3.get(obj3);
            } else {
                ParameterizedType parameterizedType3 = (ParameterizedType) type;
                objA2 = a(map3.get(obj3), (Class) parameterizedType3.getRawType(), parameterizedType3.getActualTypeArguments());
            }
            r11.put(objA, objA2);
        }
        return r11;
    }

    public static <T> T a(String str, Class<T> cls) {
        HashMap mapA = a(str);
        Object obj = mapA;
        if (str.startsWith(Constants.ARRAY_TYPE) && str.endsWith("]")) {
            obj = mapA;
            obj = mapA.get(ba.a("008>gh(f-gjAhi$fkhkGk"));
        }
        obj = mapA;
        try {
            Type genericSuperclass = cls.getGenericSuperclass();
            return (T) a(obj, cls, genericSuperclass instanceof ParameterizedType ? ((ParameterizedType) genericSuperclass).getActualTypeArguments() : null);
        } catch (Throwable th2) {
            es.a().b(th2);
            return null;
        }
    }

    public static String a(Object obj) {
        Object objD;
        try {
            objD = d(obj);
        } catch (Throwable th2) {
            es.a().b(th2);
            objD = null;
        }
        if (objD == null) {
            return "";
        }
        if (!(objD instanceof ArrayList)) {
            return a((HashMap) objD);
        }
        HashMap map = new HashMap();
        map.put(ba.a("004iXfkhkGk"), objD);
        String strA = a(map);
        return strA.substring(8, strA.length() - 1).trim();
    }

    public static <T> String a(HashMap<String, T> map) {
        try {
            JSONObject jSONObjectB = b((HashMap) map);
            return jSONObjectB == null ? "" : jSONObjectB.toString();
        } catch (Throwable th2) {
            es.a().b(th2);
            return "";
        }
    }

    private static ArrayList<Object> a(JSONArray jSONArray) throws Throwable {
        ArrayList<Object> arrayList = new ArrayList<>();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            Object objOpt = jSONArray.opt(i10);
            if (objOpt instanceof JSONObject) {
                objOpt = a((JSONObject) objOpt);
            } else if (objOpt instanceof JSONArray) {
                objOpt = a((JSONArray) objOpt);
            }
            arrayList.add(objOpt);
        }
        return arrayList;
    }

    public static <T> HashMap<String, T> a(String str) {
        if (str == null || str.isEmpty()) {
            return new HashMap<>();
        }
        try {
            if (str.startsWith(Constants.ARRAY_TYPE) && str.endsWith("]")) {
                str = "{\"fakelist\":" + str + z5.g.f141884d;
            }
            return a(new JSONObject(str));
        } catch (Throwable th2) {
            es.a().b(str);
            es.a().b(th2);
            return new HashMap<>();
        }
    }

    private static <T> HashMap<String, T> a(JSONObject jSONObject) throws Throwable {
        gi.AnonymousClass2 anonymousClass2 = (HashMap<String, T>) new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if (JSONObject.NULL.equals(objOpt)) {
                objOpt = null;
            }
            if (objOpt != null) {
                if (objOpt instanceof JSONObject) {
                    objOpt = a((JSONObject) objOpt);
                } else if (objOpt instanceof JSONArray) {
                    objOpt = a((JSONArray) objOpt);
                }
                anonymousClass2.put(next, objOpt);
            }
        }
        return anonymousClass2;
    }

    private static JSONArray a(ArrayList<Object> arrayList) throws Throwable {
        JSONArray jSONArray = new JSONArray();
        for (Object objA : arrayList) {
            if (objA instanceof HashMap) {
                objA = b((HashMap) objA);
            } else if (objA instanceof ArrayList) {
                objA = a((ArrayList<Object>) objA);
            }
            jSONArray.put(objA);
        }
        return jSONArray;
    }

    private static <T> JSONObject b(HashMap<String, T> map) throws Throwable {
        ArrayList<?> arrayListC;
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, T> entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof HashMap) {
                value = b((HashMap) value);
            } else {
                if (value instanceof ArrayList) {
                    arrayListC = (ArrayList) value;
                } else if (b(value)) {
                    arrayListC = c(value);
                }
                value = a((ArrayList<Object>) arrayListC);
            }
            jSONObject.put(entry.getKey(), value);
        }
        return jSONObject;
    }

    private static boolean b(Object obj) {
        return (obj instanceof byte[]) || (obj instanceof short[]) || (obj instanceof int[]) || (obj instanceof long[]) || (obj instanceof float[]) || (obj instanceof double[]) || (obj instanceof char[]) || (obj instanceof boolean[]) || (obj instanceof String[]);
    }

    private static ArrayList<?> c(Object obj) {
        int i10 = 0;
        if (obj instanceof byte[]) {
            ArrayList<?> arrayList = new ArrayList<>();
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            while (i10 < length) {
                arrayList.add(Byte.valueOf(bArr[i10]));
                i10++;
            }
            return arrayList;
        }
        if (obj instanceof short[]) {
            ArrayList<?> arrayList2 = new ArrayList<>();
            short[] sArr = (short[]) obj;
            int length2 = sArr.length;
            while (i10 < length2) {
                arrayList2.add(Short.valueOf(sArr[i10]));
                i10++;
            }
            return arrayList2;
        }
        if (obj instanceof int[]) {
            ArrayList<?> arrayList3 = new ArrayList<>();
            int[] iArr = (int[]) obj;
            int length3 = iArr.length;
            while (i10 < length3) {
                arrayList3.add(Integer.valueOf(iArr[i10]));
                i10++;
            }
            return arrayList3;
        }
        if (obj instanceof long[]) {
            ArrayList<?> arrayList4 = new ArrayList<>();
            long[] jArr = (long[]) obj;
            int length4 = jArr.length;
            while (i10 < length4) {
                arrayList4.add(Long.valueOf(jArr[i10]));
                i10++;
            }
            return arrayList4;
        }
        if (obj instanceof float[]) {
            ArrayList<?> arrayList5 = new ArrayList<>();
            float[] fArr = (float[]) obj;
            int length5 = fArr.length;
            while (i10 < length5) {
                arrayList5.add(Float.valueOf(fArr[i10]));
                i10++;
            }
            return arrayList5;
        }
        if (obj instanceof double[]) {
            ArrayList<?> arrayList6 = new ArrayList<>();
            double[] dArr = (double[]) obj;
            int length6 = dArr.length;
            while (i10 < length6) {
                arrayList6.add(Double.valueOf(dArr[i10]));
                i10++;
            }
            return arrayList6;
        }
        if (obj instanceof char[]) {
            ArrayList<?> arrayList7 = new ArrayList<>();
            char[] cArr = (char[]) obj;
            int length7 = cArr.length;
            while (i10 < length7) {
                arrayList7.add(Character.valueOf(cArr[i10]));
                i10++;
            }
            return arrayList7;
        }
        if (!(obj instanceof boolean[])) {
            if (obj instanceof String[]) {
                return new ArrayList<>(Arrays.asList((String[]) obj));
            }
            return null;
        }
        ArrayList<?> arrayList8 = new ArrayList<>();
        boolean[] zArr = (boolean[]) obj;
        int length8 = zArr.length;
        while (i10 < length8) {
            arrayList8.add(Boolean.valueOf(zArr[i10]));
            i10++;
        }
        return arrayList8;
    }

    private static Object d(Object obj) throws Throwable {
        if (obj == null || obj.getClass().isPrimitive() || (obj instanceof String) || (obj instanceof Number) || (obj instanceof Character) || (obj instanceof Boolean)) {
            return obj;
        }
        if (obj instanceof a) {
            return d(((a) obj).a());
        }
        if (obj instanceof Enum) {
            HashMap map = new HashMap();
            map.put(ba.a("004hgPfifh"), ((Enum) obj).name());
            return map;
        }
        if (obj.getClass().isArray()) {
            ArrayList arrayList = new ArrayList();
            int length = Array.getLength(obj);
            for (int i10 = 0; i10 < length; i10++) {
                arrayList.add(d(Array.get(obj, i10)));
            }
            return arrayList;
        }
        if (obj instanceof Collection) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                arrayList2.add(d(it.next()));
            }
            return arrayList2;
        }
        if (obj instanceof Map) {
            HashMap map2 = new HashMap();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                if (key instanceof String) {
                    map2.put((String) key, d(entry.getValue()));
                }
            }
            return map2;
        }
        ArrayList arrayList3 = new ArrayList();
        for (Class<?> superclass = obj.getClass(); !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            arrayList3.add(0, superclass);
        }
        ArrayList<Field> arrayList4 = new ArrayList();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            for (Field field : ((Class) it2.next()).getDeclaredFields()) {
                if (!Modifier.isStatic(field.getModifiers()) && !field.getName().contains("$")) {
                    arrayList4.add(field);
                }
            }
        }
        HashMap map3 = new HashMap();
        for (Field field2 : arrayList4) {
            field2.setAccessible(true);
            map3.put(field2.getName(), d(field2.get(obj)));
        }
        return map3;
    }
}
