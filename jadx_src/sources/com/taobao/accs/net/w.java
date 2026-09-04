package com.taobao.accs.net;

import com.taobao.accs.data.Message;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class w implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Message f98385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f98386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ v f98387c;

    w(v vVar, Message message, boolean z10) {
        this.f98387c = vVar;
        this.f98385a = message;
        this.f98386b = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f98387c.f98375u) {
            this.f98387c.a(this.f98385a);
            if (this.f98387c.f98375u.size() == 0) {
                this.f98387c.f98375u.add(this.f98385a);
            } else {
                Message message = (Message) this.f98387c.f98375u.getFirst();
                if (this.f98385a.getType() == 1 || this.f98385a.getType() == 0) {
                    this.f98387c.f98375u.addLast(this.f98385a);
                    if (message.getType() == 2) {
                        this.f98387c.f98375u.removeFirst();
                    }
                } else if (this.f98385a.getType() != 2 || message.getType() != 2) {
                    this.f98387c.f98375u.addLast(this.f98385a);
                } else if (!message.force && this.f98385a.force) {
                    this.f98387c.f98375u.removeFirst();
                    this.f98387c.f98375u.addFirst(this.f98385a);
                }
            }
            if (this.f98386b || this.f98387c.f98374t == 3) {
                try {
                    this.f98387c.f98375u.notifyAll();
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
    }
}
