package com.alibaba.fastjson.util;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.PropertyNamingStrategy;
import com.alibaba.fastjson.annotation.JSONCreator;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONPOJOBuilder;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.max.xiaoheihe.bean.bbs.TopicHashtagWrapper;
import com.umeng.analytics.pro.ak;
import g0.a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes6.dex */
public class JavaBeanInfo {
    public final Method buildMethod;
    public final Class<?> builderClass;
    public final Class<?> clazz;
    public final Constructor<?> creatorConstructor;
    public Type[] creatorConstructorParameterTypes;
    public String[] creatorConstructorParameters;
    public final Constructor<?> defaultConstructor;
    public final int defaultConstructorParameterSize;
    public final Method factoryMethod;
    public final FieldInfo[] fields;
    public final JSONType jsonType;
    public String[] orders;
    public final int parserFeatures;
    public final FieldInfo[] sortedFields;
    public final String typeKey;
    public final String typeName;

    public JavaBeanInfo(Class<?> cls, Class<?> cls2, Constructor<?> constructor, Constructor<?> constructor2, Method method, Method method2, JSONType jSONType, List<FieldInfo> list) {
        JSONField jSONField;
        this.clazz = cls;
        this.builderClass = cls2;
        this.defaultConstructor = constructor;
        this.creatorConstructor = constructor2;
        this.factoryMethod = method;
        this.parserFeatures = TypeUtils.getParserFeatures(cls);
        this.buildMethod = method2;
        this.jsonType = jSONType;
        if (jSONType != null) {
            String strTypeName = jSONType.typeName();
            String strTypeKey = jSONType.typeKey();
            this.typeKey = strTypeKey.length() <= 0 ? null : strTypeKey;
            if (strTypeName.length() != 0) {
                this.typeName = strTypeName;
            } else {
                this.typeName = cls.getName();
            }
            String[] strArrOrders = jSONType.orders();
            this.orders = strArrOrders.length == 0 ? null : strArrOrders;
        } else {
            this.typeName = cls.getName();
            this.typeKey = null;
            this.orders = null;
        }
        FieldInfo[] fieldInfoArr = new FieldInfo[list.size()];
        this.fields = fieldInfoArr;
        list.toArray(fieldInfoArr);
        FieldInfo[] fieldInfoArr2 = new FieldInfo[fieldInfoArr.length];
        boolean z10 = false;
        if (this.orders != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(list.size());
            for (FieldInfo fieldInfo : fieldInfoArr) {
                linkedHashMap.put(fieldInfo.name, fieldInfo);
            }
            int i10 = 0;
            for (String str : this.orders) {
                FieldInfo fieldInfo2 = (FieldInfo) linkedHashMap.get(str);
                if (fieldInfo2 != null) {
                    fieldInfoArr2[i10] = fieldInfo2;
                    linkedHashMap.remove(str);
                    i10++;
                }
            }
            Iterator it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
                fieldInfoArr2[i10] = (FieldInfo) it.next();
                i10++;
            }
        } else {
            System.arraycopy(fieldInfoArr, 0, fieldInfoArr2, 0, fieldInfoArr.length);
            Arrays.sort(fieldInfoArr2);
        }
        this.sortedFields = Arrays.equals(this.fields, fieldInfoArr2) ? this.fields : fieldInfoArr2;
        if (constructor != null) {
            this.defaultConstructorParameterSize = constructor.getParameterTypes().length;
        } else if (method != null) {
            this.defaultConstructorParameterSize = method.getParameterTypes().length;
        } else {
            this.defaultConstructorParameterSize = 0;
        }
        if (constructor2 != null) {
            this.creatorConstructorParameterTypes = constructor2.getParameterTypes();
            if (!TypeUtils.isKotlin(cls)) {
                if (this.creatorConstructorParameterTypes.length == this.fields.length) {
                    int i11 = 0;
                    while (true) {
                        Type[] typeArr = this.creatorConstructorParameterTypes;
                        if (i11 >= typeArr.length) {
                            z10 = true;
                            break;
                        } else if (typeArr[i11] != this.fields[i11].fieldClass) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
                if (z10) {
                    return;
                }
                this.creatorConstructorParameters = ASMUtils.lookupParameterNames(constructor2);
                return;
            }
            this.creatorConstructorParameters = TypeUtils.getKoltinConstructorParameters(cls);
            Annotation[][] parameterAnnotations = constructor2.getParameterAnnotations();
            for (int i12 = 0; i12 < this.creatorConstructorParameters.length && i12 < parameterAnnotations.length; i12++) {
                Annotation[] annotationArr = parameterAnnotations[i12];
                int length = annotationArr.length;
                int i13 = 0;
                while (true) {
                    if (i13 >= length) {
                        jSONField = null;
                        break;
                    }
                    Annotation annotation = annotationArr[i13];
                    if (annotation instanceof JSONField) {
                        jSONField = (JSONField) annotation;
                        break;
                    }
                    i13++;
                }
                if (jSONField != null) {
                    String strName = jSONField.name();
                    if (strName.length() > 0) {
                        this.creatorConstructorParameters[i12] = strName;
                    }
                }
            }
        }
    }

    static boolean add(List<FieldInfo> list, FieldInfo fieldInfo) {
        int size = list.size() - 1;
        while (size >= 0) {
            FieldInfo fieldInfo2 = list.get(size);
            if (fieldInfo2.name.equals(fieldInfo.name) && (!fieldInfo2.getOnly || fieldInfo.getOnly)) {
                if (fieldInfo2.fieldClass.isAssignableFrom(fieldInfo.fieldClass) || fieldInfo2.compareTo(fieldInfo) < 0) {
                    list.remove(size);
                    break;
                }
                return false;
            }
            size--;
        }
        list.add(fieldInfo);
        return true;
    }

    public static JavaBeanInfo build(Class<?> cls, Type type, PropertyNamingStrategy propertyNamingStrategy) {
        return build(cls, type, propertyNamingStrategy, false, TypeUtils.compatibleWithJavaBean);
    }

    /* JADX WARN: Code duplicated, block: B:147:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:148:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:204:0x0439  */
    /* JADX WARN: Code duplicated, block: B:229:0x051f A[PHI: r11
  0x051f: PHI (r11v22 java.lang.String) = (r11v21 java.lang.String), (r11v21 java.lang.String), (r11v23 java.lang.String) binds: [B:228:0x051d, B:231:0x052a, B:235:0x0543] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:260:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:285:0x068c A[PHI: r24 r26 r29 r32 r33
  0x068c: PHI (r24v5 java.lang.Class<?>) = (r11v4 java.lang.Class<?>), (r11v4 java.lang.Class<?>), (r24v8 java.lang.Class<?>) binds: [B:301:0x06db, B:297:0x06d2, B:284:0x065f] A[DONT_GENERATE, DONT_INLINE]
  0x068c: PHI (r26v7 java.lang.Class<java.lang.String>) = 
  (r26v5 java.lang.Class<java.lang.String>)
  (r26v5 java.lang.Class<java.lang.String>)
  (r26v9 java.lang.Class<java.lang.String>)
 binds: [B:301:0x06db, B:297:0x06d2, B:284:0x065f] A[DONT_GENERATE, DONT_INLINE]
  0x068c: PHI (r29v4 java.lang.Class<?>) = (r5v4 java.lang.Class<?>), (r5v4 java.lang.Class<?>), (r29v6 java.lang.Class<?>) binds: [B:301:0x06db, B:297:0x06d2, B:284:0x065f] A[DONT_GENERATE, DONT_INLINE]
  0x068c: PHI (r32v4 int) = (r9v2 int), (r9v2 int), (r32v6 int) binds: [B:301:0x06db, B:297:0x06d2, B:284:0x065f] A[DONT_GENERATE, DONT_INLINE]
  0x068c: PHI (r33v4 int) = (r10v4 int), (r10v4 int), (r33v6 int) binds: [B:301:0x06db, B:297:0x06d2, B:284:0x065f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:335:0x079f  */
    /* JADX WARN: Code duplicated, block: B:337:0x07a6  */
    /* JADX WARN: Code duplicated, block: B:338:0x07cd  */
    /* JADX WARN: Code duplicated, block: B:339:0x07cf  */
    /* JADX WARN: Code duplicated, block: B:341:0x07d3  */
    /* JADX WARN: Code duplicated, block: B:343:0x07df  */
    /* JADX WARN: Code duplicated, block: B:345:0x07e5  */
    /* JADX WARN: Code duplicated, block: B:347:0x07f1  */
    /* JADX WARN: Code duplicated, block: B:349:0x080f  */
    /* JADX WARN: Code duplicated, block: B:351:0x083f  */
    /* JADX WARN: Code duplicated, block: B:354:0x084e  */
    public static JavaBeanInfo build(Class<?> cls, Type type, PropertyNamingStrategy propertyNamingStrategy, boolean z10, boolean z11) {
        ArrayList arrayList;
        Field[] fieldArr;
        PropertyNamingStrategy propertyNamingStrategy2;
        Class<String> cls2;
        Class<?> cls3;
        int i10;
        Method[] methodArr;
        Constructor<?> creatorConstructor;
        Class<String> cls4;
        String str;
        PropertyNamingStrategy propertyNamingStrategy3;
        JSONType jSONType;
        Class<?> cls5;
        Field[] fieldArr2;
        JSONField jSONField;
        char c10;
        String string;
        Field[] fieldArr3;
        JSONField jSONField2;
        Class<?> cls6;
        Class<String> cls7;
        String strDecapitalize;
        Field field;
        boolean z12;
        boolean z13;
        int i11;
        JSONField jSONField3;
        JSONField jSONField4;
        int i12;
        int i13;
        int i14;
        String str2;
        String str3;
        StringBuilder sb2;
        String str4;
        Class<String> cls8;
        Field[] fieldArr4;
        Class<?> cls9;
        Class<String> cls10;
        int i15;
        String[] strArr;
        Constructor<?>[] constructorArr;
        int i16;
        String[] strArrLookupParameterNames;
        String[] strArrLookupParameterNames2;
        Class<?>[] parameterTypes;
        JSONField jSONField5;
        int iOrdinal;
        int iOf;
        int iOf2;
        JSONField jSONField6;
        JSONField jSONField7;
        String str5;
        Field field2;
        int iOrdinal2;
        int iOf3;
        int iOf4;
        PropertyNamingStrategy propertyNamingStrategyNaming;
        Class<String> cls11 = String.class;
        Class<?> cls12 = Object.class;
        JSONType jSONType2 = (JSONType) TypeUtils.getAnnotation(cls, JSONType.class);
        PropertyNamingStrategy propertyNamingStrategy4 = (jSONType2 == null || (propertyNamingStrategyNaming = jSONType2.naming()) == null || propertyNamingStrategyNaming == PropertyNamingStrategy.CamelCase) ? propertyNamingStrategy : propertyNamingStrategyNaming;
        Class<?> builderClass = getBuilderClass(cls, jSONType2);
        Field[] declaredFields = cls.getDeclaredFields();
        Method[] methods = cls.getMethods();
        boolean zIsKotlin = TypeUtils.isKotlin(cls);
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        Constructor<?> defaultConstructor = (!zIsKotlin || declaredConstructors.length == 1) ? builderClass == null ? getDefaultConstructor(cls, declaredConstructors) : getDefaultConstructor(builderClass, builderClass.getDeclaredConstructors()) : null;
        Method method = null;
        Method method2 = null;
        ArrayList arrayList2 = new ArrayList();
        if (z10) {
            for (Class<?> superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
                computeFields(cls, type, propertyNamingStrategy4, arrayList2, superclass.getDeclaredFields());
            }
            return new JavaBeanInfo(cls, builderClass, defaultConstructor, null, null, null, jSONType2, arrayList2);
        }
        boolean z14 = cls.isInterface() || Modifier.isAbstract(cls.getModifiers());
        if ((defaultConstructor == null && builderClass == null) || z14) {
            creatorConstructor = getCreatorConstructor(declaredConstructors);
            if (creatorConstructor == null || z14) {
                arrayList = arrayList2;
                propertyNamingStrategy2 = propertyNamingStrategy4;
                cls8 = cls11;
                Class<?> cls13 = cls12;
                methodArr = methods;
                fieldArr4 = declaredFields;
                Method factoryMethod = getFactoryMethod(cls, methodArr);
                if (factoryMethod != null) {
                    TypeUtils.setAccessible(factoryMethod);
                    Class<?>[] parameterTypes2 = factoryMethod.getParameterTypes();
                    if (parameterTypes2.length > 0) {
                        Annotation[][] parameterAnnotations = factoryMethod.getParameterAnnotations();
                        int i17 = 0;
                        while (i17 < parameterTypes2.length) {
                            Annotation[] annotationArr = parameterAnnotations[i17];
                            int length = annotationArr.length;
                            int i18 = 0;
                            while (true) {
                                if (i18 >= length) {
                                    jSONField6 = null;
                                    break;
                                }
                                Annotation annotation = annotationArr[i18];
                                if (annotation instanceof JSONField) {
                                    jSONField6 = (JSONField) annotation;
                                    break;
                                }
                                i18++;
                            }
                            if (jSONField6 == null) {
                                throw new JSONException("illegal json creator");
                            }
                            add(arrayList, new FieldInfo(jSONField6.name(), cls, parameterTypes2[i17], factoryMethod.getGenericParameterTypes()[i17], TypeUtils.getField(cls, jSONField6.name(), fieldArr4), jSONField6.ordinal(), SerializerFeature.of(jSONField6.serialzeFeatures()), Feature.of(jSONField6.parseFeatures())));
                            i17++;
                            parameterAnnotations = parameterAnnotations;
                            parameterTypes2 = parameterTypes2;
                        }
                        return new JavaBeanInfo(cls, builderClass, null, null, factoryMethod, null, jSONType2, arrayList);
                    }
                } else if (!z14) {
                    String name = cls.getName();
                    if (!zIsKotlin || declaredConstructors.length <= 0) {
                        int length2 = declaredConstructors.length;
                        String[] strArr2 = null;
                        int i19 = 0;
                        while (true) {
                            if (i19 < length2) {
                                Constructor<?> constructor = declaredConstructors[i19];
                                Class<?>[] parameterTypes3 = constructor.getParameterTypes();
                                if (name.equals("org.springframework.security.web.authentication.WebAuthenticationDetails") && parameterTypes3.length == 2) {
                                    method2 = factoryMethod;
                                    cls10 = cls8;
                                    if (parameterTypes3[0] == cls10 && parameterTypes3[1] == cls10) {
                                        constructor.setAccessible(true);
                                        strArrLookupParameterNames2 = ASMUtils.lookupParameterNames(constructor);
                                        cls9 = cls13;
                                    }
                                    strArr = strArrLookupParameterNames2;
                                    creatorConstructor = constructor;
                                } else {
                                    method2 = factoryMethod;
                                    cls10 = cls8;
                                }
                                if (name.equals("org.springframework.security.web.authentication.preauth.PreAuthenticatedAuthenticationToken") && parameterTypes3.length == 3) {
                                    cls9 = cls13;
                                    constructorArr = declaredConstructors;
                                    if (parameterTypes3[0] == cls9 && parameterTypes3[1] == cls9 && parameterTypes3[2] == Collection.class) {
                                        constructor.setAccessible(true);
                                        strArrLookupParameterNames2 = new String[]{"principal", "credentials", "authorities"};
                                        strArr = strArrLookupParameterNames2;
                                        creatorConstructor = constructor;
                                    }
                                } else {
                                    cls9 = cls13;
                                    constructorArr = declaredConstructors;
                                }
                                if (name.equals("org.springframework.security.core.authority.SimpleGrantedAuthority")) {
                                    i16 = 1;
                                    i15 = 0;
                                    if (parameterTypes3.length == 1 && parameterTypes3[0] == cls10) {
                                        strArr = new String[]{"authority"};
                                        creatorConstructor = constructor;
                                    }
                                } else {
                                    i16 = 1;
                                    i15 = 0;
                                }
                                if (((constructor.getModifiers() & i16) != 0 ? 1 : i15) != 0 && (strArrLookupParameterNames = ASMUtils.lookupParameterNames(constructor)) != null && strArrLookupParameterNames.length != 0 && (creatorConstructor == null || strArr2 == null || strArrLookupParameterNames.length > strArr2.length)) {
                                    strArr2 = strArrLookupParameterNames;
                                    creatorConstructor = constructor;
                                }
                                i19++;
                                declaredConstructors = constructorArr;
                                cls13 = cls9;
                                cls8 = cls10;
                                factoryMethod = method2;
                            } else {
                                cls9 = cls13;
                                method2 = factoryMethod;
                                cls10 = cls8;
                                i15 = 0;
                                strArr = strArr2;
                            }
                            if (strArr != null) {
                                parameterTypes = creatorConstructor.getParameterTypes();
                            } else {
                                parameterTypes = null;
                            }
                            if (strArr != null || parameterTypes.length != strArr.length) {
                                throw new JSONException("default constructor not found. " + cls);
                            }
                            Annotation[][] parameterAnnotations2 = creatorConstructor.getParameterAnnotations();
                            int i20 = i15;
                            while (i20 < parameterTypes.length) {
                                Annotation[] annotationArr2 = parameterAnnotations2[i20];
                                String str6 = strArr[i20];
                                int length3 = annotationArr2.length;
                                int i21 = i15;
                                while (true) {
                                    if (i21 >= length3) {
                                        jSONField5 = null;
                                        break;
                                    }
                                    int i22 = length3;
                                    Annotation annotation2 = annotationArr2[i21];
                                    Annotation[] annotationArr3 = annotationArr2;
                                    if (annotation2 instanceof JSONField) {
                                        jSONField5 = (JSONField) annotation2;
                                        break;
                                    }
                                    i21++;
                                    annotationArr2 = annotationArr3;
                                    length3 = i22;
                                }
                                Class<?> cls14 = parameterTypes[i20];
                                Type type2 = creatorConstructor.getGenericParameterTypes()[i20];
                                Field field3 = TypeUtils.getField(cls, str6, fieldArr4);
                                if (field3 != null && jSONField5 == null) {
                                    jSONField5 = (JSONField) field3.getAnnotation(JSONField.class);
                                }
                                if (jSONField5 != null) {
                                    String strName = jSONField5.name();
                                    if (strName.length() != 0) {
                                        str6 = strName;
                                    }
                                    iOrdinal = jSONField5.ordinal();
                                    iOf = SerializerFeature.of(jSONField5.serialzeFeatures());
                                    iOf2 = Feature.of(jSONField5.parseFeatures());
                                } else if ("org.springframework.security.core.userdetails.User".equals(name) && a.f118920d.equals(str6)) {
                                    iOf2 = Feature.InitStringFieldAsEmpty.mask;
                                    iOrdinal = i15;
                                    iOf = iOrdinal;
                                } else {
                                    iOrdinal = i15;
                                    iOf = iOrdinal;
                                    iOf2 = iOf;
                                }
                                add(arrayList, new FieldInfo(str6, cls, cls14, type2, field3, iOrdinal, iOf, iOf2));
                                i20++;
                                cls10 = cls10;
                                strArr = strArr;
                                parameterTypes = parameterTypes;
                                cls9 = cls9;
                                name = name;
                                i15 = i15;
                                fieldArr4 = fieldArr4;
                            }
                            cls3 = cls9;
                            cls2 = cls10;
                            fieldArr = fieldArr4;
                            i10 = i15;
                            if (!zIsKotlin && !cls.getName().equals("javax.servlet.http.Cookie")) {
                                return new JavaBeanInfo(cls, builderClass, null, creatorConstructor, null, null, jSONType2, arrayList);
                            }
                        }
                    } else {
                        String[] koltinConstructorParameters = TypeUtils.getKoltinConstructorParameters(cls);
                        Constructor<?> koltinConstructor = TypeUtils.getKoltinConstructor(declaredConstructors);
                        TypeUtils.setAccessible(koltinConstructor);
                        cls9 = cls13;
                        creatorConstructor = koltinConstructor;
                        strArr = koltinConstructorParameters;
                        method2 = factoryMethod;
                        cls10 = cls8;
                    }
                    i15 = 0;
                    if (strArr != null) {
                        parameterTypes = creatorConstructor.getParameterTypes();
                    } else {
                        parameterTypes = null;
                    }
                    if (strArr != null) {
                    }
                    throw new JSONException("default constructor not found. " + cls);
                }
                cls3 = cls13;
                method2 = factoryMethod;
            } else {
                TypeUtils.setAccessible(creatorConstructor);
                Class<?>[] parameterTypes4 = creatorConstructor.getParameterTypes();
                if (parameterTypes4.length > 0) {
                    Annotation[][] parameterAnnotations3 = creatorConstructor.getParameterAnnotations();
                    String[] strArrLookupParameterNames3 = null;
                    int i23 = 0;
                    while (i23 < parameterTypes4.length) {
                        Annotation[] annotationArr4 = parameterAnnotations3[i23];
                        int length4 = annotationArr4.length;
                        int i24 = 0;
                        while (true) {
                            if (i24 >= length4) {
                                jSONField7 = null;
                                break;
                            }
                            Annotation annotation3 = annotationArr4[i24];
                            Annotation[] annotationArr5 = annotationArr4;
                            if (annotation3 instanceof JSONField) {
                                jSONField7 = (JSONField) annotation3;
                                break;
                            }
                            i24++;
                            annotationArr4 = annotationArr5;
                        }
                        Class<?> cls15 = parameterTypes4[i23];
                        Type type3 = creatorConstructor.getGenericParameterTypes()[i23];
                        if (jSONField7 != null) {
                            Field field4 = TypeUtils.getField(cls, jSONField7.name(), declaredFields);
                            iOrdinal2 = jSONField7.ordinal();
                            iOf3 = SerializerFeature.of(jSONField7.serialzeFeatures());
                            iOf4 = Feature.of(jSONField7.parseFeatures());
                            String strName2 = jSONField7.name();
                            field2 = field4;
                            str5 = strName2;
                        } else {
                            str5 = null;
                            field2 = null;
                            iOrdinal2 = 0;
                            iOf3 = 0;
                            iOf4 = 0;
                        }
                        if (str5 == null || str5.length() == 0) {
                            if (strArrLookupParameterNames3 == null) {
                                strArrLookupParameterNames3 = ASMUtils.lookupParameterNames(creatorConstructor);
                            }
                            str5 = strArrLookupParameterNames3[i23];
                        }
                        PropertyNamingStrategy propertyNamingStrategy5 = propertyNamingStrategy4;
                        ArrayList arrayList3 = arrayList2;
                        add(arrayList3, new FieldInfo(str5, cls, cls15, type3, field2, iOrdinal2, iOf3, iOf4));
                        i23++;
                        arrayList2 = arrayList3;
                        declaredFields = declaredFields;
                        methods = methods;
                        cls11 = cls11;
                        propertyNamingStrategy4 = propertyNamingStrategy5;
                        parameterTypes4 = parameterTypes4;
                        cls12 = cls12;
                    }
                }
                arrayList = arrayList2;
                propertyNamingStrategy2 = propertyNamingStrategy4;
                cls8 = cls11;
                Class<?> cls16 = cls12;
                methodArr = methods;
                fieldArr4 = declaredFields;
                cls3 = cls16;
            }
            fieldArr = fieldArr4;
            cls2 = cls8;
            i10 = 0;
        } else {
            arrayList = arrayList2;
            fieldArr = declaredFields;
            propertyNamingStrategy2 = propertyNamingStrategy4;
            cls2 = cls11;
            cls3 = cls12;
            i10 = 0;
            methodArr = methods;
            creatorConstructor = null;
        }
        if (defaultConstructor != null) {
            TypeUtils.setAccessible(defaultConstructor);
        }
        String str7 = "set";
        if (builderClass != null) {
            JSONPOJOBuilder jSONPOJOBuilder = (JSONPOJOBuilder) builderClass.getAnnotation(JSONPOJOBuilder.class);
            String strWithPrefix = jSONPOJOBuilder != null ? jSONPOJOBuilder.withPrefix() : null;
            if (strWithPrefix == null || strWithPrefix.length() == 0) {
                strWithPrefix = "with";
            }
            String str8 = strWithPrefix;
            Method[] methods2 = builderClass.getMethods();
            int length5 = methods2.length;
            int i25 = i10;
            while (i25 < length5) {
                Method method3 = methods2[i25];
                if (!Modifier.isStatic(method3.getModifiers()) && method3.getReturnType().equals(builderClass)) {
                    JSONField superMethodAnnotation = (JSONField) method3.getAnnotation(JSONField.class);
                    if (superMethodAnnotation == null) {
                        superMethodAnnotation = TypeUtils.getSuperMethodAnnotation(cls, method3);
                    }
                    JSONField jSONField8 = superMethodAnnotation;
                    if (jSONField8 == null) {
                        i12 = 0;
                        i13 = 0;
                        i14 = 0;
                    } else if (jSONField8.deserialize()) {
                        int iOrdinal3 = jSONField8.ordinal();
                        int iOf5 = SerializerFeature.of(jSONField8.serialzeFeatures());
                        int iOf6 = Feature.of(jSONField8.parseFeatures());
                        if (jSONField8.name().length() != 0) {
                            i25 = i25;
                            length5 = length5;
                            methods2 = methods2;
                            builderClass = builderClass;
                            cls2 = cls2;
                            propertyNamingStrategy2 = propertyNamingStrategy2;
                            jSONType2 = jSONType2;
                            add(arrayList, new FieldInfo(jSONField8.name(), method3, null, cls, type, iOrdinal3, iOf5, iOf6, jSONField8, null, null));
                            str4 = str8;
                            str2 = str7;
                        } else {
                            i12 = iOrdinal3;
                            i13 = iOf5;
                            i14 = iOf6;
                        }
                    } else {
                        cls2 = cls2;
                        i25 = i25;
                        length5 = length5;
                        methods2 = methods2;
                        str4 = str8;
                        builderClass = builderClass;
                        str2 = str7;
                        propertyNamingStrategy2 = propertyNamingStrategy2;
                        jSONType2 = jSONType2;
                    }
                    String name2 = method3.getName();
                    str2 = str7;
                    if (!name2.startsWith(str2) || name2.length() <= 3) {
                        str3 = str8;
                        if (name2.startsWith(str3) && name2.length() > str3.length()) {
                            sb2 = new StringBuilder(name2.substring(str3.length()));
                        } else {
                            str4 = str3;
                        }
                    } else {
                        sb2 = new StringBuilder(name2.substring(3));
                        str3 = str8;
                    }
                    char cCharAt = sb2.charAt(0);
                    if (Character.isUpperCase(cCharAt)) {
                        sb2.setCharAt(0, Character.toLowerCase(cCharAt));
                        str4 = str3;
                        add(arrayList, new FieldInfo(sb2.toString(), method3, null, cls, type, i12, i13, i14, jSONField8, null, null));
                    } else {
                        str4 = str3;
                    }
                } else {
                    cls2 = cls2;
                    i25 = i25;
                    length5 = length5;
                    methods2 = methods2;
                    str4 = str8;
                    builderClass = builderClass;
                    str2 = str7;
                    propertyNamingStrategy2 = propertyNamingStrategy2;
                    jSONType2 = jSONType2;
                }
                i25++;
                str7 = str2;
                str8 = str4;
                jSONType2 = jSONType2;
                length5 = length5;
                methods2 = methods2;
                builderClass = builderClass;
                propertyNamingStrategy2 = propertyNamingStrategy2;
                cls2 = cls2;
            }
            cls4 = cls2;
            str = str7;
            propertyNamingStrategy3 = propertyNamingStrategy2;
            jSONType = jSONType2;
            cls5 = builderClass;
            JSONPOJOBuilder jSONPOJOBuilder2 = (JSONPOJOBuilder) cls5.getAnnotation(JSONPOJOBuilder.class);
            String strBuildMethod = jSONPOJOBuilder2 != null ? jSONPOJOBuilder2.buildMethod() : null;
            if (strBuildMethod == null || strBuildMethod.length() == 0) {
                strBuildMethod = "build";
            }
            try {
                method = cls5.getMethod(strBuildMethod, new Class[0]);
            } catch (NoSuchMethodException | SecurityException unused) {
            }
            if (method == null) {
                try {
                    method = cls5.getMethod(TopicHashtagWrapper.TYPE_CREATE, new Class[0]);
                } catch (NoSuchMethodException | SecurityException unused2) {
                }
            }
            if (method == null) {
                throw new JSONException("buildMethod not found.");
            }
            TypeUtils.setAccessible(method);
        } else {
            cls4 = cls2;
            str = "set";
            propertyNamingStrategy3 = propertyNamingStrategy2;
            jSONType = jSONType2;
            cls5 = builderClass;
        }
        int length6 = methodArr.length;
        int i26 = 0;
        while (i26 < length6) {
            Method method4 = methodArr[i26];
            int iOrdinal4 = 0;
            int iOf7 = 0;
            int iOf8 = 0;
            String name3 = method4.getName();
            if (Modifier.isStatic(method4.getModifiers())) {
                cls6 = cls3;
                cls7 = cls4;
            } else {
                Class<?> returnType = method4.getReturnType();
                if (returnType.equals(Void.TYPE) || returnType.equals(method4.getDeclaringClass())) {
                    cls6 = cls3;
                    if (method4.getDeclaringClass() != cls6) {
                        Class<?>[] parameterTypes5 = method4.getParameterTypes();
                        if (parameterTypes5.length != 0) {
                            if (parameterTypes5.length > 2) {
                                cls6 = cls6;
                                i26 = i26;
                                length6 = length6;
                                cls5 = cls5;
                                str = str;
                                methodArr = methodArr;
                                cls7 = cls4;
                            } else {
                                JSONField jSONField9 = (JSONField) method4.getAnnotation(JSONField.class);
                                if (jSONField9 == null || parameterTypes5.length != 2) {
                                    cls7 = cls4;
                                } else {
                                    Class<String> cls17 = cls4;
                                    if (parameterTypes5[0] == cls17 && parameterTypes5[1] == cls6) {
                                        cls7 = cls17;
                                        cls6 = cls6;
                                        i26 = i26;
                                        length6 = length6;
                                        cls5 = cls5;
                                        add(arrayList, new FieldInfo("", method4, null, cls, type, 0, 0, 0, jSONField9, null, null));
                                    } else {
                                        cls7 = cls17;
                                    }
                                    methodArr = methodArr;
                                }
                                if (parameterTypes5.length != 1) {
                                    str = str;
                                    methodArr = methodArr;
                                    fieldArr = fieldArr;
                                    propertyNamingStrategy3 = propertyNamingStrategy3;
                                } else {
                                    JSONField superMethodAnnotation2 = jSONField9 == null ? TypeUtils.getSuperMethodAnnotation(cls, method4) : jSONField9;
                                    if (superMethodAnnotation2 != null || name3.length() >= 4) {
                                        if (superMethodAnnotation2 != null) {
                                            if (superMethodAnnotation2.deserialize()) {
                                                iOrdinal4 = superMethodAnnotation2.ordinal();
                                                iOf7 = SerializerFeature.of(superMethodAnnotation2.serialzeFeatures());
                                                int iOf9 = Feature.of(superMethodAnnotation2.parseFeatures());
                                                if (superMethodAnnotation2.name().length() != 0) {
                                                    methodArr = methodArr;
                                                    add(arrayList, new FieldInfo(superMethodAnnotation2.name(), method4, null, cls, type, iOrdinal4, iOf7, iOf9, superMethodAnnotation2, null, null));
                                                } else {
                                                    iOf8 = iOf9;
                                                }
                                            } else {
                                                methodArr = methodArr;
                                            }
                                        }
                                        if (superMethodAnnotation2 != null || name3.startsWith(str)) {
                                            char cCharAt2 = name3.charAt(3);
                                            if (!Character.isUpperCase(cCharAt2) && cCharAt2 <= 512) {
                                                if (cCharAt2 == '_') {
                                                    strDecapitalize = name3.substring(4);
                                                } else if (cCharAt2 == 'f') {
                                                    strDecapitalize = name3.substring(3);
                                                } else if (name3.length() >= 5 && Character.isUpperCase(name3.charAt(4))) {
                                                    strDecapitalize = TypeUtils.decapitalize(name3.substring(3));
                                                }
                                                field = TypeUtils.getField(cls, strDecapitalize, fieldArr);
                                                if (field == null) {
                                                    z13 = false;
                                                    if (parameterTypes5[0] == Boolean.TYPE) {
                                                        StringBuilder sb3 = new StringBuilder();
                                                        sb3.append(ak.f104422ae);
                                                        sb3.append(Character.toUpperCase(strDecapitalize.charAt(0)));
                                                        z12 = true;
                                                        sb3.append(strDecapitalize.substring(1));
                                                        field = TypeUtils.getField(cls, sb3.toString(), fieldArr);
                                                    } else {
                                                        z12 = true;
                                                    }
                                                } else {
                                                    z12 = true;
                                                    z13 = false;
                                                }
                                                if (field != null) {
                                                    jSONField4 = (JSONField) field.getAnnotation(JSONField.class);
                                                    if (jSONField4 != null) {
                                                        if (jSONField4.deserialize()) {
                                                            iOrdinal4 = jSONField4.ordinal();
                                                            iOf7 = SerializerFeature.of(jSONField4.serialzeFeatures());
                                                            iOf8 = Feature.of(jSONField4.parseFeatures());
                                                            if (jSONField4.name().length() != 0) {
                                                                add(arrayList, new FieldInfo(jSONField4.name(), method4, field, cls, type, iOrdinal4, iOf7, iOf8, superMethodAnnotation2, jSONField4, null));
                                                                fieldArr = fieldArr;
                                                            }
                                                        } else {
                                                            fieldArr = fieldArr;
                                                        }
                                                        propertyNamingStrategy3 = propertyNamingStrategy3;
                                                    }
                                                    i11 = iOf8;
                                                    jSONField3 = jSONField4;
                                                } else {
                                                    i11 = iOf8;
                                                    jSONField3 = null;
                                                }
                                                propertyNamingStrategy3 = propertyNamingStrategy3;
                                                if (propertyNamingStrategy3 != null) {
                                                    strDecapitalize = propertyNamingStrategy3.translate(strDecapitalize);
                                                }
                                                fieldArr = fieldArr;
                                                add(arrayList, new FieldInfo(strDecapitalize, method4, field, cls, type, iOrdinal4, iOf7, i11, superMethodAnnotation2, jSONField3, null));
                                            } else if (TypeUtils.compatibleWithJavaBean) {
                                                strDecapitalize = TypeUtils.decapitalize(name3.substring(3));
                                            } else {
                                                strDecapitalize = Character.toLowerCase(name3.charAt(3)) + name3.substring(4);
                                            }
                                            field = TypeUtils.getField(cls, strDecapitalize, fieldArr);
                                            if (field == null) {
                                                z13 = false;
                                                if (parameterTypes5[0] == Boolean.TYPE) {
                                                    StringBuilder sb4 = new StringBuilder();
                                                    sb4.append(ak.f104422ae);
                                                    sb4.append(Character.toUpperCase(strDecapitalize.charAt(0)));
                                                    z12 = true;
                                                    sb4.append(strDecapitalize.substring(1));
                                                    field = TypeUtils.getField(cls, sb4.toString(), fieldArr);
                                                } else {
                                                    z12 = true;
                                                }
                                            } else {
                                                z12 = true;
                                                z13 = false;
                                            }
                                            if (field != null) {
                                                jSONField4 = (JSONField) field.getAnnotation(JSONField.class);
                                                if (jSONField4 != null) {
                                                    if (jSONField4.deserialize()) {
                                                        fieldArr = fieldArr;
                                                    } else {
                                                        iOrdinal4 = jSONField4.ordinal();
                                                        iOf7 = SerializerFeature.of(jSONField4.serialzeFeatures());
                                                        iOf8 = Feature.of(jSONField4.parseFeatures());
                                                        if (jSONField4.name().length() != 0) {
                                                            add(arrayList, new FieldInfo(jSONField4.name(), method4, field, cls, type, iOrdinal4, iOf7, iOf8, superMethodAnnotation2, jSONField4, null));
                                                            fieldArr = fieldArr;
                                                        }
                                                    }
                                                    propertyNamingStrategy3 = propertyNamingStrategy3;
                                                }
                                                i11 = iOf8;
                                                jSONField3 = jSONField4;
                                            } else {
                                                i11 = iOf8;
                                                jSONField3 = null;
                                            }
                                            propertyNamingStrategy3 = propertyNamingStrategy3;
                                            if (propertyNamingStrategy3 != null) {
                                                strDecapitalize = propertyNamingStrategy3.translate(strDecapitalize);
                                            }
                                            fieldArr = fieldArr;
                                            add(arrayList, new FieldInfo(strDecapitalize, method4, field, cls, type, iOrdinal4, iOf7, i11, superMethodAnnotation2, jSONField3, null));
                                        }
                                    } else {
                                        methodArr = methodArr;
                                    }
                                }
                            }
                        }
                    }
                    cls6 = cls6;
                } else {
                    cls6 = cls3;
                }
                cls7 = cls4;
            }
            i26++;
            propertyNamingStrategy3 = propertyNamingStrategy3;
            methodArr = methodArr;
            fieldArr = fieldArr;
            cls5 = cls5;
            cls4 = cls7;
            cls3 = cls6;
            length6 = length6;
            str = str;
        }
        Class<?> cls18 = cls5;
        Field[] fieldArr5 = fieldArr;
        PropertyNamingStrategy propertyNamingStrategy6 = propertyNamingStrategy3;
        int i27 = 3;
        computeFields(cls, type, propertyNamingStrategy6, arrayList, cls.getFields());
        Method[] methods3 = cls.getMethods();
        int length7 = methods3.length;
        int i28 = 0;
        while (i28 < length7) {
            Method method5 = methods3[i28];
            String name4 = method5.getName();
            if (name4.length() >= 4 && !Modifier.isStatic(method5.getModifiers()) && cls18 == null && name4.startsWith("get") && Character.isUpperCase(name4.charAt(i27)) && method5.getParameterTypes().length == 0 && ((Collection.class.isAssignableFrom(method5.getReturnType()) || Map.class.isAssignableFrom(method5.getReturnType()) || AtomicBoolean.class == method5.getReturnType() || AtomicInteger.class == method5.getReturnType() || AtomicLong.class == method5.getReturnType()) && ((jSONField = (JSONField) method5.getAnnotation(JSONField.class)) == null || !jSONField.deserialize()))) {
                if (jSONField == null || jSONField.name().length() <= 0) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(Character.toLowerCase(name4.charAt(i27)));
                    c10 = 4;
                    sb5.append(name4.substring(4));
                    string = sb5.toString();
                    fieldArr3 = fieldArr5;
                    Field field5 = TypeUtils.getField(cls, string, fieldArr3);
                    if (field5 == null || (jSONField2 = (JSONField) field5.getAnnotation(JSONField.class)) == null || jSONField2.deserialize()) {
                    }
                    fieldArr2 = fieldArr3;
                } else {
                    string = jSONField.name();
                    fieldArr3 = fieldArr5;
                    c10 = 4;
                }
                if (propertyNamingStrategy6 != null) {
                    string = propertyNamingStrategy6.translate(string);
                }
                String str9 = string;
                if (getField(arrayList, str9) != null) {
                    fieldArr2 = fieldArr3;
                } else {
                    fieldArr2 = fieldArr3;
                    i28 = i28;
                    length7 = length7;
                    methods3 = methods3;
                    add(arrayList, new FieldInfo(str9, method5, null, cls, type, 0, 0, 0, jSONField, null, null));
                }
                i28++;
                methods3 = methods3;
                length7 = length7;
                i27 = i27;
                fieldArr5 = fieldArr2;
            } else {
                fieldArr2 = fieldArr5;
            }
            i28++;
            methods3 = methods3;
            length7 = length7;
            i27 = i27;
            fieldArr5 = fieldArr2;
        }
        return new JavaBeanInfo(cls, cls18, defaultConstructor, creatorConstructor, method2, method, jSONType, arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x006f  */
    /* JADX WARN: Code duplicated, block: B:35:0x007e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0085  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:51:0x006b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:6:0x0012  */
    private static void computeFields(Class<?> cls, Type type, PropertyNamingStrategy propertyNamingStrategy, List<FieldInfo> list, Field[] fieldArr) {
        Iterator<FieldInfo> it;
        String name;
        JSONField jSONField;
        int i10;
        int i11;
        int i12;
        for (Field field : fieldArr) {
            int modifiers = field.getModifiers();
            if ((modifiers & 8) == 0) {
                boolean z10 = true;
                if ((modifiers & 16) != 0) {
                    Class<?> type2 = field.getType();
                    if (Map.class.isAssignableFrom(type2) || Collection.class.isAssignableFrom(type2) || AtomicLong.class.equals(type2) || AtomicInteger.class.equals(type2) || AtomicBoolean.class.equals(type2)) {
                        it = list.iterator();
                        do {
                            if (it.hasNext()) {
                                z10 = false;
                                break;
                            }
                        } while (!it.next().name.equals(field.getName()));
                        if (z10) {
                            name = field.getName();
                            jSONField = (JSONField) field.getAnnotation(JSONField.class);
                            if (jSONField != null) {
                                i10 = 0;
                                i11 = 0;
                                i12 = 0;
                            } else if (!jSONField.deserialize()) {
                                int iOrdinal = jSONField.ordinal();
                                int iOf = SerializerFeature.of(jSONField.serialzeFeatures());
                                int iOf2 = Feature.of(jSONField.parseFeatures());
                                if (jSONField.name().length() != 0) {
                                    name = jSONField.name();
                                }
                                i10 = iOrdinal;
                                i11 = iOf;
                                i12 = iOf2;
                            }
                            if (propertyNamingStrategy != null) {
                                name = propertyNamingStrategy.translate(name);
                            }
                            add(list, new FieldInfo(name, null, field, cls, type, i10, i11, i12, null, jSONField, null));
                        }
                    }
                } else {
                    it = list.iterator();
                    do {
                        if (it.hasNext()) {
                            z10 = false;
                            break;
                        }
                    } while (!it.next().name.equals(field.getName()));
                    if (z10) {
                        name = field.getName();
                        jSONField = (JSONField) field.getAnnotation(JSONField.class);
                        if (jSONField != null) {
                            i10 = 0;
                            i11 = 0;
                            i12 = 0;
                        } else if (!jSONField.deserialize()) {
                            int iOrdinal2 = jSONField.ordinal();
                            int iOf3 = SerializerFeature.of(jSONField.serialzeFeatures());
                            int iOf4 = Feature.of(jSONField.parseFeatures());
                            if (jSONField.name().length() != 0) {
                                name = jSONField.name();
                            }
                            i10 = iOrdinal2;
                            i11 = iOf3;
                            i12 = iOf4;
                        }
                        if (propertyNamingStrategy != null) {
                            name = propertyNamingStrategy.translate(name);
                        }
                        add(list, new FieldInfo(name, null, field, cls, type, i10, i11, i12, null, jSONField, null));
                    }
                }
            }
        }
    }

    public static Class<?> getBuilderClass(JSONType jSONType) {
        return getBuilderClass(null, jSONType);
    }

    public static Class<?> getBuilderClass(Class<?> cls, JSONType jSONType) {
        Class<?> clsBuilder;
        if (cls != null && cls.getName().equals("org.springframework.security.web.savedrequest.DefaultSavedRequest")) {
            return TypeUtils.loadClass("org.springframework.security.web.savedrequest.DefaultSavedRequest$Builder");
        }
        if (jSONType == null || (clsBuilder = jSONType.builder()) == Void.class) {
            return null;
        }
        return clsBuilder;
    }

    public static Constructor<?> getCreatorConstructor(Constructor[] constructorArr) {
        boolean z10;
        Constructor constructor = null;
        for (Constructor constructor2 : constructorArr) {
            if (((JSONCreator) constructor2.getAnnotation(JSONCreator.class)) != null) {
                if (constructor != null) {
                    throw new JSONException("multi-JSONCreator");
                }
                constructor = constructor2;
            }
        }
        if (constructor != null) {
            return constructor;
        }
        for (Constructor constructor3 : constructorArr) {
            Annotation[][] parameterAnnotations = constructor3.getParameterAnnotations();
            if (parameterAnnotations.length != 0) {
                int length = parameterAnnotations.length;
                int i10 = 0;
                while (true) {
                    z10 = true;
                    if (i10 >= length) {
                        break;
                    }
                    Annotation[] annotationArr = parameterAnnotations[i10];
                    int length2 = annotationArr.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length2) {
                            z10 = false;
                            break;
                        }
                        if (annotationArr[i11] instanceof JSONField) {
                            break;
                        }
                        i11++;
                    }
                    if (!z10) {
                        z10 = false;
                        break;
                    }
                    i10++;
                }
                if (!z10) {
                    continue;
                } else {
                    if (constructor != null) {
                        throw new JSONException("multi-JSONCreator");
                    }
                    constructor = constructor3;
                }
            }
        }
        return constructor;
    }

