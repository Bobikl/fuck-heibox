package com.huawei.hms.scankit;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.hmsscankit.DetailRect;
import com.huawei.hms.hmsscankit.api.IRemoteDecoderCreator;
import com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate;
import com.huawei.hms.ml.scan.HmsScan;
import com.huawei.hms.scankit.p.g0;
import com.huawei.hms.scankit.p.h4;
import com.huawei.hms.scankit.p.i8;
import com.huawei.hms.scankit.p.j0;
import com.huawei.hms.scankit.p.k0;
import com.huawei.hms.scankit.p.l1;
import com.huawei.hms.scankit.p.m0;
import com.huawei.hms.scankit.p.o4;
import com.huawei.hms.scankit.p.s6;
import com.huawei.hms.scankit.p.w3;
import com.huawei.hms.scankit.p.y6;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: DecodeHandler.java */
/* JADX INFO: loaded from: classes7.dex */
public final class c extends Handler {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static a f61404j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static long f61405k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f61406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j0 f61407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.huawei.hms.scankit.a f61408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f61409d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f61410e = 50;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Rect f61411f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f61412g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private IRemoteFrameDecoderDelegate f61413h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f61414i;

    /* JADX INFO: compiled from: DecodeHandler.java */
    public static class a extends AsyncTask<Object, Object, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<c> f61415a;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private List<k0.a> f61419e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List<k0.a> f61420f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f61416b = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f61417c = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f61418d = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f61421g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f61422h = 0;

        public a(c cVar) {
            this.f61415a = new WeakReference<>(cVar);
        }

        private void a() {
            this.f61418d = 0;
            this.f61421g = 0;
        }

        public void a(int i10) {
            this.f61418d += i10;
            this.f61421g++;
        }

        public void a(List<Rect> list, int i10, int i11, boolean z10) {
            if (list == null) {
                o4.a("ScankitDecode", "areas is null");
                return;
            }
            if (list.size() == 0) {
                this.f61420f = Collections.singletonList(new k0.a(new Rect(-100, -100, 100, 100), 1000));
                return;
            }
            this.f61420f = new ArrayList();
            for (Rect rect : list) {
                int iCenterX = ((rect.centerX() * 2000) / i10) - 1000;
                int iCenterY = ((rect.centerY() * 2000) / i11) - 1000;
                int iWidth = ((rect.width() * 2000) / i10) / 2;
                int iHeight = ((rect.height() * 2000) / i11) / 2;
                this.f61420f.add(new k0.a(new Rect(iCenterX - (iWidth / 2), iCenterY - (iHeight / 2), iCenterX + iWidth, iCenterY + iHeight), 1000 / list.size()));
            }
            list.clear();
        }

        public void b(int i10) {
            this.f61422h = i10;
            c cVar = this.f61415a.get();
            if (cVar != null) {
                try {
                    cVar.a(this.f61422h, this.f61420f);
                    o4.d("DecodeHandler", "ScanCode handle global value" + this.f61422h);
                } catch (RuntimeException e10) {
                    o4.b("DecodeHandler", "RuntimeException: " + e10.getMessage());
                } catch (Exception unused) {
                    o4.b("DecodeHandler", "Exception");
                }
            }
        }

        public void b(List<Rect> list, int i10, int i11, boolean z10) {
            if (list == null) {
                o4.a("ScankitDecode", "areas is null");
                return;
            }
            if (list.size() == 0) {
                this.f61419e = Collections.singletonList(new k0.a(new Rect(-100, -100, 100, 100), 1000));
                return;
            }
            this.f61419e = new ArrayList();
            if (z10) {
                int i12 = (i11 > i10 ? i11 - i10 : i10 - i11) >> 1;
                for (Rect rect : list) {
                    int iCenterY = (((rect.centerY() + i12) * 2000) / i10) - 1000;
                    int iCenterX = ((rect.centerX() * 2000) / i11) - 1000;
                    int iHeight = ((rect.height() * 2000) / i10) / 2;
                    int iWidth = ((rect.width() * 2000) / i11) / 2;
                    this.f61419e.add(new k0.a(new Rect(iCenterY - (iHeight / 2), iCenterX - (iWidth / 2), iCenterY + iHeight, iCenterX + iWidth), 1000 / list.size()));
                }
                return;
            }
            for (Rect rect2 : list) {
                int iCenterX2 = ((rect2.centerX() * 2000) / i10) - 1000;
                int iCenterY2 = ((rect2.centerY() * 2000) / i11) - 1000;
                int iWidth2 = ((rect2.width() * 2000) / i10) / 2;
                int iHeight2 = ((rect2.height() * 2000) / i11) / 2;
                this.f61419e.add(new k0.a(new Rect(iCenterX2 - (iWidth2 / 2), iCenterY2 - (iHeight2 / 2), iCenterX2 + iWidth2, iCenterY2 + iHeight2), 1000 / list.size()));
            }
            list.clear();
        }

