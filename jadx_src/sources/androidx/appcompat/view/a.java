package androidx.appcompat.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;

/* JADX INFO: compiled from: ActionBarPolicy.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f1986a;

    private a(Context context) {
        this.f1986a = context;
    }

    public static a b(Context context) {
        return new a(context);
    }

    public boolean a() {
        return this.f1986a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int c() {
        return this.f1986a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int d() {
        Configuration configuration = this.f1986a.getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i10 > 600) {
            return 5;
        }
        if (i10 > 960 && i11 > 720) {
            return 5;
        }
        if (i10 > 720 && i11 > 960) {
            return 5;
        }
        if (i10 >= 500) {
            return 4;
        }
        if (i10 > 640 && i11 > 480) {
            return 4;
        }
        if (i10 <= 480 || i11 <= 640) {
            return i10 >= 360 ? 3 : 2;
        }
        return 4;
    }

    public int e() {
        return this.f1986a.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_stacked_tab_max_width);
    }

    public int f() {
        TypedArray typedArrayObtainStyledAttributes = this.f1986a.obtainStyledAttributes(null, R.styleable.f1568a, R.attr.actionBarStyle, 0);
        int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(R.styleable.ActionBar_height, 0);
        Resources resources = this.f1986a.getResources();
        if (!g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(R.dimen.abc_action_bar_stacked_max_height));
        }
        typedArrayObtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public boolean g() {
        return this.f1986a.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs);
    }

    public boolean h() {
        return true;
    }
}
