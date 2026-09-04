package com.max.xiaoheihe.module.mall.cardshare.base.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.LinearLayout;
import com.max.hbcommon.component.bottomsheet.BottomSheetsPictureShare;
import com.max.hbutils.utils.c;
import com.max.xiaoheihe.bean.ShareInfoObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.x70;
import dl.d;
import java.io.File;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import yh.l;

/* JADX INFO: compiled from: SaveImageToLocal.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class SaveImageToLocalKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final /* synthetic */ void a() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 41209, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        d();
    }

    @d
    public static final View b(@d final BottomSheetsPictureShare bottomSheetsPictureShare, @d final Bitmap bitmap, @d final com.max.hbcommon.base.d baseFragment, @d x70 sharePanelViewBinding, @d final ShareInfoObj shareInfoObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bottomSheetsPictureShare, bitmap, baseFragment, sharePanelViewBinding, shareInfoObj}, null, changeQuickRedirect, true, 41206, new Class[]{BottomSheetsPictureShare.class, Bitmap.class, com.max.hbcommon.base.d.class, x70.class, ShareInfoObj.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(bottomSheetsPictureShare, "<this>");
        f0.p(bitmap, "bitmap");
        f0.p(baseFragment, "baseFragment");
        f0.p(sharePanelViewBinding, "sharePanelViewBinding");
        f0.p(shareInfoObj, "shareInfoObj");
        final LinearLayout linearLayout = sharePanelViewBinding.f117438f;
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.mall.cardshare.base.widget.SaveImageToLocalKt$initSaveImageToLocal$1$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41210, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                bottomSheetsPictureShare.dismiss();
                tf.a.a(shareInfoObj, com.max.hbshare.d.f72587i);
                com.max.hbcommon.base.d dVar = baseFragment;
                Bitmap bitmap2 = bitmap;
                Context context = linearLayout.getContext();
                f0.o(context, "context");
                com.max.xiaoheihe.module.mall.cardshare.fragment.actions.a.d(dVar, bitmap2, context, new l<File, b2>() { // from class: com.max.xiaoheihe.module.mall.cardshare.base.widget.SaveImageToLocalKt$initSaveImageToLocal$1$1.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    public final void a(@d File it) {
                        if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 41211, new Class[]{File.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        f0.p(it, "it");
                        SaveImageToLocalKt.a();
                    }

                    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(File file) {
                        PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[]{file}, this, changeQuickRedirect, false, 41212, new Class[]{Object.class}, Object.class);
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

    @d
    public static final View c(@d final BottomSheetsPictureShare bottomSheetsPictureShare, @d final com.max.hbcommon.base.d baseFragment, @d x70 sharePanelViewBinding, @d final ShareInfoObj shareInfoObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bottomSheetsPictureShare, baseFragment, sharePanelViewBinding, shareInfoObj}, null, changeQuickRedirect, true, 41207, new Class[]{BottomSheetsPictureShare.class, com.max.hbcommon.base.d.class, x70.class, ShareInfoObj.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(bottomSheetsPictureShare, "<this>");
        f0.p(baseFragment, "baseFragment");
        f0.p(sharePanelViewBinding, "sharePanelViewBinding");
        f0.p(shareInfoObj, "shareInfoObj");
        final LinearLayout linearLayout = sharePanelViewBinding.f117438f;
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.mall.cardshare.base.widget.SaveImageToLocalKt$initSaveImageToLocalV2$1$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41213, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                final BottomSheetsPictureShare bottomSheetsPictureShare2 = bottomSheetsPictureShare;
                final ShareInfoObj shareInfoObj2 = shareInfoObj;
                final com.max.hbcommon.base.d dVar = baseFragment;
                final LinearLayout linearLayout2 = linearLayout;
                bottomSheetsPictureShare2.m4(true, new l<Bitmap, b2>() { // from class: com.max.xiaoheihe.module.mall.cardshare.base.widget.SaveImageToLocalKt$initSaveImageToLocalV2$1$1.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void a(@d Bitmap shareBitmap) {
                        if (PatchProxy.proxy(new Object[]{shareBitmap}, this, changeQuickRedirect, false, 41214, new Class[]{Bitmap.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        f0.p(shareBitmap, "shareBitmap");
                        bottomSheetsPictureShare2.dismiss();
                        tf.a.a(shareInfoObj2, com.max.hbshare.d.f72587i);
                        com.max.hbcommon.base.d dVar2 = dVar;
                        Context context = linearLayout2.getContext();
                        f0.o(context, "context");
                        com.max.xiaoheihe.module.mall.cardshare.fragment.actions.a.d(dVar2, shareBitmap, context, new l<File, b2>() { // from class: com.max.xiaoheihe.module.mall.cardshare.base.widget.SaveImageToLocalKt.initSaveImageToLocalV2.1.1.1.1
                            public static ChangeQuickRedirect changeQuickRedirect;

                            public final void a(@d File it) {
                                if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 41216, new Class[]{File.class}, Void.TYPE).isSupported) {
                                    return;
                                }
                                f0.p(it, "it");
                                SaveImageToLocalKt.a();
                            }

                            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(File file) {
                                PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[]{file}, this, changeQuickRedirect, false, 41217, new Class[]{Object.class}, Object.class);
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
                        PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[]{bitmap}, this, changeQuickRedirect, false, 41215, new Class[]{Object.class}, Object.class);
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

    private static final void d() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 41208, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        c.f(com.max.xiaoheihe.utils.d.Z());
    }
}
