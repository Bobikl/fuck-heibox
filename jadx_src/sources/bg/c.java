package bg;

import android.content.Context;
import androidx.core.content.d;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/* JADX INFO: compiled from: PermissionX.java */
/* JADX INFO: loaded from: classes3.dex */
public class c {
    public static b a(Fragment fragment) {
        return new b(fragment);
    }

    public static b b(FragmentActivity fragmentActivity) {
        return new b(fragmentActivity);
    }

    public static boolean c(Context context, String str) {
        return d.a(context, str) == 0;
    }
}
