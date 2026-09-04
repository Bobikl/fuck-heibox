package com.google.android.exoplayer2.transformer;

import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.SlowMotionData;
import com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry;
import com.google.android.exoplayer2.util.u0;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSortedMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: SegmentSpeedProvider.java */
/* JADX INFO: loaded from: classes7.dex */
public class i implements j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f50249c = 30;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ImmutableSortedMap<Long, Float> f50250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f50251b;

    public i(a2 a2Var) {
        float fD = d(a2Var);
        float f10 = fD == -3.4028235E38f ? 1.0f : fD / 30.0f;
        this.f50251b = f10;
        this.f50250a = b(a2Var, f10);
    }

    private static ImmutableSortedMap<Long, Float> b(a2 a2Var, float f10) {
        ImmutableList<SlowMotionData.Segment> immutableListC = c(a2Var);
        if (immutableListC.isEmpty()) {
            return ImmutableSortedMap.v0();
        }
        TreeMap treeMap = new TreeMap();
        for (int i10 = 0; i10 < immutableListC.size(); i10++) {
            SlowMotionData.Segment segment = immutableListC.get(i10);
            treeMap.put(Long.valueOf(u0.U0(segment.f46964b)), Float.valueOf(f10 / segment.f46966d));
        }
        for (int i11 = 0; i11 < immutableListC.size(); i11++) {
            SlowMotionData.Segment segment2 = immutableListC.get(i11);
            if (!treeMap.containsKey(Long.valueOf(u0.U0(segment2.f46965c)))) {
                treeMap.put(Long.valueOf(u0.U0(segment2.f46965c)), Float.valueOf(f10));
            }
        }
        return ImmutableSortedMap.e0(treeMap);
    }

    private static ImmutableList<SlowMotionData.Segment> c(a2 a2Var) {
        ArrayList arrayList = new ArrayList();
        Metadata metadata = a2Var.f43591k;
        if (metadata != null) {
            for (int i10 = 0; i10 < metadata.d(); i10++) {
                Metadata.Entry entryC = metadata.c(i10);
                if (entryC instanceof SlowMotionData) {
                    arrayList.addAll(((SlowMotionData) entryC).f46962b);
                }
            }
        }
        return ImmutableList.W(SlowMotionData.Segment.f46963e, arrayList);
    }

    private static float d(a2 a2Var) {
        Metadata metadata = a2Var.f43591k;
        if (metadata == null) {
            return -3.4028235E38f;
        }
        for (int i10 = 0; i10 < metadata.d(); i10++) {
            Metadata.Entry entryC = metadata.c(i10);
            if (entryC instanceof SmtaMetadataEntry) {
                return ((SmtaMetadataEntry) entryC).f46967b;
            }
        }
        return -3.4028235E38f;
    }

    @Override // com.google.android.exoplayer2.transformer.j
    public float a(long j10) {
        com.google.android.exoplayer2.util.a.a(j10 >= 0);
        Map.Entry<Long, Float> entryFloorEntry = this.f50250a.floorEntry(Long.valueOf(j10));
        return entryFloorEntry != null ? entryFloorEntry.getValue().floatValue() : this.f50251b;
    }
}
