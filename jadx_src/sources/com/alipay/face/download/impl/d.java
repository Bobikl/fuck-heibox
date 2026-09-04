package com.alipay.face.download.impl;

import android.util.Log;
import com.alipay.face.download.h;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: BioResPostProcessorImpl.java */
/* JADX INFO: loaded from: classes6.dex */
public class d implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f38772a = "BioResPostProcessor";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f38773b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<String, Boolean> f38774c = new HashMap();

    private boolean c(com.alipay.face.download.c cVar) {
        Log.d(f38772a, "processLibFile() called with: file = [" + cVar + "]");
        synchronized (f38773b) {
            String absolutePath = new File(cVar.b(), cVar.getFileName()).getAbsolutePath();
            Map<String, Boolean> map = f38774c;
            if (map.containsKey(absolutePath) && map.get(absolutePath).booleanValue()) {
                return true;
            }
            try {
                System.load(absolutePath);
                map.put(absolutePath, Boolean.TRUE);
                return true;
            } catch (Throwable th2) {
                th2.printStackTrace();
                return false;
            }
        }
    }

    private boolean d(com.alipay.face.download.b bVar) {
        return true;
    }

    @Override // com.alipay.face.download.h
    public boolean a(com.alipay.face.download.b bVar) {
        return (bVar instanceof com.alipay.face.download.c) || (bVar instanceof com.alipay.face.download.d);
    }

    @Override // com.alipay.face.download.h
    public boolean b(com.alipay.face.download.b bVar) {
        if (bVar instanceof com.alipay.face.download.c) {
            return c((com.alipay.face.download.c) bVar);
        }
        if (bVar instanceof com.alipay.face.download.d) {
            return d(bVar);
        }
        return true;
    }
}
