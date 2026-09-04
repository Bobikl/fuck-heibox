package com.ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public class SysStats {
    public double cpuAppUsage;
    public int cpuCores;
    public double cpuTotalUsage;
    public long freeMemory;
    public long fullMemory;
    public double memoryRatio;
    public double memoryUsage;
    public double totalMemoryRatio;
    public long totalMemoryUsage;

    public SysStats() {
    }

    public SysStats(int i10, double d10, double d11, double d12, long j10, long j11, long j12, double d13, double d14) {
        this.cpuCores = i10;
        this.cpuAppUsage = d10;
        this.cpuTotalUsage = d11;
        this.memoryUsage = d12;
        this.fullMemory = j10;
        this.totalMemoryUsage = j11;
        this.freeMemory = j12;
        this.memoryRatio = d13;
        this.totalMemoryRatio = d14;
    }

    @CalledByNative
    private static SysStats create(int i10, double d10, double d11, double d12, long j10, long j11, long j12, double d13, double d14) {
        return new SysStats(i10, d10, d11, d12, j10, j11, j12, d13, d14);
    }

    public String toString() {
        return "SysStats{cpu_cores=" + this.cpuCores + "' cpu_app_usage=" + this.cpuAppUsage + "', cpu_total_usage=" + this.cpuTotalUsage + ", memory_usage=" + this.memoryUsage + "full_memory=" + this.fullMemory + "'total_memory_usage=" + this.totalMemoryUsage + "'free_memory=" + this.freeMemory + "'memory_ratio=" + this.memoryRatio + "'total_memory_ratio=" + this.totalMemoryRatio + '}';
    }
}
