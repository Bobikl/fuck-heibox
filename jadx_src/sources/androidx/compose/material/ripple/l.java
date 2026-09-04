package androidx.compose.material.ripple;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import androidx.annotation.u;
import androidx.annotation.w0;
import androidx.compose.ui.graphics.l0;
import androidx.compose.ui.graphics.n0;
import androidx.core.view.j1;
import com.umeng.analytics.pro.ak;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: RippleHostView.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0002\u0018\u0000 \u001d2\u00020\u0001:\u0002\u0006\tB\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u000e\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fR\u0014\u0010\u0013\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012R!\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0012\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u001e"}, d2 = {"Landroidx/compose/material/ripple/l;", "Landroid/graphics/drawable/RippleDrawable;", "Landroidx/compose/ui/graphics/l0;", "color", "", "alpha", ak.av, "(JF)J", "Lkotlin/b2;", "b", "(JF)V", "", "isProjected", "Landroid/graphics/Rect;", "getDirtyBounds", "", "radius", ak.aF, "Z", "bounded", "Landroidx/compose/ui/graphics/l0;", "rippleColor", "d", "Ljava/lang/Integer;", "rippleRadius", "e", "projected", "<init>", "(Z)V", "f", "material-ripple_release"}, k = 1, mv = {1, 7, 1})
public final class l extends RippleDrawable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private static Method f8524g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f8525h;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean bounded;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private l0 rippleColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private Integer rippleRadius;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean projected;

    /* JADX INFO: compiled from: RippleHostView.android.kt */
    @w0(23)
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/material/ripple/l$b;", "", "Landroid/graphics/drawable/RippleDrawable;", "ripple", "", "radius", "Lkotlin/b2;", ak.av, "<init>", "()V", "material-ripple_release"}, k = 1, mv = {1, 7, 1})
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        public static final b f8530a = new b();

        private b() {
        }

        @u
        public final void a(@dl.d RippleDrawable ripple, int i10) {
            f0.p(ripple, "ripple");
            ripple.setRadius(i10);
        }
    }

    public l(boolean z10) {
        super(ColorStateList.valueOf(j1.f21601t), null, z10 ? new ColorDrawable(-1) : null);
        this.bounded = z10;
    }

    private final long a(long color, float alpha) {
        if (Build.VERSION.SDK_INT < 28) {
            alpha *= 2;
        }
        return l0.w(color, fi.u.A(alpha, 1.0f), 0.0f, 0.0f, 0.0f, 14, null);
    }

    public final void b(long color, float alpha) {
        long jA = a(color, alpha);
        l0 l0Var = this.rippleColor;
        if (l0Var == null ? false : l0.y(l0Var.M(), jA)) {
            return;
        }
        this.rippleColor = l0.n(jA);
        setColor(ColorStateList.valueOf(n0.s(jA)));
    }

    public final void c(int i10) {
        Integer num = this.rippleRadius;
        if (num != null && num.intValue() == i10) {
            return;
        }
        this.rippleRadius = Integer.valueOf(i10);
        b.f8530a.a(this, i10);
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    @dl.d
    public Rect getDirtyBounds() {
        if (!this.bounded) {
            this.projected = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        f0.o(dirtyBounds, "super.getDirtyBounds()");
        this.projected = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public boolean isProjected() {
        return this.projected;
    }
}
