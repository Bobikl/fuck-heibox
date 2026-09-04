package com.max.xiaoheihe.module.upload;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.Log;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.max.hbcommon.network.p;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.s;
import com.max.hbutils.utils.x;
import com.max.mediaselector.lib.utils.l;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.app.HeyBoxApplication;
import com.max.xiaoheihe.bean.upload.COSUploadInfoObj;
import com.max.xiaoheihe.bean.upload.UploadInfoObj;
import com.max.xiaoheihe.network.i;
import com.max.xiaoheihe.utils.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.cos.xml.crypto.Headers;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.listener.CosXmlProgressListener;
import com.tencent.cos.xml.listener.CosXmlResultListener;
import com.tencent.cos.xml.model.CosXmlRequest;
import com.tencent.cos.xml.model.CosXmlResult;
import com.tencent.cos.xml.model.object.PutObjectRequest;
import com.tencent.cos.xml.transfer.COSXMLUploadTask;
import com.tencent.cos.xml.transfer.TransferConfig;
import com.tencent.cos.xml.transfer.TransferManager;
import com.tencent.qcloud.core.util.QCloudUtils;
import com.tencent.rtmp.TXVodConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executors;
import okhttp3.t;

/* JADX INFO: compiled from: TencentUploadManager.java */
/* JADX INFO: loaded from: classes12.dex */
public class f extends MaxUploadManager {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static HashMap<String, COSXMLUploadTask> f93499p = new HashMap<>();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f93500m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f93501n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    TransferManager f93502o;

