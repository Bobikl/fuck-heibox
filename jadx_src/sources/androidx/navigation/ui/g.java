package androidx.navigation.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.annotation.d1;
import androidx.appcompat.widget.Toolbar;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.transition.v;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: CollapsingToolbarOnDestinationChangedListener.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class g extends a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final WeakReference<CollapsingToolbarLayout> f25303f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final WeakReference<Toolbar> f25304g;

    /* JADX WARN: Illegal instructions before constructor call */
    public g(@dl.d CollapsingToolbarLayout collapsingToolbarLayout, @dl.d Toolbar toolbar, @dl.d d configuration) {
        f0.p(collapsingToolbarLayout, "collapsingToolbarLayout");
        f0.p(toolbar, "toolbar");
        f0.p(configuration, "configuration");
        Context context = collapsingToolbarLayout.getContext();
        f0.o(context, "collapsingToolbarLayout.context");
        super(context, configuration);
        this.f25303f = new WeakReference<>(collapsingToolbarLayout);
        this.f25304g = new WeakReference<>(toolbar);
    }

    @Override // androidx.navigation.ui.a, androidx.navigation.NavController.b
    public void a(@dl.d NavController controller, @dl.d NavDestination destination, @dl.e Bundle bundle) {
        f0.p(controller, "controller");
        f0.p(destination, "destination");
        CollapsingToolbarLayout collapsingToolbarLayout = this.f25303f.get();
        Toolbar toolbar = this.f25304g.get();
        if (collapsingToolbarLayout == null || toolbar == null) {
            controller.i1(this);
        } else {
            super.a(controller, destination, bundle);
        }
    }

    @Override // androidx.navigation.ui.a
    protected void c(@dl.e Drawable drawable, @d1 int i10) {
        Toolbar toolbar = this.f25304g.get();
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
        CollapsingToolbarLayout collapsingToolbarLayout = this.f25303f.get();
        if (collapsingToolbarLayout != null) {
            collapsingToolbarLayout.setTitle(charSequence);
        }
    }
}
