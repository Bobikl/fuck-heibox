package com.max.xiaoheihe.module.account;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.b1;
import androidx.lifecycle.y0;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.account.PushStateGroupObj;
import com.max.xiaoheihe.bean.account.PushStateGroupWrapperObjV4;
import com.max.xiaoheihe.bean.account.PushStateObj;
import com.max.xiaoheihe.module.account.component.SettingItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.jb;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: compiled from: SetPushStateDetailFragment.kt */
/* JADX INFO: loaded from: classes9.dex */
@kotlin.jvm.internal.t0({"SMAP\nSetPushStateDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SetPushStateDetailFragment.kt\ncom/max/xiaoheihe/module/account/SetPushStateDetailFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,174:1\n172#2,9:175\n*S KotlinDebug\n*F\n+ 1 SetPushStateDetailFragment.kt\ncom/max/xiaoheihe/module/account/SetPushStateDetailFragment\n*L\n39#1:175,9\n*E\n"})
@androidx.compose.runtime.internal.o(parameters = 0)
public final class SetPushStateDetailFragment extends com.max.hbcommon.base.d implements View.OnTouchListener {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    public static final a f78316h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f78317i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    public static final String f78318j = "group_index";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    public static final String f78319k = "siv_index";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f78320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f78321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private String f78322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private ArrayList<PushStateObj> f78323e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final kotlin.z f78324f = kotlin.b0.c(new yh.a<List<? extends PushStateObj>>() { // from class: com.max.xiaoheihe.module.account.SetPushStateDetailFragment$filteredPushSettingStateList$2
        public static ChangeQuickRedirect changeQuickRedirect;

        {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List<? extends com.max.xiaoheihe.bean.account.PushStateObj>] */
        @Override // yh.a
        public /* bridge */ /* synthetic */ List<? extends PushStateObj> invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24060, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
        }

        @Override // yh.a
        @dl.d
        public final List<? extends PushStateObj> invoke() {
            List<? extends PushStateObj> listN2;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24059, new Class[0], List.class);
            if (patchProxyResultProxy.isSupported) {
                return (List) patchProxyResultProxy.result;
            }
            ArrayList arrayList = this.f78339b.f78323e;
            return (arrayList == null || (listN2 = CollectionsKt___CollectionsKt.n2(arrayList)) == null) ? new ArrayList() : listN2;
        }
    });

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final kotlin.z f78325g;

    /* JADX INFO: compiled from: SetPushStateDetailFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        @xh.m
        public final SetPushStateDetailFragment a(int i10, int i11) {
            Object[] objArr = {new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 24058, new Class[]{cls, cls}, SetPushStateDetailFragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (SetPushStateDetailFragment) patchProxyResultProxy.result;
            }
            SetPushStateDetailFragment setPushStateDetailFragment = new SetPushStateDetailFragment();
            Bundle bundle = new Bundle();
            bundle.putInt(SetPushStateDetailFragment.f78318j, i10);
            bundle.putInt(SetPushStateDetailFragment.f78319k, i11);
            setPushStateDetailFragment.setArguments(bundle);
            return setPushStateDetailFragment;
        }
    }

    /* JADX INFO: compiled from: SetPushStateDetailFragment.kt */
    public static final class b extends com.max.hbcommon.base.adapter.s<PushStateObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f78326b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SetPushStateDetailFragment f78327c;

        /* JADX INFO: compiled from: SetPushStateDetailFragment.kt */
        public static final class a implements CompoundButton.OnCheckedChangeListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ SetPushStateDetailFragment f78328b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Context f78329c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ PushStateObj f78330d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f78331e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ SettingItemView f78332f;

            a(SetPushStateDetailFragment setPushStateDetailFragment, Context context, PushStateObj pushStateObj, String str, SettingItemView settingItemView) {
                this.f78328b = setPushStateDetailFragment;
                this.f78329c = context;
                this.f78330d = pushStateObj;
                this.f78331e = str;
                this.f78332f = settingItemView;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                if (PatchProxy.proxy(new Object[]{compoundButton, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 24063, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                SetPushStateDetailFragment setPushStateDetailFragment = this.f78328b;
                Context contextNonNull = this.f78329c;
                kotlin.jvm.internal.f0.o(contextNonNull, "contextNonNull");
                PushStateObj pushStateObj = this.f78330d;
                String str = this.f78331e;
                String str2 = z10 ? "1" : "0";
                SettingItemView siv = this.f78332f;
                kotlin.jvm.internal.f0.o(siv, "siv");
                setPushStateDetailFragment.P3(contextNonNull, pushStateObj, str, str2, siv);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, SetPushStateDetailFragment setPushStateDetailFragment, List<? extends PushStateObj> list) {
            super(context, list, R.layout.item_push_state);
            this.f78326b = context;
            this.f78327c = setPushStateDetailFragment;
        }

        public void m(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.e PushStateObj pushStateObj) {
            if (PatchProxy.proxy(new Object[]{viewHolder, pushStateObj}, this, changeQuickRedirect, false, 24061, new Class[]{com.max.hbcommon.base.adapter.s.e.class, PushStateObj.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
            if (pushStateObj == null) {
                com.max.heybox.hblog.g.f74531b.v("[SetPushStateDetailFragment] onBindViewHolder data param is invalid");
                return;
            }
            String push_state = pushStateObj.getPush_state();
            String push_type = pushStateObj.getPush_type();
            SettingItemView settingItemView = (SettingItemView) viewHolder.i(R.id.siv);
            settingItemView.setTitle(pushStateObj.getPush_type_desc());
            settingItemView.setChecked(kotlin.jvm.internal.f0.g("1", push_state), false);
            settingItemView.setOnCheckedChangeListener(new a(this.f78327c, this.f78326b, pushStateObj, push_type, settingItemView));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, PushStateObj pushStateObj) {
            if (PatchProxy.proxy(new Object[]{eVar, pushStateObj}, this, changeQuickRedirect, false, 24062, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, pushStateObj);
        }
    }

    /* JADX INFO: compiled from: SetPushStateDetailFragment.kt */
    public static final class c extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SettingItemView f78334c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ PushStateObj f78335d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f78336e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Context f78337f;

        /* JADX INFO: compiled from: SetPushStateDetailFragment.kt */
        public static final class a implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f78338b = new a();
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 24073, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                dialogInterface.dismiss();
            }
        }

        c(SettingItemView settingItemView, PushStateObj pushStateObj, String str, Context context) {
            this.f78334c = settingItemView;
            this.f78335d = pushStateObj;
            this.f78336e = str;
            this.f78337f = context;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 24070, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (SetPushStateDetailFragment.this.isActive()) {
                super.onError(e10);
                SettingItemView settingItemView = this.f78334c;
                settingItemView.setChecked(settingItemView.c(), false);
            }
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 24071, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (SetPushStateDetailFragment.this.isActive()) {
                super.onNext(result);
                this.f78335d.setPush_state(this.f78336e);
                String str = result.getKeyMap().get("notify_msg");
                if (com.max.hbcommon.utils.c.u(str)) {
                    com.max.heybox.hblog.g.f74531b.v("[SetPushStateDetailFragment][setPushState] invalid notifyMsg: " + str);
                    return;
                }
                Context context = this.f78337f;
                if (!(context instanceof Activity) || ((Activity) context).isFinishing()) {
                    return;
                }
                new com.max.hbcommon.view.a.f(this.f78337f).y("订阅成功").l(str).u("我知道了", a.f78338b).g(false).F();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 24072, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    public SetPushStateDetailFragment() {
        final yh.a aVar = null;
        this.f78325g = FragmentViewModelLazyKt.h(this, kotlin.jvm.internal.n0.d(m0.class), new yh.a<b1>() { // from class: com.max.xiaoheihe.module.account.SetPushStateDetailFragment$special$$inlined$activityViewModels$default$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // yh.a
            @dl.d
            public final b1 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24064, new Class[0], b1.class);
                if (patchProxyResultProxy.isSupported) {
                    return (b1) patchProxyResultProxy.result;
                }
                b1 viewModelStore = this.requireActivity().getViewModelStore();
                kotlin.jvm.internal.f0.o(viewModelStore, "requireActivity().viewModelStore");
                return viewModelStore;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.b1, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b1 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24065, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }
        }, new yh.a<u2.a>() { // from class: com.max.xiaoheihe.module.account.SetPushStateDetailFragment$special$$inlined$activityViewModels$default$2
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, u2.a] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ u2.a invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24067, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }

            @Override // yh.a
            @dl.d
            public final u2.a invoke() {
                u2.a aVar2;
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24066, new Class[0], u2.a.class);
                if (patchProxyResultProxy.isSupported) {
                    return (u2.a) patchProxyResultProxy.result;
                }
                yh.a aVar3 = aVar;
                if (aVar3 != null && (aVar2 = (u2.a) aVar3.invoke()) != null) {
                    return aVar2;
                }
                u2.a defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                kotlin.jvm.internal.f0.o(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new yh.a<y0.b>() { // from class: com.max.xiaoheihe.module.account.SetPushStateDetailFragment$special$$inlined$activityViewModels$default$3
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // yh.a
            @dl.d
            public final y0.b invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24068, new Class[0], y0.b.class);
                if (patchProxyResultProxy.isSupported) {
                    return (y0.b) patchProxyResultProxy.result;
                }
                y0.b defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                kotlin.jvm.internal.f0.o(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.y0$b, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ y0.b invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24069, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }
        });
    }

    private final List<PushStateObj> M3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24050, new Class[0], List.class);
        return patchProxyResultProxy.isSupported ? (List) patchProxyResultProxy.result : (List) this.f78324f.getValue();
    }

    private final m0 N3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24051, new Class[0], m0.class);
        return patchProxyResultProxy.isSupported ? (m0) patchProxyResultProxy.result : (m0) this.f78325g.getValue();
    }

    @dl.d
    @xh.m
    public static final SetPushStateDetailFragment O3(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 24057, new Class[]{cls, cls}, SetPushStateDetailFragment.class);
        return patchProxyResultProxy.isSupported ? (SetPushStateDetailFragment) patchProxyResultProxy.result : f78316h.a(i10, i11);
    }

    @SuppressLint({"AutoDispose"})
    public final void P3(@dl.d Context context, @dl.d PushStateObj data, @dl.e String str, @dl.e String str2, @dl.d SettingItemView siv) {
        if (PatchProxy.proxy(new Object[]{context, data, str, str2, siv}, this, changeQuickRedirect, false, 24054, new Class[]{Context.class, PushStateObj.class, String.class, String.class, SettingItemView.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(data, "data");
        kotlin.jvm.internal.f0.p(siv, "siv");
        if (!kotlin.jvm.internal.f0.g(str, data.getPush_type()) || kotlin.jvm.internal.f0.g(str2, data.getPush_state())) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().l2(str, str2).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c(siv, data, str2, context)));
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onCreate(@dl.e Bundle bundle) {
        ArrayList<ArrayList<PushStateGroupObj>> groups;
        ArrayList<PushStateGroupObj> arrayList;
        List listN2;
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 24052, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f78320b = arguments.getInt(f78318j);
            this.f78321c = arguments.getInt(f78319k);
        }
        PushStateGroupWrapperObjV4 pushStateGroupWrapperObjV4F = N3().g().f();
        if (pushStateGroupWrapperObjV4F == null || (groups = pushStateGroupWrapperObjV4F.getGroups()) == null) {
            return;
        }
        if (!(this.f78320b < groups.size())) {
            groups = null;
        }
        if (groups == null || (arrayList = groups.get(this.f78320b)) == null) {
            return;
        }
        ArrayList<PushStateGroupObj> arrayList2 = this.f78321c < arrayList.size() ? arrayList : null;
        if (arrayList2 == null || (listN2 = CollectionsKt___CollectionsKt.n2(arrayList2)) == null) {
            return;
        }
        this.f78322d = ((PushStateGroupObj) listN2.get(this.f78321c)).getGroup_name();
        this.f78323e = ((PushStateGroupObj) listN2.get(this.f78321c)).getItems();
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    @dl.d
    @SuppressLint({"ClickableViewAccessibility"})
    public View onCreateView(@dl.d LayoutInflater inflater, @dl.e ViewGroup viewGroup, @dl.e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inflater, viewGroup, bundle}, this, changeQuickRedirect, false, 24053, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(inflater, "inflater");
        jb jbVarC = jb.c(inflater);
        kotlin.jvm.internal.f0.o(jbVarC, "inflate(inflater)");
        Context context = getContext();
        if (context != null) {
            jbVarC.f112118b.setAdapter(new b(context, this, M3()));
        }
        jbVarC.b().setOnTouchListener(this);
        this.mViewAvailable = true;
        FrameLayout frameLayoutB = jbVarC.b();
        kotlin.jvm.internal.f0.o(frameLayoutB, "binding.root");
        return frameLayoutB;
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24055, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        String str = this.f78322d;
        if (str != null) {
            N3().k(str);
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(@dl.e View view, @dl.e MotionEvent motionEvent) {
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    @dl.d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24056, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "SetPushStateDetailFragment(groupIndex=" + this.f78320b + ", pageTitle=" + this.f78322d + ')';
    }
}
