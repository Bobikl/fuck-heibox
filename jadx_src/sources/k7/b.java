package k7;

import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public abstract class b {
    public int errorCode;
    public String errorMsg;
    public Bundle extras;

    public boolean checkArgs() {
        return true;
    }

    public void fromBundle(Bundle bundle) {
        this.errorCode = bundle.getInt(i7.a.b.f119254c);
        this.errorMsg = bundle.getString(i7.a.b.f119255d);
        this.extras = bundle.getBundle(i7.a.b.f119253b);
    }

    public abstract int getType();

    public boolean isCancel() {
        return this.errorCode == -2;
    }

    public boolean isSuccess() {
        return this.errorCode == 0;
    }

    public void toBundle(Bundle bundle) {
        bundle.putInt(i7.a.b.f119254c, this.errorCode);
        bundle.putString(i7.a.b.f119255d, this.errorMsg);
        bundle.putInt(i7.a.b.f119252a, getType());
        bundle.putBundle(i7.a.b.f119253b, this.extras);
    }
}
