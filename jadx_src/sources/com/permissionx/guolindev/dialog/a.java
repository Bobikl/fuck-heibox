package com.permissionx.guolindev.dialog;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import com.permissionx.guolindev.R;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import dl.e;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: DefaultDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u000f\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u0012\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014J\b\u0010\f\u001a\u00020\u000bH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0016J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\u000f\u0010\u0011\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001a¨\u0006!"}, d2 = {"Lcom/permissionx/guolindev/dialog/a;", "Lcom/permissionx/guolindev/dialog/c;", "Lkotlin/b2;", "g", "d", RXScreenCaptureService.KEY_HEIGHT, "", "e", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/View;", ak.aF, ak.av, "", "", "b", "f", "()Z", "Ljava/util/List;", "permissions", "Ljava/lang/String;", "message", "positiveText", "negativeText", "", "I", "lightColor", "darkColor", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "<init>", "(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "permissionx_release"}, k = 1, mv = {1, 5, 1})
public final class a extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<String> permissions;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final String message;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final String positiveText;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @e
    private final String negativeText;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int lightColor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int darkColor;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private dg.a f96280h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@dl.d Context context, @dl.d List<String> permissions, @dl.d String message, @dl.d String positiveText, @e String str, int i10, int i11) {
        super(context, R.style.PermissionXDefaultDialog);
        f0.p(context, "context");
        f0.p(permissions, "permissions");
        f0.p(message, "message");
        f0.p(positiveText, "positiveText");
        this.permissions = permissions;
        this.message = message;
        this.positiveText = positiveText;
        this.negativeText = str;
        this.lightColor = i10;
        this.darkColor = i11;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:53:0x0147  */
    private final void d() {
        String str;
        HashSet hashSet = new HashSet();
        int i10 = Build.VERSION.SDK_INT;
        Iterator<String> it = this.permissions.iterator();
        while (it.hasNext()) {
            String next = it.next();
            dg.a aVar = null;
            if (i10 < 29) {
                try {
                    str = getContext().getPackageManager().getPermissionInfo(next, 0).group;
                } catch (PackageManager.NameNotFoundException e10) {
                    e10.printStackTrace();
                    str = null;
                }
            } else if (i10 == 29) {
                str = b.b().get(next);
            } else {
                str = (i10 != 30 && i10 == 31) ? b.d().get(next) : b.c().get(next);
            }
            if ((b.a().contains(next) && !hashSet.contains(next)) || (str != null && !hashSet.contains(str))) {
                LayoutInflater layoutInflater = getLayoutInflater();
                dg.a aVar2 = this.f96280h;
                if (aVar2 == null) {
                    f0.S("binding");
                    aVar2 = null;
                }
                dg.b bVarD = dg.b.d(layoutInflater, aVar2.f118510e, false);
                f0.o(bVarD, "inflate(layoutInflater, …permissionsLayout, false)");
                switch (next) {
                    case "android.permission.WRITE_SETTINGS":
                        bVarD.f118515c.setText(getContext().getString(R.string.permissionx_write_settings));
                        bVarD.f118514b.setImageResource(R.drawable.permissionx_ic_setting);
                        break;
                    case "android.permission.MANAGE_EXTERNAL_STORAGE":
                        bVarD.f118515c.setText(getContext().getString(R.string.permissionx_manage_external_storage));
                        bVarD.f118514b.setImageResource(R.drawable.permissionx_ic_storage);
                        break;
                    case "android.permission.SYSTEM_ALERT_WINDOW":
                        bVarD.f118515c.setText(getContext().getString(R.string.permissionx_system_alert_window));
                        bVarD.f118514b.setImageResource(R.drawable.permissionx_ic_alert);
                        break;
                    case "android.permission.REQUEST_INSTALL_PACKAGES":
                        bVarD.f118515c.setText(getContext().getString(R.string.permissionx_request_install_packages));
                        bVarD.f118514b.setImageResource(R.drawable.permissionx_ic_install);
                        break;
                    case "android.permission.ACCESS_BACKGROUND_LOCATION":
                        bVarD.f118515c.setText(getContext().getString(R.string.permissionx_access_background_location));
                        bVarD.f118514b.setImageResource(R.drawable.permissionx_ic_location);
                        break;
                    default:
                        TextView textView = bVarD.f118515c;
                        Context context = getContext();
                        PackageManager packageManager = getContext().getPackageManager();
                        f0.m(str);
                        textView.setText(context.getString(packageManager.getPermissionGroupInfo(str, 0).labelRes));
                        bVarD.f118514b.setImageResource(getContext().getPackageManager().getPermissionGroupInfo(str, 0).icon);
                        break;
                }
                if (e()) {
                    int i11 = this.darkColor;
                    if (i11 != -1) {
                        bVarD.f118514b.setColorFilter(i11, PorterDuff.Mode.SRC_ATOP);
                    }
                } else {
                    int i12 = this.lightColor;
                    if (i12 != -1) {
                        bVarD.f118514b.setColorFilter(i12, PorterDuff.Mode.SRC_ATOP);
                    }
                }
                dg.a aVar3 = this.f96280h;
                if (aVar3 == null) {
                    f0.S("binding");
                } else {
                    aVar = aVar3;
                }
                aVar.f118510e.addView(bVarD.getRoot());
                if (str != null) {
                    next = str;
                }
                hashSet.add(next);
            }
        }
    }

    private final boolean e() {
        return (getContext().getResources().getConfiguration().uiMode & 48) == 32;
    }

    private final void g() {
        dg.a aVar = this.f96280h;
        dg.a aVar2 = null;
        if (aVar == null) {
            f0.S("binding");
            aVar = null;
        }
        aVar.f118507b.setText(this.message);
        dg.a aVar3 = this.f96280h;
        if (aVar3 == null) {
            f0.S("binding");
            aVar3 = null;
        }
        aVar3.f118511f.setText(this.positiveText);
        if (this.negativeText != null) {
            dg.a aVar4 = this.f96280h;
            if (aVar4 == null) {
                f0.S("binding");
                aVar4 = null;
            }
            aVar4.f118509d.setVisibility(0);
            dg.a aVar5 = this.f96280h;
            if (aVar5 == null) {
                f0.S("binding");
                aVar5 = null;
            }
            aVar5.f118508c.setText(this.negativeText);
        } else {
            dg.a aVar6 = this.f96280h;
            if (aVar6 == null) {
                f0.S("binding");
                aVar6 = null;
            }
            aVar6.f118509d.setVisibility(8);
        }
        if (e()) {
            if (this.darkColor != -1) {
                dg.a aVar7 = this.f96280h;
                if (aVar7 == null) {
                    f0.S("binding");
                    aVar7 = null;
                }
                aVar7.f118511f.setTextColor(this.darkColor);
                dg.a aVar8 = this.f96280h;
                if (aVar8 == null) {
                    f0.S("binding");
                } else {
                    aVar2 = aVar8;
                }
                aVar2.f118508c.setTextColor(this.darkColor);
                return;
            }
            return;
        }
        if (this.lightColor != -1) {
            dg.a aVar9 = this.f96280h;
            if (aVar9 == null) {
                f0.S("binding");
                aVar9 = null;
            }
            aVar9.f118511f.setTextColor(this.lightColor);
            dg.a aVar10 = this.f96280h;
            if (aVar10 == null) {
                f0.S("binding");
            } else {
                aVar2 = aVar10;
            }
            aVar2.f118508c.setTextColor(this.lightColor);
        }
    }

    private final void h() {
        int i10 = getContext().getResources().getDisplayMetrics().widthPixels;
        if (i10 < getContext().getResources().getDisplayMetrics().heightPixels) {
            Window window = getWindow();
            if (window == null) {
                return;
            }
            WindowManager.LayoutParams attributes = window.getAttributes();
            window.setGravity(17);
            attributes.width = (int) (((double) i10) * 0.86d);
            window.setAttributes(attributes);
            return;
        }
        Window window2 = getWindow();
        if (window2 == null) {
            return;
        }
        WindowManager.LayoutParams attributes2 = window2.getAttributes();
        window2.setGravity(17);
        attributes2.width = (int) (((double) i10) * 0.6d);
        window2.setAttributes(attributes2);
    }

    @Override // com.permissionx.guolindev.dialog.c
    @e
    public View a() {
        dg.a aVar = null;
        if (this.negativeText == null) {
            return null;
        }
        dg.a aVar2 = this.f96280h;
        if (aVar2 == null) {
            f0.S("binding");
        } else {
            aVar = aVar2;
        }
        return aVar.f118508c;
    }

    @Override // com.permissionx.guolindev.dialog.c
    @dl.d
    public List<String> b() {
        return this.permissions;
    }

    @Override // com.permissionx.guolindev.dialog.c
    @dl.d
    public View c() {
        dg.a aVar = this.f96280h;
        if (aVar == null) {
            f0.S("binding");
            aVar = null;
        }
        Button button = aVar.f118511f;
        f0.o(button, "binding.positiveBtn");
        return button;
    }

    public final boolean f() {
        dg.a aVar = this.f96280h;
        if (aVar == null) {
            f0.S("binding");
            aVar = null;
        }
        return aVar.f118510e.getChildCount() == 0;
    }

    @Override // android.app.Dialog
    protected void onCreate(@e Bundle bundle) {
        super.onCreate(bundle);
        dg.a aVarC = dg.a.c(getLayoutInflater());
        f0.o(aVarC, "inflate(layoutInflater)");
        this.f96280h = aVarC;
        if (aVarC == null) {
            f0.S("binding");
            aVarC = null;
        }
        setContentView(aVarC.getRoot());
        g();
        d();
        h();
    }
}
