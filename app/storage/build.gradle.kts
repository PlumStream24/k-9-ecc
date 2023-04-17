plugins {
    id(ThunderbirdPlugins.Library.android)
    id("org.jetbrains.kotlin.android")
}

dependencies {
    api(libs.koin.core)

    implementation(projects.app.core)
    implementation(libs.androidx.core.ktx)
    implementation(libs.timber)
    implementation(libs.mime4j.core)
    implementation(libs.commons.io)
    implementation(libs.moshi)
    implementation("androidx.core:core-ktx:1.10.0")

    testImplementation(projects.mail.testing)
    testImplementation(projects.app.testing)
    testImplementation(libs.robolectric)
    testImplementation(libs.commons.io)
}

android {
    namespace = "com.fsck.k9.storage"
}
