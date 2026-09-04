package com.tencent.thumbplayer.tcmedia.b;

import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaComposition;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrack;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class e extends d implements ITPMediaComposition {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f102430a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f102431b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f102432c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<ITPMediaTrack> f102433d = new ArrayList(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<ITPMediaTrack> f102434e = new ArrayList(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<ITPMediaTrack> f102435f = new ArrayList(1);

    private synchronized int d() {
        int i10;
        i10 = this.f102430a + 1;
        this.f102430a = i10;
        return i10;
    }

    private synchronized int e() {
        int i10;
        i10 = this.f102431b + 1;
        this.f102431b = i10;
        return i10;
    }

    private synchronized int f() {
        int i10;
        i10 = this.f102432c + 1;
        this.f102432c = i10;
        return i10;
    }

    long a() {
        List<ITPMediaTrack> list = this.f102433d;
        long timelineDurationMs = 0;
        if (list != null) {
            for (ITPMediaTrack iTPMediaTrack : list) {
                if (timelineDurationMs < iTPMediaTrack.getTimelineDurationMs()) {
                    timelineDurationMs = iTPMediaTrack.getTimelineDurationMs();
                }
            }
        }
        return timelineDurationMs;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaComposition
    public synchronized ITPMediaTrack addAVTrack() {
        g gVar;
        gVar = new g(f(), 1);
        this.f102435f.add(gVar);
        return gVar;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaComposition
    public synchronized ITPMediaTrack addAudioTrack() {
        g gVar;
        gVar = new g(e(), 3);
        this.f102434e.add(gVar);
        return gVar;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaComposition
    public synchronized ITPMediaTrack addVideoTrack() {
        g gVar;
        gVar = new g(d(), 2);
        this.f102433d.add(gVar);
        return gVar;
    }

    long b() {
        List<ITPMediaTrack> list = this.f102434e;
        long timelineDurationMs = 0;
        if (list != null) {
            for (ITPMediaTrack iTPMediaTrack : list) {
                if (timelineDurationMs < iTPMediaTrack.getTimelineDurationMs()) {
                    timelineDurationMs = iTPMediaTrack.getTimelineDurationMs();
                }
            }
        }
        return timelineDurationMs;
    }

    long c() {
        List<ITPMediaTrack> list = this.f102435f;
        long timelineDurationMs = 0;
        if (list != null) {
            for (ITPMediaTrack iTPMediaTrack : list) {
                if (timelineDurationMs < iTPMediaTrack.getTimelineDurationMs()) {
                    timelineDurationMs = iTPMediaTrack.getTimelineDurationMs();
                }
            }
        }
        return timelineDurationMs;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaComposition
    public List<ITPMediaTrack> getAllAVTracks() {
        return this.f102435f;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaComposition
    public synchronized List<ITPMediaTrack> getAllAudioTracks() {
        return this.f102434e;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaComposition
    public synchronized List<ITPMediaTrack> getAllVideoTracks() {
        return this.f102433d;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaComposition
    public long getDurationMs() {
        if (!com.tencent.thumbplayer.tcmedia.utils.b.a(this.f102435f)) {
            return c();
        }
        long jB = b();
        long jA = a();
        long j10 = jA > jB ? jA : jB;
        String str = f.f102436a;
        str.hashCode();
        switch (str) {
            case "base_longer":
                if (jA > jB) {
                    jB = jA;
                }
                return jB;
            case "base_video":
                jB = jA;
            case "base_audio":
                return jB;
            default:
                return j10;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.b.d, com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset
    public int getMediaType() {
        return 4;
    }

    @Override // com.tencent.thumbplayer.tcmedia.b.d, com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset
    public String getUrl() {
        try {
            return i.a(this);
        } catch (Exception e10) {
            TPLogUtil.e("TPMediaComposition", e10);
            return null;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaComposition
    public void release() {
        List<ITPMediaTrack> list = this.f102433d;
        if (list != null) {
            list.clear();
            this.f102433d = null;
        }
        List<ITPMediaTrack> list2 = this.f102434e;
        if (list2 != null) {
            list2.clear();
            this.f102434e = null;
        }
        List<ITPMediaTrack> list3 = this.f102435f;
        if (list3 != null) {
            list3.clear();
            this.f102435f = null;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaComposition
    public boolean removeAVTrack(ITPMediaTrack iTPMediaTrack) {
        if (iTPMediaTrack != null) {
            return this.f102435f.remove(iTPMediaTrack);
        }
        throw new IllegalArgumentException("remove audio track , track is null .");
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaComposition
    public synchronized boolean removeAudioTrack(ITPMediaTrack iTPMediaTrack) {
        try {
            if (iTPMediaTrack == null) {
                throw new IllegalArgumentException("remove audio track , track is null .");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f102434e.remove(iTPMediaTrack);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaComposition
    public synchronized boolean removeVideoTrack(ITPMediaTrack iTPMediaTrack) {
        try {
            if (iTPMediaTrack == null) {
                throw new IllegalArgumentException("remove video track , track is null .");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f102433d.remove(iTPMediaTrack);
    }
}
