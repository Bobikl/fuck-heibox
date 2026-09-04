package com.bun.miitmdid.pojo;

import android.app.Activity;
import com.bun.miitmdid.interfaces.IdSupplier;

/* JADX INFO: loaded from: classes6.dex */
public class IdSupplierImpl implements IdSupplier {
    private final String AAID;
    private final String OAID;
    private final String VAID;
    private final boolean isLimited;
    private final boolean isSupportRequestOAIDPermission;
    private final boolean isSupported;

    public IdSupplierImpl() {
        this.OAID = "";
        this.VAID = "";
        this.AAID = "";
        this.isSupported = false;
        this.isLimited = false;
        this.isSupportRequestOAIDPermission = false;
    }

    public IdSupplierImpl(String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        this.OAID = str;
        this.VAID = str2;
        this.AAID = str3;
        this.isSupported = z10;
        this.isLimited = z11;
        this.isSupportRequestOAIDPermission = z12;
    }

    @Override // com.bun.miitmdid.interfaces.IdSupplier
    public String getAAID() {
        return this.AAID;
    }

    @Override // com.bun.miitmdid.interfaces.IdSupplier
    public String getOAID() {
        return this.OAID;
    }

    @Override // com.bun.miitmdid.interfaces.IdSupplier
    public String getVAID() {
        return this.VAID;
    }

    @Override // com.bun.miitmdid.interfaces.IdSupplier
    public boolean isLimited() {
        return this.isLimited;
    }

    @Override // com.bun.miitmdid.interfaces.IdSupplier
    public boolean isSupportRequestOAIDPermission() {
        return this.isSupportRequestOAIDPermission;
    }

    @Override // com.bun.miitmdid.interfaces.IdSupplier
    public boolean isSupported() {
        return this.isSupported;
    }

    @Override // com.bun.miitmdid.interfaces.IdSupplier
    public void requestOAIDPermission(Activity activity, int i10) {
    }
}
