package com.xiaomi.push;

import android.os.IBinder;

/* JADX INFO: loaded from: classes4.dex */
public class aq implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ IBinder f106823a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ ao.a f184a;

    aq(ao.a aVar, IBinder iBinder) {
        this.f184a = aVar;
        this.f106823a = iBinder;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            ao.this.f182a = ao.b.a(this.f106823a);
            ao.this.f183b = ao.b.m152a(this.f106823a);
            ao.this.b();
            ao.this.f178a = 2;
            synchronized (ao.this.f181a) {
                try {
                    ao.this.f181a.notifyAll();
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
            ao.this.b();
            ao.this.f178a = 2;
            synchronized (ao.this.f181a) {
                try {
                    ao.this.f181a.notifyAll();
                } catch (Exception unused3) {
                }
            }
        } catch (Throwable th2) {
            ao.this.b();
            ao.this.f178a = 2;
            synchronized (ao.this.f181a) {
                try {
                    ao.this.f181a.notifyAll();
                } catch (Exception unused4) {
                }
                throw th2;
            }
        }
    }
}
