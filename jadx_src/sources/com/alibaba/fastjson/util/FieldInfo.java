package com.alibaba.fastjson.util;

import com.alibaba.fastjson.annotation.JSONField;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import kotlin.text.y;

/* JADX INFO: loaded from: classes6.dex */
public class FieldInfo implements Comparable<FieldInfo> {
    public final String[] alternateNames;
    public final Class<?> declaringClass;
    public final Field field;
    public final boolean fieldAccess;
    private final JSONField fieldAnnotation;
    public final Class<?> fieldClass;
    public final boolean fieldTransient;
    public final Type fieldType;
    public final String format;
    public final boolean getOnly;
    public final boolean isEnum;
    public final boolean jsonDirect;
    public final String label;
    public final Method method;
    private final JSONField methodAnnotation;
    public final String name;
    public final char[] name_chars;
    private int ordinal;
    public final int parserFeatures;
    public final int serialzeFeatures;
    public final boolean unwrapped;

    public FieldInfo(String str, Class<?> cls, Class<?> cls2, Type type, Field field, int i10, int i11, int i12) {
        this.name = str;
        this.declaringClass = cls;
        this.fieldClass = cls2;
        this.fieldType = type;
        this.method = null;
        this.field = field;
        this.ordinal = i10;
        this.serialzeFeatures = i11;
        this.parserFeatures = i12;
        this.isEnum = cls2.isEnum();
        if (field != null) {
            int modifiers = field.getModifiers();
            int i13 = modifiers & 1;
            this.fieldAccess = true;
            this.fieldTransient = Modifier.isTransient(modifiers);
        } else {
            this.fieldTransient = false;
            this.fieldAccess = false;
        }
        this.name_chars = genFieldNameChars();
        if (field != null) {
            TypeUtils.setAccessible(field);
        }
        this.label = "";
        this.fieldAnnotation = null;
        this.methodAnnotation = null;
        this.getOnly = false;
        this.jsonDirect = false;
        this.unwrapped = false;
        this.format = null;
        this.alternateNames = new String[0];
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0041  */
    /* JADX WARN: Code duplicated, block: B:16:0x004e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0060  */
    /* JADX WARN: Code duplicated, block: B:25:0x0064  */
    /* JADX WARN: Code duplicated, block: B:30:0x0073  */
    /* JADX WARN: Code duplicated, block: B:33:0x007e  */
    /* JADX WARN: Code duplicated, block: B:36:0x008d  */
    /* JADX WARN: Code duplicated, block: B:38:0x009f  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:74:0x012d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x0130  */
    /* JADX WARN: Code duplicated, block: B:79:0x0137  */
    /* JADX WARN: Code duplicated, block: B:81:0x013b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0140  */
    /* JADX WARN: Code duplicated, block: B:84:0x0144  */
    public FieldInfo(String str, Method method, Field field, Class<?> cls, Type type, int i10, int i11, int i12, JSONField jSONField, JSONField jSONField2, String str2) {
        String name;
        JSONField annotation;
        String str3;
        boolean zJsonDirect;
        boolean zIsFinal;
        Class<?> cls2;
        Type type2;
        boolean z10;
        Type type3;
        Class<?> cls3;
        Type fieldType;
        Class<?> cls4;
        Type inheritGenericType;
        Class<?>[] parameterTypes;
        Class<?> cls5;
        Class<?> cls6;
        Type genericReturnType;
        Class<?> returnType;
        Type type4;
        int modifiers;
        boolean z11;
        boolean z12;
        Type type5 = type;
        boolean z13 = false;
        this.ordinal = 0;
        if (field != null) {
            name = field.getName();
            if (!name.equals(str)) {
            }
            this.name = name;
            this.method = method;
            this.field = field;
            this.ordinal = i10;
            this.serialzeFeatures = i11;
            this.parserFeatures = i12;
            this.fieldAnnotation = jSONField;
            this.methodAnnotation = jSONField2;
            if (field != null) {
                modifiers = field.getModifiers();
                if ((modifiers & 1) == 0 || method == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.fieldAccess = z11;
                if (!Modifier.isTransient(modifiers) || TypeUtils.isTransient(method)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.fieldTransient = z12;
            } else {
                this.fieldAccess = false;
                this.fieldTransient = false;
            }
            if (str2 != null || str2.length() <= 0) {
                this.label = "";
            } else {
                this.label = str2;
            }
            annotation = getAnnotation();
            str3 = null;
            if (annotation != null) {
                String str4 = annotation.format();
                str3 = str4.trim().length() != 0 ? str4 : null;
                zJsonDirect = annotation.jsonDirect();
                this.unwrapped = annotation.unwrapped();
                this.alternateNames = annotation.alternateNames();
            } else {
                this.unwrapped = false;
                this.alternateNames = new String[0];
                zJsonDirect = false;
            }
            this.format = str3;
            this.name_chars = genFieldNameChars();
            if (method != null) {
                TypeUtils.setAccessible(method);
            }
            if (field != null) {
                TypeUtils.setAccessible(field);
            }
            if (method != null) {
                parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1) {
                    cls6 = parameterTypes[0];
                    type4 = method.getGenericParameterTypes()[0];
                } else {
                    if (parameterTypes.length != 2 && (cls5 = parameterTypes[0]) == String.class && parameterTypes[1] == Object.class) {
                        cls6 = cls5;
                        type4 = cls5;
                    } else {
                        zIsFinal = true;
                        returnType = method.getReturnType();
                        genericReturnType = method.getGenericReturnType();
                    }
                    this.declaringClass = method.getDeclaringClass();
                    cls2 = returnType;
                    type2 = genericReturnType;
                }
                zIsFinal = false;
                returnType = cls6;
                genericReturnType = type4;
                this.declaringClass = method.getDeclaringClass();
                cls2 = returnType;
                type2 = genericReturnType;
            } else {
                Class<?> type6 = field.getType();
                Type genericType = field.getGenericType();
                this.declaringClass = field.getDeclaringClass();
                zIsFinal = Modifier.isFinal(field.getModifiers());
                cls2 = type6;
                type2 = genericType;
            }
            this.getOnly = zIsFinal;
            if (zJsonDirect && cls2 == String.class) {
                z13 = true;
            }
            this.jsonDirect = z13;
            if (cls == null && cls2 == Object.class && (type2 instanceof TypeVariable) && (inheritGenericType = getInheritGenericType(cls, type5, (TypeVariable) type2)) != null) {
                this.fieldClass = TypeUtils.getClass(inheritGenericType);
                this.fieldType = inheritGenericType;
                this.isEnum = cls2.isEnum();
                return;
            }
            z10 = type2 instanceof Class;
            cls3 = cls2;
            type3 = type2;
            if (!z10) {
                fieldType = getFieldType(cls, type5 == null ? cls : type5, type2);
                cls4 = cls2;
                if (fieldType != type2) {
                    if (fieldType instanceof ParameterizedType) {
                        cls4 = TypeUtils.getClass(fieldType);
                    } else if (fieldType instanceof Class) {
                        cls4 = cls2;
                        cls4 = TypeUtils.getClass(fieldType);
                    }
                }
                cls4 = cls2;
                type3 = fieldType;
                cls3 = cls4;
            }
            this.fieldType = type3;
            this.fieldClass = cls3;
            this.isEnum = cls3.isEnum();
        }
        name = str;
        this.name = name;
        this.method = method;
        this.field = field;
        this.ordinal = i10;
        this.serialzeFeatures = i11;
        this.parserFeatures = i12;
        this.fieldAnnotation = jSONField;
        this.methodAnnotation = jSONField2;
        if (field != null) {
            modifiers = field.getModifiers();
            if ((modifiers & 1) == 0) {
                z11 = true;
            } else {
                z11 = true;
            }
            this.fieldAccess = z11;
            if (Modifier.isTransient(modifiers)) {
                z12 = true;
            } else {
                z12 = true;
            }
            this.fieldTransient = z12;
        } else {
            this.fieldAccess = false;
            this.fieldTransient = false;
        }
        if (str2 != null) {
            this.label = "";
        } else {
            this.label = "";
        }
        annotation = getAnnotation();
        str3 = null;
        if (annotation != null) {
            String str5 = annotation.format();
            if (str5.trim().length() != 0) {
            }
            zJsonDirect = annotation.jsonDirect();
            this.unwrapped = annotation.unwrapped();
            this.alternateNames = annotation.alternateNames();
        } else {
            this.unwrapped = false;
            this.alternateNames = new String[0];
            zJsonDirect = false;
        }
        this.format = str3;
        this.name_chars = genFieldNameChars();
        if (method != null) {
            TypeUtils.setAccessible(method);
        }
        if (field != null) {
            TypeUtils.setAccessible(field);
        }
        if (method != null) {
            parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 1) {
                cls6 = parameterTypes[0];
                type4 = method.getGenericParameterTypes()[0];
            } else {
                if (parameterTypes.length != 2) {
                }
                zIsFinal = true;
                returnType = method.getReturnType();
                genericReturnType = method.getGenericReturnType();
                this.declaringClass = method.getDeclaringClass();
                cls2 = returnType;
                type2 = genericReturnType;
            }
            zIsFinal = false;
            returnType = cls6;
            genericReturnType = type4;
            this.declaringClass = method.getDeclaringClass();
            cls2 = returnType;
            type2 = genericReturnType;
        } else {
            Class<?> type7 = field.getType();
            Type genericType2 = field.getGenericType();
            this.declaringClass = field.getDeclaringClass();
            zIsFinal = Modifier.isFinal(field.getModifiers());
            cls2 = type7;
            type2 = genericType2;
        }
        this.getOnly = zIsFinal;
        if (zJsonDirect) {
            z13 = true;
        }
        this.jsonDirect = z13;
        if (cls == null) {
        }
        z10 = type2 instanceof Class;
        cls3 = cls2;
        type3 = type2;
        if (!z10) {
            fieldType = getFieldType(cls, type5 == null ? cls : type5, type2);
            cls4 = cls2;
            if (fieldType != type2) {
                if (fieldType instanceof ParameterizedType) {
                    cls4 = TypeUtils.getClass(fieldType);
                } else if (fieldType instanceof Class) {
                    cls4 = cls2;
                    cls4 = TypeUtils.getClass(fieldType);
                }
            }
            cls4 = cls2;
            type3 = fieldType;
            cls3 = cls4;
        }
        this.fieldType = type3;
        this.fieldClass = cls3;
        this.isEnum = cls3.isEnum();
    }

    private static boolean getArgument(Type[] typeArr, TypeVariable[] typeVariableArr, Type[] typeArr2) {
        if (typeArr2 == null || typeVariableArr.length == 0) {
            return false;
        }
        boolean z10 = false;
        for (int i10 = 0; i10 < typeArr.length; i10++) {
            Type type = typeArr[i10];
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                if (getArgument(actualTypeArguments, typeVariableArr, typeArr2)) {
                    typeArr[i10] = new ParameterizedTypeImpl(actualTypeArguments, parameterizedType.getOwnerType(), parameterizedType.getRawType());
                    z10 = true;
                }
            } else if (type instanceof TypeVariable) {
                for (int i11 = 0; i11 < typeVariableArr.length; i11++) {
                    if (type.equals(typeVariableArr[i11])) {
                        typeArr[i10] = typeArr2[i11];
                        z10 = true;
                    }
                }
            }
        }
        return z10;
    }

