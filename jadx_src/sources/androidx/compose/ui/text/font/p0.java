package androidx.compose.ui.text.font;

import android.graphics.Typeface;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: PlatformFontFamilyTypefaceAdapter.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012JB\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\u0006H\u0016R\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000f¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/text/font/p0;", "Landroidx/compose/ui/text/font/a0;", "Landroidx/compose/ui/text/font/e1;", "typefaceRequest", "Landroidx/compose/ui/text/font/q0;", "platformFontLoader", "Lkotlin/Function1;", "Landroidx/compose/ui/text/font/f1$b;", "Lkotlin/b2;", "onAsyncCompletion", "", "createDefaultTypeface", "Landroidx/compose/ui/text/font/f1;", ak.av, "Landroidx/compose/ui/text/font/t0;", "Landroidx/compose/ui/text/font/t0;", "platformTypefaceResolver", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
@androidx.compose.ui.text.g
public final class p0 implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final t0 platformTypefaceResolver = w0.a();

    @Override // androidx.compose.ui.text.font.a0
    @dl.e
    public f1 a(@dl.d TypefaceRequest typefaceRequest, @dl.d q0 platformFontLoader, @dl.d yh.l<? super f1.b, b2> onAsyncCompletion, @dl.d yh.l<? super TypefaceRequest, ? extends Object> createDefaultTypeface) {
        Typeface typefaceB;
        kotlin.jvm.internal.f0.p(typefaceRequest, "typefaceRequest");
        kotlin.jvm.internal.f0.p(platformFontLoader, "platformFontLoader");
        kotlin.jvm.internal.f0.p(onAsyncCompletion, "onAsyncCompletion");
        kotlin.jvm.internal.f0.p(createDefaultTypeface, "createDefaultTypeface");
        v vVarH = typefaceRequest.h();
        if (vVarH == null ? true : vVarH instanceof l) {
            typefaceB = this.platformTypefaceResolver.b(typefaceRequest.k(), typefaceRequest.i());
        } else if (vVarH instanceof m0) {
            typefaceB = this.platformTypefaceResolver.a((m0) typefaceRequest.h(), typefaceRequest.k(), typefaceRequest.i());
        } else {
            if (!(vVarH instanceof LoadedFontFamily)) {
                return null;
            }
            a1 typeface = ((LoadedFontFamily) typefaceRequest.h()).getTypeface();
            kotlin.jvm.internal.f0.n(typeface, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidTypeface");
            typefaceB = ((androidx.compose.ui.text.platform.n) typeface).b(typefaceRequest.k(), typefaceRequest.i(), typefaceRequest.j());
        }
        return new f1.b(typefaceB, false, 2, null);
    }
}
