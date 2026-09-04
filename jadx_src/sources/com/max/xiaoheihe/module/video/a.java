package com.max.xiaoheihe.module.video;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.j;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.text.u;

/* JADX INFO: compiled from: FloatViewFragmentDialog.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class a extends j {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f93548i = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private final Context f93549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f93550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f93551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f93552e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f93553f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f93554g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @e
    private InterfaceC0878a f93555h;

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.video.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FloatViewFragmentDialog.kt */
    public interface InterfaceC0878a {
        void onDismiss();
    }

    /* JADX INFO: compiled from: FloatViewFragmentDialog.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 46218, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            a.this.dismiss();
        }
    }

    public a(@d Context mContext) {
        f0.p(mContext, "mContext");
        this.f93549b = mContext;
        this.f93551d = R.layout.layout_sample_fragment_container;
    }

    public final void L3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46217, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Context context = this.f93549b;
        if (context instanceof AppCompatActivity) {
            show(((AppCompatActivity) context).getSupportFragmentManager(), "float_view");
        }
    }

    @e
    public final InterfaceC0878a M3() {
        return this.f93555h;
    }

    public final int N3() {
        return this.f93551d;
    }

    @d
    public final Context O3() {
        return this.f93549b;
    }

    @d
    public final View P3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46211, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View view = this.f93552e;
        if (view != null) {
            return view;
        }
        f0.S("mFloatView");
        return null;
    }

    public final int Q3() {
        return this.f93553f;
    }

    public final int R3() {
        return this.f93554g;
    }

    public final void S3(@e InterfaceC0878a interfaceC0878a) {
        this.f93555h = interfaceC0878a;
    }

    public final void T3(int i10) {
        this.f93551d = i10;
    }

    public final void U3(@d View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 46212, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "<set-?>");
        this.f93552e = view;
    }

    public final void V3(int i10) {
        this.f93553f = i10;
    }

    public final void W3(int i10) {
        this.f93554g = i10;
    }

    @Override // androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onActivityCreated(@e Bundle bundle) {
        View decorView;
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 46214, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        Dialog dialog = getDialog();
        f0.m(dialog);
        Window window = dialog.getWindow();
        super.onActivityCreated(bundle);
        if (window != null) {
            window.setBackgroundDrawable(androidx.core.content.d.i(this.f93549b, android.R.color.transparent));
        }
        int iJ = ViewUtils.J(getActivity());
        int iM = ViewUtils.M();
        Integer numValueOf = (window == null || (decorView = window.getDecorView()) == null) ? null : Integer.valueOf(decorView.getHeight());
        if (!u.L1("xiaomi", Build.MANUFACTURER, true) || (numValueOf != null && numValueOf.intValue() == iJ)) {
            iJ -= iM;
        }
        if (window != null) {
            if (iJ == 0) {
                iJ = -1;
            }
            window.setLayout(-1, iJ);
        }
        WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
        if (attributes != null) {
            attributes.dimAmount = 0.0f;
        }
        if (window != null) {
            window.setAttributes(attributes);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(this.f93553f, this.f93554g, 0, 0);
        layoutParams.gravity = 1;
        P3().setLayoutParams(layoutParams);
    }

    @Override // androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onCreate(@e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 46213, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        setStyle(2, 0);
        super.onCreate(bundle);
        Dialog dialog = getDialog();
        Window window = dialog != null ? dialog.getWindow() : null;
        if (window != null) {
            window.requestFeature(1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @e
    public View onCreateView(@d LayoutInflater inflater, @e ViewGroup viewGroup, @e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inflater, viewGroup, bundle}, this, changeQuickRedirect, false, 46215, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(inflater, "inflater");
        View viewInflate = inflater.inflate(this.f93551d, viewGroup, false);
        f0.o(viewInflate, "inflater.inflate(layoutResID, container, false)");
        this.f93550c = viewInflate;
        if (viewInflate == null) {
            f0.S("rootView");
            viewInflate = null;
        }
        ((ViewGroup) viewInflate).addView(P3());
        View view = this.f93550c;
        if (view == null) {
            f0.S("rootView");
            view = null;
        }
        view.setOnClickListener(new b());
        View view2 = this.f93550c;
        if (view2 != null) {
            return view2;
        }
        f0.S("rootView");
        return null;
    }

    @Override // androidx.fragment.app.j, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@d DialogInterface dialog) {
        if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 46216, new Class[]{DialogInterface.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(dialog, "dialog");
        InterfaceC0878a interfaceC0878a = this.f93555h;
        if (interfaceC0878a != null) {
            interfaceC0878a.onDismiss();
        }
        super.onDismiss(dialog);
    }
}
