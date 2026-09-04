package com.ishumei.smantifraud.l1111l111111Il;

import com.ishumei.smantifraud.VDataListener;

/* JADX INFO: loaded from: classes6.dex */
public abstract class l11l111l1lll {
    protected VDataListener mListener;

    void register(VDataListener vDataListener) {
        this.mListener = vDataListener;
    }

    void unregister() {
        this.mListener = null;
    }
}
