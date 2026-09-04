package com.alipay.face.download.impl;

import android.content.Context;
import android.os.Process;
import com.alipay.face.download.j;

/* JADX INFO: compiled from: BioCpuArchCheckerImpl.java */
/* JADX INFO: loaded from: classes6.dex */
public class a implements com.alipay.face.download.a {
    @Override // com.alipay.face.download.a
    public boolean a(Context context) {
        try {
            return j.e(context) == 8;
        } catch (Exception e10) {
            e10.printStackTrace();
            return Process.is64Bit();
        }
    }
}
