plugins {
    id(ThunderbirdPlugins.Library.android)
    id("org.jetbrains.kotlin.android")
}

dependencies {
    implementation(projects.app.core)

    api(libs.junit)
    api(libs.robolectric)
    api(libs.koin.core)
    api(libs.mockito.core)
    api(libs.mockito.kotlin)
    implementation("androidx.core:core-ktx:1.10.0")
}

android {
    namespace = "com.fsck.k9.testing"
}
