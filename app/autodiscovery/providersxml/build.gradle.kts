plugins {
    id(ThunderbirdPlugins.Library.android)
    id("org.jetbrains.kotlin.android")
}

dependencies {
    implementation(projects.app.core)
    implementation(projects.mail.common)
    implementation(projects.app.autodiscovery.api)

    implementation(libs.timber)
    implementation("androidx.core:core-ktx:1.10.0")

    testImplementation(projects.app.testing)
    testImplementation(projects.backend.imap)
    testImplementation(libs.robolectric)
    testImplementation(libs.androidx.test.core)
}

android {
    namespace = "com.fsck.k9.autodiscovery.providersxml"
}
