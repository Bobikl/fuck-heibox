package com.efs.sdk.base.core.c;

import android.os.Handler;
import android.os.Message;
import com.efs.sdk.base.core.b.h;
import com.efs.sdk.base.core.config.GlobalInfoManager;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.core.util.NetworkUtil;
import com.efs.sdk.base.core.util.concurrent.WorkThreadUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f42448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f42449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f42450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<String> f42451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AtomicInteger f42452e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.efs.sdk.base.core.b.f f42453f;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final d f42454a = new d(0);
    }

    private d() {
        super(com.efs.sdk.base.core.util.concurrent.a.f42576a.getLooper());
        this.f42448a = 5;
        this.f42451d = new ArrayList();
        this.f42452e = new AtomicInteger(0);
        this.f42449b = new com.efs.sdk.base.core.c.a();
        this.f42450c = new com.efs.sdk.base.core.f.e();
        this.f42453f = new h();
    }

    /* synthetic */ d(byte b10) {
        this();
    }

    public static d a() {
        return a.f42454a;
    }

    final void a(Object obj, int i10) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        messageObtain.obj = obj;
        messageObtain.arg1 = i10;
        sendMessage(messageObtain);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        List<File> listEmptyList;
        super.handleMessage(message);
        if (f.a.f42462a.a()) {
            int i10 = message.what;
            if (i10 != 0) {
                if (i10 != 1) {
                    return;
                }
                Object obj = message.obj;
                if (obj != null) {
                    this.f42451d.remove(obj.toString());
                }
                int iIncrementAndGet = message.arg1 != 0 ? this.f42452e.incrementAndGet() : 0;
                if (this.f42451d.isEmpty()) {
                    if (iIncrementAndGet < 5) {
                        sendEmptyMessage(0);
                        return;
                    }
                    this.f42452e.set(0);
                    sendEmptyMessageDelayed(0, ControllerCenter.getGlobalEnvStruct().getLogSendDelayMills());
                    Log.i("efs.send_log", "request error cnt gt 5, next request delay 10s");
                    return;
                }
                return;
            }
            String netStatus = GlobalInfoManager.getInstance().getNetStatus();
            if (NetworkUtil.NETWORK_CLASS_DENIED.equalsIgnoreCase(netStatus) || NetworkUtil.NETWORK_CLASS_DISCONNECTED.equalsIgnoreCase(netStatus)) {
                Log.i("efs.send_log", "log cann't be send because net status is ".concat(String.valueOf(netStatus)));
                sendEmptyMessageDelayed(0, ControllerCenter.getGlobalEnvStruct().getLogSendIntervalMills());
                return;
            }
            List<com.efs.sdk.base.core.d.b> listEmptyList2 = Collections.emptyList();
            try {
                com.efs.sdk.base.core.b.a aVar = com.efs.sdk.base.core.b.a.b.f42431a;
                int i11 = this.f42448a;
                com.efs.sdk.base.core.b.f fVar = this.f42453f;
                aVar.a();
                aVar.a();
                File fileF = com.efs.sdk.base.core.util.a.f(ControllerCenter.getGlobalEnvStruct().mAppContext, ControllerCenter.getGlobalEnvStruct().getAppid());
                if (fileF.exists()) {
                    List<File> listD = com.efs.sdk.base.core.util.b.d(fileF);
                    if (aVar.f42428b) {
                        com.efs.sdk.base.core.f.f fVar2 = com.efs.sdk.base.core.f.f.a.f42551a;
                        int size = listD.size();
                        if (fVar2.f42548b != null && ControllerCenter.getGlobalEnvStruct().isEnableWaStat()) {
                            com.efs.sdk.base.core.f.b bVar = new com.efs.sdk.base.core.f.b("efs_core", "log_lag", fVar2.f42547a.f42541c);
                            bVar.put("cnt", Integer.valueOf(size));
                            fVar2.f42548b.send(bVar);
                        }
                        aVar.f42428b = false;
                    }
                    Collections.sort(listD, aVar.f42430d);
                    ArrayList arrayList = new ArrayList(i11);
                    for (int size2 = listD.size() - 1; size2 >= 0 && arrayList.size() < i11; size2--) {
                        File file = listD.get(size2);
                        if (file.exists() && (fVar == null || !fVar.a(file))) {
                            arrayList.add(file);
                        }
                    }
                    listEmptyList = arrayList;
                } else {
                    listEmptyList = Collections.emptyList();
                }
                ArrayList arrayList2 = new ArrayList(i11);
                for (File file2 : listEmptyList) {
                    com.efs.sdk.base.core.d.b bVarA = aVar.a(file2);
                    if (bVarA == null) {
                        Log.w("efs.cache", "file upload error, name is " + file2.getName());
                    } else {
                        arrayList2.add(bVarA);
                    }
                }
                listEmptyList2 = arrayList2;
            } catch (Throwable unused) {
            }
            for (com.efs.sdk.base.core.d.b bVar2 : listEmptyList2) {
                if ("wa".equals(bVar2.f42520a.f42513a) || b.a().a(bVar2.f42520a.f42513a, bVar2.a())) {
                    c cVar = this.f42449b;
                    if ("wa".equals(bVar2.f42520a.f42513a)) {
                        cVar = this.f42450c;
                    }
                    String string = UUID.randomUUID().toString();
                    this.f42451d.add(string);
                    if (WorkThreadUtil.submit(new e(bVar2, cVar, string)) == null) {
                        a(string, -1);
                    }
                }
            }
            if (this.f42451d.size() <= 0) {
                sendEmptyMessageDelayed(0, ControllerCenter.getGlobalEnvStruct().getLogSendIntervalMills());
            }
        }
    }
}
