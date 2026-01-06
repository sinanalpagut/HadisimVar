package com.sinan.hadisimvar;

import android.app.Application;

public class HadisApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // Bildirim kanallarını oluştur
        com.sinan.hadisimvar.utils.NotificationHelper.createNotificationChannels(this);

        // Günlük Hadis Worker'ını başlat (Günde bir kez)
        // Constraints eklenebilir (örneğin sadece şarjdayken vb. ama gerek yok)
        androidx.work.PeriodicWorkRequest saveRequest = new androidx.work.PeriodicWorkRequest.Builder(
                com.sinan.hadisimvar.workers.DailyHadithWorker.class, 24, java.util.concurrent.TimeUnit.HOURS)
                .build();

        androidx.work.WorkManager.getInstance(this).enqueueUniquePeriodicWork(
                "DailyHadithWork",
                androidx.work.ExistingPeriodicWorkPolicy.KEEP,
                saveRequest);
    }
}
