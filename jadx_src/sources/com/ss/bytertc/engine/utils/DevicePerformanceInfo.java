package com.ss.bytertc.engine.utils;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public class DevicePerformanceInfo {
    public int cpuCores;
    public float cpuFrequency;
    public String cpuModel;
    public int cpuThreads;
    public String deviceModel;
    public String gpuModel;
    public float memory;
    public String os;
    public String osVersion;

    public DevicePerformanceInfo(float f10, int i10, int i11, float f11, String str, String str2, String str3, String str4, String str5) {
        this.memory = f10;
        this.cpuCores = i10;
        this.cpuThreads = i11;
        this.cpuFrequency = f11;
        this.cpuModel = str;
        this.gpuModel = str2;
        this.os = str3;
        this.osVersion = str4;
        this.deviceModel = str5;
    }

    @CalledByNative
    private static DevicePerformanceInfo create(float f10, int i10, int i11, float f11, String str, String str2, String str3, String str4, String str5) {
        return new DevicePerformanceInfo(f10, i10, i11, f11, str, str2, str3, str4, str5);
    }
}
