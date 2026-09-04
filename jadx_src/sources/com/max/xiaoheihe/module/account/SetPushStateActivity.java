package com.max.xiaoheihe.module.account;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.b1;
import androidx.lifecycle.y0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.account.PushStateGroupObj;
import com.max.xiaoheihe.bean.account.PushStateGroupWrapperObjV4;
import com.max.xiaoheihe.module.account.component.SettingItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.v90;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.b2;

/* JADX INFO: compiled from: SetPushStateActivity.kt */
/* JADX INFO: loaded from: classes9.dex */
@kotlin.jvm.internal.t0({"SMAP\nSetPushStateActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SetPushStateActivity.kt\ncom/max/xiaoheihe/module/account/SetPushStateActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,265:1\n75#2,13:266\n1855#3,2:279\n*S KotlinDebug\n*F\n+ 1 SetPushStateActivity.kt\ncom/max/xiaoheihe/module/account/SetPushStateActivity\n*L\n43#1:266,13\n95#1:279,2\n*E\n"})
@ig.d(path = {lb.d.f131160f4})
@androidx.compose.runtime.internal.o(parameters = 0)
public final class SetPushStateActivity extends BaseActivity {

    @dl.d
    public static final a Q = new a(null);
    public static final int R = 8;
    public static ChangeQuickRedirect changeQuickRedirect;
    private v90 L;
    private boolean M;

    @dl.d
    private final List<List<PushStateGroupObj>> N = new ArrayList();

    @dl.e
    private l0 O;

    @dl.d
    private final kotlin.z P;

