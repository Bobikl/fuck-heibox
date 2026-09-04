package com.max.xiaoheihe.module.bbs.post_edit.post_setting;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import androidx.core.view.j1;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.y0;
import androidx.lifecycle.z;
import com.google.gson.JsonObject;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.k;
import com.max.hbutils.utils.x;
import com.max.heybox.hblog.g;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.accelworld.AccelWorldStringKt;
import com.max.xiaoheihe.bean.bbs.post_edit.PostCompilationItemObj;
import com.max.xiaoheihe.module.bbs.post_edit.PictureVideoEditPostFragment;
import com.max.xiaoheihe.module.bbs.post_edit.PostTabActivity;
import com.max.xiaoheihe.module.bbs.post_edit.PostTabActivityViewModel;
import com.max.xiaoheihe.network.i;
import com.max.xiaoheihe.utils.imageviewer.ImageViewerHelper;
import com.max.xiaoheihe.utils.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.UCrop;
import com.starlightc.ucropplus.model.CropRatioInfo;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import df.c6;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.s;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.t0;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: PostCompilationCreateDialogFragment.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class PostCompilationCreateDialogFragment extends com.max.hbcommon.base.swipeback.a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    public static final a f83049o = new a(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f83050p = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.e
    private ActivityPostSettingViewModel f83051j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.e
    private PostTabActivityViewModel f83052k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private c6 f83053l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.e
    private String f83054m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.e
    private LoadingDialog f83055n;

    /* JADX INFO: compiled from: PostCompilationCreateDialogFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final PostCompilationCreateDialogFragment a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30967, new Class[0], PostCompilationCreateDialogFragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (PostCompilationCreateDialogFragment) patchProxyResultProxy.result;
            }
            PostCompilationCreateDialogFragment postCompilationCreateDialogFragment = new PostCompilationCreateDialogFragment();
            postCompilationCreateDialogFragment.setArguments(androidx.core.os.e.a());
            return postCompilationCreateDialogFragment;
        }
    }

    /* JADX INFO: compiled from: PostCompilationCreateDialogFragment.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<JsonObject>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f83057c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f83058d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f83059e;

        b(String str, String str2, String str3) {
            this.f83057c = str;
            this.f83058d = str2;
            this.f83059e = str3;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 30968, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (PostCompilationCreateDialogFragment.this.isActive()) {
                super.onError(e10);
                PostCompilationCreateDialogFragment.this.dismiss();
            }
        }

        public void onNext(@dl.d Result<JsonObject> result) {
            Object objB;
            boolean z10 = true;
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 30969, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (PostCompilationCreateDialogFragment.this.isActive()) {
                try {
                    kotlin.Result.a aVar = kotlin.Result.f124476c;
                    objB = kotlin.Result.b(k.d(result.getResult(), "obj_id"));
                } catch (Throwable th2) {
                    kotlin.Result.a aVar2 = kotlin.Result.f124476c;
                    objB = kotlin.Result.b(t0.a(th2));
                }
                if (kotlin.Result.i(objB)) {
                    objB = null;
                }
                String str = (String) objB;
                ActivityPostSettingViewModel activityPostSettingViewModel = PostCompilationCreateDialogFragment.this.f83051j;
                if (activityPostSettingViewModel != null) {
                    activityPostSettingViewModel.v(str);
                }
                if (str != null && str.length() != 0) {
                    z10 = false;
                }
                if (z10) {
                    g.f74531b.v("[PostCompilationCreateDialogFragment][createPostCompilation]\nresult: " + result);
                } else {
                    PostCompilationCreateDialogFragment postCompilationCreateDialogFragment = PostCompilationCreateDialogFragment.this;
                    f0.m(str);
                    PostCompilationCreateDialogFragment.c4(postCompilationCreateDialogFragment, str, this.f83057c, this.f83058d, this.f83059e);
                }
                PostCompilationCreateDialogFragment.this.dismiss();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 30970, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<JsonObject>) obj);
        }
    }

    /* JADX INFO: compiled from: PostCompilationCreateDialogFragment.kt */
    @kotlin.jvm.internal.t0({"SMAP\nPostCompilationCreateDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostCompilationCreateDialogFragment.kt\ncom/max/xiaoheihe/module/bbs/post_edit/post_setting/PostCompilationCreateDialogFragment$initView$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,310:1\n262#2,2:311\n262#2,2:313\n262#2,2:315\n*S KotlinDebug\n*F\n+ 1 PostCompilationCreateDialogFragment.kt\ncom/max/xiaoheihe/module/bbs/post_edit/post_setting/PostCompilationCreateDialogFragment$initView$1\n*L\n94#1:311,2\n95#1:313,2\n97#1:315,2\n*E\n"})
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 30971, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            c6 c6Var = null;
            PostCompilationCreateDialogFragment.this.f83054m = null;
            c6 c6Var2 = PostCompilationCreateDialogFragment.this.f83053l;
            if (c6Var2 == null) {
                f0.S("binding");
                c6Var2 = null;
            }
            ImageView imageView = c6Var2.f109166f;
            f0.o(imageView, "binding.ivAdd");
            imageView.setVisibility(0);
            c6 c6Var3 = PostCompilationCreateDialogFragment.this.f83053l;
            if (c6Var3 == null) {
                f0.S("binding");
                c6Var3 = null;
            }
            ImageView imageView2 = c6Var3.f109168h;
            f0.o(imageView2, "binding.ivImg");
            imageView2.setVisibility(8);
            c6 c6Var4 = PostCompilationCreateDialogFragment.this.f83053l;
            if (c6Var4 == null) {
                f0.S("binding");
                c6Var4 = null;
            }
            c6Var4.f109168h.setImageDrawable(null);
            c6 c6Var5 = PostCompilationCreateDialogFragment.this.f83053l;
            if (c6Var5 == null) {
                f0.S("binding");
            } else {
                c6Var = c6Var5;
            }
            ImageView imageView3 = c6Var.f109167g;
            f0.o(imageView3, "binding.ivClear");
            imageView3.setVisibility(8);
        }
    }

    /* JADX INFO: compiled from: PostCompilationCreateDialogFragment.kt */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            boolean z10 = true;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 30972, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            String str = PostCompilationCreateDialogFragment.this.f83054m;
            if (str != null && str.length() != 0) {
                z10 = false;
            }
            if (z10) {
                PostCompilationCreateDialogFragment.g4(PostCompilationCreateDialogFragment.this);
            } else {
                PostCompilationCreateDialogFragment.f4(PostCompilationCreateDialogFragment.this, str);
            }
        }
    }

    /* JADX INFO: compiled from: PostCompilationCreateDialogFragment.kt */
    public static final class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 30973, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            c6 c6Var = PostCompilationCreateDialogFragment.this.f83053l;
            c6 c6Var2 = null;
            if (c6Var == null) {
                f0.S("binding");
                c6Var = null;
            }
            String string = c6Var.f109164d.getText().toString();
            c6 c6Var3 = PostCompilationCreateDialogFragment.this.f83053l;
            if (c6Var3 == null) {
                f0.S("binding");
            } else {
                c6Var2 = c6Var3;
            }
            String string2 = c6Var2.f109165e.getText().toString();
            String str = PostCompilationCreateDialogFragment.this.f83054m;
            if (PostCompilationCreateDialogFragment.V3(PostCompilationCreateDialogFragment.this, string, string2, str)) {
                PostCompilationCreateDialogFragment.W3(PostCompilationCreateDialogFragment.this, string, string2, str);
            }
        }
    }

    /* JADX INFO: compiled from: PostCompilationCreateDialogFragment.kt */
    public static final class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 30974, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            PostCompilationCreateDialogFragment.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.post_edit.post_setting.PostCompilationCreateDialogFragment$onActivityResult$1, reason: invalid class name */
    /* JADX INFO: compiled from: PostCompilationCreateDialogFragment.kt */
    @kotlin.jvm.internal.t0({"SMAP\nPostCompilationCreateDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostCompilationCreateDialogFragment.kt\ncom/max/xiaoheihe/module/bbs/post_edit/post_setting/PostCompilationCreateDialogFragment$onActivityResult$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,310:1\n262#2,2:311\n262#2,2:313\n262#2,2:315\n262#2,2:317\n262#2,2:319\n262#2,2:321\n*S KotlinDebug\n*F\n+ 1 PostCompilationCreateDialogFragment.kt\ncom/max/xiaoheihe/module/bbs/post_edit/post_setting/PostCompilationCreateDialogFragment$onActivityResult$1\n*L\n271#1:311,2\n272#1:313,2\n273#1:315,2\n281#1:317,2\n282#1:319,2\n283#1:321,2\n*E\n"})
    @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.bbs.post_edit.post_setting.PostCompilationCreateDialogFragment$onActivityResult$1", f = "PostCompilationCreateDialogFragment.kt", i = {}, l = {bb.c.b.D2}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f83064b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f83065c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList<Uri> f83066d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ PostCompilationCreateDialogFragment f83067e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ FragmentActivity f83068f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ArrayList<Uri> arrayList, PostCompilationCreateDialogFragment postCompilationCreateDialogFragment, FragmentActivity fragmentActivity, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f83066d = arrayList;
            this.f83067e = postCompilationCreateDialogFragment;
            this.f83068f = fragmentActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 30976, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            if (patchProxyResultProxy.isSupported) {
                return (kotlin.coroutines.c) patchProxyResultProxy.result;
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f83066d, this.f83067e, this.f83068f, cVar);
            anonymousClass1.f83065c = obj;
            return anonymousClass1;
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 30978, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 30977, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        /* JADX WARN: Code duplicated, block: B:56:0x0113 A[Catch: all -> 0x0157, TryCatch #0 {all -> 0x0157, blocks: (B:10:0x002d, B:63:0x013d, B:65:0x0145, B:66:0x0148, B:15:0x0047, B:17:0x004c, B:19:0x0054, B:24:0x0066, B:26:0x006c, B:27:0x0070, B:29:0x007e, B:30:0x0082, B:32:0x0090, B:34:0x0095, B:36:0x00a0, B:38:0x00bb, B:39:0x00bf, B:41:0x00cd, B:42:0x00d1, B:44:0x00df, B:45:0x00e3, B:47:0x00f5, B:48:0x00f9, B:50:0x0104, B:52:0x010a, B:59:0x0124, B:56:0x0113, B:58:0x0121), top: B:72:0x0025 }] */
        /* JADX WARN: Code duplicated, block: B:58:0x0121 A[Catch: all -> 0x0157, TryCatch #0 {all -> 0x0157, blocks: (B:10:0x002d, B:63:0x013d, B:65:0x0145, B:66:0x0148, B:15:0x0047, B:17:0x004c, B:19:0x0054, B:24:0x0066, B:26:0x006c, B:27:0x0070, B:29:0x007e, B:30:0x0082, B:32:0x0090, B:34:0x0095, B:36:0x00a0, B:38:0x00bb, B:39:0x00bf, B:41:0x00cd, B:42:0x00d1, B:44:0x00df, B:45:0x00e3, B:47:0x00f5, B:48:0x00f9, B:50:0x0104, B:52:0x010a, B:59:0x0124, B:56:0x0113, B:58:0x0121), top: B:72:0x0025 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            LoadingDialog loadingDialog;
            PostCompilationCreateDialogFragment postCompilationCreateDialogFragment;
            Uri uri;
            boolean z10 = false;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 30975, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f83064b;
            try {
                if (i10 == 0) {
                    t0.n(obj);
                    ArrayList<Uri> arrayList = this.f83066d;
                    PostCompilationCreateDialogFragment postCompilationCreateDialogFragment2 = this.f83067e;
                    FragmentActivity fragmentActivity = this.f83068f;
                    kotlin.Result.a aVar = kotlin.Result.f124476c;
                    c6 c6Var = null;
                    String path = (arrayList == null || (uri = (Uri) CollectionsKt___CollectionsKt.R2(arrayList, 0)) == null) ? null : uri.getPath();
                    if (path == null) {
                        c6 c6Var2 = postCompilationCreateDialogFragment2.f83053l;
                        if (c6Var2 == null) {
                            f0.S("binding");
                            c6Var2 = null;
                        }
                        ImageView imageView = c6Var2.f109166f;
                        f0.o(imageView, "binding.ivAdd");
                        imageView.setVisibility(0);
                        c6 c6Var3 = postCompilationCreateDialogFragment2.f83053l;
                        if (c6Var3 == null) {
                            f0.S("binding");
                            c6Var3 = null;
                        }
                        ImageView imageView2 = c6Var3.f109168h;
                        f0.o(imageView2, "binding.ivImg");
                        imageView2.setVisibility(8);
                        c6 c6Var4 = postCompilationCreateDialogFragment2.f83053l;
                        if (c6Var4 == null) {
                            f0.S("binding");
                        } else {
                            c6Var = c6Var4;
                        }
                        ImageView imageView3 = c6Var.f109167g;
                        f0.o(imageView3, "binding.ivClear");
                        imageView3.setVisibility(8);
                        return b2.f124493a;
                    }
                    File file = new File(path);
                    postCompilationCreateDialogFragment2.requireActivity().revokeUriPermission(com.max.xiaoheihe.utils.d.w0(postCompilationCreateDialogFragment2.requireActivity(), file), 2);
                    c6 c6Var5 = postCompilationCreateDialogFragment2.f83053l;
                    if (c6Var5 == null) {
                        f0.S("binding");
                        c6Var5 = null;
                    }
                    ImageView imageView4 = c6Var5.f109166f;
                    f0.o(imageView4, "binding.ivAdd");
                    imageView4.setVisibility(8);
                    c6 c6Var6 = postCompilationCreateDialogFragment2.f83053l;
                    if (c6Var6 == null) {
                        f0.S("binding");
                        c6Var6 = null;
                    }
                    ImageView imageView5 = c6Var6.f109168h;
                    f0.o(imageView5, "binding.ivImg");
                    imageView5.setVisibility(0);
                    c6 c6Var7 = postCompilationCreateDialogFragment2.f83053l;
                    if (c6Var7 == null) {
                        f0.S("binding");
                        c6Var7 = null;
                    }
                    ImageView imageView6 = c6Var7.f109167g;
                    f0.o(imageView6, "binding.ivClear");
                    imageView6.setVisibility(0);
                    String path2 = file.getPath();
                    c6 c6Var8 = postCompilationCreateDialogFragment2.f83053l;
                    if (c6Var8 == null) {
                        f0.S("binding");
                        c6Var8 = null;
                    }
                    com.max.hbimage.b.K(path2, c6Var8.f109168h);
                    if (postCompilationCreateDialogFragment2.f83055n == null) {
                        postCompilationCreateDialogFragment2.f83055n = new LoadingDialog(fragmentActivity, null, true);
                        loadingDialog = postCompilationCreateDialogFragment2.f83055n;
                        if (loadingDialog != null) {
                            loadingDialog.r();
                        }
                    } else {
                        LoadingDialog loadingDialog2 = postCompilationCreateDialogFragment2.f83055n;
                        if (loadingDialog2 != null && loadingDialog2.i()) {
                            z10 = true;
                        }
                        if (!z10) {
                            postCompilationCreateDialogFragment2.f83055n = new LoadingDialog(fragmentActivity, null, true);
                            loadingDialog = postCompilationCreateDialogFragment2.f83055n;
                            if (loadingDialog != null) {
                                loadingDialog.r();
                            }
                        }
                    }
                    io.reactivex.disposables.a compositeDisposable = postCompilationCreateDialogFragment2.getCompositeDisposable();
                    f0.o(compositeDisposable, "compositeDisposable");
                    List listK = s.k(file);
                    this.f83065c = postCompilationCreateDialogFragment2;
                    this.f83064b = 1;
                    obj = com.max.xiaoheihe.accelworld.b.i(fragmentActivity, compositeDisposable, listK, this);
                    if (obj == objH) {
                        return objH;
                    }
                    postCompilationCreateDialogFragment = postCompilationCreateDialogFragment2;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    postCompilationCreateDialogFragment = (PostCompilationCreateDialogFragment) this.f83065c;
                    t0.n(obj);
                }
                List list = (List) obj;
                LoadingDialog loadingDialog3 = postCompilationCreateDialogFragment.f83055n;
                if (loadingDialog3 != null) {
                    loadingDialog3.c();
                }
                postCompilationCreateDialogFragment.f83054m = (String) CollectionsKt___CollectionsKt.B2(list);
                kotlin.Result.b(b2.f124493a);
            } catch (Throwable th2) {
                kotlin.Result.a aVar2 = kotlin.Result.f124476c;
                kotlin.Result.b(t0.a(th2));
            }
            return b2.f124493a;
        }
    }

    public static final /* synthetic */ boolean V3(PostCompilationCreateDialogFragment postCompilationCreateDialogFragment, String str, String str2, String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{postCompilationCreateDialogFragment, str, str2, str3}, null, changeQuickRedirect, true, 30965, new Class[]{PostCompilationCreateDialogFragment.class, String.class, String.class, String.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : postCompilationCreateDialogFragment.h4(str, str2, str3);
    }

    public static final /* synthetic */ void W3(PostCompilationCreateDialogFragment postCompilationCreateDialogFragment, String str, String str2, String str3) {
        if (PatchProxy.proxy(new Object[]{postCompilationCreateDialogFragment, str, str2, str3}, null, changeQuickRedirect, true, 30966, new Class[]{PostCompilationCreateDialogFragment.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        postCompilationCreateDialogFragment.i4(str, str2, str3);
    }

    public static final /* synthetic */ void X3(PostCompilationCreateDialogFragment postCompilationCreateDialogFragment, ArrayList arrayList, Context context) {
        if (PatchProxy.proxy(new Object[]{postCompilationCreateDialogFragment, arrayList, context}, null, changeQuickRedirect, true, 30964, new Class[]{PostCompilationCreateDialogFragment.class, ArrayList.class, Context.class}, Void.TYPE).isSupported) {
            return;
        }
        postCompilationCreateDialogFragment.j4(arrayList, context);
    }

    public static final /* synthetic */ void c4(PostCompilationCreateDialogFragment postCompilationCreateDialogFragment, String str, String str2, String str3, String str4) {
        if (PatchProxy.proxy(new Object[]{postCompilationCreateDialogFragment, str, str2, str3, str4}, null, changeQuickRedirect, true, 30963, new Class[]{PostCompilationCreateDialogFragment.class, String.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        postCompilationCreateDialogFragment.m4(str, str2, str3, str4);
    }

    public static final /* synthetic */ void f4(PostCompilationCreateDialogFragment postCompilationCreateDialogFragment, String str) {
        if (PatchProxy.proxy(new Object[]{postCompilationCreateDialogFragment, str}, null, changeQuickRedirect, true, 30962, new Class[]{PostCompilationCreateDialogFragment.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        postCompilationCreateDialogFragment.n4(str);
    }

    public static final /* synthetic */ void g4(PostCompilationCreateDialogFragment postCompilationCreateDialogFragment) {
        if (PatchProxy.proxy(new Object[]{postCompilationCreateDialogFragment}, null, changeQuickRedirect, true, 30961, new Class[]{PostCompilationCreateDialogFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        postCompilationCreateDialogFragment.o4();
    }

    private final boolean h4(String str, String str2, String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, 30953, new Class[]{String.class, String.class, String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (str2 == null || str2.length() == 0) {
            x.p("请输入合集标题");
            return false;
        }
        if (AccelWorldStringKt.c(str2) > 10) {
            x.p("合集标题字数10字以内");
            return false;
        }
        if (str3 == null || str3.length() == 0) {
            x.p("请添加合集封面");
            return false;
        }
        if (AccelWorldStringKt.c(str) <= 50) {
            return true;
        }
        x.p("合集简介字数50字以内");
        return false;
    }

    @SuppressLint({"AutoDispose"})
    private final void i4(String str, String str2, String str3) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, 30954, new Class[]{String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((b) i.a().ta(str, str2, str3).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b(str2, str, str3)));
    }

    private final void j4(ArrayList<Uri> arrayList, Context context) {
        if (PatchProxy.proxy(new Object[]{arrayList, context}, this, changeQuickRedirect, false, 30957, new Class[]{ArrayList.class, Context.class}, Void.TYPE).isSupported) {
            return;
        }
        File file = new File(PictureVideoEditPostFragment.g7(context));
        if (!file.exists()) {
            file.mkdirs();
        }
        UCrop uCropOf = UCrop.of(arrayList, Uri.fromFile(file));
        uCropOf.getCropIntent().putExtra(UCropPlusActivity.ARG_RATIO_LIST, CollectionsKt__CollectionsKt.r(new CropRatioInfo(90, 90, false, null, "封面", false)));
        uCropOf.getCropIntent().putExtra(UCropPlusActivity.ARG_ONLY_CROP, true);
        uCropOf.startWithType(requireActivity(), this, 1);
    }

    private final void k4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30952, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        c6 c6Var = this.f83053l;
        c6 c6Var2 = null;
        if (c6Var == null) {
            f0.S("binding");
            c6Var = null;
        }
        TextView textView = c6Var.f109170j;
        com.max.hbresource.a aVar = com.max.hbresource.a.f71893a;
        int i10 = com.max.hbresource.a.f71895c;
        textView.setTypeface(aVar.a(i10));
        c6 c6Var3 = this.f83053l;
        if (c6Var3 == null) {
            f0.S("binding");
            c6Var3 = null;
        }
        c6Var3.f109171k.setTypeface(aVar.a(i10));
        c6 c6Var4 = this.f83053l;
        if (c6Var4 == null) {
            f0.S("binding");
            c6Var4 = null;
        }
        c6Var4.f109167g.setOnClickListener(new c());
        c6 c6Var5 = this.f83053l;
        if (c6Var5 == null) {
            f0.S("binding");
            c6Var5 = null;
        }
        c6Var5.f109162b.setOnClickListener(new d());
        c6 c6Var6 = this.f83053l;
        if (c6Var6 == null) {
            f0.S("binding");
            c6Var6 = null;
        }
        BottomButtonLeftItemView bottomButtonLeftItemView = c6Var6.f109163c;
        bottomButtonLeftItemView.setRightClickListener(new e());
        bottomButtonLeftItemView.setLeftClickListener(new f());
        c6 c6Var7 = this.f83053l;
        if (c6Var7 == null) {
            f0.S("binding");
            c6Var7 = null;
        }
        c6Var7.f109165e.setFilters(new l[]{new l(10)});
        c6 c6Var8 = this.f83053l;
        if (c6Var8 == null) {
            f0.S("binding");
        } else {
            c6Var2 = c6Var8;
        }
        c6Var2.f109164d.setFilters(new l[]{new l(50)});
    }

    private final void l4() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30959, new Class[0], Void.TYPE).isSupported && Build.VERSION.SDK_INT > 29) {
            Dialog dialog = getDialog();
            c6 c6Var = null;
            bf.b bVar = new bf.b(dialog != null ? dialog.getWindow() : null, 0, 2, null);
            c6 c6Var2 = this.f83053l;
            if (c6Var2 == null) {
                f0.S("binding");
                c6Var2 = null;
            }
            j1.y2(c6Var2.b(), bVar);
            c6 c6Var3 = this.f83053l;
            if (c6Var3 == null) {
                f0.S("binding");
            } else {
                c6Var = c6Var3;
            }
            j1.a2(c6Var.b(), bVar);
        }
    }

    private final void m4(String str, String str2, String str3, String str4) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3, str4}, this, changeQuickRedirect, false, 30955, new Class[]{String.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        PostCompilationItemObj postCompilationItemObj = new PostCompilationItemObj(0, str2, str, null, str4, null, str3, null);
        ActivityPostSettingViewModel activityPostSettingViewModel = this.f83051j;
        if (activityPostSettingViewModel != null) {
            activityPostSettingViewModel.t(postCompilationItemObj);
        }
        Context context = getContext();
        if (context != null) {
            x.p(context.getString(R.string.success));
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("compilation_id", str);
        jsonObject.addProperty("compilation_title", str2);
        com.max.hbcommon.analytics.d.d("4", lb.d.f131122a1, null, jsonObject);
    }

    private final void n4(String str) {
        FragmentActivity activity;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 30958, new Class[]{String.class}, Void.TYPE).isSupported || (activity = getActivity()) == null) {
            return;
        }
        ImageViewerHelper.a.o(ImageViewerHelper.f95500a.a(activity), activity, new String[]{str}, null, 4, null).p();
    }

    private final void o4() {
        FragmentActivity activity;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30956, new Class[0], Void.TYPE).isSupported || (activity = getActivity()) == null) {
            return;
        }
        kotlinx.coroutines.k.f(z.a(this), null, null, new PostCompilationCreateDialogFragment$startSetCompilationCover$1(activity, this, null), 3, null);
    }

    @Override // androidx.fragment.app.Fragment
    @kotlin.k(message = "Deprecated in Java")
    public void onActivityResult(int i10, int i11, @dl.e Intent intent) {
        super.onActivityResult(i10, i11, intent);
        FragmentActivity activity = getActivity();
        if (activity != null && i11 == -1 && intent != null && i10 == 69) {
            kotlinx.coroutines.k.f(z.a(this), null, null, new AnonymousClass1(intent.getParcelableArrayListExtra("HEYBOX_UCROP.Multi_OutputUri"), this, activity, null), 3, null);
        }
    }

    @Override // com.max.hbcommon.base.c, androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onCreate(@dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 30949, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            this.f83051j = (ActivityPostSettingViewModel) new y0(activity).a(ActivityPostSettingViewModel.class);
            if (activity instanceof PostTabActivity) {
                this.f83052k = (PostTabActivityViewModel) new y0(activity).a(PostTabActivityViewModel.class);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    @dl.d
    public View onCreateView(@dl.d LayoutInflater inflater, @dl.e ViewGroup viewGroup, @dl.e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inflater, viewGroup, bundle}, this, changeQuickRedirect, false, 30950, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(inflater, "inflater");
        c6 c6VarC = c6.c(inflater);
        f0.o(c6VarC, "inflate(inflater)");
        this.f83053l = c6VarC;
        if (c6VarC == null) {
            f0.S("binding");
            c6VarC = null;
        }
        RelativeLayout relativeLayoutB = c6VarC.b();
        f0.o(relativeLayoutB, "binding.root");
        return relativeLayoutB;
    }

    @Override // androidx.fragment.app.j, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@dl.d DialogInterface dialog) {
        if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 30960, new Class[]{DialogInterface.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(dialog, "dialog");
        super.onDismiss(dialog);
        LoadingDialog loadingDialog = this.f83055n;
        if (loadingDialog != null) {
            loadingDialog.c();
        }
        PostTabActivityViewModel postTabActivityViewModel = this.f83052k;
        if (postTabActivityViewModel != null) {
            postTabActivityViewModel.E(false);
        }
        ActivityPostSettingViewModel activityPostSettingViewModel = this.f83051j;
        if (activityPostSettingViewModel != null) {
            activityPostSettingViewModel.u(1);
        }
    }

    @Override // com.max.hbcommon.base.swipeback.a, com.max.hbcommon.base.c, androidx.fragment.app.Fragment
    public void onViewCreated(@dl.d View view, @dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 30951, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "view");
        super.onViewCreated(view, bundle);
        k4();
        l4();
        PostTabActivityViewModel postTabActivityViewModel = this.f83052k;
        if (postTabActivityViewModel != null) {
            postTabActivityViewModel.E(true);
        }
    }
}
