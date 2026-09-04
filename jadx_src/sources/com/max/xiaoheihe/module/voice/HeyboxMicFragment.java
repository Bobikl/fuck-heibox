package com.max.xiaoheihe.module.voice;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.RemoteException;
import android.telephony.TelephonyManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.n3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.b1;
import androidx.lifecycle.c1;
import androidx.lifecycle.r;
import androidx.lifecycle.s0;
import androidx.lifecycle.y0;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.component.TitleBar;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbminiprogram.NativeLittleProgramFragment;
import com.max.hbpermission.PermissionManager;
import com.max.hbutils.utils.SystemWindowInsetExtensionsKt;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.utils.imageviewer.ExtentionsKt;
import com.max.xiaoheihe.view.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.r5;
import df.s5;
import df.xb;
import dl.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.b0;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import kotlin.z;

/* JADX INFO: compiled from: HeyboxMicFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nHeyboxMicFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeyboxMicFragment.kt\ncom/max/xiaoheihe/module/voice/HeyboxMicFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 Extensions.kt\ncom/max/heybox/hblog/ExtensionsKt\n*L\n1#1,614:1\n106#2,15:615\n29#3:630\n5#3,2:631\n22#3:633\n7#3:634\n*S KotlinDebug\n*F\n+ 1 HeyboxMicFragment.kt\ncom/max/xiaoheihe/module/voice/HeyboxMicFragment\n*L\n61#1:615,15\n331#1:630\n331#1:631,2\n331#1:633\n331#1:634\n*E\n"})
@com.max.hbcommon.analytics.m(path = lb.d.f131189j5)
@androidx.compose.runtime.internal.o(parameters = 0)
public final class HeyboxMicFragment extends NativeLittleProgramFragment {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.d
    public static final a f93760v = new a(null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f93761w = 8;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @dl.d
    public static final String f93762x = "ip_list";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @dl.d
    public static final String f93763y = "port";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @dl.d
    public static final String f93764z = "token";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private final z f93765p = b0.c(new yh.a<com.max.xiaoheihe.view.d>() { // from class: com.max.xiaoheihe.module.voice.HeyboxMicFragment$statusDialog$2
        public static ChangeQuickRedirect changeQuickRedirect;

        {
            super(0);
        }

        public final d a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46647, new Class[0], d.class);
            return patchProxyResultProxy.isSupported ? (d) patchProxyResultProxy.result : new d.a(this.f93946b.getContext()).a();
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.max.xiaoheihe.view.d, java.lang.Object] */
        @Override // yh.a
        public /* bridge */ /* synthetic */ d invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46648, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
        }
    });

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public xb f93766q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    private final z f93767r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.d
    private f f93768s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.d
    private final z f93769t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.d
    private final HeyboxMicFragment$phoneCallReceiver$1 f93770u;

    /* JADX INFO: compiled from: HeyboxMicFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: HeyboxMicFragment.kt */
    @t0({"SMAP\nHeyboxMicFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeyboxMicFragment.kt\ncom/max/xiaoheihe/module/voice/HeyboxMicFragment$ConnectFailedDialogView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,614:1\n1864#2,3:615\n*S KotlinDebug\n*F\n+ 1 HeyboxMicFragment.kt\ncom/max/xiaoheihe/module/voice/HeyboxMicFragment$ConnectFailedDialogView\n*L\n553#1:615,3\n*E\n"})
    @androidx.compose.runtime.internal.o(parameters = 0)
    public static final class b {
        public static ChangeQuickRedirect changeQuickRedirect = null;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f93881k = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final FragmentActivity f93882a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final List<String> f93883b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.e
        private String f93884c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @dl.e
        private String f93885d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @dl.e
        private String f93886e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f93887f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f93888g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @dl.e
        private View.OnClickListener f93889h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @dl.e
        private View.OnClickListener f93890i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @dl.e
        private Drawable f93891j;

        /* JADX INFO: compiled from: HeyboxMicFragment.kt */
        public static final class a extends s<String> {
            public static ChangeQuickRedirect changeQuickRedirect;

            a(List<String> list, FragmentActivity fragmentActivity) {
                super(fragmentActivity, list, R.layout.item_heybox_voice_ip);
            }

            public void m(@dl.e s.e eVar, @dl.e String str) {
                View view;
                if (PatchProxy.proxy(new Object[]{eVar, str}, this, changeQuickRedirect, false, 46472, new Class[]{s.e.class, String.class}, Void.TYPE).isSupported) {
                    return;
                }
                TextView textView = (eVar == null || (view = eVar.itemView) == null) ? null : (TextView) view.findViewById(R.id.content);
                if (textView == null) {
                    return;
                }
                textView.setText(str);
            }

            @Override // com.max.hbcommon.base.adapter.s
            public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, String str) {
                if (PatchProxy.proxy(new Object[]{eVar, str}, this, changeQuickRedirect, false, 46473, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                m(eVar, str);
            }
        }

        public b(@dl.d FragmentActivity context, @dl.d List<String> ipList) {
            f0.p(context, "context");
            f0.p(ipList, "ipList");
            this.f93882a = context;
            this.f93883b = ipList;
        }

        public final boolean a() {
            return this.f93888g;
        }

        @dl.d
        public final FragmentActivity b() {
            return this.f93882a;
        }

        @dl.e
        public final String c() {
            return this.f93884c;
        }

        public final boolean d() {
            return this.f93887f;
        }

        @dl.d
        public final List<String> e() {
            return this.f93883b;
        }

        @dl.e
        public final String f() {
            return this.f93885d;
        }

        @dl.e
        public final View.OnClickListener g() {
            return this.f93889h;
        }

        @dl.e
        public final Drawable h() {
            return this.f93891j;
        }

        @dl.e
        public final String i() {
            return this.f93886e;
        }

        @dl.e
        public final View.OnClickListener j() {
            return this.f93890i;
        }

        public final void k(boolean z10) {
            this.f93888g = z10;
        }

        public final void l(@dl.e String str) {
            this.f93884c = str;
        }

        public final void m(boolean z10) {
            this.f93887f = z10;
        }

        public final void n(@dl.e String str) {
            this.f93885d = str;
        }

        public final void o(@dl.e View.OnClickListener onClickListener) {
            this.f93889h = onClickListener;
        }

        public final void p(@dl.e Drawable drawable) {
            this.f93891j = drawable;
        }

        public final void q(@dl.e String str) {
            this.f93886e = str;
        }

        public final void r(@dl.e View.OnClickListener onClickListener) {
            this.f93890i = onClickListener;
        }

        public final void s(@dl.d com.max.xiaoheihe.view.d dialog) {
            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 46471, new Class[]{com.max.xiaoheihe.view.d.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(dialog, "dialog");
            dialog.dismiss();
            dialog.setCanceledOnTouchOutside(this.f93888g);
            dialog.setCancelable(this.f93888g);
            s5 s5VarC = s5.c(LayoutInflater.from(this.f93882a));
            s5VarC.f115453g.setText(this.f93884c);
            s5VarC.f115451e.setText(this.f93885d);
            s5VarC.f115452f.setText(this.f93886e);
            s5VarC.f115451e.setOnClickListener(this.f93889h);
            s5VarC.f115452f.setOnClickListener(this.f93890i);
            f0.o(s5VarC, "inflate(LayoutInflater.f…stener)\n                }");
            dialog.setContentView(s5VarC.b());
            if (this.f93887f) {
                s5VarC.f115451e.setVisibility(8);
            }
            TextView textView = s5VarC.f115452f;
            Drawable drawableI = this.f93891j;
            if (drawableI == null) {
                drawableI = androidx.core.content.d.i(this.f93882a, R.drawable.bg_voice_dialog_default_btn);
            }
            textView.setBackground(drawableI);
            ArrayList arrayList = new ArrayList();
            arrayList.add("移动端IP：" + com.max.xiaoheihe.module.voice.b.a(this.f93882a));
            int i10 = 0;
            for (Object obj : this.f93883b) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt__CollectionsKt.W();
                }
                arrayList.add("PC端IP " + i11 + (char) 65306 + ((String) obj));
                i10 = i11;
            }
            a aVar = new a(arrayList, this.f93882a);
            s5VarC.f115450d.setLayoutManager(new LinearLayoutManager(this.f93882a, 1, false));
            s5VarC.f115450d.setAdapter(aVar);
            Window window = dialog.getWindow();
            if (window != null) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.width = -1;
                window.setAttributes(attributes);
            }
            dialog.show();
        }
    }

    /* JADX INFO: compiled from: HeyboxMicFragment.kt */
    @androidx.compose.runtime.internal.o(parameters = 0)
    public static final class c {
        public static ChangeQuickRedirect changeQuickRedirect = null;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f93892j = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final FragmentActivity f93893a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.e
        private String f93894b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.e
        private String f93895c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @dl.e
        private String f93896d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f93897e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f93898f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @dl.e
        private View.OnClickListener f93899g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @dl.e
        private View.OnClickListener f93900h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @dl.e
        private Drawable f93901i;

        public c(@dl.d FragmentActivity context) {
            f0.p(context, "context");
            this.f93893a = context;
        }

        public final boolean a() {
            return this.f93898f;
        }

        @dl.d
        public final FragmentActivity b() {
            return this.f93893a;
        }

        @dl.e
        public final String c() {
            return this.f93894b;
        }

        public final boolean d() {
            return this.f93897e;
        }

        @dl.e
        public final String e() {
            return this.f93895c;
        }

        @dl.e
        public final View.OnClickListener f() {
            return this.f93899g;
        }

        @dl.e
        public final Drawable g() {
            return this.f93901i;
        }

        @dl.e
        public final String h() {
            return this.f93896d;
        }

        @dl.e
        public final View.OnClickListener i() {
            return this.f93900h;
        }

        public final void j(boolean z10) {
            this.f93898f = z10;
        }

        public final void k(@dl.e String str) {
            this.f93894b = str;
        }

        public final void l(boolean z10) {
            this.f93897e = z10;
        }

        public final void m(@dl.e String str) {
            this.f93895c = str;
        }

        public final void n(@dl.e View.OnClickListener onClickListener) {
            this.f93899g = onClickListener;
        }

        public final void o(@dl.e Drawable drawable) {
            this.f93901i = drawable;
        }

        public final void p(@dl.e String str) {
            this.f93896d = str;
        }

        public final void q(@dl.e View.OnClickListener onClickListener) {
            this.f93900h = onClickListener;
        }

        public final void r(@dl.d com.max.xiaoheihe.view.d dialog) {
            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 46474, new Class[]{com.max.xiaoheihe.view.d.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(dialog, "dialog");
            dialog.dismiss();
            dialog.setCanceledOnTouchOutside(this.f93898f);
            dialog.setCancelable(this.f93898f);
            r5 r5VarC = r5.c(LayoutInflater.from(this.f93893a));
            r5VarC.f115087f.setText(this.f93894b);
            r5VarC.f115085d.setText(this.f93895c);
            r5VarC.f115086e.setText(this.f93896d);
            r5VarC.f115085d.setOnClickListener(this.f93899g);
            r5VarC.f115086e.setOnClickListener(this.f93900h);
            f0.o(r5VarC, "inflate(LayoutInflater.f…stener)\n                }");
            if (this.f93897e) {
                r5VarC.f115085d.setVisibility(8);
            }
            TextView textView = r5VarC.f115086e;
            Drawable drawableI = this.f93901i;
            if (drawableI == null) {
                drawableI = androidx.core.content.d.i(this.f93893a, R.drawable.bg_voice_dialog_default_btn);
            }
            textView.setBackground(drawableI);
            dialog.setContentView(r5VarC.b());
            Window window = dialog.getWindow();
            if (window != null) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.width = -1;
                window.setAttributes(attributes);
            }
            dialog.show();
        }
    }

    /* JADX INFO: compiled from: HeyboxMicFragment.kt */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 46601, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            HeyboxMicFragment.this.requireActivity().getOnBackPressedDispatcher().f();
        }
    }

    /* JADX INFO: compiled from: HeyboxMicFragment.kt */
    public static final class e implements SeekBar.OnSeekBarChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(@dl.e SeekBar seekBar, int i10, boolean z10) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(@dl.e SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(@dl.e SeekBar seekBar) throws RemoteException {
            if (PatchProxy.proxy(new Object[]{seekBar}, this, changeQuickRedirect, false, 46604, new Class[]{SeekBar.class}, Void.TYPE).isSupported) {
                return;
            }
            HeyboxMicFragment.J4(HeyboxMicFragment.this).I(seekBar != null ? seekBar.getProgress() : 50, true);
        }
    }

    /* JADX INFO: compiled from: HeyboxMicFragment.kt */
    public static final class f extends androidx.activity.o {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
            super(true);
        }

        @Override // androidx.activity.o
        public void handleOnBackPressed() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46625, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            HeyboxMicFragment.Q4(HeyboxMicFragment.this);
        }
    }

    /* JADX INFO: compiled from: HeyboxMicFragment.kt */
    public static final class g implements com.max.hbpermission.c {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // com.max.hbpermission.c
        public final void onResult() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46626, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            HeyboxMicFragment.J4(HeyboxMicFragment.this).s();
        }
    }

    /* JADX INFO: compiled from: HeyboxMicFragment.kt */
    public static final class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 46628, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            HeyboxMicFragment.this.f93768s.setEnabled(false);
            HeyboxMicFragment.this.requireActivity().getOnBackPressedDispatcher().f();
        }
    }

    /* JADX INFO: compiled from: HeyboxMicFragment.kt */
    public static final class i implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) throws RemoteException {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 46629, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            HeyboxMicFragment.J4(HeyboxMicFragment.this).v();
        }
    }

    /* JADX INFO: compiled from: HeyboxMicFragment.kt */
    public static final class j implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 46630, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            HeyboxMicFragment.M4(HeyboxMicFragment.this).dismiss();
        }
    }

    /* JADX INFO: compiled from: HeyboxMicFragment.kt */
    public static final class k implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) throws RemoteException {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 46631, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            HeyboxMicFragment.J4(HeyboxMicFragment.this).w();
            HeyboxMicFragment.this.f93768s.setEnabled(false);
            HeyboxMicFragment.M4(HeyboxMicFragment.this).dismiss();
            HeyboxMicFragment.this.requireActivity().getOnBackPressedDispatcher().f();
        }
    }

    /* JADX INFO: compiled from: HeyboxMicFragment.kt */
    public static final class l implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        l() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 46632, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            HeyboxMicFragment.this.f93768s.setEnabled(false);
            HeyboxMicFragment.M4(HeyboxMicFragment.this).dismiss();
            HeyboxMicFragment.this.requireActivity().getOnBackPressedDispatcher().f();
        }
    }

    /* JADX INFO: compiled from: HeyboxMicFragment.kt */
    public static final class m implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        m() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 46633, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Activity mContext = ((com.max.hbcommon.base.d) HeyboxMicFragment.this).mContext;
            f0.o(mContext, "mContext");
            com.max.xiaoheihe.base.router.b.i0(mContext, lb.d.f131244r4);
            HeyboxMicFragment.this.f93768s.setEnabled(false);
            HeyboxMicFragment.M4(HeyboxMicFragment.this).dismiss();
            HeyboxMicFragment.this.requireActivity().getOnBackPressedDispatcher().f();
        }
    }

    /* JADX INFO: compiled from: HeyboxMicFragment.kt */
    public static final class n implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        n() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 46634, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            HeyboxMicFragment.M4(HeyboxMicFragment.this).dismiss();
        }
    }

    /* JADX INFO: compiled from: HeyboxMicFragment.kt */
    public static final class o implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        o() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 46635, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            HeyboxMicFragment.this.f93768s.setEnabled(false);
            HeyboxMicFragment.M4(HeyboxMicFragment.this).dismiss();
            HeyboxMicFragment.this.requireActivity().getOnBackPressedDispatcher().f();
        }
    }

    /* JADX INFO: compiled from: HeyboxMicFragment.kt */
    public static final class p implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        p() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 46636, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            HeyboxMicFragment.this.f93768s.setEnabled(false);
            HeyboxMicFragment.this.requireActivity().getOnBackPressedDispatcher().f();
        }
    }

    /* JADX INFO: compiled from: HeyboxMicFragment.kt */
    public static final class q implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        q() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 46637, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            HeyboxMicFragment.M4(HeyboxMicFragment.this).dismiss();
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [com.max.xiaoheihe.module.voice.HeyboxMicFragment$phoneCallReceiver$1] */
    public HeyboxMicFragment() {
        yh.a<y0.b> aVar = new yh.a<y0.b>() { // from class: com.max.xiaoheihe.module.voice.HeyboxMicFragment$heyboxMicViewModel$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // yh.a
            @dl.d
            public final y0.b invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46599, new Class[0], y0.b.class);
                return patchProxyResultProxy.isSupported ? (y0.b) patchProxyResultProxy.result : new s0(this.f93908b.requireActivity().getApplication(), this.f93908b);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.y0$b, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ y0.b invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46600, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }
        };
        final yh.a<Fragment> aVar2 = new yh.a<Fragment>() { // from class: com.max.xiaoheihe.module.voice.HeyboxMicFragment$special$$inlined$viewModels$default$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @dl.d
            public final Fragment a() {
                return this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.fragment.app.Fragment, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ Fragment invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46638, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        };
        final z zVarB = b0.b(LazyThreadSafetyMode.NONE, new yh.a<c1>() { // from class: com.max.xiaoheihe.module.voice.HeyboxMicFragment$special$$inlined$viewModels$default$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @dl.d
            public final c1 a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46639, new Class[0], c1.class);
                return patchProxyResultProxy.isSupported ? (c1) patchProxyResultProxy.result : (c1) aVar2.invoke();
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.c1, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ c1 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46640, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        final yh.a aVar3 = null;
        this.f93767r = FragmentViewModelLazyKt.h(this, n0.d(com.max.xiaoheihe.module.voice.c.class), new yh.a<b1>() { // from class: com.max.xiaoheihe.module.voice.HeyboxMicFragment$special$$inlined$viewModels$default$3
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // yh.a
            @dl.d
            public final b1 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46641, new Class[0], b1.class);
                return patchProxyResultProxy.isSupported ? (b1) patchProxyResultProxy.result : FragmentViewModelLazyKt.p(zVarB).getViewModelStore();
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.b1, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b1 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46642, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }
        }, new yh.a<u2.a>() { // from class: com.max.xiaoheihe.module.voice.HeyboxMicFragment$special$$inlined$viewModels$default$4
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, u2.a] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ u2.a invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46644, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }

            @Override // yh.a
            @dl.d
            public final u2.a invoke() {
                u2.a aVar4;
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46643, new Class[0], u2.a.class);
                if (patchProxyResultProxy.isSupported) {
                    return (u2.a) patchProxyResultProxy.result;
                }
                yh.a aVar5 = aVar3;
                if (aVar5 != null && (aVar4 = (u2.a) aVar5.invoke()) != null) {
                    return aVar4;
                }
                c1 c1VarP = FragmentViewModelLazyKt.p(zVarB);
                r rVar = c1VarP instanceof r ? (r) c1VarP : null;
                return rVar != null ? rVar.getDefaultViewModelCreationExtras() : u2.a.C1270a.f140743b;
            }
        }, aVar);
        this.f93768s = new f();
        this.f93769t = b0.c(new yh.a<LoadingDialog>() { // from class: com.max.xiaoheihe.module.voice.HeyboxMicFragment$connectingDialog$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @dl.d
            public final LoadingDialog a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46597, new Class[0], LoadingDialog.class);
                if (patchProxyResultProxy.isSupported) {
                    return (LoadingDialog) patchProxyResultProxy.result;
                }
                Context contextRequireContext = this.f93902b.requireContext();
                f0.o(contextRequireContext, "requireContext()");
                return new LoadingDialog(contextRequireContext, this.f93902b.getString(R.string.heybox_voice_connecting), true);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.max.hbcustomview.loadingdialog.LoadingDialog, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ LoadingDialog invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46598, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        this.f93770u = new BroadcastReceiver() { // from class: com.max.xiaoheihe.module.voice.HeyboxMicFragment$phoneCallReceiver$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.content.BroadcastReceiver
            public void onReceive(@e Context context, @e Intent intent) {
                String stringExtra;
                if (PatchProxy.proxy(new Object[]{context, intent}, this, changeQuickRedirect, false, 46627, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported) {
                    return;
                }
                if (intent != null) {
                    try {
                        stringExtra = intent.getStringExtra("state");
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        return;
                    }
                } else {
                    stringExtra = null;
                }
                if (f0.g(stringExtra, TelephonyManager.EXTRA_STATE_RINGING)) {
                    HeyboxMicFragment.J4(this.f93937a).y(this.f93937a.Y4().f117521l.getProgress());
                }
                if (f0.g(stringExtra, TelephonyManager.EXTRA_STATE_OFFHOOK)) {
                    HeyboxMicFragment.J4(this.f93937a).y(this.f93937a.Y4().f117521l.getProgress());
                }
                if (f0.g(stringExtra, TelephonyManager.EXTRA_STATE_IDLE)) {
                    HeyboxMicFragment.J4(this.f93937a).A();
                }
            }
        };
    }

    public static final /* synthetic */ LoadingDialog I4(HeyboxMicFragment heyboxMicFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{heyboxMicFragment}, null, changeQuickRedirect, true, 46464, new Class[]{HeyboxMicFragment.class}, LoadingDialog.class);
        return patchProxyResultProxy.isSupported ? (LoadingDialog) patchProxyResultProxy.result : heyboxMicFragment.Z4();
    }

    public static final /* synthetic */ com.max.xiaoheihe.module.voice.c J4(HeyboxMicFragment heyboxMicFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{heyboxMicFragment}, null, changeQuickRedirect, true, 46461, new Class[]{HeyboxMicFragment.class}, com.max.xiaoheihe.module.voice.c.class);
        return patchProxyResultProxy.isSupported ? (com.max.xiaoheihe.module.voice.c) patchProxyResultProxy.result : heyboxMicFragment.a5();
    }

    public static final /* synthetic */ com.max.xiaoheihe.view.d M4(HeyboxMicFragment heyboxMicFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{heyboxMicFragment}, null, changeQuickRedirect, true, 46469, new Class[]{HeyboxMicFragment.class}, com.max.xiaoheihe.view.d.class);
        return patchProxyResultProxy.isSupported ? (com.max.xiaoheihe.view.d) patchProxyResultProxy.result : heyboxMicFragment.b5();
    }

    public static final /* synthetic */ void N4(HeyboxMicFragment heyboxMicFragment) {
        if (PatchProxy.proxy(new Object[]{heyboxMicFragment}, null, changeQuickRedirect, true, 46465, new Class[]{HeyboxMicFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        heyboxMicFragment.d5();
    }

    public static final /* synthetic */ void O4(HeyboxMicFragment heyboxMicFragment) {
        if (PatchProxy.proxy(new Object[]{heyboxMicFragment}, null, changeQuickRedirect, true, 46462, new Class[]{HeyboxMicFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        heyboxMicFragment.e5();
    }

    public static final /* synthetic */ void P4(HeyboxMicFragment heyboxMicFragment) {
        if (PatchProxy.proxy(new Object[]{heyboxMicFragment}, null, changeQuickRedirect, true, 46467, new Class[]{HeyboxMicFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        heyboxMicFragment.f5();
    }

    public static final /* synthetic */ void Q4(HeyboxMicFragment heyboxMicFragment) {
        if (PatchProxy.proxy(new Object[]{heyboxMicFragment}, null, changeQuickRedirect, true, 46470, new Class[]{HeyboxMicFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        heyboxMicFragment.g5();
    }

    public static final /* synthetic */ void R4(HeyboxMicFragment heyboxMicFragment) {
        if (PatchProxy.proxy(new Object[]{heyboxMicFragment}, null, changeQuickRedirect, true, 46466, new Class[]{HeyboxMicFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        heyboxMicFragment.h5();
    }

    public static final /* synthetic */ void S4(HeyboxMicFragment heyboxMicFragment, boolean z10) {
        if (PatchProxy.proxy(new Object[]{heyboxMicFragment, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 46468, new Class[]{HeyboxMicFragment.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        heyboxMicFragment.i5(z10);
    }

    public static final /* synthetic */ void T4(HeyboxMicFragment heyboxMicFragment, boolean z10) {
        if (PatchProxy.proxy(new Object[]{heyboxMicFragment, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 46463, new Class[]{HeyboxMicFragment.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        heyboxMicFragment.j5(z10);
    }

    private final void U4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46450, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        kotlinx.coroutines.k.f(androidx.lifecycle.z.a(this), null, null, new HeyboxMicFragment$attachConnectBtnUiState$1(this, null), 3, null);
    }

    private final void V4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46451, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        kotlinx.coroutines.k.f(androidx.lifecycle.z.a(this), null, null, new HeyboxMicFragment$attachConnectStatusDialog$1(this, null), 3, null);
    }

    private final void W4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46448, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        kotlinx.coroutines.k.f(androidx.lifecycle.z.a(this), null, null, new HeyboxMicFragment$attachMicUiState$1(this, null), 3, null);
    }

    private final void X4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46449, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        kotlinx.coroutines.k.f(androidx.lifecycle.z.a(this), null, null, new HeyboxMicFragment$attachSeekbarUiState$1(this, null), 3, null);
    }

    private final LoadingDialog Z4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46444, new Class[0], LoadingDialog.class);
        return patchProxyResultProxy.isSupported ? (LoadingDialog) patchProxyResultProxy.result : (LoadingDialog) this.f93769t.getValue();
    }

    private final com.max.xiaoheihe.module.voice.c a5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46443, new Class[0], com.max.xiaoheihe.module.voice.c.class);
        return patchProxyResultProxy.isSupported ? (com.max.xiaoheihe.module.voice.c) patchProxyResultProxy.result : (com.max.xiaoheihe.module.voice.c) this.f93767r.getValue();
    }

    private final com.max.xiaoheihe.view.d b5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46440, new Class[0], com.max.xiaoheihe.view.d.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.max.xiaoheihe.view.d) patchProxyResultProxy.result;
        }
        Object value = this.f93765p.getValue();
        f0.o(value, "<get-statusDialog>(...)");
        return (com.max.xiaoheihe.view.d) value;
    }

    private final void d5() {
        List<String> listE;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46458, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        PCDeviceInfo pCDeviceInfoU = a5().x().getValue().u();
        if (pCDeviceInfoU == null || (listE = pCDeviceInfoU.f()) == null) {
            listE = CollectionsKt__CollectionsKt.E();
        }
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        f0.o(fragmentActivityRequireActivity, "requireActivity()");
        b bVar = new b(fragmentActivityRequireActivity, listE);
        bVar.l(getString(R.string.heybox_voice_connect_interrupt_alert));
        bVar.n(getString(R.string.heybox_voice_leave_alert_btn_left));
        bVar.q(getString(R.string.heybox_voice_connect_interrupt_reconnect));
        bVar.o(new h());
        bVar.r(new i());
        bVar.s(b5());
    }

    private final void e5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46455, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        f0.o(fragmentActivityRequireActivity, "requireActivity()");
        c cVar = new c(fragmentActivityRequireActivity);
        cVar.k(getString(R.string.heybox_voice_disconnect_alert));
        cVar.m(getString(R.string.heybox_voice_leave_alert_btn_left));
        cVar.p(getString(R.string.heybox_voice_disconnect_action));
        cVar.o(androidx.core.content.d.i(cVar.b(), R.drawable.bg_voice_dialog_alert_btn));
        cVar.n(new j());
        cVar.q(new k());
        cVar.r(b5());
    }

    private final void f5() {
        List<String> listE;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46456, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        PCDeviceInfo pCDeviceInfoU = a5().x().getValue().u();
        if (pCDeviceInfoU == null || (listE = pCDeviceInfoU.f()) == null) {
            listE = CollectionsKt__CollectionsKt.E();
        }
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        f0.o(fragmentActivityRequireActivity, "requireActivity()");
        b bVar = new b(fragmentActivityRequireActivity, listE);
        bVar.l(getString(R.string.heybox_voice_connect_failed_alert));
        bVar.n(getString(R.string.heybox_voice_leave_alert_btn_left));
        bVar.q(getString(R.string.heybox_voice_rescan));
        bVar.o(new l());
        bVar.r(new m());
        bVar.s(b5());
    }

    private final void g5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46454, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        f0.o(fragmentActivityRequireActivity, "requireActivity()");
        c cVar = new c(fragmentActivityRequireActivity);
        cVar.k(getString(R.string.heybox_voice_leave_alert));
        cVar.m(getString(R.string.heybox_voice_leave_alert_btn_left));
        cVar.p(getString(R.string.heybox_voice_leave_alert_btn_right));
        cVar.o(androidx.core.content.d.i(cVar.b(), R.drawable.bg_voice_dialog_alert_btn));
        cVar.n(new n());
        cVar.q(new o());
        cVar.r(b5());
    }

    private final void h5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46457, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        f0.o(fragmentActivityRequireActivity, "requireActivity()");
        c cVar = new c(fragmentActivityRequireActivity);
        cVar.k(getString(R.string.heybox_voice_pc_disconnection));
        cVar.p(getString(R.string.heybox_voice_i_know));
        cVar.l(true);
        cVar.q(new p());
        cVar.r(b5());
    }

    private final void i5(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 46459, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        f0.o(fragmentActivityRequireActivity, "requireActivity()");
        c cVar = new c(fragmentActivityRequireActivity);
        cVar.k(getString(z10 ? R.string.heybox_voice_mic_pause : R.string.heybox_voice_mic_resume));
        cVar.p(getString(R.string.heybox_voice_i_know));
        cVar.l(true);
        cVar.q(new q());
        cVar.r(b5());
    }

    private final void j5(boolean z10) {
        String name;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 46453, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        String str = "updateMicState, isRecording = " + z10;
        com.max.heybox.hblog.g.a aVar = com.max.heybox.hblog.g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        if (HeyboxMicFragment.class.isAnonymousClass()) {
            name = HeyboxMicFragment.class.getName();
            f0.m(name);
        } else {
            name = HeyboxMicFragment.class.getSimpleName();
            f0.m(name);
        }
        sb2.append(name);
        sb2.append(", ");
        sb2.append(str);
        aVar.q(sb2.toString());
        if (z10) {
            Y4().f117516g.setText(getString(R.string.heybox_voice_mic_open_status));
            Y4().f117512c.setImageResource(R.drawable.chat_mic_on);
            Y4().f117512c.setColorFilter(com.max.xiaoheihe.utils.d.e1("#8B8D94"));
            Y4().f117519j.setActivated(true);
            Y4().f117513d.setEnabled(true);
            return;
        }
        Y4().f117516g.setText(getString(R.string.heybox_voice_mic_close_status));
        Y4().f117512c.setImageResource(R.drawable.chat_mic_off_24x24);
        Y4().f117512c.clearColorFilter();
        Y4().f117519j.setActivated(false);
        Y4().f117513d.setEnabled(false);
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment
    public void A4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46452, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.A4();
        Bundle arguments = getArguments();
        if (arguments != null) {
            ArrayList<String> stringArrayList = arguments.getStringArrayList(f93762x);
            String strValueOf = String.valueOf(arguments.getInt(f93763y));
            String string = arguments.getString("token");
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                return;
            }
            if (strValueOf.length() == 0) {
                return;
            }
            if (string == null || string.length() == 0) {
                return;
            }
            a5().N(new PCDeviceInfo(stringArrayList, strValueOf, string));
        }
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment
    public boolean H4() {
        return false;
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.k
    public boolean I0() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46446, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (!this.f93768s.isEnabled()) {
            return super.I0();
        }
        g5();
        return true;
    }

    @dl.d
    public final xb Y4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46441, new Class[0], xb.class);
        if (patchProxyResultProxy.isSupported) {
            return (xb) patchProxyResultProxy.result;
        }
        xb xbVar = this.f93766q;
        if (xbVar != null) {
            return xbVar;
        }
        f0.S("binding");
        return null;
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.fragment.BaseLittleProgramFragment
    public void a4(@dl.e View view, boolean z10) {
        if (PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 46447, new Class[]{View.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.a4(view, z10);
        xb xbVarC = xb.c(this.mInflater);
        f0.o(xbVarC, "inflate(mInflater)");
        c5(xbVarC);
        setContentView(Y4());
        requireActivity().getOnBackPressedDispatcher().b(this.f93768s);
        TitleBar titleBar = Y4().f117514e;
        f0.o(titleBar, "binding.titleBar");
        SystemWindowInsetExtensionsKt.c(titleBar, n3.m.h(), false, false, false, false, false, true, false, false, bb.c.b.E5, null);
        Y4().f117514e.setTitle(getString(R.string.heybox_voice));
        Y4().f117514e.a0();
        Y4().f117514e.setNavigationIcon(R.drawable.common_close_line_24x24);
        Y4().f117514e.getAppbarNavButtonView().setColorFilter(com.max.xiaoheihe.utils.d.F(this.mContext, R.color.white));
        Y4().f117514e.getAppbarNavButtonView().setOnClickListener(new d());
        Y4().f117514e.setTitleTextColor(getResources().getColor(R.color.white, null));
        TextView textView = Y4().f117516g;
        com.max.hbresource.a aVar = com.max.hbresource.a.f71893a;
        int i10 = com.max.hbresource.a.f71895c;
        textView.setTypeface(aVar.a(i10));
        Y4().f117515f.setTypeface(aVar.a(i10));
        Y4().f117511b.setTypeface(aVar.a(i10));
        LinearLayoutCompat linearLayoutCompat = Y4().f117519j;
        f0.o(linearLayoutCompat, "binding.vgMicSwitch");
        ExtentionsKt.k(linearLayoutCompat, 0L, new yh.l<View, b2>() { // from class: com.max.xiaoheihe.module.voice.HeyboxMicFragment$installViews$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            public final void a(@dl.d View it) throws RemoteException {
                if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 46602, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(it, "it");
                HeyboxMicFragment.J4(this.f93910b).O(this.f93910b.Y4().f117521l.getProgress());
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(View view2) throws RemoteException {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view2}, this, changeQuickRedirect, false, 46603, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(view2);
                return b2.f124493a;
            }
        }, 1, null);
        Y4().f117519j.setClickable(false);
        Y4().f117521l.setOnSeekBarChangeListener(new e());
        FrameLayout frameLayout = Y4().f117517h;
        f0.o(frameLayout, "binding.vgConnect");
        ExtentionsKt.k(frameLayout, 0L, new yh.l<View, b2>() { // from class: com.max.xiaoheihe.module.voice.HeyboxMicFragment$installViews$4
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            public final void a(@dl.d View it) {
                if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 46605, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(it, "it");
                HeyboxMicFragment.O4(this.f93911b);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(View view2) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view2}, this, changeQuickRedirect, false, 46606, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(view2);
                return b2.f124493a;
            }
        }, 1, null);
        V4();
        W4();
        X4();
        U4();
        kotlinx.coroutines.k.f(androidx.lifecycle.z.a(this), null, null, new HeyboxMicFragment$installViews$5(this, null), 3, null);
        kotlinx.coroutines.k.f(androidx.lifecycle.z.a(this), null, null, new HeyboxMicFragment$installViews$6(this, null), 3, null);
    }

    public final void c5(@dl.d xb xbVar) {
        if (PatchProxy.proxy(new Object[]{xbVar}, this, changeQuickRedirect, false, 46442, new Class[]{xb.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(xbVar, "<set-?>");
        this.f93766q = xbVar;
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.fragment.BaseLittleProgramFragment
    public boolean e4() {
        return false;
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46460, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroyView();
        unregisterReceiver(this.f93770u);
    }

    @Override // com.max.hbminiprogram.fragment.BaseLittleProgramFragment, com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onViewCreated(@dl.d View view, @dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 46445, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "view");
        super.onViewCreated(view, bundle);
        registerReceiver(this.f93770u, "android.intent.action.PHONE_STATE");
        PermissionManager.f71603a.P(this, new g());
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment
    public boolean w4() {
        return false;
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment
    public boolean x4() {
        return false;
    }
}
