package com.max.xiaoheihe.module.mall.cardshare.fragment.actions;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import androidx.fragment.app.FragmentActivity;
import com.max.commentimagepainter.sharecard.bean.CardObj;
import com.max.commentimagepainter.sharecard.bean.CardObjV2;
import com.max.hbcommon.network.d;
import com.max.hbpermission.PermissionManager;
import com.max.hbpermission.c;
import com.max.hbshare.bean.HBShareReportData;
import com.max.hbutils.utils.k;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.accelworld.g;
import com.max.xiaoheihe.accelworld.r;
import com.max.xiaoheihe.bean.ShareInfoObj;
import com.max.xiaoheihe.bean.bbs.BBSTextObj;
import com.max.xiaoheihe.bean.bbs.PictureVideoLinkDraftObj;
import com.max.xiaoheihe.module.bbs.post_edit.PictureVideoEditPostFragment;
import com.max.xiaoheihe.module.bbs.post_edit.PostTabActivity;
import com.max.xiaoheihe.module.bbs.post_edit.PostType;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.io.File;
import java.util.List;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import yh.l;

/* JADX INFO: compiled from: BaseFragmentActions.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.mall.cardshare.fragment.actions.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BaseFragmentActions.kt */
    public static final class C0826a extends d<File> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.base.d f90190b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f90191c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ l<File, b2> f90192d;

        /* JADX WARN: Multi-variable type inference failed */
        C0826a(com.max.hbcommon.base.d dVar, Context context, l<? super File, b2> lVar) {
            this.f90190b = dVar;
            this.f90191c = context;
            this.f90192d = lVar;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 41303, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (this.f90190b.isActive()) {
                super.onError(e10);
                r.a(this.f90190b.getString(R.string.save_fail) + ": " + e10);
            }
        }

        public void onNext(@dl.d File file) {
            if (PatchProxy.proxy(new Object[]{file}, this, changeQuickRedirect, false, 41304, new Class[]{File.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(file, "file");
            if (this.f90190b.isActive()) {
                super.onNext(file);
                g.a(this.f90191c, file);
                this.f90192d.invoke(file);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 41305, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((File) obj);
        }
    }

    /* JADX INFO: compiled from: BaseFragmentActions.kt */
    public static final class b implements c {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.base.d f90193a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Bitmap f90194b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d<File> f90195c;

        b(com.max.hbcommon.base.d dVar, Bitmap bitmap, d<File> dVar2) {
            this.f90193a = dVar;
            this.f90194b = bitmap;
            this.f90195c = dVar2;
        }

        @Override // com.max.hbpermission.c
        public final void onResult() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41306, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            this.f90193a.addDisposable((io.reactivex.disposables.b) com.max.hbimage.b.s0(com.max.xiaoheihe.utils.d.T(), this.f90194b).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(this.f90195c));
        }
    }

    @e
    public static final CardObj a(@dl.d List<CardObj> list, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, new Integer(i10)}, null, changeQuickRedirect, true, 41297, new Class[]{List.class, Integer.TYPE}, CardObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (CardObj) patchProxyResultProxy.result;
        }
        f0.p(list, "<this>");
        if (c(list, i10)) {
            return list.get(i10);
        }
        return null;
    }

    @e
    public static final CardObjV2 b(@dl.d List<CardObjV2> list, int i10) {
        boolean z10 = false;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, new Integer(i10)}, null, changeQuickRedirect, true, 41298, new Class[]{List.class, Integer.TYPE}, CardObjV2.class);
        if (patchProxyResultProxy.isSupported) {
            return (CardObjV2) patchProxyResultProxy.result;
        }
        f0.p(list, "<this>");
        if (i10 >= 0 && i10 < list.size()) {
            z10 = true;
        }
        if (z10) {
            return list.get(i10);
        }
        return null;
    }

    public static final boolean c(@dl.d List<CardObj> list, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, new Integer(i10)}, null, changeQuickRedirect, true, 41296, new Class[]{List.class, Integer.TYPE}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(list, "<this>");
        return i10 >= 0 && i10 < list.size();
    }

    public static final void d(@dl.d com.max.hbcommon.base.d dVar, @dl.d Bitmap shareBitmap, @dl.d Context context, @dl.d l<? super File, b2> whenSuccessCallback) {
        if (PatchProxy.proxy(new Object[]{dVar, shareBitmap, context, whenSuccessCallback}, null, changeQuickRedirect, true, 41299, new Class[]{com.max.hbcommon.base.d.class, Bitmap.class, Context.class, l.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(dVar, "<this>");
        f0.p(shareBitmap, "shareBitmap");
        f0.p(context, "context");
        f0.p(whenSuccessCallback, "whenSuccessCallback");
        FragmentActivity activity = dVar.getActivity();
        if (activity == null) {
            return;
        }
        e(dVar, activity, shareBitmap, new C0826a(dVar, context, whenSuccessCallback));
    }

    public static final void e(@dl.d com.max.hbcommon.base.d dVar, @dl.d FragmentActivity activity, @e Bitmap bitmap, @dl.d d<File> observer) {
        if (PatchProxy.proxy(new Object[]{dVar, activity, bitmap, observer}, null, changeQuickRedirect, true, 41300, new Class[]{com.max.hbcommon.base.d.class, FragmentActivity.class, Bitmap.class, d.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(dVar, "<this>");
        f0.p(activity, "activity");
        f0.p(observer, "observer");
        PermissionManager.f71603a.T(activity, new b(dVar, bitmap, observer));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void f(@dl.d com.max.hbcommon.base.d dVar, @dl.d File imageFile, int i10, int i11, @e CardObj cardObj, @dl.d ShareInfoObj shareInfoObj) {
        Object[] objArr = {dVar, imageFile, new Integer(i10), new Integer(i11), cardObj, shareInfoObj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 41301, new Class[]{com.max.hbcommon.base.d.class, File.class, cls, cls, CardObj.class, ShareInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(dVar, "<this>");
        f0.p(imageFile, "imageFile");
        f0.p(shareInfoObj, "shareInfoObj");
        FragmentActivity activity = dVar.getActivity();
        if (activity != null && i0.e(activity)) {
            Intent intentA = PostTabActivity.f82577y1.a(activity, PostType.Picture);
            BBSTextObj bBSTextObj = new BBSTextObj();
            bBSTextObj.setText(imageFile.getAbsolutePath());
            bBSTextObj.setHeight(String.valueOf(i11));
            bBSTextObj.setWidth(String.valueOf(i10));
            bBSTextObj.setUrl("");
            PictureVideoLinkDraftObj pictureVideoLinkDraftObj = new PictureVideoLinkDraftObj();
            List<BBSTextObj> imgPathList = pictureVideoLinkDraftObj.getImgPathList();
            if (imgPathList != null) {
                imgPathList.add(bBSTextObj);
            }
            intentA.putExtra(PictureVideoEditPostFragment.Z3, pictureVideoLinkDraftObj);
            if (cardObj != null) {
                String topic_id = cardObj.getTopic_id();
                if (topic_id != null) {
                    intentA.putExtra(PictureVideoEditPostFragment.f82334c4, topic_id);
                }
                String img_src = cardObj.getImg_src();
                if (img_src != null) {
                    intentA.putExtra(PictureVideoEditPostFragment.f82340i4, img_src);
                }
            }
            intentA.putExtra(PictureVideoEditPostFragment.f82338g4, k.p(new HBShareReportData(com.max.hbshare.c.f72545a, shareInfoObj.getExtra_data())));
            activity.startActivityForResult(intentA, 9991);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void g(@dl.d com.max.hbcommon.base.d dVar, @dl.d File imageFile, int i10, int i11, @e CardObjV2 cardObjV2, @dl.d ShareInfoObj shareInfoObj) {
        Object[] objArr = {dVar, imageFile, new Integer(i10), new Integer(i11), cardObjV2, shareInfoObj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 41302, new Class[]{com.max.hbcommon.base.d.class, File.class, cls, cls, CardObjV2.class, ShareInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(dVar, "<this>");
        f0.p(imageFile, "imageFile");
        f0.p(shareInfoObj, "shareInfoObj");
        FragmentActivity activity = dVar.getActivity();
        if (activity != null && i0.e(activity)) {
            Intent intentA = PostTabActivity.f82577y1.a(activity, PostType.Picture);
            BBSTextObj bBSTextObj = new BBSTextObj();
            bBSTextObj.setText(imageFile.getAbsolutePath());
            bBSTextObj.setHeight(String.valueOf(i11));
            bBSTextObj.setWidth(String.valueOf(i10));
            bBSTextObj.setUrl("");
            PictureVideoLinkDraftObj pictureVideoLinkDraftObj = new PictureVideoLinkDraftObj();
            List<BBSTextObj> imgPathList = pictureVideoLinkDraftObj.getImgPathList();
            if (imgPathList != null) {
                imgPathList.add(bBSTextObj);
            }
            intentA.putExtra(PictureVideoEditPostFragment.Z3, pictureVideoLinkDraftObj);
            if (cardObjV2 != null) {
                String topic_id = cardObjV2.getTopic_id();
                if (topic_id != null) {
                    intentA.putExtra(PictureVideoEditPostFragment.f82334c4, topic_id);
                }
                String img_src = cardObjV2.getImg_src();
                if (img_src != null) {
                    intentA.putExtra(PictureVideoEditPostFragment.f82340i4, img_src);
                }
            }
            intentA.putExtra(PictureVideoEditPostFragment.f82338g4, k.p(new HBShareReportData(com.max.hbshare.c.f72545a, shareInfoObj.getExtra_data())));
            activity.startActivityForResult(intentA, 9991);
        }
    }
}
