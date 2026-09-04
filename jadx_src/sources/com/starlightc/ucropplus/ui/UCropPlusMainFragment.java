package com.starlightc.ucropplus.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.databinding.UcpMainFragmentBinding;
import com.starlightc.ucropplus.enums.EDIT_MODE;

/* JADX INFO: compiled from: UCropPlusMainFragment.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class UCropPlusMainFragment extends Fragment {
    public static ChangeQuickRedirect changeQuickRedirect;
    public UcpMainFragmentBinding binding;

    @dl.e
    private l3.c mBinding;
    private LayoutInflater mInflater;
    private View mRootView;

    @dl.e
    private Activity parentActivity;

    private final UCropPlusActivity getUCropPlusActivity() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50874, new Class[0], UCropPlusActivity.class);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$0(UCropPlusMainFragment this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, 50885, new Class[]{UCropPlusMainFragment.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        UCropPlusActivity uCropPlusActivity = this$0.getUCropPlusActivity();
        if (uCropPlusActivity != null) {
            uCropPlusActivity.switchEditMode(EDIT_MODE.STICKER);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$1(UCropPlusMainFragment this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, 50886, new Class[]{UCropPlusMainFragment.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        UCropPlusActivity uCropPlusActivity = this$0.getUCropPlusActivity();
        if (uCropPlusActivity != null) {
            uCropPlusActivity.switchEditMode(EDIT_MODE.CROP);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$2(UCropPlusMainFragment this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, 50887, new Class[]{UCropPlusMainFragment.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        UCropPlusActivity uCropPlusActivity = this$0.getUCropPlusActivity();
        if (uCropPlusActivity != null) {
            uCropPlusActivity.switchEditMode(EDIT_MODE.TEXT);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$3(UCropPlusMainFragment this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, 50888, new Class[]{UCropPlusMainFragment.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        UCropPlusActivity uCropPlusActivity = this$0.getUCropPlusActivity();
        if (uCropPlusActivity != null) {
            uCropPlusActivity.saveImage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$4(UCropPlusMainFragment this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, 50889, new Class[]{UCropPlusMainFragment.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        UCropPlusActivity uCropPlusActivity = this$0.getUCropPlusActivity();
        if (uCropPlusActivity != null) {
            uCropPlusActivity.showDialog(EDIT_MODE.MODULE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$5(UCropPlusMainFragment this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, 50890, new Class[]{UCropPlusMainFragment.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        UCropPlusActivity uCropPlusActivity = this$0.getUCropPlusActivity();
        if (uCropPlusActivity != null) {
            uCropPlusActivity.switchEditMode(EDIT_MODE.LABEL);
        }
    }

    public final void bindViews() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50881, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        LayoutInflater layoutInflater = this.mInflater;
        if (layoutInflater == null) {
            kotlin.jvm.internal.f0.S("mInflater");
            layoutInflater = null;
        }
        UcpMainFragmentBinding ucpMainFragmentBindingInflate = UcpMainFragmentBinding.inflate(layoutInflater);
        kotlin.jvm.internal.f0.o(ucpMainFragmentBindingInflate, "inflate(...)");
        setBinding(ucpMainFragmentBindingInflate);
        setViewBinding(getBinding());
    }

    @dl.d
    public final UcpMainFragmentBinding getBinding() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50872, new Class[0], UcpMainFragmentBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (UcpMainFragmentBinding) patchProxyResultProxy.result;
        }
        UcpMainFragmentBinding ucpMainFragmentBinding = this.binding;
        if (ucpMainFragmentBinding != null) {
            return ucpMainFragmentBinding;
        }
        kotlin.jvm.internal.f0.S("binding");
        return null;
    }

    public final void initViews() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50882, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        getBinding().vgSticker.setOnClickListener(new View.OnClickListener() { // from class: com.starlightc.ucropplus.ui.k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UCropPlusMainFragment.initViews$lambda$0(this.f98097b, view);
            }
        });
        getBinding().vgCutting.setOnClickListener(new View.OnClickListener() { // from class: com.starlightc.ucropplus.ui.l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UCropPlusMainFragment.initViews$lambda$1(this.f98102b, view);
            }
        });
        getBinding().vgText.setOnClickListener(new View.OnClickListener() { // from class: com.starlightc.ucropplus.ui.m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UCropPlusMainFragment.initViews$lambda$2(this.f98105b, view);
            }
        });
        getBinding().btnNext.setOnClickListener(new View.OnClickListener() { // from class: com.starlightc.ucropplus.ui.n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UCropPlusMainFragment.initViews$lambda$3(this.f98107b, view);
            }
        });
        getBinding().vgModule.setOnClickListener(new View.OnClickListener() { // from class: com.starlightc.ucropplus.ui.o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UCropPlusMainFragment.initViews$lambda$4(this.f98109b, view);
            }
        });
        getBinding().vgLabel.setOnClickListener(new View.OnClickListener() { // from class: com.starlightc.ucropplus.ui.p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UCropPlusMainFragment.initViews$lambda$5(this.f98111b, view);
            }
        });
    }

    public final void loadData() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@dl.d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 50875, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(context, "context");
        super.onAttach(context);
        this.parentActivity = getActivity();
    }

    @Override // androidx.fragment.app.Fragment
    @dl.d
    public View onCreateView(@dl.d LayoutInflater inflater, @dl.e ViewGroup viewGroup, @dl.e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inflater, viewGroup, bundle}, this, changeQuickRedirect, false, 50877, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(inflater, "inflater");
        this.mInflater = inflater;
        bindViews();
        initViews();
        if (bundle != null && bundle.getBoolean("isHidden")) {
            getParentFragmentManager().u().u(this).m();
        }
        View view = this.mRootView;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.f0.S("mRootView");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50878, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroyView();
        this.mBinding = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50876, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDetach();
        this.parentActivity = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@dl.d View view, @dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 50880, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(view, "view");
        super.onViewCreated(view, bundle);
        loadData();
    }

    public final void setBinding(@dl.d UcpMainFragmentBinding ucpMainFragmentBinding) {
        if (PatchProxy.proxy(new Object[]{ucpMainFragmentBinding}, this, changeQuickRedirect, false, 50873, new Class[]{UcpMainFragmentBinding.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(ucpMainFragmentBinding, "<set-?>");
        this.binding = ucpMainFragmentBinding;
    }

    public final void setVgCuttingVisibility(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 50883, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        getBinding().vgCutting.setVisibility(i10);
    }

    public final void setVgModuleVisibility(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 50884, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        getBinding().vgModule.setVisibility(i10);
    }

    public final void setViewBinding(@dl.d l3.c binding) {
        if (PatchProxy.proxy(new Object[]{binding}, this, changeQuickRedirect, false, 50879, new Class[]{l3.c.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(binding, "binding");
        this.mBinding = binding;
        View root = binding.getRoot();
        kotlin.jvm.internal.f0.o(root, "getRoot(...)");
        this.mRootView = root;
    }
}
