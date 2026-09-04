package com.max.xiaoheihe.accelworld;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.text.Spannable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import com.max.hbmmkv.MMKVManager;
import com.max.hbuikit.bean.UiKitViewObj;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.account.DialogButtonObj;
import com.max.xiaoheihe.bean.account.GifImageObj;
import com.max.xiaoheihe.bean.account.SignBirthdayDialogInfoObj;
import com.max.xiaoheihe.bean.bbs.BBSTextObj;
import com.max.xiaoheihe.bean.bbs.PictureVideoLinkDraftObj;
import com.max.xiaoheihe.module.account.GeneralSettingsActivity;
import com.max.xiaoheihe.module.bbs.post_edit.PictureVideoEditPostFragment;
import com.max.xiaoheihe.module.bbs.post_edit.PostTabActivity;
import com.max.xiaoheihe.module.bbs.post_edit.PostType;
import com.max.xiaoheihe.utils.i0;
import com.max.xiaoheihe.utils.imageviewer.ExtentionsKt;
import com.max.xiaoheihe.utils.viewprioritymanager.ViewPriority;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.p4;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import pl.droidsonroids.gif.GifImageView;

/* JADX INFO: compiled from: HBDialogManager.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class HBDialogManagerKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: HBDialogManager.kt */
    public static final class a implements com.max.hbimage.b.s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f76718a = new a();
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.max.hbimage.b.s
        public final String getFileName(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.m.WD, new Class[]{String.class}, String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : com.max.hbutils.utils.s.d(str);
        }
    }

    /* JADX INFO: compiled from: HBDialogManager.kt */
    public static final class b extends com.max.hbcommon.network.d<File> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WeakReference<GifImageView> f76719b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f76720c;

        b(WeakReference<GifImageView> weakReference, String str) {
            this.f76719b = weakReference;
            this.f76720c = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, bb.c.m.XD, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
        }

        public void onNext(@dl.d File file) {
            if (PatchProxy.proxy(new Object[]{file}, this, changeQuickRedirect, false, bb.c.m.YD, new Class[]{File.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(file, "file");
            super.onNext(file);
            if (file.exists()) {
                String absolutePath = file.getAbsolutePath();
                GifImageView gifImageView = this.f76719b.get();
                if (gifImageView != null) {
                    int iQ = com.max.hbutils.utils.n.q(this.f76720c);
                    pl.droidsonroids.gif.d dVar = new pl.droidsonroids.gif.d(absolutePath);
                    if (iQ <= 0) {
                        iQ = 65535;
                    }
                    dVar.H(iQ);
                    gifImageView.setImageDrawable(dVar);
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.ZD, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((File) obj);
        }
    }

    /* JADX INFO: compiled from: HBDialogManager.kt */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f76721b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p4 f76722c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ SignBirthdayDialogInfoObj f76723d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<Dialog> f76724e;

        c(TextView textView, p4 p4Var, SignBirthdayDialogInfoObj signBirthdayDialogInfoObj, Ref.ObjectRef<Dialog> objectRef) {
            this.f76721b = textView;
            this.f76722c = p4Var;
            this.f76723d = signBirthdayDialogInfoObj;
            this.f76724e = objectRef;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            List<String> hashtags;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.m.aE, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.analytics.d.d("4", lb.d.E5, null, null);
            TextView onClick = this.f76721b;
            f0.o(onClick, "onClick");
            if (i0.e(ExtentionsKt.c(onClick))) {
                Bitmap bitmapU = ViewUtils.U(this.f76722c.f114435e);
                File fileQ0 = com.max.hbimage.b.q0(bitmapU, com.max.xiaoheihe.utils.d.Q());
                if (fileQ0 == null || !fileQ0.exists()) {
                    com.max.hbutils.utils.c.d("请稍候重试");
                    return;
                }
                PostTabActivity.a aVar = PostTabActivity.f82577y1;
                TextView onClick2 = this.f76721b;
                f0.o(onClick2, "onClick");
                FragmentActivity fragmentActivityC = ExtentionsKt.c(onClick2);
                f0.m(fragmentActivityC);
                Intent intentA = aVar.a(fragmentActivityC, PostType.Picture);
                PictureVideoLinkDraftObj pictureVideoLinkDraftObj = new PictureVideoLinkDraftObj();
                BBSTextObj bBSTextObj = new BBSTextObj();
                bBSTextObj.setText(fileQ0.getAbsolutePath());
                bBSTextObj.setHeight(String.valueOf(bitmapU.getHeight()));
                bBSTextObj.setWidth(String.valueOf(bitmapU.getWidth()));
                List<BBSTextObj> imgPathList = pictureVideoLinkDraftObj.getImgPathList();
                if (imgPathList != null) {
                    imgPathList.add(bBSTextObj);
                }
                DialogButtonObj button = this.f76723d.getButton();
                if (button != null && (hashtags = button.getHashtags()) != null) {
                    pictureVideoLinkDraftObj.setHashtagList(hashtags);
                }
                intentA.putExtra(PictureVideoEditPostFragment.Z3, pictureVideoLinkDraftObj);
                TextView onClick3 = this.f76721b;
                f0.o(onClick3, "onClick");
                FragmentActivity fragmentActivityC2 = ExtentionsKt.c(onClick3);
                if (fragmentActivityC2 != null) {
                    fragmentActivityC2.startActivity(intentA);
                }
                Dialog dialog = this.f76724e.f124891b;
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        }
    }

    /* JADX INFO: compiled from: HBDialogManager.kt */
    public static final class d implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.xiaoheihe.view.m f76725b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.view.a.f f76726c;

        d(com.max.xiaoheihe.view.m mVar, com.max.hbcommon.view.a.f fVar) {
            this.f76725b = mVar;
            this.f76726c = fVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.bE, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            this.f76725b.a(this.f76726c.e());
        }
    }

    /* JADX INFO: compiled from: HBDialogManager.kt */
    public static final class e implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.xiaoheihe.view.m f76727b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.view.a.f f76728c;

        e(com.max.xiaoheihe.view.m mVar, com.max.hbcommon.view.a.f fVar) {
            this.f76727b = mVar;
            this.f76728c = fVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.cE, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            this.f76727b.b(this.f76728c.e());
        }
    }

    /* JADX INFO: compiled from: HBDialogManager.kt */
    public static final class f implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f76729b;

        f(Context context) {
            this.f76729b = context;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.eE, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            Context context = this.f76729b;
            com.max.xiaoheihe.utils.d.G1(context, GeneralSettingsActivity.j2(context));
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: HBDialogManager.kt */
    public static final class g implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final g f76730b = new g();
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            if (PatchProxy.proxy(new Object[]{dialogInterface}, this, changeQuickRedirect, false, bb.c.m.fE, new Class[]{DialogInterface.class}, Void.TYPE).isSupported) {
                return;
            }
            MMKVManager.f71329a.k("common", ad.c.f1228h, false, false);
            com.max.xiaoheihe.utils.viewprioritymanager.a.f95777a.b(ViewPriority.LOW.getValue());
        }
    }

    @SuppressLint({"CheckResult"})
    public static final void a(@dl.d Context context, @dl.d GifImageView gifImageView, @dl.d String imageUrl, @dl.e String str) {
        if (PatchProxy.proxy(new Object[]{context, gifImageView, imageUrl, str}, null, changeQuickRedirect, true, bb.c.m.SD, new Class[]{Context.class, GifImageView.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        f0.p(gifImageView, "gifImageView");
        f0.p(imageUrl, "imageUrl");
        com.max.hbimage.b.i(context.getCacheDir().getAbsolutePath(), a.f76718a, imageUrl).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b(new WeakReference(gifImageView), str));
    }

    public static final void b(@dl.e Context context) {
        if (PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.m.VD, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
        if (fragmentActivity == null) {
            Activity activityA = com.max.hbutils.utils.e.b().a();
            fragmentActivity = activityA instanceof FragmentActivity ? (FragmentActivity) activityA : null;
        }
        if (fragmentActivity != null) {
            if (!(true ^ fragmentActivity.isFinishing())) {
                fragmentActivity = null;
            }
            if (fragmentActivity != null) {
                Fragment fragmentS0 = fragmentActivity.getSupportFragmentManager().s0(mf.a.f131904i);
                mf.a aVar = fragmentS0 instanceof mf.a ? (mf.a) fragmentS0 : null;
                if (aVar != null) {
                    aVar.dismiss();
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v6, types: [T, com.max.hbcommon.component.i, com.max.hbcustomview.swipebacklayout.a] */
    @dl.d
    public static final Dialog c(@dl.d Context context, @dl.d SignBirthdayDialogInfoObj birthdayInfo) {
        View view;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, birthdayInfo}, null, changeQuickRedirect, true, bb.c.m.RD, new Class[]{Context.class, SignBirthdayDialogInfoObj.class}, Dialog.class);
        if (patchProxyResultProxy.isSupported) {
            return (Dialog) patchProxyResultProxy.result;
        }
        f0.p(context, "<this>");
        f0.p(birthdayInfo, "birthdayInfo");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        p4 p4VarC = p4.c(kb.c.d(context));
        f0.o(p4VarC, "inflate(layoutInflater())");
        p4VarC.f114435e.setDataToCreate(birthdayInfo.getUikit());
        if (!com.max.hbcommon.utils.c.w(birthdayInfo.getFullscreen_imgs())) {
            List<GifImageObj> fullscreen_imgs = birthdayInfo.getFullscreen_imgs();
            f0.m(fullscreen_imgs);
            for (GifImageObj gifImageObj : fullscreen_imgs) {
                String url = gifImageObj.getUrl();
                if (url != null) {
                    if (kotlin.text.u.J1(url, "gif", true)) {
                        GifImageView gifImageView = new GifImageView(context);
                        gifImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        a(context, gifImageView, url, gifImageObj.getRepeat_count());
                        view = gifImageView;
                    } else {
                        ImageView imageView = new ImageView(context);
                        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        l.k(imageView, url);
                        view = imageView;
                    }
                    p4VarC.f114438h.addView(view, new ViewGroup.LayoutParams(-1, -1));
                }
            }
        }
        TextView textView = p4VarC.f114432b;
        DialogButtonObj button = birthdayInfo.getButton();
        textView.setText(button != null ? button.getDesc() : null);
        textView.setOnClickListener(new c(textView, p4VarC, birthdayInfo, objectRef));
        p4VarC.f114433c.setText(birthdayInfo.getTips());
        int iE1 = com.max.xiaoheihe.utils.d.e1(birthdayInfo.getBg_color());
        ConstraintLayout constraintLayout = p4VarC.f114436f;
        constraintLayout.setBackgroundColor(iE1);
        constraintLayout.setOnClickListener(null);
        p4VarC.f114434d.setBackground(ViewUtils.w(0, com.max.xiaoheihe.utils.d.I(0.0f, iE1), com.max.xiaoheihe.utils.d.I(1.0f, iE1), GradientDrawable.Orientation.TOP_BOTTOM));
        com.max.hbcommon.analytics.d.d("3", lb.d.D5, null, null);
        ?? iVar = new com.max.hbcommon.component.i(context, p4VarC.b());
        iVar.show();
        iVar.f(false);
        objectRef.f124891b = iVar;
        return (Dialog) iVar;
    }

    @dl.d
    public static final Dialog d(@dl.d Context context, @dl.e Spannable spannable, @dl.e Spannable spannable2, @dl.e Spannable spannable3, @dl.e Spannable spannable4, @dl.d com.max.xiaoheihe.view.m clickCallback) {
        Lifecycle lifecycle;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, spannable, spannable2, spannable3, spannable4, clickCallback}, null, changeQuickRedirect, true, bb.c.m.QD, new Class[]{Context.class, Spannable.class, Spannable.class, Spannable.class, Spannable.class, com.max.xiaoheihe.view.m.class}, Dialog.class);
        if (patchProxyResultProxy.isSupported) {
            return (Dialog) patchProxyResultProxy.result;
        }
        f0.p(context, "<this>");
        f0.p(clickCallback, "clickCallback");
        com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(context);
        if (!(spannable == null || kotlin.text.u.V1(spannable))) {
            fVar.y(spannable);
        }
        if (!(spannable2 == null || kotlin.text.u.V1(spannable2))) {
            fVar.l(spannable2);
        }
        if (!(spannable3 == null || kotlin.text.u.V1(spannable3))) {
            fVar.u(spannable3, new d(clickCallback, fVar));
        }
        if (!(spannable4 == null || kotlin.text.u.V1(spannable4))) {
            fVar.o(spannable4, new e(clickCallback, fVar));
        }
        final com.max.hbcommon.view.a aVarD = fVar.d();
        f0.o(aVarD, "builder.create()");
        androidx.lifecycle.y yVar = context instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) context : null;
        if (yVar != null && (lifecycle = yVar.getLifecycle()) != null) {
            lifecycle.a(new androidx.lifecycle.j() { // from class: com.max.xiaoheihe.accelworld.HBDialogManagerKt$showCustomDialog$3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // androidx.lifecycle.j
                public /* synthetic */ void j(androidx.lifecycle.y yVar2) {
                    androidx.lifecycle.i.d(this, yVar2);
                }

                @Override // androidx.lifecycle.j
                public /* synthetic */ void l(androidx.lifecycle.y yVar2) {
                    androidx.lifecycle.i.c(this, yVar2);
                }

                @Override // androidx.lifecycle.j
                public void onDestroy(@dl.d androidx.lifecycle.y owner) {
                    if (PatchProxy.proxy(new Object[]{owner}, this, changeQuickRedirect, false, bb.c.m.dE, new Class[]{androidx.lifecycle.y.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    f0.p(owner, "owner");
                    aVarD.dismiss();
                }

                @Override // androidx.lifecycle.j
                public /* synthetic */ void onStart(androidx.lifecycle.y yVar2) {
                    androidx.lifecycle.i.e(this, yVar2);
                }

                @Override // androidx.lifecycle.j
                public /* synthetic */ void onStop(androidx.lifecycle.y yVar2) {
                    androidx.lifecycle.i.f(this, yVar2);
                }

                @Override // androidx.lifecycle.j
                public /* synthetic */ void q(androidx.lifecycle.y yVar2) {
                    androidx.lifecycle.i.a(this, yVar2);
                }
            });
        }
        aVarD.show();
        return aVarD;
    }

    public static final void e(@dl.e Context context, @dl.e UiKitViewObj uiKitViewObj) {
        if (PatchProxy.proxy(new Object[]{context, uiKitViewObj}, null, changeQuickRedirect, true, bb.c.m.UD, new Class[]{Context.class, UiKitViewObj.class}, Void.TYPE).isSupported) {
            return;
        }
        FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
        if (fragmentActivity == null) {
            Activity activityA = com.max.hbutils.utils.e.b().a();
            fragmentActivity = activityA instanceof FragmentActivity ? (FragmentActivity) activityA : null;
        }
        if (fragmentActivity != null) {
            FragmentActivity fragmentActivity2 = fragmentActivity.isFinishing() ^ true ? fragmentActivity : null;
            if (fragmentActivity2 == null || uiKitViewObj == null) {
                return;
            }
            mf.a aVarA = mf.a.f131902g.a(uiKitViewObj);
            aVarA.setCancelable(false);
            aVarA.M3(fragmentActivity2.getSupportFragmentManager(), mf.a.f131904i);
        }
    }

    public static final void f(@dl.e Context context) {
        if (PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.m.TD, new Class[]{Context.class}, Void.TYPE).isSupported || context == null || !MMKVManager.f71329a.d("common", ad.c.f1228h, true, false) || com.max.hbutils.utils.u.b(context) || !com.max.hbutils.utils.u.d(context)) {
            return;
        }
        com.max.xiaoheihe.utils.viewprioritymanager.a aVar = com.max.xiaoheihe.utils.viewprioritymanager.a.f95777a;
        ViewPriority viewPriority = ViewPriority.LOW;
        if (aVar.c(viewPriority.getValue())) {
            aVar.a(viewPriority.getValue());
            new com.max.hbcommon.view.a.f(context).y("小黑盒现已支持暗色模式").l("进入「设置-通用设置-暗色模式」自行修改").t(R.string.go_to_settings, new f(context)).r(g.f76730b).F();
        }
    }
}
