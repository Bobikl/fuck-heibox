package androidx.compose.ui.text.font;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutKt;

/* JADX INFO: compiled from: FontListFontFamilyTypefaceAdapter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1", f = "FontListFontFamilyTypefaceAdapter.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
public final class FontListFontFamilyTypefaceAdapter$preload$3$2$1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super Object>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f16500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ FontListFontFamilyTypefaceAdapter f16501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ u f16502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ q0 f16503e;

    /* JADX INFO: renamed from: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1$1", f = "FontListFontFamilyTypefaceAdapter.kt", i = {}, l = {107}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements yh.l<kotlin.coroutines.c<? super Object>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f16504b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ u f16505c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ q0 f16506d;

        /* JADX INFO: renamed from: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: FontListFontFamilyTypefaceAdapter.kt */
        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1$1$1", f = "FontListFontFamilyTypefaceAdapter.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, s = {})
        public static final class C01031 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super Object>, Object> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f16507b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ q0 f16508c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ u f16509d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01031(q0 q0Var, u uVar, kotlin.coroutines.c<? super C01031> cVar) {
                super(2, cVar);
                this.f16508c = q0Var;
                this.f16509d = uVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.d
            public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                return new C01031(this.f16508c, this.f16509d, cVar);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super Object> cVar) {
                return invoke2(q0Var, (kotlin.coroutines.c<Object>) cVar);
            }

            @dl.e
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<Object> cVar) {
                return ((C01031) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.e
            public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                Object objH = kotlin.coroutines.intrinsics.b.h();
                int i10 = this.f16507b;
                if (i10 == 0) {
                    kotlin.t0.n(obj);
                    q0 q0Var = this.f16508c;
                    u uVar = this.f16509d;
                    this.f16507b = 1;
                    obj = q0Var.b(uVar, this);
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
        AnonymousClass1(u uVar, q0 q0Var, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(1, cVar);
            this.f16505c = uVar;
            this.f16506d = q0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.d kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(this.f16505c, this.f16506d, cVar);
        }

        @Override // yh.l
        public /* bridge */ /* synthetic */ Object invoke(kotlin.coroutines.c<? super Object> cVar) {
            return invoke2((kotlin.coroutines.c<Object>) cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.e kotlin.coroutines.c<Object> cVar) {
            return ((AnonymousClass1) create(cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f16504b;
            try {
                if (i10 == 0) {
                    kotlin.t0.n(obj);
                    C01031 c01031 = new C01031(this.f16506d, this.f16505c, null);
                    this.f16504b = 1;
                    obj = TimeoutKt.c(15000L, c01031, this);
                    if (obj == objH) {
                        return objH;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.t0.n(obj);
                }
                if (obj != null) {
                    return obj;
                }
                throw new IllegalStateException("Unable to load font " + this.f16505c);
            } catch (Exception e10) {
                throw new IllegalStateException("Unable to load font " + this.f16505c, e10);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FontListFontFamilyTypefaceAdapter$preload$3$2$1(FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, u uVar, q0 q0Var, kotlin.coroutines.c<? super FontListFontFamilyTypefaceAdapter$preload$3$2$1> cVar) {
        super(2, cVar);
        this.f16501c = fontListFontFamilyTypefaceAdapter;
        this.f16502d = uVar;
        this.f16503e = q0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        return new FontListFontFamilyTypefaceAdapter$preload$3$2$1(this.f16501c, this.f16502d, this.f16503e, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super Object> cVar) {
        return invoke2(q0Var, (kotlin.coroutines.c<Object>) cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<Object> cVar) {
        return ((FontListFontFamilyTypefaceAdapter$preload$3$2$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f16500b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            AsyncTypefaceCache asyncTypefaceCache = this.f16501c.asyncTypefaceCache;
            u uVar = this.f16502d;
            q0 q0Var = this.f16503e;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(uVar, q0Var, null);
            this.f16500b = 1;
            obj = asyncTypefaceCache.g(uVar, q0Var, true, anonymousClass1, this);
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
