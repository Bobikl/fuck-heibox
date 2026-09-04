package com.heybox.imageviewer;

import android.app.Dialog;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.core.view.j1;
import androidx.fragment.app.FragmentManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: BaseDialogFragment.kt */
/* JADX INFO: loaded from: classes7.dex */
@t0({"SMAP\nBaseDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseDialogFragment.kt\ncom/heybox/imageviewer/BaseDialogFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,64:1\n1#2:65\n*E\n"})
public class b extends androidx.fragment.app.j {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean M3(b this$0, View view, int i10, KeyEvent keyEvent) {
        boolean z10 = false;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{this$0, view, new Integer(i10), keyEvent}, null, changeQuickRedirect, true, 18, new Class[]{b.class, View.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(this$0, "this$0");
        if (keyEvent.getAction() == 1 && i10 == 4) {
            z10 = true;
        }
        if (z10) {
            this$0.onBackPressed();
        }
        return z10;
    }

    public static /* synthetic */ void Q3(b bVar, String str, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{bVar, str, new Integer(i10), obj}, null, changeQuickRedirect, true, 17, new Class[]{b.class, String.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showFailure");
        }
        if ((i10 & 1) != 0) {
            str = null;
        }
        bVar.P3(str);
    }

    public void N3(@dl.d Window win) {
        if (PatchProxy.proxy(new Object[]{win}, this, changeQuickRedirect, false, 15, new Class[]{Window.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(win, "win");
        win.setWindowAnimations(R.style.Animation_Keep);
        win.setGravity(17);
        win.setNavigationBarColor(j1.f21601t);
        win.setStatusBarColor(j1.f21601t);
    }

    public final void O3(@dl.e FragmentManager fragmentManager) {
        if (PatchProxy.proxy(new Object[]{fragmentManager}, this, changeQuickRedirect, false, 16, new Class[]{FragmentManager.class}, Void.TYPE).isSupported) {
            return;
        }
        if (fragmentManager == null) {
            P3("fragmentManager is detach after parent destroy");
        } else if (fragmentManager.e1()) {
            P3("dialog fragment show when fragmentManager isStateSaved");
        } else {
            show(fragmentManager, getClass().getSimpleName());
        }
    }

    public void P3(@dl.e String str) {
    }

    public void onBackPressed() {
    }

    @Override // androidx.fragment.app.j
    @dl.d
    public Dialog onCreateDialog(@dl.e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 11, new Class[]{Bundle.class}, Dialog.class);
        if (patchProxyResultProxy.isSupported) {
            return (Dialog) patchProxyResultProxy.result;
        }
        Dialog dialog = new Dialog(requireActivity(), R.style.Theme_Light_NoTitle_ViewerDialog);
        dialog.setCanceledOnTouchOutside(true);
        Window window = dialog.getWindow();
        if (window != null) {
            f0.m(window);
            N3(window);
        }
        return dialog;
    }

    @Override // androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroyView();
        View view = getView();
        if (view != null) {
            view.setOnKeyListener(null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        View view = getView();
        if (view != null) {
            view.requestFocus();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.i
    public void onViewCreated(@dl.d View view, @dl.e Bundle bundle) {
        Window window;
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 12, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "view");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setStatusBarColor(0);
            window.getDecorView().setSystemUiVisibility(1280);
        }
        view.setFocusableInTouchMode(true);
        view.setOnKeyListener(new View.OnKeyListener() { // from class: com.heybox.imageviewer.a
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view2, int i10, KeyEvent keyEvent) {
                return b.M3(this.f59703b, view2, i10, keyEvent);
            }
        });
    }
}
