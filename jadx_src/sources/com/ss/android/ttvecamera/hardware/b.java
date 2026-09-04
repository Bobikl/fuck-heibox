package com.ss.android.ttvecamera.hardware;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: compiled from: TECameraHWProxy.java */
/* JADX INFO: loaded from: classes9.dex */
@TargetApi(21)
public class b extends d {
    public b(Context context) {
        super(context);
    }

    private static boolean C() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("YAL-AL00");
        arrayList.add("YAL-AL10");
        arrayList.add("YAL-TL00");
        arrayList.add("YAL-TL10");
        arrayList.add("YAL-L21");
        arrayList.add("YAL-L41");
        arrayList.add("YAL-AL50");
        arrayList.add("YAL-TL50");
        arrayList.add("YAL-L51");
        arrayList.add("SEA-AL00");
        arrayList.add("SEA-TL00");
        arrayList.add("SEA-AL10");
        arrayList.add("SEA-TL10");
        return arrayList.contains(Build.MODEL);
    }

    @Override // com.ss.android.ttvecamera.hardware.d
    public boolean A(CameraCharacteristics cameraCharacteristics) {
        Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
        if (num != null && num.intValue() == 0) {
            return false;
        }
        float f10 = ((float[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS))[0];
        return false;
    }

    @Override // com.ss.android.ttvecamera.hardware.d
    public void b(int i10, CameraManager cameraManager) {
        if (C()) {
            d.f97544c = "3";
        } else {
            super.b(i10, cameraManager);
        }
    }

    @Override // com.ss.android.ttvecamera.hardware.d
    public String j() {
        return C() ? "3" : super.j();
    }

    @Override // com.ss.android.ttvecamera.hardware.d
    public boolean z() {
        return !"0".equals(j()) || C();
    }
}
