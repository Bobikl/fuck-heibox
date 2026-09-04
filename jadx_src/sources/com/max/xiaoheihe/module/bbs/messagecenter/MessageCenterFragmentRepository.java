package com.max.xiaoheihe.module.bbs.messagecenter;

import androidx.compose.runtime.internal.o;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.bean.bbs.BBSUserMsgResult;
import com.max.xiaoheihe.bean.bbs.BBSUserMsgsObj;
import com.max.xiaoheihe.bean.chat.StrangerMsgListResultObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import jf.f;
import jf.g;
import kotlin.LazyThreadSafetyMode;
import kotlin.b0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.z;

/* JADX INFO: compiled from: MessageCenterFragmentRepository.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class MessageCenterFragmentRepository {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    public static final a f81288f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f81289g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private static final z<MessageCenterFragmentRepository> f81290h = b0.b(LazyThreadSafetyMode.SYNCHRONIZED, new yh.a<MessageCenterFragmentRepository>() { // from class: com.max.xiaoheihe.module.bbs.messagecenter.MessageCenterFragmentRepository$Companion$instance$2
        public static ChangeQuickRedirect changeQuickRedirect;

        @dl.d
        public final MessageCenterFragmentRepository a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28329, new Class[0], MessageCenterFragmentRepository.class);
            return patchProxyResultProxy.isSupported ? (MessageCenterFragmentRepository) patchProxyResultProxy.result : new MessageCenterFragmentRepository(null);
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.max.xiaoheihe.module.bbs.messagecenter.MessageCenterFragmentRepository, java.lang.Object] */
        @Override // yh.a
        public /* bridge */ /* synthetic */ MessageCenterFragmentRepository invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28330, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @e
    private f f81291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @e
    private g f81292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @e
    private jf.a f81293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @e
    private jf.d f81294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @e
    private jf.b f81295e;

    /* JADX INFO: compiled from: MessageCenterFragmentRepository.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final MessageCenterFragmentRepository a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28328, new Class[0], MessageCenterFragmentRepository.class);
            return patchProxyResultProxy.isSupported ? (MessageCenterFragmentRepository) patchProxyResultProxy.result : (MessageCenterFragmentRepository) MessageCenterFragmentRepository.f81290h.getValue();
        }
    }

    private MessageCenterFragmentRepository() {
    }

    public /* synthetic */ MessageCenterFragmentRepository(u uVar) {
        this();
    }

    public final void b(@dl.d String inviteID, @dl.d String state, @dl.d com.max.xiaoheihe.base.mvvm.repository.a<Result<?>> callback) {
        if (PatchProxy.proxy(new Object[]{inviteID, state, callback}, this, changeQuickRedirect, false, 28325, new Class[]{String.class, String.class, com.max.xiaoheihe.base.mvvm.repository.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(inviteID, "inviteID");
        f0.p(state, "state");
        f0.p(callback, "callback");
        jf.a aVar = new jf.a(callback);
        this.f81293c = aVar;
        f0.m(aVar);
        aVar.k(inviteID, state);
    }

    public final void c(@dl.d String followID, @dl.d com.max.xiaoheihe.base.mvvm.repository.a<Result<?>> callback) {
        if (PatchProxy.proxy(new Object[]{followID, callback}, this, changeQuickRedirect, false, 28327, new Class[]{String.class, com.max.xiaoheihe.base.mvvm.repository.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(followID, "followID");
        f0.p(callback, "callback");
        jf.b bVar = new jf.b(callback);
        this.f81295e = bVar;
        f0.m(bVar);
        bVar.k(followID);
    }

    public final void d(@dl.d String followID, @e String str, @dl.d com.max.xiaoheihe.base.mvvm.repository.a<Result<?>> callback) {
        if (PatchProxy.proxy(new Object[]{followID, str, callback}, this, changeQuickRedirect, false, 28326, new Class[]{String.class, String.class, com.max.xiaoheihe.base.mvvm.repository.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(followID, "followID");
        f0.p(callback, "callback");
        jf.d dVar = new jf.d(callback);
        this.f81294d = dVar;
        f0.m(dVar);
        dVar.k(followID, str);
    }

    public final void e(int i10, int i11, @dl.d com.max.xiaoheihe.base.mvvm.repository.a<Result<StrangerMsgListResultObj>> callBack) {
        Object[] objArr = {new Integer(i10), new Integer(i11), callBack};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 28323, new Class[]{cls, cls, com.max.xiaoheihe.base.mvvm.repository.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(callBack, "callBack");
        f fVar = new f(callBack);
        this.f81291a = fVar;
        f0.m(fVar);
        fVar.k(i10, i11);
    }

    public final void f(@e String str, @e String str2, int i10, int i11, @dl.d com.max.xiaoheihe.base.mvvm.repository.a<BBSUserMsgResult<BBSUserMsgsObj>> callback) {
        Object[] objArr = {str, str2, new Integer(i10), new Integer(i11), callback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 28324, new Class[]{String.class, String.class, cls, cls, com.max.xiaoheihe.base.mvvm.repository.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(callback, "callback");
        g gVar = new g(callback);
        this.f81292b = gVar;
        f0.m(gVar);
        gVar.k(str, str2, i10, i11);
    }
}
