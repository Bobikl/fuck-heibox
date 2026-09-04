package com.bun.miitmdid.utilsforrequestpermission;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.p0;
import com.bun.miitmdid.c;
import com.bun.miitmdid.interfaces.IPermissionCallbackListener;
import com.bun.miitmdid.l0;
import com.bun.miitmdid.o0;
import com.bun.miitmdid.p;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class PermissionTransparentActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f42148a = 1111;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f42149b = "1";

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public native void run();
    }

    @Override // android.app.Activity
    public native void finish();

    @Override // android.app.Activity
    public void onActivityResult(int i10, int i11, @p0 Intent intent) {
        super.onActivityResult(i10, i11, intent);
        l0.a("PermissionTransparentActivity", "onActivityResult---------,requestCode: " + i10 + ", resultCode: " + i11);
        if (this.f42148a == i10 && -1 == i11 && intent != null) {
            IPermissionCallbackListener iPermissionCallbackListenerB = o0.a().b();
            String stringExtra = intent.getStringExtra("permissionCode");
            String str = p.a().b(this).A;
            l0.a("PermissionTransparentActivity", "providerName: " + str);
            if (str.equals(c.VIVO.A)) {
                l0.a("PermissionTransparentActivity", "providerName is vivo");
                if (this.f42149b.equals(stringExtra)) {
                    l0.a("PermissionTransparentActivity", "onGranted");
                    iPermissionCallbackListenerB.onGranted(new String[]{"VIVO_OAID_STATE_ENABLE"});
                } else {
                    l0.a("PermissionTransparentActivity", "onDenied");
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add("VIVO_OAID_STATE_DISABLE");
                    iPermissionCallbackListenerB.onDenied(arrayList);
                }
            }
        }
        finish();
    }

    @Override // android.app.Activity
    public native void onCreate(Bundle bundle);

    @Override // android.app.Activity
    public native void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr);
}
