package com.sankuai.waimai.router.fragment;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.n0;
import com.sankuai.waimai.router.core.i;
import java.io.Serializable;

/* JADX INFO: compiled from: AbsFragmentUriRequest.java */
/* JADX INFO: loaded from: classes8.dex */
public abstract class b extends i {
    public b(@n0 Context context, String str) {
        super(context, str);
    }

    @n0
    private synchronized Bundle C() {
        Bundle bundle;
        bundle = (Bundle) e(Bundle.class, com.sankuai.waimai.router.components.a.f96452b, null);
        if (bundle == null) {
            bundle = new Bundle();
            s(com.sankuai.waimai.router.components.a.f96452b, bundle);
        }
        return bundle;
    }

    @Override // com.sankuai.waimai.router.core.i
    public void A() {
        s(f.f96530a, D());
        super.A();
    }

    protected abstract f D();

    public b E(String str, Bundle bundle) {
        C().putBundle(str, bundle);
        return this;
    }

    public b F(String str, Serializable serializable) {
        C().putSerializable(str, serializable);
        return this;
    }

    public b G(String str, byte[] bArr) {
        C().putByteArray(str, bArr);
        return this;
    }

    public b H(String str, char[] cArr) {
        C().putCharArray(str, cArr);
        return this;
    }

    public b I(String str, double[] dArr) {
        C().putDoubleArray(str, dArr);
        return this;
    }

    public b J(String str, float[] fArr) {
        C().putFloatArray(str, fArr);
        return this;
    }

    public b K(String str, int[] iArr) {
        C().putIntArray(str, iArr);
        return this;
    }

    public b L(String str, long[] jArr) {
        C().putLongArray(str, jArr);
        return this;
    }

    public b M(String str, CharSequence[] charSequenceArr) {
        C().putCharSequenceArray(str, charSequenceArr);
        return this;
    }

    public b N(String str, String[] strArr) {
        C().putStringArray(str, strArr);
        return this;
    }

    public b O(String str, short[] sArr) {
        C().putShortArray(str, sArr);
        return this;
    }

    public b P(String str, boolean[] zArr) {
        C().putBooleanArray(str, zArr);
        return this;
    }

    public b Q(Bundle bundle) {
        if (bundle != null) {
            C().putAll(bundle);
        }
        return this;
    }
}
