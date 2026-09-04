package com.huawei.hms.scankit;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.hms.ml.scan.HmsScan;
import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import com.huawei.hms.scankit.p.e5;
import com.huawei.hms.scankit.p.f5;
import com.huawei.hms.scankit.p.i8;
import com.huawei.hms.scankit.p.j0;
import com.huawei.hms.scankit.p.l1;
import com.huawei.hms.scankit.p.o4;
import com.huawei.hms.scankit.p.u6;
import com.huawei.hms.scankit.p.v5;
import com.huawei.hms.scankit.p.v6;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: compiled from: CaptureHandler.java */
/* JADX INFO: loaded from: classes7.dex */
public class a extends Handler implements v6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f5 f61340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f61341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f61342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private EnumC0510a f61343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Context f61344e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final j0 f61345f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ViewfinderView f61346g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f61347h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f61348i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f61349j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private e5 f61350k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f61351l;

    /* JADX INFO: renamed from: com.huawei.hms.scankit.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CaptureHandler.java */
    public enum EnumC0510a {
        PREVIEW,
        SUCCESS,
        DONE
    }

    a(Context context, ViewfinderView viewfinderView, f5 f5Var, Collection<BarcodeFormat> collection, Map<l1, ?> map, String str, j0 j0Var, Rect rect, int i10, boolean z10, boolean z11) {
        this.f61346g = viewfinderView;
        this.f61340a = f5Var;
        this.f61342c = i10;
        this.f61344e = context;
        d dVar = new d(context, j0Var, this, collection, map, str, this);
        this.f61341b = dVar;
        dVar.a(rect);
        this.f61341b.a(z11);
        this.f61341b.start();
        this.f61351l = z10;
        j0Var.a(new j(this.f61341b));
        this.f61343d = EnumC0510a.SUCCESS;
        this.f61345f = j0Var;
        j0Var.p();
        o4.a("scan-time", "start preview time:" + System.currentTimeMillis());
        f();
        v5.a(null);
    }

    private u6 b(u6 u6Var) {
        float fB;
        float fC;
        int iMax;
        Point pointB = i8.b(this.f61344e);
        Point pointE = this.f61345f.e();
        int i10 = pointB.x;
        int i11 = pointB.y;
        if (i10 < i11) {
            float f10 = (i10 * 1.0f) / pointE.y;
            float f11 = (i11 * 1.0f) / pointE.x;
            fB = (u6Var.b() * f10) - (Math.max(pointB.x, pointE.y) / 2.0f);
            fC = u6Var.c() * f11;
            iMax = Math.min(pointB.y, pointE.x);
        } else {
            float f12 = (i10 * 1.0f) / pointE.x;
            float f13 = (i11 * 1.0f) / pointE.y;
            fB = (u6Var.b() * f12) - (Math.min(pointB.y, pointE.y) / 2.0f);
            fC = u6Var.c() * f13;
            iMax = Math.max(pointB.x, pointE.x);
        }
        return new u6(fB, fC - (iMax / 2.0f));
    }

    public void a(e5 e5Var) {
        this.f61350k = e5Var;
    }

    @Override // com.huawei.hms.scankit.p.v6
    public void a(u6 u6Var) {
        if (this.f61346g != null) {
            this.f61346g.a(b(u6Var));
        }
    }

    public void a(boolean z10) {
        this.f61348i = z10;
    }

    public boolean a() {
        e5 e5Var = this.f61350k;
        if (e5Var != null) {
            return e5Var.a();
        }
        return false;
    }

    public int b() {
        return this.f61342c;
    }

    public void b(boolean z10) {
        this.f61349j = z10;
    }

    public void c(boolean z10) {
        this.f61347h = z10;
    }

    public boolean c() {
        return this.f61348i;
    }

    public boolean d() {
        return this.f61349j;
    }

    public void e() {
        this.f61343d = EnumC0510a.DONE;
        this.f61345f.q();
        Message.obtain(this.f61341b.a(), R.id.scankit_quit).sendToTarget();
        try {
            this.f61341b.b();
            this.f61341b.join(50L);
        } catch (InterruptedException unused) {
            o4.e("CaptureHandler", "quitSynchronously   wait interrupt");
        }
        this.f61341b = null;
        removeMessages(R.id.scankit_decode_succeeded);
        removeMessages(R.id.scankit_decode_failed);
    }

    public void f() {
        if (this.f61343d == EnumC0510a.SUCCESS) {
            this.f61343d = EnumC0510a.PREVIEW;
            this.f61345f.o();
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        HmsScan hmsScan;
        int i10 = message.what;
        if (i10 == R.id.scankit_restart_preview) {
            f();
            return;
        }
        if (i10 != R.id.scankit_decode_succeeded) {
            if (i10 == R.id.scankit_decode_failed) {
                this.f61343d = EnumC0510a.PREVIEW;
                this.f61345f.o();
                return;
            }
            return;
        }
        this.f61343d = EnumC0510a.SUCCESS;
        Object obj = message.obj;
        if (obj instanceof HmsScan[]) {
            HmsScan[] hmsScanArr = (HmsScan[]) obj;
            if (hmsScanArr.length <= 0 || (hmsScan = hmsScanArr[0]) == null || TextUtils.isEmpty(hmsScan.originalValue)) {
                o4.d("CaptureHandler", "retrieve  HmsScan lenth is 0");
            } else {
                o4.d("CaptureHandler", "scan successful");
                Bitmap bitmapDecodeByteArray = null;
                float f10 = 0.0f;
                if (this.f61348i) {
                    o4.d("CaptureHandler", "scan successful & return bitmap");
                    Bundle data = message.getData();
                    if (data != null) {
                        byte[] byteArray = data.getByteArray("barcode_bitmap");
                        f10 = data.getFloat("barcode_scaled_factor", 0.0f);
                        if (byteArray != null && byteArray.length > 0) {
                            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
                        }
                    }
                    this.f61340a.a(hmsScanArr, bitmapDecodeByteArray, f10);
                } else {
                    this.f61340a.a(hmsScanArr, null, 0.0f);
                }
                if (!this.f61351l) {
                    return;
                }
            }
            f();
        }
    }
}
