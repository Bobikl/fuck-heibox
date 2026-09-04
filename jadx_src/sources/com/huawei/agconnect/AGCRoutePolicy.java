package com.huawei.agconnect;

import com.huawei.hms.feature.dynamic.f.e;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class AGCRoutePolicy {
    private final int route;
    public static final AGCRoutePolicy UNKNOWN = new AGCRoutePolicy(0);
    public static final AGCRoutePolicy CHINA = new AGCRoutePolicy(1);
    public static final AGCRoutePolicy GERMANY = new AGCRoutePolicy(2);
    public static final AGCRoutePolicy RUSSIA = new AGCRoutePolicy(3);
    public static final AGCRoutePolicy SINGAPORE = new AGCRoutePolicy(4);

    private AGCRoutePolicy(int i10) {
        this.route = i10;
    }

    private int hash(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && AGCRoutePolicy.class == obj.getClass() && this.route == ((AGCRoutePolicy) obj).route;
    }

    public String getRouteName() {
        int i10 = this.route;
        if (i10 == 1) {
            return e.f60734e;
        }
        if (i10 == 2) {
            return "DE";
        }
        if (i10 != 3) {
            return i10 != 4 ? "UNKNOWN" : "SG";
        }
        return "RU";
    }

    public int hashCode() {
        return hash(Integer.valueOf(this.route));
    }
}
