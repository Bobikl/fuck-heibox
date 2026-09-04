package com.alipay.face.photinus;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.umeng.analytics.pro.ak;

/* JADX INFO: compiled from: LightSensorListener.java */
/* JADX INFO: loaded from: classes6.dex */
public class e implements SensorEventListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SensorManager f38907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f38908c = -1.0f;

    public e(Context context) {
        SensorManager sensorManager = (SensorManager) context.getSystemService(ak.f104420ac);
        this.f38907b = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(5);
        if (defaultSensor != null) {
            this.f38907b.registerListener(this, defaultSensor, 0);
        }
    }

    public void a() {
        SensorManager sensorManager = this.f38907b;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
            this.f38907b = null;
        }
    }

    public float b() {
        return this.f38908c;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        this.f38908c = sensorEvent.values[0];
    }
}
