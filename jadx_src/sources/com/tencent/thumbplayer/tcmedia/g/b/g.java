package com.tencent.thumbplayer.tcmedia.g.b;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends f {
    public g(MediaCodec mediaCodec, e eVar) {
        super(mediaCodec, eVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.g.b.f
    public final com.tencent.thumbplayer.tcmedia.g.f.a.b a(e eVar) {
        if (com.tencent.thumbplayer.tcmedia.g.f.a.a(this, eVar)) {
            int i10 = eVar.f102679b;
            b bVar = this.f102697g;
            if (i10 <= bVar.f102673a && eVar.f102680c <= bVar.f102674b && com.tencent.thumbplayer.tcmedia.g.h.c.a(this, eVar) <= this.f102697g.f102675c) {
                return eVar.a(this.f102695e) ? com.tencent.thumbplayer.tcmedia.g.f.a.b.KEEP_CODEC_RESULT_YES_WITHOUT_RECONFIGURATION : com.tencent.thumbplayer.tcmedia.g.f.a.b.KEEP_CODEC_RESULT_YES_WITH_RECONFIGURATION;
            }
        }
        return com.tencent.thumbplayer.tcmedia.g.f.a.b.KEEP_CODEC_RESULT_NO;
    }

    @Override // com.tencent.thumbplayer.tcmedia.g.b.f
    public final boolean j() {
        return super.j() && this.f102696f != null && this.f102695e.f102681d == 0;
    }

    @Override // com.tencent.thumbplayer.tcmedia.g.b.f
    public final String toString() {
        return "VideoCodecWrapper[" + hashCode() + ']';
    }
}
