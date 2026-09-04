package com.max.xiaoheihe.module.hotfix;

import android.util.Log;
import com.max.hbapkinstaller.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.io.File;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: HotFixManager.kt */
/* JADX INFO: loaded from: classes11.dex */
@d(c = "com.max.xiaoheihe.module.hotfix.HotFixManager$downloadPatch$2$onNext$1", f = "HotFixManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class HotFixManager$downloadPatch$2$onNext$1 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f88641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ File f88642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f88643d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ HotFixManager f88644e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f88645f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotFixManager$downloadPatch$2$onNext$1(File file, String str, HotFixManager hotFixManager, String str2, c<? super HotFixManager$downloadPatch$2$onNext$1> cVar) {
        super(2, cVar);
        this.f88642c = file;
        this.f88643d = str;
        this.f88644e = hotFixManager;
        this.f88645f = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 38543, new Class[]{Object.class, c.class}, c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new HotFixManager$downloadPatch$2$onNext$1(this.f88642c, this.f88643d, this.f88644e, this.f88645f, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 38545, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 38544, new Class[]{q0.class, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((HotFixManager$downloadPatch$2$onNext$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 38542, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        kotlin.coroutines.intrinsics.b.h();
        if (this.f88641b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        g gVar = g.f65809a;
        String absolutePath = this.f88642c.getAbsolutePath();
        f0.o(absolutePath, "file.absolutePath");
        HotFixManager.a aVar = HotFixManager.f88631b;
        if (gVar.f(absolutePath, aVar.b())) {
            Log.d(HotFixManager.f88633d, "unZip success");
            File file = new File(aVar.b() + "patch.jar");
            if (file.exists()) {
                String str = this.f88643d;
                String absolutePath2 = file.getAbsolutePath();
                f0.o(absolutePath2, "patchFile.absolutePath");
                if (f0.g(str, aVar.a(absolutePath2))) {
                    HotFixManager.b(this.f88644e);
                    this.f88644e.k(this.f88645f);
                } else {
                    com.max.heybox.hblog.g.f74531b.v("HotFixManager MD5校验失败");
                }
            } else {
                com.max.heybox.hblog.g.f74531b.v("HotFixManager 解药的文件不存在 未找到patch.jar");
            }
        } else {
            com.max.heybox.hblog.g.f74531b.v("HotFixManager unZip failed");
        }
        try {
            this.f88642c.delete();
        } catch (Exception unused) {
        }
        return b2.f124493a;
    }
}
