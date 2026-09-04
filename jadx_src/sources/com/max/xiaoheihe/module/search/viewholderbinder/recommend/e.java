package com.max.xiaoheihe.module.search.viewholderbinder.recommend;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.HeyBoxContentObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SearchRecVHBFactory.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class e implements cb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final e f91855a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f91856b = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    private e() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @dl.e
    public final g a(@dl.d f param, @dl.d HeyBoxContentObj data) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{param, data}, this, changeQuickRedirect, false, 43443, new Class[]{f.class, HeyBoxContentObj.class}, g.class);
        if (patchProxyResultProxy.isSupported) {
            return (g) patchProxyResultProxy.result;
        }
        f0.p(param, "param");
        f0.p(data, "data");
        String type = data.getType();
        if (type != null) {
            switch (type.hashCode()) {
                case -1396342996:
                    if (type.equals("banner")) {
                        return new a(param);
                    }
                    break;
                case 3165170:
                    if (type.equals("game")) {
                        return new b(param);
                    }
                    break;
                case 3343892:
                    if (type.equals("mall")) {
                        return new d(param);
                    }
                    break;
                case 177089960:
                    if (type.equals(HeyBoxContentObj.TYPE_LINKING)) {
                        return new c(param);
                    }
                    break;
            }
        }
        return null;
    }
}
