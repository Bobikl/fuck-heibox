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
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: HeyboxVoiceFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@d(c = "com.max.xiaoheihe.module.heybox_voice.HeyboxVoiceFragment$HeyboxHybridWebsocketHandler$push$1", f = "HeyboxVoiceFragment.kt", i = {}, l = {c.b.B2, c.b.I2}, m = "invokeSuspend", n = {}, s = {})
public final class HeyboxVoiceFragment$HeyboxHybridWebsocketHandler$push$1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f88599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ HeyboxVoiceFragment f88600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ IHybridWebsocket.NullableResult<IHybridWebsocket.HybridWebsocketResponse> f88601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f88602e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f88603f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HeyboxVoiceFragment$HeyboxHybridWebsocketHandler$push$1(HeyboxVoiceFragment heyboxVoiceFragment, IHybridWebsocket.NullableResult<IHybridWebsocket.HybridWebsocketResponse> nullableResult, boolean z10, String str, kotlin.coroutines.c<? super HeyboxVoiceFragment$HeyboxHybridWebsocketHandler$push$1> cVar) {
        super(2, cVar);
        this.f88600c = heyboxVoiceFragment;
        this.f88601d = nullableResult;
        this.f88602e = z10;
        this.f88603f = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 38488, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new HeyboxVoiceFragment$HeyboxHybridWebsocketHandler$push$1(this.f88600c, this.f88601d, this.f88602e, this.f88603f, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 38490, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 38489, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((HeyboxVoiceFragment$HeyboxHybridWebsocketHandler$push$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ca  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 38487, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = b.h();
        int i10 = this.f88599b;
        if (i10 != 0) {
            if (i10 == 1) {
                t0.n(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t0.n(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                this.f88601d.success(new IHybridWebsocket.HybridWebsocketResponse.Builder().setStatus(IHybridWebsocket.HybridWebsocketStatus.OK).build());
            } else {
                this.f88601d.error(new Exception(com.max.xiaoheihe.utils.d.n0(R.string.connection_failed)));
                if (this.f88602e) {
                    x.p(com.max.xiaoheihe.utils.d.n0(R.string.connection_failed));
                }
            }
            return b2.f124493a;
        }
        t0.n(obj);
        m mVar = this.f88600c.f88595c;
        if (mVar == null) {
            f0.S("websocketChannel");
            mVar = null;
        }
        this.f88599b = 1;
        obj = mVar.b(this);
        if (obj == objH) {
            return objH;
        }
        if (!((Boolean) obj).booleanValue()) {
            this.f88601d.error(new Exception(com.max.xiaoheihe.utils.d.n0(R.string.connection_failed)));
            if (this.f88602e) {
                x.p(com.max.xiaoheihe.utils.d.n0(R.string.connection_failed));
            }
            return b2.f124493a;
        }
        m mVar2 = this.f88600c.f88595c;
        if (mVar2 == null) {
            f0.S("websocketChannel");
            mVar2 = null;
        }
        com.max.xiaoheihe.utils.x xVar = new com.max.xiaoheihe.utils.x(this.f88603f, false, 2, null);
        this.f88599b = 2;
        obj = mVar2.c(xVar, this);
        if (obj == objH) {
            return objH;
        }
        if (((Boolean) obj).booleanValue()) {
            this.f88601d.success(new IHybridWebsocket.HybridWebsocketResponse.Builder().setStatus(IHybridWebsocket.HybridWebsocketStatus.OK).build());
        } else {
            this.f88601d.error(new Exception(com.max.xiaoheihe.utils.d.n0(R.string.connection_failed)));
            if (this.f88602e) {
                x.p(com.max.xiaoheihe.utils.d.n0(R.string.connection_failed));
            }
        }
        return b2.f124493a;
    }
}