    public static Type getFieldType(Class<?> cls, Type type, Type type2) {
        TypeVariable<Class<?>>[] typeParameters;
        ParameterizedType parameterizedType;
        if (cls != null && type != null) {
            if (type2 instanceof GenericArrayType) {
                Type genericComponentType = ((GenericArrayType) type2).getGenericComponentType();
                Type fieldType = getFieldType(cls, type, genericComponentType);
                return genericComponentType != fieldType ? Array.newInstance(TypeUtils.getClass(fieldType), 0).getClass() : type2;
            }
            if (!TypeUtils.isGenericParamType(type)) {
                return type2;
            }
            if (type2 instanceof TypeVariable) {
                ParameterizedType parameterizedType2 = (ParameterizedType) TypeUtils.getGenericParamType(type);
                TypeVariable typeVariable = (TypeVariable) type2;
                TypeVariable<Class<?>>[] typeParameters2 = TypeUtils.getClass(parameterizedType2).getTypeParameters();
                for (int i10 = 0; i10 < typeParameters2.length; i10++) {
                    if (typeParameters2[i10].getName().equals(typeVariable.getName())) {
                        return parameterizedType2.getActualTypeArguments()[i10];
                    }
                }
            }
            if (type2 instanceof ParameterizedType) {
                ParameterizedType parameterizedType3 = (ParameterizedType) type2;
                Type[] actualTypeArguments = parameterizedType3.getActualTypeArguments();
                if (type instanceof ParameterizedType) {
                    parameterizedType = (ParameterizedType) type;
                    typeParameters = cls.getTypeParameters();
                } else if (cls.getGenericSuperclass() instanceof ParameterizedType) {
                    parameterizedType = (ParameterizedType) cls.getGenericSuperclass();
                    typeParameters = cls.getSuperclass().getTypeParameters();
                } else {
                    typeParameters = type.getClass().getTypeParameters();
                    parameterizedType = parameterizedType3;
                }
                if (getArgument(actualTypeArguments, typeParameters, parameterizedType.getActualTypeArguments())) {
                    return new ParameterizedTypeImpl(actualTypeArguments, parameterizedType3.getOwnerType(), parameterizedType3.getRawType());
                }
            }
        }
        return type2;
    }

