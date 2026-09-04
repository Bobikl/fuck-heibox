package com.max.xiaoheihe.module.account;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.FragmentActivity;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.accelworld.AccelWorkCoroutinesKt;
import com.max.xiaoheihe.bean.account.User;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.e30;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.b2;
import kotlin.c1;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: BottomBindPhoneDialogFragment.kt */
/* JADX INFO: loaded from: classes9.dex */
@kotlin.jvm.internal.t0({"SMAP\nBottomBindPhoneDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomBindPhoneDialogFragment.kt\ncom/max/xiaoheihe/module/account/BottomBindPhoneDialogFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,394:1\n262#2,2:395\n262#2,2:397\n262#2,2:399\n*S KotlinDebug\n*F\n+ 1 BottomBindPhoneDialogFragment.kt\ncom/max/xiaoheihe/module/account/BottomBindPhoneDialogFragment\n*L\n93#1:395,2\n95#1:397,2\n98#1:399,2\n*E\n"})
@androidx.compose.runtime.internal.o(parameters = 0)
public final class BottomBindPhoneDialogFragment extends com.max.hbcommon.base.swipeback.a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.d
    public static final a f77531v = new a(null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f77532w = 8;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @dl.d
    private static final String f77533x = "BottomSheetsBindPhone-dbg";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @dl.d
    private static final String f77534y = "alert_title";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.e
    private LoadingDialog f77535j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.e
    private e30 f77536k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.e
    private Timer f77538m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.e
    private TimerTask f77539n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.e
    private String f77541p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.e
    private String f77542q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.e
    private yh.a<b2> f77543r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.e
    private yh.a<b2> f77544s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f77545t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.d
    private final androidx.activity.result.g<Intent> f77546u;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private String f77537l = "+86";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f77540o = 60;

    /* JADX INFO: compiled from: BottomBindPhoneDialogFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final BottomBindPhoneDialogFragment a(@dl.e String str, @dl.d yh.a<b2> onComplete, @dl.d yh.a<b2> onCancel) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, onComplete, onCancel}, this, changeQuickRedirect, false, 22538, new Class[]{String.class, yh.a.class, yh.a.class}, BottomBindPhoneDialogFragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (BottomBindPhoneDialogFragment) patchProxyResultProxy.result;
            }
            kotlin.jvm.internal.f0.p(onComplete, "onComplete");
            kotlin.jvm.internal.f0.p(onCancel, "onCancel");
            BottomBindPhoneDialogFragment bottomBindPhoneDialogFragment = new BottomBindPhoneDialogFragment();
            bottomBindPhoneDialogFragment.f77543r = onComplete;
            bottomBindPhoneDialogFragment.f77544s = onCancel;
            bottomBindPhoneDialogFragment.setArguments(androidx.core.os.e.b(c1.a(BottomBindPhoneDialogFragment.f77534y, str)));
            return bottomBindPhoneDialogFragment;
        }
    }

    /* JADX INFO: compiled from: BottomBindPhoneDialogFragment.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 22539, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (BottomBindPhoneDialogFragment.this.isActive()) {
                BottomBindPhoneDialogFragment.f4(BottomBindPhoneDialogFragment.this);
                super.onError(e10);
            }
        }

        public void onNext(@dl.d Result<?> result) {
            EditText editText;
            Editable text;
            String string;
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 22540, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (BottomBindPhoneDialogFragment.this.isActive()) {
                com.max.hbutils.utils.c.f("成功");
                User userI = com.max.xiaoheihe.utils.i0.i();
                e30 e30Var = BottomBindPhoneDialogFragment.this.f77536k;
                userI.setPhonenum((e30Var == null || (editText = e30Var.f110008f) == null || (text = editText.getText()) == null || (string = text.toString()) == null) ? null : StringsKt__StringsKt.F5(string).toString());
                com.max.xiaoheihe.utils.i0.z(userI);
                BottomBindPhoneDialogFragment.f4(BottomBindPhoneDialogFragment.this);
                BottomBindPhoneDialogFragment.this.f77545t = true;
                BottomBindPhoneDialogFragment.this.dismiss();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 22541, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: BottomBindPhoneDialogFragment.kt */
    public static final class c implements com.max.xiaoheihe.utils.a.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f77549b;

        c(String str) {
            this.f77549b = str;
        }

        @Override // com.max.xiaoheihe.utils.a.b
        public final void a() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22542, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            BottomBindPhoneDialogFragment.V3(BottomBindPhoneDialogFragment.this, this.f77549b);
        }
    }

    /* JADX INFO: compiled from: BottomBindPhoneDialogFragment.kt */
    public static final class d extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 22543, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (BottomBindPhoneDialogFragment.this.isActive()) {
                super.onNext(result);
                com.max.hbutils.utils.c.f("验证码已经发送");
                BottomBindPhoneDialogFragment.g4(BottomBindPhoneDialogFragment.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 22544, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: BottomBindPhoneDialogFragment.kt */
    public static final class e extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 22545, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (BottomBindPhoneDialogFragment.this.isActive()) {
                BottomBindPhoneDialogFragment.f4(BottomBindPhoneDialogFragment.this);
                super.onError(e10);
            }
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 22546, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (BottomBindPhoneDialogFragment.this.isActive()) {
                BottomBindPhoneDialogFragment bottomBindPhoneDialogFragment = BottomBindPhoneDialogFragment.this;
                Map<String, String> keyMap = result.getKeyMap();
                bottomBindPhoneDialogFragment.f77542q = keyMap != null ? keyMap.get("sid") : null;
                BottomBindPhoneDialogFragment.X3(BottomBindPhoneDialogFragment.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 22547, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: BottomBindPhoneDialogFragment.kt */
    public static final class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22551, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            BottomBindPhoneDialogFragment.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: BottomBindPhoneDialogFragment.kt */
    public static final class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ e30 f77554c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ e30 f77555d;

        g(e30 e30Var, e30 e30Var2) {
            this.f77554c = e30Var;
            this.f77555d = e30Var2;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22552, new Class[]{View.class}, Void.TYPE).isSupported && BottomBindPhoneDialogFragment.W3(BottomBindPhoneDialogFragment.this, this.f77554c)) {
                BottomBindPhoneDialogFragment.o4(BottomBindPhoneDialogFragment.this);
                BottomBindPhoneDialogFragment.c4(BottomBindPhoneDialogFragment.this, StringsKt__StringsKt.F5(this.f77555d.f110008f.getText().toString()).toString(), StringsKt__StringsKt.F5(this.f77555d.f110009g.getText().toString()).toString());
            }
        }
    }

    /* JADX INFO: compiled from: BottomBindPhoneDialogFragment.kt */
    public static final class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ e30 f77557c;

        h(e30 e30Var) {
            this.f77557c = e30Var;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22553, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            BottomBindPhoneDialogFragment.b4(BottomBindPhoneDialogFragment.this, StringsKt__StringsKt.F5(this.f77557c.f110008f.getText().toString()).toString());
        }
    }

    /* JADX INFO: compiled from: BottomBindPhoneDialogFragment.kt */
    public static final class i implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f77559c;

        i(Context context) {
            this.f77559c = context;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22554, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            BottomBindPhoneDialogFragment.this.f77546u.b(AreaCodeActivity.T1(this.f77559c));
        }
    }

    /* JADX INFO: compiled from: BottomBindPhoneDialogFragment.kt */
    public static final class j implements androidx.activity.result.a<ActivityResult> {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // androidx.activity.result.a
        public /* bridge */ /* synthetic */ void a(ActivityResult activityResult) {
            if (PatchProxy.proxy(new Object[]{activityResult}, this, changeQuickRedirect, false, 22556, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(activityResult);
        }

        public final void b(ActivityResult activityResult) {
            if (PatchProxy.proxy(new Object[]{activityResult}, this, changeQuickRedirect, false, 22555, new Class[]{ActivityResult.class}, Void.TYPE).isSupported || activityResult == null || activityResult.b() != -1) {
                return;
            }
            BottomBindPhoneDialogFragment bottomBindPhoneDialogFragment = BottomBindPhoneDialogFragment.this;
            Intent intentA = activityResult.a();
            String stringExtra = intentA != null ? intentA.getStringExtra(AreaCodeActivity.Q) : null;
            if (stringExtra == null) {
                stringExtra = "+86";
            }
            bottomBindPhoneDialogFragment.f77537l = stringExtra;
            e30 e30Var = BottomBindPhoneDialogFragment.this.f77536k;
            TextView textView = e30Var != null ? e30Var.f110015m : null;
            if (textView == null) {
                return;
            }
            textView.setText(BottomBindPhoneDialogFragment.this.f77537l);
        }
    }

    public BottomBindPhoneDialogFragment() {
        androidx.activity.result.g<Intent> gVarRegisterForActivityResult = registerForActivityResult(new z.b.m(), new j());
        kotlin.jvm.internal.f0.o(gVarRegisterForActivityResult, "registerForActivityResul… areaCode\n        }\n    }");
        this.f77546u = gVarRegisterForActivityResult;
    }

    public static final /* synthetic */ void V3(BottomBindPhoneDialogFragment bottomBindPhoneDialogFragment, String str) {
        if (PatchProxy.proxy(new Object[]{bottomBindPhoneDialogFragment, str}, null, changeQuickRedirect, true, 22533, new Class[]{BottomBindPhoneDialogFragment.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        bottomBindPhoneDialogFragment.p4(str);
    }

    public static final /* synthetic */ boolean W3(BottomBindPhoneDialogFragment bottomBindPhoneDialogFragment, e30 e30Var) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bottomBindPhoneDialogFragment, e30Var}, null, changeQuickRedirect, true, 22534, new Class[]{BottomBindPhoneDialogFragment.class, e30.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : bottomBindPhoneDialogFragment.q4(e30Var);
    }

    public static final /* synthetic */ void X3(BottomBindPhoneDialogFragment bottomBindPhoneDialogFragment) {
        if (PatchProxy.proxy(new Object[]{bottomBindPhoneDialogFragment}, null, changeQuickRedirect, true, 22532, new Class[]{BottomBindPhoneDialogFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        bottomBindPhoneDialogFragment.r4();
    }

    public static final /* synthetic */ void b4(BottomBindPhoneDialogFragment bottomBindPhoneDialogFragment, String str) {
        if (PatchProxy.proxy(new Object[]{bottomBindPhoneDialogFragment, str}, null, changeQuickRedirect, true, 22537, new Class[]{BottomBindPhoneDialogFragment.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        bottomBindPhoneDialogFragment.s4(str);
    }

    public static final /* synthetic */ void c4(BottomBindPhoneDialogFragment bottomBindPhoneDialogFragment, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{bottomBindPhoneDialogFragment, str, str2}, null, changeQuickRedirect, true, 22536, new Class[]{BottomBindPhoneDialogFragment.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        bottomBindPhoneDialogFragment.t4(str, str2);
    }

    public static final /* synthetic */ void f4(BottomBindPhoneDialogFragment bottomBindPhoneDialogFragment) {
        if (PatchProxy.proxy(new Object[]{bottomBindPhoneDialogFragment}, null, changeQuickRedirect, true, 22531, new Class[]{BottomBindPhoneDialogFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        bottomBindPhoneDialogFragment.u4();
    }

    public static final /* synthetic */ void g4(BottomBindPhoneDialogFragment bottomBindPhoneDialogFragment) {
        if (PatchProxy.proxy(new Object[]{bottomBindPhoneDialogFragment}, null, changeQuickRedirect, true, 22529, new Class[]{BottomBindPhoneDialogFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        bottomBindPhoneDialogFragment.v4();
    }

    public static final /* synthetic */ void h4(BottomBindPhoneDialogFragment bottomBindPhoneDialogFragment, boolean z10, TextView textView) {
        if (PatchProxy.proxy(new Object[]{bottomBindPhoneDialogFragment, new Byte(z10 ? (byte) 1 : (byte) 0), textView}, null, changeQuickRedirect, true, 22530, new Class[]{BottomBindPhoneDialogFragment.class, Boolean.TYPE, TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        bottomBindPhoneDialogFragment.w4(z10, textView);
    }

    public static final /* synthetic */ void o4(BottomBindPhoneDialogFragment bottomBindPhoneDialogFragment) {
        if (PatchProxy.proxy(new Object[]{bottomBindPhoneDialogFragment}, null, changeQuickRedirect, true, 22535, new Class[]{BottomBindPhoneDialogFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        bottomBindPhoneDialogFragment.x4();
    }

    @SuppressLint({"AutoDispose"})
    private final void p4(String str) {
        EditText editText;
        Editable text;
        String string;
        String string2;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 22523, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        e30 e30Var = this.f77536k;
        if (e30Var != null && (editText = e30Var.f110006d) != null && (text = editText.getText()) != null && (string = text.toString()) != null && (string2 = StringsKt__StringsKt.F5(string).toString()) != null) {
            addDisposable((b) com.max.xiaoheihe.network.i.a().x2(com.max.xiaoheihe.utils.w.a(str), com.max.xiaoheihe.utils.w.a(string2), this.f77542q).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
            return;
        }
        com.max.heybox.hblog.g.f74531b.v("[BottomSheetsBindPhone-dbg][bindPhone] pwd is null!");
        com.max.hbutils.utils.c.f("绑定失败");
        u4();
    }

    private final boolean q4(e30 e30Var) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{e30Var}, this, changeQuickRedirect, false, 22517, new Class[]{e30.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (com.max.hbcommon.utils.c.k(e30Var.f110008f, getString(R.string.phonenum_empty_msg)) || com.max.hbcommon.utils.c.k(e30Var.f110009g, getString(R.string.verification_code_empty)) || com.max.hbcommon.utils.c.k(e30Var.f110006d, getString(R.string.pwd_empty_msg)) || com.max.hbcommon.utils.c.k(e30Var.f110007e, getString(R.string.confirm_pwd_empty_msg))) {
            return false;
        }
        if (e30Var.f110006d.length() < 6) {
            com.max.hbutils.utils.c.f(getString(R.string.pwd_min_msg));
            return false;
        }
        if (e30Var.f110007e.length() < 6) {
            com.max.hbutils.utils.c.f(getString(R.string.confirm_pwd_min_msg));
            return false;
        }
        if (e30Var.f110006d.length() > 20) {
            com.max.hbutils.utils.c.f(getString(R.string.pwd_max_msg));
            return false;
        }
        if (!kotlin.jvm.internal.f0.g(e30Var.f110006d.getText().toString(), e30Var.f110007e.getText().toString())) {
            com.max.hbutils.utils.c.f(getString(R.string.diff_pwd_msg));
            return false;
        }
        if (!com.max.hbcommon.utils.c.G(StringsKt__StringsKt.F5(e30Var.f110006d.getText().toString()).toString())) {
            return true;
        }
        com.max.hbutils.utils.c.f(getString(R.string.pwd_simple_msg));
        return false;
    }

    private final void r4() {
        EditText editText;
        Editable text;
        String string;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22522, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        e30 e30Var = this.f77536k;
        String str = this.f77537l + ((e30Var == null || (editText = e30Var.f110008f) == null || (text = editText.getText()) == null || (string = text.toString()) == null) ? null : StringsKt__StringsKt.F5(string).toString());
        com.max.xiaoheihe.utils.a.a(this, getCompositeDisposable(), null, str, new c(str));
    }

    @SuppressLint({"AutoDispose"})
    private final void s4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 22519, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        Log.d(f77533x, "[getPhoneCode]\nphone: " + str + "\nareaCode: " + this.f77537l);
        com.max.xiaoheihe.network.e eVarA = com.max.xiaoheihe.network.i.a();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f77537l);
        sb2.append(str);
        addDisposable((io.reactivex.disposables.b) eVarA.ba(com.max.xiaoheihe.utils.w.a(sb2.toString())).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d()));
    }

    @SuppressLint({"AutoDispose"})
    private final void t4(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 22521, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().T1(com.max.xiaoheihe.utils.w.a(this.f77537l + str), str2).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e()));
    }

    private final void u4() {
        LoadingDialog loadingDialog;
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22527, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity != null && activity.isFinishing()) {
            return;
        }
        LoadingDialog loadingDialog2 = this.f77535j;
        if (loadingDialog2 != null && loadingDialog2.i()) {
            z10 = true;
        }
        if (!z10 || (loadingDialog = this.f77535j) == null) {
            return;
        }
        loadingDialog.c();
    }

    private final void v4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22520, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Timer timer = this.f77538m;
        if (timer != null) {
            timer.cancel();
        }
        this.f77538m = new Timer(true);
        this.f77540o = 60;
        e30 e30Var = this.f77536k;
        final WeakReference weakReference = new WeakReference(e30Var != null ? e30Var.f110017o : null);
        TimerTask timerTask = new TimerTask() { // from class: com.max.xiaoheihe.module.account.BottomBindPhoneDialogFragment$onGetCodeClick$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                final TextView textView;
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22548, new Class[0], Void.TYPE).isSupported || !this.f77561b.isActive() || (textView = weakReference.get()) == null) {
                    return;
                }
                final BottomBindPhoneDialogFragment bottomBindPhoneDialogFragment = this.f77561b;
                AccelWorkCoroutinesKt.a(bottomBindPhoneDialogFragment, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.account.BottomBindPhoneDialogFragment$onGetCodeClick$1$run$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.a
                    public /* bridge */ /* synthetic */ b2 invoke() {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22550, new Class[0], Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        invoke2();
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22549, new Class[0], Void.TYPE).isSupported) {
                            return;
                        }
                        if (bottomBindPhoneDialogFragment.f77540o <= 1) {
                            TimerTask timerTask2 = bottomBindPhoneDialogFragment.f77539n;
                            if (timerTask2 != null) {
                                timerTask2.cancel();
                            }
                            textView.setText(bottomBindPhoneDialogFragment.getString(R.string.resend));
                            BottomBindPhoneDialogFragment.h4(bottomBindPhoneDialogFragment, true, textView);
                            return;
                        }
                        TextView textView2 = textView;
                        StringBuilder sb2 = new StringBuilder();
                        BottomBindPhoneDialogFragment bottomBindPhoneDialogFragment2 = bottomBindPhoneDialogFragment;
                        bottomBindPhoneDialogFragment2.f77540o--;
                        sb2.append(bottomBindPhoneDialogFragment2.f77540o);
                        sb2.append('s');
                        textView2.setText(sb2.toString());
                        BottomBindPhoneDialogFragment.h4(bottomBindPhoneDialogFragment, false, textView);
                    }
                });
            }
        };
        this.f77539n = timerTask;
        Timer timer2 = this.f77538m;
        if (timer2 != null) {
            timer2.schedule(timerTask, 1000L, 1000L);
        }
    }

    private final void w4(boolean z10, TextView textView) {
        Context context;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), textView}, this, changeQuickRedirect, false, 22518, new Class[]{Boolean.TYPE, TextView.class}, Void.TYPE).isSupported || (context = getContext()) == null) {
            return;
        }
        if (z10) {
            textView.setEnabled(true);
            textView.setTextColor(context.getColor(R.color.text_primary_1_color));
            textView.setBackground(com.max.hbutils.utils.q.M(com.max.hbutils.utils.q.o(context, R.color.transparent, 3.0f), context, R.color.text_primary_1_color, 1.0f));
        } else {
            textView.setEnabled(false);
            textView.setTextColor(context.getColor(R.color.text_secondary_2_color));
            textView.setBackground(com.max.hbutils.utils.q.M(com.max.hbutils.utils.q.o(context, R.color.transparent, 3.0f), context, R.color.text_secondary_2_color, 1.0f));
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0039  */
    private final void x4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22526, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity != null && activity.isFinishing()) {
            return;
        }
        LoadingDialog loadingDialog = this.f77535j;
        if (loadingDialog == null) {
            Context contextRequireContext = requireContext();
            kotlin.jvm.internal.f0.o(contextRequireContext, "requireContext()");
            this.f77535j = new LoadingDialog(contextRequireContext, "绑定中", false);
        } else {
            if ((loadingDialog == null || loadingDialog.i()) ? false : true) {
                Context contextRequireContext2 = requireContext();
                kotlin.jvm.internal.f0.o(contextRequireContext2, "requireContext()");
                this.f77535j = new LoadingDialog(contextRequireContext2, "绑定中", false);
            }
        }
        LoadingDialog loadingDialog2 = this.f77535j;
        if (loadingDialog2 != null) {
            loadingDialog2.r();
        }
    }

    @Override // com.max.hbcommon.base.c, androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onCreate(@dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 22514, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f77541p = arguments != null ? arguments.getString(f77534y) : null;
    }

    @Override // androidx.fragment.app.Fragment
    @dl.e
    public View onCreateView(@dl.d LayoutInflater inflater, @dl.e ViewGroup viewGroup, @dl.e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inflater, viewGroup, bundle}, this, changeQuickRedirect, false, 22515, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(inflater, "inflater");
        return inflater.inflate(R.layout.layout_bottom_sheets_bind_phone, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22528, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        TimerTask timerTask = this.f77539n;
        if (timerTask != null) {
            timerTask.cancel();
        }
        Timer timer = this.f77538m;
        if (timer != null) {
            timer.cancel();
        }
        u4();
    }

    @Override // androidx.fragment.app.j, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@dl.d DialogInterface dialog) {
        Object objB;
        if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 22525, new Class[]{DialogInterface.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(dialog, "dialog");
        super.onDismiss(dialog);
        try {
            kotlin.Result.a aVar = kotlin.Result.f124476c;
            b2 b2Var = null;
            if (this.f77545t) {
                yh.a<b2> aVar2 = this.f77543r;
                if (aVar2 != null) {
                    aVar2.invoke();
                    b2Var = b2.f124493a;
                }
            } else {
                yh.a<b2> aVar3 = this.f77544s;
                if (aVar3 != null) {
                    aVar3.invoke();
                    b2Var = b2.f124493a;
                }
            }
            objB = kotlin.Result.b(b2Var);
        } catch (Throwable th2) {
            kotlin.Result.a aVar4 = kotlin.Result.f124476c;
            objB = kotlin.Result.b(kotlin.t0.a(th2));
        }
        Throwable thE = kotlin.Result.e(objB);
        if (thE != null) {
            com.max.heybox.hblog.g.f74531b.v("[BottomSheetsBindPhone-dbg][onDismiss] error: " + thE);
        }
    }

    @Override // com.max.hbcommon.base.c, androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22524, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setSoftInputMode(32);
    }

    @Override // com.max.hbcommon.base.swipeback.a, com.max.hbcommon.base.c, androidx.fragment.app.Fragment
    public void onViewCreated(@dl.d View view, @dl.e Bundle bundle) {
        Context context;
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 22516, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(view, "view");
        super.onViewCreated(view, bundle);
        view.setOnClickListener(new f());
        e30 e30VarA = e30.a(view);
        this.f77536k = e30VarA;
        if (e30VarA == null || (context = getContext()) == null) {
            return;
        }
        float f10 = ViewUtils.f(getContext(), 12.0f);
        e30VarA.f110005c.setOnClickListener(null);
        e30VarA.f110005c.setBackground(com.max.hbutils.utils.q.E(getContext(), R.color.background_layer_2_color, f10));
        ImageView ivIcon = e30VarA.f110013k;
        kotlin.jvm.internal.f0.o(ivIcon, "ivIcon");
        ivIcon.setVisibility(0);
        e30VarA.f110013k.setImageResource(R.drawable.bottom_sheets_broken_bind_phone_num_80x80);
        ImageView ivSmallIcon = e30VarA.f110014l;
        kotlin.jvm.internal.f0.o(ivSmallIcon, "ivSmallIcon");
        ivSmallIcon.setVisibility(0);
        e30VarA.f110014l.setImageResource(R.drawable.bottom_sheets_key_bind_phone_num_28x28);
        BottomButtonLeftItemView bottomButton = e30VarA.f110004b;
        kotlin.jvm.internal.f0.o(bottomButton, "bottomButton");
        bottomButton.setVisibility(0);
        BottomButtonLeftItemView bottomButtonLeftItemView = e30VarA.f110004b;
        Drawable drawableI = ViewUtils.i(5, context.getColor(R.color.black_start), context.getColor(R.color.black_end));
        kotlin.jvm.internal.f0.o(drawableI, "getBL2TRGradientRoundedR…ck_end)\n                )");
        bottomButtonLeftItemView.setRightBackground(drawableI);
        e30VarA.f110004b.setRightClickListener(new g(e30VarA, e30VarA));
        e30VarA.f110004b.setRightText(context.getString(R.string.complete));
        e30VarA.f110004b.setShowLeftButton(false);
        Typeface typefaceA = com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c);
        e30VarA.f110020r.setTypeface(typefaceA);
        e30VarA.f110019q.setTypeface(typefaceA);
        e30VarA.f110018p.setTypeface(typefaceA);
        e30VarA.f110016n.setTypeface(typefaceA);
        e30VarA.f110021s.setTypeface(typefaceA);
        String str = this.f77541p;
        if (!(str == null || kotlin.text.u.V1(str))) {
            e30VarA.f110020r.setText(this.f77541p);
        }
        TextView tvGetCode = e30VarA.f110017o;
        kotlin.jvm.internal.f0.o(tvGetCode, "tvGetCode");
        w4(true, tvGetCode);
        e30VarA.f110017o.setOnClickListener(new h(e30VarA));
        e30VarA.f110015m.setText(this.f77537l);
        e30VarA.f110022t.setOnClickListener(new i(context));
    }
}
