package com.google.common.hash;

import com.google.common.base.w;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: AbstractCompositeHashFunction.java */
/* JADX INFO: loaded from: classes7.dex */
@h
@s9.j
public abstract class b extends c {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final k[] f58558b;

    /* JADX INFO: compiled from: AbstractCompositeHashFunction.java */
    public class a implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ m[] f58559a;

        a(m[] mVarArr) {
            this.f58559a = mVarArr;
        }

        @Override // com.google.common.hash.m, com.google.common.hash.u
        public m a(float f10) {
            for (m mVar : this.f58559a) {
                mVar.a(f10);
            }
            return this;
        }

        @Override // com.google.common.hash.m, com.google.common.hash.u
        public m b(byte b10) {
            for (m mVar : this.f58559a) {
                mVar.b(b10);
            }
            return this;
        }

        @Override // com.google.common.hash.m, com.google.common.hash.u
        public m c(int i10) {
            for (m mVar : this.f58559a) {
                mVar.c(i10);
            }
            return this;
        }

        @Override // com.google.common.hash.m, com.google.common.hash.u
        public m d(long j10) {
            for (m mVar : this.f58559a) {
                mVar.d(j10);
            }
            return this;
        }

        @Override // com.google.common.hash.m, com.google.common.hash.u
        public m e(byte[] bArr) {
            for (m mVar : this.f58559a) {
                mVar.e(bArr);
            }
            return this;
        }

        @Override // com.google.common.hash.m, com.google.common.hash.u
        public m f(double d10) {
            for (m mVar : this.f58559a) {
                mVar.f(d10);
            }
            return this;
        }

        @Override // com.google.common.hash.m, com.google.common.hash.u
        public m g(short s10) {
            for (m mVar : this.f58559a) {
                mVar.g(s10);
            }
            return this;
        }

        @Override // com.google.common.hash.m, com.google.common.hash.u
        public m h(boolean z10) {
            for (m mVar : this.f58559a) {
                mVar.h(z10);
            }
            return this;
        }

        @Override // com.google.common.hash.m, com.google.common.hash.u
        public m i(char c10) {
            for (m mVar : this.f58559a) {
                mVar.i(c10);
            }
            return this;
        }

        @Override // com.google.common.hash.m, com.google.common.hash.u
        public m j(CharSequence charSequence) {
            for (m mVar : this.f58559a) {
                mVar.j(charSequence);
            }
            return this;
        }

        @Override // com.google.common.hash.m, com.google.common.hash.u
        public m k(byte[] bArr, int i10, int i11) {
            for (m mVar : this.f58559a) {
                mVar.k(bArr, i10, i11);
            }
            return this;
        }

        @Override // com.google.common.hash.m, com.google.common.hash.u
        public m l(ByteBuffer byteBuffer) {
            int iPosition = byteBuffer.position();
            for (m mVar : this.f58559a) {
                q.d(byteBuffer, iPosition);
                mVar.l(byteBuffer);
            }
            return this;
        }

        @Override // com.google.common.hash.m, com.google.common.hash.u
        public m m(CharSequence charSequence, Charset charset) {
            for (m mVar : this.f58559a) {
                mVar.m(charSequence, charset);
            }
            return this;
        }

        @Override // com.google.common.hash.m
        public HashCode n() {
            return b.this.m(this.f58559a);
        }

        @Override // com.google.common.hash.m
        public <T> m o(@t T t10, Funnel<? super T> funnel) {
            for (m mVar : this.f58559a) {
                mVar.o(t10, funnel);
            }
            return this;
        }
    }

    b(k... kVarArr) {
        for (k kVar : kVarArr) {
            w.E(kVar);
        }
        this.f58558b = kVarArr;
    }

    private m l(m[] mVarArr) {
        return new a(mVarArr);
    }

    @Override // com.google.common.hash.c, com.google.common.hash.k
    public m a(int i10) {
        w.d(i10 >= 0);
        int length = this.f58558b.length;
        m[] mVarArr = new m[length];
        for (int i11 = 0; i11 < length; i11++) {
            mVarArr[i11] = this.f58558b[i11].a(i10);
        }
        return l(mVarArr);
    }

    @Override // com.google.common.hash.k
    public m i() {
        int length = this.f58558b.length;
        m[] mVarArr = new m[length];
        for (int i10 = 0; i10 < length; i10++) {
            mVarArr[i10] = this.f58558b[i10].i();
        }
        return l(mVarArr);
    }

    abstract HashCode m(m[] mVarArr);
}
