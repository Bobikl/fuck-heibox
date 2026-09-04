package com.ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public class RTCLogConfig {
    public int logFileSize;
    public String logFilenamePrefix;
    public LocalLogLevel logLevel;
    public String logPath;

    public RTCLogConfig(LocalLogLevel localLogLevel, String str, int i10, String str2) {
        this.logFileSize = 10;
        LocalLogLevel localLogLevel2 = LocalLogLevel.WARNING;
        this.logLevel = localLogLevel;
        this.logPath = str;
        this.logFileSize = i10;
        this.logFilenamePrefix = str2;
    }

    @CalledByNative
    public static RTCLogConfig create(LocalLogLevel localLogLevel, String str, int i10, String str2) {
        return new RTCLogConfig(localLogLevel, str, i10, str2);
    }

    public String toString() {
        return "RTCLogConfig{log_level='" + this.logLevel + "', log_path='" + this.logPath + "', log_file_size='" + this.logFileSize + "', log_filename_prefix='" + this.logFilenamePrefix + "'}";
    }
}
