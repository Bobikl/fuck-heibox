package com.tencent.thumbplayer.tcmedia.tplayer.a;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.tencent.thumbplayer.tcmedia.api.reportv2.ITPExtendReportController;
import com.tencent.thumbplayer.tcmedia.api.reportv2.ITPReportChannelListener;
import com.tencent.thumbplayer.tcmedia.api.reportv2.ITPReportInfoGetter;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import com.tencent.thumbplayer.tcmedia.utils.o;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class g implements ITPExtendReportController, com.tencent.thumbplayer.tcmedia.d.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Map<Integer, Integer> f102965k;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Context f102972g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ITPReportInfoGetter f102966a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HandlerThread f102967b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f102968c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.tencent.thumbplayer.tcmedia.tplayer.a.a f102969d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private l f102970e = new l();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.tencent.thumbplayer.tcmedia.tplayer.a.a.a f102973h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private h f102974i = new h();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Object f102975j = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CopyOnWriteArrayList<WeakReference<ITPReportChannelListener>> f102971f = new CopyOnWriteArrayList<>();

    public class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            com.tencent.thumbplayer.tcmedia.d.b.a aVar = (com.tencent.thumbplayer.tcmedia.d.b.a) message.obj;
            g.this.a(i10, aVar);
            if (g.this.f102969d != null) {
                g.this.f102969d.a(i10, aVar);
            }
            g.this.b(i10, aVar);
        }
    }

    static {
        HashMap map = new HashMap();
        f102965k = map;
        map.put(117, 0);
        map.put(204, 103);
        map.put(101, 1);
        map.put(102, 2);
        map.put(103, 3);
        map.put(104, 4);
        map.put(105, 5);
        map.put(107, 5);
        map.put(108, 5);
        map.put(106, 6);
        map.put(109, 7);
        map.put(110, 8);
        map.put(111, 9);
        map.put(112, 10);
        map.put(114, 11);
        map.put(115, 12);
        map.put(201, 100);
        map.put(202, 101);
        map.put(203, 102);
        map.put(116, 14);
        map.put(113, 13);
        map.put(118, 15);
    }

    public g(Context context) {
        this.f102972g = null;
        this.f102972g = context.getApplicationContext();
    }

    private void a(int i10) {
        String str;
        if (this.f102969d != null) {
            str = "mITPReporter has been create, do not create again.";
        } else {
            com.tencent.thumbplayer.tcmedia.tplayer.a.a aVarA = k.a(i10);
            this.f102969d = aVarA;
            if (aVarA != null) {
                aVarA.a(this.f102972g, this.f102970e);
                this.f102969d.a(this.f102966a);
                this.f102969d.a(this.f102973h);
                Iterator<WeakReference<ITPReportChannelListener>> it = this.f102971f.iterator();
                while (it.hasNext()) {
                    ITPReportChannelListener iTPReportChannelListener = it.next().get();
                    if (iTPReportChannelListener != null) {
                        this.f102969d.a(iTPReportChannelListener);
                    }
                }
                return;
            }
            str = "initReporter(" + i10 + ") fail, mITPReporter is null.";
        }
        TPLogUtil.w("TPReportController", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, com.tencent.thumbplayer.tcmedia.d.b.a aVar) {
        if (i10 == 0) {
            c(aVar);
            return;
        }
        if (i10 == 1) {
            d(aVar);
            return;
        }
        if (i10 == 2) {
            e(aVar);
        } else if (i10 == 6) {
            f(aVar);
        } else {
            if (i10 != 103) {
                return;
            }
            b(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i10, com.tencent.thumbplayer.tcmedia.d.b.a aVar) {
        if (i10 == 5) {
            g(aVar);
        } else {
            if (i10 != 1000) {
                return;
            }
            h(aVar);
        }
    }

    private void b(com.tencent.thumbplayer.tcmedia.d.b.a aVar) {
        if (aVar instanceof com.tencent.thumbplayer.tcmedia.d.b.g) {
            this.f102970e.f102984b = ((com.tencent.thumbplayer.tcmedia.d.b.g) aVar).b();
            TPLogUtil.i("TPReportController", "onGetConvertedDataSource time:" + this.f102970e.f102984b);
        }
    }

    private void c(com.tencent.thumbplayer.tcmedia.d.b.a aVar) {
        if (aVar instanceof com.tencent.thumbplayer.tcmedia.d.b.u) {
            com.tencent.thumbplayer.tcmedia.d.b.u uVar = (com.tencent.thumbplayer.tcmedia.d.b.u) aVar;
            this.f102970e.f102983a = uVar.b();
            this.f102970e.f102987e = uVar.d();
            this.f102970e.f102990h = uVar.e() ? 1 : 0;
            this.f102970e.f102988f = uVar.f();
            TPLogUtil.i("TPReportController", "onSetDataSource url:" + this.f102970e.f102987e + " isUseProxy:" + this.f102970e.f102990h + " urlProtocol:" + this.f102970e.f102988f);
        }
    }

    private void d(com.tencent.thumbplayer.tcmedia.d.b.a aVar) {
        this.f102974i.a(2);
        if (aVar instanceof com.tencent.thumbplayer.tcmedia.d.b.p) {
            com.tencent.thumbplayer.tcmedia.d.b.p pVar = (com.tencent.thumbplayer.tcmedia.d.b.p) aVar;
            this.f102970e.f102985c = pVar.b();
            this.f102970e.f102986d = pVar.c();
            this.f102970e.f102991i = pVar.d();
        }
    }

    private void e(com.tencent.thumbplayer.tcmedia.d.b.a aVar) {
        if (!this.f102974i.b(2)) {
            TPLogUtil.e("TPReportController", "onPrepareEnd Current state is not match:" + this.f102974i.toString());
            return;
        }
        this.f102974i.a(3);
        if (aVar instanceof com.tencent.thumbplayer.tcmedia.d.b.o) {
            com.tencent.thumbplayer.tcmedia.d.b.o oVar = (com.tencent.thumbplayer.tcmedia.d.b.o) aVar;
            this.f102970e.f102989g = j.b(oVar.e());
            TPLogUtil.i("TPReportController", "onPrepareEnd durationMs:" + oVar.d() + " playType:" + this.f102970e.f102989g);
            if (oVar.d() == 0) {
                a(1);
            } else {
                a(0);
            }
        }
    }

    private void f(com.tencent.thumbplayer.tcmedia.d.b.a aVar) {
        if (this.f102974i.b(2)) {
            a(2);
        }
        this.f102974i.a(1);
    }

    private void g(com.tencent.thumbplayer.tcmedia.d.b.a aVar) {
        this.f102974i.a(1);
        com.tencent.thumbplayer.tcmedia.tplayer.a.a aVar2 = this.f102969d;
        if (aVar2 != null) {
            aVar2.a();
            this.f102969d = null;
        }
        this.f102970e = new l();
    }

    private void h(com.tencent.thumbplayer.tcmedia.d.b.a aVar) {
        TPLogUtil.i("TPReportController", "onControllerRelease");
        synchronized (this.f102975j) {
            if (this.f102967b != null) {
                o.a().a(this.f102967b, this.f102968c);
                this.f102967b = null;
                this.f102968c = null;
            }
            this.f102971f.clear();
            this.f102975j.notifyAll();
            this.f102975j = null;
        }
    }

    public void a() {
        this.f102967b = o.a().a("TPReportController_Thread");
        this.f102968c = new a(this.f102967b.getLooper());
    }

    @Override // com.tencent.thumbplayer.tcmedia.d.a
    public void a(com.tencent.thumbplayer.tcmedia.d.b.a aVar) {
        Map<Integer, Integer> map = f102965k;
        if (map.containsKey(Integer.valueOf(aVar.a()))) {
            this.f102968c.obtainMessage(map.get(Integer.valueOf(aVar.a())).intValue(), aVar).sendToTarget();
            return;
        }
        TPLogUtil.w("TPReportController", "EventId:" + aVar.a() + " is not need process");
    }

    public void a(com.tencent.thumbplayer.tcmedia.tplayer.a.a.a aVar) {
        this.f102973h = aVar;
    }

    public void a(boolean z10) {
        TPLogUtil.i("TPReportController", "reporting is needed:".concat(String.valueOf(z10)));
        this.f102970e.f102992j = Boolean.valueOf(z10);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.reportv2.ITPExtendReportController
    public void addReportChannelListener(ITPReportChannelListener iTPReportChannelListener) {
        CopyOnWriteArrayList<WeakReference<ITPReportChannelListener>> copyOnWriteArrayList = this.f102971f;
        if (copyOnWriteArrayList == null) {
            TPLogUtil.w("TPReportController", "mReportChannelListenerList is null");
            return;
        }
        Iterator<WeakReference<ITPReportChannelListener>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            if (it.next().get() == iTPReportChannelListener) {
                TPLogUtil.w("TPReportController", "mReportChannelListenerList has contain reportChannelListener");
                return;
            }
        }
        this.f102971f.add(new WeakReference<>(iTPReportChannelListener));
    }

    public void b() {
        TPLogUtil.i("TPReportController", "release");
        synchronized (this.f102975j) {
            a aVar = this.f102968c;
            if (aVar != null) {
                aVar.sendEmptyMessage(1000);
            }
            try {
                this.f102975j.wait(500L);
            } catch (InterruptedException e10) {
                TPLogUtil.e("TPReportController", e10);
            }
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.reportv2.ITPExtendReportController
    public void setReportInfoGetter(ITPReportInfoGetter iTPReportInfoGetter) {
        this.f102966a = iTPReportInfoGetter;
    }
}
