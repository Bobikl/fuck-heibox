package com.igexin.a.a.c.a;

import com.igexin.sdk.IUserLoggerInterface;

/* JADX INFO: loaded from: classes7.dex */
public class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IUserLoggerInterface f63195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final StringBuffer f63196b = new StringBuffer();

    private void b() {
        if (this.f63196b.length() > 0) {
            if (this.f63196b.toString().contains("\n")) {
                for (String str : this.f63196b.toString().split("\n")) {
                    IUserLoggerInterface iUserLoggerInterface = this.f63195a;
                    if (iUserLoggerInterface != null) {
                        iUserLoggerInterface.log("[GT-PUSH] " + str);
                    }
                }
            } else {
                this.f63195a.log("[GT-PUSH] " + this.f63196b.toString());
            }
            this.f63196b.setLength(0);
        }
    }

    @Override // com.igexin.a.a.c.a.b
    public void a() {
        if (this.f63195a != null) {
            b();
        }
    }

    @Override // com.igexin.a.a.c.a.b
    public void a(IUserLoggerInterface iUserLoggerInterface) {
        if (iUserLoggerInterface != null) {
            this.f63195a = iUserLoggerInterface;
        }
    }

    @Override // com.igexin.a.a.c.a.b
    public void a(String str) {
        if (this.f63195a == null) {
            b(str);
            return;
        }
        b();
        this.f63195a.log("[GT-PUSH] " + str);
    }

    public void b(String str) {
        if (this.f63196b.length() + str.length() < 5120) {
            StringBuffer stringBuffer = this.f63196b;
            stringBuffer.append(str);
            stringBuffer.append("\n");
        } else {
            if (this.f63196b.length() > 5120 || this.f63196b.length() + 135 <= 5120) {
                return;
            }
            StringBuffer stringBuffer2 = this.f63196b;
            stringBuffer2.append("Warning! the log cache is too long to show the full content,we suggest you call initialize and setDebugLogger in a short time interval.");
            stringBuffer2.append("\n");
        }
    }
}
