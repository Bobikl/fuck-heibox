package com.max.xiaoheihe.module.heybox_voice;

import bb.c;
import com.max.hbutils.utils.x;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.okflutter.pigeon.IHybridWebsocket;
import com.max.xiaoheihe.utils.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.b2;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.a;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: HeyboxVoiceFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@d(c = "com.max.xiaoheihe.module.heybox_voice.HeyboxVoiceFragment$HeyboxHybridWebsocketHandler$pushForResult$1", f = "HeyboxVoiceFragment.kt", i = {}, l = {c.b.f30739k3, c.b.f30899r3, c.b.f30943t3}, m = "invokeSuspend", n = {}, s = {})
public final class HeyboxVoiceFragment$HeyboxHybridWebsocketHandler$pushForResult$1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f88604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ HeyboxVoiceFragment f88605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ IHybridWebsocket.Result<IHybridWebsocket.HybridWebsocketResponse> f88606d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f88607e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f88608f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ long f88609g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HeyboxVoiceFragment$HeyboxHybridWebsocketHandler$pushForResult$1(HeyboxVoiceFragment heyboxVoiceFragment, IHybridWebsocket.Result<IHybridWebsocket.HybridWebsocketResponse> result, boolean z10, String str, long j10, kotlin.coroutines.c<? super HeyboxVoiceFragment$HeyboxHybridWebsocketHandler$pushForResult$1> cVar) {
        super(2, cVar);
        this.f88605c = heyboxVoiceFragment;
        this.f88606d = result;
        this.f88607e = z10;
        this.f88608f = str;
        this.f88609g = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 38492, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new HeyboxVoiceFragment$HeyboxHybridWebsocketHandler$pushForResult$1(this.f88605c, this.f88606d, this.f88607e, this.f88608f, this.f88609g, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 38494, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 38493, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((HeyboxVoiceFragment$HeyboxHybridWebsocketHandler$pushForResult$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x00da  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:50:0x0102  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        IHybridWebsocket.Result result;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 38491, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = b.h();
        int i10 = this.f88604b;
        if (i10 != 0) {
            if (i10 == 1) {
                t0.n(obj);
            } else {
                if (i10 == 2) {
                    t0.n(obj);
                    if (((Boolean) obj).booleanValue()) {
                        this.f88604b = 3;
                        if (DelayKt.b(10000L, this) == objH) {
                            return objH;
                        }
                    } else {
                        this.f88606d.error(new Exception(com.max.xiaoheihe.utils.d.n0(R.string.connection_failed)));
                        if (this.f88607e) {
                            x.p(com.max.xiaoheihe.utils.d.n0(R.string.connection_failed));
                        }
                    }
                    return b2.f124493a;
                }
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t0.n(obj);
            }
            result = (IHybridWebsocket.Result) this.f88605c.f88597e.get(a.f((int) this.f88609g));
            if (result != null && f0.g(result, this.f88606d)) {
                if (this.f88607e) {
                    x.p(com.max.xiaoheihe.utils.d.n0(R.string.connection_time_out));
                }
                this.f88606d.error(new Exception(com.max.xiaoheihe.utils.d.n0(R.string.connection_time_out)));
            }
            return b2.f124493a;
        }
        t0.n(obj);
        m mVar = this.f88605c.f88595c;
        if (mVar == null) {
            f0.S("websocketChannel");
            mVar = null;
        }
        this.f88604b = 1;
        obj = mVar.b(this);
        if (obj == objH) {
            return objH;
        }
        if (!((Boolean) obj).booleanValue()) {
            this.f88606d.error(new Exception(com.max.xiaoheihe.utils.d.n0(R.string.connection_failed)));
            if (this.f88607e) {
                x.p(com.max.xiaoheihe.utils.d.n0(R.string.connection_failed));
            }
            return b2.f124493a;
        }
        m mVar2 = this.f88605c.f88595c;
        if (mVar2 == null) {
            f0.S("websocketChannel");
            mVar2 = null;
        }
        com.max.xiaoheihe.utils.x xVar = new com.max.xiaoheihe.utils.x(this.f88608f, false, 2, null);
        this.f88604b = 2;
        obj = mVar2.c(xVar, this);
        if (obj == objH) {
            return objH;
        }
        if (((Boolean) obj).booleanValue()) {
            this.f88604b = 3;
            if (DelayKt.b(10000L, this) == objH) {
                return objH;
            }
            result = (IHybridWebsocket.Result) this.f88605c.f88597e.get(a.f((int) this.f88609g));
            if (result != null) {
                if (this.f88607e) {
                    x.p(com.max.xiaoheihe.utils.d.n0(R.string.connection_time_out));
                }
                this.f88606d.error(new Exception(com.max.xiaoheihe.utils.d.n0(R.string.connection_time_out)));
            }
        } else {
            this.f88606d.error(new Exception(com.max.xiaoheihe.utils.d.n0(R.string.connection_failed)));
            if (this.f88607e) {
                x.p(com.max.xiaoheihe.utils.d.n0(R.string.connection_failed));
            }
        }
        return b2.f124493a;
    }
}
