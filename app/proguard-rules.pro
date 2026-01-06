# ═══════════════════════════════════════════════════════════════════
# ProGuard Kuralları - HadisimVar
# ═══════════════════════════════════════════════════════════════════

# ─────────────────────────────────────────────────────────────────────
# GENEL AYARLAR
# ─────────────────────────────────────────────────────────────────────
-keepattributes Signature
-keepattributes *Annotation*
-keepattributes SourceFile,LineNumberTable
-keepattributes Exceptions

# ─────────────────────────────────────────────────────────────────────
# RETROFIT
# ─────────────────────────────────────────────────────────────────────
-dontwarn retrofit2.**
-keep class retrofit2.** { *; }
-keepclasseswithmembers class * {
    @retrofit2.http.* <methods>;
}

# ─────────────────────────────────────────────────────────────────────
# GSON
# ─────────────────────────────────────────────────────────────────────
-keepattributes EnclosingMethod
-keep class sun.misc.Unsafe { *; }
-keep class com.google.gson.stream.** { *; }

# Uygulama model sınıfları - GSON için
-keep class com.sinan.hadisimvar.data.model.** { *; }
-keep class com.sinan.hadisimvar.data.remote.** { *; }

# ─────────────────────────────────────────────────────────────────────
# ROOM DATABASE
# ─────────────────────────────────────────────────────────────────────
-keep class * extends androidx.room.RoomDatabase
-keep @androidx.room.Entity class *
-dontwarn androidx.room.paging.**

# ─────────────────────────────────────────────────────────────────────
# ANDROIDX & MATERIAL
# ─────────────────────────────────────────────────────────────────────
-keep class com.google.android.material.** { *; }
-dontwarn com.google.android.material.**
-dontnote com.google.android.material.**

-keep class androidx.** { *; }
-keep interface androidx.** { *; }

# ─────────────────────────────────────────────────────────────────────
# OKHTTP
# ─────────────────────────────────────────────────────────────────────
-dontwarn okhttp3.**
-dontwarn okio.**
-keep class okhttp3.** { *; }
-keep interface okhttp3.** { *; }

# ─────────────────────────────────────────────────────────────────────
# UYGULAMA SINIFLARINI KORU
# ─────────────────────────────────────────────────────────────────────
-keep class com.sinan.hadisimvar.HadisApp { *; }
-keep class com.sinan.hadisimvar.widget.** { *; }
-keep class com.sinan.hadisimvar.ads.** { *; }

# ─────────────────────────────────────────────────────────────────────
# GOOGLE ADMOB
# ─────────────────────────────────────────────────────────────────────
-keep class com.google.android.gms.ads.** { *; }
-dontwarn com.google.android.gms.ads.**

# ─────────────────────────────────────────────────────────────────────
# HATA AYIKLAMA İÇİN
# ─────────────────────────────────────────────────────────────────────
-renamesourcefileattribute SourceFile
