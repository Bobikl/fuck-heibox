package com.max.xiaoheihe.module.miniprogram;

import android.app.Application;
import android.text.TextUtils;
import androidx.compose.runtime.internal.o;
import com.max.hbminiprogram.bean.MiniProgramMenuInfoObj;
import com.max.hbutils.bean.Result;
import com.max.heybox.hblog.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MiniProgramHostRepository.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f91083b = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final Application f91084a;

    /* JADX INFO: compiled from: MiniProgramHostRepository.kt */
    public static final class a extends com.max.hbcommon.network.d<Result<MiniProgramMenuInfoObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.hbminiprogram.c f91085b;

        a(com.max.hbminiprogram.c cVar) {
            this.f91085b = cVar;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 42228, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            this.f91085b.a(null);
        }

        public void onNext(@dl.d Result<MiniProgramMenuInfoObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 42227, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            this.f91085b.a(result.getResult());
            super.onNext(result);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 42229, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MiniProgramMenuInfoObj>) obj);
        }
    }

    public c(@dl.d Application application) {
        f0.p(application, "application");
        this.f91084a = application;
    }

    @dl.d
    public final Application a() {
        return this.f91084a;
    }

    public final void b(@e String str, @dl.d com.max.hbminiprogram.c callback) {
        if (PatchProxy.proxy(new Object[]{str, callback}, this, changeQuickRedirect, false, 42226, new Class[]{String.class, com.max.hbminiprogram.c.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(callback, "callback");
        g.f74531b.q("MiniProgramRepository, getShareInfo, miniProgramId = " + str);
        if (TextUtils.isEmpty(str)) {
            callback.a(null);
        }
    }
}
