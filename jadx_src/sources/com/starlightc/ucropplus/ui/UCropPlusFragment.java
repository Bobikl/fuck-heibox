package com.starlightc.ucropplus.ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.Glide;
import com.max.hbcommon.component.CheckButtonView;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbutils.core.BaseApplication;
import com.max.hbutils.utils.ViewUtils;
import com.max.mediaselector.utils.PictureCacheManager;
import com.max.network.utils.DownloadResultBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.R;
import com.starlightc.ucropplus.UCrop;
import com.starlightc.ucropplus.callback.BitmapCropCallback;
import com.starlightc.ucropplus.callback.BitmapLoadCallback;
import com.starlightc.ucropplus.callback.SimpleAction;
import com.starlightc.ucropplus.databinding.UcpItemImageEditorBinding;
import com.starlightc.ucropplus.enums.EDIT_MODE;
import com.starlightc.ucropplus.model.AspectRatio;
import com.starlightc.ucropplus.model.Draft;
import com.starlightc.ucropplus.model.ExifInfo;
import com.starlightc.ucropplus.model.ImageCropState;
import com.starlightc.ucropplus.model.ImageFilterInfo;
import com.starlightc.ucropplus.model.StickerStateInfo;
import com.starlightc.ucropplus.model.TextRenderInfo;
import com.starlightc.ucropplus.model.puzzle.BackgroundObj;
import com.starlightc.ucropplus.model.puzzle.BasePuzzleInfo;
import com.starlightc.ucropplus.model.puzzle.ColorPuzzle;
import com.starlightc.ucropplus.model.puzzle.ContentPicturePuzzle;
import com.starlightc.ucropplus.model.puzzle.HBRectF;
import com.starlightc.ucropplus.model.puzzle.ImageModuleObj;
import com.starlightc.ucropplus.model.puzzle.LabelPuzzle;
import com.starlightc.ucropplus.model.puzzle.PuzzleDataObj;
import com.starlightc.ucropplus.model.puzzle.StaticPicturePuzzle;
import com.starlightc.ucropplus.model.puzzle.TextPuzzle;
import com.starlightc.ucropplus.util.FileUtils;
import com.starlightc.ucropplus.util.ModuleUtil;
import com.starlightc.ucropplus.util.SquareMatrix3;
import com.starlightc.ucropplus.util.TypefaceUtil;
import com.starlightc.ucropplus.view.GestureCropImageView;
import com.starlightc.ucropplus.view.OverlayView;
import com.starlightc.ucropplus.view.StickerView;
import com.starlightc.ucropplus.view.TransformImageView;
import com.starlightc.ucropplus.view.UCropView;
import com.starlightc.ucropplus.view.widget.stickeritem.BaseStickerItem;
import com.starlightc.ucropplus.view.widget.stickeritem.BitmapStickerItem;
import com.starlightc.ucropplus.view.widget.stickeritem.LabelStickerItem;
import com.starlightc.ucropplus.view.widget.stickeritem.TextStickerItem;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.v0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.n2;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;
import org.apache.tools.ant.taskdefs.v7;

/* JADX INFO: compiled from: UCropPlusFragment.kt */
/* JADX INFO: loaded from: classes4.dex */
@t0({"SMAP\nUCropPlusFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UCropPlusFragment.kt\ncom/starlightc/ucropplus/ui/UCropPlusFragment\n+ 2 Matrix.kt\nandroidx/core/graphics/MatrixKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1314:1\n32#2:1315\n1#3:1316\n*S KotlinDebug\n*F\n+ 1 UCropPlusFragment.kt\ncom/starlightc/ucropplus/ui/UCropPlusFragment\n*L\n478#1:1315\n478#1:1316\n*E\n"})
public class UCropPlusFragment extends Fragment {
    public static ChangeQuickRedirect changeQuickRedirect;
    private UcpItemImageEditorBinding binding;
    private View blockingView;

    @dl.e
    private Uri cacheUri;

    @dl.e
    private Draft createDraft;

    @dl.e
    private Draft createDraftReport;
    private UCropView cropView;

    @dl.e
    private Draft draft;
    private File draftDir;

    @dl.e
    private Uri draftUri;
    private boolean firstShowCropDialog;
    private GestureCropImageView gestureCropImageView;
    private boolean hasApplyEdited;

    @dl.e
    private ImageModuleObj imageModule;

    @dl.e
    private Uri inputUri;
    public ArrayList<Uri> inputUris;

    @dl.e
    private LoadingDialog loadingDialog;

    @dl.e
    private Bundle mArguments;

    @androidx.annotation.l
    private int mRootViewBackgroundColor;

    @dl.e
    private Uri outputDir;

    @dl.e
    private Uri outputUri;
    private OverlayView overlayView;

    @dl.e
    private Activity parentActivity;
    private int picturePercent;
    private int remotePicNum;
    private int remoteTFNUm;
    public StickerView stickerView;

    @dl.e
    private TextView tv_percent;

    @dl.e
    private String type;
    private int typefacePercent;

    @dl.d
    public static final Companion Companion = new Companion(null);
    private static final int DEFAULT_COMPRESS_QUALITY = 100;

    @dl.d
    private static final Bitmap.CompressFormat DEFAULT_COMPRESS_FORMAT = Bitmap.CompressFormat.JPEG;
    private static final int RETYR_TIME = 4;

    @dl.d
    private Bitmap.CompressFormat mCompressFormat = DEFAULT_COMPRESS_FORMAT;
    private int mCompressQuality = DEFAULT_COMPRESS_QUALITY;
    private final String TAG = getClass().getSimpleName();

    @dl.d
    private EDIT_MODE editMode = EDIT_MODE.IDLE;
    private int index = -1;
    private boolean needAlphaAnim = true;

    @dl.d
    private HashMap<String, Integer> errorTryMap = new HashMap<>();

    @dl.d
    private ArrayList<StickerStateInfo> stickerInfoBeforeOpenWindow = new ArrayList<>();

    @dl.d
    private final ArrayList<Integer> precentList = new ArrayList<>();

