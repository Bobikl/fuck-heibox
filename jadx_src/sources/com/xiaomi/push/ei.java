package com.xiaomi.push;

import com.xiaomi.channel.commonutils.logger.LoggerInterface;

/* JADX INFO: loaded from: classes4.dex */
public class ei implements LoggerInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LoggerInterface f107034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LoggerInterface f107035b;

    public ei(LoggerInterface loggerInterface, LoggerInterface loggerInterface2) {
        this.f107034a = loggerInterface;
        this.f107035b = loggerInterface2;
    }

    @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
    public void log(String str) {
        LoggerInterface loggerInterface = this.f107034a;
        if (loggerInterface != null) {
            loggerInterface.log(str);
        }
        LoggerInterface loggerInterface2 = this.f107035b;
        if (loggerInterface2 != null) {
            loggerInterface2.log(str);
        }
    }

    @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
    public void log(String str, Throwable th2) {
        LoggerInterface loggerInterface = this.f107034a;
        if (loggerInterface != null) {
            loggerInterface.log(str, th2);
        }
        LoggerInterface loggerInterface2 = this.f107035b;
        if (loggerInterface2 != null) {
            loggerInterface2.log(str, th2);
        }
    }

    @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
    public void setTag(String str) {
    }
}
