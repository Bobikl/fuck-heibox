package com.max.mediaselector.lib.dialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.j;
import com.max.mediaselector.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import oe.h;

/* JADX INFO: compiled from: PhotoItemSelectedDialog.java */
/* JADX INFO: loaded from: classes2.dex */
public class b extends j implements View.OnClickListener {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f75182e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f75183f = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f75184b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private h f75185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f75186d;

    /* JADX INFO: compiled from: PhotoItemSelectedDialog.java */
    public interface a {
        void a(boolean z10, DialogInterface dialogInterface);
    }

    private void L3() {
        Dialog dialog;
        Window window;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.om, new Class[0], Void.TYPE).isSupported || (dialog = getDialog()) == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(com.max.mediaselector.lib.utils.h.f(getContext()), -2);
        window.setGravity(80);
        window.setWindowAnimations(R.style.PictureThemeDialogFragmentAnim);
    }

    public static b M3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 11106, new Class[0], b.class);
        return patchProxyResultProxy.isSupported ? (b) patchProxyResultProxy.result : new b();
    }

    public void N3(a aVar) {
        this.f75186d = aVar;
    }

    public void O3(h hVar) {
        this.f75185c = hVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.l.pm, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        int id2 = view.getId();
        h hVar = this.f75185c;
        if (hVar != null) {
            if (id2 == R.id.ps_tv_photo) {
                hVar.a(view, 0);
                this.f75184b = false;
            } else if (id2 == R.id.ps_tv_video) {
                hVar.a(view, 1);
                this.f75184b = false;
            }
        }
        dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.Fragment
    @p0
    public View onCreateView(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, @p0 Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, bundle}, this, changeQuickRedirect, false, bb.c.l.lm, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        if (getDialog() != null) {
            getDialog().requestWindowFeature(1);
            if (getDialog().getWindow() != null) {
                getDialog().getWindow().setBackgroundDrawableResource(android.R.color.transparent);
            }
        }
        return layoutInflater.inflate(R.layout.ps_dialog_camera_selected, viewGroup);
    }

    @Override // androidx.fragment.app.j, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@n0 DialogInterface dialogInterface) {
        if (PatchProxy.proxy(new Object[]{dialogInterface}, this, changeQuickRedirect, false, bb.c.l.rm, new Class[]{DialogInterface.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onDismiss(dialogInterface);
        a aVar = this.f75186d;
        if (aVar != null) {
            aVar.a(this.f75184b, dialogInterface);
        }
    }

    @Override // androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onStart() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.nm, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStart();
        L3();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@n0 View view, @p0 Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, bb.c.l.mm, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) view.findViewById(R.id.ps_tv_photo);
        TextView textView2 = (TextView) view.findViewById(R.id.ps_tv_video);
        TextView textView3 = (TextView) view.findViewById(R.id.ps_tv_cancel);
        textView2.setOnClickListener(this);
        textView.setOnClickListener(this);
        textView3.setOnClickListener(this);
    }

    @Override // androidx.fragment.app.j
    public void show(FragmentManager fragmentManager, String str) {
        if (PatchProxy.proxy(new Object[]{fragmentManager, str}, this, changeQuickRedirect, false, bb.c.l.qm, new Class[]{FragmentManager.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        androidx.fragment.app.p0 p0VarU = fragmentManager.u();
        p0VarU.g(this, str);
        p0VarU.n();
    }
}
