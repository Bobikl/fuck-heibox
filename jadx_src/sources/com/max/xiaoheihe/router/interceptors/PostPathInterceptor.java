package com.max.xiaoheihe.router.interceptors;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.internal.LinkedTreeMap;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.MainActivity;
import com.max.xiaoheihe.bean.bbs.BBSTextObj;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.bean.bbs.GameCommentsObj;
import com.max.xiaoheihe.bean.bbs.HighLikeCommentObj;
import com.max.xiaoheihe.bean.bbs.LinkInfoObj;
import com.max.xiaoheihe.bean.bbs.PictureVideoLinkDraftObj;
import com.max.xiaoheihe.bean.bbs.PostDefaultInfoObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.bean.game.ShareGameCommentDataObj;
import com.max.xiaoheihe.module.bbs.post_edit.NewLinkEditFragment;
import com.max.xiaoheihe.module.bbs.post_edit.PictureVideoEditPostFragment;
import com.max.xiaoheihe.module.bbs.post_edit.PostTabActivity;
import com.max.xiaoheihe.module.bbs.post_edit.PostType;
import com.max.xiaoheihe.utils.ShareViewUtil;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.b2;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.r0;

/* JADX INFO: compiled from: PostPathInterceptor.kt */
/* JADX INFO: loaded from: classes13.dex */
@t0({"SMAP\nPostPathInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostPathInterceptor.kt\ncom/max/xiaoheihe/router/interceptors/PostPathInterceptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,446:1\n1855#2,2:447\n314#3,11:449\n*S KotlinDebug\n*F\n+ 1 PostPathInterceptor.kt\ncom/max/xiaoheihe/router/interceptors/PostPathInterceptor\n*L\n280#1:447,2\n367#1:449,11\n*E\n"})
@androidx.compose.runtime.internal.o(parameters = 0)
public final class PostPathInterceptor implements com.sankuai.waimai.router.core.h {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    public static final a f94917d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f94918e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f94919a = PostPathInterceptor.class.getSimpleName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private FrameLayout f94920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private com.max.hbutils.utils.b f94921c;

