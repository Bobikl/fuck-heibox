package com.starlightc.ucropplus.ui;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.b1;
import androidx.lifecycle.y0;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.gson.JsonObject;
import com.max.hbcommon.bean.analytics.PageEventObj;
import com.max.hbcommon.bean.analytics.PathSrcNode;
import com.max.network.entities.ApiResponse;
import com.max.network.utils.DownloadResultBuilder;
import com.max.network.utils.FlowUtilKt;
import com.max.network.utils.ResultBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.R;
import com.starlightc.ucropplus.UCrop;
import com.starlightc.ucropplus.databinding.UcpEditorActivityBinding;
import com.starlightc.ucropplus.enums.EDIT_MODE;
import com.starlightc.ucropplus.model.CropRatioInfo;
import com.starlightc.ucropplus.model.Draft;
import com.starlightc.ucropplus.model.StickerGroupInfo;
import com.starlightc.ucropplus.model.StickerGroupInfoList;
import com.starlightc.ucropplus.model.TextTypefaceInfo;
import com.starlightc.ucropplus.model.TextTypefaceInfoList;
import com.starlightc.ucropplus.model.UCropPlusViewModel;
import com.starlightc.ucropplus.util.TypefaceUtil;
import com.starlightc.ucropplus.view.StickerView;
import com.starlightc.ucropplus.view.widget.stickeritem.LabelStickerItem;
import com.xiaomi.push.BuildConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.v0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;

/* JADX INFO: compiled from: UCropPlusActivity.kt */
/* JADX INFO: loaded from: classes4.dex */
@t0({"SMAP\nUCropPlusActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UCropPlusActivity.kt\ncom/starlightc/ucropplus/ui/UCropPlusActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,633:1\n75#2,13:634\n1#3:647\n1855#4,2:648\n*S KotlinDebug\n*F\n+ 1 UCropPlusActivity.kt\ncom/starlightc/ucropplus/ui/UCropPlusActivity\n*L\n112#1:634,13\n423#1:648,2\n*E\n"})
public class UCropPlusActivity extends AppCompatActivity implements StickerView.StickerStatusChangeListener {

    @dl.d
    public static final String ARG_EXTRA = "arg_extra";

    @dl.d
    public static final String ARG_INDEX = "index";

    @dl.d
    public static final String ARG_MODULE = "module";

    @dl.d
    public static final String ARG_ONLY_CROP = "only_crop";

    @dl.d
    public static final String ARG_OUTPUT_DIR = "output_dir";

    @dl.d
    public static final String ARG_RATIO_LIST = "arg_ratio_list";

    @dl.d
    public static final String ARG_SHOW_FILTER = "show_filter";

    @dl.d
    public static final String ARG_SOURCE_PATH = "source_path";

    @dl.d
    public static final String ARG_SOURCE_PATH_ADDITIONAL = "source_path_additional";

    @dl.d
    public static final String ARG_TYPE = "type";

    @dl.d
    public static final String TYPE_MODULE = "1";

    @dl.d
    public static final String TYPE_NORMAL = "0";
    public static ChangeQuickRedirect changeQuickRedirect;
    private UcpEditorActivityBinding binding;
    private boolean circleCrop;

    @dl.e
    private ArrayList<CropRatioInfo> cropRatioList;

    @dl.e
    private UCropPlusFragment currentCropFragment;

    @dl.e
    private BaseFragmentDialog currentDialogFragment;

    @dl.e
    private String extra;

    @dl.e
    private ProgressDialog loadingDialog;

    @dl.e
    private Intent mIntent;

    @androidx.annotation.l
    private int mRootViewBackgroundColor;
    private boolean onlyCrop;

    @dl.e
    private Uri outputUri;

    @dl.e
    private String sourcePath;

    @dl.e
    private String sourcePathAdditional;
    private MaterialToolbar toolBar;
    private UCropPlusMainFragment ucropPlusMainFragment;

    @dl.d
    private final kotlin.z viewModel$delegate;
    private ViewPager2 viewpager;
    private FragmentStateAdapter vpAdapter;

    @dl.d
    public static final Companion Companion = new Companion(null);
    private static final int DEFAULT_COMPRESS_QUALITY = 100;

    @dl.d
    private static final Bitmap.CompressFormat DEFAULT_COMPRESS_FORMAT = Bitmap.CompressFormat.JPEG;

    @dl.d
    private static final ArrayList<TextTypefaceInfo> remoteTFList = new ArrayList<>();

    @dl.d
    private Bitmap.CompressFormat mCompressFormat = DEFAULT_COMPRESS_FORMAT;
    private int mCompressQuality = DEFAULT_COMPRESS_QUALITY;
    private final String TAG = getClass().getSimpleName();

    @dl.d
    private EDIT_MODE editMode = EDIT_MODE.IDLE;

    @dl.d
    private ArrayList<Uri> inputUris = new ArrayList<>();

    @dl.d
    private ArrayList<UCropPlusFragment> pageList = new ArrayList<>();

    @dl.d
    private final q0 uiScope = r0.a(e1.e());

    @dl.d
    private final q0 ioScope = r0.a(e1.c());

