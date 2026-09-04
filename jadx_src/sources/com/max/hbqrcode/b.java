package com.max.hbqrcode;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Environment;
import androidx.core.view.j1;
import com.huawei.hms.hmsscankit.ScanUtil;
import com.huawei.hms.hmsscankit.WriterException;
import com.huawei.hms.ml.scan.HmsBuildBitmapOption;
import com.huawei.hms.ml.scan.HmsScan;
import com.huawei.hms.ml.scan.HmsScanAnalyzerOptions;
import com.huawei.hms.ml.scan.HmsScanBase;
import com.max.hbcommon.utils.l;
import com.max.hbqrcode.bean.QRRedirectObj;
import com.max.hbutils.bean.Result;
import com.max.hbutils.core.BaseApplication;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.e;
import com.max.heybox.hblog.g;
import com.max.xiaoheihe.module.bbs.ChannelsDetailActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.File;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: QRCodeParseUtils.java */
/* JADX INFO: loaded from: classes12.dex */
public class b {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: QRCodeParseUtils.java */
    public class a extends com.max.hbcommon.network.d<Result<QRRedirectObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f71863b;

        a(Activity activity) {
            this.f71863b = activity;
        }

        public void onNext(Result<QRRedirectObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.k.f33444b0, new Class[]{Result.class}, Void.TYPE).isSupported || result == null || result.getResult() == null) {
                return;
            }
            b.e(result.getResult(), this.f71863b);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.k.f33467c0, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<QRRedirectObj>) obj);
        }
    }

    /* JADX INFO: renamed from: com.max.hbqrcode.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: QRCodeParseUtils.java */
    public class DialogInterfaceOnClickListenerC0579b implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f71864b;

        DialogInterfaceOnClickListenerC0579b(Activity activity) {
            this.f71864b = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.f33491d0, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            Activity activity = this.f71864b;
            if (activity instanceof ScanHandlerActivity) {
                ((ScanHandlerActivity) activity).finish();
            }
        }
    }

    public static int a(BitmapFactory.Options options, int i10, int i11) {
        int i12 = options.outHeight;
        int i13 = options.outWidth;
        int i14 = 1;
        if (i12 > i11 || i13 > i10) {
            int i15 = i12 / 2;
            int i16 = i13 / 2;
            while (i15 / i14 > i11 && i16 / i14 > i10) {
                i14 *= 2;
            }
        }
        return i14;
    }

    public static Bitmap b(String str, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.k.f33421a0, new Class[]{String.class, Integer.TYPE}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        if (i10 <= 0) {
            i10 = 200;
        }
        try {
            return ScanUtil.buildBitmap(str, HmsScanBase.QRCODE_SCAN_TYPE, i10, i10, new HmsBuildBitmapOption.Creator().setBitmapBackgroundColor(-1).setBitmapColor(j1.f21601t).setQRErrorCorrection(HmsBuildBitmapOption.ErrorCorrectionLevel.Q).setBitmapMargin(0).create());
        } catch (WriterException e10) {
            g.H("QRCodeParseUtils", e10);
            return null;
        }
    }

    private static Bitmap c(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.k.U, new Class[]{String.class}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            options.inSampleSize = Math.max(options.outWidth / ViewUtils.L(BaseApplication.a()), options.outHeight / ViewUtils.J(BaseApplication.a()));
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeFile(str, options);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void d(io.reactivex.disposables.a aVar, Activity activity, String str) {
        if (PatchProxy.proxy(new Object[]{aVar, activity, str}, null, changeQuickRedirect, true, bb.c.k.V, new Class[]{io.reactivex.disposables.a.class, Activity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        aVar.c((io.reactivex.disposables.b) dd.b.a().a(str, null).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new a(activity)));
    }

    public static void e(QRRedirectObj qRRedirectObj, Activity activity) {
        if (PatchProxy.proxy(new Object[]{qRRedirectObj, activity}, null, changeQuickRedirect, true, bb.c.k.W, new Class[]{QRRedirectObj.class, Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        f(qRRedirectObj, activity, false);
    }

    private static void f(QRRedirectObj qRRedirectObj, Activity activity, boolean z10) {
        if (PatchProxy.proxy(new Object[]{qRRedirectObj, activity, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.k.X, new Class[]{QRRedirectObj.class, Activity.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (!z10 && "alert".equals(qRRedirectObj.getAction())) {
            com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(activity);
            fVar.l(qRRedirectObj.getDesc());
            com.max.hbcommon.view.a aVarD = fVar.d();
            aVarD.u(l.e(R.string.confirm), new DialogInterfaceOnClickListenerC0579b(activity));
            aVarD.show();
            return;
        }
        if ("openweb".equals(qRRedirectObj.getAction())) {
            ob.a aVar = ob.a.f132240a;
            ob.a.p().a(activity, l.e(R.string.app_name), qRRedirectObj.getUrl());
            if ((activity instanceof ScanActivity) || (activity instanceof ScanHandlerActivity)) {
                activity.finish();
                return;
            }
            return;
        }
        if (com.max.xiaoheihe.router.c.f94902h.equals(qRRedirectObj.getAction())) {
            ob.a aVar2 = ob.a.f132240a;
            ob.a.p().c(activity, qRRedirectObj.getMaxjia());
            if ((activity instanceof ScanActivity) || (activity instanceof ScanHandlerActivity)) {
                activity.finish();
            }
        }
    }

    public static void g(Context context, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{context, str, str2}, null, changeQuickRedirect, true, bb.c.k.Y, new Class[]{Context.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (!com.max.hbcommon.utils.c.u(str2) && com.max.hbcache.c.h(str2) != -1) {
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f("任务已存在...");
            return;
        }
        if (com.max.hbcommon.utils.c.u(str)) {
            return;
        }
        DownloadManager downloadManager = (DownloadManager) context.getSystemService(ChannelsDetailActivity.f79595e4);
        String strL = l(str);
        try {
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(strL));
            File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
            if (!externalStoragePublicDirectory.exists()) {
                externalStoragePublicDirectory.mkdirs();
            }
            String strSubstring = strL.substring(strL.lastIndexOf("/") + 1);
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, strSubstring);
            long jEnqueue = downloadManager.enqueue(request);
            if (com.max.hbcommon.utils.c.u(str2)) {
                com.max.hbcache.c.y(strSubstring, jEnqueue);
            } else {
                com.max.hbcache.c.y(str2, jEnqueue);
            }
            com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.d("开始下载 可以在状态栏通知查看...");
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static String h(Context context, String str) {
        HmsScan[] hmsScanArrDecodeWithBitmap;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, bb.c.k.S, new Class[]{Context.class, String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (context == null) {
            return null;
        }
        g.x("syncDecodeQRCode, picturePath = " + str);
        Bitmap bitmapC = c(str);
        if (bitmapC == null || (hmsScanArrDecodeWithBitmap = ScanUtil.decodeWithBitmap(context, bitmapC, new HmsScanAnalyzerOptions.Creator().setHmsScanTypes(HmsScanBase.QRCODE_SCAN_TYPE, new int[0]).setPhotoMode(true).create())) == null || hmsScanArrDecodeWithBitmap.length < 1) {
            return null;
        }
        return hmsScanArrDecodeWithBitmap[0].showResult;
    }

    public static String i(Bitmap bitmap) {
        Activity activityA;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bitmap}, null, changeQuickRedirect, true, bb.c.k.T, new Class[]{Bitmap.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (bitmap == null || (activityA = e.b().a()) == null) {
            return null;
        }
        HmsScan[] hmsScanArrDecodeWithBitmap = ScanUtil.decodeWithBitmap(activityA, bitmap, new HmsScanAnalyzerOptions.Creator().setHmsScanTypes(HmsScanBase.QRCODE_SCAN_TYPE, new int[0]).setPhotoMode(true).create());
        g.x("syncDecodeQRCode, hmsScans = " + hmsScanArrDecodeWithBitmap.length);
        if (hmsScanArrDecodeWithBitmap.length < 1) {
            return null;
        }
        g.x("syncDecodeQRCode, originalValue = " + hmsScanArrDecodeWithBitmap[0].originalValue + ", " + hmsScanArrDecodeWithBitmap[0].showResult);
        return hmsScanArrDecodeWithBitmap[0].originalValue;
    }

    public static String j(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.k.Q, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        g.x("syncDecodeQRCode, picturePath = " + str);
        return i(c(str));
    }

    public static String k(Bitmap bitmap) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bitmap}, null, changeQuickRedirect, true, bb.c.k.R, new Class[]{Bitmap.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : i(bitmap);
    }

    public static String l(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.k.Z, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        try {
            return !com.max.hbcommon.utils.c.u(str) ? Pattern.compile("^(\\s*|\t|\r|\n)|(\\s*|\t|\r|\n)$").matcher(str).replaceAll("") : "";
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }
}