    @dl.d
    private final kotlin.z eventHandler$delegate = kotlin.b0.c(new yh.a<Handler>() { // from class: com.starlightc.ucropplus.ui.UCropPlusFragment$eventHandler$2
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // yh.a
        @dl.d
        public final Handler invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50819, new Class[0], Handler.class);
            return patchProxyResultProxy.isSupported ? (Handler) patchProxyResultProxy.result : new Handler(Looper.getMainLooper());
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [android.os.Handler, java.lang.Object] */
        @Override // yh.a
        public /* bridge */ /* synthetic */ Handler invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50820, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
        }
    });

    @dl.d
    private final q0 uiScope = r0.a(e1.e());

    @dl.d
    private final q0 ioScope = r0.a(e1.c());

    @dl.d
    private final ImageCropState cachedImageState = new ImageCropState(0.0f, 0.0f, 0.0f, null, 15, null);

    /* JADX INFO: compiled from: UCropPlusFragment.kt */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final Bitmap.CompressFormat getDEFAULT_COMPRESS_FORMAT() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50786, new Class[0], Bitmap.CompressFormat.class);
            return patchProxyResultProxy.isSupported ? (Bitmap.CompressFormat) patchProxyResultProxy.result : UCropPlusFragment.DEFAULT_COMPRESS_FORMAT;
        }

        public final int getDEFAULT_COMPRESS_QUALITY() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50785, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : UCropPlusFragment.DEFAULT_COMPRESS_QUALITY;
        }

        public final int getRETYR_TIME() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50787, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : UCropPlusFragment.RETYR_TIME;
        }
    }

    /* JADX INFO: compiled from: UCropPlusFragment.kt */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EDIT_MODE.valuesCustom().length];
            try {
                iArr[EDIT_MODE.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EDIT_MODE.CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EDIT_MODE.STICKER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.starlightc.ucropplus.ui.UCropPlusFragment$checkRatio$2, reason: invalid class name */
    /* JADX INFO: compiled from: UCropPlusFragment.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.starlightc.ucropplus.ui.UCropPlusFragment$checkRatio$2", f = "UCropPlusFragment.kt", i = {}, l = {bb.c.b.C1}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;
        int label;

        AnonymousClass2(kotlin.coroutines.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 50799, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : UCropPlusFragment.this.new AnonymousClass2(cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 50801, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 50800, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50798, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.t0.n(obj);
                this.label = 1;
                if (DelayKt.b(1000L, this) == objH) {
                    return objH;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.t0.n(obj);
            }
            UCropPlusActivity uCropPlusActivityAccess$getUCropPlusActivity = UCropPlusFragment.access$getUCropPlusActivity(UCropPlusFragment.this);
            if (uCropPlusActivityAccess$getUCropPlusActivity != null) {
                uCropPlusActivityAccess$getUCropPlusActivity.switchEditMode(EDIT_MODE.CROP);
            }
            LoadingDialog loadingDialog = UCropPlusFragment.this.loadingDialog;
            if (loadingDialog != null) {
                loadingDialog.c();
            }
            UCropPlusFragment.this.loadingDialog = null;
            return b2.f124493a;
        }
    }

    /* JADX INFO: renamed from: com.starlightc.ucropplus.ui.UCropPlusFragment$clearTempCacheFile$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: UCropPlusFragment.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.starlightc.ucropplus.ui.UCropPlusFragment$clearTempCacheFile$1", f = "UCropPlusFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C13291 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;
        int label;

        C13291(kotlin.coroutines.c<? super C13291> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 50803, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : UCropPlusFragment.this.new C13291(cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 50805, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 50804, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((C13291) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50802, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            kotlin.coroutines.intrinsics.b.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
            File tempCacheFile = UCropPlusFragment.this.getTempCacheFile();
            if (tempCacheFile.exists()) {
                tempCacheFile.delete();
            }
            return b2.f124493a;
        }
    }

    /* JADX INFO: renamed from: com.starlightc.ucropplus.ui.UCropPlusFragment$refreshPercentView$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: UCropPlusFragment.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.starlightc.ucropplus.ui.UCropPlusFragment$refreshPercentView$1", f = "UCropPlusFragment.kt", i = {}, l = {1023}, m = "invokeSuspend", n = {}, s = {})
    public static final class C13341 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ boolean $isCompleted;
        int label;

        /* JADX INFO: renamed from: com.starlightc.ucropplus.ui.UCropPlusFragment$refreshPercentView$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: UCropPlusFragment.kt */
        @kotlin.coroutines.jvm.internal.d(c = "com.starlightc.ucropplus.ui.UCropPlusFragment$refreshPercentView$1$1", f = "UCropPlusFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C09421 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
            public static ChangeQuickRedirect changeQuickRedirect;
            final /* synthetic */ boolean $isCompleted;
            int label;
            final /* synthetic */ UCropPlusFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C09421(UCropPlusFragment uCropPlusFragment, boolean z10, kotlin.coroutines.c<? super C09421> cVar) {
                super(2, cVar);
                this.this$0 = uCropPlusFragment;
                this.$isCompleted = z10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.d
            public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 50837, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
                return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new C09421(this.this$0, this.$isCompleted, cVar);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 50839, new Class[]{Object.class, Object.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
            }

            @dl.e
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 50838, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((C09421) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.e
            public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50836, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                kotlin.coroutines.intrinsics.b.h();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.t0.n(obj);
                TextView textView = this.this$0.tv_percent;
                if (textView != null) {
                    v0 v0Var = v0.f124986a;
                    String string = this.this$0.requireContext().getResources().getString(R.string.loading_percent);
                    kotlin.jvm.internal.f0.o(string, "getString(...)");
                    Object[] objArr = new Object[1];
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.$isCompleted ? 100 : Math.min(99, UCropPlusFragment.access$getTotalPercent(this.this$0)));
                    sb2.append('%');
                    objArr[0] = sb2.toString();
                    String str = String.format(string, Arrays.copyOf(objArr, 1));
                    kotlin.jvm.internal.f0.o(str, "format(...)");
                    textView.setText(str);
                }
                TextView textView2 = this.this$0.tv_percent;
                Log.d("refreshPercentView", String.valueOf(textView2 != null ? textView2.getText() : null));
                return b2.f124493a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13341(boolean z10, kotlin.coroutines.c<? super C13341> cVar) {
            super(2, cVar);
            this.$isCompleted = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 50833, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : UCropPlusFragment.this.new C13341(this.$isCompleted, cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 50835, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 50834, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((C13341) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50832, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.t0.n(obj);
                n2 n2VarE = e1.e();
                C09421 c09421 = new C09421(UCropPlusFragment.this, this.$isCompleted, null);
                this.label = 1;
                if (kotlinx.coroutines.i.h(n2VarE, c09421, this) == objH) {
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

    /* JADX INFO: renamed from: com.starlightc.ucropplus.ui.UCropPlusFragment$resetCropViewLayoutParams$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: UCropPlusFragment.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.starlightc.ucropplus.ui.UCropPlusFragment$resetCropViewLayoutParams$1", f = "UCropPlusFragment.kt", i = {}, l = {bb.c.b.J7}, m = "invokeSuspend", n = {}, s = {})
    public static final class C13351 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ float $imageRatio;
        int label;

        /* JADX INFO: renamed from: com.starlightc.ucropplus.ui.UCropPlusFragment$resetCropViewLayoutParams$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: UCropPlusFragment.kt */
        @kotlin.coroutines.jvm.internal.d(c = "com.starlightc.ucropplus.ui.UCropPlusFragment$resetCropViewLayoutParams$1$1", f = "UCropPlusFragment.kt", i = {0, 0}, l = {bb.c.b.O7, bb.c.b.S7}, m = "invokeSuspend", n = {"measuredWidth", "measuredHeight"}, s = {"L$0", "L$1"})
        public static final class C09431 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
            public static ChangeQuickRedirect changeQuickRedirect;
            final /* synthetic */ float $imageRatio;
            Object L$0;
            Object L$1;
            int label;
            final /* synthetic */ UCropPlusFragment this$0;

            /* JADX INFO: renamed from: com.starlightc.ucropplus.ui.UCropPlusFragment$resetCropViewLayoutParams$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: UCropPlusFragment.kt */
            @kotlin.coroutines.jvm.internal.d(c = "com.starlightc.ucropplus.ui.UCropPlusFragment$resetCropViewLayoutParams$1$1$1", f = "UCropPlusFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class C09441 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ float $imageRatio;
                final /* synthetic */ Ref.IntRef $measuredHeight;
                final /* synthetic */ Ref.IntRef $measuredWidth;
                int label;
                final /* synthetic */ UCropPlusFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C09441(UCropPlusFragment uCropPlusFragment, float f10, Ref.IntRef intRef, Ref.IntRef intRef2, kotlin.coroutines.c<? super C09441> cVar) {
                    super(2, cVar);
                    this.this$0 = uCropPlusFragment;
                    this.$imageRatio = f10;
                    this.$measuredWidth = intRef;
                    this.$measuredHeight = intRef2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.d
                public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 50849, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
                    return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new C09441(this.this$0, this.$imageRatio, this.$measuredWidth, this.$measuredHeight, cVar);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 50851, new Class[]{Object.class, Object.class}, Object.class);
                    return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
                }

                @dl.e
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 50850, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
                    return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((C09441) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.e
                public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50848, new Class[]{Object.class}, Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    kotlin.coroutines.intrinsics.b.h();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.t0.n(obj);
                    UCropView uCropView = this.this$0.cropView;
                    UCropView uCropView2 = null;
                    if (uCropView == null) {
                        kotlin.jvm.internal.f0.S("cropView");
                        uCropView = null;
                    }
                    ViewGroup.LayoutParams layoutParams = uCropView.getLayoutParams();
                    float f10 = this.$imageRatio;
                    int i10 = this.$measuredWidth.f124889b;
                    int i11 = this.$measuredHeight.f124889b;
                    if (f10 <= i10 / i11) {
                        layoutParams.width = ((int) (i11 * f10)) + 1;
                        layoutParams.height = i11;
                    } else {
                        layoutParams.width = i10;
                        layoutParams.height = ((int) (i10 / f10)) + 1;
                    }
                    UCropView uCropView3 = this.this$0.cropView;
                    if (uCropView3 == null) {
                        kotlin.jvm.internal.f0.S("cropView");
                    } else {
                        uCropView2 = uCropView3;
                    }
                    uCropView2.setLayoutParams(layoutParams);
                    return b2.f124493a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C09431(UCropPlusFragment uCropPlusFragment, float f10, kotlin.coroutines.c<? super C09431> cVar) {
                super(2, cVar);
                this.this$0 = uCropPlusFragment;
                this.$imageRatio = f10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.d
            public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 50845, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
                return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new C09431(this.this$0, this.$imageRatio, cVar);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 50847, new Class[]{Object.class, Object.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
            }

            @dl.e
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 50846, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((C09431) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
            }

            /* JADX WARN: Code duplicated, block: B:26:0x00a5  */
            /* JADX WARN: Code duplicated, block: B:33:0x00c0  */
            /* JADX WARN: Code duplicated, block: B:36:0x00d4  */
            /* JADX WARN: Code duplicated, block: B:39:0x00e6  */
            /* JADX WARN: Code duplicated, block: B:43:0x0114 A[RETURN] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00b5 -> B:31:0x00b8). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.e
            public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                Ref.IntRef intRef;
                Ref.IntRef intRef2;
                C09431 c09431;
                n2 n2VarE;
                C09441 c09441;
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50844, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                Object objH = kotlin.coroutines.intrinsics.b.h();
                int i10 = this.label;
                if (i10 == 0) {
                    kotlin.t0.n(obj);
                    Ref.IntRef intRef3 = new Ref.IntRef();
                    UcpItemImageEditorBinding ucpItemImageEditorBinding = this.this$0.binding;
                    if (ucpItemImageEditorBinding == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        ucpItemImageEditorBinding = null;
                    }
                    intRef3.f124889b = ucpItemImageEditorBinding.vgContainer.getMeasuredWidth();
                    Ref.IntRef intRef4 = new Ref.IntRef();
                    UcpItemImageEditorBinding ucpItemImageEditorBinding2 = this.this$0.binding;
                    if (ucpItemImageEditorBinding2 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        ucpItemImageEditorBinding2 = null;
                    }
                    int measuredHeight = ucpItemImageEditorBinding2.vgContainer.getMeasuredHeight();
                    UCropView uCropView = this.this$0.cropView;
                    if (uCropView == null) {
                        kotlin.jvm.internal.f0.S("cropView");
                        uCropView = null;
                    }
                    ViewGroup.LayoutParams layoutParams = uCropView.getLayoutParams();
                    kotlin.jvm.internal.f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    intRef4.f124889b = measuredHeight - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    intRef = intRef3;
                    intRef2 = intRef4;
                    c09431 = this;
                    if (intRef.f124889b <= 0) {
                    }
                    n2VarE = e1.e();
                    c09441 = new C09441(c09431.this$0, c09431.$imageRatio, intRef, intRef2, null);
                    c09431.L$0 = null;
                    c09431.L$1 = null;
                    c09431.label = 2;
                    if (kotlinx.coroutines.i.h(n2VarE, c09441, c09431) == objH) {
                        return objH;
                    }
                } else if (i10 == 1) {
                    Ref.IntRef intRef5 = (Ref.IntRef) this.L$1;
                    Ref.IntRef intRef6 = (Ref.IntRef) this.L$0;
                    kotlin.t0.n(obj);
                    c09431 = this;
                    intRef2 = intRef5;
                    intRef = intRef6;
                    UcpItemImageEditorBinding ucpItemImageEditorBinding3 = c09431.this$0.binding;
                    if (ucpItemImageEditorBinding3 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        ucpItemImageEditorBinding3 = null;
                    }
                    intRef.f124889b = ucpItemImageEditorBinding3.vgContainer.getMeasuredWidth();
                    UcpItemImageEditorBinding ucpItemImageEditorBinding4 = c09431.this$0.binding;
                    if (ucpItemImageEditorBinding4 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        ucpItemImageEditorBinding4 = null;
                    }
                    int measuredHeight2 = ucpItemImageEditorBinding4.vgContainer.getMeasuredHeight();
                    UCropView uCropView2 = c09431.this$0.cropView;
                    if (uCropView2 == null) {
                        kotlin.jvm.internal.f0.S("cropView");
                        uCropView2 = null;
                    }
                    ViewGroup.LayoutParams layoutParams2 = uCropView2.getLayoutParams();
                    kotlin.jvm.internal.f0.n(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    intRef2.f124889b = measuredHeight2 - ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                    if (intRef.f124889b <= 0 || intRef2.f124889b > 0) {
                        n2VarE = e1.e();
                        c09441 = new C09441(c09431.this$0, c09431.$imageRatio, intRef, intRef2, null);
                        c09431.L$0 = null;
                        c09431.L$1 = null;
                        c09431.label = 2;
                        if (kotlinx.coroutines.i.h(n2VarE, c09441, c09431) == objH) {
                            return objH;
                        }
                    } else {
                        c09431.L$0 = intRef;
                        c09431.L$1 = intRef2;
                        c09431.label = 1;
                        if (DelayKt.b(1L, c09431) == objH) {
                            return objH;
                        }
                        UcpItemImageEditorBinding ucpItemImageEditorBinding5 = c09431.this$0.binding;
                        if (ucpItemImageEditorBinding5 == null) {
                            kotlin.jvm.internal.f0.S("binding");
                            ucpItemImageEditorBinding5 = null;
                        }
                        intRef.f124889b = ucpItemImageEditorBinding5.vgContainer.getMeasuredWidth();
                        UcpItemImageEditorBinding ucpItemImageEditorBinding6 = c09431.this$0.binding;
                        if (ucpItemImageEditorBinding6 == null) {
                            kotlin.jvm.internal.f0.S("binding");
                            ucpItemImageEditorBinding6 = null;
                        }
                        int measuredHeight3 = ucpItemImageEditorBinding6.vgContainer.getMeasuredHeight();
                        UCropView uCropView3 = c09431.this$0.cropView;
                        if (uCropView3 == null) {
                            kotlin.jvm.internal.f0.S("cropView");
                            uCropView3 = null;
                        }
                        ViewGroup.LayoutParams layoutParams3 = uCropView3.getLayoutParams();
                        kotlin.jvm.internal.f0.n(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        intRef2.f124889b = measuredHeight3 - ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin;
                        if (intRef.f124889b <= 0) {
                        }
                        n2VarE = e1.e();
                        c09441 = new C09441(c09431.this$0, c09431.$imageRatio, intRef, intRef2, null);
                        c09431.L$0 = null;
                        c09431.L$1 = null;
                        c09431.label = 2;
                        if (kotlinx.coroutines.i.h(n2VarE, c09441, c09431) == objH) {
                            return objH;
                        }
                    }
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.t0.n(obj);
                }
                return b2.f124493a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13351(float f10, kotlin.coroutines.c<? super C13351> cVar) {
            super(2, cVar);
            this.$imageRatio = f10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 50841, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : UCropPlusFragment.this.new C13351(this.$imageRatio, cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 50843, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 50842, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((C13351) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50840, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.t0.n(obj);
                CoroutineDispatcher coroutineDispatcherC = e1.c();
                C09431 c09431 = new C09431(UCropPlusFragment.this, this.$imageRatio, null);
                this.label = 1;
                if (kotlinx.coroutines.i.h(coroutineDispatcherC, c09431, this) == objH) {
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

    /* JADX INFO: renamed from: com.starlightc.ucropplus.ui.UCropPlusFragment$save$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: UCropPlusFragment.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.starlightc.ucropplus.ui.UCropPlusFragment$save$2", f = "UCropPlusFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C13362 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super Boolean>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;
        int label;

        C13362(kotlin.coroutines.c<? super C13362> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 50853, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : UCropPlusFragment.this.new C13362(cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super Boolean> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 50855, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super Boolean> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 50854, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((C13362) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50852, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            kotlin.coroutines.intrinsics.b.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
            return kotlin.coroutines.jvm.internal.a.a(UCropPlusFragment.this.applyImage());
        }
    }

    /* JADX INFO: renamed from: com.starlightc.ucropplus.ui.UCropPlusFragment$saveDraft$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: UCropPlusFragment.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.starlightc.ucropplus.ui.UCropPlusFragment$saveDraft$2", f = "UCropPlusFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C13372 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super Draft>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;
        int label;

        C13372(kotlin.coroutines.c<? super C13372> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 50857, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : UCropPlusFragment.this.new C13372(cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super Draft> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 50859, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super Draft> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 50858, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((C13372) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50856, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            kotlin.coroutines.intrinsics.b.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
            UCropPlusFragment.this.saveCurrentState();
            return UCropPlusFragment.this.getDraft();
        }
    }

    /* JADX INFO: renamed from: com.starlightc.ucropplus.ui.UCropPlusFragment$updateImageData$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: UCropPlusFragment.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.starlightc.ucropplus.ui.UCropPlusFragment$updateImageData$1", f = "UCropPlusFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C13381 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.starlightc.ucropplus.ui.UCropPlusFragment$updateImageData$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: UCropPlusFragment.kt */
        @kotlin.coroutines.jvm.internal.d(c = "com.starlightc.ucropplus.ui.UCropPlusFragment$updateImageData$1$1", f = "UCropPlusFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C09451 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
            public static ChangeQuickRedirect changeQuickRedirect;
            int label;
            final /* synthetic */ UCropPlusFragment this$0;

            /* JADX INFO: renamed from: com.starlightc.ucropplus.ui.UCropPlusFragment$updateImageData$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: UCropPlusFragment.kt */
            public static final class C09461 implements BitmapLoadCallback {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ UCropPlusFragment this$0;

                C09461(UCropPlusFragment uCropPlusFragment) {
                    this.this$0 = uCropPlusFragment;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void onBitmapLoaded$lambda$0(UCropPlusFragment this$0) throws Exception {
                    if (PatchProxy.proxy(new Object[]{this$0}, null, changeQuickRedirect, true, 50871, new Class[]{UCropPlusFragment.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    kotlin.jvm.internal.f0.p(this$0, "this$0");
                    Context context = this$0.getContext();
                    kotlin.jvm.internal.f0.m(context);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(v7.f135919a);
                    Draft draft = this$0.draft;
                    kotlin.jvm.internal.f0.m(draft);
                    sb2.append(draft.getDraftPath());
                    Uri uri = Uri.parse(sb2.toString());
                    Uri uri2 = this$0.cacheUri;
                    kotlin.jvm.internal.f0.m(uri2);
                    FileUtils.copyFile(context, uri, uri2);
                    EDIT_MODE edit_mode = EDIT_MODE.IDLE;
                    this$0.switchEditMode(edit_mode);
                    Draft draft2 = this$0.draft;
                    kotlin.jvm.internal.f0.m(draft2);
                    UCropPlusFragment.access$setTickerInfo(this$0, draft2.getStickers());
                    Draft draft3 = this$0.draft;
                    kotlin.jvm.internal.f0.m(draft3);
                    UCropPlusFragment.access$saveCurrentState(this$0, draft3.getInfo());
                    this$0.getStickerView().postInvalidate();
                    GestureCropImageView gestureCropImageView = this$0.gestureCropImageView;
                    GestureCropImageView gestureCropImageView2 = null;
                    if (gestureCropImageView == null) {
                        kotlin.jvm.internal.f0.S("gestureCropImageView");
                        gestureCropImageView = null;
                    }
                    Draft draft4 = this$0.draft;
                    kotlin.jvm.internal.f0.m(draft4);
                    gestureCropImageView.setFilter(draft4.getFilter());
                    GestureCropImageView gestureCropImageView3 = this$0.gestureCropImageView;
                    if (gestureCropImageView3 == null) {
                        kotlin.jvm.internal.f0.S("gestureCropImageView");
                        gestureCropImageView3 = null;
                    }
                    gestureCropImageView3.reset();
                    GestureCropImageView gestureCropImageView4 = this$0.gestureCropImageView;
                    if (gestureCropImageView4 == null) {
                        kotlin.jvm.internal.f0.S("gestureCropImageView");
                        gestureCropImageView4 = null;
                    }
                    Uri uri3 = this$0.cacheUri;
                    kotlin.jvm.internal.f0.m(uri3);
                    gestureCropImageView4.setImageUri(uri3, this$0.cacheUri);
                    GestureCropImageView gestureCropImageView5 = this$0.gestureCropImageView;
                    if (gestureCropImageView5 == null) {
                        kotlin.jvm.internal.f0.S("gestureCropImageView");
                    } else {
                        gestureCropImageView2 = gestureCropImageView5;
                    }
                    gestureCropImageView2.setImageToWrapCropBounds(false);
                    this$0.switchEditMode(edit_mode);
                    this$0.createDraft = this$0.getDraft();
                }

                @Override // com.starlightc.ucropplus.callback.BitmapLoadCallback
                public void onBitmapLoaded(@dl.d Bitmap bitmap, @dl.d ExifInfo exifInfo, @dl.d Uri imageInputUri, @dl.e Uri uri) {
                    if (PatchProxy.proxy(new Object[]{bitmap, exifInfo, imageInputUri, uri}, this, changeQuickRedirect, false, 50869, new Class[]{Bitmap.class, ExifInfo.class, Uri.class, Uri.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    kotlin.jvm.internal.f0.p(bitmap, "bitmap");
                    kotlin.jvm.internal.f0.p(exifInfo, "exifInfo");
                    kotlin.jvm.internal.f0.p(imageInputUri, "imageInputUri");
                    GestureCropImageView gestureCropImageView = this.this$0.gestureCropImageView;
                    if (gestureCropImageView == null) {
                        kotlin.jvm.internal.f0.S("gestureCropImageView");
                        gestureCropImageView = null;
                    }
                    gestureCropImageView.isRatioChecked = true;
                    Handler handlerAccess$getEventHandler = UCropPlusFragment.access$getEventHandler(this.this$0);
                    final UCropPlusFragment uCropPlusFragment = this.this$0;
                    handlerAccess$getEventHandler.postDelayed(new Runnable() { // from class: com.starlightc.ucropplus.ui.j0
                        @Override // java.lang.Runnable
                        public final void run() throws Exception {
                            UCropPlusFragment.C13381.C09451.C09461.onBitmapLoaded$lambda$0(uCropPlusFragment);
                        }
                    }, 0L);
                }

                @Override // com.starlightc.ucropplus.callback.BitmapLoadCallback
                public void onFailure(@dl.d Exception bitmapWorkerException) {
                    if (PatchProxy.proxy(new Object[]{bitmapWorkerException}, this, changeQuickRedirect, false, 50870, new Class[]{Exception.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    kotlin.jvm.internal.f0.p(bitmapWorkerException, "bitmapWorkerException");
                    UCropPlusFragment uCropPlusFragment = this.this$0;
                    uCropPlusFragment.createDraft = uCropPlusFragment.getDraft();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C09451(UCropPlusFragment uCropPlusFragment, kotlin.coroutines.c<? super C09451> cVar) {
                super(2, cVar);
                this.this$0 = uCropPlusFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.d
            public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 50866, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
                return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new C09451(this.this$0, cVar);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 50868, new Class[]{Object.class, Object.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
            }

            @dl.e
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 50867, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((C09451) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.e
            public final Object invokeSuspend(@dl.d Object obj) throws Exception {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50865, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                kotlin.coroutines.intrinsics.b.h();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.t0.n(obj);
                GestureCropImageView gestureCropImageView = this.this$0.gestureCropImageView;
                if (gestureCropImageView == null) {
                    kotlin.jvm.internal.f0.S("gestureCropImageView");
                    gestureCropImageView = null;
                }
                Uri uri = this.this$0.inputUri;
                kotlin.jvm.internal.f0.m(uri);
                Uri uri2 = this.this$0.cacheUri;
                kotlin.jvm.internal.f0.m(uri2);
                gestureCropImageView.setImageUriWithCallBack(uri, uri2, new C09461(this.this$0));
                return b2.f124493a;
            }
        }

        C13381(kotlin.coroutines.c<? super C13381> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 50862, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            if (patchProxyResultProxy.isSupported) {
                return (kotlin.coroutines.c) patchProxyResultProxy.result;
            }
            C13381 c13381 = UCropPlusFragment.this.new C13381(cVar);
            c13381.L$0 = obj;
            return c13381;
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 50864, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 50863, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((C13381) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50861, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            kotlin.coroutines.intrinsics.b.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
            kotlinx.coroutines.k.b((q0) this.L$0, null, null, new C09451(UCropPlusFragment.this, null), 3, null);
            return b2.f124493a;
        }
    }

    public static final /* synthetic */ void access$checkRatio(UCropPlusFragment uCropPlusFragment, Float f10) {
        if (PatchProxy.proxy(new Object[]{uCropPlusFragment, f10}, null, changeQuickRedirect, true, 50775, new Class[]{UCropPlusFragment.class, Float.class}, Void.TYPE).isSupported) {
            return;
        }
        uCropPlusFragment.checkRatio(f10);
    }

    public static final /* synthetic */ void access$downloadImage(UCropPlusFragment uCropPlusFragment, String str, int i10) {
        if (PatchProxy.proxy(new Object[]{uCropPlusFragment, str, new Integer(i10)}, null, changeQuickRedirect, true, 50782, new Class[]{UCropPlusFragment.class, String.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        uCropPlusFragment.downloadImage(str, i10);
    }

    public static final /* synthetic */ void access$downloadTypeface(UCropPlusFragment uCropPlusFragment, String str, String str2, int i10) {
        if (PatchProxy.proxy(new Object[]{uCropPlusFragment, str, str2, new Integer(i10)}, null, changeQuickRedirect, true, 50783, new Class[]{UCropPlusFragment.class, String.class, String.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        uCropPlusFragment.downloadTypeface(str, str2, i10);
    }

    public static final /* synthetic */ Handler access$getEventHandler(UCropPlusFragment uCropPlusFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{uCropPlusFragment}, null, changeQuickRedirect, true, 50776, new Class[]{UCropPlusFragment.class}, Handler.class);
        return patchProxyResultProxy.isSupported ? (Handler) patchProxyResultProxy.result : uCropPlusFragment.getEventHandler();
    }

    public static final /* synthetic */ int access$getTotalPercent(UCropPlusFragment uCropPlusFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{uCropPlusFragment}, null, changeQuickRedirect, true, 50779, new Class[]{UCropPlusFragment.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : uCropPlusFragment.getTotalPercent();
    }

    public static final /* synthetic */ UCropPlusActivity access$getUCropPlusActivity(UCropPlusFragment uCropPlusFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{uCropPlusFragment}, null, changeQuickRedirect, true, 50773, new Class[]{UCropPlusFragment.class}, UCropPlusActivity.class);
        return patchProxyResultProxy.isSupported ? (UCropPlusActivity) patchProxyResultProxy.result : uCropPlusFragment.getUCropPlusActivity();
    }

    public static final /* synthetic */ void access$refreshPercentView(UCropPlusFragment uCropPlusFragment, boolean z10) {
        if (PatchProxy.proxy(new Object[]{uCropPlusFragment, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 50780, new Class[]{UCropPlusFragment.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        uCropPlusFragment.refreshPercentView(z10);
    }

    public static final /* synthetic */ void access$saveCurrentState(UCropPlusFragment uCropPlusFragment, ImageCropState imageCropState) {
        if (PatchProxy.proxy(new Object[]{uCropPlusFragment, imageCropState}, null, changeQuickRedirect, true, 50778, new Class[]{UCropPlusFragment.class, ImageCropState.class}, Void.TYPE).isSupported) {
            return;
        }
        uCropPlusFragment.saveCurrentState(imageCropState);
    }

    public static final /* synthetic */ void access$setTickerInfo(UCropPlusFragment uCropPlusFragment, ArrayList arrayList) throws InterruptedException {
        if (PatchProxy.proxy(new Object[]{uCropPlusFragment, arrayList}, null, changeQuickRedirect, true, 50777, new Class[]{UCropPlusFragment.class, ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        uCropPlusFragment.setTickerInfo(arrayList);
    }

    public static final /* synthetic */ void access$showCropViewAnimator(UCropPlusFragment uCropPlusFragment, long j10) {
        if (PatchProxy.proxy(new Object[]{uCropPlusFragment, new Long(j10)}, null, changeQuickRedirect, true, 50774, new Class[]{UCropPlusFragment.class, Long.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        uCropPlusFragment.showCropViewAnimator(j10);
    }

    public static final /* synthetic */ void access$showLoadingDataFailed(UCropPlusFragment uCropPlusFragment) {
        if (PatchProxy.proxy(new Object[]{uCropPlusFragment}, null, changeQuickRedirect, true, 50784, new Class[]{UCropPlusFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        uCropPlusFragment.showLoadingDataFailed();
    }

    public static final /* synthetic */ void access$showLoadingDataSuccess(UCropPlusFragment uCropPlusFragment) {
        if (PatchProxy.proxy(new Object[]{uCropPlusFragment}, null, changeQuickRedirect, true, 50781, new Class[]{UCropPlusFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        uCropPlusFragment.showLoadingDataSuccess();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addModuleData$lambda$10(final UCropPlusFragment this$0) {
        if (PatchProxy.proxy(new Object[]{this$0}, null, changeQuickRedirect, true, 50772, new Class[]{UCropPlusFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        ImageModuleObj imageModuleObj = this$0.imageModule;
        kotlin.jvm.internal.f0.m(imageModuleObj);
        PuzzleDataObj puzzle_data = imageModuleObj.getPuzzle_data();
        if (!(puzzle_data != null && puzzle_data.needLoading())) {
            this$0.showLoadingDataSuccess();
            return;
        }
        if (ModuleUtil.INSTANCE.isWifiNetwork(this$0.getContext()) || kotlin.jvm.internal.f0.g("1", com.max.hbcache.c.o(com.max.hbcache.c.f66117d0, "0"))) {
            this$0.loadModuleResource();
            return;
        }
        final CheckButtonView checkButtonView = new CheckButtonView(this$0.getContext());
        checkButtonView.setText("不再提示");
        checkButtonView.setChecked(true);
        checkButtonView.setLayoutParams(new ViewGroup.LayoutParams(-1, ViewUtils.f(this$0.getContext(), 46.0f)));
        new com.max.hbcommon.view.a.f(this$0.getContext()).x(R.string.prompt).l("您正在使用移动网络，加载模板会消耗流量").u("继续使用", new DialogInterface.OnClickListener() { // from class: com.starlightc.ucropplus.ui.h0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                UCropPlusFragment.addModuleData$lambda$10$lambda$8(checkButtonView, this$0, dialogInterface, i10);
            }
        }).n(R.string.do_return, new DialogInterface.OnClickListener() { // from class: com.starlightc.ucropplus.ui.i0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                UCropPlusFragment.addModuleData$lambda$10$lambda$9(this.f98093b, dialogInterface, i10);
            }
        }).i(checkButtonView).g(false).F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addModuleData$lambda$10$lambda$8(CheckButtonView checkBox, UCropPlusFragment this$0, DialogInterface dialogInterface, int i10) {
        if (PatchProxy.proxy(new Object[]{checkBox, this$0, dialogInterface, new Integer(i10)}, null, changeQuickRedirect, true, 50770, new Class[]{CheckButtonView.class, UCropPlusFragment.class, DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(checkBox, "$checkBox");
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        if (checkBox.d()) {
            com.max.hbcache.c.C(com.max.hbcache.c.f66117d0, "1");
        }
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        this$0.loadModuleResource();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addModuleData$lambda$10$lambda$9(UCropPlusFragment this$0, DialogInterface dialogInterface, int i10) {
        if (PatchProxy.proxy(new Object[]{this$0, dialogInterface, new Integer(i10)}, null, changeQuickRedirect, true, 50771, new Class[]{UCropPlusFragment.class, DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        UCropPlusActivity uCropPlusActivity = this$0.getUCropPlusActivity();
        if (uCropPlusActivity != null) {
            uCropPlusActivity.finish();
        }
    }

    public static /* synthetic */ void addStickerBitImage$default(UCropPlusFragment uCropPlusFragment, Bitmap bitmap, String str, BasePuzzleInfo basePuzzleInfo, boolean z10, int i10, int i11, Object obj) {
        Object[] objArr = {uCropPlusFragment, bitmap, str, basePuzzleInfo, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), new Integer(i11), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 50738, new Class[]{UCropPlusFragment.class, Bitmap.class, String.class, BasePuzzleInfo.class, Boolean.TYPE, cls, cls, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addStickerBitImage");
        }
        uCropPlusFragment.addStickerBitImage(bitmap, str, (i11 & 4) != 0 ? null : basePuzzleInfo, (i11 & 8) != 0 ? true : z10 ? 1 : 0, (i11 & 16) != 0 ? -1 : i10);
    }

    public static /* synthetic */ void applyCrop$default(UCropPlusFragment uCropPlusFragment, boolean z10, int i10, Object obj) throws IOException {
        if (PatchProxy.proxy(new Object[]{uCropPlusFragment, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 50733, new Class[]{UCropPlusFragment.class, Boolean.TYPE, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyCrop");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        uCropPlusFragment.applyCrop(z10);
    }

    private final void bindViews() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50702, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        UcpItemImageEditorBinding ucpItemImageEditorBinding = this.binding;
        UCropView uCropView = null;
        if (ucpItemImageEditorBinding == null) {
            kotlin.jvm.internal.f0.S("binding");
            ucpItemImageEditorBinding = null;
        }
        UCropView cropView = ucpItemImageEditorBinding.cropView;
        kotlin.jvm.internal.f0.o(cropView, "cropView");
        this.cropView = cropView;
        if (cropView == null) {
            kotlin.jvm.internal.f0.S("cropView");
            cropView = null;
        }
        GestureCropImageView cropImageView = cropView.getCropImageView();
        kotlin.jvm.internal.f0.o(cropImageView, "getCropImageView(...)");
        this.gestureCropImageView = cropImageView;
        UCropView uCropView2 = this.cropView;
        if (uCropView2 == null) {
            kotlin.jvm.internal.f0.S("cropView");
            uCropView2 = null;
        }
        OverlayView overlayView = uCropView2.getOverlayView();
        kotlin.jvm.internal.f0.o(overlayView, "getOverlayView(...)");
        this.overlayView = overlayView;
        UCropView uCropView3 = this.cropView;
        if (uCropView3 == null) {
            kotlin.jvm.internal.f0.S("cropView");
            uCropView3 = null;
        }
        StickerView stickerView = uCropView3.getStickerView();
        kotlin.jvm.internal.f0.o(stickerView, "getStickerView(...)");
        setStickerView(stickerView);
        UCropView uCropView4 = this.cropView;
        if (uCropView4 == null) {
            kotlin.jvm.internal.f0.S("cropView");
        } else {
            uCropView = uCropView4;
        }
        View blockView = uCropView.getBlockView();
        kotlin.jvm.internal.f0.o(blockView, "getBlockView(...)");
        this.blockingView = blockView;
    }

    private final void checkRatio(Float f10) {
        if (PatchProxy.proxy(new Object[]{f10}, this, changeQuickRedirect, false, 50703, new Class[]{Float.class}, Void.TYPE).isSupported) {
            return;
        }
        if (f10 != null) {
            f10.floatValue();
            GestureCropImageView gestureCropImageView = this.gestureCropImageView;
            if (gestureCropImageView == null) {
                kotlin.jvm.internal.f0.S("gestureCropImageView");
                gestureCropImageView = null;
            }
            gestureCropImageView.setImageToWrapCropBounds(false);
            GestureCropImageView gestureCropImageView2 = this.gestureCropImageView;
            if (gestureCropImageView2 == null) {
                kotlin.jvm.internal.f0.S("gestureCropImageView");
                gestureCropImageView2 = null;
            }
            gestureCropImageView2.post(new Runnable() { // from class: com.starlightc.ucropplus.ui.f0
                @Override // java.lang.Runnable
                public final void run() throws IOException {
                    UCropPlusFragment.checkRatio$lambda$1$lambda$0(this.f98086b);
                }
            });
        }
        UCropPlusActivity uCropPlusActivity = getUCropPlusActivity();
        if (!(uCropPlusActivity != null && uCropPlusActivity.getOnlyCrop()) || this.firstShowCropDialog) {
            return;
        }
        kotlinx.coroutines.k.f(this.uiScope, null, null, new AnonymousClass2(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkRatio$lambda$1$lambda$0(UCropPlusFragment this$0) throws IOException {
        if (PatchProxy.proxy(new Object[]{this$0}, null, changeQuickRedirect, true, 50768, new Class[]{UCropPlusFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        applyCrop$default(this$0, false, 1, null);
    }

    public static /* synthetic */ void createTextSticker$default(UCropPlusFragment uCropPlusFragment, TextPuzzle textPuzzle, boolean z10, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{uCropPlusFragment, textPuzzle, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 50743, new Class[]{UCropPlusFragment.class, TextPuzzle.class, Boolean.TYPE, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createTextSticker");
        }
        if ((i10 & 1) != 0) {
            textPuzzle = null;
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        uCropPlusFragment.createTextSticker(textPuzzle, z10);
    }

    private final void downloadImage(String str, int i10) {
        if (PatchProxy.proxy(new Object[]{str, new Integer(i10)}, this, changeQuickRedirect, false, 50751, new Class[]{String.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (this.errorTryMap.get(str) != null) {
            Integer num = this.errorTryMap.get(str);
            kotlin.jvm.internal.f0.m(num);
            if (num.intValue() >= RETYR_TIME) {
                showLoadingDataFailed();
                return;
            }
        }
        Glide.F(com.max.hbimage.image.l.a()).u().load(str).z1(new com.max.hbimage.image.o(str, this, Math.abs(i10)) { // from class: com.starlightc.ucropplus.ui.UCropPlusFragment.downloadImage.1
            public static ChangeQuickRedirect changeQuickRedirect;
            final /* synthetic */ int $index;
            final /* synthetic */ String $url;
            final /* synthetic */ UCropPlusFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(str);
                this.$url = str;
                this.this$0 = this;
                this.$index = i;
            }

            @Override // com.max.hbimage.image.o, com.bumptech.glide.request.target.p
            public void onLoadFailed(@dl.e Drawable drawable) {
                if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, 50807, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
                    return;
                }
                super.onLoadFailed(drawable);
                if (this.this$0.errorTryMap.get(this.$url) == null) {
                    this.this$0.errorTryMap.put(this.$url, 1);
                } else {
                    HashMap map = this.this$0.errorTryMap;
                    String str2 = this.$url;
                    Object obj = this.this$0.errorTryMap.get(this.$url);
                    kotlin.jvm.internal.f0.m(obj);
                    map.put(str2, Integer.valueOf(((Number) obj).intValue() + 1));
                }
                UCropPlusFragment.access$downloadImage(this.this$0, this.$url, this.$index);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.max.hbimage.image.o
            public void onResourceReady(@dl.d File resource, @dl.e com.bumptech.glide.request.transition.f<? super File> fVar) {
                if (PatchProxy.proxy(new Object[]{resource, fVar}, this, changeQuickRedirect, false, 50806, new Class[]{File.class, com.bumptech.glide.request.transition.f.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(resource, "resource");
                super.onResourceReady(resource, fVar);
                this.this$0.remotePicNum--;
                int i11 = this.$index;
                if (i11 >= 0 && i11 < this.this$0.precentList.size()) {
                    this.this$0.precentList.set(this.$index, Integer.valueOf(this.this$0.picturePercent));
                    UCropPlusFragment.access$refreshPercentView(this.this$0, false);
                }
                UCropPlusFragment.access$showLoadingDataSuccess(this.this$0);
            }

            @Override // com.max.hbimage.image.o, com.bumptech.glide.request.target.p
            public /* bridge */ /* synthetic */ void onResourceReady(File file, com.bumptech.glide.request.transition.f<? super File> fVar) {
                if (PatchProxy.proxy(new Object[]{file, fVar}, this, changeQuickRedirect, false, 50808, new Class[]{Object.class, com.bumptech.glide.request.transition.f.class}, Void.TYPE).isSupported) {
                    return;
                }
                onResourceReady(file, fVar);
            }
        });
    }

    private final void downloadTypeface(final String str, final String str2, int i10) {
        if (PatchProxy.proxy(new Object[]{str, str2, new Integer(i10)}, this, changeQuickRedirect, false, 50752, new Class[]{String.class, String.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (this.errorTryMap.get(str) != null) {
            Integer num = this.errorTryMap.get(str);
            kotlin.jvm.internal.f0.m(num);
            if (num.intValue() >= RETYR_TIME) {
                showLoadingDataFailed();
                return;
            }
        }
        final int iAbs = Math.abs(i10);
        UCropPlusActivity uCropPlusActivity = getUCropPlusActivity();
        if (uCropPlusActivity != null) {
            uCropPlusActivity.downloadTypeface(str, str2, new yh.l<DownloadResultBuilder<String>, b2>() { // from class: com.starlightc.ucropplus.ui.UCropPlusFragment.downloadTypeface.1
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(DownloadResultBuilder<String> downloadResultBuilder) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{downloadResultBuilder}, this, changeQuickRedirect, false, 50810, new Class[]{Object.class}, Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    invoke2(downloadResultBuilder);
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@dl.d DownloadResultBuilder<String> downloadTypeface) {
                    if (PatchProxy.proxy(new Object[]{downloadTypeface}, this, changeQuickRedirect, false, 50809, new Class[]{DownloadResultBuilder.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    kotlin.jvm.internal.f0.p(downloadTypeface, "$this$downloadTypeface");
                    final UCropPlusFragment uCropPlusFragment = UCropPlusFragment.this;
                    final String str3 = str;
                    downloadTypeface.setOnSuccess(new yh.l<String, b2>() { // from class: com.starlightc.ucropplus.ui.UCropPlusFragment.downloadTypeface.1.1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(String str4) {
                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str4}, this, changeQuickRedirect, false, 50812, new Class[]{Object.class}, Object.class);
                            if (patchProxyResultProxy.isSupported) {
                                return patchProxyResultProxy.result;
                            }
                            invoke2(str4);
                            return b2.f124493a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@dl.e String str4) {
                            if (PatchProxy.proxy(new Object[]{str4}, this, changeQuickRedirect, false, 50811, new Class[]{String.class}, Void.TYPE).isSupported || str4 == null) {
                                return;
                            }
                            UCropPlusFragment uCropPlusFragment2 = uCropPlusFragment;
                            String str5 = str3;
                            uCropPlusFragment2.remoteTFNUm--;
                            TypefaceUtil.INSTANCE.addCachedTypeface(str5, str4);
                            UCropPlusFragment.access$showLoadingDataSuccess(uCropPlusFragment2);
                        }
                    });
                    final UCropPlusFragment uCropPlusFragment2 = UCropPlusFragment.this;
                    final String str4 = str;
                    final String str5 = str2;
                    final int i11 = iAbs;
                    downloadTypeface.setOnError(new yh.l<Throwable, b2>() { // from class: com.starlightc.ucropplus.ui.UCropPlusFragment.downloadTypeface.1.2
                        public static ChangeQuickRedirect changeQuickRedirect;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(Throwable th2) {
                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 50814, new Class[]{Object.class}, Object.class);
                            if (patchProxyResultProxy.isSupported) {
                                return patchProxyResultProxy.result;
                            }
                            invoke2(th2);
                            return b2.f124493a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@dl.d Throwable it) {
                            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 50813, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                                return;
                            }
                            kotlin.jvm.internal.f0.p(it, "it");
                            if (uCropPlusFragment2.errorTryMap.get(str4) == null) {
                                uCropPlusFragment2.errorTryMap.put(str4, 1);
                            } else {
                                HashMap map = uCropPlusFragment2.errorTryMap;
                                String str6 = str4;
                                Object obj = uCropPlusFragment2.errorTryMap.get(str4);
                                kotlin.jvm.internal.f0.m(obj);
                                map.put(str6, Integer.valueOf(((Number) obj).intValue() + 1));
                            }
                            UCropPlusFragment.access$downloadTypeface(uCropPlusFragment2, str4, str5, i11);
                        }
                    });
                    final int i12 = iAbs;
                    final UCropPlusFragment uCropPlusFragment3 = UCropPlusFragment.this;
                    downloadTypeface.setOnLoading(new yh.p<Long, Long, b2>() { // from class: com.starlightc.ucropplus.ui.UCropPlusFragment.downloadTypeface.1.3
                        public static ChangeQuickRedirect changeQuickRedirect;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, kotlin.b2] */
                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(Long l10, Long l11) {
                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{l10, l11}, this, changeQuickRedirect, false, 50816, new Class[]{Object.class, Object.class}, Object.class);
                            if (patchProxyResultProxy.isSupported) {
                                return patchProxyResultProxy.result;
                            }
                            invoke(l10.longValue(), l11.longValue());
                            return b2.f124493a;
                        }

                        public final void invoke(long j10, long j11) {
                            Object[] objArr = {new Long(j10), new Long(j11)};
                            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                            Class cls = Long.TYPE;
                            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 50815, new Class[]{cls, cls}, Void.TYPE).isSupported) {
                                return;
                            }
                            int i13 = i12;
                            if (i13 >= 0 && i13 < uCropPlusFragment3.precentList.size()) {
                                uCropPlusFragment3.precentList.set(i12, Integer.valueOf((int) (((((long) uCropPlusFragment3.typefacePercent) * j10) / j11) + 0.5f)));
                            }
                            UCropPlusFragment.access$refreshPercentView(uCropPlusFragment3, false);
                        }
                    });
                    final UCropPlusFragment uCropPlusFragment4 = UCropPlusFragment.this;
                    downloadTypeface.setOnDataEmpty(new yh.a<b2>() { // from class: com.starlightc.ucropplus.ui.UCropPlusFragment.downloadTypeface.1.4
                        public static ChangeQuickRedirect changeQuickRedirect;

                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                        @Override // yh.a
                        public /* bridge */ /* synthetic */ b2 invoke() {
                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50818, new Class[0], Object.class);
                            if (patchProxyResultProxy.isSupported) {
                                return patchProxyResultProxy.result;
                            }
                            invoke2();
                            return b2.f124493a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50817, new Class[0], Void.TYPE).isSupported) {
                                return;
                            }
                            UCropPlusFragment.access$showLoadingDataFailed(uCropPlusFragment4);
                        }
                    });
                }
            });
        }
    }

    private final Uri generateOutputUri() throws IOException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50729, new Class[0], Uri.class);
        if (patchProxyResultProxy.isSupported) {
            return (Uri) patchProxyResultProxy.result;
        }
        String strValueOf = String.valueOf(System.currentTimeMillis());
        Uri uri = this.outputDir;
        GestureCropImageView gestureCropImageView = null;
        if (uri != null) {
            kotlin.jvm.internal.f0.m(uri);
            if (uri.getPath() != null) {
                Uri uri2 = this.outputDir;
                kotlin.jvm.internal.f0.m(uri2);
                String path = uri2.getPath();
                kotlin.jvm.internal.f0.m(path);
                if (path.length() > 0) {
                    Uri uri3 = this.outputDir;
                    kotlin.jvm.internal.f0.m(uri3);
                    String path2 = uri3.getPath();
                    kotlin.jvm.internal.f0.m(path2);
                    File file = new File(path2);
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    Uri uri4 = this.inputUri;
                    File file2 = new File(file.getPath() + File.separator + this.index + '_' + strValueOf + getImageSuffix(uri4 != null ? uri4.getPath() : null));
                    if (file2.exists()) {
                        file2.delete();
                    }
                    file2.createNewFile();
                    return Uri.fromFile(file2);
                }
            }
        }
        GestureCropImageView gestureCropImageView2 = this.gestureCropImageView;
        if (gestureCropImageView2 == null) {
            kotlin.jvm.internal.f0.S("gestureCropImageView");
        } else {
            gestureCropImageView = gestureCropImageView2;
        }
        return gestureCropImageView.getImageOutputUri();
    }

    private final void getArgumentInfo() throws Throwable {
        ArrayList<Draft> arrayList;
        UCropPlusActivity uCropPlusActivity;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50705, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Bundle arguments = getArguments();
        this.mArguments = arguments;
        if (arguments == null || getContext() == null) {
            return;
        }
        this.type = arguments.getString("type", "0");
        this.index = arguments.getInt(UCropPlusActivity.ARG_INDEX);
        this.outputDir = (Uri) arguments.getParcelable(UCropPlusActivity.ARG_OUTPUT_DIR);
        this.imageModule = (ImageModuleObj) arguments.getSerializable("module");
        ArrayList<Uri> parcelableArrayList = arguments.getParcelableArrayList(UCrop.EXTRA_MULTI_INPUT_URI);
        kotlin.jvm.internal.f0.n(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<android.net.Uri>{ kotlin.collections.TypeAliasesKt.ArrayList<android.net.Uri> }");
        setInputUris(parcelableArrayList);
        Uri uri = this.inputUri;
        Bitmap.CompressFormat compressFormatValueOf = null;
        String imageSuffix = getImageSuffix(uri != null ? uri.getPath() : null);
        Serializable serializable = arguments.getSerializable(UCrop.EXTRA_DRAFT_INFO);
        if (serializable != null) {
            kotlin.jvm.internal.f0.n(serializable, "null cannot be cast to non-null type java.util.ArrayList<com.starlightc.ucropplus.model.Draft>{ kotlin.collections.TypeAliasesKt.ArrayList<com.starlightc.ucropplus.model.Draft> }");
            arrayList = (ArrayList) serializable;
        } else {
            arrayList = null;
        }
        if (arrayList != null && (!arrayList.isEmpty())) {
            for (Draft draft : arrayList) {
                String src = draft.getSrc();
                if (!(src == null || src.length() == 0) && kotlin.jvm.internal.f0.g(draft.getSrc(), getInputUris().get(this.index).getPath())) {
                    this.draft = draft;
                    break;
                }
            }
        }
        if (this.index < getInputUris().size() && this.index != -1) {
            if (!kotlin.jvm.internal.f0.g(this.type, "1") || this.imageModule == null) {
                Draft draft2 = this.draft;
                if ((draft2 != null ? draft2.getImageModule() : null) != null) {
                    this.type = "1";
                    Draft draft3 = this.draft;
                    ImageModuleObj imageModule = draft3 != null ? draft3.getImageModule() : null;
                    this.imageModule = imageModule;
                    kotlin.jvm.internal.f0.m(imageModule);
                    PuzzleDataObj puzzle_data = imageModule.getPuzzle_data();
                    setModuleCropViewAndInputUri((int) com.max.hbutils.utils.n.p(puzzle_data != null ? puzzle_data.getHeight() : null));
                    resetCacheFile();
                    UCropPlusActivity uCropPlusActivity2 = getUCropPlusActivity();
                    if (kotlin.jvm.internal.f0.g(this, uCropPlusActivity2 != null ? uCropPlusActivity2.getCurrentCropFragment() : null) && (uCropPlusActivity = getUCropPlusActivity()) != null) {
                        uCropPlusActivity.setCuttingVisibility(false);
                    }
                } else {
                    this.inputUri = getInputUris().get(this.index);
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    Uri uri2 = this.inputUri;
                    kotlin.jvm.internal.f0.m(uri2);
                    BitmapFactory.decodeFile(uri2.getPath(), options);
                    options.inSampleSize = 1;
                    options.inJustDecodeBounds = false;
                    int i10 = options.outWidth;
                    int i11 = options.outHeight;
                    Uri uri3 = this.inputUri;
                    if ((com.max.hbimage.b.v(uri3 != null ? uri3.getPath() : null) + 180) % 180 != 0) {
                        resetCropViewLayoutParams(i11 / i10);
                    } else {
                        resetCropViewLayoutParams(i10 / i11);
                    }
                }
            } else {
                setModuleInput();
            }
        }
        resetCacheFile();
        File fileF = PictureCacheManager.f75668a.f();
        this.draftDir = fileF;
        if (fileF == null) {
            kotlin.jvm.internal.f0.S("draftDir");
            fileF = null;
        }
        if (!fileF.exists()) {
            File file = this.draftDir;
            if (file == null) {
                kotlin.jvm.internal.f0.S("draftDir");
                file = null;
            }
            file.mkdirs();
        }
        StringBuilder sb2 = new StringBuilder();
        File file2 = this.draftDir;
        if (file2 == null) {
            kotlin.jvm.internal.f0.S("draftDir");
            file2 = null;
        }
        sb2.append(file2.getPath());
        sb2.append(File.separator);
        sb2.append(new Date().getTime());
        sb2.append(this.index);
        sb2.append(imageSuffix);
        File file3 = new File(sb2.toString());
        if (file3.exists()) {
            file3.delete();
        }
        file3.createNewFile();
        this.draftUri = Uri.fromFile(file3);
        this.mRootViewBackgroundColor = arguments.getInt(UCrop.Options.EXTRA_UCROP_ROOT_VIEW_BACKGROUND_COLOR, androidx.core.content.d.f(requireContext(), R.color.brand_color_primary));
        String string = arguments.getString(UCrop.Options.EXTRA_COMPRESSION_FORMAT_NAME);
        if (!TextUtils.isEmpty(string)) {
            kotlin.jvm.internal.f0.m(string);
            compressFormatValueOf = Bitmap.CompressFormat.valueOf(string);
        }
        if (compressFormatValueOf == null) {
            compressFormatValueOf = DEFAULT_COMPRESS_FORMAT;
        }
        this.mCompressFormat = compressFormatValueOf;
        this.mCompressQuality = arguments.getInt(UCrop.Options.EXTRA_COMPRESSION_QUALITY, DEFAULT_COMPRESS_QUALITY);
    }

    private final Handler getEventHandler() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50695, new Class[0], Handler.class);
        return patchProxyResultProxy.isSupported ? (Handler) patchProxyResultProxy.result : (Handler) this.eventHandler$delegate.getValue();
    }

    private final String getImageSuffix(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 50707, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (str != null && kotlin.text.u.K1(str, "png", false, 2, null)) {
            return com.max.mediaselector.lib.config.f.f75141t;
        }
        if (str != null && kotlin.text.u.K1(str, "jpeg", false, 2, null)) {
            return com.max.mediaselector.lib.config.f.f75139r;
        }
        if (str != null && kotlin.text.u.K1(str, "wbmp", false, 2, null)) {
            return ".wbmp";
        }
        return str != null && kotlin.text.u.K1(str, "bmp", false, 2, null) ? com.max.mediaselector.lib.config.f.f75144w : ".jpg";
    }

    private final int getTotalPercent() {
        int iIntValue = 0;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50750, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        for (Integer num : this.precentList) {
            kotlin.jvm.internal.f0.m(num);
            iIntValue += num.intValue();
        }
        return iIntValue;
    }

    private final UCropPlusActivity getUCropPlusActivity() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50696, new Class[0], UCropPlusActivity.class);
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

    private final void initCropView(UCropView uCropView) {
        if (PatchProxy.proxy(new Object[]{uCropView}, this, changeQuickRedirect, false, 50704, new Class[]{UCropView.class}, Void.TYPE).isSupported) {
            return;
        }
        GestureCropImageView cropImageView = uCropView.getCropImageView();
        kotlin.jvm.internal.f0.o(cropImageView, "getCropImageView(...)");
        OverlayView overlayView = uCropView.getOverlayView();
        kotlin.jvm.internal.f0.o(overlayView, "getOverlayView(...)");
        Bundle bundle = this.mArguments;
        if (bundle != null) {
            bundle.getIntArray(UCrop.Options.EXTRA_ALLOWED_GESTURES);
            cropImageView.setMaxBitmapSize(bundle.getInt(UCrop.Options.EXTRA_MAX_BITMAP_SIZE, 0));
            cropImageView.setMaxScaleMultiplier(bundle.getFloat(UCrop.Options.EXTRA_MAX_SCALE_MULTIPLIER, 10.0f));
            cropImageView.setImageToWrapCropBoundsAnimDuration(bundle.getInt(UCrop.Options.EXTRA_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION, 500));
            overlayView.setDimmedColor(bundle.getInt(UCrop.Options.EXTRA_DIMMED_LAYER_COLOR, getResources().getColor(R.color.ucrop_color_default_dimmed)));
            overlayView.setCircleDimmedLayer(bundle.getBoolean(UCrop.Options.EXTRA_CIRCLE_DIMMED_LAYER, false));
            overlayView.setShowCropFrame(bundle.getBoolean(UCrop.Options.EXTRA_SHOW_CROP_FRAME, true));
            overlayView.setCropFrameColor(bundle.getInt(UCrop.Options.EXTRA_CROP_FRAME_COLOR, getResources().getColor(R.color.ucrop_color_default_crop_frame)));
            overlayView.setCropFrameStrokeWidth(bundle.getInt(UCrop.Options.EXTRA_CROP_FRAME_STROKE_WIDTH, getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_frame_stoke_width)));
            overlayView.setShowCropGrid(bundle.getBoolean(UCrop.Options.EXTRA_SHOW_CROP_GRID, true));
            overlayView.setCropGridRowCount(bundle.getInt(UCrop.Options.EXTRA_CROP_GRID_ROW_COUNT, 2));
            overlayView.setCropGridColumnCount(bundle.getInt(UCrop.Options.EXTRA_CROP_GRID_COLUMN_COUNT, 2));
            overlayView.setCropGridColor(bundle.getInt(UCrop.Options.EXTRA_CROP_GRID_COLOR, getResources().getColor(R.color.ucrop_color_default_crop_grid)));
            overlayView.setCropGridStrokeWidth(bundle.getInt(UCrop.Options.EXTRA_CROP_GRID_STROKE_WIDTH, getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_grid_stoke_width)));
            float f10 = bundle.getFloat(UCrop.EXTRA_ASPECT_RATIO_X, -1.0f);
            float f11 = bundle.getFloat(UCrop.EXTRA_ASPECT_RATIO_Y, -1.0f);
            int i10 = bundle.getInt(UCrop.Options.EXTRA_ASPECT_RATIO_SELECTED_BY_DEFAULT, 0);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(UCrop.Options.EXTRA_ASPECT_RATIO_OPTIONS);
            if (f10 >= 0.0f && f11 >= 0.0f) {
                float f12 = f10 / f11;
                cropImageView.setTargetAspectRatio(Float.isNaN(f12) ? 0.0f : f12);
            } else if (parcelableArrayList == null || i10 >= parcelableArrayList.size()) {
                cropImageView.setTargetAspectRatio(0.0f);
            } else {
                float aspectRatioX = ((AspectRatio) parcelableArrayList.get(i10)).getAspectRatioX() / ((AspectRatio) parcelableArrayList.get(i10)).getAspectRatioY();
                cropImageView.setTargetAspectRatio(Float.isNaN(aspectRatioX) ? 0.0f : aspectRatioX);
            }
            int i11 = bundle.getInt(UCrop.EXTRA_MAX_SIZE_X, 0);
            int i12 = bundle.getInt(UCrop.EXTRA_MAX_SIZE_Y, 0);
            if (i11 > 0 && i12 > 0) {
                cropImageView.setMaxResultImageSizeX(i11);
                cropImageView.setMaxResultImageSizeY(i12);
            }
            cropImageView.setScaleEnabled(false);
            cropImageView.setRotateEnabled(false);
            cropImageView.setScrollEnable(false);
            overlayView.setShowCropLayer(false);
            View view = this.blockingView;
            if (view == null) {
                kotlin.jvm.internal.f0.S("blockingView");
                view = null;
            }
            view.setClickable(true);
        }
    }

    private final void initViews() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50713, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        UcpItemImageEditorBinding ucpItemImageEditorBinding = this.binding;
        UCropView uCropView = null;
        if (ucpItemImageEditorBinding == null) {
            kotlin.jvm.internal.f0.S("binding");
            ucpItemImageEditorBinding = null;
        }
        ucpItemImageEditorBinding.getRoot().setBackgroundColor(androidx.core.content.res.i.e(getResources(), R.color.brand_color_primary, null));
        UCropView uCropView2 = this.cropView;
        if (uCropView2 == null) {
            kotlin.jvm.internal.f0.S("cropView");
            uCropView2 = null;
        }
        GestureCropImageView cropImageView = uCropView2.getCropImageView();
        kotlin.jvm.internal.f0.o(cropImageView, "getCropImageView(...)");
        UCropView uCropView3 = this.cropView;
        if (uCropView3 == null) {
            kotlin.jvm.internal.f0.S("cropView");
            uCropView3 = null;
        }
        kotlin.jvm.internal.f0.o(uCropView3.getOverlayView(), "getOverlayView(...)");
        UCropView uCropView4 = this.cropView;
        if (uCropView4 == null) {
            kotlin.jvm.internal.f0.S("cropView");
            uCropView4 = null;
        }
        uCropView4.setAlpha(0.0f);
        cropImageView.setTransformImageListener(new TransformImageView.TransformImageListener() { // from class: com.starlightc.ucropplus.ui.UCropPlusFragment.initViews.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.starlightc.ucropplus.view.TransformImageView.TransformImageListener
            public void onLoadComplete() {
                if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50821, new Class[0], Void.TYPE).isSupported && UCropPlusFragment.this.needAlphaAnim) {
                    UCropPlusFragment.this.needAlphaAnim = false;
                    kotlinx.coroutines.k.f(UCropPlusFragment.this.uiScope, null, null, new UCropPlusFragment$initViews$1$onLoadComplete$1(UCropPlusFragment.this, null), 3, null);
                }
            }

            @Override // com.starlightc.ucropplus.view.TransformImageView.TransformImageListener
            public void onLoadFailure(@dl.d Exception e10) {
                if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 50822, new Class[]{Exception.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(e10, "e");
            }

            @Override // com.starlightc.ucropplus.view.TransformImageView.TransformImageListener
            public void onRotate(float f10) {
            }

            @Override // com.starlightc.ucropplus.view.TransformImageView.TransformImageListener
            public void onScale(float f10) {
            }
        });
        cropImageView.setRatioCheckAction(new SimpleAction() { // from class: com.starlightc.ucropplus.ui.UCropPlusFragment.initViews.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.starlightc.ucropplus.callback.SimpleAction
            public void doAction(@dl.e Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50827, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlinx.coroutines.k.f(UCropPlusFragment.this.uiScope, null, null, new UCropPlusFragment$initViews$2$doAction$1(obj, UCropPlusFragment.this, null), 3, null);
            }
        });
        UCropView uCropView5 = this.cropView;
        if (uCropView5 == null) {
            kotlin.jvm.internal.f0.S("cropView");
            uCropView5 = null;
        }
        initCropView(uCropView5);
        this.createDraftReport = getDraft();
        updateImageData();
        UCropView uCropView6 = this.cropView;
        if (uCropView6 == null) {
            kotlin.jvm.internal.f0.S("cropView");
        } else {
            uCropView = uCropView6;
        }
        uCropView.requestFocus();
    }

    private final void loadModuleResource() {
        TextPuzzle textPuzzle;
        String typeface_name;
        PuzzleDataObj puzzle_data;
        PuzzleDataObj puzzle_data2;
        int i10 = 0;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50748, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.precentList.clear();
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.f0.o(contextRequireContext, "requireContext(...)");
        v0 v0Var = v0.f124986a;
        String string = requireContext().getResources().getString(R.string.loading_percent);
        kotlin.jvm.internal.f0.o(string, "getString(...)");
        String str = String.format(string, Arrays.copyOf(new Object[]{"0%"}, 1));
        kotlin.jvm.internal.f0.o(str, "format(...)");
        LoadingDialog loadingDialogR = new LoadingDialog(contextRequireContext, str).r();
        this.loadingDialog = loadingDialogR;
        this.tv_percent = loadingDialogR != null ? loadingDialogR.h() : null;
        ImageModuleObj imageModuleObj = this.imageModule;
        int iNeedLoadTypefaceNum = (imageModuleObj == null || (puzzle_data2 = imageModuleObj.getPuzzle_data()) == null) ? 0 : puzzle_data2.needLoadTypefaceNum();
        ImageModuleObj imageModuleObj2 = this.imageModule;
        int iNeedLoadPictureNum = (imageModuleObj2 == null || (puzzle_data = imageModuleObj2.getPuzzle_data()) == null) ? 0 : puzzle_data.needLoadPictureNum();
        int i11 = iNeedLoadPictureNum + iNeedLoadTypefaceNum;
        for (int i12 = 0; i12 < i11; i12++) {
            this.precentList.add(0);
        }
        int i13 = iNeedLoadTypefaceNum > 0 ? (iNeedLoadPictureNum > 0 ? 90 : 100) / iNeedLoadTypefaceNum : 0;
        this.typefacePercent = i13;
        this.typefacePercent = Math.max(1, i13);
        int i14 = iNeedLoadPictureNum > 0 ? (iNeedLoadTypefaceNum > 0 ? 10 : 100) / iNeedLoadPictureNum : 0;
        this.picturePercent = i14;
        this.picturePercent = Math.max(1, i14);
        refreshPercentView(false);
        ImageModuleObj imageModuleObj3 = this.imageModule;
        kotlin.jvm.internal.f0.m(imageModuleObj3);
        PuzzleDataObj puzzle_data3 = imageModuleObj3.getPuzzle_data();
        ArrayList<BasePuzzleInfo> puzzle_list = puzzle_data3 != null ? puzzle_data3.getPuzzle_list() : null;
        kotlin.jvm.internal.f0.m(puzzle_list);
        for (BasePuzzleInfo basePuzzleInfo : puzzle_list) {
            if (basePuzzleInfo instanceof StaticPicturePuzzle) {
                String url = ((StaticPicturePuzzle) basePuzzleInfo).getUrl();
                if (url != null) {
                    File fileP = com.max.hbimage.b.p(url);
                    if (((fileP == null || !fileP.exists()) ? null : BitmapFactory.decodeFile(fileP.getPath())) == null) {
                        this.remotePicNum++;
                        downloadImage(url, i10);
                        i10++;
                    }
                }
            } else if ((basePuzzleInfo instanceof TextPuzzle) && (typeface_name = (textPuzzle = (TextPuzzle) basePuzzleInfo).getTypeface_name()) != null && TypefaceUtil.INSTANCE.getCachedRemoteTypeface(typeface_name) == null) {
                this.remoteTFNUm++;
                downloadTypeface(typeface_name, textPuzzle.getTypeface_url(), i10);
                i10++;
            }
        }
    }

    private final void loadOriginImage() throws Exception {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50711, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        GestureCropImageView gestureCropImageView = this.gestureCropImageView;
        GestureCropImageView gestureCropImageView2 = null;
        if (gestureCropImageView == null) {
            kotlin.jvm.internal.f0.S("gestureCropImageView");
            gestureCropImageView = null;
        }
        gestureCropImageView.reset();
        UCropView uCropView = this.cropView;
        if (uCropView == null) {
            kotlin.jvm.internal.f0.S("cropView");
            uCropView = null;
        }
        uCropView.setAlpha(0.0f);
        GestureCropImageView gestureCropImageView3 = this.gestureCropImageView;
        if (gestureCropImageView3 == null) {
            kotlin.jvm.internal.f0.S("gestureCropImageView");
            gestureCropImageView3 = null;
        }
        Uri uri = this.inputUri;
        kotlin.jvm.internal.f0.m(uri);
        Uri uri2 = this.cacheUri;
        kotlin.jvm.internal.f0.m(uri2);
        gestureCropImageView3.setImageUri(uri, uri2);
        getEventHandler().postDelayed(new Runnable() { // from class: com.starlightc.ucropplus.ui.e0
            @Override // java.lang.Runnable
            public final void run() {
                UCropPlusFragment.loadOriginImage$lambda$6(this.f98084b);
            }
        }, 300L);
        GestureCropImageView gestureCropImageView4 = this.gestureCropImageView;
        if (gestureCropImageView4 == null) {
            kotlin.jvm.internal.f0.S("gestureCropImageView");
        } else {
            gestureCropImageView2 = gestureCropImageView4;
        }
        gestureCropImageView2.setImageToWrapCropBounds(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadOriginImage$lambda$6(UCropPlusFragment this$0) {
        if (PatchProxy.proxy(new Object[]{this$0}, null, changeQuickRedirect, true, 50769, new Class[]{UCropPlusFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        if (this$0.firstShowCropDialog) {
            this$0.restoreImageState();
        } else {
            this$0.firstShowCropDialog = true;
        }
        this$0.showCropViewAnimator(500L);
    }

    private final void refreshPercentView(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 50749, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        kotlinx.coroutines.k.f(this.uiScope, null, null, new C13341(z10, null), 3, null);
    }

    private final void resetCacheFile() throws IOException {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50758, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        File tempCacheFile = getTempCacheFile();
        if (tempCacheFile.exists()) {
            tempCacheFile.delete();
        }
        tempCacheFile.createNewFile();
        this.cacheUri = Uri.fromFile(tempCacheFile);
    }

    private final void resetCropViewLayoutParams(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, 50714, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        kotlinx.coroutines.k.f(this.uiScope, null, null, new C13351(f10, null), 3, null);
    }

    private final void resetRotation() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50720, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        GestureCropImageView gestureCropImageView = this.gestureCropImageView;
        GestureCropImageView gestureCropImageView2 = null;
        if (gestureCropImageView == null) {
            kotlin.jvm.internal.f0.S("gestureCropImageView");
            gestureCropImageView = null;
        }
        GestureCropImageView gestureCropImageView3 = this.gestureCropImageView;
        if (gestureCropImageView3 == null) {
            kotlin.jvm.internal.f0.S("gestureCropImageView");
            gestureCropImageView3 = null;
        }
        gestureCropImageView.postRotate(0.0f - gestureCropImageView3.getCurrentAngle());
        GestureCropImageView gestureCropImageView4 = this.gestureCropImageView;
        if (gestureCropImageView4 == null) {
            kotlin.jvm.internal.f0.S("gestureCropImageView");
        } else {
            gestureCropImageView2 = gestureCropImageView4;
        }
        gestureCropImageView2.setImageToWrapCropBounds();
    }

    private final void restoreImageState() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50710, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        GestureCropImageView gestureCropImageView = this.gestureCropImageView;
        GestureCropImageView gestureCropImageView2 = null;
        if (gestureCropImageView == null) {
            kotlin.jvm.internal.f0.S("gestureCropImageView");
            gestureCropImageView = null;
        }
        gestureCropImageView.setTargetAspectRatio(this.cachedImageState.getRatio());
        GestureCropImageView gestureCropImageView3 = this.gestureCropImageView;
        if (gestureCropImageView3 == null) {
            kotlin.jvm.internal.f0.S("gestureCropImageView");
            gestureCropImageView3 = null;
        }
        Matrix matrix = gestureCropImageView3.mCurrentImageMatrix;
        matrix.setValues(this.cachedImageState.getMatrix());
        GestureCropImageView gestureCropImageView4 = this.gestureCropImageView;
        if (gestureCropImageView4 == null) {
            kotlin.jvm.internal.f0.S("gestureCropImageView");
        } else {
            gestureCropImageView2 = gestureCropImageView4;
        }
        gestureCropImageView2.setImageMatrix(matrix);
    }

    private final void saveCurrentState(ImageCropState imageCropState) {
        if (PatchProxy.proxy(new Object[]{imageCropState}, this, changeQuickRedirect, false, 50709, new Class[]{ImageCropState.class}, Void.TYPE).isSupported || imageCropState == null) {
            return;
        }
        this.cachedImageState.setRotateAngle(imageCropState.getRotateAngle());
        this.cachedImageState.setScale(imageCropState.getScale());
        this.cachedImageState.setRatio(imageCropState.getRatio());
        this.cachedImageState.setMatrix(imageCropState.getMatrix());
    }

    private final void setModuleCropViewAndInputUri(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 50756, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        showCropViewAnimator(500L);
        int iL = ViewUtils.L(getContext());
        int i11 = (int) (((i10 > 0 ? i10 : 500.0f) * iL) / 375);
        UcpItemImageEditorBinding ucpItemImageEditorBinding = this.binding;
        if (ucpItemImageEditorBinding == null) {
            kotlin.jvm.internal.f0.S("binding");
            ucpItemImageEditorBinding = null;
        }
        ViewGroup.LayoutParams layoutParams = ucpItemImageEditorBinding.cropView.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = i11;
        UcpItemImageEditorBinding ucpItemImageEditorBinding2 = this.binding;
        if (ucpItemImageEditorBinding2 == null) {
            kotlin.jvm.internal.f0.S("binding");
            ucpItemImageEditorBinding2 = null;
        }
        ucpItemImageEditorBinding2.cropView.setLayoutParams(layoutParams);
        Bitmap colorBitmap = ModuleUtil.INSTANCE.getColorBitmap(-1, iL, i11);
        Uri uri = this.outputDir;
        this.inputUri = Uri.fromFile(com.max.hbimage.b.q0(colorBitmap, uri != null ? uri.getPath() : null));
    }

    private final void setModuleInput() throws Throwable {
        ImageModuleObj imageModuleObj;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50755, new Class[0], Void.TYPE).isSupported || (imageModuleObj = this.imageModule) == null) {
            return;
        }
        kotlin.jvm.internal.f0.m(imageModuleObj);
        PuzzleDataObj puzzle_data = imageModuleObj.getPuzzle_data();
        setModuleCropViewAndInputUri((int) com.max.hbutils.utils.n.p(puzzle_data != null ? puzzle_data.getHeight() : null));
        addBackgroundPuzzle();
    }

    public static /* synthetic */ void setTargetAspectRatio$default(UCropPlusFragment uCropPlusFragment, int i10, int i11, boolean z10, int i12, Object obj) {
        Object[] objArr = {uCropPlusFragment, new Integer(i10), new Integer(i11), new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i12), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 50724, new Class[]{UCropPlusFragment.class, cls, cls, Boolean.TYPE, cls, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setTargetAspectRatio");
        }
        if ((i12 & 4) != 0) {
            z10 = true;
        }
        uCropPlusFragment.setTargetAspectRatio(i10, i11, z10);
    }

    private final void setTickerInfo(ArrayList<StickerStateInfo> arrayList) throws InterruptedException {
        BaseStickerItem bitmapStickerItem;
        if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 50717, new Class[]{ArrayList.class}, Void.TYPE).isSupported || arrayList == null) {
            return;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(arrayList.size());
        for (StickerStateInfo stickerStateInfo : arrayList) {
            if (stickerStateInfo.getType() == BaseStickerItem.StickerType.Text) {
                Context contextRequireContext = requireContext();
                kotlin.jvm.internal.f0.o(contextRequireContext, "requireContext(...)");
                bitmapStickerItem = new TextStickerItem(contextRequireContext);
            } else if (stickerStateInfo.getType() == BaseStickerItem.StickerType.Label) {
                Context contextRequireContext2 = requireContext();
                kotlin.jvm.internal.f0.o(contextRequireContext2, "requireContext(...)");
                bitmapStickerItem = new LabelStickerItem(contextRequireContext2);
            } else {
                Context contextRequireContext3 = requireContext();
                kotlin.jvm.internal.f0.o(contextRequireContext3, "requireContext(...)");
                bitmapStickerItem = new BitmapStickerItem(contextRequireContext3);
            }
            kotlin.jvm.internal.f0.m(stickerStateInfo);
            bitmapStickerItem.initWithStateInfo(stickerStateInfo, getStickerView(), new SimpleAction() { // from class: com.starlightc.ucropplus.ui.UCropPlusFragment$setTickerInfo$1$1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.starlightc.ucropplus.callback.SimpleAction
                public void doAction(@dl.e Object obj) {
                    if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50860, new Class[]{Object.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    countDownLatch.countDown();
                }
            });
            getStickerView().addSticker(bitmapStickerItem);
        }
        countDownLatch.await();
    }

    private final void showCropViewAnimator(long j10) {
        if (PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, 50734, new Class[]{Long.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        UCropView uCropView = this.cropView;
        UCropView uCropView2 = null;
        if (uCropView == null) {
            kotlin.jvm.internal.f0.S("cropView");
            uCropView = null;
        }
        uCropView.setAlpha(0.0f);
        UCropView uCropView3 = this.cropView;
        if (uCropView3 == null) {
            kotlin.jvm.internal.f0.S("cropView");
        } else {
            uCropView2 = uCropView3;
        }
        uCropView2.animate().alpha(1.0f).setDuration(j10).setInterpolator(new AccelerateInterpolator()).start();
    }

    private final void showLoadingDataFailed() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50754, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        LoadingDialog loadingDialog = this.loadingDialog;
        if (loadingDialog != null) {
            loadingDialog.c();
        }
        com.max.hbutils.utils.c.f("资源加载失败请重试");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void showLoadingDataSuccess() {
        ArrayList<BasePuzzleInfo> puzzle_list;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50753, new Class[0], Void.TYPE).isSupported && this.remotePicNum == 0 && this.remoteTFNUm == 0) {
            refreshPercentView(true);
            LoadingDialog loadingDialog = this.loadingDialog;
            if (loadingDialog != null) {
                loadingDialog.c();
            }
            ImageModuleObj imageModuleObj = this.imageModule;
            kotlin.jvm.internal.f0.m(imageModuleObj);
            PuzzleDataObj puzzle_data = imageModuleObj.getPuzzle_data();
            ArrayList<BasePuzzleInfo> puzzle_list2 = puzzle_data != null ? puzzle_data.getPuzzle_list() : null;
            kotlin.jvm.internal.f0.m(puzzle_list2);
            int size = puzzle_list2.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                ImageModuleObj imageModuleObj2 = this.imageModule;
                kotlin.jvm.internal.f0.m(imageModuleObj2);
                PuzzleDataObj puzzle_data2 = imageModuleObj2.getPuzzle_data();
                BasePuzzleInfo basePuzzleInfo = (puzzle_data2 == null || (puzzle_list = puzzle_data2.getPuzzle_list()) == null) ? null : puzzle_list.get(i11);
                String type = basePuzzleInfo != null ? basePuzzleInfo.getType() : null;
                if (type != null) {
                    switch (type.hashCode()) {
                        case -559446995:
                            if (type.equals(BasePuzzleInfo.PUZZLE_TYPE_STATIC_PICTURE) && (basePuzzleInfo instanceof StaticPicturePuzzle)) {
                                StaticPicturePuzzle staticPicturePuzzle = (StaticPicturePuzzle) basePuzzleInfo;
                                if (!com.max.hbcommon.utils.c.u(staticPicturePuzzle.getUrl())) {
                                    File fileP = com.max.hbimage.b.p(staticPicturePuzzle.getUrl());
                                    Bitmap bitmapDecodeFile = (fileP == null || !fileP.exists()) ? null : BitmapFactory.decodeFile(fileP.getPath());
                                    if (bitmapDecodeFile != null) {
                                        addStickerBitImage$default(this, bitmapDecodeFile, fileP.getPath(), basePuzzleInfo, false, 0, 16, null);
                                    }
                                } else if (!com.max.hbcommon.utils.c.u(staticPicturePuzzle.getPath())) {
                                    addStickerBitImage$default(this, BitmapFactory.decodeFile(staticPicturePuzzle.getPath()), staticPicturePuzzle.getPath(), basePuzzleInfo, false, 0, 16, null);
                                }
                            }
                            break;
                        case -155472072:
                            if (type.equals(BasePuzzleInfo.PUZZLE_TYPE_CONTENT_PICTURE) && (basePuzzleInfo instanceof ContentPicturePuzzle) && i10 < getInputUris().size()) {
                                Uri uri = getInputUris().get(this.index);
                                kotlin.jvm.internal.f0.o(uri, "get(...)");
                                Uri uri2 = uri;
                                Bitmap bitmapDecodeFile2 = BitmapFactory.decodeFile(uri2.getPath());
                                int iV = com.max.hbimage.b.v(uri2.getPath());
                                if (iV != 0) {
                                    bitmapDecodeFile2 = com.max.hbimage.b.n0(bitmapDecodeFile2, iV);
                                }
                                String path = uri2.getPath();
                                ModuleUtil moduleUtil = ModuleUtil.INSTANCE;
                                kotlin.jvm.internal.f0.m(bitmapDecodeFile2);
                                addStickerBitImage$default(this, bitmapDecodeFile2, path, moduleUtil.handleContentPuzzle(bitmapDecodeFile2, (ContentPicturePuzzle) basePuzzleInfo), false, 0, 16, null);
                                i10++;
                            }
                            break;
                        case 3556653:
                            if (type.equals("text") && (basePuzzleInfo instanceof TextPuzzle)) {
                                createTextSticker((TextPuzzle) basePuzzleInfo, false);
                            }
                            break;
                        case 94842723:
                            if (type.equals("color") && (basePuzzleInfo instanceof ColorPuzzle)) {
                                ColorPuzzle colorPuzzle = (ColorPuzzle) basePuzzleInfo;
                                GradientDrawable gradientDrawableW = ViewUtils.w(ViewUtils.f(getContext(), com.max.hbutils.utils.n.p(colorPuzzle.getRadius())), com.max.hbcommon.utils.l.g(colorPuzzle.getStart_color()), com.max.hbcommon.utils.l.g(colorPuzzle.getEnd_color()), colorPuzzle.getDrawableOrientation());
                                HBRectF rect = colorPuzzle.getRect();
                                kotlin.jvm.internal.f0.m(rect);
                                Context contextRequireContext = requireContext();
                                kotlin.jvm.internal.f0.o(contextRequireContext, "requireContext(...)");
                                RectF pxRectF = rect.toPxRectF(contextRequireContext);
                                Bitmap bitmapDrawableToBitmap = ModuleUtil.INSTANCE.drawableToBitmap(gradientDrawableW, (int) (pxRectF.right - pxRectF.left), (int) (pxRectF.bottom - pxRectF.top));
                                Uri uri3 = this.outputDir;
                                addStickerBitImage$default(this, bitmapDrawableToBitmap, com.max.hbimage.b.q0(bitmapDrawableToBitmap, uri3 != null ? uri3.getPath() : null).getPath(), basePuzzleInfo, false, 0, 16, null);
                            }
                            break;
                        case 102727412:
                            if (type.equals(BasePuzzleInfo.PUZZLE_TYPE_LABEL) && (basePuzzleInfo instanceof LabelPuzzle)) {
                                getStickerView().addLabelSticker(basePuzzleInfo);
                            }
                            break;
                    }
                }
            }
            this.createDraft = getDraft();
        }
    }

    private final void updateImageData() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50716, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.inputUri == null || this.cacheUri == null) {
            Log.d(this.TAG, getString(R.string.ucrop_error_input_data_is_absent));
        } else {
            try {
                GestureCropImageView gestureCropImageView = null;
                if (this.draft != null) {
                    kotlinx.coroutines.k.f(this.uiScope, null, null, new C13381(null), 3, null);
                } else {
                    GestureCropImageView gestureCropImageView2 = this.gestureCropImageView;
                    if (gestureCropImageView2 == null) {
                        kotlin.jvm.internal.f0.S("gestureCropImageView");
                    } else {
                        gestureCropImageView = gestureCropImageView2;
                    }
                    Uri uri = this.inputUri;
                    kotlin.jvm.internal.f0.m(uri);
                    Uri uri2 = this.cacheUri;
                    kotlin.jvm.internal.f0.m(uri2);
                    gestureCropImageView.setImageUri(uri, uri2);
                    this.createDraft = getDraft();
                    addModuleData();
                }
                Log.d(this.TAG, "start crop inputUri = " + this.inputUri + " cacheUri = " + this.cacheUri + " draft = " + this.draft);
            } catch (Exception e10) {
                Log.e(this.TAG, e10.toString());
            }
        }
        this.outputUri = generateOutputUri();
    }

    public final void addBackgroundPuzzle() throws Throwable {
        PuzzleDataObj puzzle_data;
        ArrayList<BasePuzzleInfo> puzzle_list;
        int iQ;
        PuzzleDataObj puzzle_data2;
        ArrayList<BasePuzzleInfo> puzzle_list2;
        PuzzleDataObj puzzle_data3;
        BackgroundObj background;
        PuzzleDataObj puzzle_data4;
        BackgroundObj background2;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50706, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ModuleUtil moduleUtil = ModuleUtil.INSTANCE;
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.f0.o(contextRequireContext, "requireContext(...)");
        ImageModuleObj imageModuleObj = this.imageModule;
        kotlin.jvm.internal.f0.m(imageModuleObj);
        String path = getInputUris().get(this.index).getPath();
        Uri uri = this.outputDir;
        StaticPicturePuzzle moduleBackgroundPuzzle = moduleUtil.getModuleBackgroundPuzzle(contextRequireContext, imageModuleObj, path, uri != null ? uri.getPath() : null);
        if (moduleBackgroundPuzzle != null) {
            ImageModuleObj imageModuleObj2 = this.imageModule;
            if (com.max.hbcommon.utils.c.u((imageModuleObj2 == null || (puzzle_data4 = imageModuleObj2.getPuzzle_data()) == null || (background2 = puzzle_data4.getBackground()) == null) ? null : background2.getBackground_puzzle_index())) {
                iQ = 1;
            } else {
                ImageModuleObj imageModuleObj3 = this.imageModule;
                iQ = com.max.hbutils.utils.n.q((imageModuleObj3 == null || (puzzle_data3 = imageModuleObj3.getPuzzle_data()) == null || (background = puzzle_data3.getBackground()) == null) ? null : background.getBackground_puzzle_index());
            }
            ImageModuleObj imageModuleObj4 = this.imageModule;
            if (imageModuleObj4 != null && (puzzle_data2 = imageModuleObj4.getPuzzle_data()) != null && (puzzle_list2 = puzzle_data2.getPuzzle_list()) != null) {
                puzzle_list2.add(iQ, moduleBackgroundPuzzle);
            }
        }
        ColorPuzzle colorPuzzle = new ColorPuzzle("0", "#FFFFFF", "#FFFFFF", null);
        colorPuzzle.setType("color");
        ImageModuleObj imageModuleObj5 = this.imageModule;
        kotlin.jvm.internal.f0.m(imageModuleObj5);
        PuzzleDataObj puzzle_data5 = imageModuleObj5.getPuzzle_data();
        colorPuzzle.setRect(new HBRectF(0.0f, 0.0f, 375.0f, com.max.hbutils.utils.n.p(puzzle_data5 != null ? puzzle_data5.getHeight() : null)));
        colorPuzzle.setCan_edit("0");
        ImageModuleObj imageModuleObj6 = this.imageModule;
        if (imageModuleObj6 == null || (puzzle_data = imageModuleObj6.getPuzzle_data()) == null || (puzzle_list = puzzle_data.getPuzzle_list()) == null) {
            return;
        }
        puzzle_list.add(0, colorPuzzle);
    }

    public final void addModuleData() {
        ImageModuleObj imageModuleObj;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50747, new Class[0], Void.TYPE).isSupported || !kotlin.jvm.internal.f0.g("1", this.type) || (imageModuleObj = this.imageModule) == null) {
            return;
        }
        List[] listArr = new List[1];
        kotlin.jvm.internal.f0.m(imageModuleObj);
        PuzzleDataObj puzzle_data = imageModuleObj.getPuzzle_data();
        listArr[0] = puzzle_data != null ? puzzle_data.getPuzzle_list() : null;
        if (com.max.hbcommon.utils.c.w(listArr)) {
            return;
        }
        getStickerView().post(new Runnable() { // from class: com.starlightc.ucropplus.ui.g0
            @Override // java.lang.Runnable
            public final void run() {
                UCropPlusFragment.addModuleData$lambda$10(this.f98088b);
            }
        });
    }

    public final void addStickerBitImage(@dl.e Bitmap bitmap, @dl.e String str, @dl.e BasePuzzleInfo basePuzzleInfo, boolean z10, int i10) {
        if (PatchProxy.proxy(new Object[]{bitmap, str, basePuzzleInfo, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10)}, this, changeQuickRedirect, false, 50737, new Class[]{Bitmap.class, String.class, BasePuzzleInfo.class, Boolean.TYPE, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        getStickerView().addStickerBitImage(bitmap, str, basePuzzleInfo, z10, i10);
    }

    public final void applyCrop(@dl.d final Uri uriIn, @dl.d final Uri uriOut, final boolean z10) {
        if (PatchProxy.proxy(new Object[]{uriIn, uriOut, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 50735, new Class[]{Uri.class, Uri.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(uriIn, "uriIn");
        kotlin.jvm.internal.f0.p(uriOut, "uriOut");
        this.hasApplyEdited = true;
        GestureCropImageView gestureCropImageView = this.gestureCropImageView;
        if (gestureCropImageView == null) {
            kotlin.jvm.internal.f0.S("gestureCropImageView");
            gestureCropImageView = null;
        }
        gestureCropImageView.cropAndSaveImage(this.mCompressFormat, this.mCompressQuality, new BitmapCropCallback() { // from class: com.starlightc.ucropplus.ui.UCropPlusFragment.applyCrop.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.starlightc.ucropplus.callback.BitmapCropCallback
            public void onBitmapCropped(@dl.d Uri resultUri, int i10, int i11, int i12, int i13) {
                Object[] objArr = {resultUri, new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                Class cls = Integer.TYPE;
                if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 50788, new Class[]{Uri.class, cls, cls, cls, cls}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(resultUri, "resultUri");
                kotlinx.coroutines.k.f(UCropPlusFragment.this.uiScope, null, null, new UCropPlusFragment$applyCrop$1$onBitmapCropped$1(z10, UCropPlusFragment.this, uriIn, uriOut, null), 3, null);
            }

            @Override // com.starlightc.ucropplus.callback.BitmapCropCallback
            public void onCropFailure(@dl.d Throwable t10) throws Exception {
                if (PatchProxy.proxy(new Object[]{t10}, this, changeQuickRedirect, false, 50789, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(t10, "t");
                UCropPlusFragment.this.switchEditMode(EDIT_MODE.IDLE);
            }
        });
    }

    public final void applyCrop(boolean z10) throws IOException {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 50732, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        saveCurrentState();
        showCropViewAnimator(300L);
        if (z10) {
            float ratio = this.cachedImageState.getRatio();
            OverlayView overlayView = this.overlayView;
            GestureCropImageView gestureCropImageView = null;
            if (overlayView == null) {
                kotlin.jvm.internal.f0.S("overlayView");
                overlayView = null;
            }
            if (overlayView.getFreestyleCropMode() != 0) {
                GestureCropImageView gestureCropImageView2 = this.gestureCropImageView;
                if (gestureCropImageView2 == null) {
                    kotlin.jvm.internal.f0.S("gestureCropImageView");
                } else {
                    gestureCropImageView = gestureCropImageView2;
                }
                RectF cropRect = gestureCropImageView.getCropRect();
                if (!(cropRect.height() == 0.0f)) {
                    ratio = cropRect.width() / cropRect.height();
                }
            }
            resetCropViewLayoutParams(ratio);
        }
        Uri uri = this.cacheUri;
        kotlin.jvm.internal.f0.m(uri);
        Uri uri2 = this.cacheUri;
        kotlin.jvm.internal.f0.m(uri2);
        applyCrop(uri, uri2, z10);
    }

    public final boolean applyImage() {
        Bitmap bitmapCopy;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50731, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        GestureCropImageView gestureCropImageView = null;
        if (hasModule()) {
            ModuleUtil moduleUtil = ModuleUtil.INSTANCE;
            UCropView uCropView = this.cropView;
            if (uCropView == null) {
                kotlin.jvm.internal.f0.S("cropView");
                uCropView = null;
            }
            int measuredWidth = uCropView.getMeasuredWidth();
            UCropView uCropView2 = this.cropView;
            if (uCropView2 == null) {
                kotlin.jvm.internal.f0.S("cropView");
                uCropView2 = null;
            }
            bitmapCopy = moduleUtil.getColorBitmap(-1, measuredWidth, uCropView2.getMeasuredHeight());
        } else {
            GestureCropImageView gestureCropImageView2 = this.gestureCropImageView;
            if (gestureCropImageView2 == null) {
                kotlin.jvm.internal.f0.S("gestureCropImageView");
                gestureCropImageView2 = null;
            }
            Bitmap viewBitmap = gestureCropImageView2.getViewBitmap();
            bitmapCopy = viewBitmap != null ? viewBitmap.copy(Bitmap.Config.ARGB_8888, true) : null;
        }
        if (bitmapCopy == null) {
            return false;
        }
        GestureCropImageView gestureCropImageView3 = this.gestureCropImageView;
        if (gestureCropImageView3 == null) {
            kotlin.jvm.internal.f0.S("gestureCropImageView");
        } else {
            gestureCropImageView = gestureCropImageView3;
        }
        Matrix matrix = new Matrix(gestureCropImageView.getCurrentImageMatrix());
        Canvas canvas = new Canvas(bitmapCopy);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        SquareMatrix3 squareMatrix3InverseMatrix = new SquareMatrix3(fArr).inverseMatrix();
        Matrix matrix2 = new Matrix();
        if (!hasModule()) {
            matrix2.setValues(squareMatrix3InverseMatrix.getValues());
        }
        getStickerView().handleImage(canvas, matrix2);
        Uri uri = this.outputUri;
        if (uri == null) {
            return false;
        }
        kotlin.jvm.internal.f0.m(uri);
        File fileO0 = com.max.hbimage.b.o0(bitmapCopy, uri.getPath());
        return fileO0 != null && fileO0.exists();
    }

    public final boolean checkHasEdited() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50730, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : hasModule() | hasStickItem() | this.hasApplyEdited;
    }

    public final void clearTempCacheFile() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50766, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        kotlinx.coroutines.k.f(this.ioScope, null, null, new C13291(null), 3, null);
    }

    public final void createTextSticker(@dl.e TextPuzzle textPuzzle, boolean z10) {
        if (PatchProxy.proxy(new Object[]{textPuzzle, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 50742, new Class[]{TextPuzzle.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        getStickerView().addTextSticker(textPuzzle, z10);
    }

    public final float getCachedRatio() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50728, new Class[0], Float.TYPE);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : this.cachedImageState.getRatio();
    }

    public final float getCurrentRatio() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50727, new Class[0], Float.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Float) patchProxyResultProxy.result).floatValue();
        }
        GestureCropImageView gestureCropImageView = this.gestureCropImageView;
        if (gestureCropImageView == null) {
            kotlin.jvm.internal.f0.S("gestureCropImageView");
            gestureCropImageView = null;
        }
        return gestureCropImageView.getTargetAspectRatio();
    }

    public final float getCurrentScale() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50726, new Class[0], Float.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Float) patchProxyResultProxy.result).floatValue();
        }
        GestureCropImageView gestureCropImageView = this.gestureCropImageView;
        if (gestureCropImageView == null) {
            kotlin.jvm.internal.f0.S("gestureCropImageView");
            gestureCropImageView = null;
        }
        return gestureCropImageView.getCurrentScale();
    }

    @dl.d
    public final String getCurrentTextContent() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50745, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String string = getString(R.string.text_sticker_editor_hint);
        kotlin.jvm.internal.f0.o(string, "getString(...)");
        String currentTextContent = getStickerView().getCurrentTextContent();
        return (kotlin.jvm.internal.f0.g(currentTextContent, string) || currentTextContent == null) ? "" : currentTextContent;
    }

    @dl.e
    public final TextRenderInfo getCurrentTextRenderInfo() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50740, new Class[0], TextRenderInfo.class);
        return patchProxyResultProxy.isSupported ? (TextRenderInfo) patchProxyResultProxy.result : getStickerView().getCurrentTextRenderInfo();
    }

    @dl.d
    public final Draft getDraft() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50765, new Class[0], Draft.class);
        if (patchProxyResultProxy.isSupported) {
            return (Draft) patchProxyResultProxy.result;
        }
        String path = getInputUris().get(this.index).getPath();
        Uri uri = this.draftUri;
        GestureCropImageView gestureCropImageView = null;
        String path2 = uri != null ? uri.getPath() : null;
        ImageCropState imageCropState = this.cachedImageState;
        ArrayList<StickerStateInfo> stickerInfoList = getStickerInfoList();
        GestureCropImageView gestureCropImageView2 = this.gestureCropImageView;
        if (gestureCropImageView2 == null) {
            kotlin.jvm.internal.f0.S("gestureCropImageView");
        } else {
            gestureCropImageView = gestureCropImageView2;
        }
        return new Draft(path, path2, imageCropState, stickerInfoList, gestureCropImageView.filter, this.imageModule);
    }

    @dl.d
    public final EDIT_MODE getEditMode() {
        return this.editMode;
    }

    @dl.d
    public final ArrayList<Uri> getInputUris() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50693, new Class[0], ArrayList.class);
        if (patchProxyResultProxy.isSupported) {
            return (ArrayList) patchProxyResultProxy.result;
        }
        ArrayList<Uri> arrayList = this.inputUris;
        if (arrayList != null) {
            return arrayList;
        }
        kotlin.jvm.internal.f0.S("inputUris");
        return null;
    }

    @dl.e
    public final Uri getOutputUri() {
        return this.outputUri;
    }

    @dl.d
    public final ArrayList<StickerStateInfo> getStickerInfoList() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50746, new Class[0], ArrayList.class);
        if (patchProxyResultProxy.isSupported) {
            return (ArrayList) patchProxyResultProxy.result;
        }
        ArrayList<StickerStateInfo> arrayList = new ArrayList<>();
        UCropView uCropView = this.cropView;
        if (uCropView == null) {
            kotlin.jvm.internal.f0.S("cropView");
            uCropView = null;
        }
        Iterator<BaseStickerItem> it = uCropView.getStickerView().getStickerStore().values().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getStateInfo());
        }
        return arrayList;
    }

    @dl.d
    public final StickerView getStickerView() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50691, new Class[0], StickerView.class);
        if (patchProxyResultProxy.isSupported) {
            return (StickerView) patchProxyResultProxy.result;
        }
        StickerView stickerView = this.stickerView;
        if (stickerView != null) {
            return stickerView;
        }
        kotlin.jvm.internal.f0.S("stickerView");
        return null;
    }

    public final String getTAG() {
        return this.TAG;
    }

    @dl.d
    public final File getTempCacheFile() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50767, new Class[0], File.class);
        if (patchProxyResultProxy.isSupported) {
            return (File) patchProxyResultProxy.result;
        }
        Uri uri = this.inputUri;
        return new File(BaseApplication.a().getCacheDir().getPath() + File.separator + "edit_cache_" + this.index + getImageSuffix(uri != null ? uri.getPath() : null));
    }

    public final boolean hasModule() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50759, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return kotlin.jvm.internal.f0.g(this.type, "1") && this.imageModule != null;
    }

    public final boolean hasStickItem() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50760, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return getStickerView().getStickerCount() > 0;
    }

    public final boolean isTextStickerSelected() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50744, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : getStickerView().isTextStickerSelected();
    }

    public final void loadEditImage() throws Exception {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50712, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        GestureCropImageView gestureCropImageView = this.gestureCropImageView;
        GestureCropImageView gestureCropImageView2 = null;
        if (gestureCropImageView == null) {
            kotlin.jvm.internal.f0.S("gestureCropImageView");
            gestureCropImageView = null;
        }
        gestureCropImageView.reset();
        GestureCropImageView gestureCropImageView3 = this.gestureCropImageView;
        if (gestureCropImageView3 == null) {
            kotlin.jvm.internal.f0.S("gestureCropImageView");
            gestureCropImageView3 = null;
        }
        Uri uri = this.cacheUri;
        kotlin.jvm.internal.f0.m(uri);
        Uri uri2 = this.cacheUri;
        kotlin.jvm.internal.f0.m(uri2);
        gestureCropImageView3.setImageUri(uri, uri2);
        GestureCropImageView gestureCropImageView4 = this.gestureCropImageView;
        if (gestureCropImageView4 == null) {
            kotlin.jvm.internal.f0.S("gestureCropImageView");
        } else {
            gestureCropImageView2 = gestureCropImageView4;
        }
        gestureCropImageView2.setImageToWrapCropBounds(true);
    }

    public final boolean needReport() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50764, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : !kotlin.jvm.internal.f0.g(this.createDraftReport, getDraft());
    }

    public final boolean needSaveDraft() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50763, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return this.remotePicNum == 0 && !kotlin.jvm.internal.f0.g(this.createDraft, getDraft());
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@dl.d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 50698, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(context, "context");
        super.onAttach(context);
        this.parentActivity = getActivity();
    }

    @Override // androidx.fragment.app.Fragment
    @dl.e
    public View onCreateView(@dl.d LayoutInflater inflater, @dl.e ViewGroup viewGroup, @dl.e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inflater, viewGroup, bundle}, this, changeQuickRedirect, false, 50697, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(inflater, "inflater");
        UcpItemImageEditorBinding ucpItemImageEditorBindingInflate = UcpItemImageEditorBinding.inflate(inflater);
        kotlin.jvm.internal.f0.o(ucpItemImageEditorBindingInflate, "inflate(...)");
        this.binding = ucpItemImageEditorBindingInflate;
        if (ucpItemImageEditorBindingInflate == null) {
            kotlin.jvm.internal.f0.S("binding");
            ucpItemImageEditorBindingInflate = null;
        }
        return ucpItemImageEditorBindingInflate.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50701, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        getEventHandler().removeCallbacksAndMessages(null);
        clearTempCacheFile();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50699, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDetach();
        this.parentActivity = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50715, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStop();
        GestureCropImageView gestureCropImageView = this.gestureCropImageView;
        if (gestureCropImageView == null) {
            kotlin.jvm.internal.f0.S("gestureCropImageView");
            gestureCropImageView = null;
        }
        gestureCropImageView.cancelAllAnimations();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@dl.d View view, @dl.e Bundle bundle) throws Throwable {
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 50700, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(view, "view");
        super.onViewCreated(view, bundle);
        bindViews();
        getArgumentInfo();
        initViews();
        UCropPlusActivity uCropPlusActivity = getUCropPlusActivity();
        if (uCropPlusActivity != null && uCropPlusActivity.getOnlyCrop()) {
            z10 = true;
        }
        if (z10) {
            Context contextRequireContext = requireContext();
            kotlin.jvm.internal.f0.o(contextRequireContext, "requireContext(...)");
            this.loadingDialog = new LoadingDialog(contextRequireContext).r();
        }
    }

    public final void postScale(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, 50722, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        GestureCropImageView gestureCropImageView = this.gestureCropImageView;
        GestureCropImageView gestureCropImageView2 = null;
        if (gestureCropImageView == null) {
            kotlin.jvm.internal.f0.S("gestureCropImageView");
            gestureCropImageView = null;
        }
        GestureCropImageView gestureCropImageView3 = this.gestureCropImageView;
        if (gestureCropImageView3 == null) {
            kotlin.jvm.internal.f0.S("gestureCropImageView");
            gestureCropImageView3 = null;
        }
        float fCenterX = gestureCropImageView3.getCropRect().centerX();
        GestureCropImageView gestureCropImageView4 = this.gestureCropImageView;
        if (gestureCropImageView4 == null) {
            kotlin.jvm.internal.f0.S("gestureCropImageView");
            gestureCropImageView4 = null;
        }
        gestureCropImageView.postScale(f10, fCenterX, gestureCropImageView4.getCropRect().centerY());
        GestureCropImageView gestureCropImageView5 = this.gestureCropImageView;
        if (gestureCropImageView5 == null) {
            kotlin.jvm.internal.f0.S("gestureCropImageView");
        } else {
            gestureCropImageView2 = gestureCropImageView5;
        }
        gestureCropImageView2.setCropBoundsFitImage(true);
    }

    public final void recoverStateInfoBeforeOpenWindow() throws InterruptedException {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50719, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        getStickerView().reset();
        setTickerInfo(this.stickerInfoBeforeOpenWindow);
    }

    public final void refreshCurrentStickerInfo() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50718, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.stickerInfoBeforeOpenWindow = ModuleUtil.INSTANCE.copyList(getStickerInfoList());
        getStickerView().getLabelStickerItemStack().removeAllElements();
    }

    public final void requestRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50741, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        getStickerView().refreshTextLayout();
        getStickerView().postInvalidate();
    }

    public final void resetImageModule(@dl.e ImageModuleObj imageModuleObj) throws Exception {
        float fP;
        PuzzleDataObj puzzle_data;
        PuzzleDataObj puzzle_data2;
        if (PatchProxy.proxy(new Object[]{imageModuleObj}, this, changeQuickRedirect, false, 50757, new Class[]{ImageModuleObj.class}, Void.TYPE).isSupported || imageModuleObj == null) {
            return;
        }
        this.type = "1";
        this.imageModule = imageModuleObj;
        setModuleInput();
        resetCacheFile();
        GestureCropImageView gestureCropImageView = this.gestureCropImageView;
        String height = null;
        if (gestureCropImageView == null) {
            kotlin.jvm.internal.f0.S("gestureCropImageView");
            gestureCropImageView = null;
        }
        gestureCropImageView.reset();
        GestureCropImageView gestureCropImageView2 = this.gestureCropImageView;
        if (gestureCropImageView2 == null) {
            kotlin.jvm.internal.f0.S("gestureCropImageView");
            gestureCropImageView2 = null;
        }
        Uri uri = this.inputUri;
        kotlin.jvm.internal.f0.m(uri);
        Uri uri2 = this.cacheUri;
        kotlin.jvm.internal.f0.m(uri2);
        gestureCropImageView2.setImageUri(uri, uri2);
        GestureCropImageView gestureCropImageView3 = this.gestureCropImageView;
        if (gestureCropImageView3 == null) {
            kotlin.jvm.internal.f0.S("gestureCropImageView");
            gestureCropImageView3 = null;
        }
        gestureCropImageView3.setImageToWrapCropBounds(false);
        getStickerView().reset();
        float f10 = 375;
        ImageModuleObj imageModuleObj2 = this.imageModule;
        if (com.max.hbcommon.utils.c.u((imageModuleObj2 == null || (puzzle_data2 = imageModuleObj2.getPuzzle_data()) == null) ? null : puzzle_data2.getHeight())) {
            fP = 500.0f;
        } else {
            ImageModuleObj imageModuleObj3 = this.imageModule;
            if (imageModuleObj3 != null && (puzzle_data = imageModuleObj3.getPuzzle_data()) != null) {
                height = puzzle_data.getHeight();
            }
            fP = com.max.hbutils.utils.n.p(height);
        }
        checkRatio(Float.valueOf(f10 / fP));
        addModuleData();
    }

    public final void rotateByAngle(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 50721, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        GestureCropImageView gestureCropImageView = this.gestureCropImageView;
        GestureCropImageView gestureCropImageView2 = null;
        if (gestureCropImageView == null) {
            kotlin.jvm.internal.f0.S("gestureCropImageView");
            gestureCropImageView = null;
        }
        gestureCropImageView.postRotate(i10);
        GestureCropImageView gestureCropImageView3 = this.gestureCropImageView;
        if (gestureCropImageView3 == null) {
            kotlin.jvm.internal.f0.S("gestureCropImageView");
        } else {
            gestureCropImageView2 = gestureCropImageView3;
        }
        gestureCropImageView2.fitCropBoundsAndImage();
    }

    @dl.e
    public final Object save(@dl.d kotlin.coroutines.c<? super Boolean> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 50761, new Class[]{kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : kotlinx.coroutines.i.h(e1.c(), new C13362(null), cVar);
    }

    public final void saveCurrentState() throws IOException {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50708, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ImageCropState imageCropState = this.cachedImageState;
        GestureCropImageView gestureCropImageView = this.gestureCropImageView;
        GestureCropImageView gestureCropImageView2 = null;
        if (gestureCropImageView == null) {
            kotlin.jvm.internal.f0.S("gestureCropImageView");
            gestureCropImageView = null;
        }
        imageCropState.setRotateAngle(gestureCropImageView.getCurrentAngle());
        ImageCropState imageCropState2 = this.cachedImageState;
        GestureCropImageView gestureCropImageView3 = this.gestureCropImageView;
        if (gestureCropImageView3 == null) {
            kotlin.jvm.internal.f0.S("gestureCropImageView");
            gestureCropImageView3 = null;
        }
        imageCropState2.setScale(gestureCropImageView3.getCurrentScale());
        ImageCropState imageCropState3 = this.cachedImageState;
        GestureCropImageView gestureCropImageView4 = this.gestureCropImageView;
        if (gestureCropImageView4 == null) {
            kotlin.jvm.internal.f0.S("gestureCropImageView");
            gestureCropImageView4 = null;
        }
        imageCropState3.setRatio(gestureCropImageView4.getTargetAspectRatio());
        ImageCropState imageCropState4 = this.cachedImageState;
        GestureCropImageView gestureCropImageView5 = this.gestureCropImageView;
        if (gestureCropImageView5 == null) {
            kotlin.jvm.internal.f0.S("gestureCropImageView");
        } else {
            gestureCropImageView2 = gestureCropImageView5;
        }
        Matrix mCurrentImageMatrix = gestureCropImageView2.mCurrentImageMatrix;
        kotlin.jvm.internal.f0.o(mCurrentImageMatrix, "mCurrentImageMatrix");
        float[] fArr = new float[9];
        mCurrentImageMatrix.getValues(fArr);
        imageCropState4.setMatrix(fArr);
        if (getContext() == null || this.cacheUri == null || this.draftUri == null) {
            return;
        }
        Context contextRequireContext = requireContext();
        Uri uri = this.cacheUri;
        kotlin.jvm.internal.f0.m(uri);
        Uri uri2 = this.draftUri;
        kotlin.jvm.internal.f0.m(uri2);
        FileUtils.copyFile(contextRequireContext, uri, uri2);
    }

    @dl.e
    public final Object saveDraft(@dl.d kotlin.coroutines.c<? super Draft> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 50762, new Class[]{kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : kotlinx.coroutines.i.h(e1.c(), new C13372(null), cVar);
    }

    public final void setEditMode(@dl.d EDIT_MODE edit_mode) {
        if (PatchProxy.proxy(new Object[]{edit_mode}, this, changeQuickRedirect, false, 50690, new Class[]{EDIT_MODE.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(edit_mode, "<set-?>");
        this.editMode = edit_mode;
    }

    public final void setFilter(@dl.e ImageFilterInfo imageFilterInfo) {
        if (PatchProxy.proxy(new Object[]{imageFilterInfo}, this, changeQuickRedirect, false, 50725, new Class[]{ImageFilterInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        GestureCropImageView gestureCropImageView = this.gestureCropImageView;
        if (gestureCropImageView == null) {
            kotlin.jvm.internal.f0.S("gestureCropImageView");
            gestureCropImageView = null;
        }
        gestureCropImageView.setFilter(imageFilterInfo);
    }

    public final void setInputUris(@dl.d ArrayList<Uri> arrayList) {
        if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 50694, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(arrayList, "<set-?>");
        this.inputUris = arrayList;
    }

    public final void setOutputUri(@dl.e Uri uri) {
        this.outputUri = uri;
    }

    public final void setStickerView(@dl.d StickerView stickerView) {
        if (PatchProxy.proxy(new Object[]{stickerView}, this, changeQuickRedirect, false, 50692, new Class[]{StickerView.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(stickerView, "<set-?>");
        this.stickerView = stickerView;
    }

    public final void setTargetAspectRatio(int i10, int i11, boolean z10) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 50723, new Class[]{cls, cls, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        GestureCropImageView gestureCropImageView = null;
        if (i11 == 0) {
            GestureCropImageView gestureCropImageView2 = this.gestureCropImageView;
            if (gestureCropImageView2 == null) {
                kotlin.jvm.internal.f0.S("gestureCropImageView");
            } else {
                gestureCropImageView = gestureCropImageView2;
            }
            gestureCropImageView.setTargetAspectRatio(0.0f);
            this.cachedImageState.setRatio(0.0f);
            com.max.heybox.hblog.g.f74531b.v('[' + this.TAG + "][setTargetAspectRatio] targetYAspect cannot be zero!");
            return;
        }
        float f10 = i10 / i11;
        if (i11 == -1) {
            OverlayView overlayView = this.overlayView;
            if (overlayView == null) {
                kotlin.jvm.internal.f0.S("overlayView");
                overlayView = null;
            }
            overlayView.setFreestyleCropMode(2);
        } else {
            OverlayView overlayView2 = this.overlayView;
            if (overlayView2 == null) {
                kotlin.jvm.internal.f0.S("overlayView");
                overlayView2 = null;
            }
            overlayView2.setFreestyleCropMode(0);
        }
        GestureCropImageView gestureCropImageView3 = this.gestureCropImageView;
        if (gestureCropImageView3 == null) {
            kotlin.jvm.internal.f0.S("gestureCropImageView");
            gestureCropImageView3 = null;
        }
        gestureCropImageView3.setTargetAspectRatio(f10);
        this.cachedImageState.setRatio(f10);
        if (z10) {
            GestureCropImageView gestureCropImageView4 = this.gestureCropImageView;
            if (gestureCropImageView4 == null) {
                kotlin.jvm.internal.f0.S("gestureCropImageView");
            } else {
                gestureCropImageView = gestureCropImageView4;
            }
            gestureCropImageView.setImageToWrapCropBounds(z10);
        }
    }

    public final void switchEditMode(@dl.d EDIT_MODE mode) throws Exception {
        if (PatchProxy.proxy(new Object[]{mode}, this, changeQuickRedirect, false, 50736, new Class[]{EDIT_MODE.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(mode, "mode");
        if (this.editMode == mode) {
            return;
        }
        GestureCropImageView gestureCropImageView = this.gestureCropImageView;
        View view = null;
        OverlayView overlayView = null;
        OverlayView overlayView2 = null;
        if (gestureCropImageView == null) {
            kotlin.jvm.internal.f0.S("gestureCropImageView");
            gestureCropImageView = null;
        }
        gestureCropImageView.enableFilter = true;
        int i10 = WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
        if (i10 == 1) {
            OverlayView overlayView3 = this.overlayView;
            if (overlayView3 == null) {
                kotlin.jvm.internal.f0.S("overlayView");
                overlayView3 = null;
            }
            overlayView3.setShowCropLayer(false);
            GestureCropImageView gestureCropImageView2 = this.gestureCropImageView;
            if (gestureCropImageView2 == null) {
                kotlin.jvm.internal.f0.S("gestureCropImageView");
                gestureCropImageView2 = null;
            }
            gestureCropImageView2.setScrollEnable(false);
            GestureCropImageView gestureCropImageView3 = this.gestureCropImageView;
            if (gestureCropImageView3 == null) {
                kotlin.jvm.internal.f0.S("gestureCropImageView");
                gestureCropImageView3 = null;
            }
            gestureCropImageView3.setScaleEnabled(false);
            View view2 = this.blockingView;
            if (view2 == null) {
                kotlin.jvm.internal.f0.S("blockingView");
            } else {
                view = view2;
            }
            view.setClickable(true);
        } else if (i10 == 2) {
            GestureCropImageView gestureCropImageView4 = this.gestureCropImageView;
            if (gestureCropImageView4 == null) {
                kotlin.jvm.internal.f0.S("gestureCropImageView");
                gestureCropImageView4 = null;
            }
            gestureCropImageView4.setScrollEnable(true);
            GestureCropImageView gestureCropImageView5 = this.gestureCropImageView;
            if (gestureCropImageView5 == null) {
                kotlin.jvm.internal.f0.S("gestureCropImageView");
                gestureCropImageView5 = null;
            }
            gestureCropImageView5.setRotateEnabled(false);
            GestureCropImageView gestureCropImageView6 = this.gestureCropImageView;
            if (gestureCropImageView6 == null) {
                kotlin.jvm.internal.f0.S("gestureCropImageView");
                gestureCropImageView6 = null;
            }
            gestureCropImageView6.setScaleEnabled(true);
            GestureCropImageView gestureCropImageView7 = this.gestureCropImageView;
            if (gestureCropImageView7 == null) {
                kotlin.jvm.internal.f0.S("gestureCropImageView");
                gestureCropImageView7 = null;
            }
            gestureCropImageView7.enableFilter = false;
            View view3 = this.blockingView;
            if (view3 == null) {
                kotlin.jvm.internal.f0.S("blockingView");
                view3 = null;
            }
            view3.setClickable(false);
            loadOriginImage();
            OverlayView overlayView4 = this.overlayView;
            if (overlayView4 == null) {
                kotlin.jvm.internal.f0.S("overlayView");
            } else {
                overlayView2 = overlayView4;
            }
            overlayView2.setShowCropLayer(true);
        } else if (i10 == 3) {
            GestureCropImageView gestureCropImageView8 = this.gestureCropImageView;
            if (gestureCropImageView8 == null) {
                kotlin.jvm.internal.f0.S("gestureCropImageView");
                gestureCropImageView8 = null;
            }
            gestureCropImageView8.setScrollEnable(false);
            View view4 = this.blockingView;
            if (view4 == null) {
                kotlin.jvm.internal.f0.S("blockingView");
                view4 = null;
            }
            view4.setClickable(true);
            OverlayView overlayView5 = this.overlayView;
            if (overlayView5 == null) {
                kotlin.jvm.internal.f0.S("overlayView");
            } else {
                overlayView = overlayView5;
            }
            overlayView.setShowCropLayer(false);
        }
        getStickerView().setEditMode(mode);
        this.editMode = mode;
    }

    public final void updateTextSticker(@dl.d String text) {
        if (PatchProxy.proxy(new Object[]{text}, this, changeQuickRedirect, false, 50739, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(text, "text");
        getStickerView().updateTextSticker(text);
        getStickerView().postInvalidate();
    }
}
