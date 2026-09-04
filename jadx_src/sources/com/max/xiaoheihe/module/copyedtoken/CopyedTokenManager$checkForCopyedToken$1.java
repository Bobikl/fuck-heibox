package com.max.xiaoheihe.module.copyedtoken;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlin.text.Regex;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.i;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: CopyedTokenManager.kt */
/* JADX INFO: loaded from: classes10.dex */
@d(c = "com.max.xiaoheihe.module.copyedtoken.CopyedTokenManager$checkForCopyedToken$1", f = "CopyedTokenManager.kt", i = {1}, l = {132, 135}, m = "invokeSuspend", n = {"content"}, s = {"L$0"})
public final class CopyedTokenManager$checkForCopyedToken$1 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f83572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f83573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f83574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f83575e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ Activity f83576f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ boolean f83577g;

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.copyedtoken.CopyedTokenManager$checkForCopyedToken$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: CopyedTokenManager.kt */
    @d(c = "com.max.xiaoheihe.module.copyedtoken.CopyedTokenManager$checkForCopyedToken$1$1", f = "CopyedTokenManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f83578b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<String> f83579c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Ref.ObjectRef<String> objectRef, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f83579c = objectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 31459, new Class[]{Object.class, c.class}, c.class);
            return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new AnonymousClass1(this.f83579c, cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 31461, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @e c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 31460, new Class[]{q0.class, c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 31458, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            b.h();
            if (this.f83578b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
            try {
                this.f83579c.f124891b = com.max.xiaoheihe.utils.d.D();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            return b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CopyedTokenManager$checkForCopyedToken$1(String str, String str2, Activity activity, boolean z10, c<? super CopyedTokenManager$checkForCopyedToken$1> cVar) {
        super(2, cVar);
        this.f83574d = str;
        this.f83575e = str2;
        this.f83576f = activity;
        this.f83577g = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 31455, new Class[]{Object.class, c.class}, c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new CopyedTokenManager$checkForCopyedToken$1(this.f83574d, this.f83575e, this.f83576f, this.f83577g, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 31457, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 31456, new Class[]{q0.class, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((CopyedTokenManager$checkForCopyedToken$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007e  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c8  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Ref.ObjectRef objectRef;
        String str;
        String regex;
        Activity activity;
        boolean z10;
        String chatCopyedTokenRegex;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 31454, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = b.h();
        int i10 = this.f83573c;
        if (i10 != 0) {
            if (i10 == 1) {
                t0.n(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef = (Ref.ObjectRef) this.f83572b;
                t0.n(obj);
            }
            str = (String) objectRef.f124891b;
            if (str != null) {
                regex = this.f83574d;
                activity = this.f83576f;
                z10 = this.f83577g;
                chatCopyedTokenRegex = this.f83575e;
                if (!com.max.hbcommon.utils.c.u(regex) && str.length() >= 11) {
                    f0.o(regex, "regex");
                    if (new Regex(regex).k(str)) {
                        CopyedTokenManager.b(CopyedTokenManager.f83565a, str, activity, z10);
                        return b2.f124493a;
                    }
                }
                if (!com.max.hbcommon.utils.c.u(chatCopyedTokenRegex) && str.length() >= 11) {
                    f0.o(chatCopyedTokenRegex, "chatCopyedTokenRegex");
                    if (new Regex(chatCopyedTokenRegex).k(str)) {
                        CopyedTokenManager.a(CopyedTokenManager.f83565a, activity, str);
                        return b2.f124493a;
                    }
                }
            }
            return b2.f124493a;
        }
        t0.n(obj);
        this.f83573c = 1;
        if (DelayKt.b(1000L, this) == objH) {
            return objH;
        }
        objectRef = new Ref.ObjectRef();
        if (!com.max.hbcommon.utils.c.u(this.f83574d) || !com.max.hbcommon.utils.c.u(this.f83575e)) {
            CoroutineDispatcher coroutineDispatcherC = e1.c();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(objectRef, null);
            this.f83572b = objectRef;
            this.f83573c = 2;
            if (i.h(coroutineDispatcherC, anonymousClass1, this) == objH) {
                return objH;
            }
        }
        str = (String) objectRef.f124891b;
        if (str != null) {
            regex = this.f83574d;
            activity = this.f83576f;
            z10 = this.f83577g;
            chatCopyedTokenRegex = this.f83575e;
            if (!com.max.hbcommon.utils.c.u(regex)) {
                f0.o(regex, "regex");
                if (new Regex(regex).k(str)) {
                    CopyedTokenManager.b(CopyedTokenManager.f83565a, str, activity, z10);
                    return b2.f124493a;
                }
            }
            if (!com.max.hbcommon.utils.c.u(chatCopyedTokenRegex)) {
                f0.o(chatCopyedTokenRegex, "chatCopyedTokenRegex");
                if (new Regex(chatCopyedTokenRegex).k(str)) {
                    CopyedTokenManager.a(CopyedTokenManager.f83565a, activity, str);
                    return b2.f124493a;
                }
            }
        }
        return b2.f124493a;
    }
}
