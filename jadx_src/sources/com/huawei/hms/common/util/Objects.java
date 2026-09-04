package com.huawei.hms.common.util;

import com.huawei.hms.common.Preconditions;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class Objects {

    public static final class ToStringHelper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<String> f60592a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f60593b;

        public ToStringHelper(Object obj) {
            this.f60593b = Preconditions.checkNotNull(obj);
            this.f60592a = new ArrayList();
        }

        public ToStringHelper add(String str, Object obj) {
            String str2 = (String) Preconditions.checkNotNull(str);
            String strValueOf = String.valueOf(obj);
            this.f60592a.add(str2 + ContainerUtils.KEY_VALUE_DELIMITER + strValueOf);
            return this;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append(this.f60593b.getClass().getSimpleName());
            sb2.append('{');
            int size = this.f60592a.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append(this.f60592a.get(i10));
                if (i10 < size - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append('}');
            return sb2.toString();
        }
    }

    public Objects() {
        throw new AssertionError("illegal argument");
    }

    public static boolean equal(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int hashCode(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static ToStringHelper toStringHelper(Object obj) {
        return new ToStringHelper(obj);
    }
}
