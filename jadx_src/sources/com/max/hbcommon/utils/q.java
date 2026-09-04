package com.max.hbcommon.utils;

import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import com.max.hbcommon.R;
import com.max.hbutils.core.BaseApplication;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.Iterator;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import org.android.agoo.common.AgooConstants;

/* JADX INFO: compiled from: ShortcutUtils.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final a f68260a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final String f68261b = "ARG_SHORT_CUT_MINI_PROGRAM_PROTOCOL";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: ShortcutUtils.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void g(Context context, DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{context, dialogInterface, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.f.L1, new Class[]{Context.class, DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(context, "$context");
            dialogInterface.dismiss();
            ob.a.p().c(context, com.max.hbcommon.network.b.c() + "heybox/open/add_to_desktop/statement");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void h(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.f.M1, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void i(CheckBox checkBox, DialogInterface dialogInterface) {
            if (!PatchProxy.proxy(new Object[]{checkBox, dialogInterface}, null, changeQuickRedirect, true, bb.c.f.N1, new Class[]{CheckBox.class, DialogInterface.class}, Void.TYPE).isSupported && checkBox.isChecked()) {
                com.max.hbcache.c.C(com.max.hbcache.c.f66153v0, "1");
            }
        }

        @xh.m
        public final boolean d(@dl.d Context context, @dl.d String id2, @dl.d String label, @dl.d Bitmap iconRes, @dl.d Intent[] intents) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, id2, label, iconRes, intents}, this, changeQuickRedirect, false, bb.c.f.J1, new Class[]{Context.class, String.class, String.class, Bitmap.class, Intent[].class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            f0.p(context, "context");
            f0.p(id2, "id");
            f0.p(label, "label");
            f0.p(iconRes, "iconRes");
            f0.p(intents, "intents");
            if (Build.VERSION.SDK_INT >= 26) {
                Object systemService = context.getSystemService((Class<Object>) ShortcutManager.class);
                f0.o(systemService, "getSystemService(...)");
                ShortcutManager shortcutManager = (ShortcutManager) systemService;
                if (shortcutManager.isRequestPinShortcutSupported()) {
                    Iterator<ShortcutInfo> it = shortcutManager.getPinnedShortcuts().iterator();
                    while (it.hasNext()) {
                        if (f0.g(id2, it.next().getId())) {
                            com.max.hbutils.utils.c.f("已存在相同的快捷方式");
                            return false;
                        }
                    }
                    for (Intent intent : intents) {
                        intent.setAction("android.intent.action.VIEW");
                    }
                    Icon iconCreateWithBitmap = Icon.createWithBitmap(iconRes);
                    f0.o(iconCreateWithBitmap, "createWithBitmap(...)");
                    ShortcutInfo shortcutInfoBuild = new ShortcutInfo.Builder(context, id2).setIcon(iconCreateWithBitmap).setShortLabel(label).setIntents(intents).build();
                    f0.o(shortcutInfoBuild, "build(...)");
                    shortcutManager.requestPinShortcut(shortcutInfoBuild, PendingIntent.getBroadcast(context, 0, shortcutManager.createShortcutResultIntent(shortcutInfoBuild), 33554432).getIntentSender());
                }
            } else {
                Intent intent2 = new Intent();
                intent2.putExtra(AgooConstants.MESSAGE_DUPLICATE, false);
                intent2.putExtra("android.intent.extra.shortcut.ICON", iconRes);
                intent2.putExtra("android.intent.extra.shortcut.INTENT", intents);
                intent2.putExtra("android.intent.extra.shortcut.NAME", label);
                intent2.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
                context.sendBroadcast(intent2);
            }
            return true;
        }

        @dl.e
        @xh.m
        public final String e() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.K1, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : BaseApplication.a().getCacheDir().getAbsolutePath();
        }

        @xh.m
        public final void f(@dl.d final Context context, @dl.d String id2, @dl.d String label, @dl.d Bitmap iconRes, @dl.d Intent[] intents) {
            if (PatchProxy.proxy(new Object[]{context, id2, label, iconRes, intents}, this, changeQuickRedirect, false, bb.c.f.I1, new Class[]{Context.class, String.class, String.class, Bitmap.class, Intent[].class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(context, "context");
            f0.p(id2, "id");
            f0.p(label, "label");
            f0.p(iconRes, "iconRes");
            f0.p(intents, "intents");
            if (d(context, id2, label, iconRes, intents) && !c.x(com.max.hbcache.c.o(com.max.hbcache.c.f66153v0, "0"))) {
                View viewInflate = kb.c.d(context).inflate(R.layout.dialog_nomore_tips, (ViewGroup) null, false);
                final CheckBox checkBox = (CheckBox) viewInflate.findViewById(R.id.checkBox);
                new com.max.hbcommon.view.a.f(context).y("已尝试添加到桌面").l("已尝试若添加失败，请前往系统设置，为" + ob.a.b().k() + "打开“创建桌面快捷方式”权限").i(viewInflate).u("详细教程", new DialogInterface.OnClickListener() { // from class: com.max.hbcommon.utils.n
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        q.a.g(context, dialogInterface, i10);
                    }
                }).o("知道了", new DialogInterface.OnClickListener() { // from class: com.max.hbcommon.utils.o
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        q.a.h(dialogInterface, i10);
                    }
                }).r(new DialogInterface.OnDismissListener() { // from class: com.max.hbcommon.utils.p
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        q.a.i(checkBox, dialogInterface);
                    }
                }).g(false).F();
            }
        }
    }

    @xh.m
    public static final boolean a(@dl.d Context context, @dl.d String str, @dl.d String str2, @dl.d Bitmap bitmap, @dl.d Intent[] intentArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2, bitmap, intentArr}, null, changeQuickRedirect, true, bb.c.f.G1, new Class[]{Context.class, String.class, String.class, Bitmap.class, Intent[].class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : f68260a.d(context, str, str2, bitmap, intentArr);
    }

    @dl.e
    @xh.m
    public static final String b() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.f.H1, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : f68260a.e();
    }

    @xh.m
    public static final void c(@dl.d Context context, @dl.d String str, @dl.d String str2, @dl.d Bitmap bitmap, @dl.d Intent[] intentArr) {
        if (PatchProxy.proxy(new Object[]{context, str, str2, bitmap, intentArr}, null, changeQuickRedirect, true, bb.c.f.F1, new Class[]{Context.class, String.class, String.class, Bitmap.class, Intent[].class}, Void.TYPE).isSupported) {
            return;
        }
        f68260a.f(context, str, str2, bitmap, intentArr);
    }
}
