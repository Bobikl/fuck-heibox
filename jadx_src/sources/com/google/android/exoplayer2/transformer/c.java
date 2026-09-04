package com.google.android.exoplayer2.transformer;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.annotation.p0;
import androidx.annotation.w0;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.mediacodec.y;
import com.google.android.exoplayer2.util.x;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: compiled from: MediaCodecAdapterWrapper.java */
/* JADX INFO: loaded from: classes7.dex */
@w0(18)
public final class c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f50207i = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.exoplayer2.mediacodec.m f50209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a2 f50210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private ByteBuffer f50211d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f50214g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f50215h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec.BufferInfo f50208a = new MediaCodec.BufferInfo();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f50212e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f50213f = -1;

    /* JADX INFO: compiled from: MediaCodecAdapterWrapper.java */
    public static class b extends y.c {
        private b() {
        }

        @Override // com.google.android.exoplayer2.mediacodec.y.c
        protected MediaCodec b(com.google.android.exoplayer2.mediacodec.m.a aVar) throws IOException {
            String str = (String) com.google.android.exoplayer2.util.a.g(aVar.f46788b.getString(org.apache.tools.ant.taskdefs.email.b.I));
            return (aVar.f46792f & 1) == 0 ? MediaCodec.createDecoderByType((String) com.google.android.exoplayer2.util.a.g(str)) : MediaCodec.createEncoderByType((String) com.google.android.exoplayer2.util.a.g(str));
        }
    }

    private c(com.google.android.exoplayer2.mediacodec.m mVar) {
        this.f50209b = mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static c a(a2 a2Var) throws IOException {
        com.google.android.exoplayer2.mediacodec.m mVarA = null;
        Object[] objArr = 0;
        try {
            MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat((String) com.google.android.exoplayer2.util.a.g(a2Var.f43593m), a2Var.A, a2Var.f43606z);
            x.e(mediaFormatCreateAudioFormat, "max-input-size", a2Var.f43594n);
            x.j(mediaFormatCreateAudioFormat, a2Var.f43595o);
            mVarA = new b().a(com.google.android.exoplayer2.mediacodec.m.a.a(e(), mediaFormatCreateAudioFormat, a2Var, null));
            return new c(mVarA);
        } catch (Exception e10) {
            if (mVarA != null) {
                mVarA.release();
            }
            throw e10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static c b(a2 a2Var) throws Exception {
        com.google.android.exoplayer2.mediacodec.m mVarA = null;
        Object[] objArr = 0;
        try {
            MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat((String) com.google.android.exoplayer2.util.a.g(a2Var.f43593m), a2Var.A, a2Var.f43606z);
            mediaFormatCreateAudioFormat.setInteger("bitrate", a2Var.f43589i);
            mVarA = new b().a(com.google.android.exoplayer2.mediacodec.m.a.b(e(), mediaFormatCreateAudioFormat, a2Var));
            return new c(mVarA);
        } catch (Exception e10) {
            if (mVarA != null) {
                mVarA.release();
            }
            throw e10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static c c(a2 a2Var, Surface surface) throws Exception {
        com.google.android.exoplayer2.mediacodec.m mVarA = null;
        Object[] objArr = 0;
        try {
            MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat((String) com.google.android.exoplayer2.util.a.g(a2Var.f43593m), a2Var.f43598r, a2Var.f43599s);
            x.e(mediaFormatCreateVideoFormat, "max-input-size", a2Var.f43594n);
            x.j(mediaFormatCreateVideoFormat, a2Var.f43595o);
            mVarA = new b().a(com.google.android.exoplayer2.mediacodec.m.a.c(e(), mediaFormatCreateVideoFormat, a2Var, surface, null));
            return new c(mVarA);
        } catch (Exception e10) {
            if (mVarA != null) {
                mVarA.release();
            }
            throw e10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static c d(a2 a2Var, Map<String, Integer> map) throws Exception {
        com.google.android.exoplayer2.util.a.a(a2Var.f43598r != -1);
        com.google.android.exoplayer2.util.a.a(a2Var.f43599s != -1);
        com.google.android.exoplayer2.mediacodec.m mVarA = null;
        Object[] objArr = 0;
        try {
            MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat((String) com.google.android.exoplayer2.util.a.g(a2Var.f43593m), a2Var.f43598r, a2Var.f43599s);
            mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
            mediaFormatCreateVideoFormat.setInteger("frame-rate", 30);
            mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 1);
            mediaFormatCreateVideoFormat.setInteger("bitrate", 413000);
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                mediaFormatCreateVideoFormat.setInteger(entry.getKey(), entry.getValue().intValue());
            }
            mVarA = new b().a(com.google.android.exoplayer2.mediacodec.m.a.d(e(), mediaFormatCreateVideoFormat, a2Var));
            return new c(mVarA);
        } catch (Exception e10) {
            if (mVarA != null) {
                mVarA.release();
            }
            throw e10;
        }
    }

    private static com.google.android.exoplayer2.mediacodec.n e() {
        return com.google.android.exoplayer2.mediacodec.n.D("name-placeholder", "mime-type-placeholder", "mime-type-placeholder", null, false, false, false, false, false);
    }

    private static a2 f(MediaFormat mediaFormat) {
        ImmutableList.a aVar = new ImmutableList.a();
        int i10 = 0;
        while (true) {
            StringBuilder sb2 = new StringBuilder(15);
            sb2.append("csd-");
            sb2.append(i10);
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer(sb2.toString());
            if (byteBuffer == null) {
                break;
            }
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            aVar.a(bArr);
            i10++;
        }
        String string = mediaFormat.getString(org.apache.tools.ant.taskdefs.email.b.I);
        a2.b bVarT = new a2.b().e0(mediaFormat.getString(org.apache.tools.ant.taskdefs.email.b.I)).T(aVar.e());
        if (com.google.android.exoplayer2.util.y.t(string)) {
            bVarT.j0(mediaFormat.getInteger("width")).Q(mediaFormat.getInteger("height"));
        } else if (com.google.android.exoplayer2.util.y.p(string)) {
            bVarT.H(mediaFormat.getInteger("channel-count")).f0(mediaFormat.getInteger("sample-rate")).Y(2);
        }
        return bVarT.E();
    }

    private boolean l() {
        if (!n()) {
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer) com.google.android.exoplayer2.util.a.g(this.f50209b.k(this.f50213f));
        this.f50211d = byteBuffer;
        byteBuffer.position(this.f50208a.offset);
        ByteBuffer byteBuffer2 = this.f50211d;
        MediaCodec.BufferInfo bufferInfo = this.f50208a;
        byteBuffer2.limit(bufferInfo.offset + bufferInfo.size);
        return true;
    }

    private boolean n() {
        if (this.f50213f >= 0) {
            return true;
        }
        if (this.f50215h) {
            return false;
        }
        int iE = this.f50209b.e(this.f50208a);
        this.f50213f = iE;
        if (iE < 0) {
            if (iE == -2) {
                this.f50210c = f(this.f50209b.getOutputFormat());
            }
            return false;
        }
        MediaCodec.BufferInfo bufferInfo = this.f50208a;
        int i10 = bufferInfo.flags;
        if ((i10 & 4) != 0) {
            this.f50215h = true;
            if (bufferInfo.size == 0) {
                q();
                return false;
            }
        }
        if ((i10 & 2) == 0) {
            return true;
        }
        q();
        return false;
    }

    @p0
    public Surface g() {
        return this.f50209b.a();
    }

    @p0
    public ByteBuffer h() {
        if (l()) {
            return this.f50211d;
        }
        return null;
    }

    @p0
    public MediaCodec.BufferInfo i() {
        if (n()) {
            return this.f50208a;
        }
        return null;
    }

    @p0
    public a2 j() {
        n();
        return this.f50210c;
    }

    public boolean k() {
        return this.f50215h && this.f50213f == -1;
    }

    @mk.e(expression = {"#1.data"}, result = true)
    public boolean m(DecoderInputBuffer decoderInputBuffer) {
        if (this.f50214g) {
            return false;
        }
        if (this.f50212e < 0) {
            int iJ = this.f50209b.j();
            this.f50212e = iJ;
            if (iJ < 0) {
                return false;
            }
            decoderInputBuffer.f44488e = this.f50209b.h(iJ);
            decoderInputBuffer.f();
        }
        com.google.android.exoplayer2.util.a.g(decoderInputBuffer.f44488e);
        return true;
    }

    public void o(DecoderInputBuffer decoderInputBuffer) {
        int iPosition;
        int iRemaining;
        com.google.android.exoplayer2.util.a.j(!this.f50214g, "Input buffer can not be queued after the input stream has ended.");
        ByteBuffer byteBuffer = decoderInputBuffer.f44488e;
        int i10 = 0;
        if (byteBuffer == null || !byteBuffer.hasRemaining()) {
            iPosition = 0;
            iRemaining = 0;
        } else {
            iPosition = decoderInputBuffer.f44488e.position();
            iRemaining = decoderInputBuffer.f44488e.remaining();
        }
        if (decoderInputBuffer.k()) {
            this.f50214g = true;
            i10 = 4;
        }
        this.f50209b.queueInputBuffer(this.f50212e, iPosition, iRemaining, decoderInputBuffer.f44490g, i10);
        this.f50212e = -1;
        decoderInputBuffer.f44488e = null;
    }

    public void p() {
        this.f50211d = null;
        this.f50209b.release();
    }

    public void q() {
        r(false);
    }

    public void r(boolean z10) {
        this.f50211d = null;
        this.f50209b.releaseOutputBuffer(this.f50213f, z10);
        this.f50213f = -1;
    }

    @w0(18)
    public void s() {
        this.f50209b.i();
    }
}
