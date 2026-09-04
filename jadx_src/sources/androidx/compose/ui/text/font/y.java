package androidx.compose.ui.text.font;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: FontFamilyResolver.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\" \u0010\f\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\u0001\u0010\t¨\u0006\r"}, d2 = {"Landroidx/compose/ui/text/font/TypefaceRequestCache;", ak.av, "Landroidx/compose/ui/text/font/TypefaceRequestCache;", ak.aF, "()Landroidx/compose/ui/text/font/TypefaceRequestCache;", "GlobalTypefaceRequestCache", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "b", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "()Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "getGlobalAsyncTypefaceCache$annotations", "()V", "GlobalAsyncTypefaceCache", "ui-text_release"}, k = 2, mv = {1, 7, 1})
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final TypefaceRequestCache f16635a = new TypefaceRequestCache();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final AsyncTypefaceCache f16636b = new AsyncTypefaceCache();

    @dl.d
    public static final AsyncTypefaceCache a() {
        return f16636b;
    }

    public static /* synthetic */ void b() {
    }

    @dl.d
    public static final TypefaceRequestCache c() {
        return f16635a;
    }
}
