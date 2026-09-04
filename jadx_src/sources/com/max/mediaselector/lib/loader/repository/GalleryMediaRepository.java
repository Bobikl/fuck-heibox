package com.max.mediaselector.lib.loader.repository;

import android.content.Context;
import androidx.paging.Pager;
import androidx.paging.PagingDataTransforms;
import androidx.paging.n0;
import androidx.paging.o0;
import androidx.paging.q0;
import bb.c;
import com.max.mediaselector.lib.entity.LocalMedia;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import java.lang.ref.WeakReference;
import kotlin.b2;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.f;
import yh.a;

/* JADX INFO: compiled from: GalleryMediaRepository.kt */
/* JADX INFO: loaded from: classes2.dex */
@t0({"SMAP\nGalleryMediaRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GalleryMediaRepository.kt\ncom/max/mediaselector/lib/loader/repository/GalleryMediaRepository\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,54:1\n47#2:55\n49#2:59\n47#2:60\n49#2:64\n50#3:56\n55#3:58\n50#3:61\n55#3:63\n106#4:57\n106#4:62\n*S KotlinDebug\n*F\n+ 1 GalleryMediaRepository.kt\ncom/max/mediaselector/lib/loader/repository/GalleryMediaRepository\n*L\n35#1:55\n35#1:59\n48#1:60\n48#1:64\n35#1:56\n35#1:58\n48#1:61\n48#1:63\n35#1:57\n48#1:62\n*E\n"})
public final class GalleryMediaRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    public static final GalleryMediaRepository f75278a = new GalleryMediaRepository();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private static final n0 f75279b = new n0(200, 60, true, 200, 600, 0, 32, null);
    public static ChangeQuickRedirect changeQuickRedirect;

    private GalleryMediaRepository() {
    }

    @d
    public final e<o0<LocalMedia>> a(@d final Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, c.m.f34898n1, new Class[]{Context.class}, e.class);
        if (patchProxyResultProxy.isSupported) {
            return (e) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        final e eVarA = new Pager(f75279b, null, new a<q0<Integer, LocalMedia>>() { // from class: com.max.mediaselector.lib.loader.repository.GalleryMediaRepository$getImageMediaPagingData$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @d
            public final q0<Integer, LocalMedia> a() {
                PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.f35011s1, new Class[0], q0.class);
                return patchProxyResultProxy2.isSupported ? (q0) patchProxyResultProxy2.result : new GalleryMediaItemPagingSource(new WeakReference(context), GalleryMediaItemPagingSource.MediaType.ONLY_IMAGE);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.paging.q0<java.lang.Integer, com.max.mediaselector.lib.entity.LocalMedia>, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ q0<Integer, LocalMedia> invoke() {
                PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.f35033t1, new Class[0], Object.class);
                return patchProxyResultProxy2.isSupported ? patchProxyResultProxy2.result : a();
            }
        }, 2, null).a();
        return new e<o0<LocalMedia>>() { // from class: com.max.mediaselector.lib.loader.repository.GalleryMediaRepository$getImageMediaPagingData$$inlined$map$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: com.max.mediaselector.lib.loader.repository.GalleryMediaRepository$getImageMediaPagingData$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @t0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 GalleryMediaRepository.kt\ncom/max/mediaselector/lib/loader/repository/GalleryMediaRepository\n*L\n1#1,222:1\n48#2:223\n36#3:224\n*E\n"})
            public static final class AnonymousClass2<T> implements f {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ f f75281b;

                /* JADX INFO: renamed from: com.max.mediaselector.lib.loader.repository.GalleryMediaRepository$getImageMediaPagingData$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @t0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                @kotlin.coroutines.jvm.internal.d(c = "com.max.mediaselector.lib.loader.repository.GalleryMediaRepository$getImageMediaPagingData$$inlined$map$1$2", f = "GalleryMediaRepository.kt", i = {}, l = {c.b.f30852p1}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    /* synthetic */ Object f75282b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    int f75283c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    Object f75284d;

                    public AnonymousClass1(kotlin.coroutines.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @dl.e
                    public final Object invokeSuspend(@d Object obj) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.m.f34989r1, new Class[]{Object.class}, Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        this.f75282b = obj;
                        this.f75283c |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(f fVar) {
                    this.f75281b = fVar;
                }

                /* JADX WARN: Code duplicated, block: B:11:0x0039  */
                @Override // kotlinx.coroutines.flow.f
                @dl.e
                public final Object emit(Object obj, @d kotlin.coroutines.c cVar) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, c.m.f34967q1, new Class[]{Object.class, kotlin.coroutines.c.class}, Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i10 = anonymousClass1.f75283c;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f75283c = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(cVar);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(cVar);
                    }
                    Object obj2 = anonymousClass1.f75282b;
                    Object objH = b.h();
                    int i11 = anonymousClass1.f75283c;
                    if (i11 == 0) {
                        kotlin.t0.n(obj2);
                        f fVar = this.f75281b;
                        o0 o0VarB = PagingDataTransforms.b((o0) obj, new GalleryMediaRepository$getImageMediaPagingData$2$1(null));
                        anonymousClass1.f75283c = 1;
                        if (fVar.emit(o0VarB, anonymousClass1) == objH) {
                            return objH;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.t0.n(obj2);
                    }
                    return b2.f124493a;
                }
            }

            @Override // kotlinx.coroutines.flow.e
            @dl.e
            public Object a(@d f<? super o0<LocalMedia>> fVar, @d kotlin.coroutines.c cVar) {
                PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[]{fVar, cVar}, this, changeQuickRedirect, false, c.m.f34944p1, new Class[]{f.class, kotlin.coroutines.c.class}, Object.class);
                if (patchProxyResultProxy2.isSupported) {
                    return patchProxyResultProxy2.result;
                }
                Object objA = eVarA.a(new AnonymousClass2(fVar), cVar);
                return objA == b.h() ? objA : b2.f124493a;
            }
        };
    }

    @d
    public final e<o0<LocalMedia>> b(@d final Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, c.m.f34921o1, new Class[]{Context.class}, e.class);
        if (patchProxyResultProxy.isSupported) {
            return (e) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        final e eVarA = new Pager(f75279b, null, new a<q0<Integer, LocalMedia>>() { // from class: com.max.mediaselector.lib.loader.repository.GalleryMediaRepository$getVideoMediaPagingData$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @d
            public final q0<Integer, LocalMedia> a() {
                PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.B1, new Class[0], q0.class);
                return patchProxyResultProxy2.isSupported ? (q0) patchProxyResultProxy2.result : new GalleryMediaItemPagingSource(new WeakReference(context), GalleryMediaItemPagingSource.MediaType.ONLY_VIDEO);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.paging.q0<java.lang.Integer, com.max.mediaselector.lib.entity.LocalMedia>, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ q0<Integer, LocalMedia> invoke() {
                PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.C1, new Class[0], Object.class);
                return patchProxyResultProxy2.isSupported ? patchProxyResultProxy2.result : a();
            }
        }, 2, null).a();
        return new e<o0<LocalMedia>>() { // from class: com.max.mediaselector.lib.loader.repository.GalleryMediaRepository$getVideoMediaPagingData$$inlined$map$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: com.max.mediaselector.lib.loader.repository.GalleryMediaRepository$getVideoMediaPagingData$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @t0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 GalleryMediaRepository.kt\ncom/max/mediaselector/lib/loader/repository/GalleryMediaRepository\n*L\n1#1,222:1\n48#2:223\n49#3:224\n*E\n"})
            public static final class AnonymousClass2<T> implements f {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ f f75290b;

                /* JADX INFO: renamed from: com.max.mediaselector.lib.loader.repository.GalleryMediaRepository$getVideoMediaPagingData$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @t0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                @kotlin.coroutines.jvm.internal.d(c = "com.max.mediaselector.lib.loader.repository.GalleryMediaRepository$getVideoMediaPagingData$$inlined$map$1$2", f = "GalleryMediaRepository.kt", i = {}, l = {c.b.f30852p1}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    /* synthetic */ Object f75291b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    int f75292c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    Object f75293d;

                    public AnonymousClass1(kotlin.coroutines.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @dl.e
                    public final Object invokeSuspend(@d Object obj) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.m.A1, new Class[]{Object.class}, Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        this.f75291b = obj;
                        this.f75292c |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(f fVar) {
                    this.f75290b = fVar;
                }

                /* JADX WARN: Code duplicated, block: B:11:0x0039  */
                @Override // kotlinx.coroutines.flow.f
                @dl.e
                public final Object emit(Object obj, @d kotlin.coroutines.c cVar) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, c.m.f35165z1, new Class[]{Object.class, kotlin.coroutines.c.class}, Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i10 = anonymousClass1.f75292c;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f75292c = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(cVar);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(cVar);
                    }
                    Object obj2 = anonymousClass1.f75291b;
                    Object objH = b.h();
                    int i11 = anonymousClass1.f75292c;
                    if (i11 == 0) {
                        kotlin.t0.n(obj2);
                        f fVar = this.f75290b;
                        o0 o0VarB = PagingDataTransforms.b((o0) obj, new GalleryMediaRepository$getVideoMediaPagingData$2$1(null));
                        anonymousClass1.f75292c = 1;
                        if (fVar.emit(o0VarB, anonymousClass1) == objH) {
                            return objH;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.t0.n(obj2);
                    }
                    return b2.f124493a;
                }
            }

            @Override // kotlinx.coroutines.flow.e
            @dl.e
            public Object a(@d f<? super o0<LocalMedia>> fVar, @d kotlin.coroutines.c cVar) {
                PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[]{fVar, cVar}, this, changeQuickRedirect, false, c.m.f35143y1, new Class[]{f.class, kotlin.coroutines.c.class}, Object.class);
                if (patchProxyResultProxy2.isSupported) {
                    return patchProxyResultProxy2.result;
                }
                Object objA = eVarA.a(new AnonymousClass2(fVar), cVar);
                return objA == b.h() ? objA : b2.f124493a;
            }
        };
    }
}
