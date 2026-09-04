package com.tencent.thumbplayer.tcmedia.b;

import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrack;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrackClip;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class g extends d implements ITPMediaTrack, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f102440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f102441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<ITPMediaTrackClip> f102442c;

    public g(int i10) {
        this.f102440a = -1;
        this.f102441b = i10;
        this.f102442c = new ArrayList();
    }

    public g(int i10, int i11) {
        this.f102440a = i10;
        this.f102441b = i11;
        this.f102442c = new ArrayList();
    }

    private synchronized void a(ITPMediaTrackClip iTPMediaTrackClip) {
        try {
            if (iTPMediaTrackClip == null) {
                throw new IllegalArgumentException("add track clip , clip can not be null");
            }
            if (iTPMediaTrackClip.getMediaType() != this.f102441b) {
                throw new IllegalArgumentException("add track clip failed, media type is not same");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrack
    public synchronized int addTrackClip(ITPMediaTrackClip iTPMediaTrackClip) {
        a(iTPMediaTrackClip);
        if (!this.f102442c.contains(iTPMediaTrackClip)) {
            this.f102442c.add(iTPMediaTrackClip);
            return iTPMediaTrackClip.getClipId();
        }
        TPLogUtil.i("TPMediaCompositionTrack", "add track clip failed, clip already exists : " + iTPMediaTrackClip.getClipId());
        return iTPMediaTrackClip.getClipId();
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrack
    public synchronized List<ITPMediaTrackClip> getAllTrackClips() {
        return this.f102442c;
    }

    @Override // com.tencent.thumbplayer.tcmedia.b.d, com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset
    public synchronized int getMediaType() {
        return this.f102441b;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrack
    public synchronized long getTimelineDurationMs() {
        long originalDurationMs;
        originalDurationMs = 0;
        Iterator<ITPMediaTrackClip> it = this.f102442c.iterator();
        while (it.hasNext()) {
            originalDurationMs += it.next().getOriginalDurationMs();
        }
        return originalDurationMs;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrack
    public synchronized ITPMediaTrackClip getTrackClip(int i10) {
        for (ITPMediaTrackClip iTPMediaTrackClip : this.f102442c) {
            if (iTPMediaTrackClip.getClipId() == i10) {
                return iTPMediaTrackClip;
            }
        }
        return null;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrack
    public synchronized int getTrackId() {
        return this.f102440a;
    }

    @Override // com.tencent.thumbplayer.tcmedia.b.d, com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset
    public synchronized String getUrl() {
        try {
        } catch (IOException e10) {
            TPLogUtil.e("TPMediaCompositionTrack", e10);
            return null;
        }
        return i.a(this.f102442c, this.f102441b);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrack
    public synchronized int insertTrackClip(ITPMediaTrackClip iTPMediaTrackClip, int i10) {
        a(iTPMediaTrackClip);
        if (this.f102442c.contains(iTPMediaTrackClip)) {
            TPLogUtil.i("TPMediaCompositionTrack", "add track clip failed, clip already exists : " + iTPMediaTrackClip.getClipId());
            return iTPMediaTrackClip.getClipId();
        }
        if (i10 == -1) {
            this.f102442c.add(0, iTPMediaTrackClip);
            return iTPMediaTrackClip.getClipId();
        }
        int size = this.f102442c.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.f102442c.get(i11).getClipId() == i10) {
                this.f102442c.add(i11 + 1, iTPMediaTrackClip);
                return iTPMediaTrackClip.getClipId();
            }
        }
        this.f102442c.add(iTPMediaTrackClip);
        TPLogUtil.i("TPMediaCompositionTrack", "insert track clip into the end, coz after clip not found :".concat(String.valueOf(i10)));
        return iTPMediaTrackClip.getClipId();
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrack
    public synchronized void removeAllTrackClips() {
        this.f102442c.clear();
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrack
    public synchronized boolean removeTrackClip(ITPMediaTrackClip iTPMediaTrackClip) {
        try {
            if (iTPMediaTrackClip == null) {
                throw new IllegalArgumentException("remove track clip , clip can not be null");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f102442c.remove(iTPMediaTrackClip);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrack
    public synchronized boolean swapTrackClip(int i10, int i11) {
        if (i10 >= 0) {
            if (i10 < this.f102442c.size()) {
                if (i11 >= 0 && i11 < this.f102442c.size()) {
                    Collections.swap(this.f102442c, i10, i11);
                    return true;
                }
                TPLogUtil.w("TPMediaCompositionTrack", "swap clip failed, to pos invalid , to pos :".concat(String.valueOf(i11)));
                return false;
            }
        }
        TPLogUtil.w("TPMediaCompositionTrack", "swap clip failed, from pos invalid , from pos : ".concat(String.valueOf(i10)));
        return false;
    }
}
