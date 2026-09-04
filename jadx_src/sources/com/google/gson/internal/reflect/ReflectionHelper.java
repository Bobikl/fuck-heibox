package com.google.gson.internal.reflect;

import com.google.gson.JsonIOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes7.dex */
public class ReflectionHelper {
    private ReflectionHelper() {
    }

    private static String constructorToString(Constructor<?> constructor) {
        StringBuilder sb2 = new StringBuilder(constructor.getDeclaringClass().getName());
        sb2.append('#');
        sb2.append(constructor.getDeclaringClass().getSimpleName());
        sb2.append('(');
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        for (int i10 = 0; i10 < parameterTypes.length; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(parameterTypes[i10].getSimpleName());
        }
        sb2.append(')');
        return sb2.toString();
    }

    public static void makeAccessible(Field field) throws JsonIOException {
        try {
            field.setAccessible(true);
        } catch (Exception e10) {
            throw new JsonIOException("Failed making field '" + field.getDeclaringClass().getName() + "#" + field.getName() + "' accessible; either change its visibility or write a custom TypeAdapter for its declaring type", e10);
        }
    }

    public static String tryMakeAccessible(Constructor<?> constructor) {
        try {
            constructor.setAccessible(true);
            return null;
        } catch (Exception e10) {
            return "Failed making constructor '" + constructorToString(constructor) + "' accessible; either change its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e10.getMessage();
        }
    }
}
