package androidx.compose.ui.text.font;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: AndroidFontLoader.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.ui.text.font.AndroidFontLoader", f = "AndroidFontLoader.android.kt", i = {1, 1}, l = {61, 62}, m = "awaitLoad", n = {"this", UiKitSpanObj.TYPE_FONT}, s = {"L$0", "L$1"})
public final class AndroidFontLoader$awaitLoad$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f16426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f16427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f16428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ AndroidFontLoader f16429e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f16430f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidFontLoader$awaitLoad$1(AndroidFontLoader androidFontLoader, kotlin.coroutines.c<? super AndroidFontLoader$awaitLoad$1> cVar) {
        super(cVar);
        this.f16429e = androidFontLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f16428d = obj;
        this.f16430f |= Integer.MIN_VALUE;
        return this.f16429e.b(null, this);
    }
}
