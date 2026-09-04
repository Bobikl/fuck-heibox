package com.max.hbqrcode;

import android.content.Intent;
import android.os.Build;
import android.view.View;
import com.max.hbcommon.base.BaseActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes12.dex */
@ig.d(interceptors = {d.class}, path = {lb.d.f131244r4})
public class ScanHandlerActivity extends BaseActivity {
    public static ChangeQuickRedirect changeQuickRedirect;

    private void M1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.F0, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        finish();
    }

    public void N1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.E0, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Intent intent = new Intent(this, (Class<?>) ScanActivity.class);
        if (getIntent() != null && getIntent().getExtras() != null) {
            intent.putExtras(getIntent().getExtras());
        }
        startActivity(intent);
        finish();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.D0, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(new View(this.f66601b));
        if (Build.VERSION.SDK_INT != 26 && getRequestedOrientation() != 1) {
            setRequestedOrientation(1);
        }
        N1();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.k.G0, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.H0, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        com.max.hbcommon.utils.d.b("zzzzscantest", "onDestroy");
    }
}
