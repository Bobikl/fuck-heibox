package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidFontLoader.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/font/x0;", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "Landroid/graphics/Typeface;", ak.aF, "d", "(Landroidx/compose/ui/text/font/x0;Landroid/content/Context;Lkotlin/coroutines/c;)Ljava/lang/Object;", "ui-text_release"}, k = 2, mv = {1, 7, 1})
public final class AndroidFontLoader_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Typeface c(ResourceFont resourceFont, Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return y0.f16637a.a(context, resourceFont);
        }
        Typeface typefaceJ = androidx.core.content.res.i.j(context, resourceFont.getResId());
        kotlin.jvm.internal.f0.m(typefaceJ);
        kotlin.jvm.internal.f0.o(typefaceJ, "{\n        ResourcesCompa…t(context, resId)!!\n    }");
        return typefaceJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(ResourceFont resourceFont, Context context, kotlin.coroutines.c<? super Typeface> cVar) {
        return kotlinx.coroutines.i.h(kotlinx.coroutines.e1.c(), new AndroidFontLoader_androidKt$loadAsync$2(resourceFont, context, null), cVar);
    }
}
