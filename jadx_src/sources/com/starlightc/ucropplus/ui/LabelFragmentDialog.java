package com.starlightc.ucropplus.ui;

import android.content.Context;
import android.view.View;
import android.widget.RadioGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.R;
import com.starlightc.ucropplus.databinding.FragmentLabelBinding;
import com.starlightc.ucropplus.model.TextColorInfo;
import com.starlightc.ucropplus.util.CommonRecyclerViewAdapter;
import com.starlightc.ucropplus.util.ModuleUtil;
import com.starlightc.ucropplus.view.StickerView;
import com.starlightc.ucropplus.view.widget.stickeritem.LabelStickerItem;
import java.util.ArrayList;

/* JADX INFO: compiled from: LabelFragmentDialog.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class LabelFragmentDialog extends BaseFragmentDialog {
    public static ChangeQuickRedirect changeQuickRedirect;
    public FragmentLabelBinding binding;
    public CommonRecyclerViewAdapter<TextColorInfo> colorAdapter;

    @dl.d
    private final ArrayList<TextColorInfo> colorList = new ArrayList<>();
    private int currentColorIndex = 2;
    private boolean isViewCreated;
    public RecyclerView rvColor;

    public static final /* synthetic */ void access$bindTextColor(LabelFragmentDialog labelFragmentDialog, CommonRecyclerViewAdapter.CommonViewHolder commonViewHolder, TextColorInfo textColorInfo, int i10) {
        if (PatchProxy.proxy(new Object[]{labelFragmentDialog, commonViewHolder, textColorInfo, new Integer(i10)}, null, changeQuickRedirect, true, 50321, new Class[]{LabelFragmentDialog.class, CommonRecyclerViewAdapter.CommonViewHolder.class, TextColorInfo.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        labelFragmentDialog.bindTextColor(commonViewHolder, textColorInfo, i10);
    }

    private final void bindTextColor(CommonRecyclerViewAdapter.CommonViewHolder commonViewHolder, TextColorInfo textColorInfo, final int i10) {
        if (PatchProxy.proxy(new Object[]{commonViewHolder, textColorInfo, new Integer(i10)}, this, changeQuickRedirect, false, 50311, new Class[]{CommonRecyclerViewAdapter.CommonViewHolder.class, TextColorInfo.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        View viewFindViewById = commonViewHolder.findViewById(R.id.v_color_preview);
        ModuleUtil moduleUtil = ModuleUtil.INSTANCE;
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.f0.o(contextRequireContext, "requireContext(...)");
        viewFindViewById.setBackground(moduleUtil.generateCircleDrawable(contextRequireContext, textColorInfo.getValue(), i10 == this.currentColorIndex));
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.starlightc.ucropplus.ui.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LabelFragmentDialog.bindTextColor$lambda$4(this.f98082b, i10, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindTextColor$lambda$4(LabelFragmentDialog this$0, int i10, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, new Integer(i10), view}, null, changeQuickRedirect, true, 50320, new Class[]{LabelFragmentDialog.class, Integer.TYPE, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        if (this$0.currentColorIndex != i10) {
            this$0.getColorAdapter().notifyItemChanged(this$0.currentColorIndex);
            this$0.currentColorIndex = i10;
            this$0.getColorAdapter().notifyItemChanged(this$0.currentColorIndex);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$0(LabelFragmentDialog this$0, View view) throws InterruptedException {
        UCropPlusFragment currentCropFragment;
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, 50316, new Class[]{LabelFragmentDialog.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        UCropPlusActivity editorActivity = this$0.getEditorActivity();
        if (editorActivity != null && (currentCropFragment = editorActivity.getCurrentCropFragment()) != null) {
            currentCropFragment.recoverStateInfoBeforeOpenWindow();
        }
        this$0.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$1(LabelFragmentDialog this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, 50317, new Class[]{LabelFragmentDialog.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        this$0.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$2(LabelFragmentDialog this$0, RadioGroup radioGroup, int i10) {
        UCropPlusActivity editorActivity;
        if (PatchProxy.proxy(new Object[]{this$0, radioGroup, new Integer(i10)}, null, changeQuickRedirect, true, 50318, new Class[]{LabelFragmentDialog.class, RadioGroup.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        if (i10 == R.id.rb_rec) {
            UCropPlusActivity editorActivity2 = this$0.getEditorActivity();
            if (editorActivity2 != null) {
                editorActivity2.setCurrentLabelType(LabelStickerItem.LabelType.RECTANGLE);
                return;
            }
            return;
        }
        if (i10 == R.id.rb_circle) {
            UCropPlusActivity editorActivity3 = this$0.getEditorActivity();
            if (editorActivity3 != null) {
                editorActivity3.setCurrentLabelType(LabelStickerItem.LabelType.CIRCLE);
                return;
            }
            return;
        }
        if (i10 != R.id.rb_arrow || (editorActivity = this$0.getEditorActivity()) == null) {
            return;
        }
        editorActivity.setCurrentLabelType(LabelStickerItem.LabelType.ARROW);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$3(LabelFragmentDialog this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, 50319, new Class[]{LabelFragmentDialog.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        UCropPlusActivity editorActivity = this$0.getEditorActivity();
        if (editorActivity != null) {
            editorActivity.removeFirstLabelStickerItem();
        }
    }

    private final void loadLocalColor() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50313, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.colorList.addAll(ModuleUtil.INSTANCE.getColorList());
        getColorAdapter().notifyDataSetChanged();
    }

    @Override // com.starlightc.ucropplus.ui.BaseFragmentDialog
    public void bindViews() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50309, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        FragmentLabelBinding fragmentLabelBindingInflate = FragmentLabelBinding.inflate(getMInflater());
        kotlin.jvm.internal.f0.o(fragmentLabelBindingInflate, "inflate(...)");
        setBinding(fragmentLabelBindingInflate);
        setViewBinding(getBinding());
        RecyclerView rvColor = getBinding().rvColor;
        kotlin.jvm.internal.f0.o(rvColor, "rvColor");
        setRvColor(rvColor);
    }

    @Override // com.starlightc.ucropplus.ui.BaseFragmentDialog
    public boolean canOnBackPressed() {
        return false;
    }

    @dl.d
    public final FragmentLabelBinding getBinding() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50303, new Class[0], FragmentLabelBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (FragmentLabelBinding) patchProxyResultProxy.result;
        }
        FragmentLabelBinding fragmentLabelBinding = this.binding;
        if (fragmentLabelBinding != null) {
            return fragmentLabelBinding;
        }
        kotlin.jvm.internal.f0.S("binding");
        return null;
    }

    @dl.d
    public final CommonRecyclerViewAdapter<TextColorInfo> getColorAdapter() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50307, new Class[0], CommonRecyclerViewAdapter.class);
        if (patchProxyResultProxy.isSupported) {
            return (CommonRecyclerViewAdapter) patchProxyResultProxy.result;
        }
        CommonRecyclerViewAdapter<TextColorInfo> commonRecyclerViewAdapter = this.colorAdapter;
        if (commonRecyclerViewAdapter != null) {
            return commonRecyclerViewAdapter;
        }
        kotlin.jvm.internal.f0.S("colorAdapter");
        return null;
    }

    @dl.d
    public final ArrayList<TextColorInfo> getColorList() {
        return this.colorList;
    }

    public final int getCurrentColor() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50314, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.colorList.get(this.currentColorIndex).getValue();
    }

    public final int getCurrentColorIndex() {
        return this.currentColorIndex;
    }

    @dl.d
    public final RecyclerView getRvColor() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50305, new Class[0], RecyclerView.class);
        if (patchProxyResultProxy.isSupported) {
            return (RecyclerView) patchProxyResultProxy.result;
        }
        RecyclerView recyclerView = this.rvColor;
        if (recyclerView != null) {
            return recyclerView;
        }
        kotlin.jvm.internal.f0.S("rvColor");
        return null;
    }

    @Override // com.starlightc.ucropplus.ui.BaseFragmentDialog
    public void initViews() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50310, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setDialogNoTouchable();
        getBinding().ivClose.setOnClickListener(new View.OnClickListener() { // from class: com.starlightc.ucropplus.ui.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws InterruptedException {
                LabelFragmentDialog.initViews$lambda$0(this.f98085b, view);
            }
        });
        getBinding().ivConfirm.setOnClickListener(new View.OnClickListener() { // from class: com.starlightc.ucropplus.ui.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LabelFragmentDialog.initViews$lambda$1(this.f98087b, view);
            }
        });
        getRvColor().setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        getRvColor().addItemDecoration(new com.max.hbcustomview.d(ViewUtils.f(getContext(), 10.0f), ViewUtils.f(getContext(), 14.0f)));
        setColorAdapter(new CommonRecyclerViewAdapter<TextColorInfo>(this.colorList, R.layout.item_color) { // from class: com.starlightc.ucropplus.ui.LabelFragmentDialog.initViews.3
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: bindViewHolder, reason: avoid collision after fix types in other method */
            public void bindViewHolder2(@dl.d CommonRecyclerViewAdapter.CommonViewHolder holder, @dl.d TextColorInfo data, int i10) {
                if (PatchProxy.proxy(new Object[]{holder, data, new Integer(i10)}, this, changeQuickRedirect, false, 50322, new Class[]{CommonRecyclerViewAdapter.CommonViewHolder.class, TextColorInfo.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(holder, "holder");
                kotlin.jvm.internal.f0.p(data, "data");
                LabelFragmentDialog.access$bindTextColor(LabelFragmentDialog.this, holder, data, i10);
            }

            @Override // com.starlightc.ucropplus.util.CommonRecyclerViewAdapter
            public /* bridge */ /* synthetic */ void bindViewHolder(CommonRecyclerViewAdapter.CommonViewHolder commonViewHolder, TextColorInfo textColorInfo, int i10) {
                if (PatchProxy.proxy(new Object[]{commonViewHolder, textColorInfo, new Integer(i10)}, this, changeQuickRedirect, false, 50323, new Class[]{CommonRecyclerViewAdapter.CommonViewHolder.class, Object.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                bindViewHolder2(commonViewHolder, textColorInfo, i10);
            }
        });
        getRvColor().setAdapter(getColorAdapter());
        getBinding().f98058rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.starlightc.ucropplus.ui.h
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i10) {
                LabelFragmentDialog.initViews$lambda$2(this.f98089a, radioGroup, i10);
            }
        });
        getBinding().vgUndo.setOnClickListener(new View.OnClickListener() { // from class: com.starlightc.ucropplus.ui.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LabelFragmentDialog.initViews$lambda$3(this.f98092b, view);
            }
        });
    }

    public final boolean isViewCreated() {
        return this.isViewCreated;
    }

    @Override // com.starlightc.ucropplus.ui.BaseFragmentDialog
    public void loadData() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50312, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.isViewCreated = true;
        loadLocalColor();
    }

    @Override // com.starlightc.ucropplus.ui.BaseFragmentDialog, androidx.fragment.app.Fragment
    public void onDestroy() {
        UCropPlusFragment currentCropFragment;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50315, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        UCropPlusActivity editorActivity = getEditorActivity();
        StickerView stickerView = (editorActivity == null || (currentCropFragment = editorActivity.getCurrentCropFragment()) == null) ? null : currentCropFragment.getStickerView();
        if (stickerView == null) {
            return;
        }
        stickerView.setCurrentLabelType(LabelStickerItem.LabelType.RECTANGLE);
    }

    public final void setBinding(@dl.d FragmentLabelBinding fragmentLabelBinding) {
        if (PatchProxy.proxy(new Object[]{fragmentLabelBinding}, this, changeQuickRedirect, false, 50304, new Class[]{FragmentLabelBinding.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(fragmentLabelBinding, "<set-?>");
        this.binding = fragmentLabelBinding;
    }

    public final void setColorAdapter(@dl.d CommonRecyclerViewAdapter<TextColorInfo> commonRecyclerViewAdapter) {
        if (PatchProxy.proxy(new Object[]{commonRecyclerViewAdapter}, this, changeQuickRedirect, false, 50308, new Class[]{CommonRecyclerViewAdapter.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(commonRecyclerViewAdapter, "<set-?>");
        this.colorAdapter = commonRecyclerViewAdapter;
    }

    public final void setCurrentColorIndex(int i10) {
        this.currentColorIndex = i10;
    }

    public final void setRvColor(@dl.d RecyclerView recyclerView) {
        if (PatchProxy.proxy(new Object[]{recyclerView}, this, changeQuickRedirect, false, 50306, new Class[]{RecyclerView.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(recyclerView, "<set-?>");
        this.rvColor = recyclerView;
    }

    public final void setViewCreated(boolean z10) {
        this.isViewCreated = z10;
    }
}
