package sg;

import android.content.Context;
import com.ss.android.ttvecamera.TEVBoostInterface;

/* JADX INFO: compiled from: TEVBoostStrategy.java */
/* JADX INFO: loaded from: classes9.dex */
public class b implements a {
    @Override // sg.a
    public void a() {
        TEVBoostInterface.VBoostCapabilityType vBoostCapabilityType = TEVBoostInterface.VBoostCapabilityType.CPU_FREQ_MIN;
        if (TEVBoostInterface.d(vBoostCapabilityType)) {
            TEVBoostInterface.a(vBoostCapabilityType);
        }
        TEVBoostInterface.VBoostCapabilityType vBoostCapabilityType2 = TEVBoostInterface.VBoostCapabilityType.CPU_FREQ_MAX;
        if (TEVBoostInterface.d(vBoostCapabilityType2)) {
            TEVBoostInterface.a(vBoostCapabilityType2);
        }
    }

    @Override // sg.a
    public void b(int i10) {
        TEVBoostInterface.VBoostCapabilityType vBoostCapabilityType = TEVBoostInterface.VBoostCapabilityType.CPU_FREQ_MIN;
        if (TEVBoostInterface.d(vBoostCapabilityType)) {
            TEVBoostInterface.i(vBoostCapabilityType, 9, i10);
        }
        TEVBoostInterface.VBoostCapabilityType vBoostCapabilityType2 = TEVBoostInterface.VBoostCapabilityType.CPU_FREQ_MAX;
        if (TEVBoostInterface.d(vBoostCapabilityType2)) {
            TEVBoostInterface.i(vBoostCapabilityType2, 9, i10);
        }
    }

    @Override // sg.a
    public void init(Context context) {
        TEVBoostInterface.c(context);
    }
}
