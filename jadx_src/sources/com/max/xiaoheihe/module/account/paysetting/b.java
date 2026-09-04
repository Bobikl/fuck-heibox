package com.max.xiaoheihe.module.account.paysetting;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.compose.runtime.internal.o;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.h0;
import androidx.core.view.j1;
import androidx.core.view.n3;
import androidx.core.view.z0;
import androidx.fragment.app.FragmentActivity;
import com.max.hbcommon.network.ApiException;
import com.max.hbcustomview.PinEntryEditText;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.n;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.network.i;
import com.max.xiaoheihe.utils.w;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.d30;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import kotlin.k;

/* JADX INFO: compiled from: InputPayPwdBottomSheet.kt */
/* JADX INFO: loaded from: classes9.dex */
@o(parameters = 0)
public final class b extends com.max.hbcommon.base.swipeback.a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    public static final a f79152o = new a(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f79153p = 8;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    private static final String f79154q = "ARG_DIALOG_TITLE";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    private static final String f79155r = "ARG_DIALOG_PRICE";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f79156s = 19;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.e
    private qb.b.a f79157j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private d30 f79158k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f79159l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.e
    private Animation f79160m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f79161n;

    /* JADX INFO: compiled from: InputPayPwdBottomSheet.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final String a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25202, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : b.f79155r;
        }

        @dl.d
        public final String b() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25201, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : b.f79154q;
        }

        public final int c() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25203, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : b.f79156s;
        }

        @dl.d
        public final b d(@dl.e String str, @dl.e String str2, @dl.e qb.b.a aVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, aVar}, this, changeQuickRedirect, false, 25204, new Class[]{String.class, String.class, qb.b.a.class}, b.class);
            if (patchProxyResultProxy.isSupported) {
                return (b) patchProxyResultProxy.result;
            }
            b bVar = new b();
            bVar.f79157j = aVar;
            Bundle bundle = new Bundle();
            bundle.putString(b(), str);
            bundle.putString(a(), str2);
            bVar.setArguments(bundle);
            return bVar;
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.account.paysetting.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: InputPayPwdBottomSheet.kt */
    public static final class ViewOnClickListenerC0659b implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final ViewOnClickListenerC0659b f79162b = new ViewOnClickListenerC0659b();
        public static ChangeQuickRedirect changeQuickRedirect;

        ViewOnClickListenerC0659b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
        }
    }

    /* JADX INFO: compiled from: InputPayPwdBottomSheet.kt */
    @t0({"SMAP\nInputPayPwdBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputPayPwdBottomSheet.kt\ncom/max/xiaoheihe/module/account/paysetting/InputPayPwdBottomSheet$onViewCreated$2\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,215:1\n162#2,8:216\n*S KotlinDebug\n*F\n+ 1 InputPayPwdBottomSheet.kt\ncom/max/xiaoheihe/module/account/paysetting/InputPayPwdBottomSheet$onViewCreated$2\n*L\n102#1:216,8\n*E\n"})
    public static final class c implements z0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // androidx.core.view.z0
        @dl.d
        public final n3 a(@dl.d View v10, @dl.d n3 windowInsets) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{v10, windowInsets}, this, changeQuickRedirect, false, 25205, new Class[]{View.class, n3.class}, n3.class);
            if (patchProxyResultProxy.isSupported) {
                return (n3) patchProxyResultProxy.result;
            }
            f0.p(v10, "v");
            f0.p(windowInsets, "windowInsets");
            h0 h0VarF = windowInsets.f(n3.m.d());
            f0.o(h0VarF, "windowInsets.getInsets(W…wInsetsCompat.Type.ime())");
            h0 h0VarF2 = windowInsets.f(n3.m.i());
            f0.o(h0VarF2, "windowInsets.getInsets(W…Compat.Type.systemBars())");
            com.max.hbcommon.utils.d.b("zzzzpaddding", "imeInsets.bottom =" + h0VarF.f20745d + "   systemBarInsets " + h0VarF2.f20745d);
            int i10 = h0VarF.f20745d - h0VarF2.f20745d;
            if (i10 <= 0) {
                if (System.currentTimeMillis() - b.this.f79161n > 1000 && b.this.isActive()) {
                    b.this.dismiss();
                }
                return n3.L(v10.onApplyWindowInsets(windowInsets.J()), v10);
            }
            if (!b.this.isActive()) {
                return windowInsets;
            }
            d30 d30Var = b.this.f79158k;
            if (d30Var == null) {
                f0.S("binding");
                d30Var = null;
            }
            ConstraintLayout constraintLayout = d30Var.f109599b;
            f0.o(constraintLayout, "binding.clContent");
            constraintLayout.setPadding(constraintLayout.getPaddingLeft(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingRight(), i10);
            return windowInsets;
        }
    }

    /* JADX INFO: compiled from: InputPayPwdBottomSheet.kt */
    public static final class d implements PinEntryEditText.i {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.hbcustomview.PinEntryEditText.i
        public final void a(CharSequence charSequence) {
            if (PatchProxy.proxy(new Object[]{charSequence}, this, changeQuickRedirect, false, 25206, new Class[]{CharSequence.class}, Void.TYPE).isSupported) {
                return;
            }
            b.d4(b.this, charSequence.toString());
        }
    }

    /* JADX INFO: compiled from: InputPayPwdBottomSheet.kt */
    public static final class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 25207, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            b.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: InputPayPwdBottomSheet.kt */
    public static final class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 25208, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.g(b.this, lb.d.f131237q4).C(b.f79152o.c()).A();
        }
    }

    /* JADX INFO: compiled from: InputPayPwdBottomSheet.kt */
    public static final class g implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25209, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            FragmentActivity activity = b.this.getActivity();
            d30 d30Var = b.this.f79158k;
            if (d30Var == null) {
                f0.S("binding");
                d30Var = null;
            }
            com.max.xiaoheihe.utils.d.C1(activity, d30Var.f109601d);
        }
    }

    /* JADX INFO: compiled from: InputPayPwdBottomSheet.kt */
    public static final class h extends com.max.hbcommon.network.d<Result<Object>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 25210, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (b.this.isActive()) {
                if (!(e10 instanceof ApiException) || com.max.hbcommon.utils.c.u(e10.getMessage())) {
                    super.onError(e10);
                    return;
                }
                d30 d30Var = b.this.f79158k;
                d30 d30Var2 = null;
                if (d30Var == null) {
                    f0.S("binding");
                    d30Var = null;
                }
                d30Var.f109603f.setVisibility(0);
                d30 d30Var3 = b.this.f79158k;
                if (d30Var3 == null) {
                    f0.S("binding");
                    d30Var3 = null;
                }
                d30Var3.f109603f.setText(e10.getMessage());
                d30 d30Var4 = b.this.f79158k;
                if (d30Var4 == null) {
                    f0.S("binding");
                    d30Var4 = null;
                }
                d30Var4.f109603f.startAnimation(b.this.f79160m);
                d30 d30Var5 = b.this.f79158k;
                if (d30Var5 == null) {
                    f0.S("binding");
                } else {
                    d30Var2 = d30Var5;
                }
                d30Var2.f109601d.setText("");
            }
        }

        public void onNext(@dl.d Result<Object> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 25211, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (b.this.isActive()) {
                b.this.f79159l = true;
                b.this.dismiss();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 25212, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<Object>) obj);
        }
    }

    public static final /* synthetic */ void d4(b bVar, String str) {
        if (PatchProxy.proxy(new Object[]{bVar, str}, null, changeQuickRedirect, true, 25200, new Class[]{b.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        bVar.f4(str);
    }

    private final String e4(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 25197, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return !com.max.hbcommon.utils.c.u(str) ? n.f("##0.00").format(n.r(str) / 1000.0d) : str;
    }

    private final void f4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 25198, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) i.a().p3(w.a(str)).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new h()));
    }

    @Override // com.max.hbcommon.base.swipeback.a, com.max.hbcommon.base.c
    public boolean L3() {
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    @k(message = "")
    public void onActivityResult(int i10, int i11, @dl.e Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i11 == -1 && i10 == f79156s) {
            InputPayPwdActivity.a aVar = InputPayPwdActivity.O;
            Context context = getContext();
            f0.m(context);
            startActivity(aVar.b(context));
        }
    }

    @Override // androidx.fragment.app.Fragment
    @dl.e
    public View onCreateView(@dl.d LayoutInflater inflater, @dl.e ViewGroup viewGroup, @dl.e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inflater, viewGroup, bundle}, this, changeQuickRedirect, false, 25195, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(inflater, "inflater");
        return inflater.inflate(R.layout.layout_bottom_fragment_input_pay_pwd, viewGroup, false);
    }

    @Override // androidx.fragment.app.j, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@dl.d DialogInterface dialog) {
        View decorView;
        if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 25199, new Class[]{DialogInterface.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(dialog, "dialog");
        if (this.f79159l) {
            qb.b.a aVar = this.f79157j;
            if (aVar != null) {
                aVar.a();
            }
        } else {
            qb.b.a aVar2 = this.f79157j;
            if (aVar2 != null) {
                aVar2.onCanceled();
            }
        }
        if (Build.VERSION.SDK_INT > 29) {
            d30 d30Var = this.f79158k;
            if (d30Var == null) {
                f0.S("binding");
                d30Var = null;
            }
            decorView = d30Var.b();
        } else {
            FragmentActivity activity = getActivity();
            f0.m(activity);
            decorView = activity.getWindow().getDecorView();
        }
        f0.o(decorView, "if (Build.VERSION.SDK_IN…indow.decorView\n        }");
        j1.a2(decorView, null);
        super.onDismiss(dialog);
    }

    @Override // com.max.hbcommon.base.swipeback.a, com.max.hbcommon.base.c, androidx.fragment.app.Fragment
    public void onViewCreated(@dl.d View view, @dl.e Bundle bundle) {
        View decorView;
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 25196, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "view");
        super.onViewCreated(view, bundle);
        d30 d30VarA = d30.a(view);
        f0.o(d30VarA, "bind(view)");
        this.f79158k = d30VarA;
        setCancelable(false);
        this.f66927e.setEnableGesture(false);
        view.setOnClickListener(ViewOnClickListenerC0659b.f79162b);
        String string = requireArguments().getString(f79154q);
        String string2 = requireArguments().getString(f79155r);
        this.f79161n = System.currentTimeMillis();
        d30 d30Var = null;
        if (Build.VERSION.SDK_INT > 29) {
            d30 d30Var2 = this.f79158k;
            if (d30Var2 == null) {
                f0.S("binding");
                d30Var2 = null;
            }
            decorView = d30Var2.b();
        } else {
            FragmentActivity activity = getActivity();
            f0.m(activity);
            decorView = activity.getWindow().getDecorView();
        }
        f0.o(decorView, "if (Build.VERSION.SDK_IN…indow.decorView\n        }");
        j1.a2(decorView, new c());
        d30 d30Var3 = this.f79158k;
        if (d30Var3 == null) {
            f0.S("binding");
            d30Var3 = null;
        }
        d30Var3.f109605h.setText(string);
        SpannableString spannableString = new SpannableString((char) 65509 + e4(string2));
        Context context = getContext();
        f0.m(context);
        spannableString.setSpan(new AbsoluteSizeSpan(context.getResources().getDimensionPixelSize(R.dimen.text_size_24)), 0, 1, 33);
        d30 d30Var4 = this.f79158k;
        if (d30Var4 == null) {
            f0.S("binding");
            d30Var4 = null;
        }
        d30Var4.f109602e.setText(spannableString);
        d30 d30Var5 = this.f79158k;
        if (d30Var5 == null) {
            f0.S("binding");
            d30Var5 = null;
        }
        d30Var5.f109601d.setOnPinEnteredListener(new d());
        d30 d30Var6 = this.f79158k;
        if (d30Var6 == null) {
            f0.S("binding");
            d30Var6 = null;
        }
        d30Var6.f109600c.setOnClickListener(new e());
        d30 d30Var7 = this.f79158k;
        if (d30Var7 == null) {
            f0.S("binding");
            d30Var7 = null;
        }
        d30Var7.f109604g.setOnClickListener(new f());
        d30 d30Var8 = this.f79158k;
        if (d30Var8 == null) {
            f0.S("binding");
        } else {
            d30Var = d30Var8;
        }
        d30Var.f109601d.postDelayed(new g(), 200L);
        this.f79160m = AnimationUtils.loadAnimation(getContext(), R.anim.translate_view_shake);
    }
}
