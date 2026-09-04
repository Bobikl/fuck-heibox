package com.max.xiaoheihe.module.bbs.post_edit;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.recyclerview.widget.DiffUtil;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.max.xiaoheihe.bean.bbs.post_edit.RecommendedTopicItems;
import com.max.xiaoheihe.bean.bbs.post_edit.RecommendedTopicObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: RecommendedTopicsController.kt */
/* JADX INFO: loaded from: classes10.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.bbs.post_edit.RecommendedTopicsController$attachTopicList$1", f = "RecommendedTopicsController.kt", i = {}, l = {151}, m = "invokeSuspend", n = {}, s = {})
public final class RecommendedTopicsController$attachTopicList$1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f82753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ RecommendedTopicsController f82754c;

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.post_edit.RecommendedTopicsController$attachTopicList$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: RecommendedTopicsController.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.bbs.post_edit.RecommendedTopicsController$attachTopicList$1$1", f = "RecommendedTopicsController.kt", i = {}, l = {152}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f82755b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ RecommendedTopicsController f82756c;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.post_edit.RecommendedTopicsController$attachTopicList$1$1$a */
        /* JADX INFO: compiled from: RecommendedTopicsController.kt */
        @kotlin.jvm.internal.t0({"SMAP\nRecommendedTopicsController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecommendedTopicsController.kt\ncom/max/xiaoheihe/module/bbs/post_edit/RecommendedTopicsController$attachTopicList$1$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,329:1\n1549#2:330\n1620#2,3:331\n766#2:334\n857#2,2:335\n*S KotlinDebug\n*F\n+ 1 RecommendedTopicsController.kt\ncom/max/xiaoheihe/module/bbs/post_edit/RecommendedTopicsController$attachTopicList$1$1$1\n*L\n155#1:330\n155#1:331,3\n160#1:334\n160#1:335,2\n*E\n"})
        public static final class a implements kotlinx.coroutines.flow.f<RecommendedTopicItems> {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ RecommendedTopicsController f82757b;

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.post_edit.RecommendedTopicsController$attachTopicList$1$1$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: RecommendedTopicsController.kt */
            public static final class C0712a extends DiffUtil.ItemCallback<RecommendedTopicObj> {
                public static ChangeQuickRedirect changeQuickRedirect;

                C0712a() {
                }

                public boolean a(@dl.d RecommendedTopicObj oldItem, @dl.d RecommendedTopicObj newItem) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{oldItem, newItem}, this, changeQuickRedirect, false, 30822, new Class[]{RecommendedTopicObj.class, RecommendedTopicObj.class}, Boolean.TYPE);
                    if (patchProxyResultProxy.isSupported) {
                        return ((Boolean) patchProxyResultProxy.result).booleanValue();
                    }
                    kotlin.jvm.internal.f0.p(oldItem, "oldItem");
                    kotlin.jvm.internal.f0.p(newItem, "newItem");
                    return kotlin.jvm.internal.f0.g(oldItem.getName(), newItem.getName()) && kotlin.jvm.internal.f0.g(oldItem.getPicUrl(), newItem.getPicUrl());
                }

                @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
                public /* bridge */ /* synthetic */ boolean areContentsTheSame(RecommendedTopicObj recommendedTopicObj, RecommendedTopicObj recommendedTopicObj2) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{recommendedTopicObj, recommendedTopicObj2}, this, changeQuickRedirect, false, 30824, new Class[]{Object.class, Object.class}, Boolean.TYPE);
                    return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : a(recommendedTopicObj, recommendedTopicObj2);
                }

                @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
                public /* bridge */ /* synthetic */ boolean areItemsTheSame(RecommendedTopicObj recommendedTopicObj, RecommendedTopicObj recommendedTopicObj2) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{recommendedTopicObj, recommendedTopicObj2}, this, changeQuickRedirect, false, 30823, new Class[]{Object.class, Object.class}, Boolean.TYPE);
                    return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : b(recommendedTopicObj, recommendedTopicObj2);
                }

                public boolean b(@dl.d RecommendedTopicObj oldItem, @dl.d RecommendedTopicObj newItem) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{oldItem, newItem}, this, changeQuickRedirect, false, 30821, new Class[]{RecommendedTopicObj.class, RecommendedTopicObj.class}, Boolean.TYPE);
                    if (patchProxyResultProxy.isSupported) {
                        return ((Boolean) patchProxyResultProxy.result).booleanValue();
                    }
                    kotlin.jvm.internal.f0.p(oldItem, "oldItem");
                    kotlin.jvm.internal.f0.p(newItem, "newItem");
                    return kotlin.jvm.internal.f0.g(oldItem.getItemType(), newItem.getItemType()) && kotlin.jvm.internal.f0.g(oldItem.getTopicId(), newItem.getTopicId()) && kotlin.jvm.internal.f0.g(oldItem.getName(), newItem.getName());
                }
            }

            a(RecommendedTopicsController recommendedTopicsController) {
                this.f82757b = recommendedTopicsController;
            }

            /* JADX WARN: Code duplicated, block: B:17:0x0063  */
            @dl.e
            public final Object a(@dl.e RecommendedTopicItems recommendedTopicItems, @dl.d kotlin.coroutines.c<? super b2> cVar) {
                List listE;
                List<RecommendedTopicObj> items;
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{recommendedTopicItems, cVar}, this, changeQuickRedirect, false, 30819, new Class[]{RecommendedTopicItems.class, kotlin.coroutines.c.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                ArrayList arrayList = new ArrayList();
                List<BBSTopicObj> listO2 = this.f82757b.f82737a.O2();
                if (listO2 != null) {
                    ArrayList arrayList2 = new ArrayList(kotlin.collections.t.Y(listO2, 10));
                    Iterator<T> it = listO2.iterator();
                    while (it.hasNext()) {
                        String topic_id = ((BBSTopicObj) it.next()).getTopic_id();
                        if (topic_id == null) {
                            topic_id = null;
                        }
                        arrayList2.add(topic_id);
                    }
                    listE = CollectionsKt___CollectionsKt.Q5(arrayList2);
                    if (listE == null) {
                        listE = CollectionsKt__CollectionsKt.E();
                    }
                } else {
                    listE = CollectionsKt__CollectionsKt.E();
                }
                List<String> listJ1 = this.f82757b.f82737a.J1();
                if (listJ1 == null) {
                    listJ1 = CollectionsKt__CollectionsKt.E();
                }
                if (recommendedTopicItems != null && (items = recommendedTopicItems.getItems()) != null) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : items) {
                        RecommendedTopicObj recommendedTopicObj = (RecommendedTopicObj) obj;
                        if ((recommendedTopicObj.isTopic() && !listE.contains(recommendedTopicObj.getTopicId())) || (recommendedTopicObj.isHashtag() && !CollectionsKt___CollectionsKt.R1(listJ1, recommendedTopicObj.getName()))) {
                            arrayList3.add(obj);
                        }
                    }
                }
                if (this.f82757b.f82743g || arrayList.isEmpty()) {
                    this.f82757b.s().setVisibility(8);
                } else {
                    com.max.hbcommon.base.adapter.d.b(this.f82757b.f82742f, arrayList, new C0712a());
                    RecommendedTopicsController.o(this.f82757b);
                }
                return b2.f124493a;
            }

            @Override // kotlinx.coroutines.flow.f
            public /* bridge */ /* synthetic */ Object emit(RecommendedTopicItems recommendedTopicItems, kotlin.coroutines.c cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{recommendedTopicItems, cVar}, this, changeQuickRedirect, false, 30820, new Class[]{Object.class, kotlin.coroutines.c.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(recommendedTopicItems, cVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(RecommendedTopicsController recommendedTopicsController, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f82756c = recommendedTopicsController;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 30816, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AnonymousClass1(this.f82756c, cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 30818, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 30817, new Class[]{kotlinx.coroutines.q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 30815, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f82755b;
            if (i10 == 0) {
                kotlin.t0.n(obj);
                kotlinx.coroutines.flow.n<RecommendedTopicItems> nVarH = this.f82756c.f82738b.h();
                a aVar = new a(this.f82756c);
                this.f82755b = 1;
                if (nVarH.a(aVar, this) == objH) {
                    return objH;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.t0.n(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecommendedTopicsController$attachTopicList$1(RecommendedTopicsController recommendedTopicsController, kotlin.coroutines.c<? super RecommendedTopicsController$attachTopicList$1> cVar) {
        super(2, cVar);
        this.f82754c = recommendedTopicsController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 30812, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new RecommendedTopicsController$attachTopicList$1(this.f82754c, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 30814, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 30813, new Class[]{kotlinx.coroutines.q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((RecommendedTopicsController$attachTopicList$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 30811, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f82753b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            androidx.lifecycle.y yVar = this.f82754c.f82741e;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f82754c, null);
            this.f82753b = 1;
            if (RepeatOnLifecycleKt.b(yVar, state, anonymousClass1, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
        }
        return b2.f124493a;
    }
}
