package androidx.navigation.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.annotation.d1;
import androidx.appcompat.widget.Toolbar;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.transition.v;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: ToolbarOnDestinationChangedListener.kt */
/* JADX INFO: loaded from: classes6.dex */
@t0({"SMAP\nToolbarOnDestinationChangedListener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ToolbarOnDestinationChangedListener.kt\nandroidx/navigation/ui/ToolbarOnDestinationChangedListener\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,66:1\n1#2:67\n*E\n"})
public final class u extends a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final WeakReference<Toolbar> f25327f;

    /* JADX WARN: Illegal instructions before constructor call */
    public u(@dl.d Toolbar toolbar, @dl.d d configuration) {
        f0.p(toolbar, "toolbar");
        f0.p(configuration, "configuration");
        Context context = toolbar.getContext();
        f0.o(context, "toolbar.context");
        super(context, configuration);
        this.f25327f = new WeakReference<>(toolbar);
    }

    @Override // androidx.navigation.ui.a, androidx.navigation.NavController.b
    public void a(@dl.d NavController controller, @dl.d NavDestination destination, @dl.e Bundle bundle) {
        f0.p(controller, "controller");
        f0.p(destination, "destination");
        if (this.f25327f.get() == null) {
            controller.i1(this);
        } else {
            super.a(controller, destination, bundle);
        }
    }

    @Override // androidx.navigation.ui.a
    protected void c(@dl.e Drawable drawable, @d1 int i10) {
        Toolbar toolbar = this.f25327f.get();
        if (toolbar != null) {
            boolean z10 = drawable == null && toolbar.getNavigationIcon() != null;
            toolbar.setNavigationIcon(drawable);
            toolbar.setNavigationContentDescription(i10);
            if (z10) {
                v.a(toolbar);
            }
        }
    }

    @Override // androidx.navigation.ui.a
    protected void d(@dl.e CharSequence charSequence) {
        Toolbar toolbar = this.f25327f.get();
        if (toolbar != null) {
            toolbar.setTitle(charSequence);
        }
    }
}
