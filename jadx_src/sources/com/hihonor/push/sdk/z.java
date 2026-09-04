package com.hihonor.push.sdk;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.hihonor.push.framework.aidl.DataBuffer;
import com.hihonor.push.framework.aidl.IMessageEntity;
import com.hihonor.push.framework.aidl.IPushInvoke;
import com.hihonor.push.framework.aidl.MessageCodec;
import com.hihonor.push.framework.aidl.entity.RequestHeader;
import com.hihonor.push.sdk.bean.RemoteServiceBean;
import com.hihonor.push.sdk.internal.HonorPushErrorEnum;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public class z implements Handler.Callback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z f60108c = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f60109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<w, a> f60110b = new ConcurrentHashMap(5, 0.75f, 1);

    public class a implements b0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Queue<f1<?>> f60111a = new LinkedList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Queue<f1<?>> f60112b = new LinkedList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b0 f60113c = new d0(this);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public HonorPushErrorEnum f60114d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final w f60115e;

        public a(w wVar) {
            this.f60115e = wVar;
        }

        public void a() {
            com.hihonor.push.sdk.b.a(z.this.f60109a);
            d0 d0Var = (d0) this.f60113c;
            int i10 = d0Var.f60012a.get();
            Log.i("PushConnectionClient", "enter disconnect, connection Status: " + i10);
            if (i10 != 3) {
                if (i10 != 5) {
                    return;
                }
                d0Var.f60012a.set(4);
            } else {
                f0 f0Var = d0Var.f60015d;
                if (f0Var != null) {
                    f0Var.b();
                }
                d0Var.f60012a.set(1);
            }
        }

        /* JADX WARN: Code duplicated, block: B:35:0x008f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        public final synchronized void a(f1<?> f1Var) {
            h0 h0Var;
            IPushInvoke iPushInvoke;
            DataBuffer dataBuffer;
            Type type;
            this.f60112b.add(f1Var);
            b0 b0Var = this.f60113c;
            b bVar = new b(f1Var);
            f1Var.getClass();
            Object objNewInstance = null;
            try {
                Type genericSuperclass = f1Var.getClass().getGenericSuperclass();
                Class cls = (genericSuperclass == null || (type = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]) == null) ? null : (Class) type;
                if (cls == null || cls.isPrimitive()) {
                    h0Var = new h0(objNewInstance, bVar);
                    Log.i("IpcTransport", "start transport parse. " + f1Var.f60028b);
                    iPushInvoke = ((d0) b0Var).f60013b;
                    String str = f1Var.f60028b;
                    RequestHeader requestHeader = f1Var.f60031e;
                    IMessageEntity iMessageEntity = f1Var.f60029c;
                    Bundle bundle = new Bundle();
                    Bundle bundle2 = new Bundle();
                    MessageCodec.formMessageEntity(requestHeader, bundle);
                    MessageCodec.formMessageEntity(iMessageEntity, bundle2);
                    dataBuffer = new DataBuffer(str, bundle, bundle2);
                    if (iPushInvoke != null) {
                        try {
                            iPushInvoke.call(dataBuffer, h0Var);
                        } catch (Exception e10) {
                            e10.toString();
                        }
                    }
                    Log.i("IpcTransport", "end transport parse.");
                } else {
                    objNewInstance = cls.newInstance();
                    h0Var = new h0(objNewInstance, bVar);
                    Log.i("IpcTransport", "start transport parse. " + f1Var.f60028b);
                    iPushInvoke = ((d0) b0Var).f60013b;
                    String str2 = f1Var.f60028b;
                    RequestHeader requestHeader2 = f1Var.f60031e;
                    IMessageEntity iMessageEntity2 = f1Var.f60029c;
                    Bundle bundle3 = new Bundle();
                    Bundle bundle4 = new Bundle();
                    MessageCodec.formMessageEntity(requestHeader2, bundle3);
                    MessageCodec.formMessageEntity(iMessageEntity2, bundle4);
                    dataBuffer = new DataBuffer(str2, bundle3, bundle4);
                    if (iPushInvoke != null) {
                        iPushInvoke.call(dataBuffer, h0Var);
                    }
                    Log.i("IpcTransport", "end transport parse.");
                }
            } catch (Exception e11) {
                c.a("In newResponseInstance, instancing exception." + e11.getMessage());
            }
            throw th;
        }

        public final synchronized void a(HonorPushErrorEnum honorPushErrorEnum) {
            Log.i("HonorApiManager", "onConnectionFailed");
            com.hihonor.push.sdk.b.a(z.this.f60109a);
            Iterator<f1<?>> it = this.f60111a.iterator();
            while (it.hasNext()) {
                it.next().b(honorPushErrorEnum.toApiException(), null);
            }
            this.f60111a.clear();
            this.f60114d = honorPushErrorEnum;
            a();
            z.this.f60110b.remove(this.f60115e);
        }

        public final synchronized void b() {
            Log.i("HonorApiManager", "onConnected");
            com.hihonor.push.sdk.b.a(z.this.f60109a);
            this.f60114d = null;
            Iterator<f1<?>> it = this.f60111a.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            this.f60111a.clear();
        }
    }

    public static class b implements i0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public f1<?> f60117a;

        public b(f1<?> f1Var) {
            this.f60117a = f1Var;
        }
    }

    public z() {
        HandlerThread handlerThread = new HandlerThread("HonorApiManager");
        handlerThread.start();
        this.f60109a = new Handler(handlerThread.getLooper(), this);
    }

    public <TResult> a1<TResult> a(f1<TResult> f1Var) {
        n0<TResult> n0Var = new n0<>();
        f1Var.f60027a = n0Var;
        Log.i("HonorApiManager", "sendRequest start");
        Handler handler = this.f60109a;
        handler.sendMessage(handler.obtainMessage(1, f1Var));
        return n0Var.f60061a;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        a aVar;
        int i10 = message.what;
        if (i10 != 1) {
            if (i10 != 2) {
                return false;
            }
            f1 f1Var = (f1) message.obj;
            w wVar = f1Var.f60030d;
            if (wVar != null && this.f60110b.containsKey(wVar) && (aVar = this.f60110b.get(wVar)) != null) {
                synchronized (aVar) {
                    aVar.f60112b.remove(f1Var);
                    if (aVar.f60111a.peek() == null || aVar.f60112b.peek() == null) {
                        aVar.a();
                        z.this.f60110b.remove(aVar.f60115e);
                    }
                }
            }
            return true;
        }
        f1<?> f1Var2 = (f1) message.obj;
        w wVar2 = f1Var2.f60030d;
        a aVar2 = this.f60110b.get(wVar2);
        if (aVar2 == null) {
            Log.i("HonorApiManager", "connect and send request, create new connection manager.");
            aVar2 = new a(wVar2);
            this.f60110b.put(wVar2, aVar2);
        }
        synchronized (aVar2) {
            com.hihonor.push.sdk.b.a(z.this.f60109a);
            if (((d0) aVar2.f60113c).a()) {
                aVar2.a(f1Var2);
            } else {
                aVar2.f60111a.add(f1Var2);
                HonorPushErrorEnum honorPushErrorEnum = aVar2.f60114d;
                if (honorPushErrorEnum == null || honorPushErrorEnum.getErrorCode() == 0) {
                    synchronized (aVar2) {
                        com.hihonor.push.sdk.b.a(z.this.f60109a);
                        if (((d0) aVar2.f60113c).a()) {
                            Log.i("HonorApiManager", "client is connected");
                        } else {
                            if (((d0) aVar2.f60113c).f60012a.get() == 5) {
                                Log.i("HonorApiManager", "client is isConnecting");
                            } else {
                                d0 d0Var = (d0) aVar2.f60113c;
                                d0Var.getClass();
                                Log.i("PushConnectionClient", " ==== PUSHSDK VERSION 70061303 ====");
                                int i11 = d0Var.f60012a.get();
                                Log.i("PushConnectionClient", "enter connect, connection Status: " + i11);
                                if (i11 != 3 && i11 != 5 && i11 != 4) {
                                    l lVar = l.f60050e;
                                    int iB = com.hihonor.push.sdk.b.b(lVar.a());
                                    if (iB == HonorPushErrorEnum.SUCCESS.getErrorCode()) {
                                        d0Var.f60012a.set(5);
                                        RemoteServiceBean remoteServiceBeanA = com.hihonor.push.sdk.b.a(lVar.a());
                                        Log.i("PushConnectionClient", "enter bindCoreService.");
                                        f0 f0Var = new f0(remoteServiceBeanA);
                                        d0Var.f60015d = f0Var;
                                        f0Var.f60024b = new c0(d0Var);
                                        if (remoteServiceBeanA.checkServiceInfo()) {
                                            Intent intent = new Intent();
                                            String packageName = f0Var.f60023a.getPackageName();
                                            String packageAction = f0Var.f60023a.getPackageAction();
                                            String packageServiceName = f0Var.f60023a.getPackageServiceName();
                                            if (TextUtils.isEmpty(packageServiceName)) {
                                                intent.setAction(packageAction);
                                                intent.setPackage(packageName);
                                            } else {
                                                intent.setComponent(new ComponentName(packageName, packageServiceName));
                                            }
                                            synchronized (f0.f60022e) {
                                                if (lVar.a().bindService(intent, f0Var, 1)) {
                                                    Handler handler = f0Var.f60025c;
                                                    if (handler != null) {
                                                        handler.removeMessages(1001);
                                                    } else {
                                                        f0Var.f60025c = new Handler(Looper.getMainLooper(), new e0(f0Var));
                                                    }
                                                    f0Var.f60025c.sendEmptyMessageDelayed(1001, 10000L);
                                                } else {
                                                    f0Var.f60026d = true;
                                                    f0Var.a(8002001);
                                                }
                                            }
                                        } else {
                                            Objects.toString(f0Var.f60023a);
                                            f0Var.a(8002004);
                                        }
                                    } else {
                                        d0Var.a(iB);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    aVar2.a(aVar2.f60114d);
                }
            }
        }
        return true;
    }
}
