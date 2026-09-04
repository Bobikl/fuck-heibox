package com.max.xiaoheihe.accelworld;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.BitmapFactory;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.max.hbmmkv.MMKVManager;
import com.max.hbshare.bean.PostOptionObj;
import com.max.xiaoheihe.bean.SourceInfoObj;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.max.xiaoheihe.module.account.p0;
import com.max.xiaoheihe.module.bbs.post.utils.PostUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.File;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.r0;

/* JADX INFO: compiled from: AccelWorldScreenShot.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class AccelWorldScreenShotKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: AccelWorldScreenShot.kt */
    public static final class a implements PostOptionObj.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f76454a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ File f76455b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BBSTopicObj f76456c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Activity f76457d;

        a(String str, File file, BBSTopicObj bBSTopicObj, Activity activity) {
            this.f76454a = str;
            this.f76455b = file;
            this.f76456c = bBSTopicObj;
            this.f76457d = activity;
        }

        @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
        public final void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
            if (PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, bb.c.m.Ix, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbshare.c.a(this.f76454a, "1", com.max.hbshare.d.f72591m, null);
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f76455b);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(BitmapFactory.decodeFile(this.f76455b.getAbsolutePath()));
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(this.f76456c);
            PostUtils.Companion companion = PostUtils.f81983a;
            Activity activity = this.f76457d;
            companion.x(activity, arrayList, arrayList2, null, arrayList3, null, null, null, AccelWorldShareKt.e(activity));
            dialog.dismiss();
        }
    }

    @dl.e
    public static final PostOptionObj a(@dl.d Activity mContext, @dl.d File screenShotFile, @dl.e BBSTopicObj bBSTopicObj, @dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mContext, screenShotFile, bBSTopicObj, str}, null, changeQuickRedirect, true, bb.c.m.Fx, new Class[]{Activity.class, File.class, BBSTopicObj.class, String.class}, PostOptionObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PostOptionObj) patchProxyResultProxy.result;
        }
        f0.p(mContext, "mContext");
        f0.p(screenShotFile, "screenShotFile");
        if (bBSTopicObj == null) {
            return null;
        }
        PostOptionObj postOptionObj = new PostOptionObj();
        postOptionObj.setName("发布到社区");
        postOptionObj.setImage_url(bBSTopicObj.getPic_url());
        postOptionObj.setClick_listener(new a(str, screenShotFile, bBSTopicObj, mContext));
        return postOptionObj;
    }

    @dl.e
    public static final SourceInfoObj b(@dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.m.Hx, new Class[]{String.class}, SourceInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (SourceInfoObj) patchProxyResultProxy.result;
        }
        if (str != null) {
            return (SourceInfoObj) com.max.hbutils.utils.k.a(MMKVManager.f71329a.i(ad.c.f1238r, str, null, false), SourceInfoObj.class);
        }
        return null;
    }

    public static final void c(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.m.Ex, new Class[]{String.class}, Void.TYPE).isSupported || str == null) {
            return;
        }
        Activity activityA = com.max.hbutils.utils.e.b().a();
        boolean zC = com.max.hbutils.utils.e.c(activityA);
        com.max.heybox.hblog.g.f74531b.M("appForeground " + zC);
        if (zC && (activityA instanceof p0)) {
            kotlinx.coroutines.k.f(r0.a(e1.e()), null, null, new AccelWorldScreenShotKt$fastHandleScreenShot$1$1(activityA, str, null), 3, null);
        }
    }

    public static final void d(@dl.e String str, @dl.e SourceInfoObj sourceInfoObj) {
        if (PatchProxy.proxy(new Object[]{str, sourceInfoObj}, null, changeQuickRedirect, true, bb.c.m.Gx, new Class[]{String.class, SourceInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.heybox.hblog.g.f74531b.M("fastSetScreenShotSourceInfo path: " + str + "   sourceInfo: " + com.max.hbutils.utils.k.p(sourceInfoObj));
        if (str == null || sourceInfoObj == null) {
            return;
        }
        MMKVManager.f71329a.o(ad.c.f1238r, str, com.max.hbutils.utils.k.p(sourceInfoObj), false);
    }
}
