package com.max.xiaoheihe.flutter.pigeon;

import android.app.Activity;
import android.content.Context;
import android.graphics.BitmapFactory;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.max.hbcommon.utils.c;
import com.max.hbimage.b;
import com.max.hbminiprogram.bean.ScreenStyleInfoObj;
import com.max.hbpermission.PermissionManager;
import com.max.hbshare.bean.HBShareData;
import com.max.hbutils.utils.k;
import com.max.hbutils.utils.s;
import com.max.heybox.hblog.g;
import com.max.xiaoheihe.accelworld.AccelWorldShareKt;
import com.max.xiaoheihe.bean.share.ScreenShareInfoObj;
import com.max.xiaoheihe.bean.share.ScreenUploadInfo;
import com.max.xiaoheihe.okflutter.pigeon.IHybridShare;
import com.max.xiaoheihe.utils.imageviewer.ExtentionsKt;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.media.UMImage;
import dl.d;
import dl.e;
import io.reactivex.android.schedulers.a;
import io.reactivex.z;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: HBHybridShare.kt */
/* JADX INFO: loaded from: classes3.dex */
@t0({"SMAP\nHBHybridShare.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HBHybridShare.kt\ncom/max/xiaoheihe/flutter/pigeon/HBHybridShare\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,269:1\n1855#2,2:270\n*S KotlinDebug\n*F\n+ 1 HBHybridShare.kt\ncom/max/xiaoheihe/flutter/pigeon/HBHybridShare\n*L\n170#1:270,2\n*E\n"})
@o(parameters = 0)
public final class HBHybridShare implements IHybridShare.HybridShareApi {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    private Context context;

