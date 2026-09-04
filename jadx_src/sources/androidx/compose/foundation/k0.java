package androidx.compose.foundation;

import android.view.View;
import android.widget.Magnifier;
import androidx.annotation.w0;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: PlatformMagnifier.kt */
/* JADX INFO: loaded from: classes.dex */
@w0(28)
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016R\u001a\u0010\u0010\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/k0;", "Landroidx/compose/foundation/j0;", "Landroidx/compose/foundation/c0;", "style", "Landroid/view/View;", sd.b.f139384b, "Ls1/e;", "density", "", "initialZoom", "Landroidx/compose/foundation/k0$a;", ak.aF, "", "Z", "b", "()Z", "canUpdateZoom", "<init>", "()V", ak.av, "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class k0 implements j0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final k0 f5879b = new k0();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final boolean canUpdateZoom = false;

    /* JADX INFO: compiled from: PlatformMagnifier.kt */
    @Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J-\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0014\u001a\u00020\u00128VX\u0096\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\r\u0010\u0013\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/k0$a;", "Landroidx/compose/foundation/i0;", "Lkotlin/b2;", ak.aF, "Lb1/f;", "sourceCenter", "magnifierCenter", "", "zoom", "b", "(JJF)V", com.heybox.imageviewer.l.f59758c, "Landroid/widget/Magnifier;", ak.av, "Landroid/widget/Magnifier;", "d", "()Landroid/widget/Magnifier;", "magnifier", "Ls1/r;", "()J", UiKitSpanObj.TYPE_SIZE, "<init>", "(Landroid/widget/Magnifier;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
    @w0(28)
    @androidx.compose.runtime.internal.o(parameters = 0)
    public static class a implements i0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f5881b = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final Magnifier magnifier;

        public a(@dl.d Magnifier magnifier) {
            kotlin.jvm.internal.f0.p(magnifier, "magnifier");
            this.magnifier = magnifier;
        }

        @Override // androidx.compose.foundation.i0
        public long a() {
            return s1.s.a(this.magnifier.getWidth(), this.magnifier.getHeight());
        }

        @Override // androidx.compose.foundation.i0
        public void b(long sourceCenter, long magnifierCenter, float zoom) {
            this.magnifier.show(b1.f.p(sourceCenter), b1.f.r(sourceCenter));
        }

        @Override // androidx.compose.foundation.i0
        public void c() {
            this.magnifier.update();
        }

        @dl.d
        /* JADX INFO: renamed from: d, reason: from getter */
        public final Magnifier getMagnifier() {
            return this.magnifier;
        }

        @Override // androidx.compose.foundation.i0
        public void dismiss() {
            this.magnifier.dismiss();
        }
    }

    private k0() {
    }

    @Override // androidx.compose.foundation.j0
    public boolean b() {
        return canUpdateZoom;
    }

    @Override // androidx.compose.foundation.j0
    @dl.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public a a(@dl.d c0 style, @dl.d View view, @dl.d s1.e density, float initialZoom) {
        kotlin.jvm.internal.f0.p(style, "style");
        kotlin.jvm.internal.f0.p(view, "view");
        kotlin.jvm.internal.f0.p(density, "density");
        return new a(new Magnifier(view));
    }
}
