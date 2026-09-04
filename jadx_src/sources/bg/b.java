package bg;

import android.os.Build;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import dl.d;
import dl.e;
import eg.r;
import eg.s;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PermissionMediator.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB\u0011\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J!\u0010\b\u001a\u00020\u00052\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0007\"\u00020\u0003¢\u0006\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"Lbg/b;", "", "", "", "permissions", "Leg/r;", ak.av, "", "b", "([Ljava/lang/String;)Leg/r;", "Landroidx/fragment/app/FragmentActivity;", RXScreenCaptureService.KEY_LAUNCH_ACTIVITY, "<init>", "(Landroidx/fragment/app/FragmentActivity;)V", "Landroidx/fragment/app/Fragment;", "fragment", "(Landroidx/fragment/app/Fragment;)V", "permissionx_release"}, k = 1, mv = {1, 5, 1})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @e
    private FragmentActivity f35450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @e
    private Fragment f35451b;

    public b(@d Fragment fragment) {
        f0.p(fragment, "fragment");
        this.f35451b = fragment;
    }

    public b(@d FragmentActivity activity) {
        f0.p(activity, "activity");
        this.f35450a = activity;
    }

    @d
    public final r a(@d List<String> permissions) {
        int i10;
        f0.p(permissions, "permissions");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        int i11 = Build.VERSION.SDK_INT;
        FragmentActivity fragmentActivity = this.f35450a;
        if (fragmentActivity != null) {
            f0.m(fragmentActivity);
            i10 = fragmentActivity.getApplicationInfo().targetSdkVersion;
        } else {
            Fragment fragment = this.f35451b;
            f0.m(fragment);
            i10 = fragment.requireContext().getApplicationInfo().targetSdkVersion;
        }
        for (String str : permissions) {
            if (com.permissionx.guolindev.dialog.b.a().contains(str)) {
                linkedHashSet2.add(str);
            } else {
                linkedHashSet.add(str);
            }
        }
        if (linkedHashSet2.contains(s.f118679f) && (i11 == 29 || (i11 == 30 && i10 < 30))) {
            linkedHashSet2.remove(s.f118679f);
            linkedHashSet.add(s.f118679f);
        }
        return new r(this.f35450a, this.f35451b, linkedHashSet, linkedHashSet2);
    }

    @d
    public final r b(@d String... permissions) {
        f0.p(permissions, "permissions");
        return a(CollectionsKt__CollectionsKt.L(Arrays.copyOf(permissions, permissions.length)));
    }
}