        @Override // android.os.AsyncTask
        protected Object doInBackground(Object... objArr) {
            Log.i("ScankitDecode", "doInBackground: ");
            if (c.f61404j.isCancelled()) {
                return null;
            }
            while (!this.f61417c) {
                if (this.f61416b) {
                    try {
                        Thread.sleep(400L);
                    } catch (InterruptedException unused) {
                        o4.d("ScankitDecode", "doInBackground  get InterruptedException  error!!!");
                    }
                    this.f61416b = false;
                } else {
                    c cVar = this.f61415a.get();
                    int i10 = this.f61421g;
                    if (i10 == 0) {
                        this.f61416b = true;
                    } else if (cVar != null) {
                        try {
                            cVar.a(this.f61418d / i10, this.f61419e);
                            o4.d("DecodeHandler", "ScanCode handle auto value" + (this.f61418d / this.f61421g));
                            a();
                            this.f61416b = true;
                        } catch (RuntimeException e10) {
                            o4.b("DecodeHandler", "RuntimeException: " + e10.getMessage());
                        } catch (Exception unused2) {
                            o4.b("DecodeHandler", "Exception");
                        }
                    }
                }
            }
            return null;
        }
    }

    c(Context context, j0 j0Var, com.huawei.hms.scankit.a aVar, Map<l1, Object> map, Rect rect, boolean z10) {
        this.f61414i = false;
        this.f61406a = context;
        this.f61407b = j0Var;
        this.f61408c = aVar;
        this.f61411f = rect;
        if (f61404j == null) {
            a aVar2 = new a(this);
            f61404j = aVar2;
            aVar2.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
        }
        this.f61412g = 0;
        this.f61414i = z10;
        a(context);
    }

    private void a(Context context) {
        Object objNewInstance;
        try {
            if (this.f61414i) {
                Log.d("ScankitDecode", "use local decoder");
                objNewInstance = DecoderCreator.class.newInstance();
            } else {
                Log.d("ScankitDecode", "use remote decoder");
                try {
                    context = com.huawei.hms.hmsscankit.g.e(context);
                } catch (NoSuchMethodException | InvocationTargetException unused) {
                }
                Class<?> clsLoadClass = context.getClassLoader().loadClass("com.huawei.hms.scankit.DecoderCreator");
                context.getClassLoader().loadClass("com.huawei.hms.scankit.aiscan.common.BarcodeFormat");
                objNewInstance = clsLoadClass.newInstance();
            }
        } catch (ClassNotFoundException unused2) {
            o4.a("ScankitDecode", "ClassNotFoundException");
            objNewInstance = null;
        } catch (IllegalAccessException unused3) {
            o4.a("ScankitDecode", "IllegalAccessException");
            objNewInstance = null;
        } catch (InstantiationException unused4) {
            o4.a("ScankitDecode", "InstantiationException");
            objNewInstance = null;
        }
        try {
            if (objNewInstance instanceof IBinder) {
                this.f61413h = IRemoteDecoderCreator.Stub.asInterface((IBinder) objNewInstance).newRemoteFrameDecoderDelegate();
            } else if (this.f61413h == null) {
                this.f61413h = h4.a();
            }
        } catch (RemoteException unused5) {
            o4.a("ScankitDecode", "RemoteException");
        }
    }

    private static void a(byte[] bArr, int i10, int i11, Bundle bundle) {
        if (bArr == null || bArr.length == 0) {
            return;
        }
        YuvImage yuvImage = new YuvImage(bArr, 17, i10, i11, null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        yuvImage.compressToJpeg(new Rect(0, 0, i10, i11), 100, byteArrayOutputStream);
        bundle.putByteArray("barcode_bitmap", byteArrayOutputStream.toByteArray());
        bundle.putFloat("barcode_scaled_factor", 1.0f);
        try {
            byteArrayOutputStream.close();
        } catch (IOException unused) {
            Log.e("ScankitDecode", "RemoteException");
        }
    }

    private void a(byte[] bArr, boolean z10) {
        s6[] s6VarArrDecode;
        s6[] s6VarArrDecode2;
        int i10 = this.f61407b.e().x;
        int i11 = this.f61407b.e().y;
        Context context = this.f61406a;
        int rotation = (context == null || !(context instanceof Activity)) ? 0 : ((Activity) context).getWindowManager().getDefaultDisplay().getRotation();
        if (this.f61408c != null) {
            w3.c cVarA = b.J != null ? b.J.a(false, i10 * i11) : null;
            Bundle bundle = new Bundle();
            bundle.putParcelable("Rect", this.f61411f);
            Point pointB = i8.b(this.f61406a);
            if (pointB != null) {
                bundle.putParcelable("Screen", pointB);
            }
            bundle.putBoolean(DetailRect.SUPPORT_ROLLBACK, com.huawei.hms.hmsscankit.g.f61137c);
            bundle.putBoolean(DetailRect.USE_APK, com.huawei.hms.hmsscankit.g.f61135a);
            try {
                if (b.I != null) {
                    b.I.a(System.currentTimeMillis());
                }
                s6VarArrDecode = this.f61413h.decode(bArr, i10, i11, rotation, this.f61408c.b(), ObjectWrapper.wrap(bundle));
                try {
                    com.huawei.hms.hmsscankit.f.a(s6VarArrDecode);
                    if (com.huawei.hms.hmsscankit.g.a()) {
                        Log.e("ScankitDecode", "iRemoteFrameDecoderDelegate decode rollback");
                        a(this.f61406a);
                        s6VarArrDecode2 = this.f61413h.decode(bArr, i10, i11, rotation, this.f61408c.b(), ObjectWrapper.wrap(bundle));
                    } else {
                        s6VarArrDecode2 = s6VarArrDecode;
                    }
                } catch (RemoteException unused) {
                    Log.e("ScankitDecode", "RemoteException");
                }
            } catch (RemoteException unused2) {
                s6VarArrDecode = null;
            }
            if (s6VarArrDecode2 == null || s6VarArrDecode2.length <= 0 || s6VarArrDecode2[0] == null) {
                this.f61408c.sendEmptyMessage(R.id.scankit_decode_failed);
                if (b.J != null) {
                    b.J.a((HmsScan[]) null, cVarA);
                    return;
                }
                return;
            }
            if (this.f61408c.d() && s6VarArrDecode2[0].l() != 1.0f && System.currentTimeMillis() - f61405k > 1000) {
                o4.d("ScankitDecode", "need to zoom" + s6VarArrDecode2[0].l());
                if (a(s6VarArrDecode2[0].l(), s6VarArrDecode2, cVarA)) {
                    f61405k = System.currentTimeMillis();
                    return;
                }
            }
            if (s6VarArrDecode2[0].k() == null) {
                if (s6VarArrDecode2[0].o()) {
                    o4.d("ScankitDecode", "ScanCode need to focus area");
                    a(s6VarArrDecode2[0].d().get(0), z10);
                } else if (s6VarArrDecode2[0].n()) {
                    o4.d("ScankitDecode", "ScanCode need to globalexposure" + s6VarArrDecode2[0].h());
                    f61404j.a(s6VarArrDecode2[0].g(), i10, i11, false);
                    f61404j.b(s6VarArrDecode2[0].h());
                } else {
                    o4.d("ScankitDecode", "ScanCode need to exposure" + s6VarArrDecode2[0].f());
                    f61404j.a(s6VarArrDecode2[0].f());
                    f61404j.b(s6VarArrDecode2[0].d(), i10, i11, z10);
                }
            }
            a(s6VarArrDecode2, bArr, i10, i11, cVarA);
        }
    }

    private void a(s6[] s6VarArr, byte[] bArr, int i10, int i11, w3.c cVar) {
        if (this.f61408c != null) {
            Message messageObtain = Message.obtain(this.f61408c, R.id.scankit_decode_succeeded, y6.a(s6VarArr));
            Log.d("ScankitDecode", "scankit decode succeed msg SCAN_MODE: FULLSDK VERSION_CODE: 21200301 VERSION_NAME: 2.12.0.301");
            try {
                if (b.I != null) {
                    b.I.a(s6VarArr[0].e(), s6VarArr[0].b(), s6VarArr[0].m());
                }
            } catch (Exception unused) {
                Log.d("ScankitDecode", "ha is null");
            }
            if (this.f61408c.c()) {
                Bundle bundle = new Bundle();
                a(bArr, i10, i11, bundle);
                messageObtain.setData(bundle);
            }
            messageObtain.sendToTarget();
        }
    }

    private boolean a(float f10, s6[] s6VarArr, w3.c cVar) {
        if (!b(f10)) {
            return false;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = R.id.scankit_decode_succeeded;
        HmsScan[] hmsScanArrA = y6.a(s6VarArr);
        messageObtain.obj = hmsScanArrA;
        if (b.J != null) {
            b.J.a(hmsScanArrA, cVar);
        }
        this.f61408c.sendMessage(messageObtain);
        return true;
    }

    private boolean d() {
        Context context = this.f61406a;
        if (context == null) {
            return true;
        }
        Object systemService = context.getSystemService("window");
        if (!(systemService instanceof WindowManager)) {
            o4.d("ScankitDecode", "isScreenPortrait  getSystemService  WINDOW_SERVICE  error!!!");
            return true;
        }
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point.x < point.y;
    }

    public int a(float f10) {
        List<Integer> listB = b();
        if (listB == null) {
            return -3;
        }
        if (listB.size() <= 0) {
            return -4;
        }
        if (Math.abs(f10 - 1.0f) < 1.0E-6f) {
            return 0;
        }
        if (f10 == c()) {
            return listB.size() - 1;
        }
        for (int i10 = 1; i10 < listB.size(); i10++) {
            float f11 = 100.0f * f10;
            if (listB.get(i10).intValue() >= f11 && listB.get(i10 - 1).intValue() <= f11) {
                return i10;
            }
        }
        return -1;
    }

    public void a(int i10, List<k0.a> list) {
        g0 g0VarB = this.f61407b.b();
        int iB = g0VarB.b();
        int iC = g0VarB.c();
        int iA = g0VarB.a();
        if (i10 == 0) {
            return;
        }
        int i11 = iA + i10;
        if (i11 <= iB) {
            iB = i11 < iC ? iC : i11;
        }
        this.f61407b.c(iB);
        k0 k0VarC = this.f61407b.c();
        Rect rectB = k0VarC.b();
        if (k0VarC.a() > 0) {
            if (k0VarC.a() != 1) {
                this.f61407b.a(list);
                return;
            }
            int iCenterX = rectB.centerX();
            int iCenterY = rectB.centerY();
            if (Math.sqrt(((iCenterX - list.get(0).f62025a.centerX()) * (iCenterX - list.get(0).f62025a.centerX())) + (iCenterY - list.get(0).f62025a.centerY()) + (iCenterY - list.get(0).f62025a.centerY())) > this.f61410e) {
                list.set(0, new k0.a(list.get(0).f62025a, 1000));
                this.f61407b.a(list.subList(0, 1));
            }
        }
    }

    public void a(Rect rect, boolean z10) {
        com.huawei.hms.scankit.a aVar = this.f61408c;
        if (aVar == null || !aVar.a()) {
            this.f61407b.a(rect, z10);
        }
    }

    public List<Integer> b() {
        return this.f61407b.g().a();
    }

    public boolean b(float f10) {
        boolean z10;
        com.huawei.hms.scankit.a aVar = this.f61408c;
        if (aVar != null && aVar.a()) {
            return false;
        }
        try {
            m0 m0VarG = this.f61407b.g();
            if (m0VarG == null) {
                o4.d("ScankitDecode", "Zoom not supported,data is null");
                return false;
            }
            int iC = m0VarG.c();
            int iB = m0VarG.b();
            List<Integer> listA = m0VarG.a();
            float fIntValue = ((listA.get(iB).intValue() * 1.0f) / 100.0f) * f10;
            if (((int) (fIntValue * 100.0f)) > listA.get(iC).intValue()) {
                fIntValue = (iC * 1.0f) / 100.0f;
            }
            if (!this.f61407b.j()) {
                o4.d("ScankitDecode", "Zoom not supported");
                return false;
            }
            int iA = a(fIntValue);
            if (iA > iB) {
                this.f61407b.d(iA);
                z10 = true;
            } else {
                this.f61407b.d(iB);
                z10 = false;
            }
            this.f61407b.a(Collections.singletonList(new k0.a(new Rect(-150, -150, 150, 150), 1000)));
            return z10;
        } catch (RuntimeException unused) {
            o4.b("ScankitDecode", "Zoom not supported,RuntimeException happen");
            return false;
        } catch (Exception unused2) {
            o4.b("ScankitDecode", "Zoom not supported,Exception happen");
            return false;
        }
    }

    public float c() {
        List<Integer> listB = b();
        if (listB == null) {
            return 1.0f;
        }
        return Math.round(listB.get(listB.size() - 1).intValue() / 100.0f);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (message == null || !this.f61409d) {
            return;
        }
        int i10 = message.what;
        if (i10 == R.id.scankit_decode) {
            int i11 = this.f61412g;
            if (i11 <= 1) {
                this.f61412g = i11 + 1;
                this.f61408c.sendEmptyMessage(R.id.scankit_decode_failed);
                return;
            } else {
                Object obj = message.obj;
                if (obj instanceof byte[]) {
                    a((byte[]) obj, d());
                    return;
                }
                return;
            }
        }
        if (i10 != R.id.scankit_quit) {
            o4.d("ScankitDecode", "handleMessage  message.what:" + message.what);
            return;
        }
        this.f61409d = false;
        a aVar = f61404j;
        if (aVar != null) {
            aVar.f61417c = true;
            f61404j.cancel(true);
        }
        Looper.myLooper().quit();
    }
}
