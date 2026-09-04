package com.starlightc.ucropplus.ui;

import android.app.Dialog;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.max.network.entities.ApiResponse;
import com.max.network.utils.FlowUtilKt;
import com.max.network.utils.ResultBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.databinding.FragmentModuleBinding;
import com.starlightc.ucropplus.model.ImageModuleTabListObj;
import com.starlightc.ucropplus.model.UCropKeyDescObj;
import com.starlightc.ucropplus.network.ImageEditorRepository;
import java.util.ArrayList;
import java.util.List;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;

/* JADX INFO: compiled from: ModuleFragmentDialog.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class ModuleFragmentDialog extends BaseFragmentDialog {
    public static ChangeQuickRedirect changeQuickRedirect;
    public FragmentModuleBinding binding;
    private boolean isViewCreated;
    private TabLayout tabLayout;
    private ViewPager2 vp2;

    @dl.d
    private final kotlin.z remoteRepo$delegate = kotlin.b0.c(new yh.a<ImageEditorRepository>() { // from class: com.starlightc.ucropplus.ui.ModuleFragmentDialog$remoteRepo$2
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // yh.a
        @dl.d
        public final ImageEditorRepository invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50345, new Class[0], ImageEditorRepository.class);
            return patchProxyResultProxy.isSupported ? (ImageEditorRepository) patchProxyResultProxy.result : new ImageEditorRepository();
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.starlightc.ucropplus.network.ImageEditorRepository, java.lang.Object] */
        @Override // yh.a
        public /* bridge */ /* synthetic */ ImageEditorRepository invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50346, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
        }
    });

    @dl.d
    private final ArrayList<UCropKeyDescObj> tabList = new ArrayList<>();

    @dl.d
    private final kotlinx.coroutines.flow.j<ApiResponse<ImageModuleTabListObj>> _moduleTabList = kotlinx.coroutines.flow.v.a(new ApiResponse(null, null, null, null, 15, null));

    /* JADX INFO: renamed from: com.starlightc.ucropplus.ui.ModuleFragmentDialog$getImageModuleTabList$1, reason: invalid class name */
    /* JADX INFO: compiled from: ModuleFragmentDialog.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.starlightc.ucropplus.ui.ModuleFragmentDialog", f = "ModuleFragmentDialog.kt", i = {}, l = {35}, m = "getImageModuleTabList", n = {}, s = {})
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
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50334, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ModuleFragmentDialog.this.getImageModuleTabList(this);
        }
    }

    /* JADX INFO: renamed from: com.starlightc.ucropplus.ui.ModuleFragmentDialog$loadData$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ModuleFragmentDialog.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.starlightc.ucropplus.ui.ModuleFragmentDialog$loadData$1", f = "ModuleFragmentDialog.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
    public static final class C13191 extends SuspendLambda implements yh.l<kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;
        int label;

        C13191(kotlin.coroutines.c<? super C13191> cVar) {
            super(1, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 50338, new Class[]{kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : ModuleFragmentDialog.this.new C13191(cVar);
        }

        @Override // yh.l
        public /* bridge */ /* synthetic */ Object invoke(kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 50340, new Class[]{Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 50339, new Class[]{kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((C13191) create(cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50337, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.label;
            if (i10 == 0) {
                t0.n(obj);
                ModuleFragmentDialog moduleFragmentDialog = ModuleFragmentDialog.this;
                this.label = 1;
                if (moduleFragmentDialog.getImageModuleTabList(this) == objH) {
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

    public static final /* synthetic */ void access$getImageModuleTabListComplete(ModuleFragmentDialog moduleFragmentDialog) {
        if (PatchProxy.proxy(new Object[]{moduleFragmentDialog}, null, changeQuickRedirect, true, 50333, new Class[]{ModuleFragmentDialog.class}, Void.TYPE).isSupported) {
            return;
        }
        moduleFragmentDialog.getImageModuleTabListComplete();
    }

    private final void getImageModuleTabListComplete() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50331, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ViewPager2 viewPager2 = this.vp2;
        ViewPager2 viewPager3 = null;
        if (viewPager2 == null) {
            kotlin.jvm.internal.f0.S("vp2");
            viewPager2 = null;
        }
        viewPager2.setAdapter(new FragmentStateAdapter() { // from class: com.starlightc.ucropplus.ui.ModuleFragmentDialog.getImageModuleTabListComplete.1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(ModuleFragmentDialog.this);
            }

            @Override // androidx.viewpager2.adapter.FragmentStateAdapter
            @dl.d
            public Fragment createFragment(int i10) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 50336, new Class[]{Integer.TYPE}, Fragment.class);
                return patchProxyResultProxy.isSupported ? (Fragment) patchProxyResultProxy.result : ModuleListFragment.Companion.newInstance(((UCropKeyDescObj) ModuleFragmentDialog.this.tabList.get(i10)).getKey());
            }

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public int getItemCount() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50335, new Class[0], Integer.TYPE);
                return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : ModuleFragmentDialog.this.tabList.size();
            }
        });
        TabLayout tabLayout = this.tabLayout;
        if (tabLayout == null) {
            kotlin.jvm.internal.f0.S("tabLayout");
            tabLayout = null;
        }
        ViewPager2 viewPager4 = this.vp2;
        if (viewPager4 == null) {
            kotlin.jvm.internal.f0.S("vp2");
        } else {
            viewPager3 = viewPager4;
        }
        new com.google.android.material.tabs.d(tabLayout, viewPager3, new com.google.android.material.tabs.d.b() { // from class: com.starlightc.ucropplus.ui.j
            @Override // com.google.android.material.tabs.d.b
            public final void a(TabLayout.h hVar, int i10) {
                ModuleFragmentDialog.getImageModuleTabListComplete$lambda$0(this.f98094a, hVar, i10);
            }
        }).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getImageModuleTabListComplete$lambda$0(ModuleFragmentDialog this$0, TabLayout.h tab, int i10) {
        if (PatchProxy.proxy(new Object[]{this$0, tab, new Integer(i10)}, null, changeQuickRedirect, true, 50332, new Class[]{ModuleFragmentDialog.class, TabLayout.h.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        kotlin.jvm.internal.f0.p(tab, "tab");
        tab.D(this$0.tabList.get(i10).getDesc());
    }

    private final ImageEditorRepository getRemoteRepo() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50324, new Class[0], ImageEditorRepository.class);
        return patchProxyResultProxy.isSupported ? (ImageEditorRepository) patchProxyResultProxy.result : (ImageEditorRepository) this.remoteRepo$delegate.getValue();
    }

    @Override // com.starlightc.ucropplus.ui.BaseFragmentDialog
    public void bindViews() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50328, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        FragmentModuleBinding fragmentModuleBindingInflate = FragmentModuleBinding.inflate(getMInflater());
        kotlin.jvm.internal.f0.o(fragmentModuleBindingInflate, "inflate(...)");
        setBinding(fragmentModuleBindingInflate);
        setViewBinding(getBinding());
        ViewPager2 vp2 = getBinding().vp2;
        kotlin.jvm.internal.f0.o(vp2, "vp2");
        this.vp2 = vp2;
        TabLayout tab = getBinding().tab;
        kotlin.jvm.internal.f0.o(tab, "tab");
        this.tabLayout = tab;
    }

    @dl.d
    public final FragmentModuleBinding getBinding() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50325, new Class[0], FragmentModuleBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (FragmentModuleBinding) patchProxyResultProxy.result;
        }
        FragmentModuleBinding fragmentModuleBinding = this.binding;
        if (fragmentModuleBinding != null) {
            return fragmentModuleBinding;
        }
        kotlin.jvm.internal.f0.S("binding");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0033  */
    @dl.e
    public final Object getImageModuleTabList(@dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        kotlinx.coroutines.flow.j jVar;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 50327, new Class[]{kotlin.coroutines.c.class}, Object.class);
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
            kotlinx.coroutines.flow.j<ApiResponse<ImageModuleTabListObj>> jVar2 = this._moduleTabList;
            ImageEditorRepository remoteRepo = getRemoteRepo();
            anonymousClass1.L$0 = jVar2;
            anonymousClass1.label = 1;
            Object imageModuleTabList = remoteRepo.getImageModuleTabList(anonymousClass1);
            if (imageModuleTabList == objH) {
                return objH;
            }
            jVar = jVar2;
            obj = imageModuleTabList;
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
    public final kotlinx.coroutines.flow.u<ApiResponse<ImageModuleTabListObj>> getModuleTabList() {
        return this._moduleTabList;
    }

    @Override // com.starlightc.ucropplus.ui.BaseFragmentDialog
    public void initViews() {
        Dialog dialog;
        Window window;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50329, new Class[0], Void.TYPE).isSupported || (dialog = getDialog()) == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setSoftInputMode(3);
    }

    public final boolean isViewCreated() {
        return this.isViewCreated;
    }

    @Override // com.starlightc.ucropplus.ui.BaseFragmentDialog
    public void loadData() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50330, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.isViewCreated = true;
        FlowUtilKt.launchRequest(this, new C13191(null));
        FlowUtilKt.launchAndCollectIn(getModuleTabList(), this, Lifecycle.State.STARTED, new yh.l<ResultBuilder<ImageModuleTabListObj>, b2>() { // from class: com.starlightc.ucropplus.ui.ModuleFragmentDialog.loadData.2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(ResultBuilder<ImageModuleTabListObj> resultBuilder) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{resultBuilder}, this, changeQuickRedirect, false, 50342, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2(resultBuilder);
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@dl.d ResultBuilder<ImageModuleTabListObj> launchAndCollectIn) {
                if (PatchProxy.proxy(new Object[]{launchAndCollectIn}, this, changeQuickRedirect, false, 50341, new Class[]{ResultBuilder.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(launchAndCollectIn, "$this$launchAndCollectIn");
                final ModuleFragmentDialog moduleFragmentDialog = ModuleFragmentDialog.this;
                launchAndCollectIn.setOnSuccess(new yh.l<ImageModuleTabListObj, b2>() { // from class: com.starlightc.ucropplus.ui.ModuleFragmentDialog.loadData.2.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    {
                        super(1);
                    }

                    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(ImageModuleTabListObj imageModuleTabListObj) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{imageModuleTabListObj}, this, changeQuickRedirect, false, 50344, new Class[]{Object.class}, Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        invoke2(imageModuleTabListObj);
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@dl.e ImageModuleTabListObj imageModuleTabListObj) {
                        List<UCropKeyDescObj> tab_list;
                        if (PatchProxy.proxy(new Object[]{imageModuleTabListObj}, this, changeQuickRedirect, false, 50343, new Class[]{ImageModuleTabListObj.class}, Void.TYPE).isSupported || imageModuleTabListObj == null || (tab_list = imageModuleTabListObj.getTab_list()) == null) {
                            return;
                        }
                        ModuleFragmentDialog moduleFragmentDialog2 = moduleFragmentDialog;
                        moduleFragmentDialog2.tabList.clear();
                        if (com.max.hbcommon.utils.c.w(tab_list)) {
                            return;
                        }
                        moduleFragmentDialog2.tabList.addAll(tab_list);
                        ModuleFragmentDialog.access$getImageModuleTabListComplete(moduleFragmentDialog2);
                    }
                });
            }
        });
    }

    public final void setBinding(@dl.d FragmentModuleBinding fragmentModuleBinding) {
        if (PatchProxy.proxy(new Object[]{fragmentModuleBinding}, this, changeQuickRedirect, false, 50326, new Class[]{FragmentModuleBinding.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(fragmentModuleBinding, "<set-?>");
        this.binding = fragmentModuleBinding;
    }

    public final void setViewCreated(boolean z10) {
        this.isViewCreated = z10;
    }
}
