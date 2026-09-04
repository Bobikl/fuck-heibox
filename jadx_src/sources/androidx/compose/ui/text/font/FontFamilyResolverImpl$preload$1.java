package androidx.compose.ui.text.font;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: FontFamilyResolver.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.ui.text.font.FontFamilyResolverImpl", f = "FontFamilyResolver.kt", i = {0, 0}, l = {47}, m = "preload", n = {"this", com.google.android.exoplayer2.text.ttml.d.K}, s = {"L$0", "L$1"})
public final class FontFamilyResolverImpl$preload$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f16479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f16480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f16481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ FontFamilyResolverImpl f16482e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f16483f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FontFamilyResolverImpl$preload$1(FontFamilyResolverImpl fontFamilyResolverImpl, kotlin.coroutines.c<? super FontFamilyResolverImpl$preload$1> cVar) {
        super(cVar);
        this.f16482e = fontFamilyResolverImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f16481d = obj;
        this.f16483f |= Integer.MIN_VALUE;
        return this.f16482e.a(null, this);
    }
}
