package com.max.xiaoheihe.accelworld;

import android.annotation.SuppressLint;
import com.max.hbmmkv.MMKVManager;
import com.max.hbutils.bean.Result;
import com.max.hbutils.core.BaseApplication;
import com.max.xiaoheihe.bean.game.QueryPackageListObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AccelWorldInstallPackage.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class i {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: AccelWorldInstallPackage.kt */
    public static final class a extends com.max.hbcommon.network.d<Result<QueryPackageListObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, bb.c.m.Tv, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
        }

        public void onNext(@dl.d Result<QueryPackageListObj> t10) {
            List<String> package_list;
            if (PatchProxy.proxy(new Object[]{t10}, this, changeQuickRedirect, false, bb.c.m.Uv, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(t10, "t");
            super.onNext(t10);
            QueryPackageListObj result = t10.getResult();
            if (result == null || (package_list = result.getPackage_list()) == null) {
                return;
            }
            if (!(true ^ package_list.isEmpty())) {
                package_list = null;
            }
            if (package_list != null) {
                BaseApplication baseApplicationA = BaseApplication.a();
                ArrayList arrayList = new ArrayList();
                for (String str : package_list) {
                    if (com.max.xiaoheihe.utils.d.H0(baseApplicationA, str)) {
                        arrayList.add(str);
                    }
                }
                i.b(arrayList);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.Vv, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<QueryPackageListObj>) obj);
        }
    }

    @SuppressLint({"CheckResult"})
    public static final void a() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.m.Rv, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.i.a().g2().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new a());
    }

    @SuppressLint({"CheckResult"})
    public static final void b(@dl.d List<String> packageList) {
        if (PatchProxy.proxy(new Object[]{packageList}, null, changeQuickRedirect, true, bb.c.m.Sv, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(packageList, "packageList");
        MMKVManager mMKVManager = MMKVManager.f71329a;
        if (l.a(com.max.hbutils.utils.k.b(mMKVManager.i("common", ad.c.f1230j, null, false), String.class), packageList)) {
            return;
        }
        mMKVManager.o("common", ad.c.f1230j, com.max.hbutils.utils.k.r(packageList), false);
        com.max.xiaoheihe.network.i.a().C7(CollectionsKt___CollectionsKt.h3(packageList, Constants.ACCEPT_TIME_SEPARATOR_SP, null, null, 0, null, null, 62, null)).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new com.max.hbcommon.network.p());
    }
}
