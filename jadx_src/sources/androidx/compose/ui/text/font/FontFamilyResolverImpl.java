package androidx.compose.ui.text.font;

import androidx.compose.runtime.m2;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: FontFamilyResolver.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0018\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001c\u0012\b\b\u0002\u0010#\u001a\u00020 \u0012\b\b\u0002\u0010'\u001a\u00020$¢\u0006\u0004\b(\u0010)J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001b\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ=\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006*"}, d2 = {"Landroidx/compose/ui/text/font/FontFamilyResolverImpl;", "Landroidx/compose/ui/text/font/v$b;", "Landroidx/compose/ui/text/font/e1;", "typefaceRequest", "Landroidx/compose/runtime/m2;", "", RXScreenCaptureService.KEY_HEIGHT, "Landroidx/compose/ui/text/font/v;", com.google.android.exoplayer2.text.ttml.d.K, "Lkotlin/b2;", ak.av, "(Landroidx/compose/ui/text/font/v;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/compose/ui/text/font/k0;", com.google.android.exoplayer2.text.ttml.d.L, "Landroidx/compose/ui/text/font/g0;", com.google.android.exoplayer2.text.ttml.d.I, "Landroidx/compose/ui/text/font/h0;", "fontSynthesis", "b", "(Landroidx/compose/ui/text/font/v;Landroidx/compose/ui/text/font/k0;II)Landroidx/compose/runtime/m2;", "Landroidx/compose/ui/text/font/q0;", "Landroidx/compose/ui/text/font/q0;", "g", "()Landroidx/compose/ui/text/font/q0;", "platformFontLoader", "Landroidx/compose/ui/text/font/s0;", "Landroidx/compose/ui/text/font/s0;", "platformResolveInterceptor", "Landroidx/compose/ui/text/font/TypefaceRequestCache;", ak.aF, "Landroidx/compose/ui/text/font/TypefaceRequestCache;", "typefaceRequestCache", "Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter;", "d", "Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter;", "fontListFontFamilyTypefaceAdapter", "Landroidx/compose/ui/text/font/p0;", "e", "Landroidx/compose/ui/text/font/p0;", "platformFamilyTypefaceAdapter", "<init>", "(Landroidx/compose/ui/text/font/q0;Landroidx/compose/ui/text/font/s0;Landroidx/compose/ui/text/font/TypefaceRequestCache;Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter;Landroidx/compose/ui/text/font/p0;)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
@androidx.compose.ui.text.g
public final class FontFamilyResolverImpl implements v.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final q0 platformFontLoader;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final s0 platformResolveInterceptor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final TypefaceRequestCache typefaceRequestCache;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final p0 platformFamilyTypefaceAdapter;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final yh.l<TypefaceRequest, Object> f16477f;

    public FontFamilyResolverImpl(@dl.d q0 platformFontLoader, @dl.d s0 platformResolveInterceptor, @dl.d TypefaceRequestCache typefaceRequestCache, @dl.d FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, @dl.d p0 platformFamilyTypefaceAdapter) {
        kotlin.jvm.internal.f0.p(platformFontLoader, "platformFontLoader");
        kotlin.jvm.internal.f0.p(platformResolveInterceptor, "platformResolveInterceptor");
        kotlin.jvm.internal.f0.p(typefaceRequestCache, "typefaceRequestCache");
        kotlin.jvm.internal.f0.p(fontListFontFamilyTypefaceAdapter, "fontListFontFamilyTypefaceAdapter");
        kotlin.jvm.internal.f0.p(platformFamilyTypefaceAdapter, "platformFamilyTypefaceAdapter");
        this.platformFontLoader = platformFontLoader;
        this.platformResolveInterceptor = platformResolveInterceptor;
        this.typefaceRequestCache = typefaceRequestCache;
        this.fontListFontFamilyTypefaceAdapter = fontListFontFamilyTypefaceAdapter;
        this.platformFamilyTypefaceAdapter = platformFamilyTypefaceAdapter;
        this.f16477f = new yh.l<TypefaceRequest, Object>() { // from class: androidx.compose.ui.text.font.FontFamilyResolverImpl$createDefaultTypeface$1
            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@dl.d TypefaceRequest it) {
                kotlin.jvm.internal.f0.p(it, "it");
                return this.f16478b.h(TypefaceRequest.g(it, null, null, 0, 0, null, 30, null)).getValue();
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ FontFamilyResolverImpl(q0 q0Var, s0 s0Var, TypefaceRequestCache typefaceRequestCache, FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, p0 p0Var, int i10, kotlin.jvm.internal.u uVar) {
        this(q0Var, (i10 & 2) != 0 ? s0.INSTANCE.a() : s0Var, (i10 & 4) != 0 ? y.c() : typefaceRequestCache, (i10 & 8) != 0 ? new FontListFontFamilyTypefaceAdapter(y.a(), null, 2, 0 == true ? 1 : 0) : fontListFontFamilyTypefaceAdapter, (i10 & 16) != 0 ? new p0() : p0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m2<Object> h(final TypefaceRequest typefaceRequest) {
        return this.typefaceRequestCache.f(typefaceRequest, new yh.l<yh.l<? super f1, ? extends b2>, f1>() { // from class: androidx.compose.ui.text.font.FontFamilyResolverImpl$resolve$result$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final f1 invoke(@dl.d yh.l<? super f1, b2> onAsyncCompletion) {
                kotlin.jvm.internal.f0.p(onAsyncCompletion, "onAsyncCompletion");
                f1 f1VarA = this.f16487b.fontListFontFamilyTypefaceAdapter.a(typefaceRequest, this.f16487b.getPlatformFontLoader(), onAsyncCompletion, this.f16487b.f16477f);
                if (f1VarA == null && (f1VarA = this.f16487b.platformFamilyTypefaceAdapter.a(typefaceRequest, this.f16487b.getPlatformFontLoader(), onAsyncCompletion, this.f16487b.f16477f)) == null) {
                    throw new IllegalStateException("Could not load font");
                }
                return f1VarA;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.ui.text.font.v.b
    @dl.e
    public Object a(@dl.d v vVar, @dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        FontFamilyResolverImpl$preload$1 fontFamilyResolverImpl$preload$1;
        final FontFamilyResolverImpl fontFamilyResolverImpl;
        if (cVar instanceof FontFamilyResolverImpl$preload$1) {
            fontFamilyResolverImpl$preload$1 = (FontFamilyResolverImpl$preload$1) cVar;
            int i10 = fontFamilyResolverImpl$preload$1.f16483f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fontFamilyResolverImpl$preload$1.f16483f = i10 - Integer.MIN_VALUE;
            } else {
                fontFamilyResolverImpl$preload$1 = new FontFamilyResolverImpl$preload$1(this, cVar);
            }
        } else {
            fontFamilyResolverImpl$preload$1 = new FontFamilyResolverImpl$preload$1(this, cVar);
        }
        Object obj = fontFamilyResolverImpl$preload$1.f16481d;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = fontFamilyResolverImpl$preload$1.f16483f;
        if (i11 == 0) {
            kotlin.t0.n(obj);
            if (!(vVar instanceof FontListFontFamily)) {
                return b2.f124493a;
            }
            FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter = this.fontListFontFamilyTypefaceAdapter;
            q0 q0Var = this.platformFontLoader;
            fontFamilyResolverImpl$preload$1.f16479b = this;
            fontFamilyResolverImpl$preload$1.f16480c = vVar;
            fontFamilyResolverImpl$preload$1.f16483f = 1;
            if (fontListFontFamilyTypefaceAdapter.e(vVar, q0Var, fontFamilyResolverImpl$preload$1) == objH) {
                return objH;
            }
            fontFamilyResolverImpl = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vVar = (v) fontFamilyResolverImpl$preload$1.f16480c;
            fontFamilyResolverImpl = (FontFamilyResolverImpl) fontFamilyResolverImpl$preload$1.f16479b;
            kotlin.t0.n(obj);
        }
        List<u> listV = ((FontListFontFamily) vVar).v();
        ArrayList arrayList = new ArrayList(listV.size());
        int size = listV.size();
        for (int i12 = 0; i12 < size; i12++) {
            u uVar = listV.get(i12);
            arrayList.add(new TypefaceRequest(fontFamilyResolverImpl.platformResolveInterceptor.a(vVar), fontFamilyResolverImpl.platformResolveInterceptor.b(uVar.getWeight()), fontFamilyResolverImpl.platformResolveInterceptor.c(uVar.getStyle()), h0.INSTANCE.a(), fontFamilyResolverImpl.platformFontLoader.getCacheKey(), null));
        }
        fontFamilyResolverImpl.typefaceRequestCache.e(arrayList, new yh.l<TypefaceRequest, f1>() { // from class: androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$2
            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final f1 invoke(@dl.d TypefaceRequest typeRequest) {
                kotlin.jvm.internal.f0.p(typeRequest, "typeRequest");
                f1 f1VarA = this.f16484b.fontListFontFamilyTypefaceAdapter.a(typeRequest, this.f16484b.getPlatformFontLoader(), new yh.l<f1.b, b2>() { // from class: androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$2.1
                    public final void a(@dl.d f1.b it) {
                        kotlin.jvm.internal.f0.p(it, "it");
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(f1.b bVar) {
                        a(bVar);
                        return b2.f124493a;
                    }
                }, this.f16484b.f16477f);
                if (f1VarA == null && (f1VarA = this.f16484b.platformFamilyTypefaceAdapter.a(typeRequest, this.f16484b.getPlatformFontLoader(), new yh.l<f1.b, b2>() { // from class: androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$2.2
                    public final void a(@dl.d f1.b it) {
                        kotlin.jvm.internal.f0.p(it, "it");
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(f1.b bVar) {
                        a(bVar);
                        return b2.f124493a;
                    }
                }, this.f16484b.f16477f)) == null) {
                    throw new IllegalStateException("Could not load font");
                }
                return f1VarA;
            }
        });
        return b2.f124493a;
    }

    @Override // androidx.compose.ui.text.font.v.b
    @dl.d
    public m2<Object> b(@dl.e v fontFamily, @dl.d FontWeight fontWeight, int fontStyle, int fontSynthesis) {
        kotlin.jvm.internal.f0.p(fontWeight, "fontWeight");
        return h(new TypefaceRequest(this.platformResolveInterceptor.a(fontFamily), this.platformResolveInterceptor.b(fontWeight), this.platformResolveInterceptor.c(fontStyle), this.platformResolveInterceptor.d(fontSynthesis), this.platformFontLoader.getCacheKey(), null));
    }

    @dl.d
    /* JADX INFO: renamed from: g, reason: from getter */
    public final q0 getPlatformFontLoader() {
        return this.platformFontLoader;
    }
}
