package p7;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.sdk.open.douyin.model.OpenRecord;

/* JADX INFO: loaded from: classes6.dex */
public class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f138177b = "OpenRecordImpl";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f138178a;

    public f(String str) {
        this.f138178a = str;
    }

    public void a(Activity activity, String str, String str2, String str3, OpenRecord.Request request, String str4, String str5) {
        String str6;
        if (activity == null) {
            str6 = "openRecord: activity is null";
        } else if (TextUtils.isEmpty(str2)) {
            str6 = "openRecord: remotePackageName is " + str2;
        } else {
            if (request != null) {
                Bundle bundle = new Bundle();
                request.toBundle(bundle);
                bundle.putString(i7.a.f.f119285b, this.f138178a);
                bundle.putString(i7.a.f.f119286c, activity.getPackageName());
                if (TextUtils.isEmpty(request.callerLocalEntry)) {
                    bundle.putString(i7.a.f.f119288e, activity.getPackageName() + "." + str);
                }
                Bundle bundle2 = request.extras;
                if (bundle2 != null) {
                    bundle.putBundle(i7.a.b.f119253b, bundle2);
                }
                bundle.putString(i7.a.b.f119259h, str4);
                bundle.putString(i7.a.b.f119260i, str5);
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(str2, n7.a.a(str2, str3)));
                intent.putExtras(bundle);
                intent.addFlags(268435456);
                intent.addFlags(32768);
                activity.startActivityForResult(intent, 102);
                return;
            }
            str6 = "openRecord: request is null";
        }
        n7.b.e(f138177b, str6);
    }
}
