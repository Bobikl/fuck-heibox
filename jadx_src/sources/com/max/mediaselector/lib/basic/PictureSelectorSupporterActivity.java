package com.max.mediaselector.lib.basic;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.appcompat.app.AppCompatActivity;
import com.max.mediaselector.R;
import com.max.mediaselector.lib.PictureSelectorPreviewFragment;
import com.max.mediaselector.lib.config.PictureSelectionConfig;
import com.max.mediaselector.lib.entity.LocalMedia;
import com.max.mediaselector.lib.style.SelectMainStyle;
import com.max.mediaselector.lib.utils.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class PictureSelectorSupporterActivity extends AppCompatActivity {
    public static ChangeQuickRedirect changeQuickRedirect;

    private void N0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Xk, new Class[0], Void.TYPE).isSupported) {
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

    private void P0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Yk, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (!getIntent().hasExtra(com.max.mediaselector.lib.config.e.f75102g) || !getIntent().getBooleanExtra(com.max.mediaselector.lib.config.e.f75102g, false)) {
            a.a(this, com.max.mediaselector.lib.c.I, com.max.mediaselector.lib.c.g6());
            return;
        }
        int intExtra = getIntent().getIntExtra(com.max.mediaselector.lib.config.e.f75109n, 0);
        PictureSelectorPreviewFragment pictureSelectorPreviewFragmentM6 = PictureSelectorPreviewFragment.m6();
        ArrayList<LocalMedia> arrayList = new ArrayList<>(qe.a.h());
        pictureSelectorPreviewFragmentM6.t6(intExtra, arrayList.size(), arrayList, getIntent().getBooleanExtra(com.max.mediaselector.lib.config.e.f75108m, false));
        a.a(this, PictureSelectorPreviewFragment.U, pictureSelectorPreviewFragmentM6);
    }

    public void O0() {
        PictureSelectionConfig pictureSelectionConfigC;
        int i10;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Zk, new Class[0], Void.TYPE).isSupported || (i10 = (pictureSelectionConfigC = PictureSelectionConfig.c()).C) == -2 || pictureSelectionConfigC.f75031c) {
            return;
        }
        pe.c.e(this, i10);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.l.f34054bl, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        super.attachBaseContext(i.a(context, PictureSelectionConfig.c().C));
    }

    @Override // android.app.Activity
    public void finish() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34077cl, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.finish();
        overridePendingTransition(0, PictureSelectionConfig.f75017b4.e().f75419c);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@n0 Configuration configuration) {
        if (PatchProxy.proxy(new Object[]{configuration}, this, changeQuickRedirect, false, bb.c.l.f34031al, new Class[]{Configuration.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onConfigurationChanged(configuration);
        O0();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@p0 Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, bb.c.l.Wk, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        N0();
        setContentView(R.layout.ps_activity_container);
        P0();
    }
}
