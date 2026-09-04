package com.starlightc.ucropplus.ui;

import android.app.Activity;
import android.graphics.Typeface;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.network.entities.ApiResponse;
import com.max.network.utils.FlowUtilKt;
import com.max.network.utils.ResultBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.starlightc.ucropplus.R;
import com.starlightc.ucropplus.databinding.FragmentTextStyleBinding;
import com.starlightc.ucropplus.model.AdvanceTypefaceList;
import com.starlightc.ucropplus.model.RemoteTextRenderInfo;
import com.starlightc.ucropplus.model.TextRenderInfo;
import com.starlightc.ucropplus.network.ImageEditorRepository;
import com.starlightc.ucropplus.util.CommonRecyclerViewAdapter;
import com.starlightc.ucropplus.view.TextRenderPreview;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;

/* JADX INFO: compiled from: TextStyleFragment.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class TextStyleFragment extends com.max.hbcommon.base.d {
    public static ChangeQuickRedirect changeQuickRedirect;
    public CommonRecyclerViewAdapter<TextRenderInfo> advanceTypeFaceAdapter;
    public FragmentTextStyleBinding binding;
    private int mOffset;
    public RecyclerView rvTypeFace;
    public SmartRefreshLayout srl;

    @dl.d
    private final kotlin.z sampleTypeface$delegate = kotlin.b0.c(new yh.a<Typeface>() { // from class: com.starlightc.ucropplus.ui.TextStyleFragment$sampleTypeface$2
        public static ChangeQuickRedirect changeQuickRedirect;

        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // yh.a
        public final Typeface invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50573, new Class[0], Typeface.class);
            return patchProxyResultProxy.isSupported ? (Typeface) patchProxyResultProxy.result : Typeface.createFromAsset(this.this$0.getResources().getAssets(), "typeface/AliNormalBlack-HuaZiExample.ttf");
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [android.graphics.Typeface, java.lang.Object] */
        @Override // yh.a
        public /* bridge */ /* synthetic */ Typeface invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50574, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
        }
    });

    @dl.d
    private final kotlin.z remoteRepo$delegate = kotlin.b0.c(new yh.a<ImageEditorRepository>() { // from class: com.starlightc.ucropplus.ui.TextStyleFragment$remoteRepo$2
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // yh.a
        @dl.d
        public final ImageEditorRepository invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50571, new Class[0], ImageEditorRepository.class);
            return patchProxyResultProxy.isSupported ? (ImageEditorRepository) patchProxyResultProxy.result : new ImageEditorRepository();
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.starlightc.ucropplus.network.ImageEditorRepository, java.lang.Object] */
        @Override // yh.a
        public /* bridge */ /* synthetic */ ImageEditorRepository invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50572, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
        }
    });

    @dl.d
    private final kotlinx.coroutines.flow.j<ApiResponse<AdvanceTypefaceList>> _advanceTypefaceList = kotlinx.coroutines.flow.v.a(new ApiResponse(null, null, null, null, 15, null));

    @dl.d
    private final ArrayList<TextRenderInfo> list = new ArrayList<>();
    private final int mLimit = 30;

    /* JADX INFO: renamed from: com.starlightc.ucropplus.ui.TextStyleFragment$getAdvanceTypefaceList$1, reason: invalid class name */
    /* JADX INFO: compiled from: TextStyleFragment.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.starlightc.ucropplus.ui.TextStyleFragment", f = "TextStyleFragment.kt", i = {0}, l = {46}, m = "getAdvanceTypefaceList", n = {"this"}, s = {"L$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        public static ChangeQuickRedirect changeQuickRedirect;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50548, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TextStyleFragment.this.getAdvanceTypefaceList(this);
        }
    }

    /* JADX INFO: renamed from: com.starlightc.ucropplus.ui.TextStyleFragment$installViews$4, reason: invalid class name */
    /* JADX INFO: compiled from: TextStyleFragment.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.starlightc.ucropplus.ui.TextStyleFragment$installViews$4", f = "TextStyleFragment.kt", i = {}, l = {129}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass4 extends SuspendLambda implements yh.l<kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;
        int label;

        AnonymousClass4(kotlin.coroutines.c<? super AnonymousClass4> cVar) {
            super(1, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 50564, new Class[]{kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : TextStyleFragment.this.new AnonymousClass4(cVar);
        }

        @Override // yh.l
        public /* bridge */ /* synthetic */ Object invoke(kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 50566, new Class[]{Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 50565, new Class[]{kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass4) create(cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50563, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.label;
            if (i10 == 0) {
                t0.n(obj);
                TextStyleFragment textStyleFragment = TextStyleFragment.this;
                this.label = 1;
                if (textStyleFragment.getAdvanceTypefaceList(this) == objH) {
                    return objH;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t0.n(obj);
            }
            return b2.f124493a;
        }
    }

    /* JADX INFO: renamed from: com.starlightc.ucropplus.ui.TextStyleFragment$onRefresh$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TextStyleFragment.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.starlightc.ucropplus.ui.TextStyleFragment$onRefresh$1", f = "TextStyleFragment.kt", i = {}, l = {bb.c.b.f30940t0}, m = "invokeSuspend", n = {}, s = {})
    public static final class C13221 extends SuspendLambda implements yh.l<kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;
        int label;

        C13221(kotlin.coroutines.c<? super C13221> cVar) {
            super(1, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 50568, new Class[]{kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : TextStyleFragment.this.new C13221(cVar);
        }

        @Override // yh.l
        public /* bridge */ /* synthetic */ Object invoke(kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 50570, new Class[]{Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 50569, new Class[]{kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((C13221) create(cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50567, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.label;
            if (i10 == 0) {
                t0.n(obj);
                TextStyleFragment textStyleFragment = TextStyleFragment.this;
                this.label = 1;
                if (textStyleFragment.getAdvanceTypefaceList(this) == objH) {
                    return objH;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t0.n(obj);
            }
            return b2.f124493a;
        }
    }

    public static final /* synthetic */ void access$bindAdvanceTypeface(TextStyleFragment textStyleFragment, CommonRecyclerViewAdapter.CommonViewHolder commonViewHolder, TextRenderInfo textRenderInfo, int i10) {
        if (PatchProxy.proxy(new Object[]{textStyleFragment, commonViewHolder, textRenderInfo, new Integer(i10)}, null, changeQuickRedirect, true, 50545, new Class[]{TextStyleFragment.class, CommonRecyclerViewAdapter.CommonViewHolder.class, TextRenderInfo.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        textStyleFragment.bindAdvanceTypeface(commonViewHolder, textRenderInfo, i10);
    }

    public static final /* synthetic */ void access$showContentView(TextStyleFragment textStyleFragment) {
        if (PatchProxy.proxy(new Object[]{textStyleFragment}, null, changeQuickRedirect, true, 50546, new Class[]{TextStyleFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        textStyleFragment.showContentView();
    }

    public static final /* synthetic */ void access$showError(TextStyleFragment textStyleFragment) {
        if (PatchProxy.proxy(new Object[]{textStyleFragment}, null, changeQuickRedirect, true, 50547, new Class[]{TextStyleFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        textStyleFragment.showError();
    }

    private final void applyRenderInfo(TextRenderInfo textRenderInfo) {
        TextRenderInfo currentRenderInfo;
        if (PatchProxy.proxy(new Object[]{textRenderInfo}, this, changeQuickRedirect, false, 50539, new Class[]{TextRenderInfo.class}, Void.TYPE).isSupported || (currentRenderInfo = getCurrentRenderInfo()) == null) {
            return;
        }
        currentRenderInfo.setStrokeList(textRenderInfo.getStrokeList());
        currentRenderInfo.setShadowEnable(textRenderInfo.getShadowEnable());
        currentRenderInfo.setShadowColor(textRenderInfo.getShadowColor());
        currentRenderInfo.setShadowOffsetX(textRenderInfo.getShadowOffsetX());
        currentRenderInfo.setShadowOffsetY(textRenderInfo.getShadowOffsetY());
        currentRenderInfo.setTextColor(textRenderInfo.getTextColor());
        currentRenderInfo.setId(textRenderInfo.getId());
        currentRenderInfo.setUseRate(false);
        requestRefreshTextSticker();
    }

    private final void bindAdvanceTypeface(CommonRecyclerViewAdapter.CommonViewHolder commonViewHolder, final TextRenderInfo textRenderInfo, int i10) {
        if (PatchProxy.proxy(new Object[]{commonViewHolder, textRenderInfo, new Integer(i10)}, this, changeQuickRedirect, false, 50538, new Class[]{CommonRecyclerViewAdapter.CommonViewHolder.class, TextRenderInfo.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        TextRenderPreview textRenderPreview = (TextRenderPreview) commonViewHolder.findViewById(R.id.atp_preview);
        textRenderPreview.setTextSize(23.0f);
        textRenderPreview.initWithRenderInfo(textRenderInfo);
        textRenderPreview.setTypeface(getSampleTypeface());
        textRenderPreview.setSampleText("花字");
        commonViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.starlightc.ucropplus.ui.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TextStyleFragment.bindAdvanceTypeface$lambda$1(this.f98076b, textRenderInfo, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindAdvanceTypeface$lambda$1(TextStyleFragment this$0, TextRenderInfo data, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, data, view}, null, changeQuickRedirect, true, 50544, new Class[]{TextStyleFragment.class, TextRenderInfo.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        kotlin.jvm.internal.f0.p(data, "$data");
        if (this$0.getParentFragment() instanceof TextStickerFragmentDialog) {
            Fragment parentFragment = this$0.getParentFragment();
            kotlin.jvm.internal.f0.n(parentFragment, "null cannot be cast to non-null type com.starlightc.ucropplus.ui.TextStickerFragmentDialog");
            ((TextStickerFragmentDialog) parentFragment).clearAdvanceTypefaceCheck();
        }
        this$0.applyRenderInfo(data);
    }

    private final TextRenderInfo getCurrentRenderInfo() {
        UCropPlusFragment currentCropFragment;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50540, new Class[0], TextRenderInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextRenderInfo) patchProxyResultProxy.result;
        }
        UCropPlusActivity editorActivity = getEditorActivity();
        if (editorActivity == null || (currentCropFragment = editorActivity.getCurrentCropFragment()) == null) {
            return null;
        }
        return currentCropFragment.getCurrentTextRenderInfo();
    }

    private final ImageEditorRepository getRemoteRepo() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50526, new Class[0], ImageEditorRepository.class);
        return patchProxyResultProxy.isSupported ? (ImageEditorRepository) patchProxyResultProxy.result : (ImageEditorRepository) this.remoteRepo$delegate.getValue();
    }

    private final Typeface getSampleTypeface() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50524, new Class[0], Typeface.class);
        if (patchProxyResultProxy.isSupported) {
            return (Typeface) patchProxyResultProxy.result;
        }
        Object value = this.sampleTypeface$delegate.getValue();
        kotlin.jvm.internal.f0.o(value, "getValue(...)");
        return (Typeface) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void installViews$lambda$0(TextStyleFragment this$0, ng.j it) {
        if (PatchProxy.proxy(new Object[]{this$0, it}, null, changeQuickRedirect, true, 50543, new Class[]{TextStyleFragment.class, ng.j.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        kotlin.jvm.internal.f0.p(it, "it");
        FlowUtilKt.launchRequest(this$0, new TextStyleFragment$installViews$3$1(this$0, null));
    }

    private final void requestRefreshTextSticker() {
        UCropPlusActivity editorActivity;
        UCropPlusFragment currentCropFragment;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50541, new Class[0], Void.TYPE).isSupported || (editorActivity = getEditorActivity()) == null || (currentCropFragment = editorActivity.getCurrentCropFragment()) == null) {
            return;
        }
        currentCropFragment.requestRefresh();
    }

    public final void bindViews() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50536, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        FragmentTextStyleBinding fragmentTextStyleBindingInflate = FragmentTextStyleBinding.inflate(this.mInflater);
        kotlin.jvm.internal.f0.o(fragmentTextStyleBindingInflate, "inflate(...)");
        setBinding(fragmentTextStyleBindingInflate);
        setContentView(getBinding());
        RecyclerView rv = getBinding().rv;
        kotlin.jvm.internal.f0.o(rv, "rv");
        setRvTypeFace(rv);
        SmartRefreshLayout srl = getBinding().srl;
        kotlin.jvm.internal.f0.o(srl, "srl");
        setSrl(srl);
    }

    @dl.d
    public final CommonRecyclerViewAdapter<TextRenderInfo> getAdvanceTypeFaceAdapter() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50534, new Class[0], CommonRecyclerViewAdapter.class);
        if (patchProxyResultProxy.isSupported) {
            return (CommonRecyclerViewAdapter) patchProxyResultProxy.result;
        }
        CommonRecyclerViewAdapter<TextRenderInfo> commonRecyclerViewAdapter = this.advanceTypeFaceAdapter;
        if (commonRecyclerViewAdapter != null) {
            return commonRecyclerViewAdapter;
        }
        kotlin.jvm.internal.f0.S("advanceTypeFaceAdapter");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0033  */
    @dl.e
    public final Object getAdvanceTypefaceList(@dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        TextStyleFragment textStyleFragment;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 50527, new Class[]{kotlin.coroutines.c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(cVar);
        }
        Object advanceTypefaceList = anonymousClass1.result;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            t0.n(advanceTypefaceList);
            ImageEditorRepository remoteRepo = getRemoteRepo();
            int i12 = this.mOffset;
            int i13 = this.mLimit;
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            advanceTypefaceList = remoteRepo.getAdvanceTypefaceList(i12, i13, anonymousClass1);
            if (advanceTypefaceList == objH) {
                return objH;
            }
            textStyleFragment = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            textStyleFragment = (TextStyleFragment) anonymousClass1.L$0;
            t0.n(advanceTypefaceList);
        }
        ApiResponse<AdvanceTypefaceList> apiResponse = (ApiResponse) advanceTypefaceList;
        if (kotlin.jvm.internal.f0.g(textStyleFragment._advanceTypefaceList.getValue(), apiResponse)) {
            textStyleFragment.getSrl().P();
            textStyleFragment.getSrl().w();
        } else {
            textStyleFragment._advanceTypefaceList.setValue(apiResponse);
        }
        return b2.f124493a;
    }

    @dl.d
    public final kotlinx.coroutines.flow.u<ApiResponse<AdvanceTypefaceList>> getAdvanceTypefaceList() {
        return this._advanceTypefaceList;
    }

    @dl.d
    public final FragmentTextStyleBinding getBinding() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50528, new Class[0], FragmentTextStyleBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (FragmentTextStyleBinding) patchProxyResultProxy.result;
        }
        FragmentTextStyleBinding fragmentTextStyleBinding = this.binding;
        if (fragmentTextStyleBinding != null) {
            return fragmentTextStyleBinding;
        }
        kotlin.jvm.internal.f0.S("binding");
        return null;
    }

    @dl.e
    public final UCropPlusActivity getEditorActivity() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50525, new Class[0], UCropPlusActivity.class);
        if (patchProxyResultProxy.isSupported) {
            return (UCropPlusActivity) patchProxyResultProxy.result;
        }
        Activity activity = this.mContext;
        if (activity == null || !(activity instanceof UCropPlusActivity)) {
            return null;
        }
        kotlin.jvm.internal.f0.n(activity, "null cannot be cast to non-null type com.starlightc.ucropplus.ui.UCropPlusActivity");
        return (UCropPlusActivity) activity;
    }

    @dl.d
    public final ArrayList<TextRenderInfo> getList() {
        return this.list;
    }

    @dl.d
    public final RecyclerView getRvTypeFace() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50530, new Class[0], RecyclerView.class);
        if (patchProxyResultProxy.isSupported) {
            return (RecyclerView) patchProxyResultProxy.result;
        }
        RecyclerView recyclerView = this.rvTypeFace;
        if (recyclerView != null) {
            return recyclerView;
        }
        kotlin.jvm.internal.f0.S("rvTypeFace");
        return null;
    }

    @dl.d
    public final SmartRefreshLayout getSrl() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50532, new Class[0], SmartRefreshLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (SmartRefreshLayout) patchProxyResultProxy.result;
        }
        SmartRefreshLayout smartRefreshLayout = this.srl;
        if (smartRefreshLayout != null) {
            return smartRefreshLayout;
        }
        kotlin.jvm.internal.f0.S("srl");
        return null;
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(@dl.e View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 50537, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        super.installViews(view);
        bindViews();
        getRvTypeFace().setLayoutManager(new GridLayoutManager(getContext(), 4));
        setAdvanceTypeFaceAdapter(new CommonRecyclerViewAdapter<TextRenderInfo>(this.list, R.layout.item_text_style) { // from class: com.starlightc.ucropplus.ui.TextStyleFragment.installViews.1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: bindViewHolder, reason: avoid collision after fix types in other method */
            public void bindViewHolder2(@dl.d CommonRecyclerViewAdapter.CommonViewHolder holder, @dl.d TextRenderInfo data, int i10) {
                if (PatchProxy.proxy(new Object[]{holder, data, new Integer(i10)}, this, changeQuickRedirect, false, 50549, new Class[]{CommonRecyclerViewAdapter.CommonViewHolder.class, TextRenderInfo.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(holder, "holder");
                kotlin.jvm.internal.f0.p(data, "data");
                TextStyleFragment.access$bindAdvanceTypeface(TextStyleFragment.this, holder, data, i10);
            }

            @Override // com.starlightc.ucropplus.util.CommonRecyclerViewAdapter
            public /* bridge */ /* synthetic */ void bindViewHolder(CommonRecyclerViewAdapter.CommonViewHolder commonViewHolder, TextRenderInfo textRenderInfo, int i10) {
                if (PatchProxy.proxy(new Object[]{commonViewHolder, textRenderInfo, new Integer(i10)}, this, changeQuickRedirect, false, 50550, new Class[]{CommonRecyclerViewAdapter.CommonViewHolder.class, Object.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                bindViewHolder2(commonViewHolder, textRenderInfo, i10);
            }
        });
        getRvTypeFace().setAdapter(getAdvanceTypeFaceAdapter());
        FlowUtilKt.launchAndCollectIn(getAdvanceTypefaceList(), this, Lifecycle.State.STARTED, new yh.l<ResultBuilder<AdvanceTypefaceList>, b2>() { // from class: com.starlightc.ucropplus.ui.TextStyleFragment.installViews.2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(ResultBuilder<AdvanceTypefaceList> resultBuilder) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{resultBuilder}, this, changeQuickRedirect, false, 50552, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2(resultBuilder);
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@dl.d ResultBuilder<AdvanceTypefaceList> launchAndCollectIn) {
                if (PatchProxy.proxy(new Object[]{launchAndCollectIn}, this, changeQuickRedirect, false, 50551, new Class[]{ResultBuilder.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(launchAndCollectIn, "$this$launchAndCollectIn");
                final TextStyleFragment textStyleFragment = TextStyleFragment.this;
                launchAndCollectIn.setOnSuccess(new yh.l<AdvanceTypefaceList, b2>() { // from class: com.starlightc.ucropplus.ui.TextStyleFragment.installViews.2.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    {
                        super(1);
                    }

                    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(AdvanceTypefaceList advanceTypefaceList) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{advanceTypefaceList}, this, changeQuickRedirect, false, 50554, new Class[]{Object.class}, Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        invoke2(advanceTypefaceList);
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@dl.e AdvanceTypefaceList advanceTypefaceList) {
                        ArrayList<RemoteTextRenderInfo> advance_typeface_list;
                        if (PatchProxy.proxy(new Object[]{advanceTypefaceList}, this, changeQuickRedirect, false, 50553, new Class[]{AdvanceTypefaceList.class}, Void.TYPE).isSupported || advanceTypefaceList == null || (advance_typeface_list = advanceTypefaceList.getAdvance_typeface_list()) == null) {
                            return;
                        }
                        TextStyleFragment textStyleFragment2 = textStyleFragment;
                        if (textStyleFragment2.isActive()) {
                            textStyleFragment2.getSrl().w();
                            textStyleFragment2.getSrl().P();
                            if (textStyleFragment2.mOffset == 0) {
                                textStyleFragment2.getList().clear();
                            }
                            Iterator<RemoteTextRenderInfo> it = advance_typeface_list.iterator();
                            while (it.hasNext()) {
                                textStyleFragment2.getList().add(it.next().toTextRenderInfo());
                            }
                            CommonRecyclerViewAdapter<TextRenderInfo> advanceTypeFaceAdapter = textStyleFragment2.getAdvanceTypeFaceAdapter();
                            if (advanceTypeFaceAdapter != null) {
                                advanceTypeFaceAdapter.notifyDataSetChanged();
                            }
                            TextStyleFragment.access$showContentView(textStyleFragment2);
                        }
                    }
                });
                final TextStyleFragment textStyleFragment2 = TextStyleFragment.this;
                launchAndCollectIn.setOnFailed(new yh.p<String, String, b2>() { // from class: com.starlightc.ucropplus.ui.TextStyleFragment.installViews.2.2
                    public static ChangeQuickRedirect changeQuickRedirect;

                    {
                        super(2);
                    }

                    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(String str, String str2) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 50556, new Class[]{Object.class, Object.class}, Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        invoke2(str, str2);
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@dl.e String str, @dl.e String str2) {
                        if (!PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 50555, new Class[]{String.class, String.class}, Void.TYPE).isSupported && textStyleFragment2.isActive()) {
                            textStyleFragment2.getSrl().w();
                            textStyleFragment2.getSrl().P();
                            TextStyleFragment.access$showError(textStyleFragment2);
                        }
                    }
                });
                final TextStyleFragment textStyleFragment3 = TextStyleFragment.this;
                launchAndCollectIn.setOnError(new yh.l<Throwable, b2>() { // from class: com.starlightc.ucropplus.ui.TextStyleFragment.installViews.2.3
                    public static ChangeQuickRedirect changeQuickRedirect;

                    {
                        super(1);
                    }

                    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(Throwable th2) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 50558, new Class[]{Object.class}, Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        invoke2(th2);
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@dl.d Throwable it) {
                        if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 50557, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        kotlin.jvm.internal.f0.p(it, "it");
                        if (textStyleFragment3.isActive()) {
                            textStyleFragment3.getSrl().w();
                            textStyleFragment3.getSrl().P();
                            TextStyleFragment.access$showError(textStyleFragment3);
                        }
                    }
                });
            }
        });
        getSrl().i0(false);
        getSrl().f0(new pg.b() { // from class: com.starlightc.ucropplus.ui.b0
            @Override // pg.b
            public final void f(ng.j jVar) {
                TextStyleFragment.installViews$lambda$0(this.f98074b, jVar);
            }
        });
        FlowUtilKt.launchRequest(this, new AnonymousClass4(null));
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50542, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onRefresh();
        FlowUtilKt.launchRequest(this, new C13221(null));
    }

    public final void setAdvanceTypeFaceAdapter(@dl.d CommonRecyclerViewAdapter<TextRenderInfo> commonRecyclerViewAdapter) {
        if (PatchProxy.proxy(new Object[]{commonRecyclerViewAdapter}, this, changeQuickRedirect, false, 50535, new Class[]{CommonRecyclerViewAdapter.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(commonRecyclerViewAdapter, "<set-?>");
        this.advanceTypeFaceAdapter = commonRecyclerViewAdapter;
    }

    public final void setBinding(@dl.d FragmentTextStyleBinding fragmentTextStyleBinding) {
        if (PatchProxy.proxy(new Object[]{fragmentTextStyleBinding}, this, changeQuickRedirect, false, 50529, new Class[]{FragmentTextStyleBinding.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(fragmentTextStyleBinding, "<set-?>");
        this.binding = fragmentTextStyleBinding;
    }

    public final void setRvTypeFace(@dl.d RecyclerView recyclerView) {
        if (PatchProxy.proxy(new Object[]{recyclerView}, this, changeQuickRedirect, false, 50531, new Class[]{RecyclerView.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(recyclerView, "<set-?>");
        this.rvTypeFace = recyclerView;
    }

    public final void setSrl(@dl.d SmartRefreshLayout smartRefreshLayout) {
        if (PatchProxy.proxy(new Object[]{smartRefreshLayout}, this, changeQuickRedirect, false, 50533, new Class[]{SmartRefreshLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(smartRefreshLayout, "<set-?>");
        this.srl = smartRefreshLayout;
    }
}
