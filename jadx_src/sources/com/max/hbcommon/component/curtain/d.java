package com.max.hbcommon.component.curtain;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.i0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.fragment.app.FragmentManager;
import com.max.hbcommon.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: GuideDialogFragment.java */
/* JADX INFO: loaded from: classes9.dex */
public class d extends androidx.fragment.app.j implements g {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f67542g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f67543h = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FrameLayout f67544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Dialog f67545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f67546d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private GuideView f67547e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.max.hbcommon.component.curtain.b.c f67548f;

    /* JADX INFO: compiled from: GuideDialogFragment.java */
    public class a implements DialogInterface.OnShowListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            if (PatchProxy.proxy(new Object[]{dialogInterface}, this, changeQuickRedirect, false, bb.c.d.Xo, new Class[]{DialogInterface.class}, Void.TYPE).isSupported || d.this.f67548f.f67528e == null) {
                return;
            }
            d.this.f67548f.f67528e.b(d.this);
        }
    }

    /* JADX INFO: compiled from: GuideDialogFragment.java */
    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f67550b;

        b(h hVar) {
            this.f67550b = hVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.d.Yo, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f67550b.a(view, d.this);
        }
    }

    public static d M3(com.max.hbcommon.component.curtain.b.c cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, null, changeQuickRedirect, true, bb.c.d.Jo, new Class[]{com.max.hbcommon.component.curtain.b.c.class}, d.class);
        if (patchProxyResultProxy.isSupported) {
            return (d) patchProxyResultProxy.result;
        }
        d dVar = new d();
        dVar.P3(cVar);
        dVar.setCancelable(cVar.f67529f);
        dVar.Q3(cVar.f67527d);
        GuideView guideView = new GuideView(cVar.f67524a);
        guideView.setCurtainColor(cVar.f67532i);
        SparseArray<f> sparseArray = cVar.f67526c;
        f[] fVarArr = new f[sparseArray.size()];
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            fVarArr[i10] = sparseArray.valueAt(i10);
        }
        guideView.setHollowInfo(fVarArr);
        dVar.O3(guideView);
        return dVar;
    }

    private void N3(Dialog dialog) {
        if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, bb.c.d.Vo, new Class[]{Dialog.class}, Void.TYPE).isSupported || dialog == null || dialog.getWindow() == null || this.f67548f.f67533j == 0) {
            return;
        }
        Window window = dialog.getWindow();
        int i10 = this.f67548f.f67533j;
        if (i10 == -1) {
            i10 = R.style.dialogWindowAnim;
        }
        window.setWindowAnimations(i10);
    }

    private void T3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Wo, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f67544b.getChildCount() == 2) {
            this.f67544b.removeViewAt(1);
        }
        LayoutInflater.from(this.f67544b.getContext()).inflate(this.f67546d, (ViewGroup) this.f67544b, true);
        SparseArray<h> sparseArray = this.f67548f.f67534k;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            int iKeyAt = sparseArray.keyAt(i10);
            h hVarValueAt = sparseArray.valueAt(i10);
            View viewFindViewById = this.f67544b.findViewById(iKeyAt);
            if (viewFindViewById == null) {
                throw new NullPointerException("the target view was not find in the top view, check your setTopView layout res first");
            }
            viewFindViewById.setOnClickListener(new b(hVarValueAt));
        }
    }

    @Override // com.max.hbcommon.component.curtain.g
    public void F() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Ro, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        dismissAllowingStateLoss();
    }

    public void O3(GuideView guideView) {
        this.f67547e = guideView;
    }

    public void P3(com.max.hbcommon.component.curtain.b.c cVar) {
        this.f67548f = cVar;
    }

    public void Q3(int i10) {
        this.f67546d = i10;
    }

    public void R3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Ko, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f67547e.setId(3);
        FrameLayout frameLayout = new FrameLayout(this.f67547e.getContext());
        this.f67544b = frameLayout;
        frameLayout.addView(this.f67547e);
        if (this.f67546d != 0) {
            T3();
        }
        show(this.f67548f.f67525b, com.max.hbcommon.component.curtain.a.f67519b);
    }

    @Override // com.max.hbcommon.component.curtain.g
    public <T extends View> T S0(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.Qo, new Class[]{Integer.TYPE}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (T) patchProxyResultProxy.result;
        }
        FrameLayout frameLayout = this.f67544b;
        if (frameLayout == null) {
            return null;
        }
        return (T) frameLayout.findViewById(i10);
    }

    void S3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Lo, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f67544b.removeAllViews();
        this.f67544b.addView(this.f67547e);
        T3();
    }

    @Override // com.max.hbcommon.component.curtain.g
    public void Y1(@i0 int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.Oo, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || this.f67544b == null || getActivity() == null) {
            return;
        }
        Q3(i10);
        T3();
    }

    @Override // com.max.hbcommon.component.curtain.g
    @p0
    public View e2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Po, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        try {
            return this.f67544b.getChildAt(0);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    @Override // androidx.fragment.app.j
    @n0
    public Dialog onCreateDialog(@p0 Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, bb.c.d.So, new Class[]{Bundle.class}, Dialog.class);
        if (patchProxyResultProxy.isSupported) {
            return (Dialog) patchProxyResultProxy.result;
        }
        if (this.f67545c == null) {
            com.max.hbcommon.component.curtain.b.c cVar = this.f67548f;
            boolean z10 = cVar.f67530g;
            if (z10 && cVar.f67531h) {
                this.f67545c = new Dialog(requireActivity(), R.style.TransparentDialog);
            } else {
                this.f67545c = !z10 ? new fb.a(requireActivity(), R.style.TransparentDialog) : new fb.b(requireActivity(), R.style.TransparentDialog, this.f67548f.f67526c);
            }
            this.f67545c.setContentView(this.f67544b);
            this.f67545c.setOnShowListener(new a());
            N3(this.f67545c);
        }
        return this.f67545c;
    }

    @Override // androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Uo, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroyView();
        if (this.f67545c != null) {
            this.f67545c = null;
        }
    }

    @Override // androidx.fragment.app.j, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@n0 DialogInterface dialogInterface) {
        if (PatchProxy.proxy(new Object[]{dialogInterface}, this, changeQuickRedirect, false, bb.c.d.To, new Class[]{DialogInterface.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onDismiss(dialogInterface);
        com.max.hbcommon.component.curtain.b.InterfaceC0543b interfaceC0543b = this.f67548f.f67528e;
        if (interfaceC0543b != null) {
            interfaceC0543b.a(this);
        }
    }

    @Override // androidx.fragment.app.j
    public void show(@n0 FragmentManager fragmentManager, String str) {
        if (PatchProxy.proxy(new Object[]{fragmentManager, str}, this, changeQuickRedirect, false, bb.c.d.Mo, new Class[]{FragmentManager.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        try {
            super.show(fragmentManager, str);
        } catch (Exception unused) {
            fragmentManager.u().g(this, str).n();
        }
    }

    @Override // com.max.hbcommon.component.curtain.g
    public void z0(f... fVarArr) {
        GuideView guideView;
        if (PatchProxy.proxy(new Object[]{fVarArr}, this, changeQuickRedirect, false, bb.c.d.No, new Class[]{f[].class}, Void.TYPE).isSupported || (guideView = (GuideView) this.f67544b.findViewById(3)) == null) {
            return;
        }
        guideView.setHollowInfo(fVarArr);
    }
}