    /* JADX INFO: compiled from: SetPushStateActivity.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        @xh.m
        public final Intent a(@dl.e Context context) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 24028, new Class[]{Context.class}, Intent.class);
            return patchProxyResultProxy.isSupported ? (Intent) patchProxyResultProxy.result : new Intent(context, (Class<?>) SetPushStateActivity.class);
        }
    }

    /* JADX INFO: compiled from: SetPushStateActivity.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<PushStateGroupWrapperObjV4>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24030, new Class[0], Void.TYPE).isSupported && SetPushStateActivity.this.isActive()) {
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 24029, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (SetPushStateActivity.this.isActive()) {
                super.onError(e10);
                SetPushStateActivity.W1(SetPushStateActivity.this);
            }
        }

        public void onNext(@dl.d Result<PushStateGroupWrapperObjV4> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 24031, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (SetPushStateActivity.this.isActive()) {
                super.onNext(result);
                SetPushStateActivity.R1(SetPushStateActivity.this).i(result.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 24032, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<PushStateGroupWrapperObjV4>) obj);
        }
    }

    /* JADX INFO: compiled from: SetPushStateActivity.kt */
    public static final class c implements CompoundButton.OnCheckedChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: SetPushStateActivity.kt */
        public static final class a implements View.OnTouchListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f78305b = new a();
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view, motionEvent}, this, changeQuickRedirect, false, 24034, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE);
                if (patchProxyResultProxy.isSupported) {
                    return ((Boolean) patchProxyResultProxy.result).booleanValue();
                }
                if (view != null) {
                    view.performClick();
                }
                return true;
            }
        }

        /* JADX INFO: compiled from: SetPushStateActivity.kt */
        public static final class b implements View.OnTouchListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f78306b = new b();
            public static ChangeQuickRedirect changeQuickRedirect;

            b() {
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view, motionEvent}, this, changeQuickRedirect, false, 24035, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE);
                if (patchProxyResultProxy.isSupported) {
                    return ((Boolean) patchProxyResultProxy.result).booleanValue();
                }
                if (view != null) {
                    view.performClick();
                }
                return false;
            }
        }

        c() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (PatchProxy.proxy(new Object[]{compoundButton, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 24033, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            v90 v90Var = null;
            if (z10) {
                v90 v90Var2 = SetPushStateActivity.this.L;
                if (v90Var2 == null) {
                    kotlin.jvm.internal.f0.S("mBinding");
                    v90Var2 = null;
                }
                v90Var2.f116730d.setVisibility(8);
                v90 v90Var3 = SetPushStateActivity.this.L;
                if (v90Var3 == null) {
                    kotlin.jvm.internal.f0.S("mBinding");
                    v90Var3 = null;
                }
                v90Var3.f116730d.setClickable(false);
                v90 v90Var4 = SetPushStateActivity.this.L;
                if (v90Var4 == null) {
                    kotlin.jvm.internal.f0.S("mBinding");
                    v90Var4 = null;
                }
                v90Var4.f116730d.setFocusable(false);
                v90 v90Var5 = SetPushStateActivity.this.L;
                if (v90Var5 == null) {
                    kotlin.jvm.internal.f0.S("mBinding");
                } else {
                    v90Var = v90Var5;
                }
                v90Var.f116730d.setOnTouchListener(a.f78305b);
            } else {
                v90 v90Var6 = SetPushStateActivity.this.L;
                if (v90Var6 == null) {
                    kotlin.jvm.internal.f0.S("mBinding");
                    v90Var6 = null;
                }
                v90Var6.f116730d.setVisibility(0);
                v90 v90Var7 = SetPushStateActivity.this.L;
                if (v90Var7 == null) {
                    kotlin.jvm.internal.f0.S("mBinding");
                    v90Var7 = null;
                }
                v90Var7.f116730d.setClickable(true);
                v90 v90Var8 = SetPushStateActivity.this.L;
                if (v90Var8 == null) {
                    kotlin.jvm.internal.f0.S("mBinding");
                    v90Var8 = null;
                }
                v90Var8.f116730d.setFocusable(true);
                v90 v90Var9 = SetPushStateActivity.this.L;
                if (v90Var9 == null) {
                    kotlin.jvm.internal.f0.S("mBinding");
                } else {
                    v90Var = v90Var9;
                }
                v90Var.f116730d.setOnTouchListener(b.f78306b);
            }
            if (SetPushStateActivity.this.M) {
                com.max.xiaoheihe.utils.d.B0(((BaseActivity) SetPushStateActivity.this).f66601b);
                SetPushStateActivity.this.M = false;
            }
        }
    }

    /* JADX INFO: compiled from: SetPushStateActivity.kt */
    public static final class d implements View.OnTouchListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f78307b = new d();
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view, motionEvent}, this, changeQuickRedirect, false, 24036, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (view != null) {
                view.performClick();
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: SetPushStateActivity.kt */
    public static final class e implements androidx.lifecycle.j0<PushStateGroupWrapperObjV4> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(PushStateGroupWrapperObjV4 pushStateGroupWrapperObjV4) {
            if (PatchProxy.proxy(new Object[]{pushStateGroupWrapperObjV4}, this, changeQuickRedirect, false, 24040, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(pushStateGroupWrapperObjV4);
        }

        public final void b(PushStateGroupWrapperObjV4 it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 24039, new Class[]{PushStateGroupWrapperObjV4.class}, Void.TYPE).isSupported) {
                return;
            }
            SetPushStateActivity setPushStateActivity = SetPushStateActivity.this;
            kotlin.jvm.internal.f0.o(it, "it");
            SetPushStateActivity.T1(setPushStateActivity, it);
        }
    }

    /* JADX INFO: compiled from: SetPushStateActivity.kt */
    public static final class f implements androidx.lifecycle.j0<String> {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 24042, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(str);
        }

        public final void b(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 24041, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            ((BaseActivity) SetPushStateActivity.this).f66616q.setTitle(str);
        }
    }

    /* JADX INFO: compiled from: SetPushStateActivity.kt */
    @kotlin.jvm.internal.t0({"SMAP\nSetPushStateActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SetPushStateActivity.kt\ncom/max/xiaoheihe/module/account/SetPushStateActivity$initTitle$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,265:1\n800#2,11:266\n*S KotlinDebug\n*F\n+ 1 SetPushStateActivity.kt\ncom/max/xiaoheihe/module/account/SetPushStateActivity$initTitle$2\n*L\n69#1:266,11\n*E\n"})
    public static final class g implements FragmentManager.o {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // androidx.fragment.app.FragmentManager.o
        public /* synthetic */ void a(Fragment fragment, boolean z10) {
            androidx.fragment.app.d0.b(this, fragment, z10);
        }

        @Override // androidx.fragment.app.FragmentManager.o
        public /* synthetic */ void b(Fragment fragment, boolean z10) {
            androidx.fragment.app.d0.a(this, fragment, z10);
        }

        @Override // androidx.fragment.app.FragmentManager.o
        public final void onBackStackChanged() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24043, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            List<Fragment> listJ0 = SetPushStateActivity.this.getSupportFragmentManager().J0();
            kotlin.jvm.internal.f0.o(listJ0, "supportFragmentManager.fragments");
            ArrayList arrayList = new ArrayList();
            for (Object obj : listJ0) {
                if (obj instanceof SetPushStateDetailFragment) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                SetPushStateActivity.R1(SetPushStateActivity.this).k(SetPushStateActivity.this.getString(R.string.set_push_state));
            }
        }
    }

    public SetPushStateActivity() {
        final yh.a aVar = null;
        this.P = new ViewModelLazy(kotlin.jvm.internal.n0.d(m0.class), new yh.a<b1>() { // from class: com.max.xiaoheihe.module.account.SetPushStateActivity$special$$inlined$viewModels$default$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // yh.a
            @dl.d
            public final b1 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24046, new Class[0], b1.class);
                if (patchProxyResultProxy.isSupported) {
                    return (b1) patchProxyResultProxy.result;
                }
                b1 viewModelStore = this.getViewModelStore();
                kotlin.jvm.internal.f0.o(viewModelStore, "viewModelStore");
                return viewModelStore;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.b1, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b1 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24047, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }
        }, new yh.a<y0.b>() { // from class: com.max.xiaoheihe.module.account.SetPushStateActivity$special$$inlined$viewModels$default$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // yh.a
            @dl.d
            public final y0.b invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24044, new Class[0], y0.b.class);
                if (patchProxyResultProxy.isSupported) {
                    return (y0.b) patchProxyResultProxy.result;
                }
                y0.b defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                kotlin.jvm.internal.f0.o(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.y0$b, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ y0.b invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24045, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }
        }, new yh.a<u2.a>() { // from class: com.max.xiaoheihe.module.account.SetPushStateActivity$special$$inlined$viewModels$default$3
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, u2.a] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ u2.a invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24049, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }

            @Override // yh.a
            @dl.d
            public final u2.a invoke() {
                u2.a aVar2;
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24048, new Class[0], u2.a.class);
                if (patchProxyResultProxy.isSupported) {
                    return (u2.a) patchProxyResultProxy.result;
                }
                yh.a aVar3 = aVar;
                if (aVar3 != null && (aVar2 = (u2.a) aVar3.invoke()) != null) {
                    return aVar2;
                }
                u2.a defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                kotlin.jvm.internal.f0.o(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        });
    }

    public static final /* synthetic */ m0 R1(SetPushStateActivity setPushStateActivity) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{setPushStateActivity}, null, changeQuickRedirect, true, 24025, new Class[]{SetPushStateActivity.class}, m0.class);
        return patchProxyResultProxy.isSupported ? (m0) patchProxyResultProxy.result : setPushStateActivity.Z1();
    }

    public static final /* synthetic */ void T1(SetPushStateActivity setPushStateActivity, PushStateGroupWrapperObjV4 pushStateGroupWrapperObjV4) {
        if (PatchProxy.proxy(new Object[]{setPushStateActivity, pushStateGroupWrapperObjV4}, null, changeQuickRedirect, true, 24026, new Class[]{SetPushStateActivity.class, PushStateGroupWrapperObjV4.class}, Void.TYPE).isSupported) {
            return;
        }
        setPushStateActivity.f2(pushStateGroupWrapperObjV4);
    }

    public static final /* synthetic */ void W1(SetPushStateActivity setPushStateActivity) {
        if (PatchProxy.proxy(new Object[]{setPushStateActivity}, null, changeQuickRedirect, true, 24027, new Class[]{SetPushStateActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        setPushStateActivity.C1();
    }

    @dl.d
    @xh.m
    public static final Intent X1(@dl.e Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 24024, new Class[]{Context.class}, Intent.class);
        return patchProxyResultProxy.isSupported ? (Intent) patchProxyResultProxy.result : Q.a(context);
    }

    @SuppressLint({"AutoDispose"})
    private final void Y1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24021, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().d9().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    private final m0 Z1() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24013, new Class[0], m0.class);
        return patchProxyResultProxy.isSupported ? (m0) patchProxyResultProxy.result : (m0) this.P.getValue();
    }

    private final void a2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24019, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        v90 v90Var = this.L;
        v90 v90Var2 = null;
        if (v90Var == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            v90Var = null;
        }
        v90Var.f116731e.setOnCheckedChangeListener(new c());
        if (!com.max.xiaoheihe.utils.d.N0(this.f66601b)) {
            v90 v90Var3 = this.L;
            if (v90Var3 == null) {
                kotlin.jvm.internal.f0.S("mBinding");
                v90Var3 = null;
            }
            v90Var3.f116730d.setVisibility(0);
            v90 v90Var4 = this.L;
            if (v90Var4 == null) {
                kotlin.jvm.internal.f0.S("mBinding");
                v90Var4 = null;
            }
            v90Var4.f116730d.setClickable(true);
            v90 v90Var5 = this.L;
            if (v90Var5 == null) {
                kotlin.jvm.internal.f0.S("mBinding");
                v90Var5 = null;
            }
            v90Var5.f116730d.setFocusable(true);
            v90 v90Var6 = this.L;
            if (v90Var6 == null) {
                kotlin.jvm.internal.f0.S("mBinding");
                v90Var6 = null;
            }
            v90Var6.f116730d.setOnTouchListener(d.f78307b);
        }
        v90 v90Var7 = this.L;
        if (v90Var7 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
        } else {
            v90Var2 = v90Var7;
        }
        v90Var2.f116730d.setBackground(com.max.hbutils.utils.q.o(this, R.color.white_alpha70, 8.0f));
        e2();
    }

    private final void b2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24017, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.O = new l0(this.N, this, new yh.p<Integer, Integer, b2>() { // from class: com.max.xiaoheihe.module.account.SetPushStateActivity$initRV$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(2);
            }

            public final void a(int i10, int i11) {
                Object[] objArr = {new Integer(i10), new Integer(i11)};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                Class cls = Integer.TYPE;
                if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 24037, new Class[]{cls, cls}, Void.TYPE).isSupported) {
                    return;
                }
                SetPushStateDetailFragment setPushStateDetailFragmentA = SetPushStateDetailFragment.f78316h.a(i10, i11);
                androidx.fragment.app.p0 p0VarU = this.f78311b.getSupportFragmentManager().u();
                v90 v90Var = this.f78311b.L;
                if (v90Var == null) {
                    kotlin.jvm.internal.f0.S("mBinding");
                    v90Var = null;
                }
                p0VarU.y(v90Var.f116728b.getId(), setPushStateDetailFragmentA).k("SetPushStateActivity").n();
            }

            /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(Integer num, Integer num2) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{num, num2}, this, changeQuickRedirect, false, 24038, new Class[]{Object.class, Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(num.intValue(), num2.intValue());
                return b2.f124493a;
            }
        });
        v90 v90Var = this.L;
        if (v90Var == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            v90Var = null;
        }
        RecyclerView recyclerView = v90Var.f116729c;
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f66601b));
        recyclerView.setAdapter(this.O);
        Z1().g().k(this, new e());
    }

    private final void c2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24016, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f66616q.setTitle(R.string.set_push_state);
        this.f66616q.setInStack();
        this.f66617r.setVisibility(0);
        Z1().h().k(this, new f());
        getSupportFragmentManager().p(new g());
    }

    private final void e2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24020, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.M = false;
        v90 v90Var = this.L;
        if (v90Var == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            v90Var = null;
        }
        SettingItemView settingItemView = v90Var.f116731e;
        kotlin.jvm.internal.f0.o(settingItemView, "mBinding.vgPushPermission");
        SettingItemView.setChecked$default(settingItemView, com.max.xiaoheihe.utils.d.N0(this.f66601b), false, 2, null);
        this.M = true;
    }

    private final void f2(PushStateGroupWrapperObjV4 pushStateGroupWrapperObjV4) {
        if (PatchProxy.proxy(new Object[]{pushStateGroupWrapperObjV4}, this, changeQuickRedirect, false, 24018, new Class[]{PushStateGroupWrapperObjV4.class}, Void.TYPE).isSupported) {
            return;
        }
        x1();
        this.N.clear();
        ArrayList<ArrayList<PushStateGroupObj>> groups = pushStateGroupWrapperObjV4.getGroups();
        if (groups != null) {
            Iterator<T> it = groups.iterator();
            while (it.hasNext()) {
                this.N.add((ArrayList) it.next());
            }
        }
        l0 l0Var = this.O;
        if (l0Var != null) {
            l0Var.notifyDataSetChanged();
        }
    }

    private final void h2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24015, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        v90 v90VarC = v90.c(getLayoutInflater());
        kotlin.jvm.internal.f0.o(v90VarC, "inflate(layoutInflater)");
        this.L = v90VarC;
        if (v90VarC == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            v90VarC = null;
        }
        RelativeLayout relativeLayoutB = v90VarC.b();
        kotlin.jvm.internal.f0.o(relativeLayoutB, "mBinding.root");
        setContentView(relativeLayoutB);
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24014, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        h2();
        c2();
        a2();
        b2();
        E1();
        Y1();
        setResult(-1);
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void n1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24023, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E1();
        Y1();
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24022, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        e2();
        com.max.xiaoheihe.utils.v.h(this.f66601b);
    }
}
