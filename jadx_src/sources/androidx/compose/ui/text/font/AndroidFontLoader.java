package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.Result;

/* JADX INFO: compiled from: AndroidFontLoader.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\f\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\n\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/text/font/AndroidFontLoader;", "Landroidx/compose/ui/text/font/q0;", "Landroidx/compose/ui/text/font/u;", UiKitSpanObj.TYPE_FONT, "Landroid/graphics/Typeface;", "d", "b", "(Landroidx/compose/ui/text/font/u;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroid/content/Context;", "kotlin.jvm.PlatformType", ak.av, "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "", "Ljava/lang/Object;", "()Ljava/lang/Object;", "cacheKey", "<init>", "(Landroid/content/Context;)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class AndroidFontLoader implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final Object cacheKey;

    public AndroidFontLoader(@dl.d Context context) {
        kotlin.jvm.internal.f0.p(context, "context");
        this.context = context.getApplicationContext();
    }

    @Override // androidx.compose.ui.text.font.q0
    @dl.e
    /* JADX INFO: renamed from: a, reason: from getter */
    public Object getCacheKey() {
        return this.cacheKey;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.ui.text.font.q0
    @dl.e
    public Object b(@dl.d u uVar, @dl.d kotlin.coroutines.c<? super Typeface> cVar) throws Throwable {
        AndroidFontLoader$awaitLoad$1 androidFontLoader$awaitLoad$1;
        AndroidFontLoader androidFontLoader;
        if (cVar instanceof AndroidFontLoader$awaitLoad$1) {
            androidFontLoader$awaitLoad$1 = (AndroidFontLoader$awaitLoad$1) cVar;
            int i10 = androidFontLoader$awaitLoad$1.f16430f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                androidFontLoader$awaitLoad$1.f16430f = i10 - Integer.MIN_VALUE;
            } else {
                androidFontLoader$awaitLoad$1 = new AndroidFontLoader$awaitLoad$1(this, cVar);
            }
        } else {
            androidFontLoader$awaitLoad$1 = new AndroidFontLoader$awaitLoad$1(this, cVar);
        }
        Object objD = androidFontLoader$awaitLoad$1.f16428d;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = androidFontLoader$awaitLoad$1.f16430f;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.t0.n(objD);
            }
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uVar = (u) androidFontLoader$awaitLoad$1.f16427c;
            androidFontLoader = (AndroidFontLoader) androidFontLoader$awaitLoad$1.f16426b;
            kotlin.t0.n(objD);
            j0.e variationSettings = ((ResourceFont) uVar).getVariationSettings();
            Context context = androidFontLoader.context;
            kotlin.jvm.internal.f0.o(context, "context");
            return w0.c((Typeface) objD, variationSettings, context);
        }
        kotlin.t0.n(objD);
        if (uVar instanceof d) {
            d dVar = (d) uVar;
            d.a typefaceLoader = dVar.getTypefaceLoader();
            Context context2 = this.context;
            kotlin.jvm.internal.f0.o(context2, "context");
            androidFontLoader$awaitLoad$1.f16430f = 1;
            objD = typefaceLoader.b(context2, dVar, androidFontLoader$awaitLoad$1);
            return objD == objH ? objH : objD;
        }
        if (!(uVar instanceof ResourceFont)) {
            throw new IllegalArgumentException("Unknown font type: " + uVar);
        }
        Context context3 = this.context;
        kotlin.jvm.internal.f0.o(context3, "context");
        androidFontLoader$awaitLoad$1.f16426b = this;
        androidFontLoader$awaitLoad$1.f16427c = uVar;
        androidFontLoader$awaitLoad$1.f16430f = 2;
        objD = AndroidFontLoader_androidKt.d((ResourceFont) uVar, context3, androidFontLoader$awaitLoad$1);
        if (objD == objH) {
            return objH;
        }
        androidFontLoader = this;
        j0.e variationSettings2 = ((ResourceFont) uVar).getVariationSettings();
        Context context4 = androidFontLoader.context;
        kotlin.jvm.internal.f0.o(context4, "context");
        return w0.c((Typeface) objD, variationSettings2, context4);
    }

    @Override // androidx.compose.ui.text.font.q0
    @dl.e
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Typeface c(@dl.d u font) {
        Object objB;
        Typeface typefaceC;
        kotlin.jvm.internal.f0.p(font, "font");
        if (font instanceof d) {
            d dVar = (d) font;
            d.a typefaceLoader = dVar.getTypefaceLoader();
            Context context = this.context;
            kotlin.jvm.internal.f0.o(context, "context");
            return typefaceLoader.a(context, dVar);
        }
        if (!(font instanceof ResourceFont)) {
            return null;
        }
        int loadingStrategy = font.getLoadingStrategy();
        e0.Companion companion = e0.INSTANCE;
        if (e0.g(loadingStrategy, companion.b())) {
            Context context2 = this.context;
            kotlin.jvm.internal.f0.o(context2, "context");
            typefaceC = AndroidFontLoader_androidKt.c((ResourceFont) font, context2);
        } else {
            if (!e0.g(loadingStrategy, companion.c())) {
                if (e0.g(loadingStrategy, companion.a())) {
                    throw new UnsupportedOperationException("Unsupported Async font load path");
                }
                throw new IllegalArgumentException("Unknown loading type " + ((Object) e0.j(font.getLoadingStrategy())));
            }
            try {
                Result.a aVar = Result.f124476c;
                Context context3 = this.context;
                kotlin.jvm.internal.f0.o(context3, "context");
                objB = Result.b(AndroidFontLoader_androidKt.c((ResourceFont) font, context3));
            } catch (Throwable th2) {
                Result.a aVar2 = Result.f124476c;
                objB = Result.b(kotlin.t0.a(th2));
            }
            typefaceC = (Typeface) (Result.i(objB) ? null : objB);
        }
        j0.e variationSettings = ((ResourceFont) font).getVariationSettings();
        Context context4 = this.context;
        kotlin.jvm.internal.f0.o(context4, "context");
        return w0.c(typefaceC, variationSettings, context4);
    }
}
