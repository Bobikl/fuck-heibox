package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@v8.a
public final class o {

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    @v8.a
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f52537a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f52538b;

        /* synthetic */ a(Object obj, e0 e0Var) {
            p.l(obj);
            this.f52538b = obj;
            this.f52537a = new ArrayList();
        }

        @s9.a
        @androidx.annotation.n0
        @v8.a
        public a a(@androidx.annotation.n0 String str, @androidx.annotation.p0 Object obj) {
            List list = this.f52537a;
            p.l(str);
            list.add(str + ContainerUtils.KEY_VALUE_DELIMITER + String.valueOf(obj));
            return this;
        }

        @androidx.annotation.n0
        @v8.a
        public String toString() {
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append(this.f52538b.getClass().getSimpleName());
            sb2.append('{');
            int size = this.f52537a.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append((String) this.f52537a.get(i10));
                if (i10 < size - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append('}');
            return sb2.toString();
        }
    }

    private o() {
        throw new AssertionError("Uninstantiable");
    }

    @v8.a
    public static boolean a(@androidx.annotation.n0 Bundle bundle, @androidx.annotation.n0 Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return bundle == bundle2;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        Set<String> setKeySet = bundle.keySet();
        if (!setKeySet.containsAll(bundle2.keySet())) {
            return false;
        }
        for (String str : setKeySet) {
            if (!b(bundle.get(str), bundle2.get(str))) {
                return false;
            }
        }
        return true;
    }

    @v8.a
    public static boolean b(@androidx.annotation.p0 Object obj, @androidx.annotation.p0 Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    @v8.a
    public static int c(@androidx.annotation.n0 Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @androidx.annotation.n0
    @v8.a
    public static a d(@androidx.annotation.n0 Object obj) {
        return new a(obj, null);
    }
}
