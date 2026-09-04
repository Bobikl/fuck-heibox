package com.max.hbpermission;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.Arrays;
import java.util.List;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PermissionManager.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class PermissionManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final PermissionManager f71603a = new PermissionManager();
    public static ChangeQuickRedirect changeQuickRedirect;

    private PermissionManager() {
    }

    public static /* synthetic */ void B(PermissionManager permissionManager, FragmentActivity fragmentActivity, String[] strArr, c cVar, String str, Fragment fragment, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{permissionManager, fragmentActivity, strArr, cVar, str, fragment, new Integer(i10), obj}, null, changeQuickRedirect, true, bb.c.i.K3, new Class[]{PermissionManager.class, FragmentActivity.class, String[].class, c.class, String.class, Fragment.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        permissionManager.A(fragmentActivity, strArr, cVar, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? null : fragment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(yh.a aVar, DialogInterface dialogInterface, int i10) {
        if (PatchProxy.proxy(new Object[]{aVar, dialogInterface, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.i.Y3, new Class[]{yh.a.class, DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(aVar, "$goto");
        aVar.invoke();
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(DialogInterface dialogInterface, int i10) {
        if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.i.Z3, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        dialogInterface.dismiss();
    }

    @xh.i
    private final void E(FragmentActivity fragmentActivity, String[] strArr, c cVar) {
        if (PatchProxy.proxy(new Object[]{fragmentActivity, strArr, cVar}, this, changeQuickRedirect, false, bb.c.i.V3, new Class[]{FragmentActivity.class, String[].class, c.class}, Void.TYPE).isSupported) {
            return;
        }
        H(this, fragmentActivity, strArr, cVar, null, null, 24, null);
    }

    @xh.i
    private final void F(FragmentActivity fragmentActivity, String[] strArr, c cVar, String str) {
        if (PatchProxy.proxy(new Object[]{fragmentActivity, strArr, cVar, str}, this, changeQuickRedirect, false, bb.c.i.U3, new Class[]{FragmentActivity.class, String[].class, c.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        H(this, fragmentActivity, strArr, cVar, str, null, 16, null);
    }

    @xh.i
    private final void G(final FragmentActivity fragmentActivity, String[] strArr, final c cVar, final String str, Fragment fragment) {
        if (PatchProxy.proxy(new Object[]{fragmentActivity, strArr, cVar, str, fragment}, this, changeQuickRedirect, false, bb.c.i.L3, new Class[]{FragmentActivity.class, String[].class, c.class, String.class, Fragment.class}, Void.TYPE).isSupported) {
            return;
        }
        (fragment != null ? bg.c.a(fragment) : bg.c.b(fragmentActivity)).a(CollectionsKt__CollectionsKt.L(Arrays.copyOf(strArr, strArr.length))).m(new cg.a() { // from class: com.max.hbpermission.j
            @Override // cg.a
            public final void a(eg.c cVar2, List list) {
                PermissionManager.I(fragmentActivity, str, cVar2, list);
            }
        }).o(new cg.c() { // from class: com.max.hbpermission.k
            @Override // cg.c
            public final void a(eg.d dVar, List list) {
                PermissionManager.J(fragmentActivity, str, dVar, list);
            }
        }).q(new cg.d() { // from class: com.max.hbpermission.l
            @Override // cg.d
            public final void a(boolean z10, List list, List list2) {
                PermissionManager.K(cVar, z10, list, list2);
            }
        });
    }

    static /* synthetic */ void H(PermissionManager permissionManager, FragmentActivity fragmentActivity, String[] strArr, c cVar, String str, Fragment fragment, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{permissionManager, fragmentActivity, strArr, cVar, str, fragment, new Integer(i10), obj}, null, changeQuickRedirect, true, bb.c.i.M3, new Class[]{PermissionManager.class, FragmentActivity.class, String[].class, c.class, String.class, Fragment.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        permissionManager.G(fragmentActivity, strArr, cVar, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? null : fragment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(FragmentActivity activity, String str, eg.c scope, List deniedList) {
        if (PatchProxy.proxy(new Object[]{activity, str, scope, deniedList}, null, changeQuickRedirect, true, bb.c.i.f33288a4, new Class[]{FragmentActivity.class, String.class, eg.c.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "$activity");
        f0.p(scope, "scope");
        f0.p(deniedList, "deniedList");
        scope.a(o.f71655a.f(activity, deniedList, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(FragmentActivity activity, String str, eg.d scope, List deniedList) {
        if (PatchProxy.proxy(new Object[]{activity, str, scope, deniedList}, null, changeQuickRedirect, true, bb.c.i.f33294b4, new Class[]{FragmentActivity.class, String.class, eg.d.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "$activity");
        f0.p(scope, "scope");
        f0.p(deniedList, "deniedList");
        scope.a(o.f71655a.i(activity, deniedList, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(c cVar, boolean z10, List grantedList, List deniedList) {
        if (PatchProxy.proxy(new Object[]{cVar, new Byte(z10 ? (byte) 1 : (byte) 0), grantedList, deniedList}, null, changeQuickRedirect, true, bb.c.i.f33300c4, new Class[]{c.class, Boolean.TYPE, List.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(grantedList, "grantedList");
        f0.p(deniedList, "deniedList");
        if (!z10 || cVar == null) {
            return;
        }
        cVar.onResult();
    }

    public static final /* synthetic */ void k(PermissionManager permissionManager, FragmentActivity fragmentActivity, String[] strArr, a aVar, String str) {
        if (PatchProxy.proxy(new Object[]{permissionManager, fragmentActivity, strArr, aVar, str}, null, changeQuickRedirect, true, bb.c.k.f33466c, new Class[]{PermissionManager.class, FragmentActivity.class, String[].class, a.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        permissionManager.t(fragmentActivity, strArr, aVar, str);
    }

    public static final /* synthetic */ void l(PermissionManager permissionManager, FragmentActivity fragmentActivity, String[] strArr, c cVar, String str, Fragment fragment) {
        if (PatchProxy.proxy(new Object[]{permissionManager, fragmentActivity, strArr, cVar, str, fragment}, null, changeQuickRedirect, true, bb.c.k.f33443b, new Class[]{PermissionManager.class, FragmentActivity.class, String[].class, c.class, String.class, Fragment.class}, Void.TYPE).isSupported) {
            return;
        }
        permissionManager.G(fragmentActivity, strArr, cVar, str, fragment);
    }

    public static /* synthetic */ void p(PermissionManager permissionManager, FragmentActivity fragmentActivity, String[] strArr, a aVar, String str, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{permissionManager, fragmentActivity, strArr, aVar, str, new Integer(i10), obj}, null, changeQuickRedirect, true, bb.c.i.O3, new Class[]{PermissionManager.class, FragmentActivity.class, String[].class, a.class, String.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        permissionManager.o(fragmentActivity, strArr, aVar, (i10 & 8) != 0 ? null : str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(yh.a aVar, DialogInterface dialogInterface, int i10) {
        if (PatchProxy.proxy(new Object[]{aVar, dialogInterface, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.i.f33306d4, new Class[]{yh.a.class, DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(aVar, "$goto");
        aVar.invoke();
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(a aVar, DialogInterface dialogInterface, int i10) {
        if (PatchProxy.proxy(new Object[]{aVar, dialogInterface, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.i.f33312e4, new Class[]{a.class, DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (aVar != null) {
            aVar.h();
        }
        dialogInterface.dismiss();
    }

    @xh.i
    private final void s(FragmentActivity fragmentActivity, String[] strArr, a aVar) {
        if (PatchProxy.proxy(new Object[]{fragmentActivity, strArr, aVar}, this, changeQuickRedirect, false, bb.c.i.X3, new Class[]{FragmentActivity.class, String[].class, a.class}, Void.TYPE).isSupported) {
            return;
        }
        u(this, fragmentActivity, strArr, aVar, null, 8, null);
    }

    @xh.i
    private final void t(final FragmentActivity fragmentActivity, String[] strArr, final a aVar, final String str) {
        if (PatchProxy.proxy(new Object[]{fragmentActivity, strArr, aVar, str}, this, changeQuickRedirect, false, bb.c.i.P3, new Class[]{FragmentActivity.class, String[].class, a.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        bg.c.b(fragmentActivity).a(CollectionsKt__CollectionsKt.L(Arrays.copyOf(strArr, strArr.length))).m(new cg.a() { // from class: com.max.hbpermission.e
            @Override // cg.a
            public final void a(eg.c cVar, List list) {
                PermissionManager.x(fragmentActivity, str, cVar, list);
            }
        }).o(new cg.c() { // from class: com.max.hbpermission.f
            @Override // cg.c
            public final void a(eg.d dVar, List list) {
                PermissionManager.v(fragmentActivity, str, dVar, list);
            }
        }).q(new cg.d() { // from class: com.max.hbpermission.g
            @Override // cg.d
            public final void a(boolean z10, List list, List list2) {
                PermissionManager.w(aVar, z10, list, list2);
            }
        });
    }

    static /* synthetic */ void u(PermissionManager permissionManager, FragmentActivity fragmentActivity, String[] strArr, a aVar, String str, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{permissionManager, fragmentActivity, strArr, aVar, str, new Integer(i10), obj}, null, changeQuickRedirect, true, bb.c.i.Q3, new Class[]{PermissionManager.class, FragmentActivity.class, String[].class, a.class, String.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        permissionManager.t(fragmentActivity, strArr, aVar, (i10 & 8) != 0 ? null : str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(FragmentActivity activity, String str, eg.d scope, List deniedList) {
        if (PatchProxy.proxy(new Object[]{activity, str, scope, deniedList}, null, changeQuickRedirect, true, bb.c.j.f33419a, new Class[]{FragmentActivity.class, String.class, eg.d.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "$activity");
        f0.p(scope, "scope");
        f0.p(deniedList, "deniedList");
        scope.a(o.f71655a.i(activity, deniedList, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(a aVar, boolean z10, List list, List list2) {
        if (PatchProxy.proxy(new Object[]{aVar, new Byte(z10 ? (byte) 1 : (byte) 0), list, list2}, null, changeQuickRedirect, true, bb.c.k.f33420a, new Class[]{a.class, Boolean.TYPE, List.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(list, "<anonymous parameter 1>");
        f0.p(list2, "<anonymous parameter 2>");
        if (z10) {
            if (aVar != null) {
                aVar.onSuccess();
            }
        } else if (aVar != null) {
            aVar.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(FragmentActivity activity, String str, eg.c scope, List deniedList) {
        if (PatchProxy.proxy(new Object[]{activity, str, scope, deniedList}, null, changeQuickRedirect, true, bb.c.i.f33318f4, new Class[]{FragmentActivity.class, String.class, eg.c.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "$activity");
        f0.p(scope, "scope");
        f0.p(deniedList, "deniedList");
        scope.a(o.f71655a.f(activity, deniedList, str));
    }

    @xh.i
    public final void A(@dl.d final FragmentActivity activity, @dl.d final String[] permissions, @dl.e final c cVar, @dl.e final String str, @dl.e final Fragment fragment) {
        if (PatchProxy.proxy(new Object[]{activity, permissions, cVar, str, fragment}, this, changeQuickRedirect, false, bb.c.i.J3, new Class[]{FragmentActivity.class, String[].class, c.class, String.class, Fragment.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "activity");
        f0.p(permissions, "permissions");
        final yh.a<b2> aVar = new yh.a<b2>() { // from class: com.max.hbpermission.PermissionManager$request$goto$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33559g, new Class[0], Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33536f, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                PermissionManager permissionManager = PermissionManager.f71603a;
                FragmentActivity fragmentActivity = activity;
                String[] strArr = permissions;
                PermissionManager.l(permissionManager, fragmentActivity, (String[]) Arrays.copyOf(strArr, strArr.length), cVar, str, fragment);
            }
        };
        if (m(activity, (String[]) Arrays.copyOf(permissions, permissions.length))) {
            aVar.invoke();
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setMessage(str);
        builder.setPositiveButton("确认", new DialogInterface.OnClickListener() { // from class: com.max.hbpermission.h
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                PermissionManager.C(aVar, dialogInterface, i10);
            }
        });
        builder.setNegativeButton("取消", new DialogInterface.OnClickListener() { // from class: com.max.hbpermission.i
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                PermissionManager.D(dialogInterface, i10);
            }
        });
        builder.create();
        builder.show();
    }

    public final void L(@dl.d FragmentActivity activity, @dl.e c cVar) {
        if (PatchProxy.proxy(new Object[]{activity, cVar}, this, changeQuickRedirect, false, bb.c.i.I3, new Class[]{FragmentActivity.class, c.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "activity");
        B(this, activity, new String[]{"android.permission.WRITE_CALENDAR", "android.permission.READ_CALENDAR"}, cVar, "【为了添加日历事件，需要日历权限】", null, 16, null);
    }

    public final void M(@dl.d FragmentActivity activity, @dl.e c cVar) {
        if (PatchProxy.proxy(new Object[]{activity, cVar}, this, changeQuickRedirect, false, bb.c.i.f33413y3, new Class[]{FragmentActivity.class, c.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "activity");
        B(this, activity, new String[]{"android.permission.CAMERA"}, cVar, "【为了拍摄照片或视频，需要使用摄像头】", null, 16, null);
    }

    public final void N(@dl.d FragmentActivity activity, @dl.e c cVar) {
        if (PatchProxy.proxy(new Object[]{activity, cVar}, this, changeQuickRedirect, false, bb.c.i.G3, new Class[]{FragmentActivity.class, c.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "activity");
        B(this, activity, new String[]{"android.permission.SYSTEM_ALERT_WINDOW"}, cVar, "需要悬浮窗权限", null, 16, null);
    }

    public final void O(@dl.d FragmentActivity activity, @dl.e c cVar) {
        if (PatchProxy.proxy(new Object[]{activity, cVar}, this, changeQuickRedirect, false, bb.c.i.A3, new Class[]{FragmentActivity.class, c.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "activity");
        B(this, activity, new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, cVar, "【解压安装包需要访问文件相关权限】", null, 16, null);
    }

    public final void P(@dl.d Fragment fragment, @dl.e c cVar) {
        if (PatchProxy.proxy(new Object[]{fragment, cVar}, this, changeQuickRedirect, false, bb.c.i.H3, new Class[]{Fragment.class, c.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(fragment, "fragment");
        FragmentActivity fragmentActivityRequireActivity = fragment.requireActivity();
        f0.o(fragmentActivityRequireActivity, "requireActivity(...)");
        A(fragmentActivityRequireActivity, new String[]{"android.permission.RECORD_AUDIO", "android.permission.READ_PHONE_STATE"}, cVar, "【为了进行语音通话，需要麦克风权限】", fragment);
    }

    public final void Q(@dl.e Fragment fragment, @dl.d FragmentActivity activity, @dl.e c cVar) {
        if (PatchProxy.proxy(new Object[]{fragment, activity, cVar}, this, changeQuickRedirect, false, bb.c.i.E3, new Class[]{Fragment.class, FragmentActivity.class, c.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "activity");
        if (Build.VERSION.SDK_INT >= 33) {
            A(activity, new String[]{"android.permission.CAMERA", "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, cVar, "【图片、视频选择器需要授予摄像头和访问存储权限】", fragment);
        } else {
            A(activity, new String[]{"android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, cVar, "【图片、视频选择器需要授予摄像头和访问存储权限】", fragment);
        }
    }

    public final void R(@dl.e Fragment fragment, @dl.d FragmentActivity activity, @dl.e c cVar) {
        if (PatchProxy.proxy(new Object[]{fragment, activity, cVar}, this, changeQuickRedirect, false, bb.c.i.C3, new Class[]{Fragment.class, FragmentActivity.class, c.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "activity");
        if (Build.VERSION.SDK_INT >= 33) {
            A(activity, new String[]{"android.permission.CAMERA", "android.permission.READ_MEDIA_IMAGES"}, cVar, "【图片选择器需要授予摄像头和访问存储权限】", fragment);
        } else {
            A(activity, new String[]{"android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, cVar, "【图片选择器需要授予摄像头和访问存储权限】", fragment);
        }
    }

    public final void S(@dl.d FragmentActivity activity, @dl.e c cVar) {
        if (PatchProxy.proxy(new Object[]{activity, cVar}, this, changeQuickRedirect, false, bb.c.i.B3, new Class[]{FragmentActivity.class, c.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "activity");
        if (Build.VERSION.SDK_INT >= 33) {
            B(this, activity, new String[]{"android.permission.CAMERA", "android.permission.READ_MEDIA_IMAGES"}, cVar, "【图片选择器需要授予摄像头和访问存储权限】", null, 16, null);
        } else {
            B(this, activity, new String[]{"android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, cVar, "【图片选择器需要授予摄像头和访问存储权限】", null, 16, null);
        }
    }

    public final void T(@dl.d FragmentActivity activity, @dl.e c cVar) {
        if (PatchProxy.proxy(new Object[]{activity, cVar}, this, changeQuickRedirect, false, bb.c.i.f33418z3, new Class[]{FragmentActivity.class, c.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "activity");
        if (Build.VERSION.SDK_INT < 30) {
            B(this, activity, new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, cVar, "【为了保存或分享图片，需要获取存储权限】", null, 16, null);
        } else if (cVar != null) {
            cVar.onResult();
        }
    }

    public final void U(@dl.d FragmentActivity activity, @dl.e a aVar) {
        if (PatchProxy.proxy(new Object[]{activity, aVar}, this, changeQuickRedirect, false, bb.c.i.f33403w3, new Class[]{FragmentActivity.class, a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "activity");
        o(activity, new String[]{"android.permission.CAMERA"}, aVar, "【为了扫描二维码，需要使用摄像头】");
    }

    public final void V(@dl.d FragmentActivity activity, @dl.e c cVar) {
        if (PatchProxy.proxy(new Object[]{activity, cVar}, this, changeQuickRedirect, false, bb.c.i.f33408x3, new Class[]{FragmentActivity.class, c.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "activity");
        B(this, activity, new String[]{"android.permission.CAMERA"}, cVar, "【为了扫描二维码，需要使用摄像头】", null, 16, null);
    }

    public final void W(@dl.d Fragment fragment, @dl.d FragmentActivity activity, @dl.e c cVar) {
        if (PatchProxy.proxy(new Object[]{fragment, activity, cVar}, this, changeQuickRedirect, false, bb.c.i.D3, new Class[]{Fragment.class, FragmentActivity.class, c.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(fragment, "fragment");
        f0.p(activity, "activity");
        if (Build.VERSION.SDK_INT >= 33) {
            A(activity, new String[]{"android.permission.CAMERA", "android.permission.READ_MEDIA_VIDEO"}, cVar, "【视频选择器需要授予摄像头和访问存储权限】", fragment);
        } else {
            A(activity, new String[]{"android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, cVar, "【视频选择器需要授予摄像头和访问存储权限】", fragment);
        }
    }

    public final void X(@dl.d FragmentActivity activity, @dl.e c cVar) {
        if (PatchProxy.proxy(new Object[]{activity, cVar}, this, changeQuickRedirect, false, bb.c.i.F3, new Class[]{FragmentActivity.class, c.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "activity");
        B(this, activity, new String[]{"android.permission.RECORD_AUDIO", "android.permission.MODIFY_AUDIO_SETTINGS"}, cVar, "【语音需要授予录音和调节系统音量权限】", null, 16, null);
    }

    public final boolean m(@dl.d Context context, @dl.d String... permissions) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, permissions}, this, changeQuickRedirect, false, bb.c.i.R3, new Class[]{Context.class, String[].class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(context, "context");
        f0.p(permissions, "permissions");
        for (String str : permissions) {
            if (androidx.core.content.d.a(context, str) != 0) {
                return false;
            }
        }
        return true;
    }

    @xh.i
    public final void n(@dl.d FragmentActivity activity, @dl.d String[] permissions, @dl.e a aVar) {
        if (PatchProxy.proxy(new Object[]{activity, permissions, aVar}, this, changeQuickRedirect, false, bb.c.i.W3, new Class[]{FragmentActivity.class, String[].class, a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "activity");
        f0.p(permissions, "permissions");
        p(this, activity, permissions, aVar, null, 8, null);
    }

    @xh.i
    public final void o(@dl.d final FragmentActivity activity, @dl.d final String[] permissions, @dl.e final a aVar, @dl.e final String str) {
        if (PatchProxy.proxy(new Object[]{activity, permissions, aVar, str}, this, changeQuickRedirect, false, bb.c.i.N3, new Class[]{FragmentActivity.class, String[].class, a.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "activity");
        f0.p(permissions, "permissions");
        final yh.a<b2> aVar2 = new yh.a<b2>() { // from class: com.max.hbpermission.PermissionManager$binaryRequest$goto$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33513e, new Class[0], Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33490d, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                PermissionManager permissionManager = PermissionManager.f71603a;
                FragmentActivity fragmentActivity = activity;
                String[] strArr = permissions;
                PermissionManager.k(permissionManager, fragmentActivity, (String[]) Arrays.copyOf(strArr, strArr.length), aVar, str);
            }
        };
        if (m(activity, (String[]) Arrays.copyOf(permissions, permissions.length))) {
            aVar2.invoke();
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setMessage(str);
        builder.setPositiveButton("确认", new DialogInterface.OnClickListener() { // from class: com.max.hbpermission.m
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                PermissionManager.q(aVar2, dialogInterface, i10);
            }
        });
        builder.setNegativeButton("取消", new DialogInterface.OnClickListener() { // from class: com.max.hbpermission.n
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                PermissionManager.r(aVar, dialogInterface, i10);
            }
        });
        builder.create();
        builder.show();
    }

    @xh.i
    public final void y(@dl.d FragmentActivity activity, @dl.d String[] permissions, @dl.e c cVar) {
        if (PatchProxy.proxy(new Object[]{activity, permissions, cVar}, this, changeQuickRedirect, false, bb.c.i.T3, new Class[]{FragmentActivity.class, String[].class, c.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "activity");
        f0.p(permissions, "permissions");
        B(this, activity, permissions, cVar, null, null, 24, null);
    }

    @xh.i
    public final void z(@dl.d FragmentActivity activity, @dl.d String[] permissions, @dl.e c cVar, @dl.e String str) {
        if (PatchProxy.proxy(new Object[]{activity, permissions, cVar, str}, this, changeQuickRedirect, false, bb.c.i.S3, new Class[]{FragmentActivity.class, String[].class, c.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "activity");
        f0.p(permissions, "permissions");
        B(this, activity, permissions, cVar, str, null, 16, null);
    }
}
