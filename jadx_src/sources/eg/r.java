package eg;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PermissionBuilder.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001MB7\u0012\b\u0010E\u001a\u0004\u0018\u00010;\u0012\b\u0010G\u001a\u0004\u0018\u00010F\u0012\f\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00050H\u0012\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00050H¢\u0006\u0004\bK\u0010LJ\b\u0010\u0003\u001a\u00020\u0002H\u0003J\u0016\u0010\u0007\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\rJ\u0006\u0010\u000f\u001a\u00020\u0000J\u0016\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010J\u0010\u0010\u0015\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0014J>\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005J\u001e\u0010 \u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001eJ\u001e\u0010#\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020!J\u001c\u0010%\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050$2\u0006\u0010\u0017\u001a\u00020\u0016J\u000e\u0010&\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016J\u000e\u0010'\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016J\u000e\u0010(\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016J\u000e\u0010)\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016J\u000e\u0010*\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016J\u0006\u0010+\u001a\u00020\u0018J\u0006\u0010,\u001a\u00020\u0018J\u0006\u0010-\u001a\u00020\u0018J\u0006\u0010.\u001a\u00020\u0018J\u0006\u0010/\u001a\u00020\u0018J\u000f\u00100\u001a\u00020\u0002H\u0000¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0002H\u0000¢\u0006\u0004\b2\u00101R\u0014\u00106\u001a\u0002038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\"\u0010<\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0011\u0010D\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006N"}, d2 = {"Leg/r;", "", "Lkotlin/b2;", "l", "", "", "permissions", "g", "Lcg/a;", "callback", "m", "Lcg/b;", "n", "Lcg/c;", "o", "f", "", "lightColor", "darkColor", ak.aD, "Lcg/d;", "q", "Leg/b;", "chainTask", "", "showReasonOrGoSettings", "message", "positiveText", "negativeText", "H", "Lcom/permissionx/guolindev/dialog/c;", "dialog", "F", "Lcom/permissionx/guolindev/dialog/d;", "dialogFragment", "G", "", ak.aG, "r", "v", RXScreenCaptureService.KEY_WIDTH, "t", ak.aB, androidx.exifinterface.media.a.W4, "D", androidx.exifinterface.media.a.S4, "C", "B", "p", "()V", "x", "Landroidx/fragment/app/FragmentManager;", "i", "()Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Leg/l;", "j", "()Leg/l;", "invisibleFragment", "Landroidx/fragment/app/FragmentActivity;", RXScreenCaptureService.KEY_LAUNCH_ACTIVITY, "Landroidx/fragment/app/FragmentActivity;", RXScreenCaptureService.KEY_HEIGHT, "()Landroidx/fragment/app/FragmentActivity;", "y", "(Landroidx/fragment/app/FragmentActivity;)V", "k", "()I", "targetSdkVersion", "fragmentActivity", "Landroidx/fragment/app/Fragment;", "fragment", "", "normalPermissions", "specialPermissions", "<init>", "(Landroidx/fragment/app/FragmentActivity;Landroidx/fragment/app/Fragment;Ljava/util/Set;Ljava/util/Set;)V", ak.av, "permissionx_release"}, k = 1, mv = {1, 5, 1})
public final class r {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.d
    public static final a f118656u = new a(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.d
    private static final String f118657v = "InvisibleFragment";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FragmentActivity f118658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private Fragment f118659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f118660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f118661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f118662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    @xh.e
    public Dialog f118663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    @xh.e
    public Set<String> f118664g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    @xh.e
    public Set<String> f118665h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @xh.e
    public boolean f118666i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @xh.e
    public boolean f118667j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    @xh.e
    public Set<String> f118668k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    @xh.e
    public Set<String> f118669l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    @xh.e
    public Set<String> f118670m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    @xh.e
    public Set<String> f118671n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    @xh.e
    public Set<String> f118672o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    @xh.e
    public Set<String> f118673p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.e
    @xh.e
    public cg.d f118674q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.e
    @xh.e
    public cg.a f118675r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.e
    @xh.e
    public cg.b f118676s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.e
    @xh.e
    public cg.c f118677t;

    /* JADX INFO: compiled from: PermissionBuilder.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Leg/r$a;", "", "", "FRAGMENT_TAG", "Ljava/lang/String;", "<init>", "()V", "permissionx_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    public r(@dl.e FragmentActivity fragmentActivity, @dl.e Fragment fragment, @dl.d Set<String> normalPermissions, @dl.d Set<String> specialPermissions) {
        f0.p(normalPermissions, "normalPermissions");
        f0.p(specialPermissions, "specialPermissions");
        this.f118660c = -1;
        this.f118661d = -1;
        this.f118662e = -1;
        this.f118668k = new LinkedHashSet();
        this.f118669l = new LinkedHashSet();
        this.f118670m = new LinkedHashSet();
        this.f118671n = new LinkedHashSet();
        this.f118672o = new LinkedHashSet();
        this.f118673p = new LinkedHashSet();
        if (fragmentActivity != null) {
            y(fragmentActivity);
        }
        if (fragmentActivity == null && fragment != null) {
            FragmentActivity fragmentActivityRequireActivity = fragment.requireActivity();
            f0.o(fragmentActivityRequireActivity, "fragment.requireActivity()");
            y(fragmentActivityRequireActivity);
        }
        this.f118659b = fragment;
        this.f118664g = normalPermissions;
        this.f118665h = specialPermissions;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(com.permissionx.guolindev.dialog.c dialog, boolean z10, b chainTask, List permissions, r this$0, View view) {
        f0.p(dialog, "$dialog");
        f0.p(chainTask, "$chainTask");
        f0.p(permissions, "$permissions");
        f0.p(this$0, "this$0");
        dialog.dismiss();
        if (z10) {
            chainTask.b(permissions);
        } else {
            this$0.g(permissions);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(com.permissionx.guolindev.dialog.c dialog, b chainTask, View view) {
        f0.p(dialog, "$dialog");
        f0.p(chainTask, "$chainTask");
        dialog.dismiss();
        chainTask.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(r this$0, DialogInterface dialogInterface) {
        f0.p(this$0, "this$0");
        this$0.f118663f = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(com.permissionx.guolindev.dialog.d dialogFragment, boolean z10, b chainTask, List permissions, r this$0, View view) {
        f0.p(dialogFragment, "$dialogFragment");
        f0.p(chainTask, "$chainTask");
        f0.p(permissions, "$permissions");
        f0.p(this$0, "this$0");
        dialogFragment.dismiss();
        if (z10) {
            chainTask.b(permissions);
        } else {
            this$0.g(permissions);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(com.permissionx.guolindev.dialog.d dialogFragment, b chainTask, View view) {
        f0.p(dialogFragment, "$dialogFragment");
        f0.p(chainTask, "$chainTask");
        dialogFragment.dismiss();
        chainTask.finish();
    }

    private final void g(List<String> list) {
        this.f118673p.clear();
        this.f118673p.addAll(list);
        j().T3();
    }

    private final FragmentManager i() {
        Fragment fragment = this.f118659b;
        FragmentManager childFragmentManager = fragment == null ? null : fragment.getChildFragmentManager();
        if (childFragmentManager != null) {
            return childFragmentManager;
        }
        FragmentManager supportFragmentManager = h().getSupportFragmentManager();
        f0.o(supportFragmentManager, "activity.supportFragmentManager");
        return supportFragmentManager;
    }

    private final l j() {
        Fragment fragmentS0 = i().s0(f118657v);
        if (fragmentS0 != null) {
            return (l) fragmentS0;
        }
        l lVar = new l();
        i().u().g(lVar, f118657v).p();
        return lVar;
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    private final void l() {
        this.f118662e = h().getRequestedOrientation();
        int i10 = h().getResources().getConfiguration().orientation;
        if (i10 == 1) {
            h().setRequestedOrientation(7);
        } else {
            if (i10 != 2) {
                return;
            }
            h().setRequestedOrientation(6);
        }
    }

    public final boolean A() {
        return this.f118665h.contains(s.f118679f);
    }

    public final boolean B() {
        return this.f118665h.contains(u.f118683f);
    }

    public final boolean C() {
        return this.f118665h.contains(v.f118685f);
    }

    public final boolean D() {
        return this.f118665h.contains("android.permission.SYSTEM_ALERT_WINDOW");
    }

    public final boolean E() {
        return this.f118665h.contains("android.permission.WRITE_SETTINGS");
    }

    public final void F(@dl.d final b chainTask, final boolean z10, @dl.d final com.permissionx.guolindev.dialog.c dialog) {
        f0.p(chainTask, "chainTask");
        f0.p(dialog, "dialog");
        this.f118667j = true;
        final List<String> listB = dialog.b();
        f0.o(listB, "dialog.permissionsToRequest");
        if (listB.isEmpty()) {
            chainTask.finish();
            return;
        }
        this.f118663f = dialog;
        dialog.show();
        if ((dialog instanceof com.permissionx.guolindev.dialog.a) && ((com.permissionx.guolindev.dialog.a) dialog).f()) {
            dialog.dismiss();
            chainTask.finish();
        }
        View viewC = dialog.c();
        f0.o(viewC, "dialog.positiveButton");
        View viewA = dialog.a();
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);
        viewC.setClickable(true);
        viewC.setOnClickListener(new View.OnClickListener() { // from class: eg.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r.I(dialog, z10, chainTask, listB, this, view);
            }
        });
        if (viewA != null) {
            viewA.setClickable(true);
            viewA.setOnClickListener(new View.OnClickListener() { // from class: eg.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    r.J(dialog, chainTask, view);
                }
            });
        }
        Dialog dialog2 = this.f118663f;
        if (dialog2 == null) {
            return;
        }
        dialog2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: eg.q
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                r.K(this.f118655b, dialogInterface);
            }
        });
    }

    public final void G(@dl.d final b chainTask, final boolean z10, @dl.d final com.permissionx.guolindev.dialog.d dialogFragment) {
        f0.p(chainTask, "chainTask");
        f0.p(dialogFragment, "dialogFragment");
        this.f118667j = true;
        final List<String> listM3 = dialogFragment.M3();
        f0.o(listM3, "dialogFragment.permissionsToRequest");
        if (listM3.isEmpty()) {
            chainTask.finish();
            return;
        }
        dialogFragment.showNow(i(), "PermissionXRationaleDialogFragment");
        View viewN3 = dialogFragment.N3();
        f0.o(viewN3, "dialogFragment.positiveButton");
        View viewL3 = dialogFragment.L3();
        dialogFragment.setCancelable(false);
        viewN3.setClickable(true);
        viewN3.setOnClickListener(new View.OnClickListener() { // from class: eg.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r.L(dialogFragment, z10, chainTask, listM3, this, view);
            }
        });
        if (viewL3 != null) {
            viewL3.setClickable(true);
            viewL3.setOnClickListener(new View.OnClickListener() { // from class: eg.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    r.M(dialogFragment, chainTask, view);
                }
            });
        }
    }

    public final void H(@dl.d b chainTask, boolean z10, @dl.d List<String> permissions, @dl.d String message, @dl.d String positiveText, @dl.e String str) {
        f0.p(chainTask, "chainTask");
        f0.p(permissions, "permissions");
        f0.p(message, "message");
        f0.p(positiveText, "positiveText");
        F(chainTask, z10, new com.permissionx.guolindev.dialog.a(h(), permissions, message, positiveText, str, this.f118660c, this.f118661d));
    }

    @dl.d
    public final r f() {
        this.f118666i = true;
        return this;
    }

    @dl.d
    public final FragmentActivity h() {
        FragmentActivity fragmentActivity = this.f118658a;
        if (fragmentActivity != null) {
            return fragmentActivity;
        }
        f0.S(RXScreenCaptureService.KEY_LAUNCH_ACTIVITY);
        return null;
    }

    public final int k() {
        return h().getApplicationInfo().targetSdkVersion;
    }

    @dl.d
    public final r m(@dl.e cg.a callback) {
        this.f118675r = callback;
        return this;
    }

    @dl.d
    public final r n(@dl.e cg.b callback) {
        this.f118676s = callback;
        return this;
    }

    @dl.d
    public final r o(@dl.e cg.c callback) {
        this.f118677t = callback;
        return this;
    }

    public final void p() {
        Fragment fragmentS0 = i().s0(f118657v);
        if (fragmentS0 != null) {
            i().u().x(fragmentS0).n();
        }
    }

    public final void q(@dl.e cg.d dVar) {
        this.f118674q = dVar;
        l();
        t tVar = new t();
        tVar.a(new w(this));
        tVar.a(new s(this));
        tVar.a(new x(this));
        tVar.a(new y(this));
        tVar.a(new v(this));
        tVar.a(new u(this));
        tVar.b();
    }

    public final void r(@dl.d b chainTask) {
        f0.p(chainTask, "chainTask");
        j().b4(this, chainTask);
    }

    public final void s(@dl.d b chainTask) {
        f0.p(chainTask, "chainTask");
        j().e4(this, chainTask);
    }

    public final void t(@dl.d b chainTask) {
        f0.p(chainTask, "chainTask");
        j().g4(this, chainTask);
    }

    public final void u(@dl.d Set<String> permissions, @dl.d b chainTask) {
        f0.p(permissions, "permissions");
        f0.p(chainTask, "chainTask");
        j().i4(this, permissions, chainTask);
    }

    public final void v(@dl.d b chainTask) {
        f0.p(chainTask, "chainTask");
        j().k4(this, chainTask);
    }

    public final void w(@dl.d b chainTask) {
        f0.p(chainTask, "chainTask");
        j().m4(this, chainTask);
    }

    public final void x() {
        h().setRequestedOrientation(this.f118662e);
    }

    public final void y(@dl.d FragmentActivity fragmentActivity) {
        f0.p(fragmentActivity, "<set-?>");
        this.f118658a = fragmentActivity;
    }

    @dl.d
    public final r z(int lightColor, int darkColor) {
        this.f118660c = lightColor;
        this.f118661d = darkColor;
        return this;
    }
}
