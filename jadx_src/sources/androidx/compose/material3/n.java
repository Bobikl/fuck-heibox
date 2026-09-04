package androidx.compose.material3;

import android.content.Context;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: DynamicTonalPalette.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(23)
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ*\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Landroidx/compose/material3/n;", "", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "", "id", "Landroidx/compose/ui/graphics/l0;", ak.av, "(Landroid/content/Context;I)J", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final n f12031a = new n();

    private n() {
    }

    @androidx.annotation.u
    public final long a(@dl.d Context context, @androidx.annotation.n int id2) {
        kotlin.jvm.internal.f0.p(context, "context");
        return androidx.compose.ui.graphics.n0.b(context.getResources().getColor(id2, context.getTheme()));
    }
}
