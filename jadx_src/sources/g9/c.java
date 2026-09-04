package g9;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.d0;
import androidx.annotation.n0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: compiled from: ExpandableWidgetHelper.java */
/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final View f118993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f118994b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d0
    private int f118995c = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public c(b bVar) {
        this.f118993a = (View) bVar;
    }

    private void a() {
        ViewParent parent = this.f118993a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).l(this.f118993a);
        }
    }

    @d0
    public int b() {
        return this.f118995c;
    }

    public boolean c() {
        return this.f118994b;
    }

    public void d(@n0 Bundle bundle) {
        this.f118994b = bundle.getBoolean("expanded", false);
        this.f118995c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f118994b) {
            a();
        }
    }

    @n0
    public Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.f118994b);
        bundle.putInt("expandedComponentIdHint", this.f118995c);
        return bundle;
    }

    public boolean f(boolean z10) {
        if (this.f118994b == z10) {
            return false;
        }
        this.f118994b = z10;
        a();
        return true;
    }

    public void g(@d0 int i10) {
        this.f118995c = i10;
    }
}
