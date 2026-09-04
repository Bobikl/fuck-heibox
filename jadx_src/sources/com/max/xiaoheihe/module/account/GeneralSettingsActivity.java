package com.max.xiaoheihe.module.account;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Process;
import android.text.format.Formatter;
import android.view.View;
import android.widget.CompoundButton;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.component.HeyBoxPopupMenu;
import com.max.hbmmkv.MMKVManager;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.account.component.SettingItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
@ig.d(path = {lb.d.f131167g4})
public class GeneralSettingsActivity extends BaseActivity {
    public static ChangeQuickRedirect changeQuickRedirect;
    private df.o0 L;

    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23153, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ((BaseActivity) GeneralSettingsActivity.this).f66601b.startActivity(SwitchTestGroupActivity.N.a(((BaseActivity) GeneralSettingsActivity.this).f66601b));
        }
    }

    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements com.max.xiaoheihe.view.m {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // com.max.xiaoheihe.view.m
            public void a(Dialog dialog) {
                if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 23156, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.xiaoheihe.utils.f.b(((BaseActivity) GeneralSettingsActivity.this).f66601b);
                GeneralSettingsActivity.b2(GeneralSettingsActivity.this);
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f(GeneralSettingsActivity.this.getString(R.string.clear_cache_success));
                dialog.dismiss();
            }

            @Override // com.max.xiaoheihe.view.m
            public void b(Dialog dialog) {
                if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 23155, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                    return;
                }
                dialog.dismiss();
            }
        }

        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23154, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.view.l.D(((BaseActivity) GeneralSettingsActivity.this).f66601b, GeneralSettingsActivity.this.getString(R.string.clear_cache_confirm), "", GeneralSettingsActivity.this.getString(R.string.confirm), GeneralSettingsActivity.this.getString(R.string.cancel), new a());
        }
    }

    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23157, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            GeneralSettingsActivity.c2(GeneralSettingsActivity.this);
        }
    }

    public class d implements HeyBoxPopupMenu.h {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ HeyBoxPopupMenu f77931a;

        d(HeyBoxPopupMenu heyBoxPopupMenu) {
            this.f77931a = heyBoxPopupMenu;
        }

        @Override // com.max.hbcommon.component.HeyBoxPopupMenu.h
        public void a(View view, KeyDescObj keyDescObj) {
            if (PatchProxy.proxy(new Object[]{view, keyDescObj}, this, changeQuickRedirect, false, 23158, new Class[]{View.class, KeyDescObj.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcache.c.z(com.max.hbcache.c.f66157x0, keyDescObj.getKey());
            GeneralSettingsActivity.this.L.f114009c.setRightDesc(keyDescObj.getText());
            keyDescObj.setChecked(true);
            com.max.xiaoheihe.utils.d.g1();
            this.f77931a.dismiss();
        }
    }

    public class e extends AsyncTask<Void, Void, Long> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        public Long a(Void... voidArr) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{voidArr}, this, changeQuickRedirect, false, 23159, new Class[]{Void[].class}, Long.class);
            return patchProxyResultProxy.isSupported ? (Long) patchProxyResultProxy.result : Long.valueOf(com.max.xiaoheihe.utils.f.o(((BaseActivity) GeneralSettingsActivity.this).f66601b));
        }

        public void b(Long l10) {
            if (PatchProxy.proxy(new Object[]{l10}, this, changeQuickRedirect, false, 23160, new Class[]{Long.class}, Void.TYPE).isSupported || GeneralSettingsActivity.this.L.f114008b == null) {
                return;
            }
            GeneralSettingsActivity.this.L.f114008b.setRightDesc(Formatter.formatFileSize(((BaseActivity) GeneralSettingsActivity.this).f66601b, l10.longValue()));
        }

        /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Long, java.lang.Object] */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ Long doInBackground(Void[] voidArr) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{voidArr}, this, changeQuickRedirect, false, 23162, new Class[]{Object[].class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(voidArr);
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(Long l10) {
            if (PatchProxy.proxy(new Object[]{l10}, this, changeQuickRedirect, false, 23161, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(l10);
        }
    }

    static /* synthetic */ void b2(GeneralSettingsActivity generalSettingsActivity) {
        if (PatchProxy.proxy(new Object[]{generalSettingsActivity}, null, changeQuickRedirect, true, 23151, new Class[]{GeneralSettingsActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        generalSettingsActivity.u2();
    }

    static /* synthetic */ void c2(GeneralSettingsActivity generalSettingsActivity) {
        if (PatchProxy.proxy(new Object[]{generalSettingsActivity}, null, changeQuickRedirect, true, 23152, new Class[]{GeneralSettingsActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        generalSettingsActivity.x2();
    }

    private ArrayList<KeyDescObj> i2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23140, new Class[0], ArrayList.class);
        if (patchProxyResultProxy.isSupported) {
            return (ArrayList) patchProxyResultProxy.result;
        }
        ArrayList<KeyDescObj> arrayList = new ArrayList<>();
        KeyDescObj keyDescObj = new KeyDescObj();
        keyDescObj.setKey("0");
        keyDescObj.setText("跟随系统");
        keyDescObj.setDesc("跟随系统");
        arrayList.add(keyDescObj);
        KeyDescObj keyDescObj2 = new KeyDescObj();
        keyDescObj2.setKey("2");
        keyDescObj2.setText("关闭");
        keyDescObj2.setDesc("关闭");
        arrayList.add(keyDescObj2);
        KeyDescObj keyDescObj3 = new KeyDescObj();
        keyDescObj3.setKey("1");
        keyDescObj3.setText("打开");
        keyDescObj3.setDesc("打开");
        arrayList.add(keyDescObj3);
        String strJ = com.max.hbcache.c.j(com.max.hbcache.c.f66157x0);
        if (strJ.equals("0")) {
            keyDescObj.setChecked(true);
            this.L.f114009c.setRightDesc(keyDescObj.getText());
        } else if (strJ.equals("1")) {
            keyDescObj3.setChecked(true);
            this.L.f114009c.setRightDesc(keyDescObj3.getText());
        } else {
            keyDescObj2.setChecked(true);
            this.L.f114009c.setRightDesc(keyDescObj2.getText());
        }
        return arrayList;
    }

    public static Intent j2(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 23135, new Class[]{Context.class}, Intent.class);
        return patchProxyResultProxy.isSupported ? (Intent) patchProxyResultProxy.result : new Intent(context, (Class<?>) GeneralSettingsActivity.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k2(DialogInterface dialogInterface, int i10) {
        if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 23150, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
        launchIntentForPackage.addFlags(67108864);
        startActivity(launchIntentForPackage);
        Process.killProcess(Process.myPid());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l2(DialogInterface dialogInterface, int i10) {
        if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, null, changeQuickRedirect, true, 23149, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m2(CompoundButton compoundButton, boolean z10) throws InterruptedException {
        if (PatchProxy.proxy(new Object[]{compoundButton, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 23148, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbresource.a.f71893a.g(z10);
        new com.max.hbcommon.view.a.f(this.f66601b).y("重新启动APP生效").o("立即重启", new DialogInterface.OnClickListener() { // from class: com.max.xiaoheihe.module.account.f
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                this.f78926b.k2(dialogInterface, i10);
            }
        }).u("我知道了", new DialogInterface.OnClickListener() { // from class: com.max.xiaoheihe.module.account.g
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                GeneralSettingsActivity.l2(dialogInterface, i10);
            }
        }).F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n2(DialogInterface dialogInterface, int i10) {
        if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 23147, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.utils.d.n1(this.f66601b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void o2(DialogInterface dialogInterface, int i10) {
        if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, null, changeQuickRedirect, true, 23146, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p2(CompoundButton compoundButton, boolean z10) {
        if (PatchProxy.proxy(new Object[]{compoundButton, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 23145, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        com.max.heybox.hblog.g.G("[DNS] GeneralSettingsActivity set doh " + z10);
        MMKVManager.f71329a.k(ad.c.f1243w, ad.c.f1245y, z10, false);
        new com.max.hbcommon.view.a.f(this.f66601b).y("重新启动APP生效").u("立即重启", new DialogInterface.OnClickListener() { // from class: com.max.xiaoheihe.module.account.l
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                this.f78975b.n2(dialogInterface, i10);
            }
        }).o("我知道了", new DialogInterface.OnClickListener() { // from class: com.max.xiaoheihe.module.account.m
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                GeneralSettingsActivity.o2(dialogInterface, i10);
            }
        }).F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q2(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23144, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        Activity activity = this.f66601b;
        activity.startActivity(MomentsPrivacyActivity.M1(activity, true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void r2(CompoundButton compoundButton, boolean z10) {
        if (PatchProxy.proxy(new Object[]{compoundButton, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 23143, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        MMKVManager.f71329a.k("common", ad.c.f1229i, z10, false);
    }

    private void u2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23142, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        new e().execute(new Void[0]);
    }

    private void v2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23141, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (com.max.hbresource.a.f71893a.d()) {
            this.L.f114014h.setChecked(true, false);
        } else {
            this.L.f114014h.setChecked(false, false);
        }
        if (com.max.hbutils.utils.n.q(com.max.hbcache.c.o("style_switch", "")) <= 0 || !com.max.xiaoheihe.utils.c0.f95336a.n()) {
            this.L.f114013g.setVisibility(8);
        } else {
            this.L.f114013g.setVisibility(0);
        }
        this.L.f114012f.setChecked(MMKVManager.f71329a.d("common", ad.c.f1229i, false, false), false);
        u2();
    }

    private void x2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23139, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        HeyBoxPopupMenu heyBoxPopupMenu = new HeyBoxPopupMenu(this, i2());
        heyBoxPopupMenu.R(new d(heyBoxPopupMenu));
        heyBoxPopupMenu.show();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23136, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        df.o0 o0VarC = df.o0.c(this.f66602c);
        this.L = o0VarC;
        setContentView(o0VarC.b());
        this.f66616q.setTitle(R.string.general_settings);
        i2();
        this.L.f114009c.setVisibility(0);
        if (com.max.xiaoheihe.utils.i0.s()) {
            this.L.f114011e.setVisibility(0);
        } else {
            this.L.f114011e.setVisibility(8);
        }
        SettingItemView settingItemView = this.L.f114010d;
        MMKVManager mMKVManager = MMKVManager.f71329a;
        settingItemView.setVisibility(mMKVManager.d(ad.c.f1243w, ad.c.f1244x, false, false) ? 0 : 8);
        this.L.f114010d.setChecked(mMKVManager.d(ad.c.f1243w, ad.c.f1245y, false, false), false);
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23138, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        v2();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void q1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23137, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.L.f114014h.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.max.xiaoheihe.module.account.h
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) throws InterruptedException {
                this.f78942b.m2(compoundButton, z10);
            }
        });
        this.L.f114010d.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.max.xiaoheihe.module.account.i
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                this.f78962b.p2(compoundButton, z10);
            }
        });
        this.L.f114013g.setOnClickListener(new a());
        this.L.f114008b.setOnClickListener(new b());
        this.L.f114009c.setOnClickListener(new c());
        this.L.f114011e.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.account.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f78963b.q2(view);
            }
        });
        this.L.f114012f.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.max.xiaoheihe.module.account.k
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                GeneralSettingsActivity.r2(compoundButton, z10);
            }
        });
    }
}
