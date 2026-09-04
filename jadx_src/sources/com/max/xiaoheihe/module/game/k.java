package com.max.xiaoheihe.module.game;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.z4;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: FeedBackFailReasonDialogFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class k extends com.max.hbcommon.base.swipeback.a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    public static final a f87767o = new a(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f87768p = 8;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    public static final String f87769q = "reason_list";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    public static final String f87770r = "bind_steam";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.d
    public static final String f87771s = "epic_add_free";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.d
    public static final String f87772t = "operation_type";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public z4 f87773j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.e
    private String f87774k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f87775l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private final List<String> f87776m = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.e
    private String f87777n = "bind_steam";

    /* JADX INFO: compiled from: FeedBackFailReasonDialogFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        @xh.m
        public final k a(@dl.e ArrayList<String> arrayList, @dl.e String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{arrayList, str}, this, changeQuickRedirect, false, 32437, new Class[]{ArrayList.class, String.class}, k.class);
            if (patchProxyResultProxy.isSupported) {
                return (k) patchProxyResultProxy.result;
            }
            k kVar = new k();
            Bundle bundle = new Bundle();
            if (!com.max.hbcommon.utils.c.w(arrayList)) {
                bundle.putStringArrayList(k.f87769q, arrayList);
                bundle.putString(k.f87772t, str);
            }
            kVar.setArguments(bundle);
            return kVar;
        }
    }

    /* JADX INFO: compiled from: FeedBackFailReasonDialogFragment.kt */
    public static final class b extends com.max.hbcommon.base.adapter.s<String> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: FeedBackFailReasonDialogFragment.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f87780c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ k f87781d;

            a(String str, k kVar) {
                this.f87780c = str;
                this.f87781d = kVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RecyclerView.Adapter adapter;
                RecyclerView.Adapter adapter2;
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32440, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                int iIndexOf = b.this.getDataList().indexOf(this.f87780c);
                if (iIndexOf == b.this.getDataList().size() - 1) {
                    Context context = this.f87781d.getContext();
                    if (context != null) {
                        k kVar = this.f87781d;
                        com.max.xiaoheihe.base.router.b.k0(context, kotlin.jvm.internal.f0.g(kVar.f87777n, "epic_add_free") ? lb.a.C4 : lb.a.B4);
                        kVar.dismiss();
                        return;
                    }
                    return;
                }
                if (kotlin.jvm.internal.f0.g(this.f87781d.f87774k, this.f87780c)) {
                    return;
                }
                String str = this.f87781d.f87774k;
                this.f87781d.f87774k = this.f87780c;
                int iIndexOf2 = b.this.getDataList().indexOf(str);
                if (iIndexOf2 >= 0 && iIndexOf2 < b.this.getDataList().size() && (adapter2 = this.f87781d.Z3().f118198d.getAdapter()) != null) {
                    adapter2.notifyItemChanged(iIndexOf2);
                }
                if (iIndexOf < 0 || iIndexOf >= b.this.getDataList().size() || (adapter = this.f87781d.Z3().f118198d.getAdapter()) == null) {
                    return;
                }
                adapter.notifyItemChanged(iIndexOf);
            }
        }

        b(Context context, List<String> list) {
            super(context, list, R.layout.item_bind_steam_fail_reason);
        }

        public void m(@dl.e com.max.hbcommon.base.adapter.s.e eVar, @dl.e String str) {
            if (PatchProxy.proxy(new Object[]{eVar, str}, this, changeQuickRedirect, false, 32438, new Class[]{com.max.hbcommon.base.adapter.s.e.class, String.class}, Void.TYPE).isSupported || eVar == null) {
                return;
            }
            k kVar = k.this;
            if (str != null) {
                TextView textView = (TextView) eVar.i(R.id.tv_reason);
                textView.setText(str);
                int iO = ViewUtils.o(kVar.getContext(), textView);
                if (kotlin.jvm.internal.f0.g(kVar.f87774k, str)) {
                    textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.background_layer_2_color));
                    textView.setBackground(ViewUtils.i(iO, com.max.xiaoheihe.utils.d.E(R.color.dialog_btn_black_color), com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color)));
                } else {
                    textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_2_color));
                    textView.setBackground(ViewUtils.G(iO, com.max.xiaoheihe.utils.d.E(R.color.divider_secondary_1_color)));
                }
                textView.setOnClickListener(new a(str, kVar));
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, String str) {
            if (PatchProxy.proxy(new Object[]{eVar, str}, this, changeQuickRedirect, false, 32439, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, str);
        }
    }

    /* JADX INFO: compiled from: FeedBackFailReasonDialogFragment.kt */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32441, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            k.f4(k.this, null, 1, null);
            k.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: FeedBackFailReasonDialogFragment.kt */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32442, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (k.this.f87774k == null) {
                com.max.hbutils.utils.c.f("请选择原因");
                return;
            }
            k kVar = k.this;
            k.X3(kVar, kVar.f87774k);
            k.this.dismiss();
        }
    }

    public static final /* synthetic */ void X3(k kVar, String str) {
        if (PatchProxy.proxy(new Object[]{kVar, str}, null, changeQuickRedirect, true, 32436, new Class[]{k.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        kVar.e4(str);
    }

    private final void a4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32429, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Z3().f118201g.setLeftText("没有问题");
        Z3().f118201g.setRightText("提交反馈");
        if (kotlin.jvm.internal.f0.g(this.f87777n, "epic_add_free")) {
            Z3().f118200f.setText(getResources().getString(R.string.epic_add_free_failed));
            Z3().f118196b.setImageResource(R.drawable.bottom_sheets_broken_epic_80x80);
        }
        Z3().f118198d.setLayoutManager(new LinearLayoutManager(getContext()));
        Z3().f118198d.setAdapter(new b(getContext(), this.f87776m));
        Z3().f118201g.setLeftClickListener(new c());
        Z3().f118201g.setRightClickListener(new d());
    }

    @dl.d
    @xh.m
    public static final k b4(@dl.e ArrayList<String> arrayList, @dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{arrayList, str}, null, changeQuickRedirect, true, 32435, new Class[]{ArrayList.class, String.class}, k.class);
        return patchProxyResultProxy.isSupported ? (k) patchProxyResultProxy.result : f87767o.a(arrayList, str);
    }

    private final io.reactivex.z<Result<Object>> c4(com.max.xiaoheihe.network.e eVar, String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{eVar, str, str2}, this, changeQuickRedirect, false, 32433, new Class[]{com.max.xiaoheihe.network.e.class, String.class, String.class}, io.reactivex.z.class);
        if (patchProxyResultProxy.isSupported) {
            return (io.reactivex.z) patchProxyResultProxy.result;
        }
        if (kotlin.jvm.internal.f0.g(str2, "epic_add_free")) {
            if (str == null) {
                str = "没有问题";
            }
            io.reactivex.z<Result<Object>> zVarUb = eVar.ub(str);
            kotlin.jvm.internal.f0.o(zVarUb, "reportEpicAddFreeGamesFa…dReason(reason ?: \"没有问题\")");
            return zVarUb;
        }
        if (str == null) {
            str = "没有问题";
        }
        io.reactivex.z<Result<Object>> zVarD0 = eVar.d0(str);
        kotlin.jvm.internal.f0.o(zVarD0, "reportSteamBindFailedReason(reason ?: \"没有问题\")");
        return zVarD0;
    }

    static /* synthetic */ io.reactivex.z d4(k kVar, com.max.xiaoheihe.network.e eVar, String str, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{kVar, eVar, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, 32434, new Class[]{k.class, com.max.xiaoheihe.network.e.class, String.class, String.class, Integer.TYPE, Object.class}, io.reactivex.z.class);
        if (patchProxyResultProxy.isSupported) {
            return (io.reactivex.z) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = null;
        }
        return kVar.c4(eVar, str, str2);
    }

    private final synchronized void e4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 32431, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (!this.f87775l) {
            this.f87775l = true;
            com.max.xiaoheihe.network.e eVarA = com.max.xiaoheihe.network.i.a();
            kotlin.jvm.internal.f0.o(eVarA, "createHeyBoxService()");
            if (str == null) {
                str = "没有问题";
            }
            addDisposable((io.reactivex.disposables.b) c4(eVarA, str, this.f87777n).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new com.max.hbcommon.network.p()));
        }
    }

    static /* synthetic */ void f4(k kVar, String str, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{kVar, str, new Integer(i10), obj}, null, changeQuickRedirect, true, 32432, new Class[]{k.class, String.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 1) != 0) {
            str = null;
        }
        kVar.e4(str);
    }

    @dl.d
    public final z4 Z3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32425, new Class[0], z4.class);
        if (patchProxyResultProxy.isSupported) {
            return (z4) patchProxyResultProxy.result;
        }
        z4 z4Var = this.f87773j;
        if (z4Var != null) {
            return z4Var;
        }
        kotlin.jvm.internal.f0.S("binding");
        return null;
    }

    public final void g4(@dl.d z4 z4Var) {
        if (PatchProxy.proxy(new Object[]{z4Var}, this, changeQuickRedirect, false, 32426, new Class[]{z4.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(z4Var, "<set-?>");
        this.f87773j = z4Var;
    }

    @Override // androidx.fragment.app.Fragment
    @dl.e
    public View onCreateView(@dl.d LayoutInflater inflater, @dl.e ViewGroup viewGroup, @dl.e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inflater, viewGroup, bundle}, this, changeQuickRedirect, false, 32427, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(inflater, "inflater");
        z4 z4VarC = z4.c(inflater);
        kotlin.jvm.internal.f0.o(z4VarC, "inflate(inflater)");
        g4(z4VarC);
        return Z3().b();
    }

    @Override // com.max.hbcommon.base.c, androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32430, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroyView();
        f4(this, null, 1, null);
    }

    @Override // com.max.hbcommon.base.swipeback.a, com.max.hbcommon.base.c, androidx.fragment.app.Fragment
    public void onViewCreated(@dl.d View view, @dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 32428, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            ArrayList<String> stringArrayList = arguments.getStringArrayList(f87769q);
            if (!com.max.hbcommon.utils.c.w(stringArrayList)) {
                this.f87776m.clear();
                List<String> list = this.f87776m;
                kotlin.jvm.internal.f0.m(stringArrayList);
                list.addAll(stringArrayList);
            }
            String string = arguments.getString(f87772t);
            if (string != null) {
                this.f87777n = string;
            }
        }
        a4();
    }
}
