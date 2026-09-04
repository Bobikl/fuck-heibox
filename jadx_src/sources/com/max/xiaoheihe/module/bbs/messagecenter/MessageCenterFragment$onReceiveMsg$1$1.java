package com.max.xiaoheihe.module.bbs.messagecenter;

import android.util.Log;
import com.max.hbcommon.base.adapter.t;
import com.max.xiaoheihe.bean.bbs.BBSUserMsgObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: MessageCenterFragment.kt */
/* JADX INFO: loaded from: classes10.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.bbs.messagecenter.MessageCenterFragment$onReceiveMsg$1$1", f = "MessageCenterFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class MessageCenterFragment$onReceiveMsg$1$1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f81280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f81281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ MessageCenterFragment f81282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ BBSUserMsgObj f81283e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MessageCenterFragment$onReceiveMsg$1$1(MessageCenterFragment messageCenterFragment, BBSUserMsgObj bBSUserMsgObj, kotlin.coroutines.c<? super MessageCenterFragment$onReceiveMsg$1$1> cVar) {
        super(2, cVar);
        this.f81282d = messageCenterFragment;
        this.f81283e = bBSUserMsgObj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 28307, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (kotlin.coroutines.c) patchProxyResultProxy.result;
        }
        MessageCenterFragment$onReceiveMsg$1$1 messageCenterFragment$onReceiveMsg$1$1 = new MessageCenterFragment$onReceiveMsg$1$1(this.f81282d, this.f81283e, cVar);
        messageCenterFragment$onReceiveMsg$1$1.f81281c = obj;
        return messageCenterFragment$onReceiveMsg$1$1;
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 28309, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 28308, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((MessageCenterFragment$onReceiveMsg$1$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        b2 b2Var;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 28306, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        kotlin.coroutines.intrinsics.b.h();
        if (this.f81280b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        q0 q0Var = (q0) this.f81281c;
        MessageCenterFragment messageCenterFragment = this.f81282d;
        BBSUserMsgObj bBSUserMsgObj = this.f81283e;
        synchronized (q0Var) {
            try {
                t tVar = messageCenterFragment.M;
                int iU = tVar != null ? tVar.u() : 0;
                int iV4 = MessageCenterFragment.v4(messageCenterFragment);
                if (MessageCenterFragment.t4(messageCenterFragment).E().contains(bBSUserMsgObj)) {
                    int iIndexOf = MessageCenterFragment.t4(messageCenterFragment).E().indexOf(bBSUserMsgObj);
                    if (com.max.hbcommon.utils.c.x(bBSUserMsgObj.getRead())) {
                        MessageCenterFragment.t4(messageCenterFragment).E().get(iIndexOf).setCount("0");
                        t tVar2 = messageCenterFragment.M;
                        if (tVar2 != null) {
                            tVar2.notifyItemChanged(iU + iIndexOf);
                        }
                    } else {
                        bBSUserMsgObj.setIs_top(MessageCenterFragment.t4(messageCenterFragment).E().get(iIndexOf).getIs_top());
                        if (com.max.hbcommon.utils.c.x(bBSUserMsgObj.getIs_top())) {
                            if (iIndexOf == 0) {
                                MessageCenterFragment.t4(messageCenterFragment).E().set(iIndexOf, bBSUserMsgObj);
                                t tVar3 = messageCenterFragment.M;
                                if (tVar3 != null) {
                                    tVar3.notifyItemChanged(iU + iIndexOf);
                                }
                            } else {
                                MessageCenterFragment.t4(messageCenterFragment).E().remove(bBSUserMsgObj);
                                t tVar4 = messageCenterFragment.M;
                                if (tVar4 != null) {
                                    tVar4.notifyItemRemoved(iIndexOf + iU);
                                }
                                MessageCenterFragment.t4(messageCenterFragment).E().add(0, bBSUserMsgObj);
                                t tVar5 = messageCenterFragment.M;
                                if (tVar5 != null) {
                                    tVar5.notifyItemInserted(iU);
                                }
                            }
                        } else if (iIndexOf == iV4) {
                            MessageCenterFragment.t4(messageCenterFragment).E().set(iIndexOf, bBSUserMsgObj);
                            t tVar6 = messageCenterFragment.M;
                            if (tVar6 != null) {
                                tVar6.notifyItemChanged(iU + iIndexOf);
                            }
                        } else {
                            MessageCenterFragment.t4(messageCenterFragment).E().remove(bBSUserMsgObj);
                            t tVar7 = messageCenterFragment.M;
                            if (tVar7 != null) {
                                tVar7.notifyItemRemoved(iIndexOf + iU);
                            }
                            MessageCenterFragment.t4(messageCenterFragment).E().add(iV4, bBSUserMsgObj);
                            t tVar8 = messageCenterFragment.M;
                            if (tVar8 != null) {
                                tVar8.notifyItemInserted(iU + iV4);
                            }
                        }
                    }
                } else if (!com.max.hbcommon.utils.c.x(bBSUserMsgObj.getRead())) {
                    if (com.max.hbcommon.utils.c.x(bBSUserMsgObj.getIs_top())) {
                        MessageCenterFragment.t4(messageCenterFragment).E().add(0, bBSUserMsgObj);
                        t tVar9 = messageCenterFragment.M;
                        if (tVar9 != null) {
                            tVar9.notifyItemInserted(iU);
                        }
                    } else {
                        MessageCenterFragment.t4(messageCenterFragment).E().add(iV4, bBSUserMsgObj);
                        t tVar10 = messageCenterFragment.M;
                        if (tVar10 != null) {
                            tVar10.notifyItemInserted(iU + iV4);
                        }
                    }
                }
            } catch (Throwable th2) {
                Log.e("MessageCenterFragment", "onReceiveMsg error: " + th2.getMessage());
            }
            b2Var = b2.f124493a;
        }
        return b2Var;
    }
}
