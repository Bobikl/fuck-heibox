package com.google.common.base;

import java.util.Arrays;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Objects.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b
@g
public final class s extends h {
    private s() {
    }

    public static boolean a(@CheckForNull Object obj, @CheckForNull Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int b(@CheckForNull Object... objArr) {
        return Arrays.hashCode(objArr);
    }
}
