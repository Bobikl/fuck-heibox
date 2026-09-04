package com.starlightc.ucropplus.ui;

import android.content.Intent;
import android.net.Uri;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.UCrop;
import com.starlightc.ucropplus.model.Draft;
import java.util.ArrayList;
import kotlin.b2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;

/* JADX INFO: compiled from: UCropPlusActivity.kt */
/* JADX INFO: loaded from: classes4.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.starlightc.ucropplus.ui.UCropPlusActivity$saveImage$1$saveError$1", f = "UCropPlusActivity.kt", i = {0, 0, 0}, l = {bb.c.b.f30903r7}, m = "invokeSuspend", n = {"resultList", "draftList", "hasEditedList"}, s = {"L$0", "L$1", "L$2"})
public final class UCropPlusActivity$saveImage$1$saveError$1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ UCropPlusActivity this$0;

    /* JADX INFO: renamed from: com.starlightc.ucropplus.ui.UCropPlusActivity$saveImage$1$saveError$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: UCropPlusActivity.kt */
    @t0({"SMAP\nUCropPlusActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UCropPlusActivity.kt\ncom/starlightc/ucropplus/ui/UCropPlusActivity$saveImage$1$saveError$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,633:1\n1#2:634\n*E\n"})
    @kotlin.coroutines.jvm.internal.d(c = "com.starlightc.ucropplus.ui.UCropPlusActivity$saveImage$1$saveError$1$1", f = "UCropPlusActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ ArrayList<Draft> $draftList;
        final /* synthetic */ ArrayList<Boolean> $hasEditedList;
        final /* synthetic */ ArrayList<Uri> $resultList;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ UCropPlusActivity this$0;

        /* JADX INFO: renamed from: com.starlightc.ucropplus.ui.UCropPlusActivity$saveImage$1$saveError$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: UCropPlusActivity.kt */
        @kotlin.coroutines.jvm.internal.d(c = "com.starlightc.ucropplus.ui.UCropPlusActivity$saveImage$1$saveError$1$1$1", f = "UCropPlusActivity.kt", i = {}, l = {bb.c.b.f31013w7}, m = "invokeSuspend", n = {}, s = {})
        public static final class C09401 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super Boolean>, Object> {
            public static ChangeQuickRedirect changeQuickRedirect;
            final /* synthetic */ UCropPlusFragment $fragment;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C09401(UCropPlusFragment uCropPlusFragment, kotlin.coroutines.c<? super C09401> cVar) {
                super(2, cVar);
                this.$fragment = uCropPlusFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.d
            public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 50674, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
                return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new C09401(this.$fragment, cVar);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super Boolean> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 50676, new Class[]{Object.class, Object.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
            }

            @dl.e
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super Boolean> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 50675, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((C09401) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.e
            public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50673, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                Object objH = kotlin.coroutines.intrinsics.b.h();
                int i10 = this.label;
                if (i10 == 0) {
                    kotlin.t0.n(obj);
                    UCropPlusFragment uCropPlusFragment = this.$fragment;
                    this.label = 1;
                    obj = uCropPlusFragment.save(this);
                    if (obj == objH) {
                        return objH;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.t0.n(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(UCropPlusActivity uCropPlusActivity, ArrayList<Draft> arrayList, ArrayList<Uri> arrayList2, ArrayList<Boolean> arrayList3, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.this$0 = uCropPlusActivity;
            this.$draftList = arrayList;
            this.$resultList = arrayList2;
            this.$hasEditedList = arrayList3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 50670, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            if (patchProxyResultProxy.isSupported) {
                return (kotlin.coroutines.c) patchProxyResultProxy.result;
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$draftList, this.$resultList, this.$hasEditedList, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 50672, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 50671, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50669, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            kotlin.coroutines.intrinsics.b.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
            q0 q0Var = (q0) this.L$0;
            for (UCropPlusFragment uCropPlusFragment : this.this$0.pageList) {
                if (uCropPlusFragment.needReport()) {
                    UCropPlusActivity.access$reportEdit(this.this$0);
                }
                kotlinx.coroutines.k.b(q0Var, null, null, new C09401(uCropPlusFragment, null), 3, null);
                Uri outputUri = uCropPlusFragment.getOutputUri();
                if (outputUri != null) {
                    kotlin.coroutines.jvm.internal.a.a(this.$resultList.add(outputUri));
                }
                this.$hasEditedList.add(kotlin.coroutines.jvm.internal.a.a(uCropPlusFragment.checkHasEdited()));
                uCropPlusFragment.saveCurrentState();
                this.$draftList.add(uCropPlusFragment.getDraft());
            }
            return b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UCropPlusActivity$saveImage$1$saveError$1(UCropPlusActivity uCropPlusActivity, kotlin.coroutines.c<? super UCropPlusActivity$saveImage$1$saveError$1> cVar) {
        super(2, cVar);
        this.this$0 = uCropPlusActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 50666, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new UCropPlusActivity$saveImage$1$saveError$1(this.this$0, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 50668, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 50667, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((UCropPlusActivity$saveImage$1$saveError$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50665, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, arrayList5, arrayList4, arrayList6, null);
            this.L$0 = arrayList4;
            this.L$1 = arrayList5;
            this.L$2 = arrayList6;
            this.label = 1;
            if (r0.g(anonymousClass1, this) == objH) {
                return objH;
            }
            arrayList = arrayList4;
            arrayList2 = arrayList5;
            arrayList3 = arrayList6;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList3 = (ArrayList) this.L$2;
            arrayList2 = (ArrayList) this.L$1;
            arrayList = (ArrayList) this.L$0;
            kotlin.t0.n(obj);
        }
        this.this$0.setResult(-1, new Intent().putExtra("HEYBOX_UCROP.Multi_OutputUri", arrayList).putExtra(UCrop.EXTRA_MULTI_DRAFT, arrayList2).putExtra(UCrop.EXTRA_MULTI_HAS_EDITED_FLAG, CollectionsKt___CollectionsKt.I5(arrayList3)).putExtra(UCropPlusActivity.ARG_EXTRA, this.this$0.extra));
        return b2.f124493a;
    }
}
