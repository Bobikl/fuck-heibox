package com.github.promeg.pinyinhelper;

import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PinyinMapDict.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class i implements h {
    @Override // com.github.promeg.pinyinhelper.h
    public Set<String> a() {
        if (c() != null) {
            return c().keySet();
        }
        return null;
    }

    @Override // com.github.promeg.pinyinhelper.h
    public String[] b(String str) {
        if (c() != null) {
            return c().get(str);
        }
        return null;
    }

    public abstract Map<String, String[]> c();
}
