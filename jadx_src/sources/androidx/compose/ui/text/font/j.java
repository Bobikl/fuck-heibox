package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidPreloadedFont.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J#\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Landroidx/compose/ui/text/font/j;", "Landroidx/compose/ui/text/font/d$a;", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "Landroidx/compose/ui/text/font/d;", UiKitSpanObj.TYPE_FONT, "Landroid/graphics/Typeface;", ak.av, "", "b", "(Landroid/content/Context;Landroidx/compose/ui/text/font/d;Lkotlin/coroutines/c;)Ljava/lang/Object;", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class j implements d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final j f16564a = new j();

    private j() {
    }

    @Override // androidx.compose.ui.text.font.d.a
    @dl.e
    public Typeface a(@dl.d Context context, @dl.d d font) {
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(font, "font");
        i iVar = font instanceof i ? (i) font : null;
        if (iVar != null) {
            return iVar.j(context);
        }
        return null;
    }

    @Override // androidx.compose.ui.text.font.d.a
    @dl.e
    public Object b(@dl.d Context context, @dl.d d dVar, @dl.d kotlin.coroutines.c<?> cVar) {
        throw new UnsupportedOperationException("All preloaded fonts are blocking.");
    }
}
