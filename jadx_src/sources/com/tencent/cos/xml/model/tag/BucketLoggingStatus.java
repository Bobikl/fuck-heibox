package com.tencent.cos.xml.model.tag;

import z5.g;

/* JADX INFO: loaded from: classes4.dex */
public class BucketLoggingStatus {
    public LoggingEnabled loggingEnabled;

    public static class LoggingEnabled {
        public String targetBucket;
        public String targetPrefix;

        public String toString() {
            return "{LoggingEnabled:\nTargetBucket:" + this.targetBucket + "\nTargetPrefix:" + this.targetPrefix + "\n" + g.f141884d;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{BucketLoggingStatus:\n");
        LoggingEnabled loggingEnabled = this.loggingEnabled;
        if (loggingEnabled != null) {
            sb2.append(loggingEnabled.toString());
            sb2.append("\n");
        }
        sb2.append(g.f141884d);
        return sb2.toString();
    }
}
