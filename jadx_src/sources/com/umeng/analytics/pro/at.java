package com.umeng.analytics.pro;

import com.umeng.analytics.pro.at;
import com.umeng.analytics.pro.ba;
import java.io.Serializable;

/* JADX INFO: compiled from: TBase.java */
/* JADX INFO: loaded from: classes4.dex */
public interface at<T extends at<?, ?>, F extends ba> extends Serializable {
    void clear();

    at<T, F> deepCopy();

    F fieldForId(int i10);

    void read(bs bsVar) throws az;

    void write(bs bsVar) throws az;
}
