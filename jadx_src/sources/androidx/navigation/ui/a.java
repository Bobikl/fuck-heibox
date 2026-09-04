package androidx.navigation.ui;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.annotation.d1;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import java.lang.ref.WeakReference;
import kotlin.Pair;
import kotlin.c1;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: AbstractAppBarOnDestinationChangedListener.kt */
/* JADX INFO: loaded from: classes6.dex */
@t0({"SMAP\nAbstractAppBarOnDestinationChangedListener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractAppBarOnDestinationChangedListener.kt\nandroidx/navigation/ui/AbstractAppBarOnDestinationChangedListener\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,99:1\n1#2:100\n*E\n"})
public abstract class a implements NavController.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final Context f25291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final d f25292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private final WeakReference<androidx.customview.widget.c> f25293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private androidx.appcompat.graphics.drawable.d f25294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private ValueAnimator f25295e;

    public a(@dl.d Context context, @dl.d d configuration) {
        f0.p(context, "context");
        f0.p(configuration, "configuration");
        this.f25291a = context;
        this.f25292b = configuration;
        androidx.customview.widget.c cVarC = configuration.c();
        this.f25293c = cVarC != null ? new WeakReference<>(cVarC) : null;
    }

    @SuppressLint({"ObjectAnimatorBinding"})
    private final void b(boolean z10) {
        Pair pairA;
        androidx.appcompat.graphics.drawable.d dVar = this.f25294d;
        if (dVar == null || (pairA = c1.a(dVar, Boolean.TRUE)) == null) {
            androidx.appcompat.graphics.drawable.d dVar2 = new androidx.appcompat.graphics.drawable.d(this.f25291a);
            this.f25294d = dVar2;
            pairA = c1.a(dVar2, Boolean.FALSE);
        }
        androidx.appcompat.graphics.drawable.d dVar3 = (androidx.appcompat.graphics.drawable.d) pairA.a();
        boolean zBooleanValue = ((Boolean) pairA.b()).booleanValue();
        c(dVar3, z10 ? R.string.nav_app_bar_open_drawer_description : R.string.nav_app_bar_navigate_up_description);
        float f10 = z10 ? 0.0f : 1.0f;
        if (!zBooleanValue) {
            dVar3.setProgress(f10);
            return;
        }
        float fI = dVar3.i();
        ValueAnimator valueAnimator = this.f25295e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(dVar3, "progress", fI, f10);
        this.f25295e = objectAnimatorOfFloat;
        f0.n(objectAnimatorOfFloat, "null cannot be cast to non-null type android.animation.ObjectAnimator");
        objectAnimatorOfFloat.start();
    }

    @Override // androidx.navigation.NavController.b
    public void a(@dl.d NavController controller, @dl.d NavDestination destination, @dl.e Bundle bundle) {
        f0.p(controller, "controller");
        f0.p(destination, "destination");
        if (destination instanceof androidx.navigation.h) {
            return;
        }
        WeakReference<androidx.customview.widget.c> weakReference = this.f25293c;
        androidx.customview.widget.c cVar = weakReference != null ? weakReference.get() : null;
        if (this.f25293c != null && cVar == null) {
            controller.i1(this);
            return;
        }
        String strS = destination.s(this.f25291a, bundle);
        if (strS != null) {
            d(strS);
        }
        boolean zE = this.f25292b.e(destination);
        boolean z10 = false;
        if (cVar == null && zE) {
            c(null, 0);
            return;
        }
        if (cVar != null && zE) {
            z10 = true;
        }
        b(z10);
    }

    protected abstract void c(@dl.e Drawable drawable, @d1 int i10);

    protected abstract void d(@dl.e CharSequence charSequence);
}
