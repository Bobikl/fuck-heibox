package com.tencent.thumbplayer.tcmedia.g.b;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends f {
    public a(MediaCodec mediaCodec, e eVar) {
        super(mediaCodec, eVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.g.b.f
    public final com.tencent.thumbplayer.tcmedia.g.f.a.b a(e eVar) {
        return com.tencent.thumbplayer.tcmedia.g.f.a.a(this, eVar) ? com.tencent.thumbplayer.tcmedia.g.f.a.b.KEEP_CODEC_RESULT_YES_WITHOUT_RECONFIGURATION : com.tencent.thumbplayer.tcmedia.g.f.a.b.KEEP_CODEC_RESULT_NO;
    }

    @Override // com.tencent.thumbplayer.tcmedia.g.b.f
    public final String toString() {
        return "AudioCodecWrapper[" + hashCode() + ']';
    }
}
