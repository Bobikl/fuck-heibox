package com.starlightc.ucropplus.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Looper;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.R;
import com.starlightc.ucropplus.databinding.FragmentTextBinding;
import java.util.ArrayList;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;

/* JADX INFO: compiled from: TextStickerFragmentDialog.kt */
/* JADX INFO: loaded from: classes4.dex */
@t0({"SMAP\nTextStickerFragmentDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextStickerFragmentDialog.kt\ncom/starlightc/ucropplus/ui/TextStickerFragmentDialog\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,183:1\n58#2,23:184\n93#2,3:207\n*S KotlinDebug\n*F\n+ 1 TextStickerFragmentDialog.kt\ncom/starlightc/ucropplus/ui/TextStickerFragmentDialog\n*L\n103#1:184,23\n103#1:207,3\n*E\n"})
public final class TextStickerFragmentDialog extends BaseFragmentDialog {

    @dl.d
    public static final Companion Companion = new Companion(null);
    public static final int MSG_COLLAPSE_DIALOG = 1;
    public static final int MSG_EXPAND_DIALOG = 2;
    public static final int MSG_SHOW_KEYBOARD = 0;
    public static ChangeQuickRedirect changeQuickRedirect;
    public FragmentTextBinding binding;

    @dl.e
    private d2 checkJob;
    public EditText editText;
    private boolean isViewCreated;
    private boolean showKeyboard;
    private TabLayout tabLayout;
    private TextModuleFragment textModuleFragment;
    private TextStyleFragment textStyleFragment;
    private ViewPager2 vp2;

    @dl.d
    private final ArrayList<Fragment> fragmentList = new ArrayList<>();

    @dl.d
    private final Integer[] titleList = {Integer.valueOf(R.string.text_module), Integer.valueOf(R.string.text_style)};

    @dl.d
    private final TextStickerFragmentDialog$eventHandler$1 eventHandler = new TextStickerFragmentDialog$eventHandler$1(this, Looper.getMainLooper());
    private boolean isExpand = true;

