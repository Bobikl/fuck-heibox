package androidx.compose.foundation;

import android.annotation.NonNull;
import android.view.View;
import android.widget.Magnifier;
import androidx.annotation.w0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: PlatformMagnifier.kt */
/* JADX INFO: loaded from: classes.dex */
@w0(29)
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016R\u001a\u0010\u0010\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/n0;", "Landroidx/compose/foundation/j0;", "Landroidx/compose/foundation/c0;", "style", "Landroid/view/View;", sd.b.f139384b, "Ls1/e;", "density", "", "initialZoom", "Landroidx/compose/foundation/n0$a;", ak.aF, "", "Z", "b", "()Z", "canUpdateZoom", "<init>", "()V", ak.av, "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class n0 implements j0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final n0 f7447b = new n0();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final boolean canUpdateZoom = true;

    /* JADX INFO: compiled from: PlatformMagnifier.kt */
    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ-\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Landroidx/compose/foundation/n0$a;", "Landroidx/compose/foundation/k0$a;", "Lb1/f;", "sourceCenter", "magnifierCenter", "", "zoom", "Lkotlin/b2;", "b", "(JJF)V", "Landroid/widget/Magnifier;", "magnifier", "<init>", "(Landroid/widget/Magnifier;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
    @w0(29)
    @androidx.compose.runtime.internal.o(parameters = 0)
    public static final class a extends k0.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f7449c = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@dl.d Magnifier magnifier) {
            super(magnifier);
            kotlin.jvm.internal.f0.p(magnifier, "magnifier");
        }

        @Override // androidx.compose.foundation.k0.a, androidx.compose.foundation.i0
        public void b(long sourceCenter, long magnifierCenter, float zoom) {
            if (!Float.isNaN(zoom)) {
                getMagnifier().setZoom(zoom);
            }
            if (b1.g.d(magnifierCenter)) {
                getMagnifier().show(b1.f.p(sourceCenter), b1.f.r(sourceCenter), b1.f.p(magnifierCenter), b1.f.r(magnifierCenter));
            } else {
                getMagnifier().show(b1.f.p(sourceCenter), b1.f.r(sourceCenter));
            }
        }
    }

    private n0() {
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
        if (kotlin.jvm.internal.f0.g(style, c0.INSTANCE.c())) {
            return new a(new Magnifier(view));
        }
        long J = density.J(style.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String());
        float fE1 = density.E1(style.getCornerRadius());
        float fE2 = density.E1(style.getElevation());
        Magnifier.Builder builder = new Object(view) { // from class: android.widget.Magnifier.Builder
            static {
                throw new NoClassDefFoundError();
            }

            public /* synthetic */ Builder(@NonNull View view2) {
            }

            @NonNull
            public native /* synthetic */ Magnifier build();

            @NonNull
            public native /* synthetic */ Builder setClippingEnabled(boolean z10);

            @NonNull
            public native /* synthetic */ Builder setCornerRadius(float f10);

            @NonNull
            public native /* synthetic */ Builder setElevation(float f10);

            @NonNull
            public native /* synthetic */ Builder setInitialZoom(float f10);

            @NonNull
            public native /* synthetic */ Builder setSize(int i10, int i11);
        };
        if (J != b1.m.f30386b.a()) {
            builder.setSize(di.d.L0(b1.m.t(J)), di.d.L0(b1.m.m(J)));
        }
        if (!Float.isNaN(fE1)) {
            builder.setCornerRadius(fE1);
        }
        if (!Float.isNaN(fE2)) {
            builder.setElevation(fE2);
        }
        if (!Float.isNaN(initialZoom)) {
            builder.setInitialZoom(initialZoom);
        }
        builder.setClippingEnabled(style.getClippingEnabled());
        Magnifier magnifierBuild = builder.build();
        kotlin.jvm.internal.f0.o(magnifierBuild, "Builder(view).run {\n    …    build()\n            }");
        return new a(magnifierBuild);
    }
}
