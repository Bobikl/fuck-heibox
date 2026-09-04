package g7;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.sdk.open.aweme.authorize.model.Authorization;
import n7.b;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f118986b = "AuthImpl";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f118987a;

    public a(String str) {
        this.f118987a = str;
    }

    public boolean a(Activity activity, Authorization.Request request, String str, String str2, String str3, String str4, String str5) {
        if (activity == null) {
            b.e(f118986b, "authorizeNative: activity is null");
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            b.e(f118986b, "authorizeNative: packageName is " + str);
            return false;
        }
        if (request == null) {
            b.e(f118986b, "authorizeNative: req is null");
            return false;
        }
        if (!request.checkArgs()) {
            b.e(f118986b, "authorizeNative: checkArgs fail");
            return false;
        }
        Bundle bundle = new Bundle();
        request.toBundle(bundle);
        bundle.putString(i7.a.InterfaceC1087a.f119242b, this.f118987a);
        bundle.putString(i7.a.b.f119257f, activity.getPackageName());
        if (TextUtils.isEmpty(request.callerLocalEntry)) {
            bundle.putString(i7.a.b.f119256e, n7.a.a(activity.getPackageName(), str3));
        }
        bundle.putString(i7.a.b.f119259h, str4);
        bundle.putString(i7.a.b.f119260i, str5);
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(str, n7.a.a(str, str2)));
        intent.putExtras(bundle);
        try {
            activity.startActivityForResult(intent, 100);
            return true;
        } catch (Exception e10) {
            b.f(f118986b, "authorizeNative: fail to startActivityForResult", e10);
            return false;
        }
    }

    public boolean b(Activity activity, Class<?> cls, Authorization.Request request) {
        if (activity == null) {
            b.e(f118986b, "authorizeWeb: activity is null");
            return false;
        }
        if (request == null) {
            b.e(f118986b, "authorizeWeb: req is null");
            return false;
        }
        if (!request.checkArgs()) {
            b.e(f118986b, "authorizeWeb: checkArgs fail");
            return false;
        }
        Bundle bundle = new Bundle();
        request.toBundle(bundle);
        bundle.putString(i7.a.InterfaceC1087a.f119242b, this.f118987a);
        bundle.putString(i7.a.b.f119257f, activity.getPackageName());
        Intent intent = new Intent(activity, cls);
        intent.putExtras(bundle);
        intent.addFlags(67108864);
        try {
            activity.startActivity(intent);
            return true;
        } catch (Exception e10) {
            b.f(f118986b, "authorizeWeb: fail to startActivity", e10);
            return false;
        }
    }
}
