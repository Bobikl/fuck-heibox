package com.max.xiaoheihe.dynamic_so;

import android.annotation.SuppressLint;
import com.max.hbcommon.network.d;
import com.max.hbcommon.utils.c;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.k;
import com.max.xiaoheihe.bean.dynamicso.DynamicList;
import com.max.xiaoheihe.loader.bean.dynamic_so.DynamicSoInfoObj;
import com.max.xiaoheihe.loader.dynamic_so.DynamicSoManager;
import com.max.xiaoheihe.network.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.schedulers.b;
import java.io.File;
import java.util.Iterator;

/* JADX INFO: compiled from: DynamicSoUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f77017a = "DynamicSoUtils";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f77018b = "arm64-v8a";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: com.max.xiaoheihe.dynamic_so.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DynamicSoUtils.java */
    public class C0625a extends d<Result<DynamicList>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        C0625a() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 21963, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onError(th2);
        }

        public void onNext(Result<DynamicList> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 21962, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onNext(result);
            if (result.getResult() == null || c.w(result.getResult().getSo_list())) {
                return;
            }
            Iterator<DynamicSoInfoObj> it = result.getResult().getSo_list().iterator();
            while (it.hasNext()) {
                DynamicSoManager.i().l(it.next());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 21964, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<DynamicList>) obj);
        }
    }

    @SuppressLint({"CheckResult"})
    public static void a(String str) {
        if (PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 21960, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        i.a().B2(f77018b, str).I5(b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new C0625a());
    }

    public static void b() {
        DynamicSoInfoObj dynamicSoInfoObj;
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 21961, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        for (String str : com.max.xiaoheihe.loader.dynamic_so.a.f77297c) {
            String strJ = com.max.hbcache.c.j(com.max.hbcache.c.F0 + str);
            if (!c.u(strJ) && (dynamicSoInfoObj = (DynamicSoInfoObj) k.a(strJ, DynamicSoInfoObj.class)) != null) {
                File file = new File(DynamicSoManager.f77251f + str + DynamicSoManager.f77250e);
                if (file.exists() && file.isFile()) {
                    DynamicSoManager.i().m(str, dynamicSoInfoObj, file);
                }
            }
        }
    }
}
