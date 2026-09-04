package com.max.network.interfaces;

import com.meituan.robust.ChangeQuickRedirect;
import dl.d;
import dl.e;

/* JADX INFO: compiled from: ResultHandler.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface ResultHandler {

    /* JADX INFO: compiled from: ResultHandler.kt */
    public static final class DefaultImpls {
        public static ChangeQuickRedirect changeQuickRedirect;

        public static void handlingApiExceptions(@d ResultHandler resultHandler, @e String str) {
        }

        public static void handlingEmptyExceptions(@d ResultHandler resultHandler) {
        }

        public static void handlingExceptions(@d ResultHandler resultHandler, @e Throwable th2) {
        }
    }

    void handlingApiExceptions(@e String str);

    void handlingEmptyExceptions();

    void handlingExceptions(@e Throwable th2);
}
