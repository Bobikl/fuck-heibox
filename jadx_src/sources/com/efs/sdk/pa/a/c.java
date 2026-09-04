package com.efs.sdk.pa.a;

import android.app.Application;
import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import com.efs.sdk.base.integrationtesting.IntegrationTestingUtil;
import com.efs.sdk.pa.PA;
import com.efs.sdk.pa.PAANRListener;
import com.efs.sdk.pa.PAMsgListener;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements PA {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f42787a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private e f42789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private f f42790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f42791e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f42794h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f42795i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Looper f42788b = Looper.myLooper();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b f42792f = new b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private g f42793g = new g();

    public c(boolean z10) {
        this.f42795i = z10;
    }

    @Override // com.efs.sdk.pa.PA
    public final void enableDumpToFile(String str) {
        f fVar = this.f42790d;
        if (fVar == null || str == null || str.trim().length() == 0) {
            return;
        }
        fVar.f42804c = str;
        if (fVar.f42805d != null) {
            return;
        }
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(str);
            try {
                fVar.f42805d = new BufferedOutputStream(fileOutputStream2);
            } catch (Exception unused) {
                fileOutputStream = fileOutputStream2;
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (Exception unused2) {
                    }
                }
            }
        } catch (Exception unused3) {
        }
    }

    @Override // com.efs.sdk.pa.PA
    public final void enableLog(boolean z10) {
        this.f42787a = z10;
        this.f42792f.f42781b = z10;
        this.f42793g.f42807b = z10;
        f fVar = this.f42790d;
        if (fVar != null) {
            fVar.f42803b = z10;
        }
    }

    @Override // com.efs.sdk.pa.PA
    public final int endCalFPS(String str) {
        if (!this.f42794h) {
            return -1;
        }
        b bVar = this.f42792f;
        int i10 = 0;
        if (str != null && str.trim().length() != 0) {
            b.a aVar = bVar.f42780a.get(str);
            if (aVar == null) {
                return 0;
            }
            View view = aVar.f42785d;
            if (view != null && aVar.f42784c != null) {
                view.getViewTreeObserver().removeOnPreDrawListener(aVar.f42784c);
            }
            bVar.f42780a.remove(str);
            int iCurrentTimeMillis = (int) (aVar.f42783b / ((System.currentTimeMillis() - aVar.f42782a) / 1000.0f));
            i10 = iCurrentTimeMillis > 0 ? iCurrentTimeMillis : 0;
            if (bVar.f42781b) {
                Log.e("PerformanceAnalyze", "key=" + str + ",fps=" + i10);
            }
        }
        return i10;
    }

    @Override // com.efs.sdk.pa.PA
    public final long endCalTime(String str) {
        if (!this.f42794h) {
            return -1L;
        }
        g gVar = this.f42793g;
        long jCurrentTimeMillis = 0;
        if (str != null && str.trim().length() != 0) {
            g.a aVar = gVar.f42806a.get(str);
            if (aVar == null) {
                return 0L;
            }
            gVar.f42806a.remove(str);
            jCurrentTimeMillis = System.currentTimeMillis() - aVar.f42808a;
            if (gVar.f42807b) {
                Log.e("PerformanceAnalyze", "key=" + str + ",consumeTime=" + jCurrentTimeMillis);
            }
        }
        return jCurrentTimeMillis;
    }

    @Override // com.efs.sdk.pa.PA
    public final void registerPAANRListener(Context context, PAANRListener pAANRListener) {
        registerPAANRListener(context, pAANRListener, 2000L);
    }

    @Override // com.efs.sdk.pa.PA
    public final void registerPAANRListener(Context context, PAANRListener pAANRListener, long j10) {
        registerPAANRListener(context, pAANRListener, j10, Looper.getMainLooper().getThread());
    }

    @Override // com.efs.sdk.pa.PA
    public final void registerPAANRListener(Context context, PAANRListener pAANRListener, long j10, Thread thread) {
        if (this.f42791e == null) {
            if (thread != null) {
                this.f42791e = new a((Application) context.getApplicationContext(), j10);
            } else {
                this.f42791e = new a((Application) context.getApplicationContext(), j10, false);
            }
        }
        this.f42791e.f42769h = pAANRListener;
    }

    @Override // com.efs.sdk.pa.PA
    public final void registerPAMsgListener(PAMsgListener pAMsgListener) {
        if (this.f42789c == null) {
            this.f42789c = new e();
        }
        this.f42788b.setMessageLogging(this.f42789c);
        if (this.f42790d == null) {
            this.f42790d = new f();
        }
        f fVar = this.f42790d;
        fVar.f42803b = this.f42787a;
        fVar.f42802a = pAMsgListener;
        this.f42789c.f42796a.add(fVar);
    }

    @Override // com.efs.sdk.pa.PA
    public final void start() {
        if (this.f42795i || IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
            this.f42794h = true;
            e eVar = this.f42789c;
            if (eVar != null) {
                this.f42788b.setMessageLogging(eVar);
            }
            a aVar = this.f42791e;
            if (aVar == null || !aVar.f42767f) {
                return;
            }
            aVar.f42767f = false;
            aVar.f42768g.post(aVar.f42774m);
            aVar.f42771j = SystemClock.uptimeMillis();
        }
    }

    @Override // com.efs.sdk.pa.PA
    public final void startCalFPS(String str, View view) {
        if (this.f42794h) {
            b bVar = this.f42792f;
            if (str == null || str.trim().length() == 0 || view == null || bVar.f42780a.get(str) != null) {
                return;
            }
            b.a aVar = new b.a((byte) 0);
            aVar.f42785d = view;
            b.a.AnonymousClass1 anonymousClass1 = new ViewTreeObserver.OnPreDrawListener() { // from class: com.efs.sdk.pa.a.b.a.1
                AnonymousClass1() {
                }

                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    a.this.f42783b++;
                    return true;
                }
            };
            aVar.f42784c = anonymousClass1;
            aVar.f42785d.getViewTreeObserver().addOnPreDrawListener(anonymousClass1);
            aVar.f42782a = System.currentTimeMillis();
            bVar.f42780a.put(str, aVar);
        }
    }

    @Override // com.efs.sdk.pa.PA
    public final void startCalTime(String str) {
        if (this.f42794h) {
            g gVar = this.f42793g;
            if (str == null || str.trim().length() == 0 || gVar.f42806a.get(str) != null) {
                return;
            }
            g.a aVar = new g.a((byte) 0);
            aVar.f42808a = System.currentTimeMillis();
            gVar.f42806a.put(str, aVar);
        }
    }

    @Override // com.efs.sdk.pa.PA
    public final void stop() {
        this.f42794h = false;
        this.f42788b.setMessageLogging(null);
        a aVar = this.f42791e;
        if (aVar != null) {
            aVar.f42767f = true;
            aVar.f42768g.removeCallbacksAndMessages(null);
            aVar.f42762a = true;
        }
    }

    @Override // com.efs.sdk.pa.PA
    public final void unRegisterPAMsgListener() {
        f fVar = this.f42790d;
        if (fVar != null) {
            fVar.f42802a = null;
        }
        e eVar = this.f42789c;
        if (eVar != null) {
            eVar.f42796a.remove(fVar);
        }
    }

    @Override // com.efs.sdk.pa.PA
    public final void unregisterPAANRListener() {
    }
}
