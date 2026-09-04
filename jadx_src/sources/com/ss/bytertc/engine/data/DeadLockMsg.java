package com.ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;
import z5.g;

/* JADX INFO: loaded from: classes4.dex */
public class DeadLockMsg {
    public int lastingTimes;
    public String threadName;

    @CalledByNative
    public DeadLockMsg(String str, int i10) {
        this.threadName = str;
        this.lastingTimes = i10;
    }

    public String toString() {
        return "DeadLockMsg{threadName:" + this.threadName + "lastingTimes:" + this.lastingTimes + g.f141884d;
    }
}
