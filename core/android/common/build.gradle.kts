plugins {
    id(ThunderbirdPlugins.Library.android)
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "app.k9mail.core.android.common"
}

dependencies {
    api(projects.core.common)
    implementation("androidx.core:core-ktx:1.10.0")
    testImplementation(projects.core.testing)
    testImplementation(libs.robolectric)
}