    private static Type getInheritGenericType(Class<?> cls, Type type, TypeVariable<?> typeVariable) {
        Type[] actualTypeArguments;
        Class<?> cls2 = typeVariable.getGenericDeclaration() instanceof Class ? (Class) typeVariable.getGenericDeclaration() : null;
        if (cls2 == cls) {
            actualTypeArguments = type instanceof ParameterizedType ? ((ParameterizedType) type).getActualTypeArguments() : null;
        } else {
            Type[] typeArr = null;
            while (cls != null && cls != Object.class && cls != cls2) {
                Type genericSuperclass = cls.getGenericSuperclass();
                if (genericSuperclass instanceof ParameterizedType) {
                    Type[] actualTypeArguments2 = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
                    getArgument(actualTypeArguments2, cls.getTypeParameters(), typeArr);
                    typeArr = actualTypeArguments2;
                }
                cls = cls.getSuperclass();
            }
            actualTypeArguments = typeArr;
        }
        if (actualTypeArguments == null || cls2 == null) {
            return null;
        }
        TypeVariable<Class<?>>[] typeParameters = cls2.getTypeParameters();
        for (int i10 = 0; i10 < typeParameters.length; i10++) {
            if (typeVariable.equals(typeParameters[i10])) {
                return actualTypeArguments[i10];
            }
        }
        return null;
    }

