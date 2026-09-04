package androidx.compose.ui.text.font;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: FontListFontFamilyTypefaceAdapter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.ui.text.font.AsyncFontListLoader", f = "FontListFontFamilyTypefaceAdapter.kt", i = {0, 0, 0, 0, 1, 1, 1}, l = {bb.c.b.f30784m2, bb.c.b.f31074z2}, m = "load", n = {"this", "$this$fastForEach$iv", UiKitSpanObj.TYPE_FONT, "index$iv", "this", "$this$fastForEach$iv", "index$iv"}, s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "I$0"})
public final class AsyncFontListLoader$load$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f16441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f16442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f16443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f16444e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f16445f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f16446g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ AsyncFontListLoader f16447h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f16448i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AsyncFontListLoader$load$1(AsyncFontListLoader asyncFontListLoader, kotlin.coroutines.c<? super AsyncFontListLoader$load$1> cVar) {
        super(cVar);
        this.f16447h = asyncFontListLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f16446g = obj;
        this.f16448i |= Integer.MIN_VALUE;
        return this.f16447h.g(this);
    }
}
