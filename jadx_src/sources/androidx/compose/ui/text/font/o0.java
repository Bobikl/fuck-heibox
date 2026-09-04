package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: DeviceFontFamilyNameFont.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J%\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/font/o0;", "Landroidx/compose/ui/text/font/d$a;", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "Landroidx/compose/ui/text/font/d;", UiKitSpanObj.TYPE_FONT, "Landroid/graphics/Typeface;", ak.av, "b", "(Landroid/content/Context;Landroidx/compose/ui/text/font/d;Lkotlin/coroutines/c;)Ljava/lang/Object;", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
@androidx.compose.ui.text.g
public final class o0 implements d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final o0 f16608a = new o0();

    private o0() {
    }

    @Override // androidx.compose.ui.text.font.d.a
    @dl.e
    public Typeface a(@dl.d Context context, @dl.d d font) {
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(font, "font");
        Font qVar = font instanceof Font ? (Font) font : null;
        if (qVar != null) {
            return qVar.g(context);
        }
        return null;
    }

    @Override // androidx.compose.ui.text.font.d.a
    @dl.e
    public Object b(@dl.d Context context, @dl.d d dVar, @dl.d kotlin.coroutines.c<? super Typeface> cVar) {
        throw new UnsupportedOperationException("All preloaded fonts are optional local.");
    }
}
