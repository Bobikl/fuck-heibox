package com.efs.sdk.base.core.controller;

import android.content.IntentFilter;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import android.webkit.ValueCallback;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.core.c.f;
import com.efs.sdk.base.core.config.GlobalEnvStruct;
import com.efs.sdk.base.core.config.GlobalInfoManager;
import com.efs.sdk.base.core.config.a.c;
import com.efs.sdk.base.core.controller.a.a;
import com.efs.sdk.base.core.d.b;
import com.efs.sdk.base.core.e.d;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.core.util.concurrent.WorkThreadUtil;
import com.efs.sdk.base.http.HttpResponse;
import com.efs.sdk.base.protocol.ILogProtocol;
import java.io.File;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class ControllerCenter implements Handler.Callback {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static GlobalEnvStruct f42502h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f42503a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f42504b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f42505c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f42506d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f42507e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f42508f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a f42509g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Handler f42510i;

    public ControllerCenter(EfsReporter.Builder builder) {
        f42502h = builder.getGlobalEnvStruct();
        Handler handler = new Handler(com.efs.sdk.base.core.util.concurrent.a.f42576a.getLooper(), this);
        this.f42510i = handler;
        handler.sendEmptyMessage(0);
    }

    private void a() {
        if (this.f42509g == null) {
            this.f42509g = new a();
        }
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            f42502h.mAppContext.registerReceiver(this.f42509g, intentFilter);
        } catch (Throwable th2) {
            Log.w("efs.base", "register network change receiver error", th2);
            int i10 = this.f42503a + 1;
            this.f42503a = i10;
            if (i10 < 3) {
                this.f42510i.sendEmptyMessageDelayed(3, 6000L);
            }
        }
    }

    static /* synthetic */ void a(ILogProtocol iLogProtocol) {
        for (ValueCallback<Pair<Message, Message>> valueCallback : getGlobalEnvStruct().getCallback(9)) {
            HashMap map = new HashMap(4);
            map.put("log_type", iLogProtocol.getLogType());
            map.put("log_data", iLogProtocol.generateString());
            map.put("link_key", iLogProtocol.getLinkKey());
            map.put("link_id", iLogProtocol.getLinkId());
            Message messageObtain = Message.obtain(null, 9, map);
            Message messageObtain2 = Message.obtain();
            valueCallback.onReceiveValue(new Pair<>(messageObtain, messageObtain2));
            messageObtain.recycle();
            messageObtain2.recycle();
        }
    }

    private void b(final ILogProtocol iLogProtocol) {
        if (iLogProtocol == null) {
            return;
        }
        WorkThreadUtil.submit(new Runnable() { // from class: com.efs.sdk.base.core.controller.ControllerCenter.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    iLogProtocol.insertGlobal(GlobalInfoManager.getInstance().getGlobalInfo());
                    if (!"wa".equalsIgnoreCase(iLogProtocol.getLogType())) {
                        ControllerCenter.a(iLogProtocol);
                    }
                    if (ControllerCenter.getGlobalEnvStruct().isEnableSendLog()) {
                        final b bVarA = b.a(iLogProtocol);
                        final d dVar = d.a.f42533a;
                        WorkThreadUtil.submit(new Runnable() { // from class: com.efs.sdk.base.core.e.d.1

                            /* JADX INFO: renamed from: a */
                            final /* synthetic */ com.efs.sdk.base.core.d.b f42531a;

                            public AnonymousClass1() {
                                bVar = bVarA;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                d.this.f42530a.a(bVar);
                            }
                        });
                    }
                } catch (Throwable th2) {
                    Log.e("efs.base", "log send error", th2);
                }
            }
        });
    }

    @n0
    public static GlobalEnvStruct getGlobalEnvStruct() {
        return f42502h;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@n0 Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            GlobalInfoManager.getInstance().initGlobalInfo();
            f unused = f.a.f42462a;
            c.a().b();
            a();
            com.efs.sdk.base.core.f.f fVar = com.efs.sdk.base.core.f.f.a.f42551a;
            boolean zIsIntl = f42502h.isIntl();
            com.efs.sdk.base.core.f.c cVar = fVar.f42547a;
            if (zIsIntl) {
                cVar.f42539a = "https://errnewlogos.umeng.com/api/crashsdk/logcollect";
                cVar.f42540b = "4ea4e41a3993";
            } else {
                cVar.f42539a = "https://errnewlog.umeng.com/api/crashsdk/logcollect";
                cVar.f42540b = "28ef1713347d";
            }
            fVar.f42548b = this;
            fVar.f42549c.f42534a = this;
            fVar.f42550d.f42534a = this;
            this.f42508f = true;
            com.efs.sdk.base.core.c.d.a().sendEmptyMessageDelayed(0, f42502h.getLogSendDelayMills());
            com.efs.sdk.base.core.f.f fVar2 = com.efs.sdk.base.core.f.f.a.f42551a;
            if (fVar2.f42548b != null && getGlobalEnvStruct().isEnableWaStat()) {
                fVar2.f42548b.send(new com.efs.sdk.base.core.f.b("efs_core", "pvuv", fVar2.f42547a.f42541c));
            }
        } else if (i10 == 1) {
            Object obj = message.obj;
            if (obj != null && (obj instanceof ILogProtocol)) {
                b((ILogProtocol) obj);
            }
        } else if (i10 == 3) {
            a();
        }
        return true;
    }

    public void send(ILogProtocol iLogProtocol) {
        if (this.f42508f) {
            b(iLogProtocol);
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        messageObtain.obj = iLogProtocol;
        this.f42510i.sendMessage(messageObtain);
    }

    @p0
    public HttpResponse sendSyncImmediately(String str, int i10, String str2, boolean z10, File file) {
        b bVar = new b(str, (byte) 2);
        bVar.b(1);
        bVar.f42523d = file;
        bVar.a(str2);
        bVar.a(i10);
        bVar.f42521b.f42525b = z10;
        bVar.c();
        d.a.f42533a.f42530a.a(bVar);
        return bVar.f42521b.f42526c;
    }
}
