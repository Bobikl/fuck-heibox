package io.flutter.plugin.common;

import androidx.annotation.p0;
import io.flutter.Log;

/* JADX INFO: loaded from: classes4.dex */
public class ErrorLogResult implements MethodChannel.Result {
    private int level;
    private String tag;

    public ErrorLogResult(String str) {
        this(str, Log.WARN);
    }

    public ErrorLogResult(String str, int i10) {
        this.tag = str;
        this.level = i10;
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public void error(String str, @p0 String str2, @p0 Object obj) {
        String str3;
        if (obj != null) {
            str3 = " details: " + obj;
        } else {
            str3 = "";
        }
        int i10 = this.level;
        if (i10 < Log.WARN) {
            return;
        }
        Log.println(i10, this.tag, str2 + str3);
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public void notImplemented() {
        int i10 = this.level;
        if (i10 < Log.WARN) {
            return;
        }
        Log.println(i10, this.tag, "method not implemented");
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public void success(@p0 Object obj) {
    }
}
