package androidx.compose.ui.text.font;

import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.f3;

/* JADX INFO: compiled from: FontListFontFamilyTypefaceAdapter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u001e2\u00020\u0001:\u0001\u0012B\u001b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJB\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f0\fH\u0016R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter;", "Landroidx/compose/ui/text/font/a0;", "Landroidx/compose/ui/text/font/v;", "family", "Landroidx/compose/ui/text/font/q0;", "resourceLoader", "Lkotlin/b2;", "e", "(Landroidx/compose/ui/text/font/v;Landroidx/compose/ui/text/font/q0;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/compose/ui/text/font/e1;", "typefaceRequest", "platformFontLoader", "Lkotlin/Function1;", "Landroidx/compose/ui/text/font/f1$b;", "onAsyncCompletion", "", "createDefaultTypeface", "Landroidx/compose/ui/text/font/f1;", ak.av, "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "asyncTypefaceCache", "Lkotlinx/coroutines/q0;", "b", "Lkotlinx/coroutines/q0;", "asyncLoadScope", "Lkotlin/coroutines/CoroutineContext;", "injectedContext", "<init>", "(Landroidx/compose/ui/text/font/AsyncTypefaceCache;Lkotlin/coroutines/CoroutineContext;)V", ak.aF, "ui-text_release"}, k = 1, mv = {1, 7, 1})
@androidx.compose.ui.text.g
public final class FontListFontFamilyTypefaceAdapter implements a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final f0 f16490d = new f0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final kotlinx.coroutines.l0 f16491e = new b(kotlinx.coroutines.l0.INSTANCE);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final AsyncTypefaceCache asyncTypefaceCache;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private kotlinx.coroutines.q0 asyncLoadScope;

    /* JADX INFO: renamed from: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter$a;", "", "Landroidx/compose/ui/text/font/f0;", "fontMatcher", "Landroidx/compose/ui/text/font/f0;", "b", "()Landroidx/compose/ui/text/font/f0;", "Lkotlinx/coroutines/l0;", "DropExceptionHandler", "Lkotlinx/coroutines/l0;", ak.av, "()Lkotlinx/coroutines/l0;", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final kotlinx.coroutines.l0 a() {
            return FontListFontFamilyTypefaceAdapter.f16491e;
        }

        @dl.d
        public final f0 b() {
            return FontListFontFamilyTypefaceAdapter.f16490d;
        }
    }

    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(bv = {}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/n0$a", "Lkotlin/coroutines/a;", "Lkotlinx/coroutines/l0;", "Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "", "exception", "Lkotlin/b2;", "C", "kotlinx-coroutines-core"}, k = 1, mv = {1, 7, 1})
    public static final class b extends kotlin.coroutines.a implements kotlinx.coroutines.l0 {
        public b(kotlinx.coroutines.l0.Companion companion) {
            super(companion);
        }

        @Override // kotlinx.coroutines.l0
        public void C(@dl.d CoroutineContext coroutineContext, @dl.d Throwable th2) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FontListFontFamilyTypefaceAdapter() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public FontListFontFamilyTypefaceAdapter(@dl.d AsyncTypefaceCache asyncTypefaceCache, @dl.d CoroutineContext injectedContext) {
        kotlin.jvm.internal.f0.p(asyncTypefaceCache, "asyncTypefaceCache");
        kotlin.jvm.internal.f0.p(injectedContext, "injectedContext");
        this.asyncTypefaceCache = asyncTypefaceCache;
        this.asyncLoadScope = kotlinx.coroutines.r0.a(f16491e.I(injectedContext).I(f3.a((d2) injectedContext.f(d2.INSTANCE))));
    }

    public /* synthetic */ FontListFontFamilyTypefaceAdapter(AsyncTypefaceCache asyncTypefaceCache, CoroutineContext coroutineContext, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? new AsyncTypefaceCache() : asyncTypefaceCache, (i10 & 2) != 0 ? EmptyCoroutineContext.f124694b : coroutineContext);
    }

    @Override // androidx.compose.ui.text.font.a0
    @dl.e
    public f1 a(@dl.d TypefaceRequest typefaceRequest, @dl.d q0 platformFontLoader, @dl.d yh.l<? super f1.b, b2> onAsyncCompletion, @dl.d yh.l<? super TypefaceRequest, ? extends Object> createDefaultTypeface) {
        kotlin.jvm.internal.f0.p(typefaceRequest, "typefaceRequest");
        kotlin.jvm.internal.f0.p(platformFontLoader, "platformFontLoader");
        kotlin.jvm.internal.f0.p(onAsyncCompletion, "onAsyncCompletion");
        kotlin.jvm.internal.f0.p(createDefaultTypeface, "createDefaultTypeface");
        if (!(typefaceRequest.h() instanceof FontListFontFamily)) {
            return null;
        }
        Pair pairB = d0.b(f16490d.e(((FontListFontFamily) typefaceRequest.h()).v(), typefaceRequest.k(), typefaceRequest.i()), typefaceRequest, this.asyncTypefaceCache, platformFontLoader, createDefaultTypeface);
        List list = (List) pairB.a();
        Object objB = pairB.b();
        if (list == null) {
            return new f1.b(objB, false, 2, null);
        }
        AsyncFontListLoader asyncFontListLoader = new AsyncFontListLoader(list, objB, typefaceRequest, this.asyncTypefaceCache, onAsyncCompletion, platformFontLoader);
        kotlinx.coroutines.k.f(this.asyncLoadScope, null, CoroutineStart.UNDISPATCHED, new FontListFontFamilyTypefaceAdapter$resolve$1(asyncFontListLoader, null), 1, null);
        return new f1.a(asyncFontListLoader);
    }

    @dl.e
    public final Object e(@dl.d v vVar, @dl.d q0 q0Var, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        if (!(vVar instanceof FontListFontFamily)) {
            return b2.f124493a;
        }
        FontListFontFamily fontListFontFamily = (FontListFontFamily) vVar;
        List<u> listV = fontListFontFamily.v();
        List<u> listV2 = fontListFontFamily.v();
        ArrayList arrayList = new ArrayList(listV2.size());
        int size = listV2.size();
        for (int i10 = 0; i10 < size; i10++) {
            u uVar = listV2.get(i10);
            if (e0.g(uVar.getLoadingStrategy(), e0.INSTANCE.a())) {
                arrayList.add(uVar);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            u uVar2 = (u) arrayList.get(i11);
            arrayList2.add(kotlin.c1.a(uVar2.getWeight(), g0.c(uVar2.getStyle())));
        }
        HashSet hashSet = new HashSet(arrayList2.size());
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size3 = arrayList2.size();
        for (int i12 = 0; i12 < size3; i12++) {
            Object obj = arrayList2.get(i12);
            if (hashSet.add((Pair) obj)) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int size4 = arrayList3.size();
        for (int i13 = 0; i13 < size4; i13++) {
            Pair pair = (Pair) arrayList3.get(i13);
            FontWeight fontWeight = (FontWeight) pair.a();
            int iJ = ((g0) pair.b()).j();
            List list = (List) d0.b(f16490d.e(listV, fontWeight, iJ), new TypefaceRequest(vVar, fontWeight, iJ, h0.INSTANCE.a(), q0Var.getCacheKey(), null), this.asyncTypefaceCache, q0Var, new yh.l<TypefaceRequest, b2>() { // from class: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$2$1
                public final void a(@dl.d TypefaceRequest it) {
                    kotlin.jvm.internal.f0.p(it, "it");
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(TypefaceRequest typefaceRequest) {
                    a(typefaceRequest);
                    return b2.f124493a;
                }
            }).a();
            if (list != null) {
                arrayList4.add(CollectionsKt___CollectionsKt.w2(list));
            }
        }
        Object objG = kotlinx.coroutines.r0.g(new FontListFontFamilyTypefaceAdapter$preload$3(arrayList4, this, q0Var, null), cVar);
        return objG == kotlin.coroutines.intrinsics.b.h() ? objG : b2.f124493a;
    }
}
