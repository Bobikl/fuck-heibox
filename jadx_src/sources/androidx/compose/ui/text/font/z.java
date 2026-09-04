package androidx.compose.ui.text.font;

import android.content.Context;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: FontFamilyResolver.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u001a\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¨\u0006\b"}, d2 = {"Landroid/content/Context;", com.umeng.analytics.pro.d.R, "Landroidx/compose/ui/text/font/v$b;", ak.av, "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "b", ak.aF, "ui-text_release"}, k = 2, mv = {1, 7, 1})
public final class z {
    @dl.d
    public static final v.b a(@dl.d Context context) {
        kotlin.jvm.internal.f0.p(context, "context");
        return new FontFamilyResolverImpl(new AndroidFontLoader(context), g.a(context), null, null, null, 28, null);
    }

    @dl.d
    @androidx.compose.ui.text.g
    public static final v.b b(@dl.d Context context, @dl.d CoroutineContext coroutineContext) {
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(coroutineContext, "coroutineContext");
        return new FontFamilyResolverImpl(new AndroidFontLoader(context), g.a(context), y.c(), new FontListFontFamilyTypefaceAdapter(y.a(), coroutineContext), null, 16, null);
    }

    @androidx.compose.ui.text.h
    @dl.d
    public static final v.b c(@dl.d Context context) {
        kotlin.jvm.internal.f0.p(context, "context");
        return new FontFamilyResolverImpl(new AndroidFontLoader(context), null, new TypefaceRequestCache(), new FontListFontFamilyTypefaceAdapter(new AsyncTypefaceCache(), null, 2, null), null, 18, null);
    }
}
