package com.max.hbcoco;

import android.os.Debug;
import com.max.hbutils.core.BaseApplication;
import com.max.heybox.hblog.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.io.File;
import java.util.List;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.t0;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.k;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;
import yh.p;

/* JADX INFO: compiled from: HBCoCoUtil.kt */
/* JADX INFO: loaded from: classes9.dex */
@d(c = "com.max.hbcoco.HBCoCoUtilKt$loadCoverageClass$1", f = "HBCoCoUtil.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class HBCoCoUtilKt$loadCoverageClass$1 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f66172b;

    /* JADX INFO: renamed from: com.max.hbcoco.HBCoCoUtilKt$loadCoverageClass$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: HBCoCoUtil.kt */
    @d(c = "com.max.hbcoco.HBCoCoUtilKt$loadCoverageClass$1$1", f = "HBCoCoUtil.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f66173b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f66174c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f66175d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str, long j10, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f66174c = str;
            this.f66175d = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.b.hq, new Class[]{Object.class, c.class}, c.class);
            return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new AnonymousClass1(this.f66174c, this.f66175d, cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.b.jq, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @e c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.b.iq, new Class[]{q0.class, c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.b.gq, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f66173b;
            if (i10 == 0) {
                t0.n(obj);
                this.f66173b = 1;
                if (DelayKt.b(100L, this) == objH) {
                    return objH;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t0.n(obj);
            }
            try {
                com.max.hbcoco.room.dao.a aVarC = ya.a.f141620b.a().c();
                List<za.a> listC = HBCoCoUtilKt.c(this.f66174c);
                if (listC != null) {
                    aVarC.c(listC);
                    g.f74531b.M("UN_COVERAGE  readFileContentLoadedClassList: size: " + listC.size());
                }
                List<za.a> all = aVarC.getAll();
                g.f74531b.M("UN_COVERAGE  AllLoadedClassList: size: " + all.size());
            } catch (Throwable th2) {
                g.f74531b.v("UN_COVERAGE  readFileContent error: " + th2.getMessage());
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            g.f74531b.M("UN_COVERAGE  loadCoverageClass cost " + (jCurrentTimeMillis - this.f66175d) + "ms");
            return b2.f124493a;
        }
    }

    HBCoCoUtilKt$loadCoverageClass$1(c<? super HBCoCoUtilKt$loadCoverageClass$1> cVar) {
        super(2, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.b.dq, new Class[]{Object.class, c.class}, c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new HBCoCoUtilKt$loadCoverageClass$1(cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.b.fq, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.b.eq, new Class[]{q0.class, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((HBCoCoUtilKt$loadCoverageClass$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.b.cq, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        kotlin.coroutines.intrinsics.b.h();
        if (this.f66172b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String str = BaseApplication.a().getCacheDir().getAbsolutePath() + "/coco/log" + System.currentTimeMillis() + ".txt";
            g.f74531b.M("UN_COVERAGE  path:  " + str);
            File parentFile = new File(str).getParentFile();
            if (parentFile != null) {
                kotlin.coroutines.jvm.internal.a.a(parentFile.mkdirs());
            }
            ArtMethodBridge.printLoadedClassStart(str);
            Debug.printLoadedClasses(2);
            ArtMethodBridge.printLoadedClassEnd();
            k.f(r0.a(e1.c()), null, null, new AnonymousClass1(str, jCurrentTimeMillis, null), 3, null);
        } catch (Exception e10) {
            g.f74531b.v("UN_COVERAGE  loadCoverageClass  error: " + e10.getMessage());
        }
        return b2.f124493a;
    }
}