    /* JADX INFO: compiled from: TencentUploadManager.java */
    public class a extends com.max.hbcommon.network.d<Result<COSUploadInfoObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 46180, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f.this.f93432b.e(th2.getMessage());
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.upload_img_failed_msg) + " " + th2.getMessage());
        }

        public void onNext(Result<COSUploadInfoObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 46181, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            if (result == null || result.getResult() == null) {
                f.this.f93432b.e("获取token失败");
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f("获取token失败");
            } else if (com.max.hbcommon.utils.c.w(f.this.f93435e)) {
                f.h(f.this, result.getResult());
            } else {
                f.g(f.this, result.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46182, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<COSUploadInfoObj>) obj);
        }
    }

    /* JADX INFO: compiled from: TencentUploadManager.java */
    public class b implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ COSXMLUploadTask f93504b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f93505c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f93506d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f93507e;

        b(COSXMLUploadTask cOSXMLUploadTask, String str, String str2, String str3) {
            this.f93504b = cOSXMLUploadTask;
            this.f93505c = str;
            this.f93506d = str2;
            this.f93507e = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10 = false;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46183, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            while (!z10) {
                COSXMLUploadTask cOSXMLUploadTask = this.f93504b;
                if (cOSXMLUploadTask != null && cOSXMLUploadTask.getUploadId() != null) {
                    com.max.xiaoheihe.module.upload.c.g().p(this.f93505c, this.f93504b.getUploadId(), this.f93506d, this.f93507e);
                    z10 = true;
                }
                try {
                    Thread.sleep(10L);
                } catch (InterruptedException e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: compiled from: TencentUploadManager.java */
    public class c implements CosXmlProgressListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.tencent.qcloud.core.common.QCloudProgressListener
        public void onProgress(long j10, long j11) {
            Object[] objArr = {new Long(j10), new Long(j11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Long.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 46184, new Class[]{cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            f.this.f93432b.a(j10 / j11);
            Log.d("cosxmlUploadTask", "complete: " + j10 + "  target: " + j11);
        }
    }

    /* JADX INFO: compiled from: TencentUploadManager.java */
    public class d implements CosXmlResultListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f93510a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ COSUploadInfoObj f93511b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String[] f93512c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f93513d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ List f93514e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f93515f;

        d(String str, COSUploadInfoObj cOSUploadInfoObj, String[] strArr, int i10, List list, int i11) {
            this.f93510a = str;
            this.f93511b = cOSUploadInfoObj;
            this.f93512c = strArr;
            this.f93513d = i10;
            this.f93514e = list;
            this.f93515f = i11;
        }

        @Override // com.tencent.cos.xml.listener.CosXmlResultListener
        public void onFail(CosXmlRequest cosXmlRequest, CosXmlClientException cosXmlClientException, CosXmlServiceException cosXmlServiceException) {
            if (PatchProxy.proxy(new Object[]{cosXmlRequest, cosXmlClientException, cosXmlServiceException}, this, changeQuickRedirect, false, 46186, new Class[]{CosXmlRequest.class, CosXmlClientException.class, CosXmlServiceException.class}, Void.TYPE).isSupported) {
                return;
            }
            f.f93499p.remove(this.f93510a);
            f.k(f.this, cosXmlRequest, cosXmlClientException, cosXmlServiceException, this.f93511b, this.f93514e, this.f93515f);
        }

        @Override // com.tencent.cos.xml.listener.CosXmlResultListener
        public void onSuccess(CosXmlRequest cosXmlRequest, CosXmlResult cosXmlResult) {
            if (PatchProxy.proxy(new Object[]{cosXmlRequest, cosXmlResult}, this, changeQuickRedirect, false, 46185, new Class[]{CosXmlRequest.class, CosXmlResult.class}, Void.TYPE).isSupported) {
                return;
            }
            f.f93499p.remove(this.f93510a);
            t.a aVarH = t.J(((COSXMLUploadTask.COSXMLUploadTaskResult) cosXmlResult).accessUrl).H();
            aVarH.x(this.f93511b.getHost());
            this.f93512c[this.f93513d] = aVarH.h().getUrl();
            f.this.f93500m++;
            String header = cosXmlResult.getHeader(Headers.REQUEST_ID);
            if (!com.max.hbcommon.utils.c.u(header)) {
                this.f93514e.add(header);
            }
            f fVar = f.this;
            int i10 = fVar.f93500m;
            int i11 = this.f93515f;
            if (i10 == i11) {
                f.j(fVar, new Gson().toJson(this.f93511b.getKeys()), new Gson().toJson(this.f93514e));
                f.this.f93432b.c(this.f93512c, "");
            } else if (i10 + fVar.f93501n == i11) {
                f.j(fVar, new Gson().toJson(this.f93511b.getKeys()), new Gson().toJson(this.f93514e));
            }
        }
    }

    /* JADX INFO: compiled from: TencentUploadManager.java */
    public class e implements CosXmlProgressListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.tencent.qcloud.core.common.QCloudProgressListener
        public void onProgress(long j10, long j11) {
            Object[] objArr = {new Long(j10), new Long(j11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Long.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 46187, new Class[]{cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            f.this.f93432b.a(j10 / j11);
            Log.d("cosxmlUploadTask", "complete: " + j10 + "  target: " + j11);
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.upload.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: TencentUploadManager.java */
    public class C0876f implements CosXmlResultListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ COSUploadInfoObj f93518a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String[] f93519b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f93520c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f93521d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f93522e;

        C0876f(COSUploadInfoObj cOSUploadInfoObj, String[] strArr, int i10, List list, int i11) {
            this.f93518a = cOSUploadInfoObj;
            this.f93519b = strArr;
            this.f93520c = i10;
            this.f93521d = list;
            this.f93522e = i11;
        }

        @Override // com.tencent.cos.xml.listener.CosXmlResultListener
        public void onFail(CosXmlRequest cosXmlRequest, CosXmlClientException cosXmlClientException, CosXmlServiceException cosXmlServiceException) {
            if (PatchProxy.proxy(new Object[]{cosXmlRequest, cosXmlClientException, cosXmlServiceException}, this, changeQuickRedirect, false, 46189, new Class[]{CosXmlRequest.class, CosXmlClientException.class, CosXmlServiceException.class}, Void.TYPE).isSupported) {
                return;
            }
            f.k(f.this, cosXmlRequest, cosXmlClientException, cosXmlServiceException, this.f93518a, this.f93521d, this.f93522e);
        }

        @Override // com.tencent.cos.xml.listener.CosXmlResultListener
        public void onSuccess(CosXmlRequest cosXmlRequest, CosXmlResult cosXmlResult) {
            if (PatchProxy.proxy(new Object[]{cosXmlRequest, cosXmlResult}, this, changeQuickRedirect, false, 46188, new Class[]{CosXmlRequest.class, CosXmlResult.class}, Void.TYPE).isSupported) {
                return;
            }
            t.a aVarH = t.J(((COSXMLUploadTask.COSXMLUploadTaskResult) cosXmlResult).accessUrl).H();
            aVarH.x(this.f93518a.getHost());
            this.f93519b[this.f93520c] = aVarH.h().getUrl();
            f.this.f93500m++;
            String header = cosXmlResult.getHeader(Headers.REQUEST_ID);
            if (!com.max.hbcommon.utils.c.u(header)) {
                this.f93521d.add(header);
            }
            f fVar = f.this;
            int i10 = fVar.f93500m;
            int i11 = this.f93522e;
            if (i10 == i11) {
                f.j(fVar, new Gson().toJson(this.f93518a.getKeys()), new Gson().toJson(this.f93521d));
                f.this.f93432b.c(this.f93519b, "");
            } else if (i10 + fVar.f93501n == i11) {
                f.j(fVar, new Gson().toJson(this.f93518a.getKeys()), new Gson().toJson(this.f93521d));
            }
        }
    }

    public f(Context context, Boolean bool) {
        this.f93431a = context;
        this.f93502o = new TransferManager(bool.booleanValue() ? com.max.xiaoheihe.module.upload.a.c(HeyBoxApplication.C()) : com.max.xiaoheihe.module.upload.a.a(HeyBoxApplication.C()), new TransferConfig.Builder().build());
    }

    static /* synthetic */ void g(f fVar, COSUploadInfoObj cOSUploadInfoObj) {
        if (PatchProxy.proxy(new Object[]{fVar, cOSUploadInfoObj}, null, changeQuickRedirect, true, 46176, new Class[]{f.class, COSUploadInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        fVar.r(cOSUploadInfoObj);
    }

    static /* synthetic */ void h(f fVar, COSUploadInfoObj cOSUploadInfoObj) {
        if (PatchProxy.proxy(new Object[]{fVar, cOSUploadInfoObj}, null, changeQuickRedirect, true, 46177, new Class[]{f.class, COSUploadInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        fVar.p(cOSUploadInfoObj);
    }

    static /* synthetic */ void j(f fVar, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{fVar, str, str2}, null, changeQuickRedirect, true, 46178, new Class[]{f.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        fVar.q(str, str2);
    }

    static /* synthetic */ void k(f fVar, CosXmlRequest cosXmlRequest, CosXmlClientException cosXmlClientException, CosXmlServiceException cosXmlServiceException, COSUploadInfoObj cOSUploadInfoObj, List list, int i10) {
        if (PatchProxy.proxy(new Object[]{fVar, cosXmlRequest, cosXmlClientException, cosXmlServiceException, cOSUploadInfoObj, list, new Integer(i10)}, null, changeQuickRedirect, true, 46179, new Class[]{f.class, CosXmlRequest.class, CosXmlClientException.class, CosXmlServiceException.class, COSUploadInfoObj.class, List.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        fVar.m(cosXmlRequest, cosXmlClientException, cosXmlServiceException, cOSUploadInfoObj, list, i10);
    }

    public static void l(String str) {
        COSXMLUploadTask cOSXMLUploadTask;
        if (PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 46175, new Class[]{String.class}, Void.TYPE).isSupported || (cOSXMLUploadTask = f93499p.get(str)) == null) {
            return;
        }
        cOSXMLUploadTask.cancel();
    }

    private void m(CosXmlRequest cosXmlRequest, CosXmlClientException cosXmlClientException, CosXmlServiceException cosXmlServiceException, COSUploadInfoObj cOSUploadInfoObj, List<String> list, int i10) {
        if (PatchProxy.proxy(new Object[]{cosXmlRequest, cosXmlClientException, cosXmlServiceException, cOSUploadInfoObj, list, new Integer(i10)}, this, changeQuickRedirect, false, 46171, new Class[]{CosXmlRequest.class, CosXmlClientException.class, CosXmlServiceException.class, COSUploadInfoObj.class, List.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f93501n++;
        if (cosXmlClientException != null) {
            cosXmlClientException.printStackTrace();
        } else {
            cosXmlServiceException.printStackTrace();
        }
        String str = "";
        if (cosXmlClientException != null && cosXmlClientException.getMessage() != null) {
            str = "" + cosXmlClientException.getMessage();
        }
        if (cosXmlServiceException != null && cosXmlServiceException.getMessage() != null) {
            str = str + cosXmlServiceException.getMessage();
            String requestId = cosXmlServiceException.getRequestId();
            if (!com.max.hbcommon.utils.c.u(requestId)) {
                list.add(requestId);
            }
            if (this.f93501n + this.f93500m == i10) {
                q(new Gson().toJson(cOSUploadInfoObj.getKeys()), new Gson().toJson(list));
            }
        }
        g.d dVar = this.f93433c;
        if (dVar != null) {
            if (this.f93501n + this.f93500m == i10) {
                dVar.a("上传失败 error: " + str);
                return;
            }
            return;
        }
        this.f93432b.e("上传失败");
        if (this.f93432b.d()) {
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f("上传失败 error: " + str);
        }
    }

    public static boolean n(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 46173, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        COSXMLUploadTask cOSXMLUploadTask = f93499p.get(str);
        if (cOSXMLUploadTask != null) {
            return cOSXMLUploadTask.pauseSafely();
        }
        return false;
    }

    public static void o(String str) {
        COSXMLUploadTask cOSXMLUploadTask;
        if (PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 46174, new Class[]{String.class}, Void.TYPE).isSupported || (cOSXMLUploadTask = f93499p.get(str)) == null) {
            return;
        }
        cOSXMLUploadTask.resume();
    }

    private void p(COSUploadInfoObj cOSUploadInfoObj) {
        String bucket;
        String cosPath;
        COSXMLUploadTask cOSXMLUploadTaskUpload;
        f fVar = this;
        int i10 = 1;
        if (PatchProxy.proxy(new Object[]{cOSUploadInfoObj}, this, changeQuickRedirect, false, 46169, new Class[]{COSUploadInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        fVar.f93500m = 0;
        int size = fVar.f93434d.size();
        String[] strArr = new String[size];
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        int i12 = 0;
        while (i11 < size) {
            if (fVar.f93438h.containsKey(Integer.valueOf(i11))) {
                strArr[i11] = fVar.f93438h.get(Integer.valueOf(i11));
                int i13 = fVar.f93500m + i10;
                fVar.f93500m = i13;
                if (i13 == size) {
                    fVar.f93432b.c(strArr, null);
                }
            } else {
                String absolutePath = fVar.f93434d.get(i11).getAbsolutePath();
                UploadInfoObj uploadInfoObjJ = com.max.xiaoheihe.module.upload.c.g().j(absolutePath);
                if (uploadInfoObjJ == null || uploadInfoObjJ.getBucket() == null || uploadInfoObjJ.getCosPath() == null) {
                    bucket = cOSUploadInfoObj.getBucket();
                    cosPath = cOSUploadInfoObj.getKeys().get(i12);
                } else {
                    String bucket2 = uploadInfoObjJ.getBucket();
                    cosPath = uploadInfoObjJ.getCosPath();
                    bucket = bucket2;
                }
                if ("image/webp".equals(com.max.hbcommon.utils.f.f(fVar.f93434d.get(i11)))) {
                    byte[] bArrJ = n.j(absolutePath);
                    if (bArrJ == null) {
                        x.m("[webp图片转码失败]\npath: " + absolutePath);
                        return;
                    }
                    cOSXMLUploadTaskUpload = fVar.f93502o.upload(bucket, cosPath, bArrJ);
                } else {
                    String strH = com.max.xiaoheihe.module.upload.c.g().h(absolutePath);
                    PutObjectRequest putObjectRequest = new PutObjectRequest(bucket, cosPath, absolutePath);
                    if (fVar.f93432b.b()) {
                        putObjectRequest.setPriorityLow();
                    }
                    COSXMLUploadTask cOSXMLUploadTaskUpload2 = fVar.f93502o.upload(putObjectRequest, strH);
                    if (strH == null) {
                        Executors.newSingleThreadExecutor().submit(new b(cOSXMLUploadTaskUpload2, absolutePath, bucket, cosPath));
                    } else {
                        com.max.xiaoheihe.module.upload.c.g().p(absolutePath, strH, bucket, cosPath);
                    }
                    cOSXMLUploadTaskUpload = cOSXMLUploadTaskUpload2;
                }
                cOSXMLUploadTaskUpload.setCosXmlProgressListener(fVar.new c());
                cOSXMLUploadTaskUpload.setCosXmlResultListener(new d(absolutePath, cOSUploadInfoObj, strArr, i11, arrayList, size));
                f93499p.put(absolutePath, cOSXMLUploadTaskUpload);
                i12++;
            }
            i11++;
            i10 = 1;
            fVar = this;
        }
    }

    private void q(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 46172, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        i.a().b4(str, str2).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.schedulers.b.d()).J5(new p());
    }

    private void r(COSUploadInfoObj cOSUploadInfoObj) {
        if (PatchProxy.proxy(new Object[]{cOSUploadInfoObj}, this, changeQuickRedirect, false, 46170, new Class[]{COSUploadInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f93500m = 0;
        int size = this.f93435e.size();
        String[] strArr = new String[size];
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            COSXMLUploadTask cOSXMLUploadTaskUpload = this.f93502o.upload(cOSUploadInfoObj.getBucket(), cOSUploadInfoObj.getKeys().get(i10), this.f93435e.get(i11), (String) null);
            cOSXMLUploadTaskUpload.setCosXmlProgressListener(new e());
            cOSXMLUploadTaskUpload.setCosXmlResultListener(new C0876f(cOSUploadInfoObj, strArr, i11, arrayList, size));
            i10++;
        }
    }

    @Override // com.max.xiaoheihe.module.upload.MaxUploadManager
    public void b() {
        Bitmap bitmapDecodeFile;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46168, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f93439i == 0) {
            p(null);
            return;
        }
        HashMap map = new HashMap(16);
        JsonArray jsonArray = new JsonArray();
        if (com.max.hbcommon.utils.c.w(this.f93435e)) {
            for (File file : this.f93434d) {
                JsonObject jsonObject = new JsonObject();
                String strF = com.max.hbcommon.utils.f.f(file);
                if ("image/webp".equals(strF)) {
                    jsonObject.addProperty(TXVodConstants.VOD_KEY_MIMETYPE, "image/jpeg");
                } else {
                    jsonObject.addProperty(TXVodConstants.VOD_KEY_MIMETYPE, strF);
                }
                if (strF != null && strF.contains("video")) {
                    try {
                        com.max.mediaselector.lib.entity.b bVarP = l.p(this.f93431a, file.getAbsolutePath());
                        if (bVarP != null) {
                            jsonObject.addProperty("width", Integer.valueOf(bVarP.e()));
                            jsonObject.addProperty("height", Integer.valueOf(bVarP.b()));
                            jsonObject.addProperty("duration", Long.valueOf(bVarP.a() / 1000));
                        }
                    } catch (Throwable unused) {
                    }
                } else if ((strF == null || !strF.contains("zip")) && (bitmapDecodeFile = BitmapFactory.decodeFile(file.getAbsolutePath())) != null) {
                    jsonObject.addProperty("width", Integer.valueOf(bitmapDecodeFile.getWidth()));
                    jsonObject.addProperty("height", Integer.valueOf(bitmapDecodeFile.getHeight()));
                } else {
                    jsonObject.addProperty("width", (Number) 0);
                    jsonObject.addProperty("height", (Number) 0);
                }
                jsonObject.addProperty("fsize", Long.valueOf(file.length()));
                if (bb.a.f30446a.get(s.b(file)) != null) {
                    jsonObject.addProperty(com.max.hbsearch.l.W, bb.a.f30446a.get(s.b(file)));
                }
                jsonArray.add(jsonObject);
            }
        } else {
            for (Uri uri : this.f93435e) {
                JsonObject jsonObject2 = new JsonObject();
                jsonObject2.addProperty(TXVodConstants.VOD_KEY_MIMETYPE, this.f93431a.getContentResolver().getType(uri));
                jsonObject2.addProperty("width", (Number) 0);
                jsonObject2.addProperty("height", (Number) 0);
                jsonObject2.addProperty("fsize", Long.valueOf(QCloudUtils.getUriContentLength2(uri, this.f93431a.getContentResolver())));
                jsonArray.add(jsonObject2);
            }
        }
        map.put("file_infos", jsonArray.toString());
        map.put("scope", this.f93436f);
        this.f93437g.c((io.reactivex.disposables.b) i.a().Y7(map).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.schedulers.b.d()).J5(new a()));
    }
}