    static Constructor<?> getDefaultConstructor(Class<?> cls, Constructor<?>[] constructorArr) {
        Constructor<?> constructor = null;
        if (Modifier.isAbstract(cls.getModifiers())) {
            return null;
        }
        for (Constructor<?> constructor2 : constructorArr) {
            if (constructor2.getParameterTypes().length == 0) {
                constructor = constructor2;
                break;
            }
        }
        if (constructor != null || !cls.isMemberClass() || Modifier.isStatic(cls.getModifiers())) {
            return constructor;
        }
        for (Constructor<?> constructor3 : constructorArr) {
            Class<?>[] parameterTypes = constructor3.getParameterTypes();
            if (parameterTypes.length == 1 && parameterTypes[0].equals(cls.getDeclaringClass())) {
                return constructor3;
            }
        }
        return constructor;
    }

    private static Method getFactoryMethod(Class<?> cls, Method[] methodArr) {
        Method method = null;
        for (Method method2 : methodArr) {
            if (Modifier.isStatic(method2.getModifiers()) && cls.isAssignableFrom(method2.getReturnType()) && ((JSONCreator) method2.getAnnotation(JSONCreator.class)) != null) {
                if (method != null) {
                    throw new JSONException("multi-JSONCreator");
                }
                method = method2;
            }
        }
        return method;
    }

    private static FieldInfo getField(List<FieldInfo> list, String str) {
        for (FieldInfo fieldInfo : list) {
            if (fieldInfo.name.equals(str)) {
                return fieldInfo;
            }
            Field field = fieldInfo.field;
            if (field != null && fieldInfo.getAnnotation() != null && field.getName().equals(str)) {
                return fieldInfo;
            }
        }
        return null;
    }
}
