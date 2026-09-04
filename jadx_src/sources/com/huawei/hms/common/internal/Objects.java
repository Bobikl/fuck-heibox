package com.huawei.hms.common.internal;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class Objects {

    public static final class ToStringHelper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<String> f60539a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f60540b;

        private ToStringHelper(Object obj) {
            this.f60540b = Preconditions.checkNotNull(obj);
            this.f60539a = new ArrayList();
        }

        public final ToStringHelper add(String str, Object obj) {
            String str2 = (String) Preconditions.checkNotNull(str);
            String strValueOf = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(str2.length() + strValueOf.length() + 1);
            sb2.append(str2);
            sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb2.append(strValueOf);
            this.f60539a.add(sb2.toString());
            return this;
        }

        public final String toString() {
            String simpleName = this.f60540b.getClass().getSimpleName();
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append(simpleName);
            sb2.append('{');
            int size = this.f60539a.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append(this.f60539a.get(i10));
                if (i10 < size - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append('}');
            return sb2.toString();
        }
    }

    private Objects() {
        throw new AssertionError("Uninstantiable");
    }

    public static boolean equal(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        return obj != null && obj.equals(obj2);
    }

    public static int hashCode(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static ToStringHelper toStringHelper(Object obj) {
        return new ToStringHelper(obj);
    }
}
