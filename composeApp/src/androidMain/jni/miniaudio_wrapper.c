// miniaudio_wrapper.c

#include <jni.h>
#include "miniaudio.h"   // your copied header

static ma_engine g_engine;
static jboolean g_initialized = JNI_FALSE;

JNIEXPORT jint JNICALL
Java_org_example_project_AudioEngineNative_initEngine(JNIEnv* env, jobject thiz) {
    if (g_initialized) return 0;

    ma_result result;
    ma_engine_config config;
    ma_engine_config_init(&config);
    config.sampleRate = 44100;
    config.channels   = 2;
    // config.periodSizeInMilliseconds = 5;  // low latency if needed

    result = ma_engine_init(&config, &g_engine);
    if (result != MA_SUCCESS) {
        return (jint)result;  // return error code
    }

    g_initialized = JNI_TRUE;
    return MA_SUCCESS;
}

JNIEXPORT void JNICALL
Java_org_example_project_AudioEngineNative_playAsset(JNIEnv* env, jobject thiz, jstring assetPath) {
if (!g_initialized) return;

const char* path = (*env)->GetStringUTFChars(env, assetPath, NULL);
ma_engine_play_sound(&g_engine, path, NULL);
(*env)->ReleaseStringUTFChars(env, assetPath, path);
}

JNIEXPORT void JNICALL
Java_org_example_project_AudioEngineNative_setVolume(JNIEnv* env, jobject thiz, jfloat volume) {
if (g_initialized) {
ma_engine_set_volume(&g_engine, volume);
}
}

JNIEXPORT void JNICALL
Java_org_example_project_AudioEngineNative_stopAll(JNIEnv* env, jobject thiz) {
if (g_initialized) {
ma_engine_stop(&g_engine);
}
}

JNIEXPORT void JNICALL
Java_org_example_project_AudioEngineNative_disposeEngine(JNIEnv* env, jobject thiz) {
if (g_initialized) {
ma_engine_uninit(&g_engine);
g_initialized = JNI_FALSE;
}
}