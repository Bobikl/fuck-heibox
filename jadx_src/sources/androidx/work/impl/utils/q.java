package androidx.work.impl.utils;

import android.content.ComponentName;
import android.content.Context;
import androidx.annotation.n0;

/* JADX INFO: compiled from: PackageManagerHelper.java */
/* JADX INFO: loaded from: classes6.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f29367a = androidx.work.n.i("PackageManagerHelper");

    private q() {
    }

    public static boolean a(@n0 Context context, @n0 Class<?> cls) {
        return b(context, cls.getName());
    }

    public static boolean b(@n0 Context context, @n0 String str) {
        return context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, str)) == 1;
    }

    public static void c(@n0 Context context, @n0 Class<?> cls, boolean z10) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z10 ? 1 : 2, 1);
            androidx.work.n nVarE = androidx.work.n.e();
            String str = f29367a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append(" ");
            sb2.append(z10 ? "enabled" : "disabled");
            nVarE.a(str, sb2.toString());
        } catch (Exception e10) {
            androidx.work.n nVarE2 = androidx.work.n.e();
            String str2 = f29367a;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(cls.getName());
            sb3.append("could not be ");
            sb3.append(z10 ? "enabled" : "disabled");
            nVarE2.b(str2, sb3.toString(), e10);
        }
    }
}
