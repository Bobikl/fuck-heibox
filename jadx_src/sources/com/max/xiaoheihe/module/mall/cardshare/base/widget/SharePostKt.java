package com.max.xiaoheihe.module.mall.cardshare.base.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import com.max.commentimagepainter.sharecard.ShareCardDrawUtilsKt;
import com.max.commentimagepainter.sharecard.bean.CardObj;
import com.max.commentimagepainter.sharecard.bean.CardObjV2;
import com.max.hbcommon.base.d;
import com.max.hbcommon.component.bottomsheet.BottomSheetsPictureShare;
import com.max.xiaoheihe.bean.ShareInfoObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.x70;
import java.io.File;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import yh.l;

/* JADX INFO: compiled from: SharePost.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class SharePostKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f90055a = 300;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f90056b = 460;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final /* synthetic */ Bitmap a(Bitmap bitmap, Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bitmap, context}, null, changeQuickRedirect, true, 41222, new Class[]{Bitmap.class, Context.class}, Bitmap.class);
        return patchProxyResultProxy.isSupported ? (Bitmap) patchProxyResultProxy.result : c(bitmap, context);
    }

    public static final /* synthetic */ void b(View view, d dVar, File file, CardObj cardObj, ShareInfoObj shareInfoObj) {
        if (PatchProxy.proxy(new Object[]{view, dVar, file, cardObj, shareInfoObj}, null, changeQuickRedirect, true, 41223, new Class[]{View.class, d.class, File.class, CardObj.class, ShareInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f(view, dVar, file, cardObj, shareInfoObj);
    }

    private static final Bitmap c(Bitmap bitmap, Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bitmap, context}, null, changeQuickRedirect, true, 41220, new Class[]{Bitmap.class, Context.class}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        ic.a aVar = ic.a.f119343a;
        int iB = aVar.b(context, 300);
        int iB2 = aVar.b(context, 460);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iB, iB2, Bitmap.Config.ARGB_8888);
        f0.o(bitmapCreateBitmap, "createBitmap(cropWidth, … Bitmap.Config.ARGB_8888)");
        Rect rect = new Rect(0, 0, iB, iB2);
        Path pathB = ShareCardDrawUtilsKt.b();
        RectF rectF = new RectF();
        pathB.computeBounds(rectF, true);
        float fWidth = iB / rectF.width();
        float fHeight = iB2 / rectF.height();
        Matrix matrix = new Matrix();
        matrix.postScale(fWidth, fHeight, 0.0f, 0.0f);
        pathB.transform(matrix);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.clipPath(pathB);
        canvas.drawBitmap(bitmap, rect, rect, (Paint) null);
        return bitmapCreateBitmap;
    }

    @dl.d
    public static final View d(@dl.d final BottomSheetsPictureShare bottomSheetsPictureShare, @dl.d final Bitmap shareBitmap, @dl.d final d baseFragment, @dl.d x70 sharePanelViewBinding, @dl.d final ShareInfoObj shareInfoObj, @dl.d final CardObj cardObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bottomSheetsPictureShare, shareBitmap, baseFragment, sharePanelViewBinding, shareInfoObj, cardObj}, null, changeQuickRedirect, true, 41218, new Class[]{BottomSheetsPictureShare.class, Bitmap.class, d.class, x70.class, ShareInfoObj.class, CardObj.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(bottomSheetsPictureShare, "<this>");
        f0.p(shareBitmap, "shareBitmap");
        f0.p(baseFragment, "baseFragment");
        f0.p(sharePanelViewBinding, "sharePanelViewBinding");
        f0.p(shareInfoObj, "shareInfoObj");
        f0.p(cardObj, "cardObj");
        final LinearLayout linearLayout = sharePanelViewBinding.f117436d;
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.mall.cardshare.base.widget.SharePostKt$initSharePost$1$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41224, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                bottomSheetsPictureShare.dismiss();
                tf.a.a(shareInfoObj, com.max.hbshare.d.f72591m);
                d dVar = baseFragment;
                Bitmap bitmap = shareBitmap;
                Context context = linearLayout.getContext();
                f0.o(context, "context");
                Bitmap bitmapA = SharePostKt.a(bitmap, context);
                Context context2 = linearLayout.getContext();
                f0.o(context2, "context");
                final LinearLayout linearLayout2 = linearLayout;
                final d dVar2 = baseFragment;
                final CardObj cardObj2 = cardObj;
                final ShareInfoObj shareInfoObj2 = shareInfoObj;
                com.max.xiaoheihe.module.mall.cardshare.fragment.actions.a.d(dVar, bitmapA, context2, new l<File, b2>() { // from class: com.max.xiaoheihe.module.mall.cardshare.base.widget.SharePostKt$initSharePost$1$1.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void a(@dl.d File file) {
                        if (PatchProxy.proxy(new Object[]{file}, this, changeQuickRedirect, false, 41225, new Class[]{File.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        f0.p(file, "file");
                        LinearLayout invoke = linearLayout2;
                        f0.o(invoke, "invoke");
                        SharePostKt.b(invoke, dVar2, file, cardObj2, shareInfoObj2);
                    }

                    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(File file) {
                        PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[]{file}, this, changeQuickRedirect, false, 41226, new Class[]{Object.class}, Object.class);
                        if (patchProxyResultProxy2.isSupported) {
                            return patchProxyResultProxy2.result;
                        }
                        a(file);
                        return b2.f124493a;
                    }
                });
            }
        });
        f0.o(linearLayout, "sharePanelViewBinding.vg…        )\n        }\n    }");
        return linearLayout;
    }

    @dl.d
    public static final View e(@dl.d final BottomSheetsPictureShare bottomSheetsPictureShare, @dl.d final d baseFragment, @dl.d x70 sharePanelViewBinding, @dl.d final ShareInfoObj shareInfoObj, @dl.d final CardObjV2 cardObjV2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bottomSheetsPictureShare, baseFragment, sharePanelViewBinding, shareInfoObj, cardObjV2}, null, changeQuickRedirect, true, 41219, new Class[]{BottomSheetsPictureShare.class, d.class, x70.class, ShareInfoObj.class, CardObjV2.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(bottomSheetsPictureShare, "<this>");
        f0.p(baseFragment, "baseFragment");
        f0.p(sharePanelViewBinding, "sharePanelViewBinding");
        f0.p(shareInfoObj, "shareInfoObj");
        f0.p(cardObjV2, "cardObjV2");
        final LinearLayout linearLayout = sharePanelViewBinding.f117436d;
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.mall.cardshare.base.widget.SharePostKt$initSharePostV2$1$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41227, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                final BottomSheetsPictureShare bottomSheetsPictureShare2 = bottomSheetsPictureShare;
                final ShareInfoObj shareInfoObj2 = shareInfoObj;
                final d dVar = baseFragment;
                final LinearLayout linearLayout2 = linearLayout;
                final CardObjV2 cardObjV3 = cardObjV2;
                bottomSheetsPictureShare2.m4(false, new l<Bitmap, b2>() { // from class: com.max.xiaoheihe.module.mall.cardshare.base.widget.SharePostKt$initSharePostV2$1$1.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void a(@dl.d Bitmap shareBitmap) {
                        if (PatchProxy.proxy(new Object[]{shareBitmap}, this, changeQuickRedirect, false, 41228, new Class[]{Bitmap.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        f0.p(shareBitmap, "shareBitmap");
                        bottomSheetsPictureShare2.dismiss();
                        tf.a.a(shareInfoObj2, com.max.hbshare.d.f72591m);
                        d dVar2 = dVar;
                        Context context = linearLayout2.getContext();
                        f0.o(context, "context");
                        final d dVar3 = dVar;
                        final LinearLayout linearLayout3 = linearLayout2;
                        final CardObjV2 cardObjV4 = cardObjV3;
                        final ShareInfoObj shareInfoObj3 = shareInfoObj2;
                        com.max.xiaoheihe.module.mall.cardshare.fragment.actions.a.d(dVar2, shareBitmap, context, new l<File, b2>() { // from class: com.max.xiaoheihe.module.mall.cardshare.base.widget.SharePostKt.initSharePostV2.1.1.1.1
                            public static ChangeQuickRedirect changeQuickRedirect;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public final void a(@dl.d File file) {
                                if (PatchProxy.proxy(new Object[]{file}, this, changeQuickRedirect, false, 41230, new Class[]{File.class}, Void.TYPE).isSupported) {
                                    return;
                                }
                                f0.p(file, "file");
                                d dVar4 = dVar3;
                                Context context2 = linearLayout3.getContext();
                                f0.o(context2, "context");
                                int iD = com.max.xiaoheihe.accelworld.l.d(300, context2);
                                Context context3 = linearLayout3.getContext();
                                f0.o(context3, "context");
                                com.max.xiaoheihe.module.mall.cardshare.fragment.actions.a.g(dVar4, file, iD, com.max.xiaoheihe.accelworld.l.d(460, context3), cardObjV4, shareInfoObj3);
                            }

                            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(File file) {
                                PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[]{file}, this, changeQuickRedirect, false, 41231, new Class[]{Object.class}, Object.class);
                                if (patchProxyResultProxy2.isSupported) {
                                    return patchProxyResultProxy2.result;
                                }
                                a(file);
                                return b2.f124493a;
                            }
                        });
                    }

                    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(Bitmap bitmap) {
                        PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[]{bitmap}, this, changeQuickRedirect, false, 41229, new Class[]{Object.class}, Object.class);
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

    private static final void f(View view, d dVar, File file, CardObj cardObj, ShareInfoObj shareInfoObj) {
        if (PatchProxy.proxy(new Object[]{view, dVar, file, cardObj, shareInfoObj}, null, changeQuickRedirect, true, 41221, new Class[]{View.class, d.class, File.class, CardObj.class, ShareInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        Context context = view.getContext();
        f0.o(context, "context");
        int iD = com.max.xiaoheihe.accelworld.l.d(300, context);
        Context context2 = view.getContext();
        f0.o(context2, "context");
        com.max.xiaoheihe.module.mall.cardshare.fragment.actions.a.f(dVar, file, iD, com.max.xiaoheihe.accelworld.l.d(460, context2), cardObj, shareInfoObj);
    }
}
