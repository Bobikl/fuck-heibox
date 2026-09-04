package com.max.xiaoheihe.module.video.action;

import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.td0;
import dl.e;
import kotlin.KotlinNothingValueException;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.u;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: VideoChargeAction.kt */
/* JADX INFO: loaded from: classes12.dex */
@d(c = "com.max.xiaoheihe.module.video.action.VideoChargeAction$initExtView$2", f = "VideoChargeAction.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
public final class VideoChargeAction$initExtView$2 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f93593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ VideoChargeAction f93594c;

    /* JADX INFO: compiled from: VideoChargeAction.kt */
    public static final class a implements f<Boolean> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ VideoChargeAction f93595b;

        a(VideoChargeAction videoChargeAction) {
            this.f93595b = videoChargeAction;
        }

        @e
        public final Object a(boolean z10, @dl.d c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), cVar}, this, changeQuickRedirect, false, 46268, new Class[]{Boolean.TYPE, c.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            td0 td0Var = null;
            if (z10) {
                td0 td0Var2 = this.f93595b.f93558a;
                if (td0Var2 == null) {
                    f0.S("binding");
                } else {
                    td0Var = td0Var2;
                }
                td0Var.f115977b.setImageResource(R.drawable.bbs_battery_filled_24x24);
            } else {
                td0 td0Var3 = this.f93595b.f93558a;
                if (td0Var3 == null) {
                    f0.S("binding");
                } else {
                    td0Var = td0Var3;
                }
                td0Var.f115977b.setImageResource(R.drawable.video_battery_line_24x24);
            }
            return b2.f124493a;
        }

        @Override // kotlinx.coroutines.flow.f
        public /* bridge */ /* synthetic */ Object emit(Boolean bool, c cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bool, cVar}, this, changeQuickRedirect, false, 46269, new Class[]{Object.class, c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(bool.booleanValue(), cVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VideoChargeAction$initExtView$2(VideoChargeAction videoChargeAction, c<? super VideoChargeAction$initExtView$2> cVar) {
        super(2, cVar);
        this.f93594c = videoChargeAction;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 46265, new Class[]{Object.class, c.class}, c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new VideoChargeAction$initExtView$2(this.f93594c, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46267, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46266, new Class[]{q0.class, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((VideoChargeAction$initExtView$2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46264, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = b.h();
        int i10 = this.f93593b;
        if (i10 == 0) {
            t0.n(obj);
            u<Boolean> uVarS = this.f93594c.s();
            a aVar = new a(this.f93594c);
            this.f93593b = 1;
            if (uVarS.a(aVar, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        throw new KotlinNothingValueException();
    }
}
