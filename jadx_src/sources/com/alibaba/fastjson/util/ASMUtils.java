package com.alibaba.fastjson.util;

import androidx.exifinterface.media.a;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.asm.ClassReader;
import com.alibaba.fastjson.asm.TypeCollector;
import com.meituan.robust.Constants;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes6.dex */
public class ASMUtils {
    public static final boolean IS_ANDROID;
    public static final String JAVA_VM_NAME;

    static {
        String property = System.getProperty("java.vm.name");
        JAVA_VM_NAME = property;
        IS_ANDROID = isAndroid(property);
    }

    public static boolean checkName(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < 1 || cCharAt > 127 || cCharAt == '.') {
                return false;
            }
        }
        return true;
    }

    public static String desc(Class<?> cls) {
        if (cls.isPrimitive()) {
            return getPrimitiveLetter(cls);
        }
        if (cls.isArray()) {
            return Constants.ARRAY_TYPE + desc(cls.getComponentType());
        }
        return "L" + type(cls) + ";";
    }

    public static String desc(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        StringBuilder sb2 = new StringBuilder((parameterTypes.length + 1) << 4);
        sb2.append('(');
        for (Class<?> cls : parameterTypes) {
            sb2.append(desc(cls));
        }
        sb2.append(')');
        sb2.append(desc(method.getReturnType()));
        return sb2.toString();
    }

    public static Type getMethodType(Class<?> cls, String str) {
        try {
            return cls.getMethod(str, new Class[0]).getGenericReturnType();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getPrimitiveLetter(Class<?> cls) {
        if (Integer.TYPE == cls) {
            return "I";
        }
        if (Void.TYPE == cls) {
            return a.X4;
        }
        if (Boolean.TYPE == cls) {
            return "Z";
        }
        if (Character.TYPE == cls) {
            return "C";
        }
        if (Byte.TYPE == cls) {
            return "B";
        }
        if (Short.TYPE == cls) {
            return a.R4;
        }
        if (Float.TYPE == cls) {
            return "F";
        }
        if (Long.TYPE == cls) {
            return "J";
        }
        if (Double.TYPE == cls) {
            return "D";
        }
        throw new IllegalStateException("Type: " + cls.getCanonicalName() + " is not a primitive type");
    }

    public static boolean isAndroid(String str) {
        if (str == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        return lowerCase.contains("dalvik") || lowerCase.contains("lemur");
    }

    public static String[] lookupParameterNames(AccessibleObject accessibleObject) {
        Class<?>[] parameterTypes;
        Class<?> declaringClass;
        Annotation[][] parameterAnnotations;
        String name;
        String strName;
        if (IS_ANDROID) {
            return new String[0];
        }
        if (accessibleObject instanceof Method) {
            Method method = (Method) accessibleObject;
            parameterTypes = method.getParameterTypes();
            name = method.getName();
            declaringClass = method.getDeclaringClass();
            parameterAnnotations = method.getParameterAnnotations();
        } else {
            Constructor constructor = (Constructor) accessibleObject;
            parameterTypes = constructor.getParameterTypes();
            declaringClass = constructor.getDeclaringClass();
            parameterAnnotations = constructor.getParameterAnnotations();
            name = "<init>";
        }
        if (parameterTypes.length == 0) {
            return new String[0];
        }
        ClassLoader classLoader = declaringClass.getClassLoader();
        if (classLoader == null) {
            classLoader = ClassLoader.getSystemClassLoader();
        }
        InputStream resourceAsStream = classLoader.getResourceAsStream(declaringClass.getName().replace(lg.a.f131414g, com.tencent.qcloud.core.util.IOUtils.DIR_SEPARATOR_UNIX) + ".class");
        try {
            if (resourceAsStream == null) {
                return new String[0];
            }
            ClassReader classReader = new ClassReader(resourceAsStream, false);
            TypeCollector typeCollector = new TypeCollector(name, parameterTypes);
            classReader.accept(typeCollector);
            String[] parameterNamesForMethod = typeCollector.getParameterNamesForMethod();
            for (int i10 = 0; i10 < parameterNamesForMethod.length; i10++) {
                Annotation[] annotationArr = parameterAnnotations[i10];
                if (annotationArr != null) {
                    for (Annotation annotation : annotationArr) {
                        if ((annotation instanceof JSONField) && (strName = ((JSONField) annotation).name()) != null && strName.length() > 0) {
                            parameterNamesForMethod[i10] = strName;
                        }
                    }
                }
            }
            return parameterNamesForMethod;
        } catch (IOException unused) {
            return new String[0];
        } finally {
            IOUtils.close(resourceAsStream);
        }
    }

    public static String type(Class<?> cls) {
        if (!cls.isArray()) {
            return !cls.isPrimitive() ? cls.getName().replace(lg.a.f131414g, com.tencent.qcloud.core.util.IOUtils.DIR_SEPARATOR_UNIX) : getPrimitiveLetter(cls);
        }
        return Constants.ARRAY_TYPE + desc(cls.getComponentType());
    }
}
