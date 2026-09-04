package com.max.xiaoheihe.app;

import android.util.Log;
import com.max.hbutils.utils.k;
import com.max.xiaoheihe.bean.bbs.AutoSavaDataObjKt;
import com.max.xiaoheihe.bean.bbs.PostEditAutoSaveData;
import com.max.xiaoheihe.bean.bbs.PostEditAutoSaveDataWrapper;
import com.max.xiaoheihe.module.bbs.post_edit.auto_save.PostEditAutoSaveManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.Result;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.text.u;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.i;
import kotlinx.coroutines.n2;
import kotlinx.coroutines.q0;
import org.json.JSONException;
import org.json.JSONObject;
import yh.l;
import yh.p;

/* JADX INFO: compiled from: PostEditAutoSaveManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@t0({"SMAP\nPostEditAutoSaveManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostEditAutoSaveManager.kt\ncom/max/xiaoheihe/module/bbs/post_edit/auto_save/PostEditAutoSaveManager$Companion$loadPostEditAutoSaveData$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,209:1\n1#2:210\n*E\n"})
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.bbs.post_edit.auto_save.PostEditAutoSaveManager$Companion$loadPostEditAutoSaveData$1", f = "PostEditAutoSaveManager.kt", i = {}, l = {180}, m = "invokeSuspend", n = {}, s = {})
public final class OneShotMainActivityIdleHandler$queueIdle$$inlined$loadPostEditAutoSaveData$1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f76835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f76836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.max.xiaoheihe.module.bbs.post_edit.auto_save.b f76837d;

    /* JADX INFO: renamed from: com.max.xiaoheihe.app.OneShotMainActivityIdleHandler$queueIdle$$inlined$loadPostEditAutoSaveData$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: PostEditAutoSaveManager.kt */
    @t0({"SMAP\nPostEditAutoSaveManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostEditAutoSaveManager.kt\ncom/max/xiaoheihe/module/bbs/post_edit/auto_save/PostEditAutoSaveManager$Companion$loadPostEditAutoSaveData$1$1$3$1\n*L\n1#1,209:1\n*E\n"})
    @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.bbs.post_edit.auto_save.PostEditAutoSaveManager$Companion$loadPostEditAutoSaveData$1$1$3$1", f = "PostEditAutoSaveManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f76839b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.max.xiaoheihe.module.bbs.post_edit.auto_save.b f76840c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f76841d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f76842e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f76843f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ PostEditAutoSaveData f76844g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(com.max.xiaoheihe.module.bbs.post_edit.auto_save.b bVar, String str, boolean z10, boolean z11, PostEditAutoSaveData postEditAutoSaveData, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f76840c = bVar;
            this.f76841d = str;
            this.f76842e = z10;
            this.f76843f = z11;
            this.f76844g = postEditAutoSaveData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.m.IG, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AnonymousClass2(this.f76840c, this.f76841d, this.f76842e, this.f76843f, this.f76844g, cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.m.KG, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.m.JG, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.HG, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            kotlin.coroutines.intrinsics.b.h();
            if (this.f76839b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
            this.f76840c.a(this.f76841d, this.f76842e, this.f76843f, this.f76844g);
            return b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneShotMainActivityIdleHandler$queueIdle$$inlined$loadPostEditAutoSaveData$1(com.max.xiaoheihe.module.bbs.post_edit.auto_save.b bVar, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.f76837d = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.m.CG, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (kotlin.coroutines.c) patchProxyResultProxy.result;
        }
        OneShotMainActivityIdleHandler$queueIdle$$inlined$loadPostEditAutoSaveData$1 oneShotMainActivityIdleHandler$queueIdle$$inlined$loadPostEditAutoSaveData$1 = new OneShotMainActivityIdleHandler$queueIdle$$inlined$loadPostEditAutoSaveData$1(this.f76837d, cVar);
        oneShotMainActivityIdleHandler$queueIdle$$inlined$loadPostEditAutoSaveData$1.f76836c = obj;
        return oneShotMainActivityIdleHandler$queueIdle$$inlined$loadPostEditAutoSaveData$1;
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.m.EG, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.m.DG, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((OneShotMainActivityIdleHandler$queueIdle$$inlined$loadPostEditAutoSaveData$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00e2  */
    /* JADX WARN: Instruction removed from duplicated block: B:46:0x00e2, please report this as an issue */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objB;
        Throwable thE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.BG, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f76835b;
        b2 b2Var = null;
        try {
            if (i10 == 0) {
                kotlin.t0.n(obj);
                com.max.xiaoheihe.module.bbs.post_edit.auto_save.b bVar = this.f76837d;
                Result.a aVar = Result.f124476c;
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                com.max.hbmmkv.c.b(null, new l<com.max.hbmmkv.b, b2>() { // from class: com.max.xiaoheihe.app.OneShotMainActivityIdleHandler$queueIdle$$inlined$loadPostEditAutoSaveData$1.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    {
                        super(1);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r2v3 */
                    /* JADX WARN: Type inference failed for: r2v5, types: [com.max.xiaoheihe.bean.bbs.PostEditAutoSaveDataWrapper] */
                    /* JADX WARN: Type inference failed for: r2v6 */
                    public final void a(@dl.d com.max.hbmmkv.b withMMKV) throws JSONException {
                        if (PatchProxy.proxy(new Object[]{withMMKV}, this, changeQuickRedirect, false, bb.c.m.FG, new Class[]{com.max.hbmmkv.b.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        f0.p(withMMKV, "$this$withMMKV");
                        Ref.ObjectRef objectRef2 = objectRef;
                        String strF = withMMKV.f(PostEditAutoSaveManager.f82872l, "", true);
                        T postEditAutoSaveDataWrapper = 0;
                        postEditAutoSaveDataWrapper = 0;
                        if (strF != null) {
                            if (!(true ^ u.V1(strF))) {
                                strF = null;
                            }
                            if (strF != null) {
                                JSONObject jSONObject = new JSONObject(strF);
                                String string = jSONObject.getString("postTypeName");
                                postEditAutoSaveDataWrapper = new PostEditAutoSaveDataWrapper(string, Boolean.valueOf(com.max.hbcommon.utils.c.x(jSONObject.getString("isEdit"))), Boolean.valueOf(com.max.hbcommon.utils.c.x(jSONObject.getString("canEditModifyPostPlan"))), k.a(jSONObject.getString("postEditAutoSaveData"), f0.g(string, "Article") ? PostEditAutoSaveData.ArticleLinkAutoSaveData.class : PostEditAutoSaveData.PicVideoLinkAutoSaveData.class));
                            }
                        }
                        objectRef2.f124891b = postEditAutoSaveDataWrapper;
                    }

                    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(com.max.hbmmkv.b bVar2) throws JSONException {
                        PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[]{bVar2}, this, changeQuickRedirect, false, bb.c.m.GG, new Class[]{Object.class}, Object.class);
                        if (patchProxyResultProxy2.isSupported) {
                            return patchProxyResultProxy2.result;
                        }
                        a(bVar2);
                        return b2.f124493a;
                    }
                }, 1, null);
                Log.d(PostEditAutoSaveManager.f82870j, "[loadPostEditAutoSaveData] deserializeData: " + objectRef.f124891b);
                Object obj2 = objectRef.f124891b;
                if (!AutoSavaDataObjKt.checkIsValid((PostEditAutoSaveDataWrapper) obj2)) {
                    obj2 = null;
                }
                PostEditAutoSaveDataWrapper postEditAutoSaveDataWrapper = (PostEditAutoSaveDataWrapper) obj2;
                if (postEditAutoSaveDataWrapper != null) {
                    String postTypeName = postEditAutoSaveDataWrapper.getPostTypeName();
                    f0.m(postTypeName);
                    Object postEditAutoSaveData = postEditAutoSaveDataWrapper.getPostEditAutoSaveData();
                    if (postEditAutoSaveData == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.max.xiaoheihe.bean.bbs.PostEditAutoSaveData");
                    }
                    PostEditAutoSaveData postEditAutoSaveData2 = (PostEditAutoSaveData) postEditAutoSaveData;
                    Boolean boolIsEdit = postEditAutoSaveDataWrapper.isEdit();
                    boolean zBooleanValue = boolIsEdit != null ? boolIsEdit.booleanValue() : false;
                    Boolean canEditModifyPostPlan = postEditAutoSaveDataWrapper.getCanEditModifyPostPlan();
                    boolean zBooleanValue2 = canEditModifyPostPlan != null ? canEditModifyPostPlan.booleanValue() : false;
                    n2 n2VarE = e1.e();
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(bVar, postTypeName, zBooleanValue, zBooleanValue2, postEditAutoSaveData2, null);
                    this.f76835b = 1;
                    if (i.h(n2VarE, anonymousClass2, this) == objH) {
                        return objH;
                    }
                }
                objB = Result.b(b2Var);
                thE = Result.e(objB);
                if (thE != null) {
                    Log.e(PostEditAutoSaveManager.f82870j, "[loadPostEditAutoSaveData] error: " + thE);
                }
                return b2.f124493a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
            b2Var = b2.f124493a;
            objB = Result.b(b2Var);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.f124476c;
            objB = Result.b(kotlin.t0.a(th2));
        }
        thE = Result.e(objB);
        if (thE != null) {
            Log.e(PostEditAutoSaveManager.f82870j, "[loadPostEditAutoSaveData] error: " + thE);
        }
        return b2.f124493a;
    }
}
