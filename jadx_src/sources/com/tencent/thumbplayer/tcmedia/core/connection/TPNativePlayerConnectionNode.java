package com.tencent.thumbplayer.tcmedia.core.connection;

import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class TPNativePlayerConnectionNode {
    private HashMap<Integer, HashMap<Integer, Long>> mLongMap;

    public TPNativePlayerConnectionNode() {
        this.mLongMap = null;
        this.mLongMap = new HashMap<>();
    }

    public boolean addAction(int i10) {
        if (this.mLongMap.containsKey(Integer.valueOf(i10))) {
            return false;
        }
        this.mLongMap.put(Integer.valueOf(i10), new HashMap<>());
        return true;
    }

    public void removeAction(int i10) {
        if (this.mLongMap.containsKey(Integer.valueOf(i10))) {
            this.mLongMap.remove(Integer.valueOf(i10));
        }
    }

    public boolean setLongActionConfig(int i10, int i11, long j10) {
        if (!this.mLongMap.containsKey(Integer.valueOf(i10))) {
            return false;
        }
        this.mLongMap.get(Integer.valueOf(i10)).put(Integer.valueOf(i11), Long.valueOf(j10));
        return true;
    }
}
