package com.max.mediaselector.lib.basic;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.p0;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.max.mediaselector.R;
import com.max.mediaselector.lib.config.PictureSelectionConfig;
import com.max.mediaselector.lib.style.SelectMainStyle;
import com.max.mediaselector.lib.utils.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes2.dex */
public class PictureSelectorTransparentActivity extends AppCompatActivity {
    public static ChangeQuickRedirect changeQuickRedirect;

    private void N0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34123el, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        SelectMainStyle selectMainStyleC = PictureSelectionConfig.f75017b4.c();
        int iE0 = selectMainStyleC.e0();
        int iH = selectMainStyleC.H();
        boolean zJ0 = selectMainStyleC.j0();
        if (!s.c(iE0)) {
            iE0 = androidx.core.content.d.f(this, R.color.ps_color_grey);
        }
        if (!s.c(iH)) {
            iH = androidx.core.content.d.f(this, R.color.ps_color_grey);
        }
        ne.a.a(this, iE0, iH, zJ0);
    }

    @SuppressLint({"RtlHardcoded"})
    private void O0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34169gl, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Window window = getWindow();
        window.setGravity(51);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.x = 0;
        attributes.y = 0;
        attributes.height = 1;
        attributes.width = 1;
        window.setAttributes(attributes);
    }

    private void P0() {
        String str;
        Fragment fragmentM4;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34146fl, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (getIntent().getIntExtra(com.max.mediaselector.lib.config.e.f75112q, 0) == 1) {
            str = com.max.mediaselector.lib.g.f75232r;
            fragmentM4 = com.max.mediaselector.lib.g.b5();
        } else {
            str = com.max.mediaselector.lib.a.f74804n;
            fragmentM4 = com.max.mediaselector.lib.a.M4();
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Fragment fragmentS0 = supportFragmentManager.s0(str);
        if (fragmentS0 != null) {
            supportFragmentManager.u().x(fragmentS0).n();
        }
        a.b(supportFragmentManager, str, fragmentM4);
    }

    @Override // android.app.Activity
    public void finish() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34192hl, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.finish();
        overridePendingTransition(0, R.anim.ps_anim_fade_out);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@p0 Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, bb.c.l.f34100dl, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        N0();
        setContentView(R.layout.ps_empty);
        O0();
        P0();
    }
}
