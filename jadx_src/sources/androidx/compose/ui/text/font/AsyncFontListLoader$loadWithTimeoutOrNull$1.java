package androidx.compose.ui.text.font;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: FontListFontFamilyTypefaceAdapter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.ui.text.font.AsyncFontListLoader", f = "FontListFontFamilyTypefaceAdapter.kt", i = {0}, l = {304}, m = "loadWithTimeoutOrNull$ui_text_release", n = {"$this$loadWithTimeoutOrNull"}, s = {"L$0"})
public final class AsyncFontListLoader$loadWithTimeoutOrNull$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f16452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f16453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ AsyncFontListLoader f16454d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f16455e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AsyncFontListLoader$loadWithTimeoutOrNull$1(AsyncFontListLoader asyncFontListLoader, kotlin.coroutines.c<? super AsyncFontListLoader$loadWithTimeoutOrNull$1> cVar) {
        super(cVar);
        this.f16454d = asyncFontListLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f16453c = obj;
        this.f16455e |= Integer.MIN_VALUE;
        return this.f16454d.h(null, this);
    }
}
