package com.max.xiaoheihe.module.mall.cardshare.base.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.max.hbcommon.component.bottomsheet.BottomSheetsPictureShare;
import com.max.hbcommon.component.bottomsheet.h;
import com.max.hbpermission.PermissionManager;
import com.max.hbshare.bean.HBShareData;
import com.max.hbshare.c;
import com.max.hbshare.d;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.ShareInfoObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.socialize.media.UMImage;
import df.x70;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import yh.l;

/* JADX INFO: compiled from: ShareToQQ.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class ShareToQQKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: ShareToQQ.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BottomSheetsPictureShare f90081b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Bitmap f90082c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ LinearLayout f90083d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.max.hbshare.c.b f90084e;

        a(BottomSheetsPictureShare bottomSheetsPictureShare, Bitmap bitmap, LinearLayout linearLayout, com.max.hbshare.c.b bVar) {
            this.f90081b = bottomSheetsPictureShare;
            this.f90082c = bitmap;
            this.f90083d = linearLayout;
            this.f90084e = bVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41239, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f90081b.dismiss();
            Bitmap bitmap = this.f90082c;
            BottomSheetsPictureShare bottomSheetsPictureShare = this.f90081b;
            Context context = this.f90083d.getContext();
            f0.o(context, "context");
            ShareToQQKt.a(bitmap, bottomSheetsPictureShare, context, this.f90084e);
        }
    }

    /* JADX INFO: compiled from: ShareToQQ.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f90085b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ShareInfoObj f90086c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ LinearLayout f90087d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.max.hbshare.c.b f90088e;

        b(h hVar, ShareInfoObj shareInfoObj, LinearLayout linearLayout, com.max.hbshare.c.b bVar) {
            this.f90085b = hVar;
            this.f90086c = shareInfoObj;
            this.f90087d = linearLayout;
            this.f90088e = bVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41240, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f90085b.dismiss();
            ShareInfoObj shareInfoObj = this.f90086c;
            Context context = this.f90087d.getContext();
            f0.o(context, "context");
            ShareToQQKt.b(shareInfoObj, context, this.f90088e);
        }
    }

    /* JADX INFO: compiled from: ShareToQQ.kt */
    public static final class c implements com.max.hbpermission.c {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f90089a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Bitmap f90090b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.max.hbshare.c.b f90091c;

        c(Context context, Bitmap bitmap, com.max.hbshare.c.b bVar) {
            this.f90089a = context;
            this.f90090b = bitmap;
            this.f90091c = bVar;
        }

        @Override // com.max.hbpermission.c
        public final void onResult() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41244, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            d.t(this.f90089a, new UMImage(this.f90089a, this.f90090b), null, this.f90091c);
        }
    }

    public static final /* synthetic */ void a(Bitmap bitmap, Fragment fragment, Context context, com.max.hbshare.c.b bVar) {
        if (PatchProxy.proxy(new Object[]{bitmap, fragment, context, bVar}, null, changeQuickRedirect, true, 41237, new Class[]{Bitmap.class, Fragment.class, Context.class, com.max.hbshare.c.b.class}, Void.TYPE).isSupported) {
            return;
        }
        f(bitmap, fragment, context, bVar);
    }

    public static final /* synthetic */ void b(ShareInfoObj shareInfoObj, Context context, com.max.hbshare.c.b bVar) {
        if (PatchProxy.proxy(new Object[]{shareInfoObj, context, bVar}, null, changeQuickRedirect, true, 41238, new Class[]{ShareInfoObj.class, Context.class, com.max.hbshare.c.b.class}, Void.TYPE).isSupported) {
            return;
        }
        g(shareInfoObj, context, bVar);
    }

    @dl.d
    public static final View c(@dl.d h hVar, @dl.d x70 sharePanelViewBinding, @dl.d ShareInfoObj shareInfoObj, @dl.d com.max.hbshare.c.b shareReportListener) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hVar, sharePanelViewBinding, shareInfoObj, shareReportListener}, null, changeQuickRedirect, true, 41234, new Class[]{h.class, x70.class, ShareInfoObj.class, com.max.hbshare.c.b.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(hVar, "<this>");
        f0.p(sharePanelViewBinding, "sharePanelViewBinding");
        f0.p(shareInfoObj, "shareInfoObj");
        f0.p(shareReportListener, "shareReportListener");
        LinearLayout linearLayout = sharePanelViewBinding.f117437e;
        linearLayout.setOnClickListener(new b(hVar, shareInfoObj, linearLayout, shareReportListener));
        f0.o(linearLayout, "sharePanelViewBinding.vg…Listener)\n        }\n    }");
        return linearLayout;
    }

    @dl.d
    public static final View d(@dl.d BottomSheetsPictureShare bottomSheetsPictureShare, @dl.d Bitmap shareBitmap, @dl.d x70 sharePanelViewBinding, @dl.d com.max.hbshare.c.b shareReportListener) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bottomSheetsPictureShare, shareBitmap, sharePanelViewBinding, shareReportListener}, null, changeQuickRedirect, true, 41232, new Class[]{BottomSheetsPictureShare.class, Bitmap.class, x70.class, com.max.hbshare.c.b.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(bottomSheetsPictureShare, "<this>");
        f0.p(shareBitmap, "shareBitmap");
        f0.p(sharePanelViewBinding, "sharePanelViewBinding");
        f0.p(shareReportListener, "shareReportListener");
        LinearLayout linearLayout = sharePanelViewBinding.f117437e;
        linearLayout.setOnClickListener(new a(bottomSheetsPictureShare, shareBitmap, linearLayout, shareReportListener));
        f0.o(linearLayout, "sharePanelViewBinding.vg…        )\n        }\n    }");
        return linearLayout;
    }

    @dl.d
    public static final View e(@dl.d final BottomSheetsPictureShare bottomSheetsPictureShare, @dl.d x70 sharePanelViewBinding, @dl.d final com.max.hbshare.c.b shareReportListener) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bottomSheetsPictureShare, sharePanelViewBinding, shareReportListener}, null, changeQuickRedirect, true, 41233, new Class[]{BottomSheetsPictureShare.class, x70.class, com.max.hbshare.c.b.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(bottomSheetsPictureShare, "<this>");
        f0.p(sharePanelViewBinding, "sharePanelViewBinding");
        f0.p(shareReportListener, "shareReportListener");
        final LinearLayout linearLayout = sharePanelViewBinding.f117437e;
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.mall.cardshare.base.widget.ShareToQQKt$initShareToQQV2$1$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41241, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                final BottomSheetsPictureShare bottomSheetsPictureShare2 = bottomSheetsPictureShare;
                final LinearLayout linearLayout2 = linearLayout;
                final c.b bVar = shareReportListener;
                bottomSheetsPictureShare2.m4(true, new l<Bitmap, b2>() { // from class: com.max.xiaoheihe.module.mall.cardshare.base.widget.ShareToQQKt$initShareToQQV2$1$1.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void a(@dl.d Bitmap shareBitmap) {
                        if (PatchProxy.proxy(new Object[]{shareBitmap}, this, changeQuickRedirect, false, 41242, new Class[]{Bitmap.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        f0.p(shareBitmap, "shareBitmap");
                        bottomSheetsPictureShare2.dismiss();
                        BottomSheetsPictureShare bottomSheetsPictureShare3 = bottomSheetsPictureShare2;
                        Context context = linearLayout2.getContext();
                        f0.o(context, "context");
                        ShareToQQKt.a(shareBitmap, bottomSheetsPictureShare3, context, bVar);
                    }

                    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(Bitmap bitmap) {
                        PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[]{bitmap}, this, changeQuickRedirect, false, 41243, new Class[]{Object.class}, Object.class);
                        if (patchProxyResultProxy2.isSupported) {
                            return patchProxyResultProxy2.result;
                        }
                        a(bitmap);
                        return b2.f124493a;
                    }
                });
            }
        });
        f0.o(linearLayout, "sharePanelViewBinding.vg…        }\n        }\n    }");
        return linearLayout;
    }

    private static final void f(Bitmap bitmap, Fragment fragment, Context context, com.max.hbshare.c.b bVar) {
        FragmentActivity activity;
        if (PatchProxy.proxy(new Object[]{bitmap, fragment, context, bVar}, null, changeQuickRedirect, true, 41236, new Class[]{Bitmap.class, Fragment.class, Context.class, com.max.hbshare.c.b.class}, Void.TYPE).isSupported || (activity = fragment.getActivity()) == null) {
            return;
        }
        PermissionManager.f71603a.T(activity, new c(context, bitmap, bVar));
    }

    private static final void g(ShareInfoObj shareInfoObj, Context context, com.max.hbshare.c.b bVar) {
        if (PatchProxy.proxy(new Object[]{shareInfoObj, context, bVar}, null, changeQuickRedirect, true, 41235, new Class[]{ShareInfoObj.class, Context.class, com.max.hbshare.c.b.class}, Void.TYPE).isSupported) {
            return;
        }
        d.z(context, new HBShareData(false, true, shareInfoObj.getShare_title(), shareInfoObj.getShare_desc(), shareInfoObj.getShare_url(), null, !com.max.hbcommon.utils.c.u(shareInfoObj.getShare_img()) ? new UMImage(context, shareInfoObj.getShare_img()) : new UMImage(context, R.drawable.share_thumbnail), bVar, null, null, null, null, null, bb.c.k.L0, null));
    }
}
