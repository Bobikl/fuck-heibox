package com.ss.android.ttvecamera.cameracapabilitycollector;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class TECameraCapabilityCollector {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map<Integer, Capability> f97390d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<a> f97391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f97392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f97393c = false;

    public enum Capability {
        DEPTH_OUTPUT,
        PREVIEW_SIZE,
        FPS_RANGE,
        MANUAL_3A,
        HIGH_SPEED_VIDEO_FPS_RANGE,
        SUPPORT_APERTURES,
        LOGICAL_MULTI_CAMERA,
        SUPPORT_EXTENSIONS,
        FRONT_BACK_MULTICAM_COMBOS
    }

    public enum DataType {
        UNKNOWN,
        BOOLEAN,
        INTEGER,
        LONG,
        FLOAT,
        STRING
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Capability f97394a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public DataType f97395b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f97396c;

        public a(Capability capability, DataType dataType, Object obj) {
            this.f97394a = capability;
            this.f97395b = dataType;
            this.f97396c = obj;
        }
    }

    public interface b {
        DataType a(Capability capability);

        void b(List<a> list);
    }

    static {
        HashMap map = new HashMap();
        f97390d = map;
        map.put(8, Capability.DEPTH_OUTPUT);
        map.put(1, Capability.MANUAL_3A);
        map.put(11, Capability.LOGICAL_MULTI_CAMERA);
    }

    public void a(a aVar) {
        List<a> list = this.f97391a;
        if (list != null) {
            list.add(aVar);
        }
    }

    public DataType b(Capability capability) {
        return this.f97392b.a(capability);
    }

    public void c(b bVar) {
        if (this.f97393c) {
            return;
        }
        if (this.f97391a == null) {
            this.f97391a = new ArrayList();
        }
        if (this.f97392b == null) {
            this.f97392b = bVar;
        }
        this.f97393c = true;
    }

    public void d() {
        this.f97392b.b(this.f97391a);
        this.f97391a.clear();
    }
}
