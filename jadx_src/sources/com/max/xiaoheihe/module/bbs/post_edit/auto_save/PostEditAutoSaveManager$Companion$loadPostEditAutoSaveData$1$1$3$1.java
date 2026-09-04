package com.max.xiaoheihe.module.bbs.post_edit.auto_save;

import com.max.xiaoheihe.bean.bbs.PostEditAutoSaveData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: PostEditAutoSaveManager.kt */
/* JADX INFO: loaded from: classes10.dex */
@t0({"SMAP\nPostEditAutoSaveManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostEditAutoSaveManager.kt\ncom/max/xiaoheihe/module/bbs/post_edit/auto_save/PostEditAutoSaveManager$Companion$loadPostEditAutoSaveData$1$1$3$1\n*L\n1#1,209:1\n*E\n"})
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.bbs.post_edit.auto_save.PostEditAutoSaveManager$Companion$loadPostEditAutoSaveData$1$1$3$1", f = "PostEditAutoSaveManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class PostEditAutoSaveManager$Companion$loadPostEditAutoSaveData$1$1$3$1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f82886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ b<T> f82887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f82888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f82889e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ boolean f82890f;

    /* JADX INFO: Incorrect field signature: TT; */
    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ PostEditAutoSaveData f82891g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Lcom/max/xiaoheihe/module/bbs/post_edit/auto_save/b<TT;>;Ljava/lang/String;ZZTT;Lkotlin/coroutines/c<-Lcom/max/xiaoheihe/module/bbs/post_edit/auto_save/PostEditAutoSaveManager$Companion$loadPostEditAutoSaveData$1$1$3$1;>;)V */
    public PostEditAutoSaveManager$Companion$loadPostEditAutoSaveData$1$1$3$1(b bVar, String str, boolean z10, boolean z11, PostEditAutoSaveData postEditAutoSaveData, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.f82887c = bVar;
        this.f82888d = str;
        this.f82889e = z10;
        this.f82890f = z11;
        this.f82891g = postEditAutoSaveData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 30902, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new PostEditAutoSaveManager$Companion$loadPostEditAutoSaveData$1$1$3$1(this.f82887c, this.f82888d, this.f82889e, this.f82890f, this.f82891g, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 30904, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 30903, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((PostEditAutoSaveManager$Companion$loadPostEditAutoSaveData$1$1$3$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 30901, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        kotlin.coroutines.intrinsics.b.h();
        if (this.f82886b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.t0.n(obj);
        this.f82887c.a(this.f82888d, this.f82889e, this.f82890f, this.f82891g);
        return b2.f124493a;
    }
}
