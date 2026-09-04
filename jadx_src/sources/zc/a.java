package zc;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.Navigator;
import androidx.navigation.fragment.FragmentNavigator;
import dl.d;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: HBMiniProgramFragmentNavigator.kt */
/* JADX INFO: loaded from: classes11.dex */
@Navigator.b("miniapp-fragment")
public final class a extends FragmentNavigator {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @d
    private final Context f141964m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @d
    private final FragmentManager f141965n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f141966o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@d Context context, @d FragmentManager fragmentManager, int i10) {
        super(context, fragmentManager, i10);
        f0.p(context, "context");
        f0.p(fragmentManager, "fragmentManager");
        this.f141964m = context;
        this.f141965n = fragmentManager;
        this.f141966o = i10;
    }
}
