package com.igexin.push.util;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public class m {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