    /* JADX INFO: compiled from: UCropPlusActivity.kt */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final Bitmap.CompressFormat getDEFAULT_COMPRESS_FORMAT() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50619, new Class[0], Bitmap.CompressFormat.class);
            return patchProxyResultProxy.isSupported ? (Bitmap.CompressFormat) patchProxyResultProxy.result : UCropPlusActivity.DEFAULT_COMPRESS_FORMAT;
        }

        public final int getDEFAULT_COMPRESS_QUALITY() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50618, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : UCropPlusActivity.DEFAULT_COMPRESS_QUALITY;
        }

        @dl.d
        public final ArrayList<TextTypefaceInfo> getRemoteTFList() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50620, new Class[0], ArrayList.class);
            return patchProxyResultProxy.isSupported ? (ArrayList) patchProxyResultProxy.result : UCropPlusActivity.remoteTFList;
        }
    }

    /* JADX INFO: compiled from: UCropPlusActivity.kt */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EDIT_MODE.valuesCustom().length];
            try {
                iArr[EDIT_MODE.MODULE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EDIT_MODE.STICKER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EDIT_MODE.CROP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EDIT_MODE.TEXT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EDIT_MODE.LABEL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.starlightc.ucropplus.ui.UCropPlusActivity$getStickerList$1, reason: invalid class name */
    /* JADX INFO: compiled from: UCropPlusActivity.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.starlightc.ucropplus.ui.UCropPlusActivity$getStickerList$1", f = "UCropPlusActivity.kt", i = {}, l = {bb.c.b.E1}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements yh.l<kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;
        int label;

        AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(1, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 50630, new Class[]{kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : UCropPlusActivity.this.new AnonymousClass1(cVar);
        }

        @Override // yh.l
        public /* bridge */ /* synthetic */ Object invoke(kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 50632, new Class[]{Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 50631, new Class[]{kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50629, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.t0.n(obj);
                UCropPlusViewModel uCropPlusViewModelAccess$getViewModel = UCropPlusActivity.access$getViewModel(UCropPlusActivity.this);
                this.label = 1;
                if (uCropPlusViewModelAccess$getViewModel.getStickerList(this) == objH) {
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

    /* JADX INFO: renamed from: com.starlightc.ucropplus.ui.UCropPlusActivity$saveDraftAndFinish$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: UCropPlusActivity.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.starlightc.ucropplus.ui.UCropPlusActivity$saveDraftAndFinish$1", f = "UCropPlusActivity.kt", i = {}, l = {bb.c.b.f30744k8}, m = "invokeSuspend", n = {}, s = {})
    public static final class C13241 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;
        int label;

        /* JADX INFO: renamed from: com.starlightc.ucropplus.ui.UCropPlusActivity$saveDraftAndFinish$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: UCropPlusActivity.kt */
        @kotlin.coroutines.jvm.internal.d(c = "com.starlightc.ucropplus.ui.UCropPlusActivity$saveDraftAndFinish$1$1", f = "UCropPlusActivity.kt", i = {}, l = {bb.c.b.f30790m8}, m = "invokeSuspend", n = {}, s = {})
        public static final class C09371 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
            public static ChangeQuickRedirect changeQuickRedirect;
            int label;
            final /* synthetic */ UCropPlusActivity this$0;

            /* JADX INFO: renamed from: com.starlightc.ucropplus.ui.UCropPlusActivity$saveDraftAndFinish$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: UCropPlusActivity.kt */
            @kotlin.coroutines.jvm.internal.d(c = "com.starlightc.ucropplus.ui.UCropPlusActivity$saveDraftAndFinish$1$1$1", f = "UCropPlusActivity.kt", i = {}, l = {bb.c.b.f30859p8}, m = "invokeSuspend", n = {}, s = {})
            public static final class C09381 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ ArrayList<Draft> $resultList;
                Object L$0;
                Object L$1;
                int label;
                final /* synthetic */ UCropPlusActivity this$0;

                /* JADX INFO: renamed from: com.starlightc.ucropplus.ui.UCropPlusActivity$saveDraftAndFinish$1$1$1$1, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: compiled from: UCropPlusActivity.kt */
                @kotlin.coroutines.jvm.internal.d(c = "com.starlightc.ucropplus.ui.UCropPlusActivity$saveDraftAndFinish$1$1$1$1", f = "UCropPlusActivity.kt", i = {}, l = {bb.c.b.f30859p8}, m = "invokeSuspend", n = {}, s = {})
                public static final class C09391 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super Draft>, Object> {
                    public static ChangeQuickRedirect changeQuickRedirect;
                    final /* synthetic */ UCropPlusFragment $fragment;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C09391(UCropPlusFragment uCropPlusFragment, kotlin.coroutines.c<? super C09391> cVar) {
                        super(2, cVar);
                        this.$fragment = uCropPlusFragment;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @dl.d
                    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 50658, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
                        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new C09391(this.$fragment, cVar);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super Draft> cVar) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 50660, new Class[]{Object.class, Object.class}, Object.class);
                        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
                    }

                    @dl.e
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super Draft> cVar) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 50659, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
                        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((C09391) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @dl.e
                    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50657, new Class[]{Object.class}, Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        Object objH = kotlin.coroutines.intrinsics.b.h();
                        int i10 = this.label;
                        if (i10 == 0) {
                            kotlin.t0.n(obj);
                            UCropPlusFragment uCropPlusFragment = this.$fragment;
                            this.label = 1;
                            obj = uCropPlusFragment.saveDraft(this);
                            if (obj == objH) {
                                return objH;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.t0.n(obj);
                        }
                        return obj;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C09381(UCropPlusActivity uCropPlusActivity, ArrayList<Draft> arrayList, kotlin.coroutines.c<? super C09381> cVar) {
                    super(2, cVar);
                    this.this$0 = uCropPlusActivity;
                    this.$resultList = arrayList;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.d
                public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 50654, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
                    return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new C09381(this.this$0, this.$resultList, cVar);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 50656, new Class[]{Object.class, Object.class}, Object.class);
                    return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
                }

                @dl.e
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 50655, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
                    return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((C09381) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
                }

                /* JADX WARN: Code duplicated, block: B:15:0x0056  */
                /* JADX WARN: Code duplicated, block: B:19:0x007a A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:20:0x007b  */
                /* JADX WARN: Code duplicated, block: B:25:0x0085 A[SYNTHETIC] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x007b -> B:21:0x007f). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:19:0x007a
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.e
                public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r10) {
                    /*
                        r9 = this;
                        r0 = 1
                        java.lang.Object[] r1 = new java.lang.Object[r0]
                        r2 = 0
                        r1[r2] = r10
                        com.meituan.robust.ChangeQuickRedirect r3 = com.starlightc.ucropplus.ui.UCropPlusActivity.C13241.C09371.C09381.changeQuickRedirect
                        java.lang.Class[] r6 = new java.lang.Class[r0]
                        java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
                        r6[r2] = r4
                        java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
                        r4 = 0
                        r5 = 50653(0xc5dd, float:7.098E-41)
                        r2 = r9
                        com.meituan.robust.PatchProxyResult r1 = com.meituan.robust.PatchProxy.proxy(r1, r2, r3, r4, r5, r6, r7)
                        boolean r2 = r1.isSupported
                        if (r2 == 0) goto L20
                        java.lang.Object r10 = r1.result
                        return r10
                    L20:
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.b.h()
                        int r2 = r9.label
                        if (r2 == 0) goto L41
                        if (r2 != r0) goto L39
                        java.lang.Object r2 = r9.L$1
                        java.util.ArrayList r2 = (java.util.ArrayList) r2
                        java.lang.Object r3 = r9.L$0
                        java.util.Iterator r3 = (java.util.Iterator) r3
                        kotlin.t0.n(r10)
                        r4 = r2
                        r2 = r1
                        r1 = r9
                        goto L7f
                    L39:
                        java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r10.<init>(r0)
                        throw r10
                    L41:
                        kotlin.t0.n(r10)
                        com.starlightc.ucropplus.ui.UCropPlusActivity r10 = r9.this$0
                        java.util.ArrayList r10 = com.starlightc.ucropplus.ui.UCropPlusActivity.access$getPageList$p(r10)
                        java.util.Iterator r10 = r10.iterator()
                        r3 = r10
                        r10 = r9
                    L50:
                        boolean r2 = r3.hasNext()
                        if (r2 == 0) goto L85
                        java.lang.Object r2 = r3.next()
                        com.starlightc.ucropplus.ui.UCropPlusFragment r2 = (com.starlightc.ucropplus.ui.UCropPlusFragment) r2
                        boolean r4 = r2.needSaveDraft()
                        if (r4 == 0) goto L50
                        java.util.ArrayList<com.starlightc.ucropplus.model.Draft> r4 = r10.$resultList
                        kotlinx.coroutines.CoroutineDispatcher r5 = kotlinx.coroutines.e1.c()
                        com.starlightc.ucropplus.ui.UCropPlusActivity$saveDraftAndFinish$1$1$1$1 r6 = new com.starlightc.ucropplus.ui.UCropPlusActivity$saveDraftAndFinish$1$1$1$1
                        r7 = 0
                        r6.<init>(r2, r7)
                        r10.L$0 = r3
                        r10.L$1 = r4
                        r10.label = r0
                        java.lang.Object r2 = kotlinx.coroutines.i.h(r5, r6, r10)
                        if (r2 != r1) goto L7b
                        return r1
                    L7b:
                        r8 = r1
                        r1 = r10
                        r10 = r2
                        r2 = r8
                    L7f:
                        r4.add(r10)
                        r10 = r1
                        r1 = r2
                        goto L50
                    L85:
                        java.util.ArrayList<com.starlightc.ucropplus.model.Draft> r10 = r10.$resultList
                        java.lang.String r10 = com.max.hbutils.utils.k.r(r10)
                        java.lang.String r0 = "draft_info"
                        com.max.hbcache.c.C(r0, r10)
                        kotlin.b2 r10 = kotlin.b2.f124493a
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.starlightc.ucropplus.ui.UCropPlusActivity.C13241.C09371.C09381.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C09371(UCropPlusActivity uCropPlusActivity, kotlin.coroutines.c<? super C09371> cVar) {
                super(2, cVar);
                this.this$0 = uCropPlusActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.d
            public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 50650, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
                return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new C09371(this.this$0, cVar);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 50652, new Class[]{Object.class, Object.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
            }

            @dl.e
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 50651, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((C09371) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.e
            public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50649, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                Object objH = kotlin.coroutines.intrinsics.b.h();
                int i10 = this.label;
                if (i10 == 0) {
                    kotlin.t0.n(obj);
                    C09381 c09381 = new C09381(this.this$0, new ArrayList(), null);
                    this.label = 1;
                    if (r0.g(c09381, this) == objH) {
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

        C13241(kotlin.coroutines.c<? super C13241> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 50646, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : UCropPlusActivity.this.new C13241(cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 50648, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 50647, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((C13241) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50645, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.t0.n(obj);
                CoroutineDispatcher coroutineDispatcherC = e1.c();
                C09371 c09371 = new C09371(UCropPlusActivity.this, null);
                this.label = 1;
                if (kotlinx.coroutines.i.h(coroutineDispatcherC, c09371, this) == objH) {
                    return objH;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.t0.n(obj);
            }
            UCropPlusActivity.this.finish();
            return b2.f124493a;
        }
    }

    /* JADX INFO: renamed from: com.starlightc.ucropplus.ui.UCropPlusActivity$saveImage$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: UCropPlusActivity.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.starlightc.ucropplus.ui.UCropPlusActivity$saveImage$1", f = "UCropPlusActivity.kt", i = {}, l = {bb.c.b.f30789m7}, m = "invokeSuspend", n = {}, s = {})
    public static final class C13251 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;
        int label;

        C13251(kotlin.coroutines.c<? super C13251> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 50662, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : UCropPlusActivity.this.new C13251(cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 50664, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 50663, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((C13251) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50661, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.t0.n(obj);
                CoroutineDispatcher coroutineDispatcherC = e1.c();
                UCropPlusActivity$saveImage$1$saveError$1 uCropPlusActivity$saveImage$1$saveError$1 = new UCropPlusActivity$saveImage$1$saveError$1(UCropPlusActivity.this, null);
                this.label = 1;
                if (kotlinx.coroutines.i.h(coroutineDispatcherC, uCropPlusActivity$saveImage$1$saveError$1, this) == objH) {
                    return objH;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.t0.n(obj);
            }
            ProgressDialog progressDialog = UCropPlusActivity.this.loadingDialog;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            UCropPlusActivity.this.finish();
            com.max.mediaselector.f.f74753a.a();
            return b2.f124493a;
        }
    }

    /* JADX INFO: renamed from: com.starlightc.ucropplus.ui.UCropPlusActivity$updateRemoteTypefaceList$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: UCropPlusActivity.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.starlightc.ucropplus.ui.UCropPlusActivity$updateRemoteTypefaceList$1", f = "UCropPlusActivity.kt", i = {}, l = {bb.c.b.f31051y1}, m = "invokeSuspend", n = {}, s = {})
    public static final class C13281 extends SuspendLambda implements yh.l<kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;
        int label;

        C13281(kotlin.coroutines.c<? super C13281> cVar) {
            super(1, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 50687, new Class[]{kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : UCropPlusActivity.this.new C13281(cVar);
        }

        @Override // yh.l
        public /* bridge */ /* synthetic */ Object invoke(kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 50689, new Class[]{Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 50688, new Class[]{kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((C13281) create(cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50686, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.t0.n(obj);
                UCropPlusViewModel uCropPlusViewModelAccess$getViewModel = UCropPlusActivity.access$getViewModel(UCropPlusActivity.this);
                this.label = 1;
                if (uCropPlusViewModelAccess$getViewModel.getTypefaceInfoList(this) == objH) {
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

    public UCropPlusActivity() {
        final yh.a aVar = null;
        this.viewModel$delegate = new ViewModelLazy(kotlin.jvm.internal.n0.d(UCropPlusViewModel.class), new yh.a<b1>() { // from class: com.starlightc.ucropplus.ui.UCropPlusActivity$special$$inlined$viewModels$default$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // yh.a
            @dl.d
            public final b1 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50682, new Class[0], b1.class);
                if (patchProxyResultProxy.isSupported) {
                    return (b1) patchProxyResultProxy.result;
                }
                b1 viewModelStore = this.getViewModelStore();
                kotlin.jvm.internal.f0.o(viewModelStore, "viewModelStore");
                return viewModelStore;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.b1, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b1 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50683, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }
        }, new yh.a<y0.b>() { // from class: com.starlightc.ucropplus.ui.UCropPlusActivity$special$$inlined$viewModels$default$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // yh.a
            @dl.d
            public final y0.b invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50680, new Class[0], y0.b.class);
                if (patchProxyResultProxy.isSupported) {
                    return (y0.b) patchProxyResultProxy.result;
                }
                y0.b defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                kotlin.jvm.internal.f0.o(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.y0$b, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ y0.b invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50681, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }
        }, new yh.a<u2.a>() { // from class: com.starlightc.ucropplus.ui.UCropPlusActivity$special$$inlined$viewModels$default$3
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, u2.a] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ u2.a invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50685, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }

            @Override // yh.a
            @dl.d
            public final u2.a invoke() {
                u2.a aVar2;
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50684, new Class[0], u2.a.class);
                if (patchProxyResultProxy.isSupported) {
                    return (u2.a) patchProxyResultProxy.result;
                }
                yh.a aVar3 = aVar;
                if (aVar3 != null && (aVar2 = (u2.a) aVar3.invoke()) != null) {
                    return aVar2;
                }
                u2.a defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                kotlin.jvm.internal.f0.o(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        });
    }

    public static final /* synthetic */ UCropPlusViewModel access$getViewModel(UCropPlusActivity uCropPlusActivity) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{uCropPlusActivity}, null, changeQuickRedirect, true, 50616, new Class[]{UCropPlusActivity.class}, UCropPlusViewModel.class);
        return patchProxyResultProxy.isSupported ? (UCropPlusViewModel) patchProxyResultProxy.result : uCropPlusActivity.getViewModel();
    }

    public static final /* synthetic */ void access$reportEdit(UCropPlusActivity uCropPlusActivity) {
        if (PatchProxy.proxy(new Object[]{uCropPlusActivity}, null, changeQuickRedirect, true, 50617, new Class[]{UCropPlusActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        uCropPlusActivity.reportEdit();
    }

    private final void bindViews() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50581, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        UcpEditorActivityBinding ucpEditorActivityBindingInflate = UcpEditorActivityBinding.inflate(LayoutInflater.from(this));
        kotlin.jvm.internal.f0.o(ucpEditorActivityBindingInflate, "inflate(...)");
        this.binding = ucpEditorActivityBindingInflate;
        UcpEditorActivityBinding ucpEditorActivityBinding = null;
        if (ucpEditorActivityBindingInflate == null) {
            kotlin.jvm.internal.f0.S("binding");
            ucpEditorActivityBindingInflate = null;
        }
        setContentView(ucpEditorActivityBindingInflate.getRoot());
        UcpEditorActivityBinding ucpEditorActivityBinding2 = this.binding;
        if (ucpEditorActivityBinding2 == null) {
            kotlin.jvm.internal.f0.S("binding");
        } else {
            ucpEditorActivityBinding = ucpEditorActivityBinding2;
        }
        MaterialToolbar toolbar = ucpEditorActivityBinding.toolbar;
        kotlin.jvm.internal.f0.o(toolbar, "toolbar");
        this.toolBar = toolbar;
        setupViewPager();
    }

    public static /* synthetic */ void downloadTypeface$default(UCropPlusActivity uCropPlusActivity, String str, String str2, yh.l lVar, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{uCropPlusActivity, str, str2, lVar, new Integer(i10), obj}, null, changeQuickRedirect, true, 50593, new Class[]{UCropPlusActivity.class, String.class, String.class, yh.l.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: downloadTypeface");
        }
        uCropPlusActivity.downloadTypeface(str, (i10 & 2) != 0 ? null : str2, lVar);
    }

    private final void getIntentInfo() {
        Bitmap.CompressFormat compressFormatValueOf;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50584, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Intent intent = getIntent();
        this.mIntent = intent;
        kotlin.jvm.internal.f0.m(intent);
        this.mRootViewBackgroundColor = intent.getIntExtra(UCrop.Options.EXTRA_UCROP_ROOT_VIEW_BACKGROUND_COLOR, androidx.core.content.d.f(this, R.color.brand_color_primary));
        Intent intent2 = this.mIntent;
        kotlin.jvm.internal.f0.m(intent2);
        ArrayList parcelableArrayListExtra = intent2.getParcelableArrayListExtra(UCrop.EXTRA_MULTI_INPUT_URI);
        if (parcelableArrayListExtra != null) {
            this.inputUris.addAll(parcelableArrayListExtra);
        }
        Intent intent3 = this.mIntent;
        kotlin.jvm.internal.f0.m(intent3);
        this.outputUri = (Uri) intent3.getParcelableExtra(UCrop.EXTRA_OUTPUT_URI);
        Intent intent4 = this.mIntent;
        kotlin.jvm.internal.f0.m(intent4);
        String stringExtra = intent4.getStringExtra(UCrop.Options.EXTRA_COMPRESSION_FORMAT_NAME);
        if (TextUtils.isEmpty(stringExtra)) {
            compressFormatValueOf = null;
        } else {
            kotlin.jvm.internal.f0.m(stringExtra);
            compressFormatValueOf = Bitmap.CompressFormat.valueOf(stringExtra);
        }
        if (compressFormatValueOf == null) {
            compressFormatValueOf = DEFAULT_COMPRESS_FORMAT;
        }
        this.mCompressFormat = compressFormatValueOf;
        Intent intent5 = this.mIntent;
        kotlin.jvm.internal.f0.m(intent5);
        this.mCompressQuality = intent5.getIntExtra(UCrop.Options.EXTRA_COMPRESSION_QUALITY, DEFAULT_COMPRESS_QUALITY);
        Intent intent6 = this.mIntent;
        kotlin.jvm.internal.f0.m(intent6);
        this.onlyCrop = intent6.getBooleanExtra(ARG_ONLY_CROP, false);
        Intent intent7 = this.mIntent;
        kotlin.jvm.internal.f0.m(intent7);
        this.circleCrop = intent7.getBooleanExtra(UCrop.Options.EXTRA_CIRCLE_DIMMED_LAYER, false);
        Intent intent8 = this.mIntent;
        kotlin.jvm.internal.f0.m(intent8);
        this.cropRatioList = (ArrayList) intent8.getSerializableExtra(ARG_RATIO_LIST);
        Intent intent9 = this.mIntent;
        kotlin.jvm.internal.f0.m(intent9);
        this.sourcePath = intent9.getStringExtra(ARG_SOURCE_PATH);
        Intent intent10 = this.mIntent;
        kotlin.jvm.internal.f0.m(intent10);
        this.sourcePathAdditional = intent10.getStringExtra(ARG_SOURCE_PATH_ADDITIONAL);
        Intent intent11 = this.mIntent;
        this.extra = intent11 != null ? intent11.getStringExtra(ARG_EXTRA) : null;
    }

    private final UCropPlusViewModel getViewModel() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50576, new Class[0], UCropPlusViewModel.class);
        return patchProxyResultProxy.isSupported ? (UCropPlusViewModel) patchProxyResultProxy.result : (UCropPlusViewModel) this.viewModel$delegate.getValue();
    }

    private final void initViewModel() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50595, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        kotlinx.coroutines.flow.u<ApiResponse<TextTypefaceInfoList>> typefaceStateFlow = getViewModel().getTypefaceStateFlow();
        Lifecycle.State state = Lifecycle.State.STARTED;
        FlowUtilKt.launchAndCollectIn(typefaceStateFlow, this, state, new yh.l<ResultBuilder<TextTypefaceInfoList>, b2>() { // from class: com.starlightc.ucropplus.ui.UCropPlusActivity.initViewModel.1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(ResultBuilder<TextTypefaceInfoList> resultBuilder) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{resultBuilder}, this, changeQuickRedirect, false, 50634, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2(resultBuilder);
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@dl.d ResultBuilder<TextTypefaceInfoList> launchAndCollectIn) {
                if (PatchProxy.proxy(new Object[]{launchAndCollectIn}, this, changeQuickRedirect, false, 50633, new Class[]{ResultBuilder.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(launchAndCollectIn, "$this$launchAndCollectIn");
                final UCropPlusActivity uCropPlusActivity = UCropPlusActivity.this;
                launchAndCollectIn.setOnSuccess(new yh.l<TextTypefaceInfoList, b2>() { // from class: com.starlightc.ucropplus.ui.UCropPlusActivity.initViewModel.1.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    {
                        super(1);
                    }

                    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(TextTypefaceInfoList textTypefaceInfoList) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{textTypefaceInfoList}, this, changeQuickRedirect, false, 50636, new Class[]{Object.class}, Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        invoke2(textTypefaceInfoList);
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@dl.e TextTypefaceInfoList textTypefaceInfoList) {
                        List<TextTypefaceInfo> typeface_list;
                        if (PatchProxy.proxy(new Object[]{textTypefaceInfoList}, this, changeQuickRedirect, false, 50635, new Class[]{TextTypefaceInfoList.class}, Void.TYPE).isSupported || textTypefaceInfoList == null || (typeface_list = textTypefaceInfoList.getTypeface_list()) == null) {
                            return;
                        }
                        UCropPlusActivity uCropPlusActivity2 = uCropPlusActivity;
                        Companion companion = UCropPlusActivity.Companion;
                        companion.getRemoteTFList().clear();
                        companion.getRemoteTFList().addAll(typeface_list);
                        for (final TextTypefaceInfo textTypefaceInfo : typeface_list) {
                            if (textTypefaceInfo.getName() != null) {
                                TypefaceUtil typefaceUtil = TypefaceUtil.INSTANCE;
                                StringBuilder sb2 = new StringBuilder();
                                String name = textTypefaceInfo.getName();
                                kotlin.jvm.internal.f0.m(name);
                                sb2.append(name);
                                sb2.append("demo");
                                if (!typefaceUtil.isRemoteTypefaceCached(sb2.toString())) {
                                    uCropPlusActivity2.downloadTypefaceDemo(textTypefaceInfo.getName(), new yh.l<DownloadResultBuilder<String>, b2>() { // from class: com.starlightc.ucropplus.ui.UCropPlusActivity$initViewModel$1$1$1$1
                                        public static ChangeQuickRedirect changeQuickRedirect;

                                        {
                                            super(1);
                                        }

                                        /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                                        @Override // yh.l
                                        public /* bridge */ /* synthetic */ b2 invoke(DownloadResultBuilder<String> downloadResultBuilder) {
                                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{downloadResultBuilder}, this, changeQuickRedirect, false, 50638, new Class[]{Object.class}, Object.class);
                                            if (patchProxyResultProxy.isSupported) {
                                                return patchProxyResultProxy.result;
                                            }
                                            invoke2(downloadResultBuilder);
                                            return b2.f124493a;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@dl.d DownloadResultBuilder<String> downloadTypefaceDemo) {
                                            if (PatchProxy.proxy(new Object[]{downloadTypefaceDemo}, this, changeQuickRedirect, false, 50637, new Class[]{DownloadResultBuilder.class}, Void.TYPE).isSupported) {
                                                return;
                                            }
                                            kotlin.jvm.internal.f0.p(downloadTypefaceDemo, "$this$downloadTypefaceDemo");
                                            final TextTypefaceInfo textTypefaceInfo2 = textTypefaceInfo;
                                            downloadTypefaceDemo.setOnSuccess(new yh.l<String, b2>() { // from class: com.starlightc.ucropplus.ui.UCropPlusActivity$initViewModel$1$1$1$1.1
                                                public static ChangeQuickRedirect changeQuickRedirect;

                                                {
                                                    super(1);
                                                }

                                                /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                                                @Override // yh.l
                                                public /* bridge */ /* synthetic */ b2 invoke(String str) {
                                                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 50640, new Class[]{Object.class}, Object.class);
                                                    if (patchProxyResultProxy.isSupported) {
                                                        return patchProxyResultProxy.result;
                                                    }
                                                    invoke2(str);
                                                    return b2.f124493a;
                                                }

                                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(@dl.e String str) {
                                                    if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 50639, new Class[]{String.class}, Void.TYPE).isSupported || str == null) {
                                                        return;
                                                    }
                                                    TextTypefaceInfo textTypefaceInfo3 = textTypefaceInfo2;
                                                    TypefaceUtil typefaceUtil2 = TypefaceUtil.INSTANCE;
                                                    StringBuilder sb3 = new StringBuilder();
                                                    String name2 = textTypefaceInfo3.getName();
                                                    kotlin.jvm.internal.f0.m(name2);
                                                    sb3.append(name2);
                                                    sb3.append("demo");
                                                    typefaceUtil2.addCachedTypeface(sb3.toString(), str);
                                                }
                                            });
                                        }
                                    });
                                }
                            }
                        }
                    }
                });
            }
        });
        FlowUtilKt.launchAndCollectIn(getViewModel().getStickerStateFlow(), this, state, new yh.l<ResultBuilder<StickerGroupInfoList>, b2>() { // from class: com.starlightc.ucropplus.ui.UCropPlusActivity.initViewModel.2
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(ResultBuilder<StickerGroupInfoList> resultBuilder) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{resultBuilder}, this, changeQuickRedirect, false, 50642, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2(resultBuilder);
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@dl.d ResultBuilder<StickerGroupInfoList> launchAndCollectIn) {
                if (PatchProxy.proxy(new Object[]{launchAndCollectIn}, this, changeQuickRedirect, false, 50641, new Class[]{ResultBuilder.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(launchAndCollectIn, "$this$launchAndCollectIn");
                launchAndCollectIn.setOnSuccess(new yh.l<StickerGroupInfoList, b2>() { // from class: com.starlightc.ucropplus.ui.UCropPlusActivity.initViewModel.2.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(StickerGroupInfoList stickerGroupInfoList) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{stickerGroupInfoList}, this, changeQuickRedirect, false, 50644, new Class[]{Object.class}, Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        invoke2(stickerGroupInfoList);
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@dl.e StickerGroupInfoList stickerGroupInfoList) {
                        if (PatchProxy.proxy(new Object[]{stickerGroupInfoList}, this, changeQuickRedirect, false, 50643, new Class[]{StickerGroupInfoList.class}, Void.TYPE).isSupported || stickerGroupInfoList == null) {
                            return;
                        }
                        ArrayList<StickerGroupInfo> sticker_groups = stickerGroupInfoList.getSticker_groups();
                        if (sticker_groups != null && (true ^ sticker_groups.isEmpty())) {
                            Iterator<StickerGroupInfo> it = sticker_groups.iterator();
                            while (it.hasNext()) {
                                it.next().setType(StickerGroupInfo.STICKER_TYPE_REMOTE);
                            }
                        }
                        com.max.hbcache.c.C(com.max.hbcache.c.f66113b0, stickerGroupInfoList.getSticker_version());
                        com.max.hbcache.c.C(com.max.hbcache.c.f66111a0, com.max.hbutils.utils.k.r(stickerGroupInfoList.getSticker_groups()));
                    }
                });
            }
        });
    }

    private final void initViews() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50596, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Window window = getWindow();
        UCropPlusMainFragment uCropPlusMainFragment = null;
        if (window != null) {
            window.addFlags(Integer.MIN_VALUE);
            Resources resources = getResources();
            int i10 = R.color.brand_color_primary;
            window.setStatusBarColor(androidx.core.content.res.i.e(resources, i10, null));
            window.setNavigationBarColor(androidx.core.content.res.i.e(getResources(), i10, null));
        }
        this.pageList.clear();
        int i11 = 0;
        for (Uri uri : this.inputUris) {
            int i12 = i11 + 1;
            UCropPlusFragment uCropPlusFragment = new UCropPlusFragment();
            Intent intent = this.mIntent;
            Bundle bundle = new Bundle(intent != null ? intent.getExtras() : null);
            bundle.putInt(ARG_INDEX, i11);
            bundle.putParcelable(ARG_OUTPUT_DIR, this.outputUri);
            bundle.putBoolean(ARG_ONLY_CROP, this.onlyCrop);
            uCropPlusFragment.setArguments(bundle);
            this.pageList.add(uCropPlusFragment);
            i11 = i12;
        }
        ViewPager2 viewPager2 = this.viewpager;
        if (viewPager2 == null) {
            kotlin.jvm.internal.f0.S("viewpager");
            viewPager2 = null;
        }
        viewPager2.setOffscreenPageLimit(this.pageList.size());
        FragmentStateAdapter fragmentStateAdapter = this.vpAdapter;
        if (fragmentStateAdapter == null) {
            kotlin.jvm.internal.f0.S("vpAdapter");
            fragmentStateAdapter = null;
        }
        fragmentStateAdapter.notifyItemRangeChanged(0, this.pageList.size());
        this.currentCropFragment = this.pageList.get(0);
        ViewPager2 viewPager3 = this.viewpager;
        if (viewPager3 == null) {
            kotlin.jvm.internal.f0.S("viewpager");
            viewPager3 = null;
        }
        viewPager3.setCurrentItem(0);
        MaterialToolbar materialToolbar = this.toolBar;
        if (materialToolbar == null) {
            kotlin.jvm.internal.f0.S("toolBar");
            materialToolbar = null;
        }
        materialToolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.starlightc.ucropplus.ui.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UCropPlusActivity.initViews$lambda$6(this.f98081b, view);
            }
        });
        initViewModel();
        getStickerList();
        updateRemoteTypefaceList();
        Fragment fragmentR0 = getSupportFragmentManager().r0(R.id.vg_option);
        kotlin.jvm.internal.f0.n(fragmentR0, "null cannot be cast to non-null type com.starlightc.ucropplus.ui.UCropPlusMainFragment");
        this.ucropPlusMainFragment = (UCropPlusMainFragment) fragmentR0;
        String stringExtra = getIntent().getStringExtra("type");
        boolean z10 = kotlin.jvm.internal.f0.g("1", stringExtra) && getIntent().getSerializableExtra("module") != null;
        UCropPlusMainFragment uCropPlusMainFragment2 = this.ucropPlusMainFragment;
        if (uCropPlusMainFragment2 == null) {
            kotlin.jvm.internal.f0.S("ucropPlusMainFragment");
            uCropPlusMainFragment2 = null;
        }
        uCropPlusMainFragment2.setVgCuttingVisibility(z10 ? 8 : 0);
        UCropPlusMainFragment uCropPlusMainFragment3 = this.ucropPlusMainFragment;
        if (uCropPlusMainFragment3 == null) {
            kotlin.jvm.internal.f0.S("ucropPlusMainFragment");
        } else {
            uCropPlusMainFragment = uCropPlusMainFragment3;
        }
        uCropPlusMainFragment.setVgModuleVisibility(kotlin.jvm.internal.f0.g("1", stringExtra) ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$6(UCropPlusActivity this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, 50615, new Class[]{UCropPlusActivity.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        this$0.onBackPressed();
    }

    private final void reportEdit() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50613, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        String path = this.sourcePath;
        String string = this.sourcePathAdditional;
        if (com.max.hbcommon.utils.c.u(path) && !com.max.hbcommon.utils.c.u(com.max.mediaselector.lib.c.N)) {
            try {
                PathSrcNode pathSrcNode = (PathSrcNode) com.max.hbutils.utils.k.a(com.max.mediaselector.lib.c.N, PathSrcNode.class);
                path = pathSrcNode.getPath();
                JsonObject addition = pathSrcNode.getAddition();
                string = addition != null ? addition.toString() : null;
            } catch (Throwable unused) {
            }
        }
        PageEventObj pageEventObj = new PageEventObj();
        pageEventObj.setTime(String.valueOf(System.currentTimeMillis() / ((long) 1000)));
        pageEventObj.setType("4");
        pageEventObj.setPath(lb.d.C0);
        JsonObject jsonObject = new JsonObject();
        if (path != null) {
            jsonObject.addProperty(ARG_SOURCE_PATH, path);
        }
        if (string != null) {
            jsonObject.addProperty("source_path_addition", string);
        }
        pageEventObj.setAddition(jsonObject);
        com.max.hbcommon.analytics.d.c(pageEventObj, true);
    }

    private final void saveDraftAndFinish() {
        int i10 = 0;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50612, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Iterator<UCropPlusFragment> it = this.pageList.iterator();
        while (it.hasNext()) {
            if (it.next().needSaveDraft()) {
                i10++;
            }
        }
        Log.d("UCropPlus", "saveDraft " + i10);
        if (i10 > 0) {
            kotlinx.coroutines.k.f(this.uiScope, null, null, new C13241(null), 3, null);
        } else {
            finish();
        }
    }

    public static /* synthetic */ void setTargetAspectRatio$default(UCropPlusActivity uCropPlusActivity, int i10, int i11, boolean z10, int i12, Object obj) {
        Object[] objArr = {uCropPlusActivity, new Integer(i10), new Integer(i11), new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i12), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 50604, new Class[]{UCropPlusActivity.class, cls, cls, Boolean.TYPE, cls, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setTargetAspectRatio");
        }
        if ((i12 & 4) != 0) {
            z10 = true;
        }
        uCropPlusActivity.setTargetAspectRatio(i10, i11, z10);
    }

    private final void setupViewPager() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50582, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        UcpEditorActivityBinding ucpEditorActivityBinding = this.binding;
        ViewPager2 viewPager2 = null;
        if (ucpEditorActivityBinding == null) {
            kotlin.jvm.internal.f0.S("binding");
            ucpEditorActivityBinding = null;
        }
        ViewPager2 viewpager = ucpEditorActivityBinding.viewpager;
        kotlin.jvm.internal.f0.o(viewpager, "viewpager");
        this.viewpager = viewpager;
        this.vpAdapter = new FragmentStateAdapter(getSupportFragmentManager(), getLifecycle()) { // from class: com.starlightc.ucropplus.ui.UCropPlusActivity.setupViewPager.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // androidx.viewpager2.adapter.FragmentStateAdapter
            @dl.d
            public Fragment createFragment(int i10) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 50678, new Class[]{Integer.TYPE}, Fragment.class);
                if (patchProxyResultProxy.isSupported) {
                    return (Fragment) patchProxyResultProxy.result;
                }
                Object obj = UCropPlusActivity.this.pageList.get(i10);
                kotlin.jvm.internal.f0.o(obj, "get(...)");
                return (Fragment) obj;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public int getItemCount() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50677, new Class[0], Integer.TYPE);
                return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : UCropPlusActivity.this.pageList.size();
            }
        };
        ViewPager2 viewPager3 = this.viewpager;
        if (viewPager3 == null) {
            kotlin.jvm.internal.f0.S("viewpager");
            viewPager3 = null;
        }
        FragmentStateAdapter fragmentStateAdapter = this.vpAdapter;
        if (fragmentStateAdapter == null) {
            kotlin.jvm.internal.f0.S("vpAdapter");
            fragmentStateAdapter = null;
        }
        viewPager3.setAdapter(fragmentStateAdapter);
        ViewPager2 viewPager4 = this.viewpager;
        if (viewPager4 == null) {
            kotlin.jvm.internal.f0.S("viewpager");
        } else {
            viewPager2 = viewPager4;
        }
        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() { // from class: com.starlightc.ucropplus.ui.UCropPlusActivity.setupViewPager.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int i10) {
                if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 50679, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                MaterialToolbar materialToolbar = UCropPlusActivity.this.toolBar;
                UCropPlusMainFragment uCropPlusMainFragment = null;
                if (materialToolbar == null) {
                    kotlin.jvm.internal.f0.S("toolBar");
                    materialToolbar = null;
                }
                v0 v0Var = v0.f124986a;
                String str = String.format("%d/%d", Arrays.copyOf(new Object[]{Integer.valueOf(i10 + 1), Integer.valueOf(UCropPlusActivity.this.pageList.size())}, 2));
                kotlin.jvm.internal.f0.o(str, "format(...)");
                materialToolbar.setTitle(str);
                UCropPlusActivity uCropPlusActivity = UCropPlusActivity.this;
                uCropPlusActivity.setCurrentCropFragment((UCropPlusFragment) uCropPlusActivity.pageList.get(i10));
                UCropPlusMainFragment uCropPlusMainFragment2 = UCropPlusActivity.this.ucropPlusMainFragment;
                if (uCropPlusMainFragment2 == null) {
                    kotlin.jvm.internal.f0.S("ucropPlusMainFragment");
                } else {
                    uCropPlusMainFragment = uCropPlusMainFragment2;
                }
                UCropPlusFragment currentCropFragment = UCropPlusActivity.this.getCurrentCropFragment();
                uCropPlusMainFragment.setVgCuttingVisibility(currentCropFragment != null && currentCropFragment.hasModule() ? 8 : 0);
                super.onPageSelected(i10);
            }
        });
    }

    private final void showLoadingDialog() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50610, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.loadingDialog = progressDialog;
        progressDialog.setTitle("正在保存...");
        ProgressDialog progressDialog2 = this.loadingDialog;
        if (progressDialog2 != null) {
            progressDialog2.setCancelable(false);
        }
        ProgressDialog progressDialog3 = this.loadingDialog;
        if (progressDialog3 != null) {
            progressDialog3.show();
        }
    }

    public final void applyCrop() throws IOException {
        UCropPlusFragment uCropPlusFragment;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50605, new Class[0], Void.TYPE).isSupported || (uCropPlusFragment = this.currentCropFragment) == null) {
            return;
        }
        uCropPlusFragment.applyCrop(true);
    }

    public final void changeNavigationBarColor(@androidx.annotation.n int i10) {
        Window window;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 50585, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || (window = getWindow()) == null) {
            return;
        }
        window.setNavigationBarColor(androidx.core.content.res.i.e(getResources(), i10, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3, types: [T, java.lang.String] */
    public final void downloadTypeface(@dl.e String str, @dl.e String str2, @dl.d yh.l<? super DownloadResultBuilder<String>, b2> builder) {
        if (PatchProxy.proxy(new Object[]{str, str2, builder}, this, changeQuickRedirect, false, 50592, new Class[]{String.class, String.class, yh.l.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(builder, "builder");
        if (str != null) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            if (str2 == 0) {
                for (TextTypefaceInfo textTypefaceInfo : remoteTFList) {
                    if (kotlin.jvm.internal.f0.g(textTypefaceInfo.getName(), str)) {
                        objectRef.f124891b = textTypefaceInfo.getTypeface();
                        break;
                    }
                }
            } else {
                objectRef.f124891b = str2;
            }
            if (((String) objectRef.f124891b) != null) {
                FlowUtilKt.launchRequest(this, new UCropPlusActivity$downloadTypeface$1$1$1(this, objectRef, str, builder, null));
            }
        }
    }

    public final void downloadTypefaceDemo(@dl.e String str, @dl.d yh.l<? super DownloadResultBuilder<String>, b2> builder) {
        TextTypefaceInfo textTypefaceInfo;
        if (PatchProxy.proxy(new Object[]{str, builder}, this, changeQuickRedirect, false, 50594, new Class[]{String.class, yh.l.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(builder, "builder");
        if (str != null) {
            Iterator<TextTypefaceInfo> it = remoteTFList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    textTypefaceInfo = null;
                    break;
                }
                TextTypefaceInfo next = it.next();
                if (kotlin.jvm.internal.f0.g(next.getName(), str)) {
                    textTypefaceInfo = next;
                    break;
                }
            }
            if (textTypefaceInfo != null) {
                FlowUtilKt.launchRequest(this, new UCropPlusActivity$downloadTypefaceDemo$1$1$1(this, textTypefaceInfo, str, builder, null));
            }
        }
    }

    public final boolean getCircleCrop() {
        return this.circleCrop;
    }

    @dl.e
    public final ArrayList<CropRatioInfo> getCropRatioList() {
        return this.cropRatioList;
    }

    @dl.e
    public final UCropPlusFragment getCurrentCropFragment() {
        return this.currentCropFragment;
    }

    @dl.e
    public final BaseFragmentDialog getCurrentDialogFragment() {
        return this.currentDialogFragment;
    }

    public final int getCurrentLabelColor() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50589, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        BaseFragmentDialog baseFragmentDialog = this.currentDialogFragment;
        if (!(baseFragmentDialog instanceof LabelFragmentDialog)) {
            return -1;
        }
        kotlin.jvm.internal.f0.n(baseFragmentDialog, "null cannot be cast to non-null type com.starlightc.ucropplus.ui.LabelFragmentDialog");
        return ((LabelFragmentDialog) baseFragmentDialog).getCurrentColor();
    }

    @dl.d
    public final EDIT_MODE getEditMode() {
        return this.editMode;
    }

    public final boolean getOnlyCrop() {
        return this.onlyCrop;
    }

    @dl.d
    public final ArrayList<TextTypefaceInfo> getRemoteTypefaceList() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50586, new Class[0], ArrayList.class);
        if (patchProxyResultProxy.isSupported) {
            return (ArrayList) patchProxyResultProxy.result;
        }
        for (TextTypefaceInfo textTypefaceInfo : remoteTFList) {
            textTypefaceInfo.setOnline(true);
            String name = textTypefaceInfo.getName();
            if (name != null) {
                textTypefaceInfo.setReady(TypefaceUtil.INSTANCE.isRemoteTypefaceCached(name));
            }
        }
        return remoteTFList;
    }

    public final void getStickerList() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50588, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        FlowUtilKt.launchRequest(this, new AnonymousClass1(null));
    }

    public final String getTAG() {
        return this.TAG;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50580, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        BaseFragmentDialog baseFragmentDialog = this.currentDialogFragment;
        if (!(baseFragmentDialog != null && baseFragmentDialog.isVisible())) {
            saveDraftAndFinish();
            return;
        }
        BaseFragmentDialog baseFragmentDialog2 = this.currentDialogFragment;
        if (baseFragmentDialog2 != null && baseFragmentDialog2.canOnBackPressed()) {
            z10 = true;
        }
        if (z10) {
            if (this.editMode == EDIT_MODE.CROP) {
                switchEditMode(EDIT_MODE.IDLE);
                return;
            }
            BaseFragmentDialog baseFragmentDialog3 = this.currentDialogFragment;
            kotlin.jvm.internal.f0.m(baseFragmentDialog3);
            baseFragmentDialog3.dismiss();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 50577, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        bindViews();
        getIntentInfo();
        initViews();
    }

    @Override // com.starlightc.ucropplus.view.StickerView.StickerStatusChangeListener
    public void onItemDelete(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 50614, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        StickerView.StickerStatusChangeListener.DefaultImpls.onItemDelete(this, i10, i11);
    }

    @Override // com.starlightc.ucropplus.view.StickerView.StickerStatusChangeListener
    public void onStatusChanged(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 50578, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported || this.editMode == EDIT_MODE.CROP) {
            return;
        }
        ViewPager2 viewPager2 = this.viewpager;
        if (viewPager2 == null) {
            kotlin.jvm.internal.f0.S("viewpager");
            viewPager2 = null;
        }
        viewPager2.setUserInputEnabled(!z10);
    }

    public final void postScale(float f10) {
        UCropPlusFragment uCropPlusFragment;
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, BuildConfig.VERSION_CODE, new Class[]{Float.TYPE}, Void.TYPE).isSupported || (uCropPlusFragment = this.currentCropFragment) == null) {
            return;
        }
        uCropPlusFragment.postScale(f10);
    }

    public final void refreshCurrentText() {
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50608, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        BaseFragmentDialog baseFragmentDialog = this.currentDialogFragment;
        if (baseFragmentDialog instanceof TextStickerFragmentDialog) {
            if (baseFragmentDialog != null && baseFragmentDialog.isActive()) {
                z10 = true;
            }
            if (z10) {
                BaseFragmentDialog baseFragmentDialog2 = this.currentDialogFragment;
                kotlin.jvm.internal.f0.n(baseFragmentDialog2, "null cannot be cast to non-null type com.starlightc.ucropplus.ui.TextStickerFragmentDialog");
                ((TextStickerFragmentDialog) baseFragmentDialog2).setCurrentStickerText();
            }
        }
    }

    public final void removeFirstLabelStickerItem() {
        UCropPlusFragment uCropPlusFragment;
        StickerView stickerView;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50591, new Class[0], Void.TYPE).isSupported || (uCropPlusFragment = this.currentCropFragment) == null || (stickerView = uCropPlusFragment.getStickerView()) == null) {
            return;
        }
        stickerView.removeFirstLabelStickerItem();
    }

    @Override // com.starlightc.ucropplus.view.StickerView.StickerStatusChangeListener
    public void requestChangeMode(@dl.d EDIT_MODE mode) {
        if (PatchProxy.proxy(new Object[]{mode}, this, changeQuickRedirect, false, 50579, new Class[]{EDIT_MODE.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(mode, "mode");
        if (this.editMode != mode) {
            switchEditMode(mode);
        }
    }

    public final void rotateByAngle(int i10) {
        UCropPlusFragment uCropPlusFragment;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 50601, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || (uCropPlusFragment = this.currentCropFragment) == null) {
            return;
        }
        uCropPlusFragment.rotateByAngle(i10);
    }

    public final void saveImage() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50611, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        kotlinx.coroutines.k.f(this.uiScope, null, null, new C13251(null), 3, null);
    }

    public final void setCircleCrop(boolean z10) {
        this.circleCrop = z10;
    }

    public final void setCropRatioList(@dl.e ArrayList<CropRatioInfo> arrayList) {
        this.cropRatioList = arrayList;
    }

    public final void setCurrentCropFragment(@dl.e UCropPlusFragment uCropPlusFragment) {
        this.currentCropFragment = uCropPlusFragment;
    }

    public final void setCurrentDialogFragment(@dl.e BaseFragmentDialog baseFragmentDialog) {
        this.currentDialogFragment = baseFragmentDialog;
    }

    public final void setCurrentLabelType(@dl.d LabelStickerItem.LabelType type) {
        if (PatchProxy.proxy(new Object[]{type}, this, changeQuickRedirect, false, 50590, new Class[]{LabelStickerItem.LabelType.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(type, "type");
        UCropPlusFragment uCropPlusFragment = this.currentCropFragment;
        StickerView stickerView = uCropPlusFragment != null ? uCropPlusFragment.getStickerView() : null;
        if (stickerView == null) {
            return;
        }
        stickerView.setCurrentLabelType(type);
    }

    public final void setCuttingVisibility(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 50583, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        UCropPlusMainFragment uCropPlusMainFragment = this.ucropPlusMainFragment;
        if (uCropPlusMainFragment == null) {
            kotlin.jvm.internal.f0.S("ucropPlusMainFragment");
            uCropPlusMainFragment = null;
        }
        uCropPlusMainFragment.setVgCuttingVisibility(z10 ? 0 : 8);
    }

    public final void setEditMode(@dl.d EDIT_MODE edit_mode) {
        if (PatchProxy.proxy(new Object[]{edit_mode}, this, changeQuickRedirect, false, 50575, new Class[]{EDIT_MODE.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(edit_mode, "<set-?>");
        this.editMode = edit_mode;
    }

    public final void setNavIconVisible(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 50600, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        MaterialToolbar materialToolbar = this.toolBar;
        if (materialToolbar == null) {
            kotlin.jvm.internal.f0.S("toolBar");
            materialToolbar = null;
        }
        materialToolbar.setNavigationIconTint(z10 ? getResources().getColor(R.color.background_layer_2_color) : getResources().getColor(R.color.transparent));
    }

    public final void setOnlyCrop(boolean z10) {
        this.onlyCrop = z10;
    }

    public final void setResultError(@dl.e Throwable th2) {
        if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 50598, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
            return;
        }
        setResult(96, new Intent().putExtra(UCrop.EXTRA_ERROR, th2));
    }

    public final void setResultUri(@dl.e Uri uri, float f10, int i10, int i11, int i12, int i13) {
        Object[] objArr = {uri, new Float(f10), new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 50597, new Class[]{Uri.class, Float.TYPE, cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        setResult(-1, new Intent().putExtra(UCrop.EXTRA_OUTPUT_URI, uri).putExtra(UCrop.EXTRA_OUTPUT_CROP_ASPECT_RATIO, f10).putExtra(UCrop.EXTRA_OUTPUT_IMAGE_WIDTH, i12).putExtra(UCrop.EXTRA_OUTPUT_IMAGE_HEIGHT, i13).putExtra(UCrop.EXTRA_OUTPUT_OFFSET_X, i10).putExtra(UCrop.EXTRA_OUTPUT_OFFSET_Y, i11));
    }

    public final void setTargetAspectRatio(int i10, int i11, boolean z10) {
        UCropPlusFragment uCropPlusFragment;
        Object[] objArr = {new Integer(i10), new Integer(i11), new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 50603, new Class[]{cls, cls, Boolean.TYPE}, Void.TYPE).isSupported || (uCropPlusFragment = this.currentCropFragment) == null) {
            return;
        }
        uCropPlusFragment.setTargetAspectRatio(i10, i11, z10);
    }

    public final void setViewPagerScroll(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 50609, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ViewPager2 viewPager2 = this.viewpager;
        if (viewPager2 == null) {
            kotlin.jvm.internal.f0.S("viewpager");
            viewPager2 = null;
        }
        viewPager2.setUserInputEnabled(z10);
    }

    public final void showDialog(@dl.d EDIT_MODE mode) {
        CropFragmentDialog cropFragmentDialog;
        StickerView stickerView;
        if (PatchProxy.proxy(new Object[]{mode}, this, changeQuickRedirect, false, 50599, new Class[]{EDIT_MODE.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(mode, "mode");
        int i10 = WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
        BaseFragmentDialog moduleFragmentDialog = null;
        if (i10 == 1) {
            changeNavigationBarColor(R.color.menu_background_color);
            moduleFragmentDialog = new ModuleFragmentDialog();
        } else if (i10 == 2) {
            changeNavigationBarColor(R.color.menu_background_color);
            moduleFragmentDialog = new StickerFragmentDialog();
        } else if (i10 == 3) {
            changeNavigationBarColor(R.color.menu_background_color);
            if (this.circleCrop) {
                ArrayList<CropRatioInfo> arrayList = new ArrayList<>();
                arrayList.add(new CropRatioInfo(1, 1, true, "file:///android_asset/ratio/ucp_ratio_1.png", "头像", true));
                cropFragmentDialog = CropFragmentDialog.Companion.newInstance(arrayList);
            } else if (this.cropRatioList != null) {
                ArrayList<CropRatioInfo> arrayList2 = new ArrayList<>();
                ArrayList<CropRatioInfo> arrayList3 = this.cropRatioList;
                kotlin.jvm.internal.f0.m(arrayList3);
                for (CropRatioInfo cropRatioInfo : arrayList3) {
                    arrayList2.add(new CropRatioInfo(cropRatioInfo.getWidth(), cropRatioInfo.getHeight(), arrayList2.size() <= 0, cropRatioInfo.getWidth() > cropRatioInfo.getHeight() ? "file:///android_asset/ratio/ucp_ratio_4x3.png" : cropRatioInfo.getWidth() < cropRatioInfo.getHeight() ? "file:///android_asset/ratio/ucp_ratio_3x4.png" : "file:///android_asset/ratio/ucp_ratio_1.png", cropRatioInfo.getName(), false, 32, null));
                }
                cropFragmentDialog = CropFragmentDialog.Companion.newInstance(arrayList2);
            } else if (this.onlyCrop) {
                ArrayList<CropRatioInfo> arrayList4 = new ArrayList<>();
                arrayList4.add(new CropRatioInfo(90, 48, true, "file:///android_asset/ratio/ucp_ratio_4x3.png", "横版封面", false, 32, null));
                cropFragmentDialog = CropFragmentDialog.Companion.newInstance(arrayList4);
            } else {
                cropFragmentDialog = new CropFragmentDialog();
            }
            moduleFragmentDialog = cropFragmentDialog;
        } else if (i10 == 4) {
            UCropPlusFragment uCropPlusFragment = this.currentCropFragment;
            if (uCropPlusFragment != null) {
                uCropPlusFragment.refreshCurrentStickerInfo();
            }
            changeNavigationBarColor(R.color.menu_background_color);
            moduleFragmentDialog = new TextStickerFragmentDialog();
        } else if (i10 != 5) {
            BaseFragmentDialog baseFragmentDialog = this.currentDialogFragment;
            if (baseFragmentDialog != null) {
                kotlin.jvm.internal.f0.m(baseFragmentDialog);
                if (baseFragmentDialog.isVisible()) {
                    BaseFragmentDialog baseFragmentDialog2 = this.currentDialogFragment;
                    kotlin.jvm.internal.f0.m(baseFragmentDialog2);
                    baseFragmentDialog2.dismiss();
                }
            }
        } else {
            UCropPlusFragment uCropPlusFragment2 = this.currentCropFragment;
            if (uCropPlusFragment2 != null) {
                uCropPlusFragment2.refreshCurrentStickerInfo();
            }
            UCropPlusFragment uCropPlusFragment3 = this.currentCropFragment;
            StickerView stickerView2 = uCropPlusFragment3 != null ? uCropPlusFragment3.getStickerView() : null;
            if (stickerView2 != null) {
                stickerView2.setCurrentStickerItem(null);
            }
            UCropPlusFragment uCropPlusFragment4 = this.currentCropFragment;
            if (uCropPlusFragment4 != null && (stickerView = uCropPlusFragment4.getStickerView()) != null) {
                stickerView.invalidate();
            }
            changeNavigationBarColor(R.color.menu_background_color);
            moduleFragmentDialog = new LabelFragmentDialog();
        }
        this.currentDialogFragment = moduleFragmentDialog;
        if (moduleFragmentDialog != null) {
            setNavIconVisible(false);
            moduleFragmentDialog.show(getSupportFragmentManager(), "1");
        }
    }

    public final void switchEditMode(@dl.d EDIT_MODE mode) {
        if (PatchProxy.proxy(new Object[]{mode}, this, changeQuickRedirect, false, 50606, new Class[]{EDIT_MODE.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(mode, "mode");
        if (this.editMode == mode) {
            return;
        }
        switchEditModeWithoutShowDialog(mode);
        showDialog(mode);
    }

    public final void switchEditModeWithoutShowDialog(@dl.d EDIT_MODE mode) throws Exception {
        if (PatchProxy.proxy(new Object[]{mode}, this, changeQuickRedirect, false, 50607, new Class[]{EDIT_MODE.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(mode, "mode");
        if (this.editMode == mode) {
            return;
        }
        this.editMode = mode;
        ViewPager2 viewPager2 = this.viewpager;
        if (viewPager2 == null) {
            kotlin.jvm.internal.f0.S("viewpager");
            viewPager2 = null;
        }
        viewPager2.setUserInputEnabled(mode != EDIT_MODE.CROP);
        UCropPlusFragment uCropPlusFragment = this.currentCropFragment;
        if (uCropPlusFragment != null) {
            uCropPlusFragment.switchEditMode(mode);
        }
    }

    public final void updateRemoteTypefaceList() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50587, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        FlowUtilKt.launchRequest(this, new C13281(null));
    }
}
