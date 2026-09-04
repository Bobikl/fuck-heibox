package com.igexin.assist.action;

/* JADX INFO: loaded from: classes7.dex */
public class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f63289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f63290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ MessageManger f63291c;

    a(MessageManger messageManger, String str, boolean z10) {
        this.f63291c = messageManger;
        this.f63289a = str;
        this.f63290b = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.igexin.push.core.d.f63672f.get()) {
            this.f63291c.a(this.f63289a, this.f63290b);
        }
    }
}
