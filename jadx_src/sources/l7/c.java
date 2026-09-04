package l7;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f130906c = "CommonAbilityImpl";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f130907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f130908b;

    public c(Context context, String str) {
        this.f130907a = context;
        this.f130908b = str;
    }

    public boolean a(Activity activity, String str, String str2, String str3, a.C1198a c1198a, String str4, String str5) {
        if (activity == null) {
            n7.b.e(f130906c, "share: activity is null");
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            n7.b.e(f130906c, "share: remotePackageName is " + str2);
            return false;
        }
        if (c1198a == null) {
            n7.b.e(f130906c, "share: request is null");
            return false;
        }
        if (!c1198a.checkArgs()) {
            n7.b.e(f130906c, "share: checkArgs fail");
            return false;
        }
        Bundle bundle = new Bundle();
        c1198a.toBundle(bundle);
        bundle.putString(i7.a.c.f119264b, this.f130908b);
        bundle.putString(i7.a.c.f119268f, this.f130907a.getPackageName());
        bundle.putString(i7.a.c.f119269g, "1");
        bundle.putString(i7.a.b.f119259h, str4);
        bundle.putString(i7.a.b.f119260i, str5);
        if (TextUtils.isEmpty(c1198a.callerLocalEntry)) {
            bundle.putString(i7.a.b.f119256e, this.f130907a.getPackageName() + "." + str);
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(str2, n7.a.a(str2, str3)));
        intent.putExtras(bundle);
        try {
            activity.startActivityForResult(intent, 104);
            return true;
        } catch (Exception e10) {
            n7.b.f(f130906c, "fail to startActivity", e10);
            return false;
        }
    }
}
