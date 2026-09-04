package com.tencent.thumbplayer.tcmedia.adapter.strategy.utils;

import android.text.TextUtils;
import android.util.SparseArray;
import com.meituan.robust.Constants;
import com.tencent.thumbplayer.tcmedia.adapter.a.b.c;
import com.tencent.thumbplayer.tcmedia.api.TPCommonEnum;
import com.tencent.thumbplayer.tcmedia.api.TPOptionalID;
import com.tencent.thumbplayer.tcmedia.tplayer.TPOptionalIDInternal;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public class TPNativeKeyMapUtil {
    private static final String REVERSE_MAP_NAME_SUFFIX = ".reverseMap";
    private static final String TAG = "TPNativeKeyMapUtil";
    private static final Map<String, Map<Number, Number>> sNameToMap = new ConcurrentHashMap();
    private static final Map<Class<?>, AtomicBoolean> sHasThisAnnotationInitMap = new ConcurrentHashMap();
    private static final SparseArray<c.a> sToNativeOptionalIdMap = new SparseArray<>();
    private static final SparseArray<String> sOptionalIdKeyToNameMap = new SparseArray<>();
    private static final AtomicBoolean sHasOptionalIdMapInit = new AtomicBoolean(false);

    private static <T extends Annotation> void buildBiDirectionMapForAnnotation(Class<T> cls) {
        AtomicBoolean atomicBoolean;
        TPLogUtil.i(TAG, "buildBiDirectionMapForAnnotation, clazz=".concat(String.valueOf(cls)));
        Map<Class<?>, AtomicBoolean> map = sHasThisAnnotationInitMap;
        synchronized (map) {
            atomicBoolean = map.get(cls);
            if (atomicBoolean == null) {
                atomicBoolean = new AtomicBoolean(false);
                map.put(cls, atomicBoolean);
            }
        }
        synchronized (atomicBoolean) {
            if (!atomicBoolean.get()) {
                searchClassToFillMap(cls);
                atomicBoolean.set(true);
            } else {
                TPLogUtil.i(TAG, "className=" + cls.getSimpleName() + " already init");
            }
        }
    }

    private static void buildNativeInitConfigMap() {
        TPNativeKeyMap.MapInitConfig mapInitConfig;
        try {
            Class<?> cls = Class.forName(TPOptionalID.class.getName());
            for (Field field : cls.getDeclaredFields()) {
                if (field.getType().toString().equals(Constants.INT) && (mapInitConfig = (TPNativeKeyMap.MapInitConfig) field.getAnnotation(TPNativeKeyMap.MapInitConfig.class)) != null) {
                    int i10 = field.getInt(cls);
                    sOptionalIdKeyToNameMap.put(i10, mapInitConfig.keyName());
                    if (mapInitConfig.value() == -1) {
                        sToNativeOptionalIdMap.put(i10, new c.a());
                    } else {
                        field.setAccessible(true);
                        sToNativeOptionalIdMap.put(i10, new c.a(mapInitConfig.type(), mapInitConfig.value()));
                    }
                }
            }
        } catch (ClassNotFoundException e10) {
            TPLogUtil.e(TAG, e10);
        } catch (IllegalAccessException e11) {
            TPLogUtil.e(TAG, e11);
        }
    }

    private static void buildNativeOptionalIdToMapInternal(Class<?> cls) {
        TPNativeKeyMap.MapOptionalId mapOptionalId;
        try {
            for (Field field : cls.getDeclaredFields()) {
                if (field.getType().toString().equals(Constants.INT) && (mapOptionalId = (TPNativeKeyMap.MapOptionalId) field.getAnnotation(TPNativeKeyMap.MapOptionalId.class)) != null) {
                    int i10 = field.getInt(cls);
                    sOptionalIdKeyToNameMap.put(i10, mapOptionalId.keyName());
                    if (mapOptionalId.value() == -1) {
                        sToNativeOptionalIdMap.put(i10, new c.a());
                    } else {
                        field.setAccessible(true);
                        sToNativeOptionalIdMap.put(i10, new c.a(mapOptionalId.type(), mapOptionalId.value()));
                    }
                }
            }
        } catch (IllegalAccessException e10) {
            TPLogUtil.e(TAG, e10);
        }
    }

    private static void buildOptionalIdMap() {
        AtomicBoolean atomicBoolean = sHasOptionalIdMapInit;
        synchronized (atomicBoolean) {
            if (sToNativeOptionalIdMap.size() != 0) {
                return;
            }
            if (atomicBoolean.get()) {
                throw new IllegalStateException("构建Map错误，请查看【--keep class com.tencent.thumbplayer.tcmedia.api.** { *; }】是否加入反混淆");
            }
            buildNativeInitConfigMap();
            buildPublicToNativeOptionalIdMap();
            buildPrivateToNativeOptionalIdMap();
            atomicBoolean.set(true);
        }
    }

    private static void buildPrivateToNativeOptionalIdMap() {
        try {
            buildNativeOptionalIdToMapInternal(Class.forName(TPOptionalIDInternal.class.getName()));
        } catch (ClassNotFoundException e10) {
            TPLogUtil.e(TAG, e10);
        }
    }

    private static void buildPublicToNativeOptionalIdMap() {
        try {
            buildNativeOptionalIdToMapInternal(Class.forName(TPOptionalID.class.getName()));
        } catch (ClassNotFoundException e10) {
            TPLogUtil.e(TAG, e10);
        }
    }

    private static <T extends Annotation> void checkFillMapValidity(Class<T> cls, Map<Number, Number> map, Map<Number, Number> map2, Class<?> cls2, Number number, Number number2) {
        if (map.containsKey(number2)) {
            throw new IllegalStateException(cls2.getName() + " 配置了重复的成员变量，注解=" + cls.getName() + " 成员变量值=" + number2 + " 请查找一下使用这个注解@" + cls.getName() + "的哪两个成员变量值相等");
        }
        if (map2.containsKey(number)) {
            throw new IllegalStateException(cls2.getName() + " 配置了重复的注解值，注解=" + cls.getName() + " 成员变量值=" + number2 + " 请查找一下@" + cls.getName() + "(这个值)在哪里重复了");
        }
    }

    public static c.a convertToNativeOptionalId(@TPCommonEnum.TPOptionalId int i10) {
        SparseArray<c.a> sparseArray = sToNativeOptionalIdMap;
        if (sparseArray.size() == 0) {
            buildOptionalIdMap();
        }
        return sparseArray.get(i10, new c.a());
    }

    public static <T extends Annotation> Set<Map.Entry<Number, Number>> getEntrySetOfToNativeMap(Class<T> cls) {
        return new HashSet(getMapForAnnotation(cls, true).entrySet());
    }

    public static <T extends Annotation> Set<Map.Entry<Number, Number>> getEntrySetOfToTPMap(Class<T> cls) {
        return new HashSet(getMapForAnnotation(cls, false).entrySet());
    }

    private static <T extends Annotation> Map<Number, Number> getMapForAnnotation(Class<T> cls, boolean z10) {
        String mapKey = getMapKey(cls, z10);
        Map<String, Map<Number, Number>> map = sNameToMap;
        Map<Number, Number> map2 = map.get(mapKey);
        if (map2 == null || map2.size() == 0) {
            buildBiDirectionMapForAnnotation(cls);
            map2 = map.get(mapKey);
        }
        if (((TPNativeKeyMap.SearchConfig) cls.getAnnotation(TPNativeKeyMap.SearchConfig.class)) == null) {
            throw new IllegalArgumentException(cls.getSimpleName() + "has not SearchConfig annotation");
        }
        if (map2 != null && map2.size() != 0) {
            return map2;
        }
        throw new IllegalStateException(cls.getSimpleName() + " is null after buildBiDirectionMap");
    }

    private static <T extends Annotation> String getMapKey(Class<T> cls, boolean z10) {
        String canonicalName = cls.getCanonicalName();
        if (z10) {
            return canonicalName;
        }
        return canonicalName + REVERSE_MAP_NAME_SUFFIX;
    }

    public static String getOptionalIdName(int i10) {
        if (!sHasOptionalIdMapInit.get()) {
            buildOptionalIdMap();
        }
        return sOptionalIdKeyToNameMap.get(i10, "");
    }

    public static void init() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Class<?>[] declaredClasses = TPNativeKeyMap.class.getDeclaredClasses();
        TPLogUtil.i(TAG, "init BiDirectionMap for tp&native value");
        for (Class<?> cls : declaredClasses) {
            if (cls.isAnnotation() && Modifier.isPublic(cls.getModifiers()) && ((TPNativeKeyMap.SearchConfig) cls.getAnnotation(TPNativeKeyMap.SearchConfig.class)) != null) {
                buildBiDirectionMapForAnnotation(cls);
            }
        }
        TPLogUtil.i(TAG, "init cost time=" + (System.currentTimeMillis() - jCurrentTimeMillis));
    }

    private static <T extends Annotation> void searchClassToFillMap(Class<T> cls) {
        int i10;
        boolean z10;
        Annotation annotation;
        boolean z11;
        Number numberValueOf;
        Number number;
        boolean z12 = true;
        String mapKey = getMapKey(cls, true);
        Map<String, Map<Number, Number>> map = sNameToMap;
        Map<Number, Number> map2 = map.get(mapKey);
        String mapKey2 = getMapKey(cls, false);
        Map<Number, Number> map3 = map.get(mapKey2);
        if (map2 == null || map3 == null) {
            map2 = new HashMap<>();
            map.put(mapKey, map2);
            map3 = new HashMap<>();
            map.put(mapKey2, map3);
        }
        Map<Number, Number> map4 = map2;
        Map<Number, Number> map5 = map3;
        try {
            TPNativeKeyMap.SearchConfig searchConfig = (TPNativeKeyMap.SearchConfig) cls.getAnnotation(TPNativeKeyMap.SearchConfig.class);
            if (searchConfig == null) {
                throw new IllegalArgumentException(cls.getCanonicalName() + "has not SearchConfig annotation");
            }
            Class<?> clsSearchClass = searchConfig.searchClass();
            Field[] declaredFields = clsSearchClass.getDeclaredFields();
            int length = declaredFields.length;
            int i11 = 0;
            while (i11 < length) {
                Field field = declaredFields[i11];
                String str = "";
                Class<? extends Number> clsValueClass = searchConfig.valueClass();
                Class<? extends Number> cls2 = Integer.TYPE;
                if (clsValueClass == cls2) {
                    str = Constants.INT;
                } else if (searchConfig.valueClass() == Long.TYPE) {
                    str = Constants.LONG;
                }
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("代码还没实现对" + searchConfig.valueClass().getName() + "的支持");
                }
                if (!field.getType().toString().equals(str) || (annotation = field.getAnnotation(cls)) == null) {
                    i10 = i11;
                    z10 = false;
                } else {
                    field.setAccessible(z12);
                    int i12 = i11;
                    Method declaredMethod = cls.getDeclaredMethod("value", new Class[0]);
                    z12 = true;
                    declaredMethod.setAccessible(true);
                    if (searchConfig.valueClass() == cls2) {
                        Integer num = (Integer) declaredMethod.invoke(annotation, new Object[0]);
                        numberValueOf = Integer.valueOf(field.getInt(clsSearchClass));
                        number = num;
                        z11 = false;
                    } else {
                        if (searchConfig.valueClass() != Long.TYPE) {
                            throw new IllegalArgumentException("代码还没实现对" + searchConfig.valueClass().getName() + "的支持");
                        }
                        z11 = false;
                        Long l10 = (Long) declaredMethod.invoke(annotation, new Object[0]);
                        numberValueOf = Long.valueOf(field.getLong(clsSearchClass));
                        number = l10;
                    }
                    Number number2 = number;
                    i10 = i12;
                    z10 = z11;
                    checkFillMapValidity(cls, map4, map5, clsSearchClass, number2, numberValueOf);
                    map4.put(numberValueOf, number2);
                    map5.put(number2, numberValueOf);
                }
                i11 = i10 + 1;
            }
        } catch (IllegalAccessException e10) {
            TPLogUtil.e(TAG, e10);
        } catch (NoSuchMethodException e11) {
            TPLogUtil.e(TAG, e11);
            throw new IllegalStateException("com.tencent.thumbplayer.tcmedia.adapter.strategy.utils.TPNativeKeyMap下所有元素需要加到混淆中, 并且每个MapXXX注解需要有value方法");
        } catch (InvocationTargetException e12) {
            TPLogUtil.e(TAG, e12);
        }
    }

    public static <T extends Annotation> int toNativeIntValue(Class<T> cls, int i10) {
        Map<Number, Number> mapForAnnotation = getMapForAnnotation(cls, true);
        if (mapForAnnotation.containsKey(Integer.valueOf(i10))) {
            return mapForAnnotation.get(Integer.valueOf(i10)).intValue();
        }
        TPLogUtil.e(TAG, "toNativeValue, tpValue=" + i10 + "return default value, clazz" + cls);
        return (int) ((TPNativeKeyMap.SearchConfig) cls.getAnnotation(TPNativeKeyMap.SearchConfig.class)).nativeDefValue();
    }

    public static <T extends Annotation> long toNativeLongValue(Class<T> cls, long j10) {
        Map<Number, Number> mapForAnnotation = getMapForAnnotation(cls, true);
        if (mapForAnnotation.containsKey(Long.valueOf(j10))) {
            return mapForAnnotation.get(Long.valueOf(j10)).longValue();
        }
        TPLogUtil.e(TAG, "toNativeValue, tpValue=" + j10 + "return default value, clazz" + cls);
        return ((TPNativeKeyMap.SearchConfig) cls.getAnnotation(TPNativeKeyMap.SearchConfig.class)).nativeDefValue();
    }

    public static <T extends Annotation> int toTPIntValue(Class<T> cls, int i10) {
        Map<Number, Number> mapForAnnotation = getMapForAnnotation(cls, false);
        if (mapForAnnotation.containsKey(Integer.valueOf(i10))) {
            return mapForAnnotation.get(Integer.valueOf(i10)).intValue();
        }
        TPLogUtil.i(TAG, "toTPValue, nativeValue=" + i10 + "return default value, clazz" + cls);
        return (int) ((TPNativeKeyMap.SearchConfig) cls.getAnnotation(TPNativeKeyMap.SearchConfig.class)).tpDefValue();
    }

    public static <T extends Annotation> long toTPLongValue(Class<T> cls, long j10) {
        Map<Number, Number> mapForAnnotation = getMapForAnnotation(cls, false);
        if (mapForAnnotation.containsKey(Long.valueOf(j10))) {
            return mapForAnnotation.get(Long.valueOf(j10)).longValue();
        }
        TPLogUtil.i(TAG, "toTPValue, nativeValue=" + j10 + "return default value, clazz" + cls);
        return ((TPNativeKeyMap.SearchConfig) cls.getAnnotation(TPNativeKeyMap.SearchConfig.class)).tpDefValue();
    }
}
