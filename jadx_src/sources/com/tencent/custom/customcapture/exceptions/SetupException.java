package com.tencent.custom.customcapture.exceptions;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class SetupException extends IOException {
    private static final long serialVersionUID = 5408828566884638165L;

    public SetupException(String str) {
        super(str);
    }

    public SetupException(String str, Throwable th2) {
        super("SetupException: " + str, th2);
    }
}
