package com.starlightc.ucropplus.ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.max.hbutils.utils.ViewUtils;
import com.max.network.entities.ApiResponse;
import com.max.network.utils.FlowUtilKt;
import com.max.network.utils.ResultBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.R;
import com.starlightc.ucropplus.databinding.FragmentModuleListBinding;
import com.starlightc.ucropplus.model.ImageModuleList;
import com.starlightc.ucropplus.model.puzzle.ImageModuleObj;
import com.starlightc.ucropplus.network.ImageEditorRepository;
import com.starlightc.ucropplus.ui.adapter.ModulePreviewAdapter;
import java.util.ArrayList;
import java.util.List;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;

/* JADX INFO: compiled from: ModuleListFragment.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class ModuleListFragment extends Fragment {

    @dl.d
    public static final String ARG_TAB_ID = "tab_id";

    @dl.d
    public static final Companion Companion = new Companion(null);
    public static ChangeQuickRedirect changeQuickRedirect;
    public FragmentModuleListBinding binding;

    @dl.e
    private ModulePreviewAdapter mAdapter;
    private LayoutInflater mInflater;
    private View mRootView;

    @dl.e
    private Activity parentActivity;

    @dl.e
    private String tabId;

    @dl.d
    private final ArrayList<ImageModuleObj> mList = new ArrayList<>();
    private int mLimit = 30;

    @dl.d
    private final kotlin.z remoteRepo$delegate = kotlin.b0.c(new yh.a<ImageEditorRepository>() { // from class: com.starlightc.ucropplus.ui.ModuleListFragment$remoteRepo$2
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // yh.a
        @dl.d
        public final ImageEditorRepository invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50374, new Class[0], ImageEditorRepository.class);
            return patchProxyResultProxy.isSupported ? (ImageEditorRepository) patchProxyResultProxy.result : new ImageEditorRepository();
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.starlightc.ucropplus.network.ImageEditorRepository, java.lang.Object] */
        @Override // yh.a
        public /* bridge */ /* synthetic */ ImageEditorRepository invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50375, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
        }
    });

    @dl.d
    private final kotlinx.coroutines.flow.j<ApiResponse<ImageModuleList>> _moduleList = kotlinx.coroutines.flow.v.a(new ApiResponse(null, null, null, null, 15, null));

    /* JADX INFO: compiled from: ModuleListFragment.kt */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final ModuleListFragment newInstance(@dl.e String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 50360, new Class[]{String.class}, ModuleListFragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (ModuleListFragment) patchProxyResultProxy.result;
            }
            ModuleListFragment moduleListFragment = new ModuleListFragment();
            Bundle bundle = new Bundle();
            bundle.putString(ModuleListFragment.ARG_TAB_ID, str);
            moduleListFragment.setArguments(bundle);
            return moduleListFragment;
        }
    }

    /* JADX INFO: renamed from: com.starlightc.ucropplus.ui.ModuleListFragment$getImageModuleTabList$1, reason: invalid class name */
    /* JADX INFO: compiled from: ModuleListFragment.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.starlightc.ucropplus.ui.ModuleListFragment", f = "ModuleListFragment.kt", i = {}, l = {56}, m = "getImageModuleTabList", n = {}, s = {})
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
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50361, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ModuleListFragment.this.getImageModuleTabList(this);
        }
    }

    /* JADX INFO: renamed from: com.starlightc.ucropplus.ui.ModuleListFragment$initViews$4, reason: invalid class name */
    /* JADX INFO: compiled from: ModuleListFragment.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.starlightc.ucropplus.ui.ModuleListFragment$initViews$4", f = "ModuleListFragment.kt", i = {}, l = {160}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass4 extends SuspendLambda implements yh.l<kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;
        int label;

        AnonymousClass4(kotlin.coroutines.c<? super AnonymousClass4> cVar) {
            super(1, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 50371, new Class[]{kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : ModuleListFragment.this.new AnonymousClass4(cVar);
        }

        @Override // yh.l
        public /* bridge */ /* synthetic */ Object invoke(kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 50373, new Class[]{Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 50372, new Class[]{kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass4) create(cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50370, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.label;
            if (i10 == 0) {
                t0.n(obj);
                ModuleListFragment moduleListFragment = ModuleListFragment.this;
                this.label = 1;
                if (moduleListFragment.getImageModuleTabList(this) == objH) {
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

    public static final /* synthetic */ UCropPlusActivity access$getUCropPlusActivity(ModuleListFragment moduleListFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{moduleListFragment}, null, changeQuickRedirect, true, 50359, new Class[]{ModuleListFragment.class}, UCropPlusActivity.class);
        return patchProxyResultProxy.isSupported ? (UCropPlusActivity) patchProxyResultProxy.result : moduleListFragment.getUCropPlusActivity();
    }

    private final ImageEditorRepository getRemoteRepo() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50349, new Class[0], ImageEditorRepository.class);
        return patchProxyResultProxy.isSupported ? (ImageEditorRepository) patchProxyResultProxy.result : (ImageEditorRepository) this.remoteRepo$delegate.getValue();
    }

    private final UCropPlusActivity getUCropPlusActivity() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50351, new Class[0], UCropPlusActivity.class);
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

    public final void bindViews() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50357, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        LayoutInflater layoutInflater = this.mInflater;
        if (layoutInflater == null) {
            kotlin.jvm.internal.f0.S("mInflater");
            layoutInflater = null;
        }
        FragmentModuleListBinding fragmentModuleListBindingInflate = FragmentModuleListBinding.inflate(layoutInflater);
        kotlin.jvm.internal.f0.o(fragmentModuleListBindingInflate, "inflate(...)");
        setBinding(fragmentModuleListBindingInflate);
        setViewBinding(getBinding());
    }

    @dl.d
    public final FragmentModuleListBinding getBinding() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50347, new Class[0], FragmentModuleListBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (FragmentModuleListBinding) patchProxyResultProxy.result;
        }
        FragmentModuleListBinding fragmentModuleListBinding = this.binding;
        if (fragmentModuleListBinding != null) {
            return fragmentModuleListBinding;
        }
        kotlin.jvm.internal.f0.S("binding");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0033  */
    @dl.e
    public final Object getImageModuleTabList(@dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        kotlinx.coroutines.flow.j jVar;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 50350, new Class[]{kotlin.coroutines.c.class}, Object.class);
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
        Object obj = anonymousClass1.result;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            t0.n(obj);
            kotlinx.coroutines.flow.j<ApiResponse<ImageModuleList>> jVar2 = this._moduleList;
            ImageEditorRepository remoteRepo = getRemoteRepo();
            String str = this.tabId;
            int i12 = this.mLimit;
            anonymousClass1.L$0 = jVar2;
            anonymousClass1.label = 1;
            Object imageModuleList = remoteRepo.getImageModuleList(str, 0, i12, anonymousClass1);
            if (imageModuleList == objH) {
                return objH;
            }
            jVar = jVar2;
            obj = imageModuleList;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar = (kotlinx.coroutines.flow.j) anonymousClass1.L$0;
            t0.n(obj);
        }
        jVar.setValue(obj);
        return b2.f124493a;
    }

    @dl.d
    public final kotlinx.coroutines.flow.u<ApiResponse<ImageModuleList>> getModuleList() {
        return this._moduleList;
    }

    public final void initViews() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50358, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.tabId = arguments.getString(ARG_TAB_ID);
        }
        getBinding().rv.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.f0.o(contextRequireContext, "requireContext(...)");
        this.mAdapter = new ModulePreviewAdapter(contextRequireContext, this.mList, new ModulePreviewAdapter.OnCheckedListener() { // from class: com.starlightc.ucropplus.ui.ModuleListFragment.initViews.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.starlightc.ucropplus.ui.adapter.ModulePreviewAdapter.OnCheckedListener
            public void onChecked(@dl.e final ImageModuleObj imageModuleObj) throws Exception {
                UCropPlusFragment currentCropFragment;
                UCropPlusFragment currentCropFragment2;
                if (PatchProxy.proxy(new Object[]{imageModuleObj}, this, changeQuickRedirect, false, 50362, new Class[]{ImageModuleObj.class}, Void.TYPE).isSupported) {
                    return;
                }
                UCropPlusActivity uCropPlusActivityAccess$getUCropPlusActivity = ModuleListFragment.access$getUCropPlusActivity(ModuleListFragment.this);
                if ((uCropPlusActivityAccess$getUCropPlusActivity == null || (currentCropFragment2 = uCropPlusActivityAccess$getUCropPlusActivity.getCurrentCropFragment()) == null || !currentCropFragment2.hasModule()) ? false : true) {
                    com.max.hbcommon.view.a.f fVarK = new com.max.hbcommon.view.a.f(ModuleListFragment.this.getContext()).x(R.string.prompt).k(R.string.change_module_tips);
                    int i10 = R.string.confirm;
                    final ModuleListFragment moduleListFragment = ModuleListFragment.this;
                    fVarK.t(i10, new DialogInterface.OnClickListener() { // from class: com.starlightc.ucropplus.ui.ModuleListFragment$initViews$2$onChecked$1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(@dl.e DialogInterface dialogInterface, int i11) throws Exception {
                            UCropPlusFragment currentCropFragment3;
                            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i11)}, this, changeQuickRedirect, false, 50363, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                                return;
                            }
                            UCropPlusActivity uCropPlusActivityAccess$getUCropPlusActivity2 = ModuleListFragment.access$getUCropPlusActivity(moduleListFragment);
                            if (uCropPlusActivityAccess$getUCropPlusActivity2 != null && (currentCropFragment3 = uCropPlusActivityAccess$getUCropPlusActivity2.getCurrentCropFragment()) != null) {
                                currentCropFragment3.resetImageModule(imageModuleObj);
                            }
                            UCropPlusActivity uCropPlusActivityAccess$getUCropPlusActivity3 = ModuleListFragment.access$getUCropPlusActivity(moduleListFragment);
                            if (uCropPlusActivityAccess$getUCropPlusActivity3 != null) {
                                uCropPlusActivityAccess$getUCropPlusActivity3.setCuttingVisibility(false);
                            }
                            if (dialogInterface != null) {
                                dialogInterface.dismiss();
                            }
                        }
                    }).n(R.string.cancel, new DialogInterface.OnClickListener() { // from class: com.starlightc.ucropplus.ui.ModuleListFragment$initViews$2$onChecked$2
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(@dl.e DialogInterface dialogInterface, int i11) {
                            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i11)}, this, changeQuickRedirect, false, 50364, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported || dialogInterface == null) {
                                return;
                            }
                            dialogInterface.dismiss();
                        }
                    }).F();
                    return;
                }
                UCropPlusActivity uCropPlusActivityAccess$getUCropPlusActivity2 = ModuleListFragment.access$getUCropPlusActivity(ModuleListFragment.this);
                if (uCropPlusActivityAccess$getUCropPlusActivity2 != null && (currentCropFragment = uCropPlusActivityAccess$getUCropPlusActivity2.getCurrentCropFragment()) != null) {
                    currentCropFragment.resetImageModule(imageModuleObj);
                }
                UCropPlusActivity uCropPlusActivityAccess$getUCropPlusActivity3 = ModuleListFragment.access$getUCropPlusActivity(ModuleListFragment.this);
                if (uCropPlusActivityAccess$getUCropPlusActivity3 != null) {
                    uCropPlusActivityAccess$getUCropPlusActivity3.setCuttingVisibility(false);
                }
            }
        });
        getBinding().rv.setAdapter(this.mAdapter);
        getBinding().rv.addItemDecoration(new com.max.hbcustomview.d(ViewUtils.f(getContext(), 10.0f), ViewUtils.f(getContext(), 14.0f)));
        FlowUtilKt.launchAndCollectIn(getModuleList(), this, Lifecycle.State.STARTED, new yh.l<ResultBuilder<ImageModuleList>, b2>() { // from class: com.starlightc.ucropplus.ui.ModuleListFragment.initViews.3
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(ResultBuilder<ImageModuleList> resultBuilder) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{resultBuilder}, this, changeQuickRedirect, false, 50366, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2(resultBuilder);
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@dl.d ResultBuilder<ImageModuleList> launchAndCollectIn) {
                if (PatchProxy.proxy(new Object[]{launchAndCollectIn}, this, changeQuickRedirect, false, 50365, new Class[]{ResultBuilder.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(launchAndCollectIn, "$this$launchAndCollectIn");
                final ModuleListFragment moduleListFragment = ModuleListFragment.this;
                launchAndCollectIn.setOnSuccess(new yh.l<ImageModuleList, b2>() { // from class: com.starlightc.ucropplus.ui.ModuleListFragment.initViews.3.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    {
                        super(1);
                    }

                    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(ImageModuleList imageModuleList) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{imageModuleList}, this, changeQuickRedirect, false, 50368, new Class[]{Object.class}, Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        invoke2(imageModuleList);
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@dl.e ImageModuleList imageModuleList) {
                        List<ImageModuleObj> module_list;
                        if (PatchProxy.proxy(new Object[]{imageModuleList}, this, changeQuickRedirect, false, 50367, new Class[]{ImageModuleList.class}, Void.TYPE).isSupported || imageModuleList == null || (module_list = imageModuleList.getModule_list()) == null) {
                            return;
                        }
                        ModuleListFragment moduleListFragment2 = moduleListFragment;
                        moduleListFragment2.mList.addAll(module_list);
                        ModulePreviewAdapter modulePreviewAdapter = moduleListFragment2.mAdapter;
                        if (modulePreviewAdapter != null) {
                            modulePreviewAdapter.notifyDataSetChanged();
                        }
                    }
                });
                launchAndCollectIn.setOnFailed(new yh.p<String, String, b2>() { // from class: com.starlightc.ucropplus.ui.ModuleListFragment.initViews.3.2
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(String str, String str2) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 50369, new Class[]{Object.class, Object.class}, Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        invoke2(str, str2);
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@dl.e String str, @dl.e String str2) {
                    }
                });
            }
        });
        FlowUtilKt.launchRequest(this, new AnonymousClass4(null));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@dl.d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 50352, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(context, "context");
        super.onAttach(context);
        this.parentActivity = getActivity();
    }

    @Override // androidx.fragment.app.Fragment
    @dl.d
    public View onCreateView(@dl.d LayoutInflater inflater, @dl.e ViewGroup viewGroup, @dl.e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inflater, viewGroup, bundle}, this, changeQuickRedirect, false, 50354, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
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
    public void onDetach() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50353, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDetach();
        this.parentActivity = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@dl.d View view, @dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 50356, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(view, "view");
        super.onViewCreated(view, bundle);
    }

    public final void setBinding(@dl.d FragmentModuleListBinding fragmentModuleListBinding) {
        if (PatchProxy.proxy(new Object[]{fragmentModuleListBinding}, this, changeQuickRedirect, false, 50348, new Class[]{FragmentModuleListBinding.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(fragmentModuleListBinding, "<set-?>");
        this.binding = fragmentModuleListBinding;
    }

    public final void setViewBinding(@dl.d l3.c binding) {
        if (PatchProxy.proxy(new Object[]{binding}, this, changeQuickRedirect, false, 50355, new Class[]{l3.c.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(binding, "binding");
        View root = binding.getRoot();
        kotlin.jvm.internal.f0.o(root, "getRoot(...)");
        this.mRootView = root;
    }
}
