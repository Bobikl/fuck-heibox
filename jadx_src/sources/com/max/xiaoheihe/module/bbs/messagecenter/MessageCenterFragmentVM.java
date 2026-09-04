package com.max.xiaoheihe.module.bbs.messagecenter;

import androidx.compose.runtime.internal.o;
import androidx.lifecycle.i0;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.base.mvvm.BaseDisplayState;
import com.max.xiaoheihe.base.mvvm.BaseViewModel;
import com.max.xiaoheihe.bean.bbs.BBSUserMsgObj;
import com.max.xiaoheihe.bean.bbs.BBSUserMsgResult;
import com.max.xiaoheihe.bean.bbs.BBSUserMsgsObj;
import com.max.xiaoheihe.bean.chat.StrangerMsgListResultObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import kotlin.LazyThreadSafetyMode;
import kotlin.b0;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.z;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.k;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;
import yh.l;

/* JADX INFO: compiled from: MessageCenterFragmentVM.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class MessageCenterFragmentVM extends BaseViewModel {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f81297w = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private i0<Boolean> f81298k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private i0<Boolean> f81299l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private i0<BBSUserMsgResult<BBSUserMsgsObj>> f81300m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f81301n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.e
    private String f81302o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.e
    private String f81303p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.e
    private String f81304q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f81305r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.d
    private final ArrayList<BBSUserMsgObj> f81306s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.d
    private final ArrayList<BBSUserMsgObj> f81307t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.d
    private final q0 f81308u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.d
    private final z f81309v;

    /* JADX INFO: compiled from: MessageCenterFragmentVM.kt */
    public static final class a implements com.max.xiaoheihe.base.mvvm.repository.a<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ yh.a<b2> f81310a;

        a(yh.a<b2> aVar) {
            this.f81310a = aVar;
        }

        public void a(@dl.d Result<?> t10) {
            if (PatchProxy.proxy(new Object[]{t10}, this, changeQuickRedirect, false, 28347, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(t10, "t");
            this.f81310a.invoke();
        }

        @Override // com.max.xiaoheihe.base.mvvm.repository.a
        public void onComplete() {
        }

        @Override // com.max.xiaoheihe.base.mvvm.repository.a
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 28348, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
        }

        @Override // com.max.xiaoheihe.base.mvvm.repository.a
        public /* bridge */ /* synthetic */ void onNext(Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 28349, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a(result);
        }
    }

    /* JADX INFO: compiled from: MessageCenterFragmentVM.kt */
    public static final class b implements com.max.xiaoheihe.base.mvvm.repository.a<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l<Result<?>, b2> f81311a;

        /* JADX WARN: Multi-variable type inference failed */
        b(l<? super Result<?>, b2> lVar) {
            this.f81311a = lVar;
        }

        public void a(@dl.d Result<?> t10) {
            if (PatchProxy.proxy(new Object[]{t10}, this, changeQuickRedirect, false, 28350, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(t10, "t");
            this.f81311a.invoke(t10);
        }

        @Override // com.max.xiaoheihe.base.mvvm.repository.a
        public void onComplete() {
        }

        @Override // com.max.xiaoheihe.base.mvvm.repository.a
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 28351, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
        }

        @Override // com.max.xiaoheihe.base.mvvm.repository.a
        public /* bridge */ /* synthetic */ void onNext(Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 28352, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a(result);
        }
    }

    /* JADX INFO: compiled from: MessageCenterFragmentVM.kt */
    public static final class c implements com.max.xiaoheihe.base.mvvm.repository.a<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l<Result<?>, b2> f81312a;

        /* JADX WARN: Multi-variable type inference failed */
        c(l<? super Result<?>, b2> lVar) {
            this.f81312a = lVar;
        }

        public void a(@dl.d Result<?> t10) {
            if (PatchProxy.proxy(new Object[]{t10}, this, changeQuickRedirect, false, 28353, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(t10, "t");
            this.f81312a.invoke(t10);
        }

        @Override // com.max.xiaoheihe.base.mvvm.repository.a
        public void onComplete() {
        }

        @Override // com.max.xiaoheihe.base.mvvm.repository.a
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 28354, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
        }

        @Override // com.max.xiaoheihe.base.mvvm.repository.a
        public /* bridge */ /* synthetic */ void onNext(Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 28355, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a(result);
        }
    }

    /* JADX INFO: compiled from: MessageCenterFragmentVM.kt */
    public static final class d implements com.max.xiaoheihe.base.mvvm.repository.a<Result<StrangerMsgListResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        public void a(@dl.d Result<StrangerMsgListResultObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 28360, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (f0.g(MessageCenterFragmentVM.this.m().f(), Boolean.TRUE) && result.getResult() != null) {
                StrangerMsgListResultObj result2 = result.getResult();
                f0.m(result2);
                if (result2.getList() != null) {
                    ArrayList arrayList = MessageCenterFragmentVM.this.f81307t;
                    StrangerMsgListResultObj result3 = result.getResult();
                    f0.m(result3);
                    arrayList.addAll(result3.getList());
                }
            }
        }

        @Override // com.max.xiaoheihe.base.mvvm.repository.a
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28362, new Class[0], Void.TYPE).isSupported && f0.g(MessageCenterFragmentVM.this.m().f(), Boolean.TRUE)) {
                MessageCenterFragmentVM.this.f81305r--;
                MessageCenterFragmentVM.this.K().r(Boolean.FALSE);
                MessageCenterFragmentVM.v(MessageCenterFragmentVM.this);
            }
        }

        @Override // com.max.xiaoheihe.base.mvvm.repository.a
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 28361, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (f0.g(MessageCenterFragmentVM.this.m().f(), Boolean.TRUE)) {
                MessageCenterFragmentVM.this.f81305r--;
                MessageCenterFragmentVM.this.K().r(Boolean.FALSE);
                MessageCenterFragmentVM.this.k().r(BaseDisplayState.ERROR);
            }
        }

        @Override // com.max.xiaoheihe.base.mvvm.repository.a
        public /* bridge */ /* synthetic */ void onNext(Result<StrangerMsgListResultObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 28363, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a(result);
        }
    }

    /* JADX INFO: compiled from: MessageCenterFragmentVM.kt */
    public static final class e implements com.max.xiaoheihe.base.mvvm.repository.a<BBSUserMsgResult<BBSUserMsgsObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        public void a(@dl.d BBSUserMsgResult<BBSUserMsgsObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 28364, new Class[]{BBSUserMsgResult.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (f0.g(MessageCenterFragmentVM.this.m().f(), Boolean.TRUE)) {
                if (result.getResult() != null) {
                    BBSUserMsgsObj result2 = result.getResult();
                    f0.m(result2);
                    if (result2.getMessages() != null) {
                        ArrayList arrayList = MessageCenterFragmentVM.this.f81307t;
                        BBSUserMsgsObj result3 = result.getResult();
                        f0.m(result3);
                        arrayList.addAll(result3.getMessages());
                    }
                }
                MessageCenterFragmentVM.this.z().r(result);
            }
        }

        @Override // com.max.xiaoheihe.base.mvvm.repository.a
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28366, new Class[0], Void.TYPE).isSupported && f0.g(MessageCenterFragmentVM.this.m().f(), Boolean.TRUE)) {
                MessageCenterFragmentVM.this.f81305r--;
                MessageCenterFragmentVM.this.K().r(Boolean.FALSE);
                MessageCenterFragmentVM.v(MessageCenterFragmentVM.this);
            }
        }

        @Override // com.max.xiaoheihe.base.mvvm.repository.a
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 28365, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (f0.g(MessageCenterFragmentVM.this.m().f(), Boolean.TRUE)) {
                MessageCenterFragmentVM.this.f81305r--;
                MessageCenterFragmentVM.this.K().r(Boolean.FALSE);
                MessageCenterFragmentVM.this.k().r(BaseDisplayState.ERROR);
            }
        }

        @Override // com.max.xiaoheihe.base.mvvm.repository.a
        public /* bridge */ /* synthetic */ void onNext(BBSUserMsgResult<BBSUserMsgsObj> bBSUserMsgResult) {
            if (PatchProxy.proxy(new Object[]{bBSUserMsgResult}, this, changeQuickRedirect, false, 28367, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a(bBSUserMsgResult);
        }
    }

    public MessageCenterFragmentVM() {
        Boolean bool = Boolean.FALSE;
        this.f81298k = new i0<>(bool);
        this.f81299l = new i0<>(bool);
        this.f81300m = new i0<>();
        this.f81306s = new ArrayList<>();
        this.f81307t = new ArrayList<>();
        this.f81308u = r0.a(e1.e());
        this.f81309v = b0.b(LazyThreadSafetyMode.SYNCHRONIZED, new yh.a<MessageCenterFragmentRepository>() { // from class: com.max.xiaoheihe.module.bbs.messagecenter.MessageCenterFragmentVM$repository$2
            public static ChangeQuickRedirect changeQuickRedirect;

            @dl.d
            public final MessageCenterFragmentRepository a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28368, new Class[0], MessageCenterFragmentRepository.class);
                return patchProxyResultProxy.isSupported ? (MessageCenterFragmentRepository) patchProxyResultProxy.result : MessageCenterFragmentRepository.f81288f.a();
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.max.xiaoheihe.module.bbs.messagecenter.MessageCenterFragmentRepository, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ MessageCenterFragmentRepository invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28369, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
    }

    private final MessageCenterFragmentRepository H() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28334, new Class[0], MessageCenterFragmentRepository.class);
        return patchProxyResultProxy.isSupported ? (MessageCenterFragmentRepository) patchProxyResultProxy.result : (MessageCenterFragmentRepository) this.f81309v.getValue();
    }

    private final void I() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28341, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f81298k.r(Boolean.TRUE);
        this.f81305r = 1;
        H().e(this.f81301n, 30, new d());
    }

    private final void J() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28342, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f81298k.r(Boolean.TRUE);
        this.f81305r = 1;
        H().f(this.f81302o, this.f81303p, this.f81301n, 30, new e());
    }

    private final synchronized void T() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28343, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f81305r <= 0) {
            k().r(BaseDisplayState.CONTENT);
            this.f81306s.clear();
            this.f81306s.addAll(this.f81307t);
            i0<Boolean> i0Var = this.f81299l;
            i0Var.r(Boolean.valueOf(f0.g(i0Var.f(), Boolean.FALSE)));
        }
    }

    public static final /* synthetic */ void s(MessageCenterFragmentVM messageCenterFragmentVM) {
        if (PatchProxy.proxy(new Object[]{messageCenterFragmentVM}, null, changeQuickRedirect, true, 28344, new Class[]{MessageCenterFragmentVM.class}, Void.TYPE).isSupported) {
            return;
        }
        messageCenterFragmentVM.I();
    }

    public static final /* synthetic */ void t(MessageCenterFragmentVM messageCenterFragmentVM) {
        if (PatchProxy.proxy(new Object[]{messageCenterFragmentVM}, null, changeQuickRedirect, true, 28345, new Class[]{MessageCenterFragmentVM.class}, Void.TYPE).isSupported) {
            return;
        }
        messageCenterFragmentVM.J();
    }

    public static final /* synthetic */ void v(MessageCenterFragmentVM messageCenterFragmentVM) {
        if (PatchProxy.proxy(new Object[]{messageCenterFragmentVM}, null, changeQuickRedirect, true, 28346, new Class[]{MessageCenterFragmentVM.class}, Void.TYPE).isSupported) {
            return;
        }
        messageCenterFragmentVM.T();
    }

    @dl.e
    public final String A() {
        return this.f81302o;
    }

    @dl.e
    public final String B() {
        return this.f81303p;
    }

    public final int C() {
        return this.f81301n;
    }

    @dl.e
    public final String D() {
        return this.f81304q;
    }

    @dl.d
    public final ArrayList<BBSUserMsgObj> E() {
        return this.f81306s;
    }

    public final void F() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28337, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        k.f(this.f81308u, null, null, new MessageCenterFragmentVM$getMessageList$1(this, null), 3, null);
    }

    @dl.d
    public final i0<Boolean> G() {
        return this.f81299l;
    }

    @dl.d
    public final i0<Boolean> K() {
        return this.f81298k;
    }

    public final void L() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28336, new Class[0], Void.TYPE).isSupported || f0.g(this.f81298k.f(), Boolean.TRUE)) {
            return;
        }
        this.f81301n = 0;
        this.f81307t.clear();
        F();
    }

    public final void M(@dl.d i0<BBSUserMsgResult<BBSUserMsgsObj>> i0Var) {
        if (PatchProxy.proxy(new Object[]{i0Var}, this, changeQuickRedirect, false, 28333, new Class[]{i0.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(i0Var, "<set-?>");
        this.f81300m = i0Var;
    }

    public final void N(@dl.e String str) {
        this.f81302o = str;
    }

    public final void O(@dl.e String str) {
        this.f81303p = str;
    }

    public final void P(int i10) {
        this.f81301n = i10;
    }

    public final void Q(@dl.e String str) {
        this.f81304q = str;
    }

    public final void R(@dl.d i0<Boolean> i0Var) {
        if (PatchProxy.proxy(new Object[]{i0Var}, this, changeQuickRedirect, false, 28332, new Class[]{i0.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(i0Var, "<set-?>");
        this.f81299l = i0Var;
    }

    public final void S(@dl.d i0<Boolean> i0Var) {
        if (PatchProxy.proxy(new Object[]{i0Var}, this, changeQuickRedirect, false, 28331, new Class[]{i0.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(i0Var, "<set-?>");
        this.f81298k = i0Var;
    }

    @Override // com.max.xiaoheihe.base.mvvm.a
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28335, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        k().r(BaseDisplayState.LOADING);
        L();
    }

    public final void w(@dl.d String inviteID, @dl.d String state, @dl.d yh.a<b2> onNext) {
        if (PatchProxy.proxy(new Object[]{inviteID, state, onNext}, this, changeQuickRedirect, false, 28338, new Class[]{String.class, String.class, yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(inviteID, "inviteID");
        f0.p(state, "state");
        f0.p(onNext, "onNext");
        H().b(inviteID, state, new a(onNext));
    }

    public final void x(@dl.d String followID, @dl.d l<? super Result<?>, b2> onNext) {
        if (PatchProxy.proxy(new Object[]{followID, onNext}, this, changeQuickRedirect, false, 28340, new Class[]{String.class, l.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(followID, "followID");
        f0.p(onNext, "onNext");
        H().c(followID, new b(onNext));
    }

    public final void y(@dl.d String followID, @dl.e String str, @dl.d l<? super Result<?>, b2> onNext) {
        if (PatchProxy.proxy(new Object[]{followID, str, onNext}, this, changeQuickRedirect, false, 28339, new Class[]{String.class, String.class, l.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(followID, "followID");
        f0.p(onNext, "onNext");
        H().d(followID, str, new c(onNext));
    }

    @dl.d
    public final i0<BBSUserMsgResult<BBSUserMsgsObj>> z() {
        return this.f81300m;
    }
}
