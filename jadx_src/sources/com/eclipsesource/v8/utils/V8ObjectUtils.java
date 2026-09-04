package com.eclipsesource.v8.utils;

import com.eclipsesource.v8.Releasable;
import com.eclipsesource.v8.V8;
import com.eclipsesource.v8.V8Array;
import com.eclipsesource.v8.V8ArrayBuffer;
import com.eclipsesource.v8.V8Object;
import com.eclipsesource.v8.V8TypedArray;
import com.eclipsesource.v8.V8Value;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class V8ObjectUtils {
    private static final Object IGNORE = new Object();
    private static final TypeAdapter DEFAULT_TYPE_ADAPTER = new DefaultTypeAdapter();

    public static class DefaultTypeAdapter implements TypeAdapter {
        DefaultTypeAdapter() {
        }

        @Override // com.eclipsesource.v8.utils.TypeAdapter
        public Object adapt(int i10, Object obj) {
            return TypeAdapter.DEFAULT;
        }
    }

    public static class ListWrapper {
        private List<? extends Object> list;

        public ListWrapper(List<? extends Object> list) {
            this.list = list;
        }

        public boolean equals(Object obj) {
            return (obj instanceof ListWrapper) && ((ListWrapper) obj).list == this.list;
        }

        public int hashCode() {
            return System.identityHashCode(this.list);
        }
    }

    private V8ObjectUtils() {
    }

    public static Object getTypedArray(V8Array v8Array, int i10) {
        int length = v8Array.length();
        if (i10 == 1) {
            return v8Array.getIntegers(0, length);
        }
        if (i10 == 2) {
            return v8Array.getDoubles(0, length);
        }
        if (i10 == 3) {
            return v8Array.getBooleans(0, length);
        }
        if (i10 == 4) {
            return v8Array.getStrings(0, length);
        }
        throw new RuntimeException("Unsupported bulk load type: " + i10);
    }

    public static Object getTypedArray(V8Array v8Array, int i10, Object obj) {
        int length = v8Array.length();
        if (i10 == 1) {
            int[] iArr = (int[]) obj;
            if (iArr == null || iArr.length < length) {
                iArr = new int[length];
            }
            v8Array.getIntegers(0, length, iArr);
            return iArr;
        }
        if (i10 == 2) {
            double[] dArr = (double[]) obj;
            if (dArr == null || dArr.length < length) {
                dArr = new double[length];
            }
            v8Array.getDoubles(0, length, dArr);
            return dArr;
        }
        if (i10 == 3) {
            boolean[] zArr = (boolean[]) obj;
            if (zArr == null || zArr.length < length) {
                zArr = new boolean[length];
            }
            v8Array.getBooleans(0, length, zArr);
            return zArr;
        }
        if (i10 == 4) {
            String[] strArr = (String[]) obj;
            if (strArr == null || strArr.length < length) {
                strArr = new String[length];
            }
            v8Array.getStrings(0, length, strArr);
            return strArr;
        }
        if (i10 != 9) {
            throw new RuntimeException("Unsupported bulk load type: " + i10);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr == null || bArr.length < length) {
            bArr = new byte[length];
        }
        v8Array.getBytes(0, length, bArr);
        return bArr;
    }

    public static Object getV8Result(V8 v10, Object obj) {
        if (obj == null) {
            return null;
        }
        Hashtable hashtable = new Hashtable();
        try {
            Object v8Result = getV8Result(v10, obj, hashtable);
            return v8Result instanceof V8Value ? ((V8Value) v8Result).twin() : v8Result;
        } finally {
            Iterator it = hashtable.values().iterator();
            while (it.hasNext()) {
                ((V8Value) it.next()).close();
            }
        }
    }

    private static Object getV8Result(V8 v10, Object obj, Map<Object, V8Value> map) {
        if (map.containsKey(obj)) {
            return map.get(obj);
        }
        if (obj instanceof Map) {
            return toV8Object(v10, (Map) obj, map);
        }
        if (obj instanceof List) {
            return toV8Array(v10, (List) obj, map);
        }
        if (obj instanceof TypedArray) {
            return toV8TypedArray(v10, (TypedArray) obj, map);
        }
        return obj instanceof ArrayBuffer ? toV8ArrayBuffer(v10, (ArrayBuffer) obj, map) : obj;
    }

    public static Object getValue(V8Array v8Array, int i10) throws Throwable {
        Object obj;
        V8Map v8Map = new V8Map();
        try {
            obj = v8Array.get(i10);
            try {
                Object value = getValue(obj, v8Array.getType(i10), v8Map, DEFAULT_TYPE_ADAPTER);
                if (value != obj || !(value instanceof V8Value)) {
                    if (obj instanceof Releasable) {
                        ((Releasable) obj).release();
                    }
                    v8Map.close();
                    return value;
                }
                V8Value v8ValueTwin = ((V8Value) value).twin();
                if (obj instanceof Releasable) {
                    ((Releasable) obj).release();
                }
                v8Map.close();
                return v8ValueTwin;
            } catch (Throwable th2) {
                th = th2;
                if (obj instanceof Releasable) {
                    ((Releasable) obj).release();
                }
                v8Map.close();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            obj = null;
        }
    }

    public static Object getValue(V8Array v8Array, int i10, TypeAdapter typeAdapter) throws Throwable {
        Object obj;
        V8Map v8Map = new V8Map();
        try {
            obj = v8Array.get(i10);
            try {
                Object value = getValue(obj, v8Array.getType(i10), v8Map, typeAdapter);
                if (value != obj || !(value instanceof V8Value)) {
                    if (obj instanceof Releasable) {
                        ((Releasable) obj).release();
                    }
                    v8Map.close();
                    return value;
                }
                V8Value v8ValueTwin = ((V8Value) value).twin();
                if (obj instanceof Releasable) {
                    ((Releasable) obj).release();
                }
                v8Map.close();
                return v8ValueTwin;
            } catch (Throwable th2) {
                th = th2;
                if (obj instanceof Releasable) {
                    ((Releasable) obj).release();
                }
                v8Map.close();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            obj = null;
        }
    }

    public static Object getValue(V8Object v8Object, String str) {
        return getValue(v8Object, str, DEFAULT_TYPE_ADAPTER);
    }

    public static Object getValue(V8Object v8Object, String str, TypeAdapter typeAdapter) throws Throwable {
        Object obj;
        V8Map v8Map = new V8Map();
        try {
            obj = v8Object.get(str);
            try {
                Object value = getValue(obj, v8Object.getType(str), v8Map, typeAdapter);
                if (value != obj || !(value instanceof V8Value)) {
                    if (obj instanceof Releasable) {
                        ((Releasable) obj).release();
                    }
                    v8Map.close();
                    return value;
                }
                V8Value v8ValueTwin = ((V8Value) value).twin();
                if (obj instanceof Releasable) {
                    ((Releasable) obj).release();
                }
                v8Map.close();
                return v8ValueTwin;
            } catch (Throwable th2) {
                th = th2;
                if (obj instanceof Releasable) {
                    ((Releasable) obj).release();
                }
                v8Map.close();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            obj = null;
        }
    }

    public static Object getValue(Object obj) {
        return getValue(obj, DEFAULT_TYPE_ADAPTER);
    }

    private static Object getValue(Object obj, int i10, V8Map<Object> v8Map, TypeAdapter typeAdapter) {
        Object objAdapt = typeAdapter.adapt(i10, obj);
        if (TypeAdapter.DEFAULT != objAdapt) {
            return objAdapt;
        }
        if (i10 == 10) {
            return new ArrayBuffer((V8ArrayBuffer) obj);
        }
        if (i10 == 99) {
            return V8.getUndefined();
        }
        switch (i10) {
            case 0:
                return null;
            case 1:
            case 2:
            case 3:
            case 4:
                return obj;
            case 5:
                return toList((V8Array) obj, v8Map, typeAdapter);
            case 6:
                return toMap((V8Object) obj, v8Map, typeAdapter);
            case 7:
                return IGNORE;
            case 8:
                return new TypedArray((V8TypedArray) obj);
            default:
                throw new IllegalStateException("Cannot convert type " + V8Value.getStringRepresentation(i10));
        }
    }

    public static Object getValue(Object obj, TypeAdapter typeAdapter) {
        V8Map v8Map = new V8Map();
        try {
            return obj instanceof V8Value ? getValue(obj, ((V8Value) obj).getV8Type(), v8Map, typeAdapter) : obj;
        } finally {
            v8Map.close();
        }
    }

    public static void pushValue(V8 v10, V8Array v8Array, Object obj) {
        Hashtable hashtable = new Hashtable();
        try {
            pushValue(v10, v8Array, obj, hashtable);
        } finally {
            Iterator it = hashtable.values().iterator();
            while (it.hasNext()) {
                ((V8Value) it.next()).close();
            }
        }
    }

    private static void pushValue(V8 v10, V8Array v8Array, Object obj, Map<Object, V8Value> map) {
        if (obj == null) {
            v8Array.pushUndefined();
            return;
        }
        if (obj instanceof Integer) {
            v8Array.push(obj);
            return;
        }
        if (obj instanceof Long) {
            v8Array.push(new Double(((Long) obj).longValue()));
            return;
        }
        if (obj instanceof Double) {
            v8Array.push(obj);
            return;
        }
        if (obj instanceof Float) {
            v8Array.push(obj);
            return;
        }
        if (obj instanceof String) {
            v8Array.push((String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            v8Array.push(obj);
            return;
        }
        if (obj instanceof TypedArray) {
            v8Array.push((V8Value) toV8TypedArray(v10, (TypedArray) obj, map));
            return;
        }
        if (obj instanceof ArrayBuffer) {
            v8Array.push((V8Value) toV8ArrayBuffer(v10, (ArrayBuffer) obj, map));
            return;
        }
        if (obj instanceof V8Value) {
            v8Array.push((V8Value) obj);
            return;
        }
        if (obj instanceof Map) {
            v8Array.push((V8Value) toV8Object(v10, (Map) obj, map));
        } else {
            if (obj instanceof List) {
                v8Array.push((V8Value) toV8Array(v10, (List) obj, map));
                return;
            }
            throw new IllegalStateException("Unsupported Object of type: " + obj.getClass());
        }
    }

    private static void setValue(V8 v10, V8Object v8Object, String str, Object obj, Map<Object, V8Value> map) {
        if (obj == null) {
            v8Object.addUndefined(str);
            return;
        }
        if (obj instanceof Integer) {
            v8Object.add(str, ((Integer) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            v8Object.add(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            v8Object.add(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Float) {
            v8Object.add(str, ((Float) obj).floatValue());
            return;
        }
        if (obj instanceof String) {
            v8Object.add(str, (String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            v8Object.add(str, ((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof TypedArray) {
            v8Object.add(str, toV8TypedArray(v10, (TypedArray) obj, map));
            return;
        }
        if (obj instanceof ArrayBuffer) {
            v8Object.add(str, toV8ArrayBuffer(v10, (ArrayBuffer) obj, map));
            return;
        }
        if (obj instanceof V8Value) {
            v8Object.add(str, (V8Value) obj);
            return;
        }
        if (obj instanceof Map) {
            v8Object.add(str, toV8Object(v10, (Map) obj, map));
        } else {
            if (obj instanceof List) {
                v8Object.add(str, toV8Array(v10, (List) obj, map));
                return;
            }
            throw new IllegalStateException("Unsupported Object of type: " + obj.getClass());
        }
    }

    public static List<? super Object> toList(V8Array v8Array) {
        return toList(v8Array, DEFAULT_TYPE_ADAPTER);
    }

    public static List<? super Object> toList(V8Array v8Array, TypeAdapter typeAdapter) {
        V8Map v8Map = new V8Map();
        try {
            return toList(v8Array, v8Map, typeAdapter);
        } finally {
            v8Map.close();
        }
    }

    private static List<? super Object> toList(V8Array v8Array, V8Map<Object> v8Map, TypeAdapter typeAdapter) {
        if (v8Array == null) {
            return Collections.emptyList();
        }
        if (v8Map.containsKey(v8Array)) {
            return (List) v8Map.get(v8Array);
        }
        ArrayList arrayList = new ArrayList();
        v8Map.put((V8Value) v8Array, arrayList);
        for (int i10 = 0; i10 < v8Array.length(); i10++) {
            Object obj = null;
            try {
                obj = v8Array.get(i10);
                Object value = getValue(obj, v8Array.getType(i10), v8Map, typeAdapter);
                if (value != IGNORE) {
                    arrayList.add(value);
                }
                if (obj instanceof Releasable) {
                    ((Releasable) obj).release();
                }
            } catch (Throwable th2) {
                if (obj instanceof Releasable) {
                    ((Releasable) obj).release();
                }
                throw th2;
            }
        }
        return arrayList;
    }

    public static Map<String, ? super Object> toMap(V8Object v8Object) {
        return toMap(v8Object, DEFAULT_TYPE_ADAPTER);
    }

    public static Map<String, ? super Object> toMap(V8Object v8Object, TypeAdapter typeAdapter) {
        V8Map v8Map = new V8Map();
        try {
            return toMap(v8Object, v8Map, typeAdapter);
        } finally {
            v8Map.close();
        }
    }

    private static Map<String, ? super Object> toMap(V8Object v8Object, V8Map<Object> v8Map, TypeAdapter typeAdapter) {
        if (v8Object == null) {
            return Collections.emptyMap();
        }
        if (v8Map.containsKey(v8Object)) {
            return (Map) v8Map.get(v8Object);
        }
        V8PropertyMap v8PropertyMap = new V8PropertyMap();
        v8Map.put((V8Value) v8Object, v8PropertyMap);
        for (String str : v8Object.getKeys()) {
            Object obj = null;
            try {
                obj = v8Object.get(str);
                Object value = getValue(obj, v8Object.getType(str), v8Map, typeAdapter);
                if (value != IGNORE) {
                    v8PropertyMap.put(str, value);
                }
                if (obj instanceof Releasable) {
                    ((Releasable) obj).release();
                }
            } catch (Throwable th2) {
                if (obj instanceof Releasable) {
                    ((Releasable) obj).release();
                }
                throw th2;
            }
        }
        return v8PropertyMap;
    }

    public static V8Array toV8Array(V8 v10, List<? extends Object> list) {
        Hashtable hashtable = new Hashtable();
        try {
            return toV8Array(v10, list, hashtable).twin();
        } finally {
            Iterator it = hashtable.values().iterator();
            while (it.hasNext()) {
                ((V8Value) it.next()).close();
            }
        }
    }

    private static V8Array toV8Array(V8 v10, List<? extends Object> list, Map<Object, V8Value> map) {
        if (map.containsKey(new ListWrapper(list))) {
            return (V8Array) map.get(new ListWrapper(list));
        }
        V8Array v8Array = new V8Array(v10);
        map.put(new ListWrapper(list), v8Array);
        for (int i10 = 0; i10 < list.size(); i10++) {
            try {
                pushValue(v10, v8Array, list.get(i10), map);
            } catch (IllegalStateException e10) {
                v8Array.close();
                throw e10;
            }
        }
        return v8Array;
    }

    private static V8ArrayBuffer toV8ArrayBuffer(V8 v10, ArrayBuffer arrayBuffer, Map<Object, V8Value> map) {
        if (map.containsKey(arrayBuffer)) {
            return (V8ArrayBuffer) map.get(arrayBuffer);
        }
        V8ArrayBuffer v8ArrayBuffer = arrayBuffer.getV8ArrayBuffer();
        map.put(arrayBuffer, v8ArrayBuffer);
        return v8ArrayBuffer;
    }

    public static V8Object toV8Object(V8 v10, Map<String, ? extends Object> map) {
        Hashtable hashtable = new Hashtable();
        try {
            return toV8Object(v10, map, hashtable).twin();
        } finally {
            Iterator it = hashtable.values().iterator();
            while (it.hasNext()) {
                ((V8Value) it.next()).close();
            }
        }
    }

    private static V8Object toV8Object(V8 v10, Map<String, ? extends Object> map, Map<Object, V8Value> map2) {
        if (map2.containsKey(map)) {
            return (V8Object) map2.get(map);
        }
        V8Object v8Object = new V8Object(v10);
        map2.put(map, v8Object);
        try {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                setValue(v10, v8Object, entry.getKey(), entry.getValue(), map2);
            }
            return v8Object;
        } catch (IllegalStateException e10) {
            v8Object.close();
            throw e10;
        }
    }

    private static V8TypedArray toV8TypedArray(V8 v10, TypedArray typedArray, Map<Object, V8Value> map) {
        if (map.containsKey(typedArray)) {
            return (V8TypedArray) map.get(typedArray);
        }
        V8TypedArray v8TypedArray = typedArray.getV8TypedArray();
        map.put(typedArray, v8TypedArray);
        return v8TypedArray;
    }
}
