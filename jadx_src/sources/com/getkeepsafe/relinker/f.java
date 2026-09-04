package com.getkeepsafe.relinker;

import android.annotation.SuppressLint;
import android.os.Build;
import com.max.xiaoheihe.loader.dynamic_so.DynamicSoManager;

/* JADX INFO: compiled from: SystemLibraryLoader.java */
/* JADX INFO: loaded from: classes6.dex */
public final class f implements d.b {
    f() {
    }

    @Override // com.getkeepsafe.relinker.d.b
    public String a(String str) {
        return str.substring(3, str.length() - 3);
    }

    @Override // com.getkeepsafe.relinker.d.b
    public String[] b() {
        String[] strArr = Build.SUPPORTED_ABIS;
        if (strArr.length > 0) {
            return strArr;
        }
        String str = Build.CPU_ABI2;
        return !g.a(str) ? new String[]{Build.CPU_ABI, str} : new String[]{Build.CPU_ABI};
    }

    @Override // com.getkeepsafe.relinker.d.b
    @SuppressLint({"UnsafeDynamicallyLoadedCode"})
    public void c(String str) {
        System.load(str);
    }

    @Override // com.getkeepsafe.relinker.d.b
    public String d(String str) {
        return (str.startsWith("lib") && str.endsWith(DynamicSoManager.f77250e)) ? str : System.mapLibraryName(str);
    }

    @Override // com.getkeepsafe.relinker.d.b
    public void loadLibrary(String str) {
        System.loadLibrary(str);
    }
}
