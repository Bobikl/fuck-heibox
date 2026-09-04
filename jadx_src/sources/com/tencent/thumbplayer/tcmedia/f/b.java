package com.tencent.thumbplayer.tcmedia.f;

import android.content.Context;
import com.tencent.thumbplayer.tcmedia.api.richmedia.ITPRichMediaSynchronizerListener;
import com.tencent.thumbplayer.tcmedia.api.richmedia.TPRichMediaFeature;
import com.tencent.thumbplayer.tcmedia.api.richmedia.TPRichMediaFeatureData;
import com.tencent.thumbplayer.tcmedia.api.richmedia.TPRichMediaRequestExtraInfo;
import com.tencent.thumbplayer.tcmedia.core.richmedia.ITPNativeRichMediaInnerProcessorCallback;
import com.tencent.thumbplayer.tcmedia.core.richmedia.ITPNativeRichMediaProcessor;
import com.tencent.thumbplayer.tcmedia.core.richmedia.ITPNativeRichMediaProcessorCallback;
import com.tencent.thumbplayer.tcmedia.core.richmedia.TPNativeRichMediaFeature;
import com.tencent.thumbplayer.tcmedia.core.richmedia.TPNativeRichMediaFeatureData;
import com.tencent.thumbplayer.tcmedia.core.richmedia.TPNativeRichMediaProcessor;
import com.tencent.thumbplayer.tcmedia.core.richmedia.TPNativeRichMediaRequestExtraInfo;
import com.tencent.thumbplayer.tcmedia.tplayer.plugins.c;

