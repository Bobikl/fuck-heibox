package anetwork.channel.aidl.adapter;

import android.os.Handler;
import android.os.RemoteException;
import anet.channel.util.ALog;
import anetwork.channel.aidl.DefaultFinishEvent;
import anetwork.channel.aidl.DefaultProgressEvent;
import anetwork.channel.aidl.ParcelableHeader;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class e extends anetwork.channel.aidl.g.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f30092l = "anet.ParcelableNetworkListenerWrapper";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private s3.f f30093h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Handler f30094i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Object f30095j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private byte f30096k;

    public e(s3.f fVar, Handler handler, Object obj) {
        this.f30096k = (byte) 0;
        this.f30093h = fVar;
        if (fVar != null) {
            if (s3.d.a.class.isAssignableFrom(fVar.getClass())) {
                this.f30096k = (byte) (this.f30096k | 1);
            }
            if (s3.d.c.class.isAssignableFrom(fVar.getClass())) {
                this.f30096k = (byte) (this.f30096k | 2);
            }
            if (s3.d.InterfaceC1266d.class.isAssignableFrom(fVar.getClass())) {
                this.f30096k = (byte) (this.f30096k | 4);
            }
            if (s3.d.b.class.isAssignableFrom(fVar.getClass())) {
                this.f30096k = (byte) (this.f30096k | 8);
            }
        }
        this.f30094i = handler;
        this.f30095j = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f1(byte b10, Object obj) {
        try {
            if (b10 == 4) {
                ParcelableHeader parcelableHeader = (ParcelableHeader) obj;
                ((s3.d.InterfaceC1266d) this.f30093h).N(parcelableHeader.c(), parcelableHeader.b(), this.f30095j);
                if (ALog.isPrintLog(1)) {
                    ALog.d(f30092l, "[onResponseCode]" + parcelableHeader, null, new Object[0]);
                    return;
                }
                return;
            }
            if (b10 == 2) {
                DefaultProgressEvent defaultProgressEvent = (DefaultProgressEvent) obj;
                if (defaultProgressEvent != null) {
                    defaultProgressEvent.h(this.f30095j);
                }
                ((s3.d.c) this.f30093h).f1(defaultProgressEvent, this.f30095j);
                if (ALog.isPrintLog(1)) {
                    ALog.d(f30092l, "[onDataReceived]" + defaultProgressEvent, null, new Object[0]);
                    return;
                }
                return;
            }
            if (b10 != 1) {
                if (b10 == 8) {
                    ((s3.d.b) this.f30093h).g((anetwork.channel.aidl.f) obj, this.f30095j);
                    if (ALog.isPrintLog(1)) {
                        ALog.d(f30092l, "[onInputStreamReceived]", null, new Object[0]);
                        return;
                    }
                    return;
                }
                return;
            }
            DefaultFinishEvent defaultFinishEvent = (DefaultFinishEvent) obj;
            if (defaultFinishEvent != null) {
                defaultFinishEvent.d(this.f30095j);
            }
            ((s3.d.a) this.f30093h).r0(defaultFinishEvent, this.f30095j);
            if (ALog.isPrintLog(1)) {
                ALog.d(f30092l, "[onFinished]" + defaultFinishEvent, null, new Object[0]);
            }
        } catch (Exception unused) {
            ALog.e(f30092l, "dispatchCallback error", null, new Object[0]);
        }
    }

    private void r0(byte b10, Object obj) {
        Handler handler = this.f30094i;
        if (handler == null) {
            f1(b10, obj);
        } else {
            handler.post(new h(this, b10, obj));
        }
    }

    @Override // anetwork.channel.aidl.g
    public byte C0() throws RemoteException {
        return this.f30096k;
    }

    @Override // anetwork.channel.aidl.g
    public void Q(DefaultProgressEvent defaultProgressEvent) throws RemoteException {
        if ((this.f30096k & 2) != 0) {
            r0((byte) 2, defaultProgressEvent);
        }
    }

    @Override // anetwork.channel.aidl.g
    public void j(anetwork.channel.aidl.f fVar) throws RemoteException {
        if ((this.f30096k & 8) != 0) {
            r0((byte) 8, fVar);
        }
    }

    public s3.f q1() {
        return this.f30093h;
    }

    @Override // anetwork.channel.aidl.g
    public boolean s(int i10, ParcelableHeader parcelableHeader) throws RemoteException {
        if ((this.f30096k & 4) == 0) {
            return false;
        }
        r0((byte) 4, parcelableHeader);
        return false;
    }

    @Override // anetwork.channel.aidl.g
    public void x0(DefaultFinishEvent defaultFinishEvent) throws RemoteException {
        if ((this.f30096k & 1) != 0) {
            r0((byte) 1, defaultFinishEvent);
        }
        this.f30093h = null;
        this.f30095j = null;
        this.f30094i = null;
    }
}
