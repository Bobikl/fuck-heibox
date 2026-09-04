package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: KeyCache.java */
/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    HashMap<Object, HashMap<String, float[]>> f17682a = new HashMap<>();

    public float a(Object obj, String str, int i10) {
        HashMap<String, float[]> map;
        float[] fArr;
        if (this.f17682a.containsKey(obj) && (map = this.f17682a.get(obj)) != null && map.containsKey(str) && (fArr = map.get(str)) != null && fArr.length > i10) {
            return fArr[i10];
        }
        return Float.NaN;
    }

    public void b(Object obj, String str, int i10, float f10) {
        if (!this.f17682a.containsKey(obj)) {
            HashMap<String, float[]> map = new HashMap<>();
            float[] fArr = new float[i10 + 1];
            fArr[i10] = f10;
            map.put(str, fArr);
            this.f17682a.put(obj, map);
            return;
        }
        HashMap<String, float[]> map2 = this.f17682a.get(obj);
        if (map2 == null) {
            map2 = new HashMap<>();
        }
        if (!map2.containsKey(str)) {
            float[] fArr2 = new float[i10 + 1];
            fArr2[i10] = f10;
            map2.put(str, fArr2);
            this.f17682a.put(obj, map2);
            return;
        }
        float[] fArrCopyOf = map2.get(str);
        if (fArrCopyOf == null) {
            fArrCopyOf = new float[0];
        }
        if (fArrCopyOf.length <= i10) {
            fArrCopyOf = Arrays.copyOf(fArrCopyOf, i10 + 1);
        }
        fArrCopyOf[i10] = f10;
        map2.put(str, fArrCopyOf);
    }
}
