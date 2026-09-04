package com.tencent.custom.customcapture.exceptions;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class ProcessException extends IOException {
    private static final long serialVersionUID = 7566826002677832701L;

    public ProcessException(String str) {
        super(str);
    }

    public ProcessException(String str, Throwable th2) {
        super("ProcessException: " + str, th2);
    }
}
