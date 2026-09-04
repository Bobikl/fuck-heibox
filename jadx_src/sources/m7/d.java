package m7;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f131464d = "ShareImpl";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f131465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f131466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f131467c;

    public d(Context context, String str) {
        this.f131465a = context.getApplicationContext();
        this.f131467c = str;
    }

    public d(Context context, a aVar) {
        this(context, aVar.a());
        this.f131466b = aVar;
    }

    private String a(String str, String str2) {
        a aVar = this.f131466b;
        if (aVar != null) {
            return aVar.c();
        }
        return "com.ss.android.ugc.aweme." + str2;
    }

    public void b(String str, String str2, b.a aVar, Bundle bundle) {
        a aVar2 = this.f131466b;
        if (aVar2 != null) {
            aVar2.d(this.f131465a, aVar, bundle);
        } else if (n7.a.b(this.f131465a, str, str2) >= 3) {
            aVar.toBundle(bundle);
        }
    }

    public boolean c(Activity activity, String str, String str2, String str3, b.a aVar, String str4, String str5, String str6) {
        if (activity == null) {
            n7.b.e(f131464d, "share: activity is null");
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            n7.b.e(f131464d, "share: remotePackageName is " + str2);
            return false;
        }
        if (aVar == null) {
            n7.b.e(f131464d, "share: request is null");
            return false;
        }
        if (!aVar.checkArgs()) {
            n7.b.e(f131464d, "share: checkArgs fail");
            return false;
        }
        Bundle bundle = new Bundle();
        b(str2, str4, aVar, bundle);
        bundle.putString(i7.a.f.f119285b, this.f131467c);
        bundle.putString(i7.a.f.f119286c, this.f131465a.getPackageName());
        bundle.putString(i7.a.f.f119287d, "1");
        if (TextUtils.isEmpty(aVar.callerLocalEntry)) {
            bundle.putString(i7.a.f.f119288e, this.f131465a.getPackageName() + "." + str);
        }
        Bundle bundle2 = aVar.extras;
        if (bundle2 != null) {
            bundle.putBundle(i7.a.b.f119253b, bundle2);
        }
        bundle.putString(i7.a.b.f119259h, str5);
        bundle.putString(i7.a.b.f119260i, str6);
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(str2, a(str2, str3)));
        intent.putExtras(bundle);
        a aVar2 = this.f131466b;
        if (aVar2 != null) {
            aVar2.b(this.f131465a, intent);
        } else {
            intent.addFlags(67108864);
        }
        try {
            activity.startActivityForResult(intent, 103);
            return true;
        } catch (Exception e10) {
            n7.b.f(f131464d, "fail to startActivity", e10);
            return false;
        }
    }
}
