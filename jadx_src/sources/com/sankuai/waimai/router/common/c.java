package com.sankuai.waimai.router.common;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.n0;
import androidx.annotation.w0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: DefaultUriRequest.java */
/* JADX INFO: loaded from: classes8.dex */
public class c extends com.sankuai.waimai.router.core.i {
    public c(@n0 Context context, @n0 Uri uri) {
        super(context, uri);
    }

    public c(@n0 Context context, @n0 String str) {
        super(context, str);
    }

    public c(@n0 Context context, @n0 String str, HashMap<String, Object> map) {
        super(context, str, map);
    }

    @n0
    private synchronized Bundle E() {
        Bundle bundle;
        bundle = (Bundle) e(Bundle.class, com.sankuai.waimai.router.components.a.f96452b, null);
        if (bundle == null) {
            bundle = new Bundle();
            s(com.sankuai.waimai.router.components.a.f96452b, bundle);
        }
        return bundle;
    }

    public static void s0(Activity activity, com.sankuai.waimai.router.core.d dVar) {
        if (activity == null) {
            return;
        }
        Intent intent = activity.getIntent();
        if (intent == null) {
            activity.finish();
            return;
        }
        Uri data = intent.getData();
        if (data == null) {
            activity.finish();
        } else {
            new c(activity, data).F(1).t0(false).q(dVar).i0(intent.getExtras()).A();
        }
    }

    public c C(int i10) {
        s(com.sankuai.waimai.router.components.a.f96453c, Integer.valueOf(i10));
        return this;
    }

    public c D(HashMap<String, String> map) {
        s(p.f96449a, map);
        return this;
    }

    public c F(int i10) {
        s("com.sankuai.waimai.router.from", Integer.valueOf(i10));
        return this;
    }

    public c G(boolean z10) {
        s(com.sankuai.waimai.router.components.a.f96457g, Boolean.valueOf(z10));
        return this;
    }

    @Override // com.sankuai.waimai.router.core.i
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public c q(com.sankuai.waimai.router.core.d dVar) {
        return (c) super.q(dVar);
    }

    public c I(int i10, int i11) {
        s(com.sankuai.waimai.router.components.a.f96454d, new int[]{i10, i11});
        return this;
    }

    public c J(com.sankuai.waimai.router.activity.d dVar) {
        s(com.sankuai.waimai.router.components.a.f96458h, dVar);
        return this;
    }

    public c K(String str, byte b10) {
        E().putByte(str, b10);
        return this;
    }

    public c L(String str, char c10) {
        E().putChar(str, c10);
        return this;
    }

    public c M(String str, double d10) {
        E().putDouble(str, d10);
        return this;
    }

    public c N(String str, float f10) {
        E().putFloat(str, f10);
        return this;
    }

    public c O(String str, int i10) {
        E().putInt(str, i10);
        return this;
    }

    public c P(String str, long j10) {
        E().putLong(str, j10);
        return this;
    }

    public c Q(String str, Bundle bundle) {
        E().putBundle(str, bundle);
        return this;
    }

    public c R(String str, Parcelable parcelable) {
        E().putParcelable(str, parcelable);
        return this;
    }

    public c S(String str, Serializable serializable) {
        E().putSerializable(str, serializable);
        return this;
    }

    public c T(String str, CharSequence charSequence) {
        E().putCharSequence(str, charSequence);
        return this;
    }

    public c U(String str, String str2) {
        E().putString(str, str2);
        return this;
    }

    public c V(String str, short s10) {
        E().putShort(str, s10);
        return this;
    }

    public c W(String str, boolean z10) {
        E().putBoolean(str, z10);
        return this;
    }

    public c X(String str, byte[] bArr) {
        E().putByteArray(str, bArr);
        return this;
    }

    public c Y(String str, char[] cArr) {
        E().putCharArray(str, cArr);
        return this;
    }

    public c Z(String str, double[] dArr) {
        E().putDoubleArray(str, dArr);
        return this;
    }

    public c a0(String str, float[] fArr) {
        E().putFloatArray(str, fArr);
        return this;
    }

    public c b0(String str, int[] iArr) {
        E().putIntArray(str, iArr);
        return this;
    }

    public c c0(String str, long[] jArr) {
        E().putLongArray(str, jArr);
        return this;
    }

    public c d0(String str, Parcelable[] parcelableArr) {
        E().putParcelableArray(str, parcelableArr);
        return this;
    }

    public c e0(String str, CharSequence[] charSequenceArr) {
        E().putCharSequenceArray(str, charSequenceArr);
        return this;
    }

    public c f0(String str, String[] strArr) {
        E().putStringArray(str, strArr);
        return this;
    }

    public c g0(String str, short[] sArr) {
        E().putShortArray(str, sArr);
        return this;
    }

    public c h0(String str, boolean[] zArr) {
        E().putBooleanArray(str, zArr);
        return this;
    }

    public c i0(Bundle bundle) {
        if (bundle != null) {
            E().putAll(bundle);
        }
        return this;
    }

    public c j0(String str, ArrayList<CharSequence> arrayList) {
        E().putCharSequenceArrayList(str, arrayList);
        return this;
    }

    public c k0(String str, ArrayList<Integer> arrayList) {
        E().putIntegerArrayList(str, arrayList);
        return this;
    }

    public c l0(String str, ArrayList<? extends Parcelable> arrayList) {
        E().putParcelableArrayList(str, arrayList);
        return this;
    }

    public c m0(String str, ArrayList<String> arrayList) {
        E().putStringArrayList(str, arrayList);
        return this;
    }

    @w0(16)
    public c n0(androidx.core.app.i iVar) {
        if (iVar != null) {
            s(com.sankuai.waimai.router.components.a.f96455e, iVar.l());
        }
        return this;
    }

    @Override // com.sankuai.waimai.router.core.i
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public c w(String str) {
        return (c) super.w(str);
    }

    public c p0(int i10) {
        s(com.sankuai.waimai.router.components.a.f96456f, Integer.valueOf(i10));
        return this;
    }

    @Override // com.sankuai.waimai.router.core.i
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public c x(int i10) {
        return (c) super.x(i10);
    }

    @Override // com.sankuai.waimai.router.core.i
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public c z() {
        return (c) super.z();
    }

    public c t0(boolean z10) {
        s(n.f96442b, Boolean.valueOf(z10));
        return this;
    }
}
