package com.zhpan.indicator.drawer;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: DrawerFactory.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/zhpan/indicator/drawer/d;", "", "Lch/b;", "indicatorOptions", "Lcom/zhpan/indicator/drawer/f;", ak.av, "<init>", "()V", "indicator_release"}, k = 1, mv = {1, 4, 0})
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f108086a = new d();

    private d() {
    }

    @dl.d
    public final f a(@dl.d ch.b indicatorOptions) {
        f0.q(indicatorOptions, "indicatorOptions");
        int f35649b = indicatorOptions.getF35649b();
        if (f35649b != 2) {
            return f35649b != 4 ? new b(indicatorOptions) : new h(indicatorOptions);
        }
        return new c(indicatorOptions);
    }
}
