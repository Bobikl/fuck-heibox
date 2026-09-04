package com.max.hbcommon.component;

import android.graphics.Bitmap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.n2;

/* JADX INFO: compiled from: BlurView.kt */
/* JADX INFO: loaded from: classes9.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.hbcommon.component.BlurView$blur$1", f = "BlurView.kt", i = {}, l = {38}, m = "invokeSuspend", n = {}, s = {})
public final class BlurView$blur$1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f66949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Bitmap f66950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f66951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f66952e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ BlurView f66953f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ float f66954g;

    /* JADX INFO: renamed from: com.max.hbcommon.component.BlurView$blur$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: BlurView.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.max.hbcommon.component.BlurView$blur$1$1", f = "BlurView.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f66955b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Bitmap f66956c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f66957d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f66958e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ BlurView f66959f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f66960g;

        /* JADX INFO: renamed from: com.max.hbcommon.component.BlurView$blur$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: BlurView.kt */
        @kotlin.coroutines.jvm.internal.d(c = "com.max.hbcommon.component.BlurView$blur$1$1$1", f = "BlurView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C05381 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f66961b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ BlurView f66962c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Ref.ObjectRef<Bitmap> f66963d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C05381(BlurView blurView, Ref.ObjectRef<Bitmap> objectRef, kotlin.coroutines.c<? super C05381> cVar) {
                super(2, cVar);
                this.f66962c = blurView;
                this.f66963d = objectRef;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.d
            public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.d.f31433o6, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
                return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new C05381(this.f66962c, this.f66963d, cVar);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.d.f31479q6, new Class[]{Object.class, Object.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
            }

            @dl.e
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.d.f31456p6, new Class[]{kotlinx.coroutines.q0.class, kotlin.coroutines.c.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((C05381) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.e
            public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.d.f31410n6, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                kotlin.coroutines.intrinsics.b.h();
                if (this.f66961b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.t0.n(obj);
                this.f66962c.setImageBitmap(this.f66963d.f124891b);
                return b2.f124493a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Bitmap bitmap, int i10, int i11, BlurView blurView, float f10, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f66956c = bitmap;
            this.f66957d = i10;
            this.f66958e = i11;
            this.f66959f = blurView;
            this.f66960g = f10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.d.f31341k6, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AnonymousClass1(this.f66956c, this.f66957d, this.f66958e, this.f66959f, this.f66960g, cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.d.f31387m6, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.d.f31364l6, new Class[]{kotlinx.coroutines.q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v5, types: [T, android.graphics.Bitmap, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r10v6, types: [T, android.graphics.Bitmap] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
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
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.d.f31318j6, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f66955b;
            if (i10 == 0) {
                kotlin.t0.n(obj);
                int height = this.f66956c.getHeight();
                int height2 = this.f66957d;
                if (height <= height2) {
                    height2 = this.f66956c.getHeight();
                }
                Bitmap bitmap = this.f66956c;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, bitmap.getHeight() - height2, this.f66956c.getWidth(), height2);
                kotlin.jvm.internal.f0.o(bitmapCreateBitmap, "createBitmap(...)");
                zb.b bVar = new zb.b();
                bVar.f141959a = this.f66956c.getWidth();
                bVar.f141960b = height2;
                bVar.f141962d = 6;
                bVar.f141963e = this.f66958e;
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                ?? element = zb.a.b(this.f66959f.getContext(), bitmapCreateBitmap, bVar);
                objectRef.f124891b = element;
                BlurView blurView = this.f66959f;
                kotlin.jvm.internal.f0.o(element, "element");
                objectRef.f124891b = blurView.h(element, 255.0f, this.f66960g);
                n2 n2VarE = e1.e();
                C05381 c05381 = new C05381(this.f66959f, objectRef, null);
                this.f66955b = 1;
                if (kotlinx.coroutines.i.h(n2VarE, c05381, this) == objH) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BlurView$blur$1(Bitmap bitmap, int i10, int i11, BlurView blurView, float f10, kotlin.coroutines.c<? super BlurView$blur$1> cVar) {
        super(2, cVar);
        this.f66950c = bitmap;
        this.f66951d = i10;
        this.f66952e = i11;
        this.f66953f = blurView;
        this.f66954g = f10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.d.f31249g6, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new BlurView$blur$1(this.f66950c, this.f66951d, this.f66952e, this.f66953f, this.f66954g, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.d.f31295i6, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.d.f31272h6, new Class[]{kotlinx.coroutines.q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((BlurView$blur$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.d.f31226f6, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f66949b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            CoroutineDispatcher coroutineDispatcherC = e1.c();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f66950c, this.f66951d, this.f66952e, this.f66953f, this.f66954g, null);
            this.f66949b = 1;
            if (kotlinx.coroutines.i.h(coroutineDispatcherC, anonymousClass1, this) == objH) {
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
