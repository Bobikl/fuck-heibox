package com.alipay.zoloz.toyger.algorithm;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public class TGSensorFrame {
    public float[] accelerateData;
    public float[] gyroData;
    public float[] rotationData;
    public long timeStamp;

    public TGSensorFrame(TGSensorFrame tGSensorFrame) {
        if (tGSensorFrame != null) {
            this.gyroData = tGSensorFrame.gyroData;
            this.accelerateData = tGSensorFrame.gyroData;
            this.rotationData = tGSensorFrame.rotationData;
            this.timeStamp = tGSensorFrame.timeStamp;
        }
    }

    public TGSensorFrame(float[] fArr, float[] fArr2, float[] fArr3, long j10) {
        this.gyroData = fArr;
        this.accelerateData = fArr2;
        this.rotationData = fArr3;
        this.timeStamp = j10;
    }

    public String toString() {
        return "TGSensorFrame{gyroData=" + Arrays.toString(this.gyroData) + ", accelerateData=" + Arrays.toString(this.accelerateData) + ", rotationData=" + Arrays.toString(this.rotationData) + ", timeStamp=" + this.timeStamp + '}';
    }
}