    /* JADX INFO: compiled from: TextStickerFragmentDialog.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.starlightc.ucropplus.ui.TextStickerFragmentDialog$checkIsShowKeyboard$1, reason: invalid class name */
    /* JADX INFO: compiled from: TextStickerFragmentDialog.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.starlightc.ucropplus.ui.TextStickerFragmentDialog", f = "TextStickerFragmentDialog.kt", i = {0}, l = {93, 94}, m = "checkIsShowKeyboard", n = {"this"}, s = {"L$0"})
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
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50509, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TextStickerFragmentDialog.access$checkIsShowKeyboard(TextStickerFragmentDialog.this, this);
        }
    }

    /* JADX INFO: renamed from: com.starlightc.ucropplus.ui.TextStickerFragmentDialog$initViews$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TextStickerFragmentDialog.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.starlightc.ucropplus.ui.TextStickerFragmentDialog$initViews$1", f = "TextStickerFragmentDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C13201 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.starlightc.ucropplus.ui.TextStickerFragmentDialog$initViews$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: TextStickerFragmentDialog.kt */
        @kotlin.coroutines.jvm.internal.d(c = "com.starlightc.ucropplus.ui.TextStickerFragmentDialog$initViews$1$1", f = "TextStickerFragmentDialog.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, s = {})
        public static final class C09341 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
            public static ChangeQuickRedirect changeQuickRedirect;
            int label;
            final /* synthetic */ TextStickerFragmentDialog this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C09341(TextStickerFragmentDialog textStickerFragmentDialog, kotlin.coroutines.c<? super C09341> cVar) {
                super(2, cVar);
                this.this$0 = textStickerFragmentDialog;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.d
            public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 50519, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
                return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new C09341(this.this$0, cVar);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 50521, new Class[]{Object.class, Object.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
            }

            @dl.e
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 50520, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((C09341) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.e
            public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50518, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                Object objH = kotlin.coroutines.intrinsics.b.h();
                int i10 = this.label;
                if (i10 == 0) {
                    kotlin.t0.n(obj);
                    TextStickerFragmentDialog textStickerFragmentDialog = this.this$0;
                    this.label = 1;
                    if (TextStickerFragmentDialog.access$checkIsShowKeyboard(textStickerFragmentDialog, this) == objH) {
                        return objH;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.t0.n(obj);
                }
                return b2.f124493a;
            }
        }

        C13201(kotlin.coroutines.c<? super C13201> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 50515, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            if (patchProxyResultProxy.isSupported) {
                return (kotlin.coroutines.c) patchProxyResultProxy.result;
            }
            C13201 c13201 = TextStickerFragmentDialog.this.new C13201(cVar);
            c13201.L$0 = obj;
            return c13201;
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 50517, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 50516, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((C13201) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50514, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            kotlin.coroutines.intrinsics.b.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
            kotlinx.coroutines.k.b((q0) this.L$0, null, null, new C09341(TextStickerFragmentDialog.this, null), 3, null);
            return b2.f124493a;
        }
    }

    public static final /* synthetic */ Object access$checkIsShowKeyboard(TextStickerFragmentDialog textStickerFragmentDialog, kotlin.coroutines.c cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{textStickerFragmentDialog, cVar}, null, changeQuickRedirect, true, 50508, new Class[]{TextStickerFragmentDialog.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : textStickerFragmentDialog.checkIsShowKeyboard(cVar);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0033  */
    private final Object checkIsShowKeyboard(kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        TextStickerFragmentDialog textStickerFragmentDialog;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 50497, new Class[]{kotlin.coroutines.c.class}, Object.class);
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
        if (i11 != 0) {
            if (i11 == 1) {
                textStickerFragmentDialog = (TextStickerFragmentDialog) anonymousClass1.L$0;
                kotlin.t0.n(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.t0.n(obj);
            }
            return b2.f124493a;
        }
        kotlin.t0.n(obj);
        int iJ = ViewUtils.J(getContext());
        int[] iArr = new int[2];
        int height = getMRootView().getHeight();
        getMRootView().getLocationOnScreen(iArr);
        int i12 = iArr[1];
        if (height > 0 && i12 > 0 && (iJ - height) - i12 < iJ / 5 && !this.showKeyboard) {
            this.eventHandler.sendEmptyMessage(2);
        }
        anonymousClass1.L$0 = this;
        anonymousClass1.label = 1;
        if (DelayKt.b(100L, anonymousClass1) == objH) {
            return objH;
        }
        textStickerFragmentDialog = this;
        anonymousClass1.L$0 = null;
        anonymousClass1.label = 2;
        if (textStickerFragmentDialog.checkIsShowKeyboard(anonymousClass1) == objH) {
            return objH;
        }
        return b2.f124493a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$1(TextStickerFragmentDialog this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, 50503, new Class[]{TextStickerFragmentDialog.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        if (this$0.isExpand) {
            this$0.eventHandler.sendEmptyMessage(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$2(TextStickerFragmentDialog this$0, View view, boolean z10) {
        if (PatchProxy.proxy(new Object[]{this$0, view, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 50504, new Class[]{TextStickerFragmentDialog.class, View.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        if (this$0.isExpand) {
            this$0.eventHandler.sendEmptyMessage(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$3(TextStickerFragmentDialog this$0, TabLayout.h tab, int i10) {
        Resources resources;
        if (PatchProxy.proxy(new Object[]{this$0, tab, new Integer(i10)}, null, changeQuickRedirect, true, 50505, new Class[]{TextStickerFragmentDialog.class, TabLayout.h.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        kotlin.jvm.internal.f0.p(tab, "tab");
        Context context = this$0.getContext();
        tab.D((context == null || (resources = context.getResources()) == null) ? null : resources.getString(this$0.titleList[i10].intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$4(TextStickerFragmentDialog this$0, View view) throws InterruptedException {
        UCropPlusFragment currentCropFragment;
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, 50506, new Class[]{TextStickerFragmentDialog.class, View.class}, Void.TYPE).isSupported) {
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
    public static final void initViews$lambda$5(TextStickerFragmentDialog this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, 50507, new Class[]{TextStickerFragmentDialog.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        this$0.dismiss();
    }

    @Override // com.starlightc.ucropplus.ui.BaseFragmentDialog
    public void bindViews() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50496, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        FragmentTextBinding fragmentTextBindingInflate = FragmentTextBinding.inflate(getMInflater());
        kotlin.jvm.internal.f0.o(fragmentTextBindingInflate, "inflate(...)");
        setBinding(fragmentTextBindingInflate);
        setViewBinding(getBinding());
        EditText editText = getBinding().editText;
        kotlin.jvm.internal.f0.o(editText, "editText");
        setEditText(editText);
        ViewPager2 vp2 = getBinding().vp2;
        kotlin.jvm.internal.f0.o(vp2, "vp2");
        this.vp2 = vp2;
        TabLayout tab = getBinding().tab;
        kotlin.jvm.internal.f0.o(tab, "tab");
        this.tabLayout = tab;
    }

    @Override // com.starlightc.ucropplus.ui.BaseFragmentDialog
    public boolean canOnBackPressed() {
        return false;
    }

    public final void clearAdvanceTypefaceCheck() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50499, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        TextModuleFragment textModuleFragment = this.textModuleFragment;
        if (textModuleFragment == null) {
            kotlin.jvm.internal.f0.S("textModuleFragment");
            textModuleFragment = null;
        }
        textModuleFragment.clearAdvanceTypefaceCheck();
    }

    @dl.d
    public final FragmentTextBinding getBinding() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50492, new Class[0], FragmentTextBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (FragmentTextBinding) patchProxyResultProxy.result;
        }
        FragmentTextBinding fragmentTextBinding = this.binding;
        if (fragmentTextBinding != null) {
            return fragmentTextBinding;
        }
        kotlin.jvm.internal.f0.S("binding");
        return null;
    }

    @dl.e
    public final d2 getCheckJob() {
        return this.checkJob;
    }

    @dl.d
    public final EditText getEditText() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50494, new Class[0], EditText.class);
        if (patchProxyResultProxy.isSupported) {
            return (EditText) patchProxyResultProxy.result;
        }
        EditText editText = this.editText;
        if (editText != null) {
            return editText;
        }
        kotlin.jvm.internal.f0.S("editText");
        return null;
    }

    @Override // com.starlightc.ucropplus.ui.BaseFragmentDialog
    public void initViews() {
        Window window;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50498, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setDialogNoTouchable();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setSoftInputMode(3);
        }
        ViewPager2 viewPager2 = null;
        this.checkJob = kotlinx.coroutines.k.f(r0.a(e1.c()), null, null, new C13201(null), 3, null);
        getEditText().addTextChangedListener(new TextWatcher() { // from class: com.starlightc.ucropplus.ui.TextStickerFragmentDialog$initViews$$inlined$doAfterTextChanged$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.text.TextWatcher
            public void afterTextChanged(@dl.e Editable editable) {
                UCropPlusFragment currentCropFragment;
                if (PatchProxy.proxy(new Object[]{editable}, this, changeQuickRedirect, false, 50513, new Class[]{Editable.class}, Void.TYPE).isSupported) {
                    return;
                }
                String string = TextUtils.isEmpty(editable) ? this.this$0.getString(R.string.text_sticker_editor_hint) : String.valueOf(editable);
                kotlin.jvm.internal.f0.m(string);
                UCropPlusActivity editorActivity = this.this$0.getEditorActivity();
                if (editorActivity == null || (currentCropFragment = editorActivity.getCurrentCropFragment()) == null) {
                    return;
                }
                currentCropFragment.updateTextSticker(string);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@dl.e CharSequence charSequence, int i10, int i11, int i12) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@dl.e CharSequence charSequence, int i10, int i11, int i12) {
            }
        });
        getEditText().setOnClickListener(new View.OnClickListener() { // from class: com.starlightc.ucropplus.ui.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TextStickerFragmentDialog.initViews$lambda$1(this.f98125b, view);
            }
        });
        getEditText().setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.starlightc.ucropplus.ui.v
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                TextStickerFragmentDialog.initViews$lambda$2(this.f98126b, view, z10);
            }
        });
        this.fragmentList.clear();
        TextStyleFragment textStyleFragment = new TextStyleFragment();
        this.textStyleFragment = textStyleFragment;
        this.fragmentList.add(textStyleFragment);
        TextModuleFragment textModuleFragment = new TextModuleFragment();
        this.textModuleFragment = textModuleFragment;
        this.fragmentList.add(textModuleFragment);
        ViewPager2 viewPager3 = this.vp2;
        if (viewPager3 == null) {
            kotlin.jvm.internal.f0.S("vp2");
            viewPager3 = null;
        }
        viewPager3.setOffscreenPageLimit(this.fragmentList.size());
        ViewPager2 viewPager4 = this.vp2;
        if (viewPager4 == null) {
            kotlin.jvm.internal.f0.S("vp2");
            viewPager4 = null;
        }
        viewPager4.setAdapter(new FragmentStateAdapter() { // from class: com.starlightc.ucropplus.ui.TextStickerFragmentDialog.initViews.5
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(TextStickerFragmentDialog.this);
            }

            @Override // androidx.viewpager2.adapter.FragmentStateAdapter
            @dl.d
            public Fragment createFragment(int i10) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 50523, new Class[]{Integer.TYPE}, Fragment.class);
                if (patchProxyResultProxy.isSupported) {
                    return (Fragment) patchProxyResultProxy.result;
                }
                Object obj = TextStickerFragmentDialog.this.fragmentList.get(i10);
                kotlin.jvm.internal.f0.o(obj, "get(...)");
                return (Fragment) obj;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public int getItemCount() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50522, new Class[0], Integer.TYPE);
                return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : TextStickerFragmentDialog.this.fragmentList.size();
            }
        });
        TabLayout tabLayout = this.tabLayout;
        if (tabLayout == null) {
            kotlin.jvm.internal.f0.S("tabLayout");
            tabLayout = null;
        }
        ViewPager2 viewPager5 = this.vp2;
        if (viewPager5 == null) {
            kotlin.jvm.internal.f0.S("vp2");
        } else {
            viewPager2 = viewPager5;
        }
        new com.google.android.material.tabs.d(tabLayout, viewPager2, new com.google.android.material.tabs.d.b() { // from class: com.starlightc.ucropplus.ui.w
            @Override // com.google.android.material.tabs.d.b
            public final void a(TabLayout.h hVar, int i10) {
                TextStickerFragmentDialog.initViews$lambda$3(this.f98127a, hVar, i10);
            }
        }).a();
        getBinding().ivClose.setOnClickListener(new View.OnClickListener() { // from class: com.starlightc.ucropplus.ui.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws InterruptedException {
                TextStickerFragmentDialog.initViews$lambda$4(this.f98128b, view);
            }
        });
        getBinding().ivConfirm.setOnClickListener(new View.OnClickListener() { // from class: com.starlightc.ucropplus.ui.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TextStickerFragmentDialog.initViews$lambda$5(this.f98129b, view);
            }
        });
    }

    public final boolean isViewCreated() {
        return this.isViewCreated;
    }

    @Override // com.starlightc.ucropplus.ui.BaseFragmentDialog
    public void loadData() {
        UCropPlusFragment currentCropFragment;
        UCropPlusFragment currentCropFragment2;
        UCropPlusFragment currentCropFragment3;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50502, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.isViewCreated = true;
        UCropPlusActivity editorActivity = getEditorActivity();
        boolean z10 = (editorActivity == null || (currentCropFragment3 = editorActivity.getCurrentCropFragment()) == null || !currentCropFragment3.isTextStickerSelected()) ? false : true;
        String currentTextContent = null;
        if (!z10) {
            UCropPlusActivity editorActivity2 = getEditorActivity();
            if (editorActivity2 == null || (currentCropFragment = editorActivity2.getCurrentCropFragment()) == null) {
                return;
            }
            UCropPlusFragment.createTextSticker$default(currentCropFragment, null, false, 3, null);
            return;
        }
        EditText editText = getEditText();
        UCropPlusActivity editorActivity3 = getEditorActivity();
        if (editorActivity3 != null && (currentCropFragment2 = editorActivity3.getCurrentCropFragment()) != null) {
            currentTextContent = currentCropFragment2.getCurrentTextContent();
        }
        editText.setText(currentTextContent);
    }

    @Override // com.starlightc.ucropplus.ui.BaseFragmentDialog, androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50501, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroyView();
        d2 d2Var = this.checkJob;
        if (d2Var != null) {
            kotlin.jvm.internal.f0.m(d2Var);
            if (d2Var.isActive()) {
                d2 d2Var2 = this.checkJob;
                kotlin.jvm.internal.f0.m(d2Var2);
                d2.a.b(d2Var2, null, 1, null);
            }
        }
    }

    public final void setBinding(@dl.d FragmentTextBinding fragmentTextBinding) {
        if (PatchProxy.proxy(new Object[]{fragmentTextBinding}, this, changeQuickRedirect, false, 50493, new Class[]{FragmentTextBinding.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(fragmentTextBinding, "<set-?>");
        this.binding = fragmentTextBinding;
    }

    public final void setCheckJob(@dl.e d2 d2Var) {
        this.checkJob = d2Var;
    }

    public final void setCurrentStickerText() {
        UCropPlusFragment currentCropFragment;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50500, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        EditText editText = getEditText();
        UCropPlusActivity editorActivity = getEditorActivity();
        TextModuleFragment textModuleFragment = null;
        editText.setText((editorActivity == null || (currentCropFragment = editorActivity.getCurrentCropFragment()) == null) ? null : currentCropFragment.getCurrentTextContent());
        TextModuleFragment textModuleFragment2 = this.textModuleFragment;
        if (textModuleFragment2 == null) {
            kotlin.jvm.internal.f0.S("textModuleFragment");
            textModuleFragment2 = null;
        }
        if (textModuleFragment2.isActive()) {
            TextModuleFragment textModuleFragment3 = this.textModuleFragment;
            if (textModuleFragment3 == null) {
                kotlin.jvm.internal.f0.S("textModuleFragment");
            } else {
                textModuleFragment = textModuleFragment3;
            }
            textModuleFragment.checkSelectedInfo();
        }
    }

    public final void setEditText(@dl.d EditText editText) {
        if (PatchProxy.proxy(new Object[]{editText}, this, changeQuickRedirect, false, 50495, new Class[]{EditText.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(editText, "<set-?>");
        this.editText = editText;
    }

    public final void setViewCreated(boolean z10) {
        this.isViewCreated = z10;
    }
}
