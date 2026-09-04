package com.starlightc.ucropplus.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bumptech.glide.Glide;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.R;
import com.starlightc.ucropplus.databinding.FragmentCropBinding;
import com.starlightc.ucropplus.enums.EDIT_MODE;
import com.starlightc.ucropplus.model.CropRatioInfo;
import com.starlightc.ucropplus.util.CommonRecyclerViewAdapter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.v0;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;

/* JADX INFO: compiled from: CropFragmentDialog.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class CropFragmentDialog extends BaseFragmentDialog {

    @dl.d
    public static final String ARG_CROP_RATIO_LIST = "ARG_CROP_RATIO_LIST";

    @dl.d
    public static final Companion Companion = new Companion(null);
    public static ChangeQuickRedirect changeQuickRedirect;
    public CommonRecyclerViewAdapter<CropRatioInfo> adapter;
    private FragmentCropBinding binding;
    private boolean isCropped;

    @dl.d
    private final q0 uiScope = r0.a(e1.e());

    @dl.d
    private final ArrayList<CropRatioInfo> ratioList = new ArrayList<>();

    /* JADX INFO: compiled from: CropFragmentDialog.kt */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final CropFragmentDialog newInstance(@dl.e ArrayList<CropRatioInfo> arrayList) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 50295, new Class[]{ArrayList.class}, CropFragmentDialog.class);
            if (patchProxyResultProxy.isSupported) {
                return (CropFragmentDialog) patchProxyResultProxy.result;
            }
            CropFragmentDialog cropFragmentDialog = new CropFragmentDialog();
            Bundle bundle = new Bundle();
            if (arrayList != null && arrayList.size() > 0) {
                bundle.putSerializable(CropFragmentDialog.ARG_CROP_RATIO_LIST, arrayList);
            }
            cropFragmentDialog.setArguments(bundle);
            return cropFragmentDialog;
        }
    }

    /* JADX INFO: renamed from: com.starlightc.ucropplus.ui.CropFragmentDialog$initViews$4, reason: invalid class name */
    /* JADX INFO: compiled from: CropFragmentDialog.kt */
    @t0({"SMAP\nCropFragmentDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CropFragmentDialog.kt\ncom/starlightc/ucropplus/ui/CropFragmentDialog$initViews$4\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,179:1\n1#2:180\n*E\n"})
    public static final class AnonymousClass4 extends CommonRecyclerViewAdapter<CropRatioInfo> {
        public static ChangeQuickRedirect changeQuickRedirect;

        AnonymousClass4(ArrayList<CropRatioInfo> arrayList, int i10) {
            super(arrayList, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bindViewHolder$lambda$4(AnonymousClass4 this$0, CropRatioInfo data, CropFragmentDialog this$1, View view) {
            if (PatchProxy.proxy(new Object[]{this$0, data, this$1, view}, null, changeQuickRedirect, true, 50297, new Class[]{AnonymousClass4.class, CropRatioInfo.class, CropFragmentDialog.class, View.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(this$0, "this$0");
            kotlin.jvm.internal.f0.p(data, "$data");
            kotlin.jvm.internal.f0.p(this$1, "this$1");
            Iterator<CropRatioInfo> it = this$0.getDataList().iterator();
            while (it.hasNext()) {
                it.next().setSelected(false);
            }
            data.setSelected(true);
            UCropPlusActivity editorActivity = this$1.getEditorActivity();
            if (editorActivity != null) {
                UCropPlusActivity.setTargetAspectRatio$default(editorActivity, data.getWidth(), data.getHeight(), false, 4, null);
            }
            this$1.getAdapter().notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: bindViewHolder, reason: avoid collision after fix types in other method */
        public void bindViewHolder2(@dl.d CommonRecyclerViewAdapter.CommonViewHolder holder, @dl.d final CropRatioInfo data, int i10) {
            if (PatchProxy.proxy(new Object[]{holder, data, new Integer(i10)}, this, changeQuickRedirect, false, 50296, new Class[]{CommonRecyclerViewAdapter.CommonViewHolder.class, CropRatioInfo.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(holder, "holder");
            kotlin.jvm.internal.f0.p(data, "data");
            ic.a aVar = ic.a.f119343a;
            Context contextRequireContext = CropFragmentDialog.this.requireContext();
            kotlin.jvm.internal.f0.o(contextRequireContext, "requireContext(...)");
            int iD = (aVar.d(contextRequireContext) * CropFragmentDialog.this.getRatioList().size()) / (CropFragmentDialog.this.getRatioList().size() + 1);
            Context contextRequireContext2 = CropFragmentDialog.this.requireContext();
            kotlin.jvm.internal.f0.o(contextRequireContext2, "requireContext(...)");
            int iB = (iD - aVar.b(contextRequireContext2, 48)) / CropFragmentDialog.this.getRatioList().size();
            ViewGroup viewGroup = (ViewGroup) holder.findViewById(R.id.vg_container);
            ImageView imageView = (ImageView) holder.findViewById(R.id.iv_crop_ratio_img);
            TextView textView = (TextView) holder.findViewById(R.id.tv_crop_ratio);
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            layoutParams.width = iB;
            viewGroup.setLayoutParams(layoutParams);
            Glide.H(CropFragmentDialog.this).load(data.getImgUrl()).C1(imageView);
            String name = data.getName();
            if (name == null) {
                v0 v0Var = v0.f124986a;
                name = String.format("%d:%d", Arrays.copyOf(new Object[]{Integer.valueOf(data.getWidth()), Integer.valueOf(data.getHeight())}, 2));
                kotlin.jvm.internal.f0.o(name, "format(...)");
            }
            textView.setText(name);
            if (data.isSelected()) {
                Resources resources = CropFragmentDialog.this.getResources();
                int i11 = R.color.background_layer_2_color;
                textView.setTextColor(androidx.core.content.res.i.e(resources, i11, null));
                Context context = CropFragmentDialog.this.getContext();
                imageView.setImageTintList(context != null ? ColorStateList.valueOf(androidx.core.content.d.f(context, i11)) : null);
            } else {
                Resources resources2 = CropFragmentDialog.this.getResources();
                int i12 = R.color.white_alpha40;
                textView.setTextColor(androidx.core.content.res.i.e(resources2, i12, null));
                Context context2 = CropFragmentDialog.this.getContext();
                imageView.setImageTintList(context2 != null ? ColorStateList.valueOf(androidx.core.content.d.f(context2, i12)) : null);
            }
            View view = holder.itemView;
            final CropFragmentDialog cropFragmentDialog = CropFragmentDialog.this;
            view.setOnClickListener(new View.OnClickListener() { // from class: com.starlightc.ucropplus.ui.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    CropFragmentDialog.AnonymousClass4.bindViewHolder$lambda$4(this.f98078b, data, cropFragmentDialog, view2);
                }
            });
        }

        @Override // com.starlightc.ucropplus.util.CommonRecyclerViewAdapter
        public /* bridge */ /* synthetic */ void bindViewHolder(CommonRecyclerViewAdapter.CommonViewHolder commonViewHolder, CropRatioInfo cropRatioInfo, int i10) {
            if (PatchProxy.proxy(new Object[]{commonViewHolder, cropRatioInfo, new Integer(i10)}, this, changeQuickRedirect, false, 50298, new Class[]{CommonRecyclerViewAdapter.CommonViewHolder.class, Object.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            bindViewHolder2(commonViewHolder, cropRatioInfo, i10);
        }
    }

    /* JADX INFO: renamed from: com.starlightc.ucropplus.ui.CropFragmentDialog$loadData$1, reason: invalid class name */
    /* JADX INFO: compiled from: CropFragmentDialog.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.starlightc.ucropplus.ui.CropFragmentDialog$loadData$1", f = "CropFragmentDialog.kt", i = {}, l = {135}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;
        int label;

        AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 50300, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : CropFragmentDialog.this.new AnonymousClass1(cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 50302, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 50301, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50299, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.t0.n(obj);
                this.label = 1;
                if (DelayKt.b(100L, this) == objH) {
                    return objH;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.t0.n(obj);
            }
            UCropPlusActivity editorActivity = CropFragmentDialog.this.getEditorActivity();
            if (editorActivity != null) {
                UCropPlusActivity.setTargetAspectRatio$default(editorActivity, CropFragmentDialog.this.getRatioList().get(0).getWidth(), CropFragmentDialog.this.getRatioList().get(0).getHeight(), false, 4, null);
            }
            return b2.f124493a;
        }
    }

    private final void applyCrop() throws IOException {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50288, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        UCropPlusActivity editorActivity = getEditorActivity();
        if (editorActivity != null) {
            editorActivity.applyCrop();
        }
        this.isCropped = true;
        dismiss();
    }

    private final void back2Main() throws Exception {
        UCropPlusActivity editorActivity;
        UCropPlusFragment currentCropFragment;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50291, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (!this.isCropped && (editorActivity = getEditorActivity()) != null && (currentCropFragment = editorActivity.getCurrentCropFragment()) != null) {
            currentCropFragment.loadEditImage();
        }
        UCropPlusActivity editorActivity2 = getEditorActivity();
        if (editorActivity2 != null) {
            editorActivity2.switchEditMode(EDIT_MODE.IDLE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$0(CropFragmentDialog this$0, View view) {
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, 50292, new Class[]{CropFragmentDialog.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        UCropPlusActivity editorActivity = this$0.getEditorActivity();
        if (editorActivity != null && editorActivity.getOnlyCrop()) {
            z10 = true;
        }
        if (z10) {
            UCropPlusActivity editorActivity2 = this$0.getEditorActivity();
            if (editorActivity2 != null) {
                editorActivity2.finish();
                return;
            }
            return;
        }
        UCropPlusActivity editorActivity3 = this$0.getEditorActivity();
        if (editorActivity3 != null) {
            editorActivity3.switchEditMode(EDIT_MODE.IDLE);
        }
        this$0.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$1(CropFragmentDialog this$0, View view) throws IOException {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, 50293, new Class[]{CropFragmentDialog.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        this$0.applyCrop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$2(CropFragmentDialog this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, 50294, new Class[]{CropFragmentDialog.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        this$0.rotateImage();
    }

    private final void loadLocalData() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50287, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.ratioList.add(new CropRatioInfo(0, 1, true, "file:///android_asset/ratio/ucp_ratio_origin.png", getString(R.string.ucp_original), false, 32, null));
        this.ratioList.add(new CropRatioInfo(0, -1, false, "file:///android_asset/ratio/ucp_ratio_free.png", getString(R.string.ucp_free_crop), false, 32, null));
        this.ratioList.add(new CropRatioInfo(3, 4, false, "file:///android_asset/ratio/ucp_ratio_3x4.png", null, false, 32, null));
        this.ratioList.add(new CropRatioInfo(1, 1, false, "file:///android_asset/ratio/ucp_ratio_1.png", null, false, 32, null));
        this.ratioList.add(new CropRatioInfo(4, 3, false, "file:///android_asset/ratio/ucp_ratio_4x3.png", null, false, 32, null));
    }

    private final void loadRemoteData() {
    }

    private final void rotateImage() {
        UCropPlusActivity editorActivity;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50289, new Class[0], Void.TYPE).isSupported || (editorActivity = getEditorActivity()) == null) {
            return;
        }
        editorActivity.rotateByAngle(-90);
    }

    @Override // com.starlightc.ucropplus.ui.BaseFragmentDialog
    public void bindViews() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50284, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        FragmentCropBinding fragmentCropBindingInflate = FragmentCropBinding.inflate(getMInflater());
        kotlin.jvm.internal.f0.o(fragmentCropBindingInflate, "inflate(...)");
        this.binding = fragmentCropBindingInflate;
        if (fragmentCropBindingInflate == null) {
            kotlin.jvm.internal.f0.S("binding");
            fragmentCropBindingInflate = null;
        }
        setViewBinding(fragmentCropBindingInflate);
    }

    @Override // com.starlightc.ucropplus.ui.BaseFragmentDialog
    public boolean canOnBackPressed() {
        return false;
    }

    @dl.d
    public final CommonRecyclerViewAdapter<CropRatioInfo> getAdapter() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50282, new Class[0], CommonRecyclerViewAdapter.class);
        if (patchProxyResultProxy.isSupported) {
            return (CommonRecyclerViewAdapter) patchProxyResultProxy.result;
        }
        CommonRecyclerViewAdapter<CropRatioInfo> commonRecyclerViewAdapter = this.adapter;
        if (commonRecyclerViewAdapter != null) {
            return commonRecyclerViewAdapter;
        }
        kotlin.jvm.internal.f0.S("adapter");
        return null;
    }

    @dl.d
    public final ArrayList<CropRatioInfo> getRatioList() {
        return this.ratioList;
    }

    @Override // com.starlightc.ucropplus.ui.BaseFragmentDialog
    public void initViews() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50285, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setDialogNoTouchable();
        FragmentCropBinding fragmentCropBinding = this.binding;
        FragmentCropBinding fragmentCropBinding2 = null;
        if (fragmentCropBinding == null) {
            kotlin.jvm.internal.f0.S("binding");
            fragmentCropBinding = null;
        }
        fragmentCropBinding.ivClose.setOnClickListener(new View.OnClickListener() { // from class: com.starlightc.ucropplus.ui.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CropFragmentDialog.initViews$lambda$0(this.f98071b, view);
            }
        });
        FragmentCropBinding fragmentCropBinding3 = this.binding;
        if (fragmentCropBinding3 == null) {
            kotlin.jvm.internal.f0.S("binding");
            fragmentCropBinding3 = null;
        }
        fragmentCropBinding3.ivCheck.setOnClickListener(new View.OnClickListener() { // from class: com.starlightc.ucropplus.ui.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws IOException {
                CropFragmentDialog.initViews$lambda$1(this.f98073b, view);
            }
        });
        FragmentCropBinding fragmentCropBinding4 = this.binding;
        if (fragmentCropBinding4 == null) {
            kotlin.jvm.internal.f0.S("binding");
            fragmentCropBinding4 = null;
        }
        fragmentCropBinding4.vgRotate.setOnClickListener(new View.OnClickListener() { // from class: com.starlightc.ucropplus.ui.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CropFragmentDialog.initViews$lambda$2(this.f98075b, view);
            }
        });
        setAdapter(new AnonymousClass4(this.ratioList, R.layout.item_crop_ratio));
        FragmentCropBinding fragmentCropBinding5 = this.binding;
        if (fragmentCropBinding5 == null) {
            kotlin.jvm.internal.f0.S("binding");
            fragmentCropBinding5 = null;
        }
        fragmentCropBinding5.rvCropRatio.setAdapter(getAdapter());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(0);
        FragmentCropBinding fragmentCropBinding6 = this.binding;
        if (fragmentCropBinding6 == null) {
            kotlin.jvm.internal.f0.S("binding");
        } else {
            fragmentCropBinding2 = fragmentCropBinding6;
        }
        fragmentCropBinding2.rvCropRatio.setLayoutManager(linearLayoutManager);
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCancelable(false);
        }
    }

    public final boolean isCropped() {
        return this.isCropped;
    }

    @Override // com.starlightc.ucropplus.ui.BaseFragmentDialog
    public void loadData() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50286, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Bundle arguments = getArguments();
        ArrayList arrayList = (ArrayList) (arguments != null ? arguments.getSerializable(ARG_CROP_RATIO_LIST) : null);
        if (com.max.hbcommon.utils.c.w(arrayList)) {
            loadLocalData();
            loadRemoteData();
        } else {
            ArrayList<CropRatioInfo> arrayList2 = this.ratioList;
            kotlin.jvm.internal.f0.m(arrayList);
            arrayList2.addAll(arrayList);
        }
        FragmentCropBinding fragmentCropBinding = this.binding;
        if (fragmentCropBinding == null) {
            kotlin.jvm.internal.f0.S("binding");
            fragmentCropBinding = null;
        }
        ViewGroup.LayoutParams layoutParams = fragmentCropBinding.rvCropRatio.getLayoutParams();
        kotlin.jvm.internal.f0.n(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        ((LinearLayout.LayoutParams) layoutParams).weight = this.ratioList.size();
        getAdapter().notifyItemRangeChanged(0, this.ratioList.size());
        kotlinx.coroutines.k.f(this.uiScope, null, null, new AnonymousClass1(null), 3, null);
    }

    @Override // com.starlightc.ucropplus.ui.BaseFragmentDialog, androidx.fragment.app.j, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@dl.d DialogInterface dialog) throws Exception {
        if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 50290, new Class[]{DialogInterface.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(dialog, "dialog");
        back2Main();
        super.onDismiss(dialog);
    }

    public final void setAdapter(@dl.d CommonRecyclerViewAdapter<CropRatioInfo> commonRecyclerViewAdapter) {
        if (PatchProxy.proxy(new Object[]{commonRecyclerViewAdapter}, this, changeQuickRedirect, false, 50283, new Class[]{CommonRecyclerViewAdapter.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(commonRecyclerViewAdapter, "<set-?>");
        this.adapter = commonRecyclerViewAdapter;
    }

    public final void setCropped(boolean z10) {
        this.isCropped = z10;
    }
}
