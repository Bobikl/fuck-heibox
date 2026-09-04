package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.v;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AndroidTypefaceWrapper.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u000f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/text/platform/p;", "Landroidx/compose/ui/text/platform/n;", "Landroidx/compose/ui/text/font/k0;", com.google.android.exoplayer2.text.ttml.d.L, "Landroidx/compose/ui/text/font/g0;", com.google.android.exoplayer2.text.ttml.d.I, "Landroidx/compose/ui/text/font/h0;", "synthesis", "Landroid/graphics/Typeface;", "b", "(Landroidx/compose/ui/text/font/k0;II)Landroid/graphics/Typeface;", ak.av, "Landroid/graphics/Typeface;", ak.aF, "()Landroid/graphics/Typeface;", "typeface", "Landroidx/compose/ui/text/font/v;", "Landroidx/compose/ui/text/font/v;", "()Landroidx/compose/ui/text/font/v;", com.google.android.exoplayer2.text.ttml.d.K, "<init>", "(Landroid/graphics/Typeface;)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class p implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Typeface typeface;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final v fontFamily;

    public p(@dl.d Typeface typeface) {
        f0.p(typeface, "typeface");
        this.typeface = typeface;
    }

    @Override // androidx.compose.ui.text.font.a1
    @dl.e
    /* JADX INFO: renamed from: a, reason: from getter */
    public v getFontFamily() {
        return this.fontFamily;
    }

    @Override // androidx.compose.ui.text.platform.n
    @dl.d
    public Typeface b(@dl.d FontWeight fontWeight, int fontStyle, int synthesis) {
        f0.p(fontWeight, "fontWeight");
        return this.typeface;
    }

    @dl.d
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Typeface getTypeface() {
        return this.typeface;
    }
}
