package androidx.compose.ui.text.input;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: TextInputServiceAndroid.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.ui.text.input.TextInputServiceAndroid", f = "TextInputServiceAndroid.android.kt", i = {0}, l = {204}, m = "textInputCommandEventLoop", n = {"this"}, s = {"L$0"})
public final class TextInputServiceAndroid$textInputCommandEventLoop$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f16691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f16692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f16693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ TextInputServiceAndroid f16694e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f16695f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextInputServiceAndroid$textInputCommandEventLoop$1(TextInputServiceAndroid textInputServiceAndroid, kotlin.coroutines.c<? super TextInputServiceAndroid$textInputCommandEventLoop$1> cVar) {
        super(cVar);
        this.f16694e = textInputServiceAndroid;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f16693d = obj;
        this.f16695f |= Integer.MIN_VALUE;
        return this.f16694e.r(this);
    }
}
