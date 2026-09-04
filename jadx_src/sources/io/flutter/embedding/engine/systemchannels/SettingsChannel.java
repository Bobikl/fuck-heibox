package io.flutter.embedding.engine.systemchannels;

import android.annotation.SuppressLint;
import android.os.Build;
import android.util.DisplayMetrics;
import androidx.annotation.i1;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.max.xiaoheihe.accelworld.AccelWorldLottieKt;
import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.JSONMessageCodec;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes4.dex */
public class SettingsChannel {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String ALWAYS_USE_24_HOUR_FORMAT = "alwaysUse24HourFormat";
    private static final String BRIEFLY_SHOW_PASSWORD = "brieflyShowPassword";
    public static final String CHANNEL_NAME = "flutter/settings";
    private static final String CONFIGURATION_ID = "configurationId";
    private static final ConfigurationQueue CONFIGURATION_QUEUE = new ConfigurationQueue();
    private static final String NATIVE_SPELL_CHECK_SERVICE_DEFINED = "nativeSpellCheckServiceDefined";
    private static final String PLATFORM_BRIGHTNESS = "platformBrightness";
    private static final String TAG = "SettingsChannel";
    private static final String TEXT_SCALE_FACTOR = "textScaleFactor";

    @n0
    public final BasicMessageChannel<Object> channel;

    @j1
    public static class ConfigurationQueue {
        private SentConfiguration currentConfiguration;
        private SentConfiguration previousEnqueuedConfiguration;
        private final ConcurrentLinkedQueue<SentConfiguration> sentQueue = new ConcurrentLinkedQueue<>();

        public static class SentConfiguration {
            private static int nextConfigGeneration = Integer.MIN_VALUE;

            @n0
            private final DisplayMetrics displayMetrics;

            @n0
            public final int generationNumber;

            public SentConfiguration(@n0 DisplayMetrics displayMetrics) {
                int i10 = nextConfigGeneration;
                nextConfigGeneration = i10 + 1;
                this.generationNumber = i10;
                this.displayMetrics = displayMetrics;
            }
        }

        @i1
        @p0
        public BasicMessageChannel.Reply enqueueConfiguration(SentConfiguration sentConfiguration) {
            this.sentQueue.add(sentConfiguration);
            final SentConfiguration sentConfiguration2 = this.previousEnqueuedConfiguration;
            this.previousEnqueuedConfiguration = sentConfiguration;
            if (sentConfiguration2 == null) {
                return null;
            }
            return new BasicMessageChannel.Reply() { // from class: io.flutter.embedding.engine.systemchannels.SettingsChannel.ConfigurationQueue.1
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                @i1
                public void reply(Object obj) {
                    ConfigurationQueue.this.sentQueue.remove(sentConfiguration2);
                    if (ConfigurationQueue.this.sentQueue.isEmpty()) {
                        return;
                    }
                    Log.e(SettingsChannel.TAG, "The queue becomes empty after removing config generation " + String.valueOf(sentConfiguration2.generationNumber));
                }
            };
        }

        public SentConfiguration getConfiguration(int i10) {
            SentConfiguration sentConfiguration;
            if (this.currentConfiguration == null) {
                this.currentConfiguration = this.sentQueue.poll();
            }
            while (true) {
                sentConfiguration = this.currentConfiguration;
                if (sentConfiguration == null || sentConfiguration.generationNumber >= i10) {
                    break;
                }
                this.currentConfiguration = this.sentQueue.poll();
            }
            if (sentConfiguration == null) {
                Log.e(SettingsChannel.TAG, "Cannot find config with generation: " + String.valueOf(i10) + ", after exhausting the queue.");
                return null;
            }
            if (sentConfiguration.generationNumber == i10) {
                return sentConfiguration;
            }
            Log.e(SettingsChannel.TAG, "Cannot find config with generation: " + String.valueOf(i10) + ", the oldest config is now: " + String.valueOf(this.currentConfiguration.generationNumber));
            return null;
        }
    }

