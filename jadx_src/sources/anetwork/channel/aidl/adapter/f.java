package anetwork.channel.aidl.adapter;

import android.os.RemoteException;
import anet.channel.util.ALog;
import com.google.android.exoplayer2.audio.q0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class f implements Future<s3.i> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private anetwork.channel.aidl.e f30097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private s3.i f30098c;

    public f(anetwork.channel.aidl.e eVar) {
        this.f30097b = eVar;
    }

    public f(s3.i iVar) {
        this.f30098c = iVar;
    }

    @Override // java.util.concurrent.Future
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public s3.i get() throws ExecutionException, InterruptedException {
        s3.i iVar = this.f30098c;
        if (iVar != null) {
            return iVar;
        }
        anetwork.channel.aidl.e eVar = this.f30097b;
        if (eVar != null) {
            try {
                return eVar.n1(q0.f44202v);
            } catch (RemoteException e10) {
                ALog.w("anet.FutureResponse", "[get]", null, e10, new Object[0]);
            }
        }
        return null;
    }

    public s3.i b(long j10) throws ExecutionException, InterruptedException, TimeoutException {
        s3.i iVar = this.f30098c;
        if (iVar != null) {
            return iVar;
        }
        anetwork.channel.aidl.e eVar = this.f30097b;
        if (eVar != null) {
            try {
                return eVar.n1(j10);
            } catch (RemoteException e10) {
                ALog.w("anet.FutureResponse", "[get(long timeout, TimeUnit unit)]", null, e10, new Object[0]);
            }
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        anetwork.channel.aidl.e eVar = this.f30097b;
        if (eVar == null) {
            return false;
        }
        try {
            return eVar.cancel(z10);
        } catch (RemoteException e10) {
            ALog.w("anet.FutureResponse", "[cancel]", null, e10, new Object[0]);
            return false;
        }
    }

    @Override // java.util.concurrent.Future
    public /* synthetic */ s3.i get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return b(j10);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        try {
            return this.f30097b.isCancelled();
        } catch (RemoteException e10) {
            ALog.w("anet.FutureResponse", "[isCancelled]", null, e10, new Object[0]);
            return false;
        }
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        try {
            return this.f30097b.isDone();
        } catch (RemoteException e10) {
            ALog.w("anet.FutureResponse", "[isDone]", null, e10, new Object[0]);
            return true;
        }
    }
}
