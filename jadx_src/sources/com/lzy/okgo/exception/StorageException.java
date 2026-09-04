package com.lzy.okgo.exception;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes6.dex */
public class StorageException extends Exception {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 178946465;

    public StorageException() {
    }

    public StorageException(String str) {
        super(str);
    }

    public StorageException(String str, Throwable th2) {
        super(str, th2);
    }

    public StorageException(Throwable th2) {
        super(th2);
    }

    public static StorageException a() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.b.O7, new Class[0], StorageException.class);
        return patchProxyResultProxy.isSupported ? (StorageException) patchProxyResultProxy.result : new StorageException("SDCard isn't available, please check SD card and permission: WRITE_EXTERNAL_STORAGE, and you must pay attention to Android6.0 RunTime Permissions!");
    }
}