    @Override // java.lang.Comparable
    public int compareTo(FieldInfo fieldInfo) {
        int i10 = this.ordinal;
        int i11 = fieldInfo.ordinal;
        if (i10 < i11) {
            return -1;
        }
        if (i10 > i11) {
            return 1;
        }
        int iCompareTo = this.name.compareTo(fieldInfo.name);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        Class<?> declaredClass = getDeclaredClass();
        Class<?> declaredClass2 = fieldInfo.getDeclaredClass();
        if (declaredClass != null && declaredClass2 != null && declaredClass != declaredClass2) {
            if (declaredClass.isAssignableFrom(declaredClass2)) {
                return -1;
            }
            if (declaredClass2.isAssignableFrom(declaredClass)) {
                return 1;
            }
        }
        Field field = this.field;
        boolean z10 = false;
        boolean z11 = field != null && field.getType() == this.fieldClass;
        Field field2 = fieldInfo.field;
        if (field2 != null && field2.getType() == fieldInfo.fieldClass) {
            z10 = true;
        }
        if (z11 && !z10) {
            return 1;
        }
        if (z10 && !z11) {
            return -1;
        }
        if (fieldInfo.fieldClass.isPrimitive() && !this.fieldClass.isPrimitive()) {
            return 1;
        }
        if (this.fieldClass.isPrimitive() && !fieldInfo.fieldClass.isPrimitive()) {
            return -1;
        }
        if (fieldInfo.fieldClass.getName().startsWith("java.") && !this.fieldClass.getName().startsWith("java.")) {
            return 1;
        }
        if (!this.fieldClass.getName().startsWith("java.") || fieldInfo.fieldClass.getName().startsWith("java.")) {
            return this.fieldClass.getName().compareTo(fieldInfo.fieldClass.getName());
        }
        return -1;
    }

    protected char[] genFieldNameChars() {
        int length = this.name.length();
        char[] cArr = new char[length + 3];
        String str = this.name;
        str.getChars(0, str.length(), cArr, 1);
        cArr[0] = y.f128593b;
        cArr[length + 1] = y.f128593b;
        cArr[length + 2] = ':';
        return cArr;
    }

    public Object get(Object obj) throws IllegalAccessException, InvocationTargetException {
        Method method = this.method;
        return method != null ? method.invoke(obj, new Object[0]) : this.field.get(obj);
    }

    public <T extends Annotation> T getAnnation(Class<T> cls) {
        Field field;
        if (cls == JSONField.class) {
            return getAnnotation();
        }
        T t10 = null;
        Method method = this.method;
        if (method != null) {
            t10 = (T) method.getAnnotation(cls);
        }
        return (t10 != null || (field = this.field) == null) ? t10 : (T) field.getAnnotation(cls);
    }

    public JSONField getAnnotation() {
        JSONField jSONField = this.fieldAnnotation;
        return jSONField != null ? jSONField : this.methodAnnotation;
    }

    protected Class<?> getDeclaredClass() {
        Method method = this.method;
        if (method != null) {
            return method.getDeclaringClass();
        }
        Field field = this.field;
        if (field != null) {
            return field.getDeclaringClass();
        }
        return null;
    }

    public String getFormat() {
        return this.format;
    }

    public Member getMember() {
        Method method = this.method;
        return method != null ? method : this.field;
    }

    public void set(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
        Method method = this.method;
        if (method != null) {
            method.invoke(obj, obj2);
        } else {
            this.field.set(obj, obj2);
        }
    }

    public void setAccessible() throws SecurityException {
        Method method = this.method;
        if (method != null) {
            TypeUtils.setAccessible(method);
        } else {
            TypeUtils.setAccessible(this.field);
        }
    }

    public String toString() {
        return this.name;
    }
}
