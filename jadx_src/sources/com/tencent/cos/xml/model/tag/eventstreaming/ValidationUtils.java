package com.tencent.cos.xml.model.tag.eventstreaming;

import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public class ValidationUtils {
    public static void assertAllAreNull(String str, Object... objArr) throws IllegalArgumentException {
        for (Object obj : objArr) {
            if (obj != null) {
                throw new IllegalArgumentException(str);
            }
        }
    }

    public static int assertIsPositive(int i10, String str) {
        if (i10 > 0) {
            return i10;
        }
        throw new IllegalArgumentException(String.format("%s must be positive", str));
    }

    public static <T extends Collection<?>> T assertNotEmpty(T t10, String str) throws IllegalArgumentException {
        assertNotNull(t10, str);
        if (t10.isEmpty()) {
            throw new IllegalArgumentException(String.format("%s cannot be empty", str));
        }
        return t10;
    }

    public static <T> T[] assertNotEmpty(T[] tArr, String str) throws IllegalArgumentException {
        assertNotNull(tArr, str);
        if (tArr.length != 0) {
            return tArr;
        }
        throw new IllegalArgumentException(String.format("%s cannot be empty", str));
    }

    public static <T> T assertNotNull(T t10, String str) throws IllegalArgumentException {
        if (t10 != null) {
            return t10;
        }
        throw new IllegalArgumentException(String.format("%s cannot be null", str));
    }

    public static String assertStringNotEmpty(String str, String str2) throws IllegalArgumentException {
        assertNotNull(str, str2);
        if (str.isEmpty()) {
            throw new IllegalArgumentException(String.format("%s cannot be empty", str2));
        }
        return str;
    }
}
