package com.max.xiaoheihe.module.bbs.post_edit;

import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.bean.bbs.post_edit.RecommendedTopicItems;
import com.max.xiaoheihe.bean.bbs.post_edit.RecommendedTopicObj;
import com.max.xiaoheihe.network.CoroutineServiceGenerator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: RecommendTopicViewModel.kt */
/* JADX INFO: loaded from: classes10.dex */
@kotlin.jvm.internal.t0({"SMAP\nRecommendTopicViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecommendTopicViewModel.kt\ncom/max/xiaoheihe/module/bbs/post_edit/RecommendTopicViewModel$requestOutsideRecommend$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,41:1\n766#2:42\n857#2,2:43\n*S KotlinDebug\n*F\n+ 1 RecommendTopicViewModel.kt\ncom/max/xiaoheihe/module/bbs/post_edit/RecommendTopicViewModel$requestOutsideRecommend$1\n*L\n25#1:42\n25#1:43,2\n*E\n"})
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.bbs.post_edit.RecommendTopicViewModel$requestOutsideRecommend$1", f = "RecommendTopicViewModel.kt", i = {}, l = {24}, m = "invokeSuspend", n = {}, s = {})
public final class RecommendTopicViewModel$requestOutsideRecommend$1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f82730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f82731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f82732d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f82733e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ yh.l<Boolean, b2> f82734f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ RecommendTopicViewModel f82735g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    RecommendTopicViewModel$requestOutsideRecommend$1(String str, String str2, String str3, yh.l<? super Boolean, b2> lVar, RecommendTopicViewModel recommendTopicViewModel, kotlin.coroutines.c<? super RecommendTopicViewModel$requestOutsideRecommend$1> cVar) {
        super(2, cVar);
        this.f82731c = str;
        this.f82732d = str2;
        this.f82733e = str3;
        this.f82734f = lVar;
        this.f82735g = recommendTopicViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 30781, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new RecommendTopicViewModel$requestOutsideRecommend$1(this.f82731c, this.f82732d, this.f82733e, this.f82734f, this.f82735g, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 30783, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 30782, new Class[]{kotlinx.coroutines.q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((RecommendTopicViewModel$requestOutsideRecommend$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        ArrayList arrayList;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 30780, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f82730b;
        try {
            if (i10 == 0) {
                kotlin.t0.n(obj);
                com.max.xiaoheihe.network.b bVarA = CoroutineServiceGenerator.f94823a.a();
                String str = this.f82731c;
                String str2 = this.f82732d;
                String str3 = this.f82733e;
                this.f82730b = 1;
                obj = bVarA.P5(str, str2, str3, this);
                if (obj == objH) {
                    return objH;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.t0.n(obj);
            }
            List<RecommendedTopicObj> items = ((RecommendedTopicItems) ((Result) obj).getResult()).getItems();
            if (items != null) {
                arrayList = new ArrayList();
                for (Object obj2 : items) {
                    RecommendedTopicObj recommendedTopicObj = (RecommendedTopicObj) obj2;
                    if ((recommendedTopicObj.isTopic() && !com.max.hbcommon.utils.c.u(recommendedTopicObj.getTopicId())) || (recommendedTopicObj.isHashtag() && !com.max.hbcommon.utils.c.u(recommendedTopicObj.getName()))) {
                        arrayList.add(obj2);
                    }
                }
            } else {
                arrayList = null;
            }
            this.f82734f.invoke(kotlin.coroutines.jvm.internal.a.a(true));
            this.f82735g.f82728d.d(new RecommendedTopicItems(arrayList));
        } catch (Exception unused) {
            this.f82734f.invoke(kotlin.coroutines.jvm.internal.a.a(false));
        }
        return b2.f124493a;
    }
}