/* JADX INFO: loaded from: classes4.dex */
public class b implements com.tencent.thumbplayer.tcmedia.f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ITPNativeRichMediaProcessor f102623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f102624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C1021b f102625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f102626d;

    public class a implements ITPNativeRichMediaInnerProcessorCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.tencent.thumbplayer.tcmedia.f.a.InterfaceC1019a f102628b;

        a() {
        }

        public void a(com.tencent.thumbplayer.tcmedia.f.a.InterfaceC1019a interfaceC1019a) {
            this.f102628b = interfaceC1019a;
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.richmedia.ITPNativeRichMediaInnerProcessorCallback
        public long onGetCurrentPositionMs(ITPNativeRichMediaProcessor iTPNativeRichMediaProcessor) {
            com.tencent.thumbplayer.tcmedia.f.a.InterfaceC1019a interfaceC1019a = this.f102628b;
            if (interfaceC1019a == null) {
                return -1L;
            }
            long jA = interfaceC1019a.a(b.this);
            b.this.a(311, (int) jA, 0, null, null);
            return jA;
        }
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.f.b$b, reason: collision with other inner class name */
    public class C1021b implements ITPNativeRichMediaProcessorCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ITPRichMediaSynchronizerListener f102630b;

        C1021b() {
        }

        public void a(ITPRichMediaSynchronizerListener iTPRichMediaSynchronizerListener) {
            this.f102630b = iTPRichMediaSynchronizerListener;
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.richmedia.ITPNativeRichMediaProcessorCallback
        public void onDeselectFeatureSuccess(ITPNativeRichMediaProcessor iTPNativeRichMediaProcessor, int i10) {
            b.this.a(305, i10, 0, null, null);
            ITPRichMediaSynchronizerListener iTPRichMediaSynchronizerListener = this.f102630b;
            if (iTPRichMediaSynchronizerListener != null) {
                iTPRichMediaSynchronizerListener.onDeselectFeatureSuccess(b.this, i10);
            }
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.richmedia.ITPNativeRichMediaProcessorCallback
        public void onRichMediaError(ITPNativeRichMediaProcessor iTPNativeRichMediaProcessor, int i10) {
            b.this.a(308, i10, 0, null, null);
            ITPRichMediaSynchronizerListener iTPRichMediaSynchronizerListener = this.f102630b;
            if (iTPRichMediaSynchronizerListener != null) {
                iTPRichMediaSynchronizerListener.onRichMediaError(b.this, i10);
            }
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.richmedia.ITPNativeRichMediaProcessorCallback
        public void onRichMediaFeatureData(ITPNativeRichMediaProcessor iTPNativeRichMediaProcessor, int i10, TPNativeRichMediaFeatureData tPNativeRichMediaFeatureData) {
            ITPRichMediaSynchronizerListener iTPRichMediaSynchronizerListener = this.f102630b;
            if (iTPRichMediaSynchronizerListener != null) {
                iTPRichMediaSynchronizerListener.onRichMediaFeatureData(b.this, i10, new TPRichMediaFeatureData(tPNativeRichMediaFeatureData));
            }
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.richmedia.ITPNativeRichMediaProcessorCallback
        public void onRichMediaFeatureFailure(ITPNativeRichMediaProcessor iTPNativeRichMediaProcessor, int i10, int i11) {
            b.this.a(310, i10, i11, null, null);
            ITPRichMediaSynchronizerListener iTPRichMediaSynchronizerListener = this.f102630b;
            if (iTPRichMediaSynchronizerListener != null) {
                iTPRichMediaSynchronizerListener.onRichMediaFeatureFailure(b.this, i10, i11);
            }
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.richmedia.ITPNativeRichMediaProcessorCallback
        public void onRichMediaInfo(ITPNativeRichMediaProcessor iTPNativeRichMediaProcessor, int i10, long j10, long j11, long j12, Object obj) {
            ITPRichMediaSynchronizerListener iTPRichMediaSynchronizerListener = this.f102630b;
            if (iTPRichMediaSynchronizerListener != null) {
                iTPRichMediaSynchronizerListener.onRichMediaInfo(b.this, i10, j10, j11, j12, obj);
            }
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.richmedia.ITPNativeRichMediaProcessorCallback
        public void onRichMediaPrepared(ITPNativeRichMediaProcessor iTPNativeRichMediaProcessor) {
            b.this.a(301, 0, 0, null, b.this.getFeatures());
            ITPRichMediaSynchronizerListener iTPRichMediaSynchronizerListener = this.f102630b;
            if (iTPRichMediaSynchronizerListener != null) {
                iTPRichMediaSynchronizerListener.onRichMediaPrepared(b.this);
            }
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.richmedia.ITPNativeRichMediaProcessorCallback
        public void onSelectFeatureSuccess(ITPNativeRichMediaProcessor iTPNativeRichMediaProcessor, int i10) {
            b.this.a(303, i10, 0, null, null);
            ITPRichMediaSynchronizerListener iTPRichMediaSynchronizerListener = this.f102630b;
            if (iTPRichMediaSynchronizerListener != null) {
                iTPRichMediaSynchronizerListener.onSelectFeatureSuccess(b.this, i10);
            }
        }
    }

    public b(Context context) {
        this.f102623a = new TPNativeRichMediaProcessor(context);
        a aVar = new a();
        this.f102624b = aVar;
        this.f102623a.setInnerProcessorCallback(aVar);
        C1021b c1021b = new C1021b();
        this.f102625c = c1021b;
        this.f102623a.setProcessorCallback(c1021b);
        c cVar = new c();
        this.f102626d = cVar;
        cVar.a(new com.tencent.thumbplayer.tcmedia.f.b.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, int i11, int i12, String str, Object obj) {
        this.f102626d.a(i10, i11, i12, str, obj);
    }

    @Override // com.tencent.thumbplayer.tcmedia.f.a
    public void a(float f10) {
        this.f102623a.setPlaybackRate(f10);
    }

    @Override // com.tencent.thumbplayer.tcmedia.f.a
    public void a(long j10) {
        this.f102623a.seek(j10);
    }

    @Override // com.tencent.thumbplayer.tcmedia.f.a
    public void a(com.tencent.thumbplayer.tcmedia.f.a.InterfaceC1019a interfaceC1019a) {
        this.f102624b.a(interfaceC1019a);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.richmedia.ITPRichMediaSynchronizer
    public void deselectFeatureAsync(int i10) {
        this.f102623a.deselectFeatureAsync(i10);
        a(304, i10, 0, null, null);
    }

    protected void finalize() throws Throwable {
        this.f102623a.setInnerProcessorCallback(null);
        this.f102623a.setProcessorCallback(null);
        this.f102623a.release();
        this.f102625c.a(null);
        this.f102624b.a(null);
        super.finalize();
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.richmedia.ITPRichMediaSynchronizer
    public TPRichMediaFeature[] getFeatures() {
        TPNativeRichMediaFeature tPNativeRichMediaFeature;
        TPNativeRichMediaFeature[] features = this.f102623a.getFeatures();
        if (features == null) {
            return new TPRichMediaFeature[0];
        }
        TPRichMediaFeature[] tPRichMediaFeatureArr = new TPRichMediaFeature[features.length];
        for (int i10 = 0; i10 < features.length && (tPNativeRichMediaFeature = features[i10]) != null; i10++) {
            tPRichMediaFeatureArr[i10] = new TPRichMediaFeature(tPNativeRichMediaFeature);
        }
        return tPRichMediaFeatureArr;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.richmedia.ITPRichMediaSynchronizer
    public void prepareAsync() {
        this.f102623a.prepareAsync();
        a(300, 0, 0, null, null);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.richmedia.ITPRichMediaSynchronizer
    public void release() {
        this.f102623a.setInnerProcessorCallback(null);
        this.f102623a.setProcessorCallback(null);
        this.f102623a.release();
        this.f102625c.a(null);
        this.f102624b.a(null);
        a(307, 0, 0, null, null);
        this.f102626d.c();
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.richmedia.ITPRichMediaSynchronizer
    public void reset() {
        this.f102623a.reset();
        a(306, 0, 0, null, null);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.richmedia.ITPRichMediaSynchronizer
    public void selectFeatureAsync(int i10, TPRichMediaRequestExtraInfo tPRichMediaRequestExtraInfo) {
        TPNativeRichMediaRequestExtraInfo tPNativeRichMediaRequestExtraInfo = new TPNativeRichMediaRequestExtraInfo();
        tPNativeRichMediaRequestExtraInfo.setActOnOptional(tPRichMediaRequestExtraInfo.getActOnOption());
        this.f102623a.selectFeatureAsync(i10, tPNativeRichMediaRequestExtraInfo);
        a(302, i10, 0, null, null);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.richmedia.ITPRichMediaSynchronizer
    public void setListener(ITPRichMediaSynchronizerListener iTPRichMediaSynchronizerListener) {
        this.f102625c.a(iTPRichMediaSynchronizerListener);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.richmedia.ITPRichMediaSynchronizer
    public void setRichMediaSource(String str) {
        this.f102623a.setRichMediaSource(str);
        a(309, 0, 0, str, null);
    }
}
