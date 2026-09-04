package com.max.xiaoheihe.module.bbs.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import com.max.mediaselector.lib.entity.LocalMedia;
import com.max.xiaoheihe.module.bbs.post_edit.PictureVideoEditPostFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.starlightc.ucropplus.UCrop;
import com.starlightc.ucropplus.model.Draft;
import com.starlightc.ucropplus.model.puzzle.ImageModuleObj;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ImageModuleAdapter.kt */
/* JADX INFO: loaded from: classes10.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final a f80533a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f80534b = 0;

    /* JADX INFO: compiled from: ImageModuleAdapter.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.adapter.l$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ImageModuleAdapter.kt */
        public static final class DialogInterfaceOnClickListenerC0684a implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ArrayList<Uri> f80535b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ File f80536c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ ArrayList<Draft> f80537d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ ImageModuleObj f80538e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ Fragment f80539f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ Activity f80540g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ int f80541h;

            DialogInterfaceOnClickListenerC0684a(ArrayList<Uri> arrayList, File file, ArrayList<Draft> arrayList2, ImageModuleObj imageModuleObj, Fragment fragment, Activity activity, int i10) {
                this.f80535b = arrayList;
                this.f80536c = file;
                this.f80537d = arrayList2;
                this.f80538e = imageModuleObj;
                this.f80539f = fragment;
                this.f80540g = activity;
                this.f80541h = i10;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 27373, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                UCrop uCropOf = UCrop.of(this.f80535b, Uri.fromFile(this.f80536c), this.f80537d);
                uCropOf.getCropIntent().putExtra("type", "1");
                uCropOf.getCropIntent().putExtra("module", this.f80538e);
                uCropOf.getCropIntent().putExtra(UCropPlusActivity.ARG_SHOW_FILTER, "0");
                Fragment fragment = this.f80539f;
                if (fragment != null) {
                    uCropOf.startWithType(this.f80540g, fragment, this.f80541h, 1);
                } else {
                    uCropOf.startWithType(this.f80540g, this.f80541h, 1);
                }
                dialogInterface.dismiss();
            }
        }

        /* JADX INFO: compiled from: ImageModuleAdapter.kt */
        public static final class b implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Activity f80542b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Fragment f80543c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ ArrayList<Uri> f80544d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ File f80545e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ ImageModuleObj f80546f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ int f80547g;

            b(Activity activity, Fragment fragment, ArrayList<Uri> arrayList, File file, ImageModuleObj imageModuleObj, int i10) {
                this.f80542b = activity;
                this.f80543c = fragment;
                this.f80544d = arrayList;
                this.f80545e = file;
                this.f80546f = imageModuleObj;
                this.f80547g = i10;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 27374, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.hbcache.c.C("draft_info", null);
                a.d(l.f80533a, this.f80542b, this.f80543c, this.f80544d, this.f80545e, this.f80546f, null, this.f80547g, 32, null);
                dialogInterface.dismiss();
            }
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public static /* synthetic */ void b(a aVar, Context context, Activity activity, Fragment fragment, List list, ImageModuleObj imageModuleObj, int i10, int i11, Object obj) {
            int i12 = i10;
            Object[] objArr = {aVar, context, activity, fragment, list, imageModuleObj, new Integer(i12), new Integer(i11), obj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 27370, new Class[]{a.class, Context.class, Activity.class, Fragment.class, List.class, ImageModuleObj.class, cls, cls, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            if ((i11 & 32) != 0) {
                i12 = 69;
            }
            aVar.a(context, activity, fragment, list, imageModuleObj, i12);
        }

        public static /* synthetic */ void d(a aVar, Activity activity, Fragment fragment, ArrayList arrayList, File file, ImageModuleObj imageModuleObj, String str, int i10, int i11, Object obj) {
            int i12 = i10;
            Object[] objArr = {aVar, activity, fragment, arrayList, file, imageModuleObj, str, new Integer(i12), new Integer(i11), obj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 27372, new Class[]{a.class, Activity.class, Fragment.class, ArrayList.class, File.class, ImageModuleObj.class, String.class, cls, cls, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            String str2 = (i11 & 32) != 0 ? null : str;
            if ((i11 & 64) != 0) {
                i12 = 69;
            }
            aVar.c(activity, fragment, arrayList, file, imageModuleObj, str2, i12);
        }

        public final void a(@dl.d Context pageContext, @dl.d Activity activity, @dl.e Fragment fragment, @dl.d List<? extends LocalMedia> result, @dl.e ImageModuleObj imageModuleObj, int i10) {
            if (PatchProxy.proxy(new Object[]{pageContext, activity, fragment, result, imageModuleObj, new Integer(i10)}, this, changeQuickRedirect, false, 27369, new Class[]{Context.class, Activity.class, Fragment.class, List.class, ImageModuleObj.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(pageContext, "pageContext");
            f0.p(activity, "activity");
            f0.p(result, "result");
            ArrayList arrayList = new ArrayList();
            Iterator<? extends LocalMedia> it = result.iterator();
            while (it.hasNext()) {
                Uri uriL = it.next().l();
                f0.o(uriL, "res.cropInputUri");
                arrayList.add(uriL);
            }
            File file = new File(PictureVideoEditPostFragment.g7(activity));
            if (!file.exists()) {
                file.mkdirs();
            }
            ArrayList<Draft> draft = UCrop.getDraft(arrayList);
            if (draft == null || draft.isEmpty()) {
                d(this, activity, fragment, arrayList, file, imageModuleObj, null, i10, 32, null);
            } else {
                new com.max.hbcommon.view.a.f(pageContext).l("检测到未完成的编辑，是否继续？").u("是", new DialogInterfaceOnClickListenerC0684a(arrayList, file, draft, imageModuleObj, fragment, activity, i10)).o("否", new b(activity, fragment, arrayList, file, imageModuleObj, i10)).F();
            }
        }

        public final void c(@dl.d Activity context, @dl.e Fragment fragment, @dl.d ArrayList<Uri> uris, @dl.d File outputFile, @dl.e ImageModuleObj imageModuleObj, @dl.e String str, int i10) {
            if (PatchProxy.proxy(new Object[]{context, fragment, uris, outputFile, imageModuleObj, str, new Integer(i10)}, this, changeQuickRedirect, false, 27371, new Class[]{Activity.class, Fragment.class, ArrayList.class, File.class, ImageModuleObj.class, String.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(context, "context");
            f0.p(uris, "uris");
            f0.p(outputFile, "outputFile");
            UCrop uCropOf = UCrop.of(uris, Uri.fromFile(outputFile));
            uCropOf.getCropIntent().putExtra("type", "1");
            uCropOf.getCropIntent().putExtra("module", imageModuleObj);
            uCropOf.getCropIntent().putExtra(UCropPlusActivity.ARG_SHOW_FILTER, "0");
            if (str != null) {
                uCropOf.getCropIntent().putExtra(UCropPlusActivity.ARG_EXTRA, str);
            }
            if (fragment != null) {
                uCropOf.startWithType(context, fragment, i10, 1);
            } else {
                uCropOf.startWithType(context, 1);
            }
        }
    }
}
