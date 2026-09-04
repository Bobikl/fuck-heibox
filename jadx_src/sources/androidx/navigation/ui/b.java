package androidx.navigation.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.annotation.d1;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ActionBarOnDestinationChangedListener.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class b extends a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final AppCompatActivity f25296f;

    /* JADX WARN: Illegal instructions before constructor call */
    public b(@dl.d AppCompatActivity activity, @dl.d d configuration) {
        f0.p(activity, "activity");
        f0.p(configuration, "configuration");
        androidx.appcompat.app.a.b drawerToggleDelegate = activity.getDrawerToggleDelegate();
        if (drawerToggleDelegate != null) {
            Context contextD = drawerToggleDelegate.d();
            f0.o(contextD, "checkNotNull(activity.dr…  .actionBarThemedContext");
            super(contextD, configuration);
            this.f25296f = activity;
            return;
        }
        throw new IllegalStateException(("Activity " + activity + " does not have a DrawerToggleDelegate set").toString());
    }

    @Override // androidx.navigation.ui.a
    protected void c(@dl.e Drawable drawable, @d1 int i10) {
        ActionBar supportActionBar = this.f25296f.getSupportActionBar();
        if (supportActionBar == null) {
            throw new IllegalStateException(("Activity " + this.f25296f + " does not have an ActionBar set via setSupportActionBar()").toString());
        }
        f0.o(supportActionBar, "checkNotNull(activity.su…ctionBar()\"\n            }");
        supportActionBar.X(drawable != null);
        androidx.appcompat.app.a.b drawerToggleDelegate = this.f25296f.getDrawerToggleDelegate();
        if (drawerToggleDelegate != null) {
            f0.o(drawerToggleDelegate, "checkNotNull(activity.dr…legate set\"\n            }");
            drawerToggleDelegate.b(drawable, i10);
        } else {
            throw new IllegalStateException(("Activity " + this.f25296f + " does not have a DrawerToggleDelegate set").toString());
        }
    }

    @Override // androidx.navigation.ui.a
    protected void d(@dl.e CharSequence charSequence) {
        ActionBar supportActionBar = this.f25296f.getSupportActionBar();
        if (supportActionBar != null) {
            f0.o(supportActionBar, "checkNotNull(activity.su…ctionBar()\"\n            }");
            supportActionBar.z0(charSequence);
        } else {
            throw new IllegalStateException(("Activity " + this.f25296f + " does not have an ActionBar set via setSupportActionBar()").toString());
        }
    }
}
