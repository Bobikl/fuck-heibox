package com.max.xiaoheihe.router.interceptors;

import android.net.Uri;
import android.util.Log;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.bean.account.OnlineStateObj;
import com.max.xiaoheihe.module.account.MeHomeFragmentx;
import com.max.xiaoheihe.module.account.MessageAndFriendsActivity;
import com.max.xiaoheihe.module.bbs.messagecenter.MessageCenterFragment;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MessageAndFriendsInterceptor.kt */
/* JADX INFO: loaded from: classes13.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class MessageAndFriendsInterceptor implements com.sankuai.waimai.router.core.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f94909b = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f94910a = MessageAndFriendsInterceptor.class.getSimpleName();

    /* JADX INFO: compiled from: MessageAndFriendsInterceptor.kt */
    public static final class a extends com.max.hbcommon.network.d<Result<OnlineStateObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ yh.a<b2> f94911b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ yh.a<b2> f94912c;

        a(yh.a<b2> aVar, yh.a<b2> aVar2) {
            this.f94911b = aVar;
            this.f94912c = aVar2;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 48131, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            super.onError(e10);
            this.f94911b.invoke();
        }

        public void onNext(@dl.d Result<OnlineStateObj> t10) {
            if (PatchProxy.proxy(new Object[]{t10}, this, changeQuickRedirect, false, 48130, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(t10, "t");
            super.onNext(t10);
            MeHomeFragmentx.f77985a4 = com.max.hbutils.utils.n.q(t10.getResult().getFriend_num());
            OnlineStateObj result = t10.getResult();
            if (com.max.hbutils.utils.n.q(result != null ? result.getFriend_num() : null) <= 0) {
                this.f94911b.invoke();
            } else {
                this.f94912c.invoke();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 48132, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<OnlineStateObj>) obj);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x00ca  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.sankuai.waimai.router.core.h
    public void a(@dl.d final com.sankuai.waimai.router.core.i request, @dl.d final com.sankuai.waimai.router.core.f callback) {
        if (PatchProxy.proxy(new Object[]{request, callback}, this, changeQuickRedirect, false, 48129, new Class[]{com.sankuai.waimai.router.core.i.class, com.sankuai.waimai.router.core.f.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(request, "request");
        f0.p(callback, "callback");
        Uri uriM = request.m();
        f0.o(uriM, "request.uri");
        String path = uriM.getPath();
        Log.d(this.f94910a, "Path: " + path);
        String str = "friend";
        if (!f0.g(path, lb.d.f131279w4)) {
            if (f0.g(path, lb.d.f131276w1)) {
                yh.a<b2> aVar = new yh.a<b2>() { // from class: com.max.xiaoheihe.router.interceptors.MessageAndFriendsInterceptor$intercept$callFollowRedirect$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.a
                    public /* bridge */ /* synthetic */ b2 invoke() {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48136, new Class[0], Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        invoke2();
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48135, new Class[0], Void.TYPE).isSupported) {
                            return;
                        }
                        request.y(Uri.parse("hblink://universal/me/data/follow_a"));
                        callback.onComplete(301);
                    }
                };
                yh.a<b2> aVar2 = new yh.a<b2>() { // from class: com.max.xiaoheihe.router.interceptors.MessageAndFriendsInterceptor$intercept$callFollowNext$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.a
                    public /* bridge */ /* synthetic */ b2 invoke() {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48134, new Class[0], Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        invoke2();
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48133, new Class[0], Void.TYPE).isSupported) {
                            return;
                        }
                        m.l(request, MessageAndFriendsActivity.S, "friends");
                        callback.a();
                    }
                };
                String strG = m.g(request, "userid");
                if (!i0.s() || !i0.q(strG)) {
                    aVar.invoke();
                    return;
                } else if (f0.g("friend", m.g(request, "key"))) {
                    aVar2.invoke();
                    return;
                } else {
                    com.max.xiaoheihe.network.i.a().H7().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new a(aVar, aVar2));
                    return;
                }
            }
            return;
        }
        String strG2 = m.g(request, "list_type");
        String strG3 = m.g(request, "message_type");
        m.l(request, "userid", i0.j());
        if (!MessageCenterFragment.Q.a(strG2, strG3)) {
            request.y(Uri.parse("hblink://universal/message_center_a"));
            callback.onComplete(301);
            return;
        }
        if (m.c(request, "page_index", 1) == 1) {
            m.l(request, MessageAndFriendsActivity.S, "message");
        } else {
            m.l(request, MessageAndFriendsActivity.S, "friends");
            String strG4 = m.g(request, "friend_page_key");
            if (strG4 != null) {
                switch (strG4.hashCode()) {
                    case -1268958287:
                        if (!strG4.equals("follow")) {
                            str = null;
                        } else {
                            str = "following";
                        }
                        break;
                    case -1266283874:
                        if (!strG4.equals("friend")) {
                            str = null;
                        }
                        break;
                    case 3135424:
                        if (!strG4.equals("fans")) {
                            str = null;
                        } else {
                            str = lb.c.f131110f;
                        }
                        break;
                    case 989204668:
                        if (!strG4.equals("recommend")) {
                            str = null;
                        } else {
                            str = "recommend";
                        }
                        break;
                    default:
                        str = null;
                        break;
                }
                if (str != null) {
                    m.l(request, "key", str);
                }
            }
        }
        callback.a();
    }

    public final String b() {
        return this.f94910a;
    }
}
