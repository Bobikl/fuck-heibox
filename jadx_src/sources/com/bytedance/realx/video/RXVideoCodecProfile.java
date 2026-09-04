package com.bytedance.realx.video;

/* JADX INFO: compiled from: RXVideoCodecDesc.java */
/* JADX INFO: loaded from: classes6.dex */
public enum RXVideoCodecProfile {
    Unknown(0),
    ProfileConstrainedBaseline(1),
    ProfileBaseline(2),
    ProfileMain(3),
    ProfileConstrainedHigh(4),
    ProfileHigh(5),
    ByteVC1ProfileUnknown(10),
    ByteVC1ProfileMain(11),
    ByteVC1ProfileMain10(12),
    VP8ProfileMain(80),
    ByteVC1ProfileMain10HDR10(100),
    ByteVC1ProfileMax(128);

    private int value;

    RXVideoCodecProfile(int i10) {
        this.value = i10;
    }

    static RXVideoCodecProfile fromValue(int i10) {
        if (i10 == 0) {
            return Unknown;
        }
        if (i10 == 1) {
            return ProfileConstrainedBaseline;
        }
        if (i10 == 2) {
            return ProfileBaseline;
        }
        if (i10 == 3) {
            return ProfileMain;
        }
        if (i10 == 4) {
            return ProfileConstrainedHigh;
        }
        if (i10 == 5) {
            return ProfileHigh;
        }
        if (i10 == 80) {
            return VP8ProfileMain;
        }
        if (i10 == 100) {
            return ByteVC1ProfileMain10HDR10;
        }
        if (i10 == 128) {
            return ByteVC1ProfileMax;
        }
        switch (i10) {
            case 10:
                return ByteVC1ProfileUnknown;
            case 11:
                return ByteVC1ProfileMain;
            case 12:
                return ByteVC1ProfileMain10;
            default:
                return Unknown;
        }
    }

    public int toInt() {
        return this.value;
    }

    int toSystemProfile() {
        int i10 = this.value;
        if (i10 == 0 || i10 == 1 || i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4 || i10 == 5) {
            return 8;
        }
        if (i10 == 80) {
            return 1;
        }
        if (i10 == 100) {
            return 4096;
        }
        if (i10 == 128) {
            return 4;
        }
        switch (i10) {
            case 10:
            case 11:
                return 1;
            case 12:
                return 2;
            default:
                throw new RuntimeException("profile not match system!");
        }
    }
}