    public static class MessageBuilder {

        @n0
        private final BasicMessageChannel<Object> channel;

        @p0
        private DisplayMetrics displayMetrics;

        @n0
        private Map<String, Object> message = new HashMap();

        MessageBuilder(@n0 BasicMessageChannel<Object> basicMessageChannel) {
            this.channel = basicMessageChannel;
        }

        public void send() {
            Log.v(SettingsChannel.TAG, "Sending message: \ntextScaleFactor: " + this.message.get(SettingsChannel.TEXT_SCALE_FACTOR) + "\nalwaysUse24HourFormat: " + this.message.get(SettingsChannel.ALWAYS_USE_24_HOUR_FORMAT) + "\nplatformBrightness: " + this.message.get(SettingsChannel.PLATFORM_BRIGHTNESS));
            DisplayMetrics displayMetrics = this.displayMetrics;
            if (!SettingsChannel.hasNonlinearTextScalingSupport() || displayMetrics == null) {
                this.channel.send(this.message);
                return;
            }
            ConfigurationQueue.SentConfiguration sentConfiguration = new ConfigurationQueue.SentConfiguration(displayMetrics);
            BasicMessageChannel.Reply<Object> replyEnqueueConfiguration = SettingsChannel.CONFIGURATION_QUEUE.enqueueConfiguration(sentConfiguration);
            this.message.put(SettingsChannel.CONFIGURATION_ID, Integer.valueOf(sentConfiguration.generationNumber));
            this.channel.send(this.message, replyEnqueueConfiguration);
        }

        @n0
        public MessageBuilder setBrieflyShowPassword(@n0 boolean z10) {
            this.message.put(SettingsChannel.BRIEFLY_SHOW_PASSWORD, Boolean.valueOf(z10));
            return this;
        }

        @n0
        public MessageBuilder setDisplayMetrics(@n0 DisplayMetrics displayMetrics) {
            this.displayMetrics = displayMetrics;
            return this;
        }

        @n0
        public MessageBuilder setNativeSpellCheckServiceDefined(boolean z10) {
            this.message.put(SettingsChannel.NATIVE_SPELL_CHECK_SERVICE_DEFINED, Boolean.valueOf(z10));
            return this;
        }

        @n0
        public MessageBuilder setPlatformBrightness(@n0 PlatformBrightness platformBrightness) {
            this.message.put(SettingsChannel.PLATFORM_BRIGHTNESS, platformBrightness.name);
            return this;
        }

        @n0
        public MessageBuilder setTextScaleFactor(float f10) {
            this.message.put(SettingsChannel.TEXT_SCALE_FACTOR, Float.valueOf(f10));
            return this;
        }

        @n0
        public MessageBuilder setUse24HourFormat(boolean z10) {
            this.message.put(SettingsChannel.ALWAYS_USE_24_HOUR_FORMAT, Boolean.valueOf(z10));
            return this;
        }
    }

    public enum PlatformBrightness {
        light(AccelWorldLottieKt.f76443a),
        dark("dark");


        @n0
        public String name;

        PlatformBrightness(String str) {
            this.name = str;
        }
    }

    public SettingsChannel(@n0 DartExecutor dartExecutor) {
        this.channel = new BasicMessageChannel<>(dartExecutor, CHANNEL_NAME, JSONMessageCodec.INSTANCE);
    }

    public static DisplayMetrics getPastDisplayMetrics(int i10) {
        ConfigurationQueue.SentConfiguration configuration = CONFIGURATION_QUEUE.getConfiguration(i10);
        if (configuration == null) {
            return null;
        }
        return configuration.displayMetrics;
    }

    @SuppressLint({"AnnotateVersionCheck"})
    public static boolean hasNonlinearTextScalingSupport() {
        return Build.VERSION.SDK_INT >= 34;
    }

    @n0
    public MessageBuilder startMessage() {
        return new MessageBuilder(this.channel);
    }
}
