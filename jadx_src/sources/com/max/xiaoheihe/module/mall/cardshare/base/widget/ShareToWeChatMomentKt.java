package com.max.xiaoheihe.module.mall.cardshare.base.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.LinearLayout;
import com.max.hbcommon.component.bottomsheet.BottomSheetsPictureShare;
import com.max.hbcommon.component.bottomsheet.h;
import com.max.hbshare.bean.HBShareData;
import com.max.hbshare.c;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.ShareInfoObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.socialize.media.UMImage;
import df.x70;
import dl.d;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import yh.l;

/* JADX INFO: compiled from: ShareToWeChatMoment.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class ShareToWeChatMomentKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: ShareToWeChatMoment.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BottomSheetsPictureShare f90112b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Bitmap f90113c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ LinearLayout f90114d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ c.b f90115e;

        a(BottomSheetsPictureShare bottomSheetsPictureShare, Bitmap bitmap, LinearLayout linearLayout, c.b bVar) {
            this.f90112b = bottomSheetsPictureShare;
            this.f90113c = bitmap;
            this.f90114d = linearLayout;
            this.f90115e = bVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41264, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f90112b.dismiss();
            Bitmap bitmap = this.f90113c;
            Context context = this.f90114d.getContext();
            f0.o(context, "this.context");
            ShareToWeChatMomentKt.a(bitmap, context, this.f90115e);
        }
    }

    /* JADX INFO: compiled from: ShareToWeChatMoment.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f90116b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ShareInfoObj f90117c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ LinearLayout f90118d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ c.b f90119e;

        b(h hVar, ShareInfoObj shareInfoObj, LinearLayout linearLayout, c.b bVar) {
            this.f90116b = hVar;
            this.f90117c = shareInfoObj;
            this.f90118d = linearLayout;
            this.f90119e = bVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41265, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f90116b.dismiss();
            ShareInfoObj shareInfoObj = this.f90117c;
            Context context = this.f90118d.getContext();
            f0.o(context, "context");
            ShareToWeChatMomentKt.b(shareInfoObj, context, this.f90119e);
        }
    }

    public static final /* synthetic */ void a(Bitmap bitmap, Context context, c.b bVar) {
        if (PatchProxy.proxy(new Object[]{bitmap, context, bVar}, null, changeQuickRedirect, true, 41262, new Class[]{Bitmap.class, Context.class, c.b.class}, Void.TYPE).isSupported) {
            return;
        }
        f(bitmap, context, bVar);
    }

    public static final /* synthetic */ void b(ShareInfoObj shareInfoObj, Context context, c.b bVar) {
        if (PatchProxy.proxy(new Object[]{shareInfoObj, context, bVar}, null, changeQuickRedirect, true, 41263, new Class[]{ShareInfoObj.class, Context.class, c.b.class}, Void.TYPE).isSupported) {
            return;
        }
        g(shareInfoObj, context, bVar);
    }

    @d
    public static final View c(@d h hVar, @d x70 sharePanelViewBinding, @d ShareInfoObj shareInfoObj, @d c.b shareReportListener) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hVar, sharePanelViewBinding, shareInfoObj, shareReportListener}, null, changeQuickRedirect, true, 41259, new Class[]{h.class, x70.class, ShareInfoObj.class, c.b.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(hVar, "<this>");
        f0.p(sharePanelViewBinding, "sharePanelViewBinding");
        f0.p(shareInfoObj, "shareInfoObj");
        f0.p(shareReportListener, "shareReportListener");
        LinearLayout linearLayout = sharePanelViewBinding.f117440h;
        linearLayout.setOnClickListener(new b(hVar, shareInfoObj, linearLayout, shareReportListener));
        f0.o(linearLayout, "sharePanelViewBinding.vg…        )\n        }\n    }");
        return linearLayout;
    }

    @d
    public static final View d(@d BottomSheetsPictureShare bottomSheetsPictureShare, @d Bitmap shareBitmap, @d x70 sharePanelViewBinding, @d c.b shareReportListener) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bottomSheetsPictureShare, shareBitmap, sharePanelViewBinding, shareReportListener}, null, changeQuickRedirect, true, 41257, new Class[]{BottomSheetsPictureShare.class, Bitmap.class, x70.class, c.b.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(bottomSheetsPictureShare, "<this>");
        f0.p(shareBitmap, "shareBitmap");
        f0.p(sharePanelViewBinding, "sharePanelViewBinding");
        f0.p(shareReportListener, "shareReportListener");
        LinearLayout linearLayout = sharePanelViewBinding.f117440h;
        linearLayout.setOnClickListener(new a(bottomSheetsPictureShare, shareBitmap, linearLayout, shareReportListener));
        f0.o(linearLayout, "sharePanelViewBinding.vg…        )\n        }\n    }");
        return linearLayout;
    }

    @d
    public static final View e(@d final BottomSheetsPictureShare bottomSheetsPictureShare, @d x70 sharePanelViewBinding, @d final c.b shareReportListener) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bottomSheetsPictureShare, sharePanelViewBinding, shareReportListener}, null, changeQuickRedirect, true, 41258, new Class[]{BottomSheetsPictureShare.class, x70.class, c.b.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(bottomSheetsPictureShare, "<this>");
        f0.p(sharePanelViewBinding, "sharePanelViewBinding");
        f0.p(shareReportListener, "shareReportListener");
        final LinearLayout linearLayout = sharePanelViewBinding.f117440h;
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.mall.cardshare.base.widget.ShareToWeChatMomentKt$initShareToWeChatMomentsV2$1$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41266, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                final BottomSheetsPictureShare bottomSheetsPictureShare2 = bottomSheetsPictureShare;
                final LinearLayout linearLayout2 = linearLayout;
                final c.b bVar = shareReportListener;
                bottomSheetsPictureShare2.m4(true, new l<Bitmap, b2>() { // from class: com.max.xiaoheihe.module.mall.cardshare.base.widget.ShareToWeChatMomentKt$initShareToWeChatMomentsV2$1$1.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void a(@d Bitmap shareBitmap) {
                        if (PatchProxy.proxy(new Object[]{shareBitmap}, this, changeQuickRedirect, false, 41267, new Class[]{Bitmap.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        f0.p(shareBitmap, "shareBitmap");
                        bottomSheetsPictureShare2.dismiss();
                        Context context = linearLayout2.getContext();
                        f0.o(context, "this.context");
                        ShareToWeChatMomentKt.a(shareBitmap, context, bVar);
                    }

                    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(Bitmap bitmap) {
                        PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[]{bitmap}, this, changeQuickRedirect, false, 41268, new Class[]{Object.class}, Object.class);
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

    private static final void f(Bitmap bitmap, Context context, c.b bVar) {
        if (PatchProxy.proxy(new Object[]{bitmap, context, bVar}, null, changeQuickRedirect, true, 41261, new Class[]{Bitmap.class, Context.class, c.b.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbshare.d.x(context, new UMImage(context, bitmap), null, bVar);
    }

    private static final void g(ShareInfoObj shareInfoObj, Context context, c.b bVar) {
        if (PatchProxy.proxy(new Object[]{shareInfoObj, context, bVar}, null, changeQuickRedirect, true, 41260, new Class[]{ShareInfoObj.class, Context.class, c.b.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbshare.d.D(context, new HBShareData(false, true, shareInfoObj.getShare_title(), shareInfoObj.getShare_desc(), shareInfoObj.getShare_url(), null, !com.max.hbcommon.utils.c.u(shareInfoObj.getShare_img()) ? new UMImage(context, shareInfoObj.getShare_img()) : new UMImage(context, R.drawable.share_thumbnail), bVar, null, null, null, null, null, bb.c.k.L0, null));
    }
}
