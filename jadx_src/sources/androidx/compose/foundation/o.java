package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: EdgeEffectCompat.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u001a\u0010\u000b\u001a\u00020\b*\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bJ\u0012\u0010\u000f\u001a\u00020\u000e*\u00020\u00062\u0006\u0010\r\u001a\u00020\fJ\u0012\u0010\u0011\u001a\u00020\u000e*\u00020\u00062\u0006\u0010\u0010\u001a\u00020\bR\u0015\u0010\u0014\u001a\u00020\b*\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/o;", "", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "Landroid/util/AttributeSet;", "attrs", "Landroid/widget/EdgeEffect;", ak.av, "", "deltaDistance", "displacement", "d", "", "velocity", "Lkotlin/b2;", ak.aF, "delta", "e", "b", "(Landroid/widget/EdgeEffect;)F", "distanceCompat", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final o f7450a = new o();

    private o() {
    }

    @dl.d
    public final EdgeEffect a(@dl.d Context context, @dl.e AttributeSet attrs) {
        kotlin.jvm.internal.f0.p(context, "context");
        return Build.VERSION.SDK_INT >= 31 ? d.f5093a.a(context, attrs) : new w(context);
    }

    public final float b(@dl.d EdgeEffect edgeEffect) {
        kotlin.jvm.internal.f0.p(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            return d.f5093a.b(edgeEffect);
        }
        return 0.0f;
    }

    public final void c(@dl.d EdgeEffect edgeEffect, int i10) {
        kotlin.jvm.internal.f0.p(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            edgeEffect.onAbsorb(i10);
        } else if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(i10);
        }
    }

    public final float d(@dl.d EdgeEffect edgeEffect, float f10, float f11) {
        kotlin.jvm.internal.f0.p(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            return d.f5093a.c(edgeEffect, f10, f11);
        }
        edgeEffect.onPull(f10, f11);
        return f10;
    }

    public final void e(@dl.d EdgeEffect edgeEffect, float f10) {
        kotlin.jvm.internal.f0.p(edgeEffect, "<this>");
        if (edgeEffect instanceof w) {
            ((w) edgeEffect).a(f10);
        } else {
            edgeEffect.onRelease();
        }
    }
}
