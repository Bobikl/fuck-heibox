package com.max.xiaoheihe.router.interceptors;

import android.content.Context;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.bean.bbs.LinkInfoObj;
import com.max.xiaoheihe.bean.game.ShareGameCommentDataObj;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.File;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: PostPathInterceptor.kt */
/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.router.interceptors.PostPathInterceptor$handlePictureAndVideoWithGameComment$1$onNext$1", f = "PostPathInterceptor.kt", i = {0, 0}, l = {244}, m = "invokeSuspend", n = {"gameCommentContent", "commentGameFile"}, s = {"L$0", "L$1"})
public final class PostPathInterceptor$handlePictureAndVideoWithGameComment$1$onNext$1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f94932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f94933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f94934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f94935e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ Result<ShareGameCommentDataObj> f94936f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ PostPathInterceptor f94937g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ LoadingDialog f94938h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ com.sankuai.waimai.router.core.i f94939i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final /* synthetic */ yh.a<b2> f94940j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final /* synthetic */ Ref.ObjectRef<String> f94941k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PostPathInterceptor$handlePictureAndVideoWithGameComment$1$onNext$1(Result<ShareGameCommentDataObj> result, PostPathInterceptor postPathInterceptor, LoadingDialog loadingDialog, com.sankuai.waimai.router.core.i iVar, yh.a<b2> aVar, Ref.ObjectRef<String> objectRef, kotlin.coroutines.c<? super PostPathInterceptor$handlePictureAndVideoWithGameComment$1$onNext$1> cVar) {
        super(2, cVar);
        this.f94936f = result;
        this.f94937g = postPathInterceptor;
        this.f94938h = loadingDialog;
        this.f94939i = iVar;
        this.f94940j = aVar;
        this.f94941k = objectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 48179, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new PostPathInterceptor$handlePictureAndVideoWithGameComment$1$onNext$1(this.f94936f, this.f94937g, this.f94938h, this.f94939i, this.f94940j, this.f94941k, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 48181, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 48180, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((PostPathInterceptor$handlePictureAndVideoWithGameComment$1$onNext$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x009d  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        Ref.ObjectRef objectRef3;
        T t10;
        Ref.ObjectRef objectRef4;
        com.max.hbutils.utils.b bVar;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 48178, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f94935e;
        if (i10 == 0) {
            t0.n(obj);
            objectRef = new Ref.ObjectRef();
            objectRef2 = new Ref.ObjectRef();
            ShareGameCommentDataObj result = this.f94936f.getResult();
            if (result != null) {
                Ref.ObjectRef<String> objectRef5 = this.f94941k;
                PostPathInterceptor postPathInterceptor = this.f94937g;
                com.sankuai.waimai.router.core.i iVar = this.f94939i;
                LinkInfoObj comment_detail = result.getComment_detail();
                T description = comment_detail != null ? comment_detail.getDescription() : 0;
                if (i0.q(objectRef5.f124891b)) {
                    objectRef.f124891b = description;
                }
                Context contextB = iVar.b();
                f0.o(contextB, "request.context");
                this.f94932b = objectRef;
                this.f94933c = objectRef2;
                this.f94934d = objectRef2;
                this.f94935e = 1;
                Object objE = PostPathInterceptor.e(postPathInterceptor, contextB, result, this);
                if (objE == objH) {
                    return objH;
                }
                objectRef3 = objectRef2;
                t10 = objE;
                objectRef4 = objectRef3;
            }
            bVar = this.f94937g.f94921c;
            if (bVar != null) {
                bVar.d();
            }
            this.f94938h.c();
            PostPathInterceptor.d(this.f94937g, this.f94939i, (File) objectRef2.f124891b, (String) objectRef.f124891b, this.f94940j);
            return b2.f124493a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        objectRef4 = (Ref.ObjectRef) this.f94934d;
        objectRef3 = (Ref.ObjectRef) this.f94933c;
        objectRef = (Ref.ObjectRef) this.f94932b;
        t0.n(obj);
        t10 = obj;
        objectRef4.f124891b = t10;
        objectRef2 = objectRef3;
        bVar = this.f94937g.f94921c;
        if (bVar != null) {
            bVar.d();
        }
        this.f94938h.c();
        PostPathInterceptor.d(this.f94937g, this.f94939i, (File) objectRef2.f124891b, (String) objectRef.f124891b, this.f94940j);
        return b2.f124493a;
    }
}
