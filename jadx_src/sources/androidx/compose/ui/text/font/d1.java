package androidx.compose.ui.text.font;

import android.graphics.Typeface;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidFontUtils.android.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(28)
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ \u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/text/font/d1;", "", "Landroid/graphics/Typeface;", "typeface", "", "finalFontWeight", "", "finalFontStyle", ak.av, "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final d1 f16533a = new d1();

    private d1() {
    }

    @androidx.annotation.u
    @dl.d
    @androidx.annotation.w0(28)
    public final Typeface a(@dl.d Typeface typeface, int finalFontWeight, boolean finalFontStyle) {
        kotlin.jvm.internal.f0.p(typeface, "typeface");
        Typeface typefaceCreate = Typeface.create(typeface, finalFontWeight, finalFontStyle);
        kotlin.jvm.internal.f0.o(typefaceCreate, "create(typeface, finalFontWeight, finalFontStyle)");
        return typefaceCreate;
    }
}
