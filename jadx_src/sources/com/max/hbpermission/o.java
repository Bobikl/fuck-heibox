package com.max.hbpermission;

import android.app.Activity;
import android.text.SpannableStringBuilder;
import androidx.fragment.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.v0;

/* JADX INFO: compiled from: RationaleDialogFactory.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final o f71655a = new o();
    public static ChangeQuickRedirect changeQuickRedirect;

    private o() {
    }

    public static /* synthetic */ com.permissionx.guolindev.dialog.c g(o oVar, FragmentActivity fragmentActivity, List list, String str, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{oVar, fragmentActivity, list, str, new Integer(i10), obj}, null, changeQuickRedirect, true, bb.c.k.f33605i, new Class[]{o.class, FragmentActivity.class, List.class, String.class, Integer.TYPE, Object.class}, com.permissionx.guolindev.dialog.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.permissionx.guolindev.dialog.c) patchProxyResultProxy.result;
        }
        if ((i10 & 4) != 0) {
            str = null;
        }
        return oVar.f(fragmentActivity, list, str);
    }

    public static /* synthetic */ com.permissionx.guolindev.dialog.c j(o oVar, FragmentActivity fragmentActivity, List list, String str, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{oVar, fragmentActivity, list, str, new Integer(i10), obj}, null, changeQuickRedirect, true, bb.c.k.f33651k, new Class[]{o.class, FragmentActivity.class, List.class, String.class, Integer.TYPE, Object.class}, com.permissionx.guolindev.dialog.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.permissionx.guolindev.dialog.c) patchProxyResultProxy.result;
        }
        if ((i10 & 4) != 0) {
            str = null;
        }
        return oVar.i(fragmentActivity, list, str);
    }

    @dl.d
    public final String a(@dl.d Activity activity, @dl.d String rationale) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{activity, rationale}, this, changeQuickRedirect, false, bb.c.k.f33743o, new Class[]{Activity.class, String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        f0.p(activity, "activity");
        f0.p(rationale, "rationale");
        v0 v0Var = v0.f124986a;
        String string = activity.getString(R.string.lib_permission_app_settings_rationale_format);
        f0.o(string, "getString(...)");
        String str = String.format(string, Arrays.copyOf(new Object[]{rationale}, 1));
        f0.o(str, "format(...)");
        return str;
    }

    @dl.d
    public final String b(@dl.d Activity activity, @dl.d List<String> deniedPermissions) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{activity, deniedPermissions}, this, changeQuickRedirect, false, bb.c.k.f33720n, new Class[]{Activity.class, List.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        f0.p(activity, "activity");
        f0.p(deniedPermissions, "deniedPermissions");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
        int size = deniedPermissions.size();
        for (int i10 = 0; i10 < size; i10++) {
            String str = deniedPermissions.get(i10);
            if (i10 > 0) {
                spannableStringBuilder.append((CharSequence) "\n");
            }
            if (f0.g("android.permission.READ_CONTACTS", str)) {
                spannableStringBuilder.append((CharSequence) "【").append((CharSequence) activity.getString(R.string.lib_permission_rationale_read_contacts)).append((CharSequence) "】");
            } else if (f0.g("android.permission.CAMERA", str)) {
                spannableStringBuilder.append((CharSequence) "【").append((CharSequence) activity.getString(R.string.lib_permission_rationale_camera)).append((CharSequence) "】");
            } else if (f0.g("android.permission.READ_PHONE_STATE", str)) {
                spannableStringBuilder.append((CharSequence) "【").append((CharSequence) activity.getString(R.string.lib_permission_rationale_read_phone_state)).append((CharSequence) "】");
            } else if (f0.g("android.permission.WRITE_EXTERNAL_STORAGE", str)) {
                spannableStringBuilder.append((CharSequence) "【").append((CharSequence) activity.getString(R.string.lib_permission_rationale_write_external_storage)).append((CharSequence) "】");
            } else if (f0.g("android.permission.ACCESS_COARSE_LOCATION", str)) {
                spannableStringBuilder.append((CharSequence) "【").append((CharSequence) activity.getString(R.string.lib_permission_rationale_access_coarse_location)).append((CharSequence) "】");
            }
        }
        v0 v0Var = v0.f124986a;
        String string = activity.getString(R.string.lib_permission_app_settings_rationale_format);
        f0.o(string, "getString(...)");
        String str2 = String.format(string, Arrays.copyOf(new Object[]{spannableStringBuilder}, 1));
        f0.o(str2, "format(...)");
        return str2;
    }

    @dl.d
    public final String c(@dl.d Activity activity, @dl.d String rationale) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{activity, rationale}, this, changeQuickRedirect, false, bb.c.k.f33697m, new Class[]{Activity.class, String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        f0.p(activity, "activity");
        f0.p(rationale, "rationale");
        v0 v0Var = v0.f124986a;
        String string = activity.getString(R.string.lib_permission_rationale_format);
        f0.o(string, "getString(...)");
        String str = String.format(string, Arrays.copyOf(new Object[]{rationale}, 1));
        f0.o(str, "format(...)");
        return str;
    }

    @dl.d
    public final String d(@dl.d Activity activity, @dl.d List<String> rationalePermissions) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{activity, rationalePermissions}, this, changeQuickRedirect, false, bb.c.k.f33674l, new Class[]{Activity.class, List.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        f0.p(activity, "activity");
        f0.p(rationalePermissions, "rationalePermissions");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
        int size = rationalePermissions.size();
        for (int i10 = 0; i10 < size; i10++) {
            String str = rationalePermissions.get(i10);
            if (i10 > 0) {
                spannableStringBuilder.append((CharSequence) "\n");
            }
            if (f0.g("android.permission.READ_CONTACTS", str)) {
                spannableStringBuilder.append((CharSequence) "【").append((CharSequence) activity.getString(R.string.lib_permission_rationale_read_contacts)).append((CharSequence) "】");
            } else if (f0.g("android.permission.CAMERA", str)) {
                spannableStringBuilder.append((CharSequence) "【").append((CharSequence) activity.getString(R.string.lib_permission_rationale_camera)).append((CharSequence) "】");
            } else if (f0.g("android.permission.READ_PHONE_STATE", str)) {
                spannableStringBuilder.append((CharSequence) "【").append((CharSequence) activity.getString(R.string.lib_permission_rationale_read_phone_state)).append((CharSequence) "】");
            } else if (f0.g("android.permission.WRITE_EXTERNAL_STORAGE", str)) {
                spannableStringBuilder.append((CharSequence) "【").append((CharSequence) activity.getString(R.string.lib_permission_rationale_write_external_storage)).append((CharSequence) "】");
            } else if (f0.g("android.permission.ACCESS_COARSE_LOCATION", str)) {
                spannableStringBuilder.append((CharSequence) "【").append((CharSequence) activity.getString(R.string.lib_permission_rationale_access_coarse_location)).append((CharSequence) "】");
            } else if (f0.g("android.permission.RECORD_AUDIO", str)) {
                spannableStringBuilder.append((CharSequence) "【").append((CharSequence) activity.getString(R.string.lib_permission_rationale_access_coarse_location)).append((CharSequence) "】");
            }
        }
        v0 v0Var = v0.f124986a;
        String string = activity.getString(R.string.lib_permission_rationale_format);
        f0.o(string, "getString(...)");
        String str2 = String.format(string, Arrays.copyOf(new Object[]{spannableStringBuilder}, 1));
        f0.o(str2, "format(...)");
        return str2;
    }

    @dl.d
    @xh.i
    public final com.permissionx.guolindev.dialog.c e(@dl.d FragmentActivity activity, @dl.d List<String> deniedList) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{activity, deniedList}, this, changeQuickRedirect, false, bb.c.k.f33766p, new Class[]{FragmentActivity.class, List.class}, com.permissionx.guolindev.dialog.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.permissionx.guolindev.dialog.c) patchProxyResultProxy.result;
        }
        f0.p(activity, "activity");
        f0.p(deniedList, "deniedList");
        return g(this, activity, deniedList, null, 4, null);
    }

    @dl.d
    @xh.i
    public final com.permissionx.guolindev.dialog.c f(@dl.d FragmentActivity activity, @dl.d List<String> deniedList, @dl.e String str) {
        boolean z10 = true;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{activity, deniedList, str}, this, changeQuickRedirect, false, bb.c.k.f33582h, new Class[]{FragmentActivity.class, List.class, String.class}, com.permissionx.guolindev.dialog.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.permissionx.guolindev.dialog.c) patchProxyResultProxy.result;
        }
        f0.p(activity, "activity");
        f0.p(deniedList, "deniedList");
        p.f fVar = new p.f(activity);
        if (str != null && str.length() != 0) {
            z10 = false;
        }
        fVar.q("授权").l(deniedList).e(z10 ? d(activity, deniedList) : c(activity, str)).n(activity.getString(R.string.lib_permission_next_step), null).h(activity.getString(R.string.lib_permission_cancel), null).c(false);
        p pVarA = fVar.a();
        f0.o(pVarA, "create(...)");
        return pVarA;
    }

    @dl.d
    @xh.i
    public final com.permissionx.guolindev.dialog.c h(@dl.d FragmentActivity activity, @dl.d List<String> deniedList) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{activity, deniedList}, this, changeQuickRedirect, false, bb.c.k.f33789q, new Class[]{FragmentActivity.class, List.class}, com.permissionx.guolindev.dialog.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.permissionx.guolindev.dialog.c) patchProxyResultProxy.result;
        }
        f0.p(activity, "activity");
        f0.p(deniedList, "deniedList");
        return j(this, activity, deniedList, null, 4, null);
    }

    @dl.d
    @xh.i
    public final com.permissionx.guolindev.dialog.c i(@dl.d FragmentActivity activity, @dl.d List<String> deniedList, @dl.e String str) {
        boolean z10 = true;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{activity, deniedList, str}, this, changeQuickRedirect, false, bb.c.k.f33628j, new Class[]{FragmentActivity.class, List.class, String.class}, com.permissionx.guolindev.dialog.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.permissionx.guolindev.dialog.c) patchProxyResultProxy.result;
        }
        f0.p(activity, "activity");
        f0.p(deniedList, "deniedList");
        p.f fVar = new p.f(activity);
        if (str != null && str.length() != 0) {
            z10 = false;
        }
        fVar.q("授权").l(deniedList).e(z10 ? b(activity, deniedList) : a(activity, str)).n(activity.getString(R.string.lib_permission_go_to_settings), null).h(activity.getString(R.string.lib_permission_cancel), null).c(false);
        p pVarA = fVar.a();
        f0.o(pVarA, "create(...)");
        return pVarA;
    }
}
