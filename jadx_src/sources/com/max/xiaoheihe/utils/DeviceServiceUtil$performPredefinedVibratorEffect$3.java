package com.max.xiaoheihe.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: DeviceServiceUtil.kt */
/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.utils.DeviceServiceUtil$performPredefinedVibratorEffect$3", f = "DeviceServiceUtil.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
public final class DeviceServiceUtil$performPredefinedVibratorEffect$3 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f95246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f95247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f95248d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeviceServiceUtil$performPredefinedVibratorEffect$3(long j10, int i10, kotlin.coroutines.c<? super DeviceServiceUtil$performPredefinedVibratorEffect$3> cVar) {
        super(2, cVar);
        this.f95247c = j10;
        this.f95248d = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 48676, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new DeviceServiceUtil$performPredefinedVibratorEffect$3(this.f95247c, this.f95248d, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 48678, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 48677, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((DeviceServiceUtil$performPredefinedVibratorEffect$3) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 48675, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f95246b;
        if (i10 == 0) {
            t0.n(obj);
            long jV = fi.u.v(this.f95247c, 0L);
            this.f95246b = 1;
            if (DelayKt.b(jV, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        int i11 = this.f95248d;
        PredefinedVibratorEffect predefinedVibratorEffect = PredefinedVibratorEffect.LIGHT;
        if (i11 == predefinedVibratorEffect.getTypeCode()) {
            DeviceServiceUtil.a(DeviceServiceUtil.f95244a, predefinedVibratorEffect.getDuration(), predefinedVibratorEffect.getAmplitude());
        } else {
            PredefinedVibratorEffect predefinedVibratorEffect2 = PredefinedVibratorEffect.HEAVY;
            if (i11 == predefinedVibratorEffect2.getTypeCode()) {
                DeviceServiceUtil.a(DeviceServiceUtil.f95244a, predefinedVibratorEffect2.getDuration(), predefinedVibratorEffect2.getAmplitude());
            } else {
                PredefinedVibratorEffect predefinedVibratorEffect3 = PredefinedVibratorEffect.SOFT;
                if (i11 == predefinedVibratorEffect3.getTypeCode()) {
                    DeviceServiceUtil.a(DeviceServiceUtil.f95244a, predefinedVibratorEffect3.getDuration(), predefinedVibratorEffect3.getAmplitude());
                } else {
                    PredefinedVibratorEffect predefinedVibratorEffect4 = PredefinedVibratorEffect.RIGID;
                    if (i11 == predefinedVibratorEffect4.getTypeCode()) {
                        DeviceServiceUtil.a(DeviceServiceUtil.f95244a, predefinedVibratorEffect4.getDuration(), predefinedVibratorEffect4.getAmplitude());
                    } else {
                        PredefinedVibratorEffect predefinedVibratorEffect5 = PredefinedVibratorEffect.NOTI;
                        if (i11 == predefinedVibratorEffect5.getTypeCode()) {
                            DeviceServiceUtil.a(DeviceServiceUtil.f95244a, predefinedVibratorEffect5.getDuration(), predefinedVibratorEffect5.getAmplitude());
                        } else {
                            DeviceServiceUtil deviceServiceUtil = DeviceServiceUtil.f95244a;
                            PredefinedVibratorEffect predefinedVibratorEffect6 = PredefinedVibratorEffect.MEDIUM;
                            DeviceServiceUtil.a(deviceServiceUtil, predefinedVibratorEffect6.getDuration(), predefinedVibratorEffect6.getAmplitude());
                        }
                    }
                }
            }
        }
        return b2.f124493a;
    }
}
