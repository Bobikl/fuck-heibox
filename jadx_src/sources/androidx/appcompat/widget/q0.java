package androidx.appcompat.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.R;

/* JADX INFO: compiled from: ShareActionProvider.java */
/* JADX INFO: loaded from: classes.dex */
public class q0 extends androidx.core.view.b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f2896k = 4;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f2897l = "share_history.xml";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f2898e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c f2899f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Context f2900g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    String f2901h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    a f2902i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private androidx.appcompat.widget.b.f f2903j;

    /* JADX INFO: compiled from: ShareActionProvider.java */
    public interface a {
        boolean a(q0 q0Var, Intent intent);
    }

    /* JADX INFO: compiled from: ShareActionProvider.java */
    public class b implements androidx.appcompat.widget.b.f {
        b() {
        }

        @Override // androidx.appcompat.widget.b.f
        public boolean a(androidx.appcompat.widget.b bVar, Intent intent) {
            q0 q0Var = q0.this;
            a aVar = q0Var.f2902i;
            if (aVar == null) {
                return false;
            }
            aVar.a(q0Var, intent);
            return false;
        }
    }

    /* JADX INFO: compiled from: ShareActionProvider.java */
    public class c implements MenuItem.OnMenuItemClickListener {
        c() {
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            q0 q0Var = q0.this;
            Intent intentB = androidx.appcompat.widget.b.d(q0Var.f2900g, q0Var.f2901h).b(menuItem.getItemId());
            if (intentB == null) {
                return true;
            }
            String action = intentB.getAction();
            if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                q0.this.r(intentB);
            }
            q0.this.f2900g.startActivity(intentB);
            return true;
        }
    }

    public q0(Context context) {
        super(context);
        this.f2898e = 4;
        this.f2899f = new c();
        this.f2901h = f2897l;
        this.f2900g = context;
    }

    private void n() {
        if (this.f2902i == null) {
            return;
        }
        if (this.f2903j == null) {
            this.f2903j = new b();
        }
        androidx.appcompat.widget.b.d(this.f2900g, this.f2901h).u(this.f2903j);
    }

    @Override // androidx.core.view.b
    public boolean b() {
        return true;
    }

    @Override // androidx.core.view.b
    public View d() {
        ActivityChooserView activityChooserView = new ActivityChooserView(this.f2900g);
        if (!activityChooserView.isInEditMode()) {
            activityChooserView.setActivityChooserModel(androidx.appcompat.widget.b.d(this.f2900g, this.f2901h));
        }
        TypedValue typedValue = new TypedValue();
        this.f2900g.getTheme().resolveAttribute(R.attr.actionModeShareDrawable, typedValue, true);
        activityChooserView.setExpandActivityOverflowButtonDrawable(b0.a.b(this.f2900g, typedValue.resourceId));
        activityChooserView.setProvider(this);
        activityChooserView.setDefaultActionButtonContentDescription(R.string.abc_shareactionprovider_share_with_application);
        activityChooserView.setExpandActivityOverflowButtonContentDescription(R.string.abc_shareactionprovider_share_with);
        return activityChooserView;
    }

    @Override // androidx.core.view.b
    public void g(SubMenu subMenu) {
        subMenu.clear();
        androidx.appcompat.widget.b bVarD = androidx.appcompat.widget.b.d(this.f2900g, this.f2901h);
        PackageManager packageManager = this.f2900g.getPackageManager();
        int iF = bVarD.f();
        int iMin = Math.min(iF, this.f2898e);
        for (int i10 = 0; i10 < iMin; i10++) {
            ResolveInfo resolveInfoE = bVarD.e(i10);
            subMenu.add(0, i10, i10, resolveInfoE.loadLabel(packageManager)).setIcon(resolveInfoE.loadIcon(packageManager)).setOnMenuItemClickListener(this.f2899f);
        }
        if (iMin < iF) {
            SubMenu subMenuAddSubMenu = subMenu.addSubMenu(0, iMin, iMin, this.f2900g.getString(R.string.abc_activity_chooser_view_see_all));
            for (int i11 = 0; i11 < iF; i11++) {
                ResolveInfo resolveInfoE2 = bVarD.e(i11);
                subMenuAddSubMenu.add(0, i11, i11, resolveInfoE2.loadLabel(packageManager)).setIcon(resolveInfoE2.loadIcon(packageManager)).setOnMenuItemClickListener(this.f2899f);
            }
        }
    }

    public void o(a aVar) {
        this.f2902i = aVar;
        n();
    }

    public void p(String str) {
        this.f2901h = str;
        n();
    }

    public void q(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                r(intent);
            }
        }
        androidx.appcompat.widget.b.d(this.f2900g, this.f2901h).t(intent);
    }

    void r(Intent intent) {
        intent.addFlags(134742016);
    }
}
