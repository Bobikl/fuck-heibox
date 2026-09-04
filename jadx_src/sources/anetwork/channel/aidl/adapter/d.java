package anetwork.channel.aidl.adapter;

import android.os.RemoteException;
import anet.channel.bytes.ByteArray;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class d extends anetwork.channel.aidl.f.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f30081s = "anet.ParcelableInputStreamImpl";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final ByteArray f30082t = ByteArray.create(0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f30085l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f30086m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f30087n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final ReentrantLock f30090q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final Condition f30091r;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AtomicBoolean f30083j = new AtomicBoolean(false);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private LinkedList<ByteArray> f30084k = new LinkedList<>();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f30088o = 10000;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f30089p = "";

    public d() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f30090q = reentrantLock;
        this.f30091r = reentrantLock.newCondition();
    }

    private void r0() {
        this.f30090q.lock();
        try {
            this.f30084k.set(this.f30085l, f30082t).recycle();
        } finally {
            this.f30090q.unlock();
        }
    }

    public void N(anetwork.channel.entity.k kVar, int i10) {
        this.f30087n = i10;
        this.f30089p = kVar.f30247i;
        this.f30088o = kVar.f30246h;
    }

    @Override // anetwork.channel.aidl.f
    public int available() throws RemoteException {
        if (this.f30083j.get()) {
            throw new RuntimeException("Stream is closed");
        }
        this.f30090q.lock();
        try {
            int dataLength = 0;
            if (this.f30085l == this.f30084k.size()) {
                return 0;
            }
            ListIterator<ByteArray> listIterator = this.f30084k.listIterator(this.f30085l);
            while (listIterator.hasNext()) {
                dataLength += listIterator.next().getDataLength();
            }
            return dataLength - this.f30086m;
        } finally {
            this.f30090q.unlock();
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x007f */
    @Override // anetwork.channel.aidl.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int b0(byte[] r6, int r7, int r8) throws android.os.RemoteException {
        /*
            r5 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.f30083j
            boolean r0 = r0.get()
            if (r0 != 0) goto La3
            r6.getClass()
            if (r7 < 0) goto L9d
            if (r8 < 0) goto L9d
            int r8 = r8 + r7
            int r0 = r6.length
            if (r8 > r0) goto L9d
            java.util.concurrent.locks.ReentrantLock r0 = r5.f30090q
            r0.lock()
            r0 = r7
        L19:
            if (r0 >= r8) goto L92
            int r1 = r5.f30085l     // Catch: java.lang.Throwable -> L7f java.lang.InterruptedException -> L81
            java.util.LinkedList<anet.channel.bytes.ByteArray> r2 = r5.f30084k     // Catch: java.lang.Throwable -> L7f java.lang.InterruptedException -> L81
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L7f java.lang.InterruptedException -> L81
            if (r1 != r2) goto L3e
            java.util.concurrent.locks.Condition r1 = r5.f30091r     // Catch: java.lang.Throwable -> L7f java.lang.InterruptedException -> L81
            int r2 = r5.f30088o     // Catch: java.lang.Throwable -> L7f java.lang.InterruptedException -> L81
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L7f java.lang.InterruptedException -> L81
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L7f java.lang.InterruptedException -> L81
            boolean r1 = r1.await(r2, r4)     // Catch: java.lang.Throwable -> L7f java.lang.InterruptedException -> L81
            if (r1 == 0) goto L33
            goto L3e
        L33:
            r5.close()     // Catch: java.lang.Throwable -> L7f java.lang.InterruptedException -> L81
            java.lang.RuntimeException r6 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L7f java.lang.InterruptedException -> L81
            java.lang.String r7 = "await timeout."
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L7f java.lang.InterruptedException -> L81
            throw r6     // Catch: java.lang.Throwable -> L7f java.lang.InterruptedException -> L81
        L3e:
            java.util.LinkedList<anet.channel.bytes.ByteArray> r1 = r5.f30084k     // Catch: java.lang.Throwable -> L7f java.lang.InterruptedException -> L81
            int r2 = r5.f30085l     // Catch: java.lang.Throwable -> L7f java.lang.InterruptedException -> L81
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L7f java.lang.InterruptedException -> L81
            anet.channel.bytes.ByteArray r1 = (anet.channel.bytes.ByteArray) r1     // Catch: java.lang.Throwable -> L7f java.lang.InterruptedException -> L81
            anet.channel.bytes.ByteArray r2 = anetwork.channel.aidl.adapter.d.f30082t     // Catch: java.lang.Throwable -> L7f java.lang.InterruptedException -> L81
            if (r1 != r2) goto L4d
            goto L92
        L4d:
            int r2 = r1.getDataLength()     // Catch: java.lang.Throwable -> L7f java.lang.InterruptedException -> L81
            int r3 = r5.f30086m     // Catch: java.lang.Throwable -> L7f java.lang.InterruptedException -> L81
            int r2 = r2 - r3
            int r3 = r8 - r0
            if (r2 >= r3) goto L6f
            byte[] r1 = r1.getBuffer()     // Catch: java.lang.Throwable -> L7f java.lang.InterruptedException -> L81
            int r3 = r5.f30086m     // Catch: java.lang.Throwable -> L7f java.lang.InterruptedException -> L81
            java.lang.System.arraycopy(r1, r3, r6, r0, r2)     // Catch: java.lang.Throwable -> L7f java.lang.InterruptedException -> L81
            int r0 = r0 + r2
            r5.r0()     // Catch: java.lang.Throwable -> L7f java.lang.InterruptedException -> L81
            int r1 = r5.f30085l     // Catch: java.lang.Throwable -> L7f java.lang.InterruptedException -> L81
            int r1 = r1 + 1
            r5.f30085l = r1     // Catch: java.lang.Throwable -> L7f java.lang.InterruptedException -> L81
            r1 = 0
            r5.f30086m = r1     // Catch: java.lang.Throwable -> L7f java.lang.InterruptedException -> L81
            goto L19
        L6f:
            byte[] r1 = r1.getBuffer()     // Catch: java.lang.Throwable -> L7f java.lang.InterruptedException -> L81
            int r2 = r5.f30086m     // Catch: java.lang.Throwable -> L7f java.lang.InterruptedException -> L81
            java.lang.System.arraycopy(r1, r2, r6, r0, r3)     // Catch: java.lang.Throwable -> L7f java.lang.InterruptedException -> L81
            int r1 = r5.f30086m     // Catch: java.lang.Throwable -> L7f java.lang.InterruptedException -> L81
            int r1 = r1 + r3
            r5.f30086m = r1     // Catch: java.lang.Throwable -> L7f java.lang.InterruptedException -> L81
            int r0 = r0 + r3
            goto L19
        L7f:
            r6 = move-exception
            goto L8c
        L81:
            r5.close()     // Catch: java.lang.Throwable -> L7f
            java.lang.RuntimeException r6 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L7f
            java.lang.String r7 = "await interrupt"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L7f
            throw r6     // Catch: java.lang.Throwable -> L7f
        L8c:
            java.util.concurrent.locks.ReentrantLock r7 = r5.f30090q
            r7.unlock()
            throw r6
        L92:
            java.util.concurrent.locks.ReentrantLock r6 = r5.f30090q
            r6.unlock()
            int r0 = r0 - r7
            if (r0 <= 0) goto L9b
            goto L9c
        L9b:
            r0 = -1
        L9c:
            return r0
        L9d:
            java.lang.ArrayIndexOutOfBoundsException r6 = new java.lang.ArrayIndexOutOfBoundsException
            r6.<init>()
            throw r6
        La3:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r7 = "Stream is closed"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: anetwork.channel.aidl.adapter.d.b0(byte[], int, int):int");
    }

    @Override // anetwork.channel.aidl.f
    public long c(int i10) throws RemoteException {
        ByteArray byteArray;
        this.f30090q.lock();
        int i11 = 0;
        while (i11 < i10) {
            try {
                if (this.f30085l == this.f30084k.size() || (byteArray = this.f30084k.get(this.f30085l)) == f30082t) {
                    break;
                    break;
                }
                int dataLength = byteArray.getDataLength();
                int i12 = this.f30086m;
                int i13 = i10 - i11;
                if (dataLength - i12 < i13) {
                    i11 += dataLength - i12;
                    r0();
                    this.f30085l++;
                    this.f30086m = 0;
                } else {
                    this.f30086m = i12 + i13;
                    i11 = i10;
                }
            } catch (Throwable th2) {
                this.f30090q.unlock();
                throw th2;
            }
        }
        this.f30090q.unlock();
        return i11;
    }

    @Override // anetwork.channel.aidl.f
    public void close() throws RemoteException {
        if (this.f30083j.compareAndSet(false, true)) {
            this.f30090q.lock();
            try {
                for (ByteArray byteArray : this.f30084k) {
                    if (byteArray != f30082t) {
                        byteArray.recycle();
                    }
                }
                this.f30084k.clear();
                this.f30084k = null;
                this.f30085l = -1;
                this.f30086m = -1;
                this.f30087n = 0;
            } finally {
                this.f30090q.unlock();
            }
        }
    }

    public void f1(ByteArray byteArray) {
        if (this.f30083j.get()) {
            return;
        }
        this.f30090q.lock();
        try {
            this.f30084k.add(byteArray);
            this.f30091r.signal();
        } finally {
            this.f30090q.unlock();
        }
    }

    @Override // anetwork.channel.aidl.f
    public int length() throws RemoteException {
        return this.f30087n;
    }

    public void q1() {
        f1(f30082t);
    }

    @Override // anetwork.channel.aidl.f
    public int read(byte[] bArr) throws RemoteException {
        return b0(bArr, 0, bArr.length);
    }

    @Override // anetwork.channel.aidl.f
    public int readByte() throws RemoteException {
        byte b10;
        if (this.f30083j.get()) {
            throw new RuntimeException("Stream is closed");
        }
        this.f30090q.lock();
        while (true) {
            try {
                try {
                    if (this.f30085l == this.f30084k.size() && !this.f30091r.await(this.f30088o, TimeUnit.MILLISECONDS)) {
                        close();
                        throw new RuntimeException("await timeout.");
                    }
                    ByteArray byteArray = this.f30084k.get(this.f30085l);
                    if (byteArray == f30082t) {
                        b10 = -1;
                        break;
                    }
                    if (this.f30086m < byteArray.getDataLength()) {
                        byte[] buffer = byteArray.getBuffer();
                        int i10 = this.f30086m;
                        b10 = buffer[i10];
                        this.f30086m = i10 + 1;
                        break;
                    }
                    r0();
                    this.f30085l++;
                    this.f30086m = 0;
                } catch (InterruptedException unused) {
                    close();
                    throw new RuntimeException("await interrupt");
                }
            } catch (Throwable th2) {
                this.f30090q.unlock();
                throw th2;
            }
        }
        this.f30090q.unlock();
        return b10;
    }
}
