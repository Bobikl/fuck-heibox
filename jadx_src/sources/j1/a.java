package j1;

import android.content.Context;
import androidx.annotation.n;
import androidx.annotation.u;
import androidx.annotation.w0;
import androidx.compose.ui.graphics.n0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ColorResources.android.kt */
/* JADX INFO: loaded from: classes.dex */
@w0(23)
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ*\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lj1/a;", "", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "", "id", "Landroidx/compose/ui/graphics/l0;", ak.av, "(Landroid/content/Context;I)J", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final a f124192a = new a();

    private a() {
    }

    @u
    public final long a(@dl.d Context context, @n int id2) {
        f0.p(context, "context");
        return n0.b(context.getResources().getColor(id2, context.getTheme()));
    }
}
