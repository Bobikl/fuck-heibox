package k7;

import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a {
    public String callerLocalEntry;
    public String callerPackage;
    public String callerVersion;
    public Bundle extras;

    public boolean checkArgs() {
        return true;
    }

    public void fromBundle(Bundle bundle) {
        this.callerPackage = bundle.getString(i7.a.b.f119257f);
        this.callerVersion = bundle.getString(i7.a.b.f119258g);
        this.extras = bundle.getBundle(i7.a.b.f119253b);
        this.callerLocalEntry = bundle.getString(i7.a.b.f119256e);
    }

    public String getCallerLocalEntry() {
        return this.callerLocalEntry;
    }

    public String getCallerPackage() {
        return this.callerPackage;
    }

    public String getCallerVersion() {
        return this.callerVersion;
    }

    public abstract int getType();

    public void toBundle(Bundle bundle) {
        bundle.putInt(i7.a.b.f119252a, getType());
        bundle.putBundle(i7.a.b.f119253b, this.extras);
        bundle.putString(i7.a.b.f119256e, this.callerLocalEntry);
        bundle.putString(i7.a.b.f119261j, o7.a.f132217d);
        bundle.putString(i7.a.b.f119262k, "0.1.9.0");
    }
}
