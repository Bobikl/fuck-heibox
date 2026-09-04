package com.max.xiaoheihe.module.bbs.post_edit.auto_save;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import androidx.compose.runtime.internal.o;
import com.google.gson.JsonObject;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbutils.utils.k;
import com.max.hbutils.utils.x;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSTextObj;
import com.max.xiaoheihe.bean.bbs.LinkDraftObj;
import com.max.xiaoheihe.bean.bbs.LinkImageObj;
import com.max.xiaoheihe.bean.bbs.PictureVideoLinkDraftObj;
import com.max.xiaoheihe.bean.bbs.PostDataObj;
import com.max.xiaoheihe.bean.bbs.PostEditAutoSaveData;
import com.max.xiaoheihe.bean.bbs.PostSettingObj;
import com.max.xiaoheihe.module.bbs.post_edit.NewLinkEditFragment;
import com.max.xiaoheihe.module.bbs.post_edit.PictureVideoEditPostFragment;
import com.max.xiaoheihe.module.bbs.post_edit.PostTabActivity;
import com.max.xiaoheihe.module.bbs.post_edit.PostType;
import com.max.xiaoheihe.module.bbs.utils.DraftUtilsExKt;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;
import kotlin.b2;
import kotlin.c1;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import yh.l;

/* JADX INFO: compiled from: LoadAutoSavedDataListener.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class LoadPostEditAutoSavedDataListener implements com.max.xiaoheihe.module.bbs.post_edit.auto_save.b<PostEditAutoSaveData> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    public static final a f82832e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f82833f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final String f82834g = "LoadPostEditAutoSaveDataV1Listener-dbg";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final Context f82835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final yh.a<Boolean> f82836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final io.reactivex.disposables.a f82837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private LoadingDialog f82838d;

    /* JADX INFO: compiled from: LoadAutoSavedDataListener.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: LoadAutoSavedDataListener.kt */
    public static final class b implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f82839b = new b();
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 30870, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.analytics.d.d("4", lb.d.W0, null, new JsonObject());
            PostEditAutoSaveManager.f82868h.a();
        }
    }

    /* JADX INFO: compiled from: LoadAutoSavedDataListener.kt */
    public static final class c implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f82840b = new c();
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 30876, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.analytics.d.d("4", lb.d.W0, null, new JsonObject());
            PostEditAutoSaveManager.f82868h.a();
        }
    }

    /* JADX INFO: compiled from: LoadAutoSavedDataListener.kt */
    public static final class d implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f82841b = new d();
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 30882, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.analytics.d.d("4", lb.d.W0, null, new JsonObject());
            PostEditAutoSaveManager.f82868h.a();
        }
    }

    public LoadPostEditAutoSavedDataListener(@dl.d Context context, @dl.d yh.a<Boolean> onCheckIsActive, @dl.d io.reactivex.disposables.a composeDisposable) {
        f0.p(context, "context");
        f0.p(onCheckIsActive, "onCheckIsActive");
        f0.p(composeDisposable, "composeDisposable");
        this.f82835a = context;
        this.f82836b = onCheckIsActive;
        this.f82837c = composeDisposable;
    }

    private final void h(final boolean z10, final boolean z11, final PostEditAutoSaveData.ArticleLinkAutoSaveData articleLinkAutoSaveData) {
        final LinkDraftObj linkDraftObj;
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), articleLinkAutoSaveData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 30863, new Class[]{cls, cls, PostEditAutoSaveData.ArticleLinkAutoSaveData.class}, Void.TYPE).isSupported || (linkDraftObj = articleLinkAutoSaveData.getLinkDraftObj()) == null) {
            return;
        }
        LinkImageObj article_img = linkDraftObj.getArticle_img();
        String contentFirstImgPath = null;
        if (article_img != null) {
            article_img.setPath(null);
        }
        LinkImageObj article_img2 = linkDraftObj.getArticle_img();
        if ((article_img2 != null ? article_img2.getUrl() : null) != null) {
            LinkImageObj article_img3 = linkDraftObj.getArticle_img();
            if (article_img3 != null) {
                contentFirstImgPath = article_img3.getUrl();
            }
        } else {
            contentFirstImgPath = articleLinkAutoSaveData.getContentFirstImgPath();
        }
        String strE = k.e(linkDraftObj.getContent(), "title");
        String strE2 = k.e(linkDraftObj.getContent(), "text");
        if (strE == null || strE.length() == 0) {
            strE = strE2;
        }
        new f(contentFirstImgPath, strE).g(new l<DialogInterface, b2>() { // from class: com.max.xiaoheihe.module.bbs.post_edit.auto_save.LoadPostEditAutoSavedDataListener$showArticlePostEditRestore$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d DialogInterface dialog) {
                if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 30865, new Class[]{DialogInterface.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(dialog, "dialog");
                com.max.hbcommon.analytics.d.d("4", lb.d.Y0, null, new JsonObject());
                PostEditAutoSaveManager.f82868h.a();
                dialog.dismiss();
                Intent intentA = PostTabActivity.f82577y1.a(this.f82842b.f82835a, PostType.Article);
                LinkDraftObj linkDraftObj2 = linkDraftObj;
                PostEditAutoSaveData.ArticleLinkAutoSaveData articleLinkAutoSaveData2 = articleLinkAutoSaveData;
                boolean z12 = z10;
                boolean z13 = z11;
                intentA.putExtra("source", PostTabActivity.G3);
                com.max.hbutils.utils.a.i(intentA, "draft_info", linkDraftObj2);
                com.max.hbutils.utils.a.i(intentA, NewLinkEditFragment.f82060c5, articleLinkAutoSaveData2.getGames());
                intentA.putExtra("page_type", articleLinkAutoSaveData2.getPageType());
                intentA.putExtra("link_tag", articleLinkAutoSaveData2.getLinkTag());
                intentA.putExtras(androidx.core.os.e.b(c1.a("tags", linkDraftObj2.getCheckedHashTags())));
                com.max.hbutils.utils.a.i(intentA, NewLinkEditFragment.T4, articleLinkAutoSaveData2.getSelectedPostPlan());
                if (z12) {
                    intentA.putExtra(PostTabActivity.G2, z13);
                }
                this.f82842b.f82835a.startActivity(intentA);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(DialogInterface dialogInterface) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dialogInterface}, this, changeQuickRedirect, false, 30866, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(dialogInterface);
                return b2.f124493a;
            }
        }).f(new l<DialogInterface, b2>() { // from class: com.max.xiaoheihe.module.bbs.post_edit.auto_save.LoadPostEditAutoSavedDataListener$showArticlePostEditRestore$2
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: compiled from: LoadAutoSavedDataListener.kt */
            public static final class a implements com.max.xiaoheihe.module.bbs.utils.c.h {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ LoadPostEditAutoSavedDataListener f82849a;

                a(LoadPostEditAutoSavedDataListener loadPostEditAutoSavedDataListener) {
                    this.f82849a = loadPostEditAutoSavedDataListener;
                }

                @Override // com.max.xiaoheihe.module.bbs.utils.c.h
                public final void onFinish(boolean z10) {
                    if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 30869, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
                        return;
                    }
                    if (z10) {
                        x.p("草稿保存成功");
                    }
                    LoadingDialog loadingDialog = this.f82849a.f82838d;
                    if (loadingDialog != null) {
                        loadingDialog.c();
                    }
                    PostEditAutoSaveManager.f82868h.a();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Code duplicated, block: B:14:0x004a  */
            public final void a(@dl.d DialogInterface dialog) {
                if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 30867, new Class[]{DialogInterface.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(dialog, "dialog");
                com.max.hbcommon.analytics.d.d("4", lb.d.X0, null, new JsonObject());
                if (this.f82847b.f82838d == null) {
                    LoadPostEditAutoSavedDataListener loadPostEditAutoSavedDataListener = this.f82847b;
                    loadPostEditAutoSavedDataListener.f82838d = new LoadingDialog(loadPostEditAutoSavedDataListener.f82835a, this.f82847b.f82835a.getString(R.string.commiting), false).r();
                } else {
                    LoadingDialog loadingDialog = this.f82847b.f82838d;
                    if ((loadingDialog == null || loadingDialog.i()) ? false : true) {
                        LoadPostEditAutoSavedDataListener loadPostEditAutoSavedDataListener2 = this.f82847b;
                        loadPostEditAutoSavedDataListener2.f82838d = new LoadingDialog(loadPostEditAutoSavedDataListener2.f82835a, this.f82847b.f82835a.getString(R.string.commiting), false).r();
                    }
                }
                dialog.dismiss();
                com.max.xiaoheihe.module.bbs.utils.c.j(linkDraftObj, true, new a(this.f82847b), false);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(DialogInterface dialogInterface) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dialogInterface}, this, changeQuickRedirect, false, 30868, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(dialogInterface);
                return b2.f124493a;
            }
        }).e(b.f82839b).h(this.f82835a);
    }

    private final void i(final boolean z10, final boolean z11, final PostEditAutoSaveData.PicVideoLinkAutoSaveData picVideoLinkAutoSaveData) {
        final PostDataObj postDataObj;
        final PictureVideoLinkDraftObj pictureVideoLinkDraftObj;
        String text;
        BBSTextObj bBSTextObj;
        BBSTextObj bBSTextObj2;
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), picVideoLinkAutoSaveData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 30861, new Class[]{cls, cls, PostEditAutoSaveData.PicVideoLinkAutoSaveData.class}, Void.TYPE).isSupported || (postDataObj = picVideoLinkAutoSaveData.getPostDataObj()) == null || (pictureVideoLinkDraftObj = picVideoLinkAutoSaveData.getPictureVideoLinkDraftObj()) == null) {
            return;
        }
        List<BBSTextObj> imgPathList = pictureVideoLinkDraftObj.getImgPathList();
        if (imgPathList == null || (bBSTextObj2 = (BBSTextObj) CollectionsKt___CollectionsKt.B2(imgPathList)) == null || (text = bBSTextObj2.getUrl()) == null) {
            List<BBSTextObj> imgPathList2 = pictureVideoLinkDraftObj.getImgPathList();
            text = (imgPathList2 == null || (bBSTextObj = (BBSTextObj) CollectionsKt___CollectionsKt.B2(imgPathList2)) == null) ? null : bBSTextObj.getText();
        }
        String title = pictureVideoLinkDraftObj.getTitle();
        String title2 = !(title == null || title.length() == 0) ? pictureVideoLinkDraftObj.getTitle() : pictureVideoLinkDraftObj.getContent();
        PostSettingObj postSettingObj = pictureVideoLinkDraftObj.getPostSettingObj();
        LinkImageObj thumbImageObj = postSettingObj != null ? postSettingObj.getThumbImageObj() : null;
        if (thumbImageObj != null) {
            thumbImageObj.setPath(null);
        }
        new f(text, title2).g(new l<DialogInterface, b2>() { // from class: com.max.xiaoheihe.module.bbs.post_edit.auto_save.LoadPostEditAutoSavedDataListener$showPicturePostEditRestore$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d DialogInterface dialog) {
                if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 30871, new Class[]{DialogInterface.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(dialog, "dialog");
                com.max.hbcommon.analytics.d.d("4", lb.d.Y0, null, new JsonObject());
                PostEditAutoSaveManager.f82868h.a();
                dialog.dismiss();
                PostTabActivity.a aVar = PostTabActivity.f82577y1;
                Context context = this.f82850b.f82835a;
                PostType postType = PostType.Picture;
                Intent intentA = aVar.a(context, postType);
                PictureVideoLinkDraftObj pictureVideoLinkDraftObj2 = pictureVideoLinkDraftObj;
                boolean z12 = z10;
                boolean z13 = z11;
                intentA.putExtra("source", PostTabActivity.G3);
                intentA.putExtra(PictureVideoEditPostFragment.Z3, pictureVideoLinkDraftObj2);
                intentA.putExtra(PictureVideoEditPostFragment.f82332a4, PictureVideoEditPostFragment.POST_EDIT_TYPE.POST_PICTURE);
                intentA.putExtra(PostTabActivity.f82576x2, postType);
                if (z12) {
                    intentA.putExtra(PostTabActivity.G2, z13);
                }
                this.f82850b.f82835a.startActivity(intentA);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(DialogInterface dialogInterface) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dialogInterface}, this, changeQuickRedirect, false, 30872, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(dialogInterface);
                return b2.f124493a;
            }
        }).f(new l<DialogInterface, b2>() { // from class: com.max.xiaoheihe.module.bbs.post_edit.auto_save.LoadPostEditAutoSavedDataListener$showPicturePostEditRestore$2
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: compiled from: LoadAutoSavedDataListener.kt */
            public static final class a implements com.max.xiaoheihe.module.bbs.utils.c.h {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ LoadPostEditAutoSavedDataListener f82858a;

                a(LoadPostEditAutoSavedDataListener loadPostEditAutoSavedDataListener) {
                    this.f82858a = loadPostEditAutoSavedDataListener;
                }

                @Override // com.max.xiaoheihe.module.bbs.utils.c.h
                public final void onFinish(boolean z10) {
                    if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 30875, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
                        return;
                    }
                    if (z10) {
                        x.p("草稿保存成功");
                    }
                    LoadingDialog loadingDialog = this.f82858a.f82838d;
                    if (loadingDialog != null) {
                        loadingDialog.c();
                    }
                    PostEditAutoSaveManager.f82868h.a();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Code duplicated, block: B:14:0x0049  */
            public final void a(@dl.d DialogInterface dialog) {
                if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 30873, new Class[]{DialogInterface.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(dialog, "dialog");
                com.max.hbcommon.analytics.d.d("4", lb.d.X0, null, new JsonObject());
                if (this.f82854b.f82838d == null) {
                    LoadPostEditAutoSavedDataListener loadPostEditAutoSavedDataListener = this.f82854b;
                    loadPostEditAutoSavedDataListener.f82838d = new LoadingDialog(loadPostEditAutoSavedDataListener.f82835a, this.f82854b.f82835a.getString(R.string.commiting), false).r();
                } else {
                    LoadingDialog loadingDialog = this.f82854b.f82838d;
                    if ((loadingDialog == null || loadingDialog.i()) ? false : true) {
                        LoadPostEditAutoSavedDataListener loadPostEditAutoSavedDataListener2 = this.f82854b;
                        loadPostEditAutoSavedDataListener2.f82838d = new LoadingDialog(loadPostEditAutoSavedDataListener2.f82835a, this.f82854b.f82835a.getString(R.string.commiting), false).r();
                    }
                }
                dialog.dismiss();
                DraftUtilsExKt.c(this.f82854b.f82837c, this.f82854b.f82835a, postDataObj, pictureVideoLinkDraftObj, picVideoLinkAutoSaveData.getExtraParams(), false, this.f82854b.f82836b, new a(this.f82854b));
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(DialogInterface dialogInterface) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dialogInterface}, this, changeQuickRedirect, false, 30874, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(dialogInterface);
                return b2.f124493a;
            }
        }).e(c.f82840b).h(this.f82835a);
    }

    private final void j(final boolean z10, final boolean z11, final PostEditAutoSaveData.PicVideoLinkAutoSaveData picVideoLinkAutoSaveData) {
        final PostDataObj postDataObj;
        final PictureVideoLinkDraftObj pictureVideoLinkDraftObj;
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), picVideoLinkAutoSaveData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 30862, new Class[]{cls, cls, PostEditAutoSaveData.PicVideoLinkAutoSaveData.class}, Void.TYPE).isSupported || (postDataObj = picVideoLinkAutoSaveData.getPostDataObj()) == null || (pictureVideoLinkDraftObj = picVideoLinkAutoSaveData.getPictureVideoLinkDraftObj()) == null) {
            return;
        }
        String video_thumb = pictureVideoLinkDraftObj.getVideo_thumb();
        if (video_thumb == null) {
            video_thumb = pictureVideoLinkDraftObj.getVideo_url();
        }
        String title = pictureVideoLinkDraftObj.getTitle();
        new f(video_thumb, !(title == null || title.length() == 0) ? pictureVideoLinkDraftObj.getTitle() : pictureVideoLinkDraftObj.getContent()).g(new l<DialogInterface, b2>() { // from class: com.max.xiaoheihe.module.bbs.post_edit.auto_save.LoadPostEditAutoSavedDataListener$showVideoPostEditRestore$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d DialogInterface dialog) {
                if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 30877, new Class[]{DialogInterface.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(dialog, "dialog");
                com.max.hbcommon.analytics.d.d("4", lb.d.Y0, null, new JsonObject());
                PostEditAutoSaveManager.f82868h.a();
                dialog.dismiss();
                PostTabActivity.a aVar = PostTabActivity.f82577y1;
                Context context = this.f82859b.f82835a;
                PostType postType = PostType.Video;
                Intent intentA = aVar.a(context, postType);
                PictureVideoLinkDraftObj pictureVideoLinkDraftObj2 = pictureVideoLinkDraftObj;
                boolean z12 = z10;
                boolean z13 = z11;
                intentA.putExtra("source", PostTabActivity.G3);
                intentA.putExtra(PictureVideoEditPostFragment.Z3, pictureVideoLinkDraftObj2);
                intentA.putExtra(PictureVideoEditPostFragment.f82332a4, PictureVideoEditPostFragment.POST_EDIT_TYPE.POST_VIDEO);
                intentA.putExtra(PostTabActivity.f82576x2, postType);
                if (z12) {
                    intentA.putExtra(PostTabActivity.G2, z13);
                }
                intentA.putExtra(PostTabActivity.f82578y2, 0);
                this.f82859b.f82835a.startActivity(intentA);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(DialogInterface dialogInterface) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dialogInterface}, this, changeQuickRedirect, false, 30878, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(dialogInterface);
                return b2.f124493a;
            }
        }).f(new l<DialogInterface, b2>() { // from class: com.max.xiaoheihe.module.bbs.post_edit.auto_save.LoadPostEditAutoSavedDataListener$showVideoPostEditRestore$2
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: compiled from: LoadAutoSavedDataListener.kt */
            public static final class a implements com.max.xiaoheihe.module.bbs.utils.c.h {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ LoadPostEditAutoSavedDataListener f82867a;

                a(LoadPostEditAutoSavedDataListener loadPostEditAutoSavedDataListener) {
                    this.f82867a = loadPostEditAutoSavedDataListener;
                }

                @Override // com.max.xiaoheihe.module.bbs.utils.c.h
                public final void onFinish(boolean z10) {
                    if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 30881, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
                        return;
                    }
                    if (z10) {
                        x.p("草稿保存成功");
                    }
                    LoadingDialog loadingDialog = this.f82867a.f82838d;
                    if (loadingDialog != null) {
                        loadingDialog.c();
                    }
                    PostEditAutoSaveManager.f82868h.a();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Code duplicated, block: B:14:0x0049  */
            public final void a(@dl.d DialogInterface dialog) {
                if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 30879, new Class[]{DialogInterface.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(dialog, "dialog");
                com.max.hbcommon.analytics.d.d("4", lb.d.X0, null, new JsonObject());
                if (this.f82863b.f82838d == null) {
                    LoadPostEditAutoSavedDataListener loadPostEditAutoSavedDataListener = this.f82863b;
                    loadPostEditAutoSavedDataListener.f82838d = new LoadingDialog(loadPostEditAutoSavedDataListener.f82835a, this.f82863b.f82835a.getString(R.string.commiting), false).r();
                } else {
                    LoadingDialog loadingDialog = this.f82863b.f82838d;
                    if ((loadingDialog == null || loadingDialog.i()) ? false : true) {
                        LoadPostEditAutoSavedDataListener loadPostEditAutoSavedDataListener2 = this.f82863b;
                        loadPostEditAutoSavedDataListener2.f82838d = new LoadingDialog(loadPostEditAutoSavedDataListener2.f82835a, this.f82863b.f82835a.getString(R.string.commiting), false).r();
                    }
                }
                dialog.dismiss();
                DraftUtilsExKt.c(this.f82863b.f82837c, this.f82863b.f82835a, postDataObj, pictureVideoLinkDraftObj, picVideoLinkAutoSaveData.getExtraParams(), true, this.f82863b.f82836b, new a(this.f82863b));
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(DialogInterface dialogInterface) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dialogInterface}, this, changeQuickRedirect, false, 30880, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(dialogInterface);
                return b2.f124493a;
            }
        }).e(d.f82841b).h(this.f82835a);
    }

    @Override // com.max.xiaoheihe.module.bbs.post_edit.auto_save.b
    public /* bridge */ /* synthetic */ void a(String str, boolean z10, boolean z11, PostEditAutoSaveData postEditAutoSaveData) {
        Object[] objArr = {str, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), postEditAutoSaveData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 30864, new Class[]{String.class, cls, cls, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        g(str, z10, z11, postEditAutoSaveData);
    }

    public void g(@dl.d String postTypeName, boolean z10, boolean z11, @dl.d PostEditAutoSaveData autoSavedData) {
        Object[] objArr = {postTypeName, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), autoSavedData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 30860, new Class[]{String.class, cls, cls, PostEditAutoSaveData.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(postTypeName, "postTypeName");
        f0.p(autoSavedData, "autoSavedData");
        Log.d(f82834g, "[onLoadFinish]\npostTypeName: " + postTypeName + ", isEdit: " + z10 + ", canEditModifyPostPlan: " + z11 + "\nisDataEmpty: " + autoSavedData.checkIsEmpty() + "\nautoSavedData: " + autoSavedData);
        if (!this.f82836b.invoke().booleanValue() || autoSavedData.checkIsEmpty()) {
            return;
        }
        int iHashCode = postTypeName.hashCode();
        if (iHashCode == 82650203) {
            if (postTypeName.equals("Video") && (autoSavedData instanceof PostEditAutoSaveData.PicVideoLinkAutoSaveData)) {
                j(z10, z11, (PostEditAutoSaveData.PicVideoLinkAutoSaveData) autoSavedData);
                return;
            }
            return;
        }
        if (iHashCode == 932275414) {
            if (postTypeName.equals("Article") && (autoSavedData instanceof PostEditAutoSaveData.ArticleLinkAutoSaveData)) {
                h(z10, z11, (PostEditAutoSaveData.ArticleLinkAutoSaveData) autoSavedData);
                return;
            }
            return;
        }
        if (iHashCode == 1086911710 && postTypeName.equals("Picture") && (autoSavedData instanceof PostEditAutoSaveData.PicVideoLinkAutoSaveData)) {
            i(z10, z11, (PostEditAutoSaveData.PicVideoLinkAutoSaveData) autoSavedData);
        }
    }
}
