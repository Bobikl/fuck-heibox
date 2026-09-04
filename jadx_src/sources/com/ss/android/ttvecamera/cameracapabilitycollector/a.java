package com.ss.android.ttvecamera.cameracapabilitycollector;

import com.ss.android.ttvecamera.n;
import com.ss.android.ttvecamera.q;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: TECameraCapabilityKBUpload.java */
/* JADX INFO: loaded from: classes9.dex */
public class a implements TECameraCapabilityCollector.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f97397a = "TECameraCapabilityKBUpload";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map<TECameraCapabilityCollector.Capability, TECameraCapabilityCollector.DataType> f97398b;

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.cameracapabilitycollector.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: TECameraCapabilityKBUpload.java */
    public static /* synthetic */ class C0927a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f97399a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f97400b;

        static {
            int[] iArr = new int[TECameraCapabilityCollector.Capability.values().length];
            f97400b = iArr;
            try {
                iArr[TECameraCapabilityCollector.Capability.DEPTH_OUTPUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f97400b[TECameraCapabilityCollector.Capability.PREVIEW_SIZE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f97400b[TECameraCapabilityCollector.Capability.FPS_RANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f97400b[TECameraCapabilityCollector.Capability.MANUAL_3A.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f97400b[TECameraCapabilityCollector.Capability.HIGH_SPEED_VIDEO_FPS_RANGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f97400b[TECameraCapabilityCollector.Capability.SUPPORT_APERTURES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f97400b[TECameraCapabilityCollector.Capability.LOGICAL_MULTI_CAMERA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f97400b[TECameraCapabilityCollector.Capability.SUPPORT_EXTENSIONS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f97400b[TECameraCapabilityCollector.Capability.FRONT_BACK_MULTICAM_COMBOS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr2 = new int[TECameraCapabilityCollector.DataType.values().length];
            f97399a = iArr2;
            try {
                iArr2[TECameraCapabilityCollector.DataType.INTEGER.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f97399a[TECameraCapabilityCollector.DataType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f97399a[TECameraCapabilityCollector.DataType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f97399a[TECameraCapabilityCollector.DataType.BOOLEAN.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f97399a[TECameraCapabilityCollector.DataType.STRING.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    static {
        HashMap map = new HashMap();
        f97398b = map;
        TECameraCapabilityCollector.Capability capability = TECameraCapabilityCollector.Capability.DEPTH_OUTPUT;
        TECameraCapabilityCollector.DataType dataType = TECameraCapabilityCollector.DataType.STRING;
        map.put(capability, dataType);
        map.put(TECameraCapabilityCollector.Capability.PREVIEW_SIZE, dataType);
        map.put(TECameraCapabilityCollector.Capability.FPS_RANGE, dataType);
        map.put(TECameraCapabilityCollector.Capability.MANUAL_3A, dataType);
        map.put(TECameraCapabilityCollector.Capability.HIGH_SPEED_VIDEO_FPS_RANGE, dataType);
        map.put(TECameraCapabilityCollector.Capability.SUPPORT_APERTURES, dataType);
        map.put(TECameraCapabilityCollector.Capability.LOGICAL_MULTI_CAMERA, dataType);
        map.put(TECameraCapabilityCollector.Capability.SUPPORT_EXTENSIONS, dataType);
        map.put(TECameraCapabilityCollector.Capability.FRONT_BACK_MULTICAM_COMBOS, dataType);
    }

    private String c(TECameraCapabilityCollector.Capability capability) {
        switch (C0927a.f97400b[capability.ordinal()]) {
            case 1:
                return n.D;
            case 2:
                return n.E;
            case 3:
                return n.F;
            case 4:
                return n.G;
            case 5:
                return n.H;
            case 6:
                return n.I;
            case 7:
                return n.J;
            case 8:
                return n.K;
            case 9:
                return n.L;
            default:
                q.u(f97397a, "key is null, capability is incorrect!");
                return null;
        }
    }

    @Override // com.ss.android.ttvecamera.cameracapabilitycollector.TECameraCapabilityCollector.b
    public TECameraCapabilityCollector.DataType a(TECameraCapabilityCollector.Capability capability) {
        Map<TECameraCapabilityCollector.Capability, TECameraCapabilityCollector.DataType> map = f97398b;
        return map.get(capability) == null ? TECameraCapabilityCollector.DataType.UNKNOWN : map.get(capability);
    }

    @Override // com.ss.android.ttvecamera.cameracapabilitycollector.TECameraCapabilityCollector.b
    public void b(List<TECameraCapabilityCollector.a> list) {
        for (TECameraCapabilityCollector.a aVar : list) {
            String strC = c(aVar.f97394a);
            if (strC != null) {
                int i10 = C0927a.f97399a[aVar.f97395b.ordinal()];
                if (i10 == 1 || i10 == 2) {
                    n.b(strC, ((Long) aVar.f97396c).longValue());
                } else if (i10 == 3) {
                    n.a(strC, ((Double) aVar.f97396c).doubleValue());
                } else if (i10 == 4) {
                    n.d(strC, ((Boolean) aVar.f97396c).booleanValue() ? "true" : "false");
                } else if (i10 == 5) {
                    n.d(strC, (String) aVar.f97396c);
                }
            }
        }
    }
}
