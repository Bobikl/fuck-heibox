package anet.channel;

import android.text.TextUtils;
import anet.channel.entity.ENV;
import anet.channel.security.ISecurity;
import anet.channel.util.ALog;
import anet.channel.util.StringUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public final class Config {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f29518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f29519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ENV f29520d = ENV.ONLINE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ISecurity f29521e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<String, Config> f29517a = new HashMap();
    public static final Config DEFAULT_CONFIG = new Builder().setTag("[default]").setAppkey("[default]").setEnv(ENV.ONLINE).build();

    /* JADX INFO: compiled from: Taobao */
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f29522a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f29523b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ENV f29524c = ENV.ONLINE;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f29525d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f29526e;

        public Config build() {
            if (TextUtils.isEmpty(this.f29523b)) {
                throw new RuntimeException("appkey can not be null or empty!");
            }
            synchronized (Config.f29517a) {
                for (Config config : Config.f29517a.values()) {
                    if (config.f29520d == this.f29524c && config.f29519c.equals(this.f29523b)) {
                        ALog.w("awcn.Config", "duplicated config exist!", null, "appkey", this.f29523b, "env", this.f29524c);
                        if (!TextUtils.isEmpty(this.f29522a)) {
                            Config.f29517a.put(this.f29522a, config);
                        }
                        return config;
                    }
                }
                Config config2 = new Config();
                config2.f29519c = this.f29523b;
                config2.f29520d = this.f29524c;
                if (TextUtils.isEmpty(this.f29522a)) {
                    config2.f29518b = StringUtils.concatString(this.f29523b, "$", this.f29524c.toString());
                } else {
                    config2.f29518b = this.f29522a;
                }
                if (TextUtils.isEmpty(this.f29526e)) {
                    config2.f29521e = anet.channel.security.c.a().createSecurity(this.f29525d);
                } else {
                    config2.f29521e = anet.channel.security.c.a().createNonSecurity(this.f29526e);
                }
                synchronized (Config.f29517a) {
                    Config.f29517a.put(config2.f29518b, config2);
                }
                return config2;
            }
        }

        public Builder setAppSecret(String str) {
            this.f29526e = str;
            return this;
        }

        public Builder setAppkey(String str) {
            this.f29523b = str;
            return this;
        }

        public Builder setAuthCode(String str) {
            this.f29525d = str;
            return this;
        }

        public Builder setEnv(ENV env) {
            this.f29524c = env;
            return this;
        }

        public Builder setTag(String str) {
            this.f29522a = str;
            return this;
        }
    }

    protected Config() {
    }

    public static Config getConfig(String str, ENV env) {
        synchronized (f29517a) {
            for (Config config : f29517a.values()) {
                if (config.f29520d == env && config.f29519c.equals(str)) {
                    return config;
                }
            }
            return null;
        }
    }

    public static Config getConfigByTag(String str) {
        Config config;
        synchronized (f29517a) {
            config = f29517a.get(str);
        }
        return config;
    }

    public String getAppkey() {
        return this.f29519c;
    }

    public ENV getEnv() {
        return this.f29520d;
    }

    public ISecurity getSecurity() {
        return this.f29521e;
    }

    public String getTag() {
        return this.f29518b;
    }

    public String toString() {
        return this.f29518b;
    }
}
