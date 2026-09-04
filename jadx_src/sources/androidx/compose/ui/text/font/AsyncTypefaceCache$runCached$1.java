package androidx.compose.ui.text.font;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: FontListFontFamilyTypefaceAdapter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.ui.text.font.AsyncTypefaceCache", f = "FontListFontFamilyTypefaceAdapter.kt", i = {0, 0, 0}, l = {bb.c.b.J4}, m = "runCached", n = {"this", "key", "forever"}, s = {"L$0", "L$1", "Z$0"})
public final class AsyncTypefaceCache$runCached$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f16466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f16467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f16468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f16469e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ AsyncTypefaceCache f16470f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f16471g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AsyncTypefaceCache$runCached$1(AsyncTypefaceCache asyncTypefaceCache, kotlin.coroutines.c<? super AsyncTypefaceCache$runCached$1> cVar) {
        super(cVar);
        this.f16470f = asyncTypefaceCache;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f16469e = obj;
        this.f16471g |= Integer.MIN_VALUE;
        return this.f16470f.g(null, null, false, null, this);
    }
}