    /* JADX INFO: compiled from: HBHybridShare.kt */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IHybridShare.HybridShareMedia.valuesCustom().length];
            try {
                iArr[IHybridShare.HybridShareMedia.WEIXIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IHybridShare.HybridShareMedia.WEIXIN_CIRCLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IHybridShare.HybridShareMedia.QQ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IHybridShare.HybridShareMedia.QZONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[IHybridShare.HybridShareMedia.SINA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[IHybridShare.HybridShareMedia.BYTEDANCE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[IHybridShare.HybridShareMedia.BYTEDANCE_PUBLISH.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public HBHybridShare(@d Context context) {
        f0.p(context, "context");
        this.context = context;
    }

    @Override // com.max.xiaoheihe.okflutter.pigeon.IHybridShare.HybridShareApi
    public /* bridge */ /* synthetic */ Boolean canShare(IHybridShare.HybridShareMedia hybridShareMedia) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hybridShareMedia}, this, changeQuickRedirect, false, 22036, new Class[]{IHybridShare.HybridShareMedia.class}, Boolean.class);
        return patchProxyResultProxy.isSupported ? (Boolean) patchProxyResultProxy.result : Boolean.valueOf(m40canShare(hybridShareMedia));
    }

    /* JADX INFO: renamed from: canShare, reason: collision with other method in class */
    public boolean m40canShare(@d IHybridShare.HybridShareMedia platform) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{platform}, this, changeQuickRedirect, false, 22035, new Class[]{IHybridShare.HybridShareMedia.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(platform, "platform");
        return platform == IHybridShare.HybridShareMedia.WEIXIN || platform == IHybridShare.HybridShareMedia.WEIXIN_CIRCLE || platform == IHybridShare.HybridShareMedia.QQ || platform == IHybridShare.HybridShareMedia.QZONE || platform == IHybridShare.HybridShareMedia.SINA || platform == IHybridShare.HybridShareMedia.BYTEDANCE || platform == IHybridShare.HybridShareMedia.BYTEDANCE_PUBLISH;
    }

    @d
    public final Context getContext() {
        return this.context;
    }

    public final void setContext(@d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 22032, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "<set-?>");
        this.context = context;
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [com.max.xiaoheihe.flutter.pigeon.HBHybridShare$share$listener$1, com.umeng.socialize.UMShareListener] */
    @Override // com.max.xiaoheihe.okflutter.pigeon.IHybridShare.HybridShareApi
    public void share(@d IHybridShare.HybridShareMedia platform, @d IHybridShare.HybridShareContent content, @d final IHybridShare.Result<IHybridShare.HybridShareResult> result) {
        if (PatchProxy.proxy(new Object[]{platform, content, result}, this, changeQuickRedirect, false, 22033, new Class[]{IHybridShare.HybridShareMedia.class, IHybridShare.HybridShareContent.class, IHybridShare.Result.class}, Void.TYPE).isSupported) {
        }
        f0.p(platform, "platform");
        f0.p(content, "content");
        f0.p(result, "result");
        IHybridShare.ShareType type = content.getType();
        f0.o(type, "content.type");
        String title = content.getTitle();
        String text = content.getText();
        final String imageUrl = content.getImageUrl();
        String targetUrl = content.getTargetUrl();
        UMImage uMImage = !c.u(imageUrl) ? new UMImage(this.context, imageUrl) : null;
        final ?? r10 = new UMShareListener() { // from class: com.max.xiaoheihe.flutter.pigeon.HBHybridShare$share$listener$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.umeng.socialize.UMShareListener
            public void onCancel(@e SHARE_MEDIA share_media) {
            }

            @Override // com.umeng.socialize.UMShareListener
            public void onError(@e SHARE_MEDIA share_media, @e Throwable th2) {
                if (PatchProxy.proxy(new Object[]{share_media, th2}, this, changeQuickRedirect, false, 22043, new Class[]{SHARE_MEDIA.class, Throwable.class}, Void.TYPE).isSupported) {
                    return;
                }
                result.success(new IHybridShare.HybridShareResult.Builder().setSuccess(Boolean.FALSE).setMessage(th2 != null ? th2.getMessage() : null).build());
            }

            @Override // com.umeng.socialize.UMShareListener
            public void onResult(@e SHARE_MEDIA share_media) {
                if (PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, 22042, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported) {
                    return;
                }
                result.success(new IHybridShare.HybridShareResult.Builder().setSuccess(Boolean.TRUE).build());
            }

            @Override // com.umeng.socialize.UMShareListener
            public void onStart(@e SHARE_MEDIA share_media) {
            }
        };
        HBShareData hBShareData = new HBShareData(false, false, title, text, targetUrl, null, uMImage, r10, null, null, null, null, null, bb.c.k.f33879u1, null);
        g.f74531b.q("HBHybridShare, share, platform = " + platform + ", title = " + title + ", " + text + ", " + imageUrl + ", targetUrl = " + targetUrl);
        switch (WhenMappings.$EnumSwitchMapping$0[platform.ordinal()]) {
            case 1:
                if (type == IHybridShare.ShareType.ONLY_IMAGE && uMImage != null) {
                    com.max.hbshare.d.w(this.context, uMImage, text, r10);
                } else {
                    com.max.hbshare.d.C(this.context, hBShareData);
                }
                break;
            case 2:
                if (type == IHybridShare.ShareType.ONLY_IMAGE && uMImage != null) {
                    com.max.hbshare.d.x(this.context, uMImage, text, r10);
                } else {
                    com.max.hbshare.d.D(this.context, hBShareData);
                }
                break;
            case 3:
                if (type == IHybridShare.ShareType.ONLY_IMAGE && uMImage != null) {
                    com.max.hbshare.d.t(this.context, uMImage, text, r10);
                } else {
                    com.max.hbshare.d.z(this.context, hBShareData);
                }
                break;
            case 4:
                if (type == IHybridShare.ShareType.ONLY_IMAGE && uMImage != null) {
                    com.max.hbshare.d.u(this.context, uMImage, text, r10);
                } else {
                    com.max.hbshare.d.A(this.context, hBShareData);
                }
                break;
            case 5:
                if (type == IHybridShare.ShareType.ONLY_IMAGE && uMImage != null) {
                    com.max.hbshare.d.v(this.context, uMImage, text, r10);
                } else {
                    com.max.hbshare.d.B(this.context, hBShareData);
                }
                break;
            case 6:
            case 7:
                if (type == IHybridShare.ShareType.ONLY_IMAGE && !c.u(imageUrl)) {
                    PermissionManager permissionManager = PermissionManager.f71603a;
                    Context context = this.context;
                    f0.n(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                    permissionManager.T((FragmentActivity) context, new com.max.hbpermission.c() { // from class: com.max.xiaoheihe.flutter.pigeon.HBHybridShare.share.1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // com.max.hbpermission.c
                        public final void onResult() {
                            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22037, new Class[0], Void.TYPE).isSupported) {
                                return;
                            }
                            z<File> zVarA4 = b.i(com.max.hbshare.d.d(HBHybridShare.this.getContext()), new b.s() { // from class: com.max.xiaoheihe.flutter.pigeon.HBHybridShare$share$1$onResult$1
                                public static ChangeQuickRedirect changeQuickRedirect;

                                @Override // com.max.hbimage.b.s
                                public final String getFileName(String str) {
                                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 22038, new Class[]{String.class}, String.class);
                                    return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : s.d(str);
                                }
                            }, imageUrl).I5(io.reactivex.schedulers.b.d()).a4(a.c());
                            final HBHybridShare hBHybridShare = HBHybridShare.this;
                            final HBHybridShare$share$listener$1 hBHybridShare$share$listener$1 = r10;
                            zVarA4.J5(new com.max.hbcommon.network.d<File>() { // from class: com.max.xiaoheihe.flutter.pigeon.HBHybridShare$share$1$onResult$2
                                public static ChangeQuickRedirect changeQuickRedirect;

                                @Override // com.max.hbcommon.network.d, io.reactivex.g0
                                public void onError(@d Throwable e10) {
                                    if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 22039, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                                        return;
                                    }
                                    f0.p(e10, "e");
                                }

                                public void onNext(@d File file) {
                                    if (PatchProxy.proxy(new Object[]{file}, this, changeQuickRedirect, false, 22040, new Class[]{File.class}, Void.TYPE).isSupported) {
                                        return;
                                    }
                                    f0.p(file, "file");
                                    if (file.exists()) {
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(file.getAbsolutePath());
                                        Context context2 = hBHybridShare.getContext();
                                        f0.n(context2, "null cannot be cast to non-null type android.app.Activity");
                                        com.max.hbshare.d.s((Activity) context2, arrayList, null, hBHybridShare$share$listener$1);
                                    }
                                }

                                @Override // com.max.hbcommon.network.d, io.reactivex.g0
                                public /* bridge */ /* synthetic */ void onNext(Object obj) {
                                    if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 22041, new Class[]{Object.class}, Void.TYPE).isSupported) {
                                        return;
                                    }
                                    onNext((File) obj);
                                }
                            });
                        }
                    });
                    break;
                }
                break;
        }
    }

    @Override // com.max.xiaoheihe.okflutter.pigeon.IHybridShare.HybridShareApi
    public void shareScreenshot(@d List<byte[]> images, @e Map<Object, ? extends Object> map, @d final IHybridShare.Result<IHybridShare.HybridShareResult> result) {
        Object objA;
        Object objA2;
        Object obj;
        if (PatchProxy.proxy(new Object[]{images, map, result}, this, changeQuickRedirect, false, 22034, new Class[]{List.class, Map.class, IHybridShare.Result.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(images, "images");
        f0.p(result, "result");
        Context context = this.context;
        if (context instanceof FragmentActivity) {
            f0.n(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            if (!((FragmentActivity) context).isFinishing()) {
                Context context2 = this.context;
                f0.n(context2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                FragmentActivity fragmentActivity = (FragmentActivity) context2;
                ArrayList arrayList = new ArrayList();
                for (byte[] bArr : images) {
                    if (bArr.length <= 8) {
                        result.error(new IllegalArgumentException("The screenshot must be a png byte stream."));
                    } else {
                        Context context3 = this.context;
                        if (context3 instanceof FragmentActivity) {
                            f0.n(context3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                            if (!((FragmentActivity) context3).isFinishing()) {
                                arrayList.add(BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
                            }
                        }
                    }
                }
                com.max.hbshare.c.b bVar = new com.max.hbshare.c.b("web", new UMShareListener() { // from class: com.max.xiaoheihe.flutter.pigeon.HBHybridShare$shareScreenshot$shareListener$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.umeng.socialize.UMShareListener
                    public void onCancel(@d SHARE_MEDIA share_media) {
                        if (PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, 22049, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        f0.p(share_media, "share_media");
                        IHybridShare.HybridShareResult.Builder builder = new IHybridShare.HybridShareResult.Builder();
                        builder.setSuccess(Boolean.FALSE);
                        builder.setMessage("Cancelled");
                        result.success(builder.build());
                    }

                    @Override // com.umeng.socialize.UMShareListener
                    public void onError(@d SHARE_MEDIA share_media, @d Throwable throwable) {
                        if (PatchProxy.proxy(new Object[]{share_media, throwable}, this, changeQuickRedirect, false, 22048, new Class[]{SHARE_MEDIA.class, Throwable.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        f0.p(share_media, "share_media");
                        f0.p(throwable, "throwable");
                        IHybridShare.HybridShareResult.Builder builder = new IHybridShare.HybridShareResult.Builder();
                        builder.setSuccess(Boolean.FALSE);
                        builder.setMessage(throwable.getMessage());
                        result.success(builder.build());
                    }

                    @Override // com.umeng.socialize.UMShareListener
                    public void onResult(@d SHARE_MEDIA share_media) {
                        if (PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, 22047, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        f0.p(share_media, "share_media");
                        IHybridShare.HybridShareResult.Builder builder = new IHybridShare.HybridShareResult.Builder();
                        builder.setSuccess(Boolean.TRUE);
                        builder.setMessage(share_media.getName());
                        result.success(builder.build());
                    }

                    @Override // com.umeng.socialize.UMShareListener
                    public void onStart(@d SHARE_MEDIA share_media) {
                        if (PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, 22046, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        f0.p(share_media, "share_media");
                    }
                });
                LifecycleCoroutineScope lifecycleCoroutineScopeA = androidx.lifecycle.z.a(fragmentActivity);
                final io.reactivex.disposables.a aVar = new io.reactivex.disposables.a();
                Object objA3 = null;
                if (map != null) {
                    try {
                        String strP = k.p(map.get("upload_info"));
                        if (strP != null) {
                            f0.o(strP, "serialize(get(\"upload_info\"))");
                            objA = k.a(strP, ScreenUploadInfo.class);
                        } else {
                            objA = null;
                        }
                    } catch (Throwable unused) {
                    }
                    try {
                        String strP2 = k.p(map.get("share_info"));
                        if (strP2 != null) {
                            f0.o(strP2, "serialize(get(\"share_info\"))");
                            objA2 = k.a(strP2, ScreenShareInfoObj.class);
                        } else {
                            objA2 = null;
                        }
                    } catch (Throwable unused2) {
                    }
                    try {
                        String strP3 = k.p(map.get("style_info"));
                        if (strP3 != null) {
                            f0.o(strP3, "serialize(get(\"style_info\"))");
                            objA3 = k.a(strP3, ScreenStyleInfoObj.class);
                        }
                    } catch (Throwable unused3) {
                    }
                    Object obj2 = objA;
                    obj = objA3;
                    objA3 = obj2;
                } else {
                    obj = null;
                    objA2 = null;
                }
                Lifecycle lifecycle = fragmentActivity.getLifecycle();
                f0.o(lifecycle, "activity.lifecycle");
                ExtentionsKt.g(lifecycle, new yh.a<b2>() { // from class: com.max.xiaoheihe.flutter.pigeon.HBHybridShare.shareScreenshot.3
                    public static ChangeQuickRedirect changeQuickRedirect;

                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.a
                    public /* bridge */ /* synthetic */ b2 invoke() {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22045, new Class[0], Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        invoke2();
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22044, new Class[0], Void.TYPE).isSupported) {
                            return;
                        }
                        aVar.f();
                    }
                });
                if (!arrayList.isEmpty()) {
                    AccelWorldShareKt.d(fragmentActivity, arrayList, (ScreenUploadInfo) objA3, (ScreenShareInfoObj) objA2, (ScreenStyleInfoObj) obj, bVar, lifecycleCoroutineScopeA, aVar);
                    return;
                }
                return;
            }
        }
        result.error(new Exception("Native 500"));
    }
}