    /* JADX INFO: compiled from: PostPathInterceptor.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    public static final /* synthetic */ Object c(PostPathInterceptor postPathInterceptor, Context context, ShareGameCommentDataObj shareGameCommentDataObj, kotlin.coroutines.c cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{postPathInterceptor, context, shareGameCommentDataObj, cVar}, null, changeQuickRedirect, true, 48173, new Class[]{PostPathInterceptor.class, Context.class, ShareGameCommentDataObj.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : postPathInterceptor.g(context, shareGameCommentDataObj, cVar);
    }

    public static final /* synthetic */ void d(PostPathInterceptor postPathInterceptor, com.sankuai.waimai.router.core.i iVar, File file, String str, yh.a aVar) {
        if (PatchProxy.proxy(new Object[]{postPathInterceptor, iVar, file, str, aVar}, null, changeQuickRedirect, true, 48171, new Class[]{PostPathInterceptor.class, com.sankuai.waimai.router.core.i.class, File.class, String.class, yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        postPathInterceptor.i(iVar, file, str, aVar);
    }

    public static final /* synthetic */ Object e(PostPathInterceptor postPathInterceptor, Context context, ShareGameCommentDataObj shareGameCommentDataObj, kotlin.coroutines.c cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{postPathInterceptor, context, shareGameCommentDataObj, cVar}, null, changeQuickRedirect, true, 48172, new Class[]{PostPathInterceptor.class, Context.class, ShareGameCommentDataObj.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : postPathInterceptor.l(context, shareGameCommentDataObj, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0049  */
    private final Object g(Context context, ShareGameCommentDataObj shareGameCommentDataObj, kotlin.coroutines.c<? super File> cVar) throws Throwable {
        PostPathInterceptor$getGameCommentFile$1 postPathInterceptor$getGameCommentFile$1;
        Activity activityA;
        View contentView;
        PostPathInterceptor postPathInterceptor;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, shareGameCommentDataObj, cVar}, this, changeQuickRedirect, false, 48169, new Class[]{Context.class, ShareGameCommentDataObj.class, kotlin.coroutines.c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        if (cVar instanceof PostPathInterceptor$getGameCommentFile$1) {
            postPathInterceptor$getGameCommentFile$1 = (PostPathInterceptor$getGameCommentFile$1) cVar;
            int i10 = postPathInterceptor$getGameCommentFile$1.f94926f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                postPathInterceptor$getGameCommentFile$1.f94926f = i10 - Integer.MIN_VALUE;
            } else {
                postPathInterceptor$getGameCommentFile$1 = new PostPathInterceptor$getGameCommentFile$1(this, cVar);
            }
        } else {
            postPathInterceptor$getGameCommentFile$1 = new PostPathInterceptor$getGameCommentFile$1(this, cVar);
        }
        Object obj = postPathInterceptor$getGameCommentFile$1.f94924d;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = postPathInterceptor$getGameCommentFile$1.f94926f;
        if (i11 == 0) {
            kotlin.t0.n(obj);
            if (context instanceof Activity) {
                activityA = (Activity) context;
            } else {
                activityA = com.max.hbutils.utils.e.b().a();
                f0.o(activityA, "{\n            HeyboxActi…currentActivity\n        }");
            }
            Activity activity = activityA;
            GameObj game_info = shareGameCommentDataObj.getGame_info();
            GameCommentsObj share_info = shareGameCommentDataObj.getShare_info();
            BBSUserInfoObj user = shareGameCommentDataObj.getUser();
            LinkInfoObj comment_detail = shareGameCommentDataObj.getComment_detail();
            String description = comment_detail != null ? comment_detail.getDescription() : null;
            if (game_info != null && user != null) {
                String share_bg_img = !com.max.hbcommon.utils.c.u(game_info.getShare_bg_img()) ? game_info.getShare_bg_img() : game_info.getImage();
                FrameLayout frameLayout = this.f94920b;
                if (frameLayout != null) {
                    if (frameLayout != null) {
                        frameLayout.setClipChildren(false);
                    }
                    ScrollView scrollView = new ScrollView(activity);
                    FrameLayout frameLayout2 = this.f94920b;
                    if (frameLayout2 != null) {
                        scrollView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        frameLayout2.addView(scrollView, 0);
                    }
                    View viewB = ShareViewUtil.b(activity, scrollView, game_info.getMain_color(), share_bg_img, game_info.getScore(), game_info.getScore_desc(), game_info.getName(), game_info.getName_en(), user.getAvatar(), user.getUsername(), shareGameCommentDataObj.getUser_comment_score(), share_info != null ? share_info.getPlay_state() : null, description, shareGameCommentDataObj.getGame_impression_list());
                    viewB.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                    scrollView.addView(viewB);
                    scrollView.setOverScrollMode(2);
                    scrollView.setClipChildren(false);
                    scrollView.setFillViewport(true);
                    viewB.invalidate();
                    viewB.requestLayout();
                    postPathInterceptor$getGameCommentFile$1.f94922b = this;
                    postPathInterceptor$getGameCommentFile$1.f94923c = viewB;
                    postPathInterceptor$getGameCommentFile$1.f94926f = 1;
                    if (DelayKt.b(500L, postPathInterceptor$getGameCommentFile$1) == objH) {
                        return objH;
                    }
                    contentView = viewB;
                    postPathInterceptor = this;
                }
            }
            return null;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        contentView = (View) postPathInterceptor$getGameCommentFile$1.f94923c;
        postPathInterceptor = (PostPathInterceptor) postPathInterceptor$getGameCommentFile$1.f94922b;
        kotlin.t0.n(obj);
        f0.o(contentView, "contentView");
        return com.max.hbimage.b.q0(postPathInterceptor.f(contentView), com.max.xiaoheihe.utils.d.Q());
    }

    private final void i(com.sankuai.waimai.router.core.i iVar, File file, String str, yh.a<b2> aVar) {
        List<String> image_list;
        List listB;
        if (PatchProxy.proxy(new Object[]{iVar, file, str, aVar}, this, changeQuickRedirect, false, 48167, new Class[]{com.sankuai.waimai.router.core.i.class, File.class, String.class, yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        int iC = m.c(iVar, "post_type", 1);
        int iC2 = m.c(iVar, PictureVideoEditPostFragment.f82339h4, -1);
        iVar.y(Uri.parse("hblink://universal/bbs/post_picture"));
        Serializable serializableF = m.f(iVar, NewLinkEditFragment.Q4);
        String desc = null;
        BBSTopicObj bBSTopicObj = serializableF != null ? (BBSTopicObj) com.max.hbutils.utils.k.a(com.max.hbutils.utils.k.p(serializableF), BBSTopicObj.class) : null;
        Serializable serializableF2 = m.f(iVar, NewLinkEditFragment.R4);
        ArrayList arrayList = new ArrayList();
        if (serializableF2 != null && (listB = com.max.hbutils.utils.k.b(com.max.hbutils.utils.k.p(serializableF2), BBSTopicObj.class)) != null) {
            Iterator it = listB.iterator();
            while (it.hasNext()) {
                arrayList.add((BBSTopicObj) it.next());
            }
        }
        Serializable serializableF3 = m.f(iVar, "tags");
        ArrayList arrayList2 = serializableF3 instanceof ArrayList ? (ArrayList) serializableF3 : null;
        Serializable serializableF4 = m.f(iVar, NewLinkEditFragment.U4);
        LinkedTreeMap<?, ?> linkedTreeMap = serializableF4 instanceof LinkedTreeMap ? (LinkedTreeMap) serializableF4 : null;
        String strK = linkedTreeMap != null ? k(linkedTreeMap) : null;
        HighLikeCommentObj highLikeCommentObj = strK != null ? (HighLikeCommentObj) new Gson().fromJson(strK, HighLikeCommentObj.class) : null;
        Serializable serializableF5 = m.f(iVar, NewLinkEditFragment.f82067j5);
        Object objA = serializableF5 != null ? com.max.hbutils.utils.k.a(com.max.hbutils.utils.k.p(serializableF5), PostDefaultInfoObj.class) : null;
        ArrayList arrayList3 = new ArrayList();
        if (!com.max.hbcommon.utils.c.w(arrayList)) {
            arrayList3.addAll(arrayList);
        } else if (bBSTopicObj != null) {
            arrayList3.add(bBSTopicObj);
        }
        ArrayList arrayList4 = new ArrayList();
        if (file != null && file.exists()) {
            BBSTextObj bBSTextObj = new BBSTextObj();
            bBSTextObj.setText(file.getAbsolutePath());
            arrayList4.add(bBSTextObj);
        }
        PostDefaultInfoObj postDefaultInfoObj = (PostDefaultInfoObj) objA;
        if (postDefaultInfoObj != null && (image_list = postDefaultInfoObj.getImage_list()) != null && !com.max.hbcommon.utils.c.w(image_list)) {
            for (String str2 : image_list) {
                BBSTextObj bBSTextObj2 = new BBSTextObj();
                bBSTextObj2.setUrl(str2);
                arrayList4.add(bBSTextObj2);
            }
        }
        String title = postDefaultInfoObj != null ? postDefaultInfoObj.getTitle() : null;
        if (str != null) {
            desc = str;
        } else if (postDefaultInfoObj != null) {
            desc = postDefaultInfoObj.getDesc();
        }
        ArrayList arrayList5 = new ArrayList();
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        m.k(iVar, PictureVideoEditPostFragment.Z3, new PictureVideoLinkDraftObj(title, desc, null, arrayList4, arrayList5, arrayList2, arrayList3, new ArrayList(), null, null, null, null, null, null, highLikeCommentObj, null, null, null, 245504, null));
        boolean z10 = iC == 5;
        m.k(m.k(iVar, PictureVideoEditPostFragment.f82332a4, z10 ? PictureVideoEditPostFragment.POST_EDIT_TYPE.POST_VIDEO : PictureVideoEditPostFragment.POST_EDIT_TYPE.POST_PICTURE), PostTabActivity.f82576x2, z10 ? PostType.Video : PostType.Picture);
        if (z10) {
            m.k(iVar, PostTabActivity.f82578y2, 0);
        }
        if (iC2 > 0) {
            m.k(iVar, PictureVideoEditPostFragment.f82339h4, Integer.valueOf(iC2));
        }
        aVar.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, java.lang.String] */
    @SuppressLint({"CheckResult"})
    private final void j(final com.sankuai.waimai.router.core.i iVar, final yh.a<b2> aVar) {
        if (PatchProxy.proxy(new Object[]{iVar, aVar}, this, changeQuickRedirect, false, 48166, new Class[]{com.sankuai.waimai.router.core.i.class, yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        Serializable serializableF = m.f(iVar, PictureVideoEditPostFragment.f82342k4);
        JsonObject jsonObject = serializableF != null ? (JsonObject) com.max.hbutils.utils.k.a(com.max.hbutils.utils.k.p(serializableF), JsonObject.class) : null;
        String strE = com.max.hbutils.utils.k.e(com.max.hbutils.utils.k.p(jsonObject), "comment_game_id");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? E = com.max.hbutils.utils.k.e(com.max.hbutils.utils.k.p(jsonObject), "user_id");
        objectRef.f124891b = E;
        if (com.max.hbcommon.utils.c.u(E)) {
            objectRef.f124891b = i0.j();
        }
        if (jsonObject == null || com.max.hbcommon.utils.c.u(strE)) {
            i(iVar, null, null, aVar);
            return;
        }
        com.max.hbutils.utils.b bVar = new com.max.hbutils.utils.b(iVar.b());
        this.f94921c = bVar;
        this.f94920b = bVar.c();
        com.max.hbutils.utils.b bVar2 = this.f94921c;
        if (bVar2 != null) {
            bVar2.f();
        }
        Context contextB = iVar.b();
        f0.o(contextB, "request.context");
        final LoadingDialog loadingDialogR = new LoadingDialog(contextB).r();
        com.max.xiaoheihe.network.i.a().P7(strE, (String) objectRef.f124891b, null).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new com.max.hbcommon.network.d<Result<ShareGameCommentDataObj>>() { // from class: com.max.xiaoheihe.router.interceptors.PostPathInterceptor$handlePictureAndVideoWithGameComment$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public void onError(@dl.d Throwable e10) {
                if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 48175, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(e10, "e");
                com.max.hbutils.utils.b bVar3 = this.f94927b.f94921c;
                if (bVar3 != null) {
                    bVar3.d();
                }
                loadingDialogR.c();
                PostPathInterceptor.d(this.f94927b, iVar, null, null, aVar);
            }

            public void onNext(@dl.d Result<ShareGameCommentDataObj> result) {
                if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 48176, new Class[]{Result.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(result, "result");
                if (result.getResult() == null) {
                    return;
                }
                super.onNext(result);
                kotlinx.coroutines.k.f(r0.a(e1.e()), null, null, new PostPathInterceptor$handlePictureAndVideoWithGameComment$1$onNext$1(result, this.f94927b, loadingDialogR, iVar, aVar, objectRef, null), 3, null);
            }

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public /* bridge */ /* synthetic */ void onNext(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 48177, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                onNext((Result<ShareGameCommentDataObj>) obj);
            }
        });
    }

    private final String k(LinkedTreeMap<?, ?> linkedTreeMap) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{linkedTreeMap}, this, changeQuickRedirect, false, 48164, new Class[]{LinkedTreeMap.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : new Gson().toJson(linkedTreeMap);
    }

    private final Object l(final Context context, final ShareGameCommentDataObj shareGameCommentDataObj, kotlin.coroutines.c<? super File> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, shareGameCommentDataObj, cVar}, this, changeQuickRedirect, false, 48168, new Class[]{Context.class, ShareGameCommentDataObj.class, kotlin.coroutines.c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        final kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(IntrinsicsKt__IntrinsicsJvmKt.d(cVar), 1);
        qVar.F0();
        GameObj game_info = shareGameCommentDataObj.getGame_info();
        String image = null;
        if (com.max.hbcommon.utils.c.u(game_info != null ? game_info.getShare_bg_img() : null)) {
            GameObj game_info2 = shareGameCommentDataObj.getGame_info();
            if (game_info2 != null) {
                image = game_info2.getImage();
            }
        } else {
            GameObj game_info3 = shareGameCommentDataObj.getGame_info();
            if (game_info3 != null) {
                image = game_info3.getShare_bg_img();
            }
        }
        com.max.hbimage.b.Y(context, image, new com.max.hbimage.b.q() { // from class: com.max.xiaoheihe.router.interceptors.PostPathInterceptor$loadDrawableSuspend$2$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.max.hbimage.b.q
            public void a(@dl.e Drawable drawable) {
                if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, 48184, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlinx.coroutines.k.f(r0.a(e1.e()), null, null, new PostPathInterceptor$loadDrawableSuspend$2$1$onResourceReady$1(this.f94945a, context, shareGameCommentDataObj, qVar, null), 3, null);
            }

            @Override // com.max.hbimage.b.q
            public /* synthetic */ void b(Drawable drawable) {
                com.max.hbimage.d.a(this, drawable);
            }

            @Override // com.max.hbimage.b.q
            public void onLoadFailed(@dl.e Drawable drawable) {
                if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, 48185, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlinx.coroutines.k.f(r0.a(e1.e()), null, null, new PostPathInterceptor$loadDrawableSuspend$2$1$onLoadFailed$1(this.f94945a, context, shareGameCommentDataObj, qVar, null), 3, null);
            }
        });
        Object objT = qVar.t();
        if (objT == kotlin.coroutines.intrinsics.b.h()) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return objT;
    }

    @Override // com.sankuai.waimai.router.core.h
    public void a(@dl.d final com.sankuai.waimai.router.core.i request, @dl.d final com.sankuai.waimai.router.core.f callback) {
        if (PatchProxy.proxy(new Object[]{request, callback}, this, changeQuickRedirect, false, 48165, new Class[]{com.sankuai.waimai.router.core.i.class, com.sankuai.waimai.router.core.f.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(request, "request");
        f0.p(callback, "callback");
        Uri uriM = request.m();
        f0.o(uriM, "request.uri");
        String path = uriM.getPath();
        Log.d(this.f94919a, "Path: " + path);
        if (!f0.g(lb.d.A0, path)) {
            if (!MainActivity.E4 || f0.g(path, lb.d.f131157f1)) {
                callback.a();
                return;
            }
            request.y(Uri.parse("hblink://universal/bbs/post_tab"));
            m.k(request, PostTabActivity.f82576x2, PostType.Article);
            callback.onComplete(301);
            return;
        }
        Log.d(this.f94919a, "Parsing Uri");
        if (1 == m.c(request, "new_style", 0) && MainActivity.E4) {
            request.y(Uri.parse("hblink://universal/bbs/post_tab"));
            callback.onComplete(301);
            return;
        }
        int iC = m.c(request, "post_type", 1);
        final int iC2 = m.c(request, PictureVideoEditPostFragment.f82339h4, -1);
        yh.a<b2> aVar = new yh.a<b2>() { // from class: com.max.xiaoheihe.router.interceptors.PostPathInterceptor$intercept$redirect$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48183, new Class[0], Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48182, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                if (MainActivity.E4 && iC2 < 0) {
                    request.y(Uri.parse("hblink://universal/bbs/post_tab"));
                }
                callback.onComplete(301);
            }
        };
        if (iC == 1) {
            request.y(Uri.parse("hblink://universal/bbs/post_new_b"));
            m.k(m.k(m.l(request, "link_tag", "1"), "page_type", 0), PostTabActivity.f82576x2, PostType.Article);
            aVar.invoke();
            return;
        }
        if (iC == 2) {
            request.y(Uri.parse("hblink://universal/bbs/post_new_b"));
            m.k(m.k(m.l(request, "link_tag", "1"), "page_type", 11), PostTabActivity.f82576x2, PostType.Article);
            aVar.invoke();
        } else if (iC == 3) {
            request.y(Uri.parse("hblink://universal/bbs/post_new_b"));
            m.k(m.k(m.l(m.l(request, "link_tag", "21"), NewLinkEditFragment.O4, BBSTopicObj.TOPIC_ID_TIMELINE), "page_type", 9), PostTabActivity.f82576x2, PostType.Article);
            aVar.invoke();
        } else if (iC == 4) {
            j(request, aVar);
        } else {
            if (iC == 5) {
                i(request, null, null, aVar);
                return;
            }
            request.y(Uri.parse("hblink://universal/bbs/post_new_b"));
            m.k(m.k(m.l(request, "link_tag", "1"), "page_type", 0), PostTabActivity.f82576x2, PostType.Article);
            aVar.invoke();
        }
    }

    @dl.d
    public final Bitmap f(@dl.d View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 48170, new Class[]{View.class}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        f0.p(view, "view");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        f0.o(bitmapCreateBitmap, "createBitmap(view.measur… Bitmap.Config.ARGB_8888)");
        view.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    public final String h() {
        return this.f94919a;
    }
}
