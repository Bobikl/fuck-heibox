package p7;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes6.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f138179b = "ShareToContactImpl";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f138180a;

    public g(String str) {
        this.f138180a = str;
    }

    public boolean a(Activity activity, String str, String str2, String str3, c.a aVar) {
        String str4;
        if (activity == null) {
            str4 = "shareToContacts: activity is null";
        } else if (TextUtils.isEmpty(str2)) {
            str4 = "shareToContacts: remotePackageName is " + str2;
        } else if (aVar == null) {
            str4 = "shareToContacts: request is null";
        } else {
            if (aVar.checkArgs()) {
                Bundle bundle = new Bundle();
                aVar.toBundle(bundle);
                bundle.putString(com.bytedance.sdk.open.tt.b.a.f42272c, this.f138180a);
                if (TextUtils.isEmpty(aVar.callerLocalEntry)) {
                    bundle.putString(com.bytedance.sdk.open.tt.b.a.f42281l, activity.getPackageName() + "." + str);
                }
                Bundle bundle2 = aVar.extras;
                if (bundle2 != null) {
                    bundle.putBundle(com.bytedance.sdk.open.tt.b.a.f42274e, bundle2);
                }
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(str2, n7.a.a(str2, str3)));
                intent.putExtras(bundle);
                intent.addFlags(32768);
                activity.startActivityForResult(intent, 101);
                return true;
            }
            str4 = "shareToContacts: checkArgs fail";
        }
        n7.b.e(f138179b, str4);
        return false;
    }
}
