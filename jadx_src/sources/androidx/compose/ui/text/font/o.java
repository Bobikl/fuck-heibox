package androidx.compose.ui.text.font;

import android.content.Context;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: DelegatingFontLoaderForDeprecatedUsage.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u001a\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/font/u$b;", "fontResourceLoader", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "Landroidx/compose/ui/text/font/v$b;", "b", ak.av, "ui-text_release"}, k = 2, mv = {1, 7, 1})
public final class o {
    @dl.d
    @kotlin.k(message = "This exists to bridge existing Font.ResourceLoader APIs, and should be removed with them", replaceWith = @kotlin.s0(expression = "createFontFamilyResolver()", imports = {}))
    public static final v.b a(@dl.d u.b fontResourceLoader) {
        kotlin.jvm.internal.f0.p(fontResourceLoader, "fontResourceLoader");
        return new FontFamilyResolverImpl(new n(fontResourceLoader), null, null, null, null, 30, null);
    }

    @dl.d
    @kotlin.k(message = "This exists to bridge existing Font.ResourceLoader subclasses to be used as aFontFamily.ResourceLoader during upgrade.", replaceWith = @kotlin.s0(expression = "createFontFamilyResolver()", imports = {}))
    public static final v.b b(@dl.d u.b fontResourceLoader, @dl.d Context context) {
        kotlin.jvm.internal.f0.p(fontResourceLoader, "fontResourceLoader");
        kotlin.jvm.internal.f0.p(context, "context");
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.f0.o(applicationContext, "context.applicationContext");
        return new FontFamilyResolverImpl(new m(fontResourceLoader, applicationContext), null, null, null, null, 30, null);
    }
}
