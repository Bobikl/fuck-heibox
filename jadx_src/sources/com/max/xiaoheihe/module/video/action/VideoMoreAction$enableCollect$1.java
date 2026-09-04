package com.max.xiaoheihe.module.video.action;

import com.max.heybox.hblog.g;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.KotlinNothingValueException;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.t0;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.u;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: VideoMoreAction.kt */
/* JADX INFO: loaded from: classes12.dex */
@d(c = "com.max.xiaoheihe.module.video.action.VideoMoreAction$enableCollect$1", f = "VideoMoreAction.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, s = {})
public final class VideoMoreAction$enableCollect$1 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f93724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ VideoCollectAction f93725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ VideoMoreAction f93726d;

    /* JADX INFO: compiled from: VideoMoreAction.kt */
    public static final class a implements f<Boolean> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ VideoMoreAction f93727b;

        a(VideoMoreAction videoMoreAction) {
            this.f93727b = videoMoreAction;
        }

        @e
        public final Object a(boolean z10, @dl.d c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), cVar}, this, changeQuickRedirect, false, 46396, new Class[]{Boolean.TYPE, c.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            g.f74531b.q("VideoCollectAction： 触发Collect状态变化：" + z10);
            int i10 = z10 ? R.drawable.common_star2_filled_24x24 : R.drawable.common_star_line_24x24;
            this.f93727b.o().f110146c.setImageResource(i10);
            this.f93727b.o().f110148e.setText(z10 ? "已收藏" : "收藏");
            this.f93727b.p().f110528d.setImageResource(i10);
            this.f93727b.p().f110536l.setText(z10 ? "已收藏" : "收藏");
            return b2.f124493a;
        }

        @Override // kotlinx.coroutines.flow.f
        public /* bridge */ /* synthetic */ Object emit(Boolean bool, c cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bool, cVar}, this, changeQuickRedirect, false, 46397, new Class[]{Object.class, c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(bool.booleanValue(), cVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VideoMoreAction$enableCollect$1(VideoCollectAction videoCollectAction, VideoMoreAction videoMoreAction, c<? super VideoMoreAction$enableCollect$1> cVar) {
        super(2, cVar);
        this.f93725c = videoCollectAction;
        this.f93726d = videoMoreAction;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 46393, new Class[]{Object.class, c.class}, c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new VideoMoreAction$enableCollect$1(this.f93725c, this.f93726d, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46395, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46394, new Class[]{q0.class, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((VideoMoreAction$enableCollect$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46392, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = b.h();
        int i10 = this.f93724b;
        if (i10 == 0) {
            t0.n(obj);
            u<Boolean> uVarH = this.f93725c.h();
            a aVar = new a(this.f93726d);
            this.f93724b = 1;
            if (uVarH.a(aVar, this) == objH) {
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
