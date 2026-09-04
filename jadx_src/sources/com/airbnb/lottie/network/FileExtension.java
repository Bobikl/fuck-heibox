package com.airbnb.lottie.network;

import com.max.xiaoheihe.loader.dynamic_so.DynamicSoManager;

/* JADX INFO: loaded from: classes6.dex */
public enum FileExtension {
    JSON(".json"),
    ZIP(DynamicSoManager.f77249d);

    public final String extension;

    FileExtension(String str) {
        this.extension = str;
    }

    public static FileExtension forFile(String str) {
        for (FileExtension fileExtension : values()) {
            if (str.endsWith(fileExtension.extension)) {
                return fileExtension;
            }
        }
        com.airbnb.lottie.utils.f.e("Unable to find correct extension for " + str);
        return JSON;
    }

    public String tempExtension() {
        return ".temp" + this.extension;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.extension;
    }
}
