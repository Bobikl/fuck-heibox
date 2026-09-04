package com.starlightc.ucropplus.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.R;
import com.starlightc.ucropplus.enums.EDIT_MODE;

/* JADX INFO: compiled from: BaseFragmentDialog.kt */
/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseFragmentDialog extends androidx.fragment.app.j {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean isActive;

    @dl.e
    private l3.c mBinding;
    protected LayoutInflater mInflater;
    protected View mRootView;

    @dl.e
    private Activity parentActivity;

    public abstract void bindViews();

    public boolean canOnBackPressed() {
        return true;
    }

    @dl.e
    public final UCropPlusActivity getEditorActivity() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50271, new Class[0], UCropPlusActivity.class);
        if (patchProxyResultProxy.isSupported) {
            return (UCropPlusActivity) patchProxyResultProxy.result;
        }
        Activity activity = this.parentActivity;
        if (activity == null || !(activity instanceof UCropPlusActivity)) {
            return null;
        }
        kotlin.jvm.internal.f0.n(activity, "null cannot be cast to non-null type com.starlightc.ucropplus.ui.UCropPlusActivity");
        return (UCropPlusActivity) activity;
    }

    @dl.e
    public final l3.c getMBinding() {
        return this.mBinding;
    }

    @dl.d
    public final LayoutInflater getMInflater() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50266, new Class[0], LayoutInflater.class);
        if (patchProxyResultProxy.isSupported) {
            return (LayoutInflater) patchProxyResultProxy.result;
        }
        LayoutInflater layoutInflater = this.mInflater;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        kotlin.jvm.internal.f0.S("mInflater");
        return null;
    }

    @dl.d
    public final View getMRootView() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50268, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View view = this.mRootView;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.f0.S("mRootView");
        return null;
    }

    @dl.e
    public final Activity getParentActivity() {
        return this.parentActivity;
    }

    public abstract void initViews();

    public final boolean isActive() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50270, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return this.isActive && isAdded();
    }

    public abstract void loadData();

    @Override // androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onAttach(@dl.d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 50273, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(context, "context");
        super.onAttach(context);
        this.parentActivity = getActivity();
    }

    @Override // androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onCreate(@dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 50272, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        setStyle(1, R.style.BottomDialog);
    }

    @Override // androidx.fragment.app.Fragment
    @dl.e
    public View onCreateView(@dl.d LayoutInflater inflater, @dl.e ViewGroup viewGroup, @dl.e Bundle bundle) {
        View decorView;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inflater, viewGroup, bundle}, this, changeQuickRedirect, false, 50275, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(inflater, "inflater");
        UCropPlusActivity editorActivity = getEditorActivity();
        if (editorActivity != null) {
            editorActivity.setViewPagerScroll(false);
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.requestWindowFeature(1);
        }
        Dialog dialog2 = getDialog();
        Window window = dialog2 != null ? dialog2.getWindow() : null;
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setPadding(0, 0, 0, 0);
        }
        WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
        if (attributes != null) {
            attributes.width = -1;
        }
        if (attributes != null) {
            attributes.height = -2;
        }
        if (attributes != null) {
            attributes.gravity = 80;
        }
        if (attributes != null) {
            attributes.windowAnimations = R.style.BottomToTopAnim;
        }
        if (window != null) {
            window.setAttributes(attributes);
        }
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        setMInflater(inflater);
        bindViews();
        initViews();
        if (bundle != null && bundle.getBoolean("isHidden")) {
            getParentFragmentManager().u().u(this).m();
        }
        setCancelable(canOnBackPressed());
        this.isActive = true;
        return getMRootView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50281, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        this.isActive = false;
        UCropPlusActivity editorActivity = getEditorActivity();
        if (editorActivity != null) {
            editorActivity.setNavIconVisible(true);
        }
        UCropPlusActivity editorActivity2 = getEditorActivity();
        if (editorActivity2 != null) {
            editorActivity2.setViewPagerScroll(true);
        }
    }

    @Override // androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50277, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroyView();
        this.mBinding = null;
    }

    @Override // androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onDetach() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50274, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDetach();
        this.parentActivity = null;
    }

    @Override // androidx.fragment.app.j, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@dl.d DialogInterface dialog) {
        if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 50280, new Class[]{DialogInterface.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(dialog, "dialog");
        super.onDismiss(dialog);
        UCropPlusActivity editorActivity = getEditorActivity();
        if (editorActivity != null) {
            editorActivity.switchEditMode(EDIT_MODE.IDLE);
        }
        UCropPlusActivity editorActivity2 = getEditorActivity();
        if (editorActivity2 != null) {
            editorActivity2.changeNavigationBarColor(R.color.brand_color_primary);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@dl.d View view, @dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 50279, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(view, "view");
        super.onViewCreated(view, bundle);
        loadData();
    }

    public final void setActive(boolean z10) {
        this.isActive = z10;
    }

    public final void setDialogNoTouchable() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50276, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Dialog dialog = getDialog();
        Window window = dialog != null ? dialog.getWindow() : null;
        WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
        if (attributes != null) {
            attributes.flags = 32;
        }
        if (window == null) {
            return;
        }
        window.setAttributes(attributes);
    }

    public final void setMBinding(@dl.e l3.c cVar) {
        this.mBinding = cVar;
    }

    public final void setMInflater(@dl.d LayoutInflater layoutInflater) {
        if (PatchProxy.proxy(new Object[]{layoutInflater}, this, changeQuickRedirect, false, 50267, new Class[]{LayoutInflater.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(layoutInflater, "<set-?>");
        this.mInflater = layoutInflater;
    }

    public final void setMRootView(@dl.d View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 50269, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(view, "<set-?>");
        this.mRootView = view;
    }

    public final void setParentActivity(@dl.e Activity activity) {
        this.parentActivity = activity;
    }

    public final void setViewBinding(@dl.d l3.c binding) {
        if (PatchProxy.proxy(new Object[]{binding}, this, changeQuickRedirect, false, 50278, new Class[]{l3.c.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(binding, "binding");
        this.mBinding = binding;
        View root = binding.getRoot();
        kotlin.jvm.internal.f0.o(root, "getRoot(...)");
        setMRootView(root);
    }
}
